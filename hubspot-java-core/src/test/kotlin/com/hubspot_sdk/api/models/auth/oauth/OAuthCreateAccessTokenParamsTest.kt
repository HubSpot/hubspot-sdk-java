// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.auth.oauth

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthCreateAccessTokenParamsTest {

    @Test
    fun create() {
        OAuthCreateAccessTokenParams.builder()
            .clientId("client_id")
            .clientSecret("client_secret")
            .code("code")
            .grantType(OAuthCreateAccessTokenParams.GrantType.AUTHORIZATION_CODE)
            .redirectUri("redirect_uri")
            .refreshToken("refresh_token")
            .build()
    }

    @Test
    fun body() {
        val params =
            OAuthCreateAccessTokenParams.builder()
                .clientId("client_id")
                .clientSecret("client_secret")
                .code("code")
                .grantType(OAuthCreateAccessTokenParams.GrantType.AUTHORIZATION_CODE)
                .redirectUri("redirect_uri")
                .refreshToken("refresh_token")
                .build()

        val body = params._body()

        assertThat(body.clientId()).contains("client_id")
        assertThat(body.clientSecret()).contains("client_secret")
        assertThat(body.code()).contains("code")
        assertThat(body.grantType())
            .contains(OAuthCreateAccessTokenParams.GrantType.AUTHORIZATION_CODE)
        assertThat(body.redirectUri()).contains("redirect_uri")
        assertThat(body.refreshToken()).contains("refresh_token")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = OAuthCreateAccessTokenParams.builder().build()

        val body = params._body()
    }
}
