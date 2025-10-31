// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.limits

import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Returns limits and usage for custom association labels */
class LimitGetAssociationLabelLimitsParams
private constructor(
    private val fromObjectTypeId: String?,
    private val toObjectTypeId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun fromObjectTypeId(): Optional<String> = Optional.ofNullable(fromObjectTypeId)

    fun toObjectTypeId(): Optional<String> = Optional.ofNullable(toObjectTypeId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): LimitGetAssociationLabelLimitsParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [LimitGetAssociationLabelLimitsParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LimitGetAssociationLabelLimitsParams]. */
    class Builder internal constructor() {

        private var fromObjectTypeId: String? = null
        private var toObjectTypeId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            limitGetAssociationLabelLimitsParams: LimitGetAssociationLabelLimitsParams
        ) = apply {
            fromObjectTypeId = limitGetAssociationLabelLimitsParams.fromObjectTypeId
            toObjectTypeId = limitGetAssociationLabelLimitsParams.toObjectTypeId
            additionalHeaders = limitGetAssociationLabelLimitsParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                limitGetAssociationLabelLimitsParams.additionalQueryParams.toBuilder()
        }

        fun fromObjectTypeId(fromObjectTypeId: String?) = apply {
            this.fromObjectTypeId = fromObjectTypeId
        }

        /** Alias for calling [Builder.fromObjectTypeId] with `fromObjectTypeId.orElse(null)`. */
        fun fromObjectTypeId(fromObjectTypeId: Optional<String>) =
            fromObjectTypeId(fromObjectTypeId.getOrNull())

        fun toObjectTypeId(toObjectTypeId: String?) = apply { this.toObjectTypeId = toObjectTypeId }

        /** Alias for calling [Builder.toObjectTypeId] with `toObjectTypeId.orElse(null)`. */
        fun toObjectTypeId(toObjectTypeId: Optional<String>) =
            toObjectTypeId(toObjectTypeId.getOrNull())

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
         * Returns an immutable instance of [LimitGetAssociationLabelLimitsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): LimitGetAssociationLabelLimitsParams =
            LimitGetAssociationLabelLimitsParams(
                fromObjectTypeId,
                toObjectTypeId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                fromObjectTypeId?.let { put("fromObjectTypeId", it) }
                toObjectTypeId?.let { put("toObjectTypeId", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LimitGetAssociationLabelLimitsParams &&
            fromObjectTypeId == other.fromObjectTypeId &&
            toObjectTypeId == other.toObjectTypeId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(fromObjectTypeId, toObjectTypeId, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "LimitGetAssociationLabelLimitsParams{fromObjectTypeId=$fromObjectTypeId, toObjectTypeId=$toObjectTypeId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
