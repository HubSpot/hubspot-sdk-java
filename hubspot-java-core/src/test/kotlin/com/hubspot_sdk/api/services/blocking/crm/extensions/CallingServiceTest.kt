// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.extensions

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.crm.extensions.calling.CallingCreateParams
import com.hubspot_sdk.api.models.crm.extensions.calling.CallingUpdateParams
import com.hubspot_sdk.api.models.crm.extensions.calling.MarkRecordingAsReadyRequest
import com.hubspot_sdk.api.models.crm.extensions.calling.RecordingSettingsPatchRequest
import com.hubspot_sdk.api.models.crm.extensions.calling.RecordingSettingsRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CallingServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val callingService = client.crm().extensions().calling()

        val recordingSettingsResponse =
            callingService.create(
                CallingCreateParams.builder()
                    .appId(0)
                    .recordingSettingsRequest(
                        RecordingSettingsRequest.builder()
                            .urlToRetrieveAuthedRecording("urlToRetrieveAuthedRecording")
                            .build()
                    )
                    .build()
            )

        recordingSettingsResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val callingService = client.crm().extensions().calling()

        val recordingSettingsResponse =
            callingService.update(
                CallingUpdateParams.builder()
                    .appId(0)
                    .recordingSettingsPatchRequest(
                        RecordingSettingsPatchRequest.builder()
                            .urlToRetrieveAuthedRecording("urlToRetrieveAuthedRecording")
                            .build()
                    )
                    .build()
            )

        recordingSettingsResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val callingService = client.crm().extensions().calling()

        callingService.delete(0)
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val callingService = client.crm().extensions().calling()

        val recordingSettingsResponse = callingService.get(0)

        recordingSettingsResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun markReady() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val callingService = client.crm().extensions().calling()

        callingService.markReady(MarkRecordingAsReadyRequest.builder().engagementId(0L).build())
    }
}
