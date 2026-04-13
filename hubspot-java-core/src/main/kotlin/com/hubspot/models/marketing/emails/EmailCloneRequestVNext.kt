// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.emails

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
import java.util.Optional

class EmailCloneRequestVNext
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val cloneName: JsonField<String>,
    private val language: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cloneName") @ExcludeMissing cloneName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("language") @ExcludeMissing language: JsonField<String> = JsonMissing.of(),
    ) : this(id, cloneName, language, mutableMapOf())

    /**
     * The email ID.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The name to assign to the cloned email.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cloneName(): Optional<String> = cloneName.getOptional("cloneName")

    /**
     * The language code for the cloned email, such as 'en' for English.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun language(): Optional<String> = language.getOptional("language")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [cloneName].
     *
     * Unlike [cloneName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cloneName") @ExcludeMissing fun _cloneName(): JsonField<String> = cloneName

    /**
     * Returns the raw JSON value of [language].
     *
     * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<String> = language

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
         * Returns a mutable builder for constructing an instance of [EmailCloneRequestVNext].
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailCloneRequestVNext]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var cloneName: JsonField<String> = JsonMissing.of()
        private var language: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(emailCloneRequestVNext: EmailCloneRequestVNext) = apply {
            id = emailCloneRequestVNext.id
            cloneName = emailCloneRequestVNext.cloneName
            language = emailCloneRequestVNext.language
            additionalProperties = emailCloneRequestVNext.additionalProperties.toMutableMap()
        }

        /** The email ID. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The name to assign to the cloned email. */
        fun cloneName(cloneName: String) = cloneName(JsonField.of(cloneName))

        /**
         * Sets [Builder.cloneName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cloneName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cloneName(cloneName: JsonField<String>) = apply { this.cloneName = cloneName }

        /** The language code for the cloned email, such as 'en' for English. */
        fun language(language: String) = language(JsonField.of(language))

        /**
         * Sets [Builder.language] to an arbitrary JSON value.
         *
         * You should usually call [Builder.language] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun language(language: JsonField<String>) = apply { this.language = language }

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
         * Returns an immutable instance of [EmailCloneRequestVNext].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EmailCloneRequestVNext =
            EmailCloneRequestVNext(
                checkRequired("id", id),
                cloneName,
                language,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): EmailCloneRequestVNext = apply {
        if (validated) {
            return@apply
        }

        id()
        cloneName()
        language()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (cloneName.asKnown().isPresent) 1 else 0) +
            (if (language.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailCloneRequestVNext &&
            id == other.id &&
            cloneName == other.cloneName &&
            language == other.language &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, cloneName, language, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EmailCloneRequestVNext{id=$id, cloneName=$cloneName, language=$language, additionalProperties=$additionalProperties}"
}
