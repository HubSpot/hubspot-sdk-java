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
import com.hubspot_sdk.api.core.allMaxBy
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.getOrThrow
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import com.hubspot_sdk.api.models.PublicAndFilterBranch
import com.hubspot_sdk.api.models.PublicAssociationFilterBranch
import com.hubspot_sdk.api.models.PublicNotAllFilterBranch
import com.hubspot_sdk.api.models.PublicNotAnyFilterBranch
import com.hubspot_sdk.api.models.PublicOrFilterBranch
import com.hubspot_sdk.api.models.PublicPropertyAssociationFilterBranch
import com.hubspot_sdk.api.models.PublicRestrictedFilterBranch
import com.hubspot_sdk.api.models.PublicUnifiedEventsFilterBranch
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** The request object used when creating a new object list. */
class ListCreateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val name: JsonField<String>,
    private val objectTypeId: JsonField<String>,
    private val processingType: JsonField<String>,
    private val customProperties: JsonField<CustomProperties>,
    private val filterBranch: JsonField<FilterBranch>,
    private val listFolderId: JsonField<Int>,
    private val listPermissions: JsonField<PublicListPermissions>,
    private val membershipSettings: JsonField<PublicMembershipSettings>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("objectTypeId")
        @ExcludeMissing
        objectTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("processingType")
        @ExcludeMissing
        processingType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customProperties")
        @ExcludeMissing
        customProperties: JsonField<CustomProperties> = JsonMissing.of(),
        @JsonProperty("filterBranch")
        @ExcludeMissing
        filterBranch: JsonField<FilterBranch> = JsonMissing.of(),
        @JsonProperty("listFolderId")
        @ExcludeMissing
        listFolderId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("listPermissions")
        @ExcludeMissing
        listPermissions: JsonField<PublicListPermissions> = JsonMissing.of(),
        @JsonProperty("membershipSettings")
        @ExcludeMissing
        membershipSettings: JsonField<PublicMembershipSettings> = JsonMissing.of(),
    ) : this(
        name,
        objectTypeId,
        processingType,
        customProperties,
        filterBranch,
        listFolderId,
        listPermissions,
        membershipSettings,
        mutableMapOf(),
    )

    /**
     * The name of the list, which must be globally unique across all public lists in the portal.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * The object type ID of the type of objects that the list will store.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectTypeId(): String = objectTypeId.getRequired("objectTypeId")

    /**
     * The processing type of the list. One of: `SNAPSHOT`, `MANUAL`, or `DYNAMIC`.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun processingType(): String = processingType.getRequired("processingType")

    /**
     * The list of custom properties to tie to the list. Custom property name is the key, the value
     * is the value.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customProperties(): Optional<CustomProperties> =
        customProperties.getOptional("customProperties")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filterBranch(): Optional<FilterBranch> = filterBranch.getOptional("filterBranch")

    /**
     * The ID of the folder that the list should be created in. If left blank, then the list will be
     * created in the root of the list folder structure.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun listFolderId(): Optional<Int> = listFolderId.getOptional("listFolderId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun listPermissions(): Optional<PublicListPermissions> =
        listPermissions.getOptional("listPermissions")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun membershipSettings(): Optional<PublicMembershipSettings> =
        membershipSettings.getOptional("membershipSettings")

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
     * Returns the raw JSON value of [processingType].
     *
     * Unlike [processingType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("processingType")
    @ExcludeMissing
    fun _processingType(): JsonField<String> = processingType

    /**
     * Returns the raw JSON value of [customProperties].
     *
     * Unlike [customProperties], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("customProperties")
    @ExcludeMissing
    fun _customProperties(): JsonField<CustomProperties> = customProperties

    /**
     * Returns the raw JSON value of [filterBranch].
     *
     * Unlike [filterBranch], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filterBranch")
    @ExcludeMissing
    fun _filterBranch(): JsonField<FilterBranch> = filterBranch

    /**
     * Returns the raw JSON value of [listFolderId].
     *
     * Unlike [listFolderId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("listFolderId") @ExcludeMissing fun _listFolderId(): JsonField<Int> = listFolderId

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
         * Returns a mutable builder for constructing an instance of [ListCreateRequest].
         *
         * The following fields are required:
         * ```java
         * .name()
         * .objectTypeId()
         * .processingType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ListCreateRequest]. */
    class Builder internal constructor() {

        private var name: JsonField<String>? = null
        private var objectTypeId: JsonField<String>? = null
        private var processingType: JsonField<String>? = null
        private var customProperties: JsonField<CustomProperties> = JsonMissing.of()
        private var filterBranch: JsonField<FilterBranch> = JsonMissing.of()
        private var listFolderId: JsonField<Int> = JsonMissing.of()
        private var listPermissions: JsonField<PublicListPermissions> = JsonMissing.of()
        private var membershipSettings: JsonField<PublicMembershipSettings> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(listCreateRequest: ListCreateRequest) = apply {
            name = listCreateRequest.name
            objectTypeId = listCreateRequest.objectTypeId
            processingType = listCreateRequest.processingType
            customProperties = listCreateRequest.customProperties
            filterBranch = listCreateRequest.filterBranch
            listFolderId = listCreateRequest.listFolderId
            listPermissions = listCreateRequest.listPermissions
            membershipSettings = listCreateRequest.membershipSettings
            additionalProperties = listCreateRequest.additionalProperties.toMutableMap()
        }

        /**
         * The name of the list, which must be globally unique across all public lists in the
         * portal.
         */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The object type ID of the type of objects that the list will store. */
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

        /** The processing type of the list. One of: `SNAPSHOT`, `MANUAL`, or `DYNAMIC`. */
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

        /**
         * The list of custom properties to tie to the list. Custom property name is the key, the
         * value is the value.
         */
        fun customProperties(customProperties: CustomProperties) =
            customProperties(JsonField.of(customProperties))

        /**
         * Sets [Builder.customProperties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customProperties] with a well-typed [CustomProperties]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun customProperties(customProperties: JsonField<CustomProperties>) = apply {
            this.customProperties = customProperties
        }

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

        /** Alias for calling [filterBranch] with `FilterBranch.ofPublicOr(publicOr)`. */
        fun filterBranch(publicOr: PublicOrFilterBranch) =
            filterBranch(FilterBranch.ofPublicOr(publicOr))

        /** Alias for calling [filterBranch] with `FilterBranch.ofPublicAnd(publicAnd)`. */
        fun filterBranch(publicAnd: PublicAndFilterBranch) =
            filterBranch(FilterBranch.ofPublicAnd(publicAnd))

        /** Alias for calling [filterBranch] with `FilterBranch.ofPublicNotAll(publicNotAll)`. */
        fun filterBranch(publicNotAll: PublicNotAllFilterBranch) =
            filterBranch(FilterBranch.ofPublicNotAll(publicNotAll))

        /** Alias for calling [filterBranch] with `FilterBranch.ofPublicNotAny(publicNotAny)`. */
        fun filterBranch(publicNotAny: PublicNotAnyFilterBranch) =
            filterBranch(FilterBranch.ofPublicNotAny(publicNotAny))

        /**
         * Alias for calling [filterBranch] with
         * `FilterBranch.ofPublicRestricted(publicRestricted)`.
         */
        fun filterBranch(publicRestricted: PublicRestrictedFilterBranch) =
            filterBranch(FilterBranch.ofPublicRestricted(publicRestricted))

        /**
         * Alias for calling [filterBranch] with
         * `FilterBranch.ofPublicUnifiedEvents(publicUnifiedEvents)`.
         */
        fun filterBranch(publicUnifiedEvents: PublicUnifiedEventsFilterBranch) =
            filterBranch(FilterBranch.ofPublicUnifiedEvents(publicUnifiedEvents))

        /**
         * Alias for calling [filterBranch] with
         * `FilterBranch.ofPublicPropertyAssociation(publicPropertyAssociation)`.
         */
        fun filterBranch(publicPropertyAssociation: PublicPropertyAssociationFilterBranch) =
            filterBranch(FilterBranch.ofPublicPropertyAssociation(publicPropertyAssociation))

        /**
         * Alias for calling [filterBranch] with
         * `FilterBranch.ofPublicAssociation(publicAssociation)`.
         */
        fun filterBranch(publicAssociation: PublicAssociationFilterBranch) =
            filterBranch(FilterBranch.ofPublicAssociation(publicAssociation))

        /**
         * The ID of the folder that the list should be created in. If left blank, then the list
         * will be created in the root of the list folder structure.
         */
        fun listFolderId(listFolderId: Int) = listFolderId(JsonField.of(listFolderId))

        /**
         * Sets [Builder.listFolderId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.listFolderId] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun listFolderId(listFolderId: JsonField<Int>) = apply { this.listFolderId = listFolderId }

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
         * Returns an immutable instance of [ListCreateRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .name()
         * .objectTypeId()
         * .processingType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ListCreateRequest =
            ListCreateRequest(
                checkRequired("name", name),
                checkRequired("objectTypeId", objectTypeId),
                checkRequired("processingType", processingType),
                customProperties,
                filterBranch,
                listFolderId,
                listPermissions,
                membershipSettings,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ListCreateRequest = apply {
        if (validated) {
            return@apply
        }

        name()
        objectTypeId()
        processingType()
        customProperties().ifPresent { it.validate() }
        filterBranch().ifPresent { it.validate() }
        listFolderId()
        listPermissions().ifPresent { it.validate() }
        membershipSettings().ifPresent { it.validate() }
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
        (if (name.asKnown().isPresent) 1 else 0) +
            (if (objectTypeId.asKnown().isPresent) 1 else 0) +
            (if (processingType.asKnown().isPresent) 1 else 0) +
            (customProperties.asKnown().getOrNull()?.validity() ?: 0) +
            (filterBranch.asKnown().getOrNull()?.validity() ?: 0) +
            (if (listFolderId.asKnown().isPresent) 1 else 0) +
            (listPermissions.asKnown().getOrNull()?.validity() ?: 0) +
            (membershipSettings.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * The list of custom properties to tie to the list. Custom property name is the key, the value
     * is the value.
     */
    class CustomProperties
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [CustomProperties]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CustomProperties]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customProperties: CustomProperties) = apply {
                additionalProperties = customProperties.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [CustomProperties].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CustomProperties = CustomProperties(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): CustomProperties = apply {
            if (validated) {
                return@apply
            }

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
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CustomProperties && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "CustomProperties{additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = FilterBranch.Deserializer::class)
    @JsonSerialize(using = FilterBranch.Serializer::class)
    class FilterBranch
    private constructor(
        private val publicOr: PublicOrFilterBranch? = null,
        private val publicAnd: PublicAndFilterBranch? = null,
        private val publicNotAll: PublicNotAllFilterBranch? = null,
        private val publicNotAny: PublicNotAnyFilterBranch? = null,
        private val publicRestricted: PublicRestrictedFilterBranch? = null,
        private val publicUnifiedEvents: PublicUnifiedEventsFilterBranch? = null,
        private val publicPropertyAssociation: PublicPropertyAssociationFilterBranch? = null,
        private val publicAssociation: PublicAssociationFilterBranch? = null,
        private val _json: JsonValue? = null,
    ) {

        fun publicOr(): Optional<PublicOrFilterBranch> = Optional.ofNullable(publicOr)

        fun publicAnd(): Optional<PublicAndFilterBranch> = Optional.ofNullable(publicAnd)

        fun publicNotAll(): Optional<PublicNotAllFilterBranch> = Optional.ofNullable(publicNotAll)

        fun publicNotAny(): Optional<PublicNotAnyFilterBranch> = Optional.ofNullable(publicNotAny)

        fun publicRestricted(): Optional<PublicRestrictedFilterBranch> =
            Optional.ofNullable(publicRestricted)

        fun publicUnifiedEvents(): Optional<PublicUnifiedEventsFilterBranch> =
            Optional.ofNullable(publicUnifiedEvents)

        fun publicPropertyAssociation(): Optional<PublicPropertyAssociationFilterBranch> =
            Optional.ofNullable(publicPropertyAssociation)

        fun publicAssociation(): Optional<PublicAssociationFilterBranch> =
            Optional.ofNullable(publicAssociation)

        fun isPublicOr(): Boolean = publicOr != null

        fun isPublicAnd(): Boolean = publicAnd != null

        fun isPublicNotAll(): Boolean = publicNotAll != null

        fun isPublicNotAny(): Boolean = publicNotAny != null

        fun isPublicRestricted(): Boolean = publicRestricted != null

        fun isPublicUnifiedEvents(): Boolean = publicUnifiedEvents != null

        fun isPublicPropertyAssociation(): Boolean = publicPropertyAssociation != null

        fun isPublicAssociation(): Boolean = publicAssociation != null

        fun asPublicOr(): PublicOrFilterBranch = publicOr.getOrThrow("publicOr")

        fun asPublicAnd(): PublicAndFilterBranch = publicAnd.getOrThrow("publicAnd")

        fun asPublicNotAll(): PublicNotAllFilterBranch = publicNotAll.getOrThrow("publicNotAll")

        fun asPublicNotAny(): PublicNotAnyFilterBranch = publicNotAny.getOrThrow("publicNotAny")

        fun asPublicRestricted(): PublicRestrictedFilterBranch =
            publicRestricted.getOrThrow("publicRestricted")

        fun asPublicUnifiedEvents(): PublicUnifiedEventsFilterBranch =
            publicUnifiedEvents.getOrThrow("publicUnifiedEvents")

        fun asPublicPropertyAssociation(): PublicPropertyAssociationFilterBranch =
            publicPropertyAssociation.getOrThrow("publicPropertyAssociation")

        fun asPublicAssociation(): PublicAssociationFilterBranch =
            publicAssociation.getOrThrow("publicAssociation")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                publicOr != null -> visitor.visitPublicOr(publicOr)
                publicAnd != null -> visitor.visitPublicAnd(publicAnd)
                publicNotAll != null -> visitor.visitPublicNotAll(publicNotAll)
                publicNotAny != null -> visitor.visitPublicNotAny(publicNotAny)
                publicRestricted != null -> visitor.visitPublicRestricted(publicRestricted)
                publicUnifiedEvents != null -> visitor.visitPublicUnifiedEvents(publicUnifiedEvents)
                publicPropertyAssociation != null ->
                    visitor.visitPublicPropertyAssociation(publicPropertyAssociation)
                publicAssociation != null -> visitor.visitPublicAssociation(publicAssociation)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): FilterBranch = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitPublicOr(publicOr: PublicOrFilterBranch) {
                        publicOr.validate()
                    }

                    override fun visitPublicAnd(publicAnd: PublicAndFilterBranch) {
                        publicAnd.validate()
                    }

                    override fun visitPublicNotAll(publicNotAll: PublicNotAllFilterBranch) {
                        publicNotAll.validate()
                    }

                    override fun visitPublicNotAny(publicNotAny: PublicNotAnyFilterBranch) {
                        publicNotAny.validate()
                    }

                    override fun visitPublicRestricted(
                        publicRestricted: PublicRestrictedFilterBranch
                    ) {
                        publicRestricted.validate()
                    }

                    override fun visitPublicUnifiedEvents(
                        publicUnifiedEvents: PublicUnifiedEventsFilterBranch
                    ) {
                        publicUnifiedEvents.validate()
                    }

                    override fun visitPublicPropertyAssociation(
                        publicPropertyAssociation: PublicPropertyAssociationFilterBranch
                    ) {
                        publicPropertyAssociation.validate()
                    }

                    override fun visitPublicAssociation(
                        publicAssociation: PublicAssociationFilterBranch
                    ) {
                        publicAssociation.validate()
                    }
                }
            )
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
        @JvmSynthetic
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitPublicOr(publicOr: PublicOrFilterBranch) = publicOr.validity()

                    override fun visitPublicAnd(publicAnd: PublicAndFilterBranch) =
                        publicAnd.validity()

                    override fun visitPublicNotAll(publicNotAll: PublicNotAllFilterBranch) =
                        publicNotAll.validity()

                    override fun visitPublicNotAny(publicNotAny: PublicNotAnyFilterBranch) =
                        publicNotAny.validity()

                    override fun visitPublicRestricted(
                        publicRestricted: PublicRestrictedFilterBranch
                    ) = publicRestricted.validity()

                    override fun visitPublicUnifiedEvents(
                        publicUnifiedEvents: PublicUnifiedEventsFilterBranch
                    ) = publicUnifiedEvents.validity()

                    override fun visitPublicPropertyAssociation(
                        publicPropertyAssociation: PublicPropertyAssociationFilterBranch
                    ) = publicPropertyAssociation.validity()

                    override fun visitPublicAssociation(
                        publicAssociation: PublicAssociationFilterBranch
                    ) = publicAssociation.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FilterBranch &&
                publicOr == other.publicOr &&
                publicAnd == other.publicAnd &&
                publicNotAll == other.publicNotAll &&
                publicNotAny == other.publicNotAny &&
                publicRestricted == other.publicRestricted &&
                publicUnifiedEvents == other.publicUnifiedEvents &&
                publicPropertyAssociation == other.publicPropertyAssociation &&
                publicAssociation == other.publicAssociation
        }

        override fun hashCode(): Int =
            Objects.hash(
                publicOr,
                publicAnd,
                publicNotAll,
                publicNotAny,
                publicRestricted,
                publicUnifiedEvents,
                publicPropertyAssociation,
                publicAssociation,
            )

        override fun toString(): String =
            when {
                publicOr != null -> "FilterBranch{publicOr=$publicOr}"
                publicAnd != null -> "FilterBranch{publicAnd=$publicAnd}"
                publicNotAll != null -> "FilterBranch{publicNotAll=$publicNotAll}"
                publicNotAny != null -> "FilterBranch{publicNotAny=$publicNotAny}"
                publicRestricted != null -> "FilterBranch{publicRestricted=$publicRestricted}"
                publicUnifiedEvents != null ->
                    "FilterBranch{publicUnifiedEvents=$publicUnifiedEvents}"
                publicPropertyAssociation != null ->
                    "FilterBranch{publicPropertyAssociation=$publicPropertyAssociation}"
                publicAssociation != null -> "FilterBranch{publicAssociation=$publicAssociation}"
                _json != null -> "FilterBranch{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid FilterBranch")
            }

        companion object {

            @JvmStatic
            fun ofPublicOr(publicOr: PublicOrFilterBranch) = FilterBranch(publicOr = publicOr)

            @JvmStatic
            fun ofPublicAnd(publicAnd: PublicAndFilterBranch) = FilterBranch(publicAnd = publicAnd)

            @JvmStatic
            fun ofPublicNotAll(publicNotAll: PublicNotAllFilterBranch) =
                FilterBranch(publicNotAll = publicNotAll)

            @JvmStatic
            fun ofPublicNotAny(publicNotAny: PublicNotAnyFilterBranch) =
                FilterBranch(publicNotAny = publicNotAny)

            @JvmStatic
            fun ofPublicRestricted(publicRestricted: PublicRestrictedFilterBranch) =
                FilterBranch(publicRestricted = publicRestricted)

            @JvmStatic
            fun ofPublicUnifiedEvents(publicUnifiedEvents: PublicUnifiedEventsFilterBranch) =
                FilterBranch(publicUnifiedEvents = publicUnifiedEvents)

            @JvmStatic
            fun ofPublicPropertyAssociation(
                publicPropertyAssociation: PublicPropertyAssociationFilterBranch
            ) = FilterBranch(publicPropertyAssociation = publicPropertyAssociation)

            @JvmStatic
            fun ofPublicAssociation(publicAssociation: PublicAssociationFilterBranch) =
                FilterBranch(publicAssociation = publicAssociation)
        }

        /**
         * An interface that defines how to map each variant of [FilterBranch] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitPublicOr(publicOr: PublicOrFilterBranch): T

            fun visitPublicAnd(publicAnd: PublicAndFilterBranch): T

            fun visitPublicNotAll(publicNotAll: PublicNotAllFilterBranch): T

            fun visitPublicNotAny(publicNotAny: PublicNotAnyFilterBranch): T

            fun visitPublicRestricted(publicRestricted: PublicRestrictedFilterBranch): T

            fun visitPublicUnifiedEvents(publicUnifiedEvents: PublicUnifiedEventsFilterBranch): T

            fun visitPublicPropertyAssociation(
                publicPropertyAssociation: PublicPropertyAssociationFilterBranch
            ): T

            fun visitPublicAssociation(publicAssociation: PublicAssociationFilterBranch): T

            /**
             * Maps an unknown variant of [FilterBranch] to a value of type [T].
             *
             * An instance of [FilterBranch] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws HubspotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubspotInvalidDataException("Unknown FilterBranch: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<FilterBranch>(FilterBranch::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): FilterBranch {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<PublicOrFilterBranch>())?.let {
                                FilterBranch(publicOr = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicAndFilterBranch>())?.let {
                                FilterBranch(publicAnd = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicNotAllFilterBranch>())?.let {
                                FilterBranch(publicNotAll = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicNotAnyFilterBranch>())?.let {
                                FilterBranch(publicNotAny = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicRestrictedFilterBranch>())
                                ?.let { FilterBranch(publicRestricted = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<PublicUnifiedEventsFilterBranch>())
                                ?.let { FilterBranch(publicUnifiedEvents = it, _json = json) },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PublicPropertyAssociationFilterBranch>(),
                                )
                                ?.let {
                                    FilterBranch(publicPropertyAssociation = it, _json = json)
                                },
                            tryDeserialize(node, jacksonTypeRef<PublicAssociationFilterBranch>())
                                ?.let { FilterBranch(publicAssociation = it, _json = json) },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> FilterBranch(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<FilterBranch>(FilterBranch::class) {

            override fun serialize(
                value: FilterBranch,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.publicOr != null -> generator.writeObject(value.publicOr)
                    value.publicAnd != null -> generator.writeObject(value.publicAnd)
                    value.publicNotAll != null -> generator.writeObject(value.publicNotAll)
                    value.publicNotAny != null -> generator.writeObject(value.publicNotAny)
                    value.publicRestricted != null -> generator.writeObject(value.publicRestricted)
                    value.publicUnifiedEvents != null ->
                        generator.writeObject(value.publicUnifiedEvents)
                    value.publicPropertyAssociation != null ->
                        generator.writeObject(value.publicPropertyAssociation)
                    value.publicAssociation != null ->
                        generator.writeObject(value.publicAssociation)
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

        return other is ListCreateRequest &&
            name == other.name &&
            objectTypeId == other.objectTypeId &&
            processingType == other.processingType &&
            customProperties == other.customProperties &&
            filterBranch == other.filterBranch &&
            listFolderId == other.listFolderId &&
            listPermissions == other.listPermissions &&
            membershipSettings == other.membershipSettings &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            name,
            objectTypeId,
            processingType,
            customProperties,
            filterBranch,
            listFolderId,
            listPermissions,
            membershipSettings,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ListCreateRequest{name=$name, objectTypeId=$objectTypeId, processingType=$processingType, customProperties=$customProperties, filterBranch=$filterBranch, listFolderId=$listFolderId, listPermissions=$listPermissions, membershipSettings=$membershipSettings, additionalProperties=$additionalProperties}"
}
