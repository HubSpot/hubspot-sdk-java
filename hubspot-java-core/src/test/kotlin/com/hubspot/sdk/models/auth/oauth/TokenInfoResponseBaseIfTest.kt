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

internal class TokenInfoResponseBaseIfTest {

    @Test
    fun ofAccessToken() {
        val accessToken =
            PublicAccessTokenInfoResponse.builder()
                .token("token")
                .active(true)
                .appId(0)
                .clientId("client_id")
                .expiresIn(0L)
                .hubId(0)
                .isPrivateDistribution(true)
                .addScope("string")
                .signedAccessToken(
                    SignedAccessToken.builder()
                        .appId(0)
                        .expiresAt(0L)
                        .hubId(0)
                        .hublet("hublet")
                        .installingUserId(0)
                        .isPrivateDistribution(true)
                        .isServiceAccount(true)
                        .isUserLevel(true)
                        .newSignature("newSignature")
                        .scopes("scopes")
                        .scopeToScopeGroupPks("scopeToScopeGroupPks")
                        .signature("signature")
                        .trialScopes("trialScopes")
                        .trialScopeToScopeGroupPks("trialScopeToScopeGroupPks")
                        .userId(0)
                        .build()
                )
                .tokenType("token_type")
                .tokenUse(PublicAccessTokenInfoResponse.TokenUse.ACCESS_TOKEN)
                .userId(0)
                .hubDomain("hub_domain")
                .user("user")
                .build()

        val tokenInfoResponseBaseIf = TokenInfoResponseBaseIf.ofAccessToken(accessToken)

        assertThat(tokenInfoResponseBaseIf.accessToken()).contains(accessToken)
        assertThat(tokenInfoResponseBaseIf.refreshToken()).isEmpty
    }

    @Test
    fun ofAccessTokenRoundtrip() {
        val jsonMapper = jsonMapper()
        val tokenInfoResponseBaseIf =
            TokenInfoResponseBaseIf.ofAccessToken(
                PublicAccessTokenInfoResponse.builder()
                    .token("token")
                    .active(true)
                    .appId(0)
                    .clientId("client_id")
                    .expiresIn(0L)
                    .hubId(0)
                    .isPrivateDistribution(true)
                    .addScope("string")
                    .signedAccessToken(
                        SignedAccessToken.builder()
                            .appId(0)
                            .expiresAt(0L)
                            .hubId(0)
                            .hublet("hublet")
                            .installingUserId(0)
                            .isPrivateDistribution(true)
                            .isServiceAccount(true)
                            .isUserLevel(true)
                            .newSignature("newSignature")
                            .scopes("scopes")
                            .scopeToScopeGroupPks("scopeToScopeGroupPks")
                            .signature("signature")
                            .trialScopes("trialScopes")
                            .trialScopeToScopeGroupPks("trialScopeToScopeGroupPks")
                            .userId(0)
                            .build()
                    )
                    .tokenType("token_type")
                    .tokenUse(PublicAccessTokenInfoResponse.TokenUse.ACCESS_TOKEN)
                    .userId(0)
                    .hubDomain("hub_domain")
                    .user("user")
                    .build()
            )

        val roundtrippedTokenInfoResponseBaseIf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tokenInfoResponseBaseIf),
                jacksonTypeRef<TokenInfoResponseBaseIf>(),
            )

        assertThat(roundtrippedTokenInfoResponseBaseIf).isEqualTo(tokenInfoResponseBaseIf)
    }

    @Test
    fun ofRefreshToken() {
        val refreshToken =
            PublicRefreshTokenInfoResponse.builder()
                .token("token")
                .active(true)
                .appId(0)
                .clientId("client_id")
                .hubId(0)
                .addScope("string")
                .tokenType("token_type")
                .tokenUse(PublicRefreshTokenInfoResponse.TokenUse.REFRESH_TOKEN)
                .userId(0)
                .hubDomain("hub_domain")
                .user("user")
                .build()

        val tokenInfoResponseBaseIf = TokenInfoResponseBaseIf.ofRefreshToken(refreshToken)

        assertThat(tokenInfoResponseBaseIf.accessToken()).isEmpty
        assertThat(tokenInfoResponseBaseIf.refreshToken()).contains(refreshToken)
    }

    @Test
    fun ofRefreshTokenRoundtrip() {
        val jsonMapper = jsonMapper()
        val tokenInfoResponseBaseIf =
            TokenInfoResponseBaseIf.ofRefreshToken(
                PublicRefreshTokenInfoResponse.builder()
                    .token("token")
                    .active(true)
                    .appId(0)
                    .clientId("client_id")
                    .hubId(0)
                    .addScope("string")
                    .tokenType("token_type")
                    .tokenUse(PublicRefreshTokenInfoResponse.TokenUse.REFRESH_TOKEN)
                    .userId(0)
                    .hubDomain("hub_domain")
                    .user("user")
                    .build()
            )

        val roundtrippedTokenInfoResponseBaseIf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tokenInfoResponseBaseIf),
                jacksonTypeRef<TokenInfoResponseBaseIf>(),
            )

        assertThat(roundtrippedTokenInfoResponseBaseIf).isEqualTo(tokenInfoResponseBaseIf)
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
        val tokenInfoResponseBaseIf =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<TokenInfoResponseBaseIf>())

        val e = assertThrows<HubSpotInvalidDataException> { tokenInfoResponseBaseIf.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
