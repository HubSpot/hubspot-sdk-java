// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ChannelIntegrationParticipant
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val deliveryIdentifier: JsonField<PublicDeliveryIdentifier>,
    private val name: JsonField<String>,
    private val senderActorId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("deliveryIdentifier")
        @ExcludeMissing
        deliveryIdentifier: JsonField<PublicDeliveryIdentifier> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("senderActorId")
        @ExcludeMissing
        senderActorId: JsonField<String> = JsonMissing.of(),
    ) : this(deliveryIdentifier, name, senderActorId, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun deliveryIdentifier(): PublicDeliveryIdentifier =
        deliveryIdentifier.getRequired("deliveryIdentifier")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun senderActorId(): Optional<String> = senderActorId.getOptional("senderActorId")

    /**
     * Returns the raw JSON value of [deliveryIdentifier].
     *
     * Unlike [deliveryIdentifier], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("deliveryIdentifier")
    @ExcludeMissing
    fun _deliveryIdentifier(): JsonField<PublicDeliveryIdentifier> = deliveryIdentifier

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [senderActorId].
     *
     * Unlike [senderActorId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("senderActorId")
    @ExcludeMissing
    fun _senderActorId(): JsonField<String> = senderActorId

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
         * [ChannelIntegrationParticipant].
         *
         * The following fields are required:
         * ```java
         * .deliveryIdentifier()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ChannelIntegrationParticipant]. */
    class Builder internal constructor() {

        private var deliveryIdentifier: JsonField<PublicDeliveryIdentifier>? = null
        private var name: JsonField<String> = JsonMissing.of()
        private var senderActorId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(channelIntegrationParticipant: ChannelIntegrationParticipant) = apply {
            deliveryIdentifier = channelIntegrationParticipant.deliveryIdentifier
            name = channelIntegrationParticipant.name
            senderActorId = channelIntegrationParticipant.senderActorId
            additionalProperties = channelIntegrationParticipant.additionalProperties.toMutableMap()
        }

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

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun senderActorId(senderActorId: String) = senderActorId(JsonField.of(senderActorId))

        /**
         * Sets [Builder.senderActorId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senderActorId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun senderActorId(senderActorId: JsonField<String>) = apply {
            this.senderActorId = senderActorId
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
         * Returns an immutable instance of [ChannelIntegrationParticipant].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .deliveryIdentifier()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ChannelIntegrationParticipant =
            ChannelIntegrationParticipant(
                checkRequired("deliveryIdentifier", deliveryIdentifier),
                name,
                senderActorId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ChannelIntegrationParticipant = apply {
        if (validated) {
            return@apply
        }

        deliveryIdentifier().validate()
        name()
        senderActorId()
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
        (deliveryIdentifier.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (senderActorId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChannelIntegrationParticipant &&
            deliveryIdentifier == other.deliveryIdentifier &&
            name == other.name &&
            senderActorId == other.senderActorId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(deliveryIdentifier, name, senderActorId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ChannelIntegrationParticipant{deliveryIdentifier=$deliveryIdentifier, name=$name, senderActorId=$senderActorId, additionalProperties=$additionalProperties}"
}
