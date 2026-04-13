// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.marketingevents

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarketingEventSearchIdentifiersByExternalEventIdParamsTest {

    @Test
    fun create() {
        MarketingEventSearchIdentifiersByExternalEventIdParams.builder()
            .externalEventId("externalEventId")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MarketingEventSearchIdentifiersByExternalEventIdParams.builder()
                .externalEventId("externalEventId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("externalEventId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
