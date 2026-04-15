// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.meta.origins.ipranges

import com.fasterxml.jackson.annotation.JsonCreator
import com.hubspot.sdk.core.Enum
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.Params
import com.hubspot.sdk.core.http.Headers
import com.hubspot.sdk.core.http.QueryParams
import com.hubspot.sdk.core.toImmutable
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a simplified list of IP ranges for specified services and directions in plain text
 * format. This endpoint provides a straightforward representation of IP ranges without additional
 * metadata.
 */
class IpRangeListSimpleParams
private constructor(
    private val direction: List<Direction>?,
    private val service: List<Service>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun direction(): Optional<List<Direction>> = Optional.ofNullable(direction)

    fun service(): Optional<List<Service>> = Optional.ofNullable(service)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): IpRangeListSimpleParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [IpRangeListSimpleParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IpRangeListSimpleParams]. */
    class Builder internal constructor() {

        private var direction: MutableList<Direction>? = null
        private var service: MutableList<Service>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(ipRangeListSimpleParams: IpRangeListSimpleParams) = apply {
            direction = ipRangeListSimpleParams.direction?.toMutableList()
            service = ipRangeListSimpleParams.service?.toMutableList()
            additionalHeaders = ipRangeListSimpleParams.additionalHeaders.toBuilder()
            additionalQueryParams = ipRangeListSimpleParams.additionalQueryParams.toBuilder()
        }

        fun direction(direction: List<Direction>?) = apply {
            this.direction = direction?.toMutableList()
        }

        /** Alias for calling [Builder.direction] with `direction.orElse(null)`. */
        fun direction(direction: Optional<List<Direction>>) = direction(direction.getOrNull())

        /**
         * Adds a single [Direction] to [Builder.direction].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDirection(direction: Direction) = apply {
            this.direction = (this.direction ?: mutableListOf()).apply { add(direction) }
        }

        fun service(service: List<Service>?) = apply { this.service = service?.toMutableList() }

        /** Alias for calling [Builder.service] with `service.orElse(null)`. */
        fun service(service: Optional<List<Service>>) = service(service.getOrNull())

        /**
         * Adds a single [Service] to [Builder.service].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addService(service: Service) = apply {
            this.service = (this.service ?: mutableListOf()).apply { add(service) }
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
         * Returns an immutable instance of [IpRangeListSimpleParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): IpRangeListSimpleParams =
            IpRangeListSimpleParams(
                direction?.toImmutable(),
                service?.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                direction?.let { put("direction", it.joinToString(",") { it.toString() }) }
                service?.let { put("service", it.joinToString(",") { it.toString() }) }
                putAll(additionalQueryParams)
            }
            .build()

    class Direction @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val INGRESS = of("INGRESS")

            @JvmField val EGRESS = of("EGRESS")

            @JvmStatic fun of(value: String) = Direction(JsonField.of(value))
        }

        /** An enum containing [Direction]'s known values. */
        enum class Known {
            INGRESS,
            EGRESS,
        }

        /**
         * An enum containing [Direction]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Direction] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INGRESS,
            EGRESS,
            /**
             * An enum member indicating that [Direction] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                INGRESS -> Value.INGRESS
                EGRESS -> Value.EGRESS
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HubSpotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                INGRESS -> Known.INGRESS
                EGRESS -> Known.EGRESS
                else -> throw HubSpotInvalidDataException("Unknown Direction: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HubSpotInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { HubSpotInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): Direction = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: HubSpotInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Direction && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Service @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val EMAIL = of("EMAIL")

            @JvmField val API = of("API")

            @JvmField val DNS = of("DNS")

            @JvmField val WEB_SCRAPING = of("WEB_SCRAPING")

            @JvmField val TEST_SERVICE = of("TEST_SERVICE")

            @JvmStatic fun of(value: String) = Service(JsonField.of(value))
        }

        /** An enum containing [Service]'s known values. */
        enum class Known {
            EMAIL,
            API,
            DNS,
            WEB_SCRAPING,
            TEST_SERVICE,
        }

        /**
         * An enum containing [Service]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Service] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EMAIL,
            API,
            DNS,
            WEB_SCRAPING,
            TEST_SERVICE,
            /** An enum member indicating that [Service] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                EMAIL -> Value.EMAIL
                API -> Value.API
                DNS -> Value.DNS
                WEB_SCRAPING -> Value.WEB_SCRAPING
                TEST_SERVICE -> Value.TEST_SERVICE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HubSpotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                EMAIL -> Known.EMAIL
                API -> Known.API
                DNS -> Known.DNS
                WEB_SCRAPING -> Known.WEB_SCRAPING
                TEST_SERVICE -> Known.TEST_SERVICE
                else -> throw HubSpotInvalidDataException("Unknown Service: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HubSpotInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { HubSpotInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): Service = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: HubSpotInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Service && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IpRangeListSimpleParams &&
            direction == other.direction &&
            service == other.service &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(direction, service, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "IpRangeListSimpleParams{direction=$direction, service=$service, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
