// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.campaigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicCampaignBatchUpdateItemTest {

    @Test
    fun create() {
        val publicCampaignBatchUpdateItem =
            PublicCampaignBatchUpdateItem.builder()
                .id("id")
                .properties(
                    PublicCampaignBatchUpdateItem.Properties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(publicCampaignBatchUpdateItem.id()).isEqualTo("id")
        assertThat(publicCampaignBatchUpdateItem.properties())
            .isEqualTo(
                PublicCampaignBatchUpdateItem.Properties.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicCampaignBatchUpdateItem =
            PublicCampaignBatchUpdateItem.builder()
                .id("id")
                .properties(
                    PublicCampaignBatchUpdateItem.Properties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedPublicCampaignBatchUpdateItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicCampaignBatchUpdateItem),
                jacksonTypeRef<PublicCampaignBatchUpdateItem>(),
            )

        assertThat(roundtrippedPublicCampaignBatchUpdateItem)
            .isEqualTo(publicCampaignBatchUpdateItem)
    }
}
