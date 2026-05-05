// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.Enum
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import com.hubspot.sdk.models.AssociationSpec
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class LookupAssociationSpec
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val associationSpec: JsonField<AssociationSpec>,
    private val cardinality: JsonField<Cardinality>,
    private val maxToObjectIds: JsonField<Int>,
    private val toObjectTypeId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("associationSpec")
        @ExcludeMissing
        associationSpec: JsonField<AssociationSpec> = JsonMissing.of(),
        @JsonProperty("cardinality")
        @ExcludeMissing
        cardinality: JsonField<Cardinality> = JsonMissing.of(),
        @JsonProperty("maxToObjectIds")
        @ExcludeMissing
        maxToObjectIds: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("toObjectTypeId")
        @ExcludeMissing
        toObjectTypeId: JsonField<String> = JsonMissing.of(),
    ) : this(associationSpec, cardinality, maxToObjectIds, toObjectTypeId, mutableMapOf())

    /**
     * Defines the type, direction, and details of the relationship between two CRM objects.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun associationSpec(): AssociationSpec = associationSpec.getRequired("associationSpec")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cardinality(): Optional<Cardinality> = cardinality.getOptional("cardinality")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxToObjectIds(): Optional<Int> = maxToObjectIds.getOptional("maxToObjectIds")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun toObjectTypeId(): Optional<String> = toObjectTypeId.getOptional("toObjectTypeId")

    /**
     * Returns the raw JSON value of [associationSpec].
     *
     * Unlike [associationSpec], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("associationSpec")
    @ExcludeMissing
    fun _associationSpec(): JsonField<AssociationSpec> = associationSpec

    /**
     * Returns the raw JSON value of [cardinality].
     *
     * Unlike [cardinality], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cardinality")
    @ExcludeMissing
    fun _cardinality(): JsonField<Cardinality> = cardinality

    /**
     * Returns the raw JSON value of [maxToObjectIds].
     *
     * Unlike [maxToObjectIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maxToObjectIds")
    @ExcludeMissing
    fun _maxToObjectIds(): JsonField<Int> = maxToObjectIds

    /**
     * Returns the raw JSON value of [toObjectTypeId].
     *
     * Unlike [toObjectTypeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("toObjectTypeId")
    @ExcludeMissing
    fun _toObjectTypeId(): JsonField<String> = toObjectTypeId

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
         * Returns a mutable builder for constructing an instance of [LookupAssociationSpec].
         *
         * The following fields are required:
         * ```java
         * .associationSpec()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LookupAssociationSpec]. */
    class Builder internal constructor() {

        private var associationSpec: JsonField<AssociationSpec>? = null
        private var cardinality: JsonField<Cardinality> = JsonMissing.of()
        private var maxToObjectIds: JsonField<Int> = JsonMissing.of()
        private var toObjectTypeId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(lookupAssociationSpec: LookupAssociationSpec) = apply {
            associationSpec = lookupAssociationSpec.associationSpec
            cardinality = lookupAssociationSpec.cardinality
            maxToObjectIds = lookupAssociationSpec.maxToObjectIds
            toObjectTypeId = lookupAssociationSpec.toObjectTypeId
            additionalProperties = lookupAssociationSpec.additionalProperties.toMutableMap()
        }

        /** Defines the type, direction, and details of the relationship between two CRM objects. */
        fun associationSpec(associationSpec: AssociationSpec) =
            associationSpec(JsonField.of(associationSpec))

        /**
         * Sets [Builder.associationSpec] to an arbitrary JSON value.
         *
         * You should usually call [Builder.associationSpec] with a well-typed [AssociationSpec]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun associationSpec(associationSpec: JsonField<AssociationSpec>) = apply {
            this.associationSpec = associationSpec
        }

        fun cardinality(cardinality: Cardinality) = cardinality(JsonField.of(cardinality))

        /**
         * Sets [Builder.cardinality] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardinality] with a well-typed [Cardinality] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cardinality(cardinality: JsonField<Cardinality>) = apply {
            this.cardinality = cardinality
        }

        fun maxToObjectIds(maxToObjectIds: Int) = maxToObjectIds(JsonField.of(maxToObjectIds))

        /**
         * Sets [Builder.maxToObjectIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxToObjectIds] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxToObjectIds(maxToObjectIds: JsonField<Int>) = apply {
            this.maxToObjectIds = maxToObjectIds
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
         * Returns an immutable instance of [LookupAssociationSpec].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .associationSpec()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LookupAssociationSpec =
            LookupAssociationSpec(
                checkRequired("associationSpec", associationSpec),
                cardinality,
                maxToObjectIds,
                toObjectTypeId,
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
    fun validate(): LookupAssociationSpec = apply {
        if (validated) {
            return@apply
        }

        associationSpec().validate()
        cardinality().ifPresent { it.validate() }
        maxToObjectIds()
        toObjectTypeId()
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
        (associationSpec.asKnown().getOrNull()?.validity() ?: 0) +
            (cardinality.asKnown().getOrNull()?.validity() ?: 0) +
            (if (maxToObjectIds.asKnown().isPresent) 1 else 0) +
            (if (toObjectTypeId.asKnown().isPresent) 1 else 0)

    class Cardinality @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ONE_TO_MANY = of("ONE_TO_MANY")

            @JvmField val ONE_TO_ONE = of("ONE_TO_ONE")

            @JvmStatic fun of(value: String) = Cardinality(JsonField.of(value))
        }

        /** An enum containing [Cardinality]'s known values. */
        enum class Known {
            ONE_TO_MANY,
            ONE_TO_ONE,
        }

        /**
         * An enum containing [Cardinality]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Cardinality] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ONE_TO_MANY,
            ONE_TO_ONE,
            /**
             * An enum member indicating that [Cardinality] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ONE_TO_MANY -> Value.ONE_TO_MANY
                ONE_TO_ONE -> Value.ONE_TO_ONE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HubSpotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                ONE_TO_MANY -> Known.ONE_TO_MANY
                ONE_TO_ONE -> Known.ONE_TO_ONE
                else -> throw HubSpotInvalidDataException("Unknown Cardinality: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HubSpotInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { HubSpotInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Cardinality = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Cardinality && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LookupAssociationSpec &&
            associationSpec == other.associationSpec &&
            cardinality == other.cardinality &&
            maxToObjectIds == other.maxToObjectIds &&
            toObjectTypeId == other.toObjectTypeId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            associationSpec,
            cardinality,
            maxToObjectIds,
            toObjectTypeId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LookupAssociationSpec{associationSpec=$associationSpec, cardinality=$cardinality, maxToObjectIds=$maxToObjectIds, toObjectTypeId=$toObjectTypeId, additionalProperties=$additionalProperties}"
}
