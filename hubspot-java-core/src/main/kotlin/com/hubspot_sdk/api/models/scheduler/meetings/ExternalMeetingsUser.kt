// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.scheduler.meetings

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
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class ExternalMeetingsUser
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val calendarProvider: JsonField<CalendarProvider>,
    private val isSalesStarter: JsonField<Boolean>,
    private val userId: JsonField<String>,
    private val userProfile: JsonField<ExternalUserProfile>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("calendarProvider")
        @ExcludeMissing
        calendarProvider: JsonField<CalendarProvider> = JsonMissing.of(),
        @JsonProperty("isSalesStarter")
        @ExcludeMissing
        isSalesStarter: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("userId") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("userProfile")
        @ExcludeMissing
        userProfile: JsonField<ExternalUserProfile> = JsonMissing.of(),
    ) : this(id, calendarProvider, isSalesStarter, userId, userProfile, mutableMapOf())

    /**
     * The ID for the meetings user. This value is different than the userId.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The calendar provider associated with the user. Accepted values are: GOOGLE, OFFICE365,
     * EXCHANGE, UNKNOWN.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun calendarProvider(): CalendarProvider = calendarProvider.getRequired("calendarProvider")

    /**
     * Whether the user has a sales starter seat.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isSalesStarter(): Boolean = isSalesStarter.getRequired("isSalesStarter")

    /**
     * The ID of the user.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userId(): String = userId.getRequired("userId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userProfile(): ExternalUserProfile = userProfile.getRequired("userProfile")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [calendarProvider].
     *
     * Unlike [calendarProvider], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("calendarProvider")
    @ExcludeMissing
    fun _calendarProvider(): JsonField<CalendarProvider> = calendarProvider

    /**
     * Returns the raw JSON value of [isSalesStarter].
     *
     * Unlike [isSalesStarter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isSalesStarter")
    @ExcludeMissing
    fun _isSalesStarter(): JsonField<Boolean> = isSalesStarter

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("userId") @ExcludeMissing fun _userId(): JsonField<String> = userId

    /**
     * Returns the raw JSON value of [userProfile].
     *
     * Unlike [userProfile], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("userProfile")
    @ExcludeMissing
    fun _userProfile(): JsonField<ExternalUserProfile> = userProfile

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
         * Returns a mutable builder for constructing an instance of [ExternalMeetingsUser].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .calendarProvider()
         * .isSalesStarter()
         * .userId()
         * .userProfile()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalMeetingsUser]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var calendarProvider: JsonField<CalendarProvider>? = null
        private var isSalesStarter: JsonField<Boolean>? = null
        private var userId: JsonField<String>? = null
        private var userProfile: JsonField<ExternalUserProfile>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalMeetingsUser: ExternalMeetingsUser) = apply {
            id = externalMeetingsUser.id
            calendarProvider = externalMeetingsUser.calendarProvider
            isSalesStarter = externalMeetingsUser.isSalesStarter
            userId = externalMeetingsUser.userId
            userProfile = externalMeetingsUser.userProfile
            additionalProperties = externalMeetingsUser.additionalProperties.toMutableMap()
        }

        /** The ID for the meetings user. This value is different than the userId. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The calendar provider associated with the user. Accepted values are: GOOGLE, OFFICE365,
         * EXCHANGE, UNKNOWN.
         */
        fun calendarProvider(calendarProvider: CalendarProvider) =
            calendarProvider(JsonField.of(calendarProvider))

        /**
         * Sets [Builder.calendarProvider] to an arbitrary JSON value.
         *
         * You should usually call [Builder.calendarProvider] with a well-typed [CalendarProvider]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun calendarProvider(calendarProvider: JsonField<CalendarProvider>) = apply {
            this.calendarProvider = calendarProvider
        }

        /** Whether the user has a sales starter seat. */
        fun isSalesStarter(isSalesStarter: Boolean) = isSalesStarter(JsonField.of(isSalesStarter))

        /**
         * Sets [Builder.isSalesStarter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isSalesStarter] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isSalesStarter(isSalesStarter: JsonField<Boolean>) = apply {
            this.isSalesStarter = isSalesStarter
        }

        /** The ID of the user. */
        fun userId(userId: String) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

        fun userProfile(userProfile: ExternalUserProfile) = userProfile(JsonField.of(userProfile))

        /**
         * Sets [Builder.userProfile] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userProfile] with a well-typed [ExternalUserProfile]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun userProfile(userProfile: JsonField<ExternalUserProfile>) = apply {
            this.userProfile = userProfile
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
         * Returns an immutable instance of [ExternalMeetingsUser].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .calendarProvider()
         * .isSalesStarter()
         * .userId()
         * .userProfile()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalMeetingsUser =
            ExternalMeetingsUser(
                checkRequired("id", id),
                checkRequired("calendarProvider", calendarProvider),
                checkRequired("isSalesStarter", isSalesStarter),
                checkRequired("userId", userId),
                checkRequired("userProfile", userProfile),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalMeetingsUser = apply {
        if (validated) {
            return@apply
        }

        id()
        calendarProvider().validate()
        isSalesStarter()
        userId()
        userProfile().validate()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (calendarProvider.asKnown().getOrNull()?.validity() ?: 0) +
            (if (isSalesStarter.asKnown().isPresent) 1 else 0) +
            (if (userId.asKnown().isPresent) 1 else 0) +
            (userProfile.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * The calendar provider associated with the user. Accepted values are: GOOGLE, OFFICE365,
     * EXCHANGE, UNKNOWN.
     */
    class CalendarProvider @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val EXCHANGE = of("EXCHANGE")

            @JvmField val GOOGLE = of("GOOGLE")

            @JvmField val OFFICE365 = of("OFFICE365")

            @JvmField val UNKNOWN = of("UNKNOWN")

            @JvmStatic fun of(value: String) = CalendarProvider(JsonField.of(value))
        }

        /** An enum containing [CalendarProvider]'s known values. */
        enum class Known {
            EXCHANGE,
            GOOGLE,
            OFFICE365,
            UNKNOWN,
        }

        /**
         * An enum containing [CalendarProvider]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CalendarProvider] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EXCHANGE,
            GOOGLE,
            OFFICE365,
            UNKNOWN,
            /**
             * An enum member indicating that [CalendarProvider] was instantiated with an unknown
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
                EXCHANGE -> Value.EXCHANGE
                GOOGLE -> Value.GOOGLE
                OFFICE365 -> Value.OFFICE365
                UNKNOWN -> Value.UNKNOWN
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
                EXCHANGE -> Known.EXCHANGE
                GOOGLE -> Known.GOOGLE
                OFFICE365 -> Known.OFFICE365
                UNKNOWN -> Known.UNKNOWN
                else -> throw HubSpotInvalidDataException("Unknown CalendarProvider: $value")
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

        fun validate(): CalendarProvider = apply {
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

            return other is CalendarProvider && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalMeetingsUser &&
            id == other.id &&
            calendarProvider == other.calendarProvider &&
            isSalesStarter == other.isSalesStarter &&
            userId == other.userId &&
            userProfile == other.userProfile &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            calendarProvider,
            isSalesStarter,
            userId,
            userProfile,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalMeetingsUser{id=$id, calendarProvider=$calendarProvider, isSalesStarter=$isSalesStarter, userId=$userId, userProfile=$userProfile, additionalProperties=$additionalProperties}"
}
