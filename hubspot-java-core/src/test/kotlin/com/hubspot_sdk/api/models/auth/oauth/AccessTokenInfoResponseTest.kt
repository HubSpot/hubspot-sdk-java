// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.auth.oauth

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccessTokenInfoResponseTest {

    @Test
    fun create() {
        val accessTokenInfoResponse =
            AccessTokenInfoResponse.builder()
                .token("token")
                .appId(0)
                .expiresIn(0)
                .hubId(0)
                .addScope("string")
                .tokenType("token_type")
                .userId(0)
                .hubDomain("hub_domain")
                .user("user")
                .build()

        assertThat(accessTokenInfoResponse.token()).isEqualTo("token")
        assertThat(accessTokenInfoResponse.appId()).isEqualTo(0)
        assertThat(accessTokenInfoResponse.expiresIn()).isEqualTo(0)
        assertThat(accessTokenInfoResponse.hubId()).isEqualTo(0)
        assertThat(accessTokenInfoResponse.scopes()).containsExactly("string")
        assertThat(accessTokenInfoResponse.tokenType()).isEqualTo("token_type")
        assertThat(accessTokenInfoResponse.userId()).isEqualTo(0)
        assertThat(accessTokenInfoResponse.hubDomain()).contains("hub_domain")
        assertThat(accessTokenInfoResponse.user()).contains("user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accessTokenInfoResponse =
            AccessTokenInfoResponse.builder()
                .token("token")
                .appId(0)
                .expiresIn(0)
                .hubId(0)
                .addScope("string")
                .tokenType("token_type")
                .userId(0)
                .hubDomain("hub_domain")
                .user("user")
                .build()

        val roundtrippedAccessTokenInfoResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accessTokenInfoResponse),
                jacksonTypeRef<AccessTokenInfoResponse>(),
            )

        assertThat(roundtrippedAccessTokenInfoResponse).isEqualTo(accessTokenInfoResponse)
    }
}
