// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.exports

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.core.Enum
import com.hubspot.core.ExcludeMissing
import com.hubspot.core.JsonField
import com.hubspot.core.JsonMissing
import com.hubspot.core.JsonValue
import com.hubspot.core.checkKnown
import com.hubspot.core.checkRequired
import com.hubspot.core.toImmutable
import com.hubspot.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class PublicExportListRequest
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
    private val listId: JsonField<String>,
    private val objectProperties: JsonField<List<String>>,
    private val objectType: JsonField<String>,
    private val overrideAssociatedObjectsPerDefinitionPerRowLimit: JsonField<Boolean>,
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
        @JsonProperty("listId") @ExcludeMissing listId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("objectProperties")
        @ExcludeMissing
        objectProperties: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("objectType")
        @ExcludeMissing
        objectType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("overrideAssociatedObjectsPerDefinitionPerRowLimit")
        @ExcludeMissing
        overrideAssociatedObjectsPerDefinitionPerRowLimit: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        associatedObjectType,
        exportInternalValuesOptions,
        exportName,
        exportType,
        format,
        includeLabeledAssociations,
        includePrimaryDisplayPropertyForAssociatedObjects,
        language,
        listId,
        objectProperties,
        objectType,
        overrideAssociatedObjectsPerDefinitionPerRowLimit,
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
    fun listId(): String = listId.getRequired("listId")

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
     * Returns the raw JSON value of [listId].
     *
     * Unlike [listId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("listId") @ExcludeMissing fun _listId(): JsonField<String> = listId

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
         * Returns a mutable builder for constructing an instance of [PublicExportListRequest].
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
         * .listId()
         * .objectProperties()
         * .objectType()
         * .overrideAssociatedObjectsPerDefinitionPerRowLimit()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicExportListRequest]. */
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
        private var listId: JsonField<String>? = null
        private var objectProperties: JsonField<MutableList<String>>? = null
        private var objectType: JsonField<String>? = null
        private var overrideAssociatedObjectsPerDefinitionPerRowLimit: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicExportListRequest: PublicExportListRequest) = apply {
            associatedObjectType =
                publicExportListRequest.associatedObjectType.map { it.toMutableList() }
            exportInternalValuesOptions =
                publicExportListRequest.exportInternalValuesOptions.map { it.toMutableList() }
            exportName = publicExportListRequest.exportName
            exportType = publicExportListRequest.exportType
            format = publicExportListRequest.format
            includeLabeledAssociations = publicExportListRequest.includeLabeledAssociations
            includePrimaryDisplayPropertyForAssociatedObjects =
                publicExportListRequest.includePrimaryDisplayPropertyForAssociatedObjects
            language = publicExportListRequest.language
            listId = publicExportListRequest.listId
            objectProperties = publicExportListRequest.objectProperties.map { it.toMutableList() }
            objectType = publicExportListRequest.objectType
            overrideAssociatedObjectsPerDefinitionPerRowLimit =
                publicExportListRequest.overrideAssociatedObjectsPerDefinitionPerRowLimit
            additionalProperties = publicExportListRequest.additionalProperties.toMutableMap()
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

        fun listId(listId: String) = listId(JsonField.of(listId))

        /**
         * Sets [Builder.listId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.listId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun listId(listId: JsonField<String>) = apply { this.listId = listId }

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
         * Returns an immutable instance of [PublicExportListRequest].
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
         * .listId()
         * .objectProperties()
         * .objectType()
         * .overrideAssociatedObjectsPerDefinitionPerRowLimit()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicExportListRequest =
            PublicExportListRequest(
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
                checkRequired("listId", listId),
                checkRequired("objectProperties", objectProperties).map { it.toImmutable() },
                checkRequired("objectType", objectType),
                checkRequired(
                    "overrideAssociatedObjectsPerDefinitionPerRowLimit",
                    overrideAssociatedObjectsPerDefinitionPerRowLimit,
                ),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicExportListRequest = apply {
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
        listId()
        objectProperties()
        objectType()
        overrideAssociatedObjectsPerDefinitionPerRowLimit()
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
            (if (listId.asKnown().isPresent) 1 else 0) +
            (objectProperties.asKnown().getOrNull()?.size ?: 0) +
            (if (objectType.asKnown().isPresent) 1 else 0) +
            (if (overrideAssociatedObjectsPerDefinitionPerRowLimit.asKnown().isPresent) 1 else 0)

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

            @JvmField val LIST = of("LIST")

            @JvmStatic fun of(value: String) = ExportType(JsonField.of(value))
        }

        /** An enum containing [ExportType]'s known values. */
        enum class Known {
            LIST
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
            LIST,
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
                LIST -> Value.LIST
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
                LIST -> Known.LIST
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

            @JvmField val XLS = of("XLS")

            @JvmField val XLSX = of("XLSX")

            @JvmField val CSV = of("CSV")

            @JvmStatic fun of(value: String) = Format(JsonField.of(value))
        }

        /** An enum containing [Format]'s known values. */
        enum class Known {
            XLS,
            XLSX,
            CSV,
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
            XLS,
            XLSX,
            CSV,
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
                XLS -> Value.XLS
                XLSX -> Value.XLSX
                CSV -> Value.CSV
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
                XLS -> Known.XLS
                XLSX -> Known.XLSX
                CSV -> Known.CSV
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

            @JvmField val EN = of("EN")

            @JvmField val DE = of("DE")

            @JvmField val ES = of("ES")

            @JvmField val FR = of("FR")

            @JvmField val JA = of("JA")

            @JvmField val NL = of("NL")

            @JvmField val PT_BR = of("PT_BR")

            @JvmField val IT = of("IT")

            @JvmField val PL = of("PL")

            @JvmField val SV = of("SV")

            @JvmField val FI = of("FI")

            @JvmField val ZH_TW = of("ZH_TW")

            @JvmField val DA_DK = of("DA_DK")

            @JvmField val NO = of("NO")

            @JvmField val KO_KR = of("KO_KR")

            @JvmField val TH = of("TH")

            @JvmField val ZH_CN = of("ZH_CN")

            @JvmStatic fun of(value: String) = Language(JsonField.of(value))
        }

        /** An enum containing [Language]'s known values. */
        enum class Known {
            EN,
            DE,
            ES,
            FR,
            JA,
            NL,
            PT_BR,
            IT,
            PL,
            SV,
            FI,
            ZH_TW,
            DA_DK,
            NO,
            KO_KR,
            TH,
            ZH_CN,
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
            EN,
            DE,
            ES,
            FR,
            JA,
            NL,
            PT_BR,
            IT,
            PL,
            SV,
            FI,
            ZH_TW,
            DA_DK,
            NO,
            KO_KR,
            TH,
            ZH_CN,
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
                EN -> Value.EN
                DE -> Value.DE
                ES -> Value.ES
                FR -> Value.FR
                JA -> Value.JA
                NL -> Value.NL
                PT_BR -> Value.PT_BR
                IT -> Value.IT
                PL -> Value.PL
                SV -> Value.SV
                FI -> Value.FI
                ZH_TW -> Value.ZH_TW
                DA_DK -> Value.DA_DK
                NO -> Value.NO
                KO_KR -> Value.KO_KR
                TH -> Value.TH
                ZH_CN -> Value.ZH_CN
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
                EN -> Known.EN
                DE -> Known.DE
                ES -> Known.ES
                FR -> Known.FR
                JA -> Known.JA
                NL -> Known.NL
                PT_BR -> Known.PT_BR
                IT -> Known.IT
                PL -> Known.PL
                SV -> Known.SV
                FI -> Known.FI
                ZH_TW -> Known.ZH_TW
                DA_DK -> Known.DA_DK
                NO -> Known.NO
                KO_KR -> Known.KO_KR
                TH -> Known.TH
                ZH_CN -> Known.ZH_CN
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

        return other is PublicExportListRequest &&
            associatedObjectType == other.associatedObjectType &&
            exportInternalValuesOptions == other.exportInternalValuesOptions &&
            exportName == other.exportName &&
            exportType == other.exportType &&
            format == other.format &&
            includeLabeledAssociations == other.includeLabeledAssociations &&
            includePrimaryDisplayPropertyForAssociatedObjects ==
                other.includePrimaryDisplayPropertyForAssociatedObjects &&
            language == other.language &&
            listId == other.listId &&
            objectProperties == other.objectProperties &&
            objectType == other.objectType &&
            overrideAssociatedObjectsPerDefinitionPerRowLimit ==
                other.overrideAssociatedObjectsPerDefinitionPerRowLimit &&
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
            listId,
            objectProperties,
            objectType,
            overrideAssociatedObjectsPerDefinitionPerRowLimit,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicExportListRequest{associatedObjectType=$associatedObjectType, exportInternalValuesOptions=$exportInternalValuesOptions, exportName=$exportName, exportType=$exportType, format=$format, includeLabeledAssociations=$includeLabeledAssociations, includePrimaryDisplayPropertyForAssociatedObjects=$includePrimaryDisplayPropertyForAssociatedObjects, language=$language, listId=$listId, objectProperties=$objectProperties, objectType=$objectType, overrideAssociatedObjectsPerDefinitionPerRowLimit=$overrideAssociatedObjectsPerDefinitionPerRowLimit, additionalProperties=$additionalProperties}"
}
