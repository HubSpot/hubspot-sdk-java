// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.cards

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.Enum
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

/** Definition for a card display property. */
class CardDisplayProperty
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val dataType: JsonField<DataType>,
    private val label: JsonField<String>,
    private val name: JsonField<String>,
    private val options: JsonField<List<DisplayOption>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("dataType") @ExcludeMissing dataType: JsonField<DataType> = JsonMissing.of(),
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("options")
        @ExcludeMissing
        options: JsonField<List<DisplayOption>> = JsonMissing.of(),
    ) : this(dataType, label, name, options, mutableMapOf())

    /**
     * Type of data represented by this property.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dataType(): DataType = dataType.getRequired("dataType")

    /**
     * The label for this property as you'd like it displayed to users.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun label(): String = label.getRequired("label")

    /**
     * An internal identifier for this property. This value must be unique TODO.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * An array of available options that can be displayed. Only used in when `dataType` is
     * `STATUS`.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun options(): List<DisplayOption> = options.getRequired("options")

    /**
     * Returns the raw JSON value of [dataType].
     *
     * Unlike [dataType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dataType") @ExcludeMissing fun _dataType(): JsonField<DataType> = dataType

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
     * Returns the raw JSON value of [options].
     *
     * Unlike [options], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("options")
    @ExcludeMissing
    fun _options(): JsonField<List<DisplayOption>> = options

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
         * Returns a mutable builder for constructing an instance of [CardDisplayProperty].
         *
         * The following fields are required:
         * ```java
         * .dataType()
         * .label()
         * .name()
         * .options()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardDisplayProperty]. */
    class Builder internal constructor() {

        private var dataType: JsonField<DataType>? = null
        private var label: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var options: JsonField<MutableList<DisplayOption>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardDisplayProperty: CardDisplayProperty) = apply {
            dataType = cardDisplayProperty.dataType
            label = cardDisplayProperty.label
            name = cardDisplayProperty.name
            options = cardDisplayProperty.options.map { it.toMutableList() }
            additionalProperties = cardDisplayProperty.additionalProperties.toMutableMap()
        }

        /** Type of data represented by this property. */
        fun dataType(dataType: DataType) = dataType(JsonField.of(dataType))

        /**
         * Sets [Builder.dataType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataType] with a well-typed [DataType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dataType(dataType: JsonField<DataType>) = apply { this.dataType = dataType }

        /** The label for this property as you'd like it displayed to users. */
        fun label(label: String) = label(JsonField.of(label))

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: JsonField<String>) = apply { this.label = label }

        /** An internal identifier for this property. This value must be unique TODO. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * An array of available options that can be displayed. Only used in when `dataType` is
         * `STATUS`.
         */
        fun options(options: List<DisplayOption>) = options(JsonField.of(options))

        /**
         * Sets [Builder.options] to an arbitrary JSON value.
         *
         * You should usually call [Builder.options] with a well-typed `List<DisplayOption>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun options(options: JsonField<List<DisplayOption>>) = apply {
            this.options = options.map { it.toMutableList() }
        }

        /**
         * Adds a single [DisplayOption] to [options].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOption(option: DisplayOption) = apply {
            options =
                (options ?: JsonField.of(mutableListOf())).also {
                    checkKnown("options", it).add(option)
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
         * Returns an immutable instance of [CardDisplayProperty].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .dataType()
         * .label()
         * .name()
         * .options()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardDisplayProperty =
            CardDisplayProperty(
                checkRequired("dataType", dataType),
                checkRequired("label", label),
                checkRequired("name", name),
                checkRequired("options", options).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CardDisplayProperty = apply {
        if (validated) {
            return@apply
        }

        dataType().validate()
        label()
        name()
        options().forEach { it.validate() }
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
        (dataType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (label.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (options.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /** Type of data represented by this property. */
    class DataType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val BOOLEAN = of("BOOLEAN")

            @JvmField val CURRENCY = of("CURRENCY")

            @JvmField val DATE = of("DATE")

            @JvmField val DATETIME = of("DATETIME")

            @JvmField val EMAIL = of("EMAIL")

            @JvmField val LINK = of("LINK")

            @JvmField val NUMERIC = of("NUMERIC")

            @JvmField val STRING = of("STRING")

            @JvmField val STATUS = of("STATUS")

            @JvmStatic fun of(value: String) = DataType(JsonField.of(value))
        }

        /** An enum containing [DataType]'s known values. */
        enum class Known {
            BOOLEAN,
            CURRENCY,
            DATE,
            DATETIME,
            EMAIL,
            LINK,
            NUMERIC,
            STRING,
            STATUS,
        }

        /**
         * An enum containing [DataType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DataType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BOOLEAN,
            CURRENCY,
            DATE,
            DATETIME,
            EMAIL,
            LINK,
            NUMERIC,
            STRING,
            STATUS,
            /** An enum member indicating that [DataType] was instantiated with an unknown value. */
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
                BOOLEAN -> Value.BOOLEAN
                CURRENCY -> Value.CURRENCY
                DATE -> Value.DATE
                DATETIME -> Value.DATETIME
                EMAIL -> Value.EMAIL
                LINK -> Value.LINK
                NUMERIC -> Value.NUMERIC
                STRING -> Value.STRING
                STATUS -> Value.STATUS
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
                BOOLEAN -> Known.BOOLEAN
                CURRENCY -> Known.CURRENCY
                DATE -> Known.DATE
                DATETIME -> Known.DATETIME
                EMAIL -> Known.EMAIL
                LINK -> Known.LINK
                NUMERIC -> Known.NUMERIC
                STRING -> Known.STRING
                STATUS -> Known.STATUS
                else -> throw HubSpotInvalidDataException("Unknown DataType: $value")
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

        fun validate(): DataType = apply {
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

            return other is DataType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardDisplayProperty &&
            dataType == other.dataType &&
            label == other.label &&
            name == other.name &&
            options == other.options &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(dataType, label, name, options, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardDisplayProperty{dataType=$dataType, label=$label, name=$name, options=$options, additionalProperties=$additionalProperties}"
}
