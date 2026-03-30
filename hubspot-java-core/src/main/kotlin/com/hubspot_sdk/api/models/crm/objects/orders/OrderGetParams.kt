// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.orders

import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Read an Object identified by `{orderId}`. `{orderId}` refers to the internal object ID by
 * default, or optionally any unique property value as specified by the `idProperty` query param.
 * Control what is returned via the `properties` query param.
 */
class OrderGetParams
private constructor(
    private val orderId: String?,
    private val archived: Boolean?,
    private val associations: List<String>?,
    private val idProperty: String?,
    private val properties: List<String>?,
    private val propertiesWithHistory: List<String>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orderId(): Optional<String> = Optional.ofNullable(orderId)

    /** Whether to return only results that have been archived. */
    fun archived(): Optional<Boolean> = Optional.ofNullable(archived)

    /**
     * A comma separated list of object types to retrieve associated IDs for. If any of the
     * specified associations do not exist, they will be ignored.
     */
    fun associations(): Optional<List<String>> = Optional.ofNullable(associations)

    /** The name of a property whose values are unique for this object type */
    fun idProperty(): Optional<String> = Optional.ofNullable(idProperty)

    /**
     * A comma separated list of the properties to be returned in the response. If any of the
     * specified properties are not present on the requested object(s), they will be ignored.
     */
    fun properties(): Optional<List<String>> = Optional.ofNullable(properties)

    /**
     * A comma separated list of the properties to be returned along with their history of previous
     * values. If any of the specified properties are not present on the requested object(s), they
     * will be ignored.
     */
    fun propertiesWithHistory(): Optional<List<String>> = Optional.ofNullable(propertiesWithHistory)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): OrderGetParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [OrderGetParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OrderGetParams]. */
    class Builder internal constructor() {

        private var orderId: String? = null
        private var archived: Boolean? = null
        private var associations: MutableList<String>? = null
        private var idProperty: String? = null
        private var properties: MutableList<String>? = null
        private var propertiesWithHistory: MutableList<String>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(orderGetParams: OrderGetParams) = apply {
            orderId = orderGetParams.orderId
            archived = orderGetParams.archived
            associations = orderGetParams.associations?.toMutableList()
            idProperty = orderGetParams.idProperty
            properties = orderGetParams.properties?.toMutableList()
            propertiesWithHistory = orderGetParams.propertiesWithHistory?.toMutableList()
            additionalHeaders = orderGetParams.additionalHeaders.toBuilder()
            additionalQueryParams = orderGetParams.additionalQueryParams.toBuilder()
        }

        fun orderId(orderId: String?) = apply { this.orderId = orderId }

        /** Alias for calling [Builder.orderId] with `orderId.orElse(null)`. */
        fun orderId(orderId: Optional<String>) = orderId(orderId.getOrNull())

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
         * A comma separated list of object types to retrieve associated IDs for. If any of the
         * specified associations do not exist, they will be ignored.
         */
        fun associations(associations: List<String>?) = apply {
            this.associations = associations?.toMutableList()
        }

        /** Alias for calling [Builder.associations] with `associations.orElse(null)`. */
        fun associations(associations: Optional<List<String>>) =
            associations(associations.getOrNull())

        /**
         * Adds a single [String] to [associations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAssociation(association: String) = apply {
            associations = (associations ?: mutableListOf()).apply { add(association) }
        }

        /** The name of a property whose values are unique for this object type */
        fun idProperty(idProperty: String?) = apply { this.idProperty = idProperty }

        /** Alias for calling [Builder.idProperty] with `idProperty.orElse(null)`. */
        fun idProperty(idProperty: Optional<String>) = idProperty(idProperty.getOrNull())

        /**
         * A comma separated list of the properties to be returned in the response. If any of the
         * specified properties are not present on the requested object(s), they will be ignored.
         */
        fun properties(properties: List<String>?) = apply {
            this.properties = properties?.toMutableList()
        }

        /** Alias for calling [Builder.properties] with `properties.orElse(null)`. */
        fun properties(properties: Optional<List<String>>) = properties(properties.getOrNull())

        /**
         * Adds a single [String] to [properties].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProperty(property: String) = apply {
            properties = (properties ?: mutableListOf()).apply { add(property) }
        }

        /**
         * A comma separated list of the properties to be returned along with their history of
         * previous values. If any of the specified properties are not present on the requested
         * object(s), they will be ignored.
         */
        fun propertiesWithHistory(propertiesWithHistory: List<String>?) = apply {
            this.propertiesWithHistory = propertiesWithHistory?.toMutableList()
        }

        /**
         * Alias for calling [Builder.propertiesWithHistory] with
         * `propertiesWithHistory.orElse(null)`.
         */
        fun propertiesWithHistory(propertiesWithHistory: Optional<List<String>>) =
            propertiesWithHistory(propertiesWithHistory.getOrNull())

        /**
         * Adds a single [String] to [Builder.propertiesWithHistory].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPropertiesWithHistory(propertiesWithHistory: String) = apply {
            this.propertiesWithHistory =
                (this.propertiesWithHistory ?: mutableListOf()).apply { add(propertiesWithHistory) }
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
         * Returns an immutable instance of [OrderGetParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): OrderGetParams =
            OrderGetParams(
                orderId,
                archived,
                associations?.toImmutable(),
                idProperty,
                properties?.toImmutable(),
                propertiesWithHistory?.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> orderId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                archived?.let { put("archived", it.toString()) }
                associations?.let { put("associations", it.joinToString(",")) }
                idProperty?.let { put("idProperty", it) }
                properties?.let { put("properties", it.joinToString(",")) }
                propertiesWithHistory?.let { put("propertiesWithHistory", it.joinToString(",")) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OrderGetParams &&
            orderId == other.orderId &&
            archived == other.archived &&
            associations == other.associations &&
            idProperty == other.idProperty &&
            properties == other.properties &&
            propertiesWithHistory == other.propertiesWithHistory &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            orderId,
            archived,
            associations,
            idProperty,
            properties,
            propertiesWithHistory,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "OrderGetParams{orderId=$orderId, archived=$archived, associations=$associations, idProperty=$idProperty, properties=$properties, propertiesWithHistory=$propertiesWithHistory, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
