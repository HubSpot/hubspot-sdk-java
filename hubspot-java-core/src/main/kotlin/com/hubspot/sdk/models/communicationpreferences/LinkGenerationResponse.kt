// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.communicationpreferences

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

class LinkGenerationResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val managePreferencesUrl: JsonField<String>,
    private val subscriberIdString: JsonField<String>,
    private val unsubscribeAllUrl: JsonField<String>,
    private val unsubscribeSingleUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("managePreferencesUrl")
        @ExcludeMissing
        managePreferencesUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("subscriberIdString")
        @ExcludeMissing
        subscriberIdString: JsonField<String> = JsonMissing.of(),
        @JsonProperty("unsubscribeAllUrl")
        @ExcludeMissing
        unsubscribeAllUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("unsubscribeSingleUrl")
        @ExcludeMissing
        unsubscribeSingleUrl: JsonField<String> = JsonMissing.of(),
    ) : this(
        managePreferencesUrl,
        subscriberIdString,
        unsubscribeAllUrl,
        unsubscribeSingleUrl,
        mutableMapOf(),
    )

    /**
     * The URL where the subscriber can manage their communication preferences.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun managePreferencesUrl(): String = managePreferencesUrl.getRequired("managePreferencesUrl")

    /**
     * A string representing the unique identifier of the subscriber.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriberIdString(): String = subscriberIdString.getRequired("subscriberIdString")

    /**
     * A string containing the URL for unsubscribing the subscriber from all communications.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun unsubscribeAllUrl(): String = unsubscribeAllUrl.getRequired("unsubscribeAllUrl")

    /**
     * A string containing the URL to unsubscribe the subscriber from a single communication.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun unsubscribeSingleUrl(): Optional<String> =
        unsubscribeSingleUrl.getOptional("unsubscribeSingleUrl")

    /**
     * Returns the raw JSON value of [managePreferencesUrl].
     *
     * Unlike [managePreferencesUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("managePreferencesUrl")
    @ExcludeMissing
    fun _managePreferencesUrl(): JsonField<String> = managePreferencesUrl

    /**
     * Returns the raw JSON value of [subscriberIdString].
     *
     * Unlike [subscriberIdString], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("subscriberIdString")
    @ExcludeMissing
    fun _subscriberIdString(): JsonField<String> = subscriberIdString

    /**
     * Returns the raw JSON value of [unsubscribeAllUrl].
     *
     * Unlike [unsubscribeAllUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("unsubscribeAllUrl")
    @ExcludeMissing
    fun _unsubscribeAllUrl(): JsonField<String> = unsubscribeAllUrl

    /**
     * Returns the raw JSON value of [unsubscribeSingleUrl].
     *
     * Unlike [unsubscribeSingleUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("unsubscribeSingleUrl")
    @ExcludeMissing
    fun _unsubscribeSingleUrl(): JsonField<String> = unsubscribeSingleUrl

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
         * Returns a mutable builder for constructing an instance of [LinkGenerationResponse].
         *
         * The following fields are required:
         * ```java
         * .managePreferencesUrl()
         * .subscriberIdString()
         * .unsubscribeAllUrl()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LinkGenerationResponse]. */
    class Builder internal constructor() {

        private var managePreferencesUrl: JsonField<String>? = null
        private var subscriberIdString: JsonField<String>? = null
        private var unsubscribeAllUrl: JsonField<String>? = null
        private var unsubscribeSingleUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(linkGenerationResponse: LinkGenerationResponse) = apply {
            managePreferencesUrl = linkGenerationResponse.managePreferencesUrl
            subscriberIdString = linkGenerationResponse.subscriberIdString
            unsubscribeAllUrl = linkGenerationResponse.unsubscribeAllUrl
            unsubscribeSingleUrl = linkGenerationResponse.unsubscribeSingleUrl
            additionalProperties = linkGenerationResponse.additionalProperties.toMutableMap()
        }

        /** The URL where the subscriber can manage their communication preferences. */
        fun managePreferencesUrl(managePreferencesUrl: String) =
            managePreferencesUrl(JsonField.of(managePreferencesUrl))

        /**
         * Sets [Builder.managePreferencesUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.managePreferencesUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun managePreferencesUrl(managePreferencesUrl: JsonField<String>) = apply {
            this.managePreferencesUrl = managePreferencesUrl
        }

        /** A string representing the unique identifier of the subscriber. */
        fun subscriberIdString(subscriberIdString: String) =
            subscriberIdString(JsonField.of(subscriberIdString))

        /**
         * Sets [Builder.subscriberIdString] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriberIdString] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subscriberIdString(subscriberIdString: JsonField<String>) = apply {
            this.subscriberIdString = subscriberIdString
        }

        /** A string containing the URL for unsubscribing the subscriber from all communications. */
        fun unsubscribeAllUrl(unsubscribeAllUrl: String) =
            unsubscribeAllUrl(JsonField.of(unsubscribeAllUrl))

        /**
         * Sets [Builder.unsubscribeAllUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unsubscribeAllUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun unsubscribeAllUrl(unsubscribeAllUrl: JsonField<String>) = apply {
            this.unsubscribeAllUrl = unsubscribeAllUrl
        }

        /**
         * A string containing the URL to unsubscribe the subscriber from a single communication.
         */
        fun unsubscribeSingleUrl(unsubscribeSingleUrl: String) =
            unsubscribeSingleUrl(JsonField.of(unsubscribeSingleUrl))

        /**
         * Sets [Builder.unsubscribeSingleUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unsubscribeSingleUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun unsubscribeSingleUrl(unsubscribeSingleUrl: JsonField<String>) = apply {
            this.unsubscribeSingleUrl = unsubscribeSingleUrl
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
         * Returns an immutable instance of [LinkGenerationResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .managePreferencesUrl()
         * .subscriberIdString()
         * .unsubscribeAllUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LinkGenerationResponse =
            LinkGenerationResponse(
                checkRequired("managePreferencesUrl", managePreferencesUrl),
                checkRequired("subscriberIdString", subscriberIdString),
                checkRequired("unsubscribeAllUrl", unsubscribeAllUrl),
                unsubscribeSingleUrl,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LinkGenerationResponse = apply {
        if (validated) {
            return@apply
        }

        managePreferencesUrl()
        subscriberIdString()
        unsubscribeAllUrl()
        unsubscribeSingleUrl()
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
        (if (managePreferencesUrl.asKnown().isPresent) 1 else 0) +
            (if (subscriberIdString.asKnown().isPresent) 1 else 0) +
            (if (unsubscribeAllUrl.asKnown().isPresent) 1 else 0) +
            (if (unsubscribeSingleUrl.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LinkGenerationResponse &&
            managePreferencesUrl == other.managePreferencesUrl &&
            subscriberIdString == other.subscriberIdString &&
            unsubscribeAllUrl == other.unsubscribeAllUrl &&
            unsubscribeSingleUrl == other.unsubscribeSingleUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            managePreferencesUrl,
            subscriberIdString,
            unsubscribeAllUrl,
            unsubscribeSingleUrl,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LinkGenerationResponse{managePreferencesUrl=$managePreferencesUrl, subscriberIdString=$subscriberIdString, unsubscribeAllUrl=$unsubscribeAllUrl, unsubscribeSingleUrl=$unsubscribeSingleUrl, additionalProperties=$additionalProperties}"
}
