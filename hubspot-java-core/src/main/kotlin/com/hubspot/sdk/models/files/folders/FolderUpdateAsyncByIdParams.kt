// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.files.folders

import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.Params
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.http.Headers
import com.hubspot.sdk.core.http.QueryParams
import com.hubspot.sdk.models.files.FolderUpdateInputWithId
import java.util.Objects

/**
 * Update properties of folder by given ID. This action happens asynchronously and will update all
 * of the folder's children as well.
 */
class FolderUpdateAsyncByIdParams
private constructor(
    private val folderUpdateInputWithId: FolderUpdateInputWithId,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun folderUpdateInputWithId(): FolderUpdateInputWithId = folderUpdateInputWithId

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        folderUpdateInputWithId._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FolderUpdateAsyncByIdParams].
         *
         * The following fields are required:
         * ```java
         * .folderUpdateInputWithId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FolderUpdateAsyncByIdParams]. */
    class Builder internal constructor() {

        private var folderUpdateInputWithId: FolderUpdateInputWithId? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(folderUpdateAsyncByIdParams: FolderUpdateAsyncByIdParams) = apply {
            folderUpdateInputWithId = folderUpdateAsyncByIdParams.folderUpdateInputWithId
            additionalHeaders = folderUpdateAsyncByIdParams.additionalHeaders.toBuilder()
            additionalQueryParams = folderUpdateAsyncByIdParams.additionalQueryParams.toBuilder()
        }

        fun folderUpdateInputWithId(folderUpdateInputWithId: FolderUpdateInputWithId) = apply {
            this.folderUpdateInputWithId = folderUpdateInputWithId
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
         * Returns an immutable instance of [FolderUpdateAsyncByIdParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .folderUpdateInputWithId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FolderUpdateAsyncByIdParams =
            FolderUpdateAsyncByIdParams(
                checkRequired("folderUpdateInputWithId", folderUpdateInputWithId),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): FolderUpdateInputWithId = folderUpdateInputWithId

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FolderUpdateAsyncByIdParams &&
            folderUpdateInputWithId == other.folderUpdateInputWithId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(folderUpdateInputWithId, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "FolderUpdateAsyncByIdParams{folderUpdateInputWithId=$folderUpdateInputWithId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
