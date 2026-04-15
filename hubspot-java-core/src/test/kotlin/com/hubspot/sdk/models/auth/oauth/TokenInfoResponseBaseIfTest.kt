// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.auth.oauth

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenInfoResponseBaseIfTest {

    @Test
    fun create() {
        val tokenInfoResponseBaseIf = TokenInfoResponseBaseIf.builder().active(true).build()

        assertThat(tokenInfoResponseBaseIf.active()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tokenInfoResponseBaseIf = TokenInfoResponseBaseIf.builder().active(true).build()

        val roundtrippedTokenInfoResponseBaseIf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tokenInfoResponseBaseIf),
                jacksonTypeRef<TokenInfoResponseBaseIf>(),
            )

        assertThat(roundtrippedTokenInfoResponseBaseIf).isEqualTo(tokenInfoResponseBaseIf)
    }
}
