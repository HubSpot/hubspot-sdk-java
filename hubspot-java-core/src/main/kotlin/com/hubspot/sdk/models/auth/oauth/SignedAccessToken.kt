// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.auth.oauth

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

class SignedAccessToken
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val appId: JsonField<Int>,
    private val expiresAt: JsonField<Long>,
    private val hubId: JsonField<Int>,
    private val hublet: JsonField<String>,
    private val installingUserId: JsonField<Int>,
    private val isPrivateDistribution: JsonField<Boolean>,
    private val isServiceAccount: JsonField<Boolean>,
    private val isUserLevel: JsonField<Boolean>,
    private val newSignature: JsonField<String>,
    private val scopes: JsonField<String>,
    private val scopeToScopeGroupPks: JsonField<String>,
    private val signature: JsonField<String>,
    private val trialScopes: JsonField<String>,
    private val trialScopeToScopeGroupPks: JsonField<String>,
    private val userId: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("appId") @ExcludeMissing appId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("expiresAt") @ExcludeMissing expiresAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("hubId") @ExcludeMissing hubId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("hublet") @ExcludeMissing hublet: JsonField<String> = JsonMissing.of(),
        @JsonProperty("installingUserId")
        @ExcludeMissing
        installingUserId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("isPrivateDistribution")
        @ExcludeMissing
        isPrivateDistribution: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isServiceAccount")
        @ExcludeMissing
        isServiceAccount: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isUserLevel")
        @ExcludeMissing
        isUserLevel: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("newSignature")
        @ExcludeMissing
        newSignature: JsonField<String> = JsonMissing.of(),
        @JsonProperty("scopes") @ExcludeMissing scopes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("scopeToScopeGroupPks")
        @ExcludeMissing
        scopeToScopeGroupPks: JsonField<String> = JsonMissing.of(),
        @JsonProperty("signature") @ExcludeMissing signature: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trialScopes")
        @ExcludeMissing
        trialScopes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trialScopeToScopeGroupPks")
        @ExcludeMissing
        trialScopeToScopeGroupPks: JsonField<String> = JsonMissing.of(),
        @JsonProperty("userId") @ExcludeMissing userId: JsonField<Int> = JsonMissing.of(),
    ) : this(
        appId,
        expiresAt,
        hubId,
        hublet,
        installingUserId,
        isPrivateDistribution,
        isServiceAccount,
        isUserLevel,
        newSignature,
        scopes,
        scopeToScopeGroupPks,
        signature,
        trialScopes,
        trialScopeToScopeGroupPks,
        userId,
        mutableMapOf(),
    )

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun appId(): Int = appId.getRequired("appId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expiresAt(): Long = expiresAt.getRequired("expiresAt")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hubId(): Int = hubId.getRequired("hubId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hublet(): String = hublet.getRequired("hublet")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun installingUserId(): Int = installingUserId.getRequired("installingUserId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isPrivateDistribution(): Boolean =
        isPrivateDistribution.getRequired("isPrivateDistribution")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isServiceAccount(): Boolean = isServiceAccount.getRequired("isServiceAccount")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isUserLevel(): Boolean = isUserLevel.getRequired("isUserLevel")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun newSignature(): String = newSignature.getRequired("newSignature")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scopes(): String = scopes.getRequired("scopes")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scopeToScopeGroupPks(): String = scopeToScopeGroupPks.getRequired("scopeToScopeGroupPks")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun signature(): String = signature.getRequired("signature")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun trialScopes(): String = trialScopes.getRequired("trialScopes")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun trialScopeToScopeGroupPks(): String =
        trialScopeToScopeGroupPks.getRequired("trialScopeToScopeGroupPks")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userId(): Int = userId.getRequired("userId")

    /**
     * Returns the raw JSON value of [appId].
     *
     * Unlike [appId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("appId") @ExcludeMissing fun _appId(): JsonField<Int> = appId

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expiresAt") @ExcludeMissing fun _expiresAt(): JsonField<Long> = expiresAt

    /**
     * Returns the raw JSON value of [hubId].
     *
     * Unlike [hubId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hubId") @ExcludeMissing fun _hubId(): JsonField<Int> = hubId

    /**
     * Returns the raw JSON value of [hublet].
     *
     * Unlike [hublet], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hublet") @ExcludeMissing fun _hublet(): JsonField<String> = hublet

    /**
     * Returns the raw JSON value of [installingUserId].
     *
     * Unlike [installingUserId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("installingUserId")
    @ExcludeMissing
    fun _installingUserId(): JsonField<Int> = installingUserId

    /**
     * Returns the raw JSON value of [isPrivateDistribution].
     *
     * Unlike [isPrivateDistribution], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("isPrivateDistribution")
    @ExcludeMissing
    fun _isPrivateDistribution(): JsonField<Boolean> = isPrivateDistribution

    /**
     * Returns the raw JSON value of [isServiceAccount].
     *
     * Unlike [isServiceAccount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("isServiceAccount")
    @ExcludeMissing
    fun _isServiceAccount(): JsonField<Boolean> = isServiceAccount

    /**
     * Returns the raw JSON value of [isUserLevel].
     *
     * Unlike [isUserLevel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isUserLevel")
    @ExcludeMissing
    fun _isUserLevel(): JsonField<Boolean> = isUserLevel

    /**
     * Returns the raw JSON value of [newSignature].
     *
     * Unlike [newSignature], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("newSignature")
    @ExcludeMissing
    fun _newSignature(): JsonField<String> = newSignature

    /**
     * Returns the raw JSON value of [scopes].
     *
     * Unlike [scopes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scopes") @ExcludeMissing fun _scopes(): JsonField<String> = scopes

    /**
     * Returns the raw JSON value of [scopeToScopeGroupPks].
     *
     * Unlike [scopeToScopeGroupPks], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("scopeToScopeGroupPks")
    @ExcludeMissing
    fun _scopeToScopeGroupPks(): JsonField<String> = scopeToScopeGroupPks

    /**
     * Returns the raw JSON value of [signature].
     *
     * Unlike [signature], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("signature") @ExcludeMissing fun _signature(): JsonField<String> = signature

    /**
     * Returns the raw JSON value of [trialScopes].
     *
     * Unlike [trialScopes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trialScopes") @ExcludeMissing fun _trialScopes(): JsonField<String> = trialScopes

    /**
     * Returns the raw JSON value of [trialScopeToScopeGroupPks].
     *
     * Unlike [trialScopeToScopeGroupPks], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("trialScopeToScopeGroupPks")
    @ExcludeMissing
    fun _trialScopeToScopeGroupPks(): JsonField<String> = trialScopeToScopeGroupPks

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

        /**
         * Returns a mutable builder for constructing an instance of [SignedAccessToken].
         *
         * The following fields are required:
         * ```java
         * .appId()
         * .expiresAt()
         * .hubId()
         * .hublet()
         * .installingUserId()
         * .isPrivateDistribution()
         * .isServiceAccount()
         * .isUserLevel()
         * .newSignature()
         * .scopes()
         * .scopeToScopeGroupPks()
         * .signature()
         * .trialScopes()
         * .trialScopeToScopeGroupPks()
         * .userId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SignedAccessToken]. */
    class Builder internal constructor() {

        private var appId: JsonField<Int>? = null
        private var expiresAt: JsonField<Long>? = null
        private var hubId: JsonField<Int>? = null
        private var hublet: JsonField<String>? = null
        private var installingUserId: JsonField<Int>? = null
        private var isPrivateDistribution: JsonField<Boolean>? = null
        private var isServiceAccount: JsonField<Boolean>? = null
        private var isUserLevel: JsonField<Boolean>? = null
        private var newSignature: JsonField<String>? = null
        private var scopes: JsonField<String>? = null
        private var scopeToScopeGroupPks: JsonField<String>? = null
        private var signature: JsonField<String>? = null
        private var trialScopes: JsonField<String>? = null
        private var trialScopeToScopeGroupPks: JsonField<String>? = null
        private var userId: JsonField<Int>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(signedAccessToken: SignedAccessToken) = apply {
            appId = signedAccessToken.appId
            expiresAt = signedAccessToken.expiresAt
            hubId = signedAccessToken.hubId
            hublet = signedAccessToken.hublet
            installingUserId = signedAccessToken.installingUserId
            isPrivateDistribution = signedAccessToken.isPrivateDistribution
            isServiceAccount = signedAccessToken.isServiceAccount
            isUserLevel = signedAccessToken.isUserLevel
            newSignature = signedAccessToken.newSignature
            scopes = signedAccessToken.scopes
            scopeToScopeGroupPks = signedAccessToken.scopeToScopeGroupPks
            signature = signedAccessToken.signature
            trialScopes = signedAccessToken.trialScopes
            trialScopeToScopeGroupPks = signedAccessToken.trialScopeToScopeGroupPks
            userId = signedAccessToken.userId
            additionalProperties = signedAccessToken.additionalProperties.toMutableMap()
        }

        fun appId(appId: Int) = appId(JsonField.of(appId))

        /**
         * Sets [Builder.appId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.appId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun appId(appId: JsonField<Int>) = apply { this.appId = appId }

        fun expiresAt(expiresAt: Long) = expiresAt(JsonField.of(expiresAt))

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun expiresAt(expiresAt: JsonField<Long>) = apply { this.expiresAt = expiresAt }

        fun hubId(hubId: Int) = hubId(JsonField.of(hubId))

        /**
         * Sets [Builder.hubId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hubId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hubId(hubId: JsonField<Int>) = apply { this.hubId = hubId }

        fun hublet(hublet: String) = hublet(JsonField.of(hublet))

        /**
         * Sets [Builder.hublet] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hublet] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hublet(hublet: JsonField<String>) = apply { this.hublet = hublet }

        fun installingUserId(installingUserId: Int) =
            installingUserId(JsonField.of(installingUserId))

        /**
         * Sets [Builder.installingUserId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.installingUserId] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun installingUserId(installingUserId: JsonField<Int>) = apply {
            this.installingUserId = installingUserId
        }

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

        fun isServiceAccount(isServiceAccount: Boolean) =
            isServiceAccount(JsonField.of(isServiceAccount))

        /**
         * Sets [Builder.isServiceAccount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isServiceAccount] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isServiceAccount(isServiceAccount: JsonField<Boolean>) = apply {
            this.isServiceAccount = isServiceAccount
        }

        fun isUserLevel(isUserLevel: Boolean) = isUserLevel(JsonField.of(isUserLevel))

        /**
         * Sets [Builder.isUserLevel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isUserLevel] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isUserLevel(isUserLevel: JsonField<Boolean>) = apply { this.isUserLevel = isUserLevel }

        fun newSignature(newSignature: String) = newSignature(JsonField.of(newSignature))

        /**
         * Sets [Builder.newSignature] to an arbitrary JSON value.
         *
         * You should usually call [Builder.newSignature] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun newSignature(newSignature: JsonField<String>) = apply {
            this.newSignature = newSignature
        }

        fun scopes(scopes: String) = scopes(JsonField.of(scopes))

        /**
         * Sets [Builder.scopes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scopes] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun scopes(scopes: JsonField<String>) = apply { this.scopes = scopes }

        fun scopeToScopeGroupPks(scopeToScopeGroupPks: String) =
            scopeToScopeGroupPks(JsonField.of(scopeToScopeGroupPks))

        /**
         * Sets [Builder.scopeToScopeGroupPks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scopeToScopeGroupPks] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun scopeToScopeGroupPks(scopeToScopeGroupPks: JsonField<String>) = apply {
            this.scopeToScopeGroupPks = scopeToScopeGroupPks
        }

        fun signature(signature: String) = signature(JsonField.of(signature))

        /**
         * Sets [Builder.signature] to an arbitrary JSON value.
         *
         * You should usually call [Builder.signature] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun signature(signature: JsonField<String>) = apply { this.signature = signature }

        fun trialScopes(trialScopes: String) = trialScopes(JsonField.of(trialScopes))

        /**
         * Sets [Builder.trialScopes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trialScopes] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun trialScopes(trialScopes: JsonField<String>) = apply { this.trialScopes = trialScopes }

        fun trialScopeToScopeGroupPks(trialScopeToScopeGroupPks: String) =
            trialScopeToScopeGroupPks(JsonField.of(trialScopeToScopeGroupPks))

        /**
         * Sets [Builder.trialScopeToScopeGroupPks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trialScopeToScopeGroupPks] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun trialScopeToScopeGroupPks(trialScopeToScopeGroupPks: JsonField<String>) = apply {
            this.trialScopeToScopeGroupPks = trialScopeToScopeGroupPks
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
         * Returns an immutable instance of [SignedAccessToken].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .appId()
         * .expiresAt()
         * .hubId()
         * .hublet()
         * .installingUserId()
         * .isPrivateDistribution()
         * .isServiceAccount()
         * .isUserLevel()
         * .newSignature()
         * .scopes()
         * .scopeToScopeGroupPks()
         * .signature()
         * .trialScopes()
         * .trialScopeToScopeGroupPks()
         * .userId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SignedAccessToken =
            SignedAccessToken(
                checkRequired("appId", appId),
                checkRequired("expiresAt", expiresAt),
                checkRequired("hubId", hubId),
                checkRequired("hublet", hublet),
                checkRequired("installingUserId", installingUserId),
                checkRequired("isPrivateDistribution", isPrivateDistribution),
                checkRequired("isServiceAccount", isServiceAccount),
                checkRequired("isUserLevel", isUserLevel),
                checkRequired("newSignature", newSignature),
                checkRequired("scopes", scopes),
                checkRequired("scopeToScopeGroupPks", scopeToScopeGroupPks),
                checkRequired("signature", signature),
                checkRequired("trialScopes", trialScopes),
                checkRequired("trialScopeToScopeGroupPks", trialScopeToScopeGroupPks),
                checkRequired("userId", userId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SignedAccessToken = apply {
        if (validated) {
            return@apply
        }

        appId()
        expiresAt()
        hubId()
        hublet()
        installingUserId()
        isPrivateDistribution()
        isServiceAccount()
        isUserLevel()
        newSignature()
        scopes()
        scopeToScopeGroupPks()
        signature()
        trialScopes()
        trialScopeToScopeGroupPks()
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
        (if (appId.asKnown().isPresent) 1 else 0) +
            (if (expiresAt.asKnown().isPresent) 1 else 0) +
            (if (hubId.asKnown().isPresent) 1 else 0) +
            (if (hublet.asKnown().isPresent) 1 else 0) +
            (if (installingUserId.asKnown().isPresent) 1 else 0) +
            (if (isPrivateDistribution.asKnown().isPresent) 1 else 0) +
            (if (isServiceAccount.asKnown().isPresent) 1 else 0) +
            (if (isUserLevel.asKnown().isPresent) 1 else 0) +
            (if (newSignature.asKnown().isPresent) 1 else 0) +
            (if (scopes.asKnown().isPresent) 1 else 0) +
            (if (scopeToScopeGroupPks.asKnown().isPresent) 1 else 0) +
            (if (signature.asKnown().isPresent) 1 else 0) +
            (if (trialScopes.asKnown().isPresent) 1 else 0) +
            (if (trialScopeToScopeGroupPks.asKnown().isPresent) 1 else 0) +
            (if (userId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SignedAccessToken &&
            appId == other.appId &&
            expiresAt == other.expiresAt &&
            hubId == other.hubId &&
            hublet == other.hublet &&
            installingUserId == other.installingUserId &&
            isPrivateDistribution == other.isPrivateDistribution &&
            isServiceAccount == other.isServiceAccount &&
            isUserLevel == other.isUserLevel &&
            newSignature == other.newSignature &&
            scopes == other.scopes &&
            scopeToScopeGroupPks == other.scopeToScopeGroupPks &&
            signature == other.signature &&
            trialScopes == other.trialScopes &&
            trialScopeToScopeGroupPks == other.trialScopeToScopeGroupPks &&
            userId == other.userId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            appId,
            expiresAt,
            hubId,
            hublet,
            installingUserId,
            isPrivateDistribution,
            isServiceAccount,
            isUserLevel,
            newSignature,
            scopes,
            scopeToScopeGroupPks,
            signature,
            trialScopes,
            trialScopeToScopeGroupPks,
            userId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SignedAccessToken{appId=$appId, expiresAt=$expiresAt, hubId=$hubId, hublet=$hublet, installingUserId=$installingUserId, isPrivateDistribution=$isPrivateDistribution, isServiceAccount=$isServiceAccount, isUserLevel=$isUserLevel, newSignature=$newSignature, scopes=$scopes, scopeToScopeGroupPks=$scopeToScopeGroupPks, signature=$signature, trialScopes=$trialScopes, trialScopeToScopeGroupPks=$trialScopeToScopeGroupPks, userId=$userId, additionalProperties=$additionalProperties}"
}
