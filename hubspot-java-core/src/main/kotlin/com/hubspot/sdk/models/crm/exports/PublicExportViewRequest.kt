// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.exports

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

class PublicExportViewRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val associatedObjectType: JsonField<List<String>>,
    private val exportInternalValuesOptions: JsonField<List<ExportInternalValuesOption>>,
    private val exportName: JsonField<String>,
    private val exportType: JsonField<ExportType>,
    private val format: JsonField<Format>,
    private val includeLabeledAssociations: JsonField<Boolean>,
    private val includePrimaryDisplayPropertyForAssociatedObjects: JsonField<Boolean>,
    private val language: JsonField<Language>,
    private val objectProperties: JsonField<List<String>>,
    private val objectType: JsonField<String>,
    private val overrideAssociatedObjectsPerDefinitionPerRowLimit: JsonField<Boolean>,
    private val publicCrmSearchRequest: JsonField<PublicCrmSearchRequest>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("associatedObjectType")
        @ExcludeMissing
        associatedObjectType: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("exportInternalValuesOptions")
        @ExcludeMissing
        exportInternalValuesOptions: JsonField<List<ExportInternalValuesOption>> = JsonMissing.of(),
        @JsonProperty("exportName")
        @ExcludeMissing
        exportName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("exportType")
        @ExcludeMissing
        exportType: JsonField<ExportType> = JsonMissing.of(),
        @JsonProperty("format") @ExcludeMissing format: JsonField<Format> = JsonMissing.of(),
        @JsonProperty("includeLabeledAssociations")
        @ExcludeMissing
        includeLabeledAssociations: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("includePrimaryDisplayPropertyForAssociatedObjects")
        @ExcludeMissing
        includePrimaryDisplayPropertyForAssociatedObjects: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("language") @ExcludeMissing language: JsonField<Language> = JsonMissing.of(),
        @JsonProperty("objectProperties")
        @ExcludeMissing
        objectProperties: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("objectType")
        @ExcludeMissing
        objectType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("overrideAssociatedObjectsPerDefinitionPerRowLimit")
        @ExcludeMissing
        overrideAssociatedObjectsPerDefinitionPerRowLimit: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("publicCrmSearchRequest")
        @ExcludeMissing
        publicCrmSearchRequest: JsonField<PublicCrmSearchRequest> = JsonMissing.of(),
    ) : this(
        associatedObjectType,
        exportInternalValuesOptions,
        exportName,
        exportType,
        format,
        includeLabeledAssociations,
        includePrimaryDisplayPropertyForAssociatedObjects,
        language,
        objectProperties,
        objectType,
        overrideAssociatedObjectsPerDefinitionPerRowLimit,
        publicCrmSearchRequest,
        mutableMapOf(),
    )

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun associatedObjectType(): List<String> =
        associatedObjectType.getRequired("associatedObjectType")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun exportInternalValuesOptions(): List<ExportInternalValuesOption> =
        exportInternalValuesOptions.getRequired("exportInternalValuesOptions")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun exportName(): String = exportName.getRequired("exportName")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun exportType(): ExportType = exportType.getRequired("exportType")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun format(): Format = format.getRequired("format")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun includeLabeledAssociations(): Boolean =
        includeLabeledAssociations.getRequired("includeLabeledAssociations")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun includePrimaryDisplayPropertyForAssociatedObjects(): Boolean =
        includePrimaryDisplayPropertyForAssociatedObjects.getRequired(
            "includePrimaryDisplayPropertyForAssociatedObjects"
        )

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun language(): Language = language.getRequired("language")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectProperties(): List<String> = objectProperties.getRequired("objectProperties")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectType(): String = objectType.getRequired("objectType")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun overrideAssociatedObjectsPerDefinitionPerRowLimit(): Boolean =
        overrideAssociatedObjectsPerDefinitionPerRowLimit.getRequired(
            "overrideAssociatedObjectsPerDefinitionPerRowLimit"
        )

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun publicCrmSearchRequest(): Optional<PublicCrmSearchRequest> =
        publicCrmSearchRequest.getOptional("publicCrmSearchRequest")

    /**
     * Returns the raw JSON value of [associatedObjectType].
     *
     * Unlike [associatedObjectType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("associatedObjectType")
    @ExcludeMissing
    fun _associatedObjectType(): JsonField<List<String>> = associatedObjectType

    /**
     * Returns the raw JSON value of [exportInternalValuesOptions].
     *
     * Unlike [exportInternalValuesOptions], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("exportInternalValuesOptions")
    @ExcludeMissing
    fun _exportInternalValuesOptions(): JsonField<List<ExportInternalValuesOption>> =
        exportInternalValuesOptions

    /**
     * Returns the raw JSON value of [exportName].
     *
     * Unlike [exportName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("exportName") @ExcludeMissing fun _exportName(): JsonField<String> = exportName

    /**
     * Returns the raw JSON value of [exportType].
     *
     * Unlike [exportType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("exportType")
    @ExcludeMissing
    fun _exportType(): JsonField<ExportType> = exportType

    /**
     * Returns the raw JSON value of [format].
     *
     * Unlike [format], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("format") @ExcludeMissing fun _format(): JsonField<Format> = format

    /**
     * Returns the raw JSON value of [includeLabeledAssociations].
     *
     * Unlike [includeLabeledAssociations], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("includeLabeledAssociations")
    @ExcludeMissing
    fun _includeLabeledAssociations(): JsonField<Boolean> = includeLabeledAssociations

    /**
     * Returns the raw JSON value of [includePrimaryDisplayPropertyForAssociatedObjects].
     *
     * Unlike [includePrimaryDisplayPropertyForAssociatedObjects], this method doesn't throw if the
     * JSON field has an unexpected type.
     */
    @JsonProperty("includePrimaryDisplayPropertyForAssociatedObjects")
    @ExcludeMissing
    fun _includePrimaryDisplayPropertyForAssociatedObjects(): JsonField<Boolean> =
        includePrimaryDisplayPropertyForAssociatedObjects

    /**
     * Returns the raw JSON value of [language].
     *
     * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<Language> = language

    /**
     * Returns the raw JSON value of [objectProperties].
     *
     * Unlike [objectProperties], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("objectProperties")
    @ExcludeMissing
    fun _objectProperties(): JsonField<List<String>> = objectProperties

    /**
     * Returns the raw JSON value of [objectType].
     *
     * Unlike [objectType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectType") @ExcludeMissing fun _objectType(): JsonField<String> = objectType

    /**
     * Returns the raw JSON value of [overrideAssociatedObjectsPerDefinitionPerRowLimit].
     *
     * Unlike [overrideAssociatedObjectsPerDefinitionPerRowLimit], this method doesn't throw if the
     * JSON field has an unexpected type.
     */
    @JsonProperty("overrideAssociatedObjectsPerDefinitionPerRowLimit")
    @ExcludeMissing
    fun _overrideAssociatedObjectsPerDefinitionPerRowLimit(): JsonField<Boolean> =
        overrideAssociatedObjectsPerDefinitionPerRowLimit

    /**
     * Returns the raw JSON value of [publicCrmSearchRequest].
     *
     * Unlike [publicCrmSearchRequest], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("publicCrmSearchRequest")
    @ExcludeMissing
    fun _publicCrmSearchRequest(): JsonField<PublicCrmSearchRequest> = publicCrmSearchRequest

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
         * Returns a mutable builder for constructing an instance of [PublicExportViewRequest].
         *
         * The following fields are required:
         * ```java
         * .associatedObjectType()
         * .exportInternalValuesOptions()
         * .exportName()
         * .exportType()
         * .format()
         * .includeLabeledAssociations()
         * .includePrimaryDisplayPropertyForAssociatedObjects()
         * .language()
         * .objectProperties()
         * .objectType()
         * .overrideAssociatedObjectsPerDefinitionPerRowLimit()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicExportViewRequest]. */
    class Builder internal constructor() {

        private var associatedObjectType: JsonField<MutableList<String>>? = null
        private var exportInternalValuesOptions:
            JsonField<MutableList<ExportInternalValuesOption>>? =
            null
        private var exportName: JsonField<String>? = null
        private var exportType: JsonField<ExportType>? = null
        private var format: JsonField<Format>? = null
        private var includeLabeledAssociations: JsonField<Boolean>? = null
        private var includePrimaryDisplayPropertyForAssociatedObjects: JsonField<Boolean>? = null
        private var language: JsonField<Language>? = null
        private var objectProperties: JsonField<MutableList<String>>? = null
        private var objectType: JsonField<String>? = null
        private var overrideAssociatedObjectsPerDefinitionPerRowLimit: JsonField<Boolean>? = null
        private var publicCrmSearchRequest: JsonField<PublicCrmSearchRequest> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicExportViewRequest: PublicExportViewRequest) = apply {
            associatedObjectType =
                publicExportViewRequest.associatedObjectType.map { it.toMutableList() }
            exportInternalValuesOptions =
                publicExportViewRequest.exportInternalValuesOptions.map { it.toMutableList() }
            exportName = publicExportViewRequest.exportName
            exportType = publicExportViewRequest.exportType
            format = publicExportViewRequest.format
            includeLabeledAssociations = publicExportViewRequest.includeLabeledAssociations
            includePrimaryDisplayPropertyForAssociatedObjects =
                publicExportViewRequest.includePrimaryDisplayPropertyForAssociatedObjects
            language = publicExportViewRequest.language
            objectProperties = publicExportViewRequest.objectProperties.map { it.toMutableList() }
            objectType = publicExportViewRequest.objectType
            overrideAssociatedObjectsPerDefinitionPerRowLimit =
                publicExportViewRequest.overrideAssociatedObjectsPerDefinitionPerRowLimit
            publicCrmSearchRequest = publicExportViewRequest.publicCrmSearchRequest
            additionalProperties = publicExportViewRequest.additionalProperties.toMutableMap()
        }

        fun associatedObjectType(associatedObjectType: List<String>) =
            associatedObjectType(JsonField.of(associatedObjectType))

        /**
         * Sets [Builder.associatedObjectType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.associatedObjectType] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun associatedObjectType(associatedObjectType: JsonField<List<String>>) = apply {
            this.associatedObjectType = associatedObjectType.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.associatedObjectType].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAssociatedObjectType(associatedObjectType: String) = apply {
            this.associatedObjectType =
                (this.associatedObjectType ?: JsonField.of(mutableListOf())).also {
                    checkKnown("associatedObjectType", it).add(associatedObjectType)
                }
        }

        fun exportInternalValuesOptions(
            exportInternalValuesOptions: List<ExportInternalValuesOption>
        ) = exportInternalValuesOptions(JsonField.of(exportInternalValuesOptions))

        /**
         * Sets [Builder.exportInternalValuesOptions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.exportInternalValuesOptions] with a well-typed
         * `List<ExportInternalValuesOption>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun exportInternalValuesOptions(
            exportInternalValuesOptions: JsonField<List<ExportInternalValuesOption>>
        ) = apply {
            this.exportInternalValuesOptions =
                exportInternalValuesOptions.map { it.toMutableList() }
        }

        /**
         * Adds a single [ExportInternalValuesOption] to [exportInternalValuesOptions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExportInternalValuesOption(exportInternalValuesOption: ExportInternalValuesOption) =
            apply {
                exportInternalValuesOptions =
                    (exportInternalValuesOptions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("exportInternalValuesOptions", it)
                            .add(exportInternalValuesOption)
                    }
            }

        fun exportName(exportName: String) = exportName(JsonField.of(exportName))

        /**
         * Sets [Builder.exportName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.exportName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun exportName(exportName: JsonField<String>) = apply { this.exportName = exportName }

        fun exportType(exportType: ExportType) = exportType(JsonField.of(exportType))

        /**
         * Sets [Builder.exportType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.exportType] with a well-typed [ExportType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun exportType(exportType: JsonField<ExportType>) = apply { this.exportType = exportType }

        fun format(format: Format) = format(JsonField.of(format))

        /**
         * Sets [Builder.format] to an arbitrary JSON value.
         *
         * You should usually call [Builder.format] with a well-typed [Format] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun format(format: JsonField<Format>) = apply { this.format = format }

        fun includeLabeledAssociations(includeLabeledAssociations: Boolean) =
            includeLabeledAssociations(JsonField.of(includeLabeledAssociations))

        /**
         * Sets [Builder.includeLabeledAssociations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includeLabeledAssociations] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun includeLabeledAssociations(includeLabeledAssociations: JsonField<Boolean>) = apply {
            this.includeLabeledAssociations = includeLabeledAssociations
        }

        fun includePrimaryDisplayPropertyForAssociatedObjects(
            includePrimaryDisplayPropertyForAssociatedObjects: Boolean
        ) =
            includePrimaryDisplayPropertyForAssociatedObjects(
                JsonField.of(includePrimaryDisplayPropertyForAssociatedObjects)
            )

        /**
         * Sets [Builder.includePrimaryDisplayPropertyForAssociatedObjects] to an arbitrary JSON
         * value.
         *
         * You should usually call [Builder.includePrimaryDisplayPropertyForAssociatedObjects] with
         * a well-typed [Boolean] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun includePrimaryDisplayPropertyForAssociatedObjects(
            includePrimaryDisplayPropertyForAssociatedObjects: JsonField<Boolean>
        ) = apply {
            this.includePrimaryDisplayPropertyForAssociatedObjects =
                includePrimaryDisplayPropertyForAssociatedObjects
        }

        fun language(language: Language) = language(JsonField.of(language))

        /**
         * Sets [Builder.language] to an arbitrary JSON value.
         *
         * You should usually call [Builder.language] with a well-typed [Language] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun language(language: JsonField<Language>) = apply { this.language = language }

        fun objectProperties(objectProperties: List<String>) =
            objectProperties(JsonField.of(objectProperties))

        /**
         * Sets [Builder.objectProperties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectProperties] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun objectProperties(objectProperties: JsonField<List<String>>) = apply {
            this.objectProperties = objectProperties.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [objectProperties].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addObjectProperty(objectProperty: String) = apply {
            objectProperties =
                (objectProperties ?: JsonField.of(mutableListOf())).also {
                    checkKnown("objectProperties", it).add(objectProperty)
                }
        }

        fun objectType(objectType: String) = objectType(JsonField.of(objectType))

        /**
         * Sets [Builder.objectType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun objectType(objectType: JsonField<String>) = apply { this.objectType = objectType }

        fun overrideAssociatedObjectsPerDefinitionPerRowLimit(
            overrideAssociatedObjectsPerDefinitionPerRowLimit: Boolean
        ) =
            overrideAssociatedObjectsPerDefinitionPerRowLimit(
                JsonField.of(overrideAssociatedObjectsPerDefinitionPerRowLimit)
            )

        /**
         * Sets [Builder.overrideAssociatedObjectsPerDefinitionPerRowLimit] to an arbitrary JSON
         * value.
         *
         * You should usually call [Builder.overrideAssociatedObjectsPerDefinitionPerRowLimit] with
         * a well-typed [Boolean] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun overrideAssociatedObjectsPerDefinitionPerRowLimit(
            overrideAssociatedObjectsPerDefinitionPerRowLimit: JsonField<Boolean>
        ) = apply {
            this.overrideAssociatedObjectsPerDefinitionPerRowLimit =
                overrideAssociatedObjectsPerDefinitionPerRowLimit
        }

        fun publicCrmSearchRequest(publicCrmSearchRequest: PublicCrmSearchRequest) =
            publicCrmSearchRequest(JsonField.of(publicCrmSearchRequest))

        /**
         * Sets [Builder.publicCrmSearchRequest] to an arbitrary JSON value.
         *
         * You should usually call [Builder.publicCrmSearchRequest] with a well-typed
         * [PublicCrmSearchRequest] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun publicCrmSearchRequest(publicCrmSearchRequest: JsonField<PublicCrmSearchRequest>) =
            apply {
                this.publicCrmSearchRequest = publicCrmSearchRequest
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
         * Returns an immutable instance of [PublicExportViewRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .associatedObjectType()
         * .exportInternalValuesOptions()
         * .exportName()
         * .exportType()
         * .format()
         * .includeLabeledAssociations()
         * .includePrimaryDisplayPropertyForAssociatedObjects()
         * .language()
         * .objectProperties()
         * .objectType()
         * .overrideAssociatedObjectsPerDefinitionPerRowLimit()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicExportViewRequest =
            PublicExportViewRequest(
                checkRequired("associatedObjectType", associatedObjectType).map {
                    it.toImmutable()
                },
                checkRequired("exportInternalValuesOptions", exportInternalValuesOptions).map {
                    it.toImmutable()
                },
                checkRequired("exportName", exportName),
                checkRequired("exportType", exportType),
                checkRequired("format", format),
                checkRequired("includeLabeledAssociations", includeLabeledAssociations),
                checkRequired(
                    "includePrimaryDisplayPropertyForAssociatedObjects",
                    includePrimaryDisplayPropertyForAssociatedObjects,
                ),
                checkRequired("language", language),
                checkRequired("objectProperties", objectProperties).map { it.toImmutable() },
                checkRequired("objectType", objectType),
                checkRequired(
                    "overrideAssociatedObjectsPerDefinitionPerRowLimit",
                    overrideAssociatedObjectsPerDefinitionPerRowLimit,
                ),
                publicCrmSearchRequest,
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
    fun validate(): PublicExportViewRequest = apply {
        if (validated) {
            return@apply
        }

        associatedObjectType()
        exportInternalValuesOptions().forEach { it.validate() }
        exportName()
        exportType().validate()
        format().validate()
        includeLabeledAssociations()
        includePrimaryDisplayPropertyForAssociatedObjects()
        language().validate()
        objectProperties()
        objectType()
        overrideAssociatedObjectsPerDefinitionPerRowLimit()
        publicCrmSearchRequest().ifPresent { it.validate() }
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
        (associatedObjectType.asKnown().getOrNull()?.size ?: 0) +
            (exportInternalValuesOptions.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                ?: 0) +
            (if (exportName.asKnown().isPresent) 1 else 0) +
            (exportType.asKnown().getOrNull()?.validity() ?: 0) +
            (format.asKnown().getOrNull()?.validity() ?: 0) +
            (if (includeLabeledAssociations.asKnown().isPresent) 1 else 0) +
            (if (includePrimaryDisplayPropertyForAssociatedObjects.asKnown().isPresent) 1 else 0) +
            (language.asKnown().getOrNull()?.validity() ?: 0) +
            (objectProperties.asKnown().getOrNull()?.size ?: 0) +
            (if (objectType.asKnown().isPresent) 1 else 0) +
            (if (overrideAssociatedObjectsPerDefinitionPerRowLimit.asKnown().isPresent) 1 else 0) +
            (publicCrmSearchRequest.asKnown().getOrNull()?.validity() ?: 0)

    class ExportInternalValuesOption
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val NAMES = of("NAMES")

            @JvmField val VALUES = of("VALUES")

            @JvmStatic fun of(value: String) = ExportInternalValuesOption(JsonField.of(value))
        }

        /** An enum containing [ExportInternalValuesOption]'s known values. */
        enum class Known {
            NAMES,
            VALUES,
        }

        /**
         * An enum containing [ExportInternalValuesOption]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [ExportInternalValuesOption] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NAMES,
            VALUES,
            /**
             * An enum member indicating that [ExportInternalValuesOption] was instantiated with an
             * unknown value.
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
                NAMES -> Value.NAMES
                VALUES -> Value.VALUES
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
                NAMES -> Known.NAMES
                VALUES -> Known.VALUES
                else ->
                    throw HubSpotInvalidDataException("Unknown ExportInternalValuesOption: $value")
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
        fun validate(): ExportInternalValuesOption = apply {
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

            return other is ExportInternalValuesOption && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class ExportType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val VIEW = of("VIEW")

            @JvmStatic fun of(value: String) = ExportType(JsonField.of(value))
        }

        /** An enum containing [ExportType]'s known values. */
        enum class Known {
            VIEW
        }

        /**
         * An enum containing [ExportType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ExportType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            VIEW,
            /**
             * An enum member indicating that [ExportType] was instantiated with an unknown value.
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
                VIEW -> Value.VIEW
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
                VIEW -> Known.VIEW
                else -> throw HubSpotInvalidDataException("Unknown ExportType: $value")
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
        fun validate(): ExportType = apply {
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

            return other is ExportType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

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

    class Language @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val AF_ZA = of("AF_ZA")

            @JvmField val AR_EG = of("AR_EG")

            @JvmField val BG = of("BG")

            @JvmField val BN = of("BN")

            @JvmField val CA_ES = of("CA_ES")

            @JvmField val CS = of("CS")

            @JvmField val DA_DK = of("DA_DK")

            @JvmField val DE = of("DE")

            @JvmField val EL_GR = of("EL_GR")

            @JvmField val EN = of("EN")

            @JvmField val EN_GB = of("EN_GB")

            @JvmField val ES = of("ES")

            @JvmField val ES_MX = of("ES_MX")

            @JvmField val ET_EE = of("ET_EE")

            @JvmField val FI = of("FI")

            @JvmField val FR = of("FR")

            @JvmField val FR_CA = of("FR_CA")

            @JvmField val HE_IL = of("HE_IL")

            @JvmField val HI_IN = of("HI_IN")

            @JvmField val HR = of("HR")

            @JvmField val HU = of("HU")

            @JvmField val ID = of("ID")

            @JvmField val IT = of("IT")

            @JvmField val JA = of("JA")

            @JvmField val KO_KR = of("KO_KR")

            @JvmField val LT_LT = of("LT_LT")

            @JvmField val MS = of("MS")

            @JvmField val NL = of("NL")

            @JvmField val NO = of("NO")

            @JvmField val PL = of("PL")

            @JvmField val PT_BR = of("PT_BR")

            @JvmField val PT_PT = of("PT_PT")

            @JvmField val RO = of("RO")

            @JvmField val RU = of("RU")

            @JvmField val SK_SK = of("SK_SK")

            @JvmField val SL = of("SL")

            @JvmField val SV = of("SV")

            @JvmField val TH = of("TH")

            @JvmField val TL = of("TL")

            @JvmField val TR = of("TR")

            @JvmField val UK = of("UK")

            @JvmField val VI_VN = of("VI_VN")

            @JvmField val ZH_CN = of("ZH_CN")

            @JvmField val ZH_HK = of("ZH_HK")

            @JvmField val ZH_TW = of("ZH_TW")

            @JvmStatic fun of(value: String) = Language(JsonField.of(value))
        }

        /** An enum containing [Language]'s known values. */
        enum class Known {
            AF_ZA,
            AR_EG,
            BG,
            BN,
            CA_ES,
            CS,
            DA_DK,
            DE,
            EL_GR,
            EN,
            EN_GB,
            ES,
            ES_MX,
            ET_EE,
            FI,
            FR,
            FR_CA,
            HE_IL,
            HI_IN,
            HR,
            HU,
            ID,
            IT,
            JA,
            KO_KR,
            LT_LT,
            MS,
            NL,
            NO,
            PL,
            PT_BR,
            PT_PT,
            RO,
            RU,
            SK_SK,
            SL,
            SV,
            TH,
            TL,
            TR,
            UK,
            VI_VN,
            ZH_CN,
            ZH_HK,
            ZH_TW,
        }

        /**
         * An enum containing [Language]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Language] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AF_ZA,
            AR_EG,
            BG,
            BN,
            CA_ES,
            CS,
            DA_DK,
            DE,
            EL_GR,
            EN,
            EN_GB,
            ES,
            ES_MX,
            ET_EE,
            FI,
            FR,
            FR_CA,
            HE_IL,
            HI_IN,
            HR,
            HU,
            ID,
            IT,
            JA,
            KO_KR,
            LT_LT,
            MS,
            NL,
            NO,
            PL,
            PT_BR,
            PT_PT,
            RO,
            RU,
            SK_SK,
            SL,
            SV,
            TH,
            TL,
            TR,
            UK,
            VI_VN,
            ZH_CN,
            ZH_HK,
            ZH_TW,
            /** An enum member indicating that [Language] was instantiated with an unknown value. */
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
                AF_ZA -> Value.AF_ZA
                AR_EG -> Value.AR_EG
                BG -> Value.BG
                BN -> Value.BN
                CA_ES -> Value.CA_ES
                CS -> Value.CS
                DA_DK -> Value.DA_DK
                DE -> Value.DE
                EL_GR -> Value.EL_GR
                EN -> Value.EN
                EN_GB -> Value.EN_GB
                ES -> Value.ES
                ES_MX -> Value.ES_MX
                ET_EE -> Value.ET_EE
                FI -> Value.FI
                FR -> Value.FR
                FR_CA -> Value.FR_CA
                HE_IL -> Value.HE_IL
                HI_IN -> Value.HI_IN
                HR -> Value.HR
                HU -> Value.HU
                ID -> Value.ID
                IT -> Value.IT
                JA -> Value.JA
                KO_KR -> Value.KO_KR
                LT_LT -> Value.LT_LT
                MS -> Value.MS
                NL -> Value.NL
                NO -> Value.NO
                PL -> Value.PL
                PT_BR -> Value.PT_BR
                PT_PT -> Value.PT_PT
                RO -> Value.RO
                RU -> Value.RU
                SK_SK -> Value.SK_SK
                SL -> Value.SL
                SV -> Value.SV
                TH -> Value.TH
                TL -> Value.TL
                TR -> Value.TR
                UK -> Value.UK
                VI_VN -> Value.VI_VN
                ZH_CN -> Value.ZH_CN
                ZH_HK -> Value.ZH_HK
                ZH_TW -> Value.ZH_TW
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
                AF_ZA -> Known.AF_ZA
                AR_EG -> Known.AR_EG
                BG -> Known.BG
                BN -> Known.BN
                CA_ES -> Known.CA_ES
                CS -> Known.CS
                DA_DK -> Known.DA_DK
                DE -> Known.DE
                EL_GR -> Known.EL_GR
                EN -> Known.EN
                EN_GB -> Known.EN_GB
                ES -> Known.ES
                ES_MX -> Known.ES_MX
                ET_EE -> Known.ET_EE
                FI -> Known.FI
                FR -> Known.FR
                FR_CA -> Known.FR_CA
                HE_IL -> Known.HE_IL
                HI_IN -> Known.HI_IN
                HR -> Known.HR
                HU -> Known.HU
                ID -> Known.ID
                IT -> Known.IT
                JA -> Known.JA
                KO_KR -> Known.KO_KR
                LT_LT -> Known.LT_LT
                MS -> Known.MS
                NL -> Known.NL
                NO -> Known.NO
                PL -> Known.PL
                PT_BR -> Known.PT_BR
                PT_PT -> Known.PT_PT
                RO -> Known.RO
                RU -> Known.RU
                SK_SK -> Known.SK_SK
                SL -> Known.SL
                SV -> Known.SV
                TH -> Known.TH
                TL -> Known.TL
                TR -> Known.TR
                UK -> Known.UK
                VI_VN -> Known.VI_VN
                ZH_CN -> Known.ZH_CN
                ZH_HK -> Known.ZH_HK
                ZH_TW -> Known.ZH_TW
                else -> throw HubSpotInvalidDataException("Unknown Language: $value")
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
        fun validate(): Language = apply {
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

            return other is Language && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicExportViewRequest &&
            associatedObjectType == other.associatedObjectType &&
            exportInternalValuesOptions == other.exportInternalValuesOptions &&
            exportName == other.exportName &&
            exportType == other.exportType &&
            format == other.format &&
            includeLabeledAssociations == other.includeLabeledAssociations &&
            includePrimaryDisplayPropertyForAssociatedObjects ==
                other.includePrimaryDisplayPropertyForAssociatedObjects &&
            language == other.language &&
            objectProperties == other.objectProperties &&
            objectType == other.objectType &&
            overrideAssociatedObjectsPerDefinitionPerRowLimit ==
                other.overrideAssociatedObjectsPerDefinitionPerRowLimit &&
            publicCrmSearchRequest == other.publicCrmSearchRequest &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            associatedObjectType,
            exportInternalValuesOptions,
            exportName,
            exportType,
            format,
            includeLabeledAssociations,
            includePrimaryDisplayPropertyForAssociatedObjects,
            language,
            objectProperties,
            objectType,
            overrideAssociatedObjectsPerDefinitionPerRowLimit,
            publicCrmSearchRequest,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicExportViewRequest{associatedObjectType=$associatedObjectType, exportInternalValuesOptions=$exportInternalValuesOptions, exportName=$exportName, exportType=$exportType, format=$format, includeLabeledAssociations=$includeLabeledAssociations, includePrimaryDisplayPropertyForAssociatedObjects=$includePrimaryDisplayPropertyForAssociatedObjects, language=$language, objectProperties=$objectProperties, objectType=$objectType, overrideAssociatedObjectsPerDefinitionPerRowLimit=$overrideAssociatedObjectsPerDefinitionPerRowLimit, publicCrmSearchRequest=$publicCrmSearchRequest, additionalProperties=$additionalProperties}"
}
