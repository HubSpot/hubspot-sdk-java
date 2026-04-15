// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.exports

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.Enum
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkKnown
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.toImmutable
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicExportResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val exportState: JsonField<ExportState>,
    private val exportType: JsonField<ExportType>,
    private val objectProperties: JsonField<List<String>>,
    private val objectType: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val exportName: JsonField<String>,
    private val recordCount: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("exportState")
        @ExcludeMissing
        exportState: JsonField<ExportState> = JsonMissing.of(),
        @JsonProperty("exportType")
        @ExcludeMissing
        exportType: JsonField<ExportType> = JsonMissing.of(),
        @JsonProperty("objectProperties")
        @ExcludeMissing
        objectProperties: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("objectType")
        @ExcludeMissing
        objectType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("exportName")
        @ExcludeMissing
        exportName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recordCount") @ExcludeMissing recordCount: JsonField<Int> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        exportState,
        exportType,
        objectProperties,
        objectType,
        updatedAt,
        exportName,
        recordCount,
        mutableMapOf(),
    )

    /**
     * The unique ID of the export.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The timestamp when the export was created, in ISO 8601 format.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * The current state of the export process.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun exportState(): ExportState = exportState.getRequired("exportState")

    /**
     * The type of export, which can be either VIEW or LIST.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun exportType(): ExportType = exportType.getRequired("exportType")

    /**
     * The list of properties exported for the associated object.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectProperties(): List<String> = objectProperties.getRequired("objectProperties")

    /**
     * The associated CRM object being exported.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectType(): String = objectType.getRequired("objectType")

    /**
     * The timestamp when the export was last updated, in ISO 8601 format.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

    /**
     * The name assigned to the export.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun exportName(): Optional<String> = exportName.getOptional("exportName")

    /**
     * The total number of records included in the export.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordCount(): Optional<Int> = recordCount.getOptional("recordCount")

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
     * Returns the raw JSON value of [exportState].
     *
     * Unlike [exportState], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("exportState")
    @ExcludeMissing
    fun _exportState(): JsonField<ExportState> = exportState

    /**
     * Returns the raw JSON value of [exportType].
     *
     * Unlike [exportType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("exportType")
    @ExcludeMissing
    fun _exportType(): JsonField<ExportType> = exportType

    /**
     * Returns the raw JSON value of [objectProperties].
     *
     * Unlike [objectProperties], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("objectProperties")
    @ExcludeMissing
    fun _objectProperties(): JsonField<List<String>> = objectProperties

    /**
     * Returns the raw JSON value of [objectType].
     *
     * Unlike [objectType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectType") @ExcludeMissing fun _objectType(): JsonField<String> = objectType

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [exportName].
     *
     * Unlike [exportName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("exportName") @ExcludeMissing fun _exportName(): JsonField<String> = exportName

    /**
     * Returns the raw JSON value of [recordCount].
     *
     * Unlike [recordCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("recordCount") @ExcludeMissing fun _recordCount(): JsonField<Int> = recordCount

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
         * Returns a mutable builder for constructing an instance of [PublicExportResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .exportState()
         * .exportType()
         * .objectProperties()
         * .objectType()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicExportResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var exportState: JsonField<ExportState>? = null
        private var exportType: JsonField<ExportType>? = null
        private var objectProperties: JsonField<MutableList<String>>? = null
        private var objectType: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var exportName: JsonField<String> = JsonMissing.of()
        private var recordCount: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicExportResponse: PublicExportResponse) = apply {
            id = publicExportResponse.id
            createdAt = publicExportResponse.createdAt
            exportState = publicExportResponse.exportState
            exportType = publicExportResponse.exportType
            objectProperties = publicExportResponse.objectProperties.map { it.toMutableList() }
            objectType = publicExportResponse.objectType
            updatedAt = publicExportResponse.updatedAt
            exportName = publicExportResponse.exportName
            recordCount = publicExportResponse.recordCount
            additionalProperties = publicExportResponse.additionalProperties.toMutableMap()
        }

        /** The unique ID of the export. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The timestamp when the export was created, in ISO 8601 format. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The current state of the export process. */
        fun exportState(exportState: ExportState) = exportState(JsonField.of(exportState))

        /**
         * Sets [Builder.exportState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.exportState] with a well-typed [ExportState] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun exportState(exportState: JsonField<ExportState>) = apply {
            this.exportState = exportState
        }

        /** The type of export, which can be either VIEW or LIST. */
        fun exportType(exportType: ExportType) = exportType(JsonField.of(exportType))

        /**
         * Sets [Builder.exportType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.exportType] with a well-typed [ExportType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun exportType(exportType: JsonField<ExportType>) = apply { this.exportType = exportType }

        /** The list of properties exported for the associated object. */
        fun objectProperties(objectProperties: List<String>) =
            objectProperties(JsonField.of(objectProperties))

        /**
         * Sets [Builder.objectProperties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectProperties] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun objectProperties(objectProperties: JsonField<List<String>>) = apply {
            this.objectProperties = objectProperties.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [objectProperties].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addObjectProperty(objectProperty: String) = apply {
            objectProperties =
                (objectProperties ?: JsonField.of(mutableListOf())).also {
                    checkKnown("objectProperties", it).add(objectProperty)
                }
        }

        /** The associated CRM object being exported. */
        fun objectType(objectType: String) = objectType(JsonField.of(objectType))

        /**
         * Sets [Builder.objectType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun objectType(objectType: JsonField<String>) = apply { this.objectType = objectType }

        /** The timestamp when the export was last updated, in ISO 8601 format. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** The name assigned to the export. */
        fun exportName(exportName: String) = exportName(JsonField.of(exportName))

        /**
         * Sets [Builder.exportName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.exportName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun exportName(exportName: JsonField<String>) = apply { this.exportName = exportName }

        /** The total number of records included in the export. */
        fun recordCount(recordCount: Int) = recordCount(JsonField.of(recordCount))

        /**
         * Sets [Builder.recordCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordCount] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun recordCount(recordCount: JsonField<Int>) = apply { this.recordCount = recordCount }

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
         * Returns an immutable instance of [PublicExportResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .exportState()
         * .exportType()
         * .objectProperties()
         * .objectType()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicExportResponse =
            PublicExportResponse(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("exportState", exportState),
                checkRequired("exportType", exportType),
                checkRequired("objectProperties", objectProperties).map { it.toImmutable() },
                checkRequired("objectType", objectType),
                checkRequired("updatedAt", updatedAt),
                exportName,
                recordCount,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicExportResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        exportState().validate()
        exportType().validate()
        objectProperties()
        objectType()
        updatedAt()
        exportName()
        recordCount()
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
            (exportState.asKnown().getOrNull()?.validity() ?: 0) +
            (exportType.asKnown().getOrNull()?.validity() ?: 0) +
            (objectProperties.asKnown().getOrNull()?.size ?: 0) +
            (if (objectType.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (exportName.asKnown().isPresent) 1 else 0) +
            (if (recordCount.asKnown().isPresent) 1 else 0)

    /** The current state of the export process. */
    class ExportState @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val CANCELED = of("CANCELED")

            @JvmField val CONFLICT = of("CONFLICT")

            @JvmField val DEFERRED = of("DEFERRED")

            @JvmField val DELETED = of("DELETED")

            @JvmField val DONE = of("DONE")

            @JvmField val ENQUEUED = of("ENQUEUED")

            @JvmField val FAILED = of("FAILED")

            @JvmField val PENDING_APPROVAL = of("PENDING_APPROVAL")

            @JvmField val PROCESSING = of("PROCESSING")

            @JvmStatic fun of(value: String) = ExportState(JsonField.of(value))
        }

        /** An enum containing [ExportState]'s known values. */
        enum class Known {
            CANCELED,
            CONFLICT,
            DEFERRED,
            DELETED,
            DONE,
            ENQUEUED,
            FAILED,
            PENDING_APPROVAL,
            PROCESSING,
        }

        /**
         * An enum containing [ExportState]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ExportState] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CANCELED,
            CONFLICT,
            DEFERRED,
            DELETED,
            DONE,
            ENQUEUED,
            FAILED,
            PENDING_APPROVAL,
            PROCESSING,
            /**
             * An enum member indicating that [ExportState] was instantiated with an unknown value.
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
                CANCELED -> Value.CANCELED
                CONFLICT -> Value.CONFLICT
                DEFERRED -> Value.DEFERRED
                DELETED -> Value.DELETED
                DONE -> Value.DONE
                ENQUEUED -> Value.ENQUEUED
                FAILED -> Value.FAILED
                PENDING_APPROVAL -> Value.PENDING_APPROVAL
                PROCESSING -> Value.PROCESSING
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
                CANCELED -> Known.CANCELED
                CONFLICT -> Known.CONFLICT
                DEFERRED -> Known.DEFERRED
                DELETED -> Known.DELETED
                DONE -> Known.DONE
                ENQUEUED -> Known.ENQUEUED
                FAILED -> Known.FAILED
                PENDING_APPROVAL -> Known.PENDING_APPROVAL
                PROCESSING -> Known.PROCESSING
                else -> throw HubSpotInvalidDataException("Unknown ExportState: $value")
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

        fun validate(): ExportState = apply {
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

            return other is ExportState && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The type of export, which can be either VIEW or LIST. */
    class ExportType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val LIST = of("LIST")

            @JvmField val VIEW = of("VIEW")

            @JvmStatic fun of(value: String) = ExportType(JsonField.of(value))
        }

        /** An enum containing [ExportType]'s known values. */
        enum class Known {
            LIST,
            VIEW,
        }

        /**
         * An enum containing [ExportType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ExportType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LIST,
            VIEW,
            /**
             * An enum member indicating that [ExportType] was instantiated with an unknown value.
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
                LIST -> Value.LIST
                VIEW -> Value.VIEW
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
                LIST -> Known.LIST
                VIEW -> Known.VIEW
                else -> throw HubSpotInvalidDataException("Unknown ExportType: $value")
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

        fun validate(): ExportType = apply {
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

            return other is ExportType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicExportResponse &&
            id == other.id &&
            createdAt == other.createdAt &&
            exportState == other.exportState &&
            exportType == other.exportType &&
            objectProperties == other.objectProperties &&
            objectType == other.objectType &&
            updatedAt == other.updatedAt &&
            exportName == other.exportName &&
            recordCount == other.recordCount &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            exportState,
            exportType,
            objectProperties,
            objectType,
            updatedAt,
            exportName,
            recordCount,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicExportResponse{id=$id, createdAt=$createdAt, exportState=$exportState, exportType=$exportType, objectProperties=$objectProperties, objectType=$objectType, updatedAt=$updatedAt, exportName=$exportName, recordCount=$recordCount, additionalProperties=$additionalProperties}"
}
