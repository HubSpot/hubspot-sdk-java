// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects

class EventDetailSettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val appId: JsonField<Int>,
    private val eventDetailsUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("appId") @ExcludeMissing appId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("eventDetailsUrl")
        @ExcludeMissing
        eventDetailsUrl: JsonField<String> = JsonMissing.of(),
    ) : this(appId, eventDetailsUrl, mutableMapOf())

    /**
     * The id of the application the settings are for
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun appId(): Int = appId.getRequired("appId")

    /**
     * The url that will be used to fetch marketing event details by id
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventDetailsUrl(): String = eventDetailsUrl.getRequired("eventDetailsUrl")

    /**
     * Returns the raw JSON value of [appId].
     *
     * Unlike [appId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("appId") @ExcludeMissing fun _appId(): JsonField<Int> = appId

    /**
     * Returns the raw JSON value of [eventDetailsUrl].
     *
     * Unlike [eventDetailsUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventDetailsUrl")
    @ExcludeMissing
    fun _eventDetailsUrl(): JsonField<String> = eventDetailsUrl

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
         * Returns a mutable builder for constructing an instance of [EventDetailSettings].
         *
         * The following fields are required:
         * ```java
         * .appId()
         * .eventDetailsUrl()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EventDetailSettings]. */
    class Builder internal constructor() {

        private var appId: JsonField<Int>? = null
        private var eventDetailsUrl: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(eventDetailSettings: EventDetailSettings) = apply {
            appId = eventDetailSettings.appId
            eventDetailsUrl = eventDetailSettings.eventDetailsUrl
            additionalProperties = eventDetailSettings.additionalProperties.toMutableMap()
        }

        /** The id of the application the settings are for */
        fun appId(appId: Int) = appId(JsonField.of(appId))

        /**
         * Sets [Builder.appId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.appId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun appId(appId: JsonField<Int>) = apply { this.appId = appId }

        /** The url that will be used to fetch marketing event details by id */
        fun eventDetailsUrl(eventDetailsUrl: String) =
            eventDetailsUrl(JsonField.of(eventDetailsUrl))

        /**
         * Sets [Builder.eventDetailsUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventDetailsUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun eventDetailsUrl(eventDetailsUrl: JsonField<String>) = apply {
            this.eventDetailsUrl = eventDetailsUrl
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
         * Returns an immutable instance of [EventDetailSettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .appId()
         * .eventDetailsUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EventDetailSettings =
            EventDetailSettings(
                checkRequired("appId", appId),
                checkRequired("eventDetailsUrl", eventDetailsUrl),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): EventDetailSettings = apply {
        if (validated) {
            return@apply
        }

        appId()
        eventDetailsUrl()
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
        (if (appId.asKnown().isPresent) 1 else 0) +
            (if (eventDetailsUrl.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EventDetailSettings &&
            appId == other.appId &&
            eventDetailsUrl == other.eventDetailsUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(appId, eventDetailsUrl, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EventDetailSettings{appId=$appId, eventDetailsUrl=$eventDetailsUrl, additionalProperties=$additionalProperties}"
}
