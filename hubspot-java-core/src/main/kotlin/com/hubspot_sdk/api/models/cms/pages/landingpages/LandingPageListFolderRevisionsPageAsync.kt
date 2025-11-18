// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.pages.landingpages

import com.hubspot_sdk.api.core.AutoPagerAsync
import com.hubspot_sdk.api.core.PageAsync
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.Paging
import com.hubspot_sdk.api.models.cms.pages.CollectionResponseWithTotalVersionContentFolder
import com.hubspot_sdk.api.models.cms.pages.VersionContentFolder
import com.hubspot_sdk.api.services.async.cms.pages.LandingPageServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see LandingPageServiceAsync.listFolderRevisions */
class LandingPageListFolderRevisionsPageAsync
private constructor(
    private val service: LandingPageServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: LandingPageListFolderRevisionsParams,
    private val response: CollectionResponseWithTotalVersionContentFolder,
) : PageAsync<VersionContentFolder> {

    /**
     * Delegates to [CollectionResponseWithTotalVersionContentFolder], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseWithTotalVersionContentFolder.results
     */
    fun results(): List<VersionContentFolder> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalVersionContentFolder], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseWithTotalVersionContentFolder.paging
     */
    fun paging(): Optional<Paging> = response._paging().getOptional("paging")

    override fun items(): List<VersionContentFolder> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): LandingPageListFolderRevisionsParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<LandingPageListFolderRevisionsPageAsync> =
        service.listFolderRevisions(nextPageParams())

    fun autoPager(): AutoPagerAsync<VersionContentFolder> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): LandingPageListFolderRevisionsParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalVersionContentFolder = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [LandingPageListFolderRevisionsPageAsync].
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

    /** A builder for [LandingPageListFolderRevisionsPageAsync]. */
    class Builder internal constructor() {

        private var service: LandingPageServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: LandingPageListFolderRevisionsParams? = null
        private var response: CollectionResponseWithTotalVersionContentFolder? = null

        @JvmSynthetic
        internal fun from(
            landingPageListFolderRevisionsPageAsync: LandingPageListFolderRevisionsPageAsync
        ) = apply {
            service = landingPageListFolderRevisionsPageAsync.service
            streamHandlerExecutor = landingPageListFolderRevisionsPageAsync.streamHandlerExecutor
            params = landingPageListFolderRevisionsPageAsync.params
            response = landingPageListFolderRevisionsPageAsync.response
        }

        fun service(service: LandingPageServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: LandingPageListFolderRevisionsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalVersionContentFolder) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [LandingPageListFolderRevisionsPageAsync].
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
        fun build(): LandingPageListFolderRevisionsPageAsync =
            LandingPageListFolderRevisionsPageAsync(
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

        return other is LandingPageListFolderRevisionsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "LandingPageListFolderRevisionsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
