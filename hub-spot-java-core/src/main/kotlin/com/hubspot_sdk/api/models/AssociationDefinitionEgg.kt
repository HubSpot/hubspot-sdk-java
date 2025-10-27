// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

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
import java.util.Optional

class AssociationDefinitionEgg
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val fromObjectTypeId: JsonField<String>,
    private val toObjectTypeId: JsonField<String>,
    private val name: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("fromObjectTypeId")
        @ExcludeMissing
        fromObjectTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("toObjectTypeId")
        @ExcludeMissing
        toObjectTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
    ) : this(fromObjectTypeId, toObjectTypeId, name, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fromObjectTypeId(): String = fromObjectTypeId.getRequired("fromObjectTypeId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun toObjectTypeId(): String = toObjectTypeId.getRequired("toObjectTypeId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Returns the raw JSON value of [fromObjectTypeId].
     *
     * Unlike [fromObjectTypeId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("fromObjectTypeId")
    @ExcludeMissing
    fun _fromObjectTypeId(): JsonField<String> = fromObjectTypeId

    /**
     * Returns the raw JSON value of [toObjectTypeId].
     *
     * Unlike [toObjectTypeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("toObjectTypeId")
    @ExcludeMissing
    fun _toObjectTypeId(): JsonField<String> = toObjectTypeId

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
         * Returns a mutable builder for constructing an instance of [AssociationDefinitionEgg].
         *
         * The following fields are required:
         * ```java
         * .fromObjectTypeId()
         * .toObjectTypeId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AssociationDefinitionEgg]. */
    class Builder internal constructor() {

        private var fromObjectTypeId: JsonField<String>? = null
        private var toObjectTypeId: JsonField<String>? = null
        private var name: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(associationDefinitionEgg: AssociationDefinitionEgg) = apply {
            fromObjectTypeId = associationDefinitionEgg.fromObjectTypeId
            toObjectTypeId = associationDefinitionEgg.toObjectTypeId
            name = associationDefinitionEgg.name
            additionalProperties = associationDefinitionEgg.additionalProperties.toMutableMap()
        }

        fun fromObjectTypeId(fromObjectTypeId: String) =
            fromObjectTypeId(JsonField.of(fromObjectTypeId))

        /**
         * Sets [Builder.fromObjectTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fromObjectTypeId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fromObjectTypeId(fromObjectTypeId: JsonField<String>) = apply {
            this.fromObjectTypeId = fromObjectTypeId
        }

        fun toObjectTypeId(toObjectTypeId: String) = toObjectTypeId(JsonField.of(toObjectTypeId))

        /**
         * Sets [Builder.toObjectTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toObjectTypeId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun toObjectTypeId(toObjectTypeId: JsonField<String>) = apply {
            this.toObjectTypeId = toObjectTypeId
        }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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
         * Returns an immutable instance of [AssociationDefinitionEgg].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .fromObjectTypeId()
         * .toObjectTypeId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AssociationDefinitionEgg =
            AssociationDefinitionEgg(
                checkRequired("fromObjectTypeId", fromObjectTypeId),
                checkRequired("toObjectTypeId", toObjectTypeId),
                name,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AssociationDefinitionEgg = apply {
        if (validated) {
            return@apply
        }

        fromObjectTypeId()
        toObjectTypeId()
        name()
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
        (if (fromObjectTypeId.asKnown().isPresent) 1 else 0) +
            (if (toObjectTypeId.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AssociationDefinitionEgg &&
            fromObjectTypeId == other.fromObjectTypeId &&
            toObjectTypeId == other.toObjectTypeId &&
            name == other.name &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(fromObjectTypeId, toObjectTypeId, name, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AssociationDefinitionEgg{fromObjectTypeId=$fromObjectTypeId, toObjectTypeId=$toObjectTypeId, name=$name, additionalProperties=$additionalProperties}"
}
