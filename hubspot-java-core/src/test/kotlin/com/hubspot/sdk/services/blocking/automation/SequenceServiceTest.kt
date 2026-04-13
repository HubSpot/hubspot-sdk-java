// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.automation

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import com.hubspot.sdk.models.automation.sequences.PublicSequenceEnrollmentRequest
import com.hubspot.sdk.models.automation.sequences.SequenceCreateEnrollmentParams
import com.hubspot.sdk.models.automation.sequences.SequenceGetParams
import com.hubspot.sdk.models.automation.sequences.SequenceListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SequenceServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val sequenceService = client.automation().sequences()

        val page = sequenceService.list(SequenceListParams.builder().userId("userId").build())

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createEnrollment() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val sequenceService = client.automation().sequences()

        val publicSequenceEnrollmentLiteResponse =
            sequenceService.createEnrollment(
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

        publicSequenceEnrollmentLiteResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val sequenceService = client.automation().sequences()

        val publicSequenceResponse =
            sequenceService.get(
                SequenceGetParams.builder().sequenceId("sequenceId").userId("userId").build()
            )

        publicSequenceResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getEnrollmentByContactId() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val sequenceService = client.automation().sequences()

        val publicSequenceEnrollmentResponse = sequenceService.getEnrollmentByContactId("contactId")

        publicSequenceEnrollmentResponse.validate()
    }
}
