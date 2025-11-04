// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.propertyvalidations

import com.fasterxml.jackson.annotation.JsonCreator
import com.hubspot_sdk.api.core.Enum
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams
private constructor(
    private val objectTypeId: String,
    private val propertyName: String,
    private val ruleType: RuleType?,
    private val publicPropertyValidationRuleUpdate: PublicPropertyValidationRuleUpdate,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun objectTypeId(): String = objectTypeId

    fun propertyName(): String = propertyName

    fun ruleType(): Optional<RuleType> = Optional.ofNullable(ruleType)

    fun publicPropertyValidationRuleUpdate(): PublicPropertyValidationRuleUpdate =
        publicPropertyValidationRuleUpdate

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        publicPropertyValidationRuleUpdate._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams].
         *
         * The following fields are required:
         * ```java
         * .objectTypeId()
         * .propertyName()
         * .publicPropertyValidationRuleUpdate()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /**
     * A builder for
     * [PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams].
     */
    class Builder internal constructor() {

        private var objectTypeId: String? = null
        private var propertyName: String? = null
        private var ruleType: RuleType? = null
        private var publicPropertyValidationRuleUpdate: PublicPropertyValidationRuleUpdate? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            propertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams:
                PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams
        ) = apply {
            objectTypeId =
                propertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams
                    .objectTypeId
            propertyName =
                propertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams
                    .propertyName
            ruleType =
                propertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams
                    .ruleType
            publicPropertyValidationRuleUpdate =
                propertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams
                    .publicPropertyValidationRuleUpdate
            additionalHeaders =
                propertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams
                    .additionalHeaders
                    .toBuilder()
            additionalQueryParams =
                propertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams
                    .additionalQueryParams
                    .toBuilder()
        }

        fun objectTypeId(objectTypeId: String) = apply { this.objectTypeId = objectTypeId }

        fun propertyName(propertyName: String) = apply { this.propertyName = propertyName }

        fun ruleType(ruleType: RuleType?) = apply { this.ruleType = ruleType }

        /** Alias for calling [Builder.ruleType] with `ruleType.orElse(null)`. */
        fun ruleType(ruleType: Optional<RuleType>) = ruleType(ruleType.getOrNull())

        fun publicPropertyValidationRuleUpdate(
            publicPropertyValidationRuleUpdate: PublicPropertyValidationRuleUpdate
        ) = apply { this.publicPropertyValidationRuleUpdate = publicPropertyValidationRuleUpdate }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of
         * [PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .objectTypeId()
         * .propertyName()
         * .publicPropertyValidationRuleUpdate()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build():
            PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams =
            PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams(
                checkRequired("objectTypeId", objectTypeId),
                checkRequired("propertyName", propertyName),
                ruleType,
                checkRequired(
                    "publicPropertyValidationRuleUpdate",
                    publicPropertyValidationRuleUpdate,
                ),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): PublicPropertyValidationRuleUpdate = publicPropertyValidationRuleUpdate

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> objectTypeId
            1 -> propertyName
            2 -> ruleType?.toString() ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

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

            @JvmField val FORMAT = of("FORMAT")

            @JvmField val ALPHANUMERIC = of("ALPHANUMERIC")

            @JvmField val MAX_LENGTH = of("MAX_LENGTH")

            @JvmField val MIN_LENGTH = of("MIN_LENGTH")

            @JvmField val MIN_NUMBER = of("MIN_NUMBER")

            @JvmField val MAX_NUMBER = of("MAX_NUMBER")

            @JvmField val START_DATE = of("START_DATE")

            @JvmField val END_DATE = of("END_DATE")

            @JvmField val SPECIAL_CHARACTERS = of("SPECIAL_CHARACTERS")

            @JvmField val WHITESPACE = of("WHITESPACE")

            @JvmField val DECIMAL = of("DECIMAL")

            @JvmField val BEFORE_DURATION = of("BEFORE_DURATION")

            @JvmField val AFTER_DURATION = of("AFTER_DURATION")

            @JvmField val DAYS_OF_WEEK = of("DAYS_OF_WEEK")

            @JvmField val REGEX = of("REGEX")

            @JvmField val START_DATETIME = of("START_DATETIME")

            @JvmField val END_DATETIME = of("END_DATETIME")

            @JvmField val BEFORE_DATETIME_DURATION = of("BEFORE_DATETIME_DURATION")

            @JvmField val AFTER_DATETIME_DURATION = of("AFTER_DATETIME_DURATION")

            @JvmField
            val PHONE_NUMBER_WITH_EXPLICIT_COUNTRY_CODE =
                of("PHONE_NUMBER_WITH_EXPLICIT_COUNTRY_CODE")

            @JvmField val URL = of("URL")

            @JvmField val URL_ALLOWED_DOMAINS = of("URL_ALLOWED_DOMAINS")

            @JvmField val URL_BLOCKED_DOMAINS = of("URL_BLOCKED_DOMAINS")

            @JvmField val EMAIL = of("EMAIL")

            @JvmField val EMAIL_ALLOWED_DOMAINS = of("EMAIL_ALLOWED_DOMAINS")

            @JvmField val EMAIL_BLOCKED_DOMAINS = of("EMAIL_BLOCKED_DOMAINS")

            @JvmField val DOMAIN = of("DOMAIN")

            @JvmStatic fun of(value: String) = RuleType(JsonField.of(value))
        }

        /** An enum containing [RuleType]'s known values. */
        enum class Known {
            FORMAT,
            ALPHANUMERIC,
            MAX_LENGTH,
            MIN_LENGTH,
            MIN_NUMBER,
            MAX_NUMBER,
            START_DATE,
            END_DATE,
            SPECIAL_CHARACTERS,
            WHITESPACE,
            DECIMAL,
            BEFORE_DURATION,
            AFTER_DURATION,
            DAYS_OF_WEEK,
            REGEX,
            START_DATETIME,
            END_DATETIME,
            BEFORE_DATETIME_DURATION,
            AFTER_DATETIME_DURATION,
            PHONE_NUMBER_WITH_EXPLICIT_COUNTRY_CODE,
            URL,
            URL_ALLOWED_DOMAINS,
            URL_BLOCKED_DOMAINS,
            EMAIL,
            EMAIL_ALLOWED_DOMAINS,
            EMAIL_BLOCKED_DOMAINS,
            DOMAIN,
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
            FORMAT,
            ALPHANUMERIC,
            MAX_LENGTH,
            MIN_LENGTH,
            MIN_NUMBER,
            MAX_NUMBER,
            START_DATE,
            END_DATE,
            SPECIAL_CHARACTERS,
            WHITESPACE,
            DECIMAL,
            BEFORE_DURATION,
            AFTER_DURATION,
            DAYS_OF_WEEK,
            REGEX,
            START_DATETIME,
            END_DATETIME,
            BEFORE_DATETIME_DURATION,
            AFTER_DATETIME_DURATION,
            PHONE_NUMBER_WITH_EXPLICIT_COUNTRY_CODE,
            URL,
            URL_ALLOWED_DOMAINS,
            URL_BLOCKED_DOMAINS,
            EMAIL,
            EMAIL_ALLOWED_DOMAINS,
            EMAIL_BLOCKED_DOMAINS,
            DOMAIN,
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
                FORMAT -> Value.FORMAT
                ALPHANUMERIC -> Value.ALPHANUMERIC
                MAX_LENGTH -> Value.MAX_LENGTH
                MIN_LENGTH -> Value.MIN_LENGTH
                MIN_NUMBER -> Value.MIN_NUMBER
                MAX_NUMBER -> Value.MAX_NUMBER
                START_DATE -> Value.START_DATE
                END_DATE -> Value.END_DATE
                SPECIAL_CHARACTERS -> Value.SPECIAL_CHARACTERS
                WHITESPACE -> Value.WHITESPACE
                DECIMAL -> Value.DECIMAL
                BEFORE_DURATION -> Value.BEFORE_DURATION
                AFTER_DURATION -> Value.AFTER_DURATION
                DAYS_OF_WEEK -> Value.DAYS_OF_WEEK
                REGEX -> Value.REGEX
                START_DATETIME -> Value.START_DATETIME
                END_DATETIME -> Value.END_DATETIME
                BEFORE_DATETIME_DURATION -> Value.BEFORE_DATETIME_DURATION
                AFTER_DATETIME_DURATION -> Value.AFTER_DATETIME_DURATION
                PHONE_NUMBER_WITH_EXPLICIT_COUNTRY_CODE ->
                    Value.PHONE_NUMBER_WITH_EXPLICIT_COUNTRY_CODE
                URL -> Value.URL
                URL_ALLOWED_DOMAINS -> Value.URL_ALLOWED_DOMAINS
                URL_BLOCKED_DOMAINS -> Value.URL_BLOCKED_DOMAINS
                EMAIL -> Value.EMAIL
                EMAIL_ALLOWED_DOMAINS -> Value.EMAIL_ALLOWED_DOMAINS
                EMAIL_BLOCKED_DOMAINS -> Value.EMAIL_BLOCKED_DOMAINS
                DOMAIN -> Value.DOMAIN
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
                FORMAT -> Known.FORMAT
                ALPHANUMERIC -> Known.ALPHANUMERIC
                MAX_LENGTH -> Known.MAX_LENGTH
                MIN_LENGTH -> Known.MIN_LENGTH
                MIN_NUMBER -> Known.MIN_NUMBER
                MAX_NUMBER -> Known.MAX_NUMBER
                START_DATE -> Known.START_DATE
                END_DATE -> Known.END_DATE
                SPECIAL_CHARACTERS -> Known.SPECIAL_CHARACTERS
                WHITESPACE -> Known.WHITESPACE
                DECIMAL -> Known.DECIMAL
                BEFORE_DURATION -> Known.BEFORE_DURATION
                AFTER_DURATION -> Known.AFTER_DURATION
                DAYS_OF_WEEK -> Known.DAYS_OF_WEEK
                REGEX -> Known.REGEX
                START_DATETIME -> Known.START_DATETIME
                END_DATETIME -> Known.END_DATETIME
                BEFORE_DATETIME_DURATION -> Known.BEFORE_DATETIME_DURATION
                AFTER_DATETIME_DURATION -> Known.AFTER_DATETIME_DURATION
                PHONE_NUMBER_WITH_EXPLICIT_COUNTRY_CODE ->
                    Known.PHONE_NUMBER_WITH_EXPLICIT_COUNTRY_CODE
                URL -> Known.URL
                URL_ALLOWED_DOMAINS -> Known.URL_ALLOWED_DOMAINS
                URL_BLOCKED_DOMAINS -> Known.URL_BLOCKED_DOMAINS
                EMAIL -> Known.EMAIL
                EMAIL_ALLOWED_DOMAINS -> Known.EMAIL_ALLOWED_DOMAINS
                EMAIL_BLOCKED_DOMAINS -> Known.EMAIL_BLOCKED_DOMAINS
                DOMAIN -> Known.DOMAIN
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

        return other is
            PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams &&
            objectTypeId == other.objectTypeId &&
            propertyName == other.propertyName &&
            ruleType == other.ruleType &&
            publicPropertyValidationRuleUpdate == other.publicPropertyValidationRuleUpdate &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            objectTypeId,
            propertyName,
            ruleType,
            publicPropertyValidationRuleUpdate,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams{objectTypeId=$objectTypeId, propertyName=$propertyName, ruleType=$ruleType, publicPropertyValidationRuleUpdate=$publicPropertyValidationRuleUpdate, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
