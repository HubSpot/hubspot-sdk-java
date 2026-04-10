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
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class AppLifecycleEventSubscriptionUpsertRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val eventTypeId: JsonField<String>,
    private val properties: JsonField<List<String>>,
    private val subscriptionType: JsonField<SubscriptionType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("eventTypeId")
        @ExcludeMissing
        eventTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("properties")
        @ExcludeMissing
        properties: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("subscriptionType")
        @ExcludeMissing
        subscriptionType: JsonField<SubscriptionType> = JsonMissing.of(),
    ) : this(eventTypeId, properties, subscriptionType, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventTypeId(): String = eventTypeId.getRequired("eventTypeId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun properties(): List<String> = properties.getRequired("properties")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriptionType(): SubscriptionType = subscriptionType.getRequired("subscriptionType")

    /**
     * Returns the raw JSON value of [eventTypeId].
     *
     * Unlike [eventTypeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventTypeId") @ExcludeMissing fun _eventTypeId(): JsonField<String> = eventTypeId

    /**
     * Returns the raw JSON value of [properties].
     *
     * Unlike [properties], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("properties")
    @ExcludeMissing
    fun _properties(): JsonField<List<String>> = properties

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
         * [AppLifecycleEventSubscriptionUpsertRequest].
         *
         * The following fields are required:
         * ```java
         * .eventTypeId()
         * .properties()
         * .subscriptionType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AppLifecycleEventSubscriptionUpsertRequest]. */
    class Builder internal constructor() {

        private var eventTypeId: JsonField<String>? = null
        private var properties: JsonField<MutableList<String>>? = null
        private var subscriptionType: JsonField<SubscriptionType>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            appLifecycleEventSubscriptionUpsertRequest: AppLifecycleEventSubscriptionUpsertRequest
        ) = apply {
            eventTypeId = appLifecycleEventSubscriptionUpsertRequest.eventTypeId
            properties =
                appLifecycleEventSubscriptionUpsertRequest.properties.map { it.toMutableList() }
            subscriptionType = appLifecycleEventSubscriptionUpsertRequest.subscriptionType
            additionalProperties =
                appLifecycleEventSubscriptionUpsertRequest.additionalProperties.toMutableMap()
        }

        fun eventTypeId(eventTypeId: String) = eventTypeId(JsonField.of(eventTypeId))

        /**
         * Sets [Builder.eventTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventTypeId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventTypeId(eventTypeId: JsonField<String>) = apply { this.eventTypeId = eventTypeId }

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
         * Returns an immutable instance of [AppLifecycleEventSubscriptionUpsertRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .eventTypeId()
         * .properties()
         * .subscriptionType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AppLifecycleEventSubscriptionUpsertRequest =
            AppLifecycleEventSubscriptionUpsertRequest(
                checkRequired("eventTypeId", eventTypeId),
                checkRequired("properties", properties).map { it.toImmutable() },
                checkRequired("subscriptionType", subscriptionType),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AppLifecycleEventSubscriptionUpsertRequest = apply {
        if (validated) {
            return@apply
        }

        eventTypeId()
        properties()
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
        (if (eventTypeId.asKnown().isPresent) 1 else 0) +
            (properties.asKnown().getOrNull()?.size ?: 0) +
            (subscriptionType.asKnown().getOrNull()?.validity() ?: 0)

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

            @JvmStatic fun of(value: String) = SubscriptionType(JsonField.of(value))
        }

        /** An enum containing [SubscriptionType]'s known values. */
        enum class Known {
            OBJECT,
            ASSOCIATION,
            EVENT,
            APP_LIFECYCLE_EVENT,
            LIST_MEMBERSHIP,
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

        return other is AppLifecycleEventSubscriptionUpsertRequest &&
            eventTypeId == other.eventTypeId &&
            properties == other.properties &&
            subscriptionType == other.subscriptionType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(eventTypeId, properties, subscriptionType, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AppLifecycleEventSubscriptionUpsertRequest{eventTypeId=$eventTypeId, properties=$properties, subscriptionType=$subscriptionType, additionalProperties=$additionalProperties}"
}
