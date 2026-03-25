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

class PipelineReplaceParams
private constructor(
    private val objectType: String,
    private val pipelineId: String,
    private val stageId: String?,
    private val pipelineStageReplaceInput: PipelineStageReplaceInput,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun objectType(): String = objectType

    fun pipelineId(): String = pipelineId

    fun stageId(): Optional<String> = Optional.ofNullable(stageId)

    fun pipelineStageReplaceInput(): PipelineStageReplaceInput = pipelineStageReplaceInput

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        pipelineStageReplaceInput._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PipelineReplaceParams].
         *
         * The following fields are required:
         * ```java
         * .objectType()
         * .pipelineId()
         * .pipelineStageReplaceInput()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PipelineReplaceParams]. */
    class Builder internal constructor() {

        private var objectType: String? = null
        private var pipelineId: String? = null
        private var stageId: String? = null
        private var pipelineStageReplaceInput: PipelineStageReplaceInput? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(pipelineReplaceParams: PipelineReplaceParams) = apply {
            objectType = pipelineReplaceParams.objectType
            pipelineId = pipelineReplaceParams.pipelineId
            stageId = pipelineReplaceParams.stageId
            pipelineStageReplaceInput = pipelineReplaceParams.pipelineStageReplaceInput
            additionalHeaders = pipelineReplaceParams.additionalHeaders.toBuilder()
            additionalQueryParams = pipelineReplaceParams.additionalQueryParams.toBuilder()
        }

        fun objectType(objectType: String) = apply { this.objectType = objectType }

        fun pipelineId(pipelineId: String) = apply { this.pipelineId = pipelineId }

        fun stageId(stageId: String?) = apply { this.stageId = stageId }

        /** Alias for calling [Builder.stageId] with `stageId.orElse(null)`. */
        fun stageId(stageId: Optional<String>) = stageId(stageId.getOrNull())

        fun pipelineStageReplaceInput(pipelineStageReplaceInput: PipelineStageReplaceInput) =
            apply {
                this.pipelineStageReplaceInput = pipelineStageReplaceInput
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
         * Returns an immutable instance of [PipelineReplaceParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .objectType()
         * .pipelineId()
         * .pipelineStageReplaceInput()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PipelineReplaceParams =
            PipelineReplaceParams(
                checkRequired("objectType", objectType),
                checkRequired("pipelineId", pipelineId),
                stageId,
                checkRequired("pipelineStageReplaceInput", pipelineStageReplaceInput),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): PipelineStageReplaceInput = pipelineStageReplaceInput

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

        return other is PipelineReplaceParams &&
            objectType == other.objectType &&
            pipelineId == other.pipelineId &&
            stageId == other.stageId &&
            pipelineStageReplaceInput == other.pipelineStageReplaceInput &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            objectType,
            pipelineId,
            stageId,
            pipelineStageReplaceInput,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "PipelineReplaceParams{objectType=$objectType, pipelineId=$pipelineId, stageId=$stageId, pipelineStageReplaceInput=$pipelineStageReplaceInput, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
