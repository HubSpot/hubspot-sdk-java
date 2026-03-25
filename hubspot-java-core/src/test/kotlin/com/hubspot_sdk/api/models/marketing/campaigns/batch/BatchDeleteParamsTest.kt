// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.campaigns.batch

import com.hubspot_sdk.api.models.marketing.campaigns.BatchInputPublicCampaignDeleteInput
import com.hubspot_sdk.api.models.marketing.campaigns.PublicCampaignDeleteInput
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchDeleteParamsTest {

    @Test
    fun create() {
        BatchDeleteParams.builder()
            .batchInputPublicCampaignDeleteInput(
                BatchInputPublicCampaignDeleteInput.builder()
                    .addInput(PublicCampaignDeleteInput.builder().id("id").build())
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            BatchDeleteParams.builder()
                .batchInputPublicCampaignDeleteInput(
                    BatchInputPublicCampaignDeleteInput.builder()
                        .addInput(PublicCampaignDeleteInput.builder().id("id").build())
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputPublicCampaignDeleteInput.builder()
                    .addInput(PublicCampaignDeleteInput.builder().id("id").build())
                    .build()
            )
    }
}
