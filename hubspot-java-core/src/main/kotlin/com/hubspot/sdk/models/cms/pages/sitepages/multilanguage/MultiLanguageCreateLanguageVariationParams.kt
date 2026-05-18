// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.pages.sitepages.multilanguage

import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.Params
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.http.Headers
import com.hubspot.sdk.core.http.QueryParams
import com.hubspot.sdk.models.cms.pages.ContentLanguageCloneRequestVNext
import java.util.Objects

/**
 * Create a new language variation from an existing website page. The variation will be a copy of
 * the draft state of the source page. To preview the content, you can
 * [retrieve the draft of the source website page](/api-reference/latest/cms/pages/website-pages/drafts/get-website-page-draft).
 */
class MultiLanguageCreateLanguageVariationParams
private constructor(
    private val contentLanguageCloneRequestVNext: ContentLanguageCloneRequestVNext,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun contentLanguageCloneRequestVNext(): ContentLanguageCloneRequestVNext =
        contentLanguageCloneRequestVNext

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        contentLanguageCloneRequestVNext._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [MultiLanguageCreateLanguageVariationParams].
         *
         * The following fields are required:
         * ```java
         * .contentLanguageCloneRequestVNext()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MultiLanguageCreateLanguageVariationParams]. */
    class Builder internal constructor() {

        private var contentLanguageCloneRequestVNext: ContentLanguageCloneRequestVNext? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            multiLanguageCreateLanguageVariationParams: MultiLanguageCreateLanguageVariationParams
        ) = apply {
            contentLanguageCloneRequestVNext =
                multiLanguageCreateLanguageVariationParams.contentLanguageCloneRequestVNext
            additionalHeaders =
                multiLanguageCreateLanguageVariationParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                multiLanguageCreateLanguageVariationParams.additionalQueryParams.toBuilder()
        }

        fun contentLanguageCloneRequestVNext(
            contentLanguageCloneRequestVNext: ContentLanguageCloneRequestVNext
        ) = apply { this.contentLanguageCloneRequestVNext = contentLanguageCloneRequestVNext }

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
         * Returns an immutable instance of [MultiLanguageCreateLanguageVariationParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .contentLanguageCloneRequestVNext()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MultiLanguageCreateLanguageVariationParams =
            MultiLanguageCreateLanguageVariationParams(
                checkRequired("contentLanguageCloneRequestVNext", contentLanguageCloneRequestVNext),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): ContentLanguageCloneRequestVNext = contentLanguageCloneRequestVNext

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MultiLanguageCreateLanguageVariationParams &&
            contentLanguageCloneRequestVNext == other.contentLanguageCloneRequestVNext &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(contentLanguageCloneRequestVNext, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "MultiLanguageCreateLanguageVariationParams{contentLanguageCloneRequestVNext=$contentLanguageCloneRequestVNext, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
