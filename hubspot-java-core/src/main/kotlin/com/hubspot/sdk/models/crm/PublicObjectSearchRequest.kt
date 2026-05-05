// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm

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

/** Describes a search request */
class PublicObjectSearchRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val after: JsonField<String>,
    private val filterGroups: JsonField<List<FilterGroup>>,
    private val limit: JsonField<Int>,
    private val properties: JsonField<List<String>>,
    private val sorts: JsonField<List<String>>,
    private val query: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("after") @ExcludeMissing after: JsonField<String> = JsonMissing.of(),
        @JsonProperty("filterGroups")
        @ExcludeMissing
        filterGroups: JsonField<List<FilterGroup>> = JsonMissing.of(),
        @JsonProperty("limit") @ExcludeMissing limit: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("properties")
        @ExcludeMissing
        properties: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("sorts") @ExcludeMissing sorts: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("query") @ExcludeMissing query: JsonField<String> = JsonMissing.of(),
    ) : this(after, filterGroups, limit, properties, sorts, query, mutableMapOf())

    /**
     * A paging cursor token for retrieving subsequent pages.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun after(): String = after.getRequired("after")

    /**
     * Up to 6 groups of filters defining additional query criteria.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filterGroups(): List<FilterGroup> = filterGroups.getRequired("filterGroups")

    /**
     * The maximum results to return, up to 200 objects.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun limit(): Int = limit.getRequired("limit")

    /**
     * A list of property names to include in the response.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun properties(): List<String> = properties.getRequired("properties")

    /**
     * Specifies sorting order based on object properties.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sorts(): List<String> = sorts.getRequired("sorts")

    /**
     * The search query string, up to 3000 characters.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun query(): Optional<String> = query.getOptional("query")

    /**
     * Returns the raw JSON value of [after].
     *
     * Unlike [after], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("after") @ExcludeMissing fun _after(): JsonField<String> = after

    /**
     * Returns the raw JSON value of [filterGroups].
     *
     * Unlike [filterGroups], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filterGroups")
    @ExcludeMissing
    fun _filterGroups(): JsonField<List<FilterGroup>> = filterGroups

    /**
     * Returns the raw JSON value of [limit].
     *
     * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Int> = limit

    /**
     * Returns the raw JSON value of [properties].
     *
     * Unlike [properties], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("properties")
    @ExcludeMissing
    fun _properties(): JsonField<List<String>> = properties

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
         * Returns a mutable builder for constructing an instance of [PublicObjectSearchRequest].
         *
         * The following fields are required:
         * ```java
         * .after()
         * .filterGroups()
         * .limit()
         * .properties()
         * .sorts()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicObjectSearchRequest]. */
    class Builder internal constructor() {

        private var after: JsonField<String>? = null
        private var filterGroups: JsonField<MutableList<FilterGroup>>? = null
        private var limit: JsonField<Int>? = null
        private var properties: JsonField<MutableList<String>>? = null
        private var sorts: JsonField<MutableList<String>>? = null
        private var query: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicObjectSearchRequest: PublicObjectSearchRequest) = apply {
            after = publicObjectSearchRequest.after
            filterGroups = publicObjectSearchRequest.filterGroups.map { it.toMutableList() }
            limit = publicObjectSearchRequest.limit
            properties = publicObjectSearchRequest.properties.map { it.toMutableList() }
            sorts = publicObjectSearchRequest.sorts.map { it.toMutableList() }
            query = publicObjectSearchRequest.query
            additionalProperties = publicObjectSearchRequest.additionalProperties.toMutableMap()
        }

        /** A paging cursor token for retrieving subsequent pages. */
        fun after(after: String) = after(JsonField.of(after))

        /**
         * Sets [Builder.after] to an arbitrary JSON value.
         *
         * You should usually call [Builder.after] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun after(after: JsonField<String>) = apply { this.after = after }

        /** Up to 6 groups of filters defining additional query criteria. */
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

        /** The maximum results to return, up to 200 objects. */
        fun limit(limit: Int) = limit(JsonField.of(limit))

        /**
         * Sets [Builder.limit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limit] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun limit(limit: JsonField<Int>) = apply { this.limit = limit }

        /** A list of property names to include in the response. */
        fun properties(properties: List<String>) = properties(JsonField.of(properties))

        /**
         * Sets [Builder.properties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.properties] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun properties(properties: JsonField<List<String>>) = apply {
            this.properties = properties.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [properties].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProperty(property: String) = apply {
            properties =
                (properties ?: JsonField.of(mutableListOf())).also {
                    checkKnown("properties", it).add(property)
                }
        }

        /** Specifies sorting order based on object properties. */
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

        /** The search query string, up to 3000 characters. */
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
         * Returns an immutable instance of [PublicObjectSearchRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .after()
         * .filterGroups()
         * .limit()
         * .properties()
         * .sorts()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicObjectSearchRequest =
            PublicObjectSearchRequest(
                checkRequired("after", after),
                checkRequired("filterGroups", filterGroups).map { it.toImmutable() },
                checkRequired("limit", limit),
                checkRequired("properties", properties).map { it.toImmutable() },
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
    fun validate(): PublicObjectSearchRequest = apply {
        if (validated) {
            return@apply
        }

        after()
        filterGroups().forEach { it.validate() }
        limit()
        properties()
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
        (if (after.asKnown().isPresent) 1 else 0) +
            (filterGroups.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (limit.asKnown().isPresent) 1 else 0) +
            (properties.asKnown().getOrNull()?.size ?: 0) +
            (sorts.asKnown().getOrNull()?.size ?: 0) +
            (if (query.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicObjectSearchRequest &&
            after == other.after &&
            filterGroups == other.filterGroups &&
            limit == other.limit &&
            properties == other.properties &&
            sorts == other.sorts &&
            query == other.query &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(after, filterGroups, limit, properties, sorts, query, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicObjectSearchRequest{after=$after, filterGroups=$filterGroups, limit=$limit, properties=$properties, sorts=$sorts, query=$query, additionalProperties=$additionalProperties}"
}
