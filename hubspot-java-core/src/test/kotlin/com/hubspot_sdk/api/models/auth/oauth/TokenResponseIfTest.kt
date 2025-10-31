// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.auth.oauth

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenResponseIfTest {

    @Test
    fun create() {
        val tokenResponseIf =
            TokenResponseIf.builder()
                .accessToken("access_token")
                .expiresIn(0)
                .refreshToken("refresh_token")
                .tokenType("token_type")
                .idToken("id_token")
                .build()

        assertThat(tokenResponseIf.accessToken()).isEqualTo("access_token")
        assertThat(tokenResponseIf.expiresIn()).isEqualTo(0)
        assertThat(tokenResponseIf.refreshToken()).isEqualTo("refresh_token")
        assertThat(tokenResponseIf.tokenType()).isEqualTo("token_type")
        assertThat(tokenResponseIf.idToken()).contains("id_token")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tokenResponseIf =
            TokenResponseIf.builder()
                .accessToken("access_token")
                .expiresIn(0)
                .refreshToken("refresh_token")
                .tokenType("token_type")
                .idToken("id_token")
                .build()

        val roundtrippedTokenResponseIf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tokenResponseIf),
                jacksonTypeRef<TokenResponseIf>(),
            )

        assertThat(roundtrippedTokenResponseIf).isEqualTo(tokenResponseIf)
    }
}
