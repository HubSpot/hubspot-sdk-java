// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.dealsplits

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
import com.hubspot_sdk.api.models.crm.SimplePublicObject
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class DealToDealSplits
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val splits: JsonField<List<SimplePublicObject>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("splits")
        @ExcludeMissing
        splits: JsonField<List<SimplePublicObject>> = JsonMissing.of(),
    ) : this(id, splits, mutableMapOf())

    /**
     * The unique identifier for the deal associated with the deal splits.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * An array of deal split objects, each representing a portion of the deal assigned to an owner.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun splits(): List<SimplePublicObject> = splits.getRequired("splits")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [splits].
     *
     * Unlike [splits], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("splits")
    @ExcludeMissing
    fun _splits(): JsonField<List<SimplePublicObject>> = splits

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
         * Returns a mutable builder for constructing an instance of [DealToDealSplits].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .splits()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DealToDealSplits]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var splits: JsonField<MutableList<SimplePublicObject>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(dealToDealSplits: DealToDealSplits) = apply {
            id = dealToDealSplits.id
            splits = dealToDealSplits.splits.map { it.toMutableList() }
            additionalProperties = dealToDealSplits.additionalProperties.toMutableMap()
        }

        /** The unique identifier for the deal associated with the deal splits. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * An array of deal split objects, each representing a portion of the deal assigned to an
         * owner.
         */
        fun splits(splits: List<SimplePublicObject>) = splits(JsonField.of(splits))

        /**
         * Sets [Builder.splits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.splits] with a well-typed `List<SimplePublicObject>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun splits(splits: JsonField<List<SimplePublicObject>>) = apply {
            this.splits = splits.map { it.toMutableList() }
        }

        /**
         * Adds a single [SimplePublicObject] to [splits].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSplit(split: SimplePublicObject) = apply {
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
         * Returns an immutable instance of [DealToDealSplits].
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
        fun build(): DealToDealSplits =
            DealToDealSplits(
                checkRequired("id", id),
                checkRequired("splits", splits).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DealToDealSplits = apply {
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (splits.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DealToDealSplits &&
            id == other.id &&
            splits == other.splits &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(id, splits, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DealToDealSplits{id=$id, splits=$splits, additionalProperties=$additionalProperties}"
}
