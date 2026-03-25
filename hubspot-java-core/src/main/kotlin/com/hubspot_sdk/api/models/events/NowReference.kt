// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events

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

class NowReference
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val referenceType: JsonField<ReferenceType>,
    private val hour: JsonField<Int>,
    private val millisecond: JsonField<Int>,
    private val minute: JsonField<Int>,
    private val second: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("referenceType")
        @ExcludeMissing
        referenceType: JsonField<ReferenceType> = JsonMissing.of(),
        @JsonProperty("hour") @ExcludeMissing hour: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("millisecond") @ExcludeMissing millisecond: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("minute") @ExcludeMissing minute: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("second") @ExcludeMissing second: JsonField<Int> = JsonMissing.of(),
    ) : this(referenceType, hour, millisecond, minute, second, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun referenceType(): ReferenceType = referenceType.getRequired("referenceType")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hour(): Optional<Int> = hour.getOptional("hour")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun millisecond(): Optional<Int> = millisecond.getOptional("millisecond")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minute(): Optional<Int> = minute.getOptional("minute")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun second(): Optional<Int> = second.getOptional("second")

    /**
     * Returns the raw JSON value of [referenceType].
     *
     * Unlike [referenceType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("referenceType")
    @ExcludeMissing
    fun _referenceType(): JsonField<ReferenceType> = referenceType

    /**
     * Returns the raw JSON value of [hour].
     *
     * Unlike [hour], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hour") @ExcludeMissing fun _hour(): JsonField<Int> = hour

    /**
     * Returns the raw JSON value of [millisecond].
     *
     * Unlike [millisecond], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("millisecond") @ExcludeMissing fun _millisecond(): JsonField<Int> = millisecond

    /**
     * Returns the raw JSON value of [minute].
     *
     * Unlike [minute], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("minute") @ExcludeMissing fun _minute(): JsonField<Int> = minute

    /**
     * Returns the raw JSON value of [second].
     *
     * Unlike [second], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("second") @ExcludeMissing fun _second(): JsonField<Int> = second

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
         * Returns a mutable builder for constructing an instance of [NowReference].
         *
         * The following fields are required:
         * ```java
         * .referenceType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NowReference]. */
    class Builder internal constructor() {

        private var referenceType: JsonField<ReferenceType>? = null
        private var hour: JsonField<Int> = JsonMissing.of()
        private var millisecond: JsonField<Int> = JsonMissing.of()
        private var minute: JsonField<Int> = JsonMissing.of()
        private var second: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(nowReference: NowReference) = apply {
            referenceType = nowReference.referenceType
            hour = nowReference.hour
            millisecond = nowReference.millisecond
            minute = nowReference.minute
            second = nowReference.second
            additionalProperties = nowReference.additionalProperties.toMutableMap()
        }

        fun referenceType(referenceType: ReferenceType) = referenceType(JsonField.of(referenceType))

        /**
         * Sets [Builder.referenceType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referenceType] with a well-typed [ReferenceType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun referenceType(referenceType: JsonField<ReferenceType>) = apply {
            this.referenceType = referenceType
        }

        fun hour(hour: Int) = hour(JsonField.of(hour))

        /**
         * Sets [Builder.hour] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hour] with a well-typed [Int] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hour(hour: JsonField<Int>) = apply { this.hour = hour }

        fun millisecond(millisecond: Int) = millisecond(JsonField.of(millisecond))

        /**
         * Sets [Builder.millisecond] to an arbitrary JSON value.
         *
         * You should usually call [Builder.millisecond] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun millisecond(millisecond: JsonField<Int>) = apply { this.millisecond = millisecond }

        fun minute(minute: Int) = minute(JsonField.of(minute))

        /**
         * Sets [Builder.minute] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minute] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun minute(minute: JsonField<Int>) = apply { this.minute = minute }

        fun second(second: Int) = second(JsonField.of(second))

        /**
         * Sets [Builder.second] to an arbitrary JSON value.
         *
         * You should usually call [Builder.second] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun second(second: JsonField<Int>) = apply { this.second = second }

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
         * Returns an immutable instance of [NowReference].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .referenceType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NowReference =
            NowReference(
                checkRequired("referenceType", referenceType),
                hour,
                millisecond,
                minute,
                second,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): NowReference = apply {
        if (validated) {
            return@apply
        }

        referenceType().validate()
        hour()
        millisecond()
        minute()
        second()
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
        (referenceType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (hour.asKnown().isPresent) 1 else 0) +
            (if (millisecond.asKnown().isPresent) 1 else 0) +
            (if (minute.asKnown().isPresent) 1 else 0) +
            (if (second.asKnown().isPresent) 1 else 0)

    class ReferenceType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val NOW = of("NOW")

            @JvmStatic fun of(value: String) = ReferenceType(JsonField.of(value))
        }

        /** An enum containing [ReferenceType]'s known values. */
        enum class Known {
            NOW
        }

        /**
         * An enum containing [ReferenceType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ReferenceType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NOW,
            /**
             * An enum member indicating that [ReferenceType] was instantiated with an unknown
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
                NOW -> Value.NOW
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
                NOW -> Known.NOW
                else -> throw HubspotInvalidDataException("Unknown ReferenceType: $value")
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

        fun validate(): ReferenceType = apply {
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

            return other is ReferenceType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NowReference &&
            referenceType == other.referenceType &&
            hour == other.hour &&
            millisecond == other.millisecond &&
            minute == other.minute &&
            second == other.second &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(referenceType, hour, millisecond, minute, second, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NowReference{referenceType=$referenceType, hour=$hour, millisecond=$millisecond, minute=$minute, second=$second, additionalProperties=$additionalProperties}"
}
