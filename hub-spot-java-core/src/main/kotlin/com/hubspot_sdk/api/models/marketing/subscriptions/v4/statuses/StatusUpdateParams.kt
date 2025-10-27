// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.subscriptions.v4.statuses

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.PartialPublicStatusRequest
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Set the subscription status of a specific contact. */
class StatusUpdateParams
private constructor(
    private val subscriberIdString: String?,
    private val partialPublicStatusRequest: PartialPublicStatusRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun subscriberIdString(): Optional<String> = Optional.ofNullable(subscriberIdString)

    fun partialPublicStatusRequest(): PartialPublicStatusRequest = partialPublicStatusRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        partialPublicStatusRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [StatusUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .partialPublicStatusRequest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StatusUpdateParams]. */
    class Builder internal constructor() {

        private var subscriberIdString: String? = null
        private var partialPublicStatusRequest: PartialPublicStatusRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(statusUpdateParams: StatusUpdateParams) = apply {
            subscriberIdString = statusUpdateParams.subscriberIdString
            partialPublicStatusRequest = statusUpdateParams.partialPublicStatusRequest
            additionalHeaders = statusUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = statusUpdateParams.additionalQueryParams.toBuilder()
        }

        fun subscriberIdString(subscriberIdString: String?) = apply {
            this.subscriberIdString = subscriberIdString
        }

        /**
         * Alias for calling [Builder.subscriberIdString] with `subscriberIdString.orElse(null)`.
         */
        fun subscriberIdString(subscriberIdString: Optional<String>) =
            subscriberIdString(subscriberIdString.getOrNull())

        fun partialPublicStatusRequest(partialPublicStatusRequest: PartialPublicStatusRequest) =
            apply {
                this.partialPublicStatusRequest = partialPublicStatusRequest
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
         * Returns an immutable instance of [StatusUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .partialPublicStatusRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): StatusUpdateParams =
            StatusUpdateParams(
                subscriberIdString,
                checkRequired("partialPublicStatusRequest", partialPublicStatusRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): PartialPublicStatusRequest = partialPublicStatusRequest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> subscriberIdString ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StatusUpdateParams &&
            subscriberIdString == other.subscriberIdString &&
            partialPublicStatusRequest == other.partialPublicStatusRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            subscriberIdString,
            partialPublicStatusRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "StatusUpdateParams{subscriberIdString=$subscriberIdString, partialPublicStatusRequest=$partialPublicStatusRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
