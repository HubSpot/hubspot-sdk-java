// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.communicationpreferences

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

class PublicSubscriptionTranslation
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val createdAt: JsonField<Long>,
    private val description: JsonField<String>,
    private val languageCode: JsonField<String>,
    private val name: JsonField<String>,
    private val subscriptionId: JsonField<Long>,
    private val updatedAt: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("createdAt") @ExcludeMissing createdAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("languageCode")
        @ExcludeMissing
        languageCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("subscriptionId")
        @ExcludeMissing
        subscriptionId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("updatedAt") @ExcludeMissing updatedAt: JsonField<Long> = JsonMissing.of(),
    ) : this(createdAt, description, languageCode, name, subscriptionId, updatedAt, mutableMapOf())

    /**
     * The timestamp indicating when the subscription translation was created.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): Long = createdAt.getRequired("createdAt")

    /**
     * A text description of the subscription translation.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = description.getRequired("description")

    /**
     * The code representing the language of the subscription translation.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun languageCode(): String = languageCode.getRequired("languageCode")

    /**
     * The name of the subscription translation.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * The unique identifier for the subscription associated with the translation.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriptionId(): Long = subscriptionId.getRequired("subscriptionId")

    /**
     * The timestamp indicating when the subscription translation was last updated.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): Long = updatedAt.getRequired("updatedAt")

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt") @ExcludeMissing fun _createdAt(): JsonField<Long> = createdAt

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [languageCode].
     *
     * Unlike [languageCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("languageCode")
    @ExcludeMissing
    fun _languageCode(): JsonField<String> = languageCode

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [subscriptionId].
     *
     * Unlike [subscriptionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subscriptionId")
    @ExcludeMissing
    fun _subscriptionId(): JsonField<Long> = subscriptionId

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt") @ExcludeMissing fun _updatedAt(): JsonField<Long> = updatedAt

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
         * [PublicSubscriptionTranslation].
         *
         * The following fields are required:
         * ```java
         * .createdAt()
         * .description()
         * .languageCode()
         * .name()
         * .subscriptionId()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicSubscriptionTranslation]. */
    class Builder internal constructor() {

        private var createdAt: JsonField<Long>? = null
        private var description: JsonField<String>? = null
        private var languageCode: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var subscriptionId: JsonField<Long>? = null
        private var updatedAt: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicSubscriptionTranslation: PublicSubscriptionTranslation) = apply {
            createdAt = publicSubscriptionTranslation.createdAt
            description = publicSubscriptionTranslation.description
            languageCode = publicSubscriptionTranslation.languageCode
            name = publicSubscriptionTranslation.name
            subscriptionId = publicSubscriptionTranslation.subscriptionId
            updatedAt = publicSubscriptionTranslation.updatedAt
            additionalProperties = publicSubscriptionTranslation.additionalProperties.toMutableMap()
        }

        /** The timestamp indicating when the subscription translation was created. */
        fun createdAt(createdAt: Long) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun createdAt(createdAt: JsonField<Long>) = apply { this.createdAt = createdAt }

        /** A text description of the subscription translation. */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The code representing the language of the subscription translation. */
        fun languageCode(languageCode: String) = languageCode(JsonField.of(languageCode))

        /**
         * Sets [Builder.languageCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.languageCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun languageCode(languageCode: JsonField<String>) = apply {
            this.languageCode = languageCode
        }

        /** The name of the subscription translation. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The unique identifier for the subscription associated with the translation. */
        fun subscriptionId(subscriptionId: Long) = subscriptionId(JsonField.of(subscriptionId))

        /**
         * Sets [Builder.subscriptionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionId] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun subscriptionId(subscriptionId: JsonField<Long>) = apply {
            this.subscriptionId = subscriptionId
        }

        /** The timestamp indicating when the subscription translation was last updated. */
        fun updatedAt(updatedAt: Long) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun updatedAt(updatedAt: JsonField<Long>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [PublicSubscriptionTranslation].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .createdAt()
         * .description()
         * .languageCode()
         * .name()
         * .subscriptionId()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicSubscriptionTranslation =
            PublicSubscriptionTranslation(
                checkRequired("createdAt", createdAt),
                checkRequired("description", description),
                checkRequired("languageCode", languageCode),
                checkRequired("name", name),
                checkRequired("subscriptionId", subscriptionId),
                checkRequired("updatedAt", updatedAt),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicSubscriptionTranslation = apply {
        if (validated) {
            return@apply
        }

        createdAt()
        description()
        languageCode()
        name()
        subscriptionId()
        updatedAt()
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
        (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (languageCode.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (subscriptionId.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicSubscriptionTranslation &&
            createdAt == other.createdAt &&
            description == other.description &&
            languageCode == other.languageCode &&
            name == other.name &&
            subscriptionId == other.subscriptionId &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            createdAt,
            description,
            languageCode,
            name,
            subscriptionId,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicSubscriptionTranslation{createdAt=$createdAt, description=$description, languageCode=$languageCode, name=$name, subscriptionId=$subscriptionId, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
