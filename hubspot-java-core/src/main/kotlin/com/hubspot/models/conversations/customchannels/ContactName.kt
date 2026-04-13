// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.conversations.customchannels

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.core.ExcludeMissing
import com.hubspot.core.JsonField
import com.hubspot.core.JsonMissing
import com.hubspot.core.JsonValue
import com.hubspot.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class ContactName
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val firstName: JsonField<String>,
    private val lastName: JsonField<String>,
    private val middleName: JsonField<String>,
    private val prefix: JsonField<String>,
    private val suffix: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("firstName") @ExcludeMissing firstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lastName") @ExcludeMissing lastName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("middleName")
        @ExcludeMissing
        middleName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prefix") @ExcludeMissing prefix: JsonField<String> = JsonMissing.of(),
        @JsonProperty("suffix") @ExcludeMissing suffix: JsonField<String> = JsonMissing.of(),
    ) : this(firstName, lastName, middleName, prefix, suffix, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstName(): Optional<String> = firstName.getOptional("firstName")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastName(): Optional<String> = lastName.getOptional("lastName")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun middleName(): Optional<String> = middleName.getOptional("middleName")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun prefix(): Optional<String> = prefix.getOptional("prefix")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun suffix(): Optional<String> = suffix.getOptional("suffix")

    /**
     * Returns the raw JSON value of [firstName].
     *
     * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("firstName") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

    /**
     * Returns the raw JSON value of [lastName].
     *
     * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastName") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

    /**
     * Returns the raw JSON value of [middleName].
     *
     * Unlike [middleName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("middleName") @ExcludeMissing fun _middleName(): JsonField<String> = middleName

    /**
     * Returns the raw JSON value of [prefix].
     *
     * Unlike [prefix], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prefix") @ExcludeMissing fun _prefix(): JsonField<String> = prefix

    /**
     * Returns the raw JSON value of [suffix].
     *
     * Unlike [suffix], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("suffix") @ExcludeMissing fun _suffix(): JsonField<String> = suffix

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

        /** Returns a mutable builder for constructing an instance of [ContactName]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContactName]. */
    class Builder internal constructor() {

        private var firstName: JsonField<String> = JsonMissing.of()
        private var lastName: JsonField<String> = JsonMissing.of()
        private var middleName: JsonField<String> = JsonMissing.of()
        private var prefix: JsonField<String> = JsonMissing.of()
        private var suffix: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contactName: ContactName) = apply {
            firstName = contactName.firstName
            lastName = contactName.lastName
            middleName = contactName.middleName
            prefix = contactName.prefix
            suffix = contactName.suffix
            additionalProperties = contactName.additionalProperties.toMutableMap()
        }

        fun firstName(firstName: String) = firstName(JsonField.of(firstName))

        /**
         * Sets [Builder.firstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

        fun lastName(lastName: String) = lastName(JsonField.of(lastName))

        /**
         * Sets [Builder.lastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

        fun middleName(middleName: String) = middleName(JsonField.of(middleName))

        /**
         * Sets [Builder.middleName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.middleName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun middleName(middleName: JsonField<String>) = apply { this.middleName = middleName }

        fun prefix(prefix: String) = prefix(JsonField.of(prefix))

        /**
         * Sets [Builder.prefix] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prefix] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun prefix(prefix: JsonField<String>) = apply { this.prefix = prefix }

        fun suffix(suffix: String) = suffix(JsonField.of(suffix))

        /**
         * Sets [Builder.suffix] to an arbitrary JSON value.
         *
         * You should usually call [Builder.suffix] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun suffix(suffix: JsonField<String>) = apply { this.suffix = suffix }

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
         * Returns an immutable instance of [ContactName].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ContactName =
            ContactName(
                firstName,
                lastName,
                middleName,
                prefix,
                suffix,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ContactName = apply {
        if (validated) {
            return@apply
        }

        firstName()
        lastName()
        middleName()
        prefix()
        suffix()
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
        (if (firstName.asKnown().isPresent) 1 else 0) +
            (if (lastName.asKnown().isPresent) 1 else 0) +
            (if (middleName.asKnown().isPresent) 1 else 0) +
            (if (prefix.asKnown().isPresent) 1 else 0) +
            (if (suffix.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContactName &&
            firstName == other.firstName &&
            lastName == other.lastName &&
            middleName == other.middleName &&
            prefix == other.prefix &&
            suffix == other.suffix &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(firstName, lastName, middleName, prefix, suffix, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ContactName{firstName=$firstName, lastName=$lastName, middleName=$middleName, prefix=$prefix, suffix=$suffix, additionalProperties=$additionalProperties}"
}
