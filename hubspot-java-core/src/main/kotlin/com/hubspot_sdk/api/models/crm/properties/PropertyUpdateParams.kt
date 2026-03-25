// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.properties

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Perform a partial update of a property identified by { propertyName }. Provided fields will be
 * overwritten.
 */
class PropertyUpdateParams
private constructor(
    private val objectType: String,
    private val propertyName: String?,
    private val propertyUpdate: PropertyUpdate,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun objectType(): String = objectType

    fun propertyName(): Optional<String> = Optional.ofNullable(propertyName)

    fun propertyUpdate(): PropertyUpdate = propertyUpdate

    fun _additionalBodyProperties(): Map<String, JsonValue> = propertyUpdate._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PropertyUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .objectType()
         * .propertyUpdate()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PropertyUpdateParams]. */
    class Builder internal constructor() {

        private var objectType: String? = null
        private var propertyName: String? = null
        private var propertyUpdate: PropertyUpdate? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(propertyUpdateParams: PropertyUpdateParams) = apply {
            objectType = propertyUpdateParams.objectType
            propertyName = propertyUpdateParams.propertyName
            propertyUpdate = propertyUpdateParams.propertyUpdate
            additionalHeaders = propertyUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = propertyUpdateParams.additionalQueryParams.toBuilder()
        }

        fun objectType(objectType: String) = apply { this.objectType = objectType }

        fun propertyName(propertyName: String?) = apply { this.propertyName = propertyName }

        /** Alias for calling [Builder.propertyName] with `propertyName.orElse(null)`. */
        fun propertyName(propertyName: Optional<String>) = propertyName(propertyName.getOrNull())

        fun propertyUpdate(propertyUpdate: PropertyUpdate) = apply {
            this.propertyUpdate = propertyUpdate
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
         * Returns an immutable instance of [PropertyUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .objectType()
         * .propertyUpdate()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PropertyUpdateParams =
            PropertyUpdateParams(
                checkRequired("objectType", objectType),
                propertyName,
                checkRequired("propertyUpdate", propertyUpdate),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): PropertyUpdate = propertyUpdate

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> objectType
            1 -> propertyName ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PropertyUpdateParams &&
            objectType == other.objectType &&
            propertyName == other.propertyName &&
            propertyUpdate == other.propertyUpdate &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            objectType,
            propertyName,
            propertyUpdate,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "PropertyUpdateParams{objectType=$objectType, propertyName=$propertyName, propertyUpdate=$propertyUpdate, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
