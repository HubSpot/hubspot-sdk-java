// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.campaigns.batch

import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.models.marketing.campaigns.BatchInputPublicCampaignReadInput
import com.hubspot_sdk.api.models.marketing.campaigns.PublicCampaignReadInput
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchGetParamsTest {

    @Test
    fun create() {
        BatchGetParams.builder()
            .endDate("endDate")
            .addProperty("string")
            .startDate("startDate")
            .batchInputPublicCampaignReadInput(
                BatchInputPublicCampaignReadInput.builder()
                    .addInput(PublicCampaignReadInput.builder().id("id").build())
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            BatchGetParams.builder()
                .endDate("endDate")
                .addProperty("string")
                .startDate("startDate")
                .batchInputPublicCampaignReadInput(
                    BatchInputPublicCampaignReadInput.builder()
                        .addInput(PublicCampaignReadInput.builder().id("id").build())
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("endDate", "endDate")
                    .put("properties", listOf("string").joinToString(","))
                    .put("startDate", "startDate")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            BatchGetParams.builder()
                .batchInputPublicCampaignReadInput(
                    BatchInputPublicCampaignReadInput.builder()
                        .addInput(PublicCampaignReadInput.builder().id("id").build())
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            BatchGetParams.builder()
                .endDate("endDate")
                .addProperty("string")
                .startDate("startDate")
                .batchInputPublicCampaignReadInput(
                    BatchInputPublicCampaignReadInput.builder()
                        .addInput(PublicCampaignReadInput.builder().id("id").build())
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputPublicCampaignReadInput.builder()
                    .addInput(PublicCampaignReadInput.builder().id("id").build())
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BatchGetParams.builder()
                .batchInputPublicCampaignReadInput(
                    BatchInputPublicCampaignReadInput.builder()
                        .addInput(PublicCampaignReadInput.builder().id("id").build())
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputPublicCampaignReadInput.builder()
                    .addInput(PublicCampaignReadInput.builder().id("id").build())
                    .build()
            )
    }
}
