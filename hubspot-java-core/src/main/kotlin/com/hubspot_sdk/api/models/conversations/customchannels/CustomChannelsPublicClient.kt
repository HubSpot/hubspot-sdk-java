// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.Enum
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CustomChannelsPublicClient
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val clientType: JsonField<ClientType>,
    private val integrationAppId: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("clientType")
        @ExcludeMissing
        clientType: JsonField<ClientType> = JsonMissing.of(),
        @JsonProperty("integrationAppId")
        @ExcludeMissing
        integrationAppId: JsonField<Int> = JsonMissing.of(),
    ) : this(clientType, integrationAppId, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun clientType(): ClientType = clientType.getRequired("clientType")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun integrationAppId(): Optional<Int> = integrationAppId.getOptional("integrationAppId")

    /**
     * Returns the raw JSON value of [clientType].
     *
     * Unlike [clientType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("clientType")
    @ExcludeMissing
    fun _clientType(): JsonField<ClientType> = clientType

    /**
     * Returns the raw JSON value of [integrationAppId].
     *
     * Unlike [integrationAppId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("integrationAppId")
    @ExcludeMissing
    fun _integrationAppId(): JsonField<Int> = integrationAppId

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
         * Returns a mutable builder for constructing an instance of [CustomChannelsPublicClient].
         *
         * The following fields are required:
         * ```java
         * .clientType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomChannelsPublicClient]. */
    class Builder internal constructor() {

        private var clientType: JsonField<ClientType>? = null
        private var integrationAppId: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customChannelsPublicClient: CustomChannelsPublicClient) = apply {
            clientType = customChannelsPublicClient.clientType
            integrationAppId = customChannelsPublicClient.integrationAppId
            additionalProperties = customChannelsPublicClient.additionalProperties.toMutableMap()
        }

        fun clientType(clientType: ClientType) = clientType(JsonField.of(clientType))

        /**
         * Sets [Builder.clientType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientType] with a well-typed [ClientType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun clientType(clientType: JsonField<ClientType>) = apply { this.clientType = clientType }

        fun integrationAppId(integrationAppId: Int) =
            integrationAppId(JsonField.of(integrationAppId))

        /**
         * Sets [Builder.integrationAppId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.integrationAppId] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun integrationAppId(integrationAppId: JsonField<Int>) = apply {
            this.integrationAppId = integrationAppId
        }

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
         * Returns an immutable instance of [CustomChannelsPublicClient].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .clientType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomChannelsPublicClient =
            CustomChannelsPublicClient(
                checkRequired("clientType", clientType),
                integrationAppId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CustomChannelsPublicClient = apply {
        if (validated) {
            return@apply
        }

        clientType().validate()
        integrationAppId()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: HubspotInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (clientType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (integrationAppId.asKnown().isPresent) 1 else 0)

    class ClientType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val HUBSPOT = of("HUBSPOT")

            @JvmField val SYSTEM = of("SYSTEM")

            @JvmField val INTEGRATION = of("INTEGRATION")

            @JvmField val UNKNOWN = of("UNKNOWN")

            @JvmStatic fun of(value: String) = ClientType(JsonField.of(value))
        }

        /** An enum containing [ClientType]'s known values. */
        enum class Known {
            HUBSPOT,
            SYSTEM,
            INTEGRATION,
            UNKNOWN,
        }

        /**
         * An enum containing [ClientType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ClientType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            HUBSPOT,
            SYSTEM,
            INTEGRATION,
            UNKNOWN,
            /**
             * An enum member indicating that [ClientType] was instantiated with an unknown value.
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
                HUBSPOT -> Value.HUBSPOT
                SYSTEM -> Value.SYSTEM
                INTEGRATION -> Value.INTEGRATION
                UNKNOWN -> Value.UNKNOWN
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HubspotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                HUBSPOT -> Known.HUBSPOT
                SYSTEM -> Known.SYSTEM
                INTEGRATION -> Known.INTEGRATION
                UNKNOWN -> Known.UNKNOWN
                else -> throw HubspotInvalidDataException("Unknown ClientType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HubspotInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { HubspotInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): ClientType = apply {
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
            } catch (e: HubspotInvalidDataException) {
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

            return other is ClientType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomChannelsPublicClient &&
            clientType == other.clientType &&
            integrationAppId == other.integrationAppId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(clientType, integrationAppId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomChannelsPublicClient{clientType=$clientType, integrationAppId=$integrationAppId, additionalProperties=$additionalProperties}"
}
