// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associationsschema.limits

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.models.crm.associationsschema.BatchInputPublicAssociationSpec
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Batch delete limits that have been defined for association types between two object types. */
class LimitBatchDeleteParams
private constructor(
    private val fromObjectType: String,
    private val toObjectType: String?,
    private val batchInputPublicAssociationSpec: BatchInputPublicAssociationSpec,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun fromObjectType(): String = fromObjectType

    fun toObjectType(): Optional<String> = Optional.ofNullable(toObjectType)

    fun batchInputPublicAssociationSpec(): BatchInputPublicAssociationSpec =
        batchInputPublicAssociationSpec

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        batchInputPublicAssociationSpec._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LimitBatchDeleteParams].
         *
         * The following fields are required:
         * ```java
         * .fromObjectType()
         * .batchInputPublicAssociationSpec()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LimitBatchDeleteParams]. */
    class Builder internal constructor() {

        private var fromObjectType: String? = null
        private var toObjectType: String? = null
        private var batchInputPublicAssociationSpec: BatchInputPublicAssociationSpec? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(limitBatchDeleteParams: LimitBatchDeleteParams) = apply {
            fromObjectType = limitBatchDeleteParams.fromObjectType
            toObjectType = limitBatchDeleteParams.toObjectType
            batchInputPublicAssociationSpec = limitBatchDeleteParams.batchInputPublicAssociationSpec
            additionalHeaders = limitBatchDeleteParams.additionalHeaders.toBuilder()
            additionalQueryParams = limitBatchDeleteParams.additionalQueryParams.toBuilder()
        }

        fun fromObjectType(fromObjectType: String) = apply { this.fromObjectType = fromObjectType }

        fun toObjectType(toObjectType: String?) = apply { this.toObjectType = toObjectType }

        /** Alias for calling [Builder.toObjectType] with `toObjectType.orElse(null)`. */
        fun toObjectType(toObjectType: Optional<String>) = toObjectType(toObjectType.getOrNull())

        fun batchInputPublicAssociationSpec(
            batchInputPublicAssociationSpec: BatchInputPublicAssociationSpec
        ) = apply { this.batchInputPublicAssociationSpec = batchInputPublicAssociationSpec }

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
         * Returns an immutable instance of [LimitBatchDeleteParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .fromObjectType()
         * .batchInputPublicAssociationSpec()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LimitBatchDeleteParams =
            LimitBatchDeleteParams(
                checkRequired("fromObjectType", fromObjectType),
                toObjectType,
                checkRequired("batchInputPublicAssociationSpec", batchInputPublicAssociationSpec),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): BatchInputPublicAssociationSpec = batchInputPublicAssociationSpec

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

        return other is LimitBatchDeleteParams &&
            fromObjectType == other.fromObjectType &&
            toObjectType == other.toObjectType &&
            batchInputPublicAssociationSpec == other.batchInputPublicAssociationSpec &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            fromObjectType,
            toObjectType,
            batchInputPublicAssociationSpec,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "LimitBatchDeleteParams{fromObjectType=$fromObjectType, toObjectType=$toObjectType, batchInputPublicAssociationSpec=$batchInputPublicAssociationSpec, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
