// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.automation

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.automation.sequences.PublicSequenceEnrollmentRequest
import com.hubspot_sdk.api.models.automation.sequences.SequenceCreateEnrollmentParams
import com.hubspot_sdk.api.models.automation.sequences.SequenceGetParams
import com.hubspot_sdk.api.models.automation.sequences.SequenceListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SequenceServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val sequenceServiceAsync = client.automation().sequences()

        val pageFuture =
            sequenceServiceAsync.list(SequenceListParams.builder().userId("userId").build())

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createEnrollment() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val sequenceServiceAsync = client.automation().sequences()

        val publicSequenceEnrollmentLiteResponseFuture =
            sequenceServiceAsync.createEnrollment(
                SequenceCreateEnrollmentParams.builder()
                    .userId("userId")
                    .publicSequenceEnrollmentRequest(
                        PublicSequenceEnrollmentRequest.builder()
                            .contactId("contactId")
                            .senderEmail("senderEmail")
                            .sequenceId("sequenceId")
                            .senderAliasAddress("senderAliasAddress")
                            .build()
                    )
                    .build()
            )

        val publicSequenceEnrollmentLiteResponse = publicSequenceEnrollmentLiteResponseFuture.get()
        publicSequenceEnrollmentLiteResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val sequenceServiceAsync = client.automation().sequences()

        val publicSequenceResponseFuture =
            sequenceServiceAsync.get(
                SequenceGetParams.builder().sequenceId("sequenceId").userId("userId").build()
            )

        val publicSequenceResponse = publicSequenceResponseFuture.get()
        publicSequenceResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getEnrollmentByContactId() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val sequenceServiceAsync = client.automation().sequences()

        val publicSequenceEnrollmentResponseFuture =
            sequenceServiceAsync.getEnrollmentByContactId("contactId")

        val publicSequenceEnrollmentResponse = publicSequenceEnrollmentResponseFuture.get()
        publicSequenceEnrollmentResponse.validate()
    }
}
