// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.auth.oauth

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicRefreshTokenInfoResponseTest {

    @Test
    fun create() {
        val publicRefreshTokenInfoResponse =
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

        assertThat(publicRefreshTokenInfoResponse.token()).isEqualTo("token")
        assertThat(publicRefreshTokenInfoResponse.active()).isEqualTo(true)
        assertThat(publicRefreshTokenInfoResponse.appId()).isEqualTo(0)
        assertThat(publicRefreshTokenInfoResponse.clientId()).isEqualTo("client_id")
        assertThat(publicRefreshTokenInfoResponse.hubId()).isEqualTo(0)
        assertThat(publicRefreshTokenInfoResponse.scopes()).containsExactly("string")
        assertThat(publicRefreshTokenInfoResponse.tokenType()).isEqualTo("token_type")
        assertThat(publicRefreshTokenInfoResponse.tokenUse())
            .isEqualTo(PublicRefreshTokenInfoResponse.TokenUse.REFRESH_TOKEN)
        assertThat(publicRefreshTokenInfoResponse.userId()).isEqualTo(0)
        assertThat(publicRefreshTokenInfoResponse.hubDomain()).contains("hub_domain")
        assertThat(publicRefreshTokenInfoResponse.user()).contains("user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicRefreshTokenInfoResponse =
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

        val roundtrippedPublicRefreshTokenInfoResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicRefreshTokenInfoResponse),
                jacksonTypeRef<PublicRefreshTokenInfoResponse>(),
            )

        assertThat(roundtrippedPublicRefreshTokenInfoResponse)
            .isEqualTo(publicRefreshTokenInfoResponse)
    }
}
