// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.imports

import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ImportListErrorsParams
private constructor(
    private val importId: Long?,
    private val after: String?,
    private val includeErrorMessage: Boolean?,
    private val includeRowData: Boolean?,
    private val limit: Int?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun importId(): Optional<Long> = Optional.ofNullable(importId)

    /**
     * The paging cursor token of the last successfully read resource will be returned as the
     * `paging.next.after` JSON property of a paged response containing more results.
     */
    fun after(): Optional<String> = Optional.ofNullable(after)

    /** Set to True to receive a message explaining the error. */
    fun includeErrorMessage(): Optional<Boolean> = Optional.ofNullable(includeErrorMessage)

    /** Set to True to receive the data values for the errored row. */
    fun includeRowData(): Optional<Boolean> = Optional.ofNullable(includeRowData)

    /** The maximum number of results to display per page. */
    fun limit(): Optional<Int> = Optional.ofNullable(limit)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ImportListErrorsParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ImportListErrorsParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ImportListErrorsParams]. */
    class Builder internal constructor() {

        private var importId: Long? = null
        private var after: String? = null
        private var includeErrorMessage: Boolean? = null
        private var includeRowData: Boolean? = null
        private var limit: Int? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(importListErrorsParams: ImportListErrorsParams) = apply {
            importId = importListErrorsParams.importId
            after = importListErrorsParams.after
            includeErrorMessage = importListErrorsParams.includeErrorMessage
            includeRowData = importListErrorsParams.includeRowData
            limit = importListErrorsParams.limit
            additionalHeaders = importListErrorsParams.additionalHeaders.toBuilder()
            additionalQueryParams = importListErrorsParams.additionalQueryParams.toBuilder()
        }

        fun importId(importId: Long?) = apply { this.importId = importId }

        /**
         * Alias for [Builder.importId].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun importId(importId: Long) = importId(importId as Long?)

        /** Alias for calling [Builder.importId] with `importId.orElse(null)`. */
        fun importId(importId: Optional<Long>) = importId(importId.getOrNull())

        /**
         * The paging cursor token of the last successfully read resource will be returned as the
         * `paging.next.after` JSON property of a paged response containing more results.
         */
        fun after(after: String?) = apply { this.after = after }

        /** Alias for calling [Builder.after] with `after.orElse(null)`. */
        fun after(after: Optional<String>) = after(after.getOrNull())

        /** Set to True to receive a message explaining the error. */
        fun includeErrorMessage(includeErrorMessage: Boolean?) = apply {
            this.includeErrorMessage = includeErrorMessage
        }

        /**
         * Alias for [Builder.includeErrorMessage].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeErrorMessage(includeErrorMessage: Boolean) =
            includeErrorMessage(includeErrorMessage as Boolean?)

        /**
         * Alias for calling [Builder.includeErrorMessage] with `includeErrorMessage.orElse(null)`.
         */
        fun includeErrorMessage(includeErrorMessage: Optional<Boolean>) =
            includeErrorMessage(includeErrorMessage.getOrNull())

        /** Set to True to receive the data values for the errored row. */
        fun includeRowData(includeRowData: Boolean?) = apply {
            this.includeRowData = includeRowData
        }

        /**
         * Alias for [Builder.includeRowData].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeRowData(includeRowData: Boolean) = includeRowData(includeRowData as Boolean?)

        /** Alias for calling [Builder.includeRowData] with `includeRowData.orElse(null)`. */
        fun includeRowData(includeRowData: Optional<Boolean>) =
            includeRowData(includeRowData.getOrNull())

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
         * Returns an immutable instance of [ImportListErrorsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ImportListErrorsParams =
            ImportListErrorsParams(
                importId,
                after,
                includeErrorMessage,
                includeRowData,
                limit,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> importId?.toString() ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                after?.let { put("after", it) }
                includeErrorMessage?.let { put("includeErrorMessage", it.toString()) }
                includeRowData?.let { put("includeRowData", it.toString()) }
                limit?.let { put("limit", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ImportListErrorsParams &&
            importId == other.importId &&
            after == other.after &&
            includeErrorMessage == other.includeErrorMessage &&
            includeRowData == other.includeRowData &&
            limit == other.limit &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            importId,
            after,
            includeErrorMessage,
            includeRowData,
            limit,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ImportListErrorsParams{importId=$importId, after=$after, includeErrorMessage=$includeErrorMessage, includeRowData=$includeRowData, limit=$limit, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
