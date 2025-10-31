// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.v4

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class BatchInputPublicFetchAssociationsBatchRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val inputs: JsonField<List<PublicFetchAssociationsBatchRequest>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("inputs")
        @ExcludeMissing
        inputs: JsonField<List<PublicFetchAssociationsBatchRequest>> = JsonMissing.of()
    ) : this(inputs, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inputs(): List<PublicFetchAssociationsBatchRequest> = inputs.getRequired("inputs")

    /**
     * Returns the raw JSON value of [inputs].
     *
     * Unlike [inputs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inputs")
    @ExcludeMissing
    fun _inputs(): JsonField<List<PublicFetchAssociationsBatchRequest>> = inputs

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
         * [BatchInputPublicFetchAssociationsBatchRequest].
         *
         * The following fields are required:
         * ```java
         * .inputs()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BatchInputPublicFetchAssociationsBatchRequest]. */
    class Builder internal constructor() {

        private var inputs: JsonField<MutableList<PublicFetchAssociationsBatchRequest>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            batchInputPublicFetchAssociationsBatchRequest:
                BatchInputPublicFetchAssociationsBatchRequest
        ) = apply {
            inputs = batchInputPublicFetchAssociationsBatchRequest.inputs.map { it.toMutableList() }
            additionalProperties =
                batchInputPublicFetchAssociationsBatchRequest.additionalProperties.toMutableMap()
        }

        fun inputs(inputs: List<PublicFetchAssociationsBatchRequest>) = inputs(JsonField.of(inputs))

        /**
         * Sets [Builder.inputs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inputs] with a well-typed
         * `List<PublicFetchAssociationsBatchRequest>` value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun inputs(inputs: JsonField<List<PublicFetchAssociationsBatchRequest>>) = apply {
            this.inputs = inputs.map { it.toMutableList() }
        }

        /**
         * Adds a single [PublicFetchAssociationsBatchRequest] to [inputs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInput(input: PublicFetchAssociationsBatchRequest) = apply {
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
         * Returns an immutable instance of [BatchInputPublicFetchAssociationsBatchRequest].
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
        fun build(): BatchInputPublicFetchAssociationsBatchRequest =
            BatchInputPublicFetchAssociationsBatchRequest(
                checkRequired("inputs", inputs).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BatchInputPublicFetchAssociationsBatchRequest = apply {
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
        (inputs.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BatchInputPublicFetchAssociationsBatchRequest &&
            inputs == other.inputs &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(inputs, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BatchInputPublicFetchAssociationsBatchRequest{inputs=$inputs, additionalProperties=$additionalProperties}"
}
