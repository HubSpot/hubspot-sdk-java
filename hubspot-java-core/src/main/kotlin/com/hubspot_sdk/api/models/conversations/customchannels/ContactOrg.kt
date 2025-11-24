// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class ContactOrg
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val company: JsonField<String>,
    private val department: JsonField<String>,
    private val title: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("company") @ExcludeMissing company: JsonField<String> = JsonMissing.of(),
        @JsonProperty("department")
        @ExcludeMissing
        department: JsonField<String> = JsonMissing.of(),
        @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
    ) : this(company, department, title, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun company(): Optional<String> = company.getOptional("company")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun department(): Optional<String> = department.getOptional("department")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun title(): Optional<String> = title.getOptional("title")

    /**
     * Returns the raw JSON value of [company].
     *
     * Unlike [company], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("company") @ExcludeMissing fun _company(): JsonField<String> = company

    /**
     * Returns the raw JSON value of [department].
     *
     * Unlike [department], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("department") @ExcludeMissing fun _department(): JsonField<String> = department

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

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

        /** Returns a mutable builder for constructing an instance of [ContactOrg]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContactOrg]. */
    class Builder internal constructor() {

        private var company: JsonField<String> = JsonMissing.of()
        private var department: JsonField<String> = JsonMissing.of()
        private var title: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contactOrg: ContactOrg) = apply {
            company = contactOrg.company
            department = contactOrg.department
            title = contactOrg.title
            additionalProperties = contactOrg.additionalProperties.toMutableMap()
        }

        fun company(company: String) = company(JsonField.of(company))

        /**
         * Sets [Builder.company] to an arbitrary JSON value.
         *
         * You should usually call [Builder.company] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun company(company: JsonField<String>) = apply { this.company = company }

        fun department(department: String) = department(JsonField.of(department))

        /**
         * Sets [Builder.department] to an arbitrary JSON value.
         *
         * You should usually call [Builder.department] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun department(department: JsonField<String>) = apply { this.department = department }

        fun title(title: String) = title(JsonField.of(title))

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<String>) = apply { this.title = title }

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
         * Returns an immutable instance of [ContactOrg].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ContactOrg =
            ContactOrg(company, department, title, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): ContactOrg = apply {
        if (validated) {
            return@apply
        }

        company()
        department()
        title()
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
        (if (company.asKnown().isPresent) 1 else 0) +
            (if (department.asKnown().isPresent) 1 else 0) +
            (if (title.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContactOrg &&
            company == other.company &&
            department == other.department &&
            title == other.title &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(company, department, title, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ContactOrg{company=$company, department=$department, title=$title, additionalProperties=$additionalProperties}"
}
