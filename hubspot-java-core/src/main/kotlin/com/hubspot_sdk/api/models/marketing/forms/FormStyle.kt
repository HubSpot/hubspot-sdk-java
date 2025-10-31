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
import kotlin.jvm.optionals.getOrNull

/** Styling options for the form */
class FormStyle
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val backgroundWidth: JsonField<String>,
    private val fontFamily: JsonField<String>,
    private val helpTextColor: JsonField<String>,
    private val helpTextSize: JsonField<String>,
    private val labelTextColor: JsonField<String>,
    private val labelTextSize: JsonField<String>,
    private val legalConsentTextColor: JsonField<String>,
    private val legalConsentTextSize: JsonField<String>,
    private val submitAlignment: JsonField<SubmitAlignment>,
    private val submitColor: JsonField<String>,
    private val submitFontColor: JsonField<String>,
    private val submitSize: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("backgroundWidth")
        @ExcludeMissing
        backgroundWidth: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fontFamily")
        @ExcludeMissing
        fontFamily: JsonField<String> = JsonMissing.of(),
        @JsonProperty("helpTextColor")
        @ExcludeMissing
        helpTextColor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("helpTextSize")
        @ExcludeMissing
        helpTextSize: JsonField<String> = JsonMissing.of(),
        @JsonProperty("labelTextColor")
        @ExcludeMissing
        labelTextColor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("labelTextSize")
        @ExcludeMissing
        labelTextSize: JsonField<String> = JsonMissing.of(),
        @JsonProperty("legalConsentTextColor")
        @ExcludeMissing
        legalConsentTextColor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("legalConsentTextSize")
        @ExcludeMissing
        legalConsentTextSize: JsonField<String> = JsonMissing.of(),
        @JsonProperty("submitAlignment")
        @ExcludeMissing
        submitAlignment: JsonField<SubmitAlignment> = JsonMissing.of(),
        @JsonProperty("submitColor")
        @ExcludeMissing
        submitColor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("submitFontColor")
        @ExcludeMissing
        submitFontColor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("submitSize") @ExcludeMissing submitSize: JsonField<String> = JsonMissing.of(),
    ) : this(
        backgroundWidth,
        fontFamily,
        helpTextColor,
        helpTextSize,
        labelTextColor,
        labelTextSize,
        legalConsentTextColor,
        legalConsentTextSize,
        submitAlignment,
        submitColor,
        submitFontColor,
        submitSize,
        mutableMapOf(),
    )

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun backgroundWidth(): String = backgroundWidth.getRequired("backgroundWidth")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fontFamily(): String = fontFamily.getRequired("fontFamily")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun helpTextColor(): String = helpTextColor.getRequired("helpTextColor")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun helpTextSize(): String = helpTextSize.getRequired("helpTextSize")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun labelTextColor(): String = labelTextColor.getRequired("labelTextColor")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun labelTextSize(): String = labelTextSize.getRequired("labelTextSize")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun legalConsentTextColor(): String = legalConsentTextColor.getRequired("legalConsentTextColor")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun legalConsentTextSize(): String = legalConsentTextSize.getRequired("legalConsentTextSize")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun submitAlignment(): SubmitAlignment = submitAlignment.getRequired("submitAlignment")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun submitColor(): String = submitColor.getRequired("submitColor")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun submitFontColor(): String = submitFontColor.getRequired("submitFontColor")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun submitSize(): String = submitSize.getRequired("submitSize")

    /**
     * Returns the raw JSON value of [backgroundWidth].
     *
     * Unlike [backgroundWidth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("backgroundWidth")
    @ExcludeMissing
    fun _backgroundWidth(): JsonField<String> = backgroundWidth

    /**
     * Returns the raw JSON value of [fontFamily].
     *
     * Unlike [fontFamily], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fontFamily") @ExcludeMissing fun _fontFamily(): JsonField<String> = fontFamily

    /**
     * Returns the raw JSON value of [helpTextColor].
     *
     * Unlike [helpTextColor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("helpTextColor")
    @ExcludeMissing
    fun _helpTextColor(): JsonField<String> = helpTextColor

    /**
     * Returns the raw JSON value of [helpTextSize].
     *
     * Unlike [helpTextSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("helpTextSize")
    @ExcludeMissing
    fun _helpTextSize(): JsonField<String> = helpTextSize

    /**
     * Returns the raw JSON value of [labelTextColor].
     *
     * Unlike [labelTextColor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("labelTextColor")
    @ExcludeMissing
    fun _labelTextColor(): JsonField<String> = labelTextColor

    /**
     * Returns the raw JSON value of [labelTextSize].
     *
     * Unlike [labelTextSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("labelTextSize")
    @ExcludeMissing
    fun _labelTextSize(): JsonField<String> = labelTextSize

    /**
     * Returns the raw JSON value of [legalConsentTextColor].
     *
     * Unlike [legalConsentTextColor], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("legalConsentTextColor")
    @ExcludeMissing
    fun _legalConsentTextColor(): JsonField<String> = legalConsentTextColor

    /**
     * Returns the raw JSON value of [legalConsentTextSize].
     *
     * Unlike [legalConsentTextSize], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("legalConsentTextSize")
    @ExcludeMissing
    fun _legalConsentTextSize(): JsonField<String> = legalConsentTextSize

    /**
     * Returns the raw JSON value of [submitAlignment].
     *
     * Unlike [submitAlignment], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("submitAlignment")
    @ExcludeMissing
    fun _submitAlignment(): JsonField<SubmitAlignment> = submitAlignment

    /**
     * Returns the raw JSON value of [submitColor].
     *
     * Unlike [submitColor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("submitColor") @ExcludeMissing fun _submitColor(): JsonField<String> = submitColor

    /**
     * Returns the raw JSON value of [submitFontColor].
     *
     * Unlike [submitFontColor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("submitFontColor")
    @ExcludeMissing
    fun _submitFontColor(): JsonField<String> = submitFontColor

    /**
     * Returns the raw JSON value of [submitSize].
     *
     * Unlike [submitSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("submitSize") @ExcludeMissing fun _submitSize(): JsonField<String> = submitSize

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
         * Returns a mutable builder for constructing an instance of [FormStyle].
         *
         * The following fields are required:
         * ```java
         * .backgroundWidth()
         * .fontFamily()
         * .helpTextColor()
         * .helpTextSize()
         * .labelTextColor()
         * .labelTextSize()
         * .legalConsentTextColor()
         * .legalConsentTextSize()
         * .submitAlignment()
         * .submitColor()
         * .submitFontColor()
         * .submitSize()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FormStyle]. */
    class Builder internal constructor() {

        private var backgroundWidth: JsonField<String>? = null
        private var fontFamily: JsonField<String>? = null
        private var helpTextColor: JsonField<String>? = null
        private var helpTextSize: JsonField<String>? = null
        private var labelTextColor: JsonField<String>? = null
        private var labelTextSize: JsonField<String>? = null
        private var legalConsentTextColor: JsonField<String>? = null
        private var legalConsentTextSize: JsonField<String>? = null
        private var submitAlignment: JsonField<SubmitAlignment>? = null
        private var submitColor: JsonField<String>? = null
        private var submitFontColor: JsonField<String>? = null
        private var submitSize: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(formStyle: FormStyle) = apply {
            backgroundWidth = formStyle.backgroundWidth
            fontFamily = formStyle.fontFamily
            helpTextColor = formStyle.helpTextColor
            helpTextSize = formStyle.helpTextSize
            labelTextColor = formStyle.labelTextColor
            labelTextSize = formStyle.labelTextSize
            legalConsentTextColor = formStyle.legalConsentTextColor
            legalConsentTextSize = formStyle.legalConsentTextSize
            submitAlignment = formStyle.submitAlignment
            submitColor = formStyle.submitColor
            submitFontColor = formStyle.submitFontColor
            submitSize = formStyle.submitSize
            additionalProperties = formStyle.additionalProperties.toMutableMap()
        }

        fun backgroundWidth(backgroundWidth: String) =
            backgroundWidth(JsonField.of(backgroundWidth))

        /**
         * Sets [Builder.backgroundWidth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.backgroundWidth] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun backgroundWidth(backgroundWidth: JsonField<String>) = apply {
            this.backgroundWidth = backgroundWidth
        }

        fun fontFamily(fontFamily: String) = fontFamily(JsonField.of(fontFamily))

        /**
         * Sets [Builder.fontFamily] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fontFamily] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fontFamily(fontFamily: JsonField<String>) = apply { this.fontFamily = fontFamily }

        fun helpTextColor(helpTextColor: String) = helpTextColor(JsonField.of(helpTextColor))

        /**
         * Sets [Builder.helpTextColor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.helpTextColor] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun helpTextColor(helpTextColor: JsonField<String>) = apply {
            this.helpTextColor = helpTextColor
        }

        fun helpTextSize(helpTextSize: String) = helpTextSize(JsonField.of(helpTextSize))

        /**
         * Sets [Builder.helpTextSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.helpTextSize] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun helpTextSize(helpTextSize: JsonField<String>) = apply {
            this.helpTextSize = helpTextSize
        }

        fun labelTextColor(labelTextColor: String) = labelTextColor(JsonField.of(labelTextColor))

        /**
         * Sets [Builder.labelTextColor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.labelTextColor] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun labelTextColor(labelTextColor: JsonField<String>) = apply {
            this.labelTextColor = labelTextColor
        }

        fun labelTextSize(labelTextSize: String) = labelTextSize(JsonField.of(labelTextSize))

        /**
         * Sets [Builder.labelTextSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.labelTextSize] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun labelTextSize(labelTextSize: JsonField<String>) = apply {
            this.labelTextSize = labelTextSize
        }

        fun legalConsentTextColor(legalConsentTextColor: String) =
            legalConsentTextColor(JsonField.of(legalConsentTextColor))

        /**
         * Sets [Builder.legalConsentTextColor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legalConsentTextColor] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun legalConsentTextColor(legalConsentTextColor: JsonField<String>) = apply {
            this.legalConsentTextColor = legalConsentTextColor
        }

        fun legalConsentTextSize(legalConsentTextSize: String) =
            legalConsentTextSize(JsonField.of(legalConsentTextSize))

        /**
         * Sets [Builder.legalConsentTextSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legalConsentTextSize] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun legalConsentTextSize(legalConsentTextSize: JsonField<String>) = apply {
            this.legalConsentTextSize = legalConsentTextSize
        }

        fun submitAlignment(submitAlignment: SubmitAlignment) =
            submitAlignment(JsonField.of(submitAlignment))

        /**
         * Sets [Builder.submitAlignment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.submitAlignment] with a well-typed [SubmitAlignment]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun submitAlignment(submitAlignment: JsonField<SubmitAlignment>) = apply {
            this.submitAlignment = submitAlignment
        }

        fun submitColor(submitColor: String) = submitColor(JsonField.of(submitColor))

        /**
         * Sets [Builder.submitColor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.submitColor] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun submitColor(submitColor: JsonField<String>) = apply { this.submitColor = submitColor }

        fun submitFontColor(submitFontColor: String) =
            submitFontColor(JsonField.of(submitFontColor))

        /**
         * Sets [Builder.submitFontColor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.submitFontColor] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun submitFontColor(submitFontColor: JsonField<String>) = apply {
            this.submitFontColor = submitFontColor
        }

        fun submitSize(submitSize: String) = submitSize(JsonField.of(submitSize))

        /**
         * Sets [Builder.submitSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.submitSize] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun submitSize(submitSize: JsonField<String>) = apply { this.submitSize = submitSize }

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
         * Returns an immutable instance of [FormStyle].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .backgroundWidth()
         * .fontFamily()
         * .helpTextColor()
         * .helpTextSize()
         * .labelTextColor()
         * .labelTextSize()
         * .legalConsentTextColor()
         * .legalConsentTextSize()
         * .submitAlignment()
         * .submitColor()
         * .submitFontColor()
         * .submitSize()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FormStyle =
            FormStyle(
                checkRequired("backgroundWidth", backgroundWidth),
                checkRequired("fontFamily", fontFamily),
                checkRequired("helpTextColor", helpTextColor),
                checkRequired("helpTextSize", helpTextSize),
                checkRequired("labelTextColor", labelTextColor),
                checkRequired("labelTextSize", labelTextSize),
                checkRequired("legalConsentTextColor", legalConsentTextColor),
                checkRequired("legalConsentTextSize", legalConsentTextSize),
                checkRequired("submitAlignment", submitAlignment),
                checkRequired("submitColor", submitColor),
                checkRequired("submitFontColor", submitFontColor),
                checkRequired("submitSize", submitSize),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FormStyle = apply {
        if (validated) {
            return@apply
        }

        backgroundWidth()
        fontFamily()
        helpTextColor()
        helpTextSize()
        labelTextColor()
        labelTextSize()
        legalConsentTextColor()
        legalConsentTextSize()
        submitAlignment().validate()
        submitColor()
        submitFontColor()
        submitSize()
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
        (if (backgroundWidth.asKnown().isPresent) 1 else 0) +
            (if (fontFamily.asKnown().isPresent) 1 else 0) +
            (if (helpTextColor.asKnown().isPresent) 1 else 0) +
            (if (helpTextSize.asKnown().isPresent) 1 else 0) +
            (if (labelTextColor.asKnown().isPresent) 1 else 0) +
            (if (labelTextSize.asKnown().isPresent) 1 else 0) +
            (if (legalConsentTextColor.asKnown().isPresent) 1 else 0) +
            (if (legalConsentTextSize.asKnown().isPresent) 1 else 0) +
            (submitAlignment.asKnown().getOrNull()?.validity() ?: 0) +
            (if (submitColor.asKnown().isPresent) 1 else 0) +
            (if (submitFontColor.asKnown().isPresent) 1 else 0) +
            (if (submitSize.asKnown().isPresent) 1 else 0)

    class SubmitAlignment @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val LEFT = of("left")

            @JvmField val RIGHT = of("right")

            @JvmField val CENTER = of("center")

            @JvmStatic fun of(value: String) = SubmitAlignment(JsonField.of(value))
        }

        /** An enum containing [SubmitAlignment]'s known values. */
        enum class Known {
            LEFT,
            RIGHT,
            CENTER,
        }

        /**
         * An enum containing [SubmitAlignment]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SubmitAlignment] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LEFT,
            RIGHT,
            CENTER,
            /**
             * An enum member indicating that [SubmitAlignment] was instantiated with an unknown
             * value.
             */
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
                LEFT -> Value.LEFT
                RIGHT -> Value.RIGHT
                CENTER -> Value.CENTER
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
                LEFT -> Known.LEFT
                RIGHT -> Known.RIGHT
                CENTER -> Known.CENTER
                else -> throw HubspotInvalidDataException("Unknown SubmitAlignment: $value")
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

        fun validate(): SubmitAlignment = apply {
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

            return other is SubmitAlignment && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FormStyle &&
            backgroundWidth == other.backgroundWidth &&
            fontFamily == other.fontFamily &&
            helpTextColor == other.helpTextColor &&
            helpTextSize == other.helpTextSize &&
            labelTextColor == other.labelTextColor &&
            labelTextSize == other.labelTextSize &&
            legalConsentTextColor == other.legalConsentTextColor &&
            legalConsentTextSize == other.legalConsentTextSize &&
            submitAlignment == other.submitAlignment &&
            submitColor == other.submitColor &&
            submitFontColor == other.submitFontColor &&
            submitSize == other.submitSize &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            backgroundWidth,
            fontFamily,
            helpTextColor,
            helpTextSize,
            labelTextColor,
            labelTextSize,
            legalConsentTextColor,
            legalConsentTextSize,
            submitAlignment,
            submitColor,
            submitFontColor,
            submitSize,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FormStyle{backgroundWidth=$backgroundWidth, fontFamily=$fontFamily, helpTextColor=$helpTextColor, helpTextSize=$helpTextSize, labelTextColor=$labelTextColor, labelTextSize=$labelTextSize, legalConsentTextColor=$legalConsentTextColor, legalConsentTextSize=$legalConsentTextSize, submitAlignment=$submitAlignment, submitColor=$submitColor, submitFontColor=$submitFontColor, submitSize=$submitSize, additionalProperties=$additionalProperties}"
}
