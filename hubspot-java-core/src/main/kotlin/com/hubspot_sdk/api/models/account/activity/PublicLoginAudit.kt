// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.account.activity

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional

class PublicLoginAudit
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val loginAt: JsonField<OffsetDateTime>,
    private val loginSucceeded: JsonField<Boolean>,
    private val countryCode: JsonField<String>,
    private val email: JsonField<String>,
    private val ipAddress: JsonField<String>,
    private val location: JsonField<String>,
    private val regionCode: JsonField<String>,
    private val userAgent: JsonField<String>,
    private val userId: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("loginAt")
        @ExcludeMissing
        loginAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("loginSucceeded")
        @ExcludeMissing
        loginSucceeded: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("countryCode")
        @ExcludeMissing
        countryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ipAddress") @ExcludeMissing ipAddress: JsonField<String> = JsonMissing.of(),
        @JsonProperty("location") @ExcludeMissing location: JsonField<String> = JsonMissing.of(),
        @JsonProperty("regionCode")
        @ExcludeMissing
        regionCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("userAgent") @ExcludeMissing userAgent: JsonField<String> = JsonMissing.of(),
        @JsonProperty("userId") @ExcludeMissing userId: JsonField<Int> = JsonMissing.of(),
    ) : this(
        id,
        loginAt,
        loginSucceeded,
        countryCode,
        email,
        ipAddress,
        location,
        regionCode,
        userAgent,
        userId,
        mutableMapOf(),
    )

    /**
     * The login activity's unique ID.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The time the login took place.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun loginAt(): OffsetDateTime = loginAt.getRequired("loginAt")

    /**
     * Whether the login was successful or not.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun loginSucceeded(): Boolean = loginSucceeded.getRequired("loginSucceeded")

    /**
     * The approximate country code of the login
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun countryCode(): Optional<String> = countryCode.getOptional("countryCode")

    /**
     * Email address of the user associated with the login.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun email(): Optional<String> = email.getOptional("email")

    /**
     * IP address where the activity originated.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ipAddress(): Optional<String> = ipAddress.getOptional("ipAddress")

    /**
     * The approximate location where the login activity originated.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun location(): Optional<String> = location.getOptional("location")

    /**
     * The approximate region code of the login
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun regionCode(): Optional<String> = regionCode.getOptional("regionCode")

    /**
     * Information about the device used for logging in.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userAgent(): Optional<String> = userAgent.getOptional("userAgent")

    /**
     * The user's unique ID.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userId(): Optional<Int> = userId.getOptional("userId")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [loginAt].
     *
     * Unlike [loginAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("loginAt") @ExcludeMissing fun _loginAt(): JsonField<OffsetDateTime> = loginAt

    /**
     * Returns the raw JSON value of [loginSucceeded].
     *
     * Unlike [loginSucceeded], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("loginSucceeded")
    @ExcludeMissing
    fun _loginSucceeded(): JsonField<Boolean> = loginSucceeded

    /**
     * Returns the raw JSON value of [countryCode].
     *
     * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("countryCode") @ExcludeMissing fun _countryCode(): JsonField<String> = countryCode

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [ipAddress].
     *
     * Unlike [ipAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ipAddress") @ExcludeMissing fun _ipAddress(): JsonField<String> = ipAddress

    /**
     * Returns the raw JSON value of [location].
     *
     * Unlike [location], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("location") @ExcludeMissing fun _location(): JsonField<String> = location

    /**
     * Returns the raw JSON value of [regionCode].
     *
     * Unlike [regionCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("regionCode") @ExcludeMissing fun _regionCode(): JsonField<String> = regionCode

    /**
     * Returns the raw JSON value of [userAgent].
     *
     * Unlike [userAgent], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("userAgent") @ExcludeMissing fun _userAgent(): JsonField<String> = userAgent

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("userId") @ExcludeMissing fun _userId(): JsonField<Int> = userId

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
         * Returns a mutable builder for constructing an instance of [PublicLoginAudit].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .loginAt()
         * .loginSucceeded()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicLoginAudit]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var loginAt: JsonField<OffsetDateTime>? = null
        private var loginSucceeded: JsonField<Boolean>? = null
        private var countryCode: JsonField<String> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var ipAddress: JsonField<String> = JsonMissing.of()
        private var location: JsonField<String> = JsonMissing.of()
        private var regionCode: JsonField<String> = JsonMissing.of()
        private var userAgent: JsonField<String> = JsonMissing.of()
        private var userId: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicLoginAudit: PublicLoginAudit) = apply {
            id = publicLoginAudit.id
            loginAt = publicLoginAudit.loginAt
            loginSucceeded = publicLoginAudit.loginSucceeded
            countryCode = publicLoginAudit.countryCode
            email = publicLoginAudit.email
            ipAddress = publicLoginAudit.ipAddress
            location = publicLoginAudit.location
            regionCode = publicLoginAudit.regionCode
            userAgent = publicLoginAudit.userAgent
            userId = publicLoginAudit.userId
            additionalProperties = publicLoginAudit.additionalProperties.toMutableMap()
        }

        /** The login activity's unique ID. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The time the login took place. */
        fun loginAt(loginAt: OffsetDateTime) = loginAt(JsonField.of(loginAt))

        /**
         * Sets [Builder.loginAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.loginAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun loginAt(loginAt: JsonField<OffsetDateTime>) = apply { this.loginAt = loginAt }

        /** Whether the login was successful or not. */
        fun loginSucceeded(loginSucceeded: Boolean) = loginSucceeded(JsonField.of(loginSucceeded))

        /**
         * Sets [Builder.loginSucceeded] to an arbitrary JSON value.
         *
         * You should usually call [Builder.loginSucceeded] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun loginSucceeded(loginSucceeded: JsonField<Boolean>) = apply {
            this.loginSucceeded = loginSucceeded
        }

        /** The approximate country code of the login */
        fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

        /**
         * Sets [Builder.countryCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.countryCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun countryCode(countryCode: JsonField<String>) = apply { this.countryCode = countryCode }

        /** Email address of the user associated with the login. */
        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** IP address where the activity originated. */
        fun ipAddress(ipAddress: String) = ipAddress(JsonField.of(ipAddress))

        /**
         * Sets [Builder.ipAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ipAddress] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ipAddress(ipAddress: JsonField<String>) = apply { this.ipAddress = ipAddress }

        /** The approximate location where the login activity originated. */
        fun location(location: String) = location(JsonField.of(location))

        /**
         * Sets [Builder.location] to an arbitrary JSON value.
         *
         * You should usually call [Builder.location] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun location(location: JsonField<String>) = apply { this.location = location }

        /** The approximate region code of the login */
        fun regionCode(regionCode: String) = regionCode(JsonField.of(regionCode))

        /**
         * Sets [Builder.regionCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.regionCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun regionCode(regionCode: JsonField<String>) = apply { this.regionCode = regionCode }

        /** Information about the device used for logging in. */
        fun userAgent(userAgent: String) = userAgent(JsonField.of(userAgent))

        /**
         * Sets [Builder.userAgent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userAgent] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun userAgent(userAgent: JsonField<String>) = apply { this.userAgent = userAgent }

        /** The user's unique ID. */
        fun userId(userId: Int) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<Int>) = apply { this.userId = userId }

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
         * Returns an immutable instance of [PublicLoginAudit].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .loginAt()
         * .loginSucceeded()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicLoginAudit =
            PublicLoginAudit(
                checkRequired("id", id),
                checkRequired("loginAt", loginAt),
                checkRequired("loginSucceeded", loginSucceeded),
                countryCode,
                email,
                ipAddress,
                location,
                regionCode,
                userAgent,
                userId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicLoginAudit = apply {
        if (validated) {
            return@apply
        }

        id()
        loginAt()
        loginSucceeded()
        countryCode()
        email()
        ipAddress()
        location()
        regionCode()
        userAgent()
        userId()
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
            (if (loginAt.asKnown().isPresent) 1 else 0) +
            (if (loginSucceeded.asKnown().isPresent) 1 else 0) +
            (if (countryCode.asKnown().isPresent) 1 else 0) +
            (if (email.asKnown().isPresent) 1 else 0) +
            (if (ipAddress.asKnown().isPresent) 1 else 0) +
            (if (location.asKnown().isPresent) 1 else 0) +
            (if (regionCode.asKnown().isPresent) 1 else 0) +
            (if (userAgent.asKnown().isPresent) 1 else 0) +
            (if (userId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicLoginAudit &&
            id == other.id &&
            loginAt == other.loginAt &&
            loginSucceeded == other.loginSucceeded &&
            countryCode == other.countryCode &&
            email == other.email &&
            ipAddress == other.ipAddress &&
            location == other.location &&
            regionCode == other.regionCode &&
            userAgent == other.userAgent &&
            userId == other.userId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            loginAt,
            loginSucceeded,
            countryCode,
            email,
            ipAddress,
            location,
            regionCode,
            userAgent,
            userId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicLoginAudit{id=$id, loginAt=$loginAt, loginSucceeded=$loginSucceeded, countryCode=$countryCode, email=$email, ipAddress=$ipAddress, location=$location, regionCode=$regionCode, userAgent=$userAgent, userId=$userId, additionalProperties=$additionalProperties}"
}
