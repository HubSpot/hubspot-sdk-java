// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.campaigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.NextPage
import com.hubspot_sdk.api.models.PreviousPage
import com.hubspot_sdk.api.models.marketing.emails.EmailsPaging
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
                    EmailsPaging.builder()
                        .next(NextPage.builder().after("").link("").build())
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
                EmailsPaging.builder()
                    .next(NextPage.builder().after("").link("").build())
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
                    EmailsPaging.builder()
                        .next(NextPage.builder().after("").link("").build())
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
