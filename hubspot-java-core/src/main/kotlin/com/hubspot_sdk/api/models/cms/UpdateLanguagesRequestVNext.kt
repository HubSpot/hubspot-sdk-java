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
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** Request object for updating languages within a multi-language group. */
class UpdateLanguagesRequestVNext
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val languages: JsonField<Languages>,
    private val primaryId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("languages")
        @ExcludeMissing
        languages: JsonField<Languages> = JsonMissing.of(),
        @JsonProperty("primaryId") @ExcludeMissing primaryId: JsonField<String> = JsonMissing.of(),
    ) : this(languages, primaryId, mutableMapOf())

    /**
     * Map of object IDs to associated languages of object in the multi-language group.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun languages(): Languages = languages.getRequired("languages")

    /**
     * ID of the primary object in the multi-language group.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun primaryId(): String = primaryId.getRequired("primaryId")

    /**
     * Returns the raw JSON value of [languages].
     *
     * Unlike [languages], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("languages") @ExcludeMissing fun _languages(): JsonField<Languages> = languages

    /**
     * Returns the raw JSON value of [primaryId].
     *
     * Unlike [primaryId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("primaryId") @ExcludeMissing fun _primaryId(): JsonField<String> = primaryId

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
         * Returns a mutable builder for constructing an instance of [UpdateLanguagesRequestVNext].
         *
         * The following fields are required:
         * ```java
         * .languages()
         * .primaryId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UpdateLanguagesRequestVNext]. */
    class Builder internal constructor() {

        private var languages: JsonField<Languages>? = null
        private var primaryId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(updateLanguagesRequestVNext: UpdateLanguagesRequestVNext) = apply {
            languages = updateLanguagesRequestVNext.languages
            primaryId = updateLanguagesRequestVNext.primaryId
            additionalProperties = updateLanguagesRequestVNext.additionalProperties.toMutableMap()
        }

        /** Map of object IDs to associated languages of object in the multi-language group. */
        fun languages(languages: Languages) = languages(JsonField.of(languages))

        /**
         * Sets [Builder.languages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.languages] with a well-typed [Languages] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun languages(languages: JsonField<Languages>) = apply { this.languages = languages }

        /** ID of the primary object in the multi-language group. */
        fun primaryId(primaryId: String) = primaryId(JsonField.of(primaryId))

        /**
         * Sets [Builder.primaryId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun primaryId(primaryId: JsonField<String>) = apply { this.primaryId = primaryId }

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
         * Returns an immutable instance of [UpdateLanguagesRequestVNext].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .languages()
         * .primaryId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UpdateLanguagesRequestVNext =
            UpdateLanguagesRequestVNext(
                checkRequired("languages", languages),
                checkRequired("primaryId", primaryId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UpdateLanguagesRequestVNext = apply {
        if (validated) {
            return@apply
        }

        languages().validate()
        primaryId()
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
        (languages.asKnown().getOrNull()?.validity() ?: 0) +
            (if (primaryId.asKnown().isPresent) 1 else 0)

    /** Map of object IDs to associated languages of object in the multi-language group. */
    class Languages
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

            /** Returns a mutable builder for constructing an instance of [Languages]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Languages]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(languages: Languages) = apply {
                additionalProperties = languages.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Languages].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Languages = Languages(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Languages = apply {
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

            return other is Languages && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Languages{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UpdateLanguagesRequestVNext &&
            languages == other.languages &&
            primaryId == other.primaryId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(languages, primaryId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UpdateLanguagesRequestVNext{languages=$languages, primaryId=$primaryId, additionalProperties=$additionalProperties}"
}
