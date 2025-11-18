// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.v4

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
import kotlin.jvm.optionals.getOrNull

class ReportCreationResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val enqueueTime: JsonField<DateTime>,
    private val userEmail: JsonField<String>,
    private val userId: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("enqueueTime")
        @ExcludeMissing
        enqueueTime: JsonField<DateTime> = JsonMissing.of(),
        @JsonProperty("userEmail") @ExcludeMissing userEmail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("userId") @ExcludeMissing userId: JsonField<Int> = JsonMissing.of(),
    ) : this(enqueueTime, userEmail, userId, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun enqueueTime(): DateTime = enqueueTime.getRequired("enqueueTime")

    /**
     * Email of the user
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userEmail(): String = userEmail.getRequired("userEmail")

    /**
     * ID of the user
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userId(): Int = userId.getRequired("userId")

    /**
     * Returns the raw JSON value of [enqueueTime].
     *
     * Unlike [enqueueTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enqueueTime")
    @ExcludeMissing
    fun _enqueueTime(): JsonField<DateTime> = enqueueTime

    /**
     * Returns the raw JSON value of [userEmail].
     *
     * Unlike [userEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("userEmail") @ExcludeMissing fun _userEmail(): JsonField<String> = userEmail

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("userId") @ExcludeMissing fun _userId(): JsonField<Int> = userId

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
         * Returns a mutable builder for constructing an instance of [ReportCreationResponse].
         *
         * The following fields are required:
         * ```java
         * .enqueueTime()
         * .userEmail()
         * .userId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReportCreationResponse]. */
    class Builder internal constructor() {

        private var enqueueTime: JsonField<DateTime>? = null
        private var userEmail: JsonField<String>? = null
        private var userId: JsonField<Int>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(reportCreationResponse: ReportCreationResponse) = apply {
            enqueueTime = reportCreationResponse.enqueueTime
            userEmail = reportCreationResponse.userEmail
            userId = reportCreationResponse.userId
            additionalProperties = reportCreationResponse.additionalProperties.toMutableMap()
        }

        fun enqueueTime(enqueueTime: DateTime) = enqueueTime(JsonField.of(enqueueTime))

        /**
         * Sets [Builder.enqueueTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enqueueTime] with a well-typed [DateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun enqueueTime(enqueueTime: JsonField<DateTime>) = apply { this.enqueueTime = enqueueTime }

        /** Email of the user */
        fun userEmail(userEmail: String) = userEmail(JsonField.of(userEmail))

        /**
         * Sets [Builder.userEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userEmail] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun userEmail(userEmail: JsonField<String>) = apply { this.userEmail = userEmail }

        /** ID of the user */
        fun userId(userId: Int) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<Int>) = apply { this.userId = userId }

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
         * Returns an immutable instance of [ReportCreationResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .enqueueTime()
         * .userEmail()
         * .userId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ReportCreationResponse =
            ReportCreationResponse(
                checkRequired("enqueueTime", enqueueTime),
                checkRequired("userEmail", userEmail),
                checkRequired("userId", userId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ReportCreationResponse = apply {
        if (validated) {
            return@apply
        }

        enqueueTime().validate()
        userEmail()
        userId()
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
        (enqueueTime.asKnown().getOrNull()?.validity() ?: 0) +
            (if (userEmail.asKnown().isPresent) 1 else 0) +
            (if (userId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReportCreationResponse &&
            enqueueTime == other.enqueueTime &&
            userEmail == other.userEmail &&
            userId == other.userId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(enqueueTime, userEmail, userId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ReportCreationResponse{enqueueTime=$enqueueTime, userEmail=$userEmail, userId=$userId, additionalProperties=$additionalProperties}"
}
