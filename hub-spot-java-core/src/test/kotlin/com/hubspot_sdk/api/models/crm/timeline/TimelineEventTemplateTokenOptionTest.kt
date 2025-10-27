// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.timeline

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TimelineEventTemplateTokenOptionTest {

    @Test
    fun create() {
        val timelineEventTemplateTokenOption =
            TimelineEventTemplateTokenOption.builder().label("label").value("value").build()

        assertThat(timelineEventTemplateTokenOption.label()).isEqualTo("label")
        assertThat(timelineEventTemplateTokenOption.value()).isEqualTo("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val timelineEventTemplateTokenOption =
            TimelineEventTemplateTokenOption.builder().label("label").value("value").build()

        val roundtrippedTimelineEventTemplateTokenOption =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(timelineEventTemplateTokenOption),
                jacksonTypeRef<TimelineEventTemplateTokenOption>(),
            )

        assertThat(roundtrippedTimelineEventTemplateTokenOption)
            .isEqualTo(timelineEventTemplateTokenOption)
    }
}
