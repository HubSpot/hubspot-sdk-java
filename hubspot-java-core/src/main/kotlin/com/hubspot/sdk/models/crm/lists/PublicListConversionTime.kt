// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.BaseDeserializer
import com.hubspot.sdk.core.BaseSerializer
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.getOrThrow
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@JsonDeserialize(using = PublicListConversionTime.Deserializer::class)
@JsonSerialize(using = PublicListConversionTime.Serializer::class)
class PublicListConversionTime
private constructor(
    private val conversionDate: PublicListConversionDate? = null,
    private val inactivity: PublicListConversionInactivity? = null,
    private val _json: JsonValue? = null,
) {

    fun conversionDate(): Optional<PublicListConversionDate> = Optional.ofNullable(conversionDate)

    fun inactivity(): Optional<PublicListConversionInactivity> = Optional.ofNullable(inactivity)

    fun isConversionDate(): Boolean = conversionDate != null

    fun isInactivity(): Boolean = inactivity != null

    fun asConversionDate(): PublicListConversionDate = conversionDate.getOrThrow("conversionDate")

    fun asInactivity(): PublicListConversionInactivity = inactivity.getOrThrow("inactivity")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    /**
     * Maps this instance's current variant to a value of type [T] using the given [visitor].
     *
     * Note that this method is _not_ forwards compatible with new variants from the API, unless
     * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of the
     * SDK gracefully, consider overriding [Visitor.unknown]:
     * ```java
     * import com.hubspot.sdk.core.JsonValue;
     * import java.util.Optional;
     *
     * Optional<String> result = publicListConversionTime.accept(new PublicListConversionTime.Visitor<Optional<String>>() {
     *     @Override
     *     public Optional<String> visitConversionDate(PublicListConversionDate conversionDate) {
     *         return Optional.of(conversionDate.toString());
     *     }
     *
     *     // ...
     *
     *     @Override
     *     public Optional<String> unknown(JsonValue json) {
     *         // Or inspect the `json`.
     *         return Optional.empty();
     *     }
     * });
     * ```
     *
     * @throws HubSpotInvalidDataException if [Visitor.unknown] is not overridden in [visitor] and
     *   the current variant is unknown.
     */
    fun <T> accept(visitor: Visitor<T>): T =
        when {
            conversionDate != null -> visitor.visitConversionDate(conversionDate)
            inactivity != null -> visitor.visitInactivity(inactivity)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): PublicListConversionTime = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitConversionDate(conversionDate: PublicListConversionDate) {
                    conversionDate.validate()
                }

                override fun visitInactivity(inactivity: PublicListConversionInactivity) {
                    inactivity.validate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitConversionDate(conversionDate: PublicListConversionDate) =
                    conversionDate.validity()

                override fun visitInactivity(inactivity: PublicListConversionInactivity) =
                    inactivity.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicListConversionTime &&
            conversionDate == other.conversionDate &&
            inactivity == other.inactivity
    }

    override fun hashCode(): Int = Objects.hash(conversionDate, inactivity)

    override fun toString(): String =
        when {
            conversionDate != null -> "PublicListConversionTime{conversionDate=$conversionDate}"
            inactivity != null -> "PublicListConversionTime{inactivity=$inactivity}"
            _json != null -> "PublicListConversionTime{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid PublicListConversionTime")
        }

    companion object {

        @JvmStatic
        fun ofConversionDate(conversionDate: PublicListConversionDate) =
            PublicListConversionTime(conversionDate = conversionDate)

        @JvmStatic
        fun ofInactivity(inactivity: PublicListConversionInactivity) =
            PublicListConversionTime(inactivity = inactivity)
    }

    /**
     * An interface that defines how to map each variant of [PublicListConversionTime] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        fun visitConversionDate(conversionDate: PublicListConversionDate): T

        fun visitInactivity(inactivity: PublicListConversionInactivity): T

        /**
         * Maps an unknown variant of [PublicListConversionTime] to a value of type [T].
         *
         * An instance of [PublicListConversionTime] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws HubSpotInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw HubSpotInvalidDataException("Unknown PublicListConversionTime: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<PublicListConversionTime>(PublicListConversionTime::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): PublicListConversionTime {
            val json = JsonValue.fromJsonNode(node)
            val conversionType =
                json.asObject().getOrNull()?.get("conversionType")?.asString()?.getOrNull()

            when (conversionType) {
                "CONVERSION_DATE" -> {
                    return tryDeserialize(node, jacksonTypeRef<PublicListConversionDate>())?.let {
                        PublicListConversionTime(conversionDate = it, _json = json)
                    } ?: PublicListConversionTime(_json = json)
                }
                "INACTIVITY" -> {
                    return tryDeserialize(node, jacksonTypeRef<PublicListConversionInactivity>())
                        ?.let { PublicListConversionTime(inactivity = it, _json = json) }
                        ?: PublicListConversionTime(_json = json)
                }
            }

            return PublicListConversionTime(_json = json)
        }
    }

    internal class Serializer :
        BaseSerializer<PublicListConversionTime>(PublicListConversionTime::class) {

        override fun serialize(
            value: PublicListConversionTime,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.conversionDate != null -> generator.writeObject(value.conversionDate)
                value.inactivity != null -> generator.writeObject(value.inactivity)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid PublicListConversionTime")
            }
        }
    }
}
