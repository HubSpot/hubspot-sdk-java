// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.hubdb

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class HubDbTableV3
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val allowChildTables: JsonField<Boolean>,
    private val allowPublicApiAccess: JsonField<Boolean>,
    private val columnCount: JsonField<Int>,
    private val columns: JsonField<List<Column>>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val deleted: JsonField<Boolean>,
    private val deletedAt: JsonField<OffsetDateTime>,
    private val dynamicMetaTags: JsonField<DynamicMetaTags>,
    private val enableChildTablePages: JsonField<Boolean>,
    private val label: JsonField<String>,
    private val name: JsonField<String>,
    private val published: JsonField<Boolean>,
    private val publishedAt: JsonField<OffsetDateTime>,
    private val rowCount: JsonField<Int>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val useForPages: JsonField<Boolean>,
    private val createdBy: JsonField<SimpleUser>,
    private val isOrderedManually: JsonField<Boolean>,
    private val updatedBy: JsonField<SimpleUser>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("allowChildTables")
        @ExcludeMissing
        allowChildTables: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("allowPublicApiAccess")
        @ExcludeMissing
        allowPublicApiAccess: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("columnCount") @ExcludeMissing columnCount: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("columns")
        @ExcludeMissing
        columns: JsonField<List<Column>> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("deleted") @ExcludeMissing deleted: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("deletedAt")
        @ExcludeMissing
        deletedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dynamicMetaTags")
        @ExcludeMissing
        dynamicMetaTags: JsonField<DynamicMetaTags> = JsonMissing.of(),
        @JsonProperty("enableChildTablePages")
        @ExcludeMissing
        enableChildTablePages: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("published") @ExcludeMissing published: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("publishedAt")
        @ExcludeMissing
        publishedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("rowCount") @ExcludeMissing rowCount: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("useForPages")
        @ExcludeMissing
        useForPages: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("createdBy")
        @ExcludeMissing
        createdBy: JsonField<SimpleUser> = JsonMissing.of(),
        @JsonProperty("isOrderedManually")
        @ExcludeMissing
        isOrderedManually: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("updatedBy")
        @ExcludeMissing
        updatedBy: JsonField<SimpleUser> = JsonMissing.of(),
    ) : this(
        id,
        allowChildTables,
        allowPublicApiAccess,
        columnCount,
        columns,
        createdAt,
        deleted,
        deletedAt,
        dynamicMetaTags,
        enableChildTablePages,
        label,
        name,
        published,
        publishedAt,
        rowCount,
        updatedAt,
        useForPages,
        createdBy,
        isOrderedManually,
        updatedBy,
        mutableMapOf(),
    )

    /**
     * Id of the table
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Specifies whether child tables can be created
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun allowChildTables(): Boolean = allowChildTables.getRequired("allowChildTables")

    /**
     * Specifies whether the table can be read by public without authorization
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun allowPublicApiAccess(): Boolean = allowPublicApiAccess.getRequired("allowPublicApiAccess")

    /**
     * Number of columns including deleted
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun columnCount(): Int = columnCount.getRequired("columnCount")

    /**
     * List of columns in the table
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun columns(): List<Column> = columns.getRequired("columns")

    /**
     * Timestamp at which the table is created
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * Specifies whether the table is marked as deleted.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun deleted(): Boolean = deleted.getRequired("deleted")

    /**
     * The timestamp indicating when the table was deleted.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun deletedAt(): OffsetDateTime = deletedAt.getRequired("deletedAt")

    /**
     * Specifies the key value pairs of the
     * [metadata fields](https://developers.hubspot.com/docs/cms/guides/dynamic-pages/hubdb#dynamic-pages)
     * with the associated column IDs.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dynamicMetaTags(): DynamicMetaTags = dynamicMetaTags.getRequired("dynamicMetaTags")

    /**
     * Specifies creation of multi-level dynamic pages using child tables
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun enableChildTablePages(): Boolean =
        enableChildTablePages.getRequired("enableChildTablePages")

    /**
     * Label of the table
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun label(): String = label.getRequired("label")

    /**
     * Name of the table
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Indicates whether the table is currently published.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun published(): Boolean = published.getRequired("published")

    /**
     * Timestamp at which the table is published recently
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun publishedAt(): OffsetDateTime = publishedAt.getRequired("publishedAt")

    /**
     * Number of rows in the table
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rowCount(): Int = rowCount.getRequired("rowCount")

    /**
     * Timestamp at which the table is updated recently
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

    /**
     * Specifies whether the table can be used for creation of dynamic pages
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun useForPages(): Boolean = useForPages.getRequired("useForPages")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdBy(): Optional<SimpleUser> = createdBy.getOptional("createdBy")

    /**
     * Indicates whether the table rows are ordered manually.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isOrderedManually(): Optional<Boolean> = isOrderedManually.getOptional("isOrderedManually")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedBy(): Optional<SimpleUser> = updatedBy.getOptional("updatedBy")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [allowChildTables].
     *
     * Unlike [allowChildTables], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("allowChildTables")
    @ExcludeMissing
    fun _allowChildTables(): JsonField<Boolean> = allowChildTables

    /**
     * Returns the raw JSON value of [allowPublicApiAccess].
     *
     * Unlike [allowPublicApiAccess], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("allowPublicApiAccess")
    @ExcludeMissing
    fun _allowPublicApiAccess(): JsonField<Boolean> = allowPublicApiAccess

    /**
     * Returns the raw JSON value of [columnCount].
     *
     * Unlike [columnCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("columnCount") @ExcludeMissing fun _columnCount(): JsonField<Int> = columnCount

    /**
     * Returns the raw JSON value of [columns].
     *
     * Unlike [columns], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("columns") @ExcludeMissing fun _columns(): JsonField<List<Column>> = columns

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [deleted].
     *
     * Unlike [deleted], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deleted") @ExcludeMissing fun _deleted(): JsonField<Boolean> = deleted

    /**
     * Returns the raw JSON value of [deletedAt].
     *
     * Unlike [deletedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deletedAt")
    @ExcludeMissing
    fun _deletedAt(): JsonField<OffsetDateTime> = deletedAt

    /**
     * Returns the raw JSON value of [dynamicMetaTags].
     *
     * Unlike [dynamicMetaTags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dynamicMetaTags")
    @ExcludeMissing
    fun _dynamicMetaTags(): JsonField<DynamicMetaTags> = dynamicMetaTags

    /**
     * Returns the raw JSON value of [enableChildTablePages].
     *
     * Unlike [enableChildTablePages], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("enableChildTablePages")
    @ExcludeMissing
    fun _enableChildTablePages(): JsonField<Boolean> = enableChildTablePages

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
     * Returns the raw JSON value of [published].
     *
     * Unlike [published], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("published") @ExcludeMissing fun _published(): JsonField<Boolean> = published

    /**
     * Returns the raw JSON value of [publishedAt].
     *
     * Unlike [publishedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("publishedAt")
    @ExcludeMissing
    fun _publishedAt(): JsonField<OffsetDateTime> = publishedAt

    /**
     * Returns the raw JSON value of [rowCount].
     *
     * Unlike [rowCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rowCount") @ExcludeMissing fun _rowCount(): JsonField<Int> = rowCount

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [useForPages].
     *
     * Unlike [useForPages], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("useForPages")
    @ExcludeMissing
    fun _useForPages(): JsonField<Boolean> = useForPages

    /**
     * Returns the raw JSON value of [createdBy].
     *
     * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<SimpleUser> = createdBy

    /**
     * Returns the raw JSON value of [isOrderedManually].
     *
     * Unlike [isOrderedManually], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("isOrderedManually")
    @ExcludeMissing
    fun _isOrderedManually(): JsonField<Boolean> = isOrderedManually

    /**
     * Returns the raw JSON value of [updatedBy].
     *
     * Unlike [updatedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedBy") @ExcludeMissing fun _updatedBy(): JsonField<SimpleUser> = updatedBy

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
         * Returns a mutable builder for constructing an instance of [HubDbTableV3].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .allowChildTables()
         * .allowPublicApiAccess()
         * .columnCount()
         * .columns()
         * .createdAt()
         * .deleted()
         * .deletedAt()
         * .dynamicMetaTags()
         * .enableChildTablePages()
         * .label()
         * .name()
         * .published()
         * .publishedAt()
         * .rowCount()
         * .updatedAt()
         * .useForPages()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [HubDbTableV3]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var allowChildTables: JsonField<Boolean>? = null
        private var allowPublicApiAccess: JsonField<Boolean>? = null
        private var columnCount: JsonField<Int>? = null
        private var columns: JsonField<MutableList<Column>>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var deleted: JsonField<Boolean>? = null
        private var deletedAt: JsonField<OffsetDateTime>? = null
        private var dynamicMetaTags: JsonField<DynamicMetaTags>? = null
        private var enableChildTablePages: JsonField<Boolean>? = null
        private var label: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var published: JsonField<Boolean>? = null
        private var publishedAt: JsonField<OffsetDateTime>? = null
        private var rowCount: JsonField<Int>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var useForPages: JsonField<Boolean>? = null
        private var createdBy: JsonField<SimpleUser> = JsonMissing.of()
        private var isOrderedManually: JsonField<Boolean> = JsonMissing.of()
        private var updatedBy: JsonField<SimpleUser> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(hubDbTableV3: HubDbTableV3) = apply {
            id = hubDbTableV3.id
            allowChildTables = hubDbTableV3.allowChildTables
            allowPublicApiAccess = hubDbTableV3.allowPublicApiAccess
            columnCount = hubDbTableV3.columnCount
            columns = hubDbTableV3.columns.map { it.toMutableList() }
            createdAt = hubDbTableV3.createdAt
            deleted = hubDbTableV3.deleted
            deletedAt = hubDbTableV3.deletedAt
            dynamicMetaTags = hubDbTableV3.dynamicMetaTags
            enableChildTablePages = hubDbTableV3.enableChildTablePages
            label = hubDbTableV3.label
            name = hubDbTableV3.name
            published = hubDbTableV3.published
            publishedAt = hubDbTableV3.publishedAt
            rowCount = hubDbTableV3.rowCount
            updatedAt = hubDbTableV3.updatedAt
            useForPages = hubDbTableV3.useForPages
            createdBy = hubDbTableV3.createdBy
            isOrderedManually = hubDbTableV3.isOrderedManually
            updatedBy = hubDbTableV3.updatedBy
            additionalProperties = hubDbTableV3.additionalProperties.toMutableMap()
        }

        /** Id of the table */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Specifies whether child tables can be created */
        fun allowChildTables(allowChildTables: Boolean) =
            allowChildTables(JsonField.of(allowChildTables))

        /**
         * Sets [Builder.allowChildTables] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowChildTables] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun allowChildTables(allowChildTables: JsonField<Boolean>) = apply {
            this.allowChildTables = allowChildTables
        }

        /** Specifies whether the table can be read by public without authorization */
        fun allowPublicApiAccess(allowPublicApiAccess: Boolean) =
            allowPublicApiAccess(JsonField.of(allowPublicApiAccess))

        /**
         * Sets [Builder.allowPublicApiAccess] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowPublicApiAccess] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun allowPublicApiAccess(allowPublicApiAccess: JsonField<Boolean>) = apply {
            this.allowPublicApiAccess = allowPublicApiAccess
        }

        /** Number of columns including deleted */
        fun columnCount(columnCount: Int) = columnCount(JsonField.of(columnCount))

        /**
         * Sets [Builder.columnCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.columnCount] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun columnCount(columnCount: JsonField<Int>) = apply { this.columnCount = columnCount }

        /** List of columns in the table */
        fun columns(columns: List<Column>) = columns(JsonField.of(columns))

        /**
         * Sets [Builder.columns] to an arbitrary JSON value.
         *
         * You should usually call [Builder.columns] with a well-typed `List<Column>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun columns(columns: JsonField<List<Column>>) = apply {
            this.columns = columns.map { it.toMutableList() }
        }

        /**
         * Adds a single [Column] to [columns].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addColumn(column: Column) = apply {
            columns =
                (columns ?: JsonField.of(mutableListOf())).also {
                    checkKnown("columns", it).add(column)
                }
        }

        /** Timestamp at which the table is created */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Specifies whether the table is marked as deleted. */
        fun deleted(deleted: Boolean) = deleted(JsonField.of(deleted))

        /**
         * Sets [Builder.deleted] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deleted] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun deleted(deleted: JsonField<Boolean>) = apply { this.deleted = deleted }

        /** The timestamp indicating when the table was deleted. */
        fun deletedAt(deletedAt: OffsetDateTime) = deletedAt(JsonField.of(deletedAt))

        /**
         * Sets [Builder.deletedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deletedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun deletedAt(deletedAt: JsonField<OffsetDateTime>) = apply { this.deletedAt = deletedAt }

        /**
         * Specifies the key value pairs of the
         * [metadata fields](https://developers.hubspot.com/docs/cms/guides/dynamic-pages/hubdb#dynamic-pages)
         * with the associated column IDs.
         */
        fun dynamicMetaTags(dynamicMetaTags: DynamicMetaTags) =
            dynamicMetaTags(JsonField.of(dynamicMetaTags))

        /**
         * Sets [Builder.dynamicMetaTags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dynamicMetaTags] with a well-typed [DynamicMetaTags]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun dynamicMetaTags(dynamicMetaTags: JsonField<DynamicMetaTags>) = apply {
            this.dynamicMetaTags = dynamicMetaTags
        }

        /** Specifies creation of multi-level dynamic pages using child tables */
        fun enableChildTablePages(enableChildTablePages: Boolean) =
            enableChildTablePages(JsonField.of(enableChildTablePages))

        /**
         * Sets [Builder.enableChildTablePages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enableChildTablePages] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun enableChildTablePages(enableChildTablePages: JsonField<Boolean>) = apply {
            this.enableChildTablePages = enableChildTablePages
        }

        /** Label of the table */
        fun label(label: String) = label(JsonField.of(label))

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: JsonField<String>) = apply { this.label = label }

        /** Name of the table */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Indicates whether the table is currently published. */
        fun published(published: Boolean) = published(JsonField.of(published))

        /**
         * Sets [Builder.published] to an arbitrary JSON value.
         *
         * You should usually call [Builder.published] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun published(published: JsonField<Boolean>) = apply { this.published = published }

        /** Timestamp at which the table is published recently */
        fun publishedAt(publishedAt: OffsetDateTime) = publishedAt(JsonField.of(publishedAt))

        /**
         * Sets [Builder.publishedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.publishedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun publishedAt(publishedAt: JsonField<OffsetDateTime>) = apply {
            this.publishedAt = publishedAt
        }

        /** Number of rows in the table */
        fun rowCount(rowCount: Int) = rowCount(JsonField.of(rowCount))

        /**
         * Sets [Builder.rowCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rowCount] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rowCount(rowCount: JsonField<Int>) = apply { this.rowCount = rowCount }

        /** Timestamp at which the table is updated recently */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** Specifies whether the table can be used for creation of dynamic pages */
        fun useForPages(useForPages: Boolean) = useForPages(JsonField.of(useForPages))

        /**
         * Sets [Builder.useForPages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.useForPages] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun useForPages(useForPages: JsonField<Boolean>) = apply { this.useForPages = useForPages }

        fun createdBy(createdBy: SimpleUser) = createdBy(JsonField.of(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [SimpleUser] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<SimpleUser>) = apply { this.createdBy = createdBy }

        /** Indicates whether the table rows are ordered manually. */
        fun isOrderedManually(isOrderedManually: Boolean) =
            isOrderedManually(JsonField.of(isOrderedManually))

        /**
         * Sets [Builder.isOrderedManually] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isOrderedManually] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isOrderedManually(isOrderedManually: JsonField<Boolean>) = apply {
            this.isOrderedManually = isOrderedManually
        }

        fun updatedBy(updatedBy: SimpleUser) = updatedBy(JsonField.of(updatedBy))

        /**
         * Sets [Builder.updatedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedBy] with a well-typed [SimpleUser] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedBy(updatedBy: JsonField<SimpleUser>) = apply { this.updatedBy = updatedBy }

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
         * Returns an immutable instance of [HubDbTableV3].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .allowChildTables()
         * .allowPublicApiAccess()
         * .columnCount()
         * .columns()
         * .createdAt()
         * .deleted()
         * .deletedAt()
         * .dynamicMetaTags()
         * .enableChildTablePages()
         * .label()
         * .name()
         * .published()
         * .publishedAt()
         * .rowCount()
         * .updatedAt()
         * .useForPages()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): HubDbTableV3 =
            HubDbTableV3(
                checkRequired("id", id),
                checkRequired("allowChildTables", allowChildTables),
                checkRequired("allowPublicApiAccess", allowPublicApiAccess),
                checkRequired("columnCount", columnCount),
                checkRequired("columns", columns).map { it.toImmutable() },
                checkRequired("createdAt", createdAt),
                checkRequired("deleted", deleted),
                checkRequired("deletedAt", deletedAt),
                checkRequired("dynamicMetaTags", dynamicMetaTags),
                checkRequired("enableChildTablePages", enableChildTablePages),
                checkRequired("label", label),
                checkRequired("name", name),
                checkRequired("published", published),
                checkRequired("publishedAt", publishedAt),
                checkRequired("rowCount", rowCount),
                checkRequired("updatedAt", updatedAt),
                checkRequired("useForPages", useForPages),
                createdBy,
                isOrderedManually,
                updatedBy,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): HubDbTableV3 = apply {
        if (validated) {
            return@apply
        }

        id()
        allowChildTables()
        allowPublicApiAccess()
        columnCount()
        columns().forEach { it.validate() }
        createdAt()
        deleted()
        deletedAt()
        dynamicMetaTags().validate()
        enableChildTablePages()
        label()
        name()
        published()
        publishedAt()
        rowCount()
        updatedAt()
        useForPages()
        createdBy().ifPresent { it.validate() }
        isOrderedManually()
        updatedBy().ifPresent { it.validate() }
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
            (if (allowChildTables.asKnown().isPresent) 1 else 0) +
            (if (allowPublicApiAccess.asKnown().isPresent) 1 else 0) +
            (if (columnCount.asKnown().isPresent) 1 else 0) +
            (columns.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (deleted.asKnown().isPresent) 1 else 0) +
            (if (deletedAt.asKnown().isPresent) 1 else 0) +
            (dynamicMetaTags.asKnown().getOrNull()?.validity() ?: 0) +
            (if (enableChildTablePages.asKnown().isPresent) 1 else 0) +
            (if (label.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (published.asKnown().isPresent) 1 else 0) +
            (if (publishedAt.asKnown().isPresent) 1 else 0) +
            (if (rowCount.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (useForPages.asKnown().isPresent) 1 else 0) +
            (createdBy.asKnown().getOrNull()?.validity() ?: 0) +
            (if (isOrderedManually.asKnown().isPresent) 1 else 0) +
            (updatedBy.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * Specifies the key value pairs of the
     * [metadata fields](https://developers.hubspot.com/docs/cms/guides/dynamic-pages/hubdb#dynamic-pages)
     * with the associated column IDs.
     */
    class DynamicMetaTags
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

            /** Returns a mutable builder for constructing an instance of [DynamicMetaTags]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DynamicMetaTags]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(dynamicMetaTags: DynamicMetaTags) = apply {
                additionalProperties = dynamicMetaTags.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [DynamicMetaTags].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): DynamicMetaTags = DynamicMetaTags(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): DynamicMetaTags = apply {
            if (validated) {
                return@apply
            }

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
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DynamicMetaTags && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "DynamicMetaTags{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HubDbTableV3 &&
            id == other.id &&
            allowChildTables == other.allowChildTables &&
            allowPublicApiAccess == other.allowPublicApiAccess &&
            columnCount == other.columnCount &&
            columns == other.columns &&
            createdAt == other.createdAt &&
            deleted == other.deleted &&
            deletedAt == other.deletedAt &&
            dynamicMetaTags == other.dynamicMetaTags &&
            enableChildTablePages == other.enableChildTablePages &&
            label == other.label &&
            name == other.name &&
            published == other.published &&
            publishedAt == other.publishedAt &&
            rowCount == other.rowCount &&
            updatedAt == other.updatedAt &&
            useForPages == other.useForPages &&
            createdBy == other.createdBy &&
            isOrderedManually == other.isOrderedManually &&
            updatedBy == other.updatedBy &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            allowChildTables,
            allowPublicApiAccess,
            columnCount,
            columns,
            createdAt,
            deleted,
            deletedAt,
            dynamicMetaTags,
            enableChildTablePages,
            label,
            name,
            published,
            publishedAt,
            rowCount,
            updatedAt,
            useForPages,
            createdBy,
            isOrderedManually,
            updatedBy,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "HubDbTableV3{id=$id, allowChildTables=$allowChildTables, allowPublicApiAccess=$allowPublicApiAccess, columnCount=$columnCount, columns=$columns, createdAt=$createdAt, deleted=$deleted, deletedAt=$deletedAt, dynamicMetaTags=$dynamicMetaTags, enableChildTablePages=$enableChildTablePages, label=$label, name=$name, published=$published, publishedAt=$publishedAt, rowCount=$rowCount, updatedAt=$updatedAt, useForPages=$useForPages, createdBy=$createdBy, isOrderedManually=$isOrderedManually, updatedBy=$updatedBy, additionalProperties=$additionalProperties}"
}
