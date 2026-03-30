// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.pages.folders

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.cms.pages.CollectionResponseWithTotalContentFolderForwardPaging
import com.hubspot_sdk.api.models.cms.pages.ContentFolder
import com.hubspot_sdk.api.services.blocking.cms.pages.FolderService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see FolderService.listFolders */
class FolderListFoldersPage
private constructor(
    private val service: FolderService,
    private val params: FolderListFoldersParams,
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

    fun nextPageParams(): FolderListFoldersParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): FolderListFoldersPage = service.listFolders(nextPageParams())

    fun autoPager(): AutoPager<ContentFolder> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): FolderListFoldersParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalContentFolderForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FolderListFoldersPage].
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

    /** A builder for [FolderListFoldersPage]. */
    class Builder internal constructor() {

        private var service: FolderService? = null
        private var params: FolderListFoldersParams? = null
        private var response: CollectionResponseWithTotalContentFolderForwardPaging? = null

        @JvmSynthetic
        internal fun from(folderListFoldersPage: FolderListFoldersPage) = apply {
            service = folderListFoldersPage.service
            params = folderListFoldersPage.params
            response = folderListFoldersPage.response
        }

        fun service(service: FolderService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: FolderListFoldersParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalContentFolderForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [FolderListFoldersPage].
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
        fun build(): FolderListFoldersPage =
            FolderListFoldersPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FolderListFoldersPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "FolderListFoldersPage{service=$service, params=$params, response=$response}"
}
