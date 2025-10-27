// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.settings.currencies

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update an existing conversion rate, specified by its ID. */
class CurrencyUpdateExchangeRateParams
private constructor(
    private val exchangeRateId: String?,
    private val exchangeRateMultiplier: ExchangeRateMultiplier,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun exchangeRateId(): Optional<String> = Optional.ofNullable(exchangeRateId)

    fun exchangeRateMultiplier(): ExchangeRateMultiplier = exchangeRateMultiplier

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        exchangeRateMultiplier._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CurrencyUpdateExchangeRateParams].
         *
         * The following fields are required:
         * ```java
         * .exchangeRateMultiplier()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CurrencyUpdateExchangeRateParams]. */
    class Builder internal constructor() {

        private var exchangeRateId: String? = null
        private var exchangeRateMultiplier: ExchangeRateMultiplier? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(currencyUpdateExchangeRateParams: CurrencyUpdateExchangeRateParams) =
            apply {
                exchangeRateId = currencyUpdateExchangeRateParams.exchangeRateId
                exchangeRateMultiplier = currencyUpdateExchangeRateParams.exchangeRateMultiplier
                additionalHeaders = currencyUpdateExchangeRateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    currencyUpdateExchangeRateParams.additionalQueryParams.toBuilder()
            }

        fun exchangeRateId(exchangeRateId: String?) = apply { this.exchangeRateId = exchangeRateId }

        /** Alias for calling [Builder.exchangeRateId] with `exchangeRateId.orElse(null)`. */
        fun exchangeRateId(exchangeRateId: Optional<String>) =
            exchangeRateId(exchangeRateId.getOrNull())

        fun exchangeRateMultiplier(exchangeRateMultiplier: ExchangeRateMultiplier) = apply {
            this.exchangeRateMultiplier = exchangeRateMultiplier
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
         * Returns an immutable instance of [CurrencyUpdateExchangeRateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .exchangeRateMultiplier()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CurrencyUpdateExchangeRateParams =
            CurrencyUpdateExchangeRateParams(
                exchangeRateId,
                checkRequired("exchangeRateMultiplier", exchangeRateMultiplier),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): ExchangeRateMultiplier = exchangeRateMultiplier

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> exchangeRateId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CurrencyUpdateExchangeRateParams &&
            exchangeRateId == other.exchangeRateId &&
            exchangeRateMultiplier == other.exchangeRateMultiplier &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            exchangeRateId,
            exchangeRateMultiplier,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "CurrencyUpdateExchangeRateParams{exchangeRateId=$exchangeRateId, exchangeRateMultiplier=$exchangeRateMultiplier, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
