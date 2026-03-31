// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.pages

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.AbTestCreateRequestVNext
import com.hubspot_sdk.api.models.cms.pages.AbTestEndRequestVNext
import com.hubspot_sdk.api.models.cms.pages.AbTestRerunRequestVNext
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ABTestServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createLandingPageVariation() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val abTestServiceAsync = client.cms().pages().aBTests()

        val pageFuture =
            abTestServiceAsync.createLandingPageVariation(
                AbTestCreateRequestVNext.builder()
                    .contentId("contentId")
                    .variationName("variationName")
                    .build()
            )

        val page = pageFuture.get()
        page.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createSitePageVariation() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val abTestServiceAsync = client.cms().pages().aBTests()

        val pageFuture =
            abTestServiceAsync.createSitePageVariation(
                AbTestCreateRequestVNext.builder()
                    .contentId("contentId")
                    .variationName("variationName")
                    .build()
            )

        val page = pageFuture.get()
        page.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun endLandingPageTest() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val abTestServiceAsync = client.cms().pages().aBTests()

        val future =
            abTestServiceAsync.endLandingPageTest(
                AbTestEndRequestVNext.builder().abTestId("abTestId").winnerId("winnerId").build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun endSitePageTest() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val abTestServiceAsync = client.cms().pages().aBTests()

        val future =
            abTestServiceAsync.endSitePageTest(
                AbTestEndRequestVNext.builder().abTestId("abTestId").winnerId("winnerId").build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun rerunLandingPageTest() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val abTestServiceAsync = client.cms().pages().aBTests()

        val future =
            abTestServiceAsync.rerunLandingPageTest(
                AbTestRerunRequestVNext.builder()
                    .abTestId("abTestId")
                    .variationId("variationId")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun rerunSitePageTest() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val abTestServiceAsync = client.cms().pages().aBTests()

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
