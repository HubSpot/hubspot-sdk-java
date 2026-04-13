// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.conversations.customchannels.channelaccounts

import com.hubspot.core.JsonValue
import com.hubspot.core.Params
import com.hubspot.core.checkRequired
import com.hubspot.core.http.Headers
import com.hubspot.core.http.QueryParams
import com.hubspot.models.conversations.customchannels.PublicChannelAccountUpdateRequest
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * This API is used to update the name of the channel account and it's isAuthorized status. Setting
 * to isAuthorized flag to False disables the channel account.
 */
class ChannelAccountUpdateParams
private constructor(
    private val channelId: Int,
    private val channelAccountId: Long?,
    private val publicChannelAccountUpdateRequest: PublicChannelAccountUpdateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun channelId(): Int = channelId

    fun channelAccountId(): Optional<Long> = Optional.ofNullable(channelAccountId)

    fun publicChannelAccountUpdateRequest(): PublicChannelAccountUpdateRequest =
        publicChannelAccountUpdateRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        publicChannelAccountUpdateRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ChannelAccountUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .channelId()
         * .publicChannelAccountUpdateRequest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ChannelAccountUpdateParams]. */
    class Builder internal constructor() {

        private var channelId: Int? = null
        private var channelAccountId: Long? = null
        private var publicChannelAccountUpdateRequest: PublicChannelAccountUpdateRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(channelAccountUpdateParams: ChannelAccountUpdateParams) = apply {
            channelId = channelAccountUpdateParams.channelId
            channelAccountId = channelAccountUpdateParams.channelAccountId
            publicChannelAccountUpdateRequest =
                channelAccountUpdateParams.publicChannelAccountUpdateRequest
            additionalHeaders = channelAccountUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = channelAccountUpdateParams.additionalQueryParams.toBuilder()
        }

        fun channelId(channelId: Int) = apply { this.channelId = channelId }

        fun channelAccountId(channelAccountId: Long?) = apply {
            this.channelAccountId = channelAccountId
        }

        /**
         * Alias for [Builder.channelAccountId].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun channelAccountId(channelAccountId: Long) = channelAccountId(channelAccountId as Long?)

        /** Alias for calling [Builder.channelAccountId] with `channelAccountId.orElse(null)`. */
        fun channelAccountId(channelAccountId: Optional<Long>) =
            channelAccountId(channelAccountId.getOrNull())

        fun publicChannelAccountUpdateRequest(
            publicChannelAccountUpdateRequest: PublicChannelAccountUpdateRequest
        ) = apply { this.publicChannelAccountUpdateRequest = publicChannelAccountUpdateRequest }

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
         * Returns an immutable instance of [ChannelAccountUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .channelId()
         * .publicChannelAccountUpdateRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ChannelAccountUpdateParams =
            ChannelAccountUpdateParams(
                checkRequired("channelId", channelId),
                channelAccountId,
                checkRequired(
                    "publicChannelAccountUpdateRequest",
                    publicChannelAccountUpdateRequest,
                ),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): PublicChannelAccountUpdateRequest = publicChannelAccountUpdateRequest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> channelId.toString()
            1 -> channelAccountId?.toString() ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChannelAccountUpdateParams &&
            channelId == other.channelId &&
            channelAccountId == other.channelAccountId &&
            publicChannelAccountUpdateRequest == other.publicChannelAccountUpdateRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            channelId,
            channelAccountId,
            publicChannelAccountUpdateRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ChannelAccountUpdateParams{channelId=$channelId, channelAccountId=$channelAccountId, publicChannelAccountUpdateRequest=$publicChannelAccountUpdateRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
