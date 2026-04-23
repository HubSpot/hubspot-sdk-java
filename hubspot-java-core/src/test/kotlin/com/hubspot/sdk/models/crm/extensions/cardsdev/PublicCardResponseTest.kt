// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.extensions.cardsdev

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicCardResponseTest {

    @Test
    fun create() {
        val publicCardResponse =
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
                        .objectTypeId(0L)
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

        assertThat(publicCardResponse.id()).isEqualTo("id")
        assertThat(publicCardResponse.actions())
            .isEqualTo(CardActions.builder().addBaseUrl("string").build())
        assertThat(publicCardResponse.auditHistory())
            .containsExactly(
                CardAuditResponse.builder()
                    .actionType(CardAuditResponse.ActionType.CREATE)
                    .applicationId(0)
                    .authSource(CardAuditResponse.AuthSource.APP)
                    .changedAt(0L)
                    .initiatingUserId(0)
                    .objectTypeId(0L)
                    .build()
            )
        assertThat(publicCardResponse.display())
            .isEqualTo(
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
        assertThat(publicCardResponse.fetch())
            .isEqualTo(
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
        assertThat(publicCardResponse.title()).isEqualTo("title")
        assertThat(publicCardResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicCardResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicCardResponse =
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
                        .objectTypeId(0L)
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

        val roundtrippedPublicCardResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicCardResponse),
                jacksonTypeRef<PublicCardResponse>(),
            )

        assertThat(roundtrippedPublicCardResponse).isEqualTo(publicCardResponse)
    }
}
