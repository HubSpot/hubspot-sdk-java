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
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** State of the template definition being created. */
class TimelineEventTemplateCreateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val name: JsonField<String>,
    private val objectType: JsonField<String>,
    private val tokens: JsonField<List<TimelineEventTemplateToken>>,
    private val detailTemplate: JsonField<String>,
    private val headerTemplate: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("objectType")
        @ExcludeMissing
        objectType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tokens")
        @ExcludeMissing
        tokens: JsonField<List<TimelineEventTemplateToken>> = JsonMissing.of(),
        @JsonProperty("detailTemplate")
        @ExcludeMissing
        detailTemplate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("headerTemplate")
        @ExcludeMissing
        headerTemplate: JsonField<String> = JsonMissing.of(),
    ) : this(name, objectType, tokens, detailTemplate, headerTemplate, mutableMapOf())

    /**
     * The template name.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * The type of CRM object this template is for. [Contacts, companies, tickets, and deals] are
     * supported.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectType(): String = objectType.getRequired("objectType")

    /**
     * A collection of tokens that can be used as custom properties on the event and to create fully
     * fledged CRM objects.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tokens(): List<TimelineEventTemplateToken> = tokens.getRequired("tokens")

    /**
     * This uses Markdown syntax with Handlebars and event-specific data to render HTML on a
     * timeline when you expand the details.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun detailTemplate(): Optional<String> = detailTemplate.getOptional("detailTemplate")

    /**
     * This uses Markdown syntax with Handlebars and event-specific data to render HTML on a
     * timeline as a header.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun headerTemplate(): Optional<String> = headerTemplate.getOptional("headerTemplate")

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
         * [TimelineEventTemplateCreateRequest].
         *
         * The following fields are required:
         * ```java
         * .name()
         * .objectType()
         * .tokens()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TimelineEventTemplateCreateRequest]. */
    class Builder internal constructor() {

        private var name: JsonField<String>? = null
        private var objectType: JsonField<String>? = null
        private var tokens: JsonField<MutableList<TimelineEventTemplateToken>>? = null
        private var detailTemplate: JsonField<String> = JsonMissing.of()
        private var headerTemplate: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(timelineEventTemplateCreateRequest: TimelineEventTemplateCreateRequest) =
            apply {
                name = timelineEventTemplateCreateRequest.name
                objectType = timelineEventTemplateCreateRequest.objectType
                tokens = timelineEventTemplateCreateRequest.tokens.map { it.toMutableList() }
                detailTemplate = timelineEventTemplateCreateRequest.detailTemplate
                headerTemplate = timelineEventTemplateCreateRequest.headerTemplate
                additionalProperties =
                    timelineEventTemplateCreateRequest.additionalProperties.toMutableMap()
            }

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
         * Returns an immutable instance of [TimelineEventTemplateCreateRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .name()
         * .objectType()
         * .tokens()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TimelineEventTemplateCreateRequest =
            TimelineEventTemplateCreateRequest(
                checkRequired("name", name),
                checkRequired("objectType", objectType),
                checkRequired("tokens", tokens).map { it.toImmutable() },
                detailTemplate,
                headerTemplate,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TimelineEventTemplateCreateRequest = apply {
        if (validated) {
            return@apply
        }

        name()
        objectType()
        tokens().forEach { it.validate() }
        detailTemplate()
        headerTemplate()
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
        (if (name.asKnown().isPresent) 1 else 0) +
            (if (objectType.asKnown().isPresent) 1 else 0) +
            (tokens.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (detailTemplate.asKnown().isPresent) 1 else 0) +
            (if (headerTemplate.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TimelineEventTemplateCreateRequest &&
            name == other.name &&
            objectType == other.objectType &&
            tokens == other.tokens &&
            detailTemplate == other.detailTemplate &&
            headerTemplate == other.headerTemplate &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(name, objectType, tokens, detailTemplate, headerTemplate, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TimelineEventTemplateCreateRequest{name=$name, objectType=$objectType, tokens=$tokens, detailTemplate=$detailTemplate, headerTemplate=$headerTemplate, additionalProperties=$additionalProperties}"
}
