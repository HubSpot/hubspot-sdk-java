// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.calling

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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class FormattedPhoneNumber
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val e164Number: JsonField<String>,
    private val phoneNumberType: JsonField<PhoneNumberType>,
    private val extension: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("e164Number")
        @ExcludeMissing
        e164Number: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phoneNumberType")
        @ExcludeMissing
        phoneNumberType: JsonField<PhoneNumberType> = JsonMissing.of(),
        @JsonProperty("extension") @ExcludeMissing extension: JsonField<String> = JsonMissing.of(),
    ) : this(e164Number, phoneNumberType, extension, mutableMapOf())

    /**
     * The phone number formatted in E.164 standard.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun e164Number(): String = e164Number.getRequired("e164Number")

    /**
     * The type of phone number, with accepted values including FIXED_LINE, MOBILE, VOIP, and
     * others.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun phoneNumberType(): PhoneNumberType = phoneNumberType.getRequired("phoneNumberType")

    /**
     * The extension number associated with the phone number.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun extension(): Optional<String> = extension.getOptional("extension")

    /**
     * Returns the raw JSON value of [e164Number].
     *
     * Unlike [e164Number], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("e164Number") @ExcludeMissing fun _e164Number(): JsonField<String> = e164Number

    /**
     * Returns the raw JSON value of [phoneNumberType].
     *
     * Unlike [phoneNumberType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phoneNumberType")
    @ExcludeMissing
    fun _phoneNumberType(): JsonField<PhoneNumberType> = phoneNumberType

    /**
     * Returns the raw JSON value of [extension].
     *
     * Unlike [extension], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("extension") @ExcludeMissing fun _extension(): JsonField<String> = extension

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
         * Returns a mutable builder for constructing an instance of [FormattedPhoneNumber].
         *
         * The following fields are required:
         * ```java
         * .e164Number()
         * .phoneNumberType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FormattedPhoneNumber]. */
    class Builder internal constructor() {

        private var e164Number: JsonField<String>? = null
        private var phoneNumberType: JsonField<PhoneNumberType>? = null
        private var extension: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(formattedPhoneNumber: FormattedPhoneNumber) = apply {
            e164Number = formattedPhoneNumber.e164Number
            phoneNumberType = formattedPhoneNumber.phoneNumberType
            extension = formattedPhoneNumber.extension
            additionalProperties = formattedPhoneNumber.additionalProperties.toMutableMap()
        }

        /** The phone number formatted in E.164 standard. */
        fun e164Number(e164Number: String) = e164Number(JsonField.of(e164Number))

        /**
         * Sets [Builder.e164Number] to an arbitrary JSON value.
         *
         * You should usually call [Builder.e164Number] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun e164Number(e164Number: JsonField<String>) = apply { this.e164Number = e164Number }

        /**
         * The type of phone number, with accepted values including FIXED_LINE, MOBILE, VOIP, and
         * others.
         */
        fun phoneNumberType(phoneNumberType: PhoneNumberType) =
            phoneNumberType(JsonField.of(phoneNumberType))

        /**
         * Sets [Builder.phoneNumberType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumberType] with a well-typed [PhoneNumberType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun phoneNumberType(phoneNumberType: JsonField<PhoneNumberType>) = apply {
            this.phoneNumberType = phoneNumberType
        }

        /** The extension number associated with the phone number. */
        fun extension(extension: String) = extension(JsonField.of(extension))

        /**
         * Sets [Builder.extension] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extension] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun extension(extension: JsonField<String>) = apply { this.extension = extension }

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
         * Returns an immutable instance of [FormattedPhoneNumber].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .e164Number()
         * .phoneNumberType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FormattedPhoneNumber =
            FormattedPhoneNumber(
                checkRequired("e164Number", e164Number),
                checkRequired("phoneNumberType", phoneNumberType),
                extension,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FormattedPhoneNumber = apply {
        if (validated) {
            return@apply
        }

        e164Number()
        phoneNumberType().validate()
        extension()
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
        (if (e164Number.asKnown().isPresent) 1 else 0) +
            (phoneNumberType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (extension.asKnown().isPresent) 1 else 0)

    /**
     * The type of phone number, with accepted values including FIXED_LINE, MOBILE, VOIP, and
     * others.
     */
    class PhoneNumberType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val FIXED_LINE = of("FIXED_LINE")

            @JvmField val FIXED_LINE_OR_MOBILE = of("FIXED_LINE_OR_MOBILE")

            @JvmField val MOBILE = of("MOBILE")

            @JvmField val PAGER = of("PAGER")

            @JvmField val PERSONAL_NUMBER = of("PERSONAL_NUMBER")

            @JvmField val PREMIUM_RATE = of("PREMIUM_RATE")

            @JvmField val SHARED_COST = of("SHARED_COST")

            @JvmField val TOLL_FREE = of("TOLL_FREE")

            @JvmField val UAN = of("UAN")

            @JvmField val UNKNOWN = of("UNKNOWN")

            @JvmField val VOICEMAIL = of("VOICEMAIL")

            @JvmField val VOIP = of("VOIP")

            @JvmStatic fun of(value: String) = PhoneNumberType(JsonField.of(value))
        }

        /** An enum containing [PhoneNumberType]'s known values. */
        enum class Known {
            FIXED_LINE,
            FIXED_LINE_OR_MOBILE,
            MOBILE,
            PAGER,
            PERSONAL_NUMBER,
            PREMIUM_RATE,
            SHARED_COST,
            TOLL_FREE,
            UAN,
            UNKNOWN,
            VOICEMAIL,
            VOIP,
        }

        /**
         * An enum containing [PhoneNumberType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PhoneNumberType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FIXED_LINE,
            FIXED_LINE_OR_MOBILE,
            MOBILE,
            PAGER,
            PERSONAL_NUMBER,
            PREMIUM_RATE,
            SHARED_COST,
            TOLL_FREE,
            UAN,
            UNKNOWN,
            VOICEMAIL,
            VOIP,
            /**
             * An enum member indicating that [PhoneNumberType] was instantiated with an unknown
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
                FIXED_LINE -> Value.FIXED_LINE
                FIXED_LINE_OR_MOBILE -> Value.FIXED_LINE_OR_MOBILE
                MOBILE -> Value.MOBILE
                PAGER -> Value.PAGER
                PERSONAL_NUMBER -> Value.PERSONAL_NUMBER
                PREMIUM_RATE -> Value.PREMIUM_RATE
                SHARED_COST -> Value.SHARED_COST
                TOLL_FREE -> Value.TOLL_FREE
                UAN -> Value.UAN
                UNKNOWN -> Value.UNKNOWN
                VOICEMAIL -> Value.VOICEMAIL
                VOIP -> Value.VOIP
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
                FIXED_LINE -> Known.FIXED_LINE
                FIXED_LINE_OR_MOBILE -> Known.FIXED_LINE_OR_MOBILE
                MOBILE -> Known.MOBILE
                PAGER -> Known.PAGER
                PERSONAL_NUMBER -> Known.PERSONAL_NUMBER
                PREMIUM_RATE -> Known.PREMIUM_RATE
                SHARED_COST -> Known.SHARED_COST
                TOLL_FREE -> Known.TOLL_FREE
                UAN -> Known.UAN
                UNKNOWN -> Known.UNKNOWN
                VOICEMAIL -> Known.VOICEMAIL
                VOIP -> Known.VOIP
                else -> throw HubSpotInvalidDataException("Unknown PhoneNumberType: $value")
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

        fun validate(): PhoneNumberType = apply {
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

            return other is PhoneNumberType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FormattedPhoneNumber &&
            e164Number == other.e164Number &&
            phoneNumberType == other.phoneNumberType &&
            extension == other.extension &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(e164Number, phoneNumberType, extension, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FormattedPhoneNumber{e164Number=$e164Number, phoneNumberType=$phoneNumberType, extension=$extension, additionalProperties=$additionalProperties}"
}
