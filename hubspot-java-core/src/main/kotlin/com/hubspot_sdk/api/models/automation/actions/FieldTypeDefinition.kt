// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.actions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.BaseDeserializer
import com.hubspot_sdk.api.core.BaseSerializer
import com.hubspot_sdk.api.core.Enum
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.allMaxBy
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.getOrThrow
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
    private val schema: JsonField<Schema>,
    private val type: JsonField<Type>,
    private val useChirp: JsonField<Boolean>,
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
        @JsonProperty("schema") @ExcludeMissing schema: JsonField<Schema> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("useChirp") @ExcludeMissing useChirp: JsonField<Boolean> = JsonMissing.of(),
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
        schema,
        type,
        useChirp,
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
    fun schema(): Schema = schema.getRequired("schema")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun useChirp(): Boolean = useChirp.getRequired("useChirp")

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
     * Returns the raw JSON value of [schema].
     *
     * Unlike [schema], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("schema") @ExcludeMissing fun _schema(): JsonField<Schema> = schema

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [useChirp].
     *
     * Unlike [useChirp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("useChirp") @ExcludeMissing fun _useChirp(): JsonField<Boolean> = useChirp

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
         * .schema()
         * .type()
         * .useChirp()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FieldTypeDefinition]. */
    class Builder internal constructor() {

        private var externalOptions: JsonField<Boolean>? = null
        private var name: JsonField<String>? = null
        private var options: JsonField<MutableList<Option>>? = null
        private var schema: JsonField<Schema>? = null
        private var type: JsonField<Type>? = null
        private var useChirp: JsonField<Boolean>? = null
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
            schema = fieldTypeDefinition.schema
            type = fieldTypeDefinition.type
            useChirp = fieldTypeDefinition.useChirp
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

        fun schema(schema: Schema) = schema(JsonField.of(schema))

        /**
         * Sets [Builder.schema] to an arbitrary JSON value.
         *
         * You should usually call [Builder.schema] with a well-typed [Schema] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun schema(schema: JsonField<Schema>) = apply { this.schema = schema }

        /** Alias for calling [schema] with `Schema.ofIntegerField(integerField)`. */
        fun schema(integerField: IntegerFieldSchema) = schema(Schema.ofIntegerField(integerField))

        /** Alias for calling [schema] with `Schema.ofLongField(longField)`. */
        fun schema(longField: LongFieldSchema) = schema(Schema.ofLongField(longField))

        /** Alias for calling [schema] with `Schema.ofDoubleField(doubleField)`. */
        fun schema(doubleField: DoubleFieldSchema) = schema(Schema.ofDoubleField(doubleField))

        /** Alias for calling [schema] with `Schema.ofStringField(stringField)`. */
        fun schema(stringField: StringFieldSchema) = schema(Schema.ofStringField(stringField))

        /** Alias for calling [schema] with `Schema.ofBooleanField(booleanField)`. */
        fun schema(booleanField: BooleanFieldSchema) = schema(Schema.ofBooleanField(booleanField))

        /** Alias for calling [schema] with `Schema.ofArrayField(arrayField)`. */
        fun schema(arrayField: ArrayFieldSchema) = schema(Schema.ofArrayField(arrayField))

        /** Alias for calling [schema] with `Schema.ofObjectField(objectField)`. */
        fun schema(objectField: ObjectFieldSchema) = schema(Schema.ofObjectField(objectField))

        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun useChirp(useChirp: Boolean) = useChirp(JsonField.of(useChirp))

        /**
         * Sets [Builder.useChirp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.useChirp] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun useChirp(useChirp: JsonField<Boolean>) = apply { this.useChirp = useChirp }

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
         * .schema()
         * .type()
         * .useChirp()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FieldTypeDefinition =
            FieldTypeDefinition(
                checkRequired("externalOptions", externalOptions),
                checkRequired("name", name),
                checkRequired("options", options).map { it.toImmutable() },
                checkRequired("schema", schema),
                checkRequired("type", type),
                checkRequired("useChirp", useChirp),
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
        schema().validate()
        type().validate()
        useChirp()
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
            (schema.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (useChirp.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (externalOptionsReferenceType.asKnown().isPresent) 1 else 0) +
            (fieldType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (helpText.asKnown().isPresent) 1 else 0) +
            (if (label.asKnown().isPresent) 1 else 0) +
            (if (optionsUrl.asKnown().isPresent) 1 else 0) +
            (referencedObjectType.asKnown().getOrNull()?.validity() ?: 0)

    @JsonDeserialize(using = Schema.Deserializer::class)
    @JsonSerialize(using = Schema.Serializer::class)
    class Schema
    private constructor(
        private val integerField: IntegerFieldSchema? = null,
        private val longField: LongFieldSchema? = null,
        private val doubleField: DoubleFieldSchema? = null,
        private val stringField: StringFieldSchema? = null,
        private val booleanField: BooleanFieldSchema? = null,
        private val arrayField: ArrayFieldSchema? = null,
        private val objectField: ObjectFieldSchema? = null,
        private val _json: JsonValue? = null,
    ) {

        fun integerField(): Optional<IntegerFieldSchema> = Optional.ofNullable(integerField)

        fun longField(): Optional<LongFieldSchema> = Optional.ofNullable(longField)

        fun doubleField(): Optional<DoubleFieldSchema> = Optional.ofNullable(doubleField)

        fun stringField(): Optional<StringFieldSchema> = Optional.ofNullable(stringField)

        fun booleanField(): Optional<BooleanFieldSchema> = Optional.ofNullable(booleanField)

        fun arrayField(): Optional<ArrayFieldSchema> = Optional.ofNullable(arrayField)

        fun objectField(): Optional<ObjectFieldSchema> = Optional.ofNullable(objectField)

        fun isIntegerField(): Boolean = integerField != null

        fun isLongField(): Boolean = longField != null

        fun isDoubleField(): Boolean = doubleField != null

        fun isStringField(): Boolean = stringField != null

        fun isBooleanField(): Boolean = booleanField != null

        fun isArrayField(): Boolean = arrayField != null

        fun isObjectField(): Boolean = objectField != null

        fun asIntegerField(): IntegerFieldSchema = integerField.getOrThrow("integerField")

        fun asLongField(): LongFieldSchema = longField.getOrThrow("longField")

        fun asDoubleField(): DoubleFieldSchema = doubleField.getOrThrow("doubleField")

        fun asStringField(): StringFieldSchema = stringField.getOrThrow("stringField")

        fun asBooleanField(): BooleanFieldSchema = booleanField.getOrThrow("booleanField")

        fun asArrayField(): ArrayFieldSchema = arrayField.getOrThrow("arrayField")

        fun asObjectField(): ObjectFieldSchema = objectField.getOrThrow("objectField")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                integerField != null -> visitor.visitIntegerField(integerField)
                longField != null -> visitor.visitLongField(longField)
                doubleField != null -> visitor.visitDoubleField(doubleField)
                stringField != null -> visitor.visitStringField(stringField)
                booleanField != null -> visitor.visitBooleanField(booleanField)
                arrayField != null -> visitor.visitArrayField(arrayField)
                objectField != null -> visitor.visitObjectField(objectField)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Schema = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitIntegerField(integerField: IntegerFieldSchema) {
                        integerField.validate()
                    }

                    override fun visitLongField(longField: LongFieldSchema) {
                        longField.validate()
                    }

                    override fun visitDoubleField(doubleField: DoubleFieldSchema) {
                        doubleField.validate()
                    }

                    override fun visitStringField(stringField: StringFieldSchema) {
                        stringField.validate()
                    }

                    override fun visitBooleanField(booleanField: BooleanFieldSchema) {
                        booleanField.validate()
                    }

                    override fun visitArrayField(arrayField: ArrayFieldSchema) {
                        arrayField.validate()
                    }

                    override fun visitObjectField(objectField: ObjectFieldSchema) {
                        objectField.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitIntegerField(integerField: IntegerFieldSchema) =
                        integerField.validity()

                    override fun visitLongField(longField: LongFieldSchema) = longField.validity()

                    override fun visitDoubleField(doubleField: DoubleFieldSchema) =
                        doubleField.validity()

                    override fun visitStringField(stringField: StringFieldSchema) =
                        stringField.validity()

                    override fun visitBooleanField(booleanField: BooleanFieldSchema) =
                        booleanField.validity()

                    override fun visitArrayField(arrayField: ArrayFieldSchema) =
                        arrayField.validity()

                    override fun visitObjectField(objectField: ObjectFieldSchema) =
                        objectField.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Schema &&
                integerField == other.integerField &&
                longField == other.longField &&
                doubleField == other.doubleField &&
                stringField == other.stringField &&
                booleanField == other.booleanField &&
                arrayField == other.arrayField &&
                objectField == other.objectField
        }

        override fun hashCode(): Int =
            Objects.hash(
                integerField,
                longField,
                doubleField,
                stringField,
                booleanField,
                arrayField,
                objectField,
            )

        override fun toString(): String =
            when {
                integerField != null -> "Schema{integerField=$integerField}"
                longField != null -> "Schema{longField=$longField}"
                doubleField != null -> "Schema{doubleField=$doubleField}"
                stringField != null -> "Schema{stringField=$stringField}"
                booleanField != null -> "Schema{booleanField=$booleanField}"
                arrayField != null -> "Schema{arrayField=$arrayField}"
                objectField != null -> "Schema{objectField=$objectField}"
                _json != null -> "Schema{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Schema")
            }

        companion object {

            @JvmStatic
            fun ofIntegerField(integerField: IntegerFieldSchema) =
                Schema(integerField = integerField)

            @JvmStatic fun ofLongField(longField: LongFieldSchema) = Schema(longField = longField)

            @JvmStatic
            fun ofDoubleField(doubleField: DoubleFieldSchema) = Schema(doubleField = doubleField)

            @JvmStatic
            fun ofStringField(stringField: StringFieldSchema) = Schema(stringField = stringField)

            @JvmStatic
            fun ofBooleanField(booleanField: BooleanFieldSchema) =
                Schema(booleanField = booleanField)

            @JvmStatic
            fun ofArrayField(arrayField: ArrayFieldSchema) = Schema(arrayField = arrayField)

            @JvmStatic
            fun ofObjectField(objectField: ObjectFieldSchema) = Schema(objectField = objectField)
        }

        /** An interface that defines how to map each variant of [Schema] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitIntegerField(integerField: IntegerFieldSchema): T

            fun visitLongField(longField: LongFieldSchema): T

            fun visitDoubleField(doubleField: DoubleFieldSchema): T

            fun visitStringField(stringField: StringFieldSchema): T

            fun visitBooleanField(booleanField: BooleanFieldSchema): T

            fun visitArrayField(arrayField: ArrayFieldSchema): T

            fun visitObjectField(objectField: ObjectFieldSchema): T

            /**
             * Maps an unknown variant of [Schema] to a value of type [T].
             *
             * An instance of [Schema] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws HubspotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubspotInvalidDataException("Unknown Schema: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Schema>(Schema::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Schema {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<IntegerFieldSchema>())?.let {
                                Schema(integerField = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<LongFieldSchema>())?.let {
                                Schema(longField = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<DoubleFieldSchema>())?.let {
                                Schema(doubleField = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<StringFieldSchema>())?.let {
                                Schema(stringField = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<BooleanFieldSchema>())?.let {
                                Schema(booleanField = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ArrayFieldSchema>())?.let {
                                Schema(arrayField = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ObjectFieldSchema>())?.let {
                                Schema(objectField = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Schema(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Schema>(Schema::class) {

            override fun serialize(
                value: Schema,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.integerField != null -> generator.writeObject(value.integerField)
                    value.longField != null -> generator.writeObject(value.longField)
                    value.doubleField != null -> generator.writeObject(value.doubleField)
                    value.stringField != null -> generator.writeObject(value.stringField)
                    value.booleanField != null -> generator.writeObject(value.booleanField)
                    value.arrayField != null -> generator.writeObject(value.arrayField)
                    value.objectField != null -> generator.writeObject(value.objectField)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Schema")
                }
            }
        }
    }

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

            @JvmField val BOOL = of("bool")

            @JvmField val CURRENCY_NUMBER = of("currency_number")

            @JvmField val DATE = of("date")

            @JvmField val DATETIME = of("datetime")

            @JvmField val ENUMERATION = of("enumeration")

            @JvmField val JSON = of("json")

            @JvmField val NUMBER = of("number")

            @JvmField val OBJECT_COORDINATES = of("object_coordinates")

            @JvmField val PHONE_NUMBER = of("phone_number")

            @JvmField val STRING = of("string")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            BOOL,
            CURRENCY_NUMBER,
            DATE,
            DATETIME,
            ENUMERATION,
            JSON,
            NUMBER,
            OBJECT_COORDINATES,
            PHONE_NUMBER,
            STRING,
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
            BOOL,
            CURRENCY_NUMBER,
            DATE,
            DATETIME,
            ENUMERATION,
            JSON,
            NUMBER,
            OBJECT_COORDINATES,
            PHONE_NUMBER,
            STRING,
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
                BOOL -> Value.BOOL
                CURRENCY_NUMBER -> Value.CURRENCY_NUMBER
                DATE -> Value.DATE
                DATETIME -> Value.DATETIME
                ENUMERATION -> Value.ENUMERATION
                JSON -> Value.JSON
                NUMBER -> Value.NUMBER
                OBJECT_COORDINATES -> Value.OBJECT_COORDINATES
                PHONE_NUMBER -> Value.PHONE_NUMBER
                STRING -> Value.STRING
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
                BOOL -> Known.BOOL
                CURRENCY_NUMBER -> Known.CURRENCY_NUMBER
                DATE -> Known.DATE
                DATETIME -> Known.DATETIME
                ENUMERATION -> Known.ENUMERATION
                JSON -> Known.JSON
                NUMBER -> Known.NUMBER
                OBJECT_COORDINATES -> Known.OBJECT_COORDINATES
                PHONE_NUMBER -> Known.PHONE_NUMBER
                STRING -> Known.STRING
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

            @JvmField val CALCULATION_EQUATION = of("calculation_equation")

            @JvmField val CALCULATION_READ_TIME = of("calculation_read_time")

            @JvmField val CALCULATION_ROLLUP = of("calculation_rollup")

            @JvmField val CALCULATION_SCORE = of("calculation_score")

            @JvmField val CHECKBOX = of("checkbox")

            @JvmField val DATE = of("date")

            @JvmField val FILE = of("file")

            @JvmField val HTML = of("html")

            @JvmField val NUMBER = of("number")

            @JvmField val PHONENUMBER = of("phonenumber")

            @JvmField val RADIO = of("radio")

            @JvmField val SELECT = of("select")

            @JvmField val TEXT = of("text")

            @JvmField val TEXTAREA = of("textarea")

            @JvmField val UNKNOWN = of("unknown")

            @JvmStatic fun of(value: String) = FieldType(JsonField.of(value))
        }

        /** An enum containing [FieldType]'s known values. */
        enum class Known {
            BOOLEANCHECKBOX,
            CALCULATION_EQUATION,
            CALCULATION_READ_TIME,
            CALCULATION_ROLLUP,
            CALCULATION_SCORE,
            CHECKBOX,
            DATE,
            FILE,
            HTML,
            NUMBER,
            PHONENUMBER,
            RADIO,
            SELECT,
            TEXT,
            TEXTAREA,
            UNKNOWN,
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
            CALCULATION_EQUATION,
            CALCULATION_READ_TIME,
            CALCULATION_ROLLUP,
            CALCULATION_SCORE,
            CHECKBOX,
            DATE,
            FILE,
            HTML,
            NUMBER,
            PHONENUMBER,
            RADIO,
            SELECT,
            TEXT,
            TEXTAREA,
            UNKNOWN,
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
                CALCULATION_EQUATION -> Value.CALCULATION_EQUATION
                CALCULATION_READ_TIME -> Value.CALCULATION_READ_TIME
                CALCULATION_ROLLUP -> Value.CALCULATION_ROLLUP
                CALCULATION_SCORE -> Value.CALCULATION_SCORE
                CHECKBOX -> Value.CHECKBOX
                DATE -> Value.DATE
                FILE -> Value.FILE
                HTML -> Value.HTML
                NUMBER -> Value.NUMBER
                PHONENUMBER -> Value.PHONENUMBER
                RADIO -> Value.RADIO
                SELECT -> Value.SELECT
                TEXT -> Value.TEXT
                TEXTAREA -> Value.TEXTAREA
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
                BOOLEANCHECKBOX -> Known.BOOLEANCHECKBOX
                CALCULATION_EQUATION -> Known.CALCULATION_EQUATION
                CALCULATION_READ_TIME -> Known.CALCULATION_READ_TIME
                CALCULATION_ROLLUP -> Known.CALCULATION_ROLLUP
                CALCULATION_SCORE -> Known.CALCULATION_SCORE
                CHECKBOX -> Known.CHECKBOX
                DATE -> Known.DATE
                FILE -> Known.FILE
                HTML -> Known.HTML
                NUMBER -> Known.NUMBER
                PHONENUMBER -> Known.PHONENUMBER
                RADIO -> Known.RADIO
                SELECT -> Known.SELECT
                TEXT -> Known.TEXT
                TEXTAREA -> Known.TEXTAREA
                UNKNOWN -> Known.UNKNOWN
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

            @JvmField val ABANDONED_CART = of("ABANDONED_CART")

            @JvmField val ACCEPTANCE_TEST = of("ACCEPTANCE_TEST")

            @JvmField val AD = of("AD")

            @JvmField val AD_ACCOUNT = of("AD_ACCOUNT")

            @JvmField val AD_CAMPAIGN = of("AD_CAMPAIGN")

            @JvmField val AD_GROUP = of("AD_GROUP")

            @JvmField val AI_FORECAST = of("AI_FORECAST")

            @JvmField val ALL_PAGES = of("ALL_PAGES")

            @JvmField val APPROVAL = of("APPROVAL")

            @JvmField val APPROVAL_STEP = of("APPROVAL_STEP")

            @JvmField val ATTRIBUTION = of("ATTRIBUTION")

            @JvmField val AUDIENCE = of("AUDIENCE")

            @JvmField val AUTOMATION_JOURNEY = of("AUTOMATION_JOURNEY")

            @JvmField val AUTOMATION_PLATFORM_FLOW = of("AUTOMATION_PLATFORM_FLOW")

            @JvmField val AUTOMATION_PLATFORM_FLOW_ACTION = of("AUTOMATION_PLATFORM_FLOW_ACTION")

            @JvmField val BET_ALERT = of("BET_ALERT")

            @JvmField val BET_DELIVERABLE_SERVICE = of("BET_DELIVERABLE_SERVICE")

            @JvmField val BLOG_LISTING_PAGE = of("BLOG_LISTING_PAGE")

            @JvmField val BLOG_POST = of("BLOG_POST")

            @JvmField val CALL = of("CALL")

            @JvmField val CAMPAIGN = of("CAMPAIGN")

            @JvmField val CAMPAIGN_BUDGET_ITEM = of("CAMPAIGN_BUDGET_ITEM")

            @JvmField val CAMPAIGN_SPEND_ITEM = of("CAMPAIGN_SPEND_ITEM")

            @JvmField val CAMPAIGN_STEP = of("CAMPAIGN_STEP")

            @JvmField val CAMPAIGN_TEMPLATE = of("CAMPAIGN_TEMPLATE")

            @JvmField val CAMPAIGN_TEMPLATE_STEP = of("CAMPAIGN_TEMPLATE_STEP")

            @JvmField val CART = of("CART")

            @JvmField val CASE_STUDY = of("CASE_STUDY")

            @JvmField val CHATFLOW = of("CHATFLOW")

            @JvmField val CLIP = of("CLIP")

            @JvmField val CMS_URL = of("CMS_URL")

            @JvmField val COMBO_EVENT_CONFIGURATION = of("COMBO_EVENT_CONFIGURATION")

            @JvmField val COMMERCE_PAYMENT = of("COMMERCE_PAYMENT")

            @JvmField val COMMUNICATION = of("COMMUNICATION")

            @JvmField val COMPANY = of("COMPANY")

            @JvmField val CONTACT = of("CONTACT")

            @JvmField val CONTACT_CREATE_ATTRIBUTION = of("CONTACT_CREATE_ATTRIBUTION")

            @JvmField val CONTENT = of("CONTENT")

            @JvmField val CONTENT_AUDIT = of("CONTENT_AUDIT")

            @JvmField val CONTENT_AUDIT_PAGE = of("CONTENT_AUDIT_PAGE")

            @JvmField val CONVERSATION = of("CONVERSATION")

            @JvmField val CONVERSATION_INBOX = of("CONVERSATION_INBOX")

            @JvmField val CONVERSATION_SESSION = of("CONVERSATION_SESSION")

            @JvmField val CRM_OBJECTS_DUMMY_TYPE = of("CRM_OBJECTS_DUMMY_TYPE")

            @JvmField val CRM_PIPELINES_DUMMY_TYPE = of("CRM_PIPELINES_DUMMY_TYPE")

            @JvmField val CTA = of("CTA")

            @JvmField val CTA_VARIANT = of("CTA_VARIANT")

            @JvmField val DATA_PRIVACY_CONSENT = of("DATA_PRIVACY_CONSENT")

            @JvmField val DATA_SYNC_STATE = of("DATA_SYNC_STATE")

            @JvmField val DEAL = of("DEAL")

            @JvmField val DEAL_CREATE_ATTRIBUTION = of("DEAL_CREATE_ATTRIBUTION")

            @JvmField val DEAL_REGISTRATION = of("DEAL_REGISTRATION")

            @JvmField val DEAL_SPLIT = of("DEAL_SPLIT")

            @JvmField val DISCOUNT = of("DISCOUNT")

            @JvmField val DISCOUNT_CODE = of("DISCOUNT_CODE")

            @JvmField val DISCOUNT_TEMPLATE = of("DISCOUNT_TEMPLATE")

            @JvmField val EMAIL = of("EMAIL")

            @JvmField val ENGAGEMENT = of("ENGAGEMENT")

            @JvmField val EXPORT = of("EXPORT")

            @JvmField val EXTERNAL_WEB_URL = of("EXTERNAL_WEB_URL")

            @JvmField val FEE = of("FEE")

            @JvmField val FEEDBACK_SUBMISSION = of("FEEDBACK_SUBMISSION")

            @JvmField val FEEDBACK_SURVEY = of("FEEDBACK_SURVEY")

            @JvmField val FILE_MANAGER_FILE = of("FILE_MANAGER_FILE")

            @JvmField val FILE_MANAGER_FOLDER = of("FILE_MANAGER_FOLDER")

            @JvmField val FOLDER = of("FOLDER")

            @JvmField val FORECAST = of("FORECAST")

            @JvmField val FORM = of("FORM")

            @JvmField val FORM_SUBMISSION_INBOUNDDB = of("FORM_SUBMISSION_INBOUNDDB")

            @JvmField val GOAL_TARGET = of("GOAL_TARGET")

            @JvmField val GOAL_TARGET_GROUP = of("GOAL_TARGET_GROUP")

            @JvmField val GOAL_TEMPLATE = of("GOAL_TEMPLATE")

            @JvmField val GSC_PROPERTY = of("GSC_PROPERTY")

            @JvmField val HUB = of("HUB")

            @JvmField val IMPORT = of("IMPORT")

            @JvmField val INVOICE = of("INVOICE")

            @JvmField val KEYWORD = of("KEYWORD")

            @JvmField val KNOWLEDGE_ARTICLE = of("KNOWLEDGE_ARTICLE")

            @JvmField val LANDING_PAGE = of("LANDING_PAGE")

            @JvmField val LEAD = of("LEAD")

            @JvmField val LINE_ITEM = of("LINE_ITEM")

            @JvmField val MARKETING_CALENDAR = of("MARKETING_CALENDAR")

            @JvmField val MARKETING_CAMPAIGN_UTM = of("MARKETING_CAMPAIGN_UTM")

            @JvmField val MARKETING_EMAIL = of("MARKETING_EMAIL")

            @JvmField val MARKETING_EVENT = of("MARKETING_EVENT")

            @JvmField val MARKETING_EVENT_ATTENDANCE = of("MARKETING_EVENT_ATTENDANCE")

            @JvmField val MARKETING_SMS = of("MARKETING_SMS")

            @JvmField val MEDIA_BRIDGE = of("MEDIA_BRIDGE")

            @JvmField val MEETING_EVENT = of("MEETING_EVENT")

            @JvmField val MIC = of("MIC")

            @JvmField val NOTE = of("NOTE")

            @JvmField val OBJECT_LIST = of("OBJECT_LIST")

            @JvmField val ORDER = of("ORDER")

            @JvmField val OWNER = of("OWNER")

            @JvmField val PARTNER_ACCOUNT = of("PARTNER_ACCOUNT")

            @JvmField val PARTNER_CLIENT = of("PARTNER_CLIENT")

            @JvmField val PARTNER_CLIENT_REVENUE = of("PARTNER_CLIENT_REVENUE")

            @JvmField val PARTNER_SERVICE = of("PARTNER_SERVICE")

            @JvmField val PAYMENT_LINK = of("PAYMENT_LINK")

            @JvmField val PAYMENT_SCHEDULE = of("PAYMENT_SCHEDULE")

            @JvmField val PAYMENT_SCHEDULE_INSTALLMENT = of("PAYMENT_SCHEDULE_INSTALLMENT")

            @JvmField val PERMISSIONS_TESTING = of("PERMISSIONS_TESTING")

            @JvmField val PLAYBOOK = of("PLAYBOOK")

            @JvmField val PLAYBOOK_QUESTION = of("PLAYBOOK_QUESTION")

            @JvmField val PLAYBOOK_SUBMISSION = of("PLAYBOOK_SUBMISSION")

            @JvmField val PLAYBOOK_SUBMISSION_ANSWER = of("PLAYBOOK_SUBMISSION_ANSWER")

            @JvmField val PLAYLIST = of("PLAYLIST")

            @JvmField val PLAYLIST_FOLDER = of("PLAYLIST_FOLDER")

            @JvmField val PODCAST_EPISODE = of("PODCAST_EPISODE")

            @JvmField val PORTAL = of("PORTAL")

            @JvmField val PORTAL_OBJECT_SYNC_MESSAGE = of("PORTAL_OBJECT_SYNC_MESSAGE")

            @JvmField val POSTAL_MAIL = of("POSTAL_MAIL")

            @JvmField val PRIVACY_SCANNER_COOKIE = of("PRIVACY_SCANNER_COOKIE")

            @JvmField val PRODUCT = of("PRODUCT")

            @JvmField val PRODUCT_OR_FOLDER = of("PRODUCT_OR_FOLDER")

            @JvmField val PROPERTY_INFO = of("PROPERTY_INFO")

            @JvmField
            val PROSPECTING_AGENT_CONTACT_ASSIGNMENT = of("PROSPECTING_AGENT_CONTACT_ASSIGNMENT")

            @JvmField val PUBLISHING_TASK = of("PUBLISHING_TASK")

            @JvmField val QUARANTINED_SUBMISSION = of("QUARANTINED_SUBMISSION")

            @JvmField val QUOTA = of("QUOTA")

            @JvmField val QUOTE = of("QUOTE")

            @JvmField val QUOTE_FIELD = of("QUOTE_FIELD")

            @JvmField val QUOTE_MODULE = of("QUOTE_MODULE")

            @JvmField val QUOTE_MODULE_FIELD = of("QUOTE_MODULE_FIELD")

            @JvmField val QUOTE_TEMPLATE = of("QUOTE_TEMPLATE")

            @JvmField val RESTORABLE_CRM_OBJECT = of("RESTORABLE_CRM_OBJECT")

            @JvmField val ROSTER = of("ROSTER")

            @JvmField val ROSTER_MEMBER = of("ROSTER_MEMBER")

            @JvmField val SALES_DOCUMENT = of("SALES_DOCUMENT")

            @JvmField val SALES_TASK = of("SALES_TASK")

            @JvmField val SALES_WORKLOAD = of("SALES_WORKLOAD")

            @JvmField val SALESFORCE_SYNC_ERROR = of("SALESFORCE_SYNC_ERROR")

            @JvmField val SCHEDULING_PAGE = of("SCHEDULING_PAGE")

            @JvmField val SCHEMAS_BACKEND_TEST = of("SCHEMAS_BACKEND_TEST")

            @JvmField val SCORE_CONFIGURATION = of("SCORE_CONFIGURATION")

            @JvmField val SEQUENCE = of("SEQUENCE")

            @JvmField val SEQUENCE_ENROLLMENT = of("SEQUENCE_ENROLLMENT")

            @JvmField val SEQUENCE_STEP = of("SEQUENCE_STEP")

            @JvmField val SEQUENCE_STEP_ENROLLMENT = of("SEQUENCE_STEP_ENROLLMENT")

            @JvmField val SERVICE = of("SERVICE")

            @JvmField val SITE_PAGE = of("SITE_PAGE")

            @JvmField val SNIPPET = of("SNIPPET")

            @JvmField val SOCIAL_BROADCAST = of("SOCIAL_BROADCAST")

            @JvmField val SOCIAL_CHANNEL = of("SOCIAL_CHANNEL")

            @JvmField val SOCIAL_POST = of("SOCIAL_POST")

            @JvmField val SOCIAL_PROFILE = of("SOCIAL_PROFILE")

            @JvmField val SOX_PROTECTED_DUMMY_TYPE = of("SOX_PROTECTED_DUMMY_TYPE")

            @JvmField val SOX_PROTECTED_TEST_TYPE = of("SOX_PROTECTED_TEST_TYPE")

            @JvmField val SUBMISSION_TAG = of("SUBMISSION_TAG")

            @JvmField val SUBSCRIPTION = of("SUBSCRIPTION")

            @JvmField val TASK = of("TASK")

            @JvmField val TASK_TEMPLATE = of("TASK_TEMPLATE")

            @JvmField val TAX = of("TAX")

            @JvmField val TEMPLATE = of("TEMPLATE")

            @JvmField val TICKET = of("TICKET")

            @JvmField val UNKNOWN = of("UNKNOWN")

            @JvmField val UNSUBSCRIBE = of("UNSUBSCRIBE")

            @JvmField val USER = of("USER")

            @JvmField val VIEW = of("VIEW")

            @JvmField val VIEW_BLOCK = of("VIEW_BLOCK")

            @JvmField val WEB_INTERACTIVE = of("WEB_INTERACTIVE")

            @JvmStatic fun of(value: String) = ReferencedObjectType(JsonField.of(value))
        }

        /** An enum containing [ReferencedObjectType]'s known values. */
        enum class Known {
            ABANDONED_CART,
            ACCEPTANCE_TEST,
            AD,
            AD_ACCOUNT,
            AD_CAMPAIGN,
            AD_GROUP,
            AI_FORECAST,
            ALL_PAGES,
            APPROVAL,
            APPROVAL_STEP,
            ATTRIBUTION,
            AUDIENCE,
            AUTOMATION_JOURNEY,
            AUTOMATION_PLATFORM_FLOW,
            AUTOMATION_PLATFORM_FLOW_ACTION,
            BET_ALERT,
            BET_DELIVERABLE_SERVICE,
            BLOG_LISTING_PAGE,
            BLOG_POST,
            CALL,
            CAMPAIGN,
            CAMPAIGN_BUDGET_ITEM,
            CAMPAIGN_SPEND_ITEM,
            CAMPAIGN_STEP,
            CAMPAIGN_TEMPLATE,
            CAMPAIGN_TEMPLATE_STEP,
            CART,
            CASE_STUDY,
            CHATFLOW,
            CLIP,
            CMS_URL,
            COMBO_EVENT_CONFIGURATION,
            COMMERCE_PAYMENT,
            COMMUNICATION,
            COMPANY,
            CONTACT,
            CONTACT_CREATE_ATTRIBUTION,
            CONTENT,
            CONTENT_AUDIT,
            CONTENT_AUDIT_PAGE,
            CONVERSATION,
            CONVERSATION_INBOX,
            CONVERSATION_SESSION,
            CRM_OBJECTS_DUMMY_TYPE,
            CRM_PIPELINES_DUMMY_TYPE,
            CTA,
            CTA_VARIANT,
            DATA_PRIVACY_CONSENT,
            DATA_SYNC_STATE,
            DEAL,
            DEAL_CREATE_ATTRIBUTION,
            DEAL_REGISTRATION,
            DEAL_SPLIT,
            DISCOUNT,
            DISCOUNT_CODE,
            DISCOUNT_TEMPLATE,
            EMAIL,
            ENGAGEMENT,
            EXPORT,
            EXTERNAL_WEB_URL,
            FEE,
            FEEDBACK_SUBMISSION,
            FEEDBACK_SURVEY,
            FILE_MANAGER_FILE,
            FILE_MANAGER_FOLDER,
            FOLDER,
            FORECAST,
            FORM,
            FORM_SUBMISSION_INBOUNDDB,
            GOAL_TARGET,
            GOAL_TARGET_GROUP,
            GOAL_TEMPLATE,
            GSC_PROPERTY,
            HUB,
            IMPORT,
            INVOICE,
            KEYWORD,
            KNOWLEDGE_ARTICLE,
            LANDING_PAGE,
            LEAD,
            LINE_ITEM,
            MARKETING_CALENDAR,
            MARKETING_CAMPAIGN_UTM,
            MARKETING_EMAIL,
            MARKETING_EVENT,
            MARKETING_EVENT_ATTENDANCE,
            MARKETING_SMS,
            MEDIA_BRIDGE,
            MEETING_EVENT,
            MIC,
            NOTE,
            OBJECT_LIST,
            ORDER,
            OWNER,
            PARTNER_ACCOUNT,
            PARTNER_CLIENT,
            PARTNER_CLIENT_REVENUE,
            PARTNER_SERVICE,
            PAYMENT_LINK,
            PAYMENT_SCHEDULE,
            PAYMENT_SCHEDULE_INSTALLMENT,
            PERMISSIONS_TESTING,
            PLAYBOOK,
            PLAYBOOK_QUESTION,
            PLAYBOOK_SUBMISSION,
            PLAYBOOK_SUBMISSION_ANSWER,
            PLAYLIST,
            PLAYLIST_FOLDER,
            PODCAST_EPISODE,
            PORTAL,
            PORTAL_OBJECT_SYNC_MESSAGE,
            POSTAL_MAIL,
            PRIVACY_SCANNER_COOKIE,
            PRODUCT,
            PRODUCT_OR_FOLDER,
            PROPERTY_INFO,
            PROSPECTING_AGENT_CONTACT_ASSIGNMENT,
            PUBLISHING_TASK,
            QUARANTINED_SUBMISSION,
            QUOTA,
            QUOTE,
            QUOTE_FIELD,
            QUOTE_MODULE,
            QUOTE_MODULE_FIELD,
            QUOTE_TEMPLATE,
            RESTORABLE_CRM_OBJECT,
            ROSTER,
            ROSTER_MEMBER,
            SALES_DOCUMENT,
            SALES_TASK,
            SALES_WORKLOAD,
            SALESFORCE_SYNC_ERROR,
            SCHEDULING_PAGE,
            SCHEMAS_BACKEND_TEST,
            SCORE_CONFIGURATION,
            SEQUENCE,
            SEQUENCE_ENROLLMENT,
            SEQUENCE_STEP,
            SEQUENCE_STEP_ENROLLMENT,
            SERVICE,
            SITE_PAGE,
            SNIPPET,
            SOCIAL_BROADCAST,
            SOCIAL_CHANNEL,
            SOCIAL_POST,
            SOCIAL_PROFILE,
            SOX_PROTECTED_DUMMY_TYPE,
            SOX_PROTECTED_TEST_TYPE,
            SUBMISSION_TAG,
            SUBSCRIPTION,
            TASK,
            TASK_TEMPLATE,
            TAX,
            TEMPLATE,
            TICKET,
            UNKNOWN,
            UNSUBSCRIBE,
            USER,
            VIEW,
            VIEW_BLOCK,
            WEB_INTERACTIVE,
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
            ABANDONED_CART,
            ACCEPTANCE_TEST,
            AD,
            AD_ACCOUNT,
            AD_CAMPAIGN,
            AD_GROUP,
            AI_FORECAST,
            ALL_PAGES,
            APPROVAL,
            APPROVAL_STEP,
            ATTRIBUTION,
            AUDIENCE,
            AUTOMATION_JOURNEY,
            AUTOMATION_PLATFORM_FLOW,
            AUTOMATION_PLATFORM_FLOW_ACTION,
            BET_ALERT,
            BET_DELIVERABLE_SERVICE,
            BLOG_LISTING_PAGE,
            BLOG_POST,
            CALL,
            CAMPAIGN,
            CAMPAIGN_BUDGET_ITEM,
            CAMPAIGN_SPEND_ITEM,
            CAMPAIGN_STEP,
            CAMPAIGN_TEMPLATE,
            CAMPAIGN_TEMPLATE_STEP,
            CART,
            CASE_STUDY,
            CHATFLOW,
            CLIP,
            CMS_URL,
            COMBO_EVENT_CONFIGURATION,
            COMMERCE_PAYMENT,
            COMMUNICATION,
            COMPANY,
            CONTACT,
            CONTACT_CREATE_ATTRIBUTION,
            CONTENT,
            CONTENT_AUDIT,
            CONTENT_AUDIT_PAGE,
            CONVERSATION,
            CONVERSATION_INBOX,
            CONVERSATION_SESSION,
            CRM_OBJECTS_DUMMY_TYPE,
            CRM_PIPELINES_DUMMY_TYPE,
            CTA,
            CTA_VARIANT,
            DATA_PRIVACY_CONSENT,
            DATA_SYNC_STATE,
            DEAL,
            DEAL_CREATE_ATTRIBUTION,
            DEAL_REGISTRATION,
            DEAL_SPLIT,
            DISCOUNT,
            DISCOUNT_CODE,
            DISCOUNT_TEMPLATE,
            EMAIL,
            ENGAGEMENT,
            EXPORT,
            EXTERNAL_WEB_URL,
            FEE,
            FEEDBACK_SUBMISSION,
            FEEDBACK_SURVEY,
            FILE_MANAGER_FILE,
            FILE_MANAGER_FOLDER,
            FOLDER,
            FORECAST,
            FORM,
            FORM_SUBMISSION_INBOUNDDB,
            GOAL_TARGET,
            GOAL_TARGET_GROUP,
            GOAL_TEMPLATE,
            GSC_PROPERTY,
            HUB,
            IMPORT,
            INVOICE,
            KEYWORD,
            KNOWLEDGE_ARTICLE,
            LANDING_PAGE,
            LEAD,
            LINE_ITEM,
            MARKETING_CALENDAR,
            MARKETING_CAMPAIGN_UTM,
            MARKETING_EMAIL,
            MARKETING_EVENT,
            MARKETING_EVENT_ATTENDANCE,
            MARKETING_SMS,
            MEDIA_BRIDGE,
            MEETING_EVENT,
            MIC,
            NOTE,
            OBJECT_LIST,
            ORDER,
            OWNER,
            PARTNER_ACCOUNT,
            PARTNER_CLIENT,
            PARTNER_CLIENT_REVENUE,
            PARTNER_SERVICE,
            PAYMENT_LINK,
            PAYMENT_SCHEDULE,
            PAYMENT_SCHEDULE_INSTALLMENT,
            PERMISSIONS_TESTING,
            PLAYBOOK,
            PLAYBOOK_QUESTION,
            PLAYBOOK_SUBMISSION,
            PLAYBOOK_SUBMISSION_ANSWER,
            PLAYLIST,
            PLAYLIST_FOLDER,
            PODCAST_EPISODE,
            PORTAL,
            PORTAL_OBJECT_SYNC_MESSAGE,
            POSTAL_MAIL,
            PRIVACY_SCANNER_COOKIE,
            PRODUCT,
            PRODUCT_OR_FOLDER,
            PROPERTY_INFO,
            PROSPECTING_AGENT_CONTACT_ASSIGNMENT,
            PUBLISHING_TASK,
            QUARANTINED_SUBMISSION,
            QUOTA,
            QUOTE,
            QUOTE_FIELD,
            QUOTE_MODULE,
            QUOTE_MODULE_FIELD,
            QUOTE_TEMPLATE,
            RESTORABLE_CRM_OBJECT,
            ROSTER,
            ROSTER_MEMBER,
            SALES_DOCUMENT,
            SALES_TASK,
            SALES_WORKLOAD,
            SALESFORCE_SYNC_ERROR,
            SCHEDULING_PAGE,
            SCHEMAS_BACKEND_TEST,
            SCORE_CONFIGURATION,
            SEQUENCE,
            SEQUENCE_ENROLLMENT,
            SEQUENCE_STEP,
            SEQUENCE_STEP_ENROLLMENT,
            SERVICE,
            SITE_PAGE,
            SNIPPET,
            SOCIAL_BROADCAST,
            SOCIAL_CHANNEL,
            SOCIAL_POST,
            SOCIAL_PROFILE,
            SOX_PROTECTED_DUMMY_TYPE,
            SOX_PROTECTED_TEST_TYPE,
            SUBMISSION_TAG,
            SUBSCRIPTION,
            TASK,
            TASK_TEMPLATE,
            TAX,
            TEMPLATE,
            TICKET,
            UNKNOWN,
            UNSUBSCRIBE,
            USER,
            VIEW,
            VIEW_BLOCK,
            WEB_INTERACTIVE,
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
                ABANDONED_CART -> Value.ABANDONED_CART
                ACCEPTANCE_TEST -> Value.ACCEPTANCE_TEST
                AD -> Value.AD
                AD_ACCOUNT -> Value.AD_ACCOUNT
                AD_CAMPAIGN -> Value.AD_CAMPAIGN
                AD_GROUP -> Value.AD_GROUP
                AI_FORECAST -> Value.AI_FORECAST
                ALL_PAGES -> Value.ALL_PAGES
                APPROVAL -> Value.APPROVAL
                APPROVAL_STEP -> Value.APPROVAL_STEP
                ATTRIBUTION -> Value.ATTRIBUTION
                AUDIENCE -> Value.AUDIENCE
                AUTOMATION_JOURNEY -> Value.AUTOMATION_JOURNEY
                AUTOMATION_PLATFORM_FLOW -> Value.AUTOMATION_PLATFORM_FLOW
                AUTOMATION_PLATFORM_FLOW_ACTION -> Value.AUTOMATION_PLATFORM_FLOW_ACTION
                BET_ALERT -> Value.BET_ALERT
                BET_DELIVERABLE_SERVICE -> Value.BET_DELIVERABLE_SERVICE
                BLOG_LISTING_PAGE -> Value.BLOG_LISTING_PAGE
                BLOG_POST -> Value.BLOG_POST
                CALL -> Value.CALL
                CAMPAIGN -> Value.CAMPAIGN
                CAMPAIGN_BUDGET_ITEM -> Value.CAMPAIGN_BUDGET_ITEM
                CAMPAIGN_SPEND_ITEM -> Value.CAMPAIGN_SPEND_ITEM
                CAMPAIGN_STEP -> Value.CAMPAIGN_STEP
                CAMPAIGN_TEMPLATE -> Value.CAMPAIGN_TEMPLATE
                CAMPAIGN_TEMPLATE_STEP -> Value.CAMPAIGN_TEMPLATE_STEP
                CART -> Value.CART
                CASE_STUDY -> Value.CASE_STUDY
                CHATFLOW -> Value.CHATFLOW
                CLIP -> Value.CLIP
                CMS_URL -> Value.CMS_URL
                COMBO_EVENT_CONFIGURATION -> Value.COMBO_EVENT_CONFIGURATION
                COMMERCE_PAYMENT -> Value.COMMERCE_PAYMENT
                COMMUNICATION -> Value.COMMUNICATION
                COMPANY -> Value.COMPANY
                CONTACT -> Value.CONTACT
                CONTACT_CREATE_ATTRIBUTION -> Value.CONTACT_CREATE_ATTRIBUTION
                CONTENT -> Value.CONTENT
                CONTENT_AUDIT -> Value.CONTENT_AUDIT
                CONTENT_AUDIT_PAGE -> Value.CONTENT_AUDIT_PAGE
                CONVERSATION -> Value.CONVERSATION
                CONVERSATION_INBOX -> Value.CONVERSATION_INBOX
                CONVERSATION_SESSION -> Value.CONVERSATION_SESSION
                CRM_OBJECTS_DUMMY_TYPE -> Value.CRM_OBJECTS_DUMMY_TYPE
                CRM_PIPELINES_DUMMY_TYPE -> Value.CRM_PIPELINES_DUMMY_TYPE
                CTA -> Value.CTA
                CTA_VARIANT -> Value.CTA_VARIANT
                DATA_PRIVACY_CONSENT -> Value.DATA_PRIVACY_CONSENT
                DATA_SYNC_STATE -> Value.DATA_SYNC_STATE
                DEAL -> Value.DEAL
                DEAL_CREATE_ATTRIBUTION -> Value.DEAL_CREATE_ATTRIBUTION
                DEAL_REGISTRATION -> Value.DEAL_REGISTRATION
                DEAL_SPLIT -> Value.DEAL_SPLIT
                DISCOUNT -> Value.DISCOUNT
                DISCOUNT_CODE -> Value.DISCOUNT_CODE
                DISCOUNT_TEMPLATE -> Value.DISCOUNT_TEMPLATE
                EMAIL -> Value.EMAIL
                ENGAGEMENT -> Value.ENGAGEMENT
                EXPORT -> Value.EXPORT
                EXTERNAL_WEB_URL -> Value.EXTERNAL_WEB_URL
                FEE -> Value.FEE
                FEEDBACK_SUBMISSION -> Value.FEEDBACK_SUBMISSION
                FEEDBACK_SURVEY -> Value.FEEDBACK_SURVEY
                FILE_MANAGER_FILE -> Value.FILE_MANAGER_FILE
                FILE_MANAGER_FOLDER -> Value.FILE_MANAGER_FOLDER
                FOLDER -> Value.FOLDER
                FORECAST -> Value.FORECAST
                FORM -> Value.FORM
                FORM_SUBMISSION_INBOUNDDB -> Value.FORM_SUBMISSION_INBOUNDDB
                GOAL_TARGET -> Value.GOAL_TARGET
                GOAL_TARGET_GROUP -> Value.GOAL_TARGET_GROUP
                GOAL_TEMPLATE -> Value.GOAL_TEMPLATE
                GSC_PROPERTY -> Value.GSC_PROPERTY
                HUB -> Value.HUB
                IMPORT -> Value.IMPORT
                INVOICE -> Value.INVOICE
                KEYWORD -> Value.KEYWORD
                KNOWLEDGE_ARTICLE -> Value.KNOWLEDGE_ARTICLE
                LANDING_PAGE -> Value.LANDING_PAGE
                LEAD -> Value.LEAD
                LINE_ITEM -> Value.LINE_ITEM
                MARKETING_CALENDAR -> Value.MARKETING_CALENDAR
                MARKETING_CAMPAIGN_UTM -> Value.MARKETING_CAMPAIGN_UTM
                MARKETING_EMAIL -> Value.MARKETING_EMAIL
                MARKETING_EVENT -> Value.MARKETING_EVENT
                MARKETING_EVENT_ATTENDANCE -> Value.MARKETING_EVENT_ATTENDANCE
                MARKETING_SMS -> Value.MARKETING_SMS
                MEDIA_BRIDGE -> Value.MEDIA_BRIDGE
                MEETING_EVENT -> Value.MEETING_EVENT
                MIC -> Value.MIC
                NOTE -> Value.NOTE
                OBJECT_LIST -> Value.OBJECT_LIST
                ORDER -> Value.ORDER
                OWNER -> Value.OWNER
                PARTNER_ACCOUNT -> Value.PARTNER_ACCOUNT
                PARTNER_CLIENT -> Value.PARTNER_CLIENT
                PARTNER_CLIENT_REVENUE -> Value.PARTNER_CLIENT_REVENUE
                PARTNER_SERVICE -> Value.PARTNER_SERVICE
                PAYMENT_LINK -> Value.PAYMENT_LINK
                PAYMENT_SCHEDULE -> Value.PAYMENT_SCHEDULE
                PAYMENT_SCHEDULE_INSTALLMENT -> Value.PAYMENT_SCHEDULE_INSTALLMENT
                PERMISSIONS_TESTING -> Value.PERMISSIONS_TESTING
                PLAYBOOK -> Value.PLAYBOOK
                PLAYBOOK_QUESTION -> Value.PLAYBOOK_QUESTION
                PLAYBOOK_SUBMISSION -> Value.PLAYBOOK_SUBMISSION
                PLAYBOOK_SUBMISSION_ANSWER -> Value.PLAYBOOK_SUBMISSION_ANSWER
                PLAYLIST -> Value.PLAYLIST
                PLAYLIST_FOLDER -> Value.PLAYLIST_FOLDER
                PODCAST_EPISODE -> Value.PODCAST_EPISODE
                PORTAL -> Value.PORTAL
                PORTAL_OBJECT_SYNC_MESSAGE -> Value.PORTAL_OBJECT_SYNC_MESSAGE
                POSTAL_MAIL -> Value.POSTAL_MAIL
                PRIVACY_SCANNER_COOKIE -> Value.PRIVACY_SCANNER_COOKIE
                PRODUCT -> Value.PRODUCT
                PRODUCT_OR_FOLDER -> Value.PRODUCT_OR_FOLDER
                PROPERTY_INFO -> Value.PROPERTY_INFO
                PROSPECTING_AGENT_CONTACT_ASSIGNMENT -> Value.PROSPECTING_AGENT_CONTACT_ASSIGNMENT
                PUBLISHING_TASK -> Value.PUBLISHING_TASK
                QUARANTINED_SUBMISSION -> Value.QUARANTINED_SUBMISSION
                QUOTA -> Value.QUOTA
                QUOTE -> Value.QUOTE
                QUOTE_FIELD -> Value.QUOTE_FIELD
                QUOTE_MODULE -> Value.QUOTE_MODULE
                QUOTE_MODULE_FIELD -> Value.QUOTE_MODULE_FIELD
                QUOTE_TEMPLATE -> Value.QUOTE_TEMPLATE
                RESTORABLE_CRM_OBJECT -> Value.RESTORABLE_CRM_OBJECT
                ROSTER -> Value.ROSTER
                ROSTER_MEMBER -> Value.ROSTER_MEMBER
                SALES_DOCUMENT -> Value.SALES_DOCUMENT
                SALES_TASK -> Value.SALES_TASK
                SALES_WORKLOAD -> Value.SALES_WORKLOAD
                SALESFORCE_SYNC_ERROR -> Value.SALESFORCE_SYNC_ERROR
                SCHEDULING_PAGE -> Value.SCHEDULING_PAGE
                SCHEMAS_BACKEND_TEST -> Value.SCHEMAS_BACKEND_TEST
                SCORE_CONFIGURATION -> Value.SCORE_CONFIGURATION
                SEQUENCE -> Value.SEQUENCE
                SEQUENCE_ENROLLMENT -> Value.SEQUENCE_ENROLLMENT
                SEQUENCE_STEP -> Value.SEQUENCE_STEP
                SEQUENCE_STEP_ENROLLMENT -> Value.SEQUENCE_STEP_ENROLLMENT
                SERVICE -> Value.SERVICE
                SITE_PAGE -> Value.SITE_PAGE
                SNIPPET -> Value.SNIPPET
                SOCIAL_BROADCAST -> Value.SOCIAL_BROADCAST
                SOCIAL_CHANNEL -> Value.SOCIAL_CHANNEL
                SOCIAL_POST -> Value.SOCIAL_POST
                SOCIAL_PROFILE -> Value.SOCIAL_PROFILE
                SOX_PROTECTED_DUMMY_TYPE -> Value.SOX_PROTECTED_DUMMY_TYPE
                SOX_PROTECTED_TEST_TYPE -> Value.SOX_PROTECTED_TEST_TYPE
                SUBMISSION_TAG -> Value.SUBMISSION_TAG
                SUBSCRIPTION -> Value.SUBSCRIPTION
                TASK -> Value.TASK
                TASK_TEMPLATE -> Value.TASK_TEMPLATE
                TAX -> Value.TAX
                TEMPLATE -> Value.TEMPLATE
                TICKET -> Value.TICKET
                UNKNOWN -> Value.UNKNOWN
                UNSUBSCRIBE -> Value.UNSUBSCRIBE
                USER -> Value.USER
                VIEW -> Value.VIEW
                VIEW_BLOCK -> Value.VIEW_BLOCK
                WEB_INTERACTIVE -> Value.WEB_INTERACTIVE
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
                ABANDONED_CART -> Known.ABANDONED_CART
                ACCEPTANCE_TEST -> Known.ACCEPTANCE_TEST
                AD -> Known.AD
                AD_ACCOUNT -> Known.AD_ACCOUNT
                AD_CAMPAIGN -> Known.AD_CAMPAIGN
                AD_GROUP -> Known.AD_GROUP
                AI_FORECAST -> Known.AI_FORECAST
                ALL_PAGES -> Known.ALL_PAGES
                APPROVAL -> Known.APPROVAL
                APPROVAL_STEP -> Known.APPROVAL_STEP
                ATTRIBUTION -> Known.ATTRIBUTION
                AUDIENCE -> Known.AUDIENCE
                AUTOMATION_JOURNEY -> Known.AUTOMATION_JOURNEY
                AUTOMATION_PLATFORM_FLOW -> Known.AUTOMATION_PLATFORM_FLOW
                AUTOMATION_PLATFORM_FLOW_ACTION -> Known.AUTOMATION_PLATFORM_FLOW_ACTION
                BET_ALERT -> Known.BET_ALERT
                BET_DELIVERABLE_SERVICE -> Known.BET_DELIVERABLE_SERVICE
                BLOG_LISTING_PAGE -> Known.BLOG_LISTING_PAGE
                BLOG_POST -> Known.BLOG_POST
                CALL -> Known.CALL
                CAMPAIGN -> Known.CAMPAIGN
                CAMPAIGN_BUDGET_ITEM -> Known.CAMPAIGN_BUDGET_ITEM
                CAMPAIGN_SPEND_ITEM -> Known.CAMPAIGN_SPEND_ITEM
                CAMPAIGN_STEP -> Known.CAMPAIGN_STEP
                CAMPAIGN_TEMPLATE -> Known.CAMPAIGN_TEMPLATE
                CAMPAIGN_TEMPLATE_STEP -> Known.CAMPAIGN_TEMPLATE_STEP
                CART -> Known.CART
                CASE_STUDY -> Known.CASE_STUDY
                CHATFLOW -> Known.CHATFLOW
                CLIP -> Known.CLIP
                CMS_URL -> Known.CMS_URL
                COMBO_EVENT_CONFIGURATION -> Known.COMBO_EVENT_CONFIGURATION
                COMMERCE_PAYMENT -> Known.COMMERCE_PAYMENT
                COMMUNICATION -> Known.COMMUNICATION
                COMPANY -> Known.COMPANY
                CONTACT -> Known.CONTACT
                CONTACT_CREATE_ATTRIBUTION -> Known.CONTACT_CREATE_ATTRIBUTION
                CONTENT -> Known.CONTENT
                CONTENT_AUDIT -> Known.CONTENT_AUDIT
                CONTENT_AUDIT_PAGE -> Known.CONTENT_AUDIT_PAGE
                CONVERSATION -> Known.CONVERSATION
                CONVERSATION_INBOX -> Known.CONVERSATION_INBOX
                CONVERSATION_SESSION -> Known.CONVERSATION_SESSION
                CRM_OBJECTS_DUMMY_TYPE -> Known.CRM_OBJECTS_DUMMY_TYPE
                CRM_PIPELINES_DUMMY_TYPE -> Known.CRM_PIPELINES_DUMMY_TYPE
                CTA -> Known.CTA
                CTA_VARIANT -> Known.CTA_VARIANT
                DATA_PRIVACY_CONSENT -> Known.DATA_PRIVACY_CONSENT
                DATA_SYNC_STATE -> Known.DATA_SYNC_STATE
                DEAL -> Known.DEAL
                DEAL_CREATE_ATTRIBUTION -> Known.DEAL_CREATE_ATTRIBUTION
                DEAL_REGISTRATION -> Known.DEAL_REGISTRATION
                DEAL_SPLIT -> Known.DEAL_SPLIT
                DISCOUNT -> Known.DISCOUNT
                DISCOUNT_CODE -> Known.DISCOUNT_CODE
                DISCOUNT_TEMPLATE -> Known.DISCOUNT_TEMPLATE
                EMAIL -> Known.EMAIL
                ENGAGEMENT -> Known.ENGAGEMENT
                EXPORT -> Known.EXPORT
                EXTERNAL_WEB_URL -> Known.EXTERNAL_WEB_URL
                FEE -> Known.FEE
                FEEDBACK_SUBMISSION -> Known.FEEDBACK_SUBMISSION
                FEEDBACK_SURVEY -> Known.FEEDBACK_SURVEY
                FILE_MANAGER_FILE -> Known.FILE_MANAGER_FILE
                FILE_MANAGER_FOLDER -> Known.FILE_MANAGER_FOLDER
                FOLDER -> Known.FOLDER
                FORECAST -> Known.FORECAST
                FORM -> Known.FORM
                FORM_SUBMISSION_INBOUNDDB -> Known.FORM_SUBMISSION_INBOUNDDB
                GOAL_TARGET -> Known.GOAL_TARGET
                GOAL_TARGET_GROUP -> Known.GOAL_TARGET_GROUP
                GOAL_TEMPLATE -> Known.GOAL_TEMPLATE
                GSC_PROPERTY -> Known.GSC_PROPERTY
                HUB -> Known.HUB
                IMPORT -> Known.IMPORT
                INVOICE -> Known.INVOICE
                KEYWORD -> Known.KEYWORD
                KNOWLEDGE_ARTICLE -> Known.KNOWLEDGE_ARTICLE
                LANDING_PAGE -> Known.LANDING_PAGE
                LEAD -> Known.LEAD
                LINE_ITEM -> Known.LINE_ITEM
                MARKETING_CALENDAR -> Known.MARKETING_CALENDAR
                MARKETING_CAMPAIGN_UTM -> Known.MARKETING_CAMPAIGN_UTM
                MARKETING_EMAIL -> Known.MARKETING_EMAIL
                MARKETING_EVENT -> Known.MARKETING_EVENT
                MARKETING_EVENT_ATTENDANCE -> Known.MARKETING_EVENT_ATTENDANCE
                MARKETING_SMS -> Known.MARKETING_SMS
                MEDIA_BRIDGE -> Known.MEDIA_BRIDGE
                MEETING_EVENT -> Known.MEETING_EVENT
                MIC -> Known.MIC
                NOTE -> Known.NOTE
                OBJECT_LIST -> Known.OBJECT_LIST
                ORDER -> Known.ORDER
                OWNER -> Known.OWNER
                PARTNER_ACCOUNT -> Known.PARTNER_ACCOUNT
                PARTNER_CLIENT -> Known.PARTNER_CLIENT
                PARTNER_CLIENT_REVENUE -> Known.PARTNER_CLIENT_REVENUE
                PARTNER_SERVICE -> Known.PARTNER_SERVICE
                PAYMENT_LINK -> Known.PAYMENT_LINK
                PAYMENT_SCHEDULE -> Known.PAYMENT_SCHEDULE
                PAYMENT_SCHEDULE_INSTALLMENT -> Known.PAYMENT_SCHEDULE_INSTALLMENT
                PERMISSIONS_TESTING -> Known.PERMISSIONS_TESTING
                PLAYBOOK -> Known.PLAYBOOK
                PLAYBOOK_QUESTION -> Known.PLAYBOOK_QUESTION
                PLAYBOOK_SUBMISSION -> Known.PLAYBOOK_SUBMISSION
                PLAYBOOK_SUBMISSION_ANSWER -> Known.PLAYBOOK_SUBMISSION_ANSWER
                PLAYLIST -> Known.PLAYLIST
                PLAYLIST_FOLDER -> Known.PLAYLIST_FOLDER
                PODCAST_EPISODE -> Known.PODCAST_EPISODE
                PORTAL -> Known.PORTAL
                PORTAL_OBJECT_SYNC_MESSAGE -> Known.PORTAL_OBJECT_SYNC_MESSAGE
                POSTAL_MAIL -> Known.POSTAL_MAIL
                PRIVACY_SCANNER_COOKIE -> Known.PRIVACY_SCANNER_COOKIE
                PRODUCT -> Known.PRODUCT
                PRODUCT_OR_FOLDER -> Known.PRODUCT_OR_FOLDER
                PROPERTY_INFO -> Known.PROPERTY_INFO
                PROSPECTING_AGENT_CONTACT_ASSIGNMENT -> Known.PROSPECTING_AGENT_CONTACT_ASSIGNMENT
                PUBLISHING_TASK -> Known.PUBLISHING_TASK
                QUARANTINED_SUBMISSION -> Known.QUARANTINED_SUBMISSION
                QUOTA -> Known.QUOTA
                QUOTE -> Known.QUOTE
                QUOTE_FIELD -> Known.QUOTE_FIELD
                QUOTE_MODULE -> Known.QUOTE_MODULE
                QUOTE_MODULE_FIELD -> Known.QUOTE_MODULE_FIELD
                QUOTE_TEMPLATE -> Known.QUOTE_TEMPLATE
                RESTORABLE_CRM_OBJECT -> Known.RESTORABLE_CRM_OBJECT
                ROSTER -> Known.ROSTER
                ROSTER_MEMBER -> Known.ROSTER_MEMBER
                SALES_DOCUMENT -> Known.SALES_DOCUMENT
                SALES_TASK -> Known.SALES_TASK
                SALES_WORKLOAD -> Known.SALES_WORKLOAD
                SALESFORCE_SYNC_ERROR -> Known.SALESFORCE_SYNC_ERROR
                SCHEDULING_PAGE -> Known.SCHEDULING_PAGE
                SCHEMAS_BACKEND_TEST -> Known.SCHEMAS_BACKEND_TEST
                SCORE_CONFIGURATION -> Known.SCORE_CONFIGURATION
                SEQUENCE -> Known.SEQUENCE
                SEQUENCE_ENROLLMENT -> Known.SEQUENCE_ENROLLMENT
                SEQUENCE_STEP -> Known.SEQUENCE_STEP
                SEQUENCE_STEP_ENROLLMENT -> Known.SEQUENCE_STEP_ENROLLMENT
                SERVICE -> Known.SERVICE
                SITE_PAGE -> Known.SITE_PAGE
                SNIPPET -> Known.SNIPPET
                SOCIAL_BROADCAST -> Known.SOCIAL_BROADCAST
                SOCIAL_CHANNEL -> Known.SOCIAL_CHANNEL
                SOCIAL_POST -> Known.SOCIAL_POST
                SOCIAL_PROFILE -> Known.SOCIAL_PROFILE
                SOX_PROTECTED_DUMMY_TYPE -> Known.SOX_PROTECTED_DUMMY_TYPE
                SOX_PROTECTED_TEST_TYPE -> Known.SOX_PROTECTED_TEST_TYPE
                SUBMISSION_TAG -> Known.SUBMISSION_TAG
                SUBSCRIPTION -> Known.SUBSCRIPTION
                TASK -> Known.TASK
                TASK_TEMPLATE -> Known.TASK_TEMPLATE
                TAX -> Known.TAX
                TEMPLATE -> Known.TEMPLATE
                TICKET -> Known.TICKET
                UNKNOWN -> Known.UNKNOWN
                UNSUBSCRIBE -> Known.UNSUBSCRIBE
                USER -> Known.USER
                VIEW -> Known.VIEW
                VIEW_BLOCK -> Known.VIEW_BLOCK
                WEB_INTERACTIVE -> Known.WEB_INTERACTIVE
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
            schema == other.schema &&
            type == other.type &&
            useChirp == other.useChirp &&
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
            schema,
            type,
            useChirp,
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
        "FieldTypeDefinition{externalOptions=$externalOptions, name=$name, options=$options, schema=$schema, type=$type, useChirp=$useChirp, description=$description, externalOptionsReferenceType=$externalOptionsReferenceType, fieldType=$fieldType, helpText=$helpText, label=$label, optionsUrl=$optionsUrl, referencedObjectType=$referencedObjectType, additionalProperties=$additionalProperties}"
}
