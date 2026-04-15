// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.objectschemas

import com.hubspot.sdk.core.Params
import com.hubspot.sdk.core.http.Headers
import com.hubspot.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve details of a custom object schema, including its properties and associations, using the
 * object type ID or fully qualified name.
 */
class ObjectSchemaGetParams
private constructor(
    private val objectType: String?,
    private val includeAssociationDefinitions: Boolean?,
    private val includeAuditMetadata: Boolean?,
    private val includePropertyDefinitions: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun objectType(): Optional<String> = Optional.ofNullable(objectType)

    fun includeAssociationDefinitions(): Optional<Boolean> =
        Optional.ofNullable(includeAssociationDefinitions)

    fun includeAuditMetadata(): Optional<Boolean> = Optional.ofNullable(includeAuditMetadata)

    fun includePropertyDefinitions(): Optional<Boolean> =
        Optional.ofNullable(includePropertyDefinitions)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ObjectSchemaGetParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ObjectSchemaGetParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ObjectSchemaGetParams]. */
    class Builder internal constructor() {

        private var objectType: String? = null
        private var includeAssociationDefinitions: Boolean? = null
        private var includeAuditMetadata: Boolean? = null
        private var includePropertyDefinitions: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(objectSchemaGetParams: ObjectSchemaGetParams) = apply {
            objectType = objectSchemaGetParams.objectType
            includeAssociationDefinitions = objectSchemaGetParams.includeAssociationDefinitions
            includeAuditMetadata = objectSchemaGetParams.includeAuditMetadata
            includePropertyDefinitions = objectSchemaGetParams.includePropertyDefinitions
            additionalHeaders = objectSchemaGetParams.additionalHeaders.toBuilder()
            additionalQueryParams = objectSchemaGetParams.additionalQueryParams.toBuilder()
        }

        fun objectType(objectType: String?) = apply { this.objectType = objectType }

        /** Alias for calling [Builder.objectType] with `objectType.orElse(null)`. */
        fun objectType(objectType: Optional<String>) = objectType(objectType.getOrNull())

        fun includeAssociationDefinitions(includeAssociationDefinitions: Boolean?) = apply {
            this.includeAssociationDefinitions = includeAssociationDefinitions
        }

        /**
         * Alias for [Builder.includeAssociationDefinitions].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeAssociationDefinitions(includeAssociationDefinitions: Boolean) =
            includeAssociationDefinitions(includeAssociationDefinitions as Boolean?)

        /**
         * Alias for calling [Builder.includeAssociationDefinitions] with
         * `includeAssociationDefinitions.orElse(null)`.
         */
        fun includeAssociationDefinitions(includeAssociationDefinitions: Optional<Boolean>) =
            includeAssociationDefinitions(includeAssociationDefinitions.getOrNull())

        fun includeAuditMetadata(includeAuditMetadata: Boolean?) = apply {
            this.includeAuditMetadata = includeAuditMetadata
        }

        /**
         * Alias for [Builder.includeAuditMetadata].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeAuditMetadata(includeAuditMetadata: Boolean) =
            includeAuditMetadata(includeAuditMetadata as Boolean?)

        /**
         * Alias for calling [Builder.includeAuditMetadata] with
         * `includeAuditMetadata.orElse(null)`.
         */
        fun includeAuditMetadata(includeAuditMetadata: Optional<Boolean>) =
            includeAuditMetadata(includeAuditMetadata.getOrNull())

        fun includePropertyDefinitions(includePropertyDefinitions: Boolean?) = apply {
            this.includePropertyDefinitions = includePropertyDefinitions
        }

        /**
         * Alias for [Builder.includePropertyDefinitions].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includePropertyDefinitions(includePropertyDefinitions: Boolean) =
            includePropertyDefinitions(includePropertyDefinitions as Boolean?)

        /**
         * Alias for calling [Builder.includePropertyDefinitions] with
         * `includePropertyDefinitions.orElse(null)`.
         */
        fun includePropertyDefinitions(includePropertyDefinitions: Optional<Boolean>) =
            includePropertyDefinitions(includePropertyDefinitions.getOrNull())

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
         * Returns an immutable instance of [ObjectSchemaGetParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ObjectSchemaGetParams =
            ObjectSchemaGetParams(
                objectType,
                includeAssociationDefinitions,
                includeAuditMetadata,
                includePropertyDefinitions,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> objectType ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                includeAssociationDefinitions?.let {
                    put("includeAssociationDefinitions", it.toString())
                }
                includeAuditMetadata?.let { put("includeAuditMetadata", it.toString()) }
                includePropertyDefinitions?.let { put("includePropertyDefinitions", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ObjectSchemaGetParams &&
            objectType == other.objectType &&
            includeAssociationDefinitions == other.includeAssociationDefinitions &&
            includeAuditMetadata == other.includeAuditMetadata &&
            includePropertyDefinitions == other.includePropertyDefinitions &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            objectType,
            includeAssociationDefinitions,
            includeAuditMetadata,
            includePropertyDefinitions,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ObjectSchemaGetParams{objectType=$objectType, includeAssociationDefinitions=$includeAssociationDefinitions, includeAuditMetadata=$includeAuditMetadata, includePropertyDefinitions=$includePropertyDefinitions, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
