// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.scheduler.meetings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalMeetingsWelcomeScreenInfoTest {

    @Test
    fun create() {
        val externalMeetingsWelcomeScreenInfo =
            ExternalMeetingsWelcomeScreenInfo.builder()
                .description("description")
                .logoUrl("logoUrl")
                .showWelcomeScreen(true)
                .title("title")
                .useCompanyLogo(true)
                .build()

        assertThat(externalMeetingsWelcomeScreenInfo.description()).contains("description")
        assertThat(externalMeetingsWelcomeScreenInfo.logoUrl()).contains("logoUrl")
        assertThat(externalMeetingsWelcomeScreenInfo.showWelcomeScreen()).contains(true)
        assertThat(externalMeetingsWelcomeScreenInfo.title()).contains("title")
        assertThat(externalMeetingsWelcomeScreenInfo.useCompanyLogo()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalMeetingsWelcomeScreenInfo =
            ExternalMeetingsWelcomeScreenInfo.builder()
                .description("description")
                .logoUrl("logoUrl")
                .showWelcomeScreen(true)
                .title("title")
                .useCompanyLogo(true)
                .build()

        val roundtrippedExternalMeetingsWelcomeScreenInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalMeetingsWelcomeScreenInfo),
                jacksonTypeRef<ExternalMeetingsWelcomeScreenInfo>(),
            )

        assertThat(roundtrippedExternalMeetingsWelcomeScreenInfo)
            .isEqualTo(externalMeetingsWelcomeScreenInfo)
    }
}
