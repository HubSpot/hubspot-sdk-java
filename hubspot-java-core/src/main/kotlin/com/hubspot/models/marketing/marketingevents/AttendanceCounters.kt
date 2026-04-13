// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.marketingevents

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.core.ExcludeMissing
import com.hubspot.core.JsonField
import com.hubspot.core.JsonMissing
import com.hubspot.core.JsonValue
import com.hubspot.core.checkRequired
import com.hubspot.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects

class AttendanceCounters
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val attended: JsonField<Int>,
    private val cancelled: JsonField<Int>,
    private val noShows: JsonField<Int>,
    private val registered: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("attended") @ExcludeMissing attended: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("cancelled") @ExcludeMissing cancelled: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("noShows") @ExcludeMissing noShows: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("registered") @ExcludeMissing registered: JsonField<Int> = JsonMissing.of(),
    ) : this(attended, cancelled, noShows, registered, mutableMapOf())

    /**
     * Number of attended contact records of a marketing event
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun attended(): Int = attended.getRequired("attended")

    /**
     * Number of cancelled contact records of a marketing event
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cancelled(): Int = cancelled.getRequired("cancelled")

    /**
     * Number of no-show contact records of a marketing event
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun noShows(): Int = noShows.getRequired("noShows")

    /**
     * Number of registered contact records of a marketing event
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun registered(): Int = registered.getRequired("registered")

    /**
     * Returns the raw JSON value of [attended].
     *
     * Unlike [attended], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("attended") @ExcludeMissing fun _attended(): JsonField<Int> = attended

    /**
     * Returns the raw JSON value of [cancelled].
     *
     * Unlike [cancelled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cancelled") @ExcludeMissing fun _cancelled(): JsonField<Int> = cancelled

    /**
     * Returns the raw JSON value of [noShows].
     *
     * Unlike [noShows], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("noShows") @ExcludeMissing fun _noShows(): JsonField<Int> = noShows

    /**
     * Returns the raw JSON value of [registered].
     *
     * Unlike [registered], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("registered") @ExcludeMissing fun _registered(): JsonField<Int> = registered

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
         * Returns a mutable builder for constructing an instance of [AttendanceCounters].
         *
         * The following fields are required:
         * ```java
         * .attended()
         * .cancelled()
         * .noShows()
         * .registered()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AttendanceCounters]. */
    class Builder internal constructor() {

        private var attended: JsonField<Int>? = null
        private var cancelled: JsonField<Int>? = null
        private var noShows: JsonField<Int>? = null
        private var registered: JsonField<Int>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(attendanceCounters: AttendanceCounters) = apply {
            attended = attendanceCounters.attended
            cancelled = attendanceCounters.cancelled
            noShows = attendanceCounters.noShows
            registered = attendanceCounters.registered
            additionalProperties = attendanceCounters.additionalProperties.toMutableMap()
        }

        /** Number of attended contact records of a marketing event */
        fun attended(attended: Int) = attended(JsonField.of(attended))

        /**
         * Sets [Builder.attended] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attended] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun attended(attended: JsonField<Int>) = apply { this.attended = attended }

        /** Number of cancelled contact records of a marketing event */
        fun cancelled(cancelled: Int) = cancelled(JsonField.of(cancelled))

        /**
         * Sets [Builder.cancelled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cancelled] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cancelled(cancelled: JsonField<Int>) = apply { this.cancelled = cancelled }

        /** Number of no-show contact records of a marketing event */
        fun noShows(noShows: Int) = noShows(JsonField.of(noShows))

        /**
         * Sets [Builder.noShows] to an arbitrary JSON value.
         *
         * You should usually call [Builder.noShows] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun noShows(noShows: JsonField<Int>) = apply { this.noShows = noShows }

        /** Number of registered contact records of a marketing event */
        fun registered(registered: Int) = registered(JsonField.of(registered))

        /**
         * Sets [Builder.registered] to an arbitrary JSON value.
         *
         * You should usually call [Builder.registered] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun registered(registered: JsonField<Int>) = apply { this.registered = registered }

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
         * Returns an immutable instance of [AttendanceCounters].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .attended()
         * .cancelled()
         * .noShows()
         * .registered()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AttendanceCounters =
            AttendanceCounters(
                checkRequired("attended", attended),
                checkRequired("cancelled", cancelled),
                checkRequired("noShows", noShows),
                checkRequired("registered", registered),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AttendanceCounters = apply {
        if (validated) {
            return@apply
        }

        attended()
        cancelled()
        noShows()
        registered()
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
        (if (attended.asKnown().isPresent) 1 else 0) +
            (if (cancelled.asKnown().isPresent) 1 else 0) +
            (if (noShows.asKnown().isPresent) 1 else 0) +
            (if (registered.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AttendanceCounters &&
            attended == other.attended &&
            cancelled == other.cancelled &&
            noShows == other.noShows &&
            registered == other.registered &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(attended, cancelled, noShows, registered, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AttendanceCounters{attended=$attended, cancelled=$cancelled, noShows=$noShows, registered=$registered, additionalProperties=$additionalProperties}"
}
