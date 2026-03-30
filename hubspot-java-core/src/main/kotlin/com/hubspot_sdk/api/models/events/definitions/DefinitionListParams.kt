// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.definitions

import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Retrieve existing custom event definitions. */
class DefinitionListParams
private constructor(
    private val after: String?,
    private val includeProperties: Boolean?,
    private val limit: Int?,
    private val searchString: String?,
    private val sortOrder: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The paging cursor token of the last successfully read resource will be returned as the
     * `paging.next.after` JSON property of a paged response containing more results.
     */
    fun after(): Optional<String> = Optional.ofNullable(after)

    fun includeProperties(): Optional<Boolean> = Optional.ofNullable(includeProperties)

    /** The maximum number of results to display per page. */
    fun limit(): Optional<Int> = Optional.ofNullable(limit)

    fun searchString(): Optional<String> = Optional.ofNullable(searchString)

    fun sortOrder(): Optional<String> = Optional.ofNullable(sortOrder)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): DefinitionListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [DefinitionListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DefinitionListParams]. */
    class Builder internal constructor() {

        private var after: String? = null
        private var includeProperties: Boolean? = null
        private var limit: Int? = null
        private var searchString: String? = null
        private var sortOrder: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(definitionListParams: DefinitionListParams) = apply {
            after = definitionListParams.after
            includeProperties = definitionListParams.includeProperties
            limit = definitionListParams.limit
            searchString = definitionListParams.searchString
            sortOrder = definitionListParams.sortOrder
            additionalHeaders = definitionListParams.additionalHeaders.toBuilder()
            additionalQueryParams = definitionListParams.additionalQueryParams.toBuilder()
        }

        /**
         * The paging cursor token of the last successfully read resource will be returned as the
         * `paging.next.after` JSON property of a paged response containing more results.
         */
        fun after(after: String?) = apply { this.after = after }

        /** Alias for calling [Builder.after] with `after.orElse(null)`. */
        fun after(after: Optional<String>) = after(after.getOrNull())

        fun includeProperties(includeProperties: Boolean?) = apply {
            this.includeProperties = includeProperties
        }

        /**
         * Alias for [Builder.includeProperties].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeProperties(includeProperties: Boolean) =
            includeProperties(includeProperties as Boolean?)

        /** Alias for calling [Builder.includeProperties] with `includeProperties.orElse(null)`. */
        fun includeProperties(includeProperties: Optional<Boolean>) =
            includeProperties(includeProperties.getOrNull())

        /** The maximum number of results to display per page. */
        fun limit(limit: Int?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Int) = limit(limit as Int?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Int>) = limit(limit.getOrNull())

        fun searchString(searchString: String?) = apply { this.searchString = searchString }

        /** Alias for calling [Builder.searchString] with `searchString.orElse(null)`. */
        fun searchString(searchString: Optional<String>) = searchString(searchString.getOrNull())

        fun sortOrder(sortOrder: String?) = apply { this.sortOrder = sortOrder }

        /** Alias for calling [Builder.sortOrder] with `sortOrder.orElse(null)`. */
        fun sortOrder(sortOrder: Optional<String>) = sortOrder(sortOrder.getOrNull())

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
         * Returns an immutable instance of [DefinitionListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DefinitionListParams =
            DefinitionListParams(
                after,
                includeProperties,
                limit,
                searchString,
                sortOrder,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                after?.let { put("after", it) }
                includeProperties?.let { put("includeProperties", it.toString()) }
                limit?.let { put("limit", it.toString()) }
                searchString?.let { put("searchString", it) }
                sortOrder?.let { put("sortOrder", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DefinitionListParams &&
            after == other.after &&
            includeProperties == other.includeProperties &&
            limit == other.limit &&
            searchString == other.searchString &&
            sortOrder == other.sortOrder &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            after,
            includeProperties,
            limit,
            searchString,
            sortOrder,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "DefinitionListParams{after=$after, includeProperties=$includeProperties, limit=$limit, searchString=$searchString, sortOrder=$sortOrder, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
