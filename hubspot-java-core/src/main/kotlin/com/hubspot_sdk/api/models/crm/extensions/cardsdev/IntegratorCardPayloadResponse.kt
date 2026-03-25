// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.cardsdev

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

class IntegratorCardPayloadResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val responseVersion: JsonField<ResponseVersion>,
    private val sections: JsonField<List<IntegratorObjectResult>>,
    private val totalCount: JsonField<Int>,
    private val allItemsLinkUrl: JsonField<String>,
    private val cardLabel: JsonField<String>,
    private val topLevelActions: JsonField<TopLevelActions>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("responseVersion")
        @ExcludeMissing
        responseVersion: JsonField<ResponseVersion> = JsonMissing.of(),
        @JsonProperty("sections")
        @ExcludeMissing
        sections: JsonField<List<IntegratorObjectResult>> = JsonMissing.of(),
        @JsonProperty("totalCount") @ExcludeMissing totalCount: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("allItemsLinkUrl")
        @ExcludeMissing
        allItemsLinkUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cardLabel") @ExcludeMissing cardLabel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("topLevelActions")
        @ExcludeMissing
        topLevelActions: JsonField<TopLevelActions> = JsonMissing.of(),
    ) : this(
        responseVersion,
        sections,
        totalCount,
        allItemsLinkUrl,
        cardLabel,
        topLevelActions,
        mutableMapOf(),
    )

    /**
     * The number version of the response.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun responseVersion(): ResponseVersion = responseVersion.getRequired("responseVersion")

    /**
     * A list of up to five valid card sub categories.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sections(): List<IntegratorObjectResult> = sections.getRequired("sections")

    /**
     * The total number of cards that are sent in this response.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalCount(): Int = totalCount.getRequired("totalCount")

    /**
     * URL to a page the integrator has built that displays all details for the object cards. This
     * URL will be displayed to users on the title of the card.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun allItemsLinkUrl(): Optional<String> = allItemsLinkUrl.getOptional("allItemsLinkUrl")

    /**
     * The label to be used for the `allItemsLinkUrl` link (e.g. 'See more tickets') and the title
     * of the card.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cardLabel(): Optional<String> = cardLabel.getOptional("cardLabel")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun topLevelActions(): Optional<TopLevelActions> =
        topLevelActions.getOptional("topLevelActions")

    /**
     * Returns the raw JSON value of [responseVersion].
     *
     * Unlike [responseVersion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("responseVersion")
    @ExcludeMissing
    fun _responseVersion(): JsonField<ResponseVersion> = responseVersion

    /**
     * Returns the raw JSON value of [sections].
     *
     * Unlike [sections], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sections")
    @ExcludeMissing
    fun _sections(): JsonField<List<IntegratorObjectResult>> = sections

    /**
     * Returns the raw JSON value of [totalCount].
     *
     * Unlike [totalCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("totalCount") @ExcludeMissing fun _totalCount(): JsonField<Int> = totalCount

    /**
     * Returns the raw JSON value of [allItemsLinkUrl].
     *
     * Unlike [allItemsLinkUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("allItemsLinkUrl")
    @ExcludeMissing
    fun _allItemsLinkUrl(): JsonField<String> = allItemsLinkUrl

    /**
     * Returns the raw JSON value of [cardLabel].
     *
     * Unlike [cardLabel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cardLabel") @ExcludeMissing fun _cardLabel(): JsonField<String> = cardLabel

    /**
     * Returns the raw JSON value of [topLevelActions].
     *
     * Unlike [topLevelActions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("topLevelActions")
    @ExcludeMissing
    fun _topLevelActions(): JsonField<TopLevelActions> = topLevelActions

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
         * [IntegratorCardPayloadResponse].
         *
         * The following fields are required:
         * ```java
         * .responseVersion()
         * .sections()
         * .totalCount()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IntegratorCardPayloadResponse]. */
    class Builder internal constructor() {

        private var responseVersion: JsonField<ResponseVersion>? = null
        private var sections: JsonField<MutableList<IntegratorObjectResult>>? = null
        private var totalCount: JsonField<Int>? = null
        private var allItemsLinkUrl: JsonField<String> = JsonMissing.of()
        private var cardLabel: JsonField<String> = JsonMissing.of()
        private var topLevelActions: JsonField<TopLevelActions> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(integratorCardPayloadResponse: IntegratorCardPayloadResponse) = apply {
            responseVersion = integratorCardPayloadResponse.responseVersion
            sections = integratorCardPayloadResponse.sections.map { it.toMutableList() }
            totalCount = integratorCardPayloadResponse.totalCount
            allItemsLinkUrl = integratorCardPayloadResponse.allItemsLinkUrl
            cardLabel = integratorCardPayloadResponse.cardLabel
            topLevelActions = integratorCardPayloadResponse.topLevelActions
            additionalProperties = integratorCardPayloadResponse.additionalProperties.toMutableMap()
        }

        /** The number version of the response. */
        fun responseVersion(responseVersion: ResponseVersion) =
            responseVersion(JsonField.of(responseVersion))

        /**
         * Sets [Builder.responseVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.responseVersion] with a well-typed [ResponseVersion]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun responseVersion(responseVersion: JsonField<ResponseVersion>) = apply {
            this.responseVersion = responseVersion
        }

        /** A list of up to five valid card sub categories. */
        fun sections(sections: List<IntegratorObjectResult>) = sections(JsonField.of(sections))

        /**
         * Sets [Builder.sections] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sections] with a well-typed
         * `List<IntegratorObjectResult>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun sections(sections: JsonField<List<IntegratorObjectResult>>) = apply {
            this.sections = sections.map { it.toMutableList() }
        }

        /**
         * Adds a single [IntegratorObjectResult] to [sections].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSection(section: IntegratorObjectResult) = apply {
            sections =
                (sections ?: JsonField.of(mutableListOf())).also {
                    checkKnown("sections", it).add(section)
                }
        }

        /** The total number of cards that are sent in this response. */
        fun totalCount(totalCount: Int) = totalCount(JsonField.of(totalCount))

        /**
         * Sets [Builder.totalCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalCount] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun totalCount(totalCount: JsonField<Int>) = apply { this.totalCount = totalCount }

        /**
         * URL to a page the integrator has built that displays all details for the object cards.
         * This URL will be displayed to users on the title of the card.
         */
        fun allItemsLinkUrl(allItemsLinkUrl: String) =
            allItemsLinkUrl(JsonField.of(allItemsLinkUrl))

        /**
         * Sets [Builder.allItemsLinkUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allItemsLinkUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun allItemsLinkUrl(allItemsLinkUrl: JsonField<String>) = apply {
            this.allItemsLinkUrl = allItemsLinkUrl
        }

        /**
         * The label to be used for the `allItemsLinkUrl` link (e.g. 'See more tickets') and the
         * title of the card.
         */
        fun cardLabel(cardLabel: String) = cardLabel(JsonField.of(cardLabel))

        /**
         * Sets [Builder.cardLabel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardLabel] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cardLabel(cardLabel: JsonField<String>) = apply { this.cardLabel = cardLabel }

        fun topLevelActions(topLevelActions: TopLevelActions) =
            topLevelActions(JsonField.of(topLevelActions))

        /**
         * Sets [Builder.topLevelActions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topLevelActions] with a well-typed [TopLevelActions]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun topLevelActions(topLevelActions: JsonField<TopLevelActions>) = apply {
            this.topLevelActions = topLevelActions
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
         * Returns an immutable instance of [IntegratorCardPayloadResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .responseVersion()
         * .sections()
         * .totalCount()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IntegratorCardPayloadResponse =
            IntegratorCardPayloadResponse(
                checkRequired("responseVersion", responseVersion),
                checkRequired("sections", sections).map { it.toImmutable() },
                checkRequired("totalCount", totalCount),
                allItemsLinkUrl,
                cardLabel,
                topLevelActions,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): IntegratorCardPayloadResponse = apply {
        if (validated) {
            return@apply
        }

        responseVersion().validate()
        sections().forEach { it.validate() }
        totalCount()
        allItemsLinkUrl()
        cardLabel()
        topLevelActions().ifPresent { it.validate() }
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
        (responseVersion.asKnown().getOrNull()?.validity() ?: 0) +
            (sections.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (totalCount.asKnown().isPresent) 1 else 0) +
            (if (allItemsLinkUrl.asKnown().isPresent) 1 else 0) +
            (if (cardLabel.asKnown().isPresent) 1 else 0) +
            (topLevelActions.asKnown().getOrNull()?.validity() ?: 0)

    /** The number version of the response. */
    class ResponseVersion @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val V1 = of("v1")

            @JvmField val V3 = of("v3")

            @JvmStatic fun of(value: String) = ResponseVersion(JsonField.of(value))
        }

        /** An enum containing [ResponseVersion]'s known values. */
        enum class Known {
            V1,
            V3,
        }

        /**
         * An enum containing [ResponseVersion]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ResponseVersion] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            V1,
            V3,
            /**
             * An enum member indicating that [ResponseVersion] was instantiated with an unknown
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
                V1 -> Value.V1
                V3 -> Value.V3
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
                V1 -> Known.V1
                V3 -> Known.V3
                else -> throw HubspotInvalidDataException("Unknown ResponseVersion: $value")
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

        fun validate(): ResponseVersion = apply {
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

            return other is ResponseVersion && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IntegratorCardPayloadResponse &&
            responseVersion == other.responseVersion &&
            sections == other.sections &&
            totalCount == other.totalCount &&
            allItemsLinkUrl == other.allItemsLinkUrl &&
            cardLabel == other.cardLabel &&
            topLevelActions == other.topLevelActions &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            responseVersion,
            sections,
            totalCount,
            allItemsLinkUrl,
            cardLabel,
            topLevelActions,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IntegratorCardPayloadResponse{responseVersion=$responseVersion, sections=$sections, totalCount=$totalCount, allItemsLinkUrl=$allItemsLinkUrl, cardLabel=$cardLabel, topLevelActions=$topLevelActions, additionalProperties=$additionalProperties}"
}
