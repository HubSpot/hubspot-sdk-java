// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.emails

import com.hubspot.sdk.core.AutoPagerAsync
import com.hubspot.sdk.core.PageAsync
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.models.Paging
import com.hubspot.sdk.services.async.marketing.EmailServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see EmailServiceAsync.list */
class EmailListPageAsync
private constructor(
    private val service: EmailServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: EmailListParams,
    private val response: CollectionResponseWithTotalPublicEmail,
) : PageAsync<PublicEmail> {

    /**
     * Delegates to [CollectionResponseWithTotalPublicEmail], but gracefully handles missing data.
     *
     * @see CollectionResponseWithTotalPublicEmail.results
     */
    fun results(): List<PublicEmail> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalPublicEmail], but gracefully handles missing data.
     *
     * @see CollectionResponseWithTotalPublicEmail.paging
     */
    fun paging(): Optional<Paging> = response._paging().getOptional("paging")

    override fun items(): List<PublicEmail> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): EmailListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<EmailListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PublicEmail> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): EmailListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalPublicEmail = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EmailListPageAsync].
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

    /** A builder for [EmailListPageAsync]. */
    class Builder internal constructor() {

        private var service: EmailServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: EmailListParams? = null
        private var response: CollectionResponseWithTotalPublicEmail? = null

        @JvmSynthetic
        internal fun from(emailListPageAsync: EmailListPageAsync) = apply {
            service = emailListPageAsync.service
            streamHandlerExecutor = emailListPageAsync.streamHandlerExecutor
            params = emailListPageAsync.params
            response = emailListPageAsync.response
        }

        fun service(service: EmailServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: EmailListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalPublicEmail) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [EmailListPageAsync].
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
        fun build(): EmailListPageAsync =
            EmailListPageAsync(
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

        return other is EmailListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "EmailListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
