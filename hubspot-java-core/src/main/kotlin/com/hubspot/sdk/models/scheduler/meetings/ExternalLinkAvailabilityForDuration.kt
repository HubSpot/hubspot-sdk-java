// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.scheduler.meetings

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

class ExternalLinkAvailabilityForDuration
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val availabilities: JsonField<List<ExternalMeetingAvailability>>,
    private val meetingDurationMillis: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("availabilities")
        @ExcludeMissing
        availabilities: JsonField<List<ExternalMeetingAvailability>> = JsonMissing.of(),
        @JsonProperty("meetingDurationMillis")
        @ExcludeMissing
        meetingDurationMillis: JsonField<Long> = JsonMissing.of(),
    ) : this(availabilities, meetingDurationMillis, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun availabilities(): List<ExternalMeetingAvailability> =
        availabilities.getRequired("availabilities")

    /**
     * The duration of the meeting in milliseconds.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun meetingDurationMillis(): Long = meetingDurationMillis.getRequired("meetingDurationMillis")

    /**
     * Returns the raw JSON value of [availabilities].
     *
     * Unlike [availabilities], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("availabilities")
    @ExcludeMissing
    fun _availabilities(): JsonField<List<ExternalMeetingAvailability>> = availabilities

    /**
     * Returns the raw JSON value of [meetingDurationMillis].
     *
     * Unlike [meetingDurationMillis], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("meetingDurationMillis")
    @ExcludeMissing
    fun _meetingDurationMillis(): JsonField<Long> = meetingDurationMillis

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
         * [ExternalLinkAvailabilityForDuration].
         *
         * The following fields are required:
         * ```java
         * .availabilities()
         * .meetingDurationMillis()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalLinkAvailabilityForDuration]. */
    class Builder internal constructor() {

        private var availabilities: JsonField<MutableList<ExternalMeetingAvailability>>? = null
        private var meetingDurationMillis: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            externalLinkAvailabilityForDuration: ExternalLinkAvailabilityForDuration
        ) = apply {
            availabilities =
                externalLinkAvailabilityForDuration.availabilities.map { it.toMutableList() }
            meetingDurationMillis = externalLinkAvailabilityForDuration.meetingDurationMillis
            additionalProperties =
                externalLinkAvailabilityForDuration.additionalProperties.toMutableMap()
        }

        fun availabilities(availabilities: List<ExternalMeetingAvailability>) =
            availabilities(JsonField.of(availabilities))

        /**
         * Sets [Builder.availabilities] to an arbitrary JSON value.
         *
         * You should usually call [Builder.availabilities] with a well-typed
         * `List<ExternalMeetingAvailability>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun availabilities(availabilities: JsonField<List<ExternalMeetingAvailability>>) = apply {
            this.availabilities = availabilities.map { it.toMutableList() }
        }

        /**
         * Adds a single [ExternalMeetingAvailability] to [availabilities].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAvailability(availability: ExternalMeetingAvailability) = apply {
            availabilities =
                (availabilities ?: JsonField.of(mutableListOf())).also {
                    checkKnown("availabilities", it).add(availability)
                }
        }

        /** The duration of the meeting in milliseconds. */
        fun meetingDurationMillis(meetingDurationMillis: Long) =
            meetingDurationMillis(JsonField.of(meetingDurationMillis))

        /**
         * Sets [Builder.meetingDurationMillis] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meetingDurationMillis] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun meetingDurationMillis(meetingDurationMillis: JsonField<Long>) = apply {
            this.meetingDurationMillis = meetingDurationMillis
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
         * Returns an immutable instance of [ExternalLinkAvailabilityForDuration].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .availabilities()
         * .meetingDurationMillis()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalLinkAvailabilityForDuration =
            ExternalLinkAvailabilityForDuration(
                checkRequired("availabilities", availabilities).map { it.toImmutable() },
                checkRequired("meetingDurationMillis", meetingDurationMillis),
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
    fun validate(): ExternalLinkAvailabilityForDuration = apply {
        if (validated) {
            return@apply
        }

        availabilities().forEach { it.validate() }
        meetingDurationMillis()
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
        (availabilities.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (meetingDurationMillis.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalLinkAvailabilityForDuration &&
            availabilities == other.availabilities &&
            meetingDurationMillis == other.meetingDurationMillis &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(availabilities, meetingDurationMillis, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalLinkAvailabilityForDuration{availabilities=$availabilities, meetingDurationMillis=$meetingDurationMillis, additionalProperties=$additionalProperties}"
}
