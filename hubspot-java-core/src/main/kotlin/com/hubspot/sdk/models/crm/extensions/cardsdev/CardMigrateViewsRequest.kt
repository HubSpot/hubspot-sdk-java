// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.extensions.cardsdev

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
import java.util.Optional

class CardMigrateViewsRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val allowDuplicateAppCardIds: JsonField<Boolean>,
    private val appCardId: JsonField<Long>,
    private val legacyCrmCardId: JsonField<Long>,
    private val helpdeskAppCardId: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("allowDuplicateAppCardIds")
        @ExcludeMissing
        allowDuplicateAppCardIds: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("appCardId") @ExcludeMissing appCardId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("legacyCrmCardId")
        @ExcludeMissing
        legacyCrmCardId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("helpdeskAppCardId")
        @ExcludeMissing
        helpdeskAppCardId: JsonField<Long> = JsonMissing.of(),
    ) : this(
        allowDuplicateAppCardIds,
        appCardId,
        legacyCrmCardId,
        helpdeskAppCardId,
        mutableMapOf(),
    )

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun allowDuplicateAppCardIds(): Boolean =
        allowDuplicateAppCardIds.getRequired("allowDuplicateAppCardIds")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun appCardId(): Long = appCardId.getRequired("appCardId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun legacyCrmCardId(): Long = legacyCrmCardId.getRequired("legacyCrmCardId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun helpdeskAppCardId(): Optional<Long> = helpdeskAppCardId.getOptional("helpdeskAppCardId")

    /**
     * Returns the raw JSON value of [allowDuplicateAppCardIds].
     *
     * Unlike [allowDuplicateAppCardIds], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("allowDuplicateAppCardIds")
    @ExcludeMissing
    fun _allowDuplicateAppCardIds(): JsonField<Boolean> = allowDuplicateAppCardIds

    /**
     * Returns the raw JSON value of [appCardId].
     *
     * Unlike [appCardId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("appCardId") @ExcludeMissing fun _appCardId(): JsonField<Long> = appCardId

    /**
     * Returns the raw JSON value of [legacyCrmCardId].
     *
     * Unlike [legacyCrmCardId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("legacyCrmCardId")
    @ExcludeMissing
    fun _legacyCrmCardId(): JsonField<Long> = legacyCrmCardId

    /**
     * Returns the raw JSON value of [helpdeskAppCardId].
     *
     * Unlike [helpdeskAppCardId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("helpdeskAppCardId")
    @ExcludeMissing
    fun _helpdeskAppCardId(): JsonField<Long> = helpdeskAppCardId

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
         * Returns a mutable builder for constructing an instance of [CardMigrateViewsRequest].
         *
         * The following fields are required:
         * ```java
         * .allowDuplicateAppCardIds()
         * .appCardId()
         * .legacyCrmCardId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardMigrateViewsRequest]. */
    class Builder internal constructor() {

        private var allowDuplicateAppCardIds: JsonField<Boolean>? = null
        private var appCardId: JsonField<Long>? = null
        private var legacyCrmCardId: JsonField<Long>? = null
        private var helpdeskAppCardId: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardMigrateViewsRequest: CardMigrateViewsRequest) = apply {
            allowDuplicateAppCardIds = cardMigrateViewsRequest.allowDuplicateAppCardIds
            appCardId = cardMigrateViewsRequest.appCardId
            legacyCrmCardId = cardMigrateViewsRequest.legacyCrmCardId
            helpdeskAppCardId = cardMigrateViewsRequest.helpdeskAppCardId
            additionalProperties = cardMigrateViewsRequest.additionalProperties.toMutableMap()
        }

        fun allowDuplicateAppCardIds(allowDuplicateAppCardIds: Boolean) =
            allowDuplicateAppCardIds(JsonField.of(allowDuplicateAppCardIds))

        /**
         * Sets [Builder.allowDuplicateAppCardIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowDuplicateAppCardIds] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun allowDuplicateAppCardIds(allowDuplicateAppCardIds: JsonField<Boolean>) = apply {
            this.allowDuplicateAppCardIds = allowDuplicateAppCardIds
        }

        fun appCardId(appCardId: Long) = appCardId(JsonField.of(appCardId))

        /**
         * Sets [Builder.appCardId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.appCardId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun appCardId(appCardId: JsonField<Long>) = apply { this.appCardId = appCardId }

        fun legacyCrmCardId(legacyCrmCardId: Long) = legacyCrmCardId(JsonField.of(legacyCrmCardId))

        /**
         * Sets [Builder.legacyCrmCardId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legacyCrmCardId] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun legacyCrmCardId(legacyCrmCardId: JsonField<Long>) = apply {
            this.legacyCrmCardId = legacyCrmCardId
        }

        fun helpdeskAppCardId(helpdeskAppCardId: Long) =
            helpdeskAppCardId(JsonField.of(helpdeskAppCardId))

        /**
         * Sets [Builder.helpdeskAppCardId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.helpdeskAppCardId] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun helpdeskAppCardId(helpdeskAppCardId: JsonField<Long>) = apply {
            this.helpdeskAppCardId = helpdeskAppCardId
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
         * Returns an immutable instance of [CardMigrateViewsRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .allowDuplicateAppCardIds()
         * .appCardId()
         * .legacyCrmCardId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardMigrateViewsRequest =
            CardMigrateViewsRequest(
                checkRequired("allowDuplicateAppCardIds", allowDuplicateAppCardIds),
                checkRequired("appCardId", appCardId),
                checkRequired("legacyCrmCardId", legacyCrmCardId),
                helpdeskAppCardId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CardMigrateViewsRequest = apply {
        if (validated) {
            return@apply
        }

        allowDuplicateAppCardIds()
        appCardId()
        legacyCrmCardId()
        helpdeskAppCardId()
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
        (if (allowDuplicateAppCardIds.asKnown().isPresent) 1 else 0) +
            (if (appCardId.asKnown().isPresent) 1 else 0) +
            (if (legacyCrmCardId.asKnown().isPresent) 1 else 0) +
            (if (helpdeskAppCardId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardMigrateViewsRequest &&
            allowDuplicateAppCardIds == other.allowDuplicateAppCardIds &&
            appCardId == other.appCardId &&
            legacyCrmCardId == other.legacyCrmCardId &&
            helpdeskAppCardId == other.helpdeskAppCardId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            allowDuplicateAppCardIds,
            appCardId,
            legacyCrmCardId,
            helpdeskAppCardId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardMigrateViewsRequest{allowDuplicateAppCardIds=$allowDuplicateAppCardIds, appCardId=$appCardId, legacyCrmCardId=$legacyCrmCardId, helpdeskAppCardId=$helpdeskAppCardId, additionalProperties=$additionalProperties}"
}
