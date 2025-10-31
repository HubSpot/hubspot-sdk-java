// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.forms

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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class LegalConsentOptionsImplicitConsentToProcess
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val communicationsCheckboxes: JsonField<List<LegalConsentCheckbox>>,
    private val privacyText: JsonField<String>,
    private val type: JsonField<Type>,
    private val communicationConsentText: JsonField<String>,
    private val consentToProcessText: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("communicationsCheckboxes")
        @ExcludeMissing
        communicationsCheckboxes: JsonField<List<LegalConsentCheckbox>> = JsonMissing.of(),
        @JsonProperty("privacyText")
        @ExcludeMissing
        privacyText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("communicationConsentText")
        @ExcludeMissing
        communicationConsentText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("consentToProcessText")
        @ExcludeMissing
        consentToProcessText: JsonField<String> = JsonMissing.of(),
    ) : this(
        communicationsCheckboxes,
        privacyText,
        type,
        communicationConsentText,
        consentToProcessText,
        mutableMapOf(),
    )

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun communicationsCheckboxes(): List<LegalConsentCheckbox> =
        communicationsCheckboxes.getRequired("communicationsCheckboxes")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun privacyText(): String = privacyText.getRequired("privacyText")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun communicationConsentText(): Optional<String> =
        communicationConsentText.getOptional("communicationConsentText")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun consentToProcessText(): Optional<String> =
        consentToProcessText.getOptional("consentToProcessText")

    /**
     * Returns the raw JSON value of [communicationsCheckboxes].
     *
     * Unlike [communicationsCheckboxes], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("communicationsCheckboxes")
    @ExcludeMissing
    fun _communicationsCheckboxes(): JsonField<List<LegalConsentCheckbox>> =
        communicationsCheckboxes

    /**
     * Returns the raw JSON value of [privacyText].
     *
     * Unlike [privacyText], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("privacyText") @ExcludeMissing fun _privacyText(): JsonField<String> = privacyText

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [communicationConsentText].
     *
     * Unlike [communicationConsentText], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("communicationConsentText")
    @ExcludeMissing
    fun _communicationConsentText(): JsonField<String> = communicationConsentText

    /**
     * Returns the raw JSON value of [consentToProcessText].
     *
     * Unlike [consentToProcessText], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("consentToProcessText")
    @ExcludeMissing
    fun _consentToProcessText(): JsonField<String> = consentToProcessText

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
         * Returns a mutable builder for constructing an instance of
         * [LegalConsentOptionsImplicitConsentToProcess].
         *
         * The following fields are required:
         * ```java
         * .communicationsCheckboxes()
         * .privacyText()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LegalConsentOptionsImplicitConsentToProcess]. */
    class Builder internal constructor() {

        private var communicationsCheckboxes: JsonField<MutableList<LegalConsentCheckbox>>? = null
        private var privacyText: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var communicationConsentText: JsonField<String> = JsonMissing.of()
        private var consentToProcessText: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            legalConsentOptionsImplicitConsentToProcess: LegalConsentOptionsImplicitConsentToProcess
        ) = apply {
            communicationsCheckboxes =
                legalConsentOptionsImplicitConsentToProcess.communicationsCheckboxes.map {
                    it.toMutableList()
                }
            privacyText = legalConsentOptionsImplicitConsentToProcess.privacyText
            type = legalConsentOptionsImplicitConsentToProcess.type
            communicationConsentText =
                legalConsentOptionsImplicitConsentToProcess.communicationConsentText
            consentToProcessText = legalConsentOptionsImplicitConsentToProcess.consentToProcessText
            additionalProperties =
                legalConsentOptionsImplicitConsentToProcess.additionalProperties.toMutableMap()
        }

        fun communicationsCheckboxes(communicationsCheckboxes: List<LegalConsentCheckbox>) =
            communicationsCheckboxes(JsonField.of(communicationsCheckboxes))

        /**
         * Sets [Builder.communicationsCheckboxes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.communicationsCheckboxes] with a well-typed
         * `List<LegalConsentCheckbox>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun communicationsCheckboxes(
            communicationsCheckboxes: JsonField<List<LegalConsentCheckbox>>
        ) = apply {
            this.communicationsCheckboxes = communicationsCheckboxes.map { it.toMutableList() }
        }

        /**
         * Adds a single [LegalConsentCheckbox] to [communicationsCheckboxes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCommunicationsCheckbox(communicationsCheckbox: LegalConsentCheckbox) = apply {
            communicationsCheckboxes =
                (communicationsCheckboxes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("communicationsCheckboxes", it).add(communicationsCheckbox)
                }
        }

        fun privacyText(privacyText: String) = privacyText(JsonField.of(privacyText))

        /**
         * Sets [Builder.privacyText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.privacyText] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun privacyText(privacyText: JsonField<String>) = apply { this.privacyText = privacyText }

        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun communicationConsentText(communicationConsentText: String) =
            communicationConsentText(JsonField.of(communicationConsentText))

        /**
         * Sets [Builder.communicationConsentText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.communicationConsentText] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun communicationConsentText(communicationConsentText: JsonField<String>) = apply {
            this.communicationConsentText = communicationConsentText
        }

        fun consentToProcessText(consentToProcessText: String) =
            consentToProcessText(JsonField.of(consentToProcessText))

        /**
         * Sets [Builder.consentToProcessText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.consentToProcessText] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun consentToProcessText(consentToProcessText: JsonField<String>) = apply {
            this.consentToProcessText = consentToProcessText
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
         * Returns an immutable instance of [LegalConsentOptionsImplicitConsentToProcess].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .communicationsCheckboxes()
         * .privacyText()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LegalConsentOptionsImplicitConsentToProcess =
            LegalConsentOptionsImplicitConsentToProcess(
                checkRequired("communicationsCheckboxes", communicationsCheckboxes).map {
                    it.toImmutable()
                },
                checkRequired("privacyText", privacyText),
                checkRequired("type", type),
                communicationConsentText,
                consentToProcessText,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LegalConsentOptionsImplicitConsentToProcess = apply {
        if (validated) {
            return@apply
        }

        communicationsCheckboxes().forEach { it.validate() }
        privacyText()
        type().validate()
        communicationConsentText()
        consentToProcessText()
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
        (communicationsCheckboxes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (privacyText.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (communicationConsentText.asKnown().isPresent) 1 else 0) +
            (if (consentToProcessText.asKnown().isPresent) 1 else 0)

    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val IMPLICIT_CONSENT_TO_PROCESS = of("implicit_consent_to_process")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            IMPLICIT_CONSENT_TO_PROCESS
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            IMPLICIT_CONSENT_TO_PROCESS,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                IMPLICIT_CONSENT_TO_PROCESS -> Value.IMPLICIT_CONSENT_TO_PROCESS
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
                IMPLICIT_CONSENT_TO_PROCESS -> Known.IMPLICIT_CONSENT_TO_PROCESS
                else -> throw HubspotInvalidDataException("Unknown Type: $value")
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

        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LegalConsentOptionsImplicitConsentToProcess &&
            communicationsCheckboxes == other.communicationsCheckboxes &&
            privacyText == other.privacyText &&
            type == other.type &&
            communicationConsentText == other.communicationConsentText &&
            consentToProcessText == other.consentToProcessText &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            communicationsCheckboxes,
            privacyText,
            type,
            communicationConsentText,
            consentToProcessText,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LegalConsentOptionsImplicitConsentToProcess{communicationsCheckboxes=$communicationsCheckboxes, privacyText=$privacyText, type=$type, communicationConsentText=$communicationConsentText, consentToProcessText=$consentToProcessText, additionalProperties=$additionalProperties}"
}
