// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

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
import kotlin.jvm.optionals.getOrNull

class ExternalOptionsMetaData
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val filter: JsonField<FilteringMetaData>,
    private val relatedObjectTypeId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("filter")
        @ExcludeMissing
        filter: JsonField<FilteringMetaData> = JsonMissing.of(),
        @JsonProperty("relatedObjectTypeId")
        @ExcludeMissing
        relatedObjectTypeId: JsonField<String> = JsonMissing.of(),
    ) : this(filter, relatedObjectTypeId, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filter(): Optional<FilteringMetaData> = filter.getOptional("filter")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun relatedObjectTypeId(): Optional<String> =
        relatedObjectTypeId.getOptional("relatedObjectTypeId")

    /**
     * Returns the raw JSON value of [filter].
     *
     * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<FilteringMetaData> = filter

    /**
     * Returns the raw JSON value of [relatedObjectTypeId].
     *
     * Unlike [relatedObjectTypeId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("relatedObjectTypeId")
    @ExcludeMissing
    fun _relatedObjectTypeId(): JsonField<String> = relatedObjectTypeId

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

        /** Returns a mutable builder for constructing an instance of [ExternalOptionsMetaData]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalOptionsMetaData]. */
    class Builder internal constructor() {

        private var filter: JsonField<FilteringMetaData> = JsonMissing.of()
        private var relatedObjectTypeId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalOptionsMetaData: ExternalOptionsMetaData) = apply {
            filter = externalOptionsMetaData.filter
            relatedObjectTypeId = externalOptionsMetaData.relatedObjectTypeId
            additionalProperties = externalOptionsMetaData.additionalProperties.toMutableMap()
        }

        fun filter(filter: FilteringMetaData) = filter(JsonField.of(filter))

        /**
         * Sets [Builder.filter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filter] with a well-typed [FilteringMetaData] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun filter(filter: JsonField<FilteringMetaData>) = apply { this.filter = filter }

        fun relatedObjectTypeId(relatedObjectTypeId: String) =
            relatedObjectTypeId(JsonField.of(relatedObjectTypeId))

        /**
         * Sets [Builder.relatedObjectTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.relatedObjectTypeId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun relatedObjectTypeId(relatedObjectTypeId: JsonField<String>) = apply {
            this.relatedObjectTypeId = relatedObjectTypeId
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
         * Returns an immutable instance of [ExternalOptionsMetaData].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ExternalOptionsMetaData =
            ExternalOptionsMetaData(
                filter,
                relatedObjectTypeId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalOptionsMetaData = apply {
        if (validated) {
            return@apply
        }

        filter().ifPresent { it.validate() }
        relatedObjectTypeId()
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
        (filter.asKnown().getOrNull()?.validity() ?: 0) +
            (if (relatedObjectTypeId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalOptionsMetaData &&
            filter == other.filter &&
            relatedObjectTypeId == other.relatedObjectTypeId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(filter, relatedObjectTypeId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalOptionsMetaData{filter=$filter, relatedObjectTypeId=$relatedObjectTypeId, additionalProperties=$additionalProperties}"
}
