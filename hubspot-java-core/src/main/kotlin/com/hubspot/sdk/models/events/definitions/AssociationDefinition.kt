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
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** The definition of an association */
class AssociationDefinition
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
    private val isDefault: JsonField<Boolean>,
    private val isInversePrimary: JsonField<Boolean>,
    private val isPrimary: JsonField<Boolean>,
    private val maxFromObjectIds: JsonField<Int>,
    private val maxToObjectIds: JsonField<Int>,
    private val name: JsonField<String>,
    private val portalUniqueIdentifier: JsonField<String>,
    private val readOnly: JsonField<Boolean>,
    private val toObjectTypeId: JsonField<String>,
    private val fromObjectType: JsonField<FromObjectType>,
    private val hiddenReason: JsonField<HiddenReason>,
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
        @JsonProperty("category") @ExcludeMissing category: JsonField<Category> = JsonMissing.of(),
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
        @JsonProperty("isDefault") @ExcludeMissing isDefault: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isInversePrimary")
        @ExcludeMissing
        isInversePrimary: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isPrimary") @ExcludeMissing isPrimary: JsonField<Boolean> = JsonMissing.of(),
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
        @JsonProperty("readOnly") @ExcludeMissing readOnly: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("toObjectTypeId")
        @ExcludeMissing
        toObjectTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fromObjectType")
        @ExcludeMissing
        fromObjectType: JsonField<FromObjectType> = JsonMissing.of(),
        @JsonProperty("hiddenReason")
        @ExcludeMissing
        hiddenReason: JsonField<HiddenReason> = JsonMissing.of(),
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
        isDefault,
        isInversePrimary,
        isPrimary,
        maxFromObjectIds,
        maxToObjectIds,
        name,
        portalUniqueIdentifier,
        readOnly,
        toObjectTypeId,
        fromObjectType,
        hiddenReason,
        inverseLabel,
        label,
        toObjectType,
        mutableMapOf(),
    )

    /**
     * The unique ID of the associated object (e.g., a contact ID).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): Int = id.getRequired("id")

    /**
     * Whether custom labels can be used in the association.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun allowsCustomLabels(): Boolean = allowsCustomLabels.getRequired("allowsCustomLabels")

    /**
     * The cardinality from the source object's perspective, either "ONE_TO_ONE" or "ONE_TO_MANY".
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cardinality(): Cardinality = cardinality.getRequired("cardinality")

    /**
     * The error category
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun category(): Category = category.getRequired("category")

    /**
     * The ID of the source object type (e.g., 0-1 for contacts).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fromObjectTypeId(): String = fromObjectTypeId.getRequired("fromObjectTypeId")

    /**
     * Whether all potential linked objects are included in the association
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hasAllAssociatedObjects(): Boolean =
        hasAllAssociatedObjects.getRequired("hasAllAssociatedObjects")

    /**
     * Whether deletions in the association should cause cascading deletes to linked objects.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hasCascadingDeletes(): Boolean = hasCascadingDeletes.getRequired("hasCascadingDeletes")

    /**
     * Whether a user has set a limit for the number of source objects.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hasUserEnforcedMaxFromObjectIds(): Boolean =
        hasUserEnforcedMaxFromObjectIds.getRequired("hasUserEnforcedMaxFromObjectIds")

    /**
     * Whether a user has set a limit for the number of destination objects.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hasUserEnforcedMaxToObjectIds(): Boolean =
        hasUserEnforcedMaxToObjectIds.getRequired("hasUserEnforcedMaxToObjectIds")

    /**
     * Whether the association is hidden or not.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hidden(): Boolean = hidden.getRequired("hidden")

    /**
     * Whether the reverse association can also support custom labels.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inverseAllowsCustomLabels(): Boolean =
        inverseAllowsCustomLabels.getRequired("inverseAllowsCustomLabels")

    /**
     * The cardinality from the destination object's perspective, either "ONE_TO_ONE" or
     * "ONE_TO_MANY".
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inverseCardinality(): InverseCardinality =
        inverseCardinality.getRequired("inverseCardinality")

    /**
     * Whether all potential reverse linked objects are included in the association.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inverseHasAllAssociatedObjects(): Boolean =
        inverseHasAllAssociatedObjects.getRequired("inverseHasAllAssociatedObjects")

    /**
     * The unique ID for the inverse side of the association.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inverseId(): Int = inverseId.getRequired("inverseId")

    /**
     * The name used to describe the inverse relationship in this association
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inverseName(): String = inverseName.getRequired("inverseName")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isDefault(): Boolean = isDefault.getRequired("isDefault")

    /**
     * Whether the inverse association is considered primary.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isInversePrimary(): Boolean = isInversePrimary.getRequired("isInversePrimary")

    /**
     * Whether the association is the primary link between the entities involved.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isPrimary(): Boolean = isPrimary.getRequired("isPrimary")

    /**
     * The maximum number of source object IDs allowed in the association.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun maxFromObjectIds(): Int = maxFromObjectIds.getRequired("maxFromObjectIds")

    /**
     * The maximum number of destination object IDs allowed in the association.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun maxToObjectIds(): Int = maxToObjectIds.getRequired("maxToObjectIds")

    /**
     * For labeled association types, the internal name of the association.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * A unique across-portal ID applied to the association.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun portalUniqueIdentifier(): String =
        portalUniqueIdentifier.getRequired("portalUniqueIdentifier")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun readOnly(): Boolean = readOnly.getRequired("readOnly")

    /**
     * The ID of the destination object type (e.g., 0-3 for deals).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun toObjectTypeId(): String = toObjectTypeId.getRequired("toObjectTypeId")

    /**
     * The name of the source object type (e.g,. "DEAL" or "QUOTE").
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fromObjectType(): Optional<FromObjectType> = fromObjectType.getOptional("fromObjectType")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hiddenReason(): Optional<HiddenReason> = hiddenReason.getOptional("hiddenReason")

    /**
     * The label used to describe the reverse relationship in an association.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inverseLabel(): Optional<String> = inverseLabel.getOptional("inverseLabel")

    /**
     * The label given to an association.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun label(): Optional<String> = label.getOptional("label")

    /**
     * The name of the destination object type (e.g,. "DEAL" or "QUOTE").
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
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
     * Unlike [allowsCustomLabels], this method doesn't throw if the JSON field has an unexpected
     * type.
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
     * Unlike [hasCascadingDeletes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("hasCascadingDeletes")
    @ExcludeMissing
    fun _hasCascadingDeletes(): JsonField<Boolean> = hasCascadingDeletes

    /**
     * Returns the raw JSON value of [hasUserEnforcedMaxFromObjectIds].
     *
     * Unlike [hasUserEnforcedMaxFromObjectIds], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("hasUserEnforcedMaxFromObjectIds")
    @ExcludeMissing
    fun _hasUserEnforcedMaxFromObjectIds(): JsonField<Boolean> = hasUserEnforcedMaxFromObjectIds

    /**
     * Returns the raw JSON value of [hasUserEnforcedMaxToObjectIds].
     *
     * Unlike [hasUserEnforcedMaxToObjectIds], this method doesn't throw if the JSON field has an
     * unexpected type.
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
     * Unlike [inverseCardinality], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("inverseCardinality")
    @ExcludeMissing
    fun _inverseCardinality(): JsonField<InverseCardinality> = inverseCardinality

    /**
     * Returns the raw JSON value of [inverseHasAllAssociatedObjects].
     *
     * Unlike [inverseHasAllAssociatedObjects], this method doesn't throw if the JSON field has an
     * unexpected type.
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
    @JsonProperty("inverseName") @ExcludeMissing fun _inverseName(): JsonField<String> = inverseName

    /**
     * Returns the raw JSON value of [isDefault].
     *
     * Unlike [isDefault], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isDefault") @ExcludeMissing fun _isDefault(): JsonField<Boolean> = isDefault

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
     * Unlike [maxToObjectIds], this method doesn't throw if the JSON field has an unexpected type.
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
     * Returns the raw JSON value of [readOnly].
     *
     * Unlike [readOnly], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("readOnly") @ExcludeMissing fun _readOnly(): JsonField<Boolean> = readOnly

    /**
     * Returns the raw JSON value of [toObjectTypeId].
     *
     * Unlike [toObjectTypeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("toObjectTypeId")
    @ExcludeMissing
    fun _toObjectTypeId(): JsonField<String> = toObjectTypeId

    /**
     * Returns the raw JSON value of [fromObjectType].
     *
     * Unlike [fromObjectType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fromObjectType")
    @ExcludeMissing
    fun _fromObjectType(): JsonField<FromObjectType> = fromObjectType

    /**
     * Returns the raw JSON value of [hiddenReason].
     *
     * Unlike [hiddenReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hiddenReason")
    @ExcludeMissing
    fun _hiddenReason(): JsonField<HiddenReason> = hiddenReason

    /**
     * Returns the raw JSON value of [inverseLabel].
     *
     * Unlike [inverseLabel], this method doesn't throw if the JSON field has an unexpected type.
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
     * Unlike [toObjectType], this method doesn't throw if the JSON field has an unexpected type.
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
         * Returns a mutable builder for constructing an instance of [AssociationDefinition].
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
         * .isDefault()
         * .isInversePrimary()
         * .isPrimary()
         * .maxFromObjectIds()
         * .maxToObjectIds()
         * .name()
         * .portalUniqueIdentifier()
         * .readOnly()
         * .toObjectTypeId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AssociationDefinition]. */
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
        private var isDefault: JsonField<Boolean>? = null
        private var isInversePrimary: JsonField<Boolean>? = null
        private var isPrimary: JsonField<Boolean>? = null
        private var maxFromObjectIds: JsonField<Int>? = null
        private var maxToObjectIds: JsonField<Int>? = null
        private var name: JsonField<String>? = null
        private var portalUniqueIdentifier: JsonField<String>? = null
        private var readOnly: JsonField<Boolean>? = null
        private var toObjectTypeId: JsonField<String>? = null
        private var fromObjectType: JsonField<FromObjectType> = JsonMissing.of()
        private var hiddenReason: JsonField<HiddenReason> = JsonMissing.of()
        private var inverseLabel: JsonField<String> = JsonMissing.of()
        private var label: JsonField<String> = JsonMissing.of()
        private var toObjectType: JsonField<ToObjectType> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(associationDefinition: AssociationDefinition) = apply {
            id = associationDefinition.id
            allowsCustomLabels = associationDefinition.allowsCustomLabels
            cardinality = associationDefinition.cardinality
            category = associationDefinition.category
            fromObjectTypeId = associationDefinition.fromObjectTypeId
            hasAllAssociatedObjects = associationDefinition.hasAllAssociatedObjects
            hasCascadingDeletes = associationDefinition.hasCascadingDeletes
            hasUserEnforcedMaxFromObjectIds = associationDefinition.hasUserEnforcedMaxFromObjectIds
            hasUserEnforcedMaxToObjectIds = associationDefinition.hasUserEnforcedMaxToObjectIds
            hidden = associationDefinition.hidden
            inverseAllowsCustomLabels = associationDefinition.inverseAllowsCustomLabels
            inverseCardinality = associationDefinition.inverseCardinality
            inverseHasAllAssociatedObjects = associationDefinition.inverseHasAllAssociatedObjects
            inverseId = associationDefinition.inverseId
            inverseName = associationDefinition.inverseName
            isDefault = associationDefinition.isDefault
            isInversePrimary = associationDefinition.isInversePrimary
            isPrimary = associationDefinition.isPrimary
            maxFromObjectIds = associationDefinition.maxFromObjectIds
            maxToObjectIds = associationDefinition.maxToObjectIds
            name = associationDefinition.name
            portalUniqueIdentifier = associationDefinition.portalUniqueIdentifier
            readOnly = associationDefinition.readOnly
            toObjectTypeId = associationDefinition.toObjectTypeId
            fromObjectType = associationDefinition.fromObjectType
            hiddenReason = associationDefinition.hiddenReason
            inverseLabel = associationDefinition.inverseLabel
            label = associationDefinition.label
            toObjectType = associationDefinition.toObjectType
            additionalProperties = associationDefinition.additionalProperties.toMutableMap()
        }

        /** The unique ID of the associated object (e.g., a contact ID). */
        fun id(id: Int) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [Int] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<Int>) = apply { this.id = id }

        /** Whether custom labels can be used in the association. */
        fun allowsCustomLabels(allowsCustomLabels: Boolean) =
            allowsCustomLabels(JsonField.of(allowsCustomLabels))

        /**
         * Sets [Builder.allowsCustomLabels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowsCustomLabels] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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

        /** The error category */
        fun category(category: Category) = category(JsonField.of(category))

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed [Category] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun hasAllAssociatedObjects(hasAllAssociatedObjects: JsonField<Boolean>) = apply {
            this.hasAllAssociatedObjects = hasAllAssociatedObjects
        }

        /**
         * Whether deletions in the association should cause cascading deletes to linked objects.
         */
        fun hasCascadingDeletes(hasCascadingDeletes: Boolean) =
            hasCascadingDeletes(JsonField.of(hasCascadingDeletes))

        /**
         * Sets [Builder.hasCascadingDeletes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasCascadingDeletes] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
        fun hasUserEnforcedMaxFromObjectIds(hasUserEnforcedMaxFromObjectIds: JsonField<Boolean>) =
            apply {
                this.hasUserEnforcedMaxFromObjectIds = hasUserEnforcedMaxFromObjectIds
            }

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
         * You should usually call [Builder.hidden] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hidden(hidden: JsonField<Boolean>) = apply { this.hidden = hidden }

        /** Whether the reverse association can also support custom labels. */
        fun inverseAllowsCustomLabels(inverseAllowsCustomLabels: Boolean) =
            inverseAllowsCustomLabels(JsonField.of(inverseAllowsCustomLabels))

        /**
         * Sets [Builder.inverseAllowsCustomLabels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inverseAllowsCustomLabels] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
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
         * [InverseCardinality] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
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
         * You should usually call [Builder.inverseId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun inverseId(inverseId: JsonField<Int>) = apply { this.inverseId = inverseId }

        /** The name used to describe the inverse relationship in this association */
        fun inverseName(inverseName: String) = inverseName(JsonField.of(inverseName))

        /**
         * Sets [Builder.inverseName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inverseName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun inverseName(inverseName: JsonField<String>) = apply { this.inverseName = inverseName }

        fun isDefault(isDefault: Boolean) = isDefault(JsonField.of(isDefault))

        /**
         * Sets [Builder.isDefault] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isDefault] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isDefault(isDefault: JsonField<Boolean>) = apply { this.isDefault = isDefault }

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
         * You should usually call [Builder.isPrimary] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isPrimary(isPrimary: JsonField<Boolean>) = apply { this.isPrimary = isPrimary }

        /** The maximum number of source object IDs allowed in the association. */
        fun maxFromObjectIds(maxFromObjectIds: Int) =
            maxFromObjectIds(JsonField.of(maxFromObjectIds))

        /**
         * Sets [Builder.maxFromObjectIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxFromObjectIds] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxFromObjectIds(maxFromObjectIds: JsonField<Int>) = apply {
            this.maxFromObjectIds = maxFromObjectIds
        }

        /** The maximum number of destination object IDs allowed in the association. */
        fun maxToObjectIds(maxToObjectIds: Int) = maxToObjectIds(JsonField.of(maxToObjectIds))

        /**
         * Sets [Builder.maxToObjectIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxToObjectIds] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** A unique across-portal ID applied to the association. */
        fun portalUniqueIdentifier(portalUniqueIdentifier: String) =
            portalUniqueIdentifier(JsonField.of(portalUniqueIdentifier))

        /**
         * Sets [Builder.portalUniqueIdentifier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.portalUniqueIdentifier] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun portalUniqueIdentifier(portalUniqueIdentifier: JsonField<String>) = apply {
            this.portalUniqueIdentifier = portalUniqueIdentifier
        }

        fun readOnly(readOnly: Boolean) = readOnly(JsonField.of(readOnly))

        /**
         * Sets [Builder.readOnly] to an arbitrary JSON value.
         *
         * You should usually call [Builder.readOnly] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun readOnly(readOnly: JsonField<Boolean>) = apply { this.readOnly = readOnly }

        /** The ID of the destination object type (e.g., 0-3 for deals). */
        fun toObjectTypeId(toObjectTypeId: String) = toObjectTypeId(JsonField.of(toObjectTypeId))

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
         * You should usually call [Builder.fromObjectType] with a well-typed [FromObjectType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fromObjectType(fromObjectType: JsonField<FromObjectType>) = apply {
            this.fromObjectType = fromObjectType
        }

        fun hiddenReason(hiddenReason: HiddenReason) = hiddenReason(JsonField.of(hiddenReason))

        /**
         * Sets [Builder.hiddenReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hiddenReason] with a well-typed [HiddenReason] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hiddenReason(hiddenReason: JsonField<HiddenReason>) = apply {
            this.hiddenReason = hiddenReason
        }

        /** The label used to describe the reverse relationship in an association. */
        fun inverseLabel(inverseLabel: String) = inverseLabel(JsonField.of(inverseLabel))

        /**
         * Sets [Builder.inverseLabel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inverseLabel] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun inverseLabel(inverseLabel: JsonField<String>) = apply {
            this.inverseLabel = inverseLabel
        }

        /** The label given to an association. */
        fun label(label: String) = label(JsonField.of(label))

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * Returns an immutable instance of [AssociationDefinition].
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
         * .isDefault()
         * .isInversePrimary()
         * .isPrimary()
         * .maxFromObjectIds()
         * .maxToObjectIds()
         * .name()
         * .portalUniqueIdentifier()
         * .readOnly()
         * .toObjectTypeId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AssociationDefinition =
            AssociationDefinition(
                checkRequired("id", id),
                checkRequired("allowsCustomLabels", allowsCustomLabels),
                checkRequired("cardinality", cardinality),
                checkRequired("category", category),
                checkRequired("fromObjectTypeId", fromObjectTypeId),
                checkRequired("hasAllAssociatedObjects", hasAllAssociatedObjects),
                checkRequired("hasCascadingDeletes", hasCascadingDeletes),
                checkRequired("hasUserEnforcedMaxFromObjectIds", hasUserEnforcedMaxFromObjectIds),
                checkRequired("hasUserEnforcedMaxToObjectIds", hasUserEnforcedMaxToObjectIds),
                checkRequired("hidden", hidden),
                checkRequired("inverseAllowsCustomLabels", inverseAllowsCustomLabels),
                checkRequired("inverseCardinality", inverseCardinality),
                checkRequired("inverseHasAllAssociatedObjects", inverseHasAllAssociatedObjects),
                checkRequired("inverseId", inverseId),
                checkRequired("inverseName", inverseName),
                checkRequired("isDefault", isDefault),
                checkRequired("isInversePrimary", isInversePrimary),
                checkRequired("isPrimary", isPrimary),
                checkRequired("maxFromObjectIds", maxFromObjectIds),
                checkRequired("maxToObjectIds", maxToObjectIds),
                checkRequired("name", name),
                checkRequired("portalUniqueIdentifier", portalUniqueIdentifier),
                checkRequired("readOnly", readOnly),
                checkRequired("toObjectTypeId", toObjectTypeId),
                fromObjectType,
                hiddenReason,
                inverseLabel,
                label,
                toObjectType,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AssociationDefinition = apply {
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
        isDefault()
        isInversePrimary()
        isPrimary()
        maxFromObjectIds()
        maxToObjectIds()
        name()
        portalUniqueIdentifier()
        readOnly()
        toObjectTypeId()
        fromObjectType().ifPresent { it.validate() }
        hiddenReason().ifPresent { it.validate() }
        inverseLabel()
        label()
        toObjectType().ifPresent { it.validate() }
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
            (if (isDefault.asKnown().isPresent) 1 else 0) +
            (if (isInversePrimary.asKnown().isPresent) 1 else 0) +
            (if (isPrimary.asKnown().isPresent) 1 else 0) +
            (if (maxFromObjectIds.asKnown().isPresent) 1 else 0) +
            (if (maxToObjectIds.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (portalUniqueIdentifier.asKnown().isPresent) 1 else 0) +
            (if (readOnly.asKnown().isPresent) 1 else 0) +
            (if (toObjectTypeId.asKnown().isPresent) 1 else 0) +
            (fromObjectType.asKnown().getOrNull()?.validity() ?: 0) +
            (hiddenReason.asKnown().getOrNull()?.validity() ?: 0) +
            (if (inverseLabel.asKnown().isPresent) 1 else 0) +
            (if (label.asKnown().isPresent) 1 else 0) +
            (toObjectType.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * The cardinality from the source object's perspective, either "ONE_TO_ONE" or "ONE_TO_MANY".
     */
    class Cardinality @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val ONE_TO_MANY = of("ONE_TO_MANY")

            @JvmField val ONE_TO_ONE = of("ONE_TO_ONE")

            @JvmStatic fun of(value: String) = Cardinality(JsonField.of(value))
        }

        /** An enum containing [Cardinality]'s known values. */
        enum class Known {
            ONE_TO_MANY,
            ONE_TO_ONE,
        }

        /**
         * An enum containing [Cardinality]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Cardinality] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ONE_TO_MANY,
            ONE_TO_ONE,
            /**
             * An enum member indicating that [Cardinality] was instantiated with an unknown value.
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
                ONE_TO_MANY -> Value.ONE_TO_MANY
                ONE_TO_ONE -> Value.ONE_TO_ONE
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
                ONE_TO_MANY -> Known.ONE_TO_MANY
                ONE_TO_ONE -> Known.ONE_TO_ONE
                else -> throw HubSpotInvalidDataException("Unknown Cardinality: $value")
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

            return other is Cardinality && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The error category */
    class Category @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val INTEGRATOR_DEFINED = of("INTEGRATOR_DEFINED")

            @JvmField val USER_DEFINED = of("USER_DEFINED")

            @JvmField val WORK = of("WORK")

            @JvmStatic fun of(value: String) = Category(JsonField.of(value))
        }

        /** An enum containing [Category]'s known values. */
        enum class Known {
            HUBSPOT_DEFINED,
            INTEGRATOR_DEFINED,
            USER_DEFINED,
            WORK,
        }

        /**
         * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Category] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            HUBSPOT_DEFINED,
            INTEGRATOR_DEFINED,
            USER_DEFINED,
            WORK,
            /** An enum member indicating that [Category] was instantiated with an unknown value. */
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
                INTEGRATOR_DEFINED -> Value.INTEGRATOR_DEFINED
                USER_DEFINED -> Value.USER_DEFINED
                WORK -> Value.WORK
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
                HUBSPOT_DEFINED -> Known.HUBSPOT_DEFINED
                INTEGRATOR_DEFINED -> Known.INTEGRATOR_DEFINED
                USER_DEFINED -> Known.USER_DEFINED
                WORK -> Known.WORK
                else -> throw HubSpotInvalidDataException("Unknown Category: $value")
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
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ONE_TO_MANY = of("ONE_TO_MANY")

            @JvmField val ONE_TO_ONE = of("ONE_TO_ONE")

            @JvmStatic fun of(value: String) = InverseCardinality(JsonField.of(value))
        }

        /** An enum containing [InverseCardinality]'s known values. */
        enum class Known {
            ONE_TO_MANY,
            ONE_TO_ONE,
        }

        /**
         * An enum containing [InverseCardinality]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [InverseCardinality] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ONE_TO_MANY,
            ONE_TO_ONE,
            /**
             * An enum member indicating that [InverseCardinality] was instantiated with an unknown
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
                ONE_TO_MANY -> Value.ONE_TO_MANY
                ONE_TO_ONE -> Value.ONE_TO_ONE
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
                ONE_TO_MANY -> Known.ONE_TO_MANY
                ONE_TO_ONE -> Known.ONE_TO_ONE
                else -> throw HubSpotInvalidDataException("Unknown InverseCardinality: $value")
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

            return other is InverseCardinality && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The name of the source object type (e.g,. "DEAL" or "QUOTE"). */
    class FromObjectType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val ABANDONED_CART = of("ABANDONED_CART")

            @JvmField val ACCEPTANCE_TEST = of("ACCEPTANCE_TEST")

            @JvmField val AD = of("AD")

            @JvmField val AD_ACCOUNT = of("AD_ACCOUNT")

            @JvmField val AD_CAMPAIGN = of("AD_CAMPAIGN")

            @JvmField val AD_GROUP = of("AD_GROUP")

            @JvmField val AI_FORECAST = of("AI_FORECAST")

            @JvmField val ALL_PAGES = of("ALL_PAGES")

            @JvmField val APPROVAL = of("APPROVAL")

            @JvmField val APPROVAL_STEP = of("APPROVAL_STEP")

            @JvmField val ATTRIBUTION = of("ATTRIBUTION")

            @JvmField val AUDIENCE = of("AUDIENCE")

            @JvmField val AUTOMATION_JOURNEY = of("AUTOMATION_JOURNEY")

            @JvmField val AUTOMATION_PLATFORM_FLOW = of("AUTOMATION_PLATFORM_FLOW")

            @JvmField val AUTOMATION_PLATFORM_FLOW_ACTION = of("AUTOMATION_PLATFORM_FLOW_ACTION")

            @JvmField val BET_ALERT = of("BET_ALERT")

            @JvmField val BET_DELIVERABLE_SERVICE = of("BET_DELIVERABLE_SERVICE")

            @JvmField val BLOG_LISTING_PAGE = of("BLOG_LISTING_PAGE")

            @JvmField val BLOG_POST = of("BLOG_POST")

            @JvmField val CALL = of("CALL")

            @JvmField val CAMPAIGN = of("CAMPAIGN")

            @JvmField val CAMPAIGN_BUDGET_ITEM = of("CAMPAIGN_BUDGET_ITEM")

            @JvmField val CAMPAIGN_SPEND_ITEM = of("CAMPAIGN_SPEND_ITEM")

            @JvmField val CAMPAIGN_STEP = of("CAMPAIGN_STEP")

            @JvmField val CAMPAIGN_TEMPLATE = of("CAMPAIGN_TEMPLATE")

            @JvmField val CAMPAIGN_TEMPLATE_STEP = of("CAMPAIGN_TEMPLATE_STEP")

            @JvmField val CART = of("CART")

            @JvmField val CASE_STUDY = of("CASE_STUDY")

            @JvmField val CHATFLOW = of("CHATFLOW")

            @JvmField val CLIP = of("CLIP")

            @JvmField val CMS_URL = of("CMS_URL")

            @JvmField val COMBO_EVENT_CONFIGURATION = of("COMBO_EVENT_CONFIGURATION")

            @JvmField val COMMERCE_PAYMENT = of("COMMERCE_PAYMENT")

            @JvmField val COMMUNICATION = of("COMMUNICATION")

            @JvmField val COMPANY = of("COMPANY")

            @JvmField val CONTACT = of("CONTACT")

            @JvmField val CONTACT_CREATE_ATTRIBUTION = of("CONTACT_CREATE_ATTRIBUTION")

            @JvmField val CONTENT = of("CONTENT")

            @JvmField val CONTENT_AUDIT = of("CONTENT_AUDIT")

            @JvmField val CONTENT_AUDIT_PAGE = of("CONTENT_AUDIT_PAGE")

            @JvmField val CONVERSATION = of("CONVERSATION")

            @JvmField val CONVERSATION_INBOX = of("CONVERSATION_INBOX")

            @JvmField val CONVERSATION_SESSION = of("CONVERSATION_SESSION")

            @JvmField val CRM_OBJECTS_DUMMY_TYPE = of("CRM_OBJECTS_DUMMY_TYPE")

            @JvmField val CRM_PIPELINES_DUMMY_TYPE = of("CRM_PIPELINES_DUMMY_TYPE")

            @JvmField val CTA = of("CTA")

            @JvmField val CTA_VARIANT = of("CTA_VARIANT")

            @JvmField val DATA_PRIVACY_CONSENT = of("DATA_PRIVACY_CONSENT")

            @JvmField val DATA_SYNC_STATE = of("DATA_SYNC_STATE")

            @JvmField val DEAL = of("DEAL")

            @JvmField val DEAL_CREATE_ATTRIBUTION = of("DEAL_CREATE_ATTRIBUTION")

            @JvmField val DEAL_REGISTRATION = of("DEAL_REGISTRATION")

            @JvmField val DEAL_SPLIT = of("DEAL_SPLIT")

            @JvmField val DISCOUNT = of("DISCOUNT")

            @JvmField val DISCOUNT_CODE = of("DISCOUNT_CODE")

            @JvmField val DISCOUNT_TEMPLATE = of("DISCOUNT_TEMPLATE")

            @JvmField val EMAIL = of("EMAIL")

            @JvmField val ENGAGEMENT = of("ENGAGEMENT")

            @JvmField val EXPORT = of("EXPORT")

            @JvmField val EXTERNAL_WEB_URL = of("EXTERNAL_WEB_URL")

            @JvmField val FEE = of("FEE")

            @JvmField val FEEDBACK_SUBMISSION = of("FEEDBACK_SUBMISSION")

            @JvmField val FEEDBACK_SURVEY = of("FEEDBACK_SURVEY")

            @JvmField val FILE_MANAGER_FILE = of("FILE_MANAGER_FILE")

            @JvmField val FILE_MANAGER_FOLDER = of("FILE_MANAGER_FOLDER")

            @JvmField val FOLDER = of("FOLDER")

            @JvmField val FORECAST = of("FORECAST")

            @JvmField val FORM = of("FORM")

            @JvmField val FORM_SUBMISSION_INBOUNDDB = of("FORM_SUBMISSION_INBOUNDDB")

            @JvmField val GOAL_TARGET = of("GOAL_TARGET")

            @JvmField val GOAL_TARGET_GROUP = of("GOAL_TARGET_GROUP")

            @JvmField val GOAL_TEMPLATE = of("GOAL_TEMPLATE")

            @JvmField val GSC_PROPERTY = of("GSC_PROPERTY")

            @JvmField val HUB = of("HUB")

            @JvmField val IMPORT = of("IMPORT")

            @JvmField val INVOICE = of("INVOICE")

            @JvmField val KEYWORD = of("KEYWORD")

            @JvmField val KNOWLEDGE_ARTICLE = of("KNOWLEDGE_ARTICLE")

            @JvmField val LANDING_PAGE = of("LANDING_PAGE")

            @JvmField val LEAD = of("LEAD")

            @JvmField val LINE_ITEM = of("LINE_ITEM")

            @JvmField val MARKETING_CALENDAR = of("MARKETING_CALENDAR")

            @JvmField val MARKETING_CAMPAIGN_UTM = of("MARKETING_CAMPAIGN_UTM")

            @JvmField val MARKETING_EMAIL = of("MARKETING_EMAIL")

            @JvmField val MARKETING_EVENT = of("MARKETING_EVENT")

            @JvmField val MARKETING_EVENT_ATTENDANCE = of("MARKETING_EVENT_ATTENDANCE")

            @JvmField val MARKETING_SMS = of("MARKETING_SMS")

            @JvmField val MEDIA_BRIDGE = of("MEDIA_BRIDGE")

            @JvmField val MEETING_EVENT = of("MEETING_EVENT")

            @JvmField val MIC = of("MIC")

            @JvmField val NOTE = of("NOTE")

            @JvmField val OBJECT_LIST = of("OBJECT_LIST")

            @JvmField val ORDER = of("ORDER")

            @JvmField val OWNER = of("OWNER")

            @JvmField val PARTNER_ACCOUNT = of("PARTNER_ACCOUNT")

            @JvmField val PARTNER_CLIENT = of("PARTNER_CLIENT")

            @JvmField val PARTNER_CLIENT_REVENUE = of("PARTNER_CLIENT_REVENUE")

            @JvmField val PARTNER_SERVICE = of("PARTNER_SERVICE")

            @JvmField val PAYMENT_LINK = of("PAYMENT_LINK")

            @JvmField val PAYMENT_SCHEDULE = of("PAYMENT_SCHEDULE")

            @JvmField val PAYMENT_SCHEDULE_INSTALLMENT = of("PAYMENT_SCHEDULE_INSTALLMENT")

            @JvmField val PERMISSIONS_TESTING = of("PERMISSIONS_TESTING")

            @JvmField val PLAYBOOK = of("PLAYBOOK")

            @JvmField val PLAYBOOK_QUESTION = of("PLAYBOOK_QUESTION")

            @JvmField val PLAYBOOK_SUBMISSION = of("PLAYBOOK_SUBMISSION")

            @JvmField val PLAYBOOK_SUBMISSION_ANSWER = of("PLAYBOOK_SUBMISSION_ANSWER")

            @JvmField val PLAYLIST = of("PLAYLIST")

            @JvmField val PLAYLIST_FOLDER = of("PLAYLIST_FOLDER")

            @JvmField val PODCAST_EPISODE = of("PODCAST_EPISODE")

            @JvmField val PORTAL = of("PORTAL")

            @JvmField val PORTAL_OBJECT_SYNC_MESSAGE = of("PORTAL_OBJECT_SYNC_MESSAGE")

            @JvmField val POSTAL_MAIL = of("POSTAL_MAIL")

            @JvmField val PRIVACY_SCANNER_COOKIE = of("PRIVACY_SCANNER_COOKIE")

            @JvmField val PRODUCT = of("PRODUCT")

            @JvmField val PRODUCT_OR_FOLDER = of("PRODUCT_OR_FOLDER")

            @JvmField val PROPERTY_INFO = of("PROPERTY_INFO")

            @JvmField
            val PROSPECTING_AGENT_CONTACT_ASSIGNMENT = of("PROSPECTING_AGENT_CONTACT_ASSIGNMENT")

            @JvmField val PUBLISHING_TASK = of("PUBLISHING_TASK")

            @JvmField val QUARANTINED_SUBMISSION = of("QUARANTINED_SUBMISSION")

            @JvmField val QUOTA = of("QUOTA")

            @JvmField val QUOTE = of("QUOTE")

            @JvmField val QUOTE_FIELD = of("QUOTE_FIELD")

            @JvmField val QUOTE_MODULE = of("QUOTE_MODULE")

            @JvmField val QUOTE_MODULE_FIELD = of("QUOTE_MODULE_FIELD")

            @JvmField val QUOTE_TEMPLATE = of("QUOTE_TEMPLATE")

            @JvmField val RESTORABLE_CRM_OBJECT = of("RESTORABLE_CRM_OBJECT")

            @JvmField val ROSTER = of("ROSTER")

            @JvmField val ROSTER_MEMBER = of("ROSTER_MEMBER")

            @JvmField val SALES_DOCUMENT = of("SALES_DOCUMENT")

            @JvmField val SALES_TASK = of("SALES_TASK")

            @JvmField val SALES_WORKLOAD = of("SALES_WORKLOAD")

            @JvmField val SALESFORCE_SYNC_ERROR = of("SALESFORCE_SYNC_ERROR")

            @JvmField val SCHEDULING_PAGE = of("SCHEDULING_PAGE")

            @JvmField val SCHEMAS_BACKEND_TEST = of("SCHEMAS_BACKEND_TEST")

            @JvmField val SCORE_CONFIGURATION = of("SCORE_CONFIGURATION")

            @JvmField val SEQUENCE = of("SEQUENCE")

            @JvmField val SEQUENCE_ENROLLMENT = of("SEQUENCE_ENROLLMENT")

            @JvmField val SEQUENCE_STEP = of("SEQUENCE_STEP")

            @JvmField val SEQUENCE_STEP_ENROLLMENT = of("SEQUENCE_STEP_ENROLLMENT")

            @JvmField val SERVICE = of("SERVICE")

            @JvmField val SITE_PAGE = of("SITE_PAGE")

            @JvmField val SNIPPET = of("SNIPPET")

            @JvmField val SOCIAL_BROADCAST = of("SOCIAL_BROADCAST")

            @JvmField val SOCIAL_CHANNEL = of("SOCIAL_CHANNEL")

            @JvmField val SOCIAL_POST = of("SOCIAL_POST")

            @JvmField val SOCIAL_PROFILE = of("SOCIAL_PROFILE")

            @JvmField val SOX_PROTECTED_DUMMY_TYPE = of("SOX_PROTECTED_DUMMY_TYPE")

            @JvmField val SOX_PROTECTED_TEST_TYPE = of("SOX_PROTECTED_TEST_TYPE")

            @JvmField val SUBMISSION_TAG = of("SUBMISSION_TAG")

            @JvmField val SUBSCRIPTION = of("SUBSCRIPTION")

            @JvmField val TASK = of("TASK")

            @JvmField val TASK_TEMPLATE = of("TASK_TEMPLATE")

            @JvmField val TAX = of("TAX")

            @JvmField val TEMPLATE = of("TEMPLATE")

            @JvmField val TICKET = of("TICKET")

            @JvmField val UNKNOWN = of("UNKNOWN")

            @JvmField val UNSUBSCRIBE = of("UNSUBSCRIBE")

            @JvmField val USER = of("USER")

            @JvmField val VIEW = of("VIEW")

            @JvmField val VIEW_BLOCK = of("VIEW_BLOCK")

            @JvmField val WEB_INTERACTIVE = of("WEB_INTERACTIVE")

            @JvmStatic fun of(value: String) = FromObjectType(JsonField.of(value))
        }

        /** An enum containing [FromObjectType]'s known values. */
        enum class Known {
            ABANDONED_CART,
            ACCEPTANCE_TEST,
            AD,
            AD_ACCOUNT,
            AD_CAMPAIGN,
            AD_GROUP,
            AI_FORECAST,
            ALL_PAGES,
            APPROVAL,
            APPROVAL_STEP,
            ATTRIBUTION,
            AUDIENCE,
            AUTOMATION_JOURNEY,
            AUTOMATION_PLATFORM_FLOW,
            AUTOMATION_PLATFORM_FLOW_ACTION,
            BET_ALERT,
            BET_DELIVERABLE_SERVICE,
            BLOG_LISTING_PAGE,
            BLOG_POST,
            CALL,
            CAMPAIGN,
            CAMPAIGN_BUDGET_ITEM,
            CAMPAIGN_SPEND_ITEM,
            CAMPAIGN_STEP,
            CAMPAIGN_TEMPLATE,
            CAMPAIGN_TEMPLATE_STEP,
            CART,
            CASE_STUDY,
            CHATFLOW,
            CLIP,
            CMS_URL,
            COMBO_EVENT_CONFIGURATION,
            COMMERCE_PAYMENT,
            COMMUNICATION,
            COMPANY,
            CONTACT,
            CONTACT_CREATE_ATTRIBUTION,
            CONTENT,
            CONTENT_AUDIT,
            CONTENT_AUDIT_PAGE,
            CONVERSATION,
            CONVERSATION_INBOX,
            CONVERSATION_SESSION,
            CRM_OBJECTS_DUMMY_TYPE,
            CRM_PIPELINES_DUMMY_TYPE,
            CTA,
            CTA_VARIANT,
            DATA_PRIVACY_CONSENT,
            DATA_SYNC_STATE,
            DEAL,
            DEAL_CREATE_ATTRIBUTION,
            DEAL_REGISTRATION,
            DEAL_SPLIT,
            DISCOUNT,
            DISCOUNT_CODE,
            DISCOUNT_TEMPLATE,
            EMAIL,
            ENGAGEMENT,
            EXPORT,
            EXTERNAL_WEB_URL,
            FEE,
            FEEDBACK_SUBMISSION,
            FEEDBACK_SURVEY,
            FILE_MANAGER_FILE,
            FILE_MANAGER_FOLDER,
            FOLDER,
            FORECAST,
            FORM,
            FORM_SUBMISSION_INBOUNDDB,
            GOAL_TARGET,
            GOAL_TARGET_GROUP,
            GOAL_TEMPLATE,
            GSC_PROPERTY,
            HUB,
            IMPORT,
            INVOICE,
            KEYWORD,
            KNOWLEDGE_ARTICLE,
            LANDING_PAGE,
            LEAD,
            LINE_ITEM,
            MARKETING_CALENDAR,
            MARKETING_CAMPAIGN_UTM,
            MARKETING_EMAIL,
            MARKETING_EVENT,
            MARKETING_EVENT_ATTENDANCE,
            MARKETING_SMS,
            MEDIA_BRIDGE,
            MEETING_EVENT,
            MIC,
            NOTE,
            OBJECT_LIST,
            ORDER,
            OWNER,
            PARTNER_ACCOUNT,
            PARTNER_CLIENT,
            PARTNER_CLIENT_REVENUE,
            PARTNER_SERVICE,
            PAYMENT_LINK,
            PAYMENT_SCHEDULE,
            PAYMENT_SCHEDULE_INSTALLMENT,
            PERMISSIONS_TESTING,
            PLAYBOOK,
            PLAYBOOK_QUESTION,
            PLAYBOOK_SUBMISSION,
            PLAYBOOK_SUBMISSION_ANSWER,
            PLAYLIST,
            PLAYLIST_FOLDER,
            PODCAST_EPISODE,
            PORTAL,
            PORTAL_OBJECT_SYNC_MESSAGE,
            POSTAL_MAIL,
            PRIVACY_SCANNER_COOKIE,
            PRODUCT,
            PRODUCT_OR_FOLDER,
            PROPERTY_INFO,
            PROSPECTING_AGENT_CONTACT_ASSIGNMENT,
            PUBLISHING_TASK,
            QUARANTINED_SUBMISSION,
            QUOTA,
            QUOTE,
            QUOTE_FIELD,
            QUOTE_MODULE,
            QUOTE_MODULE_FIELD,
            QUOTE_TEMPLATE,
            RESTORABLE_CRM_OBJECT,
            ROSTER,
            ROSTER_MEMBER,
            SALES_DOCUMENT,
            SALES_TASK,
            SALES_WORKLOAD,
            SALESFORCE_SYNC_ERROR,
            SCHEDULING_PAGE,
            SCHEMAS_BACKEND_TEST,
            SCORE_CONFIGURATION,
            SEQUENCE,
            SEQUENCE_ENROLLMENT,
            SEQUENCE_STEP,
            SEQUENCE_STEP_ENROLLMENT,
            SERVICE,
            SITE_PAGE,
            SNIPPET,
            SOCIAL_BROADCAST,
            SOCIAL_CHANNEL,
            SOCIAL_POST,
            SOCIAL_PROFILE,
            SOX_PROTECTED_DUMMY_TYPE,
            SOX_PROTECTED_TEST_TYPE,
            SUBMISSION_TAG,
            SUBSCRIPTION,
            TASK,
            TASK_TEMPLATE,
            TAX,
            TEMPLATE,
            TICKET,
            UNKNOWN,
            UNSUBSCRIBE,
            USER,
            VIEW,
            VIEW_BLOCK,
            WEB_INTERACTIVE,
        }

        /**
         * An enum containing [FromObjectType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FromObjectType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ABANDONED_CART,
            ACCEPTANCE_TEST,
            AD,
            AD_ACCOUNT,
            AD_CAMPAIGN,
            AD_GROUP,
            AI_FORECAST,
            ALL_PAGES,
            APPROVAL,
            APPROVAL_STEP,
            ATTRIBUTION,
            AUDIENCE,
            AUTOMATION_JOURNEY,
            AUTOMATION_PLATFORM_FLOW,
            AUTOMATION_PLATFORM_FLOW_ACTION,
            BET_ALERT,
            BET_DELIVERABLE_SERVICE,
            BLOG_LISTING_PAGE,
            BLOG_POST,
            CALL,
            CAMPAIGN,
            CAMPAIGN_BUDGET_ITEM,
            CAMPAIGN_SPEND_ITEM,
            CAMPAIGN_STEP,
            CAMPAIGN_TEMPLATE,
            CAMPAIGN_TEMPLATE_STEP,
            CART,
            CASE_STUDY,
            CHATFLOW,
            CLIP,
            CMS_URL,
            COMBO_EVENT_CONFIGURATION,
            COMMERCE_PAYMENT,
            COMMUNICATION,
            COMPANY,
            CONTACT,
            CONTACT_CREATE_ATTRIBUTION,
            CONTENT,
            CONTENT_AUDIT,
            CONTENT_AUDIT_PAGE,
            CONVERSATION,
            CONVERSATION_INBOX,
            CONVERSATION_SESSION,
            CRM_OBJECTS_DUMMY_TYPE,
            CRM_PIPELINES_DUMMY_TYPE,
            CTA,
            CTA_VARIANT,
            DATA_PRIVACY_CONSENT,
            DATA_SYNC_STATE,
            DEAL,
            DEAL_CREATE_ATTRIBUTION,
            DEAL_REGISTRATION,
            DEAL_SPLIT,
            DISCOUNT,
            DISCOUNT_CODE,
            DISCOUNT_TEMPLATE,
            EMAIL,
            ENGAGEMENT,
            EXPORT,
            EXTERNAL_WEB_URL,
            FEE,
            FEEDBACK_SUBMISSION,
            FEEDBACK_SURVEY,
            FILE_MANAGER_FILE,
            FILE_MANAGER_FOLDER,
            FOLDER,
            FORECAST,
            FORM,
            FORM_SUBMISSION_INBOUNDDB,
            GOAL_TARGET,
            GOAL_TARGET_GROUP,
            GOAL_TEMPLATE,
            GSC_PROPERTY,
            HUB,
            IMPORT,
            INVOICE,
            KEYWORD,
            KNOWLEDGE_ARTICLE,
            LANDING_PAGE,
            LEAD,
            LINE_ITEM,
            MARKETING_CALENDAR,
            MARKETING_CAMPAIGN_UTM,
            MARKETING_EMAIL,
            MARKETING_EVENT,
            MARKETING_EVENT_ATTENDANCE,
            MARKETING_SMS,
            MEDIA_BRIDGE,
            MEETING_EVENT,
            MIC,
            NOTE,
            OBJECT_LIST,
            ORDER,
            OWNER,
            PARTNER_ACCOUNT,
            PARTNER_CLIENT,
            PARTNER_CLIENT_REVENUE,
            PARTNER_SERVICE,
            PAYMENT_LINK,
            PAYMENT_SCHEDULE,
            PAYMENT_SCHEDULE_INSTALLMENT,
            PERMISSIONS_TESTING,
            PLAYBOOK,
            PLAYBOOK_QUESTION,
            PLAYBOOK_SUBMISSION,
            PLAYBOOK_SUBMISSION_ANSWER,
            PLAYLIST,
            PLAYLIST_FOLDER,
            PODCAST_EPISODE,
            PORTAL,
            PORTAL_OBJECT_SYNC_MESSAGE,
            POSTAL_MAIL,
            PRIVACY_SCANNER_COOKIE,
            PRODUCT,
            PRODUCT_OR_FOLDER,
            PROPERTY_INFO,
            PROSPECTING_AGENT_CONTACT_ASSIGNMENT,
            PUBLISHING_TASK,
            QUARANTINED_SUBMISSION,
            QUOTA,
            QUOTE,
            QUOTE_FIELD,
            QUOTE_MODULE,
            QUOTE_MODULE_FIELD,
            QUOTE_TEMPLATE,
            RESTORABLE_CRM_OBJECT,
            ROSTER,
            ROSTER_MEMBER,
            SALES_DOCUMENT,
            SALES_TASK,
            SALES_WORKLOAD,
            SALESFORCE_SYNC_ERROR,
            SCHEDULING_PAGE,
            SCHEMAS_BACKEND_TEST,
            SCORE_CONFIGURATION,
            SEQUENCE,
            SEQUENCE_ENROLLMENT,
            SEQUENCE_STEP,
            SEQUENCE_STEP_ENROLLMENT,
            SERVICE,
            SITE_PAGE,
            SNIPPET,
            SOCIAL_BROADCAST,
            SOCIAL_CHANNEL,
            SOCIAL_POST,
            SOCIAL_PROFILE,
            SOX_PROTECTED_DUMMY_TYPE,
            SOX_PROTECTED_TEST_TYPE,
            SUBMISSION_TAG,
            SUBSCRIPTION,
            TASK,
            TASK_TEMPLATE,
            TAX,
            TEMPLATE,
            TICKET,
            UNKNOWN,
            UNSUBSCRIBE,
            USER,
            VIEW,
            VIEW_BLOCK,
            WEB_INTERACTIVE,
            /**
             * An enum member indicating that [FromObjectType] was instantiated with an unknown
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
                ABANDONED_CART -> Value.ABANDONED_CART
                ACCEPTANCE_TEST -> Value.ACCEPTANCE_TEST
                AD -> Value.AD
                AD_ACCOUNT -> Value.AD_ACCOUNT
                AD_CAMPAIGN -> Value.AD_CAMPAIGN
                AD_GROUP -> Value.AD_GROUP
                AI_FORECAST -> Value.AI_FORECAST
                ALL_PAGES -> Value.ALL_PAGES
                APPROVAL -> Value.APPROVAL
                APPROVAL_STEP -> Value.APPROVAL_STEP
                ATTRIBUTION -> Value.ATTRIBUTION
                AUDIENCE -> Value.AUDIENCE
                AUTOMATION_JOURNEY -> Value.AUTOMATION_JOURNEY
                AUTOMATION_PLATFORM_FLOW -> Value.AUTOMATION_PLATFORM_FLOW
                AUTOMATION_PLATFORM_FLOW_ACTION -> Value.AUTOMATION_PLATFORM_FLOW_ACTION
                BET_ALERT -> Value.BET_ALERT
                BET_DELIVERABLE_SERVICE -> Value.BET_DELIVERABLE_SERVICE
                BLOG_LISTING_PAGE -> Value.BLOG_LISTING_PAGE
                BLOG_POST -> Value.BLOG_POST
                CALL -> Value.CALL
                CAMPAIGN -> Value.CAMPAIGN
                CAMPAIGN_BUDGET_ITEM -> Value.CAMPAIGN_BUDGET_ITEM
                CAMPAIGN_SPEND_ITEM -> Value.CAMPAIGN_SPEND_ITEM
                CAMPAIGN_STEP -> Value.CAMPAIGN_STEP
                CAMPAIGN_TEMPLATE -> Value.CAMPAIGN_TEMPLATE
                CAMPAIGN_TEMPLATE_STEP -> Value.CAMPAIGN_TEMPLATE_STEP
                CART -> Value.CART
                CASE_STUDY -> Value.CASE_STUDY
                CHATFLOW -> Value.CHATFLOW
                CLIP -> Value.CLIP
                CMS_URL -> Value.CMS_URL
                COMBO_EVENT_CONFIGURATION -> Value.COMBO_EVENT_CONFIGURATION
                COMMERCE_PAYMENT -> Value.COMMERCE_PAYMENT
                COMMUNICATION -> Value.COMMUNICATION
                COMPANY -> Value.COMPANY
                CONTACT -> Value.CONTACT
                CONTACT_CREATE_ATTRIBUTION -> Value.CONTACT_CREATE_ATTRIBUTION
                CONTENT -> Value.CONTENT
                CONTENT_AUDIT -> Value.CONTENT_AUDIT
                CONTENT_AUDIT_PAGE -> Value.CONTENT_AUDIT_PAGE
                CONVERSATION -> Value.CONVERSATION
                CONVERSATION_INBOX -> Value.CONVERSATION_INBOX
                CONVERSATION_SESSION -> Value.CONVERSATION_SESSION
                CRM_OBJECTS_DUMMY_TYPE -> Value.CRM_OBJECTS_DUMMY_TYPE
                CRM_PIPELINES_DUMMY_TYPE -> Value.CRM_PIPELINES_DUMMY_TYPE
                CTA -> Value.CTA
                CTA_VARIANT -> Value.CTA_VARIANT
                DATA_PRIVACY_CONSENT -> Value.DATA_PRIVACY_CONSENT
                DATA_SYNC_STATE -> Value.DATA_SYNC_STATE
                DEAL -> Value.DEAL
                DEAL_CREATE_ATTRIBUTION -> Value.DEAL_CREATE_ATTRIBUTION
                DEAL_REGISTRATION -> Value.DEAL_REGISTRATION
                DEAL_SPLIT -> Value.DEAL_SPLIT
                DISCOUNT -> Value.DISCOUNT
                DISCOUNT_CODE -> Value.DISCOUNT_CODE
                DISCOUNT_TEMPLATE -> Value.DISCOUNT_TEMPLATE
                EMAIL -> Value.EMAIL
                ENGAGEMENT -> Value.ENGAGEMENT
                EXPORT -> Value.EXPORT
                EXTERNAL_WEB_URL -> Value.EXTERNAL_WEB_URL
                FEE -> Value.FEE
                FEEDBACK_SUBMISSION -> Value.FEEDBACK_SUBMISSION
                FEEDBACK_SURVEY -> Value.FEEDBACK_SURVEY
                FILE_MANAGER_FILE -> Value.FILE_MANAGER_FILE
                FILE_MANAGER_FOLDER -> Value.FILE_MANAGER_FOLDER
                FOLDER -> Value.FOLDER
                FORECAST -> Value.FORECAST
                FORM -> Value.FORM
                FORM_SUBMISSION_INBOUNDDB -> Value.FORM_SUBMISSION_INBOUNDDB
                GOAL_TARGET -> Value.GOAL_TARGET
                GOAL_TARGET_GROUP -> Value.GOAL_TARGET_GROUP
                GOAL_TEMPLATE -> Value.GOAL_TEMPLATE
                GSC_PROPERTY -> Value.GSC_PROPERTY
                HUB -> Value.HUB
                IMPORT -> Value.IMPORT
                INVOICE -> Value.INVOICE
                KEYWORD -> Value.KEYWORD
                KNOWLEDGE_ARTICLE -> Value.KNOWLEDGE_ARTICLE
                LANDING_PAGE -> Value.LANDING_PAGE
                LEAD -> Value.LEAD
                LINE_ITEM -> Value.LINE_ITEM
                MARKETING_CALENDAR -> Value.MARKETING_CALENDAR
                MARKETING_CAMPAIGN_UTM -> Value.MARKETING_CAMPAIGN_UTM
                MARKETING_EMAIL -> Value.MARKETING_EMAIL
                MARKETING_EVENT -> Value.MARKETING_EVENT
                MARKETING_EVENT_ATTENDANCE -> Value.MARKETING_EVENT_ATTENDANCE
                MARKETING_SMS -> Value.MARKETING_SMS
                MEDIA_BRIDGE -> Value.MEDIA_BRIDGE
                MEETING_EVENT -> Value.MEETING_EVENT
                MIC -> Value.MIC
                NOTE -> Value.NOTE
                OBJECT_LIST -> Value.OBJECT_LIST
                ORDER -> Value.ORDER
                OWNER -> Value.OWNER
                PARTNER_ACCOUNT -> Value.PARTNER_ACCOUNT
                PARTNER_CLIENT -> Value.PARTNER_CLIENT
                PARTNER_CLIENT_REVENUE -> Value.PARTNER_CLIENT_REVENUE
                PARTNER_SERVICE -> Value.PARTNER_SERVICE
                PAYMENT_LINK -> Value.PAYMENT_LINK
                PAYMENT_SCHEDULE -> Value.PAYMENT_SCHEDULE
                PAYMENT_SCHEDULE_INSTALLMENT -> Value.PAYMENT_SCHEDULE_INSTALLMENT
                PERMISSIONS_TESTING -> Value.PERMISSIONS_TESTING
                PLAYBOOK -> Value.PLAYBOOK
                PLAYBOOK_QUESTION -> Value.PLAYBOOK_QUESTION
                PLAYBOOK_SUBMISSION -> Value.PLAYBOOK_SUBMISSION
                PLAYBOOK_SUBMISSION_ANSWER -> Value.PLAYBOOK_SUBMISSION_ANSWER
                PLAYLIST -> Value.PLAYLIST
                PLAYLIST_FOLDER -> Value.PLAYLIST_FOLDER
                PODCAST_EPISODE -> Value.PODCAST_EPISODE
                PORTAL -> Value.PORTAL
                PORTAL_OBJECT_SYNC_MESSAGE -> Value.PORTAL_OBJECT_SYNC_MESSAGE
                POSTAL_MAIL -> Value.POSTAL_MAIL
                PRIVACY_SCANNER_COOKIE -> Value.PRIVACY_SCANNER_COOKIE
                PRODUCT -> Value.PRODUCT
                PRODUCT_OR_FOLDER -> Value.PRODUCT_OR_FOLDER
                PROPERTY_INFO -> Value.PROPERTY_INFO
                PROSPECTING_AGENT_CONTACT_ASSIGNMENT -> Value.PROSPECTING_AGENT_CONTACT_ASSIGNMENT
                PUBLISHING_TASK -> Value.PUBLISHING_TASK
                QUARANTINED_SUBMISSION -> Value.QUARANTINED_SUBMISSION
                QUOTA -> Value.QUOTA
                QUOTE -> Value.QUOTE
                QUOTE_FIELD -> Value.QUOTE_FIELD
                QUOTE_MODULE -> Value.QUOTE_MODULE
                QUOTE_MODULE_FIELD -> Value.QUOTE_MODULE_FIELD
                QUOTE_TEMPLATE -> Value.QUOTE_TEMPLATE
                RESTORABLE_CRM_OBJECT -> Value.RESTORABLE_CRM_OBJECT
                ROSTER -> Value.ROSTER
                ROSTER_MEMBER -> Value.ROSTER_MEMBER
                SALES_DOCUMENT -> Value.SALES_DOCUMENT
                SALES_TASK -> Value.SALES_TASK
                SALES_WORKLOAD -> Value.SALES_WORKLOAD
                SALESFORCE_SYNC_ERROR -> Value.SALESFORCE_SYNC_ERROR
                SCHEDULING_PAGE -> Value.SCHEDULING_PAGE
                SCHEMAS_BACKEND_TEST -> Value.SCHEMAS_BACKEND_TEST
                SCORE_CONFIGURATION -> Value.SCORE_CONFIGURATION
                SEQUENCE -> Value.SEQUENCE
                SEQUENCE_ENROLLMENT -> Value.SEQUENCE_ENROLLMENT
                SEQUENCE_STEP -> Value.SEQUENCE_STEP
                SEQUENCE_STEP_ENROLLMENT -> Value.SEQUENCE_STEP_ENROLLMENT
                SERVICE -> Value.SERVICE
                SITE_PAGE -> Value.SITE_PAGE
                SNIPPET -> Value.SNIPPET
                SOCIAL_BROADCAST -> Value.SOCIAL_BROADCAST
                SOCIAL_CHANNEL -> Value.SOCIAL_CHANNEL
                SOCIAL_POST -> Value.SOCIAL_POST
                SOCIAL_PROFILE -> Value.SOCIAL_PROFILE
                SOX_PROTECTED_DUMMY_TYPE -> Value.SOX_PROTECTED_DUMMY_TYPE
                SOX_PROTECTED_TEST_TYPE -> Value.SOX_PROTECTED_TEST_TYPE
                SUBMISSION_TAG -> Value.SUBMISSION_TAG
                SUBSCRIPTION -> Value.SUBSCRIPTION
                TASK -> Value.TASK
                TASK_TEMPLATE -> Value.TASK_TEMPLATE
                TAX -> Value.TAX
                TEMPLATE -> Value.TEMPLATE
                TICKET -> Value.TICKET
                UNKNOWN -> Value.UNKNOWN
                UNSUBSCRIBE -> Value.UNSUBSCRIBE
                USER -> Value.USER
                VIEW -> Value.VIEW
                VIEW_BLOCK -> Value.VIEW_BLOCK
                WEB_INTERACTIVE -> Value.WEB_INTERACTIVE
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
                ABANDONED_CART -> Known.ABANDONED_CART
                ACCEPTANCE_TEST -> Known.ACCEPTANCE_TEST
                AD -> Known.AD
                AD_ACCOUNT -> Known.AD_ACCOUNT
                AD_CAMPAIGN -> Known.AD_CAMPAIGN
                AD_GROUP -> Known.AD_GROUP
                AI_FORECAST -> Known.AI_FORECAST
                ALL_PAGES -> Known.ALL_PAGES
                APPROVAL -> Known.APPROVAL
                APPROVAL_STEP -> Known.APPROVAL_STEP
                ATTRIBUTION -> Known.ATTRIBUTION
                AUDIENCE -> Known.AUDIENCE
                AUTOMATION_JOURNEY -> Known.AUTOMATION_JOURNEY
                AUTOMATION_PLATFORM_FLOW -> Known.AUTOMATION_PLATFORM_FLOW
                AUTOMATION_PLATFORM_FLOW_ACTION -> Known.AUTOMATION_PLATFORM_FLOW_ACTION
                BET_ALERT -> Known.BET_ALERT
                BET_DELIVERABLE_SERVICE -> Known.BET_DELIVERABLE_SERVICE
                BLOG_LISTING_PAGE -> Known.BLOG_LISTING_PAGE
                BLOG_POST -> Known.BLOG_POST
                CALL -> Known.CALL
                CAMPAIGN -> Known.CAMPAIGN
                CAMPAIGN_BUDGET_ITEM -> Known.CAMPAIGN_BUDGET_ITEM
                CAMPAIGN_SPEND_ITEM -> Known.CAMPAIGN_SPEND_ITEM
                CAMPAIGN_STEP -> Known.CAMPAIGN_STEP
                CAMPAIGN_TEMPLATE -> Known.CAMPAIGN_TEMPLATE
                CAMPAIGN_TEMPLATE_STEP -> Known.CAMPAIGN_TEMPLATE_STEP
                CART -> Known.CART
                CASE_STUDY -> Known.CASE_STUDY
                CHATFLOW -> Known.CHATFLOW
                CLIP -> Known.CLIP
                CMS_URL -> Known.CMS_URL
                COMBO_EVENT_CONFIGURATION -> Known.COMBO_EVENT_CONFIGURATION
                COMMERCE_PAYMENT -> Known.COMMERCE_PAYMENT
                COMMUNICATION -> Known.COMMUNICATION
                COMPANY -> Known.COMPANY
                CONTACT -> Known.CONTACT
                CONTACT_CREATE_ATTRIBUTION -> Known.CONTACT_CREATE_ATTRIBUTION
                CONTENT -> Known.CONTENT
                CONTENT_AUDIT -> Known.CONTENT_AUDIT
                CONTENT_AUDIT_PAGE -> Known.CONTENT_AUDIT_PAGE
                CONVERSATION -> Known.CONVERSATION
                CONVERSATION_INBOX -> Known.CONVERSATION_INBOX
                CONVERSATION_SESSION -> Known.CONVERSATION_SESSION
                CRM_OBJECTS_DUMMY_TYPE -> Known.CRM_OBJECTS_DUMMY_TYPE
                CRM_PIPELINES_DUMMY_TYPE -> Known.CRM_PIPELINES_DUMMY_TYPE
                CTA -> Known.CTA
                CTA_VARIANT -> Known.CTA_VARIANT
                DATA_PRIVACY_CONSENT -> Known.DATA_PRIVACY_CONSENT
                DATA_SYNC_STATE -> Known.DATA_SYNC_STATE
                DEAL -> Known.DEAL
                DEAL_CREATE_ATTRIBUTION -> Known.DEAL_CREATE_ATTRIBUTION
                DEAL_REGISTRATION -> Known.DEAL_REGISTRATION
                DEAL_SPLIT -> Known.DEAL_SPLIT
                DISCOUNT -> Known.DISCOUNT
                DISCOUNT_CODE -> Known.DISCOUNT_CODE
                DISCOUNT_TEMPLATE -> Known.DISCOUNT_TEMPLATE
                EMAIL -> Known.EMAIL
                ENGAGEMENT -> Known.ENGAGEMENT
                EXPORT -> Known.EXPORT
                EXTERNAL_WEB_URL -> Known.EXTERNAL_WEB_URL
                FEE -> Known.FEE
                FEEDBACK_SUBMISSION -> Known.FEEDBACK_SUBMISSION
                FEEDBACK_SURVEY -> Known.FEEDBACK_SURVEY
                FILE_MANAGER_FILE -> Known.FILE_MANAGER_FILE
                FILE_MANAGER_FOLDER -> Known.FILE_MANAGER_FOLDER
                FOLDER -> Known.FOLDER
                FORECAST -> Known.FORECAST
                FORM -> Known.FORM
                FORM_SUBMISSION_INBOUNDDB -> Known.FORM_SUBMISSION_INBOUNDDB
                GOAL_TARGET -> Known.GOAL_TARGET
                GOAL_TARGET_GROUP -> Known.GOAL_TARGET_GROUP
                GOAL_TEMPLATE -> Known.GOAL_TEMPLATE
                GSC_PROPERTY -> Known.GSC_PROPERTY
                HUB -> Known.HUB
                IMPORT -> Known.IMPORT
                INVOICE -> Known.INVOICE
                KEYWORD -> Known.KEYWORD
                KNOWLEDGE_ARTICLE -> Known.KNOWLEDGE_ARTICLE
                LANDING_PAGE -> Known.LANDING_PAGE
                LEAD -> Known.LEAD
                LINE_ITEM -> Known.LINE_ITEM
                MARKETING_CALENDAR -> Known.MARKETING_CALENDAR
                MARKETING_CAMPAIGN_UTM -> Known.MARKETING_CAMPAIGN_UTM
                MARKETING_EMAIL -> Known.MARKETING_EMAIL
                MARKETING_EVENT -> Known.MARKETING_EVENT
                MARKETING_EVENT_ATTENDANCE -> Known.MARKETING_EVENT_ATTENDANCE
                MARKETING_SMS -> Known.MARKETING_SMS
                MEDIA_BRIDGE -> Known.MEDIA_BRIDGE
                MEETING_EVENT -> Known.MEETING_EVENT
                MIC -> Known.MIC
                NOTE -> Known.NOTE
                OBJECT_LIST -> Known.OBJECT_LIST
                ORDER -> Known.ORDER
                OWNER -> Known.OWNER
                PARTNER_ACCOUNT -> Known.PARTNER_ACCOUNT
                PARTNER_CLIENT -> Known.PARTNER_CLIENT
                PARTNER_CLIENT_REVENUE -> Known.PARTNER_CLIENT_REVENUE
                PARTNER_SERVICE -> Known.PARTNER_SERVICE
                PAYMENT_LINK -> Known.PAYMENT_LINK
                PAYMENT_SCHEDULE -> Known.PAYMENT_SCHEDULE
                PAYMENT_SCHEDULE_INSTALLMENT -> Known.PAYMENT_SCHEDULE_INSTALLMENT
                PERMISSIONS_TESTING -> Known.PERMISSIONS_TESTING
                PLAYBOOK -> Known.PLAYBOOK
                PLAYBOOK_QUESTION -> Known.PLAYBOOK_QUESTION
                PLAYBOOK_SUBMISSION -> Known.PLAYBOOK_SUBMISSION
                PLAYBOOK_SUBMISSION_ANSWER -> Known.PLAYBOOK_SUBMISSION_ANSWER
                PLAYLIST -> Known.PLAYLIST
                PLAYLIST_FOLDER -> Known.PLAYLIST_FOLDER
                PODCAST_EPISODE -> Known.PODCAST_EPISODE
                PORTAL -> Known.PORTAL
                PORTAL_OBJECT_SYNC_MESSAGE -> Known.PORTAL_OBJECT_SYNC_MESSAGE
                POSTAL_MAIL -> Known.POSTAL_MAIL
                PRIVACY_SCANNER_COOKIE -> Known.PRIVACY_SCANNER_COOKIE
                PRODUCT -> Known.PRODUCT
                PRODUCT_OR_FOLDER -> Known.PRODUCT_OR_FOLDER
                PROPERTY_INFO -> Known.PROPERTY_INFO
                PROSPECTING_AGENT_CONTACT_ASSIGNMENT -> Known.PROSPECTING_AGENT_CONTACT_ASSIGNMENT
                PUBLISHING_TASK -> Known.PUBLISHING_TASK
                QUARANTINED_SUBMISSION -> Known.QUARANTINED_SUBMISSION
                QUOTA -> Known.QUOTA
                QUOTE -> Known.QUOTE
                QUOTE_FIELD -> Known.QUOTE_FIELD
                QUOTE_MODULE -> Known.QUOTE_MODULE
                QUOTE_MODULE_FIELD -> Known.QUOTE_MODULE_FIELD
                QUOTE_TEMPLATE -> Known.QUOTE_TEMPLATE
                RESTORABLE_CRM_OBJECT -> Known.RESTORABLE_CRM_OBJECT
                ROSTER -> Known.ROSTER
                ROSTER_MEMBER -> Known.ROSTER_MEMBER
                SALES_DOCUMENT -> Known.SALES_DOCUMENT
                SALES_TASK -> Known.SALES_TASK
                SALES_WORKLOAD -> Known.SALES_WORKLOAD
                SALESFORCE_SYNC_ERROR -> Known.SALESFORCE_SYNC_ERROR
                SCHEDULING_PAGE -> Known.SCHEDULING_PAGE
                SCHEMAS_BACKEND_TEST -> Known.SCHEMAS_BACKEND_TEST
                SCORE_CONFIGURATION -> Known.SCORE_CONFIGURATION
                SEQUENCE -> Known.SEQUENCE
                SEQUENCE_ENROLLMENT -> Known.SEQUENCE_ENROLLMENT
                SEQUENCE_STEP -> Known.SEQUENCE_STEP
                SEQUENCE_STEP_ENROLLMENT -> Known.SEQUENCE_STEP_ENROLLMENT
                SERVICE -> Known.SERVICE
                SITE_PAGE -> Known.SITE_PAGE
                SNIPPET -> Known.SNIPPET
                SOCIAL_BROADCAST -> Known.SOCIAL_BROADCAST
                SOCIAL_CHANNEL -> Known.SOCIAL_CHANNEL
                SOCIAL_POST -> Known.SOCIAL_POST
                SOCIAL_PROFILE -> Known.SOCIAL_PROFILE
                SOX_PROTECTED_DUMMY_TYPE -> Known.SOX_PROTECTED_DUMMY_TYPE
                SOX_PROTECTED_TEST_TYPE -> Known.SOX_PROTECTED_TEST_TYPE
                SUBMISSION_TAG -> Known.SUBMISSION_TAG
                SUBSCRIPTION -> Known.SUBSCRIPTION
                TASK -> Known.TASK
                TASK_TEMPLATE -> Known.TASK_TEMPLATE
                TAX -> Known.TAX
                TEMPLATE -> Known.TEMPLATE
                TICKET -> Known.TICKET
                UNKNOWN -> Known.UNKNOWN
                UNSUBSCRIBE -> Known.UNSUBSCRIBE
                USER -> Known.USER
                VIEW -> Known.VIEW
                VIEW_BLOCK -> Known.VIEW_BLOCK
                WEB_INTERACTIVE -> Known.WEB_INTERACTIVE
                else -> throw HubSpotInvalidDataException("Unknown FromObjectType: $value")
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

            return other is FromObjectType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class HiddenReason @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val DEFAULT = of("DEFAULT")

            @JvmField val INTERNAL = of("INTERNAL")

            @JvmField val USER_CONFIGURED = of("USER_CONFIGURED")

            @JvmStatic fun of(value: String) = HiddenReason(JsonField.of(value))
        }

        /** An enum containing [HiddenReason]'s known values. */
        enum class Known {
            DEFAULT,
            INTERNAL,
            USER_CONFIGURED,
        }

        /**
         * An enum containing [HiddenReason]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [HiddenReason] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DEFAULT,
            INTERNAL,
            USER_CONFIGURED,
            /**
             * An enum member indicating that [HiddenReason] was instantiated with an unknown value.
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
                DEFAULT -> Value.DEFAULT
                INTERNAL -> Value.INTERNAL
                USER_CONFIGURED -> Value.USER_CONFIGURED
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
                DEFAULT -> Known.DEFAULT
                INTERNAL -> Known.INTERNAL
                USER_CONFIGURED -> Known.USER_CONFIGURED
                else -> throw HubSpotInvalidDataException("Unknown HiddenReason: $value")
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

        fun validate(): HiddenReason = apply {
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

            return other is HiddenReason && value == other.value
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
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ABANDONED_CART = of("ABANDONED_CART")

            @JvmField val ACCEPTANCE_TEST = of("ACCEPTANCE_TEST")

            @JvmField val AD = of("AD")

            @JvmField val AD_ACCOUNT = of("AD_ACCOUNT")

            @JvmField val AD_CAMPAIGN = of("AD_CAMPAIGN")

            @JvmField val AD_GROUP = of("AD_GROUP")

            @JvmField val AI_FORECAST = of("AI_FORECAST")

            @JvmField val ALL_PAGES = of("ALL_PAGES")

            @JvmField val APPROVAL = of("APPROVAL")

            @JvmField val APPROVAL_STEP = of("APPROVAL_STEP")

            @JvmField val ATTRIBUTION = of("ATTRIBUTION")

            @JvmField val AUDIENCE = of("AUDIENCE")

            @JvmField val AUTOMATION_JOURNEY = of("AUTOMATION_JOURNEY")

            @JvmField val AUTOMATION_PLATFORM_FLOW = of("AUTOMATION_PLATFORM_FLOW")

            @JvmField val AUTOMATION_PLATFORM_FLOW_ACTION = of("AUTOMATION_PLATFORM_FLOW_ACTION")

            @JvmField val BET_ALERT = of("BET_ALERT")

            @JvmField val BET_DELIVERABLE_SERVICE = of("BET_DELIVERABLE_SERVICE")

            @JvmField val BLOG_LISTING_PAGE = of("BLOG_LISTING_PAGE")

            @JvmField val BLOG_POST = of("BLOG_POST")

            @JvmField val CALL = of("CALL")

            @JvmField val CAMPAIGN = of("CAMPAIGN")

            @JvmField val CAMPAIGN_BUDGET_ITEM = of("CAMPAIGN_BUDGET_ITEM")

            @JvmField val CAMPAIGN_SPEND_ITEM = of("CAMPAIGN_SPEND_ITEM")

            @JvmField val CAMPAIGN_STEP = of("CAMPAIGN_STEP")

            @JvmField val CAMPAIGN_TEMPLATE = of("CAMPAIGN_TEMPLATE")

            @JvmField val CAMPAIGN_TEMPLATE_STEP = of("CAMPAIGN_TEMPLATE_STEP")

            @JvmField val CART = of("CART")

            @JvmField val CASE_STUDY = of("CASE_STUDY")

            @JvmField val CHATFLOW = of("CHATFLOW")

            @JvmField val CLIP = of("CLIP")

            @JvmField val CMS_URL = of("CMS_URL")

            @JvmField val COMBO_EVENT_CONFIGURATION = of("COMBO_EVENT_CONFIGURATION")

            @JvmField val COMMERCE_PAYMENT = of("COMMERCE_PAYMENT")

            @JvmField val COMMUNICATION = of("COMMUNICATION")

            @JvmField val COMPANY = of("COMPANY")

            @JvmField val CONTACT = of("CONTACT")

            @JvmField val CONTACT_CREATE_ATTRIBUTION = of("CONTACT_CREATE_ATTRIBUTION")

            @JvmField val CONTENT = of("CONTENT")

            @JvmField val CONTENT_AUDIT = of("CONTENT_AUDIT")

            @JvmField val CONTENT_AUDIT_PAGE = of("CONTENT_AUDIT_PAGE")

            @JvmField val CONVERSATION = of("CONVERSATION")

            @JvmField val CONVERSATION_INBOX = of("CONVERSATION_INBOX")

            @JvmField val CONVERSATION_SESSION = of("CONVERSATION_SESSION")

            @JvmField val CRM_OBJECTS_DUMMY_TYPE = of("CRM_OBJECTS_DUMMY_TYPE")

            @JvmField val CRM_PIPELINES_DUMMY_TYPE = of("CRM_PIPELINES_DUMMY_TYPE")

            @JvmField val CTA = of("CTA")

            @JvmField val CTA_VARIANT = of("CTA_VARIANT")

            @JvmField val DATA_PRIVACY_CONSENT = of("DATA_PRIVACY_CONSENT")

            @JvmField val DATA_SYNC_STATE = of("DATA_SYNC_STATE")

            @JvmField val DEAL = of("DEAL")

            @JvmField val DEAL_CREATE_ATTRIBUTION = of("DEAL_CREATE_ATTRIBUTION")

            @JvmField val DEAL_REGISTRATION = of("DEAL_REGISTRATION")

            @JvmField val DEAL_SPLIT = of("DEAL_SPLIT")

            @JvmField val DISCOUNT = of("DISCOUNT")

            @JvmField val DISCOUNT_CODE = of("DISCOUNT_CODE")

            @JvmField val DISCOUNT_TEMPLATE = of("DISCOUNT_TEMPLATE")

            @JvmField val EMAIL = of("EMAIL")

            @JvmField val ENGAGEMENT = of("ENGAGEMENT")

            @JvmField val EXPORT = of("EXPORT")

            @JvmField val EXTERNAL_WEB_URL = of("EXTERNAL_WEB_URL")

            @JvmField val FEE = of("FEE")

            @JvmField val FEEDBACK_SUBMISSION = of("FEEDBACK_SUBMISSION")

            @JvmField val FEEDBACK_SURVEY = of("FEEDBACK_SURVEY")

            @JvmField val FILE_MANAGER_FILE = of("FILE_MANAGER_FILE")

            @JvmField val FILE_MANAGER_FOLDER = of("FILE_MANAGER_FOLDER")

            @JvmField val FOLDER = of("FOLDER")

            @JvmField val FORECAST = of("FORECAST")

            @JvmField val FORM = of("FORM")

            @JvmField val FORM_SUBMISSION_INBOUNDDB = of("FORM_SUBMISSION_INBOUNDDB")

            @JvmField val GOAL_TARGET = of("GOAL_TARGET")

            @JvmField val GOAL_TARGET_GROUP = of("GOAL_TARGET_GROUP")

            @JvmField val GOAL_TEMPLATE = of("GOAL_TEMPLATE")

            @JvmField val GSC_PROPERTY = of("GSC_PROPERTY")

            @JvmField val HUB = of("HUB")

            @JvmField val IMPORT = of("IMPORT")

            @JvmField val INVOICE = of("INVOICE")

            @JvmField val KEYWORD = of("KEYWORD")

            @JvmField val KNOWLEDGE_ARTICLE = of("KNOWLEDGE_ARTICLE")

            @JvmField val LANDING_PAGE = of("LANDING_PAGE")

            @JvmField val LEAD = of("LEAD")

            @JvmField val LINE_ITEM = of("LINE_ITEM")

            @JvmField val MARKETING_CALENDAR = of("MARKETING_CALENDAR")

            @JvmField val MARKETING_CAMPAIGN_UTM = of("MARKETING_CAMPAIGN_UTM")

            @JvmField val MARKETING_EMAIL = of("MARKETING_EMAIL")

            @JvmField val MARKETING_EVENT = of("MARKETING_EVENT")

            @JvmField val MARKETING_EVENT_ATTENDANCE = of("MARKETING_EVENT_ATTENDANCE")

            @JvmField val MARKETING_SMS = of("MARKETING_SMS")

            @JvmField val MEDIA_BRIDGE = of("MEDIA_BRIDGE")

            @JvmField val MEETING_EVENT = of("MEETING_EVENT")

            @JvmField val MIC = of("MIC")

            @JvmField val NOTE = of("NOTE")

            @JvmField val OBJECT_LIST = of("OBJECT_LIST")

            @JvmField val ORDER = of("ORDER")

            @JvmField val OWNER = of("OWNER")

            @JvmField val PARTNER_ACCOUNT = of("PARTNER_ACCOUNT")

            @JvmField val PARTNER_CLIENT = of("PARTNER_CLIENT")

            @JvmField val PARTNER_CLIENT_REVENUE = of("PARTNER_CLIENT_REVENUE")

            @JvmField val PARTNER_SERVICE = of("PARTNER_SERVICE")

            @JvmField val PAYMENT_LINK = of("PAYMENT_LINK")

            @JvmField val PAYMENT_SCHEDULE = of("PAYMENT_SCHEDULE")

            @JvmField val PAYMENT_SCHEDULE_INSTALLMENT = of("PAYMENT_SCHEDULE_INSTALLMENT")

            @JvmField val PERMISSIONS_TESTING = of("PERMISSIONS_TESTING")

            @JvmField val PLAYBOOK = of("PLAYBOOK")

            @JvmField val PLAYBOOK_QUESTION = of("PLAYBOOK_QUESTION")

            @JvmField val PLAYBOOK_SUBMISSION = of("PLAYBOOK_SUBMISSION")

            @JvmField val PLAYBOOK_SUBMISSION_ANSWER = of("PLAYBOOK_SUBMISSION_ANSWER")

            @JvmField val PLAYLIST = of("PLAYLIST")

            @JvmField val PLAYLIST_FOLDER = of("PLAYLIST_FOLDER")

            @JvmField val PODCAST_EPISODE = of("PODCAST_EPISODE")

            @JvmField val PORTAL = of("PORTAL")

            @JvmField val PORTAL_OBJECT_SYNC_MESSAGE = of("PORTAL_OBJECT_SYNC_MESSAGE")

            @JvmField val POSTAL_MAIL = of("POSTAL_MAIL")

            @JvmField val PRIVACY_SCANNER_COOKIE = of("PRIVACY_SCANNER_COOKIE")

            @JvmField val PRODUCT = of("PRODUCT")

            @JvmField val PRODUCT_OR_FOLDER = of("PRODUCT_OR_FOLDER")

            @JvmField val PROPERTY_INFO = of("PROPERTY_INFO")

            @JvmField
            val PROSPECTING_AGENT_CONTACT_ASSIGNMENT = of("PROSPECTING_AGENT_CONTACT_ASSIGNMENT")

            @JvmField val PUBLISHING_TASK = of("PUBLISHING_TASK")

            @JvmField val QUARANTINED_SUBMISSION = of("QUARANTINED_SUBMISSION")

            @JvmField val QUOTA = of("QUOTA")

            @JvmField val QUOTE = of("QUOTE")

            @JvmField val QUOTE_FIELD = of("QUOTE_FIELD")

            @JvmField val QUOTE_MODULE = of("QUOTE_MODULE")

            @JvmField val QUOTE_MODULE_FIELD = of("QUOTE_MODULE_FIELD")

            @JvmField val QUOTE_TEMPLATE = of("QUOTE_TEMPLATE")

            @JvmField val RESTORABLE_CRM_OBJECT = of("RESTORABLE_CRM_OBJECT")

            @JvmField val ROSTER = of("ROSTER")

            @JvmField val ROSTER_MEMBER = of("ROSTER_MEMBER")

            @JvmField val SALES_DOCUMENT = of("SALES_DOCUMENT")

            @JvmField val SALES_TASK = of("SALES_TASK")

            @JvmField val SALES_WORKLOAD = of("SALES_WORKLOAD")

            @JvmField val SALESFORCE_SYNC_ERROR = of("SALESFORCE_SYNC_ERROR")

            @JvmField val SCHEDULING_PAGE = of("SCHEDULING_PAGE")

            @JvmField val SCHEMAS_BACKEND_TEST = of("SCHEMAS_BACKEND_TEST")

            @JvmField val SCORE_CONFIGURATION = of("SCORE_CONFIGURATION")

            @JvmField val SEQUENCE = of("SEQUENCE")

            @JvmField val SEQUENCE_ENROLLMENT = of("SEQUENCE_ENROLLMENT")

            @JvmField val SEQUENCE_STEP = of("SEQUENCE_STEP")

            @JvmField val SEQUENCE_STEP_ENROLLMENT = of("SEQUENCE_STEP_ENROLLMENT")

            @JvmField val SERVICE = of("SERVICE")

            @JvmField val SITE_PAGE = of("SITE_PAGE")

            @JvmField val SNIPPET = of("SNIPPET")

            @JvmField val SOCIAL_BROADCAST = of("SOCIAL_BROADCAST")

            @JvmField val SOCIAL_CHANNEL = of("SOCIAL_CHANNEL")

            @JvmField val SOCIAL_POST = of("SOCIAL_POST")

            @JvmField val SOCIAL_PROFILE = of("SOCIAL_PROFILE")

            @JvmField val SOX_PROTECTED_DUMMY_TYPE = of("SOX_PROTECTED_DUMMY_TYPE")

            @JvmField val SOX_PROTECTED_TEST_TYPE = of("SOX_PROTECTED_TEST_TYPE")

            @JvmField val SUBMISSION_TAG = of("SUBMISSION_TAG")

            @JvmField val SUBSCRIPTION = of("SUBSCRIPTION")

            @JvmField val TASK = of("TASK")

            @JvmField val TASK_TEMPLATE = of("TASK_TEMPLATE")

            @JvmField val TAX = of("TAX")

            @JvmField val TEMPLATE = of("TEMPLATE")

            @JvmField val TICKET = of("TICKET")

            @JvmField val UNKNOWN = of("UNKNOWN")

            @JvmField val UNSUBSCRIBE = of("UNSUBSCRIBE")

            @JvmField val USER = of("USER")

            @JvmField val VIEW = of("VIEW")

            @JvmField val VIEW_BLOCK = of("VIEW_BLOCK")

            @JvmField val WEB_INTERACTIVE = of("WEB_INTERACTIVE")

            @JvmStatic fun of(value: String) = ToObjectType(JsonField.of(value))
        }

        /** An enum containing [ToObjectType]'s known values. */
        enum class Known {
            ABANDONED_CART,
            ACCEPTANCE_TEST,
            AD,
            AD_ACCOUNT,
            AD_CAMPAIGN,
            AD_GROUP,
            AI_FORECAST,
            ALL_PAGES,
            APPROVAL,
            APPROVAL_STEP,
            ATTRIBUTION,
            AUDIENCE,
            AUTOMATION_JOURNEY,
            AUTOMATION_PLATFORM_FLOW,
            AUTOMATION_PLATFORM_FLOW_ACTION,
            BET_ALERT,
            BET_DELIVERABLE_SERVICE,
            BLOG_LISTING_PAGE,
            BLOG_POST,
            CALL,
            CAMPAIGN,
            CAMPAIGN_BUDGET_ITEM,
            CAMPAIGN_SPEND_ITEM,
            CAMPAIGN_STEP,
            CAMPAIGN_TEMPLATE,
            CAMPAIGN_TEMPLATE_STEP,
            CART,
            CASE_STUDY,
            CHATFLOW,
            CLIP,
            CMS_URL,
            COMBO_EVENT_CONFIGURATION,
            COMMERCE_PAYMENT,
            COMMUNICATION,
            COMPANY,
            CONTACT,
            CONTACT_CREATE_ATTRIBUTION,
            CONTENT,
            CONTENT_AUDIT,
            CONTENT_AUDIT_PAGE,
            CONVERSATION,
            CONVERSATION_INBOX,
            CONVERSATION_SESSION,
            CRM_OBJECTS_DUMMY_TYPE,
            CRM_PIPELINES_DUMMY_TYPE,
            CTA,
            CTA_VARIANT,
            DATA_PRIVACY_CONSENT,
            DATA_SYNC_STATE,
            DEAL,
            DEAL_CREATE_ATTRIBUTION,
            DEAL_REGISTRATION,
            DEAL_SPLIT,
            DISCOUNT,
            DISCOUNT_CODE,
            DISCOUNT_TEMPLATE,
            EMAIL,
            ENGAGEMENT,
            EXPORT,
            EXTERNAL_WEB_URL,
            FEE,
            FEEDBACK_SUBMISSION,
            FEEDBACK_SURVEY,
            FILE_MANAGER_FILE,
            FILE_MANAGER_FOLDER,
            FOLDER,
            FORECAST,
            FORM,
            FORM_SUBMISSION_INBOUNDDB,
            GOAL_TARGET,
            GOAL_TARGET_GROUP,
            GOAL_TEMPLATE,
            GSC_PROPERTY,
            HUB,
            IMPORT,
            INVOICE,
            KEYWORD,
            KNOWLEDGE_ARTICLE,
            LANDING_PAGE,
            LEAD,
            LINE_ITEM,
            MARKETING_CALENDAR,
            MARKETING_CAMPAIGN_UTM,
            MARKETING_EMAIL,
            MARKETING_EVENT,
            MARKETING_EVENT_ATTENDANCE,
            MARKETING_SMS,
            MEDIA_BRIDGE,
            MEETING_EVENT,
            MIC,
            NOTE,
            OBJECT_LIST,
            ORDER,
            OWNER,
            PARTNER_ACCOUNT,
            PARTNER_CLIENT,
            PARTNER_CLIENT_REVENUE,
            PARTNER_SERVICE,
            PAYMENT_LINK,
            PAYMENT_SCHEDULE,
            PAYMENT_SCHEDULE_INSTALLMENT,
            PERMISSIONS_TESTING,
            PLAYBOOK,
            PLAYBOOK_QUESTION,
            PLAYBOOK_SUBMISSION,
            PLAYBOOK_SUBMISSION_ANSWER,
            PLAYLIST,
            PLAYLIST_FOLDER,
            PODCAST_EPISODE,
            PORTAL,
            PORTAL_OBJECT_SYNC_MESSAGE,
            POSTAL_MAIL,
            PRIVACY_SCANNER_COOKIE,
            PRODUCT,
            PRODUCT_OR_FOLDER,
            PROPERTY_INFO,
            PROSPECTING_AGENT_CONTACT_ASSIGNMENT,
            PUBLISHING_TASK,
            QUARANTINED_SUBMISSION,
            QUOTA,
            QUOTE,
            QUOTE_FIELD,
            QUOTE_MODULE,
            QUOTE_MODULE_FIELD,
            QUOTE_TEMPLATE,
            RESTORABLE_CRM_OBJECT,
            ROSTER,
            ROSTER_MEMBER,
            SALES_DOCUMENT,
            SALES_TASK,
            SALES_WORKLOAD,
            SALESFORCE_SYNC_ERROR,
            SCHEDULING_PAGE,
            SCHEMAS_BACKEND_TEST,
            SCORE_CONFIGURATION,
            SEQUENCE,
            SEQUENCE_ENROLLMENT,
            SEQUENCE_STEP,
            SEQUENCE_STEP_ENROLLMENT,
            SERVICE,
            SITE_PAGE,
            SNIPPET,
            SOCIAL_BROADCAST,
            SOCIAL_CHANNEL,
            SOCIAL_POST,
            SOCIAL_PROFILE,
            SOX_PROTECTED_DUMMY_TYPE,
            SOX_PROTECTED_TEST_TYPE,
            SUBMISSION_TAG,
            SUBSCRIPTION,
            TASK,
            TASK_TEMPLATE,
            TAX,
            TEMPLATE,
            TICKET,
            UNKNOWN,
            UNSUBSCRIBE,
            USER,
            VIEW,
            VIEW_BLOCK,
            WEB_INTERACTIVE,
        }

        /**
         * An enum containing [ToObjectType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ToObjectType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ABANDONED_CART,
            ACCEPTANCE_TEST,
            AD,
            AD_ACCOUNT,
            AD_CAMPAIGN,
            AD_GROUP,
            AI_FORECAST,
            ALL_PAGES,
            APPROVAL,
            APPROVAL_STEP,
            ATTRIBUTION,
            AUDIENCE,
            AUTOMATION_JOURNEY,
            AUTOMATION_PLATFORM_FLOW,
            AUTOMATION_PLATFORM_FLOW_ACTION,
            BET_ALERT,
            BET_DELIVERABLE_SERVICE,
            BLOG_LISTING_PAGE,
            BLOG_POST,
            CALL,
            CAMPAIGN,
            CAMPAIGN_BUDGET_ITEM,
            CAMPAIGN_SPEND_ITEM,
            CAMPAIGN_STEP,
            CAMPAIGN_TEMPLATE,
            CAMPAIGN_TEMPLATE_STEP,
            CART,
            CASE_STUDY,
            CHATFLOW,
            CLIP,
            CMS_URL,
            COMBO_EVENT_CONFIGURATION,
            COMMERCE_PAYMENT,
            COMMUNICATION,
            COMPANY,
            CONTACT,
            CONTACT_CREATE_ATTRIBUTION,
            CONTENT,
            CONTENT_AUDIT,
            CONTENT_AUDIT_PAGE,
            CONVERSATION,
            CONVERSATION_INBOX,
            CONVERSATION_SESSION,
            CRM_OBJECTS_DUMMY_TYPE,
            CRM_PIPELINES_DUMMY_TYPE,
            CTA,
            CTA_VARIANT,
            DATA_PRIVACY_CONSENT,
            DATA_SYNC_STATE,
            DEAL,
            DEAL_CREATE_ATTRIBUTION,
            DEAL_REGISTRATION,
            DEAL_SPLIT,
            DISCOUNT,
            DISCOUNT_CODE,
            DISCOUNT_TEMPLATE,
            EMAIL,
            ENGAGEMENT,
            EXPORT,
            EXTERNAL_WEB_URL,
            FEE,
            FEEDBACK_SUBMISSION,
            FEEDBACK_SURVEY,
            FILE_MANAGER_FILE,
            FILE_MANAGER_FOLDER,
            FOLDER,
            FORECAST,
            FORM,
            FORM_SUBMISSION_INBOUNDDB,
            GOAL_TARGET,
            GOAL_TARGET_GROUP,
            GOAL_TEMPLATE,
            GSC_PROPERTY,
            HUB,
            IMPORT,
            INVOICE,
            KEYWORD,
            KNOWLEDGE_ARTICLE,
            LANDING_PAGE,
            LEAD,
            LINE_ITEM,
            MARKETING_CALENDAR,
            MARKETING_CAMPAIGN_UTM,
            MARKETING_EMAIL,
            MARKETING_EVENT,
            MARKETING_EVENT_ATTENDANCE,
            MARKETING_SMS,
            MEDIA_BRIDGE,
            MEETING_EVENT,
            MIC,
            NOTE,
            OBJECT_LIST,
            ORDER,
            OWNER,
            PARTNER_ACCOUNT,
            PARTNER_CLIENT,
            PARTNER_CLIENT_REVENUE,
            PARTNER_SERVICE,
            PAYMENT_LINK,
            PAYMENT_SCHEDULE,
            PAYMENT_SCHEDULE_INSTALLMENT,
            PERMISSIONS_TESTING,
            PLAYBOOK,
            PLAYBOOK_QUESTION,
            PLAYBOOK_SUBMISSION,
            PLAYBOOK_SUBMISSION_ANSWER,
            PLAYLIST,
            PLAYLIST_FOLDER,
            PODCAST_EPISODE,
            PORTAL,
            PORTAL_OBJECT_SYNC_MESSAGE,
            POSTAL_MAIL,
            PRIVACY_SCANNER_COOKIE,
            PRODUCT,
            PRODUCT_OR_FOLDER,
            PROPERTY_INFO,
            PROSPECTING_AGENT_CONTACT_ASSIGNMENT,
            PUBLISHING_TASK,
            QUARANTINED_SUBMISSION,
            QUOTA,
            QUOTE,
            QUOTE_FIELD,
            QUOTE_MODULE,
            QUOTE_MODULE_FIELD,
            QUOTE_TEMPLATE,
            RESTORABLE_CRM_OBJECT,
            ROSTER,
            ROSTER_MEMBER,
            SALES_DOCUMENT,
            SALES_TASK,
            SALES_WORKLOAD,
            SALESFORCE_SYNC_ERROR,
            SCHEDULING_PAGE,
            SCHEMAS_BACKEND_TEST,
            SCORE_CONFIGURATION,
            SEQUENCE,
            SEQUENCE_ENROLLMENT,
            SEQUENCE_STEP,
            SEQUENCE_STEP_ENROLLMENT,
            SERVICE,
            SITE_PAGE,
            SNIPPET,
            SOCIAL_BROADCAST,
            SOCIAL_CHANNEL,
            SOCIAL_POST,
            SOCIAL_PROFILE,
            SOX_PROTECTED_DUMMY_TYPE,
            SOX_PROTECTED_TEST_TYPE,
            SUBMISSION_TAG,
            SUBSCRIPTION,
            TASK,
            TASK_TEMPLATE,
            TAX,
            TEMPLATE,
            TICKET,
            UNKNOWN,
            UNSUBSCRIBE,
            USER,
            VIEW,
            VIEW_BLOCK,
            WEB_INTERACTIVE,
            /**
             * An enum member indicating that [ToObjectType] was instantiated with an unknown value.
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
                ABANDONED_CART -> Value.ABANDONED_CART
                ACCEPTANCE_TEST -> Value.ACCEPTANCE_TEST
                AD -> Value.AD
                AD_ACCOUNT -> Value.AD_ACCOUNT
                AD_CAMPAIGN -> Value.AD_CAMPAIGN
                AD_GROUP -> Value.AD_GROUP
                AI_FORECAST -> Value.AI_FORECAST
                ALL_PAGES -> Value.ALL_PAGES
                APPROVAL -> Value.APPROVAL
                APPROVAL_STEP -> Value.APPROVAL_STEP
                ATTRIBUTION -> Value.ATTRIBUTION
                AUDIENCE -> Value.AUDIENCE
                AUTOMATION_JOURNEY -> Value.AUTOMATION_JOURNEY
                AUTOMATION_PLATFORM_FLOW -> Value.AUTOMATION_PLATFORM_FLOW
                AUTOMATION_PLATFORM_FLOW_ACTION -> Value.AUTOMATION_PLATFORM_FLOW_ACTION
                BET_ALERT -> Value.BET_ALERT
                BET_DELIVERABLE_SERVICE -> Value.BET_DELIVERABLE_SERVICE
                BLOG_LISTING_PAGE -> Value.BLOG_LISTING_PAGE
                BLOG_POST -> Value.BLOG_POST
                CALL -> Value.CALL
                CAMPAIGN -> Value.CAMPAIGN
                CAMPAIGN_BUDGET_ITEM -> Value.CAMPAIGN_BUDGET_ITEM
                CAMPAIGN_SPEND_ITEM -> Value.CAMPAIGN_SPEND_ITEM
                CAMPAIGN_STEP -> Value.CAMPAIGN_STEP
                CAMPAIGN_TEMPLATE -> Value.CAMPAIGN_TEMPLATE
                CAMPAIGN_TEMPLATE_STEP -> Value.CAMPAIGN_TEMPLATE_STEP
                CART -> Value.CART
                CASE_STUDY -> Value.CASE_STUDY
                CHATFLOW -> Value.CHATFLOW
                CLIP -> Value.CLIP
                CMS_URL -> Value.CMS_URL
                COMBO_EVENT_CONFIGURATION -> Value.COMBO_EVENT_CONFIGURATION
                COMMERCE_PAYMENT -> Value.COMMERCE_PAYMENT
                COMMUNICATION -> Value.COMMUNICATION
                COMPANY -> Value.COMPANY
                CONTACT -> Value.CONTACT
                CONTACT_CREATE_ATTRIBUTION -> Value.CONTACT_CREATE_ATTRIBUTION
                CONTENT -> Value.CONTENT
                CONTENT_AUDIT -> Value.CONTENT_AUDIT
                CONTENT_AUDIT_PAGE -> Value.CONTENT_AUDIT_PAGE
                CONVERSATION -> Value.CONVERSATION
                CONVERSATION_INBOX -> Value.CONVERSATION_INBOX
                CONVERSATION_SESSION -> Value.CONVERSATION_SESSION
                CRM_OBJECTS_DUMMY_TYPE -> Value.CRM_OBJECTS_DUMMY_TYPE
                CRM_PIPELINES_DUMMY_TYPE -> Value.CRM_PIPELINES_DUMMY_TYPE
                CTA -> Value.CTA
                CTA_VARIANT -> Value.CTA_VARIANT
                DATA_PRIVACY_CONSENT -> Value.DATA_PRIVACY_CONSENT
                DATA_SYNC_STATE -> Value.DATA_SYNC_STATE
                DEAL -> Value.DEAL
                DEAL_CREATE_ATTRIBUTION -> Value.DEAL_CREATE_ATTRIBUTION
                DEAL_REGISTRATION -> Value.DEAL_REGISTRATION
                DEAL_SPLIT -> Value.DEAL_SPLIT
                DISCOUNT -> Value.DISCOUNT
                DISCOUNT_CODE -> Value.DISCOUNT_CODE
                DISCOUNT_TEMPLATE -> Value.DISCOUNT_TEMPLATE
                EMAIL -> Value.EMAIL
                ENGAGEMENT -> Value.ENGAGEMENT
                EXPORT -> Value.EXPORT
                EXTERNAL_WEB_URL -> Value.EXTERNAL_WEB_URL
                FEE -> Value.FEE
                FEEDBACK_SUBMISSION -> Value.FEEDBACK_SUBMISSION
                FEEDBACK_SURVEY -> Value.FEEDBACK_SURVEY
                FILE_MANAGER_FILE -> Value.FILE_MANAGER_FILE
                FILE_MANAGER_FOLDER -> Value.FILE_MANAGER_FOLDER
                FOLDER -> Value.FOLDER
                FORECAST -> Value.FORECAST
                FORM -> Value.FORM
                FORM_SUBMISSION_INBOUNDDB -> Value.FORM_SUBMISSION_INBOUNDDB
                GOAL_TARGET -> Value.GOAL_TARGET
                GOAL_TARGET_GROUP -> Value.GOAL_TARGET_GROUP
                GOAL_TEMPLATE -> Value.GOAL_TEMPLATE
                GSC_PROPERTY -> Value.GSC_PROPERTY
                HUB -> Value.HUB
                IMPORT -> Value.IMPORT
                INVOICE -> Value.INVOICE
                KEYWORD -> Value.KEYWORD
                KNOWLEDGE_ARTICLE -> Value.KNOWLEDGE_ARTICLE
                LANDING_PAGE -> Value.LANDING_PAGE
                LEAD -> Value.LEAD
                LINE_ITEM -> Value.LINE_ITEM
                MARKETING_CALENDAR -> Value.MARKETING_CALENDAR
                MARKETING_CAMPAIGN_UTM -> Value.MARKETING_CAMPAIGN_UTM
                MARKETING_EMAIL -> Value.MARKETING_EMAIL
                MARKETING_EVENT -> Value.MARKETING_EVENT
                MARKETING_EVENT_ATTENDANCE -> Value.MARKETING_EVENT_ATTENDANCE
                MARKETING_SMS -> Value.MARKETING_SMS
                MEDIA_BRIDGE -> Value.MEDIA_BRIDGE
                MEETING_EVENT -> Value.MEETING_EVENT
                MIC -> Value.MIC
                NOTE -> Value.NOTE
                OBJECT_LIST -> Value.OBJECT_LIST
                ORDER -> Value.ORDER
                OWNER -> Value.OWNER
                PARTNER_ACCOUNT -> Value.PARTNER_ACCOUNT
                PARTNER_CLIENT -> Value.PARTNER_CLIENT
                PARTNER_CLIENT_REVENUE -> Value.PARTNER_CLIENT_REVENUE
                PARTNER_SERVICE -> Value.PARTNER_SERVICE
                PAYMENT_LINK -> Value.PAYMENT_LINK
                PAYMENT_SCHEDULE -> Value.PAYMENT_SCHEDULE
                PAYMENT_SCHEDULE_INSTALLMENT -> Value.PAYMENT_SCHEDULE_INSTALLMENT
                PERMISSIONS_TESTING -> Value.PERMISSIONS_TESTING
                PLAYBOOK -> Value.PLAYBOOK
                PLAYBOOK_QUESTION -> Value.PLAYBOOK_QUESTION
                PLAYBOOK_SUBMISSION -> Value.PLAYBOOK_SUBMISSION
                PLAYBOOK_SUBMISSION_ANSWER -> Value.PLAYBOOK_SUBMISSION_ANSWER
                PLAYLIST -> Value.PLAYLIST
                PLAYLIST_FOLDER -> Value.PLAYLIST_FOLDER
                PODCAST_EPISODE -> Value.PODCAST_EPISODE
                PORTAL -> Value.PORTAL
                PORTAL_OBJECT_SYNC_MESSAGE -> Value.PORTAL_OBJECT_SYNC_MESSAGE
                POSTAL_MAIL -> Value.POSTAL_MAIL
                PRIVACY_SCANNER_COOKIE -> Value.PRIVACY_SCANNER_COOKIE
                PRODUCT -> Value.PRODUCT
                PRODUCT_OR_FOLDER -> Value.PRODUCT_OR_FOLDER
                PROPERTY_INFO -> Value.PROPERTY_INFO
                PROSPECTING_AGENT_CONTACT_ASSIGNMENT -> Value.PROSPECTING_AGENT_CONTACT_ASSIGNMENT
                PUBLISHING_TASK -> Value.PUBLISHING_TASK
                QUARANTINED_SUBMISSION -> Value.QUARANTINED_SUBMISSION
                QUOTA -> Value.QUOTA
                QUOTE -> Value.QUOTE
                QUOTE_FIELD -> Value.QUOTE_FIELD
                QUOTE_MODULE -> Value.QUOTE_MODULE
                QUOTE_MODULE_FIELD -> Value.QUOTE_MODULE_FIELD
                QUOTE_TEMPLATE -> Value.QUOTE_TEMPLATE
                RESTORABLE_CRM_OBJECT -> Value.RESTORABLE_CRM_OBJECT
                ROSTER -> Value.ROSTER
                ROSTER_MEMBER -> Value.ROSTER_MEMBER
                SALES_DOCUMENT -> Value.SALES_DOCUMENT
                SALES_TASK -> Value.SALES_TASK
                SALES_WORKLOAD -> Value.SALES_WORKLOAD
                SALESFORCE_SYNC_ERROR -> Value.SALESFORCE_SYNC_ERROR
                SCHEDULING_PAGE -> Value.SCHEDULING_PAGE
                SCHEMAS_BACKEND_TEST -> Value.SCHEMAS_BACKEND_TEST
                SCORE_CONFIGURATION -> Value.SCORE_CONFIGURATION
                SEQUENCE -> Value.SEQUENCE
                SEQUENCE_ENROLLMENT -> Value.SEQUENCE_ENROLLMENT
                SEQUENCE_STEP -> Value.SEQUENCE_STEP
                SEQUENCE_STEP_ENROLLMENT -> Value.SEQUENCE_STEP_ENROLLMENT
                SERVICE -> Value.SERVICE
                SITE_PAGE -> Value.SITE_PAGE
                SNIPPET -> Value.SNIPPET
                SOCIAL_BROADCAST -> Value.SOCIAL_BROADCAST
                SOCIAL_CHANNEL -> Value.SOCIAL_CHANNEL
                SOCIAL_POST -> Value.SOCIAL_POST
                SOCIAL_PROFILE -> Value.SOCIAL_PROFILE
                SOX_PROTECTED_DUMMY_TYPE -> Value.SOX_PROTECTED_DUMMY_TYPE
                SOX_PROTECTED_TEST_TYPE -> Value.SOX_PROTECTED_TEST_TYPE
                SUBMISSION_TAG -> Value.SUBMISSION_TAG
                SUBSCRIPTION -> Value.SUBSCRIPTION
                TASK -> Value.TASK
                TASK_TEMPLATE -> Value.TASK_TEMPLATE
                TAX -> Value.TAX
                TEMPLATE -> Value.TEMPLATE
                TICKET -> Value.TICKET
                UNKNOWN -> Value.UNKNOWN
                UNSUBSCRIBE -> Value.UNSUBSCRIBE
                USER -> Value.USER
                VIEW -> Value.VIEW
                VIEW_BLOCK -> Value.VIEW_BLOCK
                WEB_INTERACTIVE -> Value.WEB_INTERACTIVE
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
                ABANDONED_CART -> Known.ABANDONED_CART
                ACCEPTANCE_TEST -> Known.ACCEPTANCE_TEST
                AD -> Known.AD
                AD_ACCOUNT -> Known.AD_ACCOUNT
                AD_CAMPAIGN -> Known.AD_CAMPAIGN
                AD_GROUP -> Known.AD_GROUP
                AI_FORECAST -> Known.AI_FORECAST
                ALL_PAGES -> Known.ALL_PAGES
                APPROVAL -> Known.APPROVAL
                APPROVAL_STEP -> Known.APPROVAL_STEP
                ATTRIBUTION -> Known.ATTRIBUTION
                AUDIENCE -> Known.AUDIENCE
                AUTOMATION_JOURNEY -> Known.AUTOMATION_JOURNEY
                AUTOMATION_PLATFORM_FLOW -> Known.AUTOMATION_PLATFORM_FLOW
                AUTOMATION_PLATFORM_FLOW_ACTION -> Known.AUTOMATION_PLATFORM_FLOW_ACTION
                BET_ALERT -> Known.BET_ALERT
                BET_DELIVERABLE_SERVICE -> Known.BET_DELIVERABLE_SERVICE
                BLOG_LISTING_PAGE -> Known.BLOG_LISTING_PAGE
                BLOG_POST -> Known.BLOG_POST
                CALL -> Known.CALL
                CAMPAIGN -> Known.CAMPAIGN
                CAMPAIGN_BUDGET_ITEM -> Known.CAMPAIGN_BUDGET_ITEM
                CAMPAIGN_SPEND_ITEM -> Known.CAMPAIGN_SPEND_ITEM
                CAMPAIGN_STEP -> Known.CAMPAIGN_STEP
                CAMPAIGN_TEMPLATE -> Known.CAMPAIGN_TEMPLATE
                CAMPAIGN_TEMPLATE_STEP -> Known.CAMPAIGN_TEMPLATE_STEP
                CART -> Known.CART
                CASE_STUDY -> Known.CASE_STUDY
                CHATFLOW -> Known.CHATFLOW
                CLIP -> Known.CLIP
                CMS_URL -> Known.CMS_URL
                COMBO_EVENT_CONFIGURATION -> Known.COMBO_EVENT_CONFIGURATION
                COMMERCE_PAYMENT -> Known.COMMERCE_PAYMENT
                COMMUNICATION -> Known.COMMUNICATION
                COMPANY -> Known.COMPANY
                CONTACT -> Known.CONTACT
                CONTACT_CREATE_ATTRIBUTION -> Known.CONTACT_CREATE_ATTRIBUTION
                CONTENT -> Known.CONTENT
                CONTENT_AUDIT -> Known.CONTENT_AUDIT
                CONTENT_AUDIT_PAGE -> Known.CONTENT_AUDIT_PAGE
                CONVERSATION -> Known.CONVERSATION
                CONVERSATION_INBOX -> Known.CONVERSATION_INBOX
                CONVERSATION_SESSION -> Known.CONVERSATION_SESSION
                CRM_OBJECTS_DUMMY_TYPE -> Known.CRM_OBJECTS_DUMMY_TYPE
                CRM_PIPELINES_DUMMY_TYPE -> Known.CRM_PIPELINES_DUMMY_TYPE
                CTA -> Known.CTA
                CTA_VARIANT -> Known.CTA_VARIANT
                DATA_PRIVACY_CONSENT -> Known.DATA_PRIVACY_CONSENT
                DATA_SYNC_STATE -> Known.DATA_SYNC_STATE
                DEAL -> Known.DEAL
                DEAL_CREATE_ATTRIBUTION -> Known.DEAL_CREATE_ATTRIBUTION
                DEAL_REGISTRATION -> Known.DEAL_REGISTRATION
                DEAL_SPLIT -> Known.DEAL_SPLIT
                DISCOUNT -> Known.DISCOUNT
                DISCOUNT_CODE -> Known.DISCOUNT_CODE
                DISCOUNT_TEMPLATE -> Known.DISCOUNT_TEMPLATE
                EMAIL -> Known.EMAIL
                ENGAGEMENT -> Known.ENGAGEMENT
                EXPORT -> Known.EXPORT
                EXTERNAL_WEB_URL -> Known.EXTERNAL_WEB_URL
                FEE -> Known.FEE
                FEEDBACK_SUBMISSION -> Known.FEEDBACK_SUBMISSION
                FEEDBACK_SURVEY -> Known.FEEDBACK_SURVEY
                FILE_MANAGER_FILE -> Known.FILE_MANAGER_FILE
                FILE_MANAGER_FOLDER -> Known.FILE_MANAGER_FOLDER
                FOLDER -> Known.FOLDER
                FORECAST -> Known.FORECAST
                FORM -> Known.FORM
                FORM_SUBMISSION_INBOUNDDB -> Known.FORM_SUBMISSION_INBOUNDDB
                GOAL_TARGET -> Known.GOAL_TARGET
                GOAL_TARGET_GROUP -> Known.GOAL_TARGET_GROUP
                GOAL_TEMPLATE -> Known.GOAL_TEMPLATE
                GSC_PROPERTY -> Known.GSC_PROPERTY
                HUB -> Known.HUB
                IMPORT -> Known.IMPORT
                INVOICE -> Known.INVOICE
                KEYWORD -> Known.KEYWORD
                KNOWLEDGE_ARTICLE -> Known.KNOWLEDGE_ARTICLE
                LANDING_PAGE -> Known.LANDING_PAGE
                LEAD -> Known.LEAD
                LINE_ITEM -> Known.LINE_ITEM
                MARKETING_CALENDAR -> Known.MARKETING_CALENDAR
                MARKETING_CAMPAIGN_UTM -> Known.MARKETING_CAMPAIGN_UTM
                MARKETING_EMAIL -> Known.MARKETING_EMAIL
                MARKETING_EVENT -> Known.MARKETING_EVENT
                MARKETING_EVENT_ATTENDANCE -> Known.MARKETING_EVENT_ATTENDANCE
                MARKETING_SMS -> Known.MARKETING_SMS
                MEDIA_BRIDGE -> Known.MEDIA_BRIDGE
                MEETING_EVENT -> Known.MEETING_EVENT
                MIC -> Known.MIC
                NOTE -> Known.NOTE
                OBJECT_LIST -> Known.OBJECT_LIST
                ORDER -> Known.ORDER
                OWNER -> Known.OWNER
                PARTNER_ACCOUNT -> Known.PARTNER_ACCOUNT
                PARTNER_CLIENT -> Known.PARTNER_CLIENT
                PARTNER_CLIENT_REVENUE -> Known.PARTNER_CLIENT_REVENUE
                PARTNER_SERVICE -> Known.PARTNER_SERVICE
                PAYMENT_LINK -> Known.PAYMENT_LINK
                PAYMENT_SCHEDULE -> Known.PAYMENT_SCHEDULE
                PAYMENT_SCHEDULE_INSTALLMENT -> Known.PAYMENT_SCHEDULE_INSTALLMENT
                PERMISSIONS_TESTING -> Known.PERMISSIONS_TESTING
                PLAYBOOK -> Known.PLAYBOOK
                PLAYBOOK_QUESTION -> Known.PLAYBOOK_QUESTION
                PLAYBOOK_SUBMISSION -> Known.PLAYBOOK_SUBMISSION
                PLAYBOOK_SUBMISSION_ANSWER -> Known.PLAYBOOK_SUBMISSION_ANSWER
                PLAYLIST -> Known.PLAYLIST
                PLAYLIST_FOLDER -> Known.PLAYLIST_FOLDER
                PODCAST_EPISODE -> Known.PODCAST_EPISODE
                PORTAL -> Known.PORTAL
                PORTAL_OBJECT_SYNC_MESSAGE -> Known.PORTAL_OBJECT_SYNC_MESSAGE
                POSTAL_MAIL -> Known.POSTAL_MAIL
                PRIVACY_SCANNER_COOKIE -> Known.PRIVACY_SCANNER_COOKIE
                PRODUCT -> Known.PRODUCT
                PRODUCT_OR_FOLDER -> Known.PRODUCT_OR_FOLDER
                PROPERTY_INFO -> Known.PROPERTY_INFO
                PROSPECTING_AGENT_CONTACT_ASSIGNMENT -> Known.PROSPECTING_AGENT_CONTACT_ASSIGNMENT
                PUBLISHING_TASK -> Known.PUBLISHING_TASK
                QUARANTINED_SUBMISSION -> Known.QUARANTINED_SUBMISSION
                QUOTA -> Known.QUOTA
                QUOTE -> Known.QUOTE
                QUOTE_FIELD -> Known.QUOTE_FIELD
                QUOTE_MODULE -> Known.QUOTE_MODULE
                QUOTE_MODULE_FIELD -> Known.QUOTE_MODULE_FIELD
                QUOTE_TEMPLATE -> Known.QUOTE_TEMPLATE
                RESTORABLE_CRM_OBJECT -> Known.RESTORABLE_CRM_OBJECT
                ROSTER -> Known.ROSTER
                ROSTER_MEMBER -> Known.ROSTER_MEMBER
                SALES_DOCUMENT -> Known.SALES_DOCUMENT
                SALES_TASK -> Known.SALES_TASK
                SALES_WORKLOAD -> Known.SALES_WORKLOAD
                SALESFORCE_SYNC_ERROR -> Known.SALESFORCE_SYNC_ERROR
                SCHEDULING_PAGE -> Known.SCHEDULING_PAGE
                SCHEMAS_BACKEND_TEST -> Known.SCHEMAS_BACKEND_TEST
                SCORE_CONFIGURATION -> Known.SCORE_CONFIGURATION
                SEQUENCE -> Known.SEQUENCE
                SEQUENCE_ENROLLMENT -> Known.SEQUENCE_ENROLLMENT
                SEQUENCE_STEP -> Known.SEQUENCE_STEP
                SEQUENCE_STEP_ENROLLMENT -> Known.SEQUENCE_STEP_ENROLLMENT
                SERVICE -> Known.SERVICE
                SITE_PAGE -> Known.SITE_PAGE
                SNIPPET -> Known.SNIPPET
                SOCIAL_BROADCAST -> Known.SOCIAL_BROADCAST
                SOCIAL_CHANNEL -> Known.SOCIAL_CHANNEL
                SOCIAL_POST -> Known.SOCIAL_POST
                SOCIAL_PROFILE -> Known.SOCIAL_PROFILE
                SOX_PROTECTED_DUMMY_TYPE -> Known.SOX_PROTECTED_DUMMY_TYPE
                SOX_PROTECTED_TEST_TYPE -> Known.SOX_PROTECTED_TEST_TYPE
                SUBMISSION_TAG -> Known.SUBMISSION_TAG
                SUBSCRIPTION -> Known.SUBSCRIPTION
                TASK -> Known.TASK
                TASK_TEMPLATE -> Known.TASK_TEMPLATE
                TAX -> Known.TAX
                TEMPLATE -> Known.TEMPLATE
                TICKET -> Known.TICKET
                UNKNOWN -> Known.UNKNOWN
                UNSUBSCRIBE -> Known.UNSUBSCRIBE
                USER -> Known.USER
                VIEW -> Known.VIEW
                VIEW_BLOCK -> Known.VIEW_BLOCK
                WEB_INTERACTIVE -> Known.WEB_INTERACTIVE
                else -> throw HubSpotInvalidDataException("Unknown ToObjectType: $value")
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

            return other is ToObjectType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AssociationDefinition &&
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
            isDefault == other.isDefault &&
            isInversePrimary == other.isInversePrimary &&
            isPrimary == other.isPrimary &&
            maxFromObjectIds == other.maxFromObjectIds &&
            maxToObjectIds == other.maxToObjectIds &&
            name == other.name &&
            portalUniqueIdentifier == other.portalUniqueIdentifier &&
            readOnly == other.readOnly &&
            toObjectTypeId == other.toObjectTypeId &&
            fromObjectType == other.fromObjectType &&
            hiddenReason == other.hiddenReason &&
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
            isDefault,
            isInversePrimary,
            isPrimary,
            maxFromObjectIds,
            maxToObjectIds,
            name,
            portalUniqueIdentifier,
            readOnly,
            toObjectTypeId,
            fromObjectType,
            hiddenReason,
            inverseLabel,
            label,
            toObjectType,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AssociationDefinition{id=$id, allowsCustomLabels=$allowsCustomLabels, cardinality=$cardinality, category=$category, fromObjectTypeId=$fromObjectTypeId, hasAllAssociatedObjects=$hasAllAssociatedObjects, hasCascadingDeletes=$hasCascadingDeletes, hasUserEnforcedMaxFromObjectIds=$hasUserEnforcedMaxFromObjectIds, hasUserEnforcedMaxToObjectIds=$hasUserEnforcedMaxToObjectIds, hidden=$hidden, inverseAllowsCustomLabels=$inverseAllowsCustomLabels, inverseCardinality=$inverseCardinality, inverseHasAllAssociatedObjects=$inverseHasAllAssociatedObjects, inverseId=$inverseId, inverseName=$inverseName, isDefault=$isDefault, isInversePrimary=$isInversePrimary, isPrimary=$isPrimary, maxFromObjectIds=$maxFromObjectIds, maxToObjectIds=$maxToObjectIds, name=$name, portalUniqueIdentifier=$portalUniqueIdentifier, readOnly=$readOnly, toObjectTypeId=$toObjectTypeId, fromObjectType=$fromObjectType, hiddenReason=$hiddenReason, inverseLabel=$inverseLabel, label=$label, toObjectType=$toObjectType, additionalProperties=$additionalProperties}"
}
