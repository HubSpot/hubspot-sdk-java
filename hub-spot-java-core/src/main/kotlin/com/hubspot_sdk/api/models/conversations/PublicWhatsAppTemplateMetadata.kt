// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

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
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class PublicWhatsAppTemplateMetadata
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val crmObjectIds: JsonField<CrmObjectIds>,
    private val mappedTemplateId: JsonField<String>,
    private val parameters: JsonField<Parameters>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("crmObjectIds")
        @ExcludeMissing
        crmObjectIds: JsonField<CrmObjectIds> = JsonMissing.of(),
        @JsonProperty("mappedTemplateId")
        @ExcludeMissing
        mappedTemplateId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parameters")
        @ExcludeMissing
        parameters: JsonField<Parameters> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(crmObjectIds, mappedTemplateId, parameters, type, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun crmObjectIds(): CrmObjectIds = crmObjectIds.getRequired("crmObjectIds")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun mappedTemplateId(): String = mappedTemplateId.getRequired("mappedTemplateId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun parameters(): Parameters = parameters.getRequired("parameters")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Returns the raw JSON value of [crmObjectIds].
     *
     * Unlike [crmObjectIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("crmObjectIds")
    @ExcludeMissing
    fun _crmObjectIds(): JsonField<CrmObjectIds> = crmObjectIds

    /**
     * Returns the raw JSON value of [mappedTemplateId].
     *
     * Unlike [mappedTemplateId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("mappedTemplateId")
    @ExcludeMissing
    fun _mappedTemplateId(): JsonField<String> = mappedTemplateId

    /**
     * Returns the raw JSON value of [parameters].
     *
     * Unlike [parameters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parameters")
    @ExcludeMissing
    fun _parameters(): JsonField<Parameters> = parameters

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
         * [PublicWhatsAppTemplateMetadata].
         *
         * The following fields are required:
         * ```java
         * .crmObjectIds()
         * .mappedTemplateId()
         * .parameters()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicWhatsAppTemplateMetadata]. */
    class Builder internal constructor() {

        private var crmObjectIds: JsonField<CrmObjectIds>? = null
        private var mappedTemplateId: JsonField<String>? = null
        private var parameters: JsonField<Parameters>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicWhatsAppTemplateMetadata: PublicWhatsAppTemplateMetadata) = apply {
            crmObjectIds = publicWhatsAppTemplateMetadata.crmObjectIds
            mappedTemplateId = publicWhatsAppTemplateMetadata.mappedTemplateId
            parameters = publicWhatsAppTemplateMetadata.parameters
            type = publicWhatsAppTemplateMetadata.type
            additionalProperties =
                publicWhatsAppTemplateMetadata.additionalProperties.toMutableMap()
        }

        fun crmObjectIds(crmObjectIds: CrmObjectIds) = crmObjectIds(JsonField.of(crmObjectIds))

        /**
         * Sets [Builder.crmObjectIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.crmObjectIds] with a well-typed [CrmObjectIds] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun crmObjectIds(crmObjectIds: JsonField<CrmObjectIds>) = apply {
            this.crmObjectIds = crmObjectIds
        }

        fun mappedTemplateId(mappedTemplateId: String) =
            mappedTemplateId(JsonField.of(mappedTemplateId))

        /**
         * Sets [Builder.mappedTemplateId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mappedTemplateId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun mappedTemplateId(mappedTemplateId: JsonField<String>) = apply {
            this.mappedTemplateId = mappedTemplateId
        }

        fun parameters(parameters: Parameters) = parameters(JsonField.of(parameters))

        /**
         * Sets [Builder.parameters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parameters] with a well-typed [Parameters] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun parameters(parameters: JsonField<Parameters>) = apply { this.parameters = parameters }

        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

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
         * Returns an immutable instance of [PublicWhatsAppTemplateMetadata].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .crmObjectIds()
         * .mappedTemplateId()
         * .parameters()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicWhatsAppTemplateMetadata =
            PublicWhatsAppTemplateMetadata(
                checkRequired("crmObjectIds", crmObjectIds),
                checkRequired("mappedTemplateId", mappedTemplateId),
                checkRequired("parameters", parameters),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicWhatsAppTemplateMetadata = apply {
        if (validated) {
            return@apply
        }

        crmObjectIds().validate()
        mappedTemplateId()
        parameters().validate()
        type().validate()
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
        (crmObjectIds.asKnown().getOrNull()?.validity() ?: 0) +
            (if (mappedTemplateId.asKnown().isPresent) 1 else 0) +
            (parameters.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    class CrmObjectIds
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

            /** Returns a mutable builder for constructing an instance of [CrmObjectIds]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CrmObjectIds]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(crmObjectIds: CrmObjectIds) = apply {
                additionalProperties = crmObjectIds.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [CrmObjectIds].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CrmObjectIds = CrmObjectIds(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): CrmObjectIds = apply {
            if (validated) {
                return@apply
            }

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
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CrmObjectIds && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "CrmObjectIds{additionalProperties=$additionalProperties}"
    }

    class Parameters
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

            /** Returns a mutable builder for constructing an instance of [Parameters]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Parameters]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(parameters: Parameters) = apply {
                additionalProperties = parameters.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Parameters].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Parameters = Parameters(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Parameters = apply {
            if (validated) {
                return@apply
            }

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
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Parameters && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Parameters{additionalProperties=$additionalProperties}"
    }

    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val WHATSAPP_TEMPLATE_METADATA = of("WHATSAPP_TEMPLATE_METADATA")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            WHATSAPP_TEMPLATE_METADATA
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            WHATSAPP_TEMPLATE_METADATA,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                WHATSAPP_TEMPLATE_METADATA -> Value.WHATSAPP_TEMPLATE_METADATA
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
                WHATSAPP_TEMPLATE_METADATA -> Known.WHATSAPP_TEMPLATE_METADATA
                else -> throw HubSpotInvalidDataException("Unknown Type: $value")
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

        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicWhatsAppTemplateMetadata &&
            crmObjectIds == other.crmObjectIds &&
            mappedTemplateId == other.mappedTemplateId &&
            parameters == other.parameters &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(crmObjectIds, mappedTemplateId, parameters, type, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicWhatsAppTemplateMetadata{crmObjectIds=$crmObjectIds, mappedTemplateId=$mappedTemplateId, parameters=$parameters, type=$type, additionalProperties=$additionalProperties}"
}
