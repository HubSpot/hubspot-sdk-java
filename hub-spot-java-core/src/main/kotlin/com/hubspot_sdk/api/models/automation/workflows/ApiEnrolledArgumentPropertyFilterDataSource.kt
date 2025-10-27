// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ApiEnrolledArgumentPropertyFilterDataSource
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val argumentName: JsonField<String>,
    private val name: JsonField<String>,
    private val propertyName: JsonField<String>,
    private val type: JsonField<Type>,
    private val sortBy: JsonField<ApiSort>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("argumentName")
        @ExcludeMissing
        argumentName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("propertyName")
        @ExcludeMissing
        propertyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("sortBy") @ExcludeMissing sortBy: JsonField<ApiSort> = JsonMissing.of(),
    ) : this(argumentName, name, propertyName, type, sortBy, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun argumentName(): String = argumentName.getRequired("argumentName")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun propertyName(): String = propertyName.getRequired("propertyName")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sortBy(): Optional<ApiSort> = sortBy.getOptional("sortBy")

    /**
     * Returns the raw JSON value of [argumentName].
     *
     * Unlike [argumentName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("argumentName")
    @ExcludeMissing
    fun _argumentName(): JsonField<String> = argumentName

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [propertyName].
     *
     * Unlike [propertyName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("propertyName")
    @ExcludeMissing
    fun _propertyName(): JsonField<String> = propertyName

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [sortBy].
     *
     * Unlike [sortBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sortBy") @ExcludeMissing fun _sortBy(): JsonField<ApiSort> = sortBy

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
         * [ApiEnrolledArgumentPropertyFilterDataSource].
         *
         * The following fields are required:
         * ```java
         * .argumentName()
         * .name()
         * .propertyName()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ApiEnrolledArgumentPropertyFilterDataSource]. */
    class Builder internal constructor() {

        private var argumentName: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var propertyName: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var sortBy: JsonField<ApiSort> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            apiEnrolledArgumentPropertyFilterDataSource: ApiEnrolledArgumentPropertyFilterDataSource
        ) = apply {
            argumentName = apiEnrolledArgumentPropertyFilterDataSource.argumentName
            name = apiEnrolledArgumentPropertyFilterDataSource.name
            propertyName = apiEnrolledArgumentPropertyFilterDataSource.propertyName
            type = apiEnrolledArgumentPropertyFilterDataSource.type
            sortBy = apiEnrolledArgumentPropertyFilterDataSource.sortBy
            additionalProperties =
                apiEnrolledArgumentPropertyFilterDataSource.additionalProperties.toMutableMap()
        }

        fun argumentName(argumentName: String) = argumentName(JsonField.of(argumentName))

        /**
         * Sets [Builder.argumentName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.argumentName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun argumentName(argumentName: JsonField<String>) = apply {
            this.argumentName = argumentName
        }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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

        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun sortBy(sortBy: ApiSort) = sortBy(JsonField.of(sortBy))

        /**
         * Sets [Builder.sortBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sortBy] with a well-typed [ApiSort] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sortBy(sortBy: JsonField<ApiSort>) = apply { this.sortBy = sortBy }

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
         * Returns an immutable instance of [ApiEnrolledArgumentPropertyFilterDataSource].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .argumentName()
         * .name()
         * .propertyName()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ApiEnrolledArgumentPropertyFilterDataSource =
            ApiEnrolledArgumentPropertyFilterDataSource(
                checkRequired("argumentName", argumentName),
                checkRequired("name", name),
                checkRequired("propertyName", propertyName),
                checkRequired("type", type),
                sortBy,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ApiEnrolledArgumentPropertyFilterDataSource = apply {
        if (validated) {
            return@apply
        }

        argumentName()
        name()
        propertyName()
        type().validate()
        sortBy().ifPresent { it.validate() }
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
        (if (argumentName.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (propertyName.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (sortBy.asKnown().getOrNull()?.validity() ?: 0)

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

            @JvmField
            val ENROLLED_ARGUMENT_PROPERTY_FILTER = of("ENROLLED_ARGUMENT_PROPERTY_FILTER")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            ENROLLED_ARGUMENT_PROPERTY_FILTER
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
            ENROLLED_ARGUMENT_PROPERTY_FILTER,
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
                ENROLLED_ARGUMENT_PROPERTY_FILTER -> Value.ENROLLED_ARGUMENT_PROPERTY_FILTER
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
                ENROLLED_ARGUMENT_PROPERTY_FILTER -> Known.ENROLLED_ARGUMENT_PROPERTY_FILTER
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

        return other is ApiEnrolledArgumentPropertyFilterDataSource &&
            argumentName == other.argumentName &&
            name == other.name &&
            propertyName == other.propertyName &&
            type == other.type &&
            sortBy == other.sortBy &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(argumentName, name, propertyName, type, sortBy, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ApiEnrolledArgumentPropertyFilterDataSource{argumentName=$argumentName, name=$name, propertyName=$propertyName, type=$type, sortBy=$sortBy, additionalProperties=$additionalProperties}"
}
