// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.campaigns.metrics

import com.hubspot.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MetricListContactIdsByTypeParamsTest {

    @Test
    fun create() {
        MetricListContactIdsByTypeParams.builder()
            .campaignGuid("campaignGuid")
            .contactType("contactType")
            .after("after")
            .endDate("endDate")
            .limit(0)
            .startDate("startDate")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MetricListContactIdsByTypeParams.builder()
                .campaignGuid("campaignGuid")
                .contactType("contactType")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("campaignGuid")
        assertThat(params._pathParam(1)).isEqualTo("contactType")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            MetricListContactIdsByTypeParams.builder()
                .campaignGuid("campaignGuid")
                .contactType("contactType")
                .after("after")
                .endDate("endDate")
                .limit(0)
                .startDate("startDate")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after", "after")
                    .put("endDate", "endDate")
                    .put("limit", "0")
                    .put("startDate", "startDate")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            MetricListContactIdsByTypeParams.builder()
                .campaignGuid("campaignGuid")
                .contactType("contactType")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
