// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.conversations.customchannels

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.toImmutable
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicMessageFailureDetails
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val errorMessageTokens: JsonField<ErrorMessageTokens>,
    private val errorMessage: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("errorMessageTokens")
        @ExcludeMissing
        errorMessageTokens: JsonField<ErrorMessageTokens> = JsonMissing.of(),
        @JsonProperty("errorMessage")
        @ExcludeMissing
        errorMessage: JsonField<String> = JsonMissing.of(),
    ) : this(errorMessageTokens, errorMessage, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun errorMessageTokens(): ErrorMessageTokens =
        errorMessageTokens.getRequired("errorMessageTokens")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun errorMessage(): Optional<String> = errorMessage.getOptional("errorMessage")

    /**
     * Returns the raw JSON value of [errorMessageTokens].
     *
     * Unlike [errorMessageTokens], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("errorMessageTokens")
    @ExcludeMissing
    fun _errorMessageTokens(): JsonField<ErrorMessageTokens> = errorMessageTokens

    /**
     * Returns the raw JSON value of [errorMessage].
     *
     * Unlike [errorMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("errorMessage")
    @ExcludeMissing
    fun _errorMessage(): JsonField<String> = errorMessage

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
         * Returns a mutable builder for constructing an instance of [PublicMessageFailureDetails].
         *
         * The following fields are required:
         * ```java
         * .errorMessageTokens()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicMessageFailureDetails]. */
    class Builder internal constructor() {

        private var errorMessageTokens: JsonField<ErrorMessageTokens>? = null
        private var errorMessage: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicMessageFailureDetails: PublicMessageFailureDetails) = apply {
            errorMessageTokens = publicMessageFailureDetails.errorMessageTokens
            errorMessage = publicMessageFailureDetails.errorMessage
            additionalProperties = publicMessageFailureDetails.additionalProperties.toMutableMap()
        }

        fun errorMessageTokens(errorMessageTokens: ErrorMessageTokens) =
            errorMessageTokens(JsonField.of(errorMessageTokens))

        /**
         * Sets [Builder.errorMessageTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errorMessageTokens] with a well-typed
         * [ErrorMessageTokens] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun errorMessageTokens(errorMessageTokens: JsonField<ErrorMessageTokens>) = apply {
            this.errorMessageTokens = errorMessageTokens
        }

        fun errorMessage(errorMessage: String) = errorMessage(JsonField.of(errorMessage))

        /**
         * Sets [Builder.errorMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errorMessage] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun errorMessage(errorMessage: JsonField<String>) = apply {
            this.errorMessage = errorMessage
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
         * Returns an immutable instance of [PublicMessageFailureDetails].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .errorMessageTokens()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicMessageFailureDetails =
            PublicMessageFailureDetails(
                checkRequired("errorMessageTokens", errorMessageTokens),
                errorMessage,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicMessageFailureDetails = apply {
        if (validated) {
            return@apply
        }

        errorMessageTokens().validate()
        errorMessage()
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
        (errorMessageTokens.asKnown().getOrNull()?.validity() ?: 0) +
            (if (errorMessage.asKnown().isPresent) 1 else 0)

    class ErrorMessageTokens
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

            /** Returns a mutable builder for constructing an instance of [ErrorMessageTokens]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ErrorMessageTokens]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(errorMessageTokens: ErrorMessageTokens) = apply {
                additionalProperties = errorMessageTokens.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ErrorMessageTokens].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ErrorMessageTokens = ErrorMessageTokens(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): ErrorMessageTokens = apply {
            if (validated) {
                return@apply
            }

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

            return other is ErrorMessageTokens && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ErrorMessageTokens{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicMessageFailureDetails &&
            errorMessageTokens == other.errorMessageTokens &&
            errorMessage == other.errorMessage &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(errorMessageTokens, errorMessage, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicMessageFailureDetails{errorMessageTokens=$errorMessageTokens, errorMessage=$errorMessage, additionalProperties=$additionalProperties}"
}
