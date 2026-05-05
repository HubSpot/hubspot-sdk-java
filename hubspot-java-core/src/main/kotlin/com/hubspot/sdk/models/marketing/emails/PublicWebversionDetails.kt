// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.emails

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional

class PublicWebversionDetails
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val domain: JsonField<String>,
    private val enabled: JsonField<Boolean>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val isPageRedirected: JsonField<Boolean>,
    private val metaDescription: JsonField<String>,
    private val pageExpiryEnabled: JsonField<Boolean>,
    private val redirectToPageId: JsonField<String>,
    private val redirectToUrl: JsonField<String>,
    private val slug: JsonField<String>,
    private val title: JsonField<String>,
    private val url: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("domain") @ExcludeMissing domain: JsonField<String> = JsonMissing.of(),
        @JsonProperty("enabled") @ExcludeMissing enabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("expiresAt")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("isPageRedirected")
        @ExcludeMissing
        isPageRedirected: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("metaDescription")
        @ExcludeMissing
        metaDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pageExpiryEnabled")
        @ExcludeMissing
        pageExpiryEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("redirectToPageId")
        @ExcludeMissing
        redirectToPageId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("redirectToUrl")
        @ExcludeMissing
        redirectToUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("slug") @ExcludeMissing slug: JsonField<String> = JsonMissing.of(),
        @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
    ) : this(
        domain,
        enabled,
        expiresAt,
        isPageRedirected,
        metaDescription,
        pageExpiryEnabled,
        redirectToPageId,
        redirectToUrl,
        slug,
        title,
        url,
        mutableMapOf(),
    )

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun domain(): Optional<String> = domain.getOptional("domain")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enabled(): Optional<Boolean> = enabled.getOptional("enabled")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expiresAt(): Optional<OffsetDateTime> = expiresAt.getOptional("expiresAt")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isPageRedirected(): Optional<Boolean> = isPageRedirected.getOptional("isPageRedirected")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metaDescription(): Optional<String> = metaDescription.getOptional("metaDescription")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageExpiryEnabled(): Optional<Boolean> = pageExpiryEnabled.getOptional("pageExpiryEnabled")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun redirectToPageId(): Optional<String> = redirectToPageId.getOptional("redirectToPageId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun redirectToUrl(): Optional<String> = redirectToUrl.getOptional("redirectToUrl")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun slug(): Optional<String> = slug.getOptional("slug")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun title(): Optional<String> = title.getOptional("title")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun url(): Optional<String> = url.getOptional("url")

    /**
     * Returns the raw JSON value of [domain].
     *
     * Unlike [domain], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("domain") @ExcludeMissing fun _domain(): JsonField<String> = domain

    /**
     * Returns the raw JSON value of [enabled].
     *
     * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expiresAt")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

    /**
     * Returns the raw JSON value of [isPageRedirected].
     *
     * Unlike [isPageRedirected], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("isPageRedirected")
    @ExcludeMissing
    fun _isPageRedirected(): JsonField<Boolean> = isPageRedirected

    /**
     * Returns the raw JSON value of [metaDescription].
     *
     * Unlike [metaDescription], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metaDescription")
    @ExcludeMissing
    fun _metaDescription(): JsonField<String> = metaDescription

    /**
     * Returns the raw JSON value of [pageExpiryEnabled].
     *
     * Unlike [pageExpiryEnabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("pageExpiryEnabled")
    @ExcludeMissing
    fun _pageExpiryEnabled(): JsonField<Boolean> = pageExpiryEnabled

    /**
     * Returns the raw JSON value of [redirectToPageId].
     *
     * Unlike [redirectToPageId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("redirectToPageId")
    @ExcludeMissing
    fun _redirectToPageId(): JsonField<String> = redirectToPageId

    /**
     * Returns the raw JSON value of [redirectToUrl].
     *
     * Unlike [redirectToUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("redirectToUrl")
    @ExcludeMissing
    fun _redirectToUrl(): JsonField<String> = redirectToUrl

    /**
     * Returns the raw JSON value of [slug].
     *
     * Unlike [slug], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("slug") @ExcludeMissing fun _slug(): JsonField<String> = slug

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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

        /** Returns a mutable builder for constructing an instance of [PublicWebversionDetails]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicWebversionDetails]. */
    class Builder internal constructor() {

        private var domain: JsonField<String> = JsonMissing.of()
        private var enabled: JsonField<Boolean> = JsonMissing.of()
        private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var isPageRedirected: JsonField<Boolean> = JsonMissing.of()
        private var metaDescription: JsonField<String> = JsonMissing.of()
        private var pageExpiryEnabled: JsonField<Boolean> = JsonMissing.of()
        private var redirectToPageId: JsonField<String> = JsonMissing.of()
        private var redirectToUrl: JsonField<String> = JsonMissing.of()
        private var slug: JsonField<String> = JsonMissing.of()
        private var title: JsonField<String> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicWebversionDetails: PublicWebversionDetails) = apply {
            domain = publicWebversionDetails.domain
            enabled = publicWebversionDetails.enabled
            expiresAt = publicWebversionDetails.expiresAt
            isPageRedirected = publicWebversionDetails.isPageRedirected
            metaDescription = publicWebversionDetails.metaDescription
            pageExpiryEnabled = publicWebversionDetails.pageExpiryEnabled
            redirectToPageId = publicWebversionDetails.redirectToPageId
            redirectToUrl = publicWebversionDetails.redirectToUrl
            slug = publicWebversionDetails.slug
            title = publicWebversionDetails.title
            url = publicWebversionDetails.url
            additionalProperties = publicWebversionDetails.additionalProperties.toMutableMap()
        }

        fun domain(domain: String) = domain(JsonField.of(domain))

        /**
         * Sets [Builder.domain] to an arbitrary JSON value.
         *
         * You should usually call [Builder.domain] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun domain(domain: JsonField<String>) = apply { this.domain = domain }

        fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

        /**
         * Sets [Builder.enabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

        fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        fun isPageRedirected(isPageRedirected: Boolean) =
            isPageRedirected(JsonField.of(isPageRedirected))

        /**
         * Sets [Builder.isPageRedirected] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isPageRedirected] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isPageRedirected(isPageRedirected: JsonField<Boolean>) = apply {
            this.isPageRedirected = isPageRedirected
        }

        fun metaDescription(metaDescription: String) =
            metaDescription(JsonField.of(metaDescription))

        /**
         * Sets [Builder.metaDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metaDescription] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun metaDescription(metaDescription: JsonField<String>) = apply {
            this.metaDescription = metaDescription
        }

        fun pageExpiryEnabled(pageExpiryEnabled: Boolean) =
            pageExpiryEnabled(JsonField.of(pageExpiryEnabled))

        /**
         * Sets [Builder.pageExpiryEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageExpiryEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pageExpiryEnabled(pageExpiryEnabled: JsonField<Boolean>) = apply {
            this.pageExpiryEnabled = pageExpiryEnabled
        }

        fun redirectToPageId(redirectToPageId: String) =
            redirectToPageId(JsonField.of(redirectToPageId))

        /**
         * Sets [Builder.redirectToPageId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.redirectToPageId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun redirectToPageId(redirectToPageId: JsonField<String>) = apply {
            this.redirectToPageId = redirectToPageId
        }

        fun redirectToUrl(redirectToUrl: String) = redirectToUrl(JsonField.of(redirectToUrl))

        /**
         * Sets [Builder.redirectToUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.redirectToUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun redirectToUrl(redirectToUrl: JsonField<String>) = apply {
            this.redirectToUrl = redirectToUrl
        }

        fun slug(slug: String) = slug(JsonField.of(slug))

        /**
         * Sets [Builder.slug] to an arbitrary JSON value.
         *
         * You should usually call [Builder.slug] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun slug(slug: JsonField<String>) = apply { this.slug = slug }

        fun title(title: String) = title(JsonField.of(title))

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<String>) = apply { this.title = title }

        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

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
         * Returns an immutable instance of [PublicWebversionDetails].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PublicWebversionDetails =
            PublicWebversionDetails(
                domain,
                enabled,
                expiresAt,
                isPageRedirected,
                metaDescription,
                pageExpiryEnabled,
                redirectToPageId,
                redirectToUrl,
                slug,
                title,
                url,
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
    fun validate(): PublicWebversionDetails = apply {
        if (validated) {
            return@apply
        }

        domain()
        enabled()
        expiresAt()
        isPageRedirected()
        metaDescription()
        pageExpiryEnabled()
        redirectToPageId()
        redirectToUrl()
        slug()
        title()
        url()
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
        (if (domain.asKnown().isPresent) 1 else 0) +
            (if (enabled.asKnown().isPresent) 1 else 0) +
            (if (expiresAt.asKnown().isPresent) 1 else 0) +
            (if (isPageRedirected.asKnown().isPresent) 1 else 0) +
            (if (metaDescription.asKnown().isPresent) 1 else 0) +
            (if (pageExpiryEnabled.asKnown().isPresent) 1 else 0) +
            (if (redirectToPageId.asKnown().isPresent) 1 else 0) +
            (if (redirectToUrl.asKnown().isPresent) 1 else 0) +
            (if (slug.asKnown().isPresent) 1 else 0) +
            (if (title.asKnown().isPresent) 1 else 0) +
            (if (url.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicWebversionDetails &&
            domain == other.domain &&
            enabled == other.enabled &&
            expiresAt == other.expiresAt &&
            isPageRedirected == other.isPageRedirected &&
            metaDescription == other.metaDescription &&
            pageExpiryEnabled == other.pageExpiryEnabled &&
            redirectToPageId == other.redirectToPageId &&
            redirectToUrl == other.redirectToUrl &&
            slug == other.slug &&
            title == other.title &&
            url == other.url &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            domain,
            enabled,
            expiresAt,
            isPageRedirected,
            metaDescription,
            pageExpiryEnabled,
            redirectToPageId,
            redirectToUrl,
            slug,
            title,
            url,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicWebversionDetails{domain=$domain, enabled=$enabled, expiresAt=$expiresAt, isPageRedirected=$isPageRedirected, metaDescription=$metaDescription, pageExpiryEnabled=$pageExpiryEnabled, redirectToPageId=$redirectToPageId, redirectToUrl=$redirectToUrl, slug=$slug, title=$title, url=$url, additionalProperties=$additionalProperties}"
}
