// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.pages.landingpages

import com.hubspot_sdk.api.core.AutoPagerAsync
import com.hubspot_sdk.api.core.PageAsync
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.cms.pages.CollectionResponseWithTotalContentFolderForwardPaging
import com.hubspot_sdk.api.models.cms.pages.ContentFolder
import com.hubspot_sdk.api.services.async.cms.pages.LandingPageServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see LandingPageServiceAsync.listFolders */
class LandingPageListFoldersPageAsync
private constructor(
    private val service: LandingPageServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: LandingPageListFoldersParams,
    private val response: CollectionResponseWithTotalContentFolderForwardPaging,
) : PageAsync<ContentFolder> {

    /**
     * Delegates to [CollectionResponseWithTotalContentFolderForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseWithTotalContentFolderForwardPaging.results
     */
    fun results(): List<ContentFolder> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalContentFolderForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseWithTotalContentFolderForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<ContentFolder> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): LandingPageListFoldersParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<LandingPageListFoldersPageAsync> =
        service.listFolders(nextPageParams())

    fun autoPager(): AutoPagerAsync<ContentFolder> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): LandingPageListFoldersParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalContentFolderForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [LandingPageListFoldersPageAsync].
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

    /** A builder for [LandingPageListFoldersPageAsync]. */
    class Builder internal constructor() {

        private var service: LandingPageServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: LandingPageListFoldersParams? = null
        private var response: CollectionResponseWithTotalContentFolderForwardPaging? = null

        @JvmSynthetic
        internal fun from(landingPageListFoldersPageAsync: LandingPageListFoldersPageAsync) =
            apply {
                service = landingPageListFoldersPageAsync.service
                streamHandlerExecutor = landingPageListFoldersPageAsync.streamHandlerExecutor
                params = landingPageListFoldersPageAsync.params
                response = landingPageListFoldersPageAsync.response
            }

        fun service(service: LandingPageServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: LandingPageListFoldersParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalContentFolderForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [LandingPageListFoldersPageAsync].
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
        fun build(): LandingPageListFoldersPageAsync =
            LandingPageListFoldersPageAsync(
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

        return other is LandingPageListFoldersPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "LandingPageListFoldersPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
