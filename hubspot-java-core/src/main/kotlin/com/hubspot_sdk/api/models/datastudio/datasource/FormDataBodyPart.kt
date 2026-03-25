// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.datastudio.datasource

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class FormDataBodyPart
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val contentDisposition: JsonField<ContentDisposition>,
    private val entity: JsonValue,
    private val formDataContentDisposition: JsonField<FormDataContentDisposition>,
    private val headers: JsonField<Headers>,
    private val mediaType: JsonField<MediaType>,
    private val messageBodyWorkers: JsonValue,
    private val name: JsonField<String>,
    private val parameterizedHeaders: JsonField<ParameterizedHeaders>,
    private val providers: JsonValue,
    private val simple: JsonField<Boolean>,
    private val value: JsonField<String>,
    private val parent: JsonField<MultiPart>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("contentDisposition")
        @ExcludeMissing
        contentDisposition: JsonField<ContentDisposition> = JsonMissing.of(),
        @JsonProperty("entity") @ExcludeMissing entity: JsonValue = JsonMissing.of(),
        @JsonProperty("formDataContentDisposition")
        @ExcludeMissing
        formDataContentDisposition: JsonField<FormDataContentDisposition> = JsonMissing.of(),
        @JsonProperty("headers") @ExcludeMissing headers: JsonField<Headers> = JsonMissing.of(),
        @JsonProperty("mediaType")
        @ExcludeMissing
        mediaType: JsonField<MediaType> = JsonMissing.of(),
        @JsonProperty("messageBodyWorkers")
        @ExcludeMissing
        messageBodyWorkers: JsonValue = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parameterizedHeaders")
        @ExcludeMissing
        parameterizedHeaders: JsonField<ParameterizedHeaders> = JsonMissing.of(),
        @JsonProperty("providers") @ExcludeMissing providers: JsonValue = JsonMissing.of(),
        @JsonProperty("simple") @ExcludeMissing simple: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parent") @ExcludeMissing parent: JsonField<MultiPart> = JsonMissing.of(),
    ) : this(
        contentDisposition,
        entity,
        formDataContentDisposition,
        headers,
        mediaType,
        messageBodyWorkers,
        name,
        parameterizedHeaders,
        providers,
        simple,
        value,
        parent,
        mutableMapOf(),
    )

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contentDisposition(): ContentDisposition =
        contentDisposition.getRequired("contentDisposition")

    /**
     * An object representing the entity of the form data part, which contains the actual data being
     * submitted.
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = formDataBodyPart.entity().convert(MyClass.class);
     * ```
     */
    @JsonProperty("entity") @ExcludeMissing fun _entity(): JsonValue = entity

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun formDataContentDisposition(): FormDataContentDisposition =
        formDataContentDisposition.getRequired("formDataContentDisposition")

    /**
     * An object containing the headers associated with this form data part, where each header can
     * have multiple string values.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun headers(): Headers = headers.getRequired("headers")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun mediaType(): MediaType = mediaType.getRequired("mediaType")

    /**
     * An object representing the message body workers, which are responsible for processing the
     * body of the message.
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = formDataBodyPart.messageBodyWorkers().convert(MyClass.class);
     * ```
     */
    @JsonProperty("messageBodyWorkers")
    @ExcludeMissing
    fun _messageBodyWorkers(): JsonValue = messageBodyWorkers

    /**
     * The name of the form data part, typically used to identify the part within the multipart
     * request.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * An object containing parameterized headers, where each header can have multiple values
     * represented as ParameterizedHeader objects.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun parameterizedHeaders(): ParameterizedHeaders =
        parameterizedHeaders.getRequired("parameterizedHeaders")

    /**
     * An object representing the providers associated with this form data part.
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = formDataBodyPart.providers().convert(MyClass.class);
     * ```
     */
    @JsonProperty("providers") @ExcludeMissing fun _providers(): JsonValue = providers

    /**
     * A boolean indicating whether the form data part is simple, typically meaning it does not
     * contain complex nested structures.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun simple(): Boolean = simple.getRequired("simple")

    /**
     * The string value of the form data part, representing the actual data being submitted as a
     * string.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun value(): String = value.getRequired("value")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parent(): Optional<MultiPart> = parent.getOptional("parent")

    /**
     * Returns the raw JSON value of [contentDisposition].
     *
     * Unlike [contentDisposition], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("contentDisposition")
    @ExcludeMissing
    fun _contentDisposition(): JsonField<ContentDisposition> = contentDisposition

    /**
     * Returns the raw JSON value of [formDataContentDisposition].
     *
     * Unlike [formDataContentDisposition], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("formDataContentDisposition")
    @ExcludeMissing
    fun _formDataContentDisposition(): JsonField<FormDataContentDisposition> =
        formDataContentDisposition

    /**
     * Returns the raw JSON value of [headers].
     *
     * Unlike [headers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("headers") @ExcludeMissing fun _headers(): JsonField<Headers> = headers

    /**
     * Returns the raw JSON value of [mediaType].
     *
     * Unlike [mediaType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mediaType") @ExcludeMissing fun _mediaType(): JsonField<MediaType> = mediaType

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [parameterizedHeaders].
     *
     * Unlike [parameterizedHeaders], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("parameterizedHeaders")
    @ExcludeMissing
    fun _parameterizedHeaders(): JsonField<ParameterizedHeaders> = parameterizedHeaders

    /**
     * Returns the raw JSON value of [simple].
     *
     * Unlike [simple], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("simple") @ExcludeMissing fun _simple(): JsonField<Boolean> = simple

    /**
     * Returns the raw JSON value of [value].
     *
     * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

    /**
     * Returns the raw JSON value of [parent].
     *
     * Unlike [parent], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parent") @ExcludeMissing fun _parent(): JsonField<MultiPart> = parent

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
         * Returns a mutable builder for constructing an instance of [FormDataBodyPart].
         *
         * The following fields are required:
         * ```java
         * .contentDisposition()
         * .entity()
         * .formDataContentDisposition()
         * .headers()
         * .mediaType()
         * .messageBodyWorkers()
         * .name()
         * .parameterizedHeaders()
         * .providers()
         * .simple()
         * .value()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FormDataBodyPart]. */
    class Builder internal constructor() {

        private var contentDisposition: JsonField<ContentDisposition>? = null
        private var entity: JsonValue? = null
        private var formDataContentDisposition: JsonField<FormDataContentDisposition>? = null
        private var headers: JsonField<Headers>? = null
        private var mediaType: JsonField<MediaType>? = null
        private var messageBodyWorkers: JsonValue? = null
        private var name: JsonField<String>? = null
        private var parameterizedHeaders: JsonField<ParameterizedHeaders>? = null
        private var providers: JsonValue? = null
        private var simple: JsonField<Boolean>? = null
        private var value: JsonField<String>? = null
        private var parent: JsonField<MultiPart> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(formDataBodyPart: FormDataBodyPart) = apply {
            contentDisposition = formDataBodyPart.contentDisposition
            entity = formDataBodyPart.entity
            formDataContentDisposition = formDataBodyPart.formDataContentDisposition
            headers = formDataBodyPart.headers
            mediaType = formDataBodyPart.mediaType
            messageBodyWorkers = formDataBodyPart.messageBodyWorkers
            name = formDataBodyPart.name
            parameterizedHeaders = formDataBodyPart.parameterizedHeaders
            providers = formDataBodyPart.providers
            simple = formDataBodyPart.simple
            value = formDataBodyPart.value
            parent = formDataBodyPart.parent
            additionalProperties = formDataBodyPart.additionalProperties.toMutableMap()
        }

        fun contentDisposition(contentDisposition: ContentDisposition) =
            contentDisposition(JsonField.of(contentDisposition))

        /**
         * Sets [Builder.contentDisposition] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contentDisposition] with a well-typed
         * [ContentDisposition] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun contentDisposition(contentDisposition: JsonField<ContentDisposition>) = apply {
            this.contentDisposition = contentDisposition
        }

        /**
         * An object representing the entity of the form data part, which contains the actual data
         * being submitted.
         */
        fun entity(entity: JsonValue) = apply { this.entity = entity }

        fun formDataContentDisposition(formDataContentDisposition: FormDataContentDisposition) =
            formDataContentDisposition(JsonField.of(formDataContentDisposition))

        /**
         * Sets [Builder.formDataContentDisposition] to an arbitrary JSON value.
         *
         * You should usually call [Builder.formDataContentDisposition] with a well-typed
         * [FormDataContentDisposition] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun formDataContentDisposition(
            formDataContentDisposition: JsonField<FormDataContentDisposition>
        ) = apply { this.formDataContentDisposition = formDataContentDisposition }

        /**
         * An object containing the headers associated with this form data part, where each header
         * can have multiple string values.
         */
        fun headers(headers: Headers) = headers(JsonField.of(headers))

        /**
         * Sets [Builder.headers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.headers] with a well-typed [Headers] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun headers(headers: JsonField<Headers>) = apply { this.headers = headers }

        fun mediaType(mediaType: MediaType) = mediaType(JsonField.of(mediaType))

        /**
         * Sets [Builder.mediaType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mediaType] with a well-typed [MediaType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun mediaType(mediaType: JsonField<MediaType>) = apply { this.mediaType = mediaType }

        /**
         * An object representing the message body workers, which are responsible for processing the
         * body of the message.
         */
        fun messageBodyWorkers(messageBodyWorkers: JsonValue) = apply {
            this.messageBodyWorkers = messageBodyWorkers
        }

        /**
         * The name of the form data part, typically used to identify the part within the multipart
         * request.
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
         * An object containing parameterized headers, where each header can have multiple values
         * represented as ParameterizedHeader objects.
         */
        fun parameterizedHeaders(parameterizedHeaders: ParameterizedHeaders) =
            parameterizedHeaders(JsonField.of(parameterizedHeaders))

        /**
         * Sets [Builder.parameterizedHeaders] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parameterizedHeaders] with a well-typed
         * [ParameterizedHeaders] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun parameterizedHeaders(parameterizedHeaders: JsonField<ParameterizedHeaders>) = apply {
            this.parameterizedHeaders = parameterizedHeaders
        }

        /** An object representing the providers associated with this form data part. */
        fun providers(providers: JsonValue) = apply { this.providers = providers }

        /**
         * A boolean indicating whether the form data part is simple, typically meaning it does not
         * contain complex nested structures.
         */
        fun simple(simple: Boolean) = simple(JsonField.of(simple))

        /**
         * Sets [Builder.simple] to an arbitrary JSON value.
         *
         * You should usually call [Builder.simple] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun simple(simple: JsonField<Boolean>) = apply { this.simple = simple }

        /**
         * The string value of the form data part, representing the actual data being submitted as a
         * string.
         */
        fun value(value: String) = value(JsonField.of(value))

        /**
         * Sets [Builder.value] to an arbitrary JSON value.
         *
         * You should usually call [Builder.value] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun value(value: JsonField<String>) = apply { this.value = value }

        fun parent(parent: MultiPart) = parent(JsonField.of(parent))

        /**
         * Sets [Builder.parent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parent] with a well-typed [MultiPart] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun parent(parent: JsonField<MultiPart>) = apply { this.parent = parent }

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
         * Returns an immutable instance of [FormDataBodyPart].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .contentDisposition()
         * .entity()
         * .formDataContentDisposition()
         * .headers()
         * .mediaType()
         * .messageBodyWorkers()
         * .name()
         * .parameterizedHeaders()
         * .providers()
         * .simple()
         * .value()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FormDataBodyPart =
            FormDataBodyPart(
                checkRequired("contentDisposition", contentDisposition),
                checkRequired("entity", entity),
                checkRequired("formDataContentDisposition", formDataContentDisposition),
                checkRequired("headers", headers),
                checkRequired("mediaType", mediaType),
                checkRequired("messageBodyWorkers", messageBodyWorkers),
                checkRequired("name", name),
                checkRequired("parameterizedHeaders", parameterizedHeaders),
                checkRequired("providers", providers),
                checkRequired("simple", simple),
                checkRequired("value", value),
                parent,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FormDataBodyPart = apply {
        if (validated) {
            return@apply
        }

        contentDisposition().validate()
        formDataContentDisposition().validate()
        headers().validate()
        mediaType().validate()
        name()
        parameterizedHeaders().validate()
        simple()
        value()
        parent().ifPresent { it.validate() }
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
        (contentDisposition.asKnown().getOrNull()?.validity() ?: 0) +
            (formDataContentDisposition.asKnown().getOrNull()?.validity() ?: 0) +
            (headers.asKnown().getOrNull()?.validity() ?: 0) +
            (mediaType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (parameterizedHeaders.asKnown().getOrNull()?.validity() ?: 0) +
            (if (simple.asKnown().isPresent) 1 else 0) +
            (if (value.asKnown().isPresent) 1 else 0) +
            (parent.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * An object containing the headers associated with this form data part, where each header can
     * have multiple string values.
     */
    class Headers
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Headers]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Headers]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(headers: Headers) = apply {
                additionalProperties = headers.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Headers].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Headers = Headers(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Headers = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Headers && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Headers{additionalProperties=$additionalProperties}"
    }

    /**
     * An object containing parameterized headers, where each header can have multiple values
     * represented as ParameterizedHeader objects.
     */
    class ParameterizedHeaders
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [ParameterizedHeaders]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ParameterizedHeaders]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(parameterizedHeaders: ParameterizedHeaders) = apply {
                additionalProperties = parameterizedHeaders.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ParameterizedHeaders].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ParameterizedHeaders =
                ParameterizedHeaders(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): ParameterizedHeaders = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ParameterizedHeaders &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ParameterizedHeaders{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FormDataBodyPart &&
            contentDisposition == other.contentDisposition &&
            entity == other.entity &&
            formDataContentDisposition == other.formDataContentDisposition &&
            headers == other.headers &&
            mediaType == other.mediaType &&
            messageBodyWorkers == other.messageBodyWorkers &&
            name == other.name &&
            parameterizedHeaders == other.parameterizedHeaders &&
            providers == other.providers &&
            simple == other.simple &&
            value == other.value &&
            parent == other.parent &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            contentDisposition,
            entity,
            formDataContentDisposition,
            headers,
            mediaType,
            messageBodyWorkers,
            name,
            parameterizedHeaders,
            providers,
            simple,
            value,
            parent,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FormDataBodyPart{contentDisposition=$contentDisposition, entity=$entity, formDataContentDisposition=$formDataContentDisposition, headers=$headers, mediaType=$mediaType, messageBodyWorkers=$messageBodyWorkers, name=$name, parameterizedHeaders=$parameterizedHeaders, providers=$providers, simple=$simple, value=$value, parent=$parent, additionalProperties=$additionalProperties}"
}
