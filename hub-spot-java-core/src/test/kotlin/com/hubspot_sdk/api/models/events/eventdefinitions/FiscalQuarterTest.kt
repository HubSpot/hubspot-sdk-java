// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.eventdefinitions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FiscalQuarterTest {

    @Test
    fun create() {
        val fiscalQuarter =
            FiscalQuarter.builder()
                .day(0)
                .month(0)
                .referenceType(FiscalQuarter.ReferenceType.FISCAL_QUARTER)
                .hour(0)
                .millisecond(0)
                .minute(0)
                .second(0)
                .build()

        assertThat(fiscalQuarter.day()).isEqualTo(0)
        assertThat(fiscalQuarter.month()).isEqualTo(0)
        assertThat(fiscalQuarter.referenceType())
            .isEqualTo(FiscalQuarter.ReferenceType.FISCAL_QUARTER)
        assertThat(fiscalQuarter.hour()).contains(0)
        assertThat(fiscalQuarter.millisecond()).contains(0)
        assertThat(fiscalQuarter.minute()).contains(0)
        assertThat(fiscalQuarter.second()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fiscalQuarter =
            FiscalQuarter.builder()
                .day(0)
                .month(0)
                .referenceType(FiscalQuarter.ReferenceType.FISCAL_QUARTER)
                .hour(0)
                .millisecond(0)
                .minute(0)
                .second(0)
                .build()

        val roundtrippedFiscalQuarter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fiscalQuarter),
                jacksonTypeRef<FiscalQuarter>(),
            )

        assertThat(roundtrippedFiscalQuarter).isEqualTo(fiscalQuarter)
    }
}
