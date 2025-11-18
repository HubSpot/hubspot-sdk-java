// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.automation

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.automation.sequences.SequenceGetParams
import com.hubspot_sdk.api.models.automation.sequences.SequenceListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SequenceServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val sequenceServiceAsync = client.automation().sequences()

        val pageFuture =
            sequenceServiceAsync.list(SequenceListParams.builder().userId("userId").build())

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val sequenceServiceAsync = client.automation().sequences()

        val publicSequenceResponseFuture =
            sequenceServiceAsync.get(
                SequenceGetParams.builder().sequenceId("sequenceId").userId("userId").build()
            )

        val publicSequenceResponse = publicSequenceResponseFuture.get()
        publicSequenceResponse.validate()
    }
}
