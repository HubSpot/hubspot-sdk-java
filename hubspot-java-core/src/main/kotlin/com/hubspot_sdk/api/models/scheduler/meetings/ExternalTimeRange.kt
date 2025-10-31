// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.scheduler.meetings

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

class ExternalTimeRange
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val end: JsonField<Int>,
    private val start: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("end") @ExcludeMissing end: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("start") @ExcludeMissing start: JsonField<Int> = JsonMissing.of(),
    ) : this(end, start, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun end(): Int = end.getRequired("end")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun start(): Int = start.getRequired("start")

    /**
     * Returns the raw JSON value of [end].
     *
     * Unlike [end], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end") @ExcludeMissing fun _end(): JsonField<Int> = end

    /**
     * Returns the raw JSON value of [start].
     *
     * Unlike [start], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start") @ExcludeMissing fun _start(): JsonField<Int> = start

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
         * Returns a mutable builder for constructing an instance of [ExternalTimeRange].
         *
         * The following fields are required:
         * ```java
         * .end()
         * .start()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalTimeRange]. */
    class Builder internal constructor() {

        private var end: JsonField<Int>? = null
        private var start: JsonField<Int>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalTimeRange: ExternalTimeRange) = apply {
            end = externalTimeRange.end
            start = externalTimeRange.start
            additionalProperties = externalTimeRange.additionalProperties.toMutableMap()
        }

        fun end(end: Int) = end(JsonField.of(end))

        /**
         * Sets [Builder.end] to an arbitrary JSON value.
         *
         * You should usually call [Builder.end] with a well-typed [Int] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun end(end: JsonField<Int>) = apply { this.end = end }

        fun start(start: Int) = start(JsonField.of(start))

        /**
         * Sets [Builder.start] to an arbitrary JSON value.
         *
         * You should usually call [Builder.start] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun start(start: JsonField<Int>) = apply { this.start = start }

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
         * Returns an immutable instance of [ExternalTimeRange].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .end()
         * .start()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalTimeRange =
            ExternalTimeRange(
                checkRequired("end", end),
                checkRequired("start", start),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalTimeRange = apply {
        if (validated) {
            return@apply
        }

        end()
        start()
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
        (if (end.asKnown().isPresent) 1 else 0) + (if (start.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalTimeRange &&
            end == other.end &&
            start == other.start &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(end, start, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalTimeRange{end=$end, start=$start, additionalProperties=$additionalProperties}"
}
