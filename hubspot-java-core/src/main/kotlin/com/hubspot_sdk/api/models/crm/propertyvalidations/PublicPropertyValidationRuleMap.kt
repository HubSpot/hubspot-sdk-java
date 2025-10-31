// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.propertyvalidations

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

class PublicPropertyValidationRuleMap
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val propertyName: JsonField<String>,
    private val propertyValidationRules: JsonField<List<PublicPropertyValidationRule>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("propertyName")
        @ExcludeMissing
        propertyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("propertyValidationRules")
        @ExcludeMissing
        propertyValidationRules: JsonField<List<PublicPropertyValidationRule>> = JsonMissing.of(),
    ) : this(propertyName, propertyValidationRules, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun propertyName(): String = propertyName.getRequired("propertyName")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun propertyValidationRules(): List<PublicPropertyValidationRule> =
        propertyValidationRules.getRequired("propertyValidationRules")

    /**
     * Returns the raw JSON value of [propertyName].
     *
     * Unlike [propertyName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("propertyName")
    @ExcludeMissing
    fun _propertyName(): JsonField<String> = propertyName

    /**
     * Returns the raw JSON value of [propertyValidationRules].
     *
     * Unlike [propertyValidationRules], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("propertyValidationRules")
    @ExcludeMissing
    fun _propertyValidationRules(): JsonField<List<PublicPropertyValidationRule>> =
        propertyValidationRules

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
         * [PublicPropertyValidationRuleMap].
         *
         * The following fields are required:
         * ```java
         * .propertyName()
         * .propertyValidationRules()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicPropertyValidationRuleMap]. */
    class Builder internal constructor() {

        private var propertyName: JsonField<String>? = null
        private var propertyValidationRules: JsonField<MutableList<PublicPropertyValidationRule>>? =
            null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicPropertyValidationRuleMap: PublicPropertyValidationRuleMap) =
            apply {
                propertyName = publicPropertyValidationRuleMap.propertyName
                propertyValidationRules =
                    publicPropertyValidationRuleMap.propertyValidationRules.map {
                        it.toMutableList()
                    }
                additionalProperties =
                    publicPropertyValidationRuleMap.additionalProperties.toMutableMap()
            }

        fun propertyName(propertyName: String) = propertyName(JsonField.of(propertyName))

        /**
         * Sets [Builder.propertyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.propertyName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun propertyName(propertyName: JsonField<String>) = apply {
            this.propertyName = propertyName
        }

        fun propertyValidationRules(propertyValidationRules: List<PublicPropertyValidationRule>) =
            propertyValidationRules(JsonField.of(propertyValidationRules))

        /**
         * Sets [Builder.propertyValidationRules] to an arbitrary JSON value.
         *
         * You should usually call [Builder.propertyValidationRules] with a well-typed
         * `List<PublicPropertyValidationRule>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun propertyValidationRules(
            propertyValidationRules: JsonField<List<PublicPropertyValidationRule>>
        ) = apply {
            this.propertyValidationRules = propertyValidationRules.map { it.toMutableList() }
        }

        /**
         * Adds a single [PublicPropertyValidationRule] to [propertyValidationRules].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPropertyValidationRule(propertyValidationRule: PublicPropertyValidationRule) =
            apply {
                propertyValidationRules =
                    (propertyValidationRules ?: JsonField.of(mutableListOf())).also {
                        checkKnown("propertyValidationRules", it).add(propertyValidationRule)
                    }
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
         * Returns an immutable instance of [PublicPropertyValidationRuleMap].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .propertyName()
         * .propertyValidationRules()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicPropertyValidationRuleMap =
            PublicPropertyValidationRuleMap(
                checkRequired("propertyName", propertyName),
                checkRequired("propertyValidationRules", propertyValidationRules).map {
                    it.toImmutable()
                },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicPropertyValidationRuleMap = apply {
        if (validated) {
            return@apply
        }

        propertyName()
        propertyValidationRules().forEach { it.validate() }
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
        (if (propertyName.asKnown().isPresent) 1 else 0) +
            (propertyValidationRules.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicPropertyValidationRuleMap &&
            propertyName == other.propertyName &&
            propertyValidationRules == other.propertyValidationRules &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(propertyName, propertyValidationRules, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicPropertyValidationRuleMap{propertyName=$propertyName, propertyValidationRules=$propertyValidationRules, additionalProperties=$additionalProperties}"
}
