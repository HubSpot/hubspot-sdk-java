// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.timeline

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TimelineEventTemplateTest {

    @Test
    fun create() {
        val timelineEventTemplate =
            TimelineEventTemplate.builder()
                .id("id")
                .name("name")
                .objectType("objectType")
                .addToken(
                    TimelineEventTemplateToken.builder()
                        .label("Pet Type")
                        .name("petType")
                        .type(TimelineEventTemplateToken.Type.ENUMERATION)
                        .createdAt(OffsetDateTime.parse("2020-02-12T20:58:26Z"))
                        .objectPropertyName("customPropertyPetType")
                        .addOption(
                            TimelineEventTemplateTokenOption.builder()
                                .label("Dog")
                                .value("dog")
                                .build()
                        )
                        .addOption(
                            TimelineEventTemplateTokenOption.builder()
                                .label("Cat")
                                .value("cat")
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2020-02-12T20:58:26Z"))
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .detailTemplate("detailTemplate")
                .headerTemplate("headerTemplate")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(timelineEventTemplate.id()).isEqualTo("id")
        assertThat(timelineEventTemplate.name()).isEqualTo("name")
        assertThat(timelineEventTemplate.objectType()).isEqualTo("objectType")
        assertThat(timelineEventTemplate.tokens())
            .containsExactly(
                TimelineEventTemplateToken.builder()
                    .label("Pet Type")
                    .name("petType")
                    .type(TimelineEventTemplateToken.Type.ENUMERATION)
                    .createdAt(OffsetDateTime.parse("2020-02-12T20:58:26Z"))
                    .objectPropertyName("customPropertyPetType")
                    .addOption(
                        TimelineEventTemplateTokenOption.builder().label("Dog").value("dog").build()
                    )
                    .addOption(
                        TimelineEventTemplateTokenOption.builder().label("Cat").value("cat").build()
                    )
                    .updatedAt(OffsetDateTime.parse("2020-02-12T20:58:26Z"))
                    .build()
            )
        assertThat(timelineEventTemplate.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(timelineEventTemplate.detailTemplate()).contains("detailTemplate")
        assertThat(timelineEventTemplate.headerTemplate()).contains("headerTemplate")
        assertThat(timelineEventTemplate.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val timelineEventTemplate =
            TimelineEventTemplate.builder()
                .id("id")
                .name("name")
                .objectType("objectType")
                .addToken(
                    TimelineEventTemplateToken.builder()
                        .label("Pet Type")
                        .name("petType")
                        .type(TimelineEventTemplateToken.Type.ENUMERATION)
                        .createdAt(OffsetDateTime.parse("2020-02-12T20:58:26Z"))
                        .objectPropertyName("customPropertyPetType")
                        .addOption(
                            TimelineEventTemplateTokenOption.builder()
                                .label("Dog")
                                .value("dog")
                                .build()
                        )
                        .addOption(
                            TimelineEventTemplateTokenOption.builder()
                                .label("Cat")
                                .value("cat")
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2020-02-12T20:58:26Z"))
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .detailTemplate("detailTemplate")
                .headerTemplate("headerTemplate")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedTimelineEventTemplate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(timelineEventTemplate),
                jacksonTypeRef<TimelineEventTemplate>(),
            )

        assertThat(roundtrippedTimelineEventTemplate).isEqualTo(timelineEventTemplate)
    }
}
