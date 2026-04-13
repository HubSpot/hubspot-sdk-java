// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.events.occurrences

import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.Params
import com.hubspot.sdk.core.http.Headers
import com.hubspot.sdk.core.http.QueryParams
import com.hubspot.sdk.core.toImmutable
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve event occurrences for the specified time frame. This endpoint allows filtering by
 * various parameters such as object type, event type, and occurrence time. It supports pagination
 * and sorting of results.
 */
class OccurrenceListParams
private constructor(
    private val id: List<String>?,
    private val after: String?,
    private val before: String?,
    private val eventType: String?,
    private val limit: Int?,
    private val objectId: Long?,
    private val objectProperty: ObjectProperty?,
    private val objectType: String?,
    private val occurredAfter: OffsetDateTime?,
    private val occurredBefore: OffsetDateTime?,
    private val properties: List<String>?,
    private val property: Property?,
    private val sort: List<String>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<List<String>> = Optional.ofNullable(id)

    /**
     * The paging cursor token of the last successfully read resource will be returned as the
     * `paging.next.after` JSON property of a paged response containing more results.
     */
    fun after(): Optional<String> = Optional.ofNullable(after)

    fun before(): Optional<String> = Optional.ofNullable(before)

    fun eventType(): Optional<String> = Optional.ofNullable(eventType)

    /** The maximum number of results to display per page. */
    fun limit(): Optional<Int> = Optional.ofNullable(limit)

    fun objectId(): Optional<Long> = Optional.ofNullable(objectId)

    fun objectProperty(): Optional<ObjectProperty> = Optional.ofNullable(objectProperty)

    fun objectType(): Optional<String> = Optional.ofNullable(objectType)

    fun occurredAfter(): Optional<OffsetDateTime> = Optional.ofNullable(occurredAfter)

    fun occurredBefore(): Optional<OffsetDateTime> = Optional.ofNullable(occurredBefore)

    fun properties(): Optional<List<String>> = Optional.ofNullable(properties)

    fun property(): Optional<Property> = Optional.ofNullable(property)

    fun sort(): Optional<List<String>> = Optional.ofNullable(sort)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): OccurrenceListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [OccurrenceListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OccurrenceListParams]. */
    class Builder internal constructor() {

        private var id: MutableList<String>? = null
        private var after: String? = null
        private var before: String? = null
        private var eventType: String? = null
        private var limit: Int? = null
        private var objectId: Long? = null
        private var objectProperty: ObjectProperty? = null
        private var objectType: String? = null
        private var occurredAfter: OffsetDateTime? = null
        private var occurredBefore: OffsetDateTime? = null
        private var properties: MutableList<String>? = null
        private var property: Property? = null
        private var sort: MutableList<String>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(occurrenceListParams: OccurrenceListParams) = apply {
            id = occurrenceListParams.id?.toMutableList()
            after = occurrenceListParams.after
            before = occurrenceListParams.before
            eventType = occurrenceListParams.eventType
            limit = occurrenceListParams.limit
            objectId = occurrenceListParams.objectId
            objectProperty = occurrenceListParams.objectProperty
            objectType = occurrenceListParams.objectType
            occurredAfter = occurrenceListParams.occurredAfter
            occurredBefore = occurrenceListParams.occurredBefore
            properties = occurrenceListParams.properties?.toMutableList()
            property = occurrenceListParams.property
            sort = occurrenceListParams.sort?.toMutableList()
            additionalHeaders = occurrenceListParams.additionalHeaders.toBuilder()
            additionalQueryParams = occurrenceListParams.additionalQueryParams.toBuilder()
        }

        fun id(id: List<String>?) = apply { this.id = id?.toMutableList() }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<List<String>>) = id(id.getOrNull())

        /**
         * Adds a single [String] to [Builder.id].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addId(id: String) = apply { this.id = (this.id ?: mutableListOf()).apply { add(id) } }

        /**
         * The paging cursor token of the last successfully read resource will be returned as the
         * `paging.next.after` JSON property of a paged response containing more results.
         */
        fun after(after: String?) = apply { this.after = after }

        /** Alias for calling [Builder.after] with `after.orElse(null)`. */
        fun after(after: Optional<String>) = after(after.getOrNull())

        fun before(before: String?) = apply { this.before = before }

        /** Alias for calling [Builder.before] with `before.orElse(null)`. */
        fun before(before: Optional<String>) = before(before.getOrNull())

        fun eventType(eventType: String?) = apply { this.eventType = eventType }

        /** Alias for calling [Builder.eventType] with `eventType.orElse(null)`. */
        fun eventType(eventType: Optional<String>) = eventType(eventType.getOrNull())

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

        fun objectId(objectId: Long?) = apply { this.objectId = objectId }

        /**
         * Alias for [Builder.objectId].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun objectId(objectId: Long) = objectId(objectId as Long?)

        /** Alias for calling [Builder.objectId] with `objectId.orElse(null)`. */
        fun objectId(objectId: Optional<Long>) = objectId(objectId.getOrNull())

        fun objectProperty(objectProperty: ObjectProperty?) = apply {
            this.objectProperty = objectProperty
        }

        /** Alias for calling [Builder.objectProperty] with `objectProperty.orElse(null)`. */
        fun objectProperty(objectProperty: Optional<ObjectProperty>) =
            objectProperty(objectProperty.getOrNull())

        fun objectType(objectType: String?) = apply { this.objectType = objectType }

        /** Alias for calling [Builder.objectType] with `objectType.orElse(null)`. */
        fun objectType(objectType: Optional<String>) = objectType(objectType.getOrNull())

        fun occurredAfter(occurredAfter: OffsetDateTime?) = apply {
            this.occurredAfter = occurredAfter
        }

        /** Alias for calling [Builder.occurredAfter] with `occurredAfter.orElse(null)`. */
        fun occurredAfter(occurredAfter: Optional<OffsetDateTime>) =
            occurredAfter(occurredAfter.getOrNull())

        fun occurredBefore(occurredBefore: OffsetDateTime?) = apply {
            this.occurredBefore = occurredBefore
        }

        /** Alias for calling [Builder.occurredBefore] with `occurredBefore.orElse(null)`. */
        fun occurredBefore(occurredBefore: Optional<OffsetDateTime>) =
            occurredBefore(occurredBefore.getOrNull())

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

        fun property(property: Property?) = apply { this.property = property }

        /** Alias for calling [Builder.property] with `property.orElse(null)`. */
        fun property(property: Optional<Property>) = property(property.getOrNull())

        fun sort(sort: List<String>?) = apply { this.sort = sort?.toMutableList() }

        /** Alias for calling [Builder.sort] with `sort.orElse(null)`. */
        fun sort(sort: Optional<List<String>>) = sort(sort.getOrNull())

        /**
         * Adds a single [String] to [Builder.sort].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSort(sort: String) = apply {
            this.sort = (this.sort ?: mutableListOf()).apply { add(sort) }
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
         * Returns an immutable instance of [OccurrenceListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): OccurrenceListParams =
            OccurrenceListParams(
                id?.toImmutable(),
                after,
                before,
                eventType,
                limit,
                objectId,
                objectProperty,
                objectType,
                occurredAfter,
                occurredBefore,
                properties?.toImmutable(),
                property,
                sort?.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                id?.let { put("id", it.joinToString(",")) }
                after?.let { put("after", it) }
                before?.let { put("before", it) }
                eventType?.let { put("eventType", it) }
                limit?.let { put("limit", it.toString()) }
                objectId?.let { put("objectId", it.toString()) }
                objectProperty?.let {
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("objectProperty[$key]", value)
                        }
                    }
                }
                objectType?.let { put("objectType", it) }
                occurredAfter?.let {
                    put("occurredAfter", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                occurredBefore?.let {
                    put("occurredBefore", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                properties?.let { put("properties", it.joinToString(",")) }
                property?.let {
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("property[$key]", value)
                        }
                    }
                }
                sort?.let { put("sort", it.joinToString(",")) }
                putAll(additionalQueryParams)
            }
            .build()

    class ObjectProperty
    private constructor(
        private val propname: JsonValue?,
        private val additionalProperties: QueryParams,
    ) {

        fun propname(): Optional<JsonValue> = Optional.ofNullable(propname)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [ObjectProperty]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ObjectProperty]. */
        class Builder internal constructor() {

            private var propname: JsonValue? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(objectProperty: ObjectProperty) = apply {
                propname = objectProperty.propname
                additionalProperties = objectProperty.additionalProperties.toBuilder()
            }

            fun propname(propname: JsonValue?) = apply { this.propname = propname }

            /** Alias for calling [Builder.propname] with `propname.orElse(null)`. */
            fun propname(propname: Optional<JsonValue>) = propname(propname.getOrNull())

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            /**
             * Returns an immutable instance of [ObjectProperty].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ObjectProperty = ObjectProperty(propname, additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ObjectProperty &&
                propname == other.propname &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(propname, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ObjectProperty{propname=$propname, additionalProperties=$additionalProperties}"
    }

    class Property
    private constructor(
        private val propname: JsonValue?,
        private val additionalProperties: QueryParams,
    ) {

        fun propname(): Optional<JsonValue> = Optional.ofNullable(propname)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Property]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Property]. */
        class Builder internal constructor() {

            private var propname: JsonValue? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(property: Property) = apply {
                propname = property.propname
                additionalProperties = property.additionalProperties.toBuilder()
            }

            fun propname(propname: JsonValue?) = apply { this.propname = propname }

            /** Alias for calling [Builder.propname] with `propname.orElse(null)`. */
            fun propname(propname: Optional<JsonValue>) = propname(propname.getOrNull())

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            /**
             * Returns an immutable instance of [Property].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Property = Property(propname, additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Property &&
                propname == other.propname &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(propname, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Property{propname=$propname, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OccurrenceListParams &&
            id == other.id &&
            after == other.after &&
            before == other.before &&
            eventType == other.eventType &&
            limit == other.limit &&
            objectId == other.objectId &&
            objectProperty == other.objectProperty &&
            objectType == other.objectType &&
            occurredAfter == other.occurredAfter &&
            occurredBefore == other.occurredBefore &&
            properties == other.properties &&
            property == other.property &&
            sort == other.sort &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            after,
            before,
            eventType,
            limit,
            objectId,
            objectProperty,
            objectType,
            occurredAfter,
            occurredBefore,
            properties,
            property,
            sort,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "OccurrenceListParams{id=$id, after=$after, before=$before, eventType=$eventType, limit=$limit, objectId=$objectId, objectProperty=$objectProperty, objectType=$objectType, occurredAfter=$occurredAfter, occurredBefore=$occurredBefore, properties=$properties, property=$property, sort=$sort, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
