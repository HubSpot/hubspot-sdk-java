// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.scheduler.meetings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalCommunicationConsentCheckboxTest {

    @Test
    fun create() {
        val externalCommunicationConsentCheckbox =
            ExternalCommunicationConsentCheckbox.builder()
                .communicationTypeId("communicationTypeId")
                .label("label")
                .required(true)
                .build()

        assertThat(externalCommunicationConsentCheckbox.communicationTypeId())
            .isEqualTo("communicationTypeId")
        assertThat(externalCommunicationConsentCheckbox.label()).isEqualTo("label")
        assertThat(externalCommunicationConsentCheckbox.required()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalCommunicationConsentCheckbox =
            ExternalCommunicationConsentCheckbox.builder()
                .communicationTypeId("communicationTypeId")
                .label("label")
                .required(true)
                .build()

        val roundtrippedExternalCommunicationConsentCheckbox =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalCommunicationConsentCheckbox),
                jacksonTypeRef<ExternalCommunicationConsentCheckbox>(),
            )

        assertThat(roundtrippedExternalCommunicationConsentCheckbox)
            .isEqualTo(externalCommunicationConsentCheckbox)
    }
}
