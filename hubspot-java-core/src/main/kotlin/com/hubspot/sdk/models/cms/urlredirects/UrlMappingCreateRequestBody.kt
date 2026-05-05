// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.urlredirects

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class UrlMappingCreateRequestBody
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val destination: JsonField<String>,
    private val redirectStyle: JsonField<Int>,
    private val routePrefix: JsonField<String>,
    private val isMatchFullUrl: JsonField<Boolean>,
    private val isMatchQueryString: JsonField<Boolean>,
    private val isOnlyAfterNotFound: JsonField<Boolean>,
    private val isPattern: JsonField<Boolean>,
    private val isProtocolAgnostic: JsonField<Boolean>,
    private val isTrailingSlashOptional: JsonField<Boolean>,
    private val precedence: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("destination")
        @ExcludeMissing
        destination: JsonField<String> = JsonMissing.of(),
        @JsonProperty("redirectStyle")
        @ExcludeMissing
        redirectStyle: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("routePrefix")
        @ExcludeMissing
        routePrefix: JsonField<String> = JsonMissing.of(),
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
    ) : this(
        destination,
        redirectStyle,
        routePrefix,
        isMatchFullUrl,
        isMatchQueryString,
        isOnlyAfterNotFound,
        isPattern,
        isProtocolAgnostic,
        isTrailingSlashOptional,
        precedence,
        mutableMapOf(),
    )

    /**
     * The destination URL, where the target URL should be redirected if it matches the
     * `routePrefix`.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun destination(): String = destination.getRequired("destination")

    /**
     * The type of redirect to create. Options include: 301 (permanent), 302 (temporary), or 305
     * (proxy). Find more details
     * [here](https://knowledge.hubspot.com/cos-general/how-to-redirect-a-hubspot-page).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun redirectStyle(): Int = redirectStyle.getRequired("redirectStyle")

    /**
     * The target incoming URL, path, or pattern to match for redirection.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun routePrefix(): String = routePrefix.getRequired("routePrefix")

    /**
     * Whether the `routePrefix` should match on the entire URL, including the domain.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isMatchFullUrl(): Optional<Boolean> = isMatchFullUrl.getOptional("isMatchFullUrl")

    /**
     * Whether the `routePrefix` should match on the entire URL path, including the query string.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isMatchQueryString(): Optional<Boolean> =
        isMatchQueryString.getOptional("isMatchQueryString")

    /**
     * Whether the URL redirect mapping should apply only if a live page on the URL isn't found. If
     * False, the URL redirect mapping will take precedence over any existing page.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isOnlyAfterNotFound(): Optional<Boolean> =
        isOnlyAfterNotFound.getOptional("isOnlyAfterNotFound")

    /**
     * Whether the `routePrefix` should match based on pattern.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isPattern(): Optional<Boolean> = isPattern.getOptional("isPattern")

    /**
     * Whether the `routePrefix` should match both HTTP and HTTPS protocols.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isProtocolAgnostic(): Optional<Boolean> =
        isProtocolAgnostic.getOptional("isProtocolAgnostic")

    /**
     * Whether a trailing slash will be ignored.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isTrailingSlashOptional(): Optional<Boolean> =
        isTrailingSlashOptional.getOptional("isTrailingSlashOptional")

    /**
     * Used to prioritize URL redirection. If a given URL matches more than one redirect, the one
     * with the **lower** precedence will be used.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun precedence(): Optional<Int> = precedence.getOptional("precedence")

    /**
     * Returns the raw JSON value of [destination].
     *
     * Unlike [destination], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("destination") @ExcludeMissing fun _destination(): JsonField<String> = destination

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
         * Returns a mutable builder for constructing an instance of [UrlMappingCreateRequestBody].
         *
         * The following fields are required:
         * ```java
         * .destination()
         * .redirectStyle()
         * .routePrefix()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UrlMappingCreateRequestBody]. */
    class Builder internal constructor() {

        private var destination: JsonField<String>? = null
        private var redirectStyle: JsonField<Int>? = null
        private var routePrefix: JsonField<String>? = null
        private var isMatchFullUrl: JsonField<Boolean> = JsonMissing.of()
        private var isMatchQueryString: JsonField<Boolean> = JsonMissing.of()
        private var isOnlyAfterNotFound: JsonField<Boolean> = JsonMissing.of()
        private var isPattern: JsonField<Boolean> = JsonMissing.of()
        private var isProtocolAgnostic: JsonField<Boolean> = JsonMissing.of()
        private var isTrailingSlashOptional: JsonField<Boolean> = JsonMissing.of()
        private var precedence: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(urlMappingCreateRequestBody: UrlMappingCreateRequestBody) = apply {
            destination = urlMappingCreateRequestBody.destination
            redirectStyle = urlMappingCreateRequestBody.redirectStyle
            routePrefix = urlMappingCreateRequestBody.routePrefix
            isMatchFullUrl = urlMappingCreateRequestBody.isMatchFullUrl
            isMatchQueryString = urlMappingCreateRequestBody.isMatchQueryString
            isOnlyAfterNotFound = urlMappingCreateRequestBody.isOnlyAfterNotFound
            isPattern = urlMappingCreateRequestBody.isPattern
            isProtocolAgnostic = urlMappingCreateRequestBody.isProtocolAgnostic
            isTrailingSlashOptional = urlMappingCreateRequestBody.isTrailingSlashOptional
            precedence = urlMappingCreateRequestBody.precedence
            additionalProperties = urlMappingCreateRequestBody.additionalProperties.toMutableMap()
        }

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
         * Returns an immutable instance of [UrlMappingCreateRequestBody].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .destination()
         * .redirectStyle()
         * .routePrefix()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UrlMappingCreateRequestBody =
            UrlMappingCreateRequestBody(
                checkRequired("destination", destination),
                checkRequired("redirectStyle", redirectStyle),
                checkRequired("routePrefix", routePrefix),
                isMatchFullUrl,
                isMatchQueryString,
                isOnlyAfterNotFound,
                isPattern,
                isProtocolAgnostic,
                isTrailingSlashOptional,
                precedence,
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
    fun validate(): UrlMappingCreateRequestBody = apply {
        if (validated) {
            return@apply
        }

        destination()
        redirectStyle()
        routePrefix()
        isMatchFullUrl()
        isMatchQueryString()
        isOnlyAfterNotFound()
        isPattern()
        isProtocolAgnostic()
        isTrailingSlashOptional()
        precedence()
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
        (if (destination.asKnown().isPresent) 1 else 0) +
            (if (redirectStyle.asKnown().isPresent) 1 else 0) +
            (if (routePrefix.asKnown().isPresent) 1 else 0) +
            (if (isMatchFullUrl.asKnown().isPresent) 1 else 0) +
            (if (isMatchQueryString.asKnown().isPresent) 1 else 0) +
            (if (isOnlyAfterNotFound.asKnown().isPresent) 1 else 0) +
            (if (isPattern.asKnown().isPresent) 1 else 0) +
            (if (isProtocolAgnostic.asKnown().isPresent) 1 else 0) +
            (if (isTrailingSlashOptional.asKnown().isPresent) 1 else 0) +
            (if (precedence.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UrlMappingCreateRequestBody &&
            destination == other.destination &&
            redirectStyle == other.redirectStyle &&
            routePrefix == other.routePrefix &&
            isMatchFullUrl == other.isMatchFullUrl &&
            isMatchQueryString == other.isMatchQueryString &&
            isOnlyAfterNotFound == other.isOnlyAfterNotFound &&
            isPattern == other.isPattern &&
            isProtocolAgnostic == other.isProtocolAgnostic &&
            isTrailingSlashOptional == other.isTrailingSlashOptional &&
            precedence == other.precedence &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            destination,
            redirectStyle,
            routePrefix,
            isMatchFullUrl,
            isMatchQueryString,
            isOnlyAfterNotFound,
            isPattern,
            isProtocolAgnostic,
            isTrailingSlashOptional,
            precedence,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UrlMappingCreateRequestBody{destination=$destination, redirectStyle=$redirectStyle, routePrefix=$routePrefix, isMatchFullUrl=$isMatchFullUrl, isMatchQueryString=$isMatchQueryString, isOnlyAfterNotFound=$isOnlyAfterNotFound, isPattern=$isPattern, isProtocolAgnostic=$isProtocolAgnostic, isTrailingSlashOptional=$isTrailingSlashOptional, precedence=$precedence, additionalProperties=$additionalProperties}"
}
