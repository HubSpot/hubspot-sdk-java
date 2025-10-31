// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.emails

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Data structure representing lists of IDs that should be included and excluded. */
class PublicEmailRecipients
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val exclude: JsonField<List<String>>,
    private val include: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("exclude")
        @ExcludeMissing
        exclude: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("include") @ExcludeMissing include: JsonField<List<String>> = JsonMissing.of(),
    ) : this(exclude, include, mutableMapOf())

    /**
     * Excluded IDs.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun exclude(): Optional<List<String>> = exclude.getOptional("exclude")

    /**
     * Included IDs.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun include(): Optional<List<String>> = include.getOptional("include")

    /**
     * Returns the raw JSON value of [exclude].
     *
     * Unlike [exclude], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("exclude") @ExcludeMissing fun _exclude(): JsonField<List<String>> = exclude

    /**
     * Returns the raw JSON value of [include].
     *
     * Unlike [include], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("include") @ExcludeMissing fun _include(): JsonField<List<String>> = include

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

        /** Returns a mutable builder for constructing an instance of [PublicEmailRecipients]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicEmailRecipients]. */
    class Builder internal constructor() {

        private var exclude: JsonField<MutableList<String>>? = null
        private var include: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicEmailRecipients: PublicEmailRecipients) = apply {
            exclude = publicEmailRecipients.exclude.map { it.toMutableList() }
            include = publicEmailRecipients.include.map { it.toMutableList() }
            additionalProperties = publicEmailRecipients.additionalProperties.toMutableMap()
        }

        /** Excluded IDs. */
        fun exclude(exclude: List<String>) = exclude(JsonField.of(exclude))

        /**
         * Sets [Builder.exclude] to an arbitrary JSON value.
         *
         * You should usually call [Builder.exclude] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun exclude(exclude: JsonField<List<String>>) = apply {
            this.exclude = exclude.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.exclude].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExclude(exclude: String) = apply {
            this.exclude =
                (this.exclude ?: JsonField.of(mutableListOf())).also {
                    checkKnown("exclude", it).add(exclude)
                }
        }

        /** Included IDs. */
        fun include(include: List<String>) = include(JsonField.of(include))

        /**
         * Sets [Builder.include] to an arbitrary JSON value.
         *
         * You should usually call [Builder.include] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun include(include: JsonField<List<String>>) = apply {
            this.include = include.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.include].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInclude(include: String) = apply {
            this.include =
                (this.include ?: JsonField.of(mutableListOf())).also {
                    checkKnown("include", it).add(include)
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
         * Returns an immutable instance of [PublicEmailRecipients].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PublicEmailRecipients =
            PublicEmailRecipients(
                (exclude ?: JsonMissing.of()).map { it.toImmutable() },
                (include ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicEmailRecipients = apply {
        if (validated) {
            return@apply
        }

        exclude()
        include()
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
        (exclude.asKnown().getOrNull()?.size ?: 0) + (include.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicEmailRecipients &&
            exclude == other.exclude &&
            include == other.include &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(exclude, include, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicEmailRecipients{exclude=$exclude, include=$include, additionalProperties=$additionalProperties}"
}
