// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.forms

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.Enum
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Options for styling the form. */
class FormDisplayOptions
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val renderRawHtml: JsonField<Boolean>,
    private val style: JsonField<FormStyle>,
    private val submitButtonText: JsonField<String>,
    private val theme: JsonField<Theme>,
    private val cssClass: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("renderRawHtml")
        @ExcludeMissing
        renderRawHtml: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("style") @ExcludeMissing style: JsonField<FormStyle> = JsonMissing.of(),
        @JsonProperty("submitButtonText")
        @ExcludeMissing
        submitButtonText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("theme") @ExcludeMissing theme: JsonField<Theme> = JsonMissing.of(),
        @JsonProperty("cssClass") @ExcludeMissing cssClass: JsonField<String> = JsonMissing.of(),
    ) : this(renderRawHtml, style, submitButtonText, theme, cssClass, mutableMapOf())

    /**
     * Whether the form will render as raw HTML as opposed to inside an iFrame.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun renderRawHtml(): Boolean = renderRawHtml.getRequired("renderRawHtml")

    /**
     * Styling options for the form
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun style(): FormStyle = style.getRequired("style")

    /**
     * The text displayed on the form submit button.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun submitButtonText(): String = submitButtonText.getRequired("submitButtonText")

    /**
     * The theme used for styling the input fields. This will not apply if the form is added to a
     * HubSpot CMS page.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun theme(): Theme = theme.getRequired("theme")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cssClass(): Optional<String> = cssClass.getOptional("cssClass")

    /**
     * Returns the raw JSON value of [renderRawHtml].
     *
     * Unlike [renderRawHtml], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("renderRawHtml")
    @ExcludeMissing
    fun _renderRawHtml(): JsonField<Boolean> = renderRawHtml

    /**
     * Returns the raw JSON value of [style].
     *
     * Unlike [style], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("style") @ExcludeMissing fun _style(): JsonField<FormStyle> = style

    /**
     * Returns the raw JSON value of [submitButtonText].
     *
     * Unlike [submitButtonText], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("submitButtonText")
    @ExcludeMissing
    fun _submitButtonText(): JsonField<String> = submitButtonText

    /**
     * Returns the raw JSON value of [theme].
     *
     * Unlike [theme], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("theme") @ExcludeMissing fun _theme(): JsonField<Theme> = theme

    /**
     * Returns the raw JSON value of [cssClass].
     *
     * Unlike [cssClass], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cssClass") @ExcludeMissing fun _cssClass(): JsonField<String> = cssClass

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
         * Returns a mutable builder for constructing an instance of [FormDisplayOptions].
         *
         * The following fields are required:
         * ```java
         * .renderRawHtml()
         * .style()
         * .submitButtonText()
         * .theme()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FormDisplayOptions]. */
    class Builder internal constructor() {

        private var renderRawHtml: JsonField<Boolean>? = null
        private var style: JsonField<FormStyle>? = null
        private var submitButtonText: JsonField<String>? = null
        private var theme: JsonField<Theme>? = null
        private var cssClass: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(formDisplayOptions: FormDisplayOptions) = apply {
            renderRawHtml = formDisplayOptions.renderRawHtml
            style = formDisplayOptions.style
            submitButtonText = formDisplayOptions.submitButtonText
            theme = formDisplayOptions.theme
            cssClass = formDisplayOptions.cssClass
            additionalProperties = formDisplayOptions.additionalProperties.toMutableMap()
        }

        /** Whether the form will render as raw HTML as opposed to inside an iFrame. */
        fun renderRawHtml(renderRawHtml: Boolean) = renderRawHtml(JsonField.of(renderRawHtml))

        /**
         * Sets [Builder.renderRawHtml] to an arbitrary JSON value.
         *
         * You should usually call [Builder.renderRawHtml] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun renderRawHtml(renderRawHtml: JsonField<Boolean>) = apply {
            this.renderRawHtml = renderRawHtml
        }

        /** Styling options for the form */
        fun style(style: FormStyle) = style(JsonField.of(style))

        /**
         * Sets [Builder.style] to an arbitrary JSON value.
         *
         * You should usually call [Builder.style] with a well-typed [FormStyle] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun style(style: JsonField<FormStyle>) = apply { this.style = style }

        /** The text displayed on the form submit button. */
        fun submitButtonText(submitButtonText: String) =
            submitButtonText(JsonField.of(submitButtonText))

        /**
         * Sets [Builder.submitButtonText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.submitButtonText] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun submitButtonText(submitButtonText: JsonField<String>) = apply {
            this.submitButtonText = submitButtonText
        }

        /**
         * The theme used for styling the input fields. This will not apply if the form is added to
         * a HubSpot CMS page.
         */
        fun theme(theme: Theme) = theme(JsonField.of(theme))

        /**
         * Sets [Builder.theme] to an arbitrary JSON value.
         *
         * You should usually call [Builder.theme] with a well-typed [Theme] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun theme(theme: JsonField<Theme>) = apply { this.theme = theme }

        fun cssClass(cssClass: String) = cssClass(JsonField.of(cssClass))

        /**
         * Sets [Builder.cssClass] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cssClass] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cssClass(cssClass: JsonField<String>) = apply { this.cssClass = cssClass }

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
         * Returns an immutable instance of [FormDisplayOptions].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .renderRawHtml()
         * .style()
         * .submitButtonText()
         * .theme()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FormDisplayOptions =
            FormDisplayOptions(
                checkRequired("renderRawHtml", renderRawHtml),
                checkRequired("style", style),
                checkRequired("submitButtonText", submitButtonText),
                checkRequired("theme", theme),
                cssClass,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FormDisplayOptions = apply {
        if (validated) {
            return@apply
        }

        renderRawHtml()
        style().validate()
        submitButtonText()
        theme().validate()
        cssClass()
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
        (if (renderRawHtml.asKnown().isPresent) 1 else 0) +
            (style.asKnown().getOrNull()?.validity() ?: 0) +
            (if (submitButtonText.asKnown().isPresent) 1 else 0) +
            (theme.asKnown().getOrNull()?.validity() ?: 0) +
            (if (cssClass.asKnown().isPresent) 1 else 0)

    /**
     * The theme used for styling the input fields. This will not apply if the form is added to a
     * HubSpot CMS page.
     */
    class Theme @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val CANVAS = of("canvas")

            @JvmField val DEFAULT_STYLE = of("default_style")

            @JvmField val LEGACY = of("legacy")

            @JvmField val LINEAR = of("linear")

            @JvmField val ROUND = of("round")

            @JvmField val SHARP = of("sharp")

            @JvmStatic fun of(value: String) = Theme(JsonField.of(value))
        }

        /** An enum containing [Theme]'s known values. */
        enum class Known {
            CANVAS,
            DEFAULT_STYLE,
            LEGACY,
            LINEAR,
            ROUND,
            SHARP,
        }

        /**
         * An enum containing [Theme]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Theme] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CANVAS,
            DEFAULT_STYLE,
            LEGACY,
            LINEAR,
            ROUND,
            SHARP,
            /** An enum member indicating that [Theme] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                CANVAS -> Value.CANVAS
                DEFAULT_STYLE -> Value.DEFAULT_STYLE
                LEGACY -> Value.LEGACY
                LINEAR -> Value.LINEAR
                ROUND -> Value.ROUND
                SHARP -> Value.SHARP
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HubspotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                CANVAS -> Known.CANVAS
                DEFAULT_STYLE -> Known.DEFAULT_STYLE
                LEGACY -> Known.LEGACY
                LINEAR -> Known.LINEAR
                ROUND -> Known.ROUND
                SHARP -> Known.SHARP
                else -> throw HubspotInvalidDataException("Unknown Theme: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HubspotInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { HubspotInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): Theme = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Theme && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FormDisplayOptions &&
            renderRawHtml == other.renderRawHtml &&
            style == other.style &&
            submitButtonText == other.submitButtonText &&
            theme == other.theme &&
            cssClass == other.cssClass &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(renderRawHtml, style, submitButtonText, theme, cssClass, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FormDisplayOptions{renderRawHtml=$renderRawHtml, style=$style, submitButtonText=$submitButtonText, theme=$theme, cssClass=$cssClass, additionalProperties=$additionalProperties}"
}
