// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkKnown
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.toImmutable
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ObjectDefinitionResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val objectTypeId: JsonField<String>,
    private val objectTypeName: JsonField<String>,
    private val properties: JsonField<List<PropertyDefinition>>,
    private val propertyGroups: JsonField<List<GroupView>>,
    private val schema: JsonField<InboundDbObjectType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("objectTypeId")
        @ExcludeMissing
        objectTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("objectTypeName")
        @ExcludeMissing
        objectTypeName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("properties")
        @ExcludeMissing
        properties: JsonField<List<PropertyDefinition>> = JsonMissing.of(),
        @JsonProperty("propertyGroups")
        @ExcludeMissing
        propertyGroups: JsonField<List<GroupView>> = JsonMissing.of(),
        @JsonProperty("schema")
        @ExcludeMissing
        schema: JsonField<InboundDbObjectType> = JsonMissing.of(),
    ) : this(objectTypeId, objectTypeName, properties, propertyGroups, schema, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectTypeId(): String = objectTypeId.getRequired("objectTypeId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectTypeName(): String = objectTypeName.getRequired("objectTypeName")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun properties(): List<PropertyDefinition> = properties.getRequired("properties")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun propertyGroups(): List<GroupView> = propertyGroups.getRequired("propertyGroups")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun schema(): Optional<InboundDbObjectType> = schema.getOptional("schema")

    /**
     * Returns the raw JSON value of [objectTypeId].
     *
     * Unlike [objectTypeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectTypeId")
    @ExcludeMissing
    fun _objectTypeId(): JsonField<String> = objectTypeId

    /**
     * Returns the raw JSON value of [objectTypeName].
     *
     * Unlike [objectTypeName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectTypeName")
    @ExcludeMissing
    fun _objectTypeName(): JsonField<String> = objectTypeName

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
    fun _propertyGroups(): JsonField<List<GroupView>> = propertyGroups

    /**
     * Returns the raw JSON value of [schema].
     *
     * Unlike [schema], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("schema") @ExcludeMissing fun _schema(): JsonField<InboundDbObjectType> = schema

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
         * Returns a mutable builder for constructing an instance of [ObjectDefinitionResponse].
         *
         * The following fields are required:
         * ```java
         * .objectTypeId()
         * .objectTypeName()
         * .properties()
         * .propertyGroups()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ObjectDefinitionResponse]. */
    class Builder internal constructor() {

        private var objectTypeId: JsonField<String>? = null
        private var objectTypeName: JsonField<String>? = null
        private var properties: JsonField<MutableList<PropertyDefinition>>? = null
        private var propertyGroups: JsonField<MutableList<GroupView>>? = null
        private var schema: JsonField<InboundDbObjectType> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(objectDefinitionResponse: ObjectDefinitionResponse) = apply {
            objectTypeId = objectDefinitionResponse.objectTypeId
            objectTypeName = objectDefinitionResponse.objectTypeName
            properties = objectDefinitionResponse.properties.map { it.toMutableList() }
            propertyGroups = objectDefinitionResponse.propertyGroups.map { it.toMutableList() }
            schema = objectDefinitionResponse.schema
            additionalProperties = objectDefinitionResponse.additionalProperties.toMutableMap()
        }

        fun objectTypeId(objectTypeId: String) = objectTypeId(JsonField.of(objectTypeId))

        /**
         * Sets [Builder.objectTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectTypeId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun objectTypeId(objectTypeId: JsonField<String>) = apply {
            this.objectTypeId = objectTypeId
        }

        fun objectTypeName(objectTypeName: String) = objectTypeName(JsonField.of(objectTypeName))

        /**
         * Sets [Builder.objectTypeName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectTypeName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun objectTypeName(objectTypeName: JsonField<String>) = apply {
            this.objectTypeName = objectTypeName
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

        fun propertyGroups(propertyGroups: List<GroupView>) =
            propertyGroups(JsonField.of(propertyGroups))

        /**
         * Sets [Builder.propertyGroups] to an arbitrary JSON value.
         *
         * You should usually call [Builder.propertyGroups] with a well-typed `List<GroupView>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun propertyGroups(propertyGroups: JsonField<List<GroupView>>) = apply {
            this.propertyGroups = propertyGroups.map { it.toMutableList() }
        }

        /**
         * Adds a single [GroupView] to [propertyGroups].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPropertyGroup(propertyGroup: GroupView) = apply {
            propertyGroups =
                (propertyGroups ?: JsonField.of(mutableListOf())).also {
                    checkKnown("propertyGroups", it).add(propertyGroup)
                }
        }

        fun schema(schema: InboundDbObjectType) = schema(JsonField.of(schema))

        /**
         * Sets [Builder.schema] to an arbitrary JSON value.
         *
         * You should usually call [Builder.schema] with a well-typed [InboundDbObjectType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun schema(schema: JsonField<InboundDbObjectType>) = apply { this.schema = schema }

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
         * Returns an immutable instance of [ObjectDefinitionResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .objectTypeId()
         * .objectTypeName()
         * .properties()
         * .propertyGroups()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ObjectDefinitionResponse =
            ObjectDefinitionResponse(
                checkRequired("objectTypeId", objectTypeId),
                checkRequired("objectTypeName", objectTypeName),
                checkRequired("properties", properties).map { it.toImmutable() },
                checkRequired("propertyGroups", propertyGroups).map { it.toImmutable() },
                schema,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ObjectDefinitionResponse = apply {
        if (validated) {
            return@apply
        }

        objectTypeId()
        objectTypeName()
        properties().forEach { it.validate() }
        propertyGroups().forEach { it.validate() }
        schema().ifPresent { it.validate() }
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
        (if (objectTypeId.asKnown().isPresent) 1 else 0) +
            (if (objectTypeName.asKnown().isPresent) 1 else 0) +
            (properties.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (propertyGroups.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (schema.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ObjectDefinitionResponse &&
            objectTypeId == other.objectTypeId &&
            objectTypeName == other.objectTypeName &&
            properties == other.properties &&
            propertyGroups == other.propertyGroups &&
            schema == other.schema &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            objectTypeId,
            objectTypeName,
            properties,
            propertyGroups,
            schema,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ObjectDefinitionResponse{objectTypeId=$objectTypeId, objectTypeName=$objectTypeName, properties=$properties, propertyGroups=$propertyGroups, schema=$schema, additionalProperties=$additionalProperties}"
}
