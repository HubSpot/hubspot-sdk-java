// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.extensions.cardsdev

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

class ActionConfirmationBody
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val cancelButtonLabel: JsonField<String>,
    private val confirmButtonLabel: JsonField<String>,
    private val prompt: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("cancelButtonLabel")
        @ExcludeMissing
        cancelButtonLabel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("confirmButtonLabel")
        @ExcludeMissing
        confirmButtonLabel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prompt") @ExcludeMissing prompt: JsonField<String> = JsonMissing.of(),
    ) : this(cancelButtonLabel, confirmButtonLabel, prompt, mutableMapOf())

    /**
     * The label for the button that cancels the action.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cancelButtonLabel(): String = cancelButtonLabel.getRequired("cancelButtonLabel")

    /**
     * The label for the button that confirms the action.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun confirmButtonLabel(): String = confirmButtonLabel.getRequired("confirmButtonLabel")

    /**
     * The message displayed to the user to confirm the action.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun prompt(): String = prompt.getRequired("prompt")

    /**
     * Returns the raw JSON value of [cancelButtonLabel].
     *
     * Unlike [cancelButtonLabel], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("cancelButtonLabel")
    @ExcludeMissing
    fun _cancelButtonLabel(): JsonField<String> = cancelButtonLabel

    /**
     * Returns the raw JSON value of [confirmButtonLabel].
     *
     * Unlike [confirmButtonLabel], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("confirmButtonLabel")
    @ExcludeMissing
    fun _confirmButtonLabel(): JsonField<String> = confirmButtonLabel

    /**
     * Returns the raw JSON value of [prompt].
     *
     * Unlike [prompt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prompt") @ExcludeMissing fun _prompt(): JsonField<String> = prompt

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
         * Returns a mutable builder for constructing an instance of [ActionConfirmationBody].
         *
         * The following fields are required:
         * ```java
         * .cancelButtonLabel()
         * .confirmButtonLabel()
         * .prompt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionConfirmationBody]. */
    class Builder internal constructor() {

        private var cancelButtonLabel: JsonField<String>? = null
        private var confirmButtonLabel: JsonField<String>? = null
        private var prompt: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(actionConfirmationBody: ActionConfirmationBody) = apply {
            cancelButtonLabel = actionConfirmationBody.cancelButtonLabel
            confirmButtonLabel = actionConfirmationBody.confirmButtonLabel
            prompt = actionConfirmationBody.prompt
            additionalProperties = actionConfirmationBody.additionalProperties.toMutableMap()
        }

        /** The label for the button that cancels the action. */
        fun cancelButtonLabel(cancelButtonLabel: String) =
            cancelButtonLabel(JsonField.of(cancelButtonLabel))

        /**
         * Sets [Builder.cancelButtonLabel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cancelButtonLabel] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cancelButtonLabel(cancelButtonLabel: JsonField<String>) = apply {
            this.cancelButtonLabel = cancelButtonLabel
        }

        /** The label for the button that confirms the action. */
        fun confirmButtonLabel(confirmButtonLabel: String) =
            confirmButtonLabel(JsonField.of(confirmButtonLabel))

        /**
         * Sets [Builder.confirmButtonLabel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.confirmButtonLabel] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun confirmButtonLabel(confirmButtonLabel: JsonField<String>) = apply {
            this.confirmButtonLabel = confirmButtonLabel
        }

        /** The message displayed to the user to confirm the action. */
        fun prompt(prompt: String) = prompt(JsonField.of(prompt))

        /**
         * Sets [Builder.prompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prompt] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun prompt(prompt: JsonField<String>) = apply { this.prompt = prompt }

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
         * Returns an immutable instance of [ActionConfirmationBody].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .cancelButtonLabel()
         * .confirmButtonLabel()
         * .prompt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ActionConfirmationBody =
            ActionConfirmationBody(
                checkRequired("cancelButtonLabel", cancelButtonLabel),
                checkRequired("confirmButtonLabel", confirmButtonLabel),
                checkRequired("prompt", prompt),
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
    fun validate(): ActionConfirmationBody = apply {
        if (validated) {
            return@apply
        }

        cancelButtonLabel()
        confirmButtonLabel()
        prompt()
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
        (if (cancelButtonLabel.asKnown().isPresent) 1 else 0) +
            (if (confirmButtonLabel.asKnown().isPresent) 1 else 0) +
            (if (prompt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionConfirmationBody &&
            cancelButtonLabel == other.cancelButtonLabel &&
            confirmButtonLabel == other.confirmButtonLabel &&
            prompt == other.prompt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(cancelButtonLabel, confirmButtonLabel, prompt, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ActionConfirmationBody{cancelButtonLabel=$cancelButtonLabel, confirmButtonLabel=$confirmButtonLabel, prompt=$prompt, additionalProperties=$additionalProperties}"
}
