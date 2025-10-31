// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.emails

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicEmailStyleSettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val backgroundColor: JsonField<String>,
    private val backgroundImage: JsonField<String>,
    private val backgroundImageType: JsonField<String>,
    private val bodyBorderColor: JsonField<String>,
    private val bodyBorderColorChoice: JsonField<String>,
    private val bodyBorderWidth: JsonField<Double>,
    private val bodyColor: JsonField<String>,
    private val buttonStyleSettings: JsonField<PublicButtonStyleSettings>,
    private val colorPickerFavorite1: JsonField<String>,
    private val colorPickerFavorite2: JsonField<String>,
    private val colorPickerFavorite3: JsonField<String>,
    private val colorPickerFavorite4: JsonField<String>,
    private val colorPickerFavorite5: JsonField<String>,
    private val colorPickerFavorite6: JsonField<String>,
    private val dividerStyleSettings: JsonField<PublicDividerStyleSettings>,
    private val emailBodyPadding: JsonField<String>,
    private val emailBodyWidth: JsonField<String>,
    private val headingOneFont: JsonField<PublicFontStyle>,
    private val headingTwoFont: JsonField<PublicFontStyle>,
    private val linksFont: JsonField<PublicFontStyle>,
    private val primaryAccentColor: JsonField<String>,
    private val primaryFont: JsonField<String>,
    private val primaryFontColor: JsonField<String>,
    private val primaryFontLineHeight: JsonField<String>,
    private val primaryFontSize: JsonField<Double>,
    private val secondaryAccentColor: JsonField<String>,
    private val secondaryFont: JsonField<String>,
    private val secondaryFontColor: JsonField<String>,
    private val secondaryFontLineHeight: JsonField<String>,
    private val secondaryFontSize: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("backgroundColor")
        @ExcludeMissing
        backgroundColor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("backgroundImage")
        @ExcludeMissing
        backgroundImage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("backgroundImageType")
        @ExcludeMissing
        backgroundImageType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("bodyBorderColor")
        @ExcludeMissing
        bodyBorderColor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("bodyBorderColorChoice")
        @ExcludeMissing
        bodyBorderColorChoice: JsonField<String> = JsonMissing.of(),
        @JsonProperty("bodyBorderWidth")
        @ExcludeMissing
        bodyBorderWidth: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("bodyColor") @ExcludeMissing bodyColor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("buttonStyleSettings")
        @ExcludeMissing
        buttonStyleSettings: JsonField<PublicButtonStyleSettings> = JsonMissing.of(),
        @JsonProperty("colorPickerFavorite1")
        @ExcludeMissing
        colorPickerFavorite1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("colorPickerFavorite2")
        @ExcludeMissing
        colorPickerFavorite2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("colorPickerFavorite3")
        @ExcludeMissing
        colorPickerFavorite3: JsonField<String> = JsonMissing.of(),
        @JsonProperty("colorPickerFavorite4")
        @ExcludeMissing
        colorPickerFavorite4: JsonField<String> = JsonMissing.of(),
        @JsonProperty("colorPickerFavorite5")
        @ExcludeMissing
        colorPickerFavorite5: JsonField<String> = JsonMissing.of(),
        @JsonProperty("colorPickerFavorite6")
        @ExcludeMissing
        colorPickerFavorite6: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dividerStyleSettings")
        @ExcludeMissing
        dividerStyleSettings: JsonField<PublicDividerStyleSettings> = JsonMissing.of(),
        @JsonProperty("emailBodyPadding")
        @ExcludeMissing
        emailBodyPadding: JsonField<String> = JsonMissing.of(),
        @JsonProperty("emailBodyWidth")
        @ExcludeMissing
        emailBodyWidth: JsonField<String> = JsonMissing.of(),
        @JsonProperty("headingOneFont")
        @ExcludeMissing
        headingOneFont: JsonField<PublicFontStyle> = JsonMissing.of(),
        @JsonProperty("headingTwoFont")
        @ExcludeMissing
        headingTwoFont: JsonField<PublicFontStyle> = JsonMissing.of(),
        @JsonProperty("linksFont")
        @ExcludeMissing
        linksFont: JsonField<PublicFontStyle> = JsonMissing.of(),
        @JsonProperty("primaryAccentColor")
        @ExcludeMissing
        primaryAccentColor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("primaryFont")
        @ExcludeMissing
        primaryFont: JsonField<String> = JsonMissing.of(),
        @JsonProperty("primaryFontColor")
        @ExcludeMissing
        primaryFontColor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("primaryFontLineHeight")
        @ExcludeMissing
        primaryFontLineHeight: JsonField<String> = JsonMissing.of(),
        @JsonProperty("primaryFontSize")
        @ExcludeMissing
        primaryFontSize: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("secondaryAccentColor")
        @ExcludeMissing
        secondaryAccentColor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("secondaryFont")
        @ExcludeMissing
        secondaryFont: JsonField<String> = JsonMissing.of(),
        @JsonProperty("secondaryFontColor")
        @ExcludeMissing
        secondaryFontColor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("secondaryFontLineHeight")
        @ExcludeMissing
        secondaryFontLineHeight: JsonField<String> = JsonMissing.of(),
        @JsonProperty("secondaryFontSize")
        @ExcludeMissing
        secondaryFontSize: JsonField<Double> = JsonMissing.of(),
    ) : this(
        backgroundColor,
        backgroundImage,
        backgroundImageType,
        bodyBorderColor,
        bodyBorderColorChoice,
        bodyBorderWidth,
        bodyColor,
        buttonStyleSettings,
        colorPickerFavorite1,
        colorPickerFavorite2,
        colorPickerFavorite3,
        colorPickerFavorite4,
        colorPickerFavorite5,
        colorPickerFavorite6,
        dividerStyleSettings,
        emailBodyPadding,
        emailBodyWidth,
        headingOneFont,
        headingTwoFont,
        linksFont,
        primaryAccentColor,
        primaryFont,
        primaryFontColor,
        primaryFontLineHeight,
        primaryFontSize,
        secondaryAccentColor,
        secondaryFont,
        secondaryFontColor,
        secondaryFontLineHeight,
        secondaryFontSize,
        mutableMapOf(),
    )

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun backgroundColor(): Optional<String> = backgroundColor.getOptional("backgroundColor")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun backgroundImage(): Optional<String> = backgroundImage.getOptional("backgroundImage")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun backgroundImageType(): Optional<String> =
        backgroundImageType.getOptional("backgroundImageType")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bodyBorderColor(): Optional<String> = bodyBorderColor.getOptional("bodyBorderColor")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bodyBorderColorChoice(): Optional<String> =
        bodyBorderColorChoice.getOptional("bodyBorderColorChoice")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bodyBorderWidth(): Optional<Double> = bodyBorderWidth.getOptional("bodyBorderWidth")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bodyColor(): Optional<String> = bodyColor.getOptional("bodyColor")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun buttonStyleSettings(): Optional<PublicButtonStyleSettings> =
        buttonStyleSettings.getOptional("buttonStyleSettings")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun colorPickerFavorite1(): Optional<String> =
        colorPickerFavorite1.getOptional("colorPickerFavorite1")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun colorPickerFavorite2(): Optional<String> =
        colorPickerFavorite2.getOptional("colorPickerFavorite2")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun colorPickerFavorite3(): Optional<String> =
        colorPickerFavorite3.getOptional("colorPickerFavorite3")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun colorPickerFavorite4(): Optional<String> =
        colorPickerFavorite4.getOptional("colorPickerFavorite4")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun colorPickerFavorite5(): Optional<String> =
        colorPickerFavorite5.getOptional("colorPickerFavorite5")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun colorPickerFavorite6(): Optional<String> =
        colorPickerFavorite6.getOptional("colorPickerFavorite6")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dividerStyleSettings(): Optional<PublicDividerStyleSettings> =
        dividerStyleSettings.getOptional("dividerStyleSettings")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun emailBodyPadding(): Optional<String> = emailBodyPadding.getOptional("emailBodyPadding")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun emailBodyWidth(): Optional<String> = emailBodyWidth.getOptional("emailBodyWidth")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun headingOneFont(): Optional<PublicFontStyle> = headingOneFont.getOptional("headingOneFont")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun headingTwoFont(): Optional<PublicFontStyle> = headingTwoFont.getOptional("headingTwoFont")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun linksFont(): Optional<PublicFontStyle> = linksFont.getOptional("linksFont")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryAccentColor(): Optional<String> =
        primaryAccentColor.getOptional("primaryAccentColor")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryFont(): Optional<String> = primaryFont.getOptional("primaryFont")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryFontColor(): Optional<String> = primaryFontColor.getOptional("primaryFontColor")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryFontLineHeight(): Optional<String> =
        primaryFontLineHeight.getOptional("primaryFontLineHeight")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryFontSize(): Optional<Double> = primaryFontSize.getOptional("primaryFontSize")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun secondaryAccentColor(): Optional<String> =
        secondaryAccentColor.getOptional("secondaryAccentColor")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun secondaryFont(): Optional<String> = secondaryFont.getOptional("secondaryFont")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun secondaryFontColor(): Optional<String> =
        secondaryFontColor.getOptional("secondaryFontColor")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun secondaryFontLineHeight(): Optional<String> =
        secondaryFontLineHeight.getOptional("secondaryFontLineHeight")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun secondaryFontSize(): Optional<Double> = secondaryFontSize.getOptional("secondaryFontSize")

    /**
     * Returns the raw JSON value of [backgroundColor].
     *
     * Unlike [backgroundColor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("backgroundColor")
    @ExcludeMissing
    fun _backgroundColor(): JsonField<String> = backgroundColor

    /**
     * Returns the raw JSON value of [backgroundImage].
     *
     * Unlike [backgroundImage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("backgroundImage")
    @ExcludeMissing
    fun _backgroundImage(): JsonField<String> = backgroundImage

    /**
     * Returns the raw JSON value of [backgroundImageType].
     *
     * Unlike [backgroundImageType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("backgroundImageType")
    @ExcludeMissing
    fun _backgroundImageType(): JsonField<String> = backgroundImageType

    /**
     * Returns the raw JSON value of [bodyBorderColor].
     *
     * Unlike [bodyBorderColor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bodyBorderColor")
    @ExcludeMissing
    fun _bodyBorderColor(): JsonField<String> = bodyBorderColor

    /**
     * Returns the raw JSON value of [bodyBorderColorChoice].
     *
     * Unlike [bodyBorderColorChoice], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("bodyBorderColorChoice")
    @ExcludeMissing
    fun _bodyBorderColorChoice(): JsonField<String> = bodyBorderColorChoice

    /**
     * Returns the raw JSON value of [bodyBorderWidth].
     *
     * Unlike [bodyBorderWidth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bodyBorderWidth")
    @ExcludeMissing
    fun _bodyBorderWidth(): JsonField<Double> = bodyBorderWidth

    /**
     * Returns the raw JSON value of [bodyColor].
     *
     * Unlike [bodyColor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bodyColor") @ExcludeMissing fun _bodyColor(): JsonField<String> = bodyColor

    /**
     * Returns the raw JSON value of [buttonStyleSettings].
     *
     * Unlike [buttonStyleSettings], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("buttonStyleSettings")
    @ExcludeMissing
    fun _buttonStyleSettings(): JsonField<PublicButtonStyleSettings> = buttonStyleSettings

    /**
     * Returns the raw JSON value of [colorPickerFavorite1].
     *
     * Unlike [colorPickerFavorite1], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("colorPickerFavorite1")
    @ExcludeMissing
    fun _colorPickerFavorite1(): JsonField<String> = colorPickerFavorite1

    /**
     * Returns the raw JSON value of [colorPickerFavorite2].
     *
     * Unlike [colorPickerFavorite2], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("colorPickerFavorite2")
    @ExcludeMissing
    fun _colorPickerFavorite2(): JsonField<String> = colorPickerFavorite2

    /**
     * Returns the raw JSON value of [colorPickerFavorite3].
     *
     * Unlike [colorPickerFavorite3], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("colorPickerFavorite3")
    @ExcludeMissing
    fun _colorPickerFavorite3(): JsonField<String> = colorPickerFavorite3

    /**
     * Returns the raw JSON value of [colorPickerFavorite4].
     *
     * Unlike [colorPickerFavorite4], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("colorPickerFavorite4")
    @ExcludeMissing
    fun _colorPickerFavorite4(): JsonField<String> = colorPickerFavorite4

    /**
     * Returns the raw JSON value of [colorPickerFavorite5].
     *
     * Unlike [colorPickerFavorite5], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("colorPickerFavorite5")
    @ExcludeMissing
    fun _colorPickerFavorite5(): JsonField<String> = colorPickerFavorite5

    /**
     * Returns the raw JSON value of [colorPickerFavorite6].
     *
     * Unlike [colorPickerFavorite6], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("colorPickerFavorite6")
    @ExcludeMissing
    fun _colorPickerFavorite6(): JsonField<String> = colorPickerFavorite6

    /**
     * Returns the raw JSON value of [dividerStyleSettings].
     *
     * Unlike [dividerStyleSettings], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("dividerStyleSettings")
    @ExcludeMissing
    fun _dividerStyleSettings(): JsonField<PublicDividerStyleSettings> = dividerStyleSettings

    /**
     * Returns the raw JSON value of [emailBodyPadding].
     *
     * Unlike [emailBodyPadding], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("emailBodyPadding")
    @ExcludeMissing
    fun _emailBodyPadding(): JsonField<String> = emailBodyPadding

    /**
     * Returns the raw JSON value of [emailBodyWidth].
     *
     * Unlike [emailBodyWidth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("emailBodyWidth")
    @ExcludeMissing
    fun _emailBodyWidth(): JsonField<String> = emailBodyWidth

    /**
     * Returns the raw JSON value of [headingOneFont].
     *
     * Unlike [headingOneFont], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("headingOneFont")
    @ExcludeMissing
    fun _headingOneFont(): JsonField<PublicFontStyle> = headingOneFont

    /**
     * Returns the raw JSON value of [headingTwoFont].
     *
     * Unlike [headingTwoFont], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("headingTwoFont")
    @ExcludeMissing
    fun _headingTwoFont(): JsonField<PublicFontStyle> = headingTwoFont

    /**
     * Returns the raw JSON value of [linksFont].
     *
     * Unlike [linksFont], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("linksFont")
    @ExcludeMissing
    fun _linksFont(): JsonField<PublicFontStyle> = linksFont

    /**
     * Returns the raw JSON value of [primaryAccentColor].
     *
     * Unlike [primaryAccentColor], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("primaryAccentColor")
    @ExcludeMissing
    fun _primaryAccentColor(): JsonField<String> = primaryAccentColor

    /**
     * Returns the raw JSON value of [primaryFont].
     *
     * Unlike [primaryFont], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("primaryFont") @ExcludeMissing fun _primaryFont(): JsonField<String> = primaryFont

    /**
     * Returns the raw JSON value of [primaryFontColor].
     *
     * Unlike [primaryFontColor], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("primaryFontColor")
    @ExcludeMissing
    fun _primaryFontColor(): JsonField<String> = primaryFontColor

    /**
     * Returns the raw JSON value of [primaryFontLineHeight].
     *
     * Unlike [primaryFontLineHeight], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("primaryFontLineHeight")
    @ExcludeMissing
    fun _primaryFontLineHeight(): JsonField<String> = primaryFontLineHeight

    /**
     * Returns the raw JSON value of [primaryFontSize].
     *
     * Unlike [primaryFontSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("primaryFontSize")
    @ExcludeMissing
    fun _primaryFontSize(): JsonField<Double> = primaryFontSize

    /**
     * Returns the raw JSON value of [secondaryAccentColor].
     *
     * Unlike [secondaryAccentColor], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("secondaryAccentColor")
    @ExcludeMissing
    fun _secondaryAccentColor(): JsonField<String> = secondaryAccentColor

    /**
     * Returns the raw JSON value of [secondaryFont].
     *
     * Unlike [secondaryFont], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("secondaryFont")
    @ExcludeMissing
    fun _secondaryFont(): JsonField<String> = secondaryFont

    /**
     * Returns the raw JSON value of [secondaryFontColor].
     *
     * Unlike [secondaryFontColor], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("secondaryFontColor")
    @ExcludeMissing
    fun _secondaryFontColor(): JsonField<String> = secondaryFontColor

    /**
     * Returns the raw JSON value of [secondaryFontLineHeight].
     *
     * Unlike [secondaryFontLineHeight], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("secondaryFontLineHeight")
    @ExcludeMissing
    fun _secondaryFontLineHeight(): JsonField<String> = secondaryFontLineHeight

    /**
     * Returns the raw JSON value of [secondaryFontSize].
     *
     * Unlike [secondaryFontSize], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("secondaryFontSize")
    @ExcludeMissing
    fun _secondaryFontSize(): JsonField<Double> = secondaryFontSize

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

        /** Returns a mutable builder for constructing an instance of [PublicEmailStyleSettings]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicEmailStyleSettings]. */
    class Builder internal constructor() {

        private var backgroundColor: JsonField<String> = JsonMissing.of()
        private var backgroundImage: JsonField<String> = JsonMissing.of()
        private var backgroundImageType: JsonField<String> = JsonMissing.of()
        private var bodyBorderColor: JsonField<String> = JsonMissing.of()
        private var bodyBorderColorChoice: JsonField<String> = JsonMissing.of()
        private var bodyBorderWidth: JsonField<Double> = JsonMissing.of()
        private var bodyColor: JsonField<String> = JsonMissing.of()
        private var buttonStyleSettings: JsonField<PublicButtonStyleSettings> = JsonMissing.of()
        private var colorPickerFavorite1: JsonField<String> = JsonMissing.of()
        private var colorPickerFavorite2: JsonField<String> = JsonMissing.of()
        private var colorPickerFavorite3: JsonField<String> = JsonMissing.of()
        private var colorPickerFavorite4: JsonField<String> = JsonMissing.of()
        private var colorPickerFavorite5: JsonField<String> = JsonMissing.of()
        private var colorPickerFavorite6: JsonField<String> = JsonMissing.of()
        private var dividerStyleSettings: JsonField<PublicDividerStyleSettings> = JsonMissing.of()
        private var emailBodyPadding: JsonField<String> = JsonMissing.of()
        private var emailBodyWidth: JsonField<String> = JsonMissing.of()
        private var headingOneFont: JsonField<PublicFontStyle> = JsonMissing.of()
        private var headingTwoFont: JsonField<PublicFontStyle> = JsonMissing.of()
        private var linksFont: JsonField<PublicFontStyle> = JsonMissing.of()
        private var primaryAccentColor: JsonField<String> = JsonMissing.of()
        private var primaryFont: JsonField<String> = JsonMissing.of()
        private var primaryFontColor: JsonField<String> = JsonMissing.of()
        private var primaryFontLineHeight: JsonField<String> = JsonMissing.of()
        private var primaryFontSize: JsonField<Double> = JsonMissing.of()
        private var secondaryAccentColor: JsonField<String> = JsonMissing.of()
        private var secondaryFont: JsonField<String> = JsonMissing.of()
        private var secondaryFontColor: JsonField<String> = JsonMissing.of()
        private var secondaryFontLineHeight: JsonField<String> = JsonMissing.of()
        private var secondaryFontSize: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicEmailStyleSettings: PublicEmailStyleSettings) = apply {
            backgroundColor = publicEmailStyleSettings.backgroundColor
            backgroundImage = publicEmailStyleSettings.backgroundImage
            backgroundImageType = publicEmailStyleSettings.backgroundImageType
            bodyBorderColor = publicEmailStyleSettings.bodyBorderColor
            bodyBorderColorChoice = publicEmailStyleSettings.bodyBorderColorChoice
            bodyBorderWidth = publicEmailStyleSettings.bodyBorderWidth
            bodyColor = publicEmailStyleSettings.bodyColor
            buttonStyleSettings = publicEmailStyleSettings.buttonStyleSettings
            colorPickerFavorite1 = publicEmailStyleSettings.colorPickerFavorite1
            colorPickerFavorite2 = publicEmailStyleSettings.colorPickerFavorite2
            colorPickerFavorite3 = publicEmailStyleSettings.colorPickerFavorite3
            colorPickerFavorite4 = publicEmailStyleSettings.colorPickerFavorite4
            colorPickerFavorite5 = publicEmailStyleSettings.colorPickerFavorite5
            colorPickerFavorite6 = publicEmailStyleSettings.colorPickerFavorite6
            dividerStyleSettings = publicEmailStyleSettings.dividerStyleSettings
            emailBodyPadding = publicEmailStyleSettings.emailBodyPadding
            emailBodyWidth = publicEmailStyleSettings.emailBodyWidth
            headingOneFont = publicEmailStyleSettings.headingOneFont
            headingTwoFont = publicEmailStyleSettings.headingTwoFont
            linksFont = publicEmailStyleSettings.linksFont
            primaryAccentColor = publicEmailStyleSettings.primaryAccentColor
            primaryFont = publicEmailStyleSettings.primaryFont
            primaryFontColor = publicEmailStyleSettings.primaryFontColor
            primaryFontLineHeight = publicEmailStyleSettings.primaryFontLineHeight
            primaryFontSize = publicEmailStyleSettings.primaryFontSize
            secondaryAccentColor = publicEmailStyleSettings.secondaryAccentColor
            secondaryFont = publicEmailStyleSettings.secondaryFont
            secondaryFontColor = publicEmailStyleSettings.secondaryFontColor
            secondaryFontLineHeight = publicEmailStyleSettings.secondaryFontLineHeight
            secondaryFontSize = publicEmailStyleSettings.secondaryFontSize
            additionalProperties = publicEmailStyleSettings.additionalProperties.toMutableMap()
        }

        fun backgroundColor(backgroundColor: String) =
            backgroundColor(JsonField.of(backgroundColor))

        /**
         * Sets [Builder.backgroundColor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.backgroundColor] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun backgroundColor(backgroundColor: JsonField<String>) = apply {
            this.backgroundColor = backgroundColor
        }

        fun backgroundImage(backgroundImage: String) =
            backgroundImage(JsonField.of(backgroundImage))

        /**
         * Sets [Builder.backgroundImage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.backgroundImage] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun backgroundImage(backgroundImage: JsonField<String>) = apply {
            this.backgroundImage = backgroundImage
        }

        fun backgroundImageType(backgroundImageType: String) =
            backgroundImageType(JsonField.of(backgroundImageType))

        /**
         * Sets [Builder.backgroundImageType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.backgroundImageType] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun backgroundImageType(backgroundImageType: JsonField<String>) = apply {
            this.backgroundImageType = backgroundImageType
        }

        fun bodyBorderColor(bodyBorderColor: String) =
            bodyBorderColor(JsonField.of(bodyBorderColor))

        /**
         * Sets [Builder.bodyBorderColor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bodyBorderColor] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun bodyBorderColor(bodyBorderColor: JsonField<String>) = apply {
            this.bodyBorderColor = bodyBorderColor
        }

        fun bodyBorderColorChoice(bodyBorderColorChoice: String) =
            bodyBorderColorChoice(JsonField.of(bodyBorderColorChoice))

        /**
         * Sets [Builder.bodyBorderColorChoice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bodyBorderColorChoice] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun bodyBorderColorChoice(bodyBorderColorChoice: JsonField<String>) = apply {
            this.bodyBorderColorChoice = bodyBorderColorChoice
        }

        fun bodyBorderWidth(bodyBorderWidth: Double) =
            bodyBorderWidth(JsonField.of(bodyBorderWidth))

        /**
         * Sets [Builder.bodyBorderWidth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bodyBorderWidth] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun bodyBorderWidth(bodyBorderWidth: JsonField<Double>) = apply {
            this.bodyBorderWidth = bodyBorderWidth
        }

        fun bodyColor(bodyColor: String) = bodyColor(JsonField.of(bodyColor))

        /**
         * Sets [Builder.bodyColor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bodyColor] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun bodyColor(bodyColor: JsonField<String>) = apply { this.bodyColor = bodyColor }

        fun buttonStyleSettings(buttonStyleSettings: PublicButtonStyleSettings) =
            buttonStyleSettings(JsonField.of(buttonStyleSettings))

        /**
         * Sets [Builder.buttonStyleSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.buttonStyleSettings] with a well-typed
         * [PublicButtonStyleSettings] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun buttonStyleSettings(buttonStyleSettings: JsonField<PublicButtonStyleSettings>) = apply {
            this.buttonStyleSettings = buttonStyleSettings
        }

        fun colorPickerFavorite1(colorPickerFavorite1: String) =
            colorPickerFavorite1(JsonField.of(colorPickerFavorite1))

        /**
         * Sets [Builder.colorPickerFavorite1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.colorPickerFavorite1] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun colorPickerFavorite1(colorPickerFavorite1: JsonField<String>) = apply {
            this.colorPickerFavorite1 = colorPickerFavorite1
        }

        fun colorPickerFavorite2(colorPickerFavorite2: String) =
            colorPickerFavorite2(JsonField.of(colorPickerFavorite2))

        /**
         * Sets [Builder.colorPickerFavorite2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.colorPickerFavorite2] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun colorPickerFavorite2(colorPickerFavorite2: JsonField<String>) = apply {
            this.colorPickerFavorite2 = colorPickerFavorite2
        }

        fun colorPickerFavorite3(colorPickerFavorite3: String) =
            colorPickerFavorite3(JsonField.of(colorPickerFavorite3))

        /**
         * Sets [Builder.colorPickerFavorite3] to an arbitrary JSON value.
         *
         * You should usually call [Builder.colorPickerFavorite3] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun colorPickerFavorite3(colorPickerFavorite3: JsonField<String>) = apply {
            this.colorPickerFavorite3 = colorPickerFavorite3
        }

        fun colorPickerFavorite4(colorPickerFavorite4: String) =
            colorPickerFavorite4(JsonField.of(colorPickerFavorite4))

        /**
         * Sets [Builder.colorPickerFavorite4] to an arbitrary JSON value.
         *
         * You should usually call [Builder.colorPickerFavorite4] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun colorPickerFavorite4(colorPickerFavorite4: JsonField<String>) = apply {
            this.colorPickerFavorite4 = colorPickerFavorite4
        }

        fun colorPickerFavorite5(colorPickerFavorite5: String) =
            colorPickerFavorite5(JsonField.of(colorPickerFavorite5))

        /**
         * Sets [Builder.colorPickerFavorite5] to an arbitrary JSON value.
         *
         * You should usually call [Builder.colorPickerFavorite5] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun colorPickerFavorite5(colorPickerFavorite5: JsonField<String>) = apply {
            this.colorPickerFavorite5 = colorPickerFavorite5
        }

        fun colorPickerFavorite6(colorPickerFavorite6: String) =
            colorPickerFavorite6(JsonField.of(colorPickerFavorite6))

        /**
         * Sets [Builder.colorPickerFavorite6] to an arbitrary JSON value.
         *
         * You should usually call [Builder.colorPickerFavorite6] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun colorPickerFavorite6(colorPickerFavorite6: JsonField<String>) = apply {
            this.colorPickerFavorite6 = colorPickerFavorite6
        }

        fun dividerStyleSettings(dividerStyleSettings: PublicDividerStyleSettings) =
            dividerStyleSettings(JsonField.of(dividerStyleSettings))

        /**
         * Sets [Builder.dividerStyleSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dividerStyleSettings] with a well-typed
         * [PublicDividerStyleSettings] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun dividerStyleSettings(dividerStyleSettings: JsonField<PublicDividerStyleSettings>) =
            apply {
                this.dividerStyleSettings = dividerStyleSettings
            }

        fun emailBodyPadding(emailBodyPadding: String) =
            emailBodyPadding(JsonField.of(emailBodyPadding))

        /**
         * Sets [Builder.emailBodyPadding] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emailBodyPadding] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun emailBodyPadding(emailBodyPadding: JsonField<String>) = apply {
            this.emailBodyPadding = emailBodyPadding
        }

        fun emailBodyWidth(emailBodyWidth: String) = emailBodyWidth(JsonField.of(emailBodyWidth))

        /**
         * Sets [Builder.emailBodyWidth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emailBodyWidth] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun emailBodyWidth(emailBodyWidth: JsonField<String>) = apply {
            this.emailBodyWidth = emailBodyWidth
        }

        fun headingOneFont(headingOneFont: PublicFontStyle) =
            headingOneFont(JsonField.of(headingOneFont))

        /**
         * Sets [Builder.headingOneFont] to an arbitrary JSON value.
         *
         * You should usually call [Builder.headingOneFont] with a well-typed [PublicFontStyle]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun headingOneFont(headingOneFont: JsonField<PublicFontStyle>) = apply {
            this.headingOneFont = headingOneFont
        }

        fun headingTwoFont(headingTwoFont: PublicFontStyle) =
            headingTwoFont(JsonField.of(headingTwoFont))

        /**
         * Sets [Builder.headingTwoFont] to an arbitrary JSON value.
         *
         * You should usually call [Builder.headingTwoFont] with a well-typed [PublicFontStyle]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun headingTwoFont(headingTwoFont: JsonField<PublicFontStyle>) = apply {
            this.headingTwoFont = headingTwoFont
        }

        fun linksFont(linksFont: PublicFontStyle) = linksFont(JsonField.of(linksFont))

        /**
         * Sets [Builder.linksFont] to an arbitrary JSON value.
         *
         * You should usually call [Builder.linksFont] with a well-typed [PublicFontStyle] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun linksFont(linksFont: JsonField<PublicFontStyle>) = apply { this.linksFont = linksFont }

        fun primaryAccentColor(primaryAccentColor: String) =
            primaryAccentColor(JsonField.of(primaryAccentColor))

        /**
         * Sets [Builder.primaryAccentColor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryAccentColor] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun primaryAccentColor(primaryAccentColor: JsonField<String>) = apply {
            this.primaryAccentColor = primaryAccentColor
        }

        fun primaryFont(primaryFont: String) = primaryFont(JsonField.of(primaryFont))

        /**
         * Sets [Builder.primaryFont] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryFont] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun primaryFont(primaryFont: JsonField<String>) = apply { this.primaryFont = primaryFont }

        fun primaryFontColor(primaryFontColor: String) =
            primaryFontColor(JsonField.of(primaryFontColor))

        /**
         * Sets [Builder.primaryFontColor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryFontColor] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun primaryFontColor(primaryFontColor: JsonField<String>) = apply {
            this.primaryFontColor = primaryFontColor
        }

        fun primaryFontLineHeight(primaryFontLineHeight: String) =
            primaryFontLineHeight(JsonField.of(primaryFontLineHeight))

        /**
         * Sets [Builder.primaryFontLineHeight] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryFontLineHeight] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun primaryFontLineHeight(primaryFontLineHeight: JsonField<String>) = apply {
            this.primaryFontLineHeight = primaryFontLineHeight
        }

        fun primaryFontSize(primaryFontSize: Double) =
            primaryFontSize(JsonField.of(primaryFontSize))

        /**
         * Sets [Builder.primaryFontSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryFontSize] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun primaryFontSize(primaryFontSize: JsonField<Double>) = apply {
            this.primaryFontSize = primaryFontSize
        }

        fun secondaryAccentColor(secondaryAccentColor: String) =
            secondaryAccentColor(JsonField.of(secondaryAccentColor))

        /**
         * Sets [Builder.secondaryAccentColor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secondaryAccentColor] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun secondaryAccentColor(secondaryAccentColor: JsonField<String>) = apply {
            this.secondaryAccentColor = secondaryAccentColor
        }

        fun secondaryFont(secondaryFont: String) = secondaryFont(JsonField.of(secondaryFont))

        /**
         * Sets [Builder.secondaryFont] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secondaryFont] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun secondaryFont(secondaryFont: JsonField<String>) = apply {
            this.secondaryFont = secondaryFont
        }

        fun secondaryFontColor(secondaryFontColor: String) =
            secondaryFontColor(JsonField.of(secondaryFontColor))

        /**
         * Sets [Builder.secondaryFontColor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secondaryFontColor] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun secondaryFontColor(secondaryFontColor: JsonField<String>) = apply {
            this.secondaryFontColor = secondaryFontColor
        }

        fun secondaryFontLineHeight(secondaryFontLineHeight: String) =
            secondaryFontLineHeight(JsonField.of(secondaryFontLineHeight))

        /**
         * Sets [Builder.secondaryFontLineHeight] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secondaryFontLineHeight] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun secondaryFontLineHeight(secondaryFontLineHeight: JsonField<String>) = apply {
            this.secondaryFontLineHeight = secondaryFontLineHeight
        }

        fun secondaryFontSize(secondaryFontSize: Double) =
            secondaryFontSize(JsonField.of(secondaryFontSize))

        /**
         * Sets [Builder.secondaryFontSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secondaryFontSize] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun secondaryFontSize(secondaryFontSize: JsonField<Double>) = apply {
            this.secondaryFontSize = secondaryFontSize
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
         * Returns an immutable instance of [PublicEmailStyleSettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PublicEmailStyleSettings =
            PublicEmailStyleSettings(
                backgroundColor,
                backgroundImage,
                backgroundImageType,
                bodyBorderColor,
                bodyBorderColorChoice,
                bodyBorderWidth,
                bodyColor,
                buttonStyleSettings,
                colorPickerFavorite1,
                colorPickerFavorite2,
                colorPickerFavorite3,
                colorPickerFavorite4,
                colorPickerFavorite5,
                colorPickerFavorite6,
                dividerStyleSettings,
                emailBodyPadding,
                emailBodyWidth,
                headingOneFont,
                headingTwoFont,
                linksFont,
                primaryAccentColor,
                primaryFont,
                primaryFontColor,
                primaryFontLineHeight,
                primaryFontSize,
                secondaryAccentColor,
                secondaryFont,
                secondaryFontColor,
                secondaryFontLineHeight,
                secondaryFontSize,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicEmailStyleSettings = apply {
        if (validated) {
            return@apply
        }

        backgroundColor()
        backgroundImage()
        backgroundImageType()
        bodyBorderColor()
        bodyBorderColorChoice()
        bodyBorderWidth()
        bodyColor()
        buttonStyleSettings().ifPresent { it.validate() }
        colorPickerFavorite1()
        colorPickerFavorite2()
        colorPickerFavorite3()
        colorPickerFavorite4()
        colorPickerFavorite5()
        colorPickerFavorite6()
        dividerStyleSettings().ifPresent { it.validate() }
        emailBodyPadding()
        emailBodyWidth()
        headingOneFont().ifPresent { it.validate() }
        headingTwoFont().ifPresent { it.validate() }
        linksFont().ifPresent { it.validate() }
        primaryAccentColor()
        primaryFont()
        primaryFontColor()
        primaryFontLineHeight()
        primaryFontSize()
        secondaryAccentColor()
        secondaryFont()
        secondaryFontColor()
        secondaryFontLineHeight()
        secondaryFontSize()
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
        (if (backgroundColor.asKnown().isPresent) 1 else 0) +
            (if (backgroundImage.asKnown().isPresent) 1 else 0) +
            (if (backgroundImageType.asKnown().isPresent) 1 else 0) +
            (if (bodyBorderColor.asKnown().isPresent) 1 else 0) +
            (if (bodyBorderColorChoice.asKnown().isPresent) 1 else 0) +
            (if (bodyBorderWidth.asKnown().isPresent) 1 else 0) +
            (if (bodyColor.asKnown().isPresent) 1 else 0) +
            (buttonStyleSettings.asKnown().getOrNull()?.validity() ?: 0) +
            (if (colorPickerFavorite1.asKnown().isPresent) 1 else 0) +
            (if (colorPickerFavorite2.asKnown().isPresent) 1 else 0) +
            (if (colorPickerFavorite3.asKnown().isPresent) 1 else 0) +
            (if (colorPickerFavorite4.asKnown().isPresent) 1 else 0) +
            (if (colorPickerFavorite5.asKnown().isPresent) 1 else 0) +
            (if (colorPickerFavorite6.asKnown().isPresent) 1 else 0) +
            (dividerStyleSettings.asKnown().getOrNull()?.validity() ?: 0) +
            (if (emailBodyPadding.asKnown().isPresent) 1 else 0) +
            (if (emailBodyWidth.asKnown().isPresent) 1 else 0) +
            (headingOneFont.asKnown().getOrNull()?.validity() ?: 0) +
            (headingTwoFont.asKnown().getOrNull()?.validity() ?: 0) +
            (linksFont.asKnown().getOrNull()?.validity() ?: 0) +
            (if (primaryAccentColor.asKnown().isPresent) 1 else 0) +
            (if (primaryFont.asKnown().isPresent) 1 else 0) +
            (if (primaryFontColor.asKnown().isPresent) 1 else 0) +
            (if (primaryFontLineHeight.asKnown().isPresent) 1 else 0) +
            (if (primaryFontSize.asKnown().isPresent) 1 else 0) +
            (if (secondaryAccentColor.asKnown().isPresent) 1 else 0) +
            (if (secondaryFont.asKnown().isPresent) 1 else 0) +
            (if (secondaryFontColor.asKnown().isPresent) 1 else 0) +
            (if (secondaryFontLineHeight.asKnown().isPresent) 1 else 0) +
            (if (secondaryFontSize.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicEmailStyleSettings &&
            backgroundColor == other.backgroundColor &&
            backgroundImage == other.backgroundImage &&
            backgroundImageType == other.backgroundImageType &&
            bodyBorderColor == other.bodyBorderColor &&
            bodyBorderColorChoice == other.bodyBorderColorChoice &&
            bodyBorderWidth == other.bodyBorderWidth &&
            bodyColor == other.bodyColor &&
            buttonStyleSettings == other.buttonStyleSettings &&
            colorPickerFavorite1 == other.colorPickerFavorite1 &&
            colorPickerFavorite2 == other.colorPickerFavorite2 &&
            colorPickerFavorite3 == other.colorPickerFavorite3 &&
            colorPickerFavorite4 == other.colorPickerFavorite4 &&
            colorPickerFavorite5 == other.colorPickerFavorite5 &&
            colorPickerFavorite6 == other.colorPickerFavorite6 &&
            dividerStyleSettings == other.dividerStyleSettings &&
            emailBodyPadding == other.emailBodyPadding &&
            emailBodyWidth == other.emailBodyWidth &&
            headingOneFont == other.headingOneFont &&
            headingTwoFont == other.headingTwoFont &&
            linksFont == other.linksFont &&
            primaryAccentColor == other.primaryAccentColor &&
            primaryFont == other.primaryFont &&
            primaryFontColor == other.primaryFontColor &&
            primaryFontLineHeight == other.primaryFontLineHeight &&
            primaryFontSize == other.primaryFontSize &&
            secondaryAccentColor == other.secondaryAccentColor &&
            secondaryFont == other.secondaryFont &&
            secondaryFontColor == other.secondaryFontColor &&
            secondaryFontLineHeight == other.secondaryFontLineHeight &&
            secondaryFontSize == other.secondaryFontSize &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            backgroundColor,
            backgroundImage,
            backgroundImageType,
            bodyBorderColor,
            bodyBorderColorChoice,
            bodyBorderWidth,
            bodyColor,
            buttonStyleSettings,
            colorPickerFavorite1,
            colorPickerFavorite2,
            colorPickerFavorite3,
            colorPickerFavorite4,
            colorPickerFavorite5,
            colorPickerFavorite6,
            dividerStyleSettings,
            emailBodyPadding,
            emailBodyWidth,
            headingOneFont,
            headingTwoFont,
            linksFont,
            primaryAccentColor,
            primaryFont,
            primaryFontColor,
            primaryFontLineHeight,
            primaryFontSize,
            secondaryAccentColor,
            secondaryFont,
            secondaryFontColor,
            secondaryFontLineHeight,
            secondaryFontSize,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicEmailStyleSettings{backgroundColor=$backgroundColor, backgroundImage=$backgroundImage, backgroundImageType=$backgroundImageType, bodyBorderColor=$bodyBorderColor, bodyBorderColorChoice=$bodyBorderColorChoice, bodyBorderWidth=$bodyBorderWidth, bodyColor=$bodyColor, buttonStyleSettings=$buttonStyleSettings, colorPickerFavorite1=$colorPickerFavorite1, colorPickerFavorite2=$colorPickerFavorite2, colorPickerFavorite3=$colorPickerFavorite3, colorPickerFavorite4=$colorPickerFavorite4, colorPickerFavorite5=$colorPickerFavorite5, colorPickerFavorite6=$colorPickerFavorite6, dividerStyleSettings=$dividerStyleSettings, emailBodyPadding=$emailBodyPadding, emailBodyWidth=$emailBodyWidth, headingOneFont=$headingOneFont, headingTwoFont=$headingTwoFont, linksFont=$linksFont, primaryAccentColor=$primaryAccentColor, primaryFont=$primaryFont, primaryFontColor=$primaryFontColor, primaryFontLineHeight=$primaryFontLineHeight, primaryFontSize=$primaryFontSize, secondaryAccentColor=$secondaryAccentColor, secondaryFont=$secondaryFont, secondaryFontColor=$secondaryFontColor, secondaryFontLineHeight=$secondaryFontLineHeight, secondaryFontSize=$secondaryFontSize, additionalProperties=$additionalProperties}"
}
