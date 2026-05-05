// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkKnown
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.toImmutable
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class MembershipsUpdateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val recordIdsMissing: JsonField<List<String>>,
    private val recordIdsRemoved: JsonField<List<String>>,
    private val recordsIdsAdded: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("recordIdsMissing")
        @ExcludeMissing
        recordIdsMissing: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("recordIdsRemoved")
        @ExcludeMissing
        recordIdsRemoved: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("recordsIdsAdded")
        @ExcludeMissing
        recordsIdsAdded: JsonField<List<String>> = JsonMissing.of(),
    ) : this(recordIdsMissing, recordIdsRemoved, recordsIdsAdded, mutableMapOf())

    /**
     * The IDs of the records that were `missing` (e.g. did not exist in the portal) and so were not
     * `added` or `removed`.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recordIdsMissing(): List<String> = recordIdsMissing.getRequired("recordIdsMissing")

    /**
     * The IDs of the records that were `removed` from the list.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recordIdsRemoved(): List<String> = recordIdsRemoved.getRequired("recordIdsRemoved")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recordsIdsAdded(): List<String> = recordsIdsAdded.getRequired("recordsIdsAdded")

    /**
     * Returns the raw JSON value of [recordIdsMissing].
     *
     * Unlike [recordIdsMissing], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("recordIdsMissing")
    @ExcludeMissing
    fun _recordIdsMissing(): JsonField<List<String>> = recordIdsMissing

    /**
     * Returns the raw JSON value of [recordIdsRemoved].
     *
     * Unlike [recordIdsRemoved], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("recordIdsRemoved")
    @ExcludeMissing
    fun _recordIdsRemoved(): JsonField<List<String>> = recordIdsRemoved

    /**
     * Returns the raw JSON value of [recordsIdsAdded].
     *
     * Unlike [recordsIdsAdded], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("recordsIdsAdded")
    @ExcludeMissing
    fun _recordsIdsAdded(): JsonField<List<String>> = recordsIdsAdded

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
         * Returns a mutable builder for constructing an instance of [MembershipsUpdateResponse].
         *
         * The following fields are required:
         * ```java
         * .recordIdsMissing()
         * .recordIdsRemoved()
         * .recordsIdsAdded()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MembershipsUpdateResponse]. */
    class Builder internal constructor() {

        private var recordIdsMissing: JsonField<MutableList<String>>? = null
        private var recordIdsRemoved: JsonField<MutableList<String>>? = null
        private var recordsIdsAdded: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(membershipsUpdateResponse: MembershipsUpdateResponse) = apply {
            recordIdsMissing = membershipsUpdateResponse.recordIdsMissing.map { it.toMutableList() }
            recordIdsRemoved = membershipsUpdateResponse.recordIdsRemoved.map { it.toMutableList() }
            recordsIdsAdded = membershipsUpdateResponse.recordsIdsAdded.map { it.toMutableList() }
            additionalProperties = membershipsUpdateResponse.additionalProperties.toMutableMap()
        }

        /**
         * The IDs of the records that were `missing` (e.g. did not exist in the portal) and so were
         * not `added` or `removed`.
         */
        fun recordIdsMissing(recordIdsMissing: List<String>) =
            recordIdsMissing(JsonField.of(recordIdsMissing))

        /**
         * Sets [Builder.recordIdsMissing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordIdsMissing] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordIdsMissing(recordIdsMissing: JsonField<List<String>>) = apply {
            this.recordIdsMissing = recordIdsMissing.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.recordIdsMissing].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRecordIdsMissing(recordIdsMissing: String) = apply {
            this.recordIdsMissing =
                (this.recordIdsMissing ?: JsonField.of(mutableListOf())).also {
                    checkKnown("recordIdsMissing", it).add(recordIdsMissing)
                }
        }

        /** The IDs of the records that were `removed` from the list. */
        fun recordIdsRemoved(recordIdsRemoved: List<String>) =
            recordIdsRemoved(JsonField.of(recordIdsRemoved))

        /**
         * Sets [Builder.recordIdsRemoved] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordIdsRemoved] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordIdsRemoved(recordIdsRemoved: JsonField<List<String>>) = apply {
            this.recordIdsRemoved = recordIdsRemoved.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.recordIdsRemoved].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRecordIdsRemoved(recordIdsRemoved: String) = apply {
            this.recordIdsRemoved =
                (this.recordIdsRemoved ?: JsonField.of(mutableListOf())).also {
                    checkKnown("recordIdsRemoved", it).add(recordIdsRemoved)
                }
        }

        fun recordsIdsAdded(recordsIdsAdded: List<String>) =
            recordsIdsAdded(JsonField.of(recordsIdsAdded))

        /**
         * Sets [Builder.recordsIdsAdded] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordsIdsAdded] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordsIdsAdded(recordsIdsAdded: JsonField<List<String>>) = apply {
            this.recordsIdsAdded = recordsIdsAdded.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.recordsIdsAdded].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRecordsIdsAdded(recordsIdsAdded: String) = apply {
            this.recordsIdsAdded =
                (this.recordsIdsAdded ?: JsonField.of(mutableListOf())).also {
                    checkKnown("recordsIdsAdded", it).add(recordsIdsAdded)
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
         * Returns an immutable instance of [MembershipsUpdateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .recordIdsMissing()
         * .recordIdsRemoved()
         * .recordsIdsAdded()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MembershipsUpdateResponse =
            MembershipsUpdateResponse(
                checkRequired("recordIdsMissing", recordIdsMissing).map { it.toImmutable() },
                checkRequired("recordIdsRemoved", recordIdsRemoved).map { it.toImmutable() },
                checkRequired("recordsIdsAdded", recordsIdsAdded).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): MembershipsUpdateResponse = apply {
        if (validated) {
            return@apply
        }

        recordIdsMissing()
        recordIdsRemoved()
        recordsIdsAdded()
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
        (recordIdsMissing.asKnown().getOrNull()?.size ?: 0) +
            (recordIdsRemoved.asKnown().getOrNull()?.size ?: 0) +
            (recordsIdsAdded.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MembershipsUpdateResponse &&
            recordIdsMissing == other.recordIdsMissing &&
            recordIdsRemoved == other.recordIdsRemoved &&
            recordsIdsAdded == other.recordsIdsAdded &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(recordIdsMissing, recordIdsRemoved, recordsIdsAdded, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MembershipsUpdateResponse{recordIdsMissing=$recordIdsMissing, recordIdsRemoved=$recordIdsRemoved, recordsIdsAdded=$recordsIdsAdded, additionalProperties=$additionalProperties}"
}
