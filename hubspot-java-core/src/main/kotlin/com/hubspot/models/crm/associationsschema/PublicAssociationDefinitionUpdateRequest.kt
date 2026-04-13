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

class PublicAssociationDefinitionUpdateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val associationTypeId: JsonField<Int>,
    private val label: JsonField<String>,
    private val inverseLabel: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("associationTypeId")
        @ExcludeMissing
        associationTypeId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("inverseLabel")
        @ExcludeMissing
        inverseLabel: JsonField<String> = JsonMissing.of(),
    ) : this(associationTypeId, label, inverseLabel, mutableMapOf())

    /**
     * The unique identifier for the association type.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun associationTypeId(): Int = associationTypeId.getRequired("associationTypeId")

    /**
     * A descriptor that provides context about the relationship between associated records.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun label(): String = label.getRequired("label")

    /**
     * An optional descriptor for the inverse relationship between associated records.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inverseLabel(): Optional<String> = inverseLabel.getOptional("inverseLabel")

    /**
     * Returns the raw JSON value of [associationTypeId].
     *
     * Unlike [associationTypeId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("associationTypeId")
    @ExcludeMissing
    fun _associationTypeId(): JsonField<Int> = associationTypeId

    /**
     * Returns the raw JSON value of [label].
     *
     * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

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
         * [PublicAssociationDefinitionUpdateRequest].
         *
         * The following fields are required:
         * ```java
         * .associationTypeId()
         * .label()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicAssociationDefinitionUpdateRequest]. */
    class Builder internal constructor() {

        private var associationTypeId: JsonField<Int>? = null
        private var label: JsonField<String>? = null
        private var inverseLabel: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            publicAssociationDefinitionUpdateRequest: PublicAssociationDefinitionUpdateRequest
        ) = apply {
            associationTypeId = publicAssociationDefinitionUpdateRequest.associationTypeId
            label = publicAssociationDefinitionUpdateRequest.label
            inverseLabel = publicAssociationDefinitionUpdateRequest.inverseLabel
            additionalProperties =
                publicAssociationDefinitionUpdateRequest.additionalProperties.toMutableMap()
        }

        /** The unique identifier for the association type. */
        fun associationTypeId(associationTypeId: Int) =
            associationTypeId(JsonField.of(associationTypeId))

        /**
         * Sets [Builder.associationTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.associationTypeId] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun associationTypeId(associationTypeId: JsonField<Int>) = apply {
            this.associationTypeId = associationTypeId
        }

        /** A descriptor that provides context about the relationship between associated records. */
        fun label(label: String) = label(JsonField.of(label))

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: JsonField<String>) = apply { this.label = label }

        /** An optional descriptor for the inverse relationship between associated records. */
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
         * Returns an immutable instance of [PublicAssociationDefinitionUpdateRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .associationTypeId()
         * .label()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicAssociationDefinitionUpdateRequest =
            PublicAssociationDefinitionUpdateRequest(
                checkRequired("associationTypeId", associationTypeId),
                checkRequired("label", label),
                inverseLabel,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicAssociationDefinitionUpdateRequest = apply {
        if (validated) {
            return@apply
        }

        associationTypeId()
        label()
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
        (if (associationTypeId.asKnown().isPresent) 1 else 0) +
            (if (label.asKnown().isPresent) 1 else 0) +
            (if (inverseLabel.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicAssociationDefinitionUpdateRequest &&
            associationTypeId == other.associationTypeId &&
            label == other.label &&
            inverseLabel == other.inverseLabel &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(associationTypeId, label, inverseLabel, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicAssociationDefinitionUpdateRequest{associationTypeId=$associationTypeId, label=$label, inverseLabel=$inverseLabel, additionalProperties=$additionalProperties}"
}
