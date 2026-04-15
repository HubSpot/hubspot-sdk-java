// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.marketingevents.events

import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.Params
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.http.Headers
import com.hubspot.sdk.core.http.QueryParams
import com.hubspot.sdk.models.marketing.marketingevents.MarketingEventCompleteRequestParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Mark a marketing event as completed */
class EventCompleteByExternalEventIdParams
private constructor(
    private val externalEventId: String?,
    private val externalAccountId: String,
    private val marketingEventCompleteRequestParams: MarketingEventCompleteRequestParams,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun externalEventId(): Optional<String> = Optional.ofNullable(externalEventId)

    fun externalAccountId(): String = externalAccountId

    fun marketingEventCompleteRequestParams(): MarketingEventCompleteRequestParams =
        marketingEventCompleteRequestParams

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        marketingEventCompleteRequestParams._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [EventCompleteByExternalEventIdParams].
         *
         * The following fields are required:
         * ```java
         * .externalAccountId()
         * .marketingEventCompleteRequestParams()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EventCompleteByExternalEventIdParams]. */
    class Builder internal constructor() {

        private var externalEventId: String? = null
        private var externalAccountId: String? = null
        private var marketingEventCompleteRequestParams: MarketingEventCompleteRequestParams? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            eventCompleteByExternalEventIdParams: EventCompleteByExternalEventIdParams
        ) = apply {
            externalEventId = eventCompleteByExternalEventIdParams.externalEventId
            externalAccountId = eventCompleteByExternalEventIdParams.externalAccountId
            marketingEventCompleteRequestParams =
                eventCompleteByExternalEventIdParams.marketingEventCompleteRequestParams
            additionalHeaders = eventCompleteByExternalEventIdParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                eventCompleteByExternalEventIdParams.additionalQueryParams.toBuilder()
        }

        fun externalEventId(externalEventId: String?) = apply {
            this.externalEventId = externalEventId
        }

        /** Alias for calling [Builder.externalEventId] with `externalEventId.orElse(null)`. */
        fun externalEventId(externalEventId: Optional<String>) =
            externalEventId(externalEventId.getOrNull())

        fun externalAccountId(externalAccountId: String) = apply {
            this.externalAccountId = externalAccountId
        }

        fun marketingEventCompleteRequestParams(
            marketingEventCompleteRequestParams: MarketingEventCompleteRequestParams
        ) = apply { this.marketingEventCompleteRequestParams = marketingEventCompleteRequestParams }

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
         * Returns an immutable instance of [EventCompleteByExternalEventIdParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .externalAccountId()
         * .marketingEventCompleteRequestParams()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EventCompleteByExternalEventIdParams =
            EventCompleteByExternalEventIdParams(
                externalEventId,
                checkRequired("externalAccountId", externalAccountId),
                checkRequired(
                    "marketingEventCompleteRequestParams",
                    marketingEventCompleteRequestParams,
                ),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): MarketingEventCompleteRequestParams = marketingEventCompleteRequestParams

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> externalEventId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("externalAccountId", externalAccountId)
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EventCompleteByExternalEventIdParams &&
            externalEventId == other.externalEventId &&
            externalAccountId == other.externalAccountId &&
            marketingEventCompleteRequestParams == other.marketingEventCompleteRequestParams &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            externalEventId,
            externalAccountId,
            marketingEventCompleteRequestParams,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "EventCompleteByExternalEventIdParams{externalEventId=$externalEventId, externalAccountId=$externalAccountId, marketingEventCompleteRequestParams=$marketingEventCompleteRequestParams, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
