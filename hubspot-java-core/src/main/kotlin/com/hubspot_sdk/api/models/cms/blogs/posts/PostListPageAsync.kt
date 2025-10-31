// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.blogs.posts

import com.hubspot_sdk.api.core.AutoPagerAsync
import com.hubspot_sdk.api.core.PageAsync
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.services.async.cms.blogs.PostServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see PostServiceAsync.list */
class PostListPageAsync
private constructor(
    private val service: PostServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PostListParams,
    private val response: CollectionResponseWithTotalBlogPostForwardPaging,
) : PageAsync<BlogPost> {

    /**
     * Delegates to [CollectionResponseWithTotalBlogPostForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseWithTotalBlogPostForwardPaging.results
     */
    fun results(): List<BlogPost> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalBlogPostForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseWithTotalBlogPostForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<BlogPost> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): PostListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<PostListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<BlogPost> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PostListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalBlogPostForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PostListPageAsync].
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

    /** A builder for [PostListPageAsync]. */
    class Builder internal constructor() {

        private var service: PostServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PostListParams? = null
        private var response: CollectionResponseWithTotalBlogPostForwardPaging? = null

        @JvmSynthetic
        internal fun from(postListPageAsync: PostListPageAsync) = apply {
            service = postListPageAsync.service
            streamHandlerExecutor = postListPageAsync.streamHandlerExecutor
            params = postListPageAsync.params
            response = postListPageAsync.response
        }

        fun service(service: PostServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PostListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalBlogPostForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PostListPageAsync].
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
        fun build(): PostListPageAsync =
            PostListPageAsync(
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

        return other is PostListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "PostListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
