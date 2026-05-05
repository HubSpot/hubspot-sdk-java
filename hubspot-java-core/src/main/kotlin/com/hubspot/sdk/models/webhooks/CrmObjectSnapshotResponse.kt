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
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects

class CrmObjectSnapshotResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val objectId: JsonField<Long>,
    private val objectTypeId: JsonField<String>,
    private val portalId: JsonField<Long>,
    private val snapshotStatusId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("objectId") @ExcludeMissing objectId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("objectTypeId")
        @ExcludeMissing
        objectTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("portalId") @ExcludeMissing portalId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("snapshotStatusId")
        @ExcludeMissing
        snapshotStatusId: JsonField<String> = JsonMissing.of(),
    ) : this(objectId, objectTypeId, portalId, snapshotStatusId, mutableMapOf())

    /**
     * An integer representing the unique identifier of the CRM object for which the snapshot is
     * taken.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectId(): Long = objectId.getRequired("objectId")

    /**
     * A string indicating the type of the CRM object, such as contact, company, or deal.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectTypeId(): String = objectTypeId.getRequired("objectTypeId")

    /**
     * An integer representing the unique identifier of the HubSpot portal associated with the CRM
     * object.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun portalId(): Long = portalId.getRequired("portalId")

    /**
     * A UUID string representing the status identifier of the snapshot request, indicating the
     * current state of the snapshot process.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun snapshotStatusId(): String = snapshotStatusId.getRequired("snapshotStatusId")

    /**
     * Returns the raw JSON value of [objectId].
     *
     * Unlike [objectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectId") @ExcludeMissing fun _objectId(): JsonField<Long> = objectId

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
    @JsonProperty("portalId") @ExcludeMissing fun _portalId(): JsonField<Long> = portalId

    /**
     * Returns the raw JSON value of [snapshotStatusId].
     *
     * Unlike [snapshotStatusId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("snapshotStatusId")
    @ExcludeMissing
    fun _snapshotStatusId(): JsonField<String> = snapshotStatusId

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
         * Returns a mutable builder for constructing an instance of [CrmObjectSnapshotResponse].
         *
         * The following fields are required:
         * ```java
         * .objectId()
         * .objectTypeId()
         * .portalId()
         * .snapshotStatusId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CrmObjectSnapshotResponse]. */
    class Builder internal constructor() {

        private var objectId: JsonField<Long>? = null
        private var objectTypeId: JsonField<String>? = null
        private var portalId: JsonField<Long>? = null
        private var snapshotStatusId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(crmObjectSnapshotResponse: CrmObjectSnapshotResponse) = apply {
            objectId = crmObjectSnapshotResponse.objectId
            objectTypeId = crmObjectSnapshotResponse.objectTypeId
            portalId = crmObjectSnapshotResponse.portalId
            snapshotStatusId = crmObjectSnapshotResponse.snapshotStatusId
            additionalProperties = crmObjectSnapshotResponse.additionalProperties.toMutableMap()
        }

        /**
         * An integer representing the unique identifier of the CRM object for which the snapshot is
         * taken.
         */
        fun objectId(objectId: Long) = objectId(JsonField.of(objectId))

        /**
         * Sets [Builder.objectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun objectId(objectId: JsonField<Long>) = apply { this.objectId = objectId }

        /** A string indicating the type of the CRM object, such as contact, company, or deal. */
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

        /**
         * An integer representing the unique identifier of the HubSpot portal associated with the
         * CRM object.
         */
        fun portalId(portalId: Long) = portalId(JsonField.of(portalId))

        /**
         * Sets [Builder.portalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.portalId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun portalId(portalId: JsonField<Long>) = apply { this.portalId = portalId }

        /**
         * A UUID string representing the status identifier of the snapshot request, indicating the
         * current state of the snapshot process.
         */
        fun snapshotStatusId(snapshotStatusId: String) =
            snapshotStatusId(JsonField.of(snapshotStatusId))

        /**
         * Sets [Builder.snapshotStatusId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.snapshotStatusId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun snapshotStatusId(snapshotStatusId: JsonField<String>) = apply {
            this.snapshotStatusId = snapshotStatusId
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
         * Returns an immutable instance of [CrmObjectSnapshotResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .objectId()
         * .objectTypeId()
         * .portalId()
         * .snapshotStatusId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CrmObjectSnapshotResponse =
            CrmObjectSnapshotResponse(
                checkRequired("objectId", objectId),
                checkRequired("objectTypeId", objectTypeId),
                checkRequired("portalId", portalId),
                checkRequired("snapshotStatusId", snapshotStatusId),
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
    fun validate(): CrmObjectSnapshotResponse = apply {
        if (validated) {
            return@apply
        }

        objectId()
        objectTypeId()
        portalId()
        snapshotStatusId()
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
            (if (snapshotStatusId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CrmObjectSnapshotResponse &&
            objectId == other.objectId &&
            objectTypeId == other.objectTypeId &&
            portalId == other.portalId &&
            snapshotStatusId == other.snapshotStatusId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(objectId, objectTypeId, portalId, snapshotStatusId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CrmObjectSnapshotResponse{objectId=$objectId, objectTypeId=$objectTypeId, portalId=$portalId, snapshotStatusId=$snapshotStatusId, additionalProperties=$additionalProperties}"
}
