// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects

class ApiFlowEmailCampaign
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val emailCampaignId: JsonField<String>,
    private val emailContentId: JsonField<String>,
    private val flowId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("emailCampaignId")
        @ExcludeMissing
        emailCampaignId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("emailContentId")
        @ExcludeMissing
        emailContentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("flowId") @ExcludeMissing flowId: JsonField<String> = JsonMissing.of(),
    ) : this(emailCampaignId, emailContentId, flowId, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun emailCampaignId(): String = emailCampaignId.getRequired("emailCampaignId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun emailContentId(): String = emailContentId.getRequired("emailContentId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun flowId(): String = flowId.getRequired("flowId")

    /**
     * Returns the raw JSON value of [emailCampaignId].
     *
     * Unlike [emailCampaignId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("emailCampaignId")
    @ExcludeMissing
    fun _emailCampaignId(): JsonField<String> = emailCampaignId

    /**
     * Returns the raw JSON value of [emailContentId].
     *
     * Unlike [emailContentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("emailContentId")
    @ExcludeMissing
    fun _emailContentId(): JsonField<String> = emailContentId

    /**
     * Returns the raw JSON value of [flowId].
     *
     * Unlike [flowId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("flowId") @ExcludeMissing fun _flowId(): JsonField<String> = flowId

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ApiFlowEmailCampaign].
         *
         * The following fields are required:
         * ```java
         * .emailCampaignId()
         * .emailContentId()
         * .flowId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ApiFlowEmailCampaign]. */
    class Builder internal constructor() {

        private var emailCampaignId: JsonField<String>? = null
        private var emailContentId: JsonField<String>? = null
        private var flowId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(apiFlowEmailCampaign: ApiFlowEmailCampaign) = apply {
            emailCampaignId = apiFlowEmailCampaign.emailCampaignId
            emailContentId = apiFlowEmailCampaign.emailContentId
            flowId = apiFlowEmailCampaign.flowId
            additionalProperties = apiFlowEmailCampaign.additionalProperties.toMutableMap()
        }

        fun emailCampaignId(emailCampaignId: String) =
            emailCampaignId(JsonField.of(emailCampaignId))

        /**
         * Sets [Builder.emailCampaignId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emailCampaignId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun emailCampaignId(emailCampaignId: JsonField<String>) = apply {
            this.emailCampaignId = emailCampaignId
        }

        fun emailContentId(emailContentId: String) = emailContentId(JsonField.of(emailContentId))

        /**
         * Sets [Builder.emailContentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emailContentId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun emailContentId(emailContentId: JsonField<String>) = apply {
            this.emailContentId = emailContentId
        }

        fun flowId(flowId: String) = flowId(JsonField.of(flowId))

        /**
         * Sets [Builder.flowId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.flowId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun flowId(flowId: JsonField<String>) = apply { this.flowId = flowId }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [ApiFlowEmailCampaign].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .emailCampaignId()
         * .emailContentId()
         * .flowId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ApiFlowEmailCampaign =
            ApiFlowEmailCampaign(
                checkRequired("emailCampaignId", emailCampaignId),
                checkRequired("emailContentId", emailContentId),
                checkRequired("flowId", flowId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ApiFlowEmailCampaign = apply {
        if (validated) {
            return@apply
        }

        emailCampaignId()
        emailContentId()
        flowId()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: HubspotInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (emailCampaignId.asKnown().isPresent) 1 else 0) +
            (if (emailContentId.asKnown().isPresent) 1 else 0) +
            (if (flowId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ApiFlowEmailCampaign &&
            emailCampaignId == other.emailCampaignId &&
            emailContentId == other.emailContentId &&
            flowId == other.flowId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(emailCampaignId, emailContentId, flowId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ApiFlowEmailCampaign{emailCampaignId=$emailCampaignId, emailContentId=$emailContentId, flowId=$flowId, additionalProperties=$additionalProperties}"
}
