// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.timeline.templates

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplateDeleteParamsTest {

    @Test
    fun create() {
        TemplateDeleteParams.builder().appId(0).eventTemplateId("eventTemplateId").build()
    }

    @Test
    fun pathParams() {
        val params =
            TemplateDeleteParams.builder().appId(0).eventTemplateId("eventTemplateId").build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("eventTemplateId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
