// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.timeline

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TimelineEventTemplateTokenTest {

    @Test
    fun create() {
        val timelineEventTemplateToken =
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

        assertThat(timelineEventTemplateToken.label()).isEqualTo("Pet Type")
        assertThat(timelineEventTemplateToken.name()).isEqualTo("petType")
        assertThat(timelineEventTemplateToken.type())
            .isEqualTo(TimelineEventTemplateToken.Type.ENUMERATION)
        assertThat(timelineEventTemplateToken.createdAt())
            .contains(OffsetDateTime.parse("2020-02-12T20:58:26Z"))
        assertThat(timelineEventTemplateToken.objectPropertyName())
            .contains("customPropertyPetType")
        assertThat(timelineEventTemplateToken.options().getOrNull())
            .containsExactly(
                TimelineEventTemplateTokenOption.builder().label("Dog").value("dog").build(),
                TimelineEventTemplateTokenOption.builder().label("Cat").value("cat").build(),
            )
        assertThat(timelineEventTemplateToken.updatedAt())
            .contains(OffsetDateTime.parse("2020-02-12T20:58:26Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val timelineEventTemplateToken =
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

        val roundtrippedTimelineEventTemplateToken =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(timelineEventTemplateToken),
                jacksonTypeRef<TimelineEventTemplateToken>(),
            )

        assertThat(roundtrippedTimelineEventTemplateToken).isEqualTo(timelineEventTemplateToken)
    }
}
