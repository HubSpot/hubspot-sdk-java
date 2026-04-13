// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.campaigns.spend

import com.hubspot.models.marketing.campaigns.PublicSpendItemInput
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SpendUpdateParamsTest {

    @Test
    fun create() {
        SpendUpdateParams.builder()
            .campaignGuid("campaignGuid")
            .spendId(0L)
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
            SpendUpdateParams.builder()
                .campaignGuid("campaignGuid")
                .spendId(0L)
                .publicSpendItemInput(
                    PublicSpendItemInput.builder().amount(0.0).name("name").order(0).build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("campaignGuid")
        assertThat(params._pathParam(1)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SpendUpdateParams.builder()
                .campaignGuid("campaignGuid")
                .spendId(0L)
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
            SpendUpdateParams.builder()
                .campaignGuid("campaignGuid")
                .spendId(0L)
                .publicSpendItemInput(
                    PublicSpendItemInput.builder().amount(0.0).name("name").order(0).build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(PublicSpendItemInput.builder().amount(0.0).name("name").order(0).build())
    }
}
