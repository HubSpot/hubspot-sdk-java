// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.pages.folders

import com.hubspot.core.JsonValue
import com.hubspot.core.Params
import com.hubspot.core.checkRequired
import com.hubspot.core.http.Headers
import com.hubspot.core.http.QueryParams
import com.hubspot.models.cms.pages.ContentFolder
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Partially update a landing page folder, specified by the folder ID. You only need to specify the
 * details values that you are modifying.
 */
class FolderUpdateParams
private constructor(
    private val objectId: String?,
    private val archived: Boolean?,
    private val contentFolder: ContentFolder,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun objectId(): Optional<String> = Optional.ofNullable(objectId)

    /** Whether to return only results that have been archived. */
    fun archived(): Optional<Boolean> = Optional.ofNullable(archived)

    fun contentFolder(): ContentFolder = contentFolder

    fun _additionalBodyProperties(): Map<String, JsonValue> = contentFolder._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FolderUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .contentFolder()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FolderUpdateParams]. */
    class Builder internal constructor() {

        private var objectId: String? = null
        private var archived: Boolean? = null
        private var contentFolder: ContentFolder? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(folderUpdateParams: FolderUpdateParams) = apply {
            objectId = folderUpdateParams.objectId
            archived = folderUpdateParams.archived
            contentFolder = folderUpdateParams.contentFolder
            additionalHeaders = folderUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = folderUpdateParams.additionalQueryParams.toBuilder()
        }

        fun objectId(objectId: String?) = apply { this.objectId = objectId }

        /** Alias for calling [Builder.objectId] with `objectId.orElse(null)`. */
        fun objectId(objectId: Optional<String>) = objectId(objectId.getOrNull())

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

        fun contentFolder(contentFolder: ContentFolder) = apply {
            this.contentFolder = contentFolder
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
         * Returns an immutable instance of [FolderUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .contentFolder()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FolderUpdateParams =
            FolderUpdateParams(
                objectId,
                archived,
                checkRequired("contentFolder", contentFolder),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): ContentFolder = contentFolder

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> objectId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                archived?.let { put("archived", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FolderUpdateParams &&
            objectId == other.objectId &&
            archived == other.archived &&
            contentFolder == other.contentFolder &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(objectId, archived, contentFolder, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "FolderUpdateParams{objectId=$objectId, archived=$archived, contentFolder=$contentFolder, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
