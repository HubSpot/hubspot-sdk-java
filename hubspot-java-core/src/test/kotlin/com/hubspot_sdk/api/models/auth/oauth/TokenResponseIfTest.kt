// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.auth.oauth

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenResponseIfTest {

    @Test
    fun create() {
        val tokenResponseIf =
            TokenResponseIf.builder()
                .accessToken("accessToken")
                .expiresIn(0L)
                .hubId(0)
                .idToken("idToken")
                .addScope("string")
                .tokenType("tokenType")
                .userId(0)
                .build()

        assertThat(tokenResponseIf.accessToken()).contains("accessToken")
        assertThat(tokenResponseIf.expiresIn()).contains(0L)
        assertThat(tokenResponseIf.hubId()).contains(0)
        assertThat(tokenResponseIf.idToken()).contains("idToken")
        assertThat(tokenResponseIf.scopes().getOrNull()).containsExactly("string")
        assertThat(tokenResponseIf.tokenType()).contains("tokenType")
        assertThat(tokenResponseIf.userId()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tokenResponseIf =
            TokenResponseIf.builder()
                .accessToken("accessToken")
                .expiresIn(0L)
                .hubId(0)
                .idToken("idToken")
                .addScope("string")
                .tokenType("tokenType")
                .userId(0)
                .build()

        val roundtrippedTokenResponseIf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tokenResponseIf),
                jacksonTypeRef<TokenResponseIf>(),
            )

        assertThat(roundtrippedTokenResponseIf).isEqualTo(tokenResponseIf)
    }
}
