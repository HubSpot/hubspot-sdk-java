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
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class JoinTimeAndRecordId
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val membershipTimestamp: JsonField<OffsetDateTime>,
    private val recordId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("membershipTimestamp")
        @ExcludeMissing
        membershipTimestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("recordId") @ExcludeMissing recordId: JsonField<String> = JsonMissing.of(),
    ) : this(membershipTimestamp, recordId, mutableMapOf())

    /**
     * The date and time when the record was added to the list.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun membershipTimestamp(): OffsetDateTime =
        membershipTimestamp.getRequired("membershipTimestamp")

    /**
     * The unique identifier of the record.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recordId(): String = recordId.getRequired("recordId")

    /**
     * Returns the raw JSON value of [membershipTimestamp].
     *
     * Unlike [membershipTimestamp], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("membershipTimestamp")
    @ExcludeMissing
    fun _membershipTimestamp(): JsonField<OffsetDateTime> = membershipTimestamp

    /**
     * Returns the raw JSON value of [recordId].
     *
     * Unlike [recordId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("recordId") @ExcludeMissing fun _recordId(): JsonField<String> = recordId

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
         * Returns a mutable builder for constructing an instance of [JoinTimeAndRecordId].
         *
         * The following fields are required:
         * ```java
         * .membershipTimestamp()
         * .recordId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [JoinTimeAndRecordId]. */
    class Builder internal constructor() {

        private var membershipTimestamp: JsonField<OffsetDateTime>? = null
        private var recordId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(joinTimeAndRecordId: JoinTimeAndRecordId) = apply {
            membershipTimestamp = joinTimeAndRecordId.membershipTimestamp
            recordId = joinTimeAndRecordId.recordId
            additionalProperties = joinTimeAndRecordId.additionalProperties.toMutableMap()
        }

        /** The date and time when the record was added to the list. */
        fun membershipTimestamp(membershipTimestamp: OffsetDateTime) =
            membershipTimestamp(JsonField.of(membershipTimestamp))

        /**
         * Sets [Builder.membershipTimestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.membershipTimestamp] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun membershipTimestamp(membershipTimestamp: JsonField<OffsetDateTime>) = apply {
            this.membershipTimestamp = membershipTimestamp
        }

        /** The unique identifier of the record. */
        fun recordId(recordId: String) = recordId(JsonField.of(recordId))

        /**
         * Sets [Builder.recordId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun recordId(recordId: JsonField<String>) = apply { this.recordId = recordId }

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
         * Returns an immutable instance of [JoinTimeAndRecordId].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .membershipTimestamp()
         * .recordId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): JoinTimeAndRecordId =
            JoinTimeAndRecordId(
                checkRequired("membershipTimestamp", membershipTimestamp),
                checkRequired("recordId", recordId),
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
    fun validate(): JoinTimeAndRecordId = apply {
        if (validated) {
            return@apply
        }

        membershipTimestamp()
        recordId()
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
        (if (membershipTimestamp.asKnown().isPresent) 1 else 0) +
            (if (recordId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JoinTimeAndRecordId &&
            membershipTimestamp == other.membershipTimestamp &&
            recordId == other.recordId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(membershipTimestamp, recordId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "JoinTimeAndRecordId{membershipTimestamp=$membershipTimestamp, recordId=$recordId, additionalProperties=$additionalProperties}"
}
