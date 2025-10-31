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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class InputFieldDefinition
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val isRequired: JsonField<Boolean>,
    private val typeDefinition: JsonField<FieldTypeDefinition>,
    private val automationFieldType: JsonField<String>,
    private val supportedValueTypes: JsonField<List<SupportedValueType>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("isRequired")
        @ExcludeMissing
        isRequired: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("typeDefinition")
        @ExcludeMissing
        typeDefinition: JsonField<FieldTypeDefinition> = JsonMissing.of(),
        @JsonProperty("automationFieldType")
        @ExcludeMissing
        automationFieldType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("supportedValueTypes")
        @ExcludeMissing
        supportedValueTypes: JsonField<List<SupportedValueType>> = JsonMissing.of(),
    ) : this(isRequired, typeDefinition, automationFieldType, supportedValueTypes, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isRequired(): Boolean = isRequired.getRequired("isRequired")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun typeDefinition(): FieldTypeDefinition = typeDefinition.getRequired("typeDefinition")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun automationFieldType(): Optional<String> =
        automationFieldType.getOptional("automationFieldType")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun supportedValueTypes(): Optional<List<SupportedValueType>> =
        supportedValueTypes.getOptional("supportedValueTypes")

    /**
     * Returns the raw JSON value of [isRequired].
     *
     * Unlike [isRequired], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isRequired") @ExcludeMissing fun _isRequired(): JsonField<Boolean> = isRequired

    /**
     * Returns the raw JSON value of [typeDefinition].
     *
     * Unlike [typeDefinition], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("typeDefinition")
    @ExcludeMissing
    fun _typeDefinition(): JsonField<FieldTypeDefinition> = typeDefinition

    /**
     * Returns the raw JSON value of [automationFieldType].
     *
     * Unlike [automationFieldType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("automationFieldType")
    @ExcludeMissing
    fun _automationFieldType(): JsonField<String> = automationFieldType

    /**
     * Returns the raw JSON value of [supportedValueTypes].
     *
     * Unlike [supportedValueTypes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("supportedValueTypes")
    @ExcludeMissing
    fun _supportedValueTypes(): JsonField<List<SupportedValueType>> = supportedValueTypes

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
         * Returns a mutable builder for constructing an instance of [InputFieldDefinition].
         *
         * The following fields are required:
         * ```java
         * .isRequired()
         * .typeDefinition()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InputFieldDefinition]. */
    class Builder internal constructor() {

        private var isRequired: JsonField<Boolean>? = null
        private var typeDefinition: JsonField<FieldTypeDefinition>? = null
        private var automationFieldType: JsonField<String> = JsonMissing.of()
        private var supportedValueTypes: JsonField<MutableList<SupportedValueType>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(inputFieldDefinition: InputFieldDefinition) = apply {
            isRequired = inputFieldDefinition.isRequired
            typeDefinition = inputFieldDefinition.typeDefinition
            automationFieldType = inputFieldDefinition.automationFieldType
            supportedValueTypes =
                inputFieldDefinition.supportedValueTypes.map { it.toMutableList() }
            additionalProperties = inputFieldDefinition.additionalProperties.toMutableMap()
        }

        fun isRequired(isRequired: Boolean) = isRequired(JsonField.of(isRequired))

        /**
         * Sets [Builder.isRequired] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isRequired] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isRequired(isRequired: JsonField<Boolean>) = apply { this.isRequired = isRequired }

        fun typeDefinition(typeDefinition: FieldTypeDefinition) =
            typeDefinition(JsonField.of(typeDefinition))

        /**
         * Sets [Builder.typeDefinition] to an arbitrary JSON value.
         *
         * You should usually call [Builder.typeDefinition] with a well-typed [FieldTypeDefinition]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun typeDefinition(typeDefinition: JsonField<FieldTypeDefinition>) = apply {
            this.typeDefinition = typeDefinition
        }

        fun automationFieldType(automationFieldType: String) =
            automationFieldType(JsonField.of(automationFieldType))

        /**
         * Sets [Builder.automationFieldType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.automationFieldType] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun automationFieldType(automationFieldType: JsonField<String>) = apply {
            this.automationFieldType = automationFieldType
        }

        fun supportedValueTypes(supportedValueTypes: List<SupportedValueType>) =
            supportedValueTypes(JsonField.of(supportedValueTypes))

        /**
         * Sets [Builder.supportedValueTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.supportedValueTypes] with a well-typed
         * `List<SupportedValueType>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun supportedValueTypes(supportedValueTypes: JsonField<List<SupportedValueType>>) = apply {
            this.supportedValueTypes = supportedValueTypes.map { it.toMutableList() }
        }

        /**
         * Adds a single [SupportedValueType] to [supportedValueTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSupportedValueType(supportedValueType: SupportedValueType) = apply {
            supportedValueTypes =
                (supportedValueTypes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("supportedValueTypes", it).add(supportedValueType)
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
         * Returns an immutable instance of [InputFieldDefinition].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .isRequired()
         * .typeDefinition()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InputFieldDefinition =
            InputFieldDefinition(
                checkRequired("isRequired", isRequired),
                checkRequired("typeDefinition", typeDefinition),
                automationFieldType,
                (supportedValueTypes ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InputFieldDefinition = apply {
        if (validated) {
            return@apply
        }

        isRequired()
        typeDefinition().validate()
        automationFieldType()
        supportedValueTypes().ifPresent { it.forEach { it.validate() } }
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
        (if (isRequired.asKnown().isPresent) 1 else 0) +
            (typeDefinition.asKnown().getOrNull()?.validity() ?: 0) +
            (if (automationFieldType.asKnown().isPresent) 1 else 0) +
            (supportedValueTypes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class SupportedValueType
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val STATIC_VALUE = of("STATIC_VALUE")

            @JvmField val OBJECT_PROPERTY = of("OBJECT_PROPERTY")

            @JvmField val FIELD_DATA = of("FIELD_DATA")

            @JvmField val FETCHED_OBJECT_PROPERTY = of("FETCHED_OBJECT_PROPERTY")

            @JvmField val ENROLLMENT_EVENT_PROPERTY = of("ENROLLMENT_EVENT_PROPERTY")

            @JvmStatic fun of(value: String) = SupportedValueType(JsonField.of(value))
        }

        /** An enum containing [SupportedValueType]'s known values. */
        enum class Known {
            STATIC_VALUE,
            OBJECT_PROPERTY,
            FIELD_DATA,
            FETCHED_OBJECT_PROPERTY,
            ENROLLMENT_EVENT_PROPERTY,
        }

        /**
         * An enum containing [SupportedValueType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SupportedValueType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            STATIC_VALUE,
            OBJECT_PROPERTY,
            FIELD_DATA,
            FETCHED_OBJECT_PROPERTY,
            ENROLLMENT_EVENT_PROPERTY,
            /**
             * An enum member indicating that [SupportedValueType] was instantiated with an unknown
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
                STATIC_VALUE -> Value.STATIC_VALUE
                OBJECT_PROPERTY -> Value.OBJECT_PROPERTY
                FIELD_DATA -> Value.FIELD_DATA
                FETCHED_OBJECT_PROPERTY -> Value.FETCHED_OBJECT_PROPERTY
                ENROLLMENT_EVENT_PROPERTY -> Value.ENROLLMENT_EVENT_PROPERTY
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
                STATIC_VALUE -> Known.STATIC_VALUE
                OBJECT_PROPERTY -> Known.OBJECT_PROPERTY
                FIELD_DATA -> Known.FIELD_DATA
                FETCHED_OBJECT_PROPERTY -> Known.FETCHED_OBJECT_PROPERTY
                ENROLLMENT_EVENT_PROPERTY -> Known.ENROLLMENT_EVENT_PROPERTY
                else -> throw HubspotInvalidDataException("Unknown SupportedValueType: $value")
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

        fun validate(): SupportedValueType = apply {
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

            return other is SupportedValueType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InputFieldDefinition &&
            isRequired == other.isRequired &&
            typeDefinition == other.typeDefinition &&
            automationFieldType == other.automationFieldType &&
            supportedValueTypes == other.supportedValueTypes &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            isRequired,
            typeDefinition,
            automationFieldType,
            supportedValueTypes,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InputFieldDefinition{isRequired=$isRequired, typeDefinition=$typeDefinition, automationFieldType=$automationFieldType, supportedValueTypes=$supportedValueTypes, additionalProperties=$additionalProperties}"
}
