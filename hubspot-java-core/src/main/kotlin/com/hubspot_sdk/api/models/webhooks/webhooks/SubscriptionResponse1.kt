// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.webhooks.webhooks

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SubscriptionResponse1
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<Long>,
    private val actions: JsonField<List<Action>>,
    private val appId: JsonField<Long>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val objectTypeId: JsonField<String>,
    private val subscriptionType: JsonField<SubscriptionType>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val actionOverrides: JsonField<ActionOverrides>,
    private val associatedObjectTypeIds: JsonField<List<String>>,
    private val createdBy: JsonField<Long>,
    private val deletedAt: JsonField<OffsetDateTime>,
    private val listIds: JsonField<List<Long>>,
    private val objectIds: JsonField<List<Long>>,
    private val portalId: JsonField<Long>,
    private val properties: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("actions")
        @ExcludeMissing
        actions: JsonField<List<Action>> = JsonMissing.of(),
        @JsonProperty("appId") @ExcludeMissing appId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("objectTypeId")
        @ExcludeMissing
        objectTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("subscriptionType")
        @ExcludeMissing
        subscriptionType: JsonField<SubscriptionType> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("actionOverrides")
        @ExcludeMissing
        actionOverrides: JsonField<ActionOverrides> = JsonMissing.of(),
        @JsonProperty("associatedObjectTypeIds")
        @ExcludeMissing
        associatedObjectTypeIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("deletedAt")
        @ExcludeMissing
        deletedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("listIds") @ExcludeMissing listIds: JsonField<List<Long>> = JsonMissing.of(),
        @JsonProperty("objectIds")
        @ExcludeMissing
        objectIds: JsonField<List<Long>> = JsonMissing.of(),
        @JsonProperty("portalId") @ExcludeMissing portalId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("properties")
        @ExcludeMissing
        properties: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        id,
        actions,
        appId,
        createdAt,
        objectTypeId,
        subscriptionType,
        updatedAt,
        actionOverrides,
        associatedObjectTypeIds,
        createdBy,
        deletedAt,
        listIds,
        objectIds,
        portalId,
        properties,
        mutableMapOf(),
    )

    /**
     * The unique ID of the webhook subscription.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): Long = id.getRequired("id")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun actions(): List<Action> = actions.getRequired("actions")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun appId(): Long = appId.getRequired("appId")

    /**
     * The timestamp when the webhook subscription was created, in ISO 8601 format (e.g.,
     * 2020-02-29T12:30:00Z).
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * The ID of the object type for the subscription. This can be a standard CRM object (e.g.,
     * 'contact', 'company', 'deal') or a custom object ID for custom object subscriptions.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectTypeId(): String = objectTypeId.getRequired("objectTypeId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriptionType(): SubscriptionType = subscriptionType.getRequired("subscriptionType")

    /**
     * The timestamp when the webhook subscription was last updated, in ISO 8601 format (e.g.,
     * 2020-02-29T12:30:00Z).
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun actionOverrides(): Optional<ActionOverrides> =
        actionOverrides.getOptional("actionOverrides")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun associatedObjectTypeIds(): Optional<List<String>> =
        associatedObjectTypeIds.getOptional("associatedObjectTypeIds")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdBy(): Optional<Long> = createdBy.getOptional("createdBy")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deletedAt(): Optional<OffsetDateTime> = deletedAt.getOptional("deletedAt")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun listIds(): Optional<List<Long>> = listIds.getOptional("listIds")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun objectIds(): Optional<List<Long>> = objectIds.getOptional("objectIds")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun portalId(): Optional<Long> = portalId.getOptional("portalId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun properties(): Optional<List<String>> = properties.getOptional("properties")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

    /**
     * Returns the raw JSON value of [actions].
     *
     * Unlike [actions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actions") @ExcludeMissing fun _actions(): JsonField<List<Action>> = actions

    /**
     * Returns the raw JSON value of [appId].
     *
     * Unlike [appId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("appId") @ExcludeMissing fun _appId(): JsonField<Long> = appId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [objectTypeId].
     *
     * Unlike [objectTypeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectTypeId")
    @ExcludeMissing
    fun _objectTypeId(): JsonField<String> = objectTypeId

    /**
     * Returns the raw JSON value of [subscriptionType].
     *
     * Unlike [subscriptionType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("subscriptionType")
    @ExcludeMissing
    fun _subscriptionType(): JsonField<SubscriptionType> = subscriptionType

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [actionOverrides].
     *
     * Unlike [actionOverrides], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actionOverrides")
    @ExcludeMissing
    fun _actionOverrides(): JsonField<ActionOverrides> = actionOverrides

    /**
     * Returns the raw JSON value of [associatedObjectTypeIds].
     *
     * Unlike [associatedObjectTypeIds], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("associatedObjectTypeIds")
    @ExcludeMissing
    fun _associatedObjectTypeIds(): JsonField<List<String>> = associatedObjectTypeIds

    /**
     * Returns the raw JSON value of [createdBy].
     *
     * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<Long> = createdBy

    /**
     * Returns the raw JSON value of [deletedAt].
     *
     * Unlike [deletedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deletedAt")
    @ExcludeMissing
    fun _deletedAt(): JsonField<OffsetDateTime> = deletedAt

    /**
     * Returns the raw JSON value of [listIds].
     *
     * Unlike [listIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("listIds") @ExcludeMissing fun _listIds(): JsonField<List<Long>> = listIds

    /**
     * Returns the raw JSON value of [objectIds].
     *
     * Unlike [objectIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectIds") @ExcludeMissing fun _objectIds(): JsonField<List<Long>> = objectIds

    /**
     * Returns the raw JSON value of [portalId].
     *
     * Unlike [portalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("portalId") @ExcludeMissing fun _portalId(): JsonField<Long> = portalId

    /**
     * Returns the raw JSON value of [properties].
     *
     * Unlike [properties], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("properties")
    @ExcludeMissing
    fun _properties(): JsonField<List<String>> = properties

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
         * Returns a mutable builder for constructing an instance of [SubscriptionResponse1].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .actions()
         * .appId()
         * .createdAt()
         * .objectTypeId()
         * .subscriptionType()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubscriptionResponse1]. */
    class Builder internal constructor() {

        private var id: JsonField<Long>? = null
        private var actions: JsonField<MutableList<Action>>? = null
        private var appId: JsonField<Long>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var objectTypeId: JsonField<String>? = null
        private var subscriptionType: JsonField<SubscriptionType>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var actionOverrides: JsonField<ActionOverrides> = JsonMissing.of()
        private var associatedObjectTypeIds: JsonField<MutableList<String>>? = null
        private var createdBy: JsonField<Long> = JsonMissing.of()
        private var deletedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var listIds: JsonField<MutableList<Long>>? = null
        private var objectIds: JsonField<MutableList<Long>>? = null
        private var portalId: JsonField<Long> = JsonMissing.of()
        private var properties: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(subscriptionResponse1: SubscriptionResponse1) = apply {
            id = subscriptionResponse1.id
            actions = subscriptionResponse1.actions.map { it.toMutableList() }
            appId = subscriptionResponse1.appId
            createdAt = subscriptionResponse1.createdAt
            objectTypeId = subscriptionResponse1.objectTypeId
            subscriptionType = subscriptionResponse1.subscriptionType
            updatedAt = subscriptionResponse1.updatedAt
            actionOverrides = subscriptionResponse1.actionOverrides
            associatedObjectTypeIds =
                subscriptionResponse1.associatedObjectTypeIds.map { it.toMutableList() }
            createdBy = subscriptionResponse1.createdBy
            deletedAt = subscriptionResponse1.deletedAt
            listIds = subscriptionResponse1.listIds.map { it.toMutableList() }
            objectIds = subscriptionResponse1.objectIds.map { it.toMutableList() }
            portalId = subscriptionResponse1.portalId
            properties = subscriptionResponse1.properties.map { it.toMutableList() }
            additionalProperties = subscriptionResponse1.additionalProperties.toMutableMap()
        }

        /** The unique ID of the webhook subscription. */
        fun id(id: Long) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<Long>) = apply { this.id = id }

        fun actions(actions: List<Action>) = actions(JsonField.of(actions))

        /**
         * Sets [Builder.actions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actions] with a well-typed `List<Action>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun actions(actions: JsonField<List<Action>>) = apply {
            this.actions = actions.map { it.toMutableList() }
        }

        /**
         * Adds a single [Action] to [actions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAction(action: Action) = apply {
            actions =
                (actions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("actions", it).add(action)
                }
        }

        fun appId(appId: Long) = appId(JsonField.of(appId))

        /**
         * Sets [Builder.appId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.appId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun appId(appId: JsonField<Long>) = apply { this.appId = appId }

        /**
         * The timestamp when the webhook subscription was created, in ISO 8601 format (e.g.,
         * 2020-02-29T12:30:00Z).
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * The ID of the object type for the subscription. This can be a standard CRM object (e.g.,
         * 'contact', 'company', 'deal') or a custom object ID for custom object subscriptions.
         */
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

        fun subscriptionType(subscriptionType: SubscriptionType) =
            subscriptionType(JsonField.of(subscriptionType))

        /**
         * Sets [Builder.subscriptionType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionType] with a well-typed [SubscriptionType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun subscriptionType(subscriptionType: JsonField<SubscriptionType>) = apply {
            this.subscriptionType = subscriptionType
        }

        /**
         * The timestamp when the webhook subscription was last updated, in ISO 8601 format (e.g.,
         * 2020-02-29T12:30:00Z).
         */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun actionOverrides(actionOverrides: ActionOverrides) =
            actionOverrides(JsonField.of(actionOverrides))

        /**
         * Sets [Builder.actionOverrides] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actionOverrides] with a well-typed [ActionOverrides]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun actionOverrides(actionOverrides: JsonField<ActionOverrides>) = apply {
            this.actionOverrides = actionOverrides
        }

        fun associatedObjectTypeIds(associatedObjectTypeIds: List<String>) =
            associatedObjectTypeIds(JsonField.of(associatedObjectTypeIds))

        /**
         * Sets [Builder.associatedObjectTypeIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.associatedObjectTypeIds] with a well-typed
         * `List<String>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun associatedObjectTypeIds(associatedObjectTypeIds: JsonField<List<String>>) = apply {
            this.associatedObjectTypeIds = associatedObjectTypeIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [associatedObjectTypeIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAssociatedObjectTypeId(associatedObjectTypeId: String) = apply {
            associatedObjectTypeIds =
                (associatedObjectTypeIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("associatedObjectTypeIds", it).add(associatedObjectTypeId)
                }
        }

        fun createdBy(createdBy: Long) = createdBy(JsonField.of(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun createdBy(createdBy: JsonField<Long>) = apply { this.createdBy = createdBy }

        fun deletedAt(deletedAt: OffsetDateTime) = deletedAt(JsonField.of(deletedAt))

        /**
         * Sets [Builder.deletedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deletedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun deletedAt(deletedAt: JsonField<OffsetDateTime>) = apply { this.deletedAt = deletedAt }

        fun listIds(listIds: List<Long>) = listIds(JsonField.of(listIds))

        /**
         * Sets [Builder.listIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.listIds] with a well-typed `List<Long>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun listIds(listIds: JsonField<List<Long>>) = apply {
            this.listIds = listIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [Long] to [listIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addListId(listId: Long) = apply {
            listIds =
                (listIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("listIds", it).add(listId)
                }
        }

        fun objectIds(objectIds: List<Long>) = objectIds(JsonField.of(objectIds))

        /**
         * Sets [Builder.objectIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectIds] with a well-typed `List<Long>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun objectIds(objectIds: JsonField<List<Long>>) = apply {
            this.objectIds = objectIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [Long] to [objectIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addObjectId(objectId: Long) = apply {
            objectIds =
                (objectIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("objectIds", it).add(objectId)
                }
        }

        fun portalId(portalId: Long) = portalId(JsonField.of(portalId))

        /**
         * Sets [Builder.portalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.portalId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun portalId(portalId: JsonField<Long>) = apply { this.portalId = portalId }

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
         * Returns an immutable instance of [SubscriptionResponse1].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .actions()
         * .appId()
         * .createdAt()
         * .objectTypeId()
         * .subscriptionType()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SubscriptionResponse1 =
            SubscriptionResponse1(
                checkRequired("id", id),
                checkRequired("actions", actions).map { it.toImmutable() },
                checkRequired("appId", appId),
                checkRequired("createdAt", createdAt),
                checkRequired("objectTypeId", objectTypeId),
                checkRequired("subscriptionType", subscriptionType),
                checkRequired("updatedAt", updatedAt),
                actionOverrides,
                (associatedObjectTypeIds ?: JsonMissing.of()).map { it.toImmutable() },
                createdBy,
                deletedAt,
                (listIds ?: JsonMissing.of()).map { it.toImmutable() },
                (objectIds ?: JsonMissing.of()).map { it.toImmutable() },
                portalId,
                (properties ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SubscriptionResponse1 = apply {
        if (validated) {
            return@apply
        }

        id()
        actions().forEach { it.validate() }
        appId()
        createdAt()
        objectTypeId()
        subscriptionType().validate()
        updatedAt()
        actionOverrides().ifPresent { it.validate() }
        associatedObjectTypeIds()
        createdBy()
        deletedAt()
        listIds()
        objectIds()
        portalId()
        properties()
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
            (actions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (appId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (objectTypeId.asKnown().isPresent) 1 else 0) +
            (subscriptionType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (actionOverrides.asKnown().getOrNull()?.validity() ?: 0) +
            (associatedObjectTypeIds.asKnown().getOrNull()?.size ?: 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (deletedAt.asKnown().isPresent) 1 else 0) +
            (listIds.asKnown().getOrNull()?.size ?: 0) +
            (objectIds.asKnown().getOrNull()?.size ?: 0) +
            (if (portalId.asKnown().isPresent) 1 else 0) +
            (properties.asKnown().getOrNull()?.size ?: 0)

    class Action @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CREATE = of("CREATE")

            @JvmField val UPDATE = of("UPDATE")

            @JvmField val DELETE = of("DELETE")

            @JvmField val MERGE = of("MERGE")

            @JvmField val RESTORE = of("RESTORE")

            @JvmField val ASSOCIATION_ADDED = of("ASSOCIATION_ADDED")

            @JvmField val ASSOCIATION_REMOVED = of("ASSOCIATION_REMOVED")

            @JvmField val SNAPSHOT = of("SNAPSHOT")

            @JvmField val APP_INSTALL = of("APP_INSTALL")

            @JvmField val APP_UNINSTALL = of("APP_UNINSTALL")

            @JvmField val ADDED_TO_LIST = of("ADDED_TO_LIST")

            @JvmField val REMOVED_FROM_LIST = of("REMOVED_FROM_LIST")

            @JvmStatic fun of(value: String) = Action(JsonField.of(value))
        }

        /** An enum containing [Action]'s known values. */
        enum class Known {
            CREATE,
            UPDATE,
            DELETE,
            MERGE,
            RESTORE,
            ASSOCIATION_ADDED,
            ASSOCIATION_REMOVED,
            SNAPSHOT,
            APP_INSTALL,
            APP_UNINSTALL,
            ADDED_TO_LIST,
            REMOVED_FROM_LIST,
        }

        /**
         * An enum containing [Action]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Action] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CREATE,
            UPDATE,
            DELETE,
            MERGE,
            RESTORE,
            ASSOCIATION_ADDED,
            ASSOCIATION_REMOVED,
            SNAPSHOT,
            APP_INSTALL,
            APP_UNINSTALL,
            ADDED_TO_LIST,
            REMOVED_FROM_LIST,
            /** An enum member indicating that [Action] was instantiated with an unknown value. */
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
                CREATE -> Value.CREATE
                UPDATE -> Value.UPDATE
                DELETE -> Value.DELETE
                MERGE -> Value.MERGE
                RESTORE -> Value.RESTORE
                ASSOCIATION_ADDED -> Value.ASSOCIATION_ADDED
                ASSOCIATION_REMOVED -> Value.ASSOCIATION_REMOVED
                SNAPSHOT -> Value.SNAPSHOT
                APP_INSTALL -> Value.APP_INSTALL
                APP_UNINSTALL -> Value.APP_UNINSTALL
                ADDED_TO_LIST -> Value.ADDED_TO_LIST
                REMOVED_FROM_LIST -> Value.REMOVED_FROM_LIST
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
                CREATE -> Known.CREATE
                UPDATE -> Known.UPDATE
                DELETE -> Known.DELETE
                MERGE -> Known.MERGE
                RESTORE -> Known.RESTORE
                ASSOCIATION_ADDED -> Known.ASSOCIATION_ADDED
                ASSOCIATION_REMOVED -> Known.ASSOCIATION_REMOVED
                SNAPSHOT -> Known.SNAPSHOT
                APP_INSTALL -> Known.APP_INSTALL
                APP_UNINSTALL -> Known.APP_UNINSTALL
                ADDED_TO_LIST -> Known.ADDED_TO_LIST
                REMOVED_FROM_LIST -> Known.REMOVED_FROM_LIST
                else -> throw HubspotInvalidDataException("Unknown Action: $value")
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

        fun validate(): Action = apply {
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

            return other is Action && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class SubscriptionType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val APP_LIFECYCLE_EVENT = of("APP_LIFECYCLE_EVENT")

            @JvmField val ASSOCIATION = of("ASSOCIATION")

            @JvmField val EVENT = of("EVENT")

            @JvmField val LIST_MEMBERSHIP = of("LIST_MEMBERSHIP")

            @JvmField val OBJECT = of("OBJECT")

            @JvmStatic fun of(value: String) = SubscriptionType(JsonField.of(value))
        }

        /** An enum containing [SubscriptionType]'s known values. */
        enum class Known {
            APP_LIFECYCLE_EVENT,
            ASSOCIATION,
            EVENT,
            LIST_MEMBERSHIP,
            OBJECT,
        }

        /**
         * An enum containing [SubscriptionType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SubscriptionType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            APP_LIFECYCLE_EVENT,
            ASSOCIATION,
            EVENT,
            LIST_MEMBERSHIP,
            OBJECT,
            /**
             * An enum member indicating that [SubscriptionType] was instantiated with an unknown
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
                APP_LIFECYCLE_EVENT -> Value.APP_LIFECYCLE_EVENT
                ASSOCIATION -> Value.ASSOCIATION
                EVENT -> Value.EVENT
                LIST_MEMBERSHIP -> Value.LIST_MEMBERSHIP
                OBJECT -> Value.OBJECT
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
                APP_LIFECYCLE_EVENT -> Known.APP_LIFECYCLE_EVENT
                ASSOCIATION -> Known.ASSOCIATION
                EVENT -> Known.EVENT
                LIST_MEMBERSHIP -> Known.LIST_MEMBERSHIP
                OBJECT -> Known.OBJECT
                else -> throw HubspotInvalidDataException("Unknown SubscriptionType: $value")
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

        fun validate(): SubscriptionType = apply {
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

            return other is SubscriptionType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class ActionOverrides
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [ActionOverrides]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ActionOverrides]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(actionOverrides: ActionOverrides) = apply {
                additionalProperties = actionOverrides.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ActionOverrides].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ActionOverrides = ActionOverrides(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): ActionOverrides = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ActionOverrides && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ActionOverrides{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionResponse1 &&
            id == other.id &&
            actions == other.actions &&
            appId == other.appId &&
            createdAt == other.createdAt &&
            objectTypeId == other.objectTypeId &&
            subscriptionType == other.subscriptionType &&
            updatedAt == other.updatedAt &&
            actionOverrides == other.actionOverrides &&
            associatedObjectTypeIds == other.associatedObjectTypeIds &&
            createdBy == other.createdBy &&
            deletedAt == other.deletedAt &&
            listIds == other.listIds &&
            objectIds == other.objectIds &&
            portalId == other.portalId &&
            properties == other.properties &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            actions,
            appId,
            createdAt,
            objectTypeId,
            subscriptionType,
            updatedAt,
            actionOverrides,
            associatedObjectTypeIds,
            createdBy,
            deletedAt,
            listIds,
            objectIds,
            portalId,
            properties,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SubscriptionResponse1{id=$id, actions=$actions, appId=$appId, createdAt=$createdAt, objectTypeId=$objectTypeId, subscriptionType=$subscriptionType, updatedAt=$updatedAt, actionOverrides=$actionOverrides, associatedObjectTypeIds=$associatedObjectTypeIds, createdBy=$createdBy, deletedAt=$deletedAt, listIds=$listIds, objectIds=$objectIds, portalId=$portalId, properties=$properties, additionalProperties=$additionalProperties}"
}
