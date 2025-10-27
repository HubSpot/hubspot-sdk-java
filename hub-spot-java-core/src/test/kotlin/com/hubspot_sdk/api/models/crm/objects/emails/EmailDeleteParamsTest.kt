// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.emails

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailDeleteParamsTest {

    @Test
    fun create() {
        EmailDeleteParams.builder().emailId("emailId").build()
    }

    @Test
    fun pathParams() {
        val params = EmailDeleteParams.builder().emailId("emailId").build()

        assertThat(params._pathParam(0)).isEqualTo("emailId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
