// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.emails

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
import kotlin.jvm.optionals.getOrNull

class EmailStatisticInterval
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val aggregations: JsonField<EmailStatisticsData>,
    private val interval: JsonField<Interval>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("aggregations")
        @ExcludeMissing
        aggregations: JsonField<EmailStatisticsData> = JsonMissing.of(),
        @JsonProperty("interval") @ExcludeMissing interval: JsonField<Interval> = JsonMissing.of(),
    ) : this(aggregations, interval, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun aggregations(): EmailStatisticsData = aggregations.getRequired("aggregations")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun interval(): Interval = interval.getRequired("interval")

    /**
     * Returns the raw JSON value of [aggregations].
     *
     * Unlike [aggregations], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("aggregations")
    @ExcludeMissing
    fun _aggregations(): JsonField<EmailStatisticsData> = aggregations

    /**
     * Returns the raw JSON value of [interval].
     *
     * Unlike [interval], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("interval") @ExcludeMissing fun _interval(): JsonField<Interval> = interval

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
         * Returns a mutable builder for constructing an instance of [EmailStatisticInterval].
         *
         * The following fields are required:
         * ```java
         * .aggregations()
         * .interval()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailStatisticInterval]. */
    class Builder internal constructor() {

        private var aggregations: JsonField<EmailStatisticsData>? = null
        private var interval: JsonField<Interval>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(emailStatisticInterval: EmailStatisticInterval) = apply {
            aggregations = emailStatisticInterval.aggregations
            interval = emailStatisticInterval.interval
            additionalProperties = emailStatisticInterval.additionalProperties.toMutableMap()
        }

        fun aggregations(aggregations: EmailStatisticsData) =
            aggregations(JsonField.of(aggregations))

        /**
         * Sets [Builder.aggregations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aggregations] with a well-typed [EmailStatisticsData]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun aggregations(aggregations: JsonField<EmailStatisticsData>) = apply {
            this.aggregations = aggregations
        }

        fun interval(interval: Interval) = interval(JsonField.of(interval))

        /**
         * Sets [Builder.interval] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interval] with a well-typed [Interval] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun interval(interval: JsonField<Interval>) = apply { this.interval = interval }

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
         * Returns an immutable instance of [EmailStatisticInterval].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .aggregations()
         * .interval()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EmailStatisticInterval =
            EmailStatisticInterval(
                checkRequired("aggregations", aggregations),
                checkRequired("interval", interval),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): EmailStatisticInterval = apply {
        if (validated) {
            return@apply
        }

        aggregations().validate()
        interval().validate()
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
        (aggregations.asKnown().getOrNull()?.validity() ?: 0) +
            (interval.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailStatisticInterval &&
            aggregations == other.aggregations &&
            interval == other.interval &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(aggregations, interval, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EmailStatisticInterval{aggregations=$aggregations, interval=$interval, additionalProperties=$additionalProperties}"
}
