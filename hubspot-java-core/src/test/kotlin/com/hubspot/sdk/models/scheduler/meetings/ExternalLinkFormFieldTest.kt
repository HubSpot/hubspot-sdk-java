// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.scheduler.meetings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalLinkFormFieldTest {

    @Test
    fun create() {
        val externalLinkFormField =
            ExternalLinkFormField.builder()
                .fieldType("fieldType")
                .isCustom(true)
                .isRequired(true)
                .label("label")
                .name("name")
                .addOption(
                    ExternalOption.builder()
                        .description("description")
                        .displayOrder(0)
                        .doubleData(0.0)
                        .hidden(true)
                        .label("label")
                        .readOnly(true)
                        .value("value")
                        .build()
                )
                .type("type")
                .build()

        assertThat(externalLinkFormField.fieldType()).isEqualTo("fieldType")
        assertThat(externalLinkFormField.isCustom()).isEqualTo(true)
        assertThat(externalLinkFormField.isRequired()).isEqualTo(true)
        assertThat(externalLinkFormField.label()).isEqualTo("label")
        assertThat(externalLinkFormField.name()).isEqualTo("name")
        assertThat(externalLinkFormField.options())
            .containsExactly(
                ExternalOption.builder()
                    .description("description")
                    .displayOrder(0)
                    .doubleData(0.0)
                    .hidden(true)
                    .label("label")
                    .readOnly(true)
                    .value("value")
                    .build()
            )
        assertThat(externalLinkFormField.type()).isEqualTo("type")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalLinkFormField =
            ExternalLinkFormField.builder()
                .fieldType("fieldType")
                .isCustom(true)
                .isRequired(true)
                .label("label")
                .name("name")
                .addOption(
                    ExternalOption.builder()
                        .description("description")
                        .displayOrder(0)
                        .doubleData(0.0)
                        .hidden(true)
                        .label("label")
                        .readOnly(true)
                        .value("value")
                        .build()
                )
                .type("type")
                .build()

        val roundtrippedExternalLinkFormField =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalLinkFormField),
                jacksonTypeRef<ExternalLinkFormField>(),
            )

        assertThat(roundtrippedExternalLinkFormField).isEqualTo(externalLinkFormField)
    }
}
