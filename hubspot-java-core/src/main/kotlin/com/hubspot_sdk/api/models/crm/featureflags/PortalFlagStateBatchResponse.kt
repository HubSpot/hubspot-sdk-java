// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.featureflags

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

class PortalFlagStateBatchResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val portalFlagStates: JsonField<List<PortalFlagStateResponse>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("portalFlagStates")
        @ExcludeMissing
        portalFlagStates: JsonField<List<PortalFlagStateResponse>> = JsonMissing.of()
    ) : this(portalFlagStates, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun portalFlagStates(): List<PortalFlagStateResponse> =
        portalFlagStates.getRequired("portalFlagStates")

    /**
     * Returns the raw JSON value of [portalFlagStates].
     *
     * Unlike [portalFlagStates], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("portalFlagStates")
    @ExcludeMissing
    fun _portalFlagStates(): JsonField<List<PortalFlagStateResponse>> = portalFlagStates

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
         * Returns a mutable builder for constructing an instance of [PortalFlagStateBatchResponse].
         *
         * The following fields are required:
         * ```java
         * .portalFlagStates()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PortalFlagStateBatchResponse]. */
    class Builder internal constructor() {

        private var portalFlagStates: JsonField<MutableList<PortalFlagStateResponse>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(portalFlagStateBatchResponse: PortalFlagStateBatchResponse) = apply {
            portalFlagStates =
                portalFlagStateBatchResponse.portalFlagStates.map { it.toMutableList() }
            additionalProperties = portalFlagStateBatchResponse.additionalProperties.toMutableMap()
        }

        fun portalFlagStates(portalFlagStates: List<PortalFlagStateResponse>) =
            portalFlagStates(JsonField.of(portalFlagStates))

        /**
         * Sets [Builder.portalFlagStates] to an arbitrary JSON value.
         *
         * You should usually call [Builder.portalFlagStates] with a well-typed
         * `List<PortalFlagStateResponse>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun portalFlagStates(portalFlagStates: JsonField<List<PortalFlagStateResponse>>) = apply {
            this.portalFlagStates = portalFlagStates.map { it.toMutableList() }
        }

        /**
         * Adds a single [PortalFlagStateResponse] to [portalFlagStates].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPortalFlagState(portalFlagState: PortalFlagStateResponse) = apply {
            portalFlagStates =
                (portalFlagStates ?: JsonField.of(mutableListOf())).also {
                    checkKnown("portalFlagStates", it).add(portalFlagState)
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
         * Returns an immutable instance of [PortalFlagStateBatchResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .portalFlagStates()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PortalFlagStateBatchResponse =
            PortalFlagStateBatchResponse(
                checkRequired("portalFlagStates", portalFlagStates).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PortalFlagStateBatchResponse = apply {
        if (validated) {
            return@apply
        }

        portalFlagStates().forEach { it.validate() }
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
        (portalFlagStates.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PortalFlagStateBatchResponse &&
            portalFlagStates == other.portalFlagStates &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(portalFlagStates, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PortalFlagStateBatchResponse{portalFlagStates=$portalFlagStates, additionalProperties=$additionalProperties}"
}
