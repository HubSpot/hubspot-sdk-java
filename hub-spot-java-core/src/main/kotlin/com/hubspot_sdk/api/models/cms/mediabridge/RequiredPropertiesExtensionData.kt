// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects

class RequiredPropertiesExtensionData
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val isRequiredProperty: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("isRequiredProperty")
        @ExcludeMissing
        isRequiredProperty: JsonField<Boolean> = JsonMissing.of()
    ) : this(isRequiredProperty, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isRequiredProperty(): Boolean = isRequiredProperty.getRequired("isRequiredProperty")

    /**
     * Returns the raw JSON value of [isRequiredProperty].
     *
     * Unlike [isRequiredProperty], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("isRequiredProperty")
    @ExcludeMissing
    fun _isRequiredProperty(): JsonField<Boolean> = isRequiredProperty

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
         * [RequiredPropertiesExtensionData].
         *
         * The following fields are required:
         * ```java
         * .isRequiredProperty()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RequiredPropertiesExtensionData]. */
    class Builder internal constructor() {

        private var isRequiredProperty: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(requiredPropertiesExtensionData: RequiredPropertiesExtensionData) =
            apply {
                isRequiredProperty = requiredPropertiesExtensionData.isRequiredProperty
                additionalProperties =
                    requiredPropertiesExtensionData.additionalProperties.toMutableMap()
            }

        fun isRequiredProperty(isRequiredProperty: Boolean) =
            isRequiredProperty(JsonField.of(isRequiredProperty))

        /**
         * Sets [Builder.isRequiredProperty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isRequiredProperty] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isRequiredProperty(isRequiredProperty: JsonField<Boolean>) = apply {
            this.isRequiredProperty = isRequiredProperty
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
         * Returns an immutable instance of [RequiredPropertiesExtensionData].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .isRequiredProperty()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RequiredPropertiesExtensionData =
            RequiredPropertiesExtensionData(
                checkRequired("isRequiredProperty", isRequiredProperty),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RequiredPropertiesExtensionData = apply {
        if (validated) {
            return@apply
        }

        isRequiredProperty()
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
    internal fun validity(): Int = (if (isRequiredProperty.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RequiredPropertiesExtensionData &&
            isRequiredProperty == other.isRequiredProperty &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(isRequiredProperty, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RequiredPropertiesExtensionData{isRequiredProperty=$isRequiredProperty, additionalProperties=$additionalProperties}"
}
