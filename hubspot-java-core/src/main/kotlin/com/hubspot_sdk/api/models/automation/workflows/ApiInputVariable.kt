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
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.getOrThrow
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ApiInputVariable
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val name: JsonField<String>,
    private val value: JsonField<Value>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing value: JsonField<Value> = JsonMissing.of(),
    ) : this(name, value, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun value(): Value = value.getRequired("value")

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [value].
     *
     * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Value> = value

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
         * Returns a mutable builder for constructing an instance of [ApiInputVariable].
         *
         * The following fields are required:
         * ```java
         * .name()
         * .value()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ApiInputVariable]. */
    class Builder internal constructor() {

        private var name: JsonField<String>? = null
        private var value: JsonField<Value>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(apiInputVariable: ApiInputVariable) = apply {
            name = apiInputVariable.name
            value = apiInputVariable.value
            additionalProperties = apiInputVariable.additionalProperties.toMutableMap()
        }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun value(value: Value) = value(JsonField.of(value))

        /**
         * Sets [Builder.value] to an arbitrary JSON value.
         *
         * You should usually call [Builder.value] with a well-typed [Value] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun value(value: JsonField<Value>) = apply { this.value = value }

        /** Alias for calling [value] with `Value.ofApiActionData(apiActionData)`. */
        fun value(apiActionData: ApiActionDataValue) = value(Value.ofApiActionData(apiActionData))

        /** Alias for calling [value] with `Value.ofApiObjectProperty(apiObjectProperty)`. */
        fun value(apiObjectProperty: ApiObjectPropertyValue) =
            value(Value.ofApiObjectProperty(apiObjectProperty))

        /** Alias for calling [value] with `Value.ofApiStatic(apiStatic)`. */
        fun value(apiStatic: ApiStaticValue) = value(Value.ofApiStatic(apiStatic))

        /** Alias for calling [value] with `Value.ofApiRelativeDateTime(apiRelativeDateTime)`. */
        fun value(apiRelativeDateTime: ApiRelativeDateTimeValue) =
            value(Value.ofApiRelativeDateTime(apiRelativeDateTime))

        /** Alias for calling [value] with `Value.ofApiTimestamp(apiTimestamp)`. */
        fun value(apiTimestamp: ApiTimestampValue) = value(Value.ofApiTimestamp(apiTimestamp))

        /** Alias for calling [value] with `Value.ofApiIncrement(apiIncrement)`. */
        fun value(apiIncrement: ApiIncrementValue) = value(Value.ofApiIncrement(apiIncrement))

        /**
         * Alias for calling [value] with
         * `Value.ofApiFetchedObjectProperty(apiFetchedObjectProperty)`.
         */
        fun value(apiFetchedObjectProperty: ApiFetchedObjectPropertyValue) =
            value(Value.ofApiFetchedObjectProperty(apiFetchedObjectProperty))

        /**
         * Alias for calling [value] with
         * `Value.ofApiAppendObjectProperty(apiAppendObjectProperty)`.
         */
        fun value(apiAppendObjectProperty: ApiAppendObjectPropertyValue) =
            value(Value.ofApiAppendObjectProperty(apiAppendObjectProperty))

        /** Alias for calling [value] with `Value.ofApiStaticAppend(apiStaticAppend)`. */
        fun value(apiStaticAppend: ApiStaticAppendValue) =
            value(Value.ofApiStaticAppend(apiStaticAppend))

        /**
         * Alias for calling [value] with
         * `Value.ofApiEnrollmentEventProperty(apiEnrollmentEventProperty)`.
         */
        fun value(apiEnrollmentEventProperty: ApiEnrollmentEventPropertyValue) =
            value(Value.ofApiEnrollmentEventProperty(apiEnrollmentEventProperty))

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
         * Returns an immutable instance of [ApiInputVariable].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .name()
         * .value()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ApiInputVariable =
            ApiInputVariable(
                checkRequired("name", name),
                checkRequired("value", value),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ApiInputVariable = apply {
        if (validated) {
            return@apply
        }

        name()
        value().validate()
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
        (if (name.asKnown().isPresent) 1 else 0) + (value.asKnown().getOrNull()?.validity() ?: 0)

    @JsonDeserialize(using = Value.Deserializer::class)
    @JsonSerialize(using = Value.Serializer::class)
    class Value
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

        fun validate(): Value = apply {
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

            return other is Value &&
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
                apiActionData != null -> "Value{apiActionData=$apiActionData}"
                apiObjectProperty != null -> "Value{apiObjectProperty=$apiObjectProperty}"
                apiStatic != null -> "Value{apiStatic=$apiStatic}"
                apiRelativeDateTime != null -> "Value{apiRelativeDateTime=$apiRelativeDateTime}"
                apiTimestamp != null -> "Value{apiTimestamp=$apiTimestamp}"
                apiIncrement != null -> "Value{apiIncrement=$apiIncrement}"
                apiFetchedObjectProperty != null ->
                    "Value{apiFetchedObjectProperty=$apiFetchedObjectProperty}"
                apiAppendObjectProperty != null ->
                    "Value{apiAppendObjectProperty=$apiAppendObjectProperty}"
                apiStaticAppend != null -> "Value{apiStaticAppend=$apiStaticAppend}"
                apiEnrollmentEventProperty != null ->
                    "Value{apiEnrollmentEventProperty=$apiEnrollmentEventProperty}"
                _json != null -> "Value{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Value")
            }

        companion object {

            @JvmStatic
            fun ofApiActionData(apiActionData: ApiActionDataValue) =
                Value(apiActionData = apiActionData)

            @JvmStatic
            fun ofApiObjectProperty(apiObjectProperty: ApiObjectPropertyValue) =
                Value(apiObjectProperty = apiObjectProperty)

            @JvmStatic fun ofApiStatic(apiStatic: ApiStaticValue) = Value(apiStatic = apiStatic)

            @JvmStatic
            fun ofApiRelativeDateTime(apiRelativeDateTime: ApiRelativeDateTimeValue) =
                Value(apiRelativeDateTime = apiRelativeDateTime)

            @JvmStatic
            fun ofApiTimestamp(apiTimestamp: ApiTimestampValue) = Value(apiTimestamp = apiTimestamp)

            @JvmStatic
            fun ofApiIncrement(apiIncrement: ApiIncrementValue) = Value(apiIncrement = apiIncrement)

            @JvmStatic
            fun ofApiFetchedObjectProperty(
                apiFetchedObjectProperty: ApiFetchedObjectPropertyValue
            ) = Value(apiFetchedObjectProperty = apiFetchedObjectProperty)

            @JvmStatic
            fun ofApiAppendObjectProperty(apiAppendObjectProperty: ApiAppendObjectPropertyValue) =
                Value(apiAppendObjectProperty = apiAppendObjectProperty)

            @JvmStatic
            fun ofApiStaticAppend(apiStaticAppend: ApiStaticAppendValue) =
                Value(apiStaticAppend = apiStaticAppend)

            @JvmStatic
            fun ofApiEnrollmentEventProperty(
                apiEnrollmentEventProperty: ApiEnrollmentEventPropertyValue
            ) = Value(apiEnrollmentEventProperty = apiEnrollmentEventProperty)
        }

        /** An interface that defines how to map each variant of [Value] to a value of type [T]. */
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
             * Maps an unknown variant of [Value] to a value of type [T].
             *
             * An instance of [Value] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws HubspotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubspotInvalidDataException("Unknown Value: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Value>(Value::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Value {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<ApiActionDataValue>())?.let {
                                Value(apiActionData = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ApiObjectPropertyValue>())?.let {
                                Value(apiObjectProperty = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ApiStaticValue>())?.let {
                                Value(apiStatic = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ApiRelativeDateTimeValue>())?.let {
                                Value(apiRelativeDateTime = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ApiTimestampValue>())?.let {
                                Value(apiTimestamp = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ApiIncrementValue>())?.let {
                                Value(apiIncrement = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ApiFetchedObjectPropertyValue>())
                                ?.let { Value(apiFetchedObjectProperty = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<ApiAppendObjectPropertyValue>())
                                ?.let { Value(apiAppendObjectProperty = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<ApiStaticAppendValue>())?.let {
                                Value(apiStaticAppend = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ApiEnrollmentEventPropertyValue>())
                                ?.let { Value(apiEnrollmentEventProperty = it, _json = json) },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Value(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Value>(Value::class) {

            override fun serialize(
                value: Value,
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
                    else -> throw IllegalStateException("Invalid Value")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ApiInputVariable &&
            name == other.name &&
            value == other.value &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(name, value, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ApiInputVariable{name=$name, value=$value, additionalProperties=$additionalProperties}"
}
