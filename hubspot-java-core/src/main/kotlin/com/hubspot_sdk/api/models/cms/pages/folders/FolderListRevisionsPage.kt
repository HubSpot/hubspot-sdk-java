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

/** @see FolderService.listRevisions */
class FolderListRevisionsPage
private constructor(
    private val service: FolderService,
    private val params: FolderListRevisionsParams,
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

    fun nextPageParams(): FolderListRevisionsParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): FolderListRevisionsPage = service.listRevisions(nextPageParams())

    fun autoPager(): AutoPager<ContentFolderVersion> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): FolderListRevisionsParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalContentFolderVersion = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FolderListRevisionsPage].
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

    /** A builder for [FolderListRevisionsPage]. */
    class Builder internal constructor() {

        private var service: FolderService? = null
        private var params: FolderListRevisionsParams? = null
        private var response: CollectionResponseWithTotalContentFolderVersion? = null

        @JvmSynthetic
        internal fun from(folderListRevisionsPage: FolderListRevisionsPage) = apply {
            service = folderListRevisionsPage.service
            params = folderListRevisionsPage.params
            response = folderListRevisionsPage.response
        }

        fun service(service: FolderService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: FolderListRevisionsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalContentFolderVersion) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [FolderListRevisionsPage].
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
        fun build(): FolderListRevisionsPage =
            FolderListRevisionsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FolderListRevisionsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "FolderListRevisionsPage{service=$service, params=$params, response=$response}"
}
