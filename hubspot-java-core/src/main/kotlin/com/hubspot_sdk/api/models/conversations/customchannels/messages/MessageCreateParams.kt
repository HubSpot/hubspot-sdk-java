// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels.messages

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.models.conversations.customchannels.ChannelIntegrationMessageEgg
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class MessageCreateParams
private constructor(
    private val channelId: Int?,
    private val channelIntegrationMessageEgg: ChannelIntegrationMessageEgg,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun channelId(): Optional<Int> = Optional.ofNullable(channelId)

    fun channelIntegrationMessageEgg(): ChannelIntegrationMessageEgg = channelIntegrationMessageEgg

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        channelIntegrationMessageEgg._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MessageCreateParams].
         *
         * The following fields are required:
         * ```java
         * .channelIntegrationMessageEgg()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MessageCreateParams]. */
    class Builder internal constructor() {

        private var channelId: Int? = null
        private var channelIntegrationMessageEgg: ChannelIntegrationMessageEgg? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(messageCreateParams: MessageCreateParams) = apply {
            channelId = messageCreateParams.channelId
            channelIntegrationMessageEgg = messageCreateParams.channelIntegrationMessageEgg
            additionalHeaders = messageCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = messageCreateParams.additionalQueryParams.toBuilder()
        }

        fun channelId(channelId: Int?) = apply { this.channelId = channelId }

        /**
         * Alias for [Builder.channelId].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun channelId(channelId: Int) = channelId(channelId as Int?)

        /** Alias for calling [Builder.channelId] with `channelId.orElse(null)`. */
        fun channelId(channelId: Optional<Int>) = channelId(channelId.getOrNull())

        fun channelIntegrationMessageEgg(
            channelIntegrationMessageEgg: ChannelIntegrationMessageEgg
        ) = apply { this.channelIntegrationMessageEgg = channelIntegrationMessageEgg }

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
         * Returns an immutable instance of [MessageCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .channelIntegrationMessageEgg()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MessageCreateParams =
            MessageCreateParams(
                channelId,
                checkRequired("channelIntegrationMessageEgg", channelIntegrationMessageEgg),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): ChannelIntegrationMessageEgg = channelIntegrationMessageEgg

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> channelId?.toString() ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessageCreateParams &&
            channelId == other.channelId &&
            channelIntegrationMessageEgg == other.channelIntegrationMessageEgg &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            channelId,
            channelIntegrationMessageEgg,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "MessageCreateParams{channelId=$channelId, channelIntegrationMessageEgg=$channelIntegrationMessageEgg, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
