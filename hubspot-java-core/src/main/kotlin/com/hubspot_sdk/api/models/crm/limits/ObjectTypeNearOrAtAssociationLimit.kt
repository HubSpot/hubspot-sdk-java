// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.limits

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

class ObjectTypeNearOrAtAssociationLimit
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val hasRecordsAtLimit: JsonField<Boolean>,
    private val hasRecordsNearLimit: JsonField<Boolean>,
    private val objectTypeId: JsonField<String>,
    private val pluralLabel: JsonField<String>,
    private val singularLabel: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("hasRecordsAtLimit")
        @ExcludeMissing
        hasRecordsAtLimit: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("hasRecordsNearLimit")
        @ExcludeMissing
        hasRecordsNearLimit: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("objectTypeId")
        @ExcludeMissing
        objectTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pluralLabel")
        @ExcludeMissing
        pluralLabel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("singularLabel")
        @ExcludeMissing
        singularLabel: JsonField<String> = JsonMissing.of(),
    ) : this(
        hasRecordsAtLimit,
        hasRecordsNearLimit,
        objectTypeId,
        pluralLabel,
        singularLabel,
        mutableMapOf(),
    )

    /**
     * Indicates whether there are records that have reached the association limit.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hasRecordsAtLimit(): Boolean = hasRecordsAtLimit.getRequired("hasRecordsAtLimit")

    /**
     * Indicates whether there are records that are approaching the association limit.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hasRecordsNearLimit(): Boolean = hasRecordsNearLimit.getRequired("hasRecordsNearLimit")

    /**
     * The unique identifier for the object type.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectTypeId(): String = objectTypeId.getRequired("objectTypeId")

    /**
     * The plural form of the label for the object type.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pluralLabel(): String = pluralLabel.getRequired("pluralLabel")

    /**
     * The singular form of the label for the object type.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun singularLabel(): String = singularLabel.getRequired("singularLabel")

    /**
     * Returns the raw JSON value of [hasRecordsAtLimit].
     *
     * Unlike [hasRecordsAtLimit], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("hasRecordsAtLimit")
    @ExcludeMissing
    fun _hasRecordsAtLimit(): JsonField<Boolean> = hasRecordsAtLimit

    /**
     * Returns the raw JSON value of [hasRecordsNearLimit].
     *
     * Unlike [hasRecordsNearLimit], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("hasRecordsNearLimit")
    @ExcludeMissing
    fun _hasRecordsNearLimit(): JsonField<Boolean> = hasRecordsNearLimit

    /**
     * Returns the raw JSON value of [objectTypeId].
     *
     * Unlike [objectTypeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectTypeId")
    @ExcludeMissing
    fun _objectTypeId(): JsonField<String> = objectTypeId

    /**
     * Returns the raw JSON value of [pluralLabel].
     *
     * Unlike [pluralLabel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pluralLabel") @ExcludeMissing fun _pluralLabel(): JsonField<String> = pluralLabel

    /**
     * Returns the raw JSON value of [singularLabel].
     *
     * Unlike [singularLabel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("singularLabel")
    @ExcludeMissing
    fun _singularLabel(): JsonField<String> = singularLabel

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
         * [ObjectTypeNearOrAtAssociationLimit].
         *
         * The following fields are required:
         * ```java
         * .hasRecordsAtLimit()
         * .hasRecordsNearLimit()
         * .objectTypeId()
         * .pluralLabel()
         * .singularLabel()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ObjectTypeNearOrAtAssociationLimit]. */
    class Builder internal constructor() {

        private var hasRecordsAtLimit: JsonField<Boolean>? = null
        private var hasRecordsNearLimit: JsonField<Boolean>? = null
        private var objectTypeId: JsonField<String>? = null
        private var pluralLabel: JsonField<String>? = null
        private var singularLabel: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(objectTypeNearOrAtAssociationLimit: ObjectTypeNearOrAtAssociationLimit) =
            apply {
                hasRecordsAtLimit = objectTypeNearOrAtAssociationLimit.hasRecordsAtLimit
                hasRecordsNearLimit = objectTypeNearOrAtAssociationLimit.hasRecordsNearLimit
                objectTypeId = objectTypeNearOrAtAssociationLimit.objectTypeId
                pluralLabel = objectTypeNearOrAtAssociationLimit.pluralLabel
                singularLabel = objectTypeNearOrAtAssociationLimit.singularLabel
                additionalProperties =
                    objectTypeNearOrAtAssociationLimit.additionalProperties.toMutableMap()
            }

        /** Indicates whether there are records that have reached the association limit. */
        fun hasRecordsAtLimit(hasRecordsAtLimit: Boolean) =
            hasRecordsAtLimit(JsonField.of(hasRecordsAtLimit))

        /**
         * Sets [Builder.hasRecordsAtLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasRecordsAtLimit] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hasRecordsAtLimit(hasRecordsAtLimit: JsonField<Boolean>) = apply {
            this.hasRecordsAtLimit = hasRecordsAtLimit
        }

        /** Indicates whether there are records that are approaching the association limit. */
        fun hasRecordsNearLimit(hasRecordsNearLimit: Boolean) =
            hasRecordsNearLimit(JsonField.of(hasRecordsNearLimit))

        /**
         * Sets [Builder.hasRecordsNearLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasRecordsNearLimit] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hasRecordsNearLimit(hasRecordsNearLimit: JsonField<Boolean>) = apply {
            this.hasRecordsNearLimit = hasRecordsNearLimit
        }

        /** The unique identifier for the object type. */
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

        /** The plural form of the label for the object type. */
        fun pluralLabel(pluralLabel: String) = pluralLabel(JsonField.of(pluralLabel))

        /**
         * Sets [Builder.pluralLabel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pluralLabel] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pluralLabel(pluralLabel: JsonField<String>) = apply { this.pluralLabel = pluralLabel }

        /** The singular form of the label for the object type. */
        fun singularLabel(singularLabel: String) = singularLabel(JsonField.of(singularLabel))

        /**
         * Sets [Builder.singularLabel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.singularLabel] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun singularLabel(singularLabel: JsonField<String>) = apply {
            this.singularLabel = singularLabel
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
         * Returns an immutable instance of [ObjectTypeNearOrAtAssociationLimit].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .hasRecordsAtLimit()
         * .hasRecordsNearLimit()
         * .objectTypeId()
         * .pluralLabel()
         * .singularLabel()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ObjectTypeNearOrAtAssociationLimit =
            ObjectTypeNearOrAtAssociationLimit(
                checkRequired("hasRecordsAtLimit", hasRecordsAtLimit),
                checkRequired("hasRecordsNearLimit", hasRecordsNearLimit),
                checkRequired("objectTypeId", objectTypeId),
                checkRequired("pluralLabel", pluralLabel),
                checkRequired("singularLabel", singularLabel),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ObjectTypeNearOrAtAssociationLimit = apply {
        if (validated) {
            return@apply
        }

        hasRecordsAtLimit()
        hasRecordsNearLimit()
        objectTypeId()
        pluralLabel()
        singularLabel()
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
        (if (hasRecordsAtLimit.asKnown().isPresent) 1 else 0) +
            (if (hasRecordsNearLimit.asKnown().isPresent) 1 else 0) +
            (if (objectTypeId.asKnown().isPresent) 1 else 0) +
            (if (pluralLabel.asKnown().isPresent) 1 else 0) +
            (if (singularLabel.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ObjectTypeNearOrAtAssociationLimit &&
            hasRecordsAtLimit == other.hasRecordsAtLimit &&
            hasRecordsNearLimit == other.hasRecordsNearLimit &&
            objectTypeId == other.objectTypeId &&
            pluralLabel == other.pluralLabel &&
            singularLabel == other.singularLabel &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            hasRecordsAtLimit,
            hasRecordsNearLimit,
            objectTypeId,
            pluralLabel,
            singularLabel,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ObjectTypeNearOrAtAssociationLimit{hasRecordsAtLimit=$hasRecordsAtLimit, hasRecordsNearLimit=$hasRecordsNearLimit, objectTypeId=$objectTypeId, pluralLabel=$pluralLabel, singularLabel=$singularLabel, additionalProperties=$additionalProperties}"
}
