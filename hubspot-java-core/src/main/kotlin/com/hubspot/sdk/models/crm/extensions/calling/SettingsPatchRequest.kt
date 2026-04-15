// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.extensions.calling

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class SettingsPatchRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val height: JsonField<Int>,
    private val isReady: JsonField<Boolean>,
    private val name: JsonField<String>,
    private val supportsCustomObjects: JsonField<Boolean>,
    private val supportsInboundCalling: JsonField<Boolean>,
    private val url: JsonField<String>,
    private val usesCallingWindow: JsonField<Boolean>,
    private val usesRemote: JsonField<Boolean>,
    private val width: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("height") @ExcludeMissing height: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("isReady") @ExcludeMissing isReady: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("supportsCustomObjects")
        @ExcludeMissing
        supportsCustomObjects: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("supportsInboundCalling")
        @ExcludeMissing
        supportsInboundCalling: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        @JsonProperty("usesCallingWindow")
        @ExcludeMissing
        usesCallingWindow: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("usesRemote")
        @ExcludeMissing
        usesRemote: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("width") @ExcludeMissing width: JsonField<Int> = JsonMissing.of(),
    ) : this(
        height,
        isReady,
        name,
        supportsCustomObjects,
        supportsInboundCalling,
        url,
        usesCallingWindow,
        usesRemote,
        width,
        mutableMapOf(),
    )

    /**
     * The height setting for the calling extension interface.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun height(): Optional<Int> = height.getOptional("height")

    /**
     * Specifies whether the calling extension is ready for use.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isReady(): Optional<Boolean> = isReady.getOptional("isReady")

    /**
     * The name of the calling extension.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Indicates if the calling extension supports custom objects.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun supportsCustomObjects(): Optional<Boolean> =
        supportsCustomObjects.getOptional("supportsCustomObjects")

    /**
     * Indicates if the calling extension supports inbound calling.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun supportsInboundCalling(): Optional<Boolean> =
        supportsInboundCalling.getOptional("supportsInboundCalling")

    /**
     * The URL associated with the calling extension settings.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun url(): Optional<String> = url.getOptional("url")

    /**
     * Indicates if the calling extension uses a calling window.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun usesCallingWindow(): Optional<Boolean> = usesCallingWindow.getOptional("usesCallingWindow")

    /**
     * Indicates if the calling extension uses a remote connection.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun usesRemote(): Optional<Boolean> = usesRemote.getOptional("usesRemote")

    /**
     * The width setting for the calling extension interface.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun width(): Optional<Int> = width.getOptional("width")

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
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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

        /** Returns a mutable builder for constructing an instance of [SettingsPatchRequest]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SettingsPatchRequest]. */
    class Builder internal constructor() {

        private var height: JsonField<Int> = JsonMissing.of()
        private var isReady: JsonField<Boolean> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var supportsCustomObjects: JsonField<Boolean> = JsonMissing.of()
        private var supportsInboundCalling: JsonField<Boolean> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var usesCallingWindow: JsonField<Boolean> = JsonMissing.of()
        private var usesRemote: JsonField<Boolean> = JsonMissing.of()
        private var width: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(settingsPatchRequest: SettingsPatchRequest) = apply {
            height = settingsPatchRequest.height
            isReady = settingsPatchRequest.isReady
            name = settingsPatchRequest.name
            supportsCustomObjects = settingsPatchRequest.supportsCustomObjects
            supportsInboundCalling = settingsPatchRequest.supportsInboundCalling
            url = settingsPatchRequest.url
            usesCallingWindow = settingsPatchRequest.usesCallingWindow
            usesRemote = settingsPatchRequest.usesRemote
            width = settingsPatchRequest.width
            additionalProperties = settingsPatchRequest.additionalProperties.toMutableMap()
        }

        /** The height setting for the calling extension interface. */
        fun height(height: Int) = height(JsonField.of(height))

        /**
         * Sets [Builder.height] to an arbitrary JSON value.
         *
         * You should usually call [Builder.height] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun height(height: JsonField<Int>) = apply { this.height = height }

        /** Specifies whether the calling extension is ready for use. */
        fun isReady(isReady: Boolean) = isReady(JsonField.of(isReady))

        /**
         * Sets [Builder.isReady] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isReady] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun isReady(isReady: JsonField<Boolean>) = apply { this.isReady = isReady }

        /** The name of the calling extension. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Indicates if the calling extension supports custom objects. */
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

        /** Indicates if the calling extension supports inbound calling. */
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

        /** The URL associated with the calling extension settings. */
        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

        /** Indicates if the calling extension uses a calling window. */
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

        /** Indicates if the calling extension uses a remote connection. */
        fun usesRemote(usesRemote: Boolean) = usesRemote(JsonField.of(usesRemote))

        /**
         * Sets [Builder.usesRemote] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usesRemote] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun usesRemote(usesRemote: JsonField<Boolean>) = apply { this.usesRemote = usesRemote }

        /** The width setting for the calling extension interface. */
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
         * Returns an immutable instance of [SettingsPatchRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SettingsPatchRequest =
            SettingsPatchRequest(
                height,
                isReady,
                name,
                supportsCustomObjects,
                supportsInboundCalling,
                url,
                usesCallingWindow,
                usesRemote,
                width,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SettingsPatchRequest = apply {
        if (validated) {
            return@apply
        }

        height()
        isReady()
        name()
        supportsCustomObjects()
        supportsInboundCalling()
        url()
        usesCallingWindow()
        usesRemote()
        width()
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
        (if (height.asKnown().isPresent) 1 else 0) +
            (if (isReady.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (supportsCustomObjects.asKnown().isPresent) 1 else 0) +
            (if (supportsInboundCalling.asKnown().isPresent) 1 else 0) +
            (if (url.asKnown().isPresent) 1 else 0) +
            (if (usesCallingWindow.asKnown().isPresent) 1 else 0) +
            (if (usesRemote.asKnown().isPresent) 1 else 0) +
            (if (width.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SettingsPatchRequest &&
            height == other.height &&
            isReady == other.isReady &&
            name == other.name &&
            supportsCustomObjects == other.supportsCustomObjects &&
            supportsInboundCalling == other.supportsInboundCalling &&
            url == other.url &&
            usesCallingWindow == other.usesCallingWindow &&
            usesRemote == other.usesRemote &&
            width == other.width &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            height,
            isReady,
            name,
            supportsCustomObjects,
            supportsInboundCalling,
            url,
            usesCallingWindow,
            usesRemote,
            width,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SettingsPatchRequest{height=$height, isReady=$isReady, name=$name, supportsCustomObjects=$supportsCustomObjects, supportsInboundCalling=$supportsInboundCalling, url=$url, usesCallingWindow=$usesCallingWindow, usesRemote=$usesRemote, width=$width, additionalProperties=$additionalProperties}"
}
