// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.transactional.smtptokens

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SmtpTokenDeleteParamsTest {

    @Test
    fun create() {
        SmtpTokenDeleteParams.builder().tokenId("tokenId").build()
    }

    @Test
    fun pathParams() {
        val params = SmtpTokenDeleteParams.builder().tokenId("tokenId").build()

        assertThat(params._pathParam(0)).isEqualTo("tokenId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
