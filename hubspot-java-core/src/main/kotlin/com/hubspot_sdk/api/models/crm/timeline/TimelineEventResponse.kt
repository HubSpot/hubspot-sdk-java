// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.timeline

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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** The current state of the timeline event. */
class TimelineEventResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val eventTemplateId: JsonField<String>,
    private val objectType: JsonField<String>,
    private val tokens: JsonField<Tokens>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val domain: JsonField<String>,
    private val email: JsonField<String>,
    private val extraData: JsonValue,
    private val objectId: JsonField<String>,
    private val timelineIFrame: JsonField<TimelineEventIFrame>,
    private val timestamp: JsonField<OffsetDateTime>,
    private val utk: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("eventTemplateId")
        @ExcludeMissing
        eventTemplateId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("objectType")
        @ExcludeMissing
        objectType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tokens") @ExcludeMissing tokens: JsonField<Tokens> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("domain") @ExcludeMissing domain: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("extraData") @ExcludeMissing extraData: JsonValue = JsonMissing.of(),
        @JsonProperty("objectId") @ExcludeMissing objectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timelineIFrame")
        @ExcludeMissing
        timelineIFrame: JsonField<TimelineEventIFrame> = JsonMissing.of(),
        @JsonProperty("timestamp")
        @ExcludeMissing
        timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("utk") @ExcludeMissing utk: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        eventTemplateId,
        objectType,
        tokens,
        createdAt,
        domain,
        email,
        extraData,
        objectId,
        timelineIFrame,
        timestamp,
        utk,
        mutableMapOf(),
    )

    /**
     * Identifier for the event. This should be unique to the app and event template. If you use the
     * same ID for different CRM objects, the last to be processed will win and the first will not
     * have a record. You can also use `{{uuid}}` anywhere in the ID to generate a unique string,
     * guaranteeing uniqueness.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The event template ID.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventTemplateId(): String = eventTemplateId.getRequired("eventTemplateId")

    /**
     * The ObjectType associated with the EventTemplate.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectType(): String = objectType.getRequired("objectType")

    /**
     * A collection of token keys and values associated with the template tokens.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tokens(): Tokens = tokens.getRequired("tokens")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

    /**
     * The event domain (often paired with utk).
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun domain(): Optional<String> = domain.getOptional("domain")

    /**
     * The email address used for contact-specific events. This can be used to identify existing
     * contacts, create new ones, or change the email for an existing contact (if paired with the
     * `objectId`).
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun email(): Optional<String> = email.getOptional("email")

    /** Additional event-specific data that can be interpreted by the template's markdown. */
    @JsonProperty("extraData") @ExcludeMissing fun _extraData(): JsonValue = extraData

    /**
     * The CRM object identifier. This is required for every event other than contacts (where utk or
     * email can be used).
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun objectId(): Optional<String> = objectId.getOptional("objectId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timelineIFrame(): Optional<TimelineEventIFrame> =
        timelineIFrame.getOptional("timelineIFrame")

    /**
     * The time the event occurred. If not passed in, the curren time will be assumed. This is used
     * to determine where an event is shown on a CRM object's timeline.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timestamp(): Optional<OffsetDateTime> = timestamp.getOptional("timestamp")

    /**
     * Use the `utk` parameter to associate an event with a contact by `usertoken`. This is
     * recommended if you don't know a user's email, but have an identifying user token in your
     * cookie.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
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
     * Returns the raw JSON value of [eventTemplateId].
     *
     * Unlike [eventTemplateId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventTemplateId")
    @ExcludeMissing
    fun _eventTemplateId(): JsonField<String> = eventTemplateId

    /**
     * Returns the raw JSON value of [objectType].
     *
     * Unlike [objectType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectType") @ExcludeMissing fun _objectType(): JsonField<String> = objectType

    /**
     * Returns the raw JSON value of [tokens].
     *
     * Unlike [tokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tokens") @ExcludeMissing fun _tokens(): JsonField<Tokens> = tokens

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

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
         * Returns a mutable builder for constructing an instance of [TimelineEventResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .eventTemplateId()
         * .objectType()
         * .tokens()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TimelineEventResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var eventTemplateId: JsonField<String>? = null
        private var objectType: JsonField<String>? = null
        private var tokens: JsonField<Tokens>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var domain: JsonField<String> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var extraData: JsonValue = JsonMissing.of()
        private var objectId: JsonField<String> = JsonMissing.of()
        private var timelineIFrame: JsonField<TimelineEventIFrame> = JsonMissing.of()
        private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
        private var utk: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(timelineEventResponse: TimelineEventResponse) = apply {
            id = timelineEventResponse.id
            eventTemplateId = timelineEventResponse.eventTemplateId
            objectType = timelineEventResponse.objectType
            tokens = timelineEventResponse.tokens
            createdAt = timelineEventResponse.createdAt
            domain = timelineEventResponse.domain
            email = timelineEventResponse.email
            extraData = timelineEventResponse.extraData
            objectId = timelineEventResponse.objectId
            timelineIFrame = timelineEventResponse.timelineIFrame
            timestamp = timelineEventResponse.timestamp
            utk = timelineEventResponse.utk
            additionalProperties = timelineEventResponse.additionalProperties.toMutableMap()
        }

        /**
         * Identifier for the event. This should be unique to the app and event template. If you use
         * the same ID for different CRM objects, the last to be processed will win and the first
         * will not have a record. You can also use `{{uuid}}` anywhere in the ID to generate a
         * unique string, guaranteeing uniqueness.
         */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The event template ID. */
        fun eventTemplateId(eventTemplateId: String) =
            eventTemplateId(JsonField.of(eventTemplateId))

        /**
         * Sets [Builder.eventTemplateId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventTemplateId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun eventTemplateId(eventTemplateId: JsonField<String>) = apply {
            this.eventTemplateId = eventTemplateId
        }

        /** The ObjectType associated with the EventTemplate. */
        fun objectType(objectType: String) = objectType(JsonField.of(objectType))

        /**
         * Sets [Builder.objectType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun objectType(objectType: JsonField<String>) = apply { this.objectType = objectType }

        /** A collection of token keys and values associated with the template tokens. */
        fun tokens(tokens: Tokens) = tokens(JsonField.of(tokens))

        /**
         * Sets [Builder.tokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokens] with a well-typed [Tokens] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tokens(tokens: JsonField<Tokens>) = apply { this.tokens = tokens }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The event domain (often paired with utk). */
        fun domain(domain: String) = domain(JsonField.of(domain))

        /**
         * Sets [Builder.domain] to an arbitrary JSON value.
         *
         * You should usually call [Builder.domain] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun domain(domain: JsonField<String>) = apply { this.domain = domain }

        /**
         * The email address used for contact-specific events. This can be used to identify existing
         * contacts, create new ones, or change the email for an existing contact (if paired with
         * the `objectId`).
         */
        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** Additional event-specific data that can be interpreted by the template's markdown. */
        fun extraData(extraData: JsonValue) = apply { this.extraData = extraData }

        /**
         * The CRM object identifier. This is required for every event other than contacts (where
         * utk or email can be used).
         */
        fun objectId(objectId: String) = objectId(JsonField.of(objectId))

        /**
         * Sets [Builder.objectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun objectId(objectId: JsonField<String>) = apply { this.objectId = objectId }

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

        /**
         * The time the event occurred. If not passed in, the curren time will be assumed. This is
         * used to determine where an event is shown on a CRM object's timeline.
         */
        fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

        /**
         * Sets [Builder.timestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply { this.timestamp = timestamp }

        /**
         * Use the `utk` parameter to associate an event with a contact by `usertoken`. This is
         * recommended if you don't know a user's email, but have an identifying user token in your
         * cookie.
         */
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
         * Returns an immutable instance of [TimelineEventResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .eventTemplateId()
         * .objectType()
         * .tokens()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TimelineEventResponse =
            TimelineEventResponse(
                checkRequired("id", id),
                checkRequired("eventTemplateId", eventTemplateId),
                checkRequired("objectType", objectType),
                checkRequired("tokens", tokens),
                createdAt,
                domain,
                email,
                extraData,
                objectId,
                timelineIFrame,
                timestamp,
                utk,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TimelineEventResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        eventTemplateId()
        objectType()
        tokens().validate()
        createdAt()
        domain()
        email()
        objectId()
        timelineIFrame().ifPresent { it.validate() }
        timestamp()
        utk()
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
            (if (eventTemplateId.asKnown().isPresent) 1 else 0) +
            (if (objectType.asKnown().isPresent) 1 else 0) +
            (tokens.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (domain.asKnown().isPresent) 1 else 0) +
            (if (email.asKnown().isPresent) 1 else 0) +
            (if (objectId.asKnown().isPresent) 1 else 0) +
            (timelineIFrame.asKnown().getOrNull()?.validity() ?: 0) +
            (if (timestamp.asKnown().isPresent) 1 else 0) +
            (if (utk.asKnown().isPresent) 1 else 0)

    /** A collection of token keys and values associated with the template tokens. */
    class Tokens
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

            /** Returns a mutable builder for constructing an instance of [Tokens]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Tokens]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(tokens: Tokens) = apply {
                additionalProperties = tokens.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Tokens].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Tokens = Tokens(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Tokens = apply {
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

            return other is Tokens && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Tokens{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TimelineEventResponse &&
            id == other.id &&
            eventTemplateId == other.eventTemplateId &&
            objectType == other.objectType &&
            tokens == other.tokens &&
            createdAt == other.createdAt &&
            domain == other.domain &&
            email == other.email &&
            extraData == other.extraData &&
            objectId == other.objectId &&
            timelineIFrame == other.timelineIFrame &&
            timestamp == other.timestamp &&
            utk == other.utk &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            eventTemplateId,
            objectType,
            tokens,
            createdAt,
            domain,
            email,
            extraData,
            objectId,
            timelineIFrame,
            timestamp,
            utk,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TimelineEventResponse{id=$id, eventTemplateId=$eventTemplateId, objectType=$objectType, tokens=$tokens, createdAt=$createdAt, domain=$domain, email=$email, extraData=$extraData, objectId=$objectId, timelineIFrame=$timelineIFrame, timestamp=$timestamp, utk=$utk, additionalProperties=$additionalProperties}"
}
