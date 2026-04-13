// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.featureflags

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

class PortalFlagStatePutRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val flagState: JsonField<FlagState>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("flagState")
        @ExcludeMissing
        flagState: JsonField<FlagState> = JsonMissing.of()
    ) : this(flagState, mutableMapOf())

    /**
     * The state that the given flag should be in for this portal
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun flagState(): FlagState = flagState.getRequired("flagState")

    /**
     * Returns the raw JSON value of [flagState].
     *
     * Unlike [flagState], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("flagState") @ExcludeMissing fun _flagState(): JsonField<FlagState> = flagState

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
         * Returns a mutable builder for constructing an instance of [PortalFlagStatePutRequest].
         *
         * The following fields are required:
         * ```java
         * .flagState()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PortalFlagStatePutRequest]. */
    class Builder internal constructor() {

        private var flagState: JsonField<FlagState>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(portalFlagStatePutRequest: PortalFlagStatePutRequest) = apply {
            flagState = portalFlagStatePutRequest.flagState
            additionalProperties = portalFlagStatePutRequest.additionalProperties.toMutableMap()
        }

        /** The state that the given flag should be in for this portal */
        fun flagState(flagState: FlagState) = flagState(JsonField.of(flagState))

        /**
         * Sets [Builder.flagState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.flagState] with a well-typed [FlagState] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun flagState(flagState: JsonField<FlagState>) = apply { this.flagState = flagState }

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
         * Returns an immutable instance of [PortalFlagStatePutRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .flagState()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PortalFlagStatePutRequest =
            PortalFlagStatePutRequest(
                checkRequired("flagState", flagState),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PortalFlagStatePutRequest = apply {
        if (validated) {
            return@apply
        }

        flagState().validate()
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
    @JvmSynthetic internal fun validity(): Int = (flagState.asKnown().getOrNull()?.validity() ?: 0)

    /** The state that the given flag should be in for this portal */
    class FlagState @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ABSENT = of("ABSENT")

            @JvmField val OFF = of("OFF")

            @JvmField val ON = of("ON")

            @JvmStatic fun of(value: String) = FlagState(JsonField.of(value))
        }

        /** An enum containing [FlagState]'s known values. */
        enum class Known {
            ABSENT,
            OFF,
            ON,
        }

        /**
         * An enum containing [FlagState]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FlagState] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ABSENT,
            OFF,
            ON,
            /**
             * An enum member indicating that [FlagState] was instantiated with an unknown value.
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
                ABSENT -> Value.ABSENT
                OFF -> Value.OFF
                ON -> Value.ON
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
                ABSENT -> Known.ABSENT
                OFF -> Known.OFF
                ON -> Known.ON
                else -> throw HubSpotInvalidDataException("Unknown FlagState: $value")
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

        fun validate(): FlagState = apply {
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

            return other is FlagState && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PortalFlagStatePutRequest &&
            flagState == other.flagState &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(flagState, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PortalFlagStatePutRequest{flagState=$flagState, additionalProperties=$additionalProperties}"
}
