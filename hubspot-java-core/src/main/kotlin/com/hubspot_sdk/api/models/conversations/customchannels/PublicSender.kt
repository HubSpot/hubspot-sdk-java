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
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicSender
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val actorId: JsonField<String>,
    private val deliveryIdentifier: JsonField<PublicDeliveryIdentifier>,
    private val name: JsonField<String>,
    private val senderField: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("actorId") @ExcludeMissing actorId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("deliveryIdentifier")
        @ExcludeMissing
        deliveryIdentifier: JsonField<PublicDeliveryIdentifier> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("senderField")
        @ExcludeMissing
        senderField: JsonField<String> = JsonMissing.of(),
    ) : this(actorId, deliveryIdentifier, name, senderField, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun actorId(): Optional<String> = actorId.getOptional("actorId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deliveryIdentifier(): Optional<PublicDeliveryIdentifier> =
        deliveryIdentifier.getOptional("deliveryIdentifier")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun senderField(): Optional<String> = senderField.getOptional("senderField")

    /**
     * Returns the raw JSON value of [actorId].
     *
     * Unlike [actorId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actorId") @ExcludeMissing fun _actorId(): JsonField<String> = actorId

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
     * Returns the raw JSON value of [senderField].
     *
     * Unlike [senderField], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("senderField") @ExcludeMissing fun _senderField(): JsonField<String> = senderField

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

        /** Returns a mutable builder for constructing an instance of [PublicSender]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicSender]. */
    class Builder internal constructor() {

        private var actorId: JsonField<String> = JsonMissing.of()
        private var deliveryIdentifier: JsonField<PublicDeliveryIdentifier> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var senderField: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicSender: PublicSender) = apply {
            actorId = publicSender.actorId
            deliveryIdentifier = publicSender.deliveryIdentifier
            name = publicSender.name
            senderField = publicSender.senderField
            additionalProperties = publicSender.additionalProperties.toMutableMap()
        }

        fun actorId(actorId: String) = actorId(JsonField.of(actorId))

        /**
         * Sets [Builder.actorId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actorId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun actorId(actorId: JsonField<String>) = apply { this.actorId = actorId }

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

        fun senderField(senderField: String) = senderField(JsonField.of(senderField))

        /**
         * Sets [Builder.senderField] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senderField] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun senderField(senderField: JsonField<String>) = apply { this.senderField = senderField }

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
         * Returns an immutable instance of [PublicSender].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PublicSender =
            PublicSender(
                actorId,
                deliveryIdentifier,
                name,
                senderField,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicSender = apply {
        if (validated) {
            return@apply
        }

        actorId()
        deliveryIdentifier().ifPresent { it.validate() }
        name()
        senderField()
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
        (if (actorId.asKnown().isPresent) 1 else 0) +
            (deliveryIdentifier.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (senderField.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicSender &&
            actorId == other.actorId &&
            deliveryIdentifier == other.deliveryIdentifier &&
            name == other.name &&
            senderField == other.senderField &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(actorId, deliveryIdentifier, name, senderField, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicSender{actorId=$actorId, deliveryIdentifier=$deliveryIdentifier, name=$name, senderField=$senderField, additionalProperties=$additionalProperties}"
}
