// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.settings.taxrates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TaxRateGetResponseTest {

    @Test
    fun create() {
        val taxRateGetResponse =
            TaxRateGetResponse.builder()
                .id("id")
                .active(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .label("label")
                .name("name")
                .percentageRate(0.0)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(taxRateGetResponse.id()).isEqualTo("id")
        assertThat(taxRateGetResponse.active()).isEqualTo(true)
        assertThat(taxRateGetResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(taxRateGetResponse.label()).isEqualTo("label")
        assertThat(taxRateGetResponse.name()).isEqualTo("name")
        assertThat(taxRateGetResponse.percentageRate()).isEqualTo(0.0)
        assertThat(taxRateGetResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val taxRateGetResponse =
            TaxRateGetResponse.builder()
                .id("id")
                .active(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .label("label")
                .name("name")
                .percentageRate(0.0)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedTaxRateGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(taxRateGetResponse),
                jacksonTypeRef<TaxRateGetResponse>(),
            )

        assertThat(roundtrippedTaxRateGetResponse).isEqualTo(taxRateGetResponse)
    }
}
