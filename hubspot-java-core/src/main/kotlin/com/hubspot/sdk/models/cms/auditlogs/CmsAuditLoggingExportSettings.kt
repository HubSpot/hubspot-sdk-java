// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.auditlogs

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.Enum
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkKnown
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.toImmutable
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CmsAuditLoggingExportSettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val email: JsonField<String>,
    private val format: JsonField<Format>,
    private val portalId: JsonField<Int>,
    private val recipientUserIds: JsonField<List<Int>>,
    private val shouldMarkExportFileAsSensitive: JsonField<Boolean>,
    private val type: JsonField<String>,
    private val filters: JsonField<CmsAuditLoggingExportFilters>,
    private val partition: JsonField<Int>,
    private val userId: JsonField<Int>,
    private val userTimeZone: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("format") @ExcludeMissing format: JsonField<Format> = JsonMissing.of(),
        @JsonProperty("portalId") @ExcludeMissing portalId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("recipientUserIds")
        @ExcludeMissing
        recipientUserIds: JsonField<List<Int>> = JsonMissing.of(),
        @JsonProperty("shouldMarkExportFileAsSensitive")
        @ExcludeMissing
        shouldMarkExportFileAsSensitive: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("filters")
        @ExcludeMissing
        filters: JsonField<CmsAuditLoggingExportFilters> = JsonMissing.of(),
        @JsonProperty("partition") @ExcludeMissing partition: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("userId") @ExcludeMissing userId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("userTimeZone")
        @ExcludeMissing
        userTimeZone: JsonField<String> = JsonMissing.of(),
    ) : this(
        email,
        format,
        portalId,
        recipientUserIds,
        shouldMarkExportFileAsSensitive,
        type,
        filters,
        partition,
        userId,
        userTimeZone,
        mutableMapOf(),
    )

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun email(): String = email.getRequired("email")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun format(): Format = format.getRequired("format")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun portalId(): Int = portalId.getRequired("portalId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recipientUserIds(): List<Int> = recipientUserIds.getRequired("recipientUserIds")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun shouldMarkExportFileAsSensitive(): Boolean =
        shouldMarkExportFileAsSensitive.getRequired("shouldMarkExportFileAsSensitive")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): String = type.getRequired("type")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filters(): Optional<CmsAuditLoggingExportFilters> = filters.getOptional("filters")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun partition(): Optional<Int> = partition.getOptional("partition")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userId(): Optional<Int> = userId.getOptional("userId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userTimeZone(): Optional<String> = userTimeZone.getOptional("userTimeZone")

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [format].
     *
     * Unlike [format], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("format") @ExcludeMissing fun _format(): JsonField<Format> = format

    /**
     * Returns the raw JSON value of [portalId].
     *
     * Unlike [portalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("portalId") @ExcludeMissing fun _portalId(): JsonField<Int> = portalId

    /**
     * Returns the raw JSON value of [recipientUserIds].
     *
     * Unlike [recipientUserIds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("recipientUserIds")
    @ExcludeMissing
    fun _recipientUserIds(): JsonField<List<Int>> = recipientUserIds

    /**
     * Returns the raw JSON value of [shouldMarkExportFileAsSensitive].
     *
     * Unlike [shouldMarkExportFileAsSensitive], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("shouldMarkExportFileAsSensitive")
    @ExcludeMissing
    fun _shouldMarkExportFileAsSensitive(): JsonField<Boolean> = shouldMarkExportFileAsSensitive

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

    /**
     * Returns the raw JSON value of [filters].
     *
     * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filters")
    @ExcludeMissing
    fun _filters(): JsonField<CmsAuditLoggingExportFilters> = filters

    /**
     * Returns the raw JSON value of [partition].
     *
     * Unlike [partition], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("partition") @ExcludeMissing fun _partition(): JsonField<Int> = partition

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("userId") @ExcludeMissing fun _userId(): JsonField<Int> = userId

    /**
     * Returns the raw JSON value of [userTimeZone].
     *
     * Unlike [userTimeZone], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("userTimeZone")
    @ExcludeMissing
    fun _userTimeZone(): JsonField<String> = userTimeZone

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
         * [CmsAuditLoggingExportSettings].
         *
         * The following fields are required:
         * ```java
         * .email()
         * .format()
         * .portalId()
         * .recipientUserIds()
         * .shouldMarkExportFileAsSensitive()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CmsAuditLoggingExportSettings]. */
    class Builder internal constructor() {

        private var email: JsonField<String>? = null
        private var format: JsonField<Format>? = null
        private var portalId: JsonField<Int>? = null
        private var recipientUserIds: JsonField<MutableList<Int>>? = null
        private var shouldMarkExportFileAsSensitive: JsonField<Boolean>? = null
        private var type: JsonField<String>? = null
        private var filters: JsonField<CmsAuditLoggingExportFilters> = JsonMissing.of()
        private var partition: JsonField<Int> = JsonMissing.of()
        private var userId: JsonField<Int> = JsonMissing.of()
        private var userTimeZone: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cmsAuditLoggingExportSettings: CmsAuditLoggingExportSettings) = apply {
            email = cmsAuditLoggingExportSettings.email
            format = cmsAuditLoggingExportSettings.format
            portalId = cmsAuditLoggingExportSettings.portalId
            recipientUserIds =
                cmsAuditLoggingExportSettings.recipientUserIds.map { it.toMutableList() }
            shouldMarkExportFileAsSensitive =
                cmsAuditLoggingExportSettings.shouldMarkExportFileAsSensitive
            type = cmsAuditLoggingExportSettings.type
            filters = cmsAuditLoggingExportSettings.filters
            partition = cmsAuditLoggingExportSettings.partition
            userId = cmsAuditLoggingExportSettings.userId
            userTimeZone = cmsAuditLoggingExportSettings.userTimeZone
            additionalProperties = cmsAuditLoggingExportSettings.additionalProperties.toMutableMap()
        }

        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        fun format(format: Format) = format(JsonField.of(format))

        /**
         * Sets [Builder.format] to an arbitrary JSON value.
         *
         * You should usually call [Builder.format] with a well-typed [Format] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun format(format: JsonField<Format>) = apply { this.format = format }

        fun portalId(portalId: Int) = portalId(JsonField.of(portalId))

        /**
         * Sets [Builder.portalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.portalId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun portalId(portalId: JsonField<Int>) = apply { this.portalId = portalId }

        fun recipientUserIds(recipientUserIds: List<Int>) =
            recipientUserIds(JsonField.of(recipientUserIds))

        /**
         * Sets [Builder.recipientUserIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recipientUserIds] with a well-typed `List<Int>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recipientUserIds(recipientUserIds: JsonField<List<Int>>) = apply {
            this.recipientUserIds = recipientUserIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [Int] to [recipientUserIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRecipientUserId(recipientUserId: Int) = apply {
            recipientUserIds =
                (recipientUserIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("recipientUserIds", it).add(recipientUserId)
                }
        }

        fun shouldMarkExportFileAsSensitive(shouldMarkExportFileAsSensitive: Boolean) =
            shouldMarkExportFileAsSensitive(JsonField.of(shouldMarkExportFileAsSensitive))

        /**
         * Sets [Builder.shouldMarkExportFileAsSensitive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shouldMarkExportFileAsSensitive] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun shouldMarkExportFileAsSensitive(shouldMarkExportFileAsSensitive: JsonField<Boolean>) =
            apply {
                this.shouldMarkExportFileAsSensitive = shouldMarkExportFileAsSensitive
            }

        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

        fun filters(filters: CmsAuditLoggingExportFilters) = filters(JsonField.of(filters))

        /**
         * Sets [Builder.filters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filters] with a well-typed
         * [CmsAuditLoggingExportFilters] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun filters(filters: JsonField<CmsAuditLoggingExportFilters>) = apply {
            this.filters = filters
        }

        fun partition(partition: Int) = partition(JsonField.of(partition))

        /**
         * Sets [Builder.partition] to an arbitrary JSON value.
         *
         * You should usually call [Builder.partition] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun partition(partition: JsonField<Int>) = apply { this.partition = partition }

        fun userId(userId: Int) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<Int>) = apply { this.userId = userId }

        fun userTimeZone(userTimeZone: String) = userTimeZone(JsonField.of(userTimeZone))

        /**
         * Sets [Builder.userTimeZone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userTimeZone] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun userTimeZone(userTimeZone: JsonField<String>) = apply {
            this.userTimeZone = userTimeZone
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
         * Returns an immutable instance of [CmsAuditLoggingExportSettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .email()
         * .format()
         * .portalId()
         * .recipientUserIds()
         * .shouldMarkExportFileAsSensitive()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CmsAuditLoggingExportSettings =
            CmsAuditLoggingExportSettings(
                checkRequired("email", email),
                checkRequired("format", format),
                checkRequired("portalId", portalId),
                checkRequired("recipientUserIds", recipientUserIds).map { it.toImmutable() },
                checkRequired("shouldMarkExportFileAsSensitive", shouldMarkExportFileAsSensitive),
                checkRequired("type", type),
                filters,
                partition,
                userId,
                userTimeZone,
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
    fun validate(): CmsAuditLoggingExportSettings = apply {
        if (validated) {
            return@apply
        }

        email()
        format().validate()
        portalId()
        recipientUserIds()
        shouldMarkExportFileAsSensitive()
        type()
        filters().ifPresent { it.validate() }
        partition()
        userId()
        userTimeZone()
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
        (if (email.asKnown().isPresent) 1 else 0) +
            (format.asKnown().getOrNull()?.validity() ?: 0) +
            (if (portalId.asKnown().isPresent) 1 else 0) +
            (recipientUserIds.asKnown().getOrNull()?.size ?: 0) +
            (if (shouldMarkExportFileAsSensitive.asKnown().isPresent) 1 else 0) +
            (if (type.asKnown().isPresent) 1 else 0) +
            (filters.asKnown().getOrNull()?.validity() ?: 0) +
            (if (partition.asKnown().isPresent) 1 else 0) +
            (if (userId.asKnown().isPresent) 1 else 0) +
            (if (userTimeZone.asKnown().isPresent) 1 else 0)

    class Format @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CSV = of("CSV")

            @JvmField val XLS = of("XLS")

            @JvmField val XLSX = of("XLSX")

            @JvmStatic fun of(value: String) = Format(JsonField.of(value))
        }

        /** An enum containing [Format]'s known values. */
        enum class Known {
            CSV,
            XLS,
            XLSX,
        }

        /**
         * An enum containing [Format]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Format] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CSV,
            XLS,
            XLSX,
            /** An enum member indicating that [Format] was instantiated with an unknown value. */
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
                CSV -> Value.CSV
                XLS -> Value.XLS
                XLSX -> Value.XLSX
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
                CSV -> Known.CSV
                XLS -> Known.XLS
                XLSX -> Known.XLSX
                else -> throw HubSpotInvalidDataException("Unknown Format: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Format = apply {
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

            return other is Format && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CmsAuditLoggingExportSettings &&
            email == other.email &&
            format == other.format &&
            portalId == other.portalId &&
            recipientUserIds == other.recipientUserIds &&
            shouldMarkExportFileAsSensitive == other.shouldMarkExportFileAsSensitive &&
            type == other.type &&
            filters == other.filters &&
            partition == other.partition &&
            userId == other.userId &&
            userTimeZone == other.userTimeZone &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            email,
            format,
            portalId,
            recipientUserIds,
            shouldMarkExportFileAsSensitive,
            type,
            filters,
            partition,
            userId,
            userTimeZone,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CmsAuditLoggingExportSettings{email=$email, format=$format, portalId=$portalId, recipientUserIds=$recipientUserIds, shouldMarkExportFileAsSensitive=$shouldMarkExportFileAsSensitive, type=$type, filters=$filters, partition=$partition, userId=$userId, userTimeZone=$userTimeZone, additionalProperties=$additionalProperties}"
}
