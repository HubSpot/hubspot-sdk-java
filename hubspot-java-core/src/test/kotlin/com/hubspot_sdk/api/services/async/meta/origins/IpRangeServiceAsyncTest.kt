// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.meta.origins

import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot_sdk.api.models.meta.origins.ipranges.IpRangeListParams
import com.hubspot_sdk.api.models.meta.origins.ipranges.IpRangeListSimpleParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class IpRangeServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val ipRangeServiceAsync = client.meta().origins().ipRanges()

        val collectionResponseIpRangeNoPagingFuture =
            ipRangeServiceAsync.list(
                IpRangeListParams.builder()
                    .addDirection(IpRangeListParams.Direction.INGRESS)
                    .addService(IpRangeListParams.Service.EMAIL)
                    .build()
            )

        val collectionResponseIpRangeNoPaging = collectionResponseIpRangeNoPagingFuture.get()
        collectionResponseIpRangeNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listSimple() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val ipRangeServiceAsync = client.meta().origins().ipRanges()

        val responseFuture =
            ipRangeServiceAsync.listSimple(
                IpRangeListSimpleParams.builder()
                    .addDirection(IpRangeListSimpleParams.Direction.INGRESS)
                    .addService(IpRangeListSimpleParams.Service.EMAIL)
                    .build()
            )

        val response = responseFuture.get()
    }
}
