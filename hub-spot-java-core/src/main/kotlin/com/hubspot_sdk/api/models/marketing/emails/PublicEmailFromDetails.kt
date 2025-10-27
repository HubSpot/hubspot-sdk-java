// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.emails

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/** Data structure representing the from fields on the email. */
class PublicEmailFromDetails
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val customReplyTo: JsonField<String>,
    private val fromName: JsonField<String>,
    private val replyTo: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("customReplyTo")
        @ExcludeMissing
        customReplyTo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fromName") @ExcludeMissing fromName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("replyTo") @ExcludeMissing replyTo: JsonField<String> = JsonMissing.of(),
    ) : this(customReplyTo, fromName, replyTo, mutableMapOf())

    /**
     * The reply to recipients will see.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customReplyTo(): Optional<String> = customReplyTo.getOptional("customReplyTo")

    /**
     * The name recipients will see.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fromName(): Optional<String> = fromName.getOptional("fromName")

    /**
     * The from address and reply to email address (if no customReplyTo defined) recipients will
     * see.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun replyTo(): Optional<String> = replyTo.getOptional("replyTo")

    /**
     * Returns the raw JSON value of [customReplyTo].
     *
     * Unlike [customReplyTo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customReplyTo")
    @ExcludeMissing
    fun _customReplyTo(): JsonField<String> = customReplyTo

    /**
     * Returns the raw JSON value of [fromName].
     *
     * Unlike [fromName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fromName") @ExcludeMissing fun _fromName(): JsonField<String> = fromName

    /**
     * Returns the raw JSON value of [replyTo].
     *
     * Unlike [replyTo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("replyTo") @ExcludeMissing fun _replyTo(): JsonField<String> = replyTo

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

        /** Returns a mutable builder for constructing an instance of [PublicEmailFromDetails]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicEmailFromDetails]. */
    class Builder internal constructor() {

        private var customReplyTo: JsonField<String> = JsonMissing.of()
        private var fromName: JsonField<String> = JsonMissing.of()
        private var replyTo: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicEmailFromDetails: PublicEmailFromDetails) = apply {
            customReplyTo = publicEmailFromDetails.customReplyTo
            fromName = publicEmailFromDetails.fromName
            replyTo = publicEmailFromDetails.replyTo
            additionalProperties = publicEmailFromDetails.additionalProperties.toMutableMap()
        }

        /** The reply to recipients will see. */
        fun customReplyTo(customReplyTo: String) = customReplyTo(JsonField.of(customReplyTo))

        /**
         * Sets [Builder.customReplyTo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customReplyTo] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customReplyTo(customReplyTo: JsonField<String>) = apply {
            this.customReplyTo = customReplyTo
        }

        /** The name recipients will see. */
        fun fromName(fromName: String) = fromName(JsonField.of(fromName))

        /**
         * Sets [Builder.fromName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fromName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fromName(fromName: JsonField<String>) = apply { this.fromName = fromName }

        /**
         * The from address and reply to email address (if no customReplyTo defined) recipients will
         * see.
         */
        fun replyTo(replyTo: String) = replyTo(JsonField.of(replyTo))

        /**
         * Sets [Builder.replyTo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.replyTo] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun replyTo(replyTo: JsonField<String>) = apply { this.replyTo = replyTo }

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
         * Returns an immutable instance of [PublicEmailFromDetails].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PublicEmailFromDetails =
            PublicEmailFromDetails(
                customReplyTo,
                fromName,
                replyTo,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicEmailFromDetails = apply {
        if (validated) {
            return@apply
        }

        customReplyTo()
        fromName()
        replyTo()
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
        (if (customReplyTo.asKnown().isPresent) 1 else 0) +
            (if (fromName.asKnown().isPresent) 1 else 0) +
            (if (replyTo.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicEmailFromDetails &&
            customReplyTo == other.customReplyTo &&
            fromName == other.fromName &&
            replyTo == other.replyTo &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(customReplyTo, fromName, replyTo, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicEmailFromDetails{customReplyTo=$customReplyTo, fromName=$fromName, replyTo=$replyTo, additionalProperties=$additionalProperties}"
}
