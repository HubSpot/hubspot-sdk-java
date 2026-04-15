// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

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
import com.hubspot.sdk.core.BaseDeserializer
import com.hubspot.sdk.core.BaseSerializer
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.getOrThrow
import com.hubspot.sdk.core.toImmutable
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

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
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * The object type ID of the type of objects that the list will store.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectTypeId(): String = objectTypeId.getRequired("objectTypeId")

    /**
     * The processing type of the list. One of: `SNAPSHOT`, `MANUAL`, or `DYNAMIC`.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun processingType(): String = processingType.getRequired("processingType")

    /**
     * The list of custom properties to tie to the list. Custom property name is the key, the value
     * is the value.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customProperties(): Optional<CustomProperties> =
        customProperties.getOptional("customProperties")

    /**
     * Filter branch object containing filtering criteria for the list
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filterBranch(): Optional<FilterBranch> = filterBranch.getOptional("filterBranch")

    /**
     * The ID of the folder that the list should be created in. If left blank, then the list will be
     * created in the root of the list folder structure.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun listFolderId(): Optional<Int> = listFolderId.getOptional("listFolderId")

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

        /** Filter branch object containing filtering criteria for the list */
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

    /** Filter branch object containing filtering criteria for the list */
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
