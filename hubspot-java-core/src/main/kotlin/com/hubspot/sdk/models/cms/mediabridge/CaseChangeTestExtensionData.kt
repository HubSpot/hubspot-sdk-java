// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

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

class CaseChangeTestExtensionData
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val mood: JsonField<Mood>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("mood") @ExcludeMissing mood: JsonField<Mood> = JsonMissing.of()
    ) : this(mood, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun mood(): Mood = mood.getRequired("mood")

    /**
     * Returns the raw JSON value of [mood].
     *
     * Unlike [mood], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mood") @ExcludeMissing fun _mood(): JsonField<Mood> = mood

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
         * Returns a mutable builder for constructing an instance of [CaseChangeTestExtensionData].
         *
         * The following fields are required:
         * ```java
         * .mood()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CaseChangeTestExtensionData]. */
    class Builder internal constructor() {

        private var mood: JsonField<Mood>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(caseChangeTestExtensionData: CaseChangeTestExtensionData) = apply {
            mood = caseChangeTestExtensionData.mood
            additionalProperties = caseChangeTestExtensionData.additionalProperties.toMutableMap()
        }

        fun mood(mood: Mood) = mood(JsonField.of(mood))

        /**
         * Sets [Builder.mood] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mood] with a well-typed [Mood] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mood(mood: JsonField<Mood>) = apply { this.mood = mood }

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
         * Returns an immutable instance of [CaseChangeTestExtensionData].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .mood()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CaseChangeTestExtensionData =
            CaseChangeTestExtensionData(
                checkRequired("mood", mood),
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
    fun validate(): CaseChangeTestExtensionData = apply {
        if (validated) {
            return@apply
        }

        mood().validate()
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
    @JvmSynthetic internal fun validity(): Int = (mood.asKnown().getOrNull()?.validity() ?: 0)

    class Mood @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ANGRY = of("ANGRY")

            @JvmField val HAPPY = of("HAPPY")

            @JvmField val SAD = of("SAD")

            @JvmField val SARCASTIC = of("SARCASTIC")

            @JvmStatic fun of(value: String) = Mood(JsonField.of(value))
        }

        /** An enum containing [Mood]'s known values. */
        enum class Known {
            ANGRY,
            HAPPY,
            SAD,
            SARCASTIC,
        }

        /**
         * An enum containing [Mood]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Mood] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ANGRY,
            HAPPY,
            SAD,
            SARCASTIC,
            /** An enum member indicating that [Mood] was instantiated with an unknown value. */
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
                ANGRY -> Value.ANGRY
                HAPPY -> Value.HAPPY
                SAD -> Value.SAD
                SARCASTIC -> Value.SARCASTIC
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
                ANGRY -> Known.ANGRY
                HAPPY -> Known.HAPPY
                SAD -> Known.SAD
                SARCASTIC -> Known.SARCASTIC
                else -> throw HubSpotInvalidDataException("Unknown Mood: $value")
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
        fun validate(): Mood = apply {
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

            return other is Mood && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CaseChangeTestExtensionData &&
            mood == other.mood &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(mood, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CaseChangeTestExtensionData{mood=$mood, additionalProperties=$additionalProperties}"
}
