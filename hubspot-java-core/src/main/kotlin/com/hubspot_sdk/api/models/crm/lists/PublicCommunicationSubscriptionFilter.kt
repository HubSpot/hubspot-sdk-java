// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicCommunicationSubscriptionFilter
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val acceptedOptStates: JsonField<List<String>>,
    private val channel: JsonField<String>,
    private val filterType: JsonField<FilterType>,
    private val subscriptionIds: JsonField<List<String>>,
    private val subscriptionType: JsonField<String>,
    private val businessUnitId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("acceptedOptStates")
        @ExcludeMissing
        acceptedOptStates: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("channel") @ExcludeMissing channel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("filterType")
        @ExcludeMissing
        filterType: JsonField<FilterType> = JsonMissing.of(),
        @JsonProperty("subscriptionIds")
        @ExcludeMissing
        subscriptionIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("subscriptionType")
        @ExcludeMissing
        subscriptionType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("businessUnitId")
        @ExcludeMissing
        businessUnitId: JsonField<String> = JsonMissing.of(),
    ) : this(
        acceptedOptStates,
        channel,
        filterType,
        subscriptionIds,
        subscriptionType,
        businessUnitId,
        mutableMapOf(),
    )

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun acceptedOptStates(): List<String> = acceptedOptStates.getRequired("acceptedOptStates")

    /**
     * Specifies the communication channel associated with the subscription filter (EMAIL, WHATSAPP,
     * SMS).
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun channel(): String = channel.getRequired("channel")

    /**
     * Indicates the type of filter, which is (COMMUNICATION_SUBSCRIPTION)
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filterType(): FilterType = filterType.getRequired("filterType")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriptionIds(): List<String> = subscriptionIds.getRequired("subscriptionIds")

    /**
     * Defines the type of subscription related to the filter (PORTAL_WIDE, BUSINESS_UNIT_WIDE,
     * INDIVIDUAL_SUBSCRIPTION)
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriptionType(): String = subscriptionType.getRequired("subscriptionType")

    /**
     * The ID of the business unit associated with the subscription filter.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun businessUnitId(): Optional<String> = businessUnitId.getOptional("businessUnitId")

    /**
     * Returns the raw JSON value of [acceptedOptStates].
     *
     * Unlike [acceptedOptStates], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("acceptedOptStates")
    @ExcludeMissing
    fun _acceptedOptStates(): JsonField<List<String>> = acceptedOptStates

    /**
     * Returns the raw JSON value of [channel].
     *
     * Unlike [channel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("channel") @ExcludeMissing fun _channel(): JsonField<String> = channel

    /**
     * Returns the raw JSON value of [filterType].
     *
     * Unlike [filterType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filterType")
    @ExcludeMissing
    fun _filterType(): JsonField<FilterType> = filterType

    /**
     * Returns the raw JSON value of [subscriptionIds].
     *
     * Unlike [subscriptionIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subscriptionIds")
    @ExcludeMissing
    fun _subscriptionIds(): JsonField<List<String>> = subscriptionIds

    /**
     * Returns the raw JSON value of [subscriptionType].
     *
     * Unlike [subscriptionType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("subscriptionType")
    @ExcludeMissing
    fun _subscriptionType(): JsonField<String> = subscriptionType

    /**
     * Returns the raw JSON value of [businessUnitId].
     *
     * Unlike [businessUnitId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("businessUnitId")
    @ExcludeMissing
    fun _businessUnitId(): JsonField<String> = businessUnitId

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
         * [PublicCommunicationSubscriptionFilter].
         *
         * The following fields are required:
         * ```java
         * .acceptedOptStates()
         * .channel()
         * .filterType()
         * .subscriptionIds()
         * .subscriptionType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicCommunicationSubscriptionFilter]. */
    class Builder internal constructor() {

        private var acceptedOptStates: JsonField<MutableList<String>>? = null
        private var channel: JsonField<String>? = null
        private var filterType: JsonField<FilterType>? = null
        private var subscriptionIds: JsonField<MutableList<String>>? = null
        private var subscriptionType: JsonField<String>? = null
        private var businessUnitId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            publicCommunicationSubscriptionFilter: PublicCommunicationSubscriptionFilter
        ) = apply {
            acceptedOptStates =
                publicCommunicationSubscriptionFilter.acceptedOptStates.map { it.toMutableList() }
            channel = publicCommunicationSubscriptionFilter.channel
            filterType = publicCommunicationSubscriptionFilter.filterType
            subscriptionIds =
                publicCommunicationSubscriptionFilter.subscriptionIds.map { it.toMutableList() }
            subscriptionType = publicCommunicationSubscriptionFilter.subscriptionType
            businessUnitId = publicCommunicationSubscriptionFilter.businessUnitId
            additionalProperties =
                publicCommunicationSubscriptionFilter.additionalProperties.toMutableMap()
        }

        fun acceptedOptStates(acceptedOptStates: List<String>) =
            acceptedOptStates(JsonField.of(acceptedOptStates))

        /**
         * Sets [Builder.acceptedOptStates] to an arbitrary JSON value.
         *
         * You should usually call [Builder.acceptedOptStates] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun acceptedOptStates(acceptedOptStates: JsonField<List<String>>) = apply {
            this.acceptedOptStates = acceptedOptStates.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [acceptedOptStates].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAcceptedOptState(acceptedOptState: String) = apply {
            acceptedOptStates =
                (acceptedOptStates ?: JsonField.of(mutableListOf())).also {
                    checkKnown("acceptedOptStates", it).add(acceptedOptState)
                }
        }

        /**
         * Specifies the communication channel associated with the subscription filter (EMAIL,
         * WHATSAPP, SMS).
         */
        fun channel(channel: String) = channel(JsonField.of(channel))

        /**
         * Sets [Builder.channel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channel] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun channel(channel: JsonField<String>) = apply { this.channel = channel }

        /** Indicates the type of filter, which is (COMMUNICATION_SUBSCRIPTION) */
        fun filterType(filterType: FilterType) = filterType(JsonField.of(filterType))

        /**
         * Sets [Builder.filterType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filterType] with a well-typed [FilterType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun filterType(filterType: JsonField<FilterType>) = apply { this.filterType = filterType }

        fun subscriptionIds(subscriptionIds: List<String>) =
            subscriptionIds(JsonField.of(subscriptionIds))

        /**
         * Sets [Builder.subscriptionIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subscriptionIds(subscriptionIds: JsonField<List<String>>) = apply {
            this.subscriptionIds = subscriptionIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [subscriptionIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSubscriptionId(subscriptionId: String) = apply {
            subscriptionIds =
                (subscriptionIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("subscriptionIds", it).add(subscriptionId)
                }
        }

        /**
         * Defines the type of subscription related to the filter (PORTAL_WIDE, BUSINESS_UNIT_WIDE,
         * INDIVIDUAL_SUBSCRIPTION)
         */
        fun subscriptionType(subscriptionType: String) =
            subscriptionType(JsonField.of(subscriptionType))

        /**
         * Sets [Builder.subscriptionType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionType] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subscriptionType(subscriptionType: JsonField<String>) = apply {
            this.subscriptionType = subscriptionType
        }

        /** The ID of the business unit associated with the subscription filter. */
        fun businessUnitId(businessUnitId: String) = businessUnitId(JsonField.of(businessUnitId))

        /**
         * Sets [Builder.businessUnitId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessUnitId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun businessUnitId(businessUnitId: JsonField<String>) = apply {
            this.businessUnitId = businessUnitId
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
         * Returns an immutable instance of [PublicCommunicationSubscriptionFilter].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .acceptedOptStates()
         * .channel()
         * .filterType()
         * .subscriptionIds()
         * .subscriptionType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicCommunicationSubscriptionFilter =
            PublicCommunicationSubscriptionFilter(
                checkRequired("acceptedOptStates", acceptedOptStates).map { it.toImmutable() },
                checkRequired("channel", channel),
                checkRequired("filterType", filterType),
                checkRequired("subscriptionIds", subscriptionIds).map { it.toImmutable() },
                checkRequired("subscriptionType", subscriptionType),
                businessUnitId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicCommunicationSubscriptionFilter = apply {
        if (validated) {
            return@apply
        }

        acceptedOptStates()
        channel()
        filterType().validate()
        subscriptionIds()
        subscriptionType()
        businessUnitId()
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
        (acceptedOptStates.asKnown().getOrNull()?.size ?: 0) +
            (if (channel.asKnown().isPresent) 1 else 0) +
            (filterType.asKnown().getOrNull()?.validity() ?: 0) +
            (subscriptionIds.asKnown().getOrNull()?.size ?: 0) +
            (if (subscriptionType.asKnown().isPresent) 1 else 0) +
            (if (businessUnitId.asKnown().isPresent) 1 else 0)

    /** Indicates the type of filter, which is (COMMUNICATION_SUBSCRIPTION) */
    class FilterType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val COMMUNICATION_SUBSCRIPTION = of("COMMUNICATION_SUBSCRIPTION")

            @JvmStatic fun of(value: String) = FilterType(JsonField.of(value))
        }

        /** An enum containing [FilterType]'s known values. */
        enum class Known {
            COMMUNICATION_SUBSCRIPTION
        }

        /**
         * An enum containing [FilterType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FilterType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            COMMUNICATION_SUBSCRIPTION,
            /**
             * An enum member indicating that [FilterType] was instantiated with an unknown value.
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
                COMMUNICATION_SUBSCRIPTION -> Value.COMMUNICATION_SUBSCRIPTION
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
                COMMUNICATION_SUBSCRIPTION -> Known.COMMUNICATION_SUBSCRIPTION
                else -> throw HubspotInvalidDataException("Unknown FilterType: $value")
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

        fun validate(): FilterType = apply {
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

            return other is FilterType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicCommunicationSubscriptionFilter &&
            acceptedOptStates == other.acceptedOptStates &&
            channel == other.channel &&
            filterType == other.filterType &&
            subscriptionIds == other.subscriptionIds &&
            subscriptionType == other.subscriptionType &&
            businessUnitId == other.businessUnitId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            acceptedOptStates,
            channel,
            filterType,
            subscriptionIds,
            subscriptionType,
            businessUnitId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicCommunicationSubscriptionFilter{acceptedOptStates=$acceptedOptStates, channel=$channel, filterType=$filterType, subscriptionIds=$subscriptionIds, subscriptionType=$subscriptionType, businessUnitId=$businessUnitId, additionalProperties=$additionalProperties}"
}
