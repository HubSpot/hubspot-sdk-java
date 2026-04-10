// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Specifies the input for reading a batch of CRM objects, including arrays of object IDs, requested
 * property names (with optional history), and an optional unique identifying property.
 */
class BatchReadInputSimplePublicObjectId
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val inputs: JsonField<List<SimplePublicObjectId>>,
    private val properties: JsonField<List<String>>,
    private val propertiesWithHistory: JsonField<List<String>>,
    private val idProperty: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("inputs")
        @ExcludeMissing
        inputs: JsonField<List<SimplePublicObjectId>> = JsonMissing.of(),
        @JsonProperty("properties")
        @ExcludeMissing
        properties: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("propertiesWithHistory")
        @ExcludeMissing
        propertiesWithHistory: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("idProperty") @ExcludeMissing idProperty: JsonField<String> = JsonMissing.of(),
    ) : this(inputs, properties, propertiesWithHistory, idProperty, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inputs(): List<SimplePublicObjectId> = inputs.getRequired("inputs")

    /**
     * Key-value pairs for setting properties for the new object.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun properties(): List<String> = properties.getRequired("properties")

    /**
     * Key-value pairs for setting properties for the new object and their histories.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun propertiesWithHistory(): List<String> =
        propertiesWithHistory.getRequired("propertiesWithHistory")

    /**
     * When using a custom unique value property to retrieve records, the name of the property. Do
     * not include this parameter if retrieving by record ID.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun idProperty(): Optional<String> = idProperty.getOptional("idProperty")

    /**
     * Returns the raw JSON value of [inputs].
     *
     * Unlike [inputs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inputs")
    @ExcludeMissing
    fun _inputs(): JsonField<List<SimplePublicObjectId>> = inputs

    /**
     * Returns the raw JSON value of [properties].
     *
     * Unlike [properties], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("properties")
    @ExcludeMissing
    fun _properties(): JsonField<List<String>> = properties

    /**
     * Returns the raw JSON value of [propertiesWithHistory].
     *
     * Unlike [propertiesWithHistory], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("propertiesWithHistory")
    @ExcludeMissing
    fun _propertiesWithHistory(): JsonField<List<String>> = propertiesWithHistory

    /**
     * Returns the raw JSON value of [idProperty].
     *
     * Unlike [idProperty], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idProperty") @ExcludeMissing fun _idProperty(): JsonField<String> = idProperty

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
         * [BatchReadInputSimplePublicObjectId].
         *
         * The following fields are required:
         * ```java
         * .inputs()
         * .properties()
         * .propertiesWithHistory()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BatchReadInputSimplePublicObjectId]. */
    class Builder internal constructor() {

        private var inputs: JsonField<MutableList<SimplePublicObjectId>>? = null
        private var properties: JsonField<MutableList<String>>? = null
        private var propertiesWithHistory: JsonField<MutableList<String>>? = null
        private var idProperty: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(batchReadInputSimplePublicObjectId: BatchReadInputSimplePublicObjectId) =
            apply {
                inputs = batchReadInputSimplePublicObjectId.inputs.map { it.toMutableList() }
                properties =
                    batchReadInputSimplePublicObjectId.properties.map { it.toMutableList() }
                propertiesWithHistory =
                    batchReadInputSimplePublicObjectId.propertiesWithHistory.map {
                        it.toMutableList()
                    }
                idProperty = batchReadInputSimplePublicObjectId.idProperty
                additionalProperties =
                    batchReadInputSimplePublicObjectId.additionalProperties.toMutableMap()
            }

        fun inputs(inputs: List<SimplePublicObjectId>) = inputs(JsonField.of(inputs))

        /**
         * Sets [Builder.inputs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inputs] with a well-typed `List<SimplePublicObjectId>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun inputs(inputs: JsonField<List<SimplePublicObjectId>>) = apply {
            this.inputs = inputs.map { it.toMutableList() }
        }

        /**
         * Adds a single [SimplePublicObjectId] to [inputs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInput(input: SimplePublicObjectId) = apply {
            inputs =
                (inputs ?: JsonField.of(mutableListOf())).also {
                    checkKnown("inputs", it).add(input)
                }
        }

        /** Key-value pairs for setting properties for the new object. */
        fun properties(properties: List<String>) = properties(JsonField.of(properties))

        /**
         * Sets [Builder.properties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.properties] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun properties(properties: JsonField<List<String>>) = apply {
            this.properties = properties.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [properties].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProperty(property: String) = apply {
            properties =
                (properties ?: JsonField.of(mutableListOf())).also {
                    checkKnown("properties", it).add(property)
                }
        }

        /** Key-value pairs for setting properties for the new object and their histories. */
        fun propertiesWithHistory(propertiesWithHistory: List<String>) =
            propertiesWithHistory(JsonField.of(propertiesWithHistory))

        /**
         * Sets [Builder.propertiesWithHistory] to an arbitrary JSON value.
         *
         * You should usually call [Builder.propertiesWithHistory] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun propertiesWithHistory(propertiesWithHistory: JsonField<List<String>>) = apply {
            this.propertiesWithHistory = propertiesWithHistory.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.propertiesWithHistory].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPropertiesWithHistory(propertiesWithHistory: String) = apply {
            this.propertiesWithHistory =
                (this.propertiesWithHistory ?: JsonField.of(mutableListOf())).also {
                    checkKnown("propertiesWithHistory", it).add(propertiesWithHistory)
                }
        }

        /**
         * When using a custom unique value property to retrieve records, the name of the property.
         * Do not include this parameter if retrieving by record ID.
         */
        fun idProperty(idProperty: String) = idProperty(JsonField.of(idProperty))

        /**
         * Sets [Builder.idProperty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idProperty] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idProperty(idProperty: JsonField<String>) = apply { this.idProperty = idProperty }

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
         * Returns an immutable instance of [BatchReadInputSimplePublicObjectId].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .inputs()
         * .properties()
         * .propertiesWithHistory()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BatchReadInputSimplePublicObjectId =
            BatchReadInputSimplePublicObjectId(
                checkRequired("inputs", inputs).map { it.toImmutable() },
                checkRequired("properties", properties).map { it.toImmutable() },
                checkRequired("propertiesWithHistory", propertiesWithHistory).map {
                    it.toImmutable()
                },
                idProperty,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BatchReadInputSimplePublicObjectId = apply {
        if (validated) {
            return@apply
        }

        inputs().forEach { it.validate() }
        properties()
        propertiesWithHistory()
        idProperty()
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
        (inputs.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (properties.asKnown().getOrNull()?.size ?: 0) +
            (propertiesWithHistory.asKnown().getOrNull()?.size ?: 0) +
            (if (idProperty.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BatchReadInputSimplePublicObjectId &&
            inputs == other.inputs &&
            properties == other.properties &&
            propertiesWithHistory == other.propertiesWithHistory &&
            idProperty == other.idProperty &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(inputs, properties, propertiesWithHistory, idProperty, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BatchReadInputSimplePublicObjectId{inputs=$inputs, properties=$properties, propertiesWithHistory=$propertiesWithHistory, idProperty=$idProperty, additionalProperties=$additionalProperties}"
}
