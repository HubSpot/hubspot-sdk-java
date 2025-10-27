// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.sequences.enrollments

import com.hubspot_sdk.api.models.automation.sequences.PublicSequenceEnrollmentRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnrollmentEnrollParamsTest {

    @Test
    fun create() {
        EnrollmentEnrollParams.builder()
            .publicSequenceEnrollmentRequest(
                PublicSequenceEnrollmentRequest.builder()
                    .contactId("contactId")
                    .senderEmail("senderEmail")
                    .sequenceId("sequenceId")
                    .senderAliasAddress("senderAliasAddress")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            EnrollmentEnrollParams.builder()
                .publicSequenceEnrollmentRequest(
                    PublicSequenceEnrollmentRequest.builder()
                        .contactId("contactId")
                        .senderEmail("senderEmail")
                        .sequenceId("sequenceId")
                        .senderAliasAddress("senderAliasAddress")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PublicSequenceEnrollmentRequest.builder()
                    .contactId("contactId")
                    .senderEmail("senderEmail")
                    .sequenceId("sequenceId")
                    .senderAliasAddress("senderAliasAddress")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EnrollmentEnrollParams.builder()
                .publicSequenceEnrollmentRequest(
                    PublicSequenceEnrollmentRequest.builder()
                        .contactId("contactId")
                        .senderEmail("senderEmail")
                        .sequenceId("sequenceId")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PublicSequenceEnrollmentRequest.builder()
                    .contactId("contactId")
                    .senderEmail("senderEmail")
                    .sequenceId("sequenceId")
                    .build()
            )
    }
}
