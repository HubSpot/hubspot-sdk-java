// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.appwebhooks

import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AppWebhookGetSubscriptionParams
private constructor(
    private val appId: Int,
    private val subscriptionId: Int?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun appId(): Int = appId

    fun subscriptionId(): Optional<Int> = Optional.ofNullable(subscriptionId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AppWebhookGetSubscriptionParams].
         *
         * The following fields are required:
         * ```java
         * .appId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AppWebhookGetSubscriptionParams]. */
    class Builder internal constructor() {

        private var appId: Int? = null
        private var subscriptionId: Int? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(appWebhookGetSubscriptionParams: AppWebhookGetSubscriptionParams) =
            apply {
                appId = appWebhookGetSubscriptionParams.appId
                subscriptionId = appWebhookGetSubscriptionParams.subscriptionId
                additionalHeaders = appWebhookGetSubscriptionParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    appWebhookGetSubscriptionParams.additionalQueryParams.toBuilder()
            }

        fun appId(appId: Int) = apply { this.appId = appId }

        fun subscriptionId(subscriptionId: Int?) = apply { this.subscriptionId = subscriptionId }

        /**
         * Alias for [Builder.subscriptionId].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun subscriptionId(subscriptionId: Int) = subscriptionId(subscriptionId as Int?)

        /** Alias for calling [Builder.subscriptionId] with `subscriptionId.orElse(null)`. */
        fun subscriptionId(subscriptionId: Optional<Int>) =
            subscriptionId(subscriptionId.getOrNull())

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
         * Returns an immutable instance of [AppWebhookGetSubscriptionParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .appId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AppWebhookGetSubscriptionParams =
            AppWebhookGetSubscriptionParams(
                checkRequired("appId", appId),
                subscriptionId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> appId.toString()
            1 -> subscriptionId?.toString() ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AppWebhookGetSubscriptionParams &&
            appId == other.appId &&
            subscriptionId == other.subscriptionId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(appId, subscriptionId, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AppWebhookGetSubscriptionParams{appId=$appId, subscriptionId=$subscriptionId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
