// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.propertyvalidations

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.Enum
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class PublicPropertyValidationRule
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val ruleArguments: JsonField<List<String>>,
    private val ruleType: JsonField<RuleType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("ruleArguments")
        @ExcludeMissing
        ruleArguments: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("ruleType") @ExcludeMissing ruleType: JsonField<RuleType> = JsonMissing.of(),
    ) : this(ruleArguments, ruleType, mutableMapOf())

    /**
     * A list of arguments that define the specific conditions or parameters for the validation
     * rule.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ruleArguments(): List<String> = ruleArguments.getRequired("ruleArguments")

    /**
     * The category of validation applied to the property, such as FORMAT, ALPHANUMERIC, or
     * MAX_LENGTH.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ruleType(): RuleType = ruleType.getRequired("ruleType")

    /**
     * Returns the raw JSON value of [ruleArguments].
     *
     * Unlike [ruleArguments], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ruleArguments")
    @ExcludeMissing
    fun _ruleArguments(): JsonField<List<String>> = ruleArguments

    /**
     * Returns the raw JSON value of [ruleType].
     *
     * Unlike [ruleType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ruleType") @ExcludeMissing fun _ruleType(): JsonField<RuleType> = ruleType

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
         * Returns a mutable builder for constructing an instance of [PublicPropertyValidationRule].
         *
         * The following fields are required:
         * ```java
         * .ruleArguments()
         * .ruleType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicPropertyValidationRule]. */
    class Builder internal constructor() {

        private var ruleArguments: JsonField<MutableList<String>>? = null
        private var ruleType: JsonField<RuleType>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicPropertyValidationRule: PublicPropertyValidationRule) = apply {
            ruleArguments = publicPropertyValidationRule.ruleArguments.map { it.toMutableList() }
            ruleType = publicPropertyValidationRule.ruleType
            additionalProperties = publicPropertyValidationRule.additionalProperties.toMutableMap()
        }

        /**
         * A list of arguments that define the specific conditions or parameters for the validation
         * rule.
         */
        fun ruleArguments(ruleArguments: List<String>) = ruleArguments(JsonField.of(ruleArguments))

        /**
         * Sets [Builder.ruleArguments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ruleArguments] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ruleArguments(ruleArguments: JsonField<List<String>>) = apply {
            this.ruleArguments = ruleArguments.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [ruleArguments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRuleArgument(ruleArgument: String) = apply {
            ruleArguments =
                (ruleArguments ?: JsonField.of(mutableListOf())).also {
                    checkKnown("ruleArguments", it).add(ruleArgument)
                }
        }

        /**
         * The category of validation applied to the property, such as FORMAT, ALPHANUMERIC, or
         * MAX_LENGTH.
         */
        fun ruleType(ruleType: RuleType) = ruleType(JsonField.of(ruleType))

        /**
         * Sets [Builder.ruleType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ruleType] with a well-typed [RuleType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ruleType(ruleType: JsonField<RuleType>) = apply { this.ruleType = ruleType }

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
         * Returns an immutable instance of [PublicPropertyValidationRule].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .ruleArguments()
         * .ruleType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicPropertyValidationRule =
            PublicPropertyValidationRule(
                checkRequired("ruleArguments", ruleArguments).map { it.toImmutable() },
                checkRequired("ruleType", ruleType),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicPropertyValidationRule = apply {
        if (validated) {
            return@apply
        }

        ruleArguments()
        ruleType().validate()
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
        (ruleArguments.asKnown().getOrNull()?.size ?: 0) +
            (ruleType.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * The category of validation applied to the property, such as FORMAT, ALPHANUMERIC, or
     * MAX_LENGTH.
     */
    class RuleType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val AFTER_DATETIME_DURATION = of("AFTER_DATETIME_DURATION")

            @JvmField val AFTER_DURATION = of("AFTER_DURATION")

            @JvmField val ALPHANUMERIC = of("ALPHANUMERIC")

            @JvmField val BEFORE_DATETIME_DURATION = of("BEFORE_DATETIME_DURATION")

            @JvmField val BEFORE_DURATION = of("BEFORE_DURATION")

            @JvmField val DAYS_OF_WEEK = of("DAYS_OF_WEEK")

            @JvmField val DECIMAL = of("DECIMAL")

            @JvmField val DOMAIN = of("DOMAIN")

            @JvmField val EMAIL = of("EMAIL")

            @JvmField val EMAIL_ALLOWED_DOMAINS = of("EMAIL_ALLOWED_DOMAINS")

            @JvmField val EMAIL_BLOCKED_DOMAINS = of("EMAIL_BLOCKED_DOMAINS")

            @JvmField val END_DATE = of("END_DATE")

            @JvmField val END_DATETIME = of("END_DATETIME")

            @JvmField val FORMAT = of("FORMAT")

            @JvmField val MAX_LENGTH = of("MAX_LENGTH")

            @JvmField val MAX_NUMBER = of("MAX_NUMBER")

            @JvmField val MIN_LENGTH = of("MIN_LENGTH")

            @JvmField val MIN_NUMBER = of("MIN_NUMBER")

            @JvmField
            val PHONE_NUMBER_WITH_EXPLICIT_COUNTRY_CODE =
                of("PHONE_NUMBER_WITH_EXPLICIT_COUNTRY_CODE")

            @JvmField val REGEX = of("REGEX")

            @JvmField val SPECIAL_CHARACTERS = of("SPECIAL_CHARACTERS")

            @JvmField val START_DATE = of("START_DATE")

            @JvmField val START_DATETIME = of("START_DATETIME")

            @JvmField val URL = of("URL")

            @JvmField val URL_ALLOWED_DOMAINS = of("URL_ALLOWED_DOMAINS")

            @JvmField val URL_BLOCKED_DOMAINS = of("URL_BLOCKED_DOMAINS")

            @JvmField val WHITESPACE = of("WHITESPACE")

            @JvmStatic fun of(value: String) = RuleType(JsonField.of(value))
        }

        /** An enum containing [RuleType]'s known values. */
        enum class Known {
            AFTER_DATETIME_DURATION,
            AFTER_DURATION,
            ALPHANUMERIC,
            BEFORE_DATETIME_DURATION,
            BEFORE_DURATION,
            DAYS_OF_WEEK,
            DECIMAL,
            DOMAIN,
            EMAIL,
            EMAIL_ALLOWED_DOMAINS,
            EMAIL_BLOCKED_DOMAINS,
            END_DATE,
            END_DATETIME,
            FORMAT,
            MAX_LENGTH,
            MAX_NUMBER,
            MIN_LENGTH,
            MIN_NUMBER,
            PHONE_NUMBER_WITH_EXPLICIT_COUNTRY_CODE,
            REGEX,
            SPECIAL_CHARACTERS,
            START_DATE,
            START_DATETIME,
            URL,
            URL_ALLOWED_DOMAINS,
            URL_BLOCKED_DOMAINS,
            WHITESPACE,
        }

        /**
         * An enum containing [RuleType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RuleType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AFTER_DATETIME_DURATION,
            AFTER_DURATION,
            ALPHANUMERIC,
            BEFORE_DATETIME_DURATION,
            BEFORE_DURATION,
            DAYS_OF_WEEK,
            DECIMAL,
            DOMAIN,
            EMAIL,
            EMAIL_ALLOWED_DOMAINS,
            EMAIL_BLOCKED_DOMAINS,
            END_DATE,
            END_DATETIME,
            FORMAT,
            MAX_LENGTH,
            MAX_NUMBER,
            MIN_LENGTH,
            MIN_NUMBER,
            PHONE_NUMBER_WITH_EXPLICIT_COUNTRY_CODE,
            REGEX,
            SPECIAL_CHARACTERS,
            START_DATE,
            START_DATETIME,
            URL,
            URL_ALLOWED_DOMAINS,
            URL_BLOCKED_DOMAINS,
            WHITESPACE,
            /** An enum member indicating that [RuleType] was instantiated with an unknown value. */
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
                AFTER_DATETIME_DURATION -> Value.AFTER_DATETIME_DURATION
                AFTER_DURATION -> Value.AFTER_DURATION
                ALPHANUMERIC -> Value.ALPHANUMERIC
                BEFORE_DATETIME_DURATION -> Value.BEFORE_DATETIME_DURATION
                BEFORE_DURATION -> Value.BEFORE_DURATION
                DAYS_OF_WEEK -> Value.DAYS_OF_WEEK
                DECIMAL -> Value.DECIMAL
                DOMAIN -> Value.DOMAIN
                EMAIL -> Value.EMAIL
                EMAIL_ALLOWED_DOMAINS -> Value.EMAIL_ALLOWED_DOMAINS
                EMAIL_BLOCKED_DOMAINS -> Value.EMAIL_BLOCKED_DOMAINS
                END_DATE -> Value.END_DATE
                END_DATETIME -> Value.END_DATETIME
                FORMAT -> Value.FORMAT
                MAX_LENGTH -> Value.MAX_LENGTH
                MAX_NUMBER -> Value.MAX_NUMBER
                MIN_LENGTH -> Value.MIN_LENGTH
                MIN_NUMBER -> Value.MIN_NUMBER
                PHONE_NUMBER_WITH_EXPLICIT_COUNTRY_CODE ->
                    Value.PHONE_NUMBER_WITH_EXPLICIT_COUNTRY_CODE
                REGEX -> Value.REGEX
                SPECIAL_CHARACTERS -> Value.SPECIAL_CHARACTERS
                START_DATE -> Value.START_DATE
                START_DATETIME -> Value.START_DATETIME
                URL -> Value.URL
                URL_ALLOWED_DOMAINS -> Value.URL_ALLOWED_DOMAINS
                URL_BLOCKED_DOMAINS -> Value.URL_BLOCKED_DOMAINS
                WHITESPACE -> Value.WHITESPACE
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
                AFTER_DATETIME_DURATION -> Known.AFTER_DATETIME_DURATION
                AFTER_DURATION -> Known.AFTER_DURATION
                ALPHANUMERIC -> Known.ALPHANUMERIC
                BEFORE_DATETIME_DURATION -> Known.BEFORE_DATETIME_DURATION
                BEFORE_DURATION -> Known.BEFORE_DURATION
                DAYS_OF_WEEK -> Known.DAYS_OF_WEEK
                DECIMAL -> Known.DECIMAL
                DOMAIN -> Known.DOMAIN
                EMAIL -> Known.EMAIL
                EMAIL_ALLOWED_DOMAINS -> Known.EMAIL_ALLOWED_DOMAINS
                EMAIL_BLOCKED_DOMAINS -> Known.EMAIL_BLOCKED_DOMAINS
                END_DATE -> Known.END_DATE
                END_DATETIME -> Known.END_DATETIME
                FORMAT -> Known.FORMAT
                MAX_LENGTH -> Known.MAX_LENGTH
                MAX_NUMBER -> Known.MAX_NUMBER
                MIN_LENGTH -> Known.MIN_LENGTH
                MIN_NUMBER -> Known.MIN_NUMBER
                PHONE_NUMBER_WITH_EXPLICIT_COUNTRY_CODE ->
                    Known.PHONE_NUMBER_WITH_EXPLICIT_COUNTRY_CODE
                REGEX -> Known.REGEX
                SPECIAL_CHARACTERS -> Known.SPECIAL_CHARACTERS
                START_DATE -> Known.START_DATE
                START_DATETIME -> Known.START_DATETIME
                URL -> Known.URL
                URL_ALLOWED_DOMAINS -> Known.URL_ALLOWED_DOMAINS
                URL_BLOCKED_DOMAINS -> Known.URL_BLOCKED_DOMAINS
                WHITESPACE -> Known.WHITESPACE
                else -> throw HubspotInvalidDataException("Unknown RuleType: $value")
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

        fun validate(): RuleType = apply {
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

            return other is RuleType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicPropertyValidationRule &&
            ruleArguments == other.ruleArguments &&
            ruleType == other.ruleType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(ruleArguments, ruleType, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicPropertyValidationRule{ruleArguments=$ruleArguments, ruleType=$ruleType, additionalProperties=$additionalProperties}"
}
