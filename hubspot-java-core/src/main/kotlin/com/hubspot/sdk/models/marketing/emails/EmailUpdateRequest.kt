// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.emails

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.Enum
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class EmailUpdateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val activeDomain: JsonField<String>,
    private val archived: JsonField<Boolean>,
    private val businessUnitId: JsonField<Long>,
    private val campaign: JsonField<String>,
    private val content: JsonField<PublicEmailContent>,
    private val folderIdV2: JsonField<Long>,
    private val from: JsonField<PublicEmailFromDetails>,
    private val jitterSendTime: JsonField<Boolean>,
    private val language: JsonField<Language>,
    private val name: JsonField<String>,
    private val publishDate: JsonField<OffsetDateTime>,
    private val rssData: JsonField<PublicRssEmailDetails>,
    private val sendOnPublish: JsonField<Boolean>,
    private val state: JsonField<State>,
    private val subcategory: JsonField<Subcategory>,
    private val subject: JsonField<String>,
    private val subscriptionDetails: JsonField<PublicEmailSubscriptionDetails>,
    private val testing: JsonField<PublicEmailTestingDetails>,
    private val to: JsonField<PublicEmailToDetails>,
    private val webversion: JsonField<PublicWebversionDetails>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("activeDomain")
        @ExcludeMissing
        activeDomain: JsonField<String> = JsonMissing.of(),
        @JsonProperty("archived") @ExcludeMissing archived: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("businessUnitId")
        @ExcludeMissing
        businessUnitId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("campaign") @ExcludeMissing campaign: JsonField<String> = JsonMissing.of(),
        @JsonProperty("content")
        @ExcludeMissing
        content: JsonField<PublicEmailContent> = JsonMissing.of(),
        @JsonProperty("folderIdV2") @ExcludeMissing folderIdV2: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("from")
        @ExcludeMissing
        from: JsonField<PublicEmailFromDetails> = JsonMissing.of(),
        @JsonProperty("jitterSendTime")
        @ExcludeMissing
        jitterSendTime: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("language") @ExcludeMissing language: JsonField<Language> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("publishDate")
        @ExcludeMissing
        publishDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("rssData")
        @ExcludeMissing
        rssData: JsonField<PublicRssEmailDetails> = JsonMissing.of(),
        @JsonProperty("sendOnPublish")
        @ExcludeMissing
        sendOnPublish: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<State> = JsonMissing.of(),
        @JsonProperty("subcategory")
        @ExcludeMissing
        subcategory: JsonField<Subcategory> = JsonMissing.of(),
        @JsonProperty("subject") @ExcludeMissing subject: JsonField<String> = JsonMissing.of(),
        @JsonProperty("subscriptionDetails")
        @ExcludeMissing
        subscriptionDetails: JsonField<PublicEmailSubscriptionDetails> = JsonMissing.of(),
        @JsonProperty("testing")
        @ExcludeMissing
        testing: JsonField<PublicEmailTestingDetails> = JsonMissing.of(),
        @JsonProperty("to") @ExcludeMissing to: JsonField<PublicEmailToDetails> = JsonMissing.of(),
        @JsonProperty("webversion")
        @ExcludeMissing
        webversion: JsonField<PublicWebversionDetails> = JsonMissing.of(),
    ) : this(
        activeDomain,
        archived,
        businessUnitId,
        campaign,
        content,
        folderIdV2,
        from,
        jitterSendTime,
        language,
        name,
        publishDate,
        rssData,
        sendOnPublish,
        state,
        subcategory,
        subject,
        subscriptionDetails,
        testing,
        to,
        webversion,
        mutableMapOf(),
    )

    /**
     * The active domain of the email.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun activeDomain(): Optional<String> = activeDomain.getOptional("activeDomain")

    /**
     * Determines if the email is archived or not.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun archived(): Optional<Boolean> = archived.getOptional("archived")

    /**
     * The ID of the business unit associated with the email.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun businessUnitId(): Optional<Long> = businessUnitId.getOptional("businessUnitId")

    /**
     * The ID of the campaign this email is associated to.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun campaign(): Optional<String> = campaign.getOptional("campaign")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun content(): Optional<PublicEmailContent> = content.getOptional("content")

    /**
     * The ID of the folder where the email will be stored.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun folderIdV2(): Optional<Long> = folderIdV2.getOptional("folderIdV2")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun from(): Optional<PublicEmailFromDetails> = from.getOptional("from")

    /**
     * Determines whether the email send time should be randomized to avoid sending all emails at
     * the exact same time.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun jitterSendTime(): Optional<Boolean> = jitterSendTime.getOptional("jitterSendTime")

    /**
     * The language code for the email, such as 'en' for English.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun language(): Optional<Language> = language.getOptional("language")

    /**
     * The name of the email, as displayed on the email dashboard.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * The date and time the email is scheduled for, in ISO8601 representation. This is only used in
     * local time or scheduled emails.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun publishDate(): Optional<OffsetDateTime> = publishDate.getOptional("publishDate")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rssData(): Optional<PublicRssEmailDetails> = rssData.getOptional("rssData")

    /**
     * Determines whether the email will be sent immediately on publish.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sendOnPublish(): Optional<Boolean> = sendOnPublish.getOptional("sendOnPublish")

    /**
     * The email state.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun state(): Optional<State> = state.getOptional("state")

    /**
     * The email subcategory.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subcategory(): Optional<Subcategory> = subcategory.getOptional("subcategory")

    /**
     * The subject of the email.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subject(): Optional<String> = subject.getOptional("subject")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subscriptionDetails(): Optional<PublicEmailSubscriptionDetails> =
        subscriptionDetails.getOptional("subscriptionDetails")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun testing(): Optional<PublicEmailTestingDetails> = testing.getOptional("testing")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun to(): Optional<PublicEmailToDetails> = to.getOptional("to")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webversion(): Optional<PublicWebversionDetails> = webversion.getOptional("webversion")

    /**
     * Returns the raw JSON value of [activeDomain].
     *
     * Unlike [activeDomain], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("activeDomain")
    @ExcludeMissing
    fun _activeDomain(): JsonField<String> = activeDomain

    /**
     * Returns the raw JSON value of [archived].
     *
     * Unlike [archived], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("archived") @ExcludeMissing fun _archived(): JsonField<Boolean> = archived

    /**
     * Returns the raw JSON value of [businessUnitId].
     *
     * Unlike [businessUnitId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("businessUnitId")
    @ExcludeMissing
    fun _businessUnitId(): JsonField<Long> = businessUnitId

    /**
     * Returns the raw JSON value of [campaign].
     *
     * Unlike [campaign], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("campaign") @ExcludeMissing fun _campaign(): JsonField<String> = campaign

    /**
     * Returns the raw JSON value of [content].
     *
     * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<PublicEmailContent> = content

    /**
     * Returns the raw JSON value of [folderIdV2].
     *
     * Unlike [folderIdV2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("folderIdV2") @ExcludeMissing fun _folderIdV2(): JsonField<Long> = folderIdV2

    /**
     * Returns the raw JSON value of [from].
     *
     * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<PublicEmailFromDetails> = from

    /**
     * Returns the raw JSON value of [jitterSendTime].
     *
     * Unlike [jitterSendTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("jitterSendTime")
    @ExcludeMissing
    fun _jitterSendTime(): JsonField<Boolean> = jitterSendTime

    /**
     * Returns the raw JSON value of [language].
     *
     * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<Language> = language

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [publishDate].
     *
     * Unlike [publishDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("publishDate")
    @ExcludeMissing
    fun _publishDate(): JsonField<OffsetDateTime> = publishDate

    /**
     * Returns the raw JSON value of [rssData].
     *
     * Unlike [rssData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rssData")
    @ExcludeMissing
    fun _rssData(): JsonField<PublicRssEmailDetails> = rssData

    /**
     * Returns the raw JSON value of [sendOnPublish].
     *
     * Unlike [sendOnPublish], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sendOnPublish")
    @ExcludeMissing
    fun _sendOnPublish(): JsonField<Boolean> = sendOnPublish

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<State> = state

    /**
     * Returns the raw JSON value of [subcategory].
     *
     * Unlike [subcategory], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subcategory")
    @ExcludeMissing
    fun _subcategory(): JsonField<Subcategory> = subcategory

    /**
     * Returns the raw JSON value of [subject].
     *
     * Unlike [subject], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subject") @ExcludeMissing fun _subject(): JsonField<String> = subject

    /**
     * Returns the raw JSON value of [subscriptionDetails].
     *
     * Unlike [subscriptionDetails], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("subscriptionDetails")
    @ExcludeMissing
    fun _subscriptionDetails(): JsonField<PublicEmailSubscriptionDetails> = subscriptionDetails

    /**
     * Returns the raw JSON value of [testing].
     *
     * Unlike [testing], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("testing")
    @ExcludeMissing
    fun _testing(): JsonField<PublicEmailTestingDetails> = testing

    /**
     * Returns the raw JSON value of [to].
     *
     * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<PublicEmailToDetails> = to

    /**
     * Returns the raw JSON value of [webversion].
     *
     * Unlike [webversion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("webversion")
    @ExcludeMissing
    fun _webversion(): JsonField<PublicWebversionDetails> = webversion

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

        /** Returns a mutable builder for constructing an instance of [EmailUpdateRequest]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailUpdateRequest]. */
    class Builder internal constructor() {

        private var activeDomain: JsonField<String> = JsonMissing.of()
        private var archived: JsonField<Boolean> = JsonMissing.of()
        private var businessUnitId: JsonField<Long> = JsonMissing.of()
        private var campaign: JsonField<String> = JsonMissing.of()
        private var content: JsonField<PublicEmailContent> = JsonMissing.of()
        private var folderIdV2: JsonField<Long> = JsonMissing.of()
        private var from: JsonField<PublicEmailFromDetails> = JsonMissing.of()
        private var jitterSendTime: JsonField<Boolean> = JsonMissing.of()
        private var language: JsonField<Language> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var publishDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var rssData: JsonField<PublicRssEmailDetails> = JsonMissing.of()
        private var sendOnPublish: JsonField<Boolean> = JsonMissing.of()
        private var state: JsonField<State> = JsonMissing.of()
        private var subcategory: JsonField<Subcategory> = JsonMissing.of()
        private var subject: JsonField<String> = JsonMissing.of()
        private var subscriptionDetails: JsonField<PublicEmailSubscriptionDetails> =
            JsonMissing.of()
        private var testing: JsonField<PublicEmailTestingDetails> = JsonMissing.of()
        private var to: JsonField<PublicEmailToDetails> = JsonMissing.of()
        private var webversion: JsonField<PublicWebversionDetails> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(emailUpdateRequest: EmailUpdateRequest) = apply {
            activeDomain = emailUpdateRequest.activeDomain
            archived = emailUpdateRequest.archived
            businessUnitId = emailUpdateRequest.businessUnitId
            campaign = emailUpdateRequest.campaign
            content = emailUpdateRequest.content
            folderIdV2 = emailUpdateRequest.folderIdV2
            from = emailUpdateRequest.from
            jitterSendTime = emailUpdateRequest.jitterSendTime
            language = emailUpdateRequest.language
            name = emailUpdateRequest.name
            publishDate = emailUpdateRequest.publishDate
            rssData = emailUpdateRequest.rssData
            sendOnPublish = emailUpdateRequest.sendOnPublish
            state = emailUpdateRequest.state
            subcategory = emailUpdateRequest.subcategory
            subject = emailUpdateRequest.subject
            subscriptionDetails = emailUpdateRequest.subscriptionDetails
            testing = emailUpdateRequest.testing
            to = emailUpdateRequest.to
            webversion = emailUpdateRequest.webversion
            additionalProperties = emailUpdateRequest.additionalProperties.toMutableMap()
        }

        /** The active domain of the email. */
        fun activeDomain(activeDomain: String) = activeDomain(JsonField.of(activeDomain))

        /**
         * Sets [Builder.activeDomain] to an arbitrary JSON value.
         *
         * You should usually call [Builder.activeDomain] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun activeDomain(activeDomain: JsonField<String>) = apply {
            this.activeDomain = activeDomain
        }

        /** Determines if the email is archived or not. */
        fun archived(archived: Boolean) = archived(JsonField.of(archived))

        /**
         * Sets [Builder.archived] to an arbitrary JSON value.
         *
         * You should usually call [Builder.archived] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun archived(archived: JsonField<Boolean>) = apply { this.archived = archived }

        /** The ID of the business unit associated with the email. */
        fun businessUnitId(businessUnitId: Long) = businessUnitId(JsonField.of(businessUnitId))

        /**
         * Sets [Builder.businessUnitId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessUnitId] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun businessUnitId(businessUnitId: JsonField<Long>) = apply {
            this.businessUnitId = businessUnitId
        }

        /** The ID of the campaign this email is associated to. */
        fun campaign(campaign: String) = campaign(JsonField.of(campaign))

        /**
         * Sets [Builder.campaign] to an arbitrary JSON value.
         *
         * You should usually call [Builder.campaign] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun campaign(campaign: JsonField<String>) = apply { this.campaign = campaign }

        fun content(content: PublicEmailContent) = content(JsonField.of(content))

        /**
         * Sets [Builder.content] to an arbitrary JSON value.
         *
         * You should usually call [Builder.content] with a well-typed [PublicEmailContent] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun content(content: JsonField<PublicEmailContent>) = apply { this.content = content }

        /** The ID of the folder where the email will be stored. */
        fun folderIdV2(folderIdV2: Long) = folderIdV2(JsonField.of(folderIdV2))

        /**
         * Sets [Builder.folderIdV2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.folderIdV2] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun folderIdV2(folderIdV2: JsonField<Long>) = apply { this.folderIdV2 = folderIdV2 }

        fun from(from: PublicEmailFromDetails) = from(JsonField.of(from))

        /**
         * Sets [Builder.from] to an arbitrary JSON value.
         *
         * You should usually call [Builder.from] with a well-typed [PublicEmailFromDetails] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun from(from: JsonField<PublicEmailFromDetails>) = apply { this.from = from }

        /**
         * Determines whether the email send time should be randomized to avoid sending all emails
         * at the exact same time.
         */
        fun jitterSendTime(jitterSendTime: Boolean) = jitterSendTime(JsonField.of(jitterSendTime))

        /**
         * Sets [Builder.jitterSendTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jitterSendTime] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun jitterSendTime(jitterSendTime: JsonField<Boolean>) = apply {
            this.jitterSendTime = jitterSendTime
        }

        /** The language code for the email, such as 'en' for English. */
        fun language(language: Language) = language(JsonField.of(language))

        /**
         * Sets [Builder.language] to an arbitrary JSON value.
         *
         * You should usually call [Builder.language] with a well-typed [Language] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun language(language: JsonField<Language>) = apply { this.language = language }

        /** The name of the email, as displayed on the email dashboard. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * The date and time the email is scheduled for, in ISO8601 representation. This is only
         * used in local time or scheduled emails.
         */
        fun publishDate(publishDate: OffsetDateTime) = publishDate(JsonField.of(publishDate))

        /**
         * Sets [Builder.publishDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.publishDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun publishDate(publishDate: JsonField<OffsetDateTime>) = apply {
            this.publishDate = publishDate
        }

        fun rssData(rssData: PublicRssEmailDetails) = rssData(JsonField.of(rssData))

        /**
         * Sets [Builder.rssData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rssData] with a well-typed [PublicRssEmailDetails] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rssData(rssData: JsonField<PublicRssEmailDetails>) = apply { this.rssData = rssData }

        /** Determines whether the email will be sent immediately on publish. */
        fun sendOnPublish(sendOnPublish: Boolean) = sendOnPublish(JsonField.of(sendOnPublish))

        /**
         * Sets [Builder.sendOnPublish] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sendOnPublish] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sendOnPublish(sendOnPublish: JsonField<Boolean>) = apply {
            this.sendOnPublish = sendOnPublish
        }

        /** The email state. */
        fun state(state: State) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [State] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<State>) = apply { this.state = state }

        /** The email subcategory. */
        fun subcategory(subcategory: Subcategory) = subcategory(JsonField.of(subcategory))

        /**
         * Sets [Builder.subcategory] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subcategory] with a well-typed [Subcategory] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subcategory(subcategory: JsonField<Subcategory>) = apply {
            this.subcategory = subcategory
        }

        /** The subject of the email. */
        fun subject(subject: String) = subject(JsonField.of(subject))

        /**
         * Sets [Builder.subject] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subject] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun subject(subject: JsonField<String>) = apply { this.subject = subject }

        fun subscriptionDetails(subscriptionDetails: PublicEmailSubscriptionDetails) =
            subscriptionDetails(JsonField.of(subscriptionDetails))

        /**
         * Sets [Builder.subscriptionDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionDetails] with a well-typed
         * [PublicEmailSubscriptionDetails] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun subscriptionDetails(subscriptionDetails: JsonField<PublicEmailSubscriptionDetails>) =
            apply {
                this.subscriptionDetails = subscriptionDetails
            }

        fun testing(testing: PublicEmailTestingDetails) = testing(JsonField.of(testing))

        /**
         * Sets [Builder.testing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.testing] with a well-typed [PublicEmailTestingDetails]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun testing(testing: JsonField<PublicEmailTestingDetails>) = apply {
            this.testing = testing
        }

        fun to(to: PublicEmailToDetails) = to(JsonField.of(to))

        /**
         * Sets [Builder.to] to an arbitrary JSON value.
         *
         * You should usually call [Builder.to] with a well-typed [PublicEmailToDetails] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun to(to: JsonField<PublicEmailToDetails>) = apply { this.to = to }

        fun webversion(webversion: PublicWebversionDetails) = webversion(JsonField.of(webversion))

        /**
         * Sets [Builder.webversion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webversion] with a well-typed [PublicWebversionDetails]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun webversion(webversion: JsonField<PublicWebversionDetails>) = apply {
            this.webversion = webversion
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
         * Returns an immutable instance of [EmailUpdateRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EmailUpdateRequest =
            EmailUpdateRequest(
                activeDomain,
                archived,
                businessUnitId,
                campaign,
                content,
                folderIdV2,
                from,
                jitterSendTime,
                language,
                name,
                publishDate,
                rssData,
                sendOnPublish,
                state,
                subcategory,
                subject,
                subscriptionDetails,
                testing,
                to,
                webversion,
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
    fun validate(): EmailUpdateRequest = apply {
        if (validated) {
            return@apply
        }

        activeDomain()
        archived()
        businessUnitId()
        campaign()
        content().ifPresent { it.validate() }
        folderIdV2()
        from().ifPresent { it.validate() }
        jitterSendTime()
        language().ifPresent { it.validate() }
        name()
        publishDate()
        rssData().ifPresent { it.validate() }
        sendOnPublish()
        state().ifPresent { it.validate() }
        subcategory().ifPresent { it.validate() }
        subject()
        subscriptionDetails().ifPresent { it.validate() }
        testing().ifPresent { it.validate() }
        to().ifPresent { it.validate() }
        webversion().ifPresent { it.validate() }
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
        (if (activeDomain.asKnown().isPresent) 1 else 0) +
            (if (archived.asKnown().isPresent) 1 else 0) +
            (if (businessUnitId.asKnown().isPresent) 1 else 0) +
            (if (campaign.asKnown().isPresent) 1 else 0) +
            (content.asKnown().getOrNull()?.validity() ?: 0) +
            (if (folderIdV2.asKnown().isPresent) 1 else 0) +
            (from.asKnown().getOrNull()?.validity() ?: 0) +
            (if (jitterSendTime.asKnown().isPresent) 1 else 0) +
            (language.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (publishDate.asKnown().isPresent) 1 else 0) +
            (rssData.asKnown().getOrNull()?.validity() ?: 0) +
            (if (sendOnPublish.asKnown().isPresent) 1 else 0) +
            (state.asKnown().getOrNull()?.validity() ?: 0) +
            (subcategory.asKnown().getOrNull()?.validity() ?: 0) +
            (if (subject.asKnown().isPresent) 1 else 0) +
            (subscriptionDetails.asKnown().getOrNull()?.validity() ?: 0) +
            (testing.asKnown().getOrNull()?.validity() ?: 0) +
            (to.asKnown().getOrNull()?.validity() ?: 0) +
            (webversion.asKnown().getOrNull()?.validity() ?: 0)

    /** The language code for the email, such as 'en' for English. */
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

            @JvmField val AA = of("aa")

            @JvmField val AB = of("ab")

            @JvmField val AE = of("ae")

            @JvmField val AF = of("af")

            @JvmField val AF_NA = of("af-na")

            @JvmField val AF_ZA = of("af-za")

            @JvmField val AGQ = of("agq")

            @JvmField val AGQ_CM = of("agq-cm")

            @JvmField val AK = of("ak")

            @JvmField val AK_GH = of("ak-gh")

            @JvmField val AM = of("am")

            @JvmField val AM_ET = of("am-et")

            @JvmField val AN = of("an")

            @JvmField val ANN = of("ann")

            @JvmField val ANN_NG = of("ann-ng")

            @JvmField val AR = of("ar")

            @JvmField val AR_001 = of("ar-001")

            @JvmField val AR_AE = of("ar-ae")

            @JvmField val AR_BH = of("ar-bh")

            @JvmField val AR_DJ = of("ar-dj")

            @JvmField val AR_DZ = of("ar-dz")

            @JvmField val AR_EG = of("ar-eg")

            @JvmField val AR_EH = of("ar-eh")

            @JvmField val AR_ER = of("ar-er")

            @JvmField val AR_IL = of("ar-il")

            @JvmField val AR_IQ = of("ar-iq")

            @JvmField val AR_JO = of("ar-jo")

            @JvmField val AR_KM = of("ar-km")

            @JvmField val AR_KW = of("ar-kw")

            @JvmField val AR_LB = of("ar-lb")

            @JvmField val AR_LY = of("ar-ly")

            @JvmField val AR_MA = of("ar-ma")

            @JvmField val AR_MR = of("ar-mr")

            @JvmField val AR_OM = of("ar-om")

            @JvmField val AR_PS = of("ar-ps")

            @JvmField val AR_QA = of("ar-qa")

            @JvmField val AR_SA = of("ar-sa")

            @JvmField val AR_SD = of("ar-sd")

            @JvmField val AR_SO = of("ar-so")

            @JvmField val AR_SS = of("ar-ss")

            @JvmField val AR_SY = of("ar-sy")

            @JvmField val AR_TD = of("ar-td")

            @JvmField val AR_TN = of("ar-tn")

            @JvmField val AR_YE = of("ar-ye")

            @JvmField val AS = of("as")

            @JvmField val AS_IN = of("as-in")

            @JvmField val ASA = of("asa")

            @JvmField val ASA_TZ = of("asa-tz")

            @JvmField val AST = of("ast")

            @JvmField val AST_ES = of("ast-es")

            @JvmField val AV = of("av")

            @JvmField val AY = of("ay")

            @JvmField val AZ = of("az")

            @JvmField val AZ_AZ = of("az-az")

            @JvmField val BA = of("ba")

            @JvmField val BAS = of("bas")

            @JvmField val BAS_CM = of("bas-cm")

            @JvmField val BE = of("be")

            @JvmField val BE_BY = of("be-by")

            @JvmField val BEM = of("bem")

            @JvmField val BEM_ZM = of("bem-zm")

            @JvmField val BEZ = of("bez")

            @JvmField val BEZ_TZ = of("bez-tz")

            @JvmField val BG = of("bg")

            @JvmField val BG_BG = of("bg-bg")

            @JvmField val BGC = of("bgc")

            @JvmField val BGC_IN = of("bgc-in")

            @JvmField val BHO = of("bho")

            @JvmField val BHO_IN = of("bho-in")

            @JvmField val BI = of("bi")

            @JvmField val BM = of("bm")

            @JvmField val BM_ML = of("bm-ml")

            @JvmField val BN = of("bn")

            @JvmField val BN_BD = of("bn-bd")

            @JvmField val BN_IN = of("bn-in")

            @JvmField val BO = of("bo")

            @JvmField val BO_CN = of("bo-cn")

            @JvmField val BO_IN = of("bo-in")

            @JvmField val BR = of("br")

            @JvmField val BR_FR = of("br-fr")

            @JvmField val BRX = of("brx")

            @JvmField val BRX_IN = of("brx-in")

            @JvmField val BS = of("bs")

            @JvmField val BS_BA = of("bs-ba")

            @JvmField val CA = of("ca")

            @JvmField val CA_AD = of("ca-ad")

            @JvmField val CA_ES = of("ca-es")

            @JvmField val CA_FR = of("ca-fr")

            @JvmField val CA_IT = of("ca-it")

            @JvmField val CCP = of("ccp")

            @JvmField val CCP_BD = of("ccp-bd")

            @JvmField val CCP_IN = of("ccp-in")

            @JvmField val CE = of("ce")

            @JvmField val CE_RU = of("ce-ru")

            @JvmField val CEB = of("ceb")

            @JvmField val CEB_PH = of("ceb-ph")

            @JvmField val CGG = of("cgg")

            @JvmField val CGG_UG = of("cgg-ug")

            @JvmField val CH = of("ch")

            @JvmField val CHR = of("chr")

            @JvmField val CHR_US = of("chr-us")

            @JvmField val CKB = of("ckb")

            @JvmField val CKB_IQ = of("ckb-iq")

            @JvmField val CKB_IR = of("ckb-ir")

            @JvmField val CO = of("co")

            @JvmField val CR = of("cr")

            @JvmField val CS = of("cs")

            @JvmField val CS_CZ = of("cs-cz")

            @JvmField val CU = of("cu")

            @JvmField val CU_RU = of("cu-ru")

            @JvmField val CV = of("cv")

            @JvmField val CV_RU = of("cv-ru")

            @JvmField val CY = of("cy")

            @JvmField val CY_GB = of("cy-gb")

            @JvmField val DA = of("da")

            @JvmField val DA_DK = of("da-dk")

            @JvmField val DA_GL = of("da-gl")

            @JvmField val DAV = of("dav")

            @JvmField val DAV_KE = of("dav-ke")

            @JvmField val DE = of("de")

            @JvmField val DE_AT = of("de-at")

            @JvmField val DE_BE = of("de-be")

            @JvmField val DE_CH = of("de-ch")

            @JvmField val DE_DE = of("de-de")

            @JvmField val DE_GR = of("de-gr")

            @JvmField val DE_IT = of("de-it")

            @JvmField val DE_LI = of("de-li")

            @JvmField val DE_LU = of("de-lu")

            @JvmField val DJE = of("dje")

            @JvmField val DJE_NE = of("dje-ne")

            @JvmField val DOI = of("doi")

            @JvmField val DOI_IN = of("doi-in")

            @JvmField val DSB = of("dsb")

            @JvmField val DSB_DE = of("dsb-de")

            @JvmField val DUA = of("dua")

            @JvmField val DUA_CM = of("dua-cm")

            @JvmField val DV = of("dv")

            @JvmField val DYO = of("dyo")

            @JvmField val DYO_SN = of("dyo-sn")

            @JvmField val DZ = of("dz")

            @JvmField val DZ_BT = of("dz-bt")

            @JvmField val EBU = of("ebu")

            @JvmField val EBU_KE = of("ebu-ke")

            @JvmField val EE = of("ee")

            @JvmField val EE_GH = of("ee-gh")

            @JvmField val EE_TG = of("ee-tg")

            @JvmField val EL = of("el")

            @JvmField val EL_CY = of("el-cy")

            @JvmField val EL_GR = of("el-gr")

            @JvmField val EN = of("en")

            @JvmField val EN_001 = of("en-001")

            @JvmField val EN_150 = of("en-150")

            @JvmField val EN_AE = of("en-ae")

            @JvmField val EN_AG = of("en-ag")

            @JvmField val EN_AI = of("en-ai")

            @JvmField val EN_AS = of("en-as")

            @JvmField val EN_AT = of("en-at")

            @JvmField val EN_AU = of("en-au")

            @JvmField val EN_BB = of("en-bb")

            @JvmField val EN_BE = of("en-be")

            @JvmField val EN_BI = of("en-bi")

            @JvmField val EN_BM = of("en-bm")

            @JvmField val EN_BS = of("en-bs")

            @JvmField val EN_BW = of("en-bw")

            @JvmField val EN_BZ = of("en-bz")

            @JvmField val EN_CA = of("en-ca")

            @JvmField val EN_CC = of("en-cc")

            @JvmField val EN_CH = of("en-ch")

            @JvmField val EN_CK = of("en-ck")

            @JvmField val EN_CM = of("en-cm")

            @JvmField val EN_CN = of("en-cn")

            @JvmField val EN_CX = of("en-cx")

            @JvmField val EN_CY = of("en-cy")

            @JvmField val EN_DE = of("en-de")

            @JvmField val EN_DG = of("en-dg")

            @JvmField val EN_DK = of("en-dk")

            @JvmField val EN_DM = of("en-dm")

            @JvmField val EN_EE = of("en-ee")

            @JvmField val EN_EG = of("en-eg")

            @JvmField val EN_ER = of("en-er")

            @JvmField val EN_ES = of("en-es")

            @JvmField val EN_FI = of("en-fi")

            @JvmField val EN_FJ = of("en-fj")

            @JvmField val EN_FK = of("en-fk")

            @JvmField val EN_FM = of("en-fm")

            @JvmField val EN_FR = of("en-fr")

            @JvmField val EN_GB = of("en-gb")

            @JvmField val EN_GD = of("en-gd")

            @JvmField val EN_GG = of("en-gg")

            @JvmField val EN_GH = of("en-gh")

            @JvmField val EN_GI = of("en-gi")

            @JvmField val EN_GM = of("en-gm")

            @JvmField val EN_GU = of("en-gu")

            @JvmField val EN_GY = of("en-gy")

            @JvmField val EN_HK = of("en-hk")

            @JvmField val EN_ID = of("en-id")

            @JvmField val EN_IE = of("en-ie")

            @JvmField val EN_IL = of("en-il")

            @JvmField val EN_IM = of("en-im")

            @JvmField val EN_IN = of("en-in")

            @JvmField val EN_IO = of("en-io")

            @JvmField val EN_JE = of("en-je")

            @JvmField val EN_JM = of("en-jm")

            @JvmField val EN_KE = of("en-ke")

            @JvmField val EN_KI = of("en-ki")

            @JvmField val EN_KN = of("en-kn")

            @JvmField val EN_KY = of("en-ky")

            @JvmField val EN_LC = of("en-lc")

            @JvmField val EN_LR = of("en-lr")

            @JvmField val EN_LS = of("en-ls")

            @JvmField val EN_LU = of("en-lu")

            @JvmField val EN_MG = of("en-mg")

            @JvmField val EN_MH = of("en-mh")

            @JvmField val EN_MO = of("en-mo")

            @JvmField val EN_MP = of("en-mp")

            @JvmField val EN_MS = of("en-ms")

            @JvmField val EN_MT = of("en-mt")

            @JvmField val EN_MU = of("en-mu")

            @JvmField val EN_MV = of("en-mv")

            @JvmField val EN_MW = of("en-mw")

            @JvmField val EN_MX = of("en-mx")

            @JvmField val EN_MY = of("en-my")

            @JvmField val EN_NA = of("en-na")

            @JvmField val EN_NF = of("en-nf")

            @JvmField val EN_NG = of("en-ng")

            @JvmField val EN_NL = of("en-nl")

            @JvmField val EN_NR = of("en-nr")

            @JvmField val EN_NU = of("en-nu")

            @JvmField val EN_NZ = of("en-nz")

            @JvmField val EN_PG = of("en-pg")

            @JvmField val EN_PH = of("en-ph")

            @JvmField val EN_PK = of("en-pk")

            @JvmField val EN_PN = of("en-pn")

            @JvmField val EN_PR = of("en-pr")

            @JvmField val EN_PT = of("en-pt")

            @JvmField val EN_PW = of("en-pw")

            @JvmField val EN_RW = of("en-rw")

            @JvmField val EN_SB = of("en-sb")

            @JvmField val EN_SC = of("en-sc")

            @JvmField val EN_SD = of("en-sd")

            @JvmField val EN_SE = of("en-se")

            @JvmField val EN_SG = of("en-sg")

            @JvmField val EN_SH = of("en-sh")

            @JvmField val EN_SI = of("en-si")

            @JvmField val EN_SL = of("en-sl")

            @JvmField val EN_SS = of("en-ss")

            @JvmField val EN_SX = of("en-sx")

            @JvmField val EN_SZ = of("en-sz")

            @JvmField val EN_TC = of("en-tc")

            @JvmField val EN_TH = of("en-th")

            @JvmField val EN_TK = of("en-tk")

            @JvmField val EN_TN = of("en-tn")

            @JvmField val EN_TO = of("en-to")

            @JvmField val EN_TT = of("en-tt")

            @JvmField val EN_TV = of("en-tv")

            @JvmField val EN_TZ = of("en-tz")

            @JvmField val EN_UG = of("en-ug")

            @JvmField val EN_UM = of("en-um")

            @JvmField val EN_US = of("en-us")

            @JvmField val EN_VC = of("en-vc")

            @JvmField val EN_VG = of("en-vg")

            @JvmField val EN_VI = of("en-vi")

            @JvmField val EN_VN = of("en-vn")

            @JvmField val EN_VU = of("en-vu")

            @JvmField val EN_WS = of("en-ws")

            @JvmField val EN_ZA = of("en-za")

            @JvmField val EN_ZM = of("en-zm")

            @JvmField val EN_ZW = of("en-zw")

            @JvmField val EO = of("eo")

            @JvmField val EO_001 = of("eo-001")

            @JvmField val ES = of("es")

            @JvmField val ES_419 = of("es-419")

            @JvmField val ES_AR = of("es-ar")

            @JvmField val ES_BO = of("es-bo")

            @JvmField val ES_BR = of("es-br")

            @JvmField val ES_BZ = of("es-bz")

            @JvmField val ES_CL = of("es-cl")

            @JvmField val ES_CO = of("es-co")

            @JvmField val ES_CR = of("es-cr")

            @JvmField val ES_CU = of("es-cu")

            @JvmField val ES_DO = of("es-do")

            @JvmField val ES_EA = of("es-ea")

            @JvmField val ES_EC = of("es-ec")

            @JvmField val ES_ES = of("es-es")

            @JvmField val ES_GQ = of("es-gq")

            @JvmField val ES_GT = of("es-gt")

            @JvmField val ES_HN = of("es-hn")

            @JvmField val ES_IC = of("es-ic")

            @JvmField val ES_MX = of("es-mx")

            @JvmField val ES_NI = of("es-ni")

            @JvmField val ES_PA = of("es-pa")

            @JvmField val ES_PE = of("es-pe")

            @JvmField val ES_PH = of("es-ph")

            @JvmField val ES_PR = of("es-pr")

            @JvmField val ES_PY = of("es-py")

            @JvmField val ES_SV = of("es-sv")

            @JvmField val ES_US = of("es-us")

            @JvmField val ES_UY = of("es-uy")

            @JvmField val ES_VE = of("es-ve")

            @JvmField val ET = of("et")

            @JvmField val ET_EE = of("et-ee")

            @JvmField val EU = of("eu")

            @JvmField val EU_ES = of("eu-es")

            @JvmField val EWO = of("ewo")

            @JvmField val EWO_CM = of("ewo-cm")

            @JvmField val FA = of("fa")

            @JvmField val FA_AF = of("fa-af")

            @JvmField val FA_IR = of("fa-ir")

            @JvmField val FF = of("ff")

            @JvmField val FF_BF = of("ff-bf")

            @JvmField val FF_CM = of("ff-cm")

            @JvmField val FF_GH = of("ff-gh")

            @JvmField val FF_GM = of("ff-gm")

            @JvmField val FF_GN = of("ff-gn")

            @JvmField val FF_GW = of("ff-gw")

            @JvmField val FF_LR = of("ff-lr")

            @JvmField val FF_MR = of("ff-mr")

            @JvmField val FF_NE = of("ff-ne")

            @JvmField val FF_NG = of("ff-ng")

            @JvmField val FF_SL = of("ff-sl")

            @JvmField val FF_SN = of("ff-sn")

            @JvmField val FI = of("fi")

            @JvmField val FI_FI = of("fi-fi")

            @JvmField val FIL = of("fil")

            @JvmField val FIL_PH = of("fil-ph")

            @JvmField val FJ = of("fj")

            @JvmField val FO = of("fo")

            @JvmField val FO_DK = of("fo-dk")

            @JvmField val FO_FO = of("fo-fo")

            @JvmField val FR = of("fr")

            @JvmField val FR_BE = of("fr-be")

            @JvmField val FR_BF = of("fr-bf")

            @JvmField val FR_BI = of("fr-bi")

            @JvmField val FR_BJ = of("fr-bj")

            @JvmField val FR_BL = of("fr-bl")

            @JvmField val FR_CA = of("fr-ca")

            @JvmField val FR_CD = of("fr-cd")

            @JvmField val FR_CF = of("fr-cf")

            @JvmField val FR_CG = of("fr-cg")

            @JvmField val FR_CH = of("fr-ch")

            @JvmField val FR_CI = of("fr-ci")

            @JvmField val FR_CM = of("fr-cm")

            @JvmField val FR_DJ = of("fr-dj")

            @JvmField val FR_DZ = of("fr-dz")

            @JvmField val FR_FR = of("fr-fr")

            @JvmField val FR_GA = of("fr-ga")

            @JvmField val FR_GF = of("fr-gf")

            @JvmField val FR_GN = of("fr-gn")

            @JvmField val FR_GP = of("fr-gp")

            @JvmField val FR_GQ = of("fr-gq")

            @JvmField val FR_HT = of("fr-ht")

            @JvmField val FR_KM = of("fr-km")

            @JvmField val FR_LU = of("fr-lu")

            @JvmField val FR_MA = of("fr-ma")

            @JvmField val FR_MC = of("fr-mc")

            @JvmField val FR_MF = of("fr-mf")

            @JvmField val FR_MG = of("fr-mg")

            @JvmField val FR_ML = of("fr-ml")

            @JvmField val FR_MQ = of("fr-mq")

            @JvmField val FR_MR = of("fr-mr")

            @JvmField val FR_MU = of("fr-mu")

            @JvmField val FR_NC = of("fr-nc")

            @JvmField val FR_NE = of("fr-ne")

            @JvmField val FR_PF = of("fr-pf")

            @JvmField val FR_PM = of("fr-pm")

            @JvmField val FR_RE = of("fr-re")

            @JvmField val FR_RW = of("fr-rw")

            @JvmField val FR_SC = of("fr-sc")

            @JvmField val FR_SN = of("fr-sn")

            @JvmField val FR_SY = of("fr-sy")

            @JvmField val FR_TD = of("fr-td")

            @JvmField val FR_TG = of("fr-tg")

            @JvmField val FR_TN = of("fr-tn")

            @JvmField val FR_VU = of("fr-vu")

            @JvmField val FR_WF = of("fr-wf")

            @JvmField val FR_YT = of("fr-yt")

            @JvmField val FRR = of("frr")

            @JvmField val FRR_DE = of("frr-de")

            @JvmField val FUR = of("fur")

            @JvmField val FUR_IT = of("fur-it")

            @JvmField val FY = of("fy")

            @JvmField val FY_NL = of("fy-nl")

            @JvmField val GA = of("ga")

            @JvmField val GA_GB = of("ga-gb")

            @JvmField val GA_IE = of("ga-ie")

            @JvmField val GD = of("gd")

            @JvmField val GD_GB = of("gd-gb")

            @JvmField val GL = of("gl")

            @JvmField val GL_ES = of("gl-es")

            @JvmField val GN = of("gn")

            @JvmField val GSW = of("gsw")

            @JvmField val GSW_CH = of("gsw-ch")

            @JvmField val GSW_FR = of("gsw-fr")

            @JvmField val GSW_LI = of("gsw-li")

            @JvmField val GU = of("gu")

            @JvmField val GU_IN = of("gu-in")

            @JvmField val GUZ = of("guz")

            @JvmField val GUZ_KE = of("guz-ke")

            @JvmField val GV = of("gv")

            @JvmField val GV_IM = of("gv-im")

            @JvmField val HA = of("ha")

            @JvmField val HA_GH = of("ha-gh")

            @JvmField val HA_NE = of("ha-ne")

            @JvmField val HA_NG = of("ha-ng")

            @JvmField val HAW = of("haw")

            @JvmField val HAW_US = of("haw-us")

            @JvmField val HE = of("he")

            @JvmField val HE_IL = of("he-il")

            @JvmField val HI = of("hi")

            @JvmField val HI_IN = of("hi-in")

            @JvmField val HMN = of("hmn")

            @JvmField val HO = of("ho")

            @JvmField val HR = of("hr")

            @JvmField val HR_BA = of("hr-ba")

            @JvmField val HR_HR = of("hr-hr")

            @JvmField val HSB = of("hsb")

            @JvmField val HSB_DE = of("hsb-de")

            @JvmField val HT = of("ht")

            @JvmField val HU = of("hu")

            @JvmField val HU_HU = of("hu-hu")

            @JvmField val HY = of("hy")

            @JvmField val HY_AM = of("hy-am")

            @JvmField val HZ = of("hz")

            @JvmField val IA = of("ia")

            @JvmField val IA_001 = of("ia-001")

            @JvmField val ID = of("id")

            @JvmField val ID_ID = of("id-id")

            @JvmField val IE = of("ie")

            @JvmField val IG = of("ig")

            @JvmField val IG_NG = of("ig-ng")

            @JvmField val II = of("ii")

            @JvmField val II_CN = of("ii-cn")

            @JvmField val IK = of("ik")

            @JvmField val IO = of("io")

            @JvmField val IS = of("is")

            @JvmField val IS_IS = of("is-is")

            @JvmField val IT = of("it")

            @JvmField val IT_CH = of("it-ch")

            @JvmField val IT_IT = of("it-it")

            @JvmField val IT_SM = of("it-sm")

            @JvmField val IT_VA = of("it-va")

            @JvmField val IU = of("iu")

            @JvmField val JA = of("ja")

            @JvmField val JA_JP = of("ja-jp")

            @JvmField val JGO = of("jgo")

            @JvmField val JGO_CM = of("jgo-cm")

            @JvmField val JMC = of("jmc")

            @JvmField val JMC_TZ = of("jmc-tz")

            @JvmField val JV = of("jv")

            @JvmField val JV_ID = of("jv-id")

            @JvmField val KA = of("ka")

            @JvmField val KA_GE = of("ka-ge")

            @JvmField val KAB = of("kab")

            @JvmField val KAB_DZ = of("kab-dz")

            @JvmField val KAM = of("kam")

            @JvmField val KAM_KE = of("kam-ke")

            @JvmField val KAR = of("kar")

            @JvmField val KDE = of("kde")

            @JvmField val KDE_TZ = of("kde-tz")

            @JvmField val KEA = of("kea")

            @JvmField val KEA_CV = of("kea-cv")

            @JvmField val KG = of("kg")

            @JvmField val KGP = of("kgp")

            @JvmField val KGP_BR = of("kgp-br")

            @JvmField val KH = of("kh")

            @JvmField val KHQ = of("khq")

            @JvmField val KHQ_ML = of("khq-ml")

            @JvmField val KI = of("ki")

            @JvmField val KI_KE = of("ki-ke")

            @JvmField val KJ = of("kj")

            @JvmField val KK = of("kk")

            @JvmField val KK_KZ = of("kk-kz")

            @JvmField val KKJ = of("kkj")

            @JvmField val KKJ_CM = of("kkj-cm")

            @JvmField val KL = of("kl")

            @JvmField val KL_GL = of("kl-gl")

            @JvmField val KLN = of("kln")

            @JvmField val KLN_KE = of("kln-ke")

            @JvmField val KM = of("km")

            @JvmField val KM_KH = of("km-kh")

            @JvmField val KN = of("kn")

            @JvmField val KN_IN = of("kn-in")

            @JvmField val KO = of("ko")

            @JvmField val KO_KP = of("ko-kp")

            @JvmField val KO_KR = of("ko-kr")

            @JvmField val KOK = of("kok")

            @JvmField val KOK_IN = of("kok-in")

            @JvmField val KR = of("kr")

            @JvmField val KS = of("ks")

            @JvmField val KS_IN = of("ks-in")

            @JvmField val KSB = of("ksb")

            @JvmField val KSB_TZ = of("ksb-tz")

            @JvmField val KSF = of("ksf")

            @JvmField val KSF_CM = of("ksf-cm")

            @JvmField val KSH = of("ksh")

            @JvmField val KSH_DE = of("ksh-de")

            @JvmField val KU = of("ku")

            @JvmField val KU_TR = of("ku-tr")

            @JvmField val KV = of("kv")

            @JvmField val KW = of("kw")

            @JvmField val KW_GB = of("kw-gb")

            @JvmField val KY = of("ky")

            @JvmField val KY_KG = of("ky-kg")

            @JvmField val LA = of("la")

            @JvmField val LAG = of("lag")

            @JvmField val LAG_TZ = of("lag-tz")

            @JvmField val LB = of("lb")

            @JvmField val LB_LU = of("lb-lu")

            @JvmField val LG = of("lg")

            @JvmField val LG_UG = of("lg-ug")

            @JvmField val LI = of("li")

            @JvmField val LKT = of("lkt")

            @JvmField val LKT_US = of("lkt-us")

            @JvmField val LN = of("ln")

            @JvmField val LN_AO = of("ln-ao")

            @JvmField val LN_CD = of("ln-cd")

            @JvmField val LN_CF = of("ln-cf")

            @JvmField val LN_CG = of("ln-cg")

            @JvmField val LO = of("lo")

            @JvmField val LO_LA = of("lo-la")

            @JvmField val LRC = of("lrc")

            @JvmField val LRC_IQ = of("lrc-iq")

            @JvmField val LRC_IR = of("lrc-ir")

            @JvmField val LT = of("lt")

            @JvmField val LT_LT = of("lt-lt")

            @JvmField val LU = of("lu")

            @JvmField val LU_CD = of("lu-cd")

            @JvmField val LUO = of("luo")

            @JvmField val LUO_KE = of("luo-ke")

            @JvmField val LUY = of("luy")

            @JvmField val LUY_KE = of("luy-ke")

            @JvmField val LV = of("lv")

            @JvmField val LV_LV = of("lv-lv")

            @JvmField val MAI = of("mai")

            @JvmField val MAI_IN = of("mai-in")

            @JvmField val MAS = of("mas")

            @JvmField val MAS_KE = of("mas-ke")

            @JvmField val MAS_TZ = of("mas-tz")

            @JvmField val MDF = of("mdf")

            @JvmField val MDF_RU = of("mdf-ru")

            @JvmField val MER = of("mer")

            @JvmField val MER_KE = of("mer-ke")

            @JvmField val MFE = of("mfe")

            @JvmField val MFE_MU = of("mfe-mu")

            @JvmField val MG = of("mg")

            @JvmField val MG_MG = of("mg-mg")

            @JvmField val MGH = of("mgh")

            @JvmField val MGH_MZ = of("mgh-mz")

            @JvmField val MGO = of("mgo")

            @JvmField val MGO_CM = of("mgo-cm")

            @JvmField val MH = of("mh")

            @JvmField val MI = of("mi")

            @JvmField val MI_NZ = of("mi-nz")

            @JvmField val MK = of("mk")

            @JvmField val MK_MK = of("mk-mk")

            @JvmField val ML = of("ml")

            @JvmField val ML_IN = of("ml-in")

            @JvmField val MN = of("mn")

            @JvmField val MN_MN = of("mn-mn")

            @JvmField val MNI = of("mni")

            @JvmField val MNI_IN = of("mni-in")

            @JvmField val MR = of("mr")

            @JvmField val MR_IN = of("mr-in")

            @JvmField val MS = of("ms")

            @JvmField val MS_BN = of("ms-bn")

            @JvmField val MS_ID = of("ms-id")

            @JvmField val MS_MY = of("ms-my")

            @JvmField val MS_SG = of("ms-sg")

            @JvmField val MT = of("mt")

            @JvmField val MT_MT = of("mt-mt")

            @JvmField val MUA = of("mua")

            @JvmField val MUA_CM = of("mua-cm")

            @JvmField val MY = of("my")

            @JvmField val MY_MM = of("my-mm")

            @JvmField val MZN = of("mzn")

            @JvmField val MZN_IR = of("mzn-ir")

            @JvmField val NA = of("na")

            @JvmField val NAQ = of("naq")

            @JvmField val NAQ_NA = of("naq-na")

            @JvmField val NB = of("nb")

            @JvmField val NB_NO = of("nb-no")

            @JvmField val NB_SJ = of("nb-sj")

            @JvmField val ND = of("nd")

            @JvmField val ND_ZW = of("nd-zw")

            @JvmField val NDS = of("nds")

            @JvmField val NDS_DE = of("nds-de")

            @JvmField val NDS_NL = of("nds-nl")

            @JvmField val NE = of("ne")

            @JvmField val NE_IN = of("ne-in")

            @JvmField val NE_NP = of("ne-np")

            @JvmField val NG = of("ng")

            @JvmField val NL = of("nl")

            @JvmField val NL_AW = of("nl-aw")

            @JvmField val NL_BE = of("nl-be")

            @JvmField val NL_BQ = of("nl-bq")

            @JvmField val NL_CH = of("nl-ch")

            @JvmField val NL_CW = of("nl-cw")

            @JvmField val NL_LU = of("nl-lu")

            @JvmField val NL_NL = of("nl-nl")

            @JvmField val NL_SR = of("nl-sr")

            @JvmField val NL_SX = of("nl-sx")

            @JvmField val NMG = of("nmg")

            @JvmField val NMG_CM = of("nmg-cm")

            @JvmField val NN = of("nn")

            @JvmField val NN_NO = of("nn-no")

            @JvmField val NNH = of("nnh")

            @JvmField val NNH_CM = of("nnh-cm")

            @JvmField val NO = of("no")

            @JvmField val NO_NO = of("no-no")

            @JvmField val NR = of("nr")

            @JvmField val NUS = of("nus")

            @JvmField val NUS_SS = of("nus-ss")

            @JvmField val NV = of("nv")

            @JvmField val NY = of("ny")

            @JvmField val NYN = of("nyn")

            @JvmField val NYN_UG = of("nyn-ug")

            @JvmField val OC = of("oc")

            @JvmField val OC_ES = of("oc-es")

            @JvmField val OC_FR = of("oc-fr")

            @JvmField val OJ = of("oj")

            @JvmField val OM = of("om")

            @JvmField val OM_ET = of("om-et")

            @JvmField val OM_KE = of("om-ke")

            @JvmField val OR = of("or")

            @JvmField val OR_IN = of("or-in")

            @JvmField val OS = of("os")

            @JvmField val OS_GE = of("os-ge")

            @JvmField val OS_RU = of("os-ru")

            @JvmField val PA = of("pa")

            @JvmField val PA_IN = of("pa-in")

            @JvmField val PA_PK = of("pa-pk")

            @JvmField val PCM = of("pcm")

            @JvmField val PCM_NG = of("pcm-ng")

            @JvmField val PI = of("pi")

            @JvmField val PIS = of("pis")

            @JvmField val PIS_SB = of("pis-sb")

            @JvmField val PL = of("pl")

            @JvmField val PL_PL = of("pl-pl")

            @JvmField val PRG = of("prg")

            @JvmField val PRG_001 = of("prg-001")

            @JvmField val PS = of("ps")

            @JvmField val PS_AF = of("ps-af")

            @JvmField val PS_PK = of("ps-pk")

            @JvmField val PT = of("pt")

            @JvmField val PT_AO = of("pt-ao")

            @JvmField val PT_BR = of("pt-br")

            @JvmField val PT_CH = of("pt-ch")

            @JvmField val PT_CV = of("pt-cv")

            @JvmField val PT_GQ = of("pt-gq")

            @JvmField val PT_GW = of("pt-gw")

            @JvmField val PT_LU = of("pt-lu")

            @JvmField val PT_MO = of("pt-mo")

            @JvmField val PT_MZ = of("pt-mz")

            @JvmField val PT_PT = of("pt-pt")

            @JvmField val PT_ST = of("pt-st")

            @JvmField val PT_TL = of("pt-tl")

            @JvmField val QU = of("qu")

            @JvmField val QU_BO = of("qu-bo")

            @JvmField val QU_EC = of("qu-ec")

            @JvmField val QU_PE = of("qu-pe")

            @JvmField val RAJ = of("raj")

            @JvmField val RAJ_IN = of("raj-in")

            @JvmField val RM = of("rm")

            @JvmField val RM_CH = of("rm-ch")

            @JvmField val RN = of("rn")

            @JvmField val RN_BI = of("rn-bi")

            @JvmField val RO = of("ro")

            @JvmField val RO_MD = of("ro-md")

            @JvmField val RO_RO = of("ro-ro")

            @JvmField val ROF = of("rof")

            @JvmField val ROF_TZ = of("rof-tz")

            @JvmField val RU = of("ru")

            @JvmField val RU_BY = of("ru-by")

            @JvmField val RU_KG = of("ru-kg")

            @JvmField val RU_KZ = of("ru-kz")

            @JvmField val RU_MD = of("ru-md")

            @JvmField val RU_RU = of("ru-ru")

            @JvmField val RU_UA = of("ru-ua")

            @JvmField val RW = of("rw")

            @JvmField val RW_RW = of("rw-rw")

            @JvmField val RWK = of("rwk")

            @JvmField val RWK_TZ = of("rwk-tz")

            @JvmField val SA = of("sa")

            @JvmField val SA_IN = of("sa-in")

            @JvmField val SAH = of("sah")

            @JvmField val SAH_RU = of("sah-ru")

            @JvmField val SAQ = of("saq")

            @JvmField val SAQ_KE = of("saq-ke")

            @JvmField val SAT = of("sat")

            @JvmField val SAT_IN = of("sat-in")

            @JvmField val SBP = of("sbp")

            @JvmField val SBP_TZ = of("sbp-tz")

            @JvmField val SC = of("sc")

            @JvmField val SC_IT = of("sc-it")

            @JvmField val SD = of("sd")

            @JvmField val SD_IN = of("sd-in")

            @JvmField val SD_PK = of("sd-pk")

            @JvmField val SE = of("se")

            @JvmField val SE_FI = of("se-fi")

            @JvmField val SE_NO = of("se-no")

            @JvmField val SE_SE = of("se-se")

            @JvmField val SEH = of("seh")

            @JvmField val SEH_MZ = of("seh-mz")

            @JvmField val SES = of("ses")

            @JvmField val SES_ML = of("ses-ml")

            @JvmField val SG = of("sg")

            @JvmField val SG_CF = of("sg-cf")

            @JvmField val SHI = of("shi")

            @JvmField val SHI_MA = of("shi-ma")

            @JvmField val SI = of("si")

            @JvmField val SI_LK = of("si-lk")

            @JvmField val SK = of("sk")

            @JvmField val SK_SK = of("sk-sk")

            @JvmField val SL = of("sl")

            @JvmField val SL_SI = of("sl-si")

            @JvmField val SM = of("sm")

            @JvmField val SMN = of("smn")

            @JvmField val SMN_FI = of("smn-fi")

            @JvmField val SMS = of("sms")

            @JvmField val SMS_FI = of("sms-fi")

            @JvmField val SN = of("sn")

            @JvmField val SN_ZW = of("sn-zw")

            @JvmField val SO = of("so")

            @JvmField val SO_DJ = of("so-dj")

            @JvmField val SO_ET = of("so-et")

            @JvmField val SO_KE = of("so-ke")

            @JvmField val SO_SO = of("so-so")

            @JvmField val SQ = of("sq")

            @JvmField val SQ_AL = of("sq-al")

            @JvmField val SQ_MK = of("sq-mk")

            @JvmField val SQ_XK = of("sq-xk")

            @JvmField val SR = of("sr")

            @JvmField val SR_BA = of("sr-ba")

            @JvmField val SR_CS = of("sr-cs")

            @JvmField val SR_ME = of("sr-me")

            @JvmField val SR_RS = of("sr-rs")

            @JvmField val SR_XK = of("sr-xk")

            @JvmField val SS = of("ss")

            @JvmField val ST = of("st")

            @JvmField val SU = of("su")

            @JvmField val SU_ID = of("su-id")

            @JvmField val SV = of("sv")

            @JvmField val SV_AX = of("sv-ax")

            @JvmField val SV_FI = of("sv-fi")

            @JvmField val SV_SE = of("sv-se")

            @JvmField val SW = of("sw")

            @JvmField val SW_CD = of("sw-cd")

            @JvmField val SW_KE = of("sw-ke")

            @JvmField val SW_TZ = of("sw-tz")

            @JvmField val SW_UG = of("sw-ug")

            @JvmField val SY = of("sy")

            @JvmField val TA = of("ta")

            @JvmField val TA_IN = of("ta-in")

            @JvmField val TA_LK = of("ta-lk")

            @JvmField val TA_MY = of("ta-my")

            @JvmField val TA_SG = of("ta-sg")

            @JvmField val TE = of("te")

            @JvmField val TE_IN = of("te-in")

            @JvmField val TEO = of("teo")

            @JvmField val TEO_KE = of("teo-ke")

            @JvmField val TEO_UG = of("teo-ug")

            @JvmField val TG = of("tg")

            @JvmField val TG_TJ = of("tg-tj")

            @JvmField val TH = of("th")

            @JvmField val TH_TH = of("th-th")

            @JvmField val TI = of("ti")

            @JvmField val TI_ER = of("ti-er")

            @JvmField val TI_ET = of("ti-et")

            @JvmField val TK = of("tk")

            @JvmField val TK_TM = of("tk-tm")

            @JvmField val TL = of("tl")

            @JvmField val TN = of("tn")

            @JvmField val TO = of("to")

            @JvmField val TO_TO = of("to-to")

            @JvmField val TOK = of("tok")

            @JvmField val TOK_001 = of("tok-001")

            @JvmField val TR = of("tr")

            @JvmField val TR_CY = of("tr-cy")

            @JvmField val TR_TR = of("tr-tr")

            @JvmField val TS = of("ts")

            @JvmField val TT = of("tt")

            @JvmField val TT_RU = of("tt-ru")

            @JvmField val TW = of("tw")

            @JvmField val TWQ = of("twq")

            @JvmField val TWQ_NE = of("twq-ne")

            @JvmField val TY = of("ty")

            @JvmField val TZM = of("tzm")

            @JvmField val TZM_MA = of("tzm-ma")

            @JvmField val UG = of("ug")

            @JvmField val UG_CN = of("ug-cn")

            @JvmField val UK = of("uk")

            @JvmField val UK_UA = of("uk-ua")

            @JvmField val UR = of("ur")

            @JvmField val UR_IN = of("ur-in")

            @JvmField val UR_PK = of("ur-pk")

            @JvmField val UZ = of("uz")

            @JvmField val UZ_AF = of("uz-af")

            @JvmField val UZ_UZ = of("uz-uz")

            @JvmField val VAI = of("vai")

            @JvmField val VAI_LR = of("vai-lr")

            @JvmField val VE = of("ve")

            @JvmField val VI = of("vi")

            @JvmField val VI_VN = of("vi-vn")

            @JvmField val VO = of("vo")

            @JvmField val VO_001 = of("vo-001")

            @JvmField val VUN = of("vun")

            @JvmField val VUN_TZ = of("vun-tz")

            @JvmField val WA = of("wa")

            @JvmField val WAE = of("wae")

            @JvmField val WAE_CH = of("wae-ch")

            @JvmField val WO = of("wo")

            @JvmField val WO_SN = of("wo-sn")

            @JvmField val XH = of("xh")

            @JvmField val XH_ZA = of("xh-za")

            @JvmField val XOG = of("xog")

            @JvmField val XOG_UG = of("xog-ug")

            @JvmField val YAV = of("yav")

            @JvmField val YAV_CM = of("yav-cm")

            @JvmField val YI = of("yi")

            @JvmField val YI_001 = of("yi-001")

            @JvmField val YO = of("yo")

            @JvmField val YO_BJ = of("yo-bj")

            @JvmField val YO_NG = of("yo-ng")

            @JvmField val YRL = of("yrl")

            @JvmField val YRL_BR = of("yrl-br")

            @JvmField val YRL_CO = of("yrl-co")

            @JvmField val YRL_VE = of("yrl-ve")

            @JvmField val YUE = of("yue")

            @JvmField val YUE_CN = of("yue-cn")

            @JvmField val YUE_HK = of("yue-hk")

            @JvmField val ZA = of("za")

            @JvmField val ZGH = of("zgh")

            @JvmField val ZGH_MA = of("zgh-ma")

            @JvmField val ZH = of("zh")

            @JvmField val ZH_CN = of("zh-cn")

            @JvmField val ZH_HANS = of("zh-hans")

            @JvmField val ZH_HANT = of("zh-hant")

            @JvmField val ZH_HK = of("zh-hk")

            @JvmField val ZH_MO = of("zh-mo")

            @JvmField val ZH_SG = of("zh-sg")

            @JvmField val ZH_TW = of("zh-tw")

            @JvmField val ZU = of("zu")

            @JvmField val ZU_ZA = of("zu-za")

            @JvmStatic fun of(value: String) = Language(JsonField.of(value))
        }

        /** An enum containing [Language]'s known values. */
        enum class Known {
            AA,
            AB,
            AE,
            AF,
            AF_NA,
            AF_ZA,
            AGQ,
            AGQ_CM,
            AK,
            AK_GH,
            AM,
            AM_ET,
            AN,
            ANN,
            ANN_NG,
            AR,
            AR_001,
            AR_AE,
            AR_BH,
            AR_DJ,
            AR_DZ,
            AR_EG,
            AR_EH,
            AR_ER,
            AR_IL,
            AR_IQ,
            AR_JO,
            AR_KM,
            AR_KW,
            AR_LB,
            AR_LY,
            AR_MA,
            AR_MR,
            AR_OM,
            AR_PS,
            AR_QA,
            AR_SA,
            AR_SD,
            AR_SO,
            AR_SS,
            AR_SY,
            AR_TD,
            AR_TN,
            AR_YE,
            AS,
            AS_IN,
            ASA,
            ASA_TZ,
            AST,
            AST_ES,
            AV,
            AY,
            AZ,
            AZ_AZ,
            BA,
            BAS,
            BAS_CM,
            BE,
            BE_BY,
            BEM,
            BEM_ZM,
            BEZ,
            BEZ_TZ,
            BG,
            BG_BG,
            BGC,
            BGC_IN,
            BHO,
            BHO_IN,
            BI,
            BM,
            BM_ML,
            BN,
            BN_BD,
            BN_IN,
            BO,
            BO_CN,
            BO_IN,
            BR,
            BR_FR,
            BRX,
            BRX_IN,
            BS,
            BS_BA,
            CA,
            CA_AD,
            CA_ES,
            CA_FR,
            CA_IT,
            CCP,
            CCP_BD,
            CCP_IN,
            CE,
            CE_RU,
            CEB,
            CEB_PH,
            CGG,
            CGG_UG,
            CH,
            CHR,
            CHR_US,
            CKB,
            CKB_IQ,
            CKB_IR,
            CO,
            CR,
            CS,
            CS_CZ,
            CU,
            CU_RU,
            CV,
            CV_RU,
            CY,
            CY_GB,
            DA,
            DA_DK,
            DA_GL,
            DAV,
            DAV_KE,
            DE,
            DE_AT,
            DE_BE,
            DE_CH,
            DE_DE,
            DE_GR,
            DE_IT,
            DE_LI,
            DE_LU,
            DJE,
            DJE_NE,
            DOI,
            DOI_IN,
            DSB,
            DSB_DE,
            DUA,
            DUA_CM,
            DV,
            DYO,
            DYO_SN,
            DZ,
            DZ_BT,
            EBU,
            EBU_KE,
            EE,
            EE_GH,
            EE_TG,
            EL,
            EL_CY,
            EL_GR,
            EN,
            EN_001,
            EN_150,
            EN_AE,
            EN_AG,
            EN_AI,
            EN_AS,
            EN_AT,
            EN_AU,
            EN_BB,
            EN_BE,
            EN_BI,
            EN_BM,
            EN_BS,
            EN_BW,
            EN_BZ,
            EN_CA,
            EN_CC,
            EN_CH,
            EN_CK,
            EN_CM,
            EN_CN,
            EN_CX,
            EN_CY,
            EN_DE,
            EN_DG,
            EN_DK,
            EN_DM,
            EN_EE,
            EN_EG,
            EN_ER,
            EN_ES,
            EN_FI,
            EN_FJ,
            EN_FK,
            EN_FM,
            EN_FR,
            EN_GB,
            EN_GD,
            EN_GG,
            EN_GH,
            EN_GI,
            EN_GM,
            EN_GU,
            EN_GY,
            EN_HK,
            EN_ID,
            EN_IE,
            EN_IL,
            EN_IM,
            EN_IN,
            EN_IO,
            EN_JE,
            EN_JM,
            EN_KE,
            EN_KI,
            EN_KN,
            EN_KY,
            EN_LC,
            EN_LR,
            EN_LS,
            EN_LU,
            EN_MG,
            EN_MH,
            EN_MO,
            EN_MP,
            EN_MS,
            EN_MT,
            EN_MU,
            EN_MV,
            EN_MW,
            EN_MX,
            EN_MY,
            EN_NA,
            EN_NF,
            EN_NG,
            EN_NL,
            EN_NR,
            EN_NU,
            EN_NZ,
            EN_PG,
            EN_PH,
            EN_PK,
            EN_PN,
            EN_PR,
            EN_PT,
            EN_PW,
            EN_RW,
            EN_SB,
            EN_SC,
            EN_SD,
            EN_SE,
            EN_SG,
            EN_SH,
            EN_SI,
            EN_SL,
            EN_SS,
            EN_SX,
            EN_SZ,
            EN_TC,
            EN_TH,
            EN_TK,
            EN_TN,
            EN_TO,
            EN_TT,
            EN_TV,
            EN_TZ,
            EN_UG,
            EN_UM,
            EN_US,
            EN_VC,
            EN_VG,
            EN_VI,
            EN_VN,
            EN_VU,
            EN_WS,
            EN_ZA,
            EN_ZM,
            EN_ZW,
            EO,
            EO_001,
            ES,
            ES_419,
            ES_AR,
            ES_BO,
            ES_BR,
            ES_BZ,
            ES_CL,
            ES_CO,
            ES_CR,
            ES_CU,
            ES_DO,
            ES_EA,
            ES_EC,
            ES_ES,
            ES_GQ,
            ES_GT,
            ES_HN,
            ES_IC,
            ES_MX,
            ES_NI,
            ES_PA,
            ES_PE,
            ES_PH,
            ES_PR,
            ES_PY,
            ES_SV,
            ES_US,
            ES_UY,
            ES_VE,
            ET,
            ET_EE,
            EU,
            EU_ES,
            EWO,
            EWO_CM,
            FA,
            FA_AF,
            FA_IR,
            FF,
            FF_BF,
            FF_CM,
            FF_GH,
            FF_GM,
            FF_GN,
            FF_GW,
            FF_LR,
            FF_MR,
            FF_NE,
            FF_NG,
            FF_SL,
            FF_SN,
            FI,
            FI_FI,
            FIL,
            FIL_PH,
            FJ,
            FO,
            FO_DK,
            FO_FO,
            FR,
            FR_BE,
            FR_BF,
            FR_BI,
            FR_BJ,
            FR_BL,
            FR_CA,
            FR_CD,
            FR_CF,
            FR_CG,
            FR_CH,
            FR_CI,
            FR_CM,
            FR_DJ,
            FR_DZ,
            FR_FR,
            FR_GA,
            FR_GF,
            FR_GN,
            FR_GP,
            FR_GQ,
            FR_HT,
            FR_KM,
            FR_LU,
            FR_MA,
            FR_MC,
            FR_MF,
            FR_MG,
            FR_ML,
            FR_MQ,
            FR_MR,
            FR_MU,
            FR_NC,
            FR_NE,
            FR_PF,
            FR_PM,
            FR_RE,
            FR_RW,
            FR_SC,
            FR_SN,
            FR_SY,
            FR_TD,
            FR_TG,
            FR_TN,
            FR_VU,
            FR_WF,
            FR_YT,
            FRR,
            FRR_DE,
            FUR,
            FUR_IT,
            FY,
            FY_NL,
            GA,
            GA_GB,
            GA_IE,
            GD,
            GD_GB,
            GL,
            GL_ES,
            GN,
            GSW,
            GSW_CH,
            GSW_FR,
            GSW_LI,
            GU,
            GU_IN,
            GUZ,
            GUZ_KE,
            GV,
            GV_IM,
            HA,
            HA_GH,
            HA_NE,
            HA_NG,
            HAW,
            HAW_US,
            HE,
            HE_IL,
            HI,
            HI_IN,
            HMN,
            HO,
            HR,
            HR_BA,
            HR_HR,
            HSB,
            HSB_DE,
            HT,
            HU,
            HU_HU,
            HY,
            HY_AM,
            HZ,
            IA,
            IA_001,
            ID,
            ID_ID,
            IE,
            IG,
            IG_NG,
            II,
            II_CN,
            IK,
            IO,
            IS,
            IS_IS,
            IT,
            IT_CH,
            IT_IT,
            IT_SM,
            IT_VA,
            IU,
            JA,
            JA_JP,
            JGO,
            JGO_CM,
            JMC,
            JMC_TZ,
            JV,
            JV_ID,
            KA,
            KA_GE,
            KAB,
            KAB_DZ,
            KAM,
            KAM_KE,
            KAR,
            KDE,
            KDE_TZ,
            KEA,
            KEA_CV,
            KG,
            KGP,
            KGP_BR,
            KH,
            KHQ,
            KHQ_ML,
            KI,
            KI_KE,
            KJ,
            KK,
            KK_KZ,
            KKJ,
            KKJ_CM,
            KL,
            KL_GL,
            KLN,
            KLN_KE,
            KM,
            KM_KH,
            KN,
            KN_IN,
            KO,
            KO_KP,
            KO_KR,
            KOK,
            KOK_IN,
            KR,
            KS,
            KS_IN,
            KSB,
            KSB_TZ,
            KSF,
            KSF_CM,
            KSH,
            KSH_DE,
            KU,
            KU_TR,
            KV,
            KW,
            KW_GB,
            KY,
            KY_KG,
            LA,
            LAG,
            LAG_TZ,
            LB,
            LB_LU,
            LG,
            LG_UG,
            LI,
            LKT,
            LKT_US,
            LN,
            LN_AO,
            LN_CD,
            LN_CF,
            LN_CG,
            LO,
            LO_LA,
            LRC,
            LRC_IQ,
            LRC_IR,
            LT,
            LT_LT,
            LU,
            LU_CD,
            LUO,
            LUO_KE,
            LUY,
            LUY_KE,
            LV,
            LV_LV,
            MAI,
            MAI_IN,
            MAS,
            MAS_KE,
            MAS_TZ,
            MDF,
            MDF_RU,
            MER,
            MER_KE,
            MFE,
            MFE_MU,
            MG,
            MG_MG,
            MGH,
            MGH_MZ,
            MGO,
            MGO_CM,
            MH,
            MI,
            MI_NZ,
            MK,
            MK_MK,
            ML,
            ML_IN,
            MN,
            MN_MN,
            MNI,
            MNI_IN,
            MR,
            MR_IN,
            MS,
            MS_BN,
            MS_ID,
            MS_MY,
            MS_SG,
            MT,
            MT_MT,
            MUA,
            MUA_CM,
            MY,
            MY_MM,
            MZN,
            MZN_IR,
            NA,
            NAQ,
            NAQ_NA,
            NB,
            NB_NO,
            NB_SJ,
            ND,
            ND_ZW,
            NDS,
            NDS_DE,
            NDS_NL,
            NE,
            NE_IN,
            NE_NP,
            NG,
            NL,
            NL_AW,
            NL_BE,
            NL_BQ,
            NL_CH,
            NL_CW,
            NL_LU,
            NL_NL,
            NL_SR,
            NL_SX,
            NMG,
            NMG_CM,
            NN,
            NN_NO,
            NNH,
            NNH_CM,
            NO,
            NO_NO,
            NR,
            NUS,
            NUS_SS,
            NV,
            NY,
            NYN,
            NYN_UG,
            OC,
            OC_ES,
            OC_FR,
            OJ,
            OM,
            OM_ET,
            OM_KE,
            OR,
            OR_IN,
            OS,
            OS_GE,
            OS_RU,
            PA,
            PA_IN,
            PA_PK,
            PCM,
            PCM_NG,
            PI,
            PIS,
            PIS_SB,
            PL,
            PL_PL,
            PRG,
            PRG_001,
            PS,
            PS_AF,
            PS_PK,
            PT,
            PT_AO,
            PT_BR,
            PT_CH,
            PT_CV,
            PT_GQ,
            PT_GW,
            PT_LU,
            PT_MO,
            PT_MZ,
            PT_PT,
            PT_ST,
            PT_TL,
            QU,
            QU_BO,
            QU_EC,
            QU_PE,
            RAJ,
            RAJ_IN,
            RM,
            RM_CH,
            RN,
            RN_BI,
            RO,
            RO_MD,
            RO_RO,
            ROF,
            ROF_TZ,
            RU,
            RU_BY,
            RU_KG,
            RU_KZ,
            RU_MD,
            RU_RU,
            RU_UA,
            RW,
            RW_RW,
            RWK,
            RWK_TZ,
            SA,
            SA_IN,
            SAH,
            SAH_RU,
            SAQ,
            SAQ_KE,
            SAT,
            SAT_IN,
            SBP,
            SBP_TZ,
            SC,
            SC_IT,
            SD,
            SD_IN,
            SD_PK,
            SE,
            SE_FI,
            SE_NO,
            SE_SE,
            SEH,
            SEH_MZ,
            SES,
            SES_ML,
            SG,
            SG_CF,
            SHI,
            SHI_MA,
            SI,
            SI_LK,
            SK,
            SK_SK,
            SL,
            SL_SI,
            SM,
            SMN,
            SMN_FI,
            SMS,
            SMS_FI,
            SN,
            SN_ZW,
            SO,
            SO_DJ,
            SO_ET,
            SO_KE,
            SO_SO,
            SQ,
            SQ_AL,
            SQ_MK,
            SQ_XK,
            SR,
            SR_BA,
            SR_CS,
            SR_ME,
            SR_RS,
            SR_XK,
            SS,
            ST,
            SU,
            SU_ID,
            SV,
            SV_AX,
            SV_FI,
            SV_SE,
            SW,
            SW_CD,
            SW_KE,
            SW_TZ,
            SW_UG,
            SY,
            TA,
            TA_IN,
            TA_LK,
            TA_MY,
            TA_SG,
            TE,
            TE_IN,
            TEO,
            TEO_KE,
            TEO_UG,
            TG,
            TG_TJ,
            TH,
            TH_TH,
            TI,
            TI_ER,
            TI_ET,
            TK,
            TK_TM,
            TL,
            TN,
            TO,
            TO_TO,
            TOK,
            TOK_001,
            TR,
            TR_CY,
            TR_TR,
            TS,
            TT,
            TT_RU,
            TW,
            TWQ,
            TWQ_NE,
            TY,
            TZM,
            TZM_MA,
            UG,
            UG_CN,
            UK,
            UK_UA,
            UR,
            UR_IN,
            UR_PK,
            UZ,
            UZ_AF,
            UZ_UZ,
            VAI,
            VAI_LR,
            VE,
            VI,
            VI_VN,
            VO,
            VO_001,
            VUN,
            VUN_TZ,
            WA,
            WAE,
            WAE_CH,
            WO,
            WO_SN,
            XH,
            XH_ZA,
            XOG,
            XOG_UG,
            YAV,
            YAV_CM,
            YI,
            YI_001,
            YO,
            YO_BJ,
            YO_NG,
            YRL,
            YRL_BR,
            YRL_CO,
            YRL_VE,
            YUE,
            YUE_CN,
            YUE_HK,
            ZA,
            ZGH,
            ZGH_MA,
            ZH,
            ZH_CN,
            ZH_HANS,
            ZH_HANT,
            ZH_HK,
            ZH_MO,
            ZH_SG,
            ZH_TW,
            ZU,
            ZU_ZA,
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
            AA,
            AB,
            AE,
            AF,
            AF_NA,
            AF_ZA,
            AGQ,
            AGQ_CM,
            AK,
            AK_GH,
            AM,
            AM_ET,
            AN,
            ANN,
            ANN_NG,
            AR,
            AR_001,
            AR_AE,
            AR_BH,
            AR_DJ,
            AR_DZ,
            AR_EG,
            AR_EH,
            AR_ER,
            AR_IL,
            AR_IQ,
            AR_JO,
            AR_KM,
            AR_KW,
            AR_LB,
            AR_LY,
            AR_MA,
            AR_MR,
            AR_OM,
            AR_PS,
            AR_QA,
            AR_SA,
            AR_SD,
            AR_SO,
            AR_SS,
            AR_SY,
            AR_TD,
            AR_TN,
            AR_YE,
            AS,
            AS_IN,
            ASA,
            ASA_TZ,
            AST,
            AST_ES,
            AV,
            AY,
            AZ,
            AZ_AZ,
            BA,
            BAS,
            BAS_CM,
            BE,
            BE_BY,
            BEM,
            BEM_ZM,
            BEZ,
            BEZ_TZ,
            BG,
            BG_BG,
            BGC,
            BGC_IN,
            BHO,
            BHO_IN,
            BI,
            BM,
            BM_ML,
            BN,
            BN_BD,
            BN_IN,
            BO,
            BO_CN,
            BO_IN,
            BR,
            BR_FR,
            BRX,
            BRX_IN,
            BS,
            BS_BA,
            CA,
            CA_AD,
            CA_ES,
            CA_FR,
            CA_IT,
            CCP,
            CCP_BD,
            CCP_IN,
            CE,
            CE_RU,
            CEB,
            CEB_PH,
            CGG,
            CGG_UG,
            CH,
            CHR,
            CHR_US,
            CKB,
            CKB_IQ,
            CKB_IR,
            CO,
            CR,
            CS,
            CS_CZ,
            CU,
            CU_RU,
            CV,
            CV_RU,
            CY,
            CY_GB,
            DA,
            DA_DK,
            DA_GL,
            DAV,
            DAV_KE,
            DE,
            DE_AT,
            DE_BE,
            DE_CH,
            DE_DE,
            DE_GR,
            DE_IT,
            DE_LI,
            DE_LU,
            DJE,
            DJE_NE,
            DOI,
            DOI_IN,
            DSB,
            DSB_DE,
            DUA,
            DUA_CM,
            DV,
            DYO,
            DYO_SN,
            DZ,
            DZ_BT,
            EBU,
            EBU_KE,
            EE,
            EE_GH,
            EE_TG,
            EL,
            EL_CY,
            EL_GR,
            EN,
            EN_001,
            EN_150,
            EN_AE,
            EN_AG,
            EN_AI,
            EN_AS,
            EN_AT,
            EN_AU,
            EN_BB,
            EN_BE,
            EN_BI,
            EN_BM,
            EN_BS,
            EN_BW,
            EN_BZ,
            EN_CA,
            EN_CC,
            EN_CH,
            EN_CK,
            EN_CM,
            EN_CN,
            EN_CX,
            EN_CY,
            EN_DE,
            EN_DG,
            EN_DK,
            EN_DM,
            EN_EE,
            EN_EG,
            EN_ER,
            EN_ES,
            EN_FI,
            EN_FJ,
            EN_FK,
            EN_FM,
            EN_FR,
            EN_GB,
            EN_GD,
            EN_GG,
            EN_GH,
            EN_GI,
            EN_GM,
            EN_GU,
            EN_GY,
            EN_HK,
            EN_ID,
            EN_IE,
            EN_IL,
            EN_IM,
            EN_IN,
            EN_IO,
            EN_JE,
            EN_JM,
            EN_KE,
            EN_KI,
            EN_KN,
            EN_KY,
            EN_LC,
            EN_LR,
            EN_LS,
            EN_LU,
            EN_MG,
            EN_MH,
            EN_MO,
            EN_MP,
            EN_MS,
            EN_MT,
            EN_MU,
            EN_MV,
            EN_MW,
            EN_MX,
            EN_MY,
            EN_NA,
            EN_NF,
            EN_NG,
            EN_NL,
            EN_NR,
            EN_NU,
            EN_NZ,
            EN_PG,
            EN_PH,
            EN_PK,
            EN_PN,
            EN_PR,
            EN_PT,
            EN_PW,
            EN_RW,
            EN_SB,
            EN_SC,
            EN_SD,
            EN_SE,
            EN_SG,
            EN_SH,
            EN_SI,
            EN_SL,
            EN_SS,
            EN_SX,
            EN_SZ,
            EN_TC,
            EN_TH,
            EN_TK,
            EN_TN,
            EN_TO,
            EN_TT,
            EN_TV,
            EN_TZ,
            EN_UG,
            EN_UM,
            EN_US,
            EN_VC,
            EN_VG,
            EN_VI,
            EN_VN,
            EN_VU,
            EN_WS,
            EN_ZA,
            EN_ZM,
            EN_ZW,
            EO,
            EO_001,
            ES,
            ES_419,
            ES_AR,
            ES_BO,
            ES_BR,
            ES_BZ,
            ES_CL,
            ES_CO,
            ES_CR,
            ES_CU,
            ES_DO,
            ES_EA,
            ES_EC,
            ES_ES,
            ES_GQ,
            ES_GT,
            ES_HN,
            ES_IC,
            ES_MX,
            ES_NI,
            ES_PA,
            ES_PE,
            ES_PH,
            ES_PR,
            ES_PY,
            ES_SV,
            ES_US,
            ES_UY,
            ES_VE,
            ET,
            ET_EE,
            EU,
            EU_ES,
            EWO,
            EWO_CM,
            FA,
            FA_AF,
            FA_IR,
            FF,
            FF_BF,
            FF_CM,
            FF_GH,
            FF_GM,
            FF_GN,
            FF_GW,
            FF_LR,
            FF_MR,
            FF_NE,
            FF_NG,
            FF_SL,
            FF_SN,
            FI,
            FI_FI,
            FIL,
            FIL_PH,
            FJ,
            FO,
            FO_DK,
            FO_FO,
            FR,
            FR_BE,
            FR_BF,
            FR_BI,
            FR_BJ,
            FR_BL,
            FR_CA,
            FR_CD,
            FR_CF,
            FR_CG,
            FR_CH,
            FR_CI,
            FR_CM,
            FR_DJ,
            FR_DZ,
            FR_FR,
            FR_GA,
            FR_GF,
            FR_GN,
            FR_GP,
            FR_GQ,
            FR_HT,
            FR_KM,
            FR_LU,
            FR_MA,
            FR_MC,
            FR_MF,
            FR_MG,
            FR_ML,
            FR_MQ,
            FR_MR,
            FR_MU,
            FR_NC,
            FR_NE,
            FR_PF,
            FR_PM,
            FR_RE,
            FR_RW,
            FR_SC,
            FR_SN,
            FR_SY,
            FR_TD,
            FR_TG,
            FR_TN,
            FR_VU,
            FR_WF,
            FR_YT,
            FRR,
            FRR_DE,
            FUR,
            FUR_IT,
            FY,
            FY_NL,
            GA,
            GA_GB,
            GA_IE,
            GD,
            GD_GB,
            GL,
            GL_ES,
            GN,
            GSW,
            GSW_CH,
            GSW_FR,
            GSW_LI,
            GU,
            GU_IN,
            GUZ,
            GUZ_KE,
            GV,
            GV_IM,
            HA,
            HA_GH,
            HA_NE,
            HA_NG,
            HAW,
            HAW_US,
            HE,
            HE_IL,
            HI,
            HI_IN,
            HMN,
            HO,
            HR,
            HR_BA,
            HR_HR,
            HSB,
            HSB_DE,
            HT,
            HU,
            HU_HU,
            HY,
            HY_AM,
            HZ,
            IA,
            IA_001,
            ID,
            ID_ID,
            IE,
            IG,
            IG_NG,
            II,
            II_CN,
            IK,
            IO,
            IS,
            IS_IS,
            IT,
            IT_CH,
            IT_IT,
            IT_SM,
            IT_VA,
            IU,
            JA,
            JA_JP,
            JGO,
            JGO_CM,
            JMC,
            JMC_TZ,
            JV,
            JV_ID,
            KA,
            KA_GE,
            KAB,
            KAB_DZ,
            KAM,
            KAM_KE,
            KAR,
            KDE,
            KDE_TZ,
            KEA,
            KEA_CV,
            KG,
            KGP,
            KGP_BR,
            KH,
            KHQ,
            KHQ_ML,
            KI,
            KI_KE,
            KJ,
            KK,
            KK_KZ,
            KKJ,
            KKJ_CM,
            KL,
            KL_GL,
            KLN,
            KLN_KE,
            KM,
            KM_KH,
            KN,
            KN_IN,
            KO,
            KO_KP,
            KO_KR,
            KOK,
            KOK_IN,
            KR,
            KS,
            KS_IN,
            KSB,
            KSB_TZ,
            KSF,
            KSF_CM,
            KSH,
            KSH_DE,
            KU,
            KU_TR,
            KV,
            KW,
            KW_GB,
            KY,
            KY_KG,
            LA,
            LAG,
            LAG_TZ,
            LB,
            LB_LU,
            LG,
            LG_UG,
            LI,
            LKT,
            LKT_US,
            LN,
            LN_AO,
            LN_CD,
            LN_CF,
            LN_CG,
            LO,
            LO_LA,
            LRC,
            LRC_IQ,
            LRC_IR,
            LT,
            LT_LT,
            LU,
            LU_CD,
            LUO,
            LUO_KE,
            LUY,
            LUY_KE,
            LV,
            LV_LV,
            MAI,
            MAI_IN,
            MAS,
            MAS_KE,
            MAS_TZ,
            MDF,
            MDF_RU,
            MER,
            MER_KE,
            MFE,
            MFE_MU,
            MG,
            MG_MG,
            MGH,
            MGH_MZ,
            MGO,
            MGO_CM,
            MH,
            MI,
            MI_NZ,
            MK,
            MK_MK,
            ML,
            ML_IN,
            MN,
            MN_MN,
            MNI,
            MNI_IN,
            MR,
            MR_IN,
            MS,
            MS_BN,
            MS_ID,
            MS_MY,
            MS_SG,
            MT,
            MT_MT,
            MUA,
            MUA_CM,
            MY,
            MY_MM,
            MZN,
            MZN_IR,
            NA,
            NAQ,
            NAQ_NA,
            NB,
            NB_NO,
            NB_SJ,
            ND,
            ND_ZW,
            NDS,
            NDS_DE,
            NDS_NL,
            NE,
            NE_IN,
            NE_NP,
            NG,
            NL,
            NL_AW,
            NL_BE,
            NL_BQ,
            NL_CH,
            NL_CW,
            NL_LU,
            NL_NL,
            NL_SR,
            NL_SX,
            NMG,
            NMG_CM,
            NN,
            NN_NO,
            NNH,
            NNH_CM,
            NO,
            NO_NO,
            NR,
            NUS,
            NUS_SS,
            NV,
            NY,
            NYN,
            NYN_UG,
            OC,
            OC_ES,
            OC_FR,
            OJ,
            OM,
            OM_ET,
            OM_KE,
            OR,
            OR_IN,
            OS,
            OS_GE,
            OS_RU,
            PA,
            PA_IN,
            PA_PK,
            PCM,
            PCM_NG,
            PI,
            PIS,
            PIS_SB,
            PL,
            PL_PL,
            PRG,
            PRG_001,
            PS,
            PS_AF,
            PS_PK,
            PT,
            PT_AO,
            PT_BR,
            PT_CH,
            PT_CV,
            PT_GQ,
            PT_GW,
            PT_LU,
            PT_MO,
            PT_MZ,
            PT_PT,
            PT_ST,
            PT_TL,
            QU,
            QU_BO,
            QU_EC,
            QU_PE,
            RAJ,
            RAJ_IN,
            RM,
            RM_CH,
            RN,
            RN_BI,
            RO,
            RO_MD,
            RO_RO,
            ROF,
            ROF_TZ,
            RU,
            RU_BY,
            RU_KG,
            RU_KZ,
            RU_MD,
            RU_RU,
            RU_UA,
            RW,
            RW_RW,
            RWK,
            RWK_TZ,
            SA,
            SA_IN,
            SAH,
            SAH_RU,
            SAQ,
            SAQ_KE,
            SAT,
            SAT_IN,
            SBP,
            SBP_TZ,
            SC,
            SC_IT,
            SD,
            SD_IN,
            SD_PK,
            SE,
            SE_FI,
            SE_NO,
            SE_SE,
            SEH,
            SEH_MZ,
            SES,
            SES_ML,
            SG,
            SG_CF,
            SHI,
            SHI_MA,
            SI,
            SI_LK,
            SK,
            SK_SK,
            SL,
            SL_SI,
            SM,
            SMN,
            SMN_FI,
            SMS,
            SMS_FI,
            SN,
            SN_ZW,
            SO,
            SO_DJ,
            SO_ET,
            SO_KE,
            SO_SO,
            SQ,
            SQ_AL,
            SQ_MK,
            SQ_XK,
            SR,
            SR_BA,
            SR_CS,
            SR_ME,
            SR_RS,
            SR_XK,
            SS,
            ST,
            SU,
            SU_ID,
            SV,
            SV_AX,
            SV_FI,
            SV_SE,
            SW,
            SW_CD,
            SW_KE,
            SW_TZ,
            SW_UG,
            SY,
            TA,
            TA_IN,
            TA_LK,
            TA_MY,
            TA_SG,
            TE,
            TE_IN,
            TEO,
            TEO_KE,
            TEO_UG,
            TG,
            TG_TJ,
            TH,
            TH_TH,
            TI,
            TI_ER,
            TI_ET,
            TK,
            TK_TM,
            TL,
            TN,
            TO,
            TO_TO,
            TOK,
            TOK_001,
            TR,
            TR_CY,
            TR_TR,
            TS,
            TT,
            TT_RU,
            TW,
            TWQ,
            TWQ_NE,
            TY,
            TZM,
            TZM_MA,
            UG,
            UG_CN,
            UK,
            UK_UA,
            UR,
            UR_IN,
            UR_PK,
            UZ,
            UZ_AF,
            UZ_UZ,
            VAI,
            VAI_LR,
            VE,
            VI,
            VI_VN,
            VO,
            VO_001,
            VUN,
            VUN_TZ,
            WA,
            WAE,
            WAE_CH,
            WO,
            WO_SN,
            XH,
            XH_ZA,
            XOG,
            XOG_UG,
            YAV,
            YAV_CM,
            YI,
            YI_001,
            YO,
            YO_BJ,
            YO_NG,
            YRL,
            YRL_BR,
            YRL_CO,
            YRL_VE,
            YUE,
            YUE_CN,
            YUE_HK,
            ZA,
            ZGH,
            ZGH_MA,
            ZH,
            ZH_CN,
            ZH_HANS,
            ZH_HANT,
            ZH_HK,
            ZH_MO,
            ZH_SG,
            ZH_TW,
            ZU,
            ZU_ZA,
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
                AA -> Value.AA
                AB -> Value.AB
                AE -> Value.AE
                AF -> Value.AF
                AF_NA -> Value.AF_NA
                AF_ZA -> Value.AF_ZA
                AGQ -> Value.AGQ
                AGQ_CM -> Value.AGQ_CM
                AK -> Value.AK
                AK_GH -> Value.AK_GH
                AM -> Value.AM
                AM_ET -> Value.AM_ET
                AN -> Value.AN
                ANN -> Value.ANN
                ANN_NG -> Value.ANN_NG
                AR -> Value.AR
                AR_001 -> Value.AR_001
                AR_AE -> Value.AR_AE
                AR_BH -> Value.AR_BH
                AR_DJ -> Value.AR_DJ
                AR_DZ -> Value.AR_DZ
                AR_EG -> Value.AR_EG
                AR_EH -> Value.AR_EH
                AR_ER -> Value.AR_ER
                AR_IL -> Value.AR_IL
                AR_IQ -> Value.AR_IQ
                AR_JO -> Value.AR_JO
                AR_KM -> Value.AR_KM
                AR_KW -> Value.AR_KW
                AR_LB -> Value.AR_LB
                AR_LY -> Value.AR_LY
                AR_MA -> Value.AR_MA
                AR_MR -> Value.AR_MR
                AR_OM -> Value.AR_OM
                AR_PS -> Value.AR_PS
                AR_QA -> Value.AR_QA
                AR_SA -> Value.AR_SA
                AR_SD -> Value.AR_SD
                AR_SO -> Value.AR_SO
                AR_SS -> Value.AR_SS
                AR_SY -> Value.AR_SY
                AR_TD -> Value.AR_TD
                AR_TN -> Value.AR_TN
                AR_YE -> Value.AR_YE
                AS -> Value.AS
                AS_IN -> Value.AS_IN
                ASA -> Value.ASA
                ASA_TZ -> Value.ASA_TZ
                AST -> Value.AST
                AST_ES -> Value.AST_ES
                AV -> Value.AV
                AY -> Value.AY
                AZ -> Value.AZ
                AZ_AZ -> Value.AZ_AZ
                BA -> Value.BA
                BAS -> Value.BAS
                BAS_CM -> Value.BAS_CM
                BE -> Value.BE
                BE_BY -> Value.BE_BY
                BEM -> Value.BEM
                BEM_ZM -> Value.BEM_ZM
                BEZ -> Value.BEZ
                BEZ_TZ -> Value.BEZ_TZ
                BG -> Value.BG
                BG_BG -> Value.BG_BG
                BGC -> Value.BGC
                BGC_IN -> Value.BGC_IN
                BHO -> Value.BHO
                BHO_IN -> Value.BHO_IN
                BI -> Value.BI
                BM -> Value.BM
                BM_ML -> Value.BM_ML
                BN -> Value.BN
                BN_BD -> Value.BN_BD
                BN_IN -> Value.BN_IN
                BO -> Value.BO
                BO_CN -> Value.BO_CN
                BO_IN -> Value.BO_IN
                BR -> Value.BR
                BR_FR -> Value.BR_FR
                BRX -> Value.BRX
                BRX_IN -> Value.BRX_IN
                BS -> Value.BS
                BS_BA -> Value.BS_BA
                CA -> Value.CA
                CA_AD -> Value.CA_AD
                CA_ES -> Value.CA_ES
                CA_FR -> Value.CA_FR
                CA_IT -> Value.CA_IT
                CCP -> Value.CCP
                CCP_BD -> Value.CCP_BD
                CCP_IN -> Value.CCP_IN
                CE -> Value.CE
                CE_RU -> Value.CE_RU
                CEB -> Value.CEB
                CEB_PH -> Value.CEB_PH
                CGG -> Value.CGG
                CGG_UG -> Value.CGG_UG
                CH -> Value.CH
                CHR -> Value.CHR
                CHR_US -> Value.CHR_US
                CKB -> Value.CKB
                CKB_IQ -> Value.CKB_IQ
                CKB_IR -> Value.CKB_IR
                CO -> Value.CO
                CR -> Value.CR
                CS -> Value.CS
                CS_CZ -> Value.CS_CZ
                CU -> Value.CU
                CU_RU -> Value.CU_RU
                CV -> Value.CV
                CV_RU -> Value.CV_RU
                CY -> Value.CY
                CY_GB -> Value.CY_GB
                DA -> Value.DA
                DA_DK -> Value.DA_DK
                DA_GL -> Value.DA_GL
                DAV -> Value.DAV
                DAV_KE -> Value.DAV_KE
                DE -> Value.DE
                DE_AT -> Value.DE_AT
                DE_BE -> Value.DE_BE
                DE_CH -> Value.DE_CH
                DE_DE -> Value.DE_DE
                DE_GR -> Value.DE_GR
                DE_IT -> Value.DE_IT
                DE_LI -> Value.DE_LI
                DE_LU -> Value.DE_LU
                DJE -> Value.DJE
                DJE_NE -> Value.DJE_NE
                DOI -> Value.DOI
                DOI_IN -> Value.DOI_IN
                DSB -> Value.DSB
                DSB_DE -> Value.DSB_DE
                DUA -> Value.DUA
                DUA_CM -> Value.DUA_CM
                DV -> Value.DV
                DYO -> Value.DYO
                DYO_SN -> Value.DYO_SN
                DZ -> Value.DZ
                DZ_BT -> Value.DZ_BT
                EBU -> Value.EBU
                EBU_KE -> Value.EBU_KE
                EE -> Value.EE
                EE_GH -> Value.EE_GH
                EE_TG -> Value.EE_TG
                EL -> Value.EL
                EL_CY -> Value.EL_CY
                EL_GR -> Value.EL_GR
                EN -> Value.EN
                EN_001 -> Value.EN_001
                EN_150 -> Value.EN_150
                EN_AE -> Value.EN_AE
                EN_AG -> Value.EN_AG
                EN_AI -> Value.EN_AI
                EN_AS -> Value.EN_AS
                EN_AT -> Value.EN_AT
                EN_AU -> Value.EN_AU
                EN_BB -> Value.EN_BB
                EN_BE -> Value.EN_BE
                EN_BI -> Value.EN_BI
                EN_BM -> Value.EN_BM
                EN_BS -> Value.EN_BS
                EN_BW -> Value.EN_BW
                EN_BZ -> Value.EN_BZ
                EN_CA -> Value.EN_CA
                EN_CC -> Value.EN_CC
                EN_CH -> Value.EN_CH
                EN_CK -> Value.EN_CK
                EN_CM -> Value.EN_CM
                EN_CN -> Value.EN_CN
                EN_CX -> Value.EN_CX
                EN_CY -> Value.EN_CY
                EN_DE -> Value.EN_DE
                EN_DG -> Value.EN_DG
                EN_DK -> Value.EN_DK
                EN_DM -> Value.EN_DM
                EN_EE -> Value.EN_EE
                EN_EG -> Value.EN_EG
                EN_ER -> Value.EN_ER
                EN_ES -> Value.EN_ES
                EN_FI -> Value.EN_FI
                EN_FJ -> Value.EN_FJ
                EN_FK -> Value.EN_FK
                EN_FM -> Value.EN_FM
                EN_FR -> Value.EN_FR
                EN_GB -> Value.EN_GB
                EN_GD -> Value.EN_GD
                EN_GG -> Value.EN_GG
                EN_GH -> Value.EN_GH
                EN_GI -> Value.EN_GI
                EN_GM -> Value.EN_GM
                EN_GU -> Value.EN_GU
                EN_GY -> Value.EN_GY
                EN_HK -> Value.EN_HK
                EN_ID -> Value.EN_ID
                EN_IE -> Value.EN_IE
                EN_IL -> Value.EN_IL
                EN_IM -> Value.EN_IM
                EN_IN -> Value.EN_IN
                EN_IO -> Value.EN_IO
                EN_JE -> Value.EN_JE
                EN_JM -> Value.EN_JM
                EN_KE -> Value.EN_KE
                EN_KI -> Value.EN_KI
                EN_KN -> Value.EN_KN
                EN_KY -> Value.EN_KY
                EN_LC -> Value.EN_LC
                EN_LR -> Value.EN_LR
                EN_LS -> Value.EN_LS
                EN_LU -> Value.EN_LU
                EN_MG -> Value.EN_MG
                EN_MH -> Value.EN_MH
                EN_MO -> Value.EN_MO
                EN_MP -> Value.EN_MP
                EN_MS -> Value.EN_MS
                EN_MT -> Value.EN_MT
                EN_MU -> Value.EN_MU
                EN_MV -> Value.EN_MV
                EN_MW -> Value.EN_MW
                EN_MX -> Value.EN_MX
                EN_MY -> Value.EN_MY
                EN_NA -> Value.EN_NA
                EN_NF -> Value.EN_NF
                EN_NG -> Value.EN_NG
                EN_NL -> Value.EN_NL
                EN_NR -> Value.EN_NR
                EN_NU -> Value.EN_NU
                EN_NZ -> Value.EN_NZ
                EN_PG -> Value.EN_PG
                EN_PH -> Value.EN_PH
                EN_PK -> Value.EN_PK
                EN_PN -> Value.EN_PN
                EN_PR -> Value.EN_PR
                EN_PT -> Value.EN_PT
                EN_PW -> Value.EN_PW
                EN_RW -> Value.EN_RW
                EN_SB -> Value.EN_SB
                EN_SC -> Value.EN_SC
                EN_SD -> Value.EN_SD
                EN_SE -> Value.EN_SE
                EN_SG -> Value.EN_SG
                EN_SH -> Value.EN_SH
                EN_SI -> Value.EN_SI
                EN_SL -> Value.EN_SL
                EN_SS -> Value.EN_SS
                EN_SX -> Value.EN_SX
                EN_SZ -> Value.EN_SZ
                EN_TC -> Value.EN_TC
                EN_TH -> Value.EN_TH
                EN_TK -> Value.EN_TK
                EN_TN -> Value.EN_TN
                EN_TO -> Value.EN_TO
                EN_TT -> Value.EN_TT
                EN_TV -> Value.EN_TV
                EN_TZ -> Value.EN_TZ
                EN_UG -> Value.EN_UG
                EN_UM -> Value.EN_UM
                EN_US -> Value.EN_US
                EN_VC -> Value.EN_VC
                EN_VG -> Value.EN_VG
                EN_VI -> Value.EN_VI
                EN_VN -> Value.EN_VN
                EN_VU -> Value.EN_VU
                EN_WS -> Value.EN_WS
                EN_ZA -> Value.EN_ZA
                EN_ZM -> Value.EN_ZM
                EN_ZW -> Value.EN_ZW
                EO -> Value.EO
                EO_001 -> Value.EO_001
                ES -> Value.ES
                ES_419 -> Value.ES_419
                ES_AR -> Value.ES_AR
                ES_BO -> Value.ES_BO
                ES_BR -> Value.ES_BR
                ES_BZ -> Value.ES_BZ
                ES_CL -> Value.ES_CL
                ES_CO -> Value.ES_CO
                ES_CR -> Value.ES_CR
                ES_CU -> Value.ES_CU
                ES_DO -> Value.ES_DO
                ES_EA -> Value.ES_EA
                ES_EC -> Value.ES_EC
                ES_ES -> Value.ES_ES
                ES_GQ -> Value.ES_GQ
                ES_GT -> Value.ES_GT
                ES_HN -> Value.ES_HN
                ES_IC -> Value.ES_IC
                ES_MX -> Value.ES_MX
                ES_NI -> Value.ES_NI
                ES_PA -> Value.ES_PA
                ES_PE -> Value.ES_PE
                ES_PH -> Value.ES_PH
                ES_PR -> Value.ES_PR
                ES_PY -> Value.ES_PY
                ES_SV -> Value.ES_SV
                ES_US -> Value.ES_US
                ES_UY -> Value.ES_UY
                ES_VE -> Value.ES_VE
                ET -> Value.ET
                ET_EE -> Value.ET_EE
                EU -> Value.EU
                EU_ES -> Value.EU_ES
                EWO -> Value.EWO
                EWO_CM -> Value.EWO_CM
                FA -> Value.FA
                FA_AF -> Value.FA_AF
                FA_IR -> Value.FA_IR
                FF -> Value.FF
                FF_BF -> Value.FF_BF
                FF_CM -> Value.FF_CM
                FF_GH -> Value.FF_GH
                FF_GM -> Value.FF_GM
                FF_GN -> Value.FF_GN
                FF_GW -> Value.FF_GW
                FF_LR -> Value.FF_LR
                FF_MR -> Value.FF_MR
                FF_NE -> Value.FF_NE
                FF_NG -> Value.FF_NG
                FF_SL -> Value.FF_SL
                FF_SN -> Value.FF_SN
                FI -> Value.FI
                FI_FI -> Value.FI_FI
                FIL -> Value.FIL
                FIL_PH -> Value.FIL_PH
                FJ -> Value.FJ
                FO -> Value.FO
                FO_DK -> Value.FO_DK
                FO_FO -> Value.FO_FO
                FR -> Value.FR
                FR_BE -> Value.FR_BE
                FR_BF -> Value.FR_BF
                FR_BI -> Value.FR_BI
                FR_BJ -> Value.FR_BJ
                FR_BL -> Value.FR_BL
                FR_CA -> Value.FR_CA
                FR_CD -> Value.FR_CD
                FR_CF -> Value.FR_CF
                FR_CG -> Value.FR_CG
                FR_CH -> Value.FR_CH
                FR_CI -> Value.FR_CI
                FR_CM -> Value.FR_CM
                FR_DJ -> Value.FR_DJ
                FR_DZ -> Value.FR_DZ
                FR_FR -> Value.FR_FR
                FR_GA -> Value.FR_GA
                FR_GF -> Value.FR_GF
                FR_GN -> Value.FR_GN
                FR_GP -> Value.FR_GP
                FR_GQ -> Value.FR_GQ
                FR_HT -> Value.FR_HT
                FR_KM -> Value.FR_KM
                FR_LU -> Value.FR_LU
                FR_MA -> Value.FR_MA
                FR_MC -> Value.FR_MC
                FR_MF -> Value.FR_MF
                FR_MG -> Value.FR_MG
                FR_ML -> Value.FR_ML
                FR_MQ -> Value.FR_MQ
                FR_MR -> Value.FR_MR
                FR_MU -> Value.FR_MU
                FR_NC -> Value.FR_NC
                FR_NE -> Value.FR_NE
                FR_PF -> Value.FR_PF
                FR_PM -> Value.FR_PM
                FR_RE -> Value.FR_RE
                FR_RW -> Value.FR_RW
                FR_SC -> Value.FR_SC
                FR_SN -> Value.FR_SN
                FR_SY -> Value.FR_SY
                FR_TD -> Value.FR_TD
                FR_TG -> Value.FR_TG
                FR_TN -> Value.FR_TN
                FR_VU -> Value.FR_VU
                FR_WF -> Value.FR_WF
                FR_YT -> Value.FR_YT
                FRR -> Value.FRR
                FRR_DE -> Value.FRR_DE
                FUR -> Value.FUR
                FUR_IT -> Value.FUR_IT
                FY -> Value.FY
                FY_NL -> Value.FY_NL
                GA -> Value.GA
                GA_GB -> Value.GA_GB
                GA_IE -> Value.GA_IE
                GD -> Value.GD
                GD_GB -> Value.GD_GB
                GL -> Value.GL
                GL_ES -> Value.GL_ES
                GN -> Value.GN
                GSW -> Value.GSW
                GSW_CH -> Value.GSW_CH
                GSW_FR -> Value.GSW_FR
                GSW_LI -> Value.GSW_LI
                GU -> Value.GU
                GU_IN -> Value.GU_IN
                GUZ -> Value.GUZ
                GUZ_KE -> Value.GUZ_KE
                GV -> Value.GV
                GV_IM -> Value.GV_IM
                HA -> Value.HA
                HA_GH -> Value.HA_GH
                HA_NE -> Value.HA_NE
                HA_NG -> Value.HA_NG
                HAW -> Value.HAW
                HAW_US -> Value.HAW_US
                HE -> Value.HE
                HE_IL -> Value.HE_IL
                HI -> Value.HI
                HI_IN -> Value.HI_IN
                HMN -> Value.HMN
                HO -> Value.HO
                HR -> Value.HR
                HR_BA -> Value.HR_BA
                HR_HR -> Value.HR_HR
                HSB -> Value.HSB
                HSB_DE -> Value.HSB_DE
                HT -> Value.HT
                HU -> Value.HU
                HU_HU -> Value.HU_HU
                HY -> Value.HY
                HY_AM -> Value.HY_AM
                HZ -> Value.HZ
                IA -> Value.IA
                IA_001 -> Value.IA_001
                ID -> Value.ID
                ID_ID -> Value.ID_ID
                IE -> Value.IE
                IG -> Value.IG
                IG_NG -> Value.IG_NG
                II -> Value.II
                II_CN -> Value.II_CN
                IK -> Value.IK
                IO -> Value.IO
                IS -> Value.IS
                IS_IS -> Value.IS_IS
                IT -> Value.IT
                IT_CH -> Value.IT_CH
                IT_IT -> Value.IT_IT
                IT_SM -> Value.IT_SM
                IT_VA -> Value.IT_VA
                IU -> Value.IU
                JA -> Value.JA
                JA_JP -> Value.JA_JP
                JGO -> Value.JGO
                JGO_CM -> Value.JGO_CM
                JMC -> Value.JMC
                JMC_TZ -> Value.JMC_TZ
                JV -> Value.JV
                JV_ID -> Value.JV_ID
                KA -> Value.KA
                KA_GE -> Value.KA_GE
                KAB -> Value.KAB
                KAB_DZ -> Value.KAB_DZ
                KAM -> Value.KAM
                KAM_KE -> Value.KAM_KE
                KAR -> Value.KAR
                KDE -> Value.KDE
                KDE_TZ -> Value.KDE_TZ
                KEA -> Value.KEA
                KEA_CV -> Value.KEA_CV
                KG -> Value.KG
                KGP -> Value.KGP
                KGP_BR -> Value.KGP_BR
                KH -> Value.KH
                KHQ -> Value.KHQ
                KHQ_ML -> Value.KHQ_ML
                KI -> Value.KI
                KI_KE -> Value.KI_KE
                KJ -> Value.KJ
                KK -> Value.KK
                KK_KZ -> Value.KK_KZ
                KKJ -> Value.KKJ
                KKJ_CM -> Value.KKJ_CM
                KL -> Value.KL
                KL_GL -> Value.KL_GL
                KLN -> Value.KLN
                KLN_KE -> Value.KLN_KE
                KM -> Value.KM
                KM_KH -> Value.KM_KH
                KN -> Value.KN
                KN_IN -> Value.KN_IN
                KO -> Value.KO
                KO_KP -> Value.KO_KP
                KO_KR -> Value.KO_KR
                KOK -> Value.KOK
                KOK_IN -> Value.KOK_IN
                KR -> Value.KR
                KS -> Value.KS
                KS_IN -> Value.KS_IN
                KSB -> Value.KSB
                KSB_TZ -> Value.KSB_TZ
                KSF -> Value.KSF
                KSF_CM -> Value.KSF_CM
                KSH -> Value.KSH
                KSH_DE -> Value.KSH_DE
                KU -> Value.KU
                KU_TR -> Value.KU_TR
                KV -> Value.KV
                KW -> Value.KW
                KW_GB -> Value.KW_GB
                KY -> Value.KY
                KY_KG -> Value.KY_KG
                LA -> Value.LA
                LAG -> Value.LAG
                LAG_TZ -> Value.LAG_TZ
                LB -> Value.LB
                LB_LU -> Value.LB_LU
                LG -> Value.LG
                LG_UG -> Value.LG_UG
                LI -> Value.LI
                LKT -> Value.LKT
                LKT_US -> Value.LKT_US
                LN -> Value.LN
                LN_AO -> Value.LN_AO
                LN_CD -> Value.LN_CD
                LN_CF -> Value.LN_CF
                LN_CG -> Value.LN_CG
                LO -> Value.LO
                LO_LA -> Value.LO_LA
                LRC -> Value.LRC
                LRC_IQ -> Value.LRC_IQ
                LRC_IR -> Value.LRC_IR
                LT -> Value.LT
                LT_LT -> Value.LT_LT
                LU -> Value.LU
                LU_CD -> Value.LU_CD
                LUO -> Value.LUO
                LUO_KE -> Value.LUO_KE
                LUY -> Value.LUY
                LUY_KE -> Value.LUY_KE
                LV -> Value.LV
                LV_LV -> Value.LV_LV
                MAI -> Value.MAI
                MAI_IN -> Value.MAI_IN
                MAS -> Value.MAS
                MAS_KE -> Value.MAS_KE
                MAS_TZ -> Value.MAS_TZ
                MDF -> Value.MDF
                MDF_RU -> Value.MDF_RU
                MER -> Value.MER
                MER_KE -> Value.MER_KE
                MFE -> Value.MFE
                MFE_MU -> Value.MFE_MU
                MG -> Value.MG
                MG_MG -> Value.MG_MG
                MGH -> Value.MGH
                MGH_MZ -> Value.MGH_MZ
                MGO -> Value.MGO
                MGO_CM -> Value.MGO_CM
                MH -> Value.MH
                MI -> Value.MI
                MI_NZ -> Value.MI_NZ
                MK -> Value.MK
                MK_MK -> Value.MK_MK
                ML -> Value.ML
                ML_IN -> Value.ML_IN
                MN -> Value.MN
                MN_MN -> Value.MN_MN
                MNI -> Value.MNI
                MNI_IN -> Value.MNI_IN
                MR -> Value.MR
                MR_IN -> Value.MR_IN
                MS -> Value.MS
                MS_BN -> Value.MS_BN
                MS_ID -> Value.MS_ID
                MS_MY -> Value.MS_MY
                MS_SG -> Value.MS_SG
                MT -> Value.MT
                MT_MT -> Value.MT_MT
                MUA -> Value.MUA
                MUA_CM -> Value.MUA_CM
                MY -> Value.MY
                MY_MM -> Value.MY_MM
                MZN -> Value.MZN
                MZN_IR -> Value.MZN_IR
                NA -> Value.NA
                NAQ -> Value.NAQ
                NAQ_NA -> Value.NAQ_NA
                NB -> Value.NB
                NB_NO -> Value.NB_NO
                NB_SJ -> Value.NB_SJ
                ND -> Value.ND
                ND_ZW -> Value.ND_ZW
                NDS -> Value.NDS
                NDS_DE -> Value.NDS_DE
                NDS_NL -> Value.NDS_NL
                NE -> Value.NE
                NE_IN -> Value.NE_IN
                NE_NP -> Value.NE_NP
                NG -> Value.NG
                NL -> Value.NL
                NL_AW -> Value.NL_AW
                NL_BE -> Value.NL_BE
                NL_BQ -> Value.NL_BQ
                NL_CH -> Value.NL_CH
                NL_CW -> Value.NL_CW
                NL_LU -> Value.NL_LU
                NL_NL -> Value.NL_NL
                NL_SR -> Value.NL_SR
                NL_SX -> Value.NL_SX
                NMG -> Value.NMG
                NMG_CM -> Value.NMG_CM
                NN -> Value.NN
                NN_NO -> Value.NN_NO
                NNH -> Value.NNH
                NNH_CM -> Value.NNH_CM
                NO -> Value.NO
                NO_NO -> Value.NO_NO
                NR -> Value.NR
                NUS -> Value.NUS
                NUS_SS -> Value.NUS_SS
                NV -> Value.NV
                NY -> Value.NY
                NYN -> Value.NYN
                NYN_UG -> Value.NYN_UG
                OC -> Value.OC
                OC_ES -> Value.OC_ES
                OC_FR -> Value.OC_FR
                OJ -> Value.OJ
                OM -> Value.OM
                OM_ET -> Value.OM_ET
                OM_KE -> Value.OM_KE
                OR -> Value.OR
                OR_IN -> Value.OR_IN
                OS -> Value.OS
                OS_GE -> Value.OS_GE
                OS_RU -> Value.OS_RU
                PA -> Value.PA
                PA_IN -> Value.PA_IN
                PA_PK -> Value.PA_PK
                PCM -> Value.PCM
                PCM_NG -> Value.PCM_NG
                PI -> Value.PI
                PIS -> Value.PIS
                PIS_SB -> Value.PIS_SB
                PL -> Value.PL
                PL_PL -> Value.PL_PL
                PRG -> Value.PRG
                PRG_001 -> Value.PRG_001
                PS -> Value.PS
                PS_AF -> Value.PS_AF
                PS_PK -> Value.PS_PK
                PT -> Value.PT
                PT_AO -> Value.PT_AO
                PT_BR -> Value.PT_BR
                PT_CH -> Value.PT_CH
                PT_CV -> Value.PT_CV
                PT_GQ -> Value.PT_GQ
                PT_GW -> Value.PT_GW
                PT_LU -> Value.PT_LU
                PT_MO -> Value.PT_MO
                PT_MZ -> Value.PT_MZ
                PT_PT -> Value.PT_PT
                PT_ST -> Value.PT_ST
                PT_TL -> Value.PT_TL
                QU -> Value.QU
                QU_BO -> Value.QU_BO
                QU_EC -> Value.QU_EC
                QU_PE -> Value.QU_PE
                RAJ -> Value.RAJ
                RAJ_IN -> Value.RAJ_IN
                RM -> Value.RM
                RM_CH -> Value.RM_CH
                RN -> Value.RN
                RN_BI -> Value.RN_BI
                RO -> Value.RO
                RO_MD -> Value.RO_MD
                RO_RO -> Value.RO_RO
                ROF -> Value.ROF
                ROF_TZ -> Value.ROF_TZ
                RU -> Value.RU
                RU_BY -> Value.RU_BY
                RU_KG -> Value.RU_KG
                RU_KZ -> Value.RU_KZ
                RU_MD -> Value.RU_MD
                RU_RU -> Value.RU_RU
                RU_UA -> Value.RU_UA
                RW -> Value.RW
                RW_RW -> Value.RW_RW
                RWK -> Value.RWK
                RWK_TZ -> Value.RWK_TZ
                SA -> Value.SA
                SA_IN -> Value.SA_IN
                SAH -> Value.SAH
                SAH_RU -> Value.SAH_RU
                SAQ -> Value.SAQ
                SAQ_KE -> Value.SAQ_KE
                SAT -> Value.SAT
                SAT_IN -> Value.SAT_IN
                SBP -> Value.SBP
                SBP_TZ -> Value.SBP_TZ
                SC -> Value.SC
                SC_IT -> Value.SC_IT
                SD -> Value.SD
                SD_IN -> Value.SD_IN
                SD_PK -> Value.SD_PK
                SE -> Value.SE
                SE_FI -> Value.SE_FI
                SE_NO -> Value.SE_NO
                SE_SE -> Value.SE_SE
                SEH -> Value.SEH
                SEH_MZ -> Value.SEH_MZ
                SES -> Value.SES
                SES_ML -> Value.SES_ML
                SG -> Value.SG
                SG_CF -> Value.SG_CF
                SHI -> Value.SHI
                SHI_MA -> Value.SHI_MA
                SI -> Value.SI
                SI_LK -> Value.SI_LK
                SK -> Value.SK
                SK_SK -> Value.SK_SK
                SL -> Value.SL
                SL_SI -> Value.SL_SI
                SM -> Value.SM
                SMN -> Value.SMN
                SMN_FI -> Value.SMN_FI
                SMS -> Value.SMS
                SMS_FI -> Value.SMS_FI
                SN -> Value.SN
                SN_ZW -> Value.SN_ZW
                SO -> Value.SO
                SO_DJ -> Value.SO_DJ
                SO_ET -> Value.SO_ET
                SO_KE -> Value.SO_KE
                SO_SO -> Value.SO_SO
                SQ -> Value.SQ
                SQ_AL -> Value.SQ_AL
                SQ_MK -> Value.SQ_MK
                SQ_XK -> Value.SQ_XK
                SR -> Value.SR
                SR_BA -> Value.SR_BA
                SR_CS -> Value.SR_CS
                SR_ME -> Value.SR_ME
                SR_RS -> Value.SR_RS
                SR_XK -> Value.SR_XK
                SS -> Value.SS
                ST -> Value.ST
                SU -> Value.SU
                SU_ID -> Value.SU_ID
                SV -> Value.SV
                SV_AX -> Value.SV_AX
                SV_FI -> Value.SV_FI
                SV_SE -> Value.SV_SE
                SW -> Value.SW
                SW_CD -> Value.SW_CD
                SW_KE -> Value.SW_KE
                SW_TZ -> Value.SW_TZ
                SW_UG -> Value.SW_UG
                SY -> Value.SY
                TA -> Value.TA
                TA_IN -> Value.TA_IN
                TA_LK -> Value.TA_LK
                TA_MY -> Value.TA_MY
                TA_SG -> Value.TA_SG
                TE -> Value.TE
                TE_IN -> Value.TE_IN
                TEO -> Value.TEO
                TEO_KE -> Value.TEO_KE
                TEO_UG -> Value.TEO_UG
                TG -> Value.TG
                TG_TJ -> Value.TG_TJ
                TH -> Value.TH
                TH_TH -> Value.TH_TH
                TI -> Value.TI
                TI_ER -> Value.TI_ER
                TI_ET -> Value.TI_ET
                TK -> Value.TK
                TK_TM -> Value.TK_TM
                TL -> Value.TL
                TN -> Value.TN
                TO -> Value.TO
                TO_TO -> Value.TO_TO
                TOK -> Value.TOK
                TOK_001 -> Value.TOK_001
                TR -> Value.TR
                TR_CY -> Value.TR_CY
                TR_TR -> Value.TR_TR
                TS -> Value.TS
                TT -> Value.TT
                TT_RU -> Value.TT_RU
                TW -> Value.TW
                TWQ -> Value.TWQ
                TWQ_NE -> Value.TWQ_NE
                TY -> Value.TY
                TZM -> Value.TZM
                TZM_MA -> Value.TZM_MA
                UG -> Value.UG
                UG_CN -> Value.UG_CN
                UK -> Value.UK
                UK_UA -> Value.UK_UA
                UR -> Value.UR
                UR_IN -> Value.UR_IN
                UR_PK -> Value.UR_PK
                UZ -> Value.UZ
                UZ_AF -> Value.UZ_AF
                UZ_UZ -> Value.UZ_UZ
                VAI -> Value.VAI
                VAI_LR -> Value.VAI_LR
                VE -> Value.VE
                VI -> Value.VI
                VI_VN -> Value.VI_VN
                VO -> Value.VO
                VO_001 -> Value.VO_001
                VUN -> Value.VUN
                VUN_TZ -> Value.VUN_TZ
                WA -> Value.WA
                WAE -> Value.WAE
                WAE_CH -> Value.WAE_CH
                WO -> Value.WO
                WO_SN -> Value.WO_SN
                XH -> Value.XH
                XH_ZA -> Value.XH_ZA
                XOG -> Value.XOG
                XOG_UG -> Value.XOG_UG
                YAV -> Value.YAV
                YAV_CM -> Value.YAV_CM
                YI -> Value.YI
                YI_001 -> Value.YI_001
                YO -> Value.YO
                YO_BJ -> Value.YO_BJ
                YO_NG -> Value.YO_NG
                YRL -> Value.YRL
                YRL_BR -> Value.YRL_BR
                YRL_CO -> Value.YRL_CO
                YRL_VE -> Value.YRL_VE
                YUE -> Value.YUE
                YUE_CN -> Value.YUE_CN
                YUE_HK -> Value.YUE_HK
                ZA -> Value.ZA
                ZGH -> Value.ZGH
                ZGH_MA -> Value.ZGH_MA
                ZH -> Value.ZH
                ZH_CN -> Value.ZH_CN
                ZH_HANS -> Value.ZH_HANS
                ZH_HANT -> Value.ZH_HANT
                ZH_HK -> Value.ZH_HK
                ZH_MO -> Value.ZH_MO
                ZH_SG -> Value.ZH_SG
                ZH_TW -> Value.ZH_TW
                ZU -> Value.ZU
                ZU_ZA -> Value.ZU_ZA
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
                AA -> Known.AA
                AB -> Known.AB
                AE -> Known.AE
                AF -> Known.AF
                AF_NA -> Known.AF_NA
                AF_ZA -> Known.AF_ZA
                AGQ -> Known.AGQ
                AGQ_CM -> Known.AGQ_CM
                AK -> Known.AK
                AK_GH -> Known.AK_GH
                AM -> Known.AM
                AM_ET -> Known.AM_ET
                AN -> Known.AN
                ANN -> Known.ANN
                ANN_NG -> Known.ANN_NG
                AR -> Known.AR
                AR_001 -> Known.AR_001
                AR_AE -> Known.AR_AE
                AR_BH -> Known.AR_BH
                AR_DJ -> Known.AR_DJ
                AR_DZ -> Known.AR_DZ
                AR_EG -> Known.AR_EG
                AR_EH -> Known.AR_EH
                AR_ER -> Known.AR_ER
                AR_IL -> Known.AR_IL
                AR_IQ -> Known.AR_IQ
                AR_JO -> Known.AR_JO
                AR_KM -> Known.AR_KM
                AR_KW -> Known.AR_KW
                AR_LB -> Known.AR_LB
                AR_LY -> Known.AR_LY
                AR_MA -> Known.AR_MA
                AR_MR -> Known.AR_MR
                AR_OM -> Known.AR_OM
                AR_PS -> Known.AR_PS
                AR_QA -> Known.AR_QA
                AR_SA -> Known.AR_SA
                AR_SD -> Known.AR_SD
                AR_SO -> Known.AR_SO
                AR_SS -> Known.AR_SS
                AR_SY -> Known.AR_SY
                AR_TD -> Known.AR_TD
                AR_TN -> Known.AR_TN
                AR_YE -> Known.AR_YE
                AS -> Known.AS
                AS_IN -> Known.AS_IN
                ASA -> Known.ASA
                ASA_TZ -> Known.ASA_TZ
                AST -> Known.AST
                AST_ES -> Known.AST_ES
                AV -> Known.AV
                AY -> Known.AY
                AZ -> Known.AZ
                AZ_AZ -> Known.AZ_AZ
                BA -> Known.BA
                BAS -> Known.BAS
                BAS_CM -> Known.BAS_CM
                BE -> Known.BE
                BE_BY -> Known.BE_BY
                BEM -> Known.BEM
                BEM_ZM -> Known.BEM_ZM
                BEZ -> Known.BEZ
                BEZ_TZ -> Known.BEZ_TZ
                BG -> Known.BG
                BG_BG -> Known.BG_BG
                BGC -> Known.BGC
                BGC_IN -> Known.BGC_IN
                BHO -> Known.BHO
                BHO_IN -> Known.BHO_IN
                BI -> Known.BI
                BM -> Known.BM
                BM_ML -> Known.BM_ML
                BN -> Known.BN
                BN_BD -> Known.BN_BD
                BN_IN -> Known.BN_IN
                BO -> Known.BO
                BO_CN -> Known.BO_CN
                BO_IN -> Known.BO_IN
                BR -> Known.BR
                BR_FR -> Known.BR_FR
                BRX -> Known.BRX
                BRX_IN -> Known.BRX_IN
                BS -> Known.BS
                BS_BA -> Known.BS_BA
                CA -> Known.CA
                CA_AD -> Known.CA_AD
                CA_ES -> Known.CA_ES
                CA_FR -> Known.CA_FR
                CA_IT -> Known.CA_IT
                CCP -> Known.CCP
                CCP_BD -> Known.CCP_BD
                CCP_IN -> Known.CCP_IN
                CE -> Known.CE
                CE_RU -> Known.CE_RU
                CEB -> Known.CEB
                CEB_PH -> Known.CEB_PH
                CGG -> Known.CGG
                CGG_UG -> Known.CGG_UG
                CH -> Known.CH
                CHR -> Known.CHR
                CHR_US -> Known.CHR_US
                CKB -> Known.CKB
                CKB_IQ -> Known.CKB_IQ
                CKB_IR -> Known.CKB_IR
                CO -> Known.CO
                CR -> Known.CR
                CS -> Known.CS
                CS_CZ -> Known.CS_CZ
                CU -> Known.CU
                CU_RU -> Known.CU_RU
                CV -> Known.CV
                CV_RU -> Known.CV_RU
                CY -> Known.CY
                CY_GB -> Known.CY_GB
                DA -> Known.DA
                DA_DK -> Known.DA_DK
                DA_GL -> Known.DA_GL
                DAV -> Known.DAV
                DAV_KE -> Known.DAV_KE
                DE -> Known.DE
                DE_AT -> Known.DE_AT
                DE_BE -> Known.DE_BE
                DE_CH -> Known.DE_CH
                DE_DE -> Known.DE_DE
                DE_GR -> Known.DE_GR
                DE_IT -> Known.DE_IT
                DE_LI -> Known.DE_LI
                DE_LU -> Known.DE_LU
                DJE -> Known.DJE
                DJE_NE -> Known.DJE_NE
                DOI -> Known.DOI
                DOI_IN -> Known.DOI_IN
                DSB -> Known.DSB
                DSB_DE -> Known.DSB_DE
                DUA -> Known.DUA
                DUA_CM -> Known.DUA_CM
                DV -> Known.DV
                DYO -> Known.DYO
                DYO_SN -> Known.DYO_SN
                DZ -> Known.DZ
                DZ_BT -> Known.DZ_BT
                EBU -> Known.EBU
                EBU_KE -> Known.EBU_KE
                EE -> Known.EE
                EE_GH -> Known.EE_GH
                EE_TG -> Known.EE_TG
                EL -> Known.EL
                EL_CY -> Known.EL_CY
                EL_GR -> Known.EL_GR
                EN -> Known.EN
                EN_001 -> Known.EN_001
                EN_150 -> Known.EN_150
                EN_AE -> Known.EN_AE
                EN_AG -> Known.EN_AG
                EN_AI -> Known.EN_AI
                EN_AS -> Known.EN_AS
                EN_AT -> Known.EN_AT
                EN_AU -> Known.EN_AU
                EN_BB -> Known.EN_BB
                EN_BE -> Known.EN_BE
                EN_BI -> Known.EN_BI
                EN_BM -> Known.EN_BM
                EN_BS -> Known.EN_BS
                EN_BW -> Known.EN_BW
                EN_BZ -> Known.EN_BZ
                EN_CA -> Known.EN_CA
                EN_CC -> Known.EN_CC
                EN_CH -> Known.EN_CH
                EN_CK -> Known.EN_CK
                EN_CM -> Known.EN_CM
                EN_CN -> Known.EN_CN
                EN_CX -> Known.EN_CX
                EN_CY -> Known.EN_CY
                EN_DE -> Known.EN_DE
                EN_DG -> Known.EN_DG
                EN_DK -> Known.EN_DK
                EN_DM -> Known.EN_DM
                EN_EE -> Known.EN_EE
                EN_EG -> Known.EN_EG
                EN_ER -> Known.EN_ER
                EN_ES -> Known.EN_ES
                EN_FI -> Known.EN_FI
                EN_FJ -> Known.EN_FJ
                EN_FK -> Known.EN_FK
                EN_FM -> Known.EN_FM
                EN_FR -> Known.EN_FR
                EN_GB -> Known.EN_GB
                EN_GD -> Known.EN_GD
                EN_GG -> Known.EN_GG
                EN_GH -> Known.EN_GH
                EN_GI -> Known.EN_GI
                EN_GM -> Known.EN_GM
                EN_GU -> Known.EN_GU
                EN_GY -> Known.EN_GY
                EN_HK -> Known.EN_HK
                EN_ID -> Known.EN_ID
                EN_IE -> Known.EN_IE
                EN_IL -> Known.EN_IL
                EN_IM -> Known.EN_IM
                EN_IN -> Known.EN_IN
                EN_IO -> Known.EN_IO
                EN_JE -> Known.EN_JE
                EN_JM -> Known.EN_JM
                EN_KE -> Known.EN_KE
                EN_KI -> Known.EN_KI
                EN_KN -> Known.EN_KN
                EN_KY -> Known.EN_KY
                EN_LC -> Known.EN_LC
                EN_LR -> Known.EN_LR
                EN_LS -> Known.EN_LS
                EN_LU -> Known.EN_LU
                EN_MG -> Known.EN_MG
                EN_MH -> Known.EN_MH
                EN_MO -> Known.EN_MO
                EN_MP -> Known.EN_MP
                EN_MS -> Known.EN_MS
                EN_MT -> Known.EN_MT
                EN_MU -> Known.EN_MU
                EN_MV -> Known.EN_MV
                EN_MW -> Known.EN_MW
                EN_MX -> Known.EN_MX
                EN_MY -> Known.EN_MY
                EN_NA -> Known.EN_NA
                EN_NF -> Known.EN_NF
                EN_NG -> Known.EN_NG
                EN_NL -> Known.EN_NL
                EN_NR -> Known.EN_NR
                EN_NU -> Known.EN_NU
                EN_NZ -> Known.EN_NZ
                EN_PG -> Known.EN_PG
                EN_PH -> Known.EN_PH
                EN_PK -> Known.EN_PK
                EN_PN -> Known.EN_PN
                EN_PR -> Known.EN_PR
                EN_PT -> Known.EN_PT
                EN_PW -> Known.EN_PW
                EN_RW -> Known.EN_RW
                EN_SB -> Known.EN_SB
                EN_SC -> Known.EN_SC
                EN_SD -> Known.EN_SD
                EN_SE -> Known.EN_SE
                EN_SG -> Known.EN_SG
                EN_SH -> Known.EN_SH
                EN_SI -> Known.EN_SI
                EN_SL -> Known.EN_SL
                EN_SS -> Known.EN_SS
                EN_SX -> Known.EN_SX
                EN_SZ -> Known.EN_SZ
                EN_TC -> Known.EN_TC
                EN_TH -> Known.EN_TH
                EN_TK -> Known.EN_TK
                EN_TN -> Known.EN_TN
                EN_TO -> Known.EN_TO
                EN_TT -> Known.EN_TT
                EN_TV -> Known.EN_TV
                EN_TZ -> Known.EN_TZ
                EN_UG -> Known.EN_UG
                EN_UM -> Known.EN_UM
                EN_US -> Known.EN_US
                EN_VC -> Known.EN_VC
                EN_VG -> Known.EN_VG
                EN_VI -> Known.EN_VI
                EN_VN -> Known.EN_VN
                EN_VU -> Known.EN_VU
                EN_WS -> Known.EN_WS
                EN_ZA -> Known.EN_ZA
                EN_ZM -> Known.EN_ZM
                EN_ZW -> Known.EN_ZW
                EO -> Known.EO
                EO_001 -> Known.EO_001
                ES -> Known.ES
                ES_419 -> Known.ES_419
                ES_AR -> Known.ES_AR
                ES_BO -> Known.ES_BO
                ES_BR -> Known.ES_BR
                ES_BZ -> Known.ES_BZ
                ES_CL -> Known.ES_CL
                ES_CO -> Known.ES_CO
                ES_CR -> Known.ES_CR
                ES_CU -> Known.ES_CU
                ES_DO -> Known.ES_DO
                ES_EA -> Known.ES_EA
                ES_EC -> Known.ES_EC
                ES_ES -> Known.ES_ES
                ES_GQ -> Known.ES_GQ
                ES_GT -> Known.ES_GT
                ES_HN -> Known.ES_HN
                ES_IC -> Known.ES_IC
                ES_MX -> Known.ES_MX
                ES_NI -> Known.ES_NI
                ES_PA -> Known.ES_PA
                ES_PE -> Known.ES_PE
                ES_PH -> Known.ES_PH
                ES_PR -> Known.ES_PR
                ES_PY -> Known.ES_PY
                ES_SV -> Known.ES_SV
                ES_US -> Known.ES_US
                ES_UY -> Known.ES_UY
                ES_VE -> Known.ES_VE
                ET -> Known.ET
                ET_EE -> Known.ET_EE
                EU -> Known.EU
                EU_ES -> Known.EU_ES
                EWO -> Known.EWO
                EWO_CM -> Known.EWO_CM
                FA -> Known.FA
                FA_AF -> Known.FA_AF
                FA_IR -> Known.FA_IR
                FF -> Known.FF
                FF_BF -> Known.FF_BF
                FF_CM -> Known.FF_CM
                FF_GH -> Known.FF_GH
                FF_GM -> Known.FF_GM
                FF_GN -> Known.FF_GN
                FF_GW -> Known.FF_GW
                FF_LR -> Known.FF_LR
                FF_MR -> Known.FF_MR
                FF_NE -> Known.FF_NE
                FF_NG -> Known.FF_NG
                FF_SL -> Known.FF_SL
                FF_SN -> Known.FF_SN
                FI -> Known.FI
                FI_FI -> Known.FI_FI
                FIL -> Known.FIL
                FIL_PH -> Known.FIL_PH
                FJ -> Known.FJ
                FO -> Known.FO
                FO_DK -> Known.FO_DK
                FO_FO -> Known.FO_FO
                FR -> Known.FR
                FR_BE -> Known.FR_BE
                FR_BF -> Known.FR_BF
                FR_BI -> Known.FR_BI
                FR_BJ -> Known.FR_BJ
                FR_BL -> Known.FR_BL
                FR_CA -> Known.FR_CA
                FR_CD -> Known.FR_CD
                FR_CF -> Known.FR_CF
                FR_CG -> Known.FR_CG
                FR_CH -> Known.FR_CH
                FR_CI -> Known.FR_CI
                FR_CM -> Known.FR_CM
                FR_DJ -> Known.FR_DJ
                FR_DZ -> Known.FR_DZ
                FR_FR -> Known.FR_FR
                FR_GA -> Known.FR_GA
                FR_GF -> Known.FR_GF
                FR_GN -> Known.FR_GN
                FR_GP -> Known.FR_GP
                FR_GQ -> Known.FR_GQ
                FR_HT -> Known.FR_HT
                FR_KM -> Known.FR_KM
                FR_LU -> Known.FR_LU
                FR_MA -> Known.FR_MA
                FR_MC -> Known.FR_MC
                FR_MF -> Known.FR_MF
                FR_MG -> Known.FR_MG
                FR_ML -> Known.FR_ML
                FR_MQ -> Known.FR_MQ
                FR_MR -> Known.FR_MR
                FR_MU -> Known.FR_MU
                FR_NC -> Known.FR_NC
                FR_NE -> Known.FR_NE
                FR_PF -> Known.FR_PF
                FR_PM -> Known.FR_PM
                FR_RE -> Known.FR_RE
                FR_RW -> Known.FR_RW
                FR_SC -> Known.FR_SC
                FR_SN -> Known.FR_SN
                FR_SY -> Known.FR_SY
                FR_TD -> Known.FR_TD
                FR_TG -> Known.FR_TG
                FR_TN -> Known.FR_TN
                FR_VU -> Known.FR_VU
                FR_WF -> Known.FR_WF
                FR_YT -> Known.FR_YT
                FRR -> Known.FRR
                FRR_DE -> Known.FRR_DE
                FUR -> Known.FUR
                FUR_IT -> Known.FUR_IT
                FY -> Known.FY
                FY_NL -> Known.FY_NL
                GA -> Known.GA
                GA_GB -> Known.GA_GB
                GA_IE -> Known.GA_IE
                GD -> Known.GD
                GD_GB -> Known.GD_GB
                GL -> Known.GL
                GL_ES -> Known.GL_ES
                GN -> Known.GN
                GSW -> Known.GSW
                GSW_CH -> Known.GSW_CH
                GSW_FR -> Known.GSW_FR
                GSW_LI -> Known.GSW_LI
                GU -> Known.GU
                GU_IN -> Known.GU_IN
                GUZ -> Known.GUZ
                GUZ_KE -> Known.GUZ_KE
                GV -> Known.GV
                GV_IM -> Known.GV_IM
                HA -> Known.HA
                HA_GH -> Known.HA_GH
                HA_NE -> Known.HA_NE
                HA_NG -> Known.HA_NG
                HAW -> Known.HAW
                HAW_US -> Known.HAW_US
                HE -> Known.HE
                HE_IL -> Known.HE_IL
                HI -> Known.HI
                HI_IN -> Known.HI_IN
                HMN -> Known.HMN
                HO -> Known.HO
                HR -> Known.HR
                HR_BA -> Known.HR_BA
                HR_HR -> Known.HR_HR
                HSB -> Known.HSB
                HSB_DE -> Known.HSB_DE
                HT -> Known.HT
                HU -> Known.HU
                HU_HU -> Known.HU_HU
                HY -> Known.HY
                HY_AM -> Known.HY_AM
                HZ -> Known.HZ
                IA -> Known.IA
                IA_001 -> Known.IA_001
                ID -> Known.ID
                ID_ID -> Known.ID_ID
                IE -> Known.IE
                IG -> Known.IG
                IG_NG -> Known.IG_NG
                II -> Known.II
                II_CN -> Known.II_CN
                IK -> Known.IK
                IO -> Known.IO
                IS -> Known.IS
                IS_IS -> Known.IS_IS
                IT -> Known.IT
                IT_CH -> Known.IT_CH
                IT_IT -> Known.IT_IT
                IT_SM -> Known.IT_SM
                IT_VA -> Known.IT_VA
                IU -> Known.IU
                JA -> Known.JA
                JA_JP -> Known.JA_JP
                JGO -> Known.JGO
                JGO_CM -> Known.JGO_CM
                JMC -> Known.JMC
                JMC_TZ -> Known.JMC_TZ
                JV -> Known.JV
                JV_ID -> Known.JV_ID
                KA -> Known.KA
                KA_GE -> Known.KA_GE
                KAB -> Known.KAB
                KAB_DZ -> Known.KAB_DZ
                KAM -> Known.KAM
                KAM_KE -> Known.KAM_KE
                KAR -> Known.KAR
                KDE -> Known.KDE
                KDE_TZ -> Known.KDE_TZ
                KEA -> Known.KEA
                KEA_CV -> Known.KEA_CV
                KG -> Known.KG
                KGP -> Known.KGP
                KGP_BR -> Known.KGP_BR
                KH -> Known.KH
                KHQ -> Known.KHQ
                KHQ_ML -> Known.KHQ_ML
                KI -> Known.KI
                KI_KE -> Known.KI_KE
                KJ -> Known.KJ
                KK -> Known.KK
                KK_KZ -> Known.KK_KZ
                KKJ -> Known.KKJ
                KKJ_CM -> Known.KKJ_CM
                KL -> Known.KL
                KL_GL -> Known.KL_GL
                KLN -> Known.KLN
                KLN_KE -> Known.KLN_KE
                KM -> Known.KM
                KM_KH -> Known.KM_KH
                KN -> Known.KN
                KN_IN -> Known.KN_IN
                KO -> Known.KO
                KO_KP -> Known.KO_KP
                KO_KR -> Known.KO_KR
                KOK -> Known.KOK
                KOK_IN -> Known.KOK_IN
                KR -> Known.KR
                KS -> Known.KS
                KS_IN -> Known.KS_IN
                KSB -> Known.KSB
                KSB_TZ -> Known.KSB_TZ
                KSF -> Known.KSF
                KSF_CM -> Known.KSF_CM
                KSH -> Known.KSH
                KSH_DE -> Known.KSH_DE
                KU -> Known.KU
                KU_TR -> Known.KU_TR
                KV -> Known.KV
                KW -> Known.KW
                KW_GB -> Known.KW_GB
                KY -> Known.KY
                KY_KG -> Known.KY_KG
                LA -> Known.LA
                LAG -> Known.LAG
                LAG_TZ -> Known.LAG_TZ
                LB -> Known.LB
                LB_LU -> Known.LB_LU
                LG -> Known.LG
                LG_UG -> Known.LG_UG
                LI -> Known.LI
                LKT -> Known.LKT
                LKT_US -> Known.LKT_US
                LN -> Known.LN
                LN_AO -> Known.LN_AO
                LN_CD -> Known.LN_CD
                LN_CF -> Known.LN_CF
                LN_CG -> Known.LN_CG
                LO -> Known.LO
                LO_LA -> Known.LO_LA
                LRC -> Known.LRC
                LRC_IQ -> Known.LRC_IQ
                LRC_IR -> Known.LRC_IR
                LT -> Known.LT
                LT_LT -> Known.LT_LT
                LU -> Known.LU
                LU_CD -> Known.LU_CD
                LUO -> Known.LUO
                LUO_KE -> Known.LUO_KE
                LUY -> Known.LUY
                LUY_KE -> Known.LUY_KE
                LV -> Known.LV
                LV_LV -> Known.LV_LV
                MAI -> Known.MAI
                MAI_IN -> Known.MAI_IN
                MAS -> Known.MAS
                MAS_KE -> Known.MAS_KE
                MAS_TZ -> Known.MAS_TZ
                MDF -> Known.MDF
                MDF_RU -> Known.MDF_RU
                MER -> Known.MER
                MER_KE -> Known.MER_KE
                MFE -> Known.MFE
                MFE_MU -> Known.MFE_MU
                MG -> Known.MG
                MG_MG -> Known.MG_MG
                MGH -> Known.MGH
                MGH_MZ -> Known.MGH_MZ
                MGO -> Known.MGO
                MGO_CM -> Known.MGO_CM
                MH -> Known.MH
                MI -> Known.MI
                MI_NZ -> Known.MI_NZ
                MK -> Known.MK
                MK_MK -> Known.MK_MK
                ML -> Known.ML
                ML_IN -> Known.ML_IN
                MN -> Known.MN
                MN_MN -> Known.MN_MN
                MNI -> Known.MNI
                MNI_IN -> Known.MNI_IN
                MR -> Known.MR
                MR_IN -> Known.MR_IN
                MS -> Known.MS
                MS_BN -> Known.MS_BN
                MS_ID -> Known.MS_ID
                MS_MY -> Known.MS_MY
                MS_SG -> Known.MS_SG
                MT -> Known.MT
                MT_MT -> Known.MT_MT
                MUA -> Known.MUA
                MUA_CM -> Known.MUA_CM
                MY -> Known.MY
                MY_MM -> Known.MY_MM
                MZN -> Known.MZN
                MZN_IR -> Known.MZN_IR
                NA -> Known.NA
                NAQ -> Known.NAQ
                NAQ_NA -> Known.NAQ_NA
                NB -> Known.NB
                NB_NO -> Known.NB_NO
                NB_SJ -> Known.NB_SJ
                ND -> Known.ND
                ND_ZW -> Known.ND_ZW
                NDS -> Known.NDS
                NDS_DE -> Known.NDS_DE
                NDS_NL -> Known.NDS_NL
                NE -> Known.NE
                NE_IN -> Known.NE_IN
                NE_NP -> Known.NE_NP
                NG -> Known.NG
                NL -> Known.NL
                NL_AW -> Known.NL_AW
                NL_BE -> Known.NL_BE
                NL_BQ -> Known.NL_BQ
                NL_CH -> Known.NL_CH
                NL_CW -> Known.NL_CW
                NL_LU -> Known.NL_LU
                NL_NL -> Known.NL_NL
                NL_SR -> Known.NL_SR
                NL_SX -> Known.NL_SX
                NMG -> Known.NMG
                NMG_CM -> Known.NMG_CM
                NN -> Known.NN
                NN_NO -> Known.NN_NO
                NNH -> Known.NNH
                NNH_CM -> Known.NNH_CM
                NO -> Known.NO
                NO_NO -> Known.NO_NO
                NR -> Known.NR
                NUS -> Known.NUS
                NUS_SS -> Known.NUS_SS
                NV -> Known.NV
                NY -> Known.NY
                NYN -> Known.NYN
                NYN_UG -> Known.NYN_UG
                OC -> Known.OC
                OC_ES -> Known.OC_ES
                OC_FR -> Known.OC_FR
                OJ -> Known.OJ
                OM -> Known.OM
                OM_ET -> Known.OM_ET
                OM_KE -> Known.OM_KE
                OR -> Known.OR
                OR_IN -> Known.OR_IN
                OS -> Known.OS
                OS_GE -> Known.OS_GE
                OS_RU -> Known.OS_RU
                PA -> Known.PA
                PA_IN -> Known.PA_IN
                PA_PK -> Known.PA_PK
                PCM -> Known.PCM
                PCM_NG -> Known.PCM_NG
                PI -> Known.PI
                PIS -> Known.PIS
                PIS_SB -> Known.PIS_SB
                PL -> Known.PL
                PL_PL -> Known.PL_PL
                PRG -> Known.PRG
                PRG_001 -> Known.PRG_001
                PS -> Known.PS
                PS_AF -> Known.PS_AF
                PS_PK -> Known.PS_PK
                PT -> Known.PT
                PT_AO -> Known.PT_AO
                PT_BR -> Known.PT_BR
                PT_CH -> Known.PT_CH
                PT_CV -> Known.PT_CV
                PT_GQ -> Known.PT_GQ
                PT_GW -> Known.PT_GW
                PT_LU -> Known.PT_LU
                PT_MO -> Known.PT_MO
                PT_MZ -> Known.PT_MZ
                PT_PT -> Known.PT_PT
                PT_ST -> Known.PT_ST
                PT_TL -> Known.PT_TL
                QU -> Known.QU
                QU_BO -> Known.QU_BO
                QU_EC -> Known.QU_EC
                QU_PE -> Known.QU_PE
                RAJ -> Known.RAJ
                RAJ_IN -> Known.RAJ_IN
                RM -> Known.RM
                RM_CH -> Known.RM_CH
                RN -> Known.RN
                RN_BI -> Known.RN_BI
                RO -> Known.RO
                RO_MD -> Known.RO_MD
                RO_RO -> Known.RO_RO
                ROF -> Known.ROF
                ROF_TZ -> Known.ROF_TZ
                RU -> Known.RU
                RU_BY -> Known.RU_BY
                RU_KG -> Known.RU_KG
                RU_KZ -> Known.RU_KZ
                RU_MD -> Known.RU_MD
                RU_RU -> Known.RU_RU
                RU_UA -> Known.RU_UA
                RW -> Known.RW
                RW_RW -> Known.RW_RW
                RWK -> Known.RWK
                RWK_TZ -> Known.RWK_TZ
                SA -> Known.SA
                SA_IN -> Known.SA_IN
                SAH -> Known.SAH
                SAH_RU -> Known.SAH_RU
                SAQ -> Known.SAQ
                SAQ_KE -> Known.SAQ_KE
                SAT -> Known.SAT
                SAT_IN -> Known.SAT_IN
                SBP -> Known.SBP
                SBP_TZ -> Known.SBP_TZ
                SC -> Known.SC
                SC_IT -> Known.SC_IT
                SD -> Known.SD
                SD_IN -> Known.SD_IN
                SD_PK -> Known.SD_PK
                SE -> Known.SE
                SE_FI -> Known.SE_FI
                SE_NO -> Known.SE_NO
                SE_SE -> Known.SE_SE
                SEH -> Known.SEH
                SEH_MZ -> Known.SEH_MZ
                SES -> Known.SES
                SES_ML -> Known.SES_ML
                SG -> Known.SG
                SG_CF -> Known.SG_CF
                SHI -> Known.SHI
                SHI_MA -> Known.SHI_MA
                SI -> Known.SI
                SI_LK -> Known.SI_LK
                SK -> Known.SK
                SK_SK -> Known.SK_SK
                SL -> Known.SL
                SL_SI -> Known.SL_SI
                SM -> Known.SM
                SMN -> Known.SMN
                SMN_FI -> Known.SMN_FI
                SMS -> Known.SMS
                SMS_FI -> Known.SMS_FI
                SN -> Known.SN
                SN_ZW -> Known.SN_ZW
                SO -> Known.SO
                SO_DJ -> Known.SO_DJ
                SO_ET -> Known.SO_ET
                SO_KE -> Known.SO_KE
                SO_SO -> Known.SO_SO
                SQ -> Known.SQ
                SQ_AL -> Known.SQ_AL
                SQ_MK -> Known.SQ_MK
                SQ_XK -> Known.SQ_XK
                SR -> Known.SR
                SR_BA -> Known.SR_BA
                SR_CS -> Known.SR_CS
                SR_ME -> Known.SR_ME
                SR_RS -> Known.SR_RS
                SR_XK -> Known.SR_XK
                SS -> Known.SS
                ST -> Known.ST
                SU -> Known.SU
                SU_ID -> Known.SU_ID
                SV -> Known.SV
                SV_AX -> Known.SV_AX
                SV_FI -> Known.SV_FI
                SV_SE -> Known.SV_SE
                SW -> Known.SW
                SW_CD -> Known.SW_CD
                SW_KE -> Known.SW_KE
                SW_TZ -> Known.SW_TZ
                SW_UG -> Known.SW_UG
                SY -> Known.SY
                TA -> Known.TA
                TA_IN -> Known.TA_IN
                TA_LK -> Known.TA_LK
                TA_MY -> Known.TA_MY
                TA_SG -> Known.TA_SG
                TE -> Known.TE
                TE_IN -> Known.TE_IN
                TEO -> Known.TEO
                TEO_KE -> Known.TEO_KE
                TEO_UG -> Known.TEO_UG
                TG -> Known.TG
                TG_TJ -> Known.TG_TJ
                TH -> Known.TH
                TH_TH -> Known.TH_TH
                TI -> Known.TI
                TI_ER -> Known.TI_ER
                TI_ET -> Known.TI_ET
                TK -> Known.TK
                TK_TM -> Known.TK_TM
                TL -> Known.TL
                TN -> Known.TN
                TO -> Known.TO
                TO_TO -> Known.TO_TO
                TOK -> Known.TOK
                TOK_001 -> Known.TOK_001
                TR -> Known.TR
                TR_CY -> Known.TR_CY
                TR_TR -> Known.TR_TR
                TS -> Known.TS
                TT -> Known.TT
                TT_RU -> Known.TT_RU
                TW -> Known.TW
                TWQ -> Known.TWQ
                TWQ_NE -> Known.TWQ_NE
                TY -> Known.TY
                TZM -> Known.TZM
                TZM_MA -> Known.TZM_MA
                UG -> Known.UG
                UG_CN -> Known.UG_CN
                UK -> Known.UK
                UK_UA -> Known.UK_UA
                UR -> Known.UR
                UR_IN -> Known.UR_IN
                UR_PK -> Known.UR_PK
                UZ -> Known.UZ
                UZ_AF -> Known.UZ_AF
                UZ_UZ -> Known.UZ_UZ
                VAI -> Known.VAI
                VAI_LR -> Known.VAI_LR
                VE -> Known.VE
                VI -> Known.VI
                VI_VN -> Known.VI_VN
                VO -> Known.VO
                VO_001 -> Known.VO_001
                VUN -> Known.VUN
                VUN_TZ -> Known.VUN_TZ
                WA -> Known.WA
                WAE -> Known.WAE
                WAE_CH -> Known.WAE_CH
                WO -> Known.WO
                WO_SN -> Known.WO_SN
                XH -> Known.XH
                XH_ZA -> Known.XH_ZA
                XOG -> Known.XOG
                XOG_UG -> Known.XOG_UG
                YAV -> Known.YAV
                YAV_CM -> Known.YAV_CM
                YI -> Known.YI
                YI_001 -> Known.YI_001
                YO -> Known.YO
                YO_BJ -> Known.YO_BJ
                YO_NG -> Known.YO_NG
                YRL -> Known.YRL
                YRL_BR -> Known.YRL_BR
                YRL_CO -> Known.YRL_CO
                YRL_VE -> Known.YRL_VE
                YUE -> Known.YUE
                YUE_CN -> Known.YUE_CN
                YUE_HK -> Known.YUE_HK
                ZA -> Known.ZA
                ZGH -> Known.ZGH
                ZGH_MA -> Known.ZGH_MA
                ZH -> Known.ZH
                ZH_CN -> Known.ZH_CN
                ZH_HANS -> Known.ZH_HANS
                ZH_HANT -> Known.ZH_HANT
                ZH_HK -> Known.ZH_HK
                ZH_MO -> Known.ZH_MO
                ZH_SG -> Known.ZH_SG
                ZH_TW -> Known.ZH_TW
                ZU -> Known.ZU
                ZU_ZA -> Known.ZU_ZA
                else -> throw HubSpotInvalidDataException("Unknown Language: $value")
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

            return other is Language && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The email state. */
    class State @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val AGENT_GENERATED = of("AGENT_GENERATED")

            @JvmField val AUTOMATED = of("AUTOMATED")

            @JvmField val AUTOMATED_AB = of("AUTOMATED_AB")

            @JvmField val AUTOMATED_AB_VARIANT = of("AUTOMATED_AB_VARIANT")

            @JvmField val AUTOMATED_DRAFT = of("AUTOMATED_DRAFT")

            @JvmField val AUTOMATED_DRAFT_AB = of("AUTOMATED_DRAFT_AB")

            @JvmField val AUTOMATED_DRAFT_ABVARIANT = of("AUTOMATED_DRAFT_ABVARIANT")

            @JvmField val AUTOMATED_FOR_FORM = of("AUTOMATED_FOR_FORM")

            @JvmField val AUTOMATED_FOR_FORM_BUFFER = of("AUTOMATED_FOR_FORM_BUFFER")

            @JvmField val AUTOMATED_FOR_FORM_DRAFT = of("AUTOMATED_FOR_FORM_DRAFT")

            @JvmField val AUTOMATED_FOR_FORM_LEGACY = of("AUTOMATED_FOR_FORM_LEGACY")

            @JvmField val AUTOMATED_LOSER_ABVARIANT = of("AUTOMATED_LOSER_ABVARIANT")

            @JvmField val AUTOMATED_SENDING = of("AUTOMATED_SENDING")

            @JvmField val BLOG_EMAIL_DRAFT = of("BLOG_EMAIL_DRAFT")

            @JvmField val BLOG_EMAIL_PUBLISHED = of("BLOG_EMAIL_PUBLISHED")

            @JvmField val DRAFT = of("DRAFT")

            @JvmField val DRAFT_AB = of("DRAFT_AB")

            @JvmField val DRAFT_AB_VARIANT = of("DRAFT_AB_VARIANT")

            @JvmField val ERROR = of("ERROR")

            @JvmField val LOSER_AB_VARIANT = of("LOSER_AB_VARIANT")

            @JvmField val PAGE_STUB = of("PAGE_STUB")

            @JvmField val PRE_PROCESSING = of("PRE_PROCESSING")

            @JvmField val PROCESSING = of("PROCESSING")

            @JvmField val PUBLISHED = of("PUBLISHED")

            @JvmField val PUBLISHED_AB = of("PUBLISHED_AB")

            @JvmField val PUBLISHED_AB_VARIANT = of("PUBLISHED_AB_VARIANT")

            @JvmField val PUBLISHED_OR_SCHEDULED = of("PUBLISHED_OR_SCHEDULED")

            @JvmField val RSS_TO_EMAIL_DRAFT = of("RSS_TO_EMAIL_DRAFT")

            @JvmField val RSS_TO_EMAIL_PUBLISHED = of("RSS_TO_EMAIL_PUBLISHED")

            @JvmField val SCHEDULED = of("SCHEDULED")

            @JvmField val SCHEDULED_AB = of("SCHEDULED_AB")

            @JvmField val SCHEDULED_OR_PUBLISHED = of("SCHEDULED_OR_PUBLISHED")

            @JvmStatic fun of(value: String) = State(JsonField.of(value))
        }

        /** An enum containing [State]'s known values. */
        enum class Known {
            AGENT_GENERATED,
            AUTOMATED,
            AUTOMATED_AB,
            AUTOMATED_AB_VARIANT,
            AUTOMATED_DRAFT,
            AUTOMATED_DRAFT_AB,
            AUTOMATED_DRAFT_ABVARIANT,
            AUTOMATED_FOR_FORM,
            AUTOMATED_FOR_FORM_BUFFER,
            AUTOMATED_FOR_FORM_DRAFT,
            AUTOMATED_FOR_FORM_LEGACY,
            AUTOMATED_LOSER_ABVARIANT,
            AUTOMATED_SENDING,
            BLOG_EMAIL_DRAFT,
            BLOG_EMAIL_PUBLISHED,
            DRAFT,
            DRAFT_AB,
            DRAFT_AB_VARIANT,
            ERROR,
            LOSER_AB_VARIANT,
            PAGE_STUB,
            PRE_PROCESSING,
            PROCESSING,
            PUBLISHED,
            PUBLISHED_AB,
            PUBLISHED_AB_VARIANT,
            PUBLISHED_OR_SCHEDULED,
            RSS_TO_EMAIL_DRAFT,
            RSS_TO_EMAIL_PUBLISHED,
            SCHEDULED,
            SCHEDULED_AB,
            SCHEDULED_OR_PUBLISHED,
        }

        /**
         * An enum containing [State]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [State] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AGENT_GENERATED,
            AUTOMATED,
            AUTOMATED_AB,
            AUTOMATED_AB_VARIANT,
            AUTOMATED_DRAFT,
            AUTOMATED_DRAFT_AB,
            AUTOMATED_DRAFT_ABVARIANT,
            AUTOMATED_FOR_FORM,
            AUTOMATED_FOR_FORM_BUFFER,
            AUTOMATED_FOR_FORM_DRAFT,
            AUTOMATED_FOR_FORM_LEGACY,
            AUTOMATED_LOSER_ABVARIANT,
            AUTOMATED_SENDING,
            BLOG_EMAIL_DRAFT,
            BLOG_EMAIL_PUBLISHED,
            DRAFT,
            DRAFT_AB,
            DRAFT_AB_VARIANT,
            ERROR,
            LOSER_AB_VARIANT,
            PAGE_STUB,
            PRE_PROCESSING,
            PROCESSING,
            PUBLISHED,
            PUBLISHED_AB,
            PUBLISHED_AB_VARIANT,
            PUBLISHED_OR_SCHEDULED,
            RSS_TO_EMAIL_DRAFT,
            RSS_TO_EMAIL_PUBLISHED,
            SCHEDULED,
            SCHEDULED_AB,
            SCHEDULED_OR_PUBLISHED,
            /** An enum member indicating that [State] was instantiated with an unknown value. */
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
                AGENT_GENERATED -> Value.AGENT_GENERATED
                AUTOMATED -> Value.AUTOMATED
                AUTOMATED_AB -> Value.AUTOMATED_AB
                AUTOMATED_AB_VARIANT -> Value.AUTOMATED_AB_VARIANT
                AUTOMATED_DRAFT -> Value.AUTOMATED_DRAFT
                AUTOMATED_DRAFT_AB -> Value.AUTOMATED_DRAFT_AB
                AUTOMATED_DRAFT_ABVARIANT -> Value.AUTOMATED_DRAFT_ABVARIANT
                AUTOMATED_FOR_FORM -> Value.AUTOMATED_FOR_FORM
                AUTOMATED_FOR_FORM_BUFFER -> Value.AUTOMATED_FOR_FORM_BUFFER
                AUTOMATED_FOR_FORM_DRAFT -> Value.AUTOMATED_FOR_FORM_DRAFT
                AUTOMATED_FOR_FORM_LEGACY -> Value.AUTOMATED_FOR_FORM_LEGACY
                AUTOMATED_LOSER_ABVARIANT -> Value.AUTOMATED_LOSER_ABVARIANT
                AUTOMATED_SENDING -> Value.AUTOMATED_SENDING
                BLOG_EMAIL_DRAFT -> Value.BLOG_EMAIL_DRAFT
                BLOG_EMAIL_PUBLISHED -> Value.BLOG_EMAIL_PUBLISHED
                DRAFT -> Value.DRAFT
                DRAFT_AB -> Value.DRAFT_AB
                DRAFT_AB_VARIANT -> Value.DRAFT_AB_VARIANT
                ERROR -> Value.ERROR
                LOSER_AB_VARIANT -> Value.LOSER_AB_VARIANT
                PAGE_STUB -> Value.PAGE_STUB
                PRE_PROCESSING -> Value.PRE_PROCESSING
                PROCESSING -> Value.PROCESSING
                PUBLISHED -> Value.PUBLISHED
                PUBLISHED_AB -> Value.PUBLISHED_AB
                PUBLISHED_AB_VARIANT -> Value.PUBLISHED_AB_VARIANT
                PUBLISHED_OR_SCHEDULED -> Value.PUBLISHED_OR_SCHEDULED
                RSS_TO_EMAIL_DRAFT -> Value.RSS_TO_EMAIL_DRAFT
                RSS_TO_EMAIL_PUBLISHED -> Value.RSS_TO_EMAIL_PUBLISHED
                SCHEDULED -> Value.SCHEDULED
                SCHEDULED_AB -> Value.SCHEDULED_AB
                SCHEDULED_OR_PUBLISHED -> Value.SCHEDULED_OR_PUBLISHED
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
                AGENT_GENERATED -> Known.AGENT_GENERATED
                AUTOMATED -> Known.AUTOMATED
                AUTOMATED_AB -> Known.AUTOMATED_AB
                AUTOMATED_AB_VARIANT -> Known.AUTOMATED_AB_VARIANT
                AUTOMATED_DRAFT -> Known.AUTOMATED_DRAFT
                AUTOMATED_DRAFT_AB -> Known.AUTOMATED_DRAFT_AB
                AUTOMATED_DRAFT_ABVARIANT -> Known.AUTOMATED_DRAFT_ABVARIANT
                AUTOMATED_FOR_FORM -> Known.AUTOMATED_FOR_FORM
                AUTOMATED_FOR_FORM_BUFFER -> Known.AUTOMATED_FOR_FORM_BUFFER
                AUTOMATED_FOR_FORM_DRAFT -> Known.AUTOMATED_FOR_FORM_DRAFT
                AUTOMATED_FOR_FORM_LEGACY -> Known.AUTOMATED_FOR_FORM_LEGACY
                AUTOMATED_LOSER_ABVARIANT -> Known.AUTOMATED_LOSER_ABVARIANT
                AUTOMATED_SENDING -> Known.AUTOMATED_SENDING
                BLOG_EMAIL_DRAFT -> Known.BLOG_EMAIL_DRAFT
                BLOG_EMAIL_PUBLISHED -> Known.BLOG_EMAIL_PUBLISHED
                DRAFT -> Known.DRAFT
                DRAFT_AB -> Known.DRAFT_AB
                DRAFT_AB_VARIANT -> Known.DRAFT_AB_VARIANT
                ERROR -> Known.ERROR
                LOSER_AB_VARIANT -> Known.LOSER_AB_VARIANT
                PAGE_STUB -> Known.PAGE_STUB
                PRE_PROCESSING -> Known.PRE_PROCESSING
                PROCESSING -> Known.PROCESSING
                PUBLISHED -> Known.PUBLISHED
                PUBLISHED_AB -> Known.PUBLISHED_AB
                PUBLISHED_AB_VARIANT -> Known.PUBLISHED_AB_VARIANT
                PUBLISHED_OR_SCHEDULED -> Known.PUBLISHED_OR_SCHEDULED
                RSS_TO_EMAIL_DRAFT -> Known.RSS_TO_EMAIL_DRAFT
                RSS_TO_EMAIL_PUBLISHED -> Known.RSS_TO_EMAIL_PUBLISHED
                SCHEDULED -> Known.SCHEDULED
                SCHEDULED_AB -> Known.SCHEDULED_AB
                SCHEDULED_OR_PUBLISHED -> Known.SCHEDULED_OR_PUBLISHED
                else -> throw HubSpotInvalidDataException("Unknown State: $value")
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
        fun validate(): State = apply {
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

            return other is State && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The email subcategory. */
    class Subcategory @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val AB_LOSER_VARIANT = of("ab_loser_variant")

            @JvmField val AB_LOSER_VARIANT_SITE_PAGE = of("ab_loser_variant_site_page")

            @JvmField val AB_MASTER = of("ab_master")

            @JvmField val AB_MASTER_SITE_PAGE = of("ab_master_site_page")

            @JvmField val AB_VARIANT = of("ab_variant")

            @JvmField val AB_VARIANT_SITE_PAGE = of("ab_variant_site_page")

            @JvmField val AUTOMATED = of("automated")

            @JvmField val AUTOMATED_AB_MASTER = of("automated_ab_master")

            @JvmField val AUTOMATED_AB_VARIANT = of("automated_ab_variant")

            @JvmField val AUTOMATED_FOR_CRM = of("automated_for_crm")

            @JvmField val AUTOMATED_FOR_CUSTOM_SURVEY = of("automated_for_custom_survey")

            @JvmField val AUTOMATED_FOR_DEAL = of("automated_for_deal")

            @JvmField val AUTOMATED_FOR_FEEDBACK_CES = of("automated_for_feedback_ces")

            @JvmField val AUTOMATED_FOR_FEEDBACK_CUSTOM = of("automated_for_feedback_custom")

            @JvmField val AUTOMATED_FOR_FEEDBACK_NPS = of("automated_for_feedback_nps")

            @JvmField val AUTOMATED_FOR_FORM = of("automated_for_form")

            @JvmField val AUTOMATED_FOR_FORM_BUFFER = of("automated_for_form_buffer")

            @JvmField val AUTOMATED_FOR_FORM_DRAFT = of("automated_for_form_draft")

            @JvmField val AUTOMATED_FOR_FORM_LEGACY = of("automated_for_form_legacy")

            @JvmField val AUTOMATED_FOR_LEADFLOW = of("automated_for_leadflow")

            @JvmField val AUTOMATED_FOR_TICKET = of("automated_for_ticket")

            @JvmField val BATCH = of("batch")

            @JvmField val BLOG_ARTICLE_INSTANCE_LAYOUT = of("blog_article_instance_layout")

            @JvmField val BLOG_ARTICLE_LISTING = of("blog_article_listing")

            @JvmField val BLOG_AUTHOR_DETAIL = of("blog_author_detail")

            @JvmField val BLOG_EMAIL = of("blog_email")

            @JvmField val BLOG_EMAIL_CHILD = of("blog_email_child")

            @JvmField val CASE_STUDY = of("case_study")

            @JvmField val CASE_STUDY_INSTANCE_LAYOUT = of("case_study_instance_layout")

            @JvmField val CASE_STUDY_LISTING = of("case_study_listing")

            @JvmField val DISCARDABLE_STUB = of("discardable_stub")

            @JvmField val IMPORTED_BLOG_POST = of("imported_blog_post")

            @JvmField val KB_404_PAGE = of("kb_404_page")

            @JvmField val KB_ARTICLE_INSTANCE_LAYOUT = of("kb_article_instance_layout")

            @JvmField val KB_LISTING = of("kb_listing")

            @JvmField val KB_SEARCH_RESULTS = of("kb_search_results")

            @JvmField val KB_SUPPORT_FORM = of("kb_support_form")

            @JvmField val LANDING_PAGE = of("landing_page")

            @JvmField val LEGACY_BLOG_POST = of("legacy_blog_post")

            @JvmField val LEGACY_PAGE = of("legacy_page")

            @JvmField val LOCALTIME = of("localtime")

            @JvmField val MANAGE_PREFERENCES_EMAIL = of("manage_preferences_email")

            @JvmField val MARKETING_SINGLE_SEND_API = of("marketing_single_send_api")

            @JvmField val MEMBERSHIP_EMAIL_VERIFICATION = of("membership_email_verification")

            @JvmField val MEMBERSHIP_FOLLOW_UP = of("membership_follow_up")

            @JvmField val MEMBERSHIP_OTP_LOGIN = of("membership_otp_login")

            @JvmField val MEMBERSHIP_PASSWORD_RESET = of("membership_password_reset")

            @JvmField val MEMBERSHIP_PASSWORD_SAVED = of("membership_password_saved")

            @JvmField val MEMBERSHIP_PASSWORDLESS_AUTH = of("membership_passwordless_auth")

            @JvmField val MEMBERSHIP_REGISTRATION = of("membership_registration")

            @JvmField
            val MEMBERSHIP_REGISTRATION_FOLLOW_UP = of("membership_registration_follow_up")

            @JvmField val MEMBERSHIP_VERIFICATION = of("membership_verification")

            @JvmField val NORMAL_BLOG_POST = of("normal_blog_post")

            @JvmField val OPTIN_EMAIL = of("optin_email")

            @JvmField val OPTIN_FOLLOWUP_EMAIL = of("optin_followup_email")

            @JvmField val PAGE_INSTANCE_LAYOUT = of("page_instance_layout")

            @JvmField val PAGE_STUB = of("page_stub")

            @JvmField val PERFORMABLE_LANDING_PAGE = of("performable_landing_page")

            @JvmField val PERFORMABLE_LANDING_PAGE_CUTOVER = of("performable_landing_page_cutover")

            @JvmField val PODCAST_INSTANCE_LAYOUT = of("podcast_instance_layout")

            @JvmField val PODCAST_LISTING = of("podcast_listing")

            @JvmField val PORTAL_CONTENT = of("portal_content")

            @JvmField val RESUBSCRIBE_CONFIRMATION_EMAIL = of("resubscribe_confirmation_email")

            @JvmField val RESUBSCRIBE_EMAIL = of("resubscribe_email")

            @JvmField val RSS_TO_EMAIL = of("rss_to_email")

            @JvmField val RSS_TO_EMAIL_CHILD = of("rss_to_email_child")

            @JvmField val SCP_INSTANCE_LAYOUT_PAGE = of("scp_instance_layout_page")

            @JvmField val SCP_STATIC_PAGE = of("scp_static_page")

            @JvmField val SINGLE_SEND_API = of("single_send_api")

            @JvmField val SITE_PAGE = of("site_page")

            @JvmField val SMTP_TOKEN = of("smtp_token")

            @JvmField val STAGED_PAGE = of("staged_page")

            @JvmField val TICKET_CLOSED_KICKBACK_EMAIL = of("ticket_closed_kickback_email")

            @JvmField val TICKET_OPENED_KICKBACK_EMAIL = of("ticket_opened_kickback_email")

            @JvmField val TICKET_PIPELINE_AUTOMATED = of("ticket_pipeline_automated")

            @JvmField val UNKNOWN = of("UNKNOWN")

            @JvmField val UNSUBSCRIBE_CONFIRMATION_EMAIL = of("unsubscribe_confirmation_email")

            @JvmField val WEB_INTERACTIVE = of("web_interactive")

            @JvmStatic fun of(value: String) = Subcategory(JsonField.of(value))
        }

        /** An enum containing [Subcategory]'s known values. */
        enum class Known {
            AB_LOSER_VARIANT,
            AB_LOSER_VARIANT_SITE_PAGE,
            AB_MASTER,
            AB_MASTER_SITE_PAGE,
            AB_VARIANT,
            AB_VARIANT_SITE_PAGE,
            AUTOMATED,
            AUTOMATED_AB_MASTER,
            AUTOMATED_AB_VARIANT,
            AUTOMATED_FOR_CRM,
            AUTOMATED_FOR_CUSTOM_SURVEY,
            AUTOMATED_FOR_DEAL,
            AUTOMATED_FOR_FEEDBACK_CES,
            AUTOMATED_FOR_FEEDBACK_CUSTOM,
            AUTOMATED_FOR_FEEDBACK_NPS,
            AUTOMATED_FOR_FORM,
            AUTOMATED_FOR_FORM_BUFFER,
            AUTOMATED_FOR_FORM_DRAFT,
            AUTOMATED_FOR_FORM_LEGACY,
            AUTOMATED_FOR_LEADFLOW,
            AUTOMATED_FOR_TICKET,
            BATCH,
            BLOG_ARTICLE_INSTANCE_LAYOUT,
            BLOG_ARTICLE_LISTING,
            BLOG_AUTHOR_DETAIL,
            BLOG_EMAIL,
            BLOG_EMAIL_CHILD,
            CASE_STUDY,
            CASE_STUDY_INSTANCE_LAYOUT,
            CASE_STUDY_LISTING,
            DISCARDABLE_STUB,
            IMPORTED_BLOG_POST,
            KB_404_PAGE,
            KB_ARTICLE_INSTANCE_LAYOUT,
            KB_LISTING,
            KB_SEARCH_RESULTS,
            KB_SUPPORT_FORM,
            LANDING_PAGE,
            LEGACY_BLOG_POST,
            LEGACY_PAGE,
            LOCALTIME,
            MANAGE_PREFERENCES_EMAIL,
            MARKETING_SINGLE_SEND_API,
            MEMBERSHIP_EMAIL_VERIFICATION,
            MEMBERSHIP_FOLLOW_UP,
            MEMBERSHIP_OTP_LOGIN,
            MEMBERSHIP_PASSWORD_RESET,
            MEMBERSHIP_PASSWORD_SAVED,
            MEMBERSHIP_PASSWORDLESS_AUTH,
            MEMBERSHIP_REGISTRATION,
            MEMBERSHIP_REGISTRATION_FOLLOW_UP,
            MEMBERSHIP_VERIFICATION,
            NORMAL_BLOG_POST,
            OPTIN_EMAIL,
            OPTIN_FOLLOWUP_EMAIL,
            PAGE_INSTANCE_LAYOUT,
            PAGE_STUB,
            PERFORMABLE_LANDING_PAGE,
            PERFORMABLE_LANDING_PAGE_CUTOVER,
            PODCAST_INSTANCE_LAYOUT,
            PODCAST_LISTING,
            PORTAL_CONTENT,
            RESUBSCRIBE_CONFIRMATION_EMAIL,
            RESUBSCRIBE_EMAIL,
            RSS_TO_EMAIL,
            RSS_TO_EMAIL_CHILD,
            SCP_INSTANCE_LAYOUT_PAGE,
            SCP_STATIC_PAGE,
            SINGLE_SEND_API,
            SITE_PAGE,
            SMTP_TOKEN,
            STAGED_PAGE,
            TICKET_CLOSED_KICKBACK_EMAIL,
            TICKET_OPENED_KICKBACK_EMAIL,
            TICKET_PIPELINE_AUTOMATED,
            UNKNOWN,
            UNSUBSCRIBE_CONFIRMATION_EMAIL,
            WEB_INTERACTIVE,
        }

        /**
         * An enum containing [Subcategory]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Subcategory] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AB_LOSER_VARIANT,
            AB_LOSER_VARIANT_SITE_PAGE,
            AB_MASTER,
            AB_MASTER_SITE_PAGE,
            AB_VARIANT,
            AB_VARIANT_SITE_PAGE,
            AUTOMATED,
            AUTOMATED_AB_MASTER,
            AUTOMATED_AB_VARIANT,
            AUTOMATED_FOR_CRM,
            AUTOMATED_FOR_CUSTOM_SURVEY,
            AUTOMATED_FOR_DEAL,
            AUTOMATED_FOR_FEEDBACK_CES,
            AUTOMATED_FOR_FEEDBACK_CUSTOM,
            AUTOMATED_FOR_FEEDBACK_NPS,
            AUTOMATED_FOR_FORM,
            AUTOMATED_FOR_FORM_BUFFER,
            AUTOMATED_FOR_FORM_DRAFT,
            AUTOMATED_FOR_FORM_LEGACY,
            AUTOMATED_FOR_LEADFLOW,
            AUTOMATED_FOR_TICKET,
            BATCH,
            BLOG_ARTICLE_INSTANCE_LAYOUT,
            BLOG_ARTICLE_LISTING,
            BLOG_AUTHOR_DETAIL,
            BLOG_EMAIL,
            BLOG_EMAIL_CHILD,
            CASE_STUDY,
            CASE_STUDY_INSTANCE_LAYOUT,
            CASE_STUDY_LISTING,
            DISCARDABLE_STUB,
            IMPORTED_BLOG_POST,
            KB_404_PAGE,
            KB_ARTICLE_INSTANCE_LAYOUT,
            KB_LISTING,
            KB_SEARCH_RESULTS,
            KB_SUPPORT_FORM,
            LANDING_PAGE,
            LEGACY_BLOG_POST,
            LEGACY_PAGE,
            LOCALTIME,
            MANAGE_PREFERENCES_EMAIL,
            MARKETING_SINGLE_SEND_API,
            MEMBERSHIP_EMAIL_VERIFICATION,
            MEMBERSHIP_FOLLOW_UP,
            MEMBERSHIP_OTP_LOGIN,
            MEMBERSHIP_PASSWORD_RESET,
            MEMBERSHIP_PASSWORD_SAVED,
            MEMBERSHIP_PASSWORDLESS_AUTH,
            MEMBERSHIP_REGISTRATION,
            MEMBERSHIP_REGISTRATION_FOLLOW_UP,
            MEMBERSHIP_VERIFICATION,
            NORMAL_BLOG_POST,
            OPTIN_EMAIL,
            OPTIN_FOLLOWUP_EMAIL,
            PAGE_INSTANCE_LAYOUT,
            PAGE_STUB,
            PERFORMABLE_LANDING_PAGE,
            PERFORMABLE_LANDING_PAGE_CUTOVER,
            PODCAST_INSTANCE_LAYOUT,
            PODCAST_LISTING,
            PORTAL_CONTENT,
            RESUBSCRIBE_CONFIRMATION_EMAIL,
            RESUBSCRIBE_EMAIL,
            RSS_TO_EMAIL,
            RSS_TO_EMAIL_CHILD,
            SCP_INSTANCE_LAYOUT_PAGE,
            SCP_STATIC_PAGE,
            SINGLE_SEND_API,
            SITE_PAGE,
            SMTP_TOKEN,
            STAGED_PAGE,
            TICKET_CLOSED_KICKBACK_EMAIL,
            TICKET_OPENED_KICKBACK_EMAIL,
            TICKET_PIPELINE_AUTOMATED,
            UNKNOWN,
            UNSUBSCRIBE_CONFIRMATION_EMAIL,
            WEB_INTERACTIVE,
            /**
             * An enum member indicating that [Subcategory] was instantiated with an unknown value.
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
                AB_LOSER_VARIANT -> Value.AB_LOSER_VARIANT
                AB_LOSER_VARIANT_SITE_PAGE -> Value.AB_LOSER_VARIANT_SITE_PAGE
                AB_MASTER -> Value.AB_MASTER
                AB_MASTER_SITE_PAGE -> Value.AB_MASTER_SITE_PAGE
                AB_VARIANT -> Value.AB_VARIANT
                AB_VARIANT_SITE_PAGE -> Value.AB_VARIANT_SITE_PAGE
                AUTOMATED -> Value.AUTOMATED
                AUTOMATED_AB_MASTER -> Value.AUTOMATED_AB_MASTER
                AUTOMATED_AB_VARIANT -> Value.AUTOMATED_AB_VARIANT
                AUTOMATED_FOR_CRM -> Value.AUTOMATED_FOR_CRM
                AUTOMATED_FOR_CUSTOM_SURVEY -> Value.AUTOMATED_FOR_CUSTOM_SURVEY
                AUTOMATED_FOR_DEAL -> Value.AUTOMATED_FOR_DEAL
                AUTOMATED_FOR_FEEDBACK_CES -> Value.AUTOMATED_FOR_FEEDBACK_CES
                AUTOMATED_FOR_FEEDBACK_CUSTOM -> Value.AUTOMATED_FOR_FEEDBACK_CUSTOM
                AUTOMATED_FOR_FEEDBACK_NPS -> Value.AUTOMATED_FOR_FEEDBACK_NPS
                AUTOMATED_FOR_FORM -> Value.AUTOMATED_FOR_FORM
                AUTOMATED_FOR_FORM_BUFFER -> Value.AUTOMATED_FOR_FORM_BUFFER
                AUTOMATED_FOR_FORM_DRAFT -> Value.AUTOMATED_FOR_FORM_DRAFT
                AUTOMATED_FOR_FORM_LEGACY -> Value.AUTOMATED_FOR_FORM_LEGACY
                AUTOMATED_FOR_LEADFLOW -> Value.AUTOMATED_FOR_LEADFLOW
                AUTOMATED_FOR_TICKET -> Value.AUTOMATED_FOR_TICKET
                BATCH -> Value.BATCH
                BLOG_ARTICLE_INSTANCE_LAYOUT -> Value.BLOG_ARTICLE_INSTANCE_LAYOUT
                BLOG_ARTICLE_LISTING -> Value.BLOG_ARTICLE_LISTING
                BLOG_AUTHOR_DETAIL -> Value.BLOG_AUTHOR_DETAIL
                BLOG_EMAIL -> Value.BLOG_EMAIL
                BLOG_EMAIL_CHILD -> Value.BLOG_EMAIL_CHILD
                CASE_STUDY -> Value.CASE_STUDY
                CASE_STUDY_INSTANCE_LAYOUT -> Value.CASE_STUDY_INSTANCE_LAYOUT
                CASE_STUDY_LISTING -> Value.CASE_STUDY_LISTING
                DISCARDABLE_STUB -> Value.DISCARDABLE_STUB
                IMPORTED_BLOG_POST -> Value.IMPORTED_BLOG_POST
                KB_404_PAGE -> Value.KB_404_PAGE
                KB_ARTICLE_INSTANCE_LAYOUT -> Value.KB_ARTICLE_INSTANCE_LAYOUT
                KB_LISTING -> Value.KB_LISTING
                KB_SEARCH_RESULTS -> Value.KB_SEARCH_RESULTS
                KB_SUPPORT_FORM -> Value.KB_SUPPORT_FORM
                LANDING_PAGE -> Value.LANDING_PAGE
                LEGACY_BLOG_POST -> Value.LEGACY_BLOG_POST
                LEGACY_PAGE -> Value.LEGACY_PAGE
                LOCALTIME -> Value.LOCALTIME
                MANAGE_PREFERENCES_EMAIL -> Value.MANAGE_PREFERENCES_EMAIL
                MARKETING_SINGLE_SEND_API -> Value.MARKETING_SINGLE_SEND_API
                MEMBERSHIP_EMAIL_VERIFICATION -> Value.MEMBERSHIP_EMAIL_VERIFICATION
                MEMBERSHIP_FOLLOW_UP -> Value.MEMBERSHIP_FOLLOW_UP
                MEMBERSHIP_OTP_LOGIN -> Value.MEMBERSHIP_OTP_LOGIN
                MEMBERSHIP_PASSWORD_RESET -> Value.MEMBERSHIP_PASSWORD_RESET
                MEMBERSHIP_PASSWORD_SAVED -> Value.MEMBERSHIP_PASSWORD_SAVED
                MEMBERSHIP_PASSWORDLESS_AUTH -> Value.MEMBERSHIP_PASSWORDLESS_AUTH
                MEMBERSHIP_REGISTRATION -> Value.MEMBERSHIP_REGISTRATION
                MEMBERSHIP_REGISTRATION_FOLLOW_UP -> Value.MEMBERSHIP_REGISTRATION_FOLLOW_UP
                MEMBERSHIP_VERIFICATION -> Value.MEMBERSHIP_VERIFICATION
                NORMAL_BLOG_POST -> Value.NORMAL_BLOG_POST
                OPTIN_EMAIL -> Value.OPTIN_EMAIL
                OPTIN_FOLLOWUP_EMAIL -> Value.OPTIN_FOLLOWUP_EMAIL
                PAGE_INSTANCE_LAYOUT -> Value.PAGE_INSTANCE_LAYOUT
                PAGE_STUB -> Value.PAGE_STUB
                PERFORMABLE_LANDING_PAGE -> Value.PERFORMABLE_LANDING_PAGE
                PERFORMABLE_LANDING_PAGE_CUTOVER -> Value.PERFORMABLE_LANDING_PAGE_CUTOVER
                PODCAST_INSTANCE_LAYOUT -> Value.PODCAST_INSTANCE_LAYOUT
                PODCAST_LISTING -> Value.PODCAST_LISTING
                PORTAL_CONTENT -> Value.PORTAL_CONTENT
                RESUBSCRIBE_CONFIRMATION_EMAIL -> Value.RESUBSCRIBE_CONFIRMATION_EMAIL
                RESUBSCRIBE_EMAIL -> Value.RESUBSCRIBE_EMAIL
                RSS_TO_EMAIL -> Value.RSS_TO_EMAIL
                RSS_TO_EMAIL_CHILD -> Value.RSS_TO_EMAIL_CHILD
                SCP_INSTANCE_LAYOUT_PAGE -> Value.SCP_INSTANCE_LAYOUT_PAGE
                SCP_STATIC_PAGE -> Value.SCP_STATIC_PAGE
                SINGLE_SEND_API -> Value.SINGLE_SEND_API
                SITE_PAGE -> Value.SITE_PAGE
                SMTP_TOKEN -> Value.SMTP_TOKEN
                STAGED_PAGE -> Value.STAGED_PAGE
                TICKET_CLOSED_KICKBACK_EMAIL -> Value.TICKET_CLOSED_KICKBACK_EMAIL
                TICKET_OPENED_KICKBACK_EMAIL -> Value.TICKET_OPENED_KICKBACK_EMAIL
                TICKET_PIPELINE_AUTOMATED -> Value.TICKET_PIPELINE_AUTOMATED
                UNKNOWN -> Value.UNKNOWN
                UNSUBSCRIBE_CONFIRMATION_EMAIL -> Value.UNSUBSCRIBE_CONFIRMATION_EMAIL
                WEB_INTERACTIVE -> Value.WEB_INTERACTIVE
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
                AB_LOSER_VARIANT -> Known.AB_LOSER_VARIANT
                AB_LOSER_VARIANT_SITE_PAGE -> Known.AB_LOSER_VARIANT_SITE_PAGE
                AB_MASTER -> Known.AB_MASTER
                AB_MASTER_SITE_PAGE -> Known.AB_MASTER_SITE_PAGE
                AB_VARIANT -> Known.AB_VARIANT
                AB_VARIANT_SITE_PAGE -> Known.AB_VARIANT_SITE_PAGE
                AUTOMATED -> Known.AUTOMATED
                AUTOMATED_AB_MASTER -> Known.AUTOMATED_AB_MASTER
                AUTOMATED_AB_VARIANT -> Known.AUTOMATED_AB_VARIANT
                AUTOMATED_FOR_CRM -> Known.AUTOMATED_FOR_CRM
                AUTOMATED_FOR_CUSTOM_SURVEY -> Known.AUTOMATED_FOR_CUSTOM_SURVEY
                AUTOMATED_FOR_DEAL -> Known.AUTOMATED_FOR_DEAL
                AUTOMATED_FOR_FEEDBACK_CES -> Known.AUTOMATED_FOR_FEEDBACK_CES
                AUTOMATED_FOR_FEEDBACK_CUSTOM -> Known.AUTOMATED_FOR_FEEDBACK_CUSTOM
                AUTOMATED_FOR_FEEDBACK_NPS -> Known.AUTOMATED_FOR_FEEDBACK_NPS
                AUTOMATED_FOR_FORM -> Known.AUTOMATED_FOR_FORM
                AUTOMATED_FOR_FORM_BUFFER -> Known.AUTOMATED_FOR_FORM_BUFFER
                AUTOMATED_FOR_FORM_DRAFT -> Known.AUTOMATED_FOR_FORM_DRAFT
                AUTOMATED_FOR_FORM_LEGACY -> Known.AUTOMATED_FOR_FORM_LEGACY
                AUTOMATED_FOR_LEADFLOW -> Known.AUTOMATED_FOR_LEADFLOW
                AUTOMATED_FOR_TICKET -> Known.AUTOMATED_FOR_TICKET
                BATCH -> Known.BATCH
                BLOG_ARTICLE_INSTANCE_LAYOUT -> Known.BLOG_ARTICLE_INSTANCE_LAYOUT
                BLOG_ARTICLE_LISTING -> Known.BLOG_ARTICLE_LISTING
                BLOG_AUTHOR_DETAIL -> Known.BLOG_AUTHOR_DETAIL
                BLOG_EMAIL -> Known.BLOG_EMAIL
                BLOG_EMAIL_CHILD -> Known.BLOG_EMAIL_CHILD
                CASE_STUDY -> Known.CASE_STUDY
                CASE_STUDY_INSTANCE_LAYOUT -> Known.CASE_STUDY_INSTANCE_LAYOUT
                CASE_STUDY_LISTING -> Known.CASE_STUDY_LISTING
                DISCARDABLE_STUB -> Known.DISCARDABLE_STUB
                IMPORTED_BLOG_POST -> Known.IMPORTED_BLOG_POST
                KB_404_PAGE -> Known.KB_404_PAGE
                KB_ARTICLE_INSTANCE_LAYOUT -> Known.KB_ARTICLE_INSTANCE_LAYOUT
                KB_LISTING -> Known.KB_LISTING
                KB_SEARCH_RESULTS -> Known.KB_SEARCH_RESULTS
                KB_SUPPORT_FORM -> Known.KB_SUPPORT_FORM
                LANDING_PAGE -> Known.LANDING_PAGE
                LEGACY_BLOG_POST -> Known.LEGACY_BLOG_POST
                LEGACY_PAGE -> Known.LEGACY_PAGE
                LOCALTIME -> Known.LOCALTIME
                MANAGE_PREFERENCES_EMAIL -> Known.MANAGE_PREFERENCES_EMAIL
                MARKETING_SINGLE_SEND_API -> Known.MARKETING_SINGLE_SEND_API
                MEMBERSHIP_EMAIL_VERIFICATION -> Known.MEMBERSHIP_EMAIL_VERIFICATION
                MEMBERSHIP_FOLLOW_UP -> Known.MEMBERSHIP_FOLLOW_UP
                MEMBERSHIP_OTP_LOGIN -> Known.MEMBERSHIP_OTP_LOGIN
                MEMBERSHIP_PASSWORD_RESET -> Known.MEMBERSHIP_PASSWORD_RESET
                MEMBERSHIP_PASSWORD_SAVED -> Known.MEMBERSHIP_PASSWORD_SAVED
                MEMBERSHIP_PASSWORDLESS_AUTH -> Known.MEMBERSHIP_PASSWORDLESS_AUTH
                MEMBERSHIP_REGISTRATION -> Known.MEMBERSHIP_REGISTRATION
                MEMBERSHIP_REGISTRATION_FOLLOW_UP -> Known.MEMBERSHIP_REGISTRATION_FOLLOW_UP
                MEMBERSHIP_VERIFICATION -> Known.MEMBERSHIP_VERIFICATION
                NORMAL_BLOG_POST -> Known.NORMAL_BLOG_POST
                OPTIN_EMAIL -> Known.OPTIN_EMAIL
                OPTIN_FOLLOWUP_EMAIL -> Known.OPTIN_FOLLOWUP_EMAIL
                PAGE_INSTANCE_LAYOUT -> Known.PAGE_INSTANCE_LAYOUT
                PAGE_STUB -> Known.PAGE_STUB
                PERFORMABLE_LANDING_PAGE -> Known.PERFORMABLE_LANDING_PAGE
                PERFORMABLE_LANDING_PAGE_CUTOVER -> Known.PERFORMABLE_LANDING_PAGE_CUTOVER
                PODCAST_INSTANCE_LAYOUT -> Known.PODCAST_INSTANCE_LAYOUT
                PODCAST_LISTING -> Known.PODCAST_LISTING
                PORTAL_CONTENT -> Known.PORTAL_CONTENT
                RESUBSCRIBE_CONFIRMATION_EMAIL -> Known.RESUBSCRIBE_CONFIRMATION_EMAIL
                RESUBSCRIBE_EMAIL -> Known.RESUBSCRIBE_EMAIL
                RSS_TO_EMAIL -> Known.RSS_TO_EMAIL
                RSS_TO_EMAIL_CHILD -> Known.RSS_TO_EMAIL_CHILD
                SCP_INSTANCE_LAYOUT_PAGE -> Known.SCP_INSTANCE_LAYOUT_PAGE
                SCP_STATIC_PAGE -> Known.SCP_STATIC_PAGE
                SINGLE_SEND_API -> Known.SINGLE_SEND_API
                SITE_PAGE -> Known.SITE_PAGE
                SMTP_TOKEN -> Known.SMTP_TOKEN
                STAGED_PAGE -> Known.STAGED_PAGE
                TICKET_CLOSED_KICKBACK_EMAIL -> Known.TICKET_CLOSED_KICKBACK_EMAIL
                TICKET_OPENED_KICKBACK_EMAIL -> Known.TICKET_OPENED_KICKBACK_EMAIL
                TICKET_PIPELINE_AUTOMATED -> Known.TICKET_PIPELINE_AUTOMATED
                UNKNOWN -> Known.UNKNOWN
                UNSUBSCRIBE_CONFIRMATION_EMAIL -> Known.UNSUBSCRIBE_CONFIRMATION_EMAIL
                WEB_INTERACTIVE -> Known.WEB_INTERACTIVE
                else -> throw HubSpotInvalidDataException("Unknown Subcategory: $value")
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
        fun validate(): Subcategory = apply {
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

            return other is Subcategory && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailUpdateRequest &&
            activeDomain == other.activeDomain &&
            archived == other.archived &&
            businessUnitId == other.businessUnitId &&
            campaign == other.campaign &&
            content == other.content &&
            folderIdV2 == other.folderIdV2 &&
            from == other.from &&
            jitterSendTime == other.jitterSendTime &&
            language == other.language &&
            name == other.name &&
            publishDate == other.publishDate &&
            rssData == other.rssData &&
            sendOnPublish == other.sendOnPublish &&
            state == other.state &&
            subcategory == other.subcategory &&
            subject == other.subject &&
            subscriptionDetails == other.subscriptionDetails &&
            testing == other.testing &&
            to == other.to &&
            webversion == other.webversion &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            activeDomain,
            archived,
            businessUnitId,
            campaign,
            content,
            folderIdV2,
            from,
            jitterSendTime,
            language,
            name,
            publishDate,
            rssData,
            sendOnPublish,
            state,
            subcategory,
            subject,
            subscriptionDetails,
            testing,
            to,
            webversion,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EmailUpdateRequest{activeDomain=$activeDomain, archived=$archived, businessUnitId=$businessUnitId, campaign=$campaign, content=$content, folderIdV2=$folderIdV2, from=$from, jitterSendTime=$jitterSendTime, language=$language, name=$name, publishDate=$publishDate, rssData=$rssData, sendOnPublish=$sendOnPublish, state=$state, subcategory=$subcategory, subject=$subject, subscriptionDetails=$subscriptionDetails, testing=$testing, to=$to, webversion=$webversion, additionalProperties=$additionalProperties}"
}
