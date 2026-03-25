// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class EventUpsertByExternalEventIdParams
private constructor(
    private val pathExternalEventId: String?,
    private val marketingEventCreateRequestParams: MarketingEventCreateRequestParams,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun pathExternalEventId(): Optional<String> = Optional.ofNullable(pathExternalEventId)

    fun marketingEventCreateRequestParams(): MarketingEventCreateRequestParams =
        marketingEventCreateRequestParams

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        marketingEventCreateRequestParams._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [EventUpsertByExternalEventIdParams].
         *
         * The following fields are required:
         * ```java
         * .marketingEventCreateRequestParams()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EventUpsertByExternalEventIdParams]. */
    class Builder internal constructor() {

        private var pathExternalEventId: String? = null
        private var marketingEventCreateRequestParams: MarketingEventCreateRequestParams? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(eventUpsertByExternalEventIdParams: EventUpsertByExternalEventIdParams) =
            apply {
                pathExternalEventId = eventUpsertByExternalEventIdParams.pathExternalEventId
                marketingEventCreateRequestParams =
                    eventUpsertByExternalEventIdParams.marketingEventCreateRequestParams
                additionalHeaders = eventUpsertByExternalEventIdParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    eventUpsertByExternalEventIdParams.additionalQueryParams.toBuilder()
            }

        fun pathExternalEventId(pathExternalEventId: String?) = apply {
            this.pathExternalEventId = pathExternalEventId
        }

        /**
         * Alias for calling [Builder.pathExternalEventId] with `pathExternalEventId.orElse(null)`.
         */
        fun pathExternalEventId(pathExternalEventId: Optional<String>) =
            pathExternalEventId(pathExternalEventId.getOrNull())

        fun marketingEventCreateRequestParams(
            marketingEventCreateRequestParams: MarketingEventCreateRequestParams
        ) = apply { this.marketingEventCreateRequestParams = marketingEventCreateRequestParams }

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
         * Returns an immutable instance of [EventUpsertByExternalEventIdParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .marketingEventCreateRequestParams()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EventUpsertByExternalEventIdParams =
            EventUpsertByExternalEventIdParams(
                pathExternalEventId,
                checkRequired(
                    "marketingEventCreateRequestParams",
                    marketingEventCreateRequestParams,
                ),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): MarketingEventCreateRequestParams = marketingEventCreateRequestParams

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> pathExternalEventId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EventUpsertByExternalEventIdParams &&
            pathExternalEventId == other.pathExternalEventId &&
            marketingEventCreateRequestParams == other.marketingEventCreateRequestParams &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            pathExternalEventId,
            marketingEventCreateRequestParams,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "EventUpsertByExternalEventIdParams{pathExternalEventId=$pathExternalEventId, marketingEventCreateRequestParams=$marketingEventCreateRequestParams, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
