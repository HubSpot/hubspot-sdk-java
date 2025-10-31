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
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import com.hubspot_sdk.api.models.ObjectTypeDefinitionLabels
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Defines a new object type, its properties, and associations. */
class ObjectSchemaEgg
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val associatedObjects: JsonField<List<String>>,
    private val labels: JsonField<ObjectTypeDefinitionLabels>,
    private val name: JsonField<String>,
    private val properties: JsonField<List<ObjectTypePropertyCreate>>,
    private val requiredProperties: JsonField<List<String>>,
    private val description: JsonField<String>,
    private val primaryDisplayProperty: JsonField<String>,
    private val searchableProperties: JsonField<List<String>>,
    private val secondaryDisplayProperties: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("associatedObjects")
        @ExcludeMissing
        associatedObjects: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("labels")
        @ExcludeMissing
        labels: JsonField<ObjectTypeDefinitionLabels> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("properties")
        @ExcludeMissing
        properties: JsonField<List<ObjectTypePropertyCreate>> = JsonMissing.of(),
        @JsonProperty("requiredProperties")
        @ExcludeMissing
        requiredProperties: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("primaryDisplayProperty")
        @ExcludeMissing
        primaryDisplayProperty: JsonField<String> = JsonMissing.of(),
        @JsonProperty("searchableProperties")
        @ExcludeMissing
        searchableProperties: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("secondaryDisplayProperties")
        @ExcludeMissing
        secondaryDisplayProperties: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        associatedObjects,
        labels,
        name,
        properties,
        requiredProperties,
        description,
        primaryDisplayProperty,
        searchableProperties,
        secondaryDisplayProperties,
        mutableMapOf(),
    )

    /**
     * Associations defined for this object type.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun associatedObjects(): List<String> = associatedObjects.getRequired("associatedObjects")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun labels(): ObjectTypeDefinitionLabels = labels.getRequired("labels")

    /**
     * A unique name for this object. For internal use only.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Properties defined for this object type.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun properties(): List<ObjectTypePropertyCreate> = properties.getRequired("properties")

    /**
     * The names of properties that should be **required** when creating an object of this type.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun requiredProperties(): List<String> = requiredProperties.getRequired("requiredProperties")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * The name of the primary property for this object. This will be displayed as primary on the
     * HubSpot record page for this object type.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryDisplayProperty(): Optional<String> =
        primaryDisplayProperty.getOptional("primaryDisplayProperty")

    /**
     * Names of properties that will be indexed for this object type in by HubSpot's product search.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun searchableProperties(): Optional<List<String>> =
        searchableProperties.getOptional("searchableProperties")

    /**
     * The names of secondary properties for this object. These will be displayed as secondary on
     * the HubSpot record page for this object type.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun secondaryDisplayProperties(): Optional<List<String>> =
        secondaryDisplayProperties.getOptional("secondaryDisplayProperties")

    /**
     * Returns the raw JSON value of [associatedObjects].
     *
     * Unlike [associatedObjects], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("associatedObjects")
    @ExcludeMissing
    fun _associatedObjects(): JsonField<List<String>> = associatedObjects

    /**
     * Returns the raw JSON value of [labels].
     *
     * Unlike [labels], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("labels")
    @ExcludeMissing
    fun _labels(): JsonField<ObjectTypeDefinitionLabels> = labels

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [properties].
     *
     * Unlike [properties], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("properties")
    @ExcludeMissing
    fun _properties(): JsonField<List<ObjectTypePropertyCreate>> = properties

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
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

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
         * Returns a mutable builder for constructing an instance of [ObjectSchemaEgg].
         *
         * The following fields are required:
         * ```java
         * .associatedObjects()
         * .labels()
         * .name()
         * .properties()
         * .requiredProperties()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ObjectSchemaEgg]. */
    class Builder internal constructor() {

        private var associatedObjects: JsonField<MutableList<String>>? = null
        private var labels: JsonField<ObjectTypeDefinitionLabels>? = null
        private var name: JsonField<String>? = null
        private var properties: JsonField<MutableList<ObjectTypePropertyCreate>>? = null
        private var requiredProperties: JsonField<MutableList<String>>? = null
        private var description: JsonField<String> = JsonMissing.of()
        private var primaryDisplayProperty: JsonField<String> = JsonMissing.of()
        private var searchableProperties: JsonField<MutableList<String>>? = null
        private var secondaryDisplayProperties: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(objectSchemaEgg: ObjectSchemaEgg) = apply {
            associatedObjects = objectSchemaEgg.associatedObjects.map { it.toMutableList() }
            labels = objectSchemaEgg.labels
            name = objectSchemaEgg.name
            properties = objectSchemaEgg.properties.map { it.toMutableList() }
            requiredProperties = objectSchemaEgg.requiredProperties.map { it.toMutableList() }
            description = objectSchemaEgg.description
            primaryDisplayProperty = objectSchemaEgg.primaryDisplayProperty
            searchableProperties = objectSchemaEgg.searchableProperties.map { it.toMutableList() }
            secondaryDisplayProperties =
                objectSchemaEgg.secondaryDisplayProperties.map { it.toMutableList() }
            additionalProperties = objectSchemaEgg.additionalProperties.toMutableMap()
        }

        /** Associations defined for this object type. */
        fun associatedObjects(associatedObjects: List<String>) =
            associatedObjects(JsonField.of(associatedObjects))

        /**
         * Sets [Builder.associatedObjects] to an arbitrary JSON value.
         *
         * You should usually call [Builder.associatedObjects] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun associatedObjects(associatedObjects: JsonField<List<String>>) = apply {
            this.associatedObjects = associatedObjects.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [associatedObjects].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAssociatedObject(associatedObject: String) = apply {
            associatedObjects =
                (associatedObjects ?: JsonField.of(mutableListOf())).also {
                    checkKnown("associatedObjects", it).add(associatedObject)
                }
        }

        fun labels(labels: ObjectTypeDefinitionLabels) = labels(JsonField.of(labels))

        /**
         * Sets [Builder.labels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.labels] with a well-typed [ObjectTypeDefinitionLabels]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun labels(labels: JsonField<ObjectTypeDefinitionLabels>) = apply { this.labels = labels }

        /** A unique name for this object. For internal use only. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Properties defined for this object type. */
        fun properties(properties: List<ObjectTypePropertyCreate>) =
            properties(JsonField.of(properties))

        /**
         * Sets [Builder.properties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.properties] with a well-typed
         * `List<ObjectTypePropertyCreate>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun properties(properties: JsonField<List<ObjectTypePropertyCreate>>) = apply {
            this.properties = properties.map { it.toMutableList() }
        }

        /**
         * Adds a single [ObjectTypePropertyCreate] to [properties].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProperty(property: ObjectTypePropertyCreate) = apply {
            properties =
                (properties ?: JsonField.of(mutableListOf())).also {
                    checkKnown("properties", it).add(property)
                }
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

        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

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
         * Returns an immutable instance of [ObjectSchemaEgg].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .associatedObjects()
         * .labels()
         * .name()
         * .properties()
         * .requiredProperties()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ObjectSchemaEgg =
            ObjectSchemaEgg(
                checkRequired("associatedObjects", associatedObjects).map { it.toImmutable() },
                checkRequired("labels", labels),
                checkRequired("name", name),
                checkRequired("properties", properties).map { it.toImmutable() },
                checkRequired("requiredProperties", requiredProperties).map { it.toImmutable() },
                description,
                primaryDisplayProperty,
                (searchableProperties ?: JsonMissing.of()).map { it.toImmutable() },
                (secondaryDisplayProperties ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ObjectSchemaEgg = apply {
        if (validated) {
            return@apply
        }

        associatedObjects()
        labels().validate()
        name()
        properties().forEach { it.validate() }
        requiredProperties()
        description()
        primaryDisplayProperty()
        searchableProperties()
        secondaryDisplayProperties()
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
        (associatedObjects.asKnown().getOrNull()?.size ?: 0) +
            (labels.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (properties.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (requiredProperties.asKnown().getOrNull()?.size ?: 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (primaryDisplayProperty.asKnown().isPresent) 1 else 0) +
            (searchableProperties.asKnown().getOrNull()?.size ?: 0) +
            (secondaryDisplayProperties.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ObjectSchemaEgg &&
            associatedObjects == other.associatedObjects &&
            labels == other.labels &&
            name == other.name &&
            properties == other.properties &&
            requiredProperties == other.requiredProperties &&
            description == other.description &&
            primaryDisplayProperty == other.primaryDisplayProperty &&
            searchableProperties == other.searchableProperties &&
            secondaryDisplayProperties == other.secondaryDisplayProperties &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            associatedObjects,
            labels,
            name,
            properties,
            requiredProperties,
            description,
            primaryDisplayProperty,
            searchableProperties,
            secondaryDisplayProperties,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ObjectSchemaEgg{associatedObjects=$associatedObjects, labels=$labels, name=$name, properties=$properties, requiredProperties=$requiredProperties, description=$description, primaryDisplayProperty=$primaryDisplayProperty, searchableProperties=$searchableProperties, secondaryDisplayProperties=$secondaryDisplayProperties, additionalProperties=$additionalProperties}"
}
