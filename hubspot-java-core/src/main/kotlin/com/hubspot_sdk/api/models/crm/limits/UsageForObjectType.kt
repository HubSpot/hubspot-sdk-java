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
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects

class UsageForObjectType
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val objectTypeId: JsonField<String>,
    private val pluralLabel: JsonField<String>,
    private val singularLabel: JsonField<String>,
    private val usage: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("objectTypeId")
        @ExcludeMissing
        objectTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pluralLabel")
        @ExcludeMissing
        pluralLabel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("singularLabel")
        @ExcludeMissing
        singularLabel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("usage") @ExcludeMissing usage: JsonField<Int> = JsonMissing.of(),
    ) : this(objectTypeId, pluralLabel, singularLabel, usage, mutableMapOf())

    /**
     * The unique identifier for the object type.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectTypeId(): String = objectTypeId.getRequired("objectTypeId")

    /**
     * The plural form of the label for the object type.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pluralLabel(): String = pluralLabel.getRequired("pluralLabel")

    /**
     * The singular form of the label for the object type.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun singularLabel(): String = singularLabel.getRequired("singularLabel")

    /**
     * The number of records used for the object type.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun usage(): Int = usage.getRequired("usage")

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

    /**
     * Returns the raw JSON value of [usage].
     *
     * Unlike [usage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("usage") @ExcludeMissing fun _usage(): JsonField<Int> = usage

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
         * Returns a mutable builder for constructing an instance of [UsageForObjectType].
         *
         * The following fields are required:
         * ```java
         * .objectTypeId()
         * .pluralLabel()
         * .singularLabel()
         * .usage()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UsageForObjectType]. */
    class Builder internal constructor() {

        private var objectTypeId: JsonField<String>? = null
        private var pluralLabel: JsonField<String>? = null
        private var singularLabel: JsonField<String>? = null
        private var usage: JsonField<Int>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(usageForObjectType: UsageForObjectType) = apply {
            objectTypeId = usageForObjectType.objectTypeId
            pluralLabel = usageForObjectType.pluralLabel
            singularLabel = usageForObjectType.singularLabel
            usage = usageForObjectType.usage
            additionalProperties = usageForObjectType.additionalProperties.toMutableMap()
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

        /** The number of records used for the object type. */
        fun usage(usage: Int) = usage(JsonField.of(usage))

        /**
         * Sets [Builder.usage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usage] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun usage(usage: JsonField<Int>) = apply { this.usage = usage }

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
         * Returns an immutable instance of [UsageForObjectType].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .objectTypeId()
         * .pluralLabel()
         * .singularLabel()
         * .usage()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UsageForObjectType =
            UsageForObjectType(
                checkRequired("objectTypeId", objectTypeId),
                checkRequired("pluralLabel", pluralLabel),
                checkRequired("singularLabel", singularLabel),
                checkRequired("usage", usage),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UsageForObjectType = apply {
        if (validated) {
            return@apply
        }

        objectTypeId()
        pluralLabel()
        singularLabel()
        usage()
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
        (if (objectTypeId.asKnown().isPresent) 1 else 0) +
            (if (pluralLabel.asKnown().isPresent) 1 else 0) +
            (if (singularLabel.asKnown().isPresent) 1 else 0) +
            (if (usage.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UsageForObjectType &&
            objectTypeId == other.objectTypeId &&
            pluralLabel == other.pluralLabel &&
            singularLabel == other.singularLabel &&
            usage == other.usage &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(objectTypeId, pluralLabel, singularLabel, usage, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UsageForObjectType{objectTypeId=$objectTypeId, pluralLabel=$pluralLabel, singularLabel=$singularLabel, usage=$usage, additionalProperties=$additionalProperties}"
}
