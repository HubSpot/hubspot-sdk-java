// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ContentLanguageVariation
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<Long>,
    private val archivedInDashboard: JsonField<Boolean>,
    private val authorName: JsonField<String>,
    private val campaign: JsonField<String>,
    private val campaignName: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val name: JsonField<String>,
    private val password: JsonField<String>,
    private val publicAccessRules: JsonField<List<PublicAccessRule>>,
    private val publicAccessRulesEnabled: JsonField<Boolean>,
    private val publishDate: JsonField<OffsetDateTime>,
    private val slug: JsonField<String>,
    private val state: JsonField<String>,
    private val updated: JsonField<OffsetDateTime>,
    private val tagIds: JsonField<List<Long>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("archivedInDashboard")
        @ExcludeMissing
        archivedInDashboard: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("authorName")
        @ExcludeMissing
        authorName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("campaign") @ExcludeMissing campaign: JsonField<String> = JsonMissing.of(),
        @JsonProperty("campaignName")
        @ExcludeMissing
        campaignName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("password") @ExcludeMissing password: JsonField<String> = JsonMissing.of(),
        @JsonProperty("publicAccessRules")
        @ExcludeMissing
        publicAccessRules: JsonField<List<PublicAccessRule>> = JsonMissing.of(),
        @JsonProperty("publicAccessRulesEnabled")
        @ExcludeMissing
        publicAccessRulesEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("publishDate")
        @ExcludeMissing
        publishDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("slug") @ExcludeMissing slug: JsonField<String> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated")
        @ExcludeMissing
        updated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("tagIds") @ExcludeMissing tagIds: JsonField<List<Long>> = JsonMissing.of(),
    ) : this(
        id,
        archivedInDashboard,
        authorName,
        campaign,
        campaignName,
        created,
        name,
        password,
        publicAccessRules,
        publicAccessRulesEnabled,
        publishDate,
        slug,
        state,
        updated,
        tagIds,
        mutableMapOf(),
    )

    /**
     * ID of object to set as primary in multi-language group.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): Long = id.getRequired("id")

    /**
     * If True, the variant will not show up in your dashboard, although the post could still be
     * live.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun archivedInDashboard(): Boolean = archivedInDashboard.getRequired("archivedInDashboard")

    /**
     * The name of the user who last published the blog post. For posts that haven't been published
     * yet, this property will reflect the user who initially created the draft.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun authorName(): String = authorName.getRequired("authorName")

    /**
     * The GUID of the marketing campaign this page is a part of.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun campaign(): String = campaign.getRequired("campaign")

    /**
     * Name of the associated marketing campaign.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun campaignName(): String = campaignName.getRequired("campaignName")

    /**
     * The timestamp (ISO8601 format) when this Blog Post was created.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * The internal name of the content language variation.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Set this to create a password protected page. Entering the password will be required to view
     * the page.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun password(): String = password.getRequired("password")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun publicAccessRules(): List<PublicAccessRule> =
        publicAccessRules.getRequired("publicAccessRules")

    /**
     * Boolean to determine whether or not to respect publicAccessRules.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun publicAccessRulesEnabled(): Boolean =
        publicAccessRulesEnabled.getRequired("publicAccessRulesEnabled")

    /**
     * The date (ISO8601 format) the page is to be published at.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun publishDate(): OffsetDateTime = publishDate.getRequired("publishDate")

    /**
     * The path of the this page. This field is appended to the domain to construct the url of this
     * page.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun slug(): String = slug.getRequired("slug")

    /**
     * An ENUM describing the current state of this page.
     *
     * Maximum string length: 25
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun state(): String = state.getRequired("state")

    /**
     * The timestamp (ISO8601 format) when this Blog Post was updated.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tagIds(): Optional<List<Long>> = tagIds.getOptional("tagIds")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

    /**
     * Returns the raw JSON value of [archivedInDashboard].
     *
     * Unlike [archivedInDashboard], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("archivedInDashboard")
    @ExcludeMissing
    fun _archivedInDashboard(): JsonField<Boolean> = archivedInDashboard

    /**
     * Returns the raw JSON value of [authorName].
     *
     * Unlike [authorName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("authorName") @ExcludeMissing fun _authorName(): JsonField<String> = authorName

    /**
     * Returns the raw JSON value of [campaign].
     *
     * Unlike [campaign], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("campaign") @ExcludeMissing fun _campaign(): JsonField<String> = campaign

    /**
     * Returns the raw JSON value of [campaignName].
     *
     * Unlike [campaignName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("campaignName")
    @ExcludeMissing
    fun _campaignName(): JsonField<String> = campaignName

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [password].
     *
     * Unlike [password], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("password") @ExcludeMissing fun _password(): JsonField<String> = password

    /**
     * Returns the raw JSON value of [publicAccessRules].
     *
     * Unlike [publicAccessRules], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("publicAccessRules")
    @ExcludeMissing
    fun _publicAccessRules(): JsonField<List<PublicAccessRule>> = publicAccessRules

    /**
     * Returns the raw JSON value of [publicAccessRulesEnabled].
     *
     * Unlike [publicAccessRulesEnabled], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("publicAccessRulesEnabled")
    @ExcludeMissing
    fun _publicAccessRulesEnabled(): JsonField<Boolean> = publicAccessRulesEnabled

    /**
     * Returns the raw JSON value of [publishDate].
     *
     * Unlike [publishDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("publishDate")
    @ExcludeMissing
    fun _publishDate(): JsonField<OffsetDateTime> = publishDate

    /**
     * Returns the raw JSON value of [slug].
     *
     * Unlike [slug], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("slug") @ExcludeMissing fun _slug(): JsonField<String> = slug

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

    /**
     * Returns the raw JSON value of [updated].
     *
     * Unlike [updated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

    /**
     * Returns the raw JSON value of [tagIds].
     *
     * Unlike [tagIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tagIds") @ExcludeMissing fun _tagIds(): JsonField<List<Long>> = tagIds

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
         * Returns a mutable builder for constructing an instance of [ContentLanguageVariation].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .archivedInDashboard()
         * .authorName()
         * .campaign()
         * .campaignName()
         * .created()
         * .name()
         * .password()
         * .publicAccessRules()
         * .publicAccessRulesEnabled()
         * .publishDate()
         * .slug()
         * .state()
         * .updated()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContentLanguageVariation]. */
    class Builder internal constructor() {

        private var id: JsonField<Long>? = null
        private var archivedInDashboard: JsonField<Boolean>? = null
        private var authorName: JsonField<String>? = null
        private var campaign: JsonField<String>? = null
        private var campaignName: JsonField<String>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var name: JsonField<String>? = null
        private var password: JsonField<String>? = null
        private var publicAccessRules: JsonField<MutableList<PublicAccessRule>>? = null
        private var publicAccessRulesEnabled: JsonField<Boolean>? = null
        private var publishDate: JsonField<OffsetDateTime>? = null
        private var slug: JsonField<String>? = null
        private var state: JsonField<String>? = null
        private var updated: JsonField<OffsetDateTime>? = null
        private var tagIds: JsonField<MutableList<Long>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contentLanguageVariation: ContentLanguageVariation) = apply {
            id = contentLanguageVariation.id
            archivedInDashboard = contentLanguageVariation.archivedInDashboard
            authorName = contentLanguageVariation.authorName
            campaign = contentLanguageVariation.campaign
            campaignName = contentLanguageVariation.campaignName
            created = contentLanguageVariation.created
            name = contentLanguageVariation.name
            password = contentLanguageVariation.password
            publicAccessRules =
                contentLanguageVariation.publicAccessRules.map { it.toMutableList() }
            publicAccessRulesEnabled = contentLanguageVariation.publicAccessRulesEnabled
            publishDate = contentLanguageVariation.publishDate
            slug = contentLanguageVariation.slug
            state = contentLanguageVariation.state
            updated = contentLanguageVariation.updated
            tagIds = contentLanguageVariation.tagIds.map { it.toMutableList() }
            additionalProperties = contentLanguageVariation.additionalProperties.toMutableMap()
        }

        /** ID of object to set as primary in multi-language group. */
        fun id(id: Long) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<Long>) = apply { this.id = id }

        /**
         * If True, the variant will not show up in your dashboard, although the post could still be
         * live.
         */
        fun archivedInDashboard(archivedInDashboard: Boolean) =
            archivedInDashboard(JsonField.of(archivedInDashboard))

        /**
         * Sets [Builder.archivedInDashboard] to an arbitrary JSON value.
         *
         * You should usually call [Builder.archivedInDashboard] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun archivedInDashboard(archivedInDashboard: JsonField<Boolean>) = apply {
            this.archivedInDashboard = archivedInDashboard
        }

        /**
         * The name of the user who last published the blog post. For posts that haven't been
         * published yet, this property will reflect the user who initially created the draft.
         */
        fun authorName(authorName: String) = authorName(JsonField.of(authorName))

        /**
         * Sets [Builder.authorName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authorName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun authorName(authorName: JsonField<String>) = apply { this.authorName = authorName }

        /** The GUID of the marketing campaign this page is a part of. */
        fun campaign(campaign: String) = campaign(JsonField.of(campaign))

        /**
         * Sets [Builder.campaign] to an arbitrary JSON value.
         *
         * You should usually call [Builder.campaign] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun campaign(campaign: JsonField<String>) = apply { this.campaign = campaign }

        /** Name of the associated marketing campaign. */
        fun campaignName(campaignName: String) = campaignName(JsonField.of(campaignName))

        /**
         * Sets [Builder.campaignName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.campaignName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun campaignName(campaignName: JsonField<String>) = apply {
            this.campaignName = campaignName
        }

        /** The timestamp (ISO8601 format) when this Blog Post was created. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** The internal name of the content language variation. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * Set this to create a password protected page. Entering the password will be required to
         * view the page.
         */
        fun password(password: String) = password(JsonField.of(password))

        /**
         * Sets [Builder.password] to an arbitrary JSON value.
         *
         * You should usually call [Builder.password] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun password(password: JsonField<String>) = apply { this.password = password }

        fun publicAccessRules(publicAccessRules: List<PublicAccessRule>) =
            publicAccessRules(JsonField.of(publicAccessRules))

        /**
         * Sets [Builder.publicAccessRules] to an arbitrary JSON value.
         *
         * You should usually call [Builder.publicAccessRules] with a well-typed
         * `List<PublicAccessRule>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun publicAccessRules(publicAccessRules: JsonField<List<PublicAccessRule>>) = apply {
            this.publicAccessRules = publicAccessRules.map { it.toMutableList() }
        }

        /**
         * Adds a single [PublicAccessRule] to [publicAccessRules].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPublicAccessRule(publicAccessRule: PublicAccessRule) = apply {
            publicAccessRules =
                (publicAccessRules ?: JsonField.of(mutableListOf())).also {
                    checkKnown("publicAccessRules", it).add(publicAccessRule)
                }
        }

        /** Boolean to determine whether or not to respect publicAccessRules. */
        fun publicAccessRulesEnabled(publicAccessRulesEnabled: Boolean) =
            publicAccessRulesEnabled(JsonField.of(publicAccessRulesEnabled))

        /**
         * Sets [Builder.publicAccessRulesEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.publicAccessRulesEnabled] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun publicAccessRulesEnabled(publicAccessRulesEnabled: JsonField<Boolean>) = apply {
            this.publicAccessRulesEnabled = publicAccessRulesEnabled
        }

        /** The date (ISO8601 format) the page is to be published at. */
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

        /**
         * The path of the this page. This field is appended to the domain to construct the url of
         * this page.
         */
        fun slug(slug: String) = slug(JsonField.of(slug))

        /**
         * Sets [Builder.slug] to an arbitrary JSON value.
         *
         * You should usually call [Builder.slug] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun slug(slug: JsonField<String>) = apply { this.slug = slug }

        /**
         * An ENUM describing the current state of this page.
         *
         * Maximum string length: 25
         */
        fun state(state: String) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<String>) = apply { this.state = state }

        /** The timestamp (ISO8601 format) when this Blog Post was updated. */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /**
         * Sets [Builder.updated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

        fun tagIds(tagIds: List<Long>) = tagIds(JsonField.of(tagIds))

        /**
         * Sets [Builder.tagIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tagIds] with a well-typed `List<Long>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tagIds(tagIds: JsonField<List<Long>>) = apply {
            this.tagIds = tagIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [Long] to [tagIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTagId(tagId: Long) = apply {
            tagIds =
                (tagIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("tagIds", it).add(tagId)
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
         * Returns an immutable instance of [ContentLanguageVariation].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .archivedInDashboard()
         * .authorName()
         * .campaign()
         * .campaignName()
         * .created()
         * .name()
         * .password()
         * .publicAccessRules()
         * .publicAccessRulesEnabled()
         * .publishDate()
         * .slug()
         * .state()
         * .updated()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ContentLanguageVariation =
            ContentLanguageVariation(
                checkRequired("id", id),
                checkRequired("archivedInDashboard", archivedInDashboard),
                checkRequired("authorName", authorName),
                checkRequired("campaign", campaign),
                checkRequired("campaignName", campaignName),
                checkRequired("created", created),
                checkRequired("name", name),
                checkRequired("password", password),
                checkRequired("publicAccessRules", publicAccessRules).map { it.toImmutable() },
                checkRequired("publicAccessRulesEnabled", publicAccessRulesEnabled),
                checkRequired("publishDate", publishDate),
                checkRequired("slug", slug),
                checkRequired("state", state),
                checkRequired("updated", updated),
                (tagIds ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ContentLanguageVariation = apply {
        if (validated) {
            return@apply
        }

        id()
        archivedInDashboard()
        authorName()
        campaign()
        campaignName()
        created()
        name()
        password()
        publicAccessRules().forEach { it.validate() }
        publicAccessRulesEnabled()
        publishDate()
        slug()
        state()
        updated()
        tagIds()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (archivedInDashboard.asKnown().isPresent) 1 else 0) +
            (if (authorName.asKnown().isPresent) 1 else 0) +
            (if (campaign.asKnown().isPresent) 1 else 0) +
            (if (campaignName.asKnown().isPresent) 1 else 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (password.asKnown().isPresent) 1 else 0) +
            (publicAccessRules.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (publicAccessRulesEnabled.asKnown().isPresent) 1 else 0) +
            (if (publishDate.asKnown().isPresent) 1 else 0) +
            (if (slug.asKnown().isPresent) 1 else 0) +
            (if (state.asKnown().isPresent) 1 else 0) +
            (if (updated.asKnown().isPresent) 1 else 0) +
            (tagIds.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContentLanguageVariation &&
            id == other.id &&
            archivedInDashboard == other.archivedInDashboard &&
            authorName == other.authorName &&
            campaign == other.campaign &&
            campaignName == other.campaignName &&
            created == other.created &&
            name == other.name &&
            password == other.password &&
            publicAccessRules == other.publicAccessRules &&
            publicAccessRulesEnabled == other.publicAccessRulesEnabled &&
            publishDate == other.publishDate &&
            slug == other.slug &&
            state == other.state &&
            updated == other.updated &&
            tagIds == other.tagIds &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            archivedInDashboard,
            authorName,
            campaign,
            campaignName,
            created,
            name,
            password,
            publicAccessRules,
            publicAccessRulesEnabled,
            publishDate,
            slug,
            state,
            updated,
            tagIds,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ContentLanguageVariation{id=$id, archivedInDashboard=$archivedInDashboard, authorName=$authorName, campaign=$campaign, campaignName=$campaignName, created=$created, name=$name, password=$password, publicAccessRules=$publicAccessRules, publicAccessRulesEnabled=$publicAccessRulesEnabled, publishDate=$publishDate, slug=$slug, state=$state, updated=$updated, tagIds=$tagIds, additionalProperties=$additionalProperties}"
}
