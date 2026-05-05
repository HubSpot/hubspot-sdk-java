// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class PublicIndexOffset
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val days: JsonField<Int>,
    private val hours: JsonField<Int>,
    private val milliseconds: JsonField<Int>,
    private val minutes: JsonField<Int>,
    private val months: JsonField<Int>,
    private val quarters: JsonField<Int>,
    private val seconds: JsonField<Int>,
    private val weeks: JsonField<Int>,
    private val years: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("days") @ExcludeMissing days: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("hours") @ExcludeMissing hours: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("milliseconds")
        @ExcludeMissing
        milliseconds: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("minutes") @ExcludeMissing minutes: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("months") @ExcludeMissing months: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("quarters") @ExcludeMissing quarters: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("seconds") @ExcludeMissing seconds: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("weeks") @ExcludeMissing weeks: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("years") @ExcludeMissing years: JsonField<Int> = JsonMissing.of(),
    ) : this(
        days,
        hours,
        milliseconds,
        minutes,
        months,
        quarters,
        seconds,
        weeks,
        years,
        mutableMapOf(),
    )

    /**
     * The number of days to offset.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun days(): Optional<Int> = days.getOptional("days")

    /**
     * The number of hours to offset.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hours(): Optional<Int> = hours.getOptional("hours")

    /**
     * The number of milliseconds to offset.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun milliseconds(): Optional<Int> = milliseconds.getOptional("milliseconds")

    /**
     * The number of minutes to offset.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minutes(): Optional<Int> = minutes.getOptional("minutes")

    /**
     * The number of months to offset.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun months(): Optional<Int> = months.getOptional("months")

    /**
     * The number of quarters to offset.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun quarters(): Optional<Int> = quarters.getOptional("quarters")

    /**
     * The number of seconds to offset.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun seconds(): Optional<Int> = seconds.getOptional("seconds")

    /**
     * The number of weeks to offset.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun weeks(): Optional<Int> = weeks.getOptional("weeks")

    /**
     * The number of years to offset.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun years(): Optional<Int> = years.getOptional("years")

    /**
     * Returns the raw JSON value of [days].
     *
     * Unlike [days], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("days") @ExcludeMissing fun _days(): JsonField<Int> = days

    /**
     * Returns the raw JSON value of [hours].
     *
     * Unlike [hours], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hours") @ExcludeMissing fun _hours(): JsonField<Int> = hours

    /**
     * Returns the raw JSON value of [milliseconds].
     *
     * Unlike [milliseconds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("milliseconds") @ExcludeMissing fun _milliseconds(): JsonField<Int> = milliseconds

    /**
     * Returns the raw JSON value of [minutes].
     *
     * Unlike [minutes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("minutes") @ExcludeMissing fun _minutes(): JsonField<Int> = minutes

    /**
     * Returns the raw JSON value of [months].
     *
     * Unlike [months], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("months") @ExcludeMissing fun _months(): JsonField<Int> = months

    /**
     * Returns the raw JSON value of [quarters].
     *
     * Unlike [quarters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quarters") @ExcludeMissing fun _quarters(): JsonField<Int> = quarters

    /**
     * Returns the raw JSON value of [seconds].
     *
     * Unlike [seconds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("seconds") @ExcludeMissing fun _seconds(): JsonField<Int> = seconds

    /**
     * Returns the raw JSON value of [weeks].
     *
     * Unlike [weeks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("weeks") @ExcludeMissing fun _weeks(): JsonField<Int> = weeks

    /**
     * Returns the raw JSON value of [years].
     *
     * Unlike [years], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("years") @ExcludeMissing fun _years(): JsonField<Int> = years

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

        /** Returns a mutable builder for constructing an instance of [PublicIndexOffset]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicIndexOffset]. */
    class Builder internal constructor() {

        private var days: JsonField<Int> = JsonMissing.of()
        private var hours: JsonField<Int> = JsonMissing.of()
        private var milliseconds: JsonField<Int> = JsonMissing.of()
        private var minutes: JsonField<Int> = JsonMissing.of()
        private var months: JsonField<Int> = JsonMissing.of()
        private var quarters: JsonField<Int> = JsonMissing.of()
        private var seconds: JsonField<Int> = JsonMissing.of()
        private var weeks: JsonField<Int> = JsonMissing.of()
        private var years: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicIndexOffset: PublicIndexOffset) = apply {
            days = publicIndexOffset.days
            hours = publicIndexOffset.hours
            milliseconds = publicIndexOffset.milliseconds
            minutes = publicIndexOffset.minutes
            months = publicIndexOffset.months
            quarters = publicIndexOffset.quarters
            seconds = publicIndexOffset.seconds
            weeks = publicIndexOffset.weeks
            years = publicIndexOffset.years
            additionalProperties = publicIndexOffset.additionalProperties.toMutableMap()
        }

        /** The number of days to offset. */
        fun days(days: Int) = days(JsonField.of(days))

        /**
         * Sets [Builder.days] to an arbitrary JSON value.
         *
         * You should usually call [Builder.days] with a well-typed [Int] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun days(days: JsonField<Int>) = apply { this.days = days }

        /** The number of hours to offset. */
        fun hours(hours: Int) = hours(JsonField.of(hours))

        /**
         * Sets [Builder.hours] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hours] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hours(hours: JsonField<Int>) = apply { this.hours = hours }

        /** The number of milliseconds to offset. */
        fun milliseconds(milliseconds: Int) = milliseconds(JsonField.of(milliseconds))

        /**
         * Sets [Builder.milliseconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.milliseconds] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun milliseconds(milliseconds: JsonField<Int>) = apply { this.milliseconds = milliseconds }

        /** The number of minutes to offset. */
        fun minutes(minutes: Int) = minutes(JsonField.of(minutes))

        /**
         * Sets [Builder.minutes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minutes] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun minutes(minutes: JsonField<Int>) = apply { this.minutes = minutes }

        /** The number of months to offset. */
        fun months(months: Int) = months(JsonField.of(months))

        /**
         * Sets [Builder.months] to an arbitrary JSON value.
         *
         * You should usually call [Builder.months] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun months(months: JsonField<Int>) = apply { this.months = months }

        /** The number of quarters to offset. */
        fun quarters(quarters: Int) = quarters(JsonField.of(quarters))

        /**
         * Sets [Builder.quarters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quarters] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quarters(quarters: JsonField<Int>) = apply { this.quarters = quarters }

        /** The number of seconds to offset. */
        fun seconds(seconds: Int) = seconds(JsonField.of(seconds))

        /**
         * Sets [Builder.seconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.seconds] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun seconds(seconds: JsonField<Int>) = apply { this.seconds = seconds }

        /** The number of weeks to offset. */
        fun weeks(weeks: Int) = weeks(JsonField.of(weeks))

        /**
         * Sets [Builder.weeks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.weeks] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun weeks(weeks: JsonField<Int>) = apply { this.weeks = weeks }

        /** The number of years to offset. */
        fun years(years: Int) = years(JsonField.of(years))

        /**
         * Sets [Builder.years] to an arbitrary JSON value.
         *
         * You should usually call [Builder.years] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun years(years: JsonField<Int>) = apply { this.years = years }

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
         * Returns an immutable instance of [PublicIndexOffset].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PublicIndexOffset =
            PublicIndexOffset(
                days,
                hours,
                milliseconds,
                minutes,
                months,
                quarters,
                seconds,
                weeks,
                years,
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
    fun validate(): PublicIndexOffset = apply {
        if (validated) {
            return@apply
        }

        days()
        hours()
        milliseconds()
        minutes()
        months()
        quarters()
        seconds()
        weeks()
        years()
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
        (if (days.asKnown().isPresent) 1 else 0) +
            (if (hours.asKnown().isPresent) 1 else 0) +
            (if (milliseconds.asKnown().isPresent) 1 else 0) +
            (if (minutes.asKnown().isPresent) 1 else 0) +
            (if (months.asKnown().isPresent) 1 else 0) +
            (if (quarters.asKnown().isPresent) 1 else 0) +
            (if (seconds.asKnown().isPresent) 1 else 0) +
            (if (weeks.asKnown().isPresent) 1 else 0) +
            (if (years.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicIndexOffset &&
            days == other.days &&
            hours == other.hours &&
            milliseconds == other.milliseconds &&
            minutes == other.minutes &&
            months == other.months &&
            quarters == other.quarters &&
            seconds == other.seconds &&
            weeks == other.weeks &&
            years == other.years &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            days,
            hours,
            milliseconds,
            minutes,
            months,
            quarters,
            seconds,
            weeks,
            years,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicIndexOffset{days=$days, hours=$hours, milliseconds=$milliseconds, minutes=$minutes, months=$months, quarters=$quarters, seconds=$seconds, weeks=$weeks, years=$years, additionalProperties=$additionalProperties}"
}
