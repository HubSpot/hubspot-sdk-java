// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.custom

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import com.hubspot_sdk.api.models.AssociationSpec
import com.hubspot_sdk.api.models.PublicObjectId
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class PublicDefaultAssociation
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val associationSpec: JsonField<AssociationSpec>,
    private val from: JsonField<PublicObjectId>,
    private val to: JsonField<PublicObjectId>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("associationSpec")
        @ExcludeMissing
        associationSpec: JsonField<AssociationSpec> = JsonMissing.of(),
        @JsonProperty("from") @ExcludeMissing from: JsonField<PublicObjectId> = JsonMissing.of(),
        @JsonProperty("to") @ExcludeMissing to: JsonField<PublicObjectId> = JsonMissing.of(),
    ) : this(associationSpec, from, to, mutableMapOf())

    /**
     * Defines the type, direction, and details of the relationship between two CRM objects.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun associationSpec(): AssociationSpec = associationSpec.getRequired("associationSpec")

    /**
     * Contains the Id of a Public Object
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun from(): PublicObjectId = from.getRequired("from")

    /**
     * Contains the Id of a Public Object
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun to(): PublicObjectId = to.getRequired("to")

    /**
     * Returns the raw JSON value of [associationSpec].
     *
     * Unlike [associationSpec], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("associationSpec")
    @ExcludeMissing
    fun _associationSpec(): JsonField<AssociationSpec> = associationSpec

    /**
     * Returns the raw JSON value of [from].
     *
     * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<PublicObjectId> = from

    /**
     * Returns the raw JSON value of [to].
     *
     * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<PublicObjectId> = to

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
         * Returns a mutable builder for constructing an instance of [PublicDefaultAssociation].
         *
         * The following fields are required:
         * ```java
         * .associationSpec()
         * .from()
         * .to()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicDefaultAssociation]. */
    class Builder internal constructor() {

        private var associationSpec: JsonField<AssociationSpec>? = null
        private var from: JsonField<PublicObjectId>? = null
        private var to: JsonField<PublicObjectId>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicDefaultAssociation: PublicDefaultAssociation) = apply {
            associationSpec = publicDefaultAssociation.associationSpec
            from = publicDefaultAssociation.from
            to = publicDefaultAssociation.to
            additionalProperties = publicDefaultAssociation.additionalProperties.toMutableMap()
        }

        /** Defines the type, direction, and details of the relationship between two CRM objects. */
        fun associationSpec(associationSpec: AssociationSpec) =
            associationSpec(JsonField.of(associationSpec))

        /**
         * Sets [Builder.associationSpec] to an arbitrary JSON value.
         *
         * You should usually call [Builder.associationSpec] with a well-typed [AssociationSpec]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun associationSpec(associationSpec: JsonField<AssociationSpec>) = apply {
            this.associationSpec = associationSpec
        }

        /** Contains the Id of a Public Object */
        fun from(from: PublicObjectId) = from(JsonField.of(from))

        /**
         * Sets [Builder.from] to an arbitrary JSON value.
         *
         * You should usually call [Builder.from] with a well-typed [PublicObjectId] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun from(from: JsonField<PublicObjectId>) = apply { this.from = from }

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
         * Returns an immutable instance of [PublicDefaultAssociation].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .associationSpec()
         * .from()
         * .to()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicDefaultAssociation =
            PublicDefaultAssociation(
                checkRequired("associationSpec", associationSpec),
                checkRequired("from", from),
                checkRequired("to", to),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicDefaultAssociation = apply {
        if (validated) {
            return@apply
        }

        associationSpec().validate()
        from().validate()
        to().validate()
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
        (associationSpec.asKnown().getOrNull()?.validity() ?: 0) +
            (from.asKnown().getOrNull()?.validity() ?: 0) +
            (to.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicDefaultAssociation &&
            associationSpec == other.associationSpec &&
            from == other.from &&
            to == other.to &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(associationSpec, from, to, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicDefaultAssociation{associationSpec=$associationSpec, from=$from, to=$to, additionalProperties=$additionalProperties}"
}
