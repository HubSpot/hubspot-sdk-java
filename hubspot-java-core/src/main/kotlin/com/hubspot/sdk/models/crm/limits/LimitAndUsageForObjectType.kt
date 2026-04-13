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
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects

class LimitAndUsageForObjectType
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val limit: JsonField<Int>,
    private val objectTypeId: JsonField<String>,
    private val percentage: JsonField<Double>,
    private val pluralLabel: JsonField<String>,
    private val singularLabel: JsonField<String>,
    private val usage: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("limit") @ExcludeMissing limit: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("objectTypeId")
        @ExcludeMissing
        objectTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("percentage")
        @ExcludeMissing
        percentage: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("pluralLabel")
        @ExcludeMissing
        pluralLabel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("singularLabel")
        @ExcludeMissing
        singularLabel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("usage") @ExcludeMissing usage: JsonField<Int> = JsonMissing.of(),
    ) : this(limit, objectTypeId, percentage, pluralLabel, singularLabel, usage, mutableMapOf())

    /**
     * The maximum allowed count for the object type.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun limit(): Int = limit.getRequired("limit")

    /**
     * The unique identifier for the object type.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectTypeId(): String = objectTypeId.getRequired("objectTypeId")

    /**
     * The percentage of the limit that has been used.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun percentage(): Double = percentage.getRequired("percentage")

    /**
     * The plural label for the object type.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pluralLabel(): String = pluralLabel.getRequired("pluralLabel")

    /**
     * The singular label for the object type.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun singularLabel(): String = singularLabel.getRequired("singularLabel")

    /**
     * The current usage count for the object type.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun usage(): Int = usage.getRequired("usage")

    /**
     * Returns the raw JSON value of [limit].
     *
     * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Int> = limit

    /**
     * Returns the raw JSON value of [objectTypeId].
     *
     * Unlike [objectTypeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectTypeId")
    @ExcludeMissing
    fun _objectTypeId(): JsonField<String> = objectTypeId

    /**
     * Returns the raw JSON value of [percentage].
     *
     * Unlike [percentage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("percentage") @ExcludeMissing fun _percentage(): JsonField<Double> = percentage

    /**
     * Returns the raw JSON value of [pluralLabel].
     *
     * Unlike [pluralLabel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pluralLabel") @ExcludeMissing fun _pluralLabel(): JsonField<String> = pluralLabel

    /**
     * Returns the raw JSON value of [singularLabel].
     *
     * Unlike [singularLabel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("singularLabel")
    @ExcludeMissing
    fun _singularLabel(): JsonField<String> = singularLabel

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
         * Returns a mutable builder for constructing an instance of [LimitAndUsageForObjectType].
         *
         * The following fields are required:
         * ```java
         * .limit()
         * .objectTypeId()
         * .percentage()
         * .pluralLabel()
         * .singularLabel()
         * .usage()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LimitAndUsageForObjectType]. */
    class Builder internal constructor() {

        private var limit: JsonField<Int>? = null
        private var objectTypeId: JsonField<String>? = null
        private var percentage: JsonField<Double>? = null
        private var pluralLabel: JsonField<String>? = null
        private var singularLabel: JsonField<String>? = null
        private var usage: JsonField<Int>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(limitAndUsageForObjectType: LimitAndUsageForObjectType) = apply {
            limit = limitAndUsageForObjectType.limit
            objectTypeId = limitAndUsageForObjectType.objectTypeId
            percentage = limitAndUsageForObjectType.percentage
            pluralLabel = limitAndUsageForObjectType.pluralLabel
            singularLabel = limitAndUsageForObjectType.singularLabel
            usage = limitAndUsageForObjectType.usage
            additionalProperties = limitAndUsageForObjectType.additionalProperties.toMutableMap()
        }

        /** The maximum allowed count for the object type. */
        fun limit(limit: Int) = limit(JsonField.of(limit))

        /**
         * Sets [Builder.limit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limit] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun limit(limit: JsonField<Int>) = apply { this.limit = limit }

        /** The unique identifier for the object type. */
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

        /** The percentage of the limit that has been used. */
        fun percentage(percentage: Double) = percentage(JsonField.of(percentage))

        /**
         * Sets [Builder.percentage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.percentage] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun percentage(percentage: JsonField<Double>) = apply { this.percentage = percentage }

        /** The plural label for the object type. */
        fun pluralLabel(pluralLabel: String) = pluralLabel(JsonField.of(pluralLabel))

        /**
         * Sets [Builder.pluralLabel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pluralLabel] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pluralLabel(pluralLabel: JsonField<String>) = apply { this.pluralLabel = pluralLabel }

        /** The singular label for the object type. */
        fun singularLabel(singularLabel: String) = singularLabel(JsonField.of(singularLabel))

        /**
         * Sets [Builder.singularLabel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.singularLabel] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun singularLabel(singularLabel: JsonField<String>) = apply {
            this.singularLabel = singularLabel
        }

        /** The current usage count for the object type. */
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
         * Returns an immutable instance of [LimitAndUsageForObjectType].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .limit()
         * .objectTypeId()
         * .percentage()
         * .pluralLabel()
         * .singularLabel()
         * .usage()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LimitAndUsageForObjectType =
            LimitAndUsageForObjectType(
                checkRequired("limit", limit),
                checkRequired("objectTypeId", objectTypeId),
                checkRequired("percentage", percentage),
                checkRequired("pluralLabel", pluralLabel),
                checkRequired("singularLabel", singularLabel),
                checkRequired("usage", usage),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LimitAndUsageForObjectType = apply {
        if (validated) {
            return@apply
        }

        limit()
        objectTypeId()
        percentage()
        pluralLabel()
        singularLabel()
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
        (if (limit.asKnown().isPresent) 1 else 0) +
            (if (objectTypeId.asKnown().isPresent) 1 else 0) +
            (if (percentage.asKnown().isPresent) 1 else 0) +
            (if (pluralLabel.asKnown().isPresent) 1 else 0) +
            (if (singularLabel.asKnown().isPresent) 1 else 0) +
            (if (usage.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LimitAndUsageForObjectType &&
            limit == other.limit &&
            objectTypeId == other.objectTypeId &&
            percentage == other.percentage &&
            pluralLabel == other.pluralLabel &&
            singularLabel == other.singularLabel &&
            usage == other.usage &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            limit,
            objectTypeId,
            percentage,
            pluralLabel,
            singularLabel,
            usage,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LimitAndUsageForObjectType{limit=$limit, objectTypeId=$objectTypeId, percentage=$percentage, pluralLabel=$pluralLabel, singularLabel=$singularLabel, usage=$usage, additionalProperties=$additionalProperties}"
}
