// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicOptionTest {

    @Test
    fun create() {
        val publicOption =
            PublicOption.builder()
                .label("label")
                .value("value")
                .description("description")
                .displayOrder(0)
                .build()

        assertThat(publicOption.label()).isEqualTo("label")
        assertThat(publicOption.value()).isEqualTo("value")
        assertThat(publicOption.description()).contains("description")
        assertThat(publicOption.displayOrder()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicOption =
            PublicOption.builder()
                .label("label")
                .value("value")
                .description("description")
                .displayOrder(0)
                .build()

        val roundtrippedPublicOption =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicOption),
                jacksonTypeRef<PublicOption>(),
            )

        assertThat(roundtrippedPublicOption).isEqualTo(publicOption)
    }
}
