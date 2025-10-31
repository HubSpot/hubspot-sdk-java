// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge.properties

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.Enum
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import com.hubspot_sdk.api.models.OptionInput
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update an existing property for an object type. */
class PropertyUpdateParams
private constructor(
    private val appId: String,
    private val objectType: String,
    private val propertyName: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun appId(): String = appId

    fun objectType(): String = objectType

    fun propertyName(): Optional<String> = Optional.ofNullable(propertyName)

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun calculationFormula(): Optional<String> = body.calculationFormula()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun displayOrder(): Optional<Int> = body.displayOrder()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fieldType(): Optional<FieldType> = body.fieldType()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun formField(): Optional<Boolean> = body.formField()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun groupName(): Optional<String> = body.groupName()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hasUniqueValue(): Optional<Boolean> = body.hasUniqueValue()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hidden(): Optional<Boolean> = body.hidden()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun label(): Optional<String> = body.label()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun options(): Optional<List<OptionInput>> = body.options()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<Type> = body.type()

    /**
     * Returns the raw JSON value of [calculationFormula].
     *
     * Unlike [calculationFormula], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _calculationFormula(): JsonField<String> = body._calculationFormula()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [displayOrder].
     *
     * Unlike [displayOrder], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _displayOrder(): JsonField<Int> = body._displayOrder()

    /**
     * Returns the raw JSON value of [fieldType].
     *
     * Unlike [fieldType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _fieldType(): JsonField<FieldType> = body._fieldType()

    /**
     * Returns the raw JSON value of [formField].
     *
     * Unlike [formField], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _formField(): JsonField<Boolean> = body._formField()

    /**
     * Returns the raw JSON value of [groupName].
     *
     * Unlike [groupName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _groupName(): JsonField<String> = body._groupName()

    /**
     * Returns the raw JSON value of [hasUniqueValue].
     *
     * Unlike [hasUniqueValue], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _hasUniqueValue(): JsonField<Boolean> = body._hasUniqueValue()

    /**
     * Returns the raw JSON value of [hidden].
     *
     * Unlike [hidden], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _hidden(): JsonField<Boolean> = body._hidden()

    /**
     * Returns the raw JSON value of [label].
     *
     * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _label(): JsonField<String> = body._label()

    /**
     * Returns the raw JSON value of [options].
     *
     * Unlike [options], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _options(): JsonField<List<OptionInput>> = body._options()

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _type(): JsonField<Type> = body._type()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PropertyUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .appId()
         * .objectType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PropertyUpdateParams]. */
    class Builder internal constructor() {

        private var appId: String? = null
        private var objectType: String? = null
        private var propertyName: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(propertyUpdateParams: PropertyUpdateParams) = apply {
            appId = propertyUpdateParams.appId
            objectType = propertyUpdateParams.objectType
            propertyName = propertyUpdateParams.propertyName
            body = propertyUpdateParams.body.toBuilder()
            additionalHeaders = propertyUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = propertyUpdateParams.additionalQueryParams.toBuilder()
        }

        fun appId(appId: String) = apply { this.appId = appId }

        fun objectType(objectType: String) = apply { this.objectType = objectType }

        fun propertyName(propertyName: String?) = apply { this.propertyName = propertyName }

        /** Alias for calling [Builder.propertyName] with `propertyName.orElse(null)`. */
        fun propertyName(propertyName: Optional<String>) = propertyName(propertyName.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [calculationFormula]
         * - [description]
         * - [displayOrder]
         * - [fieldType]
         * - [formField]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun calculationFormula(calculationFormula: String) = apply {
            body.calculationFormula(calculationFormula)
        }

        /**
         * Sets [Builder.calculationFormula] to an arbitrary JSON value.
         *
         * You should usually call [Builder.calculationFormula] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun calculationFormula(calculationFormula: JsonField<String>) = apply {
            body.calculationFormula(calculationFormula)
        }

        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        fun displayOrder(displayOrder: Int) = apply { body.displayOrder(displayOrder) }

        /**
         * Sets [Builder.displayOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayOrder] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayOrder(displayOrder: JsonField<Int>) = apply { body.displayOrder(displayOrder) }

        fun fieldType(fieldType: FieldType) = apply { body.fieldType(fieldType) }

        /**
         * Sets [Builder.fieldType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fieldType] with a well-typed [FieldType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fieldType(fieldType: JsonField<FieldType>) = apply { body.fieldType(fieldType) }

        fun formField(formField: Boolean) = apply { body.formField(formField) }

        /**
         * Sets [Builder.formField] to an arbitrary JSON value.
         *
         * You should usually call [Builder.formField] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun formField(formField: JsonField<Boolean>) = apply { body.formField(formField) }

        fun groupName(groupName: String) = apply { body.groupName(groupName) }

        /**
         * Sets [Builder.groupName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun groupName(groupName: JsonField<String>) = apply { body.groupName(groupName) }

        fun hasUniqueValue(hasUniqueValue: Boolean) = apply { body.hasUniqueValue(hasUniqueValue) }

        /**
         * Sets [Builder.hasUniqueValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasUniqueValue] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hasUniqueValue(hasUniqueValue: JsonField<Boolean>) = apply {
            body.hasUniqueValue(hasUniqueValue)
        }

        fun hidden(hidden: Boolean) = apply { body.hidden(hidden) }

        /**
         * Sets [Builder.hidden] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hidden] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hidden(hidden: JsonField<Boolean>) = apply { body.hidden(hidden) }

        fun label(label: String) = apply { body.label(label) }

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: JsonField<String>) = apply { body.label(label) }

        fun options(options: List<OptionInput>) = apply { body.options(options) }

        /**
         * Sets [Builder.options] to an arbitrary JSON value.
         *
         * You should usually call [Builder.options] with a well-typed `List<OptionInput>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun options(options: JsonField<List<OptionInput>>) = apply { body.options(options) }

        /**
         * Adds a single [OptionInput] to [options].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOption(option: OptionInput) = apply { body.addOption(option) }

        fun type(type: Type) = apply { body.type(type) }

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { body.type(type) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [PropertyUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .appId()
         * .objectType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PropertyUpdateParams =
            PropertyUpdateParams(
                checkRequired("appId", appId),
                checkRequired("objectType", objectType),
                propertyName,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> appId
            1 -> objectType
            2 -> propertyName ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val calculationFormula: JsonField<String>,
        private val description: JsonField<String>,
        private val displayOrder: JsonField<Int>,
        private val fieldType: JsonField<FieldType>,
        private val formField: JsonField<Boolean>,
        private val groupName: JsonField<String>,
        private val hasUniqueValue: JsonField<Boolean>,
        private val hidden: JsonField<Boolean>,
        private val label: JsonField<String>,
        private val options: JsonField<List<OptionInput>>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("calculationFormula")
            @ExcludeMissing
            calculationFormula: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("displayOrder")
            @ExcludeMissing
            displayOrder: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("fieldType")
            @ExcludeMissing
            fieldType: JsonField<FieldType> = JsonMissing.of(),
            @JsonProperty("formField")
            @ExcludeMissing
            formField: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("groupName")
            @ExcludeMissing
            groupName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("hasUniqueValue")
            @ExcludeMissing
            hasUniqueValue: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("hidden") @ExcludeMissing hidden: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
            @JsonProperty("options")
            @ExcludeMissing
            options: JsonField<List<OptionInput>> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(
            calculationFormula,
            description,
            displayOrder,
            fieldType,
            formField,
            groupName,
            hasUniqueValue,
            hidden,
            label,
            options,
            type,
            mutableMapOf(),
        )

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun calculationFormula(): Optional<String> =
            calculationFormula.getOptional("calculationFormula")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun displayOrder(): Optional<Int> = displayOrder.getOptional("displayOrder")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fieldType(): Optional<FieldType> = fieldType.getOptional("fieldType")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun formField(): Optional<Boolean> = formField.getOptional("formField")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun groupName(): Optional<String> = groupName.getOptional("groupName")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun hasUniqueValue(): Optional<Boolean> = hasUniqueValue.getOptional("hasUniqueValue")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun hidden(): Optional<Boolean> = hidden.getOptional("hidden")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun label(): Optional<String> = label.getOptional("label")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun options(): Optional<List<OptionInput>> = options.getOptional("options")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [calculationFormula].
         *
         * Unlike [calculationFormula], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("calculationFormula")
        @ExcludeMissing
        fun _calculationFormula(): JsonField<String> = calculationFormula

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [displayOrder].
         *
         * Unlike [displayOrder], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("displayOrder")
        @ExcludeMissing
        fun _displayOrder(): JsonField<Int> = displayOrder

        /**
         * Returns the raw JSON value of [fieldType].
         *
         * Unlike [fieldType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fieldType")
        @ExcludeMissing
        fun _fieldType(): JsonField<FieldType> = fieldType

        /**
         * Returns the raw JSON value of [formField].
         *
         * Unlike [formField], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("formField") @ExcludeMissing fun _formField(): JsonField<Boolean> = formField

        /**
         * Returns the raw JSON value of [groupName].
         *
         * Unlike [groupName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("groupName") @ExcludeMissing fun _groupName(): JsonField<String> = groupName

        /**
         * Returns the raw JSON value of [hasUniqueValue].
         *
         * Unlike [hasUniqueValue], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("hasUniqueValue")
        @ExcludeMissing
        fun _hasUniqueValue(): JsonField<Boolean> = hasUniqueValue

        /**
         * Returns the raw JSON value of [hidden].
         *
         * Unlike [hidden], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("hidden") @ExcludeMissing fun _hidden(): JsonField<Boolean> = hidden

        /**
         * Returns the raw JSON value of [label].
         *
         * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

        /**
         * Returns the raw JSON value of [options].
         *
         * Unlike [options], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("options")
        @ExcludeMissing
        fun _options(): JsonField<List<OptionInput>> = options

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var calculationFormula: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var displayOrder: JsonField<Int> = JsonMissing.of()
            private var fieldType: JsonField<FieldType> = JsonMissing.of()
            private var formField: JsonField<Boolean> = JsonMissing.of()
            private var groupName: JsonField<String> = JsonMissing.of()
            private var hasUniqueValue: JsonField<Boolean> = JsonMissing.of()
            private var hidden: JsonField<Boolean> = JsonMissing.of()
            private var label: JsonField<String> = JsonMissing.of()
            private var options: JsonField<MutableList<OptionInput>>? = null
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                calculationFormula = body.calculationFormula
                description = body.description
                displayOrder = body.displayOrder
                fieldType = body.fieldType
                formField = body.formField
                groupName = body.groupName
                hasUniqueValue = body.hasUniqueValue
                hidden = body.hidden
                label = body.label
                options = body.options.map { it.toMutableList() }
                type = body.type
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun calculationFormula(calculationFormula: String) =
                calculationFormula(JsonField.of(calculationFormula))

            /**
             * Sets [Builder.calculationFormula] to an arbitrary JSON value.
             *
             * You should usually call [Builder.calculationFormula] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun calculationFormula(calculationFormula: JsonField<String>) = apply {
                this.calculationFormula = calculationFormula
            }

            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun displayOrder(displayOrder: Int) = displayOrder(JsonField.of(displayOrder))

            /**
             * Sets [Builder.displayOrder] to an arbitrary JSON value.
             *
             * You should usually call [Builder.displayOrder] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun displayOrder(displayOrder: JsonField<Int>) = apply {
                this.displayOrder = displayOrder
            }

            fun fieldType(fieldType: FieldType) = fieldType(JsonField.of(fieldType))

            /**
             * Sets [Builder.fieldType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fieldType] with a well-typed [FieldType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fieldType(fieldType: JsonField<FieldType>) = apply { this.fieldType = fieldType }

            fun formField(formField: Boolean) = formField(JsonField.of(formField))

            /**
             * Sets [Builder.formField] to an arbitrary JSON value.
             *
             * You should usually call [Builder.formField] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun formField(formField: JsonField<Boolean>) = apply { this.formField = formField }

            fun groupName(groupName: String) = groupName(JsonField.of(groupName))

            /**
             * Sets [Builder.groupName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groupName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun groupName(groupName: JsonField<String>) = apply { this.groupName = groupName }

            fun hasUniqueValue(hasUniqueValue: Boolean) =
                hasUniqueValue(JsonField.of(hasUniqueValue))

            /**
             * Sets [Builder.hasUniqueValue] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hasUniqueValue] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hasUniqueValue(hasUniqueValue: JsonField<Boolean>) = apply {
                this.hasUniqueValue = hasUniqueValue
            }

            fun hidden(hidden: Boolean) = hidden(JsonField.of(hidden))

            /**
             * Sets [Builder.hidden] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hidden] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hidden(hidden: JsonField<Boolean>) = apply { this.hidden = hidden }

            fun label(label: String) = label(JsonField.of(label))

            /**
             * Sets [Builder.label] to an arbitrary JSON value.
             *
             * You should usually call [Builder.label] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun label(label: JsonField<String>) = apply { this.label = label }

            fun options(options: List<OptionInput>) = options(JsonField.of(options))

            /**
             * Sets [Builder.options] to an arbitrary JSON value.
             *
             * You should usually call [Builder.options] with a well-typed `List<OptionInput>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun options(options: JsonField<List<OptionInput>>) = apply {
                this.options = options.map { it.toMutableList() }
            }

            /**
             * Adds a single [OptionInput] to [options].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOption(option: OptionInput) = apply {
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
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    calculationFormula,
                    description,
                    displayOrder,
                    fieldType,
                    formField,
                    groupName,
                    hasUniqueValue,
                    hidden,
                    label,
                    (options ?: JsonMissing.of()).map { it.toImmutable() },
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            calculationFormula()
            description()
            displayOrder()
            fieldType().ifPresent { it.validate() }
            formField()
            groupName()
            hasUniqueValue()
            hidden()
            label()
            options().ifPresent { it.forEach { it.validate() } }
            type().ifPresent { it.validate() }
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
            (if (calculationFormula.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (displayOrder.asKnown().isPresent) 1 else 0) +
                (fieldType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (formField.asKnown().isPresent) 1 else 0) +
                (if (groupName.asKnown().isPresent) 1 else 0) +
                (if (hasUniqueValue.asKnown().isPresent) 1 else 0) +
                (if (hidden.asKnown().isPresent) 1 else 0) +
                (if (label.asKnown().isPresent) 1 else 0) +
                (options.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                calculationFormula == other.calculationFormula &&
                description == other.description &&
                displayOrder == other.displayOrder &&
                fieldType == other.fieldType &&
                formField == other.formField &&
                groupName == other.groupName &&
                hasUniqueValue == other.hasUniqueValue &&
                hidden == other.hidden &&
                label == other.label &&
                options == other.options &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                calculationFormula,
                description,
                displayOrder,
                fieldType,
                formField,
                groupName,
                hasUniqueValue,
                hidden,
                label,
                options,
                type,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{calculationFormula=$calculationFormula, description=$description, displayOrder=$displayOrder, fieldType=$fieldType, formField=$formField, groupName=$groupName, hasUniqueValue=$hasUniqueValue, hidden=$hidden, label=$label, options=$options, type=$type, additionalProperties=$additionalProperties}"
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

            @JvmStatic fun of(value: String) = FieldType(JsonField.of(value))
        }

        /** An enum containing [FieldType]'s known values. */
        enum class Known {
            BOOLEANCHECKBOX,
            CALCULATION_EQUATION,
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

            @JvmField val DATE = of("date")

            @JvmField val DATETIME = of("datetime")

            @JvmField val ENUMERATION = of("enumeration")

            @JvmField val NUMBER = of("number")

            @JvmField val PHONE_NUMBER = of("phone_number")

            @JvmField val STRING = of("string")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            BOOL,
            DATE,
            DATETIME,
            ENUMERATION,
            NUMBER,
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
            DATE,
            DATETIME,
            ENUMERATION,
            NUMBER,
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
                DATE -> Value.DATE
                DATETIME -> Value.DATETIME
                ENUMERATION -> Value.ENUMERATION
                NUMBER -> Value.NUMBER
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
                DATE -> Known.DATE
                DATETIME -> Known.DATETIME
                ENUMERATION -> Known.ENUMERATION
                NUMBER -> Known.NUMBER
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PropertyUpdateParams &&
            appId == other.appId &&
            objectType == other.objectType &&
            propertyName == other.propertyName &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            appId,
            objectType,
            propertyName,
            body,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "PropertyUpdateParams{appId=$appId, objectType=$objectType, propertyName=$propertyName, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
