// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CreatedResponseSimplePublicObject
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val createdResourceId: JsonField<String>,
    private val entity: JsonField<SimplePublicObject>,
    private val location: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("createdResourceId")
        @ExcludeMissing
        createdResourceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("entity")
        @ExcludeMissing
        entity: JsonField<SimplePublicObject> = JsonMissing.of(),
        @JsonProperty("location") @ExcludeMissing location: JsonField<String> = JsonMissing.of(),
    ) : this(createdResourceId, entity, location, mutableMapOf())

    /**
     * The unique identifier of the newly created resource.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdResourceId(): String = createdResourceId.getRequired("createdResourceId")

    /**
     * A simple public object.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun entity(): SimplePublicObject = entity.getRequired("entity")

    /**
     * The URL location of the newly created resource.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun location(): Optional<String> = location.getOptional("location")

    /**
     * Returns the raw JSON value of [createdResourceId].
     *
     * Unlike [createdResourceId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("createdResourceId")
    @ExcludeMissing
    fun _createdResourceId(): JsonField<String> = createdResourceId

    /**
     * Returns the raw JSON value of [entity].
     *
     * Unlike [entity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entity") @ExcludeMissing fun _entity(): JsonField<SimplePublicObject> = entity

    /**
     * Returns the raw JSON value of [location].
     *
     * Unlike [location], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("location") @ExcludeMissing fun _location(): JsonField<String> = location

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
         * [CreatedResponseSimplePublicObject].
         *
         * The following fields are required:
         * ```java
         * .createdResourceId()
         * .entity()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CreatedResponseSimplePublicObject]. */
    class Builder internal constructor() {

        private var createdResourceId: JsonField<String>? = null
        private var entity: JsonField<SimplePublicObject>? = null
        private var location: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(createdResponseSimplePublicObject: CreatedResponseSimplePublicObject) =
            apply {
                createdResourceId = createdResponseSimplePublicObject.createdResourceId
                entity = createdResponseSimplePublicObject.entity
                location = createdResponseSimplePublicObject.location
                additionalProperties =
                    createdResponseSimplePublicObject.additionalProperties.toMutableMap()
            }

        /** The unique identifier of the newly created resource. */
        fun createdResourceId(createdResourceId: String) =
            createdResourceId(JsonField.of(createdResourceId))

        /**
         * Sets [Builder.createdResourceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdResourceId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdResourceId(createdResourceId: JsonField<String>) = apply {
            this.createdResourceId = createdResourceId
        }

        /** A simple public object. */
        fun entity(entity: SimplePublicObject) = entity(JsonField.of(entity))

        /**
         * Sets [Builder.entity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entity] with a well-typed [SimplePublicObject] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun entity(entity: JsonField<SimplePublicObject>) = apply { this.entity = entity }

        /** The URL location of the newly created resource. */
        fun location(location: String) = location(JsonField.of(location))

        /**
         * Sets [Builder.location] to an arbitrary JSON value.
         *
         * You should usually call [Builder.location] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun location(location: JsonField<String>) = apply { this.location = location }

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
         * Returns an immutable instance of [CreatedResponseSimplePublicObject].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .createdResourceId()
         * .entity()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CreatedResponseSimplePublicObject =
            CreatedResponseSimplePublicObject(
                checkRequired("createdResourceId", createdResourceId),
                checkRequired("entity", entity),
                location,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CreatedResponseSimplePublicObject = apply {
        if (validated) {
            return@apply
        }

        createdResourceId()
        entity().validate()
        location()
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
        (if (createdResourceId.asKnown().isPresent) 1 else 0) +
            (entity.asKnown().getOrNull()?.validity() ?: 0) +
            (if (location.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreatedResponseSimplePublicObject &&
            createdResourceId == other.createdResourceId &&
            entity == other.entity &&
            location == other.location &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(createdResourceId, entity, location, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CreatedResponseSimplePublicObject{createdResourceId=$createdResourceId, entity=$entity, location=$location, additionalProperties=$additionalProperties}"
}
