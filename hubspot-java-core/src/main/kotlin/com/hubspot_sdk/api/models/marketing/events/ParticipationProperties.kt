// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events

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

class ParticipationProperties
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val attendanceState: JsonField<AttendanceState>,
    private val occurredAt: JsonField<Long>,
    private val attendanceDurationSeconds: JsonField<Int>,
    private val attendancePercentage: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("attendanceState")
        @ExcludeMissing
        attendanceState: JsonField<AttendanceState> = JsonMissing.of(),
        @JsonProperty("occurredAt") @ExcludeMissing occurredAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("attendanceDurationSeconds")
        @ExcludeMissing
        attendanceDurationSeconds: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("attendancePercentage")
        @ExcludeMissing
        attendancePercentage: JsonField<String> = JsonMissing.of(),
    ) : this(
        attendanceState,
        occurredAt,
        attendanceDurationSeconds,
        attendancePercentage,
        mutableMapOf(),
    )

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun attendanceState(): AttendanceState = attendanceState.getRequired("attendanceState")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun occurredAt(): Long = occurredAt.getRequired("occurredAt")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun attendanceDurationSeconds(): Optional<Int> =
        attendanceDurationSeconds.getOptional("attendanceDurationSeconds")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun attendancePercentage(): Optional<String> =
        attendancePercentage.getOptional("attendancePercentage")

    /**
     * Returns the raw JSON value of [attendanceState].
     *
     * Unlike [attendanceState], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("attendanceState")
    @ExcludeMissing
    fun _attendanceState(): JsonField<AttendanceState> = attendanceState

    /**
     * Returns the raw JSON value of [occurredAt].
     *
     * Unlike [occurredAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("occurredAt") @ExcludeMissing fun _occurredAt(): JsonField<Long> = occurredAt

    /**
     * Returns the raw JSON value of [attendanceDurationSeconds].
     *
     * Unlike [attendanceDurationSeconds], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("attendanceDurationSeconds")
    @ExcludeMissing
    fun _attendanceDurationSeconds(): JsonField<Int> = attendanceDurationSeconds

    /**
     * Returns the raw JSON value of [attendancePercentage].
     *
     * Unlike [attendancePercentage], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("attendancePercentage")
    @ExcludeMissing
    fun _attendancePercentage(): JsonField<String> = attendancePercentage

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
         * Returns a mutable builder for constructing an instance of [ParticipationProperties].
         *
         * The following fields are required:
         * ```java
         * .attendanceState()
         * .occurredAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ParticipationProperties]. */
    class Builder internal constructor() {

        private var attendanceState: JsonField<AttendanceState>? = null
        private var occurredAt: JsonField<Long>? = null
        private var attendanceDurationSeconds: JsonField<Int> = JsonMissing.of()
        private var attendancePercentage: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(participationProperties: ParticipationProperties) = apply {
            attendanceState = participationProperties.attendanceState
            occurredAt = participationProperties.occurredAt
            attendanceDurationSeconds = participationProperties.attendanceDurationSeconds
            attendancePercentage = participationProperties.attendancePercentage
            additionalProperties = participationProperties.additionalProperties.toMutableMap()
        }

        fun attendanceState(attendanceState: AttendanceState) =
            attendanceState(JsonField.of(attendanceState))

        /**
         * Sets [Builder.attendanceState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attendanceState] with a well-typed [AttendanceState]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun attendanceState(attendanceState: JsonField<AttendanceState>) = apply {
            this.attendanceState = attendanceState
        }

        fun occurredAt(occurredAt: Long) = occurredAt(JsonField.of(occurredAt))

        /**
         * Sets [Builder.occurredAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.occurredAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun occurredAt(occurredAt: JsonField<Long>) = apply { this.occurredAt = occurredAt }

        fun attendanceDurationSeconds(attendanceDurationSeconds: Int) =
            attendanceDurationSeconds(JsonField.of(attendanceDurationSeconds))

        /**
         * Sets [Builder.attendanceDurationSeconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attendanceDurationSeconds] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun attendanceDurationSeconds(attendanceDurationSeconds: JsonField<Int>) = apply {
            this.attendanceDurationSeconds = attendanceDurationSeconds
        }

        fun attendancePercentage(attendancePercentage: String) =
            attendancePercentage(JsonField.of(attendancePercentage))

        /**
         * Sets [Builder.attendancePercentage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attendancePercentage] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun attendancePercentage(attendancePercentage: JsonField<String>) = apply {
            this.attendancePercentage = attendancePercentage
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
         * Returns an immutable instance of [ParticipationProperties].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .attendanceState()
         * .occurredAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ParticipationProperties =
            ParticipationProperties(
                checkRequired("attendanceState", attendanceState),
                checkRequired("occurredAt", occurredAt),
                attendanceDurationSeconds,
                attendancePercentage,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ParticipationProperties = apply {
        if (validated) {
            return@apply
        }

        attendanceState().validate()
        occurredAt()
        attendanceDurationSeconds()
        attendancePercentage()
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
        (attendanceState.asKnown().getOrNull()?.validity() ?: 0) +
            (if (occurredAt.asKnown().isPresent) 1 else 0) +
            (if (attendanceDurationSeconds.asKnown().isPresent) 1 else 0) +
            (if (attendancePercentage.asKnown().isPresent) 1 else 0)

    class AttendanceState @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val REGISTERED = of("REGISTERED")

            @JvmField val ATTENDED = of("ATTENDED")

            @JvmField val CANCELLED = of("CANCELLED")

            @JvmField val EMPTY = of("EMPTY")

            @JvmField val NO_SHOW = of("NO_SHOW")

            @JvmStatic fun of(value: String) = AttendanceState(JsonField.of(value))
        }

        /** An enum containing [AttendanceState]'s known values. */
        enum class Known {
            REGISTERED,
            ATTENDED,
            CANCELLED,
            EMPTY,
            NO_SHOW,
        }

        /**
         * An enum containing [AttendanceState]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AttendanceState] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            REGISTERED,
            ATTENDED,
            CANCELLED,
            EMPTY,
            NO_SHOW,
            /**
             * An enum member indicating that [AttendanceState] was instantiated with an unknown
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
                REGISTERED -> Value.REGISTERED
                ATTENDED -> Value.ATTENDED
                CANCELLED -> Value.CANCELLED
                EMPTY -> Value.EMPTY
                NO_SHOW -> Value.NO_SHOW
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
                REGISTERED -> Known.REGISTERED
                ATTENDED -> Known.ATTENDED
                CANCELLED -> Known.CANCELLED
                EMPTY -> Known.EMPTY
                NO_SHOW -> Known.NO_SHOW
                else -> throw HubspotInvalidDataException("Unknown AttendanceState: $value")
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

        fun validate(): AttendanceState = apply {
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

            return other is AttendanceState && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ParticipationProperties &&
            attendanceState == other.attendanceState &&
            occurredAt == other.occurredAt &&
            attendanceDurationSeconds == other.attendanceDurationSeconds &&
            attendancePercentage == other.attendancePercentage &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            attendanceState,
            occurredAt,
            attendanceDurationSeconds,
            attendancePercentage,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ParticipationProperties{attendanceState=$attendanceState, occurredAt=$occurredAt, attendanceDurationSeconds=$attendanceDurationSeconds, attendancePercentage=$attendancePercentage, additionalProperties=$additionalProperties}"
}
