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
import com.hubspot.sdk.core.checkKnown
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.toImmutable
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class BatchReadInputPropertyName
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val archived: JsonField<Boolean>,
    private val dataSensitivity: JsonField<DataSensitivity>,
    private val inputs: JsonField<List<PropertyName>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("archived") @ExcludeMissing archived: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("dataSensitivity")
        @ExcludeMissing
        dataSensitivity: JsonField<DataSensitivity> = JsonMissing.of(),
        @JsonProperty("inputs")
        @ExcludeMissing
        inputs: JsonField<List<PropertyName>> = JsonMissing.of(),
    ) : this(archived, dataSensitivity, inputs, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun archived(): Boolean = archived.getRequired("archived")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dataSensitivity(): DataSensitivity = dataSensitivity.getRequired("dataSensitivity")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inputs(): List<PropertyName> = inputs.getRequired("inputs")

    /**
     * Returns the raw JSON value of [archived].
     *
     * Unlike [archived], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("archived") @ExcludeMissing fun _archived(): JsonField<Boolean> = archived

    /**
     * Returns the raw JSON value of [dataSensitivity].
     *
     * Unlike [dataSensitivity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dataSensitivity")
    @ExcludeMissing
    fun _dataSensitivity(): JsonField<DataSensitivity> = dataSensitivity

    /**
     * Returns the raw JSON value of [inputs].
     *
     * Unlike [inputs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inputs") @ExcludeMissing fun _inputs(): JsonField<List<PropertyName>> = inputs

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
         * Returns a mutable builder for constructing an instance of [BatchReadInputPropertyName].
         *
         * The following fields are required:
         * ```java
         * .archived()
         * .dataSensitivity()
         * .inputs()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BatchReadInputPropertyName]. */
    class Builder internal constructor() {

        private var archived: JsonField<Boolean>? = null
        private var dataSensitivity: JsonField<DataSensitivity>? = null
        private var inputs: JsonField<MutableList<PropertyName>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(batchReadInputPropertyName: BatchReadInputPropertyName) = apply {
            archived = batchReadInputPropertyName.archived
            dataSensitivity = batchReadInputPropertyName.dataSensitivity
            inputs = batchReadInputPropertyName.inputs.map { it.toMutableList() }
            additionalProperties = batchReadInputPropertyName.additionalProperties.toMutableMap()
        }

        fun archived(archived: Boolean) = archived(JsonField.of(archived))

        /**
         * Sets [Builder.archived] to an arbitrary JSON value.
         *
         * You should usually call [Builder.archived] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun archived(archived: JsonField<Boolean>) = apply { this.archived = archived }

        fun dataSensitivity(dataSensitivity: DataSensitivity) =
            dataSensitivity(JsonField.of(dataSensitivity))

        /**
         * Sets [Builder.dataSensitivity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataSensitivity] with a well-typed [DataSensitivity]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun dataSensitivity(dataSensitivity: JsonField<DataSensitivity>) = apply {
            this.dataSensitivity = dataSensitivity
        }

        fun inputs(inputs: List<PropertyName>) = inputs(JsonField.of(inputs))

        /**
         * Sets [Builder.inputs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inputs] with a well-typed `List<PropertyName>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun inputs(inputs: JsonField<List<PropertyName>>) = apply {
            this.inputs = inputs.map { it.toMutableList() }
        }

        /**
         * Adds a single [PropertyName] to [inputs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInput(input: PropertyName) = apply {
            inputs =
                (inputs ?: JsonField.of(mutableListOf())).also {
                    checkKnown("inputs", it).add(input)
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
         * Returns an immutable instance of [BatchReadInputPropertyName].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .archived()
         * .dataSensitivity()
         * .inputs()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BatchReadInputPropertyName =
            BatchReadInputPropertyName(
                checkRequired("archived", archived),
                checkRequired("dataSensitivity", dataSensitivity),
                checkRequired("inputs", inputs).map { it.toImmutable() },
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
    fun validate(): BatchReadInputPropertyName = apply {
        if (validated) {
            return@apply
        }

        archived()
        dataSensitivity().validate()
        inputs().forEach { it.validate() }
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
        (if (archived.asKnown().isPresent) 1 else 0) +
            (dataSensitivity.asKnown().getOrNull()?.validity() ?: 0) +
            (inputs.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class DataSensitivity @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val HIGHLY_SENSITIVE = of("highly_sensitive")

            @JvmField val NON_SENSITIVE = of("non_sensitive")

            @JvmField val SENSITIVE = of("sensitive")

            @JvmStatic fun of(value: String) = DataSensitivity(JsonField.of(value))
        }

        /** An enum containing [DataSensitivity]'s known values. */
        enum class Known {
            HIGHLY_SENSITIVE,
            NON_SENSITIVE,
            SENSITIVE,
        }

        /**
         * An enum containing [DataSensitivity]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DataSensitivity] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            HIGHLY_SENSITIVE,
            NON_SENSITIVE,
            SENSITIVE,
            /**
             * An enum member indicating that [DataSensitivity] was instantiated with an unknown
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
                HIGHLY_SENSITIVE -> Value.HIGHLY_SENSITIVE
                NON_SENSITIVE -> Value.NON_SENSITIVE
                SENSITIVE -> Value.SENSITIVE
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
                HIGHLY_SENSITIVE -> Known.HIGHLY_SENSITIVE
                NON_SENSITIVE -> Known.NON_SENSITIVE
                SENSITIVE -> Known.SENSITIVE
                else -> throw HubSpotInvalidDataException("Unknown DataSensitivity: $value")
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
        fun validate(): DataSensitivity = apply {
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

            return other is DataSensitivity && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BatchReadInputPropertyName &&
            archived == other.archived &&
            dataSensitivity == other.dataSensitivity &&
            inputs == other.inputs &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(archived, dataSensitivity, inputs, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BatchReadInputPropertyName{archived=$archived, dataSensitivity=$dataSensitivity, inputs=$inputs, additionalProperties=$additionalProperties}"
}
