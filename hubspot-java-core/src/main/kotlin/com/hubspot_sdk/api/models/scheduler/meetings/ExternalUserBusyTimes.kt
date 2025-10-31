// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.scheduler.meetings

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
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class ExternalUserBusyTimes
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val busyTimes: JsonField<List<ExternalTimeRange>>,
    private val isOffline: JsonField<Boolean>,
    private val meetingsUser: JsonField<ExternalMeetingsUser>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("busyTimes")
        @ExcludeMissing
        busyTimes: JsonField<List<ExternalTimeRange>> = JsonMissing.of(),
        @JsonProperty("isOffline") @ExcludeMissing isOffline: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("meetingsUser")
        @ExcludeMissing
        meetingsUser: JsonField<ExternalMeetingsUser> = JsonMissing.of(),
    ) : this(busyTimes, isOffline, meetingsUser, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun busyTimes(): List<ExternalTimeRange> = busyTimes.getRequired("busyTimes")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isOffline(): Boolean = isOffline.getRequired("isOffline")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun meetingsUser(): ExternalMeetingsUser = meetingsUser.getRequired("meetingsUser")

    /**
     * Returns the raw JSON value of [busyTimes].
     *
     * Unlike [busyTimes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("busyTimes")
    @ExcludeMissing
    fun _busyTimes(): JsonField<List<ExternalTimeRange>> = busyTimes

    /**
     * Returns the raw JSON value of [isOffline].
     *
     * Unlike [isOffline], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isOffline") @ExcludeMissing fun _isOffline(): JsonField<Boolean> = isOffline

    /**
     * Returns the raw JSON value of [meetingsUser].
     *
     * Unlike [meetingsUser], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meetingsUser")
    @ExcludeMissing
    fun _meetingsUser(): JsonField<ExternalMeetingsUser> = meetingsUser

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
         * Returns a mutable builder for constructing an instance of [ExternalUserBusyTimes].
         *
         * The following fields are required:
         * ```java
         * .busyTimes()
         * .isOffline()
         * .meetingsUser()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalUserBusyTimes]. */
    class Builder internal constructor() {

        private var busyTimes: JsonField<MutableList<ExternalTimeRange>>? = null
        private var isOffline: JsonField<Boolean>? = null
        private var meetingsUser: JsonField<ExternalMeetingsUser>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalUserBusyTimes: ExternalUserBusyTimes) = apply {
            busyTimes = externalUserBusyTimes.busyTimes.map { it.toMutableList() }
            isOffline = externalUserBusyTimes.isOffline
            meetingsUser = externalUserBusyTimes.meetingsUser
            additionalProperties = externalUserBusyTimes.additionalProperties.toMutableMap()
        }

        fun busyTimes(busyTimes: List<ExternalTimeRange>) = busyTimes(JsonField.of(busyTimes))

        /**
         * Sets [Builder.busyTimes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.busyTimes] with a well-typed `List<ExternalTimeRange>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun busyTimes(busyTimes: JsonField<List<ExternalTimeRange>>) = apply {
            this.busyTimes = busyTimes.map { it.toMutableList() }
        }

        /**
         * Adds a single [ExternalTimeRange] to [busyTimes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBusyTime(busyTime: ExternalTimeRange) = apply {
            busyTimes =
                (busyTimes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("busyTimes", it).add(busyTime)
                }
        }

        fun isOffline(isOffline: Boolean) = isOffline(JsonField.of(isOffline))

        /**
         * Sets [Builder.isOffline] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isOffline] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isOffline(isOffline: JsonField<Boolean>) = apply { this.isOffline = isOffline }

        fun meetingsUser(meetingsUser: ExternalMeetingsUser) =
            meetingsUser(JsonField.of(meetingsUser))

        /**
         * Sets [Builder.meetingsUser] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meetingsUser] with a well-typed [ExternalMeetingsUser]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun meetingsUser(meetingsUser: JsonField<ExternalMeetingsUser>) = apply {
            this.meetingsUser = meetingsUser
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
         * Returns an immutable instance of [ExternalUserBusyTimes].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .busyTimes()
         * .isOffline()
         * .meetingsUser()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalUserBusyTimes =
            ExternalUserBusyTimes(
                checkRequired("busyTimes", busyTimes).map { it.toImmutable() },
                checkRequired("isOffline", isOffline),
                checkRequired("meetingsUser", meetingsUser),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalUserBusyTimes = apply {
        if (validated) {
            return@apply
        }

        busyTimes().forEach { it.validate() }
        isOffline()
        meetingsUser().validate()
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
        (busyTimes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (isOffline.asKnown().isPresent) 1 else 0) +
            (meetingsUser.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalUserBusyTimes &&
            busyTimes == other.busyTimes &&
            isOffline == other.isOffline &&
            meetingsUser == other.meetingsUser &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(busyTimes, isOffline, meetingsUser, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalUserBusyTimes{busyTimes=$busyTimes, isOffline=$isOffline, meetingsUser=$meetingsUser, additionalProperties=$additionalProperties}"
}
