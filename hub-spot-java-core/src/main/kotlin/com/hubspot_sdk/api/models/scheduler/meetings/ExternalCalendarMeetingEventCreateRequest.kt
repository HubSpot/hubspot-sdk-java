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

class ExternalCalendarMeetingEventCreateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val associations: JsonField<List<ExternalAssociationCreateRequest>>,
    private val emailReminderSchedule: JsonField<ExternalEmailReminderSchedule>,
    private val properties: JsonField<ExternalCalendarMeetingEventCreateProperties>,
    private val timezone: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("associations")
        @ExcludeMissing
        associations: JsonField<List<ExternalAssociationCreateRequest>> = JsonMissing.of(),
        @JsonProperty("emailReminderSchedule")
        @ExcludeMissing
        emailReminderSchedule: JsonField<ExternalEmailReminderSchedule> = JsonMissing.of(),
        @JsonProperty("properties")
        @ExcludeMissing
        properties: JsonField<ExternalCalendarMeetingEventCreateProperties> = JsonMissing.of(),
        @JsonProperty("timezone") @ExcludeMissing timezone: JsonField<String> = JsonMissing.of(),
    ) : this(associations, emailReminderSchedule, properties, timezone, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun associations(): List<ExternalAssociationCreateRequest> =
        associations.getRequired("associations")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun emailReminderSchedule(): ExternalEmailReminderSchedule =
        emailReminderSchedule.getRequired("emailReminderSchedule")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun properties(): ExternalCalendarMeetingEventCreateProperties =
        properties.getRequired("properties")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timezone(): String = timezone.getRequired("timezone")

    /**
     * Returns the raw JSON value of [associations].
     *
     * Unlike [associations], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("associations")
    @ExcludeMissing
    fun _associations(): JsonField<List<ExternalAssociationCreateRequest>> = associations

    /**
     * Returns the raw JSON value of [emailReminderSchedule].
     *
     * Unlike [emailReminderSchedule], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("emailReminderSchedule")
    @ExcludeMissing
    fun _emailReminderSchedule(): JsonField<ExternalEmailReminderSchedule> = emailReminderSchedule

    /**
     * Returns the raw JSON value of [properties].
     *
     * Unlike [properties], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("properties")
    @ExcludeMissing
    fun _properties(): JsonField<ExternalCalendarMeetingEventCreateProperties> = properties

    /**
     * Returns the raw JSON value of [timezone].
     *
     * Unlike [timezone], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timezone") @ExcludeMissing fun _timezone(): JsonField<String> = timezone

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
         * [ExternalCalendarMeetingEventCreateRequest].
         *
         * The following fields are required:
         * ```java
         * .associations()
         * .emailReminderSchedule()
         * .properties()
         * .timezone()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalCalendarMeetingEventCreateRequest]. */
    class Builder internal constructor() {

        private var associations: JsonField<MutableList<ExternalAssociationCreateRequest>>? = null
        private var emailReminderSchedule: JsonField<ExternalEmailReminderSchedule>? = null
        private var properties: JsonField<ExternalCalendarMeetingEventCreateProperties>? = null
        private var timezone: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            externalCalendarMeetingEventCreateRequest: ExternalCalendarMeetingEventCreateRequest
        ) = apply {
            associations =
                externalCalendarMeetingEventCreateRequest.associations.map { it.toMutableList() }
            emailReminderSchedule = externalCalendarMeetingEventCreateRequest.emailReminderSchedule
            properties = externalCalendarMeetingEventCreateRequest.properties
            timezone = externalCalendarMeetingEventCreateRequest.timezone
            additionalProperties =
                externalCalendarMeetingEventCreateRequest.additionalProperties.toMutableMap()
        }

        fun associations(associations: List<ExternalAssociationCreateRequest>) =
            associations(JsonField.of(associations))

        /**
         * Sets [Builder.associations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.associations] with a well-typed
         * `List<ExternalAssociationCreateRequest>` value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun associations(associations: JsonField<List<ExternalAssociationCreateRequest>>) = apply {
            this.associations = associations.map { it.toMutableList() }
        }

        /**
         * Adds a single [ExternalAssociationCreateRequest] to [associations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAssociation(association: ExternalAssociationCreateRequest) = apply {
            associations =
                (associations ?: JsonField.of(mutableListOf())).also {
                    checkKnown("associations", it).add(association)
                }
        }

        fun emailReminderSchedule(emailReminderSchedule: ExternalEmailReminderSchedule) =
            emailReminderSchedule(JsonField.of(emailReminderSchedule))

        /**
         * Sets [Builder.emailReminderSchedule] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emailReminderSchedule] with a well-typed
         * [ExternalEmailReminderSchedule] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun emailReminderSchedule(emailReminderSchedule: JsonField<ExternalEmailReminderSchedule>) =
            apply {
                this.emailReminderSchedule = emailReminderSchedule
            }

        fun properties(properties: ExternalCalendarMeetingEventCreateProperties) =
            properties(JsonField.of(properties))

        /**
         * Sets [Builder.properties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.properties] with a well-typed
         * [ExternalCalendarMeetingEventCreateProperties] value instead. This method is primarily
         * for setting the field to an undocumented or not yet supported value.
         */
        fun properties(properties: JsonField<ExternalCalendarMeetingEventCreateProperties>) =
            apply {
                this.properties = properties
            }

        fun timezone(timezone: String) = timezone(JsonField.of(timezone))

        /**
         * Sets [Builder.timezone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timezone] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timezone(timezone: JsonField<String>) = apply { this.timezone = timezone }

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
         * Returns an immutable instance of [ExternalCalendarMeetingEventCreateRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .associations()
         * .emailReminderSchedule()
         * .properties()
         * .timezone()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalCalendarMeetingEventCreateRequest =
            ExternalCalendarMeetingEventCreateRequest(
                checkRequired("associations", associations).map { it.toImmutable() },
                checkRequired("emailReminderSchedule", emailReminderSchedule),
                checkRequired("properties", properties),
                checkRequired("timezone", timezone),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalCalendarMeetingEventCreateRequest = apply {
        if (validated) {
            return@apply
        }

        associations().forEach { it.validate() }
        emailReminderSchedule().validate()
        properties().validate()
        timezone()
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
        (associations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (emailReminderSchedule.asKnown().getOrNull()?.validity() ?: 0) +
            (properties.asKnown().getOrNull()?.validity() ?: 0) +
            (if (timezone.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalCalendarMeetingEventCreateRequest &&
            associations == other.associations &&
            emailReminderSchedule == other.emailReminderSchedule &&
            properties == other.properties &&
            timezone == other.timezone &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            associations,
            emailReminderSchedule,
            properties,
            timezone,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalCalendarMeetingEventCreateRequest{associations=$associations, emailReminderSchedule=$emailReminderSchedule, properties=$properties, timezone=$timezone, additionalProperties=$additionalProperties}"
}
