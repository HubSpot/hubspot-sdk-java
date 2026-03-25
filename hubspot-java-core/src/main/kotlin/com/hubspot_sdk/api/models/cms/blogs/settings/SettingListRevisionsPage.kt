// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.blogs.settings

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.Paging
import com.hubspot_sdk.api.services.blocking.cms.blogs.SettingService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see SettingService.listRevisions */
class SettingListRevisionsPage
private constructor(
    private val service: SettingService,
    private val params: SettingListRevisionsParams,
    private val response: CollectionResponseWithTotalBlogVersion,
) : Page<VersionBlog> {

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

    override fun nextPage(): SettingListRevisionsPage = service.listRevisions(nextPageParams())

    fun autoPager(): AutoPager<VersionBlog> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SettingListRevisionsParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalBlogVersion = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SettingListRevisionsPage].
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

    /** A builder for [SettingListRevisionsPage]. */
    class Builder internal constructor() {

        private var service: SettingService? = null
        private var params: SettingListRevisionsParams? = null
        private var response: CollectionResponseWithTotalBlogVersion? = null

        @JvmSynthetic
        internal fun from(settingListRevisionsPage: SettingListRevisionsPage) = apply {
            service = settingListRevisionsPage.service
            params = settingListRevisionsPage.params
            response = settingListRevisionsPage.response
        }

        fun service(service: SettingService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SettingListRevisionsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalBlogVersion) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [SettingListRevisionsPage].
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
        fun build(): SettingListRevisionsPage =
            SettingListRevisionsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SettingListRevisionsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "SettingListRevisionsPage{service=$service, params=$params, response=$response}"
}
