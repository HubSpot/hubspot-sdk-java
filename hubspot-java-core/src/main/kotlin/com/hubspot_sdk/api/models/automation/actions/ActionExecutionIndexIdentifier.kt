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
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects

class ActionExecutionIndexIdentifier
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val actionExecutionIndex: JsonField<Int>,
    private val enrollmentId: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("actionExecutionIndex")
        @ExcludeMissing
        actionExecutionIndex: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("enrollmentId")
        @ExcludeMissing
        enrollmentId: JsonField<Int> = JsonMissing.of(),
    ) : this(actionExecutionIndex, enrollmentId, mutableMapOf())

    /**
     * The index number representing the execution order of the action.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun actionExecutionIndex(): Int = actionExecutionIndex.getRequired("actionExecutionIndex")

    /**
     * The ID associated with the enrollment process.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun enrollmentId(): Int = enrollmentId.getRequired("enrollmentId")

    /**
     * Returns the raw JSON value of [actionExecutionIndex].
     *
     * Unlike [actionExecutionIndex], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("actionExecutionIndex")
    @ExcludeMissing
    fun _actionExecutionIndex(): JsonField<Int> = actionExecutionIndex

    /**
     * Returns the raw JSON value of [enrollmentId].
     *
     * Unlike [enrollmentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enrollmentId") @ExcludeMissing fun _enrollmentId(): JsonField<Int> = enrollmentId

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
         * [ActionExecutionIndexIdentifier].
         *
         * The following fields are required:
         * ```java
         * .actionExecutionIndex()
         * .enrollmentId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionExecutionIndexIdentifier]. */
    class Builder internal constructor() {

        private var actionExecutionIndex: JsonField<Int>? = null
        private var enrollmentId: JsonField<Int>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(actionExecutionIndexIdentifier: ActionExecutionIndexIdentifier) = apply {
            actionExecutionIndex = actionExecutionIndexIdentifier.actionExecutionIndex
            enrollmentId = actionExecutionIndexIdentifier.enrollmentId
            additionalProperties =
                actionExecutionIndexIdentifier.additionalProperties.toMutableMap()
        }

        /** The index number representing the execution order of the action. */
        fun actionExecutionIndex(actionExecutionIndex: Int) =
            actionExecutionIndex(JsonField.of(actionExecutionIndex))

        /**
         * Sets [Builder.actionExecutionIndex] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actionExecutionIndex] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun actionExecutionIndex(actionExecutionIndex: JsonField<Int>) = apply {
            this.actionExecutionIndex = actionExecutionIndex
        }

        /** The ID associated with the enrollment process. */
        fun enrollmentId(enrollmentId: Int) = enrollmentId(JsonField.of(enrollmentId))

        /**
         * Sets [Builder.enrollmentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enrollmentId] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun enrollmentId(enrollmentId: JsonField<Int>) = apply { this.enrollmentId = enrollmentId }

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
         * Returns an immutable instance of [ActionExecutionIndexIdentifier].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .actionExecutionIndex()
         * .enrollmentId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ActionExecutionIndexIdentifier =
            ActionExecutionIndexIdentifier(
                checkRequired("actionExecutionIndex", actionExecutionIndex),
                checkRequired("enrollmentId", enrollmentId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ActionExecutionIndexIdentifier = apply {
        if (validated) {
            return@apply
        }

        actionExecutionIndex()
        enrollmentId()
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
        (if (actionExecutionIndex.asKnown().isPresent) 1 else 0) +
            (if (enrollmentId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionExecutionIndexIdentifier &&
            actionExecutionIndex == other.actionExecutionIndex &&
            enrollmentId == other.enrollmentId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(actionExecutionIndex, enrollmentId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ActionExecutionIndexIdentifier{actionExecutionIndex=$actionExecutionIndex, enrollmentId=$enrollmentId, additionalProperties=$additionalProperties}"
}
