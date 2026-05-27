// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.auth.oauth

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccessTokenResponseTest {

    @Test
    fun create() {
        val accessTokenResponse =
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

        assertThat(accessTokenResponse.accessToken()).isEqualTo("access_token")
        assertThat(accessTokenResponse.expiresIn()).isEqualTo(0L)
        assertThat(accessTokenResponse.refreshToken()).isEqualTo("refresh_token")
        assertThat(accessTokenResponse.tokenType()).isEqualTo("token_type")
        assertThat(accessTokenResponse.tokenUse())
            .isEqualTo(AccessTokenResponse.TokenUse.ACCESS_TOKEN)
        assertThat(accessTokenResponse.hubId()).contains(0)
        assertThat(accessTokenResponse.idToken()).contains("id_token")
        assertThat(accessTokenResponse.scopes().getOrNull()).containsExactly("string")
        assertThat(accessTokenResponse.userId()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accessTokenResponse =
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

        val roundtrippedAccessTokenResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accessTokenResponse),
                jacksonTypeRef<AccessTokenResponse>(),
            )

        assertThat(roundtrippedAccessTokenResponse).isEqualTo(accessTokenResponse)
    }
}
