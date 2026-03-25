// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm

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
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** The relationship descriptors applicable between two object types. */
class LabelsBetweenObjectPair
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val fromObjectId: JsonField<String>,
    private val fromObjectTypeId: JsonField<String>,
    private val labels: JsonField<List<String>>,
    private val toObjectId: JsonField<String>,
    private val toObjectTypeId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("fromObjectId")
        @ExcludeMissing
        fromObjectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fromObjectTypeId")
        @ExcludeMissing
        fromObjectTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("labels") @ExcludeMissing labels: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("toObjectId")
        @ExcludeMissing
        toObjectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("toObjectTypeId")
        @ExcludeMissing
        toObjectTypeId: JsonField<String> = JsonMissing.of(),
    ) : this(fromObjectId, fromObjectTypeId, labels, toObjectId, toObjectTypeId, mutableMapOf())

    /**
     * The ID of the source object in the association.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fromObjectId(): String = fromObjectId.getRequired("fromObjectId")

    /**
     * The type ID of the source object in the association.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fromObjectTypeId(): String = fromObjectTypeId.getRequired("fromObjectTypeId")

    /**
     * An array of labels associated with the relationship between the objects.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun labels(): List<String> = labels.getRequired("labels")

    /**
     * The ID of the target object in the association.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun toObjectId(): String = toObjectId.getRequired("toObjectId")

    /**
     * The type ID of the target object in the association.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun toObjectTypeId(): String = toObjectTypeId.getRequired("toObjectTypeId")

    /**
     * Returns the raw JSON value of [fromObjectId].
     *
     * Unlike [fromObjectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fromObjectId")
    @ExcludeMissing
    fun _fromObjectId(): JsonField<String> = fromObjectId

    /**
     * Returns the raw JSON value of [fromObjectTypeId].
     *
     * Unlike [fromObjectTypeId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("fromObjectTypeId")
    @ExcludeMissing
    fun _fromObjectTypeId(): JsonField<String> = fromObjectTypeId

    /**
     * Returns the raw JSON value of [labels].
     *
     * Unlike [labels], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("labels") @ExcludeMissing fun _labels(): JsonField<List<String>> = labels

    /**
     * Returns the raw JSON value of [toObjectId].
     *
     * Unlike [toObjectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("toObjectId") @ExcludeMissing fun _toObjectId(): JsonField<String> = toObjectId

    /**
     * Returns the raw JSON value of [toObjectTypeId].
     *
     * Unlike [toObjectTypeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("toObjectTypeId")
    @ExcludeMissing
    fun _toObjectTypeId(): JsonField<String> = toObjectTypeId

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
         * Returns a mutable builder for constructing an instance of [LabelsBetweenObjectPair].
         *
         * The following fields are required:
         * ```java
         * .fromObjectId()
         * .fromObjectTypeId()
         * .labels()
         * .toObjectId()
         * .toObjectTypeId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LabelsBetweenObjectPair]. */
    class Builder internal constructor() {

        private var fromObjectId: JsonField<String>? = null
        private var fromObjectTypeId: JsonField<String>? = null
        private var labels: JsonField<MutableList<String>>? = null
        private var toObjectId: JsonField<String>? = null
        private var toObjectTypeId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(labelsBetweenObjectPair: LabelsBetweenObjectPair) = apply {
            fromObjectId = labelsBetweenObjectPair.fromObjectId
            fromObjectTypeId = labelsBetweenObjectPair.fromObjectTypeId
            labels = labelsBetweenObjectPair.labels.map { it.toMutableList() }
            toObjectId = labelsBetweenObjectPair.toObjectId
            toObjectTypeId = labelsBetweenObjectPair.toObjectTypeId
            additionalProperties = labelsBetweenObjectPair.additionalProperties.toMutableMap()
        }

        /** The ID of the source object in the association. */
        fun fromObjectId(fromObjectId: String) = fromObjectId(JsonField.of(fromObjectId))

        /**
         * Sets [Builder.fromObjectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fromObjectId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fromObjectId(fromObjectId: JsonField<String>) = apply {
            this.fromObjectId = fromObjectId
        }

        /** The type ID of the source object in the association. */
        fun fromObjectTypeId(fromObjectTypeId: String) =
            fromObjectTypeId(JsonField.of(fromObjectTypeId))

        /**
         * Sets [Builder.fromObjectTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fromObjectTypeId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fromObjectTypeId(fromObjectTypeId: JsonField<String>) = apply {
            this.fromObjectTypeId = fromObjectTypeId
        }

        /** An array of labels associated with the relationship between the objects. */
        fun labels(labels: List<String>) = labels(JsonField.of(labels))

        /**
         * Sets [Builder.labels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.labels] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun labels(labels: JsonField<List<String>>) = apply {
            this.labels = labels.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [labels].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLabel(label: String) = apply {
            labels =
                (labels ?: JsonField.of(mutableListOf())).also {
                    checkKnown("labels", it).add(label)
                }
        }

        /** The ID of the target object in the association. */
        fun toObjectId(toObjectId: String) = toObjectId(JsonField.of(toObjectId))

        /**
         * Sets [Builder.toObjectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toObjectId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun toObjectId(toObjectId: JsonField<String>) = apply { this.toObjectId = toObjectId }

        /** The type ID of the target object in the association. */
        fun toObjectTypeId(toObjectTypeId: String) = toObjectTypeId(JsonField.of(toObjectTypeId))

        /**
         * Sets [Builder.toObjectTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toObjectTypeId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun toObjectTypeId(toObjectTypeId: JsonField<String>) = apply {
            this.toObjectTypeId = toObjectTypeId
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
         * Returns an immutable instance of [LabelsBetweenObjectPair].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .fromObjectId()
         * .fromObjectTypeId()
         * .labels()
         * .toObjectId()
         * .toObjectTypeId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LabelsBetweenObjectPair =
            LabelsBetweenObjectPair(
                checkRequired("fromObjectId", fromObjectId),
                checkRequired("fromObjectTypeId", fromObjectTypeId),
                checkRequired("labels", labels).map { it.toImmutable() },
                checkRequired("toObjectId", toObjectId),
                checkRequired("toObjectTypeId", toObjectTypeId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LabelsBetweenObjectPair = apply {
        if (validated) {
            return@apply
        }

        fromObjectId()
        fromObjectTypeId()
        labels()
        toObjectId()
        toObjectTypeId()
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
        (if (fromObjectId.asKnown().isPresent) 1 else 0) +
            (if (fromObjectTypeId.asKnown().isPresent) 1 else 0) +
            (labels.asKnown().getOrNull()?.size ?: 0) +
            (if (toObjectId.asKnown().isPresent) 1 else 0) +
            (if (toObjectTypeId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LabelsBetweenObjectPair &&
            fromObjectId == other.fromObjectId &&
            fromObjectTypeId == other.fromObjectTypeId &&
            labels == other.labels &&
            toObjectId == other.toObjectId &&
            toObjectTypeId == other.toObjectTypeId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            fromObjectId,
            fromObjectTypeId,
            labels,
            toObjectId,
            toObjectTypeId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LabelsBetweenObjectPair{fromObjectId=$fromObjectId, fromObjectTypeId=$fromObjectTypeId, labels=$labels, toObjectId=$toObjectId, toObjectTypeId=$toObjectTypeId, additionalProperties=$additionalProperties}"
}
