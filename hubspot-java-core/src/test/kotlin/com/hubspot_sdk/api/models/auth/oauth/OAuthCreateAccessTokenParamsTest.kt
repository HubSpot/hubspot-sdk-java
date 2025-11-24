// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.auth.oauth

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthCreateAccessTokenParamsTest {

    @Test
    fun create() {
        OAuthCreateAccessTokenParams.builder()
            .queryClientSecret("client_secret")
            .queryRefreshToken("refresh_token")
            .clientId("client_id")
            .bodyClientSecret("client_secret")
            .code("code")
            .codeVerifier("code_verifier")
            .grantType(OAuthCreateAccessTokenParams.GrantType.AUTHORIZATION_CODE)
            .redirectUri("redirect_uri")
            .bodyRefreshToken("refresh_token")
            .scope("scope")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            OAuthCreateAccessTokenParams.builder()
                .queryClientSecret("client_secret")
                .queryRefreshToken("refresh_token")
                .clientId("client_id")
                .bodyClientSecret("client_secret")
                .code("code")
                .codeVerifier("code_verifier")
                .grantType(OAuthCreateAccessTokenParams.GrantType.AUTHORIZATION_CODE)
                .redirectUri("redirect_uri")
                .bodyRefreshToken("refresh_token")
                .scope("scope")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("client_secret", "client_secret")
                    .put("refresh_token", "refresh_token")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = OAuthCreateAccessTokenParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            OAuthCreateAccessTokenParams.builder()
                .queryClientSecret("client_secret")
                .queryRefreshToken("refresh_token")
                .clientId("client_id")
                .bodyClientSecret("client_secret")
                .code("code")
                .codeVerifier("code_verifier")
                .grantType(OAuthCreateAccessTokenParams.GrantType.AUTHORIZATION_CODE)
                .redirectUri("redirect_uri")
                .bodyRefreshToken("refresh_token")
                .scope("scope")
                .build()

        val body = params._body()

        assertThat(body.clientId()).contains("client_id")
        assertThat(body.bodyClientSecret()).contains("client_secret")
        assertThat(body.code()).contains("code")
        assertThat(body.codeVerifier()).contains("code_verifier")
        assertThat(body.grantType())
            .contains(OAuthCreateAccessTokenParams.GrantType.AUTHORIZATION_CODE)
        assertThat(body.redirectUri()).contains("redirect_uri")
        assertThat(body.bodyRefreshToken()).contains("refresh_token")
        assertThat(body.scope()).contains("scope")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = OAuthCreateAccessTokenParams.builder().build()

        val body = params._body()
    }
}
