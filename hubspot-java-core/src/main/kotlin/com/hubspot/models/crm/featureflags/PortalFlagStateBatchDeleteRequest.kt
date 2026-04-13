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

class PortalFlagStateBatchDeleteRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val portalIds: JsonField<List<Int>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("portalIds")
        @ExcludeMissing
        portalIds: JsonField<List<Int>> = JsonMissing.of()
    ) : this(portalIds, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun portalIds(): List<Int> = portalIds.getRequired("portalIds")

    /**
     * Returns the raw JSON value of [portalIds].
     *
     * Unlike [portalIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("portalIds") @ExcludeMissing fun _portalIds(): JsonField<List<Int>> = portalIds

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
         * [PortalFlagStateBatchDeleteRequest].
         *
         * The following fields are required:
         * ```java
         * .portalIds()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PortalFlagStateBatchDeleteRequest]. */
    class Builder internal constructor() {

        private var portalIds: JsonField<MutableList<Int>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(portalFlagStateBatchDeleteRequest: PortalFlagStateBatchDeleteRequest) =
            apply {
                portalIds = portalFlagStateBatchDeleteRequest.portalIds.map { it.toMutableList() }
                additionalProperties =
                    portalFlagStateBatchDeleteRequest.additionalProperties.toMutableMap()
            }

        fun portalIds(portalIds: List<Int>) = portalIds(JsonField.of(portalIds))

        /**
         * Sets [Builder.portalIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.portalIds] with a well-typed `List<Int>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun portalIds(portalIds: JsonField<List<Int>>) = apply {
            this.portalIds = portalIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [Int] to [portalIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPortalId(portalId: Int) = apply {
            portalIds =
                (portalIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("portalIds", it).add(portalId)
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
         * Returns an immutable instance of [PortalFlagStateBatchDeleteRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .portalIds()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PortalFlagStateBatchDeleteRequest =
            PortalFlagStateBatchDeleteRequest(
                checkRequired("portalIds", portalIds).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PortalFlagStateBatchDeleteRequest = apply {
        if (validated) {
            return@apply
        }

        portalIds()
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
    @JvmSynthetic internal fun validity(): Int = (portalIds.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PortalFlagStateBatchDeleteRequest &&
            portalIds == other.portalIds &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(portalIds, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PortalFlagStateBatchDeleteRequest{portalIds=$portalIds, additionalProperties=$additionalProperties}"
}
