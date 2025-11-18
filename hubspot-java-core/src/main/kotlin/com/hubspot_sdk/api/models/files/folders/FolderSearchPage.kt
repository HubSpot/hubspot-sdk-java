// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.files.folders

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.Paging
import com.hubspot_sdk.api.models.files.CollectionResponseFolder
import com.hubspot_sdk.api.models.files.Folder
import com.hubspot_sdk.api.services.blocking.files.FolderService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see FolderService.search */
class FolderSearchPage
private constructor(
    private val service: FolderService,
    private val params: FolderSearchParams,
    private val response: CollectionResponseFolder,
) : Page<Folder> {

    /**
     * Delegates to [CollectionResponseFolder], but gracefully handles missing data.
     *
     * @see CollectionResponseFolder.results
     */
    fun results(): List<Folder> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseFolder], but gracefully handles missing data.
     *
     * @see CollectionResponseFolder.paging
     */
    fun paging(): Optional<Paging> = response._paging().getOptional("paging")

    override fun items(): List<Folder> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): FolderSearchParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): FolderSearchPage = service.search(nextPageParams())

    fun autoPager(): AutoPager<Folder> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): FolderSearchParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseFolder = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FolderSearchPage].
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

    /** A builder for [FolderSearchPage]. */
    class Builder internal constructor() {

        private var service: FolderService? = null
        private var params: FolderSearchParams? = null
        private var response: CollectionResponseFolder? = null

        @JvmSynthetic
        internal fun from(folderSearchPage: FolderSearchPage) = apply {
            service = folderSearchPage.service
            params = folderSearchPage.params
            response = folderSearchPage.response
        }

        fun service(service: FolderService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: FolderSearchParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseFolder) = apply { this.response = response }

        /**
         * Returns an immutable instance of [FolderSearchPage].
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
        fun build(): FolderSearchPage =
            FolderSearchPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FolderSearchPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "FolderSearchPage{service=$service, params=$params, response=$response}"
}
