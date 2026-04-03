// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.marketingevents

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

class SubscriberVidResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val vid: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("vid") @ExcludeMissing vid: JsonField<Int> = JsonMissing.of()
    ) : this(vid, mutableMapOf())

    /**
     * The internal ID of the contact
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun vid(): Int = vid.getRequired("vid")

    /**
     * Returns the raw JSON value of [vid].
     *
     * Unlike [vid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vid") @ExcludeMissing fun _vid(): JsonField<Int> = vid

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
         * Returns a mutable builder for constructing an instance of [SubscriberVidResponse].
         *
         * The following fields are required:
         * ```java
         * .vid()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubscriberVidResponse]. */
    class Builder internal constructor() {

        private var vid: JsonField<Int>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(subscriberVidResponse: SubscriberVidResponse) = apply {
            vid = subscriberVidResponse.vid
            additionalProperties = subscriberVidResponse.additionalProperties.toMutableMap()
        }

        /** The internal ID of the contact */
        fun vid(vid: Int) = vid(JsonField.of(vid))

        /**
         * Sets [Builder.vid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vid] with a well-typed [Int] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun vid(vid: JsonField<Int>) = apply { this.vid = vid }

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
         * Returns an immutable instance of [SubscriberVidResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .vid()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SubscriberVidResponse =
            SubscriberVidResponse(checkRequired("vid", vid), additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): SubscriberVidResponse = apply {
        if (validated) {
            return@apply
        }

        vid()
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
    @JvmSynthetic internal fun validity(): Int = (if (vid.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriberVidResponse &&
            vid == other.vid &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(vid, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SubscriberVidResponse{vid=$vid, additionalProperties=$additionalProperties}"
}
