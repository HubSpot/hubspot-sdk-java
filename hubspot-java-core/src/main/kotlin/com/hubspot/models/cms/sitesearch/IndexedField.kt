// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.sitesearch

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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
import kotlin.jvm.optionals.getOrNull

class IndexedField
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val metadataField: JsonField<Boolean>,
    private val name: JsonField<String>,
    private val value: JsonValue,
    private val values: JsonField<List<JsonValue>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("metadataField")
        @ExcludeMissing
        metadataField: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing value: JsonValue = JsonMissing.of(),
        @JsonProperty("values")
        @ExcludeMissing
        values: JsonField<List<JsonValue>> = JsonMissing.of(),
    ) : this(metadataField, name, value, values, mutableMapOf())

    /**
     * Indicates whether the field is a metadata field.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metadataField(): Boolean = metadataField.getRequired("metadataField")

    /**
     * The name of the indexed field.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * The primary value of the indexed field.
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = indexedField.value().convert(MyClass.class);
     * ```
     */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonValue = value

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun values(): List<JsonValue> = values.getRequired("values")

    /**
     * Returns the raw JSON value of [metadataField].
     *
     * Unlike [metadataField], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadataField")
    @ExcludeMissing
    fun _metadataField(): JsonField<Boolean> = metadataField

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [values].
     *
     * Unlike [values], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("values") @ExcludeMissing fun _values(): JsonField<List<JsonValue>> = values

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
         * Returns a mutable builder for constructing an instance of [IndexedField].
         *
         * The following fields are required:
         * ```java
         * .metadataField()
         * .name()
         * .value()
         * .values()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IndexedField]. */
    class Builder internal constructor() {

        private var metadataField: JsonField<Boolean>? = null
        private var name: JsonField<String>? = null
        private var value: JsonValue? = null
        private var values: JsonField<MutableList<JsonValue>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(indexedField: IndexedField) = apply {
            metadataField = indexedField.metadataField
            name = indexedField.name
            value = indexedField.value
            values = indexedField.values.map { it.toMutableList() }
            additionalProperties = indexedField.additionalProperties.toMutableMap()
        }

        /** Indicates whether the field is a metadata field. */
        fun metadataField(metadataField: Boolean) = metadataField(JsonField.of(metadataField))

        /**
         * Sets [Builder.metadataField] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadataField] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun metadataField(metadataField: JsonField<Boolean>) = apply {
            this.metadataField = metadataField
        }

        /** The name of the indexed field. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The primary value of the indexed field. */
        fun value(value: JsonValue) = apply { this.value = value }

        fun values(values: List<JsonValue>) = values(JsonField.of(values))

        /**
         * Sets [Builder.values] to an arbitrary JSON value.
         *
         * You should usually call [Builder.values] with a well-typed `List<JsonValue>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun values(values: JsonField<List<JsonValue>>) = apply {
            this.values = values.map { it.toMutableList() }
        }

        /**
         * Adds a single [JsonValue] to [values].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addValue(value: JsonValue) = apply {
            values =
                (values ?: JsonField.of(mutableListOf())).also {
                    checkKnown("values", it).add(value)
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
         * Returns an immutable instance of [IndexedField].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .metadataField()
         * .name()
         * .value()
         * .values()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IndexedField =
            IndexedField(
                checkRequired("metadataField", metadataField),
                checkRequired("name", name),
                checkRequired("value", value),
                checkRequired("values", values).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): IndexedField = apply {
        if (validated) {
            return@apply
        }

        metadataField()
        name()
        values()
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
        (if (metadataField.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (values.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IndexedField &&
            metadataField == other.metadataField &&
            name == other.name &&
            value == other.value &&
            values == other.values &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(metadataField, name, value, values, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IndexedField{metadataField=$metadataField, name=$name, value=$value, values=$values, additionalProperties=$additionalProperties}"
}
