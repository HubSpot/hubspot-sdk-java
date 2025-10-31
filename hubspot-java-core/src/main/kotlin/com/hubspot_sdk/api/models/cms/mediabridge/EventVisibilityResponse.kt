// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class EventVisibilityResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val createdAt: JsonField<OffsetDateTime>,
    private val visibilitySettings: JsonField<List<EventVisibilityChange>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("visibilitySettings")
        @ExcludeMissing
        visibilitySettings: JsonField<List<EventVisibilityChange>> = JsonMissing.of(),
    ) : this(createdAt, visibilitySettings, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun visibilitySettings(): List<EventVisibilityChange> =
        visibilitySettings.getRequired("visibilitySettings")

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [visibilitySettings].
     *
     * Unlike [visibilitySettings], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("visibilitySettings")
    @ExcludeMissing
    fun _visibilitySettings(): JsonField<List<EventVisibilityChange>> = visibilitySettings

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
         * Returns a mutable builder for constructing an instance of [EventVisibilityResponse].
         *
         * The following fields are required:
         * ```java
         * .createdAt()
         * .visibilitySettings()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EventVisibilityResponse]. */
    class Builder internal constructor() {

        private var createdAt: JsonField<OffsetDateTime>? = null
        private var visibilitySettings: JsonField<MutableList<EventVisibilityChange>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(eventVisibilityResponse: EventVisibilityResponse) = apply {
            createdAt = eventVisibilityResponse.createdAt
            visibilitySettings =
                eventVisibilityResponse.visibilitySettings.map { it.toMutableList() }
            additionalProperties = eventVisibilityResponse.additionalProperties.toMutableMap()
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun visibilitySettings(visibilitySettings: List<EventVisibilityChange>) =
            visibilitySettings(JsonField.of(visibilitySettings))

        /**
         * Sets [Builder.visibilitySettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.visibilitySettings] with a well-typed
         * `List<EventVisibilityChange>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun visibilitySettings(visibilitySettings: JsonField<List<EventVisibilityChange>>) = apply {
            this.visibilitySettings = visibilitySettings.map { it.toMutableList() }
        }

        /**
         * Adds a single [EventVisibilityChange] to [visibilitySettings].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addVisibilitySetting(visibilitySetting: EventVisibilityChange) = apply {
            visibilitySettings =
                (visibilitySettings ?: JsonField.of(mutableListOf())).also {
                    checkKnown("visibilitySettings", it).add(visibilitySetting)
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
         * Returns an immutable instance of [EventVisibilityResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .createdAt()
         * .visibilitySettings()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EventVisibilityResponse =
            EventVisibilityResponse(
                checkRequired("createdAt", createdAt),
                checkRequired("visibilitySettings", visibilitySettings).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): EventVisibilityResponse = apply {
        if (validated) {
            return@apply
        }

        createdAt()
        visibilitySettings().forEach { it.validate() }
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
        (if (createdAt.asKnown().isPresent) 1 else 0) +
            (visibilitySettings.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EventVisibilityResponse &&
            createdAt == other.createdAt &&
            visibilitySettings == other.visibilitySettings &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(createdAt, visibilitySettings, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EventVisibilityResponse{createdAt=$createdAt, visibilitySettings=$visibilitySettings, additionalProperties=$additionalProperties}"
}
