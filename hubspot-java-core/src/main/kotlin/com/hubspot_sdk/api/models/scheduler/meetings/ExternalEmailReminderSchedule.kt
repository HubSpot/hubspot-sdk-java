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
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class ExternalEmailReminderSchedule
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val reminders: JsonField<List<ExternalReminder>>,
    private val shouldIncludeInviteDescription: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("reminders")
        @ExcludeMissing
        reminders: JsonField<List<ExternalReminder>> = JsonMissing.of(),
        @JsonProperty("shouldIncludeInviteDescription")
        @ExcludeMissing
        shouldIncludeInviteDescription: JsonField<Boolean> = JsonMissing.of(),
    ) : this(reminders, shouldIncludeInviteDescription, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reminders(): List<ExternalReminder> = reminders.getRequired("reminders")

    /**
     * Whether the invite description should be included in the reminder.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun shouldIncludeInviteDescription(): Boolean =
        shouldIncludeInviteDescription.getRequired("shouldIncludeInviteDescription")

    /**
     * Returns the raw JSON value of [reminders].
     *
     * Unlike [reminders], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reminders")
    @ExcludeMissing
    fun _reminders(): JsonField<List<ExternalReminder>> = reminders

    /**
     * Returns the raw JSON value of [shouldIncludeInviteDescription].
     *
     * Unlike [shouldIncludeInviteDescription], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("shouldIncludeInviteDescription")
    @ExcludeMissing
    fun _shouldIncludeInviteDescription(): JsonField<Boolean> = shouldIncludeInviteDescription

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
         * [ExternalEmailReminderSchedule].
         *
         * The following fields are required:
         * ```java
         * .reminders()
         * .shouldIncludeInviteDescription()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalEmailReminderSchedule]. */
    class Builder internal constructor() {

        private var reminders: JsonField<MutableList<ExternalReminder>>? = null
        private var shouldIncludeInviteDescription: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalEmailReminderSchedule: ExternalEmailReminderSchedule) = apply {
            reminders = externalEmailReminderSchedule.reminders.map { it.toMutableList() }
            shouldIncludeInviteDescription =
                externalEmailReminderSchedule.shouldIncludeInviteDescription
            additionalProperties = externalEmailReminderSchedule.additionalProperties.toMutableMap()
        }

        fun reminders(reminders: List<ExternalReminder>) = reminders(JsonField.of(reminders))

        /**
         * Sets [Builder.reminders] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reminders] with a well-typed `List<ExternalReminder>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun reminders(reminders: JsonField<List<ExternalReminder>>) = apply {
            this.reminders = reminders.map { it.toMutableList() }
        }

        /**
         * Adds a single [ExternalReminder] to [reminders].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addReminder(reminder: ExternalReminder) = apply {
            reminders =
                (reminders ?: JsonField.of(mutableListOf())).also {
                    checkKnown("reminders", it).add(reminder)
                }
        }

        /** Whether the invite description should be included in the reminder. */
        fun shouldIncludeInviteDescription(shouldIncludeInviteDescription: Boolean) =
            shouldIncludeInviteDescription(JsonField.of(shouldIncludeInviteDescription))

        /**
         * Sets [Builder.shouldIncludeInviteDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shouldIncludeInviteDescription] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun shouldIncludeInviteDescription(shouldIncludeInviteDescription: JsonField<Boolean>) =
            apply {
                this.shouldIncludeInviteDescription = shouldIncludeInviteDescription
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
         * Returns an immutable instance of [ExternalEmailReminderSchedule].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .reminders()
         * .shouldIncludeInviteDescription()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalEmailReminderSchedule =
            ExternalEmailReminderSchedule(
                checkRequired("reminders", reminders).map { it.toImmutable() },
                checkRequired("shouldIncludeInviteDescription", shouldIncludeInviteDescription),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalEmailReminderSchedule = apply {
        if (validated) {
            return@apply
        }

        reminders().forEach { it.validate() }
        shouldIncludeInviteDescription()
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
        (reminders.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (shouldIncludeInviteDescription.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalEmailReminderSchedule &&
            reminders == other.reminders &&
            shouldIncludeInviteDescription == other.shouldIncludeInviteDescription &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(reminders, shouldIncludeInviteDescription, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalEmailReminderSchedule{reminders=$reminders, shouldIncludeInviteDescription=$shouldIncludeInviteDescription, additionalProperties=$additionalProperties}"
}
