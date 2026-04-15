// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.auth.oauth

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

@JsonDeserialize(using = TokenInfoResponseBaseIf.Deserializer::class)
@JsonSerialize(using = TokenInfoResponseBaseIf.Serializer::class)
class TokenInfoResponseBaseIf
private constructor(
    private val publicAccessTokenInfoResponse: PublicAccessTokenInfoResponse? = null,
    private val publicRefreshTokenInfoResponse: PublicRefreshTokenInfoResponse? = null,
    private val _json: JsonValue? = null,
) {

    fun publicAccessTokenInfoResponse(): Optional<PublicAccessTokenInfoResponse> =
        Optional.ofNullable(publicAccessTokenInfoResponse)

    fun publicRefreshTokenInfoResponse(): Optional<PublicRefreshTokenInfoResponse> =
        Optional.ofNullable(publicRefreshTokenInfoResponse)

    fun isPublicAccessTokenInfoResponse(): Boolean = publicAccessTokenInfoResponse != null

    fun isPublicRefreshTokenInfoResponse(): Boolean = publicRefreshTokenInfoResponse != null

    fun asPublicAccessTokenInfoResponse(): PublicAccessTokenInfoResponse =
        publicAccessTokenInfoResponse.getOrThrow("publicAccessTokenInfoResponse")

    fun asPublicRefreshTokenInfoResponse(): PublicRefreshTokenInfoResponse =
        publicRefreshTokenInfoResponse.getOrThrow("publicRefreshTokenInfoResponse")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            publicAccessTokenInfoResponse != null ->
                visitor.visitPublicAccessTokenInfoResponse(publicAccessTokenInfoResponse)
            publicRefreshTokenInfoResponse != null ->
                visitor.visitPublicRefreshTokenInfoResponse(publicRefreshTokenInfoResponse)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): TokenInfoResponseBaseIf = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitPublicAccessTokenInfoResponse(
                    publicAccessTokenInfoResponse: PublicAccessTokenInfoResponse
                ) {
                    publicAccessTokenInfoResponse.validate()
                }

                override fun visitPublicRefreshTokenInfoResponse(
                    publicRefreshTokenInfoResponse: PublicRefreshTokenInfoResponse
                ) {
                    publicRefreshTokenInfoResponse.validate()
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
                override fun visitPublicAccessTokenInfoResponse(
                    publicAccessTokenInfoResponse: PublicAccessTokenInfoResponse
                ) = publicAccessTokenInfoResponse.validity()

                override fun visitPublicRefreshTokenInfoResponse(
                    publicRefreshTokenInfoResponse: PublicRefreshTokenInfoResponse
                ) = publicRefreshTokenInfoResponse.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TokenInfoResponseBaseIf &&
            publicAccessTokenInfoResponse == other.publicAccessTokenInfoResponse &&
            publicRefreshTokenInfoResponse == other.publicRefreshTokenInfoResponse
    }

    override fun hashCode(): Int =
        Objects.hash(publicAccessTokenInfoResponse, publicRefreshTokenInfoResponse)

    override fun toString(): String =
        when {
            publicAccessTokenInfoResponse != null ->
                "TokenInfoResponseBaseIf{publicAccessTokenInfoResponse=$publicAccessTokenInfoResponse}"
            publicRefreshTokenInfoResponse != null ->
                "TokenInfoResponseBaseIf{publicRefreshTokenInfoResponse=$publicRefreshTokenInfoResponse}"
            _json != null -> "TokenInfoResponseBaseIf{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid TokenInfoResponseBaseIf")
        }

    companion object {

        @JvmStatic
        fun ofPublicAccessTokenInfoResponse(
            publicAccessTokenInfoResponse: PublicAccessTokenInfoResponse
        ) = TokenInfoResponseBaseIf(publicAccessTokenInfoResponse = publicAccessTokenInfoResponse)

        @JvmStatic
        fun ofPublicRefreshTokenInfoResponse(
            publicRefreshTokenInfoResponse: PublicRefreshTokenInfoResponse
        ) = TokenInfoResponseBaseIf(publicRefreshTokenInfoResponse = publicRefreshTokenInfoResponse)
    }

    /**
     * An interface that defines how to map each variant of [TokenInfoResponseBaseIf] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        fun visitPublicAccessTokenInfoResponse(
            publicAccessTokenInfoResponse: PublicAccessTokenInfoResponse
        ): T

        fun visitPublicRefreshTokenInfoResponse(
            publicRefreshTokenInfoResponse: PublicRefreshTokenInfoResponse
        ): T

        /**
         * Maps an unknown variant of [TokenInfoResponseBaseIf] to a value of type [T].
         *
         * An instance of [TokenInfoResponseBaseIf] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws HubSpotInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw HubSpotInvalidDataException("Unknown TokenInfoResponseBaseIf: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<TokenInfoResponseBaseIf>(TokenInfoResponseBaseIf::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): TokenInfoResponseBaseIf {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<PublicAccessTokenInfoResponse>())?.let {
                            TokenInfoResponseBaseIf(
                                publicAccessTokenInfoResponse = it,
                                _json = json,
                            )
                        },
                        tryDeserialize(node, jacksonTypeRef<PublicRefreshTokenInfoResponse>())
                            ?.let {
                                TokenInfoResponseBaseIf(
                                    publicRefreshTokenInfoResponse = it,
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
                0 -> TokenInfoResponseBaseIf(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<TokenInfoResponseBaseIf>(TokenInfoResponseBaseIf::class) {

        override fun serialize(
            value: TokenInfoResponseBaseIf,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.publicAccessTokenInfoResponse != null ->
                    generator.writeObject(value.publicAccessTokenInfoResponse)
                value.publicRefreshTokenInfoResponse != null ->
                    generator.writeObject(value.publicRefreshTokenInfoResponse)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid TokenInfoResponseBaseIf")
            }
        }
    }
}
