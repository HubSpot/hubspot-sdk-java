// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events

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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Represents a single custom property of a marketing event, storing its name, value, metadata (like
 * source, timestamp, and sensitivity), and related audit information for tracking changes.
 */
class PropertyValue
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val name: JsonField<String>,
    private val sourceUpstreamDeployable: JsonField<String>,
    private val value: JsonField<String>,
    private val dataSensitivity: JsonField<DataSensitivity>,
    private val isEncrypted: JsonField<Boolean>,
    private val isLargeValue: JsonField<Boolean>,
    private val persistenceTimestamp: JsonField<Long>,
    private val requestId: JsonField<String>,
    private val selectedByUser: JsonField<Boolean>,
    private val selectedByUserTimestamp: JsonField<Long>,
    private val source: JsonField<Source>,
    private val sourceId: JsonField<String>,
    private val sourceLabel: JsonField<String>,
    private val sourceMetadata: JsonField<String>,
    private val sourceVid: JsonField<List<Long>>,
    private val timestamp: JsonField<Long>,
    private val unit: JsonField<String>,
    private val updatedByUserId: JsonField<Int>,
    private val useTimestampAsPersistenceTimestamp: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceUpstreamDeployable")
        @ExcludeMissing
        sourceUpstreamDeployable: JsonField<String> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataSensitivity")
        @ExcludeMissing
        dataSensitivity: JsonField<DataSensitivity> = JsonMissing.of(),
        @JsonProperty("isEncrypted")
        @ExcludeMissing
        isEncrypted: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isLargeValue")
        @ExcludeMissing
        isLargeValue: JsonField<Boolean> = JsonMissing.of(),
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
    ) : this(
        name,
        sourceUpstreamDeployable,
        value,
        dataSensitivity,
        isEncrypted,
        isLargeValue,
        persistenceTimestamp,
        requestId,
        selectedByUser,
        selectedByUserTimestamp,
        source,
        sourceId,
        sourceLabel,
        sourceMetadata,
        sourceVid,
        timestamp,
        unit,
        updatedByUserId,
        useTimestampAsPersistenceTimestamp,
        mutableMapOf(),
    )

    /**
     * Name of custom property
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sourceUpstreamDeployable(): String =
        sourceUpstreamDeployable.getRequired("sourceUpstreamDeployable")

    /**
     * Custom property value
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun value(): String = value.getRequired("value")

    /**
     * The sensitivity level of the property, such as "non_sensitive", "sensitive", and
     * "highly_sensitive".
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dataSensitivity(): Optional<DataSensitivity> =
        dataSensitivity.getOptional("dataSensitivity")

    /**
     * Whether the property value is encrypted.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isEncrypted(): Optional<Boolean> = isEncrypted.getOptional("isEncrypted")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isLargeValue(): Optional<Boolean> = isLargeValue.getOptional("isLargeValue")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun persistenceTimestamp(): Optional<Long> =
        persistenceTimestamp.getOptional("persistenceTimestamp")

    /**
     * A unique ID associated with this request.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requestId(): Optional<String> = requestId.getOptional("requestId")

    /**
     * Whether the value was selected by a user.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun selectedByUser(): Optional<Boolean> = selectedByUser.getOptional("selectedByUser")

    /**
     * The timestamp when the value was selected by a user, if applicable.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun selectedByUserTimestamp(): Optional<Long> =
        selectedByUserTimestamp.getOptional("selectedByUserTimestamp")

    /**
     * The origin of the property value, such as "IMPORT" or "API".
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun source(): Optional<Source> = source.getOptional("source")

    /**
     * The ID of the property source indicating where it was created.
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
     * Source metadata encoded as a base64 string. For example: `ZXhhbXBsZSBzdHJpbmc=`
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sourceMetadata(): Optional<String> = sourceMetadata.getOptional("sourceMetadata")

    /**
     * The unique identifier associated with the source.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sourceVid(): Optional<List<Long>> = sourceVid.getOptional("sourceVid")

    /**
     * When the value was set, as a 64-bit integer.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timestamp(): Optional<Long> = timestamp.getOptional("timestamp")

    /**
     * The unit of measurement or context for the value.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun unit(): Optional<String> = unit.getOptional("unit")

    /**
     * The ID of the user who updated the property.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedByUserId(): Optional<Int> = updatedByUserId.getOptional("updatedByUserId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun useTimestampAsPersistenceTimestamp(): Optional<Boolean> =
        useTimestampAsPersistenceTimestamp.getOptional("useTimestampAsPersistenceTimestamp")

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
     * Returns the raw JSON value of [value].
     *
     * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
         * .name()
         * .sourceUpstreamDeployable()
         * .value()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PropertyValue]. */
    class Builder internal constructor() {

        private var name: JsonField<String>? = null
        private var sourceUpstreamDeployable: JsonField<String>? = null
        private var value: JsonField<String>? = null
        private var dataSensitivity: JsonField<DataSensitivity> = JsonMissing.of()
        private var isEncrypted: JsonField<Boolean> = JsonMissing.of()
        private var isLargeValue: JsonField<Boolean> = JsonMissing.of()
        private var persistenceTimestamp: JsonField<Long> = JsonMissing.of()
        private var requestId: JsonField<String> = JsonMissing.of()
        private var selectedByUser: JsonField<Boolean> = JsonMissing.of()
        private var selectedByUserTimestamp: JsonField<Long> = JsonMissing.of()
        private var source: JsonField<Source> = JsonMissing.of()
        private var sourceId: JsonField<String> = JsonMissing.of()
        private var sourceLabel: JsonField<String> = JsonMissing.of()
        private var sourceMetadata: JsonField<String> = JsonMissing.of()
        private var sourceVid: JsonField<MutableList<Long>>? = null
        private var timestamp: JsonField<Long> = JsonMissing.of()
        private var unit: JsonField<String> = JsonMissing.of()
        private var updatedByUserId: JsonField<Int> = JsonMissing.of()
        private var useTimestampAsPersistenceTimestamp: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(propertyValue: PropertyValue) = apply {
            name = propertyValue.name
            sourceUpstreamDeployable = propertyValue.sourceUpstreamDeployable
            value = propertyValue.value
            dataSensitivity = propertyValue.dataSensitivity
            isEncrypted = propertyValue.isEncrypted
            isLargeValue = propertyValue.isLargeValue
            persistenceTimestamp = propertyValue.persistenceTimestamp
            requestId = propertyValue.requestId
            selectedByUser = propertyValue.selectedByUser
            selectedByUserTimestamp = propertyValue.selectedByUserTimestamp
            source = propertyValue.source
            sourceId = propertyValue.sourceId
            sourceLabel = propertyValue.sourceLabel
            sourceMetadata = propertyValue.sourceMetadata
            sourceVid = propertyValue.sourceVid.map { it.toMutableList() }
            timestamp = propertyValue.timestamp
            unit = propertyValue.unit
            updatedByUserId = propertyValue.updatedByUserId
            useTimestampAsPersistenceTimestamp = propertyValue.useTimestampAsPersistenceTimestamp
            additionalProperties = propertyValue.additionalProperties.toMutableMap()
        }

        /** Name of custom property */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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

        /** Custom property value */
        fun value(value: String) = value(JsonField.of(value))

        /**
         * Sets [Builder.value] to an arbitrary JSON value.
         *
         * You should usually call [Builder.value] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun value(value: JsonField<String>) = apply { this.value = value }

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

        /** Source metadata encoded as a base64 string. For example: `ZXhhbXBsZSBzdHJpbmc=` */
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
         * .name()
         * .sourceUpstreamDeployable()
         * .value()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PropertyValue =
            PropertyValue(
                checkRequired("name", name),
                checkRequired("sourceUpstreamDeployable", sourceUpstreamDeployable),
                checkRequired("value", value),
                dataSensitivity,
                isEncrypted,
                isLargeValue,
                persistenceTimestamp,
                requestId,
                selectedByUser,
                selectedByUserTimestamp,
                source,
                sourceId,
                sourceLabel,
                sourceMetadata,
                (sourceVid ?: JsonMissing.of()).map { it.toImmutable() },
                timestamp,
                unit,
                updatedByUserId,
                useTimestampAsPersistenceTimestamp,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PropertyValue = apply {
        if (validated) {
            return@apply
        }

        name()
        sourceUpstreamDeployable()
        value()
        dataSensitivity().ifPresent { it.validate() }
        isEncrypted()
        isLargeValue()
        persistenceTimestamp()
        requestId()
        selectedByUser()
        selectedByUserTimestamp()
        source().ifPresent { it.validate() }
        sourceId()
        sourceLabel()
        sourceMetadata()
        sourceVid()
        timestamp()
        unit()
        updatedByUserId()
        useTimestampAsPersistenceTimestamp()
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
        (if (name.asKnown().isPresent) 1 else 0) +
            (if (sourceUpstreamDeployable.asKnown().isPresent) 1 else 0) +
            (if (value.asKnown().isPresent) 1 else 0) +
            (dataSensitivity.asKnown().getOrNull()?.validity() ?: 0) +
            (if (isEncrypted.asKnown().isPresent) 1 else 0) +
            (if (isLargeValue.asKnown().isPresent) 1 else 0) +
            (if (persistenceTimestamp.asKnown().isPresent) 1 else 0) +
            (if (requestId.asKnown().isPresent) 1 else 0) +
            (if (selectedByUser.asKnown().isPresent) 1 else 0) +
            (if (selectedByUserTimestamp.asKnown().isPresent) 1 else 0) +
            (source.asKnown().getOrNull()?.validity() ?: 0) +
            (if (sourceId.asKnown().isPresent) 1 else 0) +
            (if (sourceLabel.asKnown().isPresent) 1 else 0) +
            (if (sourceMetadata.asKnown().isPresent) 1 else 0) +
            (sourceVid.asKnown().getOrNull()?.size ?: 0) +
            (if (timestamp.asKnown().isPresent) 1 else 0) +
            (if (unit.asKnown().isPresent) 1 else 0) +
            (if (updatedByUserId.asKnown().isPresent) 1 else 0) +
            (if (useTimestampAsPersistenceTimestamp.asKnown().isPresent) 1 else 0)

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

            @JvmField val NONE = of("none")

            @JvmField val STANDARD = of("standard")

            @JvmField val HIGH = of("high")

            @JvmStatic fun of(value: String) = DataSensitivity(JsonField.of(value))
        }

        /** An enum containing [DataSensitivity]'s known values. */
        enum class Known {
            NONE,
            STANDARD,
            HIGH,
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
            NONE,
            STANDARD,
            HIGH,
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
                NONE -> Value.NONE
                STANDARD -> Value.STANDARD
                HIGH -> Value.HIGH
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
                NONE -> Known.NONE
                STANDARD -> Known.STANDARD
                HIGH -> Known.HIGH
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

            @JvmField val UNKNOWN = of("UNKNOWN")

            @JvmField val IMPORT = of("IMPORT")

            @JvmField val API = of("API")

            @JvmField val FORM = of("FORM")

            @JvmField val ANALYTICS = of("ANALYTICS")

            @JvmField val MIGRATION = of("MIGRATION")

            @JvmField val SALESFORCE = of("SALESFORCE")

            @JvmField val INTEGRATION = of("INTEGRATION")

            @JvmField val CONTACTS_WEB = of("CONTACTS_WEB")

            @JvmField val WAL_INCREMENTAL = of("WAL_INCREMENTAL")

            @JvmField val TASK = of("TASK")

            @JvmField val EMAIL = of("EMAIL")

            @JvmField val WORKFLOWS = of("WORKFLOWS")

            @JvmField val CALCULATED = of("CALCULATED")

            @JvmField val SOCIAL = of("SOCIAL")

            @JvmField val BATCH_UPDATE = of("BATCH_UPDATE")

            @JvmField val SIGNALS = of("SIGNALS")

            @JvmField val BIDEN = of("BIDEN")

            @JvmField val DEFAULT = of("DEFAULT")

            @JvmField val COMPANIES = of("COMPANIES")

            @JvmField val DEALS = of("DEALS")

            @JvmField val ASSISTS = of("ASSISTS")

            @JvmField val PRESENTATIONS = of("PRESENTATIONS")

            @JvmField val TALLY = of("TALLY")

            @JvmField val SIDEKICK = of("SIDEKICK")

            @JvmField val CRM_UI = of("CRM_UI")

            @JvmField val MERGE_CONTACTS = of("MERGE_CONTACTS")

            @JvmField val PORTAL_USER_ASSOCIATOR = of("PORTAL_USER_ASSOCIATOR")

            @JvmField val INTEGRATIONS_PLATFORM = of("INTEGRATIONS_PLATFORM")

            @JvmField val BCC_TO_CRM = of("BCC_TO_CRM")

            @JvmField val FORWARD_TO_CRM = of("FORWARD_TO_CRM")

            @JvmField val ENGAGEMENTS = of("ENGAGEMENTS")

            @JvmField val SALES = of("SALES")

            @JvmField val HEISENBERG = of("HEISENBERG")

            @JvmField val LEADIN = of("LEADIN")

            @JvmField val GMAIL_INTEGRATION = of("GMAIL_INTEGRATION")

            @JvmField val ACADEMY = of("ACADEMY")

            @JvmField val SALES_MESSAGES = of("SALES_MESSAGES")

            @JvmField val AVATARS_SERVICE = of("AVATARS_SERVICE")

            @JvmField val MERGE_COMPANIES = of("MERGE_COMPANIES")

            @JvmField val SEQUENCES = of("SEQUENCES")

            @JvmField val COMPANY_FAMILIES = of("COMPANY_FAMILIES")

            @JvmField val MOBILE_IOS = of("MOBILE_IOS")

            @JvmField val MOBILE_ANDROID = of("MOBILE_ANDROID")

            @JvmField val CONTACTS = of("CONTACTS")

            @JvmField val ASSOCIATIONS = of("ASSOCIATIONS")

            @JvmField val EXTENSION = of("EXTENSION")

            @JvmField val SUCCESS = of("SUCCESS")

            @JvmField val BOT = of("BOT")

            @JvmField val INTEGRATIONS_SYNC = of("INTEGRATIONS_SYNC")

            @JvmField val AUTOMATION_PLATFORM = of("AUTOMATION_PLATFORM")

            @JvmField val CONVERSATIONS = of("CONVERSATIONS")

            @JvmField val EMAIL_INTEGRATION = of("EMAIL_INTEGRATION")

            @JvmField val CONTENT_MEMBERSHIP = of("CONTENT_MEMBERSHIP")

            @JvmField val QUOTES = of("QUOTES")

            @JvmField val BET_ASSIGNMENT = of("BET_ASSIGNMENT")

            @JvmField val QUOTAS = of("QUOTAS")

            @JvmField val BET_CRM_CONNECTOR = of("BET_CRM_CONNECTOR")

            @JvmField val MEETINGS = of("MEETINGS")

            @JvmField val MERGE_OBJECTS = of("MERGE_OBJECTS")

            @JvmField val RECYCLING_BIN = of("RECYCLING_BIN")

            @JvmField val ADS = of("ADS")

            @JvmField val AI_GROUP = of("AI_GROUP")

            @JvmField val COMMUNICATOR = of("COMMUNICATOR")

            @JvmField val SETTINGS = of("SETTINGS")

            @JvmField val PROPERTY_SETTINGS = of("PROPERTY_SETTINGS")

            @JvmField val PIPELINE_SETTINGS = of("PIPELINE_SETTINGS")

            @JvmField val COMPANY_INSIGHTS = of("COMPANY_INSIGHTS")

            @JvmField val BEHAVIORAL_EVENTS = of("BEHAVIORAL_EVENTS")

            @JvmField val PAYMENTS = of("PAYMENTS")

            @JvmField val GOALS = of("GOALS")

            @JvmField val PORTAL_OBJECT_SYNC = of("PORTAL_OBJECT_SYNC")

            @JvmField val APPROVALS = of("APPROVALS")

            @JvmField val FILE_MANAGER = of("FILE_MANAGER")

            @JvmField val MARKETPLACE = of("MARKETPLACE")

            @JvmField val INTERNAL_PROCESSING = of("INTERNAL_PROCESSING")

            @JvmField val FORECASTING = of("FORECASTING")

            @JvmField val SLACK_INTEGRATION = of("SLACK_INTEGRATION")

            @JvmField val CRM_UI_BULK_ACTION = of("CRM_UI_BULK_ACTION")

            @JvmField val WORKFLOW_CONTACT_DELETE_ACTION = of("WORKFLOW_CONTACT_DELETE_ACTION")

            @JvmField val ACCEPTANCE_TEST = of("ACCEPTANCE_TEST")

            @JvmField val PLAYBOOKS = of("PLAYBOOKS")

            @JvmField val CHATSPOT = of("CHATSPOT")

            @JvmField val FLYWHEEL_PRODUCT_DATA_SYNC = of("FLYWHEEL_PRODUCT_DATA_SYNC")

            @JvmField val HELP_DESK = of("HELP_DESK")

            @JvmField val BILLING = of("BILLING")

            @JvmField val DATA_ENRICHMENT = of("DATA_ENRICHMENT")

            @JvmField val AUTOMATION_JOURNEY = of("AUTOMATION_JOURNEY")

            @JvmField val MICROAPPS = of("MICROAPPS")

            @JvmField val INTENT = of("INTENT")

            @JvmField val PROSPECTING_AGENT = of("PROSPECTING_AGENT")

            @JvmField val CENTRAL_EXCHANGE_RATES = of("CENTRAL_EXCHANGE_RATES")

            @JvmField val HELP_DESK_AI = of("HELP_DESK_AI")

            @JvmField val CONVERSATIONAL_ENRICHMENT = of("CONVERSATIONAL_ENRICHMENT")

            @JvmField val CRM_PROCESSES_PLATFORM = of("CRM_PROCESSES_PLATFORM")

            @JvmField val CLONE_OBJECTS = of("CLONE_OBJECTS")

            @JvmField val MARKET_SOURCING = of("MARKET_SOURCING")

            @JvmField val DATASET = of("DATASET")

            @JvmField val PROPERTY_RESTORE = of("PROPERTY_RESTORE")

            @JvmStatic fun of(value: String) = Source(JsonField.of(value))
        }

        /** An enum containing [Source]'s known values. */
        enum class Known {
            UNKNOWN,
            IMPORT,
            API,
            FORM,
            ANALYTICS,
            MIGRATION,
            SALESFORCE,
            INTEGRATION,
            CONTACTS_WEB,
            WAL_INCREMENTAL,
            TASK,
            EMAIL,
            WORKFLOWS,
            CALCULATED,
            SOCIAL,
            BATCH_UPDATE,
            SIGNALS,
            BIDEN,
            DEFAULT,
            COMPANIES,
            DEALS,
            ASSISTS,
            PRESENTATIONS,
            TALLY,
            SIDEKICK,
            CRM_UI,
            MERGE_CONTACTS,
            PORTAL_USER_ASSOCIATOR,
            INTEGRATIONS_PLATFORM,
            BCC_TO_CRM,
            FORWARD_TO_CRM,
            ENGAGEMENTS,
            SALES,
            HEISENBERG,
            LEADIN,
            GMAIL_INTEGRATION,
            ACADEMY,
            SALES_MESSAGES,
            AVATARS_SERVICE,
            MERGE_COMPANIES,
            SEQUENCES,
            COMPANY_FAMILIES,
            MOBILE_IOS,
            MOBILE_ANDROID,
            CONTACTS,
            ASSOCIATIONS,
            EXTENSION,
            SUCCESS,
            BOT,
            INTEGRATIONS_SYNC,
            AUTOMATION_PLATFORM,
            CONVERSATIONS,
            EMAIL_INTEGRATION,
            CONTENT_MEMBERSHIP,
            QUOTES,
            BET_ASSIGNMENT,
            QUOTAS,
            BET_CRM_CONNECTOR,
            MEETINGS,
            MERGE_OBJECTS,
            RECYCLING_BIN,
            ADS,
            AI_GROUP,
            COMMUNICATOR,
            SETTINGS,
            PROPERTY_SETTINGS,
            PIPELINE_SETTINGS,
            COMPANY_INSIGHTS,
            BEHAVIORAL_EVENTS,
            PAYMENTS,
            GOALS,
            PORTAL_OBJECT_SYNC,
            APPROVALS,
            FILE_MANAGER,
            MARKETPLACE,
            INTERNAL_PROCESSING,
            FORECASTING,
            SLACK_INTEGRATION,
            CRM_UI_BULK_ACTION,
            WORKFLOW_CONTACT_DELETE_ACTION,
            ACCEPTANCE_TEST,
            PLAYBOOKS,
            CHATSPOT,
            FLYWHEEL_PRODUCT_DATA_SYNC,
            HELP_DESK,
            BILLING,
            DATA_ENRICHMENT,
            AUTOMATION_JOURNEY,
            MICROAPPS,
            INTENT,
            PROSPECTING_AGENT,
            CENTRAL_EXCHANGE_RATES,
            HELP_DESK_AI,
            CONVERSATIONAL_ENRICHMENT,
            CRM_PROCESSES_PLATFORM,
            CLONE_OBJECTS,
            MARKET_SOURCING,
            DATASET,
            PROPERTY_RESTORE,
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
            UNKNOWN,
            IMPORT,
            API,
            FORM,
            ANALYTICS,
            MIGRATION,
            SALESFORCE,
            INTEGRATION,
            CONTACTS_WEB,
            WAL_INCREMENTAL,
            TASK,
            EMAIL,
            WORKFLOWS,
            CALCULATED,
            SOCIAL,
            BATCH_UPDATE,
            SIGNALS,
            BIDEN,
            DEFAULT,
            COMPANIES,
            DEALS,
            ASSISTS,
            PRESENTATIONS,
            TALLY,
            SIDEKICK,
            CRM_UI,
            MERGE_CONTACTS,
            PORTAL_USER_ASSOCIATOR,
            INTEGRATIONS_PLATFORM,
            BCC_TO_CRM,
            FORWARD_TO_CRM,
            ENGAGEMENTS,
            SALES,
            HEISENBERG,
            LEADIN,
            GMAIL_INTEGRATION,
            ACADEMY,
            SALES_MESSAGES,
            AVATARS_SERVICE,
            MERGE_COMPANIES,
            SEQUENCES,
            COMPANY_FAMILIES,
            MOBILE_IOS,
            MOBILE_ANDROID,
            CONTACTS,
            ASSOCIATIONS,
            EXTENSION,
            SUCCESS,
            BOT,
            INTEGRATIONS_SYNC,
            AUTOMATION_PLATFORM,
            CONVERSATIONS,
            EMAIL_INTEGRATION,
            CONTENT_MEMBERSHIP,
            QUOTES,
            BET_ASSIGNMENT,
            QUOTAS,
            BET_CRM_CONNECTOR,
            MEETINGS,
            MERGE_OBJECTS,
            RECYCLING_BIN,
            ADS,
            AI_GROUP,
            COMMUNICATOR,
            SETTINGS,
            PROPERTY_SETTINGS,
            PIPELINE_SETTINGS,
            COMPANY_INSIGHTS,
            BEHAVIORAL_EVENTS,
            PAYMENTS,
            GOALS,
            PORTAL_OBJECT_SYNC,
            APPROVALS,
            FILE_MANAGER,
            MARKETPLACE,
            INTERNAL_PROCESSING,
            FORECASTING,
            SLACK_INTEGRATION,
            CRM_UI_BULK_ACTION,
            WORKFLOW_CONTACT_DELETE_ACTION,
            ACCEPTANCE_TEST,
            PLAYBOOKS,
            CHATSPOT,
            FLYWHEEL_PRODUCT_DATA_SYNC,
            HELP_DESK,
            BILLING,
            DATA_ENRICHMENT,
            AUTOMATION_JOURNEY,
            MICROAPPS,
            INTENT,
            PROSPECTING_AGENT,
            CENTRAL_EXCHANGE_RATES,
            HELP_DESK_AI,
            CONVERSATIONAL_ENRICHMENT,
            CRM_PROCESSES_PLATFORM,
            CLONE_OBJECTS,
            MARKET_SOURCING,
            DATASET,
            PROPERTY_RESTORE,
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
                UNKNOWN -> Value.UNKNOWN
                IMPORT -> Value.IMPORT
                API -> Value.API
                FORM -> Value.FORM
                ANALYTICS -> Value.ANALYTICS
                MIGRATION -> Value.MIGRATION
                SALESFORCE -> Value.SALESFORCE
                INTEGRATION -> Value.INTEGRATION
                CONTACTS_WEB -> Value.CONTACTS_WEB
                WAL_INCREMENTAL -> Value.WAL_INCREMENTAL
                TASK -> Value.TASK
                EMAIL -> Value.EMAIL
                WORKFLOWS -> Value.WORKFLOWS
                CALCULATED -> Value.CALCULATED
                SOCIAL -> Value.SOCIAL
                BATCH_UPDATE -> Value.BATCH_UPDATE
                SIGNALS -> Value.SIGNALS
                BIDEN -> Value.BIDEN
                DEFAULT -> Value.DEFAULT
                COMPANIES -> Value.COMPANIES
                DEALS -> Value.DEALS
                ASSISTS -> Value.ASSISTS
                PRESENTATIONS -> Value.PRESENTATIONS
                TALLY -> Value.TALLY
                SIDEKICK -> Value.SIDEKICK
                CRM_UI -> Value.CRM_UI
                MERGE_CONTACTS -> Value.MERGE_CONTACTS
                PORTAL_USER_ASSOCIATOR -> Value.PORTAL_USER_ASSOCIATOR
                INTEGRATIONS_PLATFORM -> Value.INTEGRATIONS_PLATFORM
                BCC_TO_CRM -> Value.BCC_TO_CRM
                FORWARD_TO_CRM -> Value.FORWARD_TO_CRM
                ENGAGEMENTS -> Value.ENGAGEMENTS
                SALES -> Value.SALES
                HEISENBERG -> Value.HEISENBERG
                LEADIN -> Value.LEADIN
                GMAIL_INTEGRATION -> Value.GMAIL_INTEGRATION
                ACADEMY -> Value.ACADEMY
                SALES_MESSAGES -> Value.SALES_MESSAGES
                AVATARS_SERVICE -> Value.AVATARS_SERVICE
                MERGE_COMPANIES -> Value.MERGE_COMPANIES
                SEQUENCES -> Value.SEQUENCES
                COMPANY_FAMILIES -> Value.COMPANY_FAMILIES
                MOBILE_IOS -> Value.MOBILE_IOS
                MOBILE_ANDROID -> Value.MOBILE_ANDROID
                CONTACTS -> Value.CONTACTS
                ASSOCIATIONS -> Value.ASSOCIATIONS
                EXTENSION -> Value.EXTENSION
                SUCCESS -> Value.SUCCESS
                BOT -> Value.BOT
                INTEGRATIONS_SYNC -> Value.INTEGRATIONS_SYNC
                AUTOMATION_PLATFORM -> Value.AUTOMATION_PLATFORM
                CONVERSATIONS -> Value.CONVERSATIONS
                EMAIL_INTEGRATION -> Value.EMAIL_INTEGRATION
                CONTENT_MEMBERSHIP -> Value.CONTENT_MEMBERSHIP
                QUOTES -> Value.QUOTES
                BET_ASSIGNMENT -> Value.BET_ASSIGNMENT
                QUOTAS -> Value.QUOTAS
                BET_CRM_CONNECTOR -> Value.BET_CRM_CONNECTOR
                MEETINGS -> Value.MEETINGS
                MERGE_OBJECTS -> Value.MERGE_OBJECTS
                RECYCLING_BIN -> Value.RECYCLING_BIN
                ADS -> Value.ADS
                AI_GROUP -> Value.AI_GROUP
                COMMUNICATOR -> Value.COMMUNICATOR
                SETTINGS -> Value.SETTINGS
                PROPERTY_SETTINGS -> Value.PROPERTY_SETTINGS
                PIPELINE_SETTINGS -> Value.PIPELINE_SETTINGS
                COMPANY_INSIGHTS -> Value.COMPANY_INSIGHTS
                BEHAVIORAL_EVENTS -> Value.BEHAVIORAL_EVENTS
                PAYMENTS -> Value.PAYMENTS
                GOALS -> Value.GOALS
                PORTAL_OBJECT_SYNC -> Value.PORTAL_OBJECT_SYNC
                APPROVALS -> Value.APPROVALS
                FILE_MANAGER -> Value.FILE_MANAGER
                MARKETPLACE -> Value.MARKETPLACE
                INTERNAL_PROCESSING -> Value.INTERNAL_PROCESSING
                FORECASTING -> Value.FORECASTING
                SLACK_INTEGRATION -> Value.SLACK_INTEGRATION
                CRM_UI_BULK_ACTION -> Value.CRM_UI_BULK_ACTION
                WORKFLOW_CONTACT_DELETE_ACTION -> Value.WORKFLOW_CONTACT_DELETE_ACTION
                ACCEPTANCE_TEST -> Value.ACCEPTANCE_TEST
                PLAYBOOKS -> Value.PLAYBOOKS
                CHATSPOT -> Value.CHATSPOT
                FLYWHEEL_PRODUCT_DATA_SYNC -> Value.FLYWHEEL_PRODUCT_DATA_SYNC
                HELP_DESK -> Value.HELP_DESK
                BILLING -> Value.BILLING
                DATA_ENRICHMENT -> Value.DATA_ENRICHMENT
                AUTOMATION_JOURNEY -> Value.AUTOMATION_JOURNEY
                MICROAPPS -> Value.MICROAPPS
                INTENT -> Value.INTENT
                PROSPECTING_AGENT -> Value.PROSPECTING_AGENT
                CENTRAL_EXCHANGE_RATES -> Value.CENTRAL_EXCHANGE_RATES
                HELP_DESK_AI -> Value.HELP_DESK_AI
                CONVERSATIONAL_ENRICHMENT -> Value.CONVERSATIONAL_ENRICHMENT
                CRM_PROCESSES_PLATFORM -> Value.CRM_PROCESSES_PLATFORM
                CLONE_OBJECTS -> Value.CLONE_OBJECTS
                MARKET_SOURCING -> Value.MARKET_SOURCING
                DATASET -> Value.DATASET
                PROPERTY_RESTORE -> Value.PROPERTY_RESTORE
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
                UNKNOWN -> Known.UNKNOWN
                IMPORT -> Known.IMPORT
                API -> Known.API
                FORM -> Known.FORM
                ANALYTICS -> Known.ANALYTICS
                MIGRATION -> Known.MIGRATION
                SALESFORCE -> Known.SALESFORCE
                INTEGRATION -> Known.INTEGRATION
                CONTACTS_WEB -> Known.CONTACTS_WEB
                WAL_INCREMENTAL -> Known.WAL_INCREMENTAL
                TASK -> Known.TASK
                EMAIL -> Known.EMAIL
                WORKFLOWS -> Known.WORKFLOWS
                CALCULATED -> Known.CALCULATED
                SOCIAL -> Known.SOCIAL
                BATCH_UPDATE -> Known.BATCH_UPDATE
                SIGNALS -> Known.SIGNALS
                BIDEN -> Known.BIDEN
                DEFAULT -> Known.DEFAULT
                COMPANIES -> Known.COMPANIES
                DEALS -> Known.DEALS
                ASSISTS -> Known.ASSISTS
                PRESENTATIONS -> Known.PRESENTATIONS
                TALLY -> Known.TALLY
                SIDEKICK -> Known.SIDEKICK
                CRM_UI -> Known.CRM_UI
                MERGE_CONTACTS -> Known.MERGE_CONTACTS
                PORTAL_USER_ASSOCIATOR -> Known.PORTAL_USER_ASSOCIATOR
                INTEGRATIONS_PLATFORM -> Known.INTEGRATIONS_PLATFORM
                BCC_TO_CRM -> Known.BCC_TO_CRM
                FORWARD_TO_CRM -> Known.FORWARD_TO_CRM
                ENGAGEMENTS -> Known.ENGAGEMENTS
                SALES -> Known.SALES
                HEISENBERG -> Known.HEISENBERG
                LEADIN -> Known.LEADIN
                GMAIL_INTEGRATION -> Known.GMAIL_INTEGRATION
                ACADEMY -> Known.ACADEMY
                SALES_MESSAGES -> Known.SALES_MESSAGES
                AVATARS_SERVICE -> Known.AVATARS_SERVICE
                MERGE_COMPANIES -> Known.MERGE_COMPANIES
                SEQUENCES -> Known.SEQUENCES
                COMPANY_FAMILIES -> Known.COMPANY_FAMILIES
                MOBILE_IOS -> Known.MOBILE_IOS
                MOBILE_ANDROID -> Known.MOBILE_ANDROID
                CONTACTS -> Known.CONTACTS
                ASSOCIATIONS -> Known.ASSOCIATIONS
                EXTENSION -> Known.EXTENSION
                SUCCESS -> Known.SUCCESS
                BOT -> Known.BOT
                INTEGRATIONS_SYNC -> Known.INTEGRATIONS_SYNC
                AUTOMATION_PLATFORM -> Known.AUTOMATION_PLATFORM
                CONVERSATIONS -> Known.CONVERSATIONS
                EMAIL_INTEGRATION -> Known.EMAIL_INTEGRATION
                CONTENT_MEMBERSHIP -> Known.CONTENT_MEMBERSHIP
                QUOTES -> Known.QUOTES
                BET_ASSIGNMENT -> Known.BET_ASSIGNMENT
                QUOTAS -> Known.QUOTAS
                BET_CRM_CONNECTOR -> Known.BET_CRM_CONNECTOR
                MEETINGS -> Known.MEETINGS
                MERGE_OBJECTS -> Known.MERGE_OBJECTS
                RECYCLING_BIN -> Known.RECYCLING_BIN
                ADS -> Known.ADS
                AI_GROUP -> Known.AI_GROUP
                COMMUNICATOR -> Known.COMMUNICATOR
                SETTINGS -> Known.SETTINGS
                PROPERTY_SETTINGS -> Known.PROPERTY_SETTINGS
                PIPELINE_SETTINGS -> Known.PIPELINE_SETTINGS
                COMPANY_INSIGHTS -> Known.COMPANY_INSIGHTS
                BEHAVIORAL_EVENTS -> Known.BEHAVIORAL_EVENTS
                PAYMENTS -> Known.PAYMENTS
                GOALS -> Known.GOALS
                PORTAL_OBJECT_SYNC -> Known.PORTAL_OBJECT_SYNC
                APPROVALS -> Known.APPROVALS
                FILE_MANAGER -> Known.FILE_MANAGER
                MARKETPLACE -> Known.MARKETPLACE
                INTERNAL_PROCESSING -> Known.INTERNAL_PROCESSING
                FORECASTING -> Known.FORECASTING
                SLACK_INTEGRATION -> Known.SLACK_INTEGRATION
                CRM_UI_BULK_ACTION -> Known.CRM_UI_BULK_ACTION
                WORKFLOW_CONTACT_DELETE_ACTION -> Known.WORKFLOW_CONTACT_DELETE_ACTION
                ACCEPTANCE_TEST -> Known.ACCEPTANCE_TEST
                PLAYBOOKS -> Known.PLAYBOOKS
                CHATSPOT -> Known.CHATSPOT
                FLYWHEEL_PRODUCT_DATA_SYNC -> Known.FLYWHEEL_PRODUCT_DATA_SYNC
                HELP_DESK -> Known.HELP_DESK
                BILLING -> Known.BILLING
                DATA_ENRICHMENT -> Known.DATA_ENRICHMENT
                AUTOMATION_JOURNEY -> Known.AUTOMATION_JOURNEY
                MICROAPPS -> Known.MICROAPPS
                INTENT -> Known.INTENT
                PROSPECTING_AGENT -> Known.PROSPECTING_AGENT
                CENTRAL_EXCHANGE_RATES -> Known.CENTRAL_EXCHANGE_RATES
                HELP_DESK_AI -> Known.HELP_DESK_AI
                CONVERSATIONAL_ENRICHMENT -> Known.CONVERSATIONAL_ENRICHMENT
                CRM_PROCESSES_PLATFORM -> Known.CRM_PROCESSES_PLATFORM
                CLONE_OBJECTS -> Known.CLONE_OBJECTS
                MARKET_SOURCING -> Known.MARKET_SOURCING
                DATASET -> Known.DATASET
                PROPERTY_RESTORE -> Known.PROPERTY_RESTORE
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
            name == other.name &&
            sourceUpstreamDeployable == other.sourceUpstreamDeployable &&
            value == other.value &&
            dataSensitivity == other.dataSensitivity &&
            isEncrypted == other.isEncrypted &&
            isLargeValue == other.isLargeValue &&
            persistenceTimestamp == other.persistenceTimestamp &&
            requestId == other.requestId &&
            selectedByUser == other.selectedByUser &&
            selectedByUserTimestamp == other.selectedByUserTimestamp &&
            source == other.source &&
            sourceId == other.sourceId &&
            sourceLabel == other.sourceLabel &&
            sourceMetadata == other.sourceMetadata &&
            sourceVid == other.sourceVid &&
            timestamp == other.timestamp &&
            unit == other.unit &&
            updatedByUserId == other.updatedByUserId &&
            useTimestampAsPersistenceTimestamp == other.useTimestampAsPersistenceTimestamp &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            name,
            sourceUpstreamDeployable,
            value,
            dataSensitivity,
            isEncrypted,
            isLargeValue,
            persistenceTimestamp,
            requestId,
            selectedByUser,
            selectedByUserTimestamp,
            source,
            sourceId,
            sourceLabel,
            sourceMetadata,
            sourceVid,
            timestamp,
            unit,
            updatedByUserId,
            useTimestampAsPersistenceTimestamp,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PropertyValue{name=$name, sourceUpstreamDeployable=$sourceUpstreamDeployable, value=$value, dataSensitivity=$dataSensitivity, isEncrypted=$isEncrypted, isLargeValue=$isLargeValue, persistenceTimestamp=$persistenceTimestamp, requestId=$requestId, selectedByUser=$selectedByUser, selectedByUserTimestamp=$selectedByUserTimestamp, source=$source, sourceId=$sourceId, sourceLabel=$sourceLabel, sourceMetadata=$sourceMetadata, sourceVid=$sourceVid, timestamp=$timestamp, unit=$unit, updatedByUserId=$updatedByUserId, useTimestampAsPersistenceTimestamp=$useTimestampAsPersistenceTimestamp, additionalProperties=$additionalProperties}"
}
