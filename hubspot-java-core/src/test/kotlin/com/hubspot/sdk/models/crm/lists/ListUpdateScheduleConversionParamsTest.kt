// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListUpdateScheduleConversionParamsTest {

    @Test
    fun create() {
        ListUpdateScheduleConversionParams.builder()
            .listId("listId")
            .publicListConversionTime(
                PublicListConversionDate.builder()
                    .conversionType(PublicListConversionDate.ConversionType.CONVERSION_DATE)
                    .day(0)
                    .month(0)
                    .year(0)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ListUpdateScheduleConversionParams.builder()
                .listId("listId")
                .publicListConversionTime(
                    PublicListConversionDate.builder()
                        .conversionType(PublicListConversionDate.ConversionType.CONVERSION_DATE)
                        .day(0)
                        .month(0)
                        .year(0)
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("listId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ListUpdateScheduleConversionParams.builder()
                .listId("listId")
                .publicListConversionTime(
                    PublicListConversionDate.builder()
                        .conversionType(PublicListConversionDate.ConversionType.CONVERSION_DATE)
                        .day(0)
                        .month(0)
                        .year(0)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PublicListConversionTime.ofDate(
                    PublicListConversionDate.builder()
                        .conversionType(PublicListConversionDate.ConversionType.CONVERSION_DATE)
                        .day(0)
                        .month(0)
                        .year(0)
                        .build()
                )
            )
    }
}
