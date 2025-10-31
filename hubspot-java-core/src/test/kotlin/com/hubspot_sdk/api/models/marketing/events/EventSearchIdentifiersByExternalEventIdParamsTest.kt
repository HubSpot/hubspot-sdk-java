// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventSearchIdentifiersByExternalEventIdParamsTest {

    @Test
    fun create() {
        EventSearchIdentifiersByExternalEventIdParams.builder()
            .externalEventId("externalEventId")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            EventSearchIdentifiersByExternalEventIdParams.builder()
                .externalEventId("externalEventId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("externalEventId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
