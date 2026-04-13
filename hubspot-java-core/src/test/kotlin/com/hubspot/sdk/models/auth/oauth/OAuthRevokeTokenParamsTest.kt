// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.auth.oauth

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthRevokeTokenParamsTest {

    @Test
    fun create() {
        OAuthRevokeTokenParams.builder()
            .token("token")
            .clientId("client_id")
            .clientSecret("client_secret")
            .tokenTypeHint("token_type_hint")
            .build()
    }

    @Test
    fun body() {
        val params =
            OAuthRevokeTokenParams.builder()
                .token("token")
                .clientId("client_id")
                .clientSecret("client_secret")
                .tokenTypeHint("token_type_hint")
                .build()

        val body = params._body()

        assertThat(body.token()).contains("token")
        assertThat(body.clientId()).contains("client_id")
        assertThat(body.clientSecret()).contains("client_secret")
        assertThat(body.tokenTypeHint()).contains("token_type_hint")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = OAuthRevokeTokenParams.builder().build()

        val body = params._body()
    }
}
