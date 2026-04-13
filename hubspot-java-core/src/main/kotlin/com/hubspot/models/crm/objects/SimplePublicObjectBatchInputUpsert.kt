// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.objects

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.core.ExcludeMissing
import com.hubspot.core.JsonField
import com.hubspot.core.JsonMissing
import com.hubspot.core.JsonValue
import com.hubspot.core.checkRequired
import com.hubspot.core.toImmutable
import com.hubspot.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Represents an object used in batch upsert operations, containing an object’s unique identifier,
 * its properties, and optionally the unique property name and a write trace ID.
 */
class SimplePublicObjectBatchInputUpsert
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val properties: JsonField<Properties>,
    private val idProperty: JsonField<String>,
    private val objectWriteTraceId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("properties")
        @ExcludeMissing
        properties: JsonField<Properties> = JsonMissing.of(),
        @JsonProperty("idProperty")
        @ExcludeMissing
        idProperty: JsonField<String> = JsonMissing.of(),
        @JsonProperty("objectWriteTraceId")
        @ExcludeMissing
        objectWriteTraceId: JsonField<String> = JsonMissing.of(),
    ) : this(id, properties, idProperty, objectWriteTraceId, mutableMapOf())

    /**
     * The unique ID of the object.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Key value pairs representing the properties of the object.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun properties(): Properties = properties.getRequired("properties")

    /**
     * The name of a property whose values are unique for this object
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun idProperty(): Optional<String> = idProperty.getOptional("idProperty")

    /**
     * An identifier for tracing the creation request.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun objectWriteTraceId(): Optional<String> =
        objectWriteTraceId.getOptional("objectWriteTraceId")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [properties].
     *
     * Unlike [properties], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("properties")
    @ExcludeMissing
    fun _properties(): JsonField<Properties> = properties

    /**
     * Returns the raw JSON value of [idProperty].
     *
     * Unlike [idProperty], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idProperty") @ExcludeMissing fun _idProperty(): JsonField<String> = idProperty

    /**
     * Returns the raw JSON value of [objectWriteTraceId].
     *
     * Unlike [objectWriteTraceId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("objectWriteTraceId")
    @ExcludeMissing
    fun _objectWriteTraceId(): JsonField<String> = objectWriteTraceId

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
         * [SimplePublicObjectBatchInputUpsert].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .properties()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SimplePublicObjectBatchInputUpsert]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var properties: JsonField<Properties>? = null
        private var idProperty: JsonField<String> = JsonMissing.of()
        private var objectWriteTraceId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(simplePublicObjectBatchInputUpsert: SimplePublicObjectBatchInputUpsert) =
            apply {
                id = simplePublicObjectBatchInputUpsert.id
                properties = simplePublicObjectBatchInputUpsert.properties
                idProperty = simplePublicObjectBatchInputUpsert.idProperty
                objectWriteTraceId = simplePublicObjectBatchInputUpsert.objectWriteTraceId
                additionalProperties =
                    simplePublicObjectBatchInputUpsert.additionalProperties.toMutableMap()
            }

        /** The unique ID of the object. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Key value pairs representing the properties of the object. */
        fun properties(properties: Properties) = properties(JsonField.of(properties))

        /**
         * Sets [Builder.properties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.properties] with a well-typed [Properties] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun properties(properties: JsonField<Properties>) = apply { this.properties = properties }

        /** The name of a property whose values are unique for this object */
        fun idProperty(idProperty: String) = idProperty(JsonField.of(idProperty))

        /**
         * Sets [Builder.idProperty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idProperty] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idProperty(idProperty: JsonField<String>) = apply { this.idProperty = idProperty }

        /** An identifier for tracing the creation request. */
        fun objectWriteTraceId(objectWriteTraceId: String) =
            objectWriteTraceId(JsonField.of(objectWriteTraceId))

        /**
         * Sets [Builder.objectWriteTraceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectWriteTraceId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun objectWriteTraceId(objectWriteTraceId: JsonField<String>) = apply {
            this.objectWriteTraceId = objectWriteTraceId
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
         * Returns an immutable instance of [SimplePublicObjectBatchInputUpsert].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .properties()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SimplePublicObjectBatchInputUpsert =
            SimplePublicObjectBatchInputUpsert(
                checkRequired("id", id),
                checkRequired("properties", properties),
                idProperty,
                objectWriteTraceId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SimplePublicObjectBatchInputUpsert = apply {
        if (validated) {
            return@apply
        }

        id()
        properties().validate()
        idProperty()
        objectWriteTraceId()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (properties.asKnown().getOrNull()?.validity() ?: 0) +
            (if (idProperty.asKnown().isPresent) 1 else 0) +
            (if (objectWriteTraceId.asKnown().isPresent) 1 else 0)

    /** Key value pairs representing the properties of the object. */
    class Properties
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Properties]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Properties]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(properties: Properties) = apply {
                additionalProperties = properties.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Properties].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Properties = Properties(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Properties = apply {
            if (validated) {
                return@apply
            }

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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Properties && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Properties{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SimplePublicObjectBatchInputUpsert &&
            id == other.id &&
            properties == other.properties &&
            idProperty == other.idProperty &&
            objectWriteTraceId == other.objectWriteTraceId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, properties, idProperty, objectWriteTraceId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SimplePublicObjectBatchInputUpsert{id=$id, properties=$properties, idProperty=$idProperty, objectWriteTraceId=$objectWriteTraceId, additionalProperties=$additionalProperties}"
}
