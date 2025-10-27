// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update a workflow by ID. */
class WorkflowUpdateParams
private constructor(
    private val flowId: String?,
    private val apiFlowPutRequest: ApiFlowPutRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun flowId(): Optional<String> = Optional.ofNullable(flowId)

    fun apiFlowPutRequest(): ApiFlowPutRequest = apiFlowPutRequest

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WorkflowUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .apiFlowPutRequest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WorkflowUpdateParams]. */
    class Builder internal constructor() {

        private var flowId: String? = null
        private var apiFlowPutRequest: ApiFlowPutRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(workflowUpdateParams: WorkflowUpdateParams) = apply {
            flowId = workflowUpdateParams.flowId
            apiFlowPutRequest = workflowUpdateParams.apiFlowPutRequest
            additionalHeaders = workflowUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = workflowUpdateParams.additionalQueryParams.toBuilder()
        }

        fun flowId(flowId: String?) = apply { this.flowId = flowId }

        /** Alias for calling [Builder.flowId] with `flowId.orElse(null)`. */
        fun flowId(flowId: Optional<String>) = flowId(flowId.getOrNull())

        fun apiFlowPutRequest(apiFlowPutRequest: ApiFlowPutRequest) = apply {
            this.apiFlowPutRequest = apiFlowPutRequest
        }

        /** Alias for calling [apiFlowPutRequest] with `ApiFlowPutRequest.ofContact(contact)`. */
        fun apiFlowPutRequest(contact: ApiContactFlowPutRequest) =
            apiFlowPutRequest(ApiFlowPutRequest.ofContact(contact))

        /** Alias for calling [apiFlowPutRequest] with `ApiFlowPutRequest.ofPlatform(platform)`. */
        fun apiFlowPutRequest(platform: ApiPlatformFlowPutRequest) =
            apiFlowPutRequest(ApiFlowPutRequest.ofPlatform(platform))

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
         * Returns an immutable instance of [WorkflowUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .apiFlowPutRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WorkflowUpdateParams =
            WorkflowUpdateParams(
                flowId,
                checkRequired("apiFlowPutRequest", apiFlowPutRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): ApiFlowPutRequest = apiFlowPutRequest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> flowId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WorkflowUpdateParams &&
            flowId == other.flowId &&
            apiFlowPutRequest == other.apiFlowPutRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(flowId, apiFlowPutRequest, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "WorkflowUpdateParams{flowId=$flowId, apiFlowPutRequest=$apiFlowPutRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
