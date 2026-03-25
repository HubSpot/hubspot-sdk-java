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
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class ParticipationBreakdown
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val associations: JsonField<ParticipationAssociations>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val properties: JsonField<ParticipationProperties>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("associations")
        @ExcludeMissing
        associations: JsonField<ParticipationAssociations> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("properties")
        @ExcludeMissing
        properties: JsonField<ParticipationProperties> = JsonMissing.of(),
    ) : this(id, associations, createdAt, properties, mutableMapOf())

    /**
     * The internal ID of the target marketing event
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun associations(): ParticipationAssociations = associations.getRequired("associations")

    /**
     * The creation time and date of the target marketing event
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun properties(): ParticipationProperties = properties.getRequired("properties")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [associations].
     *
     * Unlike [associations], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("associations")
    @ExcludeMissing
    fun _associations(): JsonField<ParticipationAssociations> = associations

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [properties].
     *
     * Unlike [properties], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("properties")
    @ExcludeMissing
    fun _properties(): JsonField<ParticipationProperties> = properties

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
         * Returns a mutable builder for constructing an instance of [ParticipationBreakdown].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .associations()
         * .createdAt()
         * .properties()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ParticipationBreakdown]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var associations: JsonField<ParticipationAssociations>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var properties: JsonField<ParticipationProperties>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(participationBreakdown: ParticipationBreakdown) = apply {
            id = participationBreakdown.id
            associations = participationBreakdown.associations
            createdAt = participationBreakdown.createdAt
            properties = participationBreakdown.properties
            additionalProperties = participationBreakdown.additionalProperties.toMutableMap()
        }

        /** The internal ID of the target marketing event */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun associations(associations: ParticipationAssociations) =
            associations(JsonField.of(associations))

        /**
         * Sets [Builder.associations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.associations] with a well-typed
         * [ParticipationAssociations] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun associations(associations: JsonField<ParticipationAssociations>) = apply {
            this.associations = associations
        }

        /** The creation time and date of the target marketing event */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun properties(properties: ParticipationProperties) = properties(JsonField.of(properties))

        /**
         * Sets [Builder.properties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.properties] with a well-typed [ParticipationProperties]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun properties(properties: JsonField<ParticipationProperties>) = apply {
            this.properties = properties
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
         * Returns an immutable instance of [ParticipationBreakdown].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .associations()
         * .createdAt()
         * .properties()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ParticipationBreakdown =
            ParticipationBreakdown(
                checkRequired("id", id),
                checkRequired("associations", associations),
                checkRequired("createdAt", createdAt),
                checkRequired("properties", properties),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ParticipationBreakdown = apply {
        if (validated) {
            return@apply
        }

        id()
        associations().validate()
        createdAt()
        properties().validate()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (associations.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (properties.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ParticipationBreakdown &&
            id == other.id &&
            associations == other.associations &&
            createdAt == other.createdAt &&
            properties == other.properties &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, associations, createdAt, properties, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ParticipationBreakdown{id=$id, associations=$associations, createdAt=$createdAt, properties=$properties, additionalProperties=$additionalProperties}"
}
