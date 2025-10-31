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

class ApiDatasetFieldPropertyFilterDataSource
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val datasetFieldName: JsonField<String>,
    private val name: JsonField<String>,
    private val propertyName: JsonField<String>,
    private val type: JsonField<Type>,
    private val sortBy: JsonField<ApiSort>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("datasetFieldName")
        @ExcludeMissing
        datasetFieldName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("propertyName")
        @ExcludeMissing
        propertyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("sortBy") @ExcludeMissing sortBy: JsonField<ApiSort> = JsonMissing.of(),
    ) : this(datasetFieldName, name, propertyName, type, sortBy, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun datasetFieldName(): String = datasetFieldName.getRequired("datasetFieldName")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun propertyName(): String = propertyName.getRequired("propertyName")

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
     * Returns the raw JSON value of [datasetFieldName].
     *
     * Unlike [datasetFieldName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("datasetFieldName")
    @ExcludeMissing
    fun _datasetFieldName(): JsonField<String> = datasetFieldName

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
         * [ApiDatasetFieldPropertyFilterDataSource].
         *
         * The following fields are required:
         * ```java
         * .datasetFieldName()
         * .name()
         * .propertyName()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ApiDatasetFieldPropertyFilterDataSource]. */
    class Builder internal constructor() {

        private var datasetFieldName: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var propertyName: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var sortBy: JsonField<ApiSort> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            apiDatasetFieldPropertyFilterDataSource: ApiDatasetFieldPropertyFilterDataSource
        ) = apply {
            datasetFieldName = apiDatasetFieldPropertyFilterDataSource.datasetFieldName
            name = apiDatasetFieldPropertyFilterDataSource.name
            propertyName = apiDatasetFieldPropertyFilterDataSource.propertyName
            type = apiDatasetFieldPropertyFilterDataSource.type
            sortBy = apiDatasetFieldPropertyFilterDataSource.sortBy
            additionalProperties =
                apiDatasetFieldPropertyFilterDataSource.additionalProperties.toMutableMap()
        }

        fun datasetFieldName(datasetFieldName: String) =
            datasetFieldName(JsonField.of(datasetFieldName))

        /**
         * Sets [Builder.datasetFieldName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.datasetFieldName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun datasetFieldName(datasetFieldName: JsonField<String>) = apply {
            this.datasetFieldName = datasetFieldName
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
         * Returns an immutable instance of [ApiDatasetFieldPropertyFilterDataSource].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .datasetFieldName()
         * .name()
         * .propertyName()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ApiDatasetFieldPropertyFilterDataSource =
            ApiDatasetFieldPropertyFilterDataSource(
                checkRequired("datasetFieldName", datasetFieldName),
                checkRequired("name", name),
                checkRequired("propertyName", propertyName),
                checkRequired("type", type),
                sortBy,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ApiDatasetFieldPropertyFilterDataSource = apply {
        if (validated) {
            return@apply
        }

        datasetFieldName()
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
        (if (datasetFieldName.asKnown().isPresent) 1 else 0) +
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

            @JvmField val DATASET_FIELD_PROPERTY_FILTER = of("DATASET_FIELD_PROPERTY_FILTER")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            DATASET_FIELD_PROPERTY_FILTER
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
            DATASET_FIELD_PROPERTY_FILTER,
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
                DATASET_FIELD_PROPERTY_FILTER -> Value.DATASET_FIELD_PROPERTY_FILTER
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
                DATASET_FIELD_PROPERTY_FILTER -> Known.DATASET_FIELD_PROPERTY_FILTER
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

        return other is ApiDatasetFieldPropertyFilterDataSource &&
            datasetFieldName == other.datasetFieldName &&
            name == other.name &&
            propertyName == other.propertyName &&
            type == other.type &&
            sortBy == other.sortBy &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(datasetFieldName, name, propertyName, type, sortBy, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ApiDatasetFieldPropertyFilterDataSource{datasetFieldName=$datasetFieldName, name=$name, propertyName=$propertyName, type=$type, sortBy=$sortBy, additionalProperties=$additionalProperties}"
}
