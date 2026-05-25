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

class ClientCredentialsTokenResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accessToken: JsonField<String>,
    private val expiresIn: JsonField<Long>,
    private val tokenType: JsonField<String>,
    private val tokenUse: JsonField<TokenUse>,
    private val hubId: JsonField<Int>,
    private val idToken: JsonField<String>,
    private val scopes: JsonField<List<String>>,
    private val userId: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("access_token")
        @ExcludeMissing
        accessToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expires_in") @ExcludeMissing expiresIn: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("token_type") @ExcludeMissing tokenType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("token_use") @ExcludeMissing tokenUse: JsonField<TokenUse> = JsonMissing.of(),
        @JsonProperty("hub_id") @ExcludeMissing hubId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("id_token") @ExcludeMissing idToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("scopes") @ExcludeMissing scopes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<Int> = JsonMissing.of(),
    ) : this(
        accessToken,
        expiresIn,
        tokenType,
        tokenUse,
        hubId,
        idToken,
        scopes,
        userId,
        mutableMapOf(),
    )

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accessToken(): String = accessToken.getRequired("access_token")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expiresIn(): Long = expiresIn.getRequired("expires_in")

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
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hubId(): Optional<Int> = hubId.getOptional("hub_id")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun idToken(): Optional<String> = idToken.getOptional("id_token")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scopes(): Optional<List<String>> = scopes.getOptional("scopes")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userId(): Optional<Int> = userId.getOptional("user_id")

    /**
     * Returns the raw JSON value of [accessToken].
     *
     * Unlike [accessToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("access_token")
    @ExcludeMissing
    fun _accessToken(): JsonField<String> = accessToken

    /**
     * Returns the raw JSON value of [expiresIn].
     *
     * Unlike [expiresIn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires_in") @ExcludeMissing fun _expiresIn(): JsonField<Long> = expiresIn

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
     * Returns the raw JSON value of [hubId].
     *
     * Unlike [hubId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hub_id") @ExcludeMissing fun _hubId(): JsonField<Int> = hubId

    /**
     * Returns the raw JSON value of [idToken].
     *
     * Unlike [idToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id_token") @ExcludeMissing fun _idToken(): JsonField<String> = idToken

    /**
     * Returns the raw JSON value of [scopes].
     *
     * Unlike [scopes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scopes") @ExcludeMissing fun _scopes(): JsonField<List<String>> = scopes

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<Int> = userId

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
         * [ClientCredentialsTokenResponse].
         *
         * The following fields are required:
         * ```java
         * .accessToken()
         * .expiresIn()
         * .tokenType()
         * .tokenUse()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ClientCredentialsTokenResponse]. */
    class Builder internal constructor() {

        private var accessToken: JsonField<String>? = null
        private var expiresIn: JsonField<Long>? = null
        private var tokenType: JsonField<String>? = null
        private var tokenUse: JsonField<TokenUse>? = null
        private var hubId: JsonField<Int> = JsonMissing.of()
        private var idToken: JsonField<String> = JsonMissing.of()
        private var scopes: JsonField<MutableList<String>>? = null
        private var userId: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(clientCredentialsTokenResponse: ClientCredentialsTokenResponse) = apply {
            accessToken = clientCredentialsTokenResponse.accessToken
            expiresIn = clientCredentialsTokenResponse.expiresIn
            tokenType = clientCredentialsTokenResponse.tokenType
            tokenUse = clientCredentialsTokenResponse.tokenUse
            hubId = clientCredentialsTokenResponse.hubId
            idToken = clientCredentialsTokenResponse.idToken
            scopes = clientCredentialsTokenResponse.scopes.map { it.toMutableList() }
            userId = clientCredentialsTokenResponse.userId
            additionalProperties =
                clientCredentialsTokenResponse.additionalProperties.toMutableMap()
        }

        fun accessToken(accessToken: String) = accessToken(JsonField.of(accessToken))

        /**
         * Sets [Builder.accessToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accessToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accessToken(accessToken: JsonField<String>) = apply { this.accessToken = accessToken }

        fun expiresIn(expiresIn: Long) = expiresIn(JsonField.of(expiresIn))

        /**
         * Sets [Builder.expiresIn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresIn] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun expiresIn(expiresIn: JsonField<Long>) = apply { this.expiresIn = expiresIn }

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

        fun hubId(hubId: Int) = hubId(JsonField.of(hubId))

        /**
         * Sets [Builder.hubId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hubId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hubId(hubId: JsonField<Int>) = apply { this.hubId = hubId }

        fun idToken(idToken: String) = idToken(JsonField.of(idToken))

        /**
         * Sets [Builder.idToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idToken] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idToken(idToken: JsonField<String>) = apply { this.idToken = idToken }

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

        fun userId(userId: Int) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<Int>) = apply { this.userId = userId }

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
         * Returns an immutable instance of [ClientCredentialsTokenResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accessToken()
         * .expiresIn()
         * .tokenType()
         * .tokenUse()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ClientCredentialsTokenResponse =
            ClientCredentialsTokenResponse(
                checkRequired("accessToken", accessToken),
                checkRequired("expiresIn", expiresIn),
                checkRequired("tokenType", tokenType),
                checkRequired("tokenUse", tokenUse),
                hubId,
                idToken,
                (scopes ?: JsonMissing.of()).map { it.toImmutable() },
                userId,
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
    fun validate(): ClientCredentialsTokenResponse = apply {
        if (validated) {
            return@apply
        }

        accessToken()
        expiresIn()
        tokenType()
        tokenUse().validate()
        hubId()
        idToken()
        scopes()
        userId()
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
        (if (accessToken.asKnown().isPresent) 1 else 0) +
            (if (expiresIn.asKnown().isPresent) 1 else 0) +
            (if (tokenType.asKnown().isPresent) 1 else 0) +
            (tokenUse.asKnown().getOrNull()?.validity() ?: 0) +
            (if (hubId.asKnown().isPresent) 1 else 0) +
            (if (idToken.asKnown().isPresent) 1 else 0) +
            (scopes.asKnown().getOrNull()?.size ?: 0) +
            (if (userId.asKnown().isPresent) 1 else 0)

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

            @JvmField val CLIENT_CREDENTIALS = of("client_credentials")

            @JvmStatic fun of(value: String) = TokenUse(JsonField.of(value))
        }

        /** An enum containing [TokenUse]'s known values. */
        enum class Known {
            CLIENT_CREDENTIALS
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
            CLIENT_CREDENTIALS,
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
                CLIENT_CREDENTIALS -> Value.CLIENT_CREDENTIALS
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
                CLIENT_CREDENTIALS -> Known.CLIENT_CREDENTIALS
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

        return other is ClientCredentialsTokenResponse &&
            accessToken == other.accessToken &&
            expiresIn == other.expiresIn &&
            tokenType == other.tokenType &&
            tokenUse == other.tokenUse &&
            hubId == other.hubId &&
            idToken == other.idToken &&
            scopes == other.scopes &&
            userId == other.userId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            accessToken,
            expiresIn,
            tokenType,
            tokenUse,
            hubId,
            idToken,
            scopes,
            userId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ClientCredentialsTokenResponse{accessToken=$accessToken, expiresIn=$expiresIn, tokenType=$tokenType, tokenUse=$tokenUse, hubId=$hubId, idToken=$idToken, scopes=$scopes, userId=$userId, additionalProperties=$additionalProperties}"
}
