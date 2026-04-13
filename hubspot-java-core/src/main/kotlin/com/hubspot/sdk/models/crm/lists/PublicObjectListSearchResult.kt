// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.toImmutable
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicObjectListSearchResult
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val listId: JsonField<String>,
    private val listVersion: JsonField<Int>,
    private val name: JsonField<String>,
    private val objectTypeId: JsonField<String>,
    private val processingStatus: JsonField<String>,
    private val processingType: JsonField<String>,
    private val additionalFilterProperties: JsonField<AdditionalFilterProperties>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdById: JsonField<String>,
    private val deletedAt: JsonField<OffsetDateTime>,
    private val filtersUpdatedAt: JsonField<OffsetDateTime>,
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
        @JsonProperty("additional_filter_properties")
        @ExcludeMissing
        additionalFilterProperties: JsonField<AdditionalFilterProperties> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdById")
        @ExcludeMissing
        createdById: JsonField<String> = JsonMissing.of(),
        @JsonProperty("deletedAt")
        @ExcludeMissing
        deletedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("filtersUpdatedAt")
        @ExcludeMissing
        filtersUpdatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
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
        additionalFilterProperties,
        createdAt,
        createdById,
        deletedAt,
        filtersUpdatedAt,
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
     * The name and value of any additional properties that exist for this list and that were
     * included in the search request.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun additionalFilterProperties(): Optional<AdditionalFilterProperties> =
        additionalFilterProperties.getOptional("additional_filter_properties")

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
     * The time when the filters for this list were last updated.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filtersUpdatedAt(): Optional<OffsetDateTime> =
        filtersUpdatedAt.getOptional("filtersUpdatedAt")

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
     * Returns the raw JSON value of [additionalFilterProperties].
     *
     * Unlike [additionalFilterProperties], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("additional_filter_properties")
    @ExcludeMissing
    fun _additionalFilterProperties(): JsonField<AdditionalFilterProperties> =
        additionalFilterProperties

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
     * Returns the raw JSON value of [filtersUpdatedAt].
     *
     * Unlike [filtersUpdatedAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("filtersUpdatedAt")
    @ExcludeMissing
    fun _filtersUpdatedAt(): JsonField<OffsetDateTime> = filtersUpdatedAt

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
         * Returns a mutable builder for constructing an instance of [PublicObjectListSearchResult].
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

    /** A builder for [PublicObjectListSearchResult]. */
    class Builder internal constructor() {

        private var listId: JsonField<String>? = null
        private var listVersion: JsonField<Int>? = null
        private var name: JsonField<String>? = null
        private var objectTypeId: JsonField<String>? = null
        private var processingStatus: JsonField<String>? = null
        private var processingType: JsonField<String>? = null
        private var additionalFilterProperties: JsonField<AdditionalFilterProperties> =
            JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdById: JsonField<String> = JsonMissing.of()
        private var deletedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var filtersUpdatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedById: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicObjectListSearchResult: PublicObjectListSearchResult) = apply {
            listId = publicObjectListSearchResult.listId
            listVersion = publicObjectListSearchResult.listVersion
            name = publicObjectListSearchResult.name
            objectTypeId = publicObjectListSearchResult.objectTypeId
            processingStatus = publicObjectListSearchResult.processingStatus
            processingType = publicObjectListSearchResult.processingType
            additionalFilterProperties = publicObjectListSearchResult.additionalFilterProperties
            createdAt = publicObjectListSearchResult.createdAt
            createdById = publicObjectListSearchResult.createdById
            deletedAt = publicObjectListSearchResult.deletedAt
            filtersUpdatedAt = publicObjectListSearchResult.filtersUpdatedAt
            updatedAt = publicObjectListSearchResult.updatedAt
            updatedById = publicObjectListSearchResult.updatedById
            additionalProperties = publicObjectListSearchResult.additionalProperties.toMutableMap()
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

        /**
         * The name and value of any additional properties that exist for this list and that were
         * included in the search request.
         */
        fun additionalFilterProperties(additionalFilterProperties: AdditionalFilterProperties) =
            additionalFilterProperties(JsonField.of(additionalFilterProperties))

        /**
         * Sets [Builder.additionalFilterProperties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.additionalFilterProperties] with a well-typed
         * [AdditionalFilterProperties] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun additionalFilterProperties(
            additionalFilterProperties: JsonField<AdditionalFilterProperties>
        ) = apply { this.additionalFilterProperties = additionalFilterProperties }

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
         * Returns an immutable instance of [PublicObjectListSearchResult].
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
        fun build(): PublicObjectListSearchResult =
            PublicObjectListSearchResult(
                checkRequired("listId", listId),
                checkRequired("listVersion", listVersion),
                checkRequired("name", name),
                checkRequired("objectTypeId", objectTypeId),
                checkRequired("processingStatus", processingStatus),
                checkRequired("processingType", processingType),
                additionalFilterProperties,
                createdAt,
                createdById,
                deletedAt,
                filtersUpdatedAt,
                updatedAt,
                updatedById,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicObjectListSearchResult = apply {
        if (validated) {
            return@apply
        }

        listId()
        listVersion()
        name()
        objectTypeId()
        processingStatus()
        processingType()
        additionalFilterProperties().ifPresent { it.validate() }
        createdAt()
        createdById()
        deletedAt()
        filtersUpdatedAt()
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
            (additionalFilterProperties.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdById.asKnown().isPresent) 1 else 0) +
            (if (deletedAt.asKnown().isPresent) 1 else 0) +
            (if (filtersUpdatedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedById.asKnown().isPresent) 1 else 0)

    /**
     * The name and value of any additional properties that exist for this list and that were
     * included in the search request.
     */
    class AdditionalFilterProperties
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

            /**
             * Returns a mutable builder for constructing an instance of
             * [AdditionalFilterProperties].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AdditionalFilterProperties]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(additionalFilterProperties: AdditionalFilterProperties) = apply {
                additionalProperties =
                    additionalFilterProperties.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [AdditionalFilterProperties].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): AdditionalFilterProperties =
                AdditionalFilterProperties(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): AdditionalFilterProperties = apply {
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

            return other is AdditionalFilterProperties &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AdditionalFilterProperties{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicObjectListSearchResult &&
            listId == other.listId &&
            listVersion == other.listVersion &&
            name == other.name &&
            objectTypeId == other.objectTypeId &&
            processingStatus == other.processingStatus &&
            processingType == other.processingType &&
            additionalFilterProperties == other.additionalFilterProperties &&
            createdAt == other.createdAt &&
            createdById == other.createdById &&
            deletedAt == other.deletedAt &&
            filtersUpdatedAt == other.filtersUpdatedAt &&
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
            additionalFilterProperties,
            createdAt,
            createdById,
            deletedAt,
            filtersUpdatedAt,
            updatedAt,
            updatedById,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicObjectListSearchResult{listId=$listId, listVersion=$listVersion, name=$name, objectTypeId=$objectTypeId, processingStatus=$processingStatus, processingType=$processingType, additionalFilterProperties=$additionalFilterProperties, createdAt=$createdAt, createdById=$createdById, deletedAt=$deletedAt, filtersUpdatedAt=$filtersUpdatedAt, updatedAt=$updatedAt, updatedById=$updatedById, additionalProperties=$additionalProperties}"
}
