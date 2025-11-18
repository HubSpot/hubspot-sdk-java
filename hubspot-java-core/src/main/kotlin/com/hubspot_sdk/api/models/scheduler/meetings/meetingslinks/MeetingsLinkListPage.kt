// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.scheduler.meetings.meetingslinks

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.scheduler.meetings.CollectionResponseWithTotalExternalLinkMetadataForwardPaging
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalLinkMetadata
import com.hubspot_sdk.api.services.blocking.scheduler.meetings.MeetingsLinkService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see MeetingsLinkService.list */
class MeetingsLinkListPage
private constructor(
    private val service: MeetingsLinkService,
    private val params: MeetingsLinkListParams,
    private val response: CollectionResponseWithTotalExternalLinkMetadataForwardPaging,
) : Page<ExternalLinkMetadata> {

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

    override fun nextPage(): MeetingsLinkListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ExternalLinkMetadata> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): MeetingsLinkListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalExternalLinkMetadataForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MeetingsLinkListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MeetingsLinkListPage]. */
    class Builder internal constructor() {

        private var service: MeetingsLinkService? = null
        private var params: MeetingsLinkListParams? = null
        private var response: CollectionResponseWithTotalExternalLinkMetadataForwardPaging? = null

        @JvmSynthetic
        internal fun from(meetingsLinkListPage: MeetingsLinkListPage) = apply {
            service = meetingsLinkListPage.service
            params = meetingsLinkListPage.params
            response = meetingsLinkListPage.response
        }

        fun service(service: MeetingsLinkService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MeetingsLinkListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalExternalLinkMetadataForwardPaging) =
            apply {
                this.response = response
            }

        /**
         * Returns an immutable instance of [MeetingsLinkListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MeetingsLinkListPage =
            MeetingsLinkListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MeetingsLinkListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "MeetingsLinkListPage{service=$service, params=$params, response=$response}"
}
