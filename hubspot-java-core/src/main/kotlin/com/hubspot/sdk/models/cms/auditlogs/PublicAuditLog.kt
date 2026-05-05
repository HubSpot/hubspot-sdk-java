// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.auditlogs

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.Enum
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class PublicAuditLog
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val event: JsonField<Event>,
    private val fullName: JsonField<String>,
    private val meta: JsonValue,
    private val objectId: JsonField<String>,
    private val objectName: JsonField<String>,
    private val objectType: JsonField<ObjectType>,
    private val timestamp: JsonField<OffsetDateTime>,
    private val userId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("event") @ExcludeMissing event: JsonField<Event> = JsonMissing.of(),
        @JsonProperty("fullName") @ExcludeMissing fullName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("meta") @ExcludeMissing meta: JsonValue = JsonMissing.of(),
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
    ) : this(
        event,
        fullName,
        meta,
        objectId,
        objectName,
        objectType,
        timestamp,
        userId,
        mutableMapOf(),
    )

    /**
     * The type of event that took place (CREATED, UPDATED, PUBLISHED, DELETED, UNPUBLISHED).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun event(): Event = event.getRequired("event")

    /**
     * The name of the user who caused the event.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fullName(): String = fullName.getRequired("fullName")

    /**
     * Supplementary metadata associated with the audit log entry. It provides additional context
     * about the audited event (ex: rows deleted/updated for a HubDB event, the specific fields that
     * were changed for a Content Settings event).
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = publicAuditLog.meta().convert(MyClass.class);
     * ```
     */
    @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonValue = meta

    /**
     * The ID of the object.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectId(): String = objectId.getRequired("objectId")

    /**
     * The internal name of the object in HubSpot.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectName(): String = objectName.getRequired("objectName")

    /**
     * The type of the object (BLOG, LANDING_PAGE, DOMAIN, HUBDB_TABLE etc.)
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectType(): ObjectType = objectType.getRequired("objectType")

    /**
     * The timestamp at which the event occurred.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

    /**
     * The ID of the user who caused the event.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userId(): String = userId.getRequired("userId")

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
         * Returns a mutable builder for constructing an instance of [PublicAuditLog].
         *
         * The following fields are required:
         * ```java
         * .event()
         * .fullName()
         * .meta()
         * .objectId()
         * .objectName()
         * .objectType()
         * .timestamp()
         * .userId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicAuditLog]. */
    class Builder internal constructor() {

        private var event: JsonField<Event>? = null
        private var fullName: JsonField<String>? = null
        private var meta: JsonValue? = null
        private var objectId: JsonField<String>? = null
        private var objectName: JsonField<String>? = null
        private var objectType: JsonField<ObjectType>? = null
        private var timestamp: JsonField<OffsetDateTime>? = null
        private var userId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicAuditLog: PublicAuditLog) = apply {
            event = publicAuditLog.event
            fullName = publicAuditLog.fullName
            meta = publicAuditLog.meta
            objectId = publicAuditLog.objectId
            objectName = publicAuditLog.objectName
            objectType = publicAuditLog.objectType
            timestamp = publicAuditLog.timestamp
            userId = publicAuditLog.userId
            additionalProperties = publicAuditLog.additionalProperties.toMutableMap()
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

        /**
         * Supplementary metadata associated with the audit log entry. It provides additional
         * context about the audited event (ex: rows deleted/updated for a HubDB event, the specific
         * fields that were changed for a Content Settings event).
         */
        fun meta(meta: JsonValue) = apply { this.meta = meta }

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
         * Returns an immutable instance of [PublicAuditLog].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .event()
         * .fullName()
         * .meta()
         * .objectId()
         * .objectName()
         * .objectType()
         * .timestamp()
         * .userId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicAuditLog =
            PublicAuditLog(
                checkRequired("event", event),
                checkRequired("fullName", fullName),
                checkRequired("meta", meta),
                checkRequired("objectId", objectId),
                checkRequired("objectName", objectName),
                checkRequired("objectType", objectType),
                checkRequired("timestamp", timestamp),
                checkRequired("userId", userId),
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
    fun validate(): PublicAuditLog = apply {
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

            @JvmField val DELETED = of("DELETED")

            @JvmField val PUBLISHED = of("PUBLISHED")

            @JvmField val RESTORE = of("RESTORE")

            @JvmField val UNPUBLISHED = of("UNPUBLISHED")

            @JvmField val UPDATED = of("UPDATED")

            @JvmStatic fun of(value: String) = Event(JsonField.of(value))
        }

        /** An enum containing [Event]'s known values. */
        enum class Known {
            CREATED,
            DELETED,
            PUBLISHED,
            RESTORE,
            UNPUBLISHED,
            UPDATED,
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
            DELETED,
            PUBLISHED,
            RESTORE,
            UNPUBLISHED,
            UPDATED,
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
                DELETED -> Value.DELETED
                PUBLISHED -> Value.PUBLISHED
                RESTORE -> Value.RESTORE
                UNPUBLISHED -> Value.UNPUBLISHED
                UPDATED -> Value.UPDATED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HubSpotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                CREATED -> Known.CREATED
                DELETED -> Known.DELETED
                PUBLISHED -> Known.PUBLISHED
                RESTORE -> Known.RESTORE
                UNPUBLISHED -> Known.UNPUBLISHED
                UPDATED -> Known.UPDATED
                else -> throw HubSpotInvalidDataException("Unknown Event: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HubSpotInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { HubSpotInvalidDataException("Value is not a String") }

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
            } catch (e: HubSpotInvalidDataException) {
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

            @JvmField val CASE_STUDY = of("CASE_STUDY")

            @JvmField val CONTENT_SETTINGS = of("CONTENT_SETTINGS")

            @JvmField val CSS = of("CSS")

            @JvmField val CTA = of("CTA")

            @JvmField val DOMAIN = of("DOMAIN")

            @JvmField val EMAIL = of("EMAIL")

            @JvmField val FILE = of("FILE")

            @JvmField val GLOBAL_MODULE = of("GLOBAL_MODULE")

            @JvmField val HUBDB_TABLE = of("HUBDB_TABLE")

            @JvmField val JS = of("JS")

            @JvmField val KNOWLEDGE_BASE = of("KNOWLEDGE_BASE")

            @JvmField val KNOWLEDGE_BASE_ARTICLE = of("KNOWLEDGE_BASE_ARTICLE")

            @JvmField val LANDING_PAGE = of("LANDING_PAGE")

            @JvmField val MODULE = of("MODULE")

            @JvmField val PODCAST = of("PODCAST")

            @JvmField val QUOTE = of("QUOTE")

            @JvmField val SERVERLESS_FUNCTION = of("SERVERLESS_FUNCTION")

            @JvmField val TEMPLATE = of("TEMPLATE")

            @JvmField val THEME = of("THEME")

            @JvmField val URL_MAPPING = of("URL_MAPPING")

            @JvmField val WEB_INTERACTIVE = of("WEB_INTERACTIVE")

            @JvmField val WEBSITE_PAGE = of("WEBSITE_PAGE")

            @JvmStatic fun of(value: String) = ObjectType(JsonField.of(value))
        }

        /** An enum containing [ObjectType]'s known values. */
        enum class Known {
            BLOG,
            BLOG_POST,
            CASE_STUDY,
            CONTENT_SETTINGS,
            CSS,
            CTA,
            DOMAIN,
            EMAIL,
            FILE,
            GLOBAL_MODULE,
            HUBDB_TABLE,
            JS,
            KNOWLEDGE_BASE,
            KNOWLEDGE_BASE_ARTICLE,
            LANDING_PAGE,
            MODULE,
            PODCAST,
            QUOTE,
            SERVERLESS_FUNCTION,
            TEMPLATE,
            THEME,
            URL_MAPPING,
            WEB_INTERACTIVE,
            WEBSITE_PAGE,
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
            CASE_STUDY,
            CONTENT_SETTINGS,
            CSS,
            CTA,
            DOMAIN,
            EMAIL,
            FILE,
            GLOBAL_MODULE,
            HUBDB_TABLE,
            JS,
            KNOWLEDGE_BASE,
            KNOWLEDGE_BASE_ARTICLE,
            LANDING_PAGE,
            MODULE,
            PODCAST,
            QUOTE,
            SERVERLESS_FUNCTION,
            TEMPLATE,
            THEME,
            URL_MAPPING,
            WEB_INTERACTIVE,
            WEBSITE_PAGE,
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
                CASE_STUDY -> Value.CASE_STUDY
                CONTENT_SETTINGS -> Value.CONTENT_SETTINGS
                CSS -> Value.CSS
                CTA -> Value.CTA
                DOMAIN -> Value.DOMAIN
                EMAIL -> Value.EMAIL
                FILE -> Value.FILE
                GLOBAL_MODULE -> Value.GLOBAL_MODULE
                HUBDB_TABLE -> Value.HUBDB_TABLE
                JS -> Value.JS
                KNOWLEDGE_BASE -> Value.KNOWLEDGE_BASE
                KNOWLEDGE_BASE_ARTICLE -> Value.KNOWLEDGE_BASE_ARTICLE
                LANDING_PAGE -> Value.LANDING_PAGE
                MODULE -> Value.MODULE
                PODCAST -> Value.PODCAST
                QUOTE -> Value.QUOTE
                SERVERLESS_FUNCTION -> Value.SERVERLESS_FUNCTION
                TEMPLATE -> Value.TEMPLATE
                THEME -> Value.THEME
                URL_MAPPING -> Value.URL_MAPPING
                WEB_INTERACTIVE -> Value.WEB_INTERACTIVE
                WEBSITE_PAGE -> Value.WEBSITE_PAGE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HubSpotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                BLOG -> Known.BLOG
                BLOG_POST -> Known.BLOG_POST
                CASE_STUDY -> Known.CASE_STUDY
                CONTENT_SETTINGS -> Known.CONTENT_SETTINGS
                CSS -> Known.CSS
                CTA -> Known.CTA
                DOMAIN -> Known.DOMAIN
                EMAIL -> Known.EMAIL
                FILE -> Known.FILE
                GLOBAL_MODULE -> Known.GLOBAL_MODULE
                HUBDB_TABLE -> Known.HUBDB_TABLE
                JS -> Known.JS
                KNOWLEDGE_BASE -> Known.KNOWLEDGE_BASE
                KNOWLEDGE_BASE_ARTICLE -> Known.KNOWLEDGE_BASE_ARTICLE
                LANDING_PAGE -> Known.LANDING_PAGE
                MODULE -> Known.MODULE
                PODCAST -> Known.PODCAST
                QUOTE -> Known.QUOTE
                SERVERLESS_FUNCTION -> Known.SERVERLESS_FUNCTION
                TEMPLATE -> Known.TEMPLATE
                THEME -> Known.THEME
                URL_MAPPING -> Known.URL_MAPPING
                WEB_INTERACTIVE -> Known.WEB_INTERACTIVE
                WEBSITE_PAGE -> Known.WEBSITE_PAGE
                else -> throw HubSpotInvalidDataException("Unknown ObjectType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HubSpotInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { HubSpotInvalidDataException("Value is not a String") }

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
            } catch (e: HubSpotInvalidDataException) {
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

        return other is PublicAuditLog &&
            event == other.event &&
            fullName == other.fullName &&
            meta == other.meta &&
            objectId == other.objectId &&
            objectName == other.objectName &&
            objectType == other.objectType &&
            timestamp == other.timestamp &&
            userId == other.userId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            event,
            fullName,
            meta,
            objectId,
            objectName,
            objectType,
            timestamp,
            userId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicAuditLog{event=$event, fullName=$fullName, meta=$meta, objectId=$objectId, objectName=$objectName, objectType=$objectType, timestamp=$timestamp, userId=$userId, additionalProperties=$additionalProperties}"
}
