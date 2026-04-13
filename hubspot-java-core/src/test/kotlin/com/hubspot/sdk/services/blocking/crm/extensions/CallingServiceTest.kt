// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.crm.extensions

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.models.crm.extensions.calling.CallingCreateChannelConnectionSettingsParams
import com.hubspot.sdk.models.crm.extensions.calling.CallingCreateRecordingSettingsParams
import com.hubspot.sdk.models.crm.extensions.calling.CallingCreateSettingsParams
import com.hubspot.sdk.models.crm.extensions.calling.CallingUpdateChannelConnectionSettingsParams
import com.hubspot.sdk.models.crm.extensions.calling.CallingUpdateRecordingSettingsParams
import com.hubspot.sdk.models.crm.extensions.calling.CallingUpdateSettingsParams
import com.hubspot.sdk.models.crm.extensions.calling.ChannelConnectionSettingsPatchRequest
import com.hubspot.sdk.models.crm.extensions.calling.ChannelConnectionSettingsRequest
import com.hubspot.sdk.models.crm.extensions.calling.CompletedThirdPartyCallRequest
import com.hubspot.sdk.models.crm.extensions.calling.FormattedPhoneNumber
import com.hubspot.sdk.models.crm.extensions.calling.MarkRecordingAsReadyRequest
import com.hubspot.sdk.models.crm.extensions.calling.RecordingSettingsPatchRequest
import com.hubspot.sdk.models.crm.extensions.calling.RecordingSettingsRequest
import com.hubspot.sdk.models.crm.extensions.calling.SettingsPatchRequest
import com.hubspot.sdk.models.crm.extensions.calling.SettingsRequest
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CallingServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createChannelConnectionSettings() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val callingService = client.crm().extensions().calling()

        val channelConnectionSettingsResponse =
            callingService.createChannelConnectionSettings(
                CallingCreateChannelConnectionSettingsParams.builder()
                    .appId(0)
                    .channelConnectionSettingsRequest(
                        ChannelConnectionSettingsRequest.builder().isReady(true).url("url").build()
                    )
                    .build()
            )

        channelConnectionSettingsResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createInboundCall() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val callingService = client.crm().extensions().calling()

        val completedThirdPartyCallResponse =
            callingService.createInboundCall(
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

        completedThirdPartyCallResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createRecordingReady() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val callingService = client.crm().extensions().calling()

        callingService.createRecordingReady(
            MarkRecordingAsReadyRequest.builder().engagementId(0L).build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createRecordingSettings() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val callingService = client.crm().extensions().calling()

        val recordingSettingsResponse =
            callingService.createRecordingSettings(
                CallingCreateRecordingSettingsParams.builder()
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
    fun createSettings() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val callingService = client.crm().extensions().calling()

        val settingsResponse =
            callingService.createSettings(
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

        settingsResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteChannelConnectionSettings() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val callingService = client.crm().extensions().calling()

        callingService.deleteChannelConnectionSettings(0)
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteSettings() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val callingService = client.crm().extensions().calling()

        callingService.deleteSettings(0)
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getChannelConnectionSettings() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val callingService = client.crm().extensions().calling()

        val channelConnectionSettingsResponse = callingService.getChannelConnectionSettings(0)

        channelConnectionSettingsResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getRecordingSettings() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val callingService = client.crm().extensions().calling()

        val recordingSettingsResponse = callingService.getRecordingSettings(0)

        recordingSettingsResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSettings() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val callingService = client.crm().extensions().calling()

        val settingsResponse = callingService.getSettings(0)

        settingsResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateChannelConnectionSettings() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val callingService = client.crm().extensions().calling()

        val channelConnectionSettingsResponse =
            callingService.updateChannelConnectionSettings(
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

        channelConnectionSettingsResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateRecordingSettings() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val callingService = client.crm().extensions().calling()

        val recordingSettingsResponse =
            callingService.updateRecordingSettings(
                CallingUpdateRecordingSettingsParams.builder()
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
    fun updateSettings() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val callingService = client.crm().extensions().calling()

        val settingsResponse =
            callingService.updateSettings(
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

        settingsResponse.validate()
    }
}
