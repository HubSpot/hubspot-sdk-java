// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.actions

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
import kotlin.jvm.optionals.getOrNull

class OutputFieldDefinition
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val typeDefinition: JsonField<FieldTypeDefinition>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("typeDefinition")
        @ExcludeMissing
        typeDefinition: JsonField<FieldTypeDefinition> = JsonMissing.of()
    ) : this(typeDefinition, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun typeDefinition(): FieldTypeDefinition = typeDefinition.getRequired("typeDefinition")

    /**
     * Returns the raw JSON value of [typeDefinition].
     *
     * Unlike [typeDefinition], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("typeDefinition")
    @ExcludeMissing
    fun _typeDefinition(): JsonField<FieldTypeDefinition> = typeDefinition

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
         * Returns a mutable builder for constructing an instance of [OutputFieldDefinition].
         *
         * The following fields are required:
         * ```java
         * .typeDefinition()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OutputFieldDefinition]. */
    class Builder internal constructor() {

        private var typeDefinition: JsonField<FieldTypeDefinition>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(outputFieldDefinition: OutputFieldDefinition) = apply {
            typeDefinition = outputFieldDefinition.typeDefinition
            additionalProperties = outputFieldDefinition.additionalProperties.toMutableMap()
        }

        fun typeDefinition(typeDefinition: FieldTypeDefinition) =
            typeDefinition(JsonField.of(typeDefinition))

        /**
         * Sets [Builder.typeDefinition] to an arbitrary JSON value.
         *
         * You should usually call [Builder.typeDefinition] with a well-typed [FieldTypeDefinition]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun typeDefinition(typeDefinition: JsonField<FieldTypeDefinition>) = apply {
            this.typeDefinition = typeDefinition
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
         * Returns an immutable instance of [OutputFieldDefinition].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .typeDefinition()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OutputFieldDefinition =
            OutputFieldDefinition(
                checkRequired("typeDefinition", typeDefinition),
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
    fun validate(): OutputFieldDefinition = apply {
        if (validated) {
            return@apply
        }

        typeDefinition().validate()
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
    internal fun validity(): Int = (typeDefinition.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OutputFieldDefinition &&
            typeDefinition == other.typeDefinition &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(typeDefinition, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OutputFieldDefinition{typeDefinition=$typeDefinition, additionalProperties=$additionalProperties}"
}
