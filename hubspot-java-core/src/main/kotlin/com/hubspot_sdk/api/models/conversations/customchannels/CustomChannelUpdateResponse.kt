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
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CustomChannelUpdateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val capabilities: JsonField<Capabilities>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val name: JsonField<String>,
    private val channelAccountConnectionRedirectUrl: JsonField<String>,
    private val channelDescription: JsonField<String>,
    private val channelLogoUrl: JsonField<String>,
    private val webhookUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("capabilities")
        @ExcludeMissing
        capabilities: JsonField<Capabilities> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
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
        id,
        capabilities,
        createdAt,
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
    fun id(): String = id.getRequired("id")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun capabilities(): Capabilities = capabilities.getRequired("capabilities")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

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
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [capabilities].
     *
     * Unlike [capabilities], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("capabilities")
    @ExcludeMissing
    fun _capabilities(): JsonField<Capabilities> = capabilities

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

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
         * Returns a mutable builder for constructing an instance of [CustomChannelUpdateResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .capabilities()
         * .createdAt()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomChannelUpdateResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var capabilities: JsonField<Capabilities>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var name: JsonField<String>? = null
        private var channelAccountConnectionRedirectUrl: JsonField<String> = JsonMissing.of()
        private var channelDescription: JsonField<String> = JsonMissing.of()
        private var channelLogoUrl: JsonField<String> = JsonMissing.of()
        private var webhookUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customChannelUpdateResponse: CustomChannelUpdateResponse) = apply {
            id = customChannelUpdateResponse.id
            capabilities = customChannelUpdateResponse.capabilities
            createdAt = customChannelUpdateResponse.createdAt
            name = customChannelUpdateResponse.name
            channelAccountConnectionRedirectUrl =
                customChannelUpdateResponse.channelAccountConnectionRedirectUrl
            channelDescription = customChannelUpdateResponse.channelDescription
            channelLogoUrl = customChannelUpdateResponse.channelLogoUrl
            webhookUrl = customChannelUpdateResponse.webhookUrl
            additionalProperties = customChannelUpdateResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

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

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

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
         * Returns an immutable instance of [CustomChannelUpdateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .capabilities()
         * .createdAt()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomChannelUpdateResponse =
            CustomChannelUpdateResponse(
                checkRequired("id", id),
                checkRequired("capabilities", capabilities),
                checkRequired("createdAt", createdAt),
                checkRequired("name", name),
                channelAccountConnectionRedirectUrl,
                channelDescription,
                channelLogoUrl,
                webhookUrl,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CustomChannelUpdateResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        capabilities().validate()
        createdAt()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (capabilities.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
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

        return other is CustomChannelUpdateResponse &&
            id == other.id &&
            capabilities == other.capabilities &&
            createdAt == other.createdAt &&
            name == other.name &&
            channelAccountConnectionRedirectUrl == other.channelAccountConnectionRedirectUrl &&
            channelDescription == other.channelDescription &&
            channelLogoUrl == other.channelLogoUrl &&
            webhookUrl == other.webhookUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            capabilities,
            createdAt,
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
        "CustomChannelUpdateResponse{id=$id, capabilities=$capabilities, createdAt=$createdAt, name=$name, channelAccountConnectionRedirectUrl=$channelAccountConnectionRedirectUrl, channelDescription=$channelDescription, channelLogoUrl=$channelLogoUrl, webhookUrl=$webhookUrl, additionalProperties=$additionalProperties}"
}
