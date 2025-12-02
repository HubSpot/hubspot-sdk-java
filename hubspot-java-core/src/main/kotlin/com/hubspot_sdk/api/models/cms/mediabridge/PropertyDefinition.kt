// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import com.hubspot_sdk.api.models.Property
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
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectTypeId(): String = objectTypeId.getRequired("objectTypeId")

    /**
     * Defines a property
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun property(): Property = property.getRequired("property")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun calculationExpression(): Optional<CalculationExpression> =
        calculationExpression.getOptional("calculationExpression")

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
    fun definitionSource(): Optional<PropertyDefinitionSource> =
        definitionSource.getOptional("definitionSource")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun extensionData(): Optional<ExtensionData> = extensionData.getOptional("extensionData")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalOptionsMetaData(): Optional<ExternalOptionsMetaData> =
        externalOptionsMetaData.getOptional("externalOptionsMetaData")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fulcrumPortalId(): Optional<Int> = fulcrumPortalId.getOptional("fulcrumPortalId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fulcrumTimestamp(): Optional<Long> = fulcrumTimestamp.getOptional("fulcrumTimestamp")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun janusGroup(): Optional<String> = janusGroup.getOptional("janusGroup")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun permission(): Optional<FieldLevelPermission> = permission.getOptional("permission")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun propertyDefinitionSource(): Optional<DefinitionSource> =
        propertyDefinitionSource.getOptional("propertyDefinitionSource")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun propertyRequirements(): Optional<DefaultRequirements> =
        propertyRequirements.getOptional("propertyRequirements")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
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

        /** Defines a property */
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

    class CalculationExpression
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

            /**
             * Returns a mutable builder for constructing an instance of [CalculationExpression].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CalculationExpression]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(calculationExpression: CalculationExpression) = apply {
                additionalProperties = calculationExpression.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [CalculationExpression].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CalculationExpression =
                CalculationExpression(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): CalculationExpression = apply {
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

            return other is CalculationExpression &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CalculationExpression{additionalProperties=$additionalProperties}"
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
