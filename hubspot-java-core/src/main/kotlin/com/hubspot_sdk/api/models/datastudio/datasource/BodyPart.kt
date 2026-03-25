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

class BodyPart
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val contentDisposition: JsonField<ContentDisposition>,
    private val entity: JsonValue,
    private val headers: JsonField<Headers>,
    private val mediaType: JsonField<MediaType>,
    private val messageBodyWorkers: JsonValue,
    private val parameterizedHeaders: JsonField<ParameterizedHeaders>,
    private val providers: JsonValue,
    private val parent: JsonField<MultiPart>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("contentDisposition")
        @ExcludeMissing
        contentDisposition: JsonField<ContentDisposition> = JsonMissing.of(),
        @JsonProperty("entity") @ExcludeMissing entity: JsonValue = JsonMissing.of(),
        @JsonProperty("headers") @ExcludeMissing headers: JsonField<Headers> = JsonMissing.of(),
        @JsonProperty("mediaType")
        @ExcludeMissing
        mediaType: JsonField<MediaType> = JsonMissing.of(),
        @JsonProperty("messageBodyWorkers")
        @ExcludeMissing
        messageBodyWorkers: JsonValue = JsonMissing.of(),
        @JsonProperty("parameterizedHeaders")
        @ExcludeMissing
        parameterizedHeaders: JsonField<ParameterizedHeaders> = JsonMissing.of(),
        @JsonProperty("providers") @ExcludeMissing providers: JsonValue = JsonMissing.of(),
        @JsonProperty("parent") @ExcludeMissing parent: JsonField<MultiPart> = JsonMissing.of(),
    ) : this(
        contentDisposition,
        entity,
        headers,
        mediaType,
        messageBodyWorkers,
        parameterizedHeaders,
        providers,
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
     * An object representing the actual content or payload of the body part.
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = bodyPart.entity().convert(MyClass.class);
     * ```
     */
    @JsonProperty("entity") @ExcludeMissing fun _entity(): JsonValue = entity

    /**
     * An object containing the headers associated with this body part, where each header can have
     * multiple string values.
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
     * An object representing workers that handle the processing of the message body.
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = bodyPart.messageBodyWorkers().convert(MyClass.class);
     * ```
     */
    @JsonProperty("messageBodyWorkers")
    @ExcludeMissing
    fun _messageBodyWorkers(): JsonValue = messageBodyWorkers

    /**
     * An object containing headers with parameters, where each header can have multiple
     * ParameterizedHeader objects.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun parameterizedHeaders(): ParameterizedHeaders =
        parameterizedHeaders.getRequired("parameterizedHeaders")

    /**
     * An object representing providers that supply additional handling or processing for the body
     * part.
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = bodyPart.providers().convert(MyClass.class);
     * ```
     */
    @JsonProperty("providers") @ExcludeMissing fun _providers(): JsonValue = providers

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
     * Returns the raw JSON value of [parameterizedHeaders].
     *
     * Unlike [parameterizedHeaders], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("parameterizedHeaders")
    @ExcludeMissing
    fun _parameterizedHeaders(): JsonField<ParameterizedHeaders> = parameterizedHeaders

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
         * Returns a mutable builder for constructing an instance of [BodyPart].
         *
         * The following fields are required:
         * ```java
         * .contentDisposition()
         * .entity()
         * .headers()
         * .mediaType()
         * .messageBodyWorkers()
         * .parameterizedHeaders()
         * .providers()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BodyPart]. */
    class Builder internal constructor() {

        private var contentDisposition: JsonField<ContentDisposition>? = null
        private var entity: JsonValue? = null
        private var headers: JsonField<Headers>? = null
        private var mediaType: JsonField<MediaType>? = null
        private var messageBodyWorkers: JsonValue? = null
        private var parameterizedHeaders: JsonField<ParameterizedHeaders>? = null
        private var providers: JsonValue? = null
        private var parent: JsonField<MultiPart> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(bodyPart: BodyPart) = apply {
            contentDisposition = bodyPart.contentDisposition
            entity = bodyPart.entity
            headers = bodyPart.headers
            mediaType = bodyPart.mediaType
            messageBodyWorkers = bodyPart.messageBodyWorkers
            parameterizedHeaders = bodyPart.parameterizedHeaders
            providers = bodyPart.providers
            parent = bodyPart.parent
            additionalProperties = bodyPart.additionalProperties.toMutableMap()
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

        /** An object representing the actual content or payload of the body part. */
        fun entity(entity: JsonValue) = apply { this.entity = entity }

        /**
         * An object containing the headers associated with this body part, where each header can
         * have multiple string values.
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

        /** An object representing workers that handle the processing of the message body. */
        fun messageBodyWorkers(messageBodyWorkers: JsonValue) = apply {
            this.messageBodyWorkers = messageBodyWorkers
        }

        /**
         * An object containing headers with parameters, where each header can have multiple
         * ParameterizedHeader objects.
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

        /**
         * An object representing providers that supply additional handling or processing for the
         * body part.
         */
        fun providers(providers: JsonValue) = apply { this.providers = providers }

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
         * Returns an immutable instance of [BodyPart].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .contentDisposition()
         * .entity()
         * .headers()
         * .mediaType()
         * .messageBodyWorkers()
         * .parameterizedHeaders()
         * .providers()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BodyPart =
            BodyPart(
                checkRequired("contentDisposition", contentDisposition),
                checkRequired("entity", entity),
                checkRequired("headers", headers),
                checkRequired("mediaType", mediaType),
                checkRequired("messageBodyWorkers", messageBodyWorkers),
                checkRequired("parameterizedHeaders", parameterizedHeaders),
                checkRequired("providers", providers),
                parent,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BodyPart = apply {
        if (validated) {
            return@apply
        }

        contentDisposition().validate()
        headers().validate()
        mediaType().validate()
        parameterizedHeaders().validate()
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
            (headers.asKnown().getOrNull()?.validity() ?: 0) +
            (mediaType.asKnown().getOrNull()?.validity() ?: 0) +
            (parameterizedHeaders.asKnown().getOrNull()?.validity() ?: 0) +
            (parent.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * An object containing the headers associated with this body part, where each header can have
     * multiple string values.
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
     * An object containing headers with parameters, where each header can have multiple
     * ParameterizedHeader objects.
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

        return other is BodyPart &&
            contentDisposition == other.contentDisposition &&
            entity == other.entity &&
            headers == other.headers &&
            mediaType == other.mediaType &&
            messageBodyWorkers == other.messageBodyWorkers &&
            parameterizedHeaders == other.parameterizedHeaders &&
            providers == other.providers &&
            parent == other.parent &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            contentDisposition,
            entity,
            headers,
            mediaType,
            messageBodyWorkers,
            parameterizedHeaders,
            providers,
            parent,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BodyPart{contentDisposition=$contentDisposition, entity=$entity, headers=$headers, mediaType=$mediaType, messageBodyWorkers=$messageBodyWorkers, parameterizedHeaders=$parameterizedHeaders, providers=$providers, parent=$parent, additionalProperties=$additionalProperties}"
}
