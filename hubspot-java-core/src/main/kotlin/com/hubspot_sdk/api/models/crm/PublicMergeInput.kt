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

class PublicMergeInput
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val objectIdToMerge: JsonField<String>,
    private val primaryObjectId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("objectIdToMerge")
        @ExcludeMissing
        objectIdToMerge: JsonField<String> = JsonMissing.of(),
        @JsonProperty("primaryObjectId")
        @ExcludeMissing
        primaryObjectId: JsonField<String> = JsonMissing.of(),
    ) : this(objectIdToMerge, primaryObjectId, mutableMapOf())

    /**
     * The unique identifier of the CRM object that will be merged into the primary object.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectIdToMerge(): String = objectIdToMerge.getRequired("objectIdToMerge")

    /**
     * The unique identifier of the CRM object that will remain after the merge.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun primaryObjectId(): String = primaryObjectId.getRequired("primaryObjectId")

    /**
     * Returns the raw JSON value of [objectIdToMerge].
     *
     * Unlike [objectIdToMerge], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectIdToMerge")
    @ExcludeMissing
    fun _objectIdToMerge(): JsonField<String> = objectIdToMerge

    /**
     * Returns the raw JSON value of [primaryObjectId].
     *
     * Unlike [primaryObjectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("primaryObjectId")
    @ExcludeMissing
    fun _primaryObjectId(): JsonField<String> = primaryObjectId

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
         * Returns a mutable builder for constructing an instance of [PublicMergeInput].
         *
         * The following fields are required:
         * ```java
         * .objectIdToMerge()
         * .primaryObjectId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicMergeInput]. */
    class Builder internal constructor() {

        private var objectIdToMerge: JsonField<String>? = null
        private var primaryObjectId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicMergeInput: PublicMergeInput) = apply {
            objectIdToMerge = publicMergeInput.objectIdToMerge
            primaryObjectId = publicMergeInput.primaryObjectId
            additionalProperties = publicMergeInput.additionalProperties.toMutableMap()
        }

        /** The unique identifier of the CRM object that will be merged into the primary object. */
        fun objectIdToMerge(objectIdToMerge: String) =
            objectIdToMerge(JsonField.of(objectIdToMerge))

        /**
         * Sets [Builder.objectIdToMerge] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectIdToMerge] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun objectIdToMerge(objectIdToMerge: JsonField<String>) = apply {
            this.objectIdToMerge = objectIdToMerge
        }

        /** The unique identifier of the CRM object that will remain after the merge. */
        fun primaryObjectId(primaryObjectId: String) =
            primaryObjectId(JsonField.of(primaryObjectId))

        /**
         * Sets [Builder.primaryObjectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryObjectId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun primaryObjectId(primaryObjectId: JsonField<String>) = apply {
            this.primaryObjectId = primaryObjectId
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
         * Returns an immutable instance of [PublicMergeInput].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .objectIdToMerge()
         * .primaryObjectId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicMergeInput =
            PublicMergeInput(
                checkRequired("objectIdToMerge", objectIdToMerge),
                checkRequired("primaryObjectId", primaryObjectId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicMergeInput = apply {
        if (validated) {
            return@apply
        }

        objectIdToMerge()
        primaryObjectId()
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
        (if (objectIdToMerge.asKnown().isPresent) 1 else 0) +
            (if (primaryObjectId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicMergeInput &&
            objectIdToMerge == other.objectIdToMerge &&
            primaryObjectId == other.primaryObjectId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(objectIdToMerge, primaryObjectId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicMergeInput{objectIdToMerge=$objectIdToMerge, primaryObjectId=$primaryObjectId, additionalProperties=$additionalProperties}"
}
