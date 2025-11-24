// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.messages

import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.models.conversations.PublicCommentEgg
import com.hubspot_sdk.api.models.conversations.PublicConversationsMessageEgg
import com.hubspot_sdk.api.models.conversations.PublicMessageEgg
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class MessageCreateParams
private constructor(
    private val threadId: Long?,
    private val publicMessageEgg: PublicMessageEgg,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun threadId(): Optional<Long> = Optional.ofNullable(threadId)

    fun publicMessageEgg(): PublicMessageEgg = publicMessageEgg

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
         * .publicMessageEgg()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MessageCreateParams]. */
    class Builder internal constructor() {

        private var threadId: Long? = null
        private var publicMessageEgg: PublicMessageEgg? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(messageCreateParams: MessageCreateParams) = apply {
            threadId = messageCreateParams.threadId
            publicMessageEgg = messageCreateParams.publicMessageEgg
            additionalHeaders = messageCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = messageCreateParams.additionalQueryParams.toBuilder()
        }

        fun threadId(threadId: Long?) = apply { this.threadId = threadId }

        /**
         * Alias for [Builder.threadId].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun threadId(threadId: Long) = threadId(threadId as Long?)

        /** Alias for calling [Builder.threadId] with `threadId.orElse(null)`. */
        fun threadId(threadId: Optional<Long>) = threadId(threadId.getOrNull())

        fun publicMessageEgg(publicMessageEgg: PublicMessageEgg) = apply {
            this.publicMessageEgg = publicMessageEgg
        }

        /**
         * Alias for calling [publicMessageEgg] with
         * `PublicMessageEgg.ofConversations(conversations)`.
         */
        fun publicMessageEgg(conversations: PublicConversationsMessageEgg) =
            publicMessageEgg(PublicMessageEgg.ofConversations(conversations))

        /** Alias for calling [publicMessageEgg] with `PublicMessageEgg.ofComment(comment)`. */
        fun publicMessageEgg(comment: PublicCommentEgg) =
            publicMessageEgg(PublicMessageEgg.ofComment(comment))

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
         * .publicMessageEgg()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MessageCreateParams =
            MessageCreateParams(
                threadId,
                checkRequired("publicMessageEgg", publicMessageEgg),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): PublicMessageEgg = publicMessageEgg

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> threadId?.toString() ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessageCreateParams &&
            threadId == other.threadId &&
            publicMessageEgg == other.publicMessageEgg &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(threadId, publicMessageEgg, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "MessageCreateParams{threadId=$threadId, publicMessageEgg=$publicMessageEgg, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
