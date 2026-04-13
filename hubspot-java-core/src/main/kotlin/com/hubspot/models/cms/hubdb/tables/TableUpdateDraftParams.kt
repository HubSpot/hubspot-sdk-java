// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.hubdb.tables

import com.hubspot.core.JsonValue
import com.hubspot.core.Params
import com.hubspot.core.checkRequired
import com.hubspot.core.http.Headers
import com.hubspot.core.http.QueryParams
import com.hubspot.models.cms.hubdb.HubDbTableV3Request
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Update an existing HubDB table. You can use this endpoint to add or remove columns to the table
 * as well as restore an archived table. Tables updated using the endpoint will only modify the
 * draft verion of the table. Use the `/publish` endpoint to push all the changes to the published
 * version. To restore a table, include the query parameter `archived=true` and `"archived": false`
 * in the json body. **Note:** You need to include all the columns in the input when you are
 * adding/removing/updating a column. If you do not include an already existing column in the
 * request, it will be deleted.
 */
class TableUpdateDraftParams
private constructor(
    private val tableIdOrName: String?,
    private val archived: Boolean?,
    private val includeForeignIds: Boolean?,
    private val isGetLocalizedSchema: Boolean?,
    private val hubDbTableV3Request: HubDbTableV3Request,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun tableIdOrName(): Optional<String> = Optional.ofNullable(tableIdOrName)

    /** Whether to return only results that have been archived. */
    fun archived(): Optional<Boolean> = Optional.ofNullable(archived)

    fun includeForeignIds(): Optional<Boolean> = Optional.ofNullable(includeForeignIds)

    fun isGetLocalizedSchema(): Optional<Boolean> = Optional.ofNullable(isGetLocalizedSchema)

    fun hubDbTableV3Request(): HubDbTableV3Request = hubDbTableV3Request

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        hubDbTableV3Request._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TableUpdateDraftParams].
         *
         * The following fields are required:
         * ```java
         * .hubDbTableV3Request()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TableUpdateDraftParams]. */
    class Builder internal constructor() {

        private var tableIdOrName: String? = null
        private var archived: Boolean? = null
        private var includeForeignIds: Boolean? = null
        private var isGetLocalizedSchema: Boolean? = null
        private var hubDbTableV3Request: HubDbTableV3Request? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(tableUpdateDraftParams: TableUpdateDraftParams) = apply {
            tableIdOrName = tableUpdateDraftParams.tableIdOrName
            archived = tableUpdateDraftParams.archived
            includeForeignIds = tableUpdateDraftParams.includeForeignIds
            isGetLocalizedSchema = tableUpdateDraftParams.isGetLocalizedSchema
            hubDbTableV3Request = tableUpdateDraftParams.hubDbTableV3Request
            additionalHeaders = tableUpdateDraftParams.additionalHeaders.toBuilder()
            additionalQueryParams = tableUpdateDraftParams.additionalQueryParams.toBuilder()
        }

        fun tableIdOrName(tableIdOrName: String?) = apply { this.tableIdOrName = tableIdOrName }

        /** Alias for calling [Builder.tableIdOrName] with `tableIdOrName.orElse(null)`. */
        fun tableIdOrName(tableIdOrName: Optional<String>) =
            tableIdOrName(tableIdOrName.getOrNull())

        /** Whether to return only results that have been archived. */
        fun archived(archived: Boolean?) = apply { this.archived = archived }

        /**
         * Alias for [Builder.archived].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun archived(archived: Boolean) = archived(archived as Boolean?)

        /** Alias for calling [Builder.archived] with `archived.orElse(null)`. */
        fun archived(archived: Optional<Boolean>) = archived(archived.getOrNull())

        fun includeForeignIds(includeForeignIds: Boolean?) = apply {
            this.includeForeignIds = includeForeignIds
        }

        /**
         * Alias for [Builder.includeForeignIds].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeForeignIds(includeForeignIds: Boolean) =
            includeForeignIds(includeForeignIds as Boolean?)

        /** Alias for calling [Builder.includeForeignIds] with `includeForeignIds.orElse(null)`. */
        fun includeForeignIds(includeForeignIds: Optional<Boolean>) =
            includeForeignIds(includeForeignIds.getOrNull())

        fun isGetLocalizedSchema(isGetLocalizedSchema: Boolean?) = apply {
            this.isGetLocalizedSchema = isGetLocalizedSchema
        }

        /**
         * Alias for [Builder.isGetLocalizedSchema].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun isGetLocalizedSchema(isGetLocalizedSchema: Boolean) =
            isGetLocalizedSchema(isGetLocalizedSchema as Boolean?)

        /**
         * Alias for calling [Builder.isGetLocalizedSchema] with
         * `isGetLocalizedSchema.orElse(null)`.
         */
        fun isGetLocalizedSchema(isGetLocalizedSchema: Optional<Boolean>) =
            isGetLocalizedSchema(isGetLocalizedSchema.getOrNull())

        fun hubDbTableV3Request(hubDbTableV3Request: HubDbTableV3Request) = apply {
            this.hubDbTableV3Request = hubDbTableV3Request
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
         * Returns an immutable instance of [TableUpdateDraftParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .hubDbTableV3Request()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TableUpdateDraftParams =
            TableUpdateDraftParams(
                tableIdOrName,
                archived,
                includeForeignIds,
                isGetLocalizedSchema,
                checkRequired("hubDbTableV3Request", hubDbTableV3Request),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): HubDbTableV3Request = hubDbTableV3Request

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> tableIdOrName ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                archived?.let { put("archived", it.toString()) }
                includeForeignIds?.let { put("includeForeignIds", it.toString()) }
                isGetLocalizedSchema?.let { put("isGetLocalizedSchema", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TableUpdateDraftParams &&
            tableIdOrName == other.tableIdOrName &&
            archived == other.archived &&
            includeForeignIds == other.includeForeignIds &&
            isGetLocalizedSchema == other.isGetLocalizedSchema &&
            hubDbTableV3Request == other.hubDbTableV3Request &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            tableIdOrName,
            archived,
            includeForeignIds,
            isGetLocalizedSchema,
            hubDbTableV3Request,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "TableUpdateDraftParams{tableIdOrName=$tableIdOrName, archived=$archived, includeForeignIds=$includeForeignIds, isGetLocalizedSchema=$isGetLocalizedSchema, hubDbTableV3Request=$hubDbTableV3Request, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
