// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.account

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.core.Enum
import com.hubspot.core.ExcludeMissing
import com.hubspot.core.JsonField
import com.hubspot.core.JsonMissing
import com.hubspot.core.JsonValue
import com.hubspot.core.checkKnown
import com.hubspot.core.checkRequired
import com.hubspot.core.toImmutable
import com.hubspot.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class PortalInformationResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accountType: JsonField<AccountType>,
    private val additionalCurrencies: JsonField<List<String>>,
    private val companyCurrency: JsonField<String>,
    private val dataHostingLocation: JsonField<String>,
    private val portalId: JsonField<Int>,
    private val timeZone: JsonField<String>,
    private val uiDomain: JsonField<String>,
    private val utcOffset: JsonField<String>,
    private val utcOffsetMilliseconds: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("accountType")
        @ExcludeMissing
        accountType: JsonField<AccountType> = JsonMissing.of(),
        @JsonProperty("additionalCurrencies")
        @ExcludeMissing
        additionalCurrencies: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("companyCurrency")
        @ExcludeMissing
        companyCurrency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataHostingLocation")
        @ExcludeMissing
        dataHostingLocation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("portalId") @ExcludeMissing portalId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("timeZone") @ExcludeMissing timeZone: JsonField<String> = JsonMissing.of(),
        @JsonProperty("uiDomain") @ExcludeMissing uiDomain: JsonField<String> = JsonMissing.of(),
        @JsonProperty("utcOffset") @ExcludeMissing utcOffset: JsonField<String> = JsonMissing.of(),
        @JsonProperty("utcOffsetMilliseconds")
        @ExcludeMissing
        utcOffsetMilliseconds: JsonField<Long> = JsonMissing.of(),
    ) : this(
        accountType,
        additionalCurrencies,
        companyCurrency,
        dataHostingLocation,
        portalId,
        timeZone,
        uiDomain,
        utcOffset,
        utcOffsetMilliseconds,
        mutableMapOf(),
    )

    /**
     * The type of account, such as APP_DEVELOPER, DEVELOPER_TEST, SANDBOX, or STANDARD.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountType(): AccountType = accountType.getRequired("accountType")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun additionalCurrencies(): List<String> =
        additionalCurrencies.getRequired("additionalCurrencies")

    /**
     * The primary currency used by the company.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun companyCurrency(): String = companyCurrency.getRequired("companyCurrency")

    /**
     * The location where the account's data is hosted.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dataHostingLocation(): String = dataHostingLocation.getRequired("dataHostingLocation")

    /**
     * The unique identifier for the HubSpot account.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun portalId(): Int = portalId.getRequired("portalId")

    /**
     * The time zone in which the account operates.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timeZone(): String = timeZone.getRequired("timeZone")

    /**
     * The domain used for accessing the HubSpot user interface.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun uiDomain(): String = uiDomain.getRequired("uiDomain")

    /**
     * The time zone offset from UTC in hours and minutes.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun utcOffset(): String = utcOffset.getRequired("utcOffset")

    /**
     * The time zone offset from UTC in milliseconds.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun utcOffsetMilliseconds(): Long = utcOffsetMilliseconds.getRequired("utcOffsetMilliseconds")

    /**
     * Returns the raw JSON value of [accountType].
     *
     * Unlike [accountType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accountType")
    @ExcludeMissing
    fun _accountType(): JsonField<AccountType> = accountType

    /**
     * Returns the raw JSON value of [additionalCurrencies].
     *
     * Unlike [additionalCurrencies], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("additionalCurrencies")
    @ExcludeMissing
    fun _additionalCurrencies(): JsonField<List<String>> = additionalCurrencies

    /**
     * Returns the raw JSON value of [companyCurrency].
     *
     * Unlike [companyCurrency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("companyCurrency")
    @ExcludeMissing
    fun _companyCurrency(): JsonField<String> = companyCurrency

    /**
     * Returns the raw JSON value of [dataHostingLocation].
     *
     * Unlike [dataHostingLocation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("dataHostingLocation")
    @ExcludeMissing
    fun _dataHostingLocation(): JsonField<String> = dataHostingLocation

    /**
     * Returns the raw JSON value of [portalId].
     *
     * Unlike [portalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("portalId") @ExcludeMissing fun _portalId(): JsonField<Int> = portalId

    /**
     * Returns the raw JSON value of [timeZone].
     *
     * Unlike [timeZone], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timeZone") @ExcludeMissing fun _timeZone(): JsonField<String> = timeZone

    /**
     * Returns the raw JSON value of [uiDomain].
     *
     * Unlike [uiDomain], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("uiDomain") @ExcludeMissing fun _uiDomain(): JsonField<String> = uiDomain

    /**
     * Returns the raw JSON value of [utcOffset].
     *
     * Unlike [utcOffset], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("utcOffset") @ExcludeMissing fun _utcOffset(): JsonField<String> = utcOffset

    /**
     * Returns the raw JSON value of [utcOffsetMilliseconds].
     *
     * Unlike [utcOffsetMilliseconds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("utcOffsetMilliseconds")
    @ExcludeMissing
    fun _utcOffsetMilliseconds(): JsonField<Long> = utcOffsetMilliseconds

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
         * Returns a mutable builder for constructing an instance of [PortalInformationResponse].
         *
         * The following fields are required:
         * ```java
         * .accountType()
         * .additionalCurrencies()
         * .companyCurrency()
         * .dataHostingLocation()
         * .portalId()
         * .timeZone()
         * .uiDomain()
         * .utcOffset()
         * .utcOffsetMilliseconds()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PortalInformationResponse]. */
    class Builder internal constructor() {

        private var accountType: JsonField<AccountType>? = null
        private var additionalCurrencies: JsonField<MutableList<String>>? = null
        private var companyCurrency: JsonField<String>? = null
        private var dataHostingLocation: JsonField<String>? = null
        private var portalId: JsonField<Int>? = null
        private var timeZone: JsonField<String>? = null
        private var uiDomain: JsonField<String>? = null
        private var utcOffset: JsonField<String>? = null
        private var utcOffsetMilliseconds: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(portalInformationResponse: PortalInformationResponse) = apply {
            accountType = portalInformationResponse.accountType
            additionalCurrencies =
                portalInformationResponse.additionalCurrencies.map { it.toMutableList() }
            companyCurrency = portalInformationResponse.companyCurrency
            dataHostingLocation = portalInformationResponse.dataHostingLocation
            portalId = portalInformationResponse.portalId
            timeZone = portalInformationResponse.timeZone
            uiDomain = portalInformationResponse.uiDomain
            utcOffset = portalInformationResponse.utcOffset
            utcOffsetMilliseconds = portalInformationResponse.utcOffsetMilliseconds
            additionalProperties = portalInformationResponse.additionalProperties.toMutableMap()
        }

        /** The type of account, such as APP_DEVELOPER, DEVELOPER_TEST, SANDBOX, or STANDARD. */
        fun accountType(accountType: AccountType) = accountType(JsonField.of(accountType))

        /**
         * Sets [Builder.accountType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountType] with a well-typed [AccountType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accountType(accountType: JsonField<AccountType>) = apply {
            this.accountType = accountType
        }

        fun additionalCurrencies(additionalCurrencies: List<String>) =
            additionalCurrencies(JsonField.of(additionalCurrencies))

        /**
         * Sets [Builder.additionalCurrencies] to an arbitrary JSON value.
         *
         * You should usually call [Builder.additionalCurrencies] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun additionalCurrencies(additionalCurrencies: JsonField<List<String>>) = apply {
            this.additionalCurrencies = additionalCurrencies.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [additionalCurrencies].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAdditionalCurrency(additionalCurrency: String) = apply {
            additionalCurrencies =
                (additionalCurrencies ?: JsonField.of(mutableListOf())).also {
                    checkKnown("additionalCurrencies", it).add(additionalCurrency)
                }
        }

        /** The primary currency used by the company. */
        fun companyCurrency(companyCurrency: String) =
            companyCurrency(JsonField.of(companyCurrency))

        /**
         * Sets [Builder.companyCurrency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyCurrency] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun companyCurrency(companyCurrency: JsonField<String>) = apply {
            this.companyCurrency = companyCurrency
        }

        /** The location where the account's data is hosted. */
        fun dataHostingLocation(dataHostingLocation: String) =
            dataHostingLocation(JsonField.of(dataHostingLocation))

        /**
         * Sets [Builder.dataHostingLocation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataHostingLocation] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dataHostingLocation(dataHostingLocation: JsonField<String>) = apply {
            this.dataHostingLocation = dataHostingLocation
        }

        /** The unique identifier for the HubSpot account. */
        fun portalId(portalId: Int) = portalId(JsonField.of(portalId))

        /**
         * Sets [Builder.portalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.portalId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun portalId(portalId: JsonField<Int>) = apply { this.portalId = portalId }

        /** The time zone in which the account operates. */
        fun timeZone(timeZone: String) = timeZone(JsonField.of(timeZone))

        /**
         * Sets [Builder.timeZone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeZone] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timeZone(timeZone: JsonField<String>) = apply { this.timeZone = timeZone }

        /** The domain used for accessing the HubSpot user interface. */
        fun uiDomain(uiDomain: String) = uiDomain(JsonField.of(uiDomain))

        /**
         * Sets [Builder.uiDomain] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uiDomain] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun uiDomain(uiDomain: JsonField<String>) = apply { this.uiDomain = uiDomain }

        /** The time zone offset from UTC in hours and minutes. */
        fun utcOffset(utcOffset: String) = utcOffset(JsonField.of(utcOffset))

        /**
         * Sets [Builder.utcOffset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.utcOffset] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun utcOffset(utcOffset: JsonField<String>) = apply { this.utcOffset = utcOffset }

        /** The time zone offset from UTC in milliseconds. */
        fun utcOffsetMilliseconds(utcOffsetMilliseconds: Long) =
            utcOffsetMilliseconds(JsonField.of(utcOffsetMilliseconds))

        /**
         * Sets [Builder.utcOffsetMilliseconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.utcOffsetMilliseconds] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun utcOffsetMilliseconds(utcOffsetMilliseconds: JsonField<Long>) = apply {
            this.utcOffsetMilliseconds = utcOffsetMilliseconds
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
         * Returns an immutable instance of [PortalInformationResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountType()
         * .additionalCurrencies()
         * .companyCurrency()
         * .dataHostingLocation()
         * .portalId()
         * .timeZone()
         * .uiDomain()
         * .utcOffset()
         * .utcOffsetMilliseconds()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PortalInformationResponse =
            PortalInformationResponse(
                checkRequired("accountType", accountType),
                checkRequired("additionalCurrencies", additionalCurrencies).map {
                    it.toImmutable()
                },
                checkRequired("companyCurrency", companyCurrency),
                checkRequired("dataHostingLocation", dataHostingLocation),
                checkRequired("portalId", portalId),
                checkRequired("timeZone", timeZone),
                checkRequired("uiDomain", uiDomain),
                checkRequired("utcOffset", utcOffset),
                checkRequired("utcOffsetMilliseconds", utcOffsetMilliseconds),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PortalInformationResponse = apply {
        if (validated) {
            return@apply
        }

        accountType().validate()
        additionalCurrencies()
        companyCurrency()
        dataHostingLocation()
        portalId()
        timeZone()
        uiDomain()
        utcOffset()
        utcOffsetMilliseconds()
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
        (accountType.asKnown().getOrNull()?.validity() ?: 0) +
            (additionalCurrencies.asKnown().getOrNull()?.size ?: 0) +
            (if (companyCurrency.asKnown().isPresent) 1 else 0) +
            (if (dataHostingLocation.asKnown().isPresent) 1 else 0) +
            (if (portalId.asKnown().isPresent) 1 else 0) +
            (if (timeZone.asKnown().isPresent) 1 else 0) +
            (if (uiDomain.asKnown().isPresent) 1 else 0) +
            (if (utcOffset.asKnown().isPresent) 1 else 0) +
            (if (utcOffsetMilliseconds.asKnown().isPresent) 1 else 0)

    /** The type of account, such as APP_DEVELOPER, DEVELOPER_TEST, SANDBOX, or STANDARD. */
    class AccountType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val APP_DEVELOPER = of("APP_DEVELOPER")

            @JvmField val DEVELOPER_TEST = of("DEVELOPER_TEST")

            @JvmField val SANDBOX = of("SANDBOX")

            @JvmField val STANDARD = of("STANDARD")

            @JvmStatic fun of(value: String) = AccountType(JsonField.of(value))
        }

        /** An enum containing [AccountType]'s known values. */
        enum class Known {
            APP_DEVELOPER,
            DEVELOPER_TEST,
            SANDBOX,
            STANDARD,
        }

        /**
         * An enum containing [AccountType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AccountType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            APP_DEVELOPER,
            DEVELOPER_TEST,
            SANDBOX,
            STANDARD,
            /**
             * An enum member indicating that [AccountType] was instantiated with an unknown value.
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
                APP_DEVELOPER -> Value.APP_DEVELOPER
                DEVELOPER_TEST -> Value.DEVELOPER_TEST
                SANDBOX -> Value.SANDBOX
                STANDARD -> Value.STANDARD
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
                APP_DEVELOPER -> Known.APP_DEVELOPER
                DEVELOPER_TEST -> Known.DEVELOPER_TEST
                SANDBOX -> Known.SANDBOX
                STANDARD -> Known.STANDARD
                else -> throw HubSpotInvalidDataException("Unknown AccountType: $value")
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

        fun validate(): AccountType = apply {
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

            return other is AccountType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PortalInformationResponse &&
            accountType == other.accountType &&
            additionalCurrencies == other.additionalCurrencies &&
            companyCurrency == other.companyCurrency &&
            dataHostingLocation == other.dataHostingLocation &&
            portalId == other.portalId &&
            timeZone == other.timeZone &&
            uiDomain == other.uiDomain &&
            utcOffset == other.utcOffset &&
            utcOffsetMilliseconds == other.utcOffsetMilliseconds &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            accountType,
            additionalCurrencies,
            companyCurrency,
            dataHostingLocation,
            portalId,
            timeZone,
            uiDomain,
            utcOffset,
            utcOffsetMilliseconds,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PortalInformationResponse{accountType=$accountType, additionalCurrencies=$additionalCurrencies, companyCurrency=$companyCurrency, dataHostingLocation=$dataHostingLocation, portalId=$portalId, timeZone=$timeZone, uiDomain=$uiDomain, utcOffset=$utcOffset, utcOffsetMilliseconds=$utcOffsetMilliseconds, additionalProperties=$additionalProperties}"
}
