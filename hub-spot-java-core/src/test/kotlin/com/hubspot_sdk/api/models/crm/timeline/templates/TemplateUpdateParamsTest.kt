// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.timeline.templates

import com.hubspot_sdk.api.models.crm.timeline.TimelineEventTemplateToken
import com.hubspot_sdk.api.models.crm.timeline.TimelineEventTemplateTokenOption
import com.hubspot_sdk.api.models.crm.timeline.TimelineEventTemplateUpdateRequest
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplateUpdateParamsTest {

    @Test
    fun create() {
        TemplateUpdateParams.builder()
            .appId(0)
            .eventTemplateId("eventTemplateId")
            .timelineEventTemplateUpdateRequest(
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
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TemplateUpdateParams.builder()
                .appId(0)
                .eventTemplateId("eventTemplateId")
                .timelineEventTemplateUpdateRequest(
                    TimelineEventTemplateUpdateRequest.builder()
                        .id("1001298")
                        .name("PetSpot Registration")
                        .tokens(
                            listOf(
                                TimelineEventTemplateToken.builder()
                                    .label("Pet Name")
                                    .name("petName")
                                    .type(TimelineEventTemplateToken.Type.STRING)
                                    .build(),
                                TimelineEventTemplateToken.builder()
                                    .label("Pet Age")
                                    .name("petAge")
                                    .type(TimelineEventTemplateToken.Type.NUMBER)
                                    .build(),
                                TimelineEventTemplateToken.builder()
                                    .label("Pet Color")
                                    .name("petColor")
                                    .type(TimelineEventTemplateToken.Type.ENUMERATION)
                                    .build(),
                            )
                        )
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("eventTemplateId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TemplateUpdateParams.builder()
                .appId(0)
                .eventTemplateId("eventTemplateId")
                .timelineEventTemplateUpdateRequest(
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TemplateUpdateParams.builder()
                .appId(0)
                .eventTemplateId("eventTemplateId")
                .timelineEventTemplateUpdateRequest(
                    TimelineEventTemplateUpdateRequest.builder()
                        .id("1001298")
                        .name("PetSpot Registration")
                        .tokens(
                            listOf(
                                TimelineEventTemplateToken.builder()
                                    .label("Pet Name")
                                    .name("petName")
                                    .type(TimelineEventTemplateToken.Type.STRING)
                                    .build(),
                                TimelineEventTemplateToken.builder()
                                    .label("Pet Age")
                                    .name("petAge")
                                    .type(TimelineEventTemplateToken.Type.NUMBER)
                                    .build(),
                                TimelineEventTemplateToken.builder()
                                    .label("Pet Color")
                                    .name("petColor")
                                    .type(TimelineEventTemplateToken.Type.ENUMERATION)
                                    .build(),
                            )
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                TimelineEventTemplateUpdateRequest.builder()
                    .id("1001298")
                    .name("PetSpot Registration")
                    .tokens(
                        listOf(
                            TimelineEventTemplateToken.builder()
                                .label("Pet Name")
                                .name("petName")
                                .type(TimelineEventTemplateToken.Type.STRING)
                                .build(),
                            TimelineEventTemplateToken.builder()
                                .label("Pet Age")
                                .name("petAge")
                                .type(TimelineEventTemplateToken.Type.NUMBER)
                                .build(),
                            TimelineEventTemplateToken.builder()
                                .label("Pet Color")
                                .name("petColor")
                                .type(TimelineEventTemplateToken.Type.ENUMERATION)
                                .build(),
                        )
                    )
                    .build()
            )
    }
}
