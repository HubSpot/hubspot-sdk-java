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

class PublicInListFilterMetadata
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val inListType: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("inListType") @ExcludeMissing inListType: JsonField<String> = JsonMissing.of(),
    ) : this(id, inListType, mutableMapOf())

    /**
     * The identifier for the filter metadata.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Specifies the type of list for the filter (WORKFLOWS_ENROLLMENT, WORKFLOWS_ACTIVE,
     * WORKFLOWS_GOAL, WORKFLOWS_COMPLETED, IMPORT, DATASET, DATASETS).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inListType(): String = inListType.getRequired("inListType")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [inListType].
     *
     * Unlike [inListType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inListType") @ExcludeMissing fun _inListType(): JsonField<String> = inListType

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
         * Returns a mutable builder for constructing an instance of [PublicInListFilterMetadata].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .inListType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicInListFilterMetadata]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var inListType: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicInListFilterMetadata: PublicInListFilterMetadata) = apply {
            id = publicInListFilterMetadata.id
            inListType = publicInListFilterMetadata.inListType
            additionalProperties = publicInListFilterMetadata.additionalProperties.toMutableMap()
        }

        /** The identifier for the filter metadata. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * Specifies the type of list for the filter (WORKFLOWS_ENROLLMENT, WORKFLOWS_ACTIVE,
         * WORKFLOWS_GOAL, WORKFLOWS_COMPLETED, IMPORT, DATASET, DATASETS).
         */
        fun inListType(inListType: String) = inListType(JsonField.of(inListType))

        /**
         * Sets [Builder.inListType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inListType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun inListType(inListType: JsonField<String>) = apply { this.inListType = inListType }

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
         * Returns an immutable instance of [PublicInListFilterMetadata].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .inListType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicInListFilterMetadata =
            PublicInListFilterMetadata(
                checkRequired("id", id),
                checkRequired("inListType", inListType),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicInListFilterMetadata = apply {
        if (validated) {
            return@apply
        }

        id()
        inListType()
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
        (if (id.asKnown().isPresent) 1 else 0) + (if (inListType.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicInListFilterMetadata &&
            id == other.id &&
            inListType == other.inListType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(id, inListType, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicInListFilterMetadata{id=$id, inListType=$inListType, additionalProperties=$additionalProperties}"
}
