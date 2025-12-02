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
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import com.hubspot_sdk.api.models.AssociationSpec
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class RollupExpression
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val associationTypes: JsonField<List<AssociationSpec>>,
    private val rollupOperator: JsonField<String>,
    private val sourceObjectTypeId: JsonField<String>,
    private val sourcePropertyName: JsonField<String>,
    private val conditionalExpression: JsonField<ConditionalExpression>,
    private val conditionalFormula: JsonField<String>,
    private val emptyRollupValue: JsonField<String>,
    private val sourceCompareByPropertyName: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("associationTypes")
        @ExcludeMissing
        associationTypes: JsonField<List<AssociationSpec>> = JsonMissing.of(),
        @JsonProperty("rollupOperator")
        @ExcludeMissing
        rollupOperator: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceObjectTypeId")
        @ExcludeMissing
        sourceObjectTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourcePropertyName")
        @ExcludeMissing
        sourcePropertyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("conditionalExpression")
        @ExcludeMissing
        conditionalExpression: JsonField<ConditionalExpression> = JsonMissing.of(),
        @JsonProperty("conditionalFormula")
        @ExcludeMissing
        conditionalFormula: JsonField<String> = JsonMissing.of(),
        @JsonProperty("emptyRollupValue")
        @ExcludeMissing
        emptyRollupValue: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceCompareByPropertyName")
        @ExcludeMissing
        sourceCompareByPropertyName: JsonField<String> = JsonMissing.of(),
    ) : this(
        associationTypes,
        rollupOperator,
        sourceObjectTypeId,
        sourcePropertyName,
        conditionalExpression,
        conditionalFormula,
        emptyRollupValue,
        sourceCompareByPropertyName,
        mutableMapOf(),
    )

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun associationTypes(): List<AssociationSpec> = associationTypes.getRequired("associationTypes")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rollupOperator(): String = rollupOperator.getRequired("rollupOperator")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sourceObjectTypeId(): String = sourceObjectTypeId.getRequired("sourceObjectTypeId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sourcePropertyName(): String = sourcePropertyName.getRequired("sourcePropertyName")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun conditionalExpression(): Optional<ConditionalExpression> =
        conditionalExpression.getOptional("conditionalExpression")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun conditionalFormula(): Optional<String> =
        conditionalFormula.getOptional("conditionalFormula")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun emptyRollupValue(): Optional<String> = emptyRollupValue.getOptional("emptyRollupValue")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sourceCompareByPropertyName(): Optional<String> =
        sourceCompareByPropertyName.getOptional("sourceCompareByPropertyName")

    /**
     * Returns the raw JSON value of [associationTypes].
     *
     * Unlike [associationTypes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("associationTypes")
    @ExcludeMissing
    fun _associationTypes(): JsonField<List<AssociationSpec>> = associationTypes

    /**
     * Returns the raw JSON value of [rollupOperator].
     *
     * Unlike [rollupOperator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rollupOperator")
    @ExcludeMissing
    fun _rollupOperator(): JsonField<String> = rollupOperator

    /**
     * Returns the raw JSON value of [sourceObjectTypeId].
     *
     * Unlike [sourceObjectTypeId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("sourceObjectTypeId")
    @ExcludeMissing
    fun _sourceObjectTypeId(): JsonField<String> = sourceObjectTypeId

    /**
     * Returns the raw JSON value of [sourcePropertyName].
     *
     * Unlike [sourcePropertyName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("sourcePropertyName")
    @ExcludeMissing
    fun _sourcePropertyName(): JsonField<String> = sourcePropertyName

    /**
     * Returns the raw JSON value of [conditionalExpression].
     *
     * Unlike [conditionalExpression], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("conditionalExpression")
    @ExcludeMissing
    fun _conditionalExpression(): JsonField<ConditionalExpression> = conditionalExpression

    /**
     * Returns the raw JSON value of [conditionalFormula].
     *
     * Unlike [conditionalFormula], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("conditionalFormula")
    @ExcludeMissing
    fun _conditionalFormula(): JsonField<String> = conditionalFormula

    /**
     * Returns the raw JSON value of [emptyRollupValue].
     *
     * Unlike [emptyRollupValue], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("emptyRollupValue")
    @ExcludeMissing
    fun _emptyRollupValue(): JsonField<String> = emptyRollupValue

    /**
     * Returns the raw JSON value of [sourceCompareByPropertyName].
     *
     * Unlike [sourceCompareByPropertyName], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("sourceCompareByPropertyName")
    @ExcludeMissing
    fun _sourceCompareByPropertyName(): JsonField<String> = sourceCompareByPropertyName

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
         * Returns a mutable builder for constructing an instance of [RollupExpression].
         *
         * The following fields are required:
         * ```java
         * .associationTypes()
         * .rollupOperator()
         * .sourceObjectTypeId()
         * .sourcePropertyName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RollupExpression]. */
    class Builder internal constructor() {

        private var associationTypes: JsonField<MutableList<AssociationSpec>>? = null
        private var rollupOperator: JsonField<String>? = null
        private var sourceObjectTypeId: JsonField<String>? = null
        private var sourcePropertyName: JsonField<String>? = null
        private var conditionalExpression: JsonField<ConditionalExpression> = JsonMissing.of()
        private var conditionalFormula: JsonField<String> = JsonMissing.of()
        private var emptyRollupValue: JsonField<String> = JsonMissing.of()
        private var sourceCompareByPropertyName: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(rollupExpression: RollupExpression) = apply {
            associationTypes = rollupExpression.associationTypes.map { it.toMutableList() }
            rollupOperator = rollupExpression.rollupOperator
            sourceObjectTypeId = rollupExpression.sourceObjectTypeId
            sourcePropertyName = rollupExpression.sourcePropertyName
            conditionalExpression = rollupExpression.conditionalExpression
            conditionalFormula = rollupExpression.conditionalFormula
            emptyRollupValue = rollupExpression.emptyRollupValue
            sourceCompareByPropertyName = rollupExpression.sourceCompareByPropertyName
            additionalProperties = rollupExpression.additionalProperties.toMutableMap()
        }

        fun associationTypes(associationTypes: List<AssociationSpec>) =
            associationTypes(JsonField.of(associationTypes))

        /**
         * Sets [Builder.associationTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.associationTypes] with a well-typed
         * `List<AssociationSpec>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun associationTypes(associationTypes: JsonField<List<AssociationSpec>>) = apply {
            this.associationTypes = associationTypes.map { it.toMutableList() }
        }

        /**
         * Adds a single [AssociationSpec] to [associationTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAssociationType(associationType: AssociationSpec) = apply {
            associationTypes =
                (associationTypes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("associationTypes", it).add(associationType)
                }
        }

        fun rollupOperator(rollupOperator: String) = rollupOperator(JsonField.of(rollupOperator))

        /**
         * Sets [Builder.rollupOperator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rollupOperator] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rollupOperator(rollupOperator: JsonField<String>) = apply {
            this.rollupOperator = rollupOperator
        }

        fun sourceObjectTypeId(sourceObjectTypeId: String) =
            sourceObjectTypeId(JsonField.of(sourceObjectTypeId))

        /**
         * Sets [Builder.sourceObjectTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceObjectTypeId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sourceObjectTypeId(sourceObjectTypeId: JsonField<String>) = apply {
            this.sourceObjectTypeId = sourceObjectTypeId
        }

        fun sourcePropertyName(sourcePropertyName: String) =
            sourcePropertyName(JsonField.of(sourcePropertyName))

        /**
         * Sets [Builder.sourcePropertyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourcePropertyName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sourcePropertyName(sourcePropertyName: JsonField<String>) = apply {
            this.sourcePropertyName = sourcePropertyName
        }

        fun conditionalExpression(conditionalExpression: ConditionalExpression) =
            conditionalExpression(JsonField.of(conditionalExpression))

        /**
         * Sets [Builder.conditionalExpression] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conditionalExpression] with a well-typed
         * [ConditionalExpression] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun conditionalExpression(conditionalExpression: JsonField<ConditionalExpression>) = apply {
            this.conditionalExpression = conditionalExpression
        }

        fun conditionalFormula(conditionalFormula: String) =
            conditionalFormula(JsonField.of(conditionalFormula))

        /**
         * Sets [Builder.conditionalFormula] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conditionalFormula] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun conditionalFormula(conditionalFormula: JsonField<String>) = apply {
            this.conditionalFormula = conditionalFormula
        }

        fun emptyRollupValue(emptyRollupValue: String) =
            emptyRollupValue(JsonField.of(emptyRollupValue))

        /**
         * Sets [Builder.emptyRollupValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emptyRollupValue] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun emptyRollupValue(emptyRollupValue: JsonField<String>) = apply {
            this.emptyRollupValue = emptyRollupValue
        }

        fun sourceCompareByPropertyName(sourceCompareByPropertyName: String) =
            sourceCompareByPropertyName(JsonField.of(sourceCompareByPropertyName))

        /**
         * Sets [Builder.sourceCompareByPropertyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceCompareByPropertyName] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun sourceCompareByPropertyName(sourceCompareByPropertyName: JsonField<String>) = apply {
            this.sourceCompareByPropertyName = sourceCompareByPropertyName
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
         * Returns an immutable instance of [RollupExpression].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .associationTypes()
         * .rollupOperator()
         * .sourceObjectTypeId()
         * .sourcePropertyName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RollupExpression =
            RollupExpression(
                checkRequired("associationTypes", associationTypes).map { it.toImmutable() },
                checkRequired("rollupOperator", rollupOperator),
                checkRequired("sourceObjectTypeId", sourceObjectTypeId),
                checkRequired("sourcePropertyName", sourcePropertyName),
                conditionalExpression,
                conditionalFormula,
                emptyRollupValue,
                sourceCompareByPropertyName,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RollupExpression = apply {
        if (validated) {
            return@apply
        }

        associationTypes().forEach { it.validate() }
        rollupOperator()
        sourceObjectTypeId()
        sourcePropertyName()
        conditionalExpression().ifPresent { it.validate() }
        conditionalFormula()
        emptyRollupValue()
        sourceCompareByPropertyName()
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
        (associationTypes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (rollupOperator.asKnown().isPresent) 1 else 0) +
            (if (sourceObjectTypeId.asKnown().isPresent) 1 else 0) +
            (if (sourcePropertyName.asKnown().isPresent) 1 else 0) +
            (conditionalExpression.asKnown().getOrNull()?.validity() ?: 0) +
            (if (conditionalFormula.asKnown().isPresent) 1 else 0) +
            (if (emptyRollupValue.asKnown().isPresent) 1 else 0) +
            (if (sourceCompareByPropertyName.asKnown().isPresent) 1 else 0)

    class ConditionalExpression
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
             * Returns a mutable builder for constructing an instance of [ConditionalExpression].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ConditionalExpression]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(conditionalExpression: ConditionalExpression) = apply {
                additionalProperties = conditionalExpression.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ConditionalExpression].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ConditionalExpression =
                ConditionalExpression(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): ConditionalExpression = apply {
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

            return other is ConditionalExpression &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ConditionalExpression{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RollupExpression &&
            associationTypes == other.associationTypes &&
            rollupOperator == other.rollupOperator &&
            sourceObjectTypeId == other.sourceObjectTypeId &&
            sourcePropertyName == other.sourcePropertyName &&
            conditionalExpression == other.conditionalExpression &&
            conditionalFormula == other.conditionalFormula &&
            emptyRollupValue == other.emptyRollupValue &&
            sourceCompareByPropertyName == other.sourceCompareByPropertyName &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            associationTypes,
            rollupOperator,
            sourceObjectTypeId,
            sourcePropertyName,
            conditionalExpression,
            conditionalFormula,
            emptyRollupValue,
            sourceCompareByPropertyName,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RollupExpression{associationTypes=$associationTypes, rollupOperator=$rollupOperator, sourceObjectTypeId=$sourceObjectTypeId, sourcePropertyName=$sourcePropertyName, conditionalExpression=$conditionalExpression, conditionalFormula=$conditionalFormula, emptyRollupValue=$emptyRollupValue, sourceCompareByPropertyName=$sourceCompareByPropertyName, additionalProperties=$additionalProperties}"
}
