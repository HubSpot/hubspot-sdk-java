// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicRecipientEgg
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val deliveryIdentifiers: JsonField<List<PublicDeliveryIdentifier>>,
    private val actorId: JsonField<String>,
    private val deliveryIdentifier: JsonField<PublicDeliveryIdentifier>,
    private val name: JsonField<String>,
    private val recipientField: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("deliveryIdentifiers")
        @ExcludeMissing
        deliveryIdentifiers: JsonField<List<PublicDeliveryIdentifier>> = JsonMissing.of(),
        @JsonProperty("actorId") @ExcludeMissing actorId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("deliveryIdentifier")
        @ExcludeMissing
        deliveryIdentifier: JsonField<PublicDeliveryIdentifier> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recipientField")
        @ExcludeMissing
        recipientField: JsonField<String> = JsonMissing.of(),
    ) : this(deliveryIdentifiers, actorId, deliveryIdentifier, name, recipientField, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun deliveryIdentifiers(): List<PublicDeliveryIdentifier> =
        deliveryIdentifiers.getRequired("deliveryIdentifiers")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun actorId(): Optional<String> = actorId.getOptional("actorId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deliveryIdentifier(): Optional<PublicDeliveryIdentifier> =
        deliveryIdentifier.getOptional("deliveryIdentifier")

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
     * Returns the raw JSON value of [deliveryIdentifiers].
     *
     * Unlike [deliveryIdentifiers], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("deliveryIdentifiers")
    @ExcludeMissing
    fun _deliveryIdentifiers(): JsonField<List<PublicDeliveryIdentifier>> = deliveryIdentifiers

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
         * Returns a mutable builder for constructing an instance of [PublicRecipientEgg].
         *
         * The following fields are required:
         * ```java
         * .deliveryIdentifiers()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicRecipientEgg]. */
    class Builder internal constructor() {

        private var deliveryIdentifiers: JsonField<MutableList<PublicDeliveryIdentifier>>? = null
        private var actorId: JsonField<String> = JsonMissing.of()
        private var deliveryIdentifier: JsonField<PublicDeliveryIdentifier> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var recipientField: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicRecipientEgg: PublicRecipientEgg) = apply {
            deliveryIdentifiers = publicRecipientEgg.deliveryIdentifiers.map { it.toMutableList() }
            actorId = publicRecipientEgg.actorId
            deliveryIdentifier = publicRecipientEgg.deliveryIdentifier
            name = publicRecipientEgg.name
            recipientField = publicRecipientEgg.recipientField
            additionalProperties = publicRecipientEgg.additionalProperties.toMutableMap()
        }

        fun deliveryIdentifiers(deliveryIdentifiers: List<PublicDeliveryIdentifier>) =
            deliveryIdentifiers(JsonField.of(deliveryIdentifiers))

        /**
         * Sets [Builder.deliveryIdentifiers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deliveryIdentifiers] with a well-typed
         * `List<PublicDeliveryIdentifier>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun deliveryIdentifiers(deliveryIdentifiers: JsonField<List<PublicDeliveryIdentifier>>) =
            apply {
                this.deliveryIdentifiers = deliveryIdentifiers.map { it.toMutableList() }
            }

        /**
         * Adds a single [PublicDeliveryIdentifier] to [deliveryIdentifiers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDeliveryIdentifier(deliveryIdentifier: PublicDeliveryIdentifier) = apply {
            deliveryIdentifiers =
                (deliveryIdentifiers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("deliveryIdentifiers", it).add(deliveryIdentifier)
                }
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
         * Returns an immutable instance of [PublicRecipientEgg].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .deliveryIdentifiers()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicRecipientEgg =
            PublicRecipientEgg(
                checkRequired("deliveryIdentifiers", deliveryIdentifiers).map { it.toImmutable() },
                actorId,
                deliveryIdentifier,
                name,
                recipientField,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicRecipientEgg = apply {
        if (validated) {
            return@apply
        }

        deliveryIdentifiers().forEach { it.validate() }
        actorId()
        deliveryIdentifier().ifPresent { it.validate() }
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
        (deliveryIdentifiers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (actorId.asKnown().isPresent) 1 else 0) +
            (deliveryIdentifier.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (recipientField.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicRecipientEgg &&
            deliveryIdentifiers == other.deliveryIdentifiers &&
            actorId == other.actorId &&
            deliveryIdentifier == other.deliveryIdentifier &&
            name == other.name &&
            recipientField == other.recipientField &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            deliveryIdentifiers,
            actorId,
            deliveryIdentifier,
            name,
            recipientField,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicRecipientEgg{deliveryIdentifiers=$deliveryIdentifiers, actorId=$actorId, deliveryIdentifier=$deliveryIdentifier, name=$name, recipientField=$recipientField, additionalProperties=$additionalProperties}"
}
