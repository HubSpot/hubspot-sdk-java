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
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class FilteringMetaData
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val includeHelpdeskRoutableTeamsOnly: JsonField<Boolean>,
    private val includeUnconfirmedUsers: JsonField<Boolean>,
    private val listProcessingTypes: JsonField<List<String>>,
    private val pipelineIds: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("includeHelpdeskRoutableTeamsOnly")
        @ExcludeMissing
        includeHelpdeskRoutableTeamsOnly: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("includeUnconfirmedUsers")
        @ExcludeMissing
        includeUnconfirmedUsers: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("listProcessingTypes")
        @ExcludeMissing
        listProcessingTypes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("pipelineIds")
        @ExcludeMissing
        pipelineIds: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        includeHelpdeskRoutableTeamsOnly,
        includeUnconfirmedUsers,
        listProcessingTypes,
        pipelineIds,
        mutableMapOf(),
    )

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun includeHelpdeskRoutableTeamsOnly(): Boolean =
        includeHelpdeskRoutableTeamsOnly.getRequired("includeHelpdeskRoutableTeamsOnly")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun includeUnconfirmedUsers(): Boolean =
        includeUnconfirmedUsers.getRequired("includeUnconfirmedUsers")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun listProcessingTypes(): List<String> = listProcessingTypes.getRequired("listProcessingTypes")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pipelineIds(): List<String> = pipelineIds.getRequired("pipelineIds")

    /**
     * Returns the raw JSON value of [includeHelpdeskRoutableTeamsOnly].
     *
     * Unlike [includeHelpdeskRoutableTeamsOnly], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("includeHelpdeskRoutableTeamsOnly")
    @ExcludeMissing
    fun _includeHelpdeskRoutableTeamsOnly(): JsonField<Boolean> = includeHelpdeskRoutableTeamsOnly

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
     * Returns the raw JSON value of [listProcessingTypes].
     *
     * Unlike [listProcessingTypes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("listProcessingTypes")
    @ExcludeMissing
    fun _listProcessingTypes(): JsonField<List<String>> = listProcessingTypes

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
         * .includeHelpdeskRoutableTeamsOnly()
         * .includeUnconfirmedUsers()
         * .listProcessingTypes()
         * .pipelineIds()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FilteringMetaData]. */
    class Builder internal constructor() {

        private var includeHelpdeskRoutableTeamsOnly: JsonField<Boolean>? = null
        private var includeUnconfirmedUsers: JsonField<Boolean>? = null
        private var listProcessingTypes: JsonField<MutableList<String>>? = null
        private var pipelineIds: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(filteringMetaData: FilteringMetaData) = apply {
            includeHelpdeskRoutableTeamsOnly = filteringMetaData.includeHelpdeskRoutableTeamsOnly
            includeUnconfirmedUsers = filteringMetaData.includeUnconfirmedUsers
            listProcessingTypes = filteringMetaData.listProcessingTypes.map { it.toMutableList() }
            pipelineIds = filteringMetaData.pipelineIds.map { it.toMutableList() }
            additionalProperties = filteringMetaData.additionalProperties.toMutableMap()
        }

        fun includeHelpdeskRoutableTeamsOnly(includeHelpdeskRoutableTeamsOnly: Boolean) =
            includeHelpdeskRoutableTeamsOnly(JsonField.of(includeHelpdeskRoutableTeamsOnly))

        /**
         * Sets [Builder.includeHelpdeskRoutableTeamsOnly] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includeHelpdeskRoutableTeamsOnly] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun includeHelpdeskRoutableTeamsOnly(includeHelpdeskRoutableTeamsOnly: JsonField<Boolean>) =
            apply {
                this.includeHelpdeskRoutableTeamsOnly = includeHelpdeskRoutableTeamsOnly
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

        fun listProcessingTypes(listProcessingTypes: List<String>) =
            listProcessingTypes(JsonField.of(listProcessingTypes))

        /**
         * Sets [Builder.listProcessingTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.listProcessingTypes] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun listProcessingTypes(listProcessingTypes: JsonField<List<String>>) = apply {
            this.listProcessingTypes = listProcessingTypes.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [listProcessingTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addListProcessingType(listProcessingType: String) = apply {
            listProcessingTypes =
                (listProcessingTypes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("listProcessingTypes", it).add(listProcessingType)
                }
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
         * .includeHelpdeskRoutableTeamsOnly()
         * .includeUnconfirmedUsers()
         * .listProcessingTypes()
         * .pipelineIds()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FilteringMetaData =
            FilteringMetaData(
                checkRequired("includeHelpdeskRoutableTeamsOnly", includeHelpdeskRoutableTeamsOnly),
                checkRequired("includeUnconfirmedUsers", includeUnconfirmedUsers),
                checkRequired("listProcessingTypes", listProcessingTypes).map { it.toImmutable() },
                checkRequired("pipelineIds", pipelineIds).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FilteringMetaData = apply {
        if (validated) {
            return@apply
        }

        includeHelpdeskRoutableTeamsOnly()
        includeUnconfirmedUsers()
        listProcessingTypes()
        pipelineIds()
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
        (if (includeHelpdeskRoutableTeamsOnly.asKnown().isPresent) 1 else 0) +
            (if (includeUnconfirmedUsers.asKnown().isPresent) 1 else 0) +
            (listProcessingTypes.asKnown().getOrNull()?.size ?: 0) +
            (pipelineIds.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FilteringMetaData &&
            includeHelpdeskRoutableTeamsOnly == other.includeHelpdeskRoutableTeamsOnly &&
            includeUnconfirmedUsers == other.includeUnconfirmedUsers &&
            listProcessingTypes == other.listProcessingTypes &&
            pipelineIds == other.pipelineIds &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            includeHelpdeskRoutableTeamsOnly,
            includeUnconfirmedUsers,
            listProcessingTypes,
            pipelineIds,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FilteringMetaData{includeHelpdeskRoutableTeamsOnly=$includeHelpdeskRoutableTeamsOnly, includeUnconfirmedUsers=$includeUnconfirmedUsers, listProcessingTypes=$listProcessingTypes, pipelineIds=$pipelineIds, additionalProperties=$additionalProperties}"
}
