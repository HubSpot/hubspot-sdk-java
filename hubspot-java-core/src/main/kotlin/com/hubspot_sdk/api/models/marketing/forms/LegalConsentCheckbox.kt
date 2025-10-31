// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.forms

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

class LegalConsentCheckbox
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val label: JsonField<String>,
    private val required: JsonField<Boolean>,
    private val subscriptionTypeId: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("required") @ExcludeMissing required: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("subscriptionTypeId")
        @ExcludeMissing
        subscriptionTypeId: JsonField<Int> = JsonMissing.of(),
    ) : this(label, required, subscriptionTypeId, mutableMapOf())

    /**
     * The main label for the form field.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun label(): String = label.getRequired("label")

    /**
     * Whether this checkbox is required when submitting the form.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun required(): Boolean = required.getRequired("required")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriptionTypeId(): Int = subscriptionTypeId.getRequired("subscriptionTypeId")

    /**
     * Returns the raw JSON value of [label].
     *
     * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

    /**
     * Returns the raw JSON value of [required].
     *
     * Unlike [required], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("required") @ExcludeMissing fun _required(): JsonField<Boolean> = required

    /**
     * Returns the raw JSON value of [subscriptionTypeId].
     *
     * Unlike [subscriptionTypeId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("subscriptionTypeId")
    @ExcludeMissing
    fun _subscriptionTypeId(): JsonField<Int> = subscriptionTypeId

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
         * Returns a mutable builder for constructing an instance of [LegalConsentCheckbox].
         *
         * The following fields are required:
         * ```java
         * .label()
         * .required()
         * .subscriptionTypeId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LegalConsentCheckbox]. */
    class Builder internal constructor() {

        private var label: JsonField<String>? = null
        private var required: JsonField<Boolean>? = null
        private var subscriptionTypeId: JsonField<Int>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(legalConsentCheckbox: LegalConsentCheckbox) = apply {
            label = legalConsentCheckbox.label
            required = legalConsentCheckbox.required
            subscriptionTypeId = legalConsentCheckbox.subscriptionTypeId
            additionalProperties = legalConsentCheckbox.additionalProperties.toMutableMap()
        }

        /** The main label for the form field. */
        fun label(label: String) = label(JsonField.of(label))

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: JsonField<String>) = apply { this.label = label }

        /** Whether this checkbox is required when submitting the form. */
        fun required(required: Boolean) = required(JsonField.of(required))

        /**
         * Sets [Builder.required] to an arbitrary JSON value.
         *
         * You should usually call [Builder.required] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun required(required: JsonField<Boolean>) = apply { this.required = required }

        fun subscriptionTypeId(subscriptionTypeId: Int) =
            subscriptionTypeId(JsonField.of(subscriptionTypeId))

        /**
         * Sets [Builder.subscriptionTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionTypeId] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subscriptionTypeId(subscriptionTypeId: JsonField<Int>) = apply {
            this.subscriptionTypeId = subscriptionTypeId
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
         * Returns an immutable instance of [LegalConsentCheckbox].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .label()
         * .required()
         * .subscriptionTypeId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LegalConsentCheckbox =
            LegalConsentCheckbox(
                checkRequired("label", label),
                checkRequired("required", required),
                checkRequired("subscriptionTypeId", subscriptionTypeId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LegalConsentCheckbox = apply {
        if (validated) {
            return@apply
        }

        label()
        required()
        subscriptionTypeId()
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
        (if (label.asKnown().isPresent) 1 else 0) +
            (if (required.asKnown().isPresent) 1 else 0) +
            (if (subscriptionTypeId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LegalConsentCheckbox &&
            label == other.label &&
            required == other.required &&
            subscriptionTypeId == other.subscriptionTypeId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(label, required, subscriptionTypeId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LegalConsentCheckbox{label=$label, required=$required, subscriptionTypeId=$subscriptionTypeId, additionalProperties=$additionalProperties}"
}
