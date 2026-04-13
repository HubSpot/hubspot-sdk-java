// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.scheduler.meetings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalOptionTest {

    @Test
    fun create() {
        val externalOption =
            ExternalOption.builder()
                .description("description")
                .displayOrder(0)
                .doubleData(0.0)
                .hidden(true)
                .label("label")
                .readOnly(true)
                .value("value")
                .build()

        assertThat(externalOption.description()).isEqualTo("description")
        assertThat(externalOption.displayOrder()).isEqualTo(0)
        assertThat(externalOption.doubleData()).isEqualTo(0.0)
        assertThat(externalOption.hidden()).isEqualTo(true)
        assertThat(externalOption.label()).isEqualTo("label")
        assertThat(externalOption.readOnly()).isEqualTo(true)
        assertThat(externalOption.value()).isEqualTo("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalOption =
            ExternalOption.builder()
                .description("description")
                .displayOrder(0)
                .doubleData(0.0)
                .hidden(true)
                .label("label")
                .readOnly(true)
                .value("value")
                .build()

        val roundtrippedExternalOption =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalOption),
                jacksonTypeRef<ExternalOption>(),
            )

        assertThat(roundtrippedExternalOption).isEqualTo(externalOption)
    }
}
