// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.extensions.calling

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.crm.extensions.calling.CompletedThirdPartyCallRequest
import com.hubspot_sdk.api.models.crm.extensions.calling.FormattedPhoneNumber
import com.hubspot_sdk.api.models.crm.extensions.calling.transcripts.Speaker
import com.hubspot_sdk.api.models.crm.extensions.calling.transcripts.TranscriptCreateRequest
import com.hubspot_sdk.api.models.crm.extensions.calling.transcripts.TranscriptCreateUtterance
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TranscriptServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val transcriptServiceAsync = client.crm().extensions().calling().transcripts()

        val transcriptCreateResponseFuture =
            transcriptServiceAsync.create(
                TranscriptCreateRequest.builder()
                    .engagementId(0L)
                    .addTranscriptCreateUtterance(
                        TranscriptCreateUtterance.builder()
                            .endTimeMillis(0)
                            .speaker(Speaker.builder().id("id").name("name").email("email").build())
                            .startTimeMillis(0)
                            .text("text")
                            .languageCode("languageCode")
                            .build()
                    )
                    .build()
            )

        val transcriptCreateResponse = transcriptCreateResponseFuture.get()
        transcriptCreateResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val transcriptServiceAsync = client.crm().extensions().calling().transcripts()

        val future = transcriptServiceAsync.delete("transcriptId")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createInboundCall() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val transcriptServiceAsync = client.crm().extensions().calling().transcripts()

        val completedThirdPartyCallResponseFuture =
            transcriptServiceAsync.createInboundCall(
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
    fun get() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val transcriptServiceAsync = client.crm().extensions().calling().transcripts()

        val transcriptResponseFuture = transcriptServiceAsync.get("transcriptId")

        val transcriptResponse = transcriptResponseFuture.get()
        transcriptResponse.validate()
    }
}
