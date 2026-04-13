// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.actions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.Enum
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkKnown
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.toImmutable
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class PublicConditionalSingleFieldDependency
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val controllingFieldName: JsonField<String>,
    private val controllingFieldValue: JsonField<String>,
    private val dependencyType: JsonField<DependencyType>,
    private val dependentFieldNames: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("controllingFieldName")
        @ExcludeMissing
        controllingFieldName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("controllingFieldValue")
        @ExcludeMissing
        controllingFieldValue: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dependencyType")
        @ExcludeMissing
        dependencyType: JsonField<DependencyType> = JsonMissing.of(),
        @JsonProperty("dependentFieldNames")
        @ExcludeMissing
        dependentFieldNames: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        controllingFieldName,
        controllingFieldValue,
        dependencyType,
        dependentFieldNames,
        mutableMapOf(),
    )

    /**
     * The name of the field that determines the dependency.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun controllingFieldName(): String = controllingFieldName.getRequired("controllingFieldName")

    /**
     * The value of the controlling field that triggers the dependency.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun controllingFieldValue(): String = controllingFieldValue.getRequired("controllingFieldValue")

    /**
     * The type of dependency, with the default value being CONDITIONAL_SINGLE_FIELD.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dependencyType(): DependencyType = dependencyType.getRequired("dependencyType")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dependentFieldNames(): List<String> = dependentFieldNames.getRequired("dependentFieldNames")

    /**
     * Returns the raw JSON value of [controllingFieldName].
     *
     * Unlike [controllingFieldName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("controllingFieldName")
    @ExcludeMissing
    fun _controllingFieldName(): JsonField<String> = controllingFieldName

    /**
     * Returns the raw JSON value of [controllingFieldValue].
     *
     * Unlike [controllingFieldValue], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("controllingFieldValue")
    @ExcludeMissing
    fun _controllingFieldValue(): JsonField<String> = controllingFieldValue

    /**
     * Returns the raw JSON value of [dependencyType].
     *
     * Unlike [dependencyType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dependencyType")
    @ExcludeMissing
    fun _dependencyType(): JsonField<DependencyType> = dependencyType

    /**
     * Returns the raw JSON value of [dependentFieldNames].
     *
     * Unlike [dependentFieldNames], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("dependentFieldNames")
    @ExcludeMissing
    fun _dependentFieldNames(): JsonField<List<String>> = dependentFieldNames

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
         * [PublicConditionalSingleFieldDependency].
         *
         * The following fields are required:
         * ```java
         * .controllingFieldName()
         * .controllingFieldValue()
         * .dependencyType()
         * .dependentFieldNames()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicConditionalSingleFieldDependency]. */
    class Builder internal constructor() {

        private var controllingFieldName: JsonField<String>? = null
        private var controllingFieldValue: JsonField<String>? = null
        private var dependencyType: JsonField<DependencyType>? = null
        private var dependentFieldNames: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            publicConditionalSingleFieldDependency: PublicConditionalSingleFieldDependency
        ) = apply {
            controllingFieldName = publicConditionalSingleFieldDependency.controllingFieldName
            controllingFieldValue = publicConditionalSingleFieldDependency.controllingFieldValue
            dependencyType = publicConditionalSingleFieldDependency.dependencyType
            dependentFieldNames =
                publicConditionalSingleFieldDependency.dependentFieldNames.map {
                    it.toMutableList()
                }
            additionalProperties =
                publicConditionalSingleFieldDependency.additionalProperties.toMutableMap()
        }

        /** The name of the field that determines the dependency. */
        fun controllingFieldName(controllingFieldName: String) =
            controllingFieldName(JsonField.of(controllingFieldName))

        /**
         * Sets [Builder.controllingFieldName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.controllingFieldName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun controllingFieldName(controllingFieldName: JsonField<String>) = apply {
            this.controllingFieldName = controllingFieldName
        }

        /** The value of the controlling field that triggers the dependency. */
        fun controllingFieldValue(controllingFieldValue: String) =
            controllingFieldValue(JsonField.of(controllingFieldValue))

        /**
         * Sets [Builder.controllingFieldValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.controllingFieldValue] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun controllingFieldValue(controllingFieldValue: JsonField<String>) = apply {
            this.controllingFieldValue = controllingFieldValue
        }

        /** The type of dependency, with the default value being CONDITIONAL_SINGLE_FIELD. */
        fun dependencyType(dependencyType: DependencyType) =
            dependencyType(JsonField.of(dependencyType))

        /**
         * Sets [Builder.dependencyType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dependencyType] with a well-typed [DependencyType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dependencyType(dependencyType: JsonField<DependencyType>) = apply {
            this.dependencyType = dependencyType
        }

        fun dependentFieldNames(dependentFieldNames: List<String>) =
            dependentFieldNames(JsonField.of(dependentFieldNames))

        /**
         * Sets [Builder.dependentFieldNames] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dependentFieldNames] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun dependentFieldNames(dependentFieldNames: JsonField<List<String>>) = apply {
            this.dependentFieldNames = dependentFieldNames.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [dependentFieldNames].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDependentFieldName(dependentFieldName: String) = apply {
            dependentFieldNames =
                (dependentFieldNames ?: JsonField.of(mutableListOf())).also {
                    checkKnown("dependentFieldNames", it).add(dependentFieldName)
                }
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
         * Returns an immutable instance of [PublicConditionalSingleFieldDependency].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .controllingFieldName()
         * .controllingFieldValue()
         * .dependencyType()
         * .dependentFieldNames()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicConditionalSingleFieldDependency =
            PublicConditionalSingleFieldDependency(
                checkRequired("controllingFieldName", controllingFieldName),
                checkRequired("controllingFieldValue", controllingFieldValue),
                checkRequired("dependencyType", dependencyType),
                checkRequired("dependentFieldNames", dependentFieldNames).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicConditionalSingleFieldDependency = apply {
        if (validated) {
            return@apply
        }

        controllingFieldName()
        controllingFieldValue()
        dependencyType().validate()
        dependentFieldNames()
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
        (if (controllingFieldName.asKnown().isPresent) 1 else 0) +
            (if (controllingFieldValue.asKnown().isPresent) 1 else 0) +
            (dependencyType.asKnown().getOrNull()?.validity() ?: 0) +
            (dependentFieldNames.asKnown().getOrNull()?.size ?: 0)

    /** The type of dependency, with the default value being CONDITIONAL_SINGLE_FIELD. */
    class DependencyType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val CONDITIONAL_SINGLE_FIELD = of("CONDITIONAL_SINGLE_FIELD")

            @JvmStatic fun of(value: String) = DependencyType(JsonField.of(value))
        }

        /** An enum containing [DependencyType]'s known values. */
        enum class Known {
            CONDITIONAL_SINGLE_FIELD
        }

        /**
         * An enum containing [DependencyType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DependencyType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CONDITIONAL_SINGLE_FIELD,
            /**
             * An enum member indicating that [DependencyType] was instantiated with an unknown
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
                CONDITIONAL_SINGLE_FIELD -> Value.CONDITIONAL_SINGLE_FIELD
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
                CONDITIONAL_SINGLE_FIELD -> Known.CONDITIONAL_SINGLE_FIELD
                else -> throw HubSpotInvalidDataException("Unknown DependencyType: $value")
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

        fun validate(): DependencyType = apply {
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

            return other is DependencyType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicConditionalSingleFieldDependency &&
            controllingFieldName == other.controllingFieldName &&
            controllingFieldValue == other.controllingFieldValue &&
            dependencyType == other.dependencyType &&
            dependentFieldNames == other.dependentFieldNames &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            controllingFieldName,
            controllingFieldValue,
            dependencyType,
            dependentFieldNames,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicConditionalSingleFieldDependency{controllingFieldName=$controllingFieldName, controllingFieldValue=$controllingFieldValue, dependencyType=$dependencyType, dependentFieldNames=$dependentFieldNames, additionalProperties=$additionalProperties}"
}
