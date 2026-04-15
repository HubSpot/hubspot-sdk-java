// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models

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
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** Defines the type, direction, and details of the relationship between two CRM objects. */
class AssociationSpec
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val associationCategory: JsonField<AssociationCategory>,
    private val associationTypeId: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("associationCategory")
        @ExcludeMissing
        associationCategory: JsonField<AssociationCategory> = JsonMissing.of(),
        @JsonProperty("associationTypeId")
        @ExcludeMissing
        associationTypeId: JsonField<Int> = JsonMissing.of(),
    ) : this(associationCategory, associationTypeId, mutableMapOf())

    /**
     * The category of the association, such as "HUBSPOT_DEFINED".
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun associationCategory(): AssociationCategory =
        associationCategory.getRequired("associationCategory")

    /**
     * The ID representing the specific type of association.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun associationTypeId(): Int = associationTypeId.getRequired("associationTypeId")

    /**
     * Returns the raw JSON value of [associationCategory].
     *
     * Unlike [associationCategory], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("associationCategory")
    @ExcludeMissing
    fun _associationCategory(): JsonField<AssociationCategory> = associationCategory

    /**
     * Returns the raw JSON value of [associationTypeId].
     *
     * Unlike [associationTypeId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("associationTypeId")
    @ExcludeMissing
    fun _associationTypeId(): JsonField<Int> = associationTypeId

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
         * Returns a mutable builder for constructing an instance of [AssociationSpec].
         *
         * The following fields are required:
         * ```java
         * .associationCategory()
         * .associationTypeId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AssociationSpec]. */
    class Builder internal constructor() {

        private var associationCategory: JsonField<AssociationCategory>? = null
        private var associationTypeId: JsonField<Int>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(associationSpec: AssociationSpec) = apply {
            associationCategory = associationSpec.associationCategory
            associationTypeId = associationSpec.associationTypeId
            additionalProperties = associationSpec.additionalProperties.toMutableMap()
        }

        /** The category of the association, such as "HUBSPOT_DEFINED". */
        fun associationCategory(associationCategory: AssociationCategory) =
            associationCategory(JsonField.of(associationCategory))

        /**
         * Sets [Builder.associationCategory] to an arbitrary JSON value.
         *
         * You should usually call [Builder.associationCategory] with a well-typed
         * [AssociationCategory] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun associationCategory(associationCategory: JsonField<AssociationCategory>) = apply {
            this.associationCategory = associationCategory
        }

        /** The ID representing the specific type of association. */
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
         * Returns an immutable instance of [AssociationSpec].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .associationCategory()
         * .associationTypeId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AssociationSpec =
            AssociationSpec(
                checkRequired("associationCategory", associationCategory),
                checkRequired("associationTypeId", associationTypeId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AssociationSpec = apply {
        if (validated) {
            return@apply
        }

        associationCategory().validate()
        associationTypeId()
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
        (associationCategory.asKnown().getOrNull()?.validity() ?: 0) +
            (if (associationTypeId.asKnown().isPresent) 1 else 0)

    /** The category of the association, such as "HUBSPOT_DEFINED". */
    class AssociationCategory
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val HUBSPOT_DEFINED = of("HUBSPOT_DEFINED")

            @JvmField val INTEGRATOR_DEFINED = of("INTEGRATOR_DEFINED")

            @JvmField val USER_DEFINED = of("USER_DEFINED")

            @JvmField val WORK = of("WORK")

            @JvmStatic fun of(value: String) = AssociationCategory(JsonField.of(value))
        }

        /** An enum containing [AssociationCategory]'s known values. */
        enum class Known {
            HUBSPOT_DEFINED,
            INTEGRATOR_DEFINED,
            USER_DEFINED,
            WORK,
        }

        /**
         * An enum containing [AssociationCategory]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AssociationCategory] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            HUBSPOT_DEFINED,
            INTEGRATOR_DEFINED,
            USER_DEFINED,
            WORK,
            /**
             * An enum member indicating that [AssociationCategory] was instantiated with an unknown
             * value.
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
                HUBSPOT_DEFINED -> Value.HUBSPOT_DEFINED
                INTEGRATOR_DEFINED -> Value.INTEGRATOR_DEFINED
                USER_DEFINED -> Value.USER_DEFINED
                WORK -> Value.WORK
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
                HUBSPOT_DEFINED -> Known.HUBSPOT_DEFINED
                INTEGRATOR_DEFINED -> Known.INTEGRATOR_DEFINED
                USER_DEFINED -> Known.USER_DEFINED
                WORK -> Known.WORK
                else -> throw HubSpotInvalidDataException("Unknown AssociationCategory: $value")
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

        fun validate(): AssociationCategory = apply {
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

            return other is AssociationCategory && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AssociationSpec &&
            associationCategory == other.associationCategory &&
            associationTypeId == other.associationTypeId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(associationCategory, associationTypeId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AssociationSpec{associationCategory=$associationCategory, associationTypeId=$associationTypeId, additionalProperties=$additionalProperties}"
}
