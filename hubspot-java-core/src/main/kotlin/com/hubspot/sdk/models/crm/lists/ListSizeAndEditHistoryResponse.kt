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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class ListSizeAndEditHistoryResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val editHistory: JsonField<List<OffsetDateTime>>,
    private val sizeHistory: JsonField<List<ListSizeDataPoint>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("editHistory")
        @ExcludeMissing
        editHistory: JsonField<List<OffsetDateTime>> = JsonMissing.of(),
        @JsonProperty("sizeHistory")
        @ExcludeMissing
        sizeHistory: JsonField<List<ListSizeDataPoint>> = JsonMissing.of(),
    ) : this(editHistory, sizeHistory, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun editHistory(): List<OffsetDateTime> = editHistory.getRequired("editHistory")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sizeHistory(): List<ListSizeDataPoint> = sizeHistory.getRequired("sizeHistory")

    /**
     * Returns the raw JSON value of [editHistory].
     *
     * Unlike [editHistory], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("editHistory")
    @ExcludeMissing
    fun _editHistory(): JsonField<List<OffsetDateTime>> = editHistory

    /**
     * Returns the raw JSON value of [sizeHistory].
     *
     * Unlike [sizeHistory], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sizeHistory")
    @ExcludeMissing
    fun _sizeHistory(): JsonField<List<ListSizeDataPoint>> = sizeHistory

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
         * [ListSizeAndEditHistoryResponse].
         *
         * The following fields are required:
         * ```java
         * .editHistory()
         * .sizeHistory()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ListSizeAndEditHistoryResponse]. */
    class Builder internal constructor() {

        private var editHistory: JsonField<MutableList<OffsetDateTime>>? = null
        private var sizeHistory: JsonField<MutableList<ListSizeDataPoint>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(listSizeAndEditHistoryResponse: ListSizeAndEditHistoryResponse) = apply {
            editHistory = listSizeAndEditHistoryResponse.editHistory.map { it.toMutableList() }
            sizeHistory = listSizeAndEditHistoryResponse.sizeHistory.map { it.toMutableList() }
            additionalProperties =
                listSizeAndEditHistoryResponse.additionalProperties.toMutableMap()
        }

        fun editHistory(editHistory: List<OffsetDateTime>) = editHistory(JsonField.of(editHistory))

        /**
         * Sets [Builder.editHistory] to an arbitrary JSON value.
         *
         * You should usually call [Builder.editHistory] with a well-typed `List<OffsetDateTime>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun editHistory(editHistory: JsonField<List<OffsetDateTime>>) = apply {
            this.editHistory = editHistory.map { it.toMutableList() }
        }

        /**
         * Adds a single [OffsetDateTime] to [Builder.editHistory].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEditHistory(editHistory: OffsetDateTime) = apply {
            this.editHistory =
                (this.editHistory ?: JsonField.of(mutableListOf())).also {
                    checkKnown("editHistory", it).add(editHistory)
                }
        }

        fun sizeHistory(sizeHistory: List<ListSizeDataPoint>) =
            sizeHistory(JsonField.of(sizeHistory))

        /**
         * Sets [Builder.sizeHistory] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sizeHistory] with a well-typed `List<ListSizeDataPoint>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun sizeHistory(sizeHistory: JsonField<List<ListSizeDataPoint>>) = apply {
            this.sizeHistory = sizeHistory.map { it.toMutableList() }
        }

        /**
         * Adds a single [ListSizeDataPoint] to [Builder.sizeHistory].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSizeHistory(sizeHistory: ListSizeDataPoint) = apply {
            this.sizeHistory =
                (this.sizeHistory ?: JsonField.of(mutableListOf())).also {
                    checkKnown("sizeHistory", it).add(sizeHistory)
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
         * Returns an immutable instance of [ListSizeAndEditHistoryResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .editHistory()
         * .sizeHistory()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ListSizeAndEditHistoryResponse =
            ListSizeAndEditHistoryResponse(
                checkRequired("editHistory", editHistory).map { it.toImmutable() },
                checkRequired("sizeHistory", sizeHistory).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ListSizeAndEditHistoryResponse = apply {
        if (validated) {
            return@apply
        }

        editHistory()
        sizeHistory().forEach { it.validate() }
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
        (editHistory.asKnown().getOrNull()?.size ?: 0) +
            (sizeHistory.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ListSizeAndEditHistoryResponse &&
            editHistory == other.editHistory &&
            sizeHistory == other.sizeHistory &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(editHistory, sizeHistory, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ListSizeAndEditHistoryResponse{editHistory=$editHistory, sizeHistory=$sizeHistory, additionalProperties=$additionalProperties}"
}
