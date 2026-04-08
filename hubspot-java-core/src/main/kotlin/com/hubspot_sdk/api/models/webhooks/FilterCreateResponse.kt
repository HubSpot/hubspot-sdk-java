// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.webhooks

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

class FilterCreateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val filterId: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("filterId") @ExcludeMissing filterId: JsonField<Long> = JsonMissing.of()
    ) : this(filterId, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filterId(): Long = filterId.getRequired("filterId")

    /**
     * Returns the raw JSON value of [filterId].
     *
     * Unlike [filterId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filterId") @ExcludeMissing fun _filterId(): JsonField<Long> = filterId

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
         * Returns a mutable builder for constructing an instance of [FilterCreateResponse].
         *
         * The following fields are required:
         * ```java
         * .filterId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FilterCreateResponse]. */
    class Builder internal constructor() {

        private var filterId: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(filterCreateResponse: FilterCreateResponse) = apply {
            filterId = filterCreateResponse.filterId
            additionalProperties = filterCreateResponse.additionalProperties.toMutableMap()
        }

        fun filterId(filterId: Long) = filterId(JsonField.of(filterId))

        /**
         * Sets [Builder.filterId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filterId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filterId(filterId: JsonField<Long>) = apply { this.filterId = filterId }

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
         * Returns an immutable instance of [FilterCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .filterId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FilterCreateResponse =
            FilterCreateResponse(
                checkRequired("filterId", filterId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FilterCreateResponse = apply {
        if (validated) {
            return@apply
        }

        filterId()
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
    @JvmSynthetic internal fun validity(): Int = (if (filterId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FilterCreateResponse &&
            filterId == other.filterId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(filterId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FilterCreateResponse{filterId=$filterId, additionalProperties=$additionalProperties}"
}
