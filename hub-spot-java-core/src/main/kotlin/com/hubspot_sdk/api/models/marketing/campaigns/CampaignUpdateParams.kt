// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.campaigns

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Perform a partial update of a campaign identified by the specified campaignGuid. Provided
 * property values will be overwritten. Read-only and non-existent properties will cause 400 error.
 * If an empty string is passed for any property in the Batch Update, it will reset that property's
 * value.
 */
class CampaignUpdateParams
private constructor(
    private val campaignGuid: String?,
    private val publicCampaignInput: PublicCampaignInput,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun campaignGuid(): Optional<String> = Optional.ofNullable(campaignGuid)

    fun publicCampaignInput(): PublicCampaignInput = publicCampaignInput

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        publicCampaignInput._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CampaignUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .publicCampaignInput()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CampaignUpdateParams]. */
    class Builder internal constructor() {

        private var campaignGuid: String? = null
        private var publicCampaignInput: PublicCampaignInput? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(campaignUpdateParams: CampaignUpdateParams) = apply {
            campaignGuid = campaignUpdateParams.campaignGuid
            publicCampaignInput = campaignUpdateParams.publicCampaignInput
            additionalHeaders = campaignUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = campaignUpdateParams.additionalQueryParams.toBuilder()
        }

        fun campaignGuid(campaignGuid: String?) = apply { this.campaignGuid = campaignGuid }

        /** Alias for calling [Builder.campaignGuid] with `campaignGuid.orElse(null)`. */
        fun campaignGuid(campaignGuid: Optional<String>) = campaignGuid(campaignGuid.getOrNull())

        fun publicCampaignInput(publicCampaignInput: PublicCampaignInput) = apply {
            this.publicCampaignInput = publicCampaignInput
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
         * Returns an immutable instance of [CampaignUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .publicCampaignInput()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CampaignUpdateParams =
            CampaignUpdateParams(
                campaignGuid,
                checkRequired("publicCampaignInput", publicCampaignInput),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): PublicCampaignInput = publicCampaignInput

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> campaignGuid ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CampaignUpdateParams &&
            campaignGuid == other.campaignGuid &&
            publicCampaignInput == other.publicCampaignInput &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(campaignGuid, publicCampaignInput, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CampaignUpdateParams{campaignGuid=$campaignGuid, publicCampaignInput=$publicCampaignInput, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
