// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.featureflags

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

class PortalFlagStateBatchPutRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val portalStates: JsonField<List<BatchPortalEntry>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("portalStates")
        @ExcludeMissing
        portalStates: JsonField<List<BatchPortalEntry>> = JsonMissing.of()
    ) : this(portalStates, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun portalStates(): List<BatchPortalEntry> = portalStates.getRequired("portalStates")

    /**
     * Returns the raw JSON value of [portalStates].
     *
     * Unlike [portalStates], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("portalStates")
    @ExcludeMissing
    fun _portalStates(): JsonField<List<BatchPortalEntry>> = portalStates

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
         * [PortalFlagStateBatchPutRequest].
         *
         * The following fields are required:
         * ```java
         * .portalStates()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PortalFlagStateBatchPutRequest]. */
    class Builder internal constructor() {

        private var portalStates: JsonField<MutableList<BatchPortalEntry>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(portalFlagStateBatchPutRequest: PortalFlagStateBatchPutRequest) = apply {
            portalStates = portalFlagStateBatchPutRequest.portalStates.map { it.toMutableList() }
            additionalProperties =
                portalFlagStateBatchPutRequest.additionalProperties.toMutableMap()
        }

        fun portalStates(portalStates: List<BatchPortalEntry>) =
            portalStates(JsonField.of(portalStates))

        /**
         * Sets [Builder.portalStates] to an arbitrary JSON value.
         *
         * You should usually call [Builder.portalStates] with a well-typed `List<BatchPortalEntry>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun portalStates(portalStates: JsonField<List<BatchPortalEntry>>) = apply {
            this.portalStates = portalStates.map { it.toMutableList() }
        }

        /**
         * Adds a single [BatchPortalEntry] to [portalStates].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPortalState(portalState: BatchPortalEntry) = apply {
            portalStates =
                (portalStates ?: JsonField.of(mutableListOf())).also {
                    checkKnown("portalStates", it).add(portalState)
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
         * Returns an immutable instance of [PortalFlagStateBatchPutRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .portalStates()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PortalFlagStateBatchPutRequest =
            PortalFlagStateBatchPutRequest(
                checkRequired("portalStates", portalStates).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PortalFlagStateBatchPutRequest = apply {
        if (validated) {
            return@apply
        }

        portalStates().forEach { it.validate() }
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
        (portalStates.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PortalFlagStateBatchPutRequest &&
            portalStates == other.portalStates &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(portalStates, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PortalFlagStateBatchPutRequest{portalStates=$portalStates, additionalProperties=$additionalProperties}"
}
