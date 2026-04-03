// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.marketingevents

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarketingEventSearchByExternalEventIdParamsTest {

    @Test
    fun create() {
        MarketingEventSearchByExternalEventIdParams.builder().q("q").build()
    }

    @Test
    fun queryParams() {
        val params = MarketingEventSearchByExternalEventIdParams.builder().q("q").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("q", "q").build())
    }
}
