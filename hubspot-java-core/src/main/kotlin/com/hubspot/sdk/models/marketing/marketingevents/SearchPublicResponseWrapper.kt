// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.marketingevents

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects

class SearchPublicResponseWrapper
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val appId: JsonField<Int>,
    private val externalAccountId: JsonField<String>,
    private val externalEventId: JsonField<String>,
    private val objectId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("appId") @ExcludeMissing appId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("externalAccountId")
        @ExcludeMissing
        externalAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("externalEventId")
        @ExcludeMissing
        externalEventId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("objectId") @ExcludeMissing objectId: JsonField<String> = JsonMissing.of(),
    ) : this(appId, externalAccountId, externalEventId, objectId, mutableMapOf())

    /**
     * The ID of the source application of the marketing event
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun appId(): Int = appId.getRequired("appId")

    /**
     * The account ID associated with this marketing event in the external application
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun externalAccountId(): String = externalAccountId.getRequired("externalAccountId")

    /**
     * The ID of the marketing event in the external event application
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun externalEventId(): String = externalEventId.getRequired("externalEventId")

    /**
     * The internal ID of the marketing event in HubSpot
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectId(): String = objectId.getRequired("objectId")

    /**
     * Returns the raw JSON value of [appId].
     *
     * Unlike [appId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("appId") @ExcludeMissing fun _appId(): JsonField<Int> = appId

    /**
     * Returns the raw JSON value of [externalAccountId].
     *
     * Unlike [externalAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("externalAccountId")
    @ExcludeMissing
    fun _externalAccountId(): JsonField<String> = externalAccountId

    /**
     * Returns the raw JSON value of [externalEventId].
     *
     * Unlike [externalEventId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("externalEventId")
    @ExcludeMissing
    fun _externalEventId(): JsonField<String> = externalEventId

    /**
     * Returns the raw JSON value of [objectId].
     *
     * Unlike [objectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectId") @ExcludeMissing fun _objectId(): JsonField<String> = objectId

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
         * Returns a mutable builder for constructing an instance of [SearchPublicResponseWrapper].
         *
         * The following fields are required:
         * ```java
         * .appId()
         * .externalAccountId()
         * .externalEventId()
         * .objectId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SearchPublicResponseWrapper]. */
    class Builder internal constructor() {

        private var appId: JsonField<Int>? = null
        private var externalAccountId: JsonField<String>? = null
        private var externalEventId: JsonField<String>? = null
        private var objectId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(searchPublicResponseWrapper: SearchPublicResponseWrapper) = apply {
            appId = searchPublicResponseWrapper.appId
            externalAccountId = searchPublicResponseWrapper.externalAccountId
            externalEventId = searchPublicResponseWrapper.externalEventId
            objectId = searchPublicResponseWrapper.objectId
            additionalProperties = searchPublicResponseWrapper.additionalProperties.toMutableMap()
        }

        /** The ID of the source application of the marketing event */
        fun appId(appId: Int) = appId(JsonField.of(appId))

        /**
         * Sets [Builder.appId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.appId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun appId(appId: JsonField<Int>) = apply { this.appId = appId }

        /** The account ID associated with this marketing event in the external application */
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

        /** The ID of the marketing event in the external event application */
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

        /** The internal ID of the marketing event in HubSpot */
        fun objectId(objectId: String) = objectId(JsonField.of(objectId))

        /**
         * Sets [Builder.objectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun objectId(objectId: JsonField<String>) = apply { this.objectId = objectId }

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
         * Returns an immutable instance of [SearchPublicResponseWrapper].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .appId()
         * .externalAccountId()
         * .externalEventId()
         * .objectId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SearchPublicResponseWrapper =
            SearchPublicResponseWrapper(
                checkRequired("appId", appId),
                checkRequired("externalAccountId", externalAccountId),
                checkRequired("externalEventId", externalEventId),
                checkRequired("objectId", objectId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): SearchPublicResponseWrapper = apply {
        if (validated) {
            return@apply
        }

        appId()
        externalAccountId()
        externalEventId()
        objectId()
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
        (if (appId.asKnown().isPresent) 1 else 0) +
            (if (externalAccountId.asKnown().isPresent) 1 else 0) +
            (if (externalEventId.asKnown().isPresent) 1 else 0) +
            (if (objectId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SearchPublicResponseWrapper &&
            appId == other.appId &&
            externalAccountId == other.externalAccountId &&
            externalEventId == other.externalEventId &&
            objectId == other.objectId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(appId, externalAccountId, externalEventId, objectId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SearchPublicResponseWrapper{appId=$appId, externalAccountId=$externalAccountId, externalEventId=$externalEventId, objectId=$objectId, additionalProperties=$additionalProperties}"
}
