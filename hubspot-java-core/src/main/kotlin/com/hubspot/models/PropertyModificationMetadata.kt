// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models

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
import java.util.Optional

class PropertyModificationMetadata
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val archivable: JsonField<Boolean>,
    private val readOnlyDefinition: JsonField<Boolean>,
    private val readOnlyValue: JsonField<Boolean>,
    private val readOnlyOptions: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("archivable")
        @ExcludeMissing
        archivable: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("readOnlyDefinition")
        @ExcludeMissing
        readOnlyDefinition: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("readOnlyValue")
        @ExcludeMissing
        readOnlyValue: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("readOnlyOptions")
        @ExcludeMissing
        readOnlyOptions: JsonField<Boolean> = JsonMissing.of(),
    ) : this(archivable, readOnlyDefinition, readOnlyValue, readOnlyOptions, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun archivable(): Boolean = archivable.getRequired("archivable")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun readOnlyDefinition(): Boolean = readOnlyDefinition.getRequired("readOnlyDefinition")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun readOnlyValue(): Boolean = readOnlyValue.getRequired("readOnlyValue")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun readOnlyOptions(): Optional<Boolean> = readOnlyOptions.getOptional("readOnlyOptions")

    /**
     * Returns the raw JSON value of [archivable].
     *
     * Unlike [archivable], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("archivable") @ExcludeMissing fun _archivable(): JsonField<Boolean> = archivable

    /**
     * Returns the raw JSON value of [readOnlyDefinition].
     *
     * Unlike [readOnlyDefinition], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("readOnlyDefinition")
    @ExcludeMissing
    fun _readOnlyDefinition(): JsonField<Boolean> = readOnlyDefinition

    /**
     * Returns the raw JSON value of [readOnlyValue].
     *
     * Unlike [readOnlyValue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("readOnlyValue")
    @ExcludeMissing
    fun _readOnlyValue(): JsonField<Boolean> = readOnlyValue

    /**
     * Returns the raw JSON value of [readOnlyOptions].
     *
     * Unlike [readOnlyOptions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("readOnlyOptions")
    @ExcludeMissing
    fun _readOnlyOptions(): JsonField<Boolean> = readOnlyOptions

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
         * Returns a mutable builder for constructing an instance of [PropertyModificationMetadata].
         *
         * The following fields are required:
         * ```java
         * .archivable()
         * .readOnlyDefinition()
         * .readOnlyValue()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PropertyModificationMetadata]. */
    class Builder internal constructor() {

        private var archivable: JsonField<Boolean>? = null
        private var readOnlyDefinition: JsonField<Boolean>? = null
        private var readOnlyValue: JsonField<Boolean>? = null
        private var readOnlyOptions: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(propertyModificationMetadata: PropertyModificationMetadata) = apply {
            archivable = propertyModificationMetadata.archivable
            readOnlyDefinition = propertyModificationMetadata.readOnlyDefinition
            readOnlyValue = propertyModificationMetadata.readOnlyValue
            readOnlyOptions = propertyModificationMetadata.readOnlyOptions
            additionalProperties = propertyModificationMetadata.additionalProperties.toMutableMap()
        }

        fun archivable(archivable: Boolean) = archivable(JsonField.of(archivable))

        /**
         * Sets [Builder.archivable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.archivable] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun archivable(archivable: JsonField<Boolean>) = apply { this.archivable = archivable }

        fun readOnlyDefinition(readOnlyDefinition: Boolean) =
            readOnlyDefinition(JsonField.of(readOnlyDefinition))

        /**
         * Sets [Builder.readOnlyDefinition] to an arbitrary JSON value.
         *
         * You should usually call [Builder.readOnlyDefinition] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun readOnlyDefinition(readOnlyDefinition: JsonField<Boolean>) = apply {
            this.readOnlyDefinition = readOnlyDefinition
        }

        fun readOnlyValue(readOnlyValue: Boolean) = readOnlyValue(JsonField.of(readOnlyValue))

        /**
         * Sets [Builder.readOnlyValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.readOnlyValue] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun readOnlyValue(readOnlyValue: JsonField<Boolean>) = apply {
            this.readOnlyValue = readOnlyValue
        }

        fun readOnlyOptions(readOnlyOptions: Boolean) =
            readOnlyOptions(JsonField.of(readOnlyOptions))

        /**
         * Sets [Builder.readOnlyOptions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.readOnlyOptions] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun readOnlyOptions(readOnlyOptions: JsonField<Boolean>) = apply {
            this.readOnlyOptions = readOnlyOptions
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
         * Returns an immutable instance of [PropertyModificationMetadata].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .archivable()
         * .readOnlyDefinition()
         * .readOnlyValue()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PropertyModificationMetadata =
            PropertyModificationMetadata(
                checkRequired("archivable", archivable),
                checkRequired("readOnlyDefinition", readOnlyDefinition),
                checkRequired("readOnlyValue", readOnlyValue),
                readOnlyOptions,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PropertyModificationMetadata = apply {
        if (validated) {
            return@apply
        }

        archivable()
        readOnlyDefinition()
        readOnlyValue()
        readOnlyOptions()
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
        (if (archivable.asKnown().isPresent) 1 else 0) +
            (if (readOnlyDefinition.asKnown().isPresent) 1 else 0) +
            (if (readOnlyValue.asKnown().isPresent) 1 else 0) +
            (if (readOnlyOptions.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PropertyModificationMetadata &&
            archivable == other.archivable &&
            readOnlyDefinition == other.readOnlyDefinition &&
            readOnlyValue == other.readOnlyValue &&
            readOnlyOptions == other.readOnlyOptions &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            archivable,
            readOnlyDefinition,
            readOnlyValue,
            readOnlyOptions,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PropertyModificationMetadata{archivable=$archivable, readOnlyDefinition=$readOnlyDefinition, readOnlyValue=$readOnlyValue, readOnlyOptions=$readOnlyOptions, additionalProperties=$additionalProperties}"
}
