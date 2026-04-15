// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Paging
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val next: JsonField<NextPage>,
    private val prev: JsonField<PreviousPage>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("next") @ExcludeMissing next: JsonField<NextPage> = JsonMissing.of(),
        @JsonProperty("prev") @ExcludeMissing prev: JsonField<PreviousPage> = JsonMissing.of(),
    ) : this(next, prev, mutableMapOf())

    /**
     * Specifies the paging information needed to retrieve the next set of results in a paginated
     * API response
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun next(): Optional<NextPage> = next.getOptional("next")

    /**
     * specifies the paging information needed to retrieve the previous set of results in a
     * paginated API response
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun prev(): Optional<PreviousPage> = prev.getOptional("prev")

    /**
     * Returns the raw JSON value of [next].
     *
     * Unlike [next], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("next") @ExcludeMissing fun _next(): JsonField<NextPage> = next

    /**
     * Returns the raw JSON value of [prev].
     *
     * Unlike [prev], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prev") @ExcludeMissing fun _prev(): JsonField<PreviousPage> = prev

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

        /** Returns a mutable builder for constructing an instance of [Paging]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Paging]. */
    class Builder internal constructor() {

        private var next: JsonField<NextPage> = JsonMissing.of()
        private var prev: JsonField<PreviousPage> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(paging: Paging) = apply {
            next = paging.next
            prev = paging.prev
            additionalProperties = paging.additionalProperties.toMutableMap()
        }

        /**
         * Specifies the paging information needed to retrieve the next set of results in a
         * paginated API response
         */
        fun next(next: NextPage) = next(JsonField.of(next))

        /**
         * Sets [Builder.next] to an arbitrary JSON value.
         *
         * You should usually call [Builder.next] with a well-typed [NextPage] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun next(next: JsonField<NextPage>) = apply { this.next = next }

        /**
         * specifies the paging information needed to retrieve the previous set of results in a
         * paginated API response
         */
        fun prev(prev: PreviousPage) = prev(JsonField.of(prev))

        /**
         * Sets [Builder.prev] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prev] with a well-typed [PreviousPage] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun prev(prev: JsonField<PreviousPage>) = apply { this.prev = prev }

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
         * Returns an immutable instance of [Paging].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Paging = Paging(next, prev, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): Paging = apply {
        if (validated) {
            return@apply
        }

        next().ifPresent { it.validate() }
        prev().ifPresent { it.validate() }
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
        (next.asKnown().getOrNull()?.validity() ?: 0) +
            (prev.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Paging &&
            next == other.next &&
            prev == other.prev &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(next, prev, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Paging{next=$next, prev=$prev, additionalProperties=$additionalProperties}"
}
