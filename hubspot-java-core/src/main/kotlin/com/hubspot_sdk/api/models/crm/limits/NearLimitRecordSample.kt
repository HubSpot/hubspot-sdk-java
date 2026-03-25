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
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects

class NearLimitRecordSample
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val label: JsonField<String>,
    private val objectId: JsonField<Int>,
    private val percentage: JsonField<Double>,
    private val usage: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("objectId") @ExcludeMissing objectId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("percentage")
        @ExcludeMissing
        percentage: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("usage") @ExcludeMissing usage: JsonField<Int> = JsonMissing.of(),
    ) : this(label, objectId, percentage, usage, mutableMapOf())

    /**
     * The primary identifier of the record.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun label(): String = label.getRequired("label")

    /**
     * The unique identifier for the object.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectId(): Int = objectId.getRequired("objectId")

    /**
     * The percentage of the limit that has been used.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun percentage(): Double = percentage.getRequired("percentage")

    /**
     * The number of records currently in use.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun usage(): Int = usage.getRequired("usage")

    /**
     * Returns the raw JSON value of [label].
     *
     * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

    /**
     * Returns the raw JSON value of [objectId].
     *
     * Unlike [objectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectId") @ExcludeMissing fun _objectId(): JsonField<Int> = objectId

    /**
     * Returns the raw JSON value of [percentage].
     *
     * Unlike [percentage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("percentage") @ExcludeMissing fun _percentage(): JsonField<Double> = percentage

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
         * Returns a mutable builder for constructing an instance of [NearLimitRecordSample].
         *
         * The following fields are required:
         * ```java
         * .label()
         * .objectId()
         * .percentage()
         * .usage()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NearLimitRecordSample]. */
    class Builder internal constructor() {

        private var label: JsonField<String>? = null
        private var objectId: JsonField<Int>? = null
        private var percentage: JsonField<Double>? = null
        private var usage: JsonField<Int>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(nearLimitRecordSample: NearLimitRecordSample) = apply {
            label = nearLimitRecordSample.label
            objectId = nearLimitRecordSample.objectId
            percentage = nearLimitRecordSample.percentage
            usage = nearLimitRecordSample.usage
            additionalProperties = nearLimitRecordSample.additionalProperties.toMutableMap()
        }

        /** The primary identifier of the record. */
        fun label(label: String) = label(JsonField.of(label))

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: JsonField<String>) = apply { this.label = label }

        /** The unique identifier for the object. */
        fun objectId(objectId: Int) = objectId(JsonField.of(objectId))

        /**
         * Sets [Builder.objectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun objectId(objectId: JsonField<Int>) = apply { this.objectId = objectId }

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

        /** The number of records currently in use. */
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
         * Returns an immutable instance of [NearLimitRecordSample].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .label()
         * .objectId()
         * .percentage()
         * .usage()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NearLimitRecordSample =
            NearLimitRecordSample(
                checkRequired("label", label),
                checkRequired("objectId", objectId),
                checkRequired("percentage", percentage),
                checkRequired("usage", usage),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): NearLimitRecordSample = apply {
        if (validated) {
            return@apply
        }

        label()
        objectId()
        percentage()
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
        (if (label.asKnown().isPresent) 1 else 0) +
            (if (objectId.asKnown().isPresent) 1 else 0) +
            (if (percentage.asKnown().isPresent) 1 else 0) +
            (if (usage.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NearLimitRecordSample &&
            label == other.label &&
            objectId == other.objectId &&
            percentage == other.percentage &&
            usage == other.usage &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(label, objectId, percentage, usage, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NearLimitRecordSample{label=$label, objectId=$objectId, percentage=$percentage, usage=$usage, additionalProperties=$additionalProperties}"
}
