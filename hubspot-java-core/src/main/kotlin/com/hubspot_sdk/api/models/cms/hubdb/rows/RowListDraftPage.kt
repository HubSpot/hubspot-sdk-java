// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.hubdb.rows

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.HubDbTableRowV3Wrapper
import com.hubspot_sdk.api.models.cms.hubdb.RandomAccessCollectionResponseWithTotalHubDbTableRowV3
import com.hubspot_sdk.api.models.cms.hubdb.StreamingCollectionResponseWithTotalHubDbTableRowV3
import com.hubspot_sdk.api.models.cms.hubdb.UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3
import com.hubspot_sdk.api.services.blocking.cms.hubdb.RowService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see RowService.listDraft */
class RowListDraftPage
private constructor(
    private val service: RowService,
    private val params: RowListDraftParams,
    private val response: UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3,
) : Page<HubDbTableRowV3Wrapper> {

    /**
     * Delegates to [UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3], but gracefully handles
     * missing data.
     *
     * @see RandomAccessCollectionResponseWithTotalHubDbTableRowV3.results
     * @see StreamingCollectionResponseWithTotalHubDbTableRowV3.results
     */
    fun results(): List<HubDbTableRowV3Wrapper> =
        response
            .accept(
                object :
                    UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3.Visitor<
                        Optional<List<HubDbTableRowV3Wrapper>>
                    > {
                    override fun visitRandomAccessCollectionResponseWithTotal(
                        randomAccessCollectionResponseWithTotal:
                            RandomAccessCollectionResponseWithTotalHubDbTableRowV3
                    ): Optional<List<HubDbTableRowV3Wrapper>> =
                        randomAccessCollectionResponseWithTotal._results().getOptional("results")

                    override fun visitStreamingCollectionResponseWithTotal(
                        streamingCollectionResponseWithTotal:
                            StreamingCollectionResponseWithTotalHubDbTableRowV3
                    ): Optional<List<HubDbTableRowV3Wrapper>> =
                        streamingCollectionResponseWithTotal._results().getOptional("results")
                }
            )
            .getOrNull() ?: emptyList()

    override fun items(): List<HubDbTableRowV3Wrapper> = results()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): RowListDraftParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): RowListDraftPage = service.listDraft(nextPageParams())

    fun autoPager(): AutoPager<HubDbTableRowV3Wrapper> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): RowListDraftParams = params

    /** The response that this page was parsed from. */
    fun response(): UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3 = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RowListDraftPage].
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

    /** A builder for [RowListDraftPage]. */
    class Builder internal constructor() {

        private var service: RowService? = null
        private var params: RowListDraftParams? = null
        private var response: UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3? = null

        @JvmSynthetic
        internal fun from(rowListDraftPage: RowListDraftPage) = apply {
            service = rowListDraftPage.service
            params = rowListDraftPage.params
            response = rowListDraftPage.response
        }

        fun service(service: RowService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: RowListDraftParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [RowListDraftPage].
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
        fun build(): RowListDraftPage =
            RowListDraftPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RowListDraftPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "RowListDraftPage{service=$service, params=$params, response=$response}"
}
