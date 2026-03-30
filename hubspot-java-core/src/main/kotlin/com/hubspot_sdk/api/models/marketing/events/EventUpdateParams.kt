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

/** Updates the details of an existing Marketing Event identified by its objectId, if it exists. */
class EventUpdateParams
private constructor(
    private val objectId: String?,
    private val marketingEventPublicUpdateRequestV2: MarketingEventPublicUpdateRequestV2,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun objectId(): Optional<String> = Optional.ofNullable(objectId)

    fun marketingEventPublicUpdateRequestV2(): MarketingEventPublicUpdateRequestV2 =
        marketingEventPublicUpdateRequestV2

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        marketingEventPublicUpdateRequestV2._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EventUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .marketingEventPublicUpdateRequestV2()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EventUpdateParams]. */
    class Builder internal constructor() {

        private var objectId: String? = null
        private var marketingEventPublicUpdateRequestV2: MarketingEventPublicUpdateRequestV2? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(eventUpdateParams: EventUpdateParams) = apply {
            objectId = eventUpdateParams.objectId
            marketingEventPublicUpdateRequestV2 =
                eventUpdateParams.marketingEventPublicUpdateRequestV2
            additionalHeaders = eventUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = eventUpdateParams.additionalQueryParams.toBuilder()
        }

        fun objectId(objectId: String?) = apply { this.objectId = objectId }

        /** Alias for calling [Builder.objectId] with `objectId.orElse(null)`. */
        fun objectId(objectId: Optional<String>) = objectId(objectId.getOrNull())

        fun marketingEventPublicUpdateRequestV2(
            marketingEventPublicUpdateRequestV2: MarketingEventPublicUpdateRequestV2
        ) = apply { this.marketingEventPublicUpdateRequestV2 = marketingEventPublicUpdateRequestV2 }

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
         * Returns an immutable instance of [EventUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .marketingEventPublicUpdateRequestV2()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EventUpdateParams =
            EventUpdateParams(
                objectId,
                checkRequired(
                    "marketingEventPublicUpdateRequestV2",
                    marketingEventPublicUpdateRequestV2,
                ),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): MarketingEventPublicUpdateRequestV2 = marketingEventPublicUpdateRequestV2

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> objectId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EventUpdateParams &&
            objectId == other.objectId &&
            marketingEventPublicUpdateRequestV2 == other.marketingEventPublicUpdateRequestV2 &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            objectId,
            marketingEventPublicUpdateRequestV2,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "EventUpdateParams{objectId=$objectId, marketingEventPublicUpdateRequestV2=$marketingEventPublicUpdateRequestV2, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
