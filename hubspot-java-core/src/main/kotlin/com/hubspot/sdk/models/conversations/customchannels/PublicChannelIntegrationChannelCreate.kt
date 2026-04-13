// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.conversations.customchannels

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.toImmutable
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicChannelIntegrationChannelCreate
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
        @JsonProperty("webhookUrl") @ExcludeMissing webhookUrl: JsonField<String> = JsonMissing.of(),
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
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun capabilities(): Capabilities = capabilities.getRequired("capabilities")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun channelAccountConnectionRedirectUrl(): Optional<String> =
        channelAccountConnectionRedirectUrl.getOptional("channelAccountConnectionRedirectUrl")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun channelDescription(): Optional<String> =
        channelDescription.getOptional("channelDescription")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun channelLogoUrl(): Optional<String> = channelLogoUrl.getOptional("channelLogoUrl")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookUrl(): Optional<String> = webhookUrl.getOptional("webhookUrl")

    /**
     * Returns the raw JSON value of [capabilities].
     *
     * Unlike [capabilities], this method doesn't throw if the JSON field has an unexpected type.
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
     * Unlike [channelAccountConnectionRedirectUrl], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    @JsonProperty("channelAccountConnectionRedirectUrl")
    @ExcludeMissing
    fun _channelAccountConnectionRedirectUrl(): JsonField<String> =
        channelAccountConnectionRedirectUrl

    /**
     * Returns the raw JSON value of [channelDescription].
     *
     * Unlike [channelDescription], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("channelDescription")
    @ExcludeMissing
    fun _channelDescription(): JsonField<String> = channelDescription

    /**
     * Returns the raw JSON value of [channelLogoUrl].
     *
     * Unlike [channelLogoUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("channelLogoUrl")
    @ExcludeMissing
    fun _channelLogoUrl(): JsonField<String> = channelLogoUrl

    /**
     * Returns the raw JSON value of [webhookUrl].
     *
     * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("webhookUrl") @ExcludeMissing fun _webhookUrl(): JsonField<String> = webhookUrl

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
         * [PublicChannelIntegrationChannelCreate].
         *
         * The following fields are required:
         * ```java
         * .capabilities()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicChannelIntegrationChannelCreate]. */
    class Builder internal constructor() {

        private var capabilities: JsonField<Capabilities>? = null
        private var name: JsonField<String>? = null
        private var channelAccountConnectionRedirectUrl: JsonField<String> = JsonMissing.of()
        private var channelDescription: JsonField<String> = JsonMissing.of()
        private var channelLogoUrl: JsonField<String> = JsonMissing.of()
        private var webhookUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            publicChannelIntegrationChannelCreate: PublicChannelIntegrationChannelCreate
        ) = apply {
            capabilities = publicChannelIntegrationChannelCreate.capabilities
            name = publicChannelIntegrationChannelCreate.name
            channelAccountConnectionRedirectUrl =
                publicChannelIntegrationChannelCreate.channelAccountConnectionRedirectUrl
            channelDescription = publicChannelIntegrationChannelCreate.channelDescription
            channelLogoUrl = publicChannelIntegrationChannelCreate.channelLogoUrl
            webhookUrl = publicChannelIntegrationChannelCreate.webhookUrl
            additionalProperties =
                publicChannelIntegrationChannelCreate.additionalProperties.toMutableMap()
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
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun channelAccountConnectionRedirectUrl(channelAccountConnectionRedirectUrl: String) =
            channelAccountConnectionRedirectUrl(JsonField.of(channelAccountConnectionRedirectUrl))

        /**
         * Sets [Builder.channelAccountConnectionRedirectUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channelAccountConnectionRedirectUrl] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun channelAccountConnectionRedirectUrl(
            channelAccountConnectionRedirectUrl: JsonField<String>
        ) = apply { this.channelAccountConnectionRedirectUrl = channelAccountConnectionRedirectUrl }

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

        fun channelLogoUrl(channelLogoUrl: String) = channelLogoUrl(JsonField.of(channelLogoUrl))

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
         * You should usually call [Builder.webhookUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * Returns an immutable instance of [PublicChannelIntegrationChannelCreate].
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
        fun build(): PublicChannelIntegrationChannelCreate =
            PublicChannelIntegrationChannelCreate(
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

    fun validate(): PublicChannelIntegrationChannelCreate = apply {
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
        (capabilities.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (channelAccountConnectionRedirectUrl.asKnown().isPresent) 1 else 0) +
            (if (channelDescription.asKnown().isPresent) 1 else 0) +
            (if (channelLogoUrl.asKnown().isPresent) 1 else 0) +
            (if (webhookUrl.asKnown().isPresent) 1 else 0)

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
            } catch (e: HubSpotInvalidDataException) {
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

        return other is PublicChannelIntegrationChannelCreate &&
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
        "PublicChannelIntegrationChannelCreate{capabilities=$capabilities, name=$name, channelAccountConnectionRedirectUrl=$channelAccountConnectionRedirectUrl, channelDescription=$channelDescription, channelLogoUrl=$channelLogoUrl, webhookUrl=$webhookUrl, additionalProperties=$additionalProperties}"
}
