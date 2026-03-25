// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.scheduler.meetings.basic

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BasicGetBookingInfoBySlugParamsTest {

    @Test
    fun create() {
        BasicGetBookingInfoBySlugParams.builder().slug("slug").timezone("timezone").build()
    }

    @Test
    fun pathParams() {
        val params =
            BasicGetBookingInfoBySlugParams.builder().slug("slug").timezone("timezone").build()

        assertThat(params._pathParam(0)).isEqualTo("slug")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            BasicGetBookingInfoBySlugParams.builder().slug("slug").timezone("timezone").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("timezone", "timezone").build())
    }
}
