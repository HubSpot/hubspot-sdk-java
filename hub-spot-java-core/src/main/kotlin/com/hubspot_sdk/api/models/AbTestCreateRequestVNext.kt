// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects

/** Request body object for creating A/B tests. */
class AbTestCreateRequestVNext
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val contentId: JsonField<String>,
    private val variationName: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("contentId") @ExcludeMissing contentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("variationName")
        @ExcludeMissing
        variationName: JsonField<String> = JsonMissing.of(),
    ) : this(contentId, variationName, mutableMapOf())

    /**
     * ID of the object to test.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contentId(): String = contentId.getRequired("contentId")

    /**
     * Name of A/B test variation.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun variationName(): String = variationName.getRequired("variationName")

    /**
     * Returns the raw JSON value of [contentId].
     *
     * Unlike [contentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contentId") @ExcludeMissing fun _contentId(): JsonField<String> = contentId

    /**
     * Returns the raw JSON value of [variationName].
     *
     * Unlike [variationName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("variationName")
    @ExcludeMissing
    fun _variationName(): JsonField<String> = variationName

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
         * Returns a mutable builder for constructing an instance of [AbTestCreateRequestVNext].
         *
         * The following fields are required:
         * ```java
         * .contentId()
         * .variationName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AbTestCreateRequestVNext]. */
    class Builder internal constructor() {

        private var contentId: JsonField<String>? = null
        private var variationName: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(abTestCreateRequestVNext: AbTestCreateRequestVNext) = apply {
            contentId = abTestCreateRequestVNext.contentId
            variationName = abTestCreateRequestVNext.variationName
            additionalProperties = abTestCreateRequestVNext.additionalProperties.toMutableMap()
        }

        /** ID of the object to test. */
        fun contentId(contentId: String) = contentId(JsonField.of(contentId))

        /**
         * Sets [Builder.contentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contentId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contentId(contentId: JsonField<String>) = apply { this.contentId = contentId }

        /** Name of A/B test variation. */
        fun variationName(variationName: String) = variationName(JsonField.of(variationName))

        /**
         * Sets [Builder.variationName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.variationName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun variationName(variationName: JsonField<String>) = apply {
            this.variationName = variationName
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
         * Returns an immutable instance of [AbTestCreateRequestVNext].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .contentId()
         * .variationName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AbTestCreateRequestVNext =
            AbTestCreateRequestVNext(
                checkRequired("contentId", contentId),
                checkRequired("variationName", variationName),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AbTestCreateRequestVNext = apply {
        if (validated) {
            return@apply
        }

        contentId()
        variationName()
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
        (if (contentId.asKnown().isPresent) 1 else 0) +
            (if (variationName.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AbTestCreateRequestVNext &&
            contentId == other.contentId &&
            variationName == other.variationName &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(contentId, variationName, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AbTestCreateRequestVNext{contentId=$contentId, variationName=$variationName, additionalProperties=$additionalProperties}"
}
