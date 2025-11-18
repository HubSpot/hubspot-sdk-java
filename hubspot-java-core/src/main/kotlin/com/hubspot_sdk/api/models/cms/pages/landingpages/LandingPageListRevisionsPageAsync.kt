// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.pages.landingpages

import com.hubspot_sdk.api.core.AutoPagerAsync
import com.hubspot_sdk.api.core.PageAsync
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.Paging
import com.hubspot_sdk.api.models.cms.pages.CollectionResponseWithTotalVersionPage
import com.hubspot_sdk.api.models.cms.pages.VersionPage
import com.hubspot_sdk.api.services.async.cms.pages.LandingPageServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see LandingPageServiceAsync.listRevisions */
class LandingPageListRevisionsPageAsync
private constructor(
    private val service: LandingPageServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: LandingPageListRevisionsParams,
    private val response: CollectionResponseWithTotalVersionPage,
) : PageAsync<VersionPage> {

    /**
     * Delegates to [CollectionResponseWithTotalVersionPage], but gracefully handles missing data.
     *
     * @see CollectionResponseWithTotalVersionPage.results
     */
    fun results(): List<VersionPage> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalVersionPage], but gracefully handles missing data.
     *
     * @see CollectionResponseWithTotalVersionPage.paging
     */
    fun paging(): Optional<Paging> = response._paging().getOptional("paging")

    override fun items(): List<VersionPage> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): LandingPageListRevisionsParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<LandingPageListRevisionsPageAsync> =
        service.listRevisions(nextPageParams())

    fun autoPager(): AutoPagerAsync<VersionPage> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): LandingPageListRevisionsParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalVersionPage = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [LandingPageListRevisionsPageAsync].
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

    /** A builder for [LandingPageListRevisionsPageAsync]. */
    class Builder internal constructor() {

        private var service: LandingPageServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: LandingPageListRevisionsParams? = null
        private var response: CollectionResponseWithTotalVersionPage? = null

        @JvmSynthetic
        internal fun from(landingPageListRevisionsPageAsync: LandingPageListRevisionsPageAsync) =
            apply {
                service = landingPageListRevisionsPageAsync.service
                streamHandlerExecutor = landingPageListRevisionsPageAsync.streamHandlerExecutor
                params = landingPageListRevisionsPageAsync.params
                response = landingPageListRevisionsPageAsync.response
            }

        fun service(service: LandingPageServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: LandingPageListRevisionsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalVersionPage) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [LandingPageListRevisionsPageAsync].
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
        fun build(): LandingPageListRevisionsPageAsync =
            LandingPageListRevisionsPageAsync(
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

        return other is LandingPageListRevisionsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "LandingPageListRevisionsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
