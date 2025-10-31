// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.blogs.posts

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.marketing.emails.Paging
import com.hubspot_sdk.api.services.blocking.cms.blogs.PostService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see PostService.getPreviousVersions */
class PostGetPreviousVersionsPage
private constructor(
    private val service: PostService,
    private val params: PostGetPreviousVersionsParams,
    private val response: CollectionResponseWithTotalVersionBlogPost,
) : Page<VersionBlogPost> {

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
                ._after()
                .getOptional("after")
                .isPresent

    fun nextPageParams(): PostGetPreviousVersionsParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                ._after()
                .getOptional("after")
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): PostGetPreviousVersionsPage =
        service.getPreviousVersions(nextPageParams())

    fun autoPager(): AutoPager<VersionBlogPost> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PostGetPreviousVersionsParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalVersionBlogPost = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PostGetPreviousVersionsPage].
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

    /** A builder for [PostGetPreviousVersionsPage]. */
    class Builder internal constructor() {

        private var service: PostService? = null
        private var params: PostGetPreviousVersionsParams? = null
        private var response: CollectionResponseWithTotalVersionBlogPost? = null

        @JvmSynthetic
        internal fun from(postGetPreviousVersionsPage: PostGetPreviousVersionsPage) = apply {
            service = postGetPreviousVersionsPage.service
            params = postGetPreviousVersionsPage.params
            response = postGetPreviousVersionsPage.response
        }

        fun service(service: PostService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PostGetPreviousVersionsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalVersionBlogPost) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PostGetPreviousVersionsPage].
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
        fun build(): PostGetPreviousVersionsPage =
            PostGetPreviousVersionsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PostGetPreviousVersionsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PostGetPreviousVersionsPage{service=$service, params=$params, response=$response}"
}
