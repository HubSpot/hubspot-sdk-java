// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.scheduler.meetings

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

class ExternalCalenderMeetingEventResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val lastUpdatedAt: JsonField<OffsetDateTime>,
    private val properties: JsonField<ExternalCalendarMeetingEventResponseProperties>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("lastUpdatedAt")
        @ExcludeMissing
        lastUpdatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("properties")
        @ExcludeMissing
        properties: JsonField<ExternalCalendarMeetingEventResponseProperties> = JsonMissing.of(),
    ) : this(id, createdAt, lastUpdatedAt, properties, mutableMapOf())

    /**
     * The unique identifier for the meeting event.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The date and time when the meeting event was initially created, in ISO 8601 format.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * The date and time when the meeting event was last updated, in ISO 8601 format.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lastUpdatedAt(): OffsetDateTime = lastUpdatedAt.getRequired("lastUpdatedAt")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun properties(): ExternalCalendarMeetingEventResponseProperties =
        properties.getRequired("properties")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [lastUpdatedAt].
     *
     * Unlike [lastUpdatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastUpdatedAt")
    @ExcludeMissing
    fun _lastUpdatedAt(): JsonField<OffsetDateTime> = lastUpdatedAt

    /**
     * Returns the raw JSON value of [properties].
     *
     * Unlike [properties], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("properties")
    @ExcludeMissing
    fun _properties(): JsonField<ExternalCalendarMeetingEventResponseProperties> = properties

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
         * [ExternalCalenderMeetingEventResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .lastUpdatedAt()
         * .properties()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalCalenderMeetingEventResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var lastUpdatedAt: JsonField<OffsetDateTime>? = null
        private var properties: JsonField<ExternalCalendarMeetingEventResponseProperties>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            externalCalenderMeetingEventResponse: ExternalCalenderMeetingEventResponse
        ) = apply {
            id = externalCalenderMeetingEventResponse.id
            createdAt = externalCalenderMeetingEventResponse.createdAt
            lastUpdatedAt = externalCalenderMeetingEventResponse.lastUpdatedAt
            properties = externalCalenderMeetingEventResponse.properties
            additionalProperties =
                externalCalenderMeetingEventResponse.additionalProperties.toMutableMap()
        }

        /** The unique identifier for the meeting event. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The date and time when the meeting event was initially created, in ISO 8601 format. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The date and time when the meeting event was last updated, in ISO 8601 format. */
        fun lastUpdatedAt(lastUpdatedAt: OffsetDateTime) =
            lastUpdatedAt(JsonField.of(lastUpdatedAt))

        /**
         * Sets [Builder.lastUpdatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastUpdatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastUpdatedAt(lastUpdatedAt: JsonField<OffsetDateTime>) = apply {
            this.lastUpdatedAt = lastUpdatedAt
        }

        fun properties(properties: ExternalCalendarMeetingEventResponseProperties) =
            properties(JsonField.of(properties))

        /**
         * Sets [Builder.properties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.properties] with a well-typed
         * [ExternalCalendarMeetingEventResponseProperties] value instead. This method is primarily
         * for setting the field to an undocumented or not yet supported value.
         */
        fun properties(properties: JsonField<ExternalCalendarMeetingEventResponseProperties>) =
            apply {
                this.properties = properties
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
         * Returns an immutable instance of [ExternalCalenderMeetingEventResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .lastUpdatedAt()
         * .properties()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalCalenderMeetingEventResponse =
            ExternalCalenderMeetingEventResponse(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("lastUpdatedAt", lastUpdatedAt),
                checkRequired("properties", properties),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalCalenderMeetingEventResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        lastUpdatedAt()
        properties().validate()
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
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (lastUpdatedAt.asKnown().isPresent) 1 else 0) +
            (properties.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalCalenderMeetingEventResponse &&
            id == other.id &&
            createdAt == other.createdAt &&
            lastUpdatedAt == other.lastUpdatedAt &&
            properties == other.properties &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, createdAt, lastUpdatedAt, properties, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalCalenderMeetingEventResponse{id=$id, createdAt=$createdAt, lastUpdatedAt=$lastUpdatedAt, properties=$properties, additionalProperties=$additionalProperties}"
}
