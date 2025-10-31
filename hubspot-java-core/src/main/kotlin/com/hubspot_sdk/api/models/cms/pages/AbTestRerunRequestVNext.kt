// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.pages

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

/** Request body object for rerunning A/B tests. */
class AbTestRerunRequestVNext
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val abTestId: JsonField<String>,
    private val variationId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("abTestId") @ExcludeMissing abTestId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("variationId")
        @ExcludeMissing
        variationId: JsonField<String> = JsonMissing.of(),
    ) : this(abTestId, variationId, mutableMapOf())

    /**
     * ID of the test to rerun.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun abTestId(): String = abTestId.getRequired("abTestId")

    /**
     * ID of the object to reactivate as a test variation.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun variationId(): String = variationId.getRequired("variationId")

    /**
     * Returns the raw JSON value of [abTestId].
     *
     * Unlike [abTestId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("abTestId") @ExcludeMissing fun _abTestId(): JsonField<String> = abTestId

    /**
     * Returns the raw JSON value of [variationId].
     *
     * Unlike [variationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("variationId") @ExcludeMissing fun _variationId(): JsonField<String> = variationId

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
         * Returns a mutable builder for constructing an instance of [AbTestRerunRequestVNext].
         *
         * The following fields are required:
         * ```java
         * .abTestId()
         * .variationId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AbTestRerunRequestVNext]. */
    class Builder internal constructor() {

        private var abTestId: JsonField<String>? = null
        private var variationId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(abTestRerunRequestVNext: AbTestRerunRequestVNext) = apply {
            abTestId = abTestRerunRequestVNext.abTestId
            variationId = abTestRerunRequestVNext.variationId
            additionalProperties = abTestRerunRequestVNext.additionalProperties.toMutableMap()
        }

        /** ID of the test to rerun. */
        fun abTestId(abTestId: String) = abTestId(JsonField.of(abTestId))

        /**
         * Sets [Builder.abTestId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.abTestId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun abTestId(abTestId: JsonField<String>) = apply { this.abTestId = abTestId }

        /** ID of the object to reactivate as a test variation. */
        fun variationId(variationId: String) = variationId(JsonField.of(variationId))

        /**
         * Sets [Builder.variationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.variationId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun variationId(variationId: JsonField<String>) = apply { this.variationId = variationId }

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
         * Returns an immutable instance of [AbTestRerunRequestVNext].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .abTestId()
         * .variationId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AbTestRerunRequestVNext =
            AbTestRerunRequestVNext(
                checkRequired("abTestId", abTestId),
                checkRequired("variationId", variationId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AbTestRerunRequestVNext = apply {
        if (validated) {
            return@apply
        }

        abTestId()
        variationId()
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
        (if (abTestId.asKnown().isPresent) 1 else 0) +
            (if (variationId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AbTestRerunRequestVNext &&
            abTestId == other.abTestId &&
            variationId == other.variationId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(abTestId, variationId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AbTestRerunRequestVNext{abTestId=$abTestId, variationId=$variationId, additionalProperties=$additionalProperties}"
}
