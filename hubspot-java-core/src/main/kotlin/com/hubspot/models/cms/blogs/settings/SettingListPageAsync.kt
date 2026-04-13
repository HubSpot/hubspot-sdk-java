// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.blogs.settings

import com.hubspot.core.AutoPagerAsync
import com.hubspot.core.PageAsync
import com.hubspot.core.checkRequired
import com.hubspot.models.Paging
import com.hubspot.services.async.cms.blogs.SettingServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see SettingServiceAsync.list */
class SettingListPageAsync
private constructor(
    private val service: SettingServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SettingListParams,
    private val response: CollectionResponseWithTotalBlog,
) : PageAsync<Blog> {

    /**
     * Delegates to [CollectionResponseWithTotalBlog], but gracefully handles missing data.
     *
     * @see CollectionResponseWithTotalBlog.results
     */
    fun results(): List<Blog> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalBlog], but gracefully handles missing data.
     *
     * @see CollectionResponseWithTotalBlog.paging
     */
    fun paging(): Optional<Paging> = response._paging().getOptional("paging")

    override fun items(): List<Blog> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): SettingListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<SettingListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Blog> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SettingListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalBlog = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SettingListPageAsync].
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

    /** A builder for [SettingListPageAsync]. */
    class Builder internal constructor() {

        private var service: SettingServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SettingListParams? = null
        private var response: CollectionResponseWithTotalBlog? = null

        @JvmSynthetic
        internal fun from(settingListPageAsync: SettingListPageAsync) = apply {
            service = settingListPageAsync.service
            streamHandlerExecutor = settingListPageAsync.streamHandlerExecutor
            params = settingListPageAsync.params
            response = settingListPageAsync.response
        }

        fun service(service: SettingServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SettingListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalBlog) = apply { this.response = response }

        /**
         * Returns an immutable instance of [SettingListPageAsync].
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
        fun build(): SettingListPageAsync =
            SettingListPageAsync(
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

        return other is SettingListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "SettingListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
