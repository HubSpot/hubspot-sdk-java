// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.pipelines

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.core.ExcludeMissing
import com.hubspot.core.JsonField
import com.hubspot.core.JsonMissing
import com.hubspot.core.JsonValue
import com.hubspot.core.checkKnown
import com.hubspot.core.checkRequired
import com.hubspot.core.toImmutable
import com.hubspot.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class PipelineReplaceInput
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val displayOrder: JsonField<Int>,
    private val label: JsonField<String>,
    private val stages: JsonField<List<PipelineStageInput>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("displayOrder")
        @ExcludeMissing
        displayOrder: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("stages")
        @ExcludeMissing
        stages: JsonField<List<PipelineStageInput>> = JsonMissing.of(),
    ) : this(displayOrder, label, stages, mutableMapOf())

    /**
     * The order for displaying this pipeline stage. If two pipeline stages have a matching
     * `displayOrder`, they will be sorted alphabetically by label.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun displayOrder(): Int = displayOrder.getRequired("displayOrder")

    /**
     * A label used to organize pipeline stages in HubSpot's UI. Each pipeline stage's label must be
     * unique within that pipeline.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun label(): String = label.getRequired("label")

    /**
     * The stages associated with the pipeline. They can be retrieved and updated via the pipeline
     * stages endpoints.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun stages(): List<PipelineStageInput> = stages.getRequired("stages")

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

    /**
     * Returns the raw JSON value of [stages].
     *
     * Unlike [stages], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stages")
    @ExcludeMissing
    fun _stages(): JsonField<List<PipelineStageInput>> = stages

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
         * Returns a mutable builder for constructing an instance of [PipelineReplaceInput].
         *
         * The following fields are required:
         * ```java
         * .displayOrder()
         * .label()
         * .stages()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PipelineReplaceInput]. */
    class Builder internal constructor() {

        private var displayOrder: JsonField<Int>? = null
        private var label: JsonField<String>? = null
        private var stages: JsonField<MutableList<PipelineStageInput>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(pipelineReplaceInput: PipelineReplaceInput) = apply {
            displayOrder = pipelineReplaceInput.displayOrder
            label = pipelineReplaceInput.label
            stages = pipelineReplaceInput.stages.map { it.toMutableList() }
            additionalProperties = pipelineReplaceInput.additionalProperties.toMutableMap()
        }

        /**
         * The order for displaying this pipeline stage. If two pipeline stages have a matching
         * `displayOrder`, they will be sorted alphabetically by label.
         */
        fun displayOrder(displayOrder: Int) = displayOrder(JsonField.of(displayOrder))

        /**
         * Sets [Builder.displayOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayOrder] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayOrder(displayOrder: JsonField<Int>) = apply { this.displayOrder = displayOrder }

        /**
         * A label used to organize pipeline stages in HubSpot's UI. Each pipeline stage's label
         * must be unique within that pipeline.
         */
        fun label(label: String) = label(JsonField.of(label))

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: JsonField<String>) = apply { this.label = label }

        /**
         * The stages associated with the pipeline. They can be retrieved and updated via the
         * pipeline stages endpoints.
         */
        fun stages(stages: List<PipelineStageInput>) = stages(JsonField.of(stages))

        /**
         * Sets [Builder.stages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stages] with a well-typed `List<PipelineStageInput>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun stages(stages: JsonField<List<PipelineStageInput>>) = apply {
            this.stages = stages.map { it.toMutableList() }
        }

        /**
         * Adds a single [PipelineStageInput] to [stages].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addStage(stage: PipelineStageInput) = apply {
            stages =
                (stages ?: JsonField.of(mutableListOf())).also {
                    checkKnown("stages", it).add(stage)
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
         * Returns an immutable instance of [PipelineReplaceInput].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .displayOrder()
         * .label()
         * .stages()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PipelineReplaceInput =
            PipelineReplaceInput(
                checkRequired("displayOrder", displayOrder),
                checkRequired("label", label),
                checkRequired("stages", stages).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PipelineReplaceInput = apply {
        if (validated) {
            return@apply
        }

        displayOrder()
        label()
        stages().forEach { it.validate() }
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
        (if (displayOrder.asKnown().isPresent) 1 else 0) +
            (if (label.asKnown().isPresent) 1 else 0) +
            (stages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PipelineReplaceInput &&
            displayOrder == other.displayOrder &&
            label == other.label &&
            stages == other.stages &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(displayOrder, label, stages, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PipelineReplaceInput{displayOrder=$displayOrder, label=$label, stages=$stages, additionalProperties=$additionalProperties}"
}
