// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.sequences

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
import kotlin.jvm.optionals.getOrNull

class MeetingSettingsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val criteria: JsonField<Criteria>,
    private val sellingStrategy: JsonField<SellingStrategy>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("criteria") @ExcludeMissing criteria: JsonField<Criteria> = JsonMissing.of(),
        @JsonProperty("sellingStrategy")
        @ExcludeMissing
        sellingStrategy: JsonField<SellingStrategy> = JsonMissing.of(),
    ) : this(criteria, sellingStrategy, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun criteria(): Criteria = criteria.getRequired("criteria")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sellingStrategy(): SellingStrategy = sellingStrategy.getRequired("sellingStrategy")

    /**
     * Returns the raw JSON value of [criteria].
     *
     * Unlike [criteria], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("criteria") @ExcludeMissing fun _criteria(): JsonField<Criteria> = criteria

    /**
     * Returns the raw JSON value of [sellingStrategy].
     *
     * Unlike [sellingStrategy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sellingStrategy")
    @ExcludeMissing
    fun _sellingStrategy(): JsonField<SellingStrategy> = sellingStrategy

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
         * Returns a mutable builder for constructing an instance of [MeetingSettingsResponse].
         *
         * The following fields are required:
         * ```java
         * .criteria()
         * .sellingStrategy()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MeetingSettingsResponse]. */
    class Builder internal constructor() {

        private var criteria: JsonField<Criteria>? = null
        private var sellingStrategy: JsonField<SellingStrategy>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(meetingSettingsResponse: MeetingSettingsResponse) = apply {
            criteria = meetingSettingsResponse.criteria
            sellingStrategy = meetingSettingsResponse.sellingStrategy
            additionalProperties = meetingSettingsResponse.additionalProperties.toMutableMap()
        }

        fun criteria(criteria: Criteria) = criteria(JsonField.of(criteria))

        /**
         * Sets [Builder.criteria] to an arbitrary JSON value.
         *
         * You should usually call [Builder.criteria] with a well-typed [Criteria] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun criteria(criteria: JsonField<Criteria>) = apply { this.criteria = criteria }

        fun sellingStrategy(sellingStrategy: SellingStrategy) =
            sellingStrategy(JsonField.of(sellingStrategy))

        /**
         * Sets [Builder.sellingStrategy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sellingStrategy] with a well-typed [SellingStrategy]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun sellingStrategy(sellingStrategy: JsonField<SellingStrategy>) = apply {
            this.sellingStrategy = sellingStrategy
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
         * Returns an immutable instance of [MeetingSettingsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .criteria()
         * .sellingStrategy()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MeetingSettingsResponse =
            MeetingSettingsResponse(
                checkRequired("criteria", criteria),
                checkRequired("sellingStrategy", sellingStrategy),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MeetingSettingsResponse = apply {
        if (validated) {
            return@apply
        }

        criteria().validate()
        sellingStrategy().validate()
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
        (criteria.asKnown().getOrNull()?.validity() ?: 0) +
            (sellingStrategy.asKnown().getOrNull()?.validity() ?: 0)

    class Criteria @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ALL = of("ALL")

            @JvmField val NONE = of("NONE")

            @JvmStatic fun of(value: String) = Criteria(JsonField.of(value))
        }

        /** An enum containing [Criteria]'s known values. */
        enum class Known {
            ALL,
            NONE,
        }

        /**
         * An enum containing [Criteria]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Criteria] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ALL,
            NONE,
            /** An enum member indicating that [Criteria] was instantiated with an unknown value. */
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
                ALL -> Value.ALL
                NONE -> Value.NONE
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
                ALL -> Known.ALL
                NONE -> Known.NONE
                else -> throw HubSpotInvalidDataException("Unknown Criteria: $value")
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

        fun validate(): Criteria = apply {
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

            return other is Criteria && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class SellingStrategy @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val LEAD_BASED = of("LEAD_BASED")

            @JvmField val ACCOUNT_BASED = of("ACCOUNT_BASED")

            @JvmStatic fun of(value: String) = SellingStrategy(JsonField.of(value))
        }

        /** An enum containing [SellingStrategy]'s known values. */
        enum class Known {
            LEAD_BASED,
            ACCOUNT_BASED,
        }

        /**
         * An enum containing [SellingStrategy]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SellingStrategy] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LEAD_BASED,
            ACCOUNT_BASED,
            /**
             * An enum member indicating that [SellingStrategy] was instantiated with an unknown
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
                LEAD_BASED -> Value.LEAD_BASED
                ACCOUNT_BASED -> Value.ACCOUNT_BASED
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
                LEAD_BASED -> Known.LEAD_BASED
                ACCOUNT_BASED -> Known.ACCOUNT_BASED
                else -> throw HubSpotInvalidDataException("Unknown SellingStrategy: $value")
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

        fun validate(): SellingStrategy = apply {
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

            return other is SellingStrategy && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MeetingSettingsResponse &&
            criteria == other.criteria &&
            sellingStrategy == other.sellingStrategy &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(criteria, sellingStrategy, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MeetingSettingsResponse{criteria=$criteria, sellingStrategy=$sellingStrategy, additionalProperties=$additionalProperties}"
}
