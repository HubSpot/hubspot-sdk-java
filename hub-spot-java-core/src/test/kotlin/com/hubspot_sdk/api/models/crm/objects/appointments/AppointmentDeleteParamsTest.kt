// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.appointments

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AppointmentDeleteParamsTest {

    @Test
    fun create() {
        AppointmentDeleteParams.builder().appointmentId("appointmentId").build()
    }

    @Test
    fun pathParams() {
        val params = AppointmentDeleteParams.builder().appointmentId("appointmentId").build()

        assertThat(params._pathParam(0)).isEqualTo("appointmentId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
