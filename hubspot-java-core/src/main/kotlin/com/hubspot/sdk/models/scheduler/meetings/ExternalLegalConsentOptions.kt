// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.scheduler.meetings

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.Enum
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkKnown
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.toImmutable
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ExternalLegalConsentOptions
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val communicationConsentCheckboxes:
        JsonField<List<ExternalCommunicationConsentCheckbox>>,
    private val communicationConsentText: JsonField<String>,
    private val isLegitimateInterest: JsonField<Boolean>,
    private val legitimateInterestSubscriptionTypes: JsonField<List<Long>>,
    private val privacyPolicyText: JsonField<String>,
    private val processingConsentCheckboxLabel: JsonField<String>,
    private val processingConsentFooterText: JsonField<String>,
    private val processingConsentText: JsonField<String>,
    private val processingConsentType: JsonField<ProcessingConsentType>,
    private val legitimateInterestLegalBasis: JsonField<LegitimateInterestLegalBasis>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("communicationConsentCheckboxes")
        @ExcludeMissing
        communicationConsentCheckboxes: JsonField<List<ExternalCommunicationConsentCheckbox>> =
            JsonMissing.of(),
        @JsonProperty("communicationConsentText")
        @ExcludeMissing
        communicationConsentText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("isLegitimateInterest")
        @ExcludeMissing
        isLegitimateInterest: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("legitimateInterestSubscriptionTypes")
        @ExcludeMissing
        legitimateInterestSubscriptionTypes: JsonField<List<Long>> = JsonMissing.of(),
        @JsonProperty("privacyPolicyText")
        @ExcludeMissing
        privacyPolicyText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("processingConsentCheckboxLabel")
        @ExcludeMissing
        processingConsentCheckboxLabel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("processingConsentFooterText")
        @ExcludeMissing
        processingConsentFooterText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("processingConsentText")
        @ExcludeMissing
        processingConsentText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("processingConsentType")
        @ExcludeMissing
        processingConsentType: JsonField<ProcessingConsentType> = JsonMissing.of(),
        @JsonProperty("legitimateInterestLegalBasis")
        @ExcludeMissing
        legitimateInterestLegalBasis: JsonField<LegitimateInterestLegalBasis> = JsonMissing.of(),
    ) : this(
        communicationConsentCheckboxes,
        communicationConsentText,
        isLegitimateInterest,
        legitimateInterestSubscriptionTypes,
        privacyPolicyText,
        processingConsentCheckboxLabel,
        processingConsentFooterText,
        processingConsentText,
        processingConsentType,
        legitimateInterestLegalBasis,
        mutableMapOf(),
    )

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun communicationConsentCheckboxes(): List<ExternalCommunicationConsentCheckbox> =
        communicationConsentCheckboxes.getRequired("communicationConsentCheckboxes")

    /**
     * The text that describes the consent for communication preferences.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun communicationConsentText(): String =
        communicationConsentText.getRequired("communicationConsentText")

    /**
     * Whether the legal basis for processing is legitimate interest.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isLegitimateInterest(): Boolean = isLegitimateInterest.getRequired("isLegitimateInterest")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun legitimateInterestSubscriptionTypes(): List<Long> =
        legitimateInterestSubscriptionTypes.getRequired("legitimateInterestSubscriptionTypes")

    /**
     * The text that describes the data processing privacy policy.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun privacyPolicyText(): String = privacyPolicyText.getRequired("privacyPolicyText")

    /**
     * The label for the checkbox used to obtain consent for data processing.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun processingConsentCheckboxLabel(): String =
        processingConsentCheckboxLabel.getRequired("processingConsentCheckboxLabel")

    /**
     * The footer text accompanying the consent for data processing. This field is not used by the
     * meeting platform and will always be empty.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun processingConsentFooterText(): String =
        processingConsentFooterText.getRequired("processingConsentFooterText")

    /**
     * The text that describes the consent for processing personal data.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun processingConsentText(): String = processingConsentText.getRequired("processingConsentText")

    /**
     * The type of consent required for processing. Accepted values are: IMPLICIT,
     * REQUIRED_CHECKBOX.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun processingConsentType(): ProcessingConsentType =
        processingConsentType.getRequired("processingConsentType")

    /**
     * The legal basis for processing under legitimate interest. Accepted values are:
     * LEGITIMATE_INTEREST_PQL, LEGITIMATE_INTEREST_CLIENT, PERFORMANCE_OF_CONTRACT,
     * CONSENT_WITH_NOTICE, NON_GDPR, PROCESS_AND_STORE, LEGITIMATE_INTEREST_OTHER.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun legitimateInterestLegalBasis(): Optional<LegitimateInterestLegalBasis> =
        legitimateInterestLegalBasis.getOptional("legitimateInterestLegalBasis")

    /**
     * Returns the raw JSON value of [communicationConsentCheckboxes].
     *
     * Unlike [communicationConsentCheckboxes], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("communicationConsentCheckboxes")
    @ExcludeMissing
    fun _communicationConsentCheckboxes(): JsonField<List<ExternalCommunicationConsentCheckbox>> =
        communicationConsentCheckboxes

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
     * Returns the raw JSON value of [isLegitimateInterest].
     *
     * Unlike [isLegitimateInterest], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("isLegitimateInterest")
    @ExcludeMissing
    fun _isLegitimateInterest(): JsonField<Boolean> = isLegitimateInterest

    /**
     * Returns the raw JSON value of [legitimateInterestSubscriptionTypes].
     *
     * Unlike [legitimateInterestSubscriptionTypes], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    @JsonProperty("legitimateInterestSubscriptionTypes")
    @ExcludeMissing
    fun _legitimateInterestSubscriptionTypes(): JsonField<List<Long>> =
        legitimateInterestSubscriptionTypes

    /**
     * Returns the raw JSON value of [privacyPolicyText].
     *
     * Unlike [privacyPolicyText], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("privacyPolicyText")
    @ExcludeMissing
    fun _privacyPolicyText(): JsonField<String> = privacyPolicyText

    /**
     * Returns the raw JSON value of [processingConsentCheckboxLabel].
     *
     * Unlike [processingConsentCheckboxLabel], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("processingConsentCheckboxLabel")
    @ExcludeMissing
    fun _processingConsentCheckboxLabel(): JsonField<String> = processingConsentCheckboxLabel

    /**
     * Returns the raw JSON value of [processingConsentFooterText].
     *
     * Unlike [processingConsentFooterText], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("processingConsentFooterText")
    @ExcludeMissing
    fun _processingConsentFooterText(): JsonField<String> = processingConsentFooterText

    /**
     * Returns the raw JSON value of [processingConsentText].
     *
     * Unlike [processingConsentText], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("processingConsentText")
    @ExcludeMissing
    fun _processingConsentText(): JsonField<String> = processingConsentText

    /**
     * Returns the raw JSON value of [processingConsentType].
     *
     * Unlike [processingConsentType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("processingConsentType")
    @ExcludeMissing
    fun _processingConsentType(): JsonField<ProcessingConsentType> = processingConsentType

    /**
     * Returns the raw JSON value of [legitimateInterestLegalBasis].
     *
     * Unlike [legitimateInterestLegalBasis], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("legitimateInterestLegalBasis")
    @ExcludeMissing
    fun _legitimateInterestLegalBasis(): JsonField<LegitimateInterestLegalBasis> =
        legitimateInterestLegalBasis

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
         * Returns a mutable builder for constructing an instance of [ExternalLegalConsentOptions].
         *
         * The following fields are required:
         * ```java
         * .communicationConsentCheckboxes()
         * .communicationConsentText()
         * .isLegitimateInterest()
         * .legitimateInterestSubscriptionTypes()
         * .privacyPolicyText()
         * .processingConsentCheckboxLabel()
         * .processingConsentFooterText()
         * .processingConsentText()
         * .processingConsentType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalLegalConsentOptions]. */
    class Builder internal constructor() {

        private var communicationConsentCheckboxes:
            JsonField<MutableList<ExternalCommunicationConsentCheckbox>>? =
            null
        private var communicationConsentText: JsonField<String>? = null
        private var isLegitimateInterest: JsonField<Boolean>? = null
        private var legitimateInterestSubscriptionTypes: JsonField<MutableList<Long>>? = null
        private var privacyPolicyText: JsonField<String>? = null
        private var processingConsentCheckboxLabel: JsonField<String>? = null
        private var processingConsentFooterText: JsonField<String>? = null
        private var processingConsentText: JsonField<String>? = null
        private var processingConsentType: JsonField<ProcessingConsentType>? = null
        private var legitimateInterestLegalBasis: JsonField<LegitimateInterestLegalBasis> =
            JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalLegalConsentOptions: ExternalLegalConsentOptions) = apply {
            communicationConsentCheckboxes =
                externalLegalConsentOptions.communicationConsentCheckboxes.map {
                    it.toMutableList()
                }
            communicationConsentText = externalLegalConsentOptions.communicationConsentText
            isLegitimateInterest = externalLegalConsentOptions.isLegitimateInterest
            legitimateInterestSubscriptionTypes =
                externalLegalConsentOptions.legitimateInterestSubscriptionTypes.map {
                    it.toMutableList()
                }
            privacyPolicyText = externalLegalConsentOptions.privacyPolicyText
            processingConsentCheckboxLabel =
                externalLegalConsentOptions.processingConsentCheckboxLabel
            processingConsentFooterText = externalLegalConsentOptions.processingConsentFooterText
            processingConsentText = externalLegalConsentOptions.processingConsentText
            processingConsentType = externalLegalConsentOptions.processingConsentType
            legitimateInterestLegalBasis = externalLegalConsentOptions.legitimateInterestLegalBasis
            additionalProperties = externalLegalConsentOptions.additionalProperties.toMutableMap()
        }

        fun communicationConsentCheckboxes(
            communicationConsentCheckboxes: List<ExternalCommunicationConsentCheckbox>
        ) = communicationConsentCheckboxes(JsonField.of(communicationConsentCheckboxes))

        /**
         * Sets [Builder.communicationConsentCheckboxes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.communicationConsentCheckboxes] with a well-typed
         * `List<ExternalCommunicationConsentCheckbox>` value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun communicationConsentCheckboxes(
            communicationConsentCheckboxes: JsonField<List<ExternalCommunicationConsentCheckbox>>
        ) = apply {
            this.communicationConsentCheckboxes =
                communicationConsentCheckboxes.map { it.toMutableList() }
        }

        /**
         * Adds a single [ExternalCommunicationConsentCheckbox] to [communicationConsentCheckboxes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCommunicationConsentCheckbox(
            communicationConsentCheckbox: ExternalCommunicationConsentCheckbox
        ) = apply {
            communicationConsentCheckboxes =
                (communicationConsentCheckboxes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("communicationConsentCheckboxes", it)
                        .add(communicationConsentCheckbox)
                }
        }

        /** The text that describes the consent for communication preferences. */
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

        /** Whether the legal basis for processing is legitimate interest. */
        fun isLegitimateInterest(isLegitimateInterest: Boolean) =
            isLegitimateInterest(JsonField.of(isLegitimateInterest))

        /**
         * Sets [Builder.isLegitimateInterest] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isLegitimateInterest] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isLegitimateInterest(isLegitimateInterest: JsonField<Boolean>) = apply {
            this.isLegitimateInterest = isLegitimateInterest
        }

        fun legitimateInterestSubscriptionTypes(legitimateInterestSubscriptionTypes: List<Long>) =
            legitimateInterestSubscriptionTypes(JsonField.of(legitimateInterestSubscriptionTypes))

        /**
         * Sets [Builder.legitimateInterestSubscriptionTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legitimateInterestSubscriptionTypes] with a well-typed
         * `List<Long>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun legitimateInterestSubscriptionTypes(
            legitimateInterestSubscriptionTypes: JsonField<List<Long>>
        ) = apply {
            this.legitimateInterestSubscriptionTypes =
                legitimateInterestSubscriptionTypes.map { it.toMutableList() }
        }

        /**
         * Adds a single [Long] to [legitimateInterestSubscriptionTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLegitimateInterestSubscriptionType(legitimateInterestSubscriptionType: Long) =
            apply {
                legitimateInterestSubscriptionTypes =
                    (legitimateInterestSubscriptionTypes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("legitimateInterestSubscriptionTypes", it)
                            .add(legitimateInterestSubscriptionType)
                    }
            }

        /** The text that describes the data processing privacy policy. */
        fun privacyPolicyText(privacyPolicyText: String) =
            privacyPolicyText(JsonField.of(privacyPolicyText))

        /**
         * Sets [Builder.privacyPolicyText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.privacyPolicyText] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun privacyPolicyText(privacyPolicyText: JsonField<String>) = apply {
            this.privacyPolicyText = privacyPolicyText
        }

        /** The label for the checkbox used to obtain consent for data processing. */
        fun processingConsentCheckboxLabel(processingConsentCheckboxLabel: String) =
            processingConsentCheckboxLabel(JsonField.of(processingConsentCheckboxLabel))

        /**
         * Sets [Builder.processingConsentCheckboxLabel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.processingConsentCheckboxLabel] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun processingConsentCheckboxLabel(processingConsentCheckboxLabel: JsonField<String>) =
            apply {
                this.processingConsentCheckboxLabel = processingConsentCheckboxLabel
            }

        /**
         * The footer text accompanying the consent for data processing. This field is not used by
         * the meeting platform and will always be empty.
         */
        fun processingConsentFooterText(processingConsentFooterText: String) =
            processingConsentFooterText(JsonField.of(processingConsentFooterText))

        /**
         * Sets [Builder.processingConsentFooterText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.processingConsentFooterText] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun processingConsentFooterText(processingConsentFooterText: JsonField<String>) = apply {
            this.processingConsentFooterText = processingConsentFooterText
        }

        /** The text that describes the consent for processing personal data. */
        fun processingConsentText(processingConsentText: String) =
            processingConsentText(JsonField.of(processingConsentText))

        /**
         * Sets [Builder.processingConsentText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.processingConsentText] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun processingConsentText(processingConsentText: JsonField<String>) = apply {
            this.processingConsentText = processingConsentText
        }

        /**
         * The type of consent required for processing. Accepted values are: IMPLICIT,
         * REQUIRED_CHECKBOX.
         */
        fun processingConsentType(processingConsentType: ProcessingConsentType) =
            processingConsentType(JsonField.of(processingConsentType))

        /**
         * Sets [Builder.processingConsentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.processingConsentType] with a well-typed
         * [ProcessingConsentType] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun processingConsentType(processingConsentType: JsonField<ProcessingConsentType>) = apply {
            this.processingConsentType = processingConsentType
        }

        /**
         * The legal basis for processing under legitimate interest. Accepted values are:
         * LEGITIMATE_INTEREST_PQL, LEGITIMATE_INTEREST_CLIENT, PERFORMANCE_OF_CONTRACT,
         * CONSENT_WITH_NOTICE, NON_GDPR, PROCESS_AND_STORE, LEGITIMATE_INTEREST_OTHER.
         */
        fun legitimateInterestLegalBasis(
            legitimateInterestLegalBasis: LegitimateInterestLegalBasis
        ) = legitimateInterestLegalBasis(JsonField.of(legitimateInterestLegalBasis))

        /**
         * Sets [Builder.legitimateInterestLegalBasis] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legitimateInterestLegalBasis] with a well-typed
         * [LegitimateInterestLegalBasis] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun legitimateInterestLegalBasis(
            legitimateInterestLegalBasis: JsonField<LegitimateInterestLegalBasis>
        ) = apply { this.legitimateInterestLegalBasis = legitimateInterestLegalBasis }

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
         * Returns an immutable instance of [ExternalLegalConsentOptions].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .communicationConsentCheckboxes()
         * .communicationConsentText()
         * .isLegitimateInterest()
         * .legitimateInterestSubscriptionTypes()
         * .privacyPolicyText()
         * .processingConsentCheckboxLabel()
         * .processingConsentFooterText()
         * .processingConsentText()
         * .processingConsentType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalLegalConsentOptions =
            ExternalLegalConsentOptions(
                checkRequired("communicationConsentCheckboxes", communicationConsentCheckboxes)
                    .map { it.toImmutable() },
                checkRequired("communicationConsentText", communicationConsentText),
                checkRequired("isLegitimateInterest", isLegitimateInterest),
                checkRequired(
                        "legitimateInterestSubscriptionTypes",
                        legitimateInterestSubscriptionTypes,
                    )
                    .map { it.toImmutable() },
                checkRequired("privacyPolicyText", privacyPolicyText),
                checkRequired("processingConsentCheckboxLabel", processingConsentCheckboxLabel),
                checkRequired("processingConsentFooterText", processingConsentFooterText),
                checkRequired("processingConsentText", processingConsentText),
                checkRequired("processingConsentType", processingConsentType),
                legitimateInterestLegalBasis,
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
    fun validate(): ExternalLegalConsentOptions = apply {
        if (validated) {
            return@apply
        }

        communicationConsentCheckboxes().forEach { it.validate() }
        communicationConsentText()
        isLegitimateInterest()
        legitimateInterestSubscriptionTypes()
        privacyPolicyText()
        processingConsentCheckboxLabel()
        processingConsentFooterText()
        processingConsentText()
        processingConsentType().validate()
        legitimateInterestLegalBasis().ifPresent { it.validate() }
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
        (communicationConsentCheckboxes.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
            ?: 0) +
            (if (communicationConsentText.asKnown().isPresent) 1 else 0) +
            (if (isLegitimateInterest.asKnown().isPresent) 1 else 0) +
            (legitimateInterestSubscriptionTypes.asKnown().getOrNull()?.size ?: 0) +
            (if (privacyPolicyText.asKnown().isPresent) 1 else 0) +
            (if (processingConsentCheckboxLabel.asKnown().isPresent) 1 else 0) +
            (if (processingConsentFooterText.asKnown().isPresent) 1 else 0) +
            (if (processingConsentText.asKnown().isPresent) 1 else 0) +
            (processingConsentType.asKnown().getOrNull()?.validity() ?: 0) +
            (legitimateInterestLegalBasis.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * The type of consent required for processing. Accepted values are: IMPLICIT,
     * REQUIRED_CHECKBOX.
     */
    class ProcessingConsentType
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val IMPLICIT = of("IMPLICIT")

            @JvmField val REQUIRED_CHECKBOX = of("REQUIRED_CHECKBOX")

            @JvmStatic fun of(value: String) = ProcessingConsentType(JsonField.of(value))
        }

        /** An enum containing [ProcessingConsentType]'s known values. */
        enum class Known {
            IMPLICIT,
            REQUIRED_CHECKBOX,
        }

        /**
         * An enum containing [ProcessingConsentType]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [ProcessingConsentType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            IMPLICIT,
            REQUIRED_CHECKBOX,
            /**
             * An enum member indicating that [ProcessingConsentType] was instantiated with an
             * unknown value.
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
                IMPLICIT -> Value.IMPLICIT
                REQUIRED_CHECKBOX -> Value.REQUIRED_CHECKBOX
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
                IMPLICIT -> Known.IMPLICIT
                REQUIRED_CHECKBOX -> Known.REQUIRED_CHECKBOX
                else -> throw HubSpotInvalidDataException("Unknown ProcessingConsentType: $value")
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
        fun validate(): ProcessingConsentType = apply {
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

            return other is ProcessingConsentType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The legal basis for processing under legitimate interest. Accepted values are:
     * LEGITIMATE_INTEREST_PQL, LEGITIMATE_INTEREST_CLIENT, PERFORMANCE_OF_CONTRACT,
     * CONSENT_WITH_NOTICE, NON_GDPR, PROCESS_AND_STORE, LEGITIMATE_INTEREST_OTHER.
     */
    class LegitimateInterestLegalBasis
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmStatic fun of(value: String) = LegitimateInterestLegalBasis(JsonField.of(value))
        }

        /** An enum containing [LegitimateInterestLegalBasis]'s known values. */
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
         * An enum containing [LegitimateInterestLegalBasis]'s known values, as well as an
         * [_UNKNOWN] member.
         *
         * An instance of [LegitimateInterestLegalBasis] can contain an unknown value in a couple of
         * cases:
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
             * An enum member indicating that [LegitimateInterestLegalBasis] was instantiated with
             * an unknown value.
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
         * @throws HubSpotInvalidDataException if this class instance's value is a not a known
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
                else ->
                    throw HubSpotInvalidDataException(
                        "Unknown LegitimateInterestLegalBasis: $value"
                    )
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
        fun validate(): LegitimateInterestLegalBasis = apply {
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

            return other is LegitimateInterestLegalBasis && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalLegalConsentOptions &&
            communicationConsentCheckboxes == other.communicationConsentCheckboxes &&
            communicationConsentText == other.communicationConsentText &&
            isLegitimateInterest == other.isLegitimateInterest &&
            legitimateInterestSubscriptionTypes == other.legitimateInterestSubscriptionTypes &&
            privacyPolicyText == other.privacyPolicyText &&
            processingConsentCheckboxLabel == other.processingConsentCheckboxLabel &&
            processingConsentFooterText == other.processingConsentFooterText &&
            processingConsentText == other.processingConsentText &&
            processingConsentType == other.processingConsentType &&
            legitimateInterestLegalBasis == other.legitimateInterestLegalBasis &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            communicationConsentCheckboxes,
            communicationConsentText,
            isLegitimateInterest,
            legitimateInterestSubscriptionTypes,
            privacyPolicyText,
            processingConsentCheckboxLabel,
            processingConsentFooterText,
            processingConsentText,
            processingConsentType,
            legitimateInterestLegalBasis,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalLegalConsentOptions{communicationConsentCheckboxes=$communicationConsentCheckboxes, communicationConsentText=$communicationConsentText, isLegitimateInterest=$isLegitimateInterest, legitimateInterestSubscriptionTypes=$legitimateInterestSubscriptionTypes, privacyPolicyText=$privacyPolicyText, processingConsentCheckboxLabel=$processingConsentCheckboxLabel, processingConsentFooterText=$processingConsentFooterText, processingConsentText=$processingConsentText, processingConsentType=$processingConsentType, legitimateInterestLegalBasis=$legitimateInterestLegalBasis, additionalProperties=$additionalProperties}"
}
