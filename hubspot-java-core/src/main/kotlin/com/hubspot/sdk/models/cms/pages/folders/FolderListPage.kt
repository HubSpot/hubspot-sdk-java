// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.pages.folders

import com.hubspot.sdk.core.AutoPager
import com.hubspot.sdk.core.Page
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.models.ForwardPaging
import com.hubspot.sdk.models.cms.pages.CollectionResponseWithTotalContentFolderForwardPaging
import com.hubspot.sdk.models.cms.pages.ContentFolder
import com.hubspot.sdk.services.blocking.cms.pages.FolderService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see FolderService.list */
class FolderListPage
private constructor(
    private val service: FolderService,
    private val params: FolderListParams,
    private val response: CollectionResponseWithTotalContentFolderForwardPaging,
) : Page<ContentFolder> {

    /**
     * Delegates to [CollectionResponseWithTotalContentFolderForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseWithTotalContentFolderForwardPaging.results
     */
    fun results(): List<ContentFolder> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalContentFolderForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseWithTotalContentFolderForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<ContentFolder> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): FolderListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): FolderListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ContentFolder> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): FolderListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalContentFolderForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FolderListPage].
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

    /** A builder for [FolderListPage]. */
    class Builder internal constructor() {

        private var service: FolderService? = null
        private var params: FolderListParams? = null
        private var response: CollectionResponseWithTotalContentFolderForwardPaging? = null

        @JvmSynthetic
        internal fun from(folderListPage: FolderListPage) = apply {
            service = folderListPage.service
            params = folderListPage.params
            response = folderListPage.response
        }

        fun service(service: FolderService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: FolderListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalContentFolderForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [FolderListPage].
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
        fun build(): FolderListPage =
            FolderListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FolderListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "FolderListPage{service=$service, params=$params, response=$response}"
}
