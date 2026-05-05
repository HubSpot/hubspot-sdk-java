// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.conversations.customchannels

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
import kotlin.jvm.optionals.getOrNull

class PublicRecipient
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val deliveryIdentifier: JsonField<PublicDeliveryIdentifier>,
    private val actorId: JsonField<String>,
    private val name: JsonField<String>,
    private val recipientField: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("deliveryIdentifier")
        @ExcludeMissing
        deliveryIdentifier: JsonField<PublicDeliveryIdentifier> = JsonMissing.of(),
        @JsonProperty("actorId") @ExcludeMissing actorId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recipientField")
        @ExcludeMissing
        recipientField: JsonField<String> = JsonMissing.of(),
    ) : this(deliveryIdentifier, actorId, name, recipientField, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun deliveryIdentifier(): PublicDeliveryIdentifier =
        deliveryIdentifier.getRequired("deliveryIdentifier")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun actorId(): Optional<String> = actorId.getOptional("actorId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recipientField(): Optional<String> = recipientField.getOptional("recipientField")

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
     * Returns the raw JSON value of [actorId].
     *
     * Unlike [actorId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actorId") @ExcludeMissing fun _actorId(): JsonField<String> = actorId

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [recipientField].
     *
     * Unlike [recipientField], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("recipientField")
    @ExcludeMissing
    fun _recipientField(): JsonField<String> = recipientField

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
         * Returns a mutable builder for constructing an instance of [PublicRecipient].
         *
         * The following fields are required:
         * ```java
         * .deliveryIdentifier()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicRecipient]. */
    class Builder internal constructor() {

        private var deliveryIdentifier: JsonField<PublicDeliveryIdentifier>? = null
        private var actorId: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var recipientField: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicRecipient: PublicRecipient) = apply {
            deliveryIdentifier = publicRecipient.deliveryIdentifier
            actorId = publicRecipient.actorId
            name = publicRecipient.name
            recipientField = publicRecipient.recipientField
            additionalProperties = publicRecipient.additionalProperties.toMutableMap()
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

        fun actorId(actorId: String) = actorId(JsonField.of(actorId))

        /**
         * Sets [Builder.actorId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actorId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun actorId(actorId: JsonField<String>) = apply { this.actorId = actorId }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun recipientField(recipientField: String) = recipientField(JsonField.of(recipientField))

        /**
         * Sets [Builder.recipientField] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recipientField] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recipientField(recipientField: JsonField<String>) = apply {
            this.recipientField = recipientField
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
         * Returns an immutable instance of [PublicRecipient].
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
        fun build(): PublicRecipient =
            PublicRecipient(
                checkRequired("deliveryIdentifier", deliveryIdentifier),
                actorId,
                name,
                recipientField,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): PublicRecipient = apply {
        if (validated) {
            return@apply
        }

        deliveryIdentifier().validate()
        actorId()
        name()
        recipientField()
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
        (deliveryIdentifier.asKnown().getOrNull()?.validity() ?: 0) +
            (if (actorId.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (recipientField.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicRecipient &&
            deliveryIdentifier == other.deliveryIdentifier &&
            actorId == other.actorId &&
            name == other.name &&
            recipientField == other.recipientField &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(deliveryIdentifier, actorId, name, recipientField, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicRecipient{deliveryIdentifier=$deliveryIdentifier, actorId=$actorId, name=$name, recipientField=$recipientField, additionalProperties=$additionalProperties}"
}
