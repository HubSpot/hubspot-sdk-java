// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.partnerclients

import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Read a page of objects. Control what is returned via the `properties` query param. */
class PartnerClientListParams
private constructor(
    private val after: String?,
    private val archived: Boolean?,
    private val associations: List<String>?,
    private val limit: Int?,
    private val properties: List<String>?,
    private val propertiesWithHistory: List<String>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The paging cursor token of the last successfully read resource will be returned as the
     * `paging.next.after` JSON property of a paged response containing more results.
     */
    fun after(): Optional<String> = Optional.ofNullable(after)

    /** Whether to return only results that have been archived. */
    fun archived(): Optional<Boolean> = Optional.ofNullable(archived)

    /**
     * A comma separated list of object types to retrieve associated IDs for. If any of the
     * specified associations do not exist, they will be ignored.
     */
    fun associations(): Optional<List<String>> = Optional.ofNullable(associations)

    /** The maximum number of results to display per page. */
    fun limit(): Optional<Int> = Optional.ofNullable(limit)

    /**
     * A comma separated list of the properties to be returned in the response. If any of the
     * specified properties are not present on the requested object(s), they will be ignored.
     */
    fun properties(): Optional<List<String>> = Optional.ofNullable(properties)

    /**
     * A comma separated list of the properties to be returned along with their history of previous
     * values. If any of the specified properties are not present on the requested object(s), they
     * will be ignored. Usage of this parameter will reduce the maximum number of partner clients
     * that can be read by a single request.
     */
    fun propertiesWithHistory(): Optional<List<String>> = Optional.ofNullable(propertiesWithHistory)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): PartnerClientListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [PartnerClientListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PartnerClientListParams]. */
    class Builder internal constructor() {

        private var after: String? = null
        private var archived: Boolean? = null
        private var associations: MutableList<String>? = null
        private var limit: Int? = null
        private var properties: MutableList<String>? = null
        private var propertiesWithHistory: MutableList<String>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(partnerClientListParams: PartnerClientListParams) = apply {
            after = partnerClientListParams.after
            archived = partnerClientListParams.archived
            associations = partnerClientListParams.associations?.toMutableList()
            limit = partnerClientListParams.limit
            properties = partnerClientListParams.properties?.toMutableList()
            propertiesWithHistory = partnerClientListParams.propertiesWithHistory?.toMutableList()
            additionalHeaders = partnerClientListParams.additionalHeaders.toBuilder()
            additionalQueryParams = partnerClientListParams.additionalQueryParams.toBuilder()
        }

        /**
         * The paging cursor token of the last successfully read resource will be returned as the
         * `paging.next.after` JSON property of a paged response containing more results.
         */
        fun after(after: String?) = apply { this.after = after }

        /** Alias for calling [Builder.after] with `after.orElse(null)`. */
        fun after(after: Optional<String>) = after(after.getOrNull())

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

        /** The maximum number of results to display per page. */
        fun limit(limit: Int?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Int) = limit(limit as Int?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Int>) = limit(limit.getOrNull())

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
         * object(s), they will be ignored. Usage of this parameter will reduce the maximum number
         * of partner clients that can be read by a single request.
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
         * Returns an immutable instance of [PartnerClientListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PartnerClientListParams =
            PartnerClientListParams(
                after,
                archived,
                associations?.toImmutable(),
                limit,
                properties?.toImmutable(),
                propertiesWithHistory?.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                after?.let { put("after", it) }
                archived?.let { put("archived", it.toString()) }
                associations?.let { put("associations", it.joinToString(",")) }
                limit?.let { put("limit", it.toString()) }
                properties?.let { put("properties", it.joinToString(",")) }
                propertiesWithHistory?.let { put("propertiesWithHistory", it.joinToString(",")) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PartnerClientListParams &&
            after == other.after &&
            archived == other.archived &&
            associations == other.associations &&
            limit == other.limit &&
            properties == other.properties &&
            propertiesWithHistory == other.propertiesWithHistory &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            after,
            archived,
            associations,
            limit,
            properties,
            propertiesWithHistory,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "PartnerClientListParams{after=$after, archived=$archived, associations=$associations, limit=$limit, properties=$properties, propertiesWithHistory=$propertiesWithHistory, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
