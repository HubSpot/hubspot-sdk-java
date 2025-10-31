// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.extensions.calling

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.crm.extensions.calling.transcripts.Speaker
import com.hubspot_sdk.api.models.crm.extensions.calling.transcripts.TranscriptCreateRequest
import com.hubspot_sdk.api.models.crm.extensions.calling.transcripts.TranscriptCreateUtterance
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TranscriptServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val transcriptService = client.crm().extensions().calling().transcripts()

        val transcriptCreateResponse =
            transcriptService.create(
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

        transcriptCreateResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val transcriptService = client.crm().extensions().calling().transcripts()

        transcriptService.delete("transcriptId")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val transcriptService = client.crm().extensions().calling().transcripts()

        val transcriptResponse = transcriptService.get("transcriptId")

        transcriptResponse.validate()
    }
}
