// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.limits

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class PipelineLimitResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val customObjectTypes: JsonField<CustomObjectRecordLimitResponse>,
    private val hubspotDefinedObjectTypes: JsonField<List<LimitAndUsageForObjectType>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("customObjectTypes")
        @ExcludeMissing
        customObjectTypes: JsonField<CustomObjectRecordLimitResponse> = JsonMissing.of(),
        @JsonProperty("hubspotDefinedObjectTypes")
        @ExcludeMissing
        hubspotDefinedObjectTypes: JsonField<List<LimitAndUsageForObjectType>> = JsonMissing.of(),
    ) : this(customObjectTypes, hubspotDefinedObjectTypes, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customObjectTypes(): CustomObjectRecordLimitResponse =
        customObjectTypes.getRequired("customObjectTypes")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hubspotDefinedObjectTypes(): List<LimitAndUsageForObjectType> =
        hubspotDefinedObjectTypes.getRequired("hubspotDefinedObjectTypes")

    /**
     * Returns the raw JSON value of [customObjectTypes].
     *
     * Unlike [customObjectTypes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("customObjectTypes")
    @ExcludeMissing
    fun _customObjectTypes(): JsonField<CustomObjectRecordLimitResponse> = customObjectTypes

    /**
     * Returns the raw JSON value of [hubspotDefinedObjectTypes].
     *
     * Unlike [hubspotDefinedObjectTypes], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("hubspotDefinedObjectTypes")
    @ExcludeMissing
    fun _hubspotDefinedObjectTypes(): JsonField<List<LimitAndUsageForObjectType>> =
        hubspotDefinedObjectTypes

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
         * Returns a mutable builder for constructing an instance of [PipelineLimitResponse].
         *
         * The following fields are required:
         * ```java
         * .customObjectTypes()
         * .hubspotDefinedObjectTypes()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PipelineLimitResponse]. */
    class Builder internal constructor() {

        private var customObjectTypes: JsonField<CustomObjectRecordLimitResponse>? = null
        private var hubspotDefinedObjectTypes: JsonField<MutableList<LimitAndUsageForObjectType>>? =
            null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(pipelineLimitResponse: PipelineLimitResponse) = apply {
            customObjectTypes = pipelineLimitResponse.customObjectTypes
            hubspotDefinedObjectTypes =
                pipelineLimitResponse.hubspotDefinedObjectTypes.map { it.toMutableList() }
            additionalProperties = pipelineLimitResponse.additionalProperties.toMutableMap()
        }

        fun customObjectTypes(customObjectTypes: CustomObjectRecordLimitResponse) =
            customObjectTypes(JsonField.of(customObjectTypes))

        /**
         * Sets [Builder.customObjectTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customObjectTypes] with a well-typed
         * [CustomObjectRecordLimitResponse] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun customObjectTypes(customObjectTypes: JsonField<CustomObjectRecordLimitResponse>) =
            apply {
                this.customObjectTypes = customObjectTypes
            }

        fun hubspotDefinedObjectTypes(hubspotDefinedObjectTypes: List<LimitAndUsageForObjectType>) =
            hubspotDefinedObjectTypes(JsonField.of(hubspotDefinedObjectTypes))

        /**
         * Sets [Builder.hubspotDefinedObjectTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hubspotDefinedObjectTypes] with a well-typed
         * `List<LimitAndUsageForObjectType>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun hubspotDefinedObjectTypes(
            hubspotDefinedObjectTypes: JsonField<List<LimitAndUsageForObjectType>>
        ) = apply {
            this.hubspotDefinedObjectTypes = hubspotDefinedObjectTypes.map { it.toMutableList() }
        }

        /**
         * Adds a single [LimitAndUsageForObjectType] to [hubspotDefinedObjectTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addHubspotDefinedObjectType(hubspotDefinedObjectType: LimitAndUsageForObjectType) =
            apply {
                hubspotDefinedObjectTypes =
                    (hubspotDefinedObjectTypes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("hubspotDefinedObjectTypes", it).add(hubspotDefinedObjectType)
                    }
            }

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
         * Returns an immutable instance of [PipelineLimitResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .customObjectTypes()
         * .hubspotDefinedObjectTypes()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PipelineLimitResponse =
            PipelineLimitResponse(
                checkRequired("customObjectTypes", customObjectTypes),
                checkRequired("hubspotDefinedObjectTypes", hubspotDefinedObjectTypes).map {
                    it.toImmutable()
                },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PipelineLimitResponse = apply {
        if (validated) {
            return@apply
        }

        customObjectTypes().validate()
        hubspotDefinedObjectTypes().forEach { it.validate() }
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: HubSpotInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (customObjectTypes.asKnown().getOrNull()?.validity() ?: 0) +
            (hubspotDefinedObjectTypes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PipelineLimitResponse &&
            customObjectTypes == other.customObjectTypes &&
            hubspotDefinedObjectTypes == other.hubspotDefinedObjectTypes &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(customObjectTypes, hubspotDefinedObjectTypes, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PipelineLimitResponse{customObjectTypes=$customObjectTypes, hubspotDefinedObjectTypes=$hubspotDefinedObjectTypes, additionalProperties=$additionalProperties}"
}
