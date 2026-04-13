// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.actions

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

class PublicActionDefinitionRequiresObjectRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val requiresObject: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("requiresObject")
        @ExcludeMissing
        requiresObject: JsonField<Boolean> = JsonMissing.of()
    ) : this(requiresObject, mutableMapOf())

    /**
     * Indicates whether a custom action definition requires an associated object.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun requiresObject(): Boolean = requiresObject.getRequired("requiresObject")

    /**
     * Returns the raw JSON value of [requiresObject].
     *
     * Unlike [requiresObject], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("requiresObject")
    @ExcludeMissing
    fun _requiresObject(): JsonField<Boolean> = requiresObject

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
         * [PublicActionDefinitionRequiresObjectRequest].
         *
         * The following fields are required:
         * ```java
         * .requiresObject()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicActionDefinitionRequiresObjectRequest]. */
    class Builder internal constructor() {

        private var requiresObject: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            publicActionDefinitionRequiresObjectRequest: PublicActionDefinitionRequiresObjectRequest
        ) = apply {
            requiresObject = publicActionDefinitionRequiresObjectRequest.requiresObject
            additionalProperties =
                publicActionDefinitionRequiresObjectRequest.additionalProperties.toMutableMap()
        }

        /** Indicates whether a custom action definition requires an associated object. */
        fun requiresObject(requiresObject: Boolean) = requiresObject(JsonField.of(requiresObject))

        /**
         * Sets [Builder.requiresObject] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requiresObject] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun requiresObject(requiresObject: JsonField<Boolean>) = apply {
            this.requiresObject = requiresObject
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
         * Returns an immutable instance of [PublicActionDefinitionRequiresObjectRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .requiresObject()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicActionDefinitionRequiresObjectRequest =
            PublicActionDefinitionRequiresObjectRequest(
                checkRequired("requiresObject", requiresObject),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicActionDefinitionRequiresObjectRequest = apply {
        if (validated) {
            return@apply
        }

        requiresObject()
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
    @JvmSynthetic internal fun validity(): Int = (if (requiresObject.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicActionDefinitionRequiresObjectRequest &&
            requiresObject == other.requiresObject &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(requiresObject, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicActionDefinitionRequiresObjectRequest{requiresObject=$requiresObject, additionalProperties=$additionalProperties}"
}
