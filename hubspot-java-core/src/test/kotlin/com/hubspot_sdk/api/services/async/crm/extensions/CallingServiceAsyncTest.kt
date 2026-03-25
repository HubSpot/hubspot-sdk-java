// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.extensions

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.crm.extensions.calling.CallingCreateParams
import com.hubspot_sdk.api.models.crm.extensions.calling.CallingUpdateParams
import com.hubspot_sdk.api.models.crm.extensions.calling.MarkRecordingAsReadyRequest
import com.hubspot_sdk.api.models.crm.extensions.calling.RecordingSettingsPatchRequest
import com.hubspot_sdk.api.models.crm.extensions.calling.RecordingSettingsRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CallingServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val callingServiceAsync = client.crm().extensions().calling()

        val recordingSettingsResponseFuture =
            callingServiceAsync.create(
                CallingCreateParams.builder()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val callingServiceAsync = client.crm().extensions().calling()

        val recordingSettingsResponseFuture =
            callingServiceAsync.update(
                CallingUpdateParams.builder()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val callingServiceAsync = client.crm().extensions().calling()

        val future = callingServiceAsync.delete(0)

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val callingServiceAsync = client.crm().extensions().calling()

        val recordingSettingsResponseFuture = callingServiceAsync.get(0)

        val recordingSettingsResponse = recordingSettingsResponseFuture.get()
        recordingSettingsResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun markReady() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val callingServiceAsync = client.crm().extensions().calling()

        val future =
            callingServiceAsync.markReady(
                MarkRecordingAsReadyRequest.builder().engagementId(0L).build()
            )

        val response = future.get()
    }
}
