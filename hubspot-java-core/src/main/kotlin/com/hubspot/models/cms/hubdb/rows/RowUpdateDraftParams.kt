// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.hubdb.rows

import com.hubspot.core.JsonValue
import com.hubspot.core.Params
import com.hubspot.core.checkRequired
import com.hubspot.core.http.Headers
import com.hubspot.core.http.QueryParams
import com.hubspot.models.cms.hubdb.HubDbTableRowV3Request
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Partially update a single row in the table's draft version. All the column values need not be
 * specified. Only the columns or fields that needs to be modified can be specified. See the "Create
 * a row" endpoint for instructions on how to format the JSON row definitions.
 */
class RowUpdateDraftParams
private constructor(
    private val tableIdOrName: String,
    private val rowId: String?,
    private val hubDbTableRowV3Request: HubDbTableRowV3Request,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun tableIdOrName(): String = tableIdOrName

    fun rowId(): Optional<String> = Optional.ofNullable(rowId)

    fun hubDbTableRowV3Request(): HubDbTableRowV3Request = hubDbTableRowV3Request

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        hubDbTableRowV3Request._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RowUpdateDraftParams].
         *
         * The following fields are required:
         * ```java
         * .tableIdOrName()
         * .hubDbTableRowV3Request()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RowUpdateDraftParams]. */
    class Builder internal constructor() {

        private var tableIdOrName: String? = null
        private var rowId: String? = null
        private var hubDbTableRowV3Request: HubDbTableRowV3Request? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(rowUpdateDraftParams: RowUpdateDraftParams) = apply {
            tableIdOrName = rowUpdateDraftParams.tableIdOrName
            rowId = rowUpdateDraftParams.rowId
            hubDbTableRowV3Request = rowUpdateDraftParams.hubDbTableRowV3Request
            additionalHeaders = rowUpdateDraftParams.additionalHeaders.toBuilder()
            additionalQueryParams = rowUpdateDraftParams.additionalQueryParams.toBuilder()
        }

        fun tableIdOrName(tableIdOrName: String) = apply { this.tableIdOrName = tableIdOrName }

        fun rowId(rowId: String?) = apply { this.rowId = rowId }

        /** Alias for calling [Builder.rowId] with `rowId.orElse(null)`. */
        fun rowId(rowId: Optional<String>) = rowId(rowId.getOrNull())

        fun hubDbTableRowV3Request(hubDbTableRowV3Request: HubDbTableRowV3Request) = apply {
            this.hubDbTableRowV3Request = hubDbTableRowV3Request
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
         * Returns an immutable instance of [RowUpdateDraftParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .tableIdOrName()
         * .hubDbTableRowV3Request()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RowUpdateDraftParams =
            RowUpdateDraftParams(
                checkRequired("tableIdOrName", tableIdOrName),
                rowId,
                checkRequired("hubDbTableRowV3Request", hubDbTableRowV3Request),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): HubDbTableRowV3Request = hubDbTableRowV3Request

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> tableIdOrName
            1 -> rowId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RowUpdateDraftParams &&
            tableIdOrName == other.tableIdOrName &&
            rowId == other.rowId &&
            hubDbTableRowV3Request == other.hubDbTableRowV3Request &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            tableIdOrName,
            rowId,
            hubDbTableRowV3Request,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "RowUpdateDraftParams{tableIdOrName=$tableIdOrName, rowId=$rowId, hubDbTableRowV3Request=$hubDbTableRowV3Request, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
