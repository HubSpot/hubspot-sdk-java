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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** The request object used for searching through lists. */
class ListSearchRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val additionalProperties: JsonField<List<String>>,
    private val offset: JsonField<Int>,
    private val count: JsonField<Int>,
    private val listIds: JsonField<List<String>>,
    private val processingTypes: JsonField<List<String>>,
    private val query: JsonField<String>,
    private val sort: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("additionalProperties")
        @ExcludeMissing
        additionalProperties: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("offset") @ExcludeMissing offset: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("count") @ExcludeMissing count: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("listIds")
        @ExcludeMissing
        listIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("processingTypes")
        @ExcludeMissing
        processingTypes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("query") @ExcludeMissing query: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sort") @ExcludeMissing sort: JsonField<String> = JsonMissing.of(),
    ) : this(
        additionalProperties,
        offset,
        count,
        listIds,
        processingTypes,
        query,
        sort,
        mutableMapOf(),
    )

    /**
     * The property names of any additional list properties to include in the response. Properties
     * that do not exist or that are empty for a particular list are not included in the response.
     *
     * By default, all requests will fetch the following properties for each list: `hs_list_size`,
     * `hs_last_record_added_at`, `hs_last_record_removed_at`, `hs_folder_name`, and
     * `hs_list_reference_count`.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun additionalProperties(): List<String> =
        additionalProperties.getRequired("additionalProperties")

    /**
     * Value used to paginate through lists. The `offset` provided in the response can be used in
     * the next request to fetch the next page of results. Defaults to `0` if no offset is provided.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun offset(): Int = offset.getRequired("offset")

    /**
     * The number of lists to include in the response. Defaults to `20` if no value is provided. The
     * max `count` is `500`.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun count(): Optional<Int> = count.getOptional("count")

    /**
     * The `listIds` that will be used to filter results by `listId`. If values are provided, then
     * the response will only include results that have a `listId` in this array.
     *
     * If no value is provided, or if an empty list is provided, then the results will not be
     * filtered by `listId`.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun listIds(): Optional<List<String>> = listIds.getOptional("listIds")

    /**
     * The `processingTypes` that will be used to filter results by `processingType`. If values are
     * provided, then the response will only include results that have a `processingType` in this
     * array.
     *
     * If no value is provided, or if an empty list is provided, then results will not be filtered
     * by `processingType`.
     *
     * Valid `processingTypes` are: `MANUAL`, `SNAPSHOT`, or `DYNAMIC`.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun processingTypes(): Optional<List<String>> = processingTypes.getOptional("processingTypes")

    /**
     * The `query` that will be used to search for lists by list name. If no `query` is provided,
     * then the results will include all lists.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun query(): Optional<String> = query.getOptional("query")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sort(): Optional<String> = sort.getOptional("sort")

    /**
     * Returns the raw JSON value of [additionalProperties].
     *
     * Unlike [additionalProperties], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("additionalProperties")
    @ExcludeMissing
    fun _additionalProperties(): JsonField<List<String>> = additionalProperties

    /**
     * Returns the raw JSON value of [offset].
     *
     * Unlike [offset], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("offset") @ExcludeMissing fun _offset(): JsonField<Int> = offset

    /**
     * Returns the raw JSON value of [count].
     *
     * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Int> = count

    /**
     * Returns the raw JSON value of [listIds].
     *
     * Unlike [listIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("listIds") @ExcludeMissing fun _listIds(): JsonField<List<String>> = listIds

    /**
     * Returns the raw JSON value of [processingTypes].
     *
     * Unlike [processingTypes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("processingTypes")
    @ExcludeMissing
    fun _processingTypes(): JsonField<List<String>> = processingTypes

    /**
     * Returns the raw JSON value of [query].
     *
     * Unlike [query], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("query") @ExcludeMissing fun _query(): JsonField<String> = query

    /**
     * Returns the raw JSON value of [sort].
     *
     * Unlike [sort], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sort") @ExcludeMissing fun _sort(): JsonField<String> = sort

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
         * Returns a mutable builder for constructing an instance of [ListSearchRequest].
         *
         * The following fields are required:
         * ```java
         * .additionalProperties()
         * .offset()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ListSearchRequest]. */
    class Builder internal constructor() {

        private var additionalProperties: JsonField<MutableList<String>>? = null
        private var offset: JsonField<Int>? = null
        private var count: JsonField<Int> = JsonMissing.of()
        private var listIds: JsonField<MutableList<String>>? = null
        private var processingTypes: JsonField<MutableList<String>>? = null
        private var query: JsonField<String> = JsonMissing.of()
        private var sort: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(listSearchRequest: ListSearchRequest) = apply {
            additionalProperties = listSearchRequest.additionalProperties.map { it.toMutableList() }
            offset = listSearchRequest.offset
            count = listSearchRequest.count
            listIds = listSearchRequest.listIds.map { it.toMutableList() }
            processingTypes = listSearchRequest.processingTypes.map { it.toMutableList() }
            query = listSearchRequest.query
            sort = listSearchRequest.sort
            additionalProperties = listSearchRequest.additionalProperties.toMutableMap()
        }

        /**
         * The property names of any additional list properties to include in the response.
         * Properties that do not exist or that are empty for a particular list are not included in
         * the response.
         *
         * By default, all requests will fetch the following properties for each list:
         * `hs_list_size`, `hs_last_record_added_at`, `hs_last_record_removed_at`, `hs_folder_name`,
         * and `hs_list_reference_count`.
         */
        fun additionalProperties(additionalProperties: List<String>) =
            additionalProperties(JsonField.of(additionalProperties))

        /**
         * Sets [Builder.additionalProperties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.additionalProperties] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun additionalProperties(additionalProperties: JsonField<List<String>>) = apply {
            this.additionalProperties = additionalProperties.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [additionalProperties].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAdditionalProperty(additionalProperty: String) = apply {
            additionalProperties =
                (additionalProperties ?: JsonField.of(mutableListOf())).also {
                    checkKnown("additionalProperties", it).add(additionalProperty)
                }
        }

        /**
         * Value used to paginate through lists. The `offset` provided in the response can be used
         * in the next request to fetch the next page of results. Defaults to `0` if no offset is
         * provided.
         */
        fun offset(offset: Int) = offset(JsonField.of(offset))

        /**
         * Sets [Builder.offset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.offset] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun offset(offset: JsonField<Int>) = apply { this.offset = offset }

        /**
         * The number of lists to include in the response. Defaults to `20` if no value is provided.
         * The max `count` is `500`.
         */
        fun count(count: Int) = count(JsonField.of(count))

        /**
         * Sets [Builder.count] to an arbitrary JSON value.
         *
         * You should usually call [Builder.count] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun count(count: JsonField<Int>) = apply { this.count = count }

        /**
         * The `listIds` that will be used to filter results by `listId`. If values are provided,
         * then the response will only include results that have a `listId` in this array.
         *
         * If no value is provided, or if an empty list is provided, then the results will not be
         * filtered by `listId`.
         */
        fun listIds(listIds: List<String>) = listIds(JsonField.of(listIds))

        /**
         * Sets [Builder.listIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.listIds] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun listIds(listIds: JsonField<List<String>>) = apply {
            this.listIds = listIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [listIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addListId(listId: String) = apply {
            listIds =
                (listIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("listIds", it).add(listId)
                }
        }

        /**
         * The `processingTypes` that will be used to filter results by `processingType`. If values
         * are provided, then the response will only include results that have a `processingType` in
         * this array.
         *
         * If no value is provided, or if an empty list is provided, then results will not be
         * filtered by `processingType`.
         *
         * Valid `processingTypes` are: `MANUAL`, `SNAPSHOT`, or `DYNAMIC`.
         */
        fun processingTypes(processingTypes: List<String>) =
            processingTypes(JsonField.of(processingTypes))

        /**
         * Sets [Builder.processingTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.processingTypes] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun processingTypes(processingTypes: JsonField<List<String>>) = apply {
            this.processingTypes = processingTypes.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [processingTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProcessingType(processingType: String) = apply {
            processingTypes =
                (processingTypes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("processingTypes", it).add(processingType)
                }
        }

        /**
         * The `query` that will be used to search for lists by list name. If no `query` is
         * provided, then the results will include all lists.
         */
        fun query(query: String) = query(JsonField.of(query))

        /**
         * Sets [Builder.query] to an arbitrary JSON value.
         *
         * You should usually call [Builder.query] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun query(query: JsonField<String>) = apply { this.query = query }

        fun sort(sort: String) = sort(JsonField.of(sort))

        /**
         * Sets [Builder.sort] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sort] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sort(sort: JsonField<String>) = apply { this.sort = sort }

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
         * Returns an immutable instance of [ListSearchRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .additionalProperties()
         * .offset()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ListSearchRequest =
            ListSearchRequest(
                checkRequired("additionalProperties", additionalProperties).map {
                    it.toImmutable()
                },
                checkRequired("offset", offset),
                count,
                (listIds ?: JsonMissing.of()).map { it.toImmutable() },
                (processingTypes ?: JsonMissing.of()).map { it.toImmutable() },
                query,
                sort,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ListSearchRequest = apply {
        if (validated) {
            return@apply
        }

        additionalProperties()
        offset()
        count()
        listIds()
        processingTypes()
        query()
        sort()
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
        (additionalProperties.asKnown().getOrNull()?.size ?: 0) +
            (if (offset.asKnown().isPresent) 1 else 0) +
            (if (count.asKnown().isPresent) 1 else 0) +
            (listIds.asKnown().getOrNull()?.size ?: 0) +
            (processingTypes.asKnown().getOrNull()?.size ?: 0) +
            (if (query.asKnown().isPresent) 1 else 0) +
            (if (sort.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ListSearchRequest &&
            additionalProperties == other.additionalProperties &&
            offset == other.offset &&
            count == other.count &&
            listIds == other.listIds &&
            processingTypes == other.processingTypes &&
            query == other.query &&
            sort == other.sort &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            additionalProperties,
            offset,
            count,
            listIds,
            processingTypes,
            query,
            sort,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ListSearchRequest{additionalProperties=$additionalProperties, offset=$offset, count=$count, listIds=$listIds, processingTypes=$processingTypes, query=$query, sort=$sort, additionalProperties=$additionalProperties}"
}
