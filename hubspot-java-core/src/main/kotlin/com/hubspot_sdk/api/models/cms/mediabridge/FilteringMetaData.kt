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
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class FilteringMetaData
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val includeUnconfirmedUsers: JsonField<Boolean>,
    private val pipelineIds: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("includeUnconfirmedUsers")
        @ExcludeMissing
        includeUnconfirmedUsers: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("pipelineIds")
        @ExcludeMissing
        pipelineIds: JsonField<List<String>> = JsonMissing.of(),
    ) : this(includeUnconfirmedUsers, pipelineIds, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun includeUnconfirmedUsers(): Boolean =
        includeUnconfirmedUsers.getRequired("includeUnconfirmedUsers")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pipelineIds(): List<String> = pipelineIds.getRequired("pipelineIds")

    /**
     * Returns the raw JSON value of [includeUnconfirmedUsers].
     *
     * Unlike [includeUnconfirmedUsers], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("includeUnconfirmedUsers")
    @ExcludeMissing
    fun _includeUnconfirmedUsers(): JsonField<Boolean> = includeUnconfirmedUsers

    /**
     * Returns the raw JSON value of [pipelineIds].
     *
     * Unlike [pipelineIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pipelineIds")
    @ExcludeMissing
    fun _pipelineIds(): JsonField<List<String>> = pipelineIds

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
         * Returns a mutable builder for constructing an instance of [FilteringMetaData].
         *
         * The following fields are required:
         * ```java
         * .includeUnconfirmedUsers()
         * .pipelineIds()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FilteringMetaData]. */
    class Builder internal constructor() {

        private var includeUnconfirmedUsers: JsonField<Boolean>? = null
        private var pipelineIds: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(filteringMetaData: FilteringMetaData) = apply {
            includeUnconfirmedUsers = filteringMetaData.includeUnconfirmedUsers
            pipelineIds = filteringMetaData.pipelineIds.map { it.toMutableList() }
            additionalProperties = filteringMetaData.additionalProperties.toMutableMap()
        }

        fun includeUnconfirmedUsers(includeUnconfirmedUsers: Boolean) =
            includeUnconfirmedUsers(JsonField.of(includeUnconfirmedUsers))

        /**
         * Sets [Builder.includeUnconfirmedUsers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includeUnconfirmedUsers] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun includeUnconfirmedUsers(includeUnconfirmedUsers: JsonField<Boolean>) = apply {
            this.includeUnconfirmedUsers = includeUnconfirmedUsers
        }

        fun pipelineIds(pipelineIds: List<String>) = pipelineIds(JsonField.of(pipelineIds))

        /**
         * Sets [Builder.pipelineIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pipelineIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pipelineIds(pipelineIds: JsonField<List<String>>) = apply {
            this.pipelineIds = pipelineIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [pipelineIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPipelineId(pipelineId: String) = apply {
            pipelineIds =
                (pipelineIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("pipelineIds", it).add(pipelineId)
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
         * Returns an immutable instance of [FilteringMetaData].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .includeUnconfirmedUsers()
         * .pipelineIds()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FilteringMetaData =
            FilteringMetaData(
                checkRequired("includeUnconfirmedUsers", includeUnconfirmedUsers),
                checkRequired("pipelineIds", pipelineIds).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FilteringMetaData = apply {
        if (validated) {
            return@apply
        }

        includeUnconfirmedUsers()
        pipelineIds()
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
        (if (includeUnconfirmedUsers.asKnown().isPresent) 1 else 0) +
            (pipelineIds.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FilteringMetaData &&
            includeUnconfirmedUsers == other.includeUnconfirmedUsers &&
            pipelineIds == other.pipelineIds &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(includeUnconfirmedUsers, pipelineIds, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FilteringMetaData{includeUnconfirmedUsers=$includeUnconfirmedUsers, pipelineIds=$pipelineIds, additionalProperties=$additionalProperties}"
}
