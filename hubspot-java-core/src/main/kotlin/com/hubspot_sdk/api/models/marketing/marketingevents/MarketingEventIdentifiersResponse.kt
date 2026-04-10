// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.marketingevents

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
import kotlin.jvm.optionals.getOrNull

class MarketingEventIdentifiersResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val externalEventId: JsonField<String>,
    private val marketingEventName: JsonField<String>,
    private val objectId: JsonField<String>,
    private val appInfo: JsonField<AppInfo>,
    private val externalAccountId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("externalEventId")
        @ExcludeMissing
        externalEventId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("marketingEventName")
        @ExcludeMissing
        marketingEventName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("objectId") @ExcludeMissing objectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("appInfo") @ExcludeMissing appInfo: JsonField<AppInfo> = JsonMissing.of(),
        @JsonProperty("externalAccountId")
        @ExcludeMissing
        externalAccountId: JsonField<String> = JsonMissing.of(),
    ) : this(
        externalEventId,
        marketingEventName,
        objectId,
        appInfo,
        externalAccountId,
        mutableMapOf(),
    )

    /**
     * The ID that is associated with this marketing event in the external event application
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun externalEventId(): String = externalEventId.getRequired("externalEventId")

    /**
     * The name of the marketing event
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun marketingEventName(): String = marketingEventName.getRequired("marketingEventName")

    /**
     * The internal ID of the marketing event in HubSpot CRM
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectId(): String = objectId.getRequired("objectId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun appInfo(): Optional<AppInfo> = appInfo.getOptional("appInfo")

    /**
     * The accountId that is associated with this marketing event in the external event application
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalAccountId(): Optional<String> = externalAccountId.getOptional("externalAccountId")

    /**
     * Returns the raw JSON value of [externalEventId].
     *
     * Unlike [externalEventId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("externalEventId")
    @ExcludeMissing
    fun _externalEventId(): JsonField<String> = externalEventId

    /**
     * Returns the raw JSON value of [marketingEventName].
     *
     * Unlike [marketingEventName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("marketingEventName")
    @ExcludeMissing
    fun _marketingEventName(): JsonField<String> = marketingEventName

    /**
     * Returns the raw JSON value of [objectId].
     *
     * Unlike [objectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectId") @ExcludeMissing fun _objectId(): JsonField<String> = objectId

    /**
     * Returns the raw JSON value of [appInfo].
     *
     * Unlike [appInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("appInfo") @ExcludeMissing fun _appInfo(): JsonField<AppInfo> = appInfo

    /**
     * Returns the raw JSON value of [externalAccountId].
     *
     * Unlike [externalAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("externalAccountId")
    @ExcludeMissing
    fun _externalAccountId(): JsonField<String> = externalAccountId

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
         * [MarketingEventIdentifiersResponse].
         *
         * The following fields are required:
         * ```java
         * .externalEventId()
         * .marketingEventName()
         * .objectId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MarketingEventIdentifiersResponse]. */
    class Builder internal constructor() {

        private var externalEventId: JsonField<String>? = null
        private var marketingEventName: JsonField<String>? = null
        private var objectId: JsonField<String>? = null
        private var appInfo: JsonField<AppInfo> = JsonMissing.of()
        private var externalAccountId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(marketingEventIdentifiersResponse: MarketingEventIdentifiersResponse) =
            apply {
                externalEventId = marketingEventIdentifiersResponse.externalEventId
                marketingEventName = marketingEventIdentifiersResponse.marketingEventName
                objectId = marketingEventIdentifiersResponse.objectId
                appInfo = marketingEventIdentifiersResponse.appInfo
                externalAccountId = marketingEventIdentifiersResponse.externalAccountId
                additionalProperties =
                    marketingEventIdentifiersResponse.additionalProperties.toMutableMap()
            }

        /** The ID that is associated with this marketing event in the external event application */
        fun externalEventId(externalEventId: String) =
            externalEventId(JsonField.of(externalEventId))

        /**
         * Sets [Builder.externalEventId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalEventId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externalEventId(externalEventId: JsonField<String>) = apply {
            this.externalEventId = externalEventId
        }

        /** The name of the marketing event */
        fun marketingEventName(marketingEventName: String) =
            marketingEventName(JsonField.of(marketingEventName))

        /**
         * Sets [Builder.marketingEventName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.marketingEventName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun marketingEventName(marketingEventName: JsonField<String>) = apply {
            this.marketingEventName = marketingEventName
        }

        /** The internal ID of the marketing event in HubSpot CRM */
        fun objectId(objectId: String) = objectId(JsonField.of(objectId))

        /**
         * Sets [Builder.objectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun objectId(objectId: JsonField<String>) = apply { this.objectId = objectId }

        fun appInfo(appInfo: AppInfo) = appInfo(JsonField.of(appInfo))

        /**
         * Sets [Builder.appInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.appInfo] with a well-typed [AppInfo] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun appInfo(appInfo: JsonField<AppInfo>) = apply { this.appInfo = appInfo }

        /**
         * The accountId that is associated with this marketing event in the external event
         * application
         */
        fun externalAccountId(externalAccountId: String) =
            externalAccountId(JsonField.of(externalAccountId))

        /**
         * Sets [Builder.externalAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externalAccountId(externalAccountId: JsonField<String>) = apply {
            this.externalAccountId = externalAccountId
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
         * Returns an immutable instance of [MarketingEventIdentifiersResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .externalEventId()
         * .marketingEventName()
         * .objectId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MarketingEventIdentifiersResponse =
            MarketingEventIdentifiersResponse(
                checkRequired("externalEventId", externalEventId),
                checkRequired("marketingEventName", marketingEventName),
                checkRequired("objectId", objectId),
                appInfo,
                externalAccountId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MarketingEventIdentifiersResponse = apply {
        if (validated) {
            return@apply
        }

        externalEventId()
        marketingEventName()
        objectId()
        appInfo().ifPresent { it.validate() }
        externalAccountId()
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
        (if (externalEventId.asKnown().isPresent) 1 else 0) +
            (if (marketingEventName.asKnown().isPresent) 1 else 0) +
            (if (objectId.asKnown().isPresent) 1 else 0) +
            (appInfo.asKnown().getOrNull()?.validity() ?: 0) +
            (if (externalAccountId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MarketingEventIdentifiersResponse &&
            externalEventId == other.externalEventId &&
            marketingEventName == other.marketingEventName &&
            objectId == other.objectId &&
            appInfo == other.appInfo &&
            externalAccountId == other.externalAccountId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            externalEventId,
            marketingEventName,
            objectId,
            appInfo,
            externalAccountId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MarketingEventIdentifiersResponse{externalEventId=$externalEventId, marketingEventName=$marketingEventName, objectId=$objectId, appInfo=$appInfo, externalAccountId=$externalAccountId, additionalProperties=$additionalProperties}"
}
