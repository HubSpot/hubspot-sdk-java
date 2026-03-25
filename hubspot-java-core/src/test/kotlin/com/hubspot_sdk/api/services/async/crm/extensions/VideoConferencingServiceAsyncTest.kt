// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.extensions

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.crm.extensions.videoconferencing.ExternalSettings
import com.hubspot_sdk.api.models.crm.extensions.videoconferencing.VideoConferencingUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class VideoConferencingServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val videoConferencingServiceAsync = client.crm().extensions().videoConferencing()

        val externalSettingsFuture =
            videoConferencingServiceAsync.update(
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

        val externalSettings = externalSettingsFuture.get()
        externalSettings.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val videoConferencingServiceAsync = client.crm().extensions().videoConferencing()

        val future = videoConferencingServiceAsync.delete(0)

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val videoConferencingServiceAsync = client.crm().extensions().videoConferencing()

        val externalSettingsFuture = videoConferencingServiceAsync.get(0)

        val externalSettings = externalSettingsFuture.get()
        externalSettings.validate()
    }
}
