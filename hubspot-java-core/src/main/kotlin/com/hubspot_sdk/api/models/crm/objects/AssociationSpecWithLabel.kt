// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.Enum
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Defines the type, direction, and details of the relationship between two CRM objects. */
class AssociationSpecWithLabel
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val category: JsonField<Category>,
    private val typeId: JsonField<Int>,
    private val label: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("category") @ExcludeMissing category: JsonField<Category> = JsonMissing.of(),
        @JsonProperty("typeId") @ExcludeMissing typeId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
    ) : this(category, typeId, label, mutableMapOf())

    /**
     * Association category. Can be HUBSPOT_DEFINED, USER_DEFINED, INTEGRATOR_DEFINED or WORK
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun category(): Category = category.getRequired("category")

    /**
     * An integer value used to uniquely identify a specific association type within its Association
     * Category.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun typeId(): Int = typeId.getRequired("typeId")

    /**
     * An optional descriptor that provides additional context about the relationship between
     * associated records, such as "Mentor" and "Mentee".
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun label(): Optional<String> = label.getOptional("label")

    /**
     * Returns the raw JSON value of [category].
     *
     * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

    /**
     * Returns the raw JSON value of [typeId].
     *
     * Unlike [typeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("typeId") @ExcludeMissing fun _typeId(): JsonField<Int> = typeId

    /**
     * Returns the raw JSON value of [label].
     *
     * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

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
         * Returns a mutable builder for constructing an instance of [AssociationSpecWithLabel].
         *
         * The following fields are required:
         * ```java
         * .category()
         * .typeId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AssociationSpecWithLabel]. */
    class Builder internal constructor() {

        private var category: JsonField<Category>? = null
        private var typeId: JsonField<Int>? = null
        private var label: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(associationSpecWithLabel: AssociationSpecWithLabel) = apply {
            category = associationSpecWithLabel.category
            typeId = associationSpecWithLabel.typeId
            label = associationSpecWithLabel.label
            additionalProperties = associationSpecWithLabel.additionalProperties.toMutableMap()
        }

        /**
         * Association category. Can be HUBSPOT_DEFINED, USER_DEFINED, INTEGRATOR_DEFINED or WORK
         */
        fun category(category: Category) = category(JsonField.of(category))

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed [Category] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun category(category: JsonField<Category>) = apply { this.category = category }

        /**
         * An integer value used to uniquely identify a specific association type within its
         * Association Category.
         */
        fun typeId(typeId: Int) = typeId(JsonField.of(typeId))

        /**
         * Sets [Builder.typeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.typeId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun typeId(typeId: JsonField<Int>) = apply { this.typeId = typeId }

        /**
         * An optional descriptor that provides additional context about the relationship between
         * associated records, such as "Mentor" and "Mentee".
         */
        fun label(label: String) = label(JsonField.of(label))

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: JsonField<String>) = apply { this.label = label }

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
         * Returns an immutable instance of [AssociationSpecWithLabel].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .category()
         * .typeId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AssociationSpecWithLabel =
            AssociationSpecWithLabel(
                checkRequired("category", category),
                checkRequired("typeId", typeId),
                label,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AssociationSpecWithLabel = apply {
        if (validated) {
            return@apply
        }

        category().validate()
        typeId()
        label()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: HubspotInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (category.asKnown().getOrNull()?.validity() ?: 0) +
            (if (typeId.asKnown().isPresent) 1 else 0) +
            (if (label.asKnown().isPresent) 1 else 0)

    /** Association category. Can be HUBSPOT_DEFINED, USER_DEFINED, INTEGRATOR_DEFINED or WORK */
    class Category @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmStatic fun of(value: String) = Category(JsonField.of(value))
        }

        /** An enum containing [Category]'s known values. */
        enum class Known {
            HUBSPOT_DEFINED,
            INTEGRATOR_DEFINED,
            USER_DEFINED,
            WORK,
        }

        /**
         * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Category] can contain an unknown value in a couple of cases:
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
            /** An enum member indicating that [Category] was instantiated with an unknown value. */
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
         * @throws HubspotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                HUBSPOT_DEFINED -> Known.HUBSPOT_DEFINED
                INTEGRATOR_DEFINED -> Known.INTEGRATOR_DEFINED
                USER_DEFINED -> Known.USER_DEFINED
                WORK -> Known.WORK
                else -> throw HubspotInvalidDataException("Unknown Category: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HubspotInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { HubspotInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): Category = apply {
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
            } catch (e: HubspotInvalidDataException) {
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

            return other is Category && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AssociationSpecWithLabel &&
            category == other.category &&
            typeId == other.typeId &&
            label == other.label &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(category, typeId, label, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AssociationSpecWithLabel{category=$category, typeId=$typeId, label=$label, additionalProperties=$additionalProperties}"
}
