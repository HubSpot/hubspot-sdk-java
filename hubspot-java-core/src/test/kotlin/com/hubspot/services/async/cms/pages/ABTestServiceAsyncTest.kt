// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.cms.pages

import com.hubspot.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.models.AbTestCreateRequestVNext
import com.hubspot.models.cms.pages.AbTestEndRequestVNext
import com.hubspot.models.cms.pages.AbTestRerunRequestVNext
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ABTestServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createLandingPageVariation() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val abTestServiceAsync = client.cms().pages().aBTests()

        val pageDataFuture =
            abTestServiceAsync.createLandingPageVariation(
                AbTestCreateRequestVNext.builder()
                    .contentId("contentId")
                    .variationName("variationName")
                    .build()
            )

        val pageData = pageDataFuture.get()
        pageData.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createSitePageVariation() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val abTestServiceAsync = client.cms().pages().aBTests()

        val pageDataFuture =
            abTestServiceAsync.createSitePageVariation(
                AbTestCreateRequestVNext.builder()
                    .contentId("contentId")
                    .variationName("variationName")
                    .build()
            )

        val pageData = pageDataFuture.get()
        pageData.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun endLandingPageTest() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
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
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
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
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
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
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
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
