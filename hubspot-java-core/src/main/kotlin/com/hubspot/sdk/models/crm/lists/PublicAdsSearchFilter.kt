// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

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

class PublicAdsSearchFilter
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val adNetwork: JsonField<String>,
    private val entityType: JsonField<String>,
    private val filterType: JsonField<FilterType>,
    private val operator: JsonField<String>,
    private val searchTerms: JsonField<List<String>>,
    private val searchTermType: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("adNetwork") @ExcludeMissing adNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("entityType")
        @ExcludeMissing
        entityType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("filterType")
        @ExcludeMissing
        filterType: JsonField<FilterType> = JsonMissing.of(),
        @JsonProperty("operator") @ExcludeMissing operator: JsonField<String> = JsonMissing.of(),
        @JsonProperty("searchTerms")
        @ExcludeMissing
        searchTerms: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("searchTermType")
        @ExcludeMissing
        searchTermType: JsonField<String> = JsonMissing.of(),
    ) : this(
        adNetwork,
        entityType,
        filterType,
        operator,
        searchTerms,
        searchTermType,
        mutableMapOf(),
    )

    /**
     * Ad network (ADWORDS, FACEBOOK, LINKEDIN, ALL)
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun adNetwork(): String = adNetwork.getRequired("adNetwork")

    /**
     * Type of ad entity (KEYWORD, ADGROUP, AD, CAMPAIGN)
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun entityType(): String = entityType.getRequired("entityType")

    /**
     * Type of the filter (ADS_SEARCH)
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filterType(): FilterType = filterType.getRequired("filterType")

    /**
     * Operator to be applied (CONTAINS, IS_EQUAL_TO, ENDS_WITH, STARTS_WITH, IS_KNOWN)
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operator(): String = operator.getRequired("operator")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun searchTerms(): List<String> = searchTerms.getRequired("searchTerms")

    /**
     * Search term to match an ad
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun searchTermType(): String = searchTermType.getRequired("searchTermType")

    /**
     * Returns the raw JSON value of [adNetwork].
     *
     * Unlike [adNetwork], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("adNetwork") @ExcludeMissing fun _adNetwork(): JsonField<String> = adNetwork

    /**
     * Returns the raw JSON value of [entityType].
     *
     * Unlike [entityType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entityType") @ExcludeMissing fun _entityType(): JsonField<String> = entityType

    /**
     * Returns the raw JSON value of [filterType].
     *
     * Unlike [filterType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filterType")
    @ExcludeMissing
    fun _filterType(): JsonField<FilterType> = filterType

    /**
     * Returns the raw JSON value of [operator].
     *
     * Unlike [operator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<String> = operator

    /**
     * Returns the raw JSON value of [searchTerms].
     *
     * Unlike [searchTerms], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("searchTerms")
    @ExcludeMissing
    fun _searchTerms(): JsonField<List<String>> = searchTerms

    /**
     * Returns the raw JSON value of [searchTermType].
     *
     * Unlike [searchTermType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("searchTermType")
    @ExcludeMissing
    fun _searchTermType(): JsonField<String> = searchTermType

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
         * Returns a mutable builder for constructing an instance of [PublicAdsSearchFilter].
         *
         * The following fields are required:
         * ```java
         * .adNetwork()
         * .entityType()
         * .filterType()
         * .operator()
         * .searchTerms()
         * .searchTermType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicAdsSearchFilter]. */
    class Builder internal constructor() {

        private var adNetwork: JsonField<String>? = null
        private var entityType: JsonField<String>? = null
        private var filterType: JsonField<FilterType>? = null
        private var operator: JsonField<String>? = null
        private var searchTerms: JsonField<MutableList<String>>? = null
        private var searchTermType: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicAdsSearchFilter: PublicAdsSearchFilter) = apply {
            adNetwork = publicAdsSearchFilter.adNetwork
            entityType = publicAdsSearchFilter.entityType
            filterType = publicAdsSearchFilter.filterType
            operator = publicAdsSearchFilter.operator
            searchTerms = publicAdsSearchFilter.searchTerms.map { it.toMutableList() }
            searchTermType = publicAdsSearchFilter.searchTermType
            additionalProperties = publicAdsSearchFilter.additionalProperties.toMutableMap()
        }

        /** Ad network (ADWORDS, FACEBOOK, LINKEDIN, ALL) */
        fun adNetwork(adNetwork: String) = adNetwork(JsonField.of(adNetwork))

        /**
         * Sets [Builder.adNetwork] to an arbitrary JSON value.
         *
         * You should usually call [Builder.adNetwork] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun adNetwork(adNetwork: JsonField<String>) = apply { this.adNetwork = adNetwork }

        /** Type of ad entity (KEYWORD, ADGROUP, AD, CAMPAIGN) */
        fun entityType(entityType: String) = entityType(JsonField.of(entityType))

        /**
         * Sets [Builder.entityType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entityType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun entityType(entityType: JsonField<String>) = apply { this.entityType = entityType }

        /** Type of the filter (ADS_SEARCH) */
        fun filterType(filterType: FilterType) = filterType(JsonField.of(filterType))

        /**
         * Sets [Builder.filterType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filterType] with a well-typed [FilterType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun filterType(filterType: JsonField<FilterType>) = apply { this.filterType = filterType }

        /** Operator to be applied (CONTAINS, IS_EQUAL_TO, ENDS_WITH, STARTS_WITH, IS_KNOWN) */
        fun operator(operator: String) = operator(JsonField.of(operator))

        /**
         * Sets [Builder.operator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operator] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun operator(operator: JsonField<String>) = apply { this.operator = operator }

        fun searchTerms(searchTerms: List<String>) = searchTerms(JsonField.of(searchTerms))

        /**
         * Sets [Builder.searchTerms] to an arbitrary JSON value.
         *
         * You should usually call [Builder.searchTerms] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun searchTerms(searchTerms: JsonField<List<String>>) = apply {
            this.searchTerms = searchTerms.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [searchTerms].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSearchTerm(searchTerm: String) = apply {
            searchTerms =
                (searchTerms ?: JsonField.of(mutableListOf())).also {
                    checkKnown("searchTerms", it).add(searchTerm)
                }
        }

        /** Search term to match an ad */
        fun searchTermType(searchTermType: String) = searchTermType(JsonField.of(searchTermType))

        /**
         * Sets [Builder.searchTermType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.searchTermType] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun searchTermType(searchTermType: JsonField<String>) = apply {
            this.searchTermType = searchTermType
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
         * Returns an immutable instance of [PublicAdsSearchFilter].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .adNetwork()
         * .entityType()
         * .filterType()
         * .operator()
         * .searchTerms()
         * .searchTermType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicAdsSearchFilter =
            PublicAdsSearchFilter(
                checkRequired("adNetwork", adNetwork),
                checkRequired("entityType", entityType),
                checkRequired("filterType", filterType),
                checkRequired("operator", operator),
                checkRequired("searchTerms", searchTerms).map { it.toImmutable() },
                checkRequired("searchTermType", searchTermType),
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
    fun validate(): PublicAdsSearchFilter = apply {
        if (validated) {
            return@apply
        }

        adNetwork()
        entityType()
        filterType().validate()
        operator()
        searchTerms()
        searchTermType()
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
        (if (adNetwork.asKnown().isPresent) 1 else 0) +
            (if (entityType.asKnown().isPresent) 1 else 0) +
            (filterType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (operator.asKnown().isPresent) 1 else 0) +
            (searchTerms.asKnown().getOrNull()?.size ?: 0) +
            (if (searchTermType.asKnown().isPresent) 1 else 0)

    /** Type of the filter (ADS_SEARCH) */
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

            @JvmField val ADS_SEARCH = of("ADS_SEARCH")

            @JvmStatic fun of(value: String) = FilterType(JsonField.of(value))
        }

        /** An enum containing [FilterType]'s known values. */
        enum class Known {
            ADS_SEARCH
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
            ADS_SEARCH,
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
                ADS_SEARCH -> Value.ADS_SEARCH
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
                ADS_SEARCH -> Known.ADS_SEARCH
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

        return other is PublicAdsSearchFilter &&
            adNetwork == other.adNetwork &&
            entityType == other.entityType &&
            filterType == other.filterType &&
            operator == other.operator &&
            searchTerms == other.searchTerms &&
            searchTermType == other.searchTermType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            adNetwork,
            entityType,
            filterType,
            operator,
            searchTerms,
            searchTermType,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicAdsSearchFilter{adNetwork=$adNetwork, entityType=$entityType, filterType=$filterType, operator=$operator, searchTerms=$searchTerms, searchTermType=$searchTermType, additionalProperties=$additionalProperties}"
}
