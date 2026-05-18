// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.blogs.authors

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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class BlogAuthorCloneRequestVNext
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val blogAuthor: JsonField<BlogAuthor>,
    private val language: JsonField<String>,
    private val primaryLanguage: JsonField<String>,
    private val usePublished: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("blogAuthor")
        @ExcludeMissing
        blogAuthor: JsonField<BlogAuthor> = JsonMissing.of(),
        @JsonProperty("language") @ExcludeMissing language: JsonField<String> = JsonMissing.of(),
        @JsonProperty("primaryLanguage")
        @ExcludeMissing
        primaryLanguage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("usePublished")
        @ExcludeMissing
        usePublished: JsonField<Boolean> = JsonMissing.of(),
    ) : this(id, blogAuthor, language, primaryLanguage, usePublished, mutableMapOf())

    /**
     * ID of the object to be cloned.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun blogAuthor(): BlogAuthor = blogAuthor.getRequired("blogAuthor")

    /**
     * Language of newly cloned object.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun language(): Optional<String> = language.getOptional("language")

    /**
     * Primary language in multi-language group.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryLanguage(): Optional<String> = primaryLanguage.getOptional("primaryLanguage")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun usePublished(): Optional<Boolean> = usePublished.getOptional("usePublished")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [blogAuthor].
     *
     * Unlike [blogAuthor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("blogAuthor")
    @ExcludeMissing
    fun _blogAuthor(): JsonField<BlogAuthor> = blogAuthor

    /**
     * Returns the raw JSON value of [language].
     *
     * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<String> = language

    /**
     * Returns the raw JSON value of [primaryLanguage].
     *
     * Unlike [primaryLanguage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("primaryLanguage")
    @ExcludeMissing
    fun _primaryLanguage(): JsonField<String> = primaryLanguage

    /**
     * Returns the raw JSON value of [usePublished].
     *
     * Unlike [usePublished], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("usePublished")
    @ExcludeMissing
    fun _usePublished(): JsonField<Boolean> = usePublished

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
         * Returns a mutable builder for constructing an instance of [BlogAuthorCloneRequestVNext].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .blogAuthor()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BlogAuthorCloneRequestVNext]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var blogAuthor: JsonField<BlogAuthor>? = null
        private var language: JsonField<String> = JsonMissing.of()
        private var primaryLanguage: JsonField<String> = JsonMissing.of()
        private var usePublished: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(blogAuthorCloneRequestVNext: BlogAuthorCloneRequestVNext) = apply {
            id = blogAuthorCloneRequestVNext.id
            blogAuthor = blogAuthorCloneRequestVNext.blogAuthor
            language = blogAuthorCloneRequestVNext.language
            primaryLanguage = blogAuthorCloneRequestVNext.primaryLanguage
            usePublished = blogAuthorCloneRequestVNext.usePublished
            additionalProperties = blogAuthorCloneRequestVNext.additionalProperties.toMutableMap()
        }

        /** ID of the object to be cloned. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun blogAuthor(blogAuthor: BlogAuthor) = blogAuthor(JsonField.of(blogAuthor))

        /**
         * Sets [Builder.blogAuthor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.blogAuthor] with a well-typed [BlogAuthor] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun blogAuthor(blogAuthor: JsonField<BlogAuthor>) = apply { this.blogAuthor = blogAuthor }

        /** Language of newly cloned object. */
        fun language(language: String) = language(JsonField.of(language))

        /**
         * Sets [Builder.language] to an arbitrary JSON value.
         *
         * You should usually call [Builder.language] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun language(language: JsonField<String>) = apply { this.language = language }

        /** Primary language in multi-language group. */
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

        fun usePublished(usePublished: Boolean) = usePublished(JsonField.of(usePublished))

        /**
         * Sets [Builder.usePublished] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usePublished] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun usePublished(usePublished: JsonField<Boolean>) = apply {
            this.usePublished = usePublished
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
         * Returns an immutable instance of [BlogAuthorCloneRequestVNext].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .blogAuthor()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BlogAuthorCloneRequestVNext =
            BlogAuthorCloneRequestVNext(
                checkRequired("id", id),
                checkRequired("blogAuthor", blogAuthor),
                language,
                primaryLanguage,
                usePublished,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): BlogAuthorCloneRequestVNext = apply {
        if (validated) {
            return@apply
        }

        id()
        blogAuthor().validate()
        language()
        primaryLanguage()
        usePublished()
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
            (blogAuthor.asKnown().getOrNull()?.validity() ?: 0) +
            (if (language.asKnown().isPresent) 1 else 0) +
            (if (primaryLanguage.asKnown().isPresent) 1 else 0) +
            (if (usePublished.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BlogAuthorCloneRequestVNext &&
            id == other.id &&
            blogAuthor == other.blogAuthor &&
            language == other.language &&
            primaryLanguage == other.primaryLanguage &&
            usePublished == other.usePublished &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, blogAuthor, language, primaryLanguage, usePublished, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BlogAuthorCloneRequestVNext{id=$id, blogAuthor=$blogAuthor, language=$language, primaryLanguage=$primaryLanguage, usePublished=$usePublished, additionalProperties=$additionalProperties}"
}
