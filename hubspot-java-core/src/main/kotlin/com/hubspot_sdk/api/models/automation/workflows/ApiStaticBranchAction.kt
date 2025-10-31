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
import com.hubspot_sdk.api.core.Enum
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

class ApiStaticBranchAction
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val actionId: JsonField<String>,
    private val inputValue: JsonField<InputValue>,
    private val staticBranches: JsonField<List<ApiStaticBranch>>,
    private val type: JsonField<Type>,
    private val defaultBranch: JsonField<ApiConnection>,
    private val defaultBranchName: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("actionId") @ExcludeMissing actionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("inputValue")
        @ExcludeMissing
        inputValue: JsonField<InputValue> = JsonMissing.of(),
        @JsonProperty("staticBranches")
        @ExcludeMissing
        staticBranches: JsonField<List<ApiStaticBranch>> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("defaultBranch")
        @ExcludeMissing
        defaultBranch: JsonField<ApiConnection> = JsonMissing.of(),
        @JsonProperty("defaultBranchName")
        @ExcludeMissing
        defaultBranchName: JsonField<String> = JsonMissing.of(),
    ) : this(
        actionId,
        inputValue,
        staticBranches,
        type,
        defaultBranch,
        defaultBranchName,
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
    fun inputValue(): InputValue = inputValue.getRequired("inputValue")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun staticBranches(): List<ApiStaticBranch> = staticBranches.getRequired("staticBranches")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultBranch(): Optional<ApiConnection> = defaultBranch.getOptional("defaultBranch")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultBranchName(): Optional<String> = defaultBranchName.getOptional("defaultBranchName")

    /**
     * Returns the raw JSON value of [actionId].
     *
     * Unlike [actionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actionId") @ExcludeMissing fun _actionId(): JsonField<String> = actionId

    /**
     * Returns the raw JSON value of [inputValue].
     *
     * Unlike [inputValue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inputValue")
    @ExcludeMissing
    fun _inputValue(): JsonField<InputValue> = inputValue

    /**
     * Returns the raw JSON value of [staticBranches].
     *
     * Unlike [staticBranches], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("staticBranches")
    @ExcludeMissing
    fun _staticBranches(): JsonField<List<ApiStaticBranch>> = staticBranches

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [defaultBranch].
     *
     * Unlike [defaultBranch], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("defaultBranch")
    @ExcludeMissing
    fun _defaultBranch(): JsonField<ApiConnection> = defaultBranch

    /**
     * Returns the raw JSON value of [defaultBranchName].
     *
     * Unlike [defaultBranchName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("defaultBranchName")
    @ExcludeMissing
    fun _defaultBranchName(): JsonField<String> = defaultBranchName

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
         * Returns a mutable builder for constructing an instance of [ApiStaticBranchAction].
         *
         * The following fields are required:
         * ```java
         * .actionId()
         * .inputValue()
         * .staticBranches()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ApiStaticBranchAction]. */
    class Builder internal constructor() {

        private var actionId: JsonField<String>? = null
        private var inputValue: JsonField<InputValue>? = null
        private var staticBranches: JsonField<MutableList<ApiStaticBranch>>? = null
        private var type: JsonField<Type>? = null
        private var defaultBranch: JsonField<ApiConnection> = JsonMissing.of()
        private var defaultBranchName: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(apiStaticBranchAction: ApiStaticBranchAction) = apply {
            actionId = apiStaticBranchAction.actionId
            inputValue = apiStaticBranchAction.inputValue
            staticBranches = apiStaticBranchAction.staticBranches.map { it.toMutableList() }
            type = apiStaticBranchAction.type
            defaultBranch = apiStaticBranchAction.defaultBranch
            defaultBranchName = apiStaticBranchAction.defaultBranchName
            additionalProperties = apiStaticBranchAction.additionalProperties.toMutableMap()
        }

        fun actionId(actionId: String) = actionId(JsonField.of(actionId))

        /**
         * Sets [Builder.actionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actionId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun actionId(actionId: JsonField<String>) = apply { this.actionId = actionId }

        fun inputValue(inputValue: InputValue) = inputValue(JsonField.of(inputValue))

        /**
         * Sets [Builder.inputValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inputValue] with a well-typed [InputValue] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun inputValue(inputValue: JsonField<InputValue>) = apply { this.inputValue = inputValue }

        /** Alias for calling [inputValue] with `InputValue.ofApiActionData(apiActionData)`. */
        fun inputValue(apiActionData: ApiActionDataValue) =
            inputValue(InputValue.ofApiActionData(apiActionData))

        /**
         * Alias for calling [inputValue] with `InputValue.ofApiObjectProperty(apiObjectProperty)`.
         */
        fun inputValue(apiObjectProperty: ApiObjectPropertyValue) =
            inputValue(InputValue.ofApiObjectProperty(apiObjectProperty))

        /** Alias for calling [inputValue] with `InputValue.ofApiStatic(apiStatic)`. */
        fun inputValue(apiStatic: ApiStaticValue) = inputValue(InputValue.ofApiStatic(apiStatic))

        /**
         * Alias for calling [inputValue] with
         * `InputValue.ofApiRelativeDateTime(apiRelativeDateTime)`.
         */
        fun inputValue(apiRelativeDateTime: ApiRelativeDateTimeValue) =
            inputValue(InputValue.ofApiRelativeDateTime(apiRelativeDateTime))

        /** Alias for calling [inputValue] with `InputValue.ofApiTimestamp(apiTimestamp)`. */
        fun inputValue(apiTimestamp: ApiTimestampValue) =
            inputValue(InputValue.ofApiTimestamp(apiTimestamp))

        /** Alias for calling [inputValue] with `InputValue.ofApiIncrement(apiIncrement)`. */
        fun inputValue(apiIncrement: ApiIncrementValue) =
            inputValue(InputValue.ofApiIncrement(apiIncrement))

        /**
         * Alias for calling [inputValue] with
         * `InputValue.ofApiFetchedObjectProperty(apiFetchedObjectProperty)`.
         */
        fun inputValue(apiFetchedObjectProperty: ApiFetchedObjectPropertyValue) =
            inputValue(InputValue.ofApiFetchedObjectProperty(apiFetchedObjectProperty))

        /**
         * Alias for calling [inputValue] with
         * `InputValue.ofApiAppendObjectProperty(apiAppendObjectProperty)`.
         */
        fun inputValue(apiAppendObjectProperty: ApiAppendObjectPropertyValue) =
            inputValue(InputValue.ofApiAppendObjectProperty(apiAppendObjectProperty))

        /** Alias for calling [inputValue] with `InputValue.ofApiStaticAppend(apiStaticAppend)`. */
        fun inputValue(apiStaticAppend: ApiStaticAppendValue) =
            inputValue(InputValue.ofApiStaticAppend(apiStaticAppend))

        /**
         * Alias for calling [inputValue] with
         * `InputValue.ofApiEnrollmentEventProperty(apiEnrollmentEventProperty)`.
         */
        fun inputValue(apiEnrollmentEventProperty: ApiEnrollmentEventPropertyValue) =
            inputValue(InputValue.ofApiEnrollmentEventProperty(apiEnrollmentEventProperty))

        fun staticBranches(staticBranches: List<ApiStaticBranch>) =
            staticBranches(JsonField.of(staticBranches))

        /**
         * Sets [Builder.staticBranches] to an arbitrary JSON value.
         *
         * You should usually call [Builder.staticBranches] with a well-typed
         * `List<ApiStaticBranch>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun staticBranches(staticBranches: JsonField<List<ApiStaticBranch>>) = apply {
            this.staticBranches = staticBranches.map { it.toMutableList() }
        }

        /**
         * Adds a single [ApiStaticBranch] to [staticBranches].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addStaticBranch(staticBranch: ApiStaticBranch) = apply {
            staticBranches =
                (staticBranches ?: JsonField.of(mutableListOf())).also {
                    checkKnown("staticBranches", it).add(staticBranch)
                }
        }

        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun defaultBranch(defaultBranch: ApiConnection) = defaultBranch(JsonField.of(defaultBranch))

        /**
         * Sets [Builder.defaultBranch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultBranch] with a well-typed [ApiConnection] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun defaultBranch(defaultBranch: JsonField<ApiConnection>) = apply {
            this.defaultBranch = defaultBranch
        }

        fun defaultBranchName(defaultBranchName: String) =
            defaultBranchName(JsonField.of(defaultBranchName))

        /**
         * Sets [Builder.defaultBranchName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultBranchName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun defaultBranchName(defaultBranchName: JsonField<String>) = apply {
            this.defaultBranchName = defaultBranchName
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
         * Returns an immutable instance of [ApiStaticBranchAction].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .actionId()
         * .inputValue()
         * .staticBranches()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ApiStaticBranchAction =
            ApiStaticBranchAction(
                checkRequired("actionId", actionId),
                checkRequired("inputValue", inputValue),
                checkRequired("staticBranches", staticBranches).map { it.toImmutable() },
                checkRequired("type", type),
                defaultBranch,
                defaultBranchName,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ApiStaticBranchAction = apply {
        if (validated) {
            return@apply
        }

        actionId()
        inputValue().validate()
        staticBranches().forEach { it.validate() }
        type().validate()
        defaultBranch().ifPresent { it.validate() }
        defaultBranchName()
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
            (inputValue.asKnown().getOrNull()?.validity() ?: 0) +
            (staticBranches.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (defaultBranch.asKnown().getOrNull()?.validity() ?: 0) +
            (if (defaultBranchName.asKnown().isPresent) 1 else 0)

    @JsonDeserialize(using = InputValue.Deserializer::class)
    @JsonSerialize(using = InputValue.Serializer::class)
    class InputValue
    private constructor(
        private val apiActionData: ApiActionDataValue? = null,
        private val apiObjectProperty: ApiObjectPropertyValue? = null,
        private val apiStatic: ApiStaticValue? = null,
        private val apiRelativeDateTime: ApiRelativeDateTimeValue? = null,
        private val apiTimestamp: ApiTimestampValue? = null,
        private val apiIncrement: ApiIncrementValue? = null,
        private val apiFetchedObjectProperty: ApiFetchedObjectPropertyValue? = null,
        private val apiAppendObjectProperty: ApiAppendObjectPropertyValue? = null,
        private val apiStaticAppend: ApiStaticAppendValue? = null,
        private val apiEnrollmentEventProperty: ApiEnrollmentEventPropertyValue? = null,
        private val _json: JsonValue? = null,
    ) {

        fun apiActionData(): Optional<ApiActionDataValue> = Optional.ofNullable(apiActionData)

        fun apiObjectProperty(): Optional<ApiObjectPropertyValue> =
            Optional.ofNullable(apiObjectProperty)

        fun apiStatic(): Optional<ApiStaticValue> = Optional.ofNullable(apiStatic)

        fun apiRelativeDateTime(): Optional<ApiRelativeDateTimeValue> =
            Optional.ofNullable(apiRelativeDateTime)

        fun apiTimestamp(): Optional<ApiTimestampValue> = Optional.ofNullable(apiTimestamp)

        fun apiIncrement(): Optional<ApiIncrementValue> = Optional.ofNullable(apiIncrement)

        fun apiFetchedObjectProperty(): Optional<ApiFetchedObjectPropertyValue> =
            Optional.ofNullable(apiFetchedObjectProperty)

        fun apiAppendObjectProperty(): Optional<ApiAppendObjectPropertyValue> =
            Optional.ofNullable(apiAppendObjectProperty)

        fun apiStaticAppend(): Optional<ApiStaticAppendValue> = Optional.ofNullable(apiStaticAppend)

        fun apiEnrollmentEventProperty(): Optional<ApiEnrollmentEventPropertyValue> =
            Optional.ofNullable(apiEnrollmentEventProperty)

        fun isApiActionData(): Boolean = apiActionData != null

        fun isApiObjectProperty(): Boolean = apiObjectProperty != null

        fun isApiStatic(): Boolean = apiStatic != null

        fun isApiRelativeDateTime(): Boolean = apiRelativeDateTime != null

        fun isApiTimestamp(): Boolean = apiTimestamp != null

        fun isApiIncrement(): Boolean = apiIncrement != null

        fun isApiFetchedObjectProperty(): Boolean = apiFetchedObjectProperty != null

        fun isApiAppendObjectProperty(): Boolean = apiAppendObjectProperty != null

        fun isApiStaticAppend(): Boolean = apiStaticAppend != null

        fun isApiEnrollmentEventProperty(): Boolean = apiEnrollmentEventProperty != null

        fun asApiActionData(): ApiActionDataValue = apiActionData.getOrThrow("apiActionData")

        fun asApiObjectProperty(): ApiObjectPropertyValue =
            apiObjectProperty.getOrThrow("apiObjectProperty")

        fun asApiStatic(): ApiStaticValue = apiStatic.getOrThrow("apiStatic")

        fun asApiRelativeDateTime(): ApiRelativeDateTimeValue =
            apiRelativeDateTime.getOrThrow("apiRelativeDateTime")

        fun asApiTimestamp(): ApiTimestampValue = apiTimestamp.getOrThrow("apiTimestamp")

        fun asApiIncrement(): ApiIncrementValue = apiIncrement.getOrThrow("apiIncrement")

        fun asApiFetchedObjectProperty(): ApiFetchedObjectPropertyValue =
            apiFetchedObjectProperty.getOrThrow("apiFetchedObjectProperty")

        fun asApiAppendObjectProperty(): ApiAppendObjectPropertyValue =
            apiAppendObjectProperty.getOrThrow("apiAppendObjectProperty")

        fun asApiStaticAppend(): ApiStaticAppendValue =
            apiStaticAppend.getOrThrow("apiStaticAppend")

        fun asApiEnrollmentEventProperty(): ApiEnrollmentEventPropertyValue =
            apiEnrollmentEventProperty.getOrThrow("apiEnrollmentEventProperty")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                apiActionData != null -> visitor.visitApiActionData(apiActionData)
                apiObjectProperty != null -> visitor.visitApiObjectProperty(apiObjectProperty)
                apiStatic != null -> visitor.visitApiStatic(apiStatic)
                apiRelativeDateTime != null -> visitor.visitApiRelativeDateTime(apiRelativeDateTime)
                apiTimestamp != null -> visitor.visitApiTimestamp(apiTimestamp)
                apiIncrement != null -> visitor.visitApiIncrement(apiIncrement)
                apiFetchedObjectProperty != null ->
                    visitor.visitApiFetchedObjectProperty(apiFetchedObjectProperty)
                apiAppendObjectProperty != null ->
                    visitor.visitApiAppendObjectProperty(apiAppendObjectProperty)
                apiStaticAppend != null -> visitor.visitApiStaticAppend(apiStaticAppend)
                apiEnrollmentEventProperty != null ->
                    visitor.visitApiEnrollmentEventProperty(apiEnrollmentEventProperty)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): InputValue = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitApiActionData(apiActionData: ApiActionDataValue) {
                        apiActionData.validate()
                    }

                    override fun visitApiObjectProperty(apiObjectProperty: ApiObjectPropertyValue) {
                        apiObjectProperty.validate()
                    }

                    override fun visitApiStatic(apiStatic: ApiStaticValue) {
                        apiStatic.validate()
                    }

                    override fun visitApiRelativeDateTime(
                        apiRelativeDateTime: ApiRelativeDateTimeValue
                    ) {
                        apiRelativeDateTime.validate()
                    }

                    override fun visitApiTimestamp(apiTimestamp: ApiTimestampValue) {
                        apiTimestamp.validate()
                    }

                    override fun visitApiIncrement(apiIncrement: ApiIncrementValue) {
                        apiIncrement.validate()
                    }

                    override fun visitApiFetchedObjectProperty(
                        apiFetchedObjectProperty: ApiFetchedObjectPropertyValue
                    ) {
                        apiFetchedObjectProperty.validate()
                    }

                    override fun visitApiAppendObjectProperty(
                        apiAppendObjectProperty: ApiAppendObjectPropertyValue
                    ) {
                        apiAppendObjectProperty.validate()
                    }

                    override fun visitApiStaticAppend(apiStaticAppend: ApiStaticAppendValue) {
                        apiStaticAppend.validate()
                    }

                    override fun visitApiEnrollmentEventProperty(
                        apiEnrollmentEventProperty: ApiEnrollmentEventPropertyValue
                    ) {
                        apiEnrollmentEventProperty.validate()
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
                    override fun visitApiActionData(apiActionData: ApiActionDataValue) =
                        apiActionData.validity()

                    override fun visitApiObjectProperty(apiObjectProperty: ApiObjectPropertyValue) =
                        apiObjectProperty.validity()

                    override fun visitApiStatic(apiStatic: ApiStaticValue) = apiStatic.validity()

                    override fun visitApiRelativeDateTime(
                        apiRelativeDateTime: ApiRelativeDateTimeValue
                    ) = apiRelativeDateTime.validity()

                    override fun visitApiTimestamp(apiTimestamp: ApiTimestampValue) =
                        apiTimestamp.validity()

                    override fun visitApiIncrement(apiIncrement: ApiIncrementValue) =
                        apiIncrement.validity()

                    override fun visitApiFetchedObjectProperty(
                        apiFetchedObjectProperty: ApiFetchedObjectPropertyValue
                    ) = apiFetchedObjectProperty.validity()

                    override fun visitApiAppendObjectProperty(
                        apiAppendObjectProperty: ApiAppendObjectPropertyValue
                    ) = apiAppendObjectProperty.validity()

                    override fun visitApiStaticAppend(apiStaticAppend: ApiStaticAppendValue) =
                        apiStaticAppend.validity()

                    override fun visitApiEnrollmentEventProperty(
                        apiEnrollmentEventProperty: ApiEnrollmentEventPropertyValue
                    ) = apiEnrollmentEventProperty.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is InputValue &&
                apiActionData == other.apiActionData &&
                apiObjectProperty == other.apiObjectProperty &&
                apiStatic == other.apiStatic &&
                apiRelativeDateTime == other.apiRelativeDateTime &&
                apiTimestamp == other.apiTimestamp &&
                apiIncrement == other.apiIncrement &&
                apiFetchedObjectProperty == other.apiFetchedObjectProperty &&
                apiAppendObjectProperty == other.apiAppendObjectProperty &&
                apiStaticAppend == other.apiStaticAppend &&
                apiEnrollmentEventProperty == other.apiEnrollmentEventProperty
        }

        override fun hashCode(): Int =
            Objects.hash(
                apiActionData,
                apiObjectProperty,
                apiStatic,
                apiRelativeDateTime,
                apiTimestamp,
                apiIncrement,
                apiFetchedObjectProperty,
                apiAppendObjectProperty,
                apiStaticAppend,
                apiEnrollmentEventProperty,
            )

        override fun toString(): String =
            when {
                apiActionData != null -> "InputValue{apiActionData=$apiActionData}"
                apiObjectProperty != null -> "InputValue{apiObjectProperty=$apiObjectProperty}"
                apiStatic != null -> "InputValue{apiStatic=$apiStatic}"
                apiRelativeDateTime != null ->
                    "InputValue{apiRelativeDateTime=$apiRelativeDateTime}"
                apiTimestamp != null -> "InputValue{apiTimestamp=$apiTimestamp}"
                apiIncrement != null -> "InputValue{apiIncrement=$apiIncrement}"
                apiFetchedObjectProperty != null ->
                    "InputValue{apiFetchedObjectProperty=$apiFetchedObjectProperty}"
                apiAppendObjectProperty != null ->
                    "InputValue{apiAppendObjectProperty=$apiAppendObjectProperty}"
                apiStaticAppend != null -> "InputValue{apiStaticAppend=$apiStaticAppend}"
                apiEnrollmentEventProperty != null ->
                    "InputValue{apiEnrollmentEventProperty=$apiEnrollmentEventProperty}"
                _json != null -> "InputValue{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid InputValue")
            }

        companion object {

            @JvmStatic
            fun ofApiActionData(apiActionData: ApiActionDataValue) =
                InputValue(apiActionData = apiActionData)

            @JvmStatic
            fun ofApiObjectProperty(apiObjectProperty: ApiObjectPropertyValue) =
                InputValue(apiObjectProperty = apiObjectProperty)

            @JvmStatic
            fun ofApiStatic(apiStatic: ApiStaticValue) = InputValue(apiStatic = apiStatic)

            @JvmStatic
            fun ofApiRelativeDateTime(apiRelativeDateTime: ApiRelativeDateTimeValue) =
                InputValue(apiRelativeDateTime = apiRelativeDateTime)

            @JvmStatic
            fun ofApiTimestamp(apiTimestamp: ApiTimestampValue) =
                InputValue(apiTimestamp = apiTimestamp)

            @JvmStatic
            fun ofApiIncrement(apiIncrement: ApiIncrementValue) =
                InputValue(apiIncrement = apiIncrement)

            @JvmStatic
            fun ofApiFetchedObjectProperty(
                apiFetchedObjectProperty: ApiFetchedObjectPropertyValue
            ) = InputValue(apiFetchedObjectProperty = apiFetchedObjectProperty)

            @JvmStatic
            fun ofApiAppendObjectProperty(apiAppendObjectProperty: ApiAppendObjectPropertyValue) =
                InputValue(apiAppendObjectProperty = apiAppendObjectProperty)

            @JvmStatic
            fun ofApiStaticAppend(apiStaticAppend: ApiStaticAppendValue) =
                InputValue(apiStaticAppend = apiStaticAppend)

            @JvmStatic
            fun ofApiEnrollmentEventProperty(
                apiEnrollmentEventProperty: ApiEnrollmentEventPropertyValue
            ) = InputValue(apiEnrollmentEventProperty = apiEnrollmentEventProperty)
        }

        /**
         * An interface that defines how to map each variant of [InputValue] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitApiActionData(apiActionData: ApiActionDataValue): T

            fun visitApiObjectProperty(apiObjectProperty: ApiObjectPropertyValue): T

            fun visitApiStatic(apiStatic: ApiStaticValue): T

            fun visitApiRelativeDateTime(apiRelativeDateTime: ApiRelativeDateTimeValue): T

            fun visitApiTimestamp(apiTimestamp: ApiTimestampValue): T

            fun visitApiIncrement(apiIncrement: ApiIncrementValue): T

            fun visitApiFetchedObjectProperty(
                apiFetchedObjectProperty: ApiFetchedObjectPropertyValue
            ): T

            fun visitApiAppendObjectProperty(
                apiAppendObjectProperty: ApiAppendObjectPropertyValue
            ): T

            fun visitApiStaticAppend(apiStaticAppend: ApiStaticAppendValue): T

            fun visitApiEnrollmentEventProperty(
                apiEnrollmentEventProperty: ApiEnrollmentEventPropertyValue
            ): T

            /**
             * Maps an unknown variant of [InputValue] to a value of type [T].
             *
             * An instance of [InputValue] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws HubspotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubspotInvalidDataException("Unknown InputValue: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<InputValue>(InputValue::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): InputValue {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<ApiActionDataValue>())?.let {
                                InputValue(apiActionData = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ApiObjectPropertyValue>())?.let {
                                InputValue(apiObjectProperty = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ApiStaticValue>())?.let {
                                InputValue(apiStatic = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ApiRelativeDateTimeValue>())?.let {
                                InputValue(apiRelativeDateTime = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ApiTimestampValue>())?.let {
                                InputValue(apiTimestamp = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ApiIncrementValue>())?.let {
                                InputValue(apiIncrement = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ApiFetchedObjectPropertyValue>())
                                ?.let { InputValue(apiFetchedObjectProperty = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<ApiAppendObjectPropertyValue>())
                                ?.let { InputValue(apiAppendObjectProperty = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<ApiStaticAppendValue>())?.let {
                                InputValue(apiStaticAppend = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ApiEnrollmentEventPropertyValue>())
                                ?.let { InputValue(apiEnrollmentEventProperty = it, _json = json) },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> InputValue(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<InputValue>(InputValue::class) {

            override fun serialize(
                value: InputValue,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.apiActionData != null -> generator.writeObject(value.apiActionData)
                    value.apiObjectProperty != null ->
                        generator.writeObject(value.apiObjectProperty)
                    value.apiStatic != null -> generator.writeObject(value.apiStatic)
                    value.apiRelativeDateTime != null ->
                        generator.writeObject(value.apiRelativeDateTime)
                    value.apiTimestamp != null -> generator.writeObject(value.apiTimestamp)
                    value.apiIncrement != null -> generator.writeObject(value.apiIncrement)
                    value.apiFetchedObjectProperty != null ->
                        generator.writeObject(value.apiFetchedObjectProperty)
                    value.apiAppendObjectProperty != null ->
                        generator.writeObject(value.apiAppendObjectProperty)
                    value.apiStaticAppend != null -> generator.writeObject(value.apiStaticAppend)
                    value.apiEnrollmentEventProperty != null ->
                        generator.writeObject(value.apiEnrollmentEventProperty)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid InputValue")
                }
            }
        }
    }

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

            @JvmField val STATIC_BRANCH = of("STATIC_BRANCH")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            STATIC_BRANCH
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
            STATIC_BRANCH,
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
                STATIC_BRANCH -> Value.STATIC_BRANCH
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
                STATIC_BRANCH -> Known.STATIC_BRANCH
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

        return other is ApiStaticBranchAction &&
            actionId == other.actionId &&
            inputValue == other.inputValue &&
            staticBranches == other.staticBranches &&
            type == other.type &&
            defaultBranch == other.defaultBranch &&
            defaultBranchName == other.defaultBranchName &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            actionId,
            inputValue,
            staticBranches,
            type,
            defaultBranch,
            defaultBranchName,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ApiStaticBranchAction{actionId=$actionId, inputValue=$inputValue, staticBranches=$staticBranches, type=$type, defaultBranch=$defaultBranch, defaultBranchName=$defaultBranchName, additionalProperties=$additionalProperties}"
}
