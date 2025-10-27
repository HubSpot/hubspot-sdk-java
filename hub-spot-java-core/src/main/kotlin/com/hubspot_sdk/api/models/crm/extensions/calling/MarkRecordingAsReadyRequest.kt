// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.calling

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects

class MarkRecordingAsReadyRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val engagementId: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("engagementId")
        @ExcludeMissing
        engagementId: JsonField<Long> = JsonMissing.of()
    ) : this(engagementId, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun engagementId(): Long = engagementId.getRequired("engagementId")

    /**
     * Returns the raw JSON value of [engagementId].
     *
     * Unlike [engagementId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("engagementId")
    @ExcludeMissing
    fun _engagementId(): JsonField<Long> = engagementId

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
         * Returns a mutable builder for constructing an instance of [MarkRecordingAsReadyRequest].
         *
         * The following fields are required:
         * ```java
         * .engagementId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MarkRecordingAsReadyRequest]. */
    class Builder internal constructor() {

        private var engagementId: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(markRecordingAsReadyRequest: MarkRecordingAsReadyRequest) = apply {
            engagementId = markRecordingAsReadyRequest.engagementId
            additionalProperties = markRecordingAsReadyRequest.additionalProperties.toMutableMap()
        }

        fun engagementId(engagementId: Long) = engagementId(JsonField.of(engagementId))

        /**
         * Sets [Builder.engagementId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.engagementId] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun engagementId(engagementId: JsonField<Long>) = apply { this.engagementId = engagementId }

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
         * Returns an immutable instance of [MarkRecordingAsReadyRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .engagementId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MarkRecordingAsReadyRequest =
            MarkRecordingAsReadyRequest(
                checkRequired("engagementId", engagementId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MarkRecordingAsReadyRequest = apply {
        if (validated) {
            return@apply
        }

        engagementId()
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
    @JvmSynthetic internal fun validity(): Int = (if (engagementId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MarkRecordingAsReadyRequest &&
            engagementId == other.engagementId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(engagementId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MarkRecordingAsReadyRequest{engagementId=$engagementId, additionalProperties=$additionalProperties}"
}
