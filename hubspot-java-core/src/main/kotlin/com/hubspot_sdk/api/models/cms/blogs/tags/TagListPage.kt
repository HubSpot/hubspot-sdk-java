// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.blogs.tags

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.services.blocking.cms.blogs.TagService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see TagService.list */
class TagListPage
private constructor(
    private val service: TagService,
    private val params: TagListParams,
    private val response: CollectionResponseWithTotalTagForwardPaging,
) : Page<Tag> {

    /**
     * Delegates to [CollectionResponseWithTotalTagForwardPaging], but gracefully handles missing
     * data.
     *
     * @see CollectionResponseWithTotalTagForwardPaging.results
     */
    fun results(): List<Tag> = response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalTagForwardPaging], but gracefully handles missing
     * data.
     *
     * @see CollectionResponseWithTotalTagForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<Tag> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): TagListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): TagListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Tag> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TagListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalTagForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TagListPage].
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

    /** A builder for [TagListPage]. */
    class Builder internal constructor() {

        private var service: TagService? = null
        private var params: TagListParams? = null
        private var response: CollectionResponseWithTotalTagForwardPaging? = null

        @JvmSynthetic
        internal fun from(tagListPage: TagListPage) = apply {
            service = tagListPage.service
            params = tagListPage.params
            response = tagListPage.response
        }

        fun service(service: TagService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TagListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalTagForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [TagListPage].
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
        fun build(): TagListPage =
            TagListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TagListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "TagListPage{service=$service, params=$params, response=$response}"
}
