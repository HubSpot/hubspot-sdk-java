// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.calling

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class SettingsRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val name: JsonField<String>,
    private val url: JsonField<String>,
    private val height: JsonField<Int>,
    private val isReady: JsonField<Boolean>,
    private val supportsCustomObjects: JsonField<Boolean>,
    private val supportsInboundCalling: JsonField<Boolean>,
    private val usesCallingWindow: JsonField<Boolean>,
    private val usesRemote: JsonField<Boolean>,
    private val width: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        @JsonProperty("height") @ExcludeMissing height: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("isReady") @ExcludeMissing isReady: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("supportsCustomObjects")
        @ExcludeMissing
        supportsCustomObjects: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("supportsInboundCalling")
        @ExcludeMissing
        supportsInboundCalling: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("usesCallingWindow")
        @ExcludeMissing
        usesCallingWindow: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("usesRemote")
        @ExcludeMissing
        usesRemote: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("width") @ExcludeMissing width: JsonField<Int> = JsonMissing.of(),
    ) : this(
        name,
        url,
        height,
        isReady,
        supportsCustomObjects,
        supportsInboundCalling,
        usesCallingWindow,
        usesRemote,
        width,
        mutableMapOf(),
    )

    /**
     * The name of your calling service to display to users.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * The URL to your phone/calling UI, built with the [Calling SDK](#).
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun url(): String = url.getRequired("url")

    /**
     * The target height of the iframe that will contain your phone/calling UI.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun height(): Optional<Int> = height.getOptional("height")

    /**
     * When true, this indicates that your calling app is ready for production. Users will be able
     * to select your calling app as their provider and can then click to dial within HubSpot.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isReady(): Optional<Boolean> = isReady.getOptional("isReady")

    /**
     * When true, users will be able to click to dial from custom objects.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun supportsCustomObjects(): Optional<Boolean> =
        supportsCustomObjects.getOptional("supportsCustomObjects")

    /**
     * When true, this indicates that your calling app supports inbound calling within HubSpot.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun supportsInboundCalling(): Optional<Boolean> =
        supportsInboundCalling.getOptional("supportsInboundCalling")

    /**
     * When false, this indicates that your calling app does not require the use of the separate
     * calling window to hold the call connection.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun usesCallingWindow(): Optional<Boolean> = usesCallingWindow.getOptional("usesCallingWindow")

    /**
     * When false, this indicates that your calling app does not use the anchored calling remote
     * within the HubSpot app.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun usesRemote(): Optional<Boolean> = usesRemote.getOptional("usesRemote")

    /**
     * The target width of the iframe that will contain your phone/calling UI.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun width(): Optional<Int> = width.getOptional("width")

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

    /**
     * Returns the raw JSON value of [height].
     *
     * Unlike [height], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("height") @ExcludeMissing fun _height(): JsonField<Int> = height

    /**
     * Returns the raw JSON value of [isReady].
     *
     * Unlike [isReady], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isReady") @ExcludeMissing fun _isReady(): JsonField<Boolean> = isReady

    /**
     * Returns the raw JSON value of [supportsCustomObjects].
     *
     * Unlike [supportsCustomObjects], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("supportsCustomObjects")
    @ExcludeMissing
    fun _supportsCustomObjects(): JsonField<Boolean> = supportsCustomObjects

    /**
     * Returns the raw JSON value of [supportsInboundCalling].
     *
     * Unlike [supportsInboundCalling], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("supportsInboundCalling")
    @ExcludeMissing
    fun _supportsInboundCalling(): JsonField<Boolean> = supportsInboundCalling

    /**
     * Returns the raw JSON value of [usesCallingWindow].
     *
     * Unlike [usesCallingWindow], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("usesCallingWindow")
    @ExcludeMissing
    fun _usesCallingWindow(): JsonField<Boolean> = usesCallingWindow

    /**
     * Returns the raw JSON value of [usesRemote].
     *
     * Unlike [usesRemote], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("usesRemote") @ExcludeMissing fun _usesRemote(): JsonField<Boolean> = usesRemote

    /**
     * Returns the raw JSON value of [width].
     *
     * Unlike [width], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("width") @ExcludeMissing fun _width(): JsonField<Int> = width

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
         * Returns a mutable builder for constructing an instance of [SettingsRequest].
         *
         * The following fields are required:
         * ```java
         * .name()
         * .url()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SettingsRequest]. */
    class Builder internal constructor() {

        private var name: JsonField<String>? = null
        private var url: JsonField<String>? = null
        private var height: JsonField<Int> = JsonMissing.of()
        private var isReady: JsonField<Boolean> = JsonMissing.of()
        private var supportsCustomObjects: JsonField<Boolean> = JsonMissing.of()
        private var supportsInboundCalling: JsonField<Boolean> = JsonMissing.of()
        private var usesCallingWindow: JsonField<Boolean> = JsonMissing.of()
        private var usesRemote: JsonField<Boolean> = JsonMissing.of()
        private var width: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(settingsRequest: SettingsRequest) = apply {
            name = settingsRequest.name
            url = settingsRequest.url
            height = settingsRequest.height
            isReady = settingsRequest.isReady
            supportsCustomObjects = settingsRequest.supportsCustomObjects
            supportsInboundCalling = settingsRequest.supportsInboundCalling
            usesCallingWindow = settingsRequest.usesCallingWindow
            usesRemote = settingsRequest.usesRemote
            width = settingsRequest.width
            additionalProperties = settingsRequest.additionalProperties.toMutableMap()
        }

        /** The name of your calling service to display to users. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The URL to your phone/calling UI, built with the [Calling SDK](#). */
        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

        /** The target height of the iframe that will contain your phone/calling UI. */
        fun height(height: Int) = height(JsonField.of(height))

        /**
         * Sets [Builder.height] to an arbitrary JSON value.
         *
         * You should usually call [Builder.height] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun height(height: JsonField<Int>) = apply { this.height = height }

        /**
         * When true, this indicates that your calling app is ready for production. Users will be
         * able to select your calling app as their provider and can then click to dial within
         * HubSpot.
         */
        fun isReady(isReady: Boolean) = isReady(JsonField.of(isReady))

        /**
         * Sets [Builder.isReady] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isReady] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun isReady(isReady: JsonField<Boolean>) = apply { this.isReady = isReady }

        /** When true, users will be able to click to dial from custom objects. */
        fun supportsCustomObjects(supportsCustomObjects: Boolean) =
            supportsCustomObjects(JsonField.of(supportsCustomObjects))

        /**
         * Sets [Builder.supportsCustomObjects] to an arbitrary JSON value.
         *
         * You should usually call [Builder.supportsCustomObjects] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun supportsCustomObjects(supportsCustomObjects: JsonField<Boolean>) = apply {
            this.supportsCustomObjects = supportsCustomObjects
        }

        /**
         * When true, this indicates that your calling app supports inbound calling within HubSpot.
         */
        fun supportsInboundCalling(supportsInboundCalling: Boolean) =
            supportsInboundCalling(JsonField.of(supportsInboundCalling))

        /**
         * Sets [Builder.supportsInboundCalling] to an arbitrary JSON value.
         *
         * You should usually call [Builder.supportsInboundCalling] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun supportsInboundCalling(supportsInboundCalling: JsonField<Boolean>) = apply {
            this.supportsInboundCalling = supportsInboundCalling
        }

        /**
         * When false, this indicates that your calling app does not require the use of the separate
         * calling window to hold the call connection.
         */
        fun usesCallingWindow(usesCallingWindow: Boolean) =
            usesCallingWindow(JsonField.of(usesCallingWindow))

        /**
         * Sets [Builder.usesCallingWindow] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usesCallingWindow] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun usesCallingWindow(usesCallingWindow: JsonField<Boolean>) = apply {
            this.usesCallingWindow = usesCallingWindow
        }

        /**
         * When false, this indicates that your calling app does not use the anchored calling remote
         * within the HubSpot app.
         */
        fun usesRemote(usesRemote: Boolean) = usesRemote(JsonField.of(usesRemote))

        /**
         * Sets [Builder.usesRemote] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usesRemote] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun usesRemote(usesRemote: JsonField<Boolean>) = apply { this.usesRemote = usesRemote }

        /** The target width of the iframe that will contain your phone/calling UI. */
        fun width(width: Int) = width(JsonField.of(width))

        /**
         * Sets [Builder.width] to an arbitrary JSON value.
         *
         * You should usually call [Builder.width] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun width(width: JsonField<Int>) = apply { this.width = width }

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
         * Returns an immutable instance of [SettingsRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .name()
         * .url()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SettingsRequest =
            SettingsRequest(
                checkRequired("name", name),
                checkRequired("url", url),
                height,
                isReady,
                supportsCustomObjects,
                supportsInboundCalling,
                usesCallingWindow,
                usesRemote,
                width,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SettingsRequest = apply {
        if (validated) {
            return@apply
        }

        name()
        url()
        height()
        isReady()
        supportsCustomObjects()
        supportsInboundCalling()
        usesCallingWindow()
        usesRemote()
        width()
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
        (if (name.asKnown().isPresent) 1 else 0) +
            (if (url.asKnown().isPresent) 1 else 0) +
            (if (height.asKnown().isPresent) 1 else 0) +
            (if (isReady.asKnown().isPresent) 1 else 0) +
            (if (supportsCustomObjects.asKnown().isPresent) 1 else 0) +
            (if (supportsInboundCalling.asKnown().isPresent) 1 else 0) +
            (if (usesCallingWindow.asKnown().isPresent) 1 else 0) +
            (if (usesRemote.asKnown().isPresent) 1 else 0) +
            (if (width.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SettingsRequest &&
            name == other.name &&
            url == other.url &&
            height == other.height &&
            isReady == other.isReady &&
            supportsCustomObjects == other.supportsCustomObjects &&
            supportsInboundCalling == other.supportsInboundCalling &&
            usesCallingWindow == other.usesCallingWindow &&
            usesRemote == other.usesRemote &&
            width == other.width &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            name,
            url,
            height,
            isReady,
            supportsCustomObjects,
            supportsInboundCalling,
            usesCallingWindow,
            usesRemote,
            width,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SettingsRequest{name=$name, url=$url, height=$height, isReady=$isReady, supportsCustomObjects=$supportsCustomObjects, supportsInboundCalling=$supportsInboundCalling, usesCallingWindow=$usesCallingWindow, usesRemote=$usesRemote, width=$width, additionalProperties=$additionalProperties}"
}
