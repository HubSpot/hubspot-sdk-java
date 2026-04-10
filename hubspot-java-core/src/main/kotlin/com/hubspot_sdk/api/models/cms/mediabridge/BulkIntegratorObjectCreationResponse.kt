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
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class BulkIntegratorObjectCreationResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val createdObjects: JsonField<CreatedObjects>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("createdObjects")
        @ExcludeMissing
        createdObjects: JsonField<CreatedObjects> = JsonMissing.of()
    ) : this(createdObjects, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdObjects(): CreatedObjects = createdObjects.getRequired("createdObjects")

    /**
     * Returns the raw JSON value of [createdObjects].
     *
     * Unlike [createdObjects], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdObjects")
    @ExcludeMissing
    fun _createdObjects(): JsonField<CreatedObjects> = createdObjects

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
         * [BulkIntegratorObjectCreationResponse].
         *
         * The following fields are required:
         * ```java
         * .createdObjects()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BulkIntegratorObjectCreationResponse]. */
    class Builder internal constructor() {

        private var createdObjects: JsonField<CreatedObjects>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            bulkIntegratorObjectCreationResponse: BulkIntegratorObjectCreationResponse
        ) = apply {
            createdObjects = bulkIntegratorObjectCreationResponse.createdObjects
            additionalProperties =
                bulkIntegratorObjectCreationResponse.additionalProperties.toMutableMap()
        }

        fun createdObjects(createdObjects: CreatedObjects) =
            createdObjects(JsonField.of(createdObjects))

        /**
         * Sets [Builder.createdObjects] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdObjects] with a well-typed [CreatedObjects] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdObjects(createdObjects: JsonField<CreatedObjects>) = apply {
            this.createdObjects = createdObjects
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
         * Returns an immutable instance of [BulkIntegratorObjectCreationResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .createdObjects()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BulkIntegratorObjectCreationResponse =
            BulkIntegratorObjectCreationResponse(
                checkRequired("createdObjects", createdObjects),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BulkIntegratorObjectCreationResponse = apply {
        if (validated) {
            return@apply
        }

        createdObjects().validate()
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
    internal fun validity(): Int = (createdObjects.asKnown().getOrNull()?.validity() ?: 0)

    class CreatedObjects
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

            /** Returns a mutable builder for constructing an instance of [CreatedObjects]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CreatedObjects]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(createdObjects: CreatedObjects) = apply {
                additionalProperties = createdObjects.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [CreatedObjects].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CreatedObjects = CreatedObjects(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): CreatedObjects = apply {
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

            return other is CreatedObjects && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "CreatedObjects{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BulkIntegratorObjectCreationResponse &&
            createdObjects == other.createdObjects &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(createdObjects, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BulkIntegratorObjectCreationResponse{createdObjects=$createdObjects, additionalProperties=$additionalProperties}"
}
