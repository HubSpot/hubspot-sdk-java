// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.settings.taxrates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.NextPage
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TaxRateListResponseTest {

    @Test
    fun create() {
        val taxRateListResponse =
            TaxRateListResponse.builder()
                .addResult(
                    TaxRateListResponse.Result.builder()
                        .id("id")
                        .active(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .label("label")
                        .name("name")
                        .percentageRate(0.0)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .build()
                )
                .build()

        assertThat(taxRateListResponse.results())
            .containsExactly(
                TaxRateListResponse.Result.builder()
                    .id("id")
                    .active(true)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .label("label")
                    .name("name")
                    .percentageRate(0.0)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(taxRateListResponse.paging())
            .contains(
                ForwardPaging.builder().next(NextPage.builder().after("").link("").build()).build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val taxRateListResponse =
            TaxRateListResponse.builder()
                .addResult(
                    TaxRateListResponse.Result.builder()
                        .id("id")
                        .active(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .label("label")
                        .name("name")
                        .percentageRate(0.0)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .build()
                )
                .build()

        val roundtrippedTaxRateListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(taxRateListResponse),
                jacksonTypeRef<TaxRateListResponse>(),
            )

        assertThat(roundtrippedTaxRateListResponse).isEqualTo(taxRateListResponse)
    }
}
