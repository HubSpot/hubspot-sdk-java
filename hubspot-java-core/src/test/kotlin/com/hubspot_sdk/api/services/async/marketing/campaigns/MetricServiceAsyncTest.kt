// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing.campaigns

import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot_sdk.api.models.marketing.campaigns.metrics.MetricGetAttributionMetricsParams
import com.hubspot_sdk.api.models.marketing.campaigns.metrics.MetricGetRevenueAttributionParams
import com.hubspot_sdk.api.models.marketing.campaigns.metrics.MetricListContactIdsByTypeParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MetricServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getAttributionMetrics() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val metricServiceAsync = client.marketing().campaigns().metrics()

        val metricsCountersFuture =
            metricServiceAsync.getAttributionMetrics(
                MetricGetAttributionMetricsParams.builder()
                    .campaignGuid("campaignGuid")
                    .endDate("endDate")
                    .startDate("startDate")
                    .build()
            )

        val metricsCounters = metricsCountersFuture.get()
        metricsCounters.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getRevenueAttribution() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val metricServiceAsync = client.marketing().campaigns().metrics()

        val revenueAttributionAggregateFuture =
            metricServiceAsync.getRevenueAttribution(
                MetricGetRevenueAttributionParams.builder()
                    .campaignGuid("campaignGuid")
                    .attributionModel("attributionModel")
                    .endDate("endDate")
                    .startDate("startDate")
                    .build()
            )

        val revenueAttributionAggregate = revenueAttributionAggregateFuture.get()
        revenueAttributionAggregate.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listContactIdsByType() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val metricServiceAsync = client.marketing().campaigns().metrics()

        val pageFuture =
            metricServiceAsync.listContactIdsByType(
                MetricListContactIdsByTypeParams.builder()
                    .campaignGuid("campaignGuid")
                    .contactType("contactType")
                    .build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }
}
