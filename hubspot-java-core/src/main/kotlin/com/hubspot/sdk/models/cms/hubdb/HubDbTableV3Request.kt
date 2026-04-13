// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.hubdb

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkKnown
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.toImmutable
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class HubDbTableV3Request
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val allowChildTables: JsonField<Boolean>,
    private val allowPublicApiAccess: JsonField<Boolean>,
    private val columns: JsonField<List<ColumnRequest>>,
    private val dynamicMetaTags: JsonField<DynamicMetaTags>,
    private val enableChildTablePages: JsonField<Boolean>,
    private val label: JsonField<String>,
    private val name: JsonField<String>,
    private val useForPages: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("allowChildTables")
        @ExcludeMissing
        allowChildTables: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("allowPublicApiAccess")
        @ExcludeMissing
        allowPublicApiAccess: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("columns")
        @ExcludeMissing
        columns: JsonField<List<ColumnRequest>> = JsonMissing.of(),
        @JsonProperty("dynamicMetaTags")
        @ExcludeMissing
        dynamicMetaTags: JsonField<DynamicMetaTags> = JsonMissing.of(),
        @JsonProperty("enableChildTablePages")
        @ExcludeMissing
        enableChildTablePages: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("useForPages")
        @ExcludeMissing
        useForPages: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        allowChildTables,
        allowPublicApiAccess,
        columns,
        dynamicMetaTags,
        enableChildTablePages,
        label,
        name,
        useForPages,
        mutableMapOf(),
    )

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
     * List of columns in the table
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun columns(): List<ColumnRequest> = columns.getRequired("columns")

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
     * Specifies whether the table can be used for creation of dynamic pages
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun useForPages(): Boolean = useForPages.getRequired("useForPages")

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
     * Returns the raw JSON value of [columns].
     *
     * Unlike [columns], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("columns")
    @ExcludeMissing
    fun _columns(): JsonField<List<ColumnRequest>> = columns

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
     * Returns the raw JSON value of [useForPages].
     *
     * Unlike [useForPages], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("useForPages")
    @ExcludeMissing
    fun _useForPages(): JsonField<Boolean> = useForPages

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
         * Returns a mutable builder for constructing an instance of [HubDbTableV3Request].
         *
         * The following fields are required:
         * ```java
         * .allowChildTables()
         * .allowPublicApiAccess()
         * .columns()
         * .dynamicMetaTags()
         * .enableChildTablePages()
         * .label()
         * .name()
         * .useForPages()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [HubDbTableV3Request]. */
    class Builder internal constructor() {

        private var allowChildTables: JsonField<Boolean>? = null
        private var allowPublicApiAccess: JsonField<Boolean>? = null
        private var columns: JsonField<MutableList<ColumnRequest>>? = null
        private var dynamicMetaTags: JsonField<DynamicMetaTags>? = null
        private var enableChildTablePages: JsonField<Boolean>? = null
        private var label: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var useForPages: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(hubDbTableV3Request: HubDbTableV3Request) = apply {
            allowChildTables = hubDbTableV3Request.allowChildTables
            allowPublicApiAccess = hubDbTableV3Request.allowPublicApiAccess
            columns = hubDbTableV3Request.columns.map { it.toMutableList() }
            dynamicMetaTags = hubDbTableV3Request.dynamicMetaTags
            enableChildTablePages = hubDbTableV3Request.enableChildTablePages
            label = hubDbTableV3Request.label
            name = hubDbTableV3Request.name
            useForPages = hubDbTableV3Request.useForPages
            additionalProperties = hubDbTableV3Request.additionalProperties.toMutableMap()
        }

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

        /** List of columns in the table */
        fun columns(columns: List<ColumnRequest>) = columns(JsonField.of(columns))

        /**
         * Sets [Builder.columns] to an arbitrary JSON value.
         *
         * You should usually call [Builder.columns] with a well-typed `List<ColumnRequest>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun columns(columns: JsonField<List<ColumnRequest>>) = apply {
            this.columns = columns.map { it.toMutableList() }
        }

        /**
         * Adds a single [ColumnRequest] to [columns].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addColumn(column: ColumnRequest) = apply {
            columns =
                (columns ?: JsonField.of(mutableListOf())).also {
                    checkKnown("columns", it).add(column)
                }
        }

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
         * Returns an immutable instance of [HubDbTableV3Request].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .allowChildTables()
         * .allowPublicApiAccess()
         * .columns()
         * .dynamicMetaTags()
         * .enableChildTablePages()
         * .label()
         * .name()
         * .useForPages()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): HubDbTableV3Request =
            HubDbTableV3Request(
                checkRequired("allowChildTables", allowChildTables),
                checkRequired("allowPublicApiAccess", allowPublicApiAccess),
                checkRequired("columns", columns).map { it.toImmutable() },
                checkRequired("dynamicMetaTags", dynamicMetaTags),
                checkRequired("enableChildTablePages", enableChildTablePages),
                checkRequired("label", label),
                checkRequired("name", name),
                checkRequired("useForPages", useForPages),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): HubDbTableV3Request = apply {
        if (validated) {
            return@apply
        }

        allowChildTables()
        allowPublicApiAccess()
        columns().forEach { it.validate() }
        dynamicMetaTags().validate()
        enableChildTablePages()
        label()
        name()
        useForPages()
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
        (if (allowChildTables.asKnown().isPresent) 1 else 0) +
            (if (allowPublicApiAccess.asKnown().isPresent) 1 else 0) +
            (columns.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (dynamicMetaTags.asKnown().getOrNull()?.validity() ?: 0) +
            (if (enableChildTablePages.asKnown().isPresent) 1 else 0) +
            (if (label.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (useForPages.asKnown().isPresent) 1 else 0)

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

        return other is HubDbTableV3Request &&
            allowChildTables == other.allowChildTables &&
            allowPublicApiAccess == other.allowPublicApiAccess &&
            columns == other.columns &&
            dynamicMetaTags == other.dynamicMetaTags &&
            enableChildTablePages == other.enableChildTablePages &&
            label == other.label &&
            name == other.name &&
            useForPages == other.useForPages &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            allowChildTables,
            allowPublicApiAccess,
            columns,
            dynamicMetaTags,
            enableChildTablePages,
            label,
            name,
            useForPages,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "HubDbTableV3Request{allowChildTables=$allowChildTables, allowPublicApiAccess=$allowPublicApiAccess, columns=$columns, dynamicMetaTags=$dynamicMetaTags, enableChildTablePages=$enableChildTablePages, label=$label, name=$name, useForPages=$useForPages, additionalProperties=$additionalProperties}"
}
