// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.webhooks

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

class CrmObjectSnapshotBatchRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val snapshotRequests: JsonField<List<CrmObjectSnapshotRequest>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("snapshotRequests")
        @ExcludeMissing
        snapshotRequests: JsonField<List<CrmObjectSnapshotRequest>> = JsonMissing.of()
    ) : this(snapshotRequests, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun snapshotRequests(): List<CrmObjectSnapshotRequest> =
        snapshotRequests.getRequired("snapshotRequests")

    /**
     * Returns the raw JSON value of [snapshotRequests].
     *
     * Unlike [snapshotRequests], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("snapshotRequests")
    @ExcludeMissing
    fun _snapshotRequests(): JsonField<List<CrmObjectSnapshotRequest>> = snapshotRequests

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
         * [CrmObjectSnapshotBatchRequest].
         *
         * The following fields are required:
         * ```java
         * .snapshotRequests()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CrmObjectSnapshotBatchRequest]. */
    class Builder internal constructor() {

        private var snapshotRequests: JsonField<MutableList<CrmObjectSnapshotRequest>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(crmObjectSnapshotBatchRequest: CrmObjectSnapshotBatchRequest) = apply {
            snapshotRequests =
                crmObjectSnapshotBatchRequest.snapshotRequests.map { it.toMutableList() }
            additionalProperties = crmObjectSnapshotBatchRequest.additionalProperties.toMutableMap()
        }

        fun snapshotRequests(snapshotRequests: List<CrmObjectSnapshotRequest>) =
            snapshotRequests(JsonField.of(snapshotRequests))

        /**
         * Sets [Builder.snapshotRequests] to an arbitrary JSON value.
         *
         * You should usually call [Builder.snapshotRequests] with a well-typed
         * `List<CrmObjectSnapshotRequest>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun snapshotRequests(snapshotRequests: JsonField<List<CrmObjectSnapshotRequest>>) = apply {
            this.snapshotRequests = snapshotRequests.map { it.toMutableList() }
        }

        /**
         * Adds a single [CrmObjectSnapshotRequest] to [snapshotRequests].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSnapshotRequest(snapshotRequest: CrmObjectSnapshotRequest) = apply {
            snapshotRequests =
                (snapshotRequests ?: JsonField.of(mutableListOf())).also {
                    checkKnown("snapshotRequests", it).add(snapshotRequest)
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
         * Returns an immutable instance of [CrmObjectSnapshotBatchRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .snapshotRequests()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CrmObjectSnapshotBatchRequest =
            CrmObjectSnapshotBatchRequest(
                checkRequired("snapshotRequests", snapshotRequests).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CrmObjectSnapshotBatchRequest = apply {
        if (validated) {
            return@apply
        }

        snapshotRequests().forEach { it.validate() }
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
        (snapshotRequests.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CrmObjectSnapshotBatchRequest &&
            snapshotRequests == other.snapshotRequests &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(snapshotRequests, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CrmObjectSnapshotBatchRequest{snapshotRequests=$snapshotRequests, additionalProperties=$additionalProperties}"
}
