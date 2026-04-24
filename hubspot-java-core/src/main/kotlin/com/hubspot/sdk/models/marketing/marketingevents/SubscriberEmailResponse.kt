// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.marketingevents

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
import java.util.Collections
import java.util.Objects

class SubscriberEmailResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val email: JsonField<String>,
    private val vid: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vid") @ExcludeMissing vid: JsonField<Long> = JsonMissing.of(),
    ) : this(email, vid, mutableMapOf())

    /**
     * The email of the contact
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun email(): String = email.getRequired("email")

    /**
     * The internal ID of the contact
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun vid(): Long = vid.getRequired("vid")

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [vid].
     *
     * Unlike [vid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vid") @ExcludeMissing fun _vid(): JsonField<Long> = vid

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
         * Returns a mutable builder for constructing an instance of [SubscriberEmailResponse].
         *
         * The following fields are required:
         * ```java
         * .email()
         * .vid()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubscriberEmailResponse]. */
    class Builder internal constructor() {

        private var email: JsonField<String>? = null
        private var vid: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(subscriberEmailResponse: SubscriberEmailResponse) = apply {
            email = subscriberEmailResponse.email
            vid = subscriberEmailResponse.vid
            additionalProperties = subscriberEmailResponse.additionalProperties.toMutableMap()
        }

        /** The email of the contact */
        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** The internal ID of the contact */
        fun vid(vid: Long) = vid(JsonField.of(vid))

        /**
         * Sets [Builder.vid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vid] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun vid(vid: JsonField<Long>) = apply { this.vid = vid }

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
         * Returns an immutable instance of [SubscriberEmailResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .email()
         * .vid()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SubscriberEmailResponse =
            SubscriberEmailResponse(
                checkRequired("email", email),
                checkRequired("vid", vid),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SubscriberEmailResponse = apply {
        if (validated) {
            return@apply
        }

        email()
        vid()
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
        (if (email.asKnown().isPresent) 1 else 0) + (if (vid.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriberEmailResponse &&
            email == other.email &&
            vid == other.vid &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(email, vid, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SubscriberEmailResponse{email=$email, vid=$vid, additionalProperties=$additionalProperties}"
}
