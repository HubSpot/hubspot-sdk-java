// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.actions

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

class CallbackCompletionRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val outputFields: JsonField<OutputFields>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("outputFields")
        @ExcludeMissing
        outputFields: JsonField<OutputFields> = JsonMissing.of()
    ) : this(outputFields, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun outputFields(): OutputFields = outputFields.getRequired("outputFields")

    /**
     * Returns the raw JSON value of [outputFields].
     *
     * Unlike [outputFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("outputFields")
    @ExcludeMissing
    fun _outputFields(): JsonField<OutputFields> = outputFields

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
         * Returns a mutable builder for constructing an instance of [CallbackCompletionRequest].
         *
         * The following fields are required:
         * ```java
         * .outputFields()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CallbackCompletionRequest]. */
    class Builder internal constructor() {

        private var outputFields: JsonField<OutputFields>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(callbackCompletionRequest: CallbackCompletionRequest) = apply {
            outputFields = callbackCompletionRequest.outputFields
            additionalProperties = callbackCompletionRequest.additionalProperties.toMutableMap()
        }

        fun outputFields(outputFields: OutputFields) = outputFields(JsonField.of(outputFields))

        /**
         * Sets [Builder.outputFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outputFields] with a well-typed [OutputFields] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun outputFields(outputFields: JsonField<OutputFields>) = apply {
            this.outputFields = outputFields
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
         * Returns an immutable instance of [CallbackCompletionRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .outputFields()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CallbackCompletionRequest =
            CallbackCompletionRequest(
                checkRequired("outputFields", outputFields),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CallbackCompletionRequest = apply {
        if (validated) {
            return@apply
        }

        outputFields().validate()
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
    internal fun validity(): Int = (outputFields.asKnown().getOrNull()?.validity() ?: 0)

    class OutputFields
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

            /** Returns a mutable builder for constructing an instance of [OutputFields]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [OutputFields]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(outputFields: OutputFields) = apply {
                additionalProperties = outputFields.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [OutputFields].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): OutputFields = OutputFields(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): OutputFields = apply {
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

            return other is OutputFields && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "OutputFields{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CallbackCompletionRequest &&
            outputFields == other.outputFields &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(outputFields, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CallbackCompletionRequest{outputFields=$outputFields, additionalProperties=$additionalProperties}"
}
