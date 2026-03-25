// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing.campaigns

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.marketing.campaigns.metrics.MetricGetAttributionMetricsParams
import com.hubspot_sdk.api.models.marketing.campaigns.metrics.MetricGetRevenueAttributionParams
import com.hubspot_sdk.api.models.marketing.campaigns.metrics.MetricListContactIdsByTypeParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MetricServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getAttributionMetrics() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val metricService = client.marketing().campaigns().metrics()

        val metricsCounters =
            metricService.getAttributionMetrics(
                MetricGetAttributionMetricsParams.builder()
                    .campaignGuid("campaignGuid")
                    .endDate("endDate")
                    .startDate("startDate")
                    .build()
            )

        metricsCounters.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getRevenueAttribution() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val metricService = client.marketing().campaigns().metrics()

        val revenueAttributionAggregate =
            metricService.getRevenueAttribution(
                MetricGetRevenueAttributionParams.builder()
                    .campaignGuid("campaignGuid")
                    .attributionModel("attributionModel")
                    .endDate("endDate")
                    .startDate("startDate")
                    .build()
            )

        revenueAttributionAggregate.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listContactIdsByType() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val metricService = client.marketing().campaigns().metrics()

        val page =
            metricService.listContactIdsByType(
                MetricListContactIdsByTypeParams.builder()
                    .campaignGuid("campaignGuid")
                    .contactType("contactType")
                    .build()
            )

        page.response().validate()
    }
}
