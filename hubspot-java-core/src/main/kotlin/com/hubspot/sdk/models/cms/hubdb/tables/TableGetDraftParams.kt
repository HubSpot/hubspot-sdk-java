// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.hubdb.tables

import com.hubspot.sdk.core.Params
import com.hubspot.sdk.core.http.Headers
import com.hubspot.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Get the details for the draft version of a specific HubDB table. This will include the
 * definitions for the columns in the table and the number of rows in the table.
 */
class TableGetDraftParams
private constructor(
    private val tableIdOrName: String?,
    private val archived: Boolean?,
    private val includeForeignIds: Boolean?,
    private val isGetLocalizedSchema: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun tableIdOrName(): Optional<String> = Optional.ofNullable(tableIdOrName)

    /** Whether to return only results that have been archived. */
    fun archived(): Optional<Boolean> = Optional.ofNullable(archived)

    fun includeForeignIds(): Optional<Boolean> = Optional.ofNullable(includeForeignIds)

    fun isGetLocalizedSchema(): Optional<Boolean> = Optional.ofNullable(isGetLocalizedSchema)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): TableGetDraftParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [TableGetDraftParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TableGetDraftParams]. */
    class Builder internal constructor() {

        private var tableIdOrName: String? = null
        private var archived: Boolean? = null
        private var includeForeignIds: Boolean? = null
        private var isGetLocalizedSchema: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(tableGetDraftParams: TableGetDraftParams) = apply {
            tableIdOrName = tableGetDraftParams.tableIdOrName
            archived = tableGetDraftParams.archived
            includeForeignIds = tableGetDraftParams.includeForeignIds
            isGetLocalizedSchema = tableGetDraftParams.isGetLocalizedSchema
            additionalHeaders = tableGetDraftParams.additionalHeaders.toBuilder()
            additionalQueryParams = tableGetDraftParams.additionalQueryParams.toBuilder()
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
         * Returns an immutable instance of [TableGetDraftParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TableGetDraftParams =
            TableGetDraftParams(
                tableIdOrName,
                archived,
                includeForeignIds,
                isGetLocalizedSchema,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

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

        return other is TableGetDraftParams &&
            tableIdOrName == other.tableIdOrName &&
            archived == other.archived &&
            includeForeignIds == other.includeForeignIds &&
            isGetLocalizedSchema == other.isGetLocalizedSchema &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            tableIdOrName,
            archived,
            includeForeignIds,
            isGetLocalizedSchema,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "TableGetDraftParams{tableIdOrName=$tableIdOrName, archived=$archived, includeForeignIds=$includeForeignIds, isGetLocalizedSchema=$isGetLocalizedSchema, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
