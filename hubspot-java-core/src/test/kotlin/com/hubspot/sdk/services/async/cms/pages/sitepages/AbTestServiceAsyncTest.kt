// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.cms.pages.sitepages

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.sdk.models.AbTestCreateRequestVNext
import com.hubspot.sdk.models.cms.pages.AbTestEndRequestVNext
import com.hubspot.sdk.models.cms.pages.AbTestRerunRequestVNext
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AbTestServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createSitePageVariation() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val abTestServiceAsync = client.cms().pages().sitePages().abTest()

        val pagesPageFuture =
            abTestServiceAsync.createSitePageVariation(
                AbTestCreateRequestVNext.builder()
                    .contentId("contentId")
                    .variationName("variationName")
                    .build()
            )

        val pagesPage = pagesPageFuture.get()
        pagesPage.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun endSitePageTest() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val abTestServiceAsync = client.cms().pages().sitePages().abTest()

        val future =
            abTestServiceAsync.endSitePageTest(
                AbTestEndRequestVNext.builder().abTestId("abTestId").winnerId("winnerId").build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun rerunSitePageTest() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val abTestServiceAsync = client.cms().pages().sitePages().abTest()

        val future =
            abTestServiceAsync.rerunSitePageTest(
                AbTestRerunRequestVNext.builder()
                    .abTestId("abTestId")
                    .variationId("variationId")
                    .build()
            )

        val response = future.get()
    }
}
