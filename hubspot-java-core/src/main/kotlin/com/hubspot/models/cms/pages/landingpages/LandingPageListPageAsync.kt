// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.pages.landingpages

import com.hubspot.core.AutoPagerAsync
import com.hubspot.core.PageAsync
import com.hubspot.core.checkRequired
import com.hubspot.models.ForwardPaging
import com.hubspot.models.cms.pages.CollectionResponseWithTotalPageForwardPaging
import com.hubspot.models.cms.pages.PageData
import com.hubspot.services.async.cms.pages.LandingPageServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see LandingPageServiceAsync.list */
class LandingPageListPageAsync
private constructor(
    private val service: LandingPageServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: LandingPageListParams,
    private val response: CollectionResponseWithTotalPageForwardPaging,
) : PageAsync<PageData> {

    /**
     * Delegates to [CollectionResponseWithTotalPageForwardPaging], but gracefully handles missing
     * data.
     *
     * @see CollectionResponseWithTotalPageForwardPaging.results
     */
    fun results(): List<PageData> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalPageForwardPaging], but gracefully handles missing
     * data.
     *
     * @see CollectionResponseWithTotalPageForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<PageData> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): LandingPageListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<LandingPageListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PageData> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): LandingPageListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalPageForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LandingPageListPageAsync].
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

    /** A builder for [LandingPageListPageAsync]. */
    class Builder internal constructor() {

        private var service: LandingPageServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: LandingPageListParams? = null
        private var response: CollectionResponseWithTotalPageForwardPaging? = null

        @JvmSynthetic
        internal fun from(landingPageListPageAsync: LandingPageListPageAsync) = apply {
            service = landingPageListPageAsync.service
            streamHandlerExecutor = landingPageListPageAsync.streamHandlerExecutor
            params = landingPageListPageAsync.params
            response = landingPageListPageAsync.response
        }

        fun service(service: LandingPageServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: LandingPageListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalPageForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [LandingPageListPageAsync].
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
        fun build(): LandingPageListPageAsync =
            LandingPageListPageAsync(
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

        return other is LandingPageListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "LandingPageListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
