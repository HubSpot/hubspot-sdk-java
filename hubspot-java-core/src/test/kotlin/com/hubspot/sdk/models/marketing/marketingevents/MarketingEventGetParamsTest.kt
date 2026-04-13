// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.marketingevents

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarketingEventGetParamsTest {

    @Test
    fun create() {
        MarketingEventGetParams.builder().objectId("objectId").build()
    }

    @Test
    fun pathParams() {
        val params = MarketingEventGetParams.builder().objectId("objectId").build()

        assertThat(params._pathParam(0)).isEqualTo("objectId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
