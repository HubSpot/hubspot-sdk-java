// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.Enum
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicPropertyReferencedTime
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val property: JsonField<String>,
    private val referenceType: JsonField<String>,
    private val timeType: JsonField<TimeType>,
    private val zoneId: JsonField<String>,
    private val timezoneSource: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("property") @ExcludeMissing property: JsonField<String> = JsonMissing.of(),
        @JsonProperty("referenceType")
        @ExcludeMissing
        referenceType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timeType") @ExcludeMissing timeType: JsonField<TimeType> = JsonMissing.of(),
        @JsonProperty("zoneId") @ExcludeMissing zoneId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timezoneSource")
        @ExcludeMissing
        timezoneSource: JsonField<String> = JsonMissing.of(),
    ) : this(property, referenceType, timeType, zoneId, timezoneSource, mutableMapOf())

    /**
     * Specifies the name of the property that the time reference is applied to.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun property(): String = property.getRequired("property")

    /**
     * Specifies the type of reference for the property (VALUE, UPDATED_AT, ANNIVERSARY,
     * VALUE_WITH_ZONE_SAME_LOCAL_CONVERSION, ANNIVERSARY_WITH_ZONE_SAME_LOCAL_CONVERSION).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun referenceType(): String = referenceType.getRequired("referenceType")

    /**
     * Defines the type of time (PROPERTY_REFERENCED).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timeType(): TimeType = timeType.getRequired("timeType")

    /**
     * Indicates the identifier for the time zone associated with the property.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun zoneId(): String = zoneId.getRequired("zoneId")

    /**
     * Specifies the source of the time zone information for the property (CUSTOM, USER, PORTAL).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timezoneSource(): Optional<String> = timezoneSource.getOptional("timezoneSource")

    /**
     * Returns the raw JSON value of [property].
     *
     * Unlike [property], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("property") @ExcludeMissing fun _property(): JsonField<String> = property

    /**
     * Returns the raw JSON value of [referenceType].
     *
     * Unlike [referenceType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("referenceType")
    @ExcludeMissing
    fun _referenceType(): JsonField<String> = referenceType

    /**
     * Returns the raw JSON value of [timeType].
     *
     * Unlike [timeType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timeType") @ExcludeMissing fun _timeType(): JsonField<TimeType> = timeType

    /**
     * Returns the raw JSON value of [zoneId].
     *
     * Unlike [zoneId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("zoneId") @ExcludeMissing fun _zoneId(): JsonField<String> = zoneId

    /**
     * Returns the raw JSON value of [timezoneSource].
     *
     * Unlike [timezoneSource], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timezoneSource")
    @ExcludeMissing
    fun _timezoneSource(): JsonField<String> = timezoneSource

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
         * Returns a mutable builder for constructing an instance of [PublicPropertyReferencedTime].
         *
         * The following fields are required:
         * ```java
         * .property()
         * .referenceType()
         * .timeType()
         * .zoneId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicPropertyReferencedTime]. */
    class Builder internal constructor() {

        private var property: JsonField<String>? = null
        private var referenceType: JsonField<String>? = null
        private var timeType: JsonField<TimeType>? = null
        private var zoneId: JsonField<String>? = null
        private var timezoneSource: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicPropertyReferencedTime: PublicPropertyReferencedTime) = apply {
            property = publicPropertyReferencedTime.property
            referenceType = publicPropertyReferencedTime.referenceType
            timeType = publicPropertyReferencedTime.timeType
            zoneId = publicPropertyReferencedTime.zoneId
            timezoneSource = publicPropertyReferencedTime.timezoneSource
            additionalProperties = publicPropertyReferencedTime.additionalProperties.toMutableMap()
        }

        /** Specifies the name of the property that the time reference is applied to. */
        fun property(property: String) = property(JsonField.of(property))

        /**
         * Sets [Builder.property] to an arbitrary JSON value.
         *
         * You should usually call [Builder.property] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun property(property: JsonField<String>) = apply { this.property = property }

        /**
         * Specifies the type of reference for the property (VALUE, UPDATED_AT, ANNIVERSARY,
         * VALUE_WITH_ZONE_SAME_LOCAL_CONVERSION, ANNIVERSARY_WITH_ZONE_SAME_LOCAL_CONVERSION).
         */
        fun referenceType(referenceType: String) = referenceType(JsonField.of(referenceType))

        /**
         * Sets [Builder.referenceType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referenceType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun referenceType(referenceType: JsonField<String>) = apply {
            this.referenceType = referenceType
        }

        /** Defines the type of time (PROPERTY_REFERENCED). */
        fun timeType(timeType: TimeType) = timeType(JsonField.of(timeType))

        /**
         * Sets [Builder.timeType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeType] with a well-typed [TimeType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun timeType(timeType: JsonField<TimeType>) = apply { this.timeType = timeType }

        /** Indicates the identifier for the time zone associated with the property. */
        fun zoneId(zoneId: String) = zoneId(JsonField.of(zoneId))

        /**
         * Sets [Builder.zoneId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.zoneId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun zoneId(zoneId: JsonField<String>) = apply { this.zoneId = zoneId }

        /**
         * Specifies the source of the time zone information for the property (CUSTOM, USER,
         * PORTAL).
         */
        fun timezoneSource(timezoneSource: String) = timezoneSource(JsonField.of(timezoneSource))

        /**
         * Sets [Builder.timezoneSource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timezoneSource] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timezoneSource(timezoneSource: JsonField<String>) = apply {
            this.timezoneSource = timezoneSource
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
         * Returns an immutable instance of [PublicPropertyReferencedTime].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .property()
         * .referenceType()
         * .timeType()
         * .zoneId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicPropertyReferencedTime =
            PublicPropertyReferencedTime(
                checkRequired("property", property),
                checkRequired("referenceType", referenceType),
                checkRequired("timeType", timeType),
                checkRequired("zoneId", zoneId),
                timezoneSource,
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
    fun validate(): PublicPropertyReferencedTime = apply {
        if (validated) {
            return@apply
        }

        property()
        referenceType()
        timeType().validate()
        zoneId()
        timezoneSource()
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
        (if (property.asKnown().isPresent) 1 else 0) +
            (if (referenceType.asKnown().isPresent) 1 else 0) +
            (timeType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (zoneId.asKnown().isPresent) 1 else 0) +
            (if (timezoneSource.asKnown().isPresent) 1 else 0)

    /** Defines the type of time (PROPERTY_REFERENCED). */
    class TimeType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PROPERTY_REFERENCED = of("PROPERTY_REFERENCED")

            @JvmStatic fun of(value: String) = TimeType(JsonField.of(value))
        }

        /** An enum containing [TimeType]'s known values. */
        enum class Known {
            PROPERTY_REFERENCED
        }

        /**
         * An enum containing [TimeType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TimeType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PROPERTY_REFERENCED,
            /** An enum member indicating that [TimeType] was instantiated with an unknown value. */
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
                PROPERTY_REFERENCED -> Value.PROPERTY_REFERENCED
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
                PROPERTY_REFERENCED -> Known.PROPERTY_REFERENCED
                else -> throw HubSpotInvalidDataException("Unknown TimeType: $value")
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
        fun validate(): TimeType = apply {
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

            return other is TimeType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicPropertyReferencedTime &&
            property == other.property &&
            referenceType == other.referenceType &&
            timeType == other.timeType &&
            zoneId == other.zoneId &&
            timezoneSource == other.timezoneSource &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            property,
            referenceType,
            timeType,
            zoneId,
            timezoneSource,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicPropertyReferencedTime{property=$property, referenceType=$referenceType, timeType=$timeType, zoneId=$zoneId, timezoneSource=$timezoneSource, additionalProperties=$additionalProperties}"
}
