// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing.emails

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.marketing.emails.statistics.StatisticGetHistogramParams
import com.hubspot_sdk.api.models.marketing.emails.statistics.StatisticGetParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class StatisticServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val statisticService = client.marketing().emails().statistics()

        val aggregateEmailStatistics =
            statisticService.get(
                StatisticGetParams.builder()
                    .addEmailId(0L)
                    .endTimestamp("endTimestamp")
                    .property("property")
                    .startTimestamp("startTimestamp")
                    .build()
            )

        aggregateEmailStatistics.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getHistogram() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val statisticService = client.marketing().emails().statistics()

        val collectionResponseWithTotalEmailStatisticIntervalNoPaging =
            statisticService.getHistogram(
                StatisticGetHistogramParams.builder()
                    .addEmailId(0L)
                    .endTimestamp("endTimestamp")
                    .interval(StatisticGetHistogramParams.Interval.YEAR)
                    .startTimestamp("startTimestamp")
                    .build()
            )

        collectionResponseWithTotalEmailStatisticIntervalNoPaging.validate()
    }
}
