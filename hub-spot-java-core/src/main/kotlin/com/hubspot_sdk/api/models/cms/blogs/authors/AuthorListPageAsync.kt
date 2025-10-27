// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.blogs.authors

import com.hubspot_sdk.api.core.AutoPagerAsync
import com.hubspot_sdk.api.core.PageAsync
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.services.async.cms.blogs.AuthorServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see AuthorServiceAsync.list */
class AuthorListPageAsync
private constructor(
    private val service: AuthorServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AuthorListParams,
    private val response: CollectionResponseWithTotalBlogAuthorForwardPaging,
) : PageAsync<BlogAuthor> {

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

    override fun nextPage(): CompletableFuture<AuthorListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<BlogAuthor> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AuthorListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalBlogAuthorForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AuthorListPageAsync].
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

    /** A builder for [AuthorListPageAsync]. */
    class Builder internal constructor() {

        private var service: AuthorServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AuthorListParams? = null
        private var response: CollectionResponseWithTotalBlogAuthorForwardPaging? = null

        @JvmSynthetic
        internal fun from(authorListPageAsync: AuthorListPageAsync) = apply {
            service = authorListPageAsync.service
            streamHandlerExecutor = authorListPageAsync.streamHandlerExecutor
            params = authorListPageAsync.params
            response = authorListPageAsync.response
        }

        fun service(service: AuthorServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AuthorListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalBlogAuthorForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [AuthorListPageAsync].
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
        fun build(): AuthorListPageAsync =
            AuthorListPageAsync(
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

        return other is AuthorListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "AuthorListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
