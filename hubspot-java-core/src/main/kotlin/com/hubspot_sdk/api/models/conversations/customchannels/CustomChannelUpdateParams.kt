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
 * Update the capabilities for an existing. You can also use it to update the channel's webhookUri
 * and its channelAccountConnectionRedirectUrl.
 */
class CustomChannelUpdateParams
private constructor(
    private val channelId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun channelId(): Optional<String> = Optional.ofNullable(channelId)

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun capabilities(): Capabilities = body.capabilities()

    fun _channelDescription(): JsonValue = body._channelDescription()

    fun _channelLogoUrl(): JsonValue = body._channelLogoUrl()

    fun _channelAccountConnectionRedirectUrl(): JsonValue =
        body._channelAccountConnectionRedirectUrl()

    fun _name(): JsonValue = body._name()

    fun _webhookUrl(): JsonValue = body._webhookUrl()

    /**
     * Returns the raw JSON value of [capabilities].
     *
     * Unlike [capabilities], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _capabilities(): JsonField<Capabilities> = body._capabilities()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomChannelUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .capabilities()
         * .channelDescription()
         * .channelLogoUrl()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomChannelUpdateParams]. */
    class Builder internal constructor() {

        private var channelId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(customChannelUpdateParams: CustomChannelUpdateParams) = apply {
            channelId = customChannelUpdateParams.channelId
            body = customChannelUpdateParams.body.toBuilder()
            additionalHeaders = customChannelUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = customChannelUpdateParams.additionalQueryParams.toBuilder()
        }

        fun channelId(channelId: String?) = apply { this.channelId = channelId }

        /** Alias for calling [Builder.channelId] with `channelId.orElse(null)`. */
        fun channelId(channelId: Optional<String>) = channelId(channelId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [capabilities]
         * - [channelDescription]
         * - [channelLogoUrl]
         * - [channelAccountConnectionRedirectUrl]
         * - [name]
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

        fun channelDescription(channelDescription: JsonValue) = apply {
            body.channelDescription(channelDescription)
        }

        fun channelLogoUrl(channelLogoUrl: JsonValue) = apply {
            body.channelLogoUrl(channelLogoUrl)
        }

        fun channelAccountConnectionRedirectUrl(channelAccountConnectionRedirectUrl: JsonValue) =
            apply {
                body.channelAccountConnectionRedirectUrl(channelAccountConnectionRedirectUrl)
            }

        fun name(name: JsonValue) = apply { body.name(name) }

        fun webhookUrl(webhookUrl: JsonValue) = apply { body.webhookUrl(webhookUrl) }

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
         * Returns an immutable instance of [CustomChannelUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .capabilities()
         * .channelDescription()
         * .channelLogoUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomChannelUpdateParams =
            CustomChannelUpdateParams(
                channelId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> channelId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val capabilities: JsonField<Capabilities>,
        private val channelDescription: JsonValue,
        private val channelLogoUrl: JsonValue,
        private val channelAccountConnectionRedirectUrl: JsonValue,
        private val name: JsonValue,
        private val webhookUrl: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("capabilities")
            @ExcludeMissing
            capabilities: JsonField<Capabilities> = JsonMissing.of(),
            @JsonProperty("channelDescription")
            @ExcludeMissing
            channelDescription: JsonValue = JsonMissing.of(),
            @JsonProperty("channelLogoUrl")
            @ExcludeMissing
            channelLogoUrl: JsonValue = JsonMissing.of(),
            @JsonProperty("channelAccountConnectionRedirectUrl")
            @ExcludeMissing
            channelAccountConnectionRedirectUrl: JsonValue = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonValue = JsonMissing.of(),
            @JsonProperty("webhookUrl") @ExcludeMissing webhookUrl: JsonValue = JsonMissing.of(),
        ) : this(
            capabilities,
            channelDescription,
            channelLogoUrl,
            channelAccountConnectionRedirectUrl,
            name,
            webhookUrl,
            mutableMapOf(),
        )

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun capabilities(): Capabilities = capabilities.getRequired("capabilities")

        @JsonProperty("channelDescription")
        @ExcludeMissing
        fun _channelDescription(): JsonValue = channelDescription

        @JsonProperty("channelLogoUrl")
        @ExcludeMissing
        fun _channelLogoUrl(): JsonValue = channelLogoUrl

        @JsonProperty("channelAccountConnectionRedirectUrl")
        @ExcludeMissing
        fun _channelAccountConnectionRedirectUrl(): JsonValue = channelAccountConnectionRedirectUrl

        @JsonProperty("name") @ExcludeMissing fun _name(): JsonValue = name

        @JsonProperty("webhookUrl") @ExcludeMissing fun _webhookUrl(): JsonValue = webhookUrl

        /**
         * Returns the raw JSON value of [capabilities].
         *
         * Unlike [capabilities], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("capabilities")
        @ExcludeMissing
        fun _capabilities(): JsonField<Capabilities> = capabilities

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
             * .channelDescription()
             * .channelLogoUrl()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var capabilities: JsonField<Capabilities>? = null
            private var channelDescription: JsonValue? = null
            private var channelLogoUrl: JsonValue? = null
            private var channelAccountConnectionRedirectUrl: JsonValue = JsonMissing.of()
            private var name: JsonValue = JsonMissing.of()
            private var webhookUrl: JsonValue = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                capabilities = body.capabilities
                channelDescription = body.channelDescription
                channelLogoUrl = body.channelLogoUrl
                channelAccountConnectionRedirectUrl = body.channelAccountConnectionRedirectUrl
                name = body.name
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

            fun channelDescription(channelDescription: JsonValue) = apply {
                this.channelDescription = channelDescription
            }

            fun channelLogoUrl(channelLogoUrl: JsonValue) = apply {
                this.channelLogoUrl = channelLogoUrl
            }

            fun channelAccountConnectionRedirectUrl(
                channelAccountConnectionRedirectUrl: JsonValue
            ) = apply {
                this.channelAccountConnectionRedirectUrl = channelAccountConnectionRedirectUrl
            }

            fun name(name: JsonValue) = apply { this.name = name }

            fun webhookUrl(webhookUrl: JsonValue) = apply { this.webhookUrl = webhookUrl }

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
             * .channelDescription()
             * .channelLogoUrl()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("capabilities", capabilities),
                    checkRequired("channelDescription", channelDescription),
                    checkRequired("channelLogoUrl", channelLogoUrl),
                    channelAccountConnectionRedirectUrl,
                    name,
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
        internal fun validity(): Int = (capabilities.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                capabilities == other.capabilities &&
                channelDescription == other.channelDescription &&
                channelLogoUrl == other.channelLogoUrl &&
                channelAccountConnectionRedirectUrl == other.channelAccountConnectionRedirectUrl &&
                name == other.name &&
                webhookUrl == other.webhookUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                capabilities,
                channelDescription,
                channelLogoUrl,
                channelAccountConnectionRedirectUrl,
                name,
                webhookUrl,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{capabilities=$capabilities, channelDescription=$channelDescription, channelLogoUrl=$channelLogoUrl, channelAccountConnectionRedirectUrl=$channelAccountConnectionRedirectUrl, name=$name, webhookUrl=$webhookUrl, additionalProperties=$additionalProperties}"
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

        return other is CustomChannelUpdateParams &&
            channelId == other.channelId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(channelId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CustomChannelUpdateParams{channelId=$channelId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
