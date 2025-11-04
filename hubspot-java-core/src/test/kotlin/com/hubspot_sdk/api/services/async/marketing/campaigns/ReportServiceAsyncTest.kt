// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing.campaigns

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.marketing.campaigns.reports.ReportGetAttributionMetricsParams
import com.hubspot_sdk.api.models.marketing.campaigns.reports.ReportGetRevenueAttributionParams
import com.hubspot_sdk.api.models.marketing.campaigns.reports.ReportListContactIdsByTypeParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ReportServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun getAttributionMetrics() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val reportServiceAsync = client.marketing().campaigns().reports()

        val metricsCountersFuture =
            reportServiceAsync.getAttributionMetrics(
                ReportGetAttributionMetricsParams.builder()
                    .campaignGuid("campaignGuid")
                    .endDate("endDate")
                    .startDate("startDate")
                    .build()
            )

        val metricsCounters = metricsCountersFuture.get()
        metricsCounters.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getRevenueAttribution() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val reportServiceAsync = client.marketing().campaigns().reports()

        val revenueAttributionAggregateFuture =
            reportServiceAsync.getRevenueAttribution(
                ReportGetRevenueAttributionParams.builder()
                    .campaignGuid("campaignGuid")
                    .attributionModel("attributionModel")
                    .endDate("endDate")
                    .startDate("startDate")
                    .build()
            )

        val revenueAttributionAggregate = revenueAttributionAggregateFuture.get()
        revenueAttributionAggregate.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listContactIdsByType() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val reportServiceAsync = client.marketing().campaigns().reports()

        val pageFuture =
            reportServiceAsync.listContactIdsByType(
                ReportListContactIdsByTypeParams.builder()
                    .campaignGuid("campaignGuid")
                    .contactType("contactType")
                    .build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }
}
