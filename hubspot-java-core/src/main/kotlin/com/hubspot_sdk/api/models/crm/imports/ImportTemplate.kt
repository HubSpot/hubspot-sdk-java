// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.imports

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

class ImportTemplate
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val templateId: JsonField<Int>,
    private val templateType: JsonField<TemplateType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("templateId") @ExcludeMissing templateId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("templateType")
        @ExcludeMissing
        templateType: JsonField<TemplateType> = JsonMissing.of(),
    ) : this(templateId, templateType, mutableMapOf())

    /**
     * The unique identifier for the specific saved template or previous import being referenced.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun templateId(): Int = templateId.getRequired("templateId")

    /**
     * The classification of what type of template this represents, and what is its origin or
     * purpose.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun templateType(): TemplateType = templateType.getRequired("templateType")

    /**
     * Returns the raw JSON value of [templateId].
     *
     * Unlike [templateId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("templateId") @ExcludeMissing fun _templateId(): JsonField<Int> = templateId

    /**
     * Returns the raw JSON value of [templateType].
     *
     * Unlike [templateType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("templateType")
    @ExcludeMissing
    fun _templateType(): JsonField<TemplateType> = templateType

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
         * Returns a mutable builder for constructing an instance of [ImportTemplate].
         *
         * The following fields are required:
         * ```java
         * .templateId()
         * .templateType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ImportTemplate]. */
    class Builder internal constructor() {

        private var templateId: JsonField<Int>? = null
        private var templateType: JsonField<TemplateType>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(importTemplate: ImportTemplate) = apply {
            templateId = importTemplate.templateId
            templateType = importTemplate.templateType
            additionalProperties = importTemplate.additionalProperties.toMutableMap()
        }

        /**
         * The unique identifier for the specific saved template or previous import being
         * referenced.
         */
        fun templateId(templateId: Int) = templateId(JsonField.of(templateId))

        /**
         * Sets [Builder.templateId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.templateId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun templateId(templateId: JsonField<Int>) = apply { this.templateId = templateId }

        /**
         * The classification of what type of template this represents, and what is its origin or
         * purpose.
         */
        fun templateType(templateType: TemplateType) = templateType(JsonField.of(templateType))

        /**
         * Sets [Builder.templateType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.templateType] with a well-typed [TemplateType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun templateType(templateType: JsonField<TemplateType>) = apply {
            this.templateType = templateType
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
         * Returns an immutable instance of [ImportTemplate].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .templateId()
         * .templateType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ImportTemplate =
            ImportTemplate(
                checkRequired("templateId", templateId),
                checkRequired("templateType", templateType),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ImportTemplate = apply {
        if (validated) {
            return@apply
        }

        templateId()
        templateType().validate()
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
        (if (templateId.asKnown().isPresent) 1 else 0) +
            (templateType.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * The classification of what type of template this represents, and what is its origin or
     * purpose.
     */
    class TemplateType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val ADMIN_DEFINED = of("admin_defined")

            @JvmField val PREVIOUS_IMPORT = of("previous_import")

            @JvmField val USER_FILE = of("user_file")

            @JvmStatic fun of(value: String) = TemplateType(JsonField.of(value))
        }

        /** An enum containing [TemplateType]'s known values. */
        enum class Known {
            ADMIN_DEFINED,
            PREVIOUS_IMPORT,
            USER_FILE,
        }

        /**
         * An enum containing [TemplateType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TemplateType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ADMIN_DEFINED,
            PREVIOUS_IMPORT,
            USER_FILE,
            /**
             * An enum member indicating that [TemplateType] was instantiated with an unknown value.
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
                ADMIN_DEFINED -> Value.ADMIN_DEFINED
                PREVIOUS_IMPORT -> Value.PREVIOUS_IMPORT
                USER_FILE -> Value.USER_FILE
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
                ADMIN_DEFINED -> Known.ADMIN_DEFINED
                PREVIOUS_IMPORT -> Known.PREVIOUS_IMPORT
                USER_FILE -> Known.USER_FILE
                else -> throw HubSpotInvalidDataException("Unknown TemplateType: $value")
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

        fun validate(): TemplateType = apply {
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

            return other is TemplateType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ImportTemplate &&
            templateId == other.templateId &&
            templateType == other.templateType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(templateId, templateType, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ImportTemplate{templateId=$templateId, templateType=$templateType, additionalProperties=$additionalProperties}"
}
