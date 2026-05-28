// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.auth.oauth

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class TokenResponseIfTest {

    @Test
    fun ofAccessToken() {
        val accessToken =
            AccessTokenResponse.builder()
                .accessToken("access_token")
                .expiresIn(0L)
                .refreshToken("refresh_token")
                .tokenType("token_type")
                .tokenUse(AccessTokenResponse.TokenUse.ACCESS_TOKEN)
                .hubId(0)
                .idToken("id_token")
                .addScope("string")
                .userId(0)
                .build()

        val tokenResponseIf = TokenResponseIf.ofAccessToken(accessToken)

        assertThat(tokenResponseIf.accessToken()).contains(accessToken)
        assertThat(tokenResponseIf.clientCredentials()).isEmpty
    }

    @Test
    fun ofAccessTokenRoundtrip() {
        val jsonMapper = jsonMapper()
        val tokenResponseIf =
            TokenResponseIf.ofAccessToken(
                AccessTokenResponse.builder()
                    .accessToken("access_token")
                    .expiresIn(0L)
                    .refreshToken("refresh_token")
                    .tokenType("token_type")
                    .tokenUse(AccessTokenResponse.TokenUse.ACCESS_TOKEN)
                    .hubId(0)
                    .idToken("id_token")
                    .addScope("string")
                    .userId(0)
                    .build()
            )

        val roundtrippedTokenResponseIf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tokenResponseIf),
                jacksonTypeRef<TokenResponseIf>(),
            )

        assertThat(roundtrippedTokenResponseIf).isEqualTo(tokenResponseIf)
    }

    @Test
    fun ofClientCredentials() {
        val clientCredentials =
            ClientCredentialsTokenResponse.builder()
                .accessToken("access_token")
                .expiresIn(0L)
                .tokenType("token_type")
                .tokenUse(ClientCredentialsTokenResponse.TokenUse.CLIENT_CREDENTIALS)
                .hubId(0)
                .idToken("id_token")
                .addScope("string")
                .userId(0)
                .build()

        val tokenResponseIf = TokenResponseIf.ofClientCredentials(clientCredentials)

        assertThat(tokenResponseIf.accessToken()).isEmpty
        assertThat(tokenResponseIf.clientCredentials()).contains(clientCredentials)
    }

    @Test
    fun ofClientCredentialsRoundtrip() {
        val jsonMapper = jsonMapper()
        val tokenResponseIf =
            TokenResponseIf.ofClientCredentials(
                ClientCredentialsTokenResponse.builder()
                    .accessToken("access_token")
                    .expiresIn(0L)
                    .tokenType("token_type")
                    .tokenUse(ClientCredentialsTokenResponse.TokenUse.CLIENT_CREDENTIALS)
                    .hubId(0)
                    .idToken("id_token")
                    .addScope("string")
                    .userId(0)
                    .build()
            )

        val roundtrippedTokenResponseIf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tokenResponseIf),
                jacksonTypeRef<TokenResponseIf>(),
            )

        assertThat(roundtrippedTokenResponseIf).isEqualTo(tokenResponseIf)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val tokenResponseIf =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<TokenResponseIf>())

        val e = assertThrows<HubSpotInvalidDataException> { tokenResponseIf.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
