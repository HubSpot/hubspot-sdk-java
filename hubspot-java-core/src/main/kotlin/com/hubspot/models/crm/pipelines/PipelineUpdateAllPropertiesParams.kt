// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.pipelines

import com.hubspot.core.JsonValue
import com.hubspot.core.Params
import com.hubspot.core.checkRequired
import com.hubspot.core.http.Headers
import com.hubspot.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Replace a pipeline */
class PipelineUpdateAllPropertiesParams
private constructor(
    private val objectType: String,
    private val pipelineId: String?,
    private val validateDealStageUsagesBeforeDelete: Boolean?,
    private val validateReferencesBeforeDelete: Boolean?,
    private val pipelineReplaceInput: PipelineReplaceInput,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun objectType(): String = objectType

    fun pipelineId(): Optional<String> = Optional.ofNullable(pipelineId)

    fun validateDealStageUsagesBeforeDelete(): Optional<Boolean> =
        Optional.ofNullable(validateDealStageUsagesBeforeDelete)

    fun validateReferencesBeforeDelete(): Optional<Boolean> =
        Optional.ofNullable(validateReferencesBeforeDelete)

    fun pipelineReplaceInput(): PipelineReplaceInput = pipelineReplaceInput

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        pipelineReplaceInput._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PipelineUpdateAllPropertiesParams].
         *
         * The following fields are required:
         * ```java
         * .objectType()
         * .pipelineReplaceInput()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PipelineUpdateAllPropertiesParams]. */
    class Builder internal constructor() {

        private var objectType: String? = null
        private var pipelineId: String? = null
        private var validateDealStageUsagesBeforeDelete: Boolean? = null
        private var validateReferencesBeforeDelete: Boolean? = null
        private var pipelineReplaceInput: PipelineReplaceInput? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(pipelineUpdateAllPropertiesParams: PipelineUpdateAllPropertiesParams) =
            apply {
                objectType = pipelineUpdateAllPropertiesParams.objectType
                pipelineId = pipelineUpdateAllPropertiesParams.pipelineId
                validateDealStageUsagesBeforeDelete =
                    pipelineUpdateAllPropertiesParams.validateDealStageUsagesBeforeDelete
                validateReferencesBeforeDelete =
                    pipelineUpdateAllPropertiesParams.validateReferencesBeforeDelete
                pipelineReplaceInput = pipelineUpdateAllPropertiesParams.pipelineReplaceInput
                additionalHeaders = pipelineUpdateAllPropertiesParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    pipelineUpdateAllPropertiesParams.additionalQueryParams.toBuilder()
            }

        fun objectType(objectType: String) = apply { this.objectType = objectType }

        fun pipelineId(pipelineId: String?) = apply { this.pipelineId = pipelineId }

        /** Alias for calling [Builder.pipelineId] with `pipelineId.orElse(null)`. */
        fun pipelineId(pipelineId: Optional<String>) = pipelineId(pipelineId.getOrNull())

        fun validateDealStageUsagesBeforeDelete(validateDealStageUsagesBeforeDelete: Boolean?) =
            apply {
                this.validateDealStageUsagesBeforeDelete = validateDealStageUsagesBeforeDelete
            }

        /**
         * Alias for [Builder.validateDealStageUsagesBeforeDelete].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun validateDealStageUsagesBeforeDelete(validateDealStageUsagesBeforeDelete: Boolean) =
            validateDealStageUsagesBeforeDelete(validateDealStageUsagesBeforeDelete as Boolean?)

        /**
         * Alias for calling [Builder.validateDealStageUsagesBeforeDelete] with
         * `validateDealStageUsagesBeforeDelete.orElse(null)`.
         */
        fun validateDealStageUsagesBeforeDelete(
            validateDealStageUsagesBeforeDelete: Optional<Boolean>
        ) = validateDealStageUsagesBeforeDelete(validateDealStageUsagesBeforeDelete.getOrNull())

        fun validateReferencesBeforeDelete(validateReferencesBeforeDelete: Boolean?) = apply {
            this.validateReferencesBeforeDelete = validateReferencesBeforeDelete
        }

        /**
         * Alias for [Builder.validateReferencesBeforeDelete].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun validateReferencesBeforeDelete(validateReferencesBeforeDelete: Boolean) =
            validateReferencesBeforeDelete(validateReferencesBeforeDelete as Boolean?)

        /**
         * Alias for calling [Builder.validateReferencesBeforeDelete] with
         * `validateReferencesBeforeDelete.orElse(null)`.
         */
        fun validateReferencesBeforeDelete(validateReferencesBeforeDelete: Optional<Boolean>) =
            validateReferencesBeforeDelete(validateReferencesBeforeDelete.getOrNull())

        fun pipelineReplaceInput(pipelineReplaceInput: PipelineReplaceInput) = apply {
            this.pipelineReplaceInput = pipelineReplaceInput
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
         * Returns an immutable instance of [PipelineUpdateAllPropertiesParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .objectType()
         * .pipelineReplaceInput()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PipelineUpdateAllPropertiesParams =
            PipelineUpdateAllPropertiesParams(
                checkRequired("objectType", objectType),
                pipelineId,
                validateDealStageUsagesBeforeDelete,
                validateReferencesBeforeDelete,
                checkRequired("pipelineReplaceInput", pipelineReplaceInput),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): PipelineReplaceInput = pipelineReplaceInput

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> objectType
            1 -> pipelineId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                validateDealStageUsagesBeforeDelete?.let {
                    put("validateDealStageUsagesBeforeDelete", it.toString())
                }
                validateReferencesBeforeDelete?.let {
                    put("validateReferencesBeforeDelete", it.toString())
                }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PipelineUpdateAllPropertiesParams &&
            objectType == other.objectType &&
            pipelineId == other.pipelineId &&
            validateDealStageUsagesBeforeDelete == other.validateDealStageUsagesBeforeDelete &&
            validateReferencesBeforeDelete == other.validateReferencesBeforeDelete &&
            pipelineReplaceInput == other.pipelineReplaceInput &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            objectType,
            pipelineId,
            validateDealStageUsagesBeforeDelete,
            validateReferencesBeforeDelete,
            pipelineReplaceInput,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "PipelineUpdateAllPropertiesParams{objectType=$objectType, pipelineId=$pipelineId, validateDealStageUsagesBeforeDelete=$validateDealStageUsagesBeforeDelete, validateReferencesBeforeDelete=$validateReferencesBeforeDelete, pipelineReplaceInput=$pipelineReplaceInput, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
