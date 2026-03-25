// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.scheduler.meetings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalLegalConsentResponseTest {

    @Test
    fun create() {
        val externalLegalConsentResponse =
            ExternalLegalConsentResponse.builder()
                .communicationTypeId("communicationTypeId")
                .consented(true)
                .build()

        assertThat(externalLegalConsentResponse.communicationTypeId())
            .isEqualTo("communicationTypeId")
        assertThat(externalLegalConsentResponse.consented()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalLegalConsentResponse =
            ExternalLegalConsentResponse.builder()
                .communicationTypeId("communicationTypeId")
                .consented(true)
                .build()

        val roundtrippedExternalLegalConsentResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalLegalConsentResponse),
                jacksonTypeRef<ExternalLegalConsentResponse>(),
            )

        assertThat(roundtrippedExternalLegalConsentResponse).isEqualTo(externalLegalConsentResponse)
    }
}
