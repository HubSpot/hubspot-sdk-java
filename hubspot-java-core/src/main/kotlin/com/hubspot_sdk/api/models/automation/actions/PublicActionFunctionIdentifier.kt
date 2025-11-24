// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.actions

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

class PublicActionFunctionIdentifier
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val functionType: JsonField<FunctionType>,
    private val id: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("functionType")
        @ExcludeMissing
        functionType: JsonField<FunctionType> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
    ) : this(functionType, id, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun functionType(): FunctionType = functionType.getRequired("functionType")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Returns the raw JSON value of [functionType].
     *
     * Unlike [functionType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("functionType")
    @ExcludeMissing
    fun _functionType(): JsonField<FunctionType> = functionType

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
         * [PublicActionFunctionIdentifier].
         *
         * The following fields are required:
         * ```java
         * .functionType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicActionFunctionIdentifier]. */
    class Builder internal constructor() {

        private var functionType: JsonField<FunctionType>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicActionFunctionIdentifier: PublicActionFunctionIdentifier) = apply {
            functionType = publicActionFunctionIdentifier.functionType
            id = publicActionFunctionIdentifier.id
            additionalProperties =
                publicActionFunctionIdentifier.additionalProperties.toMutableMap()
        }

        fun functionType(functionType: FunctionType) = functionType(JsonField.of(functionType))

        /**
         * Sets [Builder.functionType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.functionType] with a well-typed [FunctionType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun functionType(functionType: JsonField<FunctionType>) = apply {
            this.functionType = functionType
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

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
         * Returns an immutable instance of [PublicActionFunctionIdentifier].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .functionType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicActionFunctionIdentifier =
            PublicActionFunctionIdentifier(
                checkRequired("functionType", functionType),
                id,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicActionFunctionIdentifier = apply {
        if (validated) {
            return@apply
        }

        functionType().validate()
        id()
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
        (functionType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (id.asKnown().isPresent) 1 else 0)

    class FunctionType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val POST_ACTION_EXECUTION = of("POST_ACTION_EXECUTION")

            @JvmField val POST_FETCH_OPTIONS = of("POST_FETCH_OPTIONS")

            @JvmField val PRE_ACTION_EXECUTION = of("PRE_ACTION_EXECUTION")

            @JvmField val PRE_FETCH_OPTIONS = of("PRE_FETCH_OPTIONS")

            @JvmStatic fun of(value: String) = FunctionType(JsonField.of(value))
        }

        /** An enum containing [FunctionType]'s known values. */
        enum class Known {
            POST_ACTION_EXECUTION,
            POST_FETCH_OPTIONS,
            PRE_ACTION_EXECUTION,
            PRE_FETCH_OPTIONS,
        }

        /**
         * An enum containing [FunctionType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FunctionType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            POST_ACTION_EXECUTION,
            POST_FETCH_OPTIONS,
            PRE_ACTION_EXECUTION,
            PRE_FETCH_OPTIONS,
            /**
             * An enum member indicating that [FunctionType] was instantiated with an unknown value.
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
                POST_ACTION_EXECUTION -> Value.POST_ACTION_EXECUTION
                POST_FETCH_OPTIONS -> Value.POST_FETCH_OPTIONS
                PRE_ACTION_EXECUTION -> Value.PRE_ACTION_EXECUTION
                PRE_FETCH_OPTIONS -> Value.PRE_FETCH_OPTIONS
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
                POST_ACTION_EXECUTION -> Known.POST_ACTION_EXECUTION
                POST_FETCH_OPTIONS -> Known.POST_FETCH_OPTIONS
                PRE_ACTION_EXECUTION -> Known.PRE_ACTION_EXECUTION
                PRE_FETCH_OPTIONS -> Known.PRE_FETCH_OPTIONS
                else -> throw HubspotInvalidDataException("Unknown FunctionType: $value")
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

        fun validate(): FunctionType = apply {
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

            return other is FunctionType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicActionFunctionIdentifier &&
            functionType == other.functionType &&
            id == other.id &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(functionType, id, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicActionFunctionIdentifier{functionType=$functionType, id=$id, additionalProperties=$additionalProperties}"
}
