// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.properties.batch

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.models.BatchInputPropertyName
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Delete multiple properties in a single request. This method will return a 204 No Content response
 * on success regardless of the initial state of the property (e.g. active, already archived,
 * non-existent).
 */
class BatchDeleteParams
private constructor(
    private val objectType: String?,
    private val batchInputPropertyName: BatchInputPropertyName,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun objectType(): Optional<String> = Optional.ofNullable(objectType)

    fun batchInputPropertyName(): BatchInputPropertyName = batchInputPropertyName

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        batchInputPropertyName._additionalProperties()

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
         * .batchInputPropertyName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BatchDeleteParams]. */
    class Builder internal constructor() {

        private var objectType: String? = null
        private var batchInputPropertyName: BatchInputPropertyName? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(batchDeleteParams: BatchDeleteParams) = apply {
            objectType = batchDeleteParams.objectType
            batchInputPropertyName = batchDeleteParams.batchInputPropertyName
            additionalHeaders = batchDeleteParams.additionalHeaders.toBuilder()
            additionalQueryParams = batchDeleteParams.additionalQueryParams.toBuilder()
        }

        fun objectType(objectType: String?) = apply { this.objectType = objectType }

        /** Alias for calling [Builder.objectType] with `objectType.orElse(null)`. */
        fun objectType(objectType: Optional<String>) = objectType(objectType.getOrNull())

        fun batchInputPropertyName(batchInputPropertyName: BatchInputPropertyName) = apply {
            this.batchInputPropertyName = batchInputPropertyName
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
         * .batchInputPropertyName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BatchDeleteParams =
            BatchDeleteParams(
                objectType,
                checkRequired("batchInputPropertyName", batchInputPropertyName),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): BatchInputPropertyName = batchInputPropertyName

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> objectType ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BatchDeleteParams &&
            objectType == other.objectType &&
            batchInputPropertyName == other.batchInputPropertyName &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(objectType, batchInputPropertyName, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "BatchDeleteParams{objectType=$objectType, batchInputPropertyName=$batchInputPropertyName, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
