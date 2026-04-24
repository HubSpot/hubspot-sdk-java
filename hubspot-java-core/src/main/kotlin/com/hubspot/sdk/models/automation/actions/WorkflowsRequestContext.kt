// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.actions

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class WorkflowsRequestContext
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val source: JsonField<Source>,
    private val workflowId: JsonField<Long>,
    private val actionExecutionIndexIdentifier: JsonField<ActionExecutionIndexIdentifier>,
    private val actionId: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("source") @ExcludeMissing source: JsonField<Source> = JsonMissing.of(),
        @JsonProperty("workflowId") @ExcludeMissing workflowId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("actionExecutionIndexIdentifier")
        @ExcludeMissing
        actionExecutionIndexIdentifier: JsonField<ActionExecutionIndexIdentifier> =
            JsonMissing.of(),
        @JsonProperty("actionId") @ExcludeMissing actionId: JsonField<Long> = JsonMissing.of(),
    ) : this(source, workflowId, actionExecutionIndexIdentifier, actionId, mutableMapOf())

    /**
     * Indicates the source of the request, with the default value being WORKFLOWS.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): Source = source.getRequired("source")

    /**
     * The ID of the workflow associated with the request context.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun workflowId(): Long = workflowId.getRequired("workflowId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun actionExecutionIndexIdentifier(): Optional<ActionExecutionIndexIdentifier> =
        actionExecutionIndexIdentifier.getOptional("actionExecutionIndexIdentifier")

    /**
     * The ID of the action within the workflow context.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun actionId(): Optional<Long> = actionId.getOptional("actionId")

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<Source> = source

    /**
     * Returns the raw JSON value of [workflowId].
     *
     * Unlike [workflowId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("workflowId") @ExcludeMissing fun _workflowId(): JsonField<Long> = workflowId

    /**
     * Returns the raw JSON value of [actionExecutionIndexIdentifier].
     *
     * Unlike [actionExecutionIndexIdentifier], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("actionExecutionIndexIdentifier")
    @ExcludeMissing
    fun _actionExecutionIndexIdentifier(): JsonField<ActionExecutionIndexIdentifier> =
        actionExecutionIndexIdentifier

    /**
     * Returns the raw JSON value of [actionId].
     *
     * Unlike [actionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actionId") @ExcludeMissing fun _actionId(): JsonField<Long> = actionId

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
         * Returns a mutable builder for constructing an instance of [WorkflowsRequestContext].
         *
         * The following fields are required:
         * ```java
         * .source()
         * .workflowId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WorkflowsRequestContext]. */
    class Builder internal constructor() {

        private var source: JsonField<Source>? = null
        private var workflowId: JsonField<Long>? = null
        private var actionExecutionIndexIdentifier: JsonField<ActionExecutionIndexIdentifier> =
            JsonMissing.of()
        private var actionId: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(workflowsRequestContext: WorkflowsRequestContext) = apply {
            source = workflowsRequestContext.source
            workflowId = workflowsRequestContext.workflowId
            actionExecutionIndexIdentifier = workflowsRequestContext.actionExecutionIndexIdentifier
            actionId = workflowsRequestContext.actionId
            additionalProperties = workflowsRequestContext.additionalProperties.toMutableMap()
        }

        /** Indicates the source of the request, with the default value being WORKFLOWS. */
        fun source(source: Source) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [Source] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<Source>) = apply { this.source = source }

        /** The ID of the workflow associated with the request context. */
        fun workflowId(workflowId: Long) = workflowId(JsonField.of(workflowId))

        /**
         * Sets [Builder.workflowId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.workflowId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun workflowId(workflowId: JsonField<Long>) = apply { this.workflowId = workflowId }

        fun actionExecutionIndexIdentifier(
            actionExecutionIndexIdentifier: ActionExecutionIndexIdentifier
        ) = actionExecutionIndexIdentifier(JsonField.of(actionExecutionIndexIdentifier))

        /**
         * Sets [Builder.actionExecutionIndexIdentifier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actionExecutionIndexIdentifier] with a well-typed
         * [ActionExecutionIndexIdentifier] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun actionExecutionIndexIdentifier(
            actionExecutionIndexIdentifier: JsonField<ActionExecutionIndexIdentifier>
        ) = apply { this.actionExecutionIndexIdentifier = actionExecutionIndexIdentifier }

        /** The ID of the action within the workflow context. */
        fun actionId(actionId: Long) = actionId(JsonField.of(actionId))

        /**
         * Sets [Builder.actionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actionId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun actionId(actionId: JsonField<Long>) = apply { this.actionId = actionId }

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
         * Returns an immutable instance of [WorkflowsRequestContext].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .source()
         * .workflowId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WorkflowsRequestContext =
            WorkflowsRequestContext(
                checkRequired("source", source),
                checkRequired("workflowId", workflowId),
                actionExecutionIndexIdentifier,
                actionId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): WorkflowsRequestContext = apply {
        if (validated) {
            return@apply
        }

        source().validate()
        workflowId()
        actionExecutionIndexIdentifier().ifPresent { it.validate() }
        actionId()
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
        (source.asKnown().getOrNull()?.validity() ?: 0) +
            (if (workflowId.asKnown().isPresent) 1 else 0) +
            (actionExecutionIndexIdentifier.asKnown().getOrNull()?.validity() ?: 0) +
            (if (actionId.asKnown().isPresent) 1 else 0)

    /** Indicates the source of the request, with the default value being WORKFLOWS. */
    class Source @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val WORKFLOWS = of("WORKFLOWS")

            @JvmStatic fun of(value: String) = Source(JsonField.of(value))
        }

        /** An enum containing [Source]'s known values. */
        enum class Known {
            WORKFLOWS
        }

        /**
         * An enum containing [Source]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Source] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            WORKFLOWS,
            /** An enum member indicating that [Source] was instantiated with an unknown value. */
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
                WORKFLOWS -> Value.WORKFLOWS
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
                WORKFLOWS -> Known.WORKFLOWS
                else -> throw HubSpotInvalidDataException("Unknown Source: $value")
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

        fun validate(): Source = apply {
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

            return other is Source && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WorkflowsRequestContext &&
            source == other.source &&
            workflowId == other.workflowId &&
            actionExecutionIndexIdentifier == other.actionExecutionIndexIdentifier &&
            actionId == other.actionId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            source,
            workflowId,
            actionExecutionIndexIdentifier,
            actionId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WorkflowsRequestContext{source=$source, workflowId=$workflowId, actionExecutionIndexIdentifier=$actionExecutionIndexIdentifier, actionId=$actionId, additionalProperties=$additionalProperties}"
}
