// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.timeline

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseTimelineEventTemplateNoPagingTest {

    @Test
    fun create() {
        val collectionResponseTimelineEventTemplateNoPaging =
            CollectionResponseTimelineEventTemplateNoPaging.builder()
                .addResult(
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
                )
                .build()

        assertThat(collectionResponseTimelineEventTemplateNoPaging.results())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseTimelineEventTemplateNoPaging =
            CollectionResponseTimelineEventTemplateNoPaging.builder()
                .addResult(
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
                )
                .build()

        val roundtrippedCollectionResponseTimelineEventTemplateNoPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponseTimelineEventTemplateNoPaging),
                jacksonTypeRef<CollectionResponseTimelineEventTemplateNoPaging>(),
            )

        assertThat(roundtrippedCollectionResponseTimelineEventTemplateNoPaging)
            .isEqualTo(collectionResponseTimelineEventTemplateNoPaging)
    }
}
