// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.pipelines

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class PipelinePatchInput
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val archived: JsonField<Boolean>,
    private val displayOrder: JsonField<Int>,
    private val label: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("archived") @ExcludeMissing archived: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("displayOrder")
        @ExcludeMissing
        displayOrder: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
    ) : this(archived, displayOrder, label, mutableMapOf())

    /**
     * Whether the pipeline is archived. This property should only be provided when restoring an
     * archived pipeline. If it's provided in any other call, the request will fail and a `400 Bad
     * Request` will be returned.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun archived(): Optional<Boolean> = archived.getOptional("archived")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun displayOrder(): Optional<Int> = displayOrder.getOptional("displayOrder")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun label(): Optional<String> = label.getOptional("label")

    /**
     * Returns the raw JSON value of [archived].
     *
     * Unlike [archived], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("archived") @ExcludeMissing fun _archived(): JsonField<Boolean> = archived

    /**
     * Returns the raw JSON value of [displayOrder].
     *
     * Unlike [displayOrder], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("displayOrder") @ExcludeMissing fun _displayOrder(): JsonField<Int> = displayOrder

    /**
     * Returns the raw JSON value of [label].
     *
     * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

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

        /** Returns a mutable builder for constructing an instance of [PipelinePatchInput]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PipelinePatchInput]. */
    class Builder internal constructor() {

        private var archived: JsonField<Boolean> = JsonMissing.of()
        private var displayOrder: JsonField<Int> = JsonMissing.of()
        private var label: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(pipelinePatchInput: PipelinePatchInput) = apply {
            archived = pipelinePatchInput.archived
            displayOrder = pipelinePatchInput.displayOrder
            label = pipelinePatchInput.label
            additionalProperties = pipelinePatchInput.additionalProperties.toMutableMap()
        }

        /**
         * Whether the pipeline is archived. This property should only be provided when restoring an
         * archived pipeline. If it's provided in any other call, the request will fail and a `400
         * Bad Request` will be returned.
         */
        fun archived(archived: Boolean) = archived(JsonField.of(archived))

        /**
         * Sets [Builder.archived] to an arbitrary JSON value.
         *
         * You should usually call [Builder.archived] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun archived(archived: JsonField<Boolean>) = apply { this.archived = archived }

        fun displayOrder(displayOrder: Int) = displayOrder(JsonField.of(displayOrder))

        /**
         * Sets [Builder.displayOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayOrder] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayOrder(displayOrder: JsonField<Int>) = apply { this.displayOrder = displayOrder }

        fun label(label: String) = label(JsonField.of(label))

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: JsonField<String>) = apply { this.label = label }

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
         * Returns an immutable instance of [PipelinePatchInput].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PipelinePatchInput =
            PipelinePatchInput(archived, displayOrder, label, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): PipelinePatchInput = apply {
        if (validated) {
            return@apply
        }

        archived()
        displayOrder()
        label()
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
        (if (archived.asKnown().isPresent) 1 else 0) +
            (if (displayOrder.asKnown().isPresent) 1 else 0) +
            (if (label.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PipelinePatchInput &&
            archived == other.archived &&
            displayOrder == other.displayOrder &&
            label == other.label &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(archived, displayOrder, label, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PipelinePatchInput{archived=$archived, displayOrder=$displayOrder, label=$label, additionalProperties=$additionalProperties}"
}
