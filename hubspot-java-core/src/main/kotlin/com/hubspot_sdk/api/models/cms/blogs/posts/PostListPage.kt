// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.blogs.posts

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.services.blocking.cms.blogs.PostService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see PostService.list */
class PostListPage
private constructor(
    private val service: PostService,
    private val params: PostListParams,
    private val response: CollectionResponseWithTotalBlogPostForwardPaging,
) : Page<BlogPost> {

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

    override fun nextPage(): PostListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<BlogPost> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PostListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalBlogPostForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PostListPage].
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

    /** A builder for [PostListPage]. */
    class Builder internal constructor() {

        private var service: PostService? = null
        private var params: PostListParams? = null
        private var response: CollectionResponseWithTotalBlogPostForwardPaging? = null

        @JvmSynthetic
        internal fun from(postListPage: PostListPage) = apply {
            service = postListPage.service
            params = postListPage.params
            response = postListPage.response
        }

        fun service(service: PostService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PostListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalBlogPostForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PostListPage].
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
        fun build(): PostListPage =
            PostListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PostListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "PostListPage{service=$service, params=$params, response=$response}"
}
