// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.campaigns.metrics

import com.hubspot.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MetricGetAttributionMetricsParamsTest {

    @Test
    fun create() {
        MetricGetAttributionMetricsParams.builder()
            .campaignGuid("campaignGuid")
            .endDate("endDate")
            .startDate("startDate")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MetricGetAttributionMetricsParams.builder().campaignGuid("campaignGuid").build()

        assertThat(params._pathParam(0)).isEqualTo("campaignGuid")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            MetricGetAttributionMetricsParams.builder()
                .campaignGuid("campaignGuid")
                .endDate("endDate")
                .startDate("startDate")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("endDate", "endDate")
                    .put("startDate", "startDate")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            MetricGetAttributionMetricsParams.builder().campaignGuid("campaignGuid").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
