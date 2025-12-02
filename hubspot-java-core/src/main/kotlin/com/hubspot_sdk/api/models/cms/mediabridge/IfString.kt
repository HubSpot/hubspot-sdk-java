// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.Enum
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class IfString
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val enclosedInParentheses: JsonField<Boolean>,
    private val ifExpression: JsonField<IfExpression>,
    private val operator: JsonField<Operator>,
    private val elseExpression: JsonField<ElseExpression>,
    private val inputs: JsonField<List<Input>>,
    private val propertyName: JsonField<String>,
    private val value: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("enclosedInParentheses")
        @ExcludeMissing
        enclosedInParentheses: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("ifExpression")
        @ExcludeMissing
        ifExpression: JsonField<IfExpression> = JsonMissing.of(),
        @JsonProperty("operator") @ExcludeMissing operator: JsonField<Operator> = JsonMissing.of(),
        @JsonProperty("elseExpression")
        @ExcludeMissing
        elseExpression: JsonField<ElseExpression> = JsonMissing.of(),
        @JsonProperty("inputs") @ExcludeMissing inputs: JsonField<List<Input>> = JsonMissing.of(),
        @JsonProperty("propertyName")
        @ExcludeMissing
        propertyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
    ) : this(
        enclosedInParentheses,
        ifExpression,
        operator,
        elseExpression,
        inputs,
        propertyName,
        value,
        mutableMapOf(),
    )

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun enclosedInParentheses(): Boolean =
        enclosedInParentheses.getRequired("enclosedInParentheses")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ifExpression(): IfExpression = ifExpression.getRequired("ifExpression")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operator(): Operator = operator.getRequired("operator")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun elseExpression(): Optional<ElseExpression> = elseExpression.getOptional("elseExpression")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inputs(): Optional<List<Input>> = inputs.getOptional("inputs")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun propertyName(): Optional<String> = propertyName.getOptional("propertyName")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun value(): Optional<String> = value.getOptional("value")

    /**
     * Returns the raw JSON value of [enclosedInParentheses].
     *
     * Unlike [enclosedInParentheses], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("enclosedInParentheses")
    @ExcludeMissing
    fun _enclosedInParentheses(): JsonField<Boolean> = enclosedInParentheses

    /**
     * Returns the raw JSON value of [ifExpression].
     *
     * Unlike [ifExpression], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ifExpression")
    @ExcludeMissing
    fun _ifExpression(): JsonField<IfExpression> = ifExpression

    /**
     * Returns the raw JSON value of [operator].
     *
     * Unlike [operator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<Operator> = operator

    /**
     * Returns the raw JSON value of [elseExpression].
     *
     * Unlike [elseExpression], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("elseExpression")
    @ExcludeMissing
    fun _elseExpression(): JsonField<ElseExpression> = elseExpression

    /**
     * Returns the raw JSON value of [inputs].
     *
     * Unlike [inputs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inputs") @ExcludeMissing fun _inputs(): JsonField<List<Input>> = inputs

    /**
     * Returns the raw JSON value of [propertyName].
     *
     * Unlike [propertyName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("propertyName")
    @ExcludeMissing
    fun _propertyName(): JsonField<String> = propertyName

    /**
     * Returns the raw JSON value of [value].
     *
     * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
         * Returns a mutable builder for constructing an instance of [IfString].
         *
         * The following fields are required:
         * ```java
         * .enclosedInParentheses()
         * .ifExpression()
         * .operator()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IfString]. */
    class Builder internal constructor() {

        private var enclosedInParentheses: JsonField<Boolean>? = null
        private var ifExpression: JsonField<IfExpression>? = null
        private var operator: JsonField<Operator>? = null
        private var elseExpression: JsonField<ElseExpression> = JsonMissing.of()
        private var inputs: JsonField<MutableList<Input>>? = null
        private var propertyName: JsonField<String> = JsonMissing.of()
        private var value: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(ifString: IfString) = apply {
            enclosedInParentheses = ifString.enclosedInParentheses
            ifExpression = ifString.ifExpression
            operator = ifString.operator
            elseExpression = ifString.elseExpression
            inputs = ifString.inputs.map { it.toMutableList() }
            propertyName = ifString.propertyName
            value = ifString.value
            additionalProperties = ifString.additionalProperties.toMutableMap()
        }

        fun enclosedInParentheses(enclosedInParentheses: Boolean) =
            enclosedInParentheses(JsonField.of(enclosedInParentheses))

        /**
         * Sets [Builder.enclosedInParentheses] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enclosedInParentheses] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun enclosedInParentheses(enclosedInParentheses: JsonField<Boolean>) = apply {
            this.enclosedInParentheses = enclosedInParentheses
        }

        fun ifExpression(ifExpression: IfExpression) = ifExpression(JsonField.of(ifExpression))

        /**
         * Sets [Builder.ifExpression] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ifExpression] with a well-typed [IfExpression] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ifExpression(ifExpression: JsonField<IfExpression>) = apply {
            this.ifExpression = ifExpression
        }

        fun operator(operator: Operator) = operator(JsonField.of(operator))

        /**
         * Sets [Builder.operator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operator] with a well-typed [Operator] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

        fun elseExpression(elseExpression: ElseExpression) =
            elseExpression(JsonField.of(elseExpression))

        /**
         * Sets [Builder.elseExpression] to an arbitrary JSON value.
         *
         * You should usually call [Builder.elseExpression] with a well-typed [ElseExpression] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun elseExpression(elseExpression: JsonField<ElseExpression>) = apply {
            this.elseExpression = elseExpression
        }

        fun inputs(inputs: List<Input>) = inputs(JsonField.of(inputs))

        /**
         * Sets [Builder.inputs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inputs] with a well-typed `List<Input>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun inputs(inputs: JsonField<List<Input>>) = apply {
            this.inputs = inputs.map { it.toMutableList() }
        }

        /**
         * Adds a single [Input] to [inputs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInput(input: Input) = apply {
            inputs =
                (inputs ?: JsonField.of(mutableListOf())).also {
                    checkKnown("inputs", it).add(input)
                }
        }

        fun propertyName(propertyName: String) = propertyName(JsonField.of(propertyName))

        /**
         * Sets [Builder.propertyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.propertyName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun propertyName(propertyName: JsonField<String>) = apply {
            this.propertyName = propertyName
        }

        fun value(value: String) = value(JsonField.of(value))

        /**
         * Sets [Builder.value] to an arbitrary JSON value.
         *
         * You should usually call [Builder.value] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun value(value: JsonField<String>) = apply { this.value = value }

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
         * Returns an immutable instance of [IfString].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .enclosedInParentheses()
         * .ifExpression()
         * .operator()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IfString =
            IfString(
                checkRequired("enclosedInParentheses", enclosedInParentheses),
                checkRequired("ifExpression", ifExpression),
                checkRequired("operator", operator),
                elseExpression,
                (inputs ?: JsonMissing.of()).map { it.toImmutable() },
                propertyName,
                value,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): IfString = apply {
        if (validated) {
            return@apply
        }

        enclosedInParentheses()
        ifExpression().validate()
        operator().validate()
        elseExpression().ifPresent { it.validate() }
        inputs().ifPresent { it.forEach { it.validate() } }
        propertyName()
        value()
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
        (if (enclosedInParentheses.asKnown().isPresent) 1 else 0) +
            (ifExpression.asKnown().getOrNull()?.validity() ?: 0) +
            (operator.asKnown().getOrNull()?.validity() ?: 0) +
            (elseExpression.asKnown().getOrNull()?.validity() ?: 0) +
            (inputs.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (propertyName.asKnown().isPresent) 1 else 0) +
            (if (value.asKnown().isPresent) 1 else 0)

    class IfExpression
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [IfExpression]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [IfExpression]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(ifExpression: IfExpression) = apply {
                additionalProperties = ifExpression.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [IfExpression].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): IfExpression = IfExpression(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): IfExpression = apply {
            if (validated) {
                return@apply
            }

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
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is IfExpression && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "IfExpression{additionalProperties=$additionalProperties}"
    }

    class Operator @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val IF_STRING = of("IF_STRING")

            @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
        }

        /** An enum containing [Operator]'s known values. */
        enum class Known {
            IF_STRING
        }

        /**
         * An enum containing [Operator]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Operator] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            IF_STRING,
            /** An enum member indicating that [Operator] was instantiated with an unknown value. */
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
                IF_STRING -> Value.IF_STRING
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
                IF_STRING -> Known.IF_STRING
                else -> throw HubspotInvalidDataException("Unknown Operator: $value")
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

        fun validate(): Operator = apply {
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

            return other is Operator && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class ElseExpression
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [ElseExpression]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ElseExpression]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(elseExpression: ElseExpression) = apply {
                additionalProperties = elseExpression.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ElseExpression].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ElseExpression = ElseExpression(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): ElseExpression = apply {
            if (validated) {
                return@apply
            }

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
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ElseExpression && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ElseExpression{additionalProperties=$additionalProperties}"
    }

    class Input
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Input]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Input]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(input: Input) = apply {
                additionalProperties = input.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Input].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Input = Input(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Input = apply {
            if (validated) {
                return@apply
            }

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
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Input && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Input{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IfString &&
            enclosedInParentheses == other.enclosedInParentheses &&
            ifExpression == other.ifExpression &&
            operator == other.operator &&
            elseExpression == other.elseExpression &&
            inputs == other.inputs &&
            propertyName == other.propertyName &&
            value == other.value &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            enclosedInParentheses,
            ifExpression,
            operator,
            elseExpression,
            inputs,
            propertyName,
            value,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IfString{enclosedInParentheses=$enclosedInParentheses, ifExpression=$ifExpression, operator=$operator, elseExpression=$elseExpression, inputs=$inputs, propertyName=$propertyName, value=$value, additionalProperties=$additionalProperties}"
}
