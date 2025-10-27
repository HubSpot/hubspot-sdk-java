// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.campaigns

import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Get a campaign identified by a specific campaignGuid with the given properties. Along with the
 * campaign information, it also returns information about assets. Depending on the query parameters
 * used, this can also be used to return information about the corresponding assets' metrics.
 * Metrics are available only if startDate and endDate are provided.
 */
class CampaignGetParams
private constructor(
    private val campaignGuid: String?,
    private val endDate: String?,
    private val properties: List<String>?,
    private val startDate: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun campaignGuid(): Optional<String> = Optional.ofNullable(campaignGuid)

    /**
     * End date to fetch asset metrics, formatted as YYYY-MM-DD. This date is used to fetch the
     * metrics associated with the assets for a specified period. If not provided, no asset metrics
     * will be fetched.
     */
    fun endDate(): Optional<String> = Optional.ofNullable(endDate)

    /**
     * A comma-separated list of the properties to be returned in the response. If any of the
     * specified properties has empty value on the requested object, they will be ignored and not
     * returned in response. If this parameter is empty, the response will include an empty
     * properties map.
     */
    fun properties(): Optional<List<String>> = Optional.ofNullable(properties)

    /**
     * Start date to fetch asset metrics, formatted as YYYY-MM-DD. This date is used to fetch the
     * metrics associated with the assets for a specified period. If not provided, no asset metrics
     * will be fetched.
     */
    fun startDate(): Optional<String> = Optional.ofNullable(startDate)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CampaignGetParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [CampaignGetParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CampaignGetParams]. */
    class Builder internal constructor() {

        private var campaignGuid: String? = null
        private var endDate: String? = null
        private var properties: MutableList<String>? = null
        private var startDate: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(campaignGetParams: CampaignGetParams) = apply {
            campaignGuid = campaignGetParams.campaignGuid
            endDate = campaignGetParams.endDate
            properties = campaignGetParams.properties?.toMutableList()
            startDate = campaignGetParams.startDate
            additionalHeaders = campaignGetParams.additionalHeaders.toBuilder()
            additionalQueryParams = campaignGetParams.additionalQueryParams.toBuilder()
        }

        fun campaignGuid(campaignGuid: String?) = apply { this.campaignGuid = campaignGuid }

        /** Alias for calling [Builder.campaignGuid] with `campaignGuid.orElse(null)`. */
        fun campaignGuid(campaignGuid: Optional<String>) = campaignGuid(campaignGuid.getOrNull())

        /**
         * End date to fetch asset metrics, formatted as YYYY-MM-DD. This date is used to fetch the
         * metrics associated with the assets for a specified period. If not provided, no asset
         * metrics will be fetched.
         */
        fun endDate(endDate: String?) = apply { this.endDate = endDate }

        /** Alias for calling [Builder.endDate] with `endDate.orElse(null)`. */
        fun endDate(endDate: Optional<String>) = endDate(endDate.getOrNull())

        /**
         * A comma-separated list of the properties to be returned in the response. If any of the
         * specified properties has empty value on the requested object, they will be ignored and
         * not returned in response. If this parameter is empty, the response will include an empty
         * properties map.
         */
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

        /**
         * Start date to fetch asset metrics, formatted as YYYY-MM-DD. This date is used to fetch
         * the metrics associated with the assets for a specified period. If not provided, no asset
         * metrics will be fetched.
         */
        fun startDate(startDate: String?) = apply { this.startDate = startDate }

        /** Alias for calling [Builder.startDate] with `startDate.orElse(null)`. */
        fun startDate(startDate: Optional<String>) = startDate(startDate.getOrNull())

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
         * Returns an immutable instance of [CampaignGetParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CampaignGetParams =
            CampaignGetParams(
                campaignGuid,
                endDate,
                properties?.toImmutable(),
                startDate,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> campaignGuid ?: ""
            else -> ""
        }

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

        return other is CampaignGetParams &&
            campaignGuid == other.campaignGuid &&
            endDate == other.endDate &&
            properties == other.properties &&
            startDate == other.startDate &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            campaignGuid,
            endDate,
            properties,
            startDate,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "CampaignGetParams{campaignGuid=$campaignGuid, endDate=$endDate, properties=$properties, startDate=$startDate, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
