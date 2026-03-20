// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Error
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val category: JsonField<String>,
    private val correlationId: JsonField<String>,
    private val message: JsonField<String>,
    private val context: JsonField<Context>,
    private val errors: JsonField<List<ErrorDetail>>,
    private val links: JsonField<Links>,
    private val subCategory: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("category") @ExcludeMissing category: JsonField<String> = JsonMissing.of(),
        @JsonProperty("correlationId")
        @ExcludeMissing
        correlationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("context") @ExcludeMissing context: JsonField<Context> = JsonMissing.of(),
        @JsonProperty("errors")
        @ExcludeMissing
        errors: JsonField<List<ErrorDetail>> = JsonMissing.of(),
        @JsonProperty("links") @ExcludeMissing links: JsonField<Links> = JsonMissing.of(),
        @JsonProperty("subCategory")
        @ExcludeMissing
        subCategory: JsonField<String> = JsonMissing.of(),
    ) : this(category, correlationId, message, context, errors, links, subCategory, mutableMapOf())

    /**
     * The error category.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun category(): String = category.getRequired("category")

    /**
     * A unique identifier for the request. Include this value with any error reports or support
     * tickets
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun correlationId(): String = correlationId.getRequired("correlationId")

    /**
     * A human readable message describing the error along with remediation steps where appropriate
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun message(): String = message.getRequired("message")

    /**
     * Context about the error condition
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun context(): Optional<Context> = context.getOptional("context")

    /**
     * further information about the error
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun errors(): Optional<List<ErrorDetail>> = errors.getOptional("errors")

    /**
     * A map of link names to associated URIs containing documentation about the error or
     * recommended remediation steps
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun links(): Optional<Links> = links.getOptional("links")

    /**
     * A specific category that contains more specific detail about the error.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subCategory(): Optional<String> = subCategory.getOptional("subCategory")

    /**
     * Returns the raw JSON value of [category].
     *
     * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<String> = category

    /**
     * Returns the raw JSON value of [correlationId].
     *
     * Unlike [correlationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("correlationId")
    @ExcludeMissing
    fun _correlationId(): JsonField<String> = correlationId

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

    /**
     * Returns the raw JSON value of [context].
     *
     * Unlike [context], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("context") @ExcludeMissing fun _context(): JsonField<Context> = context

    /**
     * Returns the raw JSON value of [errors].
     *
     * Unlike [errors], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("errors") @ExcludeMissing fun _errors(): JsonField<List<ErrorDetail>> = errors

    /**
     * Returns the raw JSON value of [links].
     *
     * Unlike [links], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("links") @ExcludeMissing fun _links(): JsonField<Links> = links

    /**
     * Returns the raw JSON value of [subCategory].
     *
     * Unlike [subCategory], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subCategory") @ExcludeMissing fun _subCategory(): JsonField<String> = subCategory

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
         * Returns a mutable builder for constructing an instance of [Error].
         *
         * The following fields are required:
         * ```java
         * .category()
         * .correlationId()
         * .message()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Error]. */
    class Builder internal constructor() {

        private var category: JsonField<String>? = null
        private var correlationId: JsonField<String>? = null
        private var message: JsonField<String>? = null
        private var context: JsonField<Context> = JsonMissing.of()
        private var errors: JsonField<MutableList<ErrorDetail>>? = null
        private var links: JsonField<Links> = JsonMissing.of()
        private var subCategory: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(error: Error) = apply {
            category = error.category
            correlationId = error.correlationId
            message = error.message
            context = error.context
            errors = error.errors.map { it.toMutableList() }
            links = error.links
            subCategory = error.subCategory
            additionalProperties = error.additionalProperties.toMutableMap()
        }

        /** The error category. */
        fun category(category: String) = category(JsonField.of(category))

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun category(category: JsonField<String>) = apply { this.category = category }

        /**
         * A unique identifier for the request. Include this value with any error reports or support
         * tickets
         */
        fun correlationId(correlationId: String) = correlationId(JsonField.of(correlationId))

        /**
         * Sets [Builder.correlationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.correlationId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun correlationId(correlationId: JsonField<String>) = apply {
            this.correlationId = correlationId
        }

        /**
         * A human readable message describing the error along with remediation steps where
         * appropriate
         */
        fun message(message: String) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

        /** Context about the error condition */
        fun context(context: Context) = context(JsonField.of(context))

        /**
         * Sets [Builder.context] to an arbitrary JSON value.
         *
         * You should usually call [Builder.context] with a well-typed [Context] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun context(context: JsonField<Context>) = apply { this.context = context }

        /** further information about the error */
        fun errors(errors: List<ErrorDetail>) = errors(JsonField.of(errors))

        /**
         * Sets [Builder.errors] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errors] with a well-typed `List<ErrorDetail>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun errors(errors: JsonField<List<ErrorDetail>>) = apply {
            this.errors = errors.map { it.toMutableList() }
        }

        /**
         * Adds a single [ErrorDetail] to [errors].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addError(error: ErrorDetail) = apply {
            errors =
                (errors ?: JsonField.of(mutableListOf())).also {
                    checkKnown("errors", it).add(error)
                }
        }

        /**
         * A map of link names to associated URIs containing documentation about the error or
         * recommended remediation steps
         */
        fun links(links: Links) = links(JsonField.of(links))

        /**
         * Sets [Builder.links] to an arbitrary JSON value.
         *
         * You should usually call [Builder.links] with a well-typed [Links] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun links(links: JsonField<Links>) = apply { this.links = links }

        /** A specific category that contains more specific detail about the error. */
        fun subCategory(subCategory: String) = subCategory(JsonField.of(subCategory))

        /**
         * Sets [Builder.subCategory] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subCategory] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun subCategory(subCategory: JsonField<String>) = apply { this.subCategory = subCategory }

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
         * Returns an immutable instance of [Error].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .category()
         * .correlationId()
         * .message()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Error =
            Error(
                checkRequired("category", category),
                checkRequired("correlationId", correlationId),
                checkRequired("message", message),
                context,
                (errors ?: JsonMissing.of()).map { it.toImmutable() },
                links,
                subCategory,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Error = apply {
        if (validated) {
            return@apply
        }

        category()
        correlationId()
        message()
        context().ifPresent { it.validate() }
        errors().ifPresent { it.forEach { it.validate() } }
        links().ifPresent { it.validate() }
        subCategory()
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
        (if (category.asKnown().isPresent) 1 else 0) +
            (if (correlationId.asKnown().isPresent) 1 else 0) +
            (if (message.asKnown().isPresent) 1 else 0) +
            (context.asKnown().getOrNull()?.validity() ?: 0) +
            (errors.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (links.asKnown().getOrNull()?.validity() ?: 0) +
            (if (subCategory.asKnown().isPresent) 1 else 0)

    /** Context about the error condition */
    class Context
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Context]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Context]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(context: Context) = apply {
                additionalProperties = context.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Context].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Context = Context(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Context = apply {
            if (validated) {
                return@apply
            }

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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Context && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Context{additionalProperties=$additionalProperties}"
    }

    /**
     * A map of link names to associated URIs containing documentation about the error or
     * recommended remediation steps
     */
    class Links
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Links]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Links]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(links: Links) = apply {
                additionalProperties = links.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Links].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Links = Links(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Links = apply {
            if (validated) {
                return@apply
            }

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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Links && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Links{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Error &&
            category == other.category &&
            correlationId == other.correlationId &&
            message == other.message &&
            context == other.context &&
            errors == other.errors &&
            links == other.links &&
            subCategory == other.subCategory &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            category,
            correlationId,
            message,
            context,
            errors,
            links,
            subCategory,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Error{category=$category, correlationId=$correlationId, message=$message, context=$context, errors=$errors, links=$links, subCategory=$subCategory, additionalProperties=$additionalProperties}"
}
