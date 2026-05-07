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

class CardMigrateViewsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val message: JsonField<String>,
    private val endedAt: JsonField<Long>,
    private val remainingPortalCount: JsonField<Long>,
    private val startedAt: JsonField<Long>,
    private val totalPortalCount: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("endedAt") @ExcludeMissing endedAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("remainingPortalCount")
        @ExcludeMissing
        remainingPortalCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("startedAt") @ExcludeMissing startedAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("totalPortalCount")
        @ExcludeMissing
        totalPortalCount: JsonField<Long> = JsonMissing.of(),
    ) : this(message, endedAt, remainingPortalCount, startedAt, totalPortalCount, mutableMapOf())

    /**
     * A human readable message describing the progress of the migration.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun message(): String = message.getRequired("message")

    /**
     * The timestamp for when the migration ended.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endedAt(): Optional<Long> = endedAt.getOptional("endedAt")

    /**
     * The number of portals that remain to be swapped from the Legacy CRM Card to the App Card
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun remainingPortalCount(): Optional<Long> =
        remainingPortalCount.getOptional("remainingPortalCount")

    /**
     * The timestamp for when the migration started.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startedAt(): Optional<Long> = startedAt.getOptional("startedAt")

    /**
     * The total number of portals that have access to the Legacy CRM Card
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalPortalCount(): Optional<Long> = totalPortalCount.getOptional("totalPortalCount")

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

    /**
     * Returns the raw JSON value of [endedAt].
     *
     * Unlike [endedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endedAt") @ExcludeMissing fun _endedAt(): JsonField<Long> = endedAt

    /**
     * Returns the raw JSON value of [remainingPortalCount].
     *
     * Unlike [remainingPortalCount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("remainingPortalCount")
    @ExcludeMissing
    fun _remainingPortalCount(): JsonField<Long> = remainingPortalCount

    /**
     * Returns the raw JSON value of [startedAt].
     *
     * Unlike [startedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startedAt") @ExcludeMissing fun _startedAt(): JsonField<Long> = startedAt

    /**
     * Returns the raw JSON value of [totalPortalCount].
     *
     * Unlike [totalPortalCount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("totalPortalCount")
    @ExcludeMissing
    fun _totalPortalCount(): JsonField<Long> = totalPortalCount

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
         * Returns a mutable builder for constructing an instance of [CardMigrateViewsResponse].
         *
         * The following fields are required:
         * ```java
         * .message()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardMigrateViewsResponse]. */
    class Builder internal constructor() {

        private var message: JsonField<String>? = null
        private var endedAt: JsonField<Long> = JsonMissing.of()
        private var remainingPortalCount: JsonField<Long> = JsonMissing.of()
        private var startedAt: JsonField<Long> = JsonMissing.of()
        private var totalPortalCount: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardMigrateViewsResponse: CardMigrateViewsResponse) = apply {
            message = cardMigrateViewsResponse.message
            endedAt = cardMigrateViewsResponse.endedAt
            remainingPortalCount = cardMigrateViewsResponse.remainingPortalCount
            startedAt = cardMigrateViewsResponse.startedAt
            totalPortalCount = cardMigrateViewsResponse.totalPortalCount
            additionalProperties = cardMigrateViewsResponse.additionalProperties.toMutableMap()
        }

        /** A human readable message describing the progress of the migration. */
        fun message(message: String) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

        /** The timestamp for when the migration ended. */
        fun endedAt(endedAt: Long) = endedAt(JsonField.of(endedAt))

        /**
         * Sets [Builder.endedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endedAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun endedAt(endedAt: JsonField<Long>) = apply { this.endedAt = endedAt }

        /**
         * The number of portals that remain to be swapped from the Legacy CRM Card to the App Card
         */
        fun remainingPortalCount(remainingPortalCount: Long) =
            remainingPortalCount(JsonField.of(remainingPortalCount))

        /**
         * Sets [Builder.remainingPortalCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.remainingPortalCount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun remainingPortalCount(remainingPortalCount: JsonField<Long>) = apply {
            this.remainingPortalCount = remainingPortalCount
        }

        /** The timestamp for when the migration started. */
        fun startedAt(startedAt: Long) = startedAt(JsonField.of(startedAt))

        /**
         * Sets [Builder.startedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startedAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun startedAt(startedAt: JsonField<Long>) = apply { this.startedAt = startedAt }

        /** The total number of portals that have access to the Legacy CRM Card */
        fun totalPortalCount(totalPortalCount: Long) =
            totalPortalCount(JsonField.of(totalPortalCount))

        /**
         * Sets [Builder.totalPortalCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalPortalCount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun totalPortalCount(totalPortalCount: JsonField<Long>) = apply {
            this.totalPortalCount = totalPortalCount
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
         * Returns an immutable instance of [CardMigrateViewsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .message()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardMigrateViewsResponse =
            CardMigrateViewsResponse(
                checkRequired("message", message),
                endedAt,
                remainingPortalCount,
                startedAt,
                totalPortalCount,
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
    fun validate(): CardMigrateViewsResponse = apply {
        if (validated) {
            return@apply
        }

        message()
        endedAt()
        remainingPortalCount()
        startedAt()
        totalPortalCount()
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
        (if (message.asKnown().isPresent) 1 else 0) +
            (if (endedAt.asKnown().isPresent) 1 else 0) +
            (if (remainingPortalCount.asKnown().isPresent) 1 else 0) +
            (if (startedAt.asKnown().isPresent) 1 else 0) +
            (if (totalPortalCount.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardMigrateViewsResponse &&
            message == other.message &&
            endedAt == other.endedAt &&
            remainingPortalCount == other.remainingPortalCount &&
            startedAt == other.startedAt &&
            totalPortalCount == other.totalPortalCount &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            message,
            endedAt,
            remainingPortalCount,
            startedAt,
            totalPortalCount,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardMigrateViewsResponse{message=$message, endedAt=$endedAt, remainingPortalCount=$remainingPortalCount, startedAt=$startedAt, totalPortalCount=$totalPortalCount, additionalProperties=$additionalProperties}"
}
