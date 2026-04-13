// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.lists

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.BaseDeserializer
import com.hubspot.core.BaseSerializer
import com.hubspot.core.JsonValue
import com.hubspot.core.allMaxBy
import com.hubspot.core.getOrThrow
import com.hubspot.errors.HubSpotInvalidDataException
import java.util.Objects
import java.util.Optional

@JsonDeserialize(using = PublicListConversionTime.Deserializer::class)
@JsonSerialize(using = PublicListConversionTime.Serializer::class)
class PublicListConversionTime
private constructor(
    private val date: PublicListConversionDate? = null,
    private val inactivity: PublicListConversionInactivity? = null,
    private val _json: JsonValue? = null,
) {

    fun date(): Optional<PublicListConversionDate> = Optional.ofNullable(date)

    fun inactivity(): Optional<PublicListConversionInactivity> = Optional.ofNullable(inactivity)

    fun isDate(): Boolean = date != null

    fun isInactivity(): Boolean = inactivity != null

    fun asDate(): PublicListConversionDate = date.getOrThrow("date")

    fun asInactivity(): PublicListConversionInactivity = inactivity.getOrThrow("inactivity")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            date != null -> visitor.visitDate(date)
            inactivity != null -> visitor.visitInactivity(inactivity)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): PublicListConversionTime = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitDate(date: PublicListConversionDate) {
                    date.validate()
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
                override fun visitDate(date: PublicListConversionDate) = date.validity()

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
            date == other.date &&
            inactivity == other.inactivity
    }

    override fun hashCode(): Int = Objects.hash(date, inactivity)

    override fun toString(): String =
        when {
            date != null -> "PublicListConversionTime{date=$date}"
            inactivity != null -> "PublicListConversionTime{inactivity=$inactivity}"
            _json != null -> "PublicListConversionTime{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid PublicListConversionTime")
        }

    companion object {

        @JvmStatic
        fun ofDate(date: PublicListConversionDate) = PublicListConversionTime(date = date)

        @JvmStatic
        fun ofInactivity(inactivity: PublicListConversionInactivity) =
            PublicListConversionTime(inactivity = inactivity)
    }

    /**
     * An interface that defines how to map each variant of [PublicListConversionTime] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        fun visitDate(date: PublicListConversionDate): T

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

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<PublicListConversionDate>())?.let {
                            PublicListConversionTime(date = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<PublicListConversionInactivity>())
                            ?.let { PublicListConversionTime(inactivity = it, _json = json) },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> PublicListConversionTime(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
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
                value.date != null -> generator.writeObject(value.date)
                value.inactivity != null -> generator.writeObject(value.inactivity)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid PublicListConversionTime")
            }
        }
    }
}
