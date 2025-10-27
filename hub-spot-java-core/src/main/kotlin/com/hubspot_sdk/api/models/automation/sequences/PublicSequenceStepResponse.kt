// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.sequences

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicSequenceStepResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val actionType: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val delayMillis: JsonField<Int>,
    private val stepOrder: JsonField<Int>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val emailPattern: JsonField<PublicEmailPatternResponse>,
    private val taskPattern: JsonField<PublicTaskPatternResponse>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("actionType")
        @ExcludeMissing
        actionType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("delayMillis") @ExcludeMissing delayMillis: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("stepOrder") @ExcludeMissing stepOrder: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("emailPattern")
        @ExcludeMissing
        emailPattern: JsonField<PublicEmailPatternResponse> = JsonMissing.of(),
        @JsonProperty("taskPattern")
        @ExcludeMissing
        taskPattern: JsonField<PublicTaskPatternResponse> = JsonMissing.of(),
    ) : this(
        id,
        actionType,
        createdAt,
        delayMillis,
        stepOrder,
        updatedAt,
        emailPattern,
        taskPattern,
        mutableMapOf(),
    )

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun actionType(): String = actionType.getRequired("actionType")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun delayMillis(): Int = delayMillis.getRequired("delayMillis")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun stepOrder(): Int = stepOrder.getRequired("stepOrder")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun emailPattern(): Optional<PublicEmailPatternResponse> =
        emailPattern.getOptional("emailPattern")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun taskPattern(): Optional<PublicTaskPatternResponse> = taskPattern.getOptional("taskPattern")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [actionType].
     *
     * Unlike [actionType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actionType") @ExcludeMissing fun _actionType(): JsonField<String> = actionType

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [delayMillis].
     *
     * Unlike [delayMillis], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("delayMillis") @ExcludeMissing fun _delayMillis(): JsonField<Int> = delayMillis

    /**
     * Returns the raw JSON value of [stepOrder].
     *
     * Unlike [stepOrder], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stepOrder") @ExcludeMissing fun _stepOrder(): JsonField<Int> = stepOrder

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [emailPattern].
     *
     * Unlike [emailPattern], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("emailPattern")
    @ExcludeMissing
    fun _emailPattern(): JsonField<PublicEmailPatternResponse> = emailPattern

    /**
     * Returns the raw JSON value of [taskPattern].
     *
     * Unlike [taskPattern], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("taskPattern")
    @ExcludeMissing
    fun _taskPattern(): JsonField<PublicTaskPatternResponse> = taskPattern

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
         * Returns a mutable builder for constructing an instance of [PublicSequenceStepResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .actionType()
         * .createdAt()
         * .delayMillis()
         * .stepOrder()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicSequenceStepResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var actionType: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var delayMillis: JsonField<Int>? = null
        private var stepOrder: JsonField<Int>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var emailPattern: JsonField<PublicEmailPatternResponse> = JsonMissing.of()
        private var taskPattern: JsonField<PublicTaskPatternResponse> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicSequenceStepResponse: PublicSequenceStepResponse) = apply {
            id = publicSequenceStepResponse.id
            actionType = publicSequenceStepResponse.actionType
            createdAt = publicSequenceStepResponse.createdAt
            delayMillis = publicSequenceStepResponse.delayMillis
            stepOrder = publicSequenceStepResponse.stepOrder
            updatedAt = publicSequenceStepResponse.updatedAt
            emailPattern = publicSequenceStepResponse.emailPattern
            taskPattern = publicSequenceStepResponse.taskPattern
            additionalProperties = publicSequenceStepResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun actionType(actionType: String) = actionType(JsonField.of(actionType))

        /**
         * Sets [Builder.actionType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actionType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun actionType(actionType: JsonField<String>) = apply { this.actionType = actionType }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun delayMillis(delayMillis: Int) = delayMillis(JsonField.of(delayMillis))

        /**
         * Sets [Builder.delayMillis] to an arbitrary JSON value.
         *
         * You should usually call [Builder.delayMillis] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun delayMillis(delayMillis: JsonField<Int>) = apply { this.delayMillis = delayMillis }

        fun stepOrder(stepOrder: Int) = stepOrder(JsonField.of(stepOrder))

        /**
         * Sets [Builder.stepOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stepOrder] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun stepOrder(stepOrder: JsonField<Int>) = apply { this.stepOrder = stepOrder }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun emailPattern(emailPattern: PublicEmailPatternResponse) =
            emailPattern(JsonField.of(emailPattern))

        /**
         * Sets [Builder.emailPattern] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emailPattern] with a well-typed
         * [PublicEmailPatternResponse] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun emailPattern(emailPattern: JsonField<PublicEmailPatternResponse>) = apply {
            this.emailPattern = emailPattern
        }

        fun taskPattern(taskPattern: PublicTaskPatternResponse) =
            taskPattern(JsonField.of(taskPattern))

        /**
         * Sets [Builder.taskPattern] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taskPattern] with a well-typed
         * [PublicTaskPatternResponse] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun taskPattern(taskPattern: JsonField<PublicTaskPatternResponse>) = apply {
            this.taskPattern = taskPattern
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
         * Returns an immutable instance of [PublicSequenceStepResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .actionType()
         * .createdAt()
         * .delayMillis()
         * .stepOrder()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicSequenceStepResponse =
            PublicSequenceStepResponse(
                checkRequired("id", id),
                checkRequired("actionType", actionType),
                checkRequired("createdAt", createdAt),
                checkRequired("delayMillis", delayMillis),
                checkRequired("stepOrder", stepOrder),
                checkRequired("updatedAt", updatedAt),
                emailPattern,
                taskPattern,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicSequenceStepResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        actionType()
        createdAt()
        delayMillis()
        stepOrder()
        updatedAt()
        emailPattern().ifPresent { it.validate() }
        taskPattern().ifPresent { it.validate() }
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
            (if (actionType.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (delayMillis.asKnown().isPresent) 1 else 0) +
            (if (stepOrder.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (emailPattern.asKnown().getOrNull()?.validity() ?: 0) +
            (taskPattern.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicSequenceStepResponse &&
            id == other.id &&
            actionType == other.actionType &&
            createdAt == other.createdAt &&
            delayMillis == other.delayMillis &&
            stepOrder == other.stepOrder &&
            updatedAt == other.updatedAt &&
            emailPattern == other.emailPattern &&
            taskPattern == other.taskPattern &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            actionType,
            createdAt,
            delayMillis,
            stepOrder,
            updatedAt,
            emailPattern,
            taskPattern,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicSequenceStepResponse{id=$id, actionType=$actionType, createdAt=$createdAt, delayMillis=$delayMillis, stepOrder=$stepOrder, updatedAt=$updatedAt, emailPattern=$emailPattern, taskPattern=$taskPattern, additionalProperties=$additionalProperties}"
}
