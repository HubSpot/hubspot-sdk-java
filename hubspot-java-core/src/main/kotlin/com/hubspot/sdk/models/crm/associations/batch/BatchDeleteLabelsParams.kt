// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.associations.batch

import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.Params
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.http.Headers
import com.hubspot.sdk.core.http.QueryParams
import com.hubspot.sdk.models.crm.BatchInputPublicAssociationMultiPost
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Batch delete specific association labels for objects. Deleting an unlabeled association will also
 * delete all labeled associations between those two objects
 */
class BatchDeleteLabelsParams
private constructor(
    private val fromObjectType: String,
    private val toObjectType: String?,
    private val batchInputPublicAssociationMultiPost: BatchInputPublicAssociationMultiPost,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun fromObjectType(): String = fromObjectType

    fun toObjectType(): Optional<String> = Optional.ofNullable(toObjectType)

    fun batchInputPublicAssociationMultiPost(): BatchInputPublicAssociationMultiPost =
        batchInputPublicAssociationMultiPost

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        batchInputPublicAssociationMultiPost._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BatchDeleteLabelsParams].
         *
         * The following fields are required:
         * ```java
         * .fromObjectType()
         * .batchInputPublicAssociationMultiPost()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BatchDeleteLabelsParams]. */
    class Builder internal constructor() {

        private var fromObjectType: String? = null
        private var toObjectType: String? = null
        private var batchInputPublicAssociationMultiPost: BatchInputPublicAssociationMultiPost? =
            null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(batchDeleteLabelsParams: BatchDeleteLabelsParams) = apply {
            fromObjectType = batchDeleteLabelsParams.fromObjectType
            toObjectType = batchDeleteLabelsParams.toObjectType
            batchInputPublicAssociationMultiPost =
                batchDeleteLabelsParams.batchInputPublicAssociationMultiPost
            additionalHeaders = batchDeleteLabelsParams.additionalHeaders.toBuilder()
            additionalQueryParams = batchDeleteLabelsParams.additionalQueryParams.toBuilder()
        }

        fun fromObjectType(fromObjectType: String) = apply { this.fromObjectType = fromObjectType }

        fun toObjectType(toObjectType: String?) = apply { this.toObjectType = toObjectType }

        /** Alias for calling [Builder.toObjectType] with `toObjectType.orElse(null)`. */
        fun toObjectType(toObjectType: Optional<String>) = toObjectType(toObjectType.getOrNull())

        fun batchInputPublicAssociationMultiPost(
            batchInputPublicAssociationMultiPost: BatchInputPublicAssociationMultiPost
        ) = apply {
            this.batchInputPublicAssociationMultiPost = batchInputPublicAssociationMultiPost
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
         * Returns an immutable instance of [BatchDeleteLabelsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .fromObjectType()
         * .batchInputPublicAssociationMultiPost()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BatchDeleteLabelsParams =
            BatchDeleteLabelsParams(
                checkRequired("fromObjectType", fromObjectType),
                toObjectType,
                checkRequired(
                    "batchInputPublicAssociationMultiPost",
                    batchInputPublicAssociationMultiPost,
                ),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): BatchInputPublicAssociationMultiPost = batchInputPublicAssociationMultiPost

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> fromObjectType
            1 -> toObjectType ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BatchDeleteLabelsParams &&
            fromObjectType == other.fromObjectType &&
            toObjectType == other.toObjectType &&
            batchInputPublicAssociationMultiPost == other.batchInputPublicAssociationMultiPost &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            fromObjectType,
            toObjectType,
            batchInputPublicAssociationMultiPost,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "BatchDeleteLabelsParams{fromObjectType=$fromObjectType, toObjectType=$toObjectType, batchInputPublicAssociationMultiPost=$batchInputPublicAssociationMultiPost, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
