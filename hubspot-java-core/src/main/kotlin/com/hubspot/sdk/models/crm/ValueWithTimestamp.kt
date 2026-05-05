// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm

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
import java.util.Optional

/** Property model that includes timestamp. */
class ValueWithTimestamp
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val sourceType: JsonField<String>,
    private val timestamp: JsonField<OffsetDateTime>,
    private val value: JsonField<String>,
    private val sourceId: JsonField<String>,
    private val sourceLabel: JsonField<String>,
    private val updatedByUserId: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("sourceType")
        @ExcludeMissing
        sourceType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timestamp")
        @ExcludeMissing
        timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceId") @ExcludeMissing sourceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceLabel")
        @ExcludeMissing
        sourceLabel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedByUserId")
        @ExcludeMissing
        updatedByUserId: JsonField<Int> = JsonMissing.of(),
    ) : this(sourceType, timestamp, value, sourceId, sourceLabel, updatedByUserId, mutableMapOf())

    /**
     * The property type.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sourceType(): String = sourceType.getRequired("sourceType")

    /**
     * The timestamp when the property was updated, in ISO 8601 format.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

    /**
     * The property value.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun value(): String = value.getRequired("value")

    /**
     * The unique ID of the property.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sourceId(): Optional<String> = sourceId.getOptional("sourceId")

    /**
     * A human-readable label.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sourceLabel(): Optional<String> = sourceLabel.getOptional("sourceLabel")

    /**
     * The ID of the user who last updated the property.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedByUserId(): Optional<Int> = updatedByUserId.getOptional("updatedByUserId")

    /**
     * Returns the raw JSON value of [sourceType].
     *
     * Unlike [sourceType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceType") @ExcludeMissing fun _sourceType(): JsonField<String> = sourceType

    /**
     * Returns the raw JSON value of [timestamp].
     *
     * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timestamp")
    @ExcludeMissing
    fun _timestamp(): JsonField<OffsetDateTime> = timestamp

    /**
     * Returns the raw JSON value of [value].
     *
     * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

    /**
     * Returns the raw JSON value of [sourceId].
     *
     * Unlike [sourceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceId") @ExcludeMissing fun _sourceId(): JsonField<String> = sourceId

    /**
     * Returns the raw JSON value of [sourceLabel].
     *
     * Unlike [sourceLabel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceLabel") @ExcludeMissing fun _sourceLabel(): JsonField<String> = sourceLabel

    /**
     * Returns the raw JSON value of [updatedByUserId].
     *
     * Unlike [updatedByUserId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedByUserId")
    @ExcludeMissing
    fun _updatedByUserId(): JsonField<Int> = updatedByUserId

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
         * Returns a mutable builder for constructing an instance of [ValueWithTimestamp].
         *
         * The following fields are required:
         * ```java
         * .sourceType()
         * .timestamp()
         * .value()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ValueWithTimestamp]. */
    class Builder internal constructor() {

        private var sourceType: JsonField<String>? = null
        private var timestamp: JsonField<OffsetDateTime>? = null
        private var value: JsonField<String>? = null
        private var sourceId: JsonField<String> = JsonMissing.of()
        private var sourceLabel: JsonField<String> = JsonMissing.of()
        private var updatedByUserId: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(valueWithTimestamp: ValueWithTimestamp) = apply {
            sourceType = valueWithTimestamp.sourceType
            timestamp = valueWithTimestamp.timestamp
            value = valueWithTimestamp.value
            sourceId = valueWithTimestamp.sourceId
            sourceLabel = valueWithTimestamp.sourceLabel
            updatedByUserId = valueWithTimestamp.updatedByUserId
            additionalProperties = valueWithTimestamp.additionalProperties.toMutableMap()
        }

        /** The property type. */
        fun sourceType(sourceType: String) = sourceType(JsonField.of(sourceType))

        /**
         * Sets [Builder.sourceType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sourceType(sourceType: JsonField<String>) = apply { this.sourceType = sourceType }

        /** The timestamp when the property was updated, in ISO 8601 format. */
        fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

        /**
         * Sets [Builder.timestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply { this.timestamp = timestamp }

        /** The property value. */
        fun value(value: String) = value(JsonField.of(value))

        /**
         * Sets [Builder.value] to an arbitrary JSON value.
         *
         * You should usually call [Builder.value] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun value(value: JsonField<String>) = apply { this.value = value }

        /** The unique ID of the property. */
        fun sourceId(sourceId: String) = sourceId(JsonField.of(sourceId))

        /**
         * Sets [Builder.sourceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sourceId(sourceId: JsonField<String>) = apply { this.sourceId = sourceId }

        /** A human-readable label. */
        fun sourceLabel(sourceLabel: String) = sourceLabel(JsonField.of(sourceLabel))

        /**
         * Sets [Builder.sourceLabel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceLabel] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sourceLabel(sourceLabel: JsonField<String>) = apply { this.sourceLabel = sourceLabel }

        /** The ID of the user who last updated the property. */
        fun updatedByUserId(updatedByUserId: Int) = updatedByUserId(JsonField.of(updatedByUserId))

        /**
         * Sets [Builder.updatedByUserId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedByUserId] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedByUserId(updatedByUserId: JsonField<Int>) = apply {
            this.updatedByUserId = updatedByUserId
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
         * Returns an immutable instance of [ValueWithTimestamp].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .sourceType()
         * .timestamp()
         * .value()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ValueWithTimestamp =
            ValueWithTimestamp(
                checkRequired("sourceType", sourceType),
                checkRequired("timestamp", timestamp),
                checkRequired("value", value),
                sourceId,
                sourceLabel,
                updatedByUserId,
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
    fun validate(): ValueWithTimestamp = apply {
        if (validated) {
            return@apply
        }

        sourceType()
        timestamp()
        value()
        sourceId()
        sourceLabel()
        updatedByUserId()
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
        (if (sourceType.asKnown().isPresent) 1 else 0) +
            (if (timestamp.asKnown().isPresent) 1 else 0) +
            (if (value.asKnown().isPresent) 1 else 0) +
            (if (sourceId.asKnown().isPresent) 1 else 0) +
            (if (sourceLabel.asKnown().isPresent) 1 else 0) +
            (if (updatedByUserId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ValueWithTimestamp &&
            sourceType == other.sourceType &&
            timestamp == other.timestamp &&
            value == other.value &&
            sourceId == other.sourceId &&
            sourceLabel == other.sourceLabel &&
            updatedByUserId == other.updatedByUserId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            sourceType,
            timestamp,
            value,
            sourceId,
            sourceLabel,
            updatedByUserId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ValueWithTimestamp{sourceType=$sourceType, timestamp=$timestamp, value=$value, sourceId=$sourceId, sourceLabel=$sourceLabel, updatedByUserId=$updatedByUserId, additionalProperties=$additionalProperties}"
}
