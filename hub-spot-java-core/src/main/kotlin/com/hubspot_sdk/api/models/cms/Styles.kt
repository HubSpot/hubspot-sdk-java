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
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Styles
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val backgroundColor: JsonField<RgbaColor>,
    private val backgroundGradient: JsonField<Gradient>,
    private val backgroundImage: JsonField<BackgroundImage>,
    private val flexboxPositioning: JsonField<String>,
    private val forceFullWidthSection: JsonField<Boolean>,
    private val maxWidthSectionCentering: JsonField<Int>,
    private val verticalAlignment: JsonField<String>,
    private val breakpointStyles: JsonField<BreakpointStyles>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("backgroundColor")
        @ExcludeMissing
        backgroundColor: JsonField<RgbaColor> = JsonMissing.of(),
        @JsonProperty("backgroundGradient")
        @ExcludeMissing
        backgroundGradient: JsonField<Gradient> = JsonMissing.of(),
        @JsonProperty("backgroundImage")
        @ExcludeMissing
        backgroundImage: JsonField<BackgroundImage> = JsonMissing.of(),
        @JsonProperty("flexboxPositioning")
        @ExcludeMissing
        flexboxPositioning: JsonField<String> = JsonMissing.of(),
        @JsonProperty("forceFullWidthSection")
        @ExcludeMissing
        forceFullWidthSection: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("maxWidthSectionCentering")
        @ExcludeMissing
        maxWidthSectionCentering: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("verticalAlignment")
        @ExcludeMissing
        verticalAlignment: JsonField<String> = JsonMissing.of(),
        @JsonProperty("breakpointStyles")
        @ExcludeMissing
        breakpointStyles: JsonField<BreakpointStyles> = JsonMissing.of(),
    ) : this(
        backgroundColor,
        backgroundGradient,
        backgroundImage,
        flexboxPositioning,
        forceFullWidthSection,
        maxWidthSectionCentering,
        verticalAlignment,
        breakpointStyles,
        mutableMapOf(),
    )

    /**
     * A color defined by RGB values.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun backgroundColor(): RgbaColor = backgroundColor.getRequired("backgroundColor")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun backgroundGradient(): Gradient = backgroundGradient.getRequired("backgroundGradient")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun backgroundImage(): BackgroundImage = backgroundImage.getRequired("backgroundImage")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun flexboxPositioning(): String = flexboxPositioning.getRequired("flexboxPositioning")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun forceFullWidthSection(): Boolean =
        forceFullWidthSection.getRequired("forceFullWidthSection")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun maxWidthSectionCentering(): Int =
        maxWidthSectionCentering.getRequired("maxWidthSectionCentering")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun verticalAlignment(): String = verticalAlignment.getRequired("verticalAlignment")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun breakpointStyles(): Optional<BreakpointStyles> =
        breakpointStyles.getOptional("breakpointStyles")

    /**
     * Returns the raw JSON value of [backgroundColor].
     *
     * Unlike [backgroundColor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("backgroundColor")
    @ExcludeMissing
    fun _backgroundColor(): JsonField<RgbaColor> = backgroundColor

    /**
     * Returns the raw JSON value of [backgroundGradient].
     *
     * Unlike [backgroundGradient], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("backgroundGradient")
    @ExcludeMissing
    fun _backgroundGradient(): JsonField<Gradient> = backgroundGradient

    /**
     * Returns the raw JSON value of [backgroundImage].
     *
     * Unlike [backgroundImage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("backgroundImage")
    @ExcludeMissing
    fun _backgroundImage(): JsonField<BackgroundImage> = backgroundImage

    /**
     * Returns the raw JSON value of [flexboxPositioning].
     *
     * Unlike [flexboxPositioning], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("flexboxPositioning")
    @ExcludeMissing
    fun _flexboxPositioning(): JsonField<String> = flexboxPositioning

    /**
     * Returns the raw JSON value of [forceFullWidthSection].
     *
     * Unlike [forceFullWidthSection], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("forceFullWidthSection")
    @ExcludeMissing
    fun _forceFullWidthSection(): JsonField<Boolean> = forceFullWidthSection

    /**
     * Returns the raw JSON value of [maxWidthSectionCentering].
     *
     * Unlike [maxWidthSectionCentering], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("maxWidthSectionCentering")
    @ExcludeMissing
    fun _maxWidthSectionCentering(): JsonField<Int> = maxWidthSectionCentering

    /**
     * Returns the raw JSON value of [verticalAlignment].
     *
     * Unlike [verticalAlignment], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("verticalAlignment")
    @ExcludeMissing
    fun _verticalAlignment(): JsonField<String> = verticalAlignment

    /**
     * Returns the raw JSON value of [breakpointStyles].
     *
     * Unlike [breakpointStyles], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("breakpointStyles")
    @ExcludeMissing
    fun _breakpointStyles(): JsonField<BreakpointStyles> = breakpointStyles

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
         * Returns a mutable builder for constructing an instance of [Styles].
         *
         * The following fields are required:
         * ```java
         * .backgroundColor()
         * .backgroundGradient()
         * .backgroundImage()
         * .flexboxPositioning()
         * .forceFullWidthSection()
         * .maxWidthSectionCentering()
         * .verticalAlignment()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Styles]. */
    class Builder internal constructor() {

        private var backgroundColor: JsonField<RgbaColor>? = null
        private var backgroundGradient: JsonField<Gradient>? = null
        private var backgroundImage: JsonField<BackgroundImage>? = null
        private var flexboxPositioning: JsonField<String>? = null
        private var forceFullWidthSection: JsonField<Boolean>? = null
        private var maxWidthSectionCentering: JsonField<Int>? = null
        private var verticalAlignment: JsonField<String>? = null
        private var breakpointStyles: JsonField<BreakpointStyles> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(styles: Styles) = apply {
            backgroundColor = styles.backgroundColor
            backgroundGradient = styles.backgroundGradient
            backgroundImage = styles.backgroundImage
            flexboxPositioning = styles.flexboxPositioning
            forceFullWidthSection = styles.forceFullWidthSection
            maxWidthSectionCentering = styles.maxWidthSectionCentering
            verticalAlignment = styles.verticalAlignment
            breakpointStyles = styles.breakpointStyles
            additionalProperties = styles.additionalProperties.toMutableMap()
        }

        /** A color defined by RGB values. */
        fun backgroundColor(backgroundColor: RgbaColor) =
            backgroundColor(JsonField.of(backgroundColor))

        /**
         * Sets [Builder.backgroundColor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.backgroundColor] with a well-typed [RgbaColor] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun backgroundColor(backgroundColor: JsonField<RgbaColor>) = apply {
            this.backgroundColor = backgroundColor
        }

        fun backgroundGradient(backgroundGradient: Gradient) =
            backgroundGradient(JsonField.of(backgroundGradient))

        /**
         * Sets [Builder.backgroundGradient] to an arbitrary JSON value.
         *
         * You should usually call [Builder.backgroundGradient] with a well-typed [Gradient] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun backgroundGradient(backgroundGradient: JsonField<Gradient>) = apply {
            this.backgroundGradient = backgroundGradient
        }

        fun backgroundImage(backgroundImage: BackgroundImage) =
            backgroundImage(JsonField.of(backgroundImage))

        /**
         * Sets [Builder.backgroundImage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.backgroundImage] with a well-typed [BackgroundImage]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun backgroundImage(backgroundImage: JsonField<BackgroundImage>) = apply {
            this.backgroundImage = backgroundImage
        }

        fun flexboxPositioning(flexboxPositioning: String) =
            flexboxPositioning(JsonField.of(flexboxPositioning))

        /**
         * Sets [Builder.flexboxPositioning] to an arbitrary JSON value.
         *
         * You should usually call [Builder.flexboxPositioning] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun flexboxPositioning(flexboxPositioning: JsonField<String>) = apply {
            this.flexboxPositioning = flexboxPositioning
        }

        fun forceFullWidthSection(forceFullWidthSection: Boolean) =
            forceFullWidthSection(JsonField.of(forceFullWidthSection))

        /**
         * Sets [Builder.forceFullWidthSection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.forceFullWidthSection] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun forceFullWidthSection(forceFullWidthSection: JsonField<Boolean>) = apply {
            this.forceFullWidthSection = forceFullWidthSection
        }

        fun maxWidthSectionCentering(maxWidthSectionCentering: Int) =
            maxWidthSectionCentering(JsonField.of(maxWidthSectionCentering))

        /**
         * Sets [Builder.maxWidthSectionCentering] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxWidthSectionCentering] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxWidthSectionCentering(maxWidthSectionCentering: JsonField<Int>) = apply {
            this.maxWidthSectionCentering = maxWidthSectionCentering
        }

        fun verticalAlignment(verticalAlignment: String) =
            verticalAlignment(JsonField.of(verticalAlignment))

        /**
         * Sets [Builder.verticalAlignment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verticalAlignment] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun verticalAlignment(verticalAlignment: JsonField<String>) = apply {
            this.verticalAlignment = verticalAlignment
        }

        fun breakpointStyles(breakpointStyles: BreakpointStyles) =
            breakpointStyles(JsonField.of(breakpointStyles))

        /**
         * Sets [Builder.breakpointStyles] to an arbitrary JSON value.
         *
         * You should usually call [Builder.breakpointStyles] with a well-typed [BreakpointStyles]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun breakpointStyles(breakpointStyles: JsonField<BreakpointStyles>) = apply {
            this.breakpointStyles = breakpointStyles
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
         * Returns an immutable instance of [Styles].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .backgroundColor()
         * .backgroundGradient()
         * .backgroundImage()
         * .flexboxPositioning()
         * .forceFullWidthSection()
         * .maxWidthSectionCentering()
         * .verticalAlignment()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Styles =
            Styles(
                checkRequired("backgroundColor", backgroundColor),
                checkRequired("backgroundGradient", backgroundGradient),
                checkRequired("backgroundImage", backgroundImage),
                checkRequired("flexboxPositioning", flexboxPositioning),
                checkRequired("forceFullWidthSection", forceFullWidthSection),
                checkRequired("maxWidthSectionCentering", maxWidthSectionCentering),
                checkRequired("verticalAlignment", verticalAlignment),
                breakpointStyles,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Styles = apply {
        if (validated) {
            return@apply
        }

        backgroundColor().validate()
        backgroundGradient().validate()
        backgroundImage().validate()
        flexboxPositioning()
        forceFullWidthSection()
        maxWidthSectionCentering()
        verticalAlignment()
        breakpointStyles().ifPresent { it.validate() }
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
        (backgroundColor.asKnown().getOrNull()?.validity() ?: 0) +
            (backgroundGradient.asKnown().getOrNull()?.validity() ?: 0) +
            (backgroundImage.asKnown().getOrNull()?.validity() ?: 0) +
            (if (flexboxPositioning.asKnown().isPresent) 1 else 0) +
            (if (forceFullWidthSection.asKnown().isPresent) 1 else 0) +
            (if (maxWidthSectionCentering.asKnown().isPresent) 1 else 0) +
            (if (verticalAlignment.asKnown().isPresent) 1 else 0) +
            (breakpointStyles.asKnown().getOrNull()?.validity() ?: 0)

    class BreakpointStyles
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

            /** Returns a mutable builder for constructing an instance of [BreakpointStyles]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [BreakpointStyles]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(breakpointStyles: BreakpointStyles) = apply {
                additionalProperties = breakpointStyles.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [BreakpointStyles].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): BreakpointStyles = BreakpointStyles(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): BreakpointStyles = apply {
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

            return other is BreakpointStyles && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "BreakpointStyles{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Styles &&
            backgroundColor == other.backgroundColor &&
            backgroundGradient == other.backgroundGradient &&
            backgroundImage == other.backgroundImage &&
            flexboxPositioning == other.flexboxPositioning &&
            forceFullWidthSection == other.forceFullWidthSection &&
            maxWidthSectionCentering == other.maxWidthSectionCentering &&
            verticalAlignment == other.verticalAlignment &&
            breakpointStyles == other.breakpointStyles &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            backgroundColor,
            backgroundGradient,
            backgroundImage,
            flexboxPositioning,
            forceFullWidthSection,
            maxWidthSectionCentering,
            verticalAlignment,
            breakpointStyles,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Styles{backgroundColor=$backgroundColor, backgroundGradient=$backgroundGradient, backgroundImage=$backgroundImage, flexboxPositioning=$flexboxPositioning, forceFullWidthSection=$forceFullWidthSection, maxWidthSectionCentering=$maxWidthSectionCentering, verticalAlignment=$verticalAlignment, breakpointStyles=$breakpointStyles, additionalProperties=$additionalProperties}"
}
