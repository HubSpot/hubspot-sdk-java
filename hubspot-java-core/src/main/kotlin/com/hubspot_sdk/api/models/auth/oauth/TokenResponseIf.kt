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
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class TokenResponseIf
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accessToken: JsonField<String>,
    private val expiresIn: JsonField<Long>,
    private val hubId: JsonField<Int>,
    private val idToken: JsonField<String>,
    private val scopes: JsonField<List<String>>,
    private val tokenType: JsonField<String>,
    private val userId: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("accessToken")
        @ExcludeMissing
        accessToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expiresIn") @ExcludeMissing expiresIn: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("hubId") @ExcludeMissing hubId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("idToken") @ExcludeMissing idToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("scopes") @ExcludeMissing scopes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("tokenType") @ExcludeMissing tokenType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("userId") @ExcludeMissing userId: JsonField<Int> = JsonMissing.of(),
    ) : this(accessToken, expiresIn, hubId, idToken, scopes, tokenType, userId, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accessToken(): Optional<String> = accessToken.getOptional("accessToken")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expiresIn(): Optional<Long> = expiresIn.getOptional("expiresIn")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hubId(): Optional<Int> = hubId.getOptional("hubId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun idToken(): Optional<String> = idToken.getOptional("idToken")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scopes(): Optional<List<String>> = scopes.getOptional("scopes")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tokenType(): Optional<String> = tokenType.getOptional("tokenType")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userId(): Optional<Int> = userId.getOptional("userId")

    /**
     * Returns the raw JSON value of [accessToken].
     *
     * Unlike [accessToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accessToken") @ExcludeMissing fun _accessToken(): JsonField<String> = accessToken

    /**
     * Returns the raw JSON value of [expiresIn].
     *
     * Unlike [expiresIn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expiresIn") @ExcludeMissing fun _expiresIn(): JsonField<Long> = expiresIn

    /**
     * Returns the raw JSON value of [hubId].
     *
     * Unlike [hubId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hubId") @ExcludeMissing fun _hubId(): JsonField<Int> = hubId

    /**
     * Returns the raw JSON value of [idToken].
     *
     * Unlike [idToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idToken") @ExcludeMissing fun _idToken(): JsonField<String> = idToken

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
    @JsonProperty("tokenType") @ExcludeMissing fun _tokenType(): JsonField<String> = tokenType

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("userId") @ExcludeMissing fun _userId(): JsonField<Int> = userId

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

        /** Returns a mutable builder for constructing an instance of [TokenResponseIf]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TokenResponseIf]. */
    class Builder internal constructor() {

        private var accessToken: JsonField<String> = JsonMissing.of()
        private var expiresIn: JsonField<Long> = JsonMissing.of()
        private var hubId: JsonField<Int> = JsonMissing.of()
        private var idToken: JsonField<String> = JsonMissing.of()
        private var scopes: JsonField<MutableList<String>>? = null
        private var tokenType: JsonField<String> = JsonMissing.of()
        private var userId: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(tokenResponseIf: TokenResponseIf) = apply {
            accessToken = tokenResponseIf.accessToken
            expiresIn = tokenResponseIf.expiresIn
            hubId = tokenResponseIf.hubId
            idToken = tokenResponseIf.idToken
            scopes = tokenResponseIf.scopes.map { it.toMutableList() }
            tokenType = tokenResponseIf.tokenType
            userId = tokenResponseIf.userId
            additionalProperties = tokenResponseIf.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [TokenResponseIf].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TokenResponseIf =
            TokenResponseIf(
                accessToken,
                expiresIn,
                hubId,
                idToken,
                (scopes ?: JsonMissing.of()).map { it.toImmutable() },
                tokenType,
                userId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TokenResponseIf = apply {
        if (validated) {
            return@apply
        }

        accessToken()
        expiresIn()
        hubId()
        idToken()
        scopes()
        tokenType()
        userId()
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
        (if (accessToken.asKnown().isPresent) 1 else 0) +
            (if (expiresIn.asKnown().isPresent) 1 else 0) +
            (if (hubId.asKnown().isPresent) 1 else 0) +
            (if (idToken.asKnown().isPresent) 1 else 0) +
            (scopes.asKnown().getOrNull()?.size ?: 0) +
            (if (tokenType.asKnown().isPresent) 1 else 0) +
            (if (userId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TokenResponseIf &&
            accessToken == other.accessToken &&
            expiresIn == other.expiresIn &&
            hubId == other.hubId &&
            idToken == other.idToken &&
            scopes == other.scopes &&
            tokenType == other.tokenType &&
            userId == other.userId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            accessToken,
            expiresIn,
            hubId,
            idToken,
            scopes,
            tokenType,
            userId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TokenResponseIf{accessToken=$accessToken, expiresIn=$expiresIn, hubId=$hubId, idToken=$idToken, scopes=$scopes, tokenType=$tokenType, userId=$userId, additionalProperties=$additionalProperties}"
}
