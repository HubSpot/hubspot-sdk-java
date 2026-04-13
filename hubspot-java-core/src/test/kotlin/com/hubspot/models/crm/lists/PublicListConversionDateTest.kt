// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicListConversionDateTest {

    @Test
    fun create() {
        val publicListConversionDate =
            PublicListConversionDate.builder()
                .conversionType(PublicListConversionDate.ConversionType.CONVERSION_DATE)
                .day(0)
                .month(0)
                .year(0)
                .build()

        assertThat(publicListConversionDate.conversionType())
            .isEqualTo(PublicListConversionDate.ConversionType.CONVERSION_DATE)
        assertThat(publicListConversionDate.day()).isEqualTo(0)
        assertThat(publicListConversionDate.month()).isEqualTo(0)
        assertThat(publicListConversionDate.year()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicListConversionDate =
            PublicListConversionDate.builder()
                .conversionType(PublicListConversionDate.ConversionType.CONVERSION_DATE)
                .day(0)
                .month(0)
                .year(0)
                .build()

        val roundtrippedPublicListConversionDate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicListConversionDate),
                jacksonTypeRef<PublicListConversionDate>(),
            )

        assertThat(roundtrippedPublicListConversionDate).isEqualTo(publicListConversionDate)
    }
}
