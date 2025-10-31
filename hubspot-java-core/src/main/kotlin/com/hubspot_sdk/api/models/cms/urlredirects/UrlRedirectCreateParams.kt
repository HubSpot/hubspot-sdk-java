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
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/** Creates and configures a new URL redirect. */
class UrlRedirectCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun destination(): String = body.destination()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun redirectStyle(): Int = body.redirectStyle()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun routePrefix(): String = body.routePrefix()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isMatchFullUrl(): Optional<Boolean> = body.isMatchFullUrl()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isMatchQueryString(): Optional<Boolean> = body.isMatchQueryString()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isOnlyAfterNotFound(): Optional<Boolean> = body.isOnlyAfterNotFound()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isPattern(): Optional<Boolean> = body.isPattern()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isProtocolAgnostic(): Optional<Boolean> = body.isProtocolAgnostic()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isTrailingSlashOptional(): Optional<Boolean> = body.isTrailingSlashOptional()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun precedence(): Optional<Int> = body.precedence()

    /**
     * Returns the raw JSON value of [destination].
     *
     * Unlike [destination], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _destination(): JsonField<String> = body._destination()

    /**
     * Returns the raw JSON value of [redirectStyle].
     *
     * Unlike [redirectStyle], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _redirectStyle(): JsonField<Int> = body._redirectStyle()

    /**
     * Returns the raw JSON value of [routePrefix].
     *
     * Unlike [routePrefix], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _routePrefix(): JsonField<String> = body._routePrefix()

    /**
     * Returns the raw JSON value of [isMatchFullUrl].
     *
     * Unlike [isMatchFullUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _isMatchFullUrl(): JsonField<Boolean> = body._isMatchFullUrl()

    /**
     * Returns the raw JSON value of [isMatchQueryString].
     *
     * Unlike [isMatchQueryString], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _isMatchQueryString(): JsonField<Boolean> = body._isMatchQueryString()

    /**
     * Returns the raw JSON value of [isOnlyAfterNotFound].
     *
     * Unlike [isOnlyAfterNotFound], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _isOnlyAfterNotFound(): JsonField<Boolean> = body._isOnlyAfterNotFound()

    /**
     * Returns the raw JSON value of [isPattern].
     *
     * Unlike [isPattern], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _isPattern(): JsonField<Boolean> = body._isPattern()

    /**
     * Returns the raw JSON value of [isProtocolAgnostic].
     *
     * Unlike [isProtocolAgnostic], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _isProtocolAgnostic(): JsonField<Boolean> = body._isProtocolAgnostic()

    /**
     * Returns the raw JSON value of [isTrailingSlashOptional].
     *
     * Unlike [isTrailingSlashOptional], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _isTrailingSlashOptional(): JsonField<Boolean> = body._isTrailingSlashOptional()

    /**
     * Returns the raw JSON value of [precedence].
     *
     * Unlike [precedence], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _precedence(): JsonField<Int> = body._precedence()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UrlRedirectCreateParams].
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

    /** A builder for [UrlRedirectCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(urlRedirectCreateParams: UrlRedirectCreateParams) = apply {
            body = urlRedirectCreateParams.body.toBuilder()
            additionalHeaders = urlRedirectCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = urlRedirectCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [destination]
         * - [redirectStyle]
         * - [routePrefix]
         * - [isMatchFullUrl]
         * - [isMatchQueryString]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun destination(destination: String) = apply { body.destination(destination) }

        /**
         * Sets [Builder.destination] to an arbitrary JSON value.
         *
         * You should usually call [Builder.destination] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun destination(destination: JsonField<String>) = apply { body.destination(destination) }

        fun redirectStyle(redirectStyle: Int) = apply { body.redirectStyle(redirectStyle) }

        /**
         * Sets [Builder.redirectStyle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.redirectStyle] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun redirectStyle(redirectStyle: JsonField<Int>) = apply {
            body.redirectStyle(redirectStyle)
        }

        fun routePrefix(routePrefix: String) = apply { body.routePrefix(routePrefix) }

        /**
         * Sets [Builder.routePrefix] to an arbitrary JSON value.
         *
         * You should usually call [Builder.routePrefix] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun routePrefix(routePrefix: JsonField<String>) = apply { body.routePrefix(routePrefix) }

        fun isMatchFullUrl(isMatchFullUrl: Boolean) = apply { body.isMatchFullUrl(isMatchFullUrl) }

        /**
         * Sets [Builder.isMatchFullUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isMatchFullUrl] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isMatchFullUrl(isMatchFullUrl: JsonField<Boolean>) = apply {
            body.isMatchFullUrl(isMatchFullUrl)
        }

        fun isMatchQueryString(isMatchQueryString: Boolean) = apply {
            body.isMatchQueryString(isMatchQueryString)
        }

        /**
         * Sets [Builder.isMatchQueryString] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isMatchQueryString] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isMatchQueryString(isMatchQueryString: JsonField<Boolean>) = apply {
            body.isMatchQueryString(isMatchQueryString)
        }

        fun isOnlyAfterNotFound(isOnlyAfterNotFound: Boolean) = apply {
            body.isOnlyAfterNotFound(isOnlyAfterNotFound)
        }

        /**
         * Sets [Builder.isOnlyAfterNotFound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isOnlyAfterNotFound] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isOnlyAfterNotFound(isOnlyAfterNotFound: JsonField<Boolean>) = apply {
            body.isOnlyAfterNotFound(isOnlyAfterNotFound)
        }

        fun isPattern(isPattern: Boolean) = apply { body.isPattern(isPattern) }

        /**
         * Sets [Builder.isPattern] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isPattern] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isPattern(isPattern: JsonField<Boolean>) = apply { body.isPattern(isPattern) }

        fun isProtocolAgnostic(isProtocolAgnostic: Boolean) = apply {
            body.isProtocolAgnostic(isProtocolAgnostic)
        }

        /**
         * Sets [Builder.isProtocolAgnostic] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isProtocolAgnostic] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isProtocolAgnostic(isProtocolAgnostic: JsonField<Boolean>) = apply {
            body.isProtocolAgnostic(isProtocolAgnostic)
        }

        fun isTrailingSlashOptional(isTrailingSlashOptional: Boolean) = apply {
            body.isTrailingSlashOptional(isTrailingSlashOptional)
        }

        /**
         * Sets [Builder.isTrailingSlashOptional] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isTrailingSlashOptional] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun isTrailingSlashOptional(isTrailingSlashOptional: JsonField<Boolean>) = apply {
            body.isTrailingSlashOptional(isTrailingSlashOptional)
        }

        fun precedence(precedence: Int) = apply { body.precedence(precedence) }

        /**
         * Sets [Builder.precedence] to an arbitrary JSON value.
         *
         * You should usually call [Builder.precedence] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun precedence(precedence: JsonField<Int>) = apply { body.precedence(precedence) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [UrlRedirectCreateParams].
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
        fun build(): UrlRedirectCreateParams =
            UrlRedirectCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
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
            @JsonProperty("isPattern")
            @ExcludeMissing
            isPattern: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("isProtocolAgnostic")
            @ExcludeMissing
            isProtocolAgnostic: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("isTrailingSlashOptional")
            @ExcludeMissing
            isTrailingSlashOptional: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("precedence")
            @ExcludeMissing
            precedence: JsonField<Int> = JsonMissing.of(),
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
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun destination(): String = destination.getRequired("destination")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun redirectStyle(): Int = redirectStyle.getRequired("redirectStyle")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun routePrefix(): String = routePrefix.getRequired("routePrefix")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isMatchFullUrl(): Optional<Boolean> = isMatchFullUrl.getOptional("isMatchFullUrl")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isMatchQueryString(): Optional<Boolean> =
            isMatchQueryString.getOptional("isMatchQueryString")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isOnlyAfterNotFound(): Optional<Boolean> =
            isOnlyAfterNotFound.getOptional("isOnlyAfterNotFound")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isPattern(): Optional<Boolean> = isPattern.getOptional("isPattern")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isProtocolAgnostic(): Optional<Boolean> =
            isProtocolAgnostic.getOptional("isProtocolAgnostic")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isTrailingSlashOptional(): Optional<Boolean> =
            isTrailingSlashOptional.getOptional("isTrailingSlashOptional")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun precedence(): Optional<Int> = precedence.getOptional("precedence")

        /**
         * Returns the raw JSON value of [destination].
         *
         * Unlike [destination], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("destination")
        @ExcludeMissing
        fun _destination(): JsonField<String> = destination

        /**
         * Returns the raw JSON value of [redirectStyle].
         *
         * Unlike [redirectStyle], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("redirectStyle")
        @ExcludeMissing
        fun _redirectStyle(): JsonField<Int> = redirectStyle

        /**
         * Returns the raw JSON value of [routePrefix].
         *
         * Unlike [routePrefix], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("routePrefix")
        @ExcludeMissing
        fun _routePrefix(): JsonField<String> = routePrefix

        /**
         * Returns the raw JSON value of [isMatchFullUrl].
         *
         * Unlike [isMatchFullUrl], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("isMatchFullUrl")
        @ExcludeMissing
        fun _isMatchFullUrl(): JsonField<Boolean> = isMatchFullUrl

        /**
         * Returns the raw JSON value of [isMatchQueryString].
         *
         * Unlike [isMatchQueryString], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("isMatchQueryString")
        @ExcludeMissing
        fun _isMatchQueryString(): JsonField<Boolean> = isMatchQueryString

        /**
         * Returns the raw JSON value of [isOnlyAfterNotFound].
         *
         * Unlike [isOnlyAfterNotFound], this method doesn't throw if the JSON field has an
         * unexpected type.
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
         * Unlike [isProtocolAgnostic], this method doesn't throw if the JSON field has an
         * unexpected type.
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
             * Returns a mutable builder for constructing an instance of [Body].
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

        /** A builder for [Body]. */
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
            internal fun from(body: Body) = apply {
                destination = body.destination
                redirectStyle = body.redirectStyle
                routePrefix = body.routePrefix
                isMatchFullUrl = body.isMatchFullUrl
                isMatchQueryString = body.isMatchQueryString
                isOnlyAfterNotFound = body.isOnlyAfterNotFound
                isPattern = body.isPattern
                isProtocolAgnostic = body.isProtocolAgnostic
                isTrailingSlashOptional = body.isTrailingSlashOptional
                precedence = body.precedence
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun destination(destination: String) = destination(JsonField.of(destination))

            /**
             * Sets [Builder.destination] to an arbitrary JSON value.
             *
             * You should usually call [Builder.destination] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun destination(destination: JsonField<String>) = apply {
                this.destination = destination
            }

            fun redirectStyle(redirectStyle: Int) = redirectStyle(JsonField.of(redirectStyle))

            /**
             * Sets [Builder.redirectStyle] to an arbitrary JSON value.
             *
             * You should usually call [Builder.redirectStyle] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun redirectStyle(redirectStyle: JsonField<Int>) = apply {
                this.redirectStyle = redirectStyle
            }

            fun routePrefix(routePrefix: String) = routePrefix(JsonField.of(routePrefix))

            /**
             * Sets [Builder.routePrefix] to an arbitrary JSON value.
             *
             * You should usually call [Builder.routePrefix] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun routePrefix(routePrefix: JsonField<String>) = apply {
                this.routePrefix = routePrefix
            }

            fun isMatchFullUrl(isMatchFullUrl: Boolean) =
                isMatchFullUrl(JsonField.of(isMatchFullUrl))

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

            fun isMatchQueryString(isMatchQueryString: Boolean) =
                isMatchQueryString(JsonField.of(isMatchQueryString))

            /**
             * Sets [Builder.isMatchQueryString] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isMatchQueryString] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun isMatchQueryString(isMatchQueryString: JsonField<Boolean>) = apply {
                this.isMatchQueryString = isMatchQueryString
            }

            fun isOnlyAfterNotFound(isOnlyAfterNotFound: Boolean) =
                isOnlyAfterNotFound(JsonField.of(isOnlyAfterNotFound))

            /**
             * Sets [Builder.isOnlyAfterNotFound] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isOnlyAfterNotFound] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun isOnlyAfterNotFound(isOnlyAfterNotFound: JsonField<Boolean>) = apply {
                this.isOnlyAfterNotFound = isOnlyAfterNotFound
            }

            fun isPattern(isPattern: Boolean) = isPattern(JsonField.of(isPattern))

            /**
             * Sets [Builder.isPattern] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isPattern] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isPattern(isPattern: JsonField<Boolean>) = apply { this.isPattern = isPattern }

            fun isProtocolAgnostic(isProtocolAgnostic: Boolean) =
                isProtocolAgnostic(JsonField.of(isProtocolAgnostic))

            /**
             * Sets [Builder.isProtocolAgnostic] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isProtocolAgnostic] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun isProtocolAgnostic(isProtocolAgnostic: JsonField<Boolean>) = apply {
                this.isProtocolAgnostic = isProtocolAgnostic
            }

            fun isTrailingSlashOptional(isTrailingSlashOptional: Boolean) =
                isTrailingSlashOptional(JsonField.of(isTrailingSlashOptional))

            /**
             * Sets [Builder.isTrailingSlashOptional] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isTrailingSlashOptional] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun isTrailingSlashOptional(isTrailingSlashOptional: JsonField<Boolean>) = apply {
                this.isTrailingSlashOptional = isTrailingSlashOptional
            }

            fun precedence(precedence: Int) = precedence(JsonField.of(precedence))

            /**
             * Sets [Builder.precedence] to an arbitrary JSON value.
             *
             * You should usually call [Builder.precedence] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Body].
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
            fun build(): Body =
                Body(
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

        fun validate(): Body = apply {
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
            } catch (e: HubspotInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
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

            return other is Body &&
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
            "Body{destination=$destination, redirectStyle=$redirectStyle, routePrefix=$routePrefix, isMatchFullUrl=$isMatchFullUrl, isMatchQueryString=$isMatchQueryString, isOnlyAfterNotFound=$isOnlyAfterNotFound, isPattern=$isPattern, isProtocolAgnostic=$isProtocolAgnostic, isTrailingSlashOptional=$isTrailingSlashOptional, precedence=$precedence, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UrlRedirectCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "UrlRedirectCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
