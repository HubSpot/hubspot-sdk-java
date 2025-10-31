// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.hubdb

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
import com.hubspot_sdk.api.models.Option
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Column
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val label: JsonField<String>,
    private val name: JsonField<String>,
    private val type: JsonField<Type>,
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<SimpleUser>,
    private val createdByUserId: JsonField<Int>,
    private val deleted: JsonField<Boolean>,
    private val description: JsonField<String>,
    private val foreignColumnId: JsonField<Int>,
    private val foreignIds: JsonField<List<ForeignId>>,
    private val foreignIdsById: JsonField<ForeignIdsById>,
    private val foreignIdsByName: JsonField<ForeignIdsByName>,
    private val foreignTableId: JsonField<Long>,
    private val optionCount: JsonField<Int>,
    private val options: JsonField<List<Option>>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val updatedBy: JsonField<SimpleUser>,
    private val updatedByUserId: JsonField<Int>,
    private val width: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy")
        @ExcludeMissing
        createdBy: JsonField<SimpleUser> = JsonMissing.of(),
        @JsonProperty("createdByUserId")
        @ExcludeMissing
        createdByUserId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("deleted") @ExcludeMissing deleted: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("foreignColumnId")
        @ExcludeMissing
        foreignColumnId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("foreignIds")
        @ExcludeMissing
        foreignIds: JsonField<List<ForeignId>> = JsonMissing.of(),
        @JsonProperty("foreignIdsById")
        @ExcludeMissing
        foreignIdsById: JsonField<ForeignIdsById> = JsonMissing.of(),
        @JsonProperty("foreignIdsByName")
        @ExcludeMissing
        foreignIdsByName: JsonField<ForeignIdsByName> = JsonMissing.of(),
        @JsonProperty("foreignTableId")
        @ExcludeMissing
        foreignTableId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("optionCount") @ExcludeMissing optionCount: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("options")
        @ExcludeMissing
        options: JsonField<List<Option>> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedBy")
        @ExcludeMissing
        updatedBy: JsonField<SimpleUser> = JsonMissing.of(),
        @JsonProperty("updatedByUserId")
        @ExcludeMissing
        updatedByUserId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("width") @ExcludeMissing width: JsonField<Int> = JsonMissing.of(),
    ) : this(
        label,
        name,
        type,
        id,
        createdAt,
        createdBy,
        createdByUserId,
        deleted,
        description,
        foreignColumnId,
        foreignIds,
        foreignIdsById,
        foreignIdsByName,
        foreignTableId,
        optionCount,
        options,
        updatedAt,
        updatedBy,
        updatedByUserId,
        width,
        mutableMapOf(),
    )

    /**
     * Label of the column
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun label(): String = label.getRequired("label")

    /**
     * Name of the column
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Type of the column
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Column Id
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdBy(): Optional<SimpleUser> = createdBy.getOptional("createdBy")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdByUserId(): Optional<Int> = createdByUserId.getOptional("createdByUserId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deleted(): Optional<Boolean> = deleted.getOptional("deleted")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * Foreign Column id
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun foreignColumnId(): Optional<Int> = foreignColumnId.getOptional("foreignColumnId")

    /**
     * Foreign Ids
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun foreignIds(): Optional<List<ForeignId>> = foreignIds.getOptional("foreignIds")

    /**
     * Foreign ids
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun foreignIdsById(): Optional<ForeignIdsById> = foreignIdsById.getOptional("foreignIdsById")

    /**
     * Foreign ids by name
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun foreignIdsByName(): Optional<ForeignIdsByName> =
        foreignIdsByName.getOptional("foreignIdsByName")

    /**
     * Foreign table id referenced
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun foreignTableId(): Optional<Long> = foreignTableId.getOptional("foreignTableId")

    /**
     * Number of options available
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun optionCount(): Optional<Int> = optionCount.getOptional("optionCount")

    /**
     * Options to choose for select and multi-select columns
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun options(): Optional<List<Option>> = options.getOptional("options")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedBy(): Optional<SimpleUser> = updatedBy.getOptional("updatedBy")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedByUserId(): Optional<Int> = updatedByUserId.getOptional("updatedByUserId")

    /**
     * Column width for HubDB UI
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun width(): Optional<Int> = width.getOptional("width")

    /**
     * Returns the raw JSON value of [label].
     *
     * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
     * Returns the raw JSON value of [createdBy].
     *
     * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<SimpleUser> = createdBy

    /**
     * Returns the raw JSON value of [createdByUserId].
     *
     * Unlike [createdByUserId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdByUserId")
    @ExcludeMissing
    fun _createdByUserId(): JsonField<Int> = createdByUserId

    /**
     * Returns the raw JSON value of [deleted].
     *
     * Unlike [deleted], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deleted") @ExcludeMissing fun _deleted(): JsonField<Boolean> = deleted

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [foreignColumnId].
     *
     * Unlike [foreignColumnId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("foreignColumnId")
    @ExcludeMissing
    fun _foreignColumnId(): JsonField<Int> = foreignColumnId

    /**
     * Returns the raw JSON value of [foreignIds].
     *
     * Unlike [foreignIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("foreignIds")
    @ExcludeMissing
    fun _foreignIds(): JsonField<List<ForeignId>> = foreignIds

    /**
     * Returns the raw JSON value of [foreignIdsById].
     *
     * Unlike [foreignIdsById], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("foreignIdsById")
    @ExcludeMissing
    fun _foreignIdsById(): JsonField<ForeignIdsById> = foreignIdsById

    /**
     * Returns the raw JSON value of [foreignIdsByName].
     *
     * Unlike [foreignIdsByName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("foreignIdsByName")
    @ExcludeMissing
    fun _foreignIdsByName(): JsonField<ForeignIdsByName> = foreignIdsByName

    /**
     * Returns the raw JSON value of [foreignTableId].
     *
     * Unlike [foreignTableId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("foreignTableId")
    @ExcludeMissing
    fun _foreignTableId(): JsonField<Long> = foreignTableId

    /**
     * Returns the raw JSON value of [optionCount].
     *
     * Unlike [optionCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("optionCount") @ExcludeMissing fun _optionCount(): JsonField<Int> = optionCount

    /**
     * Returns the raw JSON value of [options].
     *
     * Unlike [options], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("options") @ExcludeMissing fun _options(): JsonField<List<Option>> = options

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [updatedBy].
     *
     * Unlike [updatedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedBy") @ExcludeMissing fun _updatedBy(): JsonField<SimpleUser> = updatedBy

    /**
     * Returns the raw JSON value of [updatedByUserId].
     *
     * Unlike [updatedByUserId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedByUserId")
    @ExcludeMissing
    fun _updatedByUserId(): JsonField<Int> = updatedByUserId

    /**
     * Returns the raw JSON value of [width].
     *
     * Unlike [width], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("width") @ExcludeMissing fun _width(): JsonField<Int> = width

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
         * Returns a mutable builder for constructing an instance of [Column].
         *
         * The following fields are required:
         * ```java
         * .label()
         * .name()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Column]. */
    class Builder internal constructor() {

        private var label: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<SimpleUser> = JsonMissing.of()
        private var createdByUserId: JsonField<Int> = JsonMissing.of()
        private var deleted: JsonField<Boolean> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var foreignColumnId: JsonField<Int> = JsonMissing.of()
        private var foreignIds: JsonField<MutableList<ForeignId>>? = null
        private var foreignIdsById: JsonField<ForeignIdsById> = JsonMissing.of()
        private var foreignIdsByName: JsonField<ForeignIdsByName> = JsonMissing.of()
        private var foreignTableId: JsonField<Long> = JsonMissing.of()
        private var optionCount: JsonField<Int> = JsonMissing.of()
        private var options: JsonField<MutableList<Option>>? = null
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<SimpleUser> = JsonMissing.of()
        private var updatedByUserId: JsonField<Int> = JsonMissing.of()
        private var width: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(column: Column) = apply {
            label = column.label
            name = column.name
            type = column.type
            id = column.id
            createdAt = column.createdAt
            createdBy = column.createdBy
            createdByUserId = column.createdByUserId
            deleted = column.deleted
            description = column.description
            foreignColumnId = column.foreignColumnId
            foreignIds = column.foreignIds.map { it.toMutableList() }
            foreignIdsById = column.foreignIdsById
            foreignIdsByName = column.foreignIdsByName
            foreignTableId = column.foreignTableId
            optionCount = column.optionCount
            options = column.options.map { it.toMutableList() }
            updatedAt = column.updatedAt
            updatedBy = column.updatedBy
            updatedByUserId = column.updatedByUserId
            width = column.width
            additionalProperties = column.additionalProperties.toMutableMap()
        }

        /** Label of the column */
        fun label(label: String) = label(JsonField.of(label))

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: JsonField<String>) = apply { this.label = label }

        /** Name of the column */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Type of the column */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** Column Id */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun createdBy(createdBy: SimpleUser) = createdBy(JsonField.of(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [SimpleUser] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<SimpleUser>) = apply { this.createdBy = createdBy }

        fun createdByUserId(createdByUserId: Int) = createdByUserId(JsonField.of(createdByUserId))

        /**
         * Sets [Builder.createdByUserId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdByUserId] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdByUserId(createdByUserId: JsonField<Int>) = apply {
            this.createdByUserId = createdByUserId
        }

        fun deleted(deleted: Boolean) = deleted(JsonField.of(deleted))

        /**
         * Sets [Builder.deleted] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deleted] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun deleted(deleted: JsonField<Boolean>) = apply { this.deleted = deleted }

        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Foreign Column id */
        fun foreignColumnId(foreignColumnId: Int) = foreignColumnId(JsonField.of(foreignColumnId))

        /**
         * Sets [Builder.foreignColumnId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.foreignColumnId] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun foreignColumnId(foreignColumnId: JsonField<Int>) = apply {
            this.foreignColumnId = foreignColumnId
        }

        /** Foreign Ids */
        fun foreignIds(foreignIds: List<ForeignId>) = foreignIds(JsonField.of(foreignIds))

        /**
         * Sets [Builder.foreignIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.foreignIds] with a well-typed `List<ForeignId>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun foreignIds(foreignIds: JsonField<List<ForeignId>>) = apply {
            this.foreignIds = foreignIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [ForeignId] to [foreignIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addForeignId(foreignId: ForeignId) = apply {
            foreignIds =
                (foreignIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("foreignIds", it).add(foreignId)
                }
        }

        /** Foreign ids */
        fun foreignIdsById(foreignIdsById: ForeignIdsById) =
            foreignIdsById(JsonField.of(foreignIdsById))

        /**
         * Sets [Builder.foreignIdsById] to an arbitrary JSON value.
         *
         * You should usually call [Builder.foreignIdsById] with a well-typed [ForeignIdsById] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun foreignIdsById(foreignIdsById: JsonField<ForeignIdsById>) = apply {
            this.foreignIdsById = foreignIdsById
        }

        /** Foreign ids by name */
        fun foreignIdsByName(foreignIdsByName: ForeignIdsByName) =
            foreignIdsByName(JsonField.of(foreignIdsByName))

        /**
         * Sets [Builder.foreignIdsByName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.foreignIdsByName] with a well-typed [ForeignIdsByName]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun foreignIdsByName(foreignIdsByName: JsonField<ForeignIdsByName>) = apply {
            this.foreignIdsByName = foreignIdsByName
        }

        /** Foreign table id referenced */
        fun foreignTableId(foreignTableId: Long) = foreignTableId(JsonField.of(foreignTableId))

        /**
         * Sets [Builder.foreignTableId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.foreignTableId] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun foreignTableId(foreignTableId: JsonField<Long>) = apply {
            this.foreignTableId = foreignTableId
        }

        /** Number of options available */
        fun optionCount(optionCount: Int) = optionCount(JsonField.of(optionCount))

        /**
         * Sets [Builder.optionCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.optionCount] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun optionCount(optionCount: JsonField<Int>) = apply { this.optionCount = optionCount }

        /** Options to choose for select and multi-select columns */
        fun options(options: List<Option>) = options(JsonField.of(options))

        /**
         * Sets [Builder.options] to an arbitrary JSON value.
         *
         * You should usually call [Builder.options] with a well-typed `List<Option>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun options(options: JsonField<List<Option>>) = apply {
            this.options = options.map { it.toMutableList() }
        }

        /**
         * Adds a single [Option] to [options].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOption(option: Option) = apply {
            options =
                (options ?: JsonField.of(mutableListOf())).also {
                    checkKnown("options", it).add(option)
                }
        }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun updatedBy(updatedBy: SimpleUser) = updatedBy(JsonField.of(updatedBy))

        /**
         * Sets [Builder.updatedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedBy] with a well-typed [SimpleUser] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedBy(updatedBy: JsonField<SimpleUser>) = apply { this.updatedBy = updatedBy }

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

        /** Column width for HubDB UI */
        fun width(width: Int) = width(JsonField.of(width))

        /**
         * Sets [Builder.width] to an arbitrary JSON value.
         *
         * You should usually call [Builder.width] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun width(width: JsonField<Int>) = apply { this.width = width }

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
         * Returns an immutable instance of [Column].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .label()
         * .name()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Column =
            Column(
                checkRequired("label", label),
                checkRequired("name", name),
                checkRequired("type", type),
                id,
                createdAt,
                createdBy,
                createdByUserId,
                deleted,
                description,
                foreignColumnId,
                (foreignIds ?: JsonMissing.of()).map { it.toImmutable() },
                foreignIdsById,
                foreignIdsByName,
                foreignTableId,
                optionCount,
                (options ?: JsonMissing.of()).map { it.toImmutable() },
                updatedAt,
                updatedBy,
                updatedByUserId,
                width,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Column = apply {
        if (validated) {
            return@apply
        }

        label()
        name()
        type().validate()
        id()
        createdAt()
        createdBy().ifPresent { it.validate() }
        createdByUserId()
        deleted()
        description()
        foreignColumnId()
        foreignIds().ifPresent { it.forEach { it.validate() } }
        foreignIdsById().ifPresent { it.validate() }
        foreignIdsByName().ifPresent { it.validate() }
        foreignTableId()
        optionCount()
        options().ifPresent { it.forEach { it.validate() } }
        updatedAt()
        updatedBy().ifPresent { it.validate() }
        updatedByUserId()
        width()
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
        (if (label.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (createdBy.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdByUserId.asKnown().isPresent) 1 else 0) +
            (if (deleted.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (foreignColumnId.asKnown().isPresent) 1 else 0) +
            (foreignIds.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (foreignIdsById.asKnown().getOrNull()?.validity() ?: 0) +
            (foreignIdsByName.asKnown().getOrNull()?.validity() ?: 0) +
            (if (foreignTableId.asKnown().isPresent) 1 else 0) +
            (if (optionCount.asKnown().isPresent) 1 else 0) +
            (options.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (updatedBy.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedByUserId.asKnown().isPresent) 1 else 0) +
            (if (width.asKnown().isPresent) 1 else 0)

    /** Type of the column */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val NULL = of("NULL")

            @JvmField val TEXT = of("TEXT")

            @JvmField val NUMBER = of("NUMBER")

            @JvmField val URL = of("URL")

            @JvmField val IMAGE = of("IMAGE")

            @JvmField val SELECT = of("SELECT")

            @JvmField val MULTISELECT = of("MULTISELECT")

            @JvmField val BOOLEAN = of("BOOLEAN")

            @JvmField val LOCATION = of("LOCATION")

            @JvmField val DATE = of("DATE")

            @JvmField val DATETIME = of("DATETIME")

            @JvmField val CURRENCY = of("CURRENCY")

            @JvmField val RICHTEXT = of("RICHTEXT")

            @JvmField val FOREIGN_ID = of("FOREIGN_ID")

            @JvmField val VIDEO = of("VIDEO")

            @JvmField val CTA = of("CTA")

            @JvmField val FILE = of("FILE")

            @JvmField val JSON = of("JSON")

            @JvmField val COMPOSITE = of("COMPOSITE")

            @JvmField val CODE = of("CODE")

            @JvmField val HUBSPOT_VIDEO = of("HUBSPOT_VIDEO")

            @JvmField val EMBED = of("EMBED")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            NULL,
            TEXT,
            NUMBER,
            URL,
            IMAGE,
            SELECT,
            MULTISELECT,
            BOOLEAN,
            LOCATION,
            DATE,
            DATETIME,
            CURRENCY,
            RICHTEXT,
            FOREIGN_ID,
            VIDEO,
            CTA,
            FILE,
            JSON,
            COMPOSITE,
            CODE,
            HUBSPOT_VIDEO,
            EMBED,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NULL,
            TEXT,
            NUMBER,
            URL,
            IMAGE,
            SELECT,
            MULTISELECT,
            BOOLEAN,
            LOCATION,
            DATE,
            DATETIME,
            CURRENCY,
            RICHTEXT,
            FOREIGN_ID,
            VIDEO,
            CTA,
            FILE,
            JSON,
            COMPOSITE,
            CODE,
            HUBSPOT_VIDEO,
            EMBED,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                NULL -> Value.NULL
                TEXT -> Value.TEXT
                NUMBER -> Value.NUMBER
                URL -> Value.URL
                IMAGE -> Value.IMAGE
                SELECT -> Value.SELECT
                MULTISELECT -> Value.MULTISELECT
                BOOLEAN -> Value.BOOLEAN
                LOCATION -> Value.LOCATION
                DATE -> Value.DATE
                DATETIME -> Value.DATETIME
                CURRENCY -> Value.CURRENCY
                RICHTEXT -> Value.RICHTEXT
                FOREIGN_ID -> Value.FOREIGN_ID
                VIDEO -> Value.VIDEO
                CTA -> Value.CTA
                FILE -> Value.FILE
                JSON -> Value.JSON
                COMPOSITE -> Value.COMPOSITE
                CODE -> Value.CODE
                HUBSPOT_VIDEO -> Value.HUBSPOT_VIDEO
                EMBED -> Value.EMBED
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
                NULL -> Known.NULL
                TEXT -> Known.TEXT
                NUMBER -> Known.NUMBER
                URL -> Known.URL
                IMAGE -> Known.IMAGE
                SELECT -> Known.SELECT
                MULTISELECT -> Known.MULTISELECT
                BOOLEAN -> Known.BOOLEAN
                LOCATION -> Known.LOCATION
                DATE -> Known.DATE
                DATETIME -> Known.DATETIME
                CURRENCY -> Known.CURRENCY
                RICHTEXT -> Known.RICHTEXT
                FOREIGN_ID -> Known.FOREIGN_ID
                VIDEO -> Known.VIDEO
                CTA -> Known.CTA
                FILE -> Known.FILE
                JSON -> Known.JSON
                COMPOSITE -> Known.COMPOSITE
                CODE -> Known.CODE
                HUBSPOT_VIDEO -> Known.HUBSPOT_VIDEO
                EMBED -> Known.EMBED
                else -> throw HubspotInvalidDataException("Unknown Type: $value")
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

        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Foreign ids */
    class ForeignIdsById
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

            /** Returns a mutable builder for constructing an instance of [ForeignIdsById]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ForeignIdsById]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(foreignIdsById: ForeignIdsById) = apply {
                additionalProperties = foreignIdsById.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ForeignIdsById].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ForeignIdsById = ForeignIdsById(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): ForeignIdsById = apply {
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

            return other is ForeignIdsById && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ForeignIdsById{additionalProperties=$additionalProperties}"
    }

    /** Foreign ids by name */
    class ForeignIdsByName
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

            /** Returns a mutable builder for constructing an instance of [ForeignIdsByName]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ForeignIdsByName]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(foreignIdsByName: ForeignIdsByName) = apply {
                additionalProperties = foreignIdsByName.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ForeignIdsByName].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ForeignIdsByName = ForeignIdsByName(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): ForeignIdsByName = apply {
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

            return other is ForeignIdsByName && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ForeignIdsByName{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Column &&
            label == other.label &&
            name == other.name &&
            type == other.type &&
            id == other.id &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            createdByUserId == other.createdByUserId &&
            deleted == other.deleted &&
            description == other.description &&
            foreignColumnId == other.foreignColumnId &&
            foreignIds == other.foreignIds &&
            foreignIdsById == other.foreignIdsById &&
            foreignIdsByName == other.foreignIdsByName &&
            foreignTableId == other.foreignTableId &&
            optionCount == other.optionCount &&
            options == other.options &&
            updatedAt == other.updatedAt &&
            updatedBy == other.updatedBy &&
            updatedByUserId == other.updatedByUserId &&
            width == other.width &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            label,
            name,
            type,
            id,
            createdAt,
            createdBy,
            createdByUserId,
            deleted,
            description,
            foreignColumnId,
            foreignIds,
            foreignIdsById,
            foreignIdsByName,
            foreignTableId,
            optionCount,
            options,
            updatedAt,
            updatedBy,
            updatedByUserId,
            width,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Column{label=$label, name=$name, type=$type, id=$id, createdAt=$createdAt, createdBy=$createdBy, createdByUserId=$createdByUserId, deleted=$deleted, description=$description, foreignColumnId=$foreignColumnId, foreignIds=$foreignIds, foreignIdsById=$foreignIdsById, foreignIdsByName=$foreignIdsByName, foreignTableId=$foreignTableId, optionCount=$optionCount, options=$options, updatedAt=$updatedAt, updatedBy=$updatedBy, updatedByUserId=$updatedByUserId, width=$width, additionalProperties=$additionalProperties}"
}
