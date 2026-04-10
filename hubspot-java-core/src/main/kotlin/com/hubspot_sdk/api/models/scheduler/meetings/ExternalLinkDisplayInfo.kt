// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.scheduler.meetings

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.Enum
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ExternalLinkDisplayInfo
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val avatar: JsonField<String>,
    private val companyAvatar: JsonField<String>,
    private val headline: JsonField<String>,
    private val publicDisplayAvatarOption: JsonField<PublicDisplayAvatarOption>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("avatar") @ExcludeMissing avatar: JsonField<String> = JsonMissing.of(),
        @JsonProperty("companyAvatar")
        @ExcludeMissing
        companyAvatar: JsonField<String> = JsonMissing.of(),
        @JsonProperty("headline") @ExcludeMissing headline: JsonField<String> = JsonMissing.of(),
        @JsonProperty("publicDisplayAvatarOption")
        @ExcludeMissing
        publicDisplayAvatarOption: JsonField<PublicDisplayAvatarOption> = JsonMissing.of(),
    ) : this(avatar, companyAvatar, headline, publicDisplayAvatarOption, mutableMapOf())

    /**
     * The URL of the user's custom uploaded avatar image.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun avatar(): Optional<String> = avatar.getOptional("avatar")

    /**
     * The URL of the company's avatar image.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyAvatar(): Optional<String> = companyAvatar.getOptional("companyAvatar")

    /**
     * Deprecated field with no impact of link display info.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun headline(): Optional<String> = headline.getOptional("headline")

    /**
     * Option for determining which avatar to display on scheduling page. Accepted values are:
     * PROFILE_IMAGE, COMPANY_LOGO, CUSTOM_AVATAR,
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun publicDisplayAvatarOption(): Optional<PublicDisplayAvatarOption> =
        publicDisplayAvatarOption.getOptional("publicDisplayAvatarOption")

    /**
     * Returns the raw JSON value of [avatar].
     *
     * Unlike [avatar], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("avatar") @ExcludeMissing fun _avatar(): JsonField<String> = avatar

    /**
     * Returns the raw JSON value of [companyAvatar].
     *
     * Unlike [companyAvatar], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("companyAvatar")
    @ExcludeMissing
    fun _companyAvatar(): JsonField<String> = companyAvatar

    /**
     * Returns the raw JSON value of [headline].
     *
     * Unlike [headline], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("headline") @ExcludeMissing fun _headline(): JsonField<String> = headline

    /**
     * Returns the raw JSON value of [publicDisplayAvatarOption].
     *
     * Unlike [publicDisplayAvatarOption], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("publicDisplayAvatarOption")
    @ExcludeMissing
    fun _publicDisplayAvatarOption(): JsonField<PublicDisplayAvatarOption> =
        publicDisplayAvatarOption

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

        /** Returns a mutable builder for constructing an instance of [ExternalLinkDisplayInfo]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalLinkDisplayInfo]. */
    class Builder internal constructor() {

        private var avatar: JsonField<String> = JsonMissing.of()
        private var companyAvatar: JsonField<String> = JsonMissing.of()
        private var headline: JsonField<String> = JsonMissing.of()
        private var publicDisplayAvatarOption: JsonField<PublicDisplayAvatarOption> =
            JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalLinkDisplayInfo: ExternalLinkDisplayInfo) = apply {
            avatar = externalLinkDisplayInfo.avatar
            companyAvatar = externalLinkDisplayInfo.companyAvatar
            headline = externalLinkDisplayInfo.headline
            publicDisplayAvatarOption = externalLinkDisplayInfo.publicDisplayAvatarOption
            additionalProperties = externalLinkDisplayInfo.additionalProperties.toMutableMap()
        }

        /** The URL of the user's custom uploaded avatar image. */
        fun avatar(avatar: String) = avatar(JsonField.of(avatar))

        /**
         * Sets [Builder.avatar] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avatar] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun avatar(avatar: JsonField<String>) = apply { this.avatar = avatar }

        /** The URL of the company's avatar image. */
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

        /** Deprecated field with no impact of link display info. */
        fun headline(headline: String) = headline(JsonField.of(headline))

        /**
         * Sets [Builder.headline] to an arbitrary JSON value.
         *
         * You should usually call [Builder.headline] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun headline(headline: JsonField<String>) = apply { this.headline = headline }

        /**
         * Option for determining which avatar to display on scheduling page. Accepted values are:
         * PROFILE_IMAGE, COMPANY_LOGO, CUSTOM_AVATAR,
         */
        fun publicDisplayAvatarOption(publicDisplayAvatarOption: PublicDisplayAvatarOption) =
            publicDisplayAvatarOption(JsonField.of(publicDisplayAvatarOption))

        /**
         * Sets [Builder.publicDisplayAvatarOption] to an arbitrary JSON value.
         *
         * You should usually call [Builder.publicDisplayAvatarOption] with a well-typed
         * [PublicDisplayAvatarOption] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun publicDisplayAvatarOption(
            publicDisplayAvatarOption: JsonField<PublicDisplayAvatarOption>
        ) = apply { this.publicDisplayAvatarOption = publicDisplayAvatarOption }

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
         * Returns an immutable instance of [ExternalLinkDisplayInfo].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ExternalLinkDisplayInfo =
            ExternalLinkDisplayInfo(
                avatar,
                companyAvatar,
                headline,
                publicDisplayAvatarOption,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalLinkDisplayInfo = apply {
        if (validated) {
            return@apply
        }

        avatar()
        companyAvatar()
        headline()
        publicDisplayAvatarOption().ifPresent { it.validate() }
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
        (if (avatar.asKnown().isPresent) 1 else 0) +
            (if (companyAvatar.asKnown().isPresent) 1 else 0) +
            (if (headline.asKnown().isPresent) 1 else 0) +
            (publicDisplayAvatarOption.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * Option for determining which avatar to display on scheduling page. Accepted values are:
     * PROFILE_IMAGE, COMPANY_LOGO, CUSTOM_AVATAR,
     */
    class PublicDisplayAvatarOption
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val COMPANY_LOGO = of("COMPANY_LOGO")

            @JvmField val CUSTOM_AVATAR = of("CUSTOM_AVATAR")

            @JvmField val PROFILE_IMAGE = of("PROFILE_IMAGE")

            @JvmStatic fun of(value: String) = PublicDisplayAvatarOption(JsonField.of(value))
        }

        /** An enum containing [PublicDisplayAvatarOption]'s known values. */
        enum class Known {
            COMPANY_LOGO,
            CUSTOM_AVATAR,
            PROFILE_IMAGE,
        }

        /**
         * An enum containing [PublicDisplayAvatarOption]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [PublicDisplayAvatarOption] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            COMPANY_LOGO,
            CUSTOM_AVATAR,
            PROFILE_IMAGE,
            /**
             * An enum member indicating that [PublicDisplayAvatarOption] was instantiated with an
             * unknown value.
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
                COMPANY_LOGO -> Value.COMPANY_LOGO
                CUSTOM_AVATAR -> Value.CUSTOM_AVATAR
                PROFILE_IMAGE -> Value.PROFILE_IMAGE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HubSpotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                COMPANY_LOGO -> Known.COMPANY_LOGO
                CUSTOM_AVATAR -> Known.CUSTOM_AVATAR
                PROFILE_IMAGE -> Known.PROFILE_IMAGE
                else ->
                    throw HubSpotInvalidDataException("Unknown PublicDisplayAvatarOption: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HubSpotInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { HubSpotInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): PublicDisplayAvatarOption = apply {
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
            } catch (e: HubSpotInvalidDataException) {
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

            return other is PublicDisplayAvatarOption && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalLinkDisplayInfo &&
            avatar == other.avatar &&
            companyAvatar == other.companyAvatar &&
            headline == other.headline &&
            publicDisplayAvatarOption == other.publicDisplayAvatarOption &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            avatar,
            companyAvatar,
            headline,
            publicDisplayAvatarOption,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalLinkDisplayInfo{avatar=$avatar, companyAvatar=$companyAvatar, headline=$headline, publicDisplayAvatarOption=$publicDisplayAvatarOption, additionalProperties=$additionalProperties}"
}
