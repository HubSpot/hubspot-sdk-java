// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.imports

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicImportResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val mappedObjectTypeIds: JsonField<List<String>>,
    private val metadata: JsonField<PublicImportMetadata>,
    private val optOutImport: JsonField<Boolean>,
    private val state: JsonField<State>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val importName: JsonField<String>,
    private val importRequestJson: JsonValue,
    private val importSource: JsonField<ImportSource>,
    private val importTemplate: JsonField<ImportTemplate>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("mappedObjectTypeIds")
        @ExcludeMissing
        mappedObjectTypeIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        metadata: JsonField<PublicImportMetadata> = JsonMissing.of(),
        @JsonProperty("optOutImport")
        @ExcludeMissing
        optOutImport: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<State> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("importName")
        @ExcludeMissing
        importName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("importRequestJson")
        @ExcludeMissing
        importRequestJson: JsonValue = JsonMissing.of(),
        @JsonProperty("importSource")
        @ExcludeMissing
        importSource: JsonField<ImportSource> = JsonMissing.of(),
        @JsonProperty("importTemplate")
        @ExcludeMissing
        importTemplate: JsonField<ImportTemplate> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        mappedObjectTypeIds,
        metadata,
        optOutImport,
        state,
        updatedAt,
        importName,
        importRequestJson,
        importSource,
        importTemplate,
        mutableMapOf(),
    )

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun mappedObjectTypeIds(): List<String> = mappedObjectTypeIds.getRequired("mappedObjectTypeIds")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metadata(): PublicImportMetadata = metadata.getRequired("metadata")

    /**
     * Whether or not the import is a list of people disqualified from receiving emails.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun optOutImport(): Boolean = optOutImport.getRequired("optOutImport")

    /**
     * The status of the import.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun state(): State = state.getRequired("state")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun importName(): Optional<String> = importName.getOptional("importName")

    @JsonProperty("importRequestJson")
    @ExcludeMissing
    fun _importRequestJson(): JsonValue = importRequestJson

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun importSource(): Optional<ImportSource> = importSource.getOptional("importSource")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun importTemplate(): Optional<ImportTemplate> = importTemplate.getOptional("importTemplate")

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
     * Returns the raw JSON value of [mappedObjectTypeIds].
     *
     * Unlike [mappedObjectTypeIds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("mappedObjectTypeIds")
    @ExcludeMissing
    fun _mappedObjectTypeIds(): JsonField<List<String>> = mappedObjectTypeIds

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata")
    @ExcludeMissing
    fun _metadata(): JsonField<PublicImportMetadata> = metadata

    /**
     * Returns the raw JSON value of [optOutImport].
     *
     * Unlike [optOutImport], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("optOutImport")
    @ExcludeMissing
    fun _optOutImport(): JsonField<Boolean> = optOutImport

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<State> = state

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [importName].
     *
     * Unlike [importName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("importName") @ExcludeMissing fun _importName(): JsonField<String> = importName

    /**
     * Returns the raw JSON value of [importSource].
     *
     * Unlike [importSource], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("importSource")
    @ExcludeMissing
    fun _importSource(): JsonField<ImportSource> = importSource

    /**
     * Returns the raw JSON value of [importTemplate].
     *
     * Unlike [importTemplate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("importTemplate")
    @ExcludeMissing
    fun _importTemplate(): JsonField<ImportTemplate> = importTemplate

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
         * Returns a mutable builder for constructing an instance of [PublicImportResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .mappedObjectTypeIds()
         * .metadata()
         * .optOutImport()
         * .state()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicImportResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var mappedObjectTypeIds: JsonField<MutableList<String>>? = null
        private var metadata: JsonField<PublicImportMetadata>? = null
        private var optOutImport: JsonField<Boolean>? = null
        private var state: JsonField<State>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var importName: JsonField<String> = JsonMissing.of()
        private var importRequestJson: JsonValue = JsonMissing.of()
        private var importSource: JsonField<ImportSource> = JsonMissing.of()
        private var importTemplate: JsonField<ImportTemplate> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicImportResponse: PublicImportResponse) = apply {
            id = publicImportResponse.id
            createdAt = publicImportResponse.createdAt
            mappedObjectTypeIds =
                publicImportResponse.mappedObjectTypeIds.map { it.toMutableList() }
            metadata = publicImportResponse.metadata
            optOutImport = publicImportResponse.optOutImport
            state = publicImportResponse.state
            updatedAt = publicImportResponse.updatedAt
            importName = publicImportResponse.importName
            importRequestJson = publicImportResponse.importRequestJson
            importSource = publicImportResponse.importSource
            importTemplate = publicImportResponse.importTemplate
            additionalProperties = publicImportResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun mappedObjectTypeIds(mappedObjectTypeIds: List<String>) =
            mappedObjectTypeIds(JsonField.of(mappedObjectTypeIds))

        /**
         * Sets [Builder.mappedObjectTypeIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mappedObjectTypeIds] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun mappedObjectTypeIds(mappedObjectTypeIds: JsonField<List<String>>) = apply {
            this.mappedObjectTypeIds = mappedObjectTypeIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [mappedObjectTypeIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMappedObjectTypeId(mappedObjectTypeId: String) = apply {
            mappedObjectTypeIds =
                (mappedObjectTypeIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("mappedObjectTypeIds", it).add(mappedObjectTypeId)
                }
        }

        fun metadata(metadata: PublicImportMetadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [PublicImportMetadata] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun metadata(metadata: JsonField<PublicImportMetadata>) = apply { this.metadata = metadata }

        /** Whether or not the import is a list of people disqualified from receiving emails. */
        fun optOutImport(optOutImport: Boolean) = optOutImport(JsonField.of(optOutImport))

        /**
         * Sets [Builder.optOutImport] to an arbitrary JSON value.
         *
         * You should usually call [Builder.optOutImport] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun optOutImport(optOutImport: JsonField<Boolean>) = apply {
            this.optOutImport = optOutImport
        }

        /** The status of the import. */
        fun state(state: State) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [State] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<State>) = apply { this.state = state }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun importName(importName: String) = importName(JsonField.of(importName))

        /**
         * Sets [Builder.importName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.importName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun importName(importName: JsonField<String>) = apply { this.importName = importName }

        fun importRequestJson(importRequestJson: JsonValue) = apply {
            this.importRequestJson = importRequestJson
        }

        fun importSource(importSource: ImportSource) = importSource(JsonField.of(importSource))

        /**
         * Sets [Builder.importSource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.importSource] with a well-typed [ImportSource] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun importSource(importSource: JsonField<ImportSource>) = apply {
            this.importSource = importSource
        }

        fun importTemplate(importTemplate: ImportTemplate) =
            importTemplate(JsonField.of(importTemplate))

        /**
         * Sets [Builder.importTemplate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.importTemplate] with a well-typed [ImportTemplate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun importTemplate(importTemplate: JsonField<ImportTemplate>) = apply {
            this.importTemplate = importTemplate
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
         * Returns an immutable instance of [PublicImportResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .mappedObjectTypeIds()
         * .metadata()
         * .optOutImport()
         * .state()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicImportResponse =
            PublicImportResponse(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("mappedObjectTypeIds", mappedObjectTypeIds).map { it.toImmutable() },
                checkRequired("metadata", metadata),
                checkRequired("optOutImport", optOutImport),
                checkRequired("state", state),
                checkRequired("updatedAt", updatedAt),
                importName,
                importRequestJson,
                importSource,
                importTemplate,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicImportResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        mappedObjectTypeIds()
        metadata().validate()
        optOutImport()
        state().validate()
        updatedAt()
        importName()
        importSource().ifPresent { it.validate() }
        importTemplate().ifPresent { it.validate() }
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (mappedObjectTypeIds.asKnown().getOrNull()?.size ?: 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (if (optOutImport.asKnown().isPresent) 1 else 0) +
            (state.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (importName.asKnown().isPresent) 1 else 0) +
            (importSource.asKnown().getOrNull()?.validity() ?: 0) +
            (importTemplate.asKnown().getOrNull()?.validity() ?: 0)

    /** The status of the import. */
    class State @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val STARTED = of("STARTED")

            @JvmField val PROCESSING = of("PROCESSING")

            @JvmField val DONE = of("DONE")

            @JvmField val FAILED = of("FAILED")

            @JvmField val CANCELED = of("CANCELED")

            @JvmField val DEFERRED = of("DEFERRED")

            @JvmField val REVERTED = of("REVERTED")

            @JvmStatic fun of(value: String) = State(JsonField.of(value))
        }

        /** An enum containing [State]'s known values. */
        enum class Known {
            STARTED,
            PROCESSING,
            DONE,
            FAILED,
            CANCELED,
            DEFERRED,
            REVERTED,
        }

        /**
         * An enum containing [State]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [State] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            STARTED,
            PROCESSING,
            DONE,
            FAILED,
            CANCELED,
            DEFERRED,
            REVERTED,
            /** An enum member indicating that [State] was instantiated with an unknown value. */
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
                STARTED -> Value.STARTED
                PROCESSING -> Value.PROCESSING
                DONE -> Value.DONE
                FAILED -> Value.FAILED
                CANCELED -> Value.CANCELED
                DEFERRED -> Value.DEFERRED
                REVERTED -> Value.REVERTED
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
                STARTED -> Known.STARTED
                PROCESSING -> Known.PROCESSING
                DONE -> Known.DONE
                FAILED -> Known.FAILED
                CANCELED -> Known.CANCELED
                DEFERRED -> Known.DEFERRED
                REVERTED -> Known.REVERTED
                else -> throw HubspotInvalidDataException("Unknown State: $value")
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

        fun validate(): State = apply {
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

            return other is State && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class ImportSource @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val API = of("API")

            @JvmField val CRM_UI = of("CRM_UI")

            @JvmField val IMPORT = of("IMPORT")

            @JvmField val MOBILE_ANDROID = of("MOBILE_ANDROID")

            @JvmField val MOBILE_IOS = of("MOBILE_IOS")

            @JvmField val SALESFORCE = of("SALESFORCE")

            @JvmStatic fun of(value: String) = ImportSource(JsonField.of(value))
        }

        /** An enum containing [ImportSource]'s known values. */
        enum class Known {
            API,
            CRM_UI,
            IMPORT,
            MOBILE_ANDROID,
            MOBILE_IOS,
            SALESFORCE,
        }

        /**
         * An enum containing [ImportSource]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ImportSource] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            API,
            CRM_UI,
            IMPORT,
            MOBILE_ANDROID,
            MOBILE_IOS,
            SALESFORCE,
            /**
             * An enum member indicating that [ImportSource] was instantiated with an unknown value.
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
                API -> Value.API
                CRM_UI -> Value.CRM_UI
                IMPORT -> Value.IMPORT
                MOBILE_ANDROID -> Value.MOBILE_ANDROID
                MOBILE_IOS -> Value.MOBILE_IOS
                SALESFORCE -> Value.SALESFORCE
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
                API -> Known.API
                CRM_UI -> Known.CRM_UI
                IMPORT -> Known.IMPORT
                MOBILE_ANDROID -> Known.MOBILE_ANDROID
                MOBILE_IOS -> Known.MOBILE_IOS
                SALESFORCE -> Known.SALESFORCE
                else -> throw HubspotInvalidDataException("Unknown ImportSource: $value")
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

        fun validate(): ImportSource = apply {
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

            return other is ImportSource && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicImportResponse &&
            id == other.id &&
            createdAt == other.createdAt &&
            mappedObjectTypeIds == other.mappedObjectTypeIds &&
            metadata == other.metadata &&
            optOutImport == other.optOutImport &&
            state == other.state &&
            updatedAt == other.updatedAt &&
            importName == other.importName &&
            importRequestJson == other.importRequestJson &&
            importSource == other.importSource &&
            importTemplate == other.importTemplate &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            mappedObjectTypeIds,
            metadata,
            optOutImport,
            state,
            updatedAt,
            importName,
            importRequestJson,
            importSource,
            importTemplate,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicImportResponse{id=$id, createdAt=$createdAt, mappedObjectTypeIds=$mappedObjectTypeIds, metadata=$metadata, optOutImport=$optOutImport, state=$state, updatedAt=$updatedAt, importName=$importName, importRequestJson=$importRequestJson, importSource=$importSource, importTemplate=$importTemplate, additionalProperties=$additionalProperties}"
}
