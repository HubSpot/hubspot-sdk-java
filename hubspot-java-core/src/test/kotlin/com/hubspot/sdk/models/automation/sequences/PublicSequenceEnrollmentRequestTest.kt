// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.sequences

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicSequenceEnrollmentRequestTest {

    @Test
    fun create() {
        val publicSequenceEnrollmentRequest =
            PublicSequenceEnrollmentRequest.builder()
                .contactId("contactId")
                .senderEmail("senderEmail")
                .sequenceId("sequenceId")
                .senderAliasAddress("senderAliasAddress")
                .build()

        assertThat(publicSequenceEnrollmentRequest.contactId()).isEqualTo("contactId")
        assertThat(publicSequenceEnrollmentRequest.senderEmail()).isEqualTo("senderEmail")
        assertThat(publicSequenceEnrollmentRequest.sequenceId()).isEqualTo("sequenceId")
        assertThat(publicSequenceEnrollmentRequest.senderAliasAddress())
            .contains("senderAliasAddress")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicSequenceEnrollmentRequest =
            PublicSequenceEnrollmentRequest.builder()
                .contactId("contactId")
                .senderEmail("senderEmail")
                .sequenceId("sequenceId")
                .senderAliasAddress("senderAliasAddress")
                .build()

        val roundtrippedPublicSequenceEnrollmentRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicSequenceEnrollmentRequest),
                jacksonTypeRef<PublicSequenceEnrollmentRequest>(),
            )

        assertThat(roundtrippedPublicSequenceEnrollmentRequest)
            .isEqualTo(publicSequenceEnrollmentRequest)
    }
}
