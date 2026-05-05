// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.marketingevents

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects

class MarketingEventPublicObjectIdDeleteRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val objectId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("objectId") @ExcludeMissing objectId: JsonField<String> = JsonMissing.of()
    ) : this(objectId, mutableMapOf())

    /**
     * The internal ID of the marketing event in HubSpot
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectId(): String = objectId.getRequired("objectId")

    /**
     * Returns the raw JSON value of [objectId].
     *
     * Unlike [objectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectId") @ExcludeMissing fun _objectId(): JsonField<String> = objectId

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
         * [MarketingEventPublicObjectIdDeleteRequest].
         *
         * The following fields are required:
         * ```java
         * .objectId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MarketingEventPublicObjectIdDeleteRequest]. */
    class Builder internal constructor() {

        private var objectId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            marketingEventPublicObjectIdDeleteRequest: MarketingEventPublicObjectIdDeleteRequest
        ) = apply {
            objectId = marketingEventPublicObjectIdDeleteRequest.objectId
            additionalProperties =
                marketingEventPublicObjectIdDeleteRequest.additionalProperties.toMutableMap()
        }

        /** The internal ID of the marketing event in HubSpot */
        fun objectId(objectId: String) = objectId(JsonField.of(objectId))

        /**
         * Sets [Builder.objectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun objectId(objectId: JsonField<String>) = apply { this.objectId = objectId }

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
         * Returns an immutable instance of [MarketingEventPublicObjectIdDeleteRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .objectId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MarketingEventPublicObjectIdDeleteRequest =
            MarketingEventPublicObjectIdDeleteRequest(
                checkRequired("objectId", objectId),
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
    fun validate(): MarketingEventPublicObjectIdDeleteRequest = apply {
        if (validated) {
            return@apply
        }

        objectId()
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
    @JvmSynthetic internal fun validity(): Int = (if (objectId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MarketingEventPublicObjectIdDeleteRequest &&
            objectId == other.objectId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(objectId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MarketingEventPublicObjectIdDeleteRequest{objectId=$objectId, additionalProperties=$additionalProperties}"
}
