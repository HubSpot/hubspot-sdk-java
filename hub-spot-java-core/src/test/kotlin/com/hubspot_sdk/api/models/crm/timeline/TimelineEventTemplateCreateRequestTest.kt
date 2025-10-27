// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.timeline

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TimelineEventTemplateCreateRequestTest {

    @Test
    fun create() {
        val timelineEventTemplateCreateRequest =
            TimelineEventTemplateCreateRequest.builder()
                .name("PetSpot Registration")
                .objectType("contacts")
                .tokens(
                    listOf(
                        TimelineEventTemplateToken.builder()
                            .label("Pet Name")
                            .name("petName")
                            .type(TimelineEventTemplateToken.Type.STRING)
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
                    "Registration occurred at {{#formatDate timestamp}}{{/formatDate}}\n\n#### Questions\n{{#each extraData.questions}}\n  **{{question}}**: {{answer}}\n{{/each}}"
                )
                .headerTemplate(
                    "Registered for [{{petName}}](https://my.petspot.com/pets/{{petName}})"
                )
                .build()

        assertThat(timelineEventTemplateCreateRequest.name()).isEqualTo("PetSpot Registration")
        assertThat(timelineEventTemplateCreateRequest.objectType()).isEqualTo("contacts")
        assertThat(timelineEventTemplateCreateRequest.tokens())
            .containsExactly(
                TimelineEventTemplateToken.builder()
                    .label("Pet Name")
                    .name("petName")
                    .type(TimelineEventTemplateToken.Type.STRING)
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
                                .label("Other")
                                .value("other")
                                .build(),
                        )
                    )
                    .updatedAt(OffsetDateTime.parse("2020-02-12T20:58:26Z"))
                    .build(),
            )
        assertThat(timelineEventTemplateCreateRequest.detailTemplate())
            .contains(
                "Registration occurred at {{#formatDate timestamp}}{{/formatDate}}\n\n#### Questions\n{{#each extraData.questions}}\n  **{{question}}**: {{answer}}\n{{/each}}"
            )
        assertThat(timelineEventTemplateCreateRequest.headerTemplate())
            .contains("Registered for [{{petName}}](https://my.petspot.com/pets/{{petName}})")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val timelineEventTemplateCreateRequest =
            TimelineEventTemplateCreateRequest.builder()
                .name("PetSpot Registration")
                .objectType("contacts")
                .tokens(
                    listOf(
                        TimelineEventTemplateToken.builder()
                            .label("Pet Name")
                            .name("petName")
                            .type(TimelineEventTemplateToken.Type.STRING)
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
                    "Registration occurred at {{#formatDate timestamp}}{{/formatDate}}\n\n#### Questions\n{{#each extraData.questions}}\n  **{{question}}**: {{answer}}\n{{/each}}"
                )
                .headerTemplate(
                    "Registered for [{{petName}}](https://my.petspot.com/pets/{{petName}})"
                )
                .build()

        val roundtrippedTimelineEventTemplateCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(timelineEventTemplateCreateRequest),
                jacksonTypeRef<TimelineEventTemplateCreateRequest>(),
            )

        assertThat(roundtrippedTimelineEventTemplateCreateRequest)
            .isEqualTo(timelineEventTemplateCreateRequest)
    }
}
