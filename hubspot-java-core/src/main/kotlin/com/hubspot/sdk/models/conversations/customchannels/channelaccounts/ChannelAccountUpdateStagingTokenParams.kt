// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.conversations.customchannels.channelaccounts

import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.Params
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.http.Headers
import com.hubspot.sdk.core.http.QueryParams
import com.hubspot.sdk.models.conversations.customchannels.PublicChannelAccountStagingTokenUpdateRequest
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Update a channel account staging token's account name and delivery identifier. This information
 * will be applied to the channel account created from this staging token. This is used for public
 * apps.
 */
class ChannelAccountUpdateStagingTokenParams
private constructor(
    private val channelId: Int,
    private val accountToken: String?,
    private val publicChannelAccountStagingTokenUpdateRequest:
        PublicChannelAccountStagingTokenUpdateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun channelId(): Int = channelId

    fun accountToken(): Optional<String> = Optional.ofNullable(accountToken)

    fun publicChannelAccountStagingTokenUpdateRequest():
        PublicChannelAccountStagingTokenUpdateRequest =
        publicChannelAccountStagingTokenUpdateRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        publicChannelAccountStagingTokenUpdateRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ChannelAccountUpdateStagingTokenParams].
         *
         * The following fields are required:
         * ```java
         * .channelId()
         * .publicChannelAccountStagingTokenUpdateRequest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ChannelAccountUpdateStagingTokenParams]. */
    class Builder internal constructor() {

        private var channelId: Int? = null
        private var accountToken: String? = null
        private var publicChannelAccountStagingTokenUpdateRequest:
            PublicChannelAccountStagingTokenUpdateRequest? =
            null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            channelAccountUpdateStagingTokenParams: ChannelAccountUpdateStagingTokenParams
        ) = apply {
            channelId = channelAccountUpdateStagingTokenParams.channelId
            accountToken = channelAccountUpdateStagingTokenParams.accountToken
            publicChannelAccountStagingTokenUpdateRequest =
                channelAccountUpdateStagingTokenParams.publicChannelAccountStagingTokenUpdateRequest
            additionalHeaders = channelAccountUpdateStagingTokenParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                channelAccountUpdateStagingTokenParams.additionalQueryParams.toBuilder()
        }

        fun channelId(channelId: Int) = apply { this.channelId = channelId }

        fun accountToken(accountToken: String?) = apply { this.accountToken = accountToken }

        /** Alias for calling [Builder.accountToken] with `accountToken.orElse(null)`. */
        fun accountToken(accountToken: Optional<String>) = accountToken(accountToken.getOrNull())

        fun publicChannelAccountStagingTokenUpdateRequest(
            publicChannelAccountStagingTokenUpdateRequest:
                PublicChannelAccountStagingTokenUpdateRequest
        ) = apply {
            this.publicChannelAccountStagingTokenUpdateRequest =
                publicChannelAccountStagingTokenUpdateRequest
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
         * Returns an immutable instance of [ChannelAccountUpdateStagingTokenParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .channelId()
         * .publicChannelAccountStagingTokenUpdateRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ChannelAccountUpdateStagingTokenParams =
            ChannelAccountUpdateStagingTokenParams(
                checkRequired("channelId", channelId),
                accountToken,
                checkRequired(
                    "publicChannelAccountStagingTokenUpdateRequest",
                    publicChannelAccountStagingTokenUpdateRequest,
                ),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): PublicChannelAccountStagingTokenUpdateRequest =
        publicChannelAccountStagingTokenUpdateRequest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> channelId.toString()
            1 -> accountToken ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChannelAccountUpdateStagingTokenParams &&
            channelId == other.channelId &&
            accountToken == other.accountToken &&
            publicChannelAccountStagingTokenUpdateRequest ==
                other.publicChannelAccountStagingTokenUpdateRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            channelId,
            accountToken,
            publicChannelAccountStagingTokenUpdateRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ChannelAccountUpdateStagingTokenParams{channelId=$channelId, accountToken=$accountToken, publicChannelAccountStagingTokenUpdateRequest=$publicChannelAccountStagingTokenUpdateRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
