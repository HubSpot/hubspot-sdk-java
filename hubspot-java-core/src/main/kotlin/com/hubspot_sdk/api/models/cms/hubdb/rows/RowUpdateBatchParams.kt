// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.hubdb.rows

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.models.cms.hubdb.BatchInputHubDbTableRowV3BatchUpdateRequest
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Updates multiple rows as a batch in the draft version of the table, with a maximum of 100 rows
 * per call. See the endpoint `PATCH /tables/{tableIdOrName}/rows/{rowId}/draft` for details on
 * updating a single row.
 */
class RowUpdateBatchParams
private constructor(
    private val tableIdOrName: String?,
    private val batchInputHubDbTableRowV3BatchUpdateRequest:
        BatchInputHubDbTableRowV3BatchUpdateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun tableIdOrName(): Optional<String> = Optional.ofNullable(tableIdOrName)

    fun batchInputHubDbTableRowV3BatchUpdateRequest(): BatchInputHubDbTableRowV3BatchUpdateRequest =
        batchInputHubDbTableRowV3BatchUpdateRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        batchInputHubDbTableRowV3BatchUpdateRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RowUpdateBatchParams].
         *
         * The following fields are required:
         * ```java
         * .batchInputHubDbTableRowV3BatchUpdateRequest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RowUpdateBatchParams]. */
    class Builder internal constructor() {

        private var tableIdOrName: String? = null
        private var batchInputHubDbTableRowV3BatchUpdateRequest:
            BatchInputHubDbTableRowV3BatchUpdateRequest? =
            null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(rowUpdateBatchParams: RowUpdateBatchParams) = apply {
            tableIdOrName = rowUpdateBatchParams.tableIdOrName
            batchInputHubDbTableRowV3BatchUpdateRequest =
                rowUpdateBatchParams.batchInputHubDbTableRowV3BatchUpdateRequest
            additionalHeaders = rowUpdateBatchParams.additionalHeaders.toBuilder()
            additionalQueryParams = rowUpdateBatchParams.additionalQueryParams.toBuilder()
        }

        fun tableIdOrName(tableIdOrName: String?) = apply { this.tableIdOrName = tableIdOrName }

        /** Alias for calling [Builder.tableIdOrName] with `tableIdOrName.orElse(null)`. */
        fun tableIdOrName(tableIdOrName: Optional<String>) =
            tableIdOrName(tableIdOrName.getOrNull())

        fun batchInputHubDbTableRowV3BatchUpdateRequest(
            batchInputHubDbTableRowV3BatchUpdateRequest: BatchInputHubDbTableRowV3BatchUpdateRequest
        ) = apply {
            this.batchInputHubDbTableRowV3BatchUpdateRequest =
                batchInputHubDbTableRowV3BatchUpdateRequest
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
         * Returns an immutable instance of [RowUpdateBatchParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .batchInputHubDbTableRowV3BatchUpdateRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RowUpdateBatchParams =
            RowUpdateBatchParams(
                tableIdOrName,
                checkRequired(
                    "batchInputHubDbTableRowV3BatchUpdateRequest",
                    batchInputHubDbTableRowV3BatchUpdateRequest,
                ),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): BatchInputHubDbTableRowV3BatchUpdateRequest =
        batchInputHubDbTableRowV3BatchUpdateRequest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> tableIdOrName ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RowUpdateBatchParams &&
            tableIdOrName == other.tableIdOrName &&
            batchInputHubDbTableRowV3BatchUpdateRequest ==
                other.batchInputHubDbTableRowV3BatchUpdateRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            tableIdOrName,
            batchInputHubDbTableRowV3BatchUpdateRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "RowUpdateBatchParams{tableIdOrName=$tableIdOrName, batchInputHubDbTableRowV3BatchUpdateRequest=$batchInputHubDbTableRowV3BatchUpdateRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
