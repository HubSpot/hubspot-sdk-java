// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.tickets

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TicketDeleteParamsTest {

    @Test
    fun create() {
        TicketDeleteParams.builder().ticketId("ticketId").build()
    }

    @Test
    fun pathParams() {
        val params = TicketDeleteParams.builder().ticketId("ticketId").build()

        assertThat(params._pathParam(0)).isEqualTo("ticketId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
