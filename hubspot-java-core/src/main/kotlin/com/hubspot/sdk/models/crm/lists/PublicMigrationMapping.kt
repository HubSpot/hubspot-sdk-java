// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

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

class PublicMigrationMapping
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val legacyListId: JsonField<String>,
    private val listId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("legacyListId")
        @ExcludeMissing
        legacyListId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("listId") @ExcludeMissing listId: JsonField<String> = JsonMissing.of(),
    ) : this(legacyListId, listId, mutableMapOf())

    /**
     * The legacy list id for the list
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun legacyListId(): String = legacyListId.getRequired("legacyListId")

    /**
     * The V3 list id for the list
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun listId(): String = listId.getRequired("listId")

    /**
     * Returns the raw JSON value of [legacyListId].
     *
     * Unlike [legacyListId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("legacyListId")
    @ExcludeMissing
    fun _legacyListId(): JsonField<String> = legacyListId

    /**
     * Returns the raw JSON value of [listId].
     *
     * Unlike [listId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("listId") @ExcludeMissing fun _listId(): JsonField<String> = listId

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
         * Returns a mutable builder for constructing an instance of [PublicMigrationMapping].
         *
         * The following fields are required:
         * ```java
         * .legacyListId()
         * .listId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicMigrationMapping]. */
    class Builder internal constructor() {

        private var legacyListId: JsonField<String>? = null
        private var listId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicMigrationMapping: PublicMigrationMapping) = apply {
            legacyListId = publicMigrationMapping.legacyListId
            listId = publicMigrationMapping.listId
            additionalProperties = publicMigrationMapping.additionalProperties.toMutableMap()
        }

        /** The legacy list id for the list */
        fun legacyListId(legacyListId: String) = legacyListId(JsonField.of(legacyListId))

        /**
         * Sets [Builder.legacyListId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legacyListId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun legacyListId(legacyListId: JsonField<String>) = apply {
            this.legacyListId = legacyListId
        }

        /** The V3 list id for the list */
        fun listId(listId: String) = listId(JsonField.of(listId))

        /**
         * Sets [Builder.listId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.listId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun listId(listId: JsonField<String>) = apply { this.listId = listId }

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
         * Returns an immutable instance of [PublicMigrationMapping].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .legacyListId()
         * .listId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicMigrationMapping =
            PublicMigrationMapping(
                checkRequired("legacyListId", legacyListId),
                checkRequired("listId", listId),
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
    fun validate(): PublicMigrationMapping = apply {
        if (validated) {
            return@apply
        }

        legacyListId()
        listId()
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
        (if (legacyListId.asKnown().isPresent) 1 else 0) +
            (if (listId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicMigrationMapping &&
            legacyListId == other.legacyListId &&
            listId == other.listId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(legacyListId, listId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicMigrationMapping{legacyListId=$legacyListId, listId=$listId, additionalProperties=$additionalProperties}"
}
