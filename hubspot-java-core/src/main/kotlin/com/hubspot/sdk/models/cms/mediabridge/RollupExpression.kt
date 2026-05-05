// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

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
import com.hubspot.sdk.models.AssociationSpec
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class RollupExpression
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val associationTypes: JsonField<List<AssociationSpec>>,
    private val rollupOperator: JsonField<RollupOperator>,
    private val sourceObjectTypeId: JsonField<String>,
    private val sourcePropertyName: JsonField<String>,
    private val conditionalExpression: JsonValue,
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
        rollupOperator: JsonField<RollupOperator> = JsonMissing.of(),
        @JsonProperty("sourceObjectTypeId")
        @ExcludeMissing
        sourceObjectTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourcePropertyName")
        @ExcludeMissing
        sourcePropertyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("conditionalExpression")
        @ExcludeMissing
        conditionalExpression: JsonValue = JsonMissing.of(),
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
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun associationTypes(): List<AssociationSpec> = associationTypes.getRequired("associationTypes")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rollupOperator(): RollupOperator = rollupOperator.getRequired("rollupOperator")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sourceObjectTypeId(): String = sourceObjectTypeId.getRequired("sourceObjectTypeId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sourcePropertyName(): String = sourcePropertyName.getRequired("sourcePropertyName")

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = rollupExpression.conditionalExpression().convert(MyClass.class);
     * ```
     */
    @JsonProperty("conditionalExpression")
    @ExcludeMissing
    fun _conditionalExpression(): JsonValue = conditionalExpression

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun conditionalFormula(): Optional<String> =
        conditionalFormula.getOptional("conditionalFormula")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun emptyRollupValue(): Optional<String> = emptyRollupValue.getOptional("emptyRollupValue")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
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
    fun _rollupOperator(): JsonField<RollupOperator> = rollupOperator

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
        private var rollupOperator: JsonField<RollupOperator>? = null
        private var sourceObjectTypeId: JsonField<String>? = null
        private var sourcePropertyName: JsonField<String>? = null
        private var conditionalExpression: JsonValue = JsonMissing.of()
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

        fun rollupOperator(rollupOperator: RollupOperator) =
            rollupOperator(JsonField.of(rollupOperator))

        /**
         * Sets [Builder.rollupOperator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rollupOperator] with a well-typed [RollupOperator] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rollupOperator(rollupOperator: JsonField<RollupOperator>) = apply {
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

        fun conditionalExpression(conditionalExpression: JsonValue) = apply {
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

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): RollupExpression = apply {
        if (validated) {
            return@apply
        }

        associationTypes().forEach { it.validate() }
        rollupOperator().validate()
        sourceObjectTypeId()
        sourcePropertyName()
        conditionalFormula()
        emptyRollupValue()
        sourceCompareByPropertyName()
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
        (associationTypes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (rollupOperator.asKnown().getOrNull()?.validity() ?: 0) +
            (if (sourceObjectTypeId.asKnown().isPresent) 1 else 0) +
            (if (sourcePropertyName.asKnown().isPresent) 1 else 0) +
            (if (conditionalFormula.asKnown().isPresent) 1 else 0) +
            (if (emptyRollupValue.asKnown().isPresent) 1 else 0) +
            (if (sourceCompareByPropertyName.asKnown().isPresent) 1 else 0)

    class RollupOperator @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val AVERAGE = of("AVERAGE")

            @JvmField val COUNT = of("COUNT")

            @JvmField val EARLIEST_VALUE = of("EARLIEST_VALUE")

            @JvmField val LATEST_VALUE = of("LATEST_VALUE")

            @JvmField val MAX = of("MAX")

            @JvmField val MAX_BY = of("MAX_BY")

            @JvmField val MIN = of("MIN")

            @JvmField val MIN_BY = of("MIN_BY")

            @JvmField val REFERENCED_ID_SET = of("REFERENCED_ID_SET")

            @JvmField val REFERENCED_STRING_SET = of("REFERENCED_STRING_SET")

            @JvmField
            val REFERENCED_STRING_SET_INTERSECTION = of("REFERENCED_STRING_SET_INTERSECTION")

            @JvmField val SUM = of("SUM")

            @JvmField val SYNC_MAX_BY = of("SYNC_MAX_BY")

            @JvmField val SYNC_MIN_BY = of("SYNC_MIN_BY")

            @JvmField val SYNC_VALUE = of("SYNC_VALUE")

            @JvmField val UNKNOWN_ROLLUP_OPERATOR = of("UNKNOWN_ROLLUP_OPERATOR")

            @JvmStatic fun of(value: String) = RollupOperator(JsonField.of(value))
        }

        /** An enum containing [RollupOperator]'s known values. */
        enum class Known {
            AVERAGE,
            COUNT,
            EARLIEST_VALUE,
            LATEST_VALUE,
            MAX,
            MAX_BY,
            MIN,
            MIN_BY,
            REFERENCED_ID_SET,
            REFERENCED_STRING_SET,
            REFERENCED_STRING_SET_INTERSECTION,
            SUM,
            SYNC_MAX_BY,
            SYNC_MIN_BY,
            SYNC_VALUE,
            UNKNOWN_ROLLUP_OPERATOR,
        }

        /**
         * An enum containing [RollupOperator]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RollupOperator] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AVERAGE,
            COUNT,
            EARLIEST_VALUE,
            LATEST_VALUE,
            MAX,
            MAX_BY,
            MIN,
            MIN_BY,
            REFERENCED_ID_SET,
            REFERENCED_STRING_SET,
            REFERENCED_STRING_SET_INTERSECTION,
            SUM,
            SYNC_MAX_BY,
            SYNC_MIN_BY,
            SYNC_VALUE,
            UNKNOWN_ROLLUP_OPERATOR,
            /**
             * An enum member indicating that [RollupOperator] was instantiated with an unknown
             * value.
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
                AVERAGE -> Value.AVERAGE
                COUNT -> Value.COUNT
                EARLIEST_VALUE -> Value.EARLIEST_VALUE
                LATEST_VALUE -> Value.LATEST_VALUE
                MAX -> Value.MAX
                MAX_BY -> Value.MAX_BY
                MIN -> Value.MIN
                MIN_BY -> Value.MIN_BY
                REFERENCED_ID_SET -> Value.REFERENCED_ID_SET
                REFERENCED_STRING_SET -> Value.REFERENCED_STRING_SET
                REFERENCED_STRING_SET_INTERSECTION -> Value.REFERENCED_STRING_SET_INTERSECTION
                SUM -> Value.SUM
                SYNC_MAX_BY -> Value.SYNC_MAX_BY
                SYNC_MIN_BY -> Value.SYNC_MIN_BY
                SYNC_VALUE -> Value.SYNC_VALUE
                UNKNOWN_ROLLUP_OPERATOR -> Value.UNKNOWN_ROLLUP_OPERATOR
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
                AVERAGE -> Known.AVERAGE
                COUNT -> Known.COUNT
                EARLIEST_VALUE -> Known.EARLIEST_VALUE
                LATEST_VALUE -> Known.LATEST_VALUE
                MAX -> Known.MAX
                MAX_BY -> Known.MAX_BY
                MIN -> Known.MIN
                MIN_BY -> Known.MIN_BY
                REFERENCED_ID_SET -> Known.REFERENCED_ID_SET
                REFERENCED_STRING_SET -> Known.REFERENCED_STRING_SET
                REFERENCED_STRING_SET_INTERSECTION -> Known.REFERENCED_STRING_SET_INTERSECTION
                SUM -> Known.SUM
                SYNC_MAX_BY -> Known.SYNC_MAX_BY
                SYNC_MIN_BY -> Known.SYNC_MIN_BY
                SYNC_VALUE -> Known.SYNC_VALUE
                UNKNOWN_ROLLUP_OPERATOR -> Known.UNKNOWN_ROLLUP_OPERATOR
                else -> throw HubSpotInvalidDataException("Unknown RollupOperator: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): RollupOperator = apply {
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

            return other is RollupOperator && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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
