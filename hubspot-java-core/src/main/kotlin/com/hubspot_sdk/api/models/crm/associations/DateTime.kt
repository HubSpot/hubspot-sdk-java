// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects

class DateTime
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val dateOnly: JsonField<Boolean>,
    private val timeZoneShift: JsonField<Int>,
    private val value: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("dateOnly") @ExcludeMissing dateOnly: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("timeZoneShift")
        @ExcludeMissing
        timeZoneShift: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing value: JsonField<Int> = JsonMissing.of(),
    ) : this(dateOnly, timeZoneShift, value, mutableMapOf())

    /**
     * Indicates whether the DateTime value represents only a date without a time component.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dateOnly(): Boolean = dateOnly.getRequired("dateOnly")

    /**
     * The integer value representing the shift in minutes from UTC for the DateTime value.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timeZoneShift(): Int = timeZoneShift.getRequired("timeZoneShift")

    /**
     * The integer value representing a specific point in time.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun value(): Int = value.getRequired("value")

    /**
     * Returns the raw JSON value of [dateOnly].
     *
     * Unlike [dateOnly], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dateOnly") @ExcludeMissing fun _dateOnly(): JsonField<Boolean> = dateOnly

    /**
     * Returns the raw JSON value of [timeZoneShift].
     *
     * Unlike [timeZoneShift], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timeZoneShift")
    @ExcludeMissing
    fun _timeZoneShift(): JsonField<Int> = timeZoneShift

    /**
     * Returns the raw JSON value of [value].
     *
     * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Int> = value

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
         * Returns a mutable builder for constructing an instance of [DateTime].
         *
         * The following fields are required:
         * ```java
         * .dateOnly()
         * .timeZoneShift()
         * .value()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DateTime]. */
    class Builder internal constructor() {

        private var dateOnly: JsonField<Boolean>? = null
        private var timeZoneShift: JsonField<Int>? = null
        private var value: JsonField<Int>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(dateTime: DateTime) = apply {
            dateOnly = dateTime.dateOnly
            timeZoneShift = dateTime.timeZoneShift
            value = dateTime.value
            additionalProperties = dateTime.additionalProperties.toMutableMap()
        }

        /** Indicates whether the DateTime value represents only a date without a time component. */
        fun dateOnly(dateOnly: Boolean) = dateOnly(JsonField.of(dateOnly))

        /**
         * Sets [Builder.dateOnly] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateOnly] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dateOnly(dateOnly: JsonField<Boolean>) = apply { this.dateOnly = dateOnly }

        /** The integer value representing the shift in minutes from UTC for the DateTime value. */
        fun timeZoneShift(timeZoneShift: Int) = timeZoneShift(JsonField.of(timeZoneShift))

        /**
         * Sets [Builder.timeZoneShift] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeZoneShift] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun timeZoneShift(timeZoneShift: JsonField<Int>) = apply {
            this.timeZoneShift = timeZoneShift
        }

        /** The integer value representing a specific point in time. */
        fun value(value: Int) = value(JsonField.of(value))

        /**
         * Sets [Builder.value] to an arbitrary JSON value.
         *
         * You should usually call [Builder.value] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun value(value: JsonField<Int>) = apply { this.value = value }

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
         * Returns an immutable instance of [DateTime].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .dateOnly()
         * .timeZoneShift()
         * .value()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DateTime =
            DateTime(
                checkRequired("dateOnly", dateOnly),
                checkRequired("timeZoneShift", timeZoneShift),
                checkRequired("value", value),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DateTime = apply {
        if (validated) {
            return@apply
        }

        dateOnly()
        timeZoneShift()
        value()
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
        (if (dateOnly.asKnown().isPresent) 1 else 0) +
            (if (timeZoneShift.asKnown().isPresent) 1 else 0) +
            (if (value.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DateTime &&
            dateOnly == other.dateOnly &&
            timeZoneShift == other.timeZoneShift &&
            value == other.value &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(dateOnly, timeZoneShift, value, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DateTime{dateOnly=$dateOnly, timeZoneShift=$timeZoneShift, value=$value, additionalProperties=$additionalProperties}"
}
