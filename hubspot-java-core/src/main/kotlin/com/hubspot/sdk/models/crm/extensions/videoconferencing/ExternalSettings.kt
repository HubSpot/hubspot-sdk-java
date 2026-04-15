// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.extensions.videoconferencing

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

class ExternalSettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val createMeetingUrl: JsonField<String>,
    private val deleteMeetingUrl: JsonField<String>,
    private val fetchAccountsUri: JsonField<String>,
    private val updateMeetingUrl: JsonField<String>,
    private val userVerifyUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("createMeetingUrl")
        @ExcludeMissing
        createMeetingUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("deleteMeetingUrl")
        @ExcludeMissing
        deleteMeetingUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fetchAccountsUri")
        @ExcludeMissing
        fetchAccountsUri: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updateMeetingUrl")
        @ExcludeMissing
        updateMeetingUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("userVerifyUrl")
        @ExcludeMissing
        userVerifyUrl: JsonField<String> = JsonMissing.of(),
    ) : this(
        createMeetingUrl,
        deleteMeetingUrl,
        fetchAccountsUri,
        updateMeetingUrl,
        userVerifyUrl,
        mutableMapOf(),
    )

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createMeetingUrl(): String = createMeetingUrl.getRequired("createMeetingUrl")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deleteMeetingUrl(): Optional<String> = deleteMeetingUrl.getOptional("deleteMeetingUrl")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fetchAccountsUri(): Optional<String> = fetchAccountsUri.getOptional("fetchAccountsUri")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updateMeetingUrl(): Optional<String> = updateMeetingUrl.getOptional("updateMeetingUrl")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userVerifyUrl(): Optional<String> = userVerifyUrl.getOptional("userVerifyUrl")

    /**
     * Returns the raw JSON value of [createMeetingUrl].
     *
     * Unlike [createMeetingUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("createMeetingUrl")
    @ExcludeMissing
    fun _createMeetingUrl(): JsonField<String> = createMeetingUrl

    /**
     * Returns the raw JSON value of [deleteMeetingUrl].
     *
     * Unlike [deleteMeetingUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("deleteMeetingUrl")
    @ExcludeMissing
    fun _deleteMeetingUrl(): JsonField<String> = deleteMeetingUrl

    /**
     * Returns the raw JSON value of [fetchAccountsUri].
     *
     * Unlike [fetchAccountsUri], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("fetchAccountsUri")
    @ExcludeMissing
    fun _fetchAccountsUri(): JsonField<String> = fetchAccountsUri

    /**
     * Returns the raw JSON value of [updateMeetingUrl].
     *
     * Unlike [updateMeetingUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("updateMeetingUrl")
    @ExcludeMissing
    fun _updateMeetingUrl(): JsonField<String> = updateMeetingUrl

    /**
     * Returns the raw JSON value of [userVerifyUrl].
     *
     * Unlike [userVerifyUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("userVerifyUrl")
    @ExcludeMissing
    fun _userVerifyUrl(): JsonField<String> = userVerifyUrl

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
         * Returns a mutable builder for constructing an instance of [ExternalSettings].
         *
         * The following fields are required:
         * ```java
         * .createMeetingUrl()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalSettings]. */
    class Builder internal constructor() {

        private var createMeetingUrl: JsonField<String>? = null
        private var deleteMeetingUrl: JsonField<String> = JsonMissing.of()
        private var fetchAccountsUri: JsonField<String> = JsonMissing.of()
        private var updateMeetingUrl: JsonField<String> = JsonMissing.of()
        private var userVerifyUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalSettings: ExternalSettings) = apply {
            createMeetingUrl = externalSettings.createMeetingUrl
            deleteMeetingUrl = externalSettings.deleteMeetingUrl
            fetchAccountsUri = externalSettings.fetchAccountsUri
            updateMeetingUrl = externalSettings.updateMeetingUrl
            userVerifyUrl = externalSettings.userVerifyUrl
            additionalProperties = externalSettings.additionalProperties.toMutableMap()
        }

        fun createMeetingUrl(createMeetingUrl: String) =
            createMeetingUrl(JsonField.of(createMeetingUrl))

        /**
         * Sets [Builder.createMeetingUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createMeetingUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createMeetingUrl(createMeetingUrl: JsonField<String>) = apply {
            this.createMeetingUrl = createMeetingUrl
        }

        fun deleteMeetingUrl(deleteMeetingUrl: String) =
            deleteMeetingUrl(JsonField.of(deleteMeetingUrl))

        /**
         * Sets [Builder.deleteMeetingUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deleteMeetingUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun deleteMeetingUrl(deleteMeetingUrl: JsonField<String>) = apply {
            this.deleteMeetingUrl = deleteMeetingUrl
        }

        fun fetchAccountsUri(fetchAccountsUri: String) =
            fetchAccountsUri(JsonField.of(fetchAccountsUri))

        /**
         * Sets [Builder.fetchAccountsUri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fetchAccountsUri] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fetchAccountsUri(fetchAccountsUri: JsonField<String>) = apply {
            this.fetchAccountsUri = fetchAccountsUri
        }

        fun updateMeetingUrl(updateMeetingUrl: String) =
            updateMeetingUrl(JsonField.of(updateMeetingUrl))

        /**
         * Sets [Builder.updateMeetingUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updateMeetingUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updateMeetingUrl(updateMeetingUrl: JsonField<String>) = apply {
            this.updateMeetingUrl = updateMeetingUrl
        }

        fun userVerifyUrl(userVerifyUrl: String) = userVerifyUrl(JsonField.of(userVerifyUrl))

        /**
         * Sets [Builder.userVerifyUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userVerifyUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun userVerifyUrl(userVerifyUrl: JsonField<String>) = apply {
            this.userVerifyUrl = userVerifyUrl
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
         * Returns an immutable instance of [ExternalSettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .createMeetingUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalSettings =
            ExternalSettings(
                checkRequired("createMeetingUrl", createMeetingUrl),
                deleteMeetingUrl,
                fetchAccountsUri,
                updateMeetingUrl,
                userVerifyUrl,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalSettings = apply {
        if (validated) {
            return@apply
        }

        createMeetingUrl()
        deleteMeetingUrl()
        fetchAccountsUri()
        updateMeetingUrl()
        userVerifyUrl()
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
        (if (createMeetingUrl.asKnown().isPresent) 1 else 0) +
            (if (deleteMeetingUrl.asKnown().isPresent) 1 else 0) +
            (if (fetchAccountsUri.asKnown().isPresent) 1 else 0) +
            (if (updateMeetingUrl.asKnown().isPresent) 1 else 0) +
            (if (userVerifyUrl.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalSettings &&
            createMeetingUrl == other.createMeetingUrl &&
            deleteMeetingUrl == other.deleteMeetingUrl &&
            fetchAccountsUri == other.fetchAccountsUri &&
            updateMeetingUrl == other.updateMeetingUrl &&
            userVerifyUrl == other.userVerifyUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            createMeetingUrl,
            deleteMeetingUrl,
            fetchAccountsUri,
            updateMeetingUrl,
            userVerifyUrl,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalSettings{createMeetingUrl=$createMeetingUrl, deleteMeetingUrl=$deleteMeetingUrl, fetchAccountsUri=$fetchAccountsUri, updateMeetingUrl=$updateMeetingUrl, userVerifyUrl=$userVerifyUrl, additionalProperties=$additionalProperties}"
}
