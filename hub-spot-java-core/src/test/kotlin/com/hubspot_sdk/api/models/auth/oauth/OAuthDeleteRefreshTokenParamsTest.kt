// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.auth.oauth

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthDeleteRefreshTokenParamsTest {

    @Test
    fun create() {
        OAuthDeleteRefreshTokenParams.builder().token("token").build()
    }

    @Test
    fun pathParams() {
        val params = OAuthDeleteRefreshTokenParams.builder().token("token").build()

        assertThat(params._pathParam(0)).isEqualTo("token")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
