// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.sequences

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicEmailPatternResponseTest {

    @Test
    fun create() {
        val publicEmailPatternResponse =
            PublicEmailPatternResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .templateId("templateId")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .threadEmailToStepOrder(0)
                .build()

        assertThat(publicEmailPatternResponse.id()).isEqualTo("id")
        assertThat(publicEmailPatternResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicEmailPatternResponse.templateId()).isEqualTo("templateId")
        assertThat(publicEmailPatternResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicEmailPatternResponse.threadEmailToStepOrder()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicEmailPatternResponse =
            PublicEmailPatternResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .templateId("templateId")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .threadEmailToStepOrder(0)
                .build()

        val roundtrippedPublicEmailPatternResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicEmailPatternResponse),
                jacksonTypeRef<PublicEmailPatternResponse>(),
            )

        assertThat(roundtrippedPublicEmailPatternResponse).isEqualTo(publicEmailPatternResponse)
    }
}
