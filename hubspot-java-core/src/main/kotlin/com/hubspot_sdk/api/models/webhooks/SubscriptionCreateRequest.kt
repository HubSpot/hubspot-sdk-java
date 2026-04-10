// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.webhooks

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.Enum
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SubscriptionCreateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val active: JsonField<Boolean>,
    private val eventType: JsonField<EventType>,
    private val eventTypeName: JsonField<String>,
    private val objectTypeId: JsonField<String>,
    private val propertyName: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("active") @ExcludeMissing active: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("eventType")
        @ExcludeMissing
        eventType: JsonField<EventType> = JsonMissing.of(),
        @JsonProperty("eventTypeName")
        @ExcludeMissing
        eventTypeName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("objectTypeId")
        @ExcludeMissing
        objectTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("propertyName")
        @ExcludeMissing
        propertyName: JsonField<String> = JsonMissing.of(),
    ) : this(active, eventType, eventTypeName, objectTypeId, propertyName, mutableMapOf())

    /**
     * Determines if the subscription is active or paused. Defaults to false.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun active(): Boolean = active.getRequired("active")

    /**
     * Type of event to listen for. Can be one of `create`, `delete`, `deletedForPrivacy`, or
     * `propertyChange`.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventType(): EventType = eventType.getRequired("eventType")

    /**
     * The name of the event to listen for. This is used with custom objects to specify custom event
     * types beyond the standard eventType enum values.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun eventTypeName(): Optional<String> = eventTypeName.getOptional("eventTypeName")

    /**
     * The ID of the object type for the subscription. This can be a standard CRM object (e.g.,
     * 'contact', 'company', 'deal') or a custom object ID for custom object subscriptions.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun objectTypeId(): Optional<String> = objectTypeId.getOptional("objectTypeId")

    /**
     * The internal name of the property to monitor for changes. Only applies when `eventType` is
     * `propertyChange`.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun propertyName(): Optional<String> = propertyName.getOptional("propertyName")

    /**
     * Returns the raw JSON value of [active].
     *
     * Unlike [active], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("active") @ExcludeMissing fun _active(): JsonField<Boolean> = active

    /**
     * Returns the raw JSON value of [eventType].
     *
     * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventType") @ExcludeMissing fun _eventType(): JsonField<EventType> = eventType

    /**
     * Returns the raw JSON value of [eventTypeName].
     *
     * Unlike [eventTypeName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventTypeName")
    @ExcludeMissing
    fun _eventTypeName(): JsonField<String> = eventTypeName

    /**
     * Returns the raw JSON value of [objectTypeId].
     *
     * Unlike [objectTypeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectTypeId")
    @ExcludeMissing
    fun _objectTypeId(): JsonField<String> = objectTypeId

    /**
     * Returns the raw JSON value of [propertyName].
     *
     * Unlike [propertyName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("propertyName")
    @ExcludeMissing
    fun _propertyName(): JsonField<String> = propertyName

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
         * Returns a mutable builder for constructing an instance of [SubscriptionCreateRequest].
         *
         * The following fields are required:
         * ```java
         * .active()
         * .eventType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubscriptionCreateRequest]. */
    class Builder internal constructor() {

        private var active: JsonField<Boolean>? = null
        private var eventType: JsonField<EventType>? = null
        private var eventTypeName: JsonField<String> = JsonMissing.of()
        private var objectTypeId: JsonField<String> = JsonMissing.of()
        private var propertyName: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(subscriptionCreateRequest: SubscriptionCreateRequest) = apply {
            active = subscriptionCreateRequest.active
            eventType = subscriptionCreateRequest.eventType
            eventTypeName = subscriptionCreateRequest.eventTypeName
            objectTypeId = subscriptionCreateRequest.objectTypeId
            propertyName = subscriptionCreateRequest.propertyName
            additionalProperties = subscriptionCreateRequest.additionalProperties.toMutableMap()
        }

        /** Determines if the subscription is active or paused. Defaults to false. */
        fun active(active: Boolean) = active(JsonField.of(active))

        /**
         * Sets [Builder.active] to an arbitrary JSON value.
         *
         * You should usually call [Builder.active] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun active(active: JsonField<Boolean>) = apply { this.active = active }

        /**
         * Type of event to listen for. Can be one of `create`, `delete`, `deletedForPrivacy`, or
         * `propertyChange`.
         */
        fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

        /**
         * Sets [Builder.eventType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventType] with a well-typed [EventType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventType(eventType: JsonField<EventType>) = apply { this.eventType = eventType }

        /**
         * The name of the event to listen for. This is used with custom objects to specify custom
         * event types beyond the standard eventType enum values.
         */
        fun eventTypeName(eventTypeName: String) = eventTypeName(JsonField.of(eventTypeName))

        /**
         * Sets [Builder.eventTypeName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventTypeName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventTypeName(eventTypeName: JsonField<String>) = apply {
            this.eventTypeName = eventTypeName
        }

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

        /**
         * The internal name of the property to monitor for changes. Only applies when `eventType`
         * is `propertyChange`.
         */
        fun propertyName(propertyName: String) = propertyName(JsonField.of(propertyName))

        /**
         * Sets [Builder.propertyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.propertyName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun propertyName(propertyName: JsonField<String>) = apply {
            this.propertyName = propertyName
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
         * Returns an immutable instance of [SubscriptionCreateRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .active()
         * .eventType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SubscriptionCreateRequest =
            SubscriptionCreateRequest(
                checkRequired("active", active),
                checkRequired("eventType", eventType),
                eventTypeName,
                objectTypeId,
                propertyName,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SubscriptionCreateRequest = apply {
        if (validated) {
            return@apply
        }

        active()
        eventType().validate()
        eventTypeName()
        objectTypeId()
        propertyName()
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
        (if (active.asKnown().isPresent) 1 else 0) +
            (eventType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (eventTypeName.asKnown().isPresent) 1 else 0) +
            (if (objectTypeId.asKnown().isPresent) 1 else 0) +
            (if (propertyName.asKnown().isPresent) 1 else 0)

    /**
     * Type of event to listen for. Can be one of `create`, `delete`, `deletedForPrivacy`, or
     * `propertyChange`.
     */
    class EventType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val COMPANY_ASSOCIATION_CHANGE = of("company.associationChange")

            @JvmField val COMPANY_CREATION = of("company.creation")

            @JvmField val COMPANY_DELETION = of("company.deletion")

            @JvmField val COMPANY_MERGE = of("company.merge")

            @JvmField val COMPANY_PROPERTY_CHANGE = of("company.propertyChange")

            @JvmField val COMPANY_RESTORE = of("company.restore")

            @JvmField val CONTACT_ASSOCIATION_CHANGE = of("contact.associationChange")

            @JvmField val CONTACT_CREATION = of("contact.creation")

            @JvmField val CONTACT_DELETION = of("contact.deletion")

            @JvmField val CONTACT_MERGE = of("contact.merge")

            @JvmField val CONTACT_PRIVACY_DELETION = of("contact.privacyDeletion")

            @JvmField val CONTACT_PROPERTY_CHANGE = of("contact.propertyChange")

            @JvmField val CONTACT_RESTORE = of("contact.restore")

            @JvmField val CONVERSATION_CREATION = of("conversation.creation")

            @JvmField val CONVERSATION_DELETION = of("conversation.deletion")

            @JvmField val CONVERSATION_NEW_MESSAGE = of("conversation.newMessage")

            @JvmField val CONVERSATION_PRIVACY_DELETION = of("conversation.privacyDeletion")

            @JvmField val CONVERSATION_PROPERTY_CHANGE = of("conversation.propertyChange")

            @JvmField val DEAL_ASSOCIATION_CHANGE = of("deal.associationChange")

            @JvmField val DEAL_CREATION = of("deal.creation")

            @JvmField val DEAL_DELETION = of("deal.deletion")

            @JvmField val DEAL_MERGE = of("deal.merge")

            @JvmField val DEAL_PROPERTY_CHANGE = of("deal.propertyChange")

            @JvmField val DEAL_RESTORE = of("deal.restore")

            @JvmField val EVENT_COMPLETED = of("event.completed")

            @JvmField val LINE_ITEM_ASSOCIATION_CHANGE = of("line_item.associationChange")

            @JvmField val LINE_ITEM_CREATION = of("line_item.creation")

            @JvmField val LINE_ITEM_DELETION = of("line_item.deletion")

            @JvmField val LINE_ITEM_MERGE = of("line_item.merge")

            @JvmField val LINE_ITEM_PROPERTY_CHANGE = of("line_item.propertyChange")

            @JvmField val LINE_ITEM_RESTORE = of("line_item.restore")

            @JvmField val OBJECT_ASSOCIATION_CHANGE = of("object.associationChange")

            @JvmField val OBJECT_CREATION = of("object.creation")

            @JvmField val OBJECT_DELETION = of("object.deletion")

            @JvmField val OBJECT_MERGE = of("object.merge")

            @JvmField val OBJECT_PROPERTY_CHANGE = of("object.propertyChange")

            @JvmField val OBJECT_RESTORE = of("object.restore")

            @JvmField val PRODUCT_CREATION = of("product.creation")

            @JvmField val PRODUCT_DELETION = of("product.deletion")

            @JvmField val PRODUCT_MERGE = of("product.merge")

            @JvmField val PRODUCT_PROPERTY_CHANGE = of("product.propertyChange")

            @JvmField val PRODUCT_RESTORE = of("product.restore")

            @JvmField val TICKET_ASSOCIATION_CHANGE = of("ticket.associationChange")

            @JvmField val TICKET_CREATION = of("ticket.creation")

            @JvmField val TICKET_DELETION = of("ticket.deletion")

            @JvmField val TICKET_MERGE = of("ticket.merge")

            @JvmField val TICKET_PROPERTY_CHANGE = of("ticket.propertyChange")

            @JvmField val TICKET_RESTORE = of("ticket.restore")

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        /** An enum containing [EventType]'s known values. */
        enum class Known {
            COMPANY_ASSOCIATION_CHANGE,
            COMPANY_CREATION,
            COMPANY_DELETION,
            COMPANY_MERGE,
            COMPANY_PROPERTY_CHANGE,
            COMPANY_RESTORE,
            CONTACT_ASSOCIATION_CHANGE,
            CONTACT_CREATION,
            CONTACT_DELETION,
            CONTACT_MERGE,
            CONTACT_PRIVACY_DELETION,
            CONTACT_PROPERTY_CHANGE,
            CONTACT_RESTORE,
            CONVERSATION_CREATION,
            CONVERSATION_DELETION,
            CONVERSATION_NEW_MESSAGE,
            CONVERSATION_PRIVACY_DELETION,
            CONVERSATION_PROPERTY_CHANGE,
            DEAL_ASSOCIATION_CHANGE,
            DEAL_CREATION,
            DEAL_DELETION,
            DEAL_MERGE,
            DEAL_PROPERTY_CHANGE,
            DEAL_RESTORE,
            EVENT_COMPLETED,
            LINE_ITEM_ASSOCIATION_CHANGE,
            LINE_ITEM_CREATION,
            LINE_ITEM_DELETION,
            LINE_ITEM_MERGE,
            LINE_ITEM_PROPERTY_CHANGE,
            LINE_ITEM_RESTORE,
            OBJECT_ASSOCIATION_CHANGE,
            OBJECT_CREATION,
            OBJECT_DELETION,
            OBJECT_MERGE,
            OBJECT_PROPERTY_CHANGE,
            OBJECT_RESTORE,
            PRODUCT_CREATION,
            PRODUCT_DELETION,
            PRODUCT_MERGE,
            PRODUCT_PROPERTY_CHANGE,
            PRODUCT_RESTORE,
            TICKET_ASSOCIATION_CHANGE,
            TICKET_CREATION,
            TICKET_DELETION,
            TICKET_MERGE,
            TICKET_PROPERTY_CHANGE,
            TICKET_RESTORE,
        }

        /**
         * An enum containing [EventType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EventType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            COMPANY_ASSOCIATION_CHANGE,
            COMPANY_CREATION,
            COMPANY_DELETION,
            COMPANY_MERGE,
            COMPANY_PROPERTY_CHANGE,
            COMPANY_RESTORE,
            CONTACT_ASSOCIATION_CHANGE,
            CONTACT_CREATION,
            CONTACT_DELETION,
            CONTACT_MERGE,
            CONTACT_PRIVACY_DELETION,
            CONTACT_PROPERTY_CHANGE,
            CONTACT_RESTORE,
            CONVERSATION_CREATION,
            CONVERSATION_DELETION,
            CONVERSATION_NEW_MESSAGE,
            CONVERSATION_PRIVACY_DELETION,
            CONVERSATION_PROPERTY_CHANGE,
            DEAL_ASSOCIATION_CHANGE,
            DEAL_CREATION,
            DEAL_DELETION,
            DEAL_MERGE,
            DEAL_PROPERTY_CHANGE,
            DEAL_RESTORE,
            EVENT_COMPLETED,
            LINE_ITEM_ASSOCIATION_CHANGE,
            LINE_ITEM_CREATION,
            LINE_ITEM_DELETION,
            LINE_ITEM_MERGE,
            LINE_ITEM_PROPERTY_CHANGE,
            LINE_ITEM_RESTORE,
            OBJECT_ASSOCIATION_CHANGE,
            OBJECT_CREATION,
            OBJECT_DELETION,
            OBJECT_MERGE,
            OBJECT_PROPERTY_CHANGE,
            OBJECT_RESTORE,
            PRODUCT_CREATION,
            PRODUCT_DELETION,
            PRODUCT_MERGE,
            PRODUCT_PROPERTY_CHANGE,
            PRODUCT_RESTORE,
            TICKET_ASSOCIATION_CHANGE,
            TICKET_CREATION,
            TICKET_DELETION,
            TICKET_MERGE,
            TICKET_PROPERTY_CHANGE,
            TICKET_RESTORE,
            /**
             * An enum member indicating that [EventType] was instantiated with an unknown value.
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
                COMPANY_ASSOCIATION_CHANGE -> Value.COMPANY_ASSOCIATION_CHANGE
                COMPANY_CREATION -> Value.COMPANY_CREATION
                COMPANY_DELETION -> Value.COMPANY_DELETION
                COMPANY_MERGE -> Value.COMPANY_MERGE
                COMPANY_PROPERTY_CHANGE -> Value.COMPANY_PROPERTY_CHANGE
                COMPANY_RESTORE -> Value.COMPANY_RESTORE
                CONTACT_ASSOCIATION_CHANGE -> Value.CONTACT_ASSOCIATION_CHANGE
                CONTACT_CREATION -> Value.CONTACT_CREATION
                CONTACT_DELETION -> Value.CONTACT_DELETION
                CONTACT_MERGE -> Value.CONTACT_MERGE
                CONTACT_PRIVACY_DELETION -> Value.CONTACT_PRIVACY_DELETION
                CONTACT_PROPERTY_CHANGE -> Value.CONTACT_PROPERTY_CHANGE
                CONTACT_RESTORE -> Value.CONTACT_RESTORE
                CONVERSATION_CREATION -> Value.CONVERSATION_CREATION
                CONVERSATION_DELETION -> Value.CONVERSATION_DELETION
                CONVERSATION_NEW_MESSAGE -> Value.CONVERSATION_NEW_MESSAGE
                CONVERSATION_PRIVACY_DELETION -> Value.CONVERSATION_PRIVACY_DELETION
                CONVERSATION_PROPERTY_CHANGE -> Value.CONVERSATION_PROPERTY_CHANGE
                DEAL_ASSOCIATION_CHANGE -> Value.DEAL_ASSOCIATION_CHANGE
                DEAL_CREATION -> Value.DEAL_CREATION
                DEAL_DELETION -> Value.DEAL_DELETION
                DEAL_MERGE -> Value.DEAL_MERGE
                DEAL_PROPERTY_CHANGE -> Value.DEAL_PROPERTY_CHANGE
                DEAL_RESTORE -> Value.DEAL_RESTORE
                EVENT_COMPLETED -> Value.EVENT_COMPLETED
                LINE_ITEM_ASSOCIATION_CHANGE -> Value.LINE_ITEM_ASSOCIATION_CHANGE
                LINE_ITEM_CREATION -> Value.LINE_ITEM_CREATION
                LINE_ITEM_DELETION -> Value.LINE_ITEM_DELETION
                LINE_ITEM_MERGE -> Value.LINE_ITEM_MERGE
                LINE_ITEM_PROPERTY_CHANGE -> Value.LINE_ITEM_PROPERTY_CHANGE
                LINE_ITEM_RESTORE -> Value.LINE_ITEM_RESTORE
                OBJECT_ASSOCIATION_CHANGE -> Value.OBJECT_ASSOCIATION_CHANGE
                OBJECT_CREATION -> Value.OBJECT_CREATION
                OBJECT_DELETION -> Value.OBJECT_DELETION
                OBJECT_MERGE -> Value.OBJECT_MERGE
                OBJECT_PROPERTY_CHANGE -> Value.OBJECT_PROPERTY_CHANGE
                OBJECT_RESTORE -> Value.OBJECT_RESTORE
                PRODUCT_CREATION -> Value.PRODUCT_CREATION
                PRODUCT_DELETION -> Value.PRODUCT_DELETION
                PRODUCT_MERGE -> Value.PRODUCT_MERGE
                PRODUCT_PROPERTY_CHANGE -> Value.PRODUCT_PROPERTY_CHANGE
                PRODUCT_RESTORE -> Value.PRODUCT_RESTORE
                TICKET_ASSOCIATION_CHANGE -> Value.TICKET_ASSOCIATION_CHANGE
                TICKET_CREATION -> Value.TICKET_CREATION
                TICKET_DELETION -> Value.TICKET_DELETION
                TICKET_MERGE -> Value.TICKET_MERGE
                TICKET_PROPERTY_CHANGE -> Value.TICKET_PROPERTY_CHANGE
                TICKET_RESTORE -> Value.TICKET_RESTORE
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
                COMPANY_ASSOCIATION_CHANGE -> Known.COMPANY_ASSOCIATION_CHANGE
                COMPANY_CREATION -> Known.COMPANY_CREATION
                COMPANY_DELETION -> Known.COMPANY_DELETION
                COMPANY_MERGE -> Known.COMPANY_MERGE
                COMPANY_PROPERTY_CHANGE -> Known.COMPANY_PROPERTY_CHANGE
                COMPANY_RESTORE -> Known.COMPANY_RESTORE
                CONTACT_ASSOCIATION_CHANGE -> Known.CONTACT_ASSOCIATION_CHANGE
                CONTACT_CREATION -> Known.CONTACT_CREATION
                CONTACT_DELETION -> Known.CONTACT_DELETION
                CONTACT_MERGE -> Known.CONTACT_MERGE
                CONTACT_PRIVACY_DELETION -> Known.CONTACT_PRIVACY_DELETION
                CONTACT_PROPERTY_CHANGE -> Known.CONTACT_PROPERTY_CHANGE
                CONTACT_RESTORE -> Known.CONTACT_RESTORE
                CONVERSATION_CREATION -> Known.CONVERSATION_CREATION
                CONVERSATION_DELETION -> Known.CONVERSATION_DELETION
                CONVERSATION_NEW_MESSAGE -> Known.CONVERSATION_NEW_MESSAGE
                CONVERSATION_PRIVACY_DELETION -> Known.CONVERSATION_PRIVACY_DELETION
                CONVERSATION_PROPERTY_CHANGE -> Known.CONVERSATION_PROPERTY_CHANGE
                DEAL_ASSOCIATION_CHANGE -> Known.DEAL_ASSOCIATION_CHANGE
                DEAL_CREATION -> Known.DEAL_CREATION
                DEAL_DELETION -> Known.DEAL_DELETION
                DEAL_MERGE -> Known.DEAL_MERGE
                DEAL_PROPERTY_CHANGE -> Known.DEAL_PROPERTY_CHANGE
                DEAL_RESTORE -> Known.DEAL_RESTORE
                EVENT_COMPLETED -> Known.EVENT_COMPLETED
                LINE_ITEM_ASSOCIATION_CHANGE -> Known.LINE_ITEM_ASSOCIATION_CHANGE
                LINE_ITEM_CREATION -> Known.LINE_ITEM_CREATION
                LINE_ITEM_DELETION -> Known.LINE_ITEM_DELETION
                LINE_ITEM_MERGE -> Known.LINE_ITEM_MERGE
                LINE_ITEM_PROPERTY_CHANGE -> Known.LINE_ITEM_PROPERTY_CHANGE
                LINE_ITEM_RESTORE -> Known.LINE_ITEM_RESTORE
                OBJECT_ASSOCIATION_CHANGE -> Known.OBJECT_ASSOCIATION_CHANGE
                OBJECT_CREATION -> Known.OBJECT_CREATION
                OBJECT_DELETION -> Known.OBJECT_DELETION
                OBJECT_MERGE -> Known.OBJECT_MERGE
                OBJECT_PROPERTY_CHANGE -> Known.OBJECT_PROPERTY_CHANGE
                OBJECT_RESTORE -> Known.OBJECT_RESTORE
                PRODUCT_CREATION -> Known.PRODUCT_CREATION
                PRODUCT_DELETION -> Known.PRODUCT_DELETION
                PRODUCT_MERGE -> Known.PRODUCT_MERGE
                PRODUCT_PROPERTY_CHANGE -> Known.PRODUCT_PROPERTY_CHANGE
                PRODUCT_RESTORE -> Known.PRODUCT_RESTORE
                TICKET_ASSOCIATION_CHANGE -> Known.TICKET_ASSOCIATION_CHANGE
                TICKET_CREATION -> Known.TICKET_CREATION
                TICKET_DELETION -> Known.TICKET_DELETION
                TICKET_MERGE -> Known.TICKET_MERGE
                TICKET_PROPERTY_CHANGE -> Known.TICKET_PROPERTY_CHANGE
                TICKET_RESTORE -> Known.TICKET_RESTORE
                else -> throw HubSpotInvalidDataException("Unknown EventType: $value")
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

        fun validate(): EventType = apply {
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

            return other is EventType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionCreateRequest &&
            active == other.active &&
            eventType == other.eventType &&
            eventTypeName == other.eventTypeName &&
            objectTypeId == other.objectTypeId &&
            propertyName == other.propertyName &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            active,
            eventType,
            eventTypeName,
            objectTypeId,
            propertyName,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SubscriptionCreateRequest{active=$active, eventType=$eventType, eventTypeName=$eventTypeName, objectTypeId=$objectTypeId, propertyName=$propertyName, additionalProperties=$additionalProperties}"
}
