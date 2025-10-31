// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.timeline.templates

import com.hubspot_sdk.api.models.crm.timeline.TimelineEventTemplateCreateRequest
import com.hubspot_sdk.api.models.crm.timeline.TimelineEventTemplateToken
import com.hubspot_sdk.api.models.crm.timeline.TimelineEventTemplateTokenOption
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplateCreateParamsTest {

    @Test
    fun create() {
        TemplateCreateParams.builder()
            .appId(0)
            .timelineEventTemplateCreateRequest(
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
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TemplateCreateParams.builder()
                .appId(0)
                .timelineEventTemplateCreateRequest(
                    TimelineEventTemplateCreateRequest.builder()
                        .name("PetSpot Registration")
                        .objectType("contacts")
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
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TemplateCreateParams.builder()
                .appId(0)
                .timelineEventTemplateCreateRequest(
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TemplateCreateParams.builder()
                .appId(0)
                .timelineEventTemplateCreateRequest(
                    TimelineEventTemplateCreateRequest.builder()
                        .name("PetSpot Registration")
                        .objectType("contacts")
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
                TimelineEventTemplateCreateRequest.builder()
                    .name("PetSpot Registration")
                    .objectType("contacts")
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
