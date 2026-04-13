// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.marketingevents

import com.hubspot.core.JsonValue
import com.hubspot.core.Params
import com.hubspot.core.checkRequired
import com.hubspot.core.http.Headers
import com.hubspot.core.http.QueryParams
import java.util.Objects

/**
 * Upserts multiple Marketing Events. If a Marketing Event with the specified ID already exists, it
 * will be updated; otherwise, a new event will be created.
 *
 * Only Marketing Events originally created by the same app can be updated.
 */
class MarketingEventUpsertBatchParams
private constructor(
    private val batchInputMarketingEventCreateRequestParams:
        BatchInputMarketingEventCreateRequestParams,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun batchInputMarketingEventCreateRequestParams(): BatchInputMarketingEventCreateRequestParams =
        batchInputMarketingEventCreateRequestParams

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        batchInputMarketingEventCreateRequestParams._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [MarketingEventUpsertBatchParams].
         *
         * The following fields are required:
         * ```java
         * .batchInputMarketingEventCreateRequestParams()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MarketingEventUpsertBatchParams]. */
    class Builder internal constructor() {

        private var batchInputMarketingEventCreateRequestParams:
            BatchInputMarketingEventCreateRequestParams? =
            null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(marketingEventUpsertBatchParams: MarketingEventUpsertBatchParams) =
            apply {
                batchInputMarketingEventCreateRequestParams =
                    marketingEventUpsertBatchParams.batchInputMarketingEventCreateRequestParams
                additionalHeaders = marketingEventUpsertBatchParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    marketingEventUpsertBatchParams.additionalQueryParams.toBuilder()
            }

        fun batchInputMarketingEventCreateRequestParams(
            batchInputMarketingEventCreateRequestParams: BatchInputMarketingEventCreateRequestParams
        ) = apply {
            this.batchInputMarketingEventCreateRequestParams =
                batchInputMarketingEventCreateRequestParams
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [MarketingEventUpsertBatchParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .batchInputMarketingEventCreateRequestParams()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MarketingEventUpsertBatchParams =
            MarketingEventUpsertBatchParams(
                checkRequired(
                    "batchInputMarketingEventCreateRequestParams",
                    batchInputMarketingEventCreateRequestParams,
                ),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): BatchInputMarketingEventCreateRequestParams =
        batchInputMarketingEventCreateRequestParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MarketingEventUpsertBatchParams &&
            batchInputMarketingEventCreateRequestParams ==
                other.batchInputMarketingEventCreateRequestParams &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            batchInputMarketingEventCreateRequestParams,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "MarketingEventUpsertBatchParams{batchInputMarketingEventCreateRequestParams=$batchInputMarketingEventCreateRequestParams, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
