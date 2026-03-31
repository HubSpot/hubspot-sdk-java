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
    fun createLandingPageVariation() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val abTestService = client.cms().pages().aBTests()

        val page =
            abTestService.createLandingPageVariation(
                AbTestCreateRequestVNext.builder()
                    .contentId("contentId")
                    .variationName("variationName")
                    .build()
            )

        page.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createSitePageVariation() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val abTestService = client.cms().pages().aBTests()

        val page =
            abTestService.createSitePageVariation(
                AbTestCreateRequestVNext.builder()
                    .contentId("contentId")
                    .variationName("variationName")
                    .build()
            )

        page.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun endLandingPageTest() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val abTestService = client.cms().pages().aBTests()

        abTestService.endLandingPageTest(
            AbTestEndRequestVNext.builder().abTestId("abTestId").winnerId("winnerId").build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun endSitePageTest() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val abTestService = client.cms().pages().aBTests()

        abTestService.endSitePageTest(
            AbTestEndRequestVNext.builder().abTestId("abTestId").winnerId("winnerId").build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun rerunLandingPageTest() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val abTestService = client.cms().pages().aBTests()

        abTestService.rerunLandingPageTest(
            AbTestRerunRequestVNext.builder()
                .abTestId("abTestId")
                .variationId("variationId")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun rerunSitePageTest() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val abTestService = client.cms().pages().aBTests()

        abTestService.rerunSitePageTest(
            AbTestRerunRequestVNext.builder()
                .abTestId("abTestId")
                .variationId("variationId")
                .build()
        )
    }
}
