// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.sequences.enrollments

import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.models.automation.sequences.PublicSequenceEnrollmentRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnrollmentEnrollParamsTest {

    @Test
    fun create() {
        EnrollmentEnrollParams.builder()
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
    }

    @Test
    fun queryParams() {
        val params =
            EnrollmentEnrollParams.builder()
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

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("userId", "userId").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            EnrollmentEnrollParams.builder()
                .userId("userId")
                .publicSequenceEnrollmentRequest(
                    PublicSequenceEnrollmentRequest.builder()
                        .contactId("contactId")
                        .senderEmail("senderEmail")
                        .sequenceId("sequenceId")
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("userId", "userId").build())
    }

    @Test
    fun body() {
        val params =
            EnrollmentEnrollParams.builder()
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
                .userId("userId")
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
