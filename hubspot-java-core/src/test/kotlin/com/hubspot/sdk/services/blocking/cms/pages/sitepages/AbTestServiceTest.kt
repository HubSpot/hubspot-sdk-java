// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms.pages.sitepages

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import com.hubspot.sdk.models.AbTestCreateRequestVNext
import com.hubspot.sdk.models.cms.pages.AbTestEndRequestVNext
import com.hubspot.sdk.models.cms.pages.AbTestRerunRequestVNext
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AbTestServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createSitePageVariation() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val abTestService = client.cms().pages().sitePages().abTest()

        val pagesPage =
            abTestService.createSitePageVariation(
                AbTestCreateRequestVNext.builder()
                    .contentId("contentId")
                    .variationName("variationName")
                    .build()
            )

        pagesPage.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun endSitePageTest() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val abTestService = client.cms().pages().sitePages().abTest()

        abTestService.endSitePageTest(
            AbTestEndRequestVNext.builder().abTestId("abTestId").winnerId("winnerId").build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun rerunSitePageTest() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val abTestService = client.cms().pages().sitePages().abTest()

        abTestService.rerunSitePageTest(
            AbTestRerunRequestVNext.builder()
                .abTestId("abTestId")
                .variationId("variationId")
                .build()
        )
    }
}
