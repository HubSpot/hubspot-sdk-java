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
import com.hubspot_sdk.api.models.marketing.events.PropertyValue
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
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): Int = createdAt.getRequired("createdAt")

    /**
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
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun errorMessage(): Optional<String> = errorMessage.getOptional("errorMessage")

    /**
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
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun invalidValue(): Optional<String> = invalidValue.getOptional("invalidValue")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun invalidValueToDisplay(): Optional<String> =
        invalidValueToDisplay.getOptional("invalidValueToDisplay")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun knownColumnNumber(): Optional<Int> = knownColumnNumber.getOptional("knownColumnNumber")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun objectType(): Optional<ObjectType> = objectType.getOptional("objectType")

    /**
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

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: Int) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun createdAt(createdAt: JsonField<Int>) = apply { this.createdAt = createdAt }

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

        fun objectType(objectType: ObjectType) = objectType(JsonField.of(objectType))

        /**
         * Sets [Builder.objectType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectType] with a well-typed [ObjectType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun objectType(objectType: JsonField<ObjectType>) = apply { this.objectType = objectType }

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

            @JvmField val INCORRECT_NUMBER_OF_COLUMNS = of("INCORRECT_NUMBER_OF_COLUMNS")

            @JvmField val INVALID_OBJECT_ID = of("INVALID_OBJECT_ID")

            @JvmField val INVALID_ASSOCIATION_IDENTIFIER = of("INVALID_ASSOCIATION_IDENTIFIER")

            @JvmField
            val NO_OBJECT_ID_FROM_ASSOCIATION_IDENTIFIER =
                of("NO_OBJECT_ID_FROM_ASSOCIATION_IDENTIFIER")

            @JvmField
            val MULTIPLE_COMPANIES_WITH_THIS_DOMAIN = of("MULTIPLE_COMPANIES_WITH_THIS_DOMAIN")

            @JvmField val PROPERTY_DEFINITION_NOT_FOUND = of("PROPERTY_DEFINITION_NOT_FOUND")

            @JvmField val PROPERTY_VALUE_NOT_FOUND = of("PROPERTY_VALUE_NOT_FOUND")

            @JvmField val COULD_NOT_FIND_OWNER = of("COULD_NOT_FIND_OWNER")

            @JvmField val MULTIPLE_OWNERS_FOUND = of("MULTIPLE_OWNERS_FOUND")

            @JvmField val COULD_NOT_FIND_BUSINESS_UNIT = of("COULD_NOT_FIND_BUSINESS_UNIT")

            @JvmField val COULD_NOT_PARSE_NUMBER = of("COULD_NOT_PARSE_NUMBER")

            @JvmField val COULD_NOT_PARSE_DATE = of("COULD_NOT_PARSE_DATE")

            @JvmField val COULD_NOT_PARSE_TERM = of("COULD_NOT_PARSE_TERM")

            @JvmField val OUTSIDE_VALID_TIME_RANGE = of("OUTSIDE_VALID_TIME_RANGE")

            @JvmField val OUTSIDE_VALID_TERM_RANGE = of("OUTSIDE_VALID_TERM_RANGE")

            @JvmField val COULD_NOT_PARSE_ROW = of("COULD_NOT_PARSE_ROW")

            @JvmField val INVALID_ENUMERATION_OPTION = of("INVALID_ENUMERATION_OPTION")

            @JvmField val AMBIGUOUS_ENUMERATION_OPTION = of("AMBIGUOUS_ENUMERATION_OPTION")

            @JvmField val FAILED_VALIDATION = of("FAILED_VALIDATION")

            @JvmField val FAILED_TO_CREATE_ASSOCIATION = of("FAILED_TO_CREATE_ASSOCIATION")

            @JvmField val ASSOCIATION_LIMIT_EXCEEDED = of("ASSOCIATION_LIMIT_EXCEEDED")

            @JvmField val FILE_NOT_FOUND = of("FILE_NOT_FOUND")

            @JvmField val INVALID_COLUMN_CONFIGURATION = of("INVALID_COLUMN_CONFIGURATION")

            @JvmField val INVALID_FILE_TYPE = of("INVALID_FILE_TYPE")

            @JvmField val INVALID_SPREADSHEET = of("INVALID_SPREADSHEET")

            @JvmField val INVALID_SHEET_COUNT = of("INVALID_SHEET_COUNT")

            @JvmField
            val FAILED_TO_PROCESS_OBJECT_WITH_EMPTY_PROPERTY_VALUES =
                of("FAILED_TO_PROCESS_OBJECT_WITH_EMPTY_PROPERTY_VALUES")

            @JvmField val UNKNOWN_BAD_REQUEST = of("UNKNOWN_BAD_REQUEST")

            @JvmField val GDPR_BLACKLISTED_EMAIL = of("GDPR_BLACKLISTED_EMAIL")

            @JvmField val DUPLICATE_ASSOCIATION_ID = of("DUPLICATE_ASSOCIATION_ID")

            @JvmField val LIMIT_EXCEEDED = of("LIMIT_EXCEEDED")

            @JvmField
            val PORTAL_WIDE_CUSTOM_OBJECT_LIMIT_EXCEEDED =
                of("PORTAL_WIDE_CUSTOM_OBJECT_LIMIT_EXCEEDED")

            @JvmField val INVALID_ALTERNATE_ID = of("INVALID_ALTERNATE_ID")

            @JvmField val INVALID_EMAIL = of("INVALID_EMAIL")

            @JvmField val SECONDARY_EMAIL_WRITE_FAILURE = of("SECONDARY_EMAIL_WRITE_FAILURE")

            @JvmField val INVALID_DOMAIN = of("INVALID_DOMAIN")

            @JvmField val DUPLICATE_ROW_CONTENT = of("DUPLICATE_ROW_CONTENT")

            @JvmField val INVALID_NUMBER_SIZE = of("INVALID_NUMBER_SIZE")

            @JvmField val UNKNOWN_ERROR = of("UNKNOWN_ERROR")

            @JvmField val FAILED_TO_OPT_OUT_CONTACT = of("FAILED_TO_OPT_OUT_CONTACT")

            @JvmField val INVALID_REQUIRED_PROPERTY = of("INVALID_REQUIRED_PROPERTY")

            @JvmField val MISSING_REQUIRED_PROPERTY = of("MISSING_REQUIRED_PROPERTY")

            @JvmField val DUPLICATE_ALTERNATE_ID = of("DUPLICATE_ALTERNATE_ID")

            @JvmField val DUPLICATE_OBJECT_ID = of("DUPLICATE_OBJECT_ID")

            @JvmField val DUPLICATE_UNIQUE_PROPERTY_VALUE = of("DUPLICATE_UNIQUE_PROPERTY_VALUE")

            @JvmField val UNKNOWN_ASSOCIATION_RECORD_ID = of("UNKNOWN_ASSOCIATION_RECORD_ID")

            @JvmField val INVALID_RECORD_ID = of("INVALID_RECORD_ID")

            @JvmField val DUPLICATE_RECORD_ID = of("DUPLICATE_RECORD_ID")

            @JvmField
            val INVALID_CUSTOM_PROPERTY_VALIDATION = of("INVALID_CUSTOM_PROPERTY_VALIDATION")

            @JvmField val CREATE_ONLY_IMPORT = of("CREATE_ONLY_IMPORT")

            @JvmField val UPDATE_ONLY_IMPORT = of("UPDATE_ONLY_IMPORT")

            @JvmField val COLUMN_TOO_LARGE = of("COLUMN_TOO_LARGE")

            @JvmField val ROW_DATA_TOO_LARGE = of("ROW_DATA_TOO_LARGE")

            @JvmField val MISSING_EVENT_TIMESTAMP = of("MISSING_EVENT_TIMESTAMP")

            @JvmField val INVALID_EVENT_TIMESTAMP = of("INVALID_EVENT_TIMESTAMP")

            @JvmField val INVALID_EVENT = of("INVALID_EVENT")

            @JvmField val DUPLICATE_EVENT = of("DUPLICATE_EVENT")

            @JvmField val MISSING_EVENT_DEFINITION = of("MISSING_EVENT_DEFINITION")

            @JvmField val INVALID_ASSOCIATION_KEY = of("INVALID_ASSOCIATION_KEY")

            @JvmField val ASSOCIATION_RECORD_NOT_FOUND = of("ASSOCIATION_RECORD_NOT_FOUND")

            @JvmField val MISSING_OBJECT_DEFINITION = of("MISSING_OBJECT_DEFINITION")

            @JvmField val ASSOCIATION_LABEL_NOT_FOUND = of("ASSOCIATION_LABEL_NOT_FOUND")

            @JvmField val MANY_ERRORS_IN_ROW = of("MANY_ERRORS_IN_ROW")

            @JvmStatic fun of(value: String) = ErrorType(JsonField.of(value))
        }

        /** An enum containing [ErrorType]'s known values. */
        enum class Known {
            INCORRECT_NUMBER_OF_COLUMNS,
            INVALID_OBJECT_ID,
            INVALID_ASSOCIATION_IDENTIFIER,
            NO_OBJECT_ID_FROM_ASSOCIATION_IDENTIFIER,
            MULTIPLE_COMPANIES_WITH_THIS_DOMAIN,
            PROPERTY_DEFINITION_NOT_FOUND,
            PROPERTY_VALUE_NOT_FOUND,
            COULD_NOT_FIND_OWNER,
            MULTIPLE_OWNERS_FOUND,
            COULD_NOT_FIND_BUSINESS_UNIT,
            COULD_NOT_PARSE_NUMBER,
            COULD_NOT_PARSE_DATE,
            COULD_NOT_PARSE_TERM,
            OUTSIDE_VALID_TIME_RANGE,
            OUTSIDE_VALID_TERM_RANGE,
            COULD_NOT_PARSE_ROW,
            INVALID_ENUMERATION_OPTION,
            AMBIGUOUS_ENUMERATION_OPTION,
            FAILED_VALIDATION,
            FAILED_TO_CREATE_ASSOCIATION,
            ASSOCIATION_LIMIT_EXCEEDED,
            FILE_NOT_FOUND,
            INVALID_COLUMN_CONFIGURATION,
            INVALID_FILE_TYPE,
            INVALID_SPREADSHEET,
            INVALID_SHEET_COUNT,
            FAILED_TO_PROCESS_OBJECT_WITH_EMPTY_PROPERTY_VALUES,
            UNKNOWN_BAD_REQUEST,
            GDPR_BLACKLISTED_EMAIL,
            DUPLICATE_ASSOCIATION_ID,
            LIMIT_EXCEEDED,
            PORTAL_WIDE_CUSTOM_OBJECT_LIMIT_EXCEEDED,
            INVALID_ALTERNATE_ID,
            INVALID_EMAIL,
            SECONDARY_EMAIL_WRITE_FAILURE,
            INVALID_DOMAIN,
            DUPLICATE_ROW_CONTENT,
            INVALID_NUMBER_SIZE,
            UNKNOWN_ERROR,
            FAILED_TO_OPT_OUT_CONTACT,
            INVALID_REQUIRED_PROPERTY,
            MISSING_REQUIRED_PROPERTY,
            DUPLICATE_ALTERNATE_ID,
            DUPLICATE_OBJECT_ID,
            DUPLICATE_UNIQUE_PROPERTY_VALUE,
            UNKNOWN_ASSOCIATION_RECORD_ID,
            INVALID_RECORD_ID,
            DUPLICATE_RECORD_ID,
            INVALID_CUSTOM_PROPERTY_VALIDATION,
            CREATE_ONLY_IMPORT,
            UPDATE_ONLY_IMPORT,
            COLUMN_TOO_LARGE,
            ROW_DATA_TOO_LARGE,
            MISSING_EVENT_TIMESTAMP,
            INVALID_EVENT_TIMESTAMP,
            INVALID_EVENT,
            DUPLICATE_EVENT,
            MISSING_EVENT_DEFINITION,
            INVALID_ASSOCIATION_KEY,
            ASSOCIATION_RECORD_NOT_FOUND,
            MISSING_OBJECT_DEFINITION,
            ASSOCIATION_LABEL_NOT_FOUND,
            MANY_ERRORS_IN_ROW,
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
            INCORRECT_NUMBER_OF_COLUMNS,
            INVALID_OBJECT_ID,
            INVALID_ASSOCIATION_IDENTIFIER,
            NO_OBJECT_ID_FROM_ASSOCIATION_IDENTIFIER,
            MULTIPLE_COMPANIES_WITH_THIS_DOMAIN,
            PROPERTY_DEFINITION_NOT_FOUND,
            PROPERTY_VALUE_NOT_FOUND,
            COULD_NOT_FIND_OWNER,
            MULTIPLE_OWNERS_FOUND,
            COULD_NOT_FIND_BUSINESS_UNIT,
            COULD_NOT_PARSE_NUMBER,
            COULD_NOT_PARSE_DATE,
            COULD_NOT_PARSE_TERM,
            OUTSIDE_VALID_TIME_RANGE,
            OUTSIDE_VALID_TERM_RANGE,
            COULD_NOT_PARSE_ROW,
            INVALID_ENUMERATION_OPTION,
            AMBIGUOUS_ENUMERATION_OPTION,
            FAILED_VALIDATION,
            FAILED_TO_CREATE_ASSOCIATION,
            ASSOCIATION_LIMIT_EXCEEDED,
            FILE_NOT_FOUND,
            INVALID_COLUMN_CONFIGURATION,
            INVALID_FILE_TYPE,
            INVALID_SPREADSHEET,
            INVALID_SHEET_COUNT,
            FAILED_TO_PROCESS_OBJECT_WITH_EMPTY_PROPERTY_VALUES,
            UNKNOWN_BAD_REQUEST,
            GDPR_BLACKLISTED_EMAIL,
            DUPLICATE_ASSOCIATION_ID,
            LIMIT_EXCEEDED,
            PORTAL_WIDE_CUSTOM_OBJECT_LIMIT_EXCEEDED,
            INVALID_ALTERNATE_ID,
            INVALID_EMAIL,
            SECONDARY_EMAIL_WRITE_FAILURE,
            INVALID_DOMAIN,
            DUPLICATE_ROW_CONTENT,
            INVALID_NUMBER_SIZE,
            UNKNOWN_ERROR,
            FAILED_TO_OPT_OUT_CONTACT,
            INVALID_REQUIRED_PROPERTY,
            MISSING_REQUIRED_PROPERTY,
            DUPLICATE_ALTERNATE_ID,
            DUPLICATE_OBJECT_ID,
            DUPLICATE_UNIQUE_PROPERTY_VALUE,
            UNKNOWN_ASSOCIATION_RECORD_ID,
            INVALID_RECORD_ID,
            DUPLICATE_RECORD_ID,
            INVALID_CUSTOM_PROPERTY_VALIDATION,
            CREATE_ONLY_IMPORT,
            UPDATE_ONLY_IMPORT,
            COLUMN_TOO_LARGE,
            ROW_DATA_TOO_LARGE,
            MISSING_EVENT_TIMESTAMP,
            INVALID_EVENT_TIMESTAMP,
            INVALID_EVENT,
            DUPLICATE_EVENT,
            MISSING_EVENT_DEFINITION,
            INVALID_ASSOCIATION_KEY,
            ASSOCIATION_RECORD_NOT_FOUND,
            MISSING_OBJECT_DEFINITION,
            ASSOCIATION_LABEL_NOT_FOUND,
            MANY_ERRORS_IN_ROW,
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
                INCORRECT_NUMBER_OF_COLUMNS -> Value.INCORRECT_NUMBER_OF_COLUMNS
                INVALID_OBJECT_ID -> Value.INVALID_OBJECT_ID
                INVALID_ASSOCIATION_IDENTIFIER -> Value.INVALID_ASSOCIATION_IDENTIFIER
                NO_OBJECT_ID_FROM_ASSOCIATION_IDENTIFIER ->
                    Value.NO_OBJECT_ID_FROM_ASSOCIATION_IDENTIFIER
                MULTIPLE_COMPANIES_WITH_THIS_DOMAIN -> Value.MULTIPLE_COMPANIES_WITH_THIS_DOMAIN
                PROPERTY_DEFINITION_NOT_FOUND -> Value.PROPERTY_DEFINITION_NOT_FOUND
                PROPERTY_VALUE_NOT_FOUND -> Value.PROPERTY_VALUE_NOT_FOUND
                COULD_NOT_FIND_OWNER -> Value.COULD_NOT_FIND_OWNER
                MULTIPLE_OWNERS_FOUND -> Value.MULTIPLE_OWNERS_FOUND
                COULD_NOT_FIND_BUSINESS_UNIT -> Value.COULD_NOT_FIND_BUSINESS_UNIT
                COULD_NOT_PARSE_NUMBER -> Value.COULD_NOT_PARSE_NUMBER
                COULD_NOT_PARSE_DATE -> Value.COULD_NOT_PARSE_DATE
                COULD_NOT_PARSE_TERM -> Value.COULD_NOT_PARSE_TERM
                OUTSIDE_VALID_TIME_RANGE -> Value.OUTSIDE_VALID_TIME_RANGE
                OUTSIDE_VALID_TERM_RANGE -> Value.OUTSIDE_VALID_TERM_RANGE
                COULD_NOT_PARSE_ROW -> Value.COULD_NOT_PARSE_ROW
                INVALID_ENUMERATION_OPTION -> Value.INVALID_ENUMERATION_OPTION
                AMBIGUOUS_ENUMERATION_OPTION -> Value.AMBIGUOUS_ENUMERATION_OPTION
                FAILED_VALIDATION -> Value.FAILED_VALIDATION
                FAILED_TO_CREATE_ASSOCIATION -> Value.FAILED_TO_CREATE_ASSOCIATION
                ASSOCIATION_LIMIT_EXCEEDED -> Value.ASSOCIATION_LIMIT_EXCEEDED
                FILE_NOT_FOUND -> Value.FILE_NOT_FOUND
                INVALID_COLUMN_CONFIGURATION -> Value.INVALID_COLUMN_CONFIGURATION
                INVALID_FILE_TYPE -> Value.INVALID_FILE_TYPE
                INVALID_SPREADSHEET -> Value.INVALID_SPREADSHEET
                INVALID_SHEET_COUNT -> Value.INVALID_SHEET_COUNT
                FAILED_TO_PROCESS_OBJECT_WITH_EMPTY_PROPERTY_VALUES ->
                    Value.FAILED_TO_PROCESS_OBJECT_WITH_EMPTY_PROPERTY_VALUES
                UNKNOWN_BAD_REQUEST -> Value.UNKNOWN_BAD_REQUEST
                GDPR_BLACKLISTED_EMAIL -> Value.GDPR_BLACKLISTED_EMAIL
                DUPLICATE_ASSOCIATION_ID -> Value.DUPLICATE_ASSOCIATION_ID
                LIMIT_EXCEEDED -> Value.LIMIT_EXCEEDED
                PORTAL_WIDE_CUSTOM_OBJECT_LIMIT_EXCEEDED ->
                    Value.PORTAL_WIDE_CUSTOM_OBJECT_LIMIT_EXCEEDED
                INVALID_ALTERNATE_ID -> Value.INVALID_ALTERNATE_ID
                INVALID_EMAIL -> Value.INVALID_EMAIL
                SECONDARY_EMAIL_WRITE_FAILURE -> Value.SECONDARY_EMAIL_WRITE_FAILURE
                INVALID_DOMAIN -> Value.INVALID_DOMAIN
                DUPLICATE_ROW_CONTENT -> Value.DUPLICATE_ROW_CONTENT
                INVALID_NUMBER_SIZE -> Value.INVALID_NUMBER_SIZE
                UNKNOWN_ERROR -> Value.UNKNOWN_ERROR
                FAILED_TO_OPT_OUT_CONTACT -> Value.FAILED_TO_OPT_OUT_CONTACT
                INVALID_REQUIRED_PROPERTY -> Value.INVALID_REQUIRED_PROPERTY
                MISSING_REQUIRED_PROPERTY -> Value.MISSING_REQUIRED_PROPERTY
                DUPLICATE_ALTERNATE_ID -> Value.DUPLICATE_ALTERNATE_ID
                DUPLICATE_OBJECT_ID -> Value.DUPLICATE_OBJECT_ID
                DUPLICATE_UNIQUE_PROPERTY_VALUE -> Value.DUPLICATE_UNIQUE_PROPERTY_VALUE
                UNKNOWN_ASSOCIATION_RECORD_ID -> Value.UNKNOWN_ASSOCIATION_RECORD_ID
                INVALID_RECORD_ID -> Value.INVALID_RECORD_ID
                DUPLICATE_RECORD_ID -> Value.DUPLICATE_RECORD_ID
                INVALID_CUSTOM_PROPERTY_VALIDATION -> Value.INVALID_CUSTOM_PROPERTY_VALIDATION
                CREATE_ONLY_IMPORT -> Value.CREATE_ONLY_IMPORT
                UPDATE_ONLY_IMPORT -> Value.UPDATE_ONLY_IMPORT
                COLUMN_TOO_LARGE -> Value.COLUMN_TOO_LARGE
                ROW_DATA_TOO_LARGE -> Value.ROW_DATA_TOO_LARGE
                MISSING_EVENT_TIMESTAMP -> Value.MISSING_EVENT_TIMESTAMP
                INVALID_EVENT_TIMESTAMP -> Value.INVALID_EVENT_TIMESTAMP
                INVALID_EVENT -> Value.INVALID_EVENT
                DUPLICATE_EVENT -> Value.DUPLICATE_EVENT
                MISSING_EVENT_DEFINITION -> Value.MISSING_EVENT_DEFINITION
                INVALID_ASSOCIATION_KEY -> Value.INVALID_ASSOCIATION_KEY
                ASSOCIATION_RECORD_NOT_FOUND -> Value.ASSOCIATION_RECORD_NOT_FOUND
                MISSING_OBJECT_DEFINITION -> Value.MISSING_OBJECT_DEFINITION
                ASSOCIATION_LABEL_NOT_FOUND -> Value.ASSOCIATION_LABEL_NOT_FOUND
                MANY_ERRORS_IN_ROW -> Value.MANY_ERRORS_IN_ROW
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
                INCORRECT_NUMBER_OF_COLUMNS -> Known.INCORRECT_NUMBER_OF_COLUMNS
                INVALID_OBJECT_ID -> Known.INVALID_OBJECT_ID
                INVALID_ASSOCIATION_IDENTIFIER -> Known.INVALID_ASSOCIATION_IDENTIFIER
                NO_OBJECT_ID_FROM_ASSOCIATION_IDENTIFIER ->
                    Known.NO_OBJECT_ID_FROM_ASSOCIATION_IDENTIFIER
                MULTIPLE_COMPANIES_WITH_THIS_DOMAIN -> Known.MULTIPLE_COMPANIES_WITH_THIS_DOMAIN
                PROPERTY_DEFINITION_NOT_FOUND -> Known.PROPERTY_DEFINITION_NOT_FOUND
                PROPERTY_VALUE_NOT_FOUND -> Known.PROPERTY_VALUE_NOT_FOUND
                COULD_NOT_FIND_OWNER -> Known.COULD_NOT_FIND_OWNER
                MULTIPLE_OWNERS_FOUND -> Known.MULTIPLE_OWNERS_FOUND
                COULD_NOT_FIND_BUSINESS_UNIT -> Known.COULD_NOT_FIND_BUSINESS_UNIT
                COULD_NOT_PARSE_NUMBER -> Known.COULD_NOT_PARSE_NUMBER
                COULD_NOT_PARSE_DATE -> Known.COULD_NOT_PARSE_DATE
                COULD_NOT_PARSE_TERM -> Known.COULD_NOT_PARSE_TERM
                OUTSIDE_VALID_TIME_RANGE -> Known.OUTSIDE_VALID_TIME_RANGE
                OUTSIDE_VALID_TERM_RANGE -> Known.OUTSIDE_VALID_TERM_RANGE
                COULD_NOT_PARSE_ROW -> Known.COULD_NOT_PARSE_ROW
                INVALID_ENUMERATION_OPTION -> Known.INVALID_ENUMERATION_OPTION
                AMBIGUOUS_ENUMERATION_OPTION -> Known.AMBIGUOUS_ENUMERATION_OPTION
                FAILED_VALIDATION -> Known.FAILED_VALIDATION
                FAILED_TO_CREATE_ASSOCIATION -> Known.FAILED_TO_CREATE_ASSOCIATION
                ASSOCIATION_LIMIT_EXCEEDED -> Known.ASSOCIATION_LIMIT_EXCEEDED
                FILE_NOT_FOUND -> Known.FILE_NOT_FOUND
                INVALID_COLUMN_CONFIGURATION -> Known.INVALID_COLUMN_CONFIGURATION
                INVALID_FILE_TYPE -> Known.INVALID_FILE_TYPE
                INVALID_SPREADSHEET -> Known.INVALID_SPREADSHEET
                INVALID_SHEET_COUNT -> Known.INVALID_SHEET_COUNT
                FAILED_TO_PROCESS_OBJECT_WITH_EMPTY_PROPERTY_VALUES ->
                    Known.FAILED_TO_PROCESS_OBJECT_WITH_EMPTY_PROPERTY_VALUES
                UNKNOWN_BAD_REQUEST -> Known.UNKNOWN_BAD_REQUEST
                GDPR_BLACKLISTED_EMAIL -> Known.GDPR_BLACKLISTED_EMAIL
                DUPLICATE_ASSOCIATION_ID -> Known.DUPLICATE_ASSOCIATION_ID
                LIMIT_EXCEEDED -> Known.LIMIT_EXCEEDED
                PORTAL_WIDE_CUSTOM_OBJECT_LIMIT_EXCEEDED ->
                    Known.PORTAL_WIDE_CUSTOM_OBJECT_LIMIT_EXCEEDED
                INVALID_ALTERNATE_ID -> Known.INVALID_ALTERNATE_ID
                INVALID_EMAIL -> Known.INVALID_EMAIL
                SECONDARY_EMAIL_WRITE_FAILURE -> Known.SECONDARY_EMAIL_WRITE_FAILURE
                INVALID_DOMAIN -> Known.INVALID_DOMAIN
                DUPLICATE_ROW_CONTENT -> Known.DUPLICATE_ROW_CONTENT
                INVALID_NUMBER_SIZE -> Known.INVALID_NUMBER_SIZE
                UNKNOWN_ERROR -> Known.UNKNOWN_ERROR
                FAILED_TO_OPT_OUT_CONTACT -> Known.FAILED_TO_OPT_OUT_CONTACT
                INVALID_REQUIRED_PROPERTY -> Known.INVALID_REQUIRED_PROPERTY
                MISSING_REQUIRED_PROPERTY -> Known.MISSING_REQUIRED_PROPERTY
                DUPLICATE_ALTERNATE_ID -> Known.DUPLICATE_ALTERNATE_ID
                DUPLICATE_OBJECT_ID -> Known.DUPLICATE_OBJECT_ID
                DUPLICATE_UNIQUE_PROPERTY_VALUE -> Known.DUPLICATE_UNIQUE_PROPERTY_VALUE
                UNKNOWN_ASSOCIATION_RECORD_ID -> Known.UNKNOWN_ASSOCIATION_RECORD_ID
                INVALID_RECORD_ID -> Known.INVALID_RECORD_ID
                DUPLICATE_RECORD_ID -> Known.DUPLICATE_RECORD_ID
                INVALID_CUSTOM_PROPERTY_VALIDATION -> Known.INVALID_CUSTOM_PROPERTY_VALIDATION
                CREATE_ONLY_IMPORT -> Known.CREATE_ONLY_IMPORT
                UPDATE_ONLY_IMPORT -> Known.UPDATE_ONLY_IMPORT
                COLUMN_TOO_LARGE -> Known.COLUMN_TOO_LARGE
                ROW_DATA_TOO_LARGE -> Known.ROW_DATA_TOO_LARGE
                MISSING_EVENT_TIMESTAMP -> Known.MISSING_EVENT_TIMESTAMP
                INVALID_EVENT_TIMESTAMP -> Known.INVALID_EVENT_TIMESTAMP
                INVALID_EVENT -> Known.INVALID_EVENT
                DUPLICATE_EVENT -> Known.DUPLICATE_EVENT
                MISSING_EVENT_DEFINITION -> Known.MISSING_EVENT_DEFINITION
                INVALID_ASSOCIATION_KEY -> Known.INVALID_ASSOCIATION_KEY
                ASSOCIATION_RECORD_NOT_FOUND -> Known.ASSOCIATION_RECORD_NOT_FOUND
                MISSING_OBJECT_DEFINITION -> Known.MISSING_OBJECT_DEFINITION
                ASSOCIATION_LABEL_NOT_FOUND -> Known.ASSOCIATION_LABEL_NOT_FOUND
                MANY_ERRORS_IN_ROW -> Known.MANY_ERRORS_IN_ROW
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

            @JvmField val CONTACT = of("CONTACT")

            @JvmField val COMPANY = of("COMPANY")

            @JvmField val DEAL = of("DEAL")

            @JvmField val ENGAGEMENT = of("ENGAGEMENT")

            @JvmField val TICKET = of("TICKET")

            @JvmField val OWNER = of("OWNER")

            @JvmField val PRODUCT = of("PRODUCT")

            @JvmField val LINE_ITEM = of("LINE_ITEM")

            @JvmField val BET_DELIVERABLE_SERVICE = of("BET_DELIVERABLE_SERVICE")

            @JvmField val CONTENT = of("CONTENT")

            @JvmField val CONVERSATION = of("CONVERSATION")

            @JvmField val BET_ALERT = of("BET_ALERT")

            @JvmField val PORTAL = of("PORTAL")

            @JvmField val QUOTE = of("QUOTE")

            @JvmField val FORM_SUBMISSION_INBOUNDDB = of("FORM_SUBMISSION_INBOUNDDB")

            @JvmField val QUOTA = of("QUOTA")

            @JvmField val UNSUBSCRIBE = of("UNSUBSCRIBE")

            @JvmField val COMMUNICATION = of("COMMUNICATION")

            @JvmField val FEEDBACK_SUBMISSION = of("FEEDBACK_SUBMISSION")

            @JvmField val ATTRIBUTION = of("ATTRIBUTION")

            @JvmField val SALESFORCE_SYNC_ERROR = of("SALESFORCE_SYNC_ERROR")

            @JvmField val RESTORABLE_CRM_OBJECT = of("RESTORABLE_CRM_OBJECT")

            @JvmField val HUB = of("HUB")

            @JvmField val LANDING_PAGE = of("LANDING_PAGE")

            @JvmField val PRODUCT_OR_FOLDER = of("PRODUCT_OR_FOLDER")

            @JvmField val TASK = of("TASK")

            @JvmField val FORM = of("FORM")

            @JvmField val MARKETING_EMAIL = of("MARKETING_EMAIL")

            @JvmField val AD_ACCOUNT = of("AD_ACCOUNT")

            @JvmField val AD_CAMPAIGN = of("AD_CAMPAIGN")

            @JvmField val AD_GROUP = of("AD_GROUP")

            @JvmField val AD = of("AD")

            @JvmField val KEYWORD = of("KEYWORD")

            @JvmField val CAMPAIGN = of("CAMPAIGN")

            @JvmField val SOCIAL_CHANNEL = of("SOCIAL_CHANNEL")

            @JvmField val SOCIAL_POST = of("SOCIAL_POST")

            @JvmField val SITE_PAGE = of("SITE_PAGE")

            @JvmField val BLOG_POST = of("BLOG_POST")

            @JvmField val IMPORT = of("IMPORT")

            @JvmField val EXPORT = of("EXPORT")

            @JvmField val CTA = of("CTA")

            @JvmField val TASK_TEMPLATE = of("TASK_TEMPLATE")

            @JvmField val AUTOMATION_PLATFORM_FLOW = of("AUTOMATION_PLATFORM_FLOW")

            @JvmField val OBJECT_LIST = of("OBJECT_LIST")

            @JvmField val NOTE = of("NOTE")

            @JvmField val MEETING_EVENT = of("MEETING_EVENT")

            @JvmField val CALL = of("CALL")

            @JvmField val EMAIL = of("EMAIL")

            @JvmField val PUBLISHING_TASK = of("PUBLISHING_TASK")

            @JvmField val CONVERSATION_SESSION = of("CONVERSATION_SESSION")

            @JvmField val CONTACT_CREATE_ATTRIBUTION = of("CONTACT_CREATE_ATTRIBUTION")

            @JvmField val INVOICE = of("INVOICE")

            @JvmField val MARKETING_EVENT = of("MARKETING_EVENT")

            @JvmField val CONVERSATION_INBOX = of("CONVERSATION_INBOX")

            @JvmField val CHATFLOW = of("CHATFLOW")

            @JvmField val MEDIA_BRIDGE = of("MEDIA_BRIDGE")

            @JvmField val SEQUENCE = of("SEQUENCE")

            @JvmField val SEQUENCE_STEP = of("SEQUENCE_STEP")

            @JvmField val FORECAST = of("FORECAST")

            @JvmField val SNIPPET = of("SNIPPET")

            @JvmField val TEMPLATE = of("TEMPLATE")

            @JvmField val DEAL_CREATE_ATTRIBUTION = of("DEAL_CREATE_ATTRIBUTION")

            @JvmField val QUOTE_TEMPLATE = of("QUOTE_TEMPLATE")

            @JvmField val QUOTE_MODULE = of("QUOTE_MODULE")

            @JvmField val QUOTE_MODULE_FIELD = of("QUOTE_MODULE_FIELD")

            @JvmField val QUOTE_FIELD = of("QUOTE_FIELD")

            @JvmField val SEQUENCE_ENROLLMENT = of("SEQUENCE_ENROLLMENT")

            @JvmField val SUBSCRIPTION = of("SUBSCRIPTION")

            @JvmField val ACCEPTANCE_TEST = of("ACCEPTANCE_TEST")

            @JvmField val SOCIAL_BROADCAST = of("SOCIAL_BROADCAST")

            @JvmField val DEAL_SPLIT = of("DEAL_SPLIT")

            @JvmField val DEAL_REGISTRATION = of("DEAL_REGISTRATION")

            @JvmField val GOAL_TARGET = of("GOAL_TARGET")

            @JvmField val GOAL_TARGET_GROUP = of("GOAL_TARGET_GROUP")

            @JvmField val PORTAL_OBJECT_SYNC_MESSAGE = of("PORTAL_OBJECT_SYNC_MESSAGE")

            @JvmField val FILE_MANAGER_FILE = of("FILE_MANAGER_FILE")

            @JvmField val FILE_MANAGER_FOLDER = of("FILE_MANAGER_FOLDER")

            @JvmField val SEQUENCE_STEP_ENROLLMENT = of("SEQUENCE_STEP_ENROLLMENT")

            @JvmField val APPROVAL = of("APPROVAL")

            @JvmField val APPROVAL_STEP = of("APPROVAL_STEP")

            @JvmField val CTA_VARIANT = of("CTA_VARIANT")

            @JvmField val SALES_DOCUMENT = of("SALES_DOCUMENT")

            @JvmField val DISCOUNT = of("DISCOUNT")

            @JvmField val FEE = of("FEE")

            @JvmField val TAX = of("TAX")

            @JvmField val MARKETING_CALENDAR = of("MARKETING_CALENDAR")

            @JvmField val PERMISSIONS_TESTING = of("PERMISSIONS_TESTING")

            @JvmField val PRIVACY_SCANNER_COOKIE = of("PRIVACY_SCANNER_COOKIE")

            @JvmField val DATA_SYNC_STATE = of("DATA_SYNC_STATE")

            @JvmField val WEB_INTERACTIVE = of("WEB_INTERACTIVE")

            @JvmField val PLAYBOOK = of("PLAYBOOK")

            @JvmField val FOLDER = of("FOLDER")

            @JvmField val PLAYBOOK_QUESTION = of("PLAYBOOK_QUESTION")

            @JvmField val PLAYBOOK_SUBMISSION = of("PLAYBOOK_SUBMISSION")

            @JvmField val PLAYBOOK_SUBMISSION_ANSWER = of("PLAYBOOK_SUBMISSION_ANSWER")

            @JvmField val COMMERCE_PAYMENT = of("COMMERCE_PAYMENT")

            @JvmField val GSC_PROPERTY = of("GSC_PROPERTY")

            @JvmField val SOX_PROTECTED_DUMMY_TYPE = of("SOX_PROTECTED_DUMMY_TYPE")

            @JvmField val BLOG_LISTING_PAGE = of("BLOG_LISTING_PAGE")

            @JvmField val QUARANTINED_SUBMISSION = of("QUARANTINED_SUBMISSION")

            @JvmField val PAYMENT_SCHEDULE = of("PAYMENT_SCHEDULE")

            @JvmField val PAYMENT_SCHEDULE_INSTALLMENT = of("PAYMENT_SCHEDULE_INSTALLMENT")

            @JvmField val MARKETING_CAMPAIGN_UTM = of("MARKETING_CAMPAIGN_UTM")

            @JvmField val DISCOUNT_TEMPLATE = of("DISCOUNT_TEMPLATE")

            @JvmField val DISCOUNT_CODE = of("DISCOUNT_CODE")

            @JvmField val FEEDBACK_SURVEY = of("FEEDBACK_SURVEY")

            @JvmField val CMS_URL = of("CMS_URL")

            @JvmField val SALES_TASK = of("SALES_TASK")

            @JvmField val SALES_WORKLOAD = of("SALES_WORKLOAD")

            @JvmField val USER = of("USER")

            @JvmField val POSTAL_MAIL = of("POSTAL_MAIL")

            @JvmField val SCHEMAS_BACKEND_TEST = of("SCHEMAS_BACKEND_TEST")

            @JvmField val PAYMENT_LINK = of("PAYMENT_LINK")

            @JvmField val SUBMISSION_TAG = of("SUBMISSION_TAG")

            @JvmField val CAMPAIGN_STEP = of("CAMPAIGN_STEP")

            @JvmField val SCHEDULING_PAGE = of("SCHEDULING_PAGE")

            @JvmField val SOX_PROTECTED_TEST_TYPE = of("SOX_PROTECTED_TEST_TYPE")

            @JvmField val ORDER = of("ORDER")

            @JvmField val MARKETING_SMS = of("MARKETING_SMS")

            @JvmField val PARTNER_ACCOUNT = of("PARTNER_ACCOUNT")

            @JvmField val CAMPAIGN_TEMPLATE = of("CAMPAIGN_TEMPLATE")

            @JvmField val CAMPAIGN_TEMPLATE_STEP = of("CAMPAIGN_TEMPLATE_STEP")

            @JvmField val PLAYLIST = of("PLAYLIST")

            @JvmField val CLIP = of("CLIP")

            @JvmField val CAMPAIGN_BUDGET_ITEM = of("CAMPAIGN_BUDGET_ITEM")

            @JvmField val CAMPAIGN_SPEND_ITEM = of("CAMPAIGN_SPEND_ITEM")

            @JvmField val MIC = of("MIC")

            @JvmField val CONTENT_AUDIT = of("CONTENT_AUDIT")

            @JvmField val CONTENT_AUDIT_PAGE = of("CONTENT_AUDIT_PAGE")

            @JvmField val PLAYLIST_FOLDER = of("PLAYLIST_FOLDER")

            @JvmField val LEAD = of("LEAD")

            @JvmField val ABANDONED_CART = of("ABANDONED_CART")

            @JvmField val EXTERNAL_WEB_URL = of("EXTERNAL_WEB_URL")

            @JvmField val VIEW = of("VIEW")

            @JvmField val VIEW_BLOCK = of("VIEW_BLOCK")

            @JvmField val ROSTER = of("ROSTER")

            @JvmField val CART = of("CART")

            @JvmField val AUTOMATION_PLATFORM_FLOW_ACTION = of("AUTOMATION_PLATFORM_FLOW_ACTION")

            @JvmField val SOCIAL_PROFILE = of("SOCIAL_PROFILE")

            @JvmField val PARTNER_CLIENT = of("PARTNER_CLIENT")

            @JvmField val ROSTER_MEMBER = of("ROSTER_MEMBER")

            @JvmField val MARKETING_EVENT_ATTENDANCE = of("MARKETING_EVENT_ATTENDANCE")

            @JvmField val ALL_PAGES = of("ALL_PAGES")

            @JvmField val AI_FORECAST = of("AI_FORECAST")

            @JvmField val CRM_PIPELINES_DUMMY_TYPE = of("CRM_PIPELINES_DUMMY_TYPE")

            @JvmField val KNOWLEDGE_ARTICLE = of("KNOWLEDGE_ARTICLE")

            @JvmField val PROPERTY_INFO = of("PROPERTY_INFO")

            @JvmField val DATA_PRIVACY_CONSENT = of("DATA_PRIVACY_CONSENT")

            @JvmField val GOAL_TEMPLATE = of("GOAL_TEMPLATE")

            @JvmField val SCORE_CONFIGURATION = of("SCORE_CONFIGURATION")

            @JvmField val AUDIENCE = of("AUDIENCE")

            @JvmField val PARTNER_CLIENT_REVENUE = of("PARTNER_CLIENT_REVENUE")

            @JvmField val AUTOMATION_JOURNEY = of("AUTOMATION_JOURNEY")

            @JvmField val COMBO_EVENT_CONFIGURATION = of("COMBO_EVENT_CONFIGURATION")

            @JvmField val CRM_OBJECTS_DUMMY_TYPE = of("CRM_OBJECTS_DUMMY_TYPE")

            @JvmField val CASE_STUDY = of("CASE_STUDY")

            @JvmField val SERVICE = of("SERVICE")

            @JvmField val PODCAST_EPISODE = of("PODCAST_EPISODE")

            @JvmField val PARTNER_SERVICE = of("PARTNER_SERVICE")

            @JvmField
            val PROSPECTING_AGENT_CONTACT_ASSIGNMENT = of("PROSPECTING_AGENT_CONTACT_ASSIGNMENT")

            @JvmField val UNKNOWN = of("UNKNOWN")

            @JvmStatic fun of(value: String) = ObjectType(JsonField.of(value))
        }

        /** An enum containing [ObjectType]'s known values. */
        enum class Known {
            CONTACT,
            COMPANY,
            DEAL,
            ENGAGEMENT,
            TICKET,
            OWNER,
            PRODUCT,
            LINE_ITEM,
            BET_DELIVERABLE_SERVICE,
            CONTENT,
            CONVERSATION,
            BET_ALERT,
            PORTAL,
            QUOTE,
            FORM_SUBMISSION_INBOUNDDB,
            QUOTA,
            UNSUBSCRIBE,
            COMMUNICATION,
            FEEDBACK_SUBMISSION,
            ATTRIBUTION,
            SALESFORCE_SYNC_ERROR,
            RESTORABLE_CRM_OBJECT,
            HUB,
            LANDING_PAGE,
            PRODUCT_OR_FOLDER,
            TASK,
            FORM,
            MARKETING_EMAIL,
            AD_ACCOUNT,
            AD_CAMPAIGN,
            AD_GROUP,
            AD,
            KEYWORD,
            CAMPAIGN,
            SOCIAL_CHANNEL,
            SOCIAL_POST,
            SITE_PAGE,
            BLOG_POST,
            IMPORT,
            EXPORT,
            CTA,
            TASK_TEMPLATE,
            AUTOMATION_PLATFORM_FLOW,
            OBJECT_LIST,
            NOTE,
            MEETING_EVENT,
            CALL,
            EMAIL,
            PUBLISHING_TASK,
            CONVERSATION_SESSION,
            CONTACT_CREATE_ATTRIBUTION,
            INVOICE,
            MARKETING_EVENT,
            CONVERSATION_INBOX,
            CHATFLOW,
            MEDIA_BRIDGE,
            SEQUENCE,
            SEQUENCE_STEP,
            FORECAST,
            SNIPPET,
            TEMPLATE,
            DEAL_CREATE_ATTRIBUTION,
            QUOTE_TEMPLATE,
            QUOTE_MODULE,
            QUOTE_MODULE_FIELD,
            QUOTE_FIELD,
            SEQUENCE_ENROLLMENT,
            SUBSCRIPTION,
            ACCEPTANCE_TEST,
            SOCIAL_BROADCAST,
            DEAL_SPLIT,
            DEAL_REGISTRATION,
            GOAL_TARGET,
            GOAL_TARGET_GROUP,
            PORTAL_OBJECT_SYNC_MESSAGE,
            FILE_MANAGER_FILE,
            FILE_MANAGER_FOLDER,
            SEQUENCE_STEP_ENROLLMENT,
            APPROVAL,
            APPROVAL_STEP,
            CTA_VARIANT,
            SALES_DOCUMENT,
            DISCOUNT,
            FEE,
            TAX,
            MARKETING_CALENDAR,
            PERMISSIONS_TESTING,
            PRIVACY_SCANNER_COOKIE,
            DATA_SYNC_STATE,
            WEB_INTERACTIVE,
            PLAYBOOK,
            FOLDER,
            PLAYBOOK_QUESTION,
            PLAYBOOK_SUBMISSION,
            PLAYBOOK_SUBMISSION_ANSWER,
            COMMERCE_PAYMENT,
            GSC_PROPERTY,
            SOX_PROTECTED_DUMMY_TYPE,
            BLOG_LISTING_PAGE,
            QUARANTINED_SUBMISSION,
            PAYMENT_SCHEDULE,
            PAYMENT_SCHEDULE_INSTALLMENT,
            MARKETING_CAMPAIGN_UTM,
            DISCOUNT_TEMPLATE,
            DISCOUNT_CODE,
            FEEDBACK_SURVEY,
            CMS_URL,
            SALES_TASK,
            SALES_WORKLOAD,
            USER,
            POSTAL_MAIL,
            SCHEMAS_BACKEND_TEST,
            PAYMENT_LINK,
            SUBMISSION_TAG,
            CAMPAIGN_STEP,
            SCHEDULING_PAGE,
            SOX_PROTECTED_TEST_TYPE,
            ORDER,
            MARKETING_SMS,
            PARTNER_ACCOUNT,
            CAMPAIGN_TEMPLATE,
            CAMPAIGN_TEMPLATE_STEP,
            PLAYLIST,
            CLIP,
            CAMPAIGN_BUDGET_ITEM,
            CAMPAIGN_SPEND_ITEM,
            MIC,
            CONTENT_AUDIT,
            CONTENT_AUDIT_PAGE,
            PLAYLIST_FOLDER,
            LEAD,
            ABANDONED_CART,
            EXTERNAL_WEB_URL,
            VIEW,
            VIEW_BLOCK,
            ROSTER,
            CART,
            AUTOMATION_PLATFORM_FLOW_ACTION,
            SOCIAL_PROFILE,
            PARTNER_CLIENT,
            ROSTER_MEMBER,
            MARKETING_EVENT_ATTENDANCE,
            ALL_PAGES,
            AI_FORECAST,
            CRM_PIPELINES_DUMMY_TYPE,
            KNOWLEDGE_ARTICLE,
            PROPERTY_INFO,
            DATA_PRIVACY_CONSENT,
            GOAL_TEMPLATE,
            SCORE_CONFIGURATION,
            AUDIENCE,
            PARTNER_CLIENT_REVENUE,
            AUTOMATION_JOURNEY,
            COMBO_EVENT_CONFIGURATION,
            CRM_OBJECTS_DUMMY_TYPE,
            CASE_STUDY,
            SERVICE,
            PODCAST_EPISODE,
            PARTNER_SERVICE,
            PROSPECTING_AGENT_CONTACT_ASSIGNMENT,
            UNKNOWN,
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
            CONTACT,
            COMPANY,
            DEAL,
            ENGAGEMENT,
            TICKET,
            OWNER,
            PRODUCT,
            LINE_ITEM,
            BET_DELIVERABLE_SERVICE,
            CONTENT,
            CONVERSATION,
            BET_ALERT,
            PORTAL,
            QUOTE,
            FORM_SUBMISSION_INBOUNDDB,
            QUOTA,
            UNSUBSCRIBE,
            COMMUNICATION,
            FEEDBACK_SUBMISSION,
            ATTRIBUTION,
            SALESFORCE_SYNC_ERROR,
            RESTORABLE_CRM_OBJECT,
            HUB,
            LANDING_PAGE,
            PRODUCT_OR_FOLDER,
            TASK,
            FORM,
            MARKETING_EMAIL,
            AD_ACCOUNT,
            AD_CAMPAIGN,
            AD_GROUP,
            AD,
            KEYWORD,
            CAMPAIGN,
            SOCIAL_CHANNEL,
            SOCIAL_POST,
            SITE_PAGE,
            BLOG_POST,
            IMPORT,
            EXPORT,
            CTA,
            TASK_TEMPLATE,
            AUTOMATION_PLATFORM_FLOW,
            OBJECT_LIST,
            NOTE,
            MEETING_EVENT,
            CALL,
            EMAIL,
            PUBLISHING_TASK,
            CONVERSATION_SESSION,
            CONTACT_CREATE_ATTRIBUTION,
            INVOICE,
            MARKETING_EVENT,
            CONVERSATION_INBOX,
            CHATFLOW,
            MEDIA_BRIDGE,
            SEQUENCE,
            SEQUENCE_STEP,
            FORECAST,
            SNIPPET,
            TEMPLATE,
            DEAL_CREATE_ATTRIBUTION,
            QUOTE_TEMPLATE,
            QUOTE_MODULE,
            QUOTE_MODULE_FIELD,
            QUOTE_FIELD,
            SEQUENCE_ENROLLMENT,
            SUBSCRIPTION,
            ACCEPTANCE_TEST,
            SOCIAL_BROADCAST,
            DEAL_SPLIT,
            DEAL_REGISTRATION,
            GOAL_TARGET,
            GOAL_TARGET_GROUP,
            PORTAL_OBJECT_SYNC_MESSAGE,
            FILE_MANAGER_FILE,
            FILE_MANAGER_FOLDER,
            SEQUENCE_STEP_ENROLLMENT,
            APPROVAL,
            APPROVAL_STEP,
            CTA_VARIANT,
            SALES_DOCUMENT,
            DISCOUNT,
            FEE,
            TAX,
            MARKETING_CALENDAR,
            PERMISSIONS_TESTING,
            PRIVACY_SCANNER_COOKIE,
            DATA_SYNC_STATE,
            WEB_INTERACTIVE,
            PLAYBOOK,
            FOLDER,
            PLAYBOOK_QUESTION,
            PLAYBOOK_SUBMISSION,
            PLAYBOOK_SUBMISSION_ANSWER,
            COMMERCE_PAYMENT,
            GSC_PROPERTY,
            SOX_PROTECTED_DUMMY_TYPE,
            BLOG_LISTING_PAGE,
            QUARANTINED_SUBMISSION,
            PAYMENT_SCHEDULE,
            PAYMENT_SCHEDULE_INSTALLMENT,
            MARKETING_CAMPAIGN_UTM,
            DISCOUNT_TEMPLATE,
            DISCOUNT_CODE,
            FEEDBACK_SURVEY,
            CMS_URL,
            SALES_TASK,
            SALES_WORKLOAD,
            USER,
            POSTAL_MAIL,
            SCHEMAS_BACKEND_TEST,
            PAYMENT_LINK,
            SUBMISSION_TAG,
            CAMPAIGN_STEP,
            SCHEDULING_PAGE,
            SOX_PROTECTED_TEST_TYPE,
            ORDER,
            MARKETING_SMS,
            PARTNER_ACCOUNT,
            CAMPAIGN_TEMPLATE,
            CAMPAIGN_TEMPLATE_STEP,
            PLAYLIST,
            CLIP,
            CAMPAIGN_BUDGET_ITEM,
            CAMPAIGN_SPEND_ITEM,
            MIC,
            CONTENT_AUDIT,
            CONTENT_AUDIT_PAGE,
            PLAYLIST_FOLDER,
            LEAD,
            ABANDONED_CART,
            EXTERNAL_WEB_URL,
            VIEW,
            VIEW_BLOCK,
            ROSTER,
            CART,
            AUTOMATION_PLATFORM_FLOW_ACTION,
            SOCIAL_PROFILE,
            PARTNER_CLIENT,
            ROSTER_MEMBER,
            MARKETING_EVENT_ATTENDANCE,
            ALL_PAGES,
            AI_FORECAST,
            CRM_PIPELINES_DUMMY_TYPE,
            KNOWLEDGE_ARTICLE,
            PROPERTY_INFO,
            DATA_PRIVACY_CONSENT,
            GOAL_TEMPLATE,
            SCORE_CONFIGURATION,
            AUDIENCE,
            PARTNER_CLIENT_REVENUE,
            AUTOMATION_JOURNEY,
            COMBO_EVENT_CONFIGURATION,
            CRM_OBJECTS_DUMMY_TYPE,
            CASE_STUDY,
            SERVICE,
            PODCAST_EPISODE,
            PARTNER_SERVICE,
            PROSPECTING_AGENT_CONTACT_ASSIGNMENT,
            UNKNOWN,
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
                CONTACT -> Value.CONTACT
                COMPANY -> Value.COMPANY
                DEAL -> Value.DEAL
                ENGAGEMENT -> Value.ENGAGEMENT
                TICKET -> Value.TICKET
                OWNER -> Value.OWNER
                PRODUCT -> Value.PRODUCT
                LINE_ITEM -> Value.LINE_ITEM
                BET_DELIVERABLE_SERVICE -> Value.BET_DELIVERABLE_SERVICE
                CONTENT -> Value.CONTENT
                CONVERSATION -> Value.CONVERSATION
                BET_ALERT -> Value.BET_ALERT
                PORTAL -> Value.PORTAL
                QUOTE -> Value.QUOTE
                FORM_SUBMISSION_INBOUNDDB -> Value.FORM_SUBMISSION_INBOUNDDB
                QUOTA -> Value.QUOTA
                UNSUBSCRIBE -> Value.UNSUBSCRIBE
                COMMUNICATION -> Value.COMMUNICATION
                FEEDBACK_SUBMISSION -> Value.FEEDBACK_SUBMISSION
                ATTRIBUTION -> Value.ATTRIBUTION
                SALESFORCE_SYNC_ERROR -> Value.SALESFORCE_SYNC_ERROR
                RESTORABLE_CRM_OBJECT -> Value.RESTORABLE_CRM_OBJECT
                HUB -> Value.HUB
                LANDING_PAGE -> Value.LANDING_PAGE
                PRODUCT_OR_FOLDER -> Value.PRODUCT_OR_FOLDER
                TASK -> Value.TASK
                FORM -> Value.FORM
                MARKETING_EMAIL -> Value.MARKETING_EMAIL
                AD_ACCOUNT -> Value.AD_ACCOUNT
                AD_CAMPAIGN -> Value.AD_CAMPAIGN
                AD_GROUP -> Value.AD_GROUP
                AD -> Value.AD
                KEYWORD -> Value.KEYWORD
                CAMPAIGN -> Value.CAMPAIGN
                SOCIAL_CHANNEL -> Value.SOCIAL_CHANNEL
                SOCIAL_POST -> Value.SOCIAL_POST
                SITE_PAGE -> Value.SITE_PAGE
                BLOG_POST -> Value.BLOG_POST
                IMPORT -> Value.IMPORT
                EXPORT -> Value.EXPORT
                CTA -> Value.CTA
                TASK_TEMPLATE -> Value.TASK_TEMPLATE
                AUTOMATION_PLATFORM_FLOW -> Value.AUTOMATION_PLATFORM_FLOW
                OBJECT_LIST -> Value.OBJECT_LIST
                NOTE -> Value.NOTE
                MEETING_EVENT -> Value.MEETING_EVENT
                CALL -> Value.CALL
                EMAIL -> Value.EMAIL
                PUBLISHING_TASK -> Value.PUBLISHING_TASK
                CONVERSATION_SESSION -> Value.CONVERSATION_SESSION
                CONTACT_CREATE_ATTRIBUTION -> Value.CONTACT_CREATE_ATTRIBUTION
                INVOICE -> Value.INVOICE
                MARKETING_EVENT -> Value.MARKETING_EVENT
                CONVERSATION_INBOX -> Value.CONVERSATION_INBOX
                CHATFLOW -> Value.CHATFLOW
                MEDIA_BRIDGE -> Value.MEDIA_BRIDGE
                SEQUENCE -> Value.SEQUENCE
                SEQUENCE_STEP -> Value.SEQUENCE_STEP
                FORECAST -> Value.FORECAST
                SNIPPET -> Value.SNIPPET
                TEMPLATE -> Value.TEMPLATE
                DEAL_CREATE_ATTRIBUTION -> Value.DEAL_CREATE_ATTRIBUTION
                QUOTE_TEMPLATE -> Value.QUOTE_TEMPLATE
                QUOTE_MODULE -> Value.QUOTE_MODULE
                QUOTE_MODULE_FIELD -> Value.QUOTE_MODULE_FIELD
                QUOTE_FIELD -> Value.QUOTE_FIELD
                SEQUENCE_ENROLLMENT -> Value.SEQUENCE_ENROLLMENT
                SUBSCRIPTION -> Value.SUBSCRIPTION
                ACCEPTANCE_TEST -> Value.ACCEPTANCE_TEST
                SOCIAL_BROADCAST -> Value.SOCIAL_BROADCAST
                DEAL_SPLIT -> Value.DEAL_SPLIT
                DEAL_REGISTRATION -> Value.DEAL_REGISTRATION
                GOAL_TARGET -> Value.GOAL_TARGET
                GOAL_TARGET_GROUP -> Value.GOAL_TARGET_GROUP
                PORTAL_OBJECT_SYNC_MESSAGE -> Value.PORTAL_OBJECT_SYNC_MESSAGE
                FILE_MANAGER_FILE -> Value.FILE_MANAGER_FILE
                FILE_MANAGER_FOLDER -> Value.FILE_MANAGER_FOLDER
                SEQUENCE_STEP_ENROLLMENT -> Value.SEQUENCE_STEP_ENROLLMENT
                APPROVAL -> Value.APPROVAL
                APPROVAL_STEP -> Value.APPROVAL_STEP
                CTA_VARIANT -> Value.CTA_VARIANT
                SALES_DOCUMENT -> Value.SALES_DOCUMENT
                DISCOUNT -> Value.DISCOUNT
                FEE -> Value.FEE
                TAX -> Value.TAX
                MARKETING_CALENDAR -> Value.MARKETING_CALENDAR
                PERMISSIONS_TESTING -> Value.PERMISSIONS_TESTING
                PRIVACY_SCANNER_COOKIE -> Value.PRIVACY_SCANNER_COOKIE
                DATA_SYNC_STATE -> Value.DATA_SYNC_STATE
                WEB_INTERACTIVE -> Value.WEB_INTERACTIVE
                PLAYBOOK -> Value.PLAYBOOK
                FOLDER -> Value.FOLDER
                PLAYBOOK_QUESTION -> Value.PLAYBOOK_QUESTION
                PLAYBOOK_SUBMISSION -> Value.PLAYBOOK_SUBMISSION
                PLAYBOOK_SUBMISSION_ANSWER -> Value.PLAYBOOK_SUBMISSION_ANSWER
                COMMERCE_PAYMENT -> Value.COMMERCE_PAYMENT
                GSC_PROPERTY -> Value.GSC_PROPERTY
                SOX_PROTECTED_DUMMY_TYPE -> Value.SOX_PROTECTED_DUMMY_TYPE
                BLOG_LISTING_PAGE -> Value.BLOG_LISTING_PAGE
                QUARANTINED_SUBMISSION -> Value.QUARANTINED_SUBMISSION
                PAYMENT_SCHEDULE -> Value.PAYMENT_SCHEDULE
                PAYMENT_SCHEDULE_INSTALLMENT -> Value.PAYMENT_SCHEDULE_INSTALLMENT
                MARKETING_CAMPAIGN_UTM -> Value.MARKETING_CAMPAIGN_UTM
                DISCOUNT_TEMPLATE -> Value.DISCOUNT_TEMPLATE
                DISCOUNT_CODE -> Value.DISCOUNT_CODE
                FEEDBACK_SURVEY -> Value.FEEDBACK_SURVEY
                CMS_URL -> Value.CMS_URL
                SALES_TASK -> Value.SALES_TASK
                SALES_WORKLOAD -> Value.SALES_WORKLOAD
                USER -> Value.USER
                POSTAL_MAIL -> Value.POSTAL_MAIL
                SCHEMAS_BACKEND_TEST -> Value.SCHEMAS_BACKEND_TEST
                PAYMENT_LINK -> Value.PAYMENT_LINK
                SUBMISSION_TAG -> Value.SUBMISSION_TAG
                CAMPAIGN_STEP -> Value.CAMPAIGN_STEP
                SCHEDULING_PAGE -> Value.SCHEDULING_PAGE
                SOX_PROTECTED_TEST_TYPE -> Value.SOX_PROTECTED_TEST_TYPE
                ORDER -> Value.ORDER
                MARKETING_SMS -> Value.MARKETING_SMS
                PARTNER_ACCOUNT -> Value.PARTNER_ACCOUNT
                CAMPAIGN_TEMPLATE -> Value.CAMPAIGN_TEMPLATE
                CAMPAIGN_TEMPLATE_STEP -> Value.CAMPAIGN_TEMPLATE_STEP
                PLAYLIST -> Value.PLAYLIST
                CLIP -> Value.CLIP
                CAMPAIGN_BUDGET_ITEM -> Value.CAMPAIGN_BUDGET_ITEM
                CAMPAIGN_SPEND_ITEM -> Value.CAMPAIGN_SPEND_ITEM
                MIC -> Value.MIC
                CONTENT_AUDIT -> Value.CONTENT_AUDIT
                CONTENT_AUDIT_PAGE -> Value.CONTENT_AUDIT_PAGE
                PLAYLIST_FOLDER -> Value.PLAYLIST_FOLDER
                LEAD -> Value.LEAD
                ABANDONED_CART -> Value.ABANDONED_CART
                EXTERNAL_WEB_URL -> Value.EXTERNAL_WEB_URL
                VIEW -> Value.VIEW
                VIEW_BLOCK -> Value.VIEW_BLOCK
                ROSTER -> Value.ROSTER
                CART -> Value.CART
                AUTOMATION_PLATFORM_FLOW_ACTION -> Value.AUTOMATION_PLATFORM_FLOW_ACTION
                SOCIAL_PROFILE -> Value.SOCIAL_PROFILE
                PARTNER_CLIENT -> Value.PARTNER_CLIENT
                ROSTER_MEMBER -> Value.ROSTER_MEMBER
                MARKETING_EVENT_ATTENDANCE -> Value.MARKETING_EVENT_ATTENDANCE
                ALL_PAGES -> Value.ALL_PAGES
                AI_FORECAST -> Value.AI_FORECAST
                CRM_PIPELINES_DUMMY_TYPE -> Value.CRM_PIPELINES_DUMMY_TYPE
                KNOWLEDGE_ARTICLE -> Value.KNOWLEDGE_ARTICLE
                PROPERTY_INFO -> Value.PROPERTY_INFO
                DATA_PRIVACY_CONSENT -> Value.DATA_PRIVACY_CONSENT
                GOAL_TEMPLATE -> Value.GOAL_TEMPLATE
                SCORE_CONFIGURATION -> Value.SCORE_CONFIGURATION
                AUDIENCE -> Value.AUDIENCE
                PARTNER_CLIENT_REVENUE -> Value.PARTNER_CLIENT_REVENUE
                AUTOMATION_JOURNEY -> Value.AUTOMATION_JOURNEY
                COMBO_EVENT_CONFIGURATION -> Value.COMBO_EVENT_CONFIGURATION
                CRM_OBJECTS_DUMMY_TYPE -> Value.CRM_OBJECTS_DUMMY_TYPE
                CASE_STUDY -> Value.CASE_STUDY
                SERVICE -> Value.SERVICE
                PODCAST_EPISODE -> Value.PODCAST_EPISODE
                PARTNER_SERVICE -> Value.PARTNER_SERVICE
                PROSPECTING_AGENT_CONTACT_ASSIGNMENT -> Value.PROSPECTING_AGENT_CONTACT_ASSIGNMENT
                UNKNOWN -> Value.UNKNOWN
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
                CONTACT -> Known.CONTACT
                COMPANY -> Known.COMPANY
                DEAL -> Known.DEAL
                ENGAGEMENT -> Known.ENGAGEMENT
                TICKET -> Known.TICKET
                OWNER -> Known.OWNER
                PRODUCT -> Known.PRODUCT
                LINE_ITEM -> Known.LINE_ITEM
                BET_DELIVERABLE_SERVICE -> Known.BET_DELIVERABLE_SERVICE
                CONTENT -> Known.CONTENT
                CONVERSATION -> Known.CONVERSATION
                BET_ALERT -> Known.BET_ALERT
                PORTAL -> Known.PORTAL
                QUOTE -> Known.QUOTE
                FORM_SUBMISSION_INBOUNDDB -> Known.FORM_SUBMISSION_INBOUNDDB
                QUOTA -> Known.QUOTA
                UNSUBSCRIBE -> Known.UNSUBSCRIBE
                COMMUNICATION -> Known.COMMUNICATION
                FEEDBACK_SUBMISSION -> Known.FEEDBACK_SUBMISSION
                ATTRIBUTION -> Known.ATTRIBUTION
                SALESFORCE_SYNC_ERROR -> Known.SALESFORCE_SYNC_ERROR
                RESTORABLE_CRM_OBJECT -> Known.RESTORABLE_CRM_OBJECT
                HUB -> Known.HUB
                LANDING_PAGE -> Known.LANDING_PAGE
                PRODUCT_OR_FOLDER -> Known.PRODUCT_OR_FOLDER
                TASK -> Known.TASK
                FORM -> Known.FORM
                MARKETING_EMAIL -> Known.MARKETING_EMAIL
                AD_ACCOUNT -> Known.AD_ACCOUNT
                AD_CAMPAIGN -> Known.AD_CAMPAIGN
                AD_GROUP -> Known.AD_GROUP
                AD -> Known.AD
                KEYWORD -> Known.KEYWORD
                CAMPAIGN -> Known.CAMPAIGN
                SOCIAL_CHANNEL -> Known.SOCIAL_CHANNEL
                SOCIAL_POST -> Known.SOCIAL_POST
                SITE_PAGE -> Known.SITE_PAGE
                BLOG_POST -> Known.BLOG_POST
                IMPORT -> Known.IMPORT
                EXPORT -> Known.EXPORT
                CTA -> Known.CTA
                TASK_TEMPLATE -> Known.TASK_TEMPLATE
                AUTOMATION_PLATFORM_FLOW -> Known.AUTOMATION_PLATFORM_FLOW
                OBJECT_LIST -> Known.OBJECT_LIST
                NOTE -> Known.NOTE
                MEETING_EVENT -> Known.MEETING_EVENT
                CALL -> Known.CALL
                EMAIL -> Known.EMAIL
                PUBLISHING_TASK -> Known.PUBLISHING_TASK
                CONVERSATION_SESSION -> Known.CONVERSATION_SESSION
                CONTACT_CREATE_ATTRIBUTION -> Known.CONTACT_CREATE_ATTRIBUTION
                INVOICE -> Known.INVOICE
                MARKETING_EVENT -> Known.MARKETING_EVENT
                CONVERSATION_INBOX -> Known.CONVERSATION_INBOX
                CHATFLOW -> Known.CHATFLOW
                MEDIA_BRIDGE -> Known.MEDIA_BRIDGE
                SEQUENCE -> Known.SEQUENCE
                SEQUENCE_STEP -> Known.SEQUENCE_STEP
                FORECAST -> Known.FORECAST
                SNIPPET -> Known.SNIPPET
                TEMPLATE -> Known.TEMPLATE
                DEAL_CREATE_ATTRIBUTION -> Known.DEAL_CREATE_ATTRIBUTION
                QUOTE_TEMPLATE -> Known.QUOTE_TEMPLATE
                QUOTE_MODULE -> Known.QUOTE_MODULE
                QUOTE_MODULE_FIELD -> Known.QUOTE_MODULE_FIELD
                QUOTE_FIELD -> Known.QUOTE_FIELD
                SEQUENCE_ENROLLMENT -> Known.SEQUENCE_ENROLLMENT
                SUBSCRIPTION -> Known.SUBSCRIPTION
                ACCEPTANCE_TEST -> Known.ACCEPTANCE_TEST
                SOCIAL_BROADCAST -> Known.SOCIAL_BROADCAST
                DEAL_SPLIT -> Known.DEAL_SPLIT
                DEAL_REGISTRATION -> Known.DEAL_REGISTRATION
                GOAL_TARGET -> Known.GOAL_TARGET
                GOAL_TARGET_GROUP -> Known.GOAL_TARGET_GROUP
                PORTAL_OBJECT_SYNC_MESSAGE -> Known.PORTAL_OBJECT_SYNC_MESSAGE
                FILE_MANAGER_FILE -> Known.FILE_MANAGER_FILE
                FILE_MANAGER_FOLDER -> Known.FILE_MANAGER_FOLDER
                SEQUENCE_STEP_ENROLLMENT -> Known.SEQUENCE_STEP_ENROLLMENT
                APPROVAL -> Known.APPROVAL
                APPROVAL_STEP -> Known.APPROVAL_STEP
                CTA_VARIANT -> Known.CTA_VARIANT
                SALES_DOCUMENT -> Known.SALES_DOCUMENT
                DISCOUNT -> Known.DISCOUNT
                FEE -> Known.FEE
                TAX -> Known.TAX
                MARKETING_CALENDAR -> Known.MARKETING_CALENDAR
                PERMISSIONS_TESTING -> Known.PERMISSIONS_TESTING
                PRIVACY_SCANNER_COOKIE -> Known.PRIVACY_SCANNER_COOKIE
                DATA_SYNC_STATE -> Known.DATA_SYNC_STATE
                WEB_INTERACTIVE -> Known.WEB_INTERACTIVE
                PLAYBOOK -> Known.PLAYBOOK
                FOLDER -> Known.FOLDER
                PLAYBOOK_QUESTION -> Known.PLAYBOOK_QUESTION
                PLAYBOOK_SUBMISSION -> Known.PLAYBOOK_SUBMISSION
                PLAYBOOK_SUBMISSION_ANSWER -> Known.PLAYBOOK_SUBMISSION_ANSWER
                COMMERCE_PAYMENT -> Known.COMMERCE_PAYMENT
                GSC_PROPERTY -> Known.GSC_PROPERTY
                SOX_PROTECTED_DUMMY_TYPE -> Known.SOX_PROTECTED_DUMMY_TYPE
                BLOG_LISTING_PAGE -> Known.BLOG_LISTING_PAGE
                QUARANTINED_SUBMISSION -> Known.QUARANTINED_SUBMISSION
                PAYMENT_SCHEDULE -> Known.PAYMENT_SCHEDULE
                PAYMENT_SCHEDULE_INSTALLMENT -> Known.PAYMENT_SCHEDULE_INSTALLMENT
                MARKETING_CAMPAIGN_UTM -> Known.MARKETING_CAMPAIGN_UTM
                DISCOUNT_TEMPLATE -> Known.DISCOUNT_TEMPLATE
                DISCOUNT_CODE -> Known.DISCOUNT_CODE
                FEEDBACK_SURVEY -> Known.FEEDBACK_SURVEY
                CMS_URL -> Known.CMS_URL
                SALES_TASK -> Known.SALES_TASK
                SALES_WORKLOAD -> Known.SALES_WORKLOAD
                USER -> Known.USER
                POSTAL_MAIL -> Known.POSTAL_MAIL
                SCHEMAS_BACKEND_TEST -> Known.SCHEMAS_BACKEND_TEST
                PAYMENT_LINK -> Known.PAYMENT_LINK
                SUBMISSION_TAG -> Known.SUBMISSION_TAG
                CAMPAIGN_STEP -> Known.CAMPAIGN_STEP
                SCHEDULING_PAGE -> Known.SCHEDULING_PAGE
                SOX_PROTECTED_TEST_TYPE -> Known.SOX_PROTECTED_TEST_TYPE
                ORDER -> Known.ORDER
                MARKETING_SMS -> Known.MARKETING_SMS
                PARTNER_ACCOUNT -> Known.PARTNER_ACCOUNT
                CAMPAIGN_TEMPLATE -> Known.CAMPAIGN_TEMPLATE
                CAMPAIGN_TEMPLATE_STEP -> Known.CAMPAIGN_TEMPLATE_STEP
                PLAYLIST -> Known.PLAYLIST
                CLIP -> Known.CLIP
                CAMPAIGN_BUDGET_ITEM -> Known.CAMPAIGN_BUDGET_ITEM
                CAMPAIGN_SPEND_ITEM -> Known.CAMPAIGN_SPEND_ITEM
                MIC -> Known.MIC
                CONTENT_AUDIT -> Known.CONTENT_AUDIT
                CONTENT_AUDIT_PAGE -> Known.CONTENT_AUDIT_PAGE
                PLAYLIST_FOLDER -> Known.PLAYLIST_FOLDER
                LEAD -> Known.LEAD
                ABANDONED_CART -> Known.ABANDONED_CART
                EXTERNAL_WEB_URL -> Known.EXTERNAL_WEB_URL
                VIEW -> Known.VIEW
                VIEW_BLOCK -> Known.VIEW_BLOCK
                ROSTER -> Known.ROSTER
                CART -> Known.CART
                AUTOMATION_PLATFORM_FLOW_ACTION -> Known.AUTOMATION_PLATFORM_FLOW_ACTION
                SOCIAL_PROFILE -> Known.SOCIAL_PROFILE
                PARTNER_CLIENT -> Known.PARTNER_CLIENT
                ROSTER_MEMBER -> Known.ROSTER_MEMBER
                MARKETING_EVENT_ATTENDANCE -> Known.MARKETING_EVENT_ATTENDANCE
                ALL_PAGES -> Known.ALL_PAGES
                AI_FORECAST -> Known.AI_FORECAST
                CRM_PIPELINES_DUMMY_TYPE -> Known.CRM_PIPELINES_DUMMY_TYPE
                KNOWLEDGE_ARTICLE -> Known.KNOWLEDGE_ARTICLE
                PROPERTY_INFO -> Known.PROPERTY_INFO
                DATA_PRIVACY_CONSENT -> Known.DATA_PRIVACY_CONSENT
                GOAL_TEMPLATE -> Known.GOAL_TEMPLATE
                SCORE_CONFIGURATION -> Known.SCORE_CONFIGURATION
                AUDIENCE -> Known.AUDIENCE
                PARTNER_CLIENT_REVENUE -> Known.PARTNER_CLIENT_REVENUE
                AUTOMATION_JOURNEY -> Known.AUTOMATION_JOURNEY
                COMBO_EVENT_CONFIGURATION -> Known.COMBO_EVENT_CONFIGURATION
                CRM_OBJECTS_DUMMY_TYPE -> Known.CRM_OBJECTS_DUMMY_TYPE
                CASE_STUDY -> Known.CASE_STUDY
                SERVICE -> Known.SERVICE
                PODCAST_EPISODE -> Known.PODCAST_EPISODE
                PARTNER_SERVICE -> Known.PARTNER_SERVICE
                PROSPECTING_AGENT_CONTACT_ASSIGNMENT -> Known.PROSPECTING_AGENT_CONTACT_ASSIGNMENT
                UNKNOWN -> Known.UNKNOWN
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
