// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.automation.sequences

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClient
import com.hubspot_sdk.api.models.automation.sequences.PublicSequenceEnrollmentRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EnrollmentServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun enroll() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val enrollmentService = client.automation().sequences().enrollments()

        val publicSequenceEnrollmentLiteResponse =
            enrollmentService.enroll(
                PublicSequenceEnrollmentRequest.builder()
                    .contactId("contactId")
                    .senderEmail("senderEmail")
                    .sequenceId("sequenceId")
                    .senderAliasAddress("senderAliasAddress")
                    .build()
            )

        publicSequenceEnrollmentLiteResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getByContactId() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val enrollmentService = client.automation().sequences().enrollments()

        val publicSequenceEnrollmentResponse = enrollmentService.getByContactId("contactId")

        publicSequenceEnrollmentResponse.validate()
    }
}
