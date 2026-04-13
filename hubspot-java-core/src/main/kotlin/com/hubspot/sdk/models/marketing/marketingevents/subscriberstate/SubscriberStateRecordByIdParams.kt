// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.marketingevents.subscriberstate

import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.Params
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.http.Headers
import com.hubspot.sdk.core.http.QueryParams
import com.hubspot.sdk.models.marketing.marketingevents.BatchInputMarketingEventSubscriber
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Record a subscriber state between multiple HubSpot contacts and a marketing event, using HubSpot
 * contact IDs. Note that the contact must already exist in HubSpot; a contact will not be created.
 */
class SubscriberStateRecordByIdParams
private constructor(
    private val externalEventId: String,
    private val subscriberState: String?,
    private val externalAccountId: String,
    private val batchInputMarketingEventSubscriber: BatchInputMarketingEventSubscriber,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun externalEventId(): String = externalEventId

    fun subscriberState(): Optional<String> = Optional.ofNullable(subscriberState)

    fun externalAccountId(): String = externalAccountId

    fun batchInputMarketingEventSubscriber(): BatchInputMarketingEventSubscriber =
        batchInputMarketingEventSubscriber

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        batchInputMarketingEventSubscriber._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SubscriberStateRecordByIdParams].
         *
         * The following fields are required:
         * ```java
         * .externalEventId()
         * .externalAccountId()
         * .batchInputMarketingEventSubscriber()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubscriberStateRecordByIdParams]. */
    class Builder internal constructor() {

        private var externalEventId: String? = null
        private var subscriberState: String? = null
        private var externalAccountId: String? = null
        private var batchInputMarketingEventSubscriber: BatchInputMarketingEventSubscriber? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(subscriberStateRecordByIdParams: SubscriberStateRecordByIdParams) =
            apply {
                externalEventId = subscriberStateRecordByIdParams.externalEventId
                subscriberState = subscriberStateRecordByIdParams.subscriberState
                externalAccountId = subscriberStateRecordByIdParams.externalAccountId
                batchInputMarketingEventSubscriber =
                    subscriberStateRecordByIdParams.batchInputMarketingEventSubscriber
                additionalHeaders = subscriberStateRecordByIdParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    subscriberStateRecordByIdParams.additionalQueryParams.toBuilder()
            }

        fun externalEventId(externalEventId: String) = apply {
            this.externalEventId = externalEventId
        }

        fun subscriberState(subscriberState: String?) = apply {
            this.subscriberState = subscriberState
        }

        /** Alias for calling [Builder.subscriberState] with `subscriberState.orElse(null)`. */
        fun subscriberState(subscriberState: Optional<String>) =
            subscriberState(subscriberState.getOrNull())

        fun externalAccountId(externalAccountId: String) = apply {
            this.externalAccountId = externalAccountId
        }

        fun batchInputMarketingEventSubscriber(
            batchInputMarketingEventSubscriber: BatchInputMarketingEventSubscriber
        ) = apply { this.batchInputMarketingEventSubscriber = batchInputMarketingEventSubscriber }

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
         * Returns an immutable instance of [SubscriberStateRecordByIdParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .externalEventId()
         * .externalAccountId()
         * .batchInputMarketingEventSubscriber()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SubscriberStateRecordByIdParams =
            SubscriberStateRecordByIdParams(
                checkRequired("externalEventId", externalEventId),
                subscriberState,
                checkRequired("externalAccountId", externalAccountId),
                checkRequired(
                    "batchInputMarketingEventSubscriber",
                    batchInputMarketingEventSubscriber,
                ),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): BatchInputMarketingEventSubscriber = batchInputMarketingEventSubscriber

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> externalEventId
            1 -> subscriberState ?: ""
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

        return other is SubscriberStateRecordByIdParams &&
            externalEventId == other.externalEventId &&
            subscriberState == other.subscriberState &&
            externalAccountId == other.externalAccountId &&
            batchInputMarketingEventSubscriber == other.batchInputMarketingEventSubscriber &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            externalEventId,
            subscriberState,
            externalAccountId,
            batchInputMarketingEventSubscriber,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "SubscriberStateRecordByIdParams{externalEventId=$externalEventId, subscriberState=$subscriberState, externalAccountId=$externalAccountId, batchInputMarketingEventSubscriber=$batchInputMarketingEventSubscriber, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
