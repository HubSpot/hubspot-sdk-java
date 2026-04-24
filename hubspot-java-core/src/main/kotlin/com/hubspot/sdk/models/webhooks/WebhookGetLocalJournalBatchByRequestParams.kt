// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.webhooks

import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.Params
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.http.Headers
import com.hubspot.sdk.core.http.QueryParams
import com.hubspot.sdk.models.BatchInputString
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Perform a batch read operation on the webhooks journal. This endpoint allows you to read multiple
 * entries from the journal in a single request. It requires a JSON request body specifying the
 * inputs to be read. The response includes the results of the batch read operation, and may return
 * multiple statuses if there are errors.
 */
class WebhookGetLocalJournalBatchByRequestParams
private constructor(
    private val installPortalId: Int?,
    private val batchInputString: BatchInputString,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The ID of the portal where the webhooks are installed. This parameter is optional and is used
     * to specify the target portal.
     */
    fun installPortalId(): Optional<Int> = Optional.ofNullable(installPortalId)

    fun batchInputString(): BatchInputString = batchInputString

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        batchInputString._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [WebhookGetLocalJournalBatchByRequestParams].
         *
         * The following fields are required:
         * ```java
         * .batchInputString()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WebhookGetLocalJournalBatchByRequestParams]. */
    class Builder internal constructor() {

        private var installPortalId: Int? = null
        private var batchInputString: BatchInputString? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            webhookGetLocalJournalBatchByRequestParams: WebhookGetLocalJournalBatchByRequestParams
        ) = apply {
            installPortalId = webhookGetLocalJournalBatchByRequestParams.installPortalId
            batchInputString = webhookGetLocalJournalBatchByRequestParams.batchInputString
            additionalHeaders =
                webhookGetLocalJournalBatchByRequestParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                webhookGetLocalJournalBatchByRequestParams.additionalQueryParams.toBuilder()
        }

        /**
         * The ID of the portal where the webhooks are installed. This parameter is optional and is
         * used to specify the target portal.
         */
        fun installPortalId(installPortalId: Int?) = apply {
            this.installPortalId = installPortalId
        }

        /**
         * Alias for [Builder.installPortalId].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun installPortalId(installPortalId: Int) = installPortalId(installPortalId as Int?)

        /** Alias for calling [Builder.installPortalId] with `installPortalId.orElse(null)`. */
        fun installPortalId(installPortalId: Optional<Int>) =
            installPortalId(installPortalId.getOrNull())

        fun batchInputString(batchInputString: BatchInputString) = apply {
            this.batchInputString = batchInputString
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
         * Returns an immutable instance of [WebhookGetLocalJournalBatchByRequestParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .batchInputString()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WebhookGetLocalJournalBatchByRequestParams =
            WebhookGetLocalJournalBatchByRequestParams(
                installPortalId,
                checkRequired("batchInputString", batchInputString),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): BatchInputString = batchInputString

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                installPortalId?.let { put("installPortalId", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WebhookGetLocalJournalBatchByRequestParams &&
            installPortalId == other.installPortalId &&
            batchInputString == other.batchInputString &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(installPortalId, batchInputString, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "WebhookGetLocalJournalBatchByRequestParams{installPortalId=$installPortalId, batchInputString=$batchInputString, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
