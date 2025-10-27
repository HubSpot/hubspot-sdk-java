// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.hubdb

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class BoundedPaging
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val next: JsonField<BoundedNextPage>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("next") @ExcludeMissing next: JsonField<BoundedNextPage> = JsonMissing.of()
    ) : this(next, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun next(): Optional<BoundedNextPage> = next.getOptional("next")

    /**
     * Returns the raw JSON value of [next].
     *
     * Unlike [next], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("next") @ExcludeMissing fun _next(): JsonField<BoundedNextPage> = next

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

        /** Returns a mutable builder for constructing an instance of [BoundedPaging]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BoundedPaging]. */
    class Builder internal constructor() {

        private var next: JsonField<BoundedNextPage> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(boundedPaging: BoundedPaging) = apply {
            next = boundedPaging.next
            additionalProperties = boundedPaging.additionalProperties.toMutableMap()
        }

        fun next(next: BoundedNextPage) = next(JsonField.of(next))

        /**
         * Sets [Builder.next] to an arbitrary JSON value.
         *
         * You should usually call [Builder.next] with a well-typed [BoundedNextPage] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun next(next: JsonField<BoundedNextPage>) = apply { this.next = next }

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
         * Returns an immutable instance of [BoundedPaging].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BoundedPaging = BoundedPaging(next, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): BoundedPaging = apply {
        if (validated) {
            return@apply
        }

        next().ifPresent { it.validate() }
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
    @JvmSynthetic internal fun validity(): Int = (next.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BoundedPaging &&
            next == other.next &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(next, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BoundedPaging{next=$next, additionalProperties=$additionalProperties}"
}
