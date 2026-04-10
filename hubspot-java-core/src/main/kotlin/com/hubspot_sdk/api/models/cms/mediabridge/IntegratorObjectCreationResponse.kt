// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

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
import kotlin.jvm.optionals.getOrNull

class IntegratorObjectCreationResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val objectType: JsonField<InboundDbObjectType>,
    private val properties: JsonField<List<PropertyDefinition>>,
    private val propertyGroups: JsonField<List<Group>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("objectType")
        @ExcludeMissing
        objectType: JsonField<InboundDbObjectType> = JsonMissing.of(),
        @JsonProperty("properties")
        @ExcludeMissing
        properties: JsonField<List<PropertyDefinition>> = JsonMissing.of(),
        @JsonProperty("propertyGroups")
        @ExcludeMissing
        propertyGroups: JsonField<List<Group>> = JsonMissing.of(),
    ) : this(objectType, properties, propertyGroups, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectType(): InboundDbObjectType = objectType.getRequired("objectType")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun properties(): List<PropertyDefinition> = properties.getRequired("properties")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun propertyGroups(): List<Group> = propertyGroups.getRequired("propertyGroups")

    /**
     * Returns the raw JSON value of [objectType].
     *
     * Unlike [objectType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectType")
    @ExcludeMissing
    fun _objectType(): JsonField<InboundDbObjectType> = objectType

    /**
     * Returns the raw JSON value of [properties].
     *
     * Unlike [properties], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("properties")
    @ExcludeMissing
    fun _properties(): JsonField<List<PropertyDefinition>> = properties

    /**
     * Returns the raw JSON value of [propertyGroups].
     *
     * Unlike [propertyGroups], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("propertyGroups")
    @ExcludeMissing
    fun _propertyGroups(): JsonField<List<Group>> = propertyGroups

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
         * [IntegratorObjectCreationResponse].
         *
         * The following fields are required:
         * ```java
         * .objectType()
         * .properties()
         * .propertyGroups()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IntegratorObjectCreationResponse]. */
    class Builder internal constructor() {

        private var objectType: JsonField<InboundDbObjectType>? = null
        private var properties: JsonField<MutableList<PropertyDefinition>>? = null
        private var propertyGroups: JsonField<MutableList<Group>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(integratorObjectCreationResponse: IntegratorObjectCreationResponse) =
            apply {
                objectType = integratorObjectCreationResponse.objectType
                properties = integratorObjectCreationResponse.properties.map { it.toMutableList() }
                propertyGroups =
                    integratorObjectCreationResponse.propertyGroups.map { it.toMutableList() }
                additionalProperties =
                    integratorObjectCreationResponse.additionalProperties.toMutableMap()
            }

        fun objectType(objectType: InboundDbObjectType) = objectType(JsonField.of(objectType))

        /**
         * Sets [Builder.objectType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectType] with a well-typed [InboundDbObjectType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun objectType(objectType: JsonField<InboundDbObjectType>) = apply {
            this.objectType = objectType
        }

        fun properties(properties: List<PropertyDefinition>) = properties(JsonField.of(properties))

        /**
         * Sets [Builder.properties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.properties] with a well-typed `List<PropertyDefinition>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun properties(properties: JsonField<List<PropertyDefinition>>) = apply {
            this.properties = properties.map { it.toMutableList() }
        }

        /**
         * Adds a single [PropertyDefinition] to [properties].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProperty(property: PropertyDefinition) = apply {
            properties =
                (properties ?: JsonField.of(mutableListOf())).also {
                    checkKnown("properties", it).add(property)
                }
        }

        fun propertyGroups(propertyGroups: List<Group>) =
            propertyGroups(JsonField.of(propertyGroups))

        /**
         * Sets [Builder.propertyGroups] to an arbitrary JSON value.
         *
         * You should usually call [Builder.propertyGroups] with a well-typed `List<Group>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun propertyGroups(propertyGroups: JsonField<List<Group>>) = apply {
            this.propertyGroups = propertyGroups.map { it.toMutableList() }
        }

        /**
         * Adds a single [Group] to [propertyGroups].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPropertyGroup(propertyGroup: Group) = apply {
            propertyGroups =
                (propertyGroups ?: JsonField.of(mutableListOf())).also {
                    checkKnown("propertyGroups", it).add(propertyGroup)
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
         * Returns an immutable instance of [IntegratorObjectCreationResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .objectType()
         * .properties()
         * .propertyGroups()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IntegratorObjectCreationResponse =
            IntegratorObjectCreationResponse(
                checkRequired("objectType", objectType),
                checkRequired("properties", properties).map { it.toImmutable() },
                checkRequired("propertyGroups", propertyGroups).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): IntegratorObjectCreationResponse = apply {
        if (validated) {
            return@apply
        }

        objectType().validate()
        properties().forEach { it.validate() }
        propertyGroups().forEach { it.validate() }
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
        (objectType.asKnown().getOrNull()?.validity() ?: 0) +
            (properties.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (propertyGroups.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IntegratorObjectCreationResponse &&
            objectType == other.objectType &&
            properties == other.properties &&
            propertyGroups == other.propertyGroups &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(objectType, properties, propertyGroups, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IntegratorObjectCreationResponse{objectType=$objectType, properties=$properties, propertyGroups=$propertyGroups, additionalProperties=$additionalProperties}"
}
