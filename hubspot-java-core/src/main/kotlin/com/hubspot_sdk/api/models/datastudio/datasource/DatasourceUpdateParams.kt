// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.datastudio.datasource

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.MultipartField
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class DatasourceUpdateParams
private constructor(
    private val datasourceId: Long?,
    private val formDataMultiPart: FormDataMultiPart,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun datasourceId(): Optional<Long> = Optional.ofNullable(datasourceId)

    fun formDataMultiPart(): FormDataMultiPart = formDataMultiPart

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        formDataMultiPart._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DatasourceUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .formDataMultiPart()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DatasourceUpdateParams]. */
    class Builder internal constructor() {

        private var datasourceId: Long? = null
        private var formDataMultiPart: FormDataMultiPart? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(datasourceUpdateParams: DatasourceUpdateParams) = apply {
            datasourceId = datasourceUpdateParams.datasourceId
            formDataMultiPart = datasourceUpdateParams.formDataMultiPart
            additionalHeaders = datasourceUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = datasourceUpdateParams.additionalQueryParams.toBuilder()
        }

        fun datasourceId(datasourceId: Long?) = apply { this.datasourceId = datasourceId }

        /**
         * Alias for [Builder.datasourceId].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun datasourceId(datasourceId: Long) = datasourceId(datasourceId as Long?)

        /** Alias for calling [Builder.datasourceId] with `datasourceId.orElse(null)`. */
        fun datasourceId(datasourceId: Optional<Long>) = datasourceId(datasourceId.getOrNull())

        fun formDataMultiPart(formDataMultiPart: FormDataMultiPart) = apply {
            this.formDataMultiPart = formDataMultiPart
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
         * Returns an immutable instance of [DatasourceUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .formDataMultiPart()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DatasourceUpdateParams =
            DatasourceUpdateParams(
                datasourceId,
                checkRequired("formDataMultiPart", formDataMultiPart),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Map<String, MultipartField<*>> =
        (mapOf("form_data_multi_part" to _formDataMultiPart()) +
                _additionalBodyProperties().mapValues { (_, value) -> MultipartField.of(value) })
            .toImmutable()

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> datasourceId?.toString() ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DatasourceUpdateParams &&
            datasourceId == other.datasourceId &&
            formDataMultiPart == other.formDataMultiPart &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(datasourceId, formDataMultiPart, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DatasourceUpdateParams{datasourceId=$datasourceId, formDataMultiPart=$formDataMultiPart, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
