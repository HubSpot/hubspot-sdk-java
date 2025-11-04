// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.hubdb.rows

import com.hubspot_sdk.api.core.AutoPagerAsync
import com.hubspot_sdk.api.core.PageAsync
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.HubDbTableRowV3Wrapper
import com.hubspot_sdk.api.models.cms.hubdb.RandomAccessCollectionResponseWithTotalHubDbTableRowV3
import com.hubspot_sdk.api.models.cms.hubdb.StreamingCollectionResponseWithTotalHubDbTableRowV3
import com.hubspot_sdk.api.models.cms.hubdb.UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3
import com.hubspot_sdk.api.services.async.cms.hubdb.RowServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see RowServiceAsync.listDraft */
class RowListDraftPageAsync
private constructor(
    private val service: RowServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: RowListDraftParams,
    private val response: UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3,
) : PageAsync<HubDbTableRowV3Wrapper> {

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

    override fun nextPage(): CompletableFuture<RowListDraftPageAsync> =
        service.listDraft(nextPageParams())

    fun autoPager(): AutoPagerAsync<HubDbTableRowV3Wrapper> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): RowListDraftParams = params

    /** The response that this page was parsed from. */
    fun response(): UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3 = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RowListDraftPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RowListDraftPageAsync]. */
    class Builder internal constructor() {

        private var service: RowServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: RowListDraftParams? = null
        private var response: UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3? = null

        @JvmSynthetic
        internal fun from(rowListDraftPageAsync: RowListDraftPageAsync) = apply {
            service = rowListDraftPageAsync.service
            streamHandlerExecutor = rowListDraftPageAsync.streamHandlerExecutor
            params = rowListDraftPageAsync.params
            response = rowListDraftPageAsync.response
        }

        fun service(service: RowServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: RowListDraftParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [RowListDraftPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RowListDraftPageAsync =
            RowListDraftPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RowListDraftPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "RowListDraftPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
