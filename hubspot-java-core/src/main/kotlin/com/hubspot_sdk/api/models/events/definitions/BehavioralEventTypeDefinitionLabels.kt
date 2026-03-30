// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.definitions

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
import java.util.Collections
import java.util.Objects
import java.util.Optional

class BehavioralEventTypeDefinitionLabels
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val singular: JsonField<String>,
    private val plural: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("singular") @ExcludeMissing singular: JsonField<String> = JsonMissing.of(),
        @JsonProperty("plural") @ExcludeMissing plural: JsonField<String> = JsonMissing.of(),
    ) : this(singular, plural, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun singular(): String = singular.getRequired("singular")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun plural(): Optional<String> = plural.getOptional("plural")

    /**
     * Returns the raw JSON value of [singular].
     *
     * Unlike [singular], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("singular") @ExcludeMissing fun _singular(): JsonField<String> = singular

    /**
     * Returns the raw JSON value of [plural].
     *
     * Unlike [plural], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("plural") @ExcludeMissing fun _plural(): JsonField<String> = plural

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
         * [BehavioralEventTypeDefinitionLabels].
         *
         * The following fields are required:
         * ```java
         * .singular()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BehavioralEventTypeDefinitionLabels]. */
    class Builder internal constructor() {

        private var singular: JsonField<String>? = null
        private var plural: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            behavioralEventTypeDefinitionLabels: BehavioralEventTypeDefinitionLabels
        ) = apply {
            singular = behavioralEventTypeDefinitionLabels.singular
            plural = behavioralEventTypeDefinitionLabels.plural
            additionalProperties =
                behavioralEventTypeDefinitionLabels.additionalProperties.toMutableMap()
        }

        fun singular(singular: String) = singular(JsonField.of(singular))

        /**
         * Sets [Builder.singular] to an arbitrary JSON value.
         *
         * You should usually call [Builder.singular] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun singular(singular: JsonField<String>) = apply { this.singular = singular }

        fun plural(plural: String) = plural(JsonField.of(plural))

        /**
         * Sets [Builder.plural] to an arbitrary JSON value.
         *
         * You should usually call [Builder.plural] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun plural(plural: JsonField<String>) = apply { this.plural = plural }

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
         * Returns an immutable instance of [BehavioralEventTypeDefinitionLabels].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .singular()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BehavioralEventTypeDefinitionLabels =
            BehavioralEventTypeDefinitionLabels(
                checkRequired("singular", singular),
                plural,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BehavioralEventTypeDefinitionLabels = apply {
        if (validated) {
            return@apply
        }

        singular()
        plural()
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
        (if (singular.asKnown().isPresent) 1 else 0) + (if (plural.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BehavioralEventTypeDefinitionLabels &&
            singular == other.singular &&
            plural == other.plural &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(singular, plural, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BehavioralEventTypeDefinitionLabels{singular=$singular, plural=$plural, additionalProperties=$additionalProperties}"
}
