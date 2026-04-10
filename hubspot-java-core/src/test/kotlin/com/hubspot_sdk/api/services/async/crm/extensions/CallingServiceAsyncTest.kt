// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.extensions

import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.crm.extensions.calling.CallingCreateChannelConnectionSettingsParams
import com.hubspot_sdk.api.models.crm.extensions.calling.CallingCreateRecordingSettingsParams
import com.hubspot_sdk.api.models.crm.extensions.calling.CallingCreateSettingsParams
import com.hubspot_sdk.api.models.crm.extensions.calling.CallingUpdateChannelConnectionSettingsParams
import com.hubspot_sdk.api.models.crm.extensions.calling.CallingUpdateRecordingSettingsParams
import com.hubspot_sdk.api.models.crm.extensions.calling.CallingUpdateSettingsParams
import com.hubspot_sdk.api.models.crm.extensions.calling.ChannelConnectionSettingsPatchRequest
import com.hubspot_sdk.api.models.crm.extensions.calling.ChannelConnectionSettingsRequest
import com.hubspot_sdk.api.models.crm.extensions.calling.CompletedThirdPartyCallRequest
import com.hubspot_sdk.api.models.crm.extensions.calling.FormattedPhoneNumber
import com.hubspot_sdk.api.models.crm.extensions.calling.MarkRecordingAsReadyRequest
import com.hubspot_sdk.api.models.crm.extensions.calling.RecordingSettingsPatchRequest
import com.hubspot_sdk.api.models.crm.extensions.calling.RecordingSettingsRequest
import com.hubspot_sdk.api.models.crm.extensions.calling.SettingsPatchRequest
import com.hubspot_sdk.api.models.crm.extensions.calling.SettingsRequest
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CallingServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createChannelConnectionSettings() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val callingServiceAsync = client.crm().extensions().calling()

        val channelConnectionSettingsResponseFuture =
            callingServiceAsync.createChannelConnectionSettings(
                CallingCreateChannelConnectionSettingsParams.builder()
                    .appId(0)
                    .channelConnectionSettingsRequest(
                        ChannelConnectionSettingsRequest.builder().isReady(true).url("url").build()
                    )
                    .build()
            )

        val channelConnectionSettingsResponse = channelConnectionSettingsResponseFuture.get()
        channelConnectionSettingsResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createInboundCall() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val callingServiceAsync = client.crm().extensions().calling()

        val completedThirdPartyCallResponseFuture =
            callingServiceAsync.createInboundCall(
                CompletedThirdPartyCallRequest.builder()
                    .createEngagement(true)
                    .engagementProperties(
                        CompletedThirdPartyCallRequest.EngagementProperties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .externalCallId("externalCallId")
                    .finalCallStatus(CompletedThirdPartyCallRequest.FinalCallStatus.BUSY)
                    .fromNumber(
                        FormattedPhoneNumber.builder()
                            .e164Number("e164Number")
                            .phoneNumberType(FormattedPhoneNumber.PhoneNumberType.FIXED_LINE)
                            .extension("extension")
                            .build()
                    )
                    .addPotentialRecipientUserId(0)
                    .toNumber(
                        FormattedPhoneNumber.builder()
                            .e164Number("e164Number")
                            .phoneNumberType(FormattedPhoneNumber.PhoneNumberType.FIXED_LINE)
                            .extension("extension")
                            .build()
                    )
                    .callStartedTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .durationSeconds(0)
                    .userId(0)
                    .build()
            )

        val completedThirdPartyCallResponse = completedThirdPartyCallResponseFuture.get()
        completedThirdPartyCallResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createRecordingReady() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val callingServiceAsync = client.crm().extensions().calling()

        val future =
            callingServiceAsync.createRecordingReady(
                MarkRecordingAsReadyRequest.builder().engagementId(0L).build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createRecordingSettings() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val callingServiceAsync = client.crm().extensions().calling()

        val recordingSettingsResponseFuture =
            callingServiceAsync.createRecordingSettings(
                CallingCreateRecordingSettingsParams.builder()
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
    fun createSettings() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val callingServiceAsync = client.crm().extensions().calling()

        val settingsResponseFuture =
            callingServiceAsync.createSettings(
                CallingCreateSettingsParams.builder()
                    .appId(0)
                    .settingsRequest(
                        SettingsRequest.builder()
                            .height(0)
                            .isReady(true)
                            .name("name")
                            .supportsCustomObjects(true)
                            .supportsInboundCalling(true)
                            .url("url")
                            .usesCallingWindow(true)
                            .usesRemote(true)
                            .width(0)
                            .build()
                    )
                    .build()
            )

        val settingsResponse = settingsResponseFuture.get()
        settingsResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteChannelConnectionSettings() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val callingServiceAsync = client.crm().extensions().calling()

        val future = callingServiceAsync.deleteChannelConnectionSettings(0)

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteSettings() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val callingServiceAsync = client.crm().extensions().calling()

        val future = callingServiceAsync.deleteSettings(0)

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getChannelConnectionSettings() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val callingServiceAsync = client.crm().extensions().calling()

        val channelConnectionSettingsResponseFuture =
            callingServiceAsync.getChannelConnectionSettings(0)

        val channelConnectionSettingsResponse = channelConnectionSettingsResponseFuture.get()
        channelConnectionSettingsResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getRecordingSettings() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val callingServiceAsync = client.crm().extensions().calling()

        val recordingSettingsResponseFuture = callingServiceAsync.getRecordingSettings(0)

        val recordingSettingsResponse = recordingSettingsResponseFuture.get()
        recordingSettingsResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSettings() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val callingServiceAsync = client.crm().extensions().calling()

        val settingsResponseFuture = callingServiceAsync.getSettings(0)

        val settingsResponse = settingsResponseFuture.get()
        settingsResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateChannelConnectionSettings() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val callingServiceAsync = client.crm().extensions().calling()

        val channelConnectionSettingsResponseFuture =
            callingServiceAsync.updateChannelConnectionSettings(
                CallingUpdateChannelConnectionSettingsParams.builder()
                    .appId(0)
                    .channelConnectionSettingsPatchRequest(
                        ChannelConnectionSettingsPatchRequest.builder()
                            .isReady(true)
                            .url("url")
                            .build()
                    )
                    .build()
            )

        val channelConnectionSettingsResponse = channelConnectionSettingsResponseFuture.get()
        channelConnectionSettingsResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateRecordingSettings() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val callingServiceAsync = client.crm().extensions().calling()

        val recordingSettingsResponseFuture =
            callingServiceAsync.updateRecordingSettings(
                CallingUpdateRecordingSettingsParams.builder()
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
    fun updateSettings() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val callingServiceAsync = client.crm().extensions().calling()

        val settingsResponseFuture =
            callingServiceAsync.updateSettings(
                CallingUpdateSettingsParams.builder()
                    .appId(0)
                    .settingsPatchRequest(
                        SettingsPatchRequest.builder()
                            .height(0)
                            .isReady(true)
                            .name("name")
                            .supportsCustomObjects(true)
                            .supportsInboundCalling(true)
                            .url("url")
                            .usesCallingWindow(true)
                            .usesRemote(true)
                            .width(0)
                            .build()
                    )
                    .build()
            )

        val settingsResponse = settingsResponseFuture.get()
        settingsResponse.validate()
    }
}
