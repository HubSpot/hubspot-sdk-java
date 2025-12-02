// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.files.fileoperations

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.Paging
import com.hubspot_sdk.api.models.files.CollectionResponseFile
import com.hubspot_sdk.api.models.files.File
import com.hubspot_sdk.api.services.blocking.files.FileOperationService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see FileOperationService.search */
class FileOperationSearchPage
private constructor(
    private val service: FileOperationService,
    private val params: FileOperationSearchParams,
    private val response: CollectionResponseFile,
) : Page<File> {

    /**
     * Delegates to [CollectionResponseFile], but gracefully handles missing data.
     *
     * @see CollectionResponseFile.results
     */
    fun results(): List<File> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseFile], but gracefully handles missing data.
     *
     * @see CollectionResponseFile.paging
     */
    fun paging(): Optional<Paging> = response._paging().getOptional("paging")

    override fun items(): List<File> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): FileOperationSearchParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): FileOperationSearchPage = service.search(nextPageParams())

    fun autoPager(): AutoPager<File> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): FileOperationSearchParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseFile = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FileOperationSearchPage].
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

    /** A builder for [FileOperationSearchPage]. */
    class Builder internal constructor() {

        private var service: FileOperationService? = null
        private var params: FileOperationSearchParams? = null
        private var response: CollectionResponseFile? = null

        @JvmSynthetic
        internal fun from(fileOperationSearchPage: FileOperationSearchPage) = apply {
            service = fileOperationSearchPage.service
            params = fileOperationSearchPage.params
            response = fileOperationSearchPage.response
        }

        fun service(service: FileOperationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: FileOperationSearchParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseFile) = apply { this.response = response }

        /**
         * Returns an immutable instance of [FileOperationSearchPage].
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
        fun build(): FileOperationSearchPage =
            FileOperationSearchPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FileOperationSearchPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "FileOperationSearchPage{service=$service, params=$params, response=$response}"
}
