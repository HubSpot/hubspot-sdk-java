// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.pages.folders

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.Paging
import com.hubspot_sdk.api.models.cms.pages.CollectionResponseWithTotalContentFolderVersion
import com.hubspot_sdk.api.models.cms.pages.ContentFolderVersion
import com.hubspot_sdk.api.services.blocking.cms.pages.FolderService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see FolderService.listFolderRevisions */
class FolderListFolderRevisionsPage
private constructor(
    private val service: FolderService,
    private val params: FolderListFolderRevisionsParams,
    private val response: CollectionResponseWithTotalContentFolderVersion,
) : Page<ContentFolderVersion> {

    /**
     * Delegates to [CollectionResponseWithTotalContentFolderVersion], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseWithTotalContentFolderVersion.results
     */
    fun results(): List<ContentFolderVersion> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalContentFolderVersion], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseWithTotalContentFolderVersion.paging
     */
    fun paging(): Optional<Paging> = response._paging().getOptional("paging")

    override fun items(): List<ContentFolderVersion> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): FolderListFolderRevisionsParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): FolderListFolderRevisionsPage =
        service.listFolderRevisions(nextPageParams())

    fun autoPager(): AutoPager<ContentFolderVersion> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): FolderListFolderRevisionsParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalContentFolderVersion = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [FolderListFolderRevisionsPage].
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

    /** A builder for [FolderListFolderRevisionsPage]. */
    class Builder internal constructor() {

        private var service: FolderService? = null
        private var params: FolderListFolderRevisionsParams? = null
        private var response: CollectionResponseWithTotalContentFolderVersion? = null

        @JvmSynthetic
        internal fun from(folderListFolderRevisionsPage: FolderListFolderRevisionsPage) = apply {
            service = folderListFolderRevisionsPage.service
            params = folderListFolderRevisionsPage.params
            response = folderListFolderRevisionsPage.response
        }

        fun service(service: FolderService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: FolderListFolderRevisionsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalContentFolderVersion) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [FolderListFolderRevisionsPage].
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
        fun build(): FolderListFolderRevisionsPage =
            FolderListFolderRevisionsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FolderListFolderRevisionsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "FolderListFolderRevisionsPage{service=$service, params=$params, response=$response}"
}
