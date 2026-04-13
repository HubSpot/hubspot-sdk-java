// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.associationsschema

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.core.ExcludeMissing
import com.hubspot.core.JsonField
import com.hubspot.core.JsonMissing
import com.hubspot.core.JsonValue
import com.hubspot.core.checkRequired
import com.hubspot.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class PublicAssociationDefinitionCreateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val label: JsonField<String>,
    private val name: JsonField<String>,
    private val inverseLabel: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("inverseLabel")
        @ExcludeMissing
        inverseLabel: JsonField<String> = JsonMissing.of(),
    ) : this(label, name, inverseLabel, mutableMapOf())

    /**
     * A descriptor that provides context about the relationship between two associated CRM objects.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun label(): String = label.getRequired("label")

    /**
     * The unique identifier for the association definition.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * An optional descriptor that clarifies the reverse relationship in the association.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inverseLabel(): Optional<String> = inverseLabel.getOptional("inverseLabel")

    /**
     * Returns the raw JSON value of [label].
     *
     * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [inverseLabel].
     *
     * Unlike [inverseLabel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inverseLabel")
    @ExcludeMissing
    fun _inverseLabel(): JsonField<String> = inverseLabel

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
         * [PublicAssociationDefinitionCreateRequest].
         *
         * The following fields are required:
         * ```java
         * .label()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicAssociationDefinitionCreateRequest]. */
    class Builder internal constructor() {

        private var label: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var inverseLabel: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            publicAssociationDefinitionCreateRequest: PublicAssociationDefinitionCreateRequest
        ) = apply {
            label = publicAssociationDefinitionCreateRequest.label
            name = publicAssociationDefinitionCreateRequest.name
            inverseLabel = publicAssociationDefinitionCreateRequest.inverseLabel
            additionalProperties =
                publicAssociationDefinitionCreateRequest.additionalProperties.toMutableMap()
        }

        /**
         * A descriptor that provides context about the relationship between two associated CRM
         * objects.
         */
        fun label(label: String) = label(JsonField.of(label))

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: JsonField<String>) = apply { this.label = label }

        /** The unique identifier for the association definition. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** An optional descriptor that clarifies the reverse relationship in the association. */
        fun inverseLabel(inverseLabel: String) = inverseLabel(JsonField.of(inverseLabel))

        /**
         * Sets [Builder.inverseLabel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inverseLabel] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun inverseLabel(inverseLabel: JsonField<String>) = apply {
            this.inverseLabel = inverseLabel
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
         * Returns an immutable instance of [PublicAssociationDefinitionCreateRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .label()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicAssociationDefinitionCreateRequest =
            PublicAssociationDefinitionCreateRequest(
                checkRequired("label", label),
                checkRequired("name", name),
                inverseLabel,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicAssociationDefinitionCreateRequest = apply {
        if (validated) {
            return@apply
        }

        label()
        name()
        inverseLabel()
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
        (if (label.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (inverseLabel.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicAssociationDefinitionCreateRequest &&
            label == other.label &&
            name == other.name &&
            inverseLabel == other.inverseLabel &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(label, name, inverseLabel, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicAssociationDefinitionCreateRequest{label=$label, name=$name, inverseLabel=$inverseLabel, additionalProperties=$additionalProperties}"
}
