// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.auditlogs

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.Enum
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class AuditLogListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val event: JsonField<Event>,
    private val fullName: JsonField<String>,
    private val objectId: JsonField<String>,
    private val objectName: JsonField<String>,
    private val objectType: JsonField<ObjectType>,
    private val timestamp: JsonField<OffsetDateTime>,
    private val userId: JsonField<String>,
    private val meta: JsonValue,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("event") @ExcludeMissing event: JsonField<Event> = JsonMissing.of(),
        @JsonProperty("fullName") @ExcludeMissing fullName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("objectId") @ExcludeMissing objectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("objectName")
        @ExcludeMissing
        objectName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("objectType")
        @ExcludeMissing
        objectType: JsonField<ObjectType> = JsonMissing.of(),
        @JsonProperty("timestamp")
        @ExcludeMissing
        timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("userId") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("meta") @ExcludeMissing meta: JsonValue = JsonMissing.of(),
    ) : this(
        event,
        fullName,
        objectId,
        objectName,
        objectType,
        timestamp,
        userId,
        meta,
        mutableMapOf(),
    )

    /**
     * The type of event that took place (CREATED, UPDATED, PUBLISHED, DELETED, UNPUBLISHED).
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun event(): Event = event.getRequired("event")

    /**
     * The name of the user who caused the event.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fullName(): String = fullName.getRequired("fullName")

    /**
     * The ID of the object.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectId(): String = objectId.getRequired("objectId")

    /**
     * The internal name of the object in HubSpot.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectName(): String = objectName.getRequired("objectName")

    /**
     * The type of the object (BLOG, LANDING_PAGE, DOMAIN, HUBDB_TABLE etc.)
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectType(): ObjectType = objectType.getRequired("objectType")

    /**
     * The timestamp at which the event occurred.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

    /**
     * The ID of the user who caused the event.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userId(): String = userId.getRequired("userId")

    @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonValue = meta

    /**
     * Returns the raw JSON value of [event].
     *
     * Unlike [event], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event") @ExcludeMissing fun _event(): JsonField<Event> = event

    /**
     * Returns the raw JSON value of [fullName].
     *
     * Unlike [fullName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fullName") @ExcludeMissing fun _fullName(): JsonField<String> = fullName

    /**
     * Returns the raw JSON value of [objectId].
     *
     * Unlike [objectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectId") @ExcludeMissing fun _objectId(): JsonField<String> = objectId

    /**
     * Returns the raw JSON value of [objectName].
     *
     * Unlike [objectName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectName") @ExcludeMissing fun _objectName(): JsonField<String> = objectName

    /**
     * Returns the raw JSON value of [objectType].
     *
     * Unlike [objectType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectType")
    @ExcludeMissing
    fun _objectType(): JsonField<ObjectType> = objectType

    /**
     * Returns the raw JSON value of [timestamp].
     *
     * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timestamp")
    @ExcludeMissing
    fun _timestamp(): JsonField<OffsetDateTime> = timestamp

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("userId") @ExcludeMissing fun _userId(): JsonField<String> = userId

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
         * Returns a mutable builder for constructing an instance of [AuditLogListResponse].
         *
         * The following fields are required:
         * ```java
         * .event()
         * .fullName()
         * .objectId()
         * .objectName()
         * .objectType()
         * .timestamp()
         * .userId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AuditLogListResponse]. */
    class Builder internal constructor() {

        private var event: JsonField<Event>? = null
        private var fullName: JsonField<String>? = null
        private var objectId: JsonField<String>? = null
        private var objectName: JsonField<String>? = null
        private var objectType: JsonField<ObjectType>? = null
        private var timestamp: JsonField<OffsetDateTime>? = null
        private var userId: JsonField<String>? = null
        private var meta: JsonValue = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(auditLogListResponse: AuditLogListResponse) = apply {
            event = auditLogListResponse.event
            fullName = auditLogListResponse.fullName
            objectId = auditLogListResponse.objectId
            objectName = auditLogListResponse.objectName
            objectType = auditLogListResponse.objectType
            timestamp = auditLogListResponse.timestamp
            userId = auditLogListResponse.userId
            meta = auditLogListResponse.meta
            additionalProperties = auditLogListResponse.additionalProperties.toMutableMap()
        }

        /**
         * The type of event that took place (CREATED, UPDATED, PUBLISHED, DELETED, UNPUBLISHED).
         */
        fun event(event: Event) = event(JsonField.of(event))

        /**
         * Sets [Builder.event] to an arbitrary JSON value.
         *
         * You should usually call [Builder.event] with a well-typed [Event] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun event(event: JsonField<Event>) = apply { this.event = event }

        /** The name of the user who caused the event. */
        fun fullName(fullName: String) = fullName(JsonField.of(fullName))

        /**
         * Sets [Builder.fullName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fullName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fullName(fullName: JsonField<String>) = apply { this.fullName = fullName }

        /** The ID of the object. */
        fun objectId(objectId: String) = objectId(JsonField.of(objectId))

        /**
         * Sets [Builder.objectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun objectId(objectId: JsonField<String>) = apply { this.objectId = objectId }

        /** The internal name of the object in HubSpot. */
        fun objectName(objectName: String) = objectName(JsonField.of(objectName))

        /**
         * Sets [Builder.objectName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun objectName(objectName: JsonField<String>) = apply { this.objectName = objectName }

        /** The type of the object (BLOG, LANDING_PAGE, DOMAIN, HUBDB_TABLE etc.) */
        fun objectType(objectType: ObjectType) = objectType(JsonField.of(objectType))

        /**
         * Sets [Builder.objectType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectType] with a well-typed [ObjectType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun objectType(objectType: JsonField<ObjectType>) = apply { this.objectType = objectType }

        /** The timestamp at which the event occurred. */
        fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

        /**
         * Sets [Builder.timestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply { this.timestamp = timestamp }

        /** The ID of the user who caused the event. */
        fun userId(userId: String) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

        fun meta(meta: JsonValue) = apply { this.meta = meta }

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
         * Returns an immutable instance of [AuditLogListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .event()
         * .fullName()
         * .objectId()
         * .objectName()
         * .objectType()
         * .timestamp()
         * .userId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AuditLogListResponse =
            AuditLogListResponse(
                checkRequired("event", event),
                checkRequired("fullName", fullName),
                checkRequired("objectId", objectId),
                checkRequired("objectName", objectName),
                checkRequired("objectType", objectType),
                checkRequired("timestamp", timestamp),
                checkRequired("userId", userId),
                meta,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AuditLogListResponse = apply {
        if (validated) {
            return@apply
        }

        event().validate()
        fullName()
        objectId()
        objectName()
        objectType().validate()
        timestamp()
        userId()
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
        (event.asKnown().getOrNull()?.validity() ?: 0) +
            (if (fullName.asKnown().isPresent) 1 else 0) +
            (if (objectId.asKnown().isPresent) 1 else 0) +
            (if (objectName.asKnown().isPresent) 1 else 0) +
            (objectType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (timestamp.asKnown().isPresent) 1 else 0) +
            (if (userId.asKnown().isPresent) 1 else 0)

    /** The type of event that took place (CREATED, UPDATED, PUBLISHED, DELETED, UNPUBLISHED). */
    class Event @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val CREATED = of("CREATED")

            @JvmField val UPDATED = of("UPDATED")

            @JvmField val PUBLISHED = of("PUBLISHED")

            @JvmField val DELETED = of("DELETED")

            @JvmField val UNPUBLISHED = of("UNPUBLISHED")

            @JvmField val RESTORE = of("RESTORE")

            @JvmStatic fun of(value: String) = Event(JsonField.of(value))
        }

        /** An enum containing [Event]'s known values. */
        enum class Known {
            CREATED,
            UPDATED,
            PUBLISHED,
            DELETED,
            UNPUBLISHED,
            RESTORE,
        }

        /**
         * An enum containing [Event]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Event] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CREATED,
            UPDATED,
            PUBLISHED,
            DELETED,
            UNPUBLISHED,
            RESTORE,
            /** An enum member indicating that [Event] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                CREATED -> Value.CREATED
                UPDATED -> Value.UPDATED
                PUBLISHED -> Value.PUBLISHED
                DELETED -> Value.DELETED
                UNPUBLISHED -> Value.UNPUBLISHED
                RESTORE -> Value.RESTORE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HubspotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                CREATED -> Known.CREATED
                UPDATED -> Known.UPDATED
                PUBLISHED -> Known.PUBLISHED
                DELETED -> Known.DELETED
                UNPUBLISHED -> Known.UNPUBLISHED
                RESTORE -> Known.RESTORE
                else -> throw HubspotInvalidDataException("Unknown Event: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HubspotInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { HubspotInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): Event = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Event && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The type of the object (BLOG, LANDING_PAGE, DOMAIN, HUBDB_TABLE etc.) */
    class ObjectType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val BLOG = of("BLOG")

            @JvmField val BLOG_POST = of("BLOG_POST")

            @JvmField val LANDING_PAGE = of("LANDING_PAGE")

            @JvmField val WEBSITE_PAGE = of("WEBSITE_PAGE")

            @JvmField val TEMPLATE = of("TEMPLATE")

            @JvmField val MODULE = of("MODULE")

            @JvmField val GLOBAL_MODULE = of("GLOBAL_MODULE")

            @JvmField val SERVERLESS_FUNCTION = of("SERVERLESS_FUNCTION")

            @JvmField val DOMAIN = of("DOMAIN")

            @JvmField val URL_MAPPING = of("URL_MAPPING")

            @JvmField val EMAIL = of("EMAIL")

            @JvmField val CONTENT_SETTINGS = of("CONTENT_SETTINGS")

            @JvmField val HUBDB_TABLE = of("HUBDB_TABLE")

            @JvmField val KNOWLEDGE_BASE_ARTICLE = of("KNOWLEDGE_BASE_ARTICLE")

            @JvmField val KNOWLEDGE_BASE = of("KNOWLEDGE_BASE")

            @JvmField val THEME = of("THEME")

            @JvmField val CSS = of("CSS")

            @JvmField val JS = of("JS")

            @JvmField val CTA = of("CTA")

            @JvmField val FILE = of("FILE")

            @JvmStatic fun of(value: String) = ObjectType(JsonField.of(value))
        }

        /** An enum containing [ObjectType]'s known values. */
        enum class Known {
            BLOG,
            BLOG_POST,
            LANDING_PAGE,
            WEBSITE_PAGE,
            TEMPLATE,
            MODULE,
            GLOBAL_MODULE,
            SERVERLESS_FUNCTION,
            DOMAIN,
            URL_MAPPING,
            EMAIL,
            CONTENT_SETTINGS,
            HUBDB_TABLE,
            KNOWLEDGE_BASE_ARTICLE,
            KNOWLEDGE_BASE,
            THEME,
            CSS,
            JS,
            CTA,
            FILE,
        }

        /**
         * An enum containing [ObjectType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ObjectType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BLOG,
            BLOG_POST,
            LANDING_PAGE,
            WEBSITE_PAGE,
            TEMPLATE,
            MODULE,
            GLOBAL_MODULE,
            SERVERLESS_FUNCTION,
            DOMAIN,
            URL_MAPPING,
            EMAIL,
            CONTENT_SETTINGS,
            HUBDB_TABLE,
            KNOWLEDGE_BASE_ARTICLE,
            KNOWLEDGE_BASE,
            THEME,
            CSS,
            JS,
            CTA,
            FILE,
            /**
             * An enum member indicating that [ObjectType] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                BLOG -> Value.BLOG
                BLOG_POST -> Value.BLOG_POST
                LANDING_PAGE -> Value.LANDING_PAGE
                WEBSITE_PAGE -> Value.WEBSITE_PAGE
                TEMPLATE -> Value.TEMPLATE
                MODULE -> Value.MODULE
                GLOBAL_MODULE -> Value.GLOBAL_MODULE
                SERVERLESS_FUNCTION -> Value.SERVERLESS_FUNCTION
                DOMAIN -> Value.DOMAIN
                URL_MAPPING -> Value.URL_MAPPING
                EMAIL -> Value.EMAIL
                CONTENT_SETTINGS -> Value.CONTENT_SETTINGS
                HUBDB_TABLE -> Value.HUBDB_TABLE
                KNOWLEDGE_BASE_ARTICLE -> Value.KNOWLEDGE_BASE_ARTICLE
                KNOWLEDGE_BASE -> Value.KNOWLEDGE_BASE
                THEME -> Value.THEME
                CSS -> Value.CSS
                JS -> Value.JS
                CTA -> Value.CTA
                FILE -> Value.FILE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HubspotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                BLOG -> Known.BLOG
                BLOG_POST -> Known.BLOG_POST
                LANDING_PAGE -> Known.LANDING_PAGE
                WEBSITE_PAGE -> Known.WEBSITE_PAGE
                TEMPLATE -> Known.TEMPLATE
                MODULE -> Known.MODULE
                GLOBAL_MODULE -> Known.GLOBAL_MODULE
                SERVERLESS_FUNCTION -> Known.SERVERLESS_FUNCTION
                DOMAIN -> Known.DOMAIN
                URL_MAPPING -> Known.URL_MAPPING
                EMAIL -> Known.EMAIL
                CONTENT_SETTINGS -> Known.CONTENT_SETTINGS
                HUBDB_TABLE -> Known.HUBDB_TABLE
                KNOWLEDGE_BASE_ARTICLE -> Known.KNOWLEDGE_BASE_ARTICLE
                KNOWLEDGE_BASE -> Known.KNOWLEDGE_BASE
                THEME -> Known.THEME
                CSS -> Known.CSS
                JS -> Known.JS
                CTA -> Known.CTA
                FILE -> Known.FILE
                else -> throw HubspotInvalidDataException("Unknown ObjectType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HubspotInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { HubspotInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): ObjectType = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ObjectType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuditLogListResponse &&
            event == other.event &&
            fullName == other.fullName &&
            objectId == other.objectId &&
            objectName == other.objectName &&
            objectType == other.objectType &&
            timestamp == other.timestamp &&
            userId == other.userId &&
            meta == other.meta &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            event,
            fullName,
            objectId,
            objectName,
            objectType,
            timestamp,
            userId,
            meta,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AuditLogListResponse{event=$event, fullName=$fullName, objectId=$objectId, objectName=$objectName, objectType=$objectType, timestamp=$timestamp, userId=$userId, meta=$meta, additionalProperties=$additionalProperties}"
}
