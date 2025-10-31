// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.campaigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.NextPage
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseWithTotalPublicCampaignForwardPagingTest {

    @Test
    fun create() {
        val collectionResponseWithTotalPublicCampaignForwardPaging =
            CollectionResponseWithTotalPublicCampaignForwardPaging.builder()
                .addResult(
                    PublicCampaign.builder()
                        .id("id")
                        .addBusinessUnit(PublicBusinessUnit.builder().id(0).build())
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .properties(
                            PublicCampaign.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .total(0)
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .build()
                )
                .build()

        assertThat(collectionResponseWithTotalPublicCampaignForwardPaging.results())
            .containsExactly(
                PublicCampaign.builder()
                    .id("id")
                    .addBusinessUnit(PublicBusinessUnit.builder().id(0).build())
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .properties(
                        PublicCampaign.Properties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(collectionResponseWithTotalPublicCampaignForwardPaging.total()).isEqualTo(0)
        assertThat(collectionResponseWithTotalPublicCampaignForwardPaging.paging())
            .contains(
                ForwardPaging.builder().next(NextPage.builder().after("").link("").build()).build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseWithTotalPublicCampaignForwardPaging =
            CollectionResponseWithTotalPublicCampaignForwardPaging.builder()
                .addResult(
                    PublicCampaign.builder()
                        .id("id")
                        .addBusinessUnit(PublicBusinessUnit.builder().id(0).build())
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .properties(
                            PublicCampaign.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .total(0)
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseWithTotalPublicCampaignForwardPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    collectionResponseWithTotalPublicCampaignForwardPaging
                ),
                jacksonTypeRef<CollectionResponseWithTotalPublicCampaignForwardPaging>(),
            )

        assertThat(roundtrippedCollectionResponseWithTotalPublicCampaignForwardPaging)
            .isEqualTo(collectionResponseWithTotalPublicCampaignForwardPaging)
    }
}
