// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.transactional.smtptokens

import com.hubspot.core.JsonValue
import com.hubspot.core.Params
import com.hubspot.core.checkRequired
import com.hubspot.core.http.Headers
import com.hubspot.core.http.QueryParams
import com.hubspot.models.marketing.transactional.SmtpApiTokenRequestEgg
import java.util.Objects

/** Create a SMTP API token. */
class SmtpTokenCreateParams
private constructor(
    private val smtpApiTokenRequestEgg: SmtpApiTokenRequestEgg,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun smtpApiTokenRequestEgg(): SmtpApiTokenRequestEgg = smtpApiTokenRequestEgg

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        smtpApiTokenRequestEgg._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SmtpTokenCreateParams].
         *
         * The following fields are required:
         * ```java
         * .smtpApiTokenRequestEgg()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SmtpTokenCreateParams]. */
    class Builder internal constructor() {

        private var smtpApiTokenRequestEgg: SmtpApiTokenRequestEgg? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(smtpTokenCreateParams: SmtpTokenCreateParams) = apply {
            smtpApiTokenRequestEgg = smtpTokenCreateParams.smtpApiTokenRequestEgg
            additionalHeaders = smtpTokenCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = smtpTokenCreateParams.additionalQueryParams.toBuilder()
        }

        fun smtpApiTokenRequestEgg(smtpApiTokenRequestEgg: SmtpApiTokenRequestEgg) = apply {
            this.smtpApiTokenRequestEgg = smtpApiTokenRequestEgg
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
         * Returns an immutable instance of [SmtpTokenCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .smtpApiTokenRequestEgg()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SmtpTokenCreateParams =
            SmtpTokenCreateParams(
                checkRequired("smtpApiTokenRequestEgg", smtpApiTokenRequestEgg),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): SmtpApiTokenRequestEgg = smtpApiTokenRequestEgg

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SmtpTokenCreateParams &&
            smtpApiTokenRequestEgg == other.smtpApiTokenRequestEgg &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(smtpApiTokenRequestEgg, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SmtpTokenCreateParams{smtpApiTokenRequestEgg=$smtpApiTokenRequestEgg, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
