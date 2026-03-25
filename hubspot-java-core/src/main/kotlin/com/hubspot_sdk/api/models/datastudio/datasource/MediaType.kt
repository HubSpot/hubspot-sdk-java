// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.datastudio.datasource

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class MediaType
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val parameters: JsonField<Parameters>,
    private val subtype: JsonField<String>,
    private val type: JsonField<String>,
    private val wildcardSubtype: JsonField<Boolean>,
    private val wildcardType: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("parameters")
        @ExcludeMissing
        parameters: JsonField<Parameters> = JsonMissing.of(),
        @JsonProperty("subtype") @ExcludeMissing subtype: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("wildcardSubtype")
        @ExcludeMissing
        wildcardSubtype: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("wildcardType")
        @ExcludeMissing
        wildcardType: JsonField<Boolean> = JsonMissing.of(),
    ) : this(parameters, subtype, type, wildcardSubtype, wildcardType, mutableMapOf())

    /**
     * An object containing additional parameters for the media type, where each key-value pair is a
     * string.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun parameters(): Parameters = parameters.getRequired("parameters")

    /**
     * The specific subtype of the media, represented as a string.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subtype(): String = subtype.getRequired("subtype")

    /**
     * The primary type of the media, represented as a string.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): String = type.getRequired("type")

    /**
     * A boolean indicating whether the media subtype is a wildcard.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun wildcardSubtype(): Boolean = wildcardSubtype.getRequired("wildcardSubtype")

    /**
     * A boolean indicating whether the media type is a wildcard.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun wildcardType(): Boolean = wildcardType.getRequired("wildcardType")

    /**
     * Returns the raw JSON value of [parameters].
     *
     * Unlike [parameters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parameters")
    @ExcludeMissing
    fun _parameters(): JsonField<Parameters> = parameters

    /**
     * Returns the raw JSON value of [subtype].
     *
     * Unlike [subtype], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subtype") @ExcludeMissing fun _subtype(): JsonField<String> = subtype

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

    /**
     * Returns the raw JSON value of [wildcardSubtype].
     *
     * Unlike [wildcardSubtype], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("wildcardSubtype")
    @ExcludeMissing
    fun _wildcardSubtype(): JsonField<Boolean> = wildcardSubtype

    /**
     * Returns the raw JSON value of [wildcardType].
     *
     * Unlike [wildcardType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("wildcardType")
    @ExcludeMissing
    fun _wildcardType(): JsonField<Boolean> = wildcardType

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
         * Returns a mutable builder for constructing an instance of [MediaType].
         *
         * The following fields are required:
         * ```java
         * .parameters()
         * .subtype()
         * .type()
         * .wildcardSubtype()
         * .wildcardType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MediaType]. */
    class Builder internal constructor() {

        private var parameters: JsonField<Parameters>? = null
        private var subtype: JsonField<String>? = null
        private var type: JsonField<String>? = null
        private var wildcardSubtype: JsonField<Boolean>? = null
        private var wildcardType: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(mediaType: MediaType) = apply {
            parameters = mediaType.parameters
            subtype = mediaType.subtype
            type = mediaType.type
            wildcardSubtype = mediaType.wildcardSubtype
            wildcardType = mediaType.wildcardType
            additionalProperties = mediaType.additionalProperties.toMutableMap()
        }

        /**
         * An object containing additional parameters for the media type, where each key-value pair
         * is a string.
         */
        fun parameters(parameters: Parameters) = parameters(JsonField.of(parameters))

        /**
         * Sets [Builder.parameters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parameters] with a well-typed [Parameters] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun parameters(parameters: JsonField<Parameters>) = apply { this.parameters = parameters }

        /** The specific subtype of the media, represented as a string. */
        fun subtype(subtype: String) = subtype(JsonField.of(subtype))

        /**
         * Sets [Builder.subtype] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subtype] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun subtype(subtype: JsonField<String>) = apply { this.subtype = subtype }

        /** The primary type of the media, represented as a string. */
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

        /** A boolean indicating whether the media subtype is a wildcard. */
        fun wildcardSubtype(wildcardSubtype: Boolean) =
            wildcardSubtype(JsonField.of(wildcardSubtype))

        /**
         * Sets [Builder.wildcardSubtype] to an arbitrary JSON value.
         *
         * You should usually call [Builder.wildcardSubtype] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun wildcardSubtype(wildcardSubtype: JsonField<Boolean>) = apply {
            this.wildcardSubtype = wildcardSubtype
        }

        /** A boolean indicating whether the media type is a wildcard. */
        fun wildcardType(wildcardType: Boolean) = wildcardType(JsonField.of(wildcardType))

        /**
         * Sets [Builder.wildcardType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.wildcardType] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun wildcardType(wildcardType: JsonField<Boolean>) = apply {
            this.wildcardType = wildcardType
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
         * Returns an immutable instance of [MediaType].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .parameters()
         * .subtype()
         * .type()
         * .wildcardSubtype()
         * .wildcardType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MediaType =
            MediaType(
                checkRequired("parameters", parameters),
                checkRequired("subtype", subtype),
                checkRequired("type", type),
                checkRequired("wildcardSubtype", wildcardSubtype),
                checkRequired("wildcardType", wildcardType),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MediaType = apply {
        if (validated) {
            return@apply
        }

        parameters().validate()
        subtype()
        type()
        wildcardSubtype()
        wildcardType()
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
        (parameters.asKnown().getOrNull()?.validity() ?: 0) +
            (if (subtype.asKnown().isPresent) 1 else 0) +
            (if (type.asKnown().isPresent) 1 else 0) +
            (if (wildcardSubtype.asKnown().isPresent) 1 else 0) +
            (if (wildcardType.asKnown().isPresent) 1 else 0)

    /**
     * An object containing additional parameters for the media type, where each key-value pair is a
     * string.
     */
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

            return other is Parameters && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Parameters{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MediaType &&
            parameters == other.parameters &&
            subtype == other.subtype &&
            type == other.type &&
            wildcardSubtype == other.wildcardSubtype &&
            wildcardType == other.wildcardType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(parameters, subtype, type, wildcardSubtype, wildcardType, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MediaType{parameters=$parameters, subtype=$subtype, type=$type, wildcardSubtype=$wildcardSubtype, wildcardType=$wildcardType, additionalProperties=$additionalProperties}"
}
