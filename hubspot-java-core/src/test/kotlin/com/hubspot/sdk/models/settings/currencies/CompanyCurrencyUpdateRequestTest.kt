// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.settings.currencies

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompanyCurrencyUpdateRequestTest {

    @Test
    fun create() {
        val companyCurrencyUpdateRequest =
            CompanyCurrencyUpdateRequest.builder()
                .currencyCode(CompanyCurrencyUpdateRequest.CurrencyCode.AED)
                .build()

        assertThat(companyCurrencyUpdateRequest.currencyCode())
            .isEqualTo(CompanyCurrencyUpdateRequest.CurrencyCode.AED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val companyCurrencyUpdateRequest =
            CompanyCurrencyUpdateRequest.builder()
                .currencyCode(CompanyCurrencyUpdateRequest.CurrencyCode.AED)
                .build()

        val roundtrippedCompanyCurrencyUpdateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(companyCurrencyUpdateRequest),
                jacksonTypeRef<CompanyCurrencyUpdateRequest>(),
            )

        assertThat(roundtrippedCompanyCurrencyUpdateRequest).isEqualTo(companyCurrencyUpdateRequest)
    }
}
