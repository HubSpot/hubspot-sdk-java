// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.subscriptions

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

class PublicUpdateSubscriptionStatusRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val emailAddress: JsonField<String>,
    private val subscriptionId: JsonField<String>,
    private val legalBasis: JsonField<LegalBasis>,
    private val legalBasisExplanation: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("emailAddress")
        @ExcludeMissing
        emailAddress: JsonField<String> = JsonMissing.of(),
        @JsonProperty("subscriptionId")
        @ExcludeMissing
        subscriptionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("legalBasis")
        @ExcludeMissing
        legalBasis: JsonField<LegalBasis> = JsonMissing.of(),
        @JsonProperty("legalBasisExplanation")
        @ExcludeMissing
        legalBasisExplanation: JsonField<String> = JsonMissing.of(),
    ) : this(emailAddress, subscriptionId, legalBasis, legalBasisExplanation, mutableMapOf())

    /**
     * Contact's email address.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun emailAddress(): String = emailAddress.getRequired("emailAddress")

    /**
     * ID of the subscription being updated for the contact.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriptionId(): String = subscriptionId.getRequired("subscriptionId")

    /**
     * Legal basis for updating the contact's status (required for GDPR enabled portals).
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun legalBasis(): Optional<LegalBasis> = legalBasis.getOptional("legalBasis")

    /**
     * A more detailed explanation to go with the legal basis (required for GDPR enabled portals).
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun legalBasisExplanation(): Optional<String> =
        legalBasisExplanation.getOptional("legalBasisExplanation")

    /**
     * Returns the raw JSON value of [emailAddress].
     *
     * Unlike [emailAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("emailAddress")
    @ExcludeMissing
    fun _emailAddress(): JsonField<String> = emailAddress

    /**
     * Returns the raw JSON value of [subscriptionId].
     *
     * Unlike [subscriptionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subscriptionId")
    @ExcludeMissing
    fun _subscriptionId(): JsonField<String> = subscriptionId

    /**
     * Returns the raw JSON value of [legalBasis].
     *
     * Unlike [legalBasis], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("legalBasis")
    @ExcludeMissing
    fun _legalBasis(): JsonField<LegalBasis> = legalBasis

    /**
     * Returns the raw JSON value of [legalBasisExplanation].
     *
     * Unlike [legalBasisExplanation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("legalBasisExplanation")
    @ExcludeMissing
    fun _legalBasisExplanation(): JsonField<String> = legalBasisExplanation

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
         * [PublicUpdateSubscriptionStatusRequest].
         *
         * The following fields are required:
         * ```java
         * .emailAddress()
         * .subscriptionId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicUpdateSubscriptionStatusRequest]. */
    class Builder internal constructor() {

        private var emailAddress: JsonField<String>? = null
        private var subscriptionId: JsonField<String>? = null
        private var legalBasis: JsonField<LegalBasis> = JsonMissing.of()
        private var legalBasisExplanation: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            publicUpdateSubscriptionStatusRequest: PublicUpdateSubscriptionStatusRequest
        ) = apply {
            emailAddress = publicUpdateSubscriptionStatusRequest.emailAddress
            subscriptionId = publicUpdateSubscriptionStatusRequest.subscriptionId
            legalBasis = publicUpdateSubscriptionStatusRequest.legalBasis
            legalBasisExplanation = publicUpdateSubscriptionStatusRequest.legalBasisExplanation
            additionalProperties =
                publicUpdateSubscriptionStatusRequest.additionalProperties.toMutableMap()
        }

        /** Contact's email address. */
        fun emailAddress(emailAddress: String) = emailAddress(JsonField.of(emailAddress))

        /**
         * Sets [Builder.emailAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emailAddress] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun emailAddress(emailAddress: JsonField<String>) = apply {
            this.emailAddress = emailAddress
        }

        /** ID of the subscription being updated for the contact. */
        fun subscriptionId(subscriptionId: String) = subscriptionId(JsonField.of(subscriptionId))

        /**
         * Sets [Builder.subscriptionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subscriptionId(subscriptionId: JsonField<String>) = apply {
            this.subscriptionId = subscriptionId
        }

        /** Legal basis for updating the contact's status (required for GDPR enabled portals). */
        fun legalBasis(legalBasis: LegalBasis) = legalBasis(JsonField.of(legalBasis))

        /**
         * Sets [Builder.legalBasis] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legalBasis] with a well-typed [LegalBasis] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun legalBasis(legalBasis: JsonField<LegalBasis>) = apply { this.legalBasis = legalBasis }

        /**
         * A more detailed explanation to go with the legal basis (required for GDPR enabled
         * portals).
         */
        fun legalBasisExplanation(legalBasisExplanation: String) =
            legalBasisExplanation(JsonField.of(legalBasisExplanation))

        /**
         * Sets [Builder.legalBasisExplanation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legalBasisExplanation] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun legalBasisExplanation(legalBasisExplanation: JsonField<String>) = apply {
            this.legalBasisExplanation = legalBasisExplanation
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
         * Returns an immutable instance of [PublicUpdateSubscriptionStatusRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .emailAddress()
         * .subscriptionId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicUpdateSubscriptionStatusRequest =
            PublicUpdateSubscriptionStatusRequest(
                checkRequired("emailAddress", emailAddress),
                checkRequired("subscriptionId", subscriptionId),
                legalBasis,
                legalBasisExplanation,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicUpdateSubscriptionStatusRequest = apply {
        if (validated) {
            return@apply
        }

        emailAddress()
        subscriptionId()
        legalBasis().ifPresent { it.validate() }
        legalBasisExplanation()
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
        (if (emailAddress.asKnown().isPresent) 1 else 0) +
            (if (subscriptionId.asKnown().isPresent) 1 else 0) +
            (legalBasis.asKnown().getOrNull()?.validity() ?: 0) +
            (if (legalBasisExplanation.asKnown().isPresent) 1 else 0)

    /** Legal basis for updating the contact's status (required for GDPR enabled portals). */
    class LegalBasis @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CONSENT_WITH_NOTICE = of("CONSENT_WITH_NOTICE")

            @JvmField val LEGITIMATE_INTEREST_CLIENT = of("LEGITIMATE_INTEREST_CLIENT")

            @JvmField val LEGITIMATE_INTEREST_OTHER = of("LEGITIMATE_INTEREST_OTHER")

            @JvmField val LEGITIMATE_INTEREST_PQL = of("LEGITIMATE_INTEREST_PQL")

            @JvmField val NON_GDPR = of("NON_GDPR")

            @JvmField val PERFORMANCE_OF_CONTRACT = of("PERFORMANCE_OF_CONTRACT")

            @JvmField val PROCESS_AND_STORE = of("PROCESS_AND_STORE")

            @JvmStatic fun of(value: String) = LegalBasis(JsonField.of(value))
        }

        /** An enum containing [LegalBasis]'s known values. */
        enum class Known {
            CONSENT_WITH_NOTICE,
            LEGITIMATE_INTEREST_CLIENT,
            LEGITIMATE_INTEREST_OTHER,
            LEGITIMATE_INTEREST_PQL,
            NON_GDPR,
            PERFORMANCE_OF_CONTRACT,
            PROCESS_AND_STORE,
        }

        /**
         * An enum containing [LegalBasis]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [LegalBasis] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CONSENT_WITH_NOTICE,
            LEGITIMATE_INTEREST_CLIENT,
            LEGITIMATE_INTEREST_OTHER,
            LEGITIMATE_INTEREST_PQL,
            NON_GDPR,
            PERFORMANCE_OF_CONTRACT,
            PROCESS_AND_STORE,
            /**
             * An enum member indicating that [LegalBasis] was instantiated with an unknown value.
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
                CONSENT_WITH_NOTICE -> Value.CONSENT_WITH_NOTICE
                LEGITIMATE_INTEREST_CLIENT -> Value.LEGITIMATE_INTEREST_CLIENT
                LEGITIMATE_INTEREST_OTHER -> Value.LEGITIMATE_INTEREST_OTHER
                LEGITIMATE_INTEREST_PQL -> Value.LEGITIMATE_INTEREST_PQL
                NON_GDPR -> Value.NON_GDPR
                PERFORMANCE_OF_CONTRACT -> Value.PERFORMANCE_OF_CONTRACT
                PROCESS_AND_STORE -> Value.PROCESS_AND_STORE
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
                CONSENT_WITH_NOTICE -> Known.CONSENT_WITH_NOTICE
                LEGITIMATE_INTEREST_CLIENT -> Known.LEGITIMATE_INTEREST_CLIENT
                LEGITIMATE_INTEREST_OTHER -> Known.LEGITIMATE_INTEREST_OTHER
                LEGITIMATE_INTEREST_PQL -> Known.LEGITIMATE_INTEREST_PQL
                NON_GDPR -> Known.NON_GDPR
                PERFORMANCE_OF_CONTRACT -> Known.PERFORMANCE_OF_CONTRACT
                PROCESS_AND_STORE -> Known.PROCESS_AND_STORE
                else -> throw HubspotInvalidDataException("Unknown LegalBasis: $value")
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

        fun validate(): LegalBasis = apply {
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

            return other is LegalBasis && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicUpdateSubscriptionStatusRequest &&
            emailAddress == other.emailAddress &&
            subscriptionId == other.subscriptionId &&
            legalBasis == other.legalBasis &&
            legalBasisExplanation == other.legalBasisExplanation &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            emailAddress,
            subscriptionId,
            legalBasis,
            legalBasisExplanation,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicUpdateSubscriptionStatusRequest{emailAddress=$emailAddress, subscriptionId=$subscriptionId, legalBasis=$legalBasis, legalBasisExplanation=$legalBasisExplanation, additionalProperties=$additionalProperties}"
}
