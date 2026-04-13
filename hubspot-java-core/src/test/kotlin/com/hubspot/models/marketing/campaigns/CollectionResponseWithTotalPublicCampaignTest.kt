// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.campaigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.JsonValue
import com.hubspot.core.jsonMapper
import com.hubspot.models.NextPage
import com.hubspot.models.Paging
import com.hubspot.models.PreviousPage
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseWithTotalPublicCampaignTest {

    @Test
    fun create() {
        val collectionResponseWithTotalPublicCampaign =
            CollectionResponseWithTotalPublicCampaign.builder()
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
                    Paging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponseWithTotalPublicCampaign.results())
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
        assertThat(collectionResponseWithTotalPublicCampaign.total()).isEqualTo(0)
        assertThat(collectionResponseWithTotalPublicCampaign.paging())
            .contains(
                Paging.builder()
                    .next(NextPage.builder().after("after").link("link").build())
                    .prev(PreviousPage.builder().before("before").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseWithTotalPublicCampaign =
            CollectionResponseWithTotalPublicCampaign.builder()
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
                    Paging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseWithTotalPublicCampaign =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponseWithTotalPublicCampaign),
                jacksonTypeRef<CollectionResponseWithTotalPublicCampaign>(),
            )

        assertThat(roundtrippedCollectionResponseWithTotalPublicCampaign)
            .isEqualTo(collectionResponseWithTotalPublicCampaign)
    }
}
