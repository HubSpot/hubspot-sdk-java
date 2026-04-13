// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.meta.origins

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.Enum
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class IpRange
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val cidr: JsonField<String>,
    private val description: JsonField<String>,
    private val direction: JsonField<Direction>,
    private val service: JsonField<Service>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("cidr") @ExcludeMissing cidr: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("direction")
        @ExcludeMissing
        direction: JsonField<Direction> = JsonMissing.of(),
        @JsonProperty("service") @ExcludeMissing service: JsonField<Service> = JsonMissing.of(),
    ) : this(cidr, description, direction, service, mutableMapOf())

    /**
     * The CIDR notation representing the IP range.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cidr(): String = cidr.getRequired("cidr")

    /**
     * A description of the IP range.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = description.getRequired("description")

    /**
     * The direction of the IP traffic, which can be INGRESS or EGRESS.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun direction(): Direction = direction.getRequired("direction")

    /**
     * The service associated with the IP range, such as EMAIL, API, DNS, or WEB_SCRAPING.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun service(): Service = service.getRequired("service")

    /**
     * Returns the raw JSON value of [cidr].
     *
     * Unlike [cidr], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cidr") @ExcludeMissing fun _cidr(): JsonField<String> = cidr

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [direction].
     *
     * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("direction") @ExcludeMissing fun _direction(): JsonField<Direction> = direction

    /**
     * Returns the raw JSON value of [service].
     *
     * Unlike [service], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("service") @ExcludeMissing fun _service(): JsonField<Service> = service

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [IpRange].
         *
         * The following fields are required:
         * ```java
         * .cidr()
         * .description()
         * .direction()
         * .service()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IpRange]. */
    class Builder internal constructor() {

        private var cidr: JsonField<String>? = null
        private var description: JsonField<String>? = null
        private var direction: JsonField<Direction>? = null
        private var service: JsonField<Service>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(ipRange: IpRange) = apply {
            cidr = ipRange.cidr
            description = ipRange.description
            direction = ipRange.direction
            service = ipRange.service
            additionalProperties = ipRange.additionalProperties.toMutableMap()
        }

        /** The CIDR notation representing the IP range. */
        fun cidr(cidr: String) = cidr(JsonField.of(cidr))

        /**
         * Sets [Builder.cidr] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cidr] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cidr(cidr: JsonField<String>) = apply { this.cidr = cidr }

        /** A description of the IP range. */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The direction of the IP traffic, which can be INGRESS or EGRESS. */
        fun direction(direction: Direction) = direction(JsonField.of(direction))

        /**
         * Sets [Builder.direction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.direction] with a well-typed [Direction] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

        /** The service associated with the IP range, such as EMAIL, API, DNS, or WEB_SCRAPING. */
        fun service(service: Service) = service(JsonField.of(service))

        /**
         * Sets [Builder.service] to an arbitrary JSON value.
         *
         * You should usually call [Builder.service] with a well-typed [Service] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun service(service: JsonField<Service>) = apply { this.service = service }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [IpRange].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .cidr()
         * .description()
         * .direction()
         * .service()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IpRange =
            IpRange(
                checkRequired("cidr", cidr),
                checkRequired("description", description),
                checkRequired("direction", direction),
                checkRequired("service", service),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): IpRange = apply {
        if (validated) {
            return@apply
        }

        cidr()
        description()
        direction().validate()
        service().validate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (cidr.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (direction.asKnown().getOrNull()?.validity() ?: 0) +
            (service.asKnown().getOrNull()?.validity() ?: 0)

    /** The direction of the IP traffic, which can be INGRESS or EGRESS. */
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

            @JvmField val EGRESS = of("EGRESS")

            @JvmField val INGRESS = of("INGRESS")

            @JvmStatic fun of(value: String) = Direction(JsonField.of(value))
        }

        /** An enum containing [Direction]'s known values. */
        enum class Known {
            EGRESS,
            INGRESS,
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
            EGRESS,
            INGRESS,
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
                EGRESS -> Value.EGRESS
                INGRESS -> Value.INGRESS
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
                EGRESS -> Known.EGRESS
                INGRESS -> Known.INGRESS
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

    /** The service associated with the IP range, such as EMAIL, API, DNS, or WEB_SCRAPING. */
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

            @JvmField val API = of("API")

            @JvmField val DNS = of("DNS")

            @JvmField val EMAIL = of("EMAIL")

            @JvmField val TEST_SERVICE = of("TEST_SERVICE")

            @JvmField val WEB_SCRAPING = of("WEB_SCRAPING")

            @JvmStatic fun of(value: String) = Service(JsonField.of(value))
        }

        /** An enum containing [Service]'s known values. */
        enum class Known {
            API,
            DNS,
            EMAIL,
            TEST_SERVICE,
            WEB_SCRAPING,
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
            API,
            DNS,
            EMAIL,
            TEST_SERVICE,
            WEB_SCRAPING,
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
                API -> Value.API
                DNS -> Value.DNS
                EMAIL -> Value.EMAIL
                TEST_SERVICE -> Value.TEST_SERVICE
                WEB_SCRAPING -> Value.WEB_SCRAPING
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
                API -> Known.API
                DNS -> Known.DNS
                EMAIL -> Known.EMAIL
                TEST_SERVICE -> Known.TEST_SERVICE
                WEB_SCRAPING -> Known.WEB_SCRAPING
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

        return other is IpRange &&
            cidr == other.cidr &&
            description == other.description &&
            direction == other.direction &&
            service == other.service &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(cidr, description, direction, service, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IpRange{cidr=$cidr, description=$description, direction=$direction, service=$service, additionalProperties=$additionalProperties}"
}
