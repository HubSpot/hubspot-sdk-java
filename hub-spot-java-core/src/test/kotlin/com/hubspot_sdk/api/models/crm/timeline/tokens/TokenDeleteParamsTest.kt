// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.timeline.tokens

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenDeleteParamsTest {

    @Test
    fun create() {
        TokenDeleteParams.builder()
            .appId(0)
            .eventTemplateId("eventTemplateId")
            .tokenName("tokenName")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TokenDeleteParams.builder()
                .appId(0)
                .eventTemplateId("eventTemplateId")
                .tokenName("tokenName")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("eventTemplateId")
        assertThat(params._pathParam(2)).isEqualTo("tokenName")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }
}
