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
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class MarketingEventPublicUpdateRequestV2
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val customProperties: JsonField<List<PropertyValue>>,
    private val endDateTime: JsonField<OffsetDateTime>,
    private val eventCancelled: JsonField<Boolean>,
    private val eventDescription: JsonField<String>,
    private val eventName: JsonField<String>,
    private val eventOrganizer: JsonField<String>,
    private val eventType: JsonField<String>,
    private val eventUrl: JsonField<String>,
    private val startDateTime: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("customProperties")
        @ExcludeMissing
        customProperties: JsonField<List<PropertyValue>> = JsonMissing.of(),
        @JsonProperty("endDateTime")
        @ExcludeMissing
        endDateTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("eventCancelled")
        @ExcludeMissing
        eventCancelled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("eventDescription")
        @ExcludeMissing
        eventDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("eventName") @ExcludeMissing eventName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("eventOrganizer")
        @ExcludeMissing
        eventOrganizer: JsonField<String> = JsonMissing.of(),
        @JsonProperty("eventType") @ExcludeMissing eventType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("eventUrl") @ExcludeMissing eventUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("startDateTime")
        @ExcludeMissing
        startDateTime: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        customProperties,
        endDateTime,
        eventCancelled,
        eventDescription,
        eventName,
        eventOrganizer,
        eventType,
        eventUrl,
        startDateTime,
        mutableMapOf(),
    )

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customProperties(): List<PropertyValue> = customProperties.getRequired("customProperties")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endDateTime(): Optional<OffsetDateTime> = endDateTime.getOptional("endDateTime")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun eventCancelled(): Optional<Boolean> = eventCancelled.getOptional("eventCancelled")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun eventDescription(): Optional<String> = eventDescription.getOptional("eventDescription")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun eventName(): Optional<String> = eventName.getOptional("eventName")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun eventOrganizer(): Optional<String> = eventOrganizer.getOptional("eventOrganizer")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun eventType(): Optional<String> = eventType.getOptional("eventType")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun eventUrl(): Optional<String> = eventUrl.getOptional("eventUrl")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startDateTime(): Optional<OffsetDateTime> = startDateTime.getOptional("startDateTime")

    /**
     * Returns the raw JSON value of [customProperties].
     *
     * Unlike [customProperties], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("customProperties")
    @ExcludeMissing
    fun _customProperties(): JsonField<List<PropertyValue>> = customProperties

    /**
     * Returns the raw JSON value of [endDateTime].
     *
     * Unlike [endDateTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endDateTime")
    @ExcludeMissing
    fun _endDateTime(): JsonField<OffsetDateTime> = endDateTime

    /**
     * Returns the raw JSON value of [eventCancelled].
     *
     * Unlike [eventCancelled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventCancelled")
    @ExcludeMissing
    fun _eventCancelled(): JsonField<Boolean> = eventCancelled

    /**
     * Returns the raw JSON value of [eventDescription].
     *
     * Unlike [eventDescription], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("eventDescription")
    @ExcludeMissing
    fun _eventDescription(): JsonField<String> = eventDescription

    /**
     * Returns the raw JSON value of [eventName].
     *
     * Unlike [eventName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventName") @ExcludeMissing fun _eventName(): JsonField<String> = eventName

    /**
     * Returns the raw JSON value of [eventOrganizer].
     *
     * Unlike [eventOrganizer], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventOrganizer")
    @ExcludeMissing
    fun _eventOrganizer(): JsonField<String> = eventOrganizer

    /**
     * Returns the raw JSON value of [eventType].
     *
     * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventType") @ExcludeMissing fun _eventType(): JsonField<String> = eventType

    /**
     * Returns the raw JSON value of [eventUrl].
     *
     * Unlike [eventUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventUrl") @ExcludeMissing fun _eventUrl(): JsonField<String> = eventUrl

    /**
     * Returns the raw JSON value of [startDateTime].
     *
     * Unlike [startDateTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startDateTime")
    @ExcludeMissing
    fun _startDateTime(): JsonField<OffsetDateTime> = startDateTime

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
         * [MarketingEventPublicUpdateRequestV2].
         *
         * The following fields are required:
         * ```java
         * .customProperties()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MarketingEventPublicUpdateRequestV2]. */
    class Builder internal constructor() {

        private var customProperties: JsonField<MutableList<PropertyValue>>? = null
        private var endDateTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var eventCancelled: JsonField<Boolean> = JsonMissing.of()
        private var eventDescription: JsonField<String> = JsonMissing.of()
        private var eventName: JsonField<String> = JsonMissing.of()
        private var eventOrganizer: JsonField<String> = JsonMissing.of()
        private var eventType: JsonField<String> = JsonMissing.of()
        private var eventUrl: JsonField<String> = JsonMissing.of()
        private var startDateTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            marketingEventPublicUpdateRequestV2: MarketingEventPublicUpdateRequestV2
        ) = apply {
            customProperties =
                marketingEventPublicUpdateRequestV2.customProperties.map { it.toMutableList() }
            endDateTime = marketingEventPublicUpdateRequestV2.endDateTime
            eventCancelled = marketingEventPublicUpdateRequestV2.eventCancelled
            eventDescription = marketingEventPublicUpdateRequestV2.eventDescription
            eventName = marketingEventPublicUpdateRequestV2.eventName
            eventOrganizer = marketingEventPublicUpdateRequestV2.eventOrganizer
            eventType = marketingEventPublicUpdateRequestV2.eventType
            eventUrl = marketingEventPublicUpdateRequestV2.eventUrl
            startDateTime = marketingEventPublicUpdateRequestV2.startDateTime
            additionalProperties =
                marketingEventPublicUpdateRequestV2.additionalProperties.toMutableMap()
        }

        fun customProperties(customProperties: List<PropertyValue>) =
            customProperties(JsonField.of(customProperties))

        /**
         * Sets [Builder.customProperties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customProperties] with a well-typed
         * `List<PropertyValue>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun customProperties(customProperties: JsonField<List<PropertyValue>>) = apply {
            this.customProperties = customProperties.map { it.toMutableList() }
        }

        /**
         * Adds a single [PropertyValue] to [customProperties].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCustomProperty(customProperty: PropertyValue) = apply {
            customProperties =
                (customProperties ?: JsonField.of(mutableListOf())).also {
                    checkKnown("customProperties", it).add(customProperty)
                }
        }

        fun endDateTime(endDateTime: OffsetDateTime) = endDateTime(JsonField.of(endDateTime))

        /**
         * Sets [Builder.endDateTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endDateTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endDateTime(endDateTime: JsonField<OffsetDateTime>) = apply {
            this.endDateTime = endDateTime
        }

        fun eventCancelled(eventCancelled: Boolean) = eventCancelled(JsonField.of(eventCancelled))

        /**
         * Sets [Builder.eventCancelled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventCancelled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun eventCancelled(eventCancelled: JsonField<Boolean>) = apply {
            this.eventCancelled = eventCancelled
        }

        fun eventDescription(eventDescription: String) =
            eventDescription(JsonField.of(eventDescription))

        /**
         * Sets [Builder.eventDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventDescription] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun eventDescription(eventDescription: JsonField<String>) = apply {
            this.eventDescription = eventDescription
        }

        fun eventName(eventName: String) = eventName(JsonField.of(eventName))

        /**
         * Sets [Builder.eventName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventName(eventName: JsonField<String>) = apply { this.eventName = eventName }

        fun eventOrganizer(eventOrganizer: String) = eventOrganizer(JsonField.of(eventOrganizer))

        /**
         * Sets [Builder.eventOrganizer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventOrganizer] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun eventOrganizer(eventOrganizer: JsonField<String>) = apply {
            this.eventOrganizer = eventOrganizer
        }

        fun eventType(eventType: String) = eventType(JsonField.of(eventType))

        /**
         * Sets [Builder.eventType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventType(eventType: JsonField<String>) = apply { this.eventType = eventType }

        fun eventUrl(eventUrl: String) = eventUrl(JsonField.of(eventUrl))

        /**
         * Sets [Builder.eventUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun eventUrl(eventUrl: JsonField<String>) = apply { this.eventUrl = eventUrl }

        fun startDateTime(startDateTime: OffsetDateTime) =
            startDateTime(JsonField.of(startDateTime))

        /**
         * Sets [Builder.startDateTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startDateTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startDateTime(startDateTime: JsonField<OffsetDateTime>) = apply {
            this.startDateTime = startDateTime
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
         * Returns an immutable instance of [MarketingEventPublicUpdateRequestV2].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .customProperties()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MarketingEventPublicUpdateRequestV2 =
            MarketingEventPublicUpdateRequestV2(
                checkRequired("customProperties", customProperties).map { it.toImmutable() },
                endDateTime,
                eventCancelled,
                eventDescription,
                eventName,
                eventOrganizer,
                eventType,
                eventUrl,
                startDateTime,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MarketingEventPublicUpdateRequestV2 = apply {
        if (validated) {
            return@apply
        }

        customProperties().forEach { it.validate() }
        endDateTime()
        eventCancelled()
        eventDescription()
        eventName()
        eventOrganizer()
        eventType()
        eventUrl()
        startDateTime()
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
        (customProperties.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (endDateTime.asKnown().isPresent) 1 else 0) +
            (if (eventCancelled.asKnown().isPresent) 1 else 0) +
            (if (eventDescription.asKnown().isPresent) 1 else 0) +
            (if (eventName.asKnown().isPresent) 1 else 0) +
            (if (eventOrganizer.asKnown().isPresent) 1 else 0) +
            (if (eventType.asKnown().isPresent) 1 else 0) +
            (if (eventUrl.asKnown().isPresent) 1 else 0) +
            (if (startDateTime.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MarketingEventPublicUpdateRequestV2 &&
            customProperties == other.customProperties &&
            endDateTime == other.endDateTime &&
            eventCancelled == other.eventCancelled &&
            eventDescription == other.eventDescription &&
            eventName == other.eventName &&
            eventOrganizer == other.eventOrganizer &&
            eventType == other.eventType &&
            eventUrl == other.eventUrl &&
            startDateTime == other.startDateTime &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            customProperties,
            endDateTime,
            eventCancelled,
            eventDescription,
            eventName,
            eventOrganizer,
            eventType,
            eventUrl,
            startDateTime,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MarketingEventPublicUpdateRequestV2{customProperties=$customProperties, endDateTime=$endDateTime, eventCancelled=$eventCancelled, eventDescription=$eventDescription, eventName=$eventName, eventOrganizer=$eventOrganizer, eventType=$eventType, eventUrl=$eventUrl, startDateTime=$startDateTime, additionalProperties=$additionalProperties}"
}
