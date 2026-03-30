// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.timeline

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

class TimelineEventIFrame
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val headerLabel: JsonField<String>,
    private val height: JsonField<Int>,
    private val linkLabel: JsonField<String>,
    private val url: JsonField<String>,
    private val width: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("headerLabel")
        @ExcludeMissing
        headerLabel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("height") @ExcludeMissing height: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("linkLabel") @ExcludeMissing linkLabel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        @JsonProperty("width") @ExcludeMissing width: JsonField<Int> = JsonMissing.of(),
    ) : this(headerLabel, height, linkLabel, url, width, mutableMapOf())

    /**
     * The label of the modal window that displays the iframe contents.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun headerLabel(): String = headerLabel.getRequired("headerLabel")

    /**
     * The height of the modal window in pixels.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun height(): Int = height.getRequired("height")

    /**
     * The text displaying the link that will display the iframe.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun linkLabel(): String = linkLabel.getRequired("linkLabel")

    /**
     * The URI of the iframe contents.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun url(): String = url.getRequired("url")

    /**
     * The width of the modal window in pixels.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun width(): Int = width.getRequired("width")

    /**
     * Returns the raw JSON value of [headerLabel].
     *
     * Unlike [headerLabel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("headerLabel") @ExcludeMissing fun _headerLabel(): JsonField<String> = headerLabel

    /**
     * Returns the raw JSON value of [height].
     *
     * Unlike [height], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("height") @ExcludeMissing fun _height(): JsonField<Int> = height

    /**
     * Returns the raw JSON value of [linkLabel].
     *
     * Unlike [linkLabel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("linkLabel") @ExcludeMissing fun _linkLabel(): JsonField<String> = linkLabel

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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
         * Returns a mutable builder for constructing an instance of [TimelineEventIFrame].
         *
         * The following fields are required:
         * ```java
         * .headerLabel()
         * .height()
         * .linkLabel()
         * .url()
         * .width()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TimelineEventIFrame]. */
    class Builder internal constructor() {

        private var headerLabel: JsonField<String>? = null
        private var height: JsonField<Int>? = null
        private var linkLabel: JsonField<String>? = null
        private var url: JsonField<String>? = null
        private var width: JsonField<Int>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(timelineEventIFrame: TimelineEventIFrame) = apply {
            headerLabel = timelineEventIFrame.headerLabel
            height = timelineEventIFrame.height
            linkLabel = timelineEventIFrame.linkLabel
            url = timelineEventIFrame.url
            width = timelineEventIFrame.width
            additionalProperties = timelineEventIFrame.additionalProperties.toMutableMap()
        }

        /** The label of the modal window that displays the iframe contents. */
        fun headerLabel(headerLabel: String) = headerLabel(JsonField.of(headerLabel))

        /**
         * Sets [Builder.headerLabel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.headerLabel] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun headerLabel(headerLabel: JsonField<String>) = apply { this.headerLabel = headerLabel }

        /** The height of the modal window in pixels. */
        fun height(height: Int) = height(JsonField.of(height))

        /**
         * Sets [Builder.height] to an arbitrary JSON value.
         *
         * You should usually call [Builder.height] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun height(height: JsonField<Int>) = apply { this.height = height }

        /** The text displaying the link that will display the iframe. */
        fun linkLabel(linkLabel: String) = linkLabel(JsonField.of(linkLabel))

        /**
         * Sets [Builder.linkLabel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.linkLabel] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun linkLabel(linkLabel: JsonField<String>) = apply { this.linkLabel = linkLabel }

        /** The URI of the iframe contents. */
        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

        /** The width of the modal window in pixels. */
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
         * Returns an immutable instance of [TimelineEventIFrame].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .headerLabel()
         * .height()
         * .linkLabel()
         * .url()
         * .width()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TimelineEventIFrame =
            TimelineEventIFrame(
                checkRequired("headerLabel", headerLabel),
                checkRequired("height", height),
                checkRequired("linkLabel", linkLabel),
                checkRequired("url", url),
                checkRequired("width", width),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TimelineEventIFrame = apply {
        if (validated) {
            return@apply
        }

        headerLabel()
        height()
        linkLabel()
        url()
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
        (if (headerLabel.asKnown().isPresent) 1 else 0) +
            (if (height.asKnown().isPresent) 1 else 0) +
            (if (linkLabel.asKnown().isPresent) 1 else 0) +
            (if (url.asKnown().isPresent) 1 else 0) +
            (if (width.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TimelineEventIFrame &&
            headerLabel == other.headerLabel &&
            height == other.height &&
            linkLabel == other.linkLabel &&
            url == other.url &&
            width == other.width &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(headerLabel, height, linkLabel, url, width, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TimelineEventIFrame{headerLabel=$headerLabel, height=$height, linkLabel=$linkLabel, url=$url, width=$width, additionalProperties=$additionalProperties}"
}
