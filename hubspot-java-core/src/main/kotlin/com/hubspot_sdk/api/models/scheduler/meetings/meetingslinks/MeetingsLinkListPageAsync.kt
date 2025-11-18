// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.scheduler.meetings.meetingslinks

import com.hubspot_sdk.api.core.AutoPagerAsync
import com.hubspot_sdk.api.core.PageAsync
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.scheduler.meetings.CollectionResponseWithTotalExternalLinkMetadataForwardPaging
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalLinkMetadata
import com.hubspot_sdk.api.services.async.scheduler.meetings.MeetingsLinkServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see MeetingsLinkServiceAsync.list */
class MeetingsLinkListPageAsync
private constructor(
    private val service: MeetingsLinkServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: MeetingsLinkListParams,
    private val response: CollectionResponseWithTotalExternalLinkMetadataForwardPaging,
) : PageAsync<ExternalLinkMetadata> {

    /**
     * Delegates to [CollectionResponseWithTotalExternalLinkMetadataForwardPaging], but gracefully
     * handles missing data.
     *
     * @see CollectionResponseWithTotalExternalLinkMetadataForwardPaging.results
     */
    fun results(): List<ExternalLinkMetadata> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalExternalLinkMetadataForwardPaging], but gracefully
     * handles missing data.
     *
     * @see CollectionResponseWithTotalExternalLinkMetadataForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<ExternalLinkMetadata> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): MeetingsLinkListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<MeetingsLinkListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ExternalLinkMetadata> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): MeetingsLinkListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalExternalLinkMetadataForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MeetingsLinkListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MeetingsLinkListPageAsync]. */
    class Builder internal constructor() {

        private var service: MeetingsLinkServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: MeetingsLinkListParams? = null
        private var response: CollectionResponseWithTotalExternalLinkMetadataForwardPaging? = null

        @JvmSynthetic
        internal fun from(meetingsLinkListPageAsync: MeetingsLinkListPageAsync) = apply {
            service = meetingsLinkListPageAsync.service
            streamHandlerExecutor = meetingsLinkListPageAsync.streamHandlerExecutor
            params = meetingsLinkListPageAsync.params
            response = meetingsLinkListPageAsync.response
        }

        fun service(service: MeetingsLinkServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: MeetingsLinkListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalExternalLinkMetadataForwardPaging) =
            apply {
                this.response = response
            }

        /**
         * Returns an immutable instance of [MeetingsLinkListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MeetingsLinkListPageAsync =
            MeetingsLinkListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MeetingsLinkListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "MeetingsLinkListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
