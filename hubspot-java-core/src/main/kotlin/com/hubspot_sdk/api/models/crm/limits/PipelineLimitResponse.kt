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
    private val hubSpotDefinedObjectTypes: JsonField<List<LimitAndUsageForObjectType>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("customObjectTypes")
        @ExcludeMissing
        customObjectTypes: JsonField<CustomObjectRecordLimitResponse> = JsonMissing.of(),
        @JsonProperty("hubspotDefinedObjectTypes")
        @ExcludeMissing
        hubSpotDefinedObjectTypes: JsonField<List<LimitAndUsageForObjectType>> = JsonMissing.of(),
    ) : this(customObjectTypes, hubSpotDefinedObjectTypes, mutableMapOf())

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
    fun hubSpotDefinedObjectTypes(): List<LimitAndUsageForObjectType> =
        hubSpotDefinedObjectTypes.getRequired("hubspotDefinedObjectTypes")

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
     * Returns the raw JSON value of [hubSpotDefinedObjectTypes].
     *
     * Unlike [hubSpotDefinedObjectTypes], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("hubspotDefinedObjectTypes")
    @ExcludeMissing
    fun _hubSpotDefinedObjectTypes(): JsonField<List<LimitAndUsageForObjectType>> =
        hubSpotDefinedObjectTypes

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
         * .hubSpotDefinedObjectTypes()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PipelineLimitResponse]. */
    class Builder internal constructor() {

        private var customObjectTypes: JsonField<CustomObjectRecordLimitResponse>? = null
        private var hubSpotDefinedObjectTypes: JsonField<MutableList<LimitAndUsageForObjectType>>? =
            null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(pipelineLimitResponse: PipelineLimitResponse) = apply {
            customObjectTypes = pipelineLimitResponse.customObjectTypes
            hubSpotDefinedObjectTypes =
                pipelineLimitResponse.hubSpotDefinedObjectTypes.map { it.toMutableList() }
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

        fun hubSpotDefinedObjectTypes(hubSpotDefinedObjectTypes: List<LimitAndUsageForObjectType>) =
            hubSpotDefinedObjectTypes(JsonField.of(hubSpotDefinedObjectTypes))

        /**
         * Sets [Builder.hubSpotDefinedObjectTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hubSpotDefinedObjectTypes] with a well-typed
         * `List<LimitAndUsageForObjectType>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun hubSpotDefinedObjectTypes(
            hubSpotDefinedObjectTypes: JsonField<List<LimitAndUsageForObjectType>>
        ) = apply {
            this.hubSpotDefinedObjectTypes = hubSpotDefinedObjectTypes.map { it.toMutableList() }
        }

        /**
         * Adds a single [LimitAndUsageForObjectType] to [hubSpotDefinedObjectTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addHubSpotDefinedObjectType(hubSpotDefinedObjectType: LimitAndUsageForObjectType) =
            apply {
                hubSpotDefinedObjectTypes =
                    (hubSpotDefinedObjectTypes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("hubSpotDefinedObjectTypes", it).add(hubSpotDefinedObjectType)
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
         * .hubSpotDefinedObjectTypes()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PipelineLimitResponse =
            PipelineLimitResponse(
                checkRequired("customObjectTypes", customObjectTypes),
                checkRequired("hubSpotDefinedObjectTypes", hubSpotDefinedObjectTypes).map {
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
        hubSpotDefinedObjectTypes().forEach { it.validate() }
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
            (hubSpotDefinedObjectTypes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PipelineLimitResponse &&
            customObjectTypes == other.customObjectTypes &&
            hubSpotDefinedObjectTypes == other.hubSpotDefinedObjectTypes &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(customObjectTypes, hubSpotDefinedObjectTypes, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PipelineLimitResponse{customObjectTypes=$customObjectTypes, hubSpotDefinedObjectTypes=$hubSpotDefinedObjectTypes, additionalProperties=$additionalProperties}"
}
