// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ListSearchRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val listIds: JsonField<List<String>>,
    private val offset: JsonField<Int>,
    private val processingTypes: JsonField<List<String>>,
    private val additionalFilterProperties: JsonField<List<String>>,
    private val count: JsonField<Int>,
    private val objectTypeId: JsonField<String>,
    private val query: JsonField<String>,
    private val sort: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("listIds")
        @ExcludeMissing
        listIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("offset") @ExcludeMissing offset: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("processingTypes")
        @ExcludeMissing
        processingTypes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("additional_filter_properties")
        @ExcludeMissing
        additionalFilterProperties: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("count") @ExcludeMissing count: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("objectTypeId")
        @ExcludeMissing
        objectTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("query") @ExcludeMissing query: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sort") @ExcludeMissing sort: JsonField<String> = JsonMissing.of(),
    ) : this(
        listIds,
        offset,
        processingTypes,
        additionalFilterProperties,
        count,
        objectTypeId,
        query,
        sort,
        mutableMapOf(),
    )

    /**
     * ILS list ids to be included in search results. If not specified, all lists matching other
     * criteria will be included
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun listIds(): List<String> = listIds.getRequired("listIds")

    /**
     * Value used to paginate through lists. The `offset` provided in the response can be used in
     * the next request to fetch the next page of results. Defaults to `0` if no offset is provided.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun offset(): Int = offset.getRequired("offset")

    /**
     * List processing types to be included in search results. If not specified, all lists with all
     * processing types will be included.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun processingTypes(): List<String> = processingTypes.getRequired("processingTypes")

    /**
     * The property names of any additional list properties to include in the response. Properties
     * that do not exist or that are empty for a particular list are not included in the response.
     *
     * By default, all requests will fetch the following properties for each list: `hs_list_size`,
     * `hs_last_record_added_at`, `hs_last_record_removed_at`, `hs_folder_name`, and
     * `hs_list_reference_count`.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun additionalFilterProperties(): Optional<List<String>> =
        additionalFilterProperties.getOptional("additional_filter_properties")

    /**
     * The number of lists to include in the response. Defaults to `20` if no value is provided. The
     * max `count` is `500`.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun count(): Optional<Int> = count.getOptional("count")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun objectTypeId(): Optional<String> = objectTypeId.getOptional("objectTypeId")

    /**
     * The `query` that will be used to search for lists by list name. If no `query` is provided,
     * then the results will include all lists.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun query(): Optional<String> = query.getOptional("query")

    /**
     * Sort field and order
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sort(): Optional<String> = sort.getOptional("sort")

    /**
     * Returns the raw JSON value of [listIds].
     *
     * Unlike [listIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("listIds") @ExcludeMissing fun _listIds(): JsonField<List<String>> = listIds

    /**
     * Returns the raw JSON value of [offset].
     *
     * Unlike [offset], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("offset") @ExcludeMissing fun _offset(): JsonField<Int> = offset

    /**
     * Returns the raw JSON value of [processingTypes].
     *
     * Unlike [processingTypes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("processingTypes")
    @ExcludeMissing
    fun _processingTypes(): JsonField<List<String>> = processingTypes

    /**
     * Returns the raw JSON value of [additionalFilterProperties].
     *
     * Unlike [additionalFilterProperties], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("additional_filter_properties")
    @ExcludeMissing
    fun _additionalFilterProperties(): JsonField<List<String>> = additionalFilterProperties

    /**
     * Returns the raw JSON value of [count].
     *
     * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Int> = count

    /**
     * Returns the raw JSON value of [objectTypeId].
     *
     * Unlike [objectTypeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectTypeId")
    @ExcludeMissing
    fun _objectTypeId(): JsonField<String> = objectTypeId

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
         * .listIds()
         * .offset()
         * .processingTypes()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ListSearchRequest]. */
    class Builder internal constructor() {

        private var listIds: JsonField<MutableList<String>>? = null
        private var offset: JsonField<Int>? = null
        private var processingTypes: JsonField<MutableList<String>>? = null
        private var additionalFilterProperties: JsonField<MutableList<String>>? = null
        private var count: JsonField<Int> = JsonMissing.of()
        private var objectTypeId: JsonField<String> = JsonMissing.of()
        private var query: JsonField<String> = JsonMissing.of()
        private var sort: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(listSearchRequest: ListSearchRequest) = apply {
            listIds = listSearchRequest.listIds.map { it.toMutableList() }
            offset = listSearchRequest.offset
            processingTypes = listSearchRequest.processingTypes.map { it.toMutableList() }
            additionalFilterProperties =
                listSearchRequest.additionalFilterProperties.map { it.toMutableList() }
            count = listSearchRequest.count
            objectTypeId = listSearchRequest.objectTypeId
            query = listSearchRequest.query
            sort = listSearchRequest.sort
            additionalProperties = listSearchRequest.additionalProperties.toMutableMap()
        }

        /**
         * ILS list ids to be included in search results. If not specified, all lists matching other
         * criteria will be included
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
         * List processing types to be included in search results. If not specified, all lists with
         * all processing types will be included.
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
         * The property names of any additional list properties to include in the response.
         * Properties that do not exist or that are empty for a particular list are not included in
         * the response.
         *
         * By default, all requests will fetch the following properties for each list:
         * `hs_list_size`, `hs_last_record_added_at`, `hs_last_record_removed_at`, `hs_folder_name`,
         * and `hs_list_reference_count`.
         */
        fun additionalFilterProperties(additionalFilterProperties: List<String>) =
            additionalFilterProperties(JsonField.of(additionalFilterProperties))

        /**
         * Sets [Builder.additionalFilterProperties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.additionalFilterProperties] with a well-typed
         * `List<String>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun additionalFilterProperties(additionalFilterProperties: JsonField<List<String>>) =
            apply {
                this.additionalFilterProperties =
                    additionalFilterProperties.map { it.toMutableList() }
            }

        /**
         * Adds a single [String] to [additionalFilterProperties].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAdditionalFilterProperty(additionalFilterProperty: String) = apply {
            additionalFilterProperties =
                (additionalFilterProperties ?: JsonField.of(mutableListOf())).also {
                    checkKnown("additionalFilterProperties", it).add(additionalFilterProperty)
                }
        }

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

        fun objectTypeId(objectTypeId: String) = objectTypeId(JsonField.of(objectTypeId))

        /**
         * Sets [Builder.objectTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectTypeId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun objectTypeId(objectTypeId: JsonField<String>) = apply {
            this.objectTypeId = objectTypeId
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

        /** Sort field and order */
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
         * .listIds()
         * .offset()
         * .processingTypes()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ListSearchRequest =
            ListSearchRequest(
                checkRequired("listIds", listIds).map { it.toImmutable() },
                checkRequired("offset", offset),
                checkRequired("processingTypes", processingTypes).map { it.toImmutable() },
                (additionalFilterProperties ?: JsonMissing.of()).map { it.toImmutable() },
                count,
                objectTypeId,
                query,
                sort,
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
    fun validate(): ListSearchRequest = apply {
        if (validated) {
            return@apply
        }

        listIds()
        offset()
        processingTypes()
        additionalFilterProperties()
        count()
        objectTypeId()
        query()
        sort()
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
        (listIds.asKnown().getOrNull()?.size ?: 0) +
            (if (offset.asKnown().isPresent) 1 else 0) +
            (processingTypes.asKnown().getOrNull()?.size ?: 0) +
            (additionalFilterProperties.asKnown().getOrNull()?.size ?: 0) +
            (if (count.asKnown().isPresent) 1 else 0) +
            (if (objectTypeId.asKnown().isPresent) 1 else 0) +
            (if (query.asKnown().isPresent) 1 else 0) +
            (if (sort.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ListSearchRequest &&
            listIds == other.listIds &&
            offset == other.offset &&
            processingTypes == other.processingTypes &&
            additionalFilterProperties == other.additionalFilterProperties &&
            count == other.count &&
            objectTypeId == other.objectTypeId &&
            query == other.query &&
            sort == other.sort &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            listIds,
            offset,
            processingTypes,
            additionalFilterProperties,
            count,
            objectTypeId,
            query,
            sort,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ListSearchRequest{listIds=$listIds, offset=$offset, processingTypes=$processingTypes, additionalFilterProperties=$additionalFilterProperties, count=$count, objectTypeId=$objectTypeId, query=$query, sort=$sort, additionalProperties=$additionalProperties}"
}
