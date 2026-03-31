// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.webhooks.webhooks

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ActionOverrideRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val associatedObjectTypeIds: JsonField<List<String>>,
    private val listIds: JsonField<List<Long>>,
    private val objectIds: JsonField<List<Long>>,
    private val properties: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("associatedObjectTypeIds")
        @ExcludeMissing
        associatedObjectTypeIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("listIds") @ExcludeMissing listIds: JsonField<List<Long>> = JsonMissing.of(),
        @JsonProperty("objectIds")
        @ExcludeMissing
        objectIds: JsonField<List<Long>> = JsonMissing.of(),
        @JsonProperty("properties")
        @ExcludeMissing
        properties: JsonField<List<String>> = JsonMissing.of(),
    ) : this(associatedObjectTypeIds, listIds, objectIds, properties, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun associatedObjectTypeIds(): Optional<List<String>> =
        associatedObjectTypeIds.getOptional("associatedObjectTypeIds")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun listIds(): Optional<List<Long>> = listIds.getOptional("listIds")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun objectIds(): Optional<List<Long>> = objectIds.getOptional("objectIds")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun properties(): Optional<List<String>> = properties.getOptional("properties")

    /**
     * Returns the raw JSON value of [associatedObjectTypeIds].
     *
     * Unlike [associatedObjectTypeIds], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("associatedObjectTypeIds")
    @ExcludeMissing
    fun _associatedObjectTypeIds(): JsonField<List<String>> = associatedObjectTypeIds

    /**
     * Returns the raw JSON value of [listIds].
     *
     * Unlike [listIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("listIds") @ExcludeMissing fun _listIds(): JsonField<List<Long>> = listIds

    /**
     * Returns the raw JSON value of [objectIds].
     *
     * Unlike [objectIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectIds") @ExcludeMissing fun _objectIds(): JsonField<List<Long>> = objectIds

    /**
     * Returns the raw JSON value of [properties].
     *
     * Unlike [properties], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("properties")
    @ExcludeMissing
    fun _properties(): JsonField<List<String>> = properties

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

        /** Returns a mutable builder for constructing an instance of [ActionOverrideRequest]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionOverrideRequest]. */
    class Builder internal constructor() {

        private var associatedObjectTypeIds: JsonField<MutableList<String>>? = null
        private var listIds: JsonField<MutableList<Long>>? = null
        private var objectIds: JsonField<MutableList<Long>>? = null
        private var properties: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(actionOverrideRequest: ActionOverrideRequest) = apply {
            associatedObjectTypeIds =
                actionOverrideRequest.associatedObjectTypeIds.map { it.toMutableList() }
            listIds = actionOverrideRequest.listIds.map { it.toMutableList() }
            objectIds = actionOverrideRequest.objectIds.map { it.toMutableList() }
            properties = actionOverrideRequest.properties.map { it.toMutableList() }
            additionalProperties = actionOverrideRequest.additionalProperties.toMutableMap()
        }

        fun associatedObjectTypeIds(associatedObjectTypeIds: List<String>) =
            associatedObjectTypeIds(JsonField.of(associatedObjectTypeIds))

        /**
         * Sets [Builder.associatedObjectTypeIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.associatedObjectTypeIds] with a well-typed
         * `List<String>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun associatedObjectTypeIds(associatedObjectTypeIds: JsonField<List<String>>) = apply {
            this.associatedObjectTypeIds = associatedObjectTypeIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [associatedObjectTypeIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAssociatedObjectTypeId(associatedObjectTypeId: String) = apply {
            associatedObjectTypeIds =
                (associatedObjectTypeIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("associatedObjectTypeIds", it).add(associatedObjectTypeId)
                }
        }

        fun listIds(listIds: List<Long>) = listIds(JsonField.of(listIds))

        /**
         * Sets [Builder.listIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.listIds] with a well-typed `List<Long>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun listIds(listIds: JsonField<List<Long>>) = apply {
            this.listIds = listIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [Long] to [listIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addListId(listId: Long) = apply {
            listIds =
                (listIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("listIds", it).add(listId)
                }
        }

        fun objectIds(objectIds: List<Long>) = objectIds(JsonField.of(objectIds))

        /**
         * Sets [Builder.objectIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectIds] with a well-typed `List<Long>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun objectIds(objectIds: JsonField<List<Long>>) = apply {
            this.objectIds = objectIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [Long] to [objectIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addObjectId(objectId: Long) = apply {
            objectIds =
                (objectIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("objectIds", it).add(objectId)
                }
        }

        fun properties(properties: List<String>) = properties(JsonField.of(properties))

        /**
         * Sets [Builder.properties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.properties] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun properties(properties: JsonField<List<String>>) = apply {
            this.properties = properties.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [properties].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProperty(property: String) = apply {
            properties =
                (properties ?: JsonField.of(mutableListOf())).also {
                    checkKnown("properties", it).add(property)
                }
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
         * Returns an immutable instance of [ActionOverrideRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ActionOverrideRequest =
            ActionOverrideRequest(
                (associatedObjectTypeIds ?: JsonMissing.of()).map { it.toImmutable() },
                (listIds ?: JsonMissing.of()).map { it.toImmutable() },
                (objectIds ?: JsonMissing.of()).map { it.toImmutable() },
                (properties ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ActionOverrideRequest = apply {
        if (validated) {
            return@apply
        }

        associatedObjectTypeIds()
        listIds()
        objectIds()
        properties()
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
        (associatedObjectTypeIds.asKnown().getOrNull()?.size ?: 0) +
            (listIds.asKnown().getOrNull()?.size ?: 0) +
            (objectIds.asKnown().getOrNull()?.size ?: 0) +
            (properties.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionOverrideRequest &&
            associatedObjectTypeIds == other.associatedObjectTypeIds &&
            listIds == other.listIds &&
            objectIds == other.objectIds &&
            properties == other.properties &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(associatedObjectTypeIds, listIds, objectIds, properties, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ActionOverrideRequest{associatedObjectTypeIds=$associatedObjectTypeIds, listIds=$listIds, objectIds=$objectIds, properties=$properties, additionalProperties=$additionalProperties}"
}
