// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.subscriptions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects

class UnpauseRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val proposedNextBillingDate: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("proposedNextBillingDate")
        @ExcludeMissing
        proposedNextBillingDate: JsonField<Long> = JsonMissing.of()
    ) : this(proposedNextBillingDate, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun proposedNextBillingDate(): Long =
        proposedNextBillingDate.getRequired("proposedNextBillingDate")

    /**
     * Returns the raw JSON value of [proposedNextBillingDate].
     *
     * Unlike [proposedNextBillingDate], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("proposedNextBillingDate")
    @ExcludeMissing
    fun _proposedNextBillingDate(): JsonField<Long> = proposedNextBillingDate

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
         * Returns a mutable builder for constructing an instance of [UnpauseRequest].
         *
         * The following fields are required:
         * ```java
         * .proposedNextBillingDate()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UnpauseRequest]. */
    class Builder internal constructor() {

        private var proposedNextBillingDate: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(unpauseRequest: UnpauseRequest) = apply {
            proposedNextBillingDate = unpauseRequest.proposedNextBillingDate
            additionalProperties = unpauseRequest.additionalProperties.toMutableMap()
        }

        fun proposedNextBillingDate(proposedNextBillingDate: Long) =
            proposedNextBillingDate(JsonField.of(proposedNextBillingDate))

        /**
         * Sets [Builder.proposedNextBillingDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.proposedNextBillingDate] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun proposedNextBillingDate(proposedNextBillingDate: JsonField<Long>) = apply {
            this.proposedNextBillingDate = proposedNextBillingDate
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
         * Returns an immutable instance of [UnpauseRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .proposedNextBillingDate()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UnpauseRequest =
            UnpauseRequest(
                checkRequired("proposedNextBillingDate", proposedNextBillingDate),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UnpauseRequest = apply {
        if (validated) {
            return@apply
        }

        proposedNextBillingDate()
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
    internal fun validity(): Int = (if (proposedNextBillingDate.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UnpauseRequest &&
            proposedNextBillingDate == other.proposedNextBillingDate &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(proposedNextBillingDate, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UnpauseRequest{proposedNextBillingDate=$proposedNextBillingDate, additionalProperties=$additionalProperties}"
}
