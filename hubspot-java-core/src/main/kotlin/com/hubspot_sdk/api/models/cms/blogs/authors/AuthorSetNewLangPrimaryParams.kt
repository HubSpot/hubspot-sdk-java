// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.blogs.authors

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.models.cms.blogs.SetNewLanguagePrimaryRequestVNext
import java.util.Objects

class AuthorSetNewLangPrimaryParams
private constructor(
    private val setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun setNewLanguagePrimaryRequestVNext(): SetNewLanguagePrimaryRequestVNext =
        setNewLanguagePrimaryRequestVNext

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        setNewLanguagePrimaryRequestVNext._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AuthorSetNewLangPrimaryParams].
         *
         * The following fields are required:
         * ```java
         * .setNewLanguagePrimaryRequestVNext()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AuthorSetNewLangPrimaryParams]. */
    class Builder internal constructor() {

        private var setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(authorSetNewLangPrimaryParams: AuthorSetNewLangPrimaryParams) = apply {
            setNewLanguagePrimaryRequestVNext =
                authorSetNewLangPrimaryParams.setNewLanguagePrimaryRequestVNext
            additionalHeaders = authorSetNewLangPrimaryParams.additionalHeaders.toBuilder()
            additionalQueryParams = authorSetNewLangPrimaryParams.additionalQueryParams.toBuilder()
        }

        fun setNewLanguagePrimaryRequestVNext(
            setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext
        ) = apply { this.setNewLanguagePrimaryRequestVNext = setNewLanguagePrimaryRequestVNext }

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
         * Returns an immutable instance of [AuthorSetNewLangPrimaryParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .setNewLanguagePrimaryRequestVNext()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AuthorSetNewLangPrimaryParams =
            AuthorSetNewLangPrimaryParams(
                checkRequired(
                    "setNewLanguagePrimaryRequestVNext",
                    setNewLanguagePrimaryRequestVNext,
                ),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): SetNewLanguagePrimaryRequestVNext = setNewLanguagePrimaryRequestVNext

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuthorSetNewLangPrimaryParams &&
            setNewLanguagePrimaryRequestVNext == other.setNewLanguagePrimaryRequestVNext &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(setNewLanguagePrimaryRequestVNext, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AuthorSetNewLangPrimaryParams{setNewLanguagePrimaryRequestVNext=$setNewLanguagePrimaryRequestVNext, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
