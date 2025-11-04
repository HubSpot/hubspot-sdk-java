// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.emails

import com.hubspot_sdk.api.core.AutoPagerAsync
import com.hubspot_sdk.api.core.PageAsync
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.services.async.marketing.EmailServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see EmailServiceAsync.listRevisions */
class EmailListRevisionsPageAsync
private constructor(
    private val service: EmailServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: EmailListRevisionsParams,
    private val response: CollectionResponseWithTotalVersionPublicEmail,
) : PageAsync<VersionPublicEmail> {

    /**
     * Delegates to [CollectionResponseWithTotalVersionPublicEmail], but gracefully handles missing
     * data.
     *
     * @see CollectionResponseWithTotalVersionPublicEmail.results
     */
    fun results(): List<VersionPublicEmail> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalVersionPublicEmail], but gracefully handles missing
     * data.
     *
     * @see CollectionResponseWithTotalVersionPublicEmail.paging
     */
    fun paging(): Optional<EmailsPaging> = response._paging().getOptional("paging")

    override fun items(): List<VersionPublicEmail> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                ._after()
                .getOptional("after")
                .isPresent

    fun nextPageParams(): EmailListRevisionsParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                ._after()
                .getOptional("after")
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<EmailListRevisionsPageAsync> =
        service.listRevisions(nextPageParams())

    fun autoPager(): AutoPagerAsync<VersionPublicEmail> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): EmailListRevisionsParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalVersionPublicEmail = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EmailListRevisionsPageAsync].
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

    /** A builder for [EmailListRevisionsPageAsync]. */
    class Builder internal constructor() {

        private var service: EmailServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: EmailListRevisionsParams? = null
        private var response: CollectionResponseWithTotalVersionPublicEmail? = null

        @JvmSynthetic
        internal fun from(emailListRevisionsPageAsync: EmailListRevisionsPageAsync) = apply {
            service = emailListRevisionsPageAsync.service
            streamHandlerExecutor = emailListRevisionsPageAsync.streamHandlerExecutor
            params = emailListRevisionsPageAsync.params
            response = emailListRevisionsPageAsync.response
        }

        fun service(service: EmailServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: EmailListRevisionsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalVersionPublicEmail) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [EmailListRevisionsPageAsync].
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
        fun build(): EmailListRevisionsPageAsync =
            EmailListRevisionsPageAsync(
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

        return other is EmailListRevisionsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "EmailListRevisionsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
