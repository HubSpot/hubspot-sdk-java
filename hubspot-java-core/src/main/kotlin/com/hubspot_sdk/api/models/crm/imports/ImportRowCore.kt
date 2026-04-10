// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.imports

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ImportRowCore
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val additionalRowData: JsonField<List<String>>,
    private val containsEncryptedProperties: JsonField<Boolean>,
    private val fileId: JsonField<Int>,
    private val lineNumber: JsonField<Int>,
    private val rowData: JsonField<List<String>>,
    private val pageName: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("additionalRowData")
        @ExcludeMissing
        additionalRowData: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("containsEncryptedProperties")
        @ExcludeMissing
        containsEncryptedProperties: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("fileId") @ExcludeMissing fileId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("lineNumber") @ExcludeMissing lineNumber: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("rowData")
        @ExcludeMissing
        rowData: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("pageName") @ExcludeMissing pageName: JsonField<String> = JsonMissing.of(),
    ) : this(
        additionalRowData,
        containsEncryptedProperties,
        fileId,
        lineNumber,
        rowData,
        pageName,
        mutableMapOf(),
    )

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun additionalRowData(): List<String> = additionalRowData.getRequired("additionalRowData")

    /**
     * Indicates whether this row contains values that were encrypted.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun containsEncryptedProperties(): Boolean =
        containsEncryptedProperties.getRequired("containsEncryptedProperties")

    /**
     * The unique identifier of the uploaded file containing this row.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fileId(): Int = fileId.getRequired("fileId")

    /**
     * The 1-indexed line number of this row in the source file. Line number 0 is reserved for
     * file-wide errors that don't correspond to a specific row.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lineNumber(): Int = lineNumber.getRequired("lineNumber")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rowData(): List<String> = rowData.getRequired("rowData")

    /**
     * The name of the spreadsheet sheet/page containing this row.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageName(): Optional<String> = pageName.getOptional("pageName")

    /**
     * Returns the raw JSON value of [additionalRowData].
     *
     * Unlike [additionalRowData], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("additionalRowData")
    @ExcludeMissing
    fun _additionalRowData(): JsonField<List<String>> = additionalRowData

    /**
     * Returns the raw JSON value of [containsEncryptedProperties].
     *
     * Unlike [containsEncryptedProperties], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("containsEncryptedProperties")
    @ExcludeMissing
    fun _containsEncryptedProperties(): JsonField<Boolean> = containsEncryptedProperties

    /**
     * Returns the raw JSON value of [fileId].
     *
     * Unlike [fileId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fileId") @ExcludeMissing fun _fileId(): JsonField<Int> = fileId

    /**
     * Returns the raw JSON value of [lineNumber].
     *
     * Unlike [lineNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lineNumber") @ExcludeMissing fun _lineNumber(): JsonField<Int> = lineNumber

    /**
     * Returns the raw JSON value of [rowData].
     *
     * Unlike [rowData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rowData") @ExcludeMissing fun _rowData(): JsonField<List<String>> = rowData

    /**
     * Returns the raw JSON value of [pageName].
     *
     * Unlike [pageName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pageName") @ExcludeMissing fun _pageName(): JsonField<String> = pageName

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
         * Returns a mutable builder for constructing an instance of [ImportRowCore].
         *
         * The following fields are required:
         * ```java
         * .additionalRowData()
         * .containsEncryptedProperties()
         * .fileId()
         * .lineNumber()
         * .rowData()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ImportRowCore]. */
    class Builder internal constructor() {

        private var additionalRowData: JsonField<MutableList<String>>? = null
        private var containsEncryptedProperties: JsonField<Boolean>? = null
        private var fileId: JsonField<Int>? = null
        private var lineNumber: JsonField<Int>? = null
        private var rowData: JsonField<MutableList<String>>? = null
        private var pageName: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(importRowCore: ImportRowCore) = apply {
            additionalRowData = importRowCore.additionalRowData.map { it.toMutableList() }
            containsEncryptedProperties = importRowCore.containsEncryptedProperties
            fileId = importRowCore.fileId
            lineNumber = importRowCore.lineNumber
            rowData = importRowCore.rowData.map { it.toMutableList() }
            pageName = importRowCore.pageName
            additionalProperties = importRowCore.additionalProperties.toMutableMap()
        }

        fun additionalRowData(additionalRowData: List<String>) =
            additionalRowData(JsonField.of(additionalRowData))

        /**
         * Sets [Builder.additionalRowData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.additionalRowData] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun additionalRowData(additionalRowData: JsonField<List<String>>) = apply {
            this.additionalRowData = additionalRowData.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.additionalRowData].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAdditionalRowData(additionalRowData: String) = apply {
            this.additionalRowData =
                (this.additionalRowData ?: JsonField.of(mutableListOf())).also {
                    checkKnown("additionalRowData", it).add(additionalRowData)
                }
        }

        /** Indicates whether this row contains values that were encrypted. */
        fun containsEncryptedProperties(containsEncryptedProperties: Boolean) =
            containsEncryptedProperties(JsonField.of(containsEncryptedProperties))

        /**
         * Sets [Builder.containsEncryptedProperties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.containsEncryptedProperties] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun containsEncryptedProperties(containsEncryptedProperties: JsonField<Boolean>) = apply {
            this.containsEncryptedProperties = containsEncryptedProperties
        }

        /** The unique identifier of the uploaded file containing this row. */
        fun fileId(fileId: Int) = fileId(JsonField.of(fileId))

        /**
         * Sets [Builder.fileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fileId(fileId: JsonField<Int>) = apply { this.fileId = fileId }

        /**
         * The 1-indexed line number of this row in the source file. Line number 0 is reserved for
         * file-wide errors that don't correspond to a specific row.
         */
        fun lineNumber(lineNumber: Int) = lineNumber(JsonField.of(lineNumber))

        /**
         * Sets [Builder.lineNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lineNumber] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lineNumber(lineNumber: JsonField<Int>) = apply { this.lineNumber = lineNumber }

        fun rowData(rowData: List<String>) = rowData(JsonField.of(rowData))

        /**
         * Sets [Builder.rowData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rowData] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rowData(rowData: JsonField<List<String>>) = apply {
            this.rowData = rowData.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.rowData].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRowData(rowData: String) = apply {
            this.rowData =
                (this.rowData ?: JsonField.of(mutableListOf())).also {
                    checkKnown("rowData", it).add(rowData)
                }
        }

        /** The name of the spreadsheet sheet/page containing this row. */
        fun pageName(pageName: String) = pageName(JsonField.of(pageName))

        /**
         * Sets [Builder.pageName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pageName(pageName: JsonField<String>) = apply { this.pageName = pageName }

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
         * Returns an immutable instance of [ImportRowCore].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .additionalRowData()
         * .containsEncryptedProperties()
         * .fileId()
         * .lineNumber()
         * .rowData()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ImportRowCore =
            ImportRowCore(
                checkRequired("additionalRowData", additionalRowData).map { it.toImmutable() },
                checkRequired("containsEncryptedProperties", containsEncryptedProperties),
                checkRequired("fileId", fileId),
                checkRequired("lineNumber", lineNumber),
                checkRequired("rowData", rowData).map { it.toImmutable() },
                pageName,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ImportRowCore = apply {
        if (validated) {
            return@apply
        }

        additionalRowData()
        containsEncryptedProperties()
        fileId()
        lineNumber()
        rowData()
        pageName()
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
        (additionalRowData.asKnown().getOrNull()?.size ?: 0) +
            (if (containsEncryptedProperties.asKnown().isPresent) 1 else 0) +
            (if (fileId.asKnown().isPresent) 1 else 0) +
            (if (lineNumber.asKnown().isPresent) 1 else 0) +
            (rowData.asKnown().getOrNull()?.size ?: 0) +
            (if (pageName.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ImportRowCore &&
            additionalRowData == other.additionalRowData &&
            containsEncryptedProperties == other.containsEncryptedProperties &&
            fileId == other.fileId &&
            lineNumber == other.lineNumber &&
            rowData == other.rowData &&
            pageName == other.pageName &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            additionalRowData,
            containsEncryptedProperties,
            fileId,
            lineNumber,
            rowData,
            pageName,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ImportRowCore{additionalRowData=$additionalRowData, containsEncryptedProperties=$containsEncryptedProperties, fileId=$fileId, lineNumber=$lineNumber, rowData=$rowData, pageName=$pageName, additionalProperties=$additionalProperties}"
}
