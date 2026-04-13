// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.events.definitions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.core.ExcludeMissing
import com.hubspot.core.JsonField
import com.hubspot.core.JsonMissing
import com.hubspot.core.JsonValue
import com.hubspot.core.checkRequired
import com.hubspot.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects

class ExternalPrimaryObjectResolutionRule
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val eventPropertyName: JsonField<String>,
    private val targetObjectPropertyName: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("eventPropertyName")
        @ExcludeMissing
        eventPropertyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("targetObjectPropertyName")
        @ExcludeMissing
        targetObjectPropertyName: JsonField<String> = JsonMissing.of(),
    ) : this(eventPropertyName, targetObjectPropertyName, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventPropertyName(): String = eventPropertyName.getRequired("eventPropertyName")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun targetObjectPropertyName(): String =
        targetObjectPropertyName.getRequired("targetObjectPropertyName")

    /**
     * Returns the raw JSON value of [eventPropertyName].
     *
     * Unlike [eventPropertyName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("eventPropertyName")
    @ExcludeMissing
    fun _eventPropertyName(): JsonField<String> = eventPropertyName

    /**
     * Returns the raw JSON value of [targetObjectPropertyName].
     *
     * Unlike [targetObjectPropertyName], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("targetObjectPropertyName")
    @ExcludeMissing
    fun _targetObjectPropertyName(): JsonField<String> = targetObjectPropertyName

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
         * [ExternalPrimaryObjectResolutionRule].
         *
         * The following fields are required:
         * ```java
         * .eventPropertyName()
         * .targetObjectPropertyName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalPrimaryObjectResolutionRule]. */
    class Builder internal constructor() {

        private var eventPropertyName: JsonField<String>? = null
        private var targetObjectPropertyName: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            externalPrimaryObjectResolutionRule: ExternalPrimaryObjectResolutionRule
        ) = apply {
            eventPropertyName = externalPrimaryObjectResolutionRule.eventPropertyName
            targetObjectPropertyName = externalPrimaryObjectResolutionRule.targetObjectPropertyName
            additionalProperties =
                externalPrimaryObjectResolutionRule.additionalProperties.toMutableMap()
        }

        fun eventPropertyName(eventPropertyName: String) =
            eventPropertyName(JsonField.of(eventPropertyName))

        /**
         * Sets [Builder.eventPropertyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventPropertyName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun eventPropertyName(eventPropertyName: JsonField<String>) = apply {
            this.eventPropertyName = eventPropertyName
        }

        fun targetObjectPropertyName(targetObjectPropertyName: String) =
            targetObjectPropertyName(JsonField.of(targetObjectPropertyName))

        /**
         * Sets [Builder.targetObjectPropertyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetObjectPropertyName] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun targetObjectPropertyName(targetObjectPropertyName: JsonField<String>) = apply {
            this.targetObjectPropertyName = targetObjectPropertyName
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
         * Returns an immutable instance of [ExternalPrimaryObjectResolutionRule].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .eventPropertyName()
         * .targetObjectPropertyName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalPrimaryObjectResolutionRule =
            ExternalPrimaryObjectResolutionRule(
                checkRequired("eventPropertyName", eventPropertyName),
                checkRequired("targetObjectPropertyName", targetObjectPropertyName),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalPrimaryObjectResolutionRule = apply {
        if (validated) {
            return@apply
        }

        eventPropertyName()
        targetObjectPropertyName()
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
        (if (eventPropertyName.asKnown().isPresent) 1 else 0) +
            (if (targetObjectPropertyName.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalPrimaryObjectResolutionRule &&
            eventPropertyName == other.eventPropertyName &&
            targetObjectPropertyName == other.targetObjectPropertyName &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(eventPropertyName, targetObjectPropertyName, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalPrimaryObjectResolutionRule{eventPropertyName=$eventPropertyName, targetObjectPropertyName=$targetObjectPropertyName, additionalProperties=$additionalProperties}"
}
