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

/**
 * Updates the details of an existing Marketing Event identified by its externalAccountId,
 * externalEventId if it exists.
 *
 * Only Marketing Events created by the same app can be updated.
 */
class EventUpdateByExternalEventIdParams
private constructor(
    private val externalEventId: String?,
    private val externalAccountId: String,
    private val marketingEventUpdateRequestParams: MarketingEventUpdateRequestParams,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun externalEventId(): Optional<String> = Optional.ofNullable(externalEventId)

    fun externalAccountId(): String = externalAccountId

    fun marketingEventUpdateRequestParams(): MarketingEventUpdateRequestParams =
        marketingEventUpdateRequestParams

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        marketingEventUpdateRequestParams._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [EventUpdateByExternalEventIdParams].
         *
         * The following fields are required:
         * ```java
         * .externalAccountId()
         * .marketingEventUpdateRequestParams()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EventUpdateByExternalEventIdParams]. */
    class Builder internal constructor() {

        private var externalEventId: String? = null
        private var externalAccountId: String? = null
        private var marketingEventUpdateRequestParams: MarketingEventUpdateRequestParams? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(eventUpdateByExternalEventIdParams: EventUpdateByExternalEventIdParams) =
            apply {
                externalEventId = eventUpdateByExternalEventIdParams.externalEventId
                externalAccountId = eventUpdateByExternalEventIdParams.externalAccountId
                marketingEventUpdateRequestParams =
                    eventUpdateByExternalEventIdParams.marketingEventUpdateRequestParams
                additionalHeaders = eventUpdateByExternalEventIdParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    eventUpdateByExternalEventIdParams.additionalQueryParams.toBuilder()
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

        fun marketingEventUpdateRequestParams(
            marketingEventUpdateRequestParams: MarketingEventUpdateRequestParams
        ) = apply { this.marketingEventUpdateRequestParams = marketingEventUpdateRequestParams }

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
         * Returns an immutable instance of [EventUpdateByExternalEventIdParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .externalAccountId()
         * .marketingEventUpdateRequestParams()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EventUpdateByExternalEventIdParams =
            EventUpdateByExternalEventIdParams(
                externalEventId,
                checkRequired("externalAccountId", externalAccountId),
                checkRequired(
                    "marketingEventUpdateRequestParams",
                    marketingEventUpdateRequestParams,
                ),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): MarketingEventUpdateRequestParams = marketingEventUpdateRequestParams

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

        return other is EventUpdateByExternalEventIdParams &&
            externalEventId == other.externalEventId &&
            externalAccountId == other.externalAccountId &&
            marketingEventUpdateRequestParams == other.marketingEventUpdateRequestParams &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            externalEventId,
            externalAccountId,
            marketingEventUpdateRequestParams,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "EventUpdateByExternalEventIdParams{externalEventId=$externalEventId, externalAccountId=$externalAccountId, marketingEventUpdateRequestParams=$marketingEventUpdateRequestParams, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
