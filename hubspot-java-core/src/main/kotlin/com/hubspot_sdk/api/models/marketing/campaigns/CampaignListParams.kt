// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.campaigns

import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * This endpoint allows users to search for and return a page of campaigns based on various query
 * parameters. Users can filter by name, sort, and paginate through the campaigns, as well as
 * control which properties are returned in the response.
 */
class CampaignListParams
private constructor(
    private val after: String?,
    private val limit: Int?,
    private val name: String?,
    private val properties: List<String>?,
    private val sort: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * A cursor for pagination. If provided, the results will start after the given cursor. Example:
     * NTI1Cg%3D%3D
     */
    fun after(): Optional<String> = Optional.ofNullable(after)

    /** The maximum number of results to return. Allowed values range from 1 to 100 Default: 50 */
    fun limit(): Optional<Int> = Optional.ofNullable(limit)

    /**
     * A filter to return campaigns whose names contain the specified substring. This allows partial
     * matching of campaign names, returning all campaigns that include the given substring in their
     * name. If this parameter is not provided, the search will return all campaigns
     */
    fun name(): Optional<String> = Optional.ofNullable(name)

    /**
     * A comma-separated list of the properties to be returned in the response. If any of the
     * specified properties has empty value on the requested object(s), they will be ignored and not
     * returned in response. If this parameter is empty, the response will include an empty
     * properties map
     */
    fun properties(): Optional<List<String>> = Optional.ofNullable(properties)

    /**
     * The field by which to sort the results. Allowed values are hs_name, createdAt, updatedAt. An
     * optional '-' before the property name can denote descending order Default: hs_name
     */
    fun sort(): Optional<String> = Optional.ofNullable(sort)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CampaignListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [CampaignListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CampaignListParams]. */
    class Builder internal constructor() {

        private var after: String? = null
        private var limit: Int? = null
        private var name: String? = null
        private var properties: MutableList<String>? = null
        private var sort: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(campaignListParams: CampaignListParams) = apply {
            after = campaignListParams.after
            limit = campaignListParams.limit
            name = campaignListParams.name
            properties = campaignListParams.properties?.toMutableList()
            sort = campaignListParams.sort
            additionalHeaders = campaignListParams.additionalHeaders.toBuilder()
            additionalQueryParams = campaignListParams.additionalQueryParams.toBuilder()
        }

        /**
         * A cursor for pagination. If provided, the results will start after the given cursor.
         * Example: NTI1Cg%3D%3D
         */
        fun after(after: String?) = apply { this.after = after }

        /** Alias for calling [Builder.after] with `after.orElse(null)`. */
        fun after(after: Optional<String>) = after(after.getOrNull())

        /**
         * The maximum number of results to return. Allowed values range from 1 to 100 Default: 50
         */
        fun limit(limit: Int?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Int) = limit(limit as Int?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Int>) = limit(limit.getOrNull())

        /**
         * A filter to return campaigns whose names contain the specified substring. This allows
         * partial matching of campaign names, returning all campaigns that include the given
         * substring in their name. If this parameter is not provided, the search will return all
         * campaigns
         */
        fun name(name: String?) = apply { this.name = name }

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * A comma-separated list of the properties to be returned in the response. If any of the
         * specified properties has empty value on the requested object(s), they will be ignored and
         * not returned in response. If this parameter is empty, the response will include an empty
         * properties map
         */
        fun properties(properties: List<String>?) = apply {
            this.properties = properties?.toMutableList()
        }

        /** Alias for calling [Builder.properties] with `properties.orElse(null)`. */
        fun properties(properties: Optional<List<String>>) = properties(properties.getOrNull())

        /**
         * Adds a single [String] to [properties].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProperty(property: String) = apply {
            properties = (properties ?: mutableListOf()).apply { add(property) }
        }

        /**
         * The field by which to sort the results. Allowed values are hs_name, createdAt, updatedAt.
         * An optional '-' before the property name can denote descending order Default: hs_name
         */
        fun sort(sort: String?) = apply { this.sort = sort }

        /** Alias for calling [Builder.sort] with `sort.orElse(null)`. */
        fun sort(sort: Optional<String>) = sort(sort.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [CampaignListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CampaignListParams =
            CampaignListParams(
                after,
                limit,
                name,
                properties?.toImmutable(),
                sort,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                after?.let { put("after", it) }
                limit?.let { put("limit", it.toString()) }
                name?.let { put("name", it) }
                properties?.let { put("properties", it.joinToString(",")) }
                sort?.let { put("sort", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CampaignListParams &&
            after == other.after &&
            limit == other.limit &&
            name == other.name &&
            properties == other.properties &&
            sort == other.sort &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(after, limit, name, properties, sort, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CampaignListParams{after=$after, limit=$limit, name=$name, properties=$properties, sort=$sort, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
