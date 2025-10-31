// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.scheduler.meetings

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

class ExternalReminder
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val numberOfTimeUnits: JsonField<Int>,
    private val timeUnit: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("numberOfTimeUnits")
        @ExcludeMissing
        numberOfTimeUnits: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("timeUnit") @ExcludeMissing timeUnit: JsonField<String> = JsonMissing.of(),
    ) : this(numberOfTimeUnits, timeUnit, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun numberOfTimeUnits(): Int = numberOfTimeUnits.getRequired("numberOfTimeUnits")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timeUnit(): String = timeUnit.getRequired("timeUnit")

    /**
     * Returns the raw JSON value of [numberOfTimeUnits].
     *
     * Unlike [numberOfTimeUnits], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("numberOfTimeUnits")
    @ExcludeMissing
    fun _numberOfTimeUnits(): JsonField<Int> = numberOfTimeUnits

    /**
     * Returns the raw JSON value of [timeUnit].
     *
     * Unlike [timeUnit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timeUnit") @ExcludeMissing fun _timeUnit(): JsonField<String> = timeUnit

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
         * Returns a mutable builder for constructing an instance of [ExternalReminder].
         *
         * The following fields are required:
         * ```java
         * .numberOfTimeUnits()
         * .timeUnit()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalReminder]. */
    class Builder internal constructor() {

        private var numberOfTimeUnits: JsonField<Int>? = null
        private var timeUnit: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalReminder: ExternalReminder) = apply {
            numberOfTimeUnits = externalReminder.numberOfTimeUnits
            timeUnit = externalReminder.timeUnit
            additionalProperties = externalReminder.additionalProperties.toMutableMap()
        }

        fun numberOfTimeUnits(numberOfTimeUnits: Int) =
            numberOfTimeUnits(JsonField.of(numberOfTimeUnits))

        /**
         * Sets [Builder.numberOfTimeUnits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numberOfTimeUnits] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun numberOfTimeUnits(numberOfTimeUnits: JsonField<Int>) = apply {
            this.numberOfTimeUnits = numberOfTimeUnits
        }

        fun timeUnit(timeUnit: String) = timeUnit(JsonField.of(timeUnit))

        /**
         * Sets [Builder.timeUnit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeUnit] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timeUnit(timeUnit: JsonField<String>) = apply { this.timeUnit = timeUnit }

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
         * Returns an immutable instance of [ExternalReminder].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .numberOfTimeUnits()
         * .timeUnit()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalReminder =
            ExternalReminder(
                checkRequired("numberOfTimeUnits", numberOfTimeUnits),
                checkRequired("timeUnit", timeUnit),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalReminder = apply {
        if (validated) {
            return@apply
        }

        numberOfTimeUnits()
        timeUnit()
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
        (if (numberOfTimeUnits.asKnown().isPresent) 1 else 0) +
            (if (timeUnit.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalReminder &&
            numberOfTimeUnits == other.numberOfTimeUnits &&
            timeUnit == other.timeUnit &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(numberOfTimeUnits, timeUnit, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalReminder{numberOfTimeUnits=$numberOfTimeUnits, timeUnit=$timeUnit, additionalProperties=$additionalProperties}"
}
