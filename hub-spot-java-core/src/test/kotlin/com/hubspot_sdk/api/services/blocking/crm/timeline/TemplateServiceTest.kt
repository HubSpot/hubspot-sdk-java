// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.timeline

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClient
import com.hubspot_sdk.api.models.crm.timeline.TimelineEventTemplateCreateRequest
import com.hubspot_sdk.api.models.crm.timeline.TimelineEventTemplateToken
import com.hubspot_sdk.api.models.crm.timeline.TimelineEventTemplateTokenOption
import com.hubspot_sdk.api.models.crm.timeline.TimelineEventTemplateUpdateRequest
import com.hubspot_sdk.api.models.crm.timeline.templates.TemplateCreateParams
import com.hubspot_sdk.api.models.crm.timeline.templates.TemplateDeleteParams
import com.hubspot_sdk.api.models.crm.timeline.templates.TemplateGetParams
import com.hubspot_sdk.api.models.crm.timeline.templates.TemplateUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TemplateServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val templateService = client.crm().timeline().templates()

        val timelineEventTemplate =
            templateService.create(
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
            )

        timelineEventTemplate.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val templateService = client.crm().timeline().templates()

        val timelineEventTemplate =
            templateService.update(
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
            )

        timelineEventTemplate.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val templateService = client.crm().timeline().templates()

        val collectionResponseTimelineEventTemplateNoPaging = templateService.list(0)

        collectionResponseTimelineEventTemplateNoPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val templateService = client.crm().timeline().templates()

        templateService.delete(
            TemplateDeleteParams.builder().appId(0).eventTemplateId("eventTemplateId").build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val templateService = client.crm().timeline().templates()

        val timelineEventTemplate =
            templateService.get(
                TemplateGetParams.builder().appId(0).eventTemplateId("eventTemplateId").build()
            )

        timelineEventTemplate.validate()
    }
}
