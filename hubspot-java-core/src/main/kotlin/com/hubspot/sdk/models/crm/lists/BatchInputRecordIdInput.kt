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
import com.hubspot.sdk.core.checkKnown
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.toImmutable
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class BatchInputRecordIdInput
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val inputs: JsonField<List<RecordIdInput>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("inputs")
        @ExcludeMissing
        inputs: JsonField<List<RecordIdInput>> = JsonMissing.of()
    ) : this(inputs, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inputs(): List<RecordIdInput> = inputs.getRequired("inputs")

    /**
     * Returns the raw JSON value of [inputs].
     *
     * Unlike [inputs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inputs") @ExcludeMissing fun _inputs(): JsonField<List<RecordIdInput>> = inputs

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
         * Returns a mutable builder for constructing an instance of [BatchInputRecordIdInput].
         *
         * The following fields are required:
         * ```java
         * .inputs()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BatchInputRecordIdInput]. */
    class Builder internal constructor() {

        private var inputs: JsonField<MutableList<RecordIdInput>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(batchInputRecordIdInput: BatchInputRecordIdInput) = apply {
            inputs = batchInputRecordIdInput.inputs.map { it.toMutableList() }
            additionalProperties = batchInputRecordIdInput.additionalProperties.toMutableMap()
        }

        fun inputs(inputs: List<RecordIdInput>) = inputs(JsonField.of(inputs))

        /**
         * Sets [Builder.inputs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inputs] with a well-typed `List<RecordIdInput>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun inputs(inputs: JsonField<List<RecordIdInput>>) = apply {
            this.inputs = inputs.map { it.toMutableList() }
        }

        /**
         * Adds a single [RecordIdInput] to [inputs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInput(input: RecordIdInput) = apply {
            inputs =
                (inputs ?: JsonField.of(mutableListOf())).also {
                    checkKnown("inputs", it).add(input)
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
         * Returns an immutable instance of [BatchInputRecordIdInput].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .inputs()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BatchInputRecordIdInput =
            BatchInputRecordIdInput(
                checkRequired("inputs", inputs).map { it.toImmutable() },
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
    fun validate(): BatchInputRecordIdInput = apply {
        if (validated) {
            return@apply
        }

        inputs().forEach { it.validate() }
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
        (inputs.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BatchInputRecordIdInput &&
            inputs == other.inputs &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(inputs, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BatchInputRecordIdInput{inputs=$inputs, additionalProperties=$additionalProperties}"
}
