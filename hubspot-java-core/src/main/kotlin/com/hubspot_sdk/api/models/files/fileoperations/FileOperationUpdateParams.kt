// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.files.fileoperations

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.models.files.FileUpdateInput
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update properties of file by ID. */
class FileOperationUpdateParams
private constructor(
    private val fileId: String?,
    private val fileUpdateInput: FileUpdateInput,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun fileId(): Optional<String> = Optional.ofNullable(fileId)

    /** Object for updating files. */
    fun fileUpdateInput(): FileUpdateInput = fileUpdateInput

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        fileUpdateInput._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FileOperationUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .fileUpdateInput()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FileOperationUpdateParams]. */
    class Builder internal constructor() {

        private var fileId: String? = null
        private var fileUpdateInput: FileUpdateInput? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(fileOperationUpdateParams: FileOperationUpdateParams) = apply {
            fileId = fileOperationUpdateParams.fileId
            fileUpdateInput = fileOperationUpdateParams.fileUpdateInput
            additionalHeaders = fileOperationUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = fileOperationUpdateParams.additionalQueryParams.toBuilder()
        }

        fun fileId(fileId: String?) = apply { this.fileId = fileId }

        /** Alias for calling [Builder.fileId] with `fileId.orElse(null)`. */
        fun fileId(fileId: Optional<String>) = fileId(fileId.getOrNull())

        /** Object for updating files. */
        fun fileUpdateInput(fileUpdateInput: FileUpdateInput) = apply {
            this.fileUpdateInput = fileUpdateInput
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
         * Returns an immutable instance of [FileOperationUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .fileUpdateInput()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FileOperationUpdateParams =
            FileOperationUpdateParams(
                fileId,
                checkRequired("fileUpdateInput", fileUpdateInput),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): FileUpdateInput = fileUpdateInput

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> fileId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FileOperationUpdateParams &&
            fileId == other.fileId &&
            fileUpdateInput == other.fileUpdateInput &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(fileId, fileUpdateInput, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "FileOperationUpdateParams{fileId=$fileId, fileUpdateInput=$fileUpdateInput, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
