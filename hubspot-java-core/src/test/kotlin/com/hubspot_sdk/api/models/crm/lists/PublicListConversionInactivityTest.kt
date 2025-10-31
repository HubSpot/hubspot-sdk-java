// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicListConversionInactivityTest {

    @Test
    fun create() {
        val publicListConversionInactivity =
            PublicListConversionInactivity.builder()
                .conversionType(PublicListConversionInactivity.ConversionType.INACTIVITY)
                .offset(0)
                .timeUnit(PublicListConversionInactivity.TimeUnit.DAY)
                .build()

        assertThat(publicListConversionInactivity.conversionType())
            .isEqualTo(PublicListConversionInactivity.ConversionType.INACTIVITY)
        assertThat(publicListConversionInactivity.offset()).isEqualTo(0)
        assertThat(publicListConversionInactivity.timeUnit())
            .isEqualTo(PublicListConversionInactivity.TimeUnit.DAY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicListConversionInactivity =
            PublicListConversionInactivity.builder()
                .conversionType(PublicListConversionInactivity.ConversionType.INACTIVITY)
                .offset(0)
                .timeUnit(PublicListConversionInactivity.TimeUnit.DAY)
                .build()

        val roundtrippedPublicListConversionInactivity =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicListConversionInactivity),
                jacksonTypeRef<PublicListConversionInactivity>(),
            )

        assertThat(roundtrippedPublicListConversionInactivity)
            .isEqualTo(publicListConversionInactivity)
    }
}
