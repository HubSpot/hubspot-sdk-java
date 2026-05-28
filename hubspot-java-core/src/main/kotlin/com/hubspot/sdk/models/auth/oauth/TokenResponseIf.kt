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

@JsonDeserialize(using = TokenResponseIf.Deserializer::class)
@JsonSerialize(using = TokenResponseIf.Serializer::class)
class TokenResponseIf
private constructor(
    private val accessToken: AccessTokenResponse? = null,
    private val clientCredentials: ClientCredentialsTokenResponse? = null,
    private val _json: JsonValue? = null,
) {

    fun accessToken(): Optional<AccessTokenResponse> = Optional.ofNullable(accessToken)

    fun clientCredentials(): Optional<ClientCredentialsTokenResponse> =
        Optional.ofNullable(clientCredentials)

    fun isAccessToken(): Boolean = accessToken != null

    fun isClientCredentials(): Boolean = clientCredentials != null

    fun asAccessToken(): AccessTokenResponse = accessToken.getOrThrow("accessToken")

    fun asClientCredentials(): ClientCredentialsTokenResponse =
        clientCredentials.getOrThrow("clientCredentials")

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
     * Optional<String> result = tokenResponseIf.accept(new TokenResponseIf.Visitor<Optional<String>>() {
     *     @Override
     *     public Optional<String> visitAccessToken(AccessTokenResponse accessToken) {
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
            clientCredentials != null -> visitor.visitClientCredentials(clientCredentials)
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
    fun validate(): TokenResponseIf = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitAccessToken(accessToken: AccessTokenResponse) {
                    accessToken.validate()
                }

                override fun visitClientCredentials(
                    clientCredentials: ClientCredentialsTokenResponse
                ) {
                    clientCredentials.validate()
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
                override fun visitAccessToken(accessToken: AccessTokenResponse) =
                    accessToken.validity()

                override fun visitClientCredentials(
                    clientCredentials: ClientCredentialsTokenResponse
                ) = clientCredentials.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TokenResponseIf &&
            accessToken == other.accessToken &&
            clientCredentials == other.clientCredentials
    }

    override fun hashCode(): Int = Objects.hash(accessToken, clientCredentials)

    override fun toString(): String =
        when {
            accessToken != null -> "TokenResponseIf{accessToken=$accessToken}"
            clientCredentials != null -> "TokenResponseIf{clientCredentials=$clientCredentials}"
            _json != null -> "TokenResponseIf{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid TokenResponseIf")
        }

    companion object {

        @JvmStatic
        fun ofAccessToken(accessToken: AccessTokenResponse) =
            TokenResponseIf(accessToken = accessToken)

        @JvmStatic
        fun ofClientCredentials(clientCredentials: ClientCredentialsTokenResponse) =
            TokenResponseIf(clientCredentials = clientCredentials)
    }

    /**
     * An interface that defines how to map each variant of [TokenResponseIf] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        fun visitAccessToken(accessToken: AccessTokenResponse): T

        fun visitClientCredentials(clientCredentials: ClientCredentialsTokenResponse): T

        /**
         * Maps an unknown variant of [TokenResponseIf] to a value of type [T].
         *
         * An instance of [TokenResponseIf] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws HubSpotInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw HubSpotInvalidDataException("Unknown TokenResponseIf: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<TokenResponseIf>(TokenResponseIf::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): TokenResponseIf {
            val json = JsonValue.fromJsonNode(node)
            val tokenUse = json.asObject().getOrNull()?.get("token_use")?.asString()?.getOrNull()

            when (tokenUse) {
                "access_token" -> {
                    return tryDeserialize(node, jacksonTypeRef<AccessTokenResponse>())?.let {
                        TokenResponseIf(accessToken = it, _json = json)
                    } ?: TokenResponseIf(_json = json)
                }
                "client_credentials" -> {
                    return tryDeserialize(node, jacksonTypeRef<ClientCredentialsTokenResponse>())
                        ?.let { TokenResponseIf(clientCredentials = it, _json = json) }
                        ?: TokenResponseIf(_json = json)
                }
            }

            return TokenResponseIf(_json = json)
        }
    }

    internal class Serializer : BaseSerializer<TokenResponseIf>(TokenResponseIf::class) {

        override fun serialize(
            value: TokenResponseIf,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.accessToken != null -> generator.writeObject(value.accessToken)
                value.clientCredentials != null -> generator.writeObject(value.clientCredentials)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid TokenResponseIf")
            }
        }
    }
}
