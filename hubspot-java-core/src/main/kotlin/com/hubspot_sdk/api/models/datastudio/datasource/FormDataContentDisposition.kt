// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.datastudio.datasource

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class FormDataContentDisposition
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val creationDate: JsonField<OffsetDateTime>,
    private val fileName: JsonField<String>,
    private val modificationDate: JsonField<OffsetDateTime>,
    private val name: JsonField<String>,
    private val parameters: JsonField<Parameters>,
    private val readDate: JsonField<OffsetDateTime>,
    private val size: JsonField<Int>,
    private val type: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("creationDate")
        @ExcludeMissing
        creationDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("fileName") @ExcludeMissing fileName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("modificationDate")
        @ExcludeMissing
        modificationDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parameters")
        @ExcludeMissing
        parameters: JsonField<Parameters> = JsonMissing.of(),
        @JsonProperty("readDate")
        @ExcludeMissing
        readDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("size") @ExcludeMissing size: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
    ) : this(
        creationDate,
        fileName,
        modificationDate,
        name,
        parameters,
        readDate,
        size,
        type,
        mutableMapOf(),
    )

    /**
     * The date and time when the file was created, in ISO 8601 format.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creationDate(): OffsetDateTime = creationDate.getRequired("creationDate")

    /**
     * A string indicating the name of the file associated with this content disposition.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fileName(): String = fileName.getRequired("fileName")

    /**
     * The date and time when the file was last modified, in ISO 8601 format.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun modificationDate(): OffsetDateTime = modificationDate.getRequired("modificationDate")

    /**
     * A string representing the name associated with this content disposition.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * An object containing additional parameters for the content disposition, with each parameter
     * represented as a string.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun parameters(): Parameters = parameters.getRequired("parameters")

    /**
     * The date and time when the file was last read, in ISO 8601 format.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun readDate(): OffsetDateTime = readDate.getRequired("readDate")

    /**
     * An integer representing the size of the file in bytes.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun size(): Int = size.getRequired("size")

    /**
     * A string representing the type of content disposition.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): String = type.getRequired("type")

    /**
     * Returns the raw JSON value of [creationDate].
     *
     * Unlike [creationDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("creationDate")
    @ExcludeMissing
    fun _creationDate(): JsonField<OffsetDateTime> = creationDate

    /**
     * Returns the raw JSON value of [fileName].
     *
     * Unlike [fileName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fileName") @ExcludeMissing fun _fileName(): JsonField<String> = fileName

    /**
     * Returns the raw JSON value of [modificationDate].
     *
     * Unlike [modificationDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("modificationDate")
    @ExcludeMissing
    fun _modificationDate(): JsonField<OffsetDateTime> = modificationDate

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [parameters].
     *
     * Unlike [parameters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parameters")
    @ExcludeMissing
    fun _parameters(): JsonField<Parameters> = parameters

    /**
     * Returns the raw JSON value of [readDate].
     *
     * Unlike [readDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("readDate") @ExcludeMissing fun _readDate(): JsonField<OffsetDateTime> = readDate

    /**
     * Returns the raw JSON value of [size].
     *
     * Unlike [size], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("size") @ExcludeMissing fun _size(): JsonField<Int> = size

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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
         * Returns a mutable builder for constructing an instance of [FormDataContentDisposition].
         *
         * The following fields are required:
         * ```java
         * .creationDate()
         * .fileName()
         * .modificationDate()
         * .name()
         * .parameters()
         * .readDate()
         * .size()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FormDataContentDisposition]. */
    class Builder internal constructor() {

        private var creationDate: JsonField<OffsetDateTime>? = null
        private var fileName: JsonField<String>? = null
        private var modificationDate: JsonField<OffsetDateTime>? = null
        private var name: JsonField<String>? = null
        private var parameters: JsonField<Parameters>? = null
        private var readDate: JsonField<OffsetDateTime>? = null
        private var size: JsonField<Int>? = null
        private var type: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(formDataContentDisposition: FormDataContentDisposition) = apply {
            creationDate = formDataContentDisposition.creationDate
            fileName = formDataContentDisposition.fileName
            modificationDate = formDataContentDisposition.modificationDate
            name = formDataContentDisposition.name
            parameters = formDataContentDisposition.parameters
            readDate = formDataContentDisposition.readDate
            size = formDataContentDisposition.size
            type = formDataContentDisposition.type
            additionalProperties = formDataContentDisposition.additionalProperties.toMutableMap()
        }

        /** The date and time when the file was created, in ISO 8601 format. */
        fun creationDate(creationDate: OffsetDateTime) = creationDate(JsonField.of(creationDate))

        /**
         * Sets [Builder.creationDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creationDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun creationDate(creationDate: JsonField<OffsetDateTime>) = apply {
            this.creationDate = creationDate
        }

        /** A string indicating the name of the file associated with this content disposition. */
        fun fileName(fileName: String) = fileName(JsonField.of(fileName))

        /**
         * Sets [Builder.fileName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fileName(fileName: JsonField<String>) = apply { this.fileName = fileName }

        /** The date and time when the file was last modified, in ISO 8601 format. */
        fun modificationDate(modificationDate: OffsetDateTime) =
            modificationDate(JsonField.of(modificationDate))

        /**
         * Sets [Builder.modificationDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modificationDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun modificationDate(modificationDate: JsonField<OffsetDateTime>) = apply {
            this.modificationDate = modificationDate
        }

        /** A string representing the name associated with this content disposition. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * An object containing additional parameters for the content disposition, with each
         * parameter represented as a string.
         */
        fun parameters(parameters: Parameters) = parameters(JsonField.of(parameters))

        /**
         * Sets [Builder.parameters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parameters] with a well-typed [Parameters] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun parameters(parameters: JsonField<Parameters>) = apply { this.parameters = parameters }

        /** The date and time when the file was last read, in ISO 8601 format. */
        fun readDate(readDate: OffsetDateTime) = readDate(JsonField.of(readDate))

        /**
         * Sets [Builder.readDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.readDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun readDate(readDate: JsonField<OffsetDateTime>) = apply { this.readDate = readDate }

        /** An integer representing the size of the file in bytes. */
        fun size(size: Int) = size(JsonField.of(size))

        /**
         * Sets [Builder.size] to an arbitrary JSON value.
         *
         * You should usually call [Builder.size] with a well-typed [Int] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun size(size: JsonField<Int>) = apply { this.size = size }

        /** A string representing the type of content disposition. */
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

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
         * Returns an immutable instance of [FormDataContentDisposition].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .creationDate()
         * .fileName()
         * .modificationDate()
         * .name()
         * .parameters()
         * .readDate()
         * .size()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FormDataContentDisposition =
            FormDataContentDisposition(
                checkRequired("creationDate", creationDate),
                checkRequired("fileName", fileName),
                checkRequired("modificationDate", modificationDate),
                checkRequired("name", name),
                checkRequired("parameters", parameters),
                checkRequired("readDate", readDate),
                checkRequired("size", size),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FormDataContentDisposition = apply {
        if (validated) {
            return@apply
        }

        creationDate()
        fileName()
        modificationDate()
        name()
        parameters().validate()
        readDate()
        size()
        type()
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
        (if (creationDate.asKnown().isPresent) 1 else 0) +
            (if (fileName.asKnown().isPresent) 1 else 0) +
            (if (modificationDate.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (parameters.asKnown().getOrNull()?.validity() ?: 0) +
            (if (readDate.asKnown().isPresent) 1 else 0) +
            (if (size.asKnown().isPresent) 1 else 0) +
            (if (type.asKnown().isPresent) 1 else 0)

    /**
     * An object containing additional parameters for the content disposition, with each parameter
     * represented as a string.
     */
    class Parameters
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

            /** Returns a mutable builder for constructing an instance of [Parameters]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Parameters]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(parameters: Parameters) = apply {
                additionalProperties = parameters.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Parameters].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Parameters = Parameters(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Parameters = apply {
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

            return other is Parameters && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Parameters{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FormDataContentDisposition &&
            creationDate == other.creationDate &&
            fileName == other.fileName &&
            modificationDate == other.modificationDate &&
            name == other.name &&
            parameters == other.parameters &&
            readDate == other.readDate &&
            size == other.size &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            creationDate,
            fileName,
            modificationDate,
            name,
            parameters,
            readDate,
            size,
            type,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FormDataContentDisposition{creationDate=$creationDate, fileName=$fileName, modificationDate=$modificationDate, name=$name, parameters=$parameters, readDate=$readDate, size=$size, type=$type, additionalProperties=$additionalProperties}"
}
