// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.auth.oauth

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicAccessTokenInfoResponseTest {

    @Test
    fun create() {
        val publicAccessTokenInfoResponse =
            PublicAccessTokenInfoResponse.builder()
                .token("token")
                .active(true)
                .appId(0)
                .clientId("client_id")
                .expiresIn(0)
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

        assertThat(publicAccessTokenInfoResponse.token()).isEqualTo("token")
        assertThat(publicAccessTokenInfoResponse.active()).isEqualTo(true)
        assertThat(publicAccessTokenInfoResponse.appId()).isEqualTo(0)
        assertThat(publicAccessTokenInfoResponse.clientId()).isEqualTo("client_id")
        assertThat(publicAccessTokenInfoResponse.expiresIn()).isEqualTo(0)
        assertThat(publicAccessTokenInfoResponse.hubId()).isEqualTo(0)
        assertThat(publicAccessTokenInfoResponse.isPrivateDistribution()).isEqualTo(true)
        assertThat(publicAccessTokenInfoResponse.scopes()).containsExactly("string")
        assertThat(publicAccessTokenInfoResponse.signedAccessToken())
            .isEqualTo(
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
        assertThat(publicAccessTokenInfoResponse.tokenType()).isEqualTo("token_type")
        assertThat(publicAccessTokenInfoResponse.tokenUse())
            .isEqualTo(PublicAccessTokenInfoResponse.TokenUse.ACCESS_TOKEN)
        assertThat(publicAccessTokenInfoResponse.userId()).isEqualTo(0)
        assertThat(publicAccessTokenInfoResponse.hubDomain()).contains("hub_domain")
        assertThat(publicAccessTokenInfoResponse.user()).contains("user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicAccessTokenInfoResponse =
            PublicAccessTokenInfoResponse.builder()
                .token("token")
                .active(true)
                .appId(0)
                .clientId("client_id")
                .expiresIn(0)
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

        val roundtrippedPublicAccessTokenInfoResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicAccessTokenInfoResponse),
                jacksonTypeRef<PublicAccessTokenInfoResponse>(),
            )

        assertThat(roundtrippedPublicAccessTokenInfoResponse)
            .isEqualTo(publicAccessTokenInfoResponse)
    }
}
