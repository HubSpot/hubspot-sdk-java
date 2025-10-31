// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Update the name of a list. The name must be globally unique relative to all other public lists in
 * the portal.
 */
class ListUpdateNameParams
private constructor(
    private val listId: String?,
    private val includeFilters: Boolean?,
    private val listName: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) : Params {

    fun listId(): Optional<String> = Optional.ofNullable(listId)

    /**
     * A flag indicating whether or not the response object list definition should include a filter
     * branch definition. By default, object list definitions will not have their filter branch
     * definitions included in the response.
     */
    fun includeFilters(): Optional<Boolean> = Optional.ofNullable(includeFilters)

    /** The name to update the list to. */
    fun listName(): Optional<String> = Optional.ofNullable(listName)

    /** Additional body properties to send with the request. */
    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ListUpdateNameParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ListUpdateNameParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ListUpdateNameParams]. */
    class Builder internal constructor() {

        private var listId: String? = null
        private var includeFilters: Boolean? = null
        private var listName: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(listUpdateNameParams: ListUpdateNameParams) = apply {
            listId = listUpdateNameParams.listId
            includeFilters = listUpdateNameParams.includeFilters
            listName = listUpdateNameParams.listName
            additionalHeaders = listUpdateNameParams.additionalHeaders.toBuilder()
            additionalQueryParams = listUpdateNameParams.additionalQueryParams.toBuilder()
            additionalBodyProperties = listUpdateNameParams.additionalBodyProperties.toMutableMap()
        }

        fun listId(listId: String?) = apply { this.listId = listId }

        /** Alias for calling [Builder.listId] with `listId.orElse(null)`. */
        fun listId(listId: Optional<String>) = listId(listId.getOrNull())

        /**
         * A flag indicating whether or not the response object list definition should include a
         * filter branch definition. By default, object list definitions will not have their filter
         * branch definitions included in the response.
         */
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

        /** The name to update the list to. */
        fun listName(listName: String?) = apply { this.listName = listName }

        /** Alias for calling [Builder.listName] with `listName.orElse(null)`. */
        fun listName(listName: Optional<String>) = listName(listName.getOrNull())

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        /**
         * Returns an immutable instance of [ListUpdateNameParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ListUpdateNameParams =
            ListUpdateNameParams(
                listId,
                includeFilters,
                listName,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    fun _body(): Optional<Map<String, JsonValue>> =
        Optional.ofNullable(additionalBodyProperties.ifEmpty { null })

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> listId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                includeFilters?.let { put("includeFilters", it.toString()) }
                listName?.let { put("listName", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ListUpdateNameParams &&
            listId == other.listId &&
            includeFilters == other.includeFilters &&
            listName == other.listName &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams &&
            additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int =
        Objects.hash(
            listId,
            includeFilters,
            listName,
            additionalHeaders,
            additionalQueryParams,
            additionalBodyProperties,
        )

    override fun toString() =
        "ListUpdateNameParams{listId=$listId, includeFilters=$includeFilters, listName=$listName, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
