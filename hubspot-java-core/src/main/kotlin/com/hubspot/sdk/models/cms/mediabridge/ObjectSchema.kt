// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkKnown
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.toImmutable
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import com.hubspot.sdk.models.BaseAssociationDefinition
import com.hubspot.sdk.models.ObjectTypeDefinitionLabels
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ObjectSchema
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val allowsSensitiveProperties: JsonField<Boolean>,
    private val archived: JsonField<Boolean>,
    private val associations: JsonField<List<BaseAssociationDefinition>>,
    private val fullyQualifiedName: JsonField<String>,
    private val labels: JsonField<ObjectTypeDefinitionLabels>,
    private val name: JsonField<String>,
    private val objectTypeId: JsonField<String>,
    private val properties: JsonField<List<Property1>>,
    private val requiredProperties: JsonField<List<String>>,
    private val searchableProperties: JsonField<List<String>>,
    private val secondaryDisplayProperties: JsonField<List<String>>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdByUserId: JsonField<Int>,
    private val description: JsonField<String>,
    private val primaryDisplayProperty: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val updatedByUserId: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("allowsSensitiveProperties")
        @ExcludeMissing
        allowsSensitiveProperties: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("archived") @ExcludeMissing archived: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("associations")
        @ExcludeMissing
        associations: JsonField<List<BaseAssociationDefinition>> = JsonMissing.of(),
        @JsonProperty("fullyQualifiedName")
        @ExcludeMissing
        fullyQualifiedName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("labels")
        @ExcludeMissing
        labels: JsonField<ObjectTypeDefinitionLabels> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("objectTypeId")
        @ExcludeMissing
        objectTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("properties")
        @ExcludeMissing
        properties: JsonField<List<Property1>> = JsonMissing.of(),
        @JsonProperty("requiredProperties")
        @ExcludeMissing
        requiredProperties: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("searchableProperties")
        @ExcludeMissing
        searchableProperties: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("secondaryDisplayProperties")
        @ExcludeMissing
        secondaryDisplayProperties: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdByUserId")
        @ExcludeMissing
        createdByUserId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("primaryDisplayProperty")
        @ExcludeMissing
        primaryDisplayProperty: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedByUserId")
        @ExcludeMissing
        updatedByUserId: JsonField<Int> = JsonMissing.of(),
    ) : this(
        id,
        allowsSensitiveProperties,
        archived,
        associations,
        fullyQualifiedName,
        labels,
        name,
        objectTypeId,
        properties,
        requiredProperties,
        searchableProperties,
        secondaryDisplayProperties,
        createdAt,
        createdByUserId,
        description,
        primaryDisplayProperty,
        updatedAt,
        updatedByUserId,
        mutableMapOf(),
    )

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun allowsSensitiveProperties(): Boolean =
        allowsSensitiveProperties.getRequired("allowsSensitiveProperties")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun archived(): Boolean = archived.getRequired("archived")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun associations(): List<BaseAssociationDefinition> = associations.getRequired("associations")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fullyQualifiedName(): String = fullyQualifiedName.getRequired("fullyQualifiedName")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun labels(): ObjectTypeDefinitionLabels = labels.getRequired("labels")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectTypeId(): String = objectTypeId.getRequired("objectTypeId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun properties(): List<Property1> = properties.getRequired("properties")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun requiredProperties(): List<String> = requiredProperties.getRequired("requiredProperties")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun searchableProperties(): List<String> =
        searchableProperties.getRequired("searchableProperties")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun secondaryDisplayProperties(): List<String> =
        secondaryDisplayProperties.getRequired("secondaryDisplayProperties")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdByUserId(): Optional<Int> = createdByUserId.getOptional("createdByUserId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryDisplayProperty(): Optional<String> =
        primaryDisplayProperty.getOptional("primaryDisplayProperty")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
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
     * Returns the raw JSON value of [allowsSensitiveProperties].
     *
     * Unlike [allowsSensitiveProperties], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("allowsSensitiveProperties")
    @ExcludeMissing
    fun _allowsSensitiveProperties(): JsonField<Boolean> = allowsSensitiveProperties

    /**
     * Returns the raw JSON value of [archived].
     *
     * Unlike [archived], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("archived") @ExcludeMissing fun _archived(): JsonField<Boolean> = archived

    /**
     * Returns the raw JSON value of [associations].
     *
     * Unlike [associations], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("associations")
    @ExcludeMissing
    fun _associations(): JsonField<List<BaseAssociationDefinition>> = associations

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
     * Returns the raw JSON value of [objectTypeId].
     *
     * Unlike [objectTypeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectTypeId")
    @ExcludeMissing
    fun _objectTypeId(): JsonField<String> = objectTypeId

    /**
     * Returns the raw JSON value of [properties].
     *
     * Unlike [properties], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("properties")
    @ExcludeMissing
    fun _properties(): JsonField<List<Property1>> = properties

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
     * Returns the raw JSON value of [primaryDisplayProperty].
     *
     * Unlike [primaryDisplayProperty], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("primaryDisplayProperty")
    @ExcludeMissing
    fun _primaryDisplayProperty(): JsonField<String> = primaryDisplayProperty

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
         * .allowsSensitiveProperties()
         * .archived()
         * .associations()
         * .fullyQualifiedName()
         * .labels()
         * .name()
         * .objectTypeId()
         * .properties()
         * .requiredProperties()
         * .searchableProperties()
         * .secondaryDisplayProperties()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ObjectSchema]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var allowsSensitiveProperties: JsonField<Boolean>? = null
        private var archived: JsonField<Boolean>? = null
        private var associations: JsonField<MutableList<BaseAssociationDefinition>>? = null
        private var fullyQualifiedName: JsonField<String>? = null
        private var labels: JsonField<ObjectTypeDefinitionLabels>? = null
        private var name: JsonField<String>? = null
        private var objectTypeId: JsonField<String>? = null
        private var properties: JsonField<MutableList<Property1>>? = null
        private var requiredProperties: JsonField<MutableList<String>>? = null
        private var searchableProperties: JsonField<MutableList<String>>? = null
        private var secondaryDisplayProperties: JsonField<MutableList<String>>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdByUserId: JsonField<Int> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var primaryDisplayProperty: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedByUserId: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(objectSchema: ObjectSchema) = apply {
            id = objectSchema.id
            allowsSensitiveProperties = objectSchema.allowsSensitiveProperties
            archived = objectSchema.archived
            associations = objectSchema.associations.map { it.toMutableList() }
            fullyQualifiedName = objectSchema.fullyQualifiedName
            labels = objectSchema.labels
            name = objectSchema.name
            objectTypeId = objectSchema.objectTypeId
            properties = objectSchema.properties.map { it.toMutableList() }
            requiredProperties = objectSchema.requiredProperties.map { it.toMutableList() }
            searchableProperties = objectSchema.searchableProperties.map { it.toMutableList() }
            secondaryDisplayProperties =
                objectSchema.secondaryDisplayProperties.map { it.toMutableList() }
            createdAt = objectSchema.createdAt
            createdByUserId = objectSchema.createdByUserId
            description = objectSchema.description
            primaryDisplayProperty = objectSchema.primaryDisplayProperty
            updatedAt = objectSchema.updatedAt
            updatedByUserId = objectSchema.updatedByUserId
            additionalProperties = objectSchema.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun allowsSensitiveProperties(allowsSensitiveProperties: Boolean) =
            allowsSensitiveProperties(JsonField.of(allowsSensitiveProperties))

        /**
         * Sets [Builder.allowsSensitiveProperties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowsSensitiveProperties] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun allowsSensitiveProperties(allowsSensitiveProperties: JsonField<Boolean>) = apply {
            this.allowsSensitiveProperties = allowsSensitiveProperties
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

        fun associations(associations: List<BaseAssociationDefinition>) =
            associations(JsonField.of(associations))

        /**
         * Sets [Builder.associations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.associations] with a well-typed
         * `List<BaseAssociationDefinition>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun associations(associations: JsonField<List<BaseAssociationDefinition>>) = apply {
            this.associations = associations.map { it.toMutableList() }
        }

        /**
         * Adds a single [BaseAssociationDefinition] to [associations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAssociation(association: BaseAssociationDefinition) = apply {
            associations =
                (associations ?: JsonField.of(mutableListOf())).also {
                    checkKnown("associations", it).add(association)
                }
        }

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

        fun labels(labels: ObjectTypeDefinitionLabels) = labels(JsonField.of(labels))

        /**
         * Sets [Builder.labels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.labels] with a well-typed [ObjectTypeDefinitionLabels]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun labels(labels: JsonField<ObjectTypeDefinitionLabels>) = apply { this.labels = labels }

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

        fun properties(properties: List<Property1>) = properties(JsonField.of(properties))

        /**
         * Sets [Builder.properties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.properties] with a well-typed `List<Property1>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun properties(properties: JsonField<List<Property1>>) = apply {
            this.properties = properties.map { it.toMutableList() }
        }

        /**
         * Adds a single [Property1] to [properties].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProperty(property: Property1) = apply {
            properties =
                (properties ?: JsonField.of(mutableListOf())).also {
                    checkKnown("properties", it).add(property)
                }
        }

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
         * .allowsSensitiveProperties()
         * .archived()
         * .associations()
         * .fullyQualifiedName()
         * .labels()
         * .name()
         * .objectTypeId()
         * .properties()
         * .requiredProperties()
         * .searchableProperties()
         * .secondaryDisplayProperties()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ObjectSchema =
            ObjectSchema(
                checkRequired("id", id),
                checkRequired("allowsSensitiveProperties", allowsSensitiveProperties),
                checkRequired("archived", archived),
                checkRequired("associations", associations).map { it.toImmutable() },
                checkRequired("fullyQualifiedName", fullyQualifiedName),
                checkRequired("labels", labels),
                checkRequired("name", name),
                checkRequired("objectTypeId", objectTypeId),
                checkRequired("properties", properties).map { it.toImmutable() },
                checkRequired("requiredProperties", requiredProperties).map { it.toImmutable() },
                checkRequired("searchableProperties", searchableProperties).map {
                    it.toImmutable()
                },
                checkRequired("secondaryDisplayProperties", secondaryDisplayProperties).map {
                    it.toImmutable()
                },
                createdAt,
                createdByUserId,
                description,
                primaryDisplayProperty,
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
        allowsSensitiveProperties()
        archived()
        associations().forEach { it.validate() }
        fullyQualifiedName()
        labels().validate()
        name()
        objectTypeId()
        properties().forEach { it.validate() }
        requiredProperties()
        searchableProperties()
        secondaryDisplayProperties()
        createdAt()
        createdByUserId()
        description()
        primaryDisplayProperty()
        updatedAt()
        updatedByUserId()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (allowsSensitiveProperties.asKnown().isPresent) 1 else 0) +
            (if (archived.asKnown().isPresent) 1 else 0) +
            (associations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (fullyQualifiedName.asKnown().isPresent) 1 else 0) +
            (labels.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (objectTypeId.asKnown().isPresent) 1 else 0) +
            (properties.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (requiredProperties.asKnown().getOrNull()?.size ?: 0) +
            (searchableProperties.asKnown().getOrNull()?.size ?: 0) +
            (secondaryDisplayProperties.asKnown().getOrNull()?.size ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdByUserId.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (primaryDisplayProperty.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedByUserId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ObjectSchema &&
            id == other.id &&
            allowsSensitiveProperties == other.allowsSensitiveProperties &&
            archived == other.archived &&
            associations == other.associations &&
            fullyQualifiedName == other.fullyQualifiedName &&
            labels == other.labels &&
            name == other.name &&
            objectTypeId == other.objectTypeId &&
            properties == other.properties &&
            requiredProperties == other.requiredProperties &&
            searchableProperties == other.searchableProperties &&
            secondaryDisplayProperties == other.secondaryDisplayProperties &&
            createdAt == other.createdAt &&
            createdByUserId == other.createdByUserId &&
            description == other.description &&
            primaryDisplayProperty == other.primaryDisplayProperty &&
            updatedAt == other.updatedAt &&
            updatedByUserId == other.updatedByUserId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            allowsSensitiveProperties,
            archived,
            associations,
            fullyQualifiedName,
            labels,
            name,
            objectTypeId,
            properties,
            requiredProperties,
            searchableProperties,
            secondaryDisplayProperties,
            createdAt,
            createdByUserId,
            description,
            primaryDisplayProperty,
            updatedAt,
            updatedByUserId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ObjectSchema{id=$id, allowsSensitiveProperties=$allowsSensitiveProperties, archived=$archived, associations=$associations, fullyQualifiedName=$fullyQualifiedName, labels=$labels, name=$name, objectTypeId=$objectTypeId, properties=$properties, requiredProperties=$requiredProperties, searchableProperties=$searchableProperties, secondaryDisplayProperties=$secondaryDisplayProperties, createdAt=$createdAt, createdByUserId=$createdByUserId, description=$description, primaryDisplayProperty=$primaryDisplayProperty, updatedAt=$updatedAt, updatedByUserId=$updatedByUserId, additionalProperties=$additionalProperties}"
}
