// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.subscriptions

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

class PublicSubscriptionStatusesResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val recipient: JsonField<String>,
    private val subscriptionStatuses: JsonField<List<PublicSubscriptionStatus>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("recipient") @ExcludeMissing recipient: JsonField<String> = JsonMissing.of(),
        @JsonProperty("subscriptionStatuses")
        @ExcludeMissing
        subscriptionStatuses: JsonField<List<PublicSubscriptionStatus>> = JsonMissing.of(),
    ) : this(recipient, subscriptionStatuses, mutableMapOf())

    /**
     * Email address of the contact.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recipient(): String = recipient.getRequired("recipient")

    /**
     * A list of all of the contact's subscriptions statuses.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriptionStatuses(): List<PublicSubscriptionStatus> =
        subscriptionStatuses.getRequired("subscriptionStatuses")

    /**
     * Returns the raw JSON value of [recipient].
     *
     * Unlike [recipient], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("recipient") @ExcludeMissing fun _recipient(): JsonField<String> = recipient

    /**
     * Returns the raw JSON value of [subscriptionStatuses].
     *
     * Unlike [subscriptionStatuses], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("subscriptionStatuses")
    @ExcludeMissing
    fun _subscriptionStatuses(): JsonField<List<PublicSubscriptionStatus>> = subscriptionStatuses

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
         * [PublicSubscriptionStatusesResponse].
         *
         * The following fields are required:
         * ```java
         * .recipient()
         * .subscriptionStatuses()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicSubscriptionStatusesResponse]. */
    class Builder internal constructor() {

        private var recipient: JsonField<String>? = null
        private var subscriptionStatuses: JsonField<MutableList<PublicSubscriptionStatus>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicSubscriptionStatusesResponse: PublicSubscriptionStatusesResponse) =
            apply {
                recipient = publicSubscriptionStatusesResponse.recipient
                subscriptionStatuses =
                    publicSubscriptionStatusesResponse.subscriptionStatuses.map {
                        it.toMutableList()
                    }
                additionalProperties =
                    publicSubscriptionStatusesResponse.additionalProperties.toMutableMap()
            }

        /** Email address of the contact. */
        fun recipient(recipient: String) = recipient(JsonField.of(recipient))

        /**
         * Sets [Builder.recipient] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recipient] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recipient(recipient: JsonField<String>) = apply { this.recipient = recipient }

        /** A list of all of the contact's subscriptions statuses. */
        fun subscriptionStatuses(subscriptionStatuses: List<PublicSubscriptionStatus>) =
            subscriptionStatuses(JsonField.of(subscriptionStatuses))

        /**
         * Sets [Builder.subscriptionStatuses] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionStatuses] with a well-typed
         * `List<PublicSubscriptionStatus>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun subscriptionStatuses(subscriptionStatuses: JsonField<List<PublicSubscriptionStatus>>) =
            apply {
                this.subscriptionStatuses = subscriptionStatuses.map { it.toMutableList() }
            }

        /**
         * Adds a single [PublicSubscriptionStatus] to [subscriptionStatuses].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSubscriptionStatus(subscriptionStatus: PublicSubscriptionStatus) = apply {
            subscriptionStatuses =
                (subscriptionStatuses ?: JsonField.of(mutableListOf())).also {
                    checkKnown("subscriptionStatuses", it).add(subscriptionStatus)
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
         * Returns an immutable instance of [PublicSubscriptionStatusesResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .recipient()
         * .subscriptionStatuses()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicSubscriptionStatusesResponse =
            PublicSubscriptionStatusesResponse(
                checkRequired("recipient", recipient),
                checkRequired("subscriptionStatuses", subscriptionStatuses).map {
                    it.toImmutable()
                },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicSubscriptionStatusesResponse = apply {
        if (validated) {
            return@apply
        }

        recipient()
        subscriptionStatuses().forEach { it.validate() }
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
        (if (recipient.asKnown().isPresent) 1 else 0) +
            (subscriptionStatuses.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicSubscriptionStatusesResponse &&
            recipient == other.recipient &&
            subscriptionStatuses == other.subscriptionStatuses &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(recipient, subscriptionStatuses, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicSubscriptionStatusesResponse{recipient=$recipient, subscriptionStatuses=$subscriptionStatuses, additionalProperties=$additionalProperties}"
}
