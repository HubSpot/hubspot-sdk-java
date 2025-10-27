// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.blogs.settings

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.services.blocking.cms.blogs.SettingService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see SettingService.list */
class SettingListPage
private constructor(
    private val service: SettingService,
    private val params: SettingListParams,
    private val response: CollectionResponseWithTotalBlogForwardPaging,
) : Page<Blog> {

    /**
     * Delegates to [CollectionResponseWithTotalBlogForwardPaging], but gracefully handles missing
     * data.
     *
     * @see CollectionResponseWithTotalBlogForwardPaging.results
     */
    fun results(): List<Blog> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalBlogForwardPaging], but gracefully handles missing
     * data.
     *
     * @see CollectionResponseWithTotalBlogForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

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

    override fun nextPage(): SettingListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Blog> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SettingListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalBlogForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SettingListPage].
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

    /** A builder for [SettingListPage]. */
    class Builder internal constructor() {

        private var service: SettingService? = null
        private var params: SettingListParams? = null
        private var response: CollectionResponseWithTotalBlogForwardPaging? = null

        @JvmSynthetic
        internal fun from(settingListPage: SettingListPage) = apply {
            service = settingListPage.service
            params = settingListPage.params
            response = settingListPage.response
        }

        fun service(service: SettingService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SettingListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalBlogForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [SettingListPage].
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
        fun build(): SettingListPage =
            SettingListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SettingListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "SettingListPage{service=$service, params=$params, response=$response}"
}
