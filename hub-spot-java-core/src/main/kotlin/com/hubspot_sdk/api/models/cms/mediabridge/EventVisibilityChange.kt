// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

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
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class EventVisibilityChange
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val eventType: JsonField<EventType>,
    private val updatedAt: JsonField<Long>,
    private val showInReporting: JsonField<Boolean>,
    private val showInTimeline: JsonField<Boolean>,
    private val showInWorkflows: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("eventType")
        @ExcludeMissing
        eventType: JsonField<EventType> = JsonMissing.of(),
        @JsonProperty("updatedAt") @ExcludeMissing updatedAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("showInReporting")
        @ExcludeMissing
        showInReporting: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("showInTimeline")
        @ExcludeMissing
        showInTimeline: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("showInWorkflows")
        @ExcludeMissing
        showInWorkflows: JsonField<Boolean> = JsonMissing.of(),
    ) : this(eventType, updatedAt, showInReporting, showInTimeline, showInWorkflows, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventType(): EventType = eventType.getRequired("eventType")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): Long = updatedAt.getRequired("updatedAt")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun showInReporting(): Optional<Boolean> = showInReporting.getOptional("showInReporting")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun showInTimeline(): Optional<Boolean> = showInTimeline.getOptional("showInTimeline")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun showInWorkflows(): Optional<Boolean> = showInWorkflows.getOptional("showInWorkflows")

    /**
     * Returns the raw JSON value of [eventType].
     *
     * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventType") @ExcludeMissing fun _eventType(): JsonField<EventType> = eventType

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt") @ExcludeMissing fun _updatedAt(): JsonField<Long> = updatedAt

    /**
     * Returns the raw JSON value of [showInReporting].
     *
     * Unlike [showInReporting], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("showInReporting")
    @ExcludeMissing
    fun _showInReporting(): JsonField<Boolean> = showInReporting

    /**
     * Returns the raw JSON value of [showInTimeline].
     *
     * Unlike [showInTimeline], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("showInTimeline")
    @ExcludeMissing
    fun _showInTimeline(): JsonField<Boolean> = showInTimeline

    /**
     * Returns the raw JSON value of [showInWorkflows].
     *
     * Unlike [showInWorkflows], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("showInWorkflows")
    @ExcludeMissing
    fun _showInWorkflows(): JsonField<Boolean> = showInWorkflows

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
         * Returns a mutable builder for constructing an instance of [EventVisibilityChange].
         *
         * The following fields are required:
         * ```java
         * .eventType()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EventVisibilityChange]. */
    class Builder internal constructor() {

        private var eventType: JsonField<EventType>? = null
        private var updatedAt: JsonField<Long>? = null
        private var showInReporting: JsonField<Boolean> = JsonMissing.of()
        private var showInTimeline: JsonField<Boolean> = JsonMissing.of()
        private var showInWorkflows: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(eventVisibilityChange: EventVisibilityChange) = apply {
            eventType = eventVisibilityChange.eventType
            updatedAt = eventVisibilityChange.updatedAt
            showInReporting = eventVisibilityChange.showInReporting
            showInTimeline = eventVisibilityChange.showInTimeline
            showInWorkflows = eventVisibilityChange.showInWorkflows
            additionalProperties = eventVisibilityChange.additionalProperties.toMutableMap()
        }

        fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

        /**
         * Sets [Builder.eventType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventType] with a well-typed [EventType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventType(eventType: JsonField<EventType>) = apply { this.eventType = eventType }

        fun updatedAt(updatedAt: Long) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun updatedAt(updatedAt: JsonField<Long>) = apply { this.updatedAt = updatedAt }

        fun showInReporting(showInReporting: Boolean) =
            showInReporting(JsonField.of(showInReporting))

        /**
         * Sets [Builder.showInReporting] to an arbitrary JSON value.
         *
         * You should usually call [Builder.showInReporting] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun showInReporting(showInReporting: JsonField<Boolean>) = apply {
            this.showInReporting = showInReporting
        }

        fun showInTimeline(showInTimeline: Boolean) = showInTimeline(JsonField.of(showInTimeline))

        /**
         * Sets [Builder.showInTimeline] to an arbitrary JSON value.
         *
         * You should usually call [Builder.showInTimeline] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun showInTimeline(showInTimeline: JsonField<Boolean>) = apply {
            this.showInTimeline = showInTimeline
        }

        fun showInWorkflows(showInWorkflows: Boolean) =
            showInWorkflows(JsonField.of(showInWorkflows))

        /**
         * Sets [Builder.showInWorkflows] to an arbitrary JSON value.
         *
         * You should usually call [Builder.showInWorkflows] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun showInWorkflows(showInWorkflows: JsonField<Boolean>) = apply {
            this.showInWorkflows = showInWorkflows
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
         * Returns an immutable instance of [EventVisibilityChange].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .eventType()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EventVisibilityChange =
            EventVisibilityChange(
                checkRequired("eventType", eventType),
                checkRequired("updatedAt", updatedAt),
                showInReporting,
                showInTimeline,
                showInWorkflows,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): EventVisibilityChange = apply {
        if (validated) {
            return@apply
        }

        eventType().validate()
        updatedAt()
        showInReporting()
        showInTimeline()
        showInWorkflows()
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
        (eventType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (showInReporting.asKnown().isPresent) 1 else 0) +
            (if (showInTimeline.asKnown().isPresent) 1 else 0) +
            (if (showInWorkflows.asKnown().isPresent) 1 else 0)

    class EventType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ALL = of("ALL")

            @JvmField val MEDIA_PLAYS = of("MEDIA_PLAYS")

            @JvmField val MEDIA_PLAYS_PERCENT = of("MEDIA_PLAYS_PERCENT")

            @JvmField val ATTENTION_SPAN = of("ATTENTION_SPAN")

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        /** An enum containing [EventType]'s known values. */
        enum class Known {
            ALL,
            MEDIA_PLAYS,
            MEDIA_PLAYS_PERCENT,
            ATTENTION_SPAN,
        }

        /**
         * An enum containing [EventType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EventType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ALL,
            MEDIA_PLAYS,
            MEDIA_PLAYS_PERCENT,
            ATTENTION_SPAN,
            /**
             * An enum member indicating that [EventType] was instantiated with an unknown value.
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
                ALL -> Value.ALL
                MEDIA_PLAYS -> Value.MEDIA_PLAYS
                MEDIA_PLAYS_PERCENT -> Value.MEDIA_PLAYS_PERCENT
                ATTENTION_SPAN -> Value.ATTENTION_SPAN
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
                ALL -> Known.ALL
                MEDIA_PLAYS -> Known.MEDIA_PLAYS
                MEDIA_PLAYS_PERCENT -> Known.MEDIA_PLAYS_PERCENT
                ATTENTION_SPAN -> Known.ATTENTION_SPAN
                else -> throw HubSpotInvalidDataException("Unknown EventType: $value")
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

        fun validate(): EventType = apply {
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

            return other is EventType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EventVisibilityChange &&
            eventType == other.eventType &&
            updatedAt == other.updatedAt &&
            showInReporting == other.showInReporting &&
            showInTimeline == other.showInTimeline &&
            showInWorkflows == other.showInWorkflows &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            eventType,
            updatedAt,
            showInReporting,
            showInTimeline,
            showInWorkflows,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EventVisibilityChange{eventType=$eventType, updatedAt=$updatedAt, showInReporting=$showInReporting, showInTimeline=$showInTimeline, showInWorkflows=$showInWorkflows, additionalProperties=$additionalProperties}"
}
