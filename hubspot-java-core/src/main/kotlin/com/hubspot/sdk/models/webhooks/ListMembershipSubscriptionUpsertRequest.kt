// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.webhooks

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
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class ListMembershipSubscriptionUpsertRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val actions: JsonField<List<Action>>,
    private val listIds: JsonField<List<Long>>,
    private val objectIds: JsonField<List<Long>>,
    private val portalId: JsonField<Long>,
    private val subscriptionType: JsonField<SubscriptionType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("actions")
        @ExcludeMissing
        actions: JsonField<List<Action>> = JsonMissing.of(),
        @JsonProperty("listIds") @ExcludeMissing listIds: JsonField<List<Long>> = JsonMissing.of(),
        @JsonProperty("objectIds")
        @ExcludeMissing
        objectIds: JsonField<List<Long>> = JsonMissing.of(),
        @JsonProperty("portalId") @ExcludeMissing portalId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("subscriptionType")
        @ExcludeMissing
        subscriptionType: JsonField<SubscriptionType> = JsonMissing.of(),
    ) : this(actions, listIds, objectIds, portalId, subscriptionType, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun actions(): List<Action> = actions.getRequired("actions")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun listIds(): List<Long> = listIds.getRequired("listIds")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectIds(): List<Long> = objectIds.getRequired("objectIds")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun portalId(): Long = portalId.getRequired("portalId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriptionType(): SubscriptionType = subscriptionType.getRequired("subscriptionType")

    /**
     * Returns the raw JSON value of [actions].
     *
     * Unlike [actions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actions") @ExcludeMissing fun _actions(): JsonField<List<Action>> = actions

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
     * Returns the raw JSON value of [subscriptionType].
     *
     * Unlike [subscriptionType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("subscriptionType")
    @ExcludeMissing
    fun _subscriptionType(): JsonField<SubscriptionType> = subscriptionType

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
         * [ListMembershipSubscriptionUpsertRequest].
         *
         * The following fields are required:
         * ```java
         * .actions()
         * .listIds()
         * .objectIds()
         * .portalId()
         * .subscriptionType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ListMembershipSubscriptionUpsertRequest]. */
    class Builder internal constructor() {

        private var actions: JsonField<MutableList<Action>>? = null
        private var listIds: JsonField<MutableList<Long>>? = null
        private var objectIds: JsonField<MutableList<Long>>? = null
        private var portalId: JsonField<Long>? = null
        private var subscriptionType: JsonField<SubscriptionType>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            listMembershipSubscriptionUpsertRequest: ListMembershipSubscriptionUpsertRequest
        ) = apply {
            actions = listMembershipSubscriptionUpsertRequest.actions.map { it.toMutableList() }
            listIds = listMembershipSubscriptionUpsertRequest.listIds.map { it.toMutableList() }
            objectIds = listMembershipSubscriptionUpsertRequest.objectIds.map { it.toMutableList() }
            portalId = listMembershipSubscriptionUpsertRequest.portalId
            subscriptionType = listMembershipSubscriptionUpsertRequest.subscriptionType
            additionalProperties =
                listMembershipSubscriptionUpsertRequest.additionalProperties.toMutableMap()
        }

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
         * Returns an immutable instance of [ListMembershipSubscriptionUpsertRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .actions()
         * .listIds()
         * .objectIds()
         * .portalId()
         * .subscriptionType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ListMembershipSubscriptionUpsertRequest =
            ListMembershipSubscriptionUpsertRequest(
                checkRequired("actions", actions).map { it.toImmutable() },
                checkRequired("listIds", listIds).map { it.toImmutable() },
                checkRequired("objectIds", objectIds).map { it.toImmutable() },
                checkRequired("portalId", portalId),
                checkRequired("subscriptionType", subscriptionType),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ListMembershipSubscriptionUpsertRequest = apply {
        if (validated) {
            return@apply
        }

        actions().forEach { it.validate() }
        listIds()
        objectIds()
        portalId()
        subscriptionType().validate()
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
        (actions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (listIds.asKnown().getOrNull()?.size ?: 0) +
            (objectIds.asKnown().getOrNull()?.size ?: 0) +
            (if (portalId.asKnown().isPresent) 1 else 0) +
            (subscriptionType.asKnown().getOrNull()?.validity() ?: 0)

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

            @JvmField val GDPR_DELETE = of("GDPR_DELETE")

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
            GDPR_DELETE,
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
            GDPR_DELETE,
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
                GDPR_DELETE -> Value.GDPR_DELETE
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
                GDPR_DELETE -> Known.GDPR_DELETE
                else -> throw HubSpotInvalidDataException("Unknown Action: $value")
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

            @JvmField val OBJECT = of("OBJECT")

            @JvmField val ASSOCIATION = of("ASSOCIATION")

            @JvmField val EVENT = of("EVENT")

            @JvmField val APP_LIFECYCLE_EVENT = of("APP_LIFECYCLE_EVENT")

            @JvmField val LIST_MEMBERSHIP = of("LIST_MEMBERSHIP")

            @JvmField val GDPR_PRIVACY_DELETION = of("GDPR_PRIVACY_DELETION")

            @JvmStatic fun of(value: String) = SubscriptionType(JsonField.of(value))
        }

        /** An enum containing [SubscriptionType]'s known values. */
        enum class Known {
            OBJECT,
            ASSOCIATION,
            EVENT,
            APP_LIFECYCLE_EVENT,
            LIST_MEMBERSHIP,
            GDPR_PRIVACY_DELETION,
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
            OBJECT,
            ASSOCIATION,
            EVENT,
            APP_LIFECYCLE_EVENT,
            LIST_MEMBERSHIP,
            GDPR_PRIVACY_DELETION,
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
                OBJECT -> Value.OBJECT
                ASSOCIATION -> Value.ASSOCIATION
                EVENT -> Value.EVENT
                APP_LIFECYCLE_EVENT -> Value.APP_LIFECYCLE_EVENT
                LIST_MEMBERSHIP -> Value.LIST_MEMBERSHIP
                GDPR_PRIVACY_DELETION -> Value.GDPR_PRIVACY_DELETION
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
                OBJECT -> Known.OBJECT
                ASSOCIATION -> Known.ASSOCIATION
                EVENT -> Known.EVENT
                APP_LIFECYCLE_EVENT -> Known.APP_LIFECYCLE_EVENT
                LIST_MEMBERSHIP -> Known.LIST_MEMBERSHIP
                GDPR_PRIVACY_DELETION -> Known.GDPR_PRIVACY_DELETION
                else -> throw HubSpotInvalidDataException("Unknown SubscriptionType: $value")
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

            return other is SubscriptionType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ListMembershipSubscriptionUpsertRequest &&
            actions == other.actions &&
            listIds == other.listIds &&
            objectIds == other.objectIds &&
            portalId == other.portalId &&
            subscriptionType == other.subscriptionType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(actions, listIds, objectIds, portalId, subscriptionType, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ListMembershipSubscriptionUpsertRequest{actions=$actions, listIds=$listIds, objectIds=$objectIds, portalId=$portalId, subscriptionType=$subscriptionType, additionalProperties=$additionalProperties}"
}
