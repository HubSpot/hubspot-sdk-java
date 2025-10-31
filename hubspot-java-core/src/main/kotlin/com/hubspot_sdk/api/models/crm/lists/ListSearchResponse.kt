// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

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
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/**
 * The response object with the list search hits and additional information regarding pagination.
 */
class ListSearchResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val hasMore: JsonField<Boolean>,
    private val lists: JsonField<List<PublicObjectListSearchResult>>,
    private val offset: JsonField<Int>,
    private val total: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("hasMore") @ExcludeMissing hasMore: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("lists")
        @ExcludeMissing
        lists: JsonField<List<PublicObjectListSearchResult>> = JsonMissing.of(),
        @JsonProperty("offset") @ExcludeMissing offset: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("total") @ExcludeMissing total: JsonField<Int> = JsonMissing.of(),
    ) : this(hasMore, lists, offset, total, mutableMapOf())

    /**
     * Whether or not there are more results to page through.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hasMore(): Boolean = hasMore.getRequired("hasMore")

    /**
     * The lists that matched the search criteria.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lists(): List<PublicObjectListSearchResult> = lists.getRequired("lists")

    /**
     * Value to be passed in a future request to paginate through list search results.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun offset(): Int = offset.getRequired("offset")

    /**
     * The total number of lists that match the search criteria.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun total(): Int = total.getRequired("total")

    /**
     * Returns the raw JSON value of [hasMore].
     *
     * Unlike [hasMore], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hasMore") @ExcludeMissing fun _hasMore(): JsonField<Boolean> = hasMore

    /**
     * Returns the raw JSON value of [lists].
     *
     * Unlike [lists], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lists")
    @ExcludeMissing
    fun _lists(): JsonField<List<PublicObjectListSearchResult>> = lists

    /**
     * Returns the raw JSON value of [offset].
     *
     * Unlike [offset], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("offset") @ExcludeMissing fun _offset(): JsonField<Int> = offset

    /**
     * Returns the raw JSON value of [total].
     *
     * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Int> = total

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
         * Returns a mutable builder for constructing an instance of [ListSearchResponse].
         *
         * The following fields are required:
         * ```java
         * .hasMore()
         * .lists()
         * .offset()
         * .total()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ListSearchResponse]. */
    class Builder internal constructor() {

        private var hasMore: JsonField<Boolean>? = null
        private var lists: JsonField<MutableList<PublicObjectListSearchResult>>? = null
        private var offset: JsonField<Int>? = null
        private var total: JsonField<Int>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(listSearchResponse: ListSearchResponse) = apply {
            hasMore = listSearchResponse.hasMore
            lists = listSearchResponse.lists.map { it.toMutableList() }
            offset = listSearchResponse.offset
            total = listSearchResponse.total
            additionalProperties = listSearchResponse.additionalProperties.toMutableMap()
        }

        /** Whether or not there are more results to page through. */
        fun hasMore(hasMore: Boolean) = hasMore(JsonField.of(hasMore))

        /**
         * Sets [Builder.hasMore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasMore] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hasMore(hasMore: JsonField<Boolean>) = apply { this.hasMore = hasMore }

        /** The lists that matched the search criteria. */
        fun lists(lists: List<PublicObjectListSearchResult>) = lists(JsonField.of(lists))

        /**
         * Sets [Builder.lists] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lists] with a well-typed
         * `List<PublicObjectListSearchResult>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun lists(lists: JsonField<List<PublicObjectListSearchResult>>) = apply {
            this.lists = lists.map { it.toMutableList() }
        }

        /**
         * Adds a single [PublicObjectListSearchResult] to [lists].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addList(list: PublicObjectListSearchResult) = apply {
            lists =
                (lists ?: JsonField.of(mutableListOf())).also { checkKnown("lists", it).add(list) }
        }

        /** Value to be passed in a future request to paginate through list search results. */
        fun offset(offset: Int) = offset(JsonField.of(offset))

        /**
         * Sets [Builder.offset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.offset] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun offset(offset: JsonField<Int>) = apply { this.offset = offset }

        /** The total number of lists that match the search criteria. */
        fun total(total: Int) = total(JsonField.of(total))

        /**
         * Sets [Builder.total] to an arbitrary JSON value.
         *
         * You should usually call [Builder.total] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun total(total: JsonField<Int>) = apply { this.total = total }

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
         * Returns an immutable instance of [ListSearchResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .hasMore()
         * .lists()
         * .offset()
         * .total()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ListSearchResponse =
            ListSearchResponse(
                checkRequired("hasMore", hasMore),
                checkRequired("lists", lists).map { it.toImmutable() },
                checkRequired("offset", offset),
                checkRequired("total", total),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ListSearchResponse = apply {
        if (validated) {
            return@apply
        }

        hasMore()
        lists().forEach { it.validate() }
        offset()
        total()
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
        (if (hasMore.asKnown().isPresent) 1 else 0) +
            (lists.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (offset.asKnown().isPresent) 1 else 0) +
            (if (total.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ListSearchResponse &&
            hasMore == other.hasMore &&
            lists == other.lists &&
            offset == other.offset &&
            total == other.total &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(hasMore, lists, offset, total, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ListSearchResponse{hasMore=$hasMore, lists=$lists, offset=$offset, total=$total, additionalProperties=$additionalProperties}"
}
