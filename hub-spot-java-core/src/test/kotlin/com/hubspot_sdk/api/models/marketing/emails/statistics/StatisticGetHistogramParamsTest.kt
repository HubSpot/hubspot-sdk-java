// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.emails.statistics

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StatisticGetHistogramParamsTest {

    @Test
    fun create() {
        StatisticGetHistogramParams.builder()
            .addEmailId(0L)
            .endTimestamp("endTimestamp")
            .interval(StatisticGetHistogramParams.Interval.YEAR)
            .startTimestamp("startTimestamp")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            StatisticGetHistogramParams.builder()
                .addEmailId(0L)
                .endTimestamp("endTimestamp")
                .interval(StatisticGetHistogramParams.Interval.YEAR)
                .startTimestamp("startTimestamp")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("emailIds", listOf("0").joinToString(","))
                    .put("endTimestamp", "endTimestamp")
                    .put("interval", "YEAR")
                    .put("startTimestamp", "startTimestamp")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = StatisticGetHistogramParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
