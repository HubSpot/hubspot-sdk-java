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
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicEmailSubscriptionFilter
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val acceptedStatuses: JsonField<List<String>>,
    private val filterType: JsonField<FilterType>,
    private val subscriptionIds: JsonField<List<String>>,
    private val subscriptionType: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("acceptedStatuses")
        @ExcludeMissing
        acceptedStatuses: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("filterType")
        @ExcludeMissing
        filterType: JsonField<FilterType> = JsonMissing.of(),
        @JsonProperty("subscriptionIds")
        @ExcludeMissing
        subscriptionIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("subscriptionType")
        @ExcludeMissing
        subscriptionType: JsonField<String> = JsonMissing.of(),
    ) : this(acceptedStatuses, filterType, subscriptionIds, subscriptionType, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun acceptedStatuses(): List<String> = acceptedStatuses.getRequired("acceptedStatuses")

    /**
     * Indicates the type of filter (EMAIL_SUBSCRIPTION).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filterType(): FilterType = filterType.getRequired("filterType")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriptionIds(): List<String> = subscriptionIds.getRequired("subscriptionIds")

    /**
     * The type of subscription related to the filter (PORTAL, BRAND, SUBSCRIPTION, HARDBOUNCE,
     * SPAMREPORT).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subscriptionType(): Optional<String> = subscriptionType.getOptional("subscriptionType")

    /**
     * Returns the raw JSON value of [acceptedStatuses].
     *
     * Unlike [acceptedStatuses], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("acceptedStatuses")
    @ExcludeMissing
    fun _acceptedStatuses(): JsonField<List<String>> = acceptedStatuses

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
         * [PublicEmailSubscriptionFilter].
         *
         * The following fields are required:
         * ```java
         * .acceptedStatuses()
         * .filterType()
         * .subscriptionIds()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicEmailSubscriptionFilter]. */
    class Builder internal constructor() {

        private var acceptedStatuses: JsonField<MutableList<String>>? = null
        private var filterType: JsonField<FilterType>? = null
        private var subscriptionIds: JsonField<MutableList<String>>? = null
        private var subscriptionType: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicEmailSubscriptionFilter: PublicEmailSubscriptionFilter) = apply {
            acceptedStatuses =
                publicEmailSubscriptionFilter.acceptedStatuses.map { it.toMutableList() }
            filterType = publicEmailSubscriptionFilter.filterType
            subscriptionIds =
                publicEmailSubscriptionFilter.subscriptionIds.map { it.toMutableList() }
            subscriptionType = publicEmailSubscriptionFilter.subscriptionType
            additionalProperties = publicEmailSubscriptionFilter.additionalProperties.toMutableMap()
        }

        fun acceptedStatuses(acceptedStatuses: List<String>) =
            acceptedStatuses(JsonField.of(acceptedStatuses))

        /**
         * Sets [Builder.acceptedStatuses] to an arbitrary JSON value.
         *
         * You should usually call [Builder.acceptedStatuses] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun acceptedStatuses(acceptedStatuses: JsonField<List<String>>) = apply {
            this.acceptedStatuses = acceptedStatuses.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [acceptedStatuses].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAcceptedStatus(acceptedStatus: String) = apply {
            acceptedStatuses =
                (acceptedStatuses ?: JsonField.of(mutableListOf())).also {
                    checkKnown("acceptedStatuses", it).add(acceptedStatus)
                }
        }

        /** Indicates the type of filter (EMAIL_SUBSCRIPTION). */
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
         * The type of subscription related to the filter (PORTAL, BRAND, SUBSCRIPTION, HARDBOUNCE,
         * SPAMREPORT).
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
         * Returns an immutable instance of [PublicEmailSubscriptionFilter].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .acceptedStatuses()
         * .filterType()
         * .subscriptionIds()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicEmailSubscriptionFilter =
            PublicEmailSubscriptionFilter(
                checkRequired("acceptedStatuses", acceptedStatuses).map { it.toImmutable() },
                checkRequired("filterType", filterType),
                checkRequired("subscriptionIds", subscriptionIds).map { it.toImmutable() },
                subscriptionType,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicEmailSubscriptionFilter = apply {
        if (validated) {
            return@apply
        }

        acceptedStatuses()
        filterType().validate()
        subscriptionIds()
        subscriptionType()
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
        (acceptedStatuses.asKnown().getOrNull()?.size ?: 0) +
            (filterType.asKnown().getOrNull()?.validity() ?: 0) +
            (subscriptionIds.asKnown().getOrNull()?.size ?: 0) +
            (if (subscriptionType.asKnown().isPresent) 1 else 0)

    /** Indicates the type of filter (EMAIL_SUBSCRIPTION). */
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

            @JvmField val EMAIL_SUBSCRIPTION = of("EMAIL_SUBSCRIPTION")

            @JvmStatic fun of(value: String) = FilterType(JsonField.of(value))
        }

        /** An enum containing [FilterType]'s known values. */
        enum class Known {
            EMAIL_SUBSCRIPTION
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
            EMAIL_SUBSCRIPTION,
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
                EMAIL_SUBSCRIPTION -> Value.EMAIL_SUBSCRIPTION
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
                EMAIL_SUBSCRIPTION -> Known.EMAIL_SUBSCRIPTION
                else -> throw HubSpotInvalidDataException("Unknown FilterType: $value")
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

            return other is FilterType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicEmailSubscriptionFilter &&
            acceptedStatuses == other.acceptedStatuses &&
            filterType == other.filterType &&
            subscriptionIds == other.subscriptionIds &&
            subscriptionType == other.subscriptionType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            acceptedStatuses,
            filterType,
            subscriptionIds,
            subscriptionType,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicEmailSubscriptionFilter{acceptedStatuses=$acceptedStatuses, filterType=$filterType, subscriptionIds=$subscriptionIds, subscriptionType=$subscriptionType, additionalProperties=$additionalProperties}"
}
