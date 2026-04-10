// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms

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
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class LayoutSection
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val cells: JsonField<List<LayoutSection>>,
    private val cssClass: JsonField<String>,
    private val cssId: JsonField<String>,
    private val cssStyle: JsonField<String>,
    private val label: JsonField<String>,
    private val name: JsonField<String>,
    private val params: JsonField<Params>,
    private val rowMetaData: JsonField<List<RowMetaData>>,
    private val rows: JsonField<List<Row>>,
    private val styles: JsonField<Styles>,
    private val type: JsonField<String>,
    private val w: JsonField<Int>,
    private val x: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("cells")
        @ExcludeMissing
        cells: JsonField<List<LayoutSection>> = JsonMissing.of(),
        @JsonProperty("cssClass") @ExcludeMissing cssClass: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cssId") @ExcludeMissing cssId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cssStyle") @ExcludeMissing cssStyle: JsonField<String> = JsonMissing.of(),
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("params") @ExcludeMissing params: JsonField<Params> = JsonMissing.of(),
        @JsonProperty("rowMetaData")
        @ExcludeMissing
        rowMetaData: JsonField<List<RowMetaData>> = JsonMissing.of(),
        @JsonProperty("rows") @ExcludeMissing rows: JsonField<List<Row>> = JsonMissing.of(),
        @JsonProperty("styles") @ExcludeMissing styles: JsonField<Styles> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("w") @ExcludeMissing w: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("x") @ExcludeMissing x: JsonField<Int> = JsonMissing.of(),
    ) : this(
        cells,
        cssClass,
        cssId,
        cssStyle,
        label,
        name,
        params,
        rowMetaData,
        rows,
        styles,
        type,
        w,
        x,
        mutableMapOf(),
    )

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cells(): List<LayoutSection> = cells.getRequired("cells")

    /**
     * The CSS class applied to the layout section.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cssClass(): String = cssClass.getRequired("cssClass")

    /**
     * The CSS ID applied to the layout section.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cssId(): String = cssId.getRequired("cssId")

    /**
     * Custom CSS styles applied to the layout section.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cssStyle(): String = cssStyle.getRequired("cssStyle")

    /**
     * The label for the layout section.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun label(): String = label.getRequired("label")

    /**
     * The name assigned to the layout section.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * null
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun params(): Params = params.getRequired("params")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rowMetaData(): List<RowMetaData> = rowMetaData.getRequired("rowMetaData")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rows(): List<Row> = rows.getRequired("rows")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun styles(): Styles = styles.getRequired("styles")

    /**
     * The type of the layout section.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): String = type.getRequired("type")

    /**
     * The width of the layout section.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun w(): Int = w.getRequired("w")

    /**
     * The x-coordinate position of the layout section.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun x(): Int = x.getRequired("x")

    /**
     * Returns the raw JSON value of [cells].
     *
     * Unlike [cells], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cells") @ExcludeMissing fun _cells(): JsonField<List<LayoutSection>> = cells

    /**
     * Returns the raw JSON value of [cssClass].
     *
     * Unlike [cssClass], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cssClass") @ExcludeMissing fun _cssClass(): JsonField<String> = cssClass

    /**
     * Returns the raw JSON value of [cssId].
     *
     * Unlike [cssId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cssId") @ExcludeMissing fun _cssId(): JsonField<String> = cssId

    /**
     * Returns the raw JSON value of [cssStyle].
     *
     * Unlike [cssStyle], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cssStyle") @ExcludeMissing fun _cssStyle(): JsonField<String> = cssStyle

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
     * Returns the raw JSON value of [params].
     *
     * Unlike [params], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("params") @ExcludeMissing fun _params(): JsonField<Params> = params

    /**
     * Returns the raw JSON value of [rowMetaData].
     *
     * Unlike [rowMetaData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rowMetaData")
    @ExcludeMissing
    fun _rowMetaData(): JsonField<List<RowMetaData>> = rowMetaData

    /**
     * Returns the raw JSON value of [rows].
     *
     * Unlike [rows], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rows") @ExcludeMissing fun _rows(): JsonField<List<Row>> = rows

    /**
     * Returns the raw JSON value of [styles].
     *
     * Unlike [styles], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("styles") @ExcludeMissing fun _styles(): JsonField<Styles> = styles

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

    /**
     * Returns the raw JSON value of [w].
     *
     * Unlike [w], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("w") @ExcludeMissing fun _w(): JsonField<Int> = w

    /**
     * Returns the raw JSON value of [x].
     *
     * Unlike [x], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("x") @ExcludeMissing fun _x(): JsonField<Int> = x

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
         * Returns a mutable builder for constructing an instance of [LayoutSection].
         *
         * The following fields are required:
         * ```java
         * .cells()
         * .cssClass()
         * .cssId()
         * .cssStyle()
         * .label()
         * .name()
         * .params()
         * .rowMetaData()
         * .rows()
         * .styles()
         * .type()
         * .w()
         * .x()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LayoutSection]. */
    class Builder internal constructor() {

        private var cells: JsonField<MutableList<LayoutSection>>? = null
        private var cssClass: JsonField<String>? = null
        private var cssId: JsonField<String>? = null
        private var cssStyle: JsonField<String>? = null
        private var label: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var params: JsonField<Params>? = null
        private var rowMetaData: JsonField<MutableList<RowMetaData>>? = null
        private var rows: JsonField<MutableList<Row>>? = null
        private var styles: JsonField<Styles>? = null
        private var type: JsonField<String>? = null
        private var w: JsonField<Int>? = null
        private var x: JsonField<Int>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(layoutSection: LayoutSection) = apply {
            cells = layoutSection.cells.map { it.toMutableList() }
            cssClass = layoutSection.cssClass
            cssId = layoutSection.cssId
            cssStyle = layoutSection.cssStyle
            label = layoutSection.label
            name = layoutSection.name
            params = layoutSection.params
            rowMetaData = layoutSection.rowMetaData.map { it.toMutableList() }
            rows = layoutSection.rows.map { it.toMutableList() }
            styles = layoutSection.styles
            type = layoutSection.type
            w = layoutSection.w
            x = layoutSection.x
            additionalProperties = layoutSection.additionalProperties.toMutableMap()
        }

        fun cells(cells: List<LayoutSection>) = cells(JsonField.of(cells))

        /**
         * Sets [Builder.cells] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cells] with a well-typed `List<LayoutSection>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cells(cells: JsonField<List<LayoutSection>>) = apply {
            this.cells = cells.map { it.toMutableList() }
        }

        /**
         * Adds a single [LayoutSection] to [cells].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCell(cell: LayoutSection) = apply {
            cells =
                (cells ?: JsonField.of(mutableListOf())).also { checkKnown("cells", it).add(cell) }
        }

        /** The CSS class applied to the layout section. */
        fun cssClass(cssClass: String) = cssClass(JsonField.of(cssClass))

        /**
         * Sets [Builder.cssClass] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cssClass] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cssClass(cssClass: JsonField<String>) = apply { this.cssClass = cssClass }

        /** The CSS ID applied to the layout section. */
        fun cssId(cssId: String) = cssId(JsonField.of(cssId))

        /**
         * Sets [Builder.cssId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cssId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cssId(cssId: JsonField<String>) = apply { this.cssId = cssId }

        /** Custom CSS styles applied to the layout section. */
        fun cssStyle(cssStyle: String) = cssStyle(JsonField.of(cssStyle))

        /**
         * Sets [Builder.cssStyle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cssStyle] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cssStyle(cssStyle: JsonField<String>) = apply { this.cssStyle = cssStyle }

        /** The label for the layout section. */
        fun label(label: String) = label(JsonField.of(label))

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: JsonField<String>) = apply { this.label = label }

        /** The name assigned to the layout section. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** null */
        fun params(params: Params) = params(JsonField.of(params))

        /**
         * Sets [Builder.params] to an arbitrary JSON value.
         *
         * You should usually call [Builder.params] with a well-typed [Params] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun params(params: JsonField<Params>) = apply { this.params = params }

        fun rowMetaData(rowMetaData: List<RowMetaData>) = rowMetaData(JsonField.of(rowMetaData))

        /**
         * Sets [Builder.rowMetaData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rowMetaData] with a well-typed `List<RowMetaData>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rowMetaData(rowMetaData: JsonField<List<RowMetaData>>) = apply {
            this.rowMetaData = rowMetaData.map { it.toMutableList() }
        }

        /**
         * Adds a single [RowMetaData] to [Builder.rowMetaData].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRowMetaData(rowMetaData: RowMetaData) = apply {
            this.rowMetaData =
                (this.rowMetaData ?: JsonField.of(mutableListOf())).also {
                    checkKnown("rowMetaData", it).add(rowMetaData)
                }
        }

        fun rows(rows: List<Row>) = rows(JsonField.of(rows))

        /**
         * Sets [Builder.rows] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rows] with a well-typed `List<Row>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rows(rows: JsonField<List<Row>>) = apply { this.rows = rows.map { it.toMutableList() } }

        /**
         * Adds a single [Row] to [rows].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRow(row: Row) = apply {
            rows = (rows ?: JsonField.of(mutableListOf())).also { checkKnown("rows", it).add(row) }
        }

        fun styles(styles: Styles) = styles(JsonField.of(styles))

        /**
         * Sets [Builder.styles] to an arbitrary JSON value.
         *
         * You should usually call [Builder.styles] with a well-typed [Styles] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun styles(styles: JsonField<Styles>) = apply { this.styles = styles }

        /** The type of the layout section. */
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

        /** The width of the layout section. */
        fun w(w: Int) = w(JsonField.of(w))

        /**
         * Sets [Builder.w] to an arbitrary JSON value.
         *
         * You should usually call [Builder.w] with a well-typed [Int] value instead. This method is
         * primarily for setting the field to an undocumented or not yet supported value.
         */
        fun w(w: JsonField<Int>) = apply { this.w = w }

        /** The x-coordinate position of the layout section. */
        fun x(x: Int) = x(JsonField.of(x))

        /**
         * Sets [Builder.x] to an arbitrary JSON value.
         *
         * You should usually call [Builder.x] with a well-typed [Int] value instead. This method is
         * primarily for setting the field to an undocumented or not yet supported value.
         */
        fun x(x: JsonField<Int>) = apply { this.x = x }

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
         * Returns an immutable instance of [LayoutSection].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .cells()
         * .cssClass()
         * .cssId()
         * .cssStyle()
         * .label()
         * .name()
         * .params()
         * .rowMetaData()
         * .rows()
         * .styles()
         * .type()
         * .w()
         * .x()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LayoutSection =
            LayoutSection(
                checkRequired("cells", cells).map { it.toImmutable() },
                checkRequired("cssClass", cssClass),
                checkRequired("cssId", cssId),
                checkRequired("cssStyle", cssStyle),
                checkRequired("label", label),
                checkRequired("name", name),
                checkRequired("params", params),
                checkRequired("rowMetaData", rowMetaData).map { it.toImmutable() },
                checkRequired("rows", rows).map { it.toImmutable() },
                checkRequired("styles", styles),
                checkRequired("type", type),
                checkRequired("w", w),
                checkRequired("x", x),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LayoutSection = apply {
        if (validated) {
            return@apply
        }

        cells().forEach { it.validate() }
        cssClass()
        cssId()
        cssStyle()
        label()
        name()
        params().validate()
        rowMetaData().forEach { it.validate() }
        rows().forEach { it.validate() }
        styles().validate()
        type()
        w()
        x()
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
        (cells.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (cssClass.asKnown().isPresent) 1 else 0) +
            (if (cssId.asKnown().isPresent) 1 else 0) +
            (if (cssStyle.asKnown().isPresent) 1 else 0) +
            (if (label.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (params.asKnown().getOrNull()?.validity() ?: 0) +
            (rowMetaData.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (rows.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (styles.asKnown().getOrNull()?.validity() ?: 0) +
            (if (type.asKnown().isPresent) 1 else 0) +
            (if (w.asKnown().isPresent) 1 else 0) +
            (if (x.asKnown().isPresent) 1 else 0)

    /** null */
    class Params
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

            /** Returns a mutable builder for constructing an instance of [Params]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Params]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(params: Params) = apply {
                additionalProperties = params.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Params].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Params = Params(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Params = apply {
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

            return other is Params && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Params{additionalProperties=$additionalProperties}"
    }

    class Row
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

            /** Returns a mutable builder for constructing an instance of [Row]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Row]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(row: Row) = apply {
                additionalProperties = row.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Row].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Row = Row(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Row = apply {
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

            return other is Row && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Row{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LayoutSection &&
            cells == other.cells &&
            cssClass == other.cssClass &&
            cssId == other.cssId &&
            cssStyle == other.cssStyle &&
            label == other.label &&
            name == other.name &&
            params == other.params &&
            rowMetaData == other.rowMetaData &&
            rows == other.rows &&
            styles == other.styles &&
            type == other.type &&
            w == other.w &&
            x == other.x &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            cells,
            cssClass,
            cssId,
            cssStyle,
            label,
            name,
            params,
            rowMetaData,
            rows,
            styles,
            type,
            w,
            x,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LayoutSection{cells=$cells, cssClass=$cssClass, cssId=$cssId, cssStyle=$cssStyle, label=$label, name=$name, params=$params, rowMetaData=$rowMetaData, rows=$rows, styles=$styles, type=$type, w=$w, x=$x, additionalProperties=$additionalProperties}"
}
