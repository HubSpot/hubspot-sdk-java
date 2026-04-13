// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.sequences

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.Enum
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicTaskPatternResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val taskPriority: JsonField<TaskPriority>,
    private val taskType: JsonField<TaskType>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val notes: JsonField<String>,
    private val queueId: JsonField<Int>,
    private val subject: JsonField<String>,
    private val templateId: JsonField<Long>,
    private val threadEmailToStepOrder: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("taskPriority")
        @ExcludeMissing
        taskPriority: JsonField<TaskPriority> = JsonMissing.of(),
        @JsonProperty("taskType") @ExcludeMissing taskType: JsonField<TaskType> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("queueId") @ExcludeMissing queueId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("subject") @ExcludeMissing subject: JsonField<String> = JsonMissing.of(),
        @JsonProperty("templateId") @ExcludeMissing templateId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("threadEmailToStepOrder")
        @ExcludeMissing
        threadEmailToStepOrder: JsonField<Int> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        taskPriority,
        taskType,
        updatedAt,
        notes,
        queueId,
        subject,
        templateId,
        threadEmailToStepOrder,
        mutableMapOf(),
    )

    /**
     * The unique identifier for the task pattern.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The date and time when the task pattern was created.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * The priority level assigned to the task.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun taskPriority(): TaskPriority = taskPriority.getRequired("taskPriority")

    /**
     * The type of task, such as an email or call.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun taskType(): TaskType = taskType.getRequired("taskType")

    /**
     * The date and time when the task pattern was last updated.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

    /**
     * Additional notes or comments associated with the task.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun notes(): Optional<String> = notes.getOptional("notes")

    /**
     * The identifier for the queue associated with the task.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun queueId(): Optional<Int> = queueId.getOptional("queueId")

    /**
     * The subject line of the task.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subject(): Optional<String> = subject.getOptional("subject")

    /**
     * The identifier for the template used in the task.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun templateId(): Optional<Long> = templateId.getOptional("templateId")

    /**
     * The order of the step to which the email thread is related.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun threadEmailToStepOrder(): Optional<Int> =
        threadEmailToStepOrder.getOptional("threadEmailToStepOrder")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [taskPriority].
     *
     * Unlike [taskPriority], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("taskPriority")
    @ExcludeMissing
    fun _taskPriority(): JsonField<TaskPriority> = taskPriority

    /**
     * Returns the raw JSON value of [taskType].
     *
     * Unlike [taskType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("taskType") @ExcludeMissing fun _taskType(): JsonField<TaskType> = taskType

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [notes].
     *
     * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

    /**
     * Returns the raw JSON value of [queueId].
     *
     * Unlike [queueId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("queueId") @ExcludeMissing fun _queueId(): JsonField<Int> = queueId

    /**
     * Returns the raw JSON value of [subject].
     *
     * Unlike [subject], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subject") @ExcludeMissing fun _subject(): JsonField<String> = subject

    /**
     * Returns the raw JSON value of [templateId].
     *
     * Unlike [templateId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("templateId") @ExcludeMissing fun _templateId(): JsonField<Long> = templateId

    /**
     * Returns the raw JSON value of [threadEmailToStepOrder].
     *
     * Unlike [threadEmailToStepOrder], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("threadEmailToStepOrder")
    @ExcludeMissing
    fun _threadEmailToStepOrder(): JsonField<Int> = threadEmailToStepOrder

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
         * Returns a mutable builder for constructing an instance of [PublicTaskPatternResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .taskPriority()
         * .taskType()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicTaskPatternResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var taskPriority: JsonField<TaskPriority>? = null
        private var taskType: JsonField<TaskType>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var notes: JsonField<String> = JsonMissing.of()
        private var queueId: JsonField<Int> = JsonMissing.of()
        private var subject: JsonField<String> = JsonMissing.of()
        private var templateId: JsonField<Long> = JsonMissing.of()
        private var threadEmailToStepOrder: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicTaskPatternResponse: PublicTaskPatternResponse) = apply {
            id = publicTaskPatternResponse.id
            createdAt = publicTaskPatternResponse.createdAt
            taskPriority = publicTaskPatternResponse.taskPriority
            taskType = publicTaskPatternResponse.taskType
            updatedAt = publicTaskPatternResponse.updatedAt
            notes = publicTaskPatternResponse.notes
            queueId = publicTaskPatternResponse.queueId
            subject = publicTaskPatternResponse.subject
            templateId = publicTaskPatternResponse.templateId
            threadEmailToStepOrder = publicTaskPatternResponse.threadEmailToStepOrder
            additionalProperties = publicTaskPatternResponse.additionalProperties.toMutableMap()
        }

        /** The unique identifier for the task pattern. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The date and time when the task pattern was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The priority level assigned to the task. */
        fun taskPriority(taskPriority: TaskPriority) = taskPriority(JsonField.of(taskPriority))

        /**
         * Sets [Builder.taskPriority] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taskPriority] with a well-typed [TaskPriority] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun taskPriority(taskPriority: JsonField<TaskPriority>) = apply {
            this.taskPriority = taskPriority
        }

        /** The type of task, such as an email or call. */
        fun taskType(taskType: TaskType) = taskType(JsonField.of(taskType))

        /**
         * Sets [Builder.taskType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taskType] with a well-typed [TaskType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun taskType(taskType: JsonField<TaskType>) = apply { this.taskType = taskType }

        /** The date and time when the task pattern was last updated. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** Additional notes or comments associated with the task. */
        fun notes(notes: String) = notes(JsonField.of(notes))

        /**
         * Sets [Builder.notes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notes] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun notes(notes: JsonField<String>) = apply { this.notes = notes }

        /** The identifier for the queue associated with the task. */
        fun queueId(queueId: Int) = queueId(JsonField.of(queueId))

        /**
         * Sets [Builder.queueId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.queueId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun queueId(queueId: JsonField<Int>) = apply { this.queueId = queueId }

        /** The subject line of the task. */
        fun subject(subject: String) = subject(JsonField.of(subject))

        /**
         * Sets [Builder.subject] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subject] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun subject(subject: JsonField<String>) = apply { this.subject = subject }

        /** The identifier for the template used in the task. */
        fun templateId(templateId: Long) = templateId(JsonField.of(templateId))

        /**
         * Sets [Builder.templateId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.templateId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun templateId(templateId: JsonField<Long>) = apply { this.templateId = templateId }

        /** The order of the step to which the email thread is related. */
        fun threadEmailToStepOrder(threadEmailToStepOrder: Int) =
            threadEmailToStepOrder(JsonField.of(threadEmailToStepOrder))

        /**
         * Sets [Builder.threadEmailToStepOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.threadEmailToStepOrder] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun threadEmailToStepOrder(threadEmailToStepOrder: JsonField<Int>) = apply {
            this.threadEmailToStepOrder = threadEmailToStepOrder
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
         * Returns an immutable instance of [PublicTaskPatternResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .taskPriority()
         * .taskType()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicTaskPatternResponse =
            PublicTaskPatternResponse(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("taskPriority", taskPriority),
                checkRequired("taskType", taskType),
                checkRequired("updatedAt", updatedAt),
                notes,
                queueId,
                subject,
                templateId,
                threadEmailToStepOrder,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicTaskPatternResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        taskPriority().validate()
        taskType().validate()
        updatedAt()
        notes()
        queueId()
        subject()
        templateId()
        threadEmailToStepOrder()
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
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (taskPriority.asKnown().getOrNull()?.validity() ?: 0) +
            (taskType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (notes.asKnown().isPresent) 1 else 0) +
            (if (queueId.asKnown().isPresent) 1 else 0) +
            (if (subject.asKnown().isPresent) 1 else 0) +
            (if (templateId.asKnown().isPresent) 1 else 0) +
            (if (threadEmailToStepOrder.asKnown().isPresent) 1 else 0)

    /** The priority level assigned to the task. */
    class TaskPriority @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val HIGH = of("HIGH")

            @JvmField val LOW = of("LOW")

            @JvmField val MEDIUM = of("MEDIUM")

            @JvmField val NONE = of("NONE")

            @JvmStatic fun of(value: String) = TaskPriority(JsonField.of(value))
        }

        /** An enum containing [TaskPriority]'s known values. */
        enum class Known {
            HIGH,
            LOW,
            MEDIUM,
            NONE,
        }

        /**
         * An enum containing [TaskPriority]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TaskPriority] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            HIGH,
            LOW,
            MEDIUM,
            NONE,
            /**
             * An enum member indicating that [TaskPriority] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                HIGH -> Value.HIGH
                LOW -> Value.LOW
                MEDIUM -> Value.MEDIUM
                NONE -> Value.NONE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HubSpotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                HIGH -> Known.HIGH
                LOW -> Known.LOW
                MEDIUM -> Known.MEDIUM
                NONE -> Known.NONE
                else -> throw HubSpotInvalidDataException("Unknown TaskPriority: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HubSpotInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { HubSpotInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): TaskPriority = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TaskPriority && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The type of task, such as an email or call. */
    class TaskType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val CALL = of("CALL")

            @JvmField val EMAIL = of("EMAIL")

            @JvmField val LINKED_IN_CONNECT = of("LINKED_IN_CONNECT")

            @JvmField val LINKED_IN_MESSAGE = of("LINKED_IN_MESSAGE")

            @JvmField val MEETING = of("MEETING")

            @JvmField val TODO = of("TODO")

            @JvmStatic fun of(value: String) = TaskType(JsonField.of(value))
        }

        /** An enum containing [TaskType]'s known values. */
        enum class Known {
            CALL,
            EMAIL,
            LINKED_IN_CONNECT,
            LINKED_IN_MESSAGE,
            MEETING,
            TODO,
        }

        /**
         * An enum containing [TaskType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TaskType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CALL,
            EMAIL,
            LINKED_IN_CONNECT,
            LINKED_IN_MESSAGE,
            MEETING,
            TODO,
            /** An enum member indicating that [TaskType] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                CALL -> Value.CALL
                EMAIL -> Value.EMAIL
                LINKED_IN_CONNECT -> Value.LINKED_IN_CONNECT
                LINKED_IN_MESSAGE -> Value.LINKED_IN_MESSAGE
                MEETING -> Value.MEETING
                TODO -> Value.TODO
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HubSpotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                CALL -> Known.CALL
                EMAIL -> Known.EMAIL
                LINKED_IN_CONNECT -> Known.LINKED_IN_CONNECT
                LINKED_IN_MESSAGE -> Known.LINKED_IN_MESSAGE
                MEETING -> Known.MEETING
                TODO -> Known.TODO
                else -> throw HubSpotInvalidDataException("Unknown TaskType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HubSpotInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { HubSpotInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): TaskType = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TaskType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicTaskPatternResponse &&
            id == other.id &&
            createdAt == other.createdAt &&
            taskPriority == other.taskPriority &&
            taskType == other.taskType &&
            updatedAt == other.updatedAt &&
            notes == other.notes &&
            queueId == other.queueId &&
            subject == other.subject &&
            templateId == other.templateId &&
            threadEmailToStepOrder == other.threadEmailToStepOrder &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            taskPriority,
            taskType,
            updatedAt,
            notes,
            queueId,
            subject,
            templateId,
            threadEmailToStepOrder,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicTaskPatternResponse{id=$id, createdAt=$createdAt, taskPriority=$taskPriority, taskType=$taskType, updatedAt=$updatedAt, notes=$notes, queueId=$queueId, subject=$subject, templateId=$templateId, threadEmailToStepOrder=$threadEmailToStepOrder, additionalProperties=$additionalProperties}"
}
