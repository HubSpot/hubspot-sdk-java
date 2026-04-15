// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.emails

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

class AggregateEmailStatistics
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val aggregate: JsonField<EmailStatisticsData>,
    private val campaignAggregations: JsonField<CampaignAggregations>,
    private val emails: JsonField<List<Long>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("aggregate")
        @ExcludeMissing
        aggregate: JsonField<EmailStatisticsData> = JsonMissing.of(),
        @JsonProperty("campaignAggregations")
        @ExcludeMissing
        campaignAggregations: JsonField<CampaignAggregations> = JsonMissing.of(),
        @JsonProperty("emails") @ExcludeMissing emails: JsonField<List<Long>> = JsonMissing.of(),
    ) : this(aggregate, campaignAggregations, emails, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun aggregate(): EmailStatisticsData = aggregate.getRequired("aggregate")

    /**
     * The aggregated statistics per campaign.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun campaignAggregations(): CampaignAggregations =
        campaignAggregations.getRequired("campaignAggregations")

    /**
     * List of email IDs that were sent during the time span.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun emails(): List<Long> = emails.getRequired("emails")

    /**
     * Returns the raw JSON value of [aggregate].
     *
     * Unlike [aggregate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("aggregate")
    @ExcludeMissing
    fun _aggregate(): JsonField<EmailStatisticsData> = aggregate

    /**
     * Returns the raw JSON value of [campaignAggregations].
     *
     * Unlike [campaignAggregations], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("campaignAggregations")
    @ExcludeMissing
    fun _campaignAggregations(): JsonField<CampaignAggregations> = campaignAggregations

    /**
     * Returns the raw JSON value of [emails].
     *
     * Unlike [emails], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("emails") @ExcludeMissing fun _emails(): JsonField<List<Long>> = emails

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
         * Returns a mutable builder for constructing an instance of [AggregateEmailStatistics].
         *
         * The following fields are required:
         * ```java
         * .aggregate()
         * .campaignAggregations()
         * .emails()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AggregateEmailStatistics]. */
    class Builder internal constructor() {

        private var aggregate: JsonField<EmailStatisticsData>? = null
        private var campaignAggregations: JsonField<CampaignAggregations>? = null
        private var emails: JsonField<MutableList<Long>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(aggregateEmailStatistics: AggregateEmailStatistics) = apply {
            aggregate = aggregateEmailStatistics.aggregate
            campaignAggregations = aggregateEmailStatistics.campaignAggregations
            emails = aggregateEmailStatistics.emails.map { it.toMutableList() }
            additionalProperties = aggregateEmailStatistics.additionalProperties.toMutableMap()
        }

        fun aggregate(aggregate: EmailStatisticsData) = aggregate(JsonField.of(aggregate))

        /**
         * Sets [Builder.aggregate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aggregate] with a well-typed [EmailStatisticsData] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun aggregate(aggregate: JsonField<EmailStatisticsData>) = apply {
            this.aggregate = aggregate
        }

        /** The aggregated statistics per campaign. */
        fun campaignAggregations(campaignAggregations: CampaignAggregations) =
            campaignAggregations(JsonField.of(campaignAggregations))

        /**
         * Sets [Builder.campaignAggregations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.campaignAggregations] with a well-typed
         * [CampaignAggregations] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun campaignAggregations(campaignAggregations: JsonField<CampaignAggregations>) = apply {
            this.campaignAggregations = campaignAggregations
        }

        /** List of email IDs that were sent during the time span. */
        fun emails(emails: List<Long>) = emails(JsonField.of(emails))

        /**
         * Sets [Builder.emails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emails] with a well-typed `List<Long>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun emails(emails: JsonField<List<Long>>) = apply {
            this.emails = emails.map { it.toMutableList() }
        }

        /**
         * Adds a single [Long] to [emails].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEmail(email: Long) = apply {
            emails =
                (emails ?: JsonField.of(mutableListOf())).also {
                    checkKnown("emails", it).add(email)
                }
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
         * Returns an immutable instance of [AggregateEmailStatistics].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .aggregate()
         * .campaignAggregations()
         * .emails()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AggregateEmailStatistics =
            AggregateEmailStatistics(
                checkRequired("aggregate", aggregate),
                checkRequired("campaignAggregations", campaignAggregations),
                checkRequired("emails", emails).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AggregateEmailStatistics = apply {
        if (validated) {
            return@apply
        }

        aggregate().validate()
        campaignAggregations().validate()
        emails()
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
        (aggregate.asKnown().getOrNull()?.validity() ?: 0) +
            (campaignAggregations.asKnown().getOrNull()?.validity() ?: 0) +
            (emails.asKnown().getOrNull()?.size ?: 0)

    /** The aggregated statistics per campaign. */
    class CampaignAggregations
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

            /** Returns a mutable builder for constructing an instance of [CampaignAggregations]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CampaignAggregations]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(campaignAggregations: CampaignAggregations) = apply {
                additionalProperties = campaignAggregations.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [CampaignAggregations].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CampaignAggregations =
                CampaignAggregations(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): CampaignAggregations = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CampaignAggregations &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "CampaignAggregations{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AggregateEmailStatistics &&
            aggregate == other.aggregate &&
            campaignAggregations == other.campaignAggregations &&
            emails == other.emails &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(aggregate, campaignAggregations, emails, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AggregateEmailStatistics{aggregate=$aggregate, campaignAggregations=$campaignAggregations, emails=$emails, additionalProperties=$additionalProperties}"
}
