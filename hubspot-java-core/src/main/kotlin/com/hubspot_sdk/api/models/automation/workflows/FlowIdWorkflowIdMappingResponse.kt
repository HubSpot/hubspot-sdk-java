// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

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

class FlowIdWorkflowIdMappingResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val flowId: JsonField<Int>,
    private val workflowId: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("flowId") @ExcludeMissing flowId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("workflowId") @ExcludeMissing workflowId: JsonField<Int> = JsonMissing.of(),
    ) : this(flowId, workflowId, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun flowId(): Int = flowId.getRequired("flowId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun workflowId(): Int = workflowId.getRequired("workflowId")

    /**
     * Returns the raw JSON value of [flowId].
     *
     * Unlike [flowId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("flowId") @ExcludeMissing fun _flowId(): JsonField<Int> = flowId

    /**
     * Returns the raw JSON value of [workflowId].
     *
     * Unlike [workflowId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("workflowId") @ExcludeMissing fun _workflowId(): JsonField<Int> = workflowId

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
         * [FlowIdWorkflowIdMappingResponse].
         *
         * The following fields are required:
         * ```java
         * .flowId()
         * .workflowId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FlowIdWorkflowIdMappingResponse]. */
    class Builder internal constructor() {

        private var flowId: JsonField<Int>? = null
        private var workflowId: JsonField<Int>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(flowIdWorkflowIdMappingResponse: FlowIdWorkflowIdMappingResponse) =
            apply {
                flowId = flowIdWorkflowIdMappingResponse.flowId
                workflowId = flowIdWorkflowIdMappingResponse.workflowId
                additionalProperties =
                    flowIdWorkflowIdMappingResponse.additionalProperties.toMutableMap()
            }

        fun flowId(flowId: Int) = flowId(JsonField.of(flowId))

        /**
         * Sets [Builder.flowId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.flowId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun flowId(flowId: JsonField<Int>) = apply { this.flowId = flowId }

        fun workflowId(workflowId: Int) = workflowId(JsonField.of(workflowId))

        /**
         * Sets [Builder.workflowId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.workflowId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun workflowId(workflowId: JsonField<Int>) = apply { this.workflowId = workflowId }

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
         * Returns an immutable instance of [FlowIdWorkflowIdMappingResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .flowId()
         * .workflowId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FlowIdWorkflowIdMappingResponse =
            FlowIdWorkflowIdMappingResponse(
                checkRequired("flowId", flowId),
                checkRequired("workflowId", workflowId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FlowIdWorkflowIdMappingResponse = apply {
        if (validated) {
            return@apply
        }

        flowId()
        workflowId()
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
        (if (flowId.asKnown().isPresent) 1 else 0) + (if (workflowId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FlowIdWorkflowIdMappingResponse &&
            flowId == other.flowId &&
            workflowId == other.workflowId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(flowId, workflowId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FlowIdWorkflowIdMappingResponse{flowId=$flowId, workflowId=$workflowId, additionalProperties=$additionalProperties}"
}
