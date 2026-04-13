// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.mediabridge

import com.hubspot.core.Params
import com.hubspot.core.http.Headers
import com.hubspot.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get the details for existing oEmbed domains for your app */
class MediaBridgeListOembedDomainsParams
private constructor(
    private val appId: Int?,
    private val domainPortalId: Int?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun appId(): Optional<Int> = Optional.ofNullable(appId)

    fun domainPortalId(): Optional<Int> = Optional.ofNullable(domainPortalId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): MediaBridgeListOembedDomainsParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [MediaBridgeListOembedDomainsParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MediaBridgeListOembedDomainsParams]. */
    class Builder internal constructor() {

        private var appId: Int? = null
        private var domainPortalId: Int? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(mediaBridgeListOembedDomainsParams: MediaBridgeListOembedDomainsParams) =
            apply {
                appId = mediaBridgeListOembedDomainsParams.appId
                domainPortalId = mediaBridgeListOembedDomainsParams.domainPortalId
                additionalHeaders = mediaBridgeListOembedDomainsParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    mediaBridgeListOembedDomainsParams.additionalQueryParams.toBuilder()
            }

        fun appId(appId: Int?) = apply { this.appId = appId }

        /**
         * Alias for [Builder.appId].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun appId(appId: Int) = appId(appId as Int?)

        /** Alias for calling [Builder.appId] with `appId.orElse(null)`. */
        fun appId(appId: Optional<Int>) = appId(appId.getOrNull())

        fun domainPortalId(domainPortalId: Int?) = apply { this.domainPortalId = domainPortalId }

        /**
         * Alias for [Builder.domainPortalId].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun domainPortalId(domainPortalId: Int) = domainPortalId(domainPortalId as Int?)

        /** Alias for calling [Builder.domainPortalId] with `domainPortalId.orElse(null)`. */
        fun domainPortalId(domainPortalId: Optional<Int>) =
            domainPortalId(domainPortalId.getOrNull())

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
         * Returns an immutable instance of [MediaBridgeListOembedDomainsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MediaBridgeListOembedDomainsParams =
            MediaBridgeListOembedDomainsParams(
                appId,
                domainPortalId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> appId?.toString() ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                domainPortalId?.let { put("domainPortalId", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MediaBridgeListOembedDomainsParams &&
            appId == other.appId &&
            domainPortalId == other.domainPortalId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(appId, domainPortalId, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "MediaBridgeListOembedDomainsParams{appId=$appId, domainPortalId=$domainPortalId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
