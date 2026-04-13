// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.marketingevents.subscriberstate

import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.Params
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.http.Headers
import com.hubspot.sdk.core.http.QueryParams
import com.hubspot.sdk.models.marketing.marketingevents.BatchInputMarketingEventEmailSubscriber
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Record a subscriber state between multiple HubSpot contacts and a marketing event, using contact
 * email addresses. Note that the contact must already exist in HubSpot; a contact will not be
 * created. The contactProperties field is used only when creating a new contact. These properties
 * will not update existing contacts.
 */
class SubscriberStateRecordByEmailParams
private constructor(
    private val externalEventId: String,
    private val subscriberState: String?,
    private val externalAccountId: String,
    private val batchInputMarketingEventEmailSubscriber: BatchInputMarketingEventEmailSubscriber,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun externalEventId(): String = externalEventId

    fun subscriberState(): Optional<String> = Optional.ofNullable(subscriberState)

    fun externalAccountId(): String = externalAccountId

    fun batchInputMarketingEventEmailSubscriber(): BatchInputMarketingEventEmailSubscriber =
        batchInputMarketingEventEmailSubscriber

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        batchInputMarketingEventEmailSubscriber._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SubscriberStateRecordByEmailParams].
         *
         * The following fields are required:
         * ```java
         * .externalEventId()
         * .externalAccountId()
         * .batchInputMarketingEventEmailSubscriber()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubscriberStateRecordByEmailParams]. */
    class Builder internal constructor() {

        private var externalEventId: String? = null
        private var subscriberState: String? = null
        private var externalAccountId: String? = null
        private var batchInputMarketingEventEmailSubscriber:
            BatchInputMarketingEventEmailSubscriber? =
            null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(subscriberStateRecordByEmailParams: SubscriberStateRecordByEmailParams) =
            apply {
                externalEventId = subscriberStateRecordByEmailParams.externalEventId
                subscriberState = subscriberStateRecordByEmailParams.subscriberState
                externalAccountId = subscriberStateRecordByEmailParams.externalAccountId
                batchInputMarketingEventEmailSubscriber =
                    subscriberStateRecordByEmailParams.batchInputMarketingEventEmailSubscriber
                additionalHeaders = subscriberStateRecordByEmailParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    subscriberStateRecordByEmailParams.additionalQueryParams.toBuilder()
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

        fun batchInputMarketingEventEmailSubscriber(
            batchInputMarketingEventEmailSubscriber: BatchInputMarketingEventEmailSubscriber
        ) = apply {
            this.batchInputMarketingEventEmailSubscriber = batchInputMarketingEventEmailSubscriber
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
         * Returns an immutable instance of [SubscriberStateRecordByEmailParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .externalEventId()
         * .externalAccountId()
         * .batchInputMarketingEventEmailSubscriber()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SubscriberStateRecordByEmailParams =
            SubscriberStateRecordByEmailParams(
                checkRequired("externalEventId", externalEventId),
                subscriberState,
                checkRequired("externalAccountId", externalAccountId),
                checkRequired(
                    "batchInputMarketingEventEmailSubscriber",
                    batchInputMarketingEventEmailSubscriber,
                ),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): BatchInputMarketingEventEmailSubscriber = batchInputMarketingEventEmailSubscriber

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

        return other is SubscriberStateRecordByEmailParams &&
            externalEventId == other.externalEventId &&
            subscriberState == other.subscriberState &&
            externalAccountId == other.externalAccountId &&
            batchInputMarketingEventEmailSubscriber ==
                other.batchInputMarketingEventEmailSubscriber &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            externalEventId,
            subscriberState,
            externalAccountId,
            batchInputMarketingEventEmailSubscriber,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "SubscriberStateRecordByEmailParams{externalEventId=$externalEventId, subscriberState=$subscriberState, externalAccountId=$externalAccountId, batchInputMarketingEventEmailSubscriber=$batchInputMarketingEventEmailSubscriber, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
