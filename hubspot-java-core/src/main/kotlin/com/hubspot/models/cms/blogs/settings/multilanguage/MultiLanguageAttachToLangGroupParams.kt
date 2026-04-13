// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.blogs.settings.multilanguage

import com.hubspot.core.JsonValue
import com.hubspot.core.Params
import com.hubspot.core.checkRequired
import com.hubspot.core.http.Headers
import com.hubspot.core.http.QueryParams
import com.hubspot.models.cms.AttachToLangPrimaryRequestVNext
import java.util.Objects

/** Attach a blog to a multi-language group. */
class MultiLanguageAttachToLangGroupParams
private constructor(
    private val attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun attachToLangPrimaryRequestVNext(): AttachToLangPrimaryRequestVNext =
        attachToLangPrimaryRequestVNext

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        attachToLangPrimaryRequestVNext._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [MultiLanguageAttachToLangGroupParams].
         *
         * The following fields are required:
         * ```java
         * .attachToLangPrimaryRequestVNext()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MultiLanguageAttachToLangGroupParams]. */
    class Builder internal constructor() {

        private var attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            multiLanguageAttachToLangGroupParams: MultiLanguageAttachToLangGroupParams
        ) = apply {
            attachToLangPrimaryRequestVNext =
                multiLanguageAttachToLangGroupParams.attachToLangPrimaryRequestVNext
            additionalHeaders = multiLanguageAttachToLangGroupParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                multiLanguageAttachToLangGroupParams.additionalQueryParams.toBuilder()
        }

        fun attachToLangPrimaryRequestVNext(
            attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext
        ) = apply { this.attachToLangPrimaryRequestVNext = attachToLangPrimaryRequestVNext }

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
         * Returns an immutable instance of [MultiLanguageAttachToLangGroupParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .attachToLangPrimaryRequestVNext()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MultiLanguageAttachToLangGroupParams =
            MultiLanguageAttachToLangGroupParams(
                checkRequired("attachToLangPrimaryRequestVNext", attachToLangPrimaryRequestVNext),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): AttachToLangPrimaryRequestVNext = attachToLangPrimaryRequestVNext

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MultiLanguageAttachToLangGroupParams &&
            attachToLangPrimaryRequestVNext == other.attachToLangPrimaryRequestVNext &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(attachToLangPrimaryRequestVNext, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "MultiLanguageAttachToLangGroupParams{attachToLangPrimaryRequestVNext=$attachToLangPrimaryRequestVNext, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
