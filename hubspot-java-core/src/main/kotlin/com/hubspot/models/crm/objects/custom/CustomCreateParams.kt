// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.objects.custom

import com.hubspot.core.JsonValue
import com.hubspot.core.Params
import com.hubspot.core.checkRequired
import com.hubspot.core.http.Headers
import com.hubspot.core.http.QueryParams
import com.hubspot.models.crm.objects.SimplePublicObjectInputForCreate
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Create a CRM object with the given properties and return a copy of the object, including the ID.
 * Documentation and examples for creating standard objects is provided.
 */
class CustomCreateParams
private constructor(
    private val objectType: String?,
    private val simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun objectType(): Optional<String> = Optional.ofNullable(objectType)

    /**
     * Is the input object used to create a new CRM object, containing the properties to be set and
     * optional associations to link the new record with other CRM objects.
     */
    fun simplePublicObjectInputForCreate(): SimplePublicObjectInputForCreate =
        simplePublicObjectInputForCreate

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        simplePublicObjectInputForCreate._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomCreateParams].
         *
         * The following fields are required:
         * ```java
         * .simplePublicObjectInputForCreate()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomCreateParams]. */
    class Builder internal constructor() {

        private var objectType: String? = null
        private var simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(customCreateParams: CustomCreateParams) = apply {
            objectType = customCreateParams.objectType
            simplePublicObjectInputForCreate = customCreateParams.simplePublicObjectInputForCreate
            additionalHeaders = customCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = customCreateParams.additionalQueryParams.toBuilder()
        }

        fun objectType(objectType: String?) = apply { this.objectType = objectType }

        /** Alias for calling [Builder.objectType] with `objectType.orElse(null)`. */
        fun objectType(objectType: Optional<String>) = objectType(objectType.getOrNull())

        /**
         * Is the input object used to create a new CRM object, containing the properties to be set
         * and optional associations to link the new record with other CRM objects.
         */
        fun simplePublicObjectInputForCreate(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
        ) = apply { this.simplePublicObjectInputForCreate = simplePublicObjectInputForCreate }

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
         * Returns an immutable instance of [CustomCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .simplePublicObjectInputForCreate()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomCreateParams =
            CustomCreateParams(
                objectType,
                checkRequired("simplePublicObjectInputForCreate", simplePublicObjectInputForCreate),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): SimplePublicObjectInputForCreate = simplePublicObjectInputForCreate

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> objectType ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomCreateParams &&
            objectType == other.objectType &&
            simplePublicObjectInputForCreate == other.simplePublicObjectInputForCreate &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            objectType,
            simplePublicObjectInputForCreate,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "CustomCreateParams{objectType=$objectType, simplePublicObjectInputForCreate=$simplePublicObjectInputForCreate, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
