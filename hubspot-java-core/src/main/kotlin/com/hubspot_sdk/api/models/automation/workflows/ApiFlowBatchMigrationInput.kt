// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

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
import com.hubspot_sdk.api.core.BaseDeserializer
import com.hubspot_sdk.api.core.BaseSerializer
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.allMaxBy
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.getOrThrow
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ApiFlowBatchMigrationInput
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val inputs: JsonField<List<Input>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("inputs") @ExcludeMissing inputs: JsonField<List<Input>> = JsonMissing.of()
    ) : this(inputs, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inputs(): List<Input> = inputs.getRequired("inputs")

    /**
     * Returns the raw JSON value of [inputs].
     *
     * Unlike [inputs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inputs") @ExcludeMissing fun _inputs(): JsonField<List<Input>> = inputs

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
         * Returns a mutable builder for constructing an instance of [ApiFlowBatchMigrationInput].
         *
         * The following fields are required:
         * ```java
         * .inputs()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ApiFlowBatchMigrationInput]. */
    class Builder internal constructor() {

        private var inputs: JsonField<MutableList<Input>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(apiFlowBatchMigrationInput: ApiFlowBatchMigrationInput) = apply {
            inputs = apiFlowBatchMigrationInput.inputs.map { it.toMutableList() }
            additionalProperties = apiFlowBatchMigrationInput.additionalProperties.toMutableMap()
        }

        fun inputs(inputs: List<Input>) = inputs(JsonField.of(inputs))

        /**
         * Sets [Builder.inputs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inputs] with a well-typed `List<Input>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun inputs(inputs: JsonField<List<Input>>) = apply {
            this.inputs = inputs.map { it.toMutableList() }
        }

        /**
         * Adds a single [Input] to [inputs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInput(input: Input) = apply {
            inputs =
                (inputs ?: JsonField.of(mutableListOf())).also {
                    checkKnown("inputs", it).add(input)
                }
        }

        /**
         * Alias for calling [addInput] with
         * `Input.ofApiFlowBatchFetchMigrationFlowIdCoordinate(apiFlowBatchFetchMigrationFlowIdCoordinate)`.
         */
        fun addInput(
            apiFlowBatchFetchMigrationFlowIdCoordinate: ApiFlowBatchFetchMigrationFlowIdCoordinate
        ) =
            addInput(
                Input.ofApiFlowBatchFetchMigrationFlowIdCoordinate(
                    apiFlowBatchFetchMigrationFlowIdCoordinate
                )
            )

        /**
         * Alias for calling [addInput] with
         * `Input.ofApiFlowBatchFetchMigrationWorkflowIdCoordinate(apiFlowBatchFetchMigrationWorkflowIdCoordinate)`.
         */
        fun addInput(
            apiFlowBatchFetchMigrationWorkflowIdCoordinate:
                ApiFlowBatchFetchMigrationWorkflowIdCoordinate
        ) =
            addInput(
                Input.ofApiFlowBatchFetchMigrationWorkflowIdCoordinate(
                    apiFlowBatchFetchMigrationWorkflowIdCoordinate
                )
            )

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
         * Returns an immutable instance of [ApiFlowBatchMigrationInput].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .inputs()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ApiFlowBatchMigrationInput =
            ApiFlowBatchMigrationInput(
                checkRequired("inputs", inputs).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ApiFlowBatchMigrationInput = apply {
        if (validated) {
            return@apply
        }

        inputs().forEach { it.validate() }
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
        (inputs.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    @JsonDeserialize(using = Input.Deserializer::class)
    @JsonSerialize(using = Input.Serializer::class)
    class Input
    private constructor(
        private val apiFlowBatchFetchMigrationFlowIdCoordinate:
            ApiFlowBatchFetchMigrationFlowIdCoordinate? =
            null,
        private val apiFlowBatchFetchMigrationWorkflowIdCoordinate:
            ApiFlowBatchFetchMigrationWorkflowIdCoordinate? =
            null,
        private val _json: JsonValue? = null,
    ) {

        fun apiFlowBatchFetchMigrationFlowIdCoordinate():
            Optional<ApiFlowBatchFetchMigrationFlowIdCoordinate> =
            Optional.ofNullable(apiFlowBatchFetchMigrationFlowIdCoordinate)

        fun apiFlowBatchFetchMigrationWorkflowIdCoordinate():
            Optional<ApiFlowBatchFetchMigrationWorkflowIdCoordinate> =
            Optional.ofNullable(apiFlowBatchFetchMigrationWorkflowIdCoordinate)

        fun isApiFlowBatchFetchMigrationFlowIdCoordinate(): Boolean =
            apiFlowBatchFetchMigrationFlowIdCoordinate != null

        fun isApiFlowBatchFetchMigrationWorkflowIdCoordinate(): Boolean =
            apiFlowBatchFetchMigrationWorkflowIdCoordinate != null

        fun asApiFlowBatchFetchMigrationFlowIdCoordinate():
            ApiFlowBatchFetchMigrationFlowIdCoordinate =
            apiFlowBatchFetchMigrationFlowIdCoordinate.getOrThrow(
                "apiFlowBatchFetchMigrationFlowIdCoordinate"
            )

        fun asApiFlowBatchFetchMigrationWorkflowIdCoordinate():
            ApiFlowBatchFetchMigrationWorkflowIdCoordinate =
            apiFlowBatchFetchMigrationWorkflowIdCoordinate.getOrThrow(
                "apiFlowBatchFetchMigrationWorkflowIdCoordinate"
            )

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                apiFlowBatchFetchMigrationFlowIdCoordinate != null ->
                    visitor.visitApiFlowBatchFetchMigrationFlowIdCoordinate(
                        apiFlowBatchFetchMigrationFlowIdCoordinate
                    )
                apiFlowBatchFetchMigrationWorkflowIdCoordinate != null ->
                    visitor.visitApiFlowBatchFetchMigrationWorkflowIdCoordinate(
                        apiFlowBatchFetchMigrationWorkflowIdCoordinate
                    )
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Input = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitApiFlowBatchFetchMigrationFlowIdCoordinate(
                        apiFlowBatchFetchMigrationFlowIdCoordinate:
                            ApiFlowBatchFetchMigrationFlowIdCoordinate
                    ) {
                        apiFlowBatchFetchMigrationFlowIdCoordinate.validate()
                    }

                    override fun visitApiFlowBatchFetchMigrationWorkflowIdCoordinate(
                        apiFlowBatchFetchMigrationWorkflowIdCoordinate:
                            ApiFlowBatchFetchMigrationWorkflowIdCoordinate
                    ) {
                        apiFlowBatchFetchMigrationWorkflowIdCoordinate.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitApiFlowBatchFetchMigrationFlowIdCoordinate(
                        apiFlowBatchFetchMigrationFlowIdCoordinate:
                            ApiFlowBatchFetchMigrationFlowIdCoordinate
                    ) = apiFlowBatchFetchMigrationFlowIdCoordinate.validity()

                    override fun visitApiFlowBatchFetchMigrationWorkflowIdCoordinate(
                        apiFlowBatchFetchMigrationWorkflowIdCoordinate:
                            ApiFlowBatchFetchMigrationWorkflowIdCoordinate
                    ) = apiFlowBatchFetchMigrationWorkflowIdCoordinate.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Input &&
                apiFlowBatchFetchMigrationFlowIdCoordinate ==
                    other.apiFlowBatchFetchMigrationFlowIdCoordinate &&
                apiFlowBatchFetchMigrationWorkflowIdCoordinate ==
                    other.apiFlowBatchFetchMigrationWorkflowIdCoordinate
        }

        override fun hashCode(): Int =
            Objects.hash(
                apiFlowBatchFetchMigrationFlowIdCoordinate,
                apiFlowBatchFetchMigrationWorkflowIdCoordinate,
            )

        override fun toString(): String =
            when {
                apiFlowBatchFetchMigrationFlowIdCoordinate != null ->
                    "Input{apiFlowBatchFetchMigrationFlowIdCoordinate=$apiFlowBatchFetchMigrationFlowIdCoordinate}"
                apiFlowBatchFetchMigrationWorkflowIdCoordinate != null ->
                    "Input{apiFlowBatchFetchMigrationWorkflowIdCoordinate=$apiFlowBatchFetchMigrationWorkflowIdCoordinate}"
                _json != null -> "Input{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Input")
            }

        companion object {

            @JvmStatic
            fun ofApiFlowBatchFetchMigrationFlowIdCoordinate(
                apiFlowBatchFetchMigrationFlowIdCoordinate:
                    ApiFlowBatchFetchMigrationFlowIdCoordinate
            ) =
                Input(
                    apiFlowBatchFetchMigrationFlowIdCoordinate =
                        apiFlowBatchFetchMigrationFlowIdCoordinate
                )

            @JvmStatic
            fun ofApiFlowBatchFetchMigrationWorkflowIdCoordinate(
                apiFlowBatchFetchMigrationWorkflowIdCoordinate:
                    ApiFlowBatchFetchMigrationWorkflowIdCoordinate
            ) =
                Input(
                    apiFlowBatchFetchMigrationWorkflowIdCoordinate =
                        apiFlowBatchFetchMigrationWorkflowIdCoordinate
                )
        }

        /** An interface that defines how to map each variant of [Input] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitApiFlowBatchFetchMigrationFlowIdCoordinate(
                apiFlowBatchFetchMigrationFlowIdCoordinate:
                    ApiFlowBatchFetchMigrationFlowIdCoordinate
            ): T

            fun visitApiFlowBatchFetchMigrationWorkflowIdCoordinate(
                apiFlowBatchFetchMigrationWorkflowIdCoordinate:
                    ApiFlowBatchFetchMigrationWorkflowIdCoordinate
            ): T

            /**
             * Maps an unknown variant of [Input] to a value of type [T].
             *
             * An instance of [Input] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws HubspotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubspotInvalidDataException("Unknown Input: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Input>(Input::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Input {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<ApiFlowBatchFetchMigrationFlowIdCoordinate>(),
                                )
                                ?.let {
                                    Input(
                                        apiFlowBatchFetchMigrationFlowIdCoordinate = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<ApiFlowBatchFetchMigrationWorkflowIdCoordinate>(),
                                )
                                ?.let {
                                    Input(
                                        apiFlowBatchFetchMigrationWorkflowIdCoordinate = it,
                                        _json = json,
                                    )
                                },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Input(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Input>(Input::class) {

            override fun serialize(
                value: Input,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.apiFlowBatchFetchMigrationFlowIdCoordinate != null ->
                        generator.writeObject(value.apiFlowBatchFetchMigrationFlowIdCoordinate)
                    value.apiFlowBatchFetchMigrationWorkflowIdCoordinate != null ->
                        generator.writeObject(value.apiFlowBatchFetchMigrationWorkflowIdCoordinate)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Input")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ApiFlowBatchMigrationInput &&
            inputs == other.inputs &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(inputs, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ApiFlowBatchMigrationInput{inputs=$inputs, additionalProperties=$additionalProperties}"
}
