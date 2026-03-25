// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicFiscalQuarterReferenceTest {

    @Test
    fun create() {
        val publicFiscalQuarterReference =
            PublicFiscalQuarterReference.builder()
                .day(0)
                .month(0)
                .referenceType(PublicFiscalQuarterReference.ReferenceType.FISCAL_QUARTER)
                .hour(0)
                .millisecond(0)
                .minute(0)
                .second(0)
                .build()

        assertThat(publicFiscalQuarterReference.day()).isEqualTo(0)
        assertThat(publicFiscalQuarterReference.month()).isEqualTo(0)
        assertThat(publicFiscalQuarterReference.referenceType())
            .isEqualTo(PublicFiscalQuarterReference.ReferenceType.FISCAL_QUARTER)
        assertThat(publicFiscalQuarterReference.hour()).contains(0)
        assertThat(publicFiscalQuarterReference.millisecond()).contains(0)
        assertThat(publicFiscalQuarterReference.minute()).contains(0)
        assertThat(publicFiscalQuarterReference.second()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicFiscalQuarterReference =
            PublicFiscalQuarterReference.builder()
                .day(0)
                .month(0)
                .referenceType(PublicFiscalQuarterReference.ReferenceType.FISCAL_QUARTER)
                .hour(0)
                .millisecond(0)
                .minute(0)
                .second(0)
                .build()

        val roundtrippedPublicFiscalQuarterReference =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicFiscalQuarterReference),
                jacksonTypeRef<PublicFiscalQuarterReference>(),
            )

        assertThat(roundtrippedPublicFiscalQuarterReference).isEqualTo(publicFiscalQuarterReference)
    }
}
