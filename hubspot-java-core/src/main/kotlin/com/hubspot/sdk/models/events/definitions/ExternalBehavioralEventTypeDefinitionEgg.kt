// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.events.definitions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkKnown
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.toImmutable
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ExternalBehavioralEventTypeDefinitionEgg
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val includeDefaultProperties: JsonField<Boolean>,
    private val label: JsonField<String>,
    private val propertyDefinitions: JsonField<List<ExternalBehavioralEventPropertyCreate>>,
    private val customMatchingId: JsonField<ExternalObjectResolutionMappingRequest>,
    private val description: JsonField<String>,
    private val name: JsonField<String>,
    private val primaryObject: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("includeDefaultProperties")
        @ExcludeMissing
        includeDefaultProperties: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("propertyDefinitions")
        @ExcludeMissing
        propertyDefinitions: JsonField<List<ExternalBehavioralEventPropertyCreate>> =
            JsonMissing.of(),
        @JsonProperty("customMatchingId")
        @ExcludeMissing
        customMatchingId: JsonField<ExternalObjectResolutionMappingRequest> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("primaryObject")
        @ExcludeMissing
        primaryObject: JsonField<String> = JsonMissing.of(),
    ) : this(
        includeDefaultProperties,
        label,
        propertyDefinitions,
        customMatchingId,
        description,
        name,
        primaryObject,
        mutableMapOf(),
    )

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun includeDefaultProperties(): Boolean =
        includeDefaultProperties.getRequired("includeDefaultProperties")

    /**
     * Human readable label for the event. Used in HubSpot UI
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun label(): String = label.getRequired("label")

    /**
     * List of custom properties on event
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun propertyDefinitions(): List<ExternalBehavioralEventPropertyCreate> =
        propertyDefinitions.getRequired("propertyDefinitions")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customMatchingId(): Optional<ExternalObjectResolutionMappingRequest> =
        customMatchingId.getOptional("customMatchingId")

    /**
     * A description of the event that will be shown as help text in HubSpot.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * Internal event name, which must be used when referencing the event from this event
     * definitions API. If a name is not supplied, one will be generated based on the label. The
     * `name` value will also be used to automatically generate a `fullyQualifiedName` for the event
     * definition, which you'll use when sending event completions to this event.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * The object type to associate this event to. Can be one of CONTACT, COMPANY, DEAL, TICKET. If
     * no primaryObject is supplied, we will default to associating the event to CONTACT objects.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryObject(): Optional<String> = primaryObject.getOptional("primaryObject")

    /**
     * Returns the raw JSON value of [includeDefaultProperties].
     *
     * Unlike [includeDefaultProperties], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("includeDefaultProperties")
    @ExcludeMissing
    fun _includeDefaultProperties(): JsonField<Boolean> = includeDefaultProperties

    /**
     * Returns the raw JSON value of [label].
     *
     * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

    /**
     * Returns the raw JSON value of [propertyDefinitions].
     *
     * Unlike [propertyDefinitions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("propertyDefinitions")
    @ExcludeMissing
    fun _propertyDefinitions(): JsonField<List<ExternalBehavioralEventPropertyCreate>> =
        propertyDefinitions

    /**
     * Returns the raw JSON value of [customMatchingId].
     *
     * Unlike [customMatchingId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("customMatchingId")
    @ExcludeMissing
    fun _customMatchingId(): JsonField<ExternalObjectResolutionMappingRequest> = customMatchingId

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [primaryObject].
     *
     * Unlike [primaryObject], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("primaryObject")
    @ExcludeMissing
    fun _primaryObject(): JsonField<String> = primaryObject

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
         * [ExternalBehavioralEventTypeDefinitionEgg].
         *
         * The following fields are required:
         * ```java
         * .includeDefaultProperties()
         * .label()
         * .propertyDefinitions()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalBehavioralEventTypeDefinitionEgg]. */
    class Builder internal constructor() {

        private var includeDefaultProperties: JsonField<Boolean>? = null
        private var label: JsonField<String>? = null
        private var propertyDefinitions:
            JsonField<MutableList<ExternalBehavioralEventPropertyCreate>>? =
            null
        private var customMatchingId: JsonField<ExternalObjectResolutionMappingRequest> =
            JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var primaryObject: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            externalBehavioralEventTypeDefinitionEgg: ExternalBehavioralEventTypeDefinitionEgg
        ) = apply {
            includeDefaultProperties =
                externalBehavioralEventTypeDefinitionEgg.includeDefaultProperties
            label = externalBehavioralEventTypeDefinitionEgg.label
            propertyDefinitions =
                externalBehavioralEventTypeDefinitionEgg.propertyDefinitions.map {
                    it.toMutableList()
                }
            customMatchingId = externalBehavioralEventTypeDefinitionEgg.customMatchingId
            description = externalBehavioralEventTypeDefinitionEgg.description
            name = externalBehavioralEventTypeDefinitionEgg.name
            primaryObject = externalBehavioralEventTypeDefinitionEgg.primaryObject
            additionalProperties =
                externalBehavioralEventTypeDefinitionEgg.additionalProperties.toMutableMap()
        }

        fun includeDefaultProperties(includeDefaultProperties: Boolean) =
            includeDefaultProperties(JsonField.of(includeDefaultProperties))

        /**
         * Sets [Builder.includeDefaultProperties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includeDefaultProperties] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun includeDefaultProperties(includeDefaultProperties: JsonField<Boolean>) = apply {
            this.includeDefaultProperties = includeDefaultProperties
        }

        /** Human readable label for the event. Used in HubSpot UI */
        fun label(label: String) = label(JsonField.of(label))

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: JsonField<String>) = apply { this.label = label }

        /** List of custom properties on event */
        fun propertyDefinitions(propertyDefinitions: List<ExternalBehavioralEventPropertyCreate>) =
            propertyDefinitions(JsonField.of(propertyDefinitions))

        /**
         * Sets [Builder.propertyDefinitions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.propertyDefinitions] with a well-typed
         * `List<ExternalBehavioralEventPropertyCreate>` value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun propertyDefinitions(
            propertyDefinitions: JsonField<List<ExternalBehavioralEventPropertyCreate>>
        ) = apply { this.propertyDefinitions = propertyDefinitions.map { it.toMutableList() } }

        /**
         * Adds a single [ExternalBehavioralEventPropertyCreate] to [propertyDefinitions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPropertyDefinition(propertyDefinition: ExternalBehavioralEventPropertyCreate) =
            apply {
                propertyDefinitions =
                    (propertyDefinitions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("propertyDefinitions", it).add(propertyDefinition)
                    }
            }

        fun customMatchingId(customMatchingId: ExternalObjectResolutionMappingRequest) =
            customMatchingId(JsonField.of(customMatchingId))

        /**
         * Sets [Builder.customMatchingId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customMatchingId] with a well-typed
         * [ExternalObjectResolutionMappingRequest] value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun customMatchingId(customMatchingId: JsonField<ExternalObjectResolutionMappingRequest>) =
            apply {
                this.customMatchingId = customMatchingId
            }

        /** A description of the event that will be shown as help text in HubSpot. */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * Internal event name, which must be used when referencing the event from this event
         * definitions API. If a name is not supplied, one will be generated based on the label. The
         * `name` value will also be used to automatically generate a `fullyQualifiedName` for the
         * event definition, which you'll use when sending event completions to this event.
         */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * The object type to associate this event to. Can be one of CONTACT, COMPANY, DEAL, TICKET.
         * If no primaryObject is supplied, we will default to associating the event to CONTACT
         * objects.
         */
        fun primaryObject(primaryObject: String) = primaryObject(JsonField.of(primaryObject))

        /**
         * Sets [Builder.primaryObject] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryObject] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun primaryObject(primaryObject: JsonField<String>) = apply {
            this.primaryObject = primaryObject
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
         * Returns an immutable instance of [ExternalBehavioralEventTypeDefinitionEgg].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .includeDefaultProperties()
         * .label()
         * .propertyDefinitions()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalBehavioralEventTypeDefinitionEgg =
            ExternalBehavioralEventTypeDefinitionEgg(
                checkRequired("includeDefaultProperties", includeDefaultProperties),
                checkRequired("label", label),
                checkRequired("propertyDefinitions", propertyDefinitions).map { it.toImmutable() },
                customMatchingId,
                description,
                name,
                primaryObject,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalBehavioralEventTypeDefinitionEgg = apply {
        if (validated) {
            return@apply
        }

        includeDefaultProperties()
        label()
        propertyDefinitions().forEach { it.validate() }
        customMatchingId().ifPresent { it.validate() }
        description()
        name()
        primaryObject()
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
        (if (includeDefaultProperties.asKnown().isPresent) 1 else 0) +
            (if (label.asKnown().isPresent) 1 else 0) +
            (propertyDefinitions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (customMatchingId.asKnown().getOrNull()?.validity() ?: 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (primaryObject.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalBehavioralEventTypeDefinitionEgg &&
            includeDefaultProperties == other.includeDefaultProperties &&
            label == other.label &&
            propertyDefinitions == other.propertyDefinitions &&
            customMatchingId == other.customMatchingId &&
            description == other.description &&
            name == other.name &&
            primaryObject == other.primaryObject &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            includeDefaultProperties,
            label,
            propertyDefinitions,
            customMatchingId,
            description,
            name,
            primaryObject,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalBehavioralEventTypeDefinitionEgg{includeDefaultProperties=$includeDefaultProperties, label=$label, propertyDefinitions=$propertyDefinitions, customMatchingId=$customMatchingId, description=$description, name=$name, primaryObject=$primaryObject, additionalProperties=$additionalProperties}"
}
