// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.campaigns.metrics

import com.hubspot.sdk.core.Params
import com.hubspot.sdk.core.http.Headers
import com.hubspot.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Fetch revenue attribution report data for a specified campaign */
class MetricGetRevenueAttributionParams
private constructor(
    private val campaignGuid: String?,
    private val attributionModel: String?,
    private val endDate: String?,
    private val startDate: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun campaignGuid(): Optional<String> = Optional.ofNullable(campaignGuid)

    /**
     * The revenue attribution model used to calculate deal revenue credit. Defaults to LINEAR if
     * not specified. Enum values: LINEAR, FIRST_INTERACTION, LAST_INTERACTION, FULL_PATH, U_SHAPED,
     * W_SHAPED, TIME_DECAY, J_SHAPED, INVERSE_J_SHAPED
     */
    fun attributionModel(): Optional<String> = Optional.ofNullable(attributionModel)

    /** End date to fetch attribution data, YYYY-MM-DD */
    fun endDate(): Optional<String> = Optional.ofNullable(endDate)

    /** Start date to fetch attribution data, YYYY-MM-DD */
    fun startDate(): Optional<String> = Optional.ofNullable(startDate)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): MetricGetRevenueAttributionParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [MetricGetRevenueAttributionParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MetricGetRevenueAttributionParams]. */
    class Builder internal constructor() {

        private var campaignGuid: String? = null
        private var attributionModel: String? = null
        private var endDate: String? = null
        private var startDate: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(metricGetRevenueAttributionParams: MetricGetRevenueAttributionParams) =
            apply {
                campaignGuid = metricGetRevenueAttributionParams.campaignGuid
                attributionModel = metricGetRevenueAttributionParams.attributionModel
                endDate = metricGetRevenueAttributionParams.endDate
                startDate = metricGetRevenueAttributionParams.startDate
                additionalHeaders = metricGetRevenueAttributionParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    metricGetRevenueAttributionParams.additionalQueryParams.toBuilder()
            }

        fun campaignGuid(campaignGuid: String?) = apply { this.campaignGuid = campaignGuid }

        /** Alias for calling [Builder.campaignGuid] with `campaignGuid.orElse(null)`. */
        fun campaignGuid(campaignGuid: Optional<String>) = campaignGuid(campaignGuid.getOrNull())

        /**
         * The revenue attribution model used to calculate deal revenue credit. Defaults to LINEAR
         * if not specified. Enum values: LINEAR, FIRST_INTERACTION, LAST_INTERACTION, FULL_PATH,
         * U_SHAPED, W_SHAPED, TIME_DECAY, J_SHAPED, INVERSE_J_SHAPED
         */
        fun attributionModel(attributionModel: String?) = apply {
            this.attributionModel = attributionModel
        }

        /** Alias for calling [Builder.attributionModel] with `attributionModel.orElse(null)`. */
        fun attributionModel(attributionModel: Optional<String>) =
            attributionModel(attributionModel.getOrNull())

        /** End date to fetch attribution data, YYYY-MM-DD */
        fun endDate(endDate: String?) = apply { this.endDate = endDate }

        /** Alias for calling [Builder.endDate] with `endDate.orElse(null)`. */
        fun endDate(endDate: Optional<String>) = endDate(endDate.getOrNull())

        /** Start date to fetch attribution data, YYYY-MM-DD */
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
         * Returns an immutable instance of [MetricGetRevenueAttributionParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MetricGetRevenueAttributionParams =
            MetricGetRevenueAttributionParams(
                campaignGuid,
                attributionModel,
                endDate,
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
                attributionModel?.let { put("attributionModel", it) }
                endDate?.let { put("endDate", it) }
                startDate?.let { put("startDate", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MetricGetRevenueAttributionParams &&
            campaignGuid == other.campaignGuid &&
            attributionModel == other.attributionModel &&
            endDate == other.endDate &&
            startDate == other.startDate &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            campaignGuid,
            attributionModel,
            endDate,
            startDate,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "MetricGetRevenueAttributionParams{campaignGuid=$campaignGuid, attributionModel=$attributionModel, endDate=$endDate, startDate=$startDate, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
