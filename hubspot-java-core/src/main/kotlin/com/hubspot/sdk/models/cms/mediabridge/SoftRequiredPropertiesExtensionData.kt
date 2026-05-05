// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects

class SoftRequiredPropertiesExtensionData
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val isSoftRequiredProperty: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("isSoftRequiredProperty")
        @ExcludeMissing
        isSoftRequiredProperty: JsonField<Boolean> = JsonMissing.of()
    ) : this(isSoftRequiredProperty, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isSoftRequiredProperty(): Boolean =
        isSoftRequiredProperty.getRequired("isSoftRequiredProperty")

    /**
     * Returns the raw JSON value of [isSoftRequiredProperty].
     *
     * Unlike [isSoftRequiredProperty], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("isSoftRequiredProperty")
    @ExcludeMissing
    fun _isSoftRequiredProperty(): JsonField<Boolean> = isSoftRequiredProperty

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
         * Returns a mutable builder for constructing an instance of
         * [SoftRequiredPropertiesExtensionData].
         *
         * The following fields are required:
         * ```java
         * .isSoftRequiredProperty()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SoftRequiredPropertiesExtensionData]. */
    class Builder internal constructor() {

        private var isSoftRequiredProperty: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            softRequiredPropertiesExtensionData: SoftRequiredPropertiesExtensionData
        ) = apply {
            isSoftRequiredProperty = softRequiredPropertiesExtensionData.isSoftRequiredProperty
            additionalProperties =
                softRequiredPropertiesExtensionData.additionalProperties.toMutableMap()
        }

        fun isSoftRequiredProperty(isSoftRequiredProperty: Boolean) =
            isSoftRequiredProperty(JsonField.of(isSoftRequiredProperty))

        /**
         * Sets [Builder.isSoftRequiredProperty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isSoftRequiredProperty] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun isSoftRequiredProperty(isSoftRequiredProperty: JsonField<Boolean>) = apply {
            this.isSoftRequiredProperty = isSoftRequiredProperty
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
         * Returns an immutable instance of [SoftRequiredPropertiesExtensionData].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .isSoftRequiredProperty()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SoftRequiredPropertiesExtensionData =
            SoftRequiredPropertiesExtensionData(
                checkRequired("isSoftRequiredProperty", isSoftRequiredProperty),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): SoftRequiredPropertiesExtensionData = apply {
        if (validated) {
            return@apply
        }

        isSoftRequiredProperty()
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
    internal fun validity(): Int = (if (isSoftRequiredProperty.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SoftRequiredPropertiesExtensionData &&
            isSoftRequiredProperty == other.isSoftRequiredProperty &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(isSoftRequiredProperty, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SoftRequiredPropertiesExtensionData{isSoftRequiredProperty=$isSoftRequiredProperty, additionalProperties=$additionalProperties}"
}
