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
import com.hubspot.sdk.core.getOrThrow
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@JsonDeserialize(using = UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3.Deserializer::class)
@JsonSerialize(using = UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3.Serializer::class)
class UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3
private constructor(
    private val randomAccess: RandomAccessCollectionResponseWithTotalHubDbTableRowV3? = null,
    private val streaming: StreamingCollectionResponseWithTotalHubDbTableRowV3? = null,
    private val _json: JsonValue? = null,
) {

    fun randomAccess(): Optional<RandomAccessCollectionResponseWithTotalHubDbTableRowV3> =
        Optional.ofNullable(randomAccess)

    fun streaming(): Optional<StreamingCollectionResponseWithTotalHubDbTableRowV3> =
        Optional.ofNullable(streaming)

    fun isRandomAccess(): Boolean = randomAccess != null

    fun isStreaming(): Boolean = streaming != null

    fun asRandomAccess(): RandomAccessCollectionResponseWithTotalHubDbTableRowV3 =
        randomAccess.getOrThrow("randomAccess")

    fun asStreaming(): StreamingCollectionResponseWithTotalHubDbTableRowV3 =
        streaming.getOrThrow("streaming")

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
     * Optional<String> result = unifiedCollectionResponseWithTotalBaseHubDbTableRowV3.accept(new UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3.Visitor<Optional<String>>() {
     *     @Override
     *     public Optional<String> visitRandomAccess(RandomAccessCollectionResponseWithTotalHubDbTableRowV3 randomAccess) {
     *         return Optional.of(randomAccess.toString());
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
            randomAccess != null -> visitor.visitRandomAccess(randomAccess)
            streaming != null -> visitor.visitStreaming(streaming)
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
    fun validate(): UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3 = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitRandomAccess(
                    randomAccess: RandomAccessCollectionResponseWithTotalHubDbTableRowV3
                ) {
                    randomAccess.validate()
                }

                override fun visitStreaming(
                    streaming: StreamingCollectionResponseWithTotalHubDbTableRowV3
                ) {
                    streaming.validate()
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
                override fun visitRandomAccess(
                    randomAccess: RandomAccessCollectionResponseWithTotalHubDbTableRowV3
                ) = randomAccess.validity()

                override fun visitStreaming(
                    streaming: StreamingCollectionResponseWithTotalHubDbTableRowV3
                ) = streaming.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3 &&
            randomAccess == other.randomAccess &&
            streaming == other.streaming
    }

    override fun hashCode(): Int = Objects.hash(randomAccess, streaming)

    override fun toString(): String =
        when {
            randomAccess != null ->
                "UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3{randomAccess=$randomAccess}"
            streaming != null ->
                "UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3{streaming=$streaming}"
            _json != null ->
                "UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3{_unknown=$_json}"
            else ->
                throw IllegalStateException(
                    "Invalid UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3"
                )
        }

    companion object {

        @JvmStatic
        fun ofRandomAccess(randomAccess: RandomAccessCollectionResponseWithTotalHubDbTableRowV3) =
            UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3(randomAccess = randomAccess)

        @JvmStatic
        fun ofStreaming(streaming: StreamingCollectionResponseWithTotalHubDbTableRowV3) =
            UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3(streaming = streaming)
    }

    /**
     * An interface that defines how to map each variant of
     * [UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3] to a value of type [T].
     */
    interface Visitor<out T> {

        fun visitRandomAccess(
            randomAccess: RandomAccessCollectionResponseWithTotalHubDbTableRowV3
        ): T

        fun visitStreaming(streaming: StreamingCollectionResponseWithTotalHubDbTableRowV3): T

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
            val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

            when (type) {
                "RANDOM_ACCESS" -> {
                    return tryDeserialize(
                            node,
                            jacksonTypeRef<RandomAccessCollectionResponseWithTotalHubDbTableRowV3>(),
                        )
                        ?.let {
                            UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3(
                                randomAccess = it,
                                _json = json,
                            )
                        } ?: UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3(_json = json)
                }
                "STREAMING" -> {
                    return tryDeserialize(
                            node,
                            jacksonTypeRef<StreamingCollectionResponseWithTotalHubDbTableRowV3>(),
                        )
                        ?.let {
                            UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3(
                                streaming = it,
                                _json = json,
                            )
                        } ?: UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3(_json = json)
                }
            }

            return UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3(_json = json)
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
                value.randomAccess != null -> generator.writeObject(value.randomAccess)
                value.streaming != null -> generator.writeObject(value.streaming)
                value._json != null -> generator.writeObject(value._json)
                else ->
                    throw IllegalStateException(
                        "Invalid UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3"
                    )
            }
        }
    }
}
