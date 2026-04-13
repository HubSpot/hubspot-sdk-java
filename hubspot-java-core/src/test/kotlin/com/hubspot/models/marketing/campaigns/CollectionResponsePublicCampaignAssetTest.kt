// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.campaigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.JsonValue
import com.hubspot.core.jsonMapper
import com.hubspot.models.NextPage
import com.hubspot.models.Paging
import com.hubspot.models.PreviousPage
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponsePublicCampaignAssetTest {

    @Test
    fun create() {
        val collectionResponsePublicCampaignAsset =
            CollectionResponsePublicCampaignAsset.builder()
                .addResult(
                    PublicCampaignAsset.builder()
                        .id("id")
                        .metrics(
                            PublicCampaignAsset.Metrics.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .name("name")
                        .build()
                )
                .paging(
                    Paging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponsePublicCampaignAsset.results())
            .containsExactly(
                PublicCampaignAsset.builder()
                    .id("id")
                    .metrics(
                        PublicCampaignAsset.Metrics.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .name("name")
                    .build()
            )
        assertThat(collectionResponsePublicCampaignAsset.paging())
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
        val collectionResponsePublicCampaignAsset =
            CollectionResponsePublicCampaignAsset.builder()
                .addResult(
                    PublicCampaignAsset.builder()
                        .id("id")
                        .metrics(
                            PublicCampaignAsset.Metrics.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .name("name")
                        .build()
                )
                .paging(
                    Paging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponsePublicCampaignAsset =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponsePublicCampaignAsset),
                jacksonTypeRef<CollectionResponsePublicCampaignAsset>(),
            )

        assertThat(roundtrippedCollectionResponsePublicCampaignAsset)
            .isEqualTo(collectionResponsePublicCampaignAsset)
    }
}
