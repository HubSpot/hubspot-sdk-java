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
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class PublicSingleFieldDependency
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val controllingFieldName: JsonField<String>,
    private val dependencyType: JsonField<DependencyType>,
    private val dependentFieldNames: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("controllingFieldName")
        @ExcludeMissing
        controllingFieldName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dependencyType")
        @ExcludeMissing
        dependencyType: JsonField<DependencyType> = JsonMissing.of(),
        @JsonProperty("dependentFieldNames")
        @ExcludeMissing
        dependentFieldNames: JsonField<List<String>> = JsonMissing.of(),
    ) : this(controllingFieldName, dependencyType, dependentFieldNames, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun controllingFieldName(): String = controllingFieldName.getRequired("controllingFieldName")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dependencyType(): DependencyType = dependencyType.getRequired("dependencyType")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
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
         * Returns a mutable builder for constructing an instance of [PublicSingleFieldDependency].
         *
         * The following fields are required:
         * ```java
         * .controllingFieldName()
         * .dependencyType()
         * .dependentFieldNames()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicSingleFieldDependency]. */
    class Builder internal constructor() {

        private var controllingFieldName: JsonField<String>? = null
        private var dependencyType: JsonField<DependencyType>? = null
        private var dependentFieldNames: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicSingleFieldDependency: PublicSingleFieldDependency) = apply {
            controllingFieldName = publicSingleFieldDependency.controllingFieldName
            dependencyType = publicSingleFieldDependency.dependencyType
            dependentFieldNames =
                publicSingleFieldDependency.dependentFieldNames.map { it.toMutableList() }
            additionalProperties = publicSingleFieldDependency.additionalProperties.toMutableMap()
        }

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
         * Returns an immutable instance of [PublicSingleFieldDependency].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .controllingFieldName()
         * .dependencyType()
         * .dependentFieldNames()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicSingleFieldDependency =
            PublicSingleFieldDependency(
                checkRequired("controllingFieldName", controllingFieldName),
                checkRequired("dependencyType", dependencyType),
                checkRequired("dependentFieldNames", dependentFieldNames).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicSingleFieldDependency = apply {
        if (validated) {
            return@apply
        }

        controllingFieldName()
        dependencyType().validate()
        dependentFieldNames()
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
        (if (controllingFieldName.asKnown().isPresent) 1 else 0) +
            (dependencyType.asKnown().getOrNull()?.validity() ?: 0) +
            (dependentFieldNames.asKnown().getOrNull()?.size ?: 0)

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

            @JvmField val SINGLE_FIELD = of("SINGLE_FIELD")

            @JvmStatic fun of(value: String) = DependencyType(JsonField.of(value))
        }

        /** An enum containing [DependencyType]'s known values. */
        enum class Known {
            SINGLE_FIELD
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
            SINGLE_FIELD,
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
                SINGLE_FIELD -> Value.SINGLE_FIELD
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
                SINGLE_FIELD -> Known.SINGLE_FIELD
                else -> throw HubspotInvalidDataException("Unknown DependencyType: $value")
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

            return other is DependencyType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicSingleFieldDependency &&
            controllingFieldName == other.controllingFieldName &&
            dependencyType == other.dependencyType &&
            dependentFieldNames == other.dependentFieldNames &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            controllingFieldName,
            dependencyType,
            dependentFieldNames,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicSingleFieldDependency{controllingFieldName=$controllingFieldName, dependencyType=$dependencyType, dependentFieldNames=$dependentFieldNames, additionalProperties=$additionalProperties}"
}
