// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.account.activity

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
import com.hubspot.sdk.models.ForwardPaging
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CollectionResponseHydratedCriticalActionForwardPaging
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val results: JsonField<List<HydratedCriticalAction>>,
    private val paging: JsonField<ForwardPaging>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("results")
        @ExcludeMissing
        results: JsonField<List<HydratedCriticalAction>> = JsonMissing.of(),
        @JsonProperty("paging") @ExcludeMissing paging: JsonField<ForwardPaging> = JsonMissing.of(),
    ) : this(results, paging, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun results(): List<HydratedCriticalAction> = results.getRequired("results")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun paging(): Optional<ForwardPaging> = paging.getOptional("paging")

    /**
     * Returns the raw JSON value of [results].
     *
     * Unlike [results], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("results")
    @ExcludeMissing
    fun _results(): JsonField<List<HydratedCriticalAction>> = results

    /**
     * Returns the raw JSON value of [paging].
     *
     * Unlike [paging], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("paging") @ExcludeMissing fun _paging(): JsonField<ForwardPaging> = paging

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
         * [CollectionResponseHydratedCriticalActionForwardPaging].
         *
         * The following fields are required:
         * ```java
         * .results()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CollectionResponseHydratedCriticalActionForwardPaging]. */
    class Builder internal constructor() {

        private var results: JsonField<MutableList<HydratedCriticalAction>>? = null
        private var paging: JsonField<ForwardPaging> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            collectionResponseHydratedCriticalActionForwardPaging:
                CollectionResponseHydratedCriticalActionForwardPaging
        ) = apply {
            results =
                collectionResponseHydratedCriticalActionForwardPaging.results.map {
                    it.toMutableList()
                }
            paging = collectionResponseHydratedCriticalActionForwardPaging.paging
            additionalProperties =
                collectionResponseHydratedCriticalActionForwardPaging.additionalProperties
                    .toMutableMap()
        }

        fun results(results: List<HydratedCriticalAction>) = results(JsonField.of(results))

        /**
         * Sets [Builder.results] to an arbitrary JSON value.
         *
         * You should usually call [Builder.results] with a well-typed
         * `List<HydratedCriticalAction>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun results(results: JsonField<List<HydratedCriticalAction>>) = apply {
            this.results = results.map { it.toMutableList() }
        }

        /**
         * Adds a single [HydratedCriticalAction] to [results].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addResult(result: HydratedCriticalAction) = apply {
            results =
                (results ?: JsonField.of(mutableListOf())).also {
                    checkKnown("results", it).add(result)
                }
        }

        fun paging(paging: ForwardPaging) = paging(JsonField.of(paging))

        /**
         * Sets [Builder.paging] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paging] with a well-typed [ForwardPaging] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun paging(paging: JsonField<ForwardPaging>) = apply { this.paging = paging }

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
         * Returns an immutable instance of [CollectionResponseHydratedCriticalActionForwardPaging].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .results()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CollectionResponseHydratedCriticalActionForwardPaging =
            CollectionResponseHydratedCriticalActionForwardPaging(
                checkRequired("results", results).map { it.toImmutable() },
                paging,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): CollectionResponseHydratedCriticalActionForwardPaging = apply {
        if (validated) {
            return@apply
        }

        results().forEach { it.validate() }
        paging().ifPresent { it.validate() }
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
        (results.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (paging.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CollectionResponseHydratedCriticalActionForwardPaging &&
            results == other.results &&
            paging == other.paging &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(results, paging, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CollectionResponseHydratedCriticalActionForwardPaging{results=$results, paging=$paging, additionalProperties=$additionalProperties}"
}
