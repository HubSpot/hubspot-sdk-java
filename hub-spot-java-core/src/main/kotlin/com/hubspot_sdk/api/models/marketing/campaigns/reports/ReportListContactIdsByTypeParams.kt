// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.campaigns.reports

import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Fetch the list of contact IDs for the specified campaign and contact type */
class ReportListContactIdsByTypeParams
private constructor(
    private val campaignGuid: String,
    private val contactType: String?,
    private val after: String?,
    private val endDate: String?,
    private val limit: Int?,
    private val startDate: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun campaignGuid(): String = campaignGuid

    fun contactType(): Optional<String> = Optional.ofNullable(contactType)

    /**
     * A cursor for pagination. If provided, the results will start after the given cursor. Example:
     * NTI1Cg%3D%3D
     */
    fun after(): Optional<String> = Optional.ofNullable(after)

    /** End date for the report data, formatted as YYYY-MM-DD. Default value: Current date */
    fun endDate(): Optional<String> = Optional.ofNullable(endDate)

    /** Limit for the number of contacts to fetch Default: 100 */
    fun limit(): Optional<Int> = Optional.ofNullable(limit)

    /** The start date for the report data, formatted as YYYY-MM-DD. Default value: 2006-01-01 */
    fun startDate(): Optional<String> = Optional.ofNullable(startDate)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ReportListContactIdsByTypeParams].
         *
         * The following fields are required:
         * ```java
         * .campaignGuid()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReportListContactIdsByTypeParams]. */
    class Builder internal constructor() {

        private var campaignGuid: String? = null
        private var contactType: String? = null
        private var after: String? = null
        private var endDate: String? = null
        private var limit: Int? = null
        private var startDate: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(reportListContactIdsByTypeParams: ReportListContactIdsByTypeParams) =
            apply {
                campaignGuid = reportListContactIdsByTypeParams.campaignGuid
                contactType = reportListContactIdsByTypeParams.contactType
                after = reportListContactIdsByTypeParams.after
                endDate = reportListContactIdsByTypeParams.endDate
                limit = reportListContactIdsByTypeParams.limit
                startDate = reportListContactIdsByTypeParams.startDate
                additionalHeaders = reportListContactIdsByTypeParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    reportListContactIdsByTypeParams.additionalQueryParams.toBuilder()
            }

        fun campaignGuid(campaignGuid: String) = apply { this.campaignGuid = campaignGuid }

        fun contactType(contactType: String?) = apply { this.contactType = contactType }

        /** Alias for calling [Builder.contactType] with `contactType.orElse(null)`. */
        fun contactType(contactType: Optional<String>) = contactType(contactType.getOrNull())

        /**
         * A cursor for pagination. If provided, the results will start after the given cursor.
         * Example: NTI1Cg%3D%3D
         */
        fun after(after: String?) = apply { this.after = after }

        /** Alias for calling [Builder.after] with `after.orElse(null)`. */
        fun after(after: Optional<String>) = after(after.getOrNull())

        /** End date for the report data, formatted as YYYY-MM-DD. Default value: Current date */
        fun endDate(endDate: String?) = apply { this.endDate = endDate }

        /** Alias for calling [Builder.endDate] with `endDate.orElse(null)`. */
        fun endDate(endDate: Optional<String>) = endDate(endDate.getOrNull())

        /** Limit for the number of contacts to fetch Default: 100 */
        fun limit(limit: Int?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Int) = limit(limit as Int?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Int>) = limit(limit.getOrNull())

        /**
         * The start date for the report data, formatted as YYYY-MM-DD. Default value: 2006-01-01
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
         * Returns an immutable instance of [ReportListContactIdsByTypeParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .campaignGuid()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ReportListContactIdsByTypeParams =
            ReportListContactIdsByTypeParams(
                checkRequired("campaignGuid", campaignGuid),
                contactType,
                after,
                endDate,
                limit,
                startDate,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> campaignGuid
            1 -> contactType ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                after?.let { put("after", it) }
                endDate?.let { put("endDate", it) }
                limit?.let { put("limit", it.toString()) }
                startDate?.let { put("startDate", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReportListContactIdsByTypeParams &&
            campaignGuid == other.campaignGuid &&
            contactType == other.contactType &&
            after == other.after &&
            endDate == other.endDate &&
            limit == other.limit &&
            startDate == other.startDate &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            campaignGuid,
            contactType,
            after,
            endDate,
            limit,
            startDate,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ReportListContactIdsByTypeParams{campaignGuid=$campaignGuid, contactType=$contactType, after=$after, endDate=$endDate, limit=$limit, startDate=$startDate, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
