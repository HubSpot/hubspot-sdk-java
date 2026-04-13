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

class LinkGenerationRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val subscriberIdString: JsonField<String>,
    private val language: JsonField<String>,
    private val subscriptionId: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("subscriberIdString")
        @ExcludeMissing
        subscriberIdString: JsonField<String> = JsonMissing.of(),
        @JsonProperty("language") @ExcludeMissing language: JsonField<String> = JsonMissing.of(),
        @JsonProperty("subscriptionId")
        @ExcludeMissing
        subscriptionId: JsonField<Long> = JsonMissing.of(),
    ) : this(subscriberIdString, language, subscriptionId, mutableMapOf())

    /**
     * A string representing the unique identifier of the subscriber. This property is required.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriberIdString(): String = subscriberIdString.getRequired("subscriberIdString")

    /**
     * The language in which the generated link should be presented, represented as a string.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun language(): Optional<String> = language.getOptional("language")

    /**
     * The unique identifier for the subscription, represented as an integer in int64 format.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subscriptionId(): Optional<Long> = subscriptionId.getOptional("subscriptionId")

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
     * Returns the raw JSON value of [language].
     *
     * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<String> = language

    /**
     * Returns the raw JSON value of [subscriptionId].
     *
     * Unlike [subscriptionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subscriptionId")
    @ExcludeMissing
    fun _subscriptionId(): JsonField<Long> = subscriptionId

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
         * Returns a mutable builder for constructing an instance of [LinkGenerationRequest].
         *
         * The following fields are required:
         * ```java
         * .subscriberIdString()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LinkGenerationRequest]. */
    class Builder internal constructor() {

        private var subscriberIdString: JsonField<String>? = null
        private var language: JsonField<String> = JsonMissing.of()
        private var subscriptionId: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(linkGenerationRequest: LinkGenerationRequest) = apply {
            subscriberIdString = linkGenerationRequest.subscriberIdString
            language = linkGenerationRequest.language
            subscriptionId = linkGenerationRequest.subscriptionId
            additionalProperties = linkGenerationRequest.additionalProperties.toMutableMap()
        }

        /**
         * A string representing the unique identifier of the subscriber. This property is required.
         */
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

        /**
         * The language in which the generated link should be presented, represented as a string.
         */
        fun language(language: String) = language(JsonField.of(language))

        /**
         * Sets [Builder.language] to an arbitrary JSON value.
         *
         * You should usually call [Builder.language] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun language(language: JsonField<String>) = apply { this.language = language }

        /**
         * The unique identifier for the subscription, represented as an integer in int64 format.
         */
        fun subscriptionId(subscriptionId: Long) = subscriptionId(JsonField.of(subscriptionId))

        /**
         * Sets [Builder.subscriptionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionId] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun subscriptionId(subscriptionId: JsonField<Long>) = apply {
            this.subscriptionId = subscriptionId
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
         * Returns an immutable instance of [LinkGenerationRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .subscriberIdString()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LinkGenerationRequest =
            LinkGenerationRequest(
                checkRequired("subscriberIdString", subscriberIdString),
                language,
                subscriptionId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LinkGenerationRequest = apply {
        if (validated) {
            return@apply
        }

        subscriberIdString()
        language()
        subscriptionId()
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
        (if (subscriberIdString.asKnown().isPresent) 1 else 0) +
            (if (language.asKnown().isPresent) 1 else 0) +
            (if (subscriptionId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LinkGenerationRequest &&
            subscriberIdString == other.subscriberIdString &&
            language == other.language &&
            subscriptionId == other.subscriptionId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(subscriberIdString, language, subscriptionId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LinkGenerationRequest{subscriberIdString=$subscriberIdString, language=$language, subscriptionId=$subscriptionId, additionalProperties=$additionalProperties}"
}
