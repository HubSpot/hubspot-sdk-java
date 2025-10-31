// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.urlredirects

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional

class UrlRedirectGetResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val destination: JsonField<String>,
    private val isMatchFullUrl: JsonField<Boolean>,
    private val isMatchQueryString: JsonField<Boolean>,
    private val isOnlyAfterNotFound: JsonField<Boolean>,
    private val isPattern: JsonField<Boolean>,
    private val isProtocolAgnostic: JsonField<Boolean>,
    private val isTrailingSlashOptional: JsonField<Boolean>,
    private val precedence: JsonField<Int>,
    private val redirectStyle: JsonField<Int>,
    private val routePrefix: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val updated: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("destination")
        @ExcludeMissing
        destination: JsonField<String> = JsonMissing.of(),
        @JsonProperty("isMatchFullUrl")
        @ExcludeMissing
        isMatchFullUrl: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isMatchQueryString")
        @ExcludeMissing
        isMatchQueryString: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isOnlyAfterNotFound")
        @ExcludeMissing
        isOnlyAfterNotFound: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isPattern") @ExcludeMissing isPattern: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isProtocolAgnostic")
        @ExcludeMissing
        isProtocolAgnostic: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isTrailingSlashOptional")
        @ExcludeMissing
        isTrailingSlashOptional: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("precedence") @ExcludeMissing precedence: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("redirectStyle")
        @ExcludeMissing
        redirectStyle: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("routePrefix")
        @ExcludeMissing
        routePrefix: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updated")
        @ExcludeMissing
        updated: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        destination,
        isMatchFullUrl,
        isMatchQueryString,
        isOnlyAfterNotFound,
        isPattern,
        isProtocolAgnostic,
        isTrailingSlashOptional,
        precedence,
        redirectStyle,
        routePrefix,
        created,
        updated,
        mutableMapOf(),
    )

    /**
     * The unique ID of this URL redirect.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The destination URL, where the target URL should be redirected if it matches the
     * `routePrefix`.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun destination(): String = destination.getRequired("destination")

    /**
     * Whether the `routePrefix` should match on the entire URL, including the domain.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isMatchFullUrl(): Boolean = isMatchFullUrl.getRequired("isMatchFullUrl")

    /**
     * Whether the `routePrefix` should match on the entire URL path, including the query string.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isMatchQueryString(): Boolean = isMatchQueryString.getRequired("isMatchQueryString")

    /**
     * Whether the URL redirect mapping should apply only if a live page on the URL isn't found. If
     * False, the URL redirect mapping will take precedence over any existing page.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isOnlyAfterNotFound(): Boolean = isOnlyAfterNotFound.getRequired("isOnlyAfterNotFound")

    /**
     * Whether the `routePrefix` should match based on pattern.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isPattern(): Boolean = isPattern.getRequired("isPattern")

    /**
     * Whether the `routePrefix` should match both HTTP and HTTPS protocols.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isProtocolAgnostic(): Boolean = isProtocolAgnostic.getRequired("isProtocolAgnostic")

    /**
     * Whether a trailing slash will be ignored.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isTrailingSlashOptional(): Boolean =
        isTrailingSlashOptional.getRequired("isTrailingSlashOptional")

    /**
     * Used to prioritize URL redirection. If a given URL matches more than one redirect, the one
     * with the **lower** precedence will be used.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun precedence(): Int = precedence.getRequired("precedence")

    /**
     * The type of redirect to create. Options include: 301 (permanent), 302 (temporary), or 305
     * (proxy). Find more details
     * [here](https://knowledge.hubspot.com/cos-general/how-to-redirect-a-hubspot-page).
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun redirectStyle(): Int = redirectStyle.getRequired("redirectStyle")

    /**
     * The target incoming URL, path, or pattern to match for redirection.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun routePrefix(): String = routePrefix.getRequired("routePrefix")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun created(): Optional<OffsetDateTime> = created.getOptional("created")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updated(): Optional<OffsetDateTime> = updated.getOptional("updated")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [destination].
     *
     * Unlike [destination], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("destination") @ExcludeMissing fun _destination(): JsonField<String> = destination

    /**
     * Returns the raw JSON value of [isMatchFullUrl].
     *
     * Unlike [isMatchFullUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isMatchFullUrl")
    @ExcludeMissing
    fun _isMatchFullUrl(): JsonField<Boolean> = isMatchFullUrl

    /**
     * Returns the raw JSON value of [isMatchQueryString].
     *
     * Unlike [isMatchQueryString], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("isMatchQueryString")
    @ExcludeMissing
    fun _isMatchQueryString(): JsonField<Boolean> = isMatchQueryString

    /**
     * Returns the raw JSON value of [isOnlyAfterNotFound].
     *
     * Unlike [isOnlyAfterNotFound], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("isOnlyAfterNotFound")
    @ExcludeMissing
    fun _isOnlyAfterNotFound(): JsonField<Boolean> = isOnlyAfterNotFound

    /**
     * Returns the raw JSON value of [isPattern].
     *
     * Unlike [isPattern], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isPattern") @ExcludeMissing fun _isPattern(): JsonField<Boolean> = isPattern

    /**
     * Returns the raw JSON value of [isProtocolAgnostic].
     *
     * Unlike [isProtocolAgnostic], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("isProtocolAgnostic")
    @ExcludeMissing
    fun _isProtocolAgnostic(): JsonField<Boolean> = isProtocolAgnostic

    /**
     * Returns the raw JSON value of [isTrailingSlashOptional].
     *
     * Unlike [isTrailingSlashOptional], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("isTrailingSlashOptional")
    @ExcludeMissing
    fun _isTrailingSlashOptional(): JsonField<Boolean> = isTrailingSlashOptional

    /**
     * Returns the raw JSON value of [precedence].
     *
     * Unlike [precedence], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("precedence") @ExcludeMissing fun _precedence(): JsonField<Int> = precedence

    /**
     * Returns the raw JSON value of [redirectStyle].
     *
     * Unlike [redirectStyle], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("redirectStyle")
    @ExcludeMissing
    fun _redirectStyle(): JsonField<Int> = redirectStyle

    /**
     * Returns the raw JSON value of [routePrefix].
     *
     * Unlike [routePrefix], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("routePrefix") @ExcludeMissing fun _routePrefix(): JsonField<String> = routePrefix

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

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
         * Returns a mutable builder for constructing an instance of [UrlRedirectGetResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .destination()
         * .isMatchFullUrl()
         * .isMatchQueryString()
         * .isOnlyAfterNotFound()
         * .isPattern()
         * .isProtocolAgnostic()
         * .isTrailingSlashOptional()
         * .precedence()
         * .redirectStyle()
         * .routePrefix()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UrlRedirectGetResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var destination: JsonField<String>? = null
        private var isMatchFullUrl: JsonField<Boolean>? = null
        private var isMatchQueryString: JsonField<Boolean>? = null
        private var isOnlyAfterNotFound: JsonField<Boolean>? = null
        private var isPattern: JsonField<Boolean>? = null
        private var isProtocolAgnostic: JsonField<Boolean>? = null
        private var isTrailingSlashOptional: JsonField<Boolean>? = null
        private var precedence: JsonField<Int>? = null
        private var redirectStyle: JsonField<Int>? = null
        private var routePrefix: JsonField<String>? = null
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(urlRedirectGetResponse: UrlRedirectGetResponse) = apply {
            id = urlRedirectGetResponse.id
            destination = urlRedirectGetResponse.destination
            isMatchFullUrl = urlRedirectGetResponse.isMatchFullUrl
            isMatchQueryString = urlRedirectGetResponse.isMatchQueryString
            isOnlyAfterNotFound = urlRedirectGetResponse.isOnlyAfterNotFound
            isPattern = urlRedirectGetResponse.isPattern
            isProtocolAgnostic = urlRedirectGetResponse.isProtocolAgnostic
            isTrailingSlashOptional = urlRedirectGetResponse.isTrailingSlashOptional
            precedence = urlRedirectGetResponse.precedence
            redirectStyle = urlRedirectGetResponse.redirectStyle
            routePrefix = urlRedirectGetResponse.routePrefix
            created = urlRedirectGetResponse.created
            updated = urlRedirectGetResponse.updated
            additionalProperties = urlRedirectGetResponse.additionalProperties.toMutableMap()
        }

        /** The unique ID of this URL redirect. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The destination URL, where the target URL should be redirected if it matches the
         * `routePrefix`.
         */
        fun destination(destination: String) = destination(JsonField.of(destination))

        /**
         * Sets [Builder.destination] to an arbitrary JSON value.
         *
         * You should usually call [Builder.destination] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun destination(destination: JsonField<String>) = apply { this.destination = destination }

        /** Whether the `routePrefix` should match on the entire URL, including the domain. */
        fun isMatchFullUrl(isMatchFullUrl: Boolean) = isMatchFullUrl(JsonField.of(isMatchFullUrl))

        /**
         * Sets [Builder.isMatchFullUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isMatchFullUrl] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isMatchFullUrl(isMatchFullUrl: JsonField<Boolean>) = apply {
            this.isMatchFullUrl = isMatchFullUrl
        }

        /**
         * Whether the `routePrefix` should match on the entire URL path, including the query
         * string.
         */
        fun isMatchQueryString(isMatchQueryString: Boolean) =
            isMatchQueryString(JsonField.of(isMatchQueryString))

        /**
         * Sets [Builder.isMatchQueryString] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isMatchQueryString] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isMatchQueryString(isMatchQueryString: JsonField<Boolean>) = apply {
            this.isMatchQueryString = isMatchQueryString
        }

        /**
         * Whether the URL redirect mapping should apply only if a live page on the URL isn't found.
         * If False, the URL redirect mapping will take precedence over any existing page.
         */
        fun isOnlyAfterNotFound(isOnlyAfterNotFound: Boolean) =
            isOnlyAfterNotFound(JsonField.of(isOnlyAfterNotFound))

        /**
         * Sets [Builder.isOnlyAfterNotFound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isOnlyAfterNotFound] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isOnlyAfterNotFound(isOnlyAfterNotFound: JsonField<Boolean>) = apply {
            this.isOnlyAfterNotFound = isOnlyAfterNotFound
        }

        /** Whether the `routePrefix` should match based on pattern. */
        fun isPattern(isPattern: Boolean) = isPattern(JsonField.of(isPattern))

        /**
         * Sets [Builder.isPattern] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isPattern] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isPattern(isPattern: JsonField<Boolean>) = apply { this.isPattern = isPattern }

        /** Whether the `routePrefix` should match both HTTP and HTTPS protocols. */
        fun isProtocolAgnostic(isProtocolAgnostic: Boolean) =
            isProtocolAgnostic(JsonField.of(isProtocolAgnostic))

        /**
         * Sets [Builder.isProtocolAgnostic] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isProtocolAgnostic] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isProtocolAgnostic(isProtocolAgnostic: JsonField<Boolean>) = apply {
            this.isProtocolAgnostic = isProtocolAgnostic
        }

        /** Whether a trailing slash will be ignored. */
        fun isTrailingSlashOptional(isTrailingSlashOptional: Boolean) =
            isTrailingSlashOptional(JsonField.of(isTrailingSlashOptional))

        /**
         * Sets [Builder.isTrailingSlashOptional] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isTrailingSlashOptional] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun isTrailingSlashOptional(isTrailingSlashOptional: JsonField<Boolean>) = apply {
            this.isTrailingSlashOptional = isTrailingSlashOptional
        }

        /**
         * Used to prioritize URL redirection. If a given URL matches more than one redirect, the
         * one with the **lower** precedence will be used.
         */
        fun precedence(precedence: Int) = precedence(JsonField.of(precedence))

        /**
         * Sets [Builder.precedence] to an arbitrary JSON value.
         *
         * You should usually call [Builder.precedence] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun precedence(precedence: JsonField<Int>) = apply { this.precedence = precedence }

        /**
         * The type of redirect to create. Options include: 301 (permanent), 302 (temporary), or 305
         * (proxy). Find more details
         * [here](https://knowledge.hubspot.com/cos-general/how-to-redirect-a-hubspot-page).
         */
        fun redirectStyle(redirectStyle: Int) = redirectStyle(JsonField.of(redirectStyle))

        /**
         * Sets [Builder.redirectStyle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.redirectStyle] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun redirectStyle(redirectStyle: JsonField<Int>) = apply {
            this.redirectStyle = redirectStyle
        }

        /** The target incoming URL, path, or pattern to match for redirection. */
        fun routePrefix(routePrefix: String) = routePrefix(JsonField.of(routePrefix))

        /**
         * Sets [Builder.routePrefix] to an arbitrary JSON value.
         *
         * You should usually call [Builder.routePrefix] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun routePrefix(routePrefix: JsonField<String>) = apply { this.routePrefix = routePrefix }

        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

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
         * Returns an immutable instance of [UrlRedirectGetResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .destination()
         * .isMatchFullUrl()
         * .isMatchQueryString()
         * .isOnlyAfterNotFound()
         * .isPattern()
         * .isProtocolAgnostic()
         * .isTrailingSlashOptional()
         * .precedence()
         * .redirectStyle()
         * .routePrefix()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UrlRedirectGetResponse =
            UrlRedirectGetResponse(
                checkRequired("id", id),
                checkRequired("destination", destination),
                checkRequired("isMatchFullUrl", isMatchFullUrl),
                checkRequired("isMatchQueryString", isMatchQueryString),
                checkRequired("isOnlyAfterNotFound", isOnlyAfterNotFound),
                checkRequired("isPattern", isPattern),
                checkRequired("isProtocolAgnostic", isProtocolAgnostic),
                checkRequired("isTrailingSlashOptional", isTrailingSlashOptional),
                checkRequired("precedence", precedence),
                checkRequired("redirectStyle", redirectStyle),
                checkRequired("routePrefix", routePrefix),
                created,
                updated,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UrlRedirectGetResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        destination()
        isMatchFullUrl()
        isMatchQueryString()
        isOnlyAfterNotFound()
        isPattern()
        isProtocolAgnostic()
        isTrailingSlashOptional()
        precedence()
        redirectStyle()
        routePrefix()
        created()
        updated()
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
            (if (destination.asKnown().isPresent) 1 else 0) +
            (if (isMatchFullUrl.asKnown().isPresent) 1 else 0) +
            (if (isMatchQueryString.asKnown().isPresent) 1 else 0) +
            (if (isOnlyAfterNotFound.asKnown().isPresent) 1 else 0) +
            (if (isPattern.asKnown().isPresent) 1 else 0) +
            (if (isProtocolAgnostic.asKnown().isPresent) 1 else 0) +
            (if (isTrailingSlashOptional.asKnown().isPresent) 1 else 0) +
            (if (precedence.asKnown().isPresent) 1 else 0) +
            (if (redirectStyle.asKnown().isPresent) 1 else 0) +
            (if (routePrefix.asKnown().isPresent) 1 else 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (if (updated.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UrlRedirectGetResponse &&
            id == other.id &&
            destination == other.destination &&
            isMatchFullUrl == other.isMatchFullUrl &&
            isMatchQueryString == other.isMatchQueryString &&
            isOnlyAfterNotFound == other.isOnlyAfterNotFound &&
            isPattern == other.isPattern &&
            isProtocolAgnostic == other.isProtocolAgnostic &&
            isTrailingSlashOptional == other.isTrailingSlashOptional &&
            precedence == other.precedence &&
            redirectStyle == other.redirectStyle &&
            routePrefix == other.routePrefix &&
            created == other.created &&
            updated == other.updated &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            destination,
            isMatchFullUrl,
            isMatchQueryString,
            isOnlyAfterNotFound,
            isPattern,
            isProtocolAgnostic,
            isTrailingSlashOptional,
            precedence,
            redirectStyle,
            routePrefix,
            created,
            updated,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UrlRedirectGetResponse{id=$id, destination=$destination, isMatchFullUrl=$isMatchFullUrl, isMatchQueryString=$isMatchQueryString, isOnlyAfterNotFound=$isOnlyAfterNotFound, isPattern=$isPattern, isProtocolAgnostic=$isProtocolAgnostic, isTrailingSlashOptional=$isTrailingSlashOptional, precedence=$precedence, redirectStyle=$redirectStyle, routePrefix=$routePrefix, created=$created, updated=$updated, additionalProperties=$additionalProperties}"
}
