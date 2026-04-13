// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.extensions.cardsdev

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicCardListResponseTest {

    @Test
    fun create() {
        val publicCardListResponse =
            PublicCardListResponse.builder()
                .addResult(
                    PublicCardResponse.builder()
                        .id("id")
                        .actions(CardActions.builder().addBaseUrl("string").build())
                        .addAuditHistory(
                            CardAuditResponse.builder()
                                .actionType(CardAuditResponse.ActionType.CREATE)
                                .applicationId(0)
                                .authSource(CardAuditResponse.AuthSource.APP)
                                .changedAt(0L)
                                .initiatingUserId(0)
                                .objectTypeId(0)
                                .build()
                        )
                        .display(
                            CardDisplayBody.builder()
                                .addProperty(
                                    CardDisplayProperty.builder()
                                        .dataType(CardDisplayProperty.DataType.BOOLEAN)
                                        .label("label")
                                        .name("name")
                                        .addOption(
                                            DisplayOption.builder()
                                                .label("label")
                                                .name("name")
                                                .type(DisplayOption.Type.DANGER)
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .fetch(
                            PublicCardFetchBody.builder()
                                .addObjectType(
                                    CardObjectTypeBody.builder()
                                        .name(CardObjectTypeBody.Name.COMPANIES)
                                        .addPropertiesToSend("string")
                                        .build()
                                )
                                .targetUrl("targetUrl")
                                .build()
                        )
                        .title("title")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(publicCardListResponse.results())
            .containsExactly(
                PublicCardResponse.builder()
                    .id("id")
                    .actions(CardActions.builder().addBaseUrl("string").build())
                    .addAuditHistory(
                        CardAuditResponse.builder()
                            .actionType(CardAuditResponse.ActionType.CREATE)
                            .applicationId(0)
                            .authSource(CardAuditResponse.AuthSource.APP)
                            .changedAt(0L)
                            .initiatingUserId(0)
                            .objectTypeId(0)
                            .build()
                    )
                    .display(
                        CardDisplayBody.builder()
                            .addProperty(
                                CardDisplayProperty.builder()
                                    .dataType(CardDisplayProperty.DataType.BOOLEAN)
                                    .label("label")
                                    .name("name")
                                    .addOption(
                                        DisplayOption.builder()
                                            .label("label")
                                            .name("name")
                                            .type(DisplayOption.Type.DANGER)
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .fetch(
                        PublicCardFetchBody.builder()
                            .addObjectType(
                                CardObjectTypeBody.builder()
                                    .name(CardObjectTypeBody.Name.COMPANIES)
                                    .addPropertiesToSend("string")
                                    .build()
                            )
                            .targetUrl("targetUrl")
                            .build()
                    )
                    .title("title")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicCardListResponse =
            PublicCardListResponse.builder()
                .addResult(
                    PublicCardResponse.builder()
                        .id("id")
                        .actions(CardActions.builder().addBaseUrl("string").build())
                        .addAuditHistory(
                            CardAuditResponse.builder()
                                .actionType(CardAuditResponse.ActionType.CREATE)
                                .applicationId(0)
                                .authSource(CardAuditResponse.AuthSource.APP)
                                .changedAt(0L)
                                .initiatingUserId(0)
                                .objectTypeId(0)
                                .build()
                        )
                        .display(
                            CardDisplayBody.builder()
                                .addProperty(
                                    CardDisplayProperty.builder()
                                        .dataType(CardDisplayProperty.DataType.BOOLEAN)
                                        .label("label")
                                        .name("name")
                                        .addOption(
                                            DisplayOption.builder()
                                                .label("label")
                                                .name("name")
                                                .type(DisplayOption.Type.DANGER)
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .fetch(
                            PublicCardFetchBody.builder()
                                .addObjectType(
                                    CardObjectTypeBody.builder()
                                        .name(CardObjectTypeBody.Name.COMPANIES)
                                        .addPropertiesToSend("string")
                                        .build()
                                )
                                .targetUrl("targetUrl")
                                .build()
                        )
                        .title("title")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedPublicCardListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicCardListResponse),
                jacksonTypeRef<PublicCardListResponse>(),
            )

        assertThat(roundtrippedPublicCardListResponse).isEqualTo(publicCardListResponse)
    }
}
