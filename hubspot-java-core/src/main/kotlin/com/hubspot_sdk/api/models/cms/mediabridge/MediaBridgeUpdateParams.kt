// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class MediaBridgeUpdateParams
private constructor(
    private val objectId: Long?,
    private val updateMbObjectRequest: UpdateMbObjectRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun objectId(): Optional<Long> = Optional.ofNullable(objectId)

    fun updateMbObjectRequest(): UpdateMbObjectRequest = updateMbObjectRequest

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MediaBridgeUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .updateMbObjectRequest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MediaBridgeUpdateParams]. */
    class Builder internal constructor() {

        private var objectId: Long? = null
        private var updateMbObjectRequest: UpdateMbObjectRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(mediaBridgeUpdateParams: MediaBridgeUpdateParams) = apply {
            objectId = mediaBridgeUpdateParams.objectId
            updateMbObjectRequest = mediaBridgeUpdateParams.updateMbObjectRequest
            additionalHeaders = mediaBridgeUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = mediaBridgeUpdateParams.additionalQueryParams.toBuilder()
        }

        fun objectId(objectId: Long?) = apply { this.objectId = objectId }

        /**
         * Alias for [Builder.objectId].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun objectId(objectId: Long) = objectId(objectId as Long?)

        /** Alias for calling [Builder.objectId] with `objectId.orElse(null)`. */
        fun objectId(objectId: Optional<Long>) = objectId(objectId.getOrNull())

        fun updateMbObjectRequest(updateMbObjectRequest: UpdateMbObjectRequest) = apply {
            this.updateMbObjectRequest = updateMbObjectRequest
        }

        /**
         * Alias for calling [updateMbObjectRequest] with `UpdateMbObjectRequest.ofVideo(video)`.
         */
        fun updateMbObjectRequest(video: UpdateVideoObjectRequest) =
            updateMbObjectRequest(UpdateMbObjectRequest.ofVideo(video))

        /**
         * Alias for calling [updateMbObjectRequest] with `UpdateMbObjectRequest.ofOther(other)`.
         */
        fun updateMbObjectRequest(other: UpdateOtherObjectRequest) =
            updateMbObjectRequest(UpdateMbObjectRequest.ofOther(other))

        /**
         * Alias for calling [updateMbObjectRequest] with `UpdateMbObjectRequest.ofAudio(audio)`.
         */
        fun updateMbObjectRequest(audio: UpdateAudioObjectRequest) =
            updateMbObjectRequest(UpdateMbObjectRequest.ofAudio(audio))

        /**
         * Alias for calling [updateMbObjectRequest] with `UpdateMbObjectRequest.ofImage(image)`.
         */
        fun updateMbObjectRequest(image: UpdateImageObjectRequest) =
            updateMbObjectRequest(UpdateMbObjectRequest.ofImage(image))

        /**
         * Alias for calling [updateMbObjectRequest] with
         * `UpdateMbObjectRequest.ofDocument(document)`.
         */
        fun updateMbObjectRequest(document: UpdateDocumentObjectRequest) =
            updateMbObjectRequest(UpdateMbObjectRequest.ofDocument(document))

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
         * Returns an immutable instance of [MediaBridgeUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .updateMbObjectRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MediaBridgeUpdateParams =
            MediaBridgeUpdateParams(
                objectId,
                checkRequired("updateMbObjectRequest", updateMbObjectRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): UpdateMbObjectRequest = updateMbObjectRequest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> objectId?.toString() ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MediaBridgeUpdateParams &&
            objectId == other.objectId &&
            updateMbObjectRequest == other.updateMbObjectRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(objectId, updateMbObjectRequest, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "MediaBridgeUpdateParams{objectId=$objectId, updateMbObjectRequest=$updateMbObjectRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
