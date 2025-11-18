// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations

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
import com.hubspot_sdk.api.models.PublicObjectId
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class PublicAssociation
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val from: JsonField<PublicObjectId>,
    private val to: JsonField<PublicObjectId>,
    private val type: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("from") @ExcludeMissing from: JsonField<PublicObjectId> = JsonMissing.of(),
        @JsonProperty("to") @ExcludeMissing to: JsonField<PublicObjectId> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
    ) : this(from, to, type, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun from(): PublicObjectId = from.getRequired("from")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun to(): PublicObjectId = to.getRequired("to")

    /**
     * The type of association between the 'from' and 'to' objects.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): String = type.getRequired("type")

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
         * Returns a mutable builder for constructing an instance of [PublicAssociation].
         *
         * The following fields are required:
         * ```java
         * .from()
         * .to()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicAssociation]. */
    class Builder internal constructor() {

        private var from: JsonField<PublicObjectId>? = null
        private var to: JsonField<PublicObjectId>? = null
        private var type: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicAssociation: PublicAssociation) = apply {
            from = publicAssociation.from
            to = publicAssociation.to
            type = publicAssociation.type
            additionalProperties = publicAssociation.additionalProperties.toMutableMap()
        }

        fun from(from: PublicObjectId) = from(JsonField.of(from))

        /**
         * Sets [Builder.from] to an arbitrary JSON value.
         *
         * You should usually call [Builder.from] with a well-typed [PublicObjectId] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun from(from: JsonField<PublicObjectId>) = apply { this.from = from }

        fun to(to: PublicObjectId) = to(JsonField.of(to))

        /**
         * Sets [Builder.to] to an arbitrary JSON value.
         *
         * You should usually call [Builder.to] with a well-typed [PublicObjectId] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun to(to: JsonField<PublicObjectId>) = apply { this.to = to }

        /** The type of association between the 'from' and 'to' objects. */
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
         * Returns an immutable instance of [PublicAssociation].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .from()
         * .to()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicAssociation =
            PublicAssociation(
                checkRequired("from", from),
                checkRequired("to", to),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicAssociation = apply {
        if (validated) {
            return@apply
        }

        from().validate()
        to().validate()
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
        (from.asKnown().getOrNull()?.validity() ?: 0) +
            (to.asKnown().getOrNull()?.validity() ?: 0) +
            (if (type.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicAssociation &&
            from == other.from &&
            to == other.to &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(from, to, type, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicAssociation{from=$from, to=$to, type=$type, additionalProperties=$additionalProperties}"
}
