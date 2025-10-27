// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.blogs.authors

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.services.blocking.cms.blogs.AuthorService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see AuthorService.list */
class AuthorListPage
private constructor(
    private val service: AuthorService,
    private val params: AuthorListParams,
    private val response: CollectionResponseWithTotalBlogAuthorForwardPaging,
) : Page<BlogAuthor> {

    /**
     * Delegates to [CollectionResponseWithTotalBlogAuthorForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseWithTotalBlogAuthorForwardPaging.results
     */
    fun results(): List<BlogAuthor> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalBlogAuthorForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseWithTotalBlogAuthorForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<BlogAuthor> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): AuthorListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): AuthorListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<BlogAuthor> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AuthorListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalBlogAuthorForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AuthorListPage].
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

    /** A builder for [AuthorListPage]. */
    class Builder internal constructor() {

        private var service: AuthorService? = null
        private var params: AuthorListParams? = null
        private var response: CollectionResponseWithTotalBlogAuthorForwardPaging? = null

        @JvmSynthetic
        internal fun from(authorListPage: AuthorListPage) = apply {
            service = authorListPage.service
            params = authorListPage.params
            response = authorListPage.response
        }

        fun service(service: AuthorService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AuthorListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalBlogAuthorForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [AuthorListPage].
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
        fun build(): AuthorListPage =
            AuthorListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuthorListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "AuthorListPage{service=$service, params=$params, response=$response}"
}
