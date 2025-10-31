// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.actions

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

class FieldTypeDefinition
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val externalOptions: JsonField<Boolean>,
    private val name: JsonField<String>,
    private val options: JsonField<List<Option>>,
    private val type: JsonField<Type>,
    private val description: JsonField<String>,
    private val externalOptionsReferenceType: JsonField<String>,
    private val fieldType: JsonField<FieldType>,
    private val helpText: JsonField<String>,
    private val label: JsonField<String>,
    private val optionsUrl: JsonField<String>,
    private val referencedObjectType: JsonField<ReferencedObjectType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("externalOptions")
        @ExcludeMissing
        externalOptions: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("options")
        @ExcludeMissing
        options: JsonField<List<Option>> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("externalOptionsReferenceType")
        @ExcludeMissing
        externalOptionsReferenceType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fieldType")
        @ExcludeMissing
        fieldType: JsonField<FieldType> = JsonMissing.of(),
        @JsonProperty("helpText") @ExcludeMissing helpText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("optionsUrl")
        @ExcludeMissing
        optionsUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("referencedObjectType")
        @ExcludeMissing
        referencedObjectType: JsonField<ReferencedObjectType> = JsonMissing.of(),
    ) : this(
        externalOptions,
        name,
        options,
        type,
        description,
        externalOptionsReferenceType,
        fieldType,
        helpText,
        label,
        optionsUrl,
        referencedObjectType,
        mutableMapOf(),
    )

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun externalOptions(): Boolean = externalOptions.getRequired("externalOptions")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun options(): List<Option> = options.getRequired("options")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalOptionsReferenceType(): Optional<String> =
        externalOptionsReferenceType.getOptional("externalOptionsReferenceType")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fieldType(): Optional<FieldType> = fieldType.getOptional("fieldType")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun helpText(): Optional<String> = helpText.getOptional("helpText")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun label(): Optional<String> = label.getOptional("label")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun optionsUrl(): Optional<String> = optionsUrl.getOptional("optionsUrl")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun referencedObjectType(): Optional<ReferencedObjectType> =
        referencedObjectType.getOptional("referencedObjectType")

    /**
     * Returns the raw JSON value of [externalOptions].
     *
     * Unlike [externalOptions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("externalOptions")
    @ExcludeMissing
    fun _externalOptions(): JsonField<Boolean> = externalOptions

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
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [externalOptionsReferenceType].
     *
     * Unlike [externalOptionsReferenceType], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("externalOptionsReferenceType")
    @ExcludeMissing
    fun _externalOptionsReferenceType(): JsonField<String> = externalOptionsReferenceType

    /**
     * Returns the raw JSON value of [fieldType].
     *
     * Unlike [fieldType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fieldType") @ExcludeMissing fun _fieldType(): JsonField<FieldType> = fieldType

    /**
     * Returns the raw JSON value of [helpText].
     *
     * Unlike [helpText], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("helpText") @ExcludeMissing fun _helpText(): JsonField<String> = helpText

    /**
     * Returns the raw JSON value of [label].
     *
     * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

    /**
     * Returns the raw JSON value of [optionsUrl].
     *
     * Unlike [optionsUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("optionsUrl") @ExcludeMissing fun _optionsUrl(): JsonField<String> = optionsUrl

    /**
     * Returns the raw JSON value of [referencedObjectType].
     *
     * Unlike [referencedObjectType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("referencedObjectType")
    @ExcludeMissing
    fun _referencedObjectType(): JsonField<ReferencedObjectType> = referencedObjectType

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
         * Returns a mutable builder for constructing an instance of [FieldTypeDefinition].
         *
         * The following fields are required:
         * ```java
         * .externalOptions()
         * .name()
         * .options()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FieldTypeDefinition]. */
    class Builder internal constructor() {

        private var externalOptions: JsonField<Boolean>? = null
        private var name: JsonField<String>? = null
        private var options: JsonField<MutableList<Option>>? = null
        private var type: JsonField<Type>? = null
        private var description: JsonField<String> = JsonMissing.of()
        private var externalOptionsReferenceType: JsonField<String> = JsonMissing.of()
        private var fieldType: JsonField<FieldType> = JsonMissing.of()
        private var helpText: JsonField<String> = JsonMissing.of()
        private var label: JsonField<String> = JsonMissing.of()
        private var optionsUrl: JsonField<String> = JsonMissing.of()
        private var referencedObjectType: JsonField<ReferencedObjectType> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(fieldTypeDefinition: FieldTypeDefinition) = apply {
            externalOptions = fieldTypeDefinition.externalOptions
            name = fieldTypeDefinition.name
            options = fieldTypeDefinition.options.map { it.toMutableList() }
            type = fieldTypeDefinition.type
            description = fieldTypeDefinition.description
            externalOptionsReferenceType = fieldTypeDefinition.externalOptionsReferenceType
            fieldType = fieldTypeDefinition.fieldType
            helpText = fieldTypeDefinition.helpText
            label = fieldTypeDefinition.label
            optionsUrl = fieldTypeDefinition.optionsUrl
            referencedObjectType = fieldTypeDefinition.referencedObjectType
            additionalProperties = fieldTypeDefinition.additionalProperties.toMutableMap()
        }

        fun externalOptions(externalOptions: Boolean) =
            externalOptions(JsonField.of(externalOptions))

        /**
         * Sets [Builder.externalOptions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalOptions] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externalOptions(externalOptions: JsonField<Boolean>) = apply {
            this.externalOptions = externalOptions
        }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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

        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun externalOptionsReferenceType(externalOptionsReferenceType: String) =
            externalOptionsReferenceType(JsonField.of(externalOptionsReferenceType))

        /**
         * Sets [Builder.externalOptionsReferenceType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalOptionsReferenceType] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun externalOptionsReferenceType(externalOptionsReferenceType: JsonField<String>) = apply {
            this.externalOptionsReferenceType = externalOptionsReferenceType
        }

        fun fieldType(fieldType: FieldType) = fieldType(JsonField.of(fieldType))

        /**
         * Sets [Builder.fieldType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fieldType] with a well-typed [FieldType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fieldType(fieldType: JsonField<FieldType>) = apply { this.fieldType = fieldType }

        fun helpText(helpText: String) = helpText(JsonField.of(helpText))

        /**
         * Sets [Builder.helpText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.helpText] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun helpText(helpText: JsonField<String>) = apply { this.helpText = helpText }

        fun label(label: String) = label(JsonField.of(label))

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: JsonField<String>) = apply { this.label = label }

        fun optionsUrl(optionsUrl: String) = optionsUrl(JsonField.of(optionsUrl))

        /**
         * Sets [Builder.optionsUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.optionsUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun optionsUrl(optionsUrl: JsonField<String>) = apply { this.optionsUrl = optionsUrl }

        fun referencedObjectType(referencedObjectType: ReferencedObjectType) =
            referencedObjectType(JsonField.of(referencedObjectType))

        /**
         * Sets [Builder.referencedObjectType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referencedObjectType] with a well-typed
         * [ReferencedObjectType] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun referencedObjectType(referencedObjectType: JsonField<ReferencedObjectType>) = apply {
            this.referencedObjectType = referencedObjectType
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
         * Returns an immutable instance of [FieldTypeDefinition].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .externalOptions()
         * .name()
         * .options()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FieldTypeDefinition =
            FieldTypeDefinition(
                checkRequired("externalOptions", externalOptions),
                checkRequired("name", name),
                checkRequired("options", options).map { it.toImmutable() },
                checkRequired("type", type),
                description,
                externalOptionsReferenceType,
                fieldType,
                helpText,
                label,
                optionsUrl,
                referencedObjectType,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FieldTypeDefinition = apply {
        if (validated) {
            return@apply
        }

        externalOptions()
        name()
        options().forEach { it.validate() }
        type().validate()
        description()
        externalOptionsReferenceType()
        fieldType().ifPresent { it.validate() }
        helpText()
        label()
        optionsUrl()
        referencedObjectType().ifPresent { it.validate() }
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
        (if (externalOptions.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (options.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (externalOptionsReferenceType.asKnown().isPresent) 1 else 0) +
            (fieldType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (helpText.asKnown().isPresent) 1 else 0) +
            (if (label.asKnown().isPresent) 1 else 0) +
            (if (optionsUrl.asKnown().isPresent) 1 else 0) +
            (referencedObjectType.asKnown().getOrNull()?.validity() ?: 0)

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

            @JvmField val STRING = of("string")

            @JvmField val NUMBER = of("number")

            @JvmField val BOOL = of("bool")

            @JvmField val DATETIME = of("datetime")

            @JvmField val ENUMERATION = of("enumeration")

            @JvmField val DATE = of("date")

            @JvmField val PHONE_NUMBER = of("phone_number")

            @JvmField val CURRENCY_NUMBER = of("currency_number")

            @JvmField val JSON = of("json")

            @JvmField val OBJECT_COORDINATES = of("object_coordinates")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            STRING,
            NUMBER,
            BOOL,
            DATETIME,
            ENUMERATION,
            DATE,
            PHONE_NUMBER,
            CURRENCY_NUMBER,
            JSON,
            OBJECT_COORDINATES,
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
            STRING,
            NUMBER,
            BOOL,
            DATETIME,
            ENUMERATION,
            DATE,
            PHONE_NUMBER,
            CURRENCY_NUMBER,
            JSON,
            OBJECT_COORDINATES,
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
                STRING -> Value.STRING
                NUMBER -> Value.NUMBER
                BOOL -> Value.BOOL
                DATETIME -> Value.DATETIME
                ENUMERATION -> Value.ENUMERATION
                DATE -> Value.DATE
                PHONE_NUMBER -> Value.PHONE_NUMBER
                CURRENCY_NUMBER -> Value.CURRENCY_NUMBER
                JSON -> Value.JSON
                OBJECT_COORDINATES -> Value.OBJECT_COORDINATES
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
                STRING -> Known.STRING
                NUMBER -> Known.NUMBER
                BOOL -> Known.BOOL
                DATETIME -> Known.DATETIME
                ENUMERATION -> Known.ENUMERATION
                DATE -> Known.DATE
                PHONE_NUMBER -> Known.PHONE_NUMBER
                CURRENCY_NUMBER -> Known.CURRENCY_NUMBER
                JSON -> Known.JSON
                OBJECT_COORDINATES -> Known.OBJECT_COORDINATES
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

    class FieldType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val BOOLEANCHECKBOX = of("booleancheckbox")

            @JvmField val CHECKBOX = of("checkbox")

            @JvmField val DATE = of("date")

            @JvmField val FILE = of("file")

            @JvmField val NUMBER = of("number")

            @JvmField val PHONENUMBER = of("phonenumber")

            @JvmField val RADIO = of("radio")

            @JvmField val SELECT = of("select")

            @JvmField val TEXT = of("text")

            @JvmField val TEXTAREA = of("textarea")

            @JvmField val CALCULATION_EQUATION = of("calculation_equation")

            @JvmField val CALCULATION_ROLLUP = of("calculation_rollup")

            @JvmField val CALCULATION_SCORE = of("calculation_score")

            @JvmField val CALCULATION_READ_TIME = of("calculation_read_time")

            @JvmField val UNKNOWN = of("unknown")

            @JvmField val HTML = of("html")

            @JvmStatic fun of(value: String) = FieldType(JsonField.of(value))
        }

        /** An enum containing [FieldType]'s known values. */
        enum class Known {
            BOOLEANCHECKBOX,
            CHECKBOX,
            DATE,
            FILE,
            NUMBER,
            PHONENUMBER,
            RADIO,
            SELECT,
            TEXT,
            TEXTAREA,
            CALCULATION_EQUATION,
            CALCULATION_ROLLUP,
            CALCULATION_SCORE,
            CALCULATION_READ_TIME,
            UNKNOWN,
            HTML,
        }

        /**
         * An enum containing [FieldType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FieldType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BOOLEANCHECKBOX,
            CHECKBOX,
            DATE,
            FILE,
            NUMBER,
            PHONENUMBER,
            RADIO,
            SELECT,
            TEXT,
            TEXTAREA,
            CALCULATION_EQUATION,
            CALCULATION_ROLLUP,
            CALCULATION_SCORE,
            CALCULATION_READ_TIME,
            UNKNOWN,
            HTML,
            /**
             * An enum member indicating that [FieldType] was instantiated with an unknown value.
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
                BOOLEANCHECKBOX -> Value.BOOLEANCHECKBOX
                CHECKBOX -> Value.CHECKBOX
                DATE -> Value.DATE
                FILE -> Value.FILE
                NUMBER -> Value.NUMBER
                PHONENUMBER -> Value.PHONENUMBER
                RADIO -> Value.RADIO
                SELECT -> Value.SELECT
                TEXT -> Value.TEXT
                TEXTAREA -> Value.TEXTAREA
                CALCULATION_EQUATION -> Value.CALCULATION_EQUATION
                CALCULATION_ROLLUP -> Value.CALCULATION_ROLLUP
                CALCULATION_SCORE -> Value.CALCULATION_SCORE
                CALCULATION_READ_TIME -> Value.CALCULATION_READ_TIME
                UNKNOWN -> Value.UNKNOWN
                HTML -> Value.HTML
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
                BOOLEANCHECKBOX -> Known.BOOLEANCHECKBOX
                CHECKBOX -> Known.CHECKBOX
                DATE -> Known.DATE
                FILE -> Known.FILE
                NUMBER -> Known.NUMBER
                PHONENUMBER -> Known.PHONENUMBER
                RADIO -> Known.RADIO
                SELECT -> Known.SELECT
                TEXT -> Known.TEXT
                TEXTAREA -> Known.TEXTAREA
                CALCULATION_EQUATION -> Known.CALCULATION_EQUATION
                CALCULATION_ROLLUP -> Known.CALCULATION_ROLLUP
                CALCULATION_SCORE -> Known.CALCULATION_SCORE
                CALCULATION_READ_TIME -> Known.CALCULATION_READ_TIME
                UNKNOWN -> Known.UNKNOWN
                HTML -> Known.HTML
                else -> throw HubspotInvalidDataException("Unknown FieldType: $value")
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

        fun validate(): FieldType = apply {
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

            return other is FieldType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class ReferencedObjectType
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

            @JvmField val CONTACT = of("CONTACT")

            @JvmField val COMPANY = of("COMPANY")

            @JvmField val DEAL = of("DEAL")

            @JvmField val ENGAGEMENT = of("ENGAGEMENT")

            @JvmField val TICKET = of("TICKET")

            @JvmField val OWNER = of("OWNER")

            @JvmField val PRODUCT = of("PRODUCT")

            @JvmField val LINE_ITEM = of("LINE_ITEM")

            @JvmField val BET_DELIVERABLE_SERVICE = of("BET_DELIVERABLE_SERVICE")

            @JvmField val CONTENT = of("CONTENT")

            @JvmField val CONVERSATION = of("CONVERSATION")

            @JvmField val BET_ALERT = of("BET_ALERT")

            @JvmField val PORTAL = of("PORTAL")

            @JvmField val QUOTE = of("QUOTE")

            @JvmField val FORM_SUBMISSION_INBOUNDDB = of("FORM_SUBMISSION_INBOUNDDB")

            @JvmField val QUOTA = of("QUOTA")

            @JvmField val UNSUBSCRIBE = of("UNSUBSCRIBE")

            @JvmField val COMMUNICATION = of("COMMUNICATION")

            @JvmField val FEEDBACK_SUBMISSION = of("FEEDBACK_SUBMISSION")

            @JvmField val ATTRIBUTION = of("ATTRIBUTION")

            @JvmField val SALESFORCE_SYNC_ERROR = of("SALESFORCE_SYNC_ERROR")

            @JvmField val RESTORABLE_CRM_OBJECT = of("RESTORABLE_CRM_OBJECT")

            @JvmField val HUB = of("HUB")

            @JvmField val LANDING_PAGE = of("LANDING_PAGE")

            @JvmField val PRODUCT_OR_FOLDER = of("PRODUCT_OR_FOLDER")

            @JvmField val TASK = of("TASK")

            @JvmField val FORM = of("FORM")

            @JvmField val MARKETING_EMAIL = of("MARKETING_EMAIL")

            @JvmField val AD_ACCOUNT = of("AD_ACCOUNT")

            @JvmField val AD_CAMPAIGN = of("AD_CAMPAIGN")

            @JvmField val AD_GROUP = of("AD_GROUP")

            @JvmField val AD = of("AD")

            @JvmField val KEYWORD = of("KEYWORD")

            @JvmField val CAMPAIGN = of("CAMPAIGN")

            @JvmField val SOCIAL_CHANNEL = of("SOCIAL_CHANNEL")

            @JvmField val SOCIAL_POST = of("SOCIAL_POST")

            @JvmField val SITE_PAGE = of("SITE_PAGE")

            @JvmField val BLOG_POST = of("BLOG_POST")

            @JvmField val IMPORT = of("IMPORT")

            @JvmField val EXPORT = of("EXPORT")

            @JvmField val CTA = of("CTA")

            @JvmField val TASK_TEMPLATE = of("TASK_TEMPLATE")

            @JvmField val AUTOMATION_PLATFORM_FLOW = of("AUTOMATION_PLATFORM_FLOW")

            @JvmField val OBJECT_LIST = of("OBJECT_LIST")

            @JvmField val NOTE = of("NOTE")

            @JvmField val MEETING_EVENT = of("MEETING_EVENT")

            @JvmField val CALL = of("CALL")

            @JvmField val EMAIL = of("EMAIL")

            @JvmField val PUBLISHING_TASK = of("PUBLISHING_TASK")

            @JvmField val CONVERSATION_SESSION = of("CONVERSATION_SESSION")

            @JvmField val CONTACT_CREATE_ATTRIBUTION = of("CONTACT_CREATE_ATTRIBUTION")

            @JvmField val INVOICE = of("INVOICE")

            @JvmField val MARKETING_EVENT = of("MARKETING_EVENT")

            @JvmField val CONVERSATION_INBOX = of("CONVERSATION_INBOX")

            @JvmField val CHATFLOW = of("CHATFLOW")

            @JvmField val MEDIA_BRIDGE = of("MEDIA_BRIDGE")

            @JvmField val SEQUENCE = of("SEQUENCE")

            @JvmField val SEQUENCE_STEP = of("SEQUENCE_STEP")

            @JvmField val FORECAST = of("FORECAST")

            @JvmField val SNIPPET = of("SNIPPET")

            @JvmField val TEMPLATE = of("TEMPLATE")

            @JvmField val DEAL_CREATE_ATTRIBUTION = of("DEAL_CREATE_ATTRIBUTION")

            @JvmField val QUOTE_TEMPLATE = of("QUOTE_TEMPLATE")

            @JvmField val QUOTE_MODULE = of("QUOTE_MODULE")

            @JvmField val QUOTE_MODULE_FIELD = of("QUOTE_MODULE_FIELD")

            @JvmField val QUOTE_FIELD = of("QUOTE_FIELD")

            @JvmField val SEQUENCE_ENROLLMENT = of("SEQUENCE_ENROLLMENT")

            @JvmField val SUBSCRIPTION = of("SUBSCRIPTION")

            @JvmField val ACCEPTANCE_TEST = of("ACCEPTANCE_TEST")

            @JvmField val SOCIAL_BROADCAST = of("SOCIAL_BROADCAST")

            @JvmField val DEAL_SPLIT = of("DEAL_SPLIT")

            @JvmField val DEAL_REGISTRATION = of("DEAL_REGISTRATION")

            @JvmField val GOAL_TARGET = of("GOAL_TARGET")

            @JvmField val GOAL_TARGET_GROUP = of("GOAL_TARGET_GROUP")

            @JvmField val PORTAL_OBJECT_SYNC_MESSAGE = of("PORTAL_OBJECT_SYNC_MESSAGE")

            @JvmField val FILE_MANAGER_FILE = of("FILE_MANAGER_FILE")

            @JvmField val FILE_MANAGER_FOLDER = of("FILE_MANAGER_FOLDER")

            @JvmField val SEQUENCE_STEP_ENROLLMENT = of("SEQUENCE_STEP_ENROLLMENT")

            @JvmField val APPROVAL = of("APPROVAL")

            @JvmField val APPROVAL_STEP = of("APPROVAL_STEP")

            @JvmField val CTA_VARIANT = of("CTA_VARIANT")

            @JvmField val SALES_DOCUMENT = of("SALES_DOCUMENT")

            @JvmField val DISCOUNT = of("DISCOUNT")

            @JvmField val FEE = of("FEE")

            @JvmField val TAX = of("TAX")

            @JvmField val MARKETING_CALENDAR = of("MARKETING_CALENDAR")

            @JvmField val PERMISSIONS_TESTING = of("PERMISSIONS_TESTING")

            @JvmField val PRIVACY_SCANNER_COOKIE = of("PRIVACY_SCANNER_COOKIE")

            @JvmField val DATA_SYNC_STATE = of("DATA_SYNC_STATE")

            @JvmField val WEB_INTERACTIVE = of("WEB_INTERACTIVE")

            @JvmField val PLAYBOOK = of("PLAYBOOK")

            @JvmField val FOLDER = of("FOLDER")

            @JvmField val PLAYBOOK_QUESTION = of("PLAYBOOK_QUESTION")

            @JvmField val PLAYBOOK_SUBMISSION = of("PLAYBOOK_SUBMISSION")

            @JvmField val PLAYBOOK_SUBMISSION_ANSWER = of("PLAYBOOK_SUBMISSION_ANSWER")

            @JvmField val COMMERCE_PAYMENT = of("COMMERCE_PAYMENT")

            @JvmField val GSC_PROPERTY = of("GSC_PROPERTY")

            @JvmField val SOX_PROTECTED_DUMMY_TYPE = of("SOX_PROTECTED_DUMMY_TYPE")

            @JvmField val BLOG_LISTING_PAGE = of("BLOG_LISTING_PAGE")

            @JvmField val QUARANTINED_SUBMISSION = of("QUARANTINED_SUBMISSION")

            @JvmField val PAYMENT_SCHEDULE = of("PAYMENT_SCHEDULE")

            @JvmField val PAYMENT_SCHEDULE_INSTALLMENT = of("PAYMENT_SCHEDULE_INSTALLMENT")

            @JvmField val MARKETING_CAMPAIGN_UTM = of("MARKETING_CAMPAIGN_UTM")

            @JvmField val DISCOUNT_TEMPLATE = of("DISCOUNT_TEMPLATE")

            @JvmField val DISCOUNT_CODE = of("DISCOUNT_CODE")

            @JvmField val FEEDBACK_SURVEY = of("FEEDBACK_SURVEY")

            @JvmField val CMS_URL = of("CMS_URL")

            @JvmField val SALES_TASK = of("SALES_TASK")

            @JvmField val SALES_WORKLOAD = of("SALES_WORKLOAD")

            @JvmField val USER = of("USER")

            @JvmField val POSTAL_MAIL = of("POSTAL_MAIL")

            @JvmField val SCHEMAS_BACKEND_TEST = of("SCHEMAS_BACKEND_TEST")

            @JvmField val PAYMENT_LINK = of("PAYMENT_LINK")

            @JvmField val SUBMISSION_TAG = of("SUBMISSION_TAG")

            @JvmField val CAMPAIGN_STEP = of("CAMPAIGN_STEP")

            @JvmField val SCHEDULING_PAGE = of("SCHEDULING_PAGE")

            @JvmField val SOX_PROTECTED_TEST_TYPE = of("SOX_PROTECTED_TEST_TYPE")

            @JvmField val ORDER = of("ORDER")

            @JvmField val MARKETING_SMS = of("MARKETING_SMS")

            @JvmField val PARTNER_ACCOUNT = of("PARTNER_ACCOUNT")

            @JvmField val CAMPAIGN_TEMPLATE = of("CAMPAIGN_TEMPLATE")

            @JvmField val CAMPAIGN_TEMPLATE_STEP = of("CAMPAIGN_TEMPLATE_STEP")

            @JvmField val PLAYLIST = of("PLAYLIST")

            @JvmField val CLIP = of("CLIP")

            @JvmField val CAMPAIGN_BUDGET_ITEM = of("CAMPAIGN_BUDGET_ITEM")

            @JvmField val CAMPAIGN_SPEND_ITEM = of("CAMPAIGN_SPEND_ITEM")

            @JvmField val MIC = of("MIC")

            @JvmField val CONTENT_AUDIT = of("CONTENT_AUDIT")

            @JvmField val CONTENT_AUDIT_PAGE = of("CONTENT_AUDIT_PAGE")

            @JvmField val PLAYLIST_FOLDER = of("PLAYLIST_FOLDER")

            @JvmField val LEAD = of("LEAD")

            @JvmField val ABANDONED_CART = of("ABANDONED_CART")

            @JvmField val EXTERNAL_WEB_URL = of("EXTERNAL_WEB_URL")

            @JvmField val VIEW = of("VIEW")

            @JvmField val VIEW_BLOCK = of("VIEW_BLOCK")

            @JvmField val ROSTER = of("ROSTER")

            @JvmField val CART = of("CART")

            @JvmField val AUTOMATION_PLATFORM_FLOW_ACTION = of("AUTOMATION_PLATFORM_FLOW_ACTION")

            @JvmField val SOCIAL_PROFILE = of("SOCIAL_PROFILE")

            @JvmField val PARTNER_CLIENT = of("PARTNER_CLIENT")

            @JvmField val ROSTER_MEMBER = of("ROSTER_MEMBER")

            @JvmField val MARKETING_EVENT_ATTENDANCE = of("MARKETING_EVENT_ATTENDANCE")

            @JvmField val ALL_PAGES = of("ALL_PAGES")

            @JvmField val AI_FORECAST = of("AI_FORECAST")

            @JvmField val CRM_PIPELINES_DUMMY_TYPE = of("CRM_PIPELINES_DUMMY_TYPE")

            @JvmField val KNOWLEDGE_ARTICLE = of("KNOWLEDGE_ARTICLE")

            @JvmField val PROPERTY_INFO = of("PROPERTY_INFO")

            @JvmField val DATA_PRIVACY_CONSENT = of("DATA_PRIVACY_CONSENT")

            @JvmField val GOAL_TEMPLATE = of("GOAL_TEMPLATE")

            @JvmField val SCORE_CONFIGURATION = of("SCORE_CONFIGURATION")

            @JvmField val AUDIENCE = of("AUDIENCE")

            @JvmField val PARTNER_CLIENT_REVENUE = of("PARTNER_CLIENT_REVENUE")

            @JvmField val AUTOMATION_JOURNEY = of("AUTOMATION_JOURNEY")

            @JvmField val UNKNOWN = of("UNKNOWN")

            @JvmStatic fun of(value: String) = ReferencedObjectType(JsonField.of(value))
        }

        /** An enum containing [ReferencedObjectType]'s known values. */
        enum class Known {
            CONTACT,
            COMPANY,
            DEAL,
            ENGAGEMENT,
            TICKET,
            OWNER,
            PRODUCT,
            LINE_ITEM,
            BET_DELIVERABLE_SERVICE,
            CONTENT,
            CONVERSATION,
            BET_ALERT,
            PORTAL,
            QUOTE,
            FORM_SUBMISSION_INBOUNDDB,
            QUOTA,
            UNSUBSCRIBE,
            COMMUNICATION,
            FEEDBACK_SUBMISSION,
            ATTRIBUTION,
            SALESFORCE_SYNC_ERROR,
            RESTORABLE_CRM_OBJECT,
            HUB,
            LANDING_PAGE,
            PRODUCT_OR_FOLDER,
            TASK,
            FORM,
            MARKETING_EMAIL,
            AD_ACCOUNT,
            AD_CAMPAIGN,
            AD_GROUP,
            AD,
            KEYWORD,
            CAMPAIGN,
            SOCIAL_CHANNEL,
            SOCIAL_POST,
            SITE_PAGE,
            BLOG_POST,
            IMPORT,
            EXPORT,
            CTA,
            TASK_TEMPLATE,
            AUTOMATION_PLATFORM_FLOW,
            OBJECT_LIST,
            NOTE,
            MEETING_EVENT,
            CALL,
            EMAIL,
            PUBLISHING_TASK,
            CONVERSATION_SESSION,
            CONTACT_CREATE_ATTRIBUTION,
            INVOICE,
            MARKETING_EVENT,
            CONVERSATION_INBOX,
            CHATFLOW,
            MEDIA_BRIDGE,
            SEQUENCE,
            SEQUENCE_STEP,
            FORECAST,
            SNIPPET,
            TEMPLATE,
            DEAL_CREATE_ATTRIBUTION,
            QUOTE_TEMPLATE,
            QUOTE_MODULE,
            QUOTE_MODULE_FIELD,
            QUOTE_FIELD,
            SEQUENCE_ENROLLMENT,
            SUBSCRIPTION,
            ACCEPTANCE_TEST,
            SOCIAL_BROADCAST,
            DEAL_SPLIT,
            DEAL_REGISTRATION,
            GOAL_TARGET,
            GOAL_TARGET_GROUP,
            PORTAL_OBJECT_SYNC_MESSAGE,
            FILE_MANAGER_FILE,
            FILE_MANAGER_FOLDER,
            SEQUENCE_STEP_ENROLLMENT,
            APPROVAL,
            APPROVAL_STEP,
            CTA_VARIANT,
            SALES_DOCUMENT,
            DISCOUNT,
            FEE,
            TAX,
            MARKETING_CALENDAR,
            PERMISSIONS_TESTING,
            PRIVACY_SCANNER_COOKIE,
            DATA_SYNC_STATE,
            WEB_INTERACTIVE,
            PLAYBOOK,
            FOLDER,
            PLAYBOOK_QUESTION,
            PLAYBOOK_SUBMISSION,
            PLAYBOOK_SUBMISSION_ANSWER,
            COMMERCE_PAYMENT,
            GSC_PROPERTY,
            SOX_PROTECTED_DUMMY_TYPE,
            BLOG_LISTING_PAGE,
            QUARANTINED_SUBMISSION,
            PAYMENT_SCHEDULE,
            PAYMENT_SCHEDULE_INSTALLMENT,
            MARKETING_CAMPAIGN_UTM,
            DISCOUNT_TEMPLATE,
            DISCOUNT_CODE,
            FEEDBACK_SURVEY,
            CMS_URL,
            SALES_TASK,
            SALES_WORKLOAD,
            USER,
            POSTAL_MAIL,
            SCHEMAS_BACKEND_TEST,
            PAYMENT_LINK,
            SUBMISSION_TAG,
            CAMPAIGN_STEP,
            SCHEDULING_PAGE,
            SOX_PROTECTED_TEST_TYPE,
            ORDER,
            MARKETING_SMS,
            PARTNER_ACCOUNT,
            CAMPAIGN_TEMPLATE,
            CAMPAIGN_TEMPLATE_STEP,
            PLAYLIST,
            CLIP,
            CAMPAIGN_BUDGET_ITEM,
            CAMPAIGN_SPEND_ITEM,
            MIC,
            CONTENT_AUDIT,
            CONTENT_AUDIT_PAGE,
            PLAYLIST_FOLDER,
            LEAD,
            ABANDONED_CART,
            EXTERNAL_WEB_URL,
            VIEW,
            VIEW_BLOCK,
            ROSTER,
            CART,
            AUTOMATION_PLATFORM_FLOW_ACTION,
            SOCIAL_PROFILE,
            PARTNER_CLIENT,
            ROSTER_MEMBER,
            MARKETING_EVENT_ATTENDANCE,
            ALL_PAGES,
            AI_FORECAST,
            CRM_PIPELINES_DUMMY_TYPE,
            KNOWLEDGE_ARTICLE,
            PROPERTY_INFO,
            DATA_PRIVACY_CONSENT,
            GOAL_TEMPLATE,
            SCORE_CONFIGURATION,
            AUDIENCE,
            PARTNER_CLIENT_REVENUE,
            AUTOMATION_JOURNEY,
            UNKNOWN,
        }

        /**
         * An enum containing [ReferencedObjectType]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [ReferencedObjectType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CONTACT,
            COMPANY,
            DEAL,
            ENGAGEMENT,
            TICKET,
            OWNER,
            PRODUCT,
            LINE_ITEM,
            BET_DELIVERABLE_SERVICE,
            CONTENT,
            CONVERSATION,
            BET_ALERT,
            PORTAL,
            QUOTE,
            FORM_SUBMISSION_INBOUNDDB,
            QUOTA,
            UNSUBSCRIBE,
            COMMUNICATION,
            FEEDBACK_SUBMISSION,
            ATTRIBUTION,
            SALESFORCE_SYNC_ERROR,
            RESTORABLE_CRM_OBJECT,
            HUB,
            LANDING_PAGE,
            PRODUCT_OR_FOLDER,
            TASK,
            FORM,
            MARKETING_EMAIL,
            AD_ACCOUNT,
            AD_CAMPAIGN,
            AD_GROUP,
            AD,
            KEYWORD,
            CAMPAIGN,
            SOCIAL_CHANNEL,
            SOCIAL_POST,
            SITE_PAGE,
            BLOG_POST,
            IMPORT,
            EXPORT,
            CTA,
            TASK_TEMPLATE,
            AUTOMATION_PLATFORM_FLOW,
            OBJECT_LIST,
            NOTE,
            MEETING_EVENT,
            CALL,
            EMAIL,
            PUBLISHING_TASK,
            CONVERSATION_SESSION,
            CONTACT_CREATE_ATTRIBUTION,
            INVOICE,
            MARKETING_EVENT,
            CONVERSATION_INBOX,
            CHATFLOW,
            MEDIA_BRIDGE,
            SEQUENCE,
            SEQUENCE_STEP,
            FORECAST,
            SNIPPET,
            TEMPLATE,
            DEAL_CREATE_ATTRIBUTION,
            QUOTE_TEMPLATE,
            QUOTE_MODULE,
            QUOTE_MODULE_FIELD,
            QUOTE_FIELD,
            SEQUENCE_ENROLLMENT,
            SUBSCRIPTION,
            ACCEPTANCE_TEST,
            SOCIAL_BROADCAST,
            DEAL_SPLIT,
            DEAL_REGISTRATION,
            GOAL_TARGET,
            GOAL_TARGET_GROUP,
            PORTAL_OBJECT_SYNC_MESSAGE,
            FILE_MANAGER_FILE,
            FILE_MANAGER_FOLDER,
            SEQUENCE_STEP_ENROLLMENT,
            APPROVAL,
            APPROVAL_STEP,
            CTA_VARIANT,
            SALES_DOCUMENT,
            DISCOUNT,
            FEE,
            TAX,
            MARKETING_CALENDAR,
            PERMISSIONS_TESTING,
            PRIVACY_SCANNER_COOKIE,
            DATA_SYNC_STATE,
            WEB_INTERACTIVE,
            PLAYBOOK,
            FOLDER,
            PLAYBOOK_QUESTION,
            PLAYBOOK_SUBMISSION,
            PLAYBOOK_SUBMISSION_ANSWER,
            COMMERCE_PAYMENT,
            GSC_PROPERTY,
            SOX_PROTECTED_DUMMY_TYPE,
            BLOG_LISTING_PAGE,
            QUARANTINED_SUBMISSION,
            PAYMENT_SCHEDULE,
            PAYMENT_SCHEDULE_INSTALLMENT,
            MARKETING_CAMPAIGN_UTM,
            DISCOUNT_TEMPLATE,
            DISCOUNT_CODE,
            FEEDBACK_SURVEY,
            CMS_URL,
            SALES_TASK,
            SALES_WORKLOAD,
            USER,
            POSTAL_MAIL,
            SCHEMAS_BACKEND_TEST,
            PAYMENT_LINK,
            SUBMISSION_TAG,
            CAMPAIGN_STEP,
            SCHEDULING_PAGE,
            SOX_PROTECTED_TEST_TYPE,
            ORDER,
            MARKETING_SMS,
            PARTNER_ACCOUNT,
            CAMPAIGN_TEMPLATE,
            CAMPAIGN_TEMPLATE_STEP,
            PLAYLIST,
            CLIP,
            CAMPAIGN_BUDGET_ITEM,
            CAMPAIGN_SPEND_ITEM,
            MIC,
            CONTENT_AUDIT,
            CONTENT_AUDIT_PAGE,
            PLAYLIST_FOLDER,
            LEAD,
            ABANDONED_CART,
            EXTERNAL_WEB_URL,
            VIEW,
            VIEW_BLOCK,
            ROSTER,
            CART,
            AUTOMATION_PLATFORM_FLOW_ACTION,
            SOCIAL_PROFILE,
            PARTNER_CLIENT,
            ROSTER_MEMBER,
            MARKETING_EVENT_ATTENDANCE,
            ALL_PAGES,
            AI_FORECAST,
            CRM_PIPELINES_DUMMY_TYPE,
            KNOWLEDGE_ARTICLE,
            PROPERTY_INFO,
            DATA_PRIVACY_CONSENT,
            GOAL_TEMPLATE,
            SCORE_CONFIGURATION,
            AUDIENCE,
            PARTNER_CLIENT_REVENUE,
            AUTOMATION_JOURNEY,
            UNKNOWN,
            /**
             * An enum member indicating that [ReferencedObjectType] was instantiated with an
             * unknown value.
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
                CONTACT -> Value.CONTACT
                COMPANY -> Value.COMPANY
                DEAL -> Value.DEAL
                ENGAGEMENT -> Value.ENGAGEMENT
                TICKET -> Value.TICKET
                OWNER -> Value.OWNER
                PRODUCT -> Value.PRODUCT
                LINE_ITEM -> Value.LINE_ITEM
                BET_DELIVERABLE_SERVICE -> Value.BET_DELIVERABLE_SERVICE
                CONTENT -> Value.CONTENT
                CONVERSATION -> Value.CONVERSATION
                BET_ALERT -> Value.BET_ALERT
                PORTAL -> Value.PORTAL
                QUOTE -> Value.QUOTE
                FORM_SUBMISSION_INBOUNDDB -> Value.FORM_SUBMISSION_INBOUNDDB
                QUOTA -> Value.QUOTA
                UNSUBSCRIBE -> Value.UNSUBSCRIBE
                COMMUNICATION -> Value.COMMUNICATION
                FEEDBACK_SUBMISSION -> Value.FEEDBACK_SUBMISSION
                ATTRIBUTION -> Value.ATTRIBUTION
                SALESFORCE_SYNC_ERROR -> Value.SALESFORCE_SYNC_ERROR
                RESTORABLE_CRM_OBJECT -> Value.RESTORABLE_CRM_OBJECT
                HUB -> Value.HUB
                LANDING_PAGE -> Value.LANDING_PAGE
                PRODUCT_OR_FOLDER -> Value.PRODUCT_OR_FOLDER
                TASK -> Value.TASK
                FORM -> Value.FORM
                MARKETING_EMAIL -> Value.MARKETING_EMAIL
                AD_ACCOUNT -> Value.AD_ACCOUNT
                AD_CAMPAIGN -> Value.AD_CAMPAIGN
                AD_GROUP -> Value.AD_GROUP
                AD -> Value.AD
                KEYWORD -> Value.KEYWORD
                CAMPAIGN -> Value.CAMPAIGN
                SOCIAL_CHANNEL -> Value.SOCIAL_CHANNEL
                SOCIAL_POST -> Value.SOCIAL_POST
                SITE_PAGE -> Value.SITE_PAGE
                BLOG_POST -> Value.BLOG_POST
                IMPORT -> Value.IMPORT
                EXPORT -> Value.EXPORT
                CTA -> Value.CTA
                TASK_TEMPLATE -> Value.TASK_TEMPLATE
                AUTOMATION_PLATFORM_FLOW -> Value.AUTOMATION_PLATFORM_FLOW
                OBJECT_LIST -> Value.OBJECT_LIST
                NOTE -> Value.NOTE
                MEETING_EVENT -> Value.MEETING_EVENT
                CALL -> Value.CALL
                EMAIL -> Value.EMAIL
                PUBLISHING_TASK -> Value.PUBLISHING_TASK
                CONVERSATION_SESSION -> Value.CONVERSATION_SESSION
                CONTACT_CREATE_ATTRIBUTION -> Value.CONTACT_CREATE_ATTRIBUTION
                INVOICE -> Value.INVOICE
                MARKETING_EVENT -> Value.MARKETING_EVENT
                CONVERSATION_INBOX -> Value.CONVERSATION_INBOX
                CHATFLOW -> Value.CHATFLOW
                MEDIA_BRIDGE -> Value.MEDIA_BRIDGE
                SEQUENCE -> Value.SEQUENCE
                SEQUENCE_STEP -> Value.SEQUENCE_STEP
                FORECAST -> Value.FORECAST
                SNIPPET -> Value.SNIPPET
                TEMPLATE -> Value.TEMPLATE
                DEAL_CREATE_ATTRIBUTION -> Value.DEAL_CREATE_ATTRIBUTION
                QUOTE_TEMPLATE -> Value.QUOTE_TEMPLATE
                QUOTE_MODULE -> Value.QUOTE_MODULE
                QUOTE_MODULE_FIELD -> Value.QUOTE_MODULE_FIELD
                QUOTE_FIELD -> Value.QUOTE_FIELD
                SEQUENCE_ENROLLMENT -> Value.SEQUENCE_ENROLLMENT
                SUBSCRIPTION -> Value.SUBSCRIPTION
                ACCEPTANCE_TEST -> Value.ACCEPTANCE_TEST
                SOCIAL_BROADCAST -> Value.SOCIAL_BROADCAST
                DEAL_SPLIT -> Value.DEAL_SPLIT
                DEAL_REGISTRATION -> Value.DEAL_REGISTRATION
                GOAL_TARGET -> Value.GOAL_TARGET
                GOAL_TARGET_GROUP -> Value.GOAL_TARGET_GROUP
                PORTAL_OBJECT_SYNC_MESSAGE -> Value.PORTAL_OBJECT_SYNC_MESSAGE
                FILE_MANAGER_FILE -> Value.FILE_MANAGER_FILE
                FILE_MANAGER_FOLDER -> Value.FILE_MANAGER_FOLDER
                SEQUENCE_STEP_ENROLLMENT -> Value.SEQUENCE_STEP_ENROLLMENT
                APPROVAL -> Value.APPROVAL
                APPROVAL_STEP -> Value.APPROVAL_STEP
                CTA_VARIANT -> Value.CTA_VARIANT
                SALES_DOCUMENT -> Value.SALES_DOCUMENT
                DISCOUNT -> Value.DISCOUNT
                FEE -> Value.FEE
                TAX -> Value.TAX
                MARKETING_CALENDAR -> Value.MARKETING_CALENDAR
                PERMISSIONS_TESTING -> Value.PERMISSIONS_TESTING
                PRIVACY_SCANNER_COOKIE -> Value.PRIVACY_SCANNER_COOKIE
                DATA_SYNC_STATE -> Value.DATA_SYNC_STATE
                WEB_INTERACTIVE -> Value.WEB_INTERACTIVE
                PLAYBOOK -> Value.PLAYBOOK
                FOLDER -> Value.FOLDER
                PLAYBOOK_QUESTION -> Value.PLAYBOOK_QUESTION
                PLAYBOOK_SUBMISSION -> Value.PLAYBOOK_SUBMISSION
                PLAYBOOK_SUBMISSION_ANSWER -> Value.PLAYBOOK_SUBMISSION_ANSWER
                COMMERCE_PAYMENT -> Value.COMMERCE_PAYMENT
                GSC_PROPERTY -> Value.GSC_PROPERTY
                SOX_PROTECTED_DUMMY_TYPE -> Value.SOX_PROTECTED_DUMMY_TYPE
                BLOG_LISTING_PAGE -> Value.BLOG_LISTING_PAGE
                QUARANTINED_SUBMISSION -> Value.QUARANTINED_SUBMISSION
                PAYMENT_SCHEDULE -> Value.PAYMENT_SCHEDULE
                PAYMENT_SCHEDULE_INSTALLMENT -> Value.PAYMENT_SCHEDULE_INSTALLMENT
                MARKETING_CAMPAIGN_UTM -> Value.MARKETING_CAMPAIGN_UTM
                DISCOUNT_TEMPLATE -> Value.DISCOUNT_TEMPLATE
                DISCOUNT_CODE -> Value.DISCOUNT_CODE
                FEEDBACK_SURVEY -> Value.FEEDBACK_SURVEY
                CMS_URL -> Value.CMS_URL
                SALES_TASK -> Value.SALES_TASK
                SALES_WORKLOAD -> Value.SALES_WORKLOAD
                USER -> Value.USER
                POSTAL_MAIL -> Value.POSTAL_MAIL
                SCHEMAS_BACKEND_TEST -> Value.SCHEMAS_BACKEND_TEST
                PAYMENT_LINK -> Value.PAYMENT_LINK
                SUBMISSION_TAG -> Value.SUBMISSION_TAG
                CAMPAIGN_STEP -> Value.CAMPAIGN_STEP
                SCHEDULING_PAGE -> Value.SCHEDULING_PAGE
                SOX_PROTECTED_TEST_TYPE -> Value.SOX_PROTECTED_TEST_TYPE
                ORDER -> Value.ORDER
                MARKETING_SMS -> Value.MARKETING_SMS
                PARTNER_ACCOUNT -> Value.PARTNER_ACCOUNT
                CAMPAIGN_TEMPLATE -> Value.CAMPAIGN_TEMPLATE
                CAMPAIGN_TEMPLATE_STEP -> Value.CAMPAIGN_TEMPLATE_STEP
                PLAYLIST -> Value.PLAYLIST
                CLIP -> Value.CLIP
                CAMPAIGN_BUDGET_ITEM -> Value.CAMPAIGN_BUDGET_ITEM
                CAMPAIGN_SPEND_ITEM -> Value.CAMPAIGN_SPEND_ITEM
                MIC -> Value.MIC
                CONTENT_AUDIT -> Value.CONTENT_AUDIT
                CONTENT_AUDIT_PAGE -> Value.CONTENT_AUDIT_PAGE
                PLAYLIST_FOLDER -> Value.PLAYLIST_FOLDER
                LEAD -> Value.LEAD
                ABANDONED_CART -> Value.ABANDONED_CART
                EXTERNAL_WEB_URL -> Value.EXTERNAL_WEB_URL
                VIEW -> Value.VIEW
                VIEW_BLOCK -> Value.VIEW_BLOCK
                ROSTER -> Value.ROSTER
                CART -> Value.CART
                AUTOMATION_PLATFORM_FLOW_ACTION -> Value.AUTOMATION_PLATFORM_FLOW_ACTION
                SOCIAL_PROFILE -> Value.SOCIAL_PROFILE
                PARTNER_CLIENT -> Value.PARTNER_CLIENT
                ROSTER_MEMBER -> Value.ROSTER_MEMBER
                MARKETING_EVENT_ATTENDANCE -> Value.MARKETING_EVENT_ATTENDANCE
                ALL_PAGES -> Value.ALL_PAGES
                AI_FORECAST -> Value.AI_FORECAST
                CRM_PIPELINES_DUMMY_TYPE -> Value.CRM_PIPELINES_DUMMY_TYPE
                KNOWLEDGE_ARTICLE -> Value.KNOWLEDGE_ARTICLE
                PROPERTY_INFO -> Value.PROPERTY_INFO
                DATA_PRIVACY_CONSENT -> Value.DATA_PRIVACY_CONSENT
                GOAL_TEMPLATE -> Value.GOAL_TEMPLATE
                SCORE_CONFIGURATION -> Value.SCORE_CONFIGURATION
                AUDIENCE -> Value.AUDIENCE
                PARTNER_CLIENT_REVENUE -> Value.PARTNER_CLIENT_REVENUE
                AUTOMATION_JOURNEY -> Value.AUTOMATION_JOURNEY
                UNKNOWN -> Value.UNKNOWN
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
                CONTACT -> Known.CONTACT
                COMPANY -> Known.COMPANY
                DEAL -> Known.DEAL
                ENGAGEMENT -> Known.ENGAGEMENT
                TICKET -> Known.TICKET
                OWNER -> Known.OWNER
                PRODUCT -> Known.PRODUCT
                LINE_ITEM -> Known.LINE_ITEM
                BET_DELIVERABLE_SERVICE -> Known.BET_DELIVERABLE_SERVICE
                CONTENT -> Known.CONTENT
                CONVERSATION -> Known.CONVERSATION
                BET_ALERT -> Known.BET_ALERT
                PORTAL -> Known.PORTAL
                QUOTE -> Known.QUOTE
                FORM_SUBMISSION_INBOUNDDB -> Known.FORM_SUBMISSION_INBOUNDDB
                QUOTA -> Known.QUOTA
                UNSUBSCRIBE -> Known.UNSUBSCRIBE
                COMMUNICATION -> Known.COMMUNICATION
                FEEDBACK_SUBMISSION -> Known.FEEDBACK_SUBMISSION
                ATTRIBUTION -> Known.ATTRIBUTION
                SALESFORCE_SYNC_ERROR -> Known.SALESFORCE_SYNC_ERROR
                RESTORABLE_CRM_OBJECT -> Known.RESTORABLE_CRM_OBJECT
                HUB -> Known.HUB
                LANDING_PAGE -> Known.LANDING_PAGE
                PRODUCT_OR_FOLDER -> Known.PRODUCT_OR_FOLDER
                TASK -> Known.TASK
                FORM -> Known.FORM
                MARKETING_EMAIL -> Known.MARKETING_EMAIL
                AD_ACCOUNT -> Known.AD_ACCOUNT
                AD_CAMPAIGN -> Known.AD_CAMPAIGN
                AD_GROUP -> Known.AD_GROUP
                AD -> Known.AD
                KEYWORD -> Known.KEYWORD
                CAMPAIGN -> Known.CAMPAIGN
                SOCIAL_CHANNEL -> Known.SOCIAL_CHANNEL
                SOCIAL_POST -> Known.SOCIAL_POST
                SITE_PAGE -> Known.SITE_PAGE
                BLOG_POST -> Known.BLOG_POST
                IMPORT -> Known.IMPORT
                EXPORT -> Known.EXPORT
                CTA -> Known.CTA
                TASK_TEMPLATE -> Known.TASK_TEMPLATE
                AUTOMATION_PLATFORM_FLOW -> Known.AUTOMATION_PLATFORM_FLOW
                OBJECT_LIST -> Known.OBJECT_LIST
                NOTE -> Known.NOTE
                MEETING_EVENT -> Known.MEETING_EVENT
                CALL -> Known.CALL
                EMAIL -> Known.EMAIL
                PUBLISHING_TASK -> Known.PUBLISHING_TASK
                CONVERSATION_SESSION -> Known.CONVERSATION_SESSION
                CONTACT_CREATE_ATTRIBUTION -> Known.CONTACT_CREATE_ATTRIBUTION
                INVOICE -> Known.INVOICE
                MARKETING_EVENT -> Known.MARKETING_EVENT
                CONVERSATION_INBOX -> Known.CONVERSATION_INBOX
                CHATFLOW -> Known.CHATFLOW
                MEDIA_BRIDGE -> Known.MEDIA_BRIDGE
                SEQUENCE -> Known.SEQUENCE
                SEQUENCE_STEP -> Known.SEQUENCE_STEP
                FORECAST -> Known.FORECAST
                SNIPPET -> Known.SNIPPET
                TEMPLATE -> Known.TEMPLATE
                DEAL_CREATE_ATTRIBUTION -> Known.DEAL_CREATE_ATTRIBUTION
                QUOTE_TEMPLATE -> Known.QUOTE_TEMPLATE
                QUOTE_MODULE -> Known.QUOTE_MODULE
                QUOTE_MODULE_FIELD -> Known.QUOTE_MODULE_FIELD
                QUOTE_FIELD -> Known.QUOTE_FIELD
                SEQUENCE_ENROLLMENT -> Known.SEQUENCE_ENROLLMENT
                SUBSCRIPTION -> Known.SUBSCRIPTION
                ACCEPTANCE_TEST -> Known.ACCEPTANCE_TEST
                SOCIAL_BROADCAST -> Known.SOCIAL_BROADCAST
                DEAL_SPLIT -> Known.DEAL_SPLIT
                DEAL_REGISTRATION -> Known.DEAL_REGISTRATION
                GOAL_TARGET -> Known.GOAL_TARGET
                GOAL_TARGET_GROUP -> Known.GOAL_TARGET_GROUP
                PORTAL_OBJECT_SYNC_MESSAGE -> Known.PORTAL_OBJECT_SYNC_MESSAGE
                FILE_MANAGER_FILE -> Known.FILE_MANAGER_FILE
                FILE_MANAGER_FOLDER -> Known.FILE_MANAGER_FOLDER
                SEQUENCE_STEP_ENROLLMENT -> Known.SEQUENCE_STEP_ENROLLMENT
                APPROVAL -> Known.APPROVAL
                APPROVAL_STEP -> Known.APPROVAL_STEP
                CTA_VARIANT -> Known.CTA_VARIANT
                SALES_DOCUMENT -> Known.SALES_DOCUMENT
                DISCOUNT -> Known.DISCOUNT
                FEE -> Known.FEE
                TAX -> Known.TAX
                MARKETING_CALENDAR -> Known.MARKETING_CALENDAR
                PERMISSIONS_TESTING -> Known.PERMISSIONS_TESTING
                PRIVACY_SCANNER_COOKIE -> Known.PRIVACY_SCANNER_COOKIE
                DATA_SYNC_STATE -> Known.DATA_SYNC_STATE
                WEB_INTERACTIVE -> Known.WEB_INTERACTIVE
                PLAYBOOK -> Known.PLAYBOOK
                FOLDER -> Known.FOLDER
                PLAYBOOK_QUESTION -> Known.PLAYBOOK_QUESTION
                PLAYBOOK_SUBMISSION -> Known.PLAYBOOK_SUBMISSION
                PLAYBOOK_SUBMISSION_ANSWER -> Known.PLAYBOOK_SUBMISSION_ANSWER
                COMMERCE_PAYMENT -> Known.COMMERCE_PAYMENT
                GSC_PROPERTY -> Known.GSC_PROPERTY
                SOX_PROTECTED_DUMMY_TYPE -> Known.SOX_PROTECTED_DUMMY_TYPE
                BLOG_LISTING_PAGE -> Known.BLOG_LISTING_PAGE
                QUARANTINED_SUBMISSION -> Known.QUARANTINED_SUBMISSION
                PAYMENT_SCHEDULE -> Known.PAYMENT_SCHEDULE
                PAYMENT_SCHEDULE_INSTALLMENT -> Known.PAYMENT_SCHEDULE_INSTALLMENT
                MARKETING_CAMPAIGN_UTM -> Known.MARKETING_CAMPAIGN_UTM
                DISCOUNT_TEMPLATE -> Known.DISCOUNT_TEMPLATE
                DISCOUNT_CODE -> Known.DISCOUNT_CODE
                FEEDBACK_SURVEY -> Known.FEEDBACK_SURVEY
                CMS_URL -> Known.CMS_URL
                SALES_TASK -> Known.SALES_TASK
                SALES_WORKLOAD -> Known.SALES_WORKLOAD
                USER -> Known.USER
                POSTAL_MAIL -> Known.POSTAL_MAIL
                SCHEMAS_BACKEND_TEST -> Known.SCHEMAS_BACKEND_TEST
                PAYMENT_LINK -> Known.PAYMENT_LINK
                SUBMISSION_TAG -> Known.SUBMISSION_TAG
                CAMPAIGN_STEP -> Known.CAMPAIGN_STEP
                SCHEDULING_PAGE -> Known.SCHEDULING_PAGE
                SOX_PROTECTED_TEST_TYPE -> Known.SOX_PROTECTED_TEST_TYPE
                ORDER -> Known.ORDER
                MARKETING_SMS -> Known.MARKETING_SMS
                PARTNER_ACCOUNT -> Known.PARTNER_ACCOUNT
                CAMPAIGN_TEMPLATE -> Known.CAMPAIGN_TEMPLATE
                CAMPAIGN_TEMPLATE_STEP -> Known.CAMPAIGN_TEMPLATE_STEP
                PLAYLIST -> Known.PLAYLIST
                CLIP -> Known.CLIP
                CAMPAIGN_BUDGET_ITEM -> Known.CAMPAIGN_BUDGET_ITEM
                CAMPAIGN_SPEND_ITEM -> Known.CAMPAIGN_SPEND_ITEM
                MIC -> Known.MIC
                CONTENT_AUDIT -> Known.CONTENT_AUDIT
                CONTENT_AUDIT_PAGE -> Known.CONTENT_AUDIT_PAGE
                PLAYLIST_FOLDER -> Known.PLAYLIST_FOLDER
                LEAD -> Known.LEAD
                ABANDONED_CART -> Known.ABANDONED_CART
                EXTERNAL_WEB_URL -> Known.EXTERNAL_WEB_URL
                VIEW -> Known.VIEW
                VIEW_BLOCK -> Known.VIEW_BLOCK
                ROSTER -> Known.ROSTER
                CART -> Known.CART
                AUTOMATION_PLATFORM_FLOW_ACTION -> Known.AUTOMATION_PLATFORM_FLOW_ACTION
                SOCIAL_PROFILE -> Known.SOCIAL_PROFILE
                PARTNER_CLIENT -> Known.PARTNER_CLIENT
                ROSTER_MEMBER -> Known.ROSTER_MEMBER
                MARKETING_EVENT_ATTENDANCE -> Known.MARKETING_EVENT_ATTENDANCE
                ALL_PAGES -> Known.ALL_PAGES
                AI_FORECAST -> Known.AI_FORECAST
                CRM_PIPELINES_DUMMY_TYPE -> Known.CRM_PIPELINES_DUMMY_TYPE
                KNOWLEDGE_ARTICLE -> Known.KNOWLEDGE_ARTICLE
                PROPERTY_INFO -> Known.PROPERTY_INFO
                DATA_PRIVACY_CONSENT -> Known.DATA_PRIVACY_CONSENT
                GOAL_TEMPLATE -> Known.GOAL_TEMPLATE
                SCORE_CONFIGURATION -> Known.SCORE_CONFIGURATION
                AUDIENCE -> Known.AUDIENCE
                PARTNER_CLIENT_REVENUE -> Known.PARTNER_CLIENT_REVENUE
                AUTOMATION_JOURNEY -> Known.AUTOMATION_JOURNEY
                UNKNOWN -> Known.UNKNOWN
                else -> throw HubspotInvalidDataException("Unknown ReferencedObjectType: $value")
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

        fun validate(): ReferencedObjectType = apply {
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

            return other is ReferencedObjectType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FieldTypeDefinition &&
            externalOptions == other.externalOptions &&
            name == other.name &&
            options == other.options &&
            type == other.type &&
            description == other.description &&
            externalOptionsReferenceType == other.externalOptionsReferenceType &&
            fieldType == other.fieldType &&
            helpText == other.helpText &&
            label == other.label &&
            optionsUrl == other.optionsUrl &&
            referencedObjectType == other.referencedObjectType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            externalOptions,
            name,
            options,
            type,
            description,
            externalOptionsReferenceType,
            fieldType,
            helpText,
            label,
            optionsUrl,
            referencedObjectType,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FieldTypeDefinition{externalOptions=$externalOptions, name=$name, options=$options, type=$type, description=$description, externalOptionsReferenceType=$externalOptionsReferenceType, fieldType=$fieldType, helpText=$helpText, label=$label, optionsUrl=$optionsUrl, referencedObjectType=$referencedObjectType, additionalProperties=$additionalProperties}"
}
