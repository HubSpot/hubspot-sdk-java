// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.events.definitions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FiscalYearTest {

    @Test
    fun create() {
        val fiscalYear =
            FiscalYear.builder()
                .day(0)
                .month(0)
                .referenceType(FiscalYear.ReferenceType.FISCAL_YEAR)
                .hour(0)
                .millisecond(0)
                .minute(0)
                .second(0)
                .build()

        assertThat(fiscalYear.day()).isEqualTo(0)
        assertThat(fiscalYear.month()).isEqualTo(0)
        assertThat(fiscalYear.referenceType()).isEqualTo(FiscalYear.ReferenceType.FISCAL_YEAR)
        assertThat(fiscalYear.hour()).contains(0)
        assertThat(fiscalYear.millisecond()).contains(0)
        assertThat(fiscalYear.minute()).contains(0)
        assertThat(fiscalYear.second()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fiscalYear =
            FiscalYear.builder()
                .day(0)
                .month(0)
                .referenceType(FiscalYear.ReferenceType.FISCAL_YEAR)
                .hour(0)
                .millisecond(0)
                .minute(0)
                .second(0)
                .build()

        val roundtrippedFiscalYear =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fiscalYear),
                jacksonTypeRef<FiscalYear>(),
            )

        assertThat(roundtrippedFiscalYear).isEqualTo(fiscalYear)
    }
}
