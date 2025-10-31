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

class MarketingEventCreateRequestParams
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val eventName: JsonField<String>,
    private val eventOrganizer: JsonField<String>,
    private val externalAccountId: JsonField<String>,
    private val externalEventId: JsonField<String>,
    private val customProperties: JsonField<List<PropertyValue>>,
    private val endDateTime: JsonField<OffsetDateTime>,
    private val eventCancelled: JsonField<Boolean>,
    private val eventCompleted: JsonField<Boolean>,
    private val eventDescription: JsonField<String>,
    private val eventType: JsonField<String>,
    private val eventUrl: JsonField<String>,
    private val startDateTime: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("eventName") @ExcludeMissing eventName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("eventOrganizer")
        @ExcludeMissing
        eventOrganizer: JsonField<String> = JsonMissing.of(),
        @JsonProperty("externalAccountId")
        @ExcludeMissing
        externalAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("externalEventId")
        @ExcludeMissing
        externalEventId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customProperties")
        @ExcludeMissing
        customProperties: JsonField<List<PropertyValue>> = JsonMissing.of(),
        @JsonProperty("endDateTime")
        @ExcludeMissing
        endDateTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("eventCancelled")
        @ExcludeMissing
        eventCancelled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("eventCompleted")
        @ExcludeMissing
        eventCompleted: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("eventDescription")
        @ExcludeMissing
        eventDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("eventType") @ExcludeMissing eventType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("eventUrl") @ExcludeMissing eventUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("startDateTime")
        @ExcludeMissing
        startDateTime: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        eventName,
        eventOrganizer,
        externalAccountId,
        externalEventId,
        customProperties,
        endDateTime,
        eventCancelled,
        eventCompleted,
        eventDescription,
        eventType,
        eventUrl,
        startDateTime,
        mutableMapOf(),
    )

    /**
     * The name of the marketing event.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventName(): String = eventName.getRequired("eventName")

    /**
     * The name of the organizer of the marketing event.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventOrganizer(): String = eventOrganizer.getRequired("eventOrganizer")

    /**
     * The accountId that is associated with this marketing event in the external event application.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun externalAccountId(): String = externalAccountId.getRequired("externalAccountId")

    /**
     * The id of the marketing event in the external event application.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun externalEventId(): String = externalEventId.getRequired("externalEventId")

    /**
     * A list of PropertyValues. These can be whatever kind of property names and values you want.
     * However, they must already exist on the HubSpot account's definition of the MarketingEvent
     * Object. If they don't they will be filtered out and not set. In order to do this you'll need
     * to create a new PropertyGroup on the HubSpot account's MarketingEvent object for your
     * specific app and create the Custom Property you want to track on that HubSpot account. Do not
     * create any new default properties on the MarketingEvent object as that will apply to all
     * HubSpot accounts.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customProperties(): Optional<List<PropertyValue>> =
        customProperties.getOptional("customProperties")

    /**
     * The end date and time of the marketing event.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endDateTime(): Optional<OffsetDateTime> = endDateTime.getOptional("endDateTime")

    /**
     * Indicates if the marketing event has been cancelled. Defaults to `false`
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun eventCancelled(): Optional<Boolean> = eventCancelled.getOptional("eventCancelled")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun eventCompleted(): Optional<Boolean> = eventCompleted.getOptional("eventCompleted")

    /**
     * The description of the marketing event.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun eventDescription(): Optional<String> = eventDescription.getOptional("eventDescription")

    /**
     * Describes what type of event this is. For example: `WEBINAR`, `CONFERENCE`, `WORKSHOP`
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun eventType(): Optional<String> = eventType.getOptional("eventType")

    /**
     * A URL in the external event application where the marketing event can be managed.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun eventUrl(): Optional<String> = eventUrl.getOptional("eventUrl")

    /**
     * The start date and time of the marketing event.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startDateTime(): Optional<OffsetDateTime> = startDateTime.getOptional("startDateTime")

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
     * Returns the raw JSON value of [eventCompleted].
     *
     * Unlike [eventCompleted], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventCompleted")
    @ExcludeMissing
    fun _eventCompleted(): JsonField<Boolean> = eventCompleted

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
         * [MarketingEventCreateRequestParams].
         *
         * The following fields are required:
         * ```java
         * .eventName()
         * .eventOrganizer()
         * .externalAccountId()
         * .externalEventId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MarketingEventCreateRequestParams]. */
    class Builder internal constructor() {

        private var eventName: JsonField<String>? = null
        private var eventOrganizer: JsonField<String>? = null
        private var externalAccountId: JsonField<String>? = null
        private var externalEventId: JsonField<String>? = null
        private var customProperties: JsonField<MutableList<PropertyValue>>? = null
        private var endDateTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var eventCancelled: JsonField<Boolean> = JsonMissing.of()
        private var eventCompleted: JsonField<Boolean> = JsonMissing.of()
        private var eventDescription: JsonField<String> = JsonMissing.of()
        private var eventType: JsonField<String> = JsonMissing.of()
        private var eventUrl: JsonField<String> = JsonMissing.of()
        private var startDateTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(marketingEventCreateRequestParams: MarketingEventCreateRequestParams) =
            apply {
                eventName = marketingEventCreateRequestParams.eventName
                eventOrganizer = marketingEventCreateRequestParams.eventOrganizer
                externalAccountId = marketingEventCreateRequestParams.externalAccountId
                externalEventId = marketingEventCreateRequestParams.externalEventId
                customProperties =
                    marketingEventCreateRequestParams.customProperties.map { it.toMutableList() }
                endDateTime = marketingEventCreateRequestParams.endDateTime
                eventCancelled = marketingEventCreateRequestParams.eventCancelled
                eventCompleted = marketingEventCreateRequestParams.eventCompleted
                eventDescription = marketingEventCreateRequestParams.eventDescription
                eventType = marketingEventCreateRequestParams.eventType
                eventUrl = marketingEventCreateRequestParams.eventUrl
                startDateTime = marketingEventCreateRequestParams.startDateTime
                additionalProperties =
                    marketingEventCreateRequestParams.additionalProperties.toMutableMap()
            }

        /** The name of the marketing event. */
        fun eventName(eventName: String) = eventName(JsonField.of(eventName))

        /**
         * Sets [Builder.eventName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventName(eventName: JsonField<String>) = apply { this.eventName = eventName }

        /** The name of the organizer of the marketing event. */
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

        /**
         * The accountId that is associated with this marketing event in the external event
         * application.
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

        /** The id of the marketing event in the external event application. */
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

        /**
         * A list of PropertyValues. These can be whatever kind of property names and values you
         * want. However, they must already exist on the HubSpot account's definition of the
         * MarketingEvent Object. If they don't they will be filtered out and not set. In order to
         * do this you'll need to create a new PropertyGroup on the HubSpot account's MarketingEvent
         * object for your specific app and create the Custom Property you want to track on that
         * HubSpot account. Do not create any new default properties on the MarketingEvent object as
         * that will apply to all HubSpot accounts.
         */
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

        /** The end date and time of the marketing event. */
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

        /** Indicates if the marketing event has been cancelled. Defaults to `false` */
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

        fun eventCompleted(eventCompleted: Boolean) = eventCompleted(JsonField.of(eventCompleted))

        /**
         * Sets [Builder.eventCompleted] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventCompleted] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun eventCompleted(eventCompleted: JsonField<Boolean>) = apply {
            this.eventCompleted = eventCompleted
        }

        /** The description of the marketing event. */
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

        /**
         * Describes what type of event this is. For example: `WEBINAR`, `CONFERENCE`, `WORKSHOP`
         */
        fun eventType(eventType: String) = eventType(JsonField.of(eventType))

        /**
         * Sets [Builder.eventType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventType(eventType: JsonField<String>) = apply { this.eventType = eventType }

        /** A URL in the external event application where the marketing event can be managed. */
        fun eventUrl(eventUrl: String) = eventUrl(JsonField.of(eventUrl))

        /**
         * Sets [Builder.eventUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun eventUrl(eventUrl: JsonField<String>) = apply { this.eventUrl = eventUrl }

        /** The start date and time of the marketing event. */
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
         * Returns an immutable instance of [MarketingEventCreateRequestParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .eventName()
         * .eventOrganizer()
         * .externalAccountId()
         * .externalEventId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MarketingEventCreateRequestParams =
            MarketingEventCreateRequestParams(
                checkRequired("eventName", eventName),
                checkRequired("eventOrganizer", eventOrganizer),
                checkRequired("externalAccountId", externalAccountId),
                checkRequired("externalEventId", externalEventId),
                (customProperties ?: JsonMissing.of()).map { it.toImmutable() },
                endDateTime,
                eventCancelled,
                eventCompleted,
                eventDescription,
                eventType,
                eventUrl,
                startDateTime,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MarketingEventCreateRequestParams = apply {
        if (validated) {
            return@apply
        }

        eventName()
        eventOrganizer()
        externalAccountId()
        externalEventId()
        customProperties().ifPresent { it.forEach { it.validate() } }
        endDateTime()
        eventCancelled()
        eventCompleted()
        eventDescription()
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
        (if (eventName.asKnown().isPresent) 1 else 0) +
            (if (eventOrganizer.asKnown().isPresent) 1 else 0) +
            (if (externalAccountId.asKnown().isPresent) 1 else 0) +
            (if (externalEventId.asKnown().isPresent) 1 else 0) +
            (customProperties.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (endDateTime.asKnown().isPresent) 1 else 0) +
            (if (eventCancelled.asKnown().isPresent) 1 else 0) +
            (if (eventCompleted.asKnown().isPresent) 1 else 0) +
            (if (eventDescription.asKnown().isPresent) 1 else 0) +
            (if (eventType.asKnown().isPresent) 1 else 0) +
            (if (eventUrl.asKnown().isPresent) 1 else 0) +
            (if (startDateTime.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MarketingEventCreateRequestParams &&
            eventName == other.eventName &&
            eventOrganizer == other.eventOrganizer &&
            externalAccountId == other.externalAccountId &&
            externalEventId == other.externalEventId &&
            customProperties == other.customProperties &&
            endDateTime == other.endDateTime &&
            eventCancelled == other.eventCancelled &&
            eventCompleted == other.eventCompleted &&
            eventDescription == other.eventDescription &&
            eventType == other.eventType &&
            eventUrl == other.eventUrl &&
            startDateTime == other.startDateTime &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            eventName,
            eventOrganizer,
            externalAccountId,
            externalEventId,
            customProperties,
            endDateTime,
            eventCancelled,
            eventCompleted,
            eventDescription,
            eventType,
            eventUrl,
            startDateTime,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MarketingEventCreateRequestParams{eventName=$eventName, eventOrganizer=$eventOrganizer, externalAccountId=$externalAccountId, externalEventId=$externalEventId, customProperties=$customProperties, endDateTime=$endDateTime, eventCancelled=$eventCancelled, eventCompleted=$eventCompleted, eventDescription=$eventDescription, eventType=$eventType, eventUrl=$eventUrl, startDateTime=$startDateTime, additionalProperties=$additionalProperties}"
}
