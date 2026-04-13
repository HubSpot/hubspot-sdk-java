// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.communicationpreferences.definitions

import com.hubspot.core.Params
import com.hubspot.core.http.Headers
import com.hubspot.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get a list of subscription status definitions from the account. */
class DefinitionListParams
private constructor(
    private val businessUnitId: Long?,
    private val includeTranslations: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun businessUnitId(): Optional<Long> = Optional.ofNullable(businessUnitId)

    fun includeTranslations(): Optional<Boolean> = Optional.ofNullable(includeTranslations)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): DefinitionListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [DefinitionListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DefinitionListParams]. */
    class Builder internal constructor() {

        private var businessUnitId: Long? = null
        private var includeTranslations: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(definitionListParams: DefinitionListParams) = apply {
            businessUnitId = definitionListParams.businessUnitId
            includeTranslations = definitionListParams.includeTranslations
            additionalHeaders = definitionListParams.additionalHeaders.toBuilder()
            additionalQueryParams = definitionListParams.additionalQueryParams.toBuilder()
        }

        fun businessUnitId(businessUnitId: Long?) = apply { this.businessUnitId = businessUnitId }

        /**
         * Alias for [Builder.businessUnitId].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun businessUnitId(businessUnitId: Long) = businessUnitId(businessUnitId as Long?)

        /** Alias for calling [Builder.businessUnitId] with `businessUnitId.orElse(null)`. */
        fun businessUnitId(businessUnitId: Optional<Long>) =
            businessUnitId(businessUnitId.getOrNull())

        fun includeTranslations(includeTranslations: Boolean?) = apply {
            this.includeTranslations = includeTranslations
        }

        /**
         * Alias for [Builder.includeTranslations].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeTranslations(includeTranslations: Boolean) =
            includeTranslations(includeTranslations as Boolean?)

        /**
         * Alias for calling [Builder.includeTranslations] with `includeTranslations.orElse(null)`.
         */
        fun includeTranslations(includeTranslations: Optional<Boolean>) =
            includeTranslations(includeTranslations.getOrNull())

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
         * Returns an immutable instance of [DefinitionListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DefinitionListParams =
            DefinitionListParams(
                businessUnitId,
                includeTranslations,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                businessUnitId?.let { put("businessUnitId", it.toString()) }
                includeTranslations?.let { put("includeTranslations", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DefinitionListParams &&
            businessUnitId == other.businessUnitId &&
            includeTranslations == other.includeTranslations &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(businessUnitId, includeTranslations, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DefinitionListParams{businessUnitId=$businessUnitId, includeTranslations=$includeTranslations, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
