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

class HubSpotFormConfiguration
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val allowLinkToResetKnownValues: JsonField<Boolean>,
    private val archivable: JsonField<Boolean>,
    private val cloneable: JsonField<Boolean>,
    private val createNewContactForNewEmail: JsonField<Boolean>,
    private val editable: JsonField<Boolean>,
    private val language: JsonField<Language>,
    private val notifyContactOwner: JsonField<Boolean>,
    private val notifyRecipients: JsonField<List<String>>,
    private val postSubmitAction: JsonField<FormPostSubmitAction>,
    private val prePopulateKnownValues: JsonField<Boolean>,
    private val recaptchaEnabled: JsonField<Boolean>,
    private val lifecycleStages: JsonField<List<LifecycleStage>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("allowLinkToResetKnownValues")
        @ExcludeMissing
        allowLinkToResetKnownValues: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("archivable")
        @ExcludeMissing
        archivable: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("cloneable") @ExcludeMissing cloneable: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("createNewContactForNewEmail")
        @ExcludeMissing
        createNewContactForNewEmail: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("editable") @ExcludeMissing editable: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("language") @ExcludeMissing language: JsonField<Language> = JsonMissing.of(),
        @JsonProperty("notifyContactOwner")
        @ExcludeMissing
        notifyContactOwner: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("notifyRecipients")
        @ExcludeMissing
        notifyRecipients: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("postSubmitAction")
        @ExcludeMissing
        postSubmitAction: JsonField<FormPostSubmitAction> = JsonMissing.of(),
        @JsonProperty("prePopulateKnownValues")
        @ExcludeMissing
        prePopulateKnownValues: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("recaptchaEnabled")
        @ExcludeMissing
        recaptchaEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("lifecycleStages")
        @ExcludeMissing
        lifecycleStages: JsonField<List<LifecycleStage>> = JsonMissing.of(),
    ) : this(
        allowLinkToResetKnownValues,
        archivable,
        cloneable,
        createNewContactForNewEmail,
        editable,
        language,
        notifyContactOwner,
        notifyRecipients,
        postSubmitAction,
        prePopulateKnownValues,
        recaptchaEnabled,
        lifecycleStages,
        mutableMapOf(),
    )

    /**
     * Whether to add a reset link to the form. This removes any pre-populated content on the form
     * and creates a new contact on submission.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun allowLinkToResetKnownValues(): Boolean =
        allowLinkToResetKnownValues.getRequired("allowLinkToResetKnownValues")

    /**
     * Whether the form can be archived.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun archivable(): Boolean = archivable.getRequired("archivable")

    /**
     * Whether the form can be cloned.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cloneable(): Boolean = cloneable.getRequired("cloneable")

    /**
     * Whether to create a new contact when a form is submitted with an email address that doesn’t
     * match any in your existing contacts records.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createNewContactForNewEmail(): Boolean =
        createNewContactForNewEmail.getRequired("createNewContactForNewEmail")

    /**
     * Whether the form can be edited.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun editable(): Boolean = editable.getRequired("editable")

    /**
     * The language of the form.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun language(): Language = language.getRequired("language")

    /**
     * Whether to send a notification email to the contact owner when a submission is received.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun notifyContactOwner(): Boolean = notifyContactOwner.getRequired("notifyContactOwner")

    /**
     * The list of user IDs to receive a notification email when a submission is received.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun notifyRecipients(): List<String> = notifyRecipients.getRequired("notifyRecipients")

    /**
     * What should happen after the customer submits the form.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun postSubmitAction(): FormPostSubmitAction = postSubmitAction.getRequired("postSubmitAction")

    /**
     * Whether contact fields should pre-populate with known information when a contact returns to
     * your site.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun prePopulateKnownValues(): Boolean =
        prePopulateKnownValues.getRequired("prePopulateKnownValues")

    /**
     * Whether CAPTCHA (spam prevention) is enabled.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recaptchaEnabled(): Boolean = recaptchaEnabled.getRequired("recaptchaEnabled")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lifecycleStages(): Optional<List<LifecycleStage>> =
        lifecycleStages.getOptional("lifecycleStages")

    /**
     * Returns the raw JSON value of [allowLinkToResetKnownValues].
     *
     * Unlike [allowLinkToResetKnownValues], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("allowLinkToResetKnownValues")
    @ExcludeMissing
    fun _allowLinkToResetKnownValues(): JsonField<Boolean> = allowLinkToResetKnownValues

    /**
     * Returns the raw JSON value of [archivable].
     *
     * Unlike [archivable], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("archivable") @ExcludeMissing fun _archivable(): JsonField<Boolean> = archivable

    /**
     * Returns the raw JSON value of [cloneable].
     *
     * Unlike [cloneable], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cloneable") @ExcludeMissing fun _cloneable(): JsonField<Boolean> = cloneable

    /**
     * Returns the raw JSON value of [createNewContactForNewEmail].
     *
     * Unlike [createNewContactForNewEmail], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("createNewContactForNewEmail")
    @ExcludeMissing
    fun _createNewContactForNewEmail(): JsonField<Boolean> = createNewContactForNewEmail

    /**
     * Returns the raw JSON value of [editable].
     *
     * Unlike [editable], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("editable") @ExcludeMissing fun _editable(): JsonField<Boolean> = editable

    /**
     * Returns the raw JSON value of [language].
     *
     * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<Language> = language

    /**
     * Returns the raw JSON value of [notifyContactOwner].
     *
     * Unlike [notifyContactOwner], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("notifyContactOwner")
    @ExcludeMissing
    fun _notifyContactOwner(): JsonField<Boolean> = notifyContactOwner

    /**
     * Returns the raw JSON value of [notifyRecipients].
     *
     * Unlike [notifyRecipients], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("notifyRecipients")
    @ExcludeMissing
    fun _notifyRecipients(): JsonField<List<String>> = notifyRecipients

    /**
     * Returns the raw JSON value of [postSubmitAction].
     *
     * Unlike [postSubmitAction], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("postSubmitAction")
    @ExcludeMissing
    fun _postSubmitAction(): JsonField<FormPostSubmitAction> = postSubmitAction

    /**
     * Returns the raw JSON value of [prePopulateKnownValues].
     *
     * Unlike [prePopulateKnownValues], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("prePopulateKnownValues")
    @ExcludeMissing
    fun _prePopulateKnownValues(): JsonField<Boolean> = prePopulateKnownValues

    /**
     * Returns the raw JSON value of [recaptchaEnabled].
     *
     * Unlike [recaptchaEnabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("recaptchaEnabled")
    @ExcludeMissing
    fun _recaptchaEnabled(): JsonField<Boolean> = recaptchaEnabled

    /**
     * Returns the raw JSON value of [lifecycleStages].
     *
     * Unlike [lifecycleStages], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lifecycleStages")
    @ExcludeMissing
    fun _lifecycleStages(): JsonField<List<LifecycleStage>> = lifecycleStages

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
         * Returns a mutable builder for constructing an instance of [HubSpotFormConfiguration].
         *
         * The following fields are required:
         * ```java
         * .allowLinkToResetKnownValues()
         * .archivable()
         * .cloneable()
         * .createNewContactForNewEmail()
         * .editable()
         * .language()
         * .notifyContactOwner()
         * .notifyRecipients()
         * .postSubmitAction()
         * .prePopulateKnownValues()
         * .recaptchaEnabled()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [HubSpotFormConfiguration]. */
    class Builder internal constructor() {

        private var allowLinkToResetKnownValues: JsonField<Boolean>? = null
        private var archivable: JsonField<Boolean>? = null
        private var cloneable: JsonField<Boolean>? = null
        private var createNewContactForNewEmail: JsonField<Boolean>? = null
        private var editable: JsonField<Boolean>? = null
        private var language: JsonField<Language>? = null
        private var notifyContactOwner: JsonField<Boolean>? = null
        private var notifyRecipients: JsonField<MutableList<String>>? = null
        private var postSubmitAction: JsonField<FormPostSubmitAction>? = null
        private var prePopulateKnownValues: JsonField<Boolean>? = null
        private var recaptchaEnabled: JsonField<Boolean>? = null
        private var lifecycleStages: JsonField<MutableList<LifecycleStage>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(hubSpotFormConfiguration: HubSpotFormConfiguration) = apply {
            allowLinkToResetKnownValues = hubSpotFormConfiguration.allowLinkToResetKnownValues
            archivable = hubSpotFormConfiguration.archivable
            cloneable = hubSpotFormConfiguration.cloneable
            createNewContactForNewEmail = hubSpotFormConfiguration.createNewContactForNewEmail
            editable = hubSpotFormConfiguration.editable
            language = hubSpotFormConfiguration.language
            notifyContactOwner = hubSpotFormConfiguration.notifyContactOwner
            notifyRecipients = hubSpotFormConfiguration.notifyRecipients.map { it.toMutableList() }
            postSubmitAction = hubSpotFormConfiguration.postSubmitAction
            prePopulateKnownValues = hubSpotFormConfiguration.prePopulateKnownValues
            recaptchaEnabled = hubSpotFormConfiguration.recaptchaEnabled
            lifecycleStages = hubSpotFormConfiguration.lifecycleStages.map { it.toMutableList() }
            additionalProperties = hubSpotFormConfiguration.additionalProperties.toMutableMap()
        }

        /**
         * Whether to add a reset link to the form. This removes any pre-populated content on the
         * form and creates a new contact on submission.
         */
        fun allowLinkToResetKnownValues(allowLinkToResetKnownValues: Boolean) =
            allowLinkToResetKnownValues(JsonField.of(allowLinkToResetKnownValues))

        /**
         * Sets [Builder.allowLinkToResetKnownValues] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowLinkToResetKnownValues] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun allowLinkToResetKnownValues(allowLinkToResetKnownValues: JsonField<Boolean>) = apply {
            this.allowLinkToResetKnownValues = allowLinkToResetKnownValues
        }

        /** Whether the form can be archived. */
        fun archivable(archivable: Boolean) = archivable(JsonField.of(archivable))

        /**
         * Sets [Builder.archivable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.archivable] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun archivable(archivable: JsonField<Boolean>) = apply { this.archivable = archivable }

        /** Whether the form can be cloned. */
        fun cloneable(cloneable: Boolean) = cloneable(JsonField.of(cloneable))

        /**
         * Sets [Builder.cloneable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cloneable] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cloneable(cloneable: JsonField<Boolean>) = apply { this.cloneable = cloneable }

        /**
         * Whether to create a new contact when a form is submitted with an email address that
         * doesn’t match any in your existing contacts records.
         */
        fun createNewContactForNewEmail(createNewContactForNewEmail: Boolean) =
            createNewContactForNewEmail(JsonField.of(createNewContactForNewEmail))

        /**
         * Sets [Builder.createNewContactForNewEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createNewContactForNewEmail] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun createNewContactForNewEmail(createNewContactForNewEmail: JsonField<Boolean>) = apply {
            this.createNewContactForNewEmail = createNewContactForNewEmail
        }

        /** Whether the form can be edited. */
        fun editable(editable: Boolean) = editable(JsonField.of(editable))

        /**
         * Sets [Builder.editable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.editable] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun editable(editable: JsonField<Boolean>) = apply { this.editable = editable }

        /** The language of the form. */
        fun language(language: Language) = language(JsonField.of(language))

        /**
         * Sets [Builder.language] to an arbitrary JSON value.
         *
         * You should usually call [Builder.language] with a well-typed [Language] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun language(language: JsonField<Language>) = apply { this.language = language }

        /**
         * Whether to send a notification email to the contact owner when a submission is received.
         */
        fun notifyContactOwner(notifyContactOwner: Boolean) =
            notifyContactOwner(JsonField.of(notifyContactOwner))

        /**
         * Sets [Builder.notifyContactOwner] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notifyContactOwner] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun notifyContactOwner(notifyContactOwner: JsonField<Boolean>) = apply {
            this.notifyContactOwner = notifyContactOwner
        }

        /** The list of user IDs to receive a notification email when a submission is received. */
        fun notifyRecipients(notifyRecipients: List<String>) =
            notifyRecipients(JsonField.of(notifyRecipients))

        /**
         * Sets [Builder.notifyRecipients] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notifyRecipients] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun notifyRecipients(notifyRecipients: JsonField<List<String>>) = apply {
            this.notifyRecipients = notifyRecipients.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [notifyRecipients].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addNotifyRecipient(notifyRecipient: String) = apply {
            notifyRecipients =
                (notifyRecipients ?: JsonField.of(mutableListOf())).also {
                    checkKnown("notifyRecipients", it).add(notifyRecipient)
                }
        }

        /** What should happen after the customer submits the form. */
        fun postSubmitAction(postSubmitAction: FormPostSubmitAction) =
            postSubmitAction(JsonField.of(postSubmitAction))

        /**
         * Sets [Builder.postSubmitAction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.postSubmitAction] with a well-typed
         * [FormPostSubmitAction] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun postSubmitAction(postSubmitAction: JsonField<FormPostSubmitAction>) = apply {
            this.postSubmitAction = postSubmitAction
        }

        /**
         * Whether contact fields should pre-populate with known information when a contact returns
         * to your site.
         */
        fun prePopulateKnownValues(prePopulateKnownValues: Boolean) =
            prePopulateKnownValues(JsonField.of(prePopulateKnownValues))

        /**
         * Sets [Builder.prePopulateKnownValues] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prePopulateKnownValues] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun prePopulateKnownValues(prePopulateKnownValues: JsonField<Boolean>) = apply {
            this.prePopulateKnownValues = prePopulateKnownValues
        }

        /** Whether CAPTCHA (spam prevention) is enabled. */
        fun recaptchaEnabled(recaptchaEnabled: Boolean) =
            recaptchaEnabled(JsonField.of(recaptchaEnabled))

        /**
         * Sets [Builder.recaptchaEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recaptchaEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recaptchaEnabled(recaptchaEnabled: JsonField<Boolean>) = apply {
            this.recaptchaEnabled = recaptchaEnabled
        }

        fun lifecycleStages(lifecycleStages: List<LifecycleStage>) =
            lifecycleStages(JsonField.of(lifecycleStages))

        /**
         * Sets [Builder.lifecycleStages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lifecycleStages] with a well-typed
         * `List<LifecycleStage>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun lifecycleStages(lifecycleStages: JsonField<List<LifecycleStage>>) = apply {
            this.lifecycleStages = lifecycleStages.map { it.toMutableList() }
        }

        /**
         * Adds a single [LifecycleStage] to [lifecycleStages].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLifecycleStage(lifecycleStage: LifecycleStage) = apply {
            lifecycleStages =
                (lifecycleStages ?: JsonField.of(mutableListOf())).also {
                    checkKnown("lifecycleStages", it).add(lifecycleStage)
                }
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
         * Returns an immutable instance of [HubSpotFormConfiguration].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .allowLinkToResetKnownValues()
         * .archivable()
         * .cloneable()
         * .createNewContactForNewEmail()
         * .editable()
         * .language()
         * .notifyContactOwner()
         * .notifyRecipients()
         * .postSubmitAction()
         * .prePopulateKnownValues()
         * .recaptchaEnabled()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): HubSpotFormConfiguration =
            HubSpotFormConfiguration(
                checkRequired("allowLinkToResetKnownValues", allowLinkToResetKnownValues),
                checkRequired("archivable", archivable),
                checkRequired("cloneable", cloneable),
                checkRequired("createNewContactForNewEmail", createNewContactForNewEmail),
                checkRequired("editable", editable),
                checkRequired("language", language),
                checkRequired("notifyContactOwner", notifyContactOwner),
                checkRequired("notifyRecipients", notifyRecipients).map { it.toImmutable() },
                checkRequired("postSubmitAction", postSubmitAction),
                checkRequired("prePopulateKnownValues", prePopulateKnownValues),
                checkRequired("recaptchaEnabled", recaptchaEnabled),
                (lifecycleStages ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): HubSpotFormConfiguration = apply {
        if (validated) {
            return@apply
        }

        allowLinkToResetKnownValues()
        archivable()
        cloneable()
        createNewContactForNewEmail()
        editable()
        language().validate()
        notifyContactOwner()
        notifyRecipients()
        postSubmitAction().validate()
        prePopulateKnownValues()
        recaptchaEnabled()
        lifecycleStages().ifPresent { it.forEach { it.validate() } }
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
        (if (allowLinkToResetKnownValues.asKnown().isPresent) 1 else 0) +
            (if (archivable.asKnown().isPresent) 1 else 0) +
            (if (cloneable.asKnown().isPresent) 1 else 0) +
            (if (createNewContactForNewEmail.asKnown().isPresent) 1 else 0) +
            (if (editable.asKnown().isPresent) 1 else 0) +
            (language.asKnown().getOrNull()?.validity() ?: 0) +
            (if (notifyContactOwner.asKnown().isPresent) 1 else 0) +
            (notifyRecipients.asKnown().getOrNull()?.size ?: 0) +
            (postSubmitAction.asKnown().getOrNull()?.validity() ?: 0) +
            (if (prePopulateKnownValues.asKnown().isPresent) 1 else 0) +
            (if (recaptchaEnabled.asKnown().isPresent) 1 else 0) +
            (lifecycleStages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /** The language of the form. */
    class Language @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val AF = of("af")

            @JvmField val AR_EG = of("ar-eg")

            @JvmField val BG = of("bg")

            @JvmField val BN = of("bn")

            @JvmField val CA_ES = of("ca-es")

            @JvmField val CS = of("cs")

            @JvmField val DA = of("da")

            @JvmField val DE = of("de")

            @JvmField val EL = of("el")

            @JvmField val EN = of("en")

            @JvmField val ES = of("es")

            @JvmField val ES_MX = of("es-mx")

            @JvmField val FI = of("fi")

            @JvmField val FR = of("fr")

            @JvmField val FR_CA = of("fr-ca")

            @JvmField val HE_IL = of("he-il")

            @JvmField val HR = of("hr")

            @JvmField val HU = of("hu")

            @JvmField val ID = of("id")

            @JvmField val IT = of("it")

            @JvmField val JA = of("ja")

            @JvmField val KO = of("ko")

            @JvmField val LT = of("lt")

            @JvmField val MS = of("ms")

            @JvmField val NL = of("nl")

            @JvmField val NO_NO = of("no-no")

            @JvmField val PL = of("pl")

            @JvmField val PT = of("pt")

            @JvmField val PT_BR = of("pt-br")

            @JvmField val RO = of("ro")

            @JvmField val RU = of("ru")

            @JvmField val SK = of("sk")

            @JvmField val SL = of("sl")

            @JvmField val SV = of("sv")

            @JvmField val TH = of("th")

            @JvmField val TL = of("tl")

            @JvmField val TR = of("tr")

            @JvmField val UK = of("uk")

            @JvmField val VI = of("vi")

            @JvmField val ZH_CN = of("zh-cn")

            @JvmField val ZH_HK = of("zh-hk")

            @JvmField val ZH_TW = of("zh-tw")

            @JvmStatic fun of(value: String) = Language(JsonField.of(value))
        }

        /** An enum containing [Language]'s known values. */
        enum class Known {
            AF,
            AR_EG,
            BG,
            BN,
            CA_ES,
            CS,
            DA,
            DE,
            EL,
            EN,
            ES,
            ES_MX,
            FI,
            FR,
            FR_CA,
            HE_IL,
            HR,
            HU,
            ID,
            IT,
            JA,
            KO,
            LT,
            MS,
            NL,
            NO_NO,
            PL,
            PT,
            PT_BR,
            RO,
            RU,
            SK,
            SL,
            SV,
            TH,
            TL,
            TR,
            UK,
            VI,
            ZH_CN,
            ZH_HK,
            ZH_TW,
        }

        /**
         * An enum containing [Language]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Language] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AF,
            AR_EG,
            BG,
            BN,
            CA_ES,
            CS,
            DA,
            DE,
            EL,
            EN,
            ES,
            ES_MX,
            FI,
            FR,
            FR_CA,
            HE_IL,
            HR,
            HU,
            ID,
            IT,
            JA,
            KO,
            LT,
            MS,
            NL,
            NO_NO,
            PL,
            PT,
            PT_BR,
            RO,
            RU,
            SK,
            SL,
            SV,
            TH,
            TL,
            TR,
            UK,
            VI,
            ZH_CN,
            ZH_HK,
            ZH_TW,
            /** An enum member indicating that [Language] was instantiated with an unknown value. */
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
                AF -> Value.AF
                AR_EG -> Value.AR_EG
                BG -> Value.BG
                BN -> Value.BN
                CA_ES -> Value.CA_ES
                CS -> Value.CS
                DA -> Value.DA
                DE -> Value.DE
                EL -> Value.EL
                EN -> Value.EN
                ES -> Value.ES
                ES_MX -> Value.ES_MX
                FI -> Value.FI
                FR -> Value.FR
                FR_CA -> Value.FR_CA
                HE_IL -> Value.HE_IL
                HR -> Value.HR
                HU -> Value.HU
                ID -> Value.ID
                IT -> Value.IT
                JA -> Value.JA
                KO -> Value.KO
                LT -> Value.LT
                MS -> Value.MS
                NL -> Value.NL
                NO_NO -> Value.NO_NO
                PL -> Value.PL
                PT -> Value.PT
                PT_BR -> Value.PT_BR
                RO -> Value.RO
                RU -> Value.RU
                SK -> Value.SK
                SL -> Value.SL
                SV -> Value.SV
                TH -> Value.TH
                TL -> Value.TL
                TR -> Value.TR
                UK -> Value.UK
                VI -> Value.VI
                ZH_CN -> Value.ZH_CN
                ZH_HK -> Value.ZH_HK
                ZH_TW -> Value.ZH_TW
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
                AF -> Known.AF
                AR_EG -> Known.AR_EG
                BG -> Known.BG
                BN -> Known.BN
                CA_ES -> Known.CA_ES
                CS -> Known.CS
                DA -> Known.DA
                DE -> Known.DE
                EL -> Known.EL
                EN -> Known.EN
                ES -> Known.ES
                ES_MX -> Known.ES_MX
                FI -> Known.FI
                FR -> Known.FR
                FR_CA -> Known.FR_CA
                HE_IL -> Known.HE_IL
                HR -> Known.HR
                HU -> Known.HU
                ID -> Known.ID
                IT -> Known.IT
                JA -> Known.JA
                KO -> Known.KO
                LT -> Known.LT
                MS -> Known.MS
                NL -> Known.NL
                NO_NO -> Known.NO_NO
                PL -> Known.PL
                PT -> Known.PT
                PT_BR -> Known.PT_BR
                RO -> Known.RO
                RU -> Known.RU
                SK -> Known.SK
                SL -> Known.SL
                SV -> Known.SV
                TH -> Known.TH
                TL -> Known.TL
                TR -> Known.TR
                UK -> Known.UK
                VI -> Known.VI
                ZH_CN -> Known.ZH_CN
                ZH_HK -> Known.ZH_HK
                ZH_TW -> Known.ZH_TW
                else -> throw HubspotInvalidDataException("Unknown Language: $value")
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

        fun validate(): Language = apply {
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

            return other is Language && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HubSpotFormConfiguration &&
            allowLinkToResetKnownValues == other.allowLinkToResetKnownValues &&
            archivable == other.archivable &&
            cloneable == other.cloneable &&
            createNewContactForNewEmail == other.createNewContactForNewEmail &&
            editable == other.editable &&
            language == other.language &&
            notifyContactOwner == other.notifyContactOwner &&
            notifyRecipients == other.notifyRecipients &&
            postSubmitAction == other.postSubmitAction &&
            prePopulateKnownValues == other.prePopulateKnownValues &&
            recaptchaEnabled == other.recaptchaEnabled &&
            lifecycleStages == other.lifecycleStages &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            allowLinkToResetKnownValues,
            archivable,
            cloneable,
            createNewContactForNewEmail,
            editable,
            language,
            notifyContactOwner,
            notifyRecipients,
            postSubmitAction,
            prePopulateKnownValues,
            recaptchaEnabled,
            lifecycleStages,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "HubSpotFormConfiguration{allowLinkToResetKnownValues=$allowLinkToResetKnownValues, archivable=$archivable, cloneable=$cloneable, createNewContactForNewEmail=$createNewContactForNewEmail, editable=$editable, language=$language, notifyContactOwner=$notifyContactOwner, notifyRecipients=$notifyRecipients, postSubmitAction=$postSubmitAction, prePopulateKnownValues=$prePopulateKnownValues, recaptchaEnabled=$recaptchaEnabled, lifecycleStages=$lifecycleStages, additionalProperties=$additionalProperties}"
}
