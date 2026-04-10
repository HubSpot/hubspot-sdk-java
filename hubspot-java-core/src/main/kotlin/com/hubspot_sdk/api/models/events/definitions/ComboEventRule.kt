// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.definitions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

class ComboEventRule
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val count: JsonField<Int>,
    private val eventTypeId: JsonField<String>,
    private val propertyFilters: JsonField<List<PropertyFilter>>,
    private val lookbackWindowDays: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("count") @ExcludeMissing count: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("eventTypeId")
        @ExcludeMissing
        eventTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("propertyFilters")
        @ExcludeMissing
        propertyFilters: JsonField<List<PropertyFilter>> = JsonMissing.of(),
        @JsonProperty("lookbackWindowDays")
        @ExcludeMissing
        lookbackWindowDays: JsonField<Int> = JsonMissing.of(),
    ) : this(count, eventTypeId, propertyFilters, lookbackWindowDays, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun count(): Int = count.getRequired("count")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventTypeId(): String = eventTypeId.getRequired("eventTypeId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun propertyFilters(): List<PropertyFilter> = propertyFilters.getRequired("propertyFilters")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lookbackWindowDays(): Optional<Int> = lookbackWindowDays.getOptional("lookbackWindowDays")

    /**
     * Returns the raw JSON value of [count].
     *
     * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Int> = count

    /**
     * Returns the raw JSON value of [eventTypeId].
     *
     * Unlike [eventTypeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventTypeId") @ExcludeMissing fun _eventTypeId(): JsonField<String> = eventTypeId

    /**
     * Returns the raw JSON value of [propertyFilters].
     *
     * Unlike [propertyFilters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("propertyFilters")
    @ExcludeMissing
    fun _propertyFilters(): JsonField<List<PropertyFilter>> = propertyFilters

    /**
     * Returns the raw JSON value of [lookbackWindowDays].
     *
     * Unlike [lookbackWindowDays], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("lookbackWindowDays")
    @ExcludeMissing
    fun _lookbackWindowDays(): JsonField<Int> = lookbackWindowDays

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
         * Returns a mutable builder for constructing an instance of [ComboEventRule].
         *
         * The following fields are required:
         * ```java
         * .count()
         * .eventTypeId()
         * .propertyFilters()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ComboEventRule]. */
    class Builder internal constructor() {

        private var count: JsonField<Int>? = null
        private var eventTypeId: JsonField<String>? = null
        private var propertyFilters: JsonField<MutableList<PropertyFilter>>? = null
        private var lookbackWindowDays: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(comboEventRule: ComboEventRule) = apply {
            count = comboEventRule.count
            eventTypeId = comboEventRule.eventTypeId
            propertyFilters = comboEventRule.propertyFilters.map { it.toMutableList() }
            lookbackWindowDays = comboEventRule.lookbackWindowDays
            additionalProperties = comboEventRule.additionalProperties.toMutableMap()
        }

        fun count(count: Int) = count(JsonField.of(count))

        /**
         * Sets [Builder.count] to an arbitrary JSON value.
         *
         * You should usually call [Builder.count] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun count(count: JsonField<Int>) = apply { this.count = count }

        fun eventTypeId(eventTypeId: String) = eventTypeId(JsonField.of(eventTypeId))

        /**
         * Sets [Builder.eventTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventTypeId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventTypeId(eventTypeId: JsonField<String>) = apply { this.eventTypeId = eventTypeId }

        fun propertyFilters(propertyFilters: List<PropertyFilter>) =
            propertyFilters(JsonField.of(propertyFilters))

        /**
         * Sets [Builder.propertyFilters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.propertyFilters] with a well-typed
         * `List<PropertyFilter>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun propertyFilters(propertyFilters: JsonField<List<PropertyFilter>>) = apply {
            this.propertyFilters = propertyFilters.map { it.toMutableList() }
        }

        /**
         * Adds a single [PropertyFilter] to [propertyFilters].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPropertyFilter(propertyFilter: PropertyFilter) = apply {
            propertyFilters =
                (propertyFilters ?: JsonField.of(mutableListOf())).also {
                    checkKnown("propertyFilters", it).add(propertyFilter)
                }
        }

        fun lookbackWindowDays(lookbackWindowDays: Int) =
            lookbackWindowDays(JsonField.of(lookbackWindowDays))

        /**
         * Sets [Builder.lookbackWindowDays] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lookbackWindowDays] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lookbackWindowDays(lookbackWindowDays: JsonField<Int>) = apply {
            this.lookbackWindowDays = lookbackWindowDays
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
         * Returns an immutable instance of [ComboEventRule].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .count()
         * .eventTypeId()
         * .propertyFilters()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ComboEventRule =
            ComboEventRule(
                checkRequired("count", count),
                checkRequired("eventTypeId", eventTypeId),
                checkRequired("propertyFilters", propertyFilters).map { it.toImmutable() },
                lookbackWindowDays,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ComboEventRule = apply {
        if (validated) {
            return@apply
        }

        count()
        eventTypeId()
        propertyFilters().forEach { it.validate() }
        lookbackWindowDays()
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
        (if (count.asKnown().isPresent) 1 else 0) +
            (if (eventTypeId.asKnown().isPresent) 1 else 0) +
            (propertyFilters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (lookbackWindowDays.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ComboEventRule &&
            count == other.count &&
            eventTypeId == other.eventTypeId &&
            propertyFilters == other.propertyFilters &&
            lookbackWindowDays == other.lookbackWindowDays &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(count, eventTypeId, propertyFilters, lookbackWindowDays, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ComboEventRule{count=$count, eventTypeId=$eventTypeId, propertyFilters=$propertyFilters, lookbackWindowDays=$lookbackWindowDays, additionalProperties=$additionalProperties}"
}
