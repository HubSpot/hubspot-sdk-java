// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.timeline.events

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventGetParamsTest {

    @Test
    fun create() {
        EventGetParams.builder().eventTemplateId("eventTemplateId").eventId("eventId").build()
    }

    @Test
    fun pathParams() {
        val params =
            EventGetParams.builder().eventTemplateId("eventTemplateId").eventId("eventId").build()

        assertThat(params._pathParam(0)).isEqualTo("eventTemplateId")
        assertThat(params._pathParam(1)).isEqualTo("eventId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
