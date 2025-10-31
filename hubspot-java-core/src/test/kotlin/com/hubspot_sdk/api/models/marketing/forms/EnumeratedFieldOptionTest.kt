// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.forms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnumeratedFieldOptionTest {

    @Test
    fun create() {
        val enumeratedFieldOption =
            EnumeratedFieldOption.builder()
                .displayOrder(0)
                .label("label")
                .value("value")
                .description("description")
                .build()

        assertThat(enumeratedFieldOption.displayOrder()).isEqualTo(0)
        assertThat(enumeratedFieldOption.label()).isEqualTo("label")
        assertThat(enumeratedFieldOption.value()).isEqualTo("value")
        assertThat(enumeratedFieldOption.description()).contains("description")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val enumeratedFieldOption =
            EnumeratedFieldOption.builder()
                .displayOrder(0)
                .label("label")
                .value("value")
                .description("description")
                .build()

        val roundtrippedEnumeratedFieldOption =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(enumeratedFieldOption),
                jacksonTypeRef<EnumeratedFieldOption>(),
            )

        assertThat(roundtrippedEnumeratedFieldOption).isEqualTo(enumeratedFieldOption)
    }
}
