// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.files.folders

import com.hubspot.core.Params
import com.hubspot.core.http.Headers
import com.hubspot.core.http.QueryParams
import com.hubspot.core.toImmutable
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Search for folders. Does not contain hidden or archived folders. */
class FolderSearchParams
private constructor(
    private val after: String?,
    private val before: String?,
    private val createdAt: OffsetDateTime?,
    private val createdAtGte: OffsetDateTime?,
    private val createdAtLte: OffsetDateTime?,
    private val idGte: Long?,
    private val idLte: Long?,
    private val ids: List<Long>?,
    private val limit: Int?,
    private val name: String?,
    private val parentFolderIds: List<Long>?,
    private val path: String?,
    private val properties: List<String>?,
    private val sort: List<String>?,
    private val updatedAt: OffsetDateTime?,
    private val updatedAtGte: OffsetDateTime?,
    private val updatedAtLte: OffsetDateTime?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The paging cursor token of the last successfully read resource will be returned as the
     * `paging.next.after` JSON property of a paged response containing more results.
     */
    fun after(): Optional<String> = Optional.ofNullable(after)

    fun before(): Optional<String> = Optional.ofNullable(before)

    fun createdAt(): Optional<OffsetDateTime> = Optional.ofNullable(createdAt)

    fun createdAtGte(): Optional<OffsetDateTime> = Optional.ofNullable(createdAtGte)

    fun createdAtLte(): Optional<OffsetDateTime> = Optional.ofNullable(createdAtLte)

    fun idGte(): Optional<Long> = Optional.ofNullable(idGte)

    fun idLte(): Optional<Long> = Optional.ofNullable(idLte)

    fun ids(): Optional<List<Long>> = Optional.ofNullable(ids)

    /** The maximum number of results to display per page. */
    fun limit(): Optional<Int> = Optional.ofNullable(limit)

    fun name(): Optional<String> = Optional.ofNullable(name)

    fun parentFolderIds(): Optional<List<Long>> = Optional.ofNullable(parentFolderIds)

    fun path(): Optional<String> = Optional.ofNullable(path)

    fun properties(): Optional<List<String>> = Optional.ofNullable(properties)

    fun sort(): Optional<List<String>> = Optional.ofNullable(sort)

    fun updatedAt(): Optional<OffsetDateTime> = Optional.ofNullable(updatedAt)

    fun updatedAtGte(): Optional<OffsetDateTime> = Optional.ofNullable(updatedAtGte)

    fun updatedAtLte(): Optional<OffsetDateTime> = Optional.ofNullable(updatedAtLte)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): FolderSearchParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [FolderSearchParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FolderSearchParams]. */
    class Builder internal constructor() {

        private var after: String? = null
        private var before: String? = null
        private var createdAt: OffsetDateTime? = null
        private var createdAtGte: OffsetDateTime? = null
        private var createdAtLte: OffsetDateTime? = null
        private var idGte: Long? = null
        private var idLte: Long? = null
        private var ids: MutableList<Long>? = null
        private var limit: Int? = null
        private var name: String? = null
        private var parentFolderIds: MutableList<Long>? = null
        private var path: String? = null
        private var properties: MutableList<String>? = null
        private var sort: MutableList<String>? = null
        private var updatedAt: OffsetDateTime? = null
        private var updatedAtGte: OffsetDateTime? = null
        private var updatedAtLte: OffsetDateTime? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(folderSearchParams: FolderSearchParams) = apply {
            after = folderSearchParams.after
            before = folderSearchParams.before
            createdAt = folderSearchParams.createdAt
            createdAtGte = folderSearchParams.createdAtGte
            createdAtLte = folderSearchParams.createdAtLte
            idGte = folderSearchParams.idGte
            idLte = folderSearchParams.idLte
            ids = folderSearchParams.ids?.toMutableList()
            limit = folderSearchParams.limit
            name = folderSearchParams.name
            parentFolderIds = folderSearchParams.parentFolderIds?.toMutableList()
            path = folderSearchParams.path
            properties = folderSearchParams.properties?.toMutableList()
            sort = folderSearchParams.sort?.toMutableList()
            updatedAt = folderSearchParams.updatedAt
            updatedAtGte = folderSearchParams.updatedAtGte
            updatedAtLte = folderSearchParams.updatedAtLte
            additionalHeaders = folderSearchParams.additionalHeaders.toBuilder()
            additionalQueryParams = folderSearchParams.additionalQueryParams.toBuilder()
        }

        /**
         * The paging cursor token of the last successfully read resource will be returned as the
         * `paging.next.after` JSON property of a paged response containing more results.
         */
        fun after(after: String?) = apply { this.after = after }

        /** Alias for calling [Builder.after] with `after.orElse(null)`. */
        fun after(after: Optional<String>) = after(after.getOrNull())

        fun before(before: String?) = apply { this.before = before }

        /** Alias for calling [Builder.before] with `before.orElse(null)`. */
        fun before(before: Optional<String>) = before(before.getOrNull())

        fun createdAt(createdAt: OffsetDateTime?) = apply { this.createdAt = createdAt }

        /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
        fun createdAt(createdAt: Optional<OffsetDateTime>) = createdAt(createdAt.getOrNull())

        fun createdAtGte(createdAtGte: OffsetDateTime?) = apply { this.createdAtGte = createdAtGte }

        /** Alias for calling [Builder.createdAtGte] with `createdAtGte.orElse(null)`. */
        fun createdAtGte(createdAtGte: Optional<OffsetDateTime>) =
            createdAtGte(createdAtGte.getOrNull())

        fun createdAtLte(createdAtLte: OffsetDateTime?) = apply { this.createdAtLte = createdAtLte }

        /** Alias for calling [Builder.createdAtLte] with `createdAtLte.orElse(null)`. */
        fun createdAtLte(createdAtLte: Optional<OffsetDateTime>) =
            createdAtLte(createdAtLte.getOrNull())

        fun idGte(idGte: Long?) = apply { this.idGte = idGte }

        /**
         * Alias for [Builder.idGte].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun idGte(idGte: Long) = idGte(idGte as Long?)

        /** Alias for calling [Builder.idGte] with `idGte.orElse(null)`. */
        fun idGte(idGte: Optional<Long>) = idGte(idGte.getOrNull())

        fun idLte(idLte: Long?) = apply { this.idLte = idLte }

        /**
         * Alias for [Builder.idLte].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun idLte(idLte: Long) = idLte(idLte as Long?)

        /** Alias for calling [Builder.idLte] with `idLte.orElse(null)`. */
        fun idLte(idLte: Optional<Long>) = idLte(idLte.getOrNull())

        fun ids(ids: List<Long>?) = apply { this.ids = ids?.toMutableList() }

        /** Alias for calling [Builder.ids] with `ids.orElse(null)`. */
        fun ids(ids: Optional<List<Long>>) = ids(ids.getOrNull())

        /**
         * Adds a single [Long] to [ids].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addId(id: Long) = apply { ids = (ids ?: mutableListOf()).apply { add(id) } }

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

        fun name(name: String?) = apply { this.name = name }

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        fun parentFolderIds(parentFolderIds: List<Long>?) = apply {
            this.parentFolderIds = parentFolderIds?.toMutableList()
        }

        /** Alias for calling [Builder.parentFolderIds] with `parentFolderIds.orElse(null)`. */
        fun parentFolderIds(parentFolderIds: Optional<List<Long>>) =
            parentFolderIds(parentFolderIds.getOrNull())

        /**
         * Adds a single [Long] to [parentFolderIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addParentFolderId(parentFolderId: Long) = apply {
            parentFolderIds = (parentFolderIds ?: mutableListOf()).apply { add(parentFolderId) }
        }

        fun path(path: String?) = apply { this.path = path }

        /** Alias for calling [Builder.path] with `path.orElse(null)`. */
        fun path(path: Optional<String>) = path(path.getOrNull())

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

        fun sort(sort: List<String>?) = apply { this.sort = sort?.toMutableList() }

        /** Alias for calling [Builder.sort] with `sort.orElse(null)`. */
        fun sort(sort: Optional<List<String>>) = sort(sort.getOrNull())

        /**
         * Adds a single [String] to [Builder.sort].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSort(sort: String) = apply {
            this.sort = (this.sort ?: mutableListOf()).apply { add(sort) }
        }

        fun updatedAt(updatedAt: OffsetDateTime?) = apply { this.updatedAt = updatedAt }

        /** Alias for calling [Builder.updatedAt] with `updatedAt.orElse(null)`. */
        fun updatedAt(updatedAt: Optional<OffsetDateTime>) = updatedAt(updatedAt.getOrNull())

        fun updatedAtGte(updatedAtGte: OffsetDateTime?) = apply { this.updatedAtGte = updatedAtGte }

        /** Alias for calling [Builder.updatedAtGte] with `updatedAtGte.orElse(null)`. */
        fun updatedAtGte(updatedAtGte: Optional<OffsetDateTime>) =
            updatedAtGte(updatedAtGte.getOrNull())

        fun updatedAtLte(updatedAtLte: OffsetDateTime?) = apply { this.updatedAtLte = updatedAtLte }

        /** Alias for calling [Builder.updatedAtLte] with `updatedAtLte.orElse(null)`. */
        fun updatedAtLte(updatedAtLte: Optional<OffsetDateTime>) =
            updatedAtLte(updatedAtLte.getOrNull())

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
         * Returns an immutable instance of [FolderSearchParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FolderSearchParams =
            FolderSearchParams(
                after,
                before,
                createdAt,
                createdAtGte,
                createdAtLte,
                idGte,
                idLte,
                ids?.toImmutable(),
                limit,
                name,
                parentFolderIds?.toImmutable(),
                path,
                properties?.toImmutable(),
                sort?.toImmutable(),
                updatedAt,
                updatedAtGte,
                updatedAtLte,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                after?.let { put("after", it) }
                before?.let { put("before", it) }
                createdAt?.let {
                    put("createdAt", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                createdAtGte?.let {
                    put("createdAtGte", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                createdAtLte?.let {
                    put("createdAtLte", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                idGte?.let { put("idGte", it.toString()) }
                idLte?.let { put("idLte", it.toString()) }
                ids?.let { put("ids", it.joinToString(",") { it.toString() }) }
                limit?.let { put("limit", it.toString()) }
                name?.let { put("name", it) }
                parentFolderIds?.let {
                    put("parentFolderIds", it.joinToString(",") { it.toString() })
                }
                path?.let { put("path", it) }
                properties?.let { put("properties", it.joinToString(",")) }
                sort?.let { put("sort", it.joinToString(",")) }
                updatedAt?.let {
                    put("updatedAt", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                updatedAtGte?.let {
                    put("updatedAtGte", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                updatedAtLte?.let {
                    put("updatedAtLte", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FolderSearchParams &&
            after == other.after &&
            before == other.before &&
            createdAt == other.createdAt &&
            createdAtGte == other.createdAtGte &&
            createdAtLte == other.createdAtLte &&
            idGte == other.idGte &&
            idLte == other.idLte &&
            ids == other.ids &&
            limit == other.limit &&
            name == other.name &&
            parentFolderIds == other.parentFolderIds &&
            path == other.path &&
            properties == other.properties &&
            sort == other.sort &&
            updatedAt == other.updatedAt &&
            updatedAtGte == other.updatedAtGte &&
            updatedAtLte == other.updatedAtLte &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            after,
            before,
            createdAt,
            createdAtGte,
            createdAtLte,
            idGte,
            idLte,
            ids,
            limit,
            name,
            parentFolderIds,
            path,
            properties,
            sort,
            updatedAt,
            updatedAtGte,
            updatedAtLte,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "FolderSearchParams{after=$after, before=$before, createdAt=$createdAt, createdAtGte=$createdAtGte, createdAtLte=$createdAtLte, idGte=$idGte, idLte=$idLte, ids=$ids, limit=$limit, name=$name, parentFolderIds=$parentFolderIds, path=$path, properties=$properties, sort=$sort, updatedAt=$updatedAt, updatedAtGte=$updatedAtGte, updatedAtLte=$updatedAtLte, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
