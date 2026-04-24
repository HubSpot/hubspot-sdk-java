// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.hubdb

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ColumnRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<Int>,
    private val label: JsonField<String>,
    private val name: JsonField<String>,
    private val options: JsonField<List<HubdbOption>>,
    private val type: JsonField<Type>,
    private val foreignColumnId: JsonField<Int>,
    private val foreignTableId: JsonField<Long>,
    private val maxNumberOfCharacters: JsonField<Int>,
    private val maxNumberOfOptions: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("options")
        @ExcludeMissing
        options: JsonField<List<HubdbOption>> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("foreignColumnId")
        @ExcludeMissing
        foreignColumnId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("foreignTableId")
        @ExcludeMissing
        foreignTableId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("maxNumberOfCharacters")
        @ExcludeMissing
        maxNumberOfCharacters: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("maxNumberOfOptions")
        @ExcludeMissing
        maxNumberOfOptions: JsonField<Int> = JsonMissing.of(),
    ) : this(
        id,
        label,
        name,
        options,
        type,
        foreignColumnId,
        foreignTableId,
        maxNumberOfCharacters,
        maxNumberOfOptions,
        mutableMapOf(),
    )

    /**
     * Column Id
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): Int = id.getRequired("id")

    /**
     * Label of the column
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun label(): String = label.getRequired("label")

    /**
     * Name of the column
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Options to choose for select and multi-select columns
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun options(): List<HubdbOption> = options.getRequired("options")

    /**
     * Type of the column
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * The id of the column from another table to which the column refers/points to.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun foreignColumnId(): Optional<Int> = foreignColumnId.getOptional("foreignColumnId")

    /**
     * The id of another table to which the column refers/points to.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun foreignTableId(): Optional<Long> = foreignTableId.getOptional("foreignTableId")

    /**
     * Defines the maximum number of characters allowed in the column.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxNumberOfCharacters(): Optional<Int> =
        maxNumberOfCharacters.getOptional("maxNumberOfCharacters")

    /**
     * Specifies the maximum number of options that can be set for select and multi-select columns.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxNumberOfOptions(): Optional<Int> = maxNumberOfOptions.getOptional("maxNumberOfOptions")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Int> = id

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
     * Returns the raw JSON value of [options].
     *
     * Unlike [options], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("options") @ExcludeMissing fun _options(): JsonField<List<HubdbOption>> = options

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [foreignColumnId].
     *
     * Unlike [foreignColumnId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("foreignColumnId")
    @ExcludeMissing
    fun _foreignColumnId(): JsonField<Int> = foreignColumnId

    /**
     * Returns the raw JSON value of [foreignTableId].
     *
     * Unlike [foreignTableId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("foreignTableId")
    @ExcludeMissing
    fun _foreignTableId(): JsonField<Long> = foreignTableId

    /**
     * Returns the raw JSON value of [maxNumberOfCharacters].
     *
     * Unlike [maxNumberOfCharacters], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("maxNumberOfCharacters")
    @ExcludeMissing
    fun _maxNumberOfCharacters(): JsonField<Int> = maxNumberOfCharacters

    /**
     * Returns the raw JSON value of [maxNumberOfOptions].
     *
     * Unlike [maxNumberOfOptions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("maxNumberOfOptions")
    @ExcludeMissing
    fun _maxNumberOfOptions(): JsonField<Int> = maxNumberOfOptions

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
         * Returns a mutable builder for constructing an instance of [ColumnRequest].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .label()
         * .name()
         * .options()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ColumnRequest]. */
    class Builder internal constructor() {

        private var id: JsonField<Int>? = null
        private var label: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var options: JsonField<MutableList<HubdbOption>>? = null
        private var type: JsonField<Type>? = null
        private var foreignColumnId: JsonField<Int> = JsonMissing.of()
        private var foreignTableId: JsonField<Long> = JsonMissing.of()
        private var maxNumberOfCharacters: JsonField<Int> = JsonMissing.of()
        private var maxNumberOfOptions: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(columnRequest: ColumnRequest) = apply {
            id = columnRequest.id
            label = columnRequest.label
            name = columnRequest.name
            options = columnRequest.options.map { it.toMutableList() }
            type = columnRequest.type
            foreignColumnId = columnRequest.foreignColumnId
            foreignTableId = columnRequest.foreignTableId
            maxNumberOfCharacters = columnRequest.maxNumberOfCharacters
            maxNumberOfOptions = columnRequest.maxNumberOfOptions
            additionalProperties = columnRequest.additionalProperties.toMutableMap()
        }

        /** Column Id */
        fun id(id: Int) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [Int] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<Int>) = apply { this.id = id }

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

        /** Options to choose for select and multi-select columns */
        fun options(options: List<HubdbOption>) = options(JsonField.of(options))

        /**
         * Sets [Builder.options] to an arbitrary JSON value.
         *
         * You should usually call [Builder.options] with a well-typed `List<HubdbOption>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun options(options: JsonField<List<HubdbOption>>) = apply {
            this.options = options.map { it.toMutableList() }
        }

        /**
         * Adds a single [HubdbOption] to [options].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOption(option: HubdbOption) = apply {
            options =
                (options ?: JsonField.of(mutableListOf())).also {
                    checkKnown("options", it).add(option)
                }
        }

        /** Type of the column */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** The id of the column from another table to which the column refers/points to. */
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

        /** The id of another table to which the column refers/points to. */
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

        /** Defines the maximum number of characters allowed in the column. */
        fun maxNumberOfCharacters(maxNumberOfCharacters: Int) =
            maxNumberOfCharacters(JsonField.of(maxNumberOfCharacters))

        /**
         * Sets [Builder.maxNumberOfCharacters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxNumberOfCharacters] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxNumberOfCharacters(maxNumberOfCharacters: JsonField<Int>) = apply {
            this.maxNumberOfCharacters = maxNumberOfCharacters
        }

        /**
         * Specifies the maximum number of options that can be set for select and multi-select
         * columns.
         */
        fun maxNumberOfOptions(maxNumberOfOptions: Int) =
            maxNumberOfOptions(JsonField.of(maxNumberOfOptions))

        /**
         * Sets [Builder.maxNumberOfOptions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxNumberOfOptions] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxNumberOfOptions(maxNumberOfOptions: JsonField<Int>) = apply {
            this.maxNumberOfOptions = maxNumberOfOptions
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
         * Returns an immutable instance of [ColumnRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .label()
         * .name()
         * .options()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ColumnRequest =
            ColumnRequest(
                checkRequired("id", id),
                checkRequired("label", label),
                checkRequired("name", name),
                checkRequired("options", options).map { it.toImmutable() },
                checkRequired("type", type),
                foreignColumnId,
                foreignTableId,
                maxNumberOfCharacters,
                maxNumberOfOptions,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ColumnRequest = apply {
        if (validated) {
            return@apply
        }

        id()
        label()
        name()
        options().forEach { it.validate() }
        type().validate()
        foreignColumnId()
        foreignTableId()
        maxNumberOfCharacters()
        maxNumberOfOptions()
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
            (if (label.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (options.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (foreignColumnId.asKnown().isPresent) 1 else 0) +
            (if (foreignTableId.asKnown().isPresent) 1 else 0) +
            (if (maxNumberOfCharacters.asKnown().isPresent) 1 else 0) +
            (if (maxNumberOfOptions.asKnown().isPresent) 1 else 0)

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

            @JvmField val BOOLEAN = of("BOOLEAN")

            @JvmField val CODE = of("CODE")

            @JvmField val COMPOSITE = of("COMPOSITE")

            @JvmField val CTA = of("CTA")

            @JvmField val CURRENCY = of("CURRENCY")

            @JvmField val DATE = of("DATE")

            @JvmField val DATETIME = of("DATETIME")

            @JvmField val EMBED = of("EMBED")

            @JvmField val FILE = of("FILE")

            @JvmField val FOREIGN_ID = of("FOREIGN_ID")

            @JvmField val HUBSPOT_VIDEO = of("HUBSPOT_VIDEO")

            @JvmField val IMAGE = of("IMAGE")

            @JvmField val JSON = of("JSON")

            @JvmField val LOCATION = of("LOCATION")

            @JvmField val MULTISELECT = of("MULTISELECT")

            @JvmField val NULL = of("NULL")

            @JvmField val NUMBER = of("NUMBER")

            @JvmField val RICHTEXT = of("RICHTEXT")

            @JvmField val SELECT = of("SELECT")

            @JvmField val TEXT = of("TEXT")

            @JvmField val URL = of("URL")

            @JvmField val VIDEO = of("VIDEO")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            BOOLEAN,
            CODE,
            COMPOSITE,
            CTA,
            CURRENCY,
            DATE,
            DATETIME,
            EMBED,
            FILE,
            FOREIGN_ID,
            HUBSPOT_VIDEO,
            IMAGE,
            JSON,
            LOCATION,
            MULTISELECT,
            NULL,
            NUMBER,
            RICHTEXT,
            SELECT,
            TEXT,
            URL,
            VIDEO,
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
            BOOLEAN,
            CODE,
            COMPOSITE,
            CTA,
            CURRENCY,
            DATE,
            DATETIME,
            EMBED,
            FILE,
            FOREIGN_ID,
            HUBSPOT_VIDEO,
            IMAGE,
            JSON,
            LOCATION,
            MULTISELECT,
            NULL,
            NUMBER,
            RICHTEXT,
            SELECT,
            TEXT,
            URL,
            VIDEO,
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
                BOOLEAN -> Value.BOOLEAN
                CODE -> Value.CODE
                COMPOSITE -> Value.COMPOSITE
                CTA -> Value.CTA
                CURRENCY -> Value.CURRENCY
                DATE -> Value.DATE
                DATETIME -> Value.DATETIME
                EMBED -> Value.EMBED
                FILE -> Value.FILE
                FOREIGN_ID -> Value.FOREIGN_ID
                HUBSPOT_VIDEO -> Value.HUBSPOT_VIDEO
                IMAGE -> Value.IMAGE
                JSON -> Value.JSON
                LOCATION -> Value.LOCATION
                MULTISELECT -> Value.MULTISELECT
                NULL -> Value.NULL
                NUMBER -> Value.NUMBER
                RICHTEXT -> Value.RICHTEXT
                SELECT -> Value.SELECT
                TEXT -> Value.TEXT
                URL -> Value.URL
                VIDEO -> Value.VIDEO
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
                BOOLEAN -> Known.BOOLEAN
                CODE -> Known.CODE
                COMPOSITE -> Known.COMPOSITE
                CTA -> Known.CTA
                CURRENCY -> Known.CURRENCY
                DATE -> Known.DATE
                DATETIME -> Known.DATETIME
                EMBED -> Known.EMBED
                FILE -> Known.FILE
                FOREIGN_ID -> Known.FOREIGN_ID
                HUBSPOT_VIDEO -> Known.HUBSPOT_VIDEO
                IMAGE -> Known.IMAGE
                JSON -> Known.JSON
                LOCATION -> Known.LOCATION
                MULTISELECT -> Known.MULTISELECT
                NULL -> Known.NULL
                NUMBER -> Known.NUMBER
                RICHTEXT -> Known.RICHTEXT
                SELECT -> Known.SELECT
                TEXT -> Known.TEXT
                URL -> Known.URL
                VIDEO -> Known.VIDEO
                else -> throw HubSpotInvalidDataException("Unknown Type: $value")
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ColumnRequest &&
            id == other.id &&
            label == other.label &&
            name == other.name &&
            options == other.options &&
            type == other.type &&
            foreignColumnId == other.foreignColumnId &&
            foreignTableId == other.foreignTableId &&
            maxNumberOfCharacters == other.maxNumberOfCharacters &&
            maxNumberOfOptions == other.maxNumberOfOptions &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            label,
            name,
            options,
            type,
            foreignColumnId,
            foreignTableId,
            maxNumberOfCharacters,
            maxNumberOfOptions,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ColumnRequest{id=$id, label=$label, name=$name, options=$options, type=$type, foreignColumnId=$foreignColumnId, foreignTableId=$foreignTableId, maxNumberOfCharacters=$maxNumberOfCharacters, maxNumberOfOptions=$maxNumberOfOptions, additionalProperties=$additionalProperties}"
}
