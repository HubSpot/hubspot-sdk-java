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

class PublicChannelAccountEgg
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val authorized: JsonField<Boolean>,
    private val inboxId: JsonField<String>,
    private val name: JsonField<String>,
    private val deliveryIdentifier: JsonField<PublicDeliveryIdentifier>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("authorized")
        @ExcludeMissing
        authorized: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("inboxId") @ExcludeMissing inboxId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("deliveryIdentifier")
        @ExcludeMissing
        deliveryIdentifier: JsonField<PublicDeliveryIdentifier> = JsonMissing.of(),
    ) : this(authorized, inboxId, name, deliveryIdentifier, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun authorized(): Boolean = authorized.getRequired("authorized")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inboxId(): String = inboxId.getRequired("inboxId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deliveryIdentifier(): Optional<PublicDeliveryIdentifier> =
        deliveryIdentifier.getOptional("deliveryIdentifier")

    /**
     * Returns the raw JSON value of [authorized].
     *
     * Unlike [authorized], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("authorized") @ExcludeMissing fun _authorized(): JsonField<Boolean> = authorized

    /**
     * Returns the raw JSON value of [inboxId].
     *
     * Unlike [inboxId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inboxId") @ExcludeMissing fun _inboxId(): JsonField<String> = inboxId

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
         * Returns a mutable builder for constructing an instance of [PublicChannelAccountEgg].
         *
         * The following fields are required:
         * ```java
         * .authorized()
         * .inboxId()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicChannelAccountEgg]. */
    class Builder internal constructor() {

        private var authorized: JsonField<Boolean>? = null
        private var inboxId: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var deliveryIdentifier: JsonField<PublicDeliveryIdentifier> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicChannelAccountEgg: PublicChannelAccountEgg) = apply {
            authorized = publicChannelAccountEgg.authorized
            inboxId = publicChannelAccountEgg.inboxId
            name = publicChannelAccountEgg.name
            deliveryIdentifier = publicChannelAccountEgg.deliveryIdentifier
            additionalProperties = publicChannelAccountEgg.additionalProperties.toMutableMap()
        }

        fun authorized(authorized: Boolean) = authorized(JsonField.of(authorized))

        /**
         * Sets [Builder.authorized] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authorized] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun authorized(authorized: JsonField<Boolean>) = apply { this.authorized = authorized }

        fun inboxId(inboxId: String) = inboxId(JsonField.of(inboxId))

        /**
         * Sets [Builder.inboxId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inboxId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun inboxId(inboxId: JsonField<String>) = apply { this.inboxId = inboxId }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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
         * Returns an immutable instance of [PublicChannelAccountEgg].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .authorized()
         * .inboxId()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicChannelAccountEgg =
            PublicChannelAccountEgg(
                checkRequired("authorized", authorized),
                checkRequired("inboxId", inboxId),
                checkRequired("name", name),
                deliveryIdentifier,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicChannelAccountEgg = apply {
        if (validated) {
            return@apply
        }

        authorized()
        inboxId()
        name()
        deliveryIdentifier().ifPresent { it.validate() }
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
        (if (authorized.asKnown().isPresent) 1 else 0) +
            (if (inboxId.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (deliveryIdentifier.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicChannelAccountEgg &&
            authorized == other.authorized &&
            inboxId == other.inboxId &&
            name == other.name &&
            deliveryIdentifier == other.deliveryIdentifier &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(authorized, inboxId, name, deliveryIdentifier, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicChannelAccountEgg{authorized=$authorized, inboxId=$inboxId, name=$name, deliveryIdentifier=$deliveryIdentifier, additionalProperties=$additionalProperties}"
}
