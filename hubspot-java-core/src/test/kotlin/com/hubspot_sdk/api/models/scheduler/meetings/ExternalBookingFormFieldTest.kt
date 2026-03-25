// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.scheduler.meetings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalBookingFormFieldTest {

    @Test
    fun create() {
        val externalBookingFormField =
            ExternalBookingFormField.builder().name("name").value("value").build()

        assertThat(externalBookingFormField.name()).isEqualTo("name")
        assertThat(externalBookingFormField.value()).isEqualTo("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalBookingFormField =
            ExternalBookingFormField.builder().name("name").value("value").build()

        val roundtrippedExternalBookingFormField =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalBookingFormField),
                jacksonTypeRef<ExternalBookingFormField>(),
            )

        assertThat(roundtrippedExternalBookingFormField).isEqualTo(externalBookingFormField)
    }
}
