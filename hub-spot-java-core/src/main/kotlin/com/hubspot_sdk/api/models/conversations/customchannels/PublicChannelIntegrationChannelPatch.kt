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
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class PublicChannelIntegrationChannelPatch
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
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
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
     * Unlike [capabilities], this method doesn't throw if the JSON field has an unexpected type.
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
         * Returns a mutable builder for constructing an instance of
         * [PublicChannelIntegrationChannelPatch].
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

    /** A builder for [PublicChannelIntegrationChannelPatch]. */
    class Builder internal constructor() {

        private var capabilities: JsonField<Capabilities>? = null
        private var channelDescription: JsonValue? = null
        private var channelLogoUrl: JsonValue? = null
        private var channelAccountConnectionRedirectUrl: JsonValue = JsonMissing.of()
        private var name: JsonValue = JsonMissing.of()
        private var webhookUrl: JsonValue = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            publicChannelIntegrationChannelPatch: PublicChannelIntegrationChannelPatch
        ) = apply {
            capabilities = publicChannelIntegrationChannelPatch.capabilities
            channelDescription = publicChannelIntegrationChannelPatch.channelDescription
            channelLogoUrl = publicChannelIntegrationChannelPatch.channelLogoUrl
            channelAccountConnectionRedirectUrl =
                publicChannelIntegrationChannelPatch.channelAccountConnectionRedirectUrl
            name = publicChannelIntegrationChannelPatch.name
            webhookUrl = publicChannelIntegrationChannelPatch.webhookUrl
            additionalProperties =
                publicChannelIntegrationChannelPatch.additionalProperties.toMutableMap()
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

        fun channelAccountConnectionRedirectUrl(channelAccountConnectionRedirectUrl: JsonValue) =
            apply {
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
         * Returns an immutable instance of [PublicChannelIntegrationChannelPatch].
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
        fun build(): PublicChannelIntegrationChannelPatch =
            PublicChannelIntegrationChannelPatch(
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

    fun validate(): PublicChannelIntegrationChannelPatch = apply {
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
        } catch (e: HubSpotInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int = (capabilities.asKnown().getOrNull()?.validity() ?: 0)

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

        return other is PublicChannelIntegrationChannelPatch &&
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
        "PublicChannelIntegrationChannelPatch{capabilities=$capabilities, channelDescription=$channelDescription, channelLogoUrl=$channelLogoUrl, channelAccountConnectionRedirectUrl=$channelAccountConnectionRedirectUrl, name=$name, webhookUrl=$webhookUrl, additionalProperties=$additionalProperties}"
}
