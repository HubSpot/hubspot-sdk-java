// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.lists

import com.hubspot.core.Params
import com.hubspot.core.http.Headers
import com.hubspot.core.http.QueryParams
import com.hubspot.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ListListParams
private constructor(
    private val includeFilters: Boolean?,
    private val listIds: List<String>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun includeFilters(): Optional<Boolean> = Optional.ofNullable(includeFilters)

    fun listIds(): Optional<List<String>> = Optional.ofNullable(listIds)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ListListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ListListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ListListParams]. */
    class Builder internal constructor() {

        private var includeFilters: Boolean? = null
        private var listIds: MutableList<String>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(listListParams: ListListParams) = apply {
            includeFilters = listListParams.includeFilters
            listIds = listListParams.listIds?.toMutableList()
            additionalHeaders = listListParams.additionalHeaders.toBuilder()
            additionalQueryParams = listListParams.additionalQueryParams.toBuilder()
        }

        fun includeFilters(includeFilters: Boolean?) = apply {
            this.includeFilters = includeFilters
        }

        /**
         * Alias for [Builder.includeFilters].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeFilters(includeFilters: Boolean) = includeFilters(includeFilters as Boolean?)

        /** Alias for calling [Builder.includeFilters] with `includeFilters.orElse(null)`. */
        fun includeFilters(includeFilters: Optional<Boolean>) =
            includeFilters(includeFilters.getOrNull())

        fun listIds(listIds: List<String>?) = apply { this.listIds = listIds?.toMutableList() }

        /** Alias for calling [Builder.listIds] with `listIds.orElse(null)`. */
        fun listIds(listIds: Optional<List<String>>) = listIds(listIds.getOrNull())

        /**
         * Adds a single [String] to [listIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addListId(listId: String) = apply {
            listIds = (listIds ?: mutableListOf()).apply { add(listId) }
        }

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
         * Returns an immutable instance of [ListListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ListListParams =
            ListListParams(
                includeFilters,
                listIds?.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                includeFilters?.let { put("includeFilters", it.toString()) }
                listIds?.let { put("listIds", it.joinToString(",")) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ListListParams &&
            includeFilters == other.includeFilters &&
            listIds == other.listIds &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(includeFilters, listIds, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ListListParams{includeFilters=$includeFilters, listIds=$listIds, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
