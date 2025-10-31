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
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Contains an array of CRM object records to be processed in a batch operation, each defined by
 * their ID and properties.
 */
class SimplePublicObjectBatchInput
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
     * The id to be updated. This can be the object id, or the unique property value of the
     * idProperty property
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Key-value pairs representing the properties of the object.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun properties(): Properties = properties.getRequired("properties")

    /**
     * The name of a property whose values are unique for this object
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun idProperty(): Optional<String> = idProperty.getOptional("idProperty")

    /**
     * A unique identifier for tracing the request.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
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
         * Returns a mutable builder for constructing an instance of [SimplePublicObjectBatchInput].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .properties()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SimplePublicObjectBatchInput]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var properties: JsonField<Properties>? = null
        private var idProperty: JsonField<String> = JsonMissing.of()
        private var objectWriteTraceId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(simplePublicObjectBatchInput: SimplePublicObjectBatchInput) = apply {
            id = simplePublicObjectBatchInput.id
            properties = simplePublicObjectBatchInput.properties
            idProperty = simplePublicObjectBatchInput.idProperty
            objectWriteTraceId = simplePublicObjectBatchInput.objectWriteTraceId
            additionalProperties = simplePublicObjectBatchInput.additionalProperties.toMutableMap()
        }

        /**
         * The id to be updated. This can be the object id, or the unique property value of the
         * idProperty property
         */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Key-value pairs representing the properties of the object. */
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

        /** A unique identifier for tracing the request. */
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
         * Returns an immutable instance of [SimplePublicObjectBatchInput].
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
        fun build(): SimplePublicObjectBatchInput =
            SimplePublicObjectBatchInput(
                checkRequired("id", id),
                checkRequired("properties", properties),
                idProperty,
                objectWriteTraceId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SimplePublicObjectBatchInput = apply {
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (properties.asKnown().getOrNull()?.validity() ?: 0) +
            (if (idProperty.asKnown().isPresent) 1 else 0) +
            (if (objectWriteTraceId.asKnown().isPresent) 1 else 0)

    /** Key-value pairs representing the properties of the object. */
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
            } catch (e: HubspotInvalidDataException) {
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

        return other is SimplePublicObjectBatchInput &&
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
        "SimplePublicObjectBatchInput{id=$id, properties=$properties, idProperty=$idProperty, objectWriteTraceId=$objectWriteTraceId, additionalProperties=$additionalProperties}"
}
