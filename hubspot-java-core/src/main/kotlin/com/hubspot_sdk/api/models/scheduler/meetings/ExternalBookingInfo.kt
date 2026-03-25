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
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ExternalBookingInfo
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val allUsersBusyTimes: JsonField<List<ExternalUserBusyTimes>>,
    private val customParams: JsonField<ExternalMeetingsLinkSettings>,
    private val isOffline: JsonField<Boolean>,
    private val linkId: JsonField<String>,
    private val linkType: JsonField<LinkType>,
    private val brandingMetadata: JsonField<ExternalBrandingMetadata>,
    private val linkAvailability: JsonField<ExternalLinkAvailability>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("allUsersBusyTimes")
        @ExcludeMissing
        allUsersBusyTimes: JsonField<List<ExternalUserBusyTimes>> = JsonMissing.of(),
        @JsonProperty("customParams")
        @ExcludeMissing
        customParams: JsonField<ExternalMeetingsLinkSettings> = JsonMissing.of(),
        @JsonProperty("isOffline") @ExcludeMissing isOffline: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("linkId") @ExcludeMissing linkId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("linkType") @ExcludeMissing linkType: JsonField<LinkType> = JsonMissing.of(),
        @JsonProperty("brandingMetadata")
        @ExcludeMissing
        brandingMetadata: JsonField<ExternalBrandingMetadata> = JsonMissing.of(),
        @JsonProperty("linkAvailability")
        @ExcludeMissing
        linkAvailability: JsonField<ExternalLinkAvailability> = JsonMissing.of(),
    ) : this(
        allUsersBusyTimes,
        customParams,
        isOffline,
        linkId,
        linkType,
        brandingMetadata,
        linkAvailability,
        mutableMapOf(),
    )

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun allUsersBusyTimes(): List<ExternalUserBusyTimes> =
        allUsersBusyTimes.getRequired("allUsersBusyTimes")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customParams(): ExternalMeetingsLinkSettings = customParams.getRequired("customParams")

    /**
     * Whether the meeting was booked offline, meaning no associated calendar event was created.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isOffline(): Boolean = isOffline.getRequired("isOffline")

    /**
     * The unique identifier for the meeting link.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun linkId(): String = linkId.getRequired("linkId")

    /**
     * The type of the meeting link. Accepted values are: GROUP_CALENDAR, PERSONAL_LINK,
     * ROUND_ROBIN_CALENDAR.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun linkType(): LinkType = linkType.getRequired("linkType")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun brandingMetadata(): Optional<ExternalBrandingMetadata> =
        brandingMetadata.getOptional("brandingMetadata")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun linkAvailability(): Optional<ExternalLinkAvailability> =
        linkAvailability.getOptional("linkAvailability")

    /**
     * Returns the raw JSON value of [allUsersBusyTimes].
     *
     * Unlike [allUsersBusyTimes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("allUsersBusyTimes")
    @ExcludeMissing
    fun _allUsersBusyTimes(): JsonField<List<ExternalUserBusyTimes>> = allUsersBusyTimes

    /**
     * Returns the raw JSON value of [customParams].
     *
     * Unlike [customParams], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customParams")
    @ExcludeMissing
    fun _customParams(): JsonField<ExternalMeetingsLinkSettings> = customParams

    /**
     * Returns the raw JSON value of [isOffline].
     *
     * Unlike [isOffline], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isOffline") @ExcludeMissing fun _isOffline(): JsonField<Boolean> = isOffline

    /**
     * Returns the raw JSON value of [linkId].
     *
     * Unlike [linkId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("linkId") @ExcludeMissing fun _linkId(): JsonField<String> = linkId

    /**
     * Returns the raw JSON value of [linkType].
     *
     * Unlike [linkType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("linkType") @ExcludeMissing fun _linkType(): JsonField<LinkType> = linkType

    /**
     * Returns the raw JSON value of [brandingMetadata].
     *
     * Unlike [brandingMetadata], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("brandingMetadata")
    @ExcludeMissing
    fun _brandingMetadata(): JsonField<ExternalBrandingMetadata> = brandingMetadata

    /**
     * Returns the raw JSON value of [linkAvailability].
     *
     * Unlike [linkAvailability], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("linkAvailability")
    @ExcludeMissing
    fun _linkAvailability(): JsonField<ExternalLinkAvailability> = linkAvailability

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
         * Returns a mutable builder for constructing an instance of [ExternalBookingInfo].
         *
         * The following fields are required:
         * ```java
         * .allUsersBusyTimes()
         * .customParams()
         * .isOffline()
         * .linkId()
         * .linkType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalBookingInfo]. */
    class Builder internal constructor() {

        private var allUsersBusyTimes: JsonField<MutableList<ExternalUserBusyTimes>>? = null
        private var customParams: JsonField<ExternalMeetingsLinkSettings>? = null
        private var isOffline: JsonField<Boolean>? = null
        private var linkId: JsonField<String>? = null
        private var linkType: JsonField<LinkType>? = null
        private var brandingMetadata: JsonField<ExternalBrandingMetadata> = JsonMissing.of()
        private var linkAvailability: JsonField<ExternalLinkAvailability> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalBookingInfo: ExternalBookingInfo) = apply {
            allUsersBusyTimes = externalBookingInfo.allUsersBusyTimes.map { it.toMutableList() }
            customParams = externalBookingInfo.customParams
            isOffline = externalBookingInfo.isOffline
            linkId = externalBookingInfo.linkId
            linkType = externalBookingInfo.linkType
            brandingMetadata = externalBookingInfo.brandingMetadata
            linkAvailability = externalBookingInfo.linkAvailability
            additionalProperties = externalBookingInfo.additionalProperties.toMutableMap()
        }

        fun allUsersBusyTimes(allUsersBusyTimes: List<ExternalUserBusyTimes>) =
            allUsersBusyTimes(JsonField.of(allUsersBusyTimes))

        /**
         * Sets [Builder.allUsersBusyTimes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allUsersBusyTimes] with a well-typed
         * `List<ExternalUserBusyTimes>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun allUsersBusyTimes(allUsersBusyTimes: JsonField<List<ExternalUserBusyTimes>>) = apply {
            this.allUsersBusyTimes = allUsersBusyTimes.map { it.toMutableList() }
        }

        /**
         * Adds a single [ExternalUserBusyTimes] to [allUsersBusyTimes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAllUsersBusyTime(allUsersBusyTime: ExternalUserBusyTimes) = apply {
            allUsersBusyTimes =
                (allUsersBusyTimes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("allUsersBusyTimes", it).add(allUsersBusyTime)
                }
        }

        fun customParams(customParams: ExternalMeetingsLinkSettings) =
            customParams(JsonField.of(customParams))

        /**
         * Sets [Builder.customParams] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customParams] with a well-typed
         * [ExternalMeetingsLinkSettings] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun customParams(customParams: JsonField<ExternalMeetingsLinkSettings>) = apply {
            this.customParams = customParams
        }

        /**
         * Whether the meeting was booked offline, meaning no associated calendar event was created.
         */
        fun isOffline(isOffline: Boolean) = isOffline(JsonField.of(isOffline))

        /**
         * Sets [Builder.isOffline] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isOffline] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isOffline(isOffline: JsonField<Boolean>) = apply { this.isOffline = isOffline }

        /** The unique identifier for the meeting link. */
        fun linkId(linkId: String) = linkId(JsonField.of(linkId))

        /**
         * Sets [Builder.linkId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.linkId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun linkId(linkId: JsonField<String>) = apply { this.linkId = linkId }

        /**
         * The type of the meeting link. Accepted values are: GROUP_CALENDAR, PERSONAL_LINK,
         * ROUND_ROBIN_CALENDAR.
         */
        fun linkType(linkType: LinkType) = linkType(JsonField.of(linkType))

        /**
         * Sets [Builder.linkType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.linkType] with a well-typed [LinkType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun linkType(linkType: JsonField<LinkType>) = apply { this.linkType = linkType }

        fun brandingMetadata(brandingMetadata: ExternalBrandingMetadata) =
            brandingMetadata(JsonField.of(brandingMetadata))

        /**
         * Sets [Builder.brandingMetadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.brandingMetadata] with a well-typed
         * [ExternalBrandingMetadata] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun brandingMetadata(brandingMetadata: JsonField<ExternalBrandingMetadata>) = apply {
            this.brandingMetadata = brandingMetadata
        }

        fun linkAvailability(linkAvailability: ExternalLinkAvailability) =
            linkAvailability(JsonField.of(linkAvailability))

        /**
         * Sets [Builder.linkAvailability] to an arbitrary JSON value.
         *
         * You should usually call [Builder.linkAvailability] with a well-typed
         * [ExternalLinkAvailability] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun linkAvailability(linkAvailability: JsonField<ExternalLinkAvailability>) = apply {
            this.linkAvailability = linkAvailability
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
         * Returns an immutable instance of [ExternalBookingInfo].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .allUsersBusyTimes()
         * .customParams()
         * .isOffline()
         * .linkId()
         * .linkType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalBookingInfo =
            ExternalBookingInfo(
                checkRequired("allUsersBusyTimes", allUsersBusyTimes).map { it.toImmutable() },
                checkRequired("customParams", customParams),
                checkRequired("isOffline", isOffline),
                checkRequired("linkId", linkId),
                checkRequired("linkType", linkType),
                brandingMetadata,
                linkAvailability,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalBookingInfo = apply {
        if (validated) {
            return@apply
        }

        allUsersBusyTimes().forEach { it.validate() }
        customParams().validate()
        isOffline()
        linkId()
        linkType().validate()
        brandingMetadata().ifPresent { it.validate() }
        linkAvailability().ifPresent { it.validate() }
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
        (allUsersBusyTimes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (customParams.asKnown().getOrNull()?.validity() ?: 0) +
            (if (isOffline.asKnown().isPresent) 1 else 0) +
            (if (linkId.asKnown().isPresent) 1 else 0) +
            (linkType.asKnown().getOrNull()?.validity() ?: 0) +
            (brandingMetadata.asKnown().getOrNull()?.validity() ?: 0) +
            (linkAvailability.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * The type of the meeting link. Accepted values are: GROUP_CALENDAR, PERSONAL_LINK,
     * ROUND_ROBIN_CALENDAR.
     */
    class LinkType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val GROUP_CALENDAR = of("GROUP_CALENDAR")

            @JvmField val PERSONAL_LINK = of("PERSONAL_LINK")

            @JvmField val ROUND_ROBIN_CALENDAR = of("ROUND_ROBIN_CALENDAR")

            @JvmStatic fun of(value: String) = LinkType(JsonField.of(value))
        }

        /** An enum containing [LinkType]'s known values. */
        enum class Known {
            GROUP_CALENDAR,
            PERSONAL_LINK,
            ROUND_ROBIN_CALENDAR,
        }

        /**
         * An enum containing [LinkType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [LinkType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            GROUP_CALENDAR,
            PERSONAL_LINK,
            ROUND_ROBIN_CALENDAR,
            /** An enum member indicating that [LinkType] was instantiated with an unknown value. */
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
                GROUP_CALENDAR -> Value.GROUP_CALENDAR
                PERSONAL_LINK -> Value.PERSONAL_LINK
                ROUND_ROBIN_CALENDAR -> Value.ROUND_ROBIN_CALENDAR
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
                GROUP_CALENDAR -> Known.GROUP_CALENDAR
                PERSONAL_LINK -> Known.PERSONAL_LINK
                ROUND_ROBIN_CALENDAR -> Known.ROUND_ROBIN_CALENDAR
                else -> throw HubspotInvalidDataException("Unknown LinkType: $value")
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

        fun validate(): LinkType = apply {
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

            return other is LinkType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalBookingInfo &&
            allUsersBusyTimes == other.allUsersBusyTimes &&
            customParams == other.customParams &&
            isOffline == other.isOffline &&
            linkId == other.linkId &&
            linkType == other.linkType &&
            brandingMetadata == other.brandingMetadata &&
            linkAvailability == other.linkAvailability &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            allUsersBusyTimes,
            customParams,
            isOffline,
            linkId,
            linkType,
            brandingMetadata,
            linkAvailability,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalBookingInfo{allUsersBusyTimes=$allUsersBusyTimes, customParams=$customParams, isOffline=$isOffline, linkId=$linkId, linkType=$linkType, brandingMetadata=$brandingMetadata, linkAvailability=$linkAvailability, additionalProperties=$additionalProperties}"
}
