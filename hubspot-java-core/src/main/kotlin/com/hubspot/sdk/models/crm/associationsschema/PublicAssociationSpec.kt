// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.associationsschema

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects

class PublicAssociationSpec
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val category: JsonField<String>,
    private val typeId: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("category") @ExcludeMissing category: JsonField<String> = JsonMissing.of(),
        @JsonProperty("typeId") @ExcludeMissing typeId: JsonField<Int> = JsonMissing.of(),
    ) : this(category, typeId, mutableMapOf())

    /**
     * Specifies the category of the association, which can be HUBSPOT_DEFINED, INTEGRATOR_DEFINED,
     * or USER_DEFINED.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun category(): String = category.getRequired("category")

    /**
     * A unique integer identifier for the specific association type within its category.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun typeId(): Int = typeId.getRequired("typeId")

    /**
     * Returns the raw JSON value of [category].
     *
     * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<String> = category

    /**
     * Returns the raw JSON value of [typeId].
     *
     * Unlike [typeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("typeId") @ExcludeMissing fun _typeId(): JsonField<Int> = typeId

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
         * Returns a mutable builder for constructing an instance of [PublicAssociationSpec].
         *
         * The following fields are required:
         * ```java
         * .category()
         * .typeId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicAssociationSpec]. */
    class Builder internal constructor() {

        private var category: JsonField<String>? = null
        private var typeId: JsonField<Int>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicAssociationSpec: PublicAssociationSpec) = apply {
            category = publicAssociationSpec.category
            typeId = publicAssociationSpec.typeId
            additionalProperties = publicAssociationSpec.additionalProperties.toMutableMap()
        }

        /**
         * Specifies the category of the association, which can be HUBSPOT_DEFINED,
         * INTEGRATOR_DEFINED, or USER_DEFINED.
         */
        fun category(category: String) = category(JsonField.of(category))

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun category(category: JsonField<String>) = apply { this.category = category }

        /** A unique integer identifier for the specific association type within its category. */
        fun typeId(typeId: Int) = typeId(JsonField.of(typeId))

        /**
         * Sets [Builder.typeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.typeId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun typeId(typeId: JsonField<Int>) = apply { this.typeId = typeId }

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
         * Returns an immutable instance of [PublicAssociationSpec].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .category()
         * .typeId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicAssociationSpec =
            PublicAssociationSpec(
                checkRequired("category", category),
                checkRequired("typeId", typeId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicAssociationSpec = apply {
        if (validated) {
            return@apply
        }

        category()
        typeId()
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
        (if (category.asKnown().isPresent) 1 else 0) + (if (typeId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicAssociationSpec &&
            category == other.category &&
            typeId == other.typeId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(category, typeId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicAssociationSpec{category=$category, typeId=$typeId, additionalProperties=$additionalProperties}"
}
