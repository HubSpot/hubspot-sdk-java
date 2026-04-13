// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.campaigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicCampaignInputTest {

    @Test
    fun create() {
        val publicCampaignInput =
            PublicCampaignInput.builder()
                .properties(
                    PublicCampaignInput.Properties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(publicCampaignInput.properties())
            .isEqualTo(
                PublicCampaignInput.Properties.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicCampaignInput =
            PublicCampaignInput.builder()
                .properties(
                    PublicCampaignInput.Properties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedPublicCampaignInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicCampaignInput),
                jacksonTypeRef<PublicCampaignInput>(),
            )

        assertThat(roundtrippedPublicCampaignInput).isEqualTo(publicCampaignInput)
    }
}
