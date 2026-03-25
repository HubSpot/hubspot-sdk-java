// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ListUpdateListFiltersParams
private constructor(
    private val listId: String?,
    private val enrollObjectsInWorkflows: Boolean?,
    private val listFilterUpdateRequest: ListFilterUpdateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun listId(): Optional<String> = Optional.ofNullable(listId)

    fun enrollObjectsInWorkflows(): Optional<Boolean> =
        Optional.ofNullable(enrollObjectsInWorkflows)

    fun listFilterUpdateRequest(): ListFilterUpdateRequest = listFilterUpdateRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        listFilterUpdateRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ListUpdateListFiltersParams].
         *
         * The following fields are required:
         * ```java
         * .listFilterUpdateRequest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ListUpdateListFiltersParams]. */
    class Builder internal constructor() {

        private var listId: String? = null
        private var enrollObjectsInWorkflows: Boolean? = null
        private var listFilterUpdateRequest: ListFilterUpdateRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(listUpdateListFiltersParams: ListUpdateListFiltersParams) = apply {
            listId = listUpdateListFiltersParams.listId
            enrollObjectsInWorkflows = listUpdateListFiltersParams.enrollObjectsInWorkflows
            listFilterUpdateRequest = listUpdateListFiltersParams.listFilterUpdateRequest
            additionalHeaders = listUpdateListFiltersParams.additionalHeaders.toBuilder()
            additionalQueryParams = listUpdateListFiltersParams.additionalQueryParams.toBuilder()
        }

        fun listId(listId: String?) = apply { this.listId = listId }

        /** Alias for calling [Builder.listId] with `listId.orElse(null)`. */
        fun listId(listId: Optional<String>) = listId(listId.getOrNull())

        fun enrollObjectsInWorkflows(enrollObjectsInWorkflows: Boolean?) = apply {
            this.enrollObjectsInWorkflows = enrollObjectsInWorkflows
        }

        /**
         * Alias for [Builder.enrollObjectsInWorkflows].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun enrollObjectsInWorkflows(enrollObjectsInWorkflows: Boolean) =
            enrollObjectsInWorkflows(enrollObjectsInWorkflows as Boolean?)

        /**
         * Alias for calling [Builder.enrollObjectsInWorkflows] with
         * `enrollObjectsInWorkflows.orElse(null)`.
         */
        fun enrollObjectsInWorkflows(enrollObjectsInWorkflows: Optional<Boolean>) =
            enrollObjectsInWorkflows(enrollObjectsInWorkflows.getOrNull())

        fun listFilterUpdateRequest(listFilterUpdateRequest: ListFilterUpdateRequest) = apply {
            this.listFilterUpdateRequest = listFilterUpdateRequest
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
         * Returns an immutable instance of [ListUpdateListFiltersParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .listFilterUpdateRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ListUpdateListFiltersParams =
            ListUpdateListFiltersParams(
                listId,
                enrollObjectsInWorkflows,
                checkRequired("listFilterUpdateRequest", listFilterUpdateRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): ListFilterUpdateRequest = listFilterUpdateRequest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> listId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                enrollObjectsInWorkflows?.let { put("enrollObjectsInWorkflows", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ListUpdateListFiltersParams &&
            listId == other.listId &&
            enrollObjectsInWorkflows == other.enrollObjectsInWorkflows &&
            listFilterUpdateRequest == other.listFilterUpdateRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            listId,
            enrollObjectsInWorkflows,
            listFilterUpdateRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ListUpdateListFiltersParams{listId=$listId, enrollObjectsInWorkflows=$enrollObjectsInWorkflows, listFilterUpdateRequest=$listFilterUpdateRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
