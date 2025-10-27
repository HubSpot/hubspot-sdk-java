// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.schemas

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import com.hubspot_sdk.api.models.ObjectTypeDefinitionLabels
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Defines attributes to update on an object type. */
class ObjectTypeDefinitionPatch
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val clearDescription: JsonField<Boolean>,
    private val description: JsonField<String>,
    private val labels: JsonField<ObjectTypeDefinitionLabels>,
    private val primaryDisplayProperty: JsonField<String>,
    private val requiredProperties: JsonField<List<String>>,
    private val restorable: JsonField<Boolean>,
    private val searchableProperties: JsonField<List<String>>,
    private val secondaryDisplayProperties: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("clearDescription")
        @ExcludeMissing
        clearDescription: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("labels")
        @ExcludeMissing
        labels: JsonField<ObjectTypeDefinitionLabels> = JsonMissing.of(),
        @JsonProperty("primaryDisplayProperty")
        @ExcludeMissing
        primaryDisplayProperty: JsonField<String> = JsonMissing.of(),
        @JsonProperty("requiredProperties")
        @ExcludeMissing
        requiredProperties: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("restorable")
        @ExcludeMissing
        restorable: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("searchableProperties")
        @ExcludeMissing
        searchableProperties: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("secondaryDisplayProperties")
        @ExcludeMissing
        secondaryDisplayProperties: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        clearDescription,
        description,
        labels,
        primaryDisplayProperty,
        requiredProperties,
        restorable,
        searchableProperties,
        secondaryDisplayProperties,
        mutableMapOf(),
    )

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clearDescription(): Optional<Boolean> = clearDescription.getOptional("clearDescription")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun labels(): Optional<ObjectTypeDefinitionLabels> = labels.getOptional("labels")

    /**
     * The name of the primary property for this object. This will be displayed as primary on the
     * HubSpot record page for this object type.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryDisplayProperty(): Optional<String> =
        primaryDisplayProperty.getOptional("primaryDisplayProperty")

    /**
     * The names of properties that should be **required** when creating an object of this type.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requiredProperties(): Optional<List<String>> =
        requiredProperties.getOptional("requiredProperties")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun restorable(): Optional<Boolean> = restorable.getOptional("restorable")

    /**
     * Names of properties that will be indexed for this object type in by HubSpot's product search.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun searchableProperties(): Optional<List<String>> =
        searchableProperties.getOptional("searchableProperties")

    /**
     * The names of secondary properties for this object. These will be displayed as secondary on
     * the HubSpot record page for this object type.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun secondaryDisplayProperties(): Optional<List<String>> =
        secondaryDisplayProperties.getOptional("secondaryDisplayProperties")

    /**
     * Returns the raw JSON value of [clearDescription].
     *
     * Unlike [clearDescription], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("clearDescription")
    @ExcludeMissing
    fun _clearDescription(): JsonField<Boolean> = clearDescription

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [labels].
     *
     * Unlike [labels], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("labels")
    @ExcludeMissing
    fun _labels(): JsonField<ObjectTypeDefinitionLabels> = labels

    /**
     * Returns the raw JSON value of [primaryDisplayProperty].
     *
     * Unlike [primaryDisplayProperty], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("primaryDisplayProperty")
    @ExcludeMissing
    fun _primaryDisplayProperty(): JsonField<String> = primaryDisplayProperty

    /**
     * Returns the raw JSON value of [requiredProperties].
     *
     * Unlike [requiredProperties], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("requiredProperties")
    @ExcludeMissing
    fun _requiredProperties(): JsonField<List<String>> = requiredProperties

    /**
     * Returns the raw JSON value of [restorable].
     *
     * Unlike [restorable], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("restorable") @ExcludeMissing fun _restorable(): JsonField<Boolean> = restorable

    /**
     * Returns the raw JSON value of [searchableProperties].
     *
     * Unlike [searchableProperties], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("searchableProperties")
    @ExcludeMissing
    fun _searchableProperties(): JsonField<List<String>> = searchableProperties

    /**
     * Returns the raw JSON value of [secondaryDisplayProperties].
     *
     * Unlike [secondaryDisplayProperties], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("secondaryDisplayProperties")
    @ExcludeMissing
    fun _secondaryDisplayProperties(): JsonField<List<String>> = secondaryDisplayProperties

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
         * Returns a mutable builder for constructing an instance of [ObjectTypeDefinitionPatch].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ObjectTypeDefinitionPatch]. */
    class Builder internal constructor() {

        private var clearDescription: JsonField<Boolean> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var labels: JsonField<ObjectTypeDefinitionLabels> = JsonMissing.of()
        private var primaryDisplayProperty: JsonField<String> = JsonMissing.of()
        private var requiredProperties: JsonField<MutableList<String>>? = null
        private var restorable: JsonField<Boolean> = JsonMissing.of()
        private var searchableProperties: JsonField<MutableList<String>>? = null
        private var secondaryDisplayProperties: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(objectTypeDefinitionPatch: ObjectTypeDefinitionPatch) = apply {
            clearDescription = objectTypeDefinitionPatch.clearDescription
            description = objectTypeDefinitionPatch.description
            labels = objectTypeDefinitionPatch.labels
            primaryDisplayProperty = objectTypeDefinitionPatch.primaryDisplayProperty
            requiredProperties =
                objectTypeDefinitionPatch.requiredProperties.map { it.toMutableList() }
            restorable = objectTypeDefinitionPatch.restorable
            searchableProperties =
                objectTypeDefinitionPatch.searchableProperties.map { it.toMutableList() }
            secondaryDisplayProperties =
                objectTypeDefinitionPatch.secondaryDisplayProperties.map { it.toMutableList() }
            additionalProperties = objectTypeDefinitionPatch.additionalProperties.toMutableMap()
        }

        fun clearDescription(clearDescription: Boolean) =
            clearDescription(JsonField.of(clearDescription))

        /**
         * Sets [Builder.clearDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clearDescription] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun clearDescription(clearDescription: JsonField<Boolean>) = apply {
            this.clearDescription = clearDescription
        }

        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun labels(labels: ObjectTypeDefinitionLabels) = labels(JsonField.of(labels))

        /**
         * Sets [Builder.labels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.labels] with a well-typed [ObjectTypeDefinitionLabels]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun labels(labels: JsonField<ObjectTypeDefinitionLabels>) = apply { this.labels = labels }

        /**
         * The name of the primary property for this object. This will be displayed as primary on
         * the HubSpot record page for this object type.
         */
        fun primaryDisplayProperty(primaryDisplayProperty: String) =
            primaryDisplayProperty(JsonField.of(primaryDisplayProperty))

        /**
         * Sets [Builder.primaryDisplayProperty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryDisplayProperty] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun primaryDisplayProperty(primaryDisplayProperty: JsonField<String>) = apply {
            this.primaryDisplayProperty = primaryDisplayProperty
        }

        /**
         * The names of properties that should be **required** when creating an object of this type.
         */
        fun requiredProperties(requiredProperties: List<String>) =
            requiredProperties(JsonField.of(requiredProperties))

        /**
         * Sets [Builder.requiredProperties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requiredProperties] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun requiredProperties(requiredProperties: JsonField<List<String>>) = apply {
            this.requiredProperties = requiredProperties.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [requiredProperties].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRequiredProperty(requiredProperty: String) = apply {
            requiredProperties =
                (requiredProperties ?: JsonField.of(mutableListOf())).also {
                    checkKnown("requiredProperties", it).add(requiredProperty)
                }
        }

        fun restorable(restorable: Boolean) = restorable(JsonField.of(restorable))

        /**
         * Sets [Builder.restorable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.restorable] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun restorable(restorable: JsonField<Boolean>) = apply { this.restorable = restorable }

        /**
         * Names of properties that will be indexed for this object type in by HubSpot's product
         * search.
         */
        fun searchableProperties(searchableProperties: List<String>) =
            searchableProperties(JsonField.of(searchableProperties))

        /**
         * Sets [Builder.searchableProperties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.searchableProperties] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun searchableProperties(searchableProperties: JsonField<List<String>>) = apply {
            this.searchableProperties = searchableProperties.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [searchableProperties].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSearchableProperty(searchableProperty: String) = apply {
            searchableProperties =
                (searchableProperties ?: JsonField.of(mutableListOf())).also {
                    checkKnown("searchableProperties", it).add(searchableProperty)
                }
        }

        /**
         * The names of secondary properties for this object. These will be displayed as secondary
         * on the HubSpot record page for this object type.
         */
        fun secondaryDisplayProperties(secondaryDisplayProperties: List<String>) =
            secondaryDisplayProperties(JsonField.of(secondaryDisplayProperties))

        /**
         * Sets [Builder.secondaryDisplayProperties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secondaryDisplayProperties] with a well-typed
         * `List<String>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun secondaryDisplayProperties(secondaryDisplayProperties: JsonField<List<String>>) =
            apply {
                this.secondaryDisplayProperties =
                    secondaryDisplayProperties.map { it.toMutableList() }
            }

        /**
         * Adds a single [String] to [secondaryDisplayProperties].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSecondaryDisplayProperty(secondaryDisplayProperty: String) = apply {
            secondaryDisplayProperties =
                (secondaryDisplayProperties ?: JsonField.of(mutableListOf())).also {
                    checkKnown("secondaryDisplayProperties", it).add(secondaryDisplayProperty)
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
         * Returns an immutable instance of [ObjectTypeDefinitionPatch].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ObjectTypeDefinitionPatch =
            ObjectTypeDefinitionPatch(
                clearDescription,
                description,
                labels,
                primaryDisplayProperty,
                (requiredProperties ?: JsonMissing.of()).map { it.toImmutable() },
                restorable,
                (searchableProperties ?: JsonMissing.of()).map { it.toImmutable() },
                (secondaryDisplayProperties ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ObjectTypeDefinitionPatch = apply {
        if (validated) {
            return@apply
        }

        clearDescription()
        description()
        labels().ifPresent { it.validate() }
        primaryDisplayProperty()
        requiredProperties()
        restorable()
        searchableProperties()
        secondaryDisplayProperties()
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
        (if (clearDescription.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (labels.asKnown().getOrNull()?.validity() ?: 0) +
            (if (primaryDisplayProperty.asKnown().isPresent) 1 else 0) +
            (requiredProperties.asKnown().getOrNull()?.size ?: 0) +
            (if (restorable.asKnown().isPresent) 1 else 0) +
            (searchableProperties.asKnown().getOrNull()?.size ?: 0) +
            (secondaryDisplayProperties.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ObjectTypeDefinitionPatch &&
            clearDescription == other.clearDescription &&
            description == other.description &&
            labels == other.labels &&
            primaryDisplayProperty == other.primaryDisplayProperty &&
            requiredProperties == other.requiredProperties &&
            restorable == other.restorable &&
            searchableProperties == other.searchableProperties &&
            secondaryDisplayProperties == other.secondaryDisplayProperties &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            clearDescription,
            description,
            labels,
            primaryDisplayProperty,
            requiredProperties,
            restorable,
            searchableProperties,
            secondaryDisplayProperties,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ObjectTypeDefinitionPatch{clearDescription=$clearDescription, description=$description, labels=$labels, primaryDisplayProperty=$primaryDisplayProperty, requiredProperties=$requiredProperties, restorable=$restorable, searchableProperties=$searchableProperties, secondaryDisplayProperties=$secondaryDisplayProperties, additionalProperties=$additionalProperties}"
}
