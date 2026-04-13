// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.webhooks

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.core.ExcludeMissing
import com.hubspot.core.JsonField
import com.hubspot.core.JsonMissing
import com.hubspot.core.JsonValue
import com.hubspot.core.checkRequired
import com.hubspot.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class FilterCreateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val filter: JsonField<Filter>,
    private val subscriptionId: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("filter") @ExcludeMissing filter: JsonField<Filter> = JsonMissing.of(),
        @JsonProperty("subscriptionId")
        @ExcludeMissing
        subscriptionId: JsonField<Long> = JsonMissing.of(),
    ) : this(filter, subscriptionId, mutableMapOf())

    /**
     * Defines a single condition for searching CRM objects, specifying the property to filter on,
     * the operator to use (such as equals, greater than, or contains), and the value(s) to compare
     * against.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filter(): Filter = filter.getRequired("filter")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriptionId(): Long = subscriptionId.getRequired("subscriptionId")

    /**
     * Returns the raw JSON value of [filter].
     *
     * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<Filter> = filter

    /**
     * Returns the raw JSON value of [subscriptionId].
     *
     * Unlike [subscriptionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subscriptionId")
    @ExcludeMissing
    fun _subscriptionId(): JsonField<Long> = subscriptionId

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
         * Returns a mutable builder for constructing an instance of [FilterCreateRequest].
         *
         * The following fields are required:
         * ```java
         * .filter()
         * .subscriptionId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FilterCreateRequest]. */
    class Builder internal constructor() {

        private var filter: JsonField<Filter>? = null
        private var subscriptionId: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(filterCreateRequest: FilterCreateRequest) = apply {
            filter = filterCreateRequest.filter
            subscriptionId = filterCreateRequest.subscriptionId
            additionalProperties = filterCreateRequest.additionalProperties.toMutableMap()
        }

        /**
         * Defines a single condition for searching CRM objects, specifying the property to filter
         * on, the operator to use (such as equals, greater than, or contains), and the value(s) to
         * compare against.
         */
        fun filter(filter: Filter) = filter(JsonField.of(filter))

        /**
         * Sets [Builder.filter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filter] with a well-typed [Filter] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filter(filter: JsonField<Filter>) = apply { this.filter = filter }

        fun subscriptionId(subscriptionId: Long) = subscriptionId(JsonField.of(subscriptionId))

        /**
         * Sets [Builder.subscriptionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionId] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun subscriptionId(subscriptionId: JsonField<Long>) = apply {
            this.subscriptionId = subscriptionId
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
         * Returns an immutable instance of [FilterCreateRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .filter()
         * .subscriptionId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FilterCreateRequest =
            FilterCreateRequest(
                checkRequired("filter", filter),
                checkRequired("subscriptionId", subscriptionId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FilterCreateRequest = apply {
        if (validated) {
            return@apply
        }

        filter().validate()
        subscriptionId()
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
        (filter.asKnown().getOrNull()?.validity() ?: 0) +
            (if (subscriptionId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FilterCreateRequest &&
            filter == other.filter &&
            subscriptionId == other.subscriptionId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(filter, subscriptionId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FilterCreateRequest{filter=$filter, subscriptionId=$subscriptionId, additionalProperties=$additionalProperties}"
}
