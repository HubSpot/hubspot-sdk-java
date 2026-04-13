// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.domains

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.core.ExcludeMissing
import com.hubspot.core.JsonField
import com.hubspot.core.JsonMissing
import com.hubspot.core.JsonValue
import com.hubspot.core.checkRequired
import com.hubspot.errors.HubSpotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class Domain
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val correctCname: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val domain: JsonField<String>,
    private val isResolving: JsonField<Boolean>,
    private val isSslEnabled: JsonField<Boolean>,
    private val isSslOnly: JsonField<Boolean>,
    private val isUsedForBlogPost: JsonField<Boolean>,
    private val isUsedForEmail: JsonField<Boolean>,
    private val isUsedForKnowledge: JsonField<Boolean>,
    private val isUsedForLandingPage: JsonField<Boolean>,
    private val isUsedForSitePage: JsonField<Boolean>,
    private val manuallyMarkedAsResolving: JsonField<Boolean>,
    private val primaryBlogPost: JsonField<Boolean>,
    private val primaryEmail: JsonField<Boolean>,
    private val primaryKnowledge: JsonField<Boolean>,
    private val primaryLandingPage: JsonField<Boolean>,
    private val primarySitePage: JsonField<Boolean>,
    private val secondaryToDomain: JsonField<String>,
    private val updated: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("correctCname")
        @ExcludeMissing
        correctCname: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("domain") @ExcludeMissing domain: JsonField<String> = JsonMissing.of(),
        @JsonProperty("isResolving")
        @ExcludeMissing
        isResolving: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isSslEnabled")
        @ExcludeMissing
        isSslEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isSslOnly") @ExcludeMissing isSslOnly: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isUsedForBlogPost")
        @ExcludeMissing
        isUsedForBlogPost: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isUsedForEmail")
        @ExcludeMissing
        isUsedForEmail: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isUsedForKnowledge")
        @ExcludeMissing
        isUsedForKnowledge: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isUsedForLandingPage")
        @ExcludeMissing
        isUsedForLandingPage: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isUsedForSitePage")
        @ExcludeMissing
        isUsedForSitePage: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("manuallyMarkedAsResolving")
        @ExcludeMissing
        manuallyMarkedAsResolving: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("primaryBlogPost")
        @ExcludeMissing
        primaryBlogPost: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("primaryEmail")
        @ExcludeMissing
        primaryEmail: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("primaryKnowledge")
        @ExcludeMissing
        primaryKnowledge: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("primaryLandingPage")
        @ExcludeMissing
        primaryLandingPage: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("primarySitePage")
        @ExcludeMissing
        primarySitePage: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("secondaryToDomain")
        @ExcludeMissing
        secondaryToDomain: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated")
        @ExcludeMissing
        updated: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        correctCname,
        created,
        domain,
        isResolving,
        isSslEnabled,
        isSslOnly,
        isUsedForBlogPost,
        isUsedForEmail,
        isUsedForKnowledge,
        isUsedForLandingPage,
        isUsedForSitePage,
        manuallyMarkedAsResolving,
        primaryBlogPost,
        primaryEmail,
        primaryKnowledge,
        primaryLandingPage,
        primarySitePage,
        secondaryToDomain,
        updated,
        mutableMapOf(),
    )

    /**
     * The unique ID of this domain.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The expected CNAME record for the domain.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun correctCname(): String = correctCname.getRequired("correctCname")

    /**
     * The date and time when the domain was created.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * The actual domain or sub-domain. e.g. www.hubspot.com
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun domain(): String = domain.getRequired("domain")

    /**
     * Whether the DNS for this domain is optimally configured for use with HubSpot.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isResolving(): Boolean = isResolving.getRequired("isResolving")

    /**
     * Indicates whether SSL is enabled for the domain.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isSslEnabled(): Boolean = isSslEnabled.getRequired("isSslEnabled")

    /**
     * Indicates whether the domain is accessible only via SSL.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isSslOnly(): Boolean = isSslOnly.getRequired("isSslOnly")

    /**
     * Whether the domain is used for CMS blog posts.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isUsedForBlogPost(): Boolean = isUsedForBlogPost.getRequired("isUsedForBlogPost")

    /**
     * Whether the domain is used for CMS email web pages.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isUsedForEmail(): Boolean = isUsedForEmail.getRequired("isUsedForEmail")

    /**
     * Whether the domain is used for CMS knowledge pages.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isUsedForKnowledge(): Boolean = isUsedForKnowledge.getRequired("isUsedForKnowledge")

    /**
     * Whether the domain is used for CMS landing pages.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isUsedForLandingPage(): Boolean = isUsedForLandingPage.getRequired("isUsedForLandingPage")

    /**
     * Whether the domain is used for CMS site pages.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isUsedForSitePage(): Boolean = isUsedForSitePage.getRequired("isUsedForSitePage")

    /**
     * Indicates whether the domain has been manually marked as resolving.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun manuallyMarkedAsResolving(): Boolean =
        manuallyMarkedAsResolving.getRequired("manuallyMarkedAsResolving")

    /**
     * Indicates whether the domain is the primary domain for blog posts.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun primaryBlogPost(): Boolean = primaryBlogPost.getRequired("primaryBlogPost")

    /**
     * Indicates whether the domain is the primary domain for email pages.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun primaryEmail(): Boolean = primaryEmail.getRequired("primaryEmail")

    /**
     * Indicates whether the domain is the primary domain for knowledge pages.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun primaryKnowledge(): Boolean = primaryKnowledge.getRequired("primaryKnowledge")

    /**
     * Indicates whether the domain is the primary domain for landing pages.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun primaryLandingPage(): Boolean = primaryLandingPage.getRequired("primaryLandingPage")

    /**
     * Indicates whether the domain is the primary domain for site pages.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun primarySitePage(): Boolean = primarySitePage.getRequired("primarySitePage")

    /**
     * Specifies the domain to which this domain is secondary.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun secondaryToDomain(): String = secondaryToDomain.getRequired("secondaryToDomain")

    /**
     * The date and time when the domain was last updated.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [correctCname].
     *
     * Unlike [correctCname], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("correctCname")
    @ExcludeMissing
    fun _correctCname(): JsonField<String> = correctCname

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [domain].
     *
     * Unlike [domain], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("domain") @ExcludeMissing fun _domain(): JsonField<String> = domain

    /**
     * Returns the raw JSON value of [isResolving].
     *
     * Unlike [isResolving], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isResolving")
    @ExcludeMissing
    fun _isResolving(): JsonField<Boolean> = isResolving

    /**
     * Returns the raw JSON value of [isSslEnabled].
     *
     * Unlike [isSslEnabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isSslEnabled")
    @ExcludeMissing
    fun _isSslEnabled(): JsonField<Boolean> = isSslEnabled

    /**
     * Returns the raw JSON value of [isSslOnly].
     *
     * Unlike [isSslOnly], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isSslOnly") @ExcludeMissing fun _isSslOnly(): JsonField<Boolean> = isSslOnly

    /**
     * Returns the raw JSON value of [isUsedForBlogPost].
     *
     * Unlike [isUsedForBlogPost], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("isUsedForBlogPost")
    @ExcludeMissing
    fun _isUsedForBlogPost(): JsonField<Boolean> = isUsedForBlogPost

    /**
     * Returns the raw JSON value of [isUsedForEmail].
     *
     * Unlike [isUsedForEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isUsedForEmail")
    @ExcludeMissing
    fun _isUsedForEmail(): JsonField<Boolean> = isUsedForEmail

    /**
     * Returns the raw JSON value of [isUsedForKnowledge].
     *
     * Unlike [isUsedForKnowledge], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("isUsedForKnowledge")
    @ExcludeMissing
    fun _isUsedForKnowledge(): JsonField<Boolean> = isUsedForKnowledge

    /**
     * Returns the raw JSON value of [isUsedForLandingPage].
     *
     * Unlike [isUsedForLandingPage], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("isUsedForLandingPage")
    @ExcludeMissing
    fun _isUsedForLandingPage(): JsonField<Boolean> = isUsedForLandingPage

    /**
     * Returns the raw JSON value of [isUsedForSitePage].
     *
     * Unlike [isUsedForSitePage], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("isUsedForSitePage")
    @ExcludeMissing
    fun _isUsedForSitePage(): JsonField<Boolean> = isUsedForSitePage

    /**
     * Returns the raw JSON value of [manuallyMarkedAsResolving].
     *
     * Unlike [manuallyMarkedAsResolving], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("manuallyMarkedAsResolving")
    @ExcludeMissing
    fun _manuallyMarkedAsResolving(): JsonField<Boolean> = manuallyMarkedAsResolving

    /**
     * Returns the raw JSON value of [primaryBlogPost].
     *
     * Unlike [primaryBlogPost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("primaryBlogPost")
    @ExcludeMissing
    fun _primaryBlogPost(): JsonField<Boolean> = primaryBlogPost

    /**
     * Returns the raw JSON value of [primaryEmail].
     *
     * Unlike [primaryEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("primaryEmail")
    @ExcludeMissing
    fun _primaryEmail(): JsonField<Boolean> = primaryEmail

    /**
     * Returns the raw JSON value of [primaryKnowledge].
     *
     * Unlike [primaryKnowledge], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("primaryKnowledge")
    @ExcludeMissing
    fun _primaryKnowledge(): JsonField<Boolean> = primaryKnowledge

    /**
     * Returns the raw JSON value of [primaryLandingPage].
     *
     * Unlike [primaryLandingPage], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("primaryLandingPage")
    @ExcludeMissing
    fun _primaryLandingPage(): JsonField<Boolean> = primaryLandingPage

    /**
     * Returns the raw JSON value of [primarySitePage].
     *
     * Unlike [primarySitePage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("primarySitePage")
    @ExcludeMissing
    fun _primarySitePage(): JsonField<Boolean> = primarySitePage

    /**
     * Returns the raw JSON value of [secondaryToDomain].
     *
     * Unlike [secondaryToDomain], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("secondaryToDomain")
    @ExcludeMissing
    fun _secondaryToDomain(): JsonField<String> = secondaryToDomain

    /**
     * Returns the raw JSON value of [updated].
     *
     * Unlike [updated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

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
         * Returns a mutable builder for constructing an instance of [Domain].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .correctCname()
         * .created()
         * .domain()
         * .isResolving()
         * .isSslEnabled()
         * .isSslOnly()
         * .isUsedForBlogPost()
         * .isUsedForEmail()
         * .isUsedForKnowledge()
         * .isUsedForLandingPage()
         * .isUsedForSitePage()
         * .manuallyMarkedAsResolving()
         * .primaryBlogPost()
         * .primaryEmail()
         * .primaryKnowledge()
         * .primaryLandingPage()
         * .primarySitePage()
         * .secondaryToDomain()
         * .updated()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Domain]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var correctCname: JsonField<String>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var domain: JsonField<String>? = null
        private var isResolving: JsonField<Boolean>? = null
        private var isSslEnabled: JsonField<Boolean>? = null
        private var isSslOnly: JsonField<Boolean>? = null
        private var isUsedForBlogPost: JsonField<Boolean>? = null
        private var isUsedForEmail: JsonField<Boolean>? = null
        private var isUsedForKnowledge: JsonField<Boolean>? = null
        private var isUsedForLandingPage: JsonField<Boolean>? = null
        private var isUsedForSitePage: JsonField<Boolean>? = null
        private var manuallyMarkedAsResolving: JsonField<Boolean>? = null
        private var primaryBlogPost: JsonField<Boolean>? = null
        private var primaryEmail: JsonField<Boolean>? = null
        private var primaryKnowledge: JsonField<Boolean>? = null
        private var primaryLandingPage: JsonField<Boolean>? = null
        private var primarySitePage: JsonField<Boolean>? = null
        private var secondaryToDomain: JsonField<String>? = null
        private var updated: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(domain: Domain) = apply {
            id = domain.id
            correctCname = domain.correctCname
            created = domain.created
            this.domain = domain.domain
            isResolving = domain.isResolving
            isSslEnabled = domain.isSslEnabled
            isSslOnly = domain.isSslOnly
            isUsedForBlogPost = domain.isUsedForBlogPost
            isUsedForEmail = domain.isUsedForEmail
            isUsedForKnowledge = domain.isUsedForKnowledge
            isUsedForLandingPage = domain.isUsedForLandingPage
            isUsedForSitePage = domain.isUsedForSitePage
            manuallyMarkedAsResolving = domain.manuallyMarkedAsResolving
            primaryBlogPost = domain.primaryBlogPost
            primaryEmail = domain.primaryEmail
            primaryKnowledge = domain.primaryKnowledge
            primaryLandingPage = domain.primaryLandingPage
            primarySitePage = domain.primarySitePage
            secondaryToDomain = domain.secondaryToDomain
            updated = domain.updated
            additionalProperties = domain.additionalProperties.toMutableMap()
        }

        /** The unique ID of this domain. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The expected CNAME record for the domain. */
        fun correctCname(correctCname: String) = correctCname(JsonField.of(correctCname))

        /**
         * Sets [Builder.correctCname] to an arbitrary JSON value.
         *
         * You should usually call [Builder.correctCname] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun correctCname(correctCname: JsonField<String>) = apply {
            this.correctCname = correctCname
        }

        /** The date and time when the domain was created. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** The actual domain or sub-domain. e.g. www.hubspot.com */
        fun domain(domain: String) = domain(JsonField.of(domain))

        /**
         * Sets [Builder.domain] to an arbitrary JSON value.
         *
         * You should usually call [Builder.domain] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun domain(domain: JsonField<String>) = apply { this.domain = domain }

        /** Whether the DNS for this domain is optimally configured for use with HubSpot. */
        fun isResolving(isResolving: Boolean) = isResolving(JsonField.of(isResolving))

        /**
         * Sets [Builder.isResolving] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isResolving] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isResolving(isResolving: JsonField<Boolean>) = apply { this.isResolving = isResolving }

        /** Indicates whether SSL is enabled for the domain. */
        fun isSslEnabled(isSslEnabled: Boolean) = isSslEnabled(JsonField.of(isSslEnabled))

        /**
         * Sets [Builder.isSslEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isSslEnabled] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isSslEnabled(isSslEnabled: JsonField<Boolean>) = apply {
            this.isSslEnabled = isSslEnabled
        }

        /** Indicates whether the domain is accessible only via SSL. */
        fun isSslOnly(isSslOnly: Boolean) = isSslOnly(JsonField.of(isSslOnly))

        /**
         * Sets [Builder.isSslOnly] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isSslOnly] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isSslOnly(isSslOnly: JsonField<Boolean>) = apply { this.isSslOnly = isSslOnly }

        /** Whether the domain is used for CMS blog posts. */
        fun isUsedForBlogPost(isUsedForBlogPost: Boolean) =
            isUsedForBlogPost(JsonField.of(isUsedForBlogPost))

        /**
         * Sets [Builder.isUsedForBlogPost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isUsedForBlogPost] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isUsedForBlogPost(isUsedForBlogPost: JsonField<Boolean>) = apply {
            this.isUsedForBlogPost = isUsedForBlogPost
        }

        /** Whether the domain is used for CMS email web pages. */
        fun isUsedForEmail(isUsedForEmail: Boolean) = isUsedForEmail(JsonField.of(isUsedForEmail))

        /**
         * Sets [Builder.isUsedForEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isUsedForEmail] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isUsedForEmail(isUsedForEmail: JsonField<Boolean>) = apply {
            this.isUsedForEmail = isUsedForEmail
        }

        /** Whether the domain is used for CMS knowledge pages. */
        fun isUsedForKnowledge(isUsedForKnowledge: Boolean) =
            isUsedForKnowledge(JsonField.of(isUsedForKnowledge))

        /**
         * Sets [Builder.isUsedForKnowledge] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isUsedForKnowledge] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isUsedForKnowledge(isUsedForKnowledge: JsonField<Boolean>) = apply {
            this.isUsedForKnowledge = isUsedForKnowledge
        }

        /** Whether the domain is used for CMS landing pages. */
        fun isUsedForLandingPage(isUsedForLandingPage: Boolean) =
            isUsedForLandingPage(JsonField.of(isUsedForLandingPage))

        /**
         * Sets [Builder.isUsedForLandingPage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isUsedForLandingPage] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isUsedForLandingPage(isUsedForLandingPage: JsonField<Boolean>) = apply {
            this.isUsedForLandingPage = isUsedForLandingPage
        }

        /** Whether the domain is used for CMS site pages. */
        fun isUsedForSitePage(isUsedForSitePage: Boolean) =
            isUsedForSitePage(JsonField.of(isUsedForSitePage))

        /**
         * Sets [Builder.isUsedForSitePage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isUsedForSitePage] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isUsedForSitePage(isUsedForSitePage: JsonField<Boolean>) = apply {
            this.isUsedForSitePage = isUsedForSitePage
        }

        /** Indicates whether the domain has been manually marked as resolving. */
        fun manuallyMarkedAsResolving(manuallyMarkedAsResolving: Boolean) =
            manuallyMarkedAsResolving(JsonField.of(manuallyMarkedAsResolving))

        /**
         * Sets [Builder.manuallyMarkedAsResolving] to an arbitrary JSON value.
         *
         * You should usually call [Builder.manuallyMarkedAsResolving] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun manuallyMarkedAsResolving(manuallyMarkedAsResolving: JsonField<Boolean>) = apply {
            this.manuallyMarkedAsResolving = manuallyMarkedAsResolving
        }

        /** Indicates whether the domain is the primary domain for blog posts. */
        fun primaryBlogPost(primaryBlogPost: Boolean) =
            primaryBlogPost(JsonField.of(primaryBlogPost))

        /**
         * Sets [Builder.primaryBlogPost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryBlogPost] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun primaryBlogPost(primaryBlogPost: JsonField<Boolean>) = apply {
            this.primaryBlogPost = primaryBlogPost
        }

        /** Indicates whether the domain is the primary domain for email pages. */
        fun primaryEmail(primaryEmail: Boolean) = primaryEmail(JsonField.of(primaryEmail))

        /**
         * Sets [Builder.primaryEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryEmail] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun primaryEmail(primaryEmail: JsonField<Boolean>) = apply {
            this.primaryEmail = primaryEmail
        }

        /** Indicates whether the domain is the primary domain for knowledge pages. */
        fun primaryKnowledge(primaryKnowledge: Boolean) =
            primaryKnowledge(JsonField.of(primaryKnowledge))

        /**
         * Sets [Builder.primaryKnowledge] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryKnowledge] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun primaryKnowledge(primaryKnowledge: JsonField<Boolean>) = apply {
            this.primaryKnowledge = primaryKnowledge
        }

        /** Indicates whether the domain is the primary domain for landing pages. */
        fun primaryLandingPage(primaryLandingPage: Boolean) =
            primaryLandingPage(JsonField.of(primaryLandingPage))

        /**
         * Sets [Builder.primaryLandingPage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryLandingPage] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun primaryLandingPage(primaryLandingPage: JsonField<Boolean>) = apply {
            this.primaryLandingPage = primaryLandingPage
        }

        /** Indicates whether the domain is the primary domain for site pages. */
        fun primarySitePage(primarySitePage: Boolean) =
            primarySitePage(JsonField.of(primarySitePage))

        /**
         * Sets [Builder.primarySitePage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primarySitePage] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun primarySitePage(primarySitePage: JsonField<Boolean>) = apply {
            this.primarySitePage = primarySitePage
        }

        /** Specifies the domain to which this domain is secondary. */
        fun secondaryToDomain(secondaryToDomain: String) =
            secondaryToDomain(JsonField.of(secondaryToDomain))

        /**
         * Sets [Builder.secondaryToDomain] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secondaryToDomain] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun secondaryToDomain(secondaryToDomain: JsonField<String>) = apply {
            this.secondaryToDomain = secondaryToDomain
        }

        /** The date and time when the domain was last updated. */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /**
         * Sets [Builder.updated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

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
         * Returns an immutable instance of [Domain].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .correctCname()
         * .created()
         * .domain()
         * .isResolving()
         * .isSslEnabled()
         * .isSslOnly()
         * .isUsedForBlogPost()
         * .isUsedForEmail()
         * .isUsedForKnowledge()
         * .isUsedForLandingPage()
         * .isUsedForSitePage()
         * .manuallyMarkedAsResolving()
         * .primaryBlogPost()
         * .primaryEmail()
         * .primaryKnowledge()
         * .primaryLandingPage()
         * .primarySitePage()
         * .secondaryToDomain()
         * .updated()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Domain =
            Domain(
                checkRequired("id", id),
                checkRequired("correctCname", correctCname),
                checkRequired("created", created),
                checkRequired("domain", domain),
                checkRequired("isResolving", isResolving),
                checkRequired("isSslEnabled", isSslEnabled),
                checkRequired("isSslOnly", isSslOnly),
                checkRequired("isUsedForBlogPost", isUsedForBlogPost),
                checkRequired("isUsedForEmail", isUsedForEmail),
                checkRequired("isUsedForKnowledge", isUsedForKnowledge),
                checkRequired("isUsedForLandingPage", isUsedForLandingPage),
                checkRequired("isUsedForSitePage", isUsedForSitePage),
                checkRequired("manuallyMarkedAsResolving", manuallyMarkedAsResolving),
                checkRequired("primaryBlogPost", primaryBlogPost),
                checkRequired("primaryEmail", primaryEmail),
                checkRequired("primaryKnowledge", primaryKnowledge),
                checkRequired("primaryLandingPage", primaryLandingPage),
                checkRequired("primarySitePage", primarySitePage),
                checkRequired("secondaryToDomain", secondaryToDomain),
                checkRequired("updated", updated),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Domain = apply {
        if (validated) {
            return@apply
        }

        id()
        correctCname()
        created()
        domain()
        isResolving()
        isSslEnabled()
        isSslOnly()
        isUsedForBlogPost()
        isUsedForEmail()
        isUsedForKnowledge()
        isUsedForLandingPage()
        isUsedForSitePage()
        manuallyMarkedAsResolving()
        primaryBlogPost()
        primaryEmail()
        primaryKnowledge()
        primaryLandingPage()
        primarySitePage()
        secondaryToDomain()
        updated()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (correctCname.asKnown().isPresent) 1 else 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (if (domain.asKnown().isPresent) 1 else 0) +
            (if (isResolving.asKnown().isPresent) 1 else 0) +
            (if (isSslEnabled.asKnown().isPresent) 1 else 0) +
            (if (isSslOnly.asKnown().isPresent) 1 else 0) +
            (if (isUsedForBlogPost.asKnown().isPresent) 1 else 0) +
            (if (isUsedForEmail.asKnown().isPresent) 1 else 0) +
            (if (isUsedForKnowledge.asKnown().isPresent) 1 else 0) +
            (if (isUsedForLandingPage.asKnown().isPresent) 1 else 0) +
            (if (isUsedForSitePage.asKnown().isPresent) 1 else 0) +
            (if (manuallyMarkedAsResolving.asKnown().isPresent) 1 else 0) +
            (if (primaryBlogPost.asKnown().isPresent) 1 else 0) +
            (if (primaryEmail.asKnown().isPresent) 1 else 0) +
            (if (primaryKnowledge.asKnown().isPresent) 1 else 0) +
            (if (primaryLandingPage.asKnown().isPresent) 1 else 0) +
            (if (primarySitePage.asKnown().isPresent) 1 else 0) +
            (if (secondaryToDomain.asKnown().isPresent) 1 else 0) +
            (if (updated.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Domain &&
            id == other.id &&
            correctCname == other.correctCname &&
            created == other.created &&
            domain == other.domain &&
            isResolving == other.isResolving &&
            isSslEnabled == other.isSslEnabled &&
            isSslOnly == other.isSslOnly &&
            isUsedForBlogPost == other.isUsedForBlogPost &&
            isUsedForEmail == other.isUsedForEmail &&
            isUsedForKnowledge == other.isUsedForKnowledge &&
            isUsedForLandingPage == other.isUsedForLandingPage &&
            isUsedForSitePage == other.isUsedForSitePage &&
            manuallyMarkedAsResolving == other.manuallyMarkedAsResolving &&
            primaryBlogPost == other.primaryBlogPost &&
            primaryEmail == other.primaryEmail &&
            primaryKnowledge == other.primaryKnowledge &&
            primaryLandingPage == other.primaryLandingPage &&
            primarySitePage == other.primarySitePage &&
            secondaryToDomain == other.secondaryToDomain &&
            updated == other.updated &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            correctCname,
            created,
            domain,
            isResolving,
            isSslEnabled,
            isSslOnly,
            isUsedForBlogPost,
            isUsedForEmail,
            isUsedForKnowledge,
            isUsedForLandingPage,
            isUsedForSitePage,
            manuallyMarkedAsResolving,
            primaryBlogPost,
            primaryEmail,
            primaryKnowledge,
            primaryLandingPage,
            primarySitePage,
            secondaryToDomain,
            updated,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Domain{id=$id, correctCname=$correctCname, created=$created, domain=$domain, isResolving=$isResolving, isSslEnabled=$isSslEnabled, isSslOnly=$isSslOnly, isUsedForBlogPost=$isUsedForBlogPost, isUsedForEmail=$isUsedForEmail, isUsedForKnowledge=$isUsedForKnowledge, isUsedForLandingPage=$isUsedForLandingPage, isUsedForSitePage=$isUsedForSitePage, manuallyMarkedAsResolving=$manuallyMarkedAsResolving, primaryBlogPost=$primaryBlogPost, primaryEmail=$primaryEmail, primaryKnowledge=$primaryKnowledge, primaryLandingPage=$primaryLandingPage, primarySitePage=$primarySitePage, secondaryToDomain=$secondaryToDomain, updated=$updated, additionalProperties=$additionalProperties}"
}
