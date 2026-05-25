// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.auth.oauth

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClientCredentialsTokenResponseTest {

    @Test
    fun create() {
        val clientCredentialsTokenResponse =
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

        assertThat(clientCredentialsTokenResponse.accessToken()).isEqualTo("access_token")
        assertThat(clientCredentialsTokenResponse.expiresIn()).isEqualTo(0L)
        assertThat(clientCredentialsTokenResponse.tokenType()).isEqualTo("token_type")
        assertThat(clientCredentialsTokenResponse.tokenUse())
            .isEqualTo(ClientCredentialsTokenResponse.TokenUse.CLIENT_CREDENTIALS)
        assertThat(clientCredentialsTokenResponse.hubId()).contains(0)
        assertThat(clientCredentialsTokenResponse.idToken()).contains("id_token")
        assertThat(clientCredentialsTokenResponse.scopes().getOrNull()).containsExactly("string")
        assertThat(clientCredentialsTokenResponse.userId()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val clientCredentialsTokenResponse =
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

        val roundtrippedClientCredentialsTokenResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(clientCredentialsTokenResponse),
                jacksonTypeRef<ClientCredentialsTokenResponse>(),
            )

        assertThat(roundtrippedClientCredentialsTokenResponse)
            .isEqualTo(clientCredentialsTokenResponse)
    }
}
