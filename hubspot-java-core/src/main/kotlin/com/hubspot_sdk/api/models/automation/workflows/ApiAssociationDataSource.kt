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
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ApiAssociationDataSource
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val associationCategory: JsonField<AssociationCategory>,
    private val associationTypeId: JsonField<Int>,
    private val name: JsonField<String>,
    private val objectTypeId: JsonField<String>,
    private val type: JsonField<Type>,
    private val sortBy: JsonField<ApiSort>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("associationCategory")
        @ExcludeMissing
        associationCategory: JsonField<AssociationCategory> = JsonMissing.of(),
        @JsonProperty("associationTypeId")
        @ExcludeMissing
        associationTypeId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("objectTypeId")
        @ExcludeMissing
        objectTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("sortBy") @ExcludeMissing sortBy: JsonField<ApiSort> = JsonMissing.of(),
    ) : this(
        associationCategory,
        associationTypeId,
        name,
        objectTypeId,
        type,
        sortBy,
        mutableMapOf(),
    )

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun associationCategory(): AssociationCategory =
        associationCategory.getRequired("associationCategory")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun associationTypeId(): Int = associationTypeId.getRequired("associationTypeId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectTypeId(): String = objectTypeId.getRequired("objectTypeId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sortBy(): Optional<ApiSort> = sortBy.getOptional("sortBy")

    /**
     * Returns the raw JSON value of [associationCategory].
     *
     * Unlike [associationCategory], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("associationCategory")
    @ExcludeMissing
    fun _associationCategory(): JsonField<AssociationCategory> = associationCategory

    /**
     * Returns the raw JSON value of [associationTypeId].
     *
     * Unlike [associationTypeId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("associationTypeId")
    @ExcludeMissing
    fun _associationTypeId(): JsonField<Int> = associationTypeId

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [objectTypeId].
     *
     * Unlike [objectTypeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectTypeId")
    @ExcludeMissing
    fun _objectTypeId(): JsonField<String> = objectTypeId

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
         * Returns a mutable builder for constructing an instance of [ApiAssociationDataSource].
         *
         * The following fields are required:
         * ```java
         * .associationCategory()
         * .associationTypeId()
         * .name()
         * .objectTypeId()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ApiAssociationDataSource]. */
    class Builder internal constructor() {

        private var associationCategory: JsonField<AssociationCategory>? = null
        private var associationTypeId: JsonField<Int>? = null
        private var name: JsonField<String>? = null
        private var objectTypeId: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var sortBy: JsonField<ApiSort> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(apiAssociationDataSource: ApiAssociationDataSource) = apply {
            associationCategory = apiAssociationDataSource.associationCategory
            associationTypeId = apiAssociationDataSource.associationTypeId
            name = apiAssociationDataSource.name
            objectTypeId = apiAssociationDataSource.objectTypeId
            type = apiAssociationDataSource.type
            sortBy = apiAssociationDataSource.sortBy
            additionalProperties = apiAssociationDataSource.additionalProperties.toMutableMap()
        }

        fun associationCategory(associationCategory: AssociationCategory) =
            associationCategory(JsonField.of(associationCategory))

        /**
         * Sets [Builder.associationCategory] to an arbitrary JSON value.
         *
         * You should usually call [Builder.associationCategory] with a well-typed
         * [AssociationCategory] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun associationCategory(associationCategory: JsonField<AssociationCategory>) = apply {
            this.associationCategory = associationCategory
        }

        fun associationTypeId(associationTypeId: Int) =
            associationTypeId(JsonField.of(associationTypeId))

        /**
         * Sets [Builder.associationTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.associationTypeId] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun associationTypeId(associationTypeId: JsonField<Int>) = apply {
            this.associationTypeId = associationTypeId
        }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun objectTypeId(objectTypeId: String) = objectTypeId(JsonField.of(objectTypeId))

        /**
         * Sets [Builder.objectTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectTypeId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun objectTypeId(objectTypeId: JsonField<String>) = apply {
            this.objectTypeId = objectTypeId
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
         * Returns an immutable instance of [ApiAssociationDataSource].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .associationCategory()
         * .associationTypeId()
         * .name()
         * .objectTypeId()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ApiAssociationDataSource =
            ApiAssociationDataSource(
                checkRequired("associationCategory", associationCategory),
                checkRequired("associationTypeId", associationTypeId),
                checkRequired("name", name),
                checkRequired("objectTypeId", objectTypeId),
                checkRequired("type", type),
                sortBy,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ApiAssociationDataSource = apply {
        if (validated) {
            return@apply
        }

        associationCategory().validate()
        associationTypeId()
        name()
        objectTypeId()
        type().validate()
        sortBy().ifPresent { it.validate() }
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
        (associationCategory.asKnown().getOrNull()?.validity() ?: 0) +
            (if (associationTypeId.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (objectTypeId.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (sortBy.asKnown().getOrNull()?.validity() ?: 0)

    class AssociationCategory
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

            @JvmField val HUBSPOT_DEFINED = of("HUBSPOT_DEFINED")

            @JvmField val USER_DEFINED = of("USER_DEFINED")

            @JvmField val INTEGRATOR_DEFINED = of("INTEGRATOR_DEFINED")

            @JvmStatic fun of(value: String) = AssociationCategory(JsonField.of(value))
        }

        /** An enum containing [AssociationCategory]'s known values. */
        enum class Known {
            HUBSPOT_DEFINED,
            USER_DEFINED,
            INTEGRATOR_DEFINED,
        }

        /**
         * An enum containing [AssociationCategory]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AssociationCategory] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            HUBSPOT_DEFINED,
            USER_DEFINED,
            INTEGRATOR_DEFINED,
            /**
             * An enum member indicating that [AssociationCategory] was instantiated with an unknown
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
                HUBSPOT_DEFINED -> Value.HUBSPOT_DEFINED
                USER_DEFINED -> Value.USER_DEFINED
                INTEGRATOR_DEFINED -> Value.INTEGRATOR_DEFINED
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
                HUBSPOT_DEFINED -> Known.HUBSPOT_DEFINED
                USER_DEFINED -> Known.USER_DEFINED
                INTEGRATOR_DEFINED -> Known.INTEGRATOR_DEFINED
                else -> throw HubspotInvalidDataException("Unknown AssociationCategory: $value")
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

        fun validate(): AssociationCategory = apply {
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

            return other is AssociationCategory && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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

            @JvmField val ASSOCIATION = of("ASSOCIATION")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            ASSOCIATION
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
            ASSOCIATION,
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
                ASSOCIATION -> Value.ASSOCIATION
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
                ASSOCIATION -> Known.ASSOCIATION
                else -> throw HubspotInvalidDataException("Unknown Type: $value")
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ApiAssociationDataSource &&
            associationCategory == other.associationCategory &&
            associationTypeId == other.associationTypeId &&
            name == other.name &&
            objectTypeId == other.objectTypeId &&
            type == other.type &&
            sortBy == other.sortBy &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            associationCategory,
            associationTypeId,
            name,
            objectTypeId,
            type,
            sortBy,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ApiAssociationDataSource{associationCategory=$associationCategory, associationTypeId=$associationTypeId, name=$name, objectTypeId=$objectTypeId, type=$type, sortBy=$sortBy, additionalProperties=$additionalProperties}"
}
