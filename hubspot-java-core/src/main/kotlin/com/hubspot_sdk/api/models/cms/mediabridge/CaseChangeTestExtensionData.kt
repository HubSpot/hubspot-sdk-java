// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

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

class CaseChangeTestExtensionData
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val mood: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("mood") @ExcludeMissing mood: JsonField<String> = JsonMissing.of()
    ) : this(mood, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun mood(): String = mood.getRequired("mood")

    /**
     * Returns the raw JSON value of [mood].
     *
     * Unlike [mood], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mood") @ExcludeMissing fun _mood(): JsonField<String> = mood

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
         * Returns a mutable builder for constructing an instance of [CaseChangeTestExtensionData].
         *
         * The following fields are required:
         * ```java
         * .mood()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CaseChangeTestExtensionData]. */
    class Builder internal constructor() {

        private var mood: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(caseChangeTestExtensionData: CaseChangeTestExtensionData) = apply {
            mood = caseChangeTestExtensionData.mood
            additionalProperties = caseChangeTestExtensionData.additionalProperties.toMutableMap()
        }

        fun mood(mood: String) = mood(JsonField.of(mood))

        /**
         * Sets [Builder.mood] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mood] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mood(mood: JsonField<String>) = apply { this.mood = mood }

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
         * Returns an immutable instance of [CaseChangeTestExtensionData].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .mood()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CaseChangeTestExtensionData =
            CaseChangeTestExtensionData(
                checkRequired("mood", mood),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CaseChangeTestExtensionData = apply {
        if (validated) {
            return@apply
        }

        mood()
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
    @JvmSynthetic internal fun validity(): Int = (if (mood.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CaseChangeTestExtensionData &&
            mood == other.mood &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(mood, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CaseChangeTestExtensionData{mood=$mood, additionalProperties=$additionalProperties}"
}
