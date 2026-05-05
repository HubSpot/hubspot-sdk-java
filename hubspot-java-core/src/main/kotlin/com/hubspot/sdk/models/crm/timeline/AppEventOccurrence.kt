// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.timeline

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.toImmutable
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AppEventOccurrence
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val eventTypeName: JsonField<String>,
    private val properties: JsonField<Properties>,
    private val domain: JsonField<String>,
    private val email: JsonField<String>,
    private val extraData: JsonValue,
    private val objectId: JsonField<String>,
    private val objectTypeFullyQualifiedName: JsonField<String>,
    private val timelineIFrame: JsonField<TimelineEventIFrame>,
    private val timestamp: JsonField<OffsetDateTime>,
    private val utk: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("eventTypeName")
        @ExcludeMissing
        eventTypeName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("properties")
        @ExcludeMissing
        properties: JsonField<Properties> = JsonMissing.of(),
        @JsonProperty("domain") @ExcludeMissing domain: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("extraData") @ExcludeMissing extraData: JsonValue = JsonMissing.of(),
        @JsonProperty("objectId") @ExcludeMissing objectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("objectTypeFullyQualifiedName")
        @ExcludeMissing
        objectTypeFullyQualifiedName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timelineIFrame")
        @ExcludeMissing
        timelineIFrame: JsonField<TimelineEventIFrame> = JsonMissing.of(),
        @JsonProperty("timestamp")
        @ExcludeMissing
        timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("utk") @ExcludeMissing utk: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        eventTypeName,
        properties,
        domain,
        email,
        extraData,
        objectId,
        objectTypeFullyQualifiedName,
        timelineIFrame,
        timestamp,
        utk,
        mutableMapOf(),
    )

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventTypeName(): String = eventTypeName.getRequired("eventTypeName")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun properties(): Properties = properties.getRequired("properties")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun domain(): Optional<String> = domain.getOptional("domain")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun email(): Optional<String> = email.getOptional("email")

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = appEventOccurrence.extraData().convert(MyClass.class);
     * ```
     */
    @JsonProperty("extraData") @ExcludeMissing fun _extraData(): JsonValue = extraData

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun objectId(): Optional<String> = objectId.getOptional("objectId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun objectTypeFullyQualifiedName(): Optional<String> =
        objectTypeFullyQualifiedName.getOptional("objectTypeFullyQualifiedName")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timelineIFrame(): Optional<TimelineEventIFrame> =
        timelineIFrame.getOptional("timelineIFrame")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timestamp(): Optional<OffsetDateTime> = timestamp.getOptional("timestamp")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun utk(): Optional<String> = utk.getOptional("utk")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [eventTypeName].
     *
     * Unlike [eventTypeName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventTypeName")
    @ExcludeMissing
    fun _eventTypeName(): JsonField<String> = eventTypeName

    /**
     * Returns the raw JSON value of [properties].
     *
     * Unlike [properties], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("properties")
    @ExcludeMissing
    fun _properties(): JsonField<Properties> = properties

    /**
     * Returns the raw JSON value of [domain].
     *
     * Unlike [domain], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("domain") @ExcludeMissing fun _domain(): JsonField<String> = domain

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [objectId].
     *
     * Unlike [objectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectId") @ExcludeMissing fun _objectId(): JsonField<String> = objectId

    /**
     * Returns the raw JSON value of [objectTypeFullyQualifiedName].
     *
     * Unlike [objectTypeFullyQualifiedName], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("objectTypeFullyQualifiedName")
    @ExcludeMissing
    fun _objectTypeFullyQualifiedName(): JsonField<String> = objectTypeFullyQualifiedName

    /**
     * Returns the raw JSON value of [timelineIFrame].
     *
     * Unlike [timelineIFrame], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timelineIFrame")
    @ExcludeMissing
    fun _timelineIFrame(): JsonField<TimelineEventIFrame> = timelineIFrame

    /**
     * Returns the raw JSON value of [timestamp].
     *
     * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timestamp")
    @ExcludeMissing
    fun _timestamp(): JsonField<OffsetDateTime> = timestamp

    /**
     * Returns the raw JSON value of [utk].
     *
     * Unlike [utk], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("utk") @ExcludeMissing fun _utk(): JsonField<String> = utk

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
         * Returns a mutable builder for constructing an instance of [AppEventOccurrence].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .eventTypeName()
         * .properties()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AppEventOccurrence]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var eventTypeName: JsonField<String>? = null
        private var properties: JsonField<Properties>? = null
        private var domain: JsonField<String> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var extraData: JsonValue = JsonMissing.of()
        private var objectId: JsonField<String> = JsonMissing.of()
        private var objectTypeFullyQualifiedName: JsonField<String> = JsonMissing.of()
        private var timelineIFrame: JsonField<TimelineEventIFrame> = JsonMissing.of()
        private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
        private var utk: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(appEventOccurrence: AppEventOccurrence) = apply {
            id = appEventOccurrence.id
            eventTypeName = appEventOccurrence.eventTypeName
            properties = appEventOccurrence.properties
            domain = appEventOccurrence.domain
            email = appEventOccurrence.email
            extraData = appEventOccurrence.extraData
            objectId = appEventOccurrence.objectId
            objectTypeFullyQualifiedName = appEventOccurrence.objectTypeFullyQualifiedName
            timelineIFrame = appEventOccurrence.timelineIFrame
            timestamp = appEventOccurrence.timestamp
            utk = appEventOccurrence.utk
            additionalProperties = appEventOccurrence.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun eventTypeName(eventTypeName: String) = eventTypeName(JsonField.of(eventTypeName))

        /**
         * Sets [Builder.eventTypeName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventTypeName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventTypeName(eventTypeName: JsonField<String>) = apply {
            this.eventTypeName = eventTypeName
        }

        fun properties(properties: Properties) = properties(JsonField.of(properties))

        /**
         * Sets [Builder.properties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.properties] with a well-typed [Properties] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun properties(properties: JsonField<Properties>) = apply { this.properties = properties }

        fun domain(domain: String) = domain(JsonField.of(domain))

        /**
         * Sets [Builder.domain] to an arbitrary JSON value.
         *
         * You should usually call [Builder.domain] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun domain(domain: JsonField<String>) = apply { this.domain = domain }

        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        fun extraData(extraData: JsonValue) = apply { this.extraData = extraData }

        fun objectId(objectId: String) = objectId(JsonField.of(objectId))

        /**
         * Sets [Builder.objectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun objectId(objectId: JsonField<String>) = apply { this.objectId = objectId }

        fun objectTypeFullyQualifiedName(objectTypeFullyQualifiedName: String) =
            objectTypeFullyQualifiedName(JsonField.of(objectTypeFullyQualifiedName))

        /**
         * Sets [Builder.objectTypeFullyQualifiedName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectTypeFullyQualifiedName] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun objectTypeFullyQualifiedName(objectTypeFullyQualifiedName: JsonField<String>) = apply {
            this.objectTypeFullyQualifiedName = objectTypeFullyQualifiedName
        }

        fun timelineIFrame(timelineIFrame: TimelineEventIFrame) =
            timelineIFrame(JsonField.of(timelineIFrame))

        /**
         * Sets [Builder.timelineIFrame] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timelineIFrame] with a well-typed [TimelineEventIFrame]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun timelineIFrame(timelineIFrame: JsonField<TimelineEventIFrame>) = apply {
            this.timelineIFrame = timelineIFrame
        }

        fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

        /**
         * Sets [Builder.timestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply { this.timestamp = timestamp }

        fun utk(utk: String) = utk(JsonField.of(utk))

        /**
         * Sets [Builder.utk] to an arbitrary JSON value.
         *
         * You should usually call [Builder.utk] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun utk(utk: JsonField<String>) = apply { this.utk = utk }

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
         * Returns an immutable instance of [AppEventOccurrence].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .eventTypeName()
         * .properties()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AppEventOccurrence =
            AppEventOccurrence(
                checkRequired("id", id),
                checkRequired("eventTypeName", eventTypeName),
                checkRequired("properties", properties),
                domain,
                email,
                extraData,
                objectId,
                objectTypeFullyQualifiedName,
                timelineIFrame,
                timestamp,
                utk,
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
    fun validate(): AppEventOccurrence = apply {
        if (validated) {
            return@apply
        }

        id()
        eventTypeName()
        properties().validate()
        domain()
        email()
        objectId()
        objectTypeFullyQualifiedName()
        timelineIFrame().ifPresent { it.validate() }
        timestamp()
        utk()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (eventTypeName.asKnown().isPresent) 1 else 0) +
            (properties.asKnown().getOrNull()?.validity() ?: 0) +
            (if (domain.asKnown().isPresent) 1 else 0) +
            (if (email.asKnown().isPresent) 1 else 0) +
            (if (objectId.asKnown().isPresent) 1 else 0) +
            (if (objectTypeFullyQualifiedName.asKnown().isPresent) 1 else 0) +
            (timelineIFrame.asKnown().getOrNull()?.validity() ?: 0) +
            (if (timestamp.asKnown().isPresent) 1 else 0) +
            (if (utk.asKnown().isPresent) 1 else 0)

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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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
            } catch (e: HubSpotInvalidDataException) {
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

        return other is AppEventOccurrence &&
            id == other.id &&
            eventTypeName == other.eventTypeName &&
            properties == other.properties &&
            domain == other.domain &&
            email == other.email &&
            extraData == other.extraData &&
            objectId == other.objectId &&
            objectTypeFullyQualifiedName == other.objectTypeFullyQualifiedName &&
            timelineIFrame == other.timelineIFrame &&
            timestamp == other.timestamp &&
            utk == other.utk &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            eventTypeName,
            properties,
            domain,
            email,
            extraData,
            objectId,
            objectTypeFullyQualifiedName,
            timelineIFrame,
            timestamp,
            utk,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AppEventOccurrence{id=$id, eventTypeName=$eventTypeName, properties=$properties, domain=$domain, email=$email, extraData=$extraData, objectId=$objectId, objectTypeFullyQualifiedName=$objectTypeFullyQualifiedName, timelineIFrame=$timelineIFrame, timestamp=$timestamp, utk=$utk, additionalProperties=$additionalProperties}"
}
