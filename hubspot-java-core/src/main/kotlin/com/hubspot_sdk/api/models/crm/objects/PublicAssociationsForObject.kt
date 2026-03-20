// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects

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

class PublicAssociationsForObject
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val to: JsonField<PublicObjectId>,
    private val types: JsonField<List<AssociationSpec>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("to") @ExcludeMissing to: JsonField<PublicObjectId> = JsonMissing.of(),
        @JsonProperty("types")
        @ExcludeMissing
        types: JsonField<List<AssociationSpec>> = JsonMissing.of(),
    ) : this(to, types, mutableMapOf())

    /**
     * Contains the Id of a Public Object
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun to(): PublicObjectId = to.getRequired("to")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun types(): List<AssociationSpec> = types.getRequired("types")

    /**
     * Returns the raw JSON value of [to].
     *
     * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<PublicObjectId> = to

    /**
     * Returns the raw JSON value of [types].
     *
     * Unlike [types], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("types") @ExcludeMissing fun _types(): JsonField<List<AssociationSpec>> = types

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
         * Returns a mutable builder for constructing an instance of [PublicAssociationsForObject].
         *
         * The following fields are required:
         * ```java
         * .to()
         * .types()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicAssociationsForObject]. */
    class Builder internal constructor() {

        private var to: JsonField<PublicObjectId>? = null
        private var types: JsonField<MutableList<AssociationSpec>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicAssociationsForObject: PublicAssociationsForObject) = apply {
            to = publicAssociationsForObject.to
            types = publicAssociationsForObject.types.map { it.toMutableList() }
            additionalProperties = publicAssociationsForObject.additionalProperties.toMutableMap()
        }

        /** Contains the Id of a Public Object */
        fun to(to: PublicObjectId) = to(JsonField.of(to))

        /**
         * Sets [Builder.to] to an arbitrary JSON value.
         *
         * You should usually call [Builder.to] with a well-typed [PublicObjectId] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun to(to: JsonField<PublicObjectId>) = apply { this.to = to }

        fun types(types: List<AssociationSpec>) = types(JsonField.of(types))

        /**
         * Sets [Builder.types] to an arbitrary JSON value.
         *
         * You should usually call [Builder.types] with a well-typed `List<AssociationSpec>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun types(types: JsonField<List<AssociationSpec>>) = apply {
            this.types = types.map { it.toMutableList() }
        }

        /**
         * Adds a single [AssociationSpec] to [types].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addType(type: AssociationSpec) = apply {
            types =
                (types ?: JsonField.of(mutableListOf())).also { checkKnown("types", it).add(type) }
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
         * Returns an immutable instance of [PublicAssociationsForObject].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .to()
         * .types()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicAssociationsForObject =
            PublicAssociationsForObject(
                checkRequired("to", to),
                checkRequired("types", types).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicAssociationsForObject = apply {
        if (validated) {
            return@apply
        }

        to().validate()
        types().forEach { it.validate() }
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
        (to.asKnown().getOrNull()?.validity() ?: 0) +
            (types.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicAssociationsForObject &&
            to == other.to &&
            types == other.types &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(to, types, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicAssociationsForObject{to=$to, types=$types, additionalProperties=$additionalProperties}"
}
