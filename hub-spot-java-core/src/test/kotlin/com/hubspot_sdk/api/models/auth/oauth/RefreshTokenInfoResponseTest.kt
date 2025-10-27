// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.auth.oauth

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RefreshTokenInfoResponseTest {

    @Test
    fun create() {
        val refreshTokenInfoResponse =
            RefreshTokenInfoResponse.builder()
                .token("token")
                .clientId("client_id")
                .hubId(0)
                .addScope("string")
                .tokenType("token_type")
                .userId(0)
                .hubDomain("hub_domain")
                .user("user")
                .build()

        assertThat(refreshTokenInfoResponse.token()).isEqualTo("token")
        assertThat(refreshTokenInfoResponse.clientId()).isEqualTo("client_id")
        assertThat(refreshTokenInfoResponse.hubId()).isEqualTo(0)
        assertThat(refreshTokenInfoResponse.scopes()).containsExactly("string")
        assertThat(refreshTokenInfoResponse.tokenType()).isEqualTo("token_type")
        assertThat(refreshTokenInfoResponse.userId()).isEqualTo(0)
        assertThat(refreshTokenInfoResponse.hubDomain()).contains("hub_domain")
        assertThat(refreshTokenInfoResponse.user()).contains("user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val refreshTokenInfoResponse =
            RefreshTokenInfoResponse.builder()
                .token("token")
                .clientId("client_id")
                .hubId(0)
                .addScope("string")
                .tokenType("token_type")
                .userId(0)
                .hubDomain("hub_domain")
                .user("user")
                .build()

        val roundtrippedRefreshTokenInfoResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(refreshTokenInfoResponse),
                jacksonTypeRef<RefreshTokenInfoResponse>(),
            )

        assertThat(roundtrippedRefreshTokenInfoResponse).isEqualTo(refreshTokenInfoResponse)
    }
}
