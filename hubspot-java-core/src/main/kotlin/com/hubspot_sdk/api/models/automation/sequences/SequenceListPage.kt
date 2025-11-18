// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.sequences

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.services.blocking.automation.SequenceService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see SequenceService.list */
class SequenceListPage
private constructor(
    private val service: SequenceService,
    private val params: SequenceListParams,
    private val response: CollectionResponseWithTotalPublicSequenceLiteResponseForwardPaging,
) : Page<PublicSequenceLiteResponse> {

    /**
     * Delegates to [CollectionResponseWithTotalPublicSequenceLiteResponseForwardPaging], but
     * gracefully handles missing data.
     *
     * @see CollectionResponseWithTotalPublicSequenceLiteResponseForwardPaging.results
     */
    fun results(): List<PublicSequenceLiteResponse> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalPublicSequenceLiteResponseForwardPaging], but
     * gracefully handles missing data.
     *
     * @see CollectionResponseWithTotalPublicSequenceLiteResponseForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<PublicSequenceLiteResponse> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): SequenceListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): SequenceListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PublicSequenceLiteResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SequenceListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalPublicSequenceLiteResponseForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SequenceListPage].
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

    /** A builder for [SequenceListPage]. */
    class Builder internal constructor() {

        private var service: SequenceService? = null
        private var params: SequenceListParams? = null
        private var response: CollectionResponseWithTotalPublicSequenceLiteResponseForwardPaging? =
            null

        @JvmSynthetic
        internal fun from(sequenceListPage: SequenceListPage) = apply {
            service = sequenceListPage.service
            params = sequenceListPage.params
            response = sequenceListPage.response
        }

        fun service(service: SequenceService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SequenceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalPublicSequenceLiteResponseForwardPaging) =
            apply {
                this.response = response
            }

        /**
         * Returns an immutable instance of [SequenceListPage].
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
        fun build(): SequenceListPage =
            SequenceListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SequenceListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "SequenceListPage{service=$service, params=$params, response=$response}"
}
