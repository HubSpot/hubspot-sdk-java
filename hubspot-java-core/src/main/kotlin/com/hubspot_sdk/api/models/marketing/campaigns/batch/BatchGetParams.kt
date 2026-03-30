// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.campaigns.batch

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.models.marketing.campaigns.BatchInputPublicCampaignReadInput
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * This endpoint reads a batch of campaigns based on the provided input data and returns the
 * campaigns along with their associated assets. The maximum number of items in a batch request
 * is 50. The campaigns in the response are not guaranteed to be in the same order as they were
 * provided in the request. If duplicate campaign IDs are provided in the request, duplicates will
 * be ignored. The response will include only unique IDs and will be returned without duplicates.
 */
class BatchGetParams
private constructor(
    private val endDate: String?,
    private val properties: List<String>?,
    private val startDate: String?,
    private val batchInputPublicCampaignReadInput: BatchInputPublicCampaignReadInput,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun endDate(): Optional<String> = Optional.ofNullable(endDate)

    fun properties(): Optional<List<String>> = Optional.ofNullable(properties)

    fun startDate(): Optional<String> = Optional.ofNullable(startDate)

    fun batchInputPublicCampaignReadInput(): BatchInputPublicCampaignReadInput =
        batchInputPublicCampaignReadInput

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        batchInputPublicCampaignReadInput._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BatchGetParams].
         *
         * The following fields are required:
         * ```java
         * .batchInputPublicCampaignReadInput()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BatchGetParams]. */
    class Builder internal constructor() {

        private var endDate: String? = null
        private var properties: MutableList<String>? = null
        private var startDate: String? = null
        private var batchInputPublicCampaignReadInput: BatchInputPublicCampaignReadInput? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(batchGetParams: BatchGetParams) = apply {
            endDate = batchGetParams.endDate
            properties = batchGetParams.properties?.toMutableList()
            startDate = batchGetParams.startDate
            batchInputPublicCampaignReadInput = batchGetParams.batchInputPublicCampaignReadInput
            additionalHeaders = batchGetParams.additionalHeaders.toBuilder()
            additionalQueryParams = batchGetParams.additionalQueryParams.toBuilder()
        }

        fun endDate(endDate: String?) = apply { this.endDate = endDate }

        /** Alias for calling [Builder.endDate] with `endDate.orElse(null)`. */
        fun endDate(endDate: Optional<String>) = endDate(endDate.getOrNull())

        fun properties(properties: List<String>?) = apply {
            this.properties = properties?.toMutableList()
        }

        /** Alias for calling [Builder.properties] with `properties.orElse(null)`. */
        fun properties(properties: Optional<List<String>>) = properties(properties.getOrNull())

        /**
         * Adds a single [String] to [properties].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProperty(property: String) = apply {
            properties = (properties ?: mutableListOf()).apply { add(property) }
        }

        fun startDate(startDate: String?) = apply { this.startDate = startDate }

        /** Alias for calling [Builder.startDate] with `startDate.orElse(null)`. */
        fun startDate(startDate: Optional<String>) = startDate(startDate.getOrNull())

        fun batchInputPublicCampaignReadInput(
            batchInputPublicCampaignReadInput: BatchInputPublicCampaignReadInput
        ) = apply { this.batchInputPublicCampaignReadInput = batchInputPublicCampaignReadInput }

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
         * Returns an immutable instance of [BatchGetParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .batchInputPublicCampaignReadInput()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BatchGetParams =
            BatchGetParams(
                endDate,
                properties?.toImmutable(),
                startDate,
                checkRequired(
                    "batchInputPublicCampaignReadInput",
                    batchInputPublicCampaignReadInput,
                ),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): BatchInputPublicCampaignReadInput = batchInputPublicCampaignReadInput

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                endDate?.let { put("endDate", it) }
                properties?.let { put("properties", it.joinToString(",")) }
                startDate?.let { put("startDate", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BatchGetParams &&
            endDate == other.endDate &&
            properties == other.properties &&
            startDate == other.startDate &&
            batchInputPublicCampaignReadInput == other.batchInputPublicCampaignReadInput &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            endDate,
            properties,
            startDate,
            batchInputPublicCampaignReadInput,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "BatchGetParams{endDate=$endDate, properties=$properties, startDate=$startDate, batchInputPublicCampaignReadInput=$batchInputPublicCampaignReadInput, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
