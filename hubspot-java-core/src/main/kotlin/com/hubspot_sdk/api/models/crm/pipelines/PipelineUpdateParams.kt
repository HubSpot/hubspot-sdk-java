// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.pipelines

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PipelineUpdateParams
private constructor(
    private val objectType: String,
    private val pipelineId: String,
    private val stageId: String?,
    private val pipelineStagePatchInput: PipelineStagePatchInput,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun objectType(): String = objectType

    fun pipelineId(): String = pipelineId

    fun stageId(): Optional<String> = Optional.ofNullable(stageId)

    fun pipelineStagePatchInput(): PipelineStagePatchInput = pipelineStagePatchInput

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        pipelineStagePatchInput._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PipelineUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .objectType()
         * .pipelineId()
         * .pipelineStagePatchInput()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PipelineUpdateParams]. */
    class Builder internal constructor() {

        private var objectType: String? = null
        private var pipelineId: String? = null
        private var stageId: String? = null
        private var pipelineStagePatchInput: PipelineStagePatchInput? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(pipelineUpdateParams: PipelineUpdateParams) = apply {
            objectType = pipelineUpdateParams.objectType
            pipelineId = pipelineUpdateParams.pipelineId
            stageId = pipelineUpdateParams.stageId
            pipelineStagePatchInput = pipelineUpdateParams.pipelineStagePatchInput
            additionalHeaders = pipelineUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = pipelineUpdateParams.additionalQueryParams.toBuilder()
        }

        fun objectType(objectType: String) = apply { this.objectType = objectType }

        fun pipelineId(pipelineId: String) = apply { this.pipelineId = pipelineId }

        fun stageId(stageId: String?) = apply { this.stageId = stageId }

        /** Alias for calling [Builder.stageId] with `stageId.orElse(null)`. */
        fun stageId(stageId: Optional<String>) = stageId(stageId.getOrNull())

        fun pipelineStagePatchInput(pipelineStagePatchInput: PipelineStagePatchInput) = apply {
            this.pipelineStagePatchInput = pipelineStagePatchInput
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
         * Returns an immutable instance of [PipelineUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .objectType()
         * .pipelineId()
         * .pipelineStagePatchInput()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PipelineUpdateParams =
            PipelineUpdateParams(
                checkRequired("objectType", objectType),
                checkRequired("pipelineId", pipelineId),
                stageId,
                checkRequired("pipelineStagePatchInput", pipelineStagePatchInput),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): PipelineStagePatchInput = pipelineStagePatchInput

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> objectType
            1 -> pipelineId
            2 -> stageId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PipelineUpdateParams &&
            objectType == other.objectType &&
            pipelineId == other.pipelineId &&
            stageId == other.stageId &&
            pipelineStagePatchInput == other.pipelineStagePatchInput &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            objectType,
            pipelineId,
            stageId,
            pipelineStagePatchInput,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "PipelineUpdateParams{objectType=$objectType, pipelineId=$pipelineId, stageId=$stageId, pipelineStagePatchInput=$pipelineStagePatchInput, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
