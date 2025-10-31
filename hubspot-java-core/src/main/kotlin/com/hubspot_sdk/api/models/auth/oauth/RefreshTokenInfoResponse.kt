// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.auth.oauth

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class RefreshTokenInfoResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val clientId: JsonField<String>,
    private val hubId: JsonField<Int>,
    private val scopes: JsonField<List<String>>,
    private val tokenType: JsonField<String>,
    private val userId: JsonField<Int>,
    private val hubDomain: JsonField<String>,
    private val user: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("client_id") @ExcludeMissing clientId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hub_id") @ExcludeMissing hubId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("scopes") @ExcludeMissing scopes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("token_type") @ExcludeMissing tokenType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("hub_domain") @ExcludeMissing hubDomain: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user") @ExcludeMissing user: JsonField<String> = JsonMissing.of(),
    ) : this(token, clientId, hubId, scopes, tokenType, userId, hubDomain, user, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun clientId(): String = clientId.getRequired("client_id")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hubId(): Int = hubId.getRequired("hub_id")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scopes(): List<String> = scopes.getRequired("scopes")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tokenType(): String = tokenType.getRequired("token_type")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userId(): Int = userId.getRequired("user_id")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hubDomain(): Optional<String> = hubDomain.getOptional("hub_domain")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun user(): Optional<String> = user.getOptional("user")

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
     * Returns the raw JSON value of [hubId].
     *
     * Unlike [hubId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hub_id") @ExcludeMissing fun _hubId(): JsonField<Int> = hubId

    /**
     * Returns the raw JSON value of [scopes].
     *
     * Unlike [scopes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scopes") @ExcludeMissing fun _scopes(): JsonField<List<String>> = scopes

    /**
     * Returns the raw JSON value of [tokenType].
     *
     * Unlike [tokenType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token_type") @ExcludeMissing fun _tokenType(): JsonField<String> = tokenType

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<Int> = userId

    /**
     * Returns the raw JSON value of [hubDomain].
     *
     * Unlike [hubDomain], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hub_domain") @ExcludeMissing fun _hubDomain(): JsonField<String> = hubDomain

    /**
     * Returns the raw JSON value of [user].
     *
     * Unlike [user], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user") @ExcludeMissing fun _user(): JsonField<String> = user

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
         * Returns a mutable builder for constructing an instance of [RefreshTokenInfoResponse].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .clientId()
         * .hubId()
         * .scopes()
         * .tokenType()
         * .userId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RefreshTokenInfoResponse]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var clientId: JsonField<String>? = null
        private var hubId: JsonField<Int>? = null
        private var scopes: JsonField<MutableList<String>>? = null
        private var tokenType: JsonField<String>? = null
        private var userId: JsonField<Int>? = null
        private var hubDomain: JsonField<String> = JsonMissing.of()
        private var user: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(refreshTokenInfoResponse: RefreshTokenInfoResponse) = apply {
            token = refreshTokenInfoResponse.token
            clientId = refreshTokenInfoResponse.clientId
            hubId = refreshTokenInfoResponse.hubId
            scopes = refreshTokenInfoResponse.scopes.map { it.toMutableList() }
            tokenType = refreshTokenInfoResponse.tokenType
            userId = refreshTokenInfoResponse.userId
            hubDomain = refreshTokenInfoResponse.hubDomain
            user = refreshTokenInfoResponse.user
            additionalProperties = refreshTokenInfoResponse.additionalProperties.toMutableMap()
        }

        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        fun clientId(clientId: String) = clientId(JsonField.of(clientId))

        /**
         * Sets [Builder.clientId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun clientId(clientId: JsonField<String>) = apply { this.clientId = clientId }

        fun hubId(hubId: Int) = hubId(JsonField.of(hubId))

        /**
         * Sets [Builder.hubId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hubId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hubId(hubId: JsonField<Int>) = apply { this.hubId = hubId }

        fun scopes(scopes: List<String>) = scopes(JsonField.of(scopes))

        /**
         * Sets [Builder.scopes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scopes] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun scopes(scopes: JsonField<List<String>>) = apply {
            this.scopes = scopes.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [scopes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addScope(scope: String) = apply {
            scopes =
                (scopes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("scopes", it).add(scope)
                }
        }

        fun tokenType(tokenType: String) = tokenType(JsonField.of(tokenType))

        /**
         * Sets [Builder.tokenType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokenType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tokenType(tokenType: JsonField<String>) = apply { this.tokenType = tokenType }

        fun userId(userId: Int) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<Int>) = apply { this.userId = userId }

        fun hubDomain(hubDomain: String) = hubDomain(JsonField.of(hubDomain))

        /**
         * Sets [Builder.hubDomain] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hubDomain] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hubDomain(hubDomain: JsonField<String>) = apply { this.hubDomain = hubDomain }

        fun user(user: String) = user(JsonField.of(user))

        /**
         * Sets [Builder.user] to an arbitrary JSON value.
         *
         * You should usually call [Builder.user] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun user(user: JsonField<String>) = apply { this.user = user }

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
         * Returns an immutable instance of [RefreshTokenInfoResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .clientId()
         * .hubId()
         * .scopes()
         * .tokenType()
         * .userId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RefreshTokenInfoResponse =
            RefreshTokenInfoResponse(
                checkRequired("token", token),
                checkRequired("clientId", clientId),
                checkRequired("hubId", hubId),
                checkRequired("scopes", scopes).map { it.toImmutable() },
                checkRequired("tokenType", tokenType),
                checkRequired("userId", userId),
                hubDomain,
                user,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RefreshTokenInfoResponse = apply {
        if (validated) {
            return@apply
        }

        token()
        clientId()
        hubId()
        scopes()
        tokenType()
        userId()
        hubDomain()
        user()
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
        (if (token.asKnown().isPresent) 1 else 0) +
            (if (clientId.asKnown().isPresent) 1 else 0) +
            (if (hubId.asKnown().isPresent) 1 else 0) +
            (scopes.asKnown().getOrNull()?.size ?: 0) +
            (if (tokenType.asKnown().isPresent) 1 else 0) +
            (if (userId.asKnown().isPresent) 1 else 0) +
            (if (hubDomain.asKnown().isPresent) 1 else 0) +
            (if (user.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RefreshTokenInfoResponse &&
            token == other.token &&
            clientId == other.clientId &&
            hubId == other.hubId &&
            scopes == other.scopes &&
            tokenType == other.tokenType &&
            userId == other.userId &&
            hubDomain == other.hubDomain &&
            user == other.user &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            clientId,
            hubId,
            scopes,
            tokenType,
            userId,
            hubDomain,
            user,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RefreshTokenInfoResponse{token=$token, clientId=$clientId, hubId=$hubId, scopes=$scopes, tokenType=$tokenType, userId=$userId, hubDomain=$hubDomain, user=$user, additionalProperties=$additionalProperties}"
}
