// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.campaigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicCampaignAssetTest {

    @Test
    fun create() {
        val publicCampaignAsset =
            PublicCampaignAsset.builder()
                .id("id")
                .metrics(
                    PublicCampaignAsset.Metrics.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .name("name")
                .build()

        assertThat(publicCampaignAsset.id()).isEqualTo("id")
        assertThat(publicCampaignAsset.metrics())
            .contains(
                PublicCampaignAsset.Metrics.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(publicCampaignAsset.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicCampaignAsset =
            PublicCampaignAsset.builder()
                .id("id")
                .metrics(
                    PublicCampaignAsset.Metrics.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .name("name")
                .build()

        val roundtrippedPublicCampaignAsset =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicCampaignAsset),
                jacksonTypeRef<PublicCampaignAsset>(),
            )

        assertThat(roundtrippedPublicCampaignAsset).isEqualTo(publicCampaignAsset)
    }
}
