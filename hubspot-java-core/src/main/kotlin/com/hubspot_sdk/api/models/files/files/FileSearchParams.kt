// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.files.files

import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.core.toImmutable
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Search through files in the file manager. Does not display hidden or archived files. */
class FileSearchParams
private constructor(
    private val after: String?,
    private val allowsAnonymousAccess: Boolean?,
    private val before: String?,
    private val createdAt: OffsetDateTime?,
    private val createdAtGte: OffsetDateTime?,
    private val createdAtLte: OffsetDateTime?,
    private val encoding: String?,
    private val expiresAt: OffsetDateTime?,
    private val expiresAtGte: OffsetDateTime?,
    private val expiresAtLte: OffsetDateTime?,
    private val extension: String?,
    private val fileMd5: String?,
    private val height: Int?,
    private val heightGte: Int?,
    private val heightLte: Int?,
    private val idGte: Long?,
    private val idLte: Long?,
    private val ids: List<Long>?,
    private val isUsableInContent: Boolean?,
    private val limit: Int?,
    private val name: String?,
    private val parentFolderIds: List<Long>?,
    private val path: String?,
    private val properties: List<String>?,
    private val size: Long?,
    private val sizeGte: Long?,
    private val sizeLte: Long?,
    private val sort: List<String>?,
    private val type: String?,
    private val updatedAt: OffsetDateTime?,
    private val updatedAtGte: OffsetDateTime?,
    private val updatedAtLte: OffsetDateTime?,
    private val url: String?,
    private val width: Int?,
    private val widthGte: Int?,
    private val widthLte: Int?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Offset search results by this value. The default offset is 0 and the maximum offset of items
     * for a given search is 10,000. Narrow your search down if you are reaching this limit.
     */
    fun after(): Optional<String> = Optional.ofNullable(after)

    /**
     * Search files by access. If 'true' will show only public files; if 'false' will show only
     * private files
     */
    fun allowsAnonymousAccess(): Optional<Boolean> = Optional.ofNullable(allowsAnonymousAccess)

    /** Search files updated before this timestamp. Time must be epoch time in milliseconds. */
    fun before(): Optional<String> = Optional.ofNullable(before)

    /** Search files by exact time of creation. Time must be epoch time in milliseconds. */
    fun createdAt(): Optional<OffsetDateTime> = Optional.ofNullable(createdAt)

    /**
     * Search files by greater than or equal to time of creation. Can be used with createdAtLte to
     * create a range.
     */
    fun createdAtGte(): Optional<OffsetDateTime> = Optional.ofNullable(createdAtGte)

    /**
     * Search files by less than or equal to time of creation. Can be used with createdAtGte to
     * create a range.
     */
    fun createdAtLte(): Optional<OffsetDateTime> = Optional.ofNullable(createdAtLte)

    /** Search files by specified encoding. */
    fun encoding(): Optional<String> = Optional.ofNullable(encoding)

    /** Search files by exact expires time. Time must be epoch time in milliseconds. */
    fun expiresAt(): Optional<OffsetDateTime> = Optional.ofNullable(expiresAt)

    /**
     * Search files by greater than or equal to expires time. Can be used with expiresAtLte to
     * create a range.
     */
    fun expiresAtGte(): Optional<OffsetDateTime> = Optional.ofNullable(expiresAtGte)

    /**
     * Search files by less than or equal to expires time. Can be used with expiresAtGte to create a
     * range.
     */
    fun expiresAtLte(): Optional<OffsetDateTime> = Optional.ofNullable(expiresAtLte)

    /** Search files by given extension. */
    fun extension(): Optional<String> = Optional.ofNullable(extension)

    /** Search files by specific md5 hash. */
    fun fileMd5(): Optional<String> = Optional.ofNullable(fileMd5)

    /** Search files by height of image or video. */
    fun height(): Optional<Int> = Optional.ofNullable(height)

    /**
     * Search files by greater than or equal to height of image or video. Can be used with heightLte
     * to create a range.
     */
    fun heightGte(): Optional<Int> = Optional.ofNullable(heightGte)

    /**
     * Search files by less than or equal to height of image or video. Can be used with heightGte to
     * create a range.
     */
    fun heightLte(): Optional<Int> = Optional.ofNullable(heightLte)

    /** Search files by greater than or equal to ID. Can be used with idLte to create a range. */
    fun idGte(): Optional<Long> = Optional.ofNullable(idGte)

    /** Search files by less than or equal to ID. Can be used with idGte to create a range. */
    fun idLte(): Optional<Long> = Optional.ofNullable(idLte)

    fun ids(): Optional<List<Long>> = Optional.ofNullable(ids)

    /**
     * If true shows files that have been marked to be used in new content. It false shows files
     * that should not be used in new content.
     */
    fun isUsableInContent(): Optional<Boolean> = Optional.ofNullable(isUsableInContent)

    /** Number of items to return. Default limit is 10, maximum limit is 100. */
    fun limit(): Optional<Int> = Optional.ofNullable(limit)

    /** Search for files containing the given name. */
    fun name(): Optional<String> = Optional.ofNullable(name)

    fun parentFolderIds(): Optional<List<Long>> = Optional.ofNullable(parentFolderIds)

    /** Search files by path. */
    fun path(): Optional<String> = Optional.ofNullable(path)

    /** Desired file properties in the return object. */
    fun properties(): Optional<List<String>> = Optional.ofNullable(properties)

    /** Search files by exact file size in bytes. */
    fun size(): Optional<Long> = Optional.ofNullable(size)

    /**
     * Search files by greater than or equal to file size. Can be used with sizeLte to create a
     * range.
     */
    fun sizeGte(): Optional<Long> = Optional.ofNullable(sizeGte)

    /**
     * Search files by less than or equal to file size. Can be used with sizeGte to create a range.
     */
    fun sizeLte(): Optional<Long> = Optional.ofNullable(sizeLte)

    /** Sort files by a given field. */
    fun sort(): Optional<List<String>> = Optional.ofNullable(sort)

    /** Search files by file type. */
    fun type(): Optional<String> = Optional.ofNullable(type)

    /** Search files by exact time of latest updated. Time must be epoch time in milliseconds. */
    fun updatedAt(): Optional<OffsetDateTime> = Optional.ofNullable(updatedAt)

    /**
     * Search files by greater than or equal to time of latest update. Can be used with updatedAtLte
     * to create a range.
     */
    fun updatedAtGte(): Optional<OffsetDateTime> = Optional.ofNullable(updatedAtGte)

    /**
     * Search files by less than or equal to time of latest update. Can be used with updatedAtGte to
     * create a range.
     */
    fun updatedAtLte(): Optional<OffsetDateTime> = Optional.ofNullable(updatedAtLte)

    /** Search for given URL */
    fun url(): Optional<String> = Optional.ofNullable(url)

    /** Search files by width of image or video. */
    fun width(): Optional<Int> = Optional.ofNullable(width)

    /**
     * Search files by greater than or equal to width of image or video. Can be used with widthLte
     * to create a range.
     */
    fun widthGte(): Optional<Int> = Optional.ofNullable(widthGte)

    /**
     * Search files by less than or equal to width of image or video. Can be used with widthGte to
     * create a range.
     */
    fun widthLte(): Optional<Int> = Optional.ofNullable(widthLte)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): FileSearchParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [FileSearchParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FileSearchParams]. */
    class Builder internal constructor() {

        private var after: String? = null
        private var allowsAnonymousAccess: Boolean? = null
        private var before: String? = null
        private var createdAt: OffsetDateTime? = null
        private var createdAtGte: OffsetDateTime? = null
        private var createdAtLte: OffsetDateTime? = null
        private var encoding: String? = null
        private var expiresAt: OffsetDateTime? = null
        private var expiresAtGte: OffsetDateTime? = null
        private var expiresAtLte: OffsetDateTime? = null
        private var extension: String? = null
        private var fileMd5: String? = null
        private var height: Int? = null
        private var heightGte: Int? = null
        private var heightLte: Int? = null
        private var idGte: Long? = null
        private var idLte: Long? = null
        private var ids: MutableList<Long>? = null
        private var isUsableInContent: Boolean? = null
        private var limit: Int? = null
        private var name: String? = null
        private var parentFolderIds: MutableList<Long>? = null
        private var path: String? = null
        private var properties: MutableList<String>? = null
        private var size: Long? = null
        private var sizeGte: Long? = null
        private var sizeLte: Long? = null
        private var sort: MutableList<String>? = null
        private var type: String? = null
        private var updatedAt: OffsetDateTime? = null
        private var updatedAtGte: OffsetDateTime? = null
        private var updatedAtLte: OffsetDateTime? = null
        private var url: String? = null
        private var width: Int? = null
        private var widthGte: Int? = null
        private var widthLte: Int? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(fileSearchParams: FileSearchParams) = apply {
            after = fileSearchParams.after
            allowsAnonymousAccess = fileSearchParams.allowsAnonymousAccess
            before = fileSearchParams.before
            createdAt = fileSearchParams.createdAt
            createdAtGte = fileSearchParams.createdAtGte
            createdAtLte = fileSearchParams.createdAtLte
            encoding = fileSearchParams.encoding
            expiresAt = fileSearchParams.expiresAt
            expiresAtGte = fileSearchParams.expiresAtGte
            expiresAtLte = fileSearchParams.expiresAtLte
            extension = fileSearchParams.extension
            fileMd5 = fileSearchParams.fileMd5
            height = fileSearchParams.height
            heightGte = fileSearchParams.heightGte
            heightLte = fileSearchParams.heightLte
            idGte = fileSearchParams.idGte
            idLte = fileSearchParams.idLte
            ids = fileSearchParams.ids?.toMutableList()
            isUsableInContent = fileSearchParams.isUsableInContent
            limit = fileSearchParams.limit
            name = fileSearchParams.name
            parentFolderIds = fileSearchParams.parentFolderIds?.toMutableList()
            path = fileSearchParams.path
            properties = fileSearchParams.properties?.toMutableList()
            size = fileSearchParams.size
            sizeGte = fileSearchParams.sizeGte
            sizeLte = fileSearchParams.sizeLte
            sort = fileSearchParams.sort?.toMutableList()
            type = fileSearchParams.type
            updatedAt = fileSearchParams.updatedAt
            updatedAtGte = fileSearchParams.updatedAtGte
            updatedAtLte = fileSearchParams.updatedAtLte
            url = fileSearchParams.url
            width = fileSearchParams.width
            widthGte = fileSearchParams.widthGte
            widthLte = fileSearchParams.widthLte
            additionalHeaders = fileSearchParams.additionalHeaders.toBuilder()
            additionalQueryParams = fileSearchParams.additionalQueryParams.toBuilder()
        }

        /**
         * Offset search results by this value. The default offset is 0 and the maximum offset of
         * items for a given search is 10,000. Narrow your search down if you are reaching this
         * limit.
         */
        fun after(after: String?) = apply { this.after = after }

        /** Alias for calling [Builder.after] with `after.orElse(null)`. */
        fun after(after: Optional<String>) = after(after.getOrNull())

        /**
         * Search files by access. If 'true' will show only public files; if 'false' will show only
         * private files
         */
        fun allowsAnonymousAccess(allowsAnonymousAccess: Boolean?) = apply {
            this.allowsAnonymousAccess = allowsAnonymousAccess
        }

        /**
         * Alias for [Builder.allowsAnonymousAccess].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun allowsAnonymousAccess(allowsAnonymousAccess: Boolean) =
            allowsAnonymousAccess(allowsAnonymousAccess as Boolean?)

        /**
         * Alias for calling [Builder.allowsAnonymousAccess] with
         * `allowsAnonymousAccess.orElse(null)`.
         */
        fun allowsAnonymousAccess(allowsAnonymousAccess: Optional<Boolean>) =
            allowsAnonymousAccess(allowsAnonymousAccess.getOrNull())

        /** Search files updated before this timestamp. Time must be epoch time in milliseconds. */
        fun before(before: String?) = apply { this.before = before }

        /** Alias for calling [Builder.before] with `before.orElse(null)`. */
        fun before(before: Optional<String>) = before(before.getOrNull())

        /** Search files by exact time of creation. Time must be epoch time in milliseconds. */
        fun createdAt(createdAt: OffsetDateTime?) = apply { this.createdAt = createdAt }

        /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
        fun createdAt(createdAt: Optional<OffsetDateTime>) = createdAt(createdAt.getOrNull())

        /**
         * Search files by greater than or equal to time of creation. Can be used with createdAtLte
         * to create a range.
         */
        fun createdAtGte(createdAtGte: OffsetDateTime?) = apply { this.createdAtGte = createdAtGte }

        /** Alias for calling [Builder.createdAtGte] with `createdAtGte.orElse(null)`. */
        fun createdAtGte(createdAtGte: Optional<OffsetDateTime>) =
            createdAtGte(createdAtGte.getOrNull())

        /**
         * Search files by less than or equal to time of creation. Can be used with createdAtGte to
         * create a range.
         */
        fun createdAtLte(createdAtLte: OffsetDateTime?) = apply { this.createdAtLte = createdAtLte }

        /** Alias for calling [Builder.createdAtLte] with `createdAtLte.orElse(null)`. */
        fun createdAtLte(createdAtLte: Optional<OffsetDateTime>) =
            createdAtLte(createdAtLte.getOrNull())

        /** Search files by specified encoding. */
        fun encoding(encoding: String?) = apply { this.encoding = encoding }

        /** Alias for calling [Builder.encoding] with `encoding.orElse(null)`. */
        fun encoding(encoding: Optional<String>) = encoding(encoding.getOrNull())

        /** Search files by exact expires time. Time must be epoch time in milliseconds. */
        fun expiresAt(expiresAt: OffsetDateTime?) = apply { this.expiresAt = expiresAt }

        /** Alias for calling [Builder.expiresAt] with `expiresAt.orElse(null)`. */
        fun expiresAt(expiresAt: Optional<OffsetDateTime>) = expiresAt(expiresAt.getOrNull())

        /**
         * Search files by greater than or equal to expires time. Can be used with expiresAtLte to
         * create a range.
         */
        fun expiresAtGte(expiresAtGte: OffsetDateTime?) = apply { this.expiresAtGte = expiresAtGte }

        /** Alias for calling [Builder.expiresAtGte] with `expiresAtGte.orElse(null)`. */
        fun expiresAtGte(expiresAtGte: Optional<OffsetDateTime>) =
            expiresAtGte(expiresAtGte.getOrNull())

        /**
         * Search files by less than or equal to expires time. Can be used with expiresAtGte to
         * create a range.
         */
        fun expiresAtLte(expiresAtLte: OffsetDateTime?) = apply { this.expiresAtLte = expiresAtLte }

        /** Alias for calling [Builder.expiresAtLte] with `expiresAtLte.orElse(null)`. */
        fun expiresAtLte(expiresAtLte: Optional<OffsetDateTime>) =
            expiresAtLte(expiresAtLte.getOrNull())

        /** Search files by given extension. */
        fun extension(extension: String?) = apply { this.extension = extension }

        /** Alias for calling [Builder.extension] with `extension.orElse(null)`. */
        fun extension(extension: Optional<String>) = extension(extension.getOrNull())

        /** Search files by specific md5 hash. */
        fun fileMd5(fileMd5: String?) = apply { this.fileMd5 = fileMd5 }

        /** Alias for calling [Builder.fileMd5] with `fileMd5.orElse(null)`. */
        fun fileMd5(fileMd5: Optional<String>) = fileMd5(fileMd5.getOrNull())

        /** Search files by height of image or video. */
        fun height(height: Int?) = apply { this.height = height }

        /**
         * Alias for [Builder.height].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun height(height: Int) = height(height as Int?)

        /** Alias for calling [Builder.height] with `height.orElse(null)`. */
        fun height(height: Optional<Int>) = height(height.getOrNull())

        /**
         * Search files by greater than or equal to height of image or video. Can be used with
         * heightLte to create a range.
         */
        fun heightGte(heightGte: Int?) = apply { this.heightGte = heightGte }

        /**
         * Alias for [Builder.heightGte].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun heightGte(heightGte: Int) = heightGte(heightGte as Int?)

        /** Alias for calling [Builder.heightGte] with `heightGte.orElse(null)`. */
        fun heightGte(heightGte: Optional<Int>) = heightGte(heightGte.getOrNull())

        /**
         * Search files by less than or equal to height of image or video. Can be used with
         * heightGte to create a range.
         */
        fun heightLte(heightLte: Int?) = apply { this.heightLte = heightLte }

        /**
         * Alias for [Builder.heightLte].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun heightLte(heightLte: Int) = heightLte(heightLte as Int?)

        /** Alias for calling [Builder.heightLte] with `heightLte.orElse(null)`. */
        fun heightLte(heightLte: Optional<Int>) = heightLte(heightLte.getOrNull())

        /**
         * Search files by greater than or equal to ID. Can be used with idLte to create a range.
         */
        fun idGte(idGte: Long?) = apply { this.idGte = idGte }

        /**
         * Alias for [Builder.idGte].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun idGte(idGte: Long) = idGte(idGte as Long?)

        /** Alias for calling [Builder.idGte] with `idGte.orElse(null)`. */
        fun idGte(idGte: Optional<Long>) = idGte(idGte.getOrNull())

        /** Search files by less than or equal to ID. Can be used with idGte to create a range. */
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

        /**
         * If true shows files that have been marked to be used in new content. It false shows files
         * that should not be used in new content.
         */
        fun isUsableInContent(isUsableInContent: Boolean?) = apply {
            this.isUsableInContent = isUsableInContent
        }

        /**
         * Alias for [Builder.isUsableInContent].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun isUsableInContent(isUsableInContent: Boolean) =
            isUsableInContent(isUsableInContent as Boolean?)

        /** Alias for calling [Builder.isUsableInContent] with `isUsableInContent.orElse(null)`. */
        fun isUsableInContent(isUsableInContent: Optional<Boolean>) =
            isUsableInContent(isUsableInContent.getOrNull())

        /** Number of items to return. Default limit is 10, maximum limit is 100. */
        fun limit(limit: Int?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Int) = limit(limit as Int?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Int>) = limit(limit.getOrNull())

        /** Search for files containing the given name. */
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

        /** Search files by path. */
        fun path(path: String?) = apply { this.path = path }

        /** Alias for calling [Builder.path] with `path.orElse(null)`. */
        fun path(path: Optional<String>) = path(path.getOrNull())

        /** Desired file properties in the return object. */
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

        /** Search files by exact file size in bytes. */
        fun size(size: Long?) = apply { this.size = size }

        /**
         * Alias for [Builder.size].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun size(size: Long) = size(size as Long?)

        /** Alias for calling [Builder.size] with `size.orElse(null)`. */
        fun size(size: Optional<Long>) = size(size.getOrNull())

        /**
         * Search files by greater than or equal to file size. Can be used with sizeLte to create a
         * range.
         */
        fun sizeGte(sizeGte: Long?) = apply { this.sizeGte = sizeGte }

        /**
         * Alias for [Builder.sizeGte].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun sizeGte(sizeGte: Long) = sizeGte(sizeGte as Long?)

        /** Alias for calling [Builder.sizeGte] with `sizeGte.orElse(null)`. */
        fun sizeGte(sizeGte: Optional<Long>) = sizeGte(sizeGte.getOrNull())

        /**
         * Search files by less than or equal to file size. Can be used with sizeGte to create a
         * range.
         */
        fun sizeLte(sizeLte: Long?) = apply { this.sizeLte = sizeLte }

        /**
         * Alias for [Builder.sizeLte].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun sizeLte(sizeLte: Long) = sizeLte(sizeLte as Long?)

        /** Alias for calling [Builder.sizeLte] with `sizeLte.orElse(null)`. */
        fun sizeLte(sizeLte: Optional<Long>) = sizeLte(sizeLte.getOrNull())

        /** Sort files by a given field. */
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

        /** Search files by file type. */
        fun type(type: String?) = apply { this.type = type }

        /** Alias for calling [Builder.type] with `type.orElse(null)`. */
        fun type(type: Optional<String>) = type(type.getOrNull())

        /**
         * Search files by exact time of latest updated. Time must be epoch time in milliseconds.
         */
        fun updatedAt(updatedAt: OffsetDateTime?) = apply { this.updatedAt = updatedAt }

        /** Alias for calling [Builder.updatedAt] with `updatedAt.orElse(null)`. */
        fun updatedAt(updatedAt: Optional<OffsetDateTime>) = updatedAt(updatedAt.getOrNull())

        /**
         * Search files by greater than or equal to time of latest update. Can be used with
         * updatedAtLte to create a range.
         */
        fun updatedAtGte(updatedAtGte: OffsetDateTime?) = apply { this.updatedAtGte = updatedAtGte }

        /** Alias for calling [Builder.updatedAtGte] with `updatedAtGte.orElse(null)`. */
        fun updatedAtGte(updatedAtGte: Optional<OffsetDateTime>) =
            updatedAtGte(updatedAtGte.getOrNull())

        /**
         * Search files by less than or equal to time of latest update. Can be used with
         * updatedAtGte to create a range.
         */
        fun updatedAtLte(updatedAtLte: OffsetDateTime?) = apply { this.updatedAtLte = updatedAtLte }

        /** Alias for calling [Builder.updatedAtLte] with `updatedAtLte.orElse(null)`. */
        fun updatedAtLte(updatedAtLte: Optional<OffsetDateTime>) =
            updatedAtLte(updatedAtLte.getOrNull())

        /** Search for given URL */
        fun url(url: String?) = apply { this.url = url }

        /** Alias for calling [Builder.url] with `url.orElse(null)`. */
        fun url(url: Optional<String>) = url(url.getOrNull())

        /** Search files by width of image or video. */
        fun width(width: Int?) = apply { this.width = width }

        /**
         * Alias for [Builder.width].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun width(width: Int) = width(width as Int?)

        /** Alias for calling [Builder.width] with `width.orElse(null)`. */
        fun width(width: Optional<Int>) = width(width.getOrNull())

        /**
         * Search files by greater than or equal to width of image or video. Can be used with
         * widthLte to create a range.
         */
        fun widthGte(widthGte: Int?) = apply { this.widthGte = widthGte }

        /**
         * Alias for [Builder.widthGte].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun widthGte(widthGte: Int) = widthGte(widthGte as Int?)

        /** Alias for calling [Builder.widthGte] with `widthGte.orElse(null)`. */
        fun widthGte(widthGte: Optional<Int>) = widthGte(widthGte.getOrNull())

        /**
         * Search files by less than or equal to width of image or video. Can be used with widthGte
         * to create a range.
         */
        fun widthLte(widthLte: Int?) = apply { this.widthLte = widthLte }

        /**
         * Alias for [Builder.widthLte].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun widthLte(widthLte: Int) = widthLte(widthLte as Int?)

        /** Alias for calling [Builder.widthLte] with `widthLte.orElse(null)`. */
        fun widthLte(widthLte: Optional<Int>) = widthLte(widthLte.getOrNull())

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
         * Returns an immutable instance of [FileSearchParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FileSearchParams =
            FileSearchParams(
                after,
                allowsAnonymousAccess,
                before,
                createdAt,
                createdAtGte,
                createdAtLte,
                encoding,
                expiresAt,
                expiresAtGte,
                expiresAtLte,
                extension,
                fileMd5,
                height,
                heightGte,
                heightLte,
                idGte,
                idLte,
                ids?.toImmutable(),
                isUsableInContent,
                limit,
                name,
                parentFolderIds?.toImmutable(),
                path,
                properties?.toImmutable(),
                size,
                sizeGte,
                sizeLte,
                sort?.toImmutable(),
                type,
                updatedAt,
                updatedAtGte,
                updatedAtLte,
                url,
                width,
                widthGte,
                widthLte,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                after?.let { put("after", it) }
                allowsAnonymousAccess?.let { put("allowsAnonymousAccess", it.toString()) }
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
                encoding?.let { put("encoding", it) }
                expiresAt?.let {
                    put("expiresAt", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                expiresAtGte?.let {
                    put("expiresAtGte", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                expiresAtLte?.let {
                    put("expiresAtLte", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                extension?.let { put("extension", it) }
                fileMd5?.let { put("fileMd5", it) }
                height?.let { put("height", it.toString()) }
                heightGte?.let { put("heightGte", it.toString()) }
                heightLte?.let { put("heightLte", it.toString()) }
                idGte?.let { put("idGte", it.toString()) }
                idLte?.let { put("idLte", it.toString()) }
                ids?.let { put("ids", it.joinToString(",") { it.toString() }) }
                isUsableInContent?.let { put("isUsableInContent", it.toString()) }
                limit?.let { put("limit", it.toString()) }
                name?.let { put("name", it) }
                parentFolderIds?.let {
                    put("parentFolderIds", it.joinToString(",") { it.toString() })
                }
                path?.let { put("path", it) }
                properties?.let { put("properties", it.joinToString(",")) }
                size?.let { put("size", it.toString()) }
                sizeGte?.let { put("sizeGte", it.toString()) }
                sizeLte?.let { put("sizeLte", it.toString()) }
                sort?.let { put("sort", it.joinToString(",")) }
                type?.let { put("type", it) }
                updatedAt?.let {
                    put("updatedAt", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                updatedAtGte?.let {
                    put("updatedAtGte", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                updatedAtLte?.let {
                    put("updatedAtLte", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                url?.let { put("url", it) }
                width?.let { put("width", it.toString()) }
                widthGte?.let { put("widthGte", it.toString()) }
                widthLte?.let { put("widthLte", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FileSearchParams &&
            after == other.after &&
            allowsAnonymousAccess == other.allowsAnonymousAccess &&
            before == other.before &&
            createdAt == other.createdAt &&
            createdAtGte == other.createdAtGte &&
            createdAtLte == other.createdAtLte &&
            encoding == other.encoding &&
            expiresAt == other.expiresAt &&
            expiresAtGte == other.expiresAtGte &&
            expiresAtLte == other.expiresAtLte &&
            extension == other.extension &&
            fileMd5 == other.fileMd5 &&
            height == other.height &&
            heightGte == other.heightGte &&
            heightLte == other.heightLte &&
            idGte == other.idGte &&
            idLte == other.idLte &&
            ids == other.ids &&
            isUsableInContent == other.isUsableInContent &&
            limit == other.limit &&
            name == other.name &&
            parentFolderIds == other.parentFolderIds &&
            path == other.path &&
            properties == other.properties &&
            size == other.size &&
            sizeGte == other.sizeGte &&
            sizeLte == other.sizeLte &&
            sort == other.sort &&
            type == other.type &&
            updatedAt == other.updatedAt &&
            updatedAtGte == other.updatedAtGte &&
            updatedAtLte == other.updatedAtLte &&
            url == other.url &&
            width == other.width &&
            widthGte == other.widthGte &&
            widthLte == other.widthLte &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            after,
            allowsAnonymousAccess,
            before,
            createdAt,
            createdAtGte,
            createdAtLte,
            encoding,
            expiresAt,
            expiresAtGte,
            expiresAtLte,
            extension,
            fileMd5,
            height,
            heightGte,
            heightLte,
            idGte,
            idLte,
            ids,
            isUsableInContent,
            limit,
            name,
            parentFolderIds,
            path,
            properties,
            size,
            sizeGte,
            sizeLte,
            sort,
            type,
            updatedAt,
            updatedAtGte,
            updatedAtLte,
            url,
            width,
            widthGte,
            widthLte,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "FileSearchParams{after=$after, allowsAnonymousAccess=$allowsAnonymousAccess, before=$before, createdAt=$createdAt, createdAtGte=$createdAtGte, createdAtLte=$createdAtLte, encoding=$encoding, expiresAt=$expiresAt, expiresAtGte=$expiresAtGte, expiresAtLte=$expiresAtLte, extension=$extension, fileMd5=$fileMd5, height=$height, heightGte=$heightGte, heightLte=$heightLte, idGte=$idGte, idLte=$idLte, ids=$ids, isUsableInContent=$isUsableInContent, limit=$limit, name=$name, parentFolderIds=$parentFolderIds, path=$path, properties=$properties, size=$size, sizeGte=$sizeGte, sizeLte=$sizeLte, sort=$sort, type=$type, updatedAt=$updatedAt, updatedAtGte=$updatedAtGte, updatedAtLte=$updatedAtLte, url=$url, width=$width, widthGte=$widthGte, widthLte=$widthLte, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
