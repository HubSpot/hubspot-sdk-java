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
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import com.hubspot_sdk.api.models.PropertyValue
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicImportError
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<Int>,
    private val errorType: JsonField<ErrorType>,
    private val sourceData: JsonField<ImportRowCore>,
    private val errorMessage: JsonField<String>,
    private val extraContext: JsonField<String>,
    private val invalidPropertyValue: JsonField<PropertyValue>,
    private val invalidValue: JsonField<String>,
    private val invalidValueToDisplay: JsonField<String>,
    private val knownColumnNumber: JsonField<Int>,
    private val objectType: JsonField<ObjectType>,
    private val objectTypeId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt") @ExcludeMissing createdAt: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("errorType")
        @ExcludeMissing
        errorType: JsonField<ErrorType> = JsonMissing.of(),
        @JsonProperty("sourceData")
        @ExcludeMissing
        sourceData: JsonField<ImportRowCore> = JsonMissing.of(),
        @JsonProperty("errorMessage")
        @ExcludeMissing
        errorMessage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("extraContext")
        @ExcludeMissing
        extraContext: JsonField<String> = JsonMissing.of(),
        @JsonProperty("invalidPropertyValue")
        @ExcludeMissing
        invalidPropertyValue: JsonField<PropertyValue> = JsonMissing.of(),
        @JsonProperty("invalidValue")
        @ExcludeMissing
        invalidValue: JsonField<String> = JsonMissing.of(),
        @JsonProperty("invalidValueToDisplay")
        @ExcludeMissing
        invalidValueToDisplay: JsonField<String> = JsonMissing.of(),
        @JsonProperty("knownColumnNumber")
        @ExcludeMissing
        knownColumnNumber: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("objectType")
        @ExcludeMissing
        objectType: JsonField<ObjectType> = JsonMissing.of(),
        @JsonProperty("objectTypeId")
        @ExcludeMissing
        objectTypeId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        errorType,
        sourceData,
        errorMessage,
        extraContext,
        invalidPropertyValue,
        invalidValue,
        invalidValueToDisplay,
        knownColumnNumber,
        objectType,
        objectTypeId,
        mutableMapOf(),
    )

    /**
     * A unique, stable identifier for this specific error.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The epoch millisecond timestamp when this error was recorded.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): Int = createdAt.getRequired("createdAt")

    /**
     * The classification of what went wrong during import processing.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun errorType(): ErrorType = errorType.getRequired("errorType")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sourceData(): ImportRowCore = sourceData.getRequired("sourceData")

    /**
     * A human-readable error message.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun errorMessage(): Optional<String> = errorMessage.getOptional("errorMessage")

    /**
     * Additional human-readable context about the error.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun extraContext(): Optional<String> = extraContext.getOptional("extraContext")

    /**
     * Represents a single custom property of a marketing event, storing its name, value, metadata
     * (like source, timestamp, and sensitivity), and related audit information for tracking
     * changes.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun invalidPropertyValue(): Optional<PropertyValue> =
        invalidPropertyValue.getOptional("invalidPropertyValue")

    /**
     * The raw string value from the import file that caused the validation failure.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun invalidValue(): Optional<String> = invalidValue.getOptional("invalidValue")

    /**
     * A convenience accessor that returns either the value from `invalidPropertyValue` or
     * `invalidValue`, whichever is present (preferring the property value).
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun invalidValueToDisplay(): Optional<String> =
        invalidValueToDisplay.getOptional("invalidValueToDisplay")

    /**
     * The zero-based column index in the import file where the error occurred
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun knownColumnNumber(): Optional<Int> = knownColumnNumber.getOptional("knownColumnNumber")

    /**
     * The CRM object type affected by this error.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun objectType(): Optional<ObjectType> = objectType.getOptional("objectType")

    /**
     * The modern object type identifier for the CRM object affected by this error.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun objectTypeId(): Optional<String> = objectTypeId.getOptional("objectTypeId")

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
    @JsonProperty("createdAt") @ExcludeMissing fun _createdAt(): JsonField<Int> = createdAt

    /**
     * Returns the raw JSON value of [errorType].
     *
     * Unlike [errorType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("errorType") @ExcludeMissing fun _errorType(): JsonField<ErrorType> = errorType

    /**
     * Returns the raw JSON value of [sourceData].
     *
     * Unlike [sourceData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceData")
    @ExcludeMissing
    fun _sourceData(): JsonField<ImportRowCore> = sourceData

    /**
     * Returns the raw JSON value of [errorMessage].
     *
     * Unlike [errorMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("errorMessage")
    @ExcludeMissing
    fun _errorMessage(): JsonField<String> = errorMessage

    /**
     * Returns the raw JSON value of [extraContext].
     *
     * Unlike [extraContext], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("extraContext")
    @ExcludeMissing
    fun _extraContext(): JsonField<String> = extraContext

    /**
     * Returns the raw JSON value of [invalidPropertyValue].
     *
     * Unlike [invalidPropertyValue], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("invalidPropertyValue")
    @ExcludeMissing
    fun _invalidPropertyValue(): JsonField<PropertyValue> = invalidPropertyValue

    /**
     * Returns the raw JSON value of [invalidValue].
     *
     * Unlike [invalidValue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invalidValue")
    @ExcludeMissing
    fun _invalidValue(): JsonField<String> = invalidValue

    /**
     * Returns the raw JSON value of [invalidValueToDisplay].
     *
     * Unlike [invalidValueToDisplay], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("invalidValueToDisplay")
    @ExcludeMissing
    fun _invalidValueToDisplay(): JsonField<String> = invalidValueToDisplay

    /**
     * Returns the raw JSON value of [knownColumnNumber].
     *
     * Unlike [knownColumnNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("knownColumnNumber")
    @ExcludeMissing
    fun _knownColumnNumber(): JsonField<Int> = knownColumnNumber

    /**
     * Returns the raw JSON value of [objectType].
     *
     * Unlike [objectType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectType")
    @ExcludeMissing
    fun _objectType(): JsonField<ObjectType> = objectType

    /**
     * Returns the raw JSON value of [objectTypeId].
     *
     * Unlike [objectTypeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectTypeId")
    @ExcludeMissing
    fun _objectTypeId(): JsonField<String> = objectTypeId

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
         * Returns a mutable builder for constructing an instance of [PublicImportError].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .errorType()
         * .sourceData()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicImportError]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<Int>? = null
        private var errorType: JsonField<ErrorType>? = null
        private var sourceData: JsonField<ImportRowCore>? = null
        private var errorMessage: JsonField<String> = JsonMissing.of()
        private var extraContext: JsonField<String> = JsonMissing.of()
        private var invalidPropertyValue: JsonField<PropertyValue> = JsonMissing.of()
        private var invalidValue: JsonField<String> = JsonMissing.of()
        private var invalidValueToDisplay: JsonField<String> = JsonMissing.of()
        private var knownColumnNumber: JsonField<Int> = JsonMissing.of()
        private var objectType: JsonField<ObjectType> = JsonMissing.of()
        private var objectTypeId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicImportError: PublicImportError) = apply {
            id = publicImportError.id
            createdAt = publicImportError.createdAt
            errorType = publicImportError.errorType
            sourceData = publicImportError.sourceData
            errorMessage = publicImportError.errorMessage
            extraContext = publicImportError.extraContext
            invalidPropertyValue = publicImportError.invalidPropertyValue
            invalidValue = publicImportError.invalidValue
            invalidValueToDisplay = publicImportError.invalidValueToDisplay
            knownColumnNumber = publicImportError.knownColumnNumber
            objectType = publicImportError.objectType
            objectTypeId = publicImportError.objectTypeId
            additionalProperties = publicImportError.additionalProperties.toMutableMap()
        }

        /** A unique, stable identifier for this specific error. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The epoch millisecond timestamp when this error was recorded. */
        fun createdAt(createdAt: Int) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun createdAt(createdAt: JsonField<Int>) = apply { this.createdAt = createdAt }

        /** The classification of what went wrong during import processing. */
        fun errorType(errorType: ErrorType) = errorType(JsonField.of(errorType))

        /**
         * Sets [Builder.errorType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errorType] with a well-typed [ErrorType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun errorType(errorType: JsonField<ErrorType>) = apply { this.errorType = errorType }

        fun sourceData(sourceData: ImportRowCore) = sourceData(JsonField.of(sourceData))

        /**
         * Sets [Builder.sourceData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceData] with a well-typed [ImportRowCore] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sourceData(sourceData: JsonField<ImportRowCore>) = apply {
            this.sourceData = sourceData
        }

        /** A human-readable error message. */
        fun errorMessage(errorMessage: String) = errorMessage(JsonField.of(errorMessage))

        /**
         * Sets [Builder.errorMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errorMessage] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun errorMessage(errorMessage: JsonField<String>) = apply {
            this.errorMessage = errorMessage
        }

        /** Additional human-readable context about the error. */
        fun extraContext(extraContext: String) = extraContext(JsonField.of(extraContext))

        /**
         * Sets [Builder.extraContext] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extraContext] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun extraContext(extraContext: JsonField<String>) = apply {
            this.extraContext = extraContext
        }

        /**
         * Represents a single custom property of a marketing event, storing its name, value,
         * metadata (like source, timestamp, and sensitivity), and related audit information for
         * tracking changes.
         */
        fun invalidPropertyValue(invalidPropertyValue: PropertyValue) =
            invalidPropertyValue(JsonField.of(invalidPropertyValue))

        /**
         * Sets [Builder.invalidPropertyValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invalidPropertyValue] with a well-typed [PropertyValue]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun invalidPropertyValue(invalidPropertyValue: JsonField<PropertyValue>) = apply {
            this.invalidPropertyValue = invalidPropertyValue
        }

        /** The raw string value from the import file that caused the validation failure. */
        fun invalidValue(invalidValue: String) = invalidValue(JsonField.of(invalidValue))

        /**
         * Sets [Builder.invalidValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invalidValue] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun invalidValue(invalidValue: JsonField<String>) = apply {
            this.invalidValue = invalidValue
        }

        /**
         * A convenience accessor that returns either the value from `invalidPropertyValue` or
         * `invalidValue`, whichever is present (preferring the property value).
         */
        fun invalidValueToDisplay(invalidValueToDisplay: String) =
            invalidValueToDisplay(JsonField.of(invalidValueToDisplay))

        /**
         * Sets [Builder.invalidValueToDisplay] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invalidValueToDisplay] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun invalidValueToDisplay(invalidValueToDisplay: JsonField<String>) = apply {
            this.invalidValueToDisplay = invalidValueToDisplay
        }

        /** The zero-based column index in the import file where the error occurred */
        fun knownColumnNumber(knownColumnNumber: Int) =
            knownColumnNumber(JsonField.of(knownColumnNumber))

        /**
         * Sets [Builder.knownColumnNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.knownColumnNumber] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun knownColumnNumber(knownColumnNumber: JsonField<Int>) = apply {
            this.knownColumnNumber = knownColumnNumber
        }

        /** The CRM object type affected by this error. */
        fun objectType(objectType: ObjectType) = objectType(JsonField.of(objectType))

        /**
         * Sets [Builder.objectType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectType] with a well-typed [ObjectType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun objectType(objectType: JsonField<ObjectType>) = apply { this.objectType = objectType }

        /** The modern object type identifier for the CRM object affected by this error. */
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
         * Returns an immutable instance of [PublicImportError].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .errorType()
         * .sourceData()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicImportError =
            PublicImportError(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("errorType", errorType),
                checkRequired("sourceData", sourceData),
                errorMessage,
                extraContext,
                invalidPropertyValue,
                invalidValue,
                invalidValueToDisplay,
                knownColumnNumber,
                objectType,
                objectTypeId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicImportError = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        errorType().validate()
        sourceData().validate()
        errorMessage()
        extraContext()
        invalidPropertyValue().ifPresent { it.validate() }
        invalidValue()
        invalidValueToDisplay()
        knownColumnNumber()
        objectType().ifPresent { it.validate() }
        objectTypeId()
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
            (errorType.asKnown().getOrNull()?.validity() ?: 0) +
            (sourceData.asKnown().getOrNull()?.validity() ?: 0) +
            (if (errorMessage.asKnown().isPresent) 1 else 0) +
            (if (extraContext.asKnown().isPresent) 1 else 0) +
            (invalidPropertyValue.asKnown().getOrNull()?.validity() ?: 0) +
            (if (invalidValue.asKnown().isPresent) 1 else 0) +
            (if (invalidValueToDisplay.asKnown().isPresent) 1 else 0) +
            (if (knownColumnNumber.asKnown().isPresent) 1 else 0) +
            (objectType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (objectTypeId.asKnown().isPresent) 1 else 0)

    /** The classification of what went wrong during import processing. */
    class ErrorType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val AMBIGUOUS_ENUMERATION_OPTION = of("AMBIGUOUS_ENUMERATION_OPTION")

            @JvmField val ASSOCIATION_LABEL_NOT_FOUND = of("ASSOCIATION_LABEL_NOT_FOUND")

            @JvmField val ASSOCIATION_LIMIT_EXCEEDED = of("ASSOCIATION_LIMIT_EXCEEDED")

            @JvmField val ASSOCIATION_RECORD_NOT_FOUND = of("ASSOCIATION_RECORD_NOT_FOUND")

            @JvmField val COLUMN_TOO_LARGE = of("COLUMN_TOO_LARGE")

            @JvmField val COULD_NOT_FIND_BUSINESS_UNIT = of("COULD_NOT_FIND_BUSINESS_UNIT")

            @JvmField val COULD_NOT_FIND_OWNER = of("COULD_NOT_FIND_OWNER")

            @JvmField val COULD_NOT_PARSE_DATE = of("COULD_NOT_PARSE_DATE")

            @JvmField val COULD_NOT_PARSE_NUMBER = of("COULD_NOT_PARSE_NUMBER")

            @JvmField val COULD_NOT_PARSE_ROW = of("COULD_NOT_PARSE_ROW")

            @JvmField val COULD_NOT_PARSE_TERM = of("COULD_NOT_PARSE_TERM")

            @JvmField val CREATE_ONLY_IMPORT = of("CREATE_ONLY_IMPORT")

            @JvmField val DUPLICATE_ALTERNATE_ID = of("DUPLICATE_ALTERNATE_ID")

            @JvmField val DUPLICATE_ASSOCIATION_ID = of("DUPLICATE_ASSOCIATION_ID")

            @JvmField val DUPLICATE_EVENT = of("DUPLICATE_EVENT")

            @JvmField val DUPLICATE_OBJECT_ID = of("DUPLICATE_OBJECT_ID")

            @JvmField val DUPLICATE_RECORD_ID = of("DUPLICATE_RECORD_ID")

            @JvmField val DUPLICATE_ROW_CONTENT = of("DUPLICATE_ROW_CONTENT")

            @JvmField val DUPLICATE_UNIQUE_CREATION_KEY = of("DUPLICATE_UNIQUE_CREATION_KEY")

            @JvmField val DUPLICATE_UNIQUE_PROPERTY_VALUE = of("DUPLICATE_UNIQUE_PROPERTY_VALUE")

            @JvmField val FAILED_TO_CREATE_ASSOCIATION = of("FAILED_TO_CREATE_ASSOCIATION")

            @JvmField
            val FAILED_TO_FIND_RECORD_FOR_ASSOCIATIONS =
                of("FAILED_TO_FIND_RECORD_FOR_ASSOCIATIONS")

            @JvmField val FAILED_TO_OPT_OUT_CONTACT = of("FAILED_TO_OPT_OUT_CONTACT")

            @JvmField
            val FAILED_TO_PROCESS_OBJECT_WITH_EMPTY_PROPERTY_VALUES =
                of("FAILED_TO_PROCESS_OBJECT_WITH_EMPTY_PROPERTY_VALUES")

            @JvmField val FAILED_VALIDATION = of("FAILED_VALIDATION")

            @JvmField val FILE_NOT_FOUND = of("FILE_NOT_FOUND")

            @JvmField val GDPR_BLACKLISTED_EMAIL = of("GDPR_BLACKLISTED_EMAIL")

            @JvmField val INCORRECT_NUMBER_OF_COLUMNS = of("INCORRECT_NUMBER_OF_COLUMNS")

            @JvmField val INVALID_ALTERNATE_ID = of("INVALID_ALTERNATE_ID")

            @JvmField val INVALID_ASSOCIATION_IDENTIFIER = of("INVALID_ASSOCIATION_IDENTIFIER")

            @JvmField val INVALID_ASSOCIATION_KEY = of("INVALID_ASSOCIATION_KEY")

            @JvmField val INVALID_COLUMN_CONFIGURATION = of("INVALID_COLUMN_CONFIGURATION")

            @JvmField
            val INVALID_CUSTOM_PROPERTY_VALIDATION = of("INVALID_CUSTOM_PROPERTY_VALIDATION")

            @JvmField val INVALID_DOMAIN = of("INVALID_DOMAIN")

            @JvmField val INVALID_EMAIL = of("INVALID_EMAIL")

            @JvmField val INVALID_ENUM_FILE_ID_OR_URL = of("INVALID_ENUM_FILE_ID_OR_URL")

            @JvmField val INVALID_ENUMERATION_OPTION = of("INVALID_ENUMERATION_OPTION")

            @JvmField val INVALID_EVENT = of("INVALID_EVENT")

            @JvmField val INVALID_EVENT_TIMESTAMP = of("INVALID_EVENT_TIMESTAMP")

            @JvmField val INVALID_FILE_TYPE = of("INVALID_FILE_TYPE")

            @JvmField val INVALID_NUMBER_SIZE = of("INVALID_NUMBER_SIZE")

            @JvmField val INVALID_OBJECT_ID = of("INVALID_OBJECT_ID")

            @JvmField val INVALID_PROPERTY_VALUE_FORMAT = of("INVALID_PROPERTY_VALUE_FORMAT")

            @JvmField val INVALID_RECORD_ID = of("INVALID_RECORD_ID")

            @JvmField val INVALID_REQUIRED_PROPERTY = of("INVALID_REQUIRED_PROPERTY")

            @JvmField val INVALID_SHEET_COUNT = of("INVALID_SHEET_COUNT")

            @JvmField val INVALID_SPREADSHEET = of("INVALID_SPREADSHEET")

            @JvmField val LIMIT_EXCEEDED = of("LIMIT_EXCEEDED")

            @JvmField val MANY_ERRORS_IN_ROW = of("MANY_ERRORS_IN_ROW")

            @JvmField val MISSING_EVENT_DEFINITION = of("MISSING_EVENT_DEFINITION")

            @JvmField val MISSING_EVENT_TIMESTAMP = of("MISSING_EVENT_TIMESTAMP")

            @JvmField val MISSING_OBJECT_DEFINITION = of("MISSING_OBJECT_DEFINITION")

            @JvmField val MISSING_REQUIRED_PROPERTY = of("MISSING_REQUIRED_PROPERTY")

            @JvmField
            val MULTIPLE_COMPANIES_WITH_THIS_DOMAIN = of("MULTIPLE_COMPANIES_WITH_THIS_DOMAIN")

            @JvmField val MULTIPLE_OWNERS_FOUND = of("MULTIPLE_OWNERS_FOUND")

            @JvmField
            val NO_OBJECT_ID_FROM_ASSOCIATION_IDENTIFIER =
                of("NO_OBJECT_ID_FROM_ASSOCIATION_IDENTIFIER")

            @JvmField val OUTSIDE_VALID_TERM_RANGE = of("OUTSIDE_VALID_TERM_RANGE")

            @JvmField val OUTSIDE_VALID_TIME_RANGE = of("OUTSIDE_VALID_TIME_RANGE")

            @JvmField
            val PORTAL_WIDE_CUSTOM_OBJECT_LIMIT_EXCEEDED =
                of("PORTAL_WIDE_CUSTOM_OBJECT_LIMIT_EXCEEDED")

            @JvmField val PROPERTY_DEFINITION_NOT_FOUND = of("PROPERTY_DEFINITION_NOT_FOUND")

            @JvmField val PROPERTY_VALUE_NOT_FOUND = of("PROPERTY_VALUE_NOT_FOUND")

            @JvmField val ROW_DATA_TOO_LARGE = of("ROW_DATA_TOO_LARGE")

            @JvmField val SECONDARY_EMAIL_WRITE_FAILURE = of("SECONDARY_EMAIL_WRITE_FAILURE")

            @JvmField val UNKNOWN_ASSOCIATION_RECORD_ID = of("UNKNOWN_ASSOCIATION_RECORD_ID")

            @JvmField val UNKNOWN_BAD_REQUEST = of("UNKNOWN_BAD_REQUEST")

            @JvmField val UNKNOWN_ERROR = of("UNKNOWN_ERROR")

            @JvmField val UPDATE_ONLY_IMPORT = of("UPDATE_ONLY_IMPORT")

            @JvmStatic fun of(value: String) = ErrorType(JsonField.of(value))
        }

        /** An enum containing [ErrorType]'s known values. */
        enum class Known {
            AMBIGUOUS_ENUMERATION_OPTION,
            ASSOCIATION_LABEL_NOT_FOUND,
            ASSOCIATION_LIMIT_EXCEEDED,
            ASSOCIATION_RECORD_NOT_FOUND,
            COLUMN_TOO_LARGE,
            COULD_NOT_FIND_BUSINESS_UNIT,
            COULD_NOT_FIND_OWNER,
            COULD_NOT_PARSE_DATE,
            COULD_NOT_PARSE_NUMBER,
            COULD_NOT_PARSE_ROW,
            COULD_NOT_PARSE_TERM,
            CREATE_ONLY_IMPORT,
            DUPLICATE_ALTERNATE_ID,
            DUPLICATE_ASSOCIATION_ID,
            DUPLICATE_EVENT,
            DUPLICATE_OBJECT_ID,
            DUPLICATE_RECORD_ID,
            DUPLICATE_ROW_CONTENT,
            DUPLICATE_UNIQUE_CREATION_KEY,
            DUPLICATE_UNIQUE_PROPERTY_VALUE,
            FAILED_TO_CREATE_ASSOCIATION,
            FAILED_TO_FIND_RECORD_FOR_ASSOCIATIONS,
            FAILED_TO_OPT_OUT_CONTACT,
            FAILED_TO_PROCESS_OBJECT_WITH_EMPTY_PROPERTY_VALUES,
            FAILED_VALIDATION,
            FILE_NOT_FOUND,
            GDPR_BLACKLISTED_EMAIL,
            INCORRECT_NUMBER_OF_COLUMNS,
            INVALID_ALTERNATE_ID,
            INVALID_ASSOCIATION_IDENTIFIER,
            INVALID_ASSOCIATION_KEY,
            INVALID_COLUMN_CONFIGURATION,
            INVALID_CUSTOM_PROPERTY_VALIDATION,
            INVALID_DOMAIN,
            INVALID_EMAIL,
            INVALID_ENUM_FILE_ID_OR_URL,
            INVALID_ENUMERATION_OPTION,
            INVALID_EVENT,
            INVALID_EVENT_TIMESTAMP,
            INVALID_FILE_TYPE,
            INVALID_NUMBER_SIZE,
            INVALID_OBJECT_ID,
            INVALID_PROPERTY_VALUE_FORMAT,
            INVALID_RECORD_ID,
            INVALID_REQUIRED_PROPERTY,
            INVALID_SHEET_COUNT,
            INVALID_SPREADSHEET,
            LIMIT_EXCEEDED,
            MANY_ERRORS_IN_ROW,
            MISSING_EVENT_DEFINITION,
            MISSING_EVENT_TIMESTAMP,
            MISSING_OBJECT_DEFINITION,
            MISSING_REQUIRED_PROPERTY,
            MULTIPLE_COMPANIES_WITH_THIS_DOMAIN,
            MULTIPLE_OWNERS_FOUND,
            NO_OBJECT_ID_FROM_ASSOCIATION_IDENTIFIER,
            OUTSIDE_VALID_TERM_RANGE,
            OUTSIDE_VALID_TIME_RANGE,
            PORTAL_WIDE_CUSTOM_OBJECT_LIMIT_EXCEEDED,
            PROPERTY_DEFINITION_NOT_FOUND,
            PROPERTY_VALUE_NOT_FOUND,
            ROW_DATA_TOO_LARGE,
            SECONDARY_EMAIL_WRITE_FAILURE,
            UNKNOWN_ASSOCIATION_RECORD_ID,
            UNKNOWN_BAD_REQUEST,
            UNKNOWN_ERROR,
            UPDATE_ONLY_IMPORT,
        }

        /**
         * An enum containing [ErrorType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ErrorType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AMBIGUOUS_ENUMERATION_OPTION,
            ASSOCIATION_LABEL_NOT_FOUND,
            ASSOCIATION_LIMIT_EXCEEDED,
            ASSOCIATION_RECORD_NOT_FOUND,
            COLUMN_TOO_LARGE,
            COULD_NOT_FIND_BUSINESS_UNIT,
            COULD_NOT_FIND_OWNER,
            COULD_NOT_PARSE_DATE,
            COULD_NOT_PARSE_NUMBER,
            COULD_NOT_PARSE_ROW,
            COULD_NOT_PARSE_TERM,
            CREATE_ONLY_IMPORT,
            DUPLICATE_ALTERNATE_ID,
            DUPLICATE_ASSOCIATION_ID,
            DUPLICATE_EVENT,
            DUPLICATE_OBJECT_ID,
            DUPLICATE_RECORD_ID,
            DUPLICATE_ROW_CONTENT,
            DUPLICATE_UNIQUE_CREATION_KEY,
            DUPLICATE_UNIQUE_PROPERTY_VALUE,
            FAILED_TO_CREATE_ASSOCIATION,
            FAILED_TO_FIND_RECORD_FOR_ASSOCIATIONS,
            FAILED_TO_OPT_OUT_CONTACT,
            FAILED_TO_PROCESS_OBJECT_WITH_EMPTY_PROPERTY_VALUES,
            FAILED_VALIDATION,
            FILE_NOT_FOUND,
            GDPR_BLACKLISTED_EMAIL,
            INCORRECT_NUMBER_OF_COLUMNS,
            INVALID_ALTERNATE_ID,
            INVALID_ASSOCIATION_IDENTIFIER,
            INVALID_ASSOCIATION_KEY,
            INVALID_COLUMN_CONFIGURATION,
            INVALID_CUSTOM_PROPERTY_VALIDATION,
            INVALID_DOMAIN,
            INVALID_EMAIL,
            INVALID_ENUM_FILE_ID_OR_URL,
            INVALID_ENUMERATION_OPTION,
            INVALID_EVENT,
            INVALID_EVENT_TIMESTAMP,
            INVALID_FILE_TYPE,
            INVALID_NUMBER_SIZE,
            INVALID_OBJECT_ID,
            INVALID_PROPERTY_VALUE_FORMAT,
            INVALID_RECORD_ID,
            INVALID_REQUIRED_PROPERTY,
            INVALID_SHEET_COUNT,
            INVALID_SPREADSHEET,
            LIMIT_EXCEEDED,
            MANY_ERRORS_IN_ROW,
            MISSING_EVENT_DEFINITION,
            MISSING_EVENT_TIMESTAMP,
            MISSING_OBJECT_DEFINITION,
            MISSING_REQUIRED_PROPERTY,
            MULTIPLE_COMPANIES_WITH_THIS_DOMAIN,
            MULTIPLE_OWNERS_FOUND,
            NO_OBJECT_ID_FROM_ASSOCIATION_IDENTIFIER,
            OUTSIDE_VALID_TERM_RANGE,
            OUTSIDE_VALID_TIME_RANGE,
            PORTAL_WIDE_CUSTOM_OBJECT_LIMIT_EXCEEDED,
            PROPERTY_DEFINITION_NOT_FOUND,
            PROPERTY_VALUE_NOT_FOUND,
            ROW_DATA_TOO_LARGE,
            SECONDARY_EMAIL_WRITE_FAILURE,
            UNKNOWN_ASSOCIATION_RECORD_ID,
            UNKNOWN_BAD_REQUEST,
            UNKNOWN_ERROR,
            UPDATE_ONLY_IMPORT,
            /**
             * An enum member indicating that [ErrorType] was instantiated with an unknown value.
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
                AMBIGUOUS_ENUMERATION_OPTION -> Value.AMBIGUOUS_ENUMERATION_OPTION
                ASSOCIATION_LABEL_NOT_FOUND -> Value.ASSOCIATION_LABEL_NOT_FOUND
                ASSOCIATION_LIMIT_EXCEEDED -> Value.ASSOCIATION_LIMIT_EXCEEDED
                ASSOCIATION_RECORD_NOT_FOUND -> Value.ASSOCIATION_RECORD_NOT_FOUND
                COLUMN_TOO_LARGE -> Value.COLUMN_TOO_LARGE
                COULD_NOT_FIND_BUSINESS_UNIT -> Value.COULD_NOT_FIND_BUSINESS_UNIT
                COULD_NOT_FIND_OWNER -> Value.COULD_NOT_FIND_OWNER
                COULD_NOT_PARSE_DATE -> Value.COULD_NOT_PARSE_DATE
                COULD_NOT_PARSE_NUMBER -> Value.COULD_NOT_PARSE_NUMBER
                COULD_NOT_PARSE_ROW -> Value.COULD_NOT_PARSE_ROW
                COULD_NOT_PARSE_TERM -> Value.COULD_NOT_PARSE_TERM
                CREATE_ONLY_IMPORT -> Value.CREATE_ONLY_IMPORT
                DUPLICATE_ALTERNATE_ID -> Value.DUPLICATE_ALTERNATE_ID
                DUPLICATE_ASSOCIATION_ID -> Value.DUPLICATE_ASSOCIATION_ID
                DUPLICATE_EVENT -> Value.DUPLICATE_EVENT
                DUPLICATE_OBJECT_ID -> Value.DUPLICATE_OBJECT_ID
                DUPLICATE_RECORD_ID -> Value.DUPLICATE_RECORD_ID
                DUPLICATE_ROW_CONTENT -> Value.DUPLICATE_ROW_CONTENT
                DUPLICATE_UNIQUE_CREATION_KEY -> Value.DUPLICATE_UNIQUE_CREATION_KEY
                DUPLICATE_UNIQUE_PROPERTY_VALUE -> Value.DUPLICATE_UNIQUE_PROPERTY_VALUE
                FAILED_TO_CREATE_ASSOCIATION -> Value.FAILED_TO_CREATE_ASSOCIATION
                FAILED_TO_FIND_RECORD_FOR_ASSOCIATIONS ->
                    Value.FAILED_TO_FIND_RECORD_FOR_ASSOCIATIONS
                FAILED_TO_OPT_OUT_CONTACT -> Value.FAILED_TO_OPT_OUT_CONTACT
                FAILED_TO_PROCESS_OBJECT_WITH_EMPTY_PROPERTY_VALUES ->
                    Value.FAILED_TO_PROCESS_OBJECT_WITH_EMPTY_PROPERTY_VALUES
                FAILED_VALIDATION -> Value.FAILED_VALIDATION
                FILE_NOT_FOUND -> Value.FILE_NOT_FOUND
                GDPR_BLACKLISTED_EMAIL -> Value.GDPR_BLACKLISTED_EMAIL
                INCORRECT_NUMBER_OF_COLUMNS -> Value.INCORRECT_NUMBER_OF_COLUMNS
                INVALID_ALTERNATE_ID -> Value.INVALID_ALTERNATE_ID
                INVALID_ASSOCIATION_IDENTIFIER -> Value.INVALID_ASSOCIATION_IDENTIFIER
                INVALID_ASSOCIATION_KEY -> Value.INVALID_ASSOCIATION_KEY
                INVALID_COLUMN_CONFIGURATION -> Value.INVALID_COLUMN_CONFIGURATION
                INVALID_CUSTOM_PROPERTY_VALIDATION -> Value.INVALID_CUSTOM_PROPERTY_VALIDATION
                INVALID_DOMAIN -> Value.INVALID_DOMAIN
                INVALID_EMAIL -> Value.INVALID_EMAIL
                INVALID_ENUM_FILE_ID_OR_URL -> Value.INVALID_ENUM_FILE_ID_OR_URL
                INVALID_ENUMERATION_OPTION -> Value.INVALID_ENUMERATION_OPTION
                INVALID_EVENT -> Value.INVALID_EVENT
                INVALID_EVENT_TIMESTAMP -> Value.INVALID_EVENT_TIMESTAMP
                INVALID_FILE_TYPE -> Value.INVALID_FILE_TYPE
                INVALID_NUMBER_SIZE -> Value.INVALID_NUMBER_SIZE
                INVALID_OBJECT_ID -> Value.INVALID_OBJECT_ID
                INVALID_PROPERTY_VALUE_FORMAT -> Value.INVALID_PROPERTY_VALUE_FORMAT
                INVALID_RECORD_ID -> Value.INVALID_RECORD_ID
                INVALID_REQUIRED_PROPERTY -> Value.INVALID_REQUIRED_PROPERTY
                INVALID_SHEET_COUNT -> Value.INVALID_SHEET_COUNT
                INVALID_SPREADSHEET -> Value.INVALID_SPREADSHEET
                LIMIT_EXCEEDED -> Value.LIMIT_EXCEEDED
                MANY_ERRORS_IN_ROW -> Value.MANY_ERRORS_IN_ROW
                MISSING_EVENT_DEFINITION -> Value.MISSING_EVENT_DEFINITION
                MISSING_EVENT_TIMESTAMP -> Value.MISSING_EVENT_TIMESTAMP
                MISSING_OBJECT_DEFINITION -> Value.MISSING_OBJECT_DEFINITION
                MISSING_REQUIRED_PROPERTY -> Value.MISSING_REQUIRED_PROPERTY
                MULTIPLE_COMPANIES_WITH_THIS_DOMAIN -> Value.MULTIPLE_COMPANIES_WITH_THIS_DOMAIN
                MULTIPLE_OWNERS_FOUND -> Value.MULTIPLE_OWNERS_FOUND
                NO_OBJECT_ID_FROM_ASSOCIATION_IDENTIFIER ->
                    Value.NO_OBJECT_ID_FROM_ASSOCIATION_IDENTIFIER
                OUTSIDE_VALID_TERM_RANGE -> Value.OUTSIDE_VALID_TERM_RANGE
                OUTSIDE_VALID_TIME_RANGE -> Value.OUTSIDE_VALID_TIME_RANGE
                PORTAL_WIDE_CUSTOM_OBJECT_LIMIT_EXCEEDED ->
                    Value.PORTAL_WIDE_CUSTOM_OBJECT_LIMIT_EXCEEDED
                PROPERTY_DEFINITION_NOT_FOUND -> Value.PROPERTY_DEFINITION_NOT_FOUND
                PROPERTY_VALUE_NOT_FOUND -> Value.PROPERTY_VALUE_NOT_FOUND
                ROW_DATA_TOO_LARGE -> Value.ROW_DATA_TOO_LARGE
                SECONDARY_EMAIL_WRITE_FAILURE -> Value.SECONDARY_EMAIL_WRITE_FAILURE
                UNKNOWN_ASSOCIATION_RECORD_ID -> Value.UNKNOWN_ASSOCIATION_RECORD_ID
                UNKNOWN_BAD_REQUEST -> Value.UNKNOWN_BAD_REQUEST
                UNKNOWN_ERROR -> Value.UNKNOWN_ERROR
                UPDATE_ONLY_IMPORT -> Value.UPDATE_ONLY_IMPORT
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
                AMBIGUOUS_ENUMERATION_OPTION -> Known.AMBIGUOUS_ENUMERATION_OPTION
                ASSOCIATION_LABEL_NOT_FOUND -> Known.ASSOCIATION_LABEL_NOT_FOUND
                ASSOCIATION_LIMIT_EXCEEDED -> Known.ASSOCIATION_LIMIT_EXCEEDED
                ASSOCIATION_RECORD_NOT_FOUND -> Known.ASSOCIATION_RECORD_NOT_FOUND
                COLUMN_TOO_LARGE -> Known.COLUMN_TOO_LARGE
                COULD_NOT_FIND_BUSINESS_UNIT -> Known.COULD_NOT_FIND_BUSINESS_UNIT
                COULD_NOT_FIND_OWNER -> Known.COULD_NOT_FIND_OWNER
                COULD_NOT_PARSE_DATE -> Known.COULD_NOT_PARSE_DATE
                COULD_NOT_PARSE_NUMBER -> Known.COULD_NOT_PARSE_NUMBER
                COULD_NOT_PARSE_ROW -> Known.COULD_NOT_PARSE_ROW
                COULD_NOT_PARSE_TERM -> Known.COULD_NOT_PARSE_TERM
                CREATE_ONLY_IMPORT -> Known.CREATE_ONLY_IMPORT
                DUPLICATE_ALTERNATE_ID -> Known.DUPLICATE_ALTERNATE_ID
                DUPLICATE_ASSOCIATION_ID -> Known.DUPLICATE_ASSOCIATION_ID
                DUPLICATE_EVENT -> Known.DUPLICATE_EVENT
                DUPLICATE_OBJECT_ID -> Known.DUPLICATE_OBJECT_ID
                DUPLICATE_RECORD_ID -> Known.DUPLICATE_RECORD_ID
                DUPLICATE_ROW_CONTENT -> Known.DUPLICATE_ROW_CONTENT
                DUPLICATE_UNIQUE_CREATION_KEY -> Known.DUPLICATE_UNIQUE_CREATION_KEY
                DUPLICATE_UNIQUE_PROPERTY_VALUE -> Known.DUPLICATE_UNIQUE_PROPERTY_VALUE
                FAILED_TO_CREATE_ASSOCIATION -> Known.FAILED_TO_CREATE_ASSOCIATION
                FAILED_TO_FIND_RECORD_FOR_ASSOCIATIONS ->
                    Known.FAILED_TO_FIND_RECORD_FOR_ASSOCIATIONS
                FAILED_TO_OPT_OUT_CONTACT -> Known.FAILED_TO_OPT_OUT_CONTACT
                FAILED_TO_PROCESS_OBJECT_WITH_EMPTY_PROPERTY_VALUES ->
                    Known.FAILED_TO_PROCESS_OBJECT_WITH_EMPTY_PROPERTY_VALUES
                FAILED_VALIDATION -> Known.FAILED_VALIDATION
                FILE_NOT_FOUND -> Known.FILE_NOT_FOUND
                GDPR_BLACKLISTED_EMAIL -> Known.GDPR_BLACKLISTED_EMAIL
                INCORRECT_NUMBER_OF_COLUMNS -> Known.INCORRECT_NUMBER_OF_COLUMNS
                INVALID_ALTERNATE_ID -> Known.INVALID_ALTERNATE_ID
                INVALID_ASSOCIATION_IDENTIFIER -> Known.INVALID_ASSOCIATION_IDENTIFIER
                INVALID_ASSOCIATION_KEY -> Known.INVALID_ASSOCIATION_KEY
                INVALID_COLUMN_CONFIGURATION -> Known.INVALID_COLUMN_CONFIGURATION
                INVALID_CUSTOM_PROPERTY_VALIDATION -> Known.INVALID_CUSTOM_PROPERTY_VALIDATION
                INVALID_DOMAIN -> Known.INVALID_DOMAIN
                INVALID_EMAIL -> Known.INVALID_EMAIL
                INVALID_ENUM_FILE_ID_OR_URL -> Known.INVALID_ENUM_FILE_ID_OR_URL
                INVALID_ENUMERATION_OPTION -> Known.INVALID_ENUMERATION_OPTION
                INVALID_EVENT -> Known.INVALID_EVENT
                INVALID_EVENT_TIMESTAMP -> Known.INVALID_EVENT_TIMESTAMP
                INVALID_FILE_TYPE -> Known.INVALID_FILE_TYPE
                INVALID_NUMBER_SIZE -> Known.INVALID_NUMBER_SIZE
                INVALID_OBJECT_ID -> Known.INVALID_OBJECT_ID
                INVALID_PROPERTY_VALUE_FORMAT -> Known.INVALID_PROPERTY_VALUE_FORMAT
                INVALID_RECORD_ID -> Known.INVALID_RECORD_ID
                INVALID_REQUIRED_PROPERTY -> Known.INVALID_REQUIRED_PROPERTY
                INVALID_SHEET_COUNT -> Known.INVALID_SHEET_COUNT
                INVALID_SPREADSHEET -> Known.INVALID_SPREADSHEET
                LIMIT_EXCEEDED -> Known.LIMIT_EXCEEDED
                MANY_ERRORS_IN_ROW -> Known.MANY_ERRORS_IN_ROW
                MISSING_EVENT_DEFINITION -> Known.MISSING_EVENT_DEFINITION
                MISSING_EVENT_TIMESTAMP -> Known.MISSING_EVENT_TIMESTAMP
                MISSING_OBJECT_DEFINITION -> Known.MISSING_OBJECT_DEFINITION
                MISSING_REQUIRED_PROPERTY -> Known.MISSING_REQUIRED_PROPERTY
                MULTIPLE_COMPANIES_WITH_THIS_DOMAIN -> Known.MULTIPLE_COMPANIES_WITH_THIS_DOMAIN
                MULTIPLE_OWNERS_FOUND -> Known.MULTIPLE_OWNERS_FOUND
                NO_OBJECT_ID_FROM_ASSOCIATION_IDENTIFIER ->
                    Known.NO_OBJECT_ID_FROM_ASSOCIATION_IDENTIFIER
                OUTSIDE_VALID_TERM_RANGE -> Known.OUTSIDE_VALID_TERM_RANGE
                OUTSIDE_VALID_TIME_RANGE -> Known.OUTSIDE_VALID_TIME_RANGE
                PORTAL_WIDE_CUSTOM_OBJECT_LIMIT_EXCEEDED ->
                    Known.PORTAL_WIDE_CUSTOM_OBJECT_LIMIT_EXCEEDED
                PROPERTY_DEFINITION_NOT_FOUND -> Known.PROPERTY_DEFINITION_NOT_FOUND
                PROPERTY_VALUE_NOT_FOUND -> Known.PROPERTY_VALUE_NOT_FOUND
                ROW_DATA_TOO_LARGE -> Known.ROW_DATA_TOO_LARGE
                SECONDARY_EMAIL_WRITE_FAILURE -> Known.SECONDARY_EMAIL_WRITE_FAILURE
                UNKNOWN_ASSOCIATION_RECORD_ID -> Known.UNKNOWN_ASSOCIATION_RECORD_ID
                UNKNOWN_BAD_REQUEST -> Known.UNKNOWN_BAD_REQUEST
                UNKNOWN_ERROR -> Known.UNKNOWN_ERROR
                UPDATE_ONLY_IMPORT -> Known.UPDATE_ONLY_IMPORT
                else -> throw HubspotInvalidDataException("Unknown ErrorType: $value")
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

        fun validate(): ErrorType = apply {
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

            return other is ErrorType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The CRM object type affected by this error. */
    class ObjectType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ABANDONED_CART = of("ABANDONED_CART")

            @JvmField val ACCEPTANCE_TEST = of("ACCEPTANCE_TEST")

            @JvmField val AD = of("AD")

            @JvmField val AD_ACCOUNT = of("AD_ACCOUNT")

            @JvmField val AD_CAMPAIGN = of("AD_CAMPAIGN")

            @JvmField val AD_GROUP = of("AD_GROUP")

            @JvmField val AI_FORECAST = of("AI_FORECAST")

            @JvmField val ALL_PAGES = of("ALL_PAGES")

            @JvmField val APPROVAL = of("APPROVAL")

            @JvmField val APPROVAL_STEP = of("APPROVAL_STEP")

            @JvmField val ATTRIBUTION = of("ATTRIBUTION")

            @JvmField val AUDIENCE = of("AUDIENCE")

            @JvmField val AUTOMATION_JOURNEY = of("AUTOMATION_JOURNEY")

            @JvmField val AUTOMATION_PLATFORM_FLOW = of("AUTOMATION_PLATFORM_FLOW")

            @JvmField val AUTOMATION_PLATFORM_FLOW_ACTION = of("AUTOMATION_PLATFORM_FLOW_ACTION")

            @JvmField val BET_ALERT = of("BET_ALERT")

            @JvmField val BET_DELIVERABLE_SERVICE = of("BET_DELIVERABLE_SERVICE")

            @JvmField val BLOG_LISTING_PAGE = of("BLOG_LISTING_PAGE")

            @JvmField val BLOG_POST = of("BLOG_POST")

            @JvmField val CALL = of("CALL")

            @JvmField val CAMPAIGN = of("CAMPAIGN")

            @JvmField val CAMPAIGN_BUDGET_ITEM = of("CAMPAIGN_BUDGET_ITEM")

            @JvmField val CAMPAIGN_SPEND_ITEM = of("CAMPAIGN_SPEND_ITEM")

            @JvmField val CAMPAIGN_STEP = of("CAMPAIGN_STEP")

            @JvmField val CAMPAIGN_TEMPLATE = of("CAMPAIGN_TEMPLATE")

            @JvmField val CAMPAIGN_TEMPLATE_STEP = of("CAMPAIGN_TEMPLATE_STEP")

            @JvmField val CART = of("CART")

            @JvmField val CASE_STUDY = of("CASE_STUDY")

            @JvmField val CHATFLOW = of("CHATFLOW")

            @JvmField val CLIP = of("CLIP")

            @JvmField val CMS_URL = of("CMS_URL")

            @JvmField val COMBO_EVENT_CONFIGURATION = of("COMBO_EVENT_CONFIGURATION")

            @JvmField val COMMERCE_PAYMENT = of("COMMERCE_PAYMENT")

            @JvmField val COMMUNICATION = of("COMMUNICATION")

            @JvmField val COMPANY = of("COMPANY")

            @JvmField val CONTACT = of("CONTACT")

            @JvmField val CONTACT_CREATE_ATTRIBUTION = of("CONTACT_CREATE_ATTRIBUTION")

            @JvmField val CONTENT = of("CONTENT")

            @JvmField val CONTENT_AUDIT = of("CONTENT_AUDIT")

            @JvmField val CONTENT_AUDIT_PAGE = of("CONTENT_AUDIT_PAGE")

            @JvmField val CONVERSATION = of("CONVERSATION")

            @JvmField val CONVERSATION_INBOX = of("CONVERSATION_INBOX")

            @JvmField val CONVERSATION_SESSION = of("CONVERSATION_SESSION")

            @JvmField val CRM_OBJECTS_DUMMY_TYPE = of("CRM_OBJECTS_DUMMY_TYPE")

            @JvmField val CRM_PIPELINES_DUMMY_TYPE = of("CRM_PIPELINES_DUMMY_TYPE")

            @JvmField val CTA = of("CTA")

            @JvmField val CTA_VARIANT = of("CTA_VARIANT")

            @JvmField val DATA_PRIVACY_CONSENT = of("DATA_PRIVACY_CONSENT")

            @JvmField val DATA_SYNC_STATE = of("DATA_SYNC_STATE")

            @JvmField val DEAL = of("DEAL")

            @JvmField val DEAL_CREATE_ATTRIBUTION = of("DEAL_CREATE_ATTRIBUTION")

            @JvmField val DEAL_REGISTRATION = of("DEAL_REGISTRATION")

            @JvmField val DEAL_SPLIT = of("DEAL_SPLIT")

            @JvmField val DISCOUNT = of("DISCOUNT")

            @JvmField val DISCOUNT_CODE = of("DISCOUNT_CODE")

            @JvmField val DISCOUNT_TEMPLATE = of("DISCOUNT_TEMPLATE")

            @JvmField val EMAIL = of("EMAIL")

            @JvmField val ENGAGEMENT = of("ENGAGEMENT")

            @JvmField val EXPORT = of("EXPORT")

            @JvmField val EXTERNAL_WEB_URL = of("EXTERNAL_WEB_URL")

            @JvmField val FEE = of("FEE")

            @JvmField val FEEDBACK_SUBMISSION = of("FEEDBACK_SUBMISSION")

            @JvmField val FEEDBACK_SURVEY = of("FEEDBACK_SURVEY")

            @JvmField val FILE_MANAGER_FILE = of("FILE_MANAGER_FILE")

            @JvmField val FILE_MANAGER_FOLDER = of("FILE_MANAGER_FOLDER")

            @JvmField val FOLDER = of("FOLDER")

            @JvmField val FORECAST = of("FORECAST")

            @JvmField val FORM = of("FORM")

            @JvmField val FORM_SUBMISSION_INBOUNDDB = of("FORM_SUBMISSION_INBOUNDDB")

            @JvmField val GOAL_TARGET = of("GOAL_TARGET")

            @JvmField val GOAL_TARGET_GROUP = of("GOAL_TARGET_GROUP")

            @JvmField val GOAL_TEMPLATE = of("GOAL_TEMPLATE")

            @JvmField val GSC_PROPERTY = of("GSC_PROPERTY")

            @JvmField val HUB = of("HUB")

            @JvmField val IMPORT = of("IMPORT")

            @JvmField val INVOICE = of("INVOICE")

            @JvmField val KEYWORD = of("KEYWORD")

            @JvmField val KNOWLEDGE_ARTICLE = of("KNOWLEDGE_ARTICLE")

            @JvmField val LANDING_PAGE = of("LANDING_PAGE")

            @JvmField val LEAD = of("LEAD")

            @JvmField val LINE_ITEM = of("LINE_ITEM")

            @JvmField val MARKETING_CALENDAR = of("MARKETING_CALENDAR")

            @JvmField val MARKETING_CAMPAIGN_UTM = of("MARKETING_CAMPAIGN_UTM")

            @JvmField val MARKETING_EMAIL = of("MARKETING_EMAIL")

            @JvmField val MARKETING_EVENT = of("MARKETING_EVENT")

            @JvmField val MARKETING_EVENT_ATTENDANCE = of("MARKETING_EVENT_ATTENDANCE")

            @JvmField val MARKETING_SMS = of("MARKETING_SMS")

            @JvmField val MEDIA_BRIDGE = of("MEDIA_BRIDGE")

            @JvmField val MEETING_EVENT = of("MEETING_EVENT")

            @JvmField val MIC = of("MIC")

            @JvmField val NOTE = of("NOTE")

            @JvmField val OBJECT_LIST = of("OBJECT_LIST")

            @JvmField val ORDER = of("ORDER")

            @JvmField val OWNER = of("OWNER")

            @JvmField val PARTNER_ACCOUNT = of("PARTNER_ACCOUNT")

            @JvmField val PARTNER_CLIENT = of("PARTNER_CLIENT")

            @JvmField val PARTNER_CLIENT_REVENUE = of("PARTNER_CLIENT_REVENUE")

            @JvmField val PARTNER_SERVICE = of("PARTNER_SERVICE")

            @JvmField val PAYMENT_LINK = of("PAYMENT_LINK")

            @JvmField val PAYMENT_SCHEDULE = of("PAYMENT_SCHEDULE")

            @JvmField val PAYMENT_SCHEDULE_INSTALLMENT = of("PAYMENT_SCHEDULE_INSTALLMENT")

            @JvmField val PERMISSIONS_TESTING = of("PERMISSIONS_TESTING")

            @JvmField val PLAYBOOK = of("PLAYBOOK")

            @JvmField val PLAYBOOK_QUESTION = of("PLAYBOOK_QUESTION")

            @JvmField val PLAYBOOK_SUBMISSION = of("PLAYBOOK_SUBMISSION")

            @JvmField val PLAYBOOK_SUBMISSION_ANSWER = of("PLAYBOOK_SUBMISSION_ANSWER")

            @JvmField val PLAYLIST = of("PLAYLIST")

            @JvmField val PLAYLIST_FOLDER = of("PLAYLIST_FOLDER")

            @JvmField val PODCAST_EPISODE = of("PODCAST_EPISODE")

            @JvmField val PORTAL = of("PORTAL")

            @JvmField val PORTAL_OBJECT_SYNC_MESSAGE = of("PORTAL_OBJECT_SYNC_MESSAGE")

            @JvmField val POSTAL_MAIL = of("POSTAL_MAIL")

            @JvmField val PRIVACY_SCANNER_COOKIE = of("PRIVACY_SCANNER_COOKIE")

            @JvmField val PRODUCT = of("PRODUCT")

            @JvmField val PRODUCT_OR_FOLDER = of("PRODUCT_OR_FOLDER")

            @JvmField val PROPERTY_INFO = of("PROPERTY_INFO")

            @JvmField
            val PROSPECTING_AGENT_CONTACT_ASSIGNMENT = of("PROSPECTING_AGENT_CONTACT_ASSIGNMENT")

            @JvmField val PUBLISHING_TASK = of("PUBLISHING_TASK")

            @JvmField val QUARANTINED_SUBMISSION = of("QUARANTINED_SUBMISSION")

            @JvmField val QUOTA = of("QUOTA")

            @JvmField val QUOTE = of("QUOTE")

            @JvmField val QUOTE_FIELD = of("QUOTE_FIELD")

            @JvmField val QUOTE_MODULE = of("QUOTE_MODULE")

            @JvmField val QUOTE_MODULE_FIELD = of("QUOTE_MODULE_FIELD")

            @JvmField val QUOTE_TEMPLATE = of("QUOTE_TEMPLATE")

            @JvmField val RESTORABLE_CRM_OBJECT = of("RESTORABLE_CRM_OBJECT")

            @JvmField val ROSTER = of("ROSTER")

            @JvmField val ROSTER_MEMBER = of("ROSTER_MEMBER")

            @JvmField val SALES_DOCUMENT = of("SALES_DOCUMENT")

            @JvmField val SALES_TASK = of("SALES_TASK")

            @JvmField val SALES_WORKLOAD = of("SALES_WORKLOAD")

            @JvmField val SALESFORCE_SYNC_ERROR = of("SALESFORCE_SYNC_ERROR")

            @JvmField val SCHEDULING_PAGE = of("SCHEDULING_PAGE")

            @JvmField val SCHEMAS_BACKEND_TEST = of("SCHEMAS_BACKEND_TEST")

            @JvmField val SCORE_CONFIGURATION = of("SCORE_CONFIGURATION")

            @JvmField val SEQUENCE = of("SEQUENCE")

            @JvmField val SEQUENCE_ENROLLMENT = of("SEQUENCE_ENROLLMENT")

            @JvmField val SEQUENCE_STEP = of("SEQUENCE_STEP")

            @JvmField val SEQUENCE_STEP_ENROLLMENT = of("SEQUENCE_STEP_ENROLLMENT")

            @JvmField val SERVICE = of("SERVICE")

            @JvmField val SITE_PAGE = of("SITE_PAGE")

            @JvmField val SNIPPET = of("SNIPPET")

            @JvmField val SOCIAL_BROADCAST = of("SOCIAL_BROADCAST")

            @JvmField val SOCIAL_CHANNEL = of("SOCIAL_CHANNEL")

            @JvmField val SOCIAL_POST = of("SOCIAL_POST")

            @JvmField val SOCIAL_PROFILE = of("SOCIAL_PROFILE")

            @JvmField val SOX_PROTECTED_DUMMY_TYPE = of("SOX_PROTECTED_DUMMY_TYPE")

            @JvmField val SOX_PROTECTED_TEST_TYPE = of("SOX_PROTECTED_TEST_TYPE")

            @JvmField val SUBMISSION_TAG = of("SUBMISSION_TAG")

            @JvmField val SUBSCRIPTION = of("SUBSCRIPTION")

            @JvmField val TASK = of("TASK")

            @JvmField val TASK_TEMPLATE = of("TASK_TEMPLATE")

            @JvmField val TAX = of("TAX")

            @JvmField val TEMPLATE = of("TEMPLATE")

            @JvmField val TICKET = of("TICKET")

            @JvmField val UNKNOWN = of("UNKNOWN")

            @JvmField val UNSUBSCRIBE = of("UNSUBSCRIBE")

            @JvmField val USER = of("USER")

            @JvmField val VIEW = of("VIEW")

            @JvmField val VIEW_BLOCK = of("VIEW_BLOCK")

            @JvmField val WEB_INTERACTIVE = of("WEB_INTERACTIVE")

            @JvmStatic fun of(value: String) = ObjectType(JsonField.of(value))
        }

        /** An enum containing [ObjectType]'s known values. */
        enum class Known {
            ABANDONED_CART,
            ACCEPTANCE_TEST,
            AD,
            AD_ACCOUNT,
            AD_CAMPAIGN,
            AD_GROUP,
            AI_FORECAST,
            ALL_PAGES,
            APPROVAL,
            APPROVAL_STEP,
            ATTRIBUTION,
            AUDIENCE,
            AUTOMATION_JOURNEY,
            AUTOMATION_PLATFORM_FLOW,
            AUTOMATION_PLATFORM_FLOW_ACTION,
            BET_ALERT,
            BET_DELIVERABLE_SERVICE,
            BLOG_LISTING_PAGE,
            BLOG_POST,
            CALL,
            CAMPAIGN,
            CAMPAIGN_BUDGET_ITEM,
            CAMPAIGN_SPEND_ITEM,
            CAMPAIGN_STEP,
            CAMPAIGN_TEMPLATE,
            CAMPAIGN_TEMPLATE_STEP,
            CART,
            CASE_STUDY,
            CHATFLOW,
            CLIP,
            CMS_URL,
            COMBO_EVENT_CONFIGURATION,
            COMMERCE_PAYMENT,
            COMMUNICATION,
            COMPANY,
            CONTACT,
            CONTACT_CREATE_ATTRIBUTION,
            CONTENT,
            CONTENT_AUDIT,
            CONTENT_AUDIT_PAGE,
            CONVERSATION,
            CONVERSATION_INBOX,
            CONVERSATION_SESSION,
            CRM_OBJECTS_DUMMY_TYPE,
            CRM_PIPELINES_DUMMY_TYPE,
            CTA,
            CTA_VARIANT,
            DATA_PRIVACY_CONSENT,
            DATA_SYNC_STATE,
            DEAL,
            DEAL_CREATE_ATTRIBUTION,
            DEAL_REGISTRATION,
            DEAL_SPLIT,
            DISCOUNT,
            DISCOUNT_CODE,
            DISCOUNT_TEMPLATE,
            EMAIL,
            ENGAGEMENT,
            EXPORT,
            EXTERNAL_WEB_URL,
            FEE,
            FEEDBACK_SUBMISSION,
            FEEDBACK_SURVEY,
            FILE_MANAGER_FILE,
            FILE_MANAGER_FOLDER,
            FOLDER,
            FORECAST,
            FORM,
            FORM_SUBMISSION_INBOUNDDB,
            GOAL_TARGET,
            GOAL_TARGET_GROUP,
            GOAL_TEMPLATE,
            GSC_PROPERTY,
            HUB,
            IMPORT,
            INVOICE,
            KEYWORD,
            KNOWLEDGE_ARTICLE,
            LANDING_PAGE,
            LEAD,
            LINE_ITEM,
            MARKETING_CALENDAR,
            MARKETING_CAMPAIGN_UTM,
            MARKETING_EMAIL,
            MARKETING_EVENT,
            MARKETING_EVENT_ATTENDANCE,
            MARKETING_SMS,
            MEDIA_BRIDGE,
            MEETING_EVENT,
            MIC,
            NOTE,
            OBJECT_LIST,
            ORDER,
            OWNER,
            PARTNER_ACCOUNT,
            PARTNER_CLIENT,
            PARTNER_CLIENT_REVENUE,
            PARTNER_SERVICE,
            PAYMENT_LINK,
            PAYMENT_SCHEDULE,
            PAYMENT_SCHEDULE_INSTALLMENT,
            PERMISSIONS_TESTING,
            PLAYBOOK,
            PLAYBOOK_QUESTION,
            PLAYBOOK_SUBMISSION,
            PLAYBOOK_SUBMISSION_ANSWER,
            PLAYLIST,
            PLAYLIST_FOLDER,
            PODCAST_EPISODE,
            PORTAL,
            PORTAL_OBJECT_SYNC_MESSAGE,
            POSTAL_MAIL,
            PRIVACY_SCANNER_COOKIE,
            PRODUCT,
            PRODUCT_OR_FOLDER,
            PROPERTY_INFO,
            PROSPECTING_AGENT_CONTACT_ASSIGNMENT,
            PUBLISHING_TASK,
            QUARANTINED_SUBMISSION,
            QUOTA,
            QUOTE,
            QUOTE_FIELD,
            QUOTE_MODULE,
            QUOTE_MODULE_FIELD,
            QUOTE_TEMPLATE,
            RESTORABLE_CRM_OBJECT,
            ROSTER,
            ROSTER_MEMBER,
            SALES_DOCUMENT,
            SALES_TASK,
            SALES_WORKLOAD,
            SALESFORCE_SYNC_ERROR,
            SCHEDULING_PAGE,
            SCHEMAS_BACKEND_TEST,
            SCORE_CONFIGURATION,
            SEQUENCE,
            SEQUENCE_ENROLLMENT,
            SEQUENCE_STEP,
            SEQUENCE_STEP_ENROLLMENT,
            SERVICE,
            SITE_PAGE,
            SNIPPET,
            SOCIAL_BROADCAST,
            SOCIAL_CHANNEL,
            SOCIAL_POST,
            SOCIAL_PROFILE,
            SOX_PROTECTED_DUMMY_TYPE,
            SOX_PROTECTED_TEST_TYPE,
            SUBMISSION_TAG,
            SUBSCRIPTION,
            TASK,
            TASK_TEMPLATE,
            TAX,
            TEMPLATE,
            TICKET,
            UNKNOWN,
            UNSUBSCRIBE,
            USER,
            VIEW,
            VIEW_BLOCK,
            WEB_INTERACTIVE,
        }

        /**
         * An enum containing [ObjectType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ObjectType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ABANDONED_CART,
            ACCEPTANCE_TEST,
            AD,
            AD_ACCOUNT,
            AD_CAMPAIGN,
            AD_GROUP,
            AI_FORECAST,
            ALL_PAGES,
            APPROVAL,
            APPROVAL_STEP,
            ATTRIBUTION,
            AUDIENCE,
            AUTOMATION_JOURNEY,
            AUTOMATION_PLATFORM_FLOW,
            AUTOMATION_PLATFORM_FLOW_ACTION,
            BET_ALERT,
            BET_DELIVERABLE_SERVICE,
            BLOG_LISTING_PAGE,
            BLOG_POST,
            CALL,
            CAMPAIGN,
            CAMPAIGN_BUDGET_ITEM,
            CAMPAIGN_SPEND_ITEM,
            CAMPAIGN_STEP,
            CAMPAIGN_TEMPLATE,
            CAMPAIGN_TEMPLATE_STEP,
            CART,
            CASE_STUDY,
            CHATFLOW,
            CLIP,
            CMS_URL,
            COMBO_EVENT_CONFIGURATION,
            COMMERCE_PAYMENT,
            COMMUNICATION,
            COMPANY,
            CONTACT,
            CONTACT_CREATE_ATTRIBUTION,
            CONTENT,
            CONTENT_AUDIT,
            CONTENT_AUDIT_PAGE,
            CONVERSATION,
            CONVERSATION_INBOX,
            CONVERSATION_SESSION,
            CRM_OBJECTS_DUMMY_TYPE,
            CRM_PIPELINES_DUMMY_TYPE,
            CTA,
            CTA_VARIANT,
            DATA_PRIVACY_CONSENT,
            DATA_SYNC_STATE,
            DEAL,
            DEAL_CREATE_ATTRIBUTION,
            DEAL_REGISTRATION,
            DEAL_SPLIT,
            DISCOUNT,
            DISCOUNT_CODE,
            DISCOUNT_TEMPLATE,
            EMAIL,
            ENGAGEMENT,
            EXPORT,
            EXTERNAL_WEB_URL,
            FEE,
            FEEDBACK_SUBMISSION,
            FEEDBACK_SURVEY,
            FILE_MANAGER_FILE,
            FILE_MANAGER_FOLDER,
            FOLDER,
            FORECAST,
            FORM,
            FORM_SUBMISSION_INBOUNDDB,
            GOAL_TARGET,
            GOAL_TARGET_GROUP,
            GOAL_TEMPLATE,
            GSC_PROPERTY,
            HUB,
            IMPORT,
            INVOICE,
            KEYWORD,
            KNOWLEDGE_ARTICLE,
            LANDING_PAGE,
            LEAD,
            LINE_ITEM,
            MARKETING_CALENDAR,
            MARKETING_CAMPAIGN_UTM,
            MARKETING_EMAIL,
            MARKETING_EVENT,
            MARKETING_EVENT_ATTENDANCE,
            MARKETING_SMS,
            MEDIA_BRIDGE,
            MEETING_EVENT,
            MIC,
            NOTE,
            OBJECT_LIST,
            ORDER,
            OWNER,
            PARTNER_ACCOUNT,
            PARTNER_CLIENT,
            PARTNER_CLIENT_REVENUE,
            PARTNER_SERVICE,
            PAYMENT_LINK,
            PAYMENT_SCHEDULE,
            PAYMENT_SCHEDULE_INSTALLMENT,
            PERMISSIONS_TESTING,
            PLAYBOOK,
            PLAYBOOK_QUESTION,
            PLAYBOOK_SUBMISSION,
            PLAYBOOK_SUBMISSION_ANSWER,
            PLAYLIST,
            PLAYLIST_FOLDER,
            PODCAST_EPISODE,
            PORTAL,
            PORTAL_OBJECT_SYNC_MESSAGE,
            POSTAL_MAIL,
            PRIVACY_SCANNER_COOKIE,
            PRODUCT,
            PRODUCT_OR_FOLDER,
            PROPERTY_INFO,
            PROSPECTING_AGENT_CONTACT_ASSIGNMENT,
            PUBLISHING_TASK,
            QUARANTINED_SUBMISSION,
            QUOTA,
            QUOTE,
            QUOTE_FIELD,
            QUOTE_MODULE,
            QUOTE_MODULE_FIELD,
            QUOTE_TEMPLATE,
            RESTORABLE_CRM_OBJECT,
            ROSTER,
            ROSTER_MEMBER,
            SALES_DOCUMENT,
            SALES_TASK,
            SALES_WORKLOAD,
            SALESFORCE_SYNC_ERROR,
            SCHEDULING_PAGE,
            SCHEMAS_BACKEND_TEST,
            SCORE_CONFIGURATION,
            SEQUENCE,
            SEQUENCE_ENROLLMENT,
            SEQUENCE_STEP,
            SEQUENCE_STEP_ENROLLMENT,
            SERVICE,
            SITE_PAGE,
            SNIPPET,
            SOCIAL_BROADCAST,
            SOCIAL_CHANNEL,
            SOCIAL_POST,
            SOCIAL_PROFILE,
            SOX_PROTECTED_DUMMY_TYPE,
            SOX_PROTECTED_TEST_TYPE,
            SUBMISSION_TAG,
            SUBSCRIPTION,
            TASK,
            TASK_TEMPLATE,
            TAX,
            TEMPLATE,
            TICKET,
            UNKNOWN,
            UNSUBSCRIBE,
            USER,
            VIEW,
            VIEW_BLOCK,
            WEB_INTERACTIVE,
            /**
             * An enum member indicating that [ObjectType] was instantiated with an unknown value.
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
                ABANDONED_CART -> Value.ABANDONED_CART
                ACCEPTANCE_TEST -> Value.ACCEPTANCE_TEST
                AD -> Value.AD
                AD_ACCOUNT -> Value.AD_ACCOUNT
                AD_CAMPAIGN -> Value.AD_CAMPAIGN
                AD_GROUP -> Value.AD_GROUP
                AI_FORECAST -> Value.AI_FORECAST
                ALL_PAGES -> Value.ALL_PAGES
                APPROVAL -> Value.APPROVAL
                APPROVAL_STEP -> Value.APPROVAL_STEP
                ATTRIBUTION -> Value.ATTRIBUTION
                AUDIENCE -> Value.AUDIENCE
                AUTOMATION_JOURNEY -> Value.AUTOMATION_JOURNEY
                AUTOMATION_PLATFORM_FLOW -> Value.AUTOMATION_PLATFORM_FLOW
                AUTOMATION_PLATFORM_FLOW_ACTION -> Value.AUTOMATION_PLATFORM_FLOW_ACTION
                BET_ALERT -> Value.BET_ALERT
                BET_DELIVERABLE_SERVICE -> Value.BET_DELIVERABLE_SERVICE
                BLOG_LISTING_PAGE -> Value.BLOG_LISTING_PAGE
                BLOG_POST -> Value.BLOG_POST
                CALL -> Value.CALL
                CAMPAIGN -> Value.CAMPAIGN
                CAMPAIGN_BUDGET_ITEM -> Value.CAMPAIGN_BUDGET_ITEM
                CAMPAIGN_SPEND_ITEM -> Value.CAMPAIGN_SPEND_ITEM
                CAMPAIGN_STEP -> Value.CAMPAIGN_STEP
                CAMPAIGN_TEMPLATE -> Value.CAMPAIGN_TEMPLATE
                CAMPAIGN_TEMPLATE_STEP -> Value.CAMPAIGN_TEMPLATE_STEP
                CART -> Value.CART
                CASE_STUDY -> Value.CASE_STUDY
                CHATFLOW -> Value.CHATFLOW
                CLIP -> Value.CLIP
                CMS_URL -> Value.CMS_URL
                COMBO_EVENT_CONFIGURATION -> Value.COMBO_EVENT_CONFIGURATION
                COMMERCE_PAYMENT -> Value.COMMERCE_PAYMENT
                COMMUNICATION -> Value.COMMUNICATION
                COMPANY -> Value.COMPANY
                CONTACT -> Value.CONTACT
                CONTACT_CREATE_ATTRIBUTION -> Value.CONTACT_CREATE_ATTRIBUTION
                CONTENT -> Value.CONTENT
                CONTENT_AUDIT -> Value.CONTENT_AUDIT
                CONTENT_AUDIT_PAGE -> Value.CONTENT_AUDIT_PAGE
                CONVERSATION -> Value.CONVERSATION
                CONVERSATION_INBOX -> Value.CONVERSATION_INBOX
                CONVERSATION_SESSION -> Value.CONVERSATION_SESSION
                CRM_OBJECTS_DUMMY_TYPE -> Value.CRM_OBJECTS_DUMMY_TYPE
                CRM_PIPELINES_DUMMY_TYPE -> Value.CRM_PIPELINES_DUMMY_TYPE
                CTA -> Value.CTA
                CTA_VARIANT -> Value.CTA_VARIANT
                DATA_PRIVACY_CONSENT -> Value.DATA_PRIVACY_CONSENT
                DATA_SYNC_STATE -> Value.DATA_SYNC_STATE
                DEAL -> Value.DEAL
                DEAL_CREATE_ATTRIBUTION -> Value.DEAL_CREATE_ATTRIBUTION
                DEAL_REGISTRATION -> Value.DEAL_REGISTRATION
                DEAL_SPLIT -> Value.DEAL_SPLIT
                DISCOUNT -> Value.DISCOUNT
                DISCOUNT_CODE -> Value.DISCOUNT_CODE
                DISCOUNT_TEMPLATE -> Value.DISCOUNT_TEMPLATE
                EMAIL -> Value.EMAIL
                ENGAGEMENT -> Value.ENGAGEMENT
                EXPORT -> Value.EXPORT
                EXTERNAL_WEB_URL -> Value.EXTERNAL_WEB_URL
                FEE -> Value.FEE
                FEEDBACK_SUBMISSION -> Value.FEEDBACK_SUBMISSION
                FEEDBACK_SURVEY -> Value.FEEDBACK_SURVEY
                FILE_MANAGER_FILE -> Value.FILE_MANAGER_FILE
                FILE_MANAGER_FOLDER -> Value.FILE_MANAGER_FOLDER
                FOLDER -> Value.FOLDER
                FORECAST -> Value.FORECAST
                FORM -> Value.FORM
                FORM_SUBMISSION_INBOUNDDB -> Value.FORM_SUBMISSION_INBOUNDDB
                GOAL_TARGET -> Value.GOAL_TARGET
                GOAL_TARGET_GROUP -> Value.GOAL_TARGET_GROUP
                GOAL_TEMPLATE -> Value.GOAL_TEMPLATE
                GSC_PROPERTY -> Value.GSC_PROPERTY
                HUB -> Value.HUB
                IMPORT -> Value.IMPORT
                INVOICE -> Value.INVOICE
                KEYWORD -> Value.KEYWORD
                KNOWLEDGE_ARTICLE -> Value.KNOWLEDGE_ARTICLE
                LANDING_PAGE -> Value.LANDING_PAGE
                LEAD -> Value.LEAD
                LINE_ITEM -> Value.LINE_ITEM
                MARKETING_CALENDAR -> Value.MARKETING_CALENDAR
                MARKETING_CAMPAIGN_UTM -> Value.MARKETING_CAMPAIGN_UTM
                MARKETING_EMAIL -> Value.MARKETING_EMAIL
                MARKETING_EVENT -> Value.MARKETING_EVENT
                MARKETING_EVENT_ATTENDANCE -> Value.MARKETING_EVENT_ATTENDANCE
                MARKETING_SMS -> Value.MARKETING_SMS
                MEDIA_BRIDGE -> Value.MEDIA_BRIDGE
                MEETING_EVENT -> Value.MEETING_EVENT
                MIC -> Value.MIC
                NOTE -> Value.NOTE
                OBJECT_LIST -> Value.OBJECT_LIST
                ORDER -> Value.ORDER
                OWNER -> Value.OWNER
                PARTNER_ACCOUNT -> Value.PARTNER_ACCOUNT
                PARTNER_CLIENT -> Value.PARTNER_CLIENT
                PARTNER_CLIENT_REVENUE -> Value.PARTNER_CLIENT_REVENUE
                PARTNER_SERVICE -> Value.PARTNER_SERVICE
                PAYMENT_LINK -> Value.PAYMENT_LINK
                PAYMENT_SCHEDULE -> Value.PAYMENT_SCHEDULE
                PAYMENT_SCHEDULE_INSTALLMENT -> Value.PAYMENT_SCHEDULE_INSTALLMENT
                PERMISSIONS_TESTING -> Value.PERMISSIONS_TESTING
                PLAYBOOK -> Value.PLAYBOOK
                PLAYBOOK_QUESTION -> Value.PLAYBOOK_QUESTION
                PLAYBOOK_SUBMISSION -> Value.PLAYBOOK_SUBMISSION
                PLAYBOOK_SUBMISSION_ANSWER -> Value.PLAYBOOK_SUBMISSION_ANSWER
                PLAYLIST -> Value.PLAYLIST
                PLAYLIST_FOLDER -> Value.PLAYLIST_FOLDER
                PODCAST_EPISODE -> Value.PODCAST_EPISODE
                PORTAL -> Value.PORTAL
                PORTAL_OBJECT_SYNC_MESSAGE -> Value.PORTAL_OBJECT_SYNC_MESSAGE
                POSTAL_MAIL -> Value.POSTAL_MAIL
                PRIVACY_SCANNER_COOKIE -> Value.PRIVACY_SCANNER_COOKIE
                PRODUCT -> Value.PRODUCT
                PRODUCT_OR_FOLDER -> Value.PRODUCT_OR_FOLDER
                PROPERTY_INFO -> Value.PROPERTY_INFO
                PROSPECTING_AGENT_CONTACT_ASSIGNMENT -> Value.PROSPECTING_AGENT_CONTACT_ASSIGNMENT
                PUBLISHING_TASK -> Value.PUBLISHING_TASK
                QUARANTINED_SUBMISSION -> Value.QUARANTINED_SUBMISSION
                QUOTA -> Value.QUOTA
                QUOTE -> Value.QUOTE
                QUOTE_FIELD -> Value.QUOTE_FIELD
                QUOTE_MODULE -> Value.QUOTE_MODULE
                QUOTE_MODULE_FIELD -> Value.QUOTE_MODULE_FIELD
                QUOTE_TEMPLATE -> Value.QUOTE_TEMPLATE
                RESTORABLE_CRM_OBJECT -> Value.RESTORABLE_CRM_OBJECT
                ROSTER -> Value.ROSTER
                ROSTER_MEMBER -> Value.ROSTER_MEMBER
                SALES_DOCUMENT -> Value.SALES_DOCUMENT
                SALES_TASK -> Value.SALES_TASK
                SALES_WORKLOAD -> Value.SALES_WORKLOAD
                SALESFORCE_SYNC_ERROR -> Value.SALESFORCE_SYNC_ERROR
                SCHEDULING_PAGE -> Value.SCHEDULING_PAGE
                SCHEMAS_BACKEND_TEST -> Value.SCHEMAS_BACKEND_TEST
                SCORE_CONFIGURATION -> Value.SCORE_CONFIGURATION
                SEQUENCE -> Value.SEQUENCE
                SEQUENCE_ENROLLMENT -> Value.SEQUENCE_ENROLLMENT
                SEQUENCE_STEP -> Value.SEQUENCE_STEP
                SEQUENCE_STEP_ENROLLMENT -> Value.SEQUENCE_STEP_ENROLLMENT
                SERVICE -> Value.SERVICE
                SITE_PAGE -> Value.SITE_PAGE
                SNIPPET -> Value.SNIPPET
                SOCIAL_BROADCAST -> Value.SOCIAL_BROADCAST
                SOCIAL_CHANNEL -> Value.SOCIAL_CHANNEL
                SOCIAL_POST -> Value.SOCIAL_POST
                SOCIAL_PROFILE -> Value.SOCIAL_PROFILE
                SOX_PROTECTED_DUMMY_TYPE -> Value.SOX_PROTECTED_DUMMY_TYPE
                SOX_PROTECTED_TEST_TYPE -> Value.SOX_PROTECTED_TEST_TYPE
                SUBMISSION_TAG -> Value.SUBMISSION_TAG
                SUBSCRIPTION -> Value.SUBSCRIPTION
                TASK -> Value.TASK
                TASK_TEMPLATE -> Value.TASK_TEMPLATE
                TAX -> Value.TAX
                TEMPLATE -> Value.TEMPLATE
                TICKET -> Value.TICKET
                UNKNOWN -> Value.UNKNOWN
                UNSUBSCRIBE -> Value.UNSUBSCRIBE
                USER -> Value.USER
                VIEW -> Value.VIEW
                VIEW_BLOCK -> Value.VIEW_BLOCK
                WEB_INTERACTIVE -> Value.WEB_INTERACTIVE
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
                ABANDONED_CART -> Known.ABANDONED_CART
                ACCEPTANCE_TEST -> Known.ACCEPTANCE_TEST
                AD -> Known.AD
                AD_ACCOUNT -> Known.AD_ACCOUNT
                AD_CAMPAIGN -> Known.AD_CAMPAIGN
                AD_GROUP -> Known.AD_GROUP
                AI_FORECAST -> Known.AI_FORECAST
                ALL_PAGES -> Known.ALL_PAGES
                APPROVAL -> Known.APPROVAL
                APPROVAL_STEP -> Known.APPROVAL_STEP
                ATTRIBUTION -> Known.ATTRIBUTION
                AUDIENCE -> Known.AUDIENCE
                AUTOMATION_JOURNEY -> Known.AUTOMATION_JOURNEY
                AUTOMATION_PLATFORM_FLOW -> Known.AUTOMATION_PLATFORM_FLOW
                AUTOMATION_PLATFORM_FLOW_ACTION -> Known.AUTOMATION_PLATFORM_FLOW_ACTION
                BET_ALERT -> Known.BET_ALERT
                BET_DELIVERABLE_SERVICE -> Known.BET_DELIVERABLE_SERVICE
                BLOG_LISTING_PAGE -> Known.BLOG_LISTING_PAGE
                BLOG_POST -> Known.BLOG_POST
                CALL -> Known.CALL
                CAMPAIGN -> Known.CAMPAIGN
                CAMPAIGN_BUDGET_ITEM -> Known.CAMPAIGN_BUDGET_ITEM
                CAMPAIGN_SPEND_ITEM -> Known.CAMPAIGN_SPEND_ITEM
                CAMPAIGN_STEP -> Known.CAMPAIGN_STEP
                CAMPAIGN_TEMPLATE -> Known.CAMPAIGN_TEMPLATE
                CAMPAIGN_TEMPLATE_STEP -> Known.CAMPAIGN_TEMPLATE_STEP
                CART -> Known.CART
                CASE_STUDY -> Known.CASE_STUDY
                CHATFLOW -> Known.CHATFLOW
                CLIP -> Known.CLIP
                CMS_URL -> Known.CMS_URL
                COMBO_EVENT_CONFIGURATION -> Known.COMBO_EVENT_CONFIGURATION
                COMMERCE_PAYMENT -> Known.COMMERCE_PAYMENT
                COMMUNICATION -> Known.COMMUNICATION
                COMPANY -> Known.COMPANY
                CONTACT -> Known.CONTACT
                CONTACT_CREATE_ATTRIBUTION -> Known.CONTACT_CREATE_ATTRIBUTION
                CONTENT -> Known.CONTENT
                CONTENT_AUDIT -> Known.CONTENT_AUDIT
                CONTENT_AUDIT_PAGE -> Known.CONTENT_AUDIT_PAGE
                CONVERSATION -> Known.CONVERSATION
                CONVERSATION_INBOX -> Known.CONVERSATION_INBOX
                CONVERSATION_SESSION -> Known.CONVERSATION_SESSION
                CRM_OBJECTS_DUMMY_TYPE -> Known.CRM_OBJECTS_DUMMY_TYPE
                CRM_PIPELINES_DUMMY_TYPE -> Known.CRM_PIPELINES_DUMMY_TYPE
                CTA -> Known.CTA
                CTA_VARIANT -> Known.CTA_VARIANT
                DATA_PRIVACY_CONSENT -> Known.DATA_PRIVACY_CONSENT
                DATA_SYNC_STATE -> Known.DATA_SYNC_STATE
                DEAL -> Known.DEAL
                DEAL_CREATE_ATTRIBUTION -> Known.DEAL_CREATE_ATTRIBUTION
                DEAL_REGISTRATION -> Known.DEAL_REGISTRATION
                DEAL_SPLIT -> Known.DEAL_SPLIT
                DISCOUNT -> Known.DISCOUNT
                DISCOUNT_CODE -> Known.DISCOUNT_CODE
                DISCOUNT_TEMPLATE -> Known.DISCOUNT_TEMPLATE
                EMAIL -> Known.EMAIL
                ENGAGEMENT -> Known.ENGAGEMENT
                EXPORT -> Known.EXPORT
                EXTERNAL_WEB_URL -> Known.EXTERNAL_WEB_URL
                FEE -> Known.FEE
                FEEDBACK_SUBMISSION -> Known.FEEDBACK_SUBMISSION
                FEEDBACK_SURVEY -> Known.FEEDBACK_SURVEY
                FILE_MANAGER_FILE -> Known.FILE_MANAGER_FILE
                FILE_MANAGER_FOLDER -> Known.FILE_MANAGER_FOLDER
                FOLDER -> Known.FOLDER
                FORECAST -> Known.FORECAST
                FORM -> Known.FORM
                FORM_SUBMISSION_INBOUNDDB -> Known.FORM_SUBMISSION_INBOUNDDB
                GOAL_TARGET -> Known.GOAL_TARGET
                GOAL_TARGET_GROUP -> Known.GOAL_TARGET_GROUP
                GOAL_TEMPLATE -> Known.GOAL_TEMPLATE
                GSC_PROPERTY -> Known.GSC_PROPERTY
                HUB -> Known.HUB
                IMPORT -> Known.IMPORT
                INVOICE -> Known.INVOICE
                KEYWORD -> Known.KEYWORD
                KNOWLEDGE_ARTICLE -> Known.KNOWLEDGE_ARTICLE
                LANDING_PAGE -> Known.LANDING_PAGE
                LEAD -> Known.LEAD
                LINE_ITEM -> Known.LINE_ITEM
                MARKETING_CALENDAR -> Known.MARKETING_CALENDAR
                MARKETING_CAMPAIGN_UTM -> Known.MARKETING_CAMPAIGN_UTM
                MARKETING_EMAIL -> Known.MARKETING_EMAIL
                MARKETING_EVENT -> Known.MARKETING_EVENT
                MARKETING_EVENT_ATTENDANCE -> Known.MARKETING_EVENT_ATTENDANCE
                MARKETING_SMS -> Known.MARKETING_SMS
                MEDIA_BRIDGE -> Known.MEDIA_BRIDGE
                MEETING_EVENT -> Known.MEETING_EVENT
                MIC -> Known.MIC
                NOTE -> Known.NOTE
                OBJECT_LIST -> Known.OBJECT_LIST
                ORDER -> Known.ORDER
                OWNER -> Known.OWNER
                PARTNER_ACCOUNT -> Known.PARTNER_ACCOUNT
                PARTNER_CLIENT -> Known.PARTNER_CLIENT
                PARTNER_CLIENT_REVENUE -> Known.PARTNER_CLIENT_REVENUE
                PARTNER_SERVICE -> Known.PARTNER_SERVICE
                PAYMENT_LINK -> Known.PAYMENT_LINK
                PAYMENT_SCHEDULE -> Known.PAYMENT_SCHEDULE
                PAYMENT_SCHEDULE_INSTALLMENT -> Known.PAYMENT_SCHEDULE_INSTALLMENT
                PERMISSIONS_TESTING -> Known.PERMISSIONS_TESTING
                PLAYBOOK -> Known.PLAYBOOK
                PLAYBOOK_QUESTION -> Known.PLAYBOOK_QUESTION
                PLAYBOOK_SUBMISSION -> Known.PLAYBOOK_SUBMISSION
                PLAYBOOK_SUBMISSION_ANSWER -> Known.PLAYBOOK_SUBMISSION_ANSWER
                PLAYLIST -> Known.PLAYLIST
                PLAYLIST_FOLDER -> Known.PLAYLIST_FOLDER
                PODCAST_EPISODE -> Known.PODCAST_EPISODE
                PORTAL -> Known.PORTAL
                PORTAL_OBJECT_SYNC_MESSAGE -> Known.PORTAL_OBJECT_SYNC_MESSAGE
                POSTAL_MAIL -> Known.POSTAL_MAIL
                PRIVACY_SCANNER_COOKIE -> Known.PRIVACY_SCANNER_COOKIE
                PRODUCT -> Known.PRODUCT
                PRODUCT_OR_FOLDER -> Known.PRODUCT_OR_FOLDER
                PROPERTY_INFO -> Known.PROPERTY_INFO
                PROSPECTING_AGENT_CONTACT_ASSIGNMENT -> Known.PROSPECTING_AGENT_CONTACT_ASSIGNMENT
                PUBLISHING_TASK -> Known.PUBLISHING_TASK
                QUARANTINED_SUBMISSION -> Known.QUARANTINED_SUBMISSION
                QUOTA -> Known.QUOTA
                QUOTE -> Known.QUOTE
                QUOTE_FIELD -> Known.QUOTE_FIELD
                QUOTE_MODULE -> Known.QUOTE_MODULE
                QUOTE_MODULE_FIELD -> Known.QUOTE_MODULE_FIELD
                QUOTE_TEMPLATE -> Known.QUOTE_TEMPLATE
                RESTORABLE_CRM_OBJECT -> Known.RESTORABLE_CRM_OBJECT
                ROSTER -> Known.ROSTER
                ROSTER_MEMBER -> Known.ROSTER_MEMBER
                SALES_DOCUMENT -> Known.SALES_DOCUMENT
                SALES_TASK -> Known.SALES_TASK
                SALES_WORKLOAD -> Known.SALES_WORKLOAD
                SALESFORCE_SYNC_ERROR -> Known.SALESFORCE_SYNC_ERROR
                SCHEDULING_PAGE -> Known.SCHEDULING_PAGE
                SCHEMAS_BACKEND_TEST -> Known.SCHEMAS_BACKEND_TEST
                SCORE_CONFIGURATION -> Known.SCORE_CONFIGURATION
                SEQUENCE -> Known.SEQUENCE
                SEQUENCE_ENROLLMENT -> Known.SEQUENCE_ENROLLMENT
                SEQUENCE_STEP -> Known.SEQUENCE_STEP
                SEQUENCE_STEP_ENROLLMENT -> Known.SEQUENCE_STEP_ENROLLMENT
                SERVICE -> Known.SERVICE
                SITE_PAGE -> Known.SITE_PAGE
                SNIPPET -> Known.SNIPPET
                SOCIAL_BROADCAST -> Known.SOCIAL_BROADCAST
                SOCIAL_CHANNEL -> Known.SOCIAL_CHANNEL
                SOCIAL_POST -> Known.SOCIAL_POST
                SOCIAL_PROFILE -> Known.SOCIAL_PROFILE
                SOX_PROTECTED_DUMMY_TYPE -> Known.SOX_PROTECTED_DUMMY_TYPE
                SOX_PROTECTED_TEST_TYPE -> Known.SOX_PROTECTED_TEST_TYPE
                SUBMISSION_TAG -> Known.SUBMISSION_TAG
                SUBSCRIPTION -> Known.SUBSCRIPTION
                TASK -> Known.TASK
                TASK_TEMPLATE -> Known.TASK_TEMPLATE
                TAX -> Known.TAX
                TEMPLATE -> Known.TEMPLATE
                TICKET -> Known.TICKET
                UNKNOWN -> Known.UNKNOWN
                UNSUBSCRIBE -> Known.UNSUBSCRIBE
                USER -> Known.USER
                VIEW -> Known.VIEW
                VIEW_BLOCK -> Known.VIEW_BLOCK
                WEB_INTERACTIVE -> Known.WEB_INTERACTIVE
                else -> throw HubspotInvalidDataException("Unknown ObjectType: $value")
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

        fun validate(): ObjectType = apply {
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

            return other is ObjectType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicImportError &&
            id == other.id &&
            createdAt == other.createdAt &&
            errorType == other.errorType &&
            sourceData == other.sourceData &&
            errorMessage == other.errorMessage &&
            extraContext == other.extraContext &&
            invalidPropertyValue == other.invalidPropertyValue &&
            invalidValue == other.invalidValue &&
            invalidValueToDisplay == other.invalidValueToDisplay &&
            knownColumnNumber == other.knownColumnNumber &&
            objectType == other.objectType &&
            objectTypeId == other.objectTypeId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            errorType,
            sourceData,
            errorMessage,
            extraContext,
            invalidPropertyValue,
            invalidValue,
            invalidValueToDisplay,
            knownColumnNumber,
            objectType,
            objectTypeId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicImportError{id=$id, createdAt=$createdAt, errorType=$errorType, sourceData=$sourceData, errorMessage=$errorMessage, extraContext=$extraContext, invalidPropertyValue=$invalidPropertyValue, invalidValue=$invalidValue, invalidValueToDisplay=$invalidValueToDisplay, knownColumnNumber=$knownColumnNumber, objectType=$objectType, objectTypeId=$objectTypeId, additionalProperties=$additionalProperties}"
}
