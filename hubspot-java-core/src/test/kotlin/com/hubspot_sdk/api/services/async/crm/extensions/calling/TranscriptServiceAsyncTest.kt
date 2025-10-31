// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.extensions.calling

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.crm.extensions.calling.transcripts.Speaker
import com.hubspot_sdk.api.models.crm.extensions.calling.transcripts.TranscriptCreateRequest
import com.hubspot_sdk.api.models.crm.extensions.calling.transcripts.TranscriptCreateUtterance
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TranscriptServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val transcriptServiceAsync = client.crm().extensions().calling().transcripts()

        val future = transcriptServiceAsync.delete("transcriptId")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val transcriptServiceAsync = client.crm().extensions().calling().transcripts()

        val transcriptResponseFuture = transcriptServiceAsync.get("transcriptId")

        val transcriptResponse = transcriptResponseFuture.get()
        transcriptResponse.validate()
    }
}
