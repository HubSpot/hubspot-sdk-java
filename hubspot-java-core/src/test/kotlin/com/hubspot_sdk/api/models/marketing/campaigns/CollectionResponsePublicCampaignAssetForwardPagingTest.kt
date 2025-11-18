// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.campaigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.NextPage
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponsePublicCampaignAssetForwardPagingTest {

    @Test
    fun create() {
        val collectionResponsePublicCampaignAssetForwardPaging =
            CollectionResponsePublicCampaignAssetForwardPaging.builder()
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
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponsePublicCampaignAssetForwardPaging.results())
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
        assertThat(collectionResponsePublicCampaignAssetForwardPaging.paging())
            .contains(
                ForwardPaging.builder()
                    .next(NextPage.builder().after("after").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponsePublicCampaignAssetForwardPaging =
            CollectionResponsePublicCampaignAssetForwardPaging.builder()
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
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponsePublicCampaignAssetForwardPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponsePublicCampaignAssetForwardPaging),
                jacksonTypeRef<CollectionResponsePublicCampaignAssetForwardPaging>(),
            )

        assertThat(roundtrippedCollectionResponsePublicCampaignAssetForwardPaging)
            .isEqualTo(collectionResponsePublicCampaignAssetForwardPaging)
    }
}
