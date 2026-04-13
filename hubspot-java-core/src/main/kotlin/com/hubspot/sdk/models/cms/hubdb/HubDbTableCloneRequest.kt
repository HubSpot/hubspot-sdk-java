// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.hubdb

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
import java.util.Optional

class HubDbTableCloneRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val copyRows: JsonField<Boolean>,
    private val isHubSpotDefined: JsonField<Boolean>,
    private val newLabel: JsonField<String>,
    private val newName: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("copyRows") @ExcludeMissing copyRows: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isHubspotDefined")
        @ExcludeMissing
        isHubSpotDefined: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("newLabel") @ExcludeMissing newLabel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("newName") @ExcludeMissing newName: JsonField<String> = JsonMissing.of(),
    ) : this(copyRows, isHubSpotDefined, newLabel, newName, mutableMapOf())

    /**
     * Specifies whether to copy the rows during clone
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun copyRows(): Boolean = copyRows.getRequired("copyRows")

    /**
     * Indicates whether the table is defined by HubSpot.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isHubSpotDefined(): Boolean = isHubSpotDefined.getRequired("isHubspotDefined")

    /**
     * The new label for the cloned table
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun newLabel(): Optional<String> = newLabel.getOptional("newLabel")

    /**
     * The new name for the cloned table
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun newName(): Optional<String> = newName.getOptional("newName")

    /**
     * Returns the raw JSON value of [copyRows].
     *
     * Unlike [copyRows], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("copyRows") @ExcludeMissing fun _copyRows(): JsonField<Boolean> = copyRows

    /**
     * Returns the raw JSON value of [isHubSpotDefined].
     *
     * Unlike [isHubSpotDefined], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("isHubspotDefined")
    @ExcludeMissing
    fun _isHubSpotDefined(): JsonField<Boolean> = isHubSpotDefined

    /**
     * Returns the raw JSON value of [newLabel].
     *
     * Unlike [newLabel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("newLabel") @ExcludeMissing fun _newLabel(): JsonField<String> = newLabel

    /**
     * Returns the raw JSON value of [newName].
     *
     * Unlike [newName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("newName") @ExcludeMissing fun _newName(): JsonField<String> = newName

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
         * Returns a mutable builder for constructing an instance of [HubDbTableCloneRequest].
         *
         * The following fields are required:
         * ```java
         * .copyRows()
         * .isHubSpotDefined()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [HubDbTableCloneRequest]. */
    class Builder internal constructor() {

        private var copyRows: JsonField<Boolean>? = null
        private var isHubSpotDefined: JsonField<Boolean>? = null
        private var newLabel: JsonField<String> = JsonMissing.of()
        private var newName: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(hubDbTableCloneRequest: HubDbTableCloneRequest) = apply {
            copyRows = hubDbTableCloneRequest.copyRows
            isHubSpotDefined = hubDbTableCloneRequest.isHubSpotDefined
            newLabel = hubDbTableCloneRequest.newLabel
            newName = hubDbTableCloneRequest.newName
            additionalProperties = hubDbTableCloneRequest.additionalProperties.toMutableMap()
        }

        /** Specifies whether to copy the rows during clone */
        fun copyRows(copyRows: Boolean) = copyRows(JsonField.of(copyRows))

        /**
         * Sets [Builder.copyRows] to an arbitrary JSON value.
         *
         * You should usually call [Builder.copyRows] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun copyRows(copyRows: JsonField<Boolean>) = apply { this.copyRows = copyRows }

        /** Indicates whether the table is defined by HubSpot. */
        fun isHubSpotDefined(isHubSpotDefined: Boolean) =
            isHubSpotDefined(JsonField.of(isHubSpotDefined))

        /**
         * Sets [Builder.isHubSpotDefined] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isHubSpotDefined] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isHubSpotDefined(isHubSpotDefined: JsonField<Boolean>) = apply {
            this.isHubSpotDefined = isHubSpotDefined
        }

        /** The new label for the cloned table */
        fun newLabel(newLabel: String) = newLabel(JsonField.of(newLabel))

        /**
         * Sets [Builder.newLabel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.newLabel] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun newLabel(newLabel: JsonField<String>) = apply { this.newLabel = newLabel }

        /** The new name for the cloned table */
        fun newName(newName: String) = newName(JsonField.of(newName))

        /**
         * Sets [Builder.newName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.newName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun newName(newName: JsonField<String>) = apply { this.newName = newName }

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
         * Returns an immutable instance of [HubDbTableCloneRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .copyRows()
         * .isHubSpotDefined()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): HubDbTableCloneRequest =
            HubDbTableCloneRequest(
                checkRequired("copyRows", copyRows),
                checkRequired("isHubSpotDefined", isHubSpotDefined),
                newLabel,
                newName,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): HubDbTableCloneRequest = apply {
        if (validated) {
            return@apply
        }

        copyRows()
        isHubSpotDefined()
        newLabel()
        newName()
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
        (if (copyRows.asKnown().isPresent) 1 else 0) +
            (if (isHubSpotDefined.asKnown().isPresent) 1 else 0) +
            (if (newLabel.asKnown().isPresent) 1 else 0) +
            (if (newName.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HubDbTableCloneRequest &&
            copyRows == other.copyRows &&
            isHubSpotDefined == other.isHubSpotDefined &&
            newLabel == other.newLabel &&
            newName == other.newName &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(copyRows, isHubSpotDefined, newLabel, newName, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "HubDbTableCloneRequest{copyRows=$copyRows, isHubSpotDefined=$isHubSpotDefined, newLabel=$newLabel, newName=$newName, additionalProperties=$additionalProperties}"
}
