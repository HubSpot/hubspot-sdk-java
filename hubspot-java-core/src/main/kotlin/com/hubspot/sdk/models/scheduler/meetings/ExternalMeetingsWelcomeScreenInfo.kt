// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.scheduler.meetings

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

class ExternalMeetingsWelcomeScreenInfo
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val description: JsonField<String>,
    private val logoUrl: JsonField<String>,
    private val showWelcomeScreen: JsonField<Boolean>,
    private val title: JsonField<String>,
    private val useCompanyLogo: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("logoUrl") @ExcludeMissing logoUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("showWelcomeScreen")
        @ExcludeMissing
        showWelcomeScreen: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
        @JsonProperty("useCompanyLogo")
        @ExcludeMissing
        useCompanyLogo: JsonField<Boolean> = JsonMissing.of(),
    ) : this(description, logoUrl, showWelcomeScreen, title, useCompanyLogo, mutableMapOf())

    /**
     * A brief description displayed the welcome screen below the title.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * The URL of the logo image to be displayed on the welcome screen, only used if
     * `useCompanyLogo` is false.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun logoUrl(): Optional<String> = logoUrl.getOptional("logoUrl")

    /**
     * Deprecated property. Value can be ignored but will always be false.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun showWelcomeScreen(): Optional<Boolean> = showWelcomeScreen.getOptional("showWelcomeScreen")

    /**
     * The main heading displayed on the welcome screen.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun title(): Optional<String> = title.getOptional("title")

    /**
     * Whether the company's logo should be displayed on the welcome screen.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun useCompanyLogo(): Optional<Boolean> = useCompanyLogo.getOptional("useCompanyLogo")

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [logoUrl].
     *
     * Unlike [logoUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("logoUrl") @ExcludeMissing fun _logoUrl(): JsonField<String> = logoUrl

    /**
     * Returns the raw JSON value of [showWelcomeScreen].
     *
     * Unlike [showWelcomeScreen], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("showWelcomeScreen")
    @ExcludeMissing
    fun _showWelcomeScreen(): JsonField<Boolean> = showWelcomeScreen

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

    /**
     * Returns the raw JSON value of [useCompanyLogo].
     *
     * Unlike [useCompanyLogo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("useCompanyLogo")
    @ExcludeMissing
    fun _useCompanyLogo(): JsonField<Boolean> = useCompanyLogo

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
         * Returns a mutable builder for constructing an instance of
         * [ExternalMeetingsWelcomeScreenInfo].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalMeetingsWelcomeScreenInfo]. */
    class Builder internal constructor() {

        private var description: JsonField<String> = JsonMissing.of()
        private var logoUrl: JsonField<String> = JsonMissing.of()
        private var showWelcomeScreen: JsonField<Boolean> = JsonMissing.of()
        private var title: JsonField<String> = JsonMissing.of()
        private var useCompanyLogo: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalMeetingsWelcomeScreenInfo: ExternalMeetingsWelcomeScreenInfo) =
            apply {
                description = externalMeetingsWelcomeScreenInfo.description
                logoUrl = externalMeetingsWelcomeScreenInfo.logoUrl
                showWelcomeScreen = externalMeetingsWelcomeScreenInfo.showWelcomeScreen
                title = externalMeetingsWelcomeScreenInfo.title
                useCompanyLogo = externalMeetingsWelcomeScreenInfo.useCompanyLogo
                additionalProperties =
                    externalMeetingsWelcomeScreenInfo.additionalProperties.toMutableMap()
            }

        /** A brief description displayed the welcome screen below the title. */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * The URL of the logo image to be displayed on the welcome screen, only used if
         * `useCompanyLogo` is false.
         */
        fun logoUrl(logoUrl: String) = logoUrl(JsonField.of(logoUrl))

        /**
         * Sets [Builder.logoUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logoUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun logoUrl(logoUrl: JsonField<String>) = apply { this.logoUrl = logoUrl }

        /** Deprecated property. Value can be ignored but will always be false. */
        fun showWelcomeScreen(showWelcomeScreen: Boolean) =
            showWelcomeScreen(JsonField.of(showWelcomeScreen))

        /**
         * Sets [Builder.showWelcomeScreen] to an arbitrary JSON value.
         *
         * You should usually call [Builder.showWelcomeScreen] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun showWelcomeScreen(showWelcomeScreen: JsonField<Boolean>) = apply {
            this.showWelcomeScreen = showWelcomeScreen
        }

        /** The main heading displayed on the welcome screen. */
        fun title(title: String) = title(JsonField.of(title))

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<String>) = apply { this.title = title }

        /** Whether the company's logo should be displayed on the welcome screen. */
        fun useCompanyLogo(useCompanyLogo: Boolean) = useCompanyLogo(JsonField.of(useCompanyLogo))

        /**
         * Sets [Builder.useCompanyLogo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.useCompanyLogo] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun useCompanyLogo(useCompanyLogo: JsonField<Boolean>) = apply {
            this.useCompanyLogo = useCompanyLogo
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
         * Returns an immutable instance of [ExternalMeetingsWelcomeScreenInfo].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ExternalMeetingsWelcomeScreenInfo =
            ExternalMeetingsWelcomeScreenInfo(
                description,
                logoUrl,
                showWelcomeScreen,
                title,
                useCompanyLogo,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalMeetingsWelcomeScreenInfo = apply {
        if (validated) {
            return@apply
        }

        description()
        logoUrl()
        showWelcomeScreen()
        title()
        useCompanyLogo()
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
        (if (description.asKnown().isPresent) 1 else 0) +
            (if (logoUrl.asKnown().isPresent) 1 else 0) +
            (if (showWelcomeScreen.asKnown().isPresent) 1 else 0) +
            (if (title.asKnown().isPresent) 1 else 0) +
            (if (useCompanyLogo.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalMeetingsWelcomeScreenInfo &&
            description == other.description &&
            logoUrl == other.logoUrl &&
            showWelcomeScreen == other.showWelcomeScreen &&
            title == other.title &&
            useCompanyLogo == other.useCompanyLogo &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            description,
            logoUrl,
            showWelcomeScreen,
            title,
            useCompanyLogo,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalMeetingsWelcomeScreenInfo{description=$description, logoUrl=$logoUrl, showWelcomeScreen=$showWelcomeScreen, title=$title, useCompanyLogo=$useCompanyLogo, additionalProperties=$additionalProperties}"
}
