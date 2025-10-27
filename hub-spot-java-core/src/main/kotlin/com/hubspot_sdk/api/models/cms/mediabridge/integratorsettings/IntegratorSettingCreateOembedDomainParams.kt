// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.models.cms.mediabridge.IntegratorOEmbedDomainRequest
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Set up a new oEmbed domain for your media bridge app. */
class IntegratorSettingCreateOembedDomainParams
private constructor(
    private val appId: String?,
    private val integratorOEmbedDomainRequest: IntegratorOEmbedDomainRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun appId(): Optional<String> = Optional.ofNullable(appId)

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
         * [IntegratorSettingCreateOembedDomainParams].
         *
         * The following fields are required:
         * ```java
         * .integratorOEmbedDomainRequest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IntegratorSettingCreateOembedDomainParams]. */
    class Builder internal constructor() {

        private var appId: String? = null
        private var integratorOEmbedDomainRequest: IntegratorOEmbedDomainRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            integratorSettingCreateOembedDomainParams: IntegratorSettingCreateOembedDomainParams
        ) = apply {
            appId = integratorSettingCreateOembedDomainParams.appId
            integratorOEmbedDomainRequest =
                integratorSettingCreateOembedDomainParams.integratorOEmbedDomainRequest
            additionalHeaders =
                integratorSettingCreateOembedDomainParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                integratorSettingCreateOembedDomainParams.additionalQueryParams.toBuilder()
        }

        fun appId(appId: String?) = apply { this.appId = appId }

        /** Alias for calling [Builder.appId] with `appId.orElse(null)`. */
        fun appId(appId: Optional<String>) = appId(appId.getOrNull())

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
         * Returns an immutable instance of [IntegratorSettingCreateOembedDomainParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .integratorOEmbedDomainRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IntegratorSettingCreateOembedDomainParams =
            IntegratorSettingCreateOembedDomainParams(
                appId,
                checkRequired("integratorOEmbedDomainRequest", integratorOEmbedDomainRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): IntegratorOEmbedDomainRequest = integratorOEmbedDomainRequest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> appId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IntegratorSettingCreateOembedDomainParams &&
            appId == other.appId &&
            integratorOEmbedDomainRequest == other.integratorOEmbedDomainRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(appId, integratorOEmbedDomainRequest, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "IntegratorSettingCreateOembedDomainParams{appId=$appId, integratorOEmbedDomainRequest=$integratorOEmbedDomainRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
