// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.auth.oauth

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.Enum
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkKnown
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.toImmutable
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicAccessTokenInfoResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val active: JsonField<Boolean>,
    private val appId: JsonField<Int>,
    private val clientId: JsonField<String>,
    private val expiresIn: JsonField<Long>,
    private val hubId: JsonField<Int>,
    private val isPrivateDistribution: JsonField<Boolean>,
    private val scopes: JsonField<List<String>>,
    private val signedAccessToken: JsonField<SignedAccessToken>,
    private val tokenType: JsonField<String>,
    private val tokenUse: JsonField<TokenUse>,
    private val userId: JsonField<Int>,
    private val hubDomain: JsonField<String>,
    private val user: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("active") @ExcludeMissing active: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("app_id") @ExcludeMissing appId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("client_id") @ExcludeMissing clientId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expires_in") @ExcludeMissing expiresIn: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("hub_id") @ExcludeMissing hubId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("is_private_distribution")
        @ExcludeMissing
        isPrivateDistribution: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("scopes") @ExcludeMissing scopes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("signed_access_token")
        @ExcludeMissing
        signedAccessToken: JsonField<SignedAccessToken> = JsonMissing.of(),
        @JsonProperty("token_type") @ExcludeMissing tokenType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("token_use") @ExcludeMissing tokenUse: JsonField<TokenUse> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("hub_domain") @ExcludeMissing hubDomain: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user") @ExcludeMissing user: JsonField<String> = JsonMissing.of(),
    ) : this(
        token,
        active,
        appId,
        clientId,
        expiresIn,
        hubId,
        isPrivateDistribution,
        scopes,
        signedAccessToken,
        tokenType,
        tokenUse,
        userId,
        hubDomain,
        user,
        mutableMapOf(),
    )

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun active(): Boolean = active.getRequired("active")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun appId(): Int = appId.getRequired("app_id")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun clientId(): String = clientId.getRequired("client_id")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expiresIn(): Long = expiresIn.getRequired("expires_in")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hubId(): Int = hubId.getRequired("hub_id")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isPrivateDistribution(): Boolean =
        isPrivateDistribution.getRequired("is_private_distribution")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scopes(): List<String> = scopes.getRequired("scopes")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun signedAccessToken(): SignedAccessToken =
        signedAccessToken.getRequired("signed_access_token")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tokenType(): String = tokenType.getRequired("token_type")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tokenUse(): TokenUse = tokenUse.getRequired("token_use")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userId(): Int = userId.getRequired("user_id")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hubDomain(): Optional<String> = hubDomain.getOptional("hub_domain")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
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
     * Returns the raw JSON value of [active].
     *
     * Unlike [active], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("active") @ExcludeMissing fun _active(): JsonField<Boolean> = active

    /**
     * Returns the raw JSON value of [appId].
     *
     * Unlike [appId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("app_id") @ExcludeMissing fun _appId(): JsonField<Int> = appId

    /**
     * Returns the raw JSON value of [clientId].
     *
     * Unlike [clientId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("client_id") @ExcludeMissing fun _clientId(): JsonField<String> = clientId

    /**
     * Returns the raw JSON value of [expiresIn].
     *
     * Unlike [expiresIn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires_in") @ExcludeMissing fun _expiresIn(): JsonField<Long> = expiresIn

    /**
     * Returns the raw JSON value of [hubId].
     *
     * Unlike [hubId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hub_id") @ExcludeMissing fun _hubId(): JsonField<Int> = hubId

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
     * Returns the raw JSON value of [scopes].
     *
     * Unlike [scopes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scopes") @ExcludeMissing fun _scopes(): JsonField<List<String>> = scopes

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
     * Returns the raw JSON value of [tokenType].
     *
     * Unlike [tokenType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token_type") @ExcludeMissing fun _tokenType(): JsonField<String> = tokenType

    /**
     * Returns the raw JSON value of [tokenUse].
     *
     * Unlike [tokenUse], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token_use") @ExcludeMissing fun _tokenUse(): JsonField<TokenUse> = tokenUse

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
         * Returns a mutable builder for constructing an instance of
         * [PublicAccessTokenInfoResponse].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .active()
         * .appId()
         * .clientId()
         * .expiresIn()
         * .hubId()
         * .isPrivateDistribution()
         * .scopes()
         * .signedAccessToken()
         * .tokenType()
         * .tokenUse()
         * .userId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicAccessTokenInfoResponse]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var active: JsonField<Boolean>? = null
        private var appId: JsonField<Int>? = null
        private var clientId: JsonField<String>? = null
        private var expiresIn: JsonField<Long>? = null
        private var hubId: JsonField<Int>? = null
        private var isPrivateDistribution: JsonField<Boolean>? = null
        private var scopes: JsonField<MutableList<String>>? = null
        private var signedAccessToken: JsonField<SignedAccessToken>? = null
        private var tokenType: JsonField<String>? = null
        private var tokenUse: JsonField<TokenUse>? = null
        private var userId: JsonField<Int>? = null
        private var hubDomain: JsonField<String> = JsonMissing.of()
        private var user: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicAccessTokenInfoResponse: PublicAccessTokenInfoResponse) = apply {
            token = publicAccessTokenInfoResponse.token
            active = publicAccessTokenInfoResponse.active
            appId = publicAccessTokenInfoResponse.appId
            clientId = publicAccessTokenInfoResponse.clientId
            expiresIn = publicAccessTokenInfoResponse.expiresIn
            hubId = publicAccessTokenInfoResponse.hubId
            isPrivateDistribution = publicAccessTokenInfoResponse.isPrivateDistribution
            scopes = publicAccessTokenInfoResponse.scopes.map { it.toMutableList() }
            signedAccessToken = publicAccessTokenInfoResponse.signedAccessToken
            tokenType = publicAccessTokenInfoResponse.tokenType
            tokenUse = publicAccessTokenInfoResponse.tokenUse
            userId = publicAccessTokenInfoResponse.userId
            hubDomain = publicAccessTokenInfoResponse.hubDomain
            user = publicAccessTokenInfoResponse.user
            additionalProperties = publicAccessTokenInfoResponse.additionalProperties.toMutableMap()
        }

        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        fun active(active: Boolean) = active(JsonField.of(active))

        /**
         * Sets [Builder.active] to an arbitrary JSON value.
         *
         * You should usually call [Builder.active] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun active(active: JsonField<Boolean>) = apply { this.active = active }

        fun appId(appId: Int) = appId(JsonField.of(appId))

        /**
         * Sets [Builder.appId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.appId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun appId(appId: JsonField<Int>) = apply { this.appId = appId }

        fun clientId(clientId: String) = clientId(JsonField.of(clientId))

        /**
         * Sets [Builder.clientId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun clientId(clientId: JsonField<String>) = apply { this.clientId = clientId }

        fun expiresIn(expiresIn: Long) = expiresIn(JsonField.of(expiresIn))

        /**
         * Sets [Builder.expiresIn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresIn] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun expiresIn(expiresIn: JsonField<Long>) = apply { this.expiresIn = expiresIn }

        fun hubId(hubId: Int) = hubId(JsonField.of(hubId))

        /**
         * Sets [Builder.hubId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hubId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hubId(hubId: JsonField<Int>) = apply { this.hubId = hubId }

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

        fun tokenType(tokenType: String) = tokenType(JsonField.of(tokenType))

        /**
         * Sets [Builder.tokenType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokenType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tokenType(tokenType: JsonField<String>) = apply { this.tokenType = tokenType }

        fun tokenUse(tokenUse: TokenUse) = tokenUse(JsonField.of(tokenUse))

        /**
         * Sets [Builder.tokenUse] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokenUse] with a well-typed [TokenUse] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tokenUse(tokenUse: JsonField<TokenUse>) = apply { this.tokenUse = tokenUse }

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
         * Returns an immutable instance of [PublicAccessTokenInfoResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .active()
         * .appId()
         * .clientId()
         * .expiresIn()
         * .hubId()
         * .isPrivateDistribution()
         * .scopes()
         * .signedAccessToken()
         * .tokenType()
         * .tokenUse()
         * .userId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicAccessTokenInfoResponse =
            PublicAccessTokenInfoResponse(
                checkRequired("token", token),
                checkRequired("active", active),
                checkRequired("appId", appId),
                checkRequired("clientId", clientId),
                checkRequired("expiresIn", expiresIn),
                checkRequired("hubId", hubId),
                checkRequired("isPrivateDistribution", isPrivateDistribution),
                checkRequired("scopes", scopes).map { it.toImmutable() },
                checkRequired("signedAccessToken", signedAccessToken),
                checkRequired("tokenType", tokenType),
                checkRequired("tokenUse", tokenUse),
                checkRequired("userId", userId),
                hubDomain,
                user,
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
    fun validate(): PublicAccessTokenInfoResponse = apply {
        if (validated) {
            return@apply
        }

        token()
        active()
        appId()
        clientId()
        expiresIn()
        hubId()
        isPrivateDistribution()
        scopes()
        signedAccessToken().validate()
        tokenType()
        tokenUse().validate()
        userId()
        hubDomain()
        user()
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
        (if (token.asKnown().isPresent) 1 else 0) +
            (if (active.asKnown().isPresent) 1 else 0) +
            (if (appId.asKnown().isPresent) 1 else 0) +
            (if (clientId.asKnown().isPresent) 1 else 0) +
            (if (expiresIn.asKnown().isPresent) 1 else 0) +
            (if (hubId.asKnown().isPresent) 1 else 0) +
            (if (isPrivateDistribution.asKnown().isPresent) 1 else 0) +
            (scopes.asKnown().getOrNull()?.size ?: 0) +
            (signedAccessToken.asKnown().getOrNull()?.validity() ?: 0) +
            (if (tokenType.asKnown().isPresent) 1 else 0) +
            (tokenUse.asKnown().getOrNull()?.validity() ?: 0) +
            (if (userId.asKnown().isPresent) 1 else 0) +
            (if (hubDomain.asKnown().isPresent) 1 else 0) +
            (if (user.asKnown().isPresent) 1 else 0)

    class TokenUse @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ACCESS_TOKEN = of("access_token")

            @JvmStatic fun of(value: String) = TokenUse(JsonField.of(value))
        }

        /** An enum containing [TokenUse]'s known values. */
        enum class Known {
            ACCESS_TOKEN
        }

        /**
         * An enum containing [TokenUse]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TokenUse] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACCESS_TOKEN,
            /** An enum member indicating that [TokenUse] was instantiated with an unknown value. */
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
                ACCESS_TOKEN -> Value.ACCESS_TOKEN
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
                ACCESS_TOKEN -> Known.ACCESS_TOKEN
                else -> throw HubSpotInvalidDataException("Unknown TokenUse: $value")
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
        fun validate(): TokenUse = apply {
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

            return other is TokenUse && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicAccessTokenInfoResponse &&
            token == other.token &&
            active == other.active &&
            appId == other.appId &&
            clientId == other.clientId &&
            expiresIn == other.expiresIn &&
            hubId == other.hubId &&
            isPrivateDistribution == other.isPrivateDistribution &&
            scopes == other.scopes &&
            signedAccessToken == other.signedAccessToken &&
            tokenType == other.tokenType &&
            tokenUse == other.tokenUse &&
            userId == other.userId &&
            hubDomain == other.hubDomain &&
            user == other.user &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            active,
            appId,
            clientId,
            expiresIn,
            hubId,
            isPrivateDistribution,
            scopes,
            signedAccessToken,
            tokenType,
            tokenUse,
            userId,
            hubDomain,
            user,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicAccessTokenInfoResponse{token=$token, active=$active, appId=$appId, clientId=$clientId, expiresIn=$expiresIn, hubId=$hubId, isPrivateDistribution=$isPrivateDistribution, scopes=$scopes, signedAccessToken=$signedAccessToken, tokenType=$tokenType, tokenUse=$tokenUse, userId=$userId, hubDomain=$hubDomain, user=$user, additionalProperties=$additionalProperties}"
}
