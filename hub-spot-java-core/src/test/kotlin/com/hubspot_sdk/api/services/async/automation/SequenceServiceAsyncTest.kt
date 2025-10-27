// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.automation

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SequenceServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val sequenceServiceAsync = client.automation().sequences()

        val collectionResponseWithTotalPublicSequenceLiteResponseForwardPagingFuture =
            sequenceServiceAsync.list()

        val collectionResponseWithTotalPublicSequenceLiteResponseForwardPaging =
            collectionResponseWithTotalPublicSequenceLiteResponseForwardPagingFuture.get()
        collectionResponseWithTotalPublicSequenceLiteResponseForwardPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val sequenceServiceAsync = client.automation().sequences()

        val publicSequenceResponseFuture = sequenceServiceAsync.get("sequenceId")

        val publicSequenceResponse = publicSequenceResponseFuture.get()
        publicSequenceResponse.validate()
    }
}
