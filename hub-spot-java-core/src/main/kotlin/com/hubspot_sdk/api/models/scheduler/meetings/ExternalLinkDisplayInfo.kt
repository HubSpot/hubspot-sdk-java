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
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class ExternalLinkDisplayInfo
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val avatar: JsonField<String>,
    private val companyAvatar: JsonField<String>,
    private val headline: JsonField<String>,
    private val publicDisplayAvatarOption: JsonField<String>,
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
        publicDisplayAvatarOption: JsonField<String> = JsonMissing.of(),
    ) : this(avatar, companyAvatar, headline, publicDisplayAvatarOption, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun avatar(): Optional<String> = avatar.getOptional("avatar")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyAvatar(): Optional<String> = companyAvatar.getOptional("companyAvatar")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun headline(): Optional<String> = headline.getOptional("headline")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun publicDisplayAvatarOption(): Optional<String> =
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
    fun _publicDisplayAvatarOption(): JsonField<String> = publicDisplayAvatarOption

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
        private var publicDisplayAvatarOption: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalLinkDisplayInfo: ExternalLinkDisplayInfo) = apply {
            avatar = externalLinkDisplayInfo.avatar
            companyAvatar = externalLinkDisplayInfo.companyAvatar
            headline = externalLinkDisplayInfo.headline
            publicDisplayAvatarOption = externalLinkDisplayInfo.publicDisplayAvatarOption
            additionalProperties = externalLinkDisplayInfo.additionalProperties.toMutableMap()
        }

        fun avatar(avatar: String) = avatar(JsonField.of(avatar))

        /**
         * Sets [Builder.avatar] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avatar] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun avatar(avatar: JsonField<String>) = apply { this.avatar = avatar }

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

        fun headline(headline: String) = headline(JsonField.of(headline))

        /**
         * Sets [Builder.headline] to an arbitrary JSON value.
         *
         * You should usually call [Builder.headline] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun headline(headline: JsonField<String>) = apply { this.headline = headline }

        fun publicDisplayAvatarOption(publicDisplayAvatarOption: String) =
            publicDisplayAvatarOption(JsonField.of(publicDisplayAvatarOption))

        /**
         * Sets [Builder.publicDisplayAvatarOption] to an arbitrary JSON value.
         *
         * You should usually call [Builder.publicDisplayAvatarOption] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun publicDisplayAvatarOption(publicDisplayAvatarOption: JsonField<String>) = apply {
            this.publicDisplayAvatarOption = publicDisplayAvatarOption
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
        publicDisplayAvatarOption()
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
            (if (publicDisplayAvatarOption.asKnown().isPresent) 1 else 0)

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
