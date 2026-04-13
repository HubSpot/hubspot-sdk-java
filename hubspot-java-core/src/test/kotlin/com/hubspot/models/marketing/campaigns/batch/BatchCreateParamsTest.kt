// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.campaigns.batch

import com.hubspot.core.JsonValue
import com.hubspot.models.marketing.campaigns.BatchInputPublicCampaignInput
import com.hubspot.models.marketing.campaigns.PublicCampaignInput
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchCreateParamsTest {

    @Test
    fun create() {
        BatchCreateParams.builder()
            .batchInputPublicCampaignInput(
                BatchInputPublicCampaignInput.builder()
                    .addInput(
                        PublicCampaignInput.builder()
                            .properties(
                                PublicCampaignInput.Properties.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            BatchCreateParams.builder()
                .batchInputPublicCampaignInput(
                    BatchInputPublicCampaignInput.builder()
                        .addInput(
                            PublicCampaignInput.builder()
                                .properties(
                                    PublicCampaignInput.Properties.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputPublicCampaignInput.builder()
                    .addInput(
                        PublicCampaignInput.builder()
                            .properties(
                                PublicCampaignInput.Properties.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
    }
}
