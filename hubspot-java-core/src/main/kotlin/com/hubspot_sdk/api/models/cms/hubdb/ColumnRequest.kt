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
    private val options: JsonField<List<Option>>,
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
        options: JsonField<List<Option>> = JsonMissing.of(),
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
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): Int = id.getRequired("id")

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
     * Options to choose for select and multi-select columns
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun options(): List<Option> = options.getRequired("options")

    /**
     * Type of the column
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * The id of the column from another table to which the column refers/points to.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun foreignColumnId(): Optional<Int> = foreignColumnId.getOptional("foreignColumnId")

    /**
     * The id of another table to which the column refers/points to.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun foreignTableId(): Optional<Long> = foreignTableId.getOptional("foreignTableId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxNumberOfCharacters(): Optional<Int> =
        maxNumberOfCharacters.getOptional("maxNumberOfCharacters")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
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
    @JsonProperty("options") @ExcludeMissing fun _options(): JsonField<List<Option>> = options

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
        private var options: JsonField<MutableList<Option>>? = null
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
