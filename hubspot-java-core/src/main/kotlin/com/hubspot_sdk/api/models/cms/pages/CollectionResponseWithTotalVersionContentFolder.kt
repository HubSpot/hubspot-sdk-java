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
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import com.hubspot_sdk.api.models.Paging
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Response object for collections of content folder versions with pagination information. */
class CollectionResponseWithTotalVersionContentFolder
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val results: JsonField<List<VersionContentFolder>>,
    private val total: JsonField<Int>,
    private val paging: JsonField<Paging>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("results")
        @ExcludeMissing
        results: JsonField<List<VersionContentFolder>> = JsonMissing.of(),
        @JsonProperty("total") @ExcludeMissing total: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("paging") @ExcludeMissing paging: JsonField<Paging> = JsonMissing.of(),
    ) : this(results, total, paging, mutableMapOf())

    /**
     * Collection of content folder versions.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun results(): List<VersionContentFolder> = results.getRequired("results")

    /**
     * Total number of content folder versions.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun total(): Int = total.getRequired("total")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun paging(): Optional<Paging> = paging.getOptional("paging")

    /**
     * Returns the raw JSON value of [results].
     *
     * Unlike [results], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("results")
    @ExcludeMissing
    fun _results(): JsonField<List<VersionContentFolder>> = results

    /**
     * Returns the raw JSON value of [total].
     *
     * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Int> = total

    /**
     * Returns the raw JSON value of [paging].
     *
     * Unlike [paging], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("paging") @ExcludeMissing fun _paging(): JsonField<Paging> = paging

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
         * [CollectionResponseWithTotalVersionContentFolder].
         *
         * The following fields are required:
         * ```java
         * .results()
         * .total()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CollectionResponseWithTotalVersionContentFolder]. */
    class Builder internal constructor() {

        private var results: JsonField<MutableList<VersionContentFolder>>? = null
        private var total: JsonField<Int>? = null
        private var paging: JsonField<Paging> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            collectionResponseWithTotalVersionContentFolder:
                CollectionResponseWithTotalVersionContentFolder
        ) = apply {
            results =
                collectionResponseWithTotalVersionContentFolder.results.map { it.toMutableList() }
            total = collectionResponseWithTotalVersionContentFolder.total
            paging = collectionResponseWithTotalVersionContentFolder.paging
            additionalProperties =
                collectionResponseWithTotalVersionContentFolder.additionalProperties.toMutableMap()
        }

        /** Collection of content folder versions. */
        fun results(results: List<VersionContentFolder>) = results(JsonField.of(results))

        /**
         * Sets [Builder.results] to an arbitrary JSON value.
         *
         * You should usually call [Builder.results] with a well-typed `List<VersionContentFolder>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun results(results: JsonField<List<VersionContentFolder>>) = apply {
            this.results = results.map { it.toMutableList() }
        }

        /**
         * Adds a single [VersionContentFolder] to [results].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addResult(result: VersionContentFolder) = apply {
            results =
                (results ?: JsonField.of(mutableListOf())).also {
                    checkKnown("results", it).add(result)
                }
        }

        /** Total number of content folder versions. */
        fun total(total: Int) = total(JsonField.of(total))

        /**
         * Sets [Builder.total] to an arbitrary JSON value.
         *
         * You should usually call [Builder.total] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun total(total: JsonField<Int>) = apply { this.total = total }

        fun paging(paging: Paging) = paging(JsonField.of(paging))

        /**
         * Sets [Builder.paging] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paging] with a well-typed [Paging] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun paging(paging: JsonField<Paging>) = apply { this.paging = paging }

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
         * Returns an immutable instance of [CollectionResponseWithTotalVersionContentFolder].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .results()
         * .total()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CollectionResponseWithTotalVersionContentFolder =
            CollectionResponseWithTotalVersionContentFolder(
                checkRequired("results", results).map { it.toImmutable() },
                checkRequired("total", total),
                paging,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CollectionResponseWithTotalVersionContentFolder = apply {
        if (validated) {
            return@apply
        }

        results().forEach { it.validate() }
        total()
        paging().ifPresent { it.validate() }
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
        (results.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (total.asKnown().isPresent) 1 else 0) +
            (paging.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CollectionResponseWithTotalVersionContentFolder &&
            results == other.results &&
            total == other.total &&
            paging == other.paging &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(results, total, paging, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CollectionResponseWithTotalVersionContentFolder{results=$results, total=$total, paging=$paging, additionalProperties=$additionalProperties}"
}
