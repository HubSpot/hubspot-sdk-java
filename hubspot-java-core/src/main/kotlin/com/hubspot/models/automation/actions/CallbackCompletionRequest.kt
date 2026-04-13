// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.automation.actions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.BaseDeserializer
import com.hubspot.core.BaseSerializer
import com.hubspot.core.ExcludeMissing
import com.hubspot.core.JsonField
import com.hubspot.core.JsonMissing
import com.hubspot.core.JsonValue
import com.hubspot.core.allMaxBy
import com.hubspot.core.checkRequired
import com.hubspot.core.getOrThrow
import com.hubspot.core.toImmutable
import com.hubspot.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CallbackCompletionRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val outputFields: JsonField<OutputFields>,
    private val typedOutputs: JsonValue,
    private val failureReasonType: JsonField<String>,
    private val requestContext: JsonField<RequestContext>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("outputFields")
        @ExcludeMissing
        outputFields: JsonField<OutputFields> = JsonMissing.of(),
        @JsonProperty("typedOutputs") @ExcludeMissing typedOutputs: JsonValue = JsonMissing.of(),
        @JsonProperty("failureReasonType")
        @ExcludeMissing
        failureReasonType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("requestContext")
        @ExcludeMissing
        requestContext: JsonField<RequestContext> = JsonMissing.of(),
    ) : this(outputFields, typedOutputs, failureReasonType, requestContext, mutableMapOf())

    /**
     * Contains the output fields associated with the callback, with each field represented as a
     * key-value pair.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun outputFields(): OutputFields = outputFields.getRequired("outputFields")

    /**
     * Holds the typed outputs related to the callback, structured as an object.
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = callbackCompletionRequest.typedOutputs().convert(MyClass.class);
     * ```
     */
    @JsonProperty("typedOutputs") @ExcludeMissing fun _typedOutputs(): JsonValue = typedOutputs

    /**
     * Indicates the reason for the failure of a callback completion.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun failureReasonType(): Optional<String> = failureReasonType.getOptional("failureReasonType")

    /**
     * Specifies the context in which the request is made, which can be one of several predefined
     * contexts.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requestContext(): Optional<RequestContext> = requestContext.getOptional("requestContext")

    /**
     * Returns the raw JSON value of [outputFields].
     *
     * Unlike [outputFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("outputFields")
    @ExcludeMissing
    fun _outputFields(): JsonField<OutputFields> = outputFields

    /**
     * Returns the raw JSON value of [failureReasonType].
     *
     * Unlike [failureReasonType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("failureReasonType")
    @ExcludeMissing
    fun _failureReasonType(): JsonField<String> = failureReasonType

    /**
     * Returns the raw JSON value of [requestContext].
     *
     * Unlike [requestContext], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("requestContext")
    @ExcludeMissing
    fun _requestContext(): JsonField<RequestContext> = requestContext

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
         * .typedOutputs()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CallbackCompletionRequest]. */
    class Builder internal constructor() {

        private var outputFields: JsonField<OutputFields>? = null
        private var typedOutputs: JsonValue? = null
        private var failureReasonType: JsonField<String> = JsonMissing.of()
        private var requestContext: JsonField<RequestContext> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(callbackCompletionRequest: CallbackCompletionRequest) = apply {
            outputFields = callbackCompletionRequest.outputFields
            typedOutputs = callbackCompletionRequest.typedOutputs
            failureReasonType = callbackCompletionRequest.failureReasonType
            requestContext = callbackCompletionRequest.requestContext
            additionalProperties = callbackCompletionRequest.additionalProperties.toMutableMap()
        }

        /**
         * Contains the output fields associated with the callback, with each field represented as a
         * key-value pair.
         */
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

        /** Holds the typed outputs related to the callback, structured as an object. */
        fun typedOutputs(typedOutputs: JsonValue) = apply { this.typedOutputs = typedOutputs }

        /** Indicates the reason for the failure of a callback completion. */
        fun failureReasonType(failureReasonType: String) =
            failureReasonType(JsonField.of(failureReasonType))

        /**
         * Sets [Builder.failureReasonType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.failureReasonType] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun failureReasonType(failureReasonType: JsonField<String>) = apply {
            this.failureReasonType = failureReasonType
        }

        /**
         * Specifies the context in which the request is made, which can be one of several
         * predefined contexts.
         */
        fun requestContext(requestContext: RequestContext) =
            requestContext(JsonField.of(requestContext))

        /**
         * Sets [Builder.requestContext] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestContext] with a well-typed [RequestContext] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun requestContext(requestContext: JsonField<RequestContext>) = apply {
            this.requestContext = requestContext
        }

        /** Alias for calling [requestContext] with `RequestContext.ofWorkflows(workflows)`. */
        fun requestContext(workflows: WorkflowsRequestContext) =
            requestContext(RequestContext.ofWorkflows(workflows))

        /** Alias for calling [requestContext] with `RequestContext.ofAgent(agent)`. */
        fun requestContext(agent: AgentRequestContext) =
            requestContext(RequestContext.ofAgent(agent))

        /** Alias for calling [requestContext] with `RequestContext.ofCopilot(copilot)`. */
        fun requestContext(copilot: CopilotRequestContext) =
            requestContext(RequestContext.ofCopilot(copilot))

        /** Alias for calling [requestContext] with `RequestContext.ofStandalone(standalone)`. */
        fun requestContext(standalone: StandaloneRequestContext) =
            requestContext(RequestContext.ofStandalone(standalone))

        /** Alias for calling [requestContext] with `RequestContext.ofTest(test)`. */
        fun requestContext(test: TestRequestContext) = requestContext(RequestContext.ofTest(test))

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
         * .typedOutputs()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CallbackCompletionRequest =
            CallbackCompletionRequest(
                checkRequired("outputFields", outputFields),
                checkRequired("typedOutputs", typedOutputs),
                failureReasonType,
                requestContext,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CallbackCompletionRequest = apply {
        if (validated) {
            return@apply
        }

        outputFields().validate()
        failureReasonType()
        requestContext().ifPresent { it.validate() }
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
        (outputFields.asKnown().getOrNull()?.validity() ?: 0) +
            (if (failureReasonType.asKnown().isPresent) 1 else 0) +
            (requestContext.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * Contains the output fields associated with the callback, with each field represented as a
     * key-value pair.
     */
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

            return other is OutputFields && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "OutputFields{additionalProperties=$additionalProperties}"
    }

    /**
     * Specifies the context in which the request is made, which can be one of several predefined
     * contexts.
     */
    @JsonDeserialize(using = RequestContext.Deserializer::class)
    @JsonSerialize(using = RequestContext.Serializer::class)
    class RequestContext
    private constructor(
        private val workflows: WorkflowsRequestContext? = null,
        private val agent: AgentRequestContext? = null,
        private val copilot: CopilotRequestContext? = null,
        private val standalone: StandaloneRequestContext? = null,
        private val test: TestRequestContext? = null,
        private val _json: JsonValue? = null,
    ) {

        fun workflows(): Optional<WorkflowsRequestContext> = Optional.ofNullable(workflows)

        fun agent(): Optional<AgentRequestContext> = Optional.ofNullable(agent)

        fun copilot(): Optional<CopilotRequestContext> = Optional.ofNullable(copilot)

        fun standalone(): Optional<StandaloneRequestContext> = Optional.ofNullable(standalone)

        fun test(): Optional<TestRequestContext> = Optional.ofNullable(test)

        fun isWorkflows(): Boolean = workflows != null

        fun isAgent(): Boolean = agent != null

        fun isCopilot(): Boolean = copilot != null

        fun isStandalone(): Boolean = standalone != null

        fun isTest(): Boolean = test != null

        fun asWorkflows(): WorkflowsRequestContext = workflows.getOrThrow("workflows")

        fun asAgent(): AgentRequestContext = agent.getOrThrow("agent")

        fun asCopilot(): CopilotRequestContext = copilot.getOrThrow("copilot")

        fun asStandalone(): StandaloneRequestContext = standalone.getOrThrow("standalone")

        fun asTest(): TestRequestContext = test.getOrThrow("test")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                workflows != null -> visitor.visitWorkflows(workflows)
                agent != null -> visitor.visitAgent(agent)
                copilot != null -> visitor.visitCopilot(copilot)
                standalone != null -> visitor.visitStandalone(standalone)
                test != null -> visitor.visitTest(test)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): RequestContext = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitWorkflows(workflows: WorkflowsRequestContext) {
                        workflows.validate()
                    }

                    override fun visitAgent(agent: AgentRequestContext) {
                        agent.validate()
                    }

                    override fun visitCopilot(copilot: CopilotRequestContext) {
                        copilot.validate()
                    }

                    override fun visitStandalone(standalone: StandaloneRequestContext) {
                        standalone.validate()
                    }

                    override fun visitTest(test: TestRequestContext) {
                        test.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitWorkflows(workflows: WorkflowsRequestContext) =
                        workflows.validity()

                    override fun visitAgent(agent: AgentRequestContext) = agent.validity()

                    override fun visitCopilot(copilot: CopilotRequestContext) = copilot.validity()

                    override fun visitStandalone(standalone: StandaloneRequestContext) =
                        standalone.validity()

                    override fun visitTest(test: TestRequestContext) = test.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RequestContext &&
                workflows == other.workflows &&
                agent == other.agent &&
                copilot == other.copilot &&
                standalone == other.standalone &&
                test == other.test
        }

        override fun hashCode(): Int = Objects.hash(workflows, agent, copilot, standalone, test)

        override fun toString(): String =
            when {
                workflows != null -> "RequestContext{workflows=$workflows}"
                agent != null -> "RequestContext{agent=$agent}"
                copilot != null -> "RequestContext{copilot=$copilot}"
                standalone != null -> "RequestContext{standalone=$standalone}"
                test != null -> "RequestContext{test=$test}"
                _json != null -> "RequestContext{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid RequestContext")
            }

        companion object {

            @JvmStatic
            fun ofWorkflows(workflows: WorkflowsRequestContext) =
                RequestContext(workflows = workflows)

            @JvmStatic fun ofAgent(agent: AgentRequestContext) = RequestContext(agent = agent)

            @JvmStatic
            fun ofCopilot(copilot: CopilotRequestContext) = RequestContext(copilot = copilot)

            @JvmStatic
            fun ofStandalone(standalone: StandaloneRequestContext) =
                RequestContext(standalone = standalone)

            @JvmStatic fun ofTest(test: TestRequestContext) = RequestContext(test = test)
        }

        /**
         * An interface that defines how to map each variant of [RequestContext] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitWorkflows(workflows: WorkflowsRequestContext): T

            fun visitAgent(agent: AgentRequestContext): T

            fun visitCopilot(copilot: CopilotRequestContext): T

            fun visitStandalone(standalone: StandaloneRequestContext): T

            fun visitTest(test: TestRequestContext): T

            /**
             * Maps an unknown variant of [RequestContext] to a value of type [T].
             *
             * An instance of [RequestContext] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws HubSpotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubSpotInvalidDataException("Unknown RequestContext: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<RequestContext>(RequestContext::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): RequestContext {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<WorkflowsRequestContext>())?.let {
                                RequestContext(workflows = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<AgentRequestContext>())?.let {
                                RequestContext(agent = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<CopilotRequestContext>())?.let {
                                RequestContext(copilot = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<StandaloneRequestContext>())?.let {
                                RequestContext(standalone = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<TestRequestContext>())?.let {
                                RequestContext(test = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> RequestContext(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<RequestContext>(RequestContext::class) {

            override fun serialize(
                value: RequestContext,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.workflows != null -> generator.writeObject(value.workflows)
                    value.agent != null -> generator.writeObject(value.agent)
                    value.copilot != null -> generator.writeObject(value.copilot)
                    value.standalone != null -> generator.writeObject(value.standalone)
                    value.test != null -> generator.writeObject(value.test)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid RequestContext")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CallbackCompletionRequest &&
            outputFields == other.outputFields &&
            typedOutputs == other.typedOutputs &&
            failureReasonType == other.failureReasonType &&
            requestContext == other.requestContext &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            outputFields,
            typedOutputs,
            failureReasonType,
            requestContext,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CallbackCompletionRequest{outputFields=$outputFields, typedOutputs=$typedOutputs, failureReasonType=$failureReasonType, requestContext=$requestContext, additionalProperties=$additionalProperties}"
}
