// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.webhooks.webhooksubscriptions

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

class CrmObjectSnapshotBatchResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val snapshotResponses: JsonField<List<CrmObjectSnapshotResponse>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("snapshotResponses")
        @ExcludeMissing
        snapshotResponses: JsonField<List<CrmObjectSnapshotResponse>> = JsonMissing.of()
    ) : this(snapshotResponses, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun snapshotResponses(): List<CrmObjectSnapshotResponse> =
        snapshotResponses.getRequired("snapshotResponses")

    /**
     * Returns the raw JSON value of [snapshotResponses].
     *
     * Unlike [snapshotResponses], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("snapshotResponses")
    @ExcludeMissing
    fun _snapshotResponses(): JsonField<List<CrmObjectSnapshotResponse>> = snapshotResponses

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
         * [CrmObjectSnapshotBatchResponse].
         *
         * The following fields are required:
         * ```java
         * .snapshotResponses()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CrmObjectSnapshotBatchResponse]. */
    class Builder internal constructor() {

        private var snapshotResponses: JsonField<MutableList<CrmObjectSnapshotResponse>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(crmObjectSnapshotBatchResponse: CrmObjectSnapshotBatchResponse) = apply {
            snapshotResponses =
                crmObjectSnapshotBatchResponse.snapshotResponses.map { it.toMutableList() }
            additionalProperties =
                crmObjectSnapshotBatchResponse.additionalProperties.toMutableMap()
        }

        fun snapshotResponses(snapshotResponses: List<CrmObjectSnapshotResponse>) =
            snapshotResponses(JsonField.of(snapshotResponses))

        /**
         * Sets [Builder.snapshotResponses] to an arbitrary JSON value.
         *
         * You should usually call [Builder.snapshotResponses] with a well-typed
         * `List<CrmObjectSnapshotResponse>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun snapshotResponses(snapshotResponses: JsonField<List<CrmObjectSnapshotResponse>>) =
            apply {
                this.snapshotResponses = snapshotResponses.map { it.toMutableList() }
            }

        /**
         * Adds a single [CrmObjectSnapshotResponse] to [snapshotResponses].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSnapshotResponse(snapshotResponse: CrmObjectSnapshotResponse) = apply {
            snapshotResponses =
                (snapshotResponses ?: JsonField.of(mutableListOf())).also {
                    checkKnown("snapshotResponses", it).add(snapshotResponse)
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
         * Returns an immutable instance of [CrmObjectSnapshotBatchResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .snapshotResponses()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CrmObjectSnapshotBatchResponse =
            CrmObjectSnapshotBatchResponse(
                checkRequired("snapshotResponses", snapshotResponses).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CrmObjectSnapshotBatchResponse = apply {
        if (validated) {
            return@apply
        }

        snapshotResponses().forEach { it.validate() }
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
        (snapshotResponses.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CrmObjectSnapshotBatchResponse &&
            snapshotResponses == other.snapshotResponses &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(snapshotResponses, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CrmObjectSnapshotBatchResponse{snapshotResponses=$snapshotResponses, additionalProperties=$additionalProperties}"
}
