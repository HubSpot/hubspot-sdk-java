// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.blogs.posts

import com.hubspot_sdk.api.core.AutoPagerAsync
import com.hubspot_sdk.api.core.PageAsync
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.Paging
import com.hubspot_sdk.api.services.async.cms.blogs.PostServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see PostServiceAsync.getPreviousVersions */
class PostGetPreviousVersionsPageAsync
private constructor(
    private val service: PostServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PostGetPreviousVersionsParams,
    private val response: CollectionResponseWithTotalVersionBlogPost,
) : PageAsync<VersionBlogPost> {

    /**
     * Delegates to [CollectionResponseWithTotalVersionBlogPost], but gracefully handles missing
     * data.
     *
     * @see CollectionResponseWithTotalVersionBlogPost.results
     */
    fun results(): List<VersionBlogPost> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalVersionBlogPost], but gracefully handles missing
     * data.
     *
     * @see CollectionResponseWithTotalVersionBlogPost.paging
     */
    fun paging(): Optional<Paging> = response._paging().getOptional("paging")

    override fun items(): List<VersionBlogPost> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): PostGetPreviousVersionsParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<PostGetPreviousVersionsPageAsync> =
        service.getPreviousVersions(nextPageParams())

    fun autoPager(): AutoPagerAsync<VersionBlogPost> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PostGetPreviousVersionsParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalVersionBlogPost = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PostGetPreviousVersionsPageAsync].
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

    /** A builder for [PostGetPreviousVersionsPageAsync]. */
    class Builder internal constructor() {

        private var service: PostServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PostGetPreviousVersionsParams? = null
        private var response: CollectionResponseWithTotalVersionBlogPost? = null

        @JvmSynthetic
        internal fun from(postGetPreviousVersionsPageAsync: PostGetPreviousVersionsPageAsync) =
            apply {
                service = postGetPreviousVersionsPageAsync.service
                streamHandlerExecutor = postGetPreviousVersionsPageAsync.streamHandlerExecutor
                params = postGetPreviousVersionsPageAsync.params
                response = postGetPreviousVersionsPageAsync.response
            }

        fun service(service: PostServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PostGetPreviousVersionsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalVersionBlogPost) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PostGetPreviousVersionsPageAsync].
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
        fun build(): PostGetPreviousVersionsPageAsync =
            PostGetPreviousVersionsPageAsync(
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

        return other is PostGetPreviousVersionsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "PostGetPreviousVersionsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
