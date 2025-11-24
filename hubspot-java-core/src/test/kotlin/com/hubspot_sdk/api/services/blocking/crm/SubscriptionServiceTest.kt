// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.crm.subscriptions.PauseSubscriptionRequest
import com.hubspot_sdk.api.models.crm.subscriptions.SubscriptionPauseParams
import com.hubspot_sdk.api.models.crm.subscriptions.SubscriptionUnpauseParams
import com.hubspot_sdk.api.models.crm.subscriptions.UnpauseRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.parallel.ResourceLock

@ExtendWith(TestServerExtension::class)
@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class SubscriptionServiceTest {

    @Test
    fun cancel(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val subscriptionService = client.crm().subscriptions()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val response = subscriptionService.cancel(0L)

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun pause(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val subscriptionService = client.crm().subscriptions()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            subscriptionService.pause(
                SubscriptionPauseParams.builder()
                    .objectId(0L)
                    .pauseSubscriptionRequest(
                        PauseSubscriptionRequest.builder().pauseReason("pauseReason").build()
                    )
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun unpause(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val subscriptionService = client.crm().subscriptions()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            subscriptionService.unpause(
                SubscriptionUnpauseParams.builder()
                    .objectId(0L)
                    .unpauseRequest(UnpauseRequest.builder().proposedNextBillingDate(0L).build())
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }
}
