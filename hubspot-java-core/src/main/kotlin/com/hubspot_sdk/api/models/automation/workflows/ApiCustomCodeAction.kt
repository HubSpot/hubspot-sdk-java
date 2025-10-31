// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.Enum
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ApiCustomCodeAction
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val actionId: JsonField<String>,
    private val inputFields: JsonField<List<ApiInputVariable>>,
    private val outputFields: JsonField<List<ApiEnumerationOutputField>>,
    private val runtime: JsonField<String>,
    private val secretNames: JsonField<List<String>>,
    private val sourceCode: JsonField<String>,
    private val type: JsonField<Type>,
    private val connection: JsonField<ApiConnection>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("actionId") @ExcludeMissing actionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("inputFields")
        @ExcludeMissing
        inputFields: JsonField<List<ApiInputVariable>> = JsonMissing.of(),
        @JsonProperty("outputFields")
        @ExcludeMissing
        outputFields: JsonField<List<ApiEnumerationOutputField>> = JsonMissing.of(),
        @JsonProperty("runtime") @ExcludeMissing runtime: JsonField<String> = JsonMissing.of(),
        @JsonProperty("secretNames")
        @ExcludeMissing
        secretNames: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("sourceCode")
        @ExcludeMissing
        sourceCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("connection")
        @ExcludeMissing
        connection: JsonField<ApiConnection> = JsonMissing.of(),
    ) : this(
        actionId,
        inputFields,
        outputFields,
        runtime,
        secretNames,
        sourceCode,
        type,
        connection,
        mutableMapOf(),
    )

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun actionId(): String = actionId.getRequired("actionId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inputFields(): List<ApiInputVariable> = inputFields.getRequired("inputFields")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun outputFields(): List<ApiEnumerationOutputField> = outputFields.getRequired("outputFields")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun runtime(): String = runtime.getRequired("runtime")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun secretNames(): List<String> = secretNames.getRequired("secretNames")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sourceCode(): String = sourceCode.getRequired("sourceCode")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun connection(): Optional<ApiConnection> = connection.getOptional("connection")

    /**
     * Returns the raw JSON value of [actionId].
     *
     * Unlike [actionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actionId") @ExcludeMissing fun _actionId(): JsonField<String> = actionId

    /**
     * Returns the raw JSON value of [inputFields].
     *
     * Unlike [inputFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inputFields")
    @ExcludeMissing
    fun _inputFields(): JsonField<List<ApiInputVariable>> = inputFields

    /**
     * Returns the raw JSON value of [outputFields].
     *
     * Unlike [outputFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("outputFields")
    @ExcludeMissing
    fun _outputFields(): JsonField<List<ApiEnumerationOutputField>> = outputFields

    /**
     * Returns the raw JSON value of [runtime].
     *
     * Unlike [runtime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("runtime") @ExcludeMissing fun _runtime(): JsonField<String> = runtime

    /**
     * Returns the raw JSON value of [secretNames].
     *
     * Unlike [secretNames], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("secretNames")
    @ExcludeMissing
    fun _secretNames(): JsonField<List<String>> = secretNames

    /**
     * Returns the raw JSON value of [sourceCode].
     *
     * Unlike [sourceCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceCode") @ExcludeMissing fun _sourceCode(): JsonField<String> = sourceCode

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [connection].
     *
     * Unlike [connection], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("connection")
    @ExcludeMissing
    fun _connection(): JsonField<ApiConnection> = connection

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
         * Returns a mutable builder for constructing an instance of [ApiCustomCodeAction].
         *
         * The following fields are required:
         * ```java
         * .actionId()
         * .inputFields()
         * .outputFields()
         * .runtime()
         * .secretNames()
         * .sourceCode()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ApiCustomCodeAction]. */
    class Builder internal constructor() {

        private var actionId: JsonField<String>? = null
        private var inputFields: JsonField<MutableList<ApiInputVariable>>? = null
        private var outputFields: JsonField<MutableList<ApiEnumerationOutputField>>? = null
        private var runtime: JsonField<String>? = null
        private var secretNames: JsonField<MutableList<String>>? = null
        private var sourceCode: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var connection: JsonField<ApiConnection> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(apiCustomCodeAction: ApiCustomCodeAction) = apply {
            actionId = apiCustomCodeAction.actionId
            inputFields = apiCustomCodeAction.inputFields.map { it.toMutableList() }
            outputFields = apiCustomCodeAction.outputFields.map { it.toMutableList() }
            runtime = apiCustomCodeAction.runtime
            secretNames = apiCustomCodeAction.secretNames.map { it.toMutableList() }
            sourceCode = apiCustomCodeAction.sourceCode
            type = apiCustomCodeAction.type
            connection = apiCustomCodeAction.connection
            additionalProperties = apiCustomCodeAction.additionalProperties.toMutableMap()
        }

        fun actionId(actionId: String) = actionId(JsonField.of(actionId))

        /**
         * Sets [Builder.actionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actionId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun actionId(actionId: JsonField<String>) = apply { this.actionId = actionId }

        fun inputFields(inputFields: List<ApiInputVariable>) =
            inputFields(JsonField.of(inputFields))

        /**
         * Sets [Builder.inputFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inputFields] with a well-typed `List<ApiInputVariable>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun inputFields(inputFields: JsonField<List<ApiInputVariable>>) = apply {
            this.inputFields = inputFields.map { it.toMutableList() }
        }

        /**
         * Adds a single [ApiInputVariable] to [inputFields].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInputField(inputField: ApiInputVariable) = apply {
            inputFields =
                (inputFields ?: JsonField.of(mutableListOf())).also {
                    checkKnown("inputFields", it).add(inputField)
                }
        }

        fun outputFields(outputFields: List<ApiEnumerationOutputField>) =
            outputFields(JsonField.of(outputFields))

        /**
         * Sets [Builder.outputFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outputFields] with a well-typed
         * `List<ApiEnumerationOutputField>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun outputFields(outputFields: JsonField<List<ApiEnumerationOutputField>>) = apply {
            this.outputFields = outputFields.map { it.toMutableList() }
        }

        /**
         * Adds a single [ApiEnumerationOutputField] to [outputFields].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOutputField(outputField: ApiEnumerationOutputField) = apply {
            outputFields =
                (outputFields ?: JsonField.of(mutableListOf())).also {
                    checkKnown("outputFields", it).add(outputField)
                }
        }

        fun runtime(runtime: String) = runtime(JsonField.of(runtime))

        /**
         * Sets [Builder.runtime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runtime] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun runtime(runtime: JsonField<String>) = apply { this.runtime = runtime }

        fun secretNames(secretNames: List<String>) = secretNames(JsonField.of(secretNames))

        /**
         * Sets [Builder.secretNames] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secretNames] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun secretNames(secretNames: JsonField<List<String>>) = apply {
            this.secretNames = secretNames.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [secretNames].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSecretName(secretName: String) = apply {
            secretNames =
                (secretNames ?: JsonField.of(mutableListOf())).also {
                    checkKnown("secretNames", it).add(secretName)
                }
        }

        fun sourceCode(sourceCode: String) = sourceCode(JsonField.of(sourceCode))

        /**
         * Sets [Builder.sourceCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sourceCode(sourceCode: JsonField<String>) = apply { this.sourceCode = sourceCode }

        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun connection(connection: ApiConnection) = connection(JsonField.of(connection))

        /**
         * Sets [Builder.connection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connection] with a well-typed [ApiConnection] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun connection(connection: JsonField<ApiConnection>) = apply {
            this.connection = connection
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
         * Returns an immutable instance of [ApiCustomCodeAction].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .actionId()
         * .inputFields()
         * .outputFields()
         * .runtime()
         * .secretNames()
         * .sourceCode()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ApiCustomCodeAction =
            ApiCustomCodeAction(
                checkRequired("actionId", actionId),
                checkRequired("inputFields", inputFields).map { it.toImmutable() },
                checkRequired("outputFields", outputFields).map { it.toImmutable() },
                checkRequired("runtime", runtime),
                checkRequired("secretNames", secretNames).map { it.toImmutable() },
                checkRequired("sourceCode", sourceCode),
                checkRequired("type", type),
                connection,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ApiCustomCodeAction = apply {
        if (validated) {
            return@apply
        }

        actionId()
        inputFields().forEach { it.validate() }
        outputFields().forEach { it.validate() }
        runtime()
        secretNames()
        sourceCode()
        type().validate()
        connection().ifPresent { it.validate() }
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
        (if (actionId.asKnown().isPresent) 1 else 0) +
            (inputFields.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (outputFields.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (runtime.asKnown().isPresent) 1 else 0) +
            (secretNames.asKnown().getOrNull()?.size ?: 0) +
            (if (sourceCode.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (connection.asKnown().getOrNull()?.validity() ?: 0)

    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CUSTOM_CODE = of("CUSTOM_CODE")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            CUSTOM_CODE
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CUSTOM_CODE,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                CUSTOM_CODE -> Value.CUSTOM_CODE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HubspotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                CUSTOM_CODE -> Known.CUSTOM_CODE
                else -> throw HubspotInvalidDataException("Unknown Type: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HubspotInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { HubspotInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): Type = apply {
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
            } catch (e: HubspotInvalidDataException) {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ApiCustomCodeAction &&
            actionId == other.actionId &&
            inputFields == other.inputFields &&
            outputFields == other.outputFields &&
            runtime == other.runtime &&
            secretNames == other.secretNames &&
            sourceCode == other.sourceCode &&
            type == other.type &&
            connection == other.connection &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            actionId,
            inputFields,
            outputFields,
            runtime,
            secretNames,
            sourceCode,
            type,
            connection,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ApiCustomCodeAction{actionId=$actionId, inputFields=$inputFields, outputFields=$outputFields, runtime=$runtime, secretNames=$secretNames, sourceCode=$sourceCode, type=$type, connection=$connection, additionalProperties=$additionalProperties}"
}
