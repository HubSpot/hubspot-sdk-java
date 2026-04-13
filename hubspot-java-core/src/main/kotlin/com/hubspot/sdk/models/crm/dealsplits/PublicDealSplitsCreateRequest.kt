// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.dealsplits

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

class PublicDealSplitsCreateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<Int>,
    private val splits: JsonField<List<PublicDealSplitInput>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("splits")
        @ExcludeMissing
        splits: JsonField<List<PublicDealSplitInput>> = JsonMissing.of(),
    ) : this(id, splits, mutableMapOf())

    /**
     * The unique identifier for the deal.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): Int = id.getRequired("id")

    /**
     * An array of deal split inputs, each containing an owner ID and a percentage of the deal
     * split.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun splits(): List<PublicDealSplitInput> = splits.getRequired("splits")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Int> = id

    /**
     * Returns the raw JSON value of [splits].
     *
     * Unlike [splits], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("splits")
    @ExcludeMissing
    fun _splits(): JsonField<List<PublicDealSplitInput>> = splits

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
         * [PublicDealSplitsCreateRequest].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .splits()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicDealSplitsCreateRequest]. */
    class Builder internal constructor() {

        private var id: JsonField<Int>? = null
        private var splits: JsonField<MutableList<PublicDealSplitInput>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicDealSplitsCreateRequest: PublicDealSplitsCreateRequest) = apply {
            id = publicDealSplitsCreateRequest.id
            splits = publicDealSplitsCreateRequest.splits.map { it.toMutableList() }
            additionalProperties = publicDealSplitsCreateRequest.additionalProperties.toMutableMap()
        }

        /** The unique identifier for the deal. */
        fun id(id: Int) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [Int] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<Int>) = apply { this.id = id }

        /**
         * An array of deal split inputs, each containing an owner ID and a percentage of the deal
         * split.
         */
        fun splits(splits: List<PublicDealSplitInput>) = splits(JsonField.of(splits))

        /**
         * Sets [Builder.splits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.splits] with a well-typed `List<PublicDealSplitInput>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun splits(splits: JsonField<List<PublicDealSplitInput>>) = apply {
            this.splits = splits.map { it.toMutableList() }
        }

        /**
         * Adds a single [PublicDealSplitInput] to [splits].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSplit(split: PublicDealSplitInput) = apply {
            splits =
                (splits ?: JsonField.of(mutableListOf())).also {
                    checkKnown("splits", it).add(split)
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
         * Returns an immutable instance of [PublicDealSplitsCreateRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .splits()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicDealSplitsCreateRequest =
            PublicDealSplitsCreateRequest(
                checkRequired("id", id),
                checkRequired("splits", splits).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicDealSplitsCreateRequest = apply {
        if (validated) {
            return@apply
        }

        id()
        splits().forEach { it.validate() }
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (splits.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicDealSplitsCreateRequest &&
            id == other.id &&
            splits == other.splits &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(id, splits, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicDealSplitsCreateRequest{id=$id, splits=$splits, additionalProperties=$additionalProperties}"
}
