// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.associations.batch

import com.hubspot.core.JsonValue
import com.hubspot.core.Params
import com.hubspot.core.checkRequired
import com.hubspot.core.http.Headers
import com.hubspot.core.http.QueryParams
import com.hubspot.models.crm.associations.BatchInputPublicAssociationMultiArchive
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Batch delete associations for objects */
class BatchDeleteParams
private constructor(
    private val fromObjectType: String,
    private val toObjectType: String?,
    private val batchInputPublicAssociationMultiArchive: BatchInputPublicAssociationMultiArchive,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun fromObjectType(): String = fromObjectType

    fun toObjectType(): Optional<String> = Optional.ofNullable(toObjectType)

    fun batchInputPublicAssociationMultiArchive(): BatchInputPublicAssociationMultiArchive =
        batchInputPublicAssociationMultiArchive

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        batchInputPublicAssociationMultiArchive._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BatchDeleteParams].
         *
         * The following fields are required:
         * ```java
         * .fromObjectType()
         * .batchInputPublicAssociationMultiArchive()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BatchDeleteParams]. */
    class Builder internal constructor() {

        private var fromObjectType: String? = null
        private var toObjectType: String? = null
        private var batchInputPublicAssociationMultiArchive:
            BatchInputPublicAssociationMultiArchive? =
            null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(batchDeleteParams: BatchDeleteParams) = apply {
            fromObjectType = batchDeleteParams.fromObjectType
            toObjectType = batchDeleteParams.toObjectType
            batchInputPublicAssociationMultiArchive =
                batchDeleteParams.batchInputPublicAssociationMultiArchive
            additionalHeaders = batchDeleteParams.additionalHeaders.toBuilder()
            additionalQueryParams = batchDeleteParams.additionalQueryParams.toBuilder()
        }

        fun fromObjectType(fromObjectType: String) = apply { this.fromObjectType = fromObjectType }

        fun toObjectType(toObjectType: String?) = apply { this.toObjectType = toObjectType }

        /** Alias for calling [Builder.toObjectType] with `toObjectType.orElse(null)`. */
        fun toObjectType(toObjectType: Optional<String>) = toObjectType(toObjectType.getOrNull())

        fun batchInputPublicAssociationMultiArchive(
            batchInputPublicAssociationMultiArchive: BatchInputPublicAssociationMultiArchive
        ) = apply {
            this.batchInputPublicAssociationMultiArchive = batchInputPublicAssociationMultiArchive
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
         * Returns an immutable instance of [BatchDeleteParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .fromObjectType()
         * .batchInputPublicAssociationMultiArchive()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BatchDeleteParams =
            BatchDeleteParams(
                checkRequired("fromObjectType", fromObjectType),
                toObjectType,
                checkRequired(
                    "batchInputPublicAssociationMultiArchive",
                    batchInputPublicAssociationMultiArchive,
                ),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): BatchInputPublicAssociationMultiArchive = batchInputPublicAssociationMultiArchive

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

        return other is BatchDeleteParams &&
            fromObjectType == other.fromObjectType &&
            toObjectType == other.toObjectType &&
            batchInputPublicAssociationMultiArchive ==
                other.batchInputPublicAssociationMultiArchive &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            fromObjectType,
            toObjectType,
            batchInputPublicAssociationMultiArchive,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "BatchDeleteParams{fromObjectType=$fromObjectType, toObjectType=$toObjectType, batchInputPublicAssociationMultiArchive=$batchInputPublicAssociationMultiArchive, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
