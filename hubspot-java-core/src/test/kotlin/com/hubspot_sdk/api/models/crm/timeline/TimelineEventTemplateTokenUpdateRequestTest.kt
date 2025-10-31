// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.timeline

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TimelineEventTemplateTokenUpdateRequestTest {

    @Test
    fun create() {
        val timelineEventTemplateTokenUpdateRequest =
            TimelineEventTemplateTokenUpdateRequest.builder()
                .label("petType edit")
                .objectPropertyName("objectPropertyName")
                .options(
                    listOf(
                        TimelineEventTemplateTokenOption.builder()
                            .label("Dog")
                            .value("dog")
                            .build(),
                        TimelineEventTemplateTokenOption.builder()
                            .label("Cat")
                            .value("cat")
                            .build(),
                        TimelineEventTemplateTokenOption.builder()
                            .label("Bird")
                            .value("bird")
                            .build(),
                    )
                )
                .build()

        assertThat(timelineEventTemplateTokenUpdateRequest.label()).isEqualTo("petType edit")
        assertThat(timelineEventTemplateTokenUpdateRequest.objectPropertyName())
            .contains("objectPropertyName")
        assertThat(timelineEventTemplateTokenUpdateRequest.options().getOrNull())
            .containsExactly(
                TimelineEventTemplateTokenOption.builder().label("Dog").value("dog").build(),
                TimelineEventTemplateTokenOption.builder().label("Cat").value("cat").build(),
                TimelineEventTemplateTokenOption.builder().label("Bird").value("bird").build(),
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val timelineEventTemplateTokenUpdateRequest =
            TimelineEventTemplateTokenUpdateRequest.builder()
                .label("petType edit")
                .objectPropertyName("objectPropertyName")
                .options(
                    listOf(
                        TimelineEventTemplateTokenOption.builder()
                            .label("Dog")
                            .value("dog")
                            .build(),
                        TimelineEventTemplateTokenOption.builder()
                            .label("Cat")
                            .value("cat")
                            .build(),
                        TimelineEventTemplateTokenOption.builder()
                            .label("Bird")
                            .value("bird")
                            .build(),
                    )
                )
                .build()

        val roundtrippedTimelineEventTemplateTokenUpdateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(timelineEventTemplateTokenUpdateRequest),
                jacksonTypeRef<TimelineEventTemplateTokenUpdateRequest>(),
            )

        assertThat(roundtrippedTimelineEventTemplateTokenUpdateRequest)
            .isEqualTo(timelineEventTemplateTokenUpdateRequest)
    }
}
