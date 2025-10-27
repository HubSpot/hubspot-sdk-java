// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.emails

import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get the details for a marketing email. */
class EmailGetParams
private constructor(
    private val emailId: String?,
    private val archived: Boolean?,
    private val includedProperties: List<String>?,
    private val includeStats: Boolean?,
    private val marketingCampaignNames: Boolean?,
    private val workflowNames: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun emailId(): Optional<String> = Optional.ofNullable(emailId)

    /** Whether to return only results that have been archived. */
    fun archived(): Optional<Boolean> = Optional.ofNullable(archived)

    /** Limit the response to only include the specified properties. */
    fun includedProperties(): Optional<List<String>> = Optional.ofNullable(includedProperties)

    /** Include statistics with email. */
    fun includeStats(): Optional<Boolean> = Optional.ofNullable(includeStats)

    /** If set to true, loads `campaignName` and `campaignUtm`. */
    fun marketingCampaignNames(): Optional<Boolean> = Optional.ofNullable(marketingCampaignNames)

    /** If set to true, loads workflows in which the email is used within a "send email" action. */
    fun workflowNames(): Optional<Boolean> = Optional.ofNullable(workflowNames)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): EmailGetParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [EmailGetParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailGetParams]. */
    class Builder internal constructor() {

        private var emailId: String? = null
        private var archived: Boolean? = null
        private var includedProperties: MutableList<String>? = null
        private var includeStats: Boolean? = null
        private var marketingCampaignNames: Boolean? = null
        private var workflowNames: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(emailGetParams: EmailGetParams) = apply {
            emailId = emailGetParams.emailId
            archived = emailGetParams.archived
            includedProperties = emailGetParams.includedProperties?.toMutableList()
            includeStats = emailGetParams.includeStats
            marketingCampaignNames = emailGetParams.marketingCampaignNames
            workflowNames = emailGetParams.workflowNames
            additionalHeaders = emailGetParams.additionalHeaders.toBuilder()
            additionalQueryParams = emailGetParams.additionalQueryParams.toBuilder()
        }

        fun emailId(emailId: String?) = apply { this.emailId = emailId }

        /** Alias for calling [Builder.emailId] with `emailId.orElse(null)`. */
        fun emailId(emailId: Optional<String>) = emailId(emailId.getOrNull())

        /** Whether to return only results that have been archived. */
        fun archived(archived: Boolean?) = apply { this.archived = archived }

        /**
         * Alias for [Builder.archived].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun archived(archived: Boolean) = archived(archived as Boolean?)

        /** Alias for calling [Builder.archived] with `archived.orElse(null)`. */
        fun archived(archived: Optional<Boolean>) = archived(archived.getOrNull())

        /** Limit the response to only include the specified properties. */
        fun includedProperties(includedProperties: List<String>?) = apply {
            this.includedProperties = includedProperties?.toMutableList()
        }

        /**
         * Alias for calling [Builder.includedProperties] with `includedProperties.orElse(null)`.
         */
        fun includedProperties(includedProperties: Optional<List<String>>) =
            includedProperties(includedProperties.getOrNull())

        /**
         * Adds a single [String] to [includedProperties].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIncludedProperty(includedProperty: String) = apply {
            includedProperties =
                (includedProperties ?: mutableListOf()).apply { add(includedProperty) }
        }

        /** Include statistics with email. */
        fun includeStats(includeStats: Boolean?) = apply { this.includeStats = includeStats }

        /**
         * Alias for [Builder.includeStats].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeStats(includeStats: Boolean) = includeStats(includeStats as Boolean?)

        /** Alias for calling [Builder.includeStats] with `includeStats.orElse(null)`. */
        fun includeStats(includeStats: Optional<Boolean>) = includeStats(includeStats.getOrNull())

        /** If set to true, loads `campaignName` and `campaignUtm`. */
        fun marketingCampaignNames(marketingCampaignNames: Boolean?) = apply {
            this.marketingCampaignNames = marketingCampaignNames
        }

        /**
         * Alias for [Builder.marketingCampaignNames].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun marketingCampaignNames(marketingCampaignNames: Boolean) =
            marketingCampaignNames(marketingCampaignNames as Boolean?)

        /**
         * Alias for calling [Builder.marketingCampaignNames] with
         * `marketingCampaignNames.orElse(null)`.
         */
        fun marketingCampaignNames(marketingCampaignNames: Optional<Boolean>) =
            marketingCampaignNames(marketingCampaignNames.getOrNull())

        /**
         * If set to true, loads workflows in which the email is used within a "send email" action.
         */
        fun workflowNames(workflowNames: Boolean?) = apply { this.workflowNames = workflowNames }

        /**
         * Alias for [Builder.workflowNames].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun workflowNames(workflowNames: Boolean) = workflowNames(workflowNames as Boolean?)

        /** Alias for calling [Builder.workflowNames] with `workflowNames.orElse(null)`. */
        fun workflowNames(workflowNames: Optional<Boolean>) =
            workflowNames(workflowNames.getOrNull())

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
         * Returns an immutable instance of [EmailGetParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EmailGetParams =
            EmailGetParams(
                emailId,
                archived,
                includedProperties?.toImmutable(),
                includeStats,
                marketingCampaignNames,
                workflowNames,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> emailId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                archived?.let { put("archived", it.toString()) }
                includedProperties?.let { put("includedProperties", it.joinToString(",")) }
                includeStats?.let { put("includeStats", it.toString()) }
                marketingCampaignNames?.let { put("marketingCampaignNames", it.toString()) }
                workflowNames?.let { put("workflowNames", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailGetParams &&
            emailId == other.emailId &&
            archived == other.archived &&
            includedProperties == other.includedProperties &&
            includeStats == other.includeStats &&
            marketingCampaignNames == other.marketingCampaignNames &&
            workflowNames == other.workflowNames &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            emailId,
            archived,
            includedProperties,
            includeStats,
            marketingCampaignNames,
            workflowNames,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "EmailGetParams{emailId=$emailId, archived=$archived, includedProperties=$includedProperties, includeStats=$includeStats, marketingCampaignNames=$marketingCampaignNames, workflowNames=$workflowNames, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
