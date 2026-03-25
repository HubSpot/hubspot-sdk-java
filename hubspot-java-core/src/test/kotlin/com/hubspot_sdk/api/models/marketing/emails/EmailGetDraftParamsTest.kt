// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.emails

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailGetDraftParamsTest {

    @Test
    fun create() {
        EmailGetDraftParams.builder().emailId("emailId").build()
    }

    @Test
    fun pathParams() {
        val params = EmailGetDraftParams.builder().emailId("emailId").build()

        assertThat(params._pathParam(0)).isEqualTo("emailId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
