// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.timeline

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TimelineEventTemplateUpdateRequestTest {

    @Test
    fun create() {
        val timelineEventTemplateUpdateRequest =
            TimelineEventTemplateUpdateRequest.builder()
                .id("1001298")
                .name("PetSpot Registration")
                .tokens(
                    listOf(
                        TimelineEventTemplateToken.builder()
                            .label("Pet Name")
                            .name("petName")
                            .type(TimelineEventTemplateToken.Type.STRING)
                            .createdAt(OffsetDateTime.parse("2020-02-12T20:58:26Z"))
                            .objectPropertyName("firstname")
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
                            .build(),
                        TimelineEventTemplateToken.builder()
                            .label("Pet Age")
                            .name("petAge")
                            .type(TimelineEventTemplateToken.Type.NUMBER)
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
                            .build(),
                        TimelineEventTemplateToken.builder()
                            .label("Pet Color")
                            .name("petColor")
                            .type(TimelineEventTemplateToken.Type.ENUMERATION)
                            .createdAt(OffsetDateTime.parse("2020-02-12T20:58:26Z"))
                            .objectPropertyName("customPropertyPetType")
                            .options(
                                listOf(
                                    TimelineEventTemplateTokenOption.builder()
                                        .label("White")
                                        .value("white")
                                        .build(),
                                    TimelineEventTemplateTokenOption.builder()
                                        .label("Black")
                                        .value("black")
                                        .build(),
                                    TimelineEventTemplateTokenOption.builder()
                                        .label("Brown")
                                        .value("brown")
                                        .build(),
                                    TimelineEventTemplateTokenOption.builder()
                                        .label("Yellow")
                                        .value("yellow")
                                        .build(),
                                    TimelineEventTemplateTokenOption.builder()
                                        .label("Other")
                                        .value("other")
                                        .build(),
                                )
                            )
                            .updatedAt(OffsetDateTime.parse("2020-02-12T20:58:26Z"))
                            .build(),
                    )
                )
                .detailTemplate(
                    "Registration occurred at {{#formatDate timestamp}}{{/formatDate}}\n\n#### Questions\n{{#each extraData.questions}}\n  **{{question}}**: {{answer}}\n{{/each}}\n\nEDIT"
                )
                .headerTemplate(
                    "Registered for [{{petName}}](https://my.petspot.com/pets/{{petName}})"
                )
                .build()

        assertThat(timelineEventTemplateUpdateRequest.id()).isEqualTo("1001298")
        assertThat(timelineEventTemplateUpdateRequest.name()).isEqualTo("PetSpot Registration")
        assertThat(timelineEventTemplateUpdateRequest.tokens())
            .containsExactly(
                TimelineEventTemplateToken.builder()
                    .label("Pet Name")
                    .name("petName")
                    .type(TimelineEventTemplateToken.Type.STRING)
                    .createdAt(OffsetDateTime.parse("2020-02-12T20:58:26Z"))
                    .objectPropertyName("firstname")
                    .addOption(
                        TimelineEventTemplateTokenOption.builder().label("Dog").value("dog").build()
                    )
                    .addOption(
                        TimelineEventTemplateTokenOption.builder().label("Cat").value("cat").build()
                    )
                    .updatedAt(OffsetDateTime.parse("2020-02-12T20:58:26Z"))
                    .build(),
                TimelineEventTemplateToken.builder()
                    .label("Pet Age")
                    .name("petAge")
                    .type(TimelineEventTemplateToken.Type.NUMBER)
                    .createdAt(OffsetDateTime.parse("2020-02-12T20:58:26Z"))
                    .objectPropertyName("customPropertyPetType")
                    .addOption(
                        TimelineEventTemplateTokenOption.builder().label("Dog").value("dog").build()
                    )
                    .addOption(
                        TimelineEventTemplateTokenOption.builder().label("Cat").value("cat").build()
                    )
                    .updatedAt(OffsetDateTime.parse("2020-02-12T20:58:26Z"))
                    .build(),
                TimelineEventTemplateToken.builder()
                    .label("Pet Color")
                    .name("petColor")
                    .type(TimelineEventTemplateToken.Type.ENUMERATION)
                    .createdAt(OffsetDateTime.parse("2020-02-12T20:58:26Z"))
                    .objectPropertyName("customPropertyPetType")
                    .options(
                        listOf(
                            TimelineEventTemplateTokenOption.builder()
                                .label("White")
                                .value("white")
                                .build(),
                            TimelineEventTemplateTokenOption.builder()
                                .label("Black")
                                .value("black")
                                .build(),
                            TimelineEventTemplateTokenOption.builder()
                                .label("Brown")
                                .value("brown")
                                .build(),
                            TimelineEventTemplateTokenOption.builder()
                                .label("Yellow")
                                .value("yellow")
                                .build(),
                            TimelineEventTemplateTokenOption.builder()
                                .label("Other")
                                .value("other")
                                .build(),
                        )
                    )
                    .updatedAt(OffsetDateTime.parse("2020-02-12T20:58:26Z"))
                    .build(),
            )
        assertThat(timelineEventTemplateUpdateRequest.detailTemplate())
            .contains(
                "Registration occurred at {{#formatDate timestamp}}{{/formatDate}}\n\n#### Questions\n{{#each extraData.questions}}\n  **{{question}}**: {{answer}}\n{{/each}}\n\nEDIT"
            )
        assertThat(timelineEventTemplateUpdateRequest.headerTemplate())
            .contains("Registered for [{{petName}}](https://my.petspot.com/pets/{{petName}})")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val timelineEventTemplateUpdateRequest =
            TimelineEventTemplateUpdateRequest.builder()
                .id("1001298")
                .name("PetSpot Registration")
                .tokens(
                    listOf(
                        TimelineEventTemplateToken.builder()
                            .label("Pet Name")
                            .name("petName")
                            .type(TimelineEventTemplateToken.Type.STRING)
                            .createdAt(OffsetDateTime.parse("2020-02-12T20:58:26Z"))
                            .objectPropertyName("firstname")
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
                            .build(),
                        TimelineEventTemplateToken.builder()
                            .label("Pet Age")
                            .name("petAge")
                            .type(TimelineEventTemplateToken.Type.NUMBER)
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
                            .build(),
                        TimelineEventTemplateToken.builder()
                            .label("Pet Color")
                            .name("petColor")
                            .type(TimelineEventTemplateToken.Type.ENUMERATION)
                            .createdAt(OffsetDateTime.parse("2020-02-12T20:58:26Z"))
                            .objectPropertyName("customPropertyPetType")
                            .options(
                                listOf(
                                    TimelineEventTemplateTokenOption.builder()
                                        .label("White")
                                        .value("white")
                                        .build(),
                                    TimelineEventTemplateTokenOption.builder()
                                        .label("Black")
                                        .value("black")
                                        .build(),
                                    TimelineEventTemplateTokenOption.builder()
                                        .label("Brown")
                                        .value("brown")
                                        .build(),
                                    TimelineEventTemplateTokenOption.builder()
                                        .label("Yellow")
                                        .value("yellow")
                                        .build(),
                                    TimelineEventTemplateTokenOption.builder()
                                        .label("Other")
                                        .value("other")
                                        .build(),
                                )
                            )
                            .updatedAt(OffsetDateTime.parse("2020-02-12T20:58:26Z"))
                            .build(),
                    )
                )
                .detailTemplate(
                    "Registration occurred at {{#formatDate timestamp}}{{/formatDate}}\n\n#### Questions\n{{#each extraData.questions}}\n  **{{question}}**: {{answer}}\n{{/each}}\n\nEDIT"
                )
                .headerTemplate(
                    "Registered for [{{petName}}](https://my.petspot.com/pets/{{petName}})"
                )
                .build()

        val roundtrippedTimelineEventTemplateUpdateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(timelineEventTemplateUpdateRequest),
                jacksonTypeRef<TimelineEventTemplateUpdateRequest>(),
            )

        assertThat(roundtrippedTimelineEventTemplateUpdateRequest)
            .isEqualTo(timelineEventTemplateUpdateRequest)
    }
}
