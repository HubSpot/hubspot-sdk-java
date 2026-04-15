// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.marketingevents.events

import com.hubspot.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventCancelByExternalEventIdParamsTest {

    @Test
    fun create() {
        EventCancelByExternalEventIdParams.builder()
            .externalEventId("externalEventId")
            .externalAccountId("externalAccountId")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            EventCancelByExternalEventIdParams.builder()
                .externalEventId("externalEventId")
                .externalAccountId("externalAccountId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("externalEventId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            EventCancelByExternalEventIdParams.builder()
                .externalEventId("externalEventId")
                .externalAccountId("externalAccountId")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("externalAccountId", "externalAccountId").build())
    }
}
