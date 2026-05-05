// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.limits

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

class AssociationLabelLimitResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val allLabels: JsonField<List<String>>,
    private val fromObjectType: JsonField<LimitsObjectTypeDefinition>,
    private val limit: JsonField<Long>,
    private val percentage: JsonField<Double>,
    private val toObjectType: JsonField<LimitsObjectTypeDefinition>,
    private val usage: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("allLabels")
        @ExcludeMissing
        allLabels: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("fromObjectType")
        @ExcludeMissing
        fromObjectType: JsonField<LimitsObjectTypeDefinition> = JsonMissing.of(),
        @JsonProperty("limit") @ExcludeMissing limit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("percentage")
        @ExcludeMissing
        percentage: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("toObjectType")
        @ExcludeMissing
        toObjectType: JsonField<LimitsObjectTypeDefinition> = JsonMissing.of(),
        @JsonProperty("usage") @ExcludeMissing usage: JsonField<Long> = JsonMissing.of(),
    ) : this(allLabels, fromObjectType, limit, percentage, toObjectType, usage, mutableMapOf())

    /**
     * A list of all association labels.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun allLabels(): List<String> = allLabels.getRequired("allLabels")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fromObjectType(): LimitsObjectTypeDefinition = fromObjectType.getRequired("fromObjectType")

    /**
     * The maximum number of association labels allowed.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun limit(): Long = limit.getRequired("limit")

    /**
     * The percentage of the association label limit that has been used.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun percentage(): Double = percentage.getRequired("percentage")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun toObjectType(): LimitsObjectTypeDefinition = toObjectType.getRequired("toObjectType")

    /**
     * The current number of association labels used.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun usage(): Long = usage.getRequired("usage")

    /**
     * Returns the raw JSON value of [allLabels].
     *
     * Unlike [allLabels], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("allLabels") @ExcludeMissing fun _allLabels(): JsonField<List<String>> = allLabels

    /**
     * Returns the raw JSON value of [fromObjectType].
     *
     * Unlike [fromObjectType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fromObjectType")
    @ExcludeMissing
    fun _fromObjectType(): JsonField<LimitsObjectTypeDefinition> = fromObjectType

    /**
     * Returns the raw JSON value of [limit].
     *
     * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Long> = limit

    /**
     * Returns the raw JSON value of [percentage].
     *
     * Unlike [percentage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("percentage") @ExcludeMissing fun _percentage(): JsonField<Double> = percentage

    /**
     * Returns the raw JSON value of [toObjectType].
     *
     * Unlike [toObjectType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("toObjectType")
    @ExcludeMissing
    fun _toObjectType(): JsonField<LimitsObjectTypeDefinition> = toObjectType

    /**
     * Returns the raw JSON value of [usage].
     *
     * Unlike [usage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("usage") @ExcludeMissing fun _usage(): JsonField<Long> = usage

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
         * Returns a mutable builder for constructing an instance of
         * [AssociationLabelLimitResponse].
         *
         * The following fields are required:
         * ```java
         * .allLabels()
         * .fromObjectType()
         * .limit()
         * .percentage()
         * .toObjectType()
         * .usage()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AssociationLabelLimitResponse]. */
    class Builder internal constructor() {

        private var allLabels: JsonField<MutableList<String>>? = null
        private var fromObjectType: JsonField<LimitsObjectTypeDefinition>? = null
        private var limit: JsonField<Long>? = null
        private var percentage: JsonField<Double>? = null
        private var toObjectType: JsonField<LimitsObjectTypeDefinition>? = null
        private var usage: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(associationLabelLimitResponse: AssociationLabelLimitResponse) = apply {
            allLabels = associationLabelLimitResponse.allLabels.map { it.toMutableList() }
            fromObjectType = associationLabelLimitResponse.fromObjectType
            limit = associationLabelLimitResponse.limit
            percentage = associationLabelLimitResponse.percentage
            toObjectType = associationLabelLimitResponse.toObjectType
            usage = associationLabelLimitResponse.usage
            additionalProperties = associationLabelLimitResponse.additionalProperties.toMutableMap()
        }

        /** A list of all association labels. */
        fun allLabels(allLabels: List<String>) = allLabels(JsonField.of(allLabels))

        /**
         * Sets [Builder.allLabels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allLabels] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun allLabels(allLabels: JsonField<List<String>>) = apply {
            this.allLabels = allLabels.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [allLabels].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAllLabel(allLabel: String) = apply {
            allLabels =
                (allLabels ?: JsonField.of(mutableListOf())).also {
                    checkKnown("allLabels", it).add(allLabel)
                }
        }

        fun fromObjectType(fromObjectType: LimitsObjectTypeDefinition) =
            fromObjectType(JsonField.of(fromObjectType))

        /**
         * Sets [Builder.fromObjectType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fromObjectType] with a well-typed
         * [LimitsObjectTypeDefinition] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun fromObjectType(fromObjectType: JsonField<LimitsObjectTypeDefinition>) = apply {
            this.fromObjectType = fromObjectType
        }

        /** The maximum number of association labels allowed. */
        fun limit(limit: Long) = limit(JsonField.of(limit))

        /**
         * Sets [Builder.limit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun limit(limit: JsonField<Long>) = apply { this.limit = limit }

        /** The percentage of the association label limit that has been used. */
        fun percentage(percentage: Double) = percentage(JsonField.of(percentage))

        /**
         * Sets [Builder.percentage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.percentage] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun percentage(percentage: JsonField<Double>) = apply { this.percentage = percentage }

        fun toObjectType(toObjectType: LimitsObjectTypeDefinition) =
            toObjectType(JsonField.of(toObjectType))

        /**
         * Sets [Builder.toObjectType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toObjectType] with a well-typed
         * [LimitsObjectTypeDefinition] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun toObjectType(toObjectType: JsonField<LimitsObjectTypeDefinition>) = apply {
            this.toObjectType = toObjectType
        }

        /** The current number of association labels used. */
        fun usage(usage: Long) = usage(JsonField.of(usage))

        /**
         * Sets [Builder.usage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usage] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun usage(usage: JsonField<Long>) = apply { this.usage = usage }

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
         * Returns an immutable instance of [AssociationLabelLimitResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .allLabels()
         * .fromObjectType()
         * .limit()
         * .percentage()
         * .toObjectType()
         * .usage()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AssociationLabelLimitResponse =
            AssociationLabelLimitResponse(
                checkRequired("allLabels", allLabels).map { it.toImmutable() },
                checkRequired("fromObjectType", fromObjectType),
                checkRequired("limit", limit),
                checkRequired("percentage", percentage),
                checkRequired("toObjectType", toObjectType),
                checkRequired("usage", usage),
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
    fun validate(): AssociationLabelLimitResponse = apply {
        if (validated) {
            return@apply
        }

        allLabels()
        fromObjectType().validate()
        limit()
        percentage()
        toObjectType().validate()
        usage()
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
        (allLabels.asKnown().getOrNull()?.size ?: 0) +
            (fromObjectType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (limit.asKnown().isPresent) 1 else 0) +
            (if (percentage.asKnown().isPresent) 1 else 0) +
            (toObjectType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (usage.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AssociationLabelLimitResponse &&
            allLabels == other.allLabels &&
            fromObjectType == other.fromObjectType &&
            limit == other.limit &&
            percentage == other.percentage &&
            toObjectType == other.toObjectType &&
            usage == other.usage &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            allLabels,
            fromObjectType,
            limit,
            percentage,
            toObjectType,
            usage,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AssociationLabelLimitResponse{allLabels=$allLabels, fromObjectType=$fromObjectType, limit=$limit, percentage=$percentage, toObjectType=$toObjectType, usage=$usage, additionalProperties=$additionalProperties}"
}
