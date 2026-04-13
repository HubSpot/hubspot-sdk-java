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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class FlagPutRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val defaultState: JsonField<DefaultState>,
    private val overrideState: JsonField<OverrideState>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("defaultState")
        @ExcludeMissing
        defaultState: JsonField<DefaultState> = JsonMissing.of(),
        @JsonProperty("overrideState")
        @ExcludeMissing
        overrideState: JsonField<OverrideState> = JsonMissing.of(),
    ) : this(defaultState, overrideState, mutableMapOf())

    /**
     * The state that the flag should have if there are no overrides for a particular portal
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun defaultState(): DefaultState = defaultState.getRequired("defaultState")

    /**
     * A flag value that supercedes all other overrides, including portal-level values. Mostly used
     * for things like emergency overrides
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun overrideState(): Optional<OverrideState> = overrideState.getOptional("overrideState")

    /**
     * Returns the raw JSON value of [defaultState].
     *
     * Unlike [defaultState], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("defaultState")
    @ExcludeMissing
    fun _defaultState(): JsonField<DefaultState> = defaultState

    /**
     * Returns the raw JSON value of [overrideState].
     *
     * Unlike [overrideState], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("overrideState")
    @ExcludeMissing
    fun _overrideState(): JsonField<OverrideState> = overrideState

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
         * Returns a mutable builder for constructing an instance of [FlagPutRequest].
         *
         * The following fields are required:
         * ```java
         * .defaultState()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FlagPutRequest]. */
    class Builder internal constructor() {

        private var defaultState: JsonField<DefaultState>? = null
        private var overrideState: JsonField<OverrideState> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(flagPutRequest: FlagPutRequest) = apply {
            defaultState = flagPutRequest.defaultState
            overrideState = flagPutRequest.overrideState
            additionalProperties = flagPutRequest.additionalProperties.toMutableMap()
        }

        /** The state that the flag should have if there are no overrides for a particular portal */
        fun defaultState(defaultState: DefaultState) = defaultState(JsonField.of(defaultState))

        /**
         * Sets [Builder.defaultState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultState] with a well-typed [DefaultState] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun defaultState(defaultState: JsonField<DefaultState>) = apply {
            this.defaultState = defaultState
        }

        /**
         * A flag value that supercedes all other overrides, including portal-level values. Mostly
         * used for things like emergency overrides
         */
        fun overrideState(overrideState: OverrideState) = overrideState(JsonField.of(overrideState))

        /**
         * Sets [Builder.overrideState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overrideState] with a well-typed [OverrideState] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun overrideState(overrideState: JsonField<OverrideState>) = apply {
            this.overrideState = overrideState
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
         * Returns an immutable instance of [FlagPutRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .defaultState()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FlagPutRequest =
            FlagPutRequest(
                checkRequired("defaultState", defaultState),
                overrideState,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FlagPutRequest = apply {
        if (validated) {
            return@apply
        }

        defaultState().validate()
        overrideState().ifPresent { it.validate() }
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
        (defaultState.asKnown().getOrNull()?.validity() ?: 0) +
            (overrideState.asKnown().getOrNull()?.validity() ?: 0)

    /** The state that the flag should have if there are no overrides for a particular portal */
    class DefaultState @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmStatic fun of(value: String) = DefaultState(JsonField.of(value))
        }

        /** An enum containing [DefaultState]'s known values. */
        enum class Known {
            ABSENT,
            OFF,
            ON,
        }

        /**
         * An enum containing [DefaultState]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DefaultState] can contain an unknown value in a couple of cases:
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
             * An enum member indicating that [DefaultState] was instantiated with an unknown value.
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
                else -> throw HubSpotInvalidDataException("Unknown DefaultState: $value")
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

        fun validate(): DefaultState = apply {
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

            return other is DefaultState && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * A flag value that supercedes all other overrides, including portal-level values. Mostly used
     * for things like emergency overrides
     */
    class OverrideState @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmStatic fun of(value: String) = OverrideState(JsonField.of(value))
        }

        /** An enum containing [OverrideState]'s known values. */
        enum class Known {
            ABSENT,
            OFF,
            ON,
        }

        /**
         * An enum containing [OverrideState]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [OverrideState] can contain an unknown value in a couple of cases:
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
             * An enum member indicating that [OverrideState] was instantiated with an unknown
             * value.
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
                else -> throw HubSpotInvalidDataException("Unknown OverrideState: $value")
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

        fun validate(): OverrideState = apply {
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

            return other is OverrideState && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FlagPutRequest &&
            defaultState == other.defaultState &&
            overrideState == other.overrideState &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(defaultState, overrideState, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FlagPutRequest{defaultState=$defaultState, overrideState=$overrideState, additionalProperties=$additionalProperties}"
}
