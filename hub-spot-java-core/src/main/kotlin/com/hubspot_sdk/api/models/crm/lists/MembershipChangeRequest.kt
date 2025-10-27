// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

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

/** The IDs of the records to add and/or remove from a list. */
class MembershipChangeRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val recordIdsToAdd: JsonField<List<String>>,
    private val recordIdsToRemove: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("recordIdsToAdd")
        @ExcludeMissing
        recordIdsToAdd: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("recordIdsToRemove")
        @ExcludeMissing
        recordIdsToRemove: JsonField<List<String>> = JsonMissing.of(),
    ) : this(recordIdsToAdd, recordIdsToRemove, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recordIdsToAdd(): List<String> = recordIdsToAdd.getRequired("recordIdsToAdd")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recordIdsToRemove(): List<String> = recordIdsToRemove.getRequired("recordIdsToRemove")

    /**
     * Returns the raw JSON value of [recordIdsToAdd].
     *
     * Unlike [recordIdsToAdd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("recordIdsToAdd")
    @ExcludeMissing
    fun _recordIdsToAdd(): JsonField<List<String>> = recordIdsToAdd

    /**
     * Returns the raw JSON value of [recordIdsToRemove].
     *
     * Unlike [recordIdsToRemove], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("recordIdsToRemove")
    @ExcludeMissing
    fun _recordIdsToRemove(): JsonField<List<String>> = recordIdsToRemove

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
         * Returns a mutable builder for constructing an instance of [MembershipChangeRequest].
         *
         * The following fields are required:
         * ```java
         * .recordIdsToAdd()
         * .recordIdsToRemove()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MembershipChangeRequest]. */
    class Builder internal constructor() {

        private var recordIdsToAdd: JsonField<MutableList<String>>? = null
        private var recordIdsToRemove: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(membershipChangeRequest: MembershipChangeRequest) = apply {
            recordIdsToAdd = membershipChangeRequest.recordIdsToAdd.map { it.toMutableList() }
            recordIdsToRemove = membershipChangeRequest.recordIdsToRemove.map { it.toMutableList() }
            additionalProperties = membershipChangeRequest.additionalProperties.toMutableMap()
        }

        fun recordIdsToAdd(recordIdsToAdd: List<String>) =
            recordIdsToAdd(JsonField.of(recordIdsToAdd))

        /**
         * Sets [Builder.recordIdsToAdd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordIdsToAdd] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordIdsToAdd(recordIdsToAdd: JsonField<List<String>>) = apply {
            this.recordIdsToAdd = recordIdsToAdd.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.recordIdsToAdd].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRecordIdsToAdd(recordIdsToAdd: String) = apply {
            this.recordIdsToAdd =
                (this.recordIdsToAdd ?: JsonField.of(mutableListOf())).also {
                    checkKnown("recordIdsToAdd", it).add(recordIdsToAdd)
                }
        }

        fun recordIdsToRemove(recordIdsToRemove: List<String>) =
            recordIdsToRemove(JsonField.of(recordIdsToRemove))

        /**
         * Sets [Builder.recordIdsToRemove] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordIdsToRemove] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun recordIdsToRemove(recordIdsToRemove: JsonField<List<String>>) = apply {
            this.recordIdsToRemove = recordIdsToRemove.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.recordIdsToRemove].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRecordIdsToRemove(recordIdsToRemove: String) = apply {
            this.recordIdsToRemove =
                (this.recordIdsToRemove ?: JsonField.of(mutableListOf())).also {
                    checkKnown("recordIdsToRemove", it).add(recordIdsToRemove)
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
         * Returns an immutable instance of [MembershipChangeRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .recordIdsToAdd()
         * .recordIdsToRemove()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MembershipChangeRequest =
            MembershipChangeRequest(
                checkRequired("recordIdsToAdd", recordIdsToAdd).map { it.toImmutable() },
                checkRequired("recordIdsToRemove", recordIdsToRemove).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MembershipChangeRequest = apply {
        if (validated) {
            return@apply
        }

        recordIdsToAdd()
        recordIdsToRemove()
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
        (recordIdsToAdd.asKnown().getOrNull()?.size ?: 0) +
            (recordIdsToRemove.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MembershipChangeRequest &&
            recordIdsToAdd == other.recordIdsToAdd &&
            recordIdsToRemove == other.recordIdsToRemove &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(recordIdsToAdd, recordIdsToRemove, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MembershipChangeRequest{recordIdsToAdd=$recordIdsToAdd, recordIdsToRemove=$recordIdsToRemove, additionalProperties=$additionalProperties}"
}
