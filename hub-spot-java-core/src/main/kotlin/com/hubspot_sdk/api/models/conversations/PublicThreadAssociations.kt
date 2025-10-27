// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class PublicThreadAssociations
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val associatedTicketId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("associatedTicketId")
        @ExcludeMissing
        associatedTicketId: JsonField<String> = JsonMissing.of()
    ) : this(associatedTicketId, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun associatedTicketId(): Optional<String> =
        associatedTicketId.getOptional("associatedTicketId")

    /**
     * Returns the raw JSON value of [associatedTicketId].
     *
     * Unlike [associatedTicketId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("associatedTicketId")
    @ExcludeMissing
    fun _associatedTicketId(): JsonField<String> = associatedTicketId

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

        /** Returns a mutable builder for constructing an instance of [PublicThreadAssociations]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicThreadAssociations]. */
    class Builder internal constructor() {

        private var associatedTicketId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicThreadAssociations: PublicThreadAssociations) = apply {
            associatedTicketId = publicThreadAssociations.associatedTicketId
            additionalProperties = publicThreadAssociations.additionalProperties.toMutableMap()
        }

        fun associatedTicketId(associatedTicketId: String) =
            associatedTicketId(JsonField.of(associatedTicketId))

        /**
         * Sets [Builder.associatedTicketId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.associatedTicketId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun associatedTicketId(associatedTicketId: JsonField<String>) = apply {
            this.associatedTicketId = associatedTicketId
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
         * Returns an immutable instance of [PublicThreadAssociations].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PublicThreadAssociations =
            PublicThreadAssociations(associatedTicketId, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): PublicThreadAssociations = apply {
        if (validated) {
            return@apply
        }

        associatedTicketId()
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
    internal fun validity(): Int = (if (associatedTicketId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicThreadAssociations &&
            associatedTicketId == other.associatedTicketId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(associatedTicketId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicThreadAssociations{associatedTicketId=$associatedTicketId, additionalProperties=$additionalProperties}"
}
