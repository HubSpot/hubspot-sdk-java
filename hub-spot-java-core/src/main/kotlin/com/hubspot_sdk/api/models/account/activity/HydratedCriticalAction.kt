// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.account.activity

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional

/** Details about the a particular security activity for a HubSpot account. */
class HydratedCriticalAction
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val type: JsonField<String>,
    private val userId: JsonField<Int>,
    private val actingUser: JsonField<String>,
    private val countryCode: JsonField<String>,
    private val infoUrl: JsonField<String>,
    private val ipAddress: JsonField<String>,
    private val location: JsonField<String>,
    private val objectId: JsonField<String>,
    private val regionCode: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("userId") @ExcludeMissing userId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("actingUser")
        @ExcludeMissing
        actingUser: JsonField<String> = JsonMissing.of(),
        @JsonProperty("countryCode")
        @ExcludeMissing
        countryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("infoUrl") @ExcludeMissing infoUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ipAddress") @ExcludeMissing ipAddress: JsonField<String> = JsonMissing.of(),
        @JsonProperty("location") @ExcludeMissing location: JsonField<String> = JsonMissing.of(),
        @JsonProperty("objectId") @ExcludeMissing objectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("regionCode") @ExcludeMissing regionCode: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        type,
        userId,
        actingUser,
        countryCode,
        infoUrl,
        ipAddress,
        location,
        objectId,
        regionCode,
        mutableMapOf(),
    )

    /**
     * The unique ID of the activity.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The time the activity took place.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * The type of activity.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): String = type.getRequired("type")

    /**
     * The user's unique ID.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userId(): Int = userId.getRequired("userId")

    /**
     * Email address of the user associated with the activity.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun actingUser(): Optional<String> = actingUser.getOptional("actingUser")

    /**
     * The approximate country code.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun countryCode(): Optional<String> = countryCode.getOptional("countryCode")

    /**
     * A link to the URL where the action was taken in the account.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun infoUrl(): Optional<String> = infoUrl.getOptional("infoUrl")

    /**
     * IP address where the activity originated.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ipAddress(): Optional<String> = ipAddress.getOptional("ipAddress")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun location(): Optional<String> = location.getOptional("location")

    /**
     * The ID of the affected object.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun objectId(): Optional<String> = objectId.getOptional("objectId")

    /**
     * The approximate region code.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun regionCode(): Optional<String> = regionCode.getOptional("regionCode")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("userId") @ExcludeMissing fun _userId(): JsonField<Int> = userId

    /**
     * Returns the raw JSON value of [actingUser].
     *
     * Unlike [actingUser], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actingUser") @ExcludeMissing fun _actingUser(): JsonField<String> = actingUser

    /**
     * Returns the raw JSON value of [countryCode].
     *
     * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("countryCode") @ExcludeMissing fun _countryCode(): JsonField<String> = countryCode

    /**
     * Returns the raw JSON value of [infoUrl].
     *
     * Unlike [infoUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("infoUrl") @ExcludeMissing fun _infoUrl(): JsonField<String> = infoUrl

    /**
     * Returns the raw JSON value of [ipAddress].
     *
     * Unlike [ipAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ipAddress") @ExcludeMissing fun _ipAddress(): JsonField<String> = ipAddress

    /**
     * Returns the raw JSON value of [location].
     *
     * Unlike [location], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("location") @ExcludeMissing fun _location(): JsonField<String> = location

    /**
     * Returns the raw JSON value of [objectId].
     *
     * Unlike [objectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectId") @ExcludeMissing fun _objectId(): JsonField<String> = objectId

    /**
     * Returns the raw JSON value of [regionCode].
     *
     * Unlike [regionCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("regionCode") @ExcludeMissing fun _regionCode(): JsonField<String> = regionCode

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
         * Returns a mutable builder for constructing an instance of [HydratedCriticalAction].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .type()
         * .userId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [HydratedCriticalAction]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var type: JsonField<String>? = null
        private var userId: JsonField<Int>? = null
        private var actingUser: JsonField<String> = JsonMissing.of()
        private var countryCode: JsonField<String> = JsonMissing.of()
        private var infoUrl: JsonField<String> = JsonMissing.of()
        private var ipAddress: JsonField<String> = JsonMissing.of()
        private var location: JsonField<String> = JsonMissing.of()
        private var objectId: JsonField<String> = JsonMissing.of()
        private var regionCode: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(hydratedCriticalAction: HydratedCriticalAction) = apply {
            id = hydratedCriticalAction.id
            createdAt = hydratedCriticalAction.createdAt
            type = hydratedCriticalAction.type
            userId = hydratedCriticalAction.userId
            actingUser = hydratedCriticalAction.actingUser
            countryCode = hydratedCriticalAction.countryCode
            infoUrl = hydratedCriticalAction.infoUrl
            ipAddress = hydratedCriticalAction.ipAddress
            location = hydratedCriticalAction.location
            objectId = hydratedCriticalAction.objectId
            regionCode = hydratedCriticalAction.regionCode
            additionalProperties = hydratedCriticalAction.additionalProperties.toMutableMap()
        }

        /** The unique ID of the activity. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The time the activity took place. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The type of activity. */
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

        /** The user's unique ID. */
        fun userId(userId: Int) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<Int>) = apply { this.userId = userId }

        /** Email address of the user associated with the activity. */
        fun actingUser(actingUser: String) = actingUser(JsonField.of(actingUser))

        /**
         * Sets [Builder.actingUser] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actingUser] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun actingUser(actingUser: JsonField<String>) = apply { this.actingUser = actingUser }

        /** The approximate country code. */
        fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

        /**
         * Sets [Builder.countryCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.countryCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun countryCode(countryCode: JsonField<String>) = apply { this.countryCode = countryCode }

        /** A link to the URL where the action was taken in the account. */
        fun infoUrl(infoUrl: String) = infoUrl(JsonField.of(infoUrl))

        /**
         * Sets [Builder.infoUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.infoUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun infoUrl(infoUrl: JsonField<String>) = apply { this.infoUrl = infoUrl }

        /** IP address where the activity originated. */
        fun ipAddress(ipAddress: String) = ipAddress(JsonField.of(ipAddress))

        /**
         * Sets [Builder.ipAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ipAddress] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ipAddress(ipAddress: JsonField<String>) = apply { this.ipAddress = ipAddress }

        fun location(location: String) = location(JsonField.of(location))

        /**
         * Sets [Builder.location] to an arbitrary JSON value.
         *
         * You should usually call [Builder.location] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun location(location: JsonField<String>) = apply { this.location = location }

        /** The ID of the affected object. */
        fun objectId(objectId: String) = objectId(JsonField.of(objectId))

        /**
         * Sets [Builder.objectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun objectId(objectId: JsonField<String>) = apply { this.objectId = objectId }

        /** The approximate region code. */
        fun regionCode(regionCode: String) = regionCode(JsonField.of(regionCode))

        /**
         * Sets [Builder.regionCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.regionCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun regionCode(regionCode: JsonField<String>) = apply { this.regionCode = regionCode }

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
         * Returns an immutable instance of [HydratedCriticalAction].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .type()
         * .userId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): HydratedCriticalAction =
            HydratedCriticalAction(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("type", type),
                checkRequired("userId", userId),
                actingUser,
                countryCode,
                infoUrl,
                ipAddress,
                location,
                objectId,
                regionCode,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): HydratedCriticalAction = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        type()
        userId()
        actingUser()
        countryCode()
        infoUrl()
        ipAddress()
        location()
        objectId()
        regionCode()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (type.asKnown().isPresent) 1 else 0) +
            (if (userId.asKnown().isPresent) 1 else 0) +
            (if (actingUser.asKnown().isPresent) 1 else 0) +
            (if (countryCode.asKnown().isPresent) 1 else 0) +
            (if (infoUrl.asKnown().isPresent) 1 else 0) +
            (if (ipAddress.asKnown().isPresent) 1 else 0) +
            (if (location.asKnown().isPresent) 1 else 0) +
            (if (objectId.asKnown().isPresent) 1 else 0) +
            (if (regionCode.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HydratedCriticalAction &&
            id == other.id &&
            createdAt == other.createdAt &&
            type == other.type &&
            userId == other.userId &&
            actingUser == other.actingUser &&
            countryCode == other.countryCode &&
            infoUrl == other.infoUrl &&
            ipAddress == other.ipAddress &&
            location == other.location &&
            objectId == other.objectId &&
            regionCode == other.regionCode &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            type,
            userId,
            actingUser,
            countryCode,
            infoUrl,
            ipAddress,
            location,
            objectId,
            regionCode,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "HydratedCriticalAction{id=$id, createdAt=$createdAt, type=$type, userId=$userId, actingUser=$actingUser, countryCode=$countryCode, infoUrl=$infoUrl, ipAddress=$ipAddress, location=$location, objectId=$objectId, regionCode=$regionCode, additionalProperties=$additionalProperties}"
}
