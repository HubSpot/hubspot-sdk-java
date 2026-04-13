// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.actions

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
import com.hubspot.sdk.core.BaseDeserializer
import com.hubspot.sdk.core.BaseSerializer
import com.hubspot.sdk.core.Enum
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.allMaxBy
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.getOrThrow
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ArrayFieldSchema
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val items: JsonField<Items>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("items") @ExcludeMissing items: JsonField<Items> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(items, type, mutableMapOf())

    /**
     * Defines the type of elements contained within the array, which can be an integer, long,
     * double, string, boolean, another array, or an object.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun items(): Items = items.getRequired("items")

    /**
     * Specifies that the field is of type 'ARRAY'.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Returns the raw JSON value of [items].
     *
     * Unlike [items], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("items") @ExcludeMissing fun _items(): JsonField<Items> = items

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
         * Returns a mutable builder for constructing an instance of [ArrayFieldSchema].
         *
         * The following fields are required:
         * ```java
         * .items()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ArrayFieldSchema]. */
    class Builder internal constructor() {

        private var items: JsonField<Items>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(arrayFieldSchema: ArrayFieldSchema) = apply {
            items = arrayFieldSchema.items
            type = arrayFieldSchema.type
            additionalProperties = arrayFieldSchema.additionalProperties.toMutableMap()
        }

        /**
         * Defines the type of elements contained within the array, which can be an integer, long,
         * double, string, boolean, another array, or an object.
         */
        fun items(items: Items) = items(JsonField.of(items))

        /**
         * Sets [Builder.items] to an arbitrary JSON value.
         *
         * You should usually call [Builder.items] with a well-typed [Items] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun items(items: JsonField<Items>) = apply { this.items = items }

        /** Alias for calling [items] with `Items.ofIntegerFieldSchema(integerFieldSchema)`. */
        fun items(integerFieldSchema: IntegerFieldSchema) =
            items(Items.ofIntegerFieldSchema(integerFieldSchema))

        /** Alias for calling [items] with `Items.ofLongFieldSchema(longFieldSchema)`. */
        fun items(longFieldSchema: LongFieldSchema) =
            items(Items.ofLongFieldSchema(longFieldSchema))

        /** Alias for calling [items] with `Items.ofDoubleFieldSchema(doubleFieldSchema)`. */
        fun items(doubleFieldSchema: DoubleFieldSchema) =
            items(Items.ofDoubleFieldSchema(doubleFieldSchema))

        /** Alias for calling [items] with `Items.ofStringFieldSchema(stringFieldSchema)`. */
        fun items(stringFieldSchema: StringFieldSchema) =
            items(Items.ofStringFieldSchema(stringFieldSchema))

        /** Alias for calling [items] with `Items.ofBooleanFieldSchema(booleanFieldSchema)`. */
        fun items(booleanFieldSchema: BooleanFieldSchema) =
            items(Items.ofBooleanFieldSchema(booleanFieldSchema))

        /** Alias for calling [items] with `Items.ofArrayFieldSchema(arrayFieldSchema)`. */
        fun items(arrayFieldSchema: ArrayFieldSchema) =
            items(Items.ofArrayFieldSchema(arrayFieldSchema))

        /** Alias for calling [items] with `Items.ofObjectFieldSchema(objectFieldSchema)`. */
        fun items(objectFieldSchema: ObjectFieldSchema) =
            items(Items.ofObjectFieldSchema(objectFieldSchema))

        /** Specifies that the field is of type 'ARRAY'. */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

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
         * Returns an immutable instance of [ArrayFieldSchema].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .items()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ArrayFieldSchema =
            ArrayFieldSchema(
                checkRequired("items", items),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ArrayFieldSchema = apply {
        if (validated) {
            return@apply
        }

        items().validate()
        type().validate()
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
        (items.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * Defines the type of elements contained within the array, which can be an integer, long,
     * double, string, boolean, another array, or an object.
     */
    @JsonDeserialize(using = Items.Deserializer::class)
    @JsonSerialize(using = Items.Serializer::class)
    class Items
    private constructor(
        private val integerFieldSchema: IntegerFieldSchema? = null,
        private val longFieldSchema: LongFieldSchema? = null,
        private val doubleFieldSchema: DoubleFieldSchema? = null,
        private val stringFieldSchema: StringFieldSchema? = null,
        private val booleanFieldSchema: BooleanFieldSchema? = null,
        private val arrayFieldSchema: ArrayFieldSchema? = null,
        private val objectFieldSchema: ObjectFieldSchema? = null,
        private val _json: JsonValue? = null,
    ) {

        fun integerFieldSchema(): Optional<IntegerFieldSchema> =
            Optional.ofNullable(integerFieldSchema)

        fun longFieldSchema(): Optional<LongFieldSchema> = Optional.ofNullable(longFieldSchema)

        fun doubleFieldSchema(): Optional<DoubleFieldSchema> =
            Optional.ofNullable(doubleFieldSchema)

        fun stringFieldSchema(): Optional<StringFieldSchema> =
            Optional.ofNullable(stringFieldSchema)

        fun booleanFieldSchema(): Optional<BooleanFieldSchema> =
            Optional.ofNullable(booleanFieldSchema)

        fun arrayFieldSchema(): Optional<ArrayFieldSchema> = Optional.ofNullable(arrayFieldSchema)

        fun objectFieldSchema(): Optional<ObjectFieldSchema> =
            Optional.ofNullable(objectFieldSchema)

        fun isIntegerFieldSchema(): Boolean = integerFieldSchema != null

        fun isLongFieldSchema(): Boolean = longFieldSchema != null

        fun isDoubleFieldSchema(): Boolean = doubleFieldSchema != null

        fun isStringFieldSchema(): Boolean = stringFieldSchema != null

        fun isBooleanFieldSchema(): Boolean = booleanFieldSchema != null

        fun isArrayFieldSchema(): Boolean = arrayFieldSchema != null

        fun isObjectFieldSchema(): Boolean = objectFieldSchema != null

        fun asIntegerFieldSchema(): IntegerFieldSchema =
            integerFieldSchema.getOrThrow("integerFieldSchema")

        fun asLongFieldSchema(): LongFieldSchema = longFieldSchema.getOrThrow("longFieldSchema")

        fun asDoubleFieldSchema(): DoubleFieldSchema =
            doubleFieldSchema.getOrThrow("doubleFieldSchema")

        fun asStringFieldSchema(): StringFieldSchema =
            stringFieldSchema.getOrThrow("stringFieldSchema")

        fun asBooleanFieldSchema(): BooleanFieldSchema =
            booleanFieldSchema.getOrThrow("booleanFieldSchema")

        fun asArrayFieldSchema(): ArrayFieldSchema = arrayFieldSchema.getOrThrow("arrayFieldSchema")

        fun asObjectFieldSchema(): ObjectFieldSchema =
            objectFieldSchema.getOrThrow("objectFieldSchema")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                integerFieldSchema != null -> visitor.visitIntegerFieldSchema(integerFieldSchema)
                longFieldSchema != null -> visitor.visitLongFieldSchema(longFieldSchema)
                doubleFieldSchema != null -> visitor.visitDoubleFieldSchema(doubleFieldSchema)
                stringFieldSchema != null -> visitor.visitStringFieldSchema(stringFieldSchema)
                booleanFieldSchema != null -> visitor.visitBooleanFieldSchema(booleanFieldSchema)
                arrayFieldSchema != null -> visitor.visitArrayFieldSchema(arrayFieldSchema)
                objectFieldSchema != null -> visitor.visitObjectFieldSchema(objectFieldSchema)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Items = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitIntegerFieldSchema(integerFieldSchema: IntegerFieldSchema) {
                        integerFieldSchema.validate()
                    }

                    override fun visitLongFieldSchema(longFieldSchema: LongFieldSchema) {
                        longFieldSchema.validate()
                    }

                    override fun visitDoubleFieldSchema(doubleFieldSchema: DoubleFieldSchema) {
                        doubleFieldSchema.validate()
                    }

                    override fun visitStringFieldSchema(stringFieldSchema: StringFieldSchema) {
                        stringFieldSchema.validate()
                    }

                    override fun visitBooleanFieldSchema(booleanFieldSchema: BooleanFieldSchema) {
                        booleanFieldSchema.validate()
                    }

                    override fun visitArrayFieldSchema(arrayFieldSchema: ArrayFieldSchema) {
                        arrayFieldSchema.validate()
                    }

                    override fun visitObjectFieldSchema(objectFieldSchema: ObjectFieldSchema) {
                        objectFieldSchema.validate()
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
                    override fun visitIntegerFieldSchema(integerFieldSchema: IntegerFieldSchema) =
                        integerFieldSchema.validity()

                    override fun visitLongFieldSchema(longFieldSchema: LongFieldSchema) =
                        longFieldSchema.validity()

                    override fun visitDoubleFieldSchema(doubleFieldSchema: DoubleFieldSchema) =
                        doubleFieldSchema.validity()

                    override fun visitStringFieldSchema(stringFieldSchema: StringFieldSchema) =
                        stringFieldSchema.validity()

                    override fun visitBooleanFieldSchema(booleanFieldSchema: BooleanFieldSchema) =
                        booleanFieldSchema.validity()

                    override fun visitArrayFieldSchema(arrayFieldSchema: ArrayFieldSchema) =
                        arrayFieldSchema.validity()

                    override fun visitObjectFieldSchema(objectFieldSchema: ObjectFieldSchema) =
                        objectFieldSchema.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Items &&
                integerFieldSchema == other.integerFieldSchema &&
                longFieldSchema == other.longFieldSchema &&
                doubleFieldSchema == other.doubleFieldSchema &&
                stringFieldSchema == other.stringFieldSchema &&
                booleanFieldSchema == other.booleanFieldSchema &&
                arrayFieldSchema == other.arrayFieldSchema &&
                objectFieldSchema == other.objectFieldSchema
        }

        override fun hashCode(): Int =
            Objects.hash(
                integerFieldSchema,
                longFieldSchema,
                doubleFieldSchema,
                stringFieldSchema,
                booleanFieldSchema,
                arrayFieldSchema,
                objectFieldSchema,
            )

        override fun toString(): String =
            when {
                integerFieldSchema != null -> "Items{integerFieldSchema=$integerFieldSchema}"
                longFieldSchema != null -> "Items{longFieldSchema=$longFieldSchema}"
                doubleFieldSchema != null -> "Items{doubleFieldSchema=$doubleFieldSchema}"
                stringFieldSchema != null -> "Items{stringFieldSchema=$stringFieldSchema}"
                booleanFieldSchema != null -> "Items{booleanFieldSchema=$booleanFieldSchema}"
                arrayFieldSchema != null -> "Items{arrayFieldSchema=$arrayFieldSchema}"
                objectFieldSchema != null -> "Items{objectFieldSchema=$objectFieldSchema}"
                _json != null -> "Items{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Items")
            }

        companion object {

            @JvmStatic
            fun ofIntegerFieldSchema(integerFieldSchema: IntegerFieldSchema) =
                Items(integerFieldSchema = integerFieldSchema)

            @JvmStatic
            fun ofLongFieldSchema(longFieldSchema: LongFieldSchema) =
                Items(longFieldSchema = longFieldSchema)

            @JvmStatic
            fun ofDoubleFieldSchema(doubleFieldSchema: DoubleFieldSchema) =
                Items(doubleFieldSchema = doubleFieldSchema)

            @JvmStatic
            fun ofStringFieldSchema(stringFieldSchema: StringFieldSchema) =
                Items(stringFieldSchema = stringFieldSchema)

            @JvmStatic
            fun ofBooleanFieldSchema(booleanFieldSchema: BooleanFieldSchema) =
                Items(booleanFieldSchema = booleanFieldSchema)

            @JvmStatic
            fun ofArrayFieldSchema(arrayFieldSchema: ArrayFieldSchema) =
                Items(arrayFieldSchema = arrayFieldSchema)

            @JvmStatic
            fun ofObjectFieldSchema(objectFieldSchema: ObjectFieldSchema) =
                Items(objectFieldSchema = objectFieldSchema)
        }

        /** An interface that defines how to map each variant of [Items] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitIntegerFieldSchema(integerFieldSchema: IntegerFieldSchema): T

            fun visitLongFieldSchema(longFieldSchema: LongFieldSchema): T

            fun visitDoubleFieldSchema(doubleFieldSchema: DoubleFieldSchema): T

            fun visitStringFieldSchema(stringFieldSchema: StringFieldSchema): T

            fun visitBooleanFieldSchema(booleanFieldSchema: BooleanFieldSchema): T

            fun visitArrayFieldSchema(arrayFieldSchema: ArrayFieldSchema): T

            fun visitObjectFieldSchema(objectFieldSchema: ObjectFieldSchema): T

            /**
             * Maps an unknown variant of [Items] to a value of type [T].
             *
             * An instance of [Items] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws HubSpotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubSpotInvalidDataException("Unknown Items: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Items>(Items::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Items {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<IntegerFieldSchema>())?.let {
                                Items(integerFieldSchema = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<LongFieldSchema>())?.let {
                                Items(longFieldSchema = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<DoubleFieldSchema>())?.let {
                                Items(doubleFieldSchema = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<StringFieldSchema>())?.let {
                                Items(stringFieldSchema = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<BooleanFieldSchema>())?.let {
                                Items(booleanFieldSchema = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ArrayFieldSchema>())?.let {
                                Items(arrayFieldSchema = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ObjectFieldSchema>())?.let {
                                Items(objectFieldSchema = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Items(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Items>(Items::class) {

            override fun serialize(
                value: Items,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.integerFieldSchema != null ->
                        generator.writeObject(value.integerFieldSchema)
                    value.longFieldSchema != null -> generator.writeObject(value.longFieldSchema)
                    value.doubleFieldSchema != null ->
                        generator.writeObject(value.doubleFieldSchema)
                    value.stringFieldSchema != null ->
                        generator.writeObject(value.stringFieldSchema)
                    value.booleanFieldSchema != null ->
                        generator.writeObject(value.booleanFieldSchema)
                    value.arrayFieldSchema != null -> generator.writeObject(value.arrayFieldSchema)
                    value.objectFieldSchema != null ->
                        generator.writeObject(value.objectFieldSchema)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Items")
                }
            }
        }
    }

    /** Specifies that the field is of type 'ARRAY'. */
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

            @JvmField val ARRAY = of("ARRAY")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            ARRAY
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
            ARRAY,
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
                ARRAY -> Value.ARRAY
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
                ARRAY -> Known.ARRAY
                else -> throw HubSpotInvalidDataException("Unknown Type: $value")
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ArrayFieldSchema &&
            items == other.items &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(items, type, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ArrayFieldSchema{items=$items, type=$type, additionalProperties=$additionalProperties}"
}
