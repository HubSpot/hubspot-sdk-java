// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicFiscalYearReferenceTest {

    @Test
    fun create() {
        val publicFiscalYearReference =
            PublicFiscalYearReference.builder()
                .day(0)
                .month(0)
                .referenceType(PublicFiscalYearReference.ReferenceType.FISCAL_YEAR)
                .hour(0)
                .millisecond(0)
                .minute(0)
                .second(0)
                .build()

        assertThat(publicFiscalYearReference.day()).isEqualTo(0)
        assertThat(publicFiscalYearReference.month()).isEqualTo(0)
        assertThat(publicFiscalYearReference.referenceType())
            .isEqualTo(PublicFiscalYearReference.ReferenceType.FISCAL_YEAR)
        assertThat(publicFiscalYearReference.hour()).contains(0)
        assertThat(publicFiscalYearReference.millisecond()).contains(0)
        assertThat(publicFiscalYearReference.minute()).contains(0)
        assertThat(publicFiscalYearReference.second()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicFiscalYearReference =
            PublicFiscalYearReference.builder()
                .day(0)
                .month(0)
                .referenceType(PublicFiscalYearReference.ReferenceType.FISCAL_YEAR)
                .hour(0)
                .millisecond(0)
                .minute(0)
                .second(0)
                .build()

        val roundtrippedPublicFiscalYearReference =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicFiscalYearReference),
                jacksonTypeRef<PublicFiscalYearReference>(),
            )

        assertThat(roundtrippedPublicFiscalYearReference).isEqualTo(publicFiscalYearReference)
    }
}
