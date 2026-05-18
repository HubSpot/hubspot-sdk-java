// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.pages.landingpages.revisions

import com.hubspot.sdk.core.AutoPagerAsync
import com.hubspot.sdk.core.PageAsync
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.models.Paging
import com.hubspot.sdk.models.cms.pages.CollectionResponseWithTotalPageVersion
import com.hubspot.sdk.models.cms.pages.PageVersion
import com.hubspot.sdk.services.async.cms.pages.landingpages.RevisionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see RevisionServiceAsync.listLandingPageRevisions */
class RevisionListLandingPageRevisionsPageAsync
private constructor(
    private val service: RevisionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: RevisionListLandingPageRevisionsParams,
    private val response: CollectionResponseWithTotalPageVersion,
) : PageAsync<PageVersion> {

    /**
     * Delegates to [CollectionResponseWithTotalPageVersion], but gracefully handles missing data.
     *
     * @see CollectionResponseWithTotalPageVersion.results
     */
    fun results(): List<PageVersion> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalPageVersion], but gracefully handles missing data.
     *
     * @see CollectionResponseWithTotalPageVersion.paging
     */
    fun paging(): Optional<Paging> = response._paging().getOptional("paging")

    override fun items(): List<PageVersion> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): RevisionListLandingPageRevisionsParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<RevisionListLandingPageRevisionsPageAsync> =
        service.listLandingPageRevisions(nextPageParams())

    fun autoPager(): AutoPagerAsync<PageVersion> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): RevisionListLandingPageRevisionsParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalPageVersion = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [RevisionListLandingPageRevisionsPageAsync].
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

    /** A builder for [RevisionListLandingPageRevisionsPageAsync]. */
    class Builder internal constructor() {

        private var service: RevisionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: RevisionListLandingPageRevisionsParams? = null
        private var response: CollectionResponseWithTotalPageVersion? = null

        @JvmSynthetic
        internal fun from(
            revisionListLandingPageRevisionsPageAsync: RevisionListLandingPageRevisionsPageAsync
        ) = apply {
            service = revisionListLandingPageRevisionsPageAsync.service
            streamHandlerExecutor = revisionListLandingPageRevisionsPageAsync.streamHandlerExecutor
            params = revisionListLandingPageRevisionsPageAsync.params
            response = revisionListLandingPageRevisionsPageAsync.response
        }

        fun service(service: RevisionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: RevisionListLandingPageRevisionsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalPageVersion) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [RevisionListLandingPageRevisionsPageAsync].
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
        fun build(): RevisionListLandingPageRevisionsPageAsync =
            RevisionListLandingPageRevisionsPageAsync(
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

        return other is RevisionListLandingPageRevisionsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "RevisionListLandingPageRevisionsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
