// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.exports

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
import com.hubspot_sdk.api.models.crm.Filter
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class PublicCrmSearchRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val filters: JsonField<List<Filter>>,
    private val query: JsonField<String>,
    private val sorts: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("filters")
        @ExcludeMissing
        filters: JsonField<List<Filter>> = JsonMissing.of(),
        @JsonProperty("query") @ExcludeMissing query: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sorts") @ExcludeMissing sorts: JsonField<List<String>> = JsonMissing.of(),
    ) : this(filters, query, sorts, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filters(): List<Filter> = filters.getRequired("filters")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun query(): String = query.getRequired("query")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sorts(): List<String> = sorts.getRequired("sorts")

    /**
     * Returns the raw JSON value of [filters].
     *
     * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filters") @ExcludeMissing fun _filters(): JsonField<List<Filter>> = filters

    /**
     * Returns the raw JSON value of [query].
     *
     * Unlike [query], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("query") @ExcludeMissing fun _query(): JsonField<String> = query

    /**
     * Returns the raw JSON value of [sorts].
     *
     * Unlike [sorts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sorts") @ExcludeMissing fun _sorts(): JsonField<List<String>> = sorts

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
         * .filters()
         * .query()
         * .sorts()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicCrmSearchRequest]. */
    class Builder internal constructor() {

        private var filters: JsonField<MutableList<Filter>>? = null
        private var query: JsonField<String>? = null
        private var sorts: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicCrmSearchRequest: PublicCrmSearchRequest) = apply {
            filters = publicCrmSearchRequest.filters.map { it.toMutableList() }
            query = publicCrmSearchRequest.query
            sorts = publicCrmSearchRequest.sorts.map { it.toMutableList() }
            additionalProperties = publicCrmSearchRequest.additionalProperties.toMutableMap()
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

        fun query(query: String) = query(JsonField.of(query))

        /**
         * Sets [Builder.query] to an arbitrary JSON value.
         *
         * You should usually call [Builder.query] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun query(query: JsonField<String>) = apply { this.query = query }

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
         * .filters()
         * .query()
         * .sorts()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicCrmSearchRequest =
            PublicCrmSearchRequest(
                checkRequired("filters", filters).map { it.toImmutable() },
                checkRequired("query", query),
                checkRequired("sorts", sorts).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicCrmSearchRequest = apply {
        if (validated) {
            return@apply
        }

        filters().forEach { it.validate() }
        query()
        sorts()
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
        (filters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (query.asKnown().isPresent) 1 else 0) +
            (sorts.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicCrmSearchRequest &&
            filters == other.filters &&
            query == other.query &&
            sorts == other.sorts &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(filters, query, sorts, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicCrmSearchRequest{filters=$filters, query=$query, sorts=$sorts, additionalProperties=$additionalProperties}"
}
