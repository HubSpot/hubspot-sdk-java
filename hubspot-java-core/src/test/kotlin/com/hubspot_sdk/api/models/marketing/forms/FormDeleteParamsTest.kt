// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.forms

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FormDeleteParamsTest {

    @Test
    fun create() {
        FormDeleteParams.builder().formId("formId").build()
    }

    @Test
    fun pathParams() {
        val params = FormDeleteParams.builder().formId("formId").build()

        assertThat(params._pathParam(0)).isEqualTo("formId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
