// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.occurrences

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class ExternalUnifiedEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val eventType: JsonField<String>,
    private val objectId: JsonField<String>,
    private val objectType: JsonField<String>,
    private val occurredAt: JsonField<OffsetDateTime>,
    private val properties: JsonField<Properties>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("eventType") @ExcludeMissing eventType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("objectId") @ExcludeMissing objectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("objectType")
        @ExcludeMissing
        objectType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("occurredAt")
        @ExcludeMissing
        occurredAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("properties")
        @ExcludeMissing
        properties: JsonField<Properties> = JsonMissing.of(),
    ) : this(id, eventType, objectId, objectType, occurredAt, properties, mutableMapOf())

    /**
     * A unique identifier for the event.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The format of the `eventType` string is `ae{appId}_{eventTypeLabel}`,
     * `pe{portalId}_{eventTypeLabel}`, or just `e_{eventTypeLabel}` for HubSpot events.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventType(): String = eventType.getRequired("eventType")

    /**
     * The objectId of the object which did the event.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectId(): String = objectId.getRequired("objectId")

    /**
     * The objectType for the object which did the event.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectType(): String = objectType.getRequired("objectType")

    /**
     * An ISO 8601 timestamp when the event occurred.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun occurredAt(): OffsetDateTime = occurredAt.getRequired("occurredAt")

    /**
     * A key-value map of event-specific properties. The available properties depend on the event
     * type definition.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun properties(): Properties = properties.getRequired("properties")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [eventType].
     *
     * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventType") @ExcludeMissing fun _eventType(): JsonField<String> = eventType

    /**
     * Returns the raw JSON value of [objectId].
     *
     * Unlike [objectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectId") @ExcludeMissing fun _objectId(): JsonField<String> = objectId

    /**
     * Returns the raw JSON value of [objectType].
     *
     * Unlike [objectType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectType") @ExcludeMissing fun _objectType(): JsonField<String> = objectType

    /**
     * Returns the raw JSON value of [occurredAt].
     *
     * Unlike [occurredAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("occurredAt")
    @ExcludeMissing
    fun _occurredAt(): JsonField<OffsetDateTime> = occurredAt

    /**
     * Returns the raw JSON value of [properties].
     *
     * Unlike [properties], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("properties")
    @ExcludeMissing
    fun _properties(): JsonField<Properties> = properties

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
         * Returns a mutable builder for constructing an instance of [ExternalUnifiedEvent].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .eventType()
         * .objectId()
         * .objectType()
         * .occurredAt()
         * .properties()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalUnifiedEvent]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var eventType: JsonField<String>? = null
        private var objectId: JsonField<String>? = null
        private var objectType: JsonField<String>? = null
        private var occurredAt: JsonField<OffsetDateTime>? = null
        private var properties: JsonField<Properties>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalUnifiedEvent: ExternalUnifiedEvent) = apply {
            id = externalUnifiedEvent.id
            eventType = externalUnifiedEvent.eventType
            objectId = externalUnifiedEvent.objectId
            objectType = externalUnifiedEvent.objectType
            occurredAt = externalUnifiedEvent.occurredAt
            properties = externalUnifiedEvent.properties
            additionalProperties = externalUnifiedEvent.additionalProperties.toMutableMap()
        }

        /** A unique identifier for the event. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The format of the `eventType` string is `ae{appId}_{eventTypeLabel}`,
         * `pe{portalId}_{eventTypeLabel}`, or just `e_{eventTypeLabel}` for HubSpot events.
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

        /** The objectId of the object which did the event. */
        fun objectId(objectId: String) = objectId(JsonField.of(objectId))

        /**
         * Sets [Builder.objectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun objectId(objectId: JsonField<String>) = apply { this.objectId = objectId }

        /** The objectType for the object which did the event. */
        fun objectType(objectType: String) = objectType(JsonField.of(objectType))

        /**
         * Sets [Builder.objectType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun objectType(objectType: JsonField<String>) = apply { this.objectType = objectType }

        /** An ISO 8601 timestamp when the event occurred. */
        fun occurredAt(occurredAt: OffsetDateTime) = occurredAt(JsonField.of(occurredAt))

        /**
         * Sets [Builder.occurredAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.occurredAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun occurredAt(occurredAt: JsonField<OffsetDateTime>) = apply {
            this.occurredAt = occurredAt
        }

        /**
         * A key-value map of event-specific properties. The available properties depend on the
         * event type definition.
         */
        fun properties(properties: Properties) = properties(JsonField.of(properties))

        /**
         * Sets [Builder.properties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.properties] with a well-typed [Properties] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun properties(properties: JsonField<Properties>) = apply { this.properties = properties }

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
         * Returns an immutable instance of [ExternalUnifiedEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .eventType()
         * .objectId()
         * .objectType()
         * .occurredAt()
         * .properties()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalUnifiedEvent =
            ExternalUnifiedEvent(
                checkRequired("id", id),
                checkRequired("eventType", eventType),
                checkRequired("objectId", objectId),
                checkRequired("objectType", objectType),
                checkRequired("occurredAt", occurredAt),
                checkRequired("properties", properties),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalUnifiedEvent = apply {
        if (validated) {
            return@apply
        }

        id()
        eventType()
        objectId()
        objectType()
        occurredAt()
        properties().validate()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (eventType.asKnown().isPresent) 1 else 0) +
            (if (objectId.asKnown().isPresent) 1 else 0) +
            (if (objectType.asKnown().isPresent) 1 else 0) +
            (if (occurredAt.asKnown().isPresent) 1 else 0) +
            (properties.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * A key-value map of event-specific properties. The available properties depend on the event
     * type definition.
     */
    class Properties
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Properties]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Properties]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(properties: Properties) = apply {
                additionalProperties = properties.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Properties].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Properties = Properties(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Properties = apply {
            if (validated) {
                return@apply
            }

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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Properties && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Properties{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalUnifiedEvent &&
            id == other.id &&
            eventType == other.eventType &&
            objectId == other.objectId &&
            objectType == other.objectType &&
            occurredAt == other.occurredAt &&
            properties == other.properties &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            eventType,
            objectId,
            objectType,
            occurredAt,
            properties,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalUnifiedEvent{id=$id, eventType=$eventType, objectId=$objectId, objectType=$objectType, occurredAt=$occurredAt, properties=$properties, additionalProperties=$additionalProperties}"
}
