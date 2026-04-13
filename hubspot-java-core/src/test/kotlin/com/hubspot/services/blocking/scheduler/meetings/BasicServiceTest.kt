// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.scheduler.meetings

import com.hubspot.client.okhttp.HubSpotOkHttpClient
import com.hubspot.models.scheduler.meetings.basic.BasicGetAvailabilityBySlugParams
import com.hubspot.models.scheduler.meetings.basic.BasicGetBookingInfoBySlugParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BasicServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val basicService = client.scheduler().meetings().basic()

        val page = basicService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getAvailabilityBySlug() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val basicService = client.scheduler().meetings().basic()

        val externalLinkAvailabilityAndBusyTimes =
            basicService.getAvailabilityBySlug(
                BasicGetAvailabilityBySlugParams.builder()
                    .slug("slug")
                    .timezone("timezone")
                    .monthOffset(0)
                    .build()
            )

        externalLinkAvailabilityAndBusyTimes.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getBookingInfoBySlug() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val basicService = client.scheduler().meetings().basic()

        val externalBookingInfo =
            basicService.getBookingInfoBySlug(
                BasicGetBookingInfoBySlugParams.builder().slug("slug").timezone("timezone").build()
            )

        externalBookingInfo.validate()
    }
}
