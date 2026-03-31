// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.extensions

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.crm.extensions.videoconferencing.ExternalSettings
import com.hubspot_sdk.api.models.crm.extensions.videoconferencing.VideoConferencingUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class VideoConferencingServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val videoConferencingService = client.crm().extensions().videoConferencing()

        val externalSettings =
            videoConferencingService.update(
                VideoConferencingUpdateParams.builder()
                    .appId(0)
                    .externalSettings(
                        ExternalSettings.builder()
                            .createMeetingUrl("createMeetingUrl")
                            .deleteMeetingUrl("deleteMeetingUrl")
                            .fetchAccountsUri("fetchAccountsUri")
                            .updateMeetingUrl("updateMeetingUrl")
                            .userVerifyUrl("userVerifyUrl")
                            .build()
                    )
                    .build()
            )

        externalSettings.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val videoConferencingService = client.crm().extensions().videoConferencing()

        videoConferencingService.delete(0)
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val videoConferencingService = client.crm().extensions().videoConferencing()

        val externalSettings = videoConferencingService.get(0)

        externalSettings.validate()
    }
}
