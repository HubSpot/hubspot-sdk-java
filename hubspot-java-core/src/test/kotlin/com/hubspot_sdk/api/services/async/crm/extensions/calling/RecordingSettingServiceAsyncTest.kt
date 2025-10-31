// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.extensions.calling

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.crm.extensions.calling.MarkRecordingAsReadyRequest
import com.hubspot_sdk.api.models.crm.extensions.calling.RecordingSettingsPatchRequest
import com.hubspot_sdk.api.models.crm.extensions.calling.RecordingSettingsRequest
import com.hubspot_sdk.api.models.crm.extensions.calling.recordingsettings.RecordingSettingCreateParams
import com.hubspot_sdk.api.models.crm.extensions.calling.recordingsettings.RecordingSettingUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RecordingSettingServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val recordingSettingServiceAsync = client.crm().extensions().calling().recordingSettings()

        val recordingSettingsResponseFuture =
            recordingSettingServiceAsync.create(
                RecordingSettingCreateParams.builder()
                    .appId(0)
                    .recordingSettingsRequest(
                        RecordingSettingsRequest.builder()
                            .urlToRetrieveAuthedRecording("urlToRetrieveAuthedRecording")
                            .build()
                    )
                    .build()
            )

        val recordingSettingsResponse = recordingSettingsResponseFuture.get()
        recordingSettingsResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val recordingSettingServiceAsync = client.crm().extensions().calling().recordingSettings()

        val recordingSettingsResponseFuture =
            recordingSettingServiceAsync.update(
                RecordingSettingUpdateParams.builder()
                    .appId(0)
                    .recordingSettingsPatchRequest(
                        RecordingSettingsPatchRequest.builder()
                            .urlToRetrieveAuthedRecording("urlToRetrieveAuthedRecording")
                            .build()
                    )
                    .build()
            )

        val recordingSettingsResponse = recordingSettingsResponseFuture.get()
        recordingSettingsResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val recordingSettingServiceAsync = client.crm().extensions().calling().recordingSettings()

        val recordingSettingsResponseFuture = recordingSettingServiceAsync.get(0)

        val recordingSettingsResponse = recordingSettingsResponseFuture.get()
        recordingSettingsResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun markReady() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val recordingSettingServiceAsync = client.crm().extensions().calling().recordingSettings()

        val future =
            recordingSettingServiceAsync.markReady(
                MarkRecordingAsReadyRequest.builder().engagementId(0L).build()
            )

        val response = future.get()
    }
}
