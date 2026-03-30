// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge.batch

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.models.BatchReadInputPropertyName
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get the details for a batch of properties for a specified object type. */
class BatchGetParams
private constructor(
    private val appId: Int,
    private val objectType: String?,
    private val batchReadInputPropertyName: BatchReadInputPropertyName,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun appId(): Int = appId

    fun objectType(): Optional<String> = Optional.ofNullable(objectType)

    fun batchReadInputPropertyName(): BatchReadInputPropertyName = batchReadInputPropertyName

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        batchReadInputPropertyName._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BatchGetParams].
         *
         * The following fields are required:
         * ```java
         * .appId()
         * .batchReadInputPropertyName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BatchGetParams]. */
    class Builder internal constructor() {

        private var appId: Int? = null
        private var objectType: String? = null
        private var batchReadInputPropertyName: BatchReadInputPropertyName? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(batchGetParams: BatchGetParams) = apply {
            appId = batchGetParams.appId
            objectType = batchGetParams.objectType
            batchReadInputPropertyName = batchGetParams.batchReadInputPropertyName
            additionalHeaders = batchGetParams.additionalHeaders.toBuilder()
            additionalQueryParams = batchGetParams.additionalQueryParams.toBuilder()
        }

        fun appId(appId: Int) = apply { this.appId = appId }

        fun objectType(objectType: String?) = apply { this.objectType = objectType }

        /** Alias for calling [Builder.objectType] with `objectType.orElse(null)`. */
        fun objectType(objectType: Optional<String>) = objectType(objectType.getOrNull())

        fun batchReadInputPropertyName(batchReadInputPropertyName: BatchReadInputPropertyName) =
            apply {
                this.batchReadInputPropertyName = batchReadInputPropertyName
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
         * Returns an immutable instance of [BatchGetParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .appId()
         * .batchReadInputPropertyName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BatchGetParams =
            BatchGetParams(
                checkRequired("appId", appId),
                objectType,
                checkRequired("batchReadInputPropertyName", batchReadInputPropertyName),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): BatchReadInputPropertyName = batchReadInputPropertyName

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> appId.toString()
            1 -> objectType ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BatchGetParams &&
            appId == other.appId &&
            objectType == other.objectType &&
            batchReadInputPropertyName == other.batchReadInputPropertyName &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            appId,
            objectType,
            batchReadInputPropertyName,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "BatchGetParams{appId=$appId, objectType=$objectType, batchReadInputPropertyName=$batchReadInputPropertyName, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
