// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.extensions.calling

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.core.ExcludeMissing
import com.hubspot.core.JsonField
import com.hubspot.core.JsonMissing
import com.hubspot.core.JsonValue
import com.hubspot.core.checkRequired
import com.hubspot.errors.HubSpotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class SettingsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val createdAt: JsonField<OffsetDateTime>,
    private val height: JsonField<Int>,
    private val isReady: JsonField<Boolean>,
    private val name: JsonField<String>,
    private val supportsCustomObjects: JsonField<Boolean>,
    private val supportsInboundCalling: JsonField<Boolean>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val url: JsonField<String>,
    private val usesCallingWindow: JsonField<Boolean>,
    private val usesRemote: JsonField<Boolean>,
    private val width: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("height") @ExcludeMissing height: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("isReady") @ExcludeMissing isReady: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("supportsCustomObjects")
        @ExcludeMissing
        supportsCustomObjects: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("supportsInboundCalling")
        @ExcludeMissing
        supportsInboundCalling: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        @JsonProperty("usesCallingWindow")
        @ExcludeMissing
        usesCallingWindow: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("usesRemote")
        @ExcludeMissing
        usesRemote: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("width") @ExcludeMissing width: JsonField<Int> = JsonMissing.of(),
    ) : this(
        createdAt,
        height,
        isReady,
        name,
        supportsCustomObjects,
        supportsInboundCalling,
        updatedAt,
        url,
        usesCallingWindow,
        usesRemote,
        width,
        mutableMapOf(),
    )

    /**
     * The date and time when the calling extension settings were created.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * The height of the calling extension interface.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun height(): Int = height.getRequired("height")

    /**
     * Specifies whether the calling extension settings are ready for use.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isReady(): Boolean = isReady.getRequired("isReady")

    /**
     * The name of the calling extension.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Indicates if the calling extension supports custom objects.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun supportsCustomObjects(): Boolean =
        supportsCustomObjects.getRequired("supportsCustomObjects")

    /**
     * Indicates if the calling extension supports inbound calling.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun supportsInboundCalling(): Boolean =
        supportsInboundCalling.getRequired("supportsInboundCalling")

    /**
     * The date and time when the calling extension settings were last updated.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

    /**
     * The URL associated with the calling extension.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun url(): String = url.getRequired("url")

    /**
     * Specifies if the calling extension uses a dedicated calling window.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun usesCallingWindow(): Boolean = usesCallingWindow.getRequired("usesCallingWindow")

    /**
     * Indicates if the calling extension uses a remote service.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun usesRemote(): Boolean = usesRemote.getRequired("usesRemote")

    /**
     * The width of the calling extension interface.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun width(): Int = width.getRequired("width")

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

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
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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

        /**
         * Returns a mutable builder for constructing an instance of [SettingsResponse].
         *
         * The following fields are required:
         * ```java
         * .createdAt()
         * .height()
         * .isReady()
         * .name()
         * .supportsCustomObjects()
         * .supportsInboundCalling()
         * .updatedAt()
         * .url()
         * .usesCallingWindow()
         * .usesRemote()
         * .width()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SettingsResponse]. */
    class Builder internal constructor() {

        private var createdAt: JsonField<OffsetDateTime>? = null
        private var height: JsonField<Int>? = null
        private var isReady: JsonField<Boolean>? = null
        private var name: JsonField<String>? = null
        private var supportsCustomObjects: JsonField<Boolean>? = null
        private var supportsInboundCalling: JsonField<Boolean>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var url: JsonField<String>? = null
        private var usesCallingWindow: JsonField<Boolean>? = null
        private var usesRemote: JsonField<Boolean>? = null
        private var width: JsonField<Int>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(settingsResponse: SettingsResponse) = apply {
            createdAt = settingsResponse.createdAt
            height = settingsResponse.height
            isReady = settingsResponse.isReady
            name = settingsResponse.name
            supportsCustomObjects = settingsResponse.supportsCustomObjects
            supportsInboundCalling = settingsResponse.supportsInboundCalling
            updatedAt = settingsResponse.updatedAt
            url = settingsResponse.url
            usesCallingWindow = settingsResponse.usesCallingWindow
            usesRemote = settingsResponse.usesRemote
            width = settingsResponse.width
            additionalProperties = settingsResponse.additionalProperties.toMutableMap()
        }

        /** The date and time when the calling extension settings were created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The height of the calling extension interface. */
        fun height(height: Int) = height(JsonField.of(height))

        /**
         * Sets [Builder.height] to an arbitrary JSON value.
         *
         * You should usually call [Builder.height] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun height(height: JsonField<Int>) = apply { this.height = height }

        /** Specifies whether the calling extension settings are ready for use. */
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

        /** The date and time when the calling extension settings were last updated. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** The URL associated with the calling extension. */
        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

        /** Specifies if the calling extension uses a dedicated calling window. */
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

        /** Indicates if the calling extension uses a remote service. */
        fun usesRemote(usesRemote: Boolean) = usesRemote(JsonField.of(usesRemote))

        /**
         * Sets [Builder.usesRemote] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usesRemote] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun usesRemote(usesRemote: JsonField<Boolean>) = apply { this.usesRemote = usesRemote }

        /** The width of the calling extension interface. */
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
         * Returns an immutable instance of [SettingsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .createdAt()
         * .height()
         * .isReady()
         * .name()
         * .supportsCustomObjects()
         * .supportsInboundCalling()
         * .updatedAt()
         * .url()
         * .usesCallingWindow()
         * .usesRemote()
         * .width()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SettingsResponse =
            SettingsResponse(
                checkRequired("createdAt", createdAt),
                checkRequired("height", height),
                checkRequired("isReady", isReady),
                checkRequired("name", name),
                checkRequired("supportsCustomObjects", supportsCustomObjects),
                checkRequired("supportsInboundCalling", supportsInboundCalling),
                checkRequired("updatedAt", updatedAt),
                checkRequired("url", url),
                checkRequired("usesCallingWindow", usesCallingWindow),
                checkRequired("usesRemote", usesRemote),
                checkRequired("width", width),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SettingsResponse = apply {
        if (validated) {
            return@apply
        }

        createdAt()
        height()
        isReady()
        name()
        supportsCustomObjects()
        supportsInboundCalling()
        updatedAt()
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
        (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (height.asKnown().isPresent) 1 else 0) +
            (if (isReady.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (supportsCustomObjects.asKnown().isPresent) 1 else 0) +
            (if (supportsInboundCalling.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (url.asKnown().isPresent) 1 else 0) +
            (if (usesCallingWindow.asKnown().isPresent) 1 else 0) +
            (if (usesRemote.asKnown().isPresent) 1 else 0) +
            (if (width.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SettingsResponse &&
            createdAt == other.createdAt &&
            height == other.height &&
            isReady == other.isReady &&
            name == other.name &&
            supportsCustomObjects == other.supportsCustomObjects &&
            supportsInboundCalling == other.supportsInboundCalling &&
            updatedAt == other.updatedAt &&
            url == other.url &&
            usesCallingWindow == other.usesCallingWindow &&
            usesRemote == other.usesRemote &&
            width == other.width &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            createdAt,
            height,
            isReady,
            name,
            supportsCustomObjects,
            supportsInboundCalling,
            updatedAt,
            url,
            usesCallingWindow,
            usesRemote,
            width,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SettingsResponse{createdAt=$createdAt, height=$height, isReady=$isReady, name=$name, supportsCustomObjects=$supportsCustomObjects, supportsInboundCalling=$supportsInboundCalling, updatedAt=$updatedAt, url=$url, usesCallingWindow=$usesCallingWindow, usesRemote=$usesRemote, width=$width, additionalProperties=$additionalProperties}"
}
