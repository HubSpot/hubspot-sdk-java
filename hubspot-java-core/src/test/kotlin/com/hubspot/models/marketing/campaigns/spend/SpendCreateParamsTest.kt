// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.campaigns.spend

import com.hubspot.models.marketing.campaigns.PublicSpendItemInput
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SpendCreateParamsTest {

    @Test
    fun create() {
        SpendCreateParams.builder()
            .campaignGuid("campaignGuid")
            .publicSpendItemInput(
                PublicSpendItemInput.builder()
                    .amount(0.0)
                    .name("name")
                    .order(0)
                    .description("description")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SpendCreateParams.builder()
                .campaignGuid("campaignGuid")
                .publicSpendItemInput(
                    PublicSpendItemInput.builder().amount(0.0).name("name").order(0).build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("campaignGuid")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SpendCreateParams.builder()
                .campaignGuid("campaignGuid")
                .publicSpendItemInput(
                    PublicSpendItemInput.builder()
                        .amount(0.0)
                        .name("name")
                        .order(0)
                        .description("description")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PublicSpendItemInput.builder()
                    .amount(0.0)
                    .name("name")
                    .order(0)
                    .description("description")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SpendCreateParams.builder()
                .campaignGuid("campaignGuid")
                .publicSpendItemInput(
                    PublicSpendItemInput.builder().amount(0.0).name("name").order(0).build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(PublicSpendItemInput.builder().amount(0.0).name("name").order(0).build())
    }
}
