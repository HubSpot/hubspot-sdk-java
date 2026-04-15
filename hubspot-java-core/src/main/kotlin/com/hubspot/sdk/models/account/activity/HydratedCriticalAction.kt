// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.account.activity

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.Enum
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class HydratedCriticalAction
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val type: JsonField<Type>,
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
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
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
     * The activity's unique ID.
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
    fun type(): Type = type.getRequired("type")

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
     * The approximate country code
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
     * The approximate location where the activity took place.
     *
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
     * The approximate region code
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
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
        private var type: JsonField<Type>? = null
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

        /** The activity's unique ID. */
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
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

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

        /** The approximate country code */
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

        /** The approximate location where the activity took place. */
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

        /** The approximate region code */
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
        type().validate()
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
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (userId.asKnown().isPresent) 1 else 0) +
            (if (actingUser.asKnown().isPresent) 1 else 0) +
            (if (countryCode.asKnown().isPresent) 1 else 0) +
            (if (infoUrl.asKnown().isPresent) 1 else 0) +
            (if (ipAddress.asKnown().isPresent) 1 else 0) +
            (if (location.asKnown().isPresent) 1 else 0) +
            (if (objectId.asKnown().isPresent) 1 else 0) +
            (if (regionCode.asKnown().isPresent) 1 else 0)

    /** The type of activity. */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ACCEPTANCE_TEST = of("ACCEPTANCE_TEST")

            @JvmField
            val ACCOUNT_ADDED_TO_MULTI_ACCOUNT_ORGANIZATION =
                of("ACCOUNT_ADDED_TO_MULTI_ACCOUNT_ORGANIZATION")

            @JvmField
            val ACCOUNT_REMOVED_FROM_MULTI_ACCOUNT_ORGANIZATION =
                of("ACCOUNT_REMOVED_FROM_MULTI_ACCOUNT_ORGANIZATION")

            @JvmField val ADD_ADMIN_PERMISSIONS = of("ADD_ADMIN_PERMISSIONS")

            @JvmField val ADD_ADMIN_USER = of("ADD_ADMIN_USER")

            @JvmField val ADD_SINGLE_SIGN_ON = of("ADD_SINGLE_SIGN_ON")

            @JvmField val ADD_TWO_FACTOR_AUTHENTICATION = of("ADD_TWO_FACTOR_AUTHENTICATION")

            @JvmField val ADD_USER = of("ADD_USER")

            @JvmField val ADD_WEBHOOK_IN_WORKFLOW = of("ADD_WEBHOOK_IN_WORKFLOW")

            @JvmField val ALLOWED_GEOLOCATIONS_DISABLED = of("ALLOWED_GEOLOCATIONS_DISABLED")

            @JvmField val ALLOWED_GEOLOCATIONS_ENABLED = of("ALLOWED_GEOLOCATIONS_ENABLED")

            @JvmField val ALLOWED_LOGIN_METHODS_DELETE = of("ALLOWED_LOGIN_METHODS_DELETE")

            @JvmField val ALLOWED_LOGIN_METHODS_UPDATE = of("ALLOWED_LOGIN_METHODS_UPDATE")

            @JvmField val ATTACHMENT_LOGGING_DISABLED = of("ATTACHMENT_LOGGING_DISABLED")

            @JvmField val ATTACHMENT_LOGGING_ENABLED = of("ATTACHMENT_LOGGING_ENABLED")

            @JvmField
            val AUTOMATED_INACTIVE_USER_DEACTIVATION_DISABLED =
                of("AUTOMATED_INACTIVE_USER_DEACTIVATION_DISABLED")

            @JvmField
            val AUTOMATED_INACTIVE_USER_DEACTIVATION_ENABLED =
                of("AUTOMATED_INACTIVE_USER_DEACTIVATION_ENABLED")

            @JvmField val BOTS_WEBHOOK_POST = of("BOTS_WEBHOOK_POST")

            @JvmField val BOTS_WEBHOOK_UPDATE = of("BOTS_WEBHOOK_UPDATE")

            @JvmField val BOTS_WEBHOOK_VIEWED = of("BOTS_WEBHOOK_VIEWED")

            @JvmField val BULK_EMAIL_DOMAIN_CHANGE = of("BULK_EMAIL_DOMAIN_CHANGE")

            @JvmField val CHANGE_AD_EVENT_CONSENT_SETTING = of("CHANGE_AD_EVENT_CONSENT_SETTING")

            @JvmField
            val CHANGE_AD_EVENT_DATA_SHARING_SETTING = of("CHANGE_AD_EVENT_DATA_SHARING_SETTING")

            @JvmField val CHANGE_PASSWORD = of("CHANGE_PASSWORD")

            @JvmField val CONTACT_DATA_EXPORT = of("CONTACT_DATA_EXPORT")

            @JvmField val DATA_ACCESS_REQUEST_SUBMITTED = of("DATA_ACCESS_REQUEST_SUBMITTED")

            @JvmField val DATA_BACKUP_CREATED = of("DATA_BACKUP_CREATED")

            @JvmField val DATA_BACKUP_DOWNLOADED = of("DATA_BACKUP_DOWNLOADED")

            @JvmField val DATA_BACKUP_SCHEDULE_CREATED = of("DATA_BACKUP_SCHEDULE_CREATED")

            @JvmField val DATA_BACKUP_SCHEDULE_DELETED = of("DATA_BACKUP_SCHEDULE_DELETED")

            @JvmField val DATA_BACKUP_SCHEDULE_UPDATED = of("DATA_BACKUP_SCHEDULE_UPDATED")

            @JvmField val DATA_RESTORE_COMPLETED = of("DATA_RESTORE_COMPLETED")

            @JvmField val DATA_SHARING_CONNECTION_ADDED = of("DATA_SHARING_CONNECTION_ADDED")

            @JvmField val DATA_SHARING_CONNECTION_REMOVED = of("DATA_SHARING_CONNECTION_REMOVED")

            @JvmField val DATASET_SYNC = of("DATASET_SYNC")

            @JvmField val DEACTIVATE_USER = of("DEACTIVATE_USER")

            @JvmField val DOMAIN_BASED_INVITE_CREATED = of("DOMAIN_BASED_INVITE_CREATED")

            @JvmField val DOMAIN_BASED_INVITE_REMOVED = of("DOMAIN_BASED_INVITE_REMOVED")

            @JvmField val DOMAIN_BASED_INVITES_DISABLED = of("DOMAIN_BASED_INVITES_DISABLED")

            @JvmField val DOMAIN_BASED_INVITES_ENABLED = of("DOMAIN_BASED_INVITES_ENABLED")

            @JvmField val EMAIL_TRACKING_DISABLED = of("EMAIL_TRACKING_DISABLED")

            @JvmField val EMAIL_TRACKING_ENABLED = of("EMAIL_TRACKING_ENABLED")

            @JvmField val EXPORT = of("EXPORT")

            @JvmField val EXPORT_APPROVAL = of("EXPORT_APPROVAL")

            @JvmField val EXPORT_DOWNLOAD = of("EXPORT_DOWNLOAD")

            @JvmField val EXPORT_USERS = of("EXPORT_USERS")

            @JvmField val FORM_SUBMISSIONS_EXPORT = of("FORM_SUBMISSIONS_EXPORT")

            @JvmField val GDPR_DELETE = of("GDPR_DELETE")

            @JvmField val GDPR_TOGGLE_DISABLED = of("GDPR_TOGGLE_DISABLED")

            @JvmField val GDPR_TOGGLE_ENABLED = of("GDPR_TOGGLE_ENABLED")

            @JvmField val HAPIKEY_CREATE = of("HAPIKEY_CREATE")

            @JvmField val HAPIKEY_DEACTIVATE = of("HAPIKEY_DEACTIVATE")

            @JvmField val HAPIKEY_VIEW = of("HAPIKEY_VIEW")

            @JvmField val HUBSPOT_EMPLOYEE_ACCESS_DISABLED = of("HUBSPOT_EMPLOYEE_ACCESS_DISABLED")

            @JvmField val HUBSPOT_EMPLOYEE_ACCESS_ENABLED = of("HUBSPOT_EMPLOYEE_ACCESS_ENABLED")

            @JvmField val IMPERSONATE_USER = of("IMPERSONATE_USER")

            @JvmField val IMPORT = of("IMPORT")

            @JvmField val INSTALL_INTEGRATION = of("INSTALL_INTEGRATION")

            @JvmField val IP_RESTRICTIONS_DISABLED = of("IP_RESTRICTIONS_DISABLED")

            @JvmField val IP_RESTRICTIONS_ENABLED = of("IP_RESTRICTIONS_ENABLED")

            @JvmField
            val JOINED_PORTAL_VIA_DOMAIN_BASED_INVITE = of("JOINED_PORTAL_VIA_DOMAIN_BASED_INVITE")

            @JvmField val LEGAL_BASIS_REQUIREMENT_DISABLED = of("LEGAL_BASIS_REQUIREMENT_DISABLED")

            @JvmField val LEGAL_BASIS_REQUIREMENT_ENABLED = of("LEGAL_BASIS_REQUIREMENT_ENABLED")

            @JvmField val MANUAL_PASSWORD_RESET_EMAIL_SEND = of("MANUAL_PASSWORD_RESET_EMAIL_SEND")

            @JvmField val MANUAL_REGISTRATION_EMAIL_SEND = of("MANUAL_REGISTRATION_EMAIL_SEND")

            @JvmField
            val MARKETING_CONTACTS_APP_SETTINGS_DISABLED =
                of("MARKETING_CONTACTS_APP_SETTINGS_DISABLED")

            @JvmField
            val MARKETING_CONTACTS_APP_SETTINGS_ENABLED =
                of("MARKETING_CONTACTS_APP_SETTINGS_ENABLED")

            @JvmField val MERGE_REVERT = of("MERGE_REVERT")

            @JvmField val MODIFY_WEBHOOK_IN_WORKFLOW = of("MODIFY_WEBHOOK_IN_WORKFLOW")

            @JvmField
            val MULTI_ACCOUNT_REPORTING_CONNECTION_ADDED =
                of("MULTI_ACCOUNT_REPORTING_CONNECTION_ADDED")

            @JvmField
            val MULTI_ACCOUNT_REPORTING_CONNECTION_REMOVED =
                of("MULTI_ACCOUNT_REPORTING_CONNECTION_REMOVED")

            @JvmField
            val MULTI_ACCOUNT_WORKFLOWS_CONNECTION_ADDED =
                of("MULTI_ACCOUNT_WORKFLOWS_CONNECTION_ADDED")

            @JvmField
            val MULTI_ACCOUNT_WORKFLOWS_CONNECTION_REMOVED =
                of("MULTI_ACCOUNT_WORKFLOWS_CONNECTION_REMOVED")

            @JvmField val NEVER_LOG_FOR_PORTAL_ADDITION = of("NEVER_LOG_FOR_PORTAL_ADDITION")

            @JvmField val NEVER_LOG_FOR_PORTAL_DELETION = of("NEVER_LOG_FOR_PORTAL_DELETION")

            @JvmField val NEVER_LOG_FOR_USER_ADDITION = of("NEVER_LOG_FOR_USER_ADDITION")

            @JvmField val NEVER_LOG_FOR_USER_DELETION = of("NEVER_LOG_FOR_USER_DELETION")

            @JvmField val PASSKEY_ADDED = of("PASSKEY_ADDED")

            @JvmField val PASSKEY_DELETED = of("PASSKEY_DELETED")

            @JvmField val PAYMENT_ACCOUNT_CREATION = of("PAYMENT_ACCOUNT_CREATION")

            @JvmField val PAYMENT_ACCOUNT_INFO_UPDATE = of("PAYMENT_ACCOUNT_INFO_UPDATE")

            @JvmField val PAYMENT_BANK_ACCOUNT_CHANGE = of("PAYMENT_BANK_ACCOUNT_CHANGE")

            @JvmField val PAYMENT_ONBOARDING_LINK_SEND = of("PAYMENT_ONBOARDING_LINK_SEND")

            @JvmField val PERSONAL_ACCESS_KEY_CREATE = of("PERSONAL_ACCESS_KEY_CREATE")

            @JvmField val PERSONAL_ACCESS_KEY_DEACTIVATE = of("PERSONAL_ACCESS_KEY_DEACTIVATE")

            @JvmField val PERSONAL_ACCESS_KEY_ROTATE = of("PERSONAL_ACCESS_KEY_ROTATE")

            @JvmField val PERSONAL_ACCESS_KEY_VIEW = of("PERSONAL_ACCESS_KEY_VIEW")

            @JvmField val PRIVATE_APP_ACCESS_TOKEN_CREATE = of("PRIVATE_APP_ACCESS_TOKEN_CREATE")

            @JvmField
            val PRIVATE_APP_ACCESS_TOKEN_DEACTIVATE = of("PRIVATE_APP_ACCESS_TOKEN_DEACTIVATE")

            @JvmField val PRIVATE_APP_ACCESS_TOKEN_ROTATE = of("PRIVATE_APP_ACCESS_TOKEN_ROTATE")

            @JvmField val PRIVATE_APP_ACCESS_TOKEN_VIEW = of("PRIVATE_APP_ACCESS_TOKEN_VIEW")

            @JvmField val PRIVATE_APP_CLIENT_SECRET_VIEW = of("PRIVATE_APP_CLIENT_SECRET_VIEW")

            @JvmField val PRIVATE_APP_CLIENT_SECRET_WRITE = of("PRIVATE_APP_CLIENT_SECRET_WRITE")

            @JvmField val PRIVATE_APP_SCOPE_GROUPS_UPDATE = of("PRIVATE_APP_SCOPE_GROUPS_UPDATE")

            @JvmField val PRODUCTION_DEPLOYMENT = of("PRODUCTION_DEPLOYMENT")

            @JvmField val PROPERTY_HISTORY_REVISION = of("PROPERTY_HISTORY_REVISION")

            @JvmField val PUBLIC_APP_CLIENT_SECRET_VIEW = of("PUBLIC_APP_CLIENT_SECRET_VIEW")

            @JvmField val PUBLIC_APP_CLIENT_SECRET_WRITE = of("PUBLIC_APP_CLIENT_SECRET_WRITE")

            @JvmField val REACTIVATE_USER = of("REACTIVATE_USER")

            @JvmField val REMOVE_ADMIN_PERMISSIONS = of("REMOVE_ADMIN_PERMISSIONS")

            @JvmField val REMOVE_ADMIN_USER = of("REMOVE_ADMIN_USER")

            @JvmField val REMOVE_SINGLE_SIGN_ON = of("REMOVE_SINGLE_SIGN_ON")

            @JvmField val REMOVE_TWO_FACTOR_AUTHENTICATION = of("REMOVE_TWO_FACTOR_AUTHENTICATION")

            @JvmField val REMOVE_USER = of("REMOVE_USER")

            @JvmField val REQUIRE_SINGLE_SIGN_ON = of("REQUIRE_SINGLE_SIGN_ON")

            @JvmField val RESTRICTED_LIST_ADDED_TO_CONTENT = of("RESTRICTED_LIST_ADDED_TO_CONTENT")

            @JvmField val SANDBOX_CREATION = of("SANDBOX_CREATION")

            @JvmField val SANDBOX_DELETION = of("SANDBOX_DELETION")

            @JvmField val SANDBOX_SYNC = of("SANDBOX_SYNC")

            @JvmField val SANDBOX_SYNC_TO_PRODUCTION = of("SANDBOX_SYNC_TO_PRODUCTION")

            @JvmField
            val SECRET_ADDED_TO_SERVERLESS_FUNCTION = of("SECRET_ADDED_TO_SERVERLESS_FUNCTION")

            @JvmField val SENSITIVE_DATA_DISABLED = of("SENSITIVE_DATA_DISABLED")

            @JvmField val SENSITIVE_DATA_ENABLED = of("SENSITIVE_DATA_ENABLED")

            @JvmField val SEQUENCE_CLONED = of("SEQUENCE_CLONED")

            @JvmField val SEQUENCE_CREATED = of("SEQUENCE_CREATED")

            @JvmField val SEQUENCE_ENROLLMENT_INITIATED = of("SEQUENCE_ENROLLMENT_INITIATED")

            @JvmField
            val SEQUENCE_ENROLLMENT_STATE_CHANGED = of("SEQUENCE_ENROLLMENT_STATE_CHANGED")

            @JvmField val SEQUENCE_MODIFIED = of("SEQUENCE_MODIFIED")

            @JvmField val SERVICE_KEY_CREATE = of("SERVICE_KEY_CREATE")

            @JvmField val SERVICE_KEY_DEACTIVATE = of("SERVICE_KEY_DEACTIVATE")

            @JvmField val SERVICE_KEY_PERMISSIONS_UPDATE = of("SERVICE_KEY_PERMISSIONS_UPDATE")

            @JvmField val SERVICE_KEY_REVEAL = of("SERVICE_KEY_REVEAL")

            @JvmField val SERVICE_KEY_ROTATE = of("SERVICE_KEY_ROTATE")

            @JvmField val SMTP_TOKEN_CREATED = of("SMTP_TOKEN_CREATED")

            @JvmField val SMTP_TOKEN_DELETED = of("SMTP_TOKEN_DELETED")

            @JvmField val SMTP_TOKEN_PASSWORD_RESET = of("SMTP_TOKEN_PASSWORD_RESET")

            @JvmField val SMTP_TOKEN_RETRIEVED = of("SMTP_TOKEN_RETRIEVED")

            @JvmField val TEAM_ADDED = of("TEAM_ADDED")

            @JvmField val TEAM_DELETED = of("TEAM_DELETED")

            @JvmField val TEAM_USER_ADDED = of("TEAM_USER_ADDED")

            @JvmField val TEAM_USER_DELETED = of("TEAM_USER_DELETED")

            @JvmField val TEMPLATE_MODIFIED = of("TEMPLATE_MODIFIED")

            @JvmField val TOUCHLESS_PURCHASE = of("TOUCHLESS_PURCHASE")

            @JvmField val UNIFIED_RESTORE_UNDO_EXECUTION = of("UNIFIED_RESTORE_UNDO_EXECUTION")

            @JvmField val UNINSTALL_INTEGRATION = of("UNINSTALL_INTEGRATION")

            @JvmField val UNREQUIRE_SINGLE_SIGN_ON = of("UNREQUIRE_SINGLE_SIGN_ON")

            @JvmField val WEBHOOK_SETTINGS_UPDATE = of("WEBHOOK_SETTINGS_UPDATE")

            @JvmField val WEBHOOK_SUBSCRIPTION_CREATE = of("WEBHOOK_SUBSCRIPTION_CREATE")

            @JvmField val WEBHOOK_SUBSCRIPTION_UPDATE = of("WEBHOOK_SUBSCRIPTION_UPDATE")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            ACCEPTANCE_TEST,
            ACCOUNT_ADDED_TO_MULTI_ACCOUNT_ORGANIZATION,
            ACCOUNT_REMOVED_FROM_MULTI_ACCOUNT_ORGANIZATION,
            ADD_ADMIN_PERMISSIONS,
            ADD_ADMIN_USER,
            ADD_SINGLE_SIGN_ON,
            ADD_TWO_FACTOR_AUTHENTICATION,
            ADD_USER,
            ADD_WEBHOOK_IN_WORKFLOW,
            ALLOWED_GEOLOCATIONS_DISABLED,
            ALLOWED_GEOLOCATIONS_ENABLED,
            ALLOWED_LOGIN_METHODS_DELETE,
            ALLOWED_LOGIN_METHODS_UPDATE,
            ATTACHMENT_LOGGING_DISABLED,
            ATTACHMENT_LOGGING_ENABLED,
            AUTOMATED_INACTIVE_USER_DEACTIVATION_DISABLED,
            AUTOMATED_INACTIVE_USER_DEACTIVATION_ENABLED,
            BOTS_WEBHOOK_POST,
            BOTS_WEBHOOK_UPDATE,
            BOTS_WEBHOOK_VIEWED,
            BULK_EMAIL_DOMAIN_CHANGE,
            CHANGE_AD_EVENT_CONSENT_SETTING,
            CHANGE_AD_EVENT_DATA_SHARING_SETTING,
            CHANGE_PASSWORD,
            CONTACT_DATA_EXPORT,
            DATA_ACCESS_REQUEST_SUBMITTED,
            DATA_BACKUP_CREATED,
            DATA_BACKUP_DOWNLOADED,
            DATA_BACKUP_SCHEDULE_CREATED,
            DATA_BACKUP_SCHEDULE_DELETED,
            DATA_BACKUP_SCHEDULE_UPDATED,
            DATA_RESTORE_COMPLETED,
            DATA_SHARING_CONNECTION_ADDED,
            DATA_SHARING_CONNECTION_REMOVED,
            DATASET_SYNC,
            DEACTIVATE_USER,
            DOMAIN_BASED_INVITE_CREATED,
            DOMAIN_BASED_INVITE_REMOVED,
            DOMAIN_BASED_INVITES_DISABLED,
            DOMAIN_BASED_INVITES_ENABLED,
            EMAIL_TRACKING_DISABLED,
            EMAIL_TRACKING_ENABLED,
            EXPORT,
            EXPORT_APPROVAL,
            EXPORT_DOWNLOAD,
            EXPORT_USERS,
            FORM_SUBMISSIONS_EXPORT,
            GDPR_DELETE,
            GDPR_TOGGLE_DISABLED,
            GDPR_TOGGLE_ENABLED,
            HAPIKEY_CREATE,
            HAPIKEY_DEACTIVATE,
            HAPIKEY_VIEW,
            HUBSPOT_EMPLOYEE_ACCESS_DISABLED,
            HUBSPOT_EMPLOYEE_ACCESS_ENABLED,
            IMPERSONATE_USER,
            IMPORT,
            INSTALL_INTEGRATION,
            IP_RESTRICTIONS_DISABLED,
            IP_RESTRICTIONS_ENABLED,
            JOINED_PORTAL_VIA_DOMAIN_BASED_INVITE,
            LEGAL_BASIS_REQUIREMENT_DISABLED,
            LEGAL_BASIS_REQUIREMENT_ENABLED,
            MANUAL_PASSWORD_RESET_EMAIL_SEND,
            MANUAL_REGISTRATION_EMAIL_SEND,
            MARKETING_CONTACTS_APP_SETTINGS_DISABLED,
            MARKETING_CONTACTS_APP_SETTINGS_ENABLED,
            MERGE_REVERT,
            MODIFY_WEBHOOK_IN_WORKFLOW,
            MULTI_ACCOUNT_REPORTING_CONNECTION_ADDED,
            MULTI_ACCOUNT_REPORTING_CONNECTION_REMOVED,
            MULTI_ACCOUNT_WORKFLOWS_CONNECTION_ADDED,
            MULTI_ACCOUNT_WORKFLOWS_CONNECTION_REMOVED,
            NEVER_LOG_FOR_PORTAL_ADDITION,
            NEVER_LOG_FOR_PORTAL_DELETION,
            NEVER_LOG_FOR_USER_ADDITION,
            NEVER_LOG_FOR_USER_DELETION,
            PASSKEY_ADDED,
            PASSKEY_DELETED,
            PAYMENT_ACCOUNT_CREATION,
            PAYMENT_ACCOUNT_INFO_UPDATE,
            PAYMENT_BANK_ACCOUNT_CHANGE,
            PAYMENT_ONBOARDING_LINK_SEND,
            PERSONAL_ACCESS_KEY_CREATE,
            PERSONAL_ACCESS_KEY_DEACTIVATE,
            PERSONAL_ACCESS_KEY_ROTATE,
            PERSONAL_ACCESS_KEY_VIEW,
            PRIVATE_APP_ACCESS_TOKEN_CREATE,
            PRIVATE_APP_ACCESS_TOKEN_DEACTIVATE,
            PRIVATE_APP_ACCESS_TOKEN_ROTATE,
            PRIVATE_APP_ACCESS_TOKEN_VIEW,
            PRIVATE_APP_CLIENT_SECRET_VIEW,
            PRIVATE_APP_CLIENT_SECRET_WRITE,
            PRIVATE_APP_SCOPE_GROUPS_UPDATE,
            PRODUCTION_DEPLOYMENT,
            PROPERTY_HISTORY_REVISION,
            PUBLIC_APP_CLIENT_SECRET_VIEW,
            PUBLIC_APP_CLIENT_SECRET_WRITE,
            REACTIVATE_USER,
            REMOVE_ADMIN_PERMISSIONS,
            REMOVE_ADMIN_USER,
            REMOVE_SINGLE_SIGN_ON,
            REMOVE_TWO_FACTOR_AUTHENTICATION,
            REMOVE_USER,
            REQUIRE_SINGLE_SIGN_ON,
            RESTRICTED_LIST_ADDED_TO_CONTENT,
            SANDBOX_CREATION,
            SANDBOX_DELETION,
            SANDBOX_SYNC,
            SANDBOX_SYNC_TO_PRODUCTION,
            SECRET_ADDED_TO_SERVERLESS_FUNCTION,
            SENSITIVE_DATA_DISABLED,
            SENSITIVE_DATA_ENABLED,
            SEQUENCE_CLONED,
            SEQUENCE_CREATED,
            SEQUENCE_ENROLLMENT_INITIATED,
            SEQUENCE_ENROLLMENT_STATE_CHANGED,
            SEQUENCE_MODIFIED,
            SERVICE_KEY_CREATE,
            SERVICE_KEY_DEACTIVATE,
            SERVICE_KEY_PERMISSIONS_UPDATE,
            SERVICE_KEY_REVEAL,
            SERVICE_KEY_ROTATE,
            SMTP_TOKEN_CREATED,
            SMTP_TOKEN_DELETED,
            SMTP_TOKEN_PASSWORD_RESET,
            SMTP_TOKEN_RETRIEVED,
            TEAM_ADDED,
            TEAM_DELETED,
            TEAM_USER_ADDED,
            TEAM_USER_DELETED,
            TEMPLATE_MODIFIED,
            TOUCHLESS_PURCHASE,
            UNIFIED_RESTORE_UNDO_EXECUTION,
            UNINSTALL_INTEGRATION,
            UNREQUIRE_SINGLE_SIGN_ON,
            WEBHOOK_SETTINGS_UPDATE,
            WEBHOOK_SUBSCRIPTION_CREATE,
            WEBHOOK_SUBSCRIPTION_UPDATE,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACCEPTANCE_TEST,
            ACCOUNT_ADDED_TO_MULTI_ACCOUNT_ORGANIZATION,
            ACCOUNT_REMOVED_FROM_MULTI_ACCOUNT_ORGANIZATION,
            ADD_ADMIN_PERMISSIONS,
            ADD_ADMIN_USER,
            ADD_SINGLE_SIGN_ON,
            ADD_TWO_FACTOR_AUTHENTICATION,
            ADD_USER,
            ADD_WEBHOOK_IN_WORKFLOW,
            ALLOWED_GEOLOCATIONS_DISABLED,
            ALLOWED_GEOLOCATIONS_ENABLED,
            ALLOWED_LOGIN_METHODS_DELETE,
            ALLOWED_LOGIN_METHODS_UPDATE,
            ATTACHMENT_LOGGING_DISABLED,
            ATTACHMENT_LOGGING_ENABLED,
            AUTOMATED_INACTIVE_USER_DEACTIVATION_DISABLED,
            AUTOMATED_INACTIVE_USER_DEACTIVATION_ENABLED,
            BOTS_WEBHOOK_POST,
            BOTS_WEBHOOK_UPDATE,
            BOTS_WEBHOOK_VIEWED,
            BULK_EMAIL_DOMAIN_CHANGE,
            CHANGE_AD_EVENT_CONSENT_SETTING,
            CHANGE_AD_EVENT_DATA_SHARING_SETTING,
            CHANGE_PASSWORD,
            CONTACT_DATA_EXPORT,
            DATA_ACCESS_REQUEST_SUBMITTED,
            DATA_BACKUP_CREATED,
            DATA_BACKUP_DOWNLOADED,
            DATA_BACKUP_SCHEDULE_CREATED,
            DATA_BACKUP_SCHEDULE_DELETED,
            DATA_BACKUP_SCHEDULE_UPDATED,
            DATA_RESTORE_COMPLETED,
            DATA_SHARING_CONNECTION_ADDED,
            DATA_SHARING_CONNECTION_REMOVED,
            DATASET_SYNC,
            DEACTIVATE_USER,
            DOMAIN_BASED_INVITE_CREATED,
            DOMAIN_BASED_INVITE_REMOVED,
            DOMAIN_BASED_INVITES_DISABLED,
            DOMAIN_BASED_INVITES_ENABLED,
            EMAIL_TRACKING_DISABLED,
            EMAIL_TRACKING_ENABLED,
            EXPORT,
            EXPORT_APPROVAL,
            EXPORT_DOWNLOAD,
            EXPORT_USERS,
            FORM_SUBMISSIONS_EXPORT,
            GDPR_DELETE,
            GDPR_TOGGLE_DISABLED,
            GDPR_TOGGLE_ENABLED,
            HAPIKEY_CREATE,
            HAPIKEY_DEACTIVATE,
            HAPIKEY_VIEW,
            HUBSPOT_EMPLOYEE_ACCESS_DISABLED,
            HUBSPOT_EMPLOYEE_ACCESS_ENABLED,
            IMPERSONATE_USER,
            IMPORT,
            INSTALL_INTEGRATION,
            IP_RESTRICTIONS_DISABLED,
            IP_RESTRICTIONS_ENABLED,
            JOINED_PORTAL_VIA_DOMAIN_BASED_INVITE,
            LEGAL_BASIS_REQUIREMENT_DISABLED,
            LEGAL_BASIS_REQUIREMENT_ENABLED,
            MANUAL_PASSWORD_RESET_EMAIL_SEND,
            MANUAL_REGISTRATION_EMAIL_SEND,
            MARKETING_CONTACTS_APP_SETTINGS_DISABLED,
            MARKETING_CONTACTS_APP_SETTINGS_ENABLED,
            MERGE_REVERT,
            MODIFY_WEBHOOK_IN_WORKFLOW,
            MULTI_ACCOUNT_REPORTING_CONNECTION_ADDED,
            MULTI_ACCOUNT_REPORTING_CONNECTION_REMOVED,
            MULTI_ACCOUNT_WORKFLOWS_CONNECTION_ADDED,
            MULTI_ACCOUNT_WORKFLOWS_CONNECTION_REMOVED,
            NEVER_LOG_FOR_PORTAL_ADDITION,
            NEVER_LOG_FOR_PORTAL_DELETION,
            NEVER_LOG_FOR_USER_ADDITION,
            NEVER_LOG_FOR_USER_DELETION,
            PASSKEY_ADDED,
            PASSKEY_DELETED,
            PAYMENT_ACCOUNT_CREATION,
            PAYMENT_ACCOUNT_INFO_UPDATE,
            PAYMENT_BANK_ACCOUNT_CHANGE,
            PAYMENT_ONBOARDING_LINK_SEND,
            PERSONAL_ACCESS_KEY_CREATE,
            PERSONAL_ACCESS_KEY_DEACTIVATE,
            PERSONAL_ACCESS_KEY_ROTATE,
            PERSONAL_ACCESS_KEY_VIEW,
            PRIVATE_APP_ACCESS_TOKEN_CREATE,
            PRIVATE_APP_ACCESS_TOKEN_DEACTIVATE,
            PRIVATE_APP_ACCESS_TOKEN_ROTATE,
            PRIVATE_APP_ACCESS_TOKEN_VIEW,
            PRIVATE_APP_CLIENT_SECRET_VIEW,
            PRIVATE_APP_CLIENT_SECRET_WRITE,
            PRIVATE_APP_SCOPE_GROUPS_UPDATE,
            PRODUCTION_DEPLOYMENT,
            PROPERTY_HISTORY_REVISION,
            PUBLIC_APP_CLIENT_SECRET_VIEW,
            PUBLIC_APP_CLIENT_SECRET_WRITE,
            REACTIVATE_USER,
            REMOVE_ADMIN_PERMISSIONS,
            REMOVE_ADMIN_USER,
            REMOVE_SINGLE_SIGN_ON,
            REMOVE_TWO_FACTOR_AUTHENTICATION,
            REMOVE_USER,
            REQUIRE_SINGLE_SIGN_ON,
            RESTRICTED_LIST_ADDED_TO_CONTENT,
            SANDBOX_CREATION,
            SANDBOX_DELETION,
            SANDBOX_SYNC,
            SANDBOX_SYNC_TO_PRODUCTION,
            SECRET_ADDED_TO_SERVERLESS_FUNCTION,
            SENSITIVE_DATA_DISABLED,
            SENSITIVE_DATA_ENABLED,
            SEQUENCE_CLONED,
            SEQUENCE_CREATED,
            SEQUENCE_ENROLLMENT_INITIATED,
            SEQUENCE_ENROLLMENT_STATE_CHANGED,
            SEQUENCE_MODIFIED,
            SERVICE_KEY_CREATE,
            SERVICE_KEY_DEACTIVATE,
            SERVICE_KEY_PERMISSIONS_UPDATE,
            SERVICE_KEY_REVEAL,
            SERVICE_KEY_ROTATE,
            SMTP_TOKEN_CREATED,
            SMTP_TOKEN_DELETED,
            SMTP_TOKEN_PASSWORD_RESET,
            SMTP_TOKEN_RETRIEVED,
            TEAM_ADDED,
            TEAM_DELETED,
            TEAM_USER_ADDED,
            TEAM_USER_DELETED,
            TEMPLATE_MODIFIED,
            TOUCHLESS_PURCHASE,
            UNIFIED_RESTORE_UNDO_EXECUTION,
            UNINSTALL_INTEGRATION,
            UNREQUIRE_SINGLE_SIGN_ON,
            WEBHOOK_SETTINGS_UPDATE,
            WEBHOOK_SUBSCRIPTION_CREATE,
            WEBHOOK_SUBSCRIPTION_UPDATE,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                ACCEPTANCE_TEST -> Value.ACCEPTANCE_TEST
                ACCOUNT_ADDED_TO_MULTI_ACCOUNT_ORGANIZATION ->
                    Value.ACCOUNT_ADDED_TO_MULTI_ACCOUNT_ORGANIZATION
                ACCOUNT_REMOVED_FROM_MULTI_ACCOUNT_ORGANIZATION ->
                    Value.ACCOUNT_REMOVED_FROM_MULTI_ACCOUNT_ORGANIZATION
                ADD_ADMIN_PERMISSIONS -> Value.ADD_ADMIN_PERMISSIONS
                ADD_ADMIN_USER -> Value.ADD_ADMIN_USER
                ADD_SINGLE_SIGN_ON -> Value.ADD_SINGLE_SIGN_ON
                ADD_TWO_FACTOR_AUTHENTICATION -> Value.ADD_TWO_FACTOR_AUTHENTICATION
                ADD_USER -> Value.ADD_USER
                ADD_WEBHOOK_IN_WORKFLOW -> Value.ADD_WEBHOOK_IN_WORKFLOW
                ALLOWED_GEOLOCATIONS_DISABLED -> Value.ALLOWED_GEOLOCATIONS_DISABLED
                ALLOWED_GEOLOCATIONS_ENABLED -> Value.ALLOWED_GEOLOCATIONS_ENABLED
                ALLOWED_LOGIN_METHODS_DELETE -> Value.ALLOWED_LOGIN_METHODS_DELETE
                ALLOWED_LOGIN_METHODS_UPDATE -> Value.ALLOWED_LOGIN_METHODS_UPDATE
                ATTACHMENT_LOGGING_DISABLED -> Value.ATTACHMENT_LOGGING_DISABLED
                ATTACHMENT_LOGGING_ENABLED -> Value.ATTACHMENT_LOGGING_ENABLED
                AUTOMATED_INACTIVE_USER_DEACTIVATION_DISABLED ->
                    Value.AUTOMATED_INACTIVE_USER_DEACTIVATION_DISABLED
                AUTOMATED_INACTIVE_USER_DEACTIVATION_ENABLED ->
                    Value.AUTOMATED_INACTIVE_USER_DEACTIVATION_ENABLED
                BOTS_WEBHOOK_POST -> Value.BOTS_WEBHOOK_POST
                BOTS_WEBHOOK_UPDATE -> Value.BOTS_WEBHOOK_UPDATE
                BOTS_WEBHOOK_VIEWED -> Value.BOTS_WEBHOOK_VIEWED
                BULK_EMAIL_DOMAIN_CHANGE -> Value.BULK_EMAIL_DOMAIN_CHANGE
                CHANGE_AD_EVENT_CONSENT_SETTING -> Value.CHANGE_AD_EVENT_CONSENT_SETTING
                CHANGE_AD_EVENT_DATA_SHARING_SETTING -> Value.CHANGE_AD_EVENT_DATA_SHARING_SETTING
                CHANGE_PASSWORD -> Value.CHANGE_PASSWORD
                CONTACT_DATA_EXPORT -> Value.CONTACT_DATA_EXPORT
                DATA_ACCESS_REQUEST_SUBMITTED -> Value.DATA_ACCESS_REQUEST_SUBMITTED
                DATA_BACKUP_CREATED -> Value.DATA_BACKUP_CREATED
                DATA_BACKUP_DOWNLOADED -> Value.DATA_BACKUP_DOWNLOADED
                DATA_BACKUP_SCHEDULE_CREATED -> Value.DATA_BACKUP_SCHEDULE_CREATED
                DATA_BACKUP_SCHEDULE_DELETED -> Value.DATA_BACKUP_SCHEDULE_DELETED
                DATA_BACKUP_SCHEDULE_UPDATED -> Value.DATA_BACKUP_SCHEDULE_UPDATED
                DATA_RESTORE_COMPLETED -> Value.DATA_RESTORE_COMPLETED
                DATA_SHARING_CONNECTION_ADDED -> Value.DATA_SHARING_CONNECTION_ADDED
                DATA_SHARING_CONNECTION_REMOVED -> Value.DATA_SHARING_CONNECTION_REMOVED
                DATASET_SYNC -> Value.DATASET_SYNC
                DEACTIVATE_USER -> Value.DEACTIVATE_USER
                DOMAIN_BASED_INVITE_CREATED -> Value.DOMAIN_BASED_INVITE_CREATED
                DOMAIN_BASED_INVITE_REMOVED -> Value.DOMAIN_BASED_INVITE_REMOVED
                DOMAIN_BASED_INVITES_DISABLED -> Value.DOMAIN_BASED_INVITES_DISABLED
                DOMAIN_BASED_INVITES_ENABLED -> Value.DOMAIN_BASED_INVITES_ENABLED
                EMAIL_TRACKING_DISABLED -> Value.EMAIL_TRACKING_DISABLED
                EMAIL_TRACKING_ENABLED -> Value.EMAIL_TRACKING_ENABLED
                EXPORT -> Value.EXPORT
                EXPORT_APPROVAL -> Value.EXPORT_APPROVAL
                EXPORT_DOWNLOAD -> Value.EXPORT_DOWNLOAD
                EXPORT_USERS -> Value.EXPORT_USERS
                FORM_SUBMISSIONS_EXPORT -> Value.FORM_SUBMISSIONS_EXPORT
                GDPR_DELETE -> Value.GDPR_DELETE
                GDPR_TOGGLE_DISABLED -> Value.GDPR_TOGGLE_DISABLED
                GDPR_TOGGLE_ENABLED -> Value.GDPR_TOGGLE_ENABLED
                HAPIKEY_CREATE -> Value.HAPIKEY_CREATE
                HAPIKEY_DEACTIVATE -> Value.HAPIKEY_DEACTIVATE
                HAPIKEY_VIEW -> Value.HAPIKEY_VIEW
                HUBSPOT_EMPLOYEE_ACCESS_DISABLED -> Value.HUBSPOT_EMPLOYEE_ACCESS_DISABLED
                HUBSPOT_EMPLOYEE_ACCESS_ENABLED -> Value.HUBSPOT_EMPLOYEE_ACCESS_ENABLED
                IMPERSONATE_USER -> Value.IMPERSONATE_USER
                IMPORT -> Value.IMPORT
                INSTALL_INTEGRATION -> Value.INSTALL_INTEGRATION
                IP_RESTRICTIONS_DISABLED -> Value.IP_RESTRICTIONS_DISABLED
                IP_RESTRICTIONS_ENABLED -> Value.IP_RESTRICTIONS_ENABLED
                JOINED_PORTAL_VIA_DOMAIN_BASED_INVITE -> Value.JOINED_PORTAL_VIA_DOMAIN_BASED_INVITE
                LEGAL_BASIS_REQUIREMENT_DISABLED -> Value.LEGAL_BASIS_REQUIREMENT_DISABLED
                LEGAL_BASIS_REQUIREMENT_ENABLED -> Value.LEGAL_BASIS_REQUIREMENT_ENABLED
                MANUAL_PASSWORD_RESET_EMAIL_SEND -> Value.MANUAL_PASSWORD_RESET_EMAIL_SEND
                MANUAL_REGISTRATION_EMAIL_SEND -> Value.MANUAL_REGISTRATION_EMAIL_SEND
                MARKETING_CONTACTS_APP_SETTINGS_DISABLED ->
                    Value.MARKETING_CONTACTS_APP_SETTINGS_DISABLED
                MARKETING_CONTACTS_APP_SETTINGS_ENABLED ->
                    Value.MARKETING_CONTACTS_APP_SETTINGS_ENABLED
                MERGE_REVERT -> Value.MERGE_REVERT
                MODIFY_WEBHOOK_IN_WORKFLOW -> Value.MODIFY_WEBHOOK_IN_WORKFLOW
                MULTI_ACCOUNT_REPORTING_CONNECTION_ADDED ->
                    Value.MULTI_ACCOUNT_REPORTING_CONNECTION_ADDED
                MULTI_ACCOUNT_REPORTING_CONNECTION_REMOVED ->
                    Value.MULTI_ACCOUNT_REPORTING_CONNECTION_REMOVED
                MULTI_ACCOUNT_WORKFLOWS_CONNECTION_ADDED ->
                    Value.MULTI_ACCOUNT_WORKFLOWS_CONNECTION_ADDED
                MULTI_ACCOUNT_WORKFLOWS_CONNECTION_REMOVED ->
                    Value.MULTI_ACCOUNT_WORKFLOWS_CONNECTION_REMOVED
                NEVER_LOG_FOR_PORTAL_ADDITION -> Value.NEVER_LOG_FOR_PORTAL_ADDITION
                NEVER_LOG_FOR_PORTAL_DELETION -> Value.NEVER_LOG_FOR_PORTAL_DELETION
                NEVER_LOG_FOR_USER_ADDITION -> Value.NEVER_LOG_FOR_USER_ADDITION
                NEVER_LOG_FOR_USER_DELETION -> Value.NEVER_LOG_FOR_USER_DELETION
                PASSKEY_ADDED -> Value.PASSKEY_ADDED
                PASSKEY_DELETED -> Value.PASSKEY_DELETED
                PAYMENT_ACCOUNT_CREATION -> Value.PAYMENT_ACCOUNT_CREATION
                PAYMENT_ACCOUNT_INFO_UPDATE -> Value.PAYMENT_ACCOUNT_INFO_UPDATE
                PAYMENT_BANK_ACCOUNT_CHANGE -> Value.PAYMENT_BANK_ACCOUNT_CHANGE
                PAYMENT_ONBOARDING_LINK_SEND -> Value.PAYMENT_ONBOARDING_LINK_SEND
                PERSONAL_ACCESS_KEY_CREATE -> Value.PERSONAL_ACCESS_KEY_CREATE
                PERSONAL_ACCESS_KEY_DEACTIVATE -> Value.PERSONAL_ACCESS_KEY_DEACTIVATE
                PERSONAL_ACCESS_KEY_ROTATE -> Value.PERSONAL_ACCESS_KEY_ROTATE
                PERSONAL_ACCESS_KEY_VIEW -> Value.PERSONAL_ACCESS_KEY_VIEW
                PRIVATE_APP_ACCESS_TOKEN_CREATE -> Value.PRIVATE_APP_ACCESS_TOKEN_CREATE
                PRIVATE_APP_ACCESS_TOKEN_DEACTIVATE -> Value.PRIVATE_APP_ACCESS_TOKEN_DEACTIVATE
                PRIVATE_APP_ACCESS_TOKEN_ROTATE -> Value.PRIVATE_APP_ACCESS_TOKEN_ROTATE
                PRIVATE_APP_ACCESS_TOKEN_VIEW -> Value.PRIVATE_APP_ACCESS_TOKEN_VIEW
                PRIVATE_APP_CLIENT_SECRET_VIEW -> Value.PRIVATE_APP_CLIENT_SECRET_VIEW
                PRIVATE_APP_CLIENT_SECRET_WRITE -> Value.PRIVATE_APP_CLIENT_SECRET_WRITE
                PRIVATE_APP_SCOPE_GROUPS_UPDATE -> Value.PRIVATE_APP_SCOPE_GROUPS_UPDATE
                PRODUCTION_DEPLOYMENT -> Value.PRODUCTION_DEPLOYMENT
                PROPERTY_HISTORY_REVISION -> Value.PROPERTY_HISTORY_REVISION
                PUBLIC_APP_CLIENT_SECRET_VIEW -> Value.PUBLIC_APP_CLIENT_SECRET_VIEW
                PUBLIC_APP_CLIENT_SECRET_WRITE -> Value.PUBLIC_APP_CLIENT_SECRET_WRITE
                REACTIVATE_USER -> Value.REACTIVATE_USER
                REMOVE_ADMIN_PERMISSIONS -> Value.REMOVE_ADMIN_PERMISSIONS
                REMOVE_ADMIN_USER -> Value.REMOVE_ADMIN_USER
                REMOVE_SINGLE_SIGN_ON -> Value.REMOVE_SINGLE_SIGN_ON
                REMOVE_TWO_FACTOR_AUTHENTICATION -> Value.REMOVE_TWO_FACTOR_AUTHENTICATION
                REMOVE_USER -> Value.REMOVE_USER
                REQUIRE_SINGLE_SIGN_ON -> Value.REQUIRE_SINGLE_SIGN_ON
                RESTRICTED_LIST_ADDED_TO_CONTENT -> Value.RESTRICTED_LIST_ADDED_TO_CONTENT
                SANDBOX_CREATION -> Value.SANDBOX_CREATION
                SANDBOX_DELETION -> Value.SANDBOX_DELETION
                SANDBOX_SYNC -> Value.SANDBOX_SYNC
                SANDBOX_SYNC_TO_PRODUCTION -> Value.SANDBOX_SYNC_TO_PRODUCTION
                SECRET_ADDED_TO_SERVERLESS_FUNCTION -> Value.SECRET_ADDED_TO_SERVERLESS_FUNCTION
                SENSITIVE_DATA_DISABLED -> Value.SENSITIVE_DATA_DISABLED
                SENSITIVE_DATA_ENABLED -> Value.SENSITIVE_DATA_ENABLED
                SEQUENCE_CLONED -> Value.SEQUENCE_CLONED
                SEQUENCE_CREATED -> Value.SEQUENCE_CREATED
                SEQUENCE_ENROLLMENT_INITIATED -> Value.SEQUENCE_ENROLLMENT_INITIATED
                SEQUENCE_ENROLLMENT_STATE_CHANGED -> Value.SEQUENCE_ENROLLMENT_STATE_CHANGED
                SEQUENCE_MODIFIED -> Value.SEQUENCE_MODIFIED
                SERVICE_KEY_CREATE -> Value.SERVICE_KEY_CREATE
                SERVICE_KEY_DEACTIVATE -> Value.SERVICE_KEY_DEACTIVATE
                SERVICE_KEY_PERMISSIONS_UPDATE -> Value.SERVICE_KEY_PERMISSIONS_UPDATE
                SERVICE_KEY_REVEAL -> Value.SERVICE_KEY_REVEAL
                SERVICE_KEY_ROTATE -> Value.SERVICE_KEY_ROTATE
                SMTP_TOKEN_CREATED -> Value.SMTP_TOKEN_CREATED
                SMTP_TOKEN_DELETED -> Value.SMTP_TOKEN_DELETED
                SMTP_TOKEN_PASSWORD_RESET -> Value.SMTP_TOKEN_PASSWORD_RESET
                SMTP_TOKEN_RETRIEVED -> Value.SMTP_TOKEN_RETRIEVED
                TEAM_ADDED -> Value.TEAM_ADDED
                TEAM_DELETED -> Value.TEAM_DELETED
                TEAM_USER_ADDED -> Value.TEAM_USER_ADDED
                TEAM_USER_DELETED -> Value.TEAM_USER_DELETED
                TEMPLATE_MODIFIED -> Value.TEMPLATE_MODIFIED
                TOUCHLESS_PURCHASE -> Value.TOUCHLESS_PURCHASE
                UNIFIED_RESTORE_UNDO_EXECUTION -> Value.UNIFIED_RESTORE_UNDO_EXECUTION
                UNINSTALL_INTEGRATION -> Value.UNINSTALL_INTEGRATION
                UNREQUIRE_SINGLE_SIGN_ON -> Value.UNREQUIRE_SINGLE_SIGN_ON
                WEBHOOK_SETTINGS_UPDATE -> Value.WEBHOOK_SETTINGS_UPDATE
                WEBHOOK_SUBSCRIPTION_CREATE -> Value.WEBHOOK_SUBSCRIPTION_CREATE
                WEBHOOK_SUBSCRIPTION_UPDATE -> Value.WEBHOOK_SUBSCRIPTION_UPDATE
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
                ACCEPTANCE_TEST -> Known.ACCEPTANCE_TEST
                ACCOUNT_ADDED_TO_MULTI_ACCOUNT_ORGANIZATION ->
                    Known.ACCOUNT_ADDED_TO_MULTI_ACCOUNT_ORGANIZATION
                ACCOUNT_REMOVED_FROM_MULTI_ACCOUNT_ORGANIZATION ->
                    Known.ACCOUNT_REMOVED_FROM_MULTI_ACCOUNT_ORGANIZATION
                ADD_ADMIN_PERMISSIONS -> Known.ADD_ADMIN_PERMISSIONS
                ADD_ADMIN_USER -> Known.ADD_ADMIN_USER
                ADD_SINGLE_SIGN_ON -> Known.ADD_SINGLE_SIGN_ON
                ADD_TWO_FACTOR_AUTHENTICATION -> Known.ADD_TWO_FACTOR_AUTHENTICATION
                ADD_USER -> Known.ADD_USER
                ADD_WEBHOOK_IN_WORKFLOW -> Known.ADD_WEBHOOK_IN_WORKFLOW
                ALLOWED_GEOLOCATIONS_DISABLED -> Known.ALLOWED_GEOLOCATIONS_DISABLED
                ALLOWED_GEOLOCATIONS_ENABLED -> Known.ALLOWED_GEOLOCATIONS_ENABLED
                ALLOWED_LOGIN_METHODS_DELETE -> Known.ALLOWED_LOGIN_METHODS_DELETE
                ALLOWED_LOGIN_METHODS_UPDATE -> Known.ALLOWED_LOGIN_METHODS_UPDATE
                ATTACHMENT_LOGGING_DISABLED -> Known.ATTACHMENT_LOGGING_DISABLED
                ATTACHMENT_LOGGING_ENABLED -> Known.ATTACHMENT_LOGGING_ENABLED
                AUTOMATED_INACTIVE_USER_DEACTIVATION_DISABLED ->
                    Known.AUTOMATED_INACTIVE_USER_DEACTIVATION_DISABLED
                AUTOMATED_INACTIVE_USER_DEACTIVATION_ENABLED ->
                    Known.AUTOMATED_INACTIVE_USER_DEACTIVATION_ENABLED
                BOTS_WEBHOOK_POST -> Known.BOTS_WEBHOOK_POST
                BOTS_WEBHOOK_UPDATE -> Known.BOTS_WEBHOOK_UPDATE
                BOTS_WEBHOOK_VIEWED -> Known.BOTS_WEBHOOK_VIEWED
                BULK_EMAIL_DOMAIN_CHANGE -> Known.BULK_EMAIL_DOMAIN_CHANGE
                CHANGE_AD_EVENT_CONSENT_SETTING -> Known.CHANGE_AD_EVENT_CONSENT_SETTING
                CHANGE_AD_EVENT_DATA_SHARING_SETTING -> Known.CHANGE_AD_EVENT_DATA_SHARING_SETTING
                CHANGE_PASSWORD -> Known.CHANGE_PASSWORD
                CONTACT_DATA_EXPORT -> Known.CONTACT_DATA_EXPORT
                DATA_ACCESS_REQUEST_SUBMITTED -> Known.DATA_ACCESS_REQUEST_SUBMITTED
                DATA_BACKUP_CREATED -> Known.DATA_BACKUP_CREATED
                DATA_BACKUP_DOWNLOADED -> Known.DATA_BACKUP_DOWNLOADED
                DATA_BACKUP_SCHEDULE_CREATED -> Known.DATA_BACKUP_SCHEDULE_CREATED
                DATA_BACKUP_SCHEDULE_DELETED -> Known.DATA_BACKUP_SCHEDULE_DELETED
                DATA_BACKUP_SCHEDULE_UPDATED -> Known.DATA_BACKUP_SCHEDULE_UPDATED
                DATA_RESTORE_COMPLETED -> Known.DATA_RESTORE_COMPLETED
                DATA_SHARING_CONNECTION_ADDED -> Known.DATA_SHARING_CONNECTION_ADDED
                DATA_SHARING_CONNECTION_REMOVED -> Known.DATA_SHARING_CONNECTION_REMOVED
                DATASET_SYNC -> Known.DATASET_SYNC
                DEACTIVATE_USER -> Known.DEACTIVATE_USER
                DOMAIN_BASED_INVITE_CREATED -> Known.DOMAIN_BASED_INVITE_CREATED
                DOMAIN_BASED_INVITE_REMOVED -> Known.DOMAIN_BASED_INVITE_REMOVED
                DOMAIN_BASED_INVITES_DISABLED -> Known.DOMAIN_BASED_INVITES_DISABLED
                DOMAIN_BASED_INVITES_ENABLED -> Known.DOMAIN_BASED_INVITES_ENABLED
                EMAIL_TRACKING_DISABLED -> Known.EMAIL_TRACKING_DISABLED
                EMAIL_TRACKING_ENABLED -> Known.EMAIL_TRACKING_ENABLED
                EXPORT -> Known.EXPORT
                EXPORT_APPROVAL -> Known.EXPORT_APPROVAL
                EXPORT_DOWNLOAD -> Known.EXPORT_DOWNLOAD
                EXPORT_USERS -> Known.EXPORT_USERS
                FORM_SUBMISSIONS_EXPORT -> Known.FORM_SUBMISSIONS_EXPORT
                GDPR_DELETE -> Known.GDPR_DELETE
                GDPR_TOGGLE_DISABLED -> Known.GDPR_TOGGLE_DISABLED
                GDPR_TOGGLE_ENABLED -> Known.GDPR_TOGGLE_ENABLED
                HAPIKEY_CREATE -> Known.HAPIKEY_CREATE
                HAPIKEY_DEACTIVATE -> Known.HAPIKEY_DEACTIVATE
                HAPIKEY_VIEW -> Known.HAPIKEY_VIEW
                HUBSPOT_EMPLOYEE_ACCESS_DISABLED -> Known.HUBSPOT_EMPLOYEE_ACCESS_DISABLED
                HUBSPOT_EMPLOYEE_ACCESS_ENABLED -> Known.HUBSPOT_EMPLOYEE_ACCESS_ENABLED
                IMPERSONATE_USER -> Known.IMPERSONATE_USER
                IMPORT -> Known.IMPORT
                INSTALL_INTEGRATION -> Known.INSTALL_INTEGRATION
                IP_RESTRICTIONS_DISABLED -> Known.IP_RESTRICTIONS_DISABLED
                IP_RESTRICTIONS_ENABLED -> Known.IP_RESTRICTIONS_ENABLED
                JOINED_PORTAL_VIA_DOMAIN_BASED_INVITE -> Known.JOINED_PORTAL_VIA_DOMAIN_BASED_INVITE
                LEGAL_BASIS_REQUIREMENT_DISABLED -> Known.LEGAL_BASIS_REQUIREMENT_DISABLED
                LEGAL_BASIS_REQUIREMENT_ENABLED -> Known.LEGAL_BASIS_REQUIREMENT_ENABLED
                MANUAL_PASSWORD_RESET_EMAIL_SEND -> Known.MANUAL_PASSWORD_RESET_EMAIL_SEND
                MANUAL_REGISTRATION_EMAIL_SEND -> Known.MANUAL_REGISTRATION_EMAIL_SEND
                MARKETING_CONTACTS_APP_SETTINGS_DISABLED ->
                    Known.MARKETING_CONTACTS_APP_SETTINGS_DISABLED
                MARKETING_CONTACTS_APP_SETTINGS_ENABLED ->
                    Known.MARKETING_CONTACTS_APP_SETTINGS_ENABLED
                MERGE_REVERT -> Known.MERGE_REVERT
                MODIFY_WEBHOOK_IN_WORKFLOW -> Known.MODIFY_WEBHOOK_IN_WORKFLOW
                MULTI_ACCOUNT_REPORTING_CONNECTION_ADDED ->
                    Known.MULTI_ACCOUNT_REPORTING_CONNECTION_ADDED
                MULTI_ACCOUNT_REPORTING_CONNECTION_REMOVED ->
                    Known.MULTI_ACCOUNT_REPORTING_CONNECTION_REMOVED
                MULTI_ACCOUNT_WORKFLOWS_CONNECTION_ADDED ->
                    Known.MULTI_ACCOUNT_WORKFLOWS_CONNECTION_ADDED
                MULTI_ACCOUNT_WORKFLOWS_CONNECTION_REMOVED ->
                    Known.MULTI_ACCOUNT_WORKFLOWS_CONNECTION_REMOVED
                NEVER_LOG_FOR_PORTAL_ADDITION -> Known.NEVER_LOG_FOR_PORTAL_ADDITION
                NEVER_LOG_FOR_PORTAL_DELETION -> Known.NEVER_LOG_FOR_PORTAL_DELETION
                NEVER_LOG_FOR_USER_ADDITION -> Known.NEVER_LOG_FOR_USER_ADDITION
                NEVER_LOG_FOR_USER_DELETION -> Known.NEVER_LOG_FOR_USER_DELETION
                PASSKEY_ADDED -> Known.PASSKEY_ADDED
                PASSKEY_DELETED -> Known.PASSKEY_DELETED
                PAYMENT_ACCOUNT_CREATION -> Known.PAYMENT_ACCOUNT_CREATION
                PAYMENT_ACCOUNT_INFO_UPDATE -> Known.PAYMENT_ACCOUNT_INFO_UPDATE
                PAYMENT_BANK_ACCOUNT_CHANGE -> Known.PAYMENT_BANK_ACCOUNT_CHANGE
                PAYMENT_ONBOARDING_LINK_SEND -> Known.PAYMENT_ONBOARDING_LINK_SEND
                PERSONAL_ACCESS_KEY_CREATE -> Known.PERSONAL_ACCESS_KEY_CREATE
                PERSONAL_ACCESS_KEY_DEACTIVATE -> Known.PERSONAL_ACCESS_KEY_DEACTIVATE
                PERSONAL_ACCESS_KEY_ROTATE -> Known.PERSONAL_ACCESS_KEY_ROTATE
                PERSONAL_ACCESS_KEY_VIEW -> Known.PERSONAL_ACCESS_KEY_VIEW
                PRIVATE_APP_ACCESS_TOKEN_CREATE -> Known.PRIVATE_APP_ACCESS_TOKEN_CREATE
                PRIVATE_APP_ACCESS_TOKEN_DEACTIVATE -> Known.PRIVATE_APP_ACCESS_TOKEN_DEACTIVATE
                PRIVATE_APP_ACCESS_TOKEN_ROTATE -> Known.PRIVATE_APP_ACCESS_TOKEN_ROTATE
                PRIVATE_APP_ACCESS_TOKEN_VIEW -> Known.PRIVATE_APP_ACCESS_TOKEN_VIEW
                PRIVATE_APP_CLIENT_SECRET_VIEW -> Known.PRIVATE_APP_CLIENT_SECRET_VIEW
                PRIVATE_APP_CLIENT_SECRET_WRITE -> Known.PRIVATE_APP_CLIENT_SECRET_WRITE
                PRIVATE_APP_SCOPE_GROUPS_UPDATE -> Known.PRIVATE_APP_SCOPE_GROUPS_UPDATE
                PRODUCTION_DEPLOYMENT -> Known.PRODUCTION_DEPLOYMENT
                PROPERTY_HISTORY_REVISION -> Known.PROPERTY_HISTORY_REVISION
                PUBLIC_APP_CLIENT_SECRET_VIEW -> Known.PUBLIC_APP_CLIENT_SECRET_VIEW
                PUBLIC_APP_CLIENT_SECRET_WRITE -> Known.PUBLIC_APP_CLIENT_SECRET_WRITE
                REACTIVATE_USER -> Known.REACTIVATE_USER
                REMOVE_ADMIN_PERMISSIONS -> Known.REMOVE_ADMIN_PERMISSIONS
                REMOVE_ADMIN_USER -> Known.REMOVE_ADMIN_USER
                REMOVE_SINGLE_SIGN_ON -> Known.REMOVE_SINGLE_SIGN_ON
                REMOVE_TWO_FACTOR_AUTHENTICATION -> Known.REMOVE_TWO_FACTOR_AUTHENTICATION
                REMOVE_USER -> Known.REMOVE_USER
                REQUIRE_SINGLE_SIGN_ON -> Known.REQUIRE_SINGLE_SIGN_ON
                RESTRICTED_LIST_ADDED_TO_CONTENT -> Known.RESTRICTED_LIST_ADDED_TO_CONTENT
                SANDBOX_CREATION -> Known.SANDBOX_CREATION
                SANDBOX_DELETION -> Known.SANDBOX_DELETION
                SANDBOX_SYNC -> Known.SANDBOX_SYNC
                SANDBOX_SYNC_TO_PRODUCTION -> Known.SANDBOX_SYNC_TO_PRODUCTION
                SECRET_ADDED_TO_SERVERLESS_FUNCTION -> Known.SECRET_ADDED_TO_SERVERLESS_FUNCTION
                SENSITIVE_DATA_DISABLED -> Known.SENSITIVE_DATA_DISABLED
                SENSITIVE_DATA_ENABLED -> Known.SENSITIVE_DATA_ENABLED
                SEQUENCE_CLONED -> Known.SEQUENCE_CLONED
                SEQUENCE_CREATED -> Known.SEQUENCE_CREATED
                SEQUENCE_ENROLLMENT_INITIATED -> Known.SEQUENCE_ENROLLMENT_INITIATED
                SEQUENCE_ENROLLMENT_STATE_CHANGED -> Known.SEQUENCE_ENROLLMENT_STATE_CHANGED
                SEQUENCE_MODIFIED -> Known.SEQUENCE_MODIFIED
                SERVICE_KEY_CREATE -> Known.SERVICE_KEY_CREATE
                SERVICE_KEY_DEACTIVATE -> Known.SERVICE_KEY_DEACTIVATE
                SERVICE_KEY_PERMISSIONS_UPDATE -> Known.SERVICE_KEY_PERMISSIONS_UPDATE
                SERVICE_KEY_REVEAL -> Known.SERVICE_KEY_REVEAL
                SERVICE_KEY_ROTATE -> Known.SERVICE_KEY_ROTATE
                SMTP_TOKEN_CREATED -> Known.SMTP_TOKEN_CREATED
                SMTP_TOKEN_DELETED -> Known.SMTP_TOKEN_DELETED
                SMTP_TOKEN_PASSWORD_RESET -> Known.SMTP_TOKEN_PASSWORD_RESET
                SMTP_TOKEN_RETRIEVED -> Known.SMTP_TOKEN_RETRIEVED
                TEAM_ADDED -> Known.TEAM_ADDED
                TEAM_DELETED -> Known.TEAM_DELETED
                TEAM_USER_ADDED -> Known.TEAM_USER_ADDED
                TEAM_USER_DELETED -> Known.TEAM_USER_DELETED
                TEMPLATE_MODIFIED -> Known.TEMPLATE_MODIFIED
                TOUCHLESS_PURCHASE -> Known.TOUCHLESS_PURCHASE
                UNIFIED_RESTORE_UNDO_EXECUTION -> Known.UNIFIED_RESTORE_UNDO_EXECUTION
                UNINSTALL_INTEGRATION -> Known.UNINSTALL_INTEGRATION
                UNREQUIRE_SINGLE_SIGN_ON -> Known.UNREQUIRE_SINGLE_SIGN_ON
                WEBHOOK_SETTINGS_UPDATE -> Known.WEBHOOK_SETTINGS_UPDATE
                WEBHOOK_SUBSCRIPTION_CREATE -> Known.WEBHOOK_SUBSCRIPTION_CREATE
                WEBHOOK_SUBSCRIPTION_UPDATE -> Known.WEBHOOK_SUBSCRIPTION_UPDATE
                else -> throw HubSpotInvalidDataException("Unknown Type: $value")
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

        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

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
