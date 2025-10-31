// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing.emails

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.marketing.emails.statistics.StatisticGetHistogramParams
import com.hubspot_sdk.api.models.marketing.emails.statistics.StatisticGetParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class StatisticServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val statisticServiceAsync = client.marketing().emails().statistics()

        val aggregateEmailStatisticsFuture =
            statisticServiceAsync.get(
                StatisticGetParams.builder()
                    .addEmailId(0L)
                    .endTimestamp("endTimestamp")
                    .property("property")
                    .startTimestamp("startTimestamp")
                    .build()
            )

        val aggregateEmailStatistics = aggregateEmailStatisticsFuture.get()
        aggregateEmailStatistics.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getHistogram() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val statisticServiceAsync = client.marketing().emails().statistics()

        val collectionResponseWithTotalEmailStatisticIntervalNoPagingFuture =
            statisticServiceAsync.getHistogram(
                StatisticGetHistogramParams.builder()
                    .addEmailId(0L)
                    .endTimestamp("endTimestamp")
                    .interval(StatisticGetHistogramParams.Interval.YEAR)
                    .startTimestamp("startTimestamp")
                    .build()
            )

        val collectionResponseWithTotalEmailStatisticIntervalNoPaging =
            collectionResponseWithTotalEmailStatisticIntervalNoPagingFuture.get()
        collectionResponseWithTotalEmailStatisticIntervalNoPaging.validate()
    }
}
