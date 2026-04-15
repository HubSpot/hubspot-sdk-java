// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.webhooks

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
import kotlin.jvm.optionals.getOrNull

class CrmObjectSnapshotRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val objectId: JsonField<Int>,
    private val objectTypeId: JsonField<String>,
    private val portalId: JsonField<Int>,
    private val properties: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("objectId") @ExcludeMissing objectId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("objectTypeId")
        @ExcludeMissing
        objectTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("portalId") @ExcludeMissing portalId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("properties")
        @ExcludeMissing
        properties: JsonField<List<String>> = JsonMissing.of(),
    ) : this(objectId, objectTypeId, portalId, properties, mutableMapOf())

    /**
     * An integer representing the unique identifier of the CRM object for which the snapshot is
     * being requested.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectId(): Int = objectId.getRequired("objectId")

    /**
     * A string representing the type identifier of the CRM object.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectTypeId(): String = objectTypeId.getRequired("objectTypeId")

    /**
     * An integer representing the unique identifier of the HubSpot portal.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun portalId(): Int = portalId.getRequired("portalId")

    /**
     * An array of strings, each representing a property of the CRM object to be included in the
     * snapshot.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun properties(): List<String> = properties.getRequired("properties")

    /**
     * Returns the raw JSON value of [objectId].
     *
     * Unlike [objectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectId") @ExcludeMissing fun _objectId(): JsonField<Int> = objectId

    /**
     * Returns the raw JSON value of [objectTypeId].
     *
     * Unlike [objectTypeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectTypeId")
    @ExcludeMissing
    fun _objectTypeId(): JsonField<String> = objectTypeId

    /**
     * Returns the raw JSON value of [portalId].
     *
     * Unlike [portalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("portalId") @ExcludeMissing fun _portalId(): JsonField<Int> = portalId

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

        /**
         * Returns a mutable builder for constructing an instance of [CrmObjectSnapshotRequest].
         *
         * The following fields are required:
         * ```java
         * .objectId()
         * .objectTypeId()
         * .portalId()
         * .properties()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CrmObjectSnapshotRequest]. */
    class Builder internal constructor() {

        private var objectId: JsonField<Int>? = null
        private var objectTypeId: JsonField<String>? = null
        private var portalId: JsonField<Int>? = null
        private var properties: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(crmObjectSnapshotRequest: CrmObjectSnapshotRequest) = apply {
            objectId = crmObjectSnapshotRequest.objectId
            objectTypeId = crmObjectSnapshotRequest.objectTypeId
            portalId = crmObjectSnapshotRequest.portalId
            properties = crmObjectSnapshotRequest.properties.map { it.toMutableList() }
            additionalProperties = crmObjectSnapshotRequest.additionalProperties.toMutableMap()
        }

        /**
         * An integer representing the unique identifier of the CRM object for which the snapshot is
         * being requested.
         */
        fun objectId(objectId: Int) = objectId(JsonField.of(objectId))

        /**
         * Sets [Builder.objectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun objectId(objectId: JsonField<Int>) = apply { this.objectId = objectId }

        /** A string representing the type identifier of the CRM object. */
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

        /** An integer representing the unique identifier of the HubSpot portal. */
        fun portalId(portalId: Int) = portalId(JsonField.of(portalId))

        /**
         * Sets [Builder.portalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.portalId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun portalId(portalId: JsonField<Int>) = apply { this.portalId = portalId }

        /**
         * An array of strings, each representing a property of the CRM object to be included in the
         * snapshot.
         */
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
         * Returns an immutable instance of [CrmObjectSnapshotRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .objectId()
         * .objectTypeId()
         * .portalId()
         * .properties()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CrmObjectSnapshotRequest =
            CrmObjectSnapshotRequest(
                checkRequired("objectId", objectId),
                checkRequired("objectTypeId", objectTypeId),
                checkRequired("portalId", portalId),
                checkRequired("properties", properties).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CrmObjectSnapshotRequest = apply {
        if (validated) {
            return@apply
        }

        objectId()
        objectTypeId()
        portalId()
        properties()
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
        (if (objectId.asKnown().isPresent) 1 else 0) +
            (if (objectTypeId.asKnown().isPresent) 1 else 0) +
            (if (portalId.asKnown().isPresent) 1 else 0) +
            (properties.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CrmObjectSnapshotRequest &&
            objectId == other.objectId &&
            objectTypeId == other.objectTypeId &&
            portalId == other.portalId &&
            properties == other.properties &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(objectId, objectTypeId, portalId, properties, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CrmObjectSnapshotRequest{objectId=$objectId, objectTypeId=$objectTypeId, portalId=$portalId, properties=$properties, additionalProperties=$additionalProperties}"
}
