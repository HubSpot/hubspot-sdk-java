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

class AccessTokenInfoResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val appId: JsonField<Int>,
    private val expiresIn: JsonField<Int>,
    private val hubId: JsonField<Int>,
    private val scopes: JsonField<List<String>>,
    private val tokenType: JsonField<String>,
    private val userId: JsonField<Int>,
    private val hubDomain: JsonField<String>,
    private val isPrivateDistribution: JsonField<Boolean>,
    private val signedAccessToken: JsonField<SignedAccessToken>,
    private val user: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("app_id") @ExcludeMissing appId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("expires_in") @ExcludeMissing expiresIn: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("hub_id") @ExcludeMissing hubId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("scopes") @ExcludeMissing scopes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("token_type") @ExcludeMissing tokenType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("hub_domain") @ExcludeMissing hubDomain: JsonField<String> = JsonMissing.of(),
        @JsonProperty("is_private_distribution")
        @ExcludeMissing
        isPrivateDistribution: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("signed_access_token")
        @ExcludeMissing
        signedAccessToken: JsonField<SignedAccessToken> = JsonMissing.of(),
        @JsonProperty("user") @ExcludeMissing user: JsonField<String> = JsonMissing.of(),
    ) : this(
        token,
        appId,
        expiresIn,
        hubId,
        scopes,
        tokenType,
        userId,
        hubDomain,
        isPrivateDistribution,
        signedAccessToken,
        user,
        mutableMapOf(),
    )

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun appId(): Int = appId.getRequired("app_id")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expiresIn(): Int = expiresIn.getRequired("expires_in")

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
    fun isPrivateDistribution(): Optional<Boolean> =
        isPrivateDistribution.getOptional("is_private_distribution")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun signedAccessToken(): Optional<SignedAccessToken> =
        signedAccessToken.getOptional("signed_access_token")

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
     * Returns the raw JSON value of [appId].
     *
     * Unlike [appId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("app_id") @ExcludeMissing fun _appId(): JsonField<Int> = appId

    /**
     * Returns the raw JSON value of [expiresIn].
     *
     * Unlike [expiresIn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires_in") @ExcludeMissing fun _expiresIn(): JsonField<Int> = expiresIn

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
     * Returns the raw JSON value of [isPrivateDistribution].
     *
     * Unlike [isPrivateDistribution], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("is_private_distribution")
    @ExcludeMissing
    fun _isPrivateDistribution(): JsonField<Boolean> = isPrivateDistribution

    /**
     * Returns the raw JSON value of [signedAccessToken].
     *
     * Unlike [signedAccessToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("signed_access_token")
    @ExcludeMissing
    fun _signedAccessToken(): JsonField<SignedAccessToken> = signedAccessToken

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
         * Returns a mutable builder for constructing an instance of [AccessTokenInfoResponse].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .appId()
         * .expiresIn()
         * .hubId()
         * .scopes()
         * .tokenType()
         * .userId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccessTokenInfoResponse]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var appId: JsonField<Int>? = null
        private var expiresIn: JsonField<Int>? = null
        private var hubId: JsonField<Int>? = null
        private var scopes: JsonField<MutableList<String>>? = null
        private var tokenType: JsonField<String>? = null
        private var userId: JsonField<Int>? = null
        private var hubDomain: JsonField<String> = JsonMissing.of()
        private var isPrivateDistribution: JsonField<Boolean> = JsonMissing.of()
        private var signedAccessToken: JsonField<SignedAccessToken> = JsonMissing.of()
        private var user: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accessTokenInfoResponse: AccessTokenInfoResponse) = apply {
            token = accessTokenInfoResponse.token
            appId = accessTokenInfoResponse.appId
            expiresIn = accessTokenInfoResponse.expiresIn
            hubId = accessTokenInfoResponse.hubId
            scopes = accessTokenInfoResponse.scopes.map { it.toMutableList() }
            tokenType = accessTokenInfoResponse.tokenType
            userId = accessTokenInfoResponse.userId
            hubDomain = accessTokenInfoResponse.hubDomain
            isPrivateDistribution = accessTokenInfoResponse.isPrivateDistribution
            signedAccessToken = accessTokenInfoResponse.signedAccessToken
            user = accessTokenInfoResponse.user
            additionalProperties = accessTokenInfoResponse.additionalProperties.toMutableMap()
        }

        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        fun appId(appId: Int) = appId(JsonField.of(appId))

        /**
         * Sets [Builder.appId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.appId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun appId(appId: JsonField<Int>) = apply { this.appId = appId }

        fun expiresIn(expiresIn: Int) = expiresIn(JsonField.of(expiresIn))

        /**
         * Sets [Builder.expiresIn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresIn] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun expiresIn(expiresIn: JsonField<Int>) = apply { this.expiresIn = expiresIn }

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

        fun isPrivateDistribution(isPrivateDistribution: Boolean) =
            isPrivateDistribution(JsonField.of(isPrivateDistribution))

        /**
         * Sets [Builder.isPrivateDistribution] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isPrivateDistribution] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isPrivateDistribution(isPrivateDistribution: JsonField<Boolean>) = apply {
            this.isPrivateDistribution = isPrivateDistribution
        }

        fun signedAccessToken(signedAccessToken: SignedAccessToken) =
            signedAccessToken(JsonField.of(signedAccessToken))

        /**
         * Sets [Builder.signedAccessToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.signedAccessToken] with a well-typed [SignedAccessToken]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun signedAccessToken(signedAccessToken: JsonField<SignedAccessToken>) = apply {
            this.signedAccessToken = signedAccessToken
        }

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
         * Returns an immutable instance of [AccessTokenInfoResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .appId()
         * .expiresIn()
         * .hubId()
         * .scopes()
         * .tokenType()
         * .userId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AccessTokenInfoResponse =
            AccessTokenInfoResponse(
                checkRequired("token", token),
                checkRequired("appId", appId),
                checkRequired("expiresIn", expiresIn),
                checkRequired("hubId", hubId),
                checkRequired("scopes", scopes).map { it.toImmutable() },
                checkRequired("tokenType", tokenType),
                checkRequired("userId", userId),
                hubDomain,
                isPrivateDistribution,
                signedAccessToken,
                user,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AccessTokenInfoResponse = apply {
        if (validated) {
            return@apply
        }

        token()
        appId()
        expiresIn()
        hubId()
        scopes()
        tokenType()
        userId()
        hubDomain()
        isPrivateDistribution()
        signedAccessToken().ifPresent { it.validate() }
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
            (if (appId.asKnown().isPresent) 1 else 0) +
            (if (expiresIn.asKnown().isPresent) 1 else 0) +
            (if (hubId.asKnown().isPresent) 1 else 0) +
            (scopes.asKnown().getOrNull()?.size ?: 0) +
            (if (tokenType.asKnown().isPresent) 1 else 0) +
            (if (userId.asKnown().isPresent) 1 else 0) +
            (if (hubDomain.asKnown().isPresent) 1 else 0) +
            (if (isPrivateDistribution.asKnown().isPresent) 1 else 0) +
            (signedAccessToken.asKnown().getOrNull()?.validity() ?: 0) +
            (if (user.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccessTokenInfoResponse &&
            token == other.token &&
            appId == other.appId &&
            expiresIn == other.expiresIn &&
            hubId == other.hubId &&
            scopes == other.scopes &&
            tokenType == other.tokenType &&
            userId == other.userId &&
            hubDomain == other.hubDomain &&
            isPrivateDistribution == other.isPrivateDistribution &&
            signedAccessToken == other.signedAccessToken &&
            user == other.user &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            appId,
            expiresIn,
            hubId,
            scopes,
            tokenType,
            userId,
            hubDomain,
            isPrivateDistribution,
            signedAccessToken,
            user,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccessTokenInfoResponse{token=$token, appId=$appId, expiresIn=$expiresIn, hubId=$hubId, scopes=$scopes, tokenType=$tokenType, userId=$userId, hubDomain=$hubDomain, isPrivateDistribution=$isPrivateDistribution, signedAccessToken=$signedAccessToken, user=$user, additionalProperties=$additionalProperties}"
}
