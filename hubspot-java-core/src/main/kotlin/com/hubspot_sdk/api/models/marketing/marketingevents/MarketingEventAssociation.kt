// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.marketingevents

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

class MarketingEventAssociation
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val marketingEventId: JsonField<String>,
    private val name: JsonField<String>,
    private val externalAccountId: JsonField<String>,
    private val externalEventId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("marketingEventId")
        @ExcludeMissing
        marketingEventId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("externalAccountId")
        @ExcludeMissing
        externalAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("externalEventId")
        @ExcludeMissing
        externalEventId: JsonField<String> = JsonMissing.of(),
    ) : this(marketingEventId, name, externalAccountId, externalEventId, mutableMapOf())

    /**
     * The internal ID of the marketing event in HubSpot
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun marketingEventId(): String = marketingEventId.getRequired("marketingEventId")

    /**
     * The name of the marketing event in HubSpot
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * The account ID that is associated with this marketing event in the external event application
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalAccountId(): Optional<String> = externalAccountId.getOptional("externalAccountId")

    /**
     * The event ID that is associated with this marketing event in the external event application
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalEventId(): Optional<String> = externalEventId.getOptional("externalEventId")

    /**
     * Returns the raw JSON value of [marketingEventId].
     *
     * Unlike [marketingEventId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("marketingEventId")
    @ExcludeMissing
    fun _marketingEventId(): JsonField<String> = marketingEventId

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [externalAccountId].
     *
     * Unlike [externalAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("externalAccountId")
    @ExcludeMissing
    fun _externalAccountId(): JsonField<String> = externalAccountId

    /**
     * Returns the raw JSON value of [externalEventId].
     *
     * Unlike [externalEventId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("externalEventId")
    @ExcludeMissing
    fun _externalEventId(): JsonField<String> = externalEventId

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
         * Returns a mutable builder for constructing an instance of [MarketingEventAssociation].
         *
         * The following fields are required:
         * ```java
         * .marketingEventId()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MarketingEventAssociation]. */
    class Builder internal constructor() {

        private var marketingEventId: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var externalAccountId: JsonField<String> = JsonMissing.of()
        private var externalEventId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(marketingEventAssociation: MarketingEventAssociation) = apply {
            marketingEventId = marketingEventAssociation.marketingEventId
            name = marketingEventAssociation.name
            externalAccountId = marketingEventAssociation.externalAccountId
            externalEventId = marketingEventAssociation.externalEventId
            additionalProperties = marketingEventAssociation.additionalProperties.toMutableMap()
        }

        /** The internal ID of the marketing event in HubSpot */
        fun marketingEventId(marketingEventId: String) =
            marketingEventId(JsonField.of(marketingEventId))

        /**
         * Sets [Builder.marketingEventId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.marketingEventId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun marketingEventId(marketingEventId: JsonField<String>) = apply {
            this.marketingEventId = marketingEventId
        }

        /** The name of the marketing event in HubSpot */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * The account ID that is associated with this marketing event in the external event
         * application
         */
        fun externalAccountId(externalAccountId: String) =
            externalAccountId(JsonField.of(externalAccountId))

        /**
         * Sets [Builder.externalAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externalAccountId(externalAccountId: JsonField<String>) = apply {
            this.externalAccountId = externalAccountId
        }

        /**
         * The event ID that is associated with this marketing event in the external event
         * application
         */
        fun externalEventId(externalEventId: String) =
            externalEventId(JsonField.of(externalEventId))

        /**
         * Sets [Builder.externalEventId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalEventId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externalEventId(externalEventId: JsonField<String>) = apply {
            this.externalEventId = externalEventId
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
         * Returns an immutable instance of [MarketingEventAssociation].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .marketingEventId()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MarketingEventAssociation =
            MarketingEventAssociation(
                checkRequired("marketingEventId", marketingEventId),
                checkRequired("name", name),
                externalAccountId,
                externalEventId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MarketingEventAssociation = apply {
        if (validated) {
            return@apply
        }

        marketingEventId()
        name()
        externalAccountId()
        externalEventId()
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
        (if (marketingEventId.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (externalAccountId.asKnown().isPresent) 1 else 0) +
            (if (externalEventId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MarketingEventAssociation &&
            marketingEventId == other.marketingEventId &&
            name == other.name &&
            externalAccountId == other.externalAccountId &&
            externalEventId == other.externalEventId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            marketingEventId,
            name,
            externalAccountId,
            externalEventId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MarketingEventAssociation{marketingEventId=$marketingEventId, name=$name, externalAccountId=$externalAccountId, externalEventId=$externalEventId, additionalProperties=$additionalProperties}"
}
