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

class CustomObjectRecordLimitResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val byObjectType: JsonField<List<UsageForObjectType>>,
    private val overallLimit: JsonField<Long>,
    private val overallPercentage: JsonField<Double>,
    private val overallUsage: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("byObjectType")
        @ExcludeMissing
        byObjectType: JsonField<List<UsageForObjectType>> = JsonMissing.of(),
        @JsonProperty("overallLimit")
        @ExcludeMissing
        overallLimit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("overallPercentage")
        @ExcludeMissing
        overallPercentage: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("overallUsage")
        @ExcludeMissing
        overallUsage: JsonField<Long> = JsonMissing.of(),
    ) : this(byObjectType, overallLimit, overallPercentage, overallUsage, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun byObjectType(): List<UsageForObjectType> = byObjectType.getRequired("byObjectType")

    /**
     * The maximum number of custom object records allowed.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun overallLimit(): Long = overallLimit.getRequired("overallLimit")

    /**
     * The percentage of the overall custom object record limit that has been used.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun overallPercentage(): Double = overallPercentage.getRequired("overallPercentage")

    /**
     * The total number of custom object records currently in use.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun overallUsage(): Long = overallUsage.getRequired("overallUsage")

    /**
     * Returns the raw JSON value of [byObjectType].
     *
     * Unlike [byObjectType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("byObjectType")
    @ExcludeMissing
    fun _byObjectType(): JsonField<List<UsageForObjectType>> = byObjectType

    /**
     * Returns the raw JSON value of [overallLimit].
     *
     * Unlike [overallLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("overallLimit")
    @ExcludeMissing
    fun _overallLimit(): JsonField<Long> = overallLimit

    /**
     * Returns the raw JSON value of [overallPercentage].
     *
     * Unlike [overallPercentage], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("overallPercentage")
    @ExcludeMissing
    fun _overallPercentage(): JsonField<Double> = overallPercentage

    /**
     * Returns the raw JSON value of [overallUsage].
     *
     * Unlike [overallUsage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("overallUsage")
    @ExcludeMissing
    fun _overallUsage(): JsonField<Long> = overallUsage

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
         * [CustomObjectRecordLimitResponse].
         *
         * The following fields are required:
         * ```java
         * .byObjectType()
         * .overallLimit()
         * .overallPercentage()
         * .overallUsage()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomObjectRecordLimitResponse]. */
    class Builder internal constructor() {

        private var byObjectType: JsonField<MutableList<UsageForObjectType>>? = null
        private var overallLimit: JsonField<Long>? = null
        private var overallPercentage: JsonField<Double>? = null
        private var overallUsage: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customObjectRecordLimitResponse: CustomObjectRecordLimitResponse) =
            apply {
                byObjectType =
                    customObjectRecordLimitResponse.byObjectType.map { it.toMutableList() }
                overallLimit = customObjectRecordLimitResponse.overallLimit
                overallPercentage = customObjectRecordLimitResponse.overallPercentage
                overallUsage = customObjectRecordLimitResponse.overallUsage
                additionalProperties =
                    customObjectRecordLimitResponse.additionalProperties.toMutableMap()
            }

        fun byObjectType(byObjectType: List<UsageForObjectType>) =
            byObjectType(JsonField.of(byObjectType))

        /**
         * Sets [Builder.byObjectType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.byObjectType] with a well-typed
         * `List<UsageForObjectType>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun byObjectType(byObjectType: JsonField<List<UsageForObjectType>>) = apply {
            this.byObjectType = byObjectType.map { it.toMutableList() }
        }

        /**
         * Adds a single [UsageForObjectType] to [Builder.byObjectType].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addByObjectType(byObjectType: UsageForObjectType) = apply {
            this.byObjectType =
                (this.byObjectType ?: JsonField.of(mutableListOf())).also {
                    checkKnown("byObjectType", it).add(byObjectType)
                }
        }

        /** The maximum number of custom object records allowed. */
        fun overallLimit(overallLimit: Long) = overallLimit(JsonField.of(overallLimit))

        /**
         * Sets [Builder.overallLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overallLimit] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun overallLimit(overallLimit: JsonField<Long>) = apply { this.overallLimit = overallLimit }

        /** The percentage of the overall custom object record limit that has been used. */
        fun overallPercentage(overallPercentage: Double) =
            overallPercentage(JsonField.of(overallPercentage))

        /**
         * Sets [Builder.overallPercentage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overallPercentage] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun overallPercentage(overallPercentage: JsonField<Double>) = apply {
            this.overallPercentage = overallPercentage
        }

        /** The total number of custom object records currently in use. */
        fun overallUsage(overallUsage: Long) = overallUsage(JsonField.of(overallUsage))

        /**
         * Sets [Builder.overallUsage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overallUsage] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun overallUsage(overallUsage: JsonField<Long>) = apply { this.overallUsage = overallUsage }

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
         * Returns an immutable instance of [CustomObjectRecordLimitResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .byObjectType()
         * .overallLimit()
         * .overallPercentage()
         * .overallUsage()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomObjectRecordLimitResponse =
            CustomObjectRecordLimitResponse(
                checkRequired("byObjectType", byObjectType).map { it.toImmutable() },
                checkRequired("overallLimit", overallLimit),
                checkRequired("overallPercentage", overallPercentage),
                checkRequired("overallUsage", overallUsage),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CustomObjectRecordLimitResponse = apply {
        if (validated) {
            return@apply
        }

        byObjectType().forEach { it.validate() }
        overallLimit()
        overallPercentage()
        overallUsage()
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
        (byObjectType.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (overallLimit.asKnown().isPresent) 1 else 0) +
            (if (overallPercentage.asKnown().isPresent) 1 else 0) +
            (if (overallUsage.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomObjectRecordLimitResponse &&
            byObjectType == other.byObjectType &&
            overallLimit == other.overallLimit &&
            overallPercentage == other.overallPercentage &&
            overallUsage == other.overallUsage &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            byObjectType,
            overallLimit,
            overallPercentage,
            overallUsage,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomObjectRecordLimitResponse{byObjectType=$byObjectType, overallLimit=$overallLimit, overallPercentage=$overallPercentage, overallUsage=$overallUsage, additionalProperties=$additionalProperties}"
}
