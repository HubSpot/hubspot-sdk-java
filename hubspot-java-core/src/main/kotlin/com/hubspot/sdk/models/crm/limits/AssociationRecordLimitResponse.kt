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

class AssociationRecordLimitResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val atLimitFromRecordSamples: JsonField<List<AtLimitRecordSample>>,
    private val limit: JsonField<Long>,
    private val nearLimitFromRecordSamples: JsonField<List<NearLimitRecordSample>>,
    private val totalRecordsAtLimit: JsonField<Int>,
    private val totalRecordsNearLimit: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("atLimitFromRecordSamples")
        @ExcludeMissing
        atLimitFromRecordSamples: JsonField<List<AtLimitRecordSample>> = JsonMissing.of(),
        @JsonProperty("limit") @ExcludeMissing limit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("nearLimitFromRecordSamples")
        @ExcludeMissing
        nearLimitFromRecordSamples: JsonField<List<NearLimitRecordSample>> = JsonMissing.of(),
        @JsonProperty("totalRecordsAtLimit")
        @ExcludeMissing
        totalRecordsAtLimit: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("totalRecordsNearLimit")
        @ExcludeMissing
        totalRecordsNearLimit: JsonField<Int> = JsonMissing.of(),
    ) : this(
        atLimitFromRecordSamples,
        limit,
        nearLimitFromRecordSamples,
        totalRecordsAtLimit,
        totalRecordsNearLimit,
        mutableMapOf(),
    )

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun atLimitFromRecordSamples(): List<AtLimitRecordSample> =
        atLimitFromRecordSamples.getRequired("atLimitFromRecordSamples")

    /**
     * The maximum number of associations allowed for records.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun limit(): Long = limit.getRequired("limit")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun nearLimitFromRecordSamples(): List<NearLimitRecordSample> =
        nearLimitFromRecordSamples.getRequired("nearLimitFromRecordSamples")

    /**
     * The total number of records that have reached their association limit.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalRecordsAtLimit(): Int = totalRecordsAtLimit.getRequired("totalRecordsAtLimit")

    /**
     * The total number of records that are approaching their association limit.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalRecordsNearLimit(): Int = totalRecordsNearLimit.getRequired("totalRecordsNearLimit")

    /**
     * Returns the raw JSON value of [atLimitFromRecordSamples].
     *
     * Unlike [atLimitFromRecordSamples], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("atLimitFromRecordSamples")
    @ExcludeMissing
    fun _atLimitFromRecordSamples(): JsonField<List<AtLimitRecordSample>> = atLimitFromRecordSamples

    /**
     * Returns the raw JSON value of [limit].
     *
     * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Long> = limit

    /**
     * Returns the raw JSON value of [nearLimitFromRecordSamples].
     *
     * Unlike [nearLimitFromRecordSamples], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("nearLimitFromRecordSamples")
    @ExcludeMissing
    fun _nearLimitFromRecordSamples(): JsonField<List<NearLimitRecordSample>> =
        nearLimitFromRecordSamples

    /**
     * Returns the raw JSON value of [totalRecordsAtLimit].
     *
     * Unlike [totalRecordsAtLimit], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("totalRecordsAtLimit")
    @ExcludeMissing
    fun _totalRecordsAtLimit(): JsonField<Int> = totalRecordsAtLimit

    /**
     * Returns the raw JSON value of [totalRecordsNearLimit].
     *
     * Unlike [totalRecordsNearLimit], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("totalRecordsNearLimit")
    @ExcludeMissing
    fun _totalRecordsNearLimit(): JsonField<Int> = totalRecordsNearLimit

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
         * [AssociationRecordLimitResponse].
         *
         * The following fields are required:
         * ```java
         * .atLimitFromRecordSamples()
         * .limit()
         * .nearLimitFromRecordSamples()
         * .totalRecordsAtLimit()
         * .totalRecordsNearLimit()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AssociationRecordLimitResponse]. */
    class Builder internal constructor() {

        private var atLimitFromRecordSamples: JsonField<MutableList<AtLimitRecordSample>>? = null
        private var limit: JsonField<Long>? = null
        private var nearLimitFromRecordSamples: JsonField<MutableList<NearLimitRecordSample>>? =
            null
        private var totalRecordsAtLimit: JsonField<Int>? = null
        private var totalRecordsNearLimit: JsonField<Int>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(associationRecordLimitResponse: AssociationRecordLimitResponse) = apply {
            atLimitFromRecordSamples =
                associationRecordLimitResponse.atLimitFromRecordSamples.map { it.toMutableList() }
            limit = associationRecordLimitResponse.limit
            nearLimitFromRecordSamples =
                associationRecordLimitResponse.nearLimitFromRecordSamples.map { it.toMutableList() }
            totalRecordsAtLimit = associationRecordLimitResponse.totalRecordsAtLimit
            totalRecordsNearLimit = associationRecordLimitResponse.totalRecordsNearLimit
            additionalProperties =
                associationRecordLimitResponse.additionalProperties.toMutableMap()
        }

        fun atLimitFromRecordSamples(atLimitFromRecordSamples: List<AtLimitRecordSample>) =
            atLimitFromRecordSamples(JsonField.of(atLimitFromRecordSamples))

        /**
         * Sets [Builder.atLimitFromRecordSamples] to an arbitrary JSON value.
         *
         * You should usually call [Builder.atLimitFromRecordSamples] with a well-typed
         * `List<AtLimitRecordSample>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun atLimitFromRecordSamples(
            atLimitFromRecordSamples: JsonField<List<AtLimitRecordSample>>
        ) = apply {
            this.atLimitFromRecordSamples = atLimitFromRecordSamples.map { it.toMutableList() }
        }

        /**
         * Adds a single [AtLimitRecordSample] to [atLimitFromRecordSamples].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAtLimitFromRecordSample(atLimitFromRecordSample: AtLimitRecordSample) = apply {
            atLimitFromRecordSamples =
                (atLimitFromRecordSamples ?: JsonField.of(mutableListOf())).also {
                    checkKnown("atLimitFromRecordSamples", it).add(atLimitFromRecordSample)
                }
        }

        /** The maximum number of associations allowed for records. */
        fun limit(limit: Long) = limit(JsonField.of(limit))

        /**
         * Sets [Builder.limit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun limit(limit: JsonField<Long>) = apply { this.limit = limit }

        fun nearLimitFromRecordSamples(nearLimitFromRecordSamples: List<NearLimitRecordSample>) =
            nearLimitFromRecordSamples(JsonField.of(nearLimitFromRecordSamples))

        /**
         * Sets [Builder.nearLimitFromRecordSamples] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nearLimitFromRecordSamples] with a well-typed
         * `List<NearLimitRecordSample>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun nearLimitFromRecordSamples(
            nearLimitFromRecordSamples: JsonField<List<NearLimitRecordSample>>
        ) = apply {
            this.nearLimitFromRecordSamples = nearLimitFromRecordSamples.map { it.toMutableList() }
        }

        /**
         * Adds a single [NearLimitRecordSample] to [nearLimitFromRecordSamples].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addNearLimitFromRecordSample(nearLimitFromRecordSample: NearLimitRecordSample) = apply {
            nearLimitFromRecordSamples =
                (nearLimitFromRecordSamples ?: JsonField.of(mutableListOf())).also {
                    checkKnown("nearLimitFromRecordSamples", it).add(nearLimitFromRecordSample)
                }
        }

        /** The total number of records that have reached their association limit. */
        fun totalRecordsAtLimit(totalRecordsAtLimit: Int) =
            totalRecordsAtLimit(JsonField.of(totalRecordsAtLimit))

        /**
         * Sets [Builder.totalRecordsAtLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalRecordsAtLimit] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun totalRecordsAtLimit(totalRecordsAtLimit: JsonField<Int>) = apply {
            this.totalRecordsAtLimit = totalRecordsAtLimit
        }

        /** The total number of records that are approaching their association limit. */
        fun totalRecordsNearLimit(totalRecordsNearLimit: Int) =
            totalRecordsNearLimit(JsonField.of(totalRecordsNearLimit))

        /**
         * Sets [Builder.totalRecordsNearLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalRecordsNearLimit] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun totalRecordsNearLimit(totalRecordsNearLimit: JsonField<Int>) = apply {
            this.totalRecordsNearLimit = totalRecordsNearLimit
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
         * Returns an immutable instance of [AssociationRecordLimitResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .atLimitFromRecordSamples()
         * .limit()
         * .nearLimitFromRecordSamples()
         * .totalRecordsAtLimit()
         * .totalRecordsNearLimit()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AssociationRecordLimitResponse =
            AssociationRecordLimitResponse(
                checkRequired("atLimitFromRecordSamples", atLimitFromRecordSamples).map {
                    it.toImmutable()
                },
                checkRequired("limit", limit),
                checkRequired("nearLimitFromRecordSamples", nearLimitFromRecordSamples).map {
                    it.toImmutable()
                },
                checkRequired("totalRecordsAtLimit", totalRecordsAtLimit),
                checkRequired("totalRecordsNearLimit", totalRecordsNearLimit),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AssociationRecordLimitResponse = apply {
        if (validated) {
            return@apply
        }

        atLimitFromRecordSamples().forEach { it.validate() }
        limit()
        nearLimitFromRecordSamples().forEach { it.validate() }
        totalRecordsAtLimit()
        totalRecordsNearLimit()
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
        (atLimitFromRecordSamples.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (limit.asKnown().isPresent) 1 else 0) +
            (nearLimitFromRecordSamples.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                ?: 0) +
            (if (totalRecordsAtLimit.asKnown().isPresent) 1 else 0) +
            (if (totalRecordsNearLimit.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AssociationRecordLimitResponse &&
            atLimitFromRecordSamples == other.atLimitFromRecordSamples &&
            limit == other.limit &&
            nearLimitFromRecordSamples == other.nearLimitFromRecordSamples &&
            totalRecordsAtLimit == other.totalRecordsAtLimit &&
            totalRecordsNearLimit == other.totalRecordsNearLimit &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            atLimitFromRecordSamples,
            limit,
            nearLimitFromRecordSamples,
            totalRecordsAtLimit,
            totalRecordsNearLimit,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AssociationRecordLimitResponse{atLimitFromRecordSamples=$atLimitFromRecordSamples, limit=$limit, nearLimitFromRecordSamples=$nearLimitFromRecordSamples, totalRecordsAtLimit=$totalRecordsAtLimit, totalRecordsNearLimit=$totalRecordsNearLimit, additionalProperties=$additionalProperties}"
}
