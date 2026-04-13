// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CopilotRequestContextTest {

    @Test
    fun create() {
        val copilotRequestContext =
            CopilotRequestContext.builder()
                .source(CopilotRequestContext.Source.COPILOT)
                .trajectoryId("trajectoryId")
                .build()

        assertThat(copilotRequestContext.source()).isEqualTo(CopilotRequestContext.Source.COPILOT)
        assertThat(copilotRequestContext.trajectoryId()).contains("trajectoryId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val copilotRequestContext =
            CopilotRequestContext.builder()
                .source(CopilotRequestContext.Source.COPILOT)
                .trajectoryId("trajectoryId")
                .build()

        val roundtrippedCopilotRequestContext =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(copilotRequestContext),
                jacksonTypeRef<CopilotRequestContext>(),
            )

        assertThat(roundtrippedCopilotRequestContext).isEqualTo(copilotRequestContext)
    }
}
