// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.auth.oauth

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.core.ExcludeMissing
import com.hubspot.core.JsonField
import com.hubspot.core.JsonMissing
import com.hubspot.core.JsonValue
import com.hubspot.core.Params
import com.hubspot.core.http.Headers
import com.hubspot.core.http.QueryParams
import com.hubspot.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/** Returns validity and metadata for access and refresh tokens. */
class OAuthIntrospectTokenParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun token(): Optional<String> = body.token()

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clientId(): Optional<String> = body.clientId()

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clientSecret(): Optional<String> = body.clientSecret()

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tokenTypeHint(): Optional<String> = body.tokenTypeHint()

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _token(): JsonField<String> = body._token()

    /**
     * Returns the raw JSON value of [clientId].
     *
     * Unlike [clientId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _clientId(): JsonField<String> = body._clientId()

    /**
     * Returns the raw JSON value of [clientSecret].
     *
     * Unlike [clientSecret], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _clientSecret(): JsonField<String> = body._clientSecret()

    /**
     * Returns the raw JSON value of [tokenTypeHint].
     *
     * Unlike [tokenTypeHint], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tokenTypeHint(): JsonField<String> = body._tokenTypeHint()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): OAuthIntrospectTokenParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [OAuthIntrospectTokenParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OAuthIntrospectTokenParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(oauthIntrospectTokenParams: OAuthIntrospectTokenParams) = apply {
            body = oauthIntrospectTokenParams.body.toBuilder()
            additionalHeaders = oauthIntrospectTokenParams.additionalHeaders.toBuilder()
            additionalQueryParams = oauthIntrospectTokenParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [token]
         * - [clientId]
         * - [clientSecret]
         * - [tokenTypeHint]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun token(token: String) = apply { body.token(token) }

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { body.token(token) }

        fun clientId(clientId: String) = apply { body.clientId(clientId) }

        /**
         * Sets [Builder.clientId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun clientId(clientId: JsonField<String>) = apply { body.clientId(clientId) }

        fun clientSecret(clientSecret: String) = apply { body.clientSecret(clientSecret) }

        /**
         * Sets [Builder.clientSecret] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientSecret] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun clientSecret(clientSecret: JsonField<String>) = apply {
            body.clientSecret(clientSecret)
        }

        fun tokenTypeHint(tokenTypeHint: String) = apply { body.tokenTypeHint(tokenTypeHint) }

        /**
         * Sets [Builder.tokenTypeHint] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokenTypeHint] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tokenTypeHint(tokenTypeHint: JsonField<String>) = apply {
            body.tokenTypeHint(tokenTypeHint)
        }

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
         * Returns an immutable instance of [OAuthIntrospectTokenParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): OAuthIntrospectTokenParams =
            OAuthIntrospectTokenParams(
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
        private val token: JsonField<String>,
        private val clientId: JsonField<String>,
        private val clientSecret: JsonField<String>,
        private val tokenTypeHint: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
            @JsonProperty("client_id")
            @ExcludeMissing
            clientId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("client_secret")
            @ExcludeMissing
            clientSecret: JsonField<String> = JsonMissing.of(),
            @JsonProperty("token_type_hint")
            @ExcludeMissing
            tokenTypeHint: JsonField<String> = JsonMissing.of(),
        ) : this(token, clientId, clientSecret, tokenTypeHint, mutableMapOf())

        /**
         * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun token(): Optional<String> = token.getOptional("token")

        /**
         * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun clientId(): Optional<String> = clientId.getOptional("client_id")

        /**
         * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun clientSecret(): Optional<String> = clientSecret.getOptional("client_secret")

        /**
         * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tokenTypeHint(): Optional<String> = tokenTypeHint.getOptional("token_type_hint")

        /**
         * Returns the raw JSON value of [token].
         *
         * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

        /**
         * Returns the raw JSON value of [clientId].
         *
         * Unlike [clientId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("client_id") @ExcludeMissing fun _clientId(): JsonField<String> = clientId

        /**
         * Returns the raw JSON value of [clientSecret].
         *
         * Unlike [clientSecret], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("client_secret")
        @ExcludeMissing
        fun _clientSecret(): JsonField<String> = clientSecret

        /**
         * Returns the raw JSON value of [tokenTypeHint].
         *
         * Unlike [tokenTypeHint], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("token_type_hint")
        @ExcludeMissing
        fun _tokenTypeHint(): JsonField<String> = tokenTypeHint

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var token: JsonField<String> = JsonMissing.of()
            private var clientId: JsonField<String> = JsonMissing.of()
            private var clientSecret: JsonField<String> = JsonMissing.of()
            private var tokenTypeHint: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                token = body.token
                clientId = body.clientId
                clientSecret = body.clientSecret
                tokenTypeHint = body.tokenTypeHint
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun token(token: String) = token(JsonField.of(token))

            /**
             * Sets [Builder.token] to an arbitrary JSON value.
             *
             * You should usually call [Builder.token] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun token(token: JsonField<String>) = apply { this.token = token }

            fun clientId(clientId: String) = clientId(JsonField.of(clientId))

            /**
             * Sets [Builder.clientId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.clientId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun clientId(clientId: JsonField<String>) = apply { this.clientId = clientId }

            fun clientSecret(clientSecret: String) = clientSecret(JsonField.of(clientSecret))

            /**
             * Sets [Builder.clientSecret] to an arbitrary JSON value.
             *
             * You should usually call [Builder.clientSecret] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun clientSecret(clientSecret: JsonField<String>) = apply {
                this.clientSecret = clientSecret
            }

            fun tokenTypeHint(tokenTypeHint: String) = tokenTypeHint(JsonField.of(tokenTypeHint))

            /**
             * Sets [Builder.tokenTypeHint] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tokenTypeHint] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tokenTypeHint(tokenTypeHint: JsonField<String>) = apply {
                this.tokenTypeHint = tokenTypeHint
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    token,
                    clientId,
                    clientSecret,
                    tokenTypeHint,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            token()
            clientId()
            clientSecret()
            tokenTypeHint()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (token.asKnown().isPresent) 1 else 0) +
                (if (clientId.asKnown().isPresent) 1 else 0) +
                (if (clientSecret.asKnown().isPresent) 1 else 0) +
                (if (tokenTypeHint.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                token == other.token &&
                clientId == other.clientId &&
                clientSecret == other.clientSecret &&
                tokenTypeHint == other.tokenTypeHint &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(token, clientId, clientSecret, tokenTypeHint, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{token=$token, clientId=$clientId, clientSecret=$clientSecret, tokenTypeHint=$tokenTypeHint, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OAuthIntrospectTokenParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "OAuthIntrospectTokenParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
