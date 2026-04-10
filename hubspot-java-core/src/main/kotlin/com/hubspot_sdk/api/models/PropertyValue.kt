// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.Enum
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/**
 * Represents a single custom property of a marketing event, storing its name, value, metadata (like
 * source, timestamp, and sensitivity), and related audit information for tracking changes.
 */
class PropertyValue
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val dataSensitivity: JsonField<DataSensitivity>,
    private val isEncrypted: JsonField<Boolean>,
    private val isLargeValue: JsonField<Boolean>,
    private val name: JsonField<String>,
    private val persistenceTimestamp: JsonField<Long>,
    private val requestId: JsonField<String>,
    private val selectedByUser: JsonField<Boolean>,
    private val selectedByUserTimestamp: JsonField<Long>,
    private val source: JsonField<Source>,
    private val sourceId: JsonField<String>,
    private val sourceLabel: JsonField<String>,
    private val sourceMetadata: JsonField<String>,
    private val sourceUpstreamDeployable: JsonField<String>,
    private val sourceVid: JsonField<List<Long>>,
    private val timestamp: JsonField<Long>,
    private val unit: JsonField<String>,
    private val updatedByUserId: JsonField<Int>,
    private val useTimestampAsPersistenceTimestamp: JsonField<Boolean>,
    private val value: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("dataSensitivity")
        @ExcludeMissing
        dataSensitivity: JsonField<DataSensitivity> = JsonMissing.of(),
        @JsonProperty("isEncrypted")
        @ExcludeMissing
        isEncrypted: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isLargeValue")
        @ExcludeMissing
        isLargeValue: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("persistenceTimestamp")
        @ExcludeMissing
        persistenceTimestamp: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("requestId") @ExcludeMissing requestId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("selectedByUser")
        @ExcludeMissing
        selectedByUser: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("selectedByUserTimestamp")
        @ExcludeMissing
        selectedByUserTimestamp: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<Source> = JsonMissing.of(),
        @JsonProperty("sourceId") @ExcludeMissing sourceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceLabel")
        @ExcludeMissing
        sourceLabel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceMetadata")
        @ExcludeMissing
        sourceMetadata: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceUpstreamDeployable")
        @ExcludeMissing
        sourceUpstreamDeployable: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceVid")
        @ExcludeMissing
        sourceVid: JsonField<List<Long>> = JsonMissing.of(),
        @JsonProperty("timestamp") @ExcludeMissing timestamp: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("unit") @ExcludeMissing unit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedByUserId")
        @ExcludeMissing
        updatedByUserId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("useTimestampAsPersistenceTimestamp")
        @ExcludeMissing
        useTimestampAsPersistenceTimestamp: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
    ) : this(
        dataSensitivity,
        isEncrypted,
        isLargeValue,
        name,
        persistenceTimestamp,
        requestId,
        selectedByUser,
        selectedByUserTimestamp,
        source,
        sourceId,
        sourceLabel,
        sourceMetadata,
        sourceUpstreamDeployable,
        sourceVid,
        timestamp,
        unit,
        updatedByUserId,
        useTimestampAsPersistenceTimestamp,
        value,
        mutableMapOf(),
    )

    /**
     * The sensitivity level of the property, such as "non_sensitive", "sensitive", and
     * "highly_sensitive".
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dataSensitivity(): DataSensitivity = dataSensitivity.getRequired("dataSensitivity")

    /**
     * Whether the property value is encrypted.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isEncrypted(): Boolean = isEncrypted.getRequired("isEncrypted")

    /**
     * Indicates if the value exceeds normal size limits.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isLargeValue(): Boolean = isLargeValue.getRequired("isLargeValue")

    /**
     * The unique property name.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * When the value was persisted to database, in epoch milliseconds.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun persistenceTimestamp(): Long = persistenceTimestamp.getRequired("persistenceTimestamp")

    /**
     * A unique ID associated with this request.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun requestId(): String = requestId.getRequired("requestId")

    /**
     * Whether the value was selected by a user.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun selectedByUser(): Boolean = selectedByUser.getRequired("selectedByUser")

    /**
     * The timestamp when the value was selected by a user, if applicable.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun selectedByUserTimestamp(): Long =
        selectedByUserTimestamp.getRequired("selectedByUserTimestamp")

    /**
     * The origin of the property value, such as "IMPORT" or "API".
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): Source = source.getRequired("source")

    /**
     * The ID of the property source indicating where it was created.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sourceId(): String = sourceId.getRequired("sourceId")

    /**
     * A human-readable label.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sourceLabel(): String = sourceLabel.getRequired("sourceLabel")

    /**
     * Metadata providing additional context about the source.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sourceMetadata(): String = sourceMetadata.getRequired("sourceMetadata")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sourceUpstreamDeployable(): String =
        sourceUpstreamDeployable.getRequired("sourceUpstreamDeployable")

    /**
     * The unique identifier associated with the source.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sourceVid(): List<Long> = sourceVid.getRequired("sourceVid")

    /**
     * When the value was set, as a 64-bit integer.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timestamp(): Long = timestamp.getRequired("timestamp")

    /**
     * The unit of measurement or context for the value.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun unit(): String = unit.getRequired("unit")

    /**
     * The ID of the user who updated the property.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedByUserId(): Int = updatedByUserId.getRequired("updatedByUserId")

    /**
     * Flag indicating whether to use the timestamp field as the persistence timestamp.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun useTimestampAsPersistenceTimestamp(): Boolean =
        useTimestampAsPersistenceTimestamp.getRequired("useTimestampAsPersistenceTimestamp")

    /**
     * The property value.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun value(): String = value.getRequired("value")

    /**
     * Returns the raw JSON value of [dataSensitivity].
     *
     * Unlike [dataSensitivity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dataSensitivity")
    @ExcludeMissing
    fun _dataSensitivity(): JsonField<DataSensitivity> = dataSensitivity

    /**
     * Returns the raw JSON value of [isEncrypted].
     *
     * Unlike [isEncrypted], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isEncrypted")
    @ExcludeMissing
    fun _isEncrypted(): JsonField<Boolean> = isEncrypted

    /**
     * Returns the raw JSON value of [isLargeValue].
     *
     * Unlike [isLargeValue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isLargeValue")
    @ExcludeMissing
    fun _isLargeValue(): JsonField<Boolean> = isLargeValue

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [persistenceTimestamp].
     *
     * Unlike [persistenceTimestamp], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("persistenceTimestamp")
    @ExcludeMissing
    fun _persistenceTimestamp(): JsonField<Long> = persistenceTimestamp

    /**
     * Returns the raw JSON value of [requestId].
     *
     * Unlike [requestId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("requestId") @ExcludeMissing fun _requestId(): JsonField<String> = requestId

    /**
     * Returns the raw JSON value of [selectedByUser].
     *
     * Unlike [selectedByUser], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("selectedByUser")
    @ExcludeMissing
    fun _selectedByUser(): JsonField<Boolean> = selectedByUser

    /**
     * Returns the raw JSON value of [selectedByUserTimestamp].
     *
     * Unlike [selectedByUserTimestamp], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("selectedByUserTimestamp")
    @ExcludeMissing
    fun _selectedByUserTimestamp(): JsonField<Long> = selectedByUserTimestamp

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<Source> = source

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
     * Returns the raw JSON value of [sourceMetadata].
     *
     * Unlike [sourceMetadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceMetadata")
    @ExcludeMissing
    fun _sourceMetadata(): JsonField<String> = sourceMetadata

    /**
     * Returns the raw JSON value of [sourceUpstreamDeployable].
     *
     * Unlike [sourceUpstreamDeployable], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("sourceUpstreamDeployable")
    @ExcludeMissing
    fun _sourceUpstreamDeployable(): JsonField<String> = sourceUpstreamDeployable

    /**
     * Returns the raw JSON value of [sourceVid].
     *
     * Unlike [sourceVid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceVid") @ExcludeMissing fun _sourceVid(): JsonField<List<Long>> = sourceVid

    /**
     * Returns the raw JSON value of [timestamp].
     *
     * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timestamp") @ExcludeMissing fun _timestamp(): JsonField<Long> = timestamp

    /**
     * Returns the raw JSON value of [unit].
     *
     * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<String> = unit

    /**
     * Returns the raw JSON value of [updatedByUserId].
     *
     * Unlike [updatedByUserId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedByUserId")
    @ExcludeMissing
    fun _updatedByUserId(): JsonField<Int> = updatedByUserId

    /**
     * Returns the raw JSON value of [useTimestampAsPersistenceTimestamp].
     *
     * Unlike [useTimestampAsPersistenceTimestamp], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    @JsonProperty("useTimestampAsPersistenceTimestamp")
    @ExcludeMissing
    fun _useTimestampAsPersistenceTimestamp(): JsonField<Boolean> =
        useTimestampAsPersistenceTimestamp

    /**
     * Returns the raw JSON value of [value].
     *
     * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
         * Returns a mutable builder for constructing an instance of [PropertyValue].
         *
         * The following fields are required:
         * ```java
         * .dataSensitivity()
         * .isEncrypted()
         * .isLargeValue()
         * .name()
         * .persistenceTimestamp()
         * .requestId()
         * .selectedByUser()
         * .selectedByUserTimestamp()
         * .source()
         * .sourceId()
         * .sourceLabel()
         * .sourceMetadata()
         * .sourceUpstreamDeployable()
         * .sourceVid()
         * .timestamp()
         * .unit()
         * .updatedByUserId()
         * .useTimestampAsPersistenceTimestamp()
         * .value()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PropertyValue]. */
    class Builder internal constructor() {

        private var dataSensitivity: JsonField<DataSensitivity>? = null
        private var isEncrypted: JsonField<Boolean>? = null
        private var isLargeValue: JsonField<Boolean>? = null
        private var name: JsonField<String>? = null
        private var persistenceTimestamp: JsonField<Long>? = null
        private var requestId: JsonField<String>? = null
        private var selectedByUser: JsonField<Boolean>? = null
        private var selectedByUserTimestamp: JsonField<Long>? = null
        private var source: JsonField<Source>? = null
        private var sourceId: JsonField<String>? = null
        private var sourceLabel: JsonField<String>? = null
        private var sourceMetadata: JsonField<String>? = null
        private var sourceUpstreamDeployable: JsonField<String>? = null
        private var sourceVid: JsonField<MutableList<Long>>? = null
        private var timestamp: JsonField<Long>? = null
        private var unit: JsonField<String>? = null
        private var updatedByUserId: JsonField<Int>? = null
        private var useTimestampAsPersistenceTimestamp: JsonField<Boolean>? = null
        private var value: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(propertyValue: PropertyValue) = apply {
            dataSensitivity = propertyValue.dataSensitivity
            isEncrypted = propertyValue.isEncrypted
            isLargeValue = propertyValue.isLargeValue
            name = propertyValue.name
            persistenceTimestamp = propertyValue.persistenceTimestamp
            requestId = propertyValue.requestId
            selectedByUser = propertyValue.selectedByUser
            selectedByUserTimestamp = propertyValue.selectedByUserTimestamp
            source = propertyValue.source
            sourceId = propertyValue.sourceId
            sourceLabel = propertyValue.sourceLabel
            sourceMetadata = propertyValue.sourceMetadata
            sourceUpstreamDeployable = propertyValue.sourceUpstreamDeployable
            sourceVid = propertyValue.sourceVid.map { it.toMutableList() }
            timestamp = propertyValue.timestamp
            unit = propertyValue.unit
            updatedByUserId = propertyValue.updatedByUserId
            useTimestampAsPersistenceTimestamp = propertyValue.useTimestampAsPersistenceTimestamp
            value = propertyValue.value
            additionalProperties = propertyValue.additionalProperties.toMutableMap()
        }

        /**
         * The sensitivity level of the property, such as "non_sensitive", "sensitive", and
         * "highly_sensitive".
         */
        fun dataSensitivity(dataSensitivity: DataSensitivity) =
            dataSensitivity(JsonField.of(dataSensitivity))

        /**
         * Sets [Builder.dataSensitivity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataSensitivity] with a well-typed [DataSensitivity]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun dataSensitivity(dataSensitivity: JsonField<DataSensitivity>) = apply {
            this.dataSensitivity = dataSensitivity
        }

        /** Whether the property value is encrypted. */
        fun isEncrypted(isEncrypted: Boolean) = isEncrypted(JsonField.of(isEncrypted))

        /**
         * Sets [Builder.isEncrypted] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isEncrypted] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isEncrypted(isEncrypted: JsonField<Boolean>) = apply { this.isEncrypted = isEncrypted }

        /** Indicates if the value exceeds normal size limits. */
        fun isLargeValue(isLargeValue: Boolean) = isLargeValue(JsonField.of(isLargeValue))

        /**
         * Sets [Builder.isLargeValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isLargeValue] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isLargeValue(isLargeValue: JsonField<Boolean>) = apply {
            this.isLargeValue = isLargeValue
        }

        /** The unique property name. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** When the value was persisted to database, in epoch milliseconds. */
        fun persistenceTimestamp(persistenceTimestamp: Long) =
            persistenceTimestamp(JsonField.of(persistenceTimestamp))

        /**
         * Sets [Builder.persistenceTimestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.persistenceTimestamp] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun persistenceTimestamp(persistenceTimestamp: JsonField<Long>) = apply {
            this.persistenceTimestamp = persistenceTimestamp
        }

        /** A unique ID associated with this request. */
        fun requestId(requestId: String) = requestId(JsonField.of(requestId))

        /**
         * Sets [Builder.requestId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun requestId(requestId: JsonField<String>) = apply { this.requestId = requestId }

        /** Whether the value was selected by a user. */
        fun selectedByUser(selectedByUser: Boolean) = selectedByUser(JsonField.of(selectedByUser))

        /**
         * Sets [Builder.selectedByUser] to an arbitrary JSON value.
         *
         * You should usually call [Builder.selectedByUser] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun selectedByUser(selectedByUser: JsonField<Boolean>) = apply {
            this.selectedByUser = selectedByUser
        }

        /** The timestamp when the value was selected by a user, if applicable. */
        fun selectedByUserTimestamp(selectedByUserTimestamp: Long) =
            selectedByUserTimestamp(JsonField.of(selectedByUserTimestamp))

        /**
         * Sets [Builder.selectedByUserTimestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.selectedByUserTimestamp] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun selectedByUserTimestamp(selectedByUserTimestamp: JsonField<Long>) = apply {
            this.selectedByUserTimestamp = selectedByUserTimestamp
        }

        /** The origin of the property value, such as "IMPORT" or "API". */
        fun source(source: Source) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [Source] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<Source>) = apply { this.source = source }

        /** The ID of the property source indicating where it was created. */
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

        /** Metadata providing additional context about the source. */
        fun sourceMetadata(sourceMetadata: String) = sourceMetadata(JsonField.of(sourceMetadata))

        /**
         * Sets [Builder.sourceMetadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceMetadata] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sourceMetadata(sourceMetadata: JsonField<String>) = apply {
            this.sourceMetadata = sourceMetadata
        }

        fun sourceUpstreamDeployable(sourceUpstreamDeployable: String) =
            sourceUpstreamDeployable(JsonField.of(sourceUpstreamDeployable))

        /**
         * Sets [Builder.sourceUpstreamDeployable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceUpstreamDeployable] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun sourceUpstreamDeployable(sourceUpstreamDeployable: JsonField<String>) = apply {
            this.sourceUpstreamDeployable = sourceUpstreamDeployable
        }

        /** The unique identifier associated with the source. */
        fun sourceVid(sourceVid: List<Long>) = sourceVid(JsonField.of(sourceVid))

        /**
         * Sets [Builder.sourceVid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceVid] with a well-typed `List<Long>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sourceVid(sourceVid: JsonField<List<Long>>) = apply {
            this.sourceVid = sourceVid.map { it.toMutableList() }
        }

        /**
         * Adds a single [Long] to [Builder.sourceVid].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSourceVid(sourceVid: Long) = apply {
            this.sourceVid =
                (this.sourceVid ?: JsonField.of(mutableListOf())).also {
                    checkKnown("sourceVid", it).add(sourceVid)
                }
        }

        /** When the value was set, as a 64-bit integer. */
        fun timestamp(timestamp: Long) = timestamp(JsonField.of(timestamp))

        /**
         * Sets [Builder.timestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timestamp] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timestamp(timestamp: JsonField<Long>) = apply { this.timestamp = timestamp }

        /** The unit of measurement or context for the value. */
        fun unit(unit: String) = unit(JsonField.of(unit))

        /**
         * Sets [Builder.unit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unit] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun unit(unit: JsonField<String>) = apply { this.unit = unit }

        /** The ID of the user who updated the property. */
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

        /** Flag indicating whether to use the timestamp field as the persistence timestamp. */
        fun useTimestampAsPersistenceTimestamp(useTimestampAsPersistenceTimestamp: Boolean) =
            useTimestampAsPersistenceTimestamp(JsonField.of(useTimestampAsPersistenceTimestamp))

        /**
         * Sets [Builder.useTimestampAsPersistenceTimestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.useTimestampAsPersistenceTimestamp] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun useTimestampAsPersistenceTimestamp(
            useTimestampAsPersistenceTimestamp: JsonField<Boolean>
        ) = apply { this.useTimestampAsPersistenceTimestamp = useTimestampAsPersistenceTimestamp }

        /** The property value. */
        fun value(value: String) = value(JsonField.of(value))

        /**
         * Sets [Builder.value] to an arbitrary JSON value.
         *
         * You should usually call [Builder.value] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun value(value: JsonField<String>) = apply { this.value = value }

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
         * Returns an immutable instance of [PropertyValue].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .dataSensitivity()
         * .isEncrypted()
         * .isLargeValue()
         * .name()
         * .persistenceTimestamp()
         * .requestId()
         * .selectedByUser()
         * .selectedByUserTimestamp()
         * .source()
         * .sourceId()
         * .sourceLabel()
         * .sourceMetadata()
         * .sourceUpstreamDeployable()
         * .sourceVid()
         * .timestamp()
         * .unit()
         * .updatedByUserId()
         * .useTimestampAsPersistenceTimestamp()
         * .value()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PropertyValue =
            PropertyValue(
                checkRequired("dataSensitivity", dataSensitivity),
                checkRequired("isEncrypted", isEncrypted),
                checkRequired("isLargeValue", isLargeValue),
                checkRequired("name", name),
                checkRequired("persistenceTimestamp", persistenceTimestamp),
                checkRequired("requestId", requestId),
                checkRequired("selectedByUser", selectedByUser),
                checkRequired("selectedByUserTimestamp", selectedByUserTimestamp),
                checkRequired("source", source),
                checkRequired("sourceId", sourceId),
                checkRequired("sourceLabel", sourceLabel),
                checkRequired("sourceMetadata", sourceMetadata),
                checkRequired("sourceUpstreamDeployable", sourceUpstreamDeployable),
                checkRequired("sourceVid", sourceVid).map { it.toImmutable() },
                checkRequired("timestamp", timestamp),
                checkRequired("unit", unit),
                checkRequired("updatedByUserId", updatedByUserId),
                checkRequired(
                    "useTimestampAsPersistenceTimestamp",
                    useTimestampAsPersistenceTimestamp,
                ),
                checkRequired("value", value),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PropertyValue = apply {
        if (validated) {
            return@apply
        }

        dataSensitivity().validate()
        isEncrypted()
        isLargeValue()
        name()
        persistenceTimestamp()
        requestId()
        selectedByUser()
        selectedByUserTimestamp()
        source().validate()
        sourceId()
        sourceLabel()
        sourceMetadata()
        sourceUpstreamDeployable()
        sourceVid()
        timestamp()
        unit()
        updatedByUserId()
        useTimestampAsPersistenceTimestamp()
        value()
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
        (dataSensitivity.asKnown().getOrNull()?.validity() ?: 0) +
            (if (isEncrypted.asKnown().isPresent) 1 else 0) +
            (if (isLargeValue.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (persistenceTimestamp.asKnown().isPresent) 1 else 0) +
            (if (requestId.asKnown().isPresent) 1 else 0) +
            (if (selectedByUser.asKnown().isPresent) 1 else 0) +
            (if (selectedByUserTimestamp.asKnown().isPresent) 1 else 0) +
            (source.asKnown().getOrNull()?.validity() ?: 0) +
            (if (sourceId.asKnown().isPresent) 1 else 0) +
            (if (sourceLabel.asKnown().isPresent) 1 else 0) +
            (if (sourceMetadata.asKnown().isPresent) 1 else 0) +
            (if (sourceUpstreamDeployable.asKnown().isPresent) 1 else 0) +
            (sourceVid.asKnown().getOrNull()?.size ?: 0) +
            (if (timestamp.asKnown().isPresent) 1 else 0) +
            (if (unit.asKnown().isPresent) 1 else 0) +
            (if (updatedByUserId.asKnown().isPresent) 1 else 0) +
            (if (useTimestampAsPersistenceTimestamp.asKnown().isPresent) 1 else 0) +
            (if (value.asKnown().isPresent) 1 else 0)

    /**
     * The sensitivity level of the property, such as "non_sensitive", "sensitive", and
     * "highly_sensitive".
     */
    class DataSensitivity @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val HIGH = of("high")

            @JvmField val NONE = of("none")

            @JvmField val STANDARD = of("standard")

            @JvmStatic fun of(value: String) = DataSensitivity(JsonField.of(value))
        }

        /** An enum containing [DataSensitivity]'s known values. */
        enum class Known {
            HIGH,
            NONE,
            STANDARD,
        }

        /**
         * An enum containing [DataSensitivity]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DataSensitivity] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            HIGH,
            NONE,
            STANDARD,
            /**
             * An enum member indicating that [DataSensitivity] was instantiated with an unknown
             * value.
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
                HIGH -> Value.HIGH
                NONE -> Value.NONE
                STANDARD -> Value.STANDARD
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
                HIGH -> Known.HIGH
                NONE -> Known.NONE
                STANDARD -> Known.STANDARD
                else -> throw HubSpotInvalidDataException("Unknown DataSensitivity: $value")
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

        fun validate(): DataSensitivity = apply {
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

            return other is DataSensitivity && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The origin of the property value, such as "IMPORT" or "API". */
    class Source @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ACADEMY = of("ACADEMY")

            @JvmField val ACCEPTANCE_TEST = of("ACCEPTANCE_TEST")

            @JvmField val ACTIVITY_AUTO_ASSOCIATE = of("ACTIVITY_AUTO_ASSOCIATE")

            @JvmField val ACTIVITY_LOG_REVERT = of("ACTIVITY_LOG_REVERT")

            @JvmField val ADS = of("ADS")

            @JvmField val AI_GROUP = of("AI_GROUP")

            @JvmField val ANALYTICS = of("ANALYTICS")

            @JvmField val API = of("API")

            @JvmField val APPROVALS = of("APPROVALS")

            @JvmField val ASSISTS = of("ASSISTS")

            @JvmField val ASSOCIATIONS = of("ASSOCIATIONS")

            @JvmField val AUTO_ASSOCIATE_BY_DOMAIN = of("AUTO_ASSOCIATE_BY_DOMAIN")

            @JvmField val AUTOMATION_JOURNEY = of("AUTOMATION_JOURNEY")

            @JvmField val AUTOMATION_PLATFORM = of("AUTOMATION_PLATFORM")

            @JvmField val AVATARS_SERVICE = of("AVATARS_SERVICE")

            @JvmField val BATCH_UPDATE = of("BATCH_UPDATE")

            @JvmField val BCC_TO_CRM = of("BCC_TO_CRM")

            @JvmField val BEHAVIORAL_EVENTS = of("BEHAVIORAL_EVENTS")

            @JvmField val BET_ASSIGNMENT = of("BET_ASSIGNMENT")

            @JvmField val BET_CRM_CONNECTOR = of("BET_CRM_CONNECTOR")

            @JvmField val BIDEN = of("BIDEN")

            @JvmField val BILLING = of("BILLING")

            @JvmField val BOT = of("BOT")

            @JvmField val CALCULATED = of("CALCULATED")

            @JvmField val CENTRAL_EXCHANGE_RATES = of("CENTRAL_EXCHANGE_RATES")

            @JvmField val CHATSPOT = of("CHATSPOT")

            @JvmField val CLONE_OBJECTS = of("CLONE_OBJECTS")

            @JvmField val COMMUNICATOR = of("COMMUNICATOR")

            @JvmField val COMPANIES = of("COMPANIES")

            @JvmField val COMPANY_FAMILIES = of("COMPANY_FAMILIES")

            @JvmField val COMPANY_INSIGHTS = of("COMPANY_INSIGHTS")

            @JvmField val CONTACTS = of("CONTACTS")

            @JvmField val CONTACTS_WEB = of("CONTACTS_WEB")

            @JvmField val CONTENT_MEMBERSHIP = of("CONTENT_MEMBERSHIP")

            @JvmField val CONVERSATIONAL_ENRICHMENT = of("CONVERSATIONAL_ENRICHMENT")

            @JvmField val CONVERSATIONS = of("CONVERSATIONS")

            @JvmField val CRM_PROCESSES_PLATFORM = of("CRM_PROCESSES_PLATFORM")

            @JvmField val CRM_UI = of("CRM_UI")

            @JvmField val CRM_UI_BULK_ACTION = of("CRM_UI_BULK_ACTION")

            @JvmField val CUSTOMER_AGENT = of("CUSTOMER_AGENT")

            @JvmField val DATA_ENRICHMENT = of("DATA_ENRICHMENT")

            @JvmField val DATA_QUALITY = of("DATA_QUALITY")

            @JvmField val DATASET = of("DATASET")

            @JvmField val DEALS = of("DEALS")

            @JvmField val DEFAULT = of("DEFAULT")

            @JvmField val DELETE_OBJECTS = of("DELETE_OBJECTS")

            @JvmField val EMAIL = of("EMAIL")

            @JvmField val EMAIL_INBOX_IMPORT = of("EMAIL_INBOX_IMPORT")

            @JvmField val EMAIL_INTEGRATION = of("EMAIL_INTEGRATION")

            @JvmField val ENGAGEMENTS = of("ENGAGEMENTS")

            @JvmField val EXTENSION = of("EXTENSION")

            @JvmField val FILE_MANAGER = of("FILE_MANAGER")

            @JvmField val FLYWHEEL_PRODUCT_DATA_SYNC = of("FLYWHEEL_PRODUCT_DATA_SYNC")

            @JvmField val FORECASTING = of("FORECASTING")

            @JvmField val FORM = of("FORM")

            @JvmField val FORWARD_TO_CRM = of("FORWARD_TO_CRM")

            @JvmField val GMAIL_INTEGRATION = of("GMAIL_INTEGRATION")

            @JvmField val GOALS = of("GOALS")

            @JvmField val HEISENBERG = of("HEISENBERG")

            @JvmField val HELP_DESK = of("HELP_DESK")

            @JvmField val HELP_DESK_AI = of("HELP_DESK_AI")

            @JvmField val IMPORT = of("IMPORT")

            @JvmField val INTEGRATION = of("INTEGRATION")

            @JvmField val INTEGRATIONS_PLATFORM = of("INTEGRATIONS_PLATFORM")

            @JvmField val INTEGRATIONS_SYNC = of("INTEGRATIONS_SYNC")

            @JvmField val INTENT = of("INTENT")

            @JvmField val INTERNAL_PROCESSING = of("INTERNAL_PROCESSING")

            @JvmField val LEADIN = of("LEADIN")

            @JvmField val LEGAL_BASIS_REMEDIATION = of("LEGAL_BASIS_REMEDIATION")

            @JvmField val MARKET_SOURCING = of("MARKET_SOURCING")

            @JvmField val MARKETPLACE = of("MARKETPLACE")

            @JvmField val MEETINGS = of("MEETINGS")

            @JvmField val MERGE_COMPANIES = of("MERGE_COMPANIES")

            @JvmField val MERGE_CONTACTS = of("MERGE_CONTACTS")

            @JvmField val MERGE_OBJECTS = of("MERGE_OBJECTS")

            @JvmField val MERGE_REVERT_OBJECTS = of("MERGE_REVERT_OBJECTS")

            @JvmField val MICROAPPS = of("MICROAPPS")

            @JvmField val MIGRATION = of("MIGRATION")

            @JvmField val MOBILE_ANDROID = of("MOBILE_ANDROID")

            @JvmField val MOBILE_IOS = of("MOBILE_IOS")

            @JvmField val PAYMENTS = of("PAYMENTS")

            @JvmField val PIPELINE_SETTINGS = of("PIPELINE_SETTINGS")

            @JvmField val PLAYBOOKS = of("PLAYBOOKS")

            @JvmField val PORTAL_OBJECT_SYNC = of("PORTAL_OBJECT_SYNC")

            @JvmField val PORTAL_USER_ASSOCIATOR = of("PORTAL_USER_ASSOCIATOR")

            @JvmField val PRESENTATIONS = of("PRESENTATIONS")

            @JvmField val PRIMARY_AUTOMATION = of("PRIMARY_AUTOMATION")

            @JvmField val PROPERTY_DEFAULT_VALUE = of("PROPERTY_DEFAULT_VALUE")

            @JvmField val PROPERTY_RESTORE = of("PROPERTY_RESTORE")

            @JvmField val PROPERTY_SETTINGS = of("PROPERTY_SETTINGS")

            @JvmField val PROSPECTING_AGENT = of("PROSPECTING_AGENT")

            @JvmField val QUOTAS = of("QUOTAS")

            @JvmField val QUOTES = of("QUOTES")

            @JvmField val RECYCLING_BIN = of("RECYCLING_BIN")

            @JvmField val RESTORE_OBJECTS = of("RESTORE_OBJECTS")

            @JvmField val SALES = of("SALES")

            @JvmField val SALES_MESSAGES = of("SALES_MESSAGES")

            @JvmField val SALESFORCE = of("SALESFORCE")

            @JvmField val SEQUENCES = of("SEQUENCES")

            @JvmField val SETTINGS = of("SETTINGS")

            @JvmField val SIDEKICK = of("SIDEKICK")

            @JvmField val SIGNALS = of("SIGNALS")

            @JvmField val SLACK_INTEGRATION = of("SLACK_INTEGRATION")

            @JvmField val SMART_DATA_CAPTURE = of("SMART_DATA_CAPTURE")

            @JvmField val SOCIAL = of("SOCIAL")

            @JvmField val SUCCESS = of("SUCCESS")

            @JvmField val TALLY = of("TALLY")

            @JvmField val TASK = of("TASK")

            @JvmField val UNKNOWN = of("UNKNOWN")

            @JvmField val WAL_INCREMENTAL = of("WAL_INCREMENTAL")

            @JvmField val WORK_UI = of("WORK_UI")

            @JvmField val WORKFLOW_CONTACT_DELETE_ACTION = of("WORKFLOW_CONTACT_DELETE_ACTION")

            @JvmField val WORKFLOWS = of("WORKFLOWS")

            @JvmStatic fun of(value: String) = Source(JsonField.of(value))
        }

        /** An enum containing [Source]'s known values. */
        enum class Known {
            ACADEMY,
            ACCEPTANCE_TEST,
            ACTIVITY_AUTO_ASSOCIATE,
            ACTIVITY_LOG_REVERT,
            ADS,
            AI_GROUP,
            ANALYTICS,
            API,
            APPROVALS,
            ASSISTS,
            ASSOCIATIONS,
            AUTO_ASSOCIATE_BY_DOMAIN,
            AUTOMATION_JOURNEY,
            AUTOMATION_PLATFORM,
            AVATARS_SERVICE,
            BATCH_UPDATE,
            BCC_TO_CRM,
            BEHAVIORAL_EVENTS,
            BET_ASSIGNMENT,
            BET_CRM_CONNECTOR,
            BIDEN,
            BILLING,
            BOT,
            CALCULATED,
            CENTRAL_EXCHANGE_RATES,
            CHATSPOT,
            CLONE_OBJECTS,
            COMMUNICATOR,
            COMPANIES,
            COMPANY_FAMILIES,
            COMPANY_INSIGHTS,
            CONTACTS,
            CONTACTS_WEB,
            CONTENT_MEMBERSHIP,
            CONVERSATIONAL_ENRICHMENT,
            CONVERSATIONS,
            CRM_PROCESSES_PLATFORM,
            CRM_UI,
            CRM_UI_BULK_ACTION,
            CUSTOMER_AGENT,
            DATA_ENRICHMENT,
            DATA_QUALITY,
            DATASET,
            DEALS,
            DEFAULT,
            DELETE_OBJECTS,
            EMAIL,
            EMAIL_INBOX_IMPORT,
            EMAIL_INTEGRATION,
            ENGAGEMENTS,
            EXTENSION,
            FILE_MANAGER,
            FLYWHEEL_PRODUCT_DATA_SYNC,
            FORECASTING,
            FORM,
            FORWARD_TO_CRM,
            GMAIL_INTEGRATION,
            GOALS,
            HEISENBERG,
            HELP_DESK,
            HELP_DESK_AI,
            IMPORT,
            INTEGRATION,
            INTEGRATIONS_PLATFORM,
            INTEGRATIONS_SYNC,
            INTENT,
            INTERNAL_PROCESSING,
            LEADIN,
            LEGAL_BASIS_REMEDIATION,
            MARKET_SOURCING,
            MARKETPLACE,
            MEETINGS,
            MERGE_COMPANIES,
            MERGE_CONTACTS,
            MERGE_OBJECTS,
            MERGE_REVERT_OBJECTS,
            MICROAPPS,
            MIGRATION,
            MOBILE_ANDROID,
            MOBILE_IOS,
            PAYMENTS,
            PIPELINE_SETTINGS,
            PLAYBOOKS,
            PORTAL_OBJECT_SYNC,
            PORTAL_USER_ASSOCIATOR,
            PRESENTATIONS,
            PRIMARY_AUTOMATION,
            PROPERTY_DEFAULT_VALUE,
            PROPERTY_RESTORE,
            PROPERTY_SETTINGS,
            PROSPECTING_AGENT,
            QUOTAS,
            QUOTES,
            RECYCLING_BIN,
            RESTORE_OBJECTS,
            SALES,
            SALES_MESSAGES,
            SALESFORCE,
            SEQUENCES,
            SETTINGS,
            SIDEKICK,
            SIGNALS,
            SLACK_INTEGRATION,
            SMART_DATA_CAPTURE,
            SOCIAL,
            SUCCESS,
            TALLY,
            TASK,
            UNKNOWN,
            WAL_INCREMENTAL,
            WORK_UI,
            WORKFLOW_CONTACT_DELETE_ACTION,
            WORKFLOWS,
        }

        /**
         * An enum containing [Source]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Source] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACADEMY,
            ACCEPTANCE_TEST,
            ACTIVITY_AUTO_ASSOCIATE,
            ACTIVITY_LOG_REVERT,
            ADS,
            AI_GROUP,
            ANALYTICS,
            API,
            APPROVALS,
            ASSISTS,
            ASSOCIATIONS,
            AUTO_ASSOCIATE_BY_DOMAIN,
            AUTOMATION_JOURNEY,
            AUTOMATION_PLATFORM,
            AVATARS_SERVICE,
            BATCH_UPDATE,
            BCC_TO_CRM,
            BEHAVIORAL_EVENTS,
            BET_ASSIGNMENT,
            BET_CRM_CONNECTOR,
            BIDEN,
            BILLING,
            BOT,
            CALCULATED,
            CENTRAL_EXCHANGE_RATES,
            CHATSPOT,
            CLONE_OBJECTS,
            COMMUNICATOR,
            COMPANIES,
            COMPANY_FAMILIES,
            COMPANY_INSIGHTS,
            CONTACTS,
            CONTACTS_WEB,
            CONTENT_MEMBERSHIP,
            CONVERSATIONAL_ENRICHMENT,
            CONVERSATIONS,
            CRM_PROCESSES_PLATFORM,
            CRM_UI,
            CRM_UI_BULK_ACTION,
            CUSTOMER_AGENT,
            DATA_ENRICHMENT,
            DATA_QUALITY,
            DATASET,
            DEALS,
            DEFAULT,
            DELETE_OBJECTS,
            EMAIL,
            EMAIL_INBOX_IMPORT,
            EMAIL_INTEGRATION,
            ENGAGEMENTS,
            EXTENSION,
            FILE_MANAGER,
            FLYWHEEL_PRODUCT_DATA_SYNC,
            FORECASTING,
            FORM,
            FORWARD_TO_CRM,
            GMAIL_INTEGRATION,
            GOALS,
            HEISENBERG,
            HELP_DESK,
            HELP_DESK_AI,
            IMPORT,
            INTEGRATION,
            INTEGRATIONS_PLATFORM,
            INTEGRATIONS_SYNC,
            INTENT,
            INTERNAL_PROCESSING,
            LEADIN,
            LEGAL_BASIS_REMEDIATION,
            MARKET_SOURCING,
            MARKETPLACE,
            MEETINGS,
            MERGE_COMPANIES,
            MERGE_CONTACTS,
            MERGE_OBJECTS,
            MERGE_REVERT_OBJECTS,
            MICROAPPS,
            MIGRATION,
            MOBILE_ANDROID,
            MOBILE_IOS,
            PAYMENTS,
            PIPELINE_SETTINGS,
            PLAYBOOKS,
            PORTAL_OBJECT_SYNC,
            PORTAL_USER_ASSOCIATOR,
            PRESENTATIONS,
            PRIMARY_AUTOMATION,
            PROPERTY_DEFAULT_VALUE,
            PROPERTY_RESTORE,
            PROPERTY_SETTINGS,
            PROSPECTING_AGENT,
            QUOTAS,
            QUOTES,
            RECYCLING_BIN,
            RESTORE_OBJECTS,
            SALES,
            SALES_MESSAGES,
            SALESFORCE,
            SEQUENCES,
            SETTINGS,
            SIDEKICK,
            SIGNALS,
            SLACK_INTEGRATION,
            SMART_DATA_CAPTURE,
            SOCIAL,
            SUCCESS,
            TALLY,
            TASK,
            UNKNOWN,
            WAL_INCREMENTAL,
            WORK_UI,
            WORKFLOW_CONTACT_DELETE_ACTION,
            WORKFLOWS,
            /** An enum member indicating that [Source] was instantiated with an unknown value. */
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
                ACADEMY -> Value.ACADEMY
                ACCEPTANCE_TEST -> Value.ACCEPTANCE_TEST
                ACTIVITY_AUTO_ASSOCIATE -> Value.ACTIVITY_AUTO_ASSOCIATE
                ACTIVITY_LOG_REVERT -> Value.ACTIVITY_LOG_REVERT
                ADS -> Value.ADS
                AI_GROUP -> Value.AI_GROUP
                ANALYTICS -> Value.ANALYTICS
                API -> Value.API
                APPROVALS -> Value.APPROVALS
                ASSISTS -> Value.ASSISTS
                ASSOCIATIONS -> Value.ASSOCIATIONS
                AUTO_ASSOCIATE_BY_DOMAIN -> Value.AUTO_ASSOCIATE_BY_DOMAIN
                AUTOMATION_JOURNEY -> Value.AUTOMATION_JOURNEY
                AUTOMATION_PLATFORM -> Value.AUTOMATION_PLATFORM
                AVATARS_SERVICE -> Value.AVATARS_SERVICE
                BATCH_UPDATE -> Value.BATCH_UPDATE
                BCC_TO_CRM -> Value.BCC_TO_CRM
                BEHAVIORAL_EVENTS -> Value.BEHAVIORAL_EVENTS
                BET_ASSIGNMENT -> Value.BET_ASSIGNMENT
                BET_CRM_CONNECTOR -> Value.BET_CRM_CONNECTOR
                BIDEN -> Value.BIDEN
                BILLING -> Value.BILLING
                BOT -> Value.BOT
                CALCULATED -> Value.CALCULATED
                CENTRAL_EXCHANGE_RATES -> Value.CENTRAL_EXCHANGE_RATES
                CHATSPOT -> Value.CHATSPOT
                CLONE_OBJECTS -> Value.CLONE_OBJECTS
                COMMUNICATOR -> Value.COMMUNICATOR
                COMPANIES -> Value.COMPANIES
                COMPANY_FAMILIES -> Value.COMPANY_FAMILIES
                COMPANY_INSIGHTS -> Value.COMPANY_INSIGHTS
                CONTACTS -> Value.CONTACTS
                CONTACTS_WEB -> Value.CONTACTS_WEB
                CONTENT_MEMBERSHIP -> Value.CONTENT_MEMBERSHIP
                CONVERSATIONAL_ENRICHMENT -> Value.CONVERSATIONAL_ENRICHMENT
                CONVERSATIONS -> Value.CONVERSATIONS
                CRM_PROCESSES_PLATFORM -> Value.CRM_PROCESSES_PLATFORM
                CRM_UI -> Value.CRM_UI
                CRM_UI_BULK_ACTION -> Value.CRM_UI_BULK_ACTION
                CUSTOMER_AGENT -> Value.CUSTOMER_AGENT
                DATA_ENRICHMENT -> Value.DATA_ENRICHMENT
                DATA_QUALITY -> Value.DATA_QUALITY
                DATASET -> Value.DATASET
                DEALS -> Value.DEALS
                DEFAULT -> Value.DEFAULT
                DELETE_OBJECTS -> Value.DELETE_OBJECTS
                EMAIL -> Value.EMAIL
                EMAIL_INBOX_IMPORT -> Value.EMAIL_INBOX_IMPORT
                EMAIL_INTEGRATION -> Value.EMAIL_INTEGRATION
                ENGAGEMENTS -> Value.ENGAGEMENTS
                EXTENSION -> Value.EXTENSION
                FILE_MANAGER -> Value.FILE_MANAGER
                FLYWHEEL_PRODUCT_DATA_SYNC -> Value.FLYWHEEL_PRODUCT_DATA_SYNC
                FORECASTING -> Value.FORECASTING
                FORM -> Value.FORM
                FORWARD_TO_CRM -> Value.FORWARD_TO_CRM
                GMAIL_INTEGRATION -> Value.GMAIL_INTEGRATION
                GOALS -> Value.GOALS
                HEISENBERG -> Value.HEISENBERG
                HELP_DESK -> Value.HELP_DESK
                HELP_DESK_AI -> Value.HELP_DESK_AI
                IMPORT -> Value.IMPORT
                INTEGRATION -> Value.INTEGRATION
                INTEGRATIONS_PLATFORM -> Value.INTEGRATIONS_PLATFORM
                INTEGRATIONS_SYNC -> Value.INTEGRATIONS_SYNC
                INTENT -> Value.INTENT
                INTERNAL_PROCESSING -> Value.INTERNAL_PROCESSING
                LEADIN -> Value.LEADIN
                LEGAL_BASIS_REMEDIATION -> Value.LEGAL_BASIS_REMEDIATION
                MARKET_SOURCING -> Value.MARKET_SOURCING
                MARKETPLACE -> Value.MARKETPLACE
                MEETINGS -> Value.MEETINGS
                MERGE_COMPANIES -> Value.MERGE_COMPANIES
                MERGE_CONTACTS -> Value.MERGE_CONTACTS
                MERGE_OBJECTS -> Value.MERGE_OBJECTS
                MERGE_REVERT_OBJECTS -> Value.MERGE_REVERT_OBJECTS
                MICROAPPS -> Value.MICROAPPS
                MIGRATION -> Value.MIGRATION
                MOBILE_ANDROID -> Value.MOBILE_ANDROID
                MOBILE_IOS -> Value.MOBILE_IOS
                PAYMENTS -> Value.PAYMENTS
                PIPELINE_SETTINGS -> Value.PIPELINE_SETTINGS
                PLAYBOOKS -> Value.PLAYBOOKS
                PORTAL_OBJECT_SYNC -> Value.PORTAL_OBJECT_SYNC
                PORTAL_USER_ASSOCIATOR -> Value.PORTAL_USER_ASSOCIATOR
                PRESENTATIONS -> Value.PRESENTATIONS
                PRIMARY_AUTOMATION -> Value.PRIMARY_AUTOMATION
                PROPERTY_DEFAULT_VALUE -> Value.PROPERTY_DEFAULT_VALUE
                PROPERTY_RESTORE -> Value.PROPERTY_RESTORE
                PROPERTY_SETTINGS -> Value.PROPERTY_SETTINGS
                PROSPECTING_AGENT -> Value.PROSPECTING_AGENT
                QUOTAS -> Value.QUOTAS
                QUOTES -> Value.QUOTES
                RECYCLING_BIN -> Value.RECYCLING_BIN
                RESTORE_OBJECTS -> Value.RESTORE_OBJECTS
                SALES -> Value.SALES
                SALES_MESSAGES -> Value.SALES_MESSAGES
                SALESFORCE -> Value.SALESFORCE
                SEQUENCES -> Value.SEQUENCES
                SETTINGS -> Value.SETTINGS
                SIDEKICK -> Value.SIDEKICK
                SIGNALS -> Value.SIGNALS
                SLACK_INTEGRATION -> Value.SLACK_INTEGRATION
                SMART_DATA_CAPTURE -> Value.SMART_DATA_CAPTURE
                SOCIAL -> Value.SOCIAL
                SUCCESS -> Value.SUCCESS
                TALLY -> Value.TALLY
                TASK -> Value.TASK
                UNKNOWN -> Value.UNKNOWN
                WAL_INCREMENTAL -> Value.WAL_INCREMENTAL
                WORK_UI -> Value.WORK_UI
                WORKFLOW_CONTACT_DELETE_ACTION -> Value.WORKFLOW_CONTACT_DELETE_ACTION
                WORKFLOWS -> Value.WORKFLOWS
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
                ACADEMY -> Known.ACADEMY
                ACCEPTANCE_TEST -> Known.ACCEPTANCE_TEST
                ACTIVITY_AUTO_ASSOCIATE -> Known.ACTIVITY_AUTO_ASSOCIATE
                ACTIVITY_LOG_REVERT -> Known.ACTIVITY_LOG_REVERT
                ADS -> Known.ADS
                AI_GROUP -> Known.AI_GROUP
                ANALYTICS -> Known.ANALYTICS
                API -> Known.API
                APPROVALS -> Known.APPROVALS
                ASSISTS -> Known.ASSISTS
                ASSOCIATIONS -> Known.ASSOCIATIONS
                AUTO_ASSOCIATE_BY_DOMAIN -> Known.AUTO_ASSOCIATE_BY_DOMAIN
                AUTOMATION_JOURNEY -> Known.AUTOMATION_JOURNEY
                AUTOMATION_PLATFORM -> Known.AUTOMATION_PLATFORM
                AVATARS_SERVICE -> Known.AVATARS_SERVICE
                BATCH_UPDATE -> Known.BATCH_UPDATE
                BCC_TO_CRM -> Known.BCC_TO_CRM
                BEHAVIORAL_EVENTS -> Known.BEHAVIORAL_EVENTS
                BET_ASSIGNMENT -> Known.BET_ASSIGNMENT
                BET_CRM_CONNECTOR -> Known.BET_CRM_CONNECTOR
                BIDEN -> Known.BIDEN
                BILLING -> Known.BILLING
                BOT -> Known.BOT
                CALCULATED -> Known.CALCULATED
                CENTRAL_EXCHANGE_RATES -> Known.CENTRAL_EXCHANGE_RATES
                CHATSPOT -> Known.CHATSPOT
                CLONE_OBJECTS -> Known.CLONE_OBJECTS
                COMMUNICATOR -> Known.COMMUNICATOR
                COMPANIES -> Known.COMPANIES
                COMPANY_FAMILIES -> Known.COMPANY_FAMILIES
                COMPANY_INSIGHTS -> Known.COMPANY_INSIGHTS
                CONTACTS -> Known.CONTACTS
                CONTACTS_WEB -> Known.CONTACTS_WEB
                CONTENT_MEMBERSHIP -> Known.CONTENT_MEMBERSHIP
                CONVERSATIONAL_ENRICHMENT -> Known.CONVERSATIONAL_ENRICHMENT
                CONVERSATIONS -> Known.CONVERSATIONS
                CRM_PROCESSES_PLATFORM -> Known.CRM_PROCESSES_PLATFORM
                CRM_UI -> Known.CRM_UI
                CRM_UI_BULK_ACTION -> Known.CRM_UI_BULK_ACTION
                CUSTOMER_AGENT -> Known.CUSTOMER_AGENT
                DATA_ENRICHMENT -> Known.DATA_ENRICHMENT
                DATA_QUALITY -> Known.DATA_QUALITY
                DATASET -> Known.DATASET
                DEALS -> Known.DEALS
                DEFAULT -> Known.DEFAULT
                DELETE_OBJECTS -> Known.DELETE_OBJECTS
                EMAIL -> Known.EMAIL
                EMAIL_INBOX_IMPORT -> Known.EMAIL_INBOX_IMPORT
                EMAIL_INTEGRATION -> Known.EMAIL_INTEGRATION
                ENGAGEMENTS -> Known.ENGAGEMENTS
                EXTENSION -> Known.EXTENSION
                FILE_MANAGER -> Known.FILE_MANAGER
                FLYWHEEL_PRODUCT_DATA_SYNC -> Known.FLYWHEEL_PRODUCT_DATA_SYNC
                FORECASTING -> Known.FORECASTING
                FORM -> Known.FORM
                FORWARD_TO_CRM -> Known.FORWARD_TO_CRM
                GMAIL_INTEGRATION -> Known.GMAIL_INTEGRATION
                GOALS -> Known.GOALS
                HEISENBERG -> Known.HEISENBERG
                HELP_DESK -> Known.HELP_DESK
                HELP_DESK_AI -> Known.HELP_DESK_AI
                IMPORT -> Known.IMPORT
                INTEGRATION -> Known.INTEGRATION
                INTEGRATIONS_PLATFORM -> Known.INTEGRATIONS_PLATFORM
                INTEGRATIONS_SYNC -> Known.INTEGRATIONS_SYNC
                INTENT -> Known.INTENT
                INTERNAL_PROCESSING -> Known.INTERNAL_PROCESSING
                LEADIN -> Known.LEADIN
                LEGAL_BASIS_REMEDIATION -> Known.LEGAL_BASIS_REMEDIATION
                MARKET_SOURCING -> Known.MARKET_SOURCING
                MARKETPLACE -> Known.MARKETPLACE
                MEETINGS -> Known.MEETINGS
                MERGE_COMPANIES -> Known.MERGE_COMPANIES
                MERGE_CONTACTS -> Known.MERGE_CONTACTS
                MERGE_OBJECTS -> Known.MERGE_OBJECTS
                MERGE_REVERT_OBJECTS -> Known.MERGE_REVERT_OBJECTS
                MICROAPPS -> Known.MICROAPPS
                MIGRATION -> Known.MIGRATION
                MOBILE_ANDROID -> Known.MOBILE_ANDROID
                MOBILE_IOS -> Known.MOBILE_IOS
                PAYMENTS -> Known.PAYMENTS
                PIPELINE_SETTINGS -> Known.PIPELINE_SETTINGS
                PLAYBOOKS -> Known.PLAYBOOKS
                PORTAL_OBJECT_SYNC -> Known.PORTAL_OBJECT_SYNC
                PORTAL_USER_ASSOCIATOR -> Known.PORTAL_USER_ASSOCIATOR
                PRESENTATIONS -> Known.PRESENTATIONS
                PRIMARY_AUTOMATION -> Known.PRIMARY_AUTOMATION
                PROPERTY_DEFAULT_VALUE -> Known.PROPERTY_DEFAULT_VALUE
                PROPERTY_RESTORE -> Known.PROPERTY_RESTORE
                PROPERTY_SETTINGS -> Known.PROPERTY_SETTINGS
                PROSPECTING_AGENT -> Known.PROSPECTING_AGENT
                QUOTAS -> Known.QUOTAS
                QUOTES -> Known.QUOTES
                RECYCLING_BIN -> Known.RECYCLING_BIN
                RESTORE_OBJECTS -> Known.RESTORE_OBJECTS
                SALES -> Known.SALES
                SALES_MESSAGES -> Known.SALES_MESSAGES
                SALESFORCE -> Known.SALESFORCE
                SEQUENCES -> Known.SEQUENCES
                SETTINGS -> Known.SETTINGS
                SIDEKICK -> Known.SIDEKICK
                SIGNALS -> Known.SIGNALS
                SLACK_INTEGRATION -> Known.SLACK_INTEGRATION
                SMART_DATA_CAPTURE -> Known.SMART_DATA_CAPTURE
                SOCIAL -> Known.SOCIAL
                SUCCESS -> Known.SUCCESS
                TALLY -> Known.TALLY
                TASK -> Known.TASK
                UNKNOWN -> Known.UNKNOWN
                WAL_INCREMENTAL -> Known.WAL_INCREMENTAL
                WORK_UI -> Known.WORK_UI
                WORKFLOW_CONTACT_DELETE_ACTION -> Known.WORKFLOW_CONTACT_DELETE_ACTION
                WORKFLOWS -> Known.WORKFLOWS
                else -> throw HubSpotInvalidDataException("Unknown Source: $value")
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

        fun validate(): Source = apply {
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

            return other is Source && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PropertyValue &&
            dataSensitivity == other.dataSensitivity &&
            isEncrypted == other.isEncrypted &&
            isLargeValue == other.isLargeValue &&
            name == other.name &&
            persistenceTimestamp == other.persistenceTimestamp &&
            requestId == other.requestId &&
            selectedByUser == other.selectedByUser &&
            selectedByUserTimestamp == other.selectedByUserTimestamp &&
            source == other.source &&
            sourceId == other.sourceId &&
            sourceLabel == other.sourceLabel &&
            sourceMetadata == other.sourceMetadata &&
            sourceUpstreamDeployable == other.sourceUpstreamDeployable &&
            sourceVid == other.sourceVid &&
            timestamp == other.timestamp &&
            unit == other.unit &&
            updatedByUserId == other.updatedByUserId &&
            useTimestampAsPersistenceTimestamp == other.useTimestampAsPersistenceTimestamp &&
            value == other.value &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            dataSensitivity,
            isEncrypted,
            isLargeValue,
            name,
            persistenceTimestamp,
            requestId,
            selectedByUser,
            selectedByUserTimestamp,
            source,
            sourceId,
            sourceLabel,
            sourceMetadata,
            sourceUpstreamDeployable,
            sourceVid,
            timestamp,
            unit,
            updatedByUserId,
            useTimestampAsPersistenceTimestamp,
            value,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PropertyValue{dataSensitivity=$dataSensitivity, isEncrypted=$isEncrypted, isLargeValue=$isLargeValue, name=$name, persistenceTimestamp=$persistenceTimestamp, requestId=$requestId, selectedByUser=$selectedByUser, selectedByUserTimestamp=$selectedByUserTimestamp, source=$source, sourceId=$sourceId, sourceLabel=$sourceLabel, sourceMetadata=$sourceMetadata, sourceUpstreamDeployable=$sourceUpstreamDeployable, sourceVid=$sourceVid, timestamp=$timestamp, unit=$unit, updatedByUserId=$updatedByUserId, useTimestampAsPersistenceTimestamp=$useTimestampAsPersistenceTimestamp, value=$value, additionalProperties=$additionalProperties}"
}
