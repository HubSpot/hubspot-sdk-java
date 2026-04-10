// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects

class BackgroundImage
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val backgroundPosition: JsonField<String>,
    private val backgroundSize: JsonField<String>,
    private val imageUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("backgroundPosition")
        @ExcludeMissing
        backgroundPosition: JsonField<String> = JsonMissing.of(),
        @JsonProperty("backgroundSize")
        @ExcludeMissing
        backgroundSize: JsonField<String> = JsonMissing.of(),
        @JsonProperty("imageUrl") @ExcludeMissing imageUrl: JsonField<String> = JsonMissing.of(),
    ) : this(backgroundPosition, backgroundSize, imageUrl, mutableMapOf())

    /**
     * Defines the position of the background image.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun backgroundPosition(): String = backgroundPosition.getRequired("backgroundPosition")

    /**
     * Specifies the size of the background image.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun backgroundSize(): String = backgroundSize.getRequired("backgroundSize")

    /**
     * The URL of the background image.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun imageUrl(): String = imageUrl.getRequired("imageUrl")

    /**
     * Returns the raw JSON value of [backgroundPosition].
     *
     * Unlike [backgroundPosition], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("backgroundPosition")
    @ExcludeMissing
    fun _backgroundPosition(): JsonField<String> = backgroundPosition

    /**
     * Returns the raw JSON value of [backgroundSize].
     *
     * Unlike [backgroundSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("backgroundSize")
    @ExcludeMissing
    fun _backgroundSize(): JsonField<String> = backgroundSize

    /**
     * Returns the raw JSON value of [imageUrl].
     *
     * Unlike [imageUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("imageUrl") @ExcludeMissing fun _imageUrl(): JsonField<String> = imageUrl

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
         * Returns a mutable builder for constructing an instance of [BackgroundImage].
         *
         * The following fields are required:
         * ```java
         * .backgroundPosition()
         * .backgroundSize()
         * .imageUrl()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BackgroundImage]. */
    class Builder internal constructor() {

        private var backgroundPosition: JsonField<String>? = null
        private var backgroundSize: JsonField<String>? = null
        private var imageUrl: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(backgroundImage: BackgroundImage) = apply {
            backgroundPosition = backgroundImage.backgroundPosition
            backgroundSize = backgroundImage.backgroundSize
            imageUrl = backgroundImage.imageUrl
            additionalProperties = backgroundImage.additionalProperties.toMutableMap()
        }

        /** Defines the position of the background image. */
        fun backgroundPosition(backgroundPosition: String) =
            backgroundPosition(JsonField.of(backgroundPosition))

        /**
         * Sets [Builder.backgroundPosition] to an arbitrary JSON value.
         *
         * You should usually call [Builder.backgroundPosition] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun backgroundPosition(backgroundPosition: JsonField<String>) = apply {
            this.backgroundPosition = backgroundPosition
        }

        /** Specifies the size of the background image. */
        fun backgroundSize(backgroundSize: String) = backgroundSize(JsonField.of(backgroundSize))

        /**
         * Sets [Builder.backgroundSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.backgroundSize] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun backgroundSize(backgroundSize: JsonField<String>) = apply {
            this.backgroundSize = backgroundSize
        }

        /** The URL of the background image. */
        fun imageUrl(imageUrl: String) = imageUrl(JsonField.of(imageUrl))

        /**
         * Sets [Builder.imageUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.imageUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun imageUrl(imageUrl: JsonField<String>) = apply { this.imageUrl = imageUrl }

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
         * Returns an immutable instance of [BackgroundImage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .backgroundPosition()
         * .backgroundSize()
         * .imageUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BackgroundImage =
            BackgroundImage(
                checkRequired("backgroundPosition", backgroundPosition),
                checkRequired("backgroundSize", backgroundSize),
                checkRequired("imageUrl", imageUrl),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BackgroundImage = apply {
        if (validated) {
            return@apply
        }

        backgroundPosition()
        backgroundSize()
        imageUrl()
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
        (if (backgroundPosition.asKnown().isPresent) 1 else 0) +
            (if (backgroundSize.asKnown().isPresent) 1 else 0) +
            (if (imageUrl.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BackgroundImage &&
            backgroundPosition == other.backgroundPosition &&
            backgroundSize == other.backgroundSize &&
            imageUrl == other.imageUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(backgroundPosition, backgroundSize, imageUrl, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BackgroundImage{backgroundPosition=$backgroundPosition, backgroundSize=$backgroundSize, imageUrl=$imageUrl, additionalProperties=$additionalProperties}"
}
