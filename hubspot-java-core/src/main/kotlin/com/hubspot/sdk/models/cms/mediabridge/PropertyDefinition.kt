// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

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
import com.hubspot.sdk.core.BaseDeserializer
import com.hubspot.sdk.core.BaseSerializer
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.allMaxBy
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.getOrThrow
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PropertyDefinition
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val objectTypeId: JsonField<String>,
    private val property: JsonField<Property>,
    private val calculationExpression: JsonField<CalculationExpression>,
    private val calculationFormula: JsonField<String>,
    private val definitionSource: JsonField<PropertyDefinitionSource>,
    private val extensionData: JsonField<ExtensionData>,
    private val externalOptionsMetaData: JsonField<ExternalOptionsMetaData>,
    private val fulcrumPortalId: JsonField<Int>,
    private val fulcrumTimestamp: JsonField<Long>,
    private val janusGroup: JsonField<String>,
    private val permission: JsonField<FieldLevelPermission>,
    private val propertyDefinitionSource: JsonField<DefinitionSource>,
    private val propertyRequirements: JsonField<DefaultRequirements>,
    private val rollupExpression: JsonField<RollupExpression>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("objectTypeId")
        @ExcludeMissing
        objectTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("property") @ExcludeMissing property: JsonField<Property> = JsonMissing.of(),
        @JsonProperty("calculationExpression")
        @ExcludeMissing
        calculationExpression: JsonField<CalculationExpression> = JsonMissing.of(),
        @JsonProperty("calculationFormula")
        @ExcludeMissing
        calculationFormula: JsonField<String> = JsonMissing.of(),
        @JsonProperty("definitionSource")
        @ExcludeMissing
        definitionSource: JsonField<PropertyDefinitionSource> = JsonMissing.of(),
        @JsonProperty("extensionData")
        @ExcludeMissing
        extensionData: JsonField<ExtensionData> = JsonMissing.of(),
        @JsonProperty("externalOptionsMetaData")
        @ExcludeMissing
        externalOptionsMetaData: JsonField<ExternalOptionsMetaData> = JsonMissing.of(),
        @JsonProperty("fulcrumPortalId")
        @ExcludeMissing
        fulcrumPortalId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("fulcrumTimestamp")
        @ExcludeMissing
        fulcrumTimestamp: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("janusGroup")
        @ExcludeMissing
        janusGroup: JsonField<String> = JsonMissing.of(),
        @JsonProperty("permission")
        @ExcludeMissing
        permission: JsonField<FieldLevelPermission> = JsonMissing.of(),
        @JsonProperty("propertyDefinitionSource")
        @ExcludeMissing
        propertyDefinitionSource: JsonField<DefinitionSource> = JsonMissing.of(),
        @JsonProperty("propertyRequirements")
        @ExcludeMissing
        propertyRequirements: JsonField<DefaultRequirements> = JsonMissing.of(),
        @JsonProperty("rollupExpression")
        @ExcludeMissing
        rollupExpression: JsonField<RollupExpression> = JsonMissing.of(),
    ) : this(
        objectTypeId,
        property,
        calculationExpression,
        calculationFormula,
        definitionSource,
        extensionData,
        externalOptionsMetaData,
        fulcrumPortalId,
        fulcrumTimestamp,
        janusGroup,
        permission,
        propertyDefinitionSource,
        propertyRequirements,
        rollupExpression,
        mutableMapOf(),
    )

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectTypeId(): String = objectTypeId.getRequired("objectTypeId")

    /**
     * A HubSpot property
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun property(): Property = property.getRequired("property")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun calculationExpression(): Optional<CalculationExpression> =
        calculationExpression.getOptional("calculationExpression")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun calculationFormula(): Optional<String> =
        calculationFormula.getOptional("calculationFormula")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun definitionSource(): Optional<PropertyDefinitionSource> =
        definitionSource.getOptional("definitionSource")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun extensionData(): Optional<ExtensionData> = extensionData.getOptional("extensionData")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalOptionsMetaData(): Optional<ExternalOptionsMetaData> =
        externalOptionsMetaData.getOptional("externalOptionsMetaData")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fulcrumPortalId(): Optional<Int> = fulcrumPortalId.getOptional("fulcrumPortalId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fulcrumTimestamp(): Optional<Long> = fulcrumTimestamp.getOptional("fulcrumTimestamp")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun janusGroup(): Optional<String> = janusGroup.getOptional("janusGroup")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun permission(): Optional<FieldLevelPermission> = permission.getOptional("permission")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun propertyDefinitionSource(): Optional<DefinitionSource> =
        propertyDefinitionSource.getOptional("propertyDefinitionSource")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun propertyRequirements(): Optional<DefaultRequirements> =
        propertyRequirements.getOptional("propertyRequirements")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rollupExpression(): Optional<RollupExpression> =
        rollupExpression.getOptional("rollupExpression")

    /**
     * Returns the raw JSON value of [objectTypeId].
     *
     * Unlike [objectTypeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectTypeId")
    @ExcludeMissing
    fun _objectTypeId(): JsonField<String> = objectTypeId

    /**
     * Returns the raw JSON value of [property].
     *
     * Unlike [property], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("property") @ExcludeMissing fun _property(): JsonField<Property> = property

    /**
     * Returns the raw JSON value of [calculationExpression].
     *
     * Unlike [calculationExpression], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("calculationExpression")
    @ExcludeMissing
    fun _calculationExpression(): JsonField<CalculationExpression> = calculationExpression

    /**
     * Returns the raw JSON value of [calculationFormula].
     *
     * Unlike [calculationFormula], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("calculationFormula")
    @ExcludeMissing
    fun _calculationFormula(): JsonField<String> = calculationFormula

    /**
     * Returns the raw JSON value of [definitionSource].
     *
     * Unlike [definitionSource], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("definitionSource")
    @ExcludeMissing
    fun _definitionSource(): JsonField<PropertyDefinitionSource> = definitionSource

    /**
     * Returns the raw JSON value of [extensionData].
     *
     * Unlike [extensionData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("extensionData")
    @ExcludeMissing
    fun _extensionData(): JsonField<ExtensionData> = extensionData

    /**
     * Returns the raw JSON value of [externalOptionsMetaData].
     *
     * Unlike [externalOptionsMetaData], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("externalOptionsMetaData")
    @ExcludeMissing
    fun _externalOptionsMetaData(): JsonField<ExternalOptionsMetaData> = externalOptionsMetaData

    /**
     * Returns the raw JSON value of [fulcrumPortalId].
     *
     * Unlike [fulcrumPortalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fulcrumPortalId")
    @ExcludeMissing
    fun _fulcrumPortalId(): JsonField<Int> = fulcrumPortalId

    /**
     * Returns the raw JSON value of [fulcrumTimestamp].
     *
     * Unlike [fulcrumTimestamp], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("fulcrumTimestamp")
    @ExcludeMissing
    fun _fulcrumTimestamp(): JsonField<Long> = fulcrumTimestamp

    /**
     * Returns the raw JSON value of [janusGroup].
     *
     * Unlike [janusGroup], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("janusGroup") @ExcludeMissing fun _janusGroup(): JsonField<String> = janusGroup

    /**
     * Returns the raw JSON value of [permission].
     *
     * Unlike [permission], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("permission")
    @ExcludeMissing
    fun _permission(): JsonField<FieldLevelPermission> = permission

    /**
     * Returns the raw JSON value of [propertyDefinitionSource].
     *
     * Unlike [propertyDefinitionSource], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("propertyDefinitionSource")
    @ExcludeMissing
    fun _propertyDefinitionSource(): JsonField<DefinitionSource> = propertyDefinitionSource

    /**
     * Returns the raw JSON value of [propertyRequirements].
     *
     * Unlike [propertyRequirements], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("propertyRequirements")
    @ExcludeMissing
    fun _propertyRequirements(): JsonField<DefaultRequirements> = propertyRequirements

    /**
     * Returns the raw JSON value of [rollupExpression].
     *
     * Unlike [rollupExpression], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("rollupExpression")
    @ExcludeMissing
    fun _rollupExpression(): JsonField<RollupExpression> = rollupExpression

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
         * Returns a mutable builder for constructing an instance of [PropertyDefinition].
         *
         * The following fields are required:
         * ```java
         * .objectTypeId()
         * .property()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PropertyDefinition]. */
    class Builder internal constructor() {

        private var objectTypeId: JsonField<String>? = null
        private var property: JsonField<Property>? = null
        private var calculationExpression: JsonField<CalculationExpression> = JsonMissing.of()
        private var calculationFormula: JsonField<String> = JsonMissing.of()
        private var definitionSource: JsonField<PropertyDefinitionSource> = JsonMissing.of()
        private var extensionData: JsonField<ExtensionData> = JsonMissing.of()
        private var externalOptionsMetaData: JsonField<ExternalOptionsMetaData> = JsonMissing.of()
        private var fulcrumPortalId: JsonField<Int> = JsonMissing.of()
        private var fulcrumTimestamp: JsonField<Long> = JsonMissing.of()
        private var janusGroup: JsonField<String> = JsonMissing.of()
        private var permission: JsonField<FieldLevelPermission> = JsonMissing.of()
        private var propertyDefinitionSource: JsonField<DefinitionSource> = JsonMissing.of()
        private var propertyRequirements: JsonField<DefaultRequirements> = JsonMissing.of()
        private var rollupExpression: JsonField<RollupExpression> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(propertyDefinition: PropertyDefinition) = apply {
            objectTypeId = propertyDefinition.objectTypeId
            property = propertyDefinition.property
            calculationExpression = propertyDefinition.calculationExpression
            calculationFormula = propertyDefinition.calculationFormula
            definitionSource = propertyDefinition.definitionSource
            extensionData = propertyDefinition.extensionData
            externalOptionsMetaData = propertyDefinition.externalOptionsMetaData
            fulcrumPortalId = propertyDefinition.fulcrumPortalId
            fulcrumTimestamp = propertyDefinition.fulcrumTimestamp
            janusGroup = propertyDefinition.janusGroup
            permission = propertyDefinition.permission
            propertyDefinitionSource = propertyDefinition.propertyDefinitionSource
            propertyRequirements = propertyDefinition.propertyRequirements
            rollupExpression = propertyDefinition.rollupExpression
            additionalProperties = propertyDefinition.additionalProperties.toMutableMap()
        }

        fun objectTypeId(objectTypeId: String) = objectTypeId(JsonField.of(objectTypeId))

        /**
         * Sets [Builder.objectTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectTypeId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun objectTypeId(objectTypeId: JsonField<String>) = apply {
            this.objectTypeId = objectTypeId
        }

        /** A HubSpot property */
        fun property(property: Property) = property(JsonField.of(property))

        /**
         * Sets [Builder.property] to an arbitrary JSON value.
         *
         * You should usually call [Builder.property] with a well-typed [Property] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun property(property: JsonField<Property>) = apply { this.property = property }

        fun calculationExpression(calculationExpression: CalculationExpression) =
            calculationExpression(JsonField.of(calculationExpression))

        /**
         * Sets [Builder.calculationExpression] to an arbitrary JSON value.
         *
         * You should usually call [Builder.calculationExpression] with a well-typed
         * [CalculationExpression] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun calculationExpression(calculationExpression: JsonField<CalculationExpression>) = apply {
            this.calculationExpression = calculationExpression
        }

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofConstantBoolean(constantBoolean)`.
         */
        fun calculationExpression(constantBoolean: ConstantBoolean) =
            calculationExpression(CalculationExpression.ofConstantBoolean(constantBoolean))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofConstantNumber(constantNumber)`.
         */
        fun calculationExpression(constantNumber: ConstantNumber) =
            calculationExpression(CalculationExpression.ofConstantNumber(constantNumber))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofConstantString(constantString)`.
         */
        fun calculationExpression(constantString: ConstantString) =
            calculationExpression(CalculationExpression.ofConstantString(constantString))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofBooleanPropertyVariable(booleanPropertyVariable)`.
         */
        fun calculationExpression(booleanPropertyVariable: BooleanPropertyVariable) =
            calculationExpression(
                CalculationExpression.ofBooleanPropertyVariable(booleanPropertyVariable)
            )

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofStringPropertyVariable(stringPropertyVariable)`.
         */
        fun calculationExpression(stringPropertyVariable: StringPropertyVariable) =
            calculationExpression(
                CalculationExpression.ofStringPropertyVariable(stringPropertyVariable)
            )

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofNumberPropertyVariable(numberPropertyVariable)`.
         */
        fun calculationExpression(numberPropertyVariable: NumberPropertyVariable) =
            calculationExpression(
                CalculationExpression.ofNumberPropertyVariable(numberPropertyVariable)
            )

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofTimestampOfPropertyVariable(timestampOfPropertyVariable)`.
         */
        fun calculationExpression(timestampOfPropertyVariable: TimestampOfPropertyVariable) =
            calculationExpression(
                CalculationExpression.ofTimestampOfPropertyVariable(timestampOfPropertyVariable)
            )

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofBooleanTargetPropertyVariable(booleanTargetPropertyVariable)`.
         */
        fun calculationExpression(booleanTargetPropertyVariable: BooleanTargetPropertyVariable) =
            calculationExpression(
                CalculationExpression.ofBooleanTargetPropertyVariable(booleanTargetPropertyVariable)
            )

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofStringTargetPropertyVariable(stringTargetPropertyVariable)`.
         */
        fun calculationExpression(stringTargetPropertyVariable: StringTargetPropertyVariable) =
            calculationExpression(
                CalculationExpression.ofStringTargetPropertyVariable(stringTargetPropertyVariable)
            )

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofNumberTargetPropertyVariable(numberTargetPropertyVariable)`.
         */
        fun calculationExpression(numberTargetPropertyVariable: NumberTargetPropertyVariable) =
            calculationExpression(
                CalculationExpression.ofNumberTargetPropertyVariable(numberTargetPropertyVariable)
            )

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofTimestampOfTargetPropertyVariable(timestampOfTargetPropertyVariable)`.
         */
        fun calculationExpression(
            timestampOfTargetPropertyVariable: TimestampOfTargetPropertyVariable
        ) =
            calculationExpression(
                CalculationExpression.ofTimestampOfTargetPropertyVariable(
                    timestampOfTargetPropertyVariable
                )
            )

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofAddNumbers(addNumbers)`.
         */
        fun calculationExpression(addNumbers: AddNumbers) =
            calculationExpression(CalculationExpression.ofAddNumbers(addNumbers))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofSubtractNumbers(subtractNumbers)`.
         */
        fun calculationExpression(subtractNumbers: SubtractNumbers) =
            calculationExpression(CalculationExpression.ofSubtractNumbers(subtractNumbers))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofMultiplyNumbers(multiplyNumbers)`.
         */
        fun calculationExpression(multiplyNumbers: MultiplyNumbers) =
            calculationExpression(CalculationExpression.ofMultiplyNumbers(multiplyNumbers))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofDivideNumbers(divideNumbers)`.
         */
        fun calculationExpression(divideNumbers: DivideNumbers) =
            calculationExpression(CalculationExpression.ofDivideNumbers(divideNumbers))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofRoundDownNumbers(roundDownNumbers)`.
         */
        fun calculationExpression(roundDownNumbers: RoundDownNumbers) =
            calculationExpression(CalculationExpression.ofRoundDownNumbers(roundDownNumbers))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofRoundUpNumbers(roundUpNumbers)`.
         */
        fun calculationExpression(roundUpNumbers: RoundUpNumbers) =
            calculationExpression(CalculationExpression.ofRoundUpNumbers(roundUpNumbers))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofRoundNearestNumbers(roundNearestNumbers)`.
         */
        fun calculationExpression(roundNearestNumbers: RoundNearestNumbers) =
            calculationExpression(CalculationExpression.ofRoundNearestNumbers(roundNearestNumbers))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofUpperCase(upperCase)`.
         */
        fun calculationExpression(upperCase: UpperCase) =
            calculationExpression(CalculationExpression.ofUpperCase(upperCase))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofLowerCase(lowerCase)`.
         */
        fun calculationExpression(lowerCase: LowerCase) =
            calculationExpression(CalculationExpression.ofLowerCase(lowerCase))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofConcatStrings(concatStrings)`.
         */
        fun calculationExpression(concatStrings: ConcatStrings) =
            calculationExpression(CalculationExpression.ofConcatStrings(concatStrings))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofContains(contains)`.
         */
        fun calculationExpression(contains: Contains) =
            calculationExpression(CalculationExpression.ofContains(contains))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofBeginsWith(beginsWith)`.
         */
        fun calculationExpression(beginsWith: BeginsWith) =
            calculationExpression(CalculationExpression.ofBeginsWith(beginsWith))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofNumberToString(numberToString)`.
         */
        fun calculationExpression(numberToString: NumberToString) =
            calculationExpression(CalculationExpression.ofNumberToString(numberToString))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofParseNumber(parseNumber)`.
         */
        fun calculationExpression(parseNumber: ParseNumber) =
            calculationExpression(CalculationExpression.ofParseNumber(parseNumber))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofFetchExchangeRate(fetchExchangeRate)`.
         */
        fun calculationExpression(fetchExchangeRate: FetchExchangeRate) =
            calculationExpression(CalculationExpression.ofFetchExchangeRate(fetchExchangeRate))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofFetchCurrencyDecimalPlaces(fetchCurrencyDecimalPlaces)`.
         */
        fun calculationExpression(fetchCurrencyDecimalPlaces: FetchCurrencyDecimalPlaces) =
            calculationExpression(
                CalculationExpression.ofFetchCurrencyDecimalPlaces(fetchCurrencyDecimalPlaces)
            )

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofFetchSingleCurrencyPortalCurrency(fetchSingleCurrencyPortalCurrency)`.
         */
        fun calculationExpression(
            fetchSingleCurrencyPortalCurrency: FetchSingleCurrencyPortalCurrency
        ) =
            calculationExpression(
                CalculationExpression.ofFetchSingleCurrencyPortalCurrency(
                    fetchSingleCurrencyPortalCurrency
                )
            )

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofDatedExchangeRate(datedExchangeRate)`.
         */
        fun calculationExpression(datedExchangeRate: DatedExchangeRate) =
            calculationExpression(CalculationExpression.ofDatedExchangeRate(datedExchangeRate))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofPipelineProbability(pipelineProbability)`.
         */
        fun calculationExpression(pipelineProbability: PipelineProbability) =
            calculationExpression(CalculationExpression.ofPipelineProbability(pipelineProbability))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofMaxNumbers(maxNumbers)`.
         */
        fun calculationExpression(maxNumbers: MaxNumbers) =
            calculationExpression(CalculationExpression.ofMaxNumbers(maxNumbers))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofMinNumbers(minNumbers)`.
         */
        fun calculationExpression(minNumbers: MinNumbers) =
            calculationExpression(CalculationExpression.ofMinNumbers(minNumbers))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofLessThan(lessThan)`.
         */
        fun calculationExpression(lessThan: LessThan) =
            calculationExpression(CalculationExpression.ofLessThan(lessThan))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofLessThanOrEqual(lessThanOrEqual)`.
         */
        fun calculationExpression(lessThanOrEqual: LessThanOrEqual) =
            calculationExpression(CalculationExpression.ofLessThanOrEqual(lessThanOrEqual))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofMoreThan(moreThan)`.
         */
        fun calculationExpression(moreThan: MoreThan) =
            calculationExpression(CalculationExpression.ofMoreThan(moreThan))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofMoreThanOrEqual(moreThanOrEqual)`.
         */
        fun calculationExpression(moreThanOrEqual: MoreThanOrEqual) =
            calculationExpression(CalculationExpression.ofMoreThanOrEqual(moreThanOrEqual))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofNumberEquals(numberEquals)`.
         */
        fun calculationExpression(numberEquals: NumberEquals) =
            calculationExpression(CalculationExpression.ofNumberEquals(numberEquals))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofStringEquals(stringEquals)`.
         */
        fun calculationExpression(stringEquals: StringEquals) =
            calculationExpression(CalculationExpression.ofStringEquals(stringEquals))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofIsPipelineStageClosed(isPipelineStageClosed)`.
         */
        fun calculationExpression(isPipelineStageClosed: IsPipelineStageClosed) =
            calculationExpression(
                CalculationExpression.ofIsPipelineStageClosed(isPipelineStageClosed)
            )

        /** Alias for calling [calculationExpression] with `CalculationExpression.ofNot(not)`. */
        fun calculationExpression(not: Not) =
            calculationExpression(CalculationExpression.ofNot(not))

        /** Alias for calling [calculationExpression] with `CalculationExpression.ofDate(date)`. */
        fun calculationExpression(date: Date) =
            calculationExpression(CalculationExpression.ofDate(date))

        /**
         * Alias for calling [calculationExpression] with `CalculationExpression.ofMonth(month)`.
         */
        fun calculationExpression(month: Month) =
            calculationExpression(CalculationExpression.ofMonth(month))

        /** Alias for calling [calculationExpression] with `CalculationExpression.ofYear(year)`. */
        fun calculationExpression(year: Year) =
            calculationExpression(CalculationExpression.ofYear(year))

        /** Alias for calling [calculationExpression] with `CalculationExpression.ofNow(now)`. */
        fun calculationExpression(now: Now) =
            calculationExpression(CalculationExpression.ofNow(now))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofTimeBetween(timeBetween)`.
         */
        fun calculationExpression(timeBetween: TimeBetween) =
            calculationExpression(CalculationExpression.ofTimeBetween(timeBetween))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofTimeBetweenSkipWeekends(timeBetweenSkipWeekends)`.
         */
        fun calculationExpression(timeBetweenSkipWeekends: TimeBetweenSkipWeekends) =
            calculationExpression(
                CalculationExpression.ofTimeBetweenSkipWeekends(timeBetweenSkipWeekends)
            )

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofPeriodToMonths(periodToMonths)`.
         */
        fun calculationExpression(periodToMonths: PeriodToMonths) =
            calculationExpression(CalculationExpression.ofPeriodToMonths(periodToMonths))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofPeriodToWeeks(periodToWeeks)`.
         */
        fun calculationExpression(periodToWeeks: PeriodToWeeks) =
            calculationExpression(CalculationExpression.ofPeriodToWeeks(periodToWeeks))

        /** Alias for calling [calculationExpression] with `CalculationExpression.ofAnd(and)`. */
        fun calculationExpression(and: And) =
            calculationExpression(CalculationExpression.ofAnd(and))

        /** Alias for calling [calculationExpression] with `CalculationExpression.ofOr(or)`. */
        fun calculationExpression(or: Or) = calculationExpression(CalculationExpression.ofOr(or))

        /** Alias for calling [calculationExpression] with `CalculationExpression.ofXor(xor)`. */
        fun calculationExpression(xor: Xor) =
            calculationExpression(CalculationExpression.ofXor(xor))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofIfString(ifString)`.
         */
        fun calculationExpression(ifString: IfString) =
            calculationExpression(CalculationExpression.ofIfString(ifString))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofIfNumber(ifNumber)`.
         */
        fun calculationExpression(ifNumber: IfNumber) =
            calculationExpression(CalculationExpression.ofIfNumber(ifNumber))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofIfBoolean(ifBoolean)`.
         */
        fun calculationExpression(ifBoolean: IfBoolean) =
            calculationExpression(CalculationExpression.ofIfBoolean(ifBoolean))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofIsPresent(isPresent)`.
         */
        fun calculationExpression(isPresent: IsPresent) =
            calculationExpression(CalculationExpression.ofIsPresent(isPresent))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofHasEmailReply(hasEmailReply)`.
         */
        fun calculationExpression(hasEmailReply: HasEmailReply) =
            calculationExpression(CalculationExpression.ofHasEmailReply(hasEmailReply))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofHasPlainTextEmailReply(hasPlainTextEmailReply)`.
         */
        fun calculationExpression(hasPlainTextEmailReply: HasPlainTextEmailReply) =
            calculationExpression(
                CalculationExpression.ofHasPlainTextEmailReply(hasPlainTextEmailReply)
            )

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofExtractMostRecentEmailReplyHtml(extractMostRecentEmailReplyHtml)`.
         */
        fun calculationExpression(
            extractMostRecentEmailReplyHtml: ExtractMostRecentEmailReplyHtml
        ) =
            calculationExpression(
                CalculationExpression.ofExtractMostRecentEmailReplyHtml(
                    extractMostRecentEmailReplyHtml
                )
            )

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofExtractMostRecentEmailReplyText(extractMostRecentEmailReplyText)`.
         */
        fun calculationExpression(
            extractMostRecentEmailReplyText: ExtractMostRecentEmailReplyText
        ) =
            calculationExpression(
                CalculationExpression.ofExtractMostRecentEmailReplyText(
                    extractMostRecentEmailReplyText
                )
            )

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofExtractMostRecentPlainTextEmailReply(extractMostRecentPlainTextEmailReply)`.
         */
        fun calculationExpression(
            extractMostRecentPlainTextEmailReply: ExtractMostRecentPlainTextEmailReply
        ) =
            calculationExpression(
                CalculationExpression.ofExtractMostRecentPlainTextEmailReply(
                    extractMostRecentPlainTextEmailReply
                )
            )

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofSetContainsString(setContainsString)`.
         */
        fun calculationExpression(setContainsString: SetContainsString) =
            calculationExpression(CalculationExpression.ofSetContainsString(setContainsString))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofIsEngagementType(isEngagementType)`.
         */
        fun calculationExpression(isEngagementType: IsEngagementType) =
            calculationExpression(CalculationExpression.ofIsEngagementType(isEngagementType))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofFormatFullName(formatFullName)`.
         */
        fun calculationExpression(formatFullName: FormatFullName) =
            calculationExpression(CalculationExpression.ofFormatFullName(formatFullName))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofFormatPhoneNumber(formatPhoneNumber)`.
         */
        fun calculationExpression(formatPhoneNumber: FormatPhoneNumber) =
            calculationExpression(CalculationExpression.ofFormatPhoneNumber(formatPhoneNumber))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofFormatSearchablePhoneNumber(formatSearchablePhoneNumber)`.
         */
        fun calculationExpression(formatSearchablePhoneNumber: FormatSearchablePhoneNumber) =
            calculationExpression(
                CalculationExpression.ofFormatSearchablePhoneNumber(formatSearchablePhoneNumber)
            )

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofAbsoluteValue(absoluteValue)`.
         */
        fun calculationExpression(absoluteValue: AbsoluteValue) =
            calculationExpression(CalculationExpression.ofAbsoluteValue(absoluteValue))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofSquareRoot(squareRoot)`.
         */
        fun calculationExpression(squareRoot: SquareRoot) =
            calculationExpression(CalculationExpression.ofSquareRoot(squareRoot))

        /**
         * Alias for calling [calculationExpression] with `CalculationExpression.ofPower(power)`.
         */
        fun calculationExpression(power: Power) =
            calculationExpression(CalculationExpression.ofPower(power))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofSubstring(substring)`.
         */
        fun calculationExpression(substring: Substring) =
            calculationExpression(CalculationExpression.ofSubstring(substring))

        /**
         * Alias for calling [calculationExpression] with `CalculationExpression.ofEuler(euler)`.
         */
        fun calculationExpression(euler: Euler) =
            calculationExpression(CalculationExpression.ofEuler(euler))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofStringLength(stringLength)`.
         */
        fun calculationExpression(stringLength: StringLength) =
            calculationExpression(CalculationExpression.ofStringLength(stringLength))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofAddTime(addTime)`.
         */
        fun calculationExpression(addTime: AddTime) =
            calculationExpression(CalculationExpression.ofAddTime(addTime))

        /**
         * Alias for calling [calculationExpression] with
         * `CalculationExpression.ofSubtractTime(subtractTime)`.
         */
        fun calculationExpression(subtractTime: SubtractTime) =
            calculationExpression(CalculationExpression.ofSubtractTime(subtractTime))

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

        fun definitionSource(definitionSource: PropertyDefinitionSource) =
            definitionSource(JsonField.of(definitionSource))

        /**
         * Sets [Builder.definitionSource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.definitionSource] with a well-typed
         * [PropertyDefinitionSource] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun definitionSource(definitionSource: JsonField<PropertyDefinitionSource>) = apply {
            this.definitionSource = definitionSource
        }

        fun extensionData(extensionData: ExtensionData) = extensionData(JsonField.of(extensionData))

        /**
         * Sets [Builder.extensionData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extensionData] with a well-typed [ExtensionData] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun extensionData(extensionData: JsonField<ExtensionData>) = apply {
            this.extensionData = extensionData
        }

        fun externalOptionsMetaData(externalOptionsMetaData: ExternalOptionsMetaData) =
            externalOptionsMetaData(JsonField.of(externalOptionsMetaData))

        /**
         * Sets [Builder.externalOptionsMetaData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalOptionsMetaData] with a well-typed
         * [ExternalOptionsMetaData] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun externalOptionsMetaData(externalOptionsMetaData: JsonField<ExternalOptionsMetaData>) =
            apply {
                this.externalOptionsMetaData = externalOptionsMetaData
            }

        fun fulcrumPortalId(fulcrumPortalId: Int) = fulcrumPortalId(JsonField.of(fulcrumPortalId))

        /**
         * Sets [Builder.fulcrumPortalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fulcrumPortalId] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fulcrumPortalId(fulcrumPortalId: JsonField<Int>) = apply {
            this.fulcrumPortalId = fulcrumPortalId
        }

        fun fulcrumTimestamp(fulcrumTimestamp: Long) =
            fulcrumTimestamp(JsonField.of(fulcrumTimestamp))

        /**
         * Sets [Builder.fulcrumTimestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fulcrumTimestamp] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fulcrumTimestamp(fulcrumTimestamp: JsonField<Long>) = apply {
            this.fulcrumTimestamp = fulcrumTimestamp
        }

        fun janusGroup(janusGroup: String) = janusGroup(JsonField.of(janusGroup))

        /**
         * Sets [Builder.janusGroup] to an arbitrary JSON value.
         *
         * You should usually call [Builder.janusGroup] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun janusGroup(janusGroup: JsonField<String>) = apply { this.janusGroup = janusGroup }

        fun permission(permission: FieldLevelPermission) = permission(JsonField.of(permission))

        /**
         * Sets [Builder.permission] to an arbitrary JSON value.
         *
         * You should usually call [Builder.permission] with a well-typed [FieldLevelPermission]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun permission(permission: JsonField<FieldLevelPermission>) = apply {
            this.permission = permission
        }

        fun propertyDefinitionSource(propertyDefinitionSource: DefinitionSource) =
            propertyDefinitionSource(JsonField.of(propertyDefinitionSource))

        /**
         * Sets [Builder.propertyDefinitionSource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.propertyDefinitionSource] with a well-typed
         * [DefinitionSource] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun propertyDefinitionSource(propertyDefinitionSource: JsonField<DefinitionSource>) =
            apply {
                this.propertyDefinitionSource = propertyDefinitionSource
            }

        fun propertyRequirements(propertyRequirements: DefaultRequirements) =
            propertyRequirements(JsonField.of(propertyRequirements))

        /**
         * Sets [Builder.propertyRequirements] to an arbitrary JSON value.
         *
         * You should usually call [Builder.propertyRequirements] with a well-typed
         * [DefaultRequirements] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun propertyRequirements(propertyRequirements: JsonField<DefaultRequirements>) = apply {
            this.propertyRequirements = propertyRequirements
        }

        fun rollupExpression(rollupExpression: RollupExpression) =
            rollupExpression(JsonField.of(rollupExpression))

        /**
         * Sets [Builder.rollupExpression] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rollupExpression] with a well-typed [RollupExpression]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun rollupExpression(rollupExpression: JsonField<RollupExpression>) = apply {
            this.rollupExpression = rollupExpression
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
         * Returns an immutable instance of [PropertyDefinition].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .objectTypeId()
         * .property()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PropertyDefinition =
            PropertyDefinition(
                checkRequired("objectTypeId", objectTypeId),
                checkRequired("property", property),
                calculationExpression,
                calculationFormula,
                definitionSource,
                extensionData,
                externalOptionsMetaData,
                fulcrumPortalId,
                fulcrumTimestamp,
                janusGroup,
                permission,
                propertyDefinitionSource,
                propertyRequirements,
                rollupExpression,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PropertyDefinition = apply {
        if (validated) {
            return@apply
        }

        objectTypeId()
        property().validate()
        calculationExpression().ifPresent { it.validate() }
        calculationFormula()
        definitionSource().ifPresent { it.validate() }
        extensionData().ifPresent { it.validate() }
        externalOptionsMetaData().ifPresent { it.validate() }
        fulcrumPortalId()
        fulcrumTimestamp()
        janusGroup()
        permission().ifPresent { it.validate() }
        propertyDefinitionSource().ifPresent { it.validate() }
        propertyRequirements().ifPresent { it.validate() }
        rollupExpression().ifPresent { it.validate() }
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
        (if (objectTypeId.asKnown().isPresent) 1 else 0) +
            (property.asKnown().getOrNull()?.validity() ?: 0) +
            (calculationExpression.asKnown().getOrNull()?.validity() ?: 0) +
            (if (calculationFormula.asKnown().isPresent) 1 else 0) +
            (definitionSource.asKnown().getOrNull()?.validity() ?: 0) +
            (extensionData.asKnown().getOrNull()?.validity() ?: 0) +
            (externalOptionsMetaData.asKnown().getOrNull()?.validity() ?: 0) +
            (if (fulcrumPortalId.asKnown().isPresent) 1 else 0) +
            (if (fulcrumTimestamp.asKnown().isPresent) 1 else 0) +
            (if (janusGroup.asKnown().isPresent) 1 else 0) +
            (permission.asKnown().getOrNull()?.validity() ?: 0) +
            (propertyDefinitionSource.asKnown().getOrNull()?.validity() ?: 0) +
            (propertyRequirements.asKnown().getOrNull()?.validity() ?: 0) +
            (rollupExpression.asKnown().getOrNull()?.validity() ?: 0)

    @JsonDeserialize(using = CalculationExpression.Deserializer::class)
    @JsonSerialize(using = CalculationExpression.Serializer::class)
    class CalculationExpression
    private constructor(
        private val constantBoolean: ConstantBoolean? = null,
        private val constantNumber: ConstantNumber? = null,
        private val constantString: ConstantString? = null,
        private val booleanPropertyVariable: BooleanPropertyVariable? = null,
        private val stringPropertyVariable: StringPropertyVariable? = null,
        private val numberPropertyVariable: NumberPropertyVariable? = null,
        private val timestampOfPropertyVariable: TimestampOfPropertyVariable? = null,
        private val booleanTargetPropertyVariable: BooleanTargetPropertyVariable? = null,
        private val stringTargetPropertyVariable: StringTargetPropertyVariable? = null,
        private val numberTargetPropertyVariable: NumberTargetPropertyVariable? = null,
        private val timestampOfTargetPropertyVariable: TimestampOfTargetPropertyVariable? = null,
        private val addNumbers: AddNumbers? = null,
        private val subtractNumbers: SubtractNumbers? = null,
        private val multiplyNumbers: MultiplyNumbers? = null,
        private val divideNumbers: DivideNumbers? = null,
        private val roundDownNumbers: RoundDownNumbers? = null,
        private val roundUpNumbers: RoundUpNumbers? = null,
        private val roundNearestNumbers: RoundNearestNumbers? = null,
        private val upperCase: UpperCase? = null,
        private val lowerCase: LowerCase? = null,
        private val concatStrings: ConcatStrings? = null,
        private val contains: Contains? = null,
        private val beginsWith: BeginsWith? = null,
        private val numberToString: NumberToString? = null,
        private val parseNumber: ParseNumber? = null,
        private val fetchExchangeRate: FetchExchangeRate? = null,
        private val fetchCurrencyDecimalPlaces: FetchCurrencyDecimalPlaces? = null,
        private val fetchSingleCurrencyPortalCurrency: FetchSingleCurrencyPortalCurrency? = null,
        private val datedExchangeRate: DatedExchangeRate? = null,
        private val pipelineProbability: PipelineProbability? = null,
        private val maxNumbers: MaxNumbers? = null,
        private val minNumbers: MinNumbers? = null,
        private val lessThan: LessThan? = null,
        private val lessThanOrEqual: LessThanOrEqual? = null,
        private val moreThan: MoreThan? = null,
        private val moreThanOrEqual: MoreThanOrEqual? = null,
        private val numberEquals: NumberEquals? = null,
        private val stringEquals: StringEquals? = null,
        private val isPipelineStageClosed: IsPipelineStageClosed? = null,
        private val not: Not? = null,
        private val date: Date? = null,
        private val month: Month? = null,
        private val year: Year? = null,
        private val now: Now? = null,
        private val timeBetween: TimeBetween? = null,
        private val timeBetweenSkipWeekends: TimeBetweenSkipWeekends? = null,
        private val periodToMonths: PeriodToMonths? = null,
        private val periodToWeeks: PeriodToWeeks? = null,
        private val and: And? = null,
        private val or: Or? = null,
        private val xor: Xor? = null,
        private val ifString: IfString? = null,
        private val ifNumber: IfNumber? = null,
        private val ifBoolean: IfBoolean? = null,
        private val isPresent: IsPresent? = null,
        private val hasEmailReply: HasEmailReply? = null,
        private val hasPlainTextEmailReply: HasPlainTextEmailReply? = null,
        private val extractMostRecentEmailReplyHtml: ExtractMostRecentEmailReplyHtml? = null,
        private val extractMostRecentEmailReplyText: ExtractMostRecentEmailReplyText? = null,
        private val extractMostRecentPlainTextEmailReply: ExtractMostRecentPlainTextEmailReply? =
            null,
        private val setContainsString: SetContainsString? = null,
        private val isEngagementType: IsEngagementType? = null,
        private val formatFullName: FormatFullName? = null,
        private val formatPhoneNumber: FormatPhoneNumber? = null,
        private val formatSearchablePhoneNumber: FormatSearchablePhoneNumber? = null,
        private val absoluteValue: AbsoluteValue? = null,
        private val squareRoot: SquareRoot? = null,
        private val power: Power? = null,
        private val substring: Substring? = null,
        private val euler: Euler? = null,
        private val stringLength: StringLength? = null,
        private val addTime: AddTime? = null,
        private val subtractTime: SubtractTime? = null,
        private val _json: JsonValue? = null,
    ) {

        fun constantBoolean(): Optional<ConstantBoolean> = Optional.ofNullable(constantBoolean)

        fun constantNumber(): Optional<ConstantNumber> = Optional.ofNullable(constantNumber)

        fun constantString(): Optional<ConstantString> = Optional.ofNullable(constantString)

        fun booleanPropertyVariable(): Optional<BooleanPropertyVariable> =
            Optional.ofNullable(booleanPropertyVariable)

        fun stringPropertyVariable(): Optional<StringPropertyVariable> =
            Optional.ofNullable(stringPropertyVariable)

        fun numberPropertyVariable(): Optional<NumberPropertyVariable> =
            Optional.ofNullable(numberPropertyVariable)

        fun timestampOfPropertyVariable(): Optional<TimestampOfPropertyVariable> =
            Optional.ofNullable(timestampOfPropertyVariable)

        fun booleanTargetPropertyVariable(): Optional<BooleanTargetPropertyVariable> =
            Optional.ofNullable(booleanTargetPropertyVariable)

        fun stringTargetPropertyVariable(): Optional<StringTargetPropertyVariable> =
            Optional.ofNullable(stringTargetPropertyVariable)

        fun numberTargetPropertyVariable(): Optional<NumberTargetPropertyVariable> =
            Optional.ofNullable(numberTargetPropertyVariable)

        fun timestampOfTargetPropertyVariable(): Optional<TimestampOfTargetPropertyVariable> =
            Optional.ofNullable(timestampOfTargetPropertyVariable)

        fun addNumbers(): Optional<AddNumbers> = Optional.ofNullable(addNumbers)

        fun subtractNumbers(): Optional<SubtractNumbers> = Optional.ofNullable(subtractNumbers)

        fun multiplyNumbers(): Optional<MultiplyNumbers> = Optional.ofNullable(multiplyNumbers)

        fun divideNumbers(): Optional<DivideNumbers> = Optional.ofNullable(divideNumbers)

        fun roundDownNumbers(): Optional<RoundDownNumbers> = Optional.ofNullable(roundDownNumbers)

        fun roundUpNumbers(): Optional<RoundUpNumbers> = Optional.ofNullable(roundUpNumbers)

        fun roundNearestNumbers(): Optional<RoundNearestNumbers> =
            Optional.ofNullable(roundNearestNumbers)

        fun upperCase(): Optional<UpperCase> = Optional.ofNullable(upperCase)

        fun lowerCase(): Optional<LowerCase> = Optional.ofNullable(lowerCase)

        fun concatStrings(): Optional<ConcatStrings> = Optional.ofNullable(concatStrings)

        fun contains(): Optional<Contains> = Optional.ofNullable(contains)

        fun beginsWith(): Optional<BeginsWith> = Optional.ofNullable(beginsWith)

        fun numberToString(): Optional<NumberToString> = Optional.ofNullable(numberToString)

        fun parseNumber(): Optional<ParseNumber> = Optional.ofNullable(parseNumber)

        fun fetchExchangeRate(): Optional<FetchExchangeRate> =
            Optional.ofNullable(fetchExchangeRate)

        fun fetchCurrencyDecimalPlaces(): Optional<FetchCurrencyDecimalPlaces> =
            Optional.ofNullable(fetchCurrencyDecimalPlaces)

        fun fetchSingleCurrencyPortalCurrency(): Optional<FetchSingleCurrencyPortalCurrency> =
            Optional.ofNullable(fetchSingleCurrencyPortalCurrency)

        fun datedExchangeRate(): Optional<DatedExchangeRate> =
            Optional.ofNullable(datedExchangeRate)

        fun pipelineProbability(): Optional<PipelineProbability> =
            Optional.ofNullable(pipelineProbability)

        fun maxNumbers(): Optional<MaxNumbers> = Optional.ofNullable(maxNumbers)

        fun minNumbers(): Optional<MinNumbers> = Optional.ofNullable(minNumbers)

        fun lessThan(): Optional<LessThan> = Optional.ofNullable(lessThan)

        fun lessThanOrEqual(): Optional<LessThanOrEqual> = Optional.ofNullable(lessThanOrEqual)

        fun moreThan(): Optional<MoreThan> = Optional.ofNullable(moreThan)

        fun moreThanOrEqual(): Optional<MoreThanOrEqual> = Optional.ofNullable(moreThanOrEqual)

        fun numberEquals(): Optional<NumberEquals> = Optional.ofNullable(numberEquals)

        fun stringEquals(): Optional<StringEquals> = Optional.ofNullable(stringEquals)

        fun isPipelineStageClosed(): Optional<IsPipelineStageClosed> =
            Optional.ofNullable(isPipelineStageClosed)

        fun not(): Optional<Not> = Optional.ofNullable(not)

        fun date(): Optional<Date> = Optional.ofNullable(date)

        fun month(): Optional<Month> = Optional.ofNullable(month)

        fun year(): Optional<Year> = Optional.ofNullable(year)

        fun now(): Optional<Now> = Optional.ofNullable(now)

        fun timeBetween(): Optional<TimeBetween> = Optional.ofNullable(timeBetween)

        fun timeBetweenSkipWeekends(): Optional<TimeBetweenSkipWeekends> =
            Optional.ofNullable(timeBetweenSkipWeekends)

        fun periodToMonths(): Optional<PeriodToMonths> = Optional.ofNullable(periodToMonths)

        fun periodToWeeks(): Optional<PeriodToWeeks> = Optional.ofNullable(periodToWeeks)

        fun and(): Optional<And> = Optional.ofNullable(and)

        fun or(): Optional<Or> = Optional.ofNullable(or)

        fun xor(): Optional<Xor> = Optional.ofNullable(xor)

        fun ifString(): Optional<IfString> = Optional.ofNullable(ifString)

        fun ifNumber(): Optional<IfNumber> = Optional.ofNullable(ifNumber)

        fun ifBoolean(): Optional<IfBoolean> = Optional.ofNullable(ifBoolean)

        fun isPresent(): Optional<IsPresent> = Optional.ofNullable(isPresent)

        fun hasEmailReply(): Optional<HasEmailReply> = Optional.ofNullable(hasEmailReply)

        fun hasPlainTextEmailReply(): Optional<HasPlainTextEmailReply> =
            Optional.ofNullable(hasPlainTextEmailReply)

        fun extractMostRecentEmailReplyHtml(): Optional<ExtractMostRecentEmailReplyHtml> =
            Optional.ofNullable(extractMostRecentEmailReplyHtml)

        fun extractMostRecentEmailReplyText(): Optional<ExtractMostRecentEmailReplyText> =
            Optional.ofNullable(extractMostRecentEmailReplyText)

        fun extractMostRecentPlainTextEmailReply(): Optional<ExtractMostRecentPlainTextEmailReply> =
            Optional.ofNullable(extractMostRecentPlainTextEmailReply)

        fun setContainsString(): Optional<SetContainsString> =
            Optional.ofNullable(setContainsString)

        fun isEngagementType(): Optional<IsEngagementType> = Optional.ofNullable(isEngagementType)

        fun formatFullName(): Optional<FormatFullName> = Optional.ofNullable(formatFullName)

        fun formatPhoneNumber(): Optional<FormatPhoneNumber> =
            Optional.ofNullable(formatPhoneNumber)

        fun formatSearchablePhoneNumber(): Optional<FormatSearchablePhoneNumber> =
            Optional.ofNullable(formatSearchablePhoneNumber)

        fun absoluteValue(): Optional<AbsoluteValue> = Optional.ofNullable(absoluteValue)

        fun squareRoot(): Optional<SquareRoot> = Optional.ofNullable(squareRoot)

        fun power(): Optional<Power> = Optional.ofNullable(power)

        fun substring(): Optional<Substring> = Optional.ofNullable(substring)

        fun euler(): Optional<Euler> = Optional.ofNullable(euler)

        fun stringLength(): Optional<StringLength> = Optional.ofNullable(stringLength)

        fun addTime(): Optional<AddTime> = Optional.ofNullable(addTime)

        fun subtractTime(): Optional<SubtractTime> = Optional.ofNullable(subtractTime)

        fun isConstantBoolean(): Boolean = constantBoolean != null

        fun isConstantNumber(): Boolean = constantNumber != null

        fun isConstantString(): Boolean = constantString != null

        fun isBooleanPropertyVariable(): Boolean = booleanPropertyVariable != null

        fun isStringPropertyVariable(): Boolean = stringPropertyVariable != null

        fun isNumberPropertyVariable(): Boolean = numberPropertyVariable != null

        fun isTimestampOfPropertyVariable(): Boolean = timestampOfPropertyVariable != null

        fun isBooleanTargetPropertyVariable(): Boolean = booleanTargetPropertyVariable != null

        fun isStringTargetPropertyVariable(): Boolean = stringTargetPropertyVariable != null

        fun isNumberTargetPropertyVariable(): Boolean = numberTargetPropertyVariable != null

        fun isTimestampOfTargetPropertyVariable(): Boolean =
            timestampOfTargetPropertyVariable != null

        fun isAddNumbers(): Boolean = addNumbers != null

        fun isSubtractNumbers(): Boolean = subtractNumbers != null

        fun isMultiplyNumbers(): Boolean = multiplyNumbers != null

        fun isDivideNumbers(): Boolean = divideNumbers != null

        fun isRoundDownNumbers(): Boolean = roundDownNumbers != null

        fun isRoundUpNumbers(): Boolean = roundUpNumbers != null

        fun isRoundNearestNumbers(): Boolean = roundNearestNumbers != null

        fun isUpperCase(): Boolean = upperCase != null

        fun isLowerCase(): Boolean = lowerCase != null

        fun isConcatStrings(): Boolean = concatStrings != null

        fun isContains(): Boolean = contains != null

        fun isBeginsWith(): Boolean = beginsWith != null

        fun isNumberToString(): Boolean = numberToString != null

        fun isParseNumber(): Boolean = parseNumber != null

        fun isFetchExchangeRate(): Boolean = fetchExchangeRate != null

        fun isFetchCurrencyDecimalPlaces(): Boolean = fetchCurrencyDecimalPlaces != null

        fun isFetchSingleCurrencyPortalCurrency(): Boolean =
            fetchSingleCurrencyPortalCurrency != null

        fun isDatedExchangeRate(): Boolean = datedExchangeRate != null

        fun isPipelineProbability(): Boolean = pipelineProbability != null

        fun isMaxNumbers(): Boolean = maxNumbers != null

        fun isMinNumbers(): Boolean = minNumbers != null

        fun isLessThan(): Boolean = lessThan != null

        fun isLessThanOrEqual(): Boolean = lessThanOrEqual != null

        fun isMoreThan(): Boolean = moreThan != null

        fun isMoreThanOrEqual(): Boolean = moreThanOrEqual != null

        fun isNumberEquals(): Boolean = numberEquals != null

        fun isStringEquals(): Boolean = stringEquals != null

        fun isIsPipelineStageClosed(): Boolean = isPipelineStageClosed != null

        fun isNot(): Boolean = not != null

        fun isDate(): Boolean = date != null

        fun isMonth(): Boolean = month != null

        fun isYear(): Boolean = year != null

        fun isNow(): Boolean = now != null

        fun isTimeBetween(): Boolean = timeBetween != null

        fun isTimeBetweenSkipWeekends(): Boolean = timeBetweenSkipWeekends != null

        fun isPeriodToMonths(): Boolean = periodToMonths != null

        fun isPeriodToWeeks(): Boolean = periodToWeeks != null

        fun isAnd(): Boolean = and != null

        fun isOr(): Boolean = or != null

        fun isXor(): Boolean = xor != null

        fun isIfString(): Boolean = ifString != null

        fun isIfNumber(): Boolean = ifNumber != null

        fun isIfBoolean(): Boolean = ifBoolean != null

        fun isIsPresent(): Boolean = isPresent != null

        fun isHasEmailReply(): Boolean = hasEmailReply != null

        fun isHasPlainTextEmailReply(): Boolean = hasPlainTextEmailReply != null

        fun isExtractMostRecentEmailReplyHtml(): Boolean = extractMostRecentEmailReplyHtml != null

        fun isExtractMostRecentEmailReplyText(): Boolean = extractMostRecentEmailReplyText != null

        fun isExtractMostRecentPlainTextEmailReply(): Boolean =
            extractMostRecentPlainTextEmailReply != null

        fun isSetContainsString(): Boolean = setContainsString != null

        fun isIsEngagementType(): Boolean = isEngagementType != null

        fun isFormatFullName(): Boolean = formatFullName != null

        fun isFormatPhoneNumber(): Boolean = formatPhoneNumber != null

        fun isFormatSearchablePhoneNumber(): Boolean = formatSearchablePhoneNumber != null

        fun isAbsoluteValue(): Boolean = absoluteValue != null

        fun isSquareRoot(): Boolean = squareRoot != null

        fun isPower(): Boolean = power != null

        fun isSubstring(): Boolean = substring != null

        fun isEuler(): Boolean = euler != null

        fun isStringLength(): Boolean = stringLength != null

        fun isAddTime(): Boolean = addTime != null

        fun isSubtractTime(): Boolean = subtractTime != null

        fun asConstantBoolean(): ConstantBoolean = constantBoolean.getOrThrow("constantBoolean")

        fun asConstantNumber(): ConstantNumber = constantNumber.getOrThrow("constantNumber")

        fun asConstantString(): ConstantString = constantString.getOrThrow("constantString")

        fun asBooleanPropertyVariable(): BooleanPropertyVariable =
            booleanPropertyVariable.getOrThrow("booleanPropertyVariable")

        fun asStringPropertyVariable(): StringPropertyVariable =
            stringPropertyVariable.getOrThrow("stringPropertyVariable")

        fun asNumberPropertyVariable(): NumberPropertyVariable =
            numberPropertyVariable.getOrThrow("numberPropertyVariable")

        fun asTimestampOfPropertyVariable(): TimestampOfPropertyVariable =
            timestampOfPropertyVariable.getOrThrow("timestampOfPropertyVariable")

        fun asBooleanTargetPropertyVariable(): BooleanTargetPropertyVariable =
            booleanTargetPropertyVariable.getOrThrow("booleanTargetPropertyVariable")

        fun asStringTargetPropertyVariable(): StringTargetPropertyVariable =
            stringTargetPropertyVariable.getOrThrow("stringTargetPropertyVariable")

        fun asNumberTargetPropertyVariable(): NumberTargetPropertyVariable =
            numberTargetPropertyVariable.getOrThrow("numberTargetPropertyVariable")

        fun asTimestampOfTargetPropertyVariable(): TimestampOfTargetPropertyVariable =
            timestampOfTargetPropertyVariable.getOrThrow("timestampOfTargetPropertyVariable")

        fun asAddNumbers(): AddNumbers = addNumbers.getOrThrow("addNumbers")

        fun asSubtractNumbers(): SubtractNumbers = subtractNumbers.getOrThrow("subtractNumbers")

        fun asMultiplyNumbers(): MultiplyNumbers = multiplyNumbers.getOrThrow("multiplyNumbers")

        fun asDivideNumbers(): DivideNumbers = divideNumbers.getOrThrow("divideNumbers")

        fun asRoundDownNumbers(): RoundDownNumbers = roundDownNumbers.getOrThrow("roundDownNumbers")

        fun asRoundUpNumbers(): RoundUpNumbers = roundUpNumbers.getOrThrow("roundUpNumbers")

        fun asRoundNearestNumbers(): RoundNearestNumbers =
            roundNearestNumbers.getOrThrow("roundNearestNumbers")

        fun asUpperCase(): UpperCase = upperCase.getOrThrow("upperCase")

        fun asLowerCase(): LowerCase = lowerCase.getOrThrow("lowerCase")

        fun asConcatStrings(): ConcatStrings = concatStrings.getOrThrow("concatStrings")

        fun asContains(): Contains = contains.getOrThrow("contains")

        fun asBeginsWith(): BeginsWith = beginsWith.getOrThrow("beginsWith")

        fun asNumberToString(): NumberToString = numberToString.getOrThrow("numberToString")

        fun asParseNumber(): ParseNumber = parseNumber.getOrThrow("parseNumber")

        fun asFetchExchangeRate(): FetchExchangeRate =
            fetchExchangeRate.getOrThrow("fetchExchangeRate")

        fun asFetchCurrencyDecimalPlaces(): FetchCurrencyDecimalPlaces =
            fetchCurrencyDecimalPlaces.getOrThrow("fetchCurrencyDecimalPlaces")

        fun asFetchSingleCurrencyPortalCurrency(): FetchSingleCurrencyPortalCurrency =
            fetchSingleCurrencyPortalCurrency.getOrThrow("fetchSingleCurrencyPortalCurrency")

        fun asDatedExchangeRate(): DatedExchangeRate =
            datedExchangeRate.getOrThrow("datedExchangeRate")

        fun asPipelineProbability(): PipelineProbability =
            pipelineProbability.getOrThrow("pipelineProbability")

        fun asMaxNumbers(): MaxNumbers = maxNumbers.getOrThrow("maxNumbers")

        fun asMinNumbers(): MinNumbers = minNumbers.getOrThrow("minNumbers")

        fun asLessThan(): LessThan = lessThan.getOrThrow("lessThan")

        fun asLessThanOrEqual(): LessThanOrEqual = lessThanOrEqual.getOrThrow("lessThanOrEqual")

        fun asMoreThan(): MoreThan = moreThan.getOrThrow("moreThan")

        fun asMoreThanOrEqual(): MoreThanOrEqual = moreThanOrEqual.getOrThrow("moreThanOrEqual")

        fun asNumberEquals(): NumberEquals = numberEquals.getOrThrow("numberEquals")

        fun asStringEquals(): StringEquals = stringEquals.getOrThrow("stringEquals")

        fun asIsPipelineStageClosed(): IsPipelineStageClosed =
            isPipelineStageClosed.getOrThrow("isPipelineStageClosed")

        fun asNot(): Not = not.getOrThrow("not")

        fun asDate(): Date = date.getOrThrow("date")

        fun asMonth(): Month = month.getOrThrow("month")

        fun asYear(): Year = year.getOrThrow("year")

        fun asNow(): Now = now.getOrThrow("now")

        fun asTimeBetween(): TimeBetween = timeBetween.getOrThrow("timeBetween")

        fun asTimeBetweenSkipWeekends(): TimeBetweenSkipWeekends =
            timeBetweenSkipWeekends.getOrThrow("timeBetweenSkipWeekends")

        fun asPeriodToMonths(): PeriodToMonths = periodToMonths.getOrThrow("periodToMonths")

        fun asPeriodToWeeks(): PeriodToWeeks = periodToWeeks.getOrThrow("periodToWeeks")

        fun asAnd(): And = and.getOrThrow("and")

        fun asOr(): Or = or.getOrThrow("or")

        fun asXor(): Xor = xor.getOrThrow("xor")

        fun asIfString(): IfString = ifString.getOrThrow("ifString")

        fun asIfNumber(): IfNumber = ifNumber.getOrThrow("ifNumber")

        fun asIfBoolean(): IfBoolean = ifBoolean.getOrThrow("ifBoolean")

        fun asIsPresent(): IsPresent = isPresent.getOrThrow("isPresent")

        fun asHasEmailReply(): HasEmailReply = hasEmailReply.getOrThrow("hasEmailReply")

        fun asHasPlainTextEmailReply(): HasPlainTextEmailReply =
            hasPlainTextEmailReply.getOrThrow("hasPlainTextEmailReply")

        fun asExtractMostRecentEmailReplyHtml(): ExtractMostRecentEmailReplyHtml =
            extractMostRecentEmailReplyHtml.getOrThrow("extractMostRecentEmailReplyHtml")

        fun asExtractMostRecentEmailReplyText(): ExtractMostRecentEmailReplyText =
            extractMostRecentEmailReplyText.getOrThrow("extractMostRecentEmailReplyText")

        fun asExtractMostRecentPlainTextEmailReply(): ExtractMostRecentPlainTextEmailReply =
            extractMostRecentPlainTextEmailReply.getOrThrow("extractMostRecentPlainTextEmailReply")

        fun asSetContainsString(): SetContainsString =
            setContainsString.getOrThrow("setContainsString")

        fun asIsEngagementType(): IsEngagementType = isEngagementType.getOrThrow("isEngagementType")

        fun asFormatFullName(): FormatFullName = formatFullName.getOrThrow("formatFullName")

        fun asFormatPhoneNumber(): FormatPhoneNumber =
            formatPhoneNumber.getOrThrow("formatPhoneNumber")

        fun asFormatSearchablePhoneNumber(): FormatSearchablePhoneNumber =
            formatSearchablePhoneNumber.getOrThrow("formatSearchablePhoneNumber")

        fun asAbsoluteValue(): AbsoluteValue = absoluteValue.getOrThrow("absoluteValue")

        fun asSquareRoot(): SquareRoot = squareRoot.getOrThrow("squareRoot")

        fun asPower(): Power = power.getOrThrow("power")

        fun asSubstring(): Substring = substring.getOrThrow("substring")

        fun asEuler(): Euler = euler.getOrThrow("euler")

        fun asStringLength(): StringLength = stringLength.getOrThrow("stringLength")

        fun asAddTime(): AddTime = addTime.getOrThrow("addTime")

        fun asSubtractTime(): SubtractTime = subtractTime.getOrThrow("subtractTime")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                constantBoolean != null -> visitor.visitConstantBoolean(constantBoolean)
                constantNumber != null -> visitor.visitConstantNumber(constantNumber)
                constantString != null -> visitor.visitConstantString(constantString)
                booleanPropertyVariable != null ->
                    visitor.visitBooleanPropertyVariable(booleanPropertyVariable)
                stringPropertyVariable != null ->
                    visitor.visitStringPropertyVariable(stringPropertyVariable)
                numberPropertyVariable != null ->
                    visitor.visitNumberPropertyVariable(numberPropertyVariable)
                timestampOfPropertyVariable != null ->
                    visitor.visitTimestampOfPropertyVariable(timestampOfPropertyVariable)
                booleanTargetPropertyVariable != null ->
                    visitor.visitBooleanTargetPropertyVariable(booleanTargetPropertyVariable)
                stringTargetPropertyVariable != null ->
                    visitor.visitStringTargetPropertyVariable(stringTargetPropertyVariable)
                numberTargetPropertyVariable != null ->
                    visitor.visitNumberTargetPropertyVariable(numberTargetPropertyVariable)
                timestampOfTargetPropertyVariable != null ->
                    visitor.visitTimestampOfTargetPropertyVariable(
                        timestampOfTargetPropertyVariable
                    )
                addNumbers != null -> visitor.visitAddNumbers(addNumbers)
                subtractNumbers != null -> visitor.visitSubtractNumbers(subtractNumbers)
                multiplyNumbers != null -> visitor.visitMultiplyNumbers(multiplyNumbers)
                divideNumbers != null -> visitor.visitDivideNumbers(divideNumbers)
                roundDownNumbers != null -> visitor.visitRoundDownNumbers(roundDownNumbers)
                roundUpNumbers != null -> visitor.visitRoundUpNumbers(roundUpNumbers)
                roundNearestNumbers != null -> visitor.visitRoundNearestNumbers(roundNearestNumbers)
                upperCase != null -> visitor.visitUpperCase(upperCase)
                lowerCase != null -> visitor.visitLowerCase(lowerCase)
                concatStrings != null -> visitor.visitConcatStrings(concatStrings)
                contains != null -> visitor.visitContains(contains)
                beginsWith != null -> visitor.visitBeginsWith(beginsWith)
                numberToString != null -> visitor.visitNumberToString(numberToString)
                parseNumber != null -> visitor.visitParseNumber(parseNumber)
                fetchExchangeRate != null -> visitor.visitFetchExchangeRate(fetchExchangeRate)
                fetchCurrencyDecimalPlaces != null ->
                    visitor.visitFetchCurrencyDecimalPlaces(fetchCurrencyDecimalPlaces)
                fetchSingleCurrencyPortalCurrency != null ->
                    visitor.visitFetchSingleCurrencyPortalCurrency(
                        fetchSingleCurrencyPortalCurrency
                    )
                datedExchangeRate != null -> visitor.visitDatedExchangeRate(datedExchangeRate)
                pipelineProbability != null -> visitor.visitPipelineProbability(pipelineProbability)
                maxNumbers != null -> visitor.visitMaxNumbers(maxNumbers)
                minNumbers != null -> visitor.visitMinNumbers(minNumbers)
                lessThan != null -> visitor.visitLessThan(lessThan)
                lessThanOrEqual != null -> visitor.visitLessThanOrEqual(lessThanOrEqual)
                moreThan != null -> visitor.visitMoreThan(moreThan)
                moreThanOrEqual != null -> visitor.visitMoreThanOrEqual(moreThanOrEqual)
                numberEquals != null -> visitor.visitNumberEquals(numberEquals)
                stringEquals != null -> visitor.visitStringEquals(stringEquals)
                isPipelineStageClosed != null ->
                    visitor.visitIsPipelineStageClosed(isPipelineStageClosed)
                not != null -> visitor.visitNot(not)
                date != null -> visitor.visitDate(date)
                month != null -> visitor.visitMonth(month)
                year != null -> visitor.visitYear(year)
                now != null -> visitor.visitNow(now)
                timeBetween != null -> visitor.visitTimeBetween(timeBetween)
                timeBetweenSkipWeekends != null ->
                    visitor.visitTimeBetweenSkipWeekends(timeBetweenSkipWeekends)
                periodToMonths != null -> visitor.visitPeriodToMonths(periodToMonths)
                periodToWeeks != null -> visitor.visitPeriodToWeeks(periodToWeeks)
                and != null -> visitor.visitAnd(and)
                or != null -> visitor.visitOr(or)
                xor != null -> visitor.visitXor(xor)
                ifString != null -> visitor.visitIfString(ifString)
                ifNumber != null -> visitor.visitIfNumber(ifNumber)
                ifBoolean != null -> visitor.visitIfBoolean(ifBoolean)
                isPresent != null -> visitor.visitIsPresent(isPresent)
                hasEmailReply != null -> visitor.visitHasEmailReply(hasEmailReply)
                hasPlainTextEmailReply != null ->
                    visitor.visitHasPlainTextEmailReply(hasPlainTextEmailReply)
                extractMostRecentEmailReplyHtml != null ->
                    visitor.visitExtractMostRecentEmailReplyHtml(extractMostRecentEmailReplyHtml)
                extractMostRecentEmailReplyText != null ->
                    visitor.visitExtractMostRecentEmailReplyText(extractMostRecentEmailReplyText)
                extractMostRecentPlainTextEmailReply != null ->
                    visitor.visitExtractMostRecentPlainTextEmailReply(
                        extractMostRecentPlainTextEmailReply
                    )
                setContainsString != null -> visitor.visitSetContainsString(setContainsString)
                isEngagementType != null -> visitor.visitIsEngagementType(isEngagementType)
                formatFullName != null -> visitor.visitFormatFullName(formatFullName)
                formatPhoneNumber != null -> visitor.visitFormatPhoneNumber(formatPhoneNumber)
                formatSearchablePhoneNumber != null ->
                    visitor.visitFormatSearchablePhoneNumber(formatSearchablePhoneNumber)
                absoluteValue != null -> visitor.visitAbsoluteValue(absoluteValue)
                squareRoot != null -> visitor.visitSquareRoot(squareRoot)
                power != null -> visitor.visitPower(power)
                substring != null -> visitor.visitSubstring(substring)
                euler != null -> visitor.visitEuler(euler)
                stringLength != null -> visitor.visitStringLength(stringLength)
                addTime != null -> visitor.visitAddTime(addTime)
                subtractTime != null -> visitor.visitSubtractTime(subtractTime)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): CalculationExpression = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitConstantBoolean(constantBoolean: ConstantBoolean) {
                        constantBoolean.validate()
                    }

                    override fun visitConstantNumber(constantNumber: ConstantNumber) {
                        constantNumber.validate()
                    }

                    override fun visitConstantString(constantString: ConstantString) {
                        constantString.validate()
                    }

                    override fun visitBooleanPropertyVariable(
                        booleanPropertyVariable: BooleanPropertyVariable
                    ) {
                        booleanPropertyVariable.validate()
                    }

                    override fun visitStringPropertyVariable(
                        stringPropertyVariable: StringPropertyVariable
                    ) {
                        stringPropertyVariable.validate()
                    }

                    override fun visitNumberPropertyVariable(
                        numberPropertyVariable: NumberPropertyVariable
                    ) {
                        numberPropertyVariable.validate()
                    }

                    override fun visitTimestampOfPropertyVariable(
                        timestampOfPropertyVariable: TimestampOfPropertyVariable
                    ) {
                        timestampOfPropertyVariable.validate()
                    }

                    override fun visitBooleanTargetPropertyVariable(
                        booleanTargetPropertyVariable: BooleanTargetPropertyVariable
                    ) {
                        booleanTargetPropertyVariable.validate()
                    }

                    override fun visitStringTargetPropertyVariable(
                        stringTargetPropertyVariable: StringTargetPropertyVariable
                    ) {
                        stringTargetPropertyVariable.validate()
                    }

                    override fun visitNumberTargetPropertyVariable(
                        numberTargetPropertyVariable: NumberTargetPropertyVariable
                    ) {
                        numberTargetPropertyVariable.validate()
                    }

                    override fun visitTimestampOfTargetPropertyVariable(
                        timestampOfTargetPropertyVariable: TimestampOfTargetPropertyVariable
                    ) {
                        timestampOfTargetPropertyVariable.validate()
                    }

                    override fun visitAddNumbers(addNumbers: AddNumbers) {
                        addNumbers.validate()
                    }

                    override fun visitSubtractNumbers(subtractNumbers: SubtractNumbers) {
                        subtractNumbers.validate()
                    }

                    override fun visitMultiplyNumbers(multiplyNumbers: MultiplyNumbers) {
                        multiplyNumbers.validate()
                    }

                    override fun visitDivideNumbers(divideNumbers: DivideNumbers) {
                        divideNumbers.validate()
                    }

                    override fun visitRoundDownNumbers(roundDownNumbers: RoundDownNumbers) {
                        roundDownNumbers.validate()
                    }

                    override fun visitRoundUpNumbers(roundUpNumbers: RoundUpNumbers) {
                        roundUpNumbers.validate()
                    }

                    override fun visitRoundNearestNumbers(
                        roundNearestNumbers: RoundNearestNumbers
                    ) {
                        roundNearestNumbers.validate()
                    }

                    override fun visitUpperCase(upperCase: UpperCase) {
                        upperCase.validate()
                    }

                    override fun visitLowerCase(lowerCase: LowerCase) {
                        lowerCase.validate()
                    }

                    override fun visitConcatStrings(concatStrings: ConcatStrings) {
                        concatStrings.validate()
                    }

                    override fun visitContains(contains: Contains) {
                        contains.validate()
                    }

                    override fun visitBeginsWith(beginsWith: BeginsWith) {
                        beginsWith.validate()
                    }

                    override fun visitNumberToString(numberToString: NumberToString) {
                        numberToString.validate()
                    }

                    override fun visitParseNumber(parseNumber: ParseNumber) {
                        parseNumber.validate()
                    }

                    override fun visitFetchExchangeRate(fetchExchangeRate: FetchExchangeRate) {
                        fetchExchangeRate.validate()
                    }

                    override fun visitFetchCurrencyDecimalPlaces(
                        fetchCurrencyDecimalPlaces: FetchCurrencyDecimalPlaces
                    ) {
                        fetchCurrencyDecimalPlaces.validate()
                    }

                    override fun visitFetchSingleCurrencyPortalCurrency(
                        fetchSingleCurrencyPortalCurrency: FetchSingleCurrencyPortalCurrency
                    ) {
                        fetchSingleCurrencyPortalCurrency.validate()
                    }

                    override fun visitDatedExchangeRate(datedExchangeRate: DatedExchangeRate) {
                        datedExchangeRate.validate()
                    }

                    override fun visitPipelineProbability(
                        pipelineProbability: PipelineProbability
                    ) {
                        pipelineProbability.validate()
                    }

                    override fun visitMaxNumbers(maxNumbers: MaxNumbers) {
                        maxNumbers.validate()
                    }

                    override fun visitMinNumbers(minNumbers: MinNumbers) {
                        minNumbers.validate()
                    }

                    override fun visitLessThan(lessThan: LessThan) {
                        lessThan.validate()
                    }

                    override fun visitLessThanOrEqual(lessThanOrEqual: LessThanOrEqual) {
                        lessThanOrEqual.validate()
                    }

                    override fun visitMoreThan(moreThan: MoreThan) {
                        moreThan.validate()
                    }

                    override fun visitMoreThanOrEqual(moreThanOrEqual: MoreThanOrEqual) {
                        moreThanOrEqual.validate()
                    }

                    override fun visitNumberEquals(numberEquals: NumberEquals) {
                        numberEquals.validate()
                    }

                    override fun visitStringEquals(stringEquals: StringEquals) {
                        stringEquals.validate()
                    }

                    override fun visitIsPipelineStageClosed(
                        isPipelineStageClosed: IsPipelineStageClosed
                    ) {
                        isPipelineStageClosed.validate()
                    }

                    override fun visitNot(not: Not) {
                        not.validate()
                    }

                    override fun visitDate(date: Date) {
                        date.validate()
                    }

                    override fun visitMonth(month: Month) {
                        month.validate()
                    }

                    override fun visitYear(year: Year) {
                        year.validate()
                    }

                    override fun visitNow(now: Now) {
                        now.validate()
                    }

                    override fun visitTimeBetween(timeBetween: TimeBetween) {
                        timeBetween.validate()
                    }

                    override fun visitTimeBetweenSkipWeekends(
                        timeBetweenSkipWeekends: TimeBetweenSkipWeekends
                    ) {
                        timeBetweenSkipWeekends.validate()
                    }

                    override fun visitPeriodToMonths(periodToMonths: PeriodToMonths) {
                        periodToMonths.validate()
                    }

                    override fun visitPeriodToWeeks(periodToWeeks: PeriodToWeeks) {
                        periodToWeeks.validate()
                    }

                    override fun visitAnd(and: And) {
                        and.validate()
                    }

                    override fun visitOr(or: Or) {
                        or.validate()
                    }

                    override fun visitXor(xor: Xor) {
                        xor.validate()
                    }

                    override fun visitIfString(ifString: IfString) {
                        ifString.validate()
                    }

                    override fun visitIfNumber(ifNumber: IfNumber) {
                        ifNumber.validate()
                    }

                    override fun visitIfBoolean(ifBoolean: IfBoolean) {
                        ifBoolean.validate()
                    }

                    override fun visitIsPresent(isPresent: IsPresent) {
                        isPresent.validate()
                    }

                    override fun visitHasEmailReply(hasEmailReply: HasEmailReply) {
                        hasEmailReply.validate()
                    }

                    override fun visitHasPlainTextEmailReply(
                        hasPlainTextEmailReply: HasPlainTextEmailReply
                    ) {
                        hasPlainTextEmailReply.validate()
                    }

                    override fun visitExtractMostRecentEmailReplyHtml(
                        extractMostRecentEmailReplyHtml: ExtractMostRecentEmailReplyHtml
                    ) {
                        extractMostRecentEmailReplyHtml.validate()
                    }

                    override fun visitExtractMostRecentEmailReplyText(
                        extractMostRecentEmailReplyText: ExtractMostRecentEmailReplyText
                    ) {
                        extractMostRecentEmailReplyText.validate()
                    }

                    override fun visitExtractMostRecentPlainTextEmailReply(
                        extractMostRecentPlainTextEmailReply: ExtractMostRecentPlainTextEmailReply
                    ) {
                        extractMostRecentPlainTextEmailReply.validate()
                    }

                    override fun visitSetContainsString(setContainsString: SetContainsString) {
                        setContainsString.validate()
                    }

                    override fun visitIsEngagementType(isEngagementType: IsEngagementType) {
                        isEngagementType.validate()
                    }

                    override fun visitFormatFullName(formatFullName: FormatFullName) {
                        formatFullName.validate()
                    }

                    override fun visitFormatPhoneNumber(formatPhoneNumber: FormatPhoneNumber) {
                        formatPhoneNumber.validate()
                    }

                    override fun visitFormatSearchablePhoneNumber(
                        formatSearchablePhoneNumber: FormatSearchablePhoneNumber
                    ) {
                        formatSearchablePhoneNumber.validate()
                    }

                    override fun visitAbsoluteValue(absoluteValue: AbsoluteValue) {
                        absoluteValue.validate()
                    }

                    override fun visitSquareRoot(squareRoot: SquareRoot) {
                        squareRoot.validate()
                    }

                    override fun visitPower(power: Power) {
                        power.validate()
                    }

                    override fun visitSubstring(substring: Substring) {
                        substring.validate()
                    }

                    override fun visitEuler(euler: Euler) {
                        euler.validate()
                    }

                    override fun visitStringLength(stringLength: StringLength) {
                        stringLength.validate()
                    }

                    override fun visitAddTime(addTime: AddTime) {
                        addTime.validate()
                    }

                    override fun visitSubtractTime(subtractTime: SubtractTime) {
                        subtractTime.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitConstantBoolean(constantBoolean: ConstantBoolean) =
                        constantBoolean.validity()

                    override fun visitConstantNumber(constantNumber: ConstantNumber) =
                        constantNumber.validity()

                    override fun visitConstantString(constantString: ConstantString) =
                        constantString.validity()

                    override fun visitBooleanPropertyVariable(
                        booleanPropertyVariable: BooleanPropertyVariable
                    ) = booleanPropertyVariable.validity()

                    override fun visitStringPropertyVariable(
                        stringPropertyVariable: StringPropertyVariable
                    ) = stringPropertyVariable.validity()

                    override fun visitNumberPropertyVariable(
                        numberPropertyVariable: NumberPropertyVariable
                    ) = numberPropertyVariable.validity()

                    override fun visitTimestampOfPropertyVariable(
                        timestampOfPropertyVariable: TimestampOfPropertyVariable
                    ) = timestampOfPropertyVariable.validity()

                    override fun visitBooleanTargetPropertyVariable(
                        booleanTargetPropertyVariable: BooleanTargetPropertyVariable
                    ) = booleanTargetPropertyVariable.validity()

                    override fun visitStringTargetPropertyVariable(
                        stringTargetPropertyVariable: StringTargetPropertyVariable
                    ) = stringTargetPropertyVariable.validity()

                    override fun visitNumberTargetPropertyVariable(
                        numberTargetPropertyVariable: NumberTargetPropertyVariable
                    ) = numberTargetPropertyVariable.validity()

                    override fun visitTimestampOfTargetPropertyVariable(
                        timestampOfTargetPropertyVariable: TimestampOfTargetPropertyVariable
                    ) = timestampOfTargetPropertyVariable.validity()

                    override fun visitAddNumbers(addNumbers: AddNumbers) = addNumbers.validity()

                    override fun visitSubtractNumbers(subtractNumbers: SubtractNumbers) =
                        subtractNumbers.validity()

                    override fun visitMultiplyNumbers(multiplyNumbers: MultiplyNumbers) =
                        multiplyNumbers.validity()

                    override fun visitDivideNumbers(divideNumbers: DivideNumbers) =
                        divideNumbers.validity()

                    override fun visitRoundDownNumbers(roundDownNumbers: RoundDownNumbers) =
                        roundDownNumbers.validity()

                    override fun visitRoundUpNumbers(roundUpNumbers: RoundUpNumbers) =
                        roundUpNumbers.validity()

                    override fun visitRoundNearestNumbers(
                        roundNearestNumbers: RoundNearestNumbers
                    ) = roundNearestNumbers.validity()

                    override fun visitUpperCase(upperCase: UpperCase) = upperCase.validity()

                    override fun visitLowerCase(lowerCase: LowerCase) = lowerCase.validity()

                    override fun visitConcatStrings(concatStrings: ConcatStrings) =
                        concatStrings.validity()

                    override fun visitContains(contains: Contains) = contains.validity()

                    override fun visitBeginsWith(beginsWith: BeginsWith) = beginsWith.validity()

                    override fun visitNumberToString(numberToString: NumberToString) =
                        numberToString.validity()

                    override fun visitParseNumber(parseNumber: ParseNumber) = parseNumber.validity()

                    override fun visitFetchExchangeRate(fetchExchangeRate: FetchExchangeRate) =
                        fetchExchangeRate.validity()

                    override fun visitFetchCurrencyDecimalPlaces(
                        fetchCurrencyDecimalPlaces: FetchCurrencyDecimalPlaces
                    ) = fetchCurrencyDecimalPlaces.validity()

                    override fun visitFetchSingleCurrencyPortalCurrency(
                        fetchSingleCurrencyPortalCurrency: FetchSingleCurrencyPortalCurrency
                    ) = fetchSingleCurrencyPortalCurrency.validity()

                    override fun visitDatedExchangeRate(datedExchangeRate: DatedExchangeRate) =
                        datedExchangeRate.validity()

                    override fun visitPipelineProbability(
                        pipelineProbability: PipelineProbability
                    ) = pipelineProbability.validity()

                    override fun visitMaxNumbers(maxNumbers: MaxNumbers) = maxNumbers.validity()

                    override fun visitMinNumbers(minNumbers: MinNumbers) = minNumbers.validity()

                    override fun visitLessThan(lessThan: LessThan) = lessThan.validity()

                    override fun visitLessThanOrEqual(lessThanOrEqual: LessThanOrEqual) =
                        lessThanOrEqual.validity()

                    override fun visitMoreThan(moreThan: MoreThan) = moreThan.validity()

                    override fun visitMoreThanOrEqual(moreThanOrEqual: MoreThanOrEqual) =
                        moreThanOrEqual.validity()

                    override fun visitNumberEquals(numberEquals: NumberEquals) =
                        numberEquals.validity()

                    override fun visitStringEquals(stringEquals: StringEquals) =
                        stringEquals.validity()

                    override fun visitIsPipelineStageClosed(
                        isPipelineStageClosed: IsPipelineStageClosed
                    ) = isPipelineStageClosed.validity()

                    override fun visitNot(not: Not) = not.validity()

                    override fun visitDate(date: Date) = date.validity()

                    override fun visitMonth(month: Month) = month.validity()

                    override fun visitYear(year: Year) = year.validity()

                    override fun visitNow(now: Now) = now.validity()

                    override fun visitTimeBetween(timeBetween: TimeBetween) = timeBetween.validity()

                    override fun visitTimeBetweenSkipWeekends(
                        timeBetweenSkipWeekends: TimeBetweenSkipWeekends
                    ) = timeBetweenSkipWeekends.validity()

                    override fun visitPeriodToMonths(periodToMonths: PeriodToMonths) =
                        periodToMonths.validity()

                    override fun visitPeriodToWeeks(periodToWeeks: PeriodToWeeks) =
                        periodToWeeks.validity()

                    override fun visitAnd(and: And) = and.validity()

                    override fun visitOr(or: Or) = or.validity()

                    override fun visitXor(xor: Xor) = xor.validity()

                    override fun visitIfString(ifString: IfString) = ifString.validity()

                    override fun visitIfNumber(ifNumber: IfNumber) = ifNumber.validity()

                    override fun visitIfBoolean(ifBoolean: IfBoolean) = ifBoolean.validity()

                    override fun visitIsPresent(isPresent: IsPresent) = isPresent.validity()

                    override fun visitHasEmailReply(hasEmailReply: HasEmailReply) =
                        hasEmailReply.validity()

                    override fun visitHasPlainTextEmailReply(
                        hasPlainTextEmailReply: HasPlainTextEmailReply
                    ) = hasPlainTextEmailReply.validity()

                    override fun visitExtractMostRecentEmailReplyHtml(
                        extractMostRecentEmailReplyHtml: ExtractMostRecentEmailReplyHtml
                    ) = extractMostRecentEmailReplyHtml.validity()

                    override fun visitExtractMostRecentEmailReplyText(
                        extractMostRecentEmailReplyText: ExtractMostRecentEmailReplyText
                    ) = extractMostRecentEmailReplyText.validity()

                    override fun visitExtractMostRecentPlainTextEmailReply(
                        extractMostRecentPlainTextEmailReply: ExtractMostRecentPlainTextEmailReply
                    ) = extractMostRecentPlainTextEmailReply.validity()

                    override fun visitSetContainsString(setContainsString: SetContainsString) =
                        setContainsString.validity()

                    override fun visitIsEngagementType(isEngagementType: IsEngagementType) =
                        isEngagementType.validity()

                    override fun visitFormatFullName(formatFullName: FormatFullName) =
                        formatFullName.validity()

                    override fun visitFormatPhoneNumber(formatPhoneNumber: FormatPhoneNumber) =
                        formatPhoneNumber.validity()

                    override fun visitFormatSearchablePhoneNumber(
                        formatSearchablePhoneNumber: FormatSearchablePhoneNumber
                    ) = formatSearchablePhoneNumber.validity()

                    override fun visitAbsoluteValue(absoluteValue: AbsoluteValue) =
                        absoluteValue.validity()

                    override fun visitSquareRoot(squareRoot: SquareRoot) = squareRoot.validity()

                    override fun visitPower(power: Power) = power.validity()

                    override fun visitSubstring(substring: Substring) = substring.validity()

                    override fun visitEuler(euler: Euler) = euler.validity()

                    override fun visitStringLength(stringLength: StringLength) =
                        stringLength.validity()

                    override fun visitAddTime(addTime: AddTime) = addTime.validity()

                    override fun visitSubtractTime(subtractTime: SubtractTime) =
                        subtractTime.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CalculationExpression &&
                constantBoolean == other.constantBoolean &&
                constantNumber == other.constantNumber &&
                constantString == other.constantString &&
                booleanPropertyVariable == other.booleanPropertyVariable &&
                stringPropertyVariable == other.stringPropertyVariable &&
                numberPropertyVariable == other.numberPropertyVariable &&
                timestampOfPropertyVariable == other.timestampOfPropertyVariable &&
                booleanTargetPropertyVariable == other.booleanTargetPropertyVariable &&
                stringTargetPropertyVariable == other.stringTargetPropertyVariable &&
                numberTargetPropertyVariable == other.numberTargetPropertyVariable &&
                timestampOfTargetPropertyVariable == other.timestampOfTargetPropertyVariable &&
                addNumbers == other.addNumbers &&
                subtractNumbers == other.subtractNumbers &&
                multiplyNumbers == other.multiplyNumbers &&
                divideNumbers == other.divideNumbers &&
                roundDownNumbers == other.roundDownNumbers &&
                roundUpNumbers == other.roundUpNumbers &&
                roundNearestNumbers == other.roundNearestNumbers &&
                upperCase == other.upperCase &&
                lowerCase == other.lowerCase &&
                concatStrings == other.concatStrings &&
                contains == other.contains &&
                beginsWith == other.beginsWith &&
                numberToString == other.numberToString &&
                parseNumber == other.parseNumber &&
                fetchExchangeRate == other.fetchExchangeRate &&
                fetchCurrencyDecimalPlaces == other.fetchCurrencyDecimalPlaces &&
                fetchSingleCurrencyPortalCurrency == other.fetchSingleCurrencyPortalCurrency &&
                datedExchangeRate == other.datedExchangeRate &&
                pipelineProbability == other.pipelineProbability &&
                maxNumbers == other.maxNumbers &&
                minNumbers == other.minNumbers &&
                lessThan == other.lessThan &&
                lessThanOrEqual == other.lessThanOrEqual &&
                moreThan == other.moreThan &&
                moreThanOrEqual == other.moreThanOrEqual &&
                numberEquals == other.numberEquals &&
                stringEquals == other.stringEquals &&
                isPipelineStageClosed == other.isPipelineStageClosed &&
                not == other.not &&
                date == other.date &&
                month == other.month &&
                year == other.year &&
                now == other.now &&
                timeBetween == other.timeBetween &&
                timeBetweenSkipWeekends == other.timeBetweenSkipWeekends &&
                periodToMonths == other.periodToMonths &&
                periodToWeeks == other.periodToWeeks &&
                and == other.and &&
                or == other.or &&
                xor == other.xor &&
                ifString == other.ifString &&
                ifNumber == other.ifNumber &&
                ifBoolean == other.ifBoolean &&
                isPresent == other.isPresent &&
                hasEmailReply == other.hasEmailReply &&
                hasPlainTextEmailReply == other.hasPlainTextEmailReply &&
                extractMostRecentEmailReplyHtml == other.extractMostRecentEmailReplyHtml &&
                extractMostRecentEmailReplyText == other.extractMostRecentEmailReplyText &&
                extractMostRecentPlainTextEmailReply ==
                    other.extractMostRecentPlainTextEmailReply &&
                setContainsString == other.setContainsString &&
                isEngagementType == other.isEngagementType &&
                formatFullName == other.formatFullName &&
                formatPhoneNumber == other.formatPhoneNumber &&
                formatSearchablePhoneNumber == other.formatSearchablePhoneNumber &&
                absoluteValue == other.absoluteValue &&
                squareRoot == other.squareRoot &&
                power == other.power &&
                substring == other.substring &&
                euler == other.euler &&
                stringLength == other.stringLength &&
                addTime == other.addTime &&
                subtractTime == other.subtractTime
        }

        override fun hashCode(): Int =
            Objects.hash(
                constantBoolean,
                constantNumber,
                constantString,
                booleanPropertyVariable,
                stringPropertyVariable,
                numberPropertyVariable,
                timestampOfPropertyVariable,
                booleanTargetPropertyVariable,
                stringTargetPropertyVariable,
                numberTargetPropertyVariable,
                timestampOfTargetPropertyVariable,
                addNumbers,
                subtractNumbers,
                multiplyNumbers,
                divideNumbers,
                roundDownNumbers,
                roundUpNumbers,
                roundNearestNumbers,
                upperCase,
                lowerCase,
                concatStrings,
                contains,
                beginsWith,
                numberToString,
                parseNumber,
                fetchExchangeRate,
                fetchCurrencyDecimalPlaces,
                fetchSingleCurrencyPortalCurrency,
                datedExchangeRate,
                pipelineProbability,
                maxNumbers,
                minNumbers,
                lessThan,
                lessThanOrEqual,
                moreThan,
                moreThanOrEqual,
                numberEquals,
                stringEquals,
                isPipelineStageClosed,
                not,
                date,
                month,
                year,
                now,
                timeBetween,
                timeBetweenSkipWeekends,
                periodToMonths,
                periodToWeeks,
                and,
                or,
                xor,
                ifString,
                ifNumber,
                ifBoolean,
                isPresent,
                hasEmailReply,
                hasPlainTextEmailReply,
                extractMostRecentEmailReplyHtml,
                extractMostRecentEmailReplyText,
                extractMostRecentPlainTextEmailReply,
                setContainsString,
                isEngagementType,
                formatFullName,
                formatPhoneNumber,
                formatSearchablePhoneNumber,
                absoluteValue,
                squareRoot,
                power,
                substring,
                euler,
                stringLength,
                addTime,
                subtractTime,
            )

        override fun toString(): String =
            when {
                constantBoolean != null -> "CalculationExpression{constantBoolean=$constantBoolean}"
                constantNumber != null -> "CalculationExpression{constantNumber=$constantNumber}"
                constantString != null -> "CalculationExpression{constantString=$constantString}"
                booleanPropertyVariable != null ->
                    "CalculationExpression{booleanPropertyVariable=$booleanPropertyVariable}"
                stringPropertyVariable != null ->
                    "CalculationExpression{stringPropertyVariable=$stringPropertyVariable}"
                numberPropertyVariable != null ->
                    "CalculationExpression{numberPropertyVariable=$numberPropertyVariable}"
                timestampOfPropertyVariable != null ->
                    "CalculationExpression{timestampOfPropertyVariable=$timestampOfPropertyVariable}"
                booleanTargetPropertyVariable != null ->
                    "CalculationExpression{booleanTargetPropertyVariable=$booleanTargetPropertyVariable}"
                stringTargetPropertyVariable != null ->
                    "CalculationExpression{stringTargetPropertyVariable=$stringTargetPropertyVariable}"
                numberTargetPropertyVariable != null ->
                    "CalculationExpression{numberTargetPropertyVariable=$numberTargetPropertyVariable}"
                timestampOfTargetPropertyVariable != null ->
                    "CalculationExpression{timestampOfTargetPropertyVariable=$timestampOfTargetPropertyVariable}"
                addNumbers != null -> "CalculationExpression{addNumbers=$addNumbers}"
                subtractNumbers != null -> "CalculationExpression{subtractNumbers=$subtractNumbers}"
                multiplyNumbers != null -> "CalculationExpression{multiplyNumbers=$multiplyNumbers}"
                divideNumbers != null -> "CalculationExpression{divideNumbers=$divideNumbers}"
                roundDownNumbers != null ->
                    "CalculationExpression{roundDownNumbers=$roundDownNumbers}"
                roundUpNumbers != null -> "CalculationExpression{roundUpNumbers=$roundUpNumbers}"
                roundNearestNumbers != null ->
                    "CalculationExpression{roundNearestNumbers=$roundNearestNumbers}"
                upperCase != null -> "CalculationExpression{upperCase=$upperCase}"
                lowerCase != null -> "CalculationExpression{lowerCase=$lowerCase}"
                concatStrings != null -> "CalculationExpression{concatStrings=$concatStrings}"
                contains != null -> "CalculationExpression{contains=$contains}"
                beginsWith != null -> "CalculationExpression{beginsWith=$beginsWith}"
                numberToString != null -> "CalculationExpression{numberToString=$numberToString}"
                parseNumber != null -> "CalculationExpression{parseNumber=$parseNumber}"
                fetchExchangeRate != null ->
                    "CalculationExpression{fetchExchangeRate=$fetchExchangeRate}"
                fetchCurrencyDecimalPlaces != null ->
                    "CalculationExpression{fetchCurrencyDecimalPlaces=$fetchCurrencyDecimalPlaces}"
                fetchSingleCurrencyPortalCurrency != null ->
                    "CalculationExpression{fetchSingleCurrencyPortalCurrency=$fetchSingleCurrencyPortalCurrency}"
                datedExchangeRate != null ->
                    "CalculationExpression{datedExchangeRate=$datedExchangeRate}"
                pipelineProbability != null ->
                    "CalculationExpression{pipelineProbability=$pipelineProbability}"
                maxNumbers != null -> "CalculationExpression{maxNumbers=$maxNumbers}"
                minNumbers != null -> "CalculationExpression{minNumbers=$minNumbers}"
                lessThan != null -> "CalculationExpression{lessThan=$lessThan}"
                lessThanOrEqual != null -> "CalculationExpression{lessThanOrEqual=$lessThanOrEqual}"
                moreThan != null -> "CalculationExpression{moreThan=$moreThan}"
                moreThanOrEqual != null -> "CalculationExpression{moreThanOrEqual=$moreThanOrEqual}"
                numberEquals != null -> "CalculationExpression{numberEquals=$numberEquals}"
                stringEquals != null -> "CalculationExpression{stringEquals=$stringEquals}"
                isPipelineStageClosed != null ->
                    "CalculationExpression{isPipelineStageClosed=$isPipelineStageClosed}"
                not != null -> "CalculationExpression{not=$not}"
                date != null -> "CalculationExpression{date=$date}"
                month != null -> "CalculationExpression{month=$month}"
                year != null -> "CalculationExpression{year=$year}"
                now != null -> "CalculationExpression{now=$now}"
                timeBetween != null -> "CalculationExpression{timeBetween=$timeBetween}"
                timeBetweenSkipWeekends != null ->
                    "CalculationExpression{timeBetweenSkipWeekends=$timeBetweenSkipWeekends}"
                periodToMonths != null -> "CalculationExpression{periodToMonths=$periodToMonths}"
                periodToWeeks != null -> "CalculationExpression{periodToWeeks=$periodToWeeks}"
                and != null -> "CalculationExpression{and=$and}"
                or != null -> "CalculationExpression{or=$or}"
                xor != null -> "CalculationExpression{xor=$xor}"
                ifString != null -> "CalculationExpression{ifString=$ifString}"
                ifNumber != null -> "CalculationExpression{ifNumber=$ifNumber}"
                ifBoolean != null -> "CalculationExpression{ifBoolean=$ifBoolean}"
                isPresent != null -> "CalculationExpression{isPresent=$isPresent}"
                hasEmailReply != null -> "CalculationExpression{hasEmailReply=$hasEmailReply}"
                hasPlainTextEmailReply != null ->
                    "CalculationExpression{hasPlainTextEmailReply=$hasPlainTextEmailReply}"
                extractMostRecentEmailReplyHtml != null ->
                    "CalculationExpression{extractMostRecentEmailReplyHtml=$extractMostRecentEmailReplyHtml}"
                extractMostRecentEmailReplyText != null ->
                    "CalculationExpression{extractMostRecentEmailReplyText=$extractMostRecentEmailReplyText}"
                extractMostRecentPlainTextEmailReply != null ->
                    "CalculationExpression{extractMostRecentPlainTextEmailReply=$extractMostRecentPlainTextEmailReply}"
                setContainsString != null ->
                    "CalculationExpression{setContainsString=$setContainsString}"
                isEngagementType != null ->
                    "CalculationExpression{isEngagementType=$isEngagementType}"
                formatFullName != null -> "CalculationExpression{formatFullName=$formatFullName}"
                formatPhoneNumber != null ->
                    "CalculationExpression{formatPhoneNumber=$formatPhoneNumber}"
                formatSearchablePhoneNumber != null ->
                    "CalculationExpression{formatSearchablePhoneNumber=$formatSearchablePhoneNumber}"
                absoluteValue != null -> "CalculationExpression{absoluteValue=$absoluteValue}"
                squareRoot != null -> "CalculationExpression{squareRoot=$squareRoot}"
                power != null -> "CalculationExpression{power=$power}"
                substring != null -> "CalculationExpression{substring=$substring}"
                euler != null -> "CalculationExpression{euler=$euler}"
                stringLength != null -> "CalculationExpression{stringLength=$stringLength}"
                addTime != null -> "CalculationExpression{addTime=$addTime}"
                subtractTime != null -> "CalculationExpression{subtractTime=$subtractTime}"
                _json != null -> "CalculationExpression{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid CalculationExpression")
            }

        companion object {

            @JvmStatic
            fun ofConstantBoolean(constantBoolean: ConstantBoolean) =
                CalculationExpression(constantBoolean = constantBoolean)

            @JvmStatic
            fun ofConstantNumber(constantNumber: ConstantNumber) =
                CalculationExpression(constantNumber = constantNumber)

            @JvmStatic
            fun ofConstantString(constantString: ConstantString) =
                CalculationExpression(constantString = constantString)

            @JvmStatic
            fun ofBooleanPropertyVariable(booleanPropertyVariable: BooleanPropertyVariable) =
                CalculationExpression(booleanPropertyVariable = booleanPropertyVariable)

            @JvmStatic
            fun ofStringPropertyVariable(stringPropertyVariable: StringPropertyVariable) =
                CalculationExpression(stringPropertyVariable = stringPropertyVariable)

            @JvmStatic
            fun ofNumberPropertyVariable(numberPropertyVariable: NumberPropertyVariable) =
                CalculationExpression(numberPropertyVariable = numberPropertyVariable)

            @JvmStatic
            fun ofTimestampOfPropertyVariable(
                timestampOfPropertyVariable: TimestampOfPropertyVariable
            ) = CalculationExpression(timestampOfPropertyVariable = timestampOfPropertyVariable)

            @JvmStatic
            fun ofBooleanTargetPropertyVariable(
                booleanTargetPropertyVariable: BooleanTargetPropertyVariable
            ) = CalculationExpression(booleanTargetPropertyVariable = booleanTargetPropertyVariable)

            @JvmStatic
            fun ofStringTargetPropertyVariable(
                stringTargetPropertyVariable: StringTargetPropertyVariable
            ) = CalculationExpression(stringTargetPropertyVariable = stringTargetPropertyVariable)

            @JvmStatic
            fun ofNumberTargetPropertyVariable(
                numberTargetPropertyVariable: NumberTargetPropertyVariable
            ) = CalculationExpression(numberTargetPropertyVariable = numberTargetPropertyVariable)

            @JvmStatic
            fun ofTimestampOfTargetPropertyVariable(
                timestampOfTargetPropertyVariable: TimestampOfTargetPropertyVariable
            ) =
                CalculationExpression(
                    timestampOfTargetPropertyVariable = timestampOfTargetPropertyVariable
                )

            @JvmStatic
            fun ofAddNumbers(addNumbers: AddNumbers) =
                CalculationExpression(addNumbers = addNumbers)

            @JvmStatic
            fun ofSubtractNumbers(subtractNumbers: SubtractNumbers) =
                CalculationExpression(subtractNumbers = subtractNumbers)

            @JvmStatic
            fun ofMultiplyNumbers(multiplyNumbers: MultiplyNumbers) =
                CalculationExpression(multiplyNumbers = multiplyNumbers)

            @JvmStatic
            fun ofDivideNumbers(divideNumbers: DivideNumbers) =
                CalculationExpression(divideNumbers = divideNumbers)

            @JvmStatic
            fun ofRoundDownNumbers(roundDownNumbers: RoundDownNumbers) =
                CalculationExpression(roundDownNumbers = roundDownNumbers)

            @JvmStatic
            fun ofRoundUpNumbers(roundUpNumbers: RoundUpNumbers) =
                CalculationExpression(roundUpNumbers = roundUpNumbers)

            @JvmStatic
            fun ofRoundNearestNumbers(roundNearestNumbers: RoundNearestNumbers) =
                CalculationExpression(roundNearestNumbers = roundNearestNumbers)

            @JvmStatic
            fun ofUpperCase(upperCase: UpperCase) = CalculationExpression(upperCase = upperCase)

            @JvmStatic
            fun ofLowerCase(lowerCase: LowerCase) = CalculationExpression(lowerCase = lowerCase)

            @JvmStatic
            fun ofConcatStrings(concatStrings: ConcatStrings) =
                CalculationExpression(concatStrings = concatStrings)

            @JvmStatic
            fun ofContains(contains: Contains) = CalculationExpression(contains = contains)

            @JvmStatic
            fun ofBeginsWith(beginsWith: BeginsWith) =
                CalculationExpression(beginsWith = beginsWith)

            @JvmStatic
            fun ofNumberToString(numberToString: NumberToString) =
                CalculationExpression(numberToString = numberToString)

            @JvmStatic
            fun ofParseNumber(parseNumber: ParseNumber) =
                CalculationExpression(parseNumber = parseNumber)

            @JvmStatic
            fun ofFetchExchangeRate(fetchExchangeRate: FetchExchangeRate) =
                CalculationExpression(fetchExchangeRate = fetchExchangeRate)

            @JvmStatic
            fun ofFetchCurrencyDecimalPlaces(
                fetchCurrencyDecimalPlaces: FetchCurrencyDecimalPlaces
            ) = CalculationExpression(fetchCurrencyDecimalPlaces = fetchCurrencyDecimalPlaces)

            @JvmStatic
            fun ofFetchSingleCurrencyPortalCurrency(
                fetchSingleCurrencyPortalCurrency: FetchSingleCurrencyPortalCurrency
            ) =
                CalculationExpression(
                    fetchSingleCurrencyPortalCurrency = fetchSingleCurrencyPortalCurrency
                )

            @JvmStatic
            fun ofDatedExchangeRate(datedExchangeRate: DatedExchangeRate) =
                CalculationExpression(datedExchangeRate = datedExchangeRate)

            @JvmStatic
            fun ofPipelineProbability(pipelineProbability: PipelineProbability) =
                CalculationExpression(pipelineProbability = pipelineProbability)

            @JvmStatic
            fun ofMaxNumbers(maxNumbers: MaxNumbers) =
                CalculationExpression(maxNumbers = maxNumbers)

            @JvmStatic
            fun ofMinNumbers(minNumbers: MinNumbers) =
                CalculationExpression(minNumbers = minNumbers)

            @JvmStatic
            fun ofLessThan(lessThan: LessThan) = CalculationExpression(lessThan = lessThan)

            @JvmStatic
            fun ofLessThanOrEqual(lessThanOrEqual: LessThanOrEqual) =
                CalculationExpression(lessThanOrEqual = lessThanOrEqual)

            @JvmStatic
            fun ofMoreThan(moreThan: MoreThan) = CalculationExpression(moreThan = moreThan)

            @JvmStatic
            fun ofMoreThanOrEqual(moreThanOrEqual: MoreThanOrEqual) =
                CalculationExpression(moreThanOrEqual = moreThanOrEqual)

            @JvmStatic
            fun ofNumberEquals(numberEquals: NumberEquals) =
                CalculationExpression(numberEquals = numberEquals)

            @JvmStatic
            fun ofStringEquals(stringEquals: StringEquals) =
                CalculationExpression(stringEquals = stringEquals)

            @JvmStatic
            fun ofIsPipelineStageClosed(isPipelineStageClosed: IsPipelineStageClosed) =
                CalculationExpression(isPipelineStageClosed = isPipelineStageClosed)

            @JvmStatic fun ofNot(not: Not) = CalculationExpression(not = not)

            @JvmStatic fun ofDate(date: Date) = CalculationExpression(date = date)

            @JvmStatic fun ofMonth(month: Month) = CalculationExpression(month = month)

            @JvmStatic fun ofYear(year: Year) = CalculationExpression(year = year)

            @JvmStatic fun ofNow(now: Now) = CalculationExpression(now = now)

            @JvmStatic
            fun ofTimeBetween(timeBetween: TimeBetween) =
                CalculationExpression(timeBetween = timeBetween)

            @JvmStatic
            fun ofTimeBetweenSkipWeekends(timeBetweenSkipWeekends: TimeBetweenSkipWeekends) =
                CalculationExpression(timeBetweenSkipWeekends = timeBetweenSkipWeekends)

            @JvmStatic
            fun ofPeriodToMonths(periodToMonths: PeriodToMonths) =
                CalculationExpression(periodToMonths = periodToMonths)

            @JvmStatic
            fun ofPeriodToWeeks(periodToWeeks: PeriodToWeeks) =
                CalculationExpression(periodToWeeks = periodToWeeks)

            @JvmStatic fun ofAnd(and: And) = CalculationExpression(and = and)

            @JvmStatic fun ofOr(or: Or) = CalculationExpression(or = or)

            @JvmStatic fun ofXor(xor: Xor) = CalculationExpression(xor = xor)

            @JvmStatic
            fun ofIfString(ifString: IfString) = CalculationExpression(ifString = ifString)

            @JvmStatic
            fun ofIfNumber(ifNumber: IfNumber) = CalculationExpression(ifNumber = ifNumber)

            @JvmStatic
            fun ofIfBoolean(ifBoolean: IfBoolean) = CalculationExpression(ifBoolean = ifBoolean)

            @JvmStatic
            fun ofIsPresent(isPresent: IsPresent) = CalculationExpression(isPresent = isPresent)

            @JvmStatic
            fun ofHasEmailReply(hasEmailReply: HasEmailReply) =
                CalculationExpression(hasEmailReply = hasEmailReply)

            @JvmStatic
            fun ofHasPlainTextEmailReply(hasPlainTextEmailReply: HasPlainTextEmailReply) =
                CalculationExpression(hasPlainTextEmailReply = hasPlainTextEmailReply)

            @JvmStatic
            fun ofExtractMostRecentEmailReplyHtml(
                extractMostRecentEmailReplyHtml: ExtractMostRecentEmailReplyHtml
            ) =
                CalculationExpression(
                    extractMostRecentEmailReplyHtml = extractMostRecentEmailReplyHtml
                )

            @JvmStatic
            fun ofExtractMostRecentEmailReplyText(
                extractMostRecentEmailReplyText: ExtractMostRecentEmailReplyText
            ) =
                CalculationExpression(
                    extractMostRecentEmailReplyText = extractMostRecentEmailReplyText
                )

            @JvmStatic
            fun ofExtractMostRecentPlainTextEmailReply(
                extractMostRecentPlainTextEmailReply: ExtractMostRecentPlainTextEmailReply
            ) =
                CalculationExpression(
                    extractMostRecentPlainTextEmailReply = extractMostRecentPlainTextEmailReply
                )

            @JvmStatic
            fun ofSetContainsString(setContainsString: SetContainsString) =
                CalculationExpression(setContainsString = setContainsString)

            @JvmStatic
            fun ofIsEngagementType(isEngagementType: IsEngagementType) =
                CalculationExpression(isEngagementType = isEngagementType)

            @JvmStatic
            fun ofFormatFullName(formatFullName: FormatFullName) =
                CalculationExpression(formatFullName = formatFullName)

            @JvmStatic
            fun ofFormatPhoneNumber(formatPhoneNumber: FormatPhoneNumber) =
                CalculationExpression(formatPhoneNumber = formatPhoneNumber)

            @JvmStatic
            fun ofFormatSearchablePhoneNumber(
                formatSearchablePhoneNumber: FormatSearchablePhoneNumber
            ) = CalculationExpression(formatSearchablePhoneNumber = formatSearchablePhoneNumber)

            @JvmStatic
            fun ofAbsoluteValue(absoluteValue: AbsoluteValue) =
                CalculationExpression(absoluteValue = absoluteValue)

            @JvmStatic
            fun ofSquareRoot(squareRoot: SquareRoot) =
                CalculationExpression(squareRoot = squareRoot)

            @JvmStatic fun ofPower(power: Power) = CalculationExpression(power = power)

            @JvmStatic
            fun ofSubstring(substring: Substring) = CalculationExpression(substring = substring)

            @JvmStatic fun ofEuler(euler: Euler) = CalculationExpression(euler = euler)

            @JvmStatic
            fun ofStringLength(stringLength: StringLength) =
                CalculationExpression(stringLength = stringLength)

            @JvmStatic fun ofAddTime(addTime: AddTime) = CalculationExpression(addTime = addTime)

            @JvmStatic
            fun ofSubtractTime(subtractTime: SubtractTime) =
                CalculationExpression(subtractTime = subtractTime)
        }

        /**
         * An interface that defines how to map each variant of [CalculationExpression] to a value
         * of type [T].
         */
        interface Visitor<out T> {

            fun visitConstantBoolean(constantBoolean: ConstantBoolean): T

            fun visitConstantNumber(constantNumber: ConstantNumber): T

            fun visitConstantString(constantString: ConstantString): T

            fun visitBooleanPropertyVariable(booleanPropertyVariable: BooleanPropertyVariable): T

            fun visitStringPropertyVariable(stringPropertyVariable: StringPropertyVariable): T

            fun visitNumberPropertyVariable(numberPropertyVariable: NumberPropertyVariable): T

            fun visitTimestampOfPropertyVariable(
                timestampOfPropertyVariable: TimestampOfPropertyVariable
            ): T

            fun visitBooleanTargetPropertyVariable(
                booleanTargetPropertyVariable: BooleanTargetPropertyVariable
            ): T

            fun visitStringTargetPropertyVariable(
                stringTargetPropertyVariable: StringTargetPropertyVariable
            ): T

            fun visitNumberTargetPropertyVariable(
                numberTargetPropertyVariable: NumberTargetPropertyVariable
            ): T

            fun visitTimestampOfTargetPropertyVariable(
                timestampOfTargetPropertyVariable: TimestampOfTargetPropertyVariable
            ): T

            fun visitAddNumbers(addNumbers: AddNumbers): T

            fun visitSubtractNumbers(subtractNumbers: SubtractNumbers): T

            fun visitMultiplyNumbers(multiplyNumbers: MultiplyNumbers): T

            fun visitDivideNumbers(divideNumbers: DivideNumbers): T

            fun visitRoundDownNumbers(roundDownNumbers: RoundDownNumbers): T

            fun visitRoundUpNumbers(roundUpNumbers: RoundUpNumbers): T

            fun visitRoundNearestNumbers(roundNearestNumbers: RoundNearestNumbers): T

            fun visitUpperCase(upperCase: UpperCase): T

            fun visitLowerCase(lowerCase: LowerCase): T

            fun visitConcatStrings(concatStrings: ConcatStrings): T

            fun visitContains(contains: Contains): T

            fun visitBeginsWith(beginsWith: BeginsWith): T

            fun visitNumberToString(numberToString: NumberToString): T

            fun visitParseNumber(parseNumber: ParseNumber): T

            fun visitFetchExchangeRate(fetchExchangeRate: FetchExchangeRate): T

            fun visitFetchCurrencyDecimalPlaces(
                fetchCurrencyDecimalPlaces: FetchCurrencyDecimalPlaces
            ): T

            fun visitFetchSingleCurrencyPortalCurrency(
                fetchSingleCurrencyPortalCurrency: FetchSingleCurrencyPortalCurrency
            ): T

            fun visitDatedExchangeRate(datedExchangeRate: DatedExchangeRate): T

            fun visitPipelineProbability(pipelineProbability: PipelineProbability): T

            fun visitMaxNumbers(maxNumbers: MaxNumbers): T

            fun visitMinNumbers(minNumbers: MinNumbers): T

            fun visitLessThan(lessThan: LessThan): T

            fun visitLessThanOrEqual(lessThanOrEqual: LessThanOrEqual): T

            fun visitMoreThan(moreThan: MoreThan): T

            fun visitMoreThanOrEqual(moreThanOrEqual: MoreThanOrEqual): T

            fun visitNumberEquals(numberEquals: NumberEquals): T

            fun visitStringEquals(stringEquals: StringEquals): T

            fun visitIsPipelineStageClosed(isPipelineStageClosed: IsPipelineStageClosed): T

            fun visitNot(not: Not): T

            fun visitDate(date: Date): T

            fun visitMonth(month: Month): T

            fun visitYear(year: Year): T

            fun visitNow(now: Now): T

            fun visitTimeBetween(timeBetween: TimeBetween): T

            fun visitTimeBetweenSkipWeekends(timeBetweenSkipWeekends: TimeBetweenSkipWeekends): T

            fun visitPeriodToMonths(periodToMonths: PeriodToMonths): T

            fun visitPeriodToWeeks(periodToWeeks: PeriodToWeeks): T

            fun visitAnd(and: And): T

            fun visitOr(or: Or): T

            fun visitXor(xor: Xor): T

            fun visitIfString(ifString: IfString): T

            fun visitIfNumber(ifNumber: IfNumber): T

            fun visitIfBoolean(ifBoolean: IfBoolean): T

            fun visitIsPresent(isPresent: IsPresent): T

            fun visitHasEmailReply(hasEmailReply: HasEmailReply): T

            fun visitHasPlainTextEmailReply(hasPlainTextEmailReply: HasPlainTextEmailReply): T

            fun visitExtractMostRecentEmailReplyHtml(
                extractMostRecentEmailReplyHtml: ExtractMostRecentEmailReplyHtml
            ): T

            fun visitExtractMostRecentEmailReplyText(
                extractMostRecentEmailReplyText: ExtractMostRecentEmailReplyText
            ): T

            fun visitExtractMostRecentPlainTextEmailReply(
                extractMostRecentPlainTextEmailReply: ExtractMostRecentPlainTextEmailReply
            ): T

            fun visitSetContainsString(setContainsString: SetContainsString): T

            fun visitIsEngagementType(isEngagementType: IsEngagementType): T

            fun visitFormatFullName(formatFullName: FormatFullName): T

            fun visitFormatPhoneNumber(formatPhoneNumber: FormatPhoneNumber): T

            fun visitFormatSearchablePhoneNumber(
                formatSearchablePhoneNumber: FormatSearchablePhoneNumber
            ): T

            fun visitAbsoluteValue(absoluteValue: AbsoluteValue): T

            fun visitSquareRoot(squareRoot: SquareRoot): T

            fun visitPower(power: Power): T

            fun visitSubstring(substring: Substring): T

            fun visitEuler(euler: Euler): T

            fun visitStringLength(stringLength: StringLength): T

            fun visitAddTime(addTime: AddTime): T

            fun visitSubtractTime(subtractTime: SubtractTime): T

            /**
             * Maps an unknown variant of [CalculationExpression] to a value of type [T].
             *
             * An instance of [CalculationExpression] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws HubSpotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubSpotInvalidDataException("Unknown CalculationExpression: $json")
            }
        }

        internal class Deserializer :
            BaseDeserializer<CalculationExpression>(CalculationExpression::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): CalculationExpression {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<ConstantBoolean>())?.let {
                                CalculationExpression(constantBoolean = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ConstantNumber>())?.let {
                                CalculationExpression(constantNumber = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ConstantString>())?.let {
                                CalculationExpression(constantString = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<BooleanPropertyVariable>())?.let {
                                CalculationExpression(booleanPropertyVariable = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<StringPropertyVariable>())?.let {
                                CalculationExpression(stringPropertyVariable = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<NumberPropertyVariable>())?.let {
                                CalculationExpression(numberPropertyVariable = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<TimestampOfPropertyVariable>())
                                ?.let {
                                    CalculationExpression(
                                        timestampOfPropertyVariable = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(node, jacksonTypeRef<BooleanTargetPropertyVariable>())
                                ?.let {
                                    CalculationExpression(
                                        booleanTargetPropertyVariable = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(node, jacksonTypeRef<StringTargetPropertyVariable>())
                                ?.let {
                                    CalculationExpression(
                                        stringTargetPropertyVariable = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(node, jacksonTypeRef<NumberTargetPropertyVariable>())
                                ?.let {
                                    CalculationExpression(
                                        numberTargetPropertyVariable = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<TimestampOfTargetPropertyVariable>(),
                                )
                                ?.let {
                                    CalculationExpression(
                                        timestampOfTargetPropertyVariable = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(node, jacksonTypeRef<AddNumbers>())?.let {
                                CalculationExpression(addNumbers = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<SubtractNumbers>())?.let {
                                CalculationExpression(subtractNumbers = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<MultiplyNumbers>())?.let {
                                CalculationExpression(multiplyNumbers = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<DivideNumbers>())?.let {
                                CalculationExpression(divideNumbers = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<RoundDownNumbers>())?.let {
                                CalculationExpression(roundDownNumbers = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<RoundUpNumbers>())?.let {
                                CalculationExpression(roundUpNumbers = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<RoundNearestNumbers>())?.let {
                                CalculationExpression(roundNearestNumbers = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<UpperCase>())?.let {
                                CalculationExpression(upperCase = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<LowerCase>())?.let {
                                CalculationExpression(lowerCase = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ConcatStrings>())?.let {
                                CalculationExpression(concatStrings = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Contains>())?.let {
                                CalculationExpression(contains = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<BeginsWith>())?.let {
                                CalculationExpression(beginsWith = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<NumberToString>())?.let {
                                CalculationExpression(numberToString = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ParseNumber>())?.let {
                                CalculationExpression(parseNumber = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<FetchExchangeRate>())?.let {
                                CalculationExpression(fetchExchangeRate = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<FetchCurrencyDecimalPlaces>())
                                ?.let {
                                    CalculationExpression(
                                        fetchCurrencyDecimalPlaces = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<FetchSingleCurrencyPortalCurrency>(),
                                )
                                ?.let {
                                    CalculationExpression(
                                        fetchSingleCurrencyPortalCurrency = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(node, jacksonTypeRef<DatedExchangeRate>())?.let {
                                CalculationExpression(datedExchangeRate = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PipelineProbability>())?.let {
                                CalculationExpression(pipelineProbability = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<MaxNumbers>())?.let {
                                CalculationExpression(maxNumbers = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<MinNumbers>())?.let {
                                CalculationExpression(minNumbers = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<LessThan>())?.let {
                                CalculationExpression(lessThan = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<LessThanOrEqual>())?.let {
                                CalculationExpression(lessThanOrEqual = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<MoreThan>())?.let {
                                CalculationExpression(moreThan = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<MoreThanOrEqual>())?.let {
                                CalculationExpression(moreThanOrEqual = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<NumberEquals>())?.let {
                                CalculationExpression(numberEquals = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<StringEquals>())?.let {
                                CalculationExpression(stringEquals = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<IsPipelineStageClosed>())?.let {
                                CalculationExpression(isPipelineStageClosed = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Not>())?.let {
                                CalculationExpression(not = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Date>())?.let {
                                CalculationExpression(date = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Month>())?.let {
                                CalculationExpression(month = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Year>())?.let {
                                CalculationExpression(year = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Now>())?.let {
                                CalculationExpression(now = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<TimeBetween>())?.let {
                                CalculationExpression(timeBetween = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<TimeBetweenSkipWeekends>())?.let {
                                CalculationExpression(timeBetweenSkipWeekends = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PeriodToMonths>())?.let {
                                CalculationExpression(periodToMonths = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PeriodToWeeks>())?.let {
                                CalculationExpression(periodToWeeks = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<And>())?.let {
                                CalculationExpression(and = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Or>())?.let {
                                CalculationExpression(or = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Xor>())?.let {
                                CalculationExpression(xor = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<IfString>())?.let {
                                CalculationExpression(ifString = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<IfNumber>())?.let {
                                CalculationExpression(ifNumber = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<IfBoolean>())?.let {
                                CalculationExpression(ifBoolean = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<IsPresent>())?.let {
                                CalculationExpression(isPresent = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<HasEmailReply>())?.let {
                                CalculationExpression(hasEmailReply = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<HasPlainTextEmailReply>())?.let {
                                CalculationExpression(hasPlainTextEmailReply = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ExtractMostRecentEmailReplyHtml>())
                                ?.let {
                                    CalculationExpression(
                                        extractMostRecentEmailReplyHtml = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(node, jacksonTypeRef<ExtractMostRecentEmailReplyText>())
                                ?.let {
                                    CalculationExpression(
                                        extractMostRecentEmailReplyText = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<ExtractMostRecentPlainTextEmailReply>(),
                                )
                                ?.let {
                                    CalculationExpression(
                                        extractMostRecentPlainTextEmailReply = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(node, jacksonTypeRef<SetContainsString>())?.let {
                                CalculationExpression(setContainsString = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<IsEngagementType>())?.let {
                                CalculationExpression(isEngagementType = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<FormatFullName>())?.let {
                                CalculationExpression(formatFullName = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<FormatPhoneNumber>())?.let {
                                CalculationExpression(formatPhoneNumber = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<FormatSearchablePhoneNumber>())
                                ?.let {
                                    CalculationExpression(
                                        formatSearchablePhoneNumber = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(node, jacksonTypeRef<AbsoluteValue>())?.let {
                                CalculationExpression(absoluteValue = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<SquareRoot>())?.let {
                                CalculationExpression(squareRoot = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Power>())?.let {
                                CalculationExpression(power = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Substring>())?.let {
                                CalculationExpression(substring = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Euler>())?.let {
                                CalculationExpression(euler = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<StringLength>())?.let {
                                CalculationExpression(stringLength = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<AddTime>())?.let {
                                CalculationExpression(addTime = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<SubtractTime>())?.let {
                                CalculationExpression(subtractTime = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> CalculationExpression(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer :
            BaseSerializer<CalculationExpression>(CalculationExpression::class) {

            override fun serialize(
                value: CalculationExpression,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.constantBoolean != null -> generator.writeObject(value.constantBoolean)
                    value.constantNumber != null -> generator.writeObject(value.constantNumber)
                    value.constantString != null -> generator.writeObject(value.constantString)
                    value.booleanPropertyVariable != null ->
                        generator.writeObject(value.booleanPropertyVariable)
                    value.stringPropertyVariable != null ->
                        generator.writeObject(value.stringPropertyVariable)
                    value.numberPropertyVariable != null ->
                        generator.writeObject(value.numberPropertyVariable)
                    value.timestampOfPropertyVariable != null ->
                        generator.writeObject(value.timestampOfPropertyVariable)
                    value.booleanTargetPropertyVariable != null ->
                        generator.writeObject(value.booleanTargetPropertyVariable)
                    value.stringTargetPropertyVariable != null ->
                        generator.writeObject(value.stringTargetPropertyVariable)
                    value.numberTargetPropertyVariable != null ->
                        generator.writeObject(value.numberTargetPropertyVariable)
                    value.timestampOfTargetPropertyVariable != null ->
                        generator.writeObject(value.timestampOfTargetPropertyVariable)
                    value.addNumbers != null -> generator.writeObject(value.addNumbers)
                    value.subtractNumbers != null -> generator.writeObject(value.subtractNumbers)
                    value.multiplyNumbers != null -> generator.writeObject(value.multiplyNumbers)
                    value.divideNumbers != null -> generator.writeObject(value.divideNumbers)
                    value.roundDownNumbers != null -> generator.writeObject(value.roundDownNumbers)
                    value.roundUpNumbers != null -> generator.writeObject(value.roundUpNumbers)
                    value.roundNearestNumbers != null ->
                        generator.writeObject(value.roundNearestNumbers)
                    value.upperCase != null -> generator.writeObject(value.upperCase)
                    value.lowerCase != null -> generator.writeObject(value.lowerCase)
                    value.concatStrings != null -> generator.writeObject(value.concatStrings)
                    value.contains != null -> generator.writeObject(value.contains)
                    value.beginsWith != null -> generator.writeObject(value.beginsWith)
                    value.numberToString != null -> generator.writeObject(value.numberToString)
                    value.parseNumber != null -> generator.writeObject(value.parseNumber)
                    value.fetchExchangeRate != null ->
                        generator.writeObject(value.fetchExchangeRate)
                    value.fetchCurrencyDecimalPlaces != null ->
                        generator.writeObject(value.fetchCurrencyDecimalPlaces)
                    value.fetchSingleCurrencyPortalCurrency != null ->
                        generator.writeObject(value.fetchSingleCurrencyPortalCurrency)
                    value.datedExchangeRate != null ->
                        generator.writeObject(value.datedExchangeRate)
                    value.pipelineProbability != null ->
                        generator.writeObject(value.pipelineProbability)
                    value.maxNumbers != null -> generator.writeObject(value.maxNumbers)
                    value.minNumbers != null -> generator.writeObject(value.minNumbers)
                    value.lessThan != null -> generator.writeObject(value.lessThan)
                    value.lessThanOrEqual != null -> generator.writeObject(value.lessThanOrEqual)
                    value.moreThan != null -> generator.writeObject(value.moreThan)
                    value.moreThanOrEqual != null -> generator.writeObject(value.moreThanOrEqual)
                    value.numberEquals != null -> generator.writeObject(value.numberEquals)
                    value.stringEquals != null -> generator.writeObject(value.stringEquals)
                    value.isPipelineStageClosed != null ->
                        generator.writeObject(value.isPipelineStageClosed)
                    value.not != null -> generator.writeObject(value.not)
                    value.date != null -> generator.writeObject(value.date)
                    value.month != null -> generator.writeObject(value.month)
                    value.year != null -> generator.writeObject(value.year)
                    value.now != null -> generator.writeObject(value.now)
                    value.timeBetween != null -> generator.writeObject(value.timeBetween)
                    value.timeBetweenSkipWeekends != null ->
                        generator.writeObject(value.timeBetweenSkipWeekends)
                    value.periodToMonths != null -> generator.writeObject(value.periodToMonths)
                    value.periodToWeeks != null -> generator.writeObject(value.periodToWeeks)
                    value.and != null -> generator.writeObject(value.and)
                    value.or != null -> generator.writeObject(value.or)
                    value.xor != null -> generator.writeObject(value.xor)
                    value.ifString != null -> generator.writeObject(value.ifString)
                    value.ifNumber != null -> generator.writeObject(value.ifNumber)
                    value.ifBoolean != null -> generator.writeObject(value.ifBoolean)
                    value.isPresent != null -> generator.writeObject(value.isPresent)
                    value.hasEmailReply != null -> generator.writeObject(value.hasEmailReply)
                    value.hasPlainTextEmailReply != null ->
                        generator.writeObject(value.hasPlainTextEmailReply)
                    value.extractMostRecentEmailReplyHtml != null ->
                        generator.writeObject(value.extractMostRecentEmailReplyHtml)
                    value.extractMostRecentEmailReplyText != null ->
                        generator.writeObject(value.extractMostRecentEmailReplyText)
                    value.extractMostRecentPlainTextEmailReply != null ->
                        generator.writeObject(value.extractMostRecentPlainTextEmailReply)
                    value.setContainsString != null ->
                        generator.writeObject(value.setContainsString)
                    value.isEngagementType != null -> generator.writeObject(value.isEngagementType)
                    value.formatFullName != null -> generator.writeObject(value.formatFullName)
                    value.formatPhoneNumber != null ->
                        generator.writeObject(value.formatPhoneNumber)
                    value.formatSearchablePhoneNumber != null ->
                        generator.writeObject(value.formatSearchablePhoneNumber)
                    value.absoluteValue != null -> generator.writeObject(value.absoluteValue)
                    value.squareRoot != null -> generator.writeObject(value.squareRoot)
                    value.power != null -> generator.writeObject(value.power)
                    value.substring != null -> generator.writeObject(value.substring)
                    value.euler != null -> generator.writeObject(value.euler)
                    value.stringLength != null -> generator.writeObject(value.stringLength)
                    value.addTime != null -> generator.writeObject(value.addTime)
                    value.subtractTime != null -> generator.writeObject(value.subtractTime)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid CalculationExpression")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PropertyDefinition &&
            objectTypeId == other.objectTypeId &&
            property == other.property &&
            calculationExpression == other.calculationExpression &&
            calculationFormula == other.calculationFormula &&
            definitionSource == other.definitionSource &&
            extensionData == other.extensionData &&
            externalOptionsMetaData == other.externalOptionsMetaData &&
            fulcrumPortalId == other.fulcrumPortalId &&
            fulcrumTimestamp == other.fulcrumTimestamp &&
            janusGroup == other.janusGroup &&
            permission == other.permission &&
            propertyDefinitionSource == other.propertyDefinitionSource &&
            propertyRequirements == other.propertyRequirements &&
            rollupExpression == other.rollupExpression &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            objectTypeId,
            property,
            calculationExpression,
            calculationFormula,
            definitionSource,
            extensionData,
            externalOptionsMetaData,
            fulcrumPortalId,
            fulcrumTimestamp,
            janusGroup,
            permission,
            propertyDefinitionSource,
            propertyRequirements,
            rollupExpression,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PropertyDefinition{objectTypeId=$objectTypeId, property=$property, calculationExpression=$calculationExpression, calculationFormula=$calculationFormula, definitionSource=$definitionSource, extensionData=$extensionData, externalOptionsMetaData=$externalOptionsMetaData, fulcrumPortalId=$fulcrumPortalId, fulcrumTimestamp=$fulcrumTimestamp, janusGroup=$janusGroup, permission=$permission, propertyDefinitionSource=$propertyDefinitionSource, propertyRequirements=$propertyRequirements, rollupExpression=$rollupExpression, additionalProperties=$additionalProperties}"
}
