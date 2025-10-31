// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.timeline

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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** The current state of the template definition. */
class TimelineEventTemplate
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val name: JsonField<String>,
    private val objectType: JsonField<String>,
    private val tokens: JsonField<List<TimelineEventTemplateToken>>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val detailTemplate: JsonField<String>,
    private val headerTemplate: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("objectType")
        @ExcludeMissing
        objectType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tokens")
        @ExcludeMissing
        tokens: JsonField<List<TimelineEventTemplateToken>> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("detailTemplate")
        @ExcludeMissing
        detailTemplate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("headerTemplate")
        @ExcludeMissing
        headerTemplate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        name,
        objectType,
        tokens,
        createdAt,
        detailTemplate,
        headerTemplate,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * The template ID.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The template name.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * The type of CRM object this template is for. [Contacts, companies, tickets, and deals] are
     * supported.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectType(): String = objectType.getRequired("objectType")

    /**
     * A collection of tokens that can be used as custom properties on the event and to create fully
     * fledged CRM objects.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tokens(): List<TimelineEventTemplateToken> = tokens.getRequired("tokens")

    /**
     * The date and time that the Event Template was created, as an ISO 8601 timestamp. Will be null
     * if the template was created before Feb 18th, 2020.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

    /**
     * This uses Markdown syntax with Handlebars and event-specific data to render HTML on a
     * timeline when you expand the details.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun detailTemplate(): Optional<String> = detailTemplate.getOptional("detailTemplate")

    /**
     * This uses Markdown syntax with Handlebars and event-specific data to render HTML on a
     * timeline as a header.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun headerTemplate(): Optional<String> = headerTemplate.getOptional("headerTemplate")

    /**
     * The date and time that the Event Template was last updated, as an ISO 8601 timestamp. Will be
     * null if the template was created before Feb 18th, 2020.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [objectType].
     *
     * Unlike [objectType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectType") @ExcludeMissing fun _objectType(): JsonField<String> = objectType

    /**
     * Returns the raw JSON value of [tokens].
     *
     * Unlike [tokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tokens")
    @ExcludeMissing
    fun _tokens(): JsonField<List<TimelineEventTemplateToken>> = tokens

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [detailTemplate].
     *
     * Unlike [detailTemplate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("detailTemplate")
    @ExcludeMissing
    fun _detailTemplate(): JsonField<String> = detailTemplate

    /**
     * Returns the raw JSON value of [headerTemplate].
     *
     * Unlike [headerTemplate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("headerTemplate")
    @ExcludeMissing
    fun _headerTemplate(): JsonField<String> = headerTemplate

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
         * Returns a mutable builder for constructing an instance of [TimelineEventTemplate].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .name()
         * .objectType()
         * .tokens()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TimelineEventTemplate]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var objectType: JsonField<String>? = null
        private var tokens: JsonField<MutableList<TimelineEventTemplateToken>>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var detailTemplate: JsonField<String> = JsonMissing.of()
        private var headerTemplate: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(timelineEventTemplate: TimelineEventTemplate) = apply {
            id = timelineEventTemplate.id
            name = timelineEventTemplate.name
            objectType = timelineEventTemplate.objectType
            tokens = timelineEventTemplate.tokens.map { it.toMutableList() }
            createdAt = timelineEventTemplate.createdAt
            detailTemplate = timelineEventTemplate.detailTemplate
            headerTemplate = timelineEventTemplate.headerTemplate
            updatedAt = timelineEventTemplate.updatedAt
            additionalProperties = timelineEventTemplate.additionalProperties.toMutableMap()
        }

        /** The template ID. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The template name. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * The type of CRM object this template is for. [Contacts, companies, tickets, and deals]
         * are supported.
         */
        fun objectType(objectType: String) = objectType(JsonField.of(objectType))

        /**
         * Sets [Builder.objectType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun objectType(objectType: JsonField<String>) = apply { this.objectType = objectType }

        /**
         * A collection of tokens that can be used as custom properties on the event and to create
         * fully fledged CRM objects.
         */
        fun tokens(tokens: List<TimelineEventTemplateToken>) = tokens(JsonField.of(tokens))

        /**
         * Sets [Builder.tokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokens] with a well-typed
         * `List<TimelineEventTemplateToken>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun tokens(tokens: JsonField<List<TimelineEventTemplateToken>>) = apply {
            this.tokens = tokens.map { it.toMutableList() }
        }

        /**
         * Adds a single [TimelineEventTemplateToken] to [tokens].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addToken(token: TimelineEventTemplateToken) = apply {
            tokens =
                (tokens ?: JsonField.of(mutableListOf())).also {
                    checkKnown("tokens", it).add(token)
                }
        }

        /**
         * The date and time that the Event Template was created, as an ISO 8601 timestamp. Will be
         * null if the template was created before Feb 18th, 2020.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * This uses Markdown syntax with Handlebars and event-specific data to render HTML on a
         * timeline when you expand the details.
         */
        fun detailTemplate(detailTemplate: String) = detailTemplate(JsonField.of(detailTemplate))

        /**
         * Sets [Builder.detailTemplate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.detailTemplate] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun detailTemplate(detailTemplate: JsonField<String>) = apply {
            this.detailTemplate = detailTemplate
        }

        /**
         * This uses Markdown syntax with Handlebars and event-specific data to render HTML on a
         * timeline as a header.
         */
        fun headerTemplate(headerTemplate: String) = headerTemplate(JsonField.of(headerTemplate))

        /**
         * Sets [Builder.headerTemplate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.headerTemplate] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun headerTemplate(headerTemplate: JsonField<String>) = apply {
            this.headerTemplate = headerTemplate
        }

        /**
         * The date and time that the Event Template was last updated, as an ISO 8601 timestamp.
         * Will be null if the template was created before Feb 18th, 2020.
         */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [TimelineEventTemplate].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .name()
         * .objectType()
         * .tokens()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TimelineEventTemplate =
            TimelineEventTemplate(
                checkRequired("id", id),
                checkRequired("name", name),
                checkRequired("objectType", objectType),
                checkRequired("tokens", tokens).map { it.toImmutable() },
                createdAt,
                detailTemplate,
                headerTemplate,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TimelineEventTemplate = apply {
        if (validated) {
            return@apply
        }

        id()
        name()
        objectType()
        tokens().forEach { it.validate() }
        createdAt()
        detailTemplate()
        headerTemplate()
        updatedAt()
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
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (objectType.asKnown().isPresent) 1 else 0) +
            (tokens.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (detailTemplate.asKnown().isPresent) 1 else 0) +
            (if (headerTemplate.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TimelineEventTemplate &&
            id == other.id &&
            name == other.name &&
            objectType == other.objectType &&
            tokens == other.tokens &&
            createdAt == other.createdAt &&
            detailTemplate == other.detailTemplate &&
            headerTemplate == other.headerTemplate &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            name,
            objectType,
            tokens,
            createdAt,
            detailTemplate,
            headerTemplate,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TimelineEventTemplate{id=$id, name=$name, objectType=$objectType, tokens=$tokens, createdAt=$createdAt, detailTemplate=$detailTemplate, headerTemplate=$headerTemplate, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
