// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.scheduler.meetings

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
import java.util.Optional

class ExternalBrandingMetadata
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val logoAltText: JsonField<String>,
    private val showMarketingAd: JsonField<Boolean>,
    private val showSalesAd: JsonField<Boolean>,
    private val accent2Color: JsonField<String>,
    private val accentColor: JsonField<String>,
    private val companyAddressLine1: JsonField<String>,
    private val companyAddressLine2: JsonField<String>,
    private val companyAvatar: JsonField<String>,
    private val companyCity: JsonField<String>,
    private val companyCountry: JsonField<String>,
    private val companyDomain: JsonField<String>,
    private val companyName: JsonField<String>,
    private val companyState: JsonField<String>,
    private val companyZip: JsonField<String>,
    private val logoHeight: JsonField<Int>,
    private val logoUrl: JsonField<String>,
    private val logoWidth: JsonField<Int>,
    private val primaryColor: JsonField<String>,
    private val secondaryColor: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("logoAltText")
        @ExcludeMissing
        logoAltText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("showMarketingAd")
        @ExcludeMissing
        showMarketingAd: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("showSalesAd")
        @ExcludeMissing
        showSalesAd: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("accent2Color")
        @ExcludeMissing
        accent2Color: JsonField<String> = JsonMissing.of(),
        @JsonProperty("accentColor")
        @ExcludeMissing
        accentColor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("companyAddressLine1")
        @ExcludeMissing
        companyAddressLine1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("companyAddressLine2")
        @ExcludeMissing
        companyAddressLine2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("companyAvatar")
        @ExcludeMissing
        companyAvatar: JsonField<String> = JsonMissing.of(),
        @JsonProperty("companyCity")
        @ExcludeMissing
        companyCity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("companyCountry")
        @ExcludeMissing
        companyCountry: JsonField<String> = JsonMissing.of(),
        @JsonProperty("companyDomain")
        @ExcludeMissing
        companyDomain: JsonField<String> = JsonMissing.of(),
        @JsonProperty("companyName")
        @ExcludeMissing
        companyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("companyState")
        @ExcludeMissing
        companyState: JsonField<String> = JsonMissing.of(),
        @JsonProperty("companyZip")
        @ExcludeMissing
        companyZip: JsonField<String> = JsonMissing.of(),
        @JsonProperty("logoHeight") @ExcludeMissing logoHeight: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("logoUrl") @ExcludeMissing logoUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("logoWidth") @ExcludeMissing logoWidth: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("primaryColor")
        @ExcludeMissing
        primaryColor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("secondaryColor")
        @ExcludeMissing
        secondaryColor: JsonField<String> = JsonMissing.of(),
    ) : this(
        logoAltText,
        showMarketingAd,
        showSalesAd,
        accent2Color,
        accentColor,
        companyAddressLine1,
        companyAddressLine2,
        companyAvatar,
        companyCity,
        companyCountry,
        companyDomain,
        companyName,
        companyState,
        companyZip,
        logoHeight,
        logoUrl,
        logoWidth,
        primaryColor,
        secondaryColor,
        mutableMapOf(),
    )

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun logoAltText(): String = logoAltText.getRequired("logoAltText")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun showMarketingAd(): Boolean = showMarketingAd.getRequired("showMarketingAd")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun showSalesAd(): Boolean = showSalesAd.getRequired("showSalesAd")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accent2Color(): Optional<String> = accent2Color.getOptional("accent2Color")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accentColor(): Optional<String> = accentColor.getOptional("accentColor")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyAddressLine1(): Optional<String> =
        companyAddressLine1.getOptional("companyAddressLine1")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyAddressLine2(): Optional<String> =
        companyAddressLine2.getOptional("companyAddressLine2")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyAvatar(): Optional<String> = companyAvatar.getOptional("companyAvatar")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyCity(): Optional<String> = companyCity.getOptional("companyCity")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyCountry(): Optional<String> = companyCountry.getOptional("companyCountry")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyDomain(): Optional<String> = companyDomain.getOptional("companyDomain")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyName(): Optional<String> = companyName.getOptional("companyName")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyState(): Optional<String> = companyState.getOptional("companyState")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyZip(): Optional<String> = companyZip.getOptional("companyZip")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun logoHeight(): Optional<Int> = logoHeight.getOptional("logoHeight")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun logoUrl(): Optional<String> = logoUrl.getOptional("logoUrl")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun logoWidth(): Optional<Int> = logoWidth.getOptional("logoWidth")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryColor(): Optional<String> = primaryColor.getOptional("primaryColor")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun secondaryColor(): Optional<String> = secondaryColor.getOptional("secondaryColor")

    /**
     * Returns the raw JSON value of [logoAltText].
     *
     * Unlike [logoAltText], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("logoAltText") @ExcludeMissing fun _logoAltText(): JsonField<String> = logoAltText

    /**
     * Returns the raw JSON value of [showMarketingAd].
     *
     * Unlike [showMarketingAd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("showMarketingAd")
    @ExcludeMissing
    fun _showMarketingAd(): JsonField<Boolean> = showMarketingAd

    /**
     * Returns the raw JSON value of [showSalesAd].
     *
     * Unlike [showSalesAd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("showSalesAd")
    @ExcludeMissing
    fun _showSalesAd(): JsonField<Boolean> = showSalesAd

    /**
     * Returns the raw JSON value of [accent2Color].
     *
     * Unlike [accent2Color], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accent2Color")
    @ExcludeMissing
    fun _accent2Color(): JsonField<String> = accent2Color

    /**
     * Returns the raw JSON value of [accentColor].
     *
     * Unlike [accentColor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accentColor") @ExcludeMissing fun _accentColor(): JsonField<String> = accentColor

    /**
     * Returns the raw JSON value of [companyAddressLine1].
     *
     * Unlike [companyAddressLine1], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("companyAddressLine1")
    @ExcludeMissing
    fun _companyAddressLine1(): JsonField<String> = companyAddressLine1

    /**
     * Returns the raw JSON value of [companyAddressLine2].
     *
     * Unlike [companyAddressLine2], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("companyAddressLine2")
    @ExcludeMissing
    fun _companyAddressLine2(): JsonField<String> = companyAddressLine2

    /**
     * Returns the raw JSON value of [companyAvatar].
     *
     * Unlike [companyAvatar], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("companyAvatar")
    @ExcludeMissing
    fun _companyAvatar(): JsonField<String> = companyAvatar

    /**
     * Returns the raw JSON value of [companyCity].
     *
     * Unlike [companyCity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("companyCity") @ExcludeMissing fun _companyCity(): JsonField<String> = companyCity

    /**
     * Returns the raw JSON value of [companyCountry].
     *
     * Unlike [companyCountry], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("companyCountry")
    @ExcludeMissing
    fun _companyCountry(): JsonField<String> = companyCountry

    /**
     * Returns the raw JSON value of [companyDomain].
     *
     * Unlike [companyDomain], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("companyDomain")
    @ExcludeMissing
    fun _companyDomain(): JsonField<String> = companyDomain

    /**
     * Returns the raw JSON value of [companyName].
     *
     * Unlike [companyName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("companyName") @ExcludeMissing fun _companyName(): JsonField<String> = companyName

    /**
     * Returns the raw JSON value of [companyState].
     *
     * Unlike [companyState], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("companyState")
    @ExcludeMissing
    fun _companyState(): JsonField<String> = companyState

    /**
     * Returns the raw JSON value of [companyZip].
     *
     * Unlike [companyZip], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("companyZip") @ExcludeMissing fun _companyZip(): JsonField<String> = companyZip

    /**
     * Returns the raw JSON value of [logoHeight].
     *
     * Unlike [logoHeight], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("logoHeight") @ExcludeMissing fun _logoHeight(): JsonField<Int> = logoHeight

    /**
     * Returns the raw JSON value of [logoUrl].
     *
     * Unlike [logoUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("logoUrl") @ExcludeMissing fun _logoUrl(): JsonField<String> = logoUrl

    /**
     * Returns the raw JSON value of [logoWidth].
     *
     * Unlike [logoWidth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("logoWidth") @ExcludeMissing fun _logoWidth(): JsonField<Int> = logoWidth

    /**
     * Returns the raw JSON value of [primaryColor].
     *
     * Unlike [primaryColor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("primaryColor")
    @ExcludeMissing
    fun _primaryColor(): JsonField<String> = primaryColor

    /**
     * Returns the raw JSON value of [secondaryColor].
     *
     * Unlike [secondaryColor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("secondaryColor")
    @ExcludeMissing
    fun _secondaryColor(): JsonField<String> = secondaryColor

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
         * Returns a mutable builder for constructing an instance of [ExternalBrandingMetadata].
         *
         * The following fields are required:
         * ```java
         * .logoAltText()
         * .showMarketingAd()
         * .showSalesAd()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalBrandingMetadata]. */
    class Builder internal constructor() {

        private var logoAltText: JsonField<String>? = null
        private var showMarketingAd: JsonField<Boolean>? = null
        private var showSalesAd: JsonField<Boolean>? = null
        private var accent2Color: JsonField<String> = JsonMissing.of()
        private var accentColor: JsonField<String> = JsonMissing.of()
        private var companyAddressLine1: JsonField<String> = JsonMissing.of()
        private var companyAddressLine2: JsonField<String> = JsonMissing.of()
        private var companyAvatar: JsonField<String> = JsonMissing.of()
        private var companyCity: JsonField<String> = JsonMissing.of()
        private var companyCountry: JsonField<String> = JsonMissing.of()
        private var companyDomain: JsonField<String> = JsonMissing.of()
        private var companyName: JsonField<String> = JsonMissing.of()
        private var companyState: JsonField<String> = JsonMissing.of()
        private var companyZip: JsonField<String> = JsonMissing.of()
        private var logoHeight: JsonField<Int> = JsonMissing.of()
        private var logoUrl: JsonField<String> = JsonMissing.of()
        private var logoWidth: JsonField<Int> = JsonMissing.of()
        private var primaryColor: JsonField<String> = JsonMissing.of()
        private var secondaryColor: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalBrandingMetadata: ExternalBrandingMetadata) = apply {
            logoAltText = externalBrandingMetadata.logoAltText
            showMarketingAd = externalBrandingMetadata.showMarketingAd
            showSalesAd = externalBrandingMetadata.showSalesAd
            accent2Color = externalBrandingMetadata.accent2Color
            accentColor = externalBrandingMetadata.accentColor
            companyAddressLine1 = externalBrandingMetadata.companyAddressLine1
            companyAddressLine2 = externalBrandingMetadata.companyAddressLine2
            companyAvatar = externalBrandingMetadata.companyAvatar
            companyCity = externalBrandingMetadata.companyCity
            companyCountry = externalBrandingMetadata.companyCountry
            companyDomain = externalBrandingMetadata.companyDomain
            companyName = externalBrandingMetadata.companyName
            companyState = externalBrandingMetadata.companyState
            companyZip = externalBrandingMetadata.companyZip
            logoHeight = externalBrandingMetadata.logoHeight
            logoUrl = externalBrandingMetadata.logoUrl
            logoWidth = externalBrandingMetadata.logoWidth
            primaryColor = externalBrandingMetadata.primaryColor
            secondaryColor = externalBrandingMetadata.secondaryColor
            additionalProperties = externalBrandingMetadata.additionalProperties.toMutableMap()
        }

        fun logoAltText(logoAltText: String) = logoAltText(JsonField.of(logoAltText))

        /**
         * Sets [Builder.logoAltText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logoAltText] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun logoAltText(logoAltText: JsonField<String>) = apply { this.logoAltText = logoAltText }

        fun showMarketingAd(showMarketingAd: Boolean) =
            showMarketingAd(JsonField.of(showMarketingAd))

        /**
         * Sets [Builder.showMarketingAd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.showMarketingAd] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun showMarketingAd(showMarketingAd: JsonField<Boolean>) = apply {
            this.showMarketingAd = showMarketingAd
        }

        fun showSalesAd(showSalesAd: Boolean) = showSalesAd(JsonField.of(showSalesAd))

        /**
         * Sets [Builder.showSalesAd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.showSalesAd] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun showSalesAd(showSalesAd: JsonField<Boolean>) = apply { this.showSalesAd = showSalesAd }

        fun accent2Color(accent2Color: String) = accent2Color(JsonField.of(accent2Color))

        /**
         * Sets [Builder.accent2Color] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accent2Color] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accent2Color(accent2Color: JsonField<String>) = apply {
            this.accent2Color = accent2Color
        }

        fun accentColor(accentColor: String) = accentColor(JsonField.of(accentColor))

        /**
         * Sets [Builder.accentColor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accentColor] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accentColor(accentColor: JsonField<String>) = apply { this.accentColor = accentColor }

        fun companyAddressLine1(companyAddressLine1: String) =
            companyAddressLine1(JsonField.of(companyAddressLine1))

        /**
         * Sets [Builder.companyAddressLine1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyAddressLine1] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun companyAddressLine1(companyAddressLine1: JsonField<String>) = apply {
            this.companyAddressLine1 = companyAddressLine1
        }

        fun companyAddressLine2(companyAddressLine2: String) =
            companyAddressLine2(JsonField.of(companyAddressLine2))

        /**
         * Sets [Builder.companyAddressLine2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyAddressLine2] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun companyAddressLine2(companyAddressLine2: JsonField<String>) = apply {
            this.companyAddressLine2 = companyAddressLine2
        }

        fun companyAvatar(companyAvatar: String) = companyAvatar(JsonField.of(companyAvatar))

        /**
         * Sets [Builder.companyAvatar] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyAvatar] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun companyAvatar(companyAvatar: JsonField<String>) = apply {
            this.companyAvatar = companyAvatar
        }

        fun companyCity(companyCity: String) = companyCity(JsonField.of(companyCity))

        /**
         * Sets [Builder.companyCity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyCity] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun companyCity(companyCity: JsonField<String>) = apply { this.companyCity = companyCity }

        fun companyCountry(companyCountry: String) = companyCountry(JsonField.of(companyCountry))

        /**
         * Sets [Builder.companyCountry] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyCountry] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun companyCountry(companyCountry: JsonField<String>) = apply {
            this.companyCountry = companyCountry
        }

        fun companyDomain(companyDomain: String) = companyDomain(JsonField.of(companyDomain))

        /**
         * Sets [Builder.companyDomain] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyDomain] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun companyDomain(companyDomain: JsonField<String>) = apply {
            this.companyDomain = companyDomain
        }

        fun companyName(companyName: String) = companyName(JsonField.of(companyName))

        /**
         * Sets [Builder.companyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun companyName(companyName: JsonField<String>) = apply { this.companyName = companyName }

        fun companyState(companyState: String) = companyState(JsonField.of(companyState))

        /**
         * Sets [Builder.companyState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyState] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun companyState(companyState: JsonField<String>) = apply {
            this.companyState = companyState
        }

        fun companyZip(companyZip: String) = companyZip(JsonField.of(companyZip))

        /**
         * Sets [Builder.companyZip] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyZip] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun companyZip(companyZip: JsonField<String>) = apply { this.companyZip = companyZip }

        fun logoHeight(logoHeight: Int) = logoHeight(JsonField.of(logoHeight))

        /**
         * Sets [Builder.logoHeight] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logoHeight] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun logoHeight(logoHeight: JsonField<Int>) = apply { this.logoHeight = logoHeight }

        fun logoUrl(logoUrl: String) = logoUrl(JsonField.of(logoUrl))

        /**
         * Sets [Builder.logoUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logoUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun logoUrl(logoUrl: JsonField<String>) = apply { this.logoUrl = logoUrl }

        fun logoWidth(logoWidth: Int) = logoWidth(JsonField.of(logoWidth))

        /**
         * Sets [Builder.logoWidth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logoWidth] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun logoWidth(logoWidth: JsonField<Int>) = apply { this.logoWidth = logoWidth }

        fun primaryColor(primaryColor: String) = primaryColor(JsonField.of(primaryColor))

        /**
         * Sets [Builder.primaryColor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryColor] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun primaryColor(primaryColor: JsonField<String>) = apply {
            this.primaryColor = primaryColor
        }

        fun secondaryColor(secondaryColor: String) = secondaryColor(JsonField.of(secondaryColor))

        /**
         * Sets [Builder.secondaryColor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secondaryColor] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun secondaryColor(secondaryColor: JsonField<String>) = apply {
            this.secondaryColor = secondaryColor
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
         * Returns an immutable instance of [ExternalBrandingMetadata].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .logoAltText()
         * .showMarketingAd()
         * .showSalesAd()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalBrandingMetadata =
            ExternalBrandingMetadata(
                checkRequired("logoAltText", logoAltText),
                checkRequired("showMarketingAd", showMarketingAd),
                checkRequired("showSalesAd", showSalesAd),
                accent2Color,
                accentColor,
                companyAddressLine1,
                companyAddressLine2,
                companyAvatar,
                companyCity,
                companyCountry,
                companyDomain,
                companyName,
                companyState,
                companyZip,
                logoHeight,
                logoUrl,
                logoWidth,
                primaryColor,
                secondaryColor,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalBrandingMetadata = apply {
        if (validated) {
            return@apply
        }

        logoAltText()
        showMarketingAd()
        showSalesAd()
        accent2Color()
        accentColor()
        companyAddressLine1()
        companyAddressLine2()
        companyAvatar()
        companyCity()
        companyCountry()
        companyDomain()
        companyName()
        companyState()
        companyZip()
        logoHeight()
        logoUrl()
        logoWidth()
        primaryColor()
        secondaryColor()
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
        (if (logoAltText.asKnown().isPresent) 1 else 0) +
            (if (showMarketingAd.asKnown().isPresent) 1 else 0) +
            (if (showSalesAd.asKnown().isPresent) 1 else 0) +
            (if (accent2Color.asKnown().isPresent) 1 else 0) +
            (if (accentColor.asKnown().isPresent) 1 else 0) +
            (if (companyAddressLine1.asKnown().isPresent) 1 else 0) +
            (if (companyAddressLine2.asKnown().isPresent) 1 else 0) +
            (if (companyAvatar.asKnown().isPresent) 1 else 0) +
            (if (companyCity.asKnown().isPresent) 1 else 0) +
            (if (companyCountry.asKnown().isPresent) 1 else 0) +
            (if (companyDomain.asKnown().isPresent) 1 else 0) +
            (if (companyName.asKnown().isPresent) 1 else 0) +
            (if (companyState.asKnown().isPresent) 1 else 0) +
            (if (companyZip.asKnown().isPresent) 1 else 0) +
            (if (logoHeight.asKnown().isPresent) 1 else 0) +
            (if (logoUrl.asKnown().isPresent) 1 else 0) +
            (if (logoWidth.asKnown().isPresent) 1 else 0) +
            (if (primaryColor.asKnown().isPresent) 1 else 0) +
            (if (secondaryColor.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalBrandingMetadata &&
            logoAltText == other.logoAltText &&
            showMarketingAd == other.showMarketingAd &&
            showSalesAd == other.showSalesAd &&
            accent2Color == other.accent2Color &&
            accentColor == other.accentColor &&
            companyAddressLine1 == other.companyAddressLine1 &&
            companyAddressLine2 == other.companyAddressLine2 &&
            companyAvatar == other.companyAvatar &&
            companyCity == other.companyCity &&
            companyCountry == other.companyCountry &&
            companyDomain == other.companyDomain &&
            companyName == other.companyName &&
            companyState == other.companyState &&
            companyZip == other.companyZip &&
            logoHeight == other.logoHeight &&
            logoUrl == other.logoUrl &&
            logoWidth == other.logoWidth &&
            primaryColor == other.primaryColor &&
            secondaryColor == other.secondaryColor &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            logoAltText,
            showMarketingAd,
            showSalesAd,
            accent2Color,
            accentColor,
            companyAddressLine1,
            companyAddressLine2,
            companyAvatar,
            companyCity,
            companyCountry,
            companyDomain,
            companyName,
            companyState,
            companyZip,
            logoHeight,
            logoUrl,
            logoWidth,
            primaryColor,
            secondaryColor,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalBrandingMetadata{logoAltText=$logoAltText, showMarketingAd=$showMarketingAd, showSalesAd=$showSalesAd, accent2Color=$accent2Color, accentColor=$accentColor, companyAddressLine1=$companyAddressLine1, companyAddressLine2=$companyAddressLine2, companyAvatar=$companyAvatar, companyCity=$companyCity, companyCountry=$companyCountry, companyDomain=$companyDomain, companyName=$companyName, companyState=$companyState, companyZip=$companyZip, logoHeight=$logoHeight, logoUrl=$logoUrl, logoWidth=$logoWidth, primaryColor=$primaryColor, secondaryColor=$secondaryColor, additionalProperties=$additionalProperties}"
}
