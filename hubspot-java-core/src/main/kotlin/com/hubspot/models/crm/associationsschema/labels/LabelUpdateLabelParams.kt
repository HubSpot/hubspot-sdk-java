// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.associationsschema.labels

import com.hubspot.core.JsonValue
import com.hubspot.core.Params
import com.hubspot.core.checkRequired
import com.hubspot.core.http.Headers
import com.hubspot.core.http.QueryParams
import com.hubspot.models.crm.associationsschema.PublicAssociationDefinitionUpdateRequest
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Update an existing label that describes the relationship between two specified CRM object types.
 * This allows for modifications to existing association labels to better reflect the nature of the
 * relationship.
 */
class LabelUpdateLabelParams
private constructor(
    private val fromObjectType: String,
    private val toObjectType: String?,
    private val publicAssociationDefinitionUpdateRequest: PublicAssociationDefinitionUpdateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun fromObjectType(): String = fromObjectType

    fun toObjectType(): Optional<String> = Optional.ofNullable(toObjectType)

    fun publicAssociationDefinitionUpdateRequest(): PublicAssociationDefinitionUpdateRequest =
        publicAssociationDefinitionUpdateRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        publicAssociationDefinitionUpdateRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LabelUpdateLabelParams].
         *
         * The following fields are required:
         * ```java
         * .fromObjectType()
         * .publicAssociationDefinitionUpdateRequest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LabelUpdateLabelParams]. */
    class Builder internal constructor() {

        private var fromObjectType: String? = null
        private var toObjectType: String? = null
        private var publicAssociationDefinitionUpdateRequest:
            PublicAssociationDefinitionUpdateRequest? =
            null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(labelUpdateLabelParams: LabelUpdateLabelParams) = apply {
            fromObjectType = labelUpdateLabelParams.fromObjectType
            toObjectType = labelUpdateLabelParams.toObjectType
            publicAssociationDefinitionUpdateRequest =
                labelUpdateLabelParams.publicAssociationDefinitionUpdateRequest
            additionalHeaders = labelUpdateLabelParams.additionalHeaders.toBuilder()
            additionalQueryParams = labelUpdateLabelParams.additionalQueryParams.toBuilder()
        }

        fun fromObjectType(fromObjectType: String) = apply { this.fromObjectType = fromObjectType }

        fun toObjectType(toObjectType: String?) = apply { this.toObjectType = toObjectType }

        /** Alias for calling [Builder.toObjectType] with `toObjectType.orElse(null)`. */
        fun toObjectType(toObjectType: Optional<String>) = toObjectType(toObjectType.getOrNull())

        fun publicAssociationDefinitionUpdateRequest(
            publicAssociationDefinitionUpdateRequest: PublicAssociationDefinitionUpdateRequest
        ) = apply {
            this.publicAssociationDefinitionUpdateRequest = publicAssociationDefinitionUpdateRequest
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
         * Returns an immutable instance of [LabelUpdateLabelParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .fromObjectType()
         * .publicAssociationDefinitionUpdateRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LabelUpdateLabelParams =
            LabelUpdateLabelParams(
                checkRequired("fromObjectType", fromObjectType),
                toObjectType,
                checkRequired(
                    "publicAssociationDefinitionUpdateRequest",
                    publicAssociationDefinitionUpdateRequest,
                ),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): PublicAssociationDefinitionUpdateRequest = publicAssociationDefinitionUpdateRequest

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

        return other is LabelUpdateLabelParams &&
            fromObjectType == other.fromObjectType &&
            toObjectType == other.toObjectType &&
            publicAssociationDefinitionUpdateRequest ==
                other.publicAssociationDefinitionUpdateRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            fromObjectType,
            toObjectType,
            publicAssociationDefinitionUpdateRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "LabelUpdateLabelParams{fromObjectType=$fromObjectType, toObjectType=$toObjectType, publicAssociationDefinitionUpdateRequest=$publicAssociationDefinitionUpdateRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
