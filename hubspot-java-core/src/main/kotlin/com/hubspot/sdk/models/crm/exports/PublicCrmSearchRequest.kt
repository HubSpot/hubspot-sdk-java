// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.exports

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
import com.hubspot.sdk.models.crm.Filter
import com.hubspot.sdk.models.crm.FilterGroup
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicCrmSearchRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val filterGroups: JsonField<List<FilterGroup>>,
    private val filters: JsonField<List<Filter>>,
    private val sorts: JsonField<List<String>>,
    private val query: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("filterGroups")
        @ExcludeMissing
        filterGroups: JsonField<List<FilterGroup>> = JsonMissing.of(),
        @JsonProperty("filters")
        @ExcludeMissing
        filters: JsonField<List<Filter>> = JsonMissing.of(),
        @JsonProperty("sorts") @ExcludeMissing sorts: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("query") @ExcludeMissing query: JsonField<String> = JsonMissing.of(),
    ) : this(filterGroups, filters, sorts, query, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filterGroups(): List<FilterGroup> = filterGroups.getRequired("filterGroups")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filters(): List<Filter> = filters.getRequired("filters")

    /**
     * Defines the order in which the CRM records should be returned.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sorts(): List<String> = sorts.getRequired("sorts")

    /**
     * The search query string, to filter CRM records.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun query(): Optional<String> = query.getOptional("query")

    /**
     * Returns the raw JSON value of [filterGroups].
     *
     * Unlike [filterGroups], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filterGroups")
    @ExcludeMissing
    fun _filterGroups(): JsonField<List<FilterGroup>> = filterGroups

    /**
     * Returns the raw JSON value of [filters].
     *
     * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filters") @ExcludeMissing fun _filters(): JsonField<List<Filter>> = filters

    /**
     * Returns the raw JSON value of [sorts].
     *
     * Unlike [sorts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sorts") @ExcludeMissing fun _sorts(): JsonField<List<String>> = sorts

    /**
     * Returns the raw JSON value of [query].
     *
     * Unlike [query], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("query") @ExcludeMissing fun _query(): JsonField<String> = query

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
         * Returns a mutable builder for constructing an instance of [PublicCrmSearchRequest].
         *
         * The following fields are required:
         * ```java
         * .filterGroups()
         * .filters()
         * .sorts()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicCrmSearchRequest]. */
    class Builder internal constructor() {

        private var filterGroups: JsonField<MutableList<FilterGroup>>? = null
        private var filters: JsonField<MutableList<Filter>>? = null
        private var sorts: JsonField<MutableList<String>>? = null
        private var query: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicCrmSearchRequest: PublicCrmSearchRequest) = apply {
            filterGroups = publicCrmSearchRequest.filterGroups.map { it.toMutableList() }
            filters = publicCrmSearchRequest.filters.map { it.toMutableList() }
            sorts = publicCrmSearchRequest.sorts.map { it.toMutableList() }
            query = publicCrmSearchRequest.query
            additionalProperties = publicCrmSearchRequest.additionalProperties.toMutableMap()
        }

        fun filterGroups(filterGroups: List<FilterGroup>) = filterGroups(JsonField.of(filterGroups))

        /**
         * Sets [Builder.filterGroups] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filterGroups] with a well-typed `List<FilterGroup>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun filterGroups(filterGroups: JsonField<List<FilterGroup>>) = apply {
            this.filterGroups = filterGroups.map { it.toMutableList() }
        }

        /**
         * Adds a single [FilterGroup] to [filterGroups].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFilterGroup(filterGroup: FilterGroup) = apply {
            filterGroups =
                (filterGroups ?: JsonField.of(mutableListOf())).also {
                    checkKnown("filterGroups", it).add(filterGroup)
                }
        }

        fun filters(filters: List<Filter>) = filters(JsonField.of(filters))

        /**
         * Sets [Builder.filters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filters] with a well-typed `List<Filter>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun filters(filters: JsonField<List<Filter>>) = apply {
            this.filters = filters.map { it.toMutableList() }
        }

        /**
         * Adds a single [Filter] to [filters].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFilter(filter: Filter) = apply {
            filters =
                (filters ?: JsonField.of(mutableListOf())).also {
                    checkKnown("filters", it).add(filter)
                }
        }

        /** Defines the order in which the CRM records should be returned. */
        fun sorts(sorts: List<String>) = sorts(JsonField.of(sorts))

        /**
         * Sets [Builder.sorts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sorts] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sorts(sorts: JsonField<List<String>>) = apply {
            this.sorts = sorts.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [sorts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSort(sort: String) = apply {
            sorts =
                (sorts ?: JsonField.of(mutableListOf())).also { checkKnown("sorts", it).add(sort) }
        }

        /** The search query string, to filter CRM records. */
        fun query(query: String) = query(JsonField.of(query))

        /**
         * Sets [Builder.query] to an arbitrary JSON value.
         *
         * You should usually call [Builder.query] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun query(query: JsonField<String>) = apply { this.query = query }

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
         * Returns an immutable instance of [PublicCrmSearchRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .filterGroups()
         * .filters()
         * .sorts()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicCrmSearchRequest =
            PublicCrmSearchRequest(
                checkRequired("filterGroups", filterGroups).map { it.toImmutable() },
                checkRequired("filters", filters).map { it.toImmutable() },
                checkRequired("sorts", sorts).map { it.toImmutable() },
                query,
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
    fun validate(): PublicCrmSearchRequest = apply {
        if (validated) {
            return@apply
        }

        filterGroups().forEach { it.validate() }
        filters().forEach { it.validate() }
        sorts()
        query()
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
        (filterGroups.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (filters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (sorts.asKnown().getOrNull()?.size ?: 0) +
            (if (query.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicCrmSearchRequest &&
            filterGroups == other.filterGroups &&
            filters == other.filters &&
            sorts == other.sorts &&
            query == other.query &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(filterGroups, filters, sorts, query, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicCrmSearchRequest{filterGroups=$filterGroups, filters=$filters, sorts=$sorts, query=$query, additionalProperties=$additionalProperties}"
}
