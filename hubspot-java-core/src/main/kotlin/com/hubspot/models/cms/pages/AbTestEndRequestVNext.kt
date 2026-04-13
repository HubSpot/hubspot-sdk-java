// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.pages

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.core.ExcludeMissing
import com.hubspot.core.JsonField
import com.hubspot.core.JsonMissing
import com.hubspot.core.JsonValue
import com.hubspot.core.checkRequired
import com.hubspot.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects

class AbTestEndRequestVNext
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val abTestId: JsonField<String>,
    private val winnerId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("abTestId") @ExcludeMissing abTestId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("winnerId") @ExcludeMissing winnerId: JsonField<String> = JsonMissing.of(),
    ) : this(abTestId, winnerId, mutableMapOf())

    /**
     * ID of the test to end.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun abTestId(): String = abTestId.getRequired("abTestId")

    /**
     * ID of the object to designate as the test winner.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun winnerId(): String = winnerId.getRequired("winnerId")

    /**
     * Returns the raw JSON value of [abTestId].
     *
     * Unlike [abTestId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("abTestId") @ExcludeMissing fun _abTestId(): JsonField<String> = abTestId

    /**
     * Returns the raw JSON value of [winnerId].
     *
     * Unlike [winnerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("winnerId") @ExcludeMissing fun _winnerId(): JsonField<String> = winnerId

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
         * Returns a mutable builder for constructing an instance of [AbTestEndRequestVNext].
         *
         * The following fields are required:
         * ```java
         * .abTestId()
         * .winnerId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AbTestEndRequestVNext]. */
    class Builder internal constructor() {

        private var abTestId: JsonField<String>? = null
        private var winnerId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(abTestEndRequestVNext: AbTestEndRequestVNext) = apply {
            abTestId = abTestEndRequestVNext.abTestId
            winnerId = abTestEndRequestVNext.winnerId
            additionalProperties = abTestEndRequestVNext.additionalProperties.toMutableMap()
        }

        /** ID of the test to end. */
        fun abTestId(abTestId: String) = abTestId(JsonField.of(abTestId))

        /**
         * Sets [Builder.abTestId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.abTestId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun abTestId(abTestId: JsonField<String>) = apply { this.abTestId = abTestId }

        /** ID of the object to designate as the test winner. */
        fun winnerId(winnerId: String) = winnerId(JsonField.of(winnerId))

        /**
         * Sets [Builder.winnerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.winnerId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun winnerId(winnerId: JsonField<String>) = apply { this.winnerId = winnerId }

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
         * Returns an immutable instance of [AbTestEndRequestVNext].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .abTestId()
         * .winnerId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AbTestEndRequestVNext =
            AbTestEndRequestVNext(
                checkRequired("abTestId", abTestId),
                checkRequired("winnerId", winnerId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AbTestEndRequestVNext = apply {
        if (validated) {
            return@apply
        }

        abTestId()
        winnerId()
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
        (if (abTestId.asKnown().isPresent) 1 else 0) + (if (winnerId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AbTestEndRequestVNext &&
            abTestId == other.abTestId &&
            winnerId == other.winnerId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(abTestId, winnerId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AbTestEndRequestVNext{abTestId=$abTestId, winnerId=$winnerId, additionalProperties=$additionalProperties}"
}
