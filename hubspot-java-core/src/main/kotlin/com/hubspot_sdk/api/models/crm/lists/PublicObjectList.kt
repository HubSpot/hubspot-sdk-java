// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.BaseDeserializer
import com.hubspot_sdk.api.core.BaseSerializer
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.getOrThrow
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicObjectList
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val listId: JsonField<String>,
    private val listVersion: JsonField<Int>,
    private val name: JsonField<String>,
    private val objectTypeId: JsonField<String>,
    private val processingStatus: JsonField<String>,
    private val processingType: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdById: JsonField<String>,
    private val deletedAt: JsonField<OffsetDateTime>,
    private val filterBranch: JsonField<FilterBranch>,
    private val filtersUpdatedAt: JsonField<OffsetDateTime>,
    private val listPermissions: JsonField<PublicListPermissions>,
    private val membershipSettings: JsonField<PublicMembershipSettings>,
    private val size: JsonField<Long>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val updatedById: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("listId") @ExcludeMissing listId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("listVersion") @ExcludeMissing listVersion: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("objectTypeId")
        @ExcludeMissing
        objectTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("processingStatus")
        @ExcludeMissing
        processingStatus: JsonField<String> = JsonMissing.of(),
        @JsonProperty("processingType")
        @ExcludeMissing
        processingType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdById")
        @ExcludeMissing
        createdById: JsonField<String> = JsonMissing.of(),
        @JsonProperty("deletedAt")
        @ExcludeMissing
        deletedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("filterBranch")
        @ExcludeMissing
        filterBranch: JsonField<FilterBranch> = JsonMissing.of(),
        @JsonProperty("filtersUpdatedAt")
        @ExcludeMissing
        filtersUpdatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("listPermissions")
        @ExcludeMissing
        listPermissions: JsonField<PublicListPermissions> = JsonMissing.of(),
        @JsonProperty("membershipSettings")
        @ExcludeMissing
        membershipSettings: JsonField<PublicMembershipSettings> = JsonMissing.of(),
        @JsonProperty("size") @ExcludeMissing size: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedById")
        @ExcludeMissing
        updatedById: JsonField<String> = JsonMissing.of(),
    ) : this(
        listId,
        listVersion,
        name,
        objectTypeId,
        processingStatus,
        processingType,
        createdAt,
        createdById,
        deletedAt,
        filterBranch,
        filtersUpdatedAt,
        listPermissions,
        membershipSettings,
        size,
        updatedAt,
        updatedById,
        mutableMapOf(),
    )

    /**
     * The **ILS ID** of the list.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun listId(): String = listId.getRequired("listId")

    /**
     * The version of the list.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun listVersion(): Int = listVersion.getRequired("listVersion")

    /**
     * The name of the list.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * The object type of the list.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectTypeId(): String = objectTypeId.getRequired("objectTypeId")

    /**
     * The processing status of the list.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun processingStatus(): String = processingStatus.getRequired("processingStatus")

    /**
     * The processing type of the list.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun processingType(): String = processingType.getRequired("processingType")

    /**
     * The time when the list was created.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

    /**
     * The ID of the user that created the list.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdById(): Optional<String> = createdById.getOptional("createdById")

    /**
     * The time when the list was deleted.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deletedAt(): Optional<OffsetDateTime> = deletedAt.getOptional("deletedAt")

    /**
     * Defines the filter criteria for the list, allowing for complex logical operations and nested
     * filter branches to determine list membership.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filterBranch(): Optional<FilterBranch> = filterBranch.getOptional("filterBranch")

    /**
     * The time when the filters for this list were last updated.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filtersUpdatedAt(): Optional<OffsetDateTime> =
        filtersUpdatedAt.getOptional("filtersUpdatedAt")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun listPermissions(): Optional<PublicListPermissions> =
        listPermissions.getOptional("listPermissions")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun membershipSettings(): Optional<PublicMembershipSettings> =
        membershipSettings.getOptional("membershipSettings")

    /**
     * Size of the list
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun size(): Optional<Long> = size.getOptional("size")

    /**
     * The time the list was last updated.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

    /**
     * The ID of the user that last updated the list.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedById(): Optional<String> = updatedById.getOptional("updatedById")

    /**
     * Returns the raw JSON value of [listId].
     *
     * Unlike [listId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("listId") @ExcludeMissing fun _listId(): JsonField<String> = listId

    /**
     * Returns the raw JSON value of [listVersion].
     *
     * Unlike [listVersion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("listVersion") @ExcludeMissing fun _listVersion(): JsonField<Int> = listVersion

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [objectTypeId].
     *
     * Unlike [objectTypeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectTypeId")
    @ExcludeMissing
    fun _objectTypeId(): JsonField<String> = objectTypeId

    /**
     * Returns the raw JSON value of [processingStatus].
     *
     * Unlike [processingStatus], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("processingStatus")
    @ExcludeMissing
    fun _processingStatus(): JsonField<String> = processingStatus

    /**
     * Returns the raw JSON value of [processingType].
     *
     * Unlike [processingType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("processingType")
    @ExcludeMissing
    fun _processingType(): JsonField<String> = processingType

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [createdById].
     *
     * Unlike [createdById], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdById") @ExcludeMissing fun _createdById(): JsonField<String> = createdById

    /**
     * Returns the raw JSON value of [deletedAt].
     *
     * Unlike [deletedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deletedAt")
    @ExcludeMissing
    fun _deletedAt(): JsonField<OffsetDateTime> = deletedAt

    /**
     * Returns the raw JSON value of [filterBranch].
     *
     * Unlike [filterBranch], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filterBranch")
    @ExcludeMissing
    fun _filterBranch(): JsonField<FilterBranch> = filterBranch

    /**
     * Returns the raw JSON value of [filtersUpdatedAt].
     *
     * Unlike [filtersUpdatedAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("filtersUpdatedAt")
    @ExcludeMissing
    fun _filtersUpdatedAt(): JsonField<OffsetDateTime> = filtersUpdatedAt

    /**
     * Returns the raw JSON value of [listPermissions].
     *
     * Unlike [listPermissions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("listPermissions")
    @ExcludeMissing
    fun _listPermissions(): JsonField<PublicListPermissions> = listPermissions

    /**
     * Returns the raw JSON value of [membershipSettings].
     *
     * Unlike [membershipSettings], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("membershipSettings")
    @ExcludeMissing
    fun _membershipSettings(): JsonField<PublicMembershipSettings> = membershipSettings

    /**
     * Returns the raw JSON value of [size].
     *
     * Unlike [size], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("size") @ExcludeMissing fun _size(): JsonField<Long> = size

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [updatedById].
     *
     * Unlike [updatedById], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedById") @ExcludeMissing fun _updatedById(): JsonField<String> = updatedById

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
         * Returns a mutable builder for constructing an instance of [PublicObjectList].
         *
         * The following fields are required:
         * ```java
         * .listId()
         * .listVersion()
         * .name()
         * .objectTypeId()
         * .processingStatus()
         * .processingType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicObjectList]. */
    class Builder internal constructor() {

        private var listId: JsonField<String>? = null
        private var listVersion: JsonField<Int>? = null
        private var name: JsonField<String>? = null
        private var objectTypeId: JsonField<String>? = null
        private var processingStatus: JsonField<String>? = null
        private var processingType: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdById: JsonField<String> = JsonMissing.of()
        private var deletedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var filterBranch: JsonField<FilterBranch> = JsonMissing.of()
        private var filtersUpdatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var listPermissions: JsonField<PublicListPermissions> = JsonMissing.of()
        private var membershipSettings: JsonField<PublicMembershipSettings> = JsonMissing.of()
        private var size: JsonField<Long> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedById: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicObjectList: PublicObjectList) = apply {
            listId = publicObjectList.listId
            listVersion = publicObjectList.listVersion
            name = publicObjectList.name
            objectTypeId = publicObjectList.objectTypeId
            processingStatus = publicObjectList.processingStatus
            processingType = publicObjectList.processingType
            createdAt = publicObjectList.createdAt
            createdById = publicObjectList.createdById
            deletedAt = publicObjectList.deletedAt
            filterBranch = publicObjectList.filterBranch
            filtersUpdatedAt = publicObjectList.filtersUpdatedAt
            listPermissions = publicObjectList.listPermissions
            membershipSettings = publicObjectList.membershipSettings
            size = publicObjectList.size
            updatedAt = publicObjectList.updatedAt
            updatedById = publicObjectList.updatedById
            additionalProperties = publicObjectList.additionalProperties.toMutableMap()
        }

        /** The **ILS ID** of the list. */
        fun listId(listId: String) = listId(JsonField.of(listId))

        /**
         * Sets [Builder.listId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.listId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun listId(listId: JsonField<String>) = apply { this.listId = listId }

        /** The version of the list. */
        fun listVersion(listVersion: Int) = listVersion(JsonField.of(listVersion))

        /**
         * Sets [Builder.listVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.listVersion] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun listVersion(listVersion: JsonField<Int>) = apply { this.listVersion = listVersion }

        /** The name of the list. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The object type of the list. */
        fun objectTypeId(objectTypeId: String) = objectTypeId(JsonField.of(objectTypeId))

        /**
         * Sets [Builder.objectTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectTypeId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun objectTypeId(objectTypeId: JsonField<String>) = apply {
            this.objectTypeId = objectTypeId
        }

        /** The processing status of the list. */
        fun processingStatus(processingStatus: String) =
            processingStatus(JsonField.of(processingStatus))

        /**
         * Sets [Builder.processingStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.processingStatus] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun processingStatus(processingStatus: JsonField<String>) = apply {
            this.processingStatus = processingStatus
        }

        /** The processing type of the list. */
        fun processingType(processingType: String) = processingType(JsonField.of(processingType))

        /**
         * Sets [Builder.processingType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.processingType] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun processingType(processingType: JsonField<String>) = apply {
            this.processingType = processingType
        }

        /** The time when the list was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The ID of the user that created the list. */
        fun createdById(createdById: String) = createdById(JsonField.of(createdById))

        /**
         * Sets [Builder.createdById] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdById] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdById(createdById: JsonField<String>) = apply { this.createdById = createdById }

        /** The time when the list was deleted. */
        fun deletedAt(deletedAt: OffsetDateTime) = deletedAt(JsonField.of(deletedAt))

        /**
         * Sets [Builder.deletedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deletedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun deletedAt(deletedAt: JsonField<OffsetDateTime>) = apply { this.deletedAt = deletedAt }

        /**
         * Defines the filter criteria for the list, allowing for complex logical operations and
         * nested filter branches to determine list membership.
         */
        fun filterBranch(filterBranch: FilterBranch) = filterBranch(JsonField.of(filterBranch))

        /**
         * Sets [Builder.filterBranch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filterBranch] with a well-typed [FilterBranch] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun filterBranch(filterBranch: JsonField<FilterBranch>) = apply {
            this.filterBranch = filterBranch
        }

        /** Alias for calling [filterBranch] with `FilterBranch.ofOr(or)`. */
        fun filterBranch(or: PublicOrFilterBranch) = filterBranch(FilterBranch.ofOr(or))

        /** Alias for calling [filterBranch] with `FilterBranch.ofAnd(and)`. */
        fun filterBranch(and: PublicAndFilterBranch) = filterBranch(FilterBranch.ofAnd(and))

        /** Alias for calling [filterBranch] with `FilterBranch.ofNotAll(notAll)`. */
        fun filterBranch(notAll: PublicNotAllFilterBranch) =
            filterBranch(FilterBranch.ofNotAll(notAll))

        /** Alias for calling [filterBranch] with `FilterBranch.ofNotAny(notAny)`. */
        fun filterBranch(notAny: PublicNotAnyFilterBranch) =
            filterBranch(FilterBranch.ofNotAny(notAny))

        /** Alias for calling [filterBranch] with `FilterBranch.ofRestricted(restricted)`. */
        fun filterBranch(restricted: PublicRestrictedFilterBranch) =
            filterBranch(FilterBranch.ofRestricted(restricted))

        /** Alias for calling [filterBranch] with `FilterBranch.ofUnifiedEvents(unifiedEvents)`. */
        fun filterBranch(unifiedEvents: PublicUnifiedEventsFilterBranch) =
            filterBranch(FilterBranch.ofUnifiedEvents(unifiedEvents))

        /**
         * Alias for calling [filterBranch] with
         * `FilterBranch.ofPropertyAssociation(propertyAssociation)`.
         */
        fun filterBranch(propertyAssociation: PublicPropertyAssociationFilterBranch) =
            filterBranch(FilterBranch.ofPropertyAssociation(propertyAssociation))

        /** Alias for calling [filterBranch] with `FilterBranch.ofAssociation(association)`. */
        fun filterBranch(association: PublicAssociationFilterBranch) =
            filterBranch(FilterBranch.ofAssociation(association))

        /** The time when the filters for this list were last updated. */
        fun filtersUpdatedAt(filtersUpdatedAt: OffsetDateTime) =
            filtersUpdatedAt(JsonField.of(filtersUpdatedAt))

        /**
         * Sets [Builder.filtersUpdatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filtersUpdatedAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun filtersUpdatedAt(filtersUpdatedAt: JsonField<OffsetDateTime>) = apply {
            this.filtersUpdatedAt = filtersUpdatedAt
        }

        fun listPermissions(listPermissions: PublicListPermissions) =
            listPermissions(JsonField.of(listPermissions))

        /**
         * Sets [Builder.listPermissions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.listPermissions] with a well-typed
         * [PublicListPermissions] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun listPermissions(listPermissions: JsonField<PublicListPermissions>) = apply {
            this.listPermissions = listPermissions
        }

        fun membershipSettings(membershipSettings: PublicMembershipSettings) =
            membershipSettings(JsonField.of(membershipSettings))

        /**
         * Sets [Builder.membershipSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.membershipSettings] with a well-typed
         * [PublicMembershipSettings] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun membershipSettings(membershipSettings: JsonField<PublicMembershipSettings>) = apply {
            this.membershipSettings = membershipSettings
        }

        /** Size of the list */
        fun size(size: Long) = size(JsonField.of(size))

        /**
         * Sets [Builder.size] to an arbitrary JSON value.
         *
         * You should usually call [Builder.size] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun size(size: JsonField<Long>) = apply { this.size = size }

        /** The time the list was last updated. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** The ID of the user that last updated the list. */
        fun updatedById(updatedById: String) = updatedById(JsonField.of(updatedById))

        /**
         * Sets [Builder.updatedById] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedById] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedById(updatedById: JsonField<String>) = apply { this.updatedById = updatedById }

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
         * Returns an immutable instance of [PublicObjectList].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .listId()
         * .listVersion()
         * .name()
         * .objectTypeId()
         * .processingStatus()
         * .processingType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicObjectList =
            PublicObjectList(
                checkRequired("listId", listId),
                checkRequired("listVersion", listVersion),
                checkRequired("name", name),
                checkRequired("objectTypeId", objectTypeId),
                checkRequired("processingStatus", processingStatus),
                checkRequired("processingType", processingType),
                createdAt,
                createdById,
                deletedAt,
                filterBranch,
                filtersUpdatedAt,
                listPermissions,
                membershipSettings,
                size,
                updatedAt,
                updatedById,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicObjectList = apply {
        if (validated) {
            return@apply
        }

        listId()
        listVersion()
        name()
        objectTypeId()
        processingStatus()
        processingType()
        createdAt()
        createdById()
        deletedAt()
        filterBranch().ifPresent { it.validate() }
        filtersUpdatedAt()
        listPermissions().ifPresent { it.validate() }
        membershipSettings().ifPresent { it.validate() }
        size()
        updatedAt()
        updatedById()
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
        (if (listId.asKnown().isPresent) 1 else 0) +
            (if (listVersion.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (objectTypeId.asKnown().isPresent) 1 else 0) +
            (if (processingStatus.asKnown().isPresent) 1 else 0) +
            (if (processingType.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdById.asKnown().isPresent) 1 else 0) +
            (if (deletedAt.asKnown().isPresent) 1 else 0) +
            (filterBranch.asKnown().getOrNull()?.validity() ?: 0) +
            (if (filtersUpdatedAt.asKnown().isPresent) 1 else 0) +
            (listPermissions.asKnown().getOrNull()?.validity() ?: 0) +
            (membershipSettings.asKnown().getOrNull()?.validity() ?: 0) +
            (if (size.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedById.asKnown().isPresent) 1 else 0)

    /**
     * Defines the filter criteria for the list, allowing for complex logical operations and nested
     * filter branches to determine list membership.
     */
    @JsonDeserialize(using = FilterBranch.Deserializer::class)
    @JsonSerialize(using = FilterBranch.Serializer::class)
    class FilterBranch
    private constructor(
        private val or: PublicOrFilterBranch? = null,
        private val and: PublicAndFilterBranch? = null,
        private val notAll: PublicNotAllFilterBranch? = null,
        private val notAny: PublicNotAnyFilterBranch? = null,
        private val restricted: PublicRestrictedFilterBranch? = null,
        private val unifiedEvents: PublicUnifiedEventsFilterBranch? = null,
        private val propertyAssociation: PublicPropertyAssociationFilterBranch? = null,
        private val association: PublicAssociationFilterBranch? = null,
        private val _json: JsonValue? = null,
    ) {

        fun or(): Optional<PublicOrFilterBranch> = Optional.ofNullable(or)

        fun and(): Optional<PublicAndFilterBranch> = Optional.ofNullable(and)

        fun notAll(): Optional<PublicNotAllFilterBranch> = Optional.ofNullable(notAll)

        fun notAny(): Optional<PublicNotAnyFilterBranch> = Optional.ofNullable(notAny)

        fun restricted(): Optional<PublicRestrictedFilterBranch> = Optional.ofNullable(restricted)

        fun unifiedEvents(): Optional<PublicUnifiedEventsFilterBranch> =
            Optional.ofNullable(unifiedEvents)

        fun propertyAssociation(): Optional<PublicPropertyAssociationFilterBranch> =
            Optional.ofNullable(propertyAssociation)

        fun association(): Optional<PublicAssociationFilterBranch> =
            Optional.ofNullable(association)

        fun isOr(): Boolean = or != null

        fun isAnd(): Boolean = and != null

        fun isNotAll(): Boolean = notAll != null

        fun isNotAny(): Boolean = notAny != null

        fun isRestricted(): Boolean = restricted != null

        fun isUnifiedEvents(): Boolean = unifiedEvents != null

        fun isPropertyAssociation(): Boolean = propertyAssociation != null

        fun isAssociation(): Boolean = association != null

        fun asOr(): PublicOrFilterBranch = or.getOrThrow("or")

        fun asAnd(): PublicAndFilterBranch = and.getOrThrow("and")

        fun asNotAll(): PublicNotAllFilterBranch = notAll.getOrThrow("notAll")

        fun asNotAny(): PublicNotAnyFilterBranch = notAny.getOrThrow("notAny")

        fun asRestricted(): PublicRestrictedFilterBranch = restricted.getOrThrow("restricted")

        fun asUnifiedEvents(): PublicUnifiedEventsFilterBranch =
            unifiedEvents.getOrThrow("unifiedEvents")

        fun asPropertyAssociation(): PublicPropertyAssociationFilterBranch =
            propertyAssociation.getOrThrow("propertyAssociation")

        fun asAssociation(): PublicAssociationFilterBranch = association.getOrThrow("association")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                or != null -> visitor.visitOr(or)
                and != null -> visitor.visitAnd(and)
                notAll != null -> visitor.visitNotAll(notAll)
                notAny != null -> visitor.visitNotAny(notAny)
                restricted != null -> visitor.visitRestricted(restricted)
                unifiedEvents != null -> visitor.visitUnifiedEvents(unifiedEvents)
                propertyAssociation != null -> visitor.visitPropertyAssociation(propertyAssociation)
                association != null -> visitor.visitAssociation(association)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): FilterBranch = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitOr(or: PublicOrFilterBranch) {
                        or.validate()
                    }

                    override fun visitAnd(and: PublicAndFilterBranch) {
                        and.validate()
                    }

                    override fun visitNotAll(notAll: PublicNotAllFilterBranch) {
                        notAll.validate()
                    }

                    override fun visitNotAny(notAny: PublicNotAnyFilterBranch) {
                        notAny.validate()
                    }

                    override fun visitRestricted(restricted: PublicRestrictedFilterBranch) {
                        restricted.validate()
                    }

                    override fun visitUnifiedEvents(
                        unifiedEvents: PublicUnifiedEventsFilterBranch
                    ) {
                        unifiedEvents.validate()
                    }

                    override fun visitPropertyAssociation(
                        propertyAssociation: PublicPropertyAssociationFilterBranch
                    ) {
                        propertyAssociation.validate()
                    }

                    override fun visitAssociation(association: PublicAssociationFilterBranch) {
                        association.validate()
                    }
                }
            )
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
        @JvmSynthetic
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitOr(or: PublicOrFilterBranch) = or.validity()

                    override fun visitAnd(and: PublicAndFilterBranch) = and.validity()

                    override fun visitNotAll(notAll: PublicNotAllFilterBranch) = notAll.validity()

                    override fun visitNotAny(notAny: PublicNotAnyFilterBranch) = notAny.validity()

                    override fun visitRestricted(restricted: PublicRestrictedFilterBranch) =
                        restricted.validity()

                    override fun visitUnifiedEvents(
                        unifiedEvents: PublicUnifiedEventsFilterBranch
                    ) = unifiedEvents.validity()

                    override fun visitPropertyAssociation(
                        propertyAssociation: PublicPropertyAssociationFilterBranch
                    ) = propertyAssociation.validity()

                    override fun visitAssociation(association: PublicAssociationFilterBranch) =
                        association.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FilterBranch &&
                or == other.or &&
                and == other.and &&
                notAll == other.notAll &&
                notAny == other.notAny &&
                restricted == other.restricted &&
                unifiedEvents == other.unifiedEvents &&
                propertyAssociation == other.propertyAssociation &&
                association == other.association
        }

        override fun hashCode(): Int =
            Objects.hash(
                or,
                and,
                notAll,
                notAny,
                restricted,
                unifiedEvents,
                propertyAssociation,
                association,
            )

        override fun toString(): String =
            when {
                or != null -> "FilterBranch{or=$or}"
                and != null -> "FilterBranch{and=$and}"
                notAll != null -> "FilterBranch{notAll=$notAll}"
                notAny != null -> "FilterBranch{notAny=$notAny}"
                restricted != null -> "FilterBranch{restricted=$restricted}"
                unifiedEvents != null -> "FilterBranch{unifiedEvents=$unifiedEvents}"
                propertyAssociation != null ->
                    "FilterBranch{propertyAssociation=$propertyAssociation}"
                association != null -> "FilterBranch{association=$association}"
                _json != null -> "FilterBranch{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid FilterBranch")
            }

        companion object {

            @JvmStatic fun ofOr(or: PublicOrFilterBranch) = FilterBranch(or = or)

            @JvmStatic fun ofAnd(and: PublicAndFilterBranch) = FilterBranch(and = and)

            @JvmStatic
            fun ofNotAll(notAll: PublicNotAllFilterBranch) = FilterBranch(notAll = notAll)

            @JvmStatic
            fun ofNotAny(notAny: PublicNotAnyFilterBranch) = FilterBranch(notAny = notAny)

            @JvmStatic
            fun ofRestricted(restricted: PublicRestrictedFilterBranch) =
                FilterBranch(restricted = restricted)

            @JvmStatic
            fun ofUnifiedEvents(unifiedEvents: PublicUnifiedEventsFilterBranch) =
                FilterBranch(unifiedEvents = unifiedEvents)

            @JvmStatic
            fun ofPropertyAssociation(propertyAssociation: PublicPropertyAssociationFilterBranch) =
                FilterBranch(propertyAssociation = propertyAssociation)

            @JvmStatic
            fun ofAssociation(association: PublicAssociationFilterBranch) =
                FilterBranch(association = association)
        }

        /**
         * An interface that defines how to map each variant of [FilterBranch] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitOr(or: PublicOrFilterBranch): T

            fun visitAnd(and: PublicAndFilterBranch): T

            fun visitNotAll(notAll: PublicNotAllFilterBranch): T

            fun visitNotAny(notAny: PublicNotAnyFilterBranch): T

            fun visitRestricted(restricted: PublicRestrictedFilterBranch): T

            fun visitUnifiedEvents(unifiedEvents: PublicUnifiedEventsFilterBranch): T

            fun visitPropertyAssociation(
                propertyAssociation: PublicPropertyAssociationFilterBranch
            ): T

            fun visitAssociation(association: PublicAssociationFilterBranch): T

            /**
             * Maps an unknown variant of [FilterBranch] to a value of type [T].
             *
             * An instance of [FilterBranch] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws HubSpotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubSpotInvalidDataException("Unknown FilterBranch: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<FilterBranch>(FilterBranch::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): FilterBranch {
                val json = JsonValue.fromJsonNode(node)
                val filterBranchType =
                    json.asObject().getOrNull()?.get("filterBranchType")?.asString()?.getOrNull()

                when (filterBranchType) {
                    "OR" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicOrFilterBranch>())?.let {
                            FilterBranch(or = it, _json = json)
                        } ?: FilterBranch(_json = json)
                    }
                    "AND" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicAndFilterBranch>())?.let {
                            FilterBranch(and = it, _json = json)
                        } ?: FilterBranch(_json = json)
                    }
                    "NOT_ALL" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicNotAllFilterBranch>())
                            ?.let { FilterBranch(notAll = it, _json = json) }
                            ?: FilterBranch(_json = json)
                    }
                    "NOT_ANY" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicNotAnyFilterBranch>())
                            ?.let { FilterBranch(notAny = it, _json = json) }
                            ?: FilterBranch(_json = json)
                    }
                    "RESTRICTED" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicRestrictedFilterBranch>())
                            ?.let { FilterBranch(restricted = it, _json = json) }
                            ?: FilterBranch(_json = json)
                    }
                    "UNIFIED_EVENTS" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PublicUnifiedEventsFilterBranch>(),
                            )
                            ?.let { FilterBranch(unifiedEvents = it, _json = json) }
                            ?: FilterBranch(_json = json)
                    }
                    "PROPERTY_ASSOCIATION" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PublicPropertyAssociationFilterBranch>(),
                            )
                            ?.let { FilterBranch(propertyAssociation = it, _json = json) }
                            ?: FilterBranch(_json = json)
                    }
                    "ASSOCIATION" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicAssociationFilterBranch>())
                            ?.let { FilterBranch(association = it, _json = json) }
                            ?: FilterBranch(_json = json)
                    }
                }

                return FilterBranch(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<FilterBranch>(FilterBranch::class) {

            override fun serialize(
                value: FilterBranch,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.or != null -> generator.writeObject(value.or)
                    value.and != null -> generator.writeObject(value.and)
                    value.notAll != null -> generator.writeObject(value.notAll)
                    value.notAny != null -> generator.writeObject(value.notAny)
                    value.restricted != null -> generator.writeObject(value.restricted)
                    value.unifiedEvents != null -> generator.writeObject(value.unifiedEvents)
                    value.propertyAssociation != null ->
                        generator.writeObject(value.propertyAssociation)
                    value.association != null -> generator.writeObject(value.association)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid FilterBranch")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicObjectList &&
            listId == other.listId &&
            listVersion == other.listVersion &&
            name == other.name &&
            objectTypeId == other.objectTypeId &&
            processingStatus == other.processingStatus &&
            processingType == other.processingType &&
            createdAt == other.createdAt &&
            createdById == other.createdById &&
            deletedAt == other.deletedAt &&
            filterBranch == other.filterBranch &&
            filtersUpdatedAt == other.filtersUpdatedAt &&
            listPermissions == other.listPermissions &&
            membershipSettings == other.membershipSettings &&
            size == other.size &&
            updatedAt == other.updatedAt &&
            updatedById == other.updatedById &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            listId,
            listVersion,
            name,
            objectTypeId,
            processingStatus,
            processingType,
            createdAt,
            createdById,
            deletedAt,
            filterBranch,
            filtersUpdatedAt,
            listPermissions,
            membershipSettings,
            size,
            updatedAt,
            updatedById,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicObjectList{listId=$listId, listVersion=$listVersion, name=$name, objectTypeId=$objectTypeId, processingStatus=$processingStatus, processingType=$processingType, createdAt=$createdAt, createdById=$createdById, deletedAt=$deletedAt, filterBranch=$filterBranch, filtersUpdatedAt=$filtersUpdatedAt, listPermissions=$listPermissions, membershipSettings=$membershipSettings, size=$size, updatedAt=$updatedAt, updatedById=$updatedById, additionalProperties=$additionalProperties}"
}
