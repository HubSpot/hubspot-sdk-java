// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.campaigns

import com.hubspot_sdk.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignCreateParamsTest {

    @Test
    fun create() {
        CampaignCreateParams.builder()
            .publicCampaignInput(
                PublicCampaignInput.builder()
                    .properties(
                        PublicCampaignInput.Properties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            CampaignCreateParams.builder()
                .publicCampaignInput(
                    PublicCampaignInput.builder()
                        .properties(
                            PublicCampaignInput.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PublicCampaignInput.builder()
                    .properties(
                        PublicCampaignInput.Properties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
    }
}
