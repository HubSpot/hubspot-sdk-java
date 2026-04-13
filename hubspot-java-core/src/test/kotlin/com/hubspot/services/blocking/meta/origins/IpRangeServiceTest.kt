// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.meta.origins

import com.hubspot.client.okhttp.HubSpotOkHttpClient
import com.hubspot.models.meta.origins.ipranges.IpRangeListParams
import com.hubspot.models.meta.origins.ipranges.IpRangeListSimpleParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class IpRangeServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val ipRangeService = client.meta().origins().ipRanges()

        val collectionResponseIpRangeNoPaging =
            ipRangeService.list(
                IpRangeListParams.builder()
                    .addDirection(IpRangeListParams.Direction.INGRESS)
                    .addService(IpRangeListParams.Service.EMAIL)
                    .build()
            )

        collectionResponseIpRangeNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listSimple() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val ipRangeService = client.meta().origins().ipRanges()

        ipRangeService.listSimple(
            IpRangeListSimpleParams.builder()
                .addDirection(IpRangeListSimpleParams.Direction.INGRESS)
                .addService(IpRangeListSimpleParams.Service.EMAIL)
                .build()
        )
    }
}
