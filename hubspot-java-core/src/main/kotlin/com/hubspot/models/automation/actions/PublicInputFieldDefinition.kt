// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.automation.actions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.core.Enum
import com.hubspot.core.ExcludeMissing
import com.hubspot.core.JsonField
import com.hubspot.core.JsonMissing
import com.hubspot.core.JsonValue
import com.hubspot.core.checkKnown
import com.hubspot.core.checkRequired
import com.hubspot.core.toImmutable
import com.hubspot.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicInputFieldDefinition
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val isRequired: JsonField<Boolean>,
    private val typeDefinition: JsonField<PublicFieldTypeDefinition>,
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
        typeDefinition: JsonField<PublicFieldTypeDefinition> = JsonMissing.of(),
        @JsonProperty("supportedValueTypes")
        @ExcludeMissing
        supportedValueTypes: JsonField<List<SupportedValueType>> = JsonMissing.of(),
    ) : this(isRequired, typeDefinition, supportedValueTypes, mutableMapOf())

    /**
     * Indicates whether the input field is mandatory.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isRequired(): Boolean = isRequired.getRequired("isRequired")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun typeDefinition(): PublicFieldTypeDefinition = typeDefinition.getRequired("typeDefinition")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
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
    fun _typeDefinition(): JsonField<PublicFieldTypeDefinition> = typeDefinition

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
         * Returns a mutable builder for constructing an instance of [PublicInputFieldDefinition].
         *
         * The following fields are required:
         * ```java
         * .isRequired()
         * .typeDefinition()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicInputFieldDefinition]. */
    class Builder internal constructor() {

        private var isRequired: JsonField<Boolean>? = null
        private var typeDefinition: JsonField<PublicFieldTypeDefinition>? = null
        private var supportedValueTypes: JsonField<MutableList<SupportedValueType>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicInputFieldDefinition: PublicInputFieldDefinition) = apply {
            isRequired = publicInputFieldDefinition.isRequired
            typeDefinition = publicInputFieldDefinition.typeDefinition
            supportedValueTypes =
                publicInputFieldDefinition.supportedValueTypes.map { it.toMutableList() }
            additionalProperties = publicInputFieldDefinition.additionalProperties.toMutableMap()
        }

        /** Indicates whether the input field is mandatory. */
        fun isRequired(isRequired: Boolean) = isRequired(JsonField.of(isRequired))

        /**
         * Sets [Builder.isRequired] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isRequired] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isRequired(isRequired: JsonField<Boolean>) = apply { this.isRequired = isRequired }

        fun typeDefinition(typeDefinition: PublicFieldTypeDefinition) =
            typeDefinition(JsonField.of(typeDefinition))

        /**
         * Sets [Builder.typeDefinition] to an arbitrary JSON value.
         *
         * You should usually call [Builder.typeDefinition] with a well-typed
         * [PublicFieldTypeDefinition] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun typeDefinition(typeDefinition: JsonField<PublicFieldTypeDefinition>) = apply {
            this.typeDefinition = typeDefinition
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
         * Returns an immutable instance of [PublicInputFieldDefinition].
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
        fun build(): PublicInputFieldDefinition =
            PublicInputFieldDefinition(
                checkRequired("isRequired", isRequired),
                checkRequired("typeDefinition", typeDefinition),
                (supportedValueTypes ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicInputFieldDefinition = apply {
        if (validated) {
            return@apply
        }

        isRequired()
        typeDefinition().validate()
        supportedValueTypes().ifPresent { it.forEach { it.validate() } }
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
        (if (isRequired.asKnown().isPresent) 1 else 0) +
            (typeDefinition.asKnown().getOrNull()?.validity() ?: 0) +
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

            @JvmStatic fun of(value: String) = SupportedValueType(JsonField.of(value))
        }

        /** An enum containing [SupportedValueType]'s known values. */
        enum class Known {
            STATIC_VALUE,
            OBJECT_PROPERTY,
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
                STATIC_VALUE -> Known.STATIC_VALUE
                OBJECT_PROPERTY -> Known.OBJECT_PROPERTY
                else -> throw HubSpotInvalidDataException("Unknown SupportedValueType: $value")
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

            return other is SupportedValueType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicInputFieldDefinition &&
            isRequired == other.isRequired &&
            typeDefinition == other.typeDefinition &&
            supportedValueTypes == other.supportedValueTypes &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(isRequired, typeDefinition, supportedValueTypes, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicInputFieldDefinition{isRequired=$isRequired, typeDefinition=$typeDefinition, supportedValueTypes=$supportedValueTypes, additionalProperties=$additionalProperties}"
}
