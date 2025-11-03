// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.limits

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
import com.hubspot_sdk.api.models.crm.objects.schemas.ObjectsSchemasObjectTypeDefinition
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class AssociationLabelLimitResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val allLabels: JsonField<List<String>>,
    private val fromObjectType: JsonField<ObjectsSchemasObjectTypeDefinition>,
    private val limit: JsonField<Int>,
    private val percentage: JsonField<Double>,
    private val toObjectType: JsonField<ObjectsSchemasObjectTypeDefinition>,
    private val usage: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("allLabels")
        @ExcludeMissing
        allLabels: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("fromObjectType")
        @ExcludeMissing
        fromObjectType: JsonField<ObjectsSchemasObjectTypeDefinition> = JsonMissing.of(),
        @JsonProperty("limit") @ExcludeMissing limit: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("percentage")
        @ExcludeMissing
        percentage: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("toObjectType")
        @ExcludeMissing
        toObjectType: JsonField<ObjectsSchemasObjectTypeDefinition> = JsonMissing.of(),
        @JsonProperty("usage") @ExcludeMissing usage: JsonField<Int> = JsonMissing.of(),
    ) : this(allLabels, fromObjectType, limit, percentage, toObjectType, usage, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun allLabels(): List<String> = allLabels.getRequired("allLabels")

    /**
     * Defines an object type.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fromObjectType(): ObjectsSchemasObjectTypeDefinition =
        fromObjectType.getRequired("fromObjectType")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun limit(): Int = limit.getRequired("limit")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun percentage(): Double = percentage.getRequired("percentage")

    /**
     * Defines an object type.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun toObjectType(): ObjectsSchemasObjectTypeDefinition =
        toObjectType.getRequired("toObjectType")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun usage(): Int = usage.getRequired("usage")

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
    fun _fromObjectType(): JsonField<ObjectsSchemasObjectTypeDefinition> = fromObjectType

    /**
     * Returns the raw JSON value of [limit].
     *
     * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Int> = limit

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
    fun _toObjectType(): JsonField<ObjectsSchemasObjectTypeDefinition> = toObjectType

    /**
     * Returns the raw JSON value of [usage].
     *
     * Unlike [usage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("usage") @ExcludeMissing fun _usage(): JsonField<Int> = usage

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
        private var fromObjectType: JsonField<ObjectsSchemasObjectTypeDefinition>? = null
        private var limit: JsonField<Int>? = null
        private var percentage: JsonField<Double>? = null
        private var toObjectType: JsonField<ObjectsSchemasObjectTypeDefinition>? = null
        private var usage: JsonField<Int>? = null
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

        /** Defines an object type. */
        fun fromObjectType(fromObjectType: ObjectsSchemasObjectTypeDefinition) =
            fromObjectType(JsonField.of(fromObjectType))

        /**
         * Sets [Builder.fromObjectType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fromObjectType] with a well-typed
         * [ObjectsSchemasObjectTypeDefinition] value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun fromObjectType(fromObjectType: JsonField<ObjectsSchemasObjectTypeDefinition>) = apply {
            this.fromObjectType = fromObjectType
        }

        fun limit(limit: Int) = limit(JsonField.of(limit))

        /**
         * Sets [Builder.limit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limit] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun limit(limit: JsonField<Int>) = apply { this.limit = limit }

        fun percentage(percentage: Double) = percentage(JsonField.of(percentage))

        /**
         * Sets [Builder.percentage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.percentage] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun percentage(percentage: JsonField<Double>) = apply { this.percentage = percentage }

        /** Defines an object type. */
        fun toObjectType(toObjectType: ObjectsSchemasObjectTypeDefinition) =
            toObjectType(JsonField.of(toObjectType))

        /**
         * Sets [Builder.toObjectType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toObjectType] with a well-typed
         * [ObjectsSchemasObjectTypeDefinition] value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun toObjectType(toObjectType: JsonField<ObjectsSchemasObjectTypeDefinition>) = apply {
            this.toObjectType = toObjectType
        }

        fun usage(usage: Int) = usage(JsonField.of(usage))

        /**
         * Sets [Builder.usage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usage] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun usage(usage: JsonField<Int>) = apply { this.usage = usage }

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
