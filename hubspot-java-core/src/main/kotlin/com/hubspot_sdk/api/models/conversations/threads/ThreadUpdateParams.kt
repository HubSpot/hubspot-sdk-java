// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.threads

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.models.conversations.PublicThreadUpdateRequest
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ThreadUpdateParams
private constructor(
    private val threadId: Long?,
    private val queryArchived: Boolean?,
    private val publicThreadUpdateRequest: PublicThreadUpdateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun threadId(): Optional<Long> = Optional.ofNullable(threadId)

    fun queryArchived(): Optional<Boolean> = Optional.ofNullable(queryArchived)

    fun publicThreadUpdateRequest(): PublicThreadUpdateRequest = publicThreadUpdateRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        publicThreadUpdateRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ThreadUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .publicThreadUpdateRequest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ThreadUpdateParams]. */
    class Builder internal constructor() {

        private var threadId: Long? = null
        private var queryArchived: Boolean? = null
        private var publicThreadUpdateRequest: PublicThreadUpdateRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(threadUpdateParams: ThreadUpdateParams) = apply {
            threadId = threadUpdateParams.threadId
            queryArchived = threadUpdateParams.queryArchived
            publicThreadUpdateRequest = threadUpdateParams.publicThreadUpdateRequest
            additionalHeaders = threadUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = threadUpdateParams.additionalQueryParams.toBuilder()
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

        fun queryArchived(queryArchived: Boolean?) = apply { this.queryArchived = queryArchived }

        /**
         * Alias for [Builder.queryArchived].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun queryArchived(queryArchived: Boolean) = queryArchived(queryArchived as Boolean?)

        /** Alias for calling [Builder.queryArchived] with `queryArchived.orElse(null)`. */
        fun queryArchived(queryArchived: Optional<Boolean>) =
            queryArchived(queryArchived.getOrNull())

        fun publicThreadUpdateRequest(publicThreadUpdateRequest: PublicThreadUpdateRequest) =
            apply {
                this.publicThreadUpdateRequest = publicThreadUpdateRequest
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
         * Returns an immutable instance of [ThreadUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .publicThreadUpdateRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ThreadUpdateParams =
            ThreadUpdateParams(
                threadId,
                queryArchived,
                checkRequired("publicThreadUpdateRequest", publicThreadUpdateRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): PublicThreadUpdateRequest = publicThreadUpdateRequest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> threadId?.toString() ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                queryArchived?.let { put("archived", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ThreadUpdateParams &&
            threadId == other.threadId &&
            queryArchived == other.queryArchived &&
            publicThreadUpdateRequest == other.publicThreadUpdateRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            threadId,
            queryArchived,
            publicThreadUpdateRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ThreadUpdateParams{threadId=$threadId, queryArchived=$queryArchived, publicThreadUpdateRequest=$publicThreadUpdateRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
