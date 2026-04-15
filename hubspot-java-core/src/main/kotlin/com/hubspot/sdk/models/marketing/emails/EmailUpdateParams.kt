// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.emails

import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.Params
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.http.Headers
import com.hubspot.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Change properties of a marketing email. */
class EmailUpdateParams
private constructor(
    private val emailId: String?,
    private val queryArchived: Boolean?,
    private val emailUpdateRequest: EmailUpdateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun emailId(): Optional<String> = Optional.ofNullable(emailId)

    /** Whether to return only results that have been archived. */
    fun queryArchived(): Optional<Boolean> = Optional.ofNullable(queryArchived)

    fun emailUpdateRequest(): EmailUpdateRequest = emailUpdateRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        emailUpdateRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EmailUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .emailUpdateRequest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailUpdateParams]. */
    class Builder internal constructor() {

        private var emailId: String? = null
        private var queryArchived: Boolean? = null
        private var emailUpdateRequest: EmailUpdateRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(emailUpdateParams: EmailUpdateParams) = apply {
            emailId = emailUpdateParams.emailId
            queryArchived = emailUpdateParams.queryArchived
            emailUpdateRequest = emailUpdateParams.emailUpdateRequest
            additionalHeaders = emailUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = emailUpdateParams.additionalQueryParams.toBuilder()
        }

        fun emailId(emailId: String?) = apply { this.emailId = emailId }

        /** Alias for calling [Builder.emailId] with `emailId.orElse(null)`. */
        fun emailId(emailId: Optional<String>) = emailId(emailId.getOrNull())

        /** Whether to return only results that have been archived. */
        fun queryArchived(queryArchived: Boolean?) = apply { this.queryArchived = queryArchived }

        /**
         * Alias for [Builder.queryArchived].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun queryArchived(queryArchived: Boolean) = queryArchived(queryArchived as Boolean?)

        /** Alias for calling [Builder.queryArchived] with `queryArchived.orElse(null)`. */
        fun queryArchived(queryArchived: Optional<Boolean>) =
            queryArchived(queryArchived.getOrNull())

        fun emailUpdateRequest(emailUpdateRequest: EmailUpdateRequest) = apply {
            this.emailUpdateRequest = emailUpdateRequest
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
         * Returns an immutable instance of [EmailUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .emailUpdateRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EmailUpdateParams =
            EmailUpdateParams(
                emailId,
                queryArchived,
                checkRequired("emailUpdateRequest", emailUpdateRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): EmailUpdateRequest = emailUpdateRequest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> emailId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                queryArchived?.let { put("archived", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailUpdateParams &&
            emailId == other.emailId &&
            queryArchived == other.queryArchived &&
            emailUpdateRequest == other.emailUpdateRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            emailId,
            queryArchived,
            emailUpdateRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "EmailUpdateParams{emailId=$emailId, queryArchived=$queryArchived, emailUpdateRequest=$emailUpdateRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
