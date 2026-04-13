// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.blogs.settings

import com.hubspot.sdk.core.AutoPagerAsync
import com.hubspot.sdk.core.PageAsync
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.models.Paging
import com.hubspot.sdk.services.async.cms.blogs.SettingServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see SettingServiceAsync.listRevisions */
class SettingListRevisionsPageAsync
private constructor(
    private val service: SettingServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SettingListRevisionsParams,
    private val response: CollectionResponseWithTotalBlogVersion,
) : PageAsync<VersionBlog> {

    /**
     * Delegates to [CollectionResponseWithTotalBlogVersion], but gracefully handles missing data.
     *
     * @see CollectionResponseWithTotalBlogVersion.results
     */
    fun results(): List<VersionBlog> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalBlogVersion], but gracefully handles missing data.
     *
     * @see CollectionResponseWithTotalBlogVersion.paging
     */
    fun paging(): Optional<Paging> = response._paging().getOptional("paging")

    override fun items(): List<VersionBlog> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): SettingListRevisionsParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<SettingListRevisionsPageAsync> =
        service.listRevisions(nextPageParams())

    fun autoPager(): AutoPagerAsync<VersionBlog> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SettingListRevisionsParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalBlogVersion = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SettingListRevisionsPageAsync].
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

    /** A builder for [SettingListRevisionsPageAsync]. */
    class Builder internal constructor() {

        private var service: SettingServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SettingListRevisionsParams? = null
        private var response: CollectionResponseWithTotalBlogVersion? = null

        @JvmSynthetic
        internal fun from(settingListRevisionsPageAsync: SettingListRevisionsPageAsync) = apply {
            service = settingListRevisionsPageAsync.service
            streamHandlerExecutor = settingListRevisionsPageAsync.streamHandlerExecutor
            params = settingListRevisionsPageAsync.params
            response = settingListRevisionsPageAsync.response
        }

        fun service(service: SettingServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SettingListRevisionsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalBlogVersion) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [SettingListRevisionsPageAsync].
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
        fun build(): SettingListRevisionsPageAsync =
            SettingListRevisionsPageAsync(
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

        return other is SettingListRevisionsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "SettingListRevisionsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
