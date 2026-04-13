// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.emails

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.core.ExcludeMissing
import com.hubspot.core.JsonField
import com.hubspot.core.JsonMissing
import com.hubspot.core.JsonValue
import com.hubspot.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class PublicEmailSubscriptionDetails
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val officeLocationId: JsonField<String>,
    private val preferencesGroupId: JsonField<String>,
    private val subscriptionId: JsonField<String>,
    private val subscriptionName: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("officeLocationId")
        @ExcludeMissing
        officeLocationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("preferencesGroupId")
        @ExcludeMissing
        preferencesGroupId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("subscriptionId")
        @ExcludeMissing
        subscriptionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("subscriptionName")
        @ExcludeMissing
        subscriptionName: JsonField<String> = JsonMissing.of(),
    ) : this(officeLocationId, preferencesGroupId, subscriptionId, subscriptionName, mutableMapOf())

    /**
     * ID of the selected office location.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun officeLocationId(): Optional<String> = officeLocationId.getOptional("officeLocationId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun preferencesGroupId(): Optional<String> =
        preferencesGroupId.getOptional("preferencesGroupId")

    /**
     * ID of the subscription.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subscriptionId(): Optional<String> = subscriptionId.getOptional("subscriptionId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subscriptionName(): Optional<String> = subscriptionName.getOptional("subscriptionName")

    /**
     * Returns the raw JSON value of [officeLocationId].
     *
     * Unlike [officeLocationId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("officeLocationId")
    @ExcludeMissing
    fun _officeLocationId(): JsonField<String> = officeLocationId

    /**
     * Returns the raw JSON value of [preferencesGroupId].
     *
     * Unlike [preferencesGroupId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("preferencesGroupId")
    @ExcludeMissing
    fun _preferencesGroupId(): JsonField<String> = preferencesGroupId

    /**
     * Returns the raw JSON value of [subscriptionId].
     *
     * Unlike [subscriptionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subscriptionId")
    @ExcludeMissing
    fun _subscriptionId(): JsonField<String> = subscriptionId

    /**
     * Returns the raw JSON value of [subscriptionName].
     *
     * Unlike [subscriptionName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("subscriptionName")
    @ExcludeMissing
    fun _subscriptionName(): JsonField<String> = subscriptionName

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
         * [PublicEmailSubscriptionDetails].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicEmailSubscriptionDetails]. */
    class Builder internal constructor() {

        private var officeLocationId: JsonField<String> = JsonMissing.of()
        private var preferencesGroupId: JsonField<String> = JsonMissing.of()
        private var subscriptionId: JsonField<String> = JsonMissing.of()
        private var subscriptionName: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicEmailSubscriptionDetails: PublicEmailSubscriptionDetails) = apply {
            officeLocationId = publicEmailSubscriptionDetails.officeLocationId
            preferencesGroupId = publicEmailSubscriptionDetails.preferencesGroupId
            subscriptionId = publicEmailSubscriptionDetails.subscriptionId
            subscriptionName = publicEmailSubscriptionDetails.subscriptionName
            additionalProperties =
                publicEmailSubscriptionDetails.additionalProperties.toMutableMap()
        }

        /** ID of the selected office location. */
        fun officeLocationId(officeLocationId: String) =
            officeLocationId(JsonField.of(officeLocationId))

        /**
         * Sets [Builder.officeLocationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.officeLocationId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun officeLocationId(officeLocationId: JsonField<String>) = apply {
            this.officeLocationId = officeLocationId
        }

        fun preferencesGroupId(preferencesGroupId: String) =
            preferencesGroupId(JsonField.of(preferencesGroupId))

        /**
         * Sets [Builder.preferencesGroupId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.preferencesGroupId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun preferencesGroupId(preferencesGroupId: JsonField<String>) = apply {
            this.preferencesGroupId = preferencesGroupId
        }

        /** ID of the subscription. */
        fun subscriptionId(subscriptionId: String) = subscriptionId(JsonField.of(subscriptionId))

        /**
         * Sets [Builder.subscriptionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subscriptionId(subscriptionId: JsonField<String>) = apply {
            this.subscriptionId = subscriptionId
        }

        fun subscriptionName(subscriptionName: String) =
            subscriptionName(JsonField.of(subscriptionName))

        /**
         * Sets [Builder.subscriptionName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subscriptionName(subscriptionName: JsonField<String>) = apply {
            this.subscriptionName = subscriptionName
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
         * Returns an immutable instance of [PublicEmailSubscriptionDetails].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PublicEmailSubscriptionDetails =
            PublicEmailSubscriptionDetails(
                officeLocationId,
                preferencesGroupId,
                subscriptionId,
                subscriptionName,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicEmailSubscriptionDetails = apply {
        if (validated) {
            return@apply
        }

        officeLocationId()
        preferencesGroupId()
        subscriptionId()
        subscriptionName()
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
        (if (officeLocationId.asKnown().isPresent) 1 else 0) +
            (if (preferencesGroupId.asKnown().isPresent) 1 else 0) +
            (if (subscriptionId.asKnown().isPresent) 1 else 0) +
            (if (subscriptionName.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicEmailSubscriptionDetails &&
            officeLocationId == other.officeLocationId &&
            preferencesGroupId == other.preferencesGroupId &&
            subscriptionId == other.subscriptionId &&
            subscriptionName == other.subscriptionName &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            officeLocationId,
            preferencesGroupId,
            subscriptionId,
            subscriptionName,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicEmailSubscriptionDetails{officeLocationId=$officeLocationId, preferencesGroupId=$preferencesGroupId, subscriptionId=$subscriptionId, subscriptionName=$subscriptionName, additionalProperties=$additionalProperties}"
}
