// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.campaigns

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.core.ExcludeMissing
import com.hubspot.core.JsonField
import com.hubspot.core.JsonMissing
import com.hubspot.core.JsonValue
import com.hubspot.core.checkKnown
import com.hubspot.core.checkRequired
import com.hubspot.core.toImmutable
import com.hubspot.errors.HubSpotInvalidDataException
import com.hubspot.models.ForwardPaging
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CollectionResponseContactReferenceForwardPaging
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val results: JsonField<List<ContactReference>>,
    private val paging: JsonField<ForwardPaging>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("results")
        @ExcludeMissing
        results: JsonField<List<ContactReference>> = JsonMissing.of(),
        @JsonProperty("paging") @ExcludeMissing paging: JsonField<ForwardPaging> = JsonMissing.of(),
    ) : this(results, paging, mutableMapOf())

    /**
     * An array of contact references, each containing an identifier for a contact.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun results(): List<ContactReference> = results.getRequired("results")

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
    fun _results(): JsonField<List<ContactReference>> = results

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
         * [CollectionResponseContactReferenceForwardPaging].
         *
         * The following fields are required:
         * ```java
         * .results()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CollectionResponseContactReferenceForwardPaging]. */
    class Builder internal constructor() {

        private var results: JsonField<MutableList<ContactReference>>? = null
        private var paging: JsonField<ForwardPaging> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            collectionResponseContactReferenceForwardPaging:
                CollectionResponseContactReferenceForwardPaging
        ) = apply {
            results =
                collectionResponseContactReferenceForwardPaging.results.map { it.toMutableList() }
            paging = collectionResponseContactReferenceForwardPaging.paging
            additionalProperties =
                collectionResponseContactReferenceForwardPaging.additionalProperties.toMutableMap()
        }

        /** An array of contact references, each containing an identifier for a contact. */
        fun results(results: List<ContactReference>) = results(JsonField.of(results))

        /**
         * Sets [Builder.results] to an arbitrary JSON value.
         *
         * You should usually call [Builder.results] with a well-typed `List<ContactReference>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun results(results: JsonField<List<ContactReference>>) = apply {
            this.results = results.map { it.toMutableList() }
        }

        /**
         * Adds a single [ContactReference] to [results].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addResult(result: ContactReference) = apply {
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
         * Returns an immutable instance of [CollectionResponseContactReferenceForwardPaging].
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
        fun build(): CollectionResponseContactReferenceForwardPaging =
            CollectionResponseContactReferenceForwardPaging(
                checkRequired("results", results).map { it.toImmutable() },
                paging,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CollectionResponseContactReferenceForwardPaging = apply {
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

        return other is CollectionResponseContactReferenceForwardPaging &&
            results == other.results &&
            paging == other.paging &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(results, paging, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CollectionResponseContactReferenceForwardPaging{results=$results, paging=$paging, additionalProperties=$additionalProperties}"
}
