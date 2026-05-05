// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

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

class ListMoveRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val listId: JsonField<String>,
    private val newFolderId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("listId") @ExcludeMissing listId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("newFolderId")
        @ExcludeMissing
        newFolderId: JsonField<String> = JsonMissing.of(),
    ) : this(listId, newFolderId, mutableMapOf())

    /**
     * The Id of the list to move.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun listId(): String = listId.getRequired("listId")

    /**
     * The Id of folder to move the list to, the root folder is Id 0.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun newFolderId(): String = newFolderId.getRequired("newFolderId")

    /**
     * Returns the raw JSON value of [listId].
     *
     * Unlike [listId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("listId") @ExcludeMissing fun _listId(): JsonField<String> = listId

    /**
     * Returns the raw JSON value of [newFolderId].
     *
     * Unlike [newFolderId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("newFolderId") @ExcludeMissing fun _newFolderId(): JsonField<String> = newFolderId

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
         * Returns a mutable builder for constructing an instance of [ListMoveRequest].
         *
         * The following fields are required:
         * ```java
         * .listId()
         * .newFolderId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ListMoveRequest]. */
    class Builder internal constructor() {

        private var listId: JsonField<String>? = null
        private var newFolderId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(listMoveRequest: ListMoveRequest) = apply {
            listId = listMoveRequest.listId
            newFolderId = listMoveRequest.newFolderId
            additionalProperties = listMoveRequest.additionalProperties.toMutableMap()
        }

        /** The Id of the list to move. */
        fun listId(listId: String) = listId(JsonField.of(listId))

        /**
         * Sets [Builder.listId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.listId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun listId(listId: JsonField<String>) = apply { this.listId = listId }

        /** The Id of folder to move the list to, the root folder is Id 0. */
        fun newFolderId(newFolderId: String) = newFolderId(JsonField.of(newFolderId))

        /**
         * Sets [Builder.newFolderId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.newFolderId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun newFolderId(newFolderId: JsonField<String>) = apply { this.newFolderId = newFolderId }

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
         * Returns an immutable instance of [ListMoveRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .listId()
         * .newFolderId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ListMoveRequest =
            ListMoveRequest(
                checkRequired("listId", listId),
                checkRequired("newFolderId", newFolderId),
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
    fun validate(): ListMoveRequest = apply {
        if (validated) {
            return@apply
        }

        listId()
        newFolderId()
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
        (if (listId.asKnown().isPresent) 1 else 0) + (if (newFolderId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ListMoveRequest &&
            listId == other.listId &&
            newFolderId == other.newFolderId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(listId, newFolderId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ListMoveRequest{listId=$listId, newFolderId=$newFolderId, additionalProperties=$additionalProperties}"
}
