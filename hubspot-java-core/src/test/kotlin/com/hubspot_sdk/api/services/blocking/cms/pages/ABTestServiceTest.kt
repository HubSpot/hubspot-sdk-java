// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.pages

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.AbTestCreateRequestVNext
import com.hubspot_sdk.api.models.cms.pages.AbTestEndRequestVNext
import com.hubspot_sdk.api.models.cms.pages.AbTestRerunRequestVNext
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ABTestServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createAbTestVariation() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val abTestService = client.cms().pages().aBTests()

        val page =
            abTestService.createAbTestVariation(
                AbTestCreateRequestVNext.builder()
                    .contentId("contentId")
                    .variationName("variationName")
                    .build()
            )

        page.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun endAbTest() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val abTestService = client.cms().pages().aBTests()

        abTestService.endAbTest(
            AbTestEndRequestVNext.builder().abTestId("abTestId").winnerId("winnerId").build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun rerunAbTest() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val abTestService = client.cms().pages().aBTests()

        abTestService.rerunAbTest(
            AbTestRerunRequestVNext.builder()
                .abTestId("abTestId")
                .variationId("variationId")
                .build()
        )
    }
}
