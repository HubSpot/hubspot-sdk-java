// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.objects.services

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ServiceDeleteParamsTest {

    @Test
    fun create() {
        ServiceDeleteParams.builder().serviceId("serviceId").build()
    }

    @Test
    fun pathParams() {
        val params = ServiceDeleteParams.builder().serviceId("serviceId").build()

        assertThat(params._pathParam(0)).isEqualTo("serviceId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
