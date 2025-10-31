// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.hubdb

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
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import com.hubspot_sdk.api.models.Error
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class ImportResult
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val duplicateRows: JsonField<Int>,
    private val errors: JsonField<List<Error>>,
    private val rowLimitExceeded: JsonField<Boolean>,
    private val rowsImported: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("duplicateRows")
        @ExcludeMissing
        duplicateRows: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("errors") @ExcludeMissing errors: JsonField<List<Error>> = JsonMissing.of(),
        @JsonProperty("rowLimitExceeded")
        @ExcludeMissing
        rowLimitExceeded: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("rowsImported")
        @ExcludeMissing
        rowsImported: JsonField<Int> = JsonMissing.of(),
    ) : this(duplicateRows, errors, rowLimitExceeded, rowsImported, mutableMapOf())

    /**
     * Specifies number of duplicate rows
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun duplicateRows(): Int = duplicateRows.getRequired("duplicateRows")

    /**
     * List of errors during import
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun errors(): List<Error> = errors.getRequired("errors")

    /**
     * Specifies whether row limit exceeded during import
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rowLimitExceeded(): Boolean = rowLimitExceeded.getRequired("rowLimitExceeded")

    /**
     * Specifies number of rows imported
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rowsImported(): Int = rowsImported.getRequired("rowsImported")

    /**
     * Returns the raw JSON value of [duplicateRows].
     *
     * Unlike [duplicateRows], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("duplicateRows")
    @ExcludeMissing
    fun _duplicateRows(): JsonField<Int> = duplicateRows

    /**
     * Returns the raw JSON value of [errors].
     *
     * Unlike [errors], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("errors") @ExcludeMissing fun _errors(): JsonField<List<Error>> = errors

    /**
     * Returns the raw JSON value of [rowLimitExceeded].
     *
     * Unlike [rowLimitExceeded], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("rowLimitExceeded")
    @ExcludeMissing
    fun _rowLimitExceeded(): JsonField<Boolean> = rowLimitExceeded

    /**
     * Returns the raw JSON value of [rowsImported].
     *
     * Unlike [rowsImported], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rowsImported") @ExcludeMissing fun _rowsImported(): JsonField<Int> = rowsImported

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
         * Returns a mutable builder for constructing an instance of [ImportResult].
         *
         * The following fields are required:
         * ```java
         * .duplicateRows()
         * .errors()
         * .rowLimitExceeded()
         * .rowsImported()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ImportResult]. */
    class Builder internal constructor() {

        private var duplicateRows: JsonField<Int>? = null
        private var errors: JsonField<MutableList<Error>>? = null
        private var rowLimitExceeded: JsonField<Boolean>? = null
        private var rowsImported: JsonField<Int>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(importResult: ImportResult) = apply {
            duplicateRows = importResult.duplicateRows
            errors = importResult.errors.map { it.toMutableList() }
            rowLimitExceeded = importResult.rowLimitExceeded
            rowsImported = importResult.rowsImported
            additionalProperties = importResult.additionalProperties.toMutableMap()
        }

        /** Specifies number of duplicate rows */
        fun duplicateRows(duplicateRows: Int) = duplicateRows(JsonField.of(duplicateRows))

        /**
         * Sets [Builder.duplicateRows] to an arbitrary JSON value.
         *
         * You should usually call [Builder.duplicateRows] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun duplicateRows(duplicateRows: JsonField<Int>) = apply {
            this.duplicateRows = duplicateRows
        }

        /** List of errors during import */
        fun errors(errors: List<Error>) = errors(JsonField.of(errors))

        /**
         * Sets [Builder.errors] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errors] with a well-typed `List<Error>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun errors(errors: JsonField<List<Error>>) = apply {
            this.errors = errors.map { it.toMutableList() }
        }

        /**
         * Adds a single [Error] to [errors].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addError(error: Error) = apply {
            errors =
                (errors ?: JsonField.of(mutableListOf())).also {
                    checkKnown("errors", it).add(error)
                }
        }

        /** Specifies whether row limit exceeded during import */
        fun rowLimitExceeded(rowLimitExceeded: Boolean) =
            rowLimitExceeded(JsonField.of(rowLimitExceeded))

        /**
         * Sets [Builder.rowLimitExceeded] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rowLimitExceeded] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rowLimitExceeded(rowLimitExceeded: JsonField<Boolean>) = apply {
            this.rowLimitExceeded = rowLimitExceeded
        }

        /** Specifies number of rows imported */
        fun rowsImported(rowsImported: Int) = rowsImported(JsonField.of(rowsImported))

        /**
         * Sets [Builder.rowsImported] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rowsImported] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rowsImported(rowsImported: JsonField<Int>) = apply { this.rowsImported = rowsImported }

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
         * Returns an immutable instance of [ImportResult].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .duplicateRows()
         * .errors()
         * .rowLimitExceeded()
         * .rowsImported()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ImportResult =
            ImportResult(
                checkRequired("duplicateRows", duplicateRows),
                checkRequired("errors", errors).map { it.toImmutable() },
                checkRequired("rowLimitExceeded", rowLimitExceeded),
                checkRequired("rowsImported", rowsImported),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ImportResult = apply {
        if (validated) {
            return@apply
        }

        duplicateRows()
        errors().forEach { it.validate() }
        rowLimitExceeded()
        rowsImported()
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
        (if (duplicateRows.asKnown().isPresent) 1 else 0) +
            (errors.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (rowLimitExceeded.asKnown().isPresent) 1 else 0) +
            (if (rowsImported.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ImportResult &&
            duplicateRows == other.duplicateRows &&
            errors == other.errors &&
            rowLimitExceeded == other.rowLimitExceeded &&
            rowsImported == other.rowsImported &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(duplicateRows, errors, rowLimitExceeded, rowsImported, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ImportResult{duplicateRows=$duplicateRows, errors=$errors, rowLimitExceeded=$rowLimitExceeded, rowsImported=$rowsImported, additionalProperties=$additionalProperties}"
}
