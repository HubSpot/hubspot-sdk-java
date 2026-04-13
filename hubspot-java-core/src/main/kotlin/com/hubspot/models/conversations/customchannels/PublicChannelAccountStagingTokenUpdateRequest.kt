// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.conversations.customchannels

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.core.ExcludeMissing
import com.hubspot.core.JsonField
import com.hubspot.core.JsonMissing
import com.hubspot.core.JsonValue
import com.hubspot.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicChannelAccountStagingTokenUpdateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accountName: JsonField<String>,
    private val deliveryIdentifier: JsonField<PublicDeliveryIdentifier>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("accountName")
        @ExcludeMissing
        accountName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("deliveryIdentifier")
        @ExcludeMissing
        deliveryIdentifier: JsonField<PublicDeliveryIdentifier> = JsonMissing.of(),
    ) : this(accountName, deliveryIdentifier, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountName(): Optional<String> = accountName.getOptional("accountName")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deliveryIdentifier(): Optional<PublicDeliveryIdentifier> =
        deliveryIdentifier.getOptional("deliveryIdentifier")

    /**
     * Returns the raw JSON value of [accountName].
     *
     * Unlike [accountName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accountName") @ExcludeMissing fun _accountName(): JsonField<String> = accountName

    /**
     * Returns the raw JSON value of [deliveryIdentifier].
     *
     * Unlike [deliveryIdentifier], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("deliveryIdentifier")
    @ExcludeMissing
    fun _deliveryIdentifier(): JsonField<PublicDeliveryIdentifier> = deliveryIdentifier

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
         * [PublicChannelAccountStagingTokenUpdateRequest].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicChannelAccountStagingTokenUpdateRequest]. */
    class Builder internal constructor() {

        private var accountName: JsonField<String> = JsonMissing.of()
        private var deliveryIdentifier: JsonField<PublicDeliveryIdentifier> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            publicChannelAccountStagingTokenUpdateRequest:
                PublicChannelAccountStagingTokenUpdateRequest
        ) = apply {
            accountName = publicChannelAccountStagingTokenUpdateRequest.accountName
            deliveryIdentifier = publicChannelAccountStagingTokenUpdateRequest.deliveryIdentifier
            additionalProperties =
                publicChannelAccountStagingTokenUpdateRequest.additionalProperties.toMutableMap()
        }

        fun accountName(accountName: String) = accountName(JsonField.of(accountName))

        /**
         * Sets [Builder.accountName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountName(accountName: JsonField<String>) = apply { this.accountName = accountName }

        fun deliveryIdentifier(deliveryIdentifier: PublicDeliveryIdentifier) =
            deliveryIdentifier(JsonField.of(deliveryIdentifier))

        /**
         * Sets [Builder.deliveryIdentifier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deliveryIdentifier] with a well-typed
         * [PublicDeliveryIdentifier] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun deliveryIdentifier(deliveryIdentifier: JsonField<PublicDeliveryIdentifier>) = apply {
            this.deliveryIdentifier = deliveryIdentifier
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
         * Returns an immutable instance of [PublicChannelAccountStagingTokenUpdateRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PublicChannelAccountStagingTokenUpdateRequest =
            PublicChannelAccountStagingTokenUpdateRequest(
                accountName,
                deliveryIdentifier,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicChannelAccountStagingTokenUpdateRequest = apply {
        if (validated) {
            return@apply
        }

        accountName()
        deliveryIdentifier().ifPresent { it.validate() }
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
        (if (accountName.asKnown().isPresent) 1 else 0) +
            (deliveryIdentifier.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicChannelAccountStagingTokenUpdateRequest &&
            accountName == other.accountName &&
            deliveryIdentifier == other.deliveryIdentifier &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(accountName, deliveryIdentifier, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicChannelAccountStagingTokenUpdateRequest{accountName=$accountName, deliveryIdentifier=$deliveryIdentifier, additionalProperties=$additionalProperties}"
}
