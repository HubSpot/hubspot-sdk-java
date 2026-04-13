// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicListConversionResponseTest {

    @Test
    fun create() {
        val publicListConversionResponse =
            PublicListConversionResponse.builder()
                .listId("listId")
                .convertedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .requestedConversionTime(
                    PublicListConversionDate.builder()
                        .conversionType(PublicListConversionDate.ConversionType.CONVERSION_DATE)
                        .day(0)
                        .month(0)
                        .year(0)
                        .build()
                )
                .build()

        assertThat(publicListConversionResponse.listId()).isEqualTo("listId")
        assertThat(publicListConversionResponse.convertedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicListConversionResponse.requestedConversionTime())
            .contains(
                PublicListConversionResponse.RequestedConversionTime.ofPublicListConversionDate(
                    PublicListConversionDate.builder()
                        .conversionType(PublicListConversionDate.ConversionType.CONVERSION_DATE)
                        .day(0)
                        .month(0)
                        .year(0)
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicListConversionResponse =
            PublicListConversionResponse.builder()
                .listId("listId")
                .convertedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .requestedConversionTime(
                    PublicListConversionDate.builder()
                        .conversionType(PublicListConversionDate.ConversionType.CONVERSION_DATE)
                        .day(0)
                        .month(0)
                        .year(0)
                        .build()
                )
                .build()

        val roundtrippedPublicListConversionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicListConversionResponse),
                jacksonTypeRef<PublicListConversionResponse>(),
            )

        assertThat(roundtrippedPublicListConversionResponse).isEqualTo(publicListConversionResponse)
    }
}
