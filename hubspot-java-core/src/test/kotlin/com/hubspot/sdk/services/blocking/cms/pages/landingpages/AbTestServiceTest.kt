// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms.pages.landingpages

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import com.hubspot.sdk.models.AbTestCreateRequestVNext
import com.hubspot.sdk.models.cms.pages.AbTestEndRequestVNext
import com.hubspot.sdk.models.cms.pages.AbTestRerunRequestVNext
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AbTestServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createLandingPageVariation() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val abTestService = client.cms().pages().landingPages().abTest()

        val pagesPage =
            abTestService.createLandingPageVariation(
                AbTestCreateRequestVNext.builder()
                    .contentId("contentId")
                    .variationName("variationName")
                    .build()
            )

        pagesPage.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun endLandingPageTest() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val abTestService = client.cms().pages().landingPages().abTest()

        abTestService.endLandingPageTest(
            AbTestEndRequestVNext.builder().abTestId("abTestId").winnerId("winnerId").build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun rerunLandingPageTest() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val abTestService = client.cms().pages().landingPages().abTest()

        abTestService.rerunLandingPageTest(
            AbTestRerunRequestVNext.builder()
                .abTestId("abTestId")
                .variationId("variationId")
                .build()
        )
    }
}
