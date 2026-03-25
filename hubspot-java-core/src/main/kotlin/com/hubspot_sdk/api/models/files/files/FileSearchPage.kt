// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.files.files

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.Paging
import com.hubspot_sdk.api.models.files.CollectionResponseFile
import com.hubspot_sdk.api.models.files.File
import com.hubspot_sdk.api.services.blocking.files.FileService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see FileService.search */
class FileSearchPage
private constructor(
    private val service: FileService,
    private val params: FileSearchParams,
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

    fun nextPageParams(): FileSearchParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): FileSearchPage = service.search(nextPageParams())

    fun autoPager(): AutoPager<File> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): FileSearchParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseFile = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FileSearchPage].
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

    /** A builder for [FileSearchPage]. */
    class Builder internal constructor() {

        private var service: FileService? = null
        private var params: FileSearchParams? = null
        private var response: CollectionResponseFile? = null

        @JvmSynthetic
        internal fun from(fileSearchPage: FileSearchPage) = apply {
            service = fileSearchPage.service
            params = fileSearchPage.params
            response = fileSearchPage.response
        }

        fun service(service: FileService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: FileSearchParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseFile) = apply { this.response = response }

        /**
         * Returns an immutable instance of [FileSearchPage].
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
        fun build(): FileSearchPage =
            FileSearchPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FileSearchPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "FileSearchPage{service=$service, params=$params, response=$response}"
}
