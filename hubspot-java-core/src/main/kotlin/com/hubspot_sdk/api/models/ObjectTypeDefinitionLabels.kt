// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class ObjectTypeDefinitionLabels
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val plural: JsonField<String>,
    private val singular: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("plural") @ExcludeMissing plural: JsonField<String> = JsonMissing.of(),
        @JsonProperty("singular") @ExcludeMissing singular: JsonField<String> = JsonMissing.of(),
    ) : this(plural, singular, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun plural(): Optional<String> = plural.getOptional("plural")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun singular(): Optional<String> = singular.getOptional("singular")

    /**
     * Returns the raw JSON value of [plural].
     *
     * Unlike [plural], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("plural") @ExcludeMissing fun _plural(): JsonField<String> = plural

    /**
     * Returns the raw JSON value of [singular].
     *
     * Unlike [singular], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("singular") @ExcludeMissing fun _singular(): JsonField<String> = singular

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
         * Returns a mutable builder for constructing an instance of [ObjectTypeDefinitionLabels].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ObjectTypeDefinitionLabels]. */
    class Builder internal constructor() {

        private var plural: JsonField<String> = JsonMissing.of()
        private var singular: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(objectTypeDefinitionLabels: ObjectTypeDefinitionLabels) = apply {
            plural = objectTypeDefinitionLabels.plural
            singular = objectTypeDefinitionLabels.singular
            additionalProperties = objectTypeDefinitionLabels.additionalProperties.toMutableMap()
        }

        fun plural(plural: String) = plural(JsonField.of(plural))

        /**
         * Sets [Builder.plural] to an arbitrary JSON value.
         *
         * You should usually call [Builder.plural] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun plural(plural: JsonField<String>) = apply { this.plural = plural }

        fun singular(singular: String) = singular(JsonField.of(singular))

        /**
         * Sets [Builder.singular] to an arbitrary JSON value.
         *
         * You should usually call [Builder.singular] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun singular(singular: JsonField<String>) = apply { this.singular = singular }

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
         * Returns an immutable instance of [ObjectTypeDefinitionLabels].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ObjectTypeDefinitionLabels =
            ObjectTypeDefinitionLabels(plural, singular, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): ObjectTypeDefinitionLabels = apply {
        if (validated) {
            return@apply
        }

        plural()
        singular()
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
        (if (plural.asKnown().isPresent) 1 else 0) + (if (singular.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ObjectTypeDefinitionLabels &&
            plural == other.plural &&
            singular == other.singular &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(plural, singular, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ObjectTypeDefinitionLabels{plural=$plural, singular=$singular, additionalProperties=$additionalProperties}"
}
