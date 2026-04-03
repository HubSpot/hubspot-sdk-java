// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.marketingevents

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class MarketingEventCompleteRequestParams
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val endDateTime: JsonField<OffsetDateTime>,
    private val startDateTime: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("endDateTime")
        @ExcludeMissing
        endDateTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("startDateTime")
        @ExcludeMissing
        startDateTime: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(endDateTime, startDateTime, mutableMapOf())

    /**
     * The end date and time of the marketing event in ISO 8601 format
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endDateTime(): OffsetDateTime = endDateTime.getRequired("endDateTime")

    /**
     * The start date and time of the marketing event in ISO 8601 format
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startDateTime(): OffsetDateTime = startDateTime.getRequired("startDateTime")

    /**
     * Returns the raw JSON value of [endDateTime].
     *
     * Unlike [endDateTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endDateTime")
    @ExcludeMissing
    fun _endDateTime(): JsonField<OffsetDateTime> = endDateTime

    /**
     * Returns the raw JSON value of [startDateTime].
     *
     * Unlike [startDateTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startDateTime")
    @ExcludeMissing
    fun _startDateTime(): JsonField<OffsetDateTime> = startDateTime

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
         * [MarketingEventCompleteRequestParams].
         *
         * The following fields are required:
         * ```java
         * .endDateTime()
         * .startDateTime()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MarketingEventCompleteRequestParams]. */
    class Builder internal constructor() {

        private var endDateTime: JsonField<OffsetDateTime>? = null
        private var startDateTime: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            marketingEventCompleteRequestParams: MarketingEventCompleteRequestParams
        ) = apply {
            endDateTime = marketingEventCompleteRequestParams.endDateTime
            startDateTime = marketingEventCompleteRequestParams.startDateTime
            additionalProperties =
                marketingEventCompleteRequestParams.additionalProperties.toMutableMap()
        }

        /** The end date and time of the marketing event in ISO 8601 format */
        fun endDateTime(endDateTime: OffsetDateTime) = endDateTime(JsonField.of(endDateTime))

        /**
         * Sets [Builder.endDateTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endDateTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endDateTime(endDateTime: JsonField<OffsetDateTime>) = apply {
            this.endDateTime = endDateTime
        }

        /** The start date and time of the marketing event in ISO 8601 format */
        fun startDateTime(startDateTime: OffsetDateTime) =
            startDateTime(JsonField.of(startDateTime))

        /**
         * Sets [Builder.startDateTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startDateTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startDateTime(startDateTime: JsonField<OffsetDateTime>) = apply {
            this.startDateTime = startDateTime
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
         * Returns an immutable instance of [MarketingEventCompleteRequestParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .endDateTime()
         * .startDateTime()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MarketingEventCompleteRequestParams =
            MarketingEventCompleteRequestParams(
                checkRequired("endDateTime", endDateTime),
                checkRequired("startDateTime", startDateTime),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MarketingEventCompleteRequestParams = apply {
        if (validated) {
            return@apply
        }

        endDateTime()
        startDateTime()
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
        (if (endDateTime.asKnown().isPresent) 1 else 0) +
            (if (startDateTime.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MarketingEventCompleteRequestParams &&
            endDateTime == other.endDateTime &&
            startDateTime == other.startDateTime &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(endDateTime, startDateTime, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MarketingEventCompleteRequestParams{endDateTime=$endDateTime, startDateTime=$startDateTime, additionalProperties=$additionalProperties}"
}
