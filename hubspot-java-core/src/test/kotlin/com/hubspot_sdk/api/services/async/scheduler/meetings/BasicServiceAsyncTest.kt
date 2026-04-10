// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.scheduler.meetings

import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot_sdk.api.models.scheduler.meetings.basic.BasicGetAvailabilityBySlugParams
import com.hubspot_sdk.api.models.scheduler.meetings.basic.BasicGetBookingInfoBySlugParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BasicServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val basicServiceAsync = client.scheduler().meetings().basic()

        val pageFuture = basicServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getAvailabilityBySlug() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val basicServiceAsync = client.scheduler().meetings().basic()

        val externalLinkAvailabilityAndBusyTimesFuture =
            basicServiceAsync.getAvailabilityBySlug(
                BasicGetAvailabilityBySlugParams.builder()
                    .slug("slug")
                    .timezone("timezone")
                    .monthOffset(0)
                    .build()
            )

        val externalLinkAvailabilityAndBusyTimes = externalLinkAvailabilityAndBusyTimesFuture.get()
        externalLinkAvailabilityAndBusyTimes.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getBookingInfoBySlug() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val basicServiceAsync = client.scheduler().meetings().basic()

        val externalBookingInfoFuture =
            basicServiceAsync.getBookingInfoBySlug(
                BasicGetBookingInfoBySlugParams.builder().slug("slug").timezone("timezone").build()
            )

        val externalBookingInfo = externalBookingInfoFuture.get()
        externalBookingInfo.validate()
    }
}
