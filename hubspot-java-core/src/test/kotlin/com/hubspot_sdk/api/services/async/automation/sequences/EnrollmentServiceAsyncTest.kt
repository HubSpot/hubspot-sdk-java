// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.automation.sequences

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.automation.sequences.PublicSequenceEnrollmentRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EnrollmentServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun enroll() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val enrollmentServiceAsync = client.automation().sequences().enrollments()

        val publicSequenceEnrollmentLiteResponseFuture =
            enrollmentServiceAsync.enroll(
                PublicSequenceEnrollmentRequest.builder()
                    .contactId("contactId")
                    .senderEmail("senderEmail")
                    .sequenceId("sequenceId")
                    .senderAliasAddress("senderAliasAddress")
                    .build()
            )

        val publicSequenceEnrollmentLiteResponse = publicSequenceEnrollmentLiteResponseFuture.get()
        publicSequenceEnrollmentLiteResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getByContactId() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val enrollmentServiceAsync = client.automation().sequences().enrollments()

        val publicSequenceEnrollmentResponseFuture =
            enrollmentServiceAsync.getByContactId("contactId")

        val publicSequenceEnrollmentResponse = publicSequenceEnrollmentResponseFuture.get()
        publicSequenceEnrollmentResponse.validate()
    }
}
