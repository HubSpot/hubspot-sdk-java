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
import com.hubspot.sdk.core.getOrThrow
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@JsonDeserialize(using = TokenInfoResponseBaseIf.Deserializer::class)
@JsonSerialize(using = TokenInfoResponseBaseIf.Serializer::class)
class TokenInfoResponseBaseIf
private constructor(
    private val accessToken: PublicAccessTokenInfoResponse? = null,
    private val refreshToken: PublicRefreshTokenInfoResponse? = null,
    private val _json: JsonValue? = null,
) {

    fun accessToken(): Optional<PublicAccessTokenInfoResponse> = Optional.ofNullable(accessToken)

    fun refreshToken(): Optional<PublicRefreshTokenInfoResponse> = Optional.ofNullable(refreshToken)

    fun isAccessToken(): Boolean = accessToken != null

    fun isRefreshToken(): Boolean = refreshToken != null

    fun asAccessToken(): PublicAccessTokenInfoResponse = accessToken.getOrThrow("accessToken")

    fun asRefreshToken(): PublicRefreshTokenInfoResponse = refreshToken.getOrThrow("refreshToken")

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
     * Optional<String> result = tokenInfoResponseBaseIf.accept(new TokenInfoResponseBaseIf.Visitor<Optional<String>>() {
     *     @Override
     *     public Optional<String> visitAccessToken(PublicAccessTokenInfoResponse accessToken) {
     *         return Optional.of(accessToken.toString());
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
            accessToken != null -> visitor.visitAccessToken(accessToken)
            refreshToken != null -> visitor.visitRefreshToken(refreshToken)
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
    fun validate(): TokenInfoResponseBaseIf = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitAccessToken(accessToken: PublicAccessTokenInfoResponse) {
                    accessToken.validate()
                }

                override fun visitRefreshToken(refreshToken: PublicRefreshTokenInfoResponse) {
                    refreshToken.validate()
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
                override fun visitAccessToken(accessToken: PublicAccessTokenInfoResponse) =
                    accessToken.validity()

                override fun visitRefreshToken(refreshToken: PublicRefreshTokenInfoResponse) =
                    refreshToken.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TokenInfoResponseBaseIf &&
            accessToken == other.accessToken &&
            refreshToken == other.refreshToken
    }

    override fun hashCode(): Int = Objects.hash(accessToken, refreshToken)

    override fun toString(): String =
        when {
            accessToken != null -> "TokenInfoResponseBaseIf{accessToken=$accessToken}"
            refreshToken != null -> "TokenInfoResponseBaseIf{refreshToken=$refreshToken}"
            _json != null -> "TokenInfoResponseBaseIf{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid TokenInfoResponseBaseIf")
        }

    companion object {

        @JvmStatic
        fun ofAccessToken(accessToken: PublicAccessTokenInfoResponse) =
            TokenInfoResponseBaseIf(accessToken = accessToken)

        @JvmStatic
        fun ofRefreshToken(refreshToken: PublicRefreshTokenInfoResponse) =
            TokenInfoResponseBaseIf(refreshToken = refreshToken)
    }

    /**
     * An interface that defines how to map each variant of [TokenInfoResponseBaseIf] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        fun visitAccessToken(accessToken: PublicAccessTokenInfoResponse): T

        fun visitRefreshToken(refreshToken: PublicRefreshTokenInfoResponse): T

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
            val tokenUse = json.asObject().getOrNull()?.get("token_use")?.asString()?.getOrNull()

            when (tokenUse) {
                "access_token" -> {
                    return tryDeserialize(node, jacksonTypeRef<PublicAccessTokenInfoResponse>())
                        ?.let { TokenInfoResponseBaseIf(accessToken = it, _json = json) }
                        ?: TokenInfoResponseBaseIf(_json = json)
                }
                "refresh_token" -> {
                    return tryDeserialize(node, jacksonTypeRef<PublicRefreshTokenInfoResponse>())
                        ?.let { TokenInfoResponseBaseIf(refreshToken = it, _json = json) }
                        ?: TokenInfoResponseBaseIf(_json = json)
                }
            }

            return TokenInfoResponseBaseIf(_json = json)
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
                value.accessToken != null -> generator.writeObject(value.accessToken)
                value.refreshToken != null -> generator.writeObject(value.refreshToken)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid TokenInfoResponseBaseIf")
            }
        }
    }
}
