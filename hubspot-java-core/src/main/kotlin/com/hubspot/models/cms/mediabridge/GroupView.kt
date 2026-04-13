// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.mediabridge

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

class GroupView
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val displayName: JsonField<String>,
    private val displayOrder: JsonField<Int>,
    private val fulcrumPortalId: JsonField<Int>,
    private val fulcrumTimestamp: JsonField<Long>,
    private val hubSpotDefined: JsonField<Boolean>,
    private val name: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("displayName")
        @ExcludeMissing
        displayName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("displayOrder")
        @ExcludeMissing
        displayOrder: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("fulcrumPortalId")
        @ExcludeMissing
        fulcrumPortalId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("fulcrumTimestamp")
        @ExcludeMissing
        fulcrumTimestamp: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("hubspotDefined")
        @ExcludeMissing
        hubSpotDefined: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
    ) : this(
        displayName,
        displayOrder,
        fulcrumPortalId,
        fulcrumTimestamp,
        hubSpotDefined,
        name,
        mutableMapOf(),
    )

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun displayName(): String = displayName.getRequired("displayName")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun displayOrder(): Int = displayOrder.getRequired("displayOrder")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fulcrumPortalId(): Int = fulcrumPortalId.getRequired("fulcrumPortalId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fulcrumTimestamp(): Long = fulcrumTimestamp.getRequired("fulcrumTimestamp")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hubSpotDefined(): Boolean = hubSpotDefined.getRequired("hubspotDefined")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Returns the raw JSON value of [displayName].
     *
     * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("displayName") @ExcludeMissing fun _displayName(): JsonField<String> = displayName

    /**
     * Returns the raw JSON value of [displayOrder].
     *
     * Unlike [displayOrder], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("displayOrder") @ExcludeMissing fun _displayOrder(): JsonField<Int> = displayOrder

    /**
     * Returns the raw JSON value of [fulcrumPortalId].
     *
     * Unlike [fulcrumPortalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fulcrumPortalId")
    @ExcludeMissing
    fun _fulcrumPortalId(): JsonField<Int> = fulcrumPortalId

    /**
     * Returns the raw JSON value of [fulcrumTimestamp].
     *
     * Unlike [fulcrumTimestamp], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("fulcrumTimestamp")
    @ExcludeMissing
    fun _fulcrumTimestamp(): JsonField<Long> = fulcrumTimestamp

    /**
     * Returns the raw JSON value of [hubSpotDefined].
     *
     * Unlike [hubSpotDefined], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hubspotDefined")
    @ExcludeMissing
    fun _hubSpotDefined(): JsonField<Boolean> = hubSpotDefined

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
         * Returns a mutable builder for constructing an instance of [GroupView].
         *
         * The following fields are required:
         * ```java
         * .displayName()
         * .displayOrder()
         * .fulcrumPortalId()
         * .fulcrumTimestamp()
         * .hubSpotDefined()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [GroupView]. */
    class Builder internal constructor() {

        private var displayName: JsonField<String>? = null
        private var displayOrder: JsonField<Int>? = null
        private var fulcrumPortalId: JsonField<Int>? = null
        private var fulcrumTimestamp: JsonField<Long>? = null
        private var hubSpotDefined: JsonField<Boolean>? = null
        private var name: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(groupView: GroupView) = apply {
            displayName = groupView.displayName
            displayOrder = groupView.displayOrder
            fulcrumPortalId = groupView.fulcrumPortalId
            fulcrumTimestamp = groupView.fulcrumTimestamp
            hubSpotDefined = groupView.hubSpotDefined
            name = groupView.name
            additionalProperties = groupView.additionalProperties.toMutableMap()
        }

        fun displayName(displayName: String) = displayName(JsonField.of(displayName))

        /**
         * Sets [Builder.displayName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayName(displayName: JsonField<String>) = apply { this.displayName = displayName }

        fun displayOrder(displayOrder: Int) = displayOrder(JsonField.of(displayOrder))

        /**
         * Sets [Builder.displayOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayOrder] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayOrder(displayOrder: JsonField<Int>) = apply { this.displayOrder = displayOrder }

        fun fulcrumPortalId(fulcrumPortalId: Int) = fulcrumPortalId(JsonField.of(fulcrumPortalId))

        /**
         * Sets [Builder.fulcrumPortalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fulcrumPortalId] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fulcrumPortalId(fulcrumPortalId: JsonField<Int>) = apply {
            this.fulcrumPortalId = fulcrumPortalId
        }

        fun fulcrumTimestamp(fulcrumTimestamp: Long) =
            fulcrumTimestamp(JsonField.of(fulcrumTimestamp))

        /**
         * Sets [Builder.fulcrumTimestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fulcrumTimestamp] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fulcrumTimestamp(fulcrumTimestamp: JsonField<Long>) = apply {
            this.fulcrumTimestamp = fulcrumTimestamp
        }

        fun hubSpotDefined(hubSpotDefined: Boolean) = hubSpotDefined(JsonField.of(hubSpotDefined))

        /**
         * Sets [Builder.hubSpotDefined] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hubSpotDefined] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hubSpotDefined(hubSpotDefined: JsonField<Boolean>) = apply {
            this.hubSpotDefined = hubSpotDefined
        }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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
         * Returns an immutable instance of [GroupView].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .displayName()
         * .displayOrder()
         * .fulcrumPortalId()
         * .fulcrumTimestamp()
         * .hubSpotDefined()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): GroupView =
            GroupView(
                checkRequired("displayName", displayName),
                checkRequired("displayOrder", displayOrder),
                checkRequired("fulcrumPortalId", fulcrumPortalId),
                checkRequired("fulcrumTimestamp", fulcrumTimestamp),
                checkRequired("hubSpotDefined", hubSpotDefined),
                checkRequired("name", name),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): GroupView = apply {
        if (validated) {
            return@apply
        }

        displayName()
        displayOrder()
        fulcrumPortalId()
        fulcrumTimestamp()
        hubSpotDefined()
        name()
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
        (if (displayName.asKnown().isPresent) 1 else 0) +
            (if (displayOrder.asKnown().isPresent) 1 else 0) +
            (if (fulcrumPortalId.asKnown().isPresent) 1 else 0) +
            (if (fulcrumTimestamp.asKnown().isPresent) 1 else 0) +
            (if (hubSpotDefined.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GroupView &&
            displayName == other.displayName &&
            displayOrder == other.displayOrder &&
            fulcrumPortalId == other.fulcrumPortalId &&
            fulcrumTimestamp == other.fulcrumTimestamp &&
            hubSpotDefined == other.hubSpotDefined &&
            name == other.name &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            displayName,
            displayOrder,
            fulcrumPortalId,
            fulcrumTimestamp,
            hubSpotDefined,
            name,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "GroupView{displayName=$displayName, displayOrder=$displayOrder, fulcrumPortalId=$fulcrumPortalId, fulcrumTimestamp=$fulcrumTimestamp, hubSpotDefined=$hubSpotDefined, name=$name, additionalProperties=$additionalProperties}"
}
