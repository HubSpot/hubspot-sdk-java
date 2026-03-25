// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.send

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
import kotlin.jvm.optionals.getOrNull

class ExternalObjectResolutionMappingRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val primaryObjectRule: JsonField<ExternalPrimaryObjectResolutionRule>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("primaryObjectRule")
        @ExcludeMissing
        primaryObjectRule: JsonField<ExternalPrimaryObjectResolutionRule> = JsonMissing.of()
    ) : this(primaryObjectRule, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun primaryObjectRule(): ExternalPrimaryObjectResolutionRule =
        primaryObjectRule.getRequired("primaryObjectRule")

    /**
     * Returns the raw JSON value of [primaryObjectRule].
     *
     * Unlike [primaryObjectRule], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("primaryObjectRule")
    @ExcludeMissing
    fun _primaryObjectRule(): JsonField<ExternalPrimaryObjectResolutionRule> = primaryObjectRule

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
         * [ExternalObjectResolutionMappingRequest].
         *
         * The following fields are required:
         * ```java
         * .primaryObjectRule()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalObjectResolutionMappingRequest]. */
    class Builder internal constructor() {

        private var primaryObjectRule: JsonField<ExternalPrimaryObjectResolutionRule>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            externalObjectResolutionMappingRequest: ExternalObjectResolutionMappingRequest
        ) = apply {
            primaryObjectRule = externalObjectResolutionMappingRequest.primaryObjectRule
            additionalProperties =
                externalObjectResolutionMappingRequest.additionalProperties.toMutableMap()
        }

        fun primaryObjectRule(primaryObjectRule: ExternalPrimaryObjectResolutionRule) =
            primaryObjectRule(JsonField.of(primaryObjectRule))

        /**
         * Sets [Builder.primaryObjectRule] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryObjectRule] with a well-typed
         * [ExternalPrimaryObjectResolutionRule] value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun primaryObjectRule(primaryObjectRule: JsonField<ExternalPrimaryObjectResolutionRule>) =
            apply {
                this.primaryObjectRule = primaryObjectRule
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
         * Returns an immutable instance of [ExternalObjectResolutionMappingRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .primaryObjectRule()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalObjectResolutionMappingRequest =
            ExternalObjectResolutionMappingRequest(
                checkRequired("primaryObjectRule", primaryObjectRule),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalObjectResolutionMappingRequest = apply {
        if (validated) {
            return@apply
        }

        primaryObjectRule().validate()
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
    internal fun validity(): Int = (primaryObjectRule.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalObjectResolutionMappingRequest &&
            primaryObjectRule == other.primaryObjectRule &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(primaryObjectRule, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalObjectResolutionMappingRequest{primaryObjectRule=$primaryObjectRule, additionalProperties=$additionalProperties}"
}
