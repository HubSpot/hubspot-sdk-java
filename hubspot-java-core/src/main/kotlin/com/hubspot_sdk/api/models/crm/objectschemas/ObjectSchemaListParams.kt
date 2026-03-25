// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objectschemas

import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ObjectSchemaListParams
private constructor(
    private val archived: Boolean?,
    private val includeAssociationDefinitions: Boolean?,
    private val includeAuditMetadata: Boolean?,
    private val includePropertyDefinitions: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Whether to return only results that have been archived. */
    fun archived(): Optional<Boolean> = Optional.ofNullable(archived)

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

        @JvmStatic fun none(): ObjectSchemaListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ObjectSchemaListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ObjectSchemaListParams]. */
    class Builder internal constructor() {

        private var archived: Boolean? = null
        private var includeAssociationDefinitions: Boolean? = null
        private var includeAuditMetadata: Boolean? = null
        private var includePropertyDefinitions: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(objectSchemaListParams: ObjectSchemaListParams) = apply {
            archived = objectSchemaListParams.archived
            includeAssociationDefinitions = objectSchemaListParams.includeAssociationDefinitions
            includeAuditMetadata = objectSchemaListParams.includeAuditMetadata
            includePropertyDefinitions = objectSchemaListParams.includePropertyDefinitions
            additionalHeaders = objectSchemaListParams.additionalHeaders.toBuilder()
            additionalQueryParams = objectSchemaListParams.additionalQueryParams.toBuilder()
        }

        /** Whether to return only results that have been archived. */
        fun archived(archived: Boolean?) = apply { this.archived = archived }

        /**
         * Alias for [Builder.archived].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun archived(archived: Boolean) = archived(archived as Boolean?)

        /** Alias for calling [Builder.archived] with `archived.orElse(null)`. */
        fun archived(archived: Optional<Boolean>) = archived(archived.getOrNull())

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
         * Returns an immutable instance of [ObjectSchemaListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ObjectSchemaListParams =
            ObjectSchemaListParams(
                archived,
                includeAssociationDefinitions,
                includeAuditMetadata,
                includePropertyDefinitions,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                archived?.let { put("archived", it.toString()) }
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

        return other is ObjectSchemaListParams &&
            archived == other.archived &&
            includeAssociationDefinitions == other.includeAssociationDefinitions &&
            includeAuditMetadata == other.includeAuditMetadata &&
            includePropertyDefinitions == other.includePropertyDefinitions &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            archived,
            includeAssociationDefinitions,
            includeAuditMetadata,
            includePropertyDefinitions,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ObjectSchemaListParams{archived=$archived, includeAssociationDefinitions=$includeAssociationDefinitions, includeAuditMetadata=$includeAuditMetadata, includePropertyDefinitions=$includePropertyDefinitions, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
