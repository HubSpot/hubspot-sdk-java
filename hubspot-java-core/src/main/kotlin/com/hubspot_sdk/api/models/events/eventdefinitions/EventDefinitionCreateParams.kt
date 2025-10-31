// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.eventdefinitions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import com.hubspot_sdk.api.models.OptionInput
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create a custom event definition. */
class EventDefinitionCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Human readable label for the event. Used in HubSpot UI
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun label(): String = body.label()

    /**
     * List of custom properties on event
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun propertyDefinitions(): List<PropertyDefinition> = body.propertyDefinitions()

    /**
     * A description of the event that will be shown as help text in HubSpot.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * Internal event name, which must be used when referencing the event from this event
     * definitions API. If a name is not supplied, one will be generated based on the label. The
     * `name` value will also be used to automatically generate a `fullyQualifiedName` for the event
     * definition, which you'll use when sending event completions to this event.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * The object type to associate this event to. Can be one of CONTACT, COMPANY, DEAL, TICKET. If
     * no primaryObject is supplied, we will default to associating the event to CONTACT objects.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryObject(): Optional<String> = body.primaryObject()

    /**
     * Returns the raw JSON value of [label].
     *
     * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _label(): JsonField<String> = body._label()

    /**
     * Returns the raw JSON value of [propertyDefinitions].
     *
     * Unlike [propertyDefinitions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _propertyDefinitions(): JsonField<List<PropertyDefinition>> = body._propertyDefinitions()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [primaryObject].
     *
     * Unlike [primaryObject], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _primaryObject(): JsonField<String> = body._primaryObject()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EventDefinitionCreateParams].
         *
         * The following fields are required:
         * ```java
         * .label()
         * .propertyDefinitions()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EventDefinitionCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(eventDefinitionCreateParams: EventDefinitionCreateParams) = apply {
            body = eventDefinitionCreateParams.body.toBuilder()
            additionalHeaders = eventDefinitionCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = eventDefinitionCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [label]
         * - [propertyDefinitions]
         * - [description]
         * - [name]
         * - [primaryObject]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Human readable label for the event. Used in HubSpot UI */
        fun label(label: String) = apply { body.label(label) }

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: JsonField<String>) = apply { body.label(label) }

        /** List of custom properties on event */
        fun propertyDefinitions(propertyDefinitions: List<PropertyDefinition>) = apply {
            body.propertyDefinitions(propertyDefinitions)
        }

        /**
         * Sets [Builder.propertyDefinitions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.propertyDefinitions] with a well-typed
         * `List<PropertyDefinition>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun propertyDefinitions(propertyDefinitions: JsonField<List<PropertyDefinition>>) = apply {
            body.propertyDefinitions(propertyDefinitions)
        }

        /**
         * Adds a single [PropertyDefinition] to [propertyDefinitions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPropertyDefinition(propertyDefinition: PropertyDefinition) = apply {
            body.addPropertyDefinition(propertyDefinition)
        }

        /** A description of the event that will be shown as help text in HubSpot. */
        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /**
         * Internal event name, which must be used when referencing the event from this event
         * definitions API. If a name is not supplied, one will be generated based on the label. The
         * `name` value will also be used to automatically generate a `fullyQualifiedName` for the
         * event definition, which you'll use when sending event completions to this event.
         */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * The object type to associate this event to. Can be one of CONTACT, COMPANY, DEAL, TICKET.
         * If no primaryObject is supplied, we will default to associating the event to CONTACT
         * objects.
         */
        fun primaryObject(primaryObject: String) = apply { body.primaryObject(primaryObject) }

        /**
         * Sets [Builder.primaryObject] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryObject] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun primaryObject(primaryObject: JsonField<String>) = apply {
            body.primaryObject(primaryObject)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [EventDefinitionCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .label()
         * .propertyDefinitions()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EventDefinitionCreateParams =
            EventDefinitionCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val label: JsonField<String>,
        private val propertyDefinitions: JsonField<List<PropertyDefinition>>,
        private val description: JsonField<String>,
        private val name: JsonField<String>,
        private val primaryObject: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
            @JsonProperty("propertyDefinitions")
            @ExcludeMissing
            propertyDefinitions: JsonField<List<PropertyDefinition>> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("primaryObject")
            @ExcludeMissing
            primaryObject: JsonField<String> = JsonMissing.of(),
        ) : this(label, propertyDefinitions, description, name, primaryObject, mutableMapOf())

        /**
         * Human readable label for the event. Used in HubSpot UI
         *
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun label(): String = label.getRequired("label")

        /**
         * List of custom properties on event
         *
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun propertyDefinitions(): List<PropertyDefinition> =
            propertyDefinitions.getRequired("propertyDefinitions")

        /**
         * A description of the event that will be shown as help text in HubSpot.
         *
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Internal event name, which must be used when referencing the event from this event
         * definitions API. If a name is not supplied, one will be generated based on the label. The
         * `name` value will also be used to automatically generate a `fullyQualifiedName` for the
         * event definition, which you'll use when sending event completions to this event.
         *
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * The object type to associate this event to. Can be one of CONTACT, COMPANY, DEAL, TICKET.
         * If no primaryObject is supplied, we will default to associating the event to CONTACT
         * objects.
         *
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun primaryObject(): Optional<String> = primaryObject.getOptional("primaryObject")

        /**
         * Returns the raw JSON value of [label].
         *
         * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

        /**
         * Returns the raw JSON value of [propertyDefinitions].
         *
         * Unlike [propertyDefinitions], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("propertyDefinitions")
        @ExcludeMissing
        fun _propertyDefinitions(): JsonField<List<PropertyDefinition>> = propertyDefinitions

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [primaryObject].
         *
         * Unlike [primaryObject], this method doesn't throw if the JSON field has an unexpected
         * type.
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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .label()
             * .propertyDefinitions()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var label: JsonField<String>? = null
            private var propertyDefinitions: JsonField<MutableList<PropertyDefinition>>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var primaryObject: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                label = body.label
                propertyDefinitions = body.propertyDefinitions.map { it.toMutableList() }
                description = body.description
                name = body.name
                primaryObject = body.primaryObject
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Human readable label for the event. Used in HubSpot UI */
            fun label(label: String) = label(JsonField.of(label))

            /**
             * Sets [Builder.label] to an arbitrary JSON value.
             *
             * You should usually call [Builder.label] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun label(label: JsonField<String>) = apply { this.label = label }

            /** List of custom properties on event */
            fun propertyDefinitions(propertyDefinitions: List<PropertyDefinition>) =
                propertyDefinitions(JsonField.of(propertyDefinitions))

            /**
             * Sets [Builder.propertyDefinitions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.propertyDefinitions] with a well-typed
             * `List<PropertyDefinition>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun propertyDefinitions(propertyDefinitions: JsonField<List<PropertyDefinition>>) =
                apply {
                    this.propertyDefinitions = propertyDefinitions.map { it.toMutableList() }
                }

            /**
             * Adds a single [PropertyDefinition] to [propertyDefinitions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPropertyDefinition(propertyDefinition: PropertyDefinition) = apply {
                propertyDefinitions =
                    (propertyDefinitions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("propertyDefinitions", it).add(propertyDefinition)
                    }
            }

            /** A description of the event that will be shown as help text in HubSpot. */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * Internal event name, which must be used when referencing the event from this event
             * definitions API. If a name is not supplied, one will be generated based on the label.
             * The `name` value will also be used to automatically generate a `fullyQualifiedName`
             * for the event definition, which you'll use when sending event completions to this
             * event.
             */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * The object type to associate this event to. Can be one of CONTACT, COMPANY, DEAL,
             * TICKET. If no primaryObject is supplied, we will default to associating the event to
             * CONTACT objects.
             */
            fun primaryObject(primaryObject: String) = primaryObject(JsonField.of(primaryObject))

            /**
             * Sets [Builder.primaryObject] to an arbitrary JSON value.
             *
             * You should usually call [Builder.primaryObject] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .label()
             * .propertyDefinitions()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("label", label),
                    checkRequired("propertyDefinitions", propertyDefinitions).map {
                        it.toImmutable()
                    },
                    description,
                    name,
                    primaryObject,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            label()
            propertyDefinitions().forEach { it.validate() }
            description()
            name()
            primaryObject()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (label.asKnown().isPresent) 1 else 0) +
                (propertyDefinitions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (primaryObject.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                label == other.label &&
                propertyDefinitions == other.propertyDefinitions &&
                description == other.description &&
                name == other.name &&
                primaryObject == other.primaryObject &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                label,
                propertyDefinitions,
                description,
                name,
                primaryObject,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{label=$label, propertyDefinitions=$propertyDefinitions, description=$description, name=$name, primaryObject=$primaryObject, additionalProperties=$additionalProperties}"
    }

    class PropertyDefinition
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val label: JsonField<String>,
        private val type: JsonField<String>,
        private val description: JsonField<String>,
        private val name: JsonField<String>,
        private val options: JsonField<List<OptionInput>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("options")
            @ExcludeMissing
            options: JsonField<List<OptionInput>> = JsonMissing.of(),
        ) : this(label, type, description, name, options, mutableMapOf())

        /**
         * Human readable label for the property. Used in HubSpot UI
         *
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun label(): String = label.getRequired("label")

        /**
         * The data type of the property. Can be one of the following:
         * [string, number, enumeration, datetime]
         *
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): String = type.getRequired("type")

        /**
         * A description of the property that will be shown as help text in HubSpot.
         *
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Internal property name, which must be used when referencing the property from the API
         *
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * A list of available options for the property if it is an enumeration. NOTE: This field is
         * only applicable for enumerated properties.
         *
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun options(): Optional<List<OptionInput>> = options.getOptional("options")

        /**
         * Returns the raw JSON value of [label].
         *
         * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [options].
         *
         * Unlike [options], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("options")
        @ExcludeMissing
        fun _options(): JsonField<List<OptionInput>> = options

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
             * Returns a mutable builder for constructing an instance of [PropertyDefinition].
             *
             * The following fields are required:
             * ```java
             * .label()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PropertyDefinition]. */
        class Builder internal constructor() {

            private var label: JsonField<String>? = null
            private var type: JsonField<String>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var options: JsonField<MutableList<OptionInput>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(propertyDefinition: PropertyDefinition) = apply {
                label = propertyDefinition.label
                type = propertyDefinition.type
                description = propertyDefinition.description
                name = propertyDefinition.name
                options = propertyDefinition.options.map { it.toMutableList() }
                additionalProperties = propertyDefinition.additionalProperties.toMutableMap()
            }

            /** Human readable label for the property. Used in HubSpot UI */
            fun label(label: String) = label(JsonField.of(label))

            /**
             * Sets [Builder.label] to an arbitrary JSON value.
             *
             * You should usually call [Builder.label] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun label(label: JsonField<String>) = apply { this.label = label }

            /**
             * The data type of the property. Can be one of the following:
             * [string, number, enumeration, datetime]
             */
            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

            /** A description of the property that will be shown as help text in HubSpot. */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * Internal property name, which must be used when referencing the property from the API
             */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * A list of available options for the property if it is an enumeration. NOTE: This
             * field is only applicable for enumerated properties.
             */
            fun options(options: List<OptionInput>) = options(JsonField.of(options))

            /**
             * Sets [Builder.options] to an arbitrary JSON value.
             *
             * You should usually call [Builder.options] with a well-typed `List<OptionInput>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun options(options: JsonField<List<OptionInput>>) = apply {
                this.options = options.map { it.toMutableList() }
            }

            /**
             * Adds a single [OptionInput] to [options].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOption(option: OptionInput) = apply {
                options =
                    (options ?: JsonField.of(mutableListOf())).also {
                        checkKnown("options", it).add(option)
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
             * Returns an immutable instance of [PropertyDefinition].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .label()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PropertyDefinition =
                PropertyDefinition(
                    checkRequired("label", label),
                    checkRequired("type", type),
                    description,
                    name,
                    (options ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PropertyDefinition = apply {
            if (validated) {
                return@apply
            }

            label()
            type()
            description()
            name()
            options().ifPresent { it.forEach { it.validate() } }
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (label.asKnown().isPresent) 1 else 0) +
                (if (type.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (options.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PropertyDefinition &&
                label == other.label &&
                type == other.type &&
                description == other.description &&
                name == other.name &&
                options == other.options &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(label, type, description, name, options, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PropertyDefinition{label=$label, type=$type, description=$description, name=$name, options=$options, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EventDefinitionCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "EventDefinitionCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
