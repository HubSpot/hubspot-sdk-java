// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Register a new channel along with its capabilities and the webhook url that will be used to
 * receive messages published over the channel
 */
class CustomChannelCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun capabilities(): Capabilities = body.capabilities()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun channelAccountConnectionRedirectUrl(): Optional<String> =
        body.channelAccountConnectionRedirectUrl()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun channelDescription(): Optional<String> = body.channelDescription()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun channelLogoUrl(): Optional<String> = body.channelLogoUrl()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookUrl(): Optional<String> = body.webhookUrl()

    /**
     * Returns the raw JSON value of [capabilities].
     *
     * Unlike [capabilities], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _capabilities(): JsonField<Capabilities> = body._capabilities()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [channelAccountConnectionRedirectUrl].
     *
     * Unlike [channelAccountConnectionRedirectUrl], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    fun _channelAccountConnectionRedirectUrl(): JsonField<String> =
        body._channelAccountConnectionRedirectUrl()

    /**
     * Returns the raw JSON value of [channelDescription].
     *
     * Unlike [channelDescription], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _channelDescription(): JsonField<String> = body._channelDescription()

    /**
     * Returns the raw JSON value of [channelLogoUrl].
     *
     * Unlike [channelLogoUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _channelLogoUrl(): JsonField<String> = body._channelLogoUrl()

    /**
     * Returns the raw JSON value of [webhookUrl].
     *
     * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _webhookUrl(): JsonField<String> = body._webhookUrl()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomChannelCreateParams].
         *
         * The following fields are required:
         * ```java
         * .capabilities()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomChannelCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(customChannelCreateParams: CustomChannelCreateParams) = apply {
            body = customChannelCreateParams.body.toBuilder()
            additionalHeaders = customChannelCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = customChannelCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [capabilities]
         * - [name]
         * - [channelAccountConnectionRedirectUrl]
         * - [channelDescription]
         * - [channelLogoUrl]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun capabilities(capabilities: Capabilities) = apply { body.capabilities(capabilities) }

        /**
         * Sets [Builder.capabilities] to an arbitrary JSON value.
         *
         * You should usually call [Builder.capabilities] with a well-typed [Capabilities] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun capabilities(capabilities: JsonField<Capabilities>) = apply {
            body.capabilities(capabilities)
        }

        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun channelAccountConnectionRedirectUrl(channelAccountConnectionRedirectUrl: String) =
            apply {
                body.channelAccountConnectionRedirectUrl(channelAccountConnectionRedirectUrl)
            }

        /**
         * Sets [Builder.channelAccountConnectionRedirectUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channelAccountConnectionRedirectUrl] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun channelAccountConnectionRedirectUrl(
            channelAccountConnectionRedirectUrl: JsonField<String>
        ) = apply { body.channelAccountConnectionRedirectUrl(channelAccountConnectionRedirectUrl) }

        fun channelDescription(channelDescription: String) = apply {
            body.channelDescription(channelDescription)
        }

        /**
         * Sets [Builder.channelDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channelDescription] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun channelDescription(channelDescription: JsonField<String>) = apply {
            body.channelDescription(channelDescription)
        }

        fun channelLogoUrl(channelLogoUrl: String) = apply { body.channelLogoUrl(channelLogoUrl) }

        /**
         * Sets [Builder.channelLogoUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channelLogoUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun channelLogoUrl(channelLogoUrl: JsonField<String>) = apply {
            body.channelLogoUrl(channelLogoUrl)
        }

        fun webhookUrl(webhookUrl: String) = apply { body.webhookUrl(webhookUrl) }

        /**
         * Sets [Builder.webhookUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun webhookUrl(webhookUrl: JsonField<String>) = apply { body.webhookUrl(webhookUrl) }

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
         * Returns an immutable instance of [CustomChannelCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .capabilities()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomChannelCreateParams =
            CustomChannelCreateParams(
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
        private val capabilities: JsonField<Capabilities>,
        private val name: JsonField<String>,
        private val channelAccountConnectionRedirectUrl: JsonField<String>,
        private val channelDescription: JsonField<String>,
        private val channelLogoUrl: JsonField<String>,
        private val webhookUrl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("capabilities")
            @ExcludeMissing
            capabilities: JsonField<Capabilities> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("channelAccountConnectionRedirectUrl")
            @ExcludeMissing
            channelAccountConnectionRedirectUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("channelDescription")
            @ExcludeMissing
            channelDescription: JsonField<String> = JsonMissing.of(),
            @JsonProperty("channelLogoUrl")
            @ExcludeMissing
            channelLogoUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("webhookUrl")
            @ExcludeMissing
            webhookUrl: JsonField<String> = JsonMissing.of(),
        ) : this(
            capabilities,
            name,
            channelAccountConnectionRedirectUrl,
            channelDescription,
            channelLogoUrl,
            webhookUrl,
            mutableMapOf(),
        )

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun capabilities(): Capabilities = capabilities.getRequired("capabilities")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun channelAccountConnectionRedirectUrl(): Optional<String> =
            channelAccountConnectionRedirectUrl.getOptional("channelAccountConnectionRedirectUrl")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun channelDescription(): Optional<String> =
            channelDescription.getOptional("channelDescription")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun channelLogoUrl(): Optional<String> = channelLogoUrl.getOptional("channelLogoUrl")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun webhookUrl(): Optional<String> = webhookUrl.getOptional("webhookUrl")

        /**
         * Returns the raw JSON value of [capabilities].
         *
         * Unlike [capabilities], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("capabilities")
        @ExcludeMissing
        fun _capabilities(): JsonField<Capabilities> = capabilities

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [channelAccountConnectionRedirectUrl].
         *
         * Unlike [channelAccountConnectionRedirectUrl], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("channelAccountConnectionRedirectUrl")
        @ExcludeMissing
        fun _channelAccountConnectionRedirectUrl(): JsonField<String> =
            channelAccountConnectionRedirectUrl

        /**
         * Returns the raw JSON value of [channelDescription].
         *
         * Unlike [channelDescription], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("channelDescription")
        @ExcludeMissing
        fun _channelDescription(): JsonField<String> = channelDescription

        /**
         * Returns the raw JSON value of [channelLogoUrl].
         *
         * Unlike [channelLogoUrl], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("channelLogoUrl")
        @ExcludeMissing
        fun _channelLogoUrl(): JsonField<String> = channelLogoUrl

        /**
         * Returns the raw JSON value of [webhookUrl].
         *
         * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("webhookUrl")
        @ExcludeMissing
        fun _webhookUrl(): JsonField<String> = webhookUrl

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
             * .capabilities()
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var capabilities: JsonField<Capabilities>? = null
            private var name: JsonField<String>? = null
            private var channelAccountConnectionRedirectUrl: JsonField<String> = JsonMissing.of()
            private var channelDescription: JsonField<String> = JsonMissing.of()
            private var channelLogoUrl: JsonField<String> = JsonMissing.of()
            private var webhookUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                capabilities = body.capabilities
                name = body.name
                channelAccountConnectionRedirectUrl = body.channelAccountConnectionRedirectUrl
                channelDescription = body.channelDescription
                channelLogoUrl = body.channelLogoUrl
                webhookUrl = body.webhookUrl
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun capabilities(capabilities: Capabilities) = capabilities(JsonField.of(capabilities))

            /**
             * Sets [Builder.capabilities] to an arbitrary JSON value.
             *
             * You should usually call [Builder.capabilities] with a well-typed [Capabilities] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun capabilities(capabilities: JsonField<Capabilities>) = apply {
                this.capabilities = capabilities
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun channelAccountConnectionRedirectUrl(channelAccountConnectionRedirectUrl: String) =
                channelAccountConnectionRedirectUrl(
                    JsonField.of(channelAccountConnectionRedirectUrl)
                )

            /**
             * Sets [Builder.channelAccountConnectionRedirectUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.channelAccountConnectionRedirectUrl] with a
             * well-typed [String] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun channelAccountConnectionRedirectUrl(
                channelAccountConnectionRedirectUrl: JsonField<String>
            ) = apply {
                this.channelAccountConnectionRedirectUrl = channelAccountConnectionRedirectUrl
            }

            fun channelDescription(channelDescription: String) =
                channelDescription(JsonField.of(channelDescription))

            /**
             * Sets [Builder.channelDescription] to an arbitrary JSON value.
             *
             * You should usually call [Builder.channelDescription] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun channelDescription(channelDescription: JsonField<String>) = apply {
                this.channelDescription = channelDescription
            }

            fun channelLogoUrl(channelLogoUrl: String) =
                channelLogoUrl(JsonField.of(channelLogoUrl))

            /**
             * Sets [Builder.channelLogoUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.channelLogoUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun channelLogoUrl(channelLogoUrl: JsonField<String>) = apply {
                this.channelLogoUrl = channelLogoUrl
            }

            fun webhookUrl(webhookUrl: String) = webhookUrl(JsonField.of(webhookUrl))

            /**
             * Sets [Builder.webhookUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun webhookUrl(webhookUrl: JsonField<String>) = apply { this.webhookUrl = webhookUrl }

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
             * .capabilities()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("capabilities", capabilities),
                    checkRequired("name", name),
                    channelAccountConnectionRedirectUrl,
                    channelDescription,
                    channelLogoUrl,
                    webhookUrl,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            capabilities().validate()
            name()
            channelAccountConnectionRedirectUrl()
            channelDescription()
            channelLogoUrl()
            webhookUrl()
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
            (capabilities.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (channelAccountConnectionRedirectUrl.asKnown().isPresent) 1 else 0) +
                (if (channelDescription.asKnown().isPresent) 1 else 0) +
                (if (channelLogoUrl.asKnown().isPresent) 1 else 0) +
                (if (webhookUrl.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                capabilities == other.capabilities &&
                name == other.name &&
                channelAccountConnectionRedirectUrl == other.channelAccountConnectionRedirectUrl &&
                channelDescription == other.channelDescription &&
                channelLogoUrl == other.channelLogoUrl &&
                webhookUrl == other.webhookUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                capabilities,
                name,
                channelAccountConnectionRedirectUrl,
                channelDescription,
                channelLogoUrl,
                webhookUrl,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{capabilities=$capabilities, name=$name, channelAccountConnectionRedirectUrl=$channelAccountConnectionRedirectUrl, channelDescription=$channelDescription, channelLogoUrl=$channelLogoUrl, webhookUrl=$webhookUrl, additionalProperties=$additionalProperties}"
    }

    class Capabilities
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

            /** Returns a mutable builder for constructing an instance of [Capabilities]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Capabilities]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(capabilities: Capabilities) = apply {
                additionalProperties = capabilities.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Capabilities].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Capabilities = Capabilities(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Capabilities = apply {
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

            return other is Capabilities && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Capabilities{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomChannelCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CustomChannelCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
