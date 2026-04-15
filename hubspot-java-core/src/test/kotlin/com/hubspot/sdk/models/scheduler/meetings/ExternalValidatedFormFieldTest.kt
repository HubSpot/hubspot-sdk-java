// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.scheduler.meetings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalValidatedFormFieldTest {

    @Test
    fun create() {
        val externalValidatedFormField =
            ExternalValidatedFormField.builder()
                .isCustom(true)
                .label("label")
                .name("name")
                .value("value")
                .fieldType("fieldType")
                .translatedLabel("translatedLabel")
                .valueLabel("valueLabel")
                .build()

        assertThat(externalValidatedFormField.isCustom()).isEqualTo(true)
        assertThat(externalValidatedFormField.label()).isEqualTo("label")
        assertThat(externalValidatedFormField.name()).isEqualTo("name")
        assertThat(externalValidatedFormField.value()).isEqualTo("value")
        assertThat(externalValidatedFormField.fieldType()).contains("fieldType")
        assertThat(externalValidatedFormField.translatedLabel()).contains("translatedLabel")
        assertThat(externalValidatedFormField.valueLabel()).contains("valueLabel")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalValidatedFormField =
            ExternalValidatedFormField.builder()
                .isCustom(true)
                .label("label")
                .name("name")
                .value("value")
                .fieldType("fieldType")
                .translatedLabel("translatedLabel")
                .valueLabel("valueLabel")
                .build()

        val roundtrippedExternalValidatedFormField =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalValidatedFormField),
                jacksonTypeRef<ExternalValidatedFormField>(),
            )

        assertThat(roundtrippedExternalValidatedFormField).isEqualTo(externalValidatedFormField)
    }
}
