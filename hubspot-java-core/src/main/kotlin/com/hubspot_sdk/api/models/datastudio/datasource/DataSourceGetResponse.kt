// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.datastudio.datasource

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
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class DataSourceGetResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val columns: JsonField<List<FileColumn>>,
    private val createdAt: JsonField<String>,
    private val datasourceId: JsonField<Long>,
    private val datasourceName: JsonField<String>,
    private val datasourceType: JsonField<DatasourceType>,
    private val lastIngestionStatus: JsonField<LastIngestionStatus>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("columns")
        @ExcludeMissing
        columns: JsonField<List<FileColumn>> = JsonMissing.of(),
        @JsonProperty("createdAt") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("datasourceId")
        @ExcludeMissing
        datasourceId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("datasourceName")
        @ExcludeMissing
        datasourceName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("datasourceType")
        @ExcludeMissing
        datasourceType: JsonField<DatasourceType> = JsonMissing.of(),
        @JsonProperty("lastIngestionStatus")
        @ExcludeMissing
        lastIngestionStatus: JsonField<LastIngestionStatus> = JsonMissing.of(),
    ) : this(
        columns,
        createdAt,
        datasourceId,
        datasourceName,
        datasourceType,
        lastIngestionStatus,
        mutableMapOf(),
    )

    /**
     * An array of FileColumn objects representing the columns in the data source.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun columns(): List<FileColumn> = columns.getRequired("columns")

    /**
     * The creation date and time of the data source, represented as a string.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): String = createdAt.getRequired("createdAt")

    /**
     * The unique identifier for the data source, represented as a 64-bit integer.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun datasourceId(): Long = datasourceId.getRequired("datasourceId")

    /**
     * The name of the data source, represented as a string.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun datasourceName(): String = datasourceName.getRequired("datasourceName")

    /**
     * The type of the data source, which is a string with a valid value of 'FILE'.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun datasourceType(): DatasourceType = datasourceType.getRequired("datasourceType")

    /**
     * The status of the last data ingestion process, represented as a string. Valid values include
     * 'SUCCESSFUL', 'IN_PROGRESS', and 'FAILED'.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lastIngestionStatus(): LastIngestionStatus =
        lastIngestionStatus.getRequired("lastIngestionStatus")

    /**
     * Returns the raw JSON value of [columns].
     *
     * Unlike [columns], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("columns") @ExcludeMissing fun _columns(): JsonField<List<FileColumn>> = columns

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

    /**
     * Returns the raw JSON value of [datasourceId].
     *
     * Unlike [datasourceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("datasourceId")
    @ExcludeMissing
    fun _datasourceId(): JsonField<Long> = datasourceId

    /**
     * Returns the raw JSON value of [datasourceName].
     *
     * Unlike [datasourceName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("datasourceName")
    @ExcludeMissing
    fun _datasourceName(): JsonField<String> = datasourceName

    /**
     * Returns the raw JSON value of [datasourceType].
     *
     * Unlike [datasourceType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("datasourceType")
    @ExcludeMissing
    fun _datasourceType(): JsonField<DatasourceType> = datasourceType

    /**
     * Returns the raw JSON value of [lastIngestionStatus].
     *
     * Unlike [lastIngestionStatus], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("lastIngestionStatus")
    @ExcludeMissing
    fun _lastIngestionStatus(): JsonField<LastIngestionStatus> = lastIngestionStatus

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
         * Returns a mutable builder for constructing an instance of [DataSourceGetResponse].
         *
         * The following fields are required:
         * ```java
         * .columns()
         * .createdAt()
         * .datasourceId()
         * .datasourceName()
         * .datasourceType()
         * .lastIngestionStatus()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DataSourceGetResponse]. */
    class Builder internal constructor() {

        private var columns: JsonField<MutableList<FileColumn>>? = null
        private var createdAt: JsonField<String>? = null
        private var datasourceId: JsonField<Long>? = null
        private var datasourceName: JsonField<String>? = null
        private var datasourceType: JsonField<DatasourceType>? = null
        private var lastIngestionStatus: JsonField<LastIngestionStatus>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(dataSourceGetResponse: DataSourceGetResponse) = apply {
            columns = dataSourceGetResponse.columns.map { it.toMutableList() }
            createdAt = dataSourceGetResponse.createdAt
            datasourceId = dataSourceGetResponse.datasourceId
            datasourceName = dataSourceGetResponse.datasourceName
            datasourceType = dataSourceGetResponse.datasourceType
            lastIngestionStatus = dataSourceGetResponse.lastIngestionStatus
            additionalProperties = dataSourceGetResponse.additionalProperties.toMutableMap()
        }

        /** An array of FileColumn objects representing the columns in the data source. */
        fun columns(columns: List<FileColumn>) = columns(JsonField.of(columns))

        /**
         * Sets [Builder.columns] to an arbitrary JSON value.
         *
         * You should usually call [Builder.columns] with a well-typed `List<FileColumn>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun columns(columns: JsonField<List<FileColumn>>) = apply {
            this.columns = columns.map { it.toMutableList() }
        }

        /**
         * Adds a single [FileColumn] to [columns].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addColumn(column: FileColumn) = apply {
            columns =
                (columns ?: JsonField.of(mutableListOf())).also {
                    checkKnown("columns", it).add(column)
                }
        }

        /** The creation date and time of the data source, represented as a string. */
        fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

        /** The unique identifier for the data source, represented as a 64-bit integer. */
        fun datasourceId(datasourceId: Long) = datasourceId(JsonField.of(datasourceId))

        /**
         * Sets [Builder.datasourceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.datasourceId] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun datasourceId(datasourceId: JsonField<Long>) = apply { this.datasourceId = datasourceId }

        /** The name of the data source, represented as a string. */
        fun datasourceName(datasourceName: String) = datasourceName(JsonField.of(datasourceName))

        /**
         * Sets [Builder.datasourceName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.datasourceName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun datasourceName(datasourceName: JsonField<String>) = apply {
            this.datasourceName = datasourceName
        }

        /** The type of the data source, which is a string with a valid value of 'FILE'. */
        fun datasourceType(datasourceType: DatasourceType) =
            datasourceType(JsonField.of(datasourceType))

        /**
         * Sets [Builder.datasourceType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.datasourceType] with a well-typed [DatasourceType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun datasourceType(datasourceType: JsonField<DatasourceType>) = apply {
            this.datasourceType = datasourceType
        }

        /**
         * The status of the last data ingestion process, represented as a string. Valid values
         * include 'SUCCESSFUL', 'IN_PROGRESS', and 'FAILED'.
         */
        fun lastIngestionStatus(lastIngestionStatus: LastIngestionStatus) =
            lastIngestionStatus(JsonField.of(lastIngestionStatus))

        /**
         * Sets [Builder.lastIngestionStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastIngestionStatus] with a well-typed
         * [LastIngestionStatus] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun lastIngestionStatus(lastIngestionStatus: JsonField<LastIngestionStatus>) = apply {
            this.lastIngestionStatus = lastIngestionStatus
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
         * Returns an immutable instance of [DataSourceGetResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .columns()
         * .createdAt()
         * .datasourceId()
         * .datasourceName()
         * .datasourceType()
         * .lastIngestionStatus()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DataSourceGetResponse =
            DataSourceGetResponse(
                checkRequired("columns", columns).map { it.toImmutable() },
                checkRequired("createdAt", createdAt),
                checkRequired("datasourceId", datasourceId),
                checkRequired("datasourceName", datasourceName),
                checkRequired("datasourceType", datasourceType),
                checkRequired("lastIngestionStatus", lastIngestionStatus),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DataSourceGetResponse = apply {
        if (validated) {
            return@apply
        }

        columns().forEach { it.validate() }
        createdAt()
        datasourceId()
        datasourceName()
        datasourceType().validate()
        lastIngestionStatus().validate()
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
        (columns.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (datasourceId.asKnown().isPresent) 1 else 0) +
            (if (datasourceName.asKnown().isPresent) 1 else 0) +
            (datasourceType.asKnown().getOrNull()?.validity() ?: 0) +
            (lastIngestionStatus.asKnown().getOrNull()?.validity() ?: 0)

    /** The type of the data source, which is a string with a valid value of 'FILE'. */
    class DatasourceType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val FILE = of("FILE")

            @JvmStatic fun of(value: String) = DatasourceType(JsonField.of(value))
        }

        /** An enum containing [DatasourceType]'s known values. */
        enum class Known {
            FILE
        }

        /**
         * An enum containing [DatasourceType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DatasourceType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FILE,
            /**
             * An enum member indicating that [DatasourceType] was instantiated with an unknown
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
                FILE -> Known.FILE
                else -> throw HubspotInvalidDataException("Unknown DatasourceType: $value")
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

        fun validate(): DatasourceType = apply {
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

            return other is DatasourceType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The status of the last data ingestion process, represented as a string. Valid values include
     * 'SUCCESSFUL', 'IN_PROGRESS', and 'FAILED'.
     */
    class LastIngestionStatus
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val FAILED = of("FAILED")

            @JvmField val IN_PROGRESS = of("IN_PROGRESS")

            @JvmField val SUCCESSFUL = of("SUCCESSFUL")

            @JvmStatic fun of(value: String) = LastIngestionStatus(JsonField.of(value))
        }

        /** An enum containing [LastIngestionStatus]'s known values. */
        enum class Known {
            FAILED,
            IN_PROGRESS,
            SUCCESSFUL,
        }

        /**
         * An enum containing [LastIngestionStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [LastIngestionStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FAILED,
            IN_PROGRESS,
            SUCCESSFUL,
            /**
             * An enum member indicating that [LastIngestionStatus] was instantiated with an unknown
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
                FAILED -> Value.FAILED
                IN_PROGRESS -> Value.IN_PROGRESS
                SUCCESSFUL -> Value.SUCCESSFUL
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
                FAILED -> Known.FAILED
                IN_PROGRESS -> Known.IN_PROGRESS
                SUCCESSFUL -> Known.SUCCESSFUL
                else -> throw HubspotInvalidDataException("Unknown LastIngestionStatus: $value")
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

        fun validate(): LastIngestionStatus = apply {
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

            return other is LastIngestionStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DataSourceGetResponse &&
            columns == other.columns &&
            createdAt == other.createdAt &&
            datasourceId == other.datasourceId &&
            datasourceName == other.datasourceName &&
            datasourceType == other.datasourceType &&
            lastIngestionStatus == other.lastIngestionStatus &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            columns,
            createdAt,
            datasourceId,
            datasourceName,
            datasourceType,
            lastIngestionStatus,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DataSourceGetResponse{columns=$columns, createdAt=$createdAt, datasourceId=$datasourceId, datasourceName=$datasourceName, datasourceType=$datasourceType, lastIngestionStatus=$lastIngestionStatus, additionalProperties=$additionalProperties}"
}
