// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.v4

import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.models.AssociationSpec
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Set association labels between two records. */
class V4UpdateParams
private constructor(
    private val objectType: String,
    private val objectId: String,
    private val toObjectType: String,
    private val toObjectId: String?,
    private val body: List<AssociationSpec>,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun objectType(): String = objectType

    fun objectId(): String = objectId

    fun toObjectType(): String = toObjectType

    fun toObjectId(): Optional<String> = Optional.ofNullable(toObjectId)

    fun body(): List<AssociationSpec> = body

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [V4UpdateParams].
         *
         * The following fields are required:
         * ```java
         * .objectType()
         * .objectId()
         * .toObjectType()
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V4UpdateParams]. */
    class Builder internal constructor() {

        private var objectType: String? = null
        private var objectId: String? = null
        private var toObjectType: String? = null
        private var toObjectId: String? = null
        private var body: MutableList<AssociationSpec>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v4UpdateParams: V4UpdateParams) = apply {
            objectType = v4UpdateParams.objectType
            objectId = v4UpdateParams.objectId
            toObjectType = v4UpdateParams.toObjectType
            toObjectId = v4UpdateParams.toObjectId
            body = v4UpdateParams.body.toMutableList()
            additionalHeaders = v4UpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = v4UpdateParams.additionalQueryParams.toBuilder()
        }

        fun objectType(objectType: String) = apply { this.objectType = objectType }

        fun objectId(objectId: String) = apply { this.objectId = objectId }

        fun toObjectType(toObjectType: String) = apply { this.toObjectType = toObjectType }

        fun toObjectId(toObjectId: String?) = apply { this.toObjectId = toObjectId }

        /** Alias for calling [Builder.toObjectId] with `toObjectId.orElse(null)`. */
        fun toObjectId(toObjectId: Optional<String>) = toObjectId(toObjectId.getOrNull())

        fun body(body: List<AssociationSpec>) = apply { this.body = body.toMutableList() }

        /**
         * Adds a single [AssociationSpec] to [Builder.body].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBody(body: AssociationSpec) = apply {
            this.body = (this.body ?: mutableListOf()).apply { add(body) }
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
         * Returns an immutable instance of [V4UpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .objectType()
         * .objectId()
         * .toObjectType()
         * .body()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): V4UpdateParams =
            V4UpdateParams(
                checkRequired("objectType", objectType),
                checkRequired("objectId", objectId),
                checkRequired("toObjectType", toObjectType),
                toObjectId,
                checkRequired("body", body).toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): List<AssociationSpec> = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> objectType
            1 -> objectId
            2 -> toObjectType
            3 -> toObjectId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V4UpdateParams &&
            objectType == other.objectType &&
            objectId == other.objectId &&
            toObjectType == other.toObjectType &&
            toObjectId == other.toObjectId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            objectType,
            objectId,
            toObjectType,
            toObjectId,
            body,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "V4UpdateParams{objectType=$objectType, objectId=$objectId, toObjectType=$toObjectType, toObjectId=$toObjectId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
