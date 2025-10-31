// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing.campaigns

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.marketing.campaigns.reports.ReportGetAttributionMetricsParams
import com.hubspot_sdk.api.models.marketing.campaigns.reports.ReportGetRevenueAttributionParams
import com.hubspot_sdk.api.models.marketing.campaigns.reports.ReportListContactIdsByTypeParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ReportServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun getAttributionMetrics() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val reportService = client.marketing().campaigns().reports()

        val metricsCounters =
            reportService.getAttributionMetrics(
                ReportGetAttributionMetricsParams.builder()
                    .campaignGuid("campaignGuid")
                    .endDate("endDate")
                    .startDate("startDate")
                    .build()
            )

        metricsCounters.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getRevenueAttribution() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val reportService = client.marketing().campaigns().reports()

        val revenueAttributionAggregate =
            reportService.getRevenueAttribution(
                ReportGetRevenueAttributionParams.builder()
                    .campaignGuid("campaignGuid")
                    .attributionModel("attributionModel")
                    .endDate("endDate")
                    .startDate("startDate")
                    .build()
            )

        revenueAttributionAggregate.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listContactIdsByType() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val reportService = client.marketing().campaigns().reports()

        val collectionResponseContactReferenceForwardPaging =
            reportService.listContactIdsByType(
                ReportListContactIdsByTypeParams.builder()
                    .campaignGuid("campaignGuid")
                    .contactType("contactType")
                    .after("after")
                    .endDate("endDate")
                    .limit(0)
                    .startDate("startDate")
                    .build()
            )

        collectionResponseContactReferenceForwardPaging.validate()
    }
}
