// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.objects.partnerclients.batch

import com.hubspot.core.JsonValue
import com.hubspot.core.Params
import com.hubspot.core.checkRequired
import com.hubspot.core.http.Headers
import com.hubspot.core.http.QueryParams
import com.hubspot.models.crm.objects.BatchReadInputSimplePublicObjectId
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve multiple partner client objects in a single request by specifying their IDs. This
 * endpoint is useful for efficiently accessing data for multiple clients at once, particularly when
 * integrating with third-party systems.
 */
class BatchGetParams
private constructor(
    private val archived: Boolean?,
    private val batchReadInputSimplePublicObjectId: BatchReadInputSimplePublicObjectId,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Whether to return only results that have been archived. */
    fun archived(): Optional<Boolean> = Optional.ofNullable(archived)

    /**
     * Specifies the input for reading a batch of CRM objects, including arrays of object IDs,
     * requested property names (with optional history), and an optional unique identifying
     * property.
     */
    fun batchReadInputSimplePublicObjectId(): BatchReadInputSimplePublicObjectId =
        batchReadInputSimplePublicObjectId

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        batchReadInputSimplePublicObjectId._additionalProperties()

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
         * .batchReadInputSimplePublicObjectId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BatchGetParams]. */
    class Builder internal constructor() {

        private var archived: Boolean? = null
        private var batchReadInputSimplePublicObjectId: BatchReadInputSimplePublicObjectId? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(batchGetParams: BatchGetParams) = apply {
            archived = batchGetParams.archived
            batchReadInputSimplePublicObjectId = batchGetParams.batchReadInputSimplePublicObjectId
            additionalHeaders = batchGetParams.additionalHeaders.toBuilder()
            additionalQueryParams = batchGetParams.additionalQueryParams.toBuilder()
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

        /**
         * Specifies the input for reading a batch of CRM objects, including arrays of object IDs,
         * requested property names (with optional history), and an optional unique identifying
         * property.
         */
        fun batchReadInputSimplePublicObjectId(
            batchReadInputSimplePublicObjectId: BatchReadInputSimplePublicObjectId
        ) = apply { this.batchReadInputSimplePublicObjectId = batchReadInputSimplePublicObjectId }

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
         * .batchReadInputSimplePublicObjectId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BatchGetParams =
            BatchGetParams(
                archived,
                checkRequired(
                    "batchReadInputSimplePublicObjectId",
                    batchReadInputSimplePublicObjectId,
                ),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): BatchReadInputSimplePublicObjectId = batchReadInputSimplePublicObjectId

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                archived?.let { put("archived", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BatchGetParams &&
            archived == other.archived &&
            batchReadInputSimplePublicObjectId == other.batchReadInputSimplePublicObjectId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            archived,
            batchReadInputSimplePublicObjectId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "BatchGetParams{archived=$archived, batchReadInputSimplePublicObjectId=$batchReadInputSimplePublicObjectId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
