// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.hubdb

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
import com.hubspot.sdk.core.allMaxBy
import com.hubspot.sdk.core.getOrThrow
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Objects
import java.util.Optional

@JsonDeserialize(using = UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3.Deserializer::class)
@JsonSerialize(using = UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3.Serializer::class)
class UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3
private constructor(
    private val randomAccessCollectionResponseWithTotal:
        RandomAccessCollectionResponseWithTotalHubDbTableRowV3? =
        null,
    private val streamingCollectionResponseWithTotal:
        StreamingCollectionResponseWithTotalHubDbTableRowV3? =
        null,
    private val _json: JsonValue? = null,
) {

    fun randomAccessCollectionResponseWithTotal():
        Optional<RandomAccessCollectionResponseWithTotalHubDbTableRowV3> =
        Optional.ofNullable(randomAccessCollectionResponseWithTotal)

    fun streamingCollectionResponseWithTotal():
        Optional<StreamingCollectionResponseWithTotalHubDbTableRowV3> =
        Optional.ofNullable(streamingCollectionResponseWithTotal)

    fun isRandomAccessCollectionResponseWithTotal(): Boolean =
        randomAccessCollectionResponseWithTotal != null

    fun isStreamingCollectionResponseWithTotal(): Boolean =
        streamingCollectionResponseWithTotal != null

    fun asRandomAccessCollectionResponseWithTotal():
        RandomAccessCollectionResponseWithTotalHubDbTableRowV3 =
        randomAccessCollectionResponseWithTotal.getOrThrow(
            "randomAccessCollectionResponseWithTotal"
        )

    fun asStreamingCollectionResponseWithTotal():
        StreamingCollectionResponseWithTotalHubDbTableRowV3 =
        streamingCollectionResponseWithTotal.getOrThrow("streamingCollectionResponseWithTotal")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            randomAccessCollectionResponseWithTotal != null ->
                visitor.visitRandomAccessCollectionResponseWithTotal(
                    randomAccessCollectionResponseWithTotal
                )
            streamingCollectionResponseWithTotal != null ->
                visitor.visitStreamingCollectionResponseWithTotal(
                    streamingCollectionResponseWithTotal
                )
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3 = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitRandomAccessCollectionResponseWithTotal(
                    randomAccessCollectionResponseWithTotal:
                        RandomAccessCollectionResponseWithTotalHubDbTableRowV3
                ) {
                    randomAccessCollectionResponseWithTotal.validate()
                }

                override fun visitStreamingCollectionResponseWithTotal(
                    streamingCollectionResponseWithTotal:
                        StreamingCollectionResponseWithTotalHubDbTableRowV3
                ) {
                    streamingCollectionResponseWithTotal.validate()
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
                override fun visitRandomAccessCollectionResponseWithTotal(
                    randomAccessCollectionResponseWithTotal:
                        RandomAccessCollectionResponseWithTotalHubDbTableRowV3
                ) = randomAccessCollectionResponseWithTotal.validity()

                override fun visitStreamingCollectionResponseWithTotal(
                    streamingCollectionResponseWithTotal:
                        StreamingCollectionResponseWithTotalHubDbTableRowV3
                ) = streamingCollectionResponseWithTotal.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3 &&
            randomAccessCollectionResponseWithTotal ==
                other.randomAccessCollectionResponseWithTotal &&
            streamingCollectionResponseWithTotal == other.streamingCollectionResponseWithTotal
    }

    override fun hashCode(): Int =
        Objects.hash(randomAccessCollectionResponseWithTotal, streamingCollectionResponseWithTotal)

    override fun toString(): String =
        when {
            randomAccessCollectionResponseWithTotal != null ->
                "UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3{randomAccessCollectionResponseWithTotal=$randomAccessCollectionResponseWithTotal}"
            streamingCollectionResponseWithTotal != null ->
                "UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3{streamingCollectionResponseWithTotal=$streamingCollectionResponseWithTotal}"
            _json != null ->
                "UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3{_unknown=$_json}"
            else ->
                throw IllegalStateException(
                    "Invalid UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3"
                )
        }

    companion object {

        @JvmStatic
        fun ofRandomAccessCollectionResponseWithTotal(
            randomAccessCollectionResponseWithTotal:
                RandomAccessCollectionResponseWithTotalHubDbTableRowV3
        ) =
            UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3(
                randomAccessCollectionResponseWithTotal = randomAccessCollectionResponseWithTotal
            )

        @JvmStatic
        fun ofStreamingCollectionResponseWithTotal(
            streamingCollectionResponseWithTotal:
                StreamingCollectionResponseWithTotalHubDbTableRowV3
        ) =
            UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3(
                streamingCollectionResponseWithTotal = streamingCollectionResponseWithTotal
            )
    }

    /**
     * An interface that defines how to map each variant of
     * [UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3] to a value of type [T].
     */
    interface Visitor<out T> {

        fun visitRandomAccessCollectionResponseWithTotal(
            randomAccessCollectionResponseWithTotal:
                RandomAccessCollectionResponseWithTotalHubDbTableRowV3
        ): T

        fun visitStreamingCollectionResponseWithTotal(
            streamingCollectionResponseWithTotal:
                StreamingCollectionResponseWithTotalHubDbTableRowV3
        ): T

        /**
         * Maps an unknown variant of [UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3] to a
         * value of type [T].
         *
         * An instance of [UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3] can contain an
         * unknown variant if it was deserialized from data that doesn't match any known variant.
         * For example, if the SDK is on an older version than the API, then the API may respond
         * with new variants that the SDK is unaware of.
         *
         * @throws HubSpotInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw HubSpotInvalidDataException(
                "Unknown UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3: $json"
            )
        }
    }

    internal class Deserializer :
        BaseDeserializer<UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3>(
            UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3::class
        ) {

        override fun ObjectCodec.deserialize(
            node: JsonNode
        ): UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3 {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(
                                node,
                                jacksonTypeRef<
                                    RandomAccessCollectionResponseWithTotalHubDbTableRowV3
                                >(),
                            )
                            ?.let {
                                UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3(
                                    randomAccessCollectionResponseWithTotal = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<
                                    StreamingCollectionResponseWithTotalHubDbTableRowV3
                                >(),
                            )
                            ?.let {
                                UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3(
                                    streamingCollectionResponseWithTotal = it,
                                    _json = json,
                                )
                            },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3>(
            UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3::class
        ) {

        override fun serialize(
            value: UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.randomAccessCollectionResponseWithTotal != null ->
                    generator.writeObject(value.randomAccessCollectionResponseWithTotal)
                value.streamingCollectionResponseWithTotal != null ->
                    generator.writeObject(value.streamingCollectionResponseWithTotal)
                value._json != null -> generator.writeObject(value._json)
                else ->
                    throw IllegalStateException(
                        "Invalid UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3"
                    )
            }
        }
    }
}
