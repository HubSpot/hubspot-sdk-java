// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class ParticipationAssociations
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val contact: JsonField<ContactAssociation>,
    private val marketingEvent: JsonField<MarketingEventAssociation>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("contact")
        @ExcludeMissing
        contact: JsonField<ContactAssociation> = JsonMissing.of(),
        @JsonProperty("marketingEvent")
        @ExcludeMissing
        marketingEvent: JsonField<MarketingEventAssociation> = JsonMissing.of(),
    ) : this(contact, marketingEvent, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contact(): ContactAssociation = contact.getRequired("contact")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun marketingEvent(): MarketingEventAssociation = marketingEvent.getRequired("marketingEvent")

    /**
     * Returns the raw JSON value of [contact].
     *
     * Unlike [contact], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contact") @ExcludeMissing fun _contact(): JsonField<ContactAssociation> = contact

    /**
     * Returns the raw JSON value of [marketingEvent].
     *
     * Unlike [marketingEvent], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("marketingEvent")
    @ExcludeMissing
    fun _marketingEvent(): JsonField<MarketingEventAssociation> = marketingEvent

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
         * Returns a mutable builder for constructing an instance of [ParticipationAssociations].
         *
         * The following fields are required:
         * ```java
         * .contact()
         * .marketingEvent()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ParticipationAssociations]. */
    class Builder internal constructor() {

        private var contact: JsonField<ContactAssociation>? = null
        private var marketingEvent: JsonField<MarketingEventAssociation>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(participationAssociations: ParticipationAssociations) = apply {
            contact = participationAssociations.contact
            marketingEvent = participationAssociations.marketingEvent
            additionalProperties = participationAssociations.additionalProperties.toMutableMap()
        }

        fun contact(contact: ContactAssociation) = contact(JsonField.of(contact))

        /**
         * Sets [Builder.contact] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contact] with a well-typed [ContactAssociation] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun contact(contact: JsonField<ContactAssociation>) = apply { this.contact = contact }

        fun marketingEvent(marketingEvent: MarketingEventAssociation) =
            marketingEvent(JsonField.of(marketingEvent))

        /**
         * Sets [Builder.marketingEvent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.marketingEvent] with a well-typed
         * [MarketingEventAssociation] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun marketingEvent(marketingEvent: JsonField<MarketingEventAssociation>) = apply {
            this.marketingEvent = marketingEvent
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
         * Returns an immutable instance of [ParticipationAssociations].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .contact()
         * .marketingEvent()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ParticipationAssociations =
            ParticipationAssociations(
                checkRequired("contact", contact),
                checkRequired("marketingEvent", marketingEvent),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ParticipationAssociations = apply {
        if (validated) {
            return@apply
        }

        contact().validate()
        marketingEvent().validate()
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
        (contact.asKnown().getOrNull()?.validity() ?: 0) +
            (marketingEvent.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ParticipationAssociations &&
            contact == other.contact &&
            marketingEvent == other.marketingEvent &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(contact, marketingEvent, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ParticipationAssociations{contact=$contact, marketingEvent=$marketingEvent, additionalProperties=$additionalProperties}"
}
