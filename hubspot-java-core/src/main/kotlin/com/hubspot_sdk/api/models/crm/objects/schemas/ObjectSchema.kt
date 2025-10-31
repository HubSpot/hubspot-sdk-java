// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.schemas

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.Enum
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import com.hubspot_sdk.api.models.ObjectTypeDefinitionLabels
import com.hubspot_sdk.api.models.Property
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Defines an object schema, including its properties and associations. */
class ObjectSchema
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val associations: JsonField<List<Association>>,
    private val labels: JsonField<ObjectTypeDefinitionLabels>,
    private val name: JsonField<String>,
    private val properties: JsonField<List<Property>>,
    private val requiredProperties: JsonField<List<String>>,
    private val archived: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdByUserId: JsonField<Int>,
    private val description: JsonField<String>,
    private val fullyQualifiedName: JsonField<String>,
    private val objectTypeId: JsonField<String>,
    private val primaryDisplayProperty: JsonField<String>,
    private val searchableProperties: JsonField<List<String>>,
    private val secondaryDisplayProperties: JsonField<List<String>>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val updatedByUserId: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("associations")
        @ExcludeMissing
        associations: JsonField<List<Association>> = JsonMissing.of(),
        @JsonProperty("labels")
        @ExcludeMissing
        labels: JsonField<ObjectTypeDefinitionLabels> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("properties")
        @ExcludeMissing
        properties: JsonField<List<Property>> = JsonMissing.of(),
        @JsonProperty("requiredProperties")
        @ExcludeMissing
        requiredProperties: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("archived") @ExcludeMissing archived: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdByUserId")
        @ExcludeMissing
        createdByUserId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fullyQualifiedName")
        @ExcludeMissing
        fullyQualifiedName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("objectTypeId")
        @ExcludeMissing
        objectTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("primaryDisplayProperty")
        @ExcludeMissing
        primaryDisplayProperty: JsonField<String> = JsonMissing.of(),
        @JsonProperty("searchableProperties")
        @ExcludeMissing
        searchableProperties: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("secondaryDisplayProperties")
        @ExcludeMissing
        secondaryDisplayProperties: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedByUserId")
        @ExcludeMissing
        updatedByUserId: JsonField<Int> = JsonMissing.of(),
    ) : this(
        id,
        associations,
        labels,
        name,
        properties,
        requiredProperties,
        archived,
        createdAt,
        createdByUserId,
        description,
        fullyQualifiedName,
        objectTypeId,
        primaryDisplayProperty,
        searchableProperties,
        secondaryDisplayProperties,
        updatedAt,
        updatedByUserId,
        mutableMapOf(),
    )

    /**
     * A unique ID for this schema's object type. Will be defined as {meta-type}-{unique ID}.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Associations defined for a given object type.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun associations(): List<Association> = associations.getRequired("associations")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun labels(): ObjectTypeDefinitionLabels = labels.getRequired("labels")

    /**
     * A unique name for the schema's object type.
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
    fun properties(): List<Property> = properties.getRequired("properties")

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
    fun archived(): Optional<Boolean> = archived.getOptional("archived")

    /**
     * When the object schema was created.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdByUserId(): Optional<Int> = createdByUserId.getOptional("createdByUserId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * An assigned unique ID for the object, including portal ID and object name.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fullyQualifiedName(): Optional<String> =
        fullyQualifiedName.getOptional("fullyQualifiedName")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun objectTypeId(): Optional<String> = objectTypeId.getOptional("objectTypeId")

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
     * When the object schema was last updated.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedByUserId(): Optional<Int> = updatedByUserId.getOptional("updatedByUserId")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [associations].
     *
     * Unlike [associations], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("associations")
    @ExcludeMissing
    fun _associations(): JsonField<List<Association>> = associations

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
    fun _properties(): JsonField<List<Property>> = properties

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
     * Returns the raw JSON value of [archived].
     *
     * Unlike [archived], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("archived") @ExcludeMissing fun _archived(): JsonField<Boolean> = archived

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [createdByUserId].
     *
     * Unlike [createdByUserId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdByUserId")
    @ExcludeMissing
    fun _createdByUserId(): JsonField<Int> = createdByUserId

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [fullyQualifiedName].
     *
     * Unlike [fullyQualifiedName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("fullyQualifiedName")
    @ExcludeMissing
    fun _fullyQualifiedName(): JsonField<String> = fullyQualifiedName

    /**
     * Returns the raw JSON value of [objectTypeId].
     *
     * Unlike [objectTypeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectTypeId")
    @ExcludeMissing
    fun _objectTypeId(): JsonField<String> = objectTypeId

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

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [updatedByUserId].
     *
     * Unlike [updatedByUserId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedByUserId")
    @ExcludeMissing
    fun _updatedByUserId(): JsonField<Int> = updatedByUserId

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
         * Returns a mutable builder for constructing an instance of [ObjectSchema].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .associations()
         * .labels()
         * .name()
         * .properties()
         * .requiredProperties()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ObjectSchema]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var associations: JsonField<MutableList<Association>>? = null
        private var labels: JsonField<ObjectTypeDefinitionLabels>? = null
        private var name: JsonField<String>? = null
        private var properties: JsonField<MutableList<Property>>? = null
        private var requiredProperties: JsonField<MutableList<String>>? = null
        private var archived: JsonField<Boolean> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdByUserId: JsonField<Int> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var fullyQualifiedName: JsonField<String> = JsonMissing.of()
        private var objectTypeId: JsonField<String> = JsonMissing.of()
        private var primaryDisplayProperty: JsonField<String> = JsonMissing.of()
        private var searchableProperties: JsonField<MutableList<String>>? = null
        private var secondaryDisplayProperties: JsonField<MutableList<String>>? = null
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedByUserId: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(objectSchema: ObjectSchema) = apply {
            id = objectSchema.id
            associations = objectSchema.associations.map { it.toMutableList() }
            labels = objectSchema.labels
            name = objectSchema.name
            properties = objectSchema.properties.map { it.toMutableList() }
            requiredProperties = objectSchema.requiredProperties.map { it.toMutableList() }
            archived = objectSchema.archived
            createdAt = objectSchema.createdAt
            createdByUserId = objectSchema.createdByUserId
            description = objectSchema.description
            fullyQualifiedName = objectSchema.fullyQualifiedName
            objectTypeId = objectSchema.objectTypeId
            primaryDisplayProperty = objectSchema.primaryDisplayProperty
            searchableProperties = objectSchema.searchableProperties.map { it.toMutableList() }
            secondaryDisplayProperties =
                objectSchema.secondaryDisplayProperties.map { it.toMutableList() }
            updatedAt = objectSchema.updatedAt
            updatedByUserId = objectSchema.updatedByUserId
            additionalProperties = objectSchema.additionalProperties.toMutableMap()
        }

        /**
         * A unique ID for this schema's object type. Will be defined as {meta-type}-{unique ID}.
         */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Associations defined for a given object type. */
        fun associations(associations: List<Association>) = associations(JsonField.of(associations))

        /**
         * Sets [Builder.associations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.associations] with a well-typed `List<Association>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun associations(associations: JsonField<List<Association>>) = apply {
            this.associations = associations.map { it.toMutableList() }
        }

        /**
         * Adds a single [Association] to [associations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAssociation(association: Association) = apply {
            associations =
                (associations ?: JsonField.of(mutableListOf())).also {
                    checkKnown("associations", it).add(association)
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

        /** A unique name for the schema's object type. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Properties defined for this object type. */
        fun properties(properties: List<Property>) = properties(JsonField.of(properties))

        /**
         * Sets [Builder.properties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.properties] with a well-typed `List<Property>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun properties(properties: JsonField<List<Property>>) = apply {
            this.properties = properties.map { it.toMutableList() }
        }

        /**
         * Adds a single [Property] to [properties].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProperty(property: Property) = apply {
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

        fun archived(archived: Boolean) = archived(JsonField.of(archived))

        /**
         * Sets [Builder.archived] to an arbitrary JSON value.
         *
         * You should usually call [Builder.archived] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun archived(archived: JsonField<Boolean>) = apply { this.archived = archived }

        /** When the object schema was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun createdByUserId(createdByUserId: Int) = createdByUserId(JsonField.of(createdByUserId))

        /**
         * Sets [Builder.createdByUserId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdByUserId] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdByUserId(createdByUserId: JsonField<Int>) = apply {
            this.createdByUserId = createdByUserId
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

        /** An assigned unique ID for the object, including portal ID and object name. */
        fun fullyQualifiedName(fullyQualifiedName: String) =
            fullyQualifiedName(JsonField.of(fullyQualifiedName))

        /**
         * Sets [Builder.fullyQualifiedName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fullyQualifiedName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fullyQualifiedName(fullyQualifiedName: JsonField<String>) = apply {
            this.fullyQualifiedName = fullyQualifiedName
        }

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

        /** When the object schema was last updated. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun updatedByUserId(updatedByUserId: Int) = updatedByUserId(JsonField.of(updatedByUserId))

        /**
         * Sets [Builder.updatedByUserId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedByUserId] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedByUserId(updatedByUserId: JsonField<Int>) = apply {
            this.updatedByUserId = updatedByUserId
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
         * Returns an immutable instance of [ObjectSchema].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .associations()
         * .labels()
         * .name()
         * .properties()
         * .requiredProperties()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ObjectSchema =
            ObjectSchema(
                checkRequired("id", id),
                checkRequired("associations", associations).map { it.toImmutable() },
                checkRequired("labels", labels),
                checkRequired("name", name),
                checkRequired("properties", properties).map { it.toImmutable() },
                checkRequired("requiredProperties", requiredProperties).map { it.toImmutable() },
                archived,
                createdAt,
                createdByUserId,
                description,
                fullyQualifiedName,
                objectTypeId,
                primaryDisplayProperty,
                (searchableProperties ?: JsonMissing.of()).map { it.toImmutable() },
                (secondaryDisplayProperties ?: JsonMissing.of()).map { it.toImmutable() },
                updatedAt,
                updatedByUserId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ObjectSchema = apply {
        if (validated) {
            return@apply
        }

        id()
        associations().forEach { it.validate() }
        labels().validate()
        name()
        properties().forEach { it.validate() }
        requiredProperties()
        archived()
        createdAt()
        createdByUserId()
        description()
        fullyQualifiedName()
        objectTypeId()
        primaryDisplayProperty()
        searchableProperties()
        secondaryDisplayProperties()
        updatedAt()
        updatedByUserId()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (associations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (labels.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (properties.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (requiredProperties.asKnown().getOrNull()?.size ?: 0) +
            (if (archived.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdByUserId.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (fullyQualifiedName.asKnown().isPresent) 1 else 0) +
            (if (objectTypeId.asKnown().isPresent) 1 else 0) +
            (if (primaryDisplayProperty.asKnown().isPresent) 1 else 0) +
            (searchableProperties.asKnown().getOrNull()?.size ?: 0) +
            (secondaryDisplayProperties.asKnown().getOrNull()?.size ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedByUserId.asKnown().isPresent) 1 else 0)

    /** The definition of an association */
    class Association
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<Int>,
        private val allowsCustomLabels: JsonField<Boolean>,
        private val cardinality: JsonField<Cardinality>,
        private val category: JsonField<Category>,
        private val fromObjectTypeId: JsonField<String>,
        private val hasAllAssociatedObjects: JsonField<Boolean>,
        private val hasCascadingDeletes: JsonField<Boolean>,
        private val hasUserEnforcedMaxFromObjectIds: JsonField<Boolean>,
        private val hasUserEnforcedMaxToObjectIds: JsonField<Boolean>,
        private val hidden: JsonField<Boolean>,
        private val inverseAllowsCustomLabels: JsonField<Boolean>,
        private val inverseCardinality: JsonField<InverseCardinality>,
        private val inverseHasAllAssociatedObjects: JsonField<Boolean>,
        private val inverseId: JsonField<Int>,
        private val inverseName: JsonField<String>,
        private val isInversePrimary: JsonField<Boolean>,
        private val isPrimary: JsonField<Boolean>,
        private val maxFromObjectIds: JsonField<Int>,
        private val maxToObjectIds: JsonField<Int>,
        private val name: JsonField<String>,
        private val portalUniqueIdentifier: JsonField<String>,
        private val toObjectTypeId: JsonField<String>,
        private val fromObjectType: JsonField<FromObjectType>,
        private val inverseLabel: JsonField<String>,
        private val label: JsonField<String>,
        private val toObjectType: JsonField<ToObjectType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("allowsCustomLabels")
            @ExcludeMissing
            allowsCustomLabels: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("cardinality")
            @ExcludeMissing
            cardinality: JsonField<Cardinality> = JsonMissing.of(),
            @JsonProperty("category")
            @ExcludeMissing
            category: JsonField<Category> = JsonMissing.of(),
            @JsonProperty("fromObjectTypeId")
            @ExcludeMissing
            fromObjectTypeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("hasAllAssociatedObjects")
            @ExcludeMissing
            hasAllAssociatedObjects: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("hasCascadingDeletes")
            @ExcludeMissing
            hasCascadingDeletes: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("hasUserEnforcedMaxFromObjectIds")
            @ExcludeMissing
            hasUserEnforcedMaxFromObjectIds: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("hasUserEnforcedMaxToObjectIds")
            @ExcludeMissing
            hasUserEnforcedMaxToObjectIds: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("hidden") @ExcludeMissing hidden: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("inverseAllowsCustomLabels")
            @ExcludeMissing
            inverseAllowsCustomLabels: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("inverseCardinality")
            @ExcludeMissing
            inverseCardinality: JsonField<InverseCardinality> = JsonMissing.of(),
            @JsonProperty("inverseHasAllAssociatedObjects")
            @ExcludeMissing
            inverseHasAllAssociatedObjects: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("inverseId") @ExcludeMissing inverseId: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("inverseName")
            @ExcludeMissing
            inverseName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("isInversePrimary")
            @ExcludeMissing
            isInversePrimary: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("isPrimary")
            @ExcludeMissing
            isPrimary: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("maxFromObjectIds")
            @ExcludeMissing
            maxFromObjectIds: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("maxToObjectIds")
            @ExcludeMissing
            maxToObjectIds: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("portalUniqueIdentifier")
            @ExcludeMissing
            portalUniqueIdentifier: JsonField<String> = JsonMissing.of(),
            @JsonProperty("toObjectTypeId")
            @ExcludeMissing
            toObjectTypeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("fromObjectType")
            @ExcludeMissing
            fromObjectType: JsonField<FromObjectType> = JsonMissing.of(),
            @JsonProperty("inverseLabel")
            @ExcludeMissing
            inverseLabel: JsonField<String> = JsonMissing.of(),
            @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
            @JsonProperty("toObjectType")
            @ExcludeMissing
            toObjectType: JsonField<ToObjectType> = JsonMissing.of(),
        ) : this(
            id,
            allowsCustomLabels,
            cardinality,
            category,
            fromObjectTypeId,
            hasAllAssociatedObjects,
            hasCascadingDeletes,
            hasUserEnforcedMaxFromObjectIds,
            hasUserEnforcedMaxToObjectIds,
            hidden,
            inverseAllowsCustomLabels,
            inverseCardinality,
            inverseHasAllAssociatedObjects,
            inverseId,
            inverseName,
            isInversePrimary,
            isPrimary,
            maxFromObjectIds,
            maxToObjectIds,
            name,
            portalUniqueIdentifier,
            toObjectTypeId,
            fromObjectType,
            inverseLabel,
            label,
            toObjectType,
            mutableMapOf(),
        )

        /**
         * The unique ID of the associated object (e.g., a contact ID).
         *
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): Int = id.getRequired("id")

        /**
         * Whether custom labels can be used in the association.
         *
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun allowsCustomLabels(): Boolean = allowsCustomLabels.getRequired("allowsCustomLabels")

        /**
         * The cardinality from the source object's perspective, either "ONE_TO_ONE" or
         * "ONE_TO_MANY".
         *
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun cardinality(): Cardinality = cardinality.getRequired("cardinality")

        /**
         * The category of the association. Can be: "HUBSPOT_DEFINED", "USER_DEFINED", or
         * "INTEGRATOR_DEFINED"
         *
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun category(): Category = category.getRequired("category")

        /**
         * The ID of the source object type (e.g., 0-1 for contacts).
         *
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fromObjectTypeId(): String = fromObjectTypeId.getRequired("fromObjectTypeId")

        /**
         * Whether all potential linked objects are included in the association
         *
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun hasAllAssociatedObjects(): Boolean =
            hasAllAssociatedObjects.getRequired("hasAllAssociatedObjects")

        /**
         * Whether deletions in the association should cause cascading deletes to linked objects.
         *
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun hasCascadingDeletes(): Boolean = hasCascadingDeletes.getRequired("hasCascadingDeletes")

        /**
         * Whether a user has set a limit for the number of source objects.
         *
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun hasUserEnforcedMaxFromObjectIds(): Boolean =
            hasUserEnforcedMaxFromObjectIds.getRequired("hasUserEnforcedMaxFromObjectIds")

        /**
         * Whether a user has set a limit for the number of destination objects.
         *
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun hasUserEnforcedMaxToObjectIds(): Boolean =
            hasUserEnforcedMaxToObjectIds.getRequired("hasUserEnforcedMaxToObjectIds")

        /**
         * Whether the association is hidden or not.
         *
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun hidden(): Boolean = hidden.getRequired("hidden")

        /**
         * Whether the reverse association can also support custom labels.
         *
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun inverseAllowsCustomLabels(): Boolean =
            inverseAllowsCustomLabels.getRequired("inverseAllowsCustomLabels")

        /**
         * The cardinality from the destination object's perspective, either "ONE_TO_ONE" or
         * "ONE_TO_MANY".
         *
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun inverseCardinality(): InverseCardinality =
            inverseCardinality.getRequired("inverseCardinality")

        /**
         * Whether all potential reverse linked objects are included in the association.
         *
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun inverseHasAllAssociatedObjects(): Boolean =
            inverseHasAllAssociatedObjects.getRequired("inverseHasAllAssociatedObjects")

        /**
         * The unique ID for the inverse side of the association.
         *
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun inverseId(): Int = inverseId.getRequired("inverseId")

        /**
         * The name used to describe the inverse relationship in this association
         *
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun inverseName(): String = inverseName.getRequired("inverseName")

        /**
         * Whether the inverse association is considered primary.
         *
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun isInversePrimary(): Boolean = isInversePrimary.getRequired("isInversePrimary")

        /**
         * Whether the association is the primary link between the entities involved.
         *
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun isPrimary(): Boolean = isPrimary.getRequired("isPrimary")

        /**
         * The maximum number of source object IDs allowed in the association.
         *
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun maxFromObjectIds(): Int = maxFromObjectIds.getRequired("maxFromObjectIds")

        /**
         * The maximum number of destination object IDs allowed in the association.
         *
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun maxToObjectIds(): Int = maxToObjectIds.getRequired("maxToObjectIds")

        /**
         * For labeled association types, the internal name of the association.
         *
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * A unique across-portal ID applied to the association.
         *
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun portalUniqueIdentifier(): String =
            portalUniqueIdentifier.getRequired("portalUniqueIdentifier")

        /**
         * The ID of the destination object type (e.g., 0-3 for deals).
         *
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun toObjectTypeId(): String = toObjectTypeId.getRequired("toObjectTypeId")

        /**
         * The name of the source object type (e.g,. "DEAL" or "QUOTE").
         *
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fromObjectType(): Optional<FromObjectType> =
            fromObjectType.getOptional("fromObjectType")

        /**
         * The label used to describe the reverse relationship in an association.
         *
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inverseLabel(): Optional<String> = inverseLabel.getOptional("inverseLabel")

        /**
         * The label given to an association.
         *
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun label(): Optional<String> = label.getOptional("label")

        /**
         * The name of the destination object type (e.g,. "DEAL" or "QUOTE").
         *
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun toObjectType(): Optional<ToObjectType> = toObjectType.getOptional("toObjectType")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Int> = id

        /**
         * Returns the raw JSON value of [allowsCustomLabels].
         *
         * Unlike [allowsCustomLabels], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("allowsCustomLabels")
        @ExcludeMissing
        fun _allowsCustomLabels(): JsonField<Boolean> = allowsCustomLabels

        /**
         * Returns the raw JSON value of [cardinality].
         *
         * Unlike [cardinality], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cardinality")
        @ExcludeMissing
        fun _cardinality(): JsonField<Cardinality> = cardinality

        /**
         * Returns the raw JSON value of [category].
         *
         * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

        /**
         * Returns the raw JSON value of [fromObjectTypeId].
         *
         * Unlike [fromObjectTypeId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("fromObjectTypeId")
        @ExcludeMissing
        fun _fromObjectTypeId(): JsonField<String> = fromObjectTypeId

        /**
         * Returns the raw JSON value of [hasAllAssociatedObjects].
         *
         * Unlike [hasAllAssociatedObjects], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("hasAllAssociatedObjects")
        @ExcludeMissing
        fun _hasAllAssociatedObjects(): JsonField<Boolean> = hasAllAssociatedObjects

        /**
         * Returns the raw JSON value of [hasCascadingDeletes].
         *
         * Unlike [hasCascadingDeletes], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("hasCascadingDeletes")
        @ExcludeMissing
        fun _hasCascadingDeletes(): JsonField<Boolean> = hasCascadingDeletes

        /**
         * Returns the raw JSON value of [hasUserEnforcedMaxFromObjectIds].
         *
         * Unlike [hasUserEnforcedMaxFromObjectIds], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("hasUserEnforcedMaxFromObjectIds")
        @ExcludeMissing
        fun _hasUserEnforcedMaxFromObjectIds(): JsonField<Boolean> = hasUserEnforcedMaxFromObjectIds

        /**
         * Returns the raw JSON value of [hasUserEnforcedMaxToObjectIds].
         *
         * Unlike [hasUserEnforcedMaxToObjectIds], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("hasUserEnforcedMaxToObjectIds")
        @ExcludeMissing
        fun _hasUserEnforcedMaxToObjectIds(): JsonField<Boolean> = hasUserEnforcedMaxToObjectIds

        /**
         * Returns the raw JSON value of [hidden].
         *
         * Unlike [hidden], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("hidden") @ExcludeMissing fun _hidden(): JsonField<Boolean> = hidden

        /**
         * Returns the raw JSON value of [inverseAllowsCustomLabels].
         *
         * Unlike [inverseAllowsCustomLabels], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("inverseAllowsCustomLabels")
        @ExcludeMissing
        fun _inverseAllowsCustomLabels(): JsonField<Boolean> = inverseAllowsCustomLabels

        /**
         * Returns the raw JSON value of [inverseCardinality].
         *
         * Unlike [inverseCardinality], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("inverseCardinality")
        @ExcludeMissing
        fun _inverseCardinality(): JsonField<InverseCardinality> = inverseCardinality

        /**
         * Returns the raw JSON value of [inverseHasAllAssociatedObjects].
         *
         * Unlike [inverseHasAllAssociatedObjects], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("inverseHasAllAssociatedObjects")
        @ExcludeMissing
        fun _inverseHasAllAssociatedObjects(): JsonField<Boolean> = inverseHasAllAssociatedObjects

        /**
         * Returns the raw JSON value of [inverseId].
         *
         * Unlike [inverseId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("inverseId") @ExcludeMissing fun _inverseId(): JsonField<Int> = inverseId

        /**
         * Returns the raw JSON value of [inverseName].
         *
         * Unlike [inverseName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("inverseName")
        @ExcludeMissing
        fun _inverseName(): JsonField<String> = inverseName

        /**
         * Returns the raw JSON value of [isInversePrimary].
         *
         * Unlike [isInversePrimary], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("isInversePrimary")
        @ExcludeMissing
        fun _isInversePrimary(): JsonField<Boolean> = isInversePrimary

        /**
         * Returns the raw JSON value of [isPrimary].
         *
         * Unlike [isPrimary], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("isPrimary") @ExcludeMissing fun _isPrimary(): JsonField<Boolean> = isPrimary

        /**
         * Returns the raw JSON value of [maxFromObjectIds].
         *
         * Unlike [maxFromObjectIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("maxFromObjectIds")
        @ExcludeMissing
        fun _maxFromObjectIds(): JsonField<Int> = maxFromObjectIds

        /**
         * Returns the raw JSON value of [maxToObjectIds].
         *
         * Unlike [maxToObjectIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("maxToObjectIds")
        @ExcludeMissing
        fun _maxToObjectIds(): JsonField<Int> = maxToObjectIds

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [portalUniqueIdentifier].
         *
         * Unlike [portalUniqueIdentifier], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("portalUniqueIdentifier")
        @ExcludeMissing
        fun _portalUniqueIdentifier(): JsonField<String> = portalUniqueIdentifier

        /**
         * Returns the raw JSON value of [toObjectTypeId].
         *
         * Unlike [toObjectTypeId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("toObjectTypeId")
        @ExcludeMissing
        fun _toObjectTypeId(): JsonField<String> = toObjectTypeId

        /**
         * Returns the raw JSON value of [fromObjectType].
         *
         * Unlike [fromObjectType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("fromObjectType")
        @ExcludeMissing
        fun _fromObjectType(): JsonField<FromObjectType> = fromObjectType

        /**
         * Returns the raw JSON value of [inverseLabel].
         *
         * Unlike [inverseLabel], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("inverseLabel")
        @ExcludeMissing
        fun _inverseLabel(): JsonField<String> = inverseLabel

        /**
         * Returns the raw JSON value of [label].
         *
         * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

        /**
         * Returns the raw JSON value of [toObjectType].
         *
         * Unlike [toObjectType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("toObjectType")
        @ExcludeMissing
        fun _toObjectType(): JsonField<ToObjectType> = toObjectType

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
             * Returns a mutable builder for constructing an instance of [Association].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .allowsCustomLabels()
             * .cardinality()
             * .category()
             * .fromObjectTypeId()
             * .hasAllAssociatedObjects()
             * .hasCascadingDeletes()
             * .hasUserEnforcedMaxFromObjectIds()
             * .hasUserEnforcedMaxToObjectIds()
             * .hidden()
             * .inverseAllowsCustomLabels()
             * .inverseCardinality()
             * .inverseHasAllAssociatedObjects()
             * .inverseId()
             * .inverseName()
             * .isInversePrimary()
             * .isPrimary()
             * .maxFromObjectIds()
             * .maxToObjectIds()
             * .name()
             * .portalUniqueIdentifier()
             * .toObjectTypeId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Association]. */
        class Builder internal constructor() {

            private var id: JsonField<Int>? = null
            private var allowsCustomLabels: JsonField<Boolean>? = null
            private var cardinality: JsonField<Cardinality>? = null
            private var category: JsonField<Category>? = null
            private var fromObjectTypeId: JsonField<String>? = null
            private var hasAllAssociatedObjects: JsonField<Boolean>? = null
            private var hasCascadingDeletes: JsonField<Boolean>? = null
            private var hasUserEnforcedMaxFromObjectIds: JsonField<Boolean>? = null
            private var hasUserEnforcedMaxToObjectIds: JsonField<Boolean>? = null
            private var hidden: JsonField<Boolean>? = null
            private var inverseAllowsCustomLabels: JsonField<Boolean>? = null
            private var inverseCardinality: JsonField<InverseCardinality>? = null
            private var inverseHasAllAssociatedObjects: JsonField<Boolean>? = null
            private var inverseId: JsonField<Int>? = null
            private var inverseName: JsonField<String>? = null
            private var isInversePrimary: JsonField<Boolean>? = null
            private var isPrimary: JsonField<Boolean>? = null
            private var maxFromObjectIds: JsonField<Int>? = null
            private var maxToObjectIds: JsonField<Int>? = null
            private var name: JsonField<String>? = null
            private var portalUniqueIdentifier: JsonField<String>? = null
            private var toObjectTypeId: JsonField<String>? = null
            private var fromObjectType: JsonField<FromObjectType> = JsonMissing.of()
            private var inverseLabel: JsonField<String> = JsonMissing.of()
            private var label: JsonField<String> = JsonMissing.of()
            private var toObjectType: JsonField<ToObjectType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(association: Association) = apply {
                id = association.id
                allowsCustomLabels = association.allowsCustomLabels
                cardinality = association.cardinality
                category = association.category
                fromObjectTypeId = association.fromObjectTypeId
                hasAllAssociatedObjects = association.hasAllAssociatedObjects
                hasCascadingDeletes = association.hasCascadingDeletes
                hasUserEnforcedMaxFromObjectIds = association.hasUserEnforcedMaxFromObjectIds
                hasUserEnforcedMaxToObjectIds = association.hasUserEnforcedMaxToObjectIds
                hidden = association.hidden
                inverseAllowsCustomLabels = association.inverseAllowsCustomLabels
                inverseCardinality = association.inverseCardinality
                inverseHasAllAssociatedObjects = association.inverseHasAllAssociatedObjects
                inverseId = association.inverseId
                inverseName = association.inverseName
                isInversePrimary = association.isInversePrimary
                isPrimary = association.isPrimary
                maxFromObjectIds = association.maxFromObjectIds
                maxToObjectIds = association.maxToObjectIds
                name = association.name
                portalUniqueIdentifier = association.portalUniqueIdentifier
                toObjectTypeId = association.toObjectTypeId
                fromObjectType = association.fromObjectType
                inverseLabel = association.inverseLabel
                label = association.label
                toObjectType = association.toObjectType
                additionalProperties = association.additionalProperties.toMutableMap()
            }

            /** The unique ID of the associated object (e.g., a contact ID). */
            fun id(id: Int) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<Int>) = apply { this.id = id }

            /** Whether custom labels can be used in the association. */
            fun allowsCustomLabels(allowsCustomLabels: Boolean) =
                allowsCustomLabels(JsonField.of(allowsCustomLabels))

            /**
             * Sets [Builder.allowsCustomLabels] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowsCustomLabels] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun allowsCustomLabels(allowsCustomLabels: JsonField<Boolean>) = apply {
                this.allowsCustomLabels = allowsCustomLabels
            }

            /**
             * The cardinality from the source object's perspective, either "ONE_TO_ONE" or
             * "ONE_TO_MANY".
             */
            fun cardinality(cardinality: Cardinality) = cardinality(JsonField.of(cardinality))

            /**
             * Sets [Builder.cardinality] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardinality] with a well-typed [Cardinality] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cardinality(cardinality: JsonField<Cardinality>) = apply {
                this.cardinality = cardinality
            }

            /**
             * The category of the association. Can be: "HUBSPOT_DEFINED", "USER_DEFINED", or
             * "INTEGRATOR_DEFINED"
             */
            fun category(category: Category) = category(JsonField.of(category))

            /**
             * Sets [Builder.category] to an arbitrary JSON value.
             *
             * You should usually call [Builder.category] with a well-typed [Category] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /** The ID of the source object type (e.g., 0-1 for contacts). */
            fun fromObjectTypeId(fromObjectTypeId: String) =
                fromObjectTypeId(JsonField.of(fromObjectTypeId))

            /**
             * Sets [Builder.fromObjectTypeId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fromObjectTypeId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fromObjectTypeId(fromObjectTypeId: JsonField<String>) = apply {
                this.fromObjectTypeId = fromObjectTypeId
            }

            /** Whether all potential linked objects are included in the association */
            fun hasAllAssociatedObjects(hasAllAssociatedObjects: Boolean) =
                hasAllAssociatedObjects(JsonField.of(hasAllAssociatedObjects))

            /**
             * Sets [Builder.hasAllAssociatedObjects] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hasAllAssociatedObjects] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun hasAllAssociatedObjects(hasAllAssociatedObjects: JsonField<Boolean>) = apply {
                this.hasAllAssociatedObjects = hasAllAssociatedObjects
            }

            /**
             * Whether deletions in the association should cause cascading deletes to linked
             * objects.
             */
            fun hasCascadingDeletes(hasCascadingDeletes: Boolean) =
                hasCascadingDeletes(JsonField.of(hasCascadingDeletes))

            /**
             * Sets [Builder.hasCascadingDeletes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hasCascadingDeletes] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun hasCascadingDeletes(hasCascadingDeletes: JsonField<Boolean>) = apply {
                this.hasCascadingDeletes = hasCascadingDeletes
            }

            /** Whether a user has set a limit for the number of source objects. */
            fun hasUserEnforcedMaxFromObjectIds(hasUserEnforcedMaxFromObjectIds: Boolean) =
                hasUserEnforcedMaxFromObjectIds(JsonField.of(hasUserEnforcedMaxFromObjectIds))

            /**
             * Sets [Builder.hasUserEnforcedMaxFromObjectIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hasUserEnforcedMaxFromObjectIds] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun hasUserEnforcedMaxFromObjectIds(
                hasUserEnforcedMaxFromObjectIds: JsonField<Boolean>
            ) = apply { this.hasUserEnforcedMaxFromObjectIds = hasUserEnforcedMaxFromObjectIds }

            /** Whether a user has set a limit for the number of destination objects. */
            fun hasUserEnforcedMaxToObjectIds(hasUserEnforcedMaxToObjectIds: Boolean) =
                hasUserEnforcedMaxToObjectIds(JsonField.of(hasUserEnforcedMaxToObjectIds))

            /**
             * Sets [Builder.hasUserEnforcedMaxToObjectIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hasUserEnforcedMaxToObjectIds] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun hasUserEnforcedMaxToObjectIds(hasUserEnforcedMaxToObjectIds: JsonField<Boolean>) =
                apply {
                    this.hasUserEnforcedMaxToObjectIds = hasUserEnforcedMaxToObjectIds
                }

            /** Whether the association is hidden or not. */
            fun hidden(hidden: Boolean) = hidden(JsonField.of(hidden))

            /**
             * Sets [Builder.hidden] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hidden] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hidden(hidden: JsonField<Boolean>) = apply { this.hidden = hidden }

            /** Whether the reverse association can also support custom labels. */
            fun inverseAllowsCustomLabels(inverseAllowsCustomLabels: Boolean) =
                inverseAllowsCustomLabels(JsonField.of(inverseAllowsCustomLabels))

            /**
             * Sets [Builder.inverseAllowsCustomLabels] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inverseAllowsCustomLabels] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun inverseAllowsCustomLabels(inverseAllowsCustomLabels: JsonField<Boolean>) = apply {
                this.inverseAllowsCustomLabels = inverseAllowsCustomLabels
            }

            /**
             * The cardinality from the destination object's perspective, either "ONE_TO_ONE" or
             * "ONE_TO_MANY".
             */
            fun inverseCardinality(inverseCardinality: InverseCardinality) =
                inverseCardinality(JsonField.of(inverseCardinality))

            /**
             * Sets [Builder.inverseCardinality] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inverseCardinality] with a well-typed
             * [InverseCardinality] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun inverseCardinality(inverseCardinality: JsonField<InverseCardinality>) = apply {
                this.inverseCardinality = inverseCardinality
            }

            /** Whether all potential reverse linked objects are included in the association. */
            fun inverseHasAllAssociatedObjects(inverseHasAllAssociatedObjects: Boolean) =
                inverseHasAllAssociatedObjects(JsonField.of(inverseHasAllAssociatedObjects))

            /**
             * Sets [Builder.inverseHasAllAssociatedObjects] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inverseHasAllAssociatedObjects] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun inverseHasAllAssociatedObjects(inverseHasAllAssociatedObjects: JsonField<Boolean>) =
                apply {
                    this.inverseHasAllAssociatedObjects = inverseHasAllAssociatedObjects
                }

            /** The unique ID for the inverse side of the association. */
            fun inverseId(inverseId: Int) = inverseId(JsonField.of(inverseId))

            /**
             * Sets [Builder.inverseId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inverseId] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inverseId(inverseId: JsonField<Int>) = apply { this.inverseId = inverseId }

            /** The name used to describe the inverse relationship in this association */
            fun inverseName(inverseName: String) = inverseName(JsonField.of(inverseName))

            /**
             * Sets [Builder.inverseName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inverseName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inverseName(inverseName: JsonField<String>) = apply {
                this.inverseName = inverseName
            }

            /** Whether the inverse association is considered primary. */
            fun isInversePrimary(isInversePrimary: Boolean) =
                isInversePrimary(JsonField.of(isInversePrimary))

            /**
             * Sets [Builder.isInversePrimary] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isInversePrimary] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isInversePrimary(isInversePrimary: JsonField<Boolean>) = apply {
                this.isInversePrimary = isInversePrimary
            }

            /** Whether the association is the primary link between the entities involved. */
            fun isPrimary(isPrimary: Boolean) = isPrimary(JsonField.of(isPrimary))

            /**
             * Sets [Builder.isPrimary] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isPrimary] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isPrimary(isPrimary: JsonField<Boolean>) = apply { this.isPrimary = isPrimary }

            /** The maximum number of source object IDs allowed in the association. */
            fun maxFromObjectIds(maxFromObjectIds: Int) =
                maxFromObjectIds(JsonField.of(maxFromObjectIds))

            /**
             * Sets [Builder.maxFromObjectIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxFromObjectIds] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxFromObjectIds(maxFromObjectIds: JsonField<Int>) = apply {
                this.maxFromObjectIds = maxFromObjectIds
            }

            /** The maximum number of destination object IDs allowed in the association. */
            fun maxToObjectIds(maxToObjectIds: Int) = maxToObjectIds(JsonField.of(maxToObjectIds))

            /**
             * Sets [Builder.maxToObjectIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxToObjectIds] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxToObjectIds(maxToObjectIds: JsonField<Int>) = apply {
                this.maxToObjectIds = maxToObjectIds
            }

            /** For labeled association types, the internal name of the association. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** A unique across-portal ID applied to the association. */
            fun portalUniqueIdentifier(portalUniqueIdentifier: String) =
                portalUniqueIdentifier(JsonField.of(portalUniqueIdentifier))

            /**
             * Sets [Builder.portalUniqueIdentifier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.portalUniqueIdentifier] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun portalUniqueIdentifier(portalUniqueIdentifier: JsonField<String>) = apply {
                this.portalUniqueIdentifier = portalUniqueIdentifier
            }

            /** The ID of the destination object type (e.g., 0-3 for deals). */
            fun toObjectTypeId(toObjectTypeId: String) =
                toObjectTypeId(JsonField.of(toObjectTypeId))

            /**
             * Sets [Builder.toObjectTypeId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.toObjectTypeId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun toObjectTypeId(toObjectTypeId: JsonField<String>) = apply {
                this.toObjectTypeId = toObjectTypeId
            }

            /** The name of the source object type (e.g,. "DEAL" or "QUOTE"). */
            fun fromObjectType(fromObjectType: FromObjectType) =
                fromObjectType(JsonField.of(fromObjectType))

            /**
             * Sets [Builder.fromObjectType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fromObjectType] with a well-typed [FromObjectType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun fromObjectType(fromObjectType: JsonField<FromObjectType>) = apply {
                this.fromObjectType = fromObjectType
            }

            /** The label used to describe the reverse relationship in an association. */
            fun inverseLabel(inverseLabel: String) = inverseLabel(JsonField.of(inverseLabel))

            /**
             * Sets [Builder.inverseLabel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inverseLabel] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inverseLabel(inverseLabel: JsonField<String>) = apply {
                this.inverseLabel = inverseLabel
            }

            /** The label given to an association. */
            fun label(label: String) = label(JsonField.of(label))

            /**
             * Sets [Builder.label] to an arbitrary JSON value.
             *
             * You should usually call [Builder.label] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun label(label: JsonField<String>) = apply { this.label = label }

            /** The name of the destination object type (e.g,. "DEAL" or "QUOTE"). */
            fun toObjectType(toObjectType: ToObjectType) = toObjectType(JsonField.of(toObjectType))

            /**
             * Sets [Builder.toObjectType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.toObjectType] with a well-typed [ToObjectType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun toObjectType(toObjectType: JsonField<ToObjectType>) = apply {
                this.toObjectType = toObjectType
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
             * Returns an immutable instance of [Association].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .allowsCustomLabels()
             * .cardinality()
             * .category()
             * .fromObjectTypeId()
             * .hasAllAssociatedObjects()
             * .hasCascadingDeletes()
             * .hasUserEnforcedMaxFromObjectIds()
             * .hasUserEnforcedMaxToObjectIds()
             * .hidden()
             * .inverseAllowsCustomLabels()
             * .inverseCardinality()
             * .inverseHasAllAssociatedObjects()
             * .inverseId()
             * .inverseName()
             * .isInversePrimary()
             * .isPrimary()
             * .maxFromObjectIds()
             * .maxToObjectIds()
             * .name()
             * .portalUniqueIdentifier()
             * .toObjectTypeId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Association =
                Association(
                    checkRequired("id", id),
                    checkRequired("allowsCustomLabels", allowsCustomLabels),
                    checkRequired("cardinality", cardinality),
                    checkRequired("category", category),
                    checkRequired("fromObjectTypeId", fromObjectTypeId),
                    checkRequired("hasAllAssociatedObjects", hasAllAssociatedObjects),
                    checkRequired("hasCascadingDeletes", hasCascadingDeletes),
                    checkRequired(
                        "hasUserEnforcedMaxFromObjectIds",
                        hasUserEnforcedMaxFromObjectIds,
                    ),
                    checkRequired("hasUserEnforcedMaxToObjectIds", hasUserEnforcedMaxToObjectIds),
                    checkRequired("hidden", hidden),
                    checkRequired("inverseAllowsCustomLabels", inverseAllowsCustomLabels),
                    checkRequired("inverseCardinality", inverseCardinality),
                    checkRequired("inverseHasAllAssociatedObjects", inverseHasAllAssociatedObjects),
                    checkRequired("inverseId", inverseId),
                    checkRequired("inverseName", inverseName),
                    checkRequired("isInversePrimary", isInversePrimary),
                    checkRequired("isPrimary", isPrimary),
                    checkRequired("maxFromObjectIds", maxFromObjectIds),
                    checkRequired("maxToObjectIds", maxToObjectIds),
                    checkRequired("name", name),
                    checkRequired("portalUniqueIdentifier", portalUniqueIdentifier),
                    checkRequired("toObjectTypeId", toObjectTypeId),
                    fromObjectType,
                    inverseLabel,
                    label,
                    toObjectType,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Association = apply {
            if (validated) {
                return@apply
            }

            id()
            allowsCustomLabels()
            cardinality().validate()
            category().validate()
            fromObjectTypeId()
            hasAllAssociatedObjects()
            hasCascadingDeletes()
            hasUserEnforcedMaxFromObjectIds()
            hasUserEnforcedMaxToObjectIds()
            hidden()
            inverseAllowsCustomLabels()
            inverseCardinality().validate()
            inverseHasAllAssociatedObjects()
            inverseId()
            inverseName()
            isInversePrimary()
            isPrimary()
            maxFromObjectIds()
            maxToObjectIds()
            name()
            portalUniqueIdentifier()
            toObjectTypeId()
            fromObjectType().ifPresent { it.validate() }
            inverseLabel()
            label()
            toObjectType().ifPresent { it.validate() }
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (allowsCustomLabels.asKnown().isPresent) 1 else 0) +
                (cardinality.asKnown().getOrNull()?.validity() ?: 0) +
                (category.asKnown().getOrNull()?.validity() ?: 0) +
                (if (fromObjectTypeId.asKnown().isPresent) 1 else 0) +
                (if (hasAllAssociatedObjects.asKnown().isPresent) 1 else 0) +
                (if (hasCascadingDeletes.asKnown().isPresent) 1 else 0) +
                (if (hasUserEnforcedMaxFromObjectIds.asKnown().isPresent) 1 else 0) +
                (if (hasUserEnforcedMaxToObjectIds.asKnown().isPresent) 1 else 0) +
                (if (hidden.asKnown().isPresent) 1 else 0) +
                (if (inverseAllowsCustomLabels.asKnown().isPresent) 1 else 0) +
                (inverseCardinality.asKnown().getOrNull()?.validity() ?: 0) +
                (if (inverseHasAllAssociatedObjects.asKnown().isPresent) 1 else 0) +
                (if (inverseId.asKnown().isPresent) 1 else 0) +
                (if (inverseName.asKnown().isPresent) 1 else 0) +
                (if (isInversePrimary.asKnown().isPresent) 1 else 0) +
                (if (isPrimary.asKnown().isPresent) 1 else 0) +
                (if (maxFromObjectIds.asKnown().isPresent) 1 else 0) +
                (if (maxToObjectIds.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (portalUniqueIdentifier.asKnown().isPresent) 1 else 0) +
                (if (toObjectTypeId.asKnown().isPresent) 1 else 0) +
                (fromObjectType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (inverseLabel.asKnown().isPresent) 1 else 0) +
                (if (label.asKnown().isPresent) 1 else 0) +
                (toObjectType.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * The cardinality from the source object's perspective, either "ONE_TO_ONE" or
         * "ONE_TO_MANY".
         */
        class Cardinality @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ONE_TO_ONE = of("ONE_TO_ONE")

                @JvmField val ONE_TO_MANY = of("ONE_TO_MANY")

                @JvmStatic fun of(value: String) = Cardinality(JsonField.of(value))
            }

            /** An enum containing [Cardinality]'s known values. */
            enum class Known {
                ONE_TO_ONE,
                ONE_TO_MANY,
            }

            /**
             * An enum containing [Cardinality]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Cardinality] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ONE_TO_ONE,
                ONE_TO_MANY,
                /**
                 * An enum member indicating that [Cardinality] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ONE_TO_ONE -> Value.ONE_TO_ONE
                    ONE_TO_MANY -> Value.ONE_TO_MANY
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws HubspotInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    ONE_TO_ONE -> Known.ONE_TO_ONE
                    ONE_TO_MANY -> Known.ONE_TO_MANY
                    else -> throw HubspotInvalidDataException("Unknown Cardinality: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws HubspotInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    HubspotInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Cardinality = apply {
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

                return other is Cardinality && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * The category of the association. Can be: "HUBSPOT_DEFINED", "USER_DEFINED", or
         * "INTEGRATOR_DEFINED"
         */
        class Category @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val HUBSPOT_DEFINED = of("HUBSPOT_DEFINED")

                @JvmField val USER_DEFINED = of("USER_DEFINED")

                @JvmField val INTEGRATOR_DEFINED = of("INTEGRATOR_DEFINED")

                @JvmStatic fun of(value: String) = Category(JsonField.of(value))
            }

            /** An enum containing [Category]'s known values. */
            enum class Known {
                HUBSPOT_DEFINED,
                USER_DEFINED,
                INTEGRATOR_DEFINED,
            }

            /**
             * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Category] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                HUBSPOT_DEFINED,
                USER_DEFINED,
                INTEGRATOR_DEFINED,
                /**
                 * An enum member indicating that [Category] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws HubspotInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    HUBSPOT_DEFINED -> Known.HUBSPOT_DEFINED
                    USER_DEFINED -> Known.USER_DEFINED
                    INTEGRATOR_DEFINED -> Known.INTEGRATOR_DEFINED
                    else -> throw HubspotInvalidDataException("Unknown Category: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws HubspotInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    HubspotInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Category = apply {
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

                return other is Category && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * The cardinality from the destination object's perspective, either "ONE_TO_ONE" or
         * "ONE_TO_MANY".
         */
        class InverseCardinality
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ONE_TO_ONE = of("ONE_TO_ONE")

                @JvmField val ONE_TO_MANY = of("ONE_TO_MANY")

                @JvmStatic fun of(value: String) = InverseCardinality(JsonField.of(value))
            }

            /** An enum containing [InverseCardinality]'s known values. */
            enum class Known {
                ONE_TO_ONE,
                ONE_TO_MANY,
            }

            /**
             * An enum containing [InverseCardinality]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [InverseCardinality] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ONE_TO_ONE,
                ONE_TO_MANY,
                /**
                 * An enum member indicating that [InverseCardinality] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ONE_TO_ONE -> Value.ONE_TO_ONE
                    ONE_TO_MANY -> Value.ONE_TO_MANY
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws HubspotInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    ONE_TO_ONE -> Known.ONE_TO_ONE
                    ONE_TO_MANY -> Known.ONE_TO_MANY
                    else -> throw HubspotInvalidDataException("Unknown InverseCardinality: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws HubspotInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    HubspotInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): InverseCardinality = apply {
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

                return other is InverseCardinality && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The name of the source object type (e.g,. "DEAL" or "QUOTE"). */
        class FromObjectType
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val CONTACT = of("CONTACT")

                @JvmField val COMPANY = of("COMPANY")

                @JvmField val DEAL = of("DEAL")

                @JvmField val ENGAGEMENT = of("ENGAGEMENT")

                @JvmField val TICKET = of("TICKET")

                @JvmField val OWNER = of("OWNER")

                @JvmField val PRODUCT = of("PRODUCT")

                @JvmField val LINE_ITEM = of("LINE_ITEM")

                @JvmField val BET_DELIVERABLE_SERVICE = of("BET_DELIVERABLE_SERVICE")

                @JvmField val CONTENT = of("CONTENT")

                @JvmField val CONVERSATION = of("CONVERSATION")

                @JvmField val BET_ALERT = of("BET_ALERT")

                @JvmField val PORTAL = of("PORTAL")

                @JvmField val QUOTE = of("QUOTE")

                @JvmField val FORM_SUBMISSION_INBOUNDDB = of("FORM_SUBMISSION_INBOUNDDB")

                @JvmField val QUOTA = of("QUOTA")

                @JvmField val UNSUBSCRIBE = of("UNSUBSCRIBE")

                @JvmField val COMMUNICATION = of("COMMUNICATION")

                @JvmField val FEEDBACK_SUBMISSION = of("FEEDBACK_SUBMISSION")

                @JvmField val ATTRIBUTION = of("ATTRIBUTION")

                @JvmField val SALESFORCE_SYNC_ERROR = of("SALESFORCE_SYNC_ERROR")

                @JvmField val RESTORABLE_CRM_OBJECT = of("RESTORABLE_CRM_OBJECT")

                @JvmField val HUB = of("HUB")

                @JvmField val LANDING_PAGE = of("LANDING_PAGE")

                @JvmField val PRODUCT_OR_FOLDER = of("PRODUCT_OR_FOLDER")

                @JvmField val TASK = of("TASK")

                @JvmField val FORM = of("FORM")

                @JvmField val MARKETING_EMAIL = of("MARKETING_EMAIL")

                @JvmField val AD_ACCOUNT = of("AD_ACCOUNT")

                @JvmField val AD_CAMPAIGN = of("AD_CAMPAIGN")

                @JvmField val AD_GROUP = of("AD_GROUP")

                @JvmField val AD = of("AD")

                @JvmField val KEYWORD = of("KEYWORD")

                @JvmField val CAMPAIGN = of("CAMPAIGN")

                @JvmField val SOCIAL_CHANNEL = of("SOCIAL_CHANNEL")

                @JvmField val SOCIAL_POST = of("SOCIAL_POST")

                @JvmField val SITE_PAGE = of("SITE_PAGE")

                @JvmField val BLOG_POST = of("BLOG_POST")

                @JvmField val IMPORT = of("IMPORT")

                @JvmField val EXPORT = of("EXPORT")

                @JvmField val CTA = of("CTA")

                @JvmField val TASK_TEMPLATE = of("TASK_TEMPLATE")

                @JvmField val AUTOMATION_PLATFORM_FLOW = of("AUTOMATION_PLATFORM_FLOW")

                @JvmField val OBJECT_LIST = of("OBJECT_LIST")

                @JvmField val NOTE = of("NOTE")

                @JvmField val MEETING_EVENT = of("MEETING_EVENT")

                @JvmField val CALL = of("CALL")

                @JvmField val EMAIL = of("EMAIL")

                @JvmField val PUBLISHING_TASK = of("PUBLISHING_TASK")

                @JvmField val CONVERSATION_SESSION = of("CONVERSATION_SESSION")

                @JvmField val CONTACT_CREATE_ATTRIBUTION = of("CONTACT_CREATE_ATTRIBUTION")

                @JvmField val INVOICE = of("INVOICE")

                @JvmField val MARKETING_EVENT = of("MARKETING_EVENT")

                @JvmField val CONVERSATION_INBOX = of("CONVERSATION_INBOX")

                @JvmField val CHATFLOW = of("CHATFLOW")

                @JvmField val MEDIA_BRIDGE = of("MEDIA_BRIDGE")

                @JvmField val SEQUENCE = of("SEQUENCE")

                @JvmField val SEQUENCE_STEP = of("SEQUENCE_STEP")

                @JvmField val FORECAST = of("FORECAST")

                @JvmField val SNIPPET = of("SNIPPET")

                @JvmField val TEMPLATE = of("TEMPLATE")

                @JvmField val DEAL_CREATE_ATTRIBUTION = of("DEAL_CREATE_ATTRIBUTION")

                @JvmField val QUOTE_TEMPLATE = of("QUOTE_TEMPLATE")

                @JvmField val QUOTE_MODULE = of("QUOTE_MODULE")

                @JvmField val QUOTE_MODULE_FIELD = of("QUOTE_MODULE_FIELD")

                @JvmField val QUOTE_FIELD = of("QUOTE_FIELD")

                @JvmField val SEQUENCE_ENROLLMENT = of("SEQUENCE_ENROLLMENT")

                @JvmField val SUBSCRIPTION = of("SUBSCRIPTION")

                @JvmField val ACCEPTANCE_TEST = of("ACCEPTANCE_TEST")

                @JvmField val SOCIAL_BROADCAST = of("SOCIAL_BROADCAST")

                @JvmField val DEAL_SPLIT = of("DEAL_SPLIT")

                @JvmField val DEAL_REGISTRATION = of("DEAL_REGISTRATION")

                @JvmField val GOAL_TARGET = of("GOAL_TARGET")

                @JvmField val GOAL_TARGET_GROUP = of("GOAL_TARGET_GROUP")

                @JvmField val PORTAL_OBJECT_SYNC_MESSAGE = of("PORTAL_OBJECT_SYNC_MESSAGE")

                @JvmField val FILE_MANAGER_FILE = of("FILE_MANAGER_FILE")

                @JvmField val FILE_MANAGER_FOLDER = of("FILE_MANAGER_FOLDER")

                @JvmField val SEQUENCE_STEP_ENROLLMENT = of("SEQUENCE_STEP_ENROLLMENT")

                @JvmField val APPROVAL = of("APPROVAL")

                @JvmField val APPROVAL_STEP = of("APPROVAL_STEP")

                @JvmField val CTA_VARIANT = of("CTA_VARIANT")

                @JvmField val SALES_DOCUMENT = of("SALES_DOCUMENT")

                @JvmField val DISCOUNT = of("DISCOUNT")

                @JvmField val FEE = of("FEE")

                @JvmField val TAX = of("TAX")

                @JvmField val MARKETING_CALENDAR = of("MARKETING_CALENDAR")

                @JvmField val PERMISSIONS_TESTING = of("PERMISSIONS_TESTING")

                @JvmField val PRIVACY_SCANNER_COOKIE = of("PRIVACY_SCANNER_COOKIE")

                @JvmField val DATA_SYNC_STATE = of("DATA_SYNC_STATE")

                @JvmField val WEB_INTERACTIVE = of("WEB_INTERACTIVE")

                @JvmField val PLAYBOOK = of("PLAYBOOK")

                @JvmField val FOLDER = of("FOLDER")

                @JvmField val PLAYBOOK_QUESTION = of("PLAYBOOK_QUESTION")

                @JvmField val PLAYBOOK_SUBMISSION = of("PLAYBOOK_SUBMISSION")

                @JvmField val PLAYBOOK_SUBMISSION_ANSWER = of("PLAYBOOK_SUBMISSION_ANSWER")

                @JvmField val COMMERCE_PAYMENT = of("COMMERCE_PAYMENT")

                @JvmField val GSC_PROPERTY = of("GSC_PROPERTY")

                @JvmField val SOX_PROTECTED_DUMMY_TYPE = of("SOX_PROTECTED_DUMMY_TYPE")

                @JvmField val BLOG_LISTING_PAGE = of("BLOG_LISTING_PAGE")

                @JvmField val QUARANTINED_SUBMISSION = of("QUARANTINED_SUBMISSION")

                @JvmField val PAYMENT_SCHEDULE = of("PAYMENT_SCHEDULE")

                @JvmField val PAYMENT_SCHEDULE_INSTALLMENT = of("PAYMENT_SCHEDULE_INSTALLMENT")

                @JvmField val MARKETING_CAMPAIGN_UTM = of("MARKETING_CAMPAIGN_UTM")

                @JvmField val DISCOUNT_TEMPLATE = of("DISCOUNT_TEMPLATE")

                @JvmField val DISCOUNT_CODE = of("DISCOUNT_CODE")

                @JvmField val FEEDBACK_SURVEY = of("FEEDBACK_SURVEY")

                @JvmField val CMS_URL = of("CMS_URL")

                @JvmField val SALES_TASK = of("SALES_TASK")

                @JvmField val SALES_WORKLOAD = of("SALES_WORKLOAD")

                @JvmField val USER = of("USER")

                @JvmField val POSTAL_MAIL = of("POSTAL_MAIL")

                @JvmField val SCHEMAS_BACKEND_TEST = of("SCHEMAS_BACKEND_TEST")

                @JvmField val PAYMENT_LINK = of("PAYMENT_LINK")

                @JvmField val SUBMISSION_TAG = of("SUBMISSION_TAG")

                @JvmField val CAMPAIGN_STEP = of("CAMPAIGN_STEP")

                @JvmField val SCHEDULING_PAGE = of("SCHEDULING_PAGE")

                @JvmField val SOX_PROTECTED_TEST_TYPE = of("SOX_PROTECTED_TEST_TYPE")

                @JvmField val ORDER = of("ORDER")

                @JvmField val MARKETING_SMS = of("MARKETING_SMS")

                @JvmField val PARTNER_ACCOUNT = of("PARTNER_ACCOUNT")

                @JvmField val CAMPAIGN_TEMPLATE = of("CAMPAIGN_TEMPLATE")

                @JvmField val CAMPAIGN_TEMPLATE_STEP = of("CAMPAIGN_TEMPLATE_STEP")

                @JvmField val PLAYLIST = of("PLAYLIST")

                @JvmField val CLIP = of("CLIP")

                @JvmField val CAMPAIGN_BUDGET_ITEM = of("CAMPAIGN_BUDGET_ITEM")

                @JvmField val CAMPAIGN_SPEND_ITEM = of("CAMPAIGN_SPEND_ITEM")

                @JvmField val MIC = of("MIC")

                @JvmField val CONTENT_AUDIT = of("CONTENT_AUDIT")

                @JvmField val CONTENT_AUDIT_PAGE = of("CONTENT_AUDIT_PAGE")

                @JvmField val PLAYLIST_FOLDER = of("PLAYLIST_FOLDER")

                @JvmField val LEAD = of("LEAD")

                @JvmField val ABANDONED_CART = of("ABANDONED_CART")

                @JvmField val EXTERNAL_WEB_URL = of("EXTERNAL_WEB_URL")

                @JvmField val VIEW = of("VIEW")

                @JvmField val VIEW_BLOCK = of("VIEW_BLOCK")

                @JvmField val ROSTER = of("ROSTER")

                @JvmField val CART = of("CART")

                @JvmField
                val AUTOMATION_PLATFORM_FLOW_ACTION = of("AUTOMATION_PLATFORM_FLOW_ACTION")

                @JvmField val SOCIAL_PROFILE = of("SOCIAL_PROFILE")

                @JvmField val PARTNER_CLIENT = of("PARTNER_CLIENT")

                @JvmField val ROSTER_MEMBER = of("ROSTER_MEMBER")

                @JvmField val MARKETING_EVENT_ATTENDANCE = of("MARKETING_EVENT_ATTENDANCE")

                @JvmField val ALL_PAGES = of("ALL_PAGES")

                @JvmField val AI_FORECAST = of("AI_FORECAST")

                @JvmField val CRM_PIPELINES_DUMMY_TYPE = of("CRM_PIPELINES_DUMMY_TYPE")

                @JvmField val KNOWLEDGE_ARTICLE = of("KNOWLEDGE_ARTICLE")

                @JvmField val PROPERTY_INFO = of("PROPERTY_INFO")

                @JvmField val DATA_PRIVACY_CONSENT = of("DATA_PRIVACY_CONSENT")

                @JvmField val GOAL_TEMPLATE = of("GOAL_TEMPLATE")

                @JvmField val SCORE_CONFIGURATION = of("SCORE_CONFIGURATION")

                @JvmField val AUDIENCE = of("AUDIENCE")

                @JvmField val PARTNER_CLIENT_REVENUE = of("PARTNER_CLIENT_REVENUE")

                @JvmField val AUTOMATION_JOURNEY = of("AUTOMATION_JOURNEY")

                @JvmField val COMBO_EVENT_CONFIGURATION = of("COMBO_EVENT_CONFIGURATION")

                @JvmField val CRM_OBJECTS_DUMMY_TYPE = of("CRM_OBJECTS_DUMMY_TYPE")

                @JvmField val CASE_STUDY = of("CASE_STUDY")

                @JvmField val SERVICE = of("SERVICE")

                @JvmField val PODCAST_EPISODE = of("PODCAST_EPISODE")

                @JvmField val PARTNER_SERVICE = of("PARTNER_SERVICE")

                @JvmField val UNKNOWN = of("UNKNOWN")

                @JvmStatic fun of(value: String) = FromObjectType(JsonField.of(value))
            }

            /** An enum containing [FromObjectType]'s known values. */
            enum class Known {
                CONTACT,
                COMPANY,
                DEAL,
                ENGAGEMENT,
                TICKET,
                OWNER,
                PRODUCT,
                LINE_ITEM,
                BET_DELIVERABLE_SERVICE,
                CONTENT,
                CONVERSATION,
                BET_ALERT,
                PORTAL,
                QUOTE,
                FORM_SUBMISSION_INBOUNDDB,
                QUOTA,
                UNSUBSCRIBE,
                COMMUNICATION,
                FEEDBACK_SUBMISSION,
                ATTRIBUTION,
                SALESFORCE_SYNC_ERROR,
                RESTORABLE_CRM_OBJECT,
                HUB,
                LANDING_PAGE,
                PRODUCT_OR_FOLDER,
                TASK,
                FORM,
                MARKETING_EMAIL,
                AD_ACCOUNT,
                AD_CAMPAIGN,
                AD_GROUP,
                AD,
                KEYWORD,
                CAMPAIGN,
                SOCIAL_CHANNEL,
                SOCIAL_POST,
                SITE_PAGE,
                BLOG_POST,
                IMPORT,
                EXPORT,
                CTA,
                TASK_TEMPLATE,
                AUTOMATION_PLATFORM_FLOW,
                OBJECT_LIST,
                NOTE,
                MEETING_EVENT,
                CALL,
                EMAIL,
                PUBLISHING_TASK,
                CONVERSATION_SESSION,
                CONTACT_CREATE_ATTRIBUTION,
                INVOICE,
                MARKETING_EVENT,
                CONVERSATION_INBOX,
                CHATFLOW,
                MEDIA_BRIDGE,
                SEQUENCE,
                SEQUENCE_STEP,
                FORECAST,
                SNIPPET,
                TEMPLATE,
                DEAL_CREATE_ATTRIBUTION,
                QUOTE_TEMPLATE,
                QUOTE_MODULE,
                QUOTE_MODULE_FIELD,
                QUOTE_FIELD,
                SEQUENCE_ENROLLMENT,
                SUBSCRIPTION,
                ACCEPTANCE_TEST,
                SOCIAL_BROADCAST,
                DEAL_SPLIT,
                DEAL_REGISTRATION,
                GOAL_TARGET,
                GOAL_TARGET_GROUP,
                PORTAL_OBJECT_SYNC_MESSAGE,
                FILE_MANAGER_FILE,
                FILE_MANAGER_FOLDER,
                SEQUENCE_STEP_ENROLLMENT,
                APPROVAL,
                APPROVAL_STEP,
                CTA_VARIANT,
                SALES_DOCUMENT,
                DISCOUNT,
                FEE,
                TAX,
                MARKETING_CALENDAR,
                PERMISSIONS_TESTING,
                PRIVACY_SCANNER_COOKIE,
                DATA_SYNC_STATE,
                WEB_INTERACTIVE,
                PLAYBOOK,
                FOLDER,
                PLAYBOOK_QUESTION,
                PLAYBOOK_SUBMISSION,
                PLAYBOOK_SUBMISSION_ANSWER,
                COMMERCE_PAYMENT,
                GSC_PROPERTY,
                SOX_PROTECTED_DUMMY_TYPE,
                BLOG_LISTING_PAGE,
                QUARANTINED_SUBMISSION,
                PAYMENT_SCHEDULE,
                PAYMENT_SCHEDULE_INSTALLMENT,
                MARKETING_CAMPAIGN_UTM,
                DISCOUNT_TEMPLATE,
                DISCOUNT_CODE,
                FEEDBACK_SURVEY,
                CMS_URL,
                SALES_TASK,
                SALES_WORKLOAD,
                USER,
                POSTAL_MAIL,
                SCHEMAS_BACKEND_TEST,
                PAYMENT_LINK,
                SUBMISSION_TAG,
                CAMPAIGN_STEP,
                SCHEDULING_PAGE,
                SOX_PROTECTED_TEST_TYPE,
                ORDER,
                MARKETING_SMS,
                PARTNER_ACCOUNT,
                CAMPAIGN_TEMPLATE,
                CAMPAIGN_TEMPLATE_STEP,
                PLAYLIST,
                CLIP,
                CAMPAIGN_BUDGET_ITEM,
                CAMPAIGN_SPEND_ITEM,
                MIC,
                CONTENT_AUDIT,
                CONTENT_AUDIT_PAGE,
                PLAYLIST_FOLDER,
                LEAD,
                ABANDONED_CART,
                EXTERNAL_WEB_URL,
                VIEW,
                VIEW_BLOCK,
                ROSTER,
                CART,
                AUTOMATION_PLATFORM_FLOW_ACTION,
                SOCIAL_PROFILE,
                PARTNER_CLIENT,
                ROSTER_MEMBER,
                MARKETING_EVENT_ATTENDANCE,
                ALL_PAGES,
                AI_FORECAST,
                CRM_PIPELINES_DUMMY_TYPE,
                KNOWLEDGE_ARTICLE,
                PROPERTY_INFO,
                DATA_PRIVACY_CONSENT,
                GOAL_TEMPLATE,
                SCORE_CONFIGURATION,
                AUDIENCE,
                PARTNER_CLIENT_REVENUE,
                AUTOMATION_JOURNEY,
                COMBO_EVENT_CONFIGURATION,
                CRM_OBJECTS_DUMMY_TYPE,
                CASE_STUDY,
                SERVICE,
                PODCAST_EPISODE,
                PARTNER_SERVICE,
                UNKNOWN,
            }

            /**
             * An enum containing [FromObjectType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [FromObjectType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CONTACT,
                COMPANY,
                DEAL,
                ENGAGEMENT,
                TICKET,
                OWNER,
                PRODUCT,
                LINE_ITEM,
                BET_DELIVERABLE_SERVICE,
                CONTENT,
                CONVERSATION,
                BET_ALERT,
                PORTAL,
                QUOTE,
                FORM_SUBMISSION_INBOUNDDB,
                QUOTA,
                UNSUBSCRIBE,
                COMMUNICATION,
                FEEDBACK_SUBMISSION,
                ATTRIBUTION,
                SALESFORCE_SYNC_ERROR,
                RESTORABLE_CRM_OBJECT,
                HUB,
                LANDING_PAGE,
                PRODUCT_OR_FOLDER,
                TASK,
                FORM,
                MARKETING_EMAIL,
                AD_ACCOUNT,
                AD_CAMPAIGN,
                AD_GROUP,
                AD,
                KEYWORD,
                CAMPAIGN,
                SOCIAL_CHANNEL,
                SOCIAL_POST,
                SITE_PAGE,
                BLOG_POST,
                IMPORT,
                EXPORT,
                CTA,
                TASK_TEMPLATE,
                AUTOMATION_PLATFORM_FLOW,
                OBJECT_LIST,
                NOTE,
                MEETING_EVENT,
                CALL,
                EMAIL,
                PUBLISHING_TASK,
                CONVERSATION_SESSION,
                CONTACT_CREATE_ATTRIBUTION,
                INVOICE,
                MARKETING_EVENT,
                CONVERSATION_INBOX,
                CHATFLOW,
                MEDIA_BRIDGE,
                SEQUENCE,
                SEQUENCE_STEP,
                FORECAST,
                SNIPPET,
                TEMPLATE,
                DEAL_CREATE_ATTRIBUTION,
                QUOTE_TEMPLATE,
                QUOTE_MODULE,
                QUOTE_MODULE_FIELD,
                QUOTE_FIELD,
                SEQUENCE_ENROLLMENT,
                SUBSCRIPTION,
                ACCEPTANCE_TEST,
                SOCIAL_BROADCAST,
                DEAL_SPLIT,
                DEAL_REGISTRATION,
                GOAL_TARGET,
                GOAL_TARGET_GROUP,
                PORTAL_OBJECT_SYNC_MESSAGE,
                FILE_MANAGER_FILE,
                FILE_MANAGER_FOLDER,
                SEQUENCE_STEP_ENROLLMENT,
                APPROVAL,
                APPROVAL_STEP,
                CTA_VARIANT,
                SALES_DOCUMENT,
                DISCOUNT,
                FEE,
                TAX,
                MARKETING_CALENDAR,
                PERMISSIONS_TESTING,
                PRIVACY_SCANNER_COOKIE,
                DATA_SYNC_STATE,
                WEB_INTERACTIVE,
                PLAYBOOK,
                FOLDER,
                PLAYBOOK_QUESTION,
                PLAYBOOK_SUBMISSION,
                PLAYBOOK_SUBMISSION_ANSWER,
                COMMERCE_PAYMENT,
                GSC_PROPERTY,
                SOX_PROTECTED_DUMMY_TYPE,
                BLOG_LISTING_PAGE,
                QUARANTINED_SUBMISSION,
                PAYMENT_SCHEDULE,
                PAYMENT_SCHEDULE_INSTALLMENT,
                MARKETING_CAMPAIGN_UTM,
                DISCOUNT_TEMPLATE,
                DISCOUNT_CODE,
                FEEDBACK_SURVEY,
                CMS_URL,
                SALES_TASK,
                SALES_WORKLOAD,
                USER,
                POSTAL_MAIL,
                SCHEMAS_BACKEND_TEST,
                PAYMENT_LINK,
                SUBMISSION_TAG,
                CAMPAIGN_STEP,
                SCHEDULING_PAGE,
                SOX_PROTECTED_TEST_TYPE,
                ORDER,
                MARKETING_SMS,
                PARTNER_ACCOUNT,
                CAMPAIGN_TEMPLATE,
                CAMPAIGN_TEMPLATE_STEP,
                PLAYLIST,
                CLIP,
                CAMPAIGN_BUDGET_ITEM,
                CAMPAIGN_SPEND_ITEM,
                MIC,
                CONTENT_AUDIT,
                CONTENT_AUDIT_PAGE,
                PLAYLIST_FOLDER,
                LEAD,
                ABANDONED_CART,
                EXTERNAL_WEB_URL,
                VIEW,
                VIEW_BLOCK,
                ROSTER,
                CART,
                AUTOMATION_PLATFORM_FLOW_ACTION,
                SOCIAL_PROFILE,
                PARTNER_CLIENT,
                ROSTER_MEMBER,
                MARKETING_EVENT_ATTENDANCE,
                ALL_PAGES,
                AI_FORECAST,
                CRM_PIPELINES_DUMMY_TYPE,
                KNOWLEDGE_ARTICLE,
                PROPERTY_INFO,
                DATA_PRIVACY_CONSENT,
                GOAL_TEMPLATE,
                SCORE_CONFIGURATION,
                AUDIENCE,
                PARTNER_CLIENT_REVENUE,
                AUTOMATION_JOURNEY,
                COMBO_EVENT_CONFIGURATION,
                CRM_OBJECTS_DUMMY_TYPE,
                CASE_STUDY,
                SERVICE,
                PODCAST_EPISODE,
                PARTNER_SERVICE,
                UNKNOWN,
                /**
                 * An enum member indicating that [FromObjectType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    CONTACT -> Value.CONTACT
                    COMPANY -> Value.COMPANY
                    DEAL -> Value.DEAL
                    ENGAGEMENT -> Value.ENGAGEMENT
                    TICKET -> Value.TICKET
                    OWNER -> Value.OWNER
                    PRODUCT -> Value.PRODUCT
                    LINE_ITEM -> Value.LINE_ITEM
                    BET_DELIVERABLE_SERVICE -> Value.BET_DELIVERABLE_SERVICE
                    CONTENT -> Value.CONTENT
                    CONVERSATION -> Value.CONVERSATION
                    BET_ALERT -> Value.BET_ALERT
                    PORTAL -> Value.PORTAL
                    QUOTE -> Value.QUOTE
                    FORM_SUBMISSION_INBOUNDDB -> Value.FORM_SUBMISSION_INBOUNDDB
                    QUOTA -> Value.QUOTA
                    UNSUBSCRIBE -> Value.UNSUBSCRIBE
                    COMMUNICATION -> Value.COMMUNICATION
                    FEEDBACK_SUBMISSION -> Value.FEEDBACK_SUBMISSION
                    ATTRIBUTION -> Value.ATTRIBUTION
                    SALESFORCE_SYNC_ERROR -> Value.SALESFORCE_SYNC_ERROR
                    RESTORABLE_CRM_OBJECT -> Value.RESTORABLE_CRM_OBJECT
                    HUB -> Value.HUB
                    LANDING_PAGE -> Value.LANDING_PAGE
                    PRODUCT_OR_FOLDER -> Value.PRODUCT_OR_FOLDER
                    TASK -> Value.TASK
                    FORM -> Value.FORM
                    MARKETING_EMAIL -> Value.MARKETING_EMAIL
                    AD_ACCOUNT -> Value.AD_ACCOUNT
                    AD_CAMPAIGN -> Value.AD_CAMPAIGN
                    AD_GROUP -> Value.AD_GROUP
                    AD -> Value.AD
                    KEYWORD -> Value.KEYWORD
                    CAMPAIGN -> Value.CAMPAIGN
                    SOCIAL_CHANNEL -> Value.SOCIAL_CHANNEL
                    SOCIAL_POST -> Value.SOCIAL_POST
                    SITE_PAGE -> Value.SITE_PAGE
                    BLOG_POST -> Value.BLOG_POST
                    IMPORT -> Value.IMPORT
                    EXPORT -> Value.EXPORT
                    CTA -> Value.CTA
                    TASK_TEMPLATE -> Value.TASK_TEMPLATE
                    AUTOMATION_PLATFORM_FLOW -> Value.AUTOMATION_PLATFORM_FLOW
                    OBJECT_LIST -> Value.OBJECT_LIST
                    NOTE -> Value.NOTE
                    MEETING_EVENT -> Value.MEETING_EVENT
                    CALL -> Value.CALL
                    EMAIL -> Value.EMAIL
                    PUBLISHING_TASK -> Value.PUBLISHING_TASK
                    CONVERSATION_SESSION -> Value.CONVERSATION_SESSION
                    CONTACT_CREATE_ATTRIBUTION -> Value.CONTACT_CREATE_ATTRIBUTION
                    INVOICE -> Value.INVOICE
                    MARKETING_EVENT -> Value.MARKETING_EVENT
                    CONVERSATION_INBOX -> Value.CONVERSATION_INBOX
                    CHATFLOW -> Value.CHATFLOW
                    MEDIA_BRIDGE -> Value.MEDIA_BRIDGE
                    SEQUENCE -> Value.SEQUENCE
                    SEQUENCE_STEP -> Value.SEQUENCE_STEP
                    FORECAST -> Value.FORECAST
                    SNIPPET -> Value.SNIPPET
                    TEMPLATE -> Value.TEMPLATE
                    DEAL_CREATE_ATTRIBUTION -> Value.DEAL_CREATE_ATTRIBUTION
                    QUOTE_TEMPLATE -> Value.QUOTE_TEMPLATE
                    QUOTE_MODULE -> Value.QUOTE_MODULE
                    QUOTE_MODULE_FIELD -> Value.QUOTE_MODULE_FIELD
                    QUOTE_FIELD -> Value.QUOTE_FIELD
                    SEQUENCE_ENROLLMENT -> Value.SEQUENCE_ENROLLMENT
                    SUBSCRIPTION -> Value.SUBSCRIPTION
                    ACCEPTANCE_TEST -> Value.ACCEPTANCE_TEST
                    SOCIAL_BROADCAST -> Value.SOCIAL_BROADCAST
                    DEAL_SPLIT -> Value.DEAL_SPLIT
                    DEAL_REGISTRATION -> Value.DEAL_REGISTRATION
                    GOAL_TARGET -> Value.GOAL_TARGET
                    GOAL_TARGET_GROUP -> Value.GOAL_TARGET_GROUP
                    PORTAL_OBJECT_SYNC_MESSAGE -> Value.PORTAL_OBJECT_SYNC_MESSAGE
                    FILE_MANAGER_FILE -> Value.FILE_MANAGER_FILE
                    FILE_MANAGER_FOLDER -> Value.FILE_MANAGER_FOLDER
                    SEQUENCE_STEP_ENROLLMENT -> Value.SEQUENCE_STEP_ENROLLMENT
                    APPROVAL -> Value.APPROVAL
                    APPROVAL_STEP -> Value.APPROVAL_STEP
                    CTA_VARIANT -> Value.CTA_VARIANT
                    SALES_DOCUMENT -> Value.SALES_DOCUMENT
                    DISCOUNT -> Value.DISCOUNT
                    FEE -> Value.FEE
                    TAX -> Value.TAX
                    MARKETING_CALENDAR -> Value.MARKETING_CALENDAR
                    PERMISSIONS_TESTING -> Value.PERMISSIONS_TESTING
                    PRIVACY_SCANNER_COOKIE -> Value.PRIVACY_SCANNER_COOKIE
                    DATA_SYNC_STATE -> Value.DATA_SYNC_STATE
                    WEB_INTERACTIVE -> Value.WEB_INTERACTIVE
                    PLAYBOOK -> Value.PLAYBOOK
                    FOLDER -> Value.FOLDER
                    PLAYBOOK_QUESTION -> Value.PLAYBOOK_QUESTION
                    PLAYBOOK_SUBMISSION -> Value.PLAYBOOK_SUBMISSION
                    PLAYBOOK_SUBMISSION_ANSWER -> Value.PLAYBOOK_SUBMISSION_ANSWER
                    COMMERCE_PAYMENT -> Value.COMMERCE_PAYMENT
                    GSC_PROPERTY -> Value.GSC_PROPERTY
                    SOX_PROTECTED_DUMMY_TYPE -> Value.SOX_PROTECTED_DUMMY_TYPE
                    BLOG_LISTING_PAGE -> Value.BLOG_LISTING_PAGE
                    QUARANTINED_SUBMISSION -> Value.QUARANTINED_SUBMISSION
                    PAYMENT_SCHEDULE -> Value.PAYMENT_SCHEDULE
                    PAYMENT_SCHEDULE_INSTALLMENT -> Value.PAYMENT_SCHEDULE_INSTALLMENT
                    MARKETING_CAMPAIGN_UTM -> Value.MARKETING_CAMPAIGN_UTM
                    DISCOUNT_TEMPLATE -> Value.DISCOUNT_TEMPLATE
                    DISCOUNT_CODE -> Value.DISCOUNT_CODE
                    FEEDBACK_SURVEY -> Value.FEEDBACK_SURVEY
                    CMS_URL -> Value.CMS_URL
                    SALES_TASK -> Value.SALES_TASK
                    SALES_WORKLOAD -> Value.SALES_WORKLOAD
                    USER -> Value.USER
                    POSTAL_MAIL -> Value.POSTAL_MAIL
                    SCHEMAS_BACKEND_TEST -> Value.SCHEMAS_BACKEND_TEST
                    PAYMENT_LINK -> Value.PAYMENT_LINK
                    SUBMISSION_TAG -> Value.SUBMISSION_TAG
                    CAMPAIGN_STEP -> Value.CAMPAIGN_STEP
                    SCHEDULING_PAGE -> Value.SCHEDULING_PAGE
                    SOX_PROTECTED_TEST_TYPE -> Value.SOX_PROTECTED_TEST_TYPE
                    ORDER -> Value.ORDER
                    MARKETING_SMS -> Value.MARKETING_SMS
                    PARTNER_ACCOUNT -> Value.PARTNER_ACCOUNT
                    CAMPAIGN_TEMPLATE -> Value.CAMPAIGN_TEMPLATE
                    CAMPAIGN_TEMPLATE_STEP -> Value.CAMPAIGN_TEMPLATE_STEP
                    PLAYLIST -> Value.PLAYLIST
                    CLIP -> Value.CLIP
                    CAMPAIGN_BUDGET_ITEM -> Value.CAMPAIGN_BUDGET_ITEM
                    CAMPAIGN_SPEND_ITEM -> Value.CAMPAIGN_SPEND_ITEM
                    MIC -> Value.MIC
                    CONTENT_AUDIT -> Value.CONTENT_AUDIT
                    CONTENT_AUDIT_PAGE -> Value.CONTENT_AUDIT_PAGE
                    PLAYLIST_FOLDER -> Value.PLAYLIST_FOLDER
                    LEAD -> Value.LEAD
                    ABANDONED_CART -> Value.ABANDONED_CART
                    EXTERNAL_WEB_URL -> Value.EXTERNAL_WEB_URL
                    VIEW -> Value.VIEW
                    VIEW_BLOCK -> Value.VIEW_BLOCK
                    ROSTER -> Value.ROSTER
                    CART -> Value.CART
                    AUTOMATION_PLATFORM_FLOW_ACTION -> Value.AUTOMATION_PLATFORM_FLOW_ACTION
                    SOCIAL_PROFILE -> Value.SOCIAL_PROFILE
                    PARTNER_CLIENT -> Value.PARTNER_CLIENT
                    ROSTER_MEMBER -> Value.ROSTER_MEMBER
                    MARKETING_EVENT_ATTENDANCE -> Value.MARKETING_EVENT_ATTENDANCE
                    ALL_PAGES -> Value.ALL_PAGES
                    AI_FORECAST -> Value.AI_FORECAST
                    CRM_PIPELINES_DUMMY_TYPE -> Value.CRM_PIPELINES_DUMMY_TYPE
                    KNOWLEDGE_ARTICLE -> Value.KNOWLEDGE_ARTICLE
                    PROPERTY_INFO -> Value.PROPERTY_INFO
                    DATA_PRIVACY_CONSENT -> Value.DATA_PRIVACY_CONSENT
                    GOAL_TEMPLATE -> Value.GOAL_TEMPLATE
                    SCORE_CONFIGURATION -> Value.SCORE_CONFIGURATION
                    AUDIENCE -> Value.AUDIENCE
                    PARTNER_CLIENT_REVENUE -> Value.PARTNER_CLIENT_REVENUE
                    AUTOMATION_JOURNEY -> Value.AUTOMATION_JOURNEY
                    COMBO_EVENT_CONFIGURATION -> Value.COMBO_EVENT_CONFIGURATION
                    CRM_OBJECTS_DUMMY_TYPE -> Value.CRM_OBJECTS_DUMMY_TYPE
                    CASE_STUDY -> Value.CASE_STUDY
                    SERVICE -> Value.SERVICE
                    PODCAST_EPISODE -> Value.PODCAST_EPISODE
                    PARTNER_SERVICE -> Value.PARTNER_SERVICE
                    UNKNOWN -> Value.UNKNOWN
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws HubspotInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    CONTACT -> Known.CONTACT
                    COMPANY -> Known.COMPANY
                    DEAL -> Known.DEAL
                    ENGAGEMENT -> Known.ENGAGEMENT
                    TICKET -> Known.TICKET
                    OWNER -> Known.OWNER
                    PRODUCT -> Known.PRODUCT
                    LINE_ITEM -> Known.LINE_ITEM
                    BET_DELIVERABLE_SERVICE -> Known.BET_DELIVERABLE_SERVICE
                    CONTENT -> Known.CONTENT
                    CONVERSATION -> Known.CONVERSATION
                    BET_ALERT -> Known.BET_ALERT
                    PORTAL -> Known.PORTAL
                    QUOTE -> Known.QUOTE
                    FORM_SUBMISSION_INBOUNDDB -> Known.FORM_SUBMISSION_INBOUNDDB
                    QUOTA -> Known.QUOTA
                    UNSUBSCRIBE -> Known.UNSUBSCRIBE
                    COMMUNICATION -> Known.COMMUNICATION
                    FEEDBACK_SUBMISSION -> Known.FEEDBACK_SUBMISSION
                    ATTRIBUTION -> Known.ATTRIBUTION
                    SALESFORCE_SYNC_ERROR -> Known.SALESFORCE_SYNC_ERROR
                    RESTORABLE_CRM_OBJECT -> Known.RESTORABLE_CRM_OBJECT
                    HUB -> Known.HUB
                    LANDING_PAGE -> Known.LANDING_PAGE
                    PRODUCT_OR_FOLDER -> Known.PRODUCT_OR_FOLDER
                    TASK -> Known.TASK
                    FORM -> Known.FORM
                    MARKETING_EMAIL -> Known.MARKETING_EMAIL
                    AD_ACCOUNT -> Known.AD_ACCOUNT
                    AD_CAMPAIGN -> Known.AD_CAMPAIGN
                    AD_GROUP -> Known.AD_GROUP
                    AD -> Known.AD
                    KEYWORD -> Known.KEYWORD
                    CAMPAIGN -> Known.CAMPAIGN
                    SOCIAL_CHANNEL -> Known.SOCIAL_CHANNEL
                    SOCIAL_POST -> Known.SOCIAL_POST
                    SITE_PAGE -> Known.SITE_PAGE
                    BLOG_POST -> Known.BLOG_POST
                    IMPORT -> Known.IMPORT
                    EXPORT -> Known.EXPORT
                    CTA -> Known.CTA
                    TASK_TEMPLATE -> Known.TASK_TEMPLATE
                    AUTOMATION_PLATFORM_FLOW -> Known.AUTOMATION_PLATFORM_FLOW
                    OBJECT_LIST -> Known.OBJECT_LIST
                    NOTE -> Known.NOTE
                    MEETING_EVENT -> Known.MEETING_EVENT
                    CALL -> Known.CALL
                    EMAIL -> Known.EMAIL
                    PUBLISHING_TASK -> Known.PUBLISHING_TASK
                    CONVERSATION_SESSION -> Known.CONVERSATION_SESSION
                    CONTACT_CREATE_ATTRIBUTION -> Known.CONTACT_CREATE_ATTRIBUTION
                    INVOICE -> Known.INVOICE
                    MARKETING_EVENT -> Known.MARKETING_EVENT
                    CONVERSATION_INBOX -> Known.CONVERSATION_INBOX
                    CHATFLOW -> Known.CHATFLOW
                    MEDIA_BRIDGE -> Known.MEDIA_BRIDGE
                    SEQUENCE -> Known.SEQUENCE
                    SEQUENCE_STEP -> Known.SEQUENCE_STEP
                    FORECAST -> Known.FORECAST
                    SNIPPET -> Known.SNIPPET
                    TEMPLATE -> Known.TEMPLATE
                    DEAL_CREATE_ATTRIBUTION -> Known.DEAL_CREATE_ATTRIBUTION
                    QUOTE_TEMPLATE -> Known.QUOTE_TEMPLATE
                    QUOTE_MODULE -> Known.QUOTE_MODULE
                    QUOTE_MODULE_FIELD -> Known.QUOTE_MODULE_FIELD
                    QUOTE_FIELD -> Known.QUOTE_FIELD
                    SEQUENCE_ENROLLMENT -> Known.SEQUENCE_ENROLLMENT
                    SUBSCRIPTION -> Known.SUBSCRIPTION
                    ACCEPTANCE_TEST -> Known.ACCEPTANCE_TEST
                    SOCIAL_BROADCAST -> Known.SOCIAL_BROADCAST
                    DEAL_SPLIT -> Known.DEAL_SPLIT
                    DEAL_REGISTRATION -> Known.DEAL_REGISTRATION
                    GOAL_TARGET -> Known.GOAL_TARGET
                    GOAL_TARGET_GROUP -> Known.GOAL_TARGET_GROUP
                    PORTAL_OBJECT_SYNC_MESSAGE -> Known.PORTAL_OBJECT_SYNC_MESSAGE
                    FILE_MANAGER_FILE -> Known.FILE_MANAGER_FILE
                    FILE_MANAGER_FOLDER -> Known.FILE_MANAGER_FOLDER
                    SEQUENCE_STEP_ENROLLMENT -> Known.SEQUENCE_STEP_ENROLLMENT
                    APPROVAL -> Known.APPROVAL
                    APPROVAL_STEP -> Known.APPROVAL_STEP
                    CTA_VARIANT -> Known.CTA_VARIANT
                    SALES_DOCUMENT -> Known.SALES_DOCUMENT
                    DISCOUNT -> Known.DISCOUNT
                    FEE -> Known.FEE
                    TAX -> Known.TAX
                    MARKETING_CALENDAR -> Known.MARKETING_CALENDAR
                    PERMISSIONS_TESTING -> Known.PERMISSIONS_TESTING
                    PRIVACY_SCANNER_COOKIE -> Known.PRIVACY_SCANNER_COOKIE
                    DATA_SYNC_STATE -> Known.DATA_SYNC_STATE
                    WEB_INTERACTIVE -> Known.WEB_INTERACTIVE
                    PLAYBOOK -> Known.PLAYBOOK
                    FOLDER -> Known.FOLDER
                    PLAYBOOK_QUESTION -> Known.PLAYBOOK_QUESTION
                    PLAYBOOK_SUBMISSION -> Known.PLAYBOOK_SUBMISSION
                    PLAYBOOK_SUBMISSION_ANSWER -> Known.PLAYBOOK_SUBMISSION_ANSWER
                    COMMERCE_PAYMENT -> Known.COMMERCE_PAYMENT
                    GSC_PROPERTY -> Known.GSC_PROPERTY
                    SOX_PROTECTED_DUMMY_TYPE -> Known.SOX_PROTECTED_DUMMY_TYPE
                    BLOG_LISTING_PAGE -> Known.BLOG_LISTING_PAGE
                    QUARANTINED_SUBMISSION -> Known.QUARANTINED_SUBMISSION
                    PAYMENT_SCHEDULE -> Known.PAYMENT_SCHEDULE
                    PAYMENT_SCHEDULE_INSTALLMENT -> Known.PAYMENT_SCHEDULE_INSTALLMENT
                    MARKETING_CAMPAIGN_UTM -> Known.MARKETING_CAMPAIGN_UTM
                    DISCOUNT_TEMPLATE -> Known.DISCOUNT_TEMPLATE
                    DISCOUNT_CODE -> Known.DISCOUNT_CODE
                    FEEDBACK_SURVEY -> Known.FEEDBACK_SURVEY
                    CMS_URL -> Known.CMS_URL
                    SALES_TASK -> Known.SALES_TASK
                    SALES_WORKLOAD -> Known.SALES_WORKLOAD
                    USER -> Known.USER
                    POSTAL_MAIL -> Known.POSTAL_MAIL
                    SCHEMAS_BACKEND_TEST -> Known.SCHEMAS_BACKEND_TEST
                    PAYMENT_LINK -> Known.PAYMENT_LINK
                    SUBMISSION_TAG -> Known.SUBMISSION_TAG
                    CAMPAIGN_STEP -> Known.CAMPAIGN_STEP
                    SCHEDULING_PAGE -> Known.SCHEDULING_PAGE
                    SOX_PROTECTED_TEST_TYPE -> Known.SOX_PROTECTED_TEST_TYPE
                    ORDER -> Known.ORDER
                    MARKETING_SMS -> Known.MARKETING_SMS
                    PARTNER_ACCOUNT -> Known.PARTNER_ACCOUNT
                    CAMPAIGN_TEMPLATE -> Known.CAMPAIGN_TEMPLATE
                    CAMPAIGN_TEMPLATE_STEP -> Known.CAMPAIGN_TEMPLATE_STEP
                    PLAYLIST -> Known.PLAYLIST
                    CLIP -> Known.CLIP
                    CAMPAIGN_BUDGET_ITEM -> Known.CAMPAIGN_BUDGET_ITEM
                    CAMPAIGN_SPEND_ITEM -> Known.CAMPAIGN_SPEND_ITEM
                    MIC -> Known.MIC
                    CONTENT_AUDIT -> Known.CONTENT_AUDIT
                    CONTENT_AUDIT_PAGE -> Known.CONTENT_AUDIT_PAGE
                    PLAYLIST_FOLDER -> Known.PLAYLIST_FOLDER
                    LEAD -> Known.LEAD
                    ABANDONED_CART -> Known.ABANDONED_CART
                    EXTERNAL_WEB_URL -> Known.EXTERNAL_WEB_URL
                    VIEW -> Known.VIEW
                    VIEW_BLOCK -> Known.VIEW_BLOCK
                    ROSTER -> Known.ROSTER
                    CART -> Known.CART
                    AUTOMATION_PLATFORM_FLOW_ACTION -> Known.AUTOMATION_PLATFORM_FLOW_ACTION
                    SOCIAL_PROFILE -> Known.SOCIAL_PROFILE
                    PARTNER_CLIENT -> Known.PARTNER_CLIENT
                    ROSTER_MEMBER -> Known.ROSTER_MEMBER
                    MARKETING_EVENT_ATTENDANCE -> Known.MARKETING_EVENT_ATTENDANCE
                    ALL_PAGES -> Known.ALL_PAGES
                    AI_FORECAST -> Known.AI_FORECAST
                    CRM_PIPELINES_DUMMY_TYPE -> Known.CRM_PIPELINES_DUMMY_TYPE
                    KNOWLEDGE_ARTICLE -> Known.KNOWLEDGE_ARTICLE
                    PROPERTY_INFO -> Known.PROPERTY_INFO
                    DATA_PRIVACY_CONSENT -> Known.DATA_PRIVACY_CONSENT
                    GOAL_TEMPLATE -> Known.GOAL_TEMPLATE
                    SCORE_CONFIGURATION -> Known.SCORE_CONFIGURATION
                    AUDIENCE -> Known.AUDIENCE
                    PARTNER_CLIENT_REVENUE -> Known.PARTNER_CLIENT_REVENUE
                    AUTOMATION_JOURNEY -> Known.AUTOMATION_JOURNEY
                    COMBO_EVENT_CONFIGURATION -> Known.COMBO_EVENT_CONFIGURATION
                    CRM_OBJECTS_DUMMY_TYPE -> Known.CRM_OBJECTS_DUMMY_TYPE
                    CASE_STUDY -> Known.CASE_STUDY
                    SERVICE -> Known.SERVICE
                    PODCAST_EPISODE -> Known.PODCAST_EPISODE
                    PARTNER_SERVICE -> Known.PARTNER_SERVICE
                    UNKNOWN -> Known.UNKNOWN
                    else -> throw HubspotInvalidDataException("Unknown FromObjectType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws HubspotInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    HubspotInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): FromObjectType = apply {
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

                return other is FromObjectType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The name of the destination object type (e.g,. "DEAL" or "QUOTE"). */
        class ToObjectType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val CONTACT = of("CONTACT")

                @JvmField val COMPANY = of("COMPANY")

                @JvmField val DEAL = of("DEAL")

                @JvmField val ENGAGEMENT = of("ENGAGEMENT")

                @JvmField val TICKET = of("TICKET")

                @JvmField val OWNER = of("OWNER")

                @JvmField val PRODUCT = of("PRODUCT")

                @JvmField val LINE_ITEM = of("LINE_ITEM")

                @JvmField val BET_DELIVERABLE_SERVICE = of("BET_DELIVERABLE_SERVICE")

                @JvmField val CONTENT = of("CONTENT")

                @JvmField val CONVERSATION = of("CONVERSATION")

                @JvmField val BET_ALERT = of("BET_ALERT")

                @JvmField val PORTAL = of("PORTAL")

                @JvmField val QUOTE = of("QUOTE")

                @JvmField val FORM_SUBMISSION_INBOUNDDB = of("FORM_SUBMISSION_INBOUNDDB")

                @JvmField val QUOTA = of("QUOTA")

                @JvmField val UNSUBSCRIBE = of("UNSUBSCRIBE")

                @JvmField val COMMUNICATION = of("COMMUNICATION")

                @JvmField val FEEDBACK_SUBMISSION = of("FEEDBACK_SUBMISSION")

                @JvmField val ATTRIBUTION = of("ATTRIBUTION")

                @JvmField val SALESFORCE_SYNC_ERROR = of("SALESFORCE_SYNC_ERROR")

                @JvmField val RESTORABLE_CRM_OBJECT = of("RESTORABLE_CRM_OBJECT")

                @JvmField val HUB = of("HUB")

                @JvmField val LANDING_PAGE = of("LANDING_PAGE")

                @JvmField val PRODUCT_OR_FOLDER = of("PRODUCT_OR_FOLDER")

                @JvmField val TASK = of("TASK")

                @JvmField val FORM = of("FORM")

                @JvmField val MARKETING_EMAIL = of("MARKETING_EMAIL")

                @JvmField val AD_ACCOUNT = of("AD_ACCOUNT")

                @JvmField val AD_CAMPAIGN = of("AD_CAMPAIGN")

                @JvmField val AD_GROUP = of("AD_GROUP")

                @JvmField val AD = of("AD")

                @JvmField val KEYWORD = of("KEYWORD")

                @JvmField val CAMPAIGN = of("CAMPAIGN")

                @JvmField val SOCIAL_CHANNEL = of("SOCIAL_CHANNEL")

                @JvmField val SOCIAL_POST = of("SOCIAL_POST")

                @JvmField val SITE_PAGE = of("SITE_PAGE")

                @JvmField val BLOG_POST = of("BLOG_POST")

                @JvmField val IMPORT = of("IMPORT")

                @JvmField val EXPORT = of("EXPORT")

                @JvmField val CTA = of("CTA")

                @JvmField val TASK_TEMPLATE = of("TASK_TEMPLATE")

                @JvmField val AUTOMATION_PLATFORM_FLOW = of("AUTOMATION_PLATFORM_FLOW")

                @JvmField val OBJECT_LIST = of("OBJECT_LIST")

                @JvmField val NOTE = of("NOTE")

                @JvmField val MEETING_EVENT = of("MEETING_EVENT")

                @JvmField val CALL = of("CALL")

                @JvmField val EMAIL = of("EMAIL")

                @JvmField val PUBLISHING_TASK = of("PUBLISHING_TASK")

                @JvmField val CONVERSATION_SESSION = of("CONVERSATION_SESSION")

                @JvmField val CONTACT_CREATE_ATTRIBUTION = of("CONTACT_CREATE_ATTRIBUTION")

                @JvmField val INVOICE = of("INVOICE")

                @JvmField val MARKETING_EVENT = of("MARKETING_EVENT")

                @JvmField val CONVERSATION_INBOX = of("CONVERSATION_INBOX")

                @JvmField val CHATFLOW = of("CHATFLOW")

                @JvmField val MEDIA_BRIDGE = of("MEDIA_BRIDGE")

                @JvmField val SEQUENCE = of("SEQUENCE")

                @JvmField val SEQUENCE_STEP = of("SEQUENCE_STEP")

                @JvmField val FORECAST = of("FORECAST")

                @JvmField val SNIPPET = of("SNIPPET")

                @JvmField val TEMPLATE = of("TEMPLATE")

                @JvmField val DEAL_CREATE_ATTRIBUTION = of("DEAL_CREATE_ATTRIBUTION")

                @JvmField val QUOTE_TEMPLATE = of("QUOTE_TEMPLATE")

                @JvmField val QUOTE_MODULE = of("QUOTE_MODULE")

                @JvmField val QUOTE_MODULE_FIELD = of("QUOTE_MODULE_FIELD")

                @JvmField val QUOTE_FIELD = of("QUOTE_FIELD")

                @JvmField val SEQUENCE_ENROLLMENT = of("SEQUENCE_ENROLLMENT")

                @JvmField val SUBSCRIPTION = of("SUBSCRIPTION")

                @JvmField val ACCEPTANCE_TEST = of("ACCEPTANCE_TEST")

                @JvmField val SOCIAL_BROADCAST = of("SOCIAL_BROADCAST")

                @JvmField val DEAL_SPLIT = of("DEAL_SPLIT")

                @JvmField val DEAL_REGISTRATION = of("DEAL_REGISTRATION")

                @JvmField val GOAL_TARGET = of("GOAL_TARGET")

                @JvmField val GOAL_TARGET_GROUP = of("GOAL_TARGET_GROUP")

                @JvmField val PORTAL_OBJECT_SYNC_MESSAGE = of("PORTAL_OBJECT_SYNC_MESSAGE")

                @JvmField val FILE_MANAGER_FILE = of("FILE_MANAGER_FILE")

                @JvmField val FILE_MANAGER_FOLDER = of("FILE_MANAGER_FOLDER")

                @JvmField val SEQUENCE_STEP_ENROLLMENT = of("SEQUENCE_STEP_ENROLLMENT")

                @JvmField val APPROVAL = of("APPROVAL")

                @JvmField val APPROVAL_STEP = of("APPROVAL_STEP")

                @JvmField val CTA_VARIANT = of("CTA_VARIANT")

                @JvmField val SALES_DOCUMENT = of("SALES_DOCUMENT")

                @JvmField val DISCOUNT = of("DISCOUNT")

                @JvmField val FEE = of("FEE")

                @JvmField val TAX = of("TAX")

                @JvmField val MARKETING_CALENDAR = of("MARKETING_CALENDAR")

                @JvmField val PERMISSIONS_TESTING = of("PERMISSIONS_TESTING")

                @JvmField val PRIVACY_SCANNER_COOKIE = of("PRIVACY_SCANNER_COOKIE")

                @JvmField val DATA_SYNC_STATE = of("DATA_SYNC_STATE")

                @JvmField val WEB_INTERACTIVE = of("WEB_INTERACTIVE")

                @JvmField val PLAYBOOK = of("PLAYBOOK")

                @JvmField val FOLDER = of("FOLDER")

                @JvmField val PLAYBOOK_QUESTION = of("PLAYBOOK_QUESTION")

                @JvmField val PLAYBOOK_SUBMISSION = of("PLAYBOOK_SUBMISSION")

                @JvmField val PLAYBOOK_SUBMISSION_ANSWER = of("PLAYBOOK_SUBMISSION_ANSWER")

                @JvmField val COMMERCE_PAYMENT = of("COMMERCE_PAYMENT")

                @JvmField val GSC_PROPERTY = of("GSC_PROPERTY")

                @JvmField val SOX_PROTECTED_DUMMY_TYPE = of("SOX_PROTECTED_DUMMY_TYPE")

                @JvmField val BLOG_LISTING_PAGE = of("BLOG_LISTING_PAGE")

                @JvmField val QUARANTINED_SUBMISSION = of("QUARANTINED_SUBMISSION")

                @JvmField val PAYMENT_SCHEDULE = of("PAYMENT_SCHEDULE")

                @JvmField val PAYMENT_SCHEDULE_INSTALLMENT = of("PAYMENT_SCHEDULE_INSTALLMENT")

                @JvmField val MARKETING_CAMPAIGN_UTM = of("MARKETING_CAMPAIGN_UTM")

                @JvmField val DISCOUNT_TEMPLATE = of("DISCOUNT_TEMPLATE")

                @JvmField val DISCOUNT_CODE = of("DISCOUNT_CODE")

                @JvmField val FEEDBACK_SURVEY = of("FEEDBACK_SURVEY")

                @JvmField val CMS_URL = of("CMS_URL")

                @JvmField val SALES_TASK = of("SALES_TASK")

                @JvmField val SALES_WORKLOAD = of("SALES_WORKLOAD")

                @JvmField val USER = of("USER")

                @JvmField val POSTAL_MAIL = of("POSTAL_MAIL")

                @JvmField val SCHEMAS_BACKEND_TEST = of("SCHEMAS_BACKEND_TEST")

                @JvmField val PAYMENT_LINK = of("PAYMENT_LINK")

                @JvmField val SUBMISSION_TAG = of("SUBMISSION_TAG")

                @JvmField val CAMPAIGN_STEP = of("CAMPAIGN_STEP")

                @JvmField val SCHEDULING_PAGE = of("SCHEDULING_PAGE")

                @JvmField val SOX_PROTECTED_TEST_TYPE = of("SOX_PROTECTED_TEST_TYPE")

                @JvmField val ORDER = of("ORDER")

                @JvmField val MARKETING_SMS = of("MARKETING_SMS")

                @JvmField val PARTNER_ACCOUNT = of("PARTNER_ACCOUNT")

                @JvmField val CAMPAIGN_TEMPLATE = of("CAMPAIGN_TEMPLATE")

                @JvmField val CAMPAIGN_TEMPLATE_STEP = of("CAMPAIGN_TEMPLATE_STEP")

                @JvmField val PLAYLIST = of("PLAYLIST")

                @JvmField val CLIP = of("CLIP")

                @JvmField val CAMPAIGN_BUDGET_ITEM = of("CAMPAIGN_BUDGET_ITEM")

                @JvmField val CAMPAIGN_SPEND_ITEM = of("CAMPAIGN_SPEND_ITEM")

                @JvmField val MIC = of("MIC")

                @JvmField val CONTENT_AUDIT = of("CONTENT_AUDIT")

                @JvmField val CONTENT_AUDIT_PAGE = of("CONTENT_AUDIT_PAGE")

                @JvmField val PLAYLIST_FOLDER = of("PLAYLIST_FOLDER")

                @JvmField val LEAD = of("LEAD")

                @JvmField val ABANDONED_CART = of("ABANDONED_CART")

                @JvmField val EXTERNAL_WEB_URL = of("EXTERNAL_WEB_URL")

                @JvmField val VIEW = of("VIEW")

                @JvmField val VIEW_BLOCK = of("VIEW_BLOCK")

                @JvmField val ROSTER = of("ROSTER")

                @JvmField val CART = of("CART")

                @JvmField
                val AUTOMATION_PLATFORM_FLOW_ACTION = of("AUTOMATION_PLATFORM_FLOW_ACTION")

                @JvmField val SOCIAL_PROFILE = of("SOCIAL_PROFILE")

                @JvmField val PARTNER_CLIENT = of("PARTNER_CLIENT")

                @JvmField val ROSTER_MEMBER = of("ROSTER_MEMBER")

                @JvmField val MARKETING_EVENT_ATTENDANCE = of("MARKETING_EVENT_ATTENDANCE")

                @JvmField val ALL_PAGES = of("ALL_PAGES")

                @JvmField val AI_FORECAST = of("AI_FORECAST")

                @JvmField val CRM_PIPELINES_DUMMY_TYPE = of("CRM_PIPELINES_DUMMY_TYPE")

                @JvmField val KNOWLEDGE_ARTICLE = of("KNOWLEDGE_ARTICLE")

                @JvmField val PROPERTY_INFO = of("PROPERTY_INFO")

                @JvmField val DATA_PRIVACY_CONSENT = of("DATA_PRIVACY_CONSENT")

                @JvmField val GOAL_TEMPLATE = of("GOAL_TEMPLATE")

                @JvmField val SCORE_CONFIGURATION = of("SCORE_CONFIGURATION")

                @JvmField val AUDIENCE = of("AUDIENCE")

                @JvmField val PARTNER_CLIENT_REVENUE = of("PARTNER_CLIENT_REVENUE")

                @JvmField val AUTOMATION_JOURNEY = of("AUTOMATION_JOURNEY")

                @JvmField val COMBO_EVENT_CONFIGURATION = of("COMBO_EVENT_CONFIGURATION")

                @JvmField val CRM_OBJECTS_DUMMY_TYPE = of("CRM_OBJECTS_DUMMY_TYPE")

                @JvmField val CASE_STUDY = of("CASE_STUDY")

                @JvmField val SERVICE = of("SERVICE")

                @JvmField val PODCAST_EPISODE = of("PODCAST_EPISODE")

                @JvmField val PARTNER_SERVICE = of("PARTNER_SERVICE")

                @JvmField val UNKNOWN = of("UNKNOWN")

                @JvmStatic fun of(value: String) = ToObjectType(JsonField.of(value))
            }

            /** An enum containing [ToObjectType]'s known values. */
            enum class Known {
                CONTACT,
                COMPANY,
                DEAL,
                ENGAGEMENT,
                TICKET,
                OWNER,
                PRODUCT,
                LINE_ITEM,
                BET_DELIVERABLE_SERVICE,
                CONTENT,
                CONVERSATION,
                BET_ALERT,
                PORTAL,
                QUOTE,
                FORM_SUBMISSION_INBOUNDDB,
                QUOTA,
                UNSUBSCRIBE,
                COMMUNICATION,
                FEEDBACK_SUBMISSION,
                ATTRIBUTION,
                SALESFORCE_SYNC_ERROR,
                RESTORABLE_CRM_OBJECT,
                HUB,
                LANDING_PAGE,
                PRODUCT_OR_FOLDER,
                TASK,
                FORM,
                MARKETING_EMAIL,
                AD_ACCOUNT,
                AD_CAMPAIGN,
                AD_GROUP,
                AD,
                KEYWORD,
                CAMPAIGN,
                SOCIAL_CHANNEL,
                SOCIAL_POST,
                SITE_PAGE,
                BLOG_POST,
                IMPORT,
                EXPORT,
                CTA,
                TASK_TEMPLATE,
                AUTOMATION_PLATFORM_FLOW,
                OBJECT_LIST,
                NOTE,
                MEETING_EVENT,
                CALL,
                EMAIL,
                PUBLISHING_TASK,
                CONVERSATION_SESSION,
                CONTACT_CREATE_ATTRIBUTION,
                INVOICE,
                MARKETING_EVENT,
                CONVERSATION_INBOX,
                CHATFLOW,
                MEDIA_BRIDGE,
                SEQUENCE,
                SEQUENCE_STEP,
                FORECAST,
                SNIPPET,
                TEMPLATE,
                DEAL_CREATE_ATTRIBUTION,
                QUOTE_TEMPLATE,
                QUOTE_MODULE,
                QUOTE_MODULE_FIELD,
                QUOTE_FIELD,
                SEQUENCE_ENROLLMENT,
                SUBSCRIPTION,
                ACCEPTANCE_TEST,
                SOCIAL_BROADCAST,
                DEAL_SPLIT,
                DEAL_REGISTRATION,
                GOAL_TARGET,
                GOAL_TARGET_GROUP,
                PORTAL_OBJECT_SYNC_MESSAGE,
                FILE_MANAGER_FILE,
                FILE_MANAGER_FOLDER,
                SEQUENCE_STEP_ENROLLMENT,
                APPROVAL,
                APPROVAL_STEP,
                CTA_VARIANT,
                SALES_DOCUMENT,
                DISCOUNT,
                FEE,
                TAX,
                MARKETING_CALENDAR,
                PERMISSIONS_TESTING,
                PRIVACY_SCANNER_COOKIE,
                DATA_SYNC_STATE,
                WEB_INTERACTIVE,
                PLAYBOOK,
                FOLDER,
                PLAYBOOK_QUESTION,
                PLAYBOOK_SUBMISSION,
                PLAYBOOK_SUBMISSION_ANSWER,
                COMMERCE_PAYMENT,
                GSC_PROPERTY,
                SOX_PROTECTED_DUMMY_TYPE,
                BLOG_LISTING_PAGE,
                QUARANTINED_SUBMISSION,
                PAYMENT_SCHEDULE,
                PAYMENT_SCHEDULE_INSTALLMENT,
                MARKETING_CAMPAIGN_UTM,
                DISCOUNT_TEMPLATE,
                DISCOUNT_CODE,
                FEEDBACK_SURVEY,
                CMS_URL,
                SALES_TASK,
                SALES_WORKLOAD,
                USER,
                POSTAL_MAIL,
                SCHEMAS_BACKEND_TEST,
                PAYMENT_LINK,
                SUBMISSION_TAG,
                CAMPAIGN_STEP,
                SCHEDULING_PAGE,
                SOX_PROTECTED_TEST_TYPE,
                ORDER,
                MARKETING_SMS,
                PARTNER_ACCOUNT,
                CAMPAIGN_TEMPLATE,
                CAMPAIGN_TEMPLATE_STEP,
                PLAYLIST,
                CLIP,
                CAMPAIGN_BUDGET_ITEM,
                CAMPAIGN_SPEND_ITEM,
                MIC,
                CONTENT_AUDIT,
                CONTENT_AUDIT_PAGE,
                PLAYLIST_FOLDER,
                LEAD,
                ABANDONED_CART,
                EXTERNAL_WEB_URL,
                VIEW,
                VIEW_BLOCK,
                ROSTER,
                CART,
                AUTOMATION_PLATFORM_FLOW_ACTION,
                SOCIAL_PROFILE,
                PARTNER_CLIENT,
                ROSTER_MEMBER,
                MARKETING_EVENT_ATTENDANCE,
                ALL_PAGES,
                AI_FORECAST,
                CRM_PIPELINES_DUMMY_TYPE,
                KNOWLEDGE_ARTICLE,
                PROPERTY_INFO,
                DATA_PRIVACY_CONSENT,
                GOAL_TEMPLATE,
                SCORE_CONFIGURATION,
                AUDIENCE,
                PARTNER_CLIENT_REVENUE,
                AUTOMATION_JOURNEY,
                COMBO_EVENT_CONFIGURATION,
                CRM_OBJECTS_DUMMY_TYPE,
                CASE_STUDY,
                SERVICE,
                PODCAST_EPISODE,
                PARTNER_SERVICE,
                UNKNOWN,
            }

            /**
             * An enum containing [ToObjectType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ToObjectType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CONTACT,
                COMPANY,
                DEAL,
                ENGAGEMENT,
                TICKET,
                OWNER,
                PRODUCT,
                LINE_ITEM,
                BET_DELIVERABLE_SERVICE,
                CONTENT,
                CONVERSATION,
                BET_ALERT,
                PORTAL,
                QUOTE,
                FORM_SUBMISSION_INBOUNDDB,
                QUOTA,
                UNSUBSCRIBE,
                COMMUNICATION,
                FEEDBACK_SUBMISSION,
                ATTRIBUTION,
                SALESFORCE_SYNC_ERROR,
                RESTORABLE_CRM_OBJECT,
                HUB,
                LANDING_PAGE,
                PRODUCT_OR_FOLDER,
                TASK,
                FORM,
                MARKETING_EMAIL,
                AD_ACCOUNT,
                AD_CAMPAIGN,
                AD_GROUP,
                AD,
                KEYWORD,
                CAMPAIGN,
                SOCIAL_CHANNEL,
                SOCIAL_POST,
                SITE_PAGE,
                BLOG_POST,
                IMPORT,
                EXPORT,
                CTA,
                TASK_TEMPLATE,
                AUTOMATION_PLATFORM_FLOW,
                OBJECT_LIST,
                NOTE,
                MEETING_EVENT,
                CALL,
                EMAIL,
                PUBLISHING_TASK,
                CONVERSATION_SESSION,
                CONTACT_CREATE_ATTRIBUTION,
                INVOICE,
                MARKETING_EVENT,
                CONVERSATION_INBOX,
                CHATFLOW,
                MEDIA_BRIDGE,
                SEQUENCE,
                SEQUENCE_STEP,
                FORECAST,
                SNIPPET,
                TEMPLATE,
                DEAL_CREATE_ATTRIBUTION,
                QUOTE_TEMPLATE,
                QUOTE_MODULE,
                QUOTE_MODULE_FIELD,
                QUOTE_FIELD,
                SEQUENCE_ENROLLMENT,
                SUBSCRIPTION,
                ACCEPTANCE_TEST,
                SOCIAL_BROADCAST,
                DEAL_SPLIT,
                DEAL_REGISTRATION,
                GOAL_TARGET,
                GOAL_TARGET_GROUP,
                PORTAL_OBJECT_SYNC_MESSAGE,
                FILE_MANAGER_FILE,
                FILE_MANAGER_FOLDER,
                SEQUENCE_STEP_ENROLLMENT,
                APPROVAL,
                APPROVAL_STEP,
                CTA_VARIANT,
                SALES_DOCUMENT,
                DISCOUNT,
                FEE,
                TAX,
                MARKETING_CALENDAR,
                PERMISSIONS_TESTING,
                PRIVACY_SCANNER_COOKIE,
                DATA_SYNC_STATE,
                WEB_INTERACTIVE,
                PLAYBOOK,
                FOLDER,
                PLAYBOOK_QUESTION,
                PLAYBOOK_SUBMISSION,
                PLAYBOOK_SUBMISSION_ANSWER,
                COMMERCE_PAYMENT,
                GSC_PROPERTY,
                SOX_PROTECTED_DUMMY_TYPE,
                BLOG_LISTING_PAGE,
                QUARANTINED_SUBMISSION,
                PAYMENT_SCHEDULE,
                PAYMENT_SCHEDULE_INSTALLMENT,
                MARKETING_CAMPAIGN_UTM,
                DISCOUNT_TEMPLATE,
                DISCOUNT_CODE,
                FEEDBACK_SURVEY,
                CMS_URL,
                SALES_TASK,
                SALES_WORKLOAD,
                USER,
                POSTAL_MAIL,
                SCHEMAS_BACKEND_TEST,
                PAYMENT_LINK,
                SUBMISSION_TAG,
                CAMPAIGN_STEP,
                SCHEDULING_PAGE,
                SOX_PROTECTED_TEST_TYPE,
                ORDER,
                MARKETING_SMS,
                PARTNER_ACCOUNT,
                CAMPAIGN_TEMPLATE,
                CAMPAIGN_TEMPLATE_STEP,
                PLAYLIST,
                CLIP,
                CAMPAIGN_BUDGET_ITEM,
                CAMPAIGN_SPEND_ITEM,
                MIC,
                CONTENT_AUDIT,
                CONTENT_AUDIT_PAGE,
                PLAYLIST_FOLDER,
                LEAD,
                ABANDONED_CART,
                EXTERNAL_WEB_URL,
                VIEW,
                VIEW_BLOCK,
                ROSTER,
                CART,
                AUTOMATION_PLATFORM_FLOW_ACTION,
                SOCIAL_PROFILE,
                PARTNER_CLIENT,
                ROSTER_MEMBER,
                MARKETING_EVENT_ATTENDANCE,
                ALL_PAGES,
                AI_FORECAST,
                CRM_PIPELINES_DUMMY_TYPE,
                KNOWLEDGE_ARTICLE,
                PROPERTY_INFO,
                DATA_PRIVACY_CONSENT,
                GOAL_TEMPLATE,
                SCORE_CONFIGURATION,
                AUDIENCE,
                PARTNER_CLIENT_REVENUE,
                AUTOMATION_JOURNEY,
                COMBO_EVENT_CONFIGURATION,
                CRM_OBJECTS_DUMMY_TYPE,
                CASE_STUDY,
                SERVICE,
                PODCAST_EPISODE,
                PARTNER_SERVICE,
                UNKNOWN,
                /**
                 * An enum member indicating that [ToObjectType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    CONTACT -> Value.CONTACT
                    COMPANY -> Value.COMPANY
                    DEAL -> Value.DEAL
                    ENGAGEMENT -> Value.ENGAGEMENT
                    TICKET -> Value.TICKET
                    OWNER -> Value.OWNER
                    PRODUCT -> Value.PRODUCT
                    LINE_ITEM -> Value.LINE_ITEM
                    BET_DELIVERABLE_SERVICE -> Value.BET_DELIVERABLE_SERVICE
                    CONTENT -> Value.CONTENT
                    CONVERSATION -> Value.CONVERSATION
                    BET_ALERT -> Value.BET_ALERT
                    PORTAL -> Value.PORTAL
                    QUOTE -> Value.QUOTE
                    FORM_SUBMISSION_INBOUNDDB -> Value.FORM_SUBMISSION_INBOUNDDB
                    QUOTA -> Value.QUOTA
                    UNSUBSCRIBE -> Value.UNSUBSCRIBE
                    COMMUNICATION -> Value.COMMUNICATION
                    FEEDBACK_SUBMISSION -> Value.FEEDBACK_SUBMISSION
                    ATTRIBUTION -> Value.ATTRIBUTION
                    SALESFORCE_SYNC_ERROR -> Value.SALESFORCE_SYNC_ERROR
                    RESTORABLE_CRM_OBJECT -> Value.RESTORABLE_CRM_OBJECT
                    HUB -> Value.HUB
                    LANDING_PAGE -> Value.LANDING_PAGE
                    PRODUCT_OR_FOLDER -> Value.PRODUCT_OR_FOLDER
                    TASK -> Value.TASK
                    FORM -> Value.FORM
                    MARKETING_EMAIL -> Value.MARKETING_EMAIL
                    AD_ACCOUNT -> Value.AD_ACCOUNT
                    AD_CAMPAIGN -> Value.AD_CAMPAIGN
                    AD_GROUP -> Value.AD_GROUP
                    AD -> Value.AD
                    KEYWORD -> Value.KEYWORD
                    CAMPAIGN -> Value.CAMPAIGN
                    SOCIAL_CHANNEL -> Value.SOCIAL_CHANNEL
                    SOCIAL_POST -> Value.SOCIAL_POST
                    SITE_PAGE -> Value.SITE_PAGE
                    BLOG_POST -> Value.BLOG_POST
                    IMPORT -> Value.IMPORT
                    EXPORT -> Value.EXPORT
                    CTA -> Value.CTA
                    TASK_TEMPLATE -> Value.TASK_TEMPLATE
                    AUTOMATION_PLATFORM_FLOW -> Value.AUTOMATION_PLATFORM_FLOW
                    OBJECT_LIST -> Value.OBJECT_LIST
                    NOTE -> Value.NOTE
                    MEETING_EVENT -> Value.MEETING_EVENT
                    CALL -> Value.CALL
                    EMAIL -> Value.EMAIL
                    PUBLISHING_TASK -> Value.PUBLISHING_TASK
                    CONVERSATION_SESSION -> Value.CONVERSATION_SESSION
                    CONTACT_CREATE_ATTRIBUTION -> Value.CONTACT_CREATE_ATTRIBUTION
                    INVOICE -> Value.INVOICE
                    MARKETING_EVENT -> Value.MARKETING_EVENT
                    CONVERSATION_INBOX -> Value.CONVERSATION_INBOX
                    CHATFLOW -> Value.CHATFLOW
                    MEDIA_BRIDGE -> Value.MEDIA_BRIDGE
                    SEQUENCE -> Value.SEQUENCE
                    SEQUENCE_STEP -> Value.SEQUENCE_STEP
                    FORECAST -> Value.FORECAST
                    SNIPPET -> Value.SNIPPET
                    TEMPLATE -> Value.TEMPLATE
                    DEAL_CREATE_ATTRIBUTION -> Value.DEAL_CREATE_ATTRIBUTION
                    QUOTE_TEMPLATE -> Value.QUOTE_TEMPLATE
                    QUOTE_MODULE -> Value.QUOTE_MODULE
                    QUOTE_MODULE_FIELD -> Value.QUOTE_MODULE_FIELD
                    QUOTE_FIELD -> Value.QUOTE_FIELD
                    SEQUENCE_ENROLLMENT -> Value.SEQUENCE_ENROLLMENT
                    SUBSCRIPTION -> Value.SUBSCRIPTION
                    ACCEPTANCE_TEST -> Value.ACCEPTANCE_TEST
                    SOCIAL_BROADCAST -> Value.SOCIAL_BROADCAST
                    DEAL_SPLIT -> Value.DEAL_SPLIT
                    DEAL_REGISTRATION -> Value.DEAL_REGISTRATION
                    GOAL_TARGET -> Value.GOAL_TARGET
                    GOAL_TARGET_GROUP -> Value.GOAL_TARGET_GROUP
                    PORTAL_OBJECT_SYNC_MESSAGE -> Value.PORTAL_OBJECT_SYNC_MESSAGE
                    FILE_MANAGER_FILE -> Value.FILE_MANAGER_FILE
                    FILE_MANAGER_FOLDER -> Value.FILE_MANAGER_FOLDER
                    SEQUENCE_STEP_ENROLLMENT -> Value.SEQUENCE_STEP_ENROLLMENT
                    APPROVAL -> Value.APPROVAL
                    APPROVAL_STEP -> Value.APPROVAL_STEP
                    CTA_VARIANT -> Value.CTA_VARIANT
                    SALES_DOCUMENT -> Value.SALES_DOCUMENT
                    DISCOUNT -> Value.DISCOUNT
                    FEE -> Value.FEE
                    TAX -> Value.TAX
                    MARKETING_CALENDAR -> Value.MARKETING_CALENDAR
                    PERMISSIONS_TESTING -> Value.PERMISSIONS_TESTING
                    PRIVACY_SCANNER_COOKIE -> Value.PRIVACY_SCANNER_COOKIE
                    DATA_SYNC_STATE -> Value.DATA_SYNC_STATE
                    WEB_INTERACTIVE -> Value.WEB_INTERACTIVE
                    PLAYBOOK -> Value.PLAYBOOK
                    FOLDER -> Value.FOLDER
                    PLAYBOOK_QUESTION -> Value.PLAYBOOK_QUESTION
                    PLAYBOOK_SUBMISSION -> Value.PLAYBOOK_SUBMISSION
                    PLAYBOOK_SUBMISSION_ANSWER -> Value.PLAYBOOK_SUBMISSION_ANSWER
                    COMMERCE_PAYMENT -> Value.COMMERCE_PAYMENT
                    GSC_PROPERTY -> Value.GSC_PROPERTY
                    SOX_PROTECTED_DUMMY_TYPE -> Value.SOX_PROTECTED_DUMMY_TYPE
                    BLOG_LISTING_PAGE -> Value.BLOG_LISTING_PAGE
                    QUARANTINED_SUBMISSION -> Value.QUARANTINED_SUBMISSION
                    PAYMENT_SCHEDULE -> Value.PAYMENT_SCHEDULE
                    PAYMENT_SCHEDULE_INSTALLMENT -> Value.PAYMENT_SCHEDULE_INSTALLMENT
                    MARKETING_CAMPAIGN_UTM -> Value.MARKETING_CAMPAIGN_UTM
                    DISCOUNT_TEMPLATE -> Value.DISCOUNT_TEMPLATE
                    DISCOUNT_CODE -> Value.DISCOUNT_CODE
                    FEEDBACK_SURVEY -> Value.FEEDBACK_SURVEY
                    CMS_URL -> Value.CMS_URL
                    SALES_TASK -> Value.SALES_TASK
                    SALES_WORKLOAD -> Value.SALES_WORKLOAD
                    USER -> Value.USER
                    POSTAL_MAIL -> Value.POSTAL_MAIL
                    SCHEMAS_BACKEND_TEST -> Value.SCHEMAS_BACKEND_TEST
                    PAYMENT_LINK -> Value.PAYMENT_LINK
                    SUBMISSION_TAG -> Value.SUBMISSION_TAG
                    CAMPAIGN_STEP -> Value.CAMPAIGN_STEP
                    SCHEDULING_PAGE -> Value.SCHEDULING_PAGE
                    SOX_PROTECTED_TEST_TYPE -> Value.SOX_PROTECTED_TEST_TYPE
                    ORDER -> Value.ORDER
                    MARKETING_SMS -> Value.MARKETING_SMS
                    PARTNER_ACCOUNT -> Value.PARTNER_ACCOUNT
                    CAMPAIGN_TEMPLATE -> Value.CAMPAIGN_TEMPLATE
                    CAMPAIGN_TEMPLATE_STEP -> Value.CAMPAIGN_TEMPLATE_STEP
                    PLAYLIST -> Value.PLAYLIST
                    CLIP -> Value.CLIP
                    CAMPAIGN_BUDGET_ITEM -> Value.CAMPAIGN_BUDGET_ITEM
                    CAMPAIGN_SPEND_ITEM -> Value.CAMPAIGN_SPEND_ITEM
                    MIC -> Value.MIC
                    CONTENT_AUDIT -> Value.CONTENT_AUDIT
                    CONTENT_AUDIT_PAGE -> Value.CONTENT_AUDIT_PAGE
                    PLAYLIST_FOLDER -> Value.PLAYLIST_FOLDER
                    LEAD -> Value.LEAD
                    ABANDONED_CART -> Value.ABANDONED_CART
                    EXTERNAL_WEB_URL -> Value.EXTERNAL_WEB_URL
                    VIEW -> Value.VIEW
                    VIEW_BLOCK -> Value.VIEW_BLOCK
                    ROSTER -> Value.ROSTER
                    CART -> Value.CART
                    AUTOMATION_PLATFORM_FLOW_ACTION -> Value.AUTOMATION_PLATFORM_FLOW_ACTION
                    SOCIAL_PROFILE -> Value.SOCIAL_PROFILE
                    PARTNER_CLIENT -> Value.PARTNER_CLIENT
                    ROSTER_MEMBER -> Value.ROSTER_MEMBER
                    MARKETING_EVENT_ATTENDANCE -> Value.MARKETING_EVENT_ATTENDANCE
                    ALL_PAGES -> Value.ALL_PAGES
                    AI_FORECAST -> Value.AI_FORECAST
                    CRM_PIPELINES_DUMMY_TYPE -> Value.CRM_PIPELINES_DUMMY_TYPE
                    KNOWLEDGE_ARTICLE -> Value.KNOWLEDGE_ARTICLE
                    PROPERTY_INFO -> Value.PROPERTY_INFO
                    DATA_PRIVACY_CONSENT -> Value.DATA_PRIVACY_CONSENT
                    GOAL_TEMPLATE -> Value.GOAL_TEMPLATE
                    SCORE_CONFIGURATION -> Value.SCORE_CONFIGURATION
                    AUDIENCE -> Value.AUDIENCE
                    PARTNER_CLIENT_REVENUE -> Value.PARTNER_CLIENT_REVENUE
                    AUTOMATION_JOURNEY -> Value.AUTOMATION_JOURNEY
                    COMBO_EVENT_CONFIGURATION -> Value.COMBO_EVENT_CONFIGURATION
                    CRM_OBJECTS_DUMMY_TYPE -> Value.CRM_OBJECTS_DUMMY_TYPE
                    CASE_STUDY -> Value.CASE_STUDY
                    SERVICE -> Value.SERVICE
                    PODCAST_EPISODE -> Value.PODCAST_EPISODE
                    PARTNER_SERVICE -> Value.PARTNER_SERVICE
                    UNKNOWN -> Value.UNKNOWN
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws HubspotInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    CONTACT -> Known.CONTACT
                    COMPANY -> Known.COMPANY
                    DEAL -> Known.DEAL
                    ENGAGEMENT -> Known.ENGAGEMENT
                    TICKET -> Known.TICKET
                    OWNER -> Known.OWNER
                    PRODUCT -> Known.PRODUCT
                    LINE_ITEM -> Known.LINE_ITEM
                    BET_DELIVERABLE_SERVICE -> Known.BET_DELIVERABLE_SERVICE
                    CONTENT -> Known.CONTENT
                    CONVERSATION -> Known.CONVERSATION
                    BET_ALERT -> Known.BET_ALERT
                    PORTAL -> Known.PORTAL
                    QUOTE -> Known.QUOTE
                    FORM_SUBMISSION_INBOUNDDB -> Known.FORM_SUBMISSION_INBOUNDDB
                    QUOTA -> Known.QUOTA
                    UNSUBSCRIBE -> Known.UNSUBSCRIBE
                    COMMUNICATION -> Known.COMMUNICATION
                    FEEDBACK_SUBMISSION -> Known.FEEDBACK_SUBMISSION
                    ATTRIBUTION -> Known.ATTRIBUTION
                    SALESFORCE_SYNC_ERROR -> Known.SALESFORCE_SYNC_ERROR
                    RESTORABLE_CRM_OBJECT -> Known.RESTORABLE_CRM_OBJECT
                    HUB -> Known.HUB
                    LANDING_PAGE -> Known.LANDING_PAGE
                    PRODUCT_OR_FOLDER -> Known.PRODUCT_OR_FOLDER
                    TASK -> Known.TASK
                    FORM -> Known.FORM
                    MARKETING_EMAIL -> Known.MARKETING_EMAIL
                    AD_ACCOUNT -> Known.AD_ACCOUNT
                    AD_CAMPAIGN -> Known.AD_CAMPAIGN
                    AD_GROUP -> Known.AD_GROUP
                    AD -> Known.AD
                    KEYWORD -> Known.KEYWORD
                    CAMPAIGN -> Known.CAMPAIGN
                    SOCIAL_CHANNEL -> Known.SOCIAL_CHANNEL
                    SOCIAL_POST -> Known.SOCIAL_POST
                    SITE_PAGE -> Known.SITE_PAGE
                    BLOG_POST -> Known.BLOG_POST
                    IMPORT -> Known.IMPORT
                    EXPORT -> Known.EXPORT
                    CTA -> Known.CTA
                    TASK_TEMPLATE -> Known.TASK_TEMPLATE
                    AUTOMATION_PLATFORM_FLOW -> Known.AUTOMATION_PLATFORM_FLOW
                    OBJECT_LIST -> Known.OBJECT_LIST
                    NOTE -> Known.NOTE
                    MEETING_EVENT -> Known.MEETING_EVENT
                    CALL -> Known.CALL
                    EMAIL -> Known.EMAIL
                    PUBLISHING_TASK -> Known.PUBLISHING_TASK
                    CONVERSATION_SESSION -> Known.CONVERSATION_SESSION
                    CONTACT_CREATE_ATTRIBUTION -> Known.CONTACT_CREATE_ATTRIBUTION
                    INVOICE -> Known.INVOICE
                    MARKETING_EVENT -> Known.MARKETING_EVENT
                    CONVERSATION_INBOX -> Known.CONVERSATION_INBOX
                    CHATFLOW -> Known.CHATFLOW
                    MEDIA_BRIDGE -> Known.MEDIA_BRIDGE
                    SEQUENCE -> Known.SEQUENCE
                    SEQUENCE_STEP -> Known.SEQUENCE_STEP
                    FORECAST -> Known.FORECAST
                    SNIPPET -> Known.SNIPPET
                    TEMPLATE -> Known.TEMPLATE
                    DEAL_CREATE_ATTRIBUTION -> Known.DEAL_CREATE_ATTRIBUTION
                    QUOTE_TEMPLATE -> Known.QUOTE_TEMPLATE
                    QUOTE_MODULE -> Known.QUOTE_MODULE
                    QUOTE_MODULE_FIELD -> Known.QUOTE_MODULE_FIELD
                    QUOTE_FIELD -> Known.QUOTE_FIELD
                    SEQUENCE_ENROLLMENT -> Known.SEQUENCE_ENROLLMENT
                    SUBSCRIPTION -> Known.SUBSCRIPTION
                    ACCEPTANCE_TEST -> Known.ACCEPTANCE_TEST
                    SOCIAL_BROADCAST -> Known.SOCIAL_BROADCAST
                    DEAL_SPLIT -> Known.DEAL_SPLIT
                    DEAL_REGISTRATION -> Known.DEAL_REGISTRATION
                    GOAL_TARGET -> Known.GOAL_TARGET
                    GOAL_TARGET_GROUP -> Known.GOAL_TARGET_GROUP
                    PORTAL_OBJECT_SYNC_MESSAGE -> Known.PORTAL_OBJECT_SYNC_MESSAGE
                    FILE_MANAGER_FILE -> Known.FILE_MANAGER_FILE
                    FILE_MANAGER_FOLDER -> Known.FILE_MANAGER_FOLDER
                    SEQUENCE_STEP_ENROLLMENT -> Known.SEQUENCE_STEP_ENROLLMENT
                    APPROVAL -> Known.APPROVAL
                    APPROVAL_STEP -> Known.APPROVAL_STEP
                    CTA_VARIANT -> Known.CTA_VARIANT
                    SALES_DOCUMENT -> Known.SALES_DOCUMENT
                    DISCOUNT -> Known.DISCOUNT
                    FEE -> Known.FEE
                    TAX -> Known.TAX
                    MARKETING_CALENDAR -> Known.MARKETING_CALENDAR
                    PERMISSIONS_TESTING -> Known.PERMISSIONS_TESTING
                    PRIVACY_SCANNER_COOKIE -> Known.PRIVACY_SCANNER_COOKIE
                    DATA_SYNC_STATE -> Known.DATA_SYNC_STATE
                    WEB_INTERACTIVE -> Known.WEB_INTERACTIVE
                    PLAYBOOK -> Known.PLAYBOOK
                    FOLDER -> Known.FOLDER
                    PLAYBOOK_QUESTION -> Known.PLAYBOOK_QUESTION
                    PLAYBOOK_SUBMISSION -> Known.PLAYBOOK_SUBMISSION
                    PLAYBOOK_SUBMISSION_ANSWER -> Known.PLAYBOOK_SUBMISSION_ANSWER
                    COMMERCE_PAYMENT -> Known.COMMERCE_PAYMENT
                    GSC_PROPERTY -> Known.GSC_PROPERTY
                    SOX_PROTECTED_DUMMY_TYPE -> Known.SOX_PROTECTED_DUMMY_TYPE
                    BLOG_LISTING_PAGE -> Known.BLOG_LISTING_PAGE
                    QUARANTINED_SUBMISSION -> Known.QUARANTINED_SUBMISSION
                    PAYMENT_SCHEDULE -> Known.PAYMENT_SCHEDULE
                    PAYMENT_SCHEDULE_INSTALLMENT -> Known.PAYMENT_SCHEDULE_INSTALLMENT
                    MARKETING_CAMPAIGN_UTM -> Known.MARKETING_CAMPAIGN_UTM
                    DISCOUNT_TEMPLATE -> Known.DISCOUNT_TEMPLATE
                    DISCOUNT_CODE -> Known.DISCOUNT_CODE
                    FEEDBACK_SURVEY -> Known.FEEDBACK_SURVEY
                    CMS_URL -> Known.CMS_URL
                    SALES_TASK -> Known.SALES_TASK
                    SALES_WORKLOAD -> Known.SALES_WORKLOAD
                    USER -> Known.USER
                    POSTAL_MAIL -> Known.POSTAL_MAIL
                    SCHEMAS_BACKEND_TEST -> Known.SCHEMAS_BACKEND_TEST
                    PAYMENT_LINK -> Known.PAYMENT_LINK
                    SUBMISSION_TAG -> Known.SUBMISSION_TAG
                    CAMPAIGN_STEP -> Known.CAMPAIGN_STEP
                    SCHEDULING_PAGE -> Known.SCHEDULING_PAGE
                    SOX_PROTECTED_TEST_TYPE -> Known.SOX_PROTECTED_TEST_TYPE
                    ORDER -> Known.ORDER
                    MARKETING_SMS -> Known.MARKETING_SMS
                    PARTNER_ACCOUNT -> Known.PARTNER_ACCOUNT
                    CAMPAIGN_TEMPLATE -> Known.CAMPAIGN_TEMPLATE
                    CAMPAIGN_TEMPLATE_STEP -> Known.CAMPAIGN_TEMPLATE_STEP
                    PLAYLIST -> Known.PLAYLIST
                    CLIP -> Known.CLIP
                    CAMPAIGN_BUDGET_ITEM -> Known.CAMPAIGN_BUDGET_ITEM
                    CAMPAIGN_SPEND_ITEM -> Known.CAMPAIGN_SPEND_ITEM
                    MIC -> Known.MIC
                    CONTENT_AUDIT -> Known.CONTENT_AUDIT
                    CONTENT_AUDIT_PAGE -> Known.CONTENT_AUDIT_PAGE
                    PLAYLIST_FOLDER -> Known.PLAYLIST_FOLDER
                    LEAD -> Known.LEAD
                    ABANDONED_CART -> Known.ABANDONED_CART
                    EXTERNAL_WEB_URL -> Known.EXTERNAL_WEB_URL
                    VIEW -> Known.VIEW
                    VIEW_BLOCK -> Known.VIEW_BLOCK
                    ROSTER -> Known.ROSTER
                    CART -> Known.CART
                    AUTOMATION_PLATFORM_FLOW_ACTION -> Known.AUTOMATION_PLATFORM_FLOW_ACTION
                    SOCIAL_PROFILE -> Known.SOCIAL_PROFILE
                    PARTNER_CLIENT -> Known.PARTNER_CLIENT
                    ROSTER_MEMBER -> Known.ROSTER_MEMBER
                    MARKETING_EVENT_ATTENDANCE -> Known.MARKETING_EVENT_ATTENDANCE
                    ALL_PAGES -> Known.ALL_PAGES
                    AI_FORECAST -> Known.AI_FORECAST
                    CRM_PIPELINES_DUMMY_TYPE -> Known.CRM_PIPELINES_DUMMY_TYPE
                    KNOWLEDGE_ARTICLE -> Known.KNOWLEDGE_ARTICLE
                    PROPERTY_INFO -> Known.PROPERTY_INFO
                    DATA_PRIVACY_CONSENT -> Known.DATA_PRIVACY_CONSENT
                    GOAL_TEMPLATE -> Known.GOAL_TEMPLATE
                    SCORE_CONFIGURATION -> Known.SCORE_CONFIGURATION
                    AUDIENCE -> Known.AUDIENCE
                    PARTNER_CLIENT_REVENUE -> Known.PARTNER_CLIENT_REVENUE
                    AUTOMATION_JOURNEY -> Known.AUTOMATION_JOURNEY
                    COMBO_EVENT_CONFIGURATION -> Known.COMBO_EVENT_CONFIGURATION
                    CRM_OBJECTS_DUMMY_TYPE -> Known.CRM_OBJECTS_DUMMY_TYPE
                    CASE_STUDY -> Known.CASE_STUDY
                    SERVICE -> Known.SERVICE
                    PODCAST_EPISODE -> Known.PODCAST_EPISODE
                    PARTNER_SERVICE -> Known.PARTNER_SERVICE
                    UNKNOWN -> Known.UNKNOWN
                    else -> throw HubspotInvalidDataException("Unknown ToObjectType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws HubspotInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    HubspotInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): ToObjectType = apply {
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

                return other is ToObjectType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Association &&
                id == other.id &&
                allowsCustomLabels == other.allowsCustomLabels &&
                cardinality == other.cardinality &&
                category == other.category &&
                fromObjectTypeId == other.fromObjectTypeId &&
                hasAllAssociatedObjects == other.hasAllAssociatedObjects &&
                hasCascadingDeletes == other.hasCascadingDeletes &&
                hasUserEnforcedMaxFromObjectIds == other.hasUserEnforcedMaxFromObjectIds &&
                hasUserEnforcedMaxToObjectIds == other.hasUserEnforcedMaxToObjectIds &&
                hidden == other.hidden &&
                inverseAllowsCustomLabels == other.inverseAllowsCustomLabels &&
                inverseCardinality == other.inverseCardinality &&
                inverseHasAllAssociatedObjects == other.inverseHasAllAssociatedObjects &&
                inverseId == other.inverseId &&
                inverseName == other.inverseName &&
                isInversePrimary == other.isInversePrimary &&
                isPrimary == other.isPrimary &&
                maxFromObjectIds == other.maxFromObjectIds &&
                maxToObjectIds == other.maxToObjectIds &&
                name == other.name &&
                portalUniqueIdentifier == other.portalUniqueIdentifier &&
                toObjectTypeId == other.toObjectTypeId &&
                fromObjectType == other.fromObjectType &&
                inverseLabel == other.inverseLabel &&
                label == other.label &&
                toObjectType == other.toObjectType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                allowsCustomLabels,
                cardinality,
                category,
                fromObjectTypeId,
                hasAllAssociatedObjects,
                hasCascadingDeletes,
                hasUserEnforcedMaxFromObjectIds,
                hasUserEnforcedMaxToObjectIds,
                hidden,
                inverseAllowsCustomLabels,
                inverseCardinality,
                inverseHasAllAssociatedObjects,
                inverseId,
                inverseName,
                isInversePrimary,
                isPrimary,
                maxFromObjectIds,
                maxToObjectIds,
                name,
                portalUniqueIdentifier,
                toObjectTypeId,
                fromObjectType,
                inverseLabel,
                label,
                toObjectType,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Association{id=$id, allowsCustomLabels=$allowsCustomLabels, cardinality=$cardinality, category=$category, fromObjectTypeId=$fromObjectTypeId, hasAllAssociatedObjects=$hasAllAssociatedObjects, hasCascadingDeletes=$hasCascadingDeletes, hasUserEnforcedMaxFromObjectIds=$hasUserEnforcedMaxFromObjectIds, hasUserEnforcedMaxToObjectIds=$hasUserEnforcedMaxToObjectIds, hidden=$hidden, inverseAllowsCustomLabels=$inverseAllowsCustomLabels, inverseCardinality=$inverseCardinality, inverseHasAllAssociatedObjects=$inverseHasAllAssociatedObjects, inverseId=$inverseId, inverseName=$inverseName, isInversePrimary=$isInversePrimary, isPrimary=$isPrimary, maxFromObjectIds=$maxFromObjectIds, maxToObjectIds=$maxToObjectIds, name=$name, portalUniqueIdentifier=$portalUniqueIdentifier, toObjectTypeId=$toObjectTypeId, fromObjectType=$fromObjectType, inverseLabel=$inverseLabel, label=$label, toObjectType=$toObjectType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ObjectSchema &&
            id == other.id &&
            associations == other.associations &&
            labels == other.labels &&
            name == other.name &&
            properties == other.properties &&
            requiredProperties == other.requiredProperties &&
            archived == other.archived &&
            createdAt == other.createdAt &&
            createdByUserId == other.createdByUserId &&
            description == other.description &&
            fullyQualifiedName == other.fullyQualifiedName &&
            objectTypeId == other.objectTypeId &&
            primaryDisplayProperty == other.primaryDisplayProperty &&
            searchableProperties == other.searchableProperties &&
            secondaryDisplayProperties == other.secondaryDisplayProperties &&
            updatedAt == other.updatedAt &&
            updatedByUserId == other.updatedByUserId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            associations,
            labels,
            name,
            properties,
            requiredProperties,
            archived,
            createdAt,
            createdByUserId,
            description,
            fullyQualifiedName,
            objectTypeId,
            primaryDisplayProperty,
            searchableProperties,
            secondaryDisplayProperties,
            updatedAt,
            updatedByUserId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ObjectSchema{id=$id, associations=$associations, labels=$labels, name=$name, properties=$properties, requiredProperties=$requiredProperties, archived=$archived, createdAt=$createdAt, createdByUserId=$createdByUserId, description=$description, fullyQualifiedName=$fullyQualifiedName, objectTypeId=$objectTypeId, primaryDisplayProperty=$primaryDisplayProperty, searchableProperties=$searchableProperties, secondaryDisplayProperties=$secondaryDisplayProperties, updatedAt=$updatedAt, updatedByUserId=$updatedByUserId, additionalProperties=$additionalProperties}"
}
