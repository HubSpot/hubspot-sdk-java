// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.featureflags

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

class FlagResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val appId: JsonField<Int>,
    private val defaultState: JsonField<DefaultState>,
    private val flagName: JsonField<String>,
    private val overrideState: JsonField<OverrideState>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("appId") @ExcludeMissing appId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("defaultState")
        @ExcludeMissing
        defaultState: JsonField<DefaultState> = JsonMissing.of(),
        @JsonProperty("flagName") @ExcludeMissing flagName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("overrideState")
        @ExcludeMissing
        overrideState: JsonField<OverrideState> = JsonMissing.of(),
    ) : this(appId, defaultState, flagName, overrideState, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun appId(): Int = appId.getRequired("appId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun defaultState(): DefaultState = defaultState.getRequired("defaultState")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun flagName(): String = flagName.getRequired("flagName")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun overrideState(): Optional<OverrideState> = overrideState.getOptional("overrideState")

    /**
     * Returns the raw JSON value of [appId].
     *
     * Unlike [appId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("appId") @ExcludeMissing fun _appId(): JsonField<Int> = appId

    /**
     * Returns the raw JSON value of [defaultState].
     *
     * Unlike [defaultState], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("defaultState")
    @ExcludeMissing
    fun _defaultState(): JsonField<DefaultState> = defaultState

    /**
     * Returns the raw JSON value of [flagName].
     *
     * Unlike [flagName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("flagName") @ExcludeMissing fun _flagName(): JsonField<String> = flagName

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
         * Returns a mutable builder for constructing an instance of [FlagResponse].
         *
         * The following fields are required:
         * ```java
         * .appId()
         * .defaultState()
         * .flagName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FlagResponse]. */
    class Builder internal constructor() {

        private var appId: JsonField<Int>? = null
        private var defaultState: JsonField<DefaultState>? = null
        private var flagName: JsonField<String>? = null
        private var overrideState: JsonField<OverrideState> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(flagResponse: FlagResponse) = apply {
            appId = flagResponse.appId
            defaultState = flagResponse.defaultState
            flagName = flagResponse.flagName
            overrideState = flagResponse.overrideState
            additionalProperties = flagResponse.additionalProperties.toMutableMap()
        }

        fun appId(appId: Int) = appId(JsonField.of(appId))

        /**
         * Sets [Builder.appId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.appId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun appId(appId: JsonField<Int>) = apply { this.appId = appId }

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

        fun flagName(flagName: String) = flagName(JsonField.of(flagName))

        /**
         * Sets [Builder.flagName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.flagName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun flagName(flagName: JsonField<String>) = apply { this.flagName = flagName }

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
         * Returns an immutable instance of [FlagResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .appId()
         * .defaultState()
         * .flagName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FlagResponse =
            FlagResponse(
                checkRequired("appId", appId),
                checkRequired("defaultState", defaultState),
                checkRequired("flagName", flagName),
                overrideState,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FlagResponse = apply {
        if (validated) {
            return@apply
        }

        appId()
        defaultState().validate()
        flagName()
        overrideState().ifPresent { it.validate() }
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
        (if (appId.asKnown().isPresent) 1 else 0) +
            (defaultState.asKnown().getOrNull()?.validity() ?: 0) +
            (if (flagName.asKnown().isPresent) 1 else 0) +
            (overrideState.asKnown().getOrNull()?.validity() ?: 0)

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

            @JvmField val OFF = of("OFF")

            @JvmField val ON = of("ON")

            @JvmField val ABSENT = of("ABSENT")

            @JvmStatic fun of(value: String) = DefaultState(JsonField.of(value))
        }

        /** An enum containing [DefaultState]'s known values. */
        enum class Known {
            OFF,
            ON,
            ABSENT,
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
            OFF,
            ON,
            ABSENT,
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
                OFF -> Value.OFF
                ON -> Value.ON
                ABSENT -> Value.ABSENT
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
                OFF -> Known.OFF
                ON -> Known.ON
                ABSENT -> Known.ABSENT
                else -> throw HubspotInvalidDataException("Unknown DefaultState: $value")
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

            return other is DefaultState && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

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

            @JvmField val OFF = of("OFF")

            @JvmField val ON = of("ON")

            @JvmField val ABSENT = of("ABSENT")

            @JvmStatic fun of(value: String) = OverrideState(JsonField.of(value))
        }

        /** An enum containing [OverrideState]'s known values. */
        enum class Known {
            OFF,
            ON,
            ABSENT,
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
            OFF,
            ON,
            ABSENT,
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
                OFF -> Value.OFF
                ON -> Value.ON
                ABSENT -> Value.ABSENT
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
                OFF -> Known.OFF
                ON -> Known.ON
                ABSENT -> Known.ABSENT
                else -> throw HubspotInvalidDataException("Unknown OverrideState: $value")
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

            return other is OverrideState && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FlagResponse &&
            appId == other.appId &&
            defaultState == other.defaultState &&
            flagName == other.flagName &&
            overrideState == other.overrideState &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(appId, defaultState, flagName, overrideState, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FlagResponse{appId=$appId, defaultState=$defaultState, flagName=$flagName, overrideState=$overrideState, additionalProperties=$additionalProperties}"
}
