// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms

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

/** Request body object for attaching objects to multi-language groups. */
class AttachToLangPrimaryRequestVNext
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val language: JsonField<String>,
    private val primaryId: JsonField<String>,
    private val primaryLanguage: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("language") @ExcludeMissing language: JsonField<String> = JsonMissing.of(),
        @JsonProperty("primaryId") @ExcludeMissing primaryId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("primaryLanguage")
        @ExcludeMissing
        primaryLanguage: JsonField<String> = JsonMissing.of(),
    ) : this(id, language, primaryId, primaryLanguage, mutableMapOf())

    /**
     * ID of the object to add to a multi-language group.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Designated language of the object to add to a multi-language group.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun language(): String = language.getRequired("language")

    /**
     * ID of primary language object in multi-language group.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun primaryId(): String = primaryId.getRequired("primaryId")

    /**
     * Primary language of the multi-language group.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryLanguage(): Optional<String> = primaryLanguage.getOptional("primaryLanguage")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [language].
     *
     * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<String> = language

    /**
     * Returns the raw JSON value of [primaryId].
     *
     * Unlike [primaryId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("primaryId") @ExcludeMissing fun _primaryId(): JsonField<String> = primaryId

    /**
     * Returns the raw JSON value of [primaryLanguage].
     *
     * Unlike [primaryLanguage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("primaryLanguage")
    @ExcludeMissing
    fun _primaryLanguage(): JsonField<String> = primaryLanguage

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
         * [AttachToLangPrimaryRequestVNext].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .language()
         * .primaryId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AttachToLangPrimaryRequestVNext]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var language: JsonField<String>? = null
        private var primaryId: JsonField<String>? = null
        private var primaryLanguage: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext) =
            apply {
                id = attachToLangPrimaryRequestVNext.id
                language = attachToLangPrimaryRequestVNext.language
                primaryId = attachToLangPrimaryRequestVNext.primaryId
                primaryLanguage = attachToLangPrimaryRequestVNext.primaryLanguage
                additionalProperties =
                    attachToLangPrimaryRequestVNext.additionalProperties.toMutableMap()
            }

        /** ID of the object to add to a multi-language group. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Designated language of the object to add to a multi-language group. */
        fun language(language: String) = language(JsonField.of(language))

        /**
         * Sets [Builder.language] to an arbitrary JSON value.
         *
         * You should usually call [Builder.language] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun language(language: JsonField<String>) = apply { this.language = language }

        /** ID of primary language object in multi-language group. */
        fun primaryId(primaryId: String) = primaryId(JsonField.of(primaryId))

        /**
         * Sets [Builder.primaryId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun primaryId(primaryId: JsonField<String>) = apply { this.primaryId = primaryId }

        /** Primary language of the multi-language group. */
        fun primaryLanguage(primaryLanguage: String) =
            primaryLanguage(JsonField.of(primaryLanguage))

        /**
         * Sets [Builder.primaryLanguage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryLanguage] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun primaryLanguage(primaryLanguage: JsonField<String>) = apply {
            this.primaryLanguage = primaryLanguage
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
         * Returns an immutable instance of [AttachToLangPrimaryRequestVNext].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .language()
         * .primaryId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AttachToLangPrimaryRequestVNext =
            AttachToLangPrimaryRequestVNext(
                checkRequired("id", id),
                checkRequired("language", language),
                checkRequired("primaryId", primaryId),
                primaryLanguage,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AttachToLangPrimaryRequestVNext = apply {
        if (validated) {
            return@apply
        }

        id()
        language()
        primaryId()
        primaryLanguage()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (language.asKnown().isPresent) 1 else 0) +
            (if (primaryId.asKnown().isPresent) 1 else 0) +
            (if (primaryLanguage.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AttachToLangPrimaryRequestVNext &&
            id == other.id &&
            language == other.language &&
            primaryId == other.primaryId &&
            primaryLanguage == other.primaryLanguage &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, language, primaryId, primaryLanguage, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AttachToLangPrimaryRequestVNext{id=$id, language=$language, primaryId=$primaryId, primaryLanguage=$primaryLanguage, additionalProperties=$additionalProperties}"
}
