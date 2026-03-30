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
    fun createAbTestVariation() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val abTestServiceAsync = client.cms().pages().aBTests()

        val pageFuture =
            abTestServiceAsync.createAbTestVariation(
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
    fun endAbTest() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val abTestServiceAsync = client.cms().pages().aBTests()

        val future =
            abTestServiceAsync.endAbTest(
                AbTestEndRequestVNext.builder().abTestId("abTestId").winnerId("winnerId").build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun rerunAbTest() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val abTestServiceAsync = client.cms().pages().aBTests()

        val future =
            abTestServiceAsync.rerunAbTest(
                AbTestRerunRequestVNext.builder()
                    .abTestId("abTestId")
                    .variationId("variationId")
                    .build()
            )

        val response = future.get()
    }
}
