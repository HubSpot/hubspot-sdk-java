// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.objectschemas

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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
import kotlin.jvm.optionals.getOrNull

class ObjectSchemaBatchReadRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val includeAssociationDefinitions: JsonField<Boolean>,
    private val includeAuditMetadata: JsonField<Boolean>,
    private val includePropertyDefinitions: JsonField<Boolean>,
    private val inputs: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("includeAssociationDefinitions")
        @ExcludeMissing
        includeAssociationDefinitions: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("includeAuditMetadata")
        @ExcludeMissing
        includeAuditMetadata: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("includePropertyDefinitions")
        @ExcludeMissing
        includePropertyDefinitions: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("inputs") @ExcludeMissing inputs: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        includeAssociationDefinitions,
        includeAuditMetadata,
        includePropertyDefinitions,
        inputs,
        mutableMapOf(),
    )

    /**
     * Indicates whether to include association definitions in the response.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun includeAssociationDefinitions(): Boolean =
        includeAssociationDefinitions.getRequired("includeAssociationDefinitions")

    /**
     * Indicates whether to include audit metadata in the response.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun includeAuditMetadata(): Boolean = includeAuditMetadata.getRequired("includeAuditMetadata")

    /**
     * Indicates whether to include property definitions in the response.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun includePropertyDefinitions(): Boolean =
        includePropertyDefinitions.getRequired("includePropertyDefinitions")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inputs(): List<String> = inputs.getRequired("inputs")

    /**
     * Returns the raw JSON value of [includeAssociationDefinitions].
     *
     * Unlike [includeAssociationDefinitions], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("includeAssociationDefinitions")
    @ExcludeMissing
    fun _includeAssociationDefinitions(): JsonField<Boolean> = includeAssociationDefinitions

    /**
     * Returns the raw JSON value of [includeAuditMetadata].
     *
     * Unlike [includeAuditMetadata], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("includeAuditMetadata")
    @ExcludeMissing
    fun _includeAuditMetadata(): JsonField<Boolean> = includeAuditMetadata

    /**
     * Returns the raw JSON value of [includePropertyDefinitions].
     *
     * Unlike [includePropertyDefinitions], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("includePropertyDefinitions")
    @ExcludeMissing
    fun _includePropertyDefinitions(): JsonField<Boolean> = includePropertyDefinitions

    /**
     * Returns the raw JSON value of [inputs].
     *
     * Unlike [inputs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inputs") @ExcludeMissing fun _inputs(): JsonField<List<String>> = inputs

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
         * Returns a mutable builder for constructing an instance of [ObjectSchemaBatchReadRequest].
         *
         * The following fields are required:
         * ```java
         * .includeAssociationDefinitions()
         * .includeAuditMetadata()
         * .includePropertyDefinitions()
         * .inputs()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ObjectSchemaBatchReadRequest]. */
    class Builder internal constructor() {

        private var includeAssociationDefinitions: JsonField<Boolean>? = null
        private var includeAuditMetadata: JsonField<Boolean>? = null
        private var includePropertyDefinitions: JsonField<Boolean>? = null
        private var inputs: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(objectSchemaBatchReadRequest: ObjectSchemaBatchReadRequest) = apply {
            includeAssociationDefinitions =
                objectSchemaBatchReadRequest.includeAssociationDefinitions
            includeAuditMetadata = objectSchemaBatchReadRequest.includeAuditMetadata
            includePropertyDefinitions = objectSchemaBatchReadRequest.includePropertyDefinitions
            inputs = objectSchemaBatchReadRequest.inputs.map { it.toMutableList() }
            additionalProperties = objectSchemaBatchReadRequest.additionalProperties.toMutableMap()
        }

        /** Indicates whether to include association definitions in the response. */
        fun includeAssociationDefinitions(includeAssociationDefinitions: Boolean) =
            includeAssociationDefinitions(JsonField.of(includeAssociationDefinitions))

        /**
         * Sets [Builder.includeAssociationDefinitions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includeAssociationDefinitions] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun includeAssociationDefinitions(includeAssociationDefinitions: JsonField<Boolean>) =
            apply {
                this.includeAssociationDefinitions = includeAssociationDefinitions
            }

        /** Indicates whether to include audit metadata in the response. */
        fun includeAuditMetadata(includeAuditMetadata: Boolean) =
            includeAuditMetadata(JsonField.of(includeAuditMetadata))

        /**
         * Sets [Builder.includeAuditMetadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includeAuditMetadata] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun includeAuditMetadata(includeAuditMetadata: JsonField<Boolean>) = apply {
            this.includeAuditMetadata = includeAuditMetadata
        }

        /** Indicates whether to include property definitions in the response. */
        fun includePropertyDefinitions(includePropertyDefinitions: Boolean) =
            includePropertyDefinitions(JsonField.of(includePropertyDefinitions))

        /**
         * Sets [Builder.includePropertyDefinitions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includePropertyDefinitions] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun includePropertyDefinitions(includePropertyDefinitions: JsonField<Boolean>) = apply {
            this.includePropertyDefinitions = includePropertyDefinitions
        }

        fun inputs(inputs: List<String>) = inputs(JsonField.of(inputs))

        /**
         * Sets [Builder.inputs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inputs] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun inputs(inputs: JsonField<List<String>>) = apply {
            this.inputs = inputs.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [inputs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInput(input: String) = apply {
            inputs =
                (inputs ?: JsonField.of(mutableListOf())).also {
                    checkKnown("inputs", it).add(input)
                }
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
         * Returns an immutable instance of [ObjectSchemaBatchReadRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .includeAssociationDefinitions()
         * .includeAuditMetadata()
         * .includePropertyDefinitions()
         * .inputs()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ObjectSchemaBatchReadRequest =
            ObjectSchemaBatchReadRequest(
                checkRequired("includeAssociationDefinitions", includeAssociationDefinitions),
                checkRequired("includeAuditMetadata", includeAuditMetadata),
                checkRequired("includePropertyDefinitions", includePropertyDefinitions),
                checkRequired("inputs", inputs).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ObjectSchemaBatchReadRequest = apply {
        if (validated) {
            return@apply
        }

        includeAssociationDefinitions()
        includeAuditMetadata()
        includePropertyDefinitions()
        inputs()
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
        (if (includeAssociationDefinitions.asKnown().isPresent) 1 else 0) +
            (if (includeAuditMetadata.asKnown().isPresent) 1 else 0) +
            (if (includePropertyDefinitions.asKnown().isPresent) 1 else 0) +
            (inputs.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ObjectSchemaBatchReadRequest &&
            includeAssociationDefinitions == other.includeAssociationDefinitions &&
            includeAuditMetadata == other.includeAuditMetadata &&
            includePropertyDefinitions == other.includePropertyDefinitions &&
            inputs == other.inputs &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            includeAssociationDefinitions,
            includeAuditMetadata,
            includePropertyDefinitions,
            inputs,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ObjectSchemaBatchReadRequest{includeAssociationDefinitions=$includeAssociationDefinitions, includeAuditMetadata=$includeAuditMetadata, includePropertyDefinitions=$includePropertyDefinitions, inputs=$inputs, additionalProperties=$additionalProperties}"
}
