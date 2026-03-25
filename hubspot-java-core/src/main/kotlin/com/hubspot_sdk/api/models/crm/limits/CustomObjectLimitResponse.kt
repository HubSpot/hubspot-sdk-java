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

class CustomObjectLimitResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val limit: JsonField<Long>,
    private val percentage: JsonField<Double>,
    private val usage: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("limit") @ExcludeMissing limit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("percentage")
        @ExcludeMissing
        percentage: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("usage") @ExcludeMissing usage: JsonField<Long> = JsonMissing.of(),
    ) : this(limit, percentage, usage, mutableMapOf())

    /**
     * The maximum number of custom objects allowed.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun limit(): Long = limit.getRequired("limit")

    /**
     * The percentage of the custom object limit that is currently used.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun percentage(): Double = percentage.getRequired("percentage")

    /**
     * The current number of custom objects used.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun usage(): Long = usage.getRequired("usage")

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
         * Returns a mutable builder for constructing an instance of [CustomObjectLimitResponse].
         *
         * The following fields are required:
         * ```java
         * .limit()
         * .percentage()
         * .usage()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomObjectLimitResponse]. */
    class Builder internal constructor() {

        private var limit: JsonField<Long>? = null
        private var percentage: JsonField<Double>? = null
        private var usage: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customObjectLimitResponse: CustomObjectLimitResponse) = apply {
            limit = customObjectLimitResponse.limit
            percentage = customObjectLimitResponse.percentage
            usage = customObjectLimitResponse.usage
            additionalProperties = customObjectLimitResponse.additionalProperties.toMutableMap()
        }

        /** The maximum number of custom objects allowed. */
        fun limit(limit: Long) = limit(JsonField.of(limit))

        /**
         * Sets [Builder.limit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun limit(limit: JsonField<Long>) = apply { this.limit = limit }

        /** The percentage of the custom object limit that is currently used. */
        fun percentage(percentage: Double) = percentage(JsonField.of(percentage))

        /**
         * Sets [Builder.percentage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.percentage] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun percentage(percentage: JsonField<Double>) = apply { this.percentage = percentage }

        /** The current number of custom objects used. */
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
         * Returns an immutable instance of [CustomObjectLimitResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .limit()
         * .percentage()
         * .usage()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomObjectLimitResponse =
            CustomObjectLimitResponse(
                checkRequired("limit", limit),
                checkRequired("percentage", percentage),
                checkRequired("usage", usage),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CustomObjectLimitResponse = apply {
        if (validated) {
            return@apply
        }

        limit()
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
        (if (limit.asKnown().isPresent) 1 else 0) +
            (if (percentage.asKnown().isPresent) 1 else 0) +
            (if (usage.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomObjectLimitResponse &&
            limit == other.limit &&
            percentage == other.percentage &&
            usage == other.usage &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(limit, percentage, usage, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomObjectLimitResponse{limit=$limit, percentage=$percentage, usage=$usage, additionalProperties=$additionalProperties}"
}
