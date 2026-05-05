// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.events.definitions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.Enum
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkKnown
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.toImmutable
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import com.hubspot.sdk.models.BaseProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ExternalBehavioralEventTypeDefinition
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val archived: JsonField<Boolean>,
    private val associations: JsonField<List<DefinitionsAssociationDefinition>>,
    private val fullyQualifiedName: JsonField<String>,
    private val labels: JsonField<BehavioralEventTypeDefinitionLabels>,
    private val name: JsonField<String>,
    private val objectTypeId: JsonField<String>,
    private val properties: JsonField<List<BaseProperty>>,
    private val comboEventRules: JsonField<ComboEventRuleBranch>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdUserId: JsonField<Int>,
    private val customMatchingId: JsonField<ExternalObjectResolutionMappingResponse>,
    private val description: JsonField<String>,
    private val detailTemplate: JsonField<String>,
    private val headerTemplate: JsonField<String>,
    private val primaryObject: JsonField<String>,
    private val primaryObjectId: JsonField<String>,
    private val trackingType: JsonField<TrackingType>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val updatedUserId: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("archived") @ExcludeMissing archived: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("associations")
        @ExcludeMissing
        associations: JsonField<List<DefinitionsAssociationDefinition>> = JsonMissing.of(),
        @JsonProperty("fullyQualifiedName")
        @ExcludeMissing
        fullyQualifiedName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("labels")
        @ExcludeMissing
        labels: JsonField<BehavioralEventTypeDefinitionLabels> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("objectTypeId")
        @ExcludeMissing
        objectTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("properties")
        @ExcludeMissing
        properties: JsonField<List<BaseProperty>> = JsonMissing.of(),
        @JsonProperty("comboEventRules")
        @ExcludeMissing
        comboEventRules: JsonField<ComboEventRuleBranch> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdUserId")
        @ExcludeMissing
        createdUserId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("customMatchingId")
        @ExcludeMissing
        customMatchingId: JsonField<ExternalObjectResolutionMappingResponse> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("detailTemplate")
        @ExcludeMissing
        detailTemplate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("headerTemplate")
        @ExcludeMissing
        headerTemplate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("primaryObject")
        @ExcludeMissing
        primaryObject: JsonField<String> = JsonMissing.of(),
        @JsonProperty("primaryObjectId")
        @ExcludeMissing
        primaryObjectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trackingType")
        @ExcludeMissing
        trackingType: JsonField<TrackingType> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedUserId")
        @ExcludeMissing
        updatedUserId: JsonField<Int> = JsonMissing.of(),
    ) : this(
        id,
        archived,
        associations,
        fullyQualifiedName,
        labels,
        name,
        objectTypeId,
        properties,
        comboEventRules,
        createdAt,
        createdUserId,
        customMatchingId,
        description,
        detailTemplate,
        headerTemplate,
        primaryObject,
        primaryObjectId,
        trackingType,
        updatedAt,
        updatedUserId,
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
    fun archived(): Boolean = archived.getRequired("archived")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun associations(): List<DefinitionsAssociationDefinition> =
        associations.getRequired("associations")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fullyQualifiedName(): String = fullyQualifiedName.getRequired("fullyQualifiedName")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun labels(): BehavioralEventTypeDefinitionLabels = labels.getRequired("labels")

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
    fun properties(): List<BaseProperty> = properties.getRequired("properties")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun comboEventRules(): Optional<ComboEventRuleBranch> =
        comboEventRules.getOptional("comboEventRules")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdUserId(): Optional<Int> = createdUserId.getOptional("createdUserId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customMatchingId(): Optional<ExternalObjectResolutionMappingResponse> =
        customMatchingId.getOptional("customMatchingId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun detailTemplate(): Optional<String> = detailTemplate.getOptional("detailTemplate")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun headerTemplate(): Optional<String> = headerTemplate.getOptional("headerTemplate")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryObject(): Optional<String> = primaryObject.getOptional("primaryObject")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryObjectId(): Optional<String> = primaryObjectId.getOptional("primaryObjectId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun trackingType(): Optional<TrackingType> = trackingType.getOptional("trackingType")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedUserId(): Optional<Int> = updatedUserId.getOptional("updatedUserId")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
    fun _associations(): JsonField<List<DefinitionsAssociationDefinition>> = associations

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
    fun _labels(): JsonField<BehavioralEventTypeDefinitionLabels> = labels

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
    fun _properties(): JsonField<List<BaseProperty>> = properties

    /**
     * Returns the raw JSON value of [comboEventRules].
     *
     * Unlike [comboEventRules], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("comboEventRules")
    @ExcludeMissing
    fun _comboEventRules(): JsonField<ComboEventRuleBranch> = comboEventRules

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [createdUserId].
     *
     * Unlike [createdUserId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdUserId")
    @ExcludeMissing
    fun _createdUserId(): JsonField<Int> = createdUserId

    /**
     * Returns the raw JSON value of [customMatchingId].
     *
     * Unlike [customMatchingId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("customMatchingId")
    @ExcludeMissing
    fun _customMatchingId(): JsonField<ExternalObjectResolutionMappingResponse> = customMatchingId

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [detailTemplate].
     *
     * Unlike [detailTemplate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("detailTemplate")
    @ExcludeMissing
    fun _detailTemplate(): JsonField<String> = detailTemplate

    /**
     * Returns the raw JSON value of [headerTemplate].
     *
     * Unlike [headerTemplate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("headerTemplate")
    @ExcludeMissing
    fun _headerTemplate(): JsonField<String> = headerTemplate

    /**
     * Returns the raw JSON value of [primaryObject].
     *
     * Unlike [primaryObject], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("primaryObject")
    @ExcludeMissing
    fun _primaryObject(): JsonField<String> = primaryObject

    /**
     * Returns the raw JSON value of [primaryObjectId].
     *
     * Unlike [primaryObjectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("primaryObjectId")
    @ExcludeMissing
    fun _primaryObjectId(): JsonField<String> = primaryObjectId

    /**
     * Returns the raw JSON value of [trackingType].
     *
     * Unlike [trackingType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trackingType")
    @ExcludeMissing
    fun _trackingType(): JsonField<TrackingType> = trackingType

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [updatedUserId].
     *
     * Unlike [updatedUserId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedUserId")
    @ExcludeMissing
    fun _updatedUserId(): JsonField<Int> = updatedUserId

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
         * [ExternalBehavioralEventTypeDefinition].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .archived()
         * .associations()
         * .fullyQualifiedName()
         * .labels()
         * .name()
         * .objectTypeId()
         * .properties()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalBehavioralEventTypeDefinition]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var archived: JsonField<Boolean>? = null
        private var associations: JsonField<MutableList<DefinitionsAssociationDefinition>>? = null
        private var fullyQualifiedName: JsonField<String>? = null
        private var labels: JsonField<BehavioralEventTypeDefinitionLabels>? = null
        private var name: JsonField<String>? = null
        private var objectTypeId: JsonField<String>? = null
        private var properties: JsonField<MutableList<BaseProperty>>? = null
        private var comboEventRules: JsonField<ComboEventRuleBranch> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdUserId: JsonField<Int> = JsonMissing.of()
        private var customMatchingId: JsonField<ExternalObjectResolutionMappingResponse> =
            JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var detailTemplate: JsonField<String> = JsonMissing.of()
        private var headerTemplate: JsonField<String> = JsonMissing.of()
        private var primaryObject: JsonField<String> = JsonMissing.of()
        private var primaryObjectId: JsonField<String> = JsonMissing.of()
        private var trackingType: JsonField<TrackingType> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedUserId: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            externalBehavioralEventTypeDefinition: ExternalBehavioralEventTypeDefinition
        ) = apply {
            id = externalBehavioralEventTypeDefinition.id
            archived = externalBehavioralEventTypeDefinition.archived
            associations =
                externalBehavioralEventTypeDefinition.associations.map { it.toMutableList() }
            fullyQualifiedName = externalBehavioralEventTypeDefinition.fullyQualifiedName
            labels = externalBehavioralEventTypeDefinition.labels
            name = externalBehavioralEventTypeDefinition.name
            objectTypeId = externalBehavioralEventTypeDefinition.objectTypeId
            properties = externalBehavioralEventTypeDefinition.properties.map { it.toMutableList() }
            comboEventRules = externalBehavioralEventTypeDefinition.comboEventRules
            createdAt = externalBehavioralEventTypeDefinition.createdAt
            createdUserId = externalBehavioralEventTypeDefinition.createdUserId
            customMatchingId = externalBehavioralEventTypeDefinition.customMatchingId
            description = externalBehavioralEventTypeDefinition.description
            detailTemplate = externalBehavioralEventTypeDefinition.detailTemplate
            headerTemplate = externalBehavioralEventTypeDefinition.headerTemplate
            primaryObject = externalBehavioralEventTypeDefinition.primaryObject
            primaryObjectId = externalBehavioralEventTypeDefinition.primaryObjectId
            trackingType = externalBehavioralEventTypeDefinition.trackingType
            updatedAt = externalBehavioralEventTypeDefinition.updatedAt
            updatedUserId = externalBehavioralEventTypeDefinition.updatedUserId
            additionalProperties =
                externalBehavioralEventTypeDefinition.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun archived(archived: Boolean) = archived(JsonField.of(archived))

        /**
         * Sets [Builder.archived] to an arbitrary JSON value.
         *
         * You should usually call [Builder.archived] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun archived(archived: JsonField<Boolean>) = apply { this.archived = archived }

        fun associations(associations: List<DefinitionsAssociationDefinition>) =
            associations(JsonField.of(associations))

        /**
         * Sets [Builder.associations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.associations] with a well-typed
         * `List<DefinitionsAssociationDefinition>` value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun associations(associations: JsonField<List<DefinitionsAssociationDefinition>>) = apply {
            this.associations = associations.map { it.toMutableList() }
        }

        /**
         * Adds a single [DefinitionsAssociationDefinition] to [associations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAssociation(association: DefinitionsAssociationDefinition) = apply {
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

        fun labels(labels: BehavioralEventTypeDefinitionLabels) = labels(JsonField.of(labels))

        /**
         * Sets [Builder.labels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.labels] with a well-typed
         * [BehavioralEventTypeDefinitionLabels] value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun labels(labels: JsonField<BehavioralEventTypeDefinitionLabels>) = apply {
            this.labels = labels
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

        fun properties(properties: List<BaseProperty>) = properties(JsonField.of(properties))

        /**
         * Sets [Builder.properties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.properties] with a well-typed `List<BaseProperty>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun properties(properties: JsonField<List<BaseProperty>>) = apply {
            this.properties = properties.map { it.toMutableList() }
        }

        /**
         * Adds a single [BaseProperty] to [properties].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProperty(property: BaseProperty) = apply {
            properties =
                (properties ?: JsonField.of(mutableListOf())).also {
                    checkKnown("properties", it).add(property)
                }
        }

        fun comboEventRules(comboEventRules: ComboEventRuleBranch) =
            comboEventRules(JsonField.of(comboEventRules))

        /**
         * Sets [Builder.comboEventRules] to an arbitrary JSON value.
         *
         * You should usually call [Builder.comboEventRules] with a well-typed
         * [ComboEventRuleBranch] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun comboEventRules(comboEventRules: JsonField<ComboEventRuleBranch>) = apply {
            this.comboEventRules = comboEventRules
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

        fun createdUserId(createdUserId: Int) = createdUserId(JsonField.of(createdUserId))

        /**
         * Sets [Builder.createdUserId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdUserId] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdUserId(createdUserId: JsonField<Int>) = apply {
            this.createdUserId = createdUserId
        }

        fun customMatchingId(customMatchingId: ExternalObjectResolutionMappingResponse) =
            customMatchingId(JsonField.of(customMatchingId))

        /**
         * Sets [Builder.customMatchingId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customMatchingId] with a well-typed
         * [ExternalObjectResolutionMappingResponse] value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun customMatchingId(customMatchingId: JsonField<ExternalObjectResolutionMappingResponse>) =
            apply {
                this.customMatchingId = customMatchingId
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

        fun detailTemplate(detailTemplate: String) = detailTemplate(JsonField.of(detailTemplate))

        /**
         * Sets [Builder.detailTemplate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.detailTemplate] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun detailTemplate(detailTemplate: JsonField<String>) = apply {
            this.detailTemplate = detailTemplate
        }

        fun headerTemplate(headerTemplate: String) = headerTemplate(JsonField.of(headerTemplate))

        /**
         * Sets [Builder.headerTemplate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.headerTemplate] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun headerTemplate(headerTemplate: JsonField<String>) = apply {
            this.headerTemplate = headerTemplate
        }

        fun primaryObject(primaryObject: String) = primaryObject(JsonField.of(primaryObject))

        /**
         * Sets [Builder.primaryObject] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryObject] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun primaryObject(primaryObject: JsonField<String>) = apply {
            this.primaryObject = primaryObject
        }

        fun primaryObjectId(primaryObjectId: String) =
            primaryObjectId(JsonField.of(primaryObjectId))

        /**
         * Sets [Builder.primaryObjectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryObjectId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun primaryObjectId(primaryObjectId: JsonField<String>) = apply {
            this.primaryObjectId = primaryObjectId
        }

        fun trackingType(trackingType: TrackingType) = trackingType(JsonField.of(trackingType))

        /**
         * Sets [Builder.trackingType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trackingType] with a well-typed [TrackingType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun trackingType(trackingType: JsonField<TrackingType>) = apply {
            this.trackingType = trackingType
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

        fun updatedUserId(updatedUserId: Int) = updatedUserId(JsonField.of(updatedUserId))

        /**
         * Sets [Builder.updatedUserId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedUserId] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedUserId(updatedUserId: JsonField<Int>) = apply {
            this.updatedUserId = updatedUserId
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
         * Returns an immutable instance of [ExternalBehavioralEventTypeDefinition].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .archived()
         * .associations()
         * .fullyQualifiedName()
         * .labels()
         * .name()
         * .objectTypeId()
         * .properties()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalBehavioralEventTypeDefinition =
            ExternalBehavioralEventTypeDefinition(
                checkRequired("id", id),
                checkRequired("archived", archived),
                checkRequired("associations", associations).map { it.toImmutable() },
                checkRequired("fullyQualifiedName", fullyQualifiedName),
                checkRequired("labels", labels),
                checkRequired("name", name),
                checkRequired("objectTypeId", objectTypeId),
                checkRequired("properties", properties).map { it.toImmutable() },
                comboEventRules,
                createdAt,
                createdUserId,
                customMatchingId,
                description,
                detailTemplate,
                headerTemplate,
                primaryObject,
                primaryObjectId,
                trackingType,
                updatedAt,
                updatedUserId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): ExternalBehavioralEventTypeDefinition = apply {
        if (validated) {
            return@apply
        }

        id()
        archived()
        associations().forEach { it.validate() }
        fullyQualifiedName()
        labels().validate()
        name()
        objectTypeId()
        properties().forEach { it.validate() }
        comboEventRules().ifPresent { it.validate() }
        createdAt()
        createdUserId()
        customMatchingId().ifPresent { it.validate() }
        description()
        detailTemplate()
        headerTemplate()
        primaryObject()
        primaryObjectId()
        trackingType().ifPresent { it.validate() }
        updatedAt()
        updatedUserId()
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
            (if (archived.asKnown().isPresent) 1 else 0) +
            (associations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (fullyQualifiedName.asKnown().isPresent) 1 else 0) +
            (labels.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (objectTypeId.asKnown().isPresent) 1 else 0) +
            (properties.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (comboEventRules.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdUserId.asKnown().isPresent) 1 else 0) +
            (customMatchingId.asKnown().getOrNull()?.validity() ?: 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (detailTemplate.asKnown().isPresent) 1 else 0) +
            (if (headerTemplate.asKnown().isPresent) 1 else 0) +
            (if (primaryObject.asKnown().isPresent) 1 else 0) +
            (if (primaryObjectId.asKnown().isPresent) 1 else 0) +
            (trackingType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedUserId.asKnown().isPresent) 1 else 0)

    class TrackingType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val APP_EVENT = of("APP_EVENT")

            @JvmField val AUTOCAPTURE_EVENT = of("AUTOCAPTURE_EVENT")

            @JvmField val CLICKED_ELEMENT = of("CLICKED_ELEMENT")

            @JvmField val COMBO_EVENT = of("COMBO_EVENT")

            @JvmField val CUSTOM_SCRIPT = of("CUSTOM_SCRIPT")

            @JvmField val CUSTOM_SIGNAL = of("CUSTOM_SIGNAL")

            @JvmField val IMPORT = of("IMPORT")

            @JvmField val MANUAL = of("MANUAL")

            @JvmField val PROPERTY_CHANGE = of("PROPERTY_CHANGE")

            @JvmField val VISITED_URL = of("VISITED_URL")

            @JvmField val WEBHOOK = of("WEBHOOK")

            @JvmStatic fun of(value: String) = TrackingType(JsonField.of(value))
        }

        /** An enum containing [TrackingType]'s known values. */
        enum class Known {
            APP_EVENT,
            AUTOCAPTURE_EVENT,
            CLICKED_ELEMENT,
            COMBO_EVENT,
            CUSTOM_SCRIPT,
            CUSTOM_SIGNAL,
            IMPORT,
            MANUAL,
            PROPERTY_CHANGE,
            VISITED_URL,
            WEBHOOK,
        }

        /**
         * An enum containing [TrackingType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TrackingType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            APP_EVENT,
            AUTOCAPTURE_EVENT,
            CLICKED_ELEMENT,
            COMBO_EVENT,
            CUSTOM_SCRIPT,
            CUSTOM_SIGNAL,
            IMPORT,
            MANUAL,
            PROPERTY_CHANGE,
            VISITED_URL,
            WEBHOOK,
            /**
             * An enum member indicating that [TrackingType] was instantiated with an unknown value.
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
                APP_EVENT -> Value.APP_EVENT
                AUTOCAPTURE_EVENT -> Value.AUTOCAPTURE_EVENT
                CLICKED_ELEMENT -> Value.CLICKED_ELEMENT
                COMBO_EVENT -> Value.COMBO_EVENT
                CUSTOM_SCRIPT -> Value.CUSTOM_SCRIPT
                CUSTOM_SIGNAL -> Value.CUSTOM_SIGNAL
                IMPORT -> Value.IMPORT
                MANUAL -> Value.MANUAL
                PROPERTY_CHANGE -> Value.PROPERTY_CHANGE
                VISITED_URL -> Value.VISITED_URL
                WEBHOOK -> Value.WEBHOOK
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
                APP_EVENT -> Known.APP_EVENT
                AUTOCAPTURE_EVENT -> Known.AUTOCAPTURE_EVENT
                CLICKED_ELEMENT -> Known.CLICKED_ELEMENT
                COMBO_EVENT -> Known.COMBO_EVENT
                CUSTOM_SCRIPT -> Known.CUSTOM_SCRIPT
                CUSTOM_SIGNAL -> Known.CUSTOM_SIGNAL
                IMPORT -> Known.IMPORT
                MANUAL -> Known.MANUAL
                PROPERTY_CHANGE -> Known.PROPERTY_CHANGE
                VISITED_URL -> Known.VISITED_URL
                WEBHOOK -> Known.WEBHOOK
                else -> throw HubSpotInvalidDataException("Unknown TrackingType: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): TrackingType = apply {
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

            return other is TrackingType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalBehavioralEventTypeDefinition &&
            id == other.id &&
            archived == other.archived &&
            associations == other.associations &&
            fullyQualifiedName == other.fullyQualifiedName &&
            labels == other.labels &&
            name == other.name &&
            objectTypeId == other.objectTypeId &&
            properties == other.properties &&
            comboEventRules == other.comboEventRules &&
            createdAt == other.createdAt &&
            createdUserId == other.createdUserId &&
            customMatchingId == other.customMatchingId &&
            description == other.description &&
            detailTemplate == other.detailTemplate &&
            headerTemplate == other.headerTemplate &&
            primaryObject == other.primaryObject &&
            primaryObjectId == other.primaryObjectId &&
            trackingType == other.trackingType &&
            updatedAt == other.updatedAt &&
            updatedUserId == other.updatedUserId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            archived,
            associations,
            fullyQualifiedName,
            labels,
            name,
            objectTypeId,
            properties,
            comboEventRules,
            createdAt,
            createdUserId,
            customMatchingId,
            description,
            detailTemplate,
            headerTemplate,
            primaryObject,
            primaryObjectId,
            trackingType,
            updatedAt,
            updatedUserId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalBehavioralEventTypeDefinition{id=$id, archived=$archived, associations=$associations, fullyQualifiedName=$fullyQualifiedName, labels=$labels, name=$name, objectTypeId=$objectTypeId, properties=$properties, comboEventRules=$comboEventRules, createdAt=$createdAt, createdUserId=$createdUserId, customMatchingId=$customMatchingId, description=$description, detailTemplate=$detailTemplate, headerTemplate=$headerTemplate, primaryObject=$primaryObject, primaryObjectId=$primaryObjectId, trackingType=$trackingType, updatedAt=$updatedAt, updatedUserId=$updatedUserId, additionalProperties=$additionalProperties}"
}
