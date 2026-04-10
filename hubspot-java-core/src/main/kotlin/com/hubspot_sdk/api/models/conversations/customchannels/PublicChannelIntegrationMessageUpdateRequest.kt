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
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicChannelIntegrationMessageUpdateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val statusType: JsonField<StatusType>,
    private val errorMessage: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("statusType")
        @ExcludeMissing
        statusType: JsonField<StatusType> = JsonMissing.of(),
        @JsonProperty("errorMessage")
        @ExcludeMissing
        errorMessage: JsonField<String> = JsonMissing.of(),
    ) : this(statusType, errorMessage, mutableMapOf())

    /**
     * Valid status are SENT, FAILED, and READ
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun statusType(): StatusType = statusType.getRequired("statusType")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun errorMessage(): Optional<String> = errorMessage.getOptional("errorMessage")

    /**
     * Returns the raw JSON value of [statusType].
     *
     * Unlike [statusType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("statusType")
    @ExcludeMissing
    fun _statusType(): JsonField<StatusType> = statusType

    /**
     * Returns the raw JSON value of [errorMessage].
     *
     * Unlike [errorMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("errorMessage")
    @ExcludeMissing
    fun _errorMessage(): JsonField<String> = errorMessage

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
         * Returns a mutable builder for constructing an instance of
         * [PublicChannelIntegrationMessageUpdateRequest].
         *
         * The following fields are required:
         * ```java
         * .statusType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicChannelIntegrationMessageUpdateRequest]. */
    class Builder internal constructor() {

        private var statusType: JsonField<StatusType>? = null
        private var errorMessage: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            publicChannelIntegrationMessageUpdateRequest:
                PublicChannelIntegrationMessageUpdateRequest
        ) = apply {
            statusType = publicChannelIntegrationMessageUpdateRequest.statusType
            errorMessage = publicChannelIntegrationMessageUpdateRequest.errorMessage
            additionalProperties =
                publicChannelIntegrationMessageUpdateRequest.additionalProperties.toMutableMap()
        }

        /** Valid status are SENT, FAILED, and READ */
        fun statusType(statusType: StatusType) = statusType(JsonField.of(statusType))

        /**
         * Sets [Builder.statusType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusType] with a well-typed [StatusType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun statusType(statusType: JsonField<StatusType>) = apply { this.statusType = statusType }

        fun errorMessage(errorMessage: String) = errorMessage(JsonField.of(errorMessage))

        /**
         * Sets [Builder.errorMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errorMessage] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun errorMessage(errorMessage: JsonField<String>) = apply {
            this.errorMessage = errorMessage
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
         * Returns an immutable instance of [PublicChannelIntegrationMessageUpdateRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .statusType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicChannelIntegrationMessageUpdateRequest =
            PublicChannelIntegrationMessageUpdateRequest(
                checkRequired("statusType", statusType),
                errorMessage,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicChannelIntegrationMessageUpdateRequest = apply {
        if (validated) {
            return@apply
        }

        statusType().validate()
        errorMessage()
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
        (statusType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (errorMessage.asKnown().isPresent) 1 else 0)

    /** Valid status are SENT, FAILED, and READ */
    class StatusType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val FAILED = of("FAILED")

            @JvmField val READ = of("READ")

            @JvmField val SENT = of("SENT")

            @JvmStatic fun of(value: String) = StatusType(JsonField.of(value))
        }

        /** An enum containing [StatusType]'s known values. */
        enum class Known {
            FAILED,
            READ,
            SENT,
        }

        /**
         * An enum containing [StatusType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [StatusType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FAILED,
            READ,
            SENT,
            /**
             * An enum member indicating that [StatusType] was instantiated with an unknown value.
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
                FAILED -> Value.FAILED
                READ -> Value.READ
                SENT -> Value.SENT
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
                FAILED -> Known.FAILED
                READ -> Known.READ
                SENT -> Known.SENT
                else -> throw HubSpotInvalidDataException("Unknown StatusType: $value")
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

        fun validate(): StatusType = apply {
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

            return other is StatusType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicChannelIntegrationMessageUpdateRequest &&
            statusType == other.statusType &&
            errorMessage == other.errorMessage &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(statusType, errorMessage, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicChannelIntegrationMessageUpdateRequest{statusType=$statusType, errorMessage=$errorMessage, additionalProperties=$additionalProperties}"
}
