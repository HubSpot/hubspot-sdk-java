// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.sequences

import com.hubspot.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SequenceCreateEnrollmentParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun queryParams() {
        val params =
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

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("userId", "userId").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            SequenceCreateEnrollmentParams.builder()
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
            SequenceCreateEnrollmentParams.builder()
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
