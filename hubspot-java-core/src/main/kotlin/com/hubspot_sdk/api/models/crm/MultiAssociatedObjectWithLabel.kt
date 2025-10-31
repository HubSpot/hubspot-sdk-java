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
import com.hubspot_sdk.api.models.crm.associations.v4.AssociationSpecWithLabel1
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class MultiAssociatedObjectWithLabel
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val associationTypes: JsonField<List<AssociationSpecWithLabel1>>,
    private val toObjectId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("associationTypes")
        @ExcludeMissing
        associationTypes: JsonField<List<AssociationSpecWithLabel1>> = JsonMissing.of(),
        @JsonProperty("toObjectId") @ExcludeMissing toObjectId: JsonField<String> = JsonMissing.of(),
    ) : this(associationTypes, toObjectId, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun associationTypes(): List<AssociationSpecWithLabel1> =
        associationTypes.getRequired("associationTypes")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun toObjectId(): String = toObjectId.getRequired("toObjectId")

    /**
     * Returns the raw JSON value of [associationTypes].
     *
     * Unlike [associationTypes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("associationTypes")
    @ExcludeMissing
    fun _associationTypes(): JsonField<List<AssociationSpecWithLabel1>> = associationTypes

    /**
     * Returns the raw JSON value of [toObjectId].
     *
     * Unlike [toObjectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("toObjectId") @ExcludeMissing fun _toObjectId(): JsonField<String> = toObjectId

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
         * Returns a mutable builder for constructing an instance of
         * [MultiAssociatedObjectWithLabel].
         *
         * The following fields are required:
         * ```java
         * .associationTypes()
         * .toObjectId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MultiAssociatedObjectWithLabel]. */
    class Builder internal constructor() {

        private var associationTypes: JsonField<MutableList<AssociationSpecWithLabel1>>? = null
        private var toObjectId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(multiAssociatedObjectWithLabel: MultiAssociatedObjectWithLabel) = apply {
            associationTypes =
                multiAssociatedObjectWithLabel.associationTypes.map { it.toMutableList() }
            toObjectId = multiAssociatedObjectWithLabel.toObjectId
            additionalProperties =
                multiAssociatedObjectWithLabel.additionalProperties.toMutableMap()
        }

        fun associationTypes(associationTypes: List<AssociationSpecWithLabel1>) =
            associationTypes(JsonField.of(associationTypes))

        /**
         * Sets [Builder.associationTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.associationTypes] with a well-typed
         * `List<AssociationSpecWithLabel1>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun associationTypes(associationTypes: JsonField<List<AssociationSpecWithLabel1>>) = apply {
            this.associationTypes = associationTypes.map { it.toMutableList() }
        }

        /**
         * Adds a single [AssociationSpecWithLabel1] to [associationTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAssociationType(associationType: AssociationSpecWithLabel1) = apply {
            associationTypes =
                (associationTypes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("associationTypes", it).add(associationType)
                }
        }

        fun toObjectId(toObjectId: String) = toObjectId(JsonField.of(toObjectId))

        /**
         * Sets [Builder.toObjectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toObjectId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun toObjectId(toObjectId: JsonField<String>) = apply { this.toObjectId = toObjectId }

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
         * Returns an immutable instance of [MultiAssociatedObjectWithLabel].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .associationTypes()
         * .toObjectId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MultiAssociatedObjectWithLabel =
            MultiAssociatedObjectWithLabel(
                checkRequired("associationTypes", associationTypes).map { it.toImmutable() },
                checkRequired("toObjectId", toObjectId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MultiAssociatedObjectWithLabel = apply {
        if (validated) {
            return@apply
        }

        associationTypes().forEach { it.validate() }
        toObjectId()
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
        (associationTypes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (toObjectId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MultiAssociatedObjectWithLabel &&
            associationTypes == other.associationTypes &&
            toObjectId == other.toObjectId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(associationTypes, toObjectId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MultiAssociatedObjectWithLabel{associationTypes=$associationTypes, toObjectId=$toObjectId, additionalProperties=$additionalProperties}"
}
