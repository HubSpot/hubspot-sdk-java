// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.events.definitions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.core.ExcludeMissing
import com.hubspot.core.JsonField
import com.hubspot.core.JsonMissing
import com.hubspot.core.JsonValue
import com.hubspot.core.checkRequired
import com.hubspot.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects

class PropertyFilterContext
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val objectTypeId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("objectTypeId")
        @ExcludeMissing
        objectTypeId: JsonField<String> = JsonMissing.of()
    ) : this(objectTypeId, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectTypeId(): String = objectTypeId.getRequired("objectTypeId")

    /**
     * Returns the raw JSON value of [objectTypeId].
     *
     * Unlike [objectTypeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectTypeId")
    @ExcludeMissing
    fun _objectTypeId(): JsonField<String> = objectTypeId

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
         * Returns a mutable builder for constructing an instance of [PropertyFilterContext].
         *
         * The following fields are required:
         * ```java
         * .objectTypeId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PropertyFilterContext]. */
    class Builder internal constructor() {

        private var objectTypeId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(propertyFilterContext: PropertyFilterContext) = apply {
            objectTypeId = propertyFilterContext.objectTypeId
            additionalProperties = propertyFilterContext.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [PropertyFilterContext].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .objectTypeId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PropertyFilterContext =
            PropertyFilterContext(
                checkRequired("objectTypeId", objectTypeId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PropertyFilterContext = apply {
        if (validated) {
            return@apply
        }

        objectTypeId()
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
    @JvmSynthetic internal fun validity(): Int = (if (objectTypeId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PropertyFilterContext &&
            objectTypeId == other.objectTypeId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(objectTypeId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PropertyFilterContext{objectTypeId=$objectTypeId, additionalProperties=$additionalProperties}"
}
