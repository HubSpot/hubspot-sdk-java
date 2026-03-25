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
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class MultiPart
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val bodyParts: JsonField<List<BodyPart>>,
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
        @JsonProperty("bodyParts")
        @ExcludeMissing
        bodyParts: JsonField<List<BodyPart>> = JsonMissing.of(),
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
        bodyParts,
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
     * An array of BodyPart objects, each representing a distinct part of the multipart entity.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun bodyParts(): List<BodyPart> = bodyParts.getRequired("bodyParts")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contentDisposition(): ContentDisposition =
        contentDisposition.getRequired("contentDisposition")

    /**
     * An object that holds the main content or payload of the multipart entity.
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = multiPart.entity().convert(MyClass.class);
     * ```
     */
    @JsonProperty("entity") @ExcludeMissing fun _entity(): JsonValue = entity

    /**
     * An object containing a map of header names to their respective values, where each value is an
     * array of strings.
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
     * An object that may contain workers for processing the message body, though its specific
     * properties are not detailed.
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = multiPart.messageBodyWorkers().convert(MyClass.class);
     * ```
     */
    @JsonProperty("messageBodyWorkers")
    @ExcludeMissing
    fun _messageBodyWorkers(): JsonValue = messageBodyWorkers

    /**
     * An object containing a map of header names to arrays of ParameterizedHeader objects, which
     * include additional parameters for each header.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun parameterizedHeaders(): ParameterizedHeaders =
        parameterizedHeaders.getRequired("parameterizedHeaders")

    /**
     * An object that may contain providers related to the multipart entity, though its specific
     * properties are not detailed.
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = multiPart.providers().convert(MyClass.class);
     * ```
     */
    @JsonProperty("providers") @ExcludeMissing fun _providers(): JsonValue = providers

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parent(): Optional<MultiPart> = parent.getOptional("parent")

    /**
     * Returns the raw JSON value of [bodyParts].
     *
     * Unlike [bodyParts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bodyParts")
    @ExcludeMissing
    fun _bodyParts(): JsonField<List<BodyPart>> = bodyParts

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
         * Returns a mutable builder for constructing an instance of [MultiPart].
         *
         * The following fields are required:
         * ```java
         * .bodyParts()
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

    /** A builder for [MultiPart]. */
    class Builder internal constructor() {

        private var bodyParts: JsonField<MutableList<BodyPart>>? = null
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
        internal fun from(multiPart: MultiPart) = apply {
            bodyParts = multiPart.bodyParts.map { it.toMutableList() }
            contentDisposition = multiPart.contentDisposition
            entity = multiPart.entity
            headers = multiPart.headers
            mediaType = multiPart.mediaType
            messageBodyWorkers = multiPart.messageBodyWorkers
            parameterizedHeaders = multiPart.parameterizedHeaders
            providers = multiPart.providers
            parent = multiPart.parent
            additionalProperties = multiPart.additionalProperties.toMutableMap()
        }

        /**
         * An array of BodyPart objects, each representing a distinct part of the multipart entity.
         */
        fun bodyParts(bodyParts: List<BodyPart>) = bodyParts(JsonField.of(bodyParts))

        /**
         * Sets [Builder.bodyParts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bodyParts] with a well-typed `List<BodyPart>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun bodyParts(bodyParts: JsonField<List<BodyPart>>) = apply {
            this.bodyParts = bodyParts.map { it.toMutableList() }
        }

        /**
         * Adds a single [BodyPart] to [bodyParts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBodyPart(bodyPart: BodyPart) = apply {
            bodyParts =
                (bodyParts ?: JsonField.of(mutableListOf())).also {
                    checkKnown("bodyParts", it).add(bodyPart)
                }
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

        /** An object that holds the main content or payload of the multipart entity. */
        fun entity(entity: JsonValue) = apply { this.entity = entity }

        /**
         * An object containing a map of header names to their respective values, where each value
         * is an array of strings.
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
         * An object that may contain workers for processing the message body, though its specific
         * properties are not detailed.
         */
        fun messageBodyWorkers(messageBodyWorkers: JsonValue) = apply {
            this.messageBodyWorkers = messageBodyWorkers
        }

        /**
         * An object containing a map of header names to arrays of ParameterizedHeader objects,
         * which include additional parameters for each header.
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
         * An object that may contain providers related to the multipart entity, though its specific
         * properties are not detailed.
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
         * Returns an immutable instance of [MultiPart].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .bodyParts()
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
        fun build(): MultiPart =
            MultiPart(
                checkRequired("bodyParts", bodyParts).map { it.toImmutable() },
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

    fun validate(): MultiPart = apply {
        if (validated) {
            return@apply
        }

        bodyParts().forEach { it.validate() }
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
        (bodyParts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (contentDisposition.asKnown().getOrNull()?.validity() ?: 0) +
            (headers.asKnown().getOrNull()?.validity() ?: 0) +
            (mediaType.asKnown().getOrNull()?.validity() ?: 0) +
            (parameterizedHeaders.asKnown().getOrNull()?.validity() ?: 0) +
            (parent.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * An object containing a map of header names to their respective values, where each value is an
     * array of strings.
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
     * An object containing a map of header names to arrays of ParameterizedHeader objects, which
     * include additional parameters for each header.
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

        return other is MultiPart &&
            bodyParts == other.bodyParts &&
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
            bodyParts,
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
        "MultiPart{bodyParts=$bodyParts, contentDisposition=$contentDisposition, entity=$entity, headers=$headers, mediaType=$mediaType, messageBodyWorkers=$messageBodyWorkers, parameterizedHeaders=$parameterizedHeaders, providers=$providers, parent=$parent, additionalProperties=$additionalProperties}"
}
