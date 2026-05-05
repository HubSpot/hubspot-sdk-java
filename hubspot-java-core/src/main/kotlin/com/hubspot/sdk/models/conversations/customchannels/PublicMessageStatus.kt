// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.conversations.customchannels

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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicMessageStatus
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val statusType: JsonField<StatusType>,
    private val failureDetails: JsonField<PublicMessageFailureDetails>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("statusType")
        @ExcludeMissing
        statusType: JsonField<StatusType> = JsonMissing.of(),
        @JsonProperty("failureDetails")
        @ExcludeMissing
        failureDetails: JsonField<PublicMessageFailureDetails> = JsonMissing.of(),
    ) : this(statusType, failureDetails, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun statusType(): StatusType = statusType.getRequired("statusType")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun failureDetails(): Optional<PublicMessageFailureDetails> =
        failureDetails.getOptional("failureDetails")

    /**
     * Returns the raw JSON value of [statusType].
     *
     * Unlike [statusType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("statusType")
    @ExcludeMissing
    fun _statusType(): JsonField<StatusType> = statusType

    /**
     * Returns the raw JSON value of [failureDetails].
     *
     * Unlike [failureDetails], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("failureDetails")
    @ExcludeMissing
    fun _failureDetails(): JsonField<PublicMessageFailureDetails> = failureDetails

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
         * Returns a mutable builder for constructing an instance of [PublicMessageStatus].
         *
         * The following fields are required:
         * ```java
         * .statusType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicMessageStatus]. */
    class Builder internal constructor() {

        private var statusType: JsonField<StatusType>? = null
        private var failureDetails: JsonField<PublicMessageFailureDetails> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicMessageStatus: PublicMessageStatus) = apply {
            statusType = publicMessageStatus.statusType
            failureDetails = publicMessageStatus.failureDetails
            additionalProperties = publicMessageStatus.additionalProperties.toMutableMap()
        }

        fun statusType(statusType: StatusType) = statusType(JsonField.of(statusType))

        /**
         * Sets [Builder.statusType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusType] with a well-typed [StatusType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun statusType(statusType: JsonField<StatusType>) = apply { this.statusType = statusType }

        fun failureDetails(failureDetails: PublicMessageFailureDetails) =
            failureDetails(JsonField.of(failureDetails))

        /**
         * Sets [Builder.failureDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.failureDetails] with a well-typed
         * [PublicMessageFailureDetails] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun failureDetails(failureDetails: JsonField<PublicMessageFailureDetails>) = apply {
            this.failureDetails = failureDetails
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
         * Returns an immutable instance of [PublicMessageStatus].
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
        fun build(): PublicMessageStatus =
            PublicMessageStatus(
                checkRequired("statusType", statusType),
                failureDetails,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): PublicMessageStatus = apply {
        if (validated) {
            return@apply
        }

        statusType().validate()
        failureDetails().ifPresent { it.validate() }
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
            (failureDetails.asKnown().getOrNull()?.validity() ?: 0)

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

            @JvmField val RECEIVED = of("RECEIVED")

            @JvmField val SENT = of("SENT")

            @JvmStatic fun of(value: String) = StatusType(JsonField.of(value))
        }

        /** An enum containing [StatusType]'s known values. */
        enum class Known {
            FAILED,
            READ,
            RECEIVED,
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
            RECEIVED,
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
                RECEIVED -> Value.RECEIVED
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
                RECEIVED -> Known.RECEIVED
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

        return other is PublicMessageStatus &&
            statusType == other.statusType &&
            failureDetails == other.failureDetails &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(statusType, failureDetails, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicMessageStatus{statusType=$statusType, failureDetails=$failureDetails, additionalProperties=$additionalProperties}"
}
