// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update an existing oEmbed domain. */
class MediaBridgeUpdateOembedDomainParams
private constructor(
    private val appId: Int,
    private val oEmbedDomainId: String?,
    private val integratorOEmbedDomainRequest: IntegratorOEmbedDomainRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun appId(): Int = appId

    fun oEmbedDomainId(): Optional<String> = Optional.ofNullable(oEmbedDomainId)

    fun integratorOEmbedDomainRequest(): IntegratorOEmbedDomainRequest =
        integratorOEmbedDomainRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        integratorOEmbedDomainRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [MediaBridgeUpdateOembedDomainParams].
         *
         * The following fields are required:
         * ```java
         * .appId()
         * .integratorOEmbedDomainRequest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MediaBridgeUpdateOembedDomainParams]. */
    class Builder internal constructor() {

        private var appId: Int? = null
        private var oEmbedDomainId: String? = null
        private var integratorOEmbedDomainRequest: IntegratorOEmbedDomainRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            mediaBridgeUpdateOembedDomainParams: MediaBridgeUpdateOembedDomainParams
        ) = apply {
            appId = mediaBridgeUpdateOembedDomainParams.appId
            oEmbedDomainId = mediaBridgeUpdateOembedDomainParams.oEmbedDomainId
            integratorOEmbedDomainRequest =
                mediaBridgeUpdateOembedDomainParams.integratorOEmbedDomainRequest
            additionalHeaders = mediaBridgeUpdateOembedDomainParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                mediaBridgeUpdateOembedDomainParams.additionalQueryParams.toBuilder()
        }

        fun appId(appId: Int) = apply { this.appId = appId }

        fun oEmbedDomainId(oEmbedDomainId: String?) = apply { this.oEmbedDomainId = oEmbedDomainId }

        /** Alias for calling [Builder.oEmbedDomainId] with `oEmbedDomainId.orElse(null)`. */
        fun oEmbedDomainId(oEmbedDomainId: Optional<String>) =
            oEmbedDomainId(oEmbedDomainId.getOrNull())

        fun integratorOEmbedDomainRequest(
            integratorOEmbedDomainRequest: IntegratorOEmbedDomainRequest
        ) = apply { this.integratorOEmbedDomainRequest = integratorOEmbedDomainRequest }

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
         * Returns an immutable instance of [MediaBridgeUpdateOembedDomainParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .appId()
         * .integratorOEmbedDomainRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MediaBridgeUpdateOembedDomainParams =
            MediaBridgeUpdateOembedDomainParams(
                checkRequired("appId", appId),
                oEmbedDomainId,
                checkRequired("integratorOEmbedDomainRequest", integratorOEmbedDomainRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): IntegratorOEmbedDomainRequest = integratorOEmbedDomainRequest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> appId.toString()
            1 -> oEmbedDomainId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MediaBridgeUpdateOembedDomainParams &&
            appId == other.appId &&
            oEmbedDomainId == other.oEmbedDomainId &&
            integratorOEmbedDomainRequest == other.integratorOEmbedDomainRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            appId,
            oEmbedDomainId,
            integratorOEmbedDomainRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "MediaBridgeUpdateOembedDomainParams{appId=$appId, oEmbedDomainId=$oEmbedDomainId, integratorOEmbedDomainRequest=$integratorOEmbedDomainRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
